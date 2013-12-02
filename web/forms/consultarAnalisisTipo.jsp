<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="thrift.Paciente" %>
<%
    Paciente[] arrayPaciente = (Paciente[])request.getAttribute("pacientes");
%>

<h3> Consulta An&aacute;lisis por tipo </h3>
<!--s:form name="form_consultar_tipo_analisis" action="consultarAnalisisTipo" method="GET" target="results_frame">  -->
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Tipo:</td>
            <td><input style="width:200px;" type="text" name="tipoAnalisis"></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="return validateFormCapturar();"/>
            </td>
        </tr>
    </table>
<!--/s:form>    -->
