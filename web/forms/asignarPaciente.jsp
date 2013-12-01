<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="thrift.Doctor" %>
<%@ page import="thrift.Paciente" %>
<%
    Doctor[] arrayDoctor = (Doctor[])request.getAttribute("doctores");
    Paciente[] arrayPaciente =(Paciente[])request.getAttribute("pacientes");
%>

<h3> Asignar Pacientes </h3>
<!--s:form name="form_capturar_atiende" action="capturarAtiende" method="GET" target="results_frame"> -->
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Clave Doctor:</td>
            <td><select id="claveDoctor" name="claveDoctor">
                <% for (Doctor doc: arrayDoctor){  %>
                <option value="<%=doc.getClave()%>"><%=doc.getClave()%></option>
                <%
                    } %>
            </select></td>
            <!--<td><input style="width:200px;" type="text" name="claveDoctor"></td>-->
        </tr>
        <tr>
            <td class="text-right">Clave Paciente:</td>
            <td><select id="clavePaciente" name="clavePaciente">
                <% for (Paciente pac: arrayPaciente){  %>
                <option value="<%=pac.getClave()%>"><%=pac.getClave()%></option>
                <%
                    } %>
            </select></td>
            <!--<td><input style="width:200px;" type="text" name="clavePaciente"></td> -->
        </tr>
        <tr>
            <td class="text-right">Fecha:</td>
            <td><input style="width:200px;" type="date" id="fechaAtiende" name="fechaAtiende"> </td>
        </tr>
        <tr>
            <td class="text-right">Diagn&oacute;stico:</td>
            <td><input style="width:200px;" type="text" id="diagnostico" name="diagnostico"> </td>
        </tr>
        <tr>
            <td class="text-right">Tratamiento:</td>
            <td><input style="width:200px;" type="text" id="tratamiento" name="tratamiento"> </td>
        </tr>
        <!--tr>
            <td class="text-right">Foto thrift.Doctor:</td>
            <td><input style="width:200px;" type="text" name="fotoDoctor"> </td>
        </tr>
        <tr>
            <td class="text-right">Foto thrift.Paciente:</td>
            <td><input style="width:200px;" type="text" name="fotoPaciente"> </td>
        </tr-->
        <tr>
            <td></td>
            <td>
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="asignarPaciente();"/>
            </td>
        </tr>
    </table>
<!--/s:form>-->
