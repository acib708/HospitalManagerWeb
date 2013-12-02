function capturarDoc(){
    var claveDoctor  = $("input[name = claveDoctor]").val();
    //var claveDoctor = document.forms["form_capturar_doctor"]["claveDoctor"].value;
    var nombre	     = $("input[name = nombre]").val();
    var direccion    = $("input[name = direccion]").val();
    var especialidad = $("select[name = especialidad]").val();
    var telefono 	 = $("input[name = telefono]").val();
    //var fotoDoctor	 = $("input[name = fotoDoctor]").val();

    if (claveDoctor == null || claveDoctor == ""){
        alertify.error("Debes proporcionar una clave.");
        return false;
    }
    else if (nombre == null || nombre == ""){
        alertify.error("Debes proporcionar un nombre.");
        return false;
    }
    else if (direccion == null || direccion == ""){
        alertify.error("Debes proporcionar una direccion.");
        return false;
    }
    else if (especialidad == null || especialidad == ""){
        alertify.error("Debes proporcionar una especialidad.");
        return false;
    }
    else if (telefono == null || telefono ==""){
        alertify.error("Debes proporcionar un telefono.");
        return false;
    }
    else if (isNaN(telefono)){
        alertify.error("El telefono debe de ser numerico.");
        return false;
    }
    else{
        ajax_capturarDoc();
        return true;
    }
}

function asignarPaciente(){
    var claveDoctor    = $("select[name = claveDoctor]").val();
    var clavePaciente  = $("select[name = clavePaciente]").val();
    var fecha          = $("input[name = fechaAtiende]").val();
    var diagnostico    = $("input[name = diagnostico]").val();
    var tratamiento    = $("input[name = tratamiento]").val();
    //var fotoDoctor     = $("input[name = fotoDoctor]").val();
    //var fotoPaciente   = $("input[name = fotoPaciente]").val();

    if (clavePaciente == null || clavePaciente == ""){
        alertify.error("Debes proporcionar una clave de Paciente.");
        return false;
    }
    else if (claveDoctor == null || claveDoctor == ""){
        alertify.error("Debes proporcionar una clave de Doctor.");
        return false;
    }
    else if (fecha == null || fecha== ""){
        alertify.error("Debes proporcionar una fecha.");
        return false;
    }
    else if (diagnostico == null || diagnostico == ""){
        alertify.error("Debes proporcionar un diagnostico.");
        return false;
    }
    else if (tratamiento == null || tratamiento == ""){
        alertify.error("Debes proporcionar un tratamiento.");
        return false;
    }
    else{
        ajax_asignarPaciente();
        return true;
    }
}

function actualizarDoctor(){
    var clave          = $("input[name = clave]").val();
    var nombre         = $("input[name = nombre]").val();
    var direccion      = $("input[name = direccion]").val();
    var especialidad   = $("select[name = especialidad]").val();
    var telefono       = $("input[name = telefono]").val();
    //var fotoDoctor     = $("input[name = fotoDoctor]").val();
    //var fotoPaciente   = $("input[name = fotoPaciente]").val();

    if (clave == null || clave == ""){
        alertify.error("Debes proporcionar una clave.");
        return false;
    }
    else if (nombre == null || nombre == ""){
        alertify.error("Debes proporcionar un nombre.");
        return false;
    }
    else if (direccion == null || direccion == ""){
        alertify.error("Debes proporcionar una direccion.");
        return false;
    }
    else if (especialidad == null || especialidad == ""){
        alertify.error("Debes proporcionar una especialidad.");
        return false;
    }
    else if (telefono == null || telefono ==""){
        alertify.error("Debes proporcionar un telefono.");
        return false;
    }
    else if (isNaN(telefono)){
        alertify.error("El telefono debe de ser numerico.");
        return false;
    }
    else{
        ajax_GuardarCambios();
        return true;
    }
}

function capturarPaciente(){
    var clavePaciente = $("input[name = clavePaciente]").val();
    var nombre	      = $("input[name = nombre]").val();
    var direccion     = $("input[name = direccion]").val();
    var telefono 	  = $("input[name = telefono]").val();
    //var fotoPaciente  = $("input[name = fotoPaciente]").val();

    if (clavePaciente == null || clavePaciente == ""){
        alertify.error("Debes proporcionar una clave.");
        return false;
    }
    else if (nombre == null || nombre == ""){
        alertify.error("Debes proporcionar un nombre.");
        return false;
    }
    else if (direccion == null || direccion == ""){
        alertify.error("Debes proporcionar una direccion.");
        return false;
    }
    else if (telefono == null || telefono ==""){
        alertify.error("Debes proporcionar un telefono.");
        return false;
    }
    else if (isNaN(telefono)){
     alertify.error("El telefono debe de ser numerico.");
     return false;
     }
    else{
        ajax_capturarPacientes();
        return true;
    }
}

