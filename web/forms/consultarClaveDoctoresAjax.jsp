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
<!-- Linking AJAX_QUERY-->
<script src="js/Ajax_query.js" type="text/javascript"></script>

    <script language="JavaScript" type="text/javascript" src="../bootstrap/js/myScriptFunction.js"></script>
    <!-- Linking Bootstrap JS  -->
    <script src="../bootstrap/js/bootstrap.js"></script>
    <link rel="stylesheet" href="../bootstrap/css/bootstrap.css"/>

<h3>Consulta Doctor</h3>   <br/>
<!-- s:form name="form_consultar_clave_doctor" action="consultarDoctorClave" method="GET" target="results_frame"> -->
<s:form name="form_consultar_clave_doctor" method="GET">
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
</s:form>
