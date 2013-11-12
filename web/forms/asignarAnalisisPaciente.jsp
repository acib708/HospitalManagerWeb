<%@ taglib prefix="s" uri="/struts-tags" %>
<script type="text/javascript">
    function validateFormCapturar(){
        var claveAnalisis   = $("input[name = claveAnalisis]").val();
        var clavePaciente   = $("input[name = clavePaciente]").val();
        var fotoPaciente    = $("input[name = fotoPaciente]").val();
        var fechaAplicacion = $("input[name = fechaAplicacion]").val();
        var fechaEntrega    = $("input[name = fechaEntrega]").val();

        if (claveAnalisis == null || claveAnalisis == ""){
            alertify.error("Debes proporcionar una clave de Analisis.");
            return false;
        }
        else if (clavePaciente == null || clavePaciente == ""){
            alertify.error("Debes proporcionar una clave de thrift.Paciente.");
            return false;
        }
        else if (fotoPaciente == null || fotoPaciente== ""){
            alertify.error("Debes proporcionar una foto del thrift.Paciente.");
            return false;
        }
        else if (fechaAplicacion == null || fechaAplicacion == ""){
            alertify.error("Debes proporcionar una fecha de aplicacion.");
            return false;
        }
        else if (fechaEntrega == null || fechaEntrega == ""){
            alertify.error("Debes proporcionar una fecha de entrega.");
            return false;
        }
        else{
            //document.getElementById('results_frame').style.display = "inherit";
            return true;
        }
    }
</script>

<h4> Asignar An&aacute;lisis a Pacientes: </h4>
<s:form name="form_capturar_seRealiza" action="capturarSeRealiza" method="GET" target="results_frame">
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Clave An&aacute;lisis:</td>
            <td><input style="width:200px;" type="text" name="claveAnalisis"></td>
        </tr>
        <tr>
            <td class="text-right">Clave thrift.Paciente:</td>
            <td><input style="width:200px;" type="text" name="clavePaciente"></td>
        </tr>
        <tr>
            <td class="text-right">Foto thrift.Paciente:</td>
            <td><input style="width:200px;" type="text" name="fotoPaciente"> </td>
        </tr>
        <tr>
            <td class="text-right">Fecha de Aplicaci&oacute;n:</td>
            <td><input style="width:200px;" type="text" name="fechaAplicacion"> </td>
        </tr>
        <tr>
            <td class="text-right">Fecha de Entrega:</td>
            <td><input style="width:200px;" type="text" name="fechaEntrega"> </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="validateFormCapturar();  iframeGo('../estadoCaptura.jsp'); showFrame();"/>
            </td>
        </tr>
    </table>
</s:form>
