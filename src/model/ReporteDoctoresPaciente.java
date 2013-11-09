package model;

import java.util.*;
public class ReporteDoctoresPaciente{
    public static final String[] HEADERS = { "Foto Doctor", "Clave Doctor", "Doctor", "Tratamiento", "Diagn&oacute;stico", "Fecha" };
	private String clavePaciente;
	private String claveDoctor;
	private String nombreDoctor;
	private String nombrePaciente;
	private String tratamiento;
	private String diagnostico;
	private String fecha;
    private String fotoDoctor;
    private String fotoPaciente;

	public ReporteDoctoresPaciente(){
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

	public ReporteDoctoresPaciente(String datos){
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
		return "Paciente\nClave: "+clavePaciente+"\nNombre: "+nombrePaciente+"\nFoto Paciente: "+fotoPaciente;
	}

	public String toString(){
		return "Fecha: "+fecha+"\n Clave del Doctor: "+claveDoctor+"\n Nombre del Doctor: "+nombreDoctor+"\n Diagnostico: "+diagnostico+"\n Tratamiento: "+tratamiento+"\nFoto Doctor: "+fotoDoctor;
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