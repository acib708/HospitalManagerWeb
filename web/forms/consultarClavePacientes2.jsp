<%@ page import="thrift.Paciente" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <!-- Linking Bootstrap CSS  -->
    <link rel="stylesheet" href="../bootstrap/css/bootstrap.css"/>
</head>
<body style="background: #f5f5f5;">
<%
    //DBManager dbman = new DBManager();
    //thrift.Doctor[] arrayDoctor = dbman.consultarDoctores();
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
            <img class="img-polaroid" style="width: 170px; height: 170px;" src="img/<%=arrayPaciente[i].getClave()%>.jpg" alt="">
            <h4><%=arrayPaciente[i].getNombre()%></h4>
            <h6>Telefono: <%=arrayPaciente[i].getTelefono()%></h6>
            <h6>Direccion: <%=arrayPaciente[i].getDireccion()%></h6>
            <h6>Clave: <%=arrayPaciente[i].getClave()%></h6>

        </div>
    </li>
    <%
        }
    %>
</ul>

<%  } else { %>
<h2 style="text-align: center;">El paciente no existe.</h2>
<%  } %>

</body>
</html>