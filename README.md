
-sh-4.2$ oc exec <pod> -n sifap-des -- jcmd 1 Thread.print | grep -A15 'executor-thread' | grep -c 'UniBlockingAwait'
-sh: pod: Arquivo ou diretório não encontrado
0
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
