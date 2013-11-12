package thrift;
import org.apache.thrift.TException;

import java.sql.*;
import java.util.ArrayList;

public class DBManager {
    private Actions.Client client;
    private ServerInterface si;

    public DBManager(){
        si = new ServerInterface();
    }

    public boolean capturarDoctor(Doctor doctor){
        boolean ans = false;
        try{
            si.connect();
            client = si.getClient();
            ans = client.capturarDoctor(doctor);
            si.disconnect();
        }
        catch (TException e){
            System.out.print("Thrift Server exception.");
        }
        return ans;
    }

    public Doctor[] consultarDoctores(){
        ArrayList<Doctor> ans = null;
        try{
            si.connect();
            client = si.getClient();
            ans = new ArrayList<Doctor>(client.consultarDoctores());
            si.disconnect();
        }
        catch (TException e){
            System.out.print("Thrift Server exception.");
        }
        return ans.toArray(new Doctor[ans.size()]);
    }

    public Doctor consultarDoctorClave(String clave){
        Doctor ans = null;
        try{
            si.connect();
            client = si.getClient();
            ans = client.consultarDoctorClave(clave);
            si.disconnect();
        }
        catch (TException e){
            System.out.print("Thrift Server exception.");
        }
        return ans;
    }

    public Doctor[] consultarDoctoresEspecialidad(String especialidad){
        ArrayList<Doctor> ans = null;
        try{
            si.connect();
            client = si.getClient();
            ans = new ArrayList<Doctor>(client.consultarDoctoresEspecialidad(especialidad));
            si.disconnect();
        }
        catch (TException e){
            System.out.print("Thrift Server exception.");
        }
        return ans.toArray(new Doctor[ans.size()]);
    }

    public boolean actualizarDoctor(Doctor doctor){
        boolean ans = false;
        try{
            si.connect();
            client = si.getClient();
            ans = client.actualizarDoctor(doctor);
            si.disconnect();
        }
        catch (TException e){
            System.out.print("Thrift Server exception.");
        }
        return ans;
    }

    public boolean borrarDoctor(String clave){
        boolean ans = false;
        try{
            si.connect();
            client = si.getClient();
            client.borrarDoctor(clave);
            si.disconnect();
        }
        catch (TException e){
            System.out.print("Thrift Server exception.");
        }
        return ans;
    }

    public boolean capturarPaciente(Paciente paciente){
        boolean ans = false;
        try{
            si.connect();
            client = si.getClient();
            client.capturarPaciente(paciente);
            si.disconnect();
        }
        catch (TException e){
            System.out.print("Thrift Server exception.");
        }
        return ans;
    }

    public Paciente[] consultarPacientes() {
        ArrayList<Paciente> ans = null;
        try{
            si.connect();
            client = si.getClient();
            ans = new ArrayList<Paciente>(client.consultarPacientes());
            si.disconnect();
        }
        catch (TException e){
            System.out.print("Thrift Server exception.");
        }
        return ans.toArray(new Paciente[ans.size()]);
    }

    public Paciente consultarPacienteClave(String clave) {
        Paciente ans = null;
        try{
            si.connect();
            client = si.getClient();
            ans = client.consultarPacienteClave(clave);
            si.disconnect();
        }
        catch (TException e){
            System.out.print("Thrift Server exception.");
        }
        return ans;
    }

    public boolean actualizarPaciente(Paciente paciente){
        boolean ans = false;
        try{
            si.connect();
            client = si.getClient();
            ans = client.actualizarPaciente(paciente);
            si.disconnect();
        }
        catch (TException e){
            System.out.print("Thrift Server exception.");
        }
        return ans;
    }

    public boolean borrarPaciente(String clave){
        boolean ans = false;
        try{
            si.connect();
            client = si.getClient();
            ans = client.borrarPaciente(clave);
            si.disconnect();
        }
        catch (TException e){
            System.out.print("Thrift Server exception.");
        }
        return ans;
    }

    public boolean capturarAnalisis(AnalisisClinico analisis){
        boolean ans = false;
        try{
            si.connect();
            client = si.getClient();
            ans = client.capturarAnalisis(analisis);
            si.disconnect();
        }
        catch (TException e){
            System.out.print("Thrift Server exception.");
        }
        return ans;
    }

    public AnalisisClinico[] consultarAnalisis(){
        ArrayList<AnalisisClinico> ans = null;
        try{
            si.connect();
            client = si.getClient();
            ans = new ArrayList<AnalisisClinico>(client.consultarAnalisis());
            si.disconnect();
        }
        catch (TException e){
            System.out.print("Thrift Server exception.");
        }
        return ans.toArray(new AnalisisClinico[ans.size()]);
    }

