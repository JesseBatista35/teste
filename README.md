
-sh-4.2$ sudo tail -300 /opt/jboss-eap/standalone/log/server.log | grep -E "ERROR|FAILED|Exception|Caused by" | tail -50
tail: não foi possível abrir “/opt/jboss-eap/standalone/log/server.log” para leitura: Arquivo ou diretório não encontrado
-sh-4.2$ ls /opt/jboss-eap/standalone/deployments/*.failed 2>/dev/null
-sh-4.2$ cat /opt/jboss-eap/standalone/deployments/SICMU-ear.ear.f
cat: /opt/jboss-eap/standalone/deployments/SICMU-ear.ear.f: Arquivo ou diretório não encontrado
-sh-4.2$ sudo systemctl list-units | grep -iE "jboss|wildfly|eap
>

