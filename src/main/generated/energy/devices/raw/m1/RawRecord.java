/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package energy.devices.raw.m1;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class RawRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7123316862420836018L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RawRecord\",\"namespace\":\"energy.devices.raw.m1\",\"fields\":[{\"name\":\"uuid\",\"type\":\"string\"},{\"name\":\"arrival_time_ms\",\"type\":[\"long\",\"null\"]},{\"name\":\"body\",\"type\":[\"bytes\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence uuid;
  @Deprecated public java.lang.Long arrival_time_ms;
  @Deprecated public java.nio.ByteBuffer body;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public RawRecord() {}

  /**
   * All-args constructor.
   */
  public RawRecord(java.lang.CharSequence uuid, java.lang.Long arrival_time_ms, java.nio.ByteBuffer body) {
    this.uuid = uuid;
    this.arrival_time_ms = arrival_time_ms;
    this.body = body;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uuid;
    case 1: return arrival_time_ms;
    case 2: return body;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uuid = (java.lang.CharSequence)value$; break;
    case 1: arrival_time_ms = (java.lang.Long)value$; break;
    case 2: body = (java.nio.ByteBuffer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'uuid' field.
   */
  public java.lang.CharSequence getUuid() {
    return uuid;
  }

  /**
   * Sets the value of the 'uuid' field.
   * @param value the value to set.
   */
  public void setUuid(java.lang.CharSequence value) {
    this.uuid = value;
  }

  /**
   * Gets the value of the 'arrival_time_ms' field.
   */
  public java.lang.Long getArrivalTimeMs() {
    return arrival_time_ms;
  }

  /**
   * Sets the value of the 'arrival_time_ms' field.
   * @param value the value to set.
   */
  public void setArrivalTimeMs(java.lang.Long value) {
    this.arrival_time_ms = value;
  }

  /**
   * Gets the value of the 'body' field.
   */
  public java.nio.ByteBuffer getBody() {
    return body;
  }

  /**
   * Sets the value of the 'body' field.
   * @param value the value to set.
   */
  public void setBody(java.nio.ByteBuffer value) {
    this.body = value;
  }

  /**
   * Creates a new RawRecord RecordBuilder.
   * @return A new RawRecord RecordBuilder
   */
  public static energy.devices.raw.m1.RawRecord.Builder newBuilder() {
    return new energy.devices.raw.m1.RawRecord.Builder();
  }
  
  /**
   * Creates a new RawRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new RawRecord RecordBuilder
   */
  public static energy.devices.raw.m1.RawRecord.Builder newBuilder(energy.devices.raw.m1.RawRecord.Builder other) {
    return new energy.devices.raw.m1.RawRecord.Builder(other);
  }
  
  /**
   * Creates a new RawRecord RecordBuilder by copying an existing RawRecord instance.
   * @param other The existing instance to copy.
   * @return A new RawRecord RecordBuilder
   */
  public static energy.devices.raw.m1.RawRecord.Builder newBuilder(energy.devices.raw.m1.RawRecord other) {
    return new energy.devices.raw.m1.RawRecord.Builder(other);
  }
  
  /**
   * RecordBuilder for RawRecord instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RawRecord>
    implements org.apache.avro.data.RecordBuilder<RawRecord> {

    private java.lang.CharSequence uuid;
    private java.lang.Long arrival_time_ms;
    private java.nio.ByteBuffer body;

    /** Creates a new Builder */
    private Builder() {
      super(energy.devices.raw.m1.RawRecord.SCHEMA$);
    }
    
    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(energy.devices.raw.m1.RawRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.arrival_time_ms)) {
        this.arrival_time_ms = data().deepCopy(fields()[1].schema(), other.arrival_time_ms);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.body)) {
        this.body = data().deepCopy(fields()[2].schema(), other.body);
        fieldSetFlags()[2] = true;
      }
    }
    
    /**
     * Creates a Builder by copying an existing RawRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(energy.devices.raw.m1.RawRecord other) {
            super(energy.devices.raw.m1.RawRecord.SCHEMA$);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.arrival_time_ms)) {
        this.arrival_time_ms = data().deepCopy(fields()[1].schema(), other.arrival_time_ms);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.body)) {
        this.body = data().deepCopy(fields()[2].schema(), other.body);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'uuid' field.
      * @return The value.
      */
    public java.lang.CharSequence getUuid() {
      return uuid;
    }

    /**
      * Sets the value of the 'uuid' field.
      * @param value The value of 'uuid'.
      * @return This builder.
      */
    public energy.devices.raw.m1.RawRecord.Builder setUuid(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.uuid = value;
      fieldSetFlags()[0] = true;
      return this; 
    }

    /**
      * Checks whether the 'uuid' field has been set.
      * @return True if the 'uuid' field has been set, false otherwise.
      */
    public boolean hasUuid() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'uuid' field.
      * @return This builder.
      */
    public energy.devices.raw.m1.RawRecord.Builder clearUuid() {
      uuid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'arrival_time_ms' field.
      * @return The value.
      */
    public java.lang.Long getArrivalTimeMs() {
      return arrival_time_ms;
    }

    /**
      * Sets the value of the 'arrival_time_ms' field.
      * @param value The value of 'arrival_time_ms'.
      * @return This builder.
      */
    public energy.devices.raw.m1.RawRecord.Builder setArrivalTimeMs(java.lang.Long value) {
      validate(fields()[1], value);
      this.arrival_time_ms = value;
      fieldSetFlags()[1] = true;
      return this; 
    }

    /**
      * Checks whether the 'arrival_time_ms' field has been set.
      * @return True if the 'arrival_time_ms' field has been set, false otherwise.
      */
    public boolean hasArrivalTimeMs() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'arrival_time_ms' field.
      * @return This builder.
      */
    public energy.devices.raw.m1.RawRecord.Builder clearArrivalTimeMs() {
      arrival_time_ms = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'body' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getBody() {
      return body;
    }

    /**
      * Sets the value of the 'body' field.
      * @param value The value of 'body'.
      * @return This builder.
      */
    public energy.devices.raw.m1.RawRecord.Builder setBody(java.nio.ByteBuffer value) {
      validate(fields()[2], value);
      this.body = value;
      fieldSetFlags()[2] = true;
      return this; 
    }

    /**
      * Checks whether the 'body' field has been set.
      * @return True if the 'body' field has been set, false otherwise.
      */
    public boolean hasBody() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'body' field.
      * @return This builder.
      */
    public energy.devices.raw.m1.RawRecord.Builder clearBody() {
      body = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public RawRecord build() {
      try {
        RawRecord record = new RawRecord();
        record.uuid = fieldSetFlags()[0] ? this.uuid : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.arrival_time_ms = fieldSetFlags()[1] ? this.arrival_time_ms : (java.lang.Long) defaultValue(fields()[1]);
        record.body = fieldSetFlags()[2] ? this.body : (java.nio.ByteBuffer) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);  

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, org.apache.avro.specific.SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);  

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, org.apache.avro.specific.SpecificData.getDecoder(in));
  }

}