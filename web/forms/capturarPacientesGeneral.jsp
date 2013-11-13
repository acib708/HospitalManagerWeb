<%@ taglib prefix="s" uri="/struts-tags" %>
<script type="text/javascript">
function validateFormCapturar(){
    var clavePaciente = $("input[name = clavePaciente]").val();
    var nombre	      = $("input[name = nombre]").val();
    var direccion     = $("input[name = direccion]").val();
    var telefono 	  = $("input[name = telefono]").val();
    //var fotoPaciente  = $("input[name = fotoPaciente]").val();

    if (clavePaciente == null || clavePaciente == ""){
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
    else if (telefono == null || telefono ==""){
        alertify.error("Debes proporcionar un telefono.");
        return false;
    }
    /*else if (isNaN(telefono)){
        alertify.error("El telefono debe de ser numerico.");
        return false;
    }
    //else if (fotoPaciente == null || fotoPaciente == ""){
    //    alertify.error("Debes proporcionar el campo imagen.");
    //    return false;
    //}  */
    else{
        iframeGo('../estadoCaptura.jsp');
        resizeFrame();
        showFrame();
        return true;
    }
}

</script>

<h3> Capturar Pacientes </h3>
<s:form name="form_capturar_paciente" action="capturarPaciente" method="GET" target="results_frame">
<table  style="width:30%; margin:auto;">
    <tr>
        <td class="text-right">Clave:</td>
        <td><input style="width:200px;" type="text" name="clavePaciente"></td>
    </tr>
    <tr>
        <td class="text-right">Nombre:</td>
        <td><input style="width:200px;" type="text" name="nombre"></td>
    </tr>
    <tr>
        <td class="text-right">Direcci&oacute;n:</td>
        <td><input style="width:200px;" type="text" name="direccion"></td>
    </tr>
    <tr>
        <td class="text-right">Tel&eacute;fono:</td>
        <td><input style="width:200px;" type="text" name="telefono"></td>
    </tr>
    <!--tr>
        <td class="text-right">Foto:</td>
        <td><input style="width:200px;" type="text" name="fotoPaciente"></td>
    </tr-->
    <tr>
        <td></td>
        <td>
            <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="return validateFormCapturar();"/>
        </td>
    </tr>
</table>
</s:form>
