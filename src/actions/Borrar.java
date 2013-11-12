package actions;

import thrift.DBManager;

public class Borrar {
    private DBManager dbManager = new DBManager();
    //Keys needed to erase each entry in the DB
    private String  clave;
    private Boolean ans;

    public String doctor() throws Exception{
        ans = dbManager.borrarDoctor(clave);
        return "success";
    }

    public String paciente() throws Exception{
        ans = dbManager.borrarPaciente(clave);
        return "success";
    }

    public String analisis() throws Exception{
        ans = dbManager.borrarAnalisis(clave);
        return "success";
    }

    /* Getters and Setters */
    public Boolean getAns() {
        return ans;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
