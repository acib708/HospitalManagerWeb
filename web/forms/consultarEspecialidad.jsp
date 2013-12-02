<%@ taglib prefix="s" uri="/struts-tags" %>
<%
    String[] arrayEsp = (String[])request.getAttribute("especialidad");
%>

<h3> Consulta Doctor por Especialidad </h3>
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Especialidad:</td>
            <td><select name="especialidad" id="especialidad">
                <% for (String esp: arrayEsp){
                %>
                <option value="<%=esp %>"><%=esp%></option>
                <%
                    }
                %>

            </select>
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="return ajax_getEsp();"/>
            </td>
        </tr>
    </table>