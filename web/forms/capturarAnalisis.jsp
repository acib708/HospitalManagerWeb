<%@ taglib prefix="s" uri="/struts-tags" %>


<h3> Capturar Analisis </h3>
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Clave:</td>
            <td><input style="width:200px;" type="text" id="claveAnalisis" name="claveAnalisis"></td>
        </tr>
        <tr>
            <td class="text-right">Descripcion:</td>
            <td><input style="width:200px;" type="text" id="descripcion" name="descripcion"></td>
        </tr>
        <tr>
            <td class="text-right">Tipo:</td>
            <td><input style="width:200px;" type="text" id="tipo" name="tipo"> </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="capturarAnalisis();"/>
            </td>
        </tr>
    </table>