<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="thrift.AnalisisClinico"%>

<body  style="background: #f5f5f5;">
<h4> Actualizar An&aacute;lisis: </h4>
<% AnalisisClinico analisis = (AnalisisClinico)request.getAttribute("analisis");
    if(analisis != null){
%>
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Clave:</td>
            <td><input style="width:200px;" type="text" name="dum" value="<%= analisis.getClave()%>" disabled>
                <input type="hidden" id="clave" name="clave" value="<%= analisis.getClave()%>">
            </td>
        </tr>
        <tr>
            <td class="text-right">Tipo:</td>
            <td><input style="width:200px;" type="text" id="tipo" name="tipo" value="<%= analisis.getTipo()%>"></td>
        </tr>
        <tr>
            <td class="text-right">Descripcion:</td>
            <td><input style="width:200px;" type="text" id="descripcion" name="descripcion" value="<%= analisis.getDescripcion()%>"> </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="guardarAnalisisCambios();"/>
            </td>
        </tr>
    </table>

<% } else { %>
<h2 style="text-align: center;">El analisis no existe.</h2>
<% } %>
</body>
