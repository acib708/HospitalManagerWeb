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
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css"/>
	<!-- Linking jQuery  -->
	<script src="js/jquery.js"></script>
    <!-- Linking Bootstrap JS  -->
    <script src="bootstrap/js/bootstrap.js"></script>
    <!-- Linking Bootstrap Hover Dropdown Plugin  -->
    <script src="bootstrap/js/twitter-bootstrap-hover-dropdown.js"></script>

	<script src="js/jquery.js" type="text/javascript"></script>
		<script type="text/javascript">
		$(document).ready(function(){
/* 			Doctores */
			$('#capturarDoctores').click(function(){
				$('#forms').load('forms/capturarDoctores.jsp');
				return false;
			});
		    $('#consultarDoctorGeneral').click(function(){
				$('#forms').load('forms/consultarDoctorGeneral.jsp');
				return false;
			});
			$('#consultarClaveDoctores').click(function(){
				$('#forms').load('forms/consultarClaveDoctores.jsp');
				return false;
			});
			$('#consultarEspecialidad').click(function(){
				$('#forms').load('forms/consultarEspecialidad.jsp');
				return false;
			});
			$('#actualizarDoctor').click(function(){
				$('#forms').load('forms/actualizarDoctor.jsp');
				return false;
			});
			$('#borrarDoctor').click(function(){
				$('#forms').load('forms/borrarDoctor.jsp');
				return false;
			});
			$('#asignarPaciente').click(function(){
				$('#forms').load('forms/asignarPaciente.jsp');
				return false;
			});
			$('#consultarAsignaciones').click(function(){
				$('#forms').load('forms/consultarAsignaciones.jsp');
				return false;
			});

/* 			Pacientes */
			$('#capturarPacientes').click(function(){
				$('#forms').load('forms/capturarPacientes.jsp');
				return false;
			});		
			$('#consultarPacientes').click(function(){
				$('#forms').load('forms/consultarPacientes.jsp');
				return false;
			});		
			$('#consultarClavePacientes').click(function(){
				$('#forms').load('forms/consultarClavePacientes.jsp');
				return false;
			});		
			$('#modificarPacientes').click(function(){
				$('#forms').load('forms/actualizarPaciente.jsp');
				return false;
			});
			$('#borrarPaciente').click(function(){
				$('#forms').load('forms/borrarPaciente.jsp');
				return false;
			});		
			$('#asignarAnalisisPaciente').click(function(){
				$('#forms').load('forms/asignarAnalisisPaciente.jsp');
				return false;
			});		
			$('#consultarAnalisisPaciente').click(function(){
				$('#forms').load('forms/consultarAnalisisPaciente.jsp');
				return false;
			});		

/* 			Analisis */
			$('#capturarAnalisis').click(function(){
				$('#forms').load('forms/capturarAnalisis.jsp');
				return false;
			});		
			$('#consultarAnalisis').click(function(){
				$('#forms').load('forms/consultarAnalisis.jsp');
				return false;
			});		
			$('#consultarClaveAnalisis').click(function(){
				$('#forms').load('forms/consultarClaveAnalisis.jsp');
				return false;
			});		
			$('#consultarTipoAnalisis').click(function(){
				$('#forms').load('forms/consultarAnalisisTipo.jsp');
				return false;
			});		
			$('#modificarAnalisis').click(function(){
				$('#forms').load('forms/actualizarAnalisis.jsp');
				return false;
			});		
			$('#eliminarAnalisis').click(function(){
				$('#forms').load('forms/eliminarAnalisis.jsp');
				return false;
			});

/* 			Reportes */
            $('#reportesAnalisisPaciente').click(function(){
                $('#forms').load('forms/reportesAnalisisPaciente.jsp');
                return false;
            });
            $('#reportesDoctoresPaciente').click(function(){
                $('#forms').load('forms/reportesDoctoresPaciente.jsp');
                return false;
            });
            $('#reportesPacientesAnalisis').click(function(){
                $('#forms').load('forms/reportesPacientesAnalisis.jsp');
                return false;
            });
            $('#reportesPacientesDoctor').click(function(){
                $('#forms').load('forms/reportesPacientesDoctor.jsp');
                return false;
            });
        });
		
		function changePillState(clicked){
            var divResults = document.getElementById('results');
            divResults.style.height = "0px";
            document.getElementById('results_frame').style.display 	   = "none";
			document.getElementById("hom").className 			  	   = "disabled";
			document.getElementById("doc").className 			  	   = "dropdown disabled";
			document.getElementById("pac").className 			  	   = "dropdown disabled";
			document.getElementById("ana").className 			  	   = "dropdown disabled";
			document.getElementById("rep").className 			  	   = "dropdown disabled";
			clicked.className = "dropdown active";
		}
		
		function showFrame(){
        
            document.getElementById('results_frame').style.display = "inherit";
        }

        function iframeGo(loc){
            document.getElementById('results_frame').src = loc;
        }

        function resizeFrame(){
            setTimeout(function resize (){
                var divResults = document.getElementById('results');
                var iframe     = document.getElementById('results_frame');
                var iframeWin  = iframe.contentWindow || iframe.contentDocument.parentWindow;
                if (iframeWin.document.body) {
                    divResults.style.height = iframeWin.document.documentElement.scrollHeight + "px" || iframeWin.document.body.scrollHeight + "px";
                }
            }, 250);
            showFrame();
        }
	</script>	
