<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="thrift.Doctor" %>
<%@ page import="thrift.Paciente" %>
<%@ page import="thrift.AnalisisClinico" %>
<%
    AnalisisClinico[] arrayAnalisis = (AnalisisClinico[])request.getAttribute("analisis");
    Paciente[] arrayPaciente =(Paciente[])request.getAttribute("pacientes");
%>

<h3> Asignar An&aacute;lisis a Pacientes </h3>
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Clave An&aacute;lisis:</td>
            <td><select id="claveAnalisis" name="claveAnalisis">
                <% for (AnalisisClinico analisis: arrayAnalisis){  %>
                <option value="<%=analisis.getClave()%>"><%=analisis.getClave()%></option>
                <%
                    } %>
            </select></td>
        </tr>
        <tr>
            <td class="text-right">Clave Paciente:</td>
            <td><select id="clavePaciente" name="clavePaciente">
                <% for (Paciente pac: arrayPaciente){  %>
                <option value="<%=pac.getClave()%>"><%=pac.getClave()%></option>
                <%
                    } %>
            </select></td>
        </tr>
        <!--tr>
            <td class="text-right">Foto Paciente:</td>
            <td><input style="width:200px;" type="text" name="fotoPaciente"> </td>
        </tr-->
        <tr>
            <td class="text-right">Fecha de Aplicaci&oacute;n:</td>
            <td><input style="width:200px;" type="date" id="fechaAplicacion" name="fechaAplicacion"> </td>
        </tr>
        <tr>
            <td class="text-right">Fecha de Entrega:</td>
            <td><input style="width:200px;" type="date" id="fechaEntrega"name="fechaEntrega"> </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="asignacionAnalisisPaciente();"/>
            </td>
        </tr>
    </table>
