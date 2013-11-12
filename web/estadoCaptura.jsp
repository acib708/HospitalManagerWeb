<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
	<!-- Linking Bootstrap CSS  -->
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css"/>
</head>
<body>
<%  Boolean state = (Boolean)request.getAttribute("ans");
    System.out.println(request.getAttribute("ans"));
	  if(state == false){	  
%>
			<h4>Lo sentimos hubo un error al capturar los datos.</h4>
<%
      }else{
%>
			<h4>Los datos se capturaron correctamente.</h4>
<%
	  }
%>
</body>
</html>
