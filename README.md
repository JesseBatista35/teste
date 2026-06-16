[root@caddeapllx1945 /]# ls -la /opt/jboss-eap/standalone/log/ | grep -i error
[root@caddeapllx1945 /]#
[root@caddeapllx1945 /]#
[root@caddeapllx1945 /]# ls -la /opt/jboss-eap/standalone/log/ | grep -i error
[root@caddeapllx1945 /]#
[root@caddeapllx1945 /]#
[root@caddeapllx1945 /]# ^[[200~cat /opt/jboss-eap/standalone/log/* 2>/dev/null | head -200~^C
[root@caddeapllx1945 /]#
[root@caddeapllx1945 /]#
[root@caddeapllx1945 /]#
[root@caddeapllx1945 /]# cat /opt/jboss-eap/standalone/log/* 2>/dev/null | head -200
OpenJDK 64-Bit Server VM (25.402-b06) for linux-amd64 JRE (1.8.0_402-b06), built on Jan 12 2024 11:41:49 by "mockbuild" with gcc 8.5.0 20210514 (Red Hat 8.5.0-18)
Memory: 4k page, physical 3735456k(644016k free), swap 4194300k(4194300k free)
CommandLine flags: -XX:CompressedClassSpaceSize=260046848 -XX:+ExplicitGCInvokesConcurrent -XX:GCLogFileSize=3145728 -XX:InitialHeapSize=1073741824 -XX:MaxGCPauseMillis=500 -XX:MaxHeapSize=2147483648 -XX:MaxMetaspaceSize=268435456 -XX:MetaspaceSize=100663296 -XX:NumberOfGCLogFiles=5 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:-TraceClassUnloading -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseG1GC -XX:+UseGCLogFileRotation
2026-06-16T14:24:47.633-0300: 0,620: [GC pause (G1 Evacuation Pause) (young), 0,0090137 secs]
   [Parallel Time: 7,5 ms, GC Workers: 2]
      [GC Worker Start (ms): Min: 619,8, Avg: 621,5, Max: 623,2, Diff: 3,4]
      [Ext Root Scanning (ms): Min: 0,0, Avg: 0,7, Max: 1,4, Diff: 1,4, Sum: 1,5]
      [Update RS (ms): Min: 0,0, Avg: 0,0, Max: 0,0, Diff: 0,0, Sum: 0,0]
         [Processed Buffers: Min: 0, Avg: 0,0, Max: 0, Diff: 0, Sum: 0]
      [Scan RS (ms): Min: 0,0, Avg: 0,0, Max: 0,0, Diff: 0,0, Sum: 0,0]
      [Code Root Scanning (ms): Min: 0,0, Avg: 0,3, Max: 0,5, Diff: 0,5, Sum: 0,5]
      [Object Copy (ms): Min: 3,8, Avg: 4,6, Max: 5,5, Diff: 1,7, Sum: 9,3]
      [Termination (ms): Min: 0,0, Avg: 0,0, Max: 0,0, Diff: 0,0, Sum: 0,0]
         [Termination Attempts: Min: 1, Avg: 1,0, Max: 1, Diff: 0, Sum: 2]
      [GC Worker Other (ms): Min: 0,0, Avg: 0,2, Max: 0,3, Diff: 0,3, Sum: 0,3]
      [GC Worker Total (ms): Min: 4,1, Avg: 5,8, Max: 7,5, Diff: 3,4, Sum: 11,6]
      [GC Worker End (ms): Min: 627,3, Avg: 627,3, Max: 627,3, Diff: 0,0]
   [Code Root Fixup: 0,0 ms]
   [Code Root Purge: 0,0 ms]
   [Clear CT: 0,0 ms]
   [Other: 1,5 ms]
      [Choose CSet: 0,0 ms]
      [Ref Proc: 1,2 ms]
      [Ref Enq: 0,0 ms]
      [Redirty Cards: 0,0 ms]
      [Humongous Register: 0,0 ms]
      [Humongous Reclaim: 0,0 ms]
      [Free CSet: 0,0 ms]
   [Eden: 52224,0K(52224,0K)->0,0B(45056,0K) Survivors: 0,0B->7168,0K Heap: 52224,0K(1024,0M)->9095,0K(1024,0M)]
 [Times: user=0,02 sys=0,01, real=0,01 secs]
