<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="model.Paciente"%>
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
            var clave        = $("input[name = clave]").val();
            var nombre	     = $("input[name = nombre]").val();
            var direccion    = $("input[name = direccion]").val();
            var telefono 	 = $("input[name = telefono]").val();
            var foto	     = $("input[name = foto]").val();

            if (clave == null || clave == ""){
                alertify.error("Debes proporcionar una clave.");
                return false;
            }
            else if (nombre == null || nombre == ""){
                alertify.error("Debes proporcionar un nombre.");
                return false;
            }
            else if (direccion == null || direccion == ""){
                alertify.error("Debes proporcionar una direccion.");
                return false;
            }
            else if (telefono == null || telefono ==" "){
                alertify.error("Debes proporcionar un telefono.");
                return false;
            }
            else if (isNaN(telefono)){
                alertify.error("El telefono debe de ser numerico.");
                return false;
            }
            else if (foto == null || foto == ""){
                alertify.error("Debes proporcionar el campo imagen.");
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
<h4> Capturar Pacientes: </h4>
<% Paciente paciente = (Paciente)request.getAttribute("paciente");
    if(paciente != null){
%>
<s:form name="form_actualizar_paciente" action="actualizarPaciente" method="GET" target="results_frame">
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Clave:</td>
            <td><input style="width:200px;" type="text" name="dum" value="<%= paciente.getClave()%>" disabled>
                <input type="hidden" name="clave" value="<%= paciente.getClave()%>">
            </td>
        </tr>
        <tr>
            <td class="text-right">Nombre:</td>
            <td><input style="width:200px;" type="text" name="nombre" value="<%= paciente.getNombre()%>"></td>
        </tr>
        <tr>
            <td class="text-right">Direcci&oacute;n:</td>
            <td><input style="width:200px;" type="text" name="direccion" value="<%= paciente.getDireccion()%>"> </td>
        </tr>
        <tr>
            <td class="text-right">Tel&eacute;fono:</td>
            <td><input style="width:200px;" type="text" name="telefono" value="<%= paciente.getTelefono()%>"></td>
        </tr>
        <tr>
            <td class="text-right">Foto:</td>
            <td><input style="width:200px;" type="text" name="foto" value="<%= paciente.getFoto()%>"></td>
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
<h2 style="text-align: center;">El paciente no existe.</h2>
<% } %>
</body>