</head>

<body>
	<h1>Hospital Tec</h1>
	<div class="well col-sm-10 col-sm-offset-1">
		<div id="options">
			<ul class="nav nav-pills">
			  <li id="hom" class="active" onclick="changePillState(this);">
					<a href="index.jsp"> P&aacute;gina Principal </a>
			  </li>
<!-- 			  DROPDOWN DOCTORES -->
			  <li id="doc" class="dropdown disabled">
				    <a class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" href="#">
				    	Doctores <b class="caret"></b>
				    </a>
				    <ul class="dropdown-menu">
						<li id="capturarDoctores" class="disabled" onclick="changePillState(document.getElementById('doc'));">
							<a href="forms/capturarDoctores.jsp"> Capturar </a>
						</li>
                        <li id="consultarDoctorGeneral" class="disabled" onclick="changePillState(document.getElementById('doc'));">
                            <a href="forms/consultarDoctorGeneral.jsp"> Consultar</a>
                        </li>
						<li id="consultarClaveDoctores" class="disabled" onclick="changePillState(document.getElementById('doc'));">
							<a href="forms/consultarClaveDoctores.jsp"> Consultar por Clave</a>
						</li>    		
						<li id="consultarEspecialidad" class="disabled" onclick="changePillState(document.getElementById('doc'));">
							<a href="forms/consultarEspecialidad.jsp"> Consultar Especialidad </a>
						</li>    		
						<li id="actualizarDoctor" class="disabled" onclick="changePillState(document.getElementById('doc'));">
							<a href="forms/actualizarDoctor.jsp"> Modificar Doctor</a>
						</li>    	
						<li id="borrarDoctor" class="disabled" onclick="changePillState(document.getElementById('doc'));">
							<a href="forms/borrarDoctor.jsp"> Eliminar Doctor</a>
						</li>    	
						<li id="asignarPaciente" class="disabled" onclick="changePillState(document.getElementById('doc'));">
							<a href="forms/asignarPaciente.jsp"> Asignar Paciente</a>
						</li>    	
						<li id="consultarAsignaciones" class="disabled" onclick="changePillState(document.getElementById('doc'));">
							<a href="forms/consultarAsignaciones.jsp"> Consultar Asignaciones</a>
						</li>    	
				    </ul>
			  </li>
