# Energy resources state streaming


## Compile and package

```bash
$ mvn clean package
``` 

## Start Kafka and Zookeeper

```bash
$ docker-compose -f docker-compose-kafka.yml up
``` 

## Start postgres db

```bash
$ docker run --name postgres -e POSTGRES_PASSWORD=secret -p 5432:5432 -d postgres:12.2
``` 

### Read schema info

```bash
$ sql="SELECT schema_name FROM information_schema.schemata" && \
    docker exec -it postgres psql -U postgres -c "${sql}"
``` 

### Create devices table

```bash
$ sql="CREATE TABLE devices (uuid varchar, state boolean)" && \
    docker exec -it postgres psql -U postgres -c "${sql}"
``` 

### Show tables

```bash
$ docker exec -it postgres psql -U postgres -c '\dt'
``` 

## Read record count from device table

```bash
$ sql="SELECT count(*) FROM devices" && \
  docker exec -it postgres psql -U postgres -c "${sql}"
```

## Start Api Server

```bash
$ java -jar target/energy-kafka-1.0-SNAPSHOT.jar server src/main/resources/api-server.yml
```

## Start event generator

```bash
$ java -jar target/event-generators-1.2-SNAPSHOT-jar-with-dependencies.jar events --target http://localhost:8080/api/send
```

## Start stream processor

```bash
$ java -cp target/energy-kafka-1.0-SNAPSHOT.jar com.energy.stream.DeviceStateStream stream src/main/resources/stream.yml
```

## Stop postgres DB

```bash
$ docker stop postgres && docker rm postgres
```

## Remove all containers

```bash
$ docker rm $(docker ps -aq)
```