2026-06-16T14:24:47.974-0300: 0,961: [GC pause (G1 Evacuation Pause) (young), 0,0108728 secs]
   [Parallel Time: 9,0 ms, GC Workers: 2]
      [GC Worker Start (ms): Min: 960,7, Avg: 960,7, Max: 960,7, Diff: 0,0]
      [Ext Root Scanning (ms): Min: 1,4, Avg: 1,5, Max: 1,5, Diff: 0,1, Sum: 2,9]
      [Update RS (ms): Min: 0,1, Avg: 0,1, Max: 0,1, Diff: 0,1, Sum: 0,2]
         [Processed Buffers: Min: 1, Avg: 1,0, Max: 1, Diff: 0, Sum: 2]
      [Scan RS (ms): Min: 0,1, Avg: 0,1, Max: 0,1, Diff: 0,0, Sum: 0,1]
      [Code Root Scanning (ms): Min: 0,1, Avg: 0,4, Max: 0,7, Diff: 0,7, Sum: 0,8]
      [Object Copy (ms): Min: 6,6, Avg: 6,9, Max: 7,3, Diff: 0,7, Sum: 13,9]
      [Termination (ms): Min: 0,0, Avg: 0,0, Max: 0,0, Diff: 0,0, Sum: 0,0]
         [Termination Attempts: Min: 1, Avg: 1,0, Max: 1, Diff: 0, Sum: 2]
      [GC Worker Other (ms): Min: 0,0, Avg: 0,0, Max: 0,0, Diff: 0,0, Sum: 0,0]
      [GC Worker Total (ms): Min: 8,9, Avg: 8,9, Max: 8,9, Diff: 0,0, Sum: 17,9]
      [GC Worker End (ms): Min: 969,6, Avg: 969,6, Max: 969,6, Diff: 0,0]
   [Code Root Fixup: 0,0 ms]
   [Code Root Purge: 0,0 ms]
   [Clear CT: 0,0 ms]
   [Other: 1,8 ms]
      [Choose CSet: 0,0 ms]
      [Ref Proc: 1,6 ms]
      [Ref Enq: 0,0 ms]
      [Redirty Cards: 0,0 ms]
      [Humongous Register: 0,0 ms]
      [Humongous Reclaim: 0,0 ms]
      [Free CSet: 0,0 ms]
   [Eden: 45056,0K(45056,0K)->0,0B(71680,0K) Survivors: 7168,0K->7168,0K Heap: 54151,0K(1024,0M)->17827,0K(1024,0M)]
 [Times: user=0,02 sys=0,00, real=0,01 secs]
2026-06-16T14:24:48.180-0300: 1,167: [GC pause (G1 Evacuation Pause) (young), 0,0097112 secs]
   [Parallel Time: 8,0 ms, GC Workers: 2]
      [GC Worker Start (ms): Min: 1167,1, Avg: 1167,1, Max: 1167,1, Diff: 0,0]
      [Ext Root Scanning (ms): Min: 0,8, Avg: 0,9, Max: 1,0, Diff: 0,1, Sum: 1,8]
      [Update RS (ms): Min: 0,2, Avg: 0,3, Max: 0,3, Diff: 0,0, Sum: 0,5]
         [Processed Buffers: Min: 8, Avg: 11,0, Max: 14, Diff: 6, Sum: 22]
      [Scan RS (ms): Min: 0,2, Avg: 0,2, Max: 0,2, Diff: 0,0, Sum: 0,4]
      [Code Root Scanning (ms): Min: 0,0, Avg: 0,0, Max: 0,1, Diff: 0,1, Sum: 0,1]
      [Object Copy (ms): Min: 6,5, Avg: 6,5, Max: 6,6, Diff: 0,1, Sum: 13,1]
      [Termination (ms): Min: 0,0, Avg: 0,0, Max: 0,0, Diff: 0,0, Sum: 0,0]
         [Termination Attempts: Min: 1, Avg: 1,0, Max: 1, Diff: 0, Sum: 2]
      [GC Worker Other (ms): Min: 0,0, Avg: 0,0, Max: 0,0, Diff: 0,0, Sum: 0,0]
      [GC Worker Total (ms): Min: 7,9, Avg: 7,9, Max: 7,9, Diff: 0,0, Sum: 15,9]
      [GC Worker End (ms): Min: 1175,0, Avg: 1175,0, Max: 1175,0, Diff: 0,0]
   [Code Root Fixup: 0,0 ms]
   [Code Root Purge: 0,0 ms]
   [Clear CT: 0,0 ms]
   [Other: 1,7 ms]
      [Choose CSet: 0,0 ms]
      [Ref Proc: 1,5 ms]
      [Ref Enq: 0,0 ms]
      [Redirty Cards: 0,0 ms]
      [Humongous Register: 0,0 ms]
      [Humongous Reclaim: 0,0 ms]
      [Free CSet: 0,0 ms]
   [Eden: 69632,0K(69632,0K)->0,0B(287,0M) Survivors: 7168,0K->10240,0K Heap: 87459,0K(1024,0M)->24576,0K(1024,0M)]
 [Times: user=0,02 sys=0,00, real=0,01 secs]
