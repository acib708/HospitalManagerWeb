<%@ taglib prefix="s" uri="/struts-tags" %>
<script type="text/javascript">
    function validateFormCapturar(){
        var clavePaciente  = $("input[name = clavePaciente]").val();
        var claveDoctor    = $("input[name = claveDoctor]").val();
        var fecha          = $("input[name = fechaAtiende]").val();
        var diagnostico    = $("input[name = diagnostico]").val();
        var tratamiento    = $("input[name = tratamiento]").val();
        //var fotoDoctor     = $("input[name = fotoDoctor]").val();
        //var fotoPaciente   = $("input[name = fotoPaciente]").val();

        if (clavePaciente == null || clavePaciente == ""){
            alertify.error("Debes proporcionar una clave de Paciente.");
            return false;
        }
        else if (claveDoctor == null || claveDoctor == ""){
            alertify.error("Debes proporcionar una clave de Doctor.");
            return false;
        }
        else if (fecha == null || fecha== ""){
            alertify.error("Debes proporcionar una fecha.");
            return false;
        }
        else if (diagnostico == null || diagnostico == ""){
            alertify.error("Debes proporcionar un diagnostico.");
            return false;
        }
        else if (tratamiento == null || tratamiento == ""){
            alertify.error("Debes proporcionar un tratamiento.");
            return false;
        }
        /*else if (fotoDoctor == null || fotoDoctor == ""){
            alertify.error("Debes proporcionar una foto del thrift.Doctor.");
            return false;
        }
        else if (fotoPaciente == null || fotoPaciente == ""){
            alertify.error("Debes proporcionar una foto del thrift.Paciente.");
            return false;
        } */
        else{
            iframeGo('../estadoCaptura.jsp');
            resizeFrame();
            showFrame();
            return true;
        }
    }
</script>

<h3> Asignar Pacientes </h3>
<s:form name="form_capturar_atiende" action="capturarAtiende" method="GET" target="results_frame">
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Clave Doctor:</td>
            <td><input style="width:200px;" type="text" name="claveDoctor"></td>
        </tr>
        <tr>
            <td class="text-right">Clave Paciente:</td>
            <td><input style="width:200px;" type="text" name="clavePaciente"></td>
        </tr>
        <tr>
            <td class="text-right">Fecha:</td>
            <td><input style="width:200px;" type="text" name="fechaAtiende"> </td>
        </tr>
        <tr>
            <td class="text-right">Diagn&oacute;stico:</td>
            <td><input style="width:200px;" type="text" name="diagnostico"> </td>
        </tr>
        <tr>
            <td class="text-right">Tratamiento:</td>
            <td><input style="width:200px;" type="text" name="tratamiento"> </td>
        </tr>
        <!--tr>
            <td class="text-right">Foto thrift.Doctor:</td>
            <td><input style="width:200px;" type="text" name="fotoDoctor"> </td>
        </tr>
        <tr>
            <td class="text-right">Foto thrift.Paciente:</td>
            <td><input style="width:200px;" type="text" name="fotoPaciente"> </td>
        </tr-->
        <tr>
            <td></td>
            <td>
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="return validateFormCapturar();"/>
            </td>
        </tr>
    </table>
</s:form>
