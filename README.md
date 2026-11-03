
[root@cbrdeapllx473 p585600]#
[root@cbrdeapllx473 p585600]#
[root@cbrdeapllx473 p585600]# tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -iE --line-buffered "ERROR|UnrecognizedProperty|Caused by|ERRORCODE"
               URI=/fec-web/resources/js/comp/error.js
17:21:17,626 ERROR [org.jboss.resteasy.plugins.providers.jackson] (default task-23) RESTEASY-JACKSON000100: Not able to deserialize data provided: com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException: Unrecognized field "tipoConsulta" (class br.gov.caixa.arqrefservices.dominio.barramento.contrato.listacontratos.FiltroListaContratos), not marked as ignorable (5 known properties: "TP_CONSULTA", "PARAMETRO", "PESQ_SISTEMAS", "COD_CONVENENTE", "correlationId"])
        at com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException.from(UnrecognizedPropertyException.java:61) [jackson-databind-2.12.7.redhat-00003.jar:2.12.7.redhat-00003]
        at io.undertow.servlet.handlers.SendErrorPageHandler.handleRequest(SendErrorPageHandler.java:52) [undertow-servlet-2.2.37.SP2-redhat-00001.jar:2.2.37.SP2-redhat-00001]
17:21:41,726 ERROR [org.jboss.resteasy.plugins.providers.jackson] (default task-23) RESTEASY-JACKSON000100: Not able to deserialize data provided: com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException: Unrecognized field "tipoConsulta" (class br.gov.caixa.arqrefservices.dominio.barramento.contrato.listacontratos.FiltroListaContratos), not marked as ignorable (5 known properties: "TP_CONSULTA", "PARAMETRO", "PESQ_SISTEMAS", "COD_CONVENENTE", "correlationId"])
        at com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException.from(UnrecognizedPropertyException.java:61) [jackson-databind-2.12.7.redhat-00003.jar:2.12.7.redhat-00003]
        at io.undertow.servlet.handlers.SendErrorPageHandler.handleRequest(SendErrorPageHandler.java:52) [undertow-servlet-2.2.37.SP2-redhat-00001.jar:2.2.37.SP2-redhat-00001]

