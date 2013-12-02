<%@ taglib prefix="s" uri="/struts-tags" %>
<%
    String[] arrayEspecialidad = (String[])request.getAttribute("especialidad");
%>


<h3> Capturar Doctores </h3>

	<table  style="width:30%; margin:auto;">
		<tr>
			<td class="text-right">Clave:</td>
			<td><input style="width:200px;" type="text" name="claveDoctor" id="claveDoctor"></td>
		</tr>
        <tr>
        	<td class="text-right">Nombre:</td>
            <td><input style="width:200px;" type="text" name="nombre" id="nombre"></td>
        </tr>
        <tr>
        	<td class="text-right">Direcci&oacute;n:</td>
            <td><input style="width:200px;" type="text" name="direccion" id="direccion"> </td>
        </tr>
        <tr>
        	<td class="text-right">Especialidad:</td>
            <td><select style="width:200px;" name="especialidad" id="especialidad">
                <% for (String arrayEsp: arrayEspecialidad ){
                    //System.out.println(arrayEsp);%>
                <option value="<%=arrayEsp %>"><%=arrayEsp%></option>
                <%
                    }
                %>
            </select></td>
        </tr>
        <tr>
        	<td class="text-right">Tel&eacute;fono:</td>
            <td><input style="width:200px;" type="text" name="telefono" id="telefono"></td>
        </tr>
        <tr>
        	<td></td>
        	<td>
				<input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="capturarDoc();" />
        	</td>
        </tr>
     </table>