Heap
 garbage-first heap   total 1048576K, used 137216K [0x0000000080000000, 0x0000000080102000, 0x0000000100000000)
  region size 1024K, 121 young (123904K), 10 survivors (10240K)
 Metaspace       used 46372K, capacity 51164K, committed 51456K, reserved 1093632K
  class space    used 6067K, capacity 7394K, committed 7424K, reserved 1048576K
OpenJDK 64-Bit Server VM (25.402-b06) for linux-amd64 JRE (1.8.0_402-b06), built on Jan 12 2024 11:41:49 by "mockbuild" with gcc 8.5.0 20210514 (Red Hat 8.5.0-18)
Memory: 4k page, physical 3735456k(659560k free), swap 4194300k(4194300k free)
CommandLine flags: -XX:CompressedClassSpaceSize=260046848 -XX:+ExplicitGCInvokesConcurrent -XX:GCLogFileSize=3145728 -XX:InitialHeapSize=1073741824 -XX:MaxGCPauseMillis=500 -XX:MaxHeapSize=2147483648 -XX:MaxMetaspaceSize=268435456 -XX:MetaspaceSize=100663296 -XX:NumberOfGCLogFiles=5 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:-TraceClassUnloading -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseG1GC -XX:+UseGCLogFileRotation
2026-06-16T14:25:29.647-0300: 0,638: [GC pause (G1 Evacuation Pause) (young), 0,0139562 secs]
   [Parallel Time: 5,4 ms, GC Workers: 2]
      [GC Worker Start (ms): Min: 638,4, Avg: 638,4, Max: 638,4, Diff: 0,0]
      [Ext Root Scanning (ms): Min: 1,0, Avg: 1,0, Max: 1,0, Diff: 0,0, Sum: 2,0]
      [Update RS (ms): Min: 0,0, Avg: 0,0, Max: 0,0, Diff: 0,0, Sum: 0,0]
         [Processed Buffers: Min: 0, Avg: 0,0, Max: 0, Diff: 0, Sum: 0]
      [Scan RS (ms): Min: 0,0, Avg: 0,0, Max: 0,0, Diff: 0,0, Sum: 0,0]
      [Code Root Scanning (ms): Min: 0,2, Avg: 0,3, Max: 0,4, Diff: 0,3, Sum: 0,6]
      [Object Copy (ms): Min: 3,9, Avg: 4,0, Max: 4,2, Diff: 0,3, Sum: 8,1]
      [Termination (ms): Min: 0,0, Avg: 0,0, Max: 0,0, Diff: 0,0, Sum: 0,0]
         [Termination Attempts: Min: 1, Avg: 1,0, Max: 1, Diff: 0, Sum: 2]
      [GC Worker Other (ms): Min: 0,0, Avg: 0,0, Max: 0,0, Diff: 0,0, Sum: 0,0]
      [GC Worker Total (ms): Min: 5,3, Avg: 5,3, Max: 5,3, Diff: 0,0, Sum: 10,7]
      [GC Worker End (ms): Min: 643,8, Avg: 643,8, Max: 643,8, Diff: 0,0]
   [Code Root Fixup: 0,0 ms]
   [Code Root Purge: 0,0 ms]
   [Clear CT: 0,0 ms]
   [Other: 8,5 ms]
      [Choose CSet: 0,0 ms]
      [Ref Proc: 2,1 ms]
      [Ref Enq: 0,0 ms]
      [Redirty Cards: 6,2 ms]
      [Humongous Register: 0,0 ms]
      [Humongous Reclaim: 0,0 ms]
      [Free CSet: 0,0 ms]
   [Eden: 52224,0K(52224,0K)->0,0B(45056,0K) Survivors: 0,0B->7168,0K Heap: 52224,0K(1024,0M)->9149,0K(1024,0M)]
 [Times: user=0,01 sys=0,00, real=0,01 secs]
