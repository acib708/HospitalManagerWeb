<%@ taglib prefix="s" uri="/struts-tags" %>
<script type="text/javascript">
    function validateFormCapturar(){
        var claveDoctor  = $("input[name = claveDoctor]").val();

        if (claveDoctor == null || claveDoctor == ""){
            alertify.error("Debes proporcionar una clave.");
            return false;
        }
        else{
            //document.getElementById('results_frame').style.display = "inherit";
            return true;
        }
    }
</script>

<h4> Generar Reporte Pacientes de un Doctor: </h4>
<s:form name="form_generar_reporte_pacientes_doctor" action="generarReportePacientesDoctor" method="GET" target="results_frame">
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Clave del Doctor:</td>
            <td><input style="width:200px;" type="text" name="claveDoctor"></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="validateFormCapturar();  iframeGo('reportesPacientesDoctor2.jsp'); resizeFrame(); showFrame();"/>
            </td>
        </tr>
    </table>
</s:form>