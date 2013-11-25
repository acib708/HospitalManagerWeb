<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="thrift.Doctor" %>
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
        var especialidad = $("input[name = especialidad]").val();
        var telefono 	 = $("input[name = telefono]").val();
        //var foto	     = $("input[name = foto]").val();

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
        else if (especialidad == null || especialidad == ""){
            alertify.error("Debes proporcionar una especialidad.");
            return false;
        }
        else if (telefono == null || telefono ==""){
            alertify.error("Debes proporcionar un telefono.");
            return false;
        }
        else if (isNaN(telefono)){
            alertify.error("El telefono debe de ser numerico.");
            return false;
        }
        //else if (foto == null || foto == ""){
        //    alertify.error("Debes proporcionar el campo imagen.");
        //    return false;
        //}
        else{
            iframeGo('estadoCaptura.jsp'); showFrame();
            //document.getElementById('results_frame').style.display = "inherit";
            return true;
        }
    }
</script>
</head>
<body style="background: #f5f5f5;">
    <h4> Capturar Doctor: </h4>
    <% Doctor doctor = (Doctor)request.getAttribute("doctor");
        if(doctor != null){
    %>
    <s:form name="form_actualizar_doctor" action="actualizarDoctor" method="GET" target="results_frame">
        <table  style="width:30%; margin:auto;">
            <tr>
                <td class="text-right">Clave:</td>
                <td><input style="width:200px;" type="text" name="dum" value="<%= doctor.getClave()%>" disabled>
                    <input type="hidden" name="clave" value="<%= doctor.getClave()%>">
                </td>
            </tr>
            <tr>
                <td class="text-right">Nombre:</td>
                <td><input style="width:200px;" type="text" name="nombre" value="<%= doctor.getNombre()%>"></td>
            </tr>
            <tr>
                <td class="text-right">Direcci&oacute;n:</td>
                <td><input style="width:200px;" type="text" name="direccion" value="<%= doctor.getDireccion()%>"> </td>
            </tr>
            <tr>
                <td class="text-right">Especialidad:</td>
                <td><input style="width:200px;" type="text" name="especialidad" value="<%= doctor.getEspecialidad()%>"> </td>
            </tr>
            <tr>
                <td class="text-right">Tel&eacute;fono:</td>
                <td><input style="width:200px;" type="text" name="telefono" value="<%= doctor.getTelefono()%>"></td>
            </tr>
            <!--tr>
                <td class="text-right">Foto:</td>
                <td><input style="width:200px;" type="text" name="foto" value="<%= doctor.getFoto()%>"></td>
            </tr-->
            <tr>
                <td></td>
                <td>
                    <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="return validateFormCapturar();"/>
                </td>
            </tr>
        </table>
    </s:form>

    <% } else { %>
    <h2 style="text-align: center;">El doctor no existe.</h2>
    <% } %>
</body>
