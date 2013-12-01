<%@ taglib prefix="s" uri="/struts-tags" %>
<script>
    document.getElementById('form_consultar_doctor_clave').submit();

    setTimeout(function resizeFrame (){
        var divResults = document.getElementById('results');
        var iframe     = document.getElementById('results_frame');
        var iframeWin  = iframe.contentWindow || iframe.contentDocument.parentWindow;
        if (iframeWin.document.body) {
            divResults.style.height = iframeWin.document.documentElement.scrollHeight + "px" || iframeWin.document.body.scrollHeight + "px";
        }
    }, 250);
    showFrame();
</script>
<s:form id="form_consultar_doctor_clave" name="form_consultar_doctor_clave" action="consultarDoctorGeneralClave" method="GET" target="results_frame">
</s:form>