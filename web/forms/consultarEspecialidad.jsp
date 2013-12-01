<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="thrift.Doctor" %>
<%
    //DBManager dbman = new DBManager();
    //thrift.Doctor[] arrayDoctor = dbman.consultarDoctores();
    //Doctor[] arrayDoctor = (Doctor[])request.getAttribute("doctores");
    String[] arrayEsp = (String[])request.getAttribute("especialidad");
    //Boolean state = (Boolean)request.getAttribute("ans");

    /*for (Doctor doc: arrayDoctor){
    System.out.println(doc.getClave());
    }*/
%>

<h3> Consulta Doctor por Especialidad </h3>
<!--s:form name="form_consultar_especialidad" action="consultarDoctorEspecialidad" method="GET" target="results_frame"> -->
    <table  style="width:30%; margin:auto;">
        <tr>
            <td class="text-right">Especialidad:</td>
            <td><select name="especialidad" id="especialidad">
                <% for (String esp: arrayEsp){
                %>
                <option value="<%=esp %>"><%=esp%></option>
                <%
                    }
                %>

            </select>
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" class="btn btn-primary" style="width:200px;" value ="Enviar"  onClick="return ajax_getEsp();"/>
            </td>
        </tr>
    </table>
<!--/s:form> -->