<%@ page import="thrift.SeRealiza" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <!-- Linking Bootstrap CSS  -->
    <link rel="stylesheet" href="../bootstrap/css/bootstrap.css"/>
</head>
<body style="background: #f5f5f5;">
<h4>An&aacute;lisis de pacientes</h4>
<%
    //DBManager dbman = new DBManager();
    //thrift.Doctor[] arrayDoctor = dbman.consultarDoctores();
    SeRealiza[] arraySeRealiza = (SeRealiza[])request.getAttribute("seRealiza");

    //Boolean state = (Boolean)request.getAttribute("ans");

    if(arraySeRealiza != null){
%>
<ul class="thumbnails">
    <%
        for(int i=0; i<arraySeRealiza.length; i++){
    %>
    <li class="span3" >
        <div class="thumbnail" >
            <img class="img-polaroid" style="width: 170px; height: 170px;" src="../img/<%=arraySeRealiza[i].getFotoPaciente()%>" alt="">
            <h5><%=arraySeRealiza[i].getClavePaciente()%></h5>
            <h5>Fecha Aplicaci&oacute;n: <%=arraySeRealiza[i].getFechaAplic()%></h5>
            <h5>Fecha de Entrega: <%=arraySeRealiza[i].getFechaEntrega()%></h5>
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