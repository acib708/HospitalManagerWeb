<%@ taglib prefix="s" uri="/struts-tags" %>
<script type="text/javascript">
    function validateFormCapturar(){
        var clave  = $("input[name = clave]").val();

        if (clave == null || clave == ""){
            alertify.error("Debes proporcionar una clave.");
            return false;
        }
        else{
            //document.getElementById('results_frame').style.display = "inherit";
            return true;
        }
    }
</script>

<h4> Acturalizar Pacientes: </h4>
<s:form name="form_actualizar_paciente" action="obtenerDatosPaciente" method="GET" target="results_frame">
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Clave:</td>
            <td><input style="width:200px;" type="text" name="clave"></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="validateFormCapturar();  iframeGo('actualizarPaciente2.jsp'); resizeFrame(); showFrame();"/>
            </td>
        </tr>
    </table>
</s:form>
