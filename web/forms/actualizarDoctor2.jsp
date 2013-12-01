<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="thrift.Doctor" %>


<body style="background: #f5f5f5;">
    <h4> Capturar Doctor: </h4>
    <%  String[] arrayEsp = (String[])request.getAttribute("especialidadArray");
        //System.out.println(arrayEsp);
        Doctor doctor = (Doctor)request.getAttribute("doctor");
        if(doctor != null){
    %>
    <!--s:form name="form_actualizar_doctor" action="actualizarDoctor" method="GET" target="results_frame">  -->
        <table  style="width:30%; margin:auto;">
            <tr>
                <td class="text-right">Clave:</td>
                <td><input style="width:200px;" type="text" name="dum" value="<%= doctor.getClave()%>" disabled>
                    <input type="hidden" id="clave" name="clave" value="<%= doctor.getClave()%>">
                </td>
            </tr>
            <tr>
                <td class="text-right">Nombre:</td>
                <td><input style="width:200px;" type="text" id="nombre" name="nombre" value="<%= doctor.getNombre()%>"></td>
            </tr>
            <tr>
                <td class="text-right">Direcci&oacute;n:</td>
                <td><input style="width:200px;" type="text" id="direccion" name="direccion" value="<%= doctor.getDireccion()%>"> </td>
            </tr>
            <tr>
                <td class="text-right">Especialidad:</td>

                <td><select name="especialidad" id="especialidad">
                    <% for (String esp: arrayEsp){
                    %>
                    <option value="<%=esp %>"><%=esp %></option>
                    <%
                        }
                    %>

                </select>
                </td>

                <!--<td><input style="width:200px;" type="text" name="especialidad" value="<%= doctor.getEspecialidad()%>"> </td>  -->
            </tr>
            <tr>
                <td class="text-right">Tel&eacute;fono:</td>
                <td><input style="width:200px;" type="text" id="telefono" name="telefono" value="<%= doctor.getTelefono()%>"></td>
            </tr>
            <!--tr>
                <td class="text-right">Foto:</td>
                <td><input style="width:200px;" type="text" name="foto" value="<%= doctor.getFoto()%>"></td>
            </tr-->
            <tr>
                <td></td>
                <td>
                    <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="actualizarDoctor();"/>
                </td>
            </tr>
        </table>
    <!--/s:form>   -->

    <% } else { %>
    <h2 style="text-align: center;">El doctor no existe.</h2>
    <% } %>
</body>
