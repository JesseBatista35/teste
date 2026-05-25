
16:14:02,615 SEVERE [br.gov.caixa.bsb.sinaf.util.ImpressaoUtil] (default task-39) erro_imprimir_anexo: java.io.IOException: Server returned HTTP response code: 403 for URL: https://siecm.des.caixa/siecm-web/ECM/getDocumento/true/6fd0da726b7e1f7d54c6eb062b0fb5f2b486319c189…

at sun.net.www.protocol.http.HttpURLConnection.getInputStream0(HttpURLConnection.java:1900)

at sun.net.www.protocol.http.HttpURLConnection.getInputStream(HttpURLConnection.java:1498)

at sun.net.www.protocol.https.HttpsURLConnectionImpl.getInputStream(HttpsURLConnectionImpl.java:268)

at java.net.URL.openStream(URL.java:1092)

at org.apache.commons.io.FileUtils.copyURLToFile(FileUtils.java:844)

at br.gov.caixa.bsb.sinaf.util.ImpressaoFleUtil.anexa(ImpressaoFleUtil.java:502)

at br.gov.caixa.bsb.sinaf.util.ImpressaoFleUtil.imprimir(ImpressaoFleUtil.java:178)

