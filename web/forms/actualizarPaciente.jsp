<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="thrift.Paciente" %>
<%
    Paciente[] arrayPaciente =(Paciente[])request.getAttribute("pacientes");
%>

<h3> Actualizar Pacientes </h3>
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Clave:</td>
            <td><select id="clave" name="clave">
                <% for (Paciente pac: arrayPaciente){  %>
                <option value="<%=pac.getClave()%>"><%=pac.getClave()%></option>
                <%
                    } %>
            </select></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="ajax_ActualizarPaciente();"/>
            </td>
        </tr>
    </table>
