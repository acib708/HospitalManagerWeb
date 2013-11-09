package actions;

import model.DBManager;

public class Generar {
    private DBManager dbManager = new DBManager();

    public String reporteAnalisisPaciente() throws Exception{
        return "success";
    }

    public String reportePacientesAnalisis() throws Exception{
        return "success";
    }

    public String reporteDoctoresPaciente() throws Exception{
        return "success";
    }

    public String reportePacientesDoctor() throws Exception{
        return "success";
    }

}
