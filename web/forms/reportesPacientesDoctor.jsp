<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="thrift.Doctor" %>
<%
    Doctor[] arrayDoctor = (Doctor[])request.getAttribute("doctores");
%>

<h3> Generar Reporte Pacientes de un Doctor </h3>
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Clave del Doctor:</td>
            <td><select id="claveDoctor" name="claveDoctor">
                <% for (Doctor doctor: arrayDoctor){  %>
                <option value="<%=doctor.getClave()%>"><%=doctor.getClave()%></option>
                <%
                    } %>
            </select></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="ajax_RepPacienteDoctor();"/>
            </td>
        </tr>
    </table>
