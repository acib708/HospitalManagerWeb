<%@ page import="thrift.Doctor" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<body style="background: #f5f5f5;">
<!-- Linking Bootstrap JS  -->
<script language="JavaScript" type="text/javascript" src="../bootstrap/js/myScriptFunction.js"></script>
<script language="JavaScript" type="text/javascript" src="../bootstrap/js/bootstrap.js"></script>
<link rel="stylesheet" href="../bootstrap/css/bootstrap.css"/>
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
            <img class="img-polaroid" style="width: 170px; height: 170px;" src="img/<%=arrayDoctor[i].getClave()%>.jpg" alt="">
            <h4><%=arrayDoctor[i].getNombre()%></h4>
            <h6>Especialidad: <%=arrayDoctor[i].getEspecialidad()%></h6>
            <h6>Telefono: <%=arrayDoctor[i].getTelefono()%></h6>
            <h6>Clave: <%=arrayDoctor[i].getClave()%></h6>
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