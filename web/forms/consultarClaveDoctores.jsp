<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="thrift.Doctor" %>
<%
    //DBManager dbman = new DBManager();
    //thrift.Doctor[] arrayDoctor = dbman.consultarDoctores();
    Doctor[] arrayDoctor = (Doctor[])request.getAttribute("doctores");

    //Boolean state = (Boolean)request.getAttribute("ans");

    /*for (Doctor doc: arrayDoctor){
    System.out.println(doc.getClave());
    }*/
%>

<h3>Consulta Doctor</h3>   <br/>
<!--<form name="form_consultar_clave_doctor" method="POST" target="rAjax">-->
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Clave:</td>
            <td><select id="claveDoctor" name="claveDoctor">
            <% for (Doctor doc: arrayDoctor){  %>
                <option value="<%=doc.getClave()%>"><%=doc.getClave()%></option>
             <%
            } %>
            </select></td>
            <!--<td><input style="width:200px;" type="text" name="claveDoctor"></td>-->
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="ajax_getDoc();"/>
                <!--<input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="iframeGo('forms/consultarClaveDoctores2.jsp');"/> -->
            </td>
        </tr>
    </table>
<!--</form>    -->
