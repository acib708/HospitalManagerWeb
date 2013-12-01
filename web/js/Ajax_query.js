/**
 * Created with IntelliJ IDEA.
 * User: danteserna
 * Date: 11/30/13
 * Time: 7:28 PM
 * To change this template use File | Settings | File Templates.
 */
var xhr;
var claveDoctor,nombre,direccion,especialidad,telefono,clavePaciente,fecha,diagnostico,tratamiento,clave;

function ajax_borrarDoc(){
    claveDoctor = document.getElementById("claveDoctor").value;
    //alert(claveDoctor);

    iniciarObjetoXmlHttpRequest() ;

    enviarBorrarDoctor()
    return true;
}

function enviarBorrarDoctor()
{
    xhr.onreadystatechange=obtenerDatos;
    //alert(claveDoctor);
    var url = "clave="+claveDoctor;
    xhr.open("POST","borrarDoctor.action",true);
    xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    xhr.send(url);
}

function ajax_getDoc(){
    claveDoctor = document.getElementById("claveDoctor").value;
    //alert(claveDoctor);

    iniciarObjetoXmlHttpRequest() ;

    enviarClaveDoctor()
    return true;
}

function enviarClaveDoctor()
{
    xhr.onreadystatechange=obtenerDatos;
    //alert(claveDoctor);
    xhr.open("GET","consultarDoctorClave.action?claveDoctor="+claveDoctor,true);
    xhr.send(null);

}

function ajax_getEsp(){
    especialidad = document.getElementById("especialidad").value;
    //alert(claveDoctor);

    iniciarObjetoXmlHttpRequest() ;

    enviarEspDoctor()
    return true;
}

function enviarEspDoctor()
{
    xhr.onreadystatechange=obtenerDatos;
    //alert(claveDoctor);
    //xhr.open("GET","consultarDoctorEspecialidad.action?especialidad="+especialidad,true);
    //xhr.send(null);
    var url = "especialidadDoctor="+especialidad;
    xhr.open("POST","consultarDoctorEspecialidad.action",true);
    xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    xhr.send(url);
}

function ajax_capturarDoc(){

    claveDoctor  = document.getElementById("claveDoctor").value;
    nombre       = document.getElementById("nombre").value;
    direccion    = document.getElementById("direccion").value;
    especialidad = document.getElementById("especialidad").value;
    telefono     = document.getElementById("telefono").value;
    //alert(claveDoctor);

    iniciarObjetoXmlHttpRequest() ;

    enviarDatosDoctor();
    return true;
}

function enviarDatosDoctor()
{
    xhr.onreadystatechange=obtenerDatos;
    //alert(claveDoctor);
    var url = "claveDoctor="+claveDoctor+"&nombre="+nombre+"&direccion="+direccion+"&especialidad="+especialidad+"&telefono="+telefono;

    alert(url);

    xhr.open("POST","capturarDoctor.action",true);
    xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    xhr.send(url);
}

function ajax_asignarPaciente(){
    claveDoctor   = document.getElementById("claveDoctor").value;
    clavePaciente = document.getElementById("clavePaciente").value;
    fecha         = document.getElementById("fechaAtiende").value;
    diagnostico   = document.getElementById("diagnostico").value;
    tratamiento   = document.getElementById("tratamiento").value;

    iniciarObjetoXmlHttpRequest() ;

    enviarDatosAsignacion();
    return true;
}

function enviarDatosAsignacion()
{
    xhr.onreadystatechange=obtenerDatos;
    //alert(claveDoctor);
    var url = "claveDoctor="+claveDoctor+"&clavePaciente="+clavePaciente+"&fechaAtiende="+fecha+"&diagnostico="+diagnostico+"&tratamiento="+tratamiento;

    alert(url);

    xhr.open("POST","capturarAtiende.action",true);
    xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    xhr.send(url);
}

function ajax_DocActualizar(){
    clave  = document.getElementById("clave").value;

    iniciarObjetoXmlHttpRequest() ;

    enviarClaveActualizar();
    return true;
}


function enviarClaveActualizar()
{
    xhr.onreadystatechange=obtenerDatos;
    var url = "clave="+clave;

    xhr.open("POST","obtenerDatosDoctor.action",true);
    xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    xhr.send(url);
}

function ajax_GuardarCambios(){
    clave  = document.getElementById("clave").value;
    nombre       = document.getElementById("nombre").value;
    direccion    = document.getElementById("direccion").value;
    especialidad = document.getElementById("especialidad").value;
    telefono     = document.getElementById("telefono").value;

    iniciarObjetoXmlHttpRequest() ;

    enviarDatosActualizar();
    return true;
}

function enviarDatosActualizar()
{
    xhr.onreadystatechange=obtenerDatos;
    var url = "clave="+clave+"&nombre="+nombre+"&direccion="+direccion+"&especialidad="+especialidad+"&telefono="+telefono;

    xhr.open("POST","actualizarDoctor.action",true);
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

function clearDiv(){

    document.getElementById("rAjax").innerHTML="";
}