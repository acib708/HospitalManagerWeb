package actions;

import java.lang.String;
import thrift.*;

public class    Capturar {
    private DBManager dbManager = new DBManager();
    private Boolean ans;
    private String  claveDoctor, clavePaciente, claveAnalisis, nombre, direccion, especialidad, telefono, fotoPaciente, fotoDoctor, tipo, descripcion, fechaAplicacion, fechaEntrega, diagnostico, fechaAtiende, tratamiento;


  public String doctor() throws Exception{

        System.out.println(claveDoctor+nombre+direccion+especialidad+telefono);
        Doctor doctor = new Doctor();
        doctor.setFoto(fotoDoctor);
        doctor.setClave(claveDoctor);
        doctor.setDireccion(direccion);
        doctor.setEspecialidad(especialidad);
        doctor.setNombre(nombre);
        doctor.setTelefono(telefono);

        ans = dbManager.capturarDoctor(doctor);

        return "success";
    }

    public String paciente() throws Exception{
        Paciente paciente = new Paciente();
        paciente.setFoto(fotoPaciente);
        paciente.setNombre(nombre);
        paciente.setDireccion(direccion);
        paciente.setTelefono(telefono);
        paciente.setClave(clavePaciente);

        ans = dbManager.capturarPaciente(paciente);

        return "success";
    }

    public String analisis() throws Exception{
        AnalisisClinico analisis = new AnalisisClinico();
        analisis.setClave(claveAnalisis);
        analisis.setDescripcion(descripcion);
        analisis.setTipo(tipo);

        ans = dbManager.capturarAnalisis(analisis);

        return "success";
    }

    public String seRealiza() throws Exception{
        SeRealiza seRealiza = new SeRealiza();
        seRealiza.setClaveAnalisis(claveAnalisis);
        seRealiza.setClavePaciente(clavePaciente);
        seRealiza.setFotoPaciente(fotoPaciente);
        seRealiza.setFechaAplic(fechaAplicacion);
        seRealiza.setFechaEntrega (fechaEntrega);

        ans = dbManager.capturarSeRealiza(seRealiza);

        return "success";
    }

    public String atiende() throws Exception{
        Atiende atiende = new Atiende();
        atiende.setFotoDoctor(fotoDoctor);
        atiende.setFotoPaciente(fotoPaciente);
        atiende.setClavePaciente(clavePaciente);
        atiende.setClaveDoctor(claveDoctor);
        atiende.setDiagnostico(diagnostico);
        atiende.setFecha(fechaAtiende);
        atiende.setTratamiento(tratamiento);

        ans = dbManager.capturarAtiende(atiende);
        return "success";
    }

    /* Getters and Setters */
    public Boolean getAns() {
        return ans;
    }

    public void setDbManager(DBManager dbManager) {
        this.dbManager = dbManager;
    }

    public void setClaveDoctor(String claveDoctor) {
        this.claveDoctor = claveDoctor;
    }

    public void setClavePaciente(String clavePaciente) {
        this.clavePaciente = clavePaciente;
    }

    public void setClaveAnalisis(String claveAnalisis) {
        this.claveAnalisis = claveAnalisis;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFotoPaciente(String fotoPaciente) {
        this.fotoPaciente = fotoPaciente;
    }

    public void setFotoDoctor(String fotoDoctor) {
        this.fotoDoctor = fotoDoctor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFechaAplicacion(String fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setFechaAtiende(String fechaAtiende) {
        this.fechaAtiende = fechaAtiende;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
}
