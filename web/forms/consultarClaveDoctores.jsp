<%@ taglib prefix="s" uri="/struts-tags" %>
<script type="text/javascript">
    function validateFormCapturar(){
        var claveDoctor  = $("input[name = claveDoctor]").val();

        if (claveDoctor == null || claveDoctor == "claveDoctor"){
            alertify.error("Debes proporcionar una clave.");
            return false;
        }
        else{
            //document.getElementById('results_frame').style.display = "inherit";
            return true;
        }
    }
</script>

<h4> Consulta Doctor: </h4>
<s:form name="form_consultar_clave_doctor" action="consultarDoctorClave" method="GET" target="results_frame">
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Clave:</td>
            <td><input style="width:200px;" type="text" name="claveDoctor"></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="validateFormCapturar();  iframeGo('consultarClaveDoctores2.jsp'); showFrame();"/>
            </td>
        </tr>
    </table>
</s:form>
