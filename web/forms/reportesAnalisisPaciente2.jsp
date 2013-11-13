<%@ page import="thrift.ReporteAnalisisPaciente" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <!-- Linking Bootstrap CSS  -->
    <link rel="stylesheet" href="../bootstrap/css/bootstrap.css"/>
</head>
<body style="background: #f5f5f5;">
<h4>An&aacute;lisis clinicos de un paciente</h4>
<%
    //DBManager dbman = new DBManager();
    //thrift.Doctor[] arrayDoctor = dbman.consultarDoctores();
    ReporteAnalisisPaciente[] arrayAnalisisPaciente = (ReporteAnalisisPaciente[])request.getAttribute("reportesAnalisisPaciente");

    //Boolean state = (Boolean)request.getAttribute("ans");

    if(arrayAnalisisPaciente != null){
%>
<table class="table table-striped">

    <%

        for(int i=0; i<arrayAnalisisPaciente.length; i++){
            System.out.println(arrayAnalisisPaciente[i].getClaveAnalisis());
    %>
    <%
        }
    %>
</table>

<%  } else { %>
<h2 style="text-align: center;">No existen an&aacutelisis</h2>
<%  } %>

</body>
</html>