/**
 * Created with IntelliJ IDEA.
 * User: danteserna
 * Date: 11/26/13
 * Time: 12:28 PM
 * To change this template use File | Settings | File Templates.
 */

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