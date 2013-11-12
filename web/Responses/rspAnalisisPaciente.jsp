<%@ page import="thrift.ReporteAnalisisPaciente" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <!-- Linking Bootstrap CSS  -->
    <link rel="stylesheet" href="../bootstrap/css/bootstrap.css"/>
</head>
<body style="background: #f5f5f5;">
<h4>An&aacute;lisis clinicos</h4>
<%
    //DBManager dbman = new DBManager();
    //thrift.Doctor[] arrayDoctor = dbman.consultarDoctores();
    ReporteAnalisisPaciente[] arrayAnalisisPaciente = (ReporteAnalisisPaciente[])request.getAttribute("reportesAnalisisPaciente");

    //Boolean state = (Boolean)request.getAttribute("ans");

    if(arrayAnalisisPaciente != null){
%>
<table class="table table-striped">
    <tr>
        <th>Clave An&aacute;lisis</th>
        <th>Tipo</th>
        <th>Descripci&oacute;n</th>
        <th>Fecha de aplicacion</th>
        <th>Fecha de entrega</th>
    </tr>
    <%
        for(int i=0; i<arrayAnalisisPaciente.length; i++){
    %>
    <tr>
        <td><%=arrayAnalisisPaciente[i].getClaveAnalisis()%></td>
        <td><%=arrayAnalisisPaciente[i].getTipo()%></td>
        <td><%=arrayAnalisisPaciente[i].getDescripcion()%></td>
        <td><%=arrayAnalisisPaciente[i].getFechaAplic()%></td>
        <td><%=arrayAnalisisPaciente[i].getFechaEntrega()%></td>

    </tr>
    <%
        }
    %>
</table>

<%  } else { %>
<h2 style="text-align: center;">No existen an&aacutelisis</h2>
<%  } %>

</body>
</html>