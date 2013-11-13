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

<h4> Consulta An&aacute;lisis: </h4>
<s:form name="form_consultar_clave_analisis" action="consultarAnalisisClave" method="GET" target="results_frame">
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Clave:</td>
            <td><input style="width:200px;" type="text" name="claveAnalisis"></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="validateFormCapturar();  iframeGo('consultarClaveAnalisis2.jsp'); resizeFrame(); showFrame();"/>
            </td>
        </tr>
    </table>
</s:form>
