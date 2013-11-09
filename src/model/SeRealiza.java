package model;

import java.util.*;
public class SeRealiza{
    public static final String[] HEADERS = { "Foto Paciente", "Clave Analisas", "Clave Paciente", "Fecha Aplicaci&oacute;n", "Fecha Entrega" };
	private String claveAnalisis;
	private String clavePaciente;
	private String fechaAplic;
	private String fechaEntrega;
    private String fotoPaciente;

	public SeRealiza(){
		claveAnalisis = "";
		clavePaciente = "";
		fechaAplic 	  = "";
		fechaEntrega  = "";
        fotoPaciente  = "";
	}

	public SeRealiza(String datos){
		StringTokenizer st = new StringTokenizer(datos,"_");
		claveAnalisis = st.nextToken();
		clavePaciente = st.nextToken();
		fechaAplic 	  = st.nextToken();
		fechaEntrega  = st.nextToken();
        fotoPaciente  = st.nextToken();
	}
	
	public String toString(){
		return "Clave del Analisis: "+claveAnalisis+"\nClave del Paciente: "+clavePaciente+"\nFecha de Aplicacion: "+fechaAplic+"\nFecha de Entrega: "+fechaEntrega + "\nFoto Paciente: "+fotoPaciente;
	}

	public String toStringSQL(){
		return "'"+claveAnalisis+"','"+clavePaciente+"','"+fechaAplic+"','"+fechaEntrega+"','"+fotoPaciente+"'";
	}
		
	public void setClaveAnalisis(String claveAnalisis){
		this.claveAnalisis = claveAnalisis;
	}

	public String getClaveAnalisis(){
		return this.claveAnalisis;
	}
	
	public void setClavePaciente(String clavePaciente){
		this.clavePaciente = clavePaciente;
	}

	public String getClavePaciente(){
		return this.clavePaciente;
	}

	public void setFechaAplic(String fechaAplic){
		this.fechaAplic = fechaAplic;
	}

	public String getFechaAplic(){
		return this.fechaAplic;
	}
	
	public void setFechaEntrega(String fechaEntrega){
		this.fechaEntrega = fechaEntrega;
	}

	public String getFechaEntrega(){
		return this.fechaEntrega;
	}

    public String getFotoPaciente() {
        return fotoPaciente;
    }

    public void setFotoPaciente(String fotoPaciente) {
        this.fotoPaciente = fotoPaciente;
    }
}