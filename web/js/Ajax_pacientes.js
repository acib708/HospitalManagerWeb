/**
 * Created with IntelliJ IDEA.
 * User: danteserna
 * Date: 12/1/13
 * Time: 3:59 PM
 * To change this template use File | Settings | File Templates.
 */

var xhr;
var clavePaciente,nombre,direccion,telefono,fechaAp,fechaEn,claveAnalisis;

function ajax_capturarPacientes(){

    clavePaciente = document.getElementById("clavePaciente").value;
    nombre        = document.getElementById("nombre").value;
    direccion     = document.getElementById("direccion").value;
    telefono      = document.getElementById("telefono").value;

    iniciarObjetoXmlHttpRequest() ;

    enviarDatosPaciente();
    return true;
}

function enviarDatosPaciente()
{
    xhr.onreadystatechange=obtenerDatos;
    var url = "clavePaciente="+clavePaciente+"&nombre="+nombre+"&direccion="+direccion+"&telefono="+telefono;

    xhr.open("POST","capturarPaciente.action",true);
    xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    xhr.send(url);
}


function ajax_consultarPacienteClave(){

    clavePaciente = document.getElementById("clavePaciente").value;

    iniciarObjetoXmlHttpRequest() ;

    enviarConsultaPaciente();
    return true;
}

function enviarConsultaPaciente()
{
    xhr.onreadystatechange=obtenerDatos;
    var url = "clavePaciente="+clavePaciente;

    xhr.open("POST","consultarPacienteClave.action",true);
    xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    xhr.send(url);
}

function ajax_borrarPaciente(){

    clavePaciente = document.getElementById("clavePaciente").value;

    iniciarObjetoXmlHttpRequest() ;

    enviarBorrarPaciente();
    return true;
}

function enviarBorrarPaciente()
{
    xhr.onreadystatechange=obtenerDatos;
    var url = "clave="+clavePaciente;

    xhr.open("POST","borrarPaciente.action",true);
    xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    xhr.send(url);
}

function ajax_AnalisisPaciente(){

    clavePaciente = document.getElementById("clavePaciente").value;
    claveAnalisis = document.getElementById("claveAnalisis").value;
    fechaAp       = document.getElementById("fechaAplicacion").value;
    fechaEn       = document.getElementById("fechaEntrega").value;

    iniciarObjetoXmlHttpRequest() ;

    enviarAnalisisPaciente();
    return true;
}

function enviarAnalisisPaciente()
{
    xhr.onreadystatechange=obtenerDatos;
    var url = "clavePaciente="+clavePaciente+"&claveAnalisis="+claveAnalisis+"&fechaEntrega="+fechaEn+"&fechaAplicacion="+fechaAp;

    xhr.open("POST","capturarSeRealiza.action",true);
    xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    xhr.send(url);
}

function ajax_ActualizarPaciente(){
    clave  = document.getElementById("clave").value;

    iniciarObjetoXmlHttpRequest() ;

    enviarClaveActualizarPaciente();
    return true;
}


function enviarClaveActualizarPaciente()
{
    xhr.onreadystatechange=obtenerDatos;
    var url = "clave="+clave;

    xhr.open("POST","obtenerDatosPaciente.action",true);
    xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    xhr.send(url);
}

function ajax_guardarPaciente(){
    clave        = document.getElementById("clave").value;
    nombre       = document.getElementById("nombre").value;
    direccion    = document.getElementById("direccion").value;
    telefono     = document.getElementById("telefono").value;

    iniciarObjetoXmlHttpRequest() ;

    enviarDatosActualizarPaciente();
    return true;
}

function enviarDatosActualizarPaciente()
{
    xhr.onreadystatechange=obtenerDatos;
    var url = "clave="+clave+"&nombre="+nombre+"&direccion="+direccion+"&telefono="+telefono;

    xhr.open("POST","actualizarPaciente.action",true);
    xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    xhr.send(url);
}


function iniciarObjetoXmlHttpRequest()
{
    if((window.XMLHttpRequest) || ((typeof XMLHttpRequest) != undefined))
    {
        xhr = new XMLHttpRequest();
    }
    else
    {
        xhr = new ActiveXObject(Microsoft.XMLHTTP);
    }
}

function obtenerDatos()
{
    if(xhr.readyState==4) // && xhr.status==200)
    {

        //alert(xhr.toString());
        document.getElementById("rAjax").innerHTML=xhr.responseText;
    }
    else
        document.getElementById("rAjax").innerHTML="<i>"+"Obteniendo datos..."+"</i>";
}