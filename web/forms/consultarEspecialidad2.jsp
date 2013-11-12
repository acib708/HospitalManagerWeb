<%@ page import="thrift.Doctor" %>
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
    Doctor[] arrayDoctor = (Doctor[])request.getAttribute("doctores");

    //Boolean state = (Boolean)request.getAttribute("ans");

    if(arrayDoctor != null){
%>
<ul class="thumbnails">
    <%
        for(int i=0; i<arrayDoctor.length; i++){
    %>
    <li class="span3" >
        <div class="thumbnail" >
            <img class="img-polaroid" style="width: 170px; height: 170px;" src="../img/<%=arrayDoctor[i].getClave()%>.jpg" alt="">
            <h5><%=arrayDoctor[i].getNombre()%></h5>
            <h5><%=arrayDoctor[i].getEspecialidad()%></h5>
            <h5>Telefono: <%=arrayDoctor[i].getTelefono()%></h5>
        </div>
    </li>
    <%
        }
    %>
</ul>

<%  } else { %>
<h2 style="text-align: center;">El doctor no existe.</h2>
<%  } %>

</body>
</html>