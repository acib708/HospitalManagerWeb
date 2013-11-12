<%@ page import="model.AnalisisClinico" %>
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
    //Doctor[] arrayDoctor = dbman.consultarDoctores();
    AnalisisClinico[] arrayAnalisis = (AnalisisClinico[])request.getAttribute("analisis");

    //Boolean state = (Boolean)request.getAttribute("ans");

    if(arrayAnalisis != null){
%>
<table class="table table-striped">
    <tr>
        <th>Clave An&aacute;lisis</th>
        <th>Tipo</th>
        <th>Descripci&oacute;n</th>
    </tr>
    <%
        for(int i=0; i<arrayAnalisis.length; i++){
    %>
            <tr>
                <td><%=arrayAnalisis[i].getClave()%></td>
                <td><%=arrayAnalisis[i].getTipo()%></td>
                <td><%=arrayAnalisis[i].getDescripcion()%></td>
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