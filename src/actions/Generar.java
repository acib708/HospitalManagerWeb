package actions;

import thrift.*;

public class Generar {
    private DBManager dbManager = new DBManager();
    private ReporteAnalisisPaciente[]  reportesAnalisisPaciente;
    private ReporteDoctoresPaciente[]  reportesDoctoresPaciente;
    private ReportePacientesAnalisis[] reportesPacientesAnalisis;
    private ReportePacientesDoctor[]   reportesPacientesDoctor;
    String claveDoctor;
    String  claveAnalisis;
    String  clavePaciente;

    public String reporteAnalisisPaciente() throws Exception{
        reportesAnalisisPaciente = dbManager.generarReporteAnalisisPaciente(clavePaciente);
        System.out.println(reportesAnalisisPaciente);

        return "success";
    }

    public String reportePacientesAnalisis() throws Exception{
        reportesPacientesAnalisis = dbManager.generarReportePacientesAnalisis(claveAnalisis);
        return "success";
    }

    public String reporteDoctoresPaciente() throws Exception{
        reportesDoctoresPaciente = dbManager.generarReporteDoctoresPaciente(clavePaciente);
        return "success";
    }

    public String reportePacientesDoctor() throws Exception{
        reportesPacientesDoctor  = dbManager.generarReportePacientesDoctor(claveDoctor);
        return "success";
    }

    public ReportePacientesDoctor[] getReportesPacientesDoctor() {
        return reportesPacientesDoctor;
    }

    public ReportePacientesAnalisis[] getReportesPacientesAnalisis() {
        return reportesPacientesAnalisis;
    }

    public ReporteDoctoresPaciente[] getReportesDoctoresPaciente() {
        return reportesDoctoresPaciente;
    }

    public ReporteAnalisisPaciente[] getReportesAnalisisPaciente() {
        return reportesAnalisisPaciente;
    }

    public void setClavePaciente(String clavePaciente) {
        this.clavePaciente = clavePaciente;
    }

    public void setClaveAnalisis(String claveAnalisis) {
        this.claveAnalisis = claveAnalisis;
    }

    public void setClaveDoctor(String claveDoctor) {
        this.claveDoctor = claveDoctor;
    }
}
