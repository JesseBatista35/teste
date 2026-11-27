
-sh-4.2$
-sh-4.2$ oc exec <pod> -n sifap-des -- jcmd 1 Thread.print | grep -A15 'executor-thread' | grep -c 'UniBlockingAwait'
-sh: pod: Arquivo ou diretório não encontrado
0
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ POD=sifap-centralizadora-backend-intranet-des-123-tpf5l
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $POD -n sifap-des -- jcmd -l
time="2026-11-27T17:05:30-03:00" level=error msg="exec failed: unable to start container process: exec: \"jcmd\": executable file not found in $PATH"
command terminated with exit code 255
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $POD -n sifap-des -- jcmd 8 Thread.print > /tmp/sifap-threads.txt
time="2026-11-27T17:05:37-03:00" level=error msg="exec failed: unable to start container process: exec: \"jcmd\": executable file not found in $PATH"
command terminated with exit code 255
-sh-4.2$ grep -c 'UniBlockingAwait' /tmp/sifap-threads.txt
0
-sh-4.2$ grep -c '"executor-thread' /tmp/sifap-threads.txt
0
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $POD -n sifap-des -- kill -3 8
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs $POD -n sifap-des --tail=2000 | grep -c 'UniBlockingAwait'
0
-sh-4.2$
