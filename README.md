
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $POD -n sifap-des -- kill -3 8
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs $POD -n sifap-des --tail=2000 | grep -c 'UniBlockingAwait'
0
-sh-4.2$ oc exec $POD -n sifap-des -- /usr/java/jdk-21.0.1/bin/jcmd 8 Thread.print > /tmp/sifap-threads.txt
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs $POD -n sifap-des --tail=5000 | grep -n 'Full thread dump'
4456:Full thread dump OpenJDK 64-Bit Server VM (21.0.1+12-29 mixed mode, sharing):
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs $POD -n sifap-des --tail=5000 | grep -c '"executor-thread'
2
-sh-4.2$
