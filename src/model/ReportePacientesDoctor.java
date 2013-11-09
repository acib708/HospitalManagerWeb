package model;

import java.util.*;
public class ReportePacientesDoctor{
    public static final String[] HEADERS = { "Foto Paciente", "Clave Paciente", "Nombre Paciente", "Tratamiento", "Diagn&oacute;stico", "Fecha" };
	private String clavePaciente;
	private String claveDoctor;
	private String nombreDoctor;
	private String nombrePaciente;
	private String tratamiento;
	private String diagnostico;
	private String fecha;
    private String fotoDoctor;
    private String fotoPaciente;

	public ReportePacientesDoctor(){
		clavePaciente  = "";
		claveDoctor    = "";
		nombreDoctor   = "";
		nombrePaciente = "";
		tratamiento	   = "";
		diagnostico	   = "";
		fecha		   = "";
        fotoDoctor     = "";
        fotoPaciente   = "";
	}

	public ReportePacientesDoctor(String datos){
		StringTokenizer st = new StringTokenizer(datos,"_");
		clavePaciente  = st.nextToken();
		claveDoctor    = st.nextToken();
		nombreDoctor   = st.nextToken();
		nombrePaciente = st.nextToken();
		tratamiento    = st.nextToken();
		diagnostico	   = st.nextToken();
		fecha 		   = st.nextToken();
        fotoDoctor     = st.nextToken();
        fotoPaciente   = st.nextToken();
	}

	public String toStringHeader(){
		return "Doctor\nClave: "+claveDoctor+"\nNombre: "+nombreDoctor+"\nFoto Doctor: "+fotoDoctor;
	}

	public String toString(){
		return "Fecha: "+fecha+"\nClave del Paciente: "+clavePaciente+"\nNombre del Paciente: "+nombrePaciente+"\nDiagnostico: "+diagnostico+"\nTratamiento: "+tratamiento+"\nFoto Paciente: "+fotoPaciente;
	}	
	
	public void setClavePaciente(String clavePaciente){
		this.clavePaciente = clavePaciente;
	}

	public String getClavePaciente(){
		return this.clavePaciente;
	}
	
	public void setFecha(String fecha){
		this.fecha = fecha;
	}

	public String getFecha(){
		return this.fecha;
	}
	
	public void setClaveDoctor(String claveDoctor){
		this.claveDoctor = claveDoctor;
	}

	public String getClaveDoctor(){
		return this.claveDoctor;
	}
	
	public void setNombreDoctor(String nombreDoctor){
		this.nombreDoctor = nombreDoctor;
	}

	public String getNombreDoctor(){
		return this.nombreDoctor;
	}
	
	public void setNombrePaciente(String nombrePaciente){
		this.nombrePaciente = nombrePaciente;
	}

	public String getNombrePaciente(){
		return this.nombrePaciente;
	}
	
	public void setTratamiento(String tratamiento){
		this.tratamiento = tratamiento;
	}

	public String getTratamiento(){
		return this.tratamiento;
	}
	
	public void setDiagnostico(String diagnostico){
		this.diagnostico = diagnostico;
	}

	public String getDiagnostico(){
		return this.diagnostico;
	}

    public String getFotoDoctor() {
        return fotoDoctor;
    }

    public void setFotoDoctor(String fotoDoctor) {
        this.fotoDoctor = fotoDoctor;
    }

    public String getFotoPaciente() {
        return fotoPaciente;
    }

    public void setFotoPaciente(String fotoPaciente) {
        this.fotoPaciente = fotoPaciente;
    }

}