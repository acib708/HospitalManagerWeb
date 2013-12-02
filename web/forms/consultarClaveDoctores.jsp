<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="thrift.Doctor" %>
<%
    Doctor[] arrayDoctor = (Doctor[])request.getAttribute("doctores");
%>

<h3>Consulta Doctor</h3>   <br/>
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Clave:</td>
            <td><select id="claveDoctor" name="claveDoctor">
            <% for (Doctor doc: arrayDoctor){  %>
                <option value="<%=doc.getClave()%>"><%=doc.getClave()%></option>
             <%
            } %>
            </select></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="ajax_getDoc();"/>
            </td>
        </tr>
    </table>

