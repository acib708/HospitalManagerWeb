<%@ page import="thrift.ReporteDoctoresPaciente" %>
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
    ReporteDoctoresPaciente[] arrayDoctoresPaciente= (ReporteDoctoresPaciente[])request.getAttribute("reportesDoctoresPaciente");

    //Boolean state = (Boolean)request.getAttribute("ans");

    if(arrayDoctoresPaciente != null){
%>
<div class="row">
    <div class="span1"></div>
    <ul class="thumbnails">
        <li class="span3 offset1" >
            <div class="thumbnail" >
                <img class="img-polaroid" style="width: 170px; height: 170px;" src="../img/<%=arrayDoctoresPaciente[1].getClavePaciente()%>.jpg" alt="">
                <h4><%=arrayDoctoresPaciente[1].getNombrePaciente()%></h4>
                <h6>Clave: <%=arrayDoctoresPaciente[1].getClavePaciente()%></h6>
            </div>
        </li>
        <li class="span10 ">
            <ul class="thumbnails">
                <%
                    for (ReporteDoctoresPaciente repDoctoresPaciente: arrayDoctoresPaciente ){
                %>
                <li class="span2 offset1">
                    <div class="thumbnail">
                        <img class="img-polaroid" style="width: 100px; height: 100px;" src="../img/<%=repDoctoresPaciente.getClaveDoctor()%>.jpg" alt="">
                        <h6><%=repDoctoresPaciente.getNombreDoctor()%></h6>
                        <p class="little">Clave: <%=repDoctoresPaciente.getClaveDoctor()%></p>
                        <p class="little">Diagnostico: <%=repDoctoresPaciente.getDiagnostico()%></p>
                        <p class="little">Fecha: <%=repDoctoresPaciente.getFecha()%></p>
                        <p class="little">Tratamiento: <%=repDoctoresPaciente.getTratamiento()%></p>
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
<h2 style="text-align: center;">No se encontro el paciente </h2>
<%  } %>

</body>
</html>