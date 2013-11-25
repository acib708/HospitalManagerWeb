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

public class SeRealiza implements org.apache.thrift.TBase<SeRealiza, SeRealiza._Fields>, java.io.Serializable, Cloneable, Comparable<SeRealiza> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SeRealiza");

  private static final org.apache.thrift.protocol.TField CLAVE_ANALISIS_FIELD_DESC = new org.apache.thrift.protocol.TField("claveAnalisis", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CLAVE_PACIENTE_FIELD_DESC = new org.apache.thrift.protocol.TField("clavePaciente", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField FECHA_APLIC_FIELD_DESC = new org.apache.thrift.protocol.TField("fechaAplic", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField FECHA_ENTREGA_FIELD_DESC = new org.apache.thrift.protocol.TField("fechaEntrega", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField FOTO_PACIENTE_FIELD_DESC = new org.apache.thrift.protocol.TField("fotoPaciente", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SeRealizaStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SeRealizaTupleSchemeFactory());
  }

  public String claveAnalisis; // required
  public String clavePaciente; // required
  public String fechaAplic; // required
  public String fechaEntrega; // required
  public String fotoPaciente; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CLAVE_ANALISIS((short)1, "claveAnalisis"),
    CLAVE_PACIENTE((short)2, "clavePaciente"),
    FECHA_APLIC((short)3, "fechaAplic"),
    FECHA_ENTREGA((short)4, "fechaEntrega"),
    FOTO_PACIENTE((short)5, "fotoPaciente");

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
        case 1: // CLAVE_ANALISIS
          return CLAVE_ANALISIS;
        case 2: // CLAVE_PACIENTE
          return CLAVE_PACIENTE;
        case 3: // FECHA_APLIC
          return FECHA_APLIC;
        case 4: // FECHA_ENTREGA
          return FECHA_ENTREGA;
        case 5: // FOTO_PACIENTE
          return FOTO_PACIENTE;
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
    tmpMap.put(_Fields.CLAVE_ANALISIS, new org.apache.thrift.meta_data.FieldMetaData("claveAnalisis", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CLAVE_PACIENTE, new org.apache.thrift.meta_data.FieldMetaData("clavePaciente", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FECHA_APLIC, new org.apache.thrift.meta_data.FieldMetaData("fechaAplic", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FECHA_ENTREGA, new org.apache.thrift.meta_data.FieldMetaData("fechaEntrega", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FOTO_PACIENTE, new org.apache.thrift.meta_data.FieldMetaData("fotoPaciente", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SeRealiza.class, metaDataMap);
  }

  public SeRealiza() {
  }

  public SeRealiza(
    String claveAnalisis,
    String clavePaciente,
    String fechaAplic,
    String fechaEntrega,
    String fotoPaciente)
  {
    this();
    this.claveAnalisis = claveAnalisis;
    this.clavePaciente = clavePaciente;
    this.fechaAplic = fechaAplic;
    this.fechaEntrega = fechaEntrega;
    this.fotoPaciente = fotoPaciente;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SeRealiza(SeRealiza other) {
    if (other.isSetClaveAnalisis()) {
      this.claveAnalisis = other.claveAnalisis;
    }
    if (other.isSetClavePaciente()) {
      this.clavePaciente = other.clavePaciente;
    }
    if (other.isSetFechaAplic()) {
      this.fechaAplic = other.fechaAplic;
    }
    if (other.isSetFechaEntrega()) {
      this.fechaEntrega = other.fechaEntrega;
    }
    if (other.isSetFotoPaciente()) {
      this.fotoPaciente = other.fotoPaciente;
    }
  }

  public SeRealiza deepCopy() {
    return new SeRealiza(this);
  }

  @Override
  public void clear() {
    this.claveAnalisis = null;
    this.clavePaciente = null;
    this.fechaAplic = null;
    this.fechaEntrega = null;
    this.fotoPaciente = null;
  }

  public String getClaveAnalisis() {
    return this.claveAnalisis;
  }

  public SeRealiza setClaveAnalisis(String claveAnalisis) {
    this.claveAnalisis = claveAnalisis;
    return this;
  }

  public void unsetClaveAnalisis() {
    this.claveAnalisis = null;
  }

  /** Returns true if field claveAnalisis is set (has been assigned a value) and false otherwise */
  public boolean isSetClaveAnalisis() {
    return this.claveAnalisis != null;
  }

  public void setClaveAnalisisIsSet(boolean value) {
    if (!value) {
      this.claveAnalisis = null;
    }
  }

  public String getClavePaciente() {
    return this.clavePaciente;
  }

  public SeRealiza setClavePaciente(String clavePaciente) {
    this.clavePaciente = clavePaciente;
    return this;
  }

  public void unsetClavePaciente() {
    this.clavePaciente = null;
  }

  /** Returns true if field clavePaciente is set (has been assigned a value) and false otherwise */
  public boolean isSetClavePaciente() {
    return this.clavePaciente != null;
  }

  public void setClavePacienteIsSet(boolean value) {
    if (!value) {
      this.clavePaciente = null;
    }
  }

  public String getFechaAplic() {
    return this.fechaAplic;
  }

  public SeRealiza setFechaAplic(String fechaAplic) {
    this.fechaAplic = fechaAplic;
    return this;
  }

  public void unsetFechaAplic() {
    this.fechaAplic = null;
  }

  /** Returns true if field fechaAplic is set (has been assigned a value) and false otherwise */
  public boolean isSetFechaAplic() {
    return this.fechaAplic != null;
  }

  public void setFechaAplicIsSet(boolean value) {
    if (!value) {
      this.fechaAplic = null;
    }
  }

  public String getFechaEntrega() {
    return this.fechaEntrega;
  }

  public SeRealiza setFechaEntrega(String fechaEntrega) {
    this.fechaEntrega = fechaEntrega;
    return this;
  }

  public void unsetFechaEntrega() {
    this.fechaEntrega = null;
  }

  /** Returns true if field fechaEntrega is set (has been assigned a value) and false otherwise */
  public boolean isSetFechaEntrega() {
    return this.fechaEntrega != null;
  }

  public void setFechaEntregaIsSet(boolean value) {
    if (!value) {
      this.fechaEntrega = null;
    }
  }

  public String getFotoPaciente() {
    return this.fotoPaciente;
  }

  public SeRealiza setFotoPaciente(String fotoPaciente) {
    this.fotoPaciente = fotoPaciente;
    return this;
  }

  public void unsetFotoPaciente() {
    this.fotoPaciente = null;
  }

  /** Returns true if field fotoPaciente is set (has been assigned a value) and false otherwise */
  public boolean isSetFotoPaciente() {
    return this.fotoPaciente != null;
  }

  public void setFotoPacienteIsSet(boolean value) {
    if (!value) {
      this.fotoPaciente = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CLAVE_ANALISIS:
      if (value == null) {
        unsetClaveAnalisis();
      } else {
        setClaveAnalisis((String)value);
      }
      break;

    case CLAVE_PACIENTE:
      if (value == null) {
        unsetClavePaciente();
      } else {
        setClavePaciente((String)value);
      }
      break;

    case FECHA_APLIC:
      if (value == null) {
        unsetFechaAplic();
      } else {
        setFechaAplic((String)value);
      }
      break;

    case FECHA_ENTREGA:
      if (value == null) {
        unsetFechaEntrega();
      } else {
        setFechaEntrega((String)value);
      }
      break;

    case FOTO_PACIENTE:
      if (value == null) {
        unsetFotoPaciente();
      } else {
        setFotoPaciente((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CLAVE_ANALISIS:
      return getClaveAnalisis();

    case CLAVE_PACIENTE:
      return getClavePaciente();

    case FECHA_APLIC:
      return getFechaAplic();

    case FECHA_ENTREGA:
      return getFechaEntrega();

    case FOTO_PACIENTE:
      return getFotoPaciente();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CLAVE_ANALISIS:
      return isSetClaveAnalisis();
    case CLAVE_PACIENTE:
      return isSetClavePaciente();
    case FECHA_APLIC:
      return isSetFechaAplic();
    case FECHA_ENTREGA:
      return isSetFechaEntrega();
    case FOTO_PACIENTE:
      return isSetFotoPaciente();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SeRealiza)
      return this.equals((SeRealiza)that);
    return false;
  }

  public boolean equals(SeRealiza that) {
    if (that == null)
      return false;

    boolean this_present_claveAnalisis = true && this.isSetClaveAnalisis();
    boolean that_present_claveAnalisis = true && that.isSetClaveAnalisis();
    if (this_present_claveAnalisis || that_present_claveAnalisis) {
      if (!(this_present_claveAnalisis && that_present_claveAnalisis))
        return false;
      if (!this.claveAnalisis.equals(that.claveAnalisis))
        return false;
    }

    boolean this_present_clavePaciente = true && this.isSetClavePaciente();
    boolean that_present_clavePaciente = true && that.isSetClavePaciente();
    if (this_present_clavePaciente || that_present_clavePaciente) {
      if (!(this_present_clavePaciente && that_present_clavePaciente))
        return false;
      if (!this.clavePaciente.equals(that.clavePaciente))
        return false;
    }

    boolean this_present_fechaAplic = true && this.isSetFechaAplic();
    boolean that_present_fechaAplic = true && that.isSetFechaAplic();
    if (this_present_fechaAplic || that_present_fechaAplic) {
      if (!(this_present_fechaAplic && that_present_fechaAplic))
        return false;
      if (!this.fechaAplic.equals(that.fechaAplic))
        return false;
    }

    boolean this_present_fechaEntrega = true && this.isSetFechaEntrega();
    boolean that_present_fechaEntrega = true && that.isSetFechaEntrega();
    if (this_present_fechaEntrega || that_present_fechaEntrega) {
      if (!(this_present_fechaEntrega && that_present_fechaEntrega))
        return false;
      if (!this.fechaEntrega.equals(that.fechaEntrega))
        return false;
    }

    boolean this_present_fotoPaciente = true && this.isSetFotoPaciente();
    boolean that_present_fotoPaciente = true && that.isSetFotoPaciente();
    if (this_present_fotoPaciente || that_present_fotoPaciente) {
      if (!(this_present_fotoPaciente && that_present_fotoPaciente))
        return false;
      if (!this.fotoPaciente.equals(that.fotoPaciente))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(SeRealiza other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetClaveAnalisis()).compareTo(other.isSetClaveAnalisis());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClaveAnalisis()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.claveAnalisis, other.claveAnalisis);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClavePaciente()).compareTo(other.isSetClavePaciente());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClavePaciente()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.clavePaciente, other.clavePaciente);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFechaAplic()).compareTo(other.isSetFechaAplic());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFechaAplic()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fechaAplic, other.fechaAplic);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFechaEntrega()).compareTo(other.isSetFechaEntrega());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFechaEntrega()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fechaEntrega, other.fechaEntrega);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFotoPaciente()).compareTo(other.isSetFotoPaciente());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFotoPaciente()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fotoPaciente, other.fotoPaciente);
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
    StringBuilder sb = new StringBuilder("SeRealiza(");
    boolean first = true;

    sb.append("claveAnalisis:");
    if (this.claveAnalisis == null) {
      sb.append("null");
    } else {
      sb.append(this.claveAnalisis);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("clavePaciente:");
    if (this.clavePaciente == null) {
      sb.append("null");
    } else {
      sb.append(this.clavePaciente);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("fechaAplic:");
    if (this.fechaAplic == null) {
      sb.append("null");
    } else {
      sb.append(this.fechaAplic);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("fechaEntrega:");
    if (this.fechaEntrega == null) {
      sb.append("null");
    } else {
      sb.append(this.fechaEntrega);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("fotoPaciente:");
    if (this.fotoPaciente == null) {
      sb.append("null");
    } else {
      sb.append(this.fotoPaciente);
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

  private static class SeRealizaStandardSchemeFactory implements SchemeFactory {
    public SeRealizaStandardScheme getScheme() {
      return new SeRealizaStandardScheme();
    }
  }

  private static class SeRealizaStandardScheme extends StandardScheme<SeRealiza> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SeRealiza struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CLAVE_ANALISIS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.claveAnalisis = iprot.readString();
              struct.setClaveAnalisisIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CLAVE_PACIENTE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.clavePaciente = iprot.readString();
              struct.setClavePacienteIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FECHA_APLIC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.fechaAplic = iprot.readString();
              struct.setFechaAplicIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // FECHA_ENTREGA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.fechaEntrega = iprot.readString();
              struct.setFechaEntregaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // FOTO_PACIENTE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.fotoPaciente = iprot.readString();
              struct.setFotoPacienteIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SeRealiza struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.claveAnalisis != null) {
        oprot.writeFieldBegin(CLAVE_ANALISIS_FIELD_DESC);
        oprot.writeString(struct.claveAnalisis);
        oprot.writeFieldEnd();
      }
      if (struct.clavePaciente != null) {
        oprot.writeFieldBegin(CLAVE_PACIENTE_FIELD_DESC);
        oprot.writeString(struct.clavePaciente);
        oprot.writeFieldEnd();
      }
      if (struct.fechaAplic != null) {
        oprot.writeFieldBegin(FECHA_APLIC_FIELD_DESC);
        oprot.writeString(struct.fechaAplic);
        oprot.writeFieldEnd();
      }
      if (struct.fechaEntrega != null) {
        oprot.writeFieldBegin(FECHA_ENTREGA_FIELD_DESC);
        oprot.writeString(struct.fechaEntrega);
        oprot.writeFieldEnd();
      }
      if (struct.fotoPaciente != null) {
        oprot.writeFieldBegin(FOTO_PACIENTE_FIELD_DESC);
        oprot.writeString(struct.fotoPaciente);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SeRealizaTupleSchemeFactory implements SchemeFactory {
    public SeRealizaTupleScheme getScheme() {
      return new SeRealizaTupleScheme();
    }
  }

  private static class SeRealizaTupleScheme extends TupleScheme<SeRealiza> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SeRealiza struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetClaveAnalisis()) {
        optionals.set(0);
      }
      if (struct.isSetClavePaciente()) {
        optionals.set(1);
      }
      if (struct.isSetFechaAplic()) {
        optionals.set(2);
      }
      if (struct.isSetFechaEntrega()) {
        optionals.set(3);
      }
      if (struct.isSetFotoPaciente()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetClaveAnalisis()) {
        oprot.writeString(struct.claveAnalisis);
      }
      if (struct.isSetClavePaciente()) {
        oprot.writeString(struct.clavePaciente);
      }
      if (struct.isSetFechaAplic()) {
        oprot.writeString(struct.fechaAplic);
      }
      if (struct.isSetFechaEntrega()) {
        oprot.writeString(struct.fechaEntrega);
      }
      if (struct.isSetFotoPaciente()) {
        oprot.writeString(struct.fotoPaciente);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SeRealiza struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.claveAnalisis = iprot.readString();
        struct.setClaveAnalisisIsSet(true);
      }
      if (incoming.get(1)) {
        struct.clavePaciente = iprot.readString();
        struct.setClavePacienteIsSet(true);
      }
      if (incoming.get(2)) {
        struct.fechaAplic = iprot.readString();
        struct.setFechaAplicIsSet(true);
      }
      if (incoming.get(3)) {
        struct.fechaEntrega = iprot.readString();
        struct.setFechaEntregaIsSet(true);
      }
      if (incoming.get(4)) {
        struct.fotoPaciente = iprot.readString();
        struct.setFotoPacienteIsSet(true);
      }
    }
  }

}

