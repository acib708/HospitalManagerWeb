package thrift; /**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnalisisClinico implements org.apache.thrift.TBase<AnalisisClinico, AnalisisClinico._Fields>, java.io.Serializable, Cloneable, Comparable<AnalisisClinico> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("thrift.AnalisisClinico");

  private static final org.apache.thrift.protocol.TField CLAVE_FIELD_DESC = new org.apache.thrift.protocol.TField("clave", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TIPO_FIELD_DESC = new org.apache.thrift.protocol.TField("tipo", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DESCRIPCION_FIELD_DESC = new org.apache.thrift.protocol.TField("descripcion", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AnalisisClinicoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AnalisisClinicoTupleSchemeFactory());
  }

  public String clave; // required
  public String tipo; // required
  public String descripcion; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CLAVE((short)1, "clave"),
    TIPO((short)2, "tipo"),
    DESCRIPCION((short)3, "descripcion");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CLAVE
          return CLAVE;
        case 2: // TIPO
          return TIPO;
        case 3: // DESCRIPCION
          return DESCRIPCION;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CLAVE, new org.apache.thrift.meta_data.FieldMetaData("clave", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TIPO, new org.apache.thrift.meta_data.FieldMetaData("tipo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DESCRIPCION, new org.apache.thrift.meta_data.FieldMetaData("descripcion", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AnalisisClinico.class, metaDataMap);
  }

  public AnalisisClinico() {
  }

  public AnalisisClinico(
    String clave,
    String tipo,
    String descripcion)
  {
    this();
    this.clave = clave;
    this.tipo = tipo;
    this.descripcion = descripcion;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AnalisisClinico(AnalisisClinico other) {
    if (other.isSetClave()) {
      this.clave = other.clave;
    }
    if (other.isSetTipo()) {
      this.tipo = other.tipo;
    }
    if (other.isSetDescripcion()) {
      this.descripcion = other.descripcion;
    }
  }

  public AnalisisClinico deepCopy() {
    return new AnalisisClinico(this);
  }

  @Override
  public void clear() {
    this.clave = null;
    this.tipo = null;
    this.descripcion = null;
  }

  public String getClave() {
    return this.clave;
  }

  public AnalisisClinico setClave(String clave) {
    this.clave = clave;
    return this;
  }

  public void unsetClave() {
    this.clave = null;
  }

  /** Returns true if field clave is set (has been assigned a value) and false otherwise */
  public boolean isSetClave() {
    return this.clave != null;
  }

  public void setClaveIsSet(boolean value) {
    if (!value) {
      this.clave = null;
    }
  }

  public String getTipo() {
    return this.tipo;
  }

  public AnalisisClinico setTipo(String tipo) {
    this.tipo = tipo;
    return this;
  }

  public void unsetTipo() {
    this.tipo = null;
  }

  /** Returns true if field tipo is set (has been assigned a value) and false otherwise */
  public boolean isSetTipo() {
    return this.tipo != null;
  }

  public void setTipoIsSet(boolean value) {
    if (!value) {
      this.tipo = null;
    }
  }

  public String getDescripcion() {
    return this.descripcion;
  }

  public AnalisisClinico setDescripcion(String descripcion) {
    this.descripcion = descripcion;
    return this;
  }

  public void unsetDescripcion() {
    this.descripcion = null;
  }

  /** Returns true if field descripcion is set (has been assigned a value) and false otherwise */
  public boolean isSetDescripcion() {
    return this.descripcion != null;
  }

  public void setDescripcionIsSet(boolean value) {
    if (!value) {
      this.descripcion = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CLAVE:
      if (value == null) {
        unsetClave();
      } else {
        setClave((String)value);
      }
      break;

    case TIPO:
      if (value == null) {
        unsetTipo();
      } else {
        setTipo((String)value);
      }
      break;

    case DESCRIPCION:
      if (value == null) {
        unsetDescripcion();
      } else {
        setDescripcion((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CLAVE:
      return getClave();

    case TIPO:
      return getTipo();

    case DESCRIPCION:
      return getDescripcion();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CLAVE:
      return isSetClave();
    case TIPO:
      return isSetTipo();
    case DESCRIPCION:
      return isSetDescripcion();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AnalisisClinico)
      return this.equals((AnalisisClinico)that);
    return false;
  }

  public boolean equals(AnalisisClinico that) {
    if (that == null)
      return false;

    boolean this_present_clave = true && this.isSetClave();
    boolean that_present_clave = true && that.isSetClave();
    if (this_present_clave || that_present_clave) {
      if (!(this_present_clave && that_present_clave))
        return false;
      if (!this.clave.equals(that.clave))
        return false;
    }

    boolean this_present_tipo = true && this.isSetTipo();
    boolean that_present_tipo = true && that.isSetTipo();
    if (this_present_tipo || that_present_tipo) {
      if (!(this_present_tipo && that_present_tipo))
        return false;
      if (!this.tipo.equals(that.tipo))
        return false;
    }

    boolean this_present_descripcion = true && this.isSetDescripcion();
    boolean that_present_descripcion = true && that.isSetDescripcion();
    if (this_present_descripcion || that_present_descripcion) {
      if (!(this_present_descripcion && that_present_descripcion))
        return false;
      if (!this.descripcion.equals(that.descripcion))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(AnalisisClinico other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetClave()).compareTo(other.isSetClave());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClave()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.clave, other.clave);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTipo()).compareTo(other.isSetTipo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTipo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tipo, other.tipo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDescripcion()).compareTo(other.isSetDescripcion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescripcion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.descripcion, other.descripcion);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("thrift.AnalisisClinico(");
    boolean first = true;

    sb.append("clave:");
    if (this.clave == null) {
      sb.append("null");
    } else {
      sb.append(this.clave);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tipo:");
    if (this.tipo == null) {
      sb.append("null");
    } else {
      sb.append(this.tipo);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("descripcion:");
    if (this.descripcion == null) {
      sb.append("null");
    } else {
      sb.append(this.descripcion);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AnalisisClinicoStandardSchemeFactory implements SchemeFactory {
    public AnalisisClinicoStandardScheme getScheme() {
      return new AnalisisClinicoStandardScheme();
    }
  }

  private static class AnalisisClinicoStandardScheme extends StandardScheme<AnalisisClinico> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AnalisisClinico struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CLAVE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.clave = iprot.readString();
              struct.setClaveIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TIPO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tipo = iprot.readString();
              struct.setTipoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DESCRIPCION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.descripcion = iprot.readString();
              struct.setDescripcionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, AnalisisClinico struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.clave != null) {
        oprot.writeFieldBegin(CLAVE_FIELD_DESC);
        oprot.writeString(struct.clave);
        oprot.writeFieldEnd();
      }
      if (struct.tipo != null) {
        oprot.writeFieldBegin(TIPO_FIELD_DESC);
        oprot.writeString(struct.tipo);
        oprot.writeFieldEnd();
      }
      if (struct.descripcion != null) {
        oprot.writeFieldBegin(DESCRIPCION_FIELD_DESC);
        oprot.writeString(struct.descripcion);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AnalisisClinicoTupleSchemeFactory implements SchemeFactory {
    public AnalisisClinicoTupleScheme getScheme() {
      return new AnalisisClinicoTupleScheme();
    }
  }

  private static class AnalisisClinicoTupleScheme extends TupleScheme<AnalisisClinico> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AnalisisClinico struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetClave()) {
        optionals.set(0);
      }
      if (struct.isSetTipo()) {
        optionals.set(1);
      }
      if (struct.isSetDescripcion()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetClave()) {
        oprot.writeString(struct.clave);
      }
      if (struct.isSetTipo()) {
        oprot.writeString(struct.tipo);
      }
      if (struct.isSetDescripcion()) {
        oprot.writeString(struct.descripcion);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AnalisisClinico struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.clave = iprot.readString();
        struct.setClaveIsSet(true);
      }
      if (incoming.get(1)) {
        struct.tipo = iprot.readString();
        struct.setTipoIsSet(true);
      }
      if (incoming.get(2)) {
        struct.descripcion = iprot.readString();
        struct.setDescripcionIsSet(true);
      }
    }
  }

}
