package model;

import java.sql.*;
import java.util.ArrayList;

public class DBManager {
    private Connection  conexion;
    private Statement   statement;
    private ResultSet   tr;

    public DBManager(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost/hospital?user=marcelonicolasgomezrivera");
            System.out.println("Conexion exitosa");
        }
        catch(ClassNotFoundException cnfe){
            System.out.println("Error: "+cnfe);
        }
        catch(InstantiationException ie){
            System.out.println("Error: "+ ie);
        }
        catch(IllegalAccessException ie){
            System.out.println("Error: "+ ie);
        }
        catch(SQLException sqle){
            System.out.println("Error: "+sqle);
        }
    }

    public boolean capturarDoctor(Doctor doctor){
        String captura = "INSERT INTO Doctor VALUES("+doctor.toStringSQL()+");";
        System.out.println(doctor);
        System.out.println(captura);
        boolean resp;
        try{
            statement = conexion.createStatement();
            statement.executeUpdate(captura);
            statement.close();
            resp = true;
        }
        catch(SQLException sqle){
            resp = false;
            System.out.println(sqle);
        }
        return resp;
    }

    public Doctor[] consultarDoctores(){
        String consulta = "SELECT * FROM Doctor;";
        ArrayList<Doctor> resp = new ArrayList<Doctor>();
        try{
            statement = conexion.createStatement();
            tr = statement.executeQuery(consulta);
            while(tr.next()){
                Doctor doctor = new Doctor();
                doctor.setClave(tr.getString("clave"));
                doctor.setNombre(tr.getString("nombre"));
                doctor.setDireccion(tr.getString("direccion"));
                doctor.setEspecialidad(tr.getString("especialidad"));
                doctor.setTelefono(tr.getString("telefono"));
                doctor.setFoto(tr.getString("foto"));
                resp.add(doctor);
            }
        }
        catch(SQLException sqle){
            System.out.println(sqle);
        }
        return resp.toArray(new Doctor[resp.size()]);
    }

    public Doctor consultarDoctorClave(String clave){
        String consulta = "SELECT * FROM doctor WHERE clave = '"+clave+"';";
        Doctor doctor = null;
        try{
            statement = conexion.createStatement();
            tr = statement.executeQuery(consulta);
            while(tr.next()){
                doctor = new Doctor();
                doctor.setClave(tr.getString("clave"));
                doctor.setNombre(tr.getString("nombre"));
                doctor.setDireccion(tr.getString("direccion"));
                doctor.setEspecialidad(tr.getString("especialidad"));
                doctor.setTelefono(tr.getString("telefono"));
                doctor.setFoto(tr.getString("foto"));
            }
        }
        catch(SQLException sqle){
            System.out.println(sqle);
        }
        return doctor;
    }

    public Doctor[] consultarDoctoresEspecialidad(String especialidad){
        String consulta = "SELECT * FROM doctor WHERE especialidad = '"+especialidad+"';";
        ArrayList<Doctor> resp = new ArrayList<Doctor>();
        try{
            statement = conexion.createStatement();
            tr = statement.executeQuery(consulta);
            while(tr.next()){
                Doctor doctor = new Doctor();
                doctor.setClave(tr.getString("clave"));
                doctor.setNombre(tr.getString("nombre"));
                doctor.setDireccion(tr.getString("direccion"));
                doctor.setEspecialidad(tr.getString("especialidad"));
                doctor.setTelefono(tr.getString("telefono"));
                doctor.setFoto(tr.getString("foto"));
                resp.add(doctor);
            }
        }
        catch(SQLException sqle){
            System.out.println(sqle);
        }
        return resp.toArray(new Doctor[resp.size()]);
    }

    public boolean actualizarDoctor(Doctor doctor){
        String update = "UPDATE Doctor SET "+doctor.toStringSQLUpdate()+" WHERE clave = '"+doctor.getClave()+"';";
        boolean resp;
        try{
            statement = conexion.createStatement();
            statement.executeUpdate(update);
            statement.close();
            resp = true;
        }
        catch(SQLException sqle){
            resp = false;
            System.out.println(sqle);
        }
        return resp;
    }

    public boolean borrarDoctor(String clave){
        String delete = "DELETE FROM Doctor WHERE clave='"+clave+"';";
        String deleteDependencies = "DELETE FROM Atiende WHERE claveDoctor = '"+clave+"';";
        boolean resp;
        if(consultarDoctorClave(clave) != null){
            try{
                statement = conexion.createStatement();
                statement.executeUpdate(deleteDependencies);
                statement.executeUpdate(delete);
                statement.close();
                resp = true;
            }
            catch(SQLException sqle){
                resp = false;
                System.out.println("Error: "+sqle);
            }
        }
        else   resp = false;
        return resp;
    }

    public boolean capturarPaciente(Paciente paciente){
        String captura = "INSERT INTO Paciente VALUES("+paciente.toStringSQL()+");";
        boolean resp;
        try{
            statement = conexion.createStatement();
            statement.executeUpdate(captura);
            statement.close();
            resp = true;
        }
        catch(SQLException sqle){
            resp = false;
            System.out.println(sqle);
        }
        return resp;
    }

    public Paciente[] consultarPacientes() {
        String consulta = "SELECT * FROM Paciente;";
        ArrayList<Paciente> resp = new ArrayList<Paciente>();
        try {
            statement = conexion.createStatement();
            tr = statement.executeQuery(consulta);
            while(tr.next()) {
                Paciente paciente = new Paciente();
                paciente.setClave(tr.getString("clave"));
                paciente.setNombre(tr.getString("nombre"));
                paciente.setDireccion(tr.getString("direccion"));
                paciente.setTelefono(tr.getString("telefono"));
                paciente.setFoto(tr.getString("foto"));
                resp.add(paciente);
            }
        }
        catch(SQLException sqle){
            System.out.println(sqle);
        }
        return resp.toArray(new Paciente[0]);
    }

    public Paciente consultarPacienteClave(String clave) {
        String consulta   = "SELECT * FROM Paciente WHERE clave = '"+clave+"';";
        Paciente paciente = null;
        try{
            statement = conexion.createStatement();
            tr = statement.executeQuery(consulta);
            while(tr.next()){
                paciente = new Paciente();
                paciente.setClave(tr.getString("clave"));
                paciente.setNombre(tr.getString("nombre"));
                paciente.setDireccion(tr.getString("direccion"));
                paciente.setTelefono(tr.getString("telefono"));
                paciente.setFoto(tr.getString("foto"));
            }
        }
        catch(SQLException sqle) {
            System.out.println(sqle);
        }
        return paciente;
    }

    public boolean actualizarPaciente(Paciente paciente){
        String update = "UPDATE paciente SET "+paciente.toStringSQLUpdate()+" WHERE clave = '"+paciente.getClave()+"';";
        boolean resp;
        try{
            statement = conexion.createStatement();
            statement.executeUpdate(update);
            statement.close();
            resp = true;
        }
        catch(SQLException sqle){
            resp = false;
            System.out.println(sqle);
        }
        return resp;
    }

    public boolean borrarPaciente(String clave){
        String delete = "DELETE FROM Paciente WHERE clave='"+clave+"';";
        String deleteDependencies  = "DELETE FROM Atiende WHERE clavePaciente='"+clave+"';";
        String deleteDependencies1 = "DELETE FROM SeRealiza WHERE clavePaciente='"+clave+"';";
        boolean resp;
        if(consultarPacienteClave(clave) != null){
            try{
                statement = conexion.createStatement();
                statement.executeUpdate(deleteDependencies);
                statement.executeUpdate(deleteDependencies1);
                statement.executeUpdate(delete);
                statement.close();
                resp = true;
            }
            catch(SQLException sqle){
                resp = false;
                System.out.println(sqle);
            }
        }
        else   resp = false;
        return resp;
    }

    public boolean capturarAnalisis(AnalisisClinico analisis){
        String captura = "INSERT INTO AnalisisClinico VALUES("+analisis.toStringSQL()+");";
        boolean resp;
        try{
            statement = conexion.createStatement();
            statement.executeUpdate(captura);
            statement.close();
            resp = true;
        }
        catch(SQLException sqle){
            resp = false;
            System.out.println(sqle);
        }
        return resp;
    }

    public AnalisisClinico[] consultarAnalisis(){
        String consulta = "SELECT * FROM AnalisisClinico;";
        ArrayList<AnalisisClinico> resp = new ArrayList<AnalisisClinico>();
        try{
            AnalisisClinico analisis = new AnalisisClinico();
            statement = conexion.createStatement();
            tr = statement.executeQuery(consulta);
            while(tr.next()){
                analisis.setClave(tr.getString("clave"));
                analisis.setTipo(tr.getString("tipo"));
                analisis.setDescripcion(tr.getString("descripcion"));
                resp.add(analisis);
            }
        }
        catch(SQLException sqle){
            System.out.println(sqle);
        }
        return resp.toArray(new AnalisisClinico[resp.size()]);
    }

    public AnalisisClinico consultarAnalisisClave(String clave){
        String consulta = "SELECT * FROM AnalisisClinico WHERE clave = '"+clave+"';";
        AnalisisClinico analisis = null;
        try{
            analisis = new AnalisisClinico();
            statement = conexion.createStatement();
            tr = statement.executeQuery(consulta);
            while(tr.next()){
                analisis.setClave(tr.getString("clave"));
                analisis.setTipo(tr.getString("tipo"));
                analisis.setDescripcion(tr.getString("descripcion"));
            }
        }
        catch(SQLException sqle){
            System.out.println(sqle);
        }
        return analisis;
    }

    public AnalisisClinico[] consultarAnalisisTipo(String tipo){
        String consulta = "SELECT * FROM analisisClinico WHERE tipo= '"+tipo+"';";
        ArrayList<AnalisisClinico> resp = new ArrayList<AnalisisClinico>();
        try{
            statement = conexion.createStatement();
            tr = statement.executeQuery(consulta);
            while(tr.next()){
                AnalisisClinico analisis = new AnalisisClinico();
                analisis.setClave(tr.getString("clave"));
                analisis.setTipo(tr.getString("tipo"));
                analisis.setDescripcion(tr.getString("descripcion"));
                resp.add(analisis);
            }
        }
        catch(SQLException sqle){
            System.out.println(sqle);

        }
        return resp.toArray(new AnalisisClinico[resp.size()]);
    }

    public boolean actualizarAnalisis(AnalisisClinico analisis){
        String update = "UPDATE AnalisisClinico SET "+analisis.toStringSQLUpdate()+" WHERE clave = '"+analisis.getClave()+"';";
        boolean resp;
        try{
            statement = conexion.createStatement();
            statement.executeUpdate(update);
            statement.close();
            resp = true;
        }
        catch(SQLException sqle){
            resp = false;
            System.out.println(sqle);
        }
        return resp;
    }

    public boolean borrarAnalisis(String clave){
        String delete 			  = "DELETE FROM AnalisisClinico WHERE clave='"+clave+"';";
        String deleteDependencies = "DELETE FROM SeRealiza WHERE claveAnalisis='"+clave+"';";
        boolean resp;
        if(consultarAnalisisClave(clave) != null){
            try{
                statement = conexion.createStatement();
                statement.executeUpdate(deleteDependencies);
                statement.executeUpdate(delete);
                statement.close();
                resp = true;
            }
            catch(SQLException sqle){
                resp = false;
                System.out.println(sqle);
            }
        }
        else
            resp = false;
        return resp;
    }

    public boolean capturarSeRealiza(SeRealiza seRealiza){
        String captura = "INSERT INTO SeRealiza VALUES("+seRealiza.toStringSQL()+");";
        System.out.println(seRealiza);
        System.out.println(captura);
        boolean resp;
        try{
            statement = conexion.createStatement();
            statement.executeUpdate(captura);
            statement.close();
            resp = true;
        }
        catch(SQLException sqle){
            resp = false;
            System.out.println(sqle);
        }
        return resp;
    }

    public SeRealiza[] consultarSeRealiza(){
        String consulta = "SELECT * FROM SeRealiza;";
        ArrayList<SeRealiza> resp = new ArrayList<SeRealiza>();
        try{
            statement = conexion.createStatement();
            tr = statement.executeQuery(consulta);
            while(tr.next()){
                SeRealiza seRealiza = new SeRealiza();
                seRealiza.setClavePaciente(tr.getString("clavePaciente"));
                seRealiza.setClaveAnalisis(tr.getString("claveAnalisis"));
                seRealiza.setFechaAplic(tr.getString("fechaAplic"));
                seRealiza.setFechaEntrega(tr.getString("fechaEntrega"));
                seRealiza.setFotoPaciente(tr.getString("fotoPaciente"));
                resp.add(seRealiza);
            }
        }
        catch(SQLException sqle){
            System.out.println(sqle);
        }
        return resp.toArray(new SeRealiza[resp.size()]);
    }

    public boolean capturarAtiende(Atiende atiende){
        String captura = "INSERT INTO Atiende VALUES("+atiende.toStringSQL()+");";
        System.out.println(atiende);
        System.out.println(captura);
        boolean resp;
        try{
            statement = conexion.createStatement();
            statement.executeUpdate(captura);
            statement.close();
            resp = true;
        }
        catch(SQLException sqle){
            resp = false;
            System.out.println(sqle);
        }
        return resp;
    }

    public Atiende[] consultarAtiende(){
        String consulta = "SELECT * FROM Atiende;";
        ArrayList<Atiende> resp = new ArrayList<Atiende>();
        try{
            statement = conexion.createStatement();
            tr = statement.executeQuery(consulta);
            while(tr.next()){
                Atiende atiende = new Atiende();
                atiende.setClaveDoctor(tr.getString("claveDoctor"));
                atiende.setClavePaciente(tr.getString("clavePaciente"));
                atiende.setFecha(tr.getString("fecha"));
                atiende.setDiagnostico(tr.getString("diagnostico"));
                atiende.setTratamiento(tr.getString("tratamiento"));
                atiende.setFotoPaciente(tr.getString("fotoPaciente"));
                atiende.setFotoDoctor(tr.getString("fotoDoctor"));
                resp.add(atiende);
            }
        }
        catch(SQLException sqle){
            System.out.println(sqle);
        }
        return resp.toArray(new Atiende[resp.size()]);
    }

    public ReporteDoctoresPaciente[] generarReporteDoctoresPaciente(String clavePaciente){
        String consulta = "SELECT Paciente.foto,Paciente.clave,Paciente.nombre,Doctor.foto,Doctor.clave,Doctor.nombre,Atiende.tratamiento,Atiende.diagnostico,Atiende.fecha FROM (Paciente INNER JOIN Atiende ON Paciente.clave='"+ clavePaciente +"' AND Paciente.clave=Atiende.clavePaciente) INNER JOIN Doctor ON Doctor.clave = Atiende.claveDoctor;";
        ArrayList<ReporteDoctoresPaciente> resp = new ArrayList<ReporteDoctoresPaciente>();
        try{
            statement = conexion.createStatement();
            tr = statement.executeQuery(consulta);
            while(tr.next()){
                ReporteDoctoresPaciente reporte = new ReporteDoctoresPaciente();
                reporte.setClaveDoctor(tr.getString("Doctor.clave"));
                reporte.setNombreDoctor(tr.getString("Doctor.nombre"));
                reporte.setClavePaciente(tr.getString("Paciente.clave"));
                reporte.setNombrePaciente(tr.getString("Paciente.nombre"));
                reporte.setFecha(tr.getString("fecha"));
                reporte.setDiagnostico(tr.getString("diagnostico"));
                reporte.setTratamiento(tr.getString("tratamiento"));
                reporte.setFotoDoctor(tr.getString("Doctor.foto"));
                reporte.setFotoPaciente(tr.getString("Paciente.foto"));
                resp.add(reporte);
            }
        }
        catch(SQLException sqle){
            System.out.println(sqle);
        }
        return resp.toArray(new ReporteDoctoresPaciente[resp.size()]);
    }

    public ReportePacientesDoctor[] generarReportePacientesDoctor(String claveDoctor){
        String consulta = "SELECT Paciente.foto,Paciente.clave," +
                          "Paciente.nombre,Doctor.foto,Doctor.clave," +
                          "Doctor.nombre,Atiende.tratamiento,Atiende.diagnostico," +
                          "Atiende.fecha " +
                          "FROM (Doctor INNER JOIN " +
                          "Atiende ON Doctor.clave='"+ claveDoctor +
                          "' AND Doctor.clave=Atiende.claveDoctor) " +
                          "INNER JOIN Paciente ON " +
                          "Paciente.clave = Atiende.clavePaciente;";
        ArrayList<ReportePacientesDoctor> resp = new ArrayList<ReportePacientesDoctor>();
        try{
            statement = conexion.createStatement();
            tr = statement.executeQuery(consulta);
            while(tr.next()){
                ReportePacientesDoctor reporte = new ReportePacientesDoctor();
                reporte.setClaveDoctor(tr.getString("Doctor.clave"));
                reporte.setNombreDoctor(tr.getString("Doctor.nombre"));
                reporte.setClavePaciente(tr.getString("Paciente.clave"));
                reporte.setNombrePaciente(tr.getString("Paciente.nombre"));
                reporte.setFecha(tr.getString("fecha"));
                reporte.setDiagnostico(tr.getString("diagnostico"));
                reporte.setTratamiento(tr.getString("tratamiento"));
                reporte.setFotoDoctor(tr.getString("Doctor.foto"));
                reporte.setFotoPaciente(tr.getString("Paciente.foto"));
                resp.add(reporte);
            }
        }
        catch(SQLException sqle){
            System.out.println(sqle);
        }
        return resp.toArray(new ReportePacientesDoctor[resp.size()]);
    }

    public ReporteAnalisisPaciente[] generarReporteAnalisisPaciente(String clavePaciente){
        String consulta = "SELECT Paciente.foto,Paciente.clave,Paciente.nombre,AnalisisClinico.clave,AnalisisClinico.tipo,AnalisisClinico.descripcion,SeRealiza.fechaAplic,SeRealiza.fechaEntrega FROM (Paciente INNER JOIN SeRealiza ON Paciente.clave='"+ clavePaciente +"' AND Paciente.clave=SeRealiza.clavePaciente) INNER JOIN AnalisisClinico ON AnalisisClinico.clave = SeRealiza.claveAnalisis;";
        System.out.println(consulta);
        ArrayList<ReporteAnalisisPaciente> resp = new ArrayList<ReporteAnalisisPaciente>();
        try{
            statement = conexion.createStatement();
            tr = statement.executeQuery(consulta);
            while(tr.next()){
                ReporteAnalisisPaciente reporte = new ReporteAnalisisPaciente();
                reporte.setClaveAnalisis(tr.getString("AnalisisClinico.clave"));
                reporte.setTipo(tr.getString("AnalisisClinico.tipo"));
                reporte.setClavePaciente(tr.getString("Paciente.clave"));
                reporte.setNombrePaciente(tr.getString("Paciente.nombre"));
                reporte.setFechaAplic(tr.getString("SeRealiza.fechaAplic"));
                reporte.setFechaEntrega(tr.getString("SeRealiza.fechaEntrega"));
                reporte.setDescripcion(tr.getString("AnalisisClinico.descripcion"));
                reporte.setFotoPaciente(tr.getString("Paciente.foto"));
                resp.add(reporte);
            }
        }
        catch(SQLException sqle){
            System.out.println(sqle);
        }
        return resp.toArray(new ReporteAnalisisPaciente[resp.size()]);
    }

    public ReportePacientesAnalisis[] generarReportePacientesAnalisis(String claveAnalisis){
        String consulta = "SELECT Paciente.foto,Paciente.clave,Paciente.nombre," +
                          "AnalisisClinico.clave,AnalisisClinico.tipo," +
                          "AnalisisClinico.descripcion,SeRealiza.fechaAplic," +
                          "SeRealiza.fechaEntrega " +
                          "FROM (AnalisisClinico INNER JOIN SeRealiza " +
                          "ON AnalisisClinico.clave='"+ claveAnalisis +"' " +
                          "AND AnalisisClinico.clave=SeRealiza.claveAnalisis) " +
                          "INNER JOIN Paciente " +
                          "ON Paciente.clave = SeRealiza.clavePaciente;";
        ArrayList<ReportePacientesAnalisis> resp = new ArrayList<ReportePacientesAnalisis>();
        try{
            statement = conexion.createStatement();
            tr = statement.executeQuery(consulta);
            while(tr.next()){
                ReportePacientesAnalisis reporte = new ReportePacientesAnalisis();
                reporte.setClaveAnalisis(tr.getString("AnalisisClinico.clave"));
                reporte.setTipo(tr.getString("AnalisisClinico.tipo"));
                reporte.setClavePaciente(tr.getString("Paciente.clave"));
                reporte.setNombrePaciente(tr.getString("Paciente.nombre"));
                reporte.setFechaAplic(tr.getString("SeRealiza.fechaAplic"));
                reporte.setFechaEntrega(tr.getString("SeRealiza.fechaEntrega"));
                reporte.setDescripcion(tr.getString("AnalisisClinico.descripcion"));
                reporte.setFotoPaciente(tr.getString("Paciente.foto"));
                resp.add(reporte);
            }
        }
        catch(SQLException sqle){
            System.out.println(sqle);
        }
        return resp.toArray(new ReportePacientesAnalisis[resp.size()]);
    }
}