<!-- 			  DROPDOWN PACIENTES -->
			  <li id="pac" class="dropdown disabled">
				    <a class="dropdown-toggle" data-toggle="dropdown" href="#"> 
				    	Pacientes <b class="caret"></b>
				    </a>
				    <ul class="dropdown-menu">
						<li id="capturarPacientes" class="disabled" onclick="changePillState(document.getElementById('pac'));">
							<a href="forms/capturarPacientes.jsp"> Capturar </a>
						</li>    		
						<li id="consultarPacientes" class="disabled" onclick="changePillState(document.getElementById('pac'));">
							<a href="forms/consultarPacientes.jsp"> Consultar</a>
						</li>    		
						<li id="consultarClavePacientes" class="disabled" onclick="changePillState(document.getElementById('pac'));">
							<a href="forms/consultarClavePacientes.jsp"> Consultar por Clave</a>
						</li>    		
						<li id="modificarPacientes" class="disabled" onclick="changePillState(document.getElementById('pac'));">
							<a href="forms/actualizarPaciente.jsp"> Modificar Paciente</a>
						</li>    	
						<li id="borrarPaciente" class="disabled" onclick="changePillState(document.getElementById('pac'));">
							<a href="forms/borrarDoctor.jsp"> Borrar Paciente</a>
						</li>    	
						<li id="asignarAnalisisPaciente" class="disabled" onclick="changePillState(document.getElementById('pac'));">
							<a href="forms/asignarAnalisisPaciente.jsp"> Asignar Analisis a Paciente</a>
						</li>    	
						<li id="consultarAnalisisPaciente" class="disabled" onclick="changePillState(document.getElementById('pac'));">
							<a href="forms/consultarAnalisisPaciente.jsp"> Consultar Analisis</a>
						</li>    	
				    </ul>
			  </li>
<!-- 			  DROPDOWN ANALISIS -->
			  <li id="ana" class="dropdown disabled">
				    <a class="dropdown-toggle" data-toggle="dropdown" href="#"> 
				    	Analisis <b class="caret"></b>
				    </a>
				    <ul class="dropdown-menu">
						<li id="capturarAnalisis" class="disabled" onclick="changePillState(document.getElementById('ana'));">
							<a href="forms/capturarAnalisis.jsp"> Capturar </a>
						</li>    		
						<li id="consultarAnalisis" class="disabled" onclick="changePillState(document.getElementById('ana'));">
							<a href="forms/consultarAnalisis.jsp"> Consultar</a>
						</li>    		
						<li id="consultarClaveAnalisis" class="disabled" onclick="changePillState(document.getElementById('ana'));">
							<a href="forms/consultarClaveAnalisis.jsp"> Consultar por Clave</a>
						</li>    		
						<li id="consultarTipoAnalisis" class="disabled" onclick="changePillState(document.getElementById('ana'));">
							<a href="forms/consultarAnalisis.jsp"> Consultar por Tipo</a>
						</li>    	
						<li id="modificarAnalisis" class="disabled" onclick="changePillState(document.getElementById('ana'));">
							<a href="forms/actualizarAnalisis.jsp"> Modificar Analisis </a>
						</li>    	
						<li id="eliminarAnalisis" class="disabled" onclick="changePillState(document.getElementById('ana'));">
							<a href="forms/eliminarAnalisis.jsp"> Eliminar Analisis</a>
						</li>
				    </ul>
			  </li>

<!-- 			  DROPDOWN REPORTES -->
                <li id="rep" class="dropdown disabled">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        Reportes <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li id="reportesAnalisisPaciente" class="disabled" onclick="changePillState(document.getElementById('rep'));">
                            <a href="forms/reportesAnalisisPaciente.jsp"> Reporte Analisis Paciente </a>
                        </li>
                        <li id="reportesDoctoresPaciente" class="disabled" onclick="changePillState(document.getElementById('rep'));">
                            <a href="forms/reportesDoctoresPaciente.jsp"> Reporte Doctores Paciente</a>
                        </li>
                        <li id="reportesPacientesAnalisis" class="disabled" onclick="changePillState(document.getElementById('rep'));">
                            <a href="forms/reportesPacientesAnalisis.jsp"> Reporte Pacientes Analisis </a>
                        </li>
                        <li id="reportesPacientesDoctor" class="disabled" onclick="changePillState(document.getElementById('rep'));">
                            <a href="forms/reportesPacientesDoctor.jsp"> Reporte Pacientes Doctor </a>
                        </li>
                    </ul>
                </li>
			</ul>
		</div>
		<div id="forms">
		</div>
		<br />
		<div id="results">
			<iframe src="" id="results_frame" name="results_frame">
			</iframe>
		</div>
		</div>
	</div>
</body>
</html>