    public AnalisisClinico consultarAnalisisClave(String clave){
        AnalisisClinico ans = null;
        try{
            si.connect();
            client = si.getClient();
            ans = client.consultarAnalisisClave(clave);
            si.disconnect();
        }
        catch (TException e){
            System.out.print("Thrift Server exception.");
        }
        return ans;
    }

    public AnalisisClinico[] consultarAnalisisTipo(String tipo){
        ArrayList<AnalisisClinico> ans = null;
        try{
            si.connect();
            client = si.getClient();
            ans = new ArrayList(client.consultarAnalisisTipo(tipo));
            si.disconnect();
        }
        catch (TException e){
            System.out.print("Thrift Server exception.");
        }
        return ans.toArray(new AnalisisClinico[ans.size()]);
    }

    public boolean actualizarAnalisis(AnalisisClinico analisis){
        boolean ans = false;
        try{
            si.connect();
            client = si.getClient();
            ans = client.actualizarAnalisis(analisis);
            si.disconnect();
        }
        catch (TException e){
            System.out.print("Thrift Server exception.");
        }
        return ans;
    }

    public boolean borrarAnalisis(String clave){
        boolean ans = false;
        try{
            si.connect();
            client = si.getClient();
            ans = client.borrarAnalisis(clave);
            si.disconnect();
        }
        catch (TException e){
            System.out.print("Thrift Server exception.");
        }
        return ans;
    }

    public boolean capturarSeRealiza(SeRealiza seRealiza){
        boolean ans = false;
        try{
            si.connect();
            client = si.getClient();
            ans = client.capturarSeRealiza(seRealiza);
            si.disconnect();
        }
        catch (TException e){
            System.out.print("Thrift Server exception.");
        }
        return ans;
    }

    public SeRealiza[] consultarSeRealiza(){
        ArrayList<SeRealiza> ans = null;
        try{
            si.connect();
            client = si.getClient();
            ans = new ArrayList<SeRealiza>(client.consultarSeRealiza());
            si.disconnect();
        }
        catch (TException e){
            System.out.print("Thrift Server exception.");
        }
        return ans.toArray(new SeRealiza[ans.size()]);
    }

    public boolean capturarAtiende(Atiende atiende){
        boolean ans = false;
        try{
            si.connect();
            client = si.getClient();
            ans = client.capturarAtiende(atiende);
            si.disconnect();
        }
        catch (TException e){
            System.out.print("Thrift Server exception.");
        }
        return ans;
    }

    public Atiende[] consultarAtiende(){
        ArrayList<Atiende> ans = null;
        try{
            si.connect();
            client = si.getClient();
            ans = new ArrayList<Atiende>(client.consultarAtiende());
            si.disconnect();
        }
        catch (TException e){
            System.out.print("Thrift Server exception.");
        }
        return ans.toArray(new Atiende[ans.size()]);
    }

    public ReporteDoctoresPaciente[] generarReporteDoctoresPaciente(String clavePaciente){
        ArrayList<ReporteDoctoresPaciente> ans = null;
        try{
            si.connect();
            client = si.getClient();
            ans = new ArrayList<ReporteDoctoresPaciente>(client.generarReporteDoctoresPaciente(clavePaciente));
            si.disconnect();
        }
        catch (TException e){
            System.out.print("Thrift Server exception.");
        }
        return ans.toArray(new ReporteDoctoresPaciente[ans.size()]);
    }

    public ReportePacientesDoctor[] generarReportePacientesDoctor(String claveDoctor){
        ArrayList<ReportePacientesDoctor> ans = null;
        try{
            si.connect();
            client = si.getClient();
            ans = new ArrayList<ReportePacientesDoctor>(client.generarReportePacientesDoctor(claveDoctor));
            si.disconnect();
        }
        catch (TException e){
            System.out.print("Thrift Server exception.");
        }
        return ans.toArray(new ReportePacientesDoctor[ans.size()]);
    }

    public ReporteAnalisisPaciente[] generarReporteAnalisisPaciente(String clavePaciente){
        ArrayList<ReporteAnalisisPaciente> ans = null;
        try{
            si.connect();
            client = si.getClient();
            ans = new ArrayList<ReporteAnalisisPaciente>(client.generarReporteAnalisisPaciente(clavePaciente));
            si.disconnect();
        }
        catch (TException e){
            System.out.print("Thrift Server exception.");
        }
        return ans.toArray(new ReporteAnalisisPaciente[ans.size()]);
    }

    public ReportePacientesAnalisis[] generarReportePacientesAnalisis(String claveAnalisis){
        ArrayList<ReportePacientesAnalisis> ans = null;
        try{
            si.connect();
            client = si.getClient();
            ans = new ArrayList<ReportePacientesAnalisis>(client.generarReportePacientesAnalisis(claveAnalisis));
            si.disconnect();
        }
        catch (TException e){
            System.out.print("Thrift Server exception.");
        }
        return ans.toArray(new ReportePacientesAnalisis[ans.size()]);
    }
}