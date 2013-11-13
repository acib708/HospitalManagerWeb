<%@ page import="thrift.ReportePacientesDoctor" %>
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
    ReportePacientesDoctor[] arrayPacientesDoctor = (ReportePacientesDoctor[])request.getAttribute("reportesPacientesDoctor");

    //Boolean state = (Boolean)request.getAttribute("ans");

    if(arrayPacientesDoctor != null){
%>
<div class="row">
    <div class="span1"></div>
    <ul class="thumbnails">
        <li class="span3 offset1" >
            <div class="thumbnail" >
                <img class="img-polaroid" style="width: 170px; height: 170px;" src="../img/<%=arrayPacientesDoctor[1].getClaveDoctor()%>.jpg" alt="">
                <h4><%=arrayPacientesDoctor[1].getNombreDoctor()%></h4>
                <h6>Clave: <%=arrayPacientesDoctor[1].getClaveDoctor()%></h6>
            </div>
        </li>
        <li class="span10 ">
            <ul class="thumbnails">
                <%
                    for (ReportePacientesDoctor repPacientesDoctor: arrayPacientesDoctor ){
                %>
                <li class="span2 offset1">
                    <div class="thumbnail">
                        <img class="img-polaroid" style="width: 100px; height: 100px;" src="../img/<%=repPacientesDoctor.getClavePaciente()%>.jpg" alt="">
                        <h6><%=repPacientesDoctor.getNombrePaciente()%></h6>
                        <p class="little">Clave: <%=repPacientesDoctor.getClavePaciente()%></p>
                        <p class="little">Diagnostico: <%=repPacientesDoctor.getDiagnostico()%></p>
                        <p class="little">Fecha: <%=repPacientesDoctor.getFecha()%></p>
                        <p class="little">Tratamiento: <%=repPacientesDoctor.getTratamiento()%></p>
                    </div>
                </li>
                <%
                    }
                %>
            </ul>
        </li>
    </ul>
</div>

<%  } else { %>
<h2 style="text-align: center;">No se encontro el doctor </h2>
<%  } %>

</body>
</html>