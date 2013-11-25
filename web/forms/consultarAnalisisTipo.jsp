<%@ taglib prefix="s" uri="/struts-tags" %>
<script type="text/javascript">
    function validateFormCapturar(){
        var tipoAnalisis  = $("input[name = tipoAnalisis]").val();

        if (tipoAnalisis == null || tipoAnalisis == ""){
            alertify.error("Debes proporcionar un tipo de an&aacute;lisis.");
            return false;
        }
        else{
            iframeGo('consultarAnalisisTipo2.jsp');
            resizeFrame();
            showFrame();
            return true;
        }
    }
</script>

<h3> Consulta An&aacute;lisis por tipo </h3>
<s:form name="form_consultar_tipo_analisis" action="consultarAnalisisTipo" method="GET" target="results_frame">
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Tipo:</td>
            <td><input style="width:200px;" type="text" name="tipoAnalisis"></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="return validateFormCapturar();"/>
            </td>
        </tr>
    </table>
</s:form>
