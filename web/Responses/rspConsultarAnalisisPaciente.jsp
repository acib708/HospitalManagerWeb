<%@ page import="thrift.SeRealiza" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <!-- Linking Bootstrap CSS  -->
    <link rel="stylesheet" href="../bootstrap/css/bootstrap.css"/>
</head>
<body style="background: #f5f5f5;">
<h3>An&aacute;lisis de Pacientes</h3>
<%
    //DBManager dbman = new DBManager();
    //thrift.Doctor[] arrayDoctor = dbman.consultarDoctores();
    SeRealiza[] arraySeRealiza = (SeRealiza[])request.getAttribute("seRealiza");
    HashMap<String,String> nombresPacientes = (HashMap<String,String>)request.getAttribute("hashPacientes");
    HashMap<String,String> tipoAnalisis     = (HashMap<String,String>)request.getAttribute("hashAnalisis");

    //Boolean state = (Boolean)request.getAttribute("ans");

    if(arraySeRealiza != null){
%>
<ul class="thumbnails">
    <%
        for (SeRealiza theArraySeRealiza : arraySeRealiza){
        //for(int i=0; i<arraySeRealiza.length; i++){
    %>
    <li class="span3" >
        <div class="thumbnail" >
            <img class="img-polaroid" style="width: 170px; height: 170px;" src="../img/<%=theArraySeRealiza.getClavePaciente()%>.jpg" alt="">
            <h4><%= nombresPacientes.get(theArraySeRealiza.getClavePaciente())%></h4>
            <h6><%= tipoAnalisis.get(theArraySeRealiza.getClaveAnalisis())%></h6>
            <h6>Fecha Aplicaci&oacute;n: <%=theArraySeRealiza.getFechaAplic()%></h6>
            <h6>Fecha de Entrega: <%=theArraySeRealiza.getFechaEntrega()%></h6>
        </div>
    </li>
    <%
        }
    %>
</ul>

<%  } else { %>
<h2 style="text-align: center;">La asignacion no existe.</h2>
<%  } %>

</body>
</html>