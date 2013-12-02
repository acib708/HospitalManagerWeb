<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="thrift.Paciente" %>

<body style="background: #f5f5f5;">
<h4> Modificar Pacientes: </h4>
<% Paciente paciente = (Paciente)request.getAttribute("paciente");
    if(paciente != null){
%>
<!--s:form name="form_actualizar_paciente" action="actualizarPaciente" method="GET" target="results_frame">-->
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Clave:</td>
            <td><input style="width:200px;" type="text" name="dum" value="<%= paciente.getClave()%>" disabled>
                <input type="hidden" id="clave" name="clave" value="<%= paciente.getClave()%>">
            </td>
        </tr>
        <tr>
            <td class="text-right">Nombre:</td>
            <td><input style="width:200px;" type="text" id="nombre" name="nombre" value="<%= paciente.getNombre()%>"></td>
        </tr>
        <tr>
            <td class="text-right">Direcci&oacute;n:</td>
            <td><input style="width:200px;" type="text" id="direccion" name="direccion" value="<%= paciente.getDireccion()%>"> </td>
        </tr>
        <tr>
            <td class="text-right">Tel&eacute;fono:</td>
            <td><input style="width:200px;" type="text" id="telefono" name="telefono" value="<%= paciente.getTelefono()%>"></td>
        </tr>
        <!--tr>
            <td class="text-right">Foto:</td>
            <td><input style="width:200px;" type="text" name="foto" value="<%= paciente.getFoto()%>"></td>
        </tr-->
        <tr>
            <td></td>
            <td>
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="guardarCambiosPaciente();"/>
            </td>
        </tr>
    </table>
<!--/s:form> -->

<% } else { %>
<h2 style="text-align: center;">El paciente no existe.</h2>
<% } %>
</body>