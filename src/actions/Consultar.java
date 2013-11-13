package actions;

import thrift.*;

import java.util.HashMap;

public class Consultar {
    private DBManager   dbManager = new DBManager();
    //thrift.Doctor
    private Doctor[]          doctores;
    private String            claveDoctor,especialidadDoctor;
    //thrift.Paciente
    private Paciente[]        pacientes;
    private String            clavePaciente;
    //Analisis Clinico
    private AnalisisClinico[] analisis;
    private String            claveAnalisis,tipoAnalisis;
    //thrift.SeRealiza
    private SeRealiza[]       seRealiza;
    //thrift.Atiende
    private Atiende[]         atiende;
    //Hashes para saber nombre de analisis, doctores y pacientes
    private HashMap<String, String> hashDoctores;
    private HashMap<String, String> hashPacientes;
    private HashMap<String, String> hashAnalisis;

    //thrift.Doctor
    public String doctorGeneral() throws Exception{
        doctores = dbManager.consultarDoctores();
        System.out.println("PROBANDO MANO: RECIBI DOCTORES CONSULTA GENERAL");
        return "success";
    }
    public String doctorClave() throws Exception{
        Doctor doctor = dbManager.consultarDoctorClave(claveDoctor);
        System.out.println("PROBANDO MANO: RECIBI DOCTOR POR CLAVE DEL SERVIDOR");
        if(doctor != null){
            doctores    = new Doctor[1];
            doctores[0] = doctor;
        }
        else
            doctores = null;
        return "success";
    }
    public String doctorEspecialidad() throws Exception{
        doctores = dbManager.consultarDoctoresEspecialidad(especialidadDoctor);
        return "success";
    }

    //thrift.Paciente
    public String pacienteGeneral() throws Exception{
        pacientes = dbManager.consultarPacientes();
        return "success";
    }
    public String pacienteClave() throws Exception{
        Paciente paciente = dbManager.consultarPacienteClave(clavePaciente);
        if(paciente != null){
            pacientes    = new Paciente[1];
            pacientes[0] = paciente;
        }
        else
            pacientes = null;
        return "success";
    }

    //Analisis
    public String analisisGeneral() throws Exception{
        analisis = dbManager.consultarAnalisis();
        return "success";
    }
    public String analisisClave() throws Exception{
        AnalisisClinico analisisClinico = dbManager.consultarAnalisisClave(claveAnalisis);
        if(analisisClinico != null){
            analisis    = new AnalisisClinico[1];
            analisis[0] = analisisClinico;
        }
        else
            analisis = null;
        return "success";
    }
    public String analisisTipo() throws Exception{
        analisis = dbManager.consultarAnalisisTipo(tipoAnalisis);
        return "success";
    }

    //thrift.SeRealiza
    public String seRealizaGeneral() throws Exception{
        seRealiza = dbManager.consultarSeRealiza();
        hashPacientes = new HashMap<String, String>();
        hashAnalisis = new HashMap<String, String>();
        for(SeRealiza current : seRealiza){
            Paciente p = dbManager.consultarPacienteClave(current.getClavePaciente());
            hashPacientes.put(p.getClave(), p.getNombre());
            AnalisisClinico a = dbManager.consultarAnalisisClave(current.getClaveAnalisis());
            hashAnalisis.put(a.getClave(), a.getTipo());
        }
        return "success";
    }

    //thrift.Atiende
    public String atiendeGeneral() throws Exception{
        atiende = dbManager.consultarAtiende();
        hashDoctores  = new HashMap<String, String>();
        hashPacientes = new HashMap<String, String>();
        for(Atiende current : atiende ){
            Paciente p = dbManager.consultarPacienteClave(current.getClavePaciente());
            hashPacientes.put(p.getClave(), p.getNombre());
            Doctor d   = dbManager.consultarDoctorClave(current.getClaveDoctor());
            hashDoctores.put(d.getClave(), d.getNombre());
        }
        return "success";
    }

    public Doctor[] getDoctores() {
        return doctores;
    }

    public Paciente[] getPacientes() {
        return pacientes;
    }

    public AnalisisClinico[] getAnalisis() {
        return analisis;
    }

    public SeRealiza[] getSeRealiza() {
        return seRealiza;
    }

    public Atiende[] getAtiende() {
        return atiende;
    }

    public void setEspecialidadDoctor(String especialidadDoctor) {
        this.especialidadDoctor = especialidadDoctor;
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

    public void setTipoAnalisis(String tipoAnalisis) {
        this.tipoAnalisis = tipoAnalisis;
    }

    public HashMap<String, String> getHashDoctores() {
        return hashDoctores;
    }

    public HashMap<String, String> getHashPacientes() {
        return hashPacientes;
    }

    public HashMap<String, String> getHashAnalisis() {
        return hashAnalisis;
    }
}
