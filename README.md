
-sh-4.2$
-sh-4.2$ oc exec -it pod/sispl-consulta-transacao-ocp4-tqs-15-r82zf -n sispl-tqs -- \
> keytool -list -v -keystore /deployments/caixa-truststore-acteste-nprd.jks \
> -storepass changeit | grep -i logintqs
error: invalid resource name "pod/sispl-consulta-transacao-ocp4-tqs-15-r82zf": [may not contain '/']
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -it pod/sispl-consulta-transacao-ocp4-tqs-16-8jlt8 -n sispl-tqs --
error: expected 'exec POD_NAME COMMAND [ARG1] [ARG2] ... [ARGN]'.
POD_NAME and COMMAND are required arguments for the exec command
See 'oc exec -h' for help and examples.
-sh-4.2$ keytool -list -v -keystore /deployments/caixa-truststore-acteste-nprd.jks
erro de keytool: java.lang.Exception: O arquivo da área de armazenamento de chaves não existe. /deployments/caixa-truststore-acteste-nprd.jks
java.lang.Exception: O arquivo da área de armazenamento de chaves não existe. /deployments/caixa-truststore-acteste-nprd.jks
        at sun.security.tools.keytool.Main.doCommands(Main.java:768)
        at sun.security.tools.keytool.Main.run(Main.java:366)
        at sun.security.tools.keytool.Main.main(Main.java:359)
-sh-4.2$ -storepass changeit | grep -i logintqs
-sh: -storepass: comando não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
