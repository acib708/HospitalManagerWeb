<%@ taglib prefix="s" uri="/struts-tags" %>
<script type="text/javascript">
    function validateFormCapturar(){
        var claveAnalisis  = $("input[name = claveAnalisis]").val();
        var descripcion    = $("input[name = descripcion]").val();
        var tipo           = $("input[name = tipo]").val();

        if (claveAnalisis == null || claveAnalisis == ""){
            alertify.error("Debes proporcionar una clave.");
            return false;
        }
        else if (descripcion == null || descripcion == ""){
            alertify.error("Debes proporcionar una descripcion.");
            return false;
        }
        else if (tipo == null || tipo == ""){
            alertify.error("Debes proporcionar un tipo.");
            return false;
        }
        else{
            //document.getElementById('results_frame').style.display = "inherit";
            return true;
        }
    }
</script>

<h4> Capturar Analisis: </h4>
<s:form name="form_capturar_analisis" action="capturarAnalisis" method="GET" target="results_frame">
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Clave:</td>
            <td><input style="width:200px;" type="text" name="claveAnalisis"></td>
        </tr>
        <tr>
            <td class="text-right">Descripcion:</td>
            <td><input style="width:200px;" type="text" name="descripcion"></td>
        </tr>
        <tr>
            <td class="text-right">Tipo:</td>
            <td><input style="width:200px;" type="text" name="tipo"> </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="validateFormCapturar();  iframeGo('../estadoCaptura.jsp'); showFrame();"/>
            </td>
        </tr>
    </table>
</s:form>
