<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="thrift.Paciente" %>
<%
    Paciente[] arrayPaciente = (Paciente[])request.getAttribute("pacientes");
%>

<h3> Eliminar Paciente </h3>
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Clave:</td>
            <td><select id="clavePaciente" name="clavePaciente">
                <% for (Paciente pacientes: arrayPaciente){  %>
                <option value="<%=pacientes.getClave()%>"><%=pacientes.getClave()%></option>
                <%
                    } %>
            </select></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="ajax_borrarPaciente();"/>
            </td>
        </tr>
    </table>