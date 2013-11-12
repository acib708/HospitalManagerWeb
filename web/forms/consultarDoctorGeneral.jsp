<%@ taglib prefix="s" uri="/struts-tags" %>
    <script>
            document.getElementById('form_consultar_doctor').submit();

//          document.getElementById('results').style.height = document.getElementById('results_frame').contentWindow.document.body.scrollHeight + "px";
            setTimeout(function resizeFrame (){
                var divResults = document.getElementById('results');
                var iframe     = document.getElementById('results_frame');
                var iframeWin  = iframe.contentWindow || iframe.contentDocument.parentWindow;
                if (iframeWin.document.body) {
                    divResults.style.height = iframeWin.document.documentElement.scrollHeight + "px" || iframeWin.document.body.scrollHeight + "px";
//                    alert(iframeWin.document.body.scrollHeight + "px");
                }
            }, 250);
           showFrame();
    </script>
<s:form id="form_consultar_doctor" name="form_consultar_doctor" action="consultarDoctorGeneral" method="GET" target="results_frame">
</s:form>