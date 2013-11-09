package model;

import java.util.*;
public class AnalisisClinico{
    public static final String[] HEADERS = { "Clave", "Tipo", "Descripci&oacute;n" };
	private String clave;
	private String tipo;
	private String descripcion;
	
	public AnalisisClinico(){
		clave 		= "";
		tipo        = "";
		descripcion = "";
	}
	public AnalisisClinico(String datos){
		StringTokenizer st = new StringTokenizer(datos,"_");
		clave 		= st.nextToken();
		tipo        = st.nextToken();
		descripcion = st.nextToken();
	}
	
	public String toString(){
		return "Clave: "+clave+"\nTipo: "+tipo+"\nDescripcion: "+descripcion;
	}

	public String toStringSQL(){
	    return "'"+clave+"','"+tipo+"','"+descripcion+"'";
	}

	public String toStringSQLUpdate(){
		return "clave= '"+clave+"', tipo='"+tipo+"', descripcion= '"+descripcion+"'";
	}
		
	public void setClave(String clave){
		this.clave = clave;
	}

    public String getClave(){
		return this.clave;
	}
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}

	public String getTipo(){
		return this.tipo;
	}
	
	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}

    public String getDescripcion(){
		return this.descripcion;
	}
}