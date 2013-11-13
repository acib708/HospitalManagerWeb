<%@ taglib prefix="s" uri="/struts-tags" %>
<script type="text/javascript">
    function validateFormCapturar(){
        var claveDoctor  = $("input[name = claveDoctor]").val();

        if (claveDoctor == null || claveDoctor == ""){
            alertify.error("Debes proporcionar una clave.");
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

<h3>Consulta Doctor</h3>   <br/>
<s:form name="form_consultar_clave_doctor" action="consultarDoctorClave" method="GET" target="results_frame">
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Clave:</td>
            <td><input style="width:200px;" type="text" name="claveDoctor"></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="return validateFormCapturar();"/>
            </td>
        </tr>
    </table>
</s:form>
