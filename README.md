
sh-4.2$ ls -la /opt/jboss/standalone/deployments/
total 32160
drwxrwxr-x. 1 185 root       80 Aug  3 17:25 .
drwxrwxr-x. 1 185 root       80 Dec  8  2021 ..
-rwxrwxr--. 1 185 root     8888 Nov  3  2017 README.txt
-rw-r--r--. 1 185 root 24947357 Mar  4 09:54 sispl-canal-webhook-pix.war
-rw-r--r--. 1 185 root       27 Mar  4 09:54 sispl-canal-webhook-pix.war.deployed
-rw-r--r--. 1 185 root  7962030 Mar  4 09:54 wmq.jmsra.rar
-rw-r--r--. 1 185 root       13 Mar  4 09:54 wmq.jmsra.rar.deployed
sh-4.2$
sh-4.2$
sh-4.2$
sh-4.2$
sh-4.2$ curl -v -m 5 http://localhost:8080/<contexto-real>/health
sh: contexto-real: No such file or directory
sh-4.2$
sh-4.2$
sh-4.2$
sh-4.2$ ls -la /opt/jboss/standalone/log/
total 60
drwxrwxr-x. 1 185 root    94 Aug  3 17:24 .
drwxrwxr-x. 1 185 root    80 Dec  8  2021 ..
-rwxrwxr--. 1 185 root     0 Dec  8  2021 audit.log
-rw-r--r--. 1 185 root 16486 Aug  3 17:51 gc.log.0.current
-rw-r--r--. 1 185 root 10487 Aug  3 17:24 server.log
-rwxrwxr--. 1 185 root 27619 Dec  8  2021 server.log.2021-12-08
sh-4.2$
sh-4.2$
sh-4.2$ oc get route -n <namespace> | grep -i pix
sh: syntax error near unexpected token `|'
sh-4.2$
sh-4.2$
sh-4.2$ oc logs <nome-do-pod> -c sispl-canal-webhook-pix-tqs --since=30m | grep -i -E "POST|webhook|pix"
sh: nome-do-pod: No such file or directory
sh-4.2$
