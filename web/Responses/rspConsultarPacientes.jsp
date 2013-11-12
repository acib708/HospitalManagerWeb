<%@ page import="model.Paciente" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <!-- Linking Bootstrap CSS  -->
    <link rel="stylesheet" href="../bootstrap/css/bootstrap.css"/>
</head>
<body style="background: #f5f5f5;">
<h4>Consultar Pacientes</h4>
<%
    //DBManager dbman = new DBManager();
    //Doctor[] arrayPaciente = dbman.consultarDoctores();
    Paciente[] arrayPaciente = (Paciente[])request.getAttribute("pacientes");

    //Boolean state = (Boolean)request.getAttribute("ans");

    if(arrayPaciente != null){
%>
<ul class="thumbnails">
    <%
        for(int i=0; i<arrayPaciente.length; i++){
    %>
    <li class="span3" >
        <div class="thumbnail" >
            <img class="img-polaroid" style="width: 170px; height: 170px;" src="../img/<%=arrayPaciente[i].getFoto()%>" alt="">
            <h5><%=arrayPaciente[i].getNombre()%></h5>
        </div>
    </li>
    <%
        }
    %>
</ul>

<%  } else { %>
<h2 style="text-align: center;">El Paciente no existe.</h2>
<%  } %>

</body>
</html>