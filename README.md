
-sh-4.2$ oc rsh -n siali-des siali-des-198-g7cd8 /opt/jboss/bin/jboss-cli.sh -c \
>   --command="/subsystem=datasources/data-source=siali-jpa-ds:read-resource(attributes-only=true)" \
>   | grep -E 'connection-url|user-name|jndi-name'
        "connection-url" => "jdbc:postgresql://10.116.18.152:51317/alidb001",
        "jndi-name" => "java:jboss/datasources/siali-jpa-ds",
        "user-name" => "salidb001",
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ }
-sh: erro de sintaxe próximo do `token' não esperado `}'
-sh-4.2$ command terminated with exit code 1
-sh: terminated: comando não encontrado
-sh-4.2$ -sh-4.2$ oc rsh -n siali-des siali-des-198-g7cd8 \
> >   grep -A8 'pool-name="siali-jpa-ds"' /opt/jboss/standalone/configuration/standalone.xml
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ command terminated with exit code 1
-sh: terminated: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$   oc rsh -n siali-des siali-des-198-g7cd8 sh -c \
>   "grep -rl 'siali-jpa-ds' /opt/jboss/standalone/configuration/ 2>/dev/null; ps -ef | grep -o '\-c [^ ]*\|server-config=[^ ]*'"
/opt/jboss/standalone/configuration/standalone_xml_history/standalone-okd.initial.xml
/opt/jboss/standalone/configuration/standalone_xml_history/standalone-okd.last.xml
/opt/jboss/standalone/configuration/standalone_xml_history/standalone-okd.boot.xml
/opt/jboss/standalone/configuration/standalone-okd.xml
-c standalone-okd.xml
-c standalone-okd.xml
-c grep
-c [^
server-config=[^
-c [^
server-config=[^
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh -n siali-des siali-des-198-g7cd8 \
>   timeout 5 bash -c '</dev/tcp/10.116.18.152/51317' && echo ABERTA || echo FECHADA
command terminated with exit code 124
FECHADA
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh -n siali-des siali-des-198-g7cd8 \
>   grep -iE 'PSQLException|FATAL|authentication' /opt/jboss/standalone/log/server.log | tail -20
Caused by: org.postgresql.util.PSQLException: The connection attempt failed.
Caused by: org.postgresql.util.PSQLException: The connection attempt failed.
-sh-4.2$
