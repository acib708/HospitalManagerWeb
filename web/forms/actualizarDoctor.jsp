<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="thrift.Doctor" %>
<%
    Doctor[] arrayDoctor = (Doctor[])request.getAttribute("doctores");
%>

<h3> Actualizar Doctores </h3>
<!--s:form name="form_actualizar_doctor" action="obtenerDatosDoctor" method="GET" target="results_frame">  -->
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Clave:</td>
            <td><select id="clave" name="clave">
                <% for (Doctor doc: arrayDoctor){  %>
                <option value="<%=doc.getClave()%>"><%=doc.getClave()%></option>
                <%
                    } %>
            </select></td>
            <!--<td><input style="width:200px;" type="text" name="clave"></td>-->
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="ajax_DocActualizar();"/>
            </td>
        </tr>
    </table>
<!--/s:form>  -->
