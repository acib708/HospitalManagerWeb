<%@ page import="thrift.ReporteAnalisisPaciente" %>
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
    ReporteAnalisisPaciente[] arrayAnalisisPaciente = (ReporteAnalisisPaciente[])request.getAttribute("reportesAnalisisPaciente");

    //Boolean state = (Boolean)request.getAttribute("ans");
    //System.out.println(arrayAnalisisPaciente);
    if(arrayAnalisisPaciente == null ){
%>
        <h2 style="text-align: center;">Error al consultar el servidor</h2>
<%
    }else if( arrayAnalisisPaciente.length<=0 ){
%>
        <h2 style="text-align: center;">No se encontro el paciente </h2>
<%
    }else{
%>
<div class="row">
    <div class="span1"></div>
    <ul class="thumbnails">
        <li class="span3 offset1" >
            <div class="thumbnail" >
                <img class="img-polaroid" style="width: 170px; height: 170px;" src="../img/<%=arrayAnalisisPaciente[1].getClavePaciente()%>.jpg" alt="">
                <h4><%=arrayAnalisisPaciente[1].getNombrePaciente()%></h4>
                <h6>Clave: <%=arrayAnalisisPaciente[1].getClavePaciente()%></h6>
            </div>
        </li>
        <li class="span10 ">
            <div class="thumbnail">
            <table class="table table-striped">
                <tr>
                    <th>Clave An&aacute;lisis</th>
                    <th>Tipo</th>
                    <th>Descripci&oacute;n</th>
                    <th>Fecha Aplicaci&oacute;on</th>
                    <th>Fecha Entrega</th>
                </tr>
                <%
                    for (ReporteAnalisisPaciente repAnalisisPaciente: arrayAnalisisPaciente ){
                %>
                <tr>
                    <td><%=repAnalisisPaciente.getClaveAnalisis()%></td>
                    <td><%=repAnalisisPaciente.getTipo()%></td>
                    <td><%=repAnalisisPaciente.getDescripcion()%></td>
                    <td><%=repAnalisisPaciente.getFechaAplic()%></td>
                    <td><%=repAnalisisPaciente.getFechaentrega()%></td>
                </tr>
                <%
                    }
                %>
            </table>
            </div>
        </li>
    </ul>
</div>

<%  }    %>
</body>
</html>