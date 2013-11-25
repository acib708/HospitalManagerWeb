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

public class Atiende implements org.apache.thrift.TBase<Atiende, Atiende._Fields>, java.io.Serializable, Cloneable, Comparable<Atiende> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Atiende");

  private static final org.apache.thrift.protocol.TField CLAVE_DOCTOR_FIELD_DESC = new org.apache.thrift.protocol.TField("claveDoctor", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CLAVE_PACIENTE_FIELD_DESC = new org.apache.thrift.protocol.TField("clavePaciente", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField FECHA_FIELD_DESC = new org.apache.thrift.protocol.TField("fecha", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TRATAMIENTO_FIELD_DESC = new org.apache.thrift.protocol.TField("tratamiento", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField DIAGNOSTICO_FIELD_DESC = new org.apache.thrift.protocol.TField("diagnostico", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField FOTO_DOCTOR_FIELD_DESC = new org.apache.thrift.protocol.TField("fotoDoctor", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField FOTO_PACIENTE_FIELD_DESC = new org.apache.thrift.protocol.TField("fotoPaciente", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AtiendeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AtiendeTupleSchemeFactory());
  }

  public String claveDoctor; // required
  public String clavePaciente; // required
  public String fecha; // required
  public String tratamiento; // required
  public String diagnostico; // required
  public String fotoDoctor; // required
  public String fotoPaciente; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CLAVE_DOCTOR((short)1, "claveDoctor"),
    CLAVE_PACIENTE((short)2, "clavePaciente"),
    FECHA((short)3, "fecha"),
    TRATAMIENTO((short)4, "tratamiento"),
    DIAGNOSTICO((short)5, "diagnostico"),
    FOTO_DOCTOR((short)6, "fotoDoctor"),
    FOTO_PACIENTE((short)7, "fotoPaciente");

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
        case 1: // CLAVE_DOCTOR
          return CLAVE_DOCTOR;
        case 2: // CLAVE_PACIENTE
          return CLAVE_PACIENTE;
        case 3: // FECHA
          return FECHA;
        case 4: // TRATAMIENTO
          return TRATAMIENTO;
        case 5: // DIAGNOSTICO
          return DIAGNOSTICO;
        case 6: // FOTO_DOCTOR
          return FOTO_DOCTOR;
        case 7: // FOTO_PACIENTE
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
    tmpMap.put(_Fields.CLAVE_DOCTOR, new org.apache.thrift.meta_data.FieldMetaData("claveDoctor", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CLAVE_PACIENTE, new org.apache.thrift.meta_data.FieldMetaData("clavePaciente", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FECHA, new org.apache.thrift.meta_data.FieldMetaData("fecha", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TRATAMIENTO, new org.apache.thrift.meta_data.FieldMetaData("tratamiento", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DIAGNOSTICO, new org.apache.thrift.meta_data.FieldMetaData("diagnostico", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FOTO_DOCTOR, new org.apache.thrift.meta_data.FieldMetaData("fotoDoctor", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FOTO_PACIENTE, new org.apache.thrift.meta_data.FieldMetaData("fotoPaciente", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Atiende.class, metaDataMap);
  }

  public Atiende() {
  }

  public Atiende(
    String claveDoctor,
    String clavePaciente,
    String fecha,
    String tratamiento,
    String diagnostico,
    String fotoDoctor,
    String fotoPaciente)
  {
    this();
    this.claveDoctor = claveDoctor;
    this.clavePaciente = clavePaciente;
    this.fecha = fecha;
    this.tratamiento = tratamiento;
    this.diagnostico = diagnostico;
    this.fotoDoctor = fotoDoctor;
    this.fotoPaciente = fotoPaciente;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Atiende(Atiende other) {
    if (other.isSetClaveDoctor()) {
      this.claveDoctor = other.claveDoctor;
    }
    if (other.isSetClavePaciente()) {
      this.clavePaciente = other.clavePaciente;
    }
    if (other.isSetFecha()) {
      this.fecha = other.fecha;
    }
    if (other.isSetTratamiento()) {
      this.tratamiento = other.tratamiento;
    }
    if (other.isSetDiagnostico()) {
      this.diagnostico = other.diagnostico;
    }
    if (other.isSetFotoDoctor()) {
      this.fotoDoctor = other.fotoDoctor;
    }
    if (other.isSetFotoPaciente()) {
      this.fotoPaciente = other.fotoPaciente;
    }
  }

  public Atiende deepCopy() {
    return new Atiende(this);
  }

  @Override
  public void clear() {
    this.claveDoctor = null;
    this.clavePaciente = null;
    this.fecha = null;
    this.tratamiento = null;
    this.diagnostico = null;
    this.fotoDoctor = null;
    this.fotoPaciente = null;
  }

  public String getClaveDoctor() {
    return this.claveDoctor;
  }

  public Atiende setClaveDoctor(String claveDoctor) {
    this.claveDoctor = claveDoctor;
    return this;
  }

  public void unsetClaveDoctor() {
    this.claveDoctor = null;
  }

  /** Returns true if field claveDoctor is set (has been assigned a value) and false otherwise */
  public boolean isSetClaveDoctor() {
    return this.claveDoctor != null;
  }

  public void setClaveDoctorIsSet(boolean value) {
    if (!value) {
      this.claveDoctor = null;
    }
  }

  public String getClavePaciente() {
    return this.clavePaciente;
  }

  public Atiende setClavePaciente(String clavePaciente) {
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

  public String getFecha() {
    return this.fecha;
  }

  public Atiende setFecha(String fecha) {
    this.fecha = fecha;
    return this;
  }

  public void unsetFecha() {
    this.fecha = null;
  }

  /** Returns true if field fecha is set (has been assigned a value) and false otherwise */
  public boolean isSetFecha() {
    return this.fecha != null;
  }

  public void setFechaIsSet(boolean value) {
    if (!value) {
      this.fecha = null;
    }
  }

  public String getTratamiento() {
    return this.tratamiento;
  }

  public Atiende setTratamiento(String tratamiento) {
    this.tratamiento = tratamiento;
    return this;
  }

  public void unsetTratamiento() {
    this.tratamiento = null;
  }

  /** Returns true if field tratamiento is set (has been assigned a value) and false otherwise */
  public boolean isSetTratamiento() {
    return this.tratamiento != null;
  }

  public void setTratamientoIsSet(boolean value) {
    if (!value) {
      this.tratamiento = null;
    }
  }

  public String getDiagnostico() {
    return this.diagnostico;
  }

  public Atiende setDiagnostico(String diagnostico) {
    this.diagnostico = diagnostico;
    return this;
  }

  public void unsetDiagnostico() {
    this.diagnostico = null;
  }

  /** Returns true if field diagnostico is set (has been assigned a value) and false otherwise */
  public boolean isSetDiagnostico() {
    return this.diagnostico != null;
  }

  public void setDiagnosticoIsSet(boolean value) {
    if (!value) {
      this.diagnostico = null;
    }
  }

  public String getFotoDoctor() {
    return this.fotoDoctor;
  }

  public Atiende setFotoDoctor(String fotoDoctor) {
    this.fotoDoctor = fotoDoctor;
    return this;
  }

  public void unsetFotoDoctor() {
    this.fotoDoctor = null;
  }

  /** Returns true if field fotoDoctor is set (has been assigned a value) and false otherwise */
  public boolean isSetFotoDoctor() {
    return this.fotoDoctor != null;
  }

  public void setFotoDoctorIsSet(boolean value) {
    if (!value) {
      this.fotoDoctor = null;
    }
  }

  public String getFotoPaciente() {
    return this.fotoPaciente;
  }

  public Atiende setFotoPaciente(String fotoPaciente) {
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
    case CLAVE_DOCTOR:
      if (value == null) {
        unsetClaveDoctor();
      } else {
        setClaveDoctor((String)value);
      }
      break;

    case CLAVE_PACIENTE:
      if (value == null) {
        unsetClavePaciente();
      } else {
        setClavePaciente((String)value);
      }
      break;

    case FECHA:
      if (value == null) {
        unsetFecha();
      } else {
        setFecha((String)value);
      }
      break;

    case TRATAMIENTO:
      if (value == null) {
        unsetTratamiento();
      } else {
        setTratamiento((String)value);
      }
      break;

    case DIAGNOSTICO:
      if (value == null) {
        unsetDiagnostico();
      } else {
        setDiagnostico((String)value);
      }
      break;

    case FOTO_DOCTOR:
      if (value == null) {
        unsetFotoDoctor();
      } else {
        setFotoDoctor((String)value);
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
    case CLAVE_DOCTOR:
      return getClaveDoctor();

    case CLAVE_PACIENTE:
      return getClavePaciente();

    case FECHA:
      return getFecha();

    case TRATAMIENTO:
      return getTratamiento();

    case DIAGNOSTICO:
      return getDiagnostico();

    case FOTO_DOCTOR:
      return getFotoDoctor();

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
    case CLAVE_DOCTOR:
      return isSetClaveDoctor();
    case CLAVE_PACIENTE:
      return isSetClavePaciente();
    case FECHA:
      return isSetFecha();
    case TRATAMIENTO:
      return isSetTratamiento();
    case DIAGNOSTICO:
      return isSetDiagnostico();
    case FOTO_DOCTOR:
      return isSetFotoDoctor();
    case FOTO_PACIENTE:
      return isSetFotoPaciente();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Atiende)
      return this.equals((Atiende)that);
    return false;
  }

  public boolean equals(Atiende that) {
    if (that == null)
      return false;

    boolean this_present_claveDoctor = true && this.isSetClaveDoctor();
    boolean that_present_claveDoctor = true && that.isSetClaveDoctor();
    if (this_present_claveDoctor || that_present_claveDoctor) {
      if (!(this_present_claveDoctor && that_present_claveDoctor))
        return false;
      if (!this.claveDoctor.equals(that.claveDoctor))
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

    boolean this_present_fecha = true && this.isSetFecha();
    boolean that_present_fecha = true && that.isSetFecha();
    if (this_present_fecha || that_present_fecha) {
      if (!(this_present_fecha && that_present_fecha))
        return false;
      if (!this.fecha.equals(that.fecha))
        return false;
    }

    boolean this_present_tratamiento = true && this.isSetTratamiento();
    boolean that_present_tratamiento = true && that.isSetTratamiento();
    if (this_present_tratamiento || that_present_tratamiento) {
      if (!(this_present_tratamiento && that_present_tratamiento))
        return false;
      if (!this.tratamiento.equals(that.tratamiento))
        return false;
    }

    boolean this_present_diagnostico = true && this.isSetDiagnostico();
    boolean that_present_diagnostico = true && that.isSetDiagnostico();
    if (this_present_diagnostico || that_present_diagnostico) {
      if (!(this_present_diagnostico && that_present_diagnostico))
        return false;
      if (!this.diagnostico.equals(that.diagnostico))
        return false;
    }

    boolean this_present_fotoDoctor = true && this.isSetFotoDoctor();
    boolean that_present_fotoDoctor = true && that.isSetFotoDoctor();
    if (this_present_fotoDoctor || that_present_fotoDoctor) {
      if (!(this_present_fotoDoctor && that_present_fotoDoctor))
        return false;
      if (!this.fotoDoctor.equals(that.fotoDoctor))
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
  public int compareTo(Atiende other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetClaveDoctor()).compareTo(other.isSetClaveDoctor());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClaveDoctor()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.claveDoctor, other.claveDoctor);
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
    lastComparison = Boolean.valueOf(isSetFecha()).compareTo(other.isSetFecha());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFecha()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fecha, other.fecha);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTratamiento()).compareTo(other.isSetTratamiento());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTratamiento()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tratamiento, other.tratamiento);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDiagnostico()).compareTo(other.isSetDiagnostico());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDiagnostico()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.diagnostico, other.diagnostico);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFotoDoctor()).compareTo(other.isSetFotoDoctor());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFotoDoctor()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fotoDoctor, other.fotoDoctor);
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
    StringBuilder sb = new StringBuilder("Atiende(");
    boolean first = true;

    sb.append("claveDoctor:");
    if (this.claveDoctor == null) {
      sb.append("null");
    } else {
      sb.append(this.claveDoctor);
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
    sb.append("fecha:");
    if (this.fecha == null) {
      sb.append("null");
    } else {
      sb.append(this.fecha);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tratamiento:");
    if (this.tratamiento == null) {
      sb.append("null");
    } else {
      sb.append(this.tratamiento);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("diagnostico:");
    if (this.diagnostico == null) {
      sb.append("null");
    } else {
      sb.append(this.diagnostico);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("fotoDoctor:");
    if (this.fotoDoctor == null) {
      sb.append("null");
    } else {
      sb.append(this.fotoDoctor);
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

  private static class AtiendeStandardSchemeFactory implements SchemeFactory {
    public AtiendeStandardScheme getScheme() {
      return new AtiendeStandardScheme();
    }
  }

  private static class AtiendeStandardScheme extends StandardScheme<Atiende> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Atiende struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CLAVE_DOCTOR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.claveDoctor = iprot.readString();
              struct.setClaveDoctorIsSet(true);
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
          case 3: // FECHA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.fecha = iprot.readString();
              struct.setFechaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TRATAMIENTO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tratamiento = iprot.readString();
              struct.setTratamientoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DIAGNOSTICO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.diagnostico = iprot.readString();
              struct.setDiagnosticoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // FOTO_DOCTOR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.fotoDoctor = iprot.readString();
              struct.setFotoDoctorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // FOTO_PACIENTE
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Atiende struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.claveDoctor != null) {
        oprot.writeFieldBegin(CLAVE_DOCTOR_FIELD_DESC);
        oprot.writeString(struct.claveDoctor);
        oprot.writeFieldEnd();
      }
      if (struct.clavePaciente != null) {
        oprot.writeFieldBegin(CLAVE_PACIENTE_FIELD_DESC);
        oprot.writeString(struct.clavePaciente);
        oprot.writeFieldEnd();
      }
      if (struct.fecha != null) {
        oprot.writeFieldBegin(FECHA_FIELD_DESC);
        oprot.writeString(struct.fecha);
        oprot.writeFieldEnd();
      }
      if (struct.tratamiento != null) {
        oprot.writeFieldBegin(TRATAMIENTO_FIELD_DESC);
        oprot.writeString(struct.tratamiento);
        oprot.writeFieldEnd();
      }
      if (struct.diagnostico != null) {
        oprot.writeFieldBegin(DIAGNOSTICO_FIELD_DESC);
        oprot.writeString(struct.diagnostico);
        oprot.writeFieldEnd();
      }
      if (struct.fotoDoctor != null) {
        oprot.writeFieldBegin(FOTO_DOCTOR_FIELD_DESC);
        oprot.writeString(struct.fotoDoctor);
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

  private static class AtiendeTupleSchemeFactory implements SchemeFactory {
    public AtiendeTupleScheme getScheme() {
      return new AtiendeTupleScheme();
    }
  }

  private static class AtiendeTupleScheme extends TupleScheme<Atiende> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Atiende struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetClaveDoctor()) {
        optionals.set(0);
      }
      if (struct.isSetClavePaciente()) {
        optionals.set(1);
      }
      if (struct.isSetFecha()) {
        optionals.set(2);
      }
      if (struct.isSetTratamiento()) {
        optionals.set(3);
      }
      if (struct.isSetDiagnostico()) {
        optionals.set(4);
      }
      if (struct.isSetFotoDoctor()) {
        optionals.set(5);
      }
      if (struct.isSetFotoPaciente()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetClaveDoctor()) {
        oprot.writeString(struct.claveDoctor);
      }
      if (struct.isSetClavePaciente()) {
        oprot.writeString(struct.clavePaciente);
      }
      if (struct.isSetFecha()) {
        oprot.writeString(struct.fecha);
      }
      if (struct.isSetTratamiento()) {
        oprot.writeString(struct.tratamiento);
      }
      if (struct.isSetDiagnostico()) {
        oprot.writeString(struct.diagnostico);
      }
      if (struct.isSetFotoDoctor()) {
        oprot.writeString(struct.fotoDoctor);
      }
      if (struct.isSetFotoPaciente()) {
        oprot.writeString(struct.fotoPaciente);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Atiende struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.claveDoctor = iprot.readString();
        struct.setClaveDoctorIsSet(true);
      }
      if (incoming.get(1)) {
        struct.clavePaciente = iprot.readString();
        struct.setClavePacienteIsSet(true);
      }
      if (incoming.get(2)) {
        struct.fecha = iprot.readString();
        struct.setFechaIsSet(true);
      }
      if (incoming.get(3)) {
        struct.tratamiento = iprot.readString();
        struct.setTratamientoIsSet(true);
      }
      if (incoming.get(4)) {
        struct.diagnostico = iprot.readString();
        struct.setDiagnosticoIsSet(true);
      }
      if (incoming.get(5)) {
        struct.fotoDoctor = iprot.readString();
        struct.setFotoDoctorIsSet(true);
      }
      if (incoming.get(6)) {
        struct.fotoPaciente = iprot.readString();
        struct.setFotoPacienteIsSet(true);
      }
    }
  }

}

