<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="thrift.AnalisisClinico" %>
<%
    if(request.getAttribute("analisis") == null){
        System.out.println("llegates null"); %>
    <h2 style="text-align: center;">Error al consultar el servidor</h2>
    <h2 style="text-align: center;">No se encontro el paciente </h2>
   <% }

    else{
    AnalisisClinico[] arrayAnalisis = (AnalisisClinico[])request.getAttribute("analisis");

%>
<h3> Generar Reporte Paciente </h3>
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Clave del An&aacute;lisis:</td>
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
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="ajax_RepPacAnalisis();"/>
            </td>
        </tr>
    </table>
<%
    }
%>