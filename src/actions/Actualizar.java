package actions;

import model.AnalisisClinico;
import model.DBManager;
import model.Doctor;
import model.Paciente;

public class Actualizar {
    private DBManager dbManager = new DBManager();
    private Boolean   response;

    private String          clave,nombre,direccion,especialidad,telefono,foto,tipo,descripcion;
    private Doctor          doctor;
    private Paciente        paciente;
    private AnalisisClinico analisis;

    public String doctor() throws Exception{
        doctor = new Doctor();
        doctor.setClave(clave);
        doctor.setDireccion(direccion);
        doctor.setEspecialidad(especialidad);
        doctor.setFoto(foto);
        doctor.setNombre(nombre);
        doctor.setTelefono(telefono);
        response = dbManager.actualizarDoctor(doctor);
        return "success";
    }

    public String paciente() throws Exception{
        paciente = new Paciente();
        paciente.setClave(clave);
        paciente.setDireccion(direccion);
        paciente.setFoto(foto);
        paciente.setNombre(nombre);
        paciente.setTelefono(telefono);
        response = dbManager.actualizarPaciente(paciente);
        return "success";
    }

    public String analisis() throws Exception{
        analisis = new AnalisisClinico();
        analisis.setClave(clave);
        analisis.setDescripcion(descripcion);
        analisis.setTipo(tipo);
        response = dbManager.actualizarAnalisis(analisis);
        return "success";
    }

    public String getDataDoctor(){
        doctor = dbManager.consultarDoctorClave(clave);
        return "success";
    }

    public String getDataPaciente(){
        paciente = dbManager.consultarPacienteClave(clave);
        return "success";
    }

    public String getDataAnalisis(){
        analisis = dbManager.consultarAnalisisClave(clave);
        return "success";
    }

    //Getters for attributes
    public Boolean getResponse() {
        return response;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public AnalisisClinico getAnalisis() {
        return analisis;
    }

    //Setters for parameters
    public void setClave(String clave) {
        this.clave = clave;
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

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Doctor getDoctor() {
        return doctor;
    }
}
