package actions;

import model.AnalisisClinico;
import model.DBManager;
import model.Doctor;
import model.Paciente;

public class Actualizar {
    private DBManager dbManager = new DBManager();
    private Boolean   response;

    private String          claveDoctor,nombreDoctor,direccionDoctor,especialidadDoctor,telefonoDoctor,fotoDoctor;
    private String          clavePaciente,direccionPaciente,fotoPaciente,nombrePaciente,telefonoPaciente;
    private String          claveAnalisis;
    private Doctor          doctor;
    private Paciente        paciente;
    private AnalisisClinico analisis;

    public String doctor() throws Exception{
        getDataDoctor();
        response = dbManager.actualizarDoctor(doctor);
        return "success";
    }

    public String paciente() throws Exception{
        getDataPaciente();
        response = dbManager.actualizarPaciente(paciente);
        return "success";
    }

    public String analisis() throws Exception{
        getDataAnalisis();
        response = dbManager.actualizarAnalaisis(analisis);
        return "success";
    }
    //Getters for attributes
    public String getDataDoctor(){
        doctor = dbManager.consultarDoctorClave(claveDoctor);
        return "success";
    }

    public String getDataPaciente(){
        paciente = dbManager.consultarPacienteClave(clavePaciente);
        return "success";
    }

    public String getDataAnalisis(){
        analisis = dbManager.consultarAnalisisClave(claveAnalisis);
        return "success";
    }

    //Setters for parameters
    public void setClaveDoctor(String claveDoctor) {
        this.claveDoctor = claveDoctor;
    }

    public void setClavePaciente(String clavePaciente) {
        this.clavePaciente = clavePaciente;
    }

    public void setClaveAnalisis(String claveAnalisis) {
        this.claveAnalisis = claveAnalisis;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public AnalisisClinico getAnalisis() {
        return analisis;
    }
}
