sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n sispl-des | grep sispl-processamento-sumarizacao
sispl-processamento-sumarizacao-des-7698dc9cd8-gpqzt   1/1       Running            0                 2m35s
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ^C
-sh-4.2$ oc get pod sispl-processamento-sumarizacao-des-7698dc9cd8-gpqzt -n sispl-des
NAME                                                   READY     STATUS    RESTARTS   AGE
sispl-processamento-sumarizacao-des-7698dc9cd8-gpqzt   1/1       Running   0          3m2s
-sh-4.2$
-sh-4.2$
-sh-4.2$ watch oc get pod sispl-processamento-sumarizacao-des-7698dc9cd8-gpqzt -n sispl-des
Every 2,0s: oc get pod sispl-processamento-sumarizacao-des-7698dc9cd8-gpqzt -n sispl-des                                                                                               Wed Jul 29 11:21:16 2026

NAME                                                   READY     STATUS    RESTARTS   AGE
sispl-processamento-sumarizacao-des-7698dc9cd8-gpqzt   1/1       Running   0          3m35s

