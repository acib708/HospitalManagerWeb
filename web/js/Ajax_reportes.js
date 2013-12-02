var xhr;
var clavePaciente,claveAnalisis,claveDoctor;

function ajax_RepAnPaciente(){
    clavePaciente = document.getElementById("clavePaciente").value;
    //alert(claveDoctor);

    iniciarObjetoXmlHttpRequest() ;

    enviarReporteClavePaciente()
    return true;
}

function enviarReporteClavePaciente()
{
    xhr.onreadystatechange=obtenerDatos;
    //alert(claveDoctor);
    var url = "clavePaciente="+clavePaciente;

    alert(url);

    xhr.open("POST","generarReporteAnalisisPaciente.action",true);
    xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    xhr.send(url);
}

function ajax_RepDocPaciente(){
    clavePaciente = document.getElementById("clavePaciente").value;
    alert(clavePaciente);

    iniciarObjetoXmlHttpRequest() ;

    enviarReporteDoctoresPaciente()
    return true;
}

function enviarReporteDoctoresPaciente()
{
    xhr.onreadystatechange=obtenerDatos;
    var url = "clavePaciente="+clavePaciente;

    //alert(url);

    xhr.open("POST","generarReporteDoctoresPaciente.action",true);
    xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    xhr.send(url);
}

function ajax_RepPacienteDoctor(){
    claveDoctor = document.getElementById("claveDoctor").value;

    iniciarObjetoXmlHttpRequest() ;

    enviarReporteDoctorPaciente()
    return true;
}

function enviarReporteDoctorPaciente()
{
    xhr.onreadystatechange=obtenerDatos;
    var url = "claveDoctor="+claveDoctor;

    alert(url);

    xhr.open("POST","generarReportePacientesDoctor.action",true);
    xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    xhr.send(url);
}

function ajax_RepPacAnalisis(){
    claveAnalisis = document.getElementById("claveAnalisis").value;
    //alert(claveDoctor);

    iniciarObjetoXmlHttpRequest() ;

    enviarReportePacienteAnalisis()
    return true;
}

function enviarReportePacienteAnalisis()
{
    xhr.onreadystatechange=obtenerDatos;
    //alert(claveDoctor);
    var url = "claveAnalisis="+claveAnalisis;

    alert(url);

    xhr.open("POST","generarReportePacientesAnalisis.action",true);
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