2026-06-16T14:25:29.981-0300: 0,972: [GC pause (GCLocker Initiated GC) (young), 0,0109705 secs]
   [Parallel Time: 7,9 ms, GC Workers: 2]
      [GC Worker Start (ms): Min: 972,4, Avg: 972,4, Max: 972,4, Diff: 0,0]
      [Ext Root Scanning (ms): Min: 1,5, Avg: 1,5, Max: 1,6, Diff: 0,1, Sum: 3,1]
      [Update RS (ms): Min: 0,1, Avg: 0,1, Max: 0,1, Diff: 0,1, Sum: 0,2]
         [Processed Buffers: Min: 1, Avg: 1,0, Max: 1, Diff: 0, Sum: 2]
      [Scan RS (ms): Min: 0,1, Avg: 0,1, Max: 0,1, Diff: 0,0, Sum: 0,1]
      [Code Root Scanning (ms): Min: 0,1, Avg: 0,4, Max: 0,7, Diff: 0,6, Sum: 0,8]
      [Object Copy (ms): Min: 5,4, Avg: 5,8, Max: 6,2, Diff: 0,8, Sum: 11,6]
      [Termination (ms): Min: 0,0, Avg: 0,0, Max: 0,0, Diff: 0,0, Sum: 0,0]
         [Termination Attempts: Min: 1, Avg: 1,0, Max: 1, Diff: 0, Sum: 2]
      [GC Worker Other (ms): Min: 0,0, Avg: 0,0, Max: 0,0, Diff: 0,0, Sum: 0,0]
      [GC Worker Total (ms): Min: 7,9, Avg: 7,9, Max: 7,9, Diff: 0,0, Sum: 15,8]
      [GC Worker End (ms): Min: 980,3, Avg: 980,3, Max: 980,3, Diff: 0,0]
   [Code Root Fixup: 0,0 ms]
   [Code Root Purge: 0,0 ms]
   [Clear CT: 0,0 ms]
   [Other: 2,9 ms]
      [Choose CSet: 0,0 ms]
      [Ref Proc: 2,7 ms]
      [Ref Enq: 0,0 ms]
      [Redirty Cards: 0,0 ms]
      [Humongous Register: 0,0 ms]
      [Humongous Reclaim: 0,0 ms]
      [Free CSet: 0,0 ms]
   [Eden: 47104,0K(45056,0K)->0,0B(71680,0K) Survivors: 7168,0K->7168,0K Heap: 56253,0K(1024,0M)->17839,5K(1024,0M)]
 [Times: user=0,02 sys=0,01, real=0,01 secs]
2026-06-16T14:25:30.189-0300: 1,180: [GC pause (G1 Evacuation Pause) (young), 0,0104535 secs]
   [Parallel Time: 8,8 ms, GC Workers: 2]
      [GC Worker Start (ms): Min: 1180,3, Avg: 1180,8, Max: 1181,2, Diff: 0,9]
      [Ext Root Scanning (ms): Min: 1,2, Avg: 2,1, Max: 3,0, Diff: 1,8, Sum: 4,2]
      [Update RS (ms): Min: 0,0, Avg: 0,2, Max: 0,4, Diff: 0,4, Sum: 0,4]
         [Processed Buffers: Min: 0, Avg: 15,0, Max: 30, Diff: 30, Sum: 30]
      [Scan RS (ms): Min: 0,1, Avg: 0,2, Max: 0,3, Diff: 0,3, Sum: 0,4]
      [Code Root Scanning (ms): Min: 0,0, Avg: 0,0, Max: 0,1, Diff: 0,1, Sum: 0,1]
      [Object Copy (ms): Min: 5,7, Avg: 5,8, Max: 5,9, Diff: 0,2, Sum: 11,7]
      [Termination (ms): Min: 0,0, Avg: 0,0, Max: 0,0, Diff: 0,0, Sum: 0,0]
         [Termination Attempts: Min: 1, Avg: 1,0, Max: 1, Diff: 0, Sum: 2]
      [GC Worker Other (ms): Min: 0,0, Avg: 0,0, Max: 0,0, Diff: 0,0, Sum: 0,0]
      [GC Worker Total (ms): Min: 7,9, Avg: 8,3, Max: 8,8, Diff: 0,9, Sum: 16,7]
      [GC Worker End (ms): Min: 1189,1, Avg: 1189,1, Max: 1189,1, Diff: 0,0]
   [Code Root Fixup: 0,0 ms]
   [Code Root Purge: 0,0 ms]
   [Clear CT: 0,0 ms]
   [Other: 1,6 ms]
      [Choose CSet: 0,0 ms]
      [Ref Proc: 1,4 ms]
      [Ref Enq: 0,0 ms]
      [Redirty Cards: 0,0 ms]
      [Humongous Register: 0,0 ms]
      [Humongous Reclaim: 0,0 ms]
      [Free CSet: 0,0 ms]
   [Eden: 70656,0K(70656,0K)->0,0B(280,0M) Survivors: 7168,0K->10240,0K Heap: 88495,5K(1024,0M)->24576,0K(1024,0M)]
 [Times: user=0,02 sys=0,00, real=0,01 secs]
Heap
 garbage-first heap   total 1048576K, used 136192K [0x0000000080000000, 0x0000000080102000, 0x0000000100000000)
  region size 1024K, 120 young (122880K), 10 survivors (10240K)
 Metaspace       used 46267K, capacity 51112K, committed 51200K, reserved 1093632K
  class space    used 6071K, capacity 7396K, committed 7424K, reserved 1048576K
nohup: ignorando entrada
=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss-eap

  JAVA: java

  JAVA_OPTS:  -verbose:gc -Xloggc:"/opt/jboss-eap/standalone/log/gc.log" -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Djdk.serialFilter="maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000" -Xms1024m -Xmx2048m -XX:MetaspaceSize=96M -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-azurepush-2024-acteste.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager

=========================================================================

[root@caddeapllx1945 /]#
