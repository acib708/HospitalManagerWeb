<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <script src="alertify/lib/alertify.js"></script>
    <link rel="stylesheet" href="alertify/themes/alertify.core.css" />
    <link rel="stylesheet" href="alertify/themes/alertify.bootstrap.css" />
    <meta charset="US-ASCII">
    <title>Biblioteca Tec</title>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css"/>
    <script type="text/javascript">
        function validateFormCapturar(){
            var clave	   = document.forms["form_libro"]["clave"].value;
            var titulo	   = document.forms["form_libro"]["titulo"].value;
            var autor      = document.forms["form_libro"]["autor"].value;
            var editorial  = document.forms["form_libro"]["editorial"].value;
            var existencia = document.forms["form_libro"]["existencia"].value;
            var imagen	   = document.forms["form_libro"]["imagen"].value;

            if (clave == null || clave == ""){
                alertify.error("Debes de proporcionar una clave.");
                return false;
            }
            else if (isNaN(clave)){
                alertify.error("La clave debe de ser un valor numerico.");
                return false;
            }
            else if (titulo == null || titulo == ""){
                alertify.error("Debes de proporcionar un titulo.");
                return false;
            }
            else if (autor == null || autor == ""){
                alertify.error("Debes de proporcionar un autor.");
                return false;
            }
            else if (editorial == null || editorial == ""){
                alertify.error("Debes de llenar la editorial.");
                return false;
            }
            else if (existencia == null || existencia ==" "){
                alertify.error("Debes de llenar la existencia.");
                return false;
            }
            else if (isNaN(existencia)){
                alertify.error("La existencia debe de ser un valor numerico.");
                return false;
            }
            else if (imagen == null || imagen == ""){
                alertify.error("Debes de llenar campo imagen.");
                return false;
            }
            else return true;
        }

        function validateFormClave(){
            var clave = document.forms["form_libro"]["clave"].value;

            if (clave == null || clave == ""){
                alertify.error("Debes de llenar la clave.");
                return false;
            }
            else if (isNaN(clave)){
                alertify.error("La clave debe de ser un valor numerico.");
                return false;
            }
            else return true;
        }
        function validateFormEditorial(){
            var clave = document.forms["form_libro"]["editorial"].value;

            if (clave == null || clave == ""){
                alertify.error("Debes de llenar la editorial.");
                return false;
            }
            else return true;
        }
    </script>
</head>
<body style="text-align:center;">
<h1>Biblioteca Tec</h1>

<div class="well col-sm-10 col-sm-offset-1">
    <s:form name="form_libro" action="consultar" method="GET" >
        <input type="submit" class="btn btn-primary" value ="Consultar Libros" />
    </s:form><br/>
</div>
</body>
</html>