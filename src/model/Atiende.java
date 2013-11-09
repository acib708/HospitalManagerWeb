package model;

import java.util.*;
public class Atiende{
    public static final String[] HEADERS = { "Clave Doctor", "Clave Paciente", "Fecha", "Tratamiento", "Diagn&oacute;stico", "Foto Doctor", "Foto Paciente" };
	private String claveDoctor;
	private String clavePaciente;
	private String fecha;
	private String tratamiento;
	private String diagnostico;
    private String fotoDoctor;
    private String fotoPaciente;
	
	public Atiende(){
		claveDoctor   = "";
		clavePaciente = "";
		fecha         = "";
		tratamiento   = "";
		diagnostico   = "";
        fotoDoctor    = "";
        fotoPaciente  = "";
	}

	public Atiende(String datos){
		StringTokenizer st = new StringTokenizer(datos,"_");
		claveDoctor   = st.nextToken();
		clavePaciente = st.nextToken();
		fecha         = st.nextToken();
		tratamiento   = st.nextToken();
		diagnostico   = st.nextToken();
        fotoDoctor    = st.nextToken();
        fotoPaciente  = st.nextToken();
	}
	
	public String toString(){
		return "Clave del Doctor: "+claveDoctor+"\nClave del Paciente: "+clavePaciente+"\nFecha: "+fecha+"\nTratamiento: "+tratamiento+"\nDiagnostico: "+diagnostico;
	}

	public String toStringSQL(){
		return "'"+claveDoctor+"','"+clavePaciente+"','"+fecha+"','"+tratamiento+"','"+diagnostico+"','"+fotoDoctor+"','"+fotoPaciente+"'";
	}
	
	public void setClaveDoctor(String claveDoctor){
		this.claveDoctor = claveDoctor;
	}

	public String getClaveDoctor(){
		return this.claveDoctor;
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