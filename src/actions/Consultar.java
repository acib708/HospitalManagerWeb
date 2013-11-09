package actions;

import model.DBManager;

public class Consultar {
    private DBManager dbManager = new DBManager();

    //Doctor
    public String doctorGeneral() throws Exception{
        return "success";
    }
    public String doctorClave() throws Exception{
        return "success";
    }
    public String doctorEspecialidad() throws Exception{
        return "success";
    }

    //Paciente
    public String pacienteGeneral() throws Exception{
        return "success";
    }
    public String pacienteClave() throws Exception{
        return "success";
    }

    //Analisis
    public String analisisGeneral() throws Exception{
        return "success";
    }
    public String analisisClave() throws Exception{
        return "success";
    }
    public String analisisTipo() throws Exception{
        return "success";
    }

    //SeRealiza
    public String seRealizaGeneral() throws Exception{
        return "success";
    }

    //Atiende
    public String atiendeGeneral() throws Exception{
        return "success";
    }

}
