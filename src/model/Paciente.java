package model;

import java.util.*;
public class Paciente{
    public  static final String[] HEADERS = { "Clave", "Nombre", "Direcci&oacute;n", "Tel&eacute;fono"  };
	private String clave;
	private String nombre;
	private String direccion;
	private String telefono;
    private String foto;
	
	public Paciente(){
		clave     = "";
		nombre    = "";
		direccion = "";
		telefono  = "";
        foto      = "";
	}

	public Paciente(String datos){
		StringTokenizer st = new StringTokenizer(datos,"_");
		clave 	  = st.nextToken();
		nombre    = st.nextToken();
		direccion = st.nextToken();
		telefono  = st.nextToken();
        foto      = st.nextToken();
	}
	
	public String toString(){
		return "Clave: "+clave+"\nNombre: "+nombre+"\nDireccion: "+direccion+"\nTelefono: "+telefono+"\nFoto: "+foto;
	}

	public String toStringSQL(){
	    return "'"+clave+"','"+nombre+"','"+direccion+"','"+telefono+"','"+foto+"'";
	}

	public String toStringSQLUpdate(){
		return "clave= '"+clave+"', nombre='"+nombre+"', direccion= '"+direccion+"', telefono= '"+telefono+"', foto= '"+foto+"'";
	}
	
	public void setClave(String clave){
		this.clave = clave;
	}

	public String getClave(){
		return this.clave;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return this.nombre;
	}
	
	public void setDireccion(String direccion){
		this.direccion = direccion;
	}

	public String getDireccion(){
		return this.direccion;
	}
	
	public void setTelefono(String telefono){
		this.telefono = telefono;
	}

	public String getTelefono(){
		return this.telefono;
	}

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

}