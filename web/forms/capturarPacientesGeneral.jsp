<%@ taglib prefix="s" uri="/struts-tags" %>

<h3> Capturar Pacientes </h3>
<table  style="width:30%; margin:auto;">
    <tr>
        <td class="text-right">Clave:</td>
        <td><input style="width:200px;" type="text" id="clavePaciente" name="clavePaciente"></td>
    </tr>
    <tr>
        <td class="text-right">Nombre:</td>
        <td><input style="width:200px;" type="text" id="nombre" name="nombre"></td>
    </tr>
    <tr>
        <td class="text-right">Direcci&oacute;n:</td>
        <td><input style="width:200px;" type="text" id="direccion" name="direccion"></td>
    </tr>
    <tr>
        <td class="text-right">Tel&eacute;fono:</td>
        <td><input style="width:200px;" type="text" id="telefono" name="telefono"></td>
    </tr>
    <!--tr>
        <td class="text-right">Foto:</td>
        <td><input style="width:200px;" type="text" name="fotoPaciente"></td>
    </tr-->
    <tr>
        <td></td>
        <td>
            <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="capturarPaciente();"/>
        </td>
    </tr>
</table>

