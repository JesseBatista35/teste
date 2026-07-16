-sh-4.2$
-sh-4.2$ find /opt/jboss-eap/modules -iname "*postgresql*"
/opt/jboss-eap/modules/system/layers/base/org/postgresql
/opt/jboss-eap/modules/system/layers/base/org/postgresql/main/postgresql-9.1-901.jdbc4.jar-9.1-901.jdbc4.jar
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ cat /opt/jboss-eap/modules/<caminho-do-modulo-postgresql>/module.xml
-sh: caminho-do-modulo-postgresql: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ tail -100 /opt/jboss-eap/standalone/log/server.log
tail: não foi possível abrir “/opt/jboss-eap/standalone/log/server.log” para leitura: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
