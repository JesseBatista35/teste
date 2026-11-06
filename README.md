
^C
[root@caddeapllx2862 p585600]# ps -ef | grep -c '[s]tandalone-full-ha.xml'
3
[root@caddeapllx2862 p585600]#
[root@caddeapllx2862 p585600]#
[root@caddeapllx2862 p585600]#
[root@caddeapllx2862 p585600]#
[root@caddeapllx2862 p585600]# ls -la /opt/jboss-eap/standalone/deployments/
total 13800
drwxrwxr-x 2 jboss jboss       91 nov  6 11:05 .
drwxrwxr-x 8 jboss jboss       91 set 30  2024 ..
-rwxrw-rw- 1 jboss jboss 14111803 nov  6 11:05 boletoService-ear.ear
-rw-r--r-- 1 jboss jboss       21 nov  6 11:05 boletoService-ear.ear.deployed
-rwxrwxr-x 1 jboss jboss     8888 jun 23  2021 README.txt
[root@caddeapllx2862 p585600]# ls /opt/jboss-eap/standalone/deployments/ | grep -E '\.(failed|undeployed)$'
[root@caddeapllx2862 p585600]#
[root@caddeapllx2862 p585600]#
[root@caddeapllx2862 p585600]#
[root@caddeapllx2862 p585600]# grep -E 'WFLYUT0021|WFLYSRV0010|WFLYEE0047|NumberFormatException|ClassNotFound' /logs/jboss/jboss-eap/standalone/sigsj-boleto/server.log | tail -20
2026-11-06 11:05:33,900 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 74) WFLYUT0021: Contexto web registrado: '/boletoService' para servidor 'default-server'
2026-11-06 11:05:34,023 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 43) WFLYSRV0010: "boletoService-ear.ear" foi implantado (runtime-name: "boletoService-ear.ear")
[root@caddeapllx2862 p585600]#
[root@caddeapllx2862 p585600]#
[root@caddeapllx2862 p585600]#
[root@caddeapllx2862 p585600]# curl -s -o /dev/null -w '%{http_code}\n' http://localhost/boletoService/
404
[root@caddeapllx2862 p585600]#
[root@caddeapllx2862 p585600]#
[root@caddeapllx2862 p585600]# grep -E 'log4j:ERROR|FileNotFoundException' /logs/jboss/jboss-eap/standalone/sigsj-boleto/server.log | tail -3
2026-11-06 11:05:33,610 ERROR [stderr] (ServerService Thread Pool -- 74) log4j:ERROR Could not parse file [/log_jboss/config-log4j/sigsj_ws_boleto.xml].
2026-11-06 11:05:33,610 ERROR [stderr] (ServerService Thread Pool -- 74) java.io.FileNotFoundException: /log_jboss/config-log4j/sigsj_ws_boleto.xml (Arquivo ou diretório inexistente)
[root@caddeapllx2862 p585600]#
