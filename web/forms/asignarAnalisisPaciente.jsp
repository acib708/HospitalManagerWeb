<%@ taglib prefix="s" uri="/struts-tags" %>
<script type="text/javascript">
    function validateFormCapturar(){
        var claveAnalisis   = $("input[name = claveAnalisis]").val();
        var clavePaciente   = $("input[name = clavePaciente]").val();
        //var fotoPaciente    = $("input[name = fotoPaciente]").val();
        var fechaAplicacion = $("input[name = fechaAplicacion]").val();
        var fechaEntrega    = $("input[name = fechaEntrega]").val();
        var fechaAplic      = new Date(fechaAplicacion);
        var fechaEntre      = new Date(fechaEntrega);

        if (claveAnalisis == null || claveAnalisis == ""){
            alertify.error("Debes proporcionar una clave de Analisis.");
            return false;
        }
        else if (clavePaciente == null || clavePaciente == ""){
            alertify.error("Debes proporcionar una clave de Paciente.");
            return false;
        }
        /*else if (fotoPaciente == null || fotoPaciente== ""){
            alertify.error("Debes proporcionar una foto del Paciente.");
            return false;
        }*/
        else if (fechaAplicacion == null || fechaAplicacion == ""){
            alertify.error("Debes proporcionar una fecha de aplicacion.");
            return false;
        }
        else if (fechaEntrega == null || fechaEntrega == ""){
            alertify.error("Debes proporcionar una fecha de entrega.");
            return false;
        }
        else if (fechaEntre < fechaAplic){
            alertify.error("La fecha de Aplicaci" +
                    "on debe ser posterior a la fecha de Entrega");
            return false;
        }
        else{
            iframeGo('../estadoCaptura.jsp');
            resizeFrame();
            showFrame();
            return true;
        }
    }
</script>

<h3> Asignar An&aacute;lisis a Pacientes </h3>
<s:form name="form_capturar_seRealiza" action="capturarSeRealiza" method="GET" target="results_frame">
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Clave An&aacute;lisis:</td>
            <td><input style="width:200px;" type="text" name="claveAnalisis"></td>
        </tr>
        <tr>
            <td class="text-right">Clave Paciente:</td>
            <td><input style="width:200px;" type="text" name="clavePaciente"></td>
        </tr>
        <!--tr>
            <td class="text-right">Foto Paciente:</td>
            <td><input style="width:200px;" type="text" name="fotoPaciente"> </td>
        </tr-->
        <tr>
            <td class="text-right">Fecha de Aplicaci&oacute;n:</td>
            <td><input style="width:200px;" type="date" name="fechaAplicacion"> </td>
        </tr>
        <tr>
            <td class="text-right">Fecha de Entrega:</td>
            <td><input style="width:200px;" type="date" name="fechaEntrega"> </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="return validateFormCapturar();"/>
            </td>
        </tr>
    </table>
</s:form>
