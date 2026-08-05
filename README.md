
-sh-4.2$ top -H -p 14729
top - 10:48:10 up 4 days, 21:04,  1 user,  load average: 0,30, 0,19, 0,38
Threads: 118 total,   3 running, 115 sleeping,   0 stopped,   0 zombie
%Cpu(s): 59,3 us,  0,2 sy,  0,0 ni, 40,6 id,  0,0 wa,  0,0 hi,  0,0 si,  0,0 st
KiB Mem :  3880520 total,   568332 free,  2071860 used,  1240328 buff/cache
KiB Swap:  4194300 total,  4193532 free,      768 used.  1501840 avail Mem

  PID USER      PR  NI    VIRT    RES    SHR S %CPU %MEM     TIME+ COMMAND
14738 jboss     20   0 4356432   1,6g  22800 R 80,3 44,4  45:56.31 VM Thread
14732 jboss     20   0 4356432   1,6g  22800 R 19,3 44,4  11:15.15 java
14731 jboss     20   0 4356432   1,6g  22800 R 18,7 44,4  11:15.74 java
15621 jboss     20   0 4356432   1,6g  22800 S  0,3 44,4   0:43.87 reactor-http-ep
14729 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:00.00 java
14730 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:30.99 java
14733 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   3:45.10 java
14734 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:00.70 java
14735 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:01.95 java
14736 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:00.59 java
14737 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:28.93 java
14739 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:00.24 Reference Handl
14740 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:00.18 Finalizer
14741 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:00.00 Surrogate Locke
14742 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:00.00 Signal Dispatch
14743 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:01.55 server-timer
14745 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:10.12 Thread-2
14852 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:00.11 HeartbeatExport
14853 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:00.07 BaseStatsbeat-0
14859 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:00.59 LocalFileLoader
14860 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:00.00 LocalFilePurger
14861 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:02.25 BatchItemProces
14862 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:00.76 PeriodicMetricR
14863 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:00.52 LocalFileLoader
14864 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:00.00 LocalFilePurger
14865 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:11.92 BatchItemProces
14866 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   1:19.20 BatchSpanProces
14867 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   1:17.82 BatchLogProcess
14872 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:00.00 QuickPulseDataS
14873 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:16.72 QuickPulseCoord
14881 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   1:51.49 C2 CompilerThre
14882 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:24.47 C1 CompilerThre
14883 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:00.64 Service Thread
14884 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   2:33.86 VM Periodic Tas
14885 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:00.00 Reference Reape
14888 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:04.95 MSC service thr
14889 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:01.71 MSC service thr
14890 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:01.73 MSC service thr
14891 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:04.75 MSC service thr
14892 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:00.01 ServerDeploymen
14894 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:00.39 ServerService T
14922 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:01.14 ServerService T
14935 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:01.05 DeploymentScann
14936 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   1:16.83 DeploymentScann
14938 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:00.51 ServerService T
14974 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:00.06 management I/O-
14975 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:00.02 management I/O-
14976 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:00.01 management Acce
14978 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:00.00 Timer-0
14979 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:00.07 IdleRemover
14980 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:00.00 ConnectionValid
14983 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:01.64 default I/O-1
14984 jboss     20   0 4356432   1,6g  22800 S  0,0 44,4   0:00.21 default I/O-2
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ tail -100 /logs/jboss/jboss-eap/standalone/sisme/gc.log
tail: não foi possível abrir “/logs/jboss/jboss-eap/standalone/sisme/gc.log” para leitura: Arquivo ou diretório não encontrado
-sh-4.2$ tail -100 /logs/jboss/jboss-eap/standalone/sisme/gc.log.
tail: não foi possível abrir “/logs/jboss/jboss-eap/standalone/sisme/gc.log.” para leitura: Arquivo ou diretório não encontrado
-sh-4.2$ tail -300 /logs/jboss/jboss-eap/standalone/sisme/server.log | grep -iE "timeout|exception|unavailable|refused|pool"
2026-08-05 10:29:47,365 ERROR [org.xnio.listener] (default task-45) XNIO001007: A channel event listener threw an exception: java.lang.OutOfMemoryError: Metaspace
2026-08-05 10:30:14,948 WARNING [javax.enterprise.resource.webcontainer.jsf.application] (default task-45) : java.io.IOException: Pipe quebrado
2026-08-05 10:30:22,248 ERROR [org.xnio.listener] (default task-38) XNIO001007: A channel event listener threw an exception: java.lang.OutOfMemoryError: Metaspace
2026-08-05 10:30:25,206 WARNING [javax.enterprise.resource.webcontainer.jsf.application] (default task-38) : java.io.IOException: Pipe quebrado
2026-08-05 10:30:29,601 ERROR [org.xnio.listener] (default task-24) XNIO001007: A channel event listener threw an exception: java.lang.OutOfMemoryError: Metaspace
2026-08-05 10:31:07,395 ERROR [org.xnio.listener] (default task-24) XNIO001007: A channel event listener threw an exception: java.lang.OutOfMemoryError: Metaspace
2026-08-05 10:33:25,655 WARN  [com.arjuna.ats.jta] (Periodic Recovery) ARJUNA016027: Local XARecoveryModule.xaRecovery got XA exception XAException.XAER_RMFAIL: javax.transaction.xa.XAException
2026-08-05 10:33:30,372 ERROR [org.xnio.listener] (default task-40) XNIO001007: A channel event listener threw an exception: java.lang.OutOfMemoryError: Metaspace
2026-08-05 10:35:34,002 INFO  [stdout] (AggregatingLogger_aggregating logger-0)  * http, none, proxydes.caixa/10.252.32.63:80 => brazilsoutheast-0.in.applicationinsights.azure.com:443, timeout (https://brazilsoutheast-0.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-08-05 10:41:21,061 ERROR [org.xnio.listener] (default task-24) XNIO001007: A channel event listener threw an exception: java.lang.OutOfMemoryError: Metaspace
2026-08-05 10:48:27,691 ERROR [org.xnio.listener] (default task-40) XNIO001007: A channel event listener threw an exception: java.lang.OutOfMemoryError: Metaspace
-sh-4.2$
