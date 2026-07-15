sh-4.2$
-sh-4.2$ oc rsh siabm-autenticacao-api-des-195-zvv72 -n siabm-des
Error from server (NotFound): pods "siabm-autenticacao-api-des-195-zvv72" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ ls -la $JBOSS_HOME/modules/system/layers/base/org/wildfly/common/main/ ls -la $JBOSS_HOME/modules/system/layers/base/org/jboss/logmanager/main/ echo $JBOSS_HOME
ls: não é possível acessar /modules/system/layers/base/org/wildfly/common/main/: Arquivo ou diretório não encontrado
ls: não é possível acessar ls: Arquivo ou diretório não encontrado
ls: não é possível acessar /modules/system/layers/base/org/jboss/logmanager/main/: Arquivo ou diretório não encontrado
ls: não é possível acessar echo: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh siabm-autenticacao-api-des-195-zvv72 -n siabm-des
Error from server (NotFound): pods "siabm-autenticacao-api-des-195-zvv72" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc debug siabm-autenticacao-api-des-195-zvv72 -n siabm-des
Defaulting container name to siabm-autenticacao-api-des.
Use 'oc describe pod/siabm-autenticacao-api-des-195-zvv72-debug -n siabm-des' to see all of the containers in this pod.

Debugging with pod/siabm-autenticacao-api-des-195-zvv72-debug, original command: <image entrypoint>
Waiting for pod to start ...

^C
Removing debug pod ...
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
