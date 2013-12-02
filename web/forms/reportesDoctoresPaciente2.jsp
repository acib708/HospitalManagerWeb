<%@ page import="thrift.ReporteDoctoresPaciente" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<body style="background: #f5f5f5;">
<h4>Doctores de un paciente</h4>
<%
    ReporteDoctoresPaciente[] arrayDoctoresPaciente= (ReporteDoctoresPaciente[])request.getAttribute("reportesDoctoresPaciente");
    /System.out.println("tragan "+arrayDoctoresPaciente[0]);

    if(arrayDoctoresPaciente == null ){
%>
        <h2 style="text-align: center;">Error al consultar el servidor</h2>
<%
    }else if( arrayDoctoresPaciente.length<=0 || arrayDoctoresPaciente[0] == null){
%>
        <h2 style="text-align: center;">No se encontro el paciente </h2>
<%
    }
    else {
%>
<div class="row">
    <div class="span1"></div>
    <ul class="thumbnails">
        <li class="span3 offset1" >
            <div class="thumbnail" >
                <img class="img-polaroid" style="width: 170px; height: 170px;" src="img/<%=arrayDoctoresPaciente[0].getClavePaciente()%>.jpg" alt="">
                <h4><%=arrayDoctoresPaciente[0].getNombrePaciente()%></h4>
                <h6>Clave: <%=arrayDoctoresPaciente[0].getClavePaciente()%></h6>
            </div>
        </li>
        <li class="span10 ">
            <ul class="thumbnails">
                <%
                    for (ReporteDoctoresPaciente repDoctoresPaciente: arrayDoctoresPaciente ){
                %>
                <li class="span2 offset1">
                    <div class="thumbnail">
                        <img class="img-polaroid" style="width: 100px; height: 100px;" src="img/<%=repDoctoresPaciente.getClaveDoctor()%>.jpg" alt="">
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

<%  } %>

</body>
</html>