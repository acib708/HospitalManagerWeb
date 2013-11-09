package model;

import java.util.*;
public class ReportePacientesAnalisis{
    public static final String[] HEADERS = { "Foto Paciente", "Clave Paciente", "Nombre Paciente", "Fecha de Aplicaci&oacute;n", "Fecha de Entrega" };
	private String clavePaciente;
	private String claveAnalisis;
	private String fechaAplic;
	private String nombrePaciente;
	private String fechaEntrega;
	private String tipo;
	private String descripcion;
    private String fotoPaciente;

	public ReportePacientesAnalisis(){
		clavePaciente  = "";
		claveAnalisis  = "";
		fechaAplic     = "";
		nombrePaciente = "";
		fechaEntrega   = "";
		tipo	       = "";
		descripcion    = "";
        fotoPaciente   = "";
	}

	public ReportePacientesAnalisis(String datos){
		StringTokenizer st = new StringTokenizer(datos,"_");
		clavePaciente      = st.nextToken();
		claveAnalisis      = st.nextToken();
		fechaAplic         = st.nextToken();
		nombrePaciente     = st.nextToken();
		fechaEntrega       = st.nextToken();
		tipo	           = st.nextToken();
		descripcion 	   = st.nextToken();
        fotoPaciente       = st.nextToken();
	}

	public String toStringHeader(){
		return "Analisis\nClave: "+claveAnalisis+"\nTipo: "+tipo+"\nDescripcion: "+descripcion;
	}

	public String toString(){
		return "Foto Paciente: "+fotoPaciente+"\nClave Paciente: "+clavePaciente+"\n Nombre Paciente: "+nombrePaciente+"\n Fecha de Aplicacion: "+fechaAplic+"\n Fecha de Entrega: "+fechaEntrega;
	}	
	
	public void setClavePaciente(String clavePaciente){
		this.clavePaciente = clavePaciente;
	}

	public String getClavePaciente(){
		return this.clavePaciente;
	}
	
	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}

	public String getDescripcion(){
		return this.descripcion;
	}
	
	public void setClaveAnalisis(String claveAnalisis){
		this.claveAnalisis = claveAnalisis;
	}

	public String getClaveAnalisis(){
		return this.claveAnalisis;
	}
	
	public void setFechaAplic(String fechaAplic){
		this.fechaAplic = fechaAplic;
	}

	public String getFechaAplic(){
		return this.fechaAplic;
	}
	
	public void setNombrePaciente(String nombrePaciente){
		this.nombrePaciente = nombrePaciente;
	}

	public String getNombrePaciente(){
		return this.nombrePaciente;
	}
	
	public void setFechaEntrega(String fechaEntrega){
		this.fechaEntrega = fechaEntrega;
	}

	public String getFechaEntrega(){
		return this.fechaEntrega;
	}
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}

	public String getTipo(){
		return this.tipo;
	}

    public String getFotoPaciente() {
        return fotoPaciente;
    }

    public void setFotoPaciente(String fotoPaciente) {
        this.fotoPaciente = fotoPaciente;
    }

}