<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="thrift.AnalisisClinico" %>
<%
    AnalisisClinico[] arrayAnalisis = (AnalisisClinico[])request.getAttribute("analisis");
%>

<h3> Consulta An&aacute;lisis: </h3>
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Clave:</td>
            <td><select id="claveAnalisis" name="claveAnalisis">
                <% for (AnalisisClinico analisis: arrayAnalisis){  %>
                <option value="<%=analisis.getClave()%>"><%=analisis.getClave()%></option>
                <%
                    } %>
            </select></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="ajax_ClaveAnalisisCons();"/>
            </td>
        </tr>
    </table>
