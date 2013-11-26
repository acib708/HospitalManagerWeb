<%@ taglib prefix="s" uri="/struts-tags" %>
<script type="text/javascript">
    function validateFormCapturar(){
        var especialidadDoctor  = $("input[name = especialidadDoctor]").val();

        if (especialidadDoctor == null || especialidadDoctor == ""){
            alertify.error("Debes proporcionar una especialidad.");
            return false;
        }
        else{
            iframeGo('consultarClaveDoctores2.jsp');
            resizeFrame();
            showFrame();
            return true;
        }
    }
</script>

<h3> Consulta Doctor por Especialidad </h3>
<s:form name="form_consultar_especialidad" action="consultarDoctorEspecialidad" method="GET" target="results_frame">
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Especialidad:</td>
            <td><input style="width:200px;" type="text" name="especialidadDoctor"></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="return validateFormCapturar();"/>
            </td>
        </tr>
    </table>
</s:form>