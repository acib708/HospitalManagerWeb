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

<h4> Eliminar Paciente: </h4>
<s:form name="form_eliminar_paciente" action="borrarPaciente" method="GET" target="results_frame">
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Clave:</td>
            <td><input style="width:200px;" type="text" name="clave"></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="validateFormCapturar();  iframeGo('../estadoCaptura.jsp'); resizeFrame(); showFrame();"/>
            </td>
        </tr>
    </table>
</s:form>