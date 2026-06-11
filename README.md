-sh-4.2$
-sh-4.2$ tail -100 /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | grep -E "ERROR|FAILED|Exception|Caused by|iniciado|interrompido"
tail: não foi possível abrir “/logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log” para leitura: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ /opt/jboss-eap/standalone/
-sh: /opt/jboss-eap/standalone/: É um diretório
-sh-4.2$ ls -ltr
total 0
-sh-4.2$ ls -lth
total 0
-sh-4.2$ ls -ls
total 0
-sh-4.2$ cd /opt/jboss-eap/standalone/
-sh-4.2$ ls -la
total 4
drwxrwxr-x  8 jboss jboss   91 Jun 11 12:44 .
drwxrwxr-x 14 jboss jboss  317 Jun 21  2023 ..
drwxrwxr-x  3 jboss jboss 4096 Jun 11 15:58 configuration
drwxrwxr-x  8 jboss jboss  118 Jun 11 15:58 data
drwxrwxr-x  2 jboss jboss  252 Jun 11 16:01 deployments
drwxrwxr-x  3 jboss jboss   17 Jan  6  2023 lib
drwxr-xr-x  2 root  root    65 Jun 11 12:44 log
drwxrwxr-x  5 jboss jboss   64 Jun 11 16:01 tmp
-sh-4.2$ cd deployments/
-sh-4.2$ ls -la
total 70720
drwxrwxr-x 2 jboss jboss      252 Jun 11 16:01 .
drwxrwxr-x 8 jboss jboss       91 Jun 11 12:44 ..
-rw-r--r-- 1 jboss jboss 37660416 Jun 11 11:13 applicationinsights-agent.jar
-rw-r--r-- 1 jboss jboss        9 Jun 11 16:01 applicationinsights-agent.jar.failed
-rw-r--r-- 1 jboss jboss    66995 Jun 11 11:13 framework.jar
-rw-r--r-- 1 jboss jboss        9 Jun 11 16:01 framework.jar.failed
-rwxrwxr-x 1 jboss jboss     8888 Jun 23  2021 README.txt
-rwxrw-rw- 1 jboss jboss 22593628 Jun 11 15:58 SICMU-ear.ear
-rw-r--r-- 1 root  root      4469 Jun 11 15:58 SICMU-ear.ear.failed
-rw-r--r-- 1 jboss jboss 12054106 Jun 11 11:13 wmq.jmsra.rar
-rw-r--r-- 1 jboss jboss      303 Jun 11 16:01 wmq.jmsra.rar.failed
-sh-4.2$
-sh-4.2$
-sh-4.2$ ^C
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ systemctl status jboss-eap-standalone
Failed to get properties: Operação não permitida
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$


