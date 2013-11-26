package thrift;
import org.apache.thrift.TException;

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
        }
        catch (TException e){
            System.out.println("Thrift Server exception: " + e.getMessage());
        }
        finally {
            si.disconnect();
        }
        return ans;
    }

    public Doctor[] consultarDoctores(){
        ArrayList<Doctor> ans = null;
        try{
            si.connect();
            client = si.getClient();
            ans = new ArrayList<Doctor>(client.consultarDoctores());
        }
        catch (TException e){
            System.out.println("Thrift Server exception: " + e.getMessage());
        }
        finally {
            si.disconnect();
        }
        return ans.toArray(new Doctor[ans.size()]);
    }

    public Doctor consultarDoctorClave(String clave){
        Doctor ans = null;
        try{
            si.connect();
            client = si.getClient();
            ans = client.consultarDoctorClave(clave);
        }
        catch (TException e){
            System.out.println("Thrift Server exception: " + e.getMessage());
        }
        finally {
            si.disconnect();
        }
        return ans;
    }

    public Doctor[] consultarDoctoresEspecialidad(String especialidad){
        ArrayList<Doctor> ans = null;
        try{
            si.connect();
            client = si.getClient();
            ans = new ArrayList<Doctor>(client.consultarDoctoresEspecialidad(especialidad));
        }
        catch (TException e){
            System.out.println("Thrift Server exception: " + e.getMessage());
        }
        finally {
            si.disconnect();
        }
        return ans.toArray(new Doctor[ans.size()]);
    }

    public boolean actualizarDoctor(Doctor doctor){
        boolean ans = false;
        try{
            si.connect();
            client = si.getClient();
            ans = client.actualizarDoctor(doctor);
        }
        catch (TException e){
            System.out.println("Thrift Server exception: " + e.getMessage());
        }
        finally {
            si.disconnect();
        }
        return ans;
    }

    public boolean borrarDoctor(String clave){
        boolean ans = false;
        try{
            si.connect();
            client = si.getClient();
            ans = client.borrarDoctor(clave);
        }
        catch (TException e){
            System.out.println("Thrift Server exception: " + e.getMessage());
        }
        finally {
            si.disconnect();
        }
        return ans;
    }

    public boolean capturarPaciente(Paciente paciente){
        boolean ans = false;
        try{
            si.connect();
            client = si.getClient();
            ans = client.capturarPaciente(paciente);
        }
        catch (TException e){
            System.out.println("Thrift Server exception: " + e.getMessage());
        }
        finally {
            si.disconnect();
        }
        return ans;
    }

    public Paciente[] consultarPacientes() {
        ArrayList<Paciente> ans = null;
        try{
            si.connect();
            client = si.getClient();
            ans = new ArrayList<Paciente>(client.consultarPacientes());
        }
        catch (TException e){
            System.out.println("Thrift Server exception: " + e.getMessage());
        }
        finally {
            si.disconnect();
        }
        return ans.toArray(new Paciente[ans.size()]);
    }

    public Paciente consultarPacienteClave(String clave) {
        Paciente ans = null;
        try{
            si.connect();
            client = si.getClient();
            ans = client.consultarPacienteClave(clave);
        }
        catch (TException e){
            System.out.println("Thrift Server exception: " + e.getMessage());
        }
        finally {
            si.disconnect();
        }
        return ans;
    }

    public boolean actualizarPaciente(Paciente paciente){
        boolean ans = false;
        try{
            si.connect();
            client = si.getClient();
            ans = client.actualizarPaciente(paciente);
        }
        catch (TException e){
            System.out.println("Thrift Server exception: " + e.getMessage());
        }
        finally {
            si.disconnect();
        }
        return ans;
    }

    public boolean borrarPaciente(String clave){
        boolean ans = false;
        try{
            si.connect();
            client = si.getClient();
            ans = client.borrarPaciente(clave);
        }
        catch (TException e){
            System.out.println("Thrift Server exception: " + e.getMessage());
        }
        finally {
            si.disconnect();
        }
        return ans;
    }

    public boolean capturarAnalisis(AnalisisClinico analisis){
        boolean ans = false;
        try{
            si.connect();
            client = si.getClient();
            ans = client.capturarAnalisis(analisis);
        }
        catch (TException e){
            System.out.println("Thrift Server exception: " + e.getMessage());
        }
        finally {
            si.disconnect();
        }
        return ans;
    }

    public AnalisisClinico[] consultarAnalisis(){
        ArrayList<AnalisisClinico> ans = null;
        try{
            si.connect();
            client = si.getClient();
            ans = new ArrayList<AnalisisClinico>(client.consultarAnalisis());
        }
        catch (TException e){
            System.out.println("Thrift Server exception: " + e.getMessage());
        }
        finally {
            si.disconnect();
        }
        return ans.toArray(new AnalisisClinico[ans.size()]);
    }

    public AnalisisClinico consultarAnalisisClave(String clave){
        AnalisisClinico ans = null;
        try{
            si.connect();
            client = si.getClient();
            ans = client.consultarAnalisisClave(clave);
        }
        catch (TException e){
            System.out.println("Thrift Server exception: " + e.getMessage());
        }
        finally {
            si.disconnect();
        }
        return ans;
    }

    public AnalisisClinico[] consultarAnalisisTipo(String tipo){
        ArrayList<AnalisisClinico> ans = null;
        try{
            si.connect();
            client = si.getClient();
            ans = new ArrayList(client.consultarAnalisisTipo(tipo));
        }
        catch (TException e){
            System.out.println("Thrift Server exception: " + e.getMessage());
        }
        finally {
            si.disconnect();
        }
        return ans.toArray(new AnalisisClinico[ans.size()]);
    }

    public boolean actualizarAnalisis(AnalisisClinico analisis){
        boolean ans = false;
        try{
            si.connect();
            client = si.getClient();
            ans = client.actualizarAnalisis(analisis);
        }
        catch (TException e){
            System.out.println("Thrift Server exception: " + e.getMessage());
        }
        finally {
            si.disconnect();
        }
        return ans;
    }

    public boolean borrarAnalisis(String clave){
        boolean ans = false;
        try{
            si.connect();
            client = si.getClient();
            ans = client.borrarAnalisis(clave);
        }
        catch (TException e){
            System.out.println("Thrift Server exception: " + e.getMessage());
        }
        finally {
            si.disconnect();
        }
        return ans;
    }

    public boolean capturarSeRealiza(SeRealiza seRealiza){
        boolean ans = false;
        try{
            si.connect();
            client = si.getClient();
            ans = client.capturarSeRealiza(seRealiza);
        }
        catch (TException e){
            System.out.println("Thrift Server exception: " + e.getMessage());
        }
        finally {
            si.disconnect();
        }
        return ans;
    }

    public SeRealiza[] consultarSeRealiza(){
        ArrayList<SeRealiza> ans = null;
        try{
            si.connect();
            client = si.getClient();
            ans = new ArrayList<SeRealiza>(client.consultarSeRealiza());
        }
        catch (TException e){
            System.out.println("Thrift Server exception: " + e.getMessage());
        }
        finally {
            si.disconnect();
        }
        return ans.toArray(new SeRealiza[ans.size()]);
    }

    public String[] consultarEspecialidades(){
        ArrayList<String> ans = null;
        try{
            si.connect();
            client = si.getClient();
            ans = new ArrayList<String>(client.consultarEspecialidades());
        }
        catch (TException e){
            System.out.print("Thrift server exception.");
        }
        finally{
            si.disconnect();
        }
        return ans.toArray(new String[ans.size()]);             
    }

    public boolean capturarAtiende(Atiende atiende){
        boolean ans = false;
        try{
            si.connect();
            client = si.getClient();
            ans = client.capturarAtiende(atiende);
        }
        catch (TException e){
            System.out.println("Thrift Server exception: " + e.getMessage());
        }
        finally {
            si.disconnect();
        }
        return ans;
    }

    public Atiende[] consultarAtiende(){
        ArrayList<Atiende> ans = null;
        try{
            si.connect();
            client = si.getClient();
            ans = new ArrayList<Atiende>(client.consultarAtiende());
        }
        catch (TException e){
            System.out.println("Thrift Server exception: " + e.getMessage());
        }
        finally {
            si.disconnect();
        }
        return ans.toArray(new Atiende[ans.size()]);
    }

    public ReporteDoctoresPaciente[] generarReporteDoctoresPaciente(String clavePaciente){
        ArrayList<ReporteDoctoresPaciente> ans = null;
        try{
            si.connect();
            client = si.getClient();
            ans = new ArrayList<ReporteDoctoresPaciente>(client.generarReporteDoctoresPaciente(clavePaciente));
        }
        catch (TException e){
            System.out.println("Thrift Server exception: " + e.getMessage());
        }
        finally {
            si.disconnect();
        }
        return ans.toArray(new ReporteDoctoresPaciente[ans.size()]);
    }

    public ReportePacientesDoctor[] generarReportePacientesDoctor(String claveDoctor){
        ArrayList<ReportePacientesDoctor> ans = null;
        try{
            si.connect();
            client = si.getClient();
            ans = new ArrayList<ReportePacientesDoctor>(client.generarReportePacientesDoctor(claveDoctor));
        }
        catch (TException e){
            System.out.println("Thrift Server exception: " + e.getMessage());
        }
        finally {
            si.disconnect();
        }
        return ans.toArray(new ReportePacientesDoctor[ans.size()]);
    }

    public ReporteAnalisisPaciente[] generarReporteAnalisisPaciente(String clavePaciente){
        ArrayList<ReporteAnalisisPaciente> ans = null;
        try{
            si.connect();
            client = si.getClient();
            ans = new ArrayList<ReporteAnalisisPaciente>(client.generarReporteAnalisisPaciente(clavePaciente));
        }
        catch (TException e){
            System.out.println("Thrift Server exception: " + e.getMessage());
        }
        finally {
            si.disconnect();
        }
        return ans.toArray(new ReporteAnalisisPaciente[ans.size()]);
    }

    public ReportePacientesAnalisis[] generarReportePacientesAnalisis(String claveAnalisis){
        ArrayList<ReportePacientesAnalisis> ans = null;
        try{
            si.connect();
            client = si.getClient();
            ans = new ArrayList<ReportePacientesAnalisis>(client.generarReportePacientesAnalisis(claveAnalisis));
        }
        catch (TException e){
            System.out.println("Thrift Server exception: " + e.getMessage());
        }
        finally {
            si.disconnect();
        }
        return ans.toArray(new ReportePacientesAnalisis[ans.size()]);
    }
}