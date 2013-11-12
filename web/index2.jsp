<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<!-- Linking Alertify  -->
	<script src="alertify/lib/alertify.js"></script>
	<link rel="stylesheet" href="alertify/themes/alertify.core.css" />
    <link rel="stylesheet" href="alertify/themes/alertify.bootstrap.css" />
	<!-- Linking Bootstrap CSS  -->
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css"/>
	<!-- Linking jQuery  -->
	<script src="js/jquery.js"></script>
	<!-- Linking Bootstrap JS  -->
	<script src="bootstrap/js/bootstrap.js"></script>

		
	<title>	Hospital Tec </title>
	
	<script src="js/jquery.js" type="text/javascript"></script>
		<script type="text/javascript">
		$(document).ready(function(){
			$('#capturarDoctores').click(function(){
				$('#forms').load('capturarDoctores.jsp');
				return false;
			});
			$('#consultarDoctores').click(function(){
				$('#forms').load('consultarDoctores.jsp');
				return false;
			});
			$('#consultarEspecialidad').click(function(){
				$('#forms').load('consultarEspecialidad.jsp');
				return false;
			});
			$('#modificarDoctores').click(function(){
				$('#forms').load('modificarDoctores.jsp');
				return false;
			});
			$('#eliminarDoctores').click(function(){
				$('#forms').load('eliminarDoctores.jsp');
				return false;
			});
			$('#pac').click(function(){
				$('#forms').load('pacientes.jsp');
				return false;
			});		
			$('#ana').click(function(){
				$('#forms').load('analisis.jsp');
				return false;
			});		
			$('#rep').click(function(){
				$('#forms').load('reportes.jsp');
				return false;
			});
		});
		
		function changePillState(clicked){
			document.getElementById("hom").className 			  = "disabled";
			document.getElementById("capturarDoctores").className = "disabled";
			document.getElementById("consultarDoctores").className = "disabled";
			document.getElementById("consultarEspecialidad").className = "disabled";
			document.getElementById("modificarDoctores").className = "disabled";
			document.getElementById("eliminarDoctores").className = "disabled";
			document.getElementById("pac").className 			  = "disabled";
			document.getElementById("ana").className 			  = "disabled";
			document.getElementById("rep").className 			  = "disabled";
			clicked.className = "active";
		}
	</script>
	
</head>
<body style="text-align:center;">
	<h1>Hospital Tec</h1>
	<div class="well col-sm-10 col-sm-offset-1">
		<div id="options">
		<ul class="nav nav-pills"> 
			<li id="hom" class="active" onclick="changePillState(this);">
				<a href="index.jsp"> P&aacute;gina Principal </a>
			</li>
			<li class="disabled">
				<a href=""> Doctores </a>
			</li>
			<li id="capturarDoctores" class="disabled" onclick="changePillState(this);">
				<a href="forms/capturarDoctores.jsp"> Capturar </a>
			</li>    		
			<li id="consultarDoctores" class="disabled" onclick="changePillState(this);">
				<a href="forms/consultarDoctorGeneral.jsp"> Consultar </a>
			</li>    		
			<li id="consultarEspecialidad" class="disabled" onclick="changePillState(this);">
				<a href="consultarEspecialidad.jsp"> Consultar Especialidad </a>
			</li>    		
			<li id="modificarDoctores" class="disabled" onclick="changePillState(this);">
				<a href="modificarDoctores.jsp"> Modificar thrift.Doctor</a>
			</li>    	
			<li id="eliminarDoctores" class="disabled" onclick="changePillState(this);">
				<a href="eliminarDoctores.jsp"> Eliminar thrift.Doctor</a>
			</li>    	
			<li id="pac" class="disabled" onclick="changePillState(this);">
				<a href="#pacientes.jsp"> Pacientes </a>
			</li>
			<li id="ana" class="disabled" onclick="changePillState(this);">
				<a href="#analisis.jsp">  An&aacute;lisis </a>
			</li>
			<li id="rep" class="disabled" onclick="changePillState(this);">
				<a href="#reportes.jsp">  Reportes </a>
			</li>
		</ul>
		</div>
		<div id="forms">
		</div>
        <div id="results">
        </div>
	</div>
</body>
</html>