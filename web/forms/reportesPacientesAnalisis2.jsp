<%@ page import="thrift.ReportePacientesAnalisis" %>
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
    ReportePacientesAnalisis[] arrayPacientesAnalisis = (ReportePacientesAnalisis[])request.getAttribute("reportesPacientesAnalisis");

    //Boolean state = (Boolean)request.getAttribute("ans");

    if(arrayPacientesAnalisis == null ){
%>
        <h2 style="text-align: center;">Error al consultar el servidor</h2>
<%
    }else if( arrayPacientesAnalisis.length<=0 ){
%>
        <h2 style="text-align: center;">No se encontro el an&aacute;lisis</h2>
<%
    }else{
%>
<div class="row">
    <div class="span1"></div>
    <ul class="thumbnails">
        <li class="span3 offset1" >
            <div class="thumbnail" >
                <h4><%=arrayPacientesAnalisis[1].getTipo()%></h4>
                <h6>Clave: <%=arrayPacientesAnalisis[1].getClaveAnalisis()%></h6>
                <h6>Descripci&oacute;n: <%=arrayPacientesAnalisis[1].getDescripcion()%></h6>
            </div>
        </li>
        <li class="span10 ">
            <ul class="thumbnails">
                <%
                    for (ReportePacientesAnalisis repPacientesAnalisis: arrayPacientesAnalisis){
                %>
                <li class="span2 offset1">
                    <div class="thumbnail">
                        <img class="img-polaroid" style="width: 100px; height: 100px;" src="../img/<%=repPacientesAnalisis.getClavePaciente()%>.jpg" alt="">
                        <h6><%=repPacientesAnalisis.getNombrePaciente()%></h6>
                        <p class="little">Clave: <%=repPacientesAnalisis.getClavePaciente()%></p>
                        <p class="little">Fecha Aplicacion: <%=repPacientesAnalisis.getFechaAplica()%></p>
                        <p class="little">Fecha Entrega: <%=repPacientesAnalisis.getFechaentrega()%></p>
                    </div>
                </li>
                <%
                    }
                %>
            </ul>
        </li>
    </ul>
</div>

<%  } %>

</body>
</html>