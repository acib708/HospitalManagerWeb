<%@ page import="model.Atiende" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <!-- Linking Bootstrap CSS  -->
    <link rel="stylesheet" href="../bootstrap/css/bootstrap.css"/>
</head>
<body style="background: #f5f5f5;">
<h4>Consultar Asignaciones</h4>
<%
    //DBManager dbman = new DBManager();
    //Doctor[] arrayDoctor = dbman.consultarDoctores();
    Atiende[] arrayAtiende = (Atiende[])request.getAttribute("atiende");

    //Boolean state = (Boolean)request.getAttribute("ans");

    if(arrayAtiende != null){
%>
<ul class="thumbnails">
    <%
        for(int i=0; i<arrayAtiende.length; i++){
    %>
    <li class="span3" >
        <div class="thumbnail" >
            <img class="img-polaroid" style="width: 170px; height: 170px;" src="../img/<%=arrayAtiende[i].getFotoDoctor()%>" alt="">
            <h5><%=arrayAtiende[i].getClaveDoctor()%></h5>
            <img class="img-polaroid" style="width: 170px; height: 170px;" src="../img/<%=arrayAtiende[i].getFotoPaciente()%>" alt="">
            <h5><%=arrayAtiende[i].getClavePaciente()%></h5>


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