<%@ taglib prefix="s" uri="/struts-tags" %>
<script type="text/javascript">
    function validateFormCapturar(){
        var claveAnalisis  = $("input[name = claveAnalisis]").val();

        if (claveAnalisis == null || claveAnalisis == ""){
            alertify.error("Debes proporcionar una clave.");
            return false;
        }
        else{
            //document.getElementById('results_frame').style.display = "inherit";
            return true;
        }
    }
</script>

<h4> Generar Reporte Paciente: </h4>
<s:form name="form_generar_reporte_pacientes_analisis" action="generarReportePacientesAnalisis" method="GET" target="results_frame">
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Clave del An&aacute;lisis:</td>
            <td><input style="width:200px;" type="text" name="claveAnalisis"></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="validateFormCapturar();  iframeGo('reportesPacientesAnalisis2.jsp'); resizeFrame(); showFrame();"/>
            </td>
        </tr>
    </table>
</s:form>