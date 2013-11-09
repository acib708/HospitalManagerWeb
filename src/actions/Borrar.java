package actions;

import model.DBManager;

public class Borrar {
    private DBManager dbManager = new DBManager();
    //Keys needed to erase each entry in the DB
    private String  clave;
    private Boolean deleted;

    public String doctor() throws Exception{
        deleted = dbManager.borrarDoctor(clave);
        return "success";
    }

    public String paciente() throws Exception{
        deleted = dbManager.borrarPaciente(clave);
        return "success";
    }

    public String analisis() throws Exception{
        deleted = dbManager.borrarAnalisis(clave);
        return "success";
    }

    /* Getters and Setters */
    public Boolean isDeleted() {
        return deleted;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