function asignacionAnalisisPaciente(){
    var claveAnalisis   = $("select[name = claveAnalisis]").val();
    var clavePaciente   = $("select[name = clavePaciente]").val();
    //var fotoPaciente    = $("input[name = fotoPaciente]").val();
    var fechaAplicacion = $("input[name = fechaAplicacion]").val();
    var fechaEntrega    = $("input[name = fechaEntrega]").val();
    var fechaAplic      = new Date(fechaAplicacion);
    var fechaEntre      = new Date(fechaEntrega);

    if (claveAnalisis == null || claveAnalisis == ""){
        alertify.error("Debes proporcionar una clave de Analisis.");
        return false;
    }
    else if (clavePaciente == null || clavePaciente == ""){
        alertify.error("Debes proporcionar una clave de Paciente.");
        return false;
    }
    /*else if (fotoPaciente == null || fotoPaciente== ""){
     alertify.error("Debes proporcionar una foto del Paciente.");
     return false;
     }*/
    else if (fechaAplicacion == null || fechaAplicacion == ""){
        alertify.error("Debes proporcionar una fecha de aplicacion.");
        return false;
    }
    else if (fechaEntrega == null || fechaEntrega == ""){
        alertify.error("Debes proporcionar una fecha de entrega.");
        return false;
    }
    else if (fechaEntre < fechaAplic){
        alertify.error("La fecha de Aplicaci" +
            "on debe ser posterior a la fecha de Entrega");
        return false;
    }
    else{
        ajax_AnalisisPaciente();
        return true;
    }
}

function guardarCambiosPaciente(){
    var claveDoctor  = $("input[name = clave]").val();
    //var claveDoctor = document.forms["form_capturar_doctor"]["claveDoctor"].value;
    var nombre	     = $("input[name = nombre]").val();
    var direccion    = $("input[name = direccion]").val();
    var telefono 	 = $("input[name = telefono]").val();
    //var fotoDoctor	 = $("input[name = fotoDoctor]").val();

    if (claveDoctor == null || claveDoctor == ""){
        alertify.error("Debes proporcionar una clave.");
        return false;
    }
    else if (nombre == null || nombre == ""){
        alertify.error("Debes proporcionar un nombre.");
        return false;
    }
    else if (direccion == null || direccion == ""){
        alertify.error("Debes proporcionar una direccion.");
        return false;
    }
    else if (telefono == null || telefono ==""){
        alertify.error("Debes proporcionar un telefono.");
        return false;
    }
    else if (isNaN(telefono)){
        alertify.error("El telefono debe de ser numerico.");
        return false;
    }
    else{
        ajax_guardarPaciente();
        return true;
    }

}


function guardarAnalisisCambios(){
    var clave       = $("input[name = clave]").val();
    var descripcion = $("input[name = descripcion]").val();
    var tipo        = $("input[name = tipo]").val();

    if (clave == null || clave == ""){
        alertify.error("Debes proporcionar una clave.");
        return false;
    }
    else if (descripcion == null || descripcion == ""){
        alertify.error("Debes proporcionar una descripcion.");
        return false;
    }
    else if (tipo == null || tipo == ""){
        alertify.error("Debes proporcionar un tipo.");
        return false;
    }
    else{
        ajax_guardarAnalisis();
        return true;
    }
}
function capturarAnalisis(){
    var claveAnalisis       = $("input[name = claveAnalisis]").val();
    var descripcion = $("input[name = descripcion]").val();
    var tipo        = $("input[name = tipo]").val();

    if (claveAnalisis == null || clave == ""){
        alertify.error("Debes proporcionar una clave.");
        return false;
    }
    else if (descripcion == null || descripcion == ""){
        alertify.error("Debes proporcionar una descripcion.");
        return false;
    }
    else if (tipo == null || tipo == ""){
        alertify.error("Debes proporcionar un tipo.");
        return false;
    }
    else{
        ajax_capturarAnalisis();
        return true;
    }
}
/**
 * Created with IntelliJ IDEA.
 * User: danteserna
 * Date: 11/30/13
 * Time: 11:11 PM
 * To change this template use File | Settings | File Templates.
 */
