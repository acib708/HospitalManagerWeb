<%@ page import="thrift.Atiende" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <!-- Linking Bootstrap CSS  -->
    <link rel="stylesheet" href="../bootstrap/css/bootstrap.css"/>
</head>
<body style="background: #f5f5f5;">
<h3>Consultar Asignaciones</h3>
<%
    //DBManager dbman = new DBManager();                                          h
    //thrift.Doctor[] arrayDoctor = dbman.consultarDoctores();
    Atiende[] arrayAtiende = (Atiende[])request.getAttribute("atiende");
    HashMap<String,String> nombresPacientes = (HashMap<String,String>)request.getAttribute("hashPacientes");
    HashMap<String,String> nombresDoctores  = (HashMap<String,String>)request.getAttribute("hashDoctores");
    //Boolean state = (Boolean)request.getAttribute("ans");

    if(arrayAtiende != null){
%>
<ul class="thumbnails">
    <%
        for (Atiende anArrayAtiende : arrayAtiende) {
    %>
    <li class="span3">
        <div class="thumbnail">
            <img class="img-polaroid" style="width: 170px; height: 170px;"
                 src="../img/<%=anArrayAtiende.getClaveDoctor()%>.jpg" alt="">
            <h5><%= nombresDoctores.get(anArrayAtiende.getClaveDoctor()) %> </h5>
            <h6> atiende a:</h6>
            <img class="img-polaroid" style="width: 170px; height: 170px;"
                 src="../img/<%=anArrayAtiende.getClavePaciente()%>.jpg" alt="">
            <h5><%= nombresPacientes.get(anArrayAtiende.getClavePaciente()) %> </h5>


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