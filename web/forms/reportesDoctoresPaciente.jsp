<%@ taglib prefix="s" uri="/struts-tags" %>
<script type="text/javascript">
    function validateFormCapturar(){
        var clavePaciente  = $("input[name = clavePaciente]").val();

        if (clavePaciente == null || clavePaciente == ""){
            alertify.error("Debes proporcionar una clave.");
            return false;
        }
        else{
            //document.getElementById('results_frame').style.display = "inherit";
            return true;
        }
    }
</script>

<h4> Generar Reporte Doctores de un Paciente: </h4>
<s:form name="form_generar_reporte_doctores_paciente" action="generarReporteDoctoresPaciente" method="GET" target="results_frame">
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Clave del Paciente:</td>
            <td><input style="width:200px;" type="text" name="clavePaciente"></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="validateFormCapturar();  iframeGo('reportesDoctoresPaciente2.jsp'); resizeFrame(); showFrame();"/>
            </td>
        </tr>
    </table>
</s:form>