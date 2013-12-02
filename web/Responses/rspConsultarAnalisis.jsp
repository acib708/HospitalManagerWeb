<%@ page import="thrift.AnalisisClinico" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<body style="background: #f5f5f5;">
<h3>An&aacute;lisis Clinicos</h3>
<%
    //DBManager dbman = new DBManager();
    //thrift.Doctor[] arrayDoctor = dbman.consultarDoctores();
    AnalisisClinico[] arrayAnalisis = (AnalisisClinico[])request.getAttribute("analisis");

    //Boolean state = (Boolean)request.getAttribute("ans");

    if(arrayAnalisis != null){
%>
<table class="table table-striped">
    <tr>
        <th>Clave An&aacute;lisis</th>
        <th>Tipo</th>
        <th>Descripci&oacute;n</th>
    </tr>
    <%
        for(int i=0; i<arrayAnalisis.length; i++){
    %>
            <tr>
                <td><%=arrayAnalisis[i].getClave()%></td>
                <td><%=arrayAnalisis[i].getTipo()%></td>
                <td><%=arrayAnalisis[i].getDescripcion()%></td>
            </tr>
    <%
        }
    %>
</table>

<%  } else { %>
<h2 style="text-align: center;">No existen an&aacutelisis</h2>
<%  } %>

</body>
</html>