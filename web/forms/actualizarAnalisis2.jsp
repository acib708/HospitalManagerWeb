<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="thrift.AnalisisClinico"%>
<!DOCTYPE html>
<html>
<head>
    <!-- Linking Alertify  -->
    <script src="../alertify/lib/alertify.js"></script>
    <link rel="stylesheet" href="../alertify/themes/alertify.core.css" />
    <link rel="stylesheet" href="../alertify/themes/alertify.bootstrap.css" />
    <!-- Linking Bootstrap CSS  -->
    <link rel="stylesheet" href="../bootstrap/css/bootstrap.css"/>
    <!-- Linking jQuery  -->
    <script src="../js/jquery.js"></script>
    <!-- Linking Bootstrap JS  -->
    <script src="../bootstrap/js/bootstrap.js"></script>

    <script type="text/javascript">
        function validateFormCapturar(){
            var clave       = $("input[name = clave]").val();
            var descripcion = $("input[name = descripcion]").val();
            var tipo        = $("input[name = tipo]").val();

            if (clave == null || clave == ""){
                alertify.error("Debes proporcionar una clave.");
                return false;
            }
            else if (descripcion == null || descripcion == ""){
                alertify.error("Debes proporcionar una descripcion.");
                return false;
            }
            else if (tipo == null || tipo == ""){
                alertify.error("Debes proporcionar un tipo.");
                return false;
            }
            else{
                //document.getElementById('results_frame').style.display = "inherit";
                return true;
            }
        }
    </script>
</head>
<body>
<h4> Actualizar An&aacute;lisis: </h4>
<% AnalisisClinico analisis = (AnalisisClinico)request.getAttribute("analisis");
    if(analisis != null){
%>
<s:form name="form_actualizar_analisis" action="actualizarAnalisis" method="GET" target="results_frame">
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Clave:</td>
            <td><input style="width:200px;" type="text" name="dum" value="<%= analisis.getClave()%>" disabled>
                <input type="hidden" name="clave" value="<%= analisis.getClave()%>">
            </td>
        </tr>
        <tr>
            <td class="text-right">Tipo:</td>
            <td><input style="width:200px;" type="text" name="tipo" value="<%= analisis.getTipo()%>"></td>
        </tr>
        <tr>
            <td class="text-right">Descripcion:</td>
            <td><input style="width:200px;" type="text" name="descripcion" value="<%= analisis.getDescripcion()%>"> </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="validateFormCapturar();  iframeGo('estadoCaptura.jsp'); showFrame();"/>
            </td>
        </tr>
    </table>
</s:form>

<% } else { %>
<h2 style="text-align: center;">El analisis no existe.</h2>
<% } %>
</body>
