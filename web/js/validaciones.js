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

/**
 * Created with IntelliJ IDEA.
 * User: danteserna
 * Date: 11/30/13
 * Time: 11:11 PM
 * To change this template use File | Settings | File Templates.
 */
