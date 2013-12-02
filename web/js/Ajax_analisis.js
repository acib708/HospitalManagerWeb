/**
 * Created with IntelliJ IDEA.
 * User: danteserna
 * Date: 12/1/13
 * Time: 5:59 PM
 * To change this template use File | Settings | File Templates.
 */
var xhr,claveAnalisis,tipo,descripcion;
function ajax_eliminarAnalisis(){
    claveAnalisis = document.getElementById("claveAnalisis").value;

    iniciarObjetoXmlHttpRequest();
    enviarBorrarAnalisis()
    return true;
}

function enviarBorrarAnalisis()
{
    xhr.onreadystatechange=obtenerDatos;
    //alert(claveDoctor);
    var url = "clave="+claveAnalisis;
    xhr.open("POST","borrarAnalisis.action",true);
    xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    xhr.send(url);
}


function ajax_ClaveAnalisisCons(){
    claveAnalisis = document.getElementById("claveAnalisis").value;

    iniciarObjetoXmlHttpRequest() ;

    enviarClaveAnalisisCons();
    return true;
}

function enviarClaveAnalisisCons()
{
    xhr.onreadystatechange=obtenerDatos;
    xhr.open("GET","consultarAnalisisClave.action?claveAnalisis="+claveAnalisis,true);
    xhr.send(null);

}


function ajax_guardarAnalisis(){
    clave        = document.getElementById("clave").value;
    tipo       = document.getElementById("tipo").value;
    descripcion   = document.getElementById("descripcion").value;

    iniciarObjetoXmlHttpRequest() ;

    enviarDatosActualizarAnalisis();
    return true;
}

function enviarDatosActualizarAnalisis()
{
    xhr.onreadystatechange=obtenerDatos;
    var url = "clave="+clave+"&tipo="+tipo+"&descripcion="+descripcion;

    xhr.open("POST","actualizarAnalisis.action",true);
    xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    xhr.send(url);
}

function ajax_capturarAnalisis(){

    claveAnalisis    = document.getElementById("claveAnalisis").value;
    tipo             = document.getElementById("tipo").value;
    descripcion      = document.getElementById("descripcion").value;

    iniciarObjetoXmlHttpRequest() ;

    enviarDatosAnalisis();
    return true;
}

function enviarDatosAnalisis()
{
    xhr.onreadystatechange=obtenerDatos;
    var url = "claveAnalisis="+claveAnalisis+"&tipo="+tipo+"&descripcion="+descripcion;

    xhr.open("POST","capturarAnalisis.action",true);
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



function ajax_modificarAnalisis(){
    clave  = document.getElementById("clave").value;

    iniciarObjetoXmlHttpRequest() ;

    enviarClaveActualizarAnalisis();
    return true;
}


function enviarClaveActualizarAnalisis()
{
    xhr.onreadystatechange=obtenerDatos;
    var url = "clave="+clave;

    xhr.open("POST","obtenerDatosAnalisis.action",true);
    xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    xhr.send(url);
}


