
<img width="1241" height="850" alt="image" src="https://github.com/user-attachments/assets/0b9d9a2c-6679-4c06-903f-349c7bd79bc4" />


A LIBRYARY SILIC-v2-backend-tqs (61) ESTAVA COM OS DOIS ESCOPOS


OKD


Jesse Mouta Pereira Batista

Administrator
Home
Overview
Projects
Search
API Explorer
Events
Operators
OperatorHub
Installed Operators
Workloads
Pods
Deployments
DeploymentConfigs
StatefulSets
Secrets
ConfigMaps
CronJobs
Jobs
DaemonSets
ReplicaSets
ReplicationControllers
HorizontalPodAutoscalers
PodDisruptionBudgets
Networking
Services
Routes
Ingresses
NetworkPolicies
Storage
Builds
Observe
Compute
User Management
Administration

Project: silic-tqs
Pods
Pod details
Pod
P
silic-v2-backend-tqs2-tqs-27-gvstl
Running

Actions
Details
Metrics
YAML
Environment
Logs
Events
Terminal
Streaming events...
Showing 13 events
Older events are not stored.
PodPsilic-v2-backend-tqs2-tqs-27-gvstl
NamespaceNSsilic-tqs
2 de set. de 2026, 10:15
Generated from kubelet on ceadecldlx080.nprd.caixa
15 times in the last 2 minutes
Readiness probe failed: HTTP probe failed with statuscode: 503
PodPsilic-v2-backend-tqs2-tqs-27-gvstl
NamespaceNSsilic-tqs
2 de set. de 2026, 10:12
Generated from kubelet on ceadecldlx080.nprd.caixa
Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/silic-v2-backend:0.0.1.2" in 4.577599348s (4.577612687s including waiting)
PodPsilic-v2-backend-tqs2-tqs-27-gvstl
NamespaceNSsilic-tqs
2 de set. de 2026, 10:12
Generated from kubelet on ceadecldlx080.nprd.caixa
Created container silic-v2-backend-tqs2-tqs
PodPsilic-v2-backend-tqs2-tqs-27-gvstl
NamespaceNSsilic-tqs
2 de set. de 2026, 10:12
Generated from kubelet on ceadecldlx080.nprd.caixa
Started container silic-v2-backend-tqs2-tqs
PodPsilic-v2-backend-tqs2-tqs-27-gvstl
NamespaceNSsilic-tqs
2 de set. de 2026, 10:12
Generated from kubelet on ceadecldlx080.nprd.caixa
Pulling image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/silic-v2-backend:0.0.1.2"
PodPsilic-v2-backend-tqs2-tqs-27-gvstl
NamespaceNSsilic-tqs
2 de set. de 2026, 10:12
Generated from kubelet on ceadecldlx080.nprd.caixa
Container image "default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552" already present on machine
PodPsilic-v2-backend-tqs2-tqs-27-gvstl
NamespaceNSsilic-tqs
2 de set. de 2026, 10:12
Generated from kubelet on ceadecldlx080.nprd.caixa
Created container secrets-check
PodPsilic-v2-backend-tqs2-tqs-27-gvstl
NamespaceNSsilic-tqs
2 de set. de 2026, 10:12
Generated from kubelet on ceadecldlx080.nprd.caixa
Started container secrets-check
PodPsilic-v2-backend-tqs2-tqs-27-gvstl
NamespaceNSsilic-tqs
2 de set. de 2026, 10:12
Generated from kubelet on ceadecldlx080.nprd.caixa
Container image "default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.2" already present on machine


exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+UseG1GC -XX:MaxGCPauseMillis=200 -XX:+ParallelRefProcEnabled -XX:+ExitOnOutOfMemoryError -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/tmp -Xlog:gc*,safepoint:stdout:time,level,tags -XX:InitialRAMPercentage=25 -XX:MaxRAMPercentage=55 -cp . -jar /deployments/quarkus-run.jar
[2026-09-02T10:12:47.023-0300][info][gc,heap] Heap region size: 8M
[2026-09-02T10:12:47.058-0300][info][gc     ] Using G1
[2026-09-02T10:12:47.058-0300][info][gc,heap,coops] Heap address: 0x0000000082000000, size: 30688 MB, Compressed Oops mode: Zero based, Oop shift amount: 3
[2026-09-02T10:12:47.059-0300][info][gc,cds       ] Mark closed archive regions in map: [0x00000007ff800000, 0x00000007ff86bff8]
[2026-09-02T10:12:47.059-0300][info][gc,cds       ] Mark open archive regions in map: [0x00000007ff400000, 0x00000007ff448ff8]
[2026-09-02T10:12:47.080-0300][info][safepoint    ] Entering safepoint region: EnableBiasedLocking
[2026-09-02T10:12:47.080-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:47.080-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0001572 seconds, Stopping threads took: 0.0000398 seconds
[2026-09-02T10:12:47.101-0300][info][safepoint    ] Application time: 0.0207842 seconds
[2026-09-02T10:12:47.101-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:47.101-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:47.101-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0002388 seconds, Stopping threads took: 0.0000797 seconds
[2026-09-02T10:12:47.124-0300][info][safepoint    ] Application time: 0.0224345 seconds
[2026-09-02T10:12:47.124-0300][info][safepoint    ] Entering safepoint region: Deoptimize
[2026-09-02T10:12:47.124-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:47.124-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0001248 seconds, Stopping threads took: 0.0000066 seconds
[2026-09-02T10:12:47.514-0300][info][safepoint    ] Application time: 0.3905365 seconds
[2026-09-02T10:12:47.514-0300][info][safepoint    ] Entering safepoint region: Deoptimize
[2026-09-02T10:12:47.515-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:47.515-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0002263 seconds, Stopping threads took: 0.0000097 seconds
[2026-09-02T10:12:47.515-0300][info][safepoint    ] Application time: 0.0002955 seconds
[2026-09-02T10:12:47.515-0300][info][safepoint    ] Entering safepoint region: Deoptimize
[2026-09-02T10:12:47.515-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:47.515-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0001036 seconds, Stopping threads took: 0.0000053 seconds
[2026-09-02T10:12:47.619-0300][info][safepoint    ] Application time: 0.1043030 seconds
[2026-09-02T10:12:47.619-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:47.620-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:47.620-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0003441 seconds, Stopping threads took: 0.0000183 seconds
[2026-09-02T10:12:47.620-0300][info][safepoint    ] Application time: 0.0003049 seconds
[2026-09-02T10:12:47.620-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:47.620-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:47.620-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0001800 seconds, Stopping threads took: 0.0000562 seconds
[2026-09-02T10:12:48.206-0300][info][safepoint    ] Application time: 0.5857300 seconds
[2026-09-02T10:12:48.206-0300][info][safepoint    ] Entering safepoint region: ICBufferFull
[2026-09-02T10:12:48.206-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:48.206-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0002465 seconds, Stopping threads took: 0.0000093 seconds
[2026-09-02T10:12:48.312-0300][info][safepoint    ] Application time: 0.1053572 seconds
[2026-09-02T10:12:48.312-0300][info][safepoint    ] Entering safepoint region: Deoptimize
[2026-09-02T10:12:48.312-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:48.312-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0002944 seconds, Stopping threads took: 0.0000067 seconds
[2026-09-02T10:12:48.855-0300][info][safepoint    ] Application time: 0.5426411 seconds
[2026-09-02T10:12:48.855-0300][info][safepoint    ] Entering safepoint region: CollectForMetadataAllocation
[2026-09-02T10:12:48.855-0300][info][gc,start     ] GC(0) Pause Young (Concurrent Start) (Metadata GC Threshold)
[2026-09-02T10:12:48.857-0300][info][gc,task      ] GC(0) Using 23 workers of 23 for evacuation
[2026-09-02T10:12:49.014-0300][info][gc,phases    ] GC(0)   Pre Evacuate Collection Set: 0.1ms
[2026-09-02T10:12:49.014-0300][info][gc,phases    ] GC(0)   Evacuate Collection Set: 143.3ms
[2026-09-02T10:12:49.014-0300][info][gc,phases    ] GC(0)   Post Evacuate Collection Set: 13.2ms
[2026-09-02T10:12:49.014-0300][info][gc,phases    ] GC(0)   Other: 2.9ms
[2026-09-02T10:12:49.014-0300][info][gc,heap      ] GC(0) Eden regions: 9->0(99)
[2026-09-02T10:12:49.014-0300][info][gc,heap      ] GC(0) Survivor regions: 0->1(13)
[2026-09-02T10:12:49.014-0300][info][gc,heap      ] GC(0) Old regions: 2->2
[2026-09-02T10:12:49.014-0300][info][gc,heap      ] GC(0) Humongous regions: 0->0
[2026-09-02T10:12:49.014-0300][info][gc,metaspace ] GC(0) Metaspace: 19220K->19220K(1069056K)
[2026-09-02T10:12:49.014-0300][info][gc           ] GC(0) Pause Young (Concurrent Start) (Metadata GC Threshold) 72M->12M(16096M) 159.551ms
[2026-09-02T10:12:49.014-0300][info][gc,cpu       ] GC(0) User=0.14s Sys=0.03s Real=0.16s
[2026-09-02T10:12:49.014-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.014-0300][info][gc           ] GC(1) Concurrent Cycle
[2026-09-02T10:12:49.014-0300][info][gc,marking   ] GC(1) Concurrent Clear Claimed Marks
[2026-09-02T10:12:49.014-0300][info][safepoint    ] Total time for which application threads were stopped: 0.1598437 seconds, Stopping threads took: 0.0000078 seconds
[2026-09-02T10:12:49.014-0300][info][gc,marking   ] GC(1) Concurrent Clear Claimed Marks 0.037ms
[2026-09-02T10:12:49.014-0300][info][gc,marking   ] GC(1) Concurrent Scan Root Regions
[2026-09-02T10:12:49.015-0300][info][safepoint    ] Application time: 0.0003183 seconds
[2026-09-02T10:12:49.015-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.015-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.015-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0001674 seconds, Stopping threads took: 0.0000411 seconds
[2026-09-02T10:12:49.015-0300][info][safepoint    ] Application time: 0.0000327 seconds
[2026-09-02T10:12:49.015-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.015-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.015-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0000748 seconds, Stopping threads took: 0.0000026 seconds
[2026-09-02T10:12:49.015-0300][info][safepoint    ] Application time: 0.0000341 seconds
[2026-09-02T10:12:49.015-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.015-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.015-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0001096 seconds, Stopping threads took: 0.0000269 seconds
[2026-09-02T10:12:49.015-0300][info][safepoint    ] Application time: 0.0000287 seconds
[2026-09-02T10:12:49.015-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.015-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.015-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0001105 seconds, Stopping threads took: 0.0000145 seconds
[2026-09-02T10:12:49.015-0300][info][safepoint    ] Application time: 0.0000271 seconds
[2026-09-02T10:12:49.015-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.015-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.015-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0000931 seconds, Stopping threads took: 0.0000044 seconds
[2026-09-02T10:12:49.016-0300][info][safepoint    ] Application time: 0.0000224 seconds
[2026-09-02T10:12:49.016-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.016-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.016-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0001184 seconds, Stopping threads took: 0.0000031 seconds
[2026-09-02T10:12:49.016-0300][info][safepoint    ] Application time: 0.0000351 seconds
[2026-09-02T10:12:49.016-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.016-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.016-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0000914 seconds, Stopping threads took: 0.0000039 seconds
[2026-09-02T10:12:49.016-0300][info][safepoint    ] Application time: 0.0000369 seconds
[2026-09-02T10:12:49.016-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.016-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.016-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0001086 seconds, Stopping threads took: 0.0000363 seconds
[2026-09-02T10:12:49.016-0300][info][safepoint    ] Application time: 0.0000811 seconds
[2026-09-02T10:12:49.016-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.016-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.016-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0001026 seconds, Stopping threads took: 0.0000140 seconds
[2026-09-02T10:12:49.016-0300][info][safepoint    ] Application time: 0.0000231 seconds
[2026-09-02T10:12:49.016-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.016-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.016-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0001296 seconds, Stopping threads took: 0.0000291 seconds
[2026-09-02T10:12:49.016-0300][info][safepoint    ] Application time: 0.0000258 seconds
[2026-09-02T10:12:49.016-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.016-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.016-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0001239 seconds, Stopping threads took: 0.0000221 seconds
[2026-09-02T10:12:49.016-0300][info][safepoint    ] Application time: 0.0000212 seconds
[2026-09-02T10:12:49.017-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.017-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.017-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0001321 seconds, Stopping threads took: 0.0000367 seconds
[2026-09-02T10:12:49.017-0300][info][safepoint    ] Application time: 0.0000245 seconds
[2026-09-02T10:12:49.017-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.017-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.017-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0000867 seconds, Stopping threads took: 0.0000092 seconds
[2026-09-02T10:12:49.017-0300][info][safepoint    ] Application time: 0.0000208 seconds
[2026-09-02T10:12:49.017-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.017-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.017-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0001119 seconds, Stopping threads took: 0.0000314 seconds
[2026-09-02T10:12:49.017-0300][info][safepoint    ] Application time: 0.0000228 seconds
[2026-09-02T10:12:49.017-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.017-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.017-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0001167 seconds, Stopping threads took: 0.0000258 seconds
[2026-09-02T10:12:49.017-0300][info][safepoint    ] Application time: 0.0000459 seconds
[2026-09-02T10:12:49.017-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.017-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.017-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0000993 seconds, Stopping threads took: 0.0000173 seconds
[2026-09-02T10:12:49.017-0300][info][safepoint    ] Application time: 0.0000246 seconds
[2026-09-02T10:12:49.017-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.017-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.017-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0000854 seconds, Stopping threads took: 0.0000118 seconds
[2026-09-02T10:12:49.017-0300][info][gc,marking   ] GC(1) Concurrent Scan Root Regions 2.838ms
[2026-09-02T10:12:49.017-0300][info][gc,marking   ] GC(1) Concurrent Mark (1.998s)
[2026-09-02T10:12:49.017-0300][info][gc,marking   ] GC(1) Concurrent Mark From Roots
[2026-09-02T10:12:49.017-0300][info][safepoint    ] Application time: 0.0000204 seconds
[2026-09-02T10:12:49.017-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.017-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.017-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0000989 seconds, Stopping threads took: 0.0000211 seconds
[2026-09-02T10:12:49.017-0300][info][safepoint    ] Application time: 0.0000228 seconds
[2026-09-02T10:12:49.017-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0000875 seconds, Stopping threads took: 0.0000161 seconds
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Application time: 0.0000204 seconds
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0000881 seconds, Stopping threads took: 0.0000115 seconds
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Application time: 0.0000232 seconds
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0000855 seconds, Stopping threads took: 0.0000029 seconds
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Application time: 0.0000195 seconds
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0000818 seconds, Stopping threads took: 0.0000096 seconds
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Application time: 0.0000237 seconds
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.018-0300][info][gc,task      ] GC(1) Using 6 workers of 6 for marking
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0000897 seconds, Stopping threads took: 0.0000132 seconds
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Application time: 0.0000478 seconds
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0000905 seconds, Stopping threads took: 0.0000148 seconds
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Application time: 0.0000332 seconds
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0000906 seconds, Stopping threads took: 0.0000149 seconds
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Application time: 0.0000312 seconds
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0001088 seconds, Stopping threads took: 0.0000164 seconds
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Application time: 0.0000490 seconds
[2026-09-02T10:12:49.018-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.019-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.019-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0001002 seconds, Stopping threads took: 0.0000044 seconds
[2026-09-02T10:12:49.019-0300][info][safepoint    ] Application time: 0.0000381 seconds
[2026-09-02T10:12:49.019-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.019-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.019-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0001083 seconds, Stopping threads took: 0.0000173 seconds
[2026-09-02T10:12:49.019-0300][info][safepoint    ] Application time: 0.0000329 seconds
[2026-09-02T10:12:49.019-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.019-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.019-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0000831 seconds, Stopping threads took: 0.0000112 seconds
[2026-09-02T10:12:49.019-0300][info][safepoint    ] Application time: 0.0000333 seconds
[2026-09-02T10:12:49.019-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.019-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.019-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0000932 seconds, Stopping threads took: 0.0000098 seconds
[2026-09-02T10:12:49.019-0300][info][safepoint    ] Application time: 0.0000393 seconds
[2026-09-02T10:12:49.019-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.019-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.019-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0001159 seconds, Stopping threads took: 0.0000421 seconds
[2026-09-02T10:12:49.019-0300][info][safepoint    ] Application time: 0.0000643 seconds
[2026-09-02T10:12:49.019-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.019-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.019-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0000886 seconds, Stopping threads took: 0.0000044 seconds
[2026-09-02T10:12:49.019-0300][info][safepoint    ] Application time: 0.0000343 seconds
[2026-09-02T10:12:49.019-0300][info][safepoint    ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:49.019-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.019-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0001024 seconds, Stopping threads took: 0.0000109 seconds
[2026-09-02T10:12:49.020-0300][info][safepoint    ] Application time: 0.0000378 seconds
[2026-09-02T10:12:49.020-0300][info][safepoint    ] Entering safepoint region: BulkRevokeBias
[2026-09-02T10:12:49.020-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.020-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0000979 seconds, Stopping threads took: 0.0000078 seconds
[2026-09-02T10:12:49.104-0300][info][safepoint    ] Application time: 0.0845606 seconds
[2026-09-02T10:12:49.104-0300][info][safepoint    ] Entering safepoint region: CollectForMetadataAllocation
[2026-09-02T10:12:49.104-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.104-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0002644 seconds, Stopping threads took: 0.0000077 seconds
[2026-09-02T10:12:49.105-0300][info][safepoint    ] Application time: 0.0004773 seconds
[2026-09-02T10:12:49.105-0300][info][safepoint    ] Entering safepoint region: CollectForMetadataAllocation
[2026-09-02T10:12:49.105-0300][info][safepoint    ] Leaving safepoint region
[2026-09-02T10:12:49.105-0300][info][safepoint    ] Total time for which application threads were stopped: 0.0001246 seconds, Stopping threads took: 0.0000054 seconds
[2026-09-02T10:12:49.201-0300][info][gc,marking   ] GC(1) Concurrent Mark From Roots 183.533ms
[2026-09-02T10:12:49.201-0300][info][gc,marking   ] GC(1) Concurrent Preclean
[2026-09-02T10:12:49.201-0300][info][gc,marking   ] GC(1) Concurrent Preclean 0.123ms
[2026-09-02T10:12:49.201-0300][info][gc,marking   ] GC(1) Concurrent Mark (1.998s, 2.181s) 183.705ms
[2026-09-02T10:12:49.201-0300][info][safepoint    ] Application time: 0.0959802 seconds
[2026-09-02T10:12:49.201-0300][info][safepoint    ] Entering safepoint region: CGC_Operation
[2026-09-02T10:12:49.201-0300][info][gc,start     ] GC(1) Pause Remark
[2026-09-02T10:12:49.204-0300][info][gc,stringtable] GC(1) Cleaned string and symbol table, strings: 7191 processed, 0 removed, symbols: 57837 processed, 64 removed
[2026-09-02T10:12:49.204-0300][info][gc            ] GC(1) Pause Remark 16M->16M(16096M) 2.950ms
[2026-09-02T10:12:49.204-0300][info][gc,cpu        ] GC(1) User=0.02s Sys=0.00s Real=0.00s
[2026-09-02T10:12:49.204-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:49.204-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0031222 seconds, Stopping threads took: 0.0000212 seconds
[2026-09-02T10:12:49.204-0300][info][gc,marking    ] GC(1) Concurrent Rebuild Remembered Sets
[2026-09-02T10:12:49.205-0300][info][gc,marking    ] GC(1) Concurrent Rebuild Remembered Sets 0.483ms
[2026-09-02T10:12:49.205-0300][info][safepoint     ] Application time: 0.0005298 seconds
[2026-09-02T10:12:49.205-0300][info][safepoint     ] Entering safepoint region: CGC_Operation
[2026-09-02T10:12:49.205-0300][info][gc,start      ] GC(1) Pause Cleanup
[2026-09-02T10:12:49.205-0300][info][gc            ] GC(1) Pause Cleanup 16M->16M(16096M) 0.265ms
[2026-09-02T10:12:49.205-0300][info][gc,cpu        ] GC(1) User=0.00s Sys=0.00s Real=0.00s
[2026-09-02T10:12:49.205-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:49.205-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0004052 seconds, Stopping threads took: 0.0000296 seconds
[2026-09-02T10:12:49.205-0300][info][gc,marking    ] GC(1) Concurrent Cleanup for Next Mark
[2026-09-02T10:12:49.401-0300][info][gc,marking    ] GC(1) Concurrent Cleanup for Next Mark 195.650ms
[2026-09-02T10:12:49.401-0300][info][gc            ] GC(1) Concurrent Cycle 386.549ms
[2026-09-02T10:12:49.450-0300][info][safepoint     ] Application time: 0.2449784 seconds
[2026-09-02T10:12:49.450-0300][info][safepoint     ] Entering safepoint region: Deoptimize
[2026-09-02T10:12:49.451-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:49.451-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0004088 seconds, Stopping threads took: 0.0000077 seconds
[2026-09-02T10:12:49.835-0300][info][safepoint     ] Application time: 0.3843975 seconds
[2026-09-02T10:12:49.835-0300][info][safepoint     ] Entering safepoint region: Deoptimize
[2026-09-02T10:12:49.836-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:49.836-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0004789 seconds, Stopping threads took: 0.0000112 seconds
[2026-09-02T10:12:50.409-0300][info][safepoint     ] Application time: 0.5733862 seconds
[2026-09-02T10:12:50.409-0300][info][safepoint     ] Entering safepoint region: ICBufferFull
[2026-09-02T10:12:50.409-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:50.409-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002143 seconds, Stopping threads took: 0.0000101 seconds
[2026-09-02T10:12:50.905-0300][info][safepoint     ] Application time: 0.4955830 seconds
[2026-09-02T10:12:50.905-0300][info][safepoint     ] Entering safepoint region: ICBufferFull
[2026-09-02T10:12:50.905-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:50.905-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001792 seconds, Stopping threads took: 0.0000079 seconds
[2026-09-02T10:12:50.915-0300][info][safepoint     ] Application time: 0.0099685 seconds
[2026-09-02T10:12:50.915-0300][info][safepoint     ] Entering safepoint region: Deoptimize
[2026-09-02T10:12:50.915-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:50.915-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0004656 seconds, Stopping threads took: 0.0000091 seconds
[2026-09-02T10:12:51.716-0300][info][safepoint     ] Application time: 0.8009835 seconds
[2026-09-02T10:12:51.716-0300][info][safepoint     ] Entering safepoint region: Deoptimize
[2026-09-02T10:12:51.717-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:51.717-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0005023 seconds, Stopping threads took: 0.0000081 seconds
[2026-09-02T10:12:52.712-0300][info][safepoint     ] Application time: 0.9947063 seconds
[2026-09-02T10:12:52.712-0300][info][safepoint     ] Entering safepoint region: Deoptimize
[2026-09-02T10:12:52.712-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:52.712-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0005882 seconds, Stopping threads took: 0.0000237 seconds
[2026-09-02T10:12:52.812-0300][info][safepoint     ] Application time: 0.0992616 seconds
[2026-09-02T10:12:52.812-0300][info][safepoint     ] Entering safepoint region: Deoptimize
[2026-09-02T10:12:52.901-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:52.901-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0893448 seconds, Stopping threads took: 0.0000073 seconds
[2026-09-02T10:12:53.901-0300][info][safepoint     ] Application time: 1.0001399 seconds
[2026-09-02T10:12:53.903-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:12:53.903-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:53.903-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0021158 seconds, Stopping threads took: 0.0019498 seconds
[2026-09-02T10:12:54.412-0300][info][safepoint     ] Application time: 0.5088286 seconds
[2026-09-02T10:12:54.412-0300][info][safepoint     ] Entering safepoint region: ICBufferFull
[2026-09-02T10:12:54.412-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:54.412-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002226 seconds, Stopping threads took: 0.0000438 seconds
[2026-09-02T10:12:54.715-0300][info][safepoint     ] Application time: 0.3024599 seconds
[2026-09-02T10:12:54.715-0300][info][safepoint     ] Entering safepoint region: ICBufferFull
[2026-09-02T10:12:54.715-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:54.715-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002151 seconds, Stopping threads took: 0.0000099 seconds
[2026-09-02T10:12:55.304-0300][info][safepoint     ] Application time: 0.5887609 seconds
[2026-09-02T10:12:55.304-0300][info][safepoint     ] Entering safepoint region: CollectForMetadataAllocation
[2026-09-02T10:12:55.304-0300][info][gc,start      ] GC(2) Pause Young (Concurrent Start) (Metadata GC Threshold)
[2026-09-02T10:12:55.304-0300][info][gc,task       ] GC(2) Using 23 workers of 23 for evacuation
[2026-09-02T10:12:55.409-0300][info][gc,phases     ] GC(2)   Pre Evacuate Collection Set: 0.1ms
[2026-09-02T10:12:55.409-0300][info][gc,phases     ] GC(2)   Evacuate Collection Set: 103.4ms
[2026-09-02T10:12:55.409-0300][info][gc,phases     ] GC(2)   Post Evacuate Collection Set: 1.1ms
[2026-09-02T10:12:55.409-0300][info][gc,phases     ] GC(2)   Other: 0.3ms
[2026-09-02T10:12:55.409-0300][info][gc,heap       ] GC(2) Eden regions: 15->0(97)
[2026-09-02T10:12:55.409-0300][info][gc,heap       ] GC(2) Survivor regions: 1->3(13)
[2026-09-02T10:12:55.409-0300][info][gc,heap       ] GC(2) Old regions: 2->2
[2026-09-02T10:12:55.409-0300][info][gc,heap       ] GC(2) Humongous regions: 0->0
[2026-09-02T10:12:55.409-0300][info][gc,metaspace  ] GC(2) Metaspace: 36240K->36240K(1081344K)
[2026-09-02T10:12:55.409-0300][info][gc            ] GC(2) Pause Young (Concurrent Start) (Metadata GC Threshold) 132M->24M(16096M) 104.993ms
[2026-09-02T10:12:55.409-0300][info][gc,cpu        ] GC(2) User=0.11s Sys=0.01s Real=0.11s
[2026-09-02T10:12:55.409-0300][info][gc            ] GC(3) Concurrent Cycle
[2026-09-02T10:12:55.409-0300][info][gc,marking    ] GC(3) Concurrent Clear Claimed Marks
[2026-09-02T10:12:55.409-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:55.409-0300][info][safepoint     ] Total time for which application threads were stopped: 0.1052654 seconds, Stopping threads took: 0.0000086 seconds
[2026-09-02T10:12:55.409-0300][info][gc,marking    ] GC(3) Concurrent Clear Claimed Marks 0.035ms
[2026-09-02T10:12:55.409-0300][info][gc,marking    ] GC(3) Concurrent Scan Root Regions
[2026-09-02T10:12:55.412-0300][info][gc,marking    ] GC(3) Concurrent Scan Root Regions 2.712ms
[2026-09-02T10:12:55.412-0300][info][gc,marking    ] GC(3) Concurrent Mark (8.392s)
[2026-09-02T10:12:55.412-0300][info][gc,marking    ] GC(3) Concurrent Mark From Roots
[2026-09-02T10:12:55.412-0300][info][gc,task       ] GC(3) Using 6 workers of 6 for marking
[2026-09-02T10:12:55.504-0300][info][safepoint     ] Application time: 0.0950039 seconds
[2026-09-02T10:12:55.504-0300][info][safepoint     ] Entering safepoint region: CollectForMetadataAllocation
[2026-09-02T10:12:55.504-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:55.504-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002455 seconds, Stopping threads took: 0.0000139 seconds
[2026-09-02T10:12:55.505-0300][info][gc,marking    ] GC(3) Concurrent Mark From Roots 92.726ms
[2026-09-02T10:12:55.505-0300][info][gc,marking    ] GC(3) Concurrent Preclean
[2026-09-02T10:12:55.505-0300][info][gc,marking    ] GC(3) Concurrent Preclean 0.101ms
[2026-09-02T10:12:55.505-0300][info][gc,marking    ] GC(3) Concurrent Mark (8.392s, 8.485s) 92.860ms
[2026-09-02T10:12:55.505-0300][info][safepoint     ] Application time: 0.0003561 seconds
[2026-09-02T10:12:55.505-0300][info][safepoint     ] Entering safepoint region: CGC_Operation
[2026-09-02T10:12:55.505-0300][info][gc,start      ] GC(3) Pause Remark
[2026-09-02T10:12:55.520-0300][info][gc,stringtable] GC(3) Cleaned string and symbol table, strings: 14955 processed, 0 removed, symbols: 100047 processed, 93 removed
[2026-09-02T10:12:55.520-0300][info][gc            ] GC(3) Pause Remark 28M->28M(16096M) 15.263ms
[2026-09-02T10:12:55.520-0300][info][gc,cpu        ] GC(3) User=0.08s Sys=0.00s Real=0.02s
[2026-09-02T10:12:55.520-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:55.520-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0154610 seconds, Stopping threads took: 0.0000933 seconds
[2026-09-02T10:12:55.520-0300][info][gc,marking    ] GC(3) Concurrent Rebuild Remembered Sets
[2026-09-02T10:12:55.521-0300][info][gc,marking    ] GC(3) Concurrent Rebuild Remembered Sets 0.368ms
[2026-09-02T10:12:55.521-0300][info][safepoint     ] Application time: 0.0004179 seconds
[2026-09-02T10:12:55.521-0300][info][safepoint     ] Entering safepoint region: CGC_Operation
[2026-09-02T10:12:55.521-0300][info][gc,start      ] GC(3) Pause Cleanup
[2026-09-02T10:12:55.521-0300][info][gc            ] GC(3) Pause Cleanup 28M->28M(16096M) 0.277ms
[2026-09-02T10:12:55.521-0300][info][gc,cpu        ] GC(3) User=0.00s Sys=0.00s Real=0.00s
[2026-09-02T10:12:55.521-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:55.521-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0004388 seconds, Stopping threads took: 0.0000802 seconds
[2026-09-02T10:12:55.521-0300][info][gc,marking    ] GC(3) Concurrent Cleanup for Next Mark
[2026-09-02T10:12:55.709-0300][info][safepoint     ] Application time: 0.1877553 seconds
[2026-09-02T10:12:55.709-0300][info][safepoint     ] Entering safepoint region: Deoptimize
[2026-09-02T10:12:55.710-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:55.710-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0006914 seconds, Stopping threads took: 0.0000089 seconds
[2026-09-02T10:12:55.804-0300][info][gc,marking    ] GC(3) Concurrent Cleanup for Next Mark 282.923ms
[2026-09-02T10:12:55.804-0300][info][gc            ] GC(3) Concurrent Cycle 395.010ms
[2026-09-02T10:12:56.015-0300][info][safepoint     ] Application time: 0.3055712 seconds
[2026-09-02T10:12:56.015-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:56.015-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:56.015-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001704 seconds, Stopping threads took: 0.0000080 seconds
[2026-09-02T10:12:56.424-0300][info][safepoint     ] Application time: 0.4082752 seconds
[2026-09-02T10:12:56.424-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:56.424-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:56.424-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001716 seconds, Stopping threads took: 0.0000082 seconds
[2026-09-02T10:12:57.501-0300][info][safepoint     ] Application time: 1.0770330 seconds
[2026-09-02T10:12:57.501-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:12:57.501-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:57.501-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002576 seconds, Stopping threads took: 0.0000449 seconds
[2026-09-02T10:12:57.510-0300][info][safepoint     ] Application time: 0.0085841 seconds
[2026-09-02T10:12:57.510-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:57.510-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:57.510-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001344 seconds, Stopping threads took: 0.0000089 seconds
[2026-09-02T10:12:57.510-0300][info][safepoint     ] Application time: 0.0000270 seconds
[2026-09-02T10:12:57.510-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:57.510-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:57.510-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001075 seconds, Stopping threads took: 0.0000042 seconds
[2026-09-02T10:12:57.510-0300][info][safepoint     ] Application time: 0.0001152 seconds
[2026-09-02T10:12:57.510-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:57.510-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:57.510-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001031 seconds, Stopping threads took: 0.0000033 seconds
[2026-09-02T10:12:57.510-0300][info][safepoint     ] Application time: 0.0000946 seconds
[2026-09-02T10:12:57.510-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:57.510-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:57.510-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000966 seconds, Stopping threads took: 0.0000035 seconds
[2026-09-02T10:12:57.510-0300][info][safepoint     ] Application time: 0.0000283 seconds
[2026-09-02T10:12:57.510-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:57.511-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:57.511-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000828 seconds, Stopping threads took: 0.0000039 seconds
[2026-09-02T10:12:57.511-0300][info][safepoint     ] Application time: 0.0001143 seconds
[2026-09-02T10:12:57.511-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:57.511-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:57.511-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000969 seconds, Stopping threads took: 0.0000042 seconds
[2026-09-02T10:12:57.511-0300][info][safepoint     ] Application time: 0.0003567 seconds
[2026-09-02T10:12:57.511-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:57.511-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:57.511-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000781 seconds, Stopping threads took: 0.0000030 seconds
[2026-09-02T10:12:57.607-0300][info][safepoint     ] Application time: 0.0960946 seconds
[2026-09-02T10:12:57.607-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:57.608-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:57.608-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001560 seconds, Stopping threads took: 0.0000219 seconds
[2026-09-02T10:12:57.711-0300][info][safepoint     ] Application time: 0.1034443 seconds
[2026-09-02T10:12:57.711-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:57.712-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:57.712-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0007020 seconds, Stopping threads took: 0.0000091 seconds
[2026-09-02T10:12:57.713-0300][info][safepoint     ] Application time: 0.0014291 seconds
[2026-09-02T10:12:57.713-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:57.713-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:57.713-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001068 seconds, Stopping threads took: 0.0000058 seconds
[2026-09-02T10:12:57.713-0300][info][safepoint     ] Application time: 0.0000234 seconds
[2026-09-02T10:12:57.713-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:57.713-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:57.713-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000879 seconds, Stopping threads took: 0.0000032 seconds
[2026-09-02T10:12:57.713-0300][info][safepoint     ] Application time: 0.0000246 seconds
[2026-09-02T10:12:57.713-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:57.714-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:57.714-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000709 seconds, Stopping threads took: 0.0000031 seconds
[2026-09-02T10:12:57.714-0300][info][safepoint     ] Application time: 0.0000306 seconds
[2026-09-02T10:12:57.714-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:57.714-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:57.714-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000676 seconds, Stopping threads took: 0.0000030 seconds
[2026-09-02T10:12:57.714-0300][info][safepoint     ] Application time: 0.0000960 seconds
[2026-09-02T10:12:57.714-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:57.714-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:57.714-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000747 seconds, Stopping threads took: 0.0000031 seconds
[2026-09-02T10:12:57.803-0300][info][safepoint     ] Application time: 0.0892897 seconds
[2026-09-02T10:12:57.803-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:57.803-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:57.803-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001401 seconds, Stopping threads took: 0.0000293 seconds
[2026-09-02T10:12:57.916-0300][info][safepoint     ] Application time: 0.1127285 seconds
[2026-09-02T10:12:57.916-0300][info][safepoint     ] Entering safepoint region: Deoptimize
[2026-09-02T10:12:57.917-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:57.917-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0007652 seconds, Stopping threads took: 0.0000114 seconds
[2026-09-02T10:12:58.007-0300][info][safepoint     ] Application time: 0.0898727 seconds
[2026-09-02T10:12:58.007-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.007-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.007-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0006010 seconds, Stopping threads took: 0.0000398 seconds
[2026-09-02T10:12:58.008-0300][info][safepoint     ] Application time: 0.0003139 seconds
[2026-09-02T10:12:58.008-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.008-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.008-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001297 seconds, Stopping threads took: 0.0000486 seconds
[2026-09-02T10:12:58.008-0300][info][safepoint     ] Application time: 0.0003385 seconds
[2026-09-02T10:12:58.008-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.008-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.008-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001007 seconds, Stopping threads took: 0.0000065 seconds
[2026-09-02T10:12:58.008-0300][info][safepoint     ] Application time: 0.0000986 seconds
[2026-09-02T10:12:58.008-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.008-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.008-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000780 seconds, Stopping threads took: 0.0000154 seconds
[2026-09-02T10:12:58.008-0300][info][safepoint     ] Application time: 0.0000627 seconds
[2026-09-02T10:12:58.009-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.009-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.009-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001692 seconds, Stopping threads took: 0.0001018 seconds
[2026-09-02T10:12:58.009-0300][info][safepoint     ] Application time: 0.0000307 seconds
[2026-09-02T10:12:58.009-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.009-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.009-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000877 seconds, Stopping threads took: 0.0000206 seconds
[2026-09-02T10:12:58.009-0300][info][safepoint     ] Application time: 0.0000290 seconds
[2026-09-02T10:12:58.009-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.009-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.009-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001244 seconds, Stopping threads took: 0.0000217 seconds
[2026-09-02T10:12:58.009-0300][info][safepoint     ] Application time: 0.0003127 seconds
[2026-09-02T10:12:58.009-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.009-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.009-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001036 seconds, Stopping threads took: 0.0000266 seconds
[2026-09-02T10:12:58.111-0300][info][safepoint     ] Application time: 0.1017066 seconds
[2026-09-02T10:12:58.111-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.111-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.111-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000970 seconds, Stopping threads took: 0.0000097 seconds
[2026-09-02T10:12:58.123-0300][info][safepoint     ] Application time: 0.0116444 seconds
[2026-09-02T10:12:58.123-0300][info][safepoint     ] Entering safepoint region: Deoptimize
[2026-09-02T10:12:58.124-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.124-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0007157 seconds, Stopping threads took: 0.0000080 seconds
[2026-09-02T10:12:58.128-0300][info][safepoint     ] Application time: 0.0046185 seconds
[2026-09-02T10:12:58.128-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.128-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.128-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001181 seconds, Stopping threads took: 0.0000336 seconds
[2026-09-02T10:12:58.329-0300][info][safepoint     ] Application time: 0.2008846 seconds
[2026-09-02T10:12:58.329-0300][info][safepoint     ] Entering safepoint region: Deoptimize
[2026-09-02T10:12:58.330-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.330-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0007691 seconds, Stopping threads took: 0.0000102 seconds
[2026-09-02T10:12:58.331-0300][info][safepoint     ] Application time: 0.0005200 seconds
[2026-09-02T10:12:58.331-0300][info][safepoint     ] Entering safepoint region: Deoptimize
[2026-09-02T10:12:58.331-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.331-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002679 seconds, Stopping threads took: 0.0000043 seconds
[2026-09-02T10:12:58.831-0300][info][safepoint     ] Application time: 0.5001100 seconds
[2026-09-02T10:12:58.836-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.836-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.836-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0047951 seconds, Stopping threads took: 0.0046049 seconds
[2026-09-02T10:12:58.836-0300][info][safepoint     ] Application time: 0.0006552 seconds
[2026-09-02T10:12:58.837-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.837-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.837-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001835 seconds, Stopping threads took: 0.0000608 seconds
[2026-09-02T10:12:58.837-0300][info][safepoint     ] Application time: 0.0002651 seconds
[2026-09-02T10:12:58.837-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.837-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.837-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001290 seconds, Stopping threads took: 0.0000311 seconds
[2026-09-02T10:12:58.837-0300][info][safepoint     ] Application time: 0.0002744 seconds
[2026-09-02T10:12:58.837-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.838-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.838-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001875 seconds, Stopping threads took: 0.0000763 seconds
[2026-09-02T10:12:58.838-0300][info][safepoint     ] Application time: 0.0000792 seconds
[2026-09-02T10:12:58.838-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.838-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.838-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001656 seconds, Stopping threads took: 0.0000543 seconds
[2026-09-02T10:12:58.838-0300][info][safepoint     ] Application time: 0.0005410 seconds
[2026-09-02T10:12:58.838-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.839-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.839-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002093 seconds, Stopping threads took: 0.0000634 seconds
[2026-09-02T10:12:58.839-0300][info][safepoint     ] Application time: 0.0005365 seconds
[2026-09-02T10:12:58.839-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.839-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.839-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001095 seconds, Stopping threads took: 0.0000227 seconds
[2026-09-02T10:12:58.840-0300][info][safepoint     ] Application time: 0.0003398 seconds
[2026-09-02T10:12:58.840-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.840-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.840-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001103 seconds, Stopping threads took: 0.0000058 seconds
[2026-09-02T10:12:58.840-0300][info][safepoint     ] Application time: 0.0002308 seconds
[2026-09-02T10:12:58.840-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.840-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.840-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001202 seconds, Stopping threads took: 0.0000458 seconds
[2026-09-02T10:12:58.840-0300][info][safepoint     ] Application time: 0.0000343 seconds
[2026-09-02T10:12:58.840-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.840-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.840-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001054 seconds, Stopping threads took: 0.0000333 seconds
[2026-09-02T10:12:58.840-0300][info][safepoint     ] Application time: 0.0000379 seconds
[2026-09-02T10:12:58.840-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.840-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.840-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000835 seconds, Stopping threads took: 0.0000046 seconds
[2026-09-02T10:12:58.840-0300][info][safepoint     ] Application time: 0.0000263 seconds
[2026-09-02T10:12:58.840-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.840-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.841-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001058 seconds, Stopping threads took: 0.0000339 seconds
[2026-09-02T10:12:58.841-0300][info][safepoint     ] Application time: 0.0000258 seconds
[2026-09-02T10:12:58.841-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.841-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.841-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000810 seconds, Stopping threads took: 0.0000049 seconds
[2026-09-02T10:12:58.841-0300][info][safepoint     ] Application time: 0.0001620 seconds
[2026-09-02T10:12:58.841-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.841-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.841-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000858 seconds, Stopping threads took: 0.0000051 seconds
[2026-09-02T10:12:58.841-0300][info][safepoint     ] Application time: 0.0005765 seconds
[2026-09-02T10:12:58.841-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.842-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.842-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000786 seconds, Stopping threads took: 0.0000051 seconds
[2026-09-02T10:12:58.842-0300][info][safepoint     ] Application time: 0.0001094 seconds
[2026-09-02T10:12:58.842-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.842-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.842-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000792 seconds, Stopping threads took: 0.0000044 seconds
[2026-09-02T10:12:58.842-0300][info][safepoint     ] Application time: 0.0000611 seconds
[2026-09-02T10:12:58.842-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.842-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.842-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000751 seconds, Stopping threads took: 0.0000048 seconds
[2026-09-02T10:12:58.842-0300][info][safepoint     ] Application time: 0.0000274 seconds
[2026-09-02T10:12:58.842-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.842-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.842-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000838 seconds, Stopping threads took: 0.0000043 seconds
[2026-09-02T10:12:58.842-0300][info][safepoint     ] Application time: 0.0001273 seconds
[2026-09-02T10:12:58.842-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.842-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.842-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001036 seconds, Stopping threads took: 0.0000046 seconds
[2026-09-02T10:12:58.842-0300][info][safepoint     ] Application time: 0.0000229 seconds
[2026-09-02T10:12:58.842-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.842-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.842-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000775 seconds, Stopping threads took: 0.0000038 seconds
[2026-09-02T10:12:58.842-0300][info][safepoint     ] Application time: 0.0000229 seconds
[2026-09-02T10:12:58.842-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.842-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.842-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000802 seconds, Stopping threads took: 0.0000048 seconds
[2026-09-02T10:12:58.843-0300][info][safepoint     ] Application time: 0.0000210 seconds
[2026-09-02T10:12:58.843-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.843-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.843-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000772 seconds, Stopping threads took: 0.0000047 seconds
[2026-09-02T10:12:58.843-0300][info][safepoint     ] Application time: 0.0000203 seconds
[2026-09-02T10:12:58.843-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.843-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.843-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000781 seconds, Stopping threads took: 0.0000044 seconds
[2026-09-02T10:12:58.843-0300][info][safepoint     ] Application time: 0.0007311 seconds
[2026-09-02T10:12:58.843-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.844-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.844-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000811 seconds, Stopping threads took: 0.0000046 seconds
[2026-09-02T10:12:58.844-0300][info][safepoint     ] Application time: 0.0000223 seconds
[2026-09-02T10:12:58.844-0300][info][safepoint     ] Entering safepoint region: BulkRevokeBias
[2026-09-02T10:12:58.844-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.844-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002550 seconds, Stopping threads took: 0.0000046 seconds
[2026-09-02T10:12:58.844-0300][info][safepoint     ] Application time: 0.0000219 seconds
[2026-09-02T10:12:58.844-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.844-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.844-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000796 seconds, Stopping threads took: 0.0000049 seconds
[2026-09-02T10:12:58.844-0300][info][safepoint     ] Application time: 0.0000205 seconds
[2026-09-02T10:12:58.844-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.844-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.844-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000813 seconds, Stopping threads took: 0.0000044 seconds
[2026-09-02T10:12:58.844-0300][info][safepoint     ] Application time: 0.0000248 seconds
[2026-09-02T10:12:58.844-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.844-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.844-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000714 seconds, Stopping threads took: 0.0000044 seconds
[2026-09-02T10:12:58.903-0300][info][safepoint     ] Application time: 0.0586186 seconds
[2026-09-02T10:12:58.903-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.903-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.903-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001213 seconds, Stopping threads took: 0.0000129 seconds
[2026-09-02T10:12:58.903-0300][info][safepoint     ] Application time: 0.0000612 seconds
[2026-09-02T10:12:58.903-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.903-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.903-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000722 seconds, Stopping threads took: 0.0000036 seconds
[2026-09-02T10:12:58.903-0300][info][safepoint     ] Application time: 0.0000414 seconds
[2026-09-02T10:12:58.903-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.903-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.903-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000694 seconds, Stopping threads took: 0.0000030 seconds
[2026-09-02T10:12:58.907-0300][info][safepoint     ] Application time: 0.0041767 seconds
[2026-09-02T10:12:58.907-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.907-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.907-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001116 seconds, Stopping threads took: 0.0000061 seconds
[2026-09-02T10:12:58.908-0300][info][safepoint     ] Application time: 0.0001089 seconds
[2026-09-02T10:12:58.908-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.908-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.908-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000696 seconds, Stopping threads took: 0.0000033 seconds
[2026-09-02T10:12:58.908-0300][info][safepoint     ] Application time: 0.0000226 seconds
[2026-09-02T10:12:58.908-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.908-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.908-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000718 seconds, Stopping threads took: 0.0000027 seconds
[2026-09-02T10:12:58.908-0300][info][safepoint     ] Application time: 0.0002173 seconds
[2026-09-02T10:12:58.908-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.908-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.908-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000648 seconds, Stopping threads took: 0.0000034 seconds
[2026-09-02T10:12:58.909-0300][info][safepoint     ] Application time: 0.0010686 seconds
[2026-09-02T10:12:58.909-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.909-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.909-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000748 seconds, Stopping threads took: 0.0000051 seconds
[2026-09-02T10:12:58.909-0300][info][safepoint     ] Application time: 0.0000408 seconds
[2026-09-02T10:12:58.909-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.909-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.909-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000739 seconds, Stopping threads took: 0.0000044 seconds
[2026-09-02T10:12:58.909-0300][info][safepoint     ] Application time: 0.0000329 seconds
[2026-09-02T10:12:58.909-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.909-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.909-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000809 seconds, Stopping threads took: 0.0000037 seconds
[2026-09-02T10:12:58.909-0300][info][safepoint     ] Application time: 0.0000207 seconds
[2026-09-02T10:12:58.909-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.910-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.910-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000829 seconds, Stopping threads took: 0.0000025 seconds
[2026-09-02T10:12:58.910-0300][info][safepoint     ] Application time: 0.0002727 seconds
[2026-09-02T10:12:58.910-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.910-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.910-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000838 seconds, Stopping threads took: 0.0000045 seconds
[2026-09-02T10:12:58.910-0300][info][safepoint     ] Application time: 0.0000680 seconds
[2026-09-02T10:12:58.910-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.910-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.910-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000607 seconds, Stopping threads took: 0.0000026 seconds
[2026-09-02T10:12:58.910-0300][info][safepoint     ] Application time: 0.0000653 seconds
[2026-09-02T10:12:58.910-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.910-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.910-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000797 seconds, Stopping threads took: 0.0000035 seconds
[2026-09-02T10:12:58.911-0300][info][safepoint     ] Application time: 0.0005852 seconds
[2026-09-02T10:12:58.911-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.911-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.911-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000603 seconds, Stopping threads took: 0.0000035 seconds
[2026-09-02T10:12:58.911-0300][info][safepoint     ] Application time: 0.0000226 seconds
[2026-09-02T10:12:58.911-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.911-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.911-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000773 seconds, Stopping threads took: 0.0000027 seconds
[2026-09-02T10:12:58.911-0300][info][safepoint     ] Application time: 0.0000506 seconds
[2026-09-02T10:12:58.911-0300][info][safepoint     ] Entering safepoint region: BulkRevokeBias
[2026-09-02T10:12:58.911-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.911-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002180 seconds, Stopping threads took: 0.0000026 seconds
[2026-09-02T10:12:58.912-0300][info][safepoint     ] Application time: 0.0003040 seconds
[2026-09-02T10:12:58.912-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.912-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.912-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000814 seconds, Stopping threads took: 0.0000039 seconds
[2026-09-02T10:12:58.917-0300][info][safepoint     ] Application time: 0.0053225 seconds
[2026-09-02T10:12:58.917-0300][info][safepoint     ] Entering safepoint region: Deoptimize
[2026-09-02T10:12:58.918-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.918-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0006929 seconds, Stopping threads took: 0.0000087 seconds
[2026-09-02T10:12:58.918-0300][info][safepoint     ] Application time: 0.0003280 seconds
[2026-09-02T10:12:58.918-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.918-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.918-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000933 seconds, Stopping threads took: 0.0000050 seconds
[2026-09-02T10:12:58.918-0300][info][safepoint     ] Application time: 0.0000292 seconds
[2026-09-02T10:12:58.918-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.918-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.918-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000637 seconds, Stopping threads took: 0.0000027 seconds
[2026-09-02T10:12:58.918-0300][info][safepoint     ] Application time: 0.0000225 seconds
[2026-09-02T10:12:58.918-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.918-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.918-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001038 seconds, Stopping threads took: 0.0000032 seconds
[2026-09-02T10:12:58.918-0300][info][safepoint     ] Application time: 0.0000252 seconds
[2026-09-02T10:12:58.918-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.918-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.918-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000817 seconds, Stopping threads took: 0.0000043 seconds
[2026-09-02T10:12:58.919-0300][info][safepoint     ] Application time: 0.0006463 seconds
[2026-09-02T10:12:58.919-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.919-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.919-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000974 seconds, Stopping threads took: 0.0000061 seconds
[2026-09-02T10:12:58.940-0300][info][safepoint     ] Application time: 0.0209649 seconds
[2026-09-02T10:12:58.940-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.940-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.940-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001643 seconds, Stopping threads took: 0.0000109 seconds
[2026-09-02T10:12:58.955-0300][info][safepoint     ] Application time: 0.0142118 seconds
[2026-09-02T10:12:58.955-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.955-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.955-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002433 seconds, Stopping threads took: 0.0000126 seconds
[2026-09-02T10:12:58.956-0300][info][safepoint     ] Application time: 0.0007051 seconds
[2026-09-02T10:12:58.956-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.956-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.956-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001126 seconds, Stopping threads took: 0.0000101 seconds
[2026-09-02T10:12:58.956-0300][info][safepoint     ] Application time: 0.0000299 seconds
[2026-09-02T10:12:58.956-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.956-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.956-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000998 seconds, Stopping threads took: 0.0000047 seconds
[2026-09-02T10:12:58.956-0300][info][safepoint     ] Application time: 0.0000371 seconds
[2026-09-02T10:12:58.956-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:58.956-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.956-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001155 seconds, Stopping threads took: 0.0000046 seconds
[2026-09-02T10:12:58.958-0300][info][safepoint     ] Application time: 0.0019292 seconds
[2026-09-02T10:12:58.958-0300][info][safepoint     ] Entering safepoint region: Deoptimize
[2026-09-02T10:12:58.959-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.959-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0007662 seconds, Stopping threads took: 0.0000048 seconds
[2026-09-02T10:12:58.960-0300][info][safepoint     ] Application time: 0.0013805 seconds
[2026-09-02T10:12:58.960-0300][info][safepoint     ] Entering safepoint region: Deoptimize
[2026-09-02T10:12:58.961-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.961-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0004719 seconds, Stopping threads took: 0.0000075 seconds
[2026-09-02T10:12:58.968-0300][info][safepoint     ] Application time: 0.0076403 seconds
[2026-09-02T10:12:58.968-0300][info][safepoint     ] Entering safepoint region: Deoptimize
[2026-09-02T10:12:58.969-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:58.969-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0004967 seconds, Stopping threads took: 0.0000084 seconds
[2026-09-02T10:12:59.002-0300][info][safepoint     ] Application time: 0.0327253 seconds
[2026-09-02T10:12:59.002-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.002-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.002-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001298 seconds, Stopping threads took: 0.0000118 seconds
[2026-09-02T10:12:59.002-0300][info][safepoint     ] Application time: 0.0000336 seconds
[2026-09-02T10:12:59.002-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.002-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.002-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001089 seconds, Stopping threads took: 0.0000334 seconds
[2026-09-02T10:12:59.002-0300][info][safepoint     ] Application time: 0.0000284 seconds
[2026-09-02T10:12:59.002-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.002-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.002-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000829 seconds, Stopping threads took: 0.0000105 seconds
[2026-09-02T10:12:59.002-0300][info][safepoint     ] Application time: 0.0000243 seconds
[2026-09-02T10:12:59.002-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.002-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.002-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000693 seconds, Stopping threads took: 0.0000029 seconds
[2026-09-02T10:12:59.002-0300][info][safepoint     ] Application time: 0.0000210 seconds
[2026-09-02T10:12:59.002-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.002-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.002-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000699 seconds, Stopping threads took: 0.0000034 seconds
[2026-09-02T10:12:59.002-0300][info][safepoint     ] Application time: 0.0001872 seconds
[2026-09-02T10:12:59.002-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.002-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.002-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000856 seconds, Stopping threads took: 0.0000044 seconds
[2026-09-02T10:12:59.002-0300][info][safepoint     ] Application time: 0.0000240 seconds
[2026-09-02T10:12:59.002-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.003-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.003-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000689 seconds, Stopping threads took: 0.0000034 seconds
[2026-09-02T10:12:59.003-0300][info][safepoint     ] Application time: 0.0000342 seconds
[2026-09-02T10:12:59.003-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.003-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.003-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000746 seconds, Stopping threads took: 0.0000037 seconds
[2026-09-02T10:12:59.003-0300][info][safepoint     ] Application time: 0.0000230 seconds
[2026-09-02T10:12:59.003-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.003-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.003-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000654 seconds, Stopping threads took: 0.0000034 seconds
[2026-09-02T10:12:59.003-0300][info][safepoint     ] Application time: 0.0000228 seconds
[2026-09-02T10:12:59.003-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.003-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.003-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000832 seconds, Stopping threads took: 0.0000034 seconds
[2026-09-02T10:12:59.003-0300][info][safepoint     ] Application time: 0.0000189 seconds
[2026-09-02T10:12:59.003-0300][info][safepoint     ] Entering safepoint region: BulkRevokeBias
[2026-09-02T10:12:59.003-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.003-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002734 seconds, Stopping threads took: 0.0000034 seconds
[2026-09-02T10:12:59.005-0300][info][safepoint     ] Application time: 0.0016172 seconds
[2026-09-02T10:12:59.005-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.005-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.005-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001135 seconds, Stopping threads took: 0.0000052 seconds
[2026-09-02T10:12:59.025-0300][info][safepoint     ] Application time: 0.0202988 seconds
[2026-09-02T10:12:59.025-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.025-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.025-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001380 seconds, Stopping threads took: 0.0000108 seconds
[2026-09-02T10:12:59.035-0300][info][safepoint     ] Application time: 0.0094086 seconds
[2026-09-02T10:12:59.035-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.035-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.035-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001278 seconds, Stopping threads took: 0.0000282 seconds
[2026-09-02T10:12:59.035-0300][info][safepoint     ] Application time: 0.0002435 seconds
[2026-09-02T10:12:59.035-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.035-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.035-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000884 seconds, Stopping threads took: 0.0000041 seconds
[2026-09-02T10:12:59.035-0300][info][safepoint     ] Application time: 0.0000684 seconds
[2026-09-02T10:12:59.035-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.035-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.035-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001006 seconds, Stopping threads took: 0.0000033 seconds
[2026-09-02T10:12:59.036-0300][info][safepoint     ] Application time: 0.0000863 seconds
[2026-09-02T10:12:59.036-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.036-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.036-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000820 seconds, Stopping threads took: 0.0000033 seconds
[2026-09-02T10:12:59.036-0300][info][safepoint     ] Application time: 0.0001821 seconds
[2026-09-02T10:12:59.036-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.036-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.036-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000604 seconds, Stopping threads took: 0.0000033 seconds
[2026-09-02T10:12:59.115-0300][info][safepoint     ] Application time: 0.0789048 seconds
[2026-09-02T10:12:59.115-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.115-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.115-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001296 seconds, Stopping threads took: 0.0000114 seconds
[2026-09-02T10:12:59.115-0300][info][safepoint     ] Application time: 0.0000419 seconds
[2026-09-02T10:12:59.115-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.115-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.115-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000921 seconds, Stopping threads took: 0.0000035 seconds
[2026-09-02T10:12:59.204-0300][info][safepoint     ] Application time: 0.0893475 seconds
[2026-09-02T10:12:59.204-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.205-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.205-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001562 seconds, Stopping threads took: 0.0000118 seconds
[2026-09-02T10:12:59.216-0300][info][safepoint     ] Application time: 0.0114973 seconds
[2026-09-02T10:12:59.216-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.216-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.216-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001147 seconds, Stopping threads took: 0.0000106 seconds
[2026-09-02T10:12:59.222-0300][info][safepoint     ] Application time: 0.0055489 seconds
[2026-09-02T10:12:59.222-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.222-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.222-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001375 seconds, Stopping threads took: 0.0000105 seconds
[2026-09-02T10:12:59.514-0300][info][safepoint     ] Application time: 0.2922305 seconds
[2026-09-02T10:12:59.514-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.514-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.514-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002171 seconds, Stopping threads took: 0.0001006 seconds
[2026-09-02T10:12:59.518-0300][info][safepoint     ] Application time: 0.0035114 seconds
[2026-09-02T10:12:59.518-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.519-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.519-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0010064 seconds, Stopping threads took: 0.0000083 seconds
[2026-09-02T10:12:59.521-0300][info][safepoint     ] Application time: 0.0023063 seconds
[2026-09-02T10:12:59.521-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.521-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.521-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001412 seconds, Stopping threads took: 0.0000061 seconds
[2026-09-02T10:12:59.524-0300][info][safepoint     ] Application time: 0.0022789 seconds
[2026-09-02T10:12:59.524-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.524-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.524-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000701 seconds, Stopping threads took: 0.0000045 seconds
[2026-09-02T10:12:59.524-0300][info][safepoint     ] Application time: 0.0003658 seconds
[2026-09-02T10:12:59.524-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.524-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.524-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000817 seconds, Stopping threads took: 0.0000039 seconds
[2026-09-02T10:12:59.524-0300][info][safepoint     ] Application time: 0.0000322 seconds
[2026-09-02T10:12:59.524-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.524-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.524-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000639 seconds, Stopping threads took: 0.0000033 seconds
[2026-09-02T10:12:59.524-0300][info][safepoint     ] Application time: 0.0000211 seconds
[2026-09-02T10:12:59.524-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.524-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.525-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000666 seconds, Stopping threads took: 0.0000034 seconds
[2026-09-02T10:12:59.528-0300][info][safepoint     ] Application time: 0.0031605 seconds
[2026-09-02T10:12:59.528-0300][info][safepoint     ] Entering safepoint region: Deoptimize
[2026-09-02T10:12:59.528-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.528-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0007730 seconds, Stopping threads took: 0.0000049 seconds
[2026-09-02T10:12:59.606-0300][info][safepoint     ] Application time: 0.0777436 seconds
[2026-09-02T10:12:59.606-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.606-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.606-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001335 seconds, Stopping threads took: 0.0000274 seconds
[2026-09-02T10:12:59.606-0300][info][safepoint     ] Application time: 0.0000452 seconds
[2026-09-02T10:12:59.606-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.606-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.606-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000725 seconds, Stopping threads took: 0.0000038 seconds
[2026-09-02T10:12:59.609-0300][info][safepoint     ] Application time: 0.0020165 seconds
[2026-09-02T10:12:59.609-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.609-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.609-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000907 seconds, Stopping threads took: 0.0000048 seconds
[2026-09-02T10:12:59.614-0300][info][safepoint     ] Application time: 0.0051984 seconds
[2026-09-02T10:12:59.614-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.614-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.614-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000859 seconds, Stopping threads took: 0.0000052 seconds
[2026-09-02T10:12:59.614-0300][info][safepoint     ] Application time: 0.0001985 seconds
[2026-09-02T10:12:59.614-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.614-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.614-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001113 seconds, Stopping threads took: 0.0000036 seconds
[2026-09-02T10:12:59.638-0300][info][safepoint     ] Application time: 0.0235628 seconds
[2026-09-02T10:12:59.638-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.638-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.638-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001360 seconds, Stopping threads took: 0.0000147 seconds
[2026-09-02T10:12:59.638-0300][info][safepoint     ] Application time: 0.0000388 seconds
[2026-09-02T10:12:59.638-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.638-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.638-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000823 seconds, Stopping threads took: 0.0000050 seconds
[2026-09-02T10:12:59.638-0300][info][safepoint     ] Application time: 0.0000427 seconds
[2026-09-02T10:12:59.638-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.638-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.638-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000771 seconds, Stopping threads took: 0.0000049 seconds
[2026-09-02T10:12:59.710-0300][info][safepoint     ] Application time: 0.0719386 seconds
[2026-09-02T10:12:59.710-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.711-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.711-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0003387 seconds, Stopping threads took: 0.0002280 seconds
[2026-09-02T10:12:59.711-0300][info][safepoint     ] Application time: 0.0000605 seconds
[2026-09-02T10:12:59.711-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.711-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.711-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000910 seconds, Stopping threads took: 0.0000064 seconds
[2026-09-02T10:12:59.711-0300][info][safepoint     ] Application time: 0.0000276 seconds
[2026-09-02T10:12:59.711-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.711-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.711-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000918 seconds, Stopping threads took: 0.0000048 seconds
[2026-09-02T10:12:59.713-0300][info][safepoint     ] Application time: 0.0020401 seconds
[2026-09-02T10:12:59.713-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.713-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.713-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001148 seconds, Stopping threads took: 0.0000082 seconds
[2026-09-02T10:12:59.713-0300][info][safepoint     ] Application time: 0.0000327 seconds
[2026-09-02T10:12:59.713-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.713-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.713-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000866 seconds, Stopping threads took: 0.0000052 seconds
[2026-09-02T10:12:59.713-0300][info][safepoint     ] Application time: 0.0000242 seconds
[2026-09-02T10:12:59.713-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.713-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.713-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001431 seconds, Stopping threads took: 0.0000046 seconds
[2026-09-02T10:12:59.714-0300][info][safepoint     ] Application time: 0.0002690 seconds
[2026-09-02T10:12:59.714-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.714-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.714-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000937 seconds, Stopping threads took: 0.0000053 seconds
[2026-09-02T10:12:59.714-0300][info][safepoint     ] Application time: 0.0000257 seconds
[2026-09-02T10:12:59.714-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.714-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.714-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000861 seconds, Stopping threads took: 0.0000048 seconds
[2026-09-02T10:12:59.714-0300][info][safepoint     ] Application time: 0.0000204 seconds
[2026-09-02T10:12:59.714-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.714-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.714-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001095 seconds, Stopping threads took: 0.0000045 seconds
[2026-09-02T10:12:59.715-0300][info][safepoint     ] Application time: 0.0014038 seconds
[2026-09-02T10:12:59.715-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.716-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.716-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001140 seconds, Stopping threads took: 0.0000082 seconds
[2026-09-02T10:12:59.716-0300][info][safepoint     ] Application time: 0.0002023 seconds
[2026-09-02T10:12:59.716-0300][info][safepoint     ] Entering safepoint region: BulkRevokeBias
[2026-09-02T10:12:59.716-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.716-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002376 seconds, Stopping threads took: 0.0000035 seconds
[2026-09-02T10:12:59.716-0300][info][safepoint     ] Application time: 0.0000623 seconds
[2026-09-02T10:12:59.716-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.716-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.716-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000783 seconds, Stopping threads took: 0.0000037 seconds
[2026-09-02T10:12:59.716-0300][info][safepoint     ] Application time: 0.0000243 seconds
[2026-09-02T10:12:59.716-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.716-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.716-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000797 seconds, Stopping threads took: 0.0000037 seconds
[2026-09-02T10:12:59.719-0300][info][safepoint     ] Application time: 0.0026913 seconds
[2026-09-02T10:12:59.719-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.719-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.719-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001273 seconds, Stopping threads took: 0.0000296 seconds
[2026-09-02T10:12:59.719-0300][info][safepoint     ] Application time: 0.0000418 seconds
[2026-09-02T10:12:59.719-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.719-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.719-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001084 seconds, Stopping threads took: 0.0000050 seconds
[2026-09-02T10:12:59.719-0300][info][safepoint     ] Application time: 0.0000283 seconds
[2026-09-02T10:12:59.719-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.719-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.719-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001207 seconds, Stopping threads took: 0.0000252 seconds
[2026-09-02T10:12:59.727-0300][info][safepoint     ] Application time: 0.0071996 seconds
[2026-09-02T10:12:59.727-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.727-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.727-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001023 seconds, Stopping threads took: 0.0000101 seconds
[2026-09-02T10:12:59.727-0300][info][safepoint     ] Application time: 0.0000346 seconds
[2026-09-02T10:12:59.727-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.727-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.727-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000601 seconds, Stopping threads took: 0.0000035 seconds
[2026-09-02T10:12:59.727-0300][info][safepoint     ] Application time: 0.0000247 seconds
[2026-09-02T10:12:59.727-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.727-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.727-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000655 seconds, Stopping threads took: 0.0000033 seconds
[2026-09-02T10:12:59.729-0300][info][safepoint     ] Application time: 0.0021644 seconds
[2026-09-02T10:12:59.729-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.729-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.729-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000930 seconds, Stopping threads took: 0.0000147 seconds
[2026-09-02T10:12:59.735-0300][info][safepoint     ] Application time: 0.0055695 seconds
[2026-09-02T10:12:59.735-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.735-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.735-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001342 seconds, Stopping threads took: 0.0000089 seconds
[2026-09-02T10:12:59.735-0300][info][safepoint     ] Application time: 0.0000294 seconds
[2026-09-02T10:12:59.735-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.735-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.735-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000741 seconds, Stopping threads took: 0.0000034 seconds
[2026-09-02T10:12:59.735-0300][info][safepoint     ] Application time: 0.0000211 seconds
[2026-09-02T10:12:59.735-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.735-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.735-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000687 seconds, Stopping threads took: 0.0000033 seconds
[2026-09-02T10:12:59.741-0300][info][safepoint     ] Application time: 0.0055504 seconds
[2026-09-02T10:12:59.741-0300][info][safepoint     ] Entering safepoint region: Deoptimize
[2026-09-02T10:12:59.742-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.742-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0008356 seconds, Stopping threads took: 0.0000117 seconds
[2026-09-02T10:12:59.744-0300][info][safepoint     ] Application time: 0.0026344 seconds
[2026-09-02T10:12:59.744-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.744-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.744-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000962 seconds, Stopping threads took: 0.0000065 seconds
[2026-09-02T10:12:59.744-0300][info][safepoint     ] Application time: 0.0000704 seconds
[2026-09-02T10:12:59.744-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.745-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.745-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001103 seconds, Stopping threads took: 0.0000427 seconds
[2026-09-02T10:12:59.745-0300][info][safepoint     ] Application time: 0.0000248 seconds
[2026-09-02T10:12:59.745-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.745-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.745-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000657 seconds, Stopping threads took: 0.0000034 seconds
[2026-09-02T10:12:59.751-0300][info][safepoint     ] Application time: 0.0064212 seconds
[2026-09-02T10:12:59.751-0300][info][safepoint     ] Entering safepoint region: BulkRevokeBias
[2026-09-02T10:12:59.751-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.751-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002037 seconds, Stopping threads took: 0.0000071 seconds
[2026-09-02T10:12:59.751-0300][info][safepoint     ] Application time: 0.0000254 seconds
[2026-09-02T10:12:59.751-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.751-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.751-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000761 seconds, Stopping threads took: 0.0000038 seconds
[2026-09-02T10:12:59.751-0300][info][safepoint     ] Application time: 0.0000216 seconds
[2026-09-02T10:12:59.751-0300][info][safepoint     ] Entering safepoint region: BulkRevokeBias
[2026-09-02T10:12:59.752-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.752-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001228 seconds, Stopping threads took: 0.0000034 seconds
[2026-09-02T10:12:59.755-0300][info][safepoint     ] Application time: 0.0036292 seconds
[2026-09-02T10:12:59.755-0300][info][safepoint     ] Entering safepoint region: Deoptimize
[2026-09-02T10:12:59.801-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.801-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0455474 seconds, Stopping threads took: 0.0000067 seconds
[2026-09-02T10:12:59.809-0300][info][safepoint     ] Application time: 0.0084542 seconds
[2026-09-02T10:12:59.809-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.809-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.809-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001088 seconds, Stopping threads took: 0.0000099 seconds
[2026-09-02T10:12:59.809-0300][info][safepoint     ] Application time: 0.0000617 seconds
[2026-09-02T10:12:59.809-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.810-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.810-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001041 seconds, Stopping threads took: 0.0000103 seconds
[2026-09-02T10:12:59.810-0300][info][safepoint     ] Application time: 0.0000218 seconds
[2026-09-02T10:12:59.810-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:12:59.810-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:12:59.810-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000820 seconds, Stopping threads took: 0.0000049 seconds
[2026-09-02T10:12:59.814-0300][info][safepoint     ] Application time: 0.0044007 seconds
[2026-09-02T10:12:59.814-0300][info][safepoint     ] Entering safepoint region: CollectForMetadataAllocation
[2026-09-02T10:12:59.814-0300][info][gc,start      ] GC(4) Pause Young (Concurrent Start) (Metadata GC Threshold)
[2026-09-02T10:12:59.814-0300][info][gc,task       ] GC(4) Using 23 workers of 23 for evacuation
[2026-09-02T10:13:00.220-0300][info][gc,mmu        ] GC(4) MMU target violated: 201.0ms (200.0ms/201.0ms)
[2026-09-02T10:13:00.220-0300][info][gc,phases     ] GC(4)   Pre Evacuate Collection Set: 0.2ms
[2026-09-02T10:13:00.220-0300][info][gc,phases     ] GC(4)   Evacuate Collection Set: 99.6ms
[2026-09-02T10:13:00.220-0300][info][gc,phases     ] GC(4)   Post Evacuate Collection Set: 305.4ms
[2026-09-02T10:13:00.220-0300][info][gc,phases     ] GC(4)   Other: 0.3ms
[2026-09-02T10:13:00.220-0300][info][gc,heap       ] GC(4) Eden regions: 17->0(95)
[2026-09-02T10:13:00.220-0300][info][gc,heap       ] GC(4) Survivor regions: 3->5(13)
[2026-09-02T10:13:00.220-0300][info][gc,heap       ] GC(4) Old regions: 2->2
[2026-09-02T10:13:00.220-0300][info][gc,heap       ] GC(4) Humongous regions: 0->0
[2026-09-02T10:13:00.220-0300][info][gc,metaspace  ] GC(4) Metaspace: 61211K->61211K(1103872K)
[2026-09-02T10:13:00.220-0300][info][gc            ] GC(4) Pause Young (Concurrent Start) (Metadata GC Threshold) 158M->36M(16096M) 405.566ms
[2026-09-02T10:13:00.220-0300][info][gc,cpu        ] GC(4) User=0.42s Sys=0.02s Real=0.41s
[2026-09-02T10:13:00.220-0300][info][gc            ] GC(5) Concurrent Cycle
[2026-09-02T10:13:00.220-0300][info][gc,marking    ] GC(5) Concurrent Clear Claimed Marks
[2026-09-02T10:13:00.220-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.220-0300][info][safepoint     ] Total time for which application threads were stopped: 0.4058039 seconds, Stopping threads took: 0.0000277 seconds
[2026-09-02T10:13:00.220-0300][info][gc,marking    ] GC(5) Concurrent Clear Claimed Marks 0.180ms
[2026-09-02T10:13:00.220-0300][info][gc,marking    ] GC(5) Concurrent Scan Root Regions
[2026-09-02T10:13:00.303-0300][info][safepoint     ] Application time: 0.0826138 seconds
[2026-09-02T10:13:00.303-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.303-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.303-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001233 seconds, Stopping threads took: 0.0000106 seconds
[2026-09-02T10:13:00.303-0300][info][gc,marking    ] GC(5) Concurrent Scan Root Regions 82.608ms
[2026-09-02T10:13:00.303-0300][info][gc,marking    ] GC(5) Concurrent Mark (13.283s)
[2026-09-02T10:13:00.303-0300][info][gc,marking    ] GC(5) Concurrent Mark From Roots
[2026-09-02T10:13:00.303-0300][info][gc,task       ] GC(5) Using 6 workers of 6 for marking
[2026-09-02T10:13:00.303-0300][info][safepoint     ] Application time: 0.0000427 seconds
[2026-09-02T10:13:00.303-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.303-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.303-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000622 seconds, Stopping threads took: 0.0000027 seconds
[2026-09-02T10:13:00.303-0300][info][safepoint     ] Application time: 0.0000542 seconds
[2026-09-02T10:13:00.303-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.303-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.303-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000886 seconds, Stopping threads took: 0.0000193 seconds
[2026-09-02T10:13:00.303-0300][info][safepoint     ] Application time: 0.0000691 seconds
[2026-09-02T10:13:00.303-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.303-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.303-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000953 seconds, Stopping threads took: 0.0000108 seconds
[2026-09-02T10:13:00.303-0300][info][safepoint     ] Application time: 0.0001219 seconds
[2026-09-02T10:13:00.303-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.303-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.303-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000848 seconds, Stopping threads took: 0.0000069 seconds
[2026-09-02T10:13:00.303-0300][info][safepoint     ] Application time: 0.0000834 seconds
[2026-09-02T10:13:00.303-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.303-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.304-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000695 seconds, Stopping threads took: 0.0000038 seconds
[2026-09-02T10:13:00.304-0300][info][safepoint     ] Application time: 0.0000501 seconds
[2026-09-02T10:13:00.304-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.304-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.304-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000677 seconds, Stopping threads took: 0.0000034 seconds
[2026-09-02T10:13:00.304-0300][info][safepoint     ] Application time: 0.0000614 seconds
[2026-09-02T10:13:00.304-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.304-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.304-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001019 seconds, Stopping threads took: 0.0000084 seconds
[2026-09-02T10:13:00.305-0300][info][gc,marking    ] GC(5) Concurrent Mark From Roots 2.354ms
[2026-09-02T10:13:00.305-0300][info][gc,marking    ] GC(5) Concurrent Preclean
[2026-09-02T10:13:00.305-0300][info][gc,marking    ] GC(5) Concurrent Preclean 0.101ms
[2026-09-02T10:13:00.305-0300][info][gc,marking    ] GC(5) Concurrent Mark (13.283s, 13.285s) 2.478ms
[2026-09-02T10:13:00.305-0300][info][safepoint     ] Application time: 0.0014042 seconds
[2026-09-02T10:13:00.305-0300][info][safepoint     ] Entering safepoint region: CGC_Operation
[2026-09-02T10:13:00.305-0300][info][gc,start      ] GC(5) Pause Remark
[2026-09-02T10:13:00.402-0300][info][gc,stringtable] GC(5) Cleaned string and symbol table, strings: 23632 processed, 0 removed, symbols: 162390 processed, 34 removed
[2026-09-02T10:13:00.402-0300][info][gc            ] GC(5) Pause Remark 43M->43M(16096M) 96.736ms
[2026-09-02T10:13:00.402-0300][info][gc,cpu        ] GC(5) User=0.09s Sys=0.00s Real=0.10s
[2026-09-02T10:13:00.402-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.402-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0968636 seconds, Stopping threads took: 0.0000054 seconds
[2026-09-02T10:13:00.402-0300][info][gc,marking    ] GC(5) Concurrent Rebuild Remembered Sets
[2026-09-02T10:13:00.403-0300][info][gc,marking    ] GC(5) Concurrent Rebuild Remembered Sets 0.404ms
[2026-09-02T10:13:00.403-0300][info][safepoint     ] Application time: 0.0004546 seconds
[2026-09-02T10:13:00.403-0300][info][safepoint     ] Entering safepoint region: CGC_Operation
[2026-09-02T10:13:00.403-0300][info][gc,start      ] GC(5) Pause Cleanup
[2026-09-02T10:13:00.403-0300][info][gc            ] GC(5) Pause Cleanup 43M->43M(16096M) 0.288ms
[2026-09-02T10:13:00.403-0300][info][gc,cpu        ] GC(5) User=0.00s Sys=0.00s Real=0.00s
[2026-09-02T10:13:00.403-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.403-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0003920 seconds, Stopping threads took: 0.0000071 seconds
[2026-09-02T10:13:00.403-0300][info][gc,marking    ] GC(5) Concurrent Cleanup for Next Mark
[2026-09-02T10:13:00.408-0300][info][gc,marking    ] GC(5) Concurrent Cleanup for Next Mark 4.717ms
[2026-09-02T10:13:00.408-0300][info][gc            ] GC(5) Concurrent Cycle 187.843ms
[2026-09-02T10:13:00.411-0300][info][safepoint     ] Application time: 0.0082900 seconds
[2026-09-02T10:13:00.411-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.411-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.411-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001515 seconds, Stopping threads took: 0.0000420 seconds
[2026-09-02T10:13:00.411-0300][info][safepoint     ] Application time: 0.0000536 seconds
[2026-09-02T10:13:00.412-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.412-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.412-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001108 seconds, Stopping threads took: 0.0000205 seconds
[2026-09-02T10:13:00.412-0300][info][safepoint     ] Application time: 0.0000357 seconds
[2026-09-02T10:13:00.412-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.412-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.412-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001111 seconds, Stopping threads took: 0.0000360 seconds
[2026-09-02T10:13:00.412-0300][info][safepoint     ] Application time: 0.0000321 seconds
[2026-09-02T10:13:00.412-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.412-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.412-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001016 seconds, Stopping threads took: 0.0000187 seconds
[2026-09-02T10:13:00.412-0300][info][safepoint     ] Application time: 0.0000325 seconds
[2026-09-02T10:13:00.412-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.412-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.412-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001788 seconds, Stopping threads took: 0.0000870 seconds
[2026-09-02T10:13:00.412-0300][info][safepoint     ] Application time: 0.0000331 seconds
[2026-09-02T10:13:00.412-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.412-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.412-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001010 seconds, Stopping threads took: 0.0000210 seconds
[2026-09-02T10:13:00.412-0300][info][safepoint     ] Application time: 0.0000452 seconds
[2026-09-02T10:13:00.412-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.412-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.413-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001743 seconds, Stopping threads took: 0.0000895 seconds
[2026-09-02T10:13:00.413-0300][info][safepoint     ] Application time: 0.0000494 seconds
[2026-09-02T10:13:00.413-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.413-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.413-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001110 seconds, Stopping threads took: 0.0000336 seconds
[2026-09-02T10:13:00.413-0300][info][safepoint     ] Application time: 0.0000382 seconds
[2026-09-02T10:13:00.413-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.413-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.413-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000961 seconds, Stopping threads took: 0.0000186 seconds
[2026-09-02T10:13:00.413-0300][info][safepoint     ] Application time: 0.0000300 seconds
[2026-09-02T10:13:00.413-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.413-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.413-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001634 seconds, Stopping threads took: 0.0000872 seconds
[2026-09-02T10:13:00.413-0300][info][safepoint     ] Application time: 0.0000360 seconds
[2026-09-02T10:13:00.413-0300][info][safepoint     ] Entering safepoint region: BulkRevokeBias
[2026-09-02T10:13:00.413-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.413-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002803 seconds, Stopping threads took: 0.0000242 seconds
[2026-09-02T10:13:00.421-0300][info][safepoint     ] Application time: 0.0077435 seconds
[2026-09-02T10:13:00.421-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.421-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.421-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001278 seconds, Stopping threads took: 0.0000111 seconds
[2026-09-02T10:13:00.421-0300][info][safepoint     ] Application time: 0.0000324 seconds
[2026-09-02T10:13:00.421-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.421-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.421-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000702 seconds, Stopping threads took: 0.0000051 seconds
[2026-09-02T10:13:00.423-0300][info][safepoint     ] Application time: 0.0011809 seconds
[2026-09-02T10:13:00.423-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.423-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.423-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001005 seconds, Stopping threads took: 0.0000099 seconds
[2026-09-02T10:13:00.423-0300][info][safepoint     ] Application time: 0.0001826 seconds
[2026-09-02T10:13:00.423-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.423-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.423-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000825 seconds, Stopping threads took: 0.0000048 seconds
[2026-09-02T10:13:00.423-0300][info][safepoint     ] Application time: 0.0000693 seconds
[2026-09-02T10:13:00.423-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.423-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.423-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001041 seconds, Stopping threads took: 0.0000052 seconds
[2026-09-02T10:13:00.423-0300][info][safepoint     ] Application time: 0.0000263 seconds
[2026-09-02T10:13:00.423-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.423-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.423-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000935 seconds, Stopping threads took: 0.0000050 seconds
[2026-09-02T10:13:00.423-0300][info][safepoint     ] Application time: 0.0000393 seconds
[2026-09-02T10:13:00.423-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.423-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.423-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000953 seconds, Stopping threads took: 0.0000051 seconds
[2026-09-02T10:13:00.423-0300][info][safepoint     ] Application time: 0.0000237 seconds
[2026-09-02T10:13:00.423-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.424-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.424-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000864 seconds, Stopping threads took: 0.0000049 seconds
[2026-09-02T10:13:00.424-0300][info][safepoint     ] Application time: 0.0000395 seconds
[2026-09-02T10:13:00.424-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.424-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.424-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000939 seconds, Stopping threads took: 0.0000048 seconds
[2026-09-02T10:13:00.510-0300][info][safepoint     ] Application time: 0.0860289 seconds
[2026-09-02T10:13:00.510-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.510-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.510-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001075 seconds, Stopping threads took: 0.0000150 seconds
[2026-09-02T10:13:00.510-0300][info][safepoint     ] Application time: 0.0001631 seconds
[2026-09-02T10:13:00.510-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.510-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.510-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000902 seconds, Stopping threads took: 0.0000047 seconds
[2026-09-02T10:13:00.510-0300][info][safepoint     ] Application time: 0.0000331 seconds
[2026-09-02T10:13:00.510-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.510-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.510-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000690 seconds, Stopping threads took: 0.0000037 seconds
[2026-09-02T10:13:00.510-0300][info][safepoint     ] Application time: 0.0001580 seconds
[2026-09-02T10:13:00.510-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.510-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.510-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000608 seconds, Stopping threads took: 0.0000035 seconds
[2026-09-02T10:13:00.510-0300][info][safepoint     ] Application time: 0.0000361 seconds
[2026-09-02T10:13:00.510-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.511-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.511-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000631 seconds, Stopping threads took: 0.0000027 seconds
[2026-09-02T10:13:00.534-0300][info][safepoint     ] Application time: 0.0234716 seconds
[2026-09-02T10:13:00.534-0300][info][safepoint     ] Entering safepoint region: BulkRevokeBias
[2026-09-02T10:13:00.534-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.534-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002727 seconds, Stopping threads took: 0.0000127 seconds
[2026-09-02T10:13:00.601-0300][info][safepoint     ] Application time: 0.0664477 seconds
[2026-09-02T10:13:00.601-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.601-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.601-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001533 seconds, Stopping threads took: 0.0000187 seconds
[2026-09-02T10:13:00.601-0300][info][safepoint     ] Application time: 0.0000741 seconds
[2026-09-02T10:13:00.601-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.601-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.601-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000742 seconds, Stopping threads took: 0.0000038 seconds
[2026-09-02T10:13:00.601-0300][info][safepoint     ] Application time: 0.0000235 seconds
[2026-09-02T10:13:00.601-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.601-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.601-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000783 seconds, Stopping threads took: 0.0000035 seconds
[2026-09-02T10:13:00.601-0300][info][safepoint     ] Application time: 0.0000738 seconds
[2026-09-02T10:13:00.601-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.601-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.601-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001153 seconds, Stopping threads took: 0.0000082 seconds
[2026-09-02T10:13:00.610-0300][info][safepoint     ] Application time: 0.0087503 seconds
[2026-09-02T10:13:00.610-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.610-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.610-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000915 seconds, Stopping threads took: 0.0000101 seconds
[2026-09-02T10:13:00.615-0300][info][safepoint     ] Application time: 0.0051466 seconds
[2026-09-02T10:13:00.615-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.616-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.616-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000805 seconds, Stopping threads took: 0.0000114 seconds
[2026-09-02T10:13:00.616-0300][info][safepoint     ] Application time: 0.0001330 seconds
[2026-09-02T10:13:00.616-0300][info][safepoint     ] Entering safepoint region: Deoptimize
[2026-09-02T10:13:00.616-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.616-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0007481 seconds, Stopping threads took: 0.0000037 seconds
[2026-09-02T10:13:00.620-0300][info][safepoint     ] Application time: 0.0031411 seconds
[2026-09-02T10:13:00.620-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.620-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.620-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001297 seconds, Stopping threads took: 0.0000402 seconds
[2026-09-02T10:13:00.620-0300][info][safepoint     ] Application time: 0.0000277 seconds
[2026-09-02T10:13:00.620-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.620-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.620-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000842 seconds, Stopping threads took: 0.0000056 seconds
[2026-09-02T10:13:00.620-0300][info][safepoint     ] Application time: 0.0000652 seconds
[2026-09-02T10:13:00.620-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.620-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.620-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000895 seconds, Stopping threads took: 0.0000050 seconds
[2026-09-02T10:13:00.620-0300][info][safepoint     ] Application time: 0.0000252 seconds
[2026-09-02T10:13:00.620-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.620-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.620-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000759 seconds, Stopping threads took: 0.0000048 seconds
[2026-09-02T10:13:00.620-0300][info][safepoint     ] Application time: 0.0000186 seconds
[2026-09-02T10:13:00.620-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.620-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.620-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000744 seconds, Stopping threads took: 0.0000048 seconds
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-09-02 10:12:48,305 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.http.multipart.max-file-size" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-09-02 10:12:48,313 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.jvm.args" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-09-02 10:12:48,313 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.datasource.pge.jdbc.schema" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-09-02 10:12:48,314 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.datasource.jdbc.retry-interval" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-09-02 10:12:48,314 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.datasource.pge.active" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-09-02 10:12:48,315 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.hibernate-orm.statistic" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-09-02 10:12:48,315 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.scheduler.timezone" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-09-02 10:12:48,316 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.http.multipart.max-request-size" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-09-02 10:12:48,316 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.datasource.jdbc.retry-attempts" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-09-02 10:12:48,317 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.oidc-client.read-timeout" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-09-02 10:13:00,618 WARN  [io.qua.run.log.LoggingSetupRecorder] (main) Log level DEBUG for category 'org.jboss.resteasy.reactive.client.logging' set below minimum logging level INFO, promoting it to INFO. Set the build time configuration property 'quarkus.log.category."org.jboss.resteasy.reactive.client.logging".min-level' to 'DEBUG' to avoid this warning
[2026-09-02T10:13:00.711-0300][info][safepoint     ] Application time: 0.0902765 seconds
[2026-09-02T10:13:00.711-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.711-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.711-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001168 seconds, Stopping threads took: 0.0000121 seconds
[2026-09-02T10:13:00.711-0300][info][safepoint     ] Application time: 0.0000364 seconds
[2026-09-02T10:13:00.711-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:00.711-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.711-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000660 seconds, Stopping threads took: 0.0000036 seconds
[2026-09-02T10:13:00.804-0300][info][safepoint     ] Application time: 0.0934747 seconds
[2026-09-02T10:13:00.804-0300][info][safepoint     ] Entering safepoint region: Deoptimize
[2026-09-02T10:13:00.805-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.805-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0008561 seconds, Stopping threads took: 0.0000116 seconds
[2026-09-02T10:13:00.911-0300][info][safepoint     ] Application time: 0.1057718 seconds
[2026-09-02T10:13:00.911-0300][info][safepoint     ] Entering safepoint region: Deoptimize
[2026-09-02T10:13:00.912-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:00.912-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0009824 seconds, Stopping threads took: 0.0000240 seconds
[2026-09-02T10:13:01.007-0300][info][safepoint     ] Application time: 0.0951768 seconds
[2026-09-02T10:13:01.007-0300][info][safepoint     ] Entering safepoint region: Deoptimize
[2026-09-02T10:13:01.008-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.008-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0009315 seconds, Stopping threads took: 0.0000153 seconds
[2026-09-02T10:13:01.210-0300][info][safepoint     ] Application time: 0.2019927 seconds
[2026-09-02T10:13:01.210-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.210-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.210-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001349 seconds, Stopping threads took: 0.0000112 seconds
[2026-09-02T10:13:01.210-0300][info][safepoint     ] Application time: 0.0000285 seconds
[2026-09-02T10:13:01.210-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.210-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.210-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000739 seconds, Stopping threads took: 0.0000039 seconds
[2026-09-02T10:13:01.210-0300][info][safepoint     ] Application time: 0.0000218 seconds
[2026-09-02T10:13:01.210-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.210-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.210-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000645 seconds, Stopping threads took: 0.0000037 seconds
[2026-09-02T10:13:01.211-0300][info][safepoint     ] Application time: 0.0000234 seconds
[2026-09-02T10:13:01.211-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.211-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.211-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000820 seconds, Stopping threads took: 0.0000036 seconds
[2026-09-02T10:13:01.211-0300][info][safepoint     ] Application time: 0.0005300 seconds
[2026-09-02T10:13:01.211-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.211-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.211-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000932 seconds, Stopping threads took: 0.0000179 seconds
[2026-09-02T10:13:01.211-0300][info][safepoint     ] Application time: 0.0000266 seconds
[2026-09-02T10:13:01.211-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.211-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.211-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000770 seconds, Stopping threads took: 0.0000036 seconds
[2026-09-02T10:13:01.211-0300][info][safepoint     ] Application time: 0.0000357 seconds
[2026-09-02T10:13:01.211-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.211-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.211-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001038 seconds, Stopping threads took: 0.0000200 seconds
[2026-09-02T10:13:01.212-0300][info][safepoint     ] Application time: 0.0000296 seconds
[2026-09-02T10:13:01.212-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.212-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.212-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001639 seconds, Stopping threads took: 0.0000320 seconds
[2026-09-02T10:13:01.212-0300][info][safepoint     ] Application time: 0.0001601 seconds
[2026-09-02T10:13:01.212-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.212-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.212-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000975 seconds, Stopping threads took: 0.0000218 seconds
[2026-09-02T10:13:01.212-0300][info][safepoint     ] Application time: 0.0000289 seconds
[2026-09-02T10:13:01.212-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.212-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.212-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001311 seconds, Stopping threads took: 0.0000535 seconds
[2026-09-02T10:13:01.212-0300][info][safepoint     ] Application time: 0.0000250 seconds
[2026-09-02T10:13:01.212-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.212-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.212-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000920 seconds, Stopping threads took: 0.0000172 seconds
[2026-09-02T10:13:01.212-0300][info][safepoint     ] Application time: 0.0000296 seconds
[2026-09-02T10:13:01.212-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.212-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.212-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000956 seconds, Stopping threads took: 0.0000286 seconds
[2026-09-02T10:13:01.213-0300][info][safepoint     ] Application time: 0.0002055 seconds
[2026-09-02T10:13:01.213-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.213-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.213-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001044 seconds, Stopping threads took: 0.0000240 seconds
[2026-09-02T10:13:01.213-0300][info][safepoint     ] Application time: 0.0000313 seconds
[2026-09-02T10:13:01.213-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.213-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.213-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000805 seconds, Stopping threads took: 0.0000183 seconds
[2026-09-02T10:13:01.213-0300][info][safepoint     ] Application time: 0.0000264 seconds
[2026-09-02T10:13:01.213-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.213-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.213-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000720 seconds, Stopping threads took: 0.0000134 seconds
[2026-09-02T10:13:01.213-0300][info][safepoint     ] Application time: 0.0000308 seconds
[2026-09-02T10:13:01.213-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.213-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.213-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000828 seconds, Stopping threads took: 0.0000198 seconds
[2026-09-02T10:13:01.214-0300][info][safepoint     ] Application time: 0.0007444 seconds
[2026-09-02T10:13:01.214-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.214-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.214-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000695 seconds, Stopping threads took: 0.0000044 seconds
[2026-09-02T10:13:01.301-0300][info][safepoint     ] Application time: 0.0868853 seconds
[2026-09-02T10:13:01.301-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.301-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.301-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001301 seconds, Stopping threads took: 0.0000236 seconds
[2026-09-02T10:13:01.301-0300][info][safepoint     ] Application time: 0.0000729 seconds
[2026-09-02T10:13:01.301-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.301-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.301-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001262 seconds, Stopping threads took: 0.0000288 seconds
[2026-09-02T10:13:01.301-0300][info][safepoint     ] Application time: 0.0000339 seconds
[2026-09-02T10:13:01.301-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.301-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.301-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000821 seconds, Stopping threads took: 0.0000150 seconds
[2026-09-02T10:13:01.302-0300][info][safepoint     ] Application time: 0.0011263 seconds
[2026-09-02T10:13:01.302-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.302-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.303-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000845 seconds, Stopping threads took: 0.0000056 seconds
[2026-09-02T10:13:01.303-0300][info][safepoint     ] Application time: 0.0000435 seconds
[2026-09-02T10:13:01.303-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.303-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.303-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000935 seconds, Stopping threads took: 0.0000044 seconds
[2026-09-02T10:13:01.303-0300][info][safepoint     ] Application time: 0.0000238 seconds
[2026-09-02T10:13:01.303-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.303-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.303-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001195 seconds, Stopping threads took: 0.0000432 seconds
[2026-09-02T10:13:01.303-0300][info][safepoint     ] Application time: 0.0000238 seconds
[2026-09-02T10:13:01.303-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.303-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.303-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000818 seconds, Stopping threads took: 0.0000039 seconds
[2026-09-02T10:13:01.303-0300][info][safepoint     ] Application time: 0.0002518 seconds
[2026-09-02T10:13:01.303-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.303-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.303-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000949 seconds, Stopping threads took: 0.0000057 seconds
[2026-09-02T10:13:01.303-0300][info][safepoint     ] Application time: 0.0000208 seconds
[2026-09-02T10:13:01.303-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.303-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.303-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000775 seconds, Stopping threads took: 0.0000031 seconds
[2026-09-02T10:13:01.303-0300][info][safepoint     ] Application time: 0.0000198 seconds
[2026-09-02T10:13:01.303-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.303-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.303-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000694 seconds, Stopping threads took: 0.0000036 seconds
[2026-09-02T10:13:01.306-0300][info][safepoint     ] Application time: 0.0029313 seconds
[2026-09-02T10:13:01.306-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.307-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.307-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001422 seconds, Stopping threads took: 0.0000372 seconds
[2026-09-02T10:13:01.307-0300][info][safepoint     ] Application time: 0.0003604 seconds
[2026-09-02T10:13:01.307-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.307-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.307-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001161 seconds, Stopping threads took: 0.0000345 seconds
[2026-09-02T10:13:01.307-0300][info][safepoint     ] Application time: 0.0004058 seconds
[2026-09-02T10:13:01.307-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.308-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.308-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001133 seconds, Stopping threads took: 0.0000236 seconds
[2026-09-02T10:13:01.308-0300][info][safepoint     ] Application time: 0.0005266 seconds
[2026-09-02T10:13:01.308-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.308-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.308-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000896 seconds, Stopping threads took: 0.0000045 seconds
[2026-09-02T10:13:01.309-0300][info][safepoint     ] Application time: 0.0003607 seconds
[2026-09-02T10:13:01.309-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.309-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.309-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001081 seconds, Stopping threads took: 0.0000252 seconds
[2026-09-02T10:13:01.309-0300][info][safepoint     ] Application time: 0.0000805 seconds
[2026-09-02T10:13:01.309-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.309-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.309-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000870 seconds, Stopping threads took: 0.0000040 seconds
[2026-09-02T10:13:01.309-0300][info][safepoint     ] Application time: 0.0000251 seconds
[2026-09-02T10:13:01.309-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.309-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.309-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000970 seconds, Stopping threads took: 0.0000170 seconds
[2026-09-02T10:13:01.311-0300][info][safepoint     ] Application time: 0.0017533 seconds
[2026-09-02T10:13:01.311-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.311-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.311-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001411 seconds, Stopping threads took: 0.0000233 seconds
[2026-09-02T10:13:01.311-0300][info][safepoint     ] Application time: 0.0001975 seconds
[2026-09-02T10:13:01.311-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.311-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.311-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001181 seconds, Stopping threads took: 0.0000241 seconds
[2026-09-02T10:13:01.315-0300][info][safepoint     ] Application time: 0.0039731 seconds
[2026-09-02T10:13:01.315-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.315-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.315-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000862 seconds, Stopping threads took: 0.0000073 seconds
[2026-09-02T10:13:01.710-0300][info][safepoint     ] Application time: 0.3944429 seconds
[2026-09-02T10:13:01.710-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.710-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.710-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002377 seconds, Stopping threads took: 0.0000332 seconds
[2026-09-02T10:13:01.710-0300][info][safepoint     ] Application time: 0.0002432 seconds
[2026-09-02T10:13:01.710-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.710-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.710-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001207 seconds, Stopping threads took: 0.0000215 seconds
[2026-09-02T10:13:01.710-0300][info][safepoint     ] Application time: 0.0000298 seconds
[2026-09-02T10:13:01.710-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.711-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.711-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001172 seconds, Stopping threads took: 0.0000294 seconds
[2026-09-02T10:13:01.718-0300][info][safepoint     ] Application time: 0.0072383 seconds
[2026-09-02T10:13:01.718-0300][info][safepoint     ] Entering safepoint region: BulkRevokeBias
[2026-09-02T10:13:01.718-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.718-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002883 seconds, Stopping threads took: 0.0000094 seconds
[2026-09-02T10:13:01.718-0300][info][safepoint     ] Application time: 0.0000348 seconds
[2026-09-02T10:13:01.718-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.718-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.718-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000819 seconds, Stopping threads took: 0.0000036 seconds
[2026-09-02T10:13:01.718-0300][info][safepoint     ] Application time: 0.0000222 seconds
[2026-09-02T10:13:01.718-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.718-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.718-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000653 seconds, Stopping threads took: 0.0000034 seconds
[2026-09-02T10:13:01.718-0300][info][safepoint     ] Application time: 0.0000270 seconds
[2026-09-02T10:13:01.718-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.718-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.718-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000647 seconds, Stopping threads took: 0.0000034 seconds
[2026-09-02T10:13:01.805-0300][info][safepoint     ] Application time: 0.0869170 seconds
[2026-09-02T10:13:01.805-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.805-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.806-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001419 seconds, Stopping threads took: 0.0000205 seconds
[2026-09-02T10:13:01.810-0300][info][safepoint     ] Application time: 0.0047679 seconds
[2026-09-02T10:13:01.810-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.810-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.810-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001066 seconds, Stopping threads took: 0.0000097 seconds
[2026-09-02T10:13:01.810-0300][info][safepoint     ] Application time: 0.0000284 seconds
[2026-09-02T10:13:01.810-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.811-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.811-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000848 seconds, Stopping threads took: 0.0000037 seconds
[2026-09-02T10:13:01.811-0300][info][safepoint     ] Application time: 0.0000308 seconds
[2026-09-02T10:13:01.811-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.811-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.811-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000646 seconds, Stopping threads took: 0.0000035 seconds
[2026-09-02T10:13:01.812-0300][info][safepoint     ] Application time: 0.0012863 seconds
[2026-09-02T10:13:01.812-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.812-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.812-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000879 seconds, Stopping threads took: 0.0000055 seconds
[2026-09-02T10:13:01.812-0300][info][safepoint     ] Application time: 0.0000371 seconds
[2026-09-02T10:13:01.812-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.812-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.812-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001153 seconds, Stopping threads took: 0.0000302 seconds
[2026-09-02T10:13:01.812-0300][info][safepoint     ] Application time: 0.0000406 seconds
[2026-09-02T10:13:01.812-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.812-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.812-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000793 seconds, Stopping threads took: 0.0000210 seconds
[2026-09-02T10:13:01.812-0300][info][safepoint     ] Application time: 0.0001781 seconds
[2026-09-02T10:13:01.813-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.813-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.813-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001446 seconds, Stopping threads took: 0.0000458 seconds
[2026-09-02T10:13:01.813-0300][info][safepoint     ] Application time: 0.0000958 seconds
[2026-09-02T10:13:01.813-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.813-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.813-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001212 seconds, Stopping threads took: 0.0000320 seconds
[2026-09-02T10:13:01.813-0300][info][safepoint     ] Application time: 0.0000801 seconds
[2026-09-02T10:13:01.813-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.813-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.813-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001429 seconds, Stopping threads took: 0.0000342 seconds
[2026-09-02T10:13:01.813-0300][info][safepoint     ] Application time: 0.0003559 seconds
[2026-09-02T10:13:01.813-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.814-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.814-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001237 seconds, Stopping threads took: 0.0000297 seconds
[2026-09-02T10:13:01.814-0300][info][safepoint     ] Application time: 0.0000258 seconds
[2026-09-02T10:13:01.814-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.814-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.814-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000836 seconds, Stopping threads took: 0.0000115 seconds
[2026-09-02T10:13:01.814-0300][info][safepoint     ] Application time: 0.0000245 seconds
[2026-09-02T10:13:01.814-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.814-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.814-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001295 seconds, Stopping threads took: 0.0000193 seconds
[2026-09-02T10:13:01.814-0300][info][safepoint     ] Application time: 0.0000326 seconds
[2026-09-02T10:13:01.814-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.814-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.814-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001648 seconds, Stopping threads took: 0.0000841 seconds
[2026-09-02T10:13:01.814-0300][info][safepoint     ] Application time: 0.0002048 seconds
[2026-09-02T10:13:01.814-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.814-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.814-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001328 seconds, Stopping threads took: 0.0000201 seconds
[2026-09-02T10:13:01.814-0300][info][safepoint     ] Application time: 0.0000364 seconds
[2026-09-02T10:13:01.814-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.815-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.815-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001322 seconds, Stopping threads took: 0.0000283 seconds
[2026-09-02T10:13:01.815-0300][info][safepoint     ] Application time: 0.0001269 seconds
[2026-09-02T10:13:01.815-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.815-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.815-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001478 seconds, Stopping threads took: 0.0000290 seconds
[2026-09-02T10:13:01.815-0300][info][safepoint     ] Application time: 0.0000338 seconds
[2026-09-02T10:13:01.815-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.815-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.815-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001789 seconds, Stopping threads took: 0.0000219 seconds
[2026-09-02T10:13:01.815-0300][info][safepoint     ] Application time: 0.0001810 seconds
[2026-09-02T10:13:01.815-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.815-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.815-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001743 seconds, Stopping threads took: 0.0000426 seconds
[2026-09-02T10:13:01.816-0300][info][safepoint     ] Application time: 0.0001094 seconds
[2026-09-02T10:13:01.816-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.816-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.816-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001536 seconds, Stopping threads took: 0.0000223 seconds
[2026-09-02T10:13:01.816-0300][info][safepoint     ] Application time: 0.0000321 seconds
[2026-09-02T10:13:01.816-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.816-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.816-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001273 seconds, Stopping threads took: 0.0000209 seconds
[2026-09-02T10:13:01.816-0300][info][safepoint     ] Application time: 0.0000518 seconds
[2026-09-02T10:13:01.816-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.816-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.816-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001433 seconds, Stopping threads took: 0.0000189 seconds
[2026-09-02T10:13:01.819-0300][info][safepoint     ] Application time: 0.0025326 seconds
[2026-09-02T10:13:01.819-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.819-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.819-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000996 seconds, Stopping threads took: 0.0000210 seconds
2026-09-02 10:13:01,818 INFO  [io.agr.pool] (JPA Startup Thread: <default>) Datasource '<default>': Initial size smaller than min. Connections will be created when necessary
[2026-09-02T10:13:01.904-0300][info][safepoint     ] Application time: 0.0848897 seconds
[2026-09-02T10:13:01.904-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.904-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.904-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001711 seconds, Stopping threads took: 0.0000155 seconds
[2026-09-02T10:13:01.904-0300][info][safepoint     ] Application time: 0.0000497 seconds
[2026-09-02T10:13:01.904-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.904-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.904-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001305 seconds, Stopping threads took: 0.0000041 seconds
[2026-09-02T10:13:01.904-0300][info][safepoint     ] Application time: 0.0001263 seconds
[2026-09-02T10:13:01.904-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.904-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.904-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001465 seconds, Stopping threads took: 0.0000057 seconds
[2026-09-02T10:13:01.904-0300][info][safepoint     ] Application time: 0.0000784 seconds
[2026-09-02T10:13:01.904-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.905-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.905-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001302 seconds, Stopping threads took: 0.0000047 seconds
[2026-09-02T10:13:01.905-0300][info][safepoint     ] Application time: 0.0003493 seconds
[2026-09-02T10:13:01.905-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.905-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.905-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001099 seconds, Stopping threads took: 0.0000202 seconds
[2026-09-02T10:13:01.906-0300][info][safepoint     ] Application time: 0.0005672 seconds
[2026-09-02T10:13:01.906-0300][info][safepoint     ] Entering safepoint region: BulkRevokeBias
[2026-09-02T10:13:01.906-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.906-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002660 seconds, Stopping threads took: 0.0000041 seconds
[2026-09-02T10:13:01.907-0300][info][safepoint     ] Application time: 0.0007743 seconds
[2026-09-02T10:13:01.907-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.907-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.907-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000862 seconds, Stopping threads took: 0.0000048 seconds
[2026-09-02T10:13:01.907-0300][info][safepoint     ] Application time: 0.0000278 seconds
[2026-09-02T10:13:01.907-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.907-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.907-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000667 seconds, Stopping threads took: 0.0000030 seconds
[2026-09-02T10:13:01.907-0300][info][safepoint     ] Application time: 0.0000319 seconds
[2026-09-02T10:13:01.907-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.907-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.907-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000830 seconds, Stopping threads took: 0.0000041 seconds
[2026-09-02T10:13:01.916-0300][info][safepoint     ] Application time: 0.0093966 seconds
[2026-09-02T10:13:01.916-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.917-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.917-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001155 seconds, Stopping threads took: 0.0000099 seconds
[2026-09-02T10:13:01.918-0300][info][safepoint     ] Application time: 0.0014579 seconds
[2026-09-02T10:13:01.918-0300][info][safepoint     ] Entering safepoint region: Deoptimize
[2026-09-02T10:13:01.919-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.919-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0008737 seconds, Stopping threads took: 0.0000111 seconds
[2026-09-02T10:13:01.921-0300][info][safepoint     ] Application time: 0.0020368 seconds
[2026-09-02T10:13:01.921-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.921-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.921-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001336 seconds, Stopping threads took: 0.0000278 seconds
[2026-09-02T10:13:01.921-0300][info][safepoint     ] Application time: 0.0000286 seconds
[2026-09-02T10:13:01.921-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:01.921-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:01.921-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001203 seconds, Stopping threads took: 0.0000040 seconds
[2026-09-02T10:13:02.005-0300][info][safepoint     ] Application time: 0.0834513 seconds
[2026-09-02T10:13:02.005-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.005-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.005-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001881 seconds, Stopping threads took: 0.0000524 seconds
[2026-09-02T10:13:02.007-0300][info][safepoint     ] Application time: 0.0016659 seconds
[2026-09-02T10:13:02.007-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.007-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.007-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001220 seconds, Stopping threads took: 0.0000215 seconds
[2026-09-02T10:13:02.130-0300][info][safepoint     ] Application time: 0.1229851 seconds
[2026-09-02T10:13:02.130-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.130-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.130-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001271 seconds, Stopping threads took: 0.0000135 seconds
[2026-09-02T10:13:02.130-0300][info][safepoint     ] Application time: 0.0000544 seconds
[2026-09-02T10:13:02.130-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.130-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.130-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000612 seconds, Stopping threads took: 0.0000039 seconds
[2026-09-02T10:13:02.130-0300][info][safepoint     ] Application time: 0.0000305 seconds
[2026-09-02T10:13:02.130-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.130-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.130-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000712 seconds, Stopping threads took: 0.0000036 seconds
[2026-09-02T10:13:02.229-0300][info][safepoint     ] Application time: 0.0985764 seconds
[2026-09-02T10:13:02.229-0300][info][safepoint     ] Entering safepoint region: ThreadDump
[2026-09-02T10:13:02.302-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.302-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0727776 seconds, Stopping threads took: 0.0000110 seconds
[2026-09-02T10:13:02.302-0300][info][safepoint     ] Application time: 0.0004499 seconds
[2026-09-02T10:13:02.302-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.302-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.302-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001333 seconds, Stopping threads took: 0.0000184 seconds
[2026-09-02T10:13:02.302-0300][info][safepoint     ] Application time: 0.0000270 seconds
[2026-09-02T10:13:02.302-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.302-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.302-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000733 seconds, Stopping threads took: 0.0000040 seconds
[2026-09-02T10:13:02.302-0300][info][safepoint     ] Application time: 0.0000752 seconds
[2026-09-02T10:13:02.302-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.302-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.302-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000861 seconds, Stopping threads took: 0.0000036 seconds
[2026-09-02T10:13:02.302-0300][info][safepoint     ] Application time: 0.0000225 seconds
[2026-09-02T10:13:02.302-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.303-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.303-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000801 seconds, Stopping threads took: 0.0000036 seconds
[2026-09-02T10:13:02.303-0300][info][safepoint     ] Application time: 0.0000256 seconds
[2026-09-02T10:13:02.303-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.303-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.303-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000779 seconds, Stopping threads took: 0.0000036 seconds
[2026-09-02T10:13:02.303-0300][info][safepoint     ] Application time: 0.0000253 seconds
[2026-09-02T10:13:02.303-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.303-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.303-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000801 seconds, Stopping threads took: 0.0000044 seconds
[2026-09-02T10:13:02.303-0300][info][safepoint     ] Application time: 0.0000835 seconds
[2026-09-02T10:13:02.303-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.303-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.303-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000761 seconds, Stopping threads took: 0.0000044 seconds
[2026-09-02T10:13:02.303-0300][info][safepoint     ] Application time: 0.0000295 seconds
[2026-09-02T10:13:02.303-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.303-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.303-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000639 seconds, Stopping threads took: 0.0000029 seconds
[2026-09-02T10:13:02.303-0300][info][safepoint     ] Application time: 0.0000216 seconds
[2026-09-02T10:13:02.303-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.303-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.303-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000796 seconds, Stopping threads took: 0.0000035 seconds
[2026-09-02T10:13:02.304-0300][info][safepoint     ] Application time: 0.0005113 seconds
[2026-09-02T10:13:02.304-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.304-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.304-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000678 seconds, Stopping threads took: 0.0000059 seconds
[2026-09-02T10:13:02.306-0300][info][safepoint     ] Application time: 0.0022254 seconds
[2026-09-02T10:13:02.306-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.306-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.306-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000849 seconds, Stopping threads took: 0.0000070 seconds
[2026-09-02T10:13:02.310-0300][info][safepoint     ] Application time: 0.0036256 seconds
[2026-09-02T10:13:02.310-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.310-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.310-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001739 seconds, Stopping threads took: 0.0000223 seconds
[2026-09-02T10:13:02.310-0300][info][safepoint     ] Application time: 0.0001967 seconds
[2026-09-02T10:13:02.310-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.310-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.310-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002556 seconds, Stopping threads took: 0.0000452 seconds
[2026-09-02T10:13:02.310-0300][info][safepoint     ] Application time: 0.0001294 seconds
[2026-09-02T10:13:02.311-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.311-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.311-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001918 seconds, Stopping threads took: 0.0000243 seconds
[2026-09-02T10:13:02.311-0300][info][safepoint     ] Application time: 0.0001510 seconds
[2026-09-02T10:13:02.311-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.311-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.311-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001880 seconds, Stopping threads took: 0.0000098 seconds
[2026-09-02T10:13:02.311-0300][info][safepoint     ] Application time: 0.0003225 seconds
[2026-09-02T10:13:02.311-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.312-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.312-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001967 seconds, Stopping threads took: 0.0000307 seconds
[2026-09-02T10:13:02.312-0300][info][safepoint     ] Application time: 0.0000847 seconds
[2026-09-02T10:13:02.312-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.312-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.312-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002572 seconds, Stopping threads took: 0.0000556 seconds
[2026-09-02T10:13:02.312-0300][info][safepoint     ] Application time: 0.0001690 seconds
[2026-09-02T10:13:02.312-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.312-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.312-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002608 seconds, Stopping threads took: 0.0000490 seconds
[2026-09-02T10:13:02.313-0300][info][safepoint     ] Application time: 0.0003657 seconds
[2026-09-02T10:13:02.313-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.313-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.313-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0003119 seconds, Stopping threads took: 0.0000275 seconds
[2026-09-02T10:13:02.313-0300][info][safepoint     ] Application time: 0.0000466 seconds
[2026-09-02T10:13:02.313-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.313-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.313-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002301 seconds, Stopping threads took: 0.0000345 seconds
[2026-09-02T10:13:02.313-0300][info][safepoint     ] Application time: 0.0000349 seconds
[2026-09-02T10:13:02.313-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.314-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.314-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001526 seconds, Stopping threads took: 0.0000049 seconds
[2026-09-02T10:13:02.322-0300][info][safepoint     ] Application time: 0.0083098 seconds
[2026-09-02T10:13:02.322-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.322-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.322-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001289 seconds, Stopping threads took: 0.0000270 seconds
[2026-09-02T10:13:02.329-0300][info][safepoint     ] Application time: 0.0072860 seconds
[2026-09-02T10:13:02.329-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.329-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.329-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001338 seconds, Stopping threads took: 0.0000137 seconds
[2026-09-02T10:13:02.330-0300][info][safepoint     ] Application time: 0.0000460 seconds
[2026-09-02T10:13:02.330-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.330-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.330-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000599 seconds, Stopping threads took: 0.0000040 seconds
[2026-09-02T10:13:02.405-0300][info][safepoint     ] Application time: 0.0756958 seconds
[2026-09-02T10:13:02.405-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.406-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.406-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002445 seconds, Stopping threads took: 0.0000372 seconds
[2026-09-02T10:13:02.406-0300][info][safepoint     ] Application time: 0.0000659 seconds
[2026-09-02T10:13:02.406-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.406-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.406-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001482 seconds, Stopping threads took: 0.0000308 seconds
[2026-09-02T10:13:02.406-0300][info][safepoint     ] Application time: 0.0000770 seconds
[2026-09-02T10:13:02.406-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.406-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.406-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000957 seconds, Stopping threads took: 0.0000063 seconds
[2026-09-02T10:13:02.406-0300][info][safepoint     ] Application time: 0.0002272 seconds
[2026-09-02T10:13:02.406-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.406-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.406-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001440 seconds, Stopping threads took: 0.0000232 seconds
[2026-09-02T10:13:02.407-0300][info][safepoint     ] Application time: 0.0002593 seconds
[2026-09-02T10:13:02.407-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.407-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.407-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001327 seconds, Stopping threads took: 0.0000253 seconds
[2026-09-02T10:13:02.506-0300][info][safepoint     ] Application time: 0.0995030 seconds
[2026-09-02T10:13:02.506-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.506-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.506-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001183 seconds, Stopping threads took: 0.0000115 seconds
[2026-09-02T10:13:02.622-0300][info][safepoint     ] Application time: 0.1159391 seconds
[2026-09-02T10:13:02.622-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.622-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.622-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001270 seconds, Stopping threads took: 0.0000345 seconds
[2026-09-02T10:13:02.704-0300][info][safepoint     ] Application time: 0.0811924 seconds
[2026-09-02T10:13:02.704-0300][info][safepoint     ] Entering safepoint region: BulkRevokeBias
[2026-09-02T10:13:02.704-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.704-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0003727 seconds, Stopping threads took: 0.0000115 seconds
[2026-09-02T10:13:02.706-0300][info][safepoint     ] Application time: 0.0014652 seconds
[2026-09-02T10:13:02.706-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.706-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.706-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001525 seconds, Stopping threads took: 0.0000587 seconds
2026-09-02 10:13:02,307 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@7f819e58)
2026-09-02 10:13:02,308 INFO  [ora.jdbc] (agroal-11) traceId=1347F3F2. 
2026-09-02 10:13:02,310 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:13:02,312 INFO  [ora.jdbc] (agroal-11) traceId=1347F3F2, anoEnabled=true. 
2026-09-02 10:13:02,314 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:13:02,317 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:13:02,319 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:13:02,321 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 1347F3F2
2026-09-02 10:13:02,322 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:13:02,323 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:13:02,325 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:13:02,327 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:13:02,329 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:13:02,330 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 1347F3F2
2026-09-02 10:13:02,331 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:13:02,332 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:13:02,333 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:13:02,334 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:13:02,339 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:13:02,340 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 1347F3F2
2026-09-02 10:13:02,341 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:13:02,348 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=6cWM7zgmRR6NsEg20tZyeQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=6cWM7zgmRR6NsEg20tZyeQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-09-02 10:13:02,349 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-09-02 10:13:02,806 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=6cWM7zgmRR6NsEg20tZyeQ==)
https://docs.oracle.com/error-help/db/ora-12514/
[2026-09-02T10:13:02.807-0300][info][safepoint     ] Application time: 0.1015364 seconds
[2026-09-02T10:13:02.807-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.807-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.807-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002068 seconds, Stopping threads took: 0.0000994 seconds
2026-09-02 10:13:02,807 WARN  [org.hib.eng.jdb.env.int.JdbcEnvironmentInitiator] (JPA Startup Thread: <default>) HHH000342: Could not obtain connection to query metadata: java.lang.NullPointerException
	at org.hibernate.resource.transaction.backend.jta.internal.JtaIsolationDelegate.doTheWork(JtaIsolationDelegate.java:186)
	at org.hibernate.resource.transaction.backend.jta.internal.JtaIsolationDelegate.lambda$delegateWork$1(JtaIsolationDelegate.java:75)
	at org.hibernate.resource.transaction.backend.jta.internal.JtaIsolationDelegate.doInSuspendedTransaction(JtaIsolationDelegate.java:107)
	at org.hibernate.resource.transaction.backend.jta.internal.JtaIsolationDelegate.delegateWork(JtaIsolationDelegate.java:72)
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.getJdbcEnvironmentUsingJdbcMetadata(JdbcEnvironmentInitiator.java:279)
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:193)
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:69)
	at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:119)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:264)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:239)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:216)
	at org.hibernate.engine.jdbc.internal.JdbcServicesImpl.configure(JdbcServicesImpl.java:52)
	at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.configureService(StandardServiceRegistryImpl.java:125)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:248)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:216)
	at org.hibernate.boot.internal.SessionFactoryOptionsBuilder.<init>(SessionFactoryOptionsBuilder.java:273)
	at io.quarkus.hibernate.orm.runtime.recording.PrevalidatedQuarkusMetadata.buildSessionFactoryOptionsBuilder(PrevalidatedQuarkusMetadata.java:70)
	at io.quarkus.hibernate.orm.runtime.boot.FastBootEntityManagerFactoryBuilder.build(FastBootEntityManagerFactoryBuilder.java:81)
	at io.quarkus.hibernate.orm.runtime.FastBootHibernatePersistenceProvider.createEntityManagerFactory(FastBootHibernatePersistenceProvider.java:74)
	at jakarta.persistence.Persistence.createEntityManagerFactory(Persistence.java:80)
	at jakarta.persistence.Persistence.createEntityManagerFactory(Persistence.java:55)
	at io.quarkus.hibernate.orm.runtime.JPAConfig$LazyPersistenceUnit.get(JPAConfig.java:156)
	at io.quarkus.hibernate.orm.runtime.JPAConfig$1.run(JPAConfig.java:64)
	at java.base/java.lang.Thread.run(Thread.java:829)

[2026-09-02T10:13:02.902-0300][info][safepoint     ] Application time: 0.0944942 seconds
[2026-09-02T10:13:02.902-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.902-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.902-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001740 seconds, Stopping threads took: 0.0000390 seconds
[2026-09-02T10:13:02.917-0300][info][safepoint     ] Application time: 0.0147193 seconds
[2026-09-02T10:13:02.917-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.917-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.917-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001913 seconds, Stopping threads took: 0.0000744 seconds
[2026-09-02T10:13:02.917-0300][info][safepoint     ] Application time: 0.0000279 seconds
[2026-09-02T10:13:02.917-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.917-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.917-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000719 seconds, Stopping threads took: 0.0000049 seconds
[2026-09-02T10:13:02.917-0300][info][safepoint     ] Application time: 0.0000264 seconds
[2026-09-02T10:13:02.917-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.918-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.918-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002402 seconds, Stopping threads took: 0.0001493 seconds
[2026-09-02T10:13:02.918-0300][info][safepoint     ] Application time: 0.0000243 seconds
[2026-09-02T10:13:02.918-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.918-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.918-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000637 seconds, Stopping threads took: 0.0000037 seconds
[2026-09-02T10:13:02.918-0300][info][safepoint     ] Application time: 0.0000185 seconds
[2026-09-02T10:13:02.918-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:02.918-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:02.918-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000679 seconds, Stopping threads took: 0.0000036 seconds
[2026-09-02T10:13:02.918-0300][info][safepoint     ] Application time: 0.0000179 seconds
[2026-09-02T10:13:02.918-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:03.001-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:03.001-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0830936 seconds, Stopping threads took: 0.0000036 seconds
[2026-09-02T10:13:03.132-0300][info][safepoint     ] Application time: 0.1313288 seconds
[2026-09-02T10:13:03.132-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:03.132-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:03.132-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001389 seconds, Stopping threads took: 0.0000313 seconds
[2026-09-02T10:13:03.222-0300][info][safepoint     ] Application time: 0.0897112 seconds
[2026-09-02T10:13:03.301-0300][info][safepoint     ] Entering safepoint region: BulkRevokeBias
[2026-09-02T10:13:03.301-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:03.301-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0792349 seconds, Stopping threads took: 0.0787347 seconds
[2026-09-02T10:13:03.525-0300][info][safepoint     ] Application time: 0.2234660 seconds
[2026-09-02T10:13:03.525-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:03.525-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:03.525-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002749 seconds, Stopping threads took: 0.0001391 seconds
[2026-09-02T10:13:03.525-0300][info][safepoint     ] Application time: 0.0000447 seconds
[2026-09-02T10:13:03.525-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:03.525-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:03.525-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000906 seconds, Stopping threads took: 0.0000265 seconds
[2026-09-02T10:13:03.607-0300][info][safepoint     ] Application time: 0.0815530 seconds
[2026-09-02T10:13:03.608-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:03.608-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:03.608-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0008808 seconds, Stopping threads took: 0.0007464 seconds
[2026-09-02T10:13:03.609-0300][info][safepoint     ] Application time: 0.0009196 seconds
[2026-09-02T10:13:03.609-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:03.609-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:03.609-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001994 seconds, Stopping threads took: 0.0001191 seconds
[2026-09-02T10:13:03.609-0300][info][safepoint     ] Application time: 0.0001197 seconds
[2026-09-02T10:13:03.610-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:03.610-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:03.610-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0006289 seconds, Stopping threads took: 0.0005570 seconds
[2026-09-02T10:13:03.610-0300][info][safepoint     ] Application time: 0.0000498 seconds
[2026-09-02T10:13:03.610-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:03.610-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:03.610-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001098 seconds, Stopping threads took: 0.0000315 seconds
[2026-09-02T10:13:03.610-0300][info][safepoint     ] Application time: 0.0000351 seconds
[2026-09-02T10:13:03.610-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:03.610-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:03.610-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000820 seconds, Stopping threads took: 0.0000067 seconds
[2026-09-02T10:13:03.610-0300][info][safepoint     ] Application time: 0.0000326 seconds
[2026-09-02T10:13:03.610-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:03.610-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:03.610-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002436 seconds, Stopping threads took: 0.0001664 seconds
[2026-09-02T10:13:03.911-0300][info][safepoint     ] Application time: 0.3010475 seconds
[2026-09-02T10:13:03.911-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:03.911-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:03.912-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002189 seconds, Stopping threads took: 0.0000503 seconds
[2026-09-02T10:13:04.109-0300][info][safepoint     ] Application time: 0.1976853 seconds
[2026-09-02T10:13:04.109-0300][info][safepoint     ] Entering safepoint region: ICBufferFull
[2026-09-02T10:13:04.109-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:04.109-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002271 seconds, Stopping threads took: 0.0000869 seconds
[2026-09-02T10:13:04.327-0300][info][safepoint     ] Application time: 0.2170710 seconds
[2026-09-02T10:13:04.327-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:04.327-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:04.327-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002014 seconds, Stopping threads took: 0.0000637 seconds
[2026-09-02T10:13:04.518-0300][info][safepoint     ] Application time: 0.1912070 seconds
[2026-09-02T10:13:04.518-0300][info][safepoint     ] Entering safepoint region: ThreadDump
[2026-09-02T10:13:04.518-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:04.518-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0004269 seconds, Stopping threads took: 0.0000658 seconds
[2026-09-02T10:13:04.601-0300][info][safepoint     ] Application time: 0.0822817 seconds
[2026-09-02T10:13:04.601-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:04.601-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:04.601-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001633 seconds, Stopping threads took: 0.0000632 seconds
[2026-09-02T10:13:04.601-0300][info][safepoint     ] Application time: 0.0001886 seconds
[2026-09-02T10:13:04.601-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:04.601-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:04.601-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001640 seconds, Stopping threads took: 0.0001055 seconds
[2026-09-02T10:13:04.709-0300][info][safepoint     ] Application time: 0.1080332 seconds
[2026-09-02T10:13:04.709-0300][info][safepoint     ] Entering safepoint region: BulkRevokeBias
[2026-09-02T10:13:04.710-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:04.710-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002925 seconds, Stopping threads took: 0.0000129 seconds
[2026-09-02T10:13:04.710-0300][info][safepoint     ] Application time: 0.0000288 seconds
[2026-09-02T10:13:04.710-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:04.710-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:04.710-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000700 seconds, Stopping threads took: 0.0000049 seconds
[2026-09-02T10:13:04.710-0300][info][safepoint     ] Application time: 0.0000292 seconds
[2026-09-02T10:13:04.710-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:04.710-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:04.710-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000791 seconds, Stopping threads took: 0.0000038 seconds
2026-09-02 10:13:04,306 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@749965)
2026-09-02 10:13:04,307 INFO  [ora.jdbc] (agroal-11) traceId=7E3AFEF2. 
2026-09-02 10:13:04,308 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:13:04,309 INFO  [ora.jdbc] (agroal-11) traceId=7E3AFEF2, anoEnabled=true. 
2026-09-02 10:13:04,310 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:13:04,311 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:13:04,312 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:13:04,313 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 7E3AFEF2
2026-09-02 10:13:04,314 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
[2026-09-02T10:13:04.712-0300][info][safepoint     ] Application time: 0.0022334 seconds
[2026-09-02T10:13:04.712-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:04.712-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:04.712-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000771 seconds, Stopping threads took: 0.0000207 seconds
[2026-09-02T10:13:04.712-0300][info][safepoint     ] Application time: 0.0000280 seconds
[2026-09-02T10:13:04.712-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:04.712-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:04.712-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000784 seconds, Stopping threads took: 0.0000222 seconds
[2026-09-02T10:13:04.712-0300][info][safepoint     ] Application time: 0.0001071 seconds
[2026-09-02T10:13:04.712-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:04.712-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:04.712-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000910 seconds, Stopping threads took: 0.0000186 seconds
[2026-09-02T10:13:04.713-0300][info][safepoint     ] Application time: 0.0000342 seconds
[2026-09-02T10:13:04.713-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:04.713-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:04.713-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000693 seconds, Stopping threads took: 0.0000045 seconds
2026-09-02 10:13:04,315 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:13:04,316 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:13:04,317 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:13:04,318 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:13:04,319 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 7E3AFEF2
2026-09-02 10:13:04,320 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:13:04,321 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:13:04,322 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:13:04,323 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:13:04,324 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:13:04,325 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 7E3AFEF2
2026-09-02 10:13:04,326 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:13:04,327 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=TLzjpJPoSyW6kfuVR9h0GQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=TLzjpJPoSyW6kfuVR9h0GQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-09-02 10:13:04,328 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-09-02 10:13:04,714 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=TLzjpJPoSyW6kfuVR9h0GQ==)
https://docs.oracle.com/error-help/db/ora-12514/
[2026-09-02T10:13:04.715-0300][info][safepoint     ] Application time: 0.0019983 seconds
[2026-09-02T10:13:04.715-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:04.715-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:04.715-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001137 seconds, Stopping threads took: 0.0000281 seconds
2026-09-02 10:13:04,714 ERROR [org.hib.que.sqm.mut.int.tem.GlobalTemporaryTableStrategy] (JPA Startup Thread: <default>) Unable obtain JDBC Connection: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=TLzjpJPoSyW6kfuVR9h0GQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=TLzjpJPoSyW6kfuVR9h0GQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

[2026-09-02T10:13:04.726-0300][info][safepoint     ] Application time: 0.0107783 seconds
[2026-09-02T10:13:04.801-0300][info][safepoint     ] Entering safepoint region: ThreadDump
[2026-09-02T10:13:04.802-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:04.802-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0763428 seconds, Stopping threads took: 0.0759384 seconds
2026-09-02 10:13:04,329 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@6e27a755)
2026-09-02 10:13:04,330 INFO  [ora.jdbc] (agroal-11) traceId=54BAD535. 
2026-09-02 10:13:04,331 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:13:04,332 INFO  [ora.jdbc] (agroal-11) traceId=54BAD535, anoEnabled=true. 
2026-09-02 10:13:04,333 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:13:04,334 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:13:04,335 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:13:04,336 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 54BAD535
2026-09-02 10:13:04,337 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:13:04,338 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:13:04,339 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:13:04,340 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:13:04,341 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:13:04,342 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 54BAD535
2026-09-02 10:13:04,343 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:13:04,344 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:13:04,345 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:13:04,346 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:13:04,347 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:13:04,348 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 54BAD535
2026-09-02 10:13:04,349 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:13:04,350 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=UlzACmQjS9OudG/rLStdwA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=UlzACmQjS9OudG/rLStdwA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-09-02 10:13:04,351 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-09-02 10:13:04,914 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=UlzACmQjS9OudG/rLStdwA==)
https://docs.oracle.com/error-help/db/ora-12514/
[2026-09-02T10:13:04.915-0300][info][safepoint     ] Application time: 0.1132553 seconds
[2026-09-02T10:13:04.915-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:04.917-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:04.917-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0015291 seconds, Stopping threads took: 0.0000124 seconds
2026-09-02 10:13:04,914 ERROR [org.hib.que.sqm.mut.int.tem.GlobalTemporaryTableStrategy] (JPA Startup Thread: <default>) Unable obtain JDBC Connection: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=UlzACmQjS9OudG/rLStdwA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=UlzACmQjS9OudG/rLStdwA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

[2026-09-02T10:13:05.011-0300][info][safepoint     ] Application time: 0.0943055 seconds
[2026-09-02T10:13:05.011-0300][info][safepoint     ] Entering safepoint region: Deoptimize
[2026-09-02T10:13:05.020-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:05.020-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0091650 seconds, Stopping threads took: 0.0000148 seconds
[2026-09-02T10:13:05.135-0300][info][safepoint     ] Application time: 0.1147814 seconds
[2026-09-02T10:13:05.135-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:05.135-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:05.135-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001161 seconds, Stopping threads took: 0.0000125 seconds
[2026-09-02T10:13:05.317-0300][info][safepoint     ] Application time: 0.1818618 seconds
[2026-09-02T10:13:05.317-0300][info][safepoint     ] Entering safepoint region: ICBufferFull
[2026-09-02T10:13:05.317-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:05.317-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002007 seconds, Stopping threads took: 0.0000117 seconds
[2026-09-02T10:13:05.420-0300][info][safepoint     ] Application time: 0.1025100 seconds
[2026-09-02T10:13:05.420-0300][info][safepoint     ] Entering safepoint region: ICBufferFull
[2026-09-02T10:13:05.420-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:05.420-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002230 seconds, Stopping threads took: 0.0000122 seconds
[2026-09-02T10:13:05.524-0300][info][safepoint     ] Application time: 0.1039371 seconds
[2026-09-02T10:13:05.524-0300][info][safepoint     ] Entering safepoint region: ICBufferFull
[2026-09-02T10:13:05.601-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:05.601-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0768412 seconds, Stopping threads took: 0.0000159 seconds
[2026-09-02T10:13:05.706-0300][info][safepoint     ] Application time: 0.1050877 seconds
[2026-09-02T10:13:05.706-0300][info][safepoint     ] Entering safepoint region: Deoptimize
[2026-09-02T10:13:05.707-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:05.707-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0011386 seconds, Stopping threads took: 0.0000110 seconds
[2026-09-02T10:13:05.904-0300][info][safepoint     ] Application time: 0.1965218 seconds
[2026-09-02T10:13:05.904-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:05.904-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:05.904-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002665 seconds, Stopping threads took: 0.0001105 seconds
[2026-09-02T10:13:05.904-0300][info][safepoint     ] Application time: 0.0000307 seconds
[2026-09-02T10:13:05.904-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:05.904-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:05.904-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002807 seconds, Stopping threads took: 0.0000910 seconds
[2026-09-02T10:13:06.213-0300][info][safepoint     ] Application time: 0.3084718 seconds
[2026-09-02T10:13:06.213-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.213-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.213-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001519 seconds, Stopping threads took: 0.0000122 seconds
[2026-09-02T10:13:06.305-0300][info][safepoint     ] Application time: 0.0923294 seconds
[2026-09-02T10:13:06.305-0300][info][safepoint     ] Entering safepoint region: BulkRevokeBias
[2026-09-02T10:13:06.306-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.306-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0003555 seconds, Stopping threads took: 0.0000130 seconds
[2026-09-02T10:13:06.334-0300][info][safepoint     ] Application time: 0.0283692 seconds
[2026-09-02T10:13:06.334-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.334-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.334-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002350 seconds, Stopping threads took: 0.0000253 seconds
[2026-09-02T10:13:06.334-0300][info][safepoint     ] Application time: 0.0002762 seconds
[2026-09-02T10:13:06.334-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.335-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.335-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000959 seconds, Stopping threads took: 0.0000080 seconds
[2026-09-02T10:13:06.419-0300][info][safepoint     ] Application time: 0.0848199 seconds
[2026-09-02T10:13:06.419-0300][info][safepoint     ] Entering safepoint region: BulkRevokeBias
[2026-09-02T10:13:06.420-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.420-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0004533 seconds, Stopping threads took: 0.0000164 seconds
[2026-09-02T10:13:06.420-0300][info][safepoint     ] Application time: 0.0000284 seconds
[2026-09-02T10:13:06.420-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.420-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.420-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000983 seconds, Stopping threads took: 0.0000073 seconds
2026-09-02 10:13:06,510 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) A aplicacao subiu!
2026-09-02 10:13:06,512 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) quarkus.profile: tqs
2026-09-02 10:13:06,512 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) quarkus.datasource.db-kind: oracle
2026-09-02 10:13:06,512 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) quarkus.datasource.jdbc.url: jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/orad02ng
2026-09-02 10:13:06,512 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) quarkus.datasource.username: SLICTB01
2026-09-02 10:13:06,512 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) base.siclg.path: https://des.siclg.caixa/rest
2026-09-02 10:13:06,512 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) SERVER IP: 10.116.221.152
2026-09-02 10:13:06,512 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) quarkus.mailer: smtptest.correiolivre.caixa
2026-09-02 10:13:06,513 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) quarkus.mailer.from: gecot06@caixa.gov.br
2026-09-02 10:13:06,513 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) quarkus.datasource.pge.jdbc.url: jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/CDBD08NGPDB003
2026-09-02 10:13:06,513 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) quarkus.datasource.pge.username: SLICPGED
2026-09-02 10:13:06,513 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) pagamentos.sipge.sap.auth.headers.username: SRFOBH01
[2026-09-02T10:13:06.547-0300][info][safepoint     ] Application time: 0.1270922 seconds
[2026-09-02T10:13:06.547-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.547-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.547-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001781 seconds, Stopping threads took: 0.0000156 seconds
[2026-09-02T10:13:06.548-0300][info][safepoint     ] Application time: 0.0002144 seconds
[2026-09-02T10:13:06.548-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.548-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.548-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0005654 seconds, Stopping threads took: 0.0000299 seconds
[2026-09-02T10:13:06.552-0300][info][safepoint     ] Application time: 0.0035040 seconds
[2026-09-02T10:13:06.552-0300][info][safepoint     ] Entering safepoint region: BulkRevokeBias
[2026-09-02T10:13:06.601-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.601-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0493858 seconds, Stopping threads took: 0.0000385 seconds
[2026-09-02T10:13:06.602-0300][info][safepoint     ] Application time: 0.0008195 seconds
[2026-09-02T10:13:06.602-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.602-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.602-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002196 seconds, Stopping threads took: 0.0000719 seconds
[2026-09-02T10:13:06.614-0300][info][safepoint     ] Application time: 0.0121609 seconds
[2026-09-02T10:13:06.614-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.614-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.614-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001718 seconds, Stopping threads took: 0.0000548 seconds
[2026-09-02T10:13:06.615-0300][info][safepoint     ] Application time: 0.0003790 seconds
[2026-09-02T10:13:06.615-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.615-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.615-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001233 seconds, Stopping threads took: 0.0000313 seconds
[2026-09-02T10:13:06.616-0300][info][safepoint     ] Application time: 0.0011156 seconds
[2026-09-02T10:13:06.616-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.616-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.616-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001356 seconds, Stopping threads took: 0.0000432 seconds
[2026-09-02T10:13:06.616-0300][info][safepoint     ] Application time: 0.0000464 seconds
[2026-09-02T10:13:06.616-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.616-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.616-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001417 seconds, Stopping threads took: 0.0000660 seconds
[2026-09-02T10:13:06.617-0300][info][safepoint     ] Application time: 0.0003872 seconds
[2026-09-02T10:13:06.617-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.617-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.617-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001972 seconds, Stopping threads took: 0.0001134 seconds
[2026-09-02T10:13:06.617-0300][info][safepoint     ] Application time: 0.0000261 seconds
[2026-09-02T10:13:06.617-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.617-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.617-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001402 seconds, Stopping threads took: 0.0000555 seconds
[2026-09-02T10:13:06.617-0300][info][safepoint     ] Application time: 0.0000759 seconds
[2026-09-02T10:13:06.617-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.617-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.617-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001388 seconds, Stopping threads took: 0.0000360 seconds
[2026-09-02T10:13:06.618-0300][info][safepoint     ] Application time: 0.0005317 seconds
[2026-09-02T10:13:06.618-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.618-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.618-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0004908 seconds, Stopping threads took: 0.0003608 seconds
[2026-09-02T10:13:06.619-0300][info][safepoint     ] Application time: 0.0004092 seconds
[2026-09-02T10:13:06.619-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.619-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.619-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001474 seconds, Stopping threads took: 0.0000643 seconds
[2026-09-02T10:13:06.619-0300][info][safepoint     ] Application time: 0.0000257 seconds
[2026-09-02T10:13:06.619-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.619-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.619-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000970 seconds, Stopping threads took: 0.0000218 seconds
[2026-09-02T10:13:06.619-0300][info][safepoint     ] Application time: 0.0001225 seconds
[2026-09-02T10:13:06.619-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.619-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.619-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001477 seconds, Stopping threads took: 0.0000622 seconds
[2026-09-02T10:13:06.620-0300][info][safepoint     ] Application time: 0.0008370 seconds
[2026-09-02T10:13:06.620-0300][info][safepoint     ] Entering safepoint region: BulkRevokeBias
[2026-09-02T10:13:06.621-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.621-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0005395 seconds, Stopping threads took: 0.0000067 seconds
[2026-09-02T10:13:06.703-0300][info][safepoint     ] Application time: 0.0823577 seconds
[2026-09-02T10:13:06.703-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.704-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.704-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0006354 seconds, Stopping threads took: 0.0000188 seconds
[2026-09-02T10:13:06.705-0300][info][safepoint     ] Application time: 0.0014350 seconds
[2026-09-02T10:13:06.705-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.705-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.705-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000926 seconds, Stopping threads took: 0.0000060 seconds
[2026-09-02T10:13:06.705-0300][info][safepoint     ] Application time: 0.0000460 seconds
[2026-09-02T10:13:06.705-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.706-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.706-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000971 seconds, Stopping threads took: 0.0000295 seconds
[2026-09-02T10:13:06.706-0300][info][safepoint     ] Application time: 0.0000409 seconds
[2026-09-02T10:13:06.706-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.706-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.706-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001202 seconds, Stopping threads took: 0.0000422 seconds
[2026-09-02T10:13:06.706-0300][info][safepoint     ] Application time: 0.0000349 seconds
[2026-09-02T10:13:06.706-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.706-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.706-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000832 seconds, Stopping threads took: 0.0000226 seconds
[2026-09-02T10:13:06.706-0300][info][safepoint     ] Application time: 0.0000302 seconds
[2026-09-02T10:13:06.706-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.706-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.706-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000952 seconds, Stopping threads took: 0.0000356 seconds
[2026-09-02T10:13:06.706-0300][info][safepoint     ] Application time: 0.0000734 seconds
[2026-09-02T10:13:06.706-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.706-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.706-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001285 seconds, Stopping threads took: 0.0000541 seconds
[2026-09-02T10:13:06.706-0300][info][safepoint     ] Application time: 0.0000419 seconds
[2026-09-02T10:13:06.706-0300][info][safepoint     ] Entering safepoint region: BulkRevokeBias
[2026-09-02T10:13:06.707-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.707-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0003941 seconds, Stopping threads took: 0.0000293 seconds
[2026-09-02T10:13:06.707-0300][info][safepoint     ] Application time: 0.0004058 seconds
[2026-09-02T10:13:06.707-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.707-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.707-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001102 seconds, Stopping threads took: 0.0000257 seconds
 2026-09-02 10:13:06,710 INFO  [io.quarkus] (main) silic-backend 2.0.1-SNAPSHOT on JVM (powered by Quarkus 3.6.3) started in 19.592s. Listening on: http://0.0.0.0:8080
2026-09-02 10:13:06,710 INFO  [io.quarkus] (main) Profiles tqs,common activated. 
2026-09-02 10:13:06,710 INFO  [io.quarkus] (main) Installed features: [agroal, cache, cdi, hibernate-orm, hibernate-orm-panache, hibernate-validator, jdbc-h2, jdbc-oracle, jdbc-postgresql, logging-gelf, mailer, micrometer, narayana-jta, oidc, oidc-client, oidc-client-filter, qute, rest-client, resteasy, resteasy-jackson, resteasy-multipart, resteasy-qute, scheduler, security, smallrye-context-propagation, smallrye-fault-tolerance, smallrye-health, smallrye-jwt, smallrye-openapi, swagger-ui, vertx]
[2026-09-02T10:13:06.712-0300][info][safepoint     ] Application time: 0.0048148 seconds
[2026-09-02T10:13:06.712-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.712-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.712-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001167 seconds, Stopping threads took: 0.0000279 seconds
[2026-09-02T10:13:06.712-0300][info][safepoint     ] Application time: 0.0001368 seconds
[2026-09-02T10:13:06.712-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.712-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.712-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000772 seconds, Stopping threads took: 0.0000053 seconds
[2026-09-02T10:13:06.712-0300][info][safepoint     ] Application time: 0.0000601 seconds
[2026-09-02T10:13:06.712-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.712-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.712-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000855 seconds, Stopping threads took: 0.0000046 seconds
[2026-09-02T10:13:06.712-0300][info][safepoint     ] Application time: 0.0000313 seconds
[2026-09-02T10:13:06.712-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.713-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.713-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000702 seconds, Stopping threads took: 0.0000046 seconds
[2026-09-02T10:13:06.713-0300][info][safepoint     ] Application time: 0.0000900 seconds
[2026-09-02T10:13:06.713-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.713-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.713-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000746 seconds, Stopping threads took: 0.0000049 seconds
[2026-09-02T10:13:06.713-0300][info][safepoint     ] Application time: 0.0004102 seconds
[2026-09-02T10:13:06.713-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.713-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.713-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000715 seconds, Stopping threads took: 0.0000051 seconds
[2026-09-02T10:13:06.714-0300][info][safepoint     ] Application time: 0.0004133 seconds
[2026-09-02T10:13:06.714-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.714-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.714-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000721 seconds, Stopping threads took: 0.0000052 seconds
[2026-09-02T10:13:06.714-0300][info][safepoint     ] Application time: 0.0001470 seconds
[2026-09-02T10:13:06.714-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:06.714-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:06.714-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000574 seconds, Stopping threads took: 0.0000051 seconds
[2026-09-02T10:13:07.373-0300][info][safepoint     ] Application time: 0.6586687 seconds
[2026-09-02T10:13:07.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:07.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:07.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001590 seconds, Stopping threads took: 0.0000401 seconds
[2026-09-02T10:13:07.373-0300][info][safepoint     ] Application time: 0.0003272 seconds
[2026-09-02T10:13:07.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:07.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:07.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000889 seconds, Stopping threads took: 0.0000052 seconds
[2026-09-02T10:13:07.374-0300][info][safepoint     ] Application time: 0.0006270 seconds
[2026-09-02T10:13:07.374-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:07.374-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:07.374-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000900 seconds, Stopping threads took: 0.0000047 seconds
[2026-09-02T10:13:07.376-0300][info][safepoint     ] Application time: 0.0024097 seconds
[2026-09-02T10:13:07.376-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:07.376-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:07.376-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001088 seconds, Stopping threads took: 0.0000117 seconds
[2026-09-02T10:13:07.377-0300][info][safepoint     ] Application time: 0.0006828 seconds
[2026-09-02T10:13:07.377-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:07.377-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:07.377-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001075 seconds, Stopping threads took: 0.0000095 seconds
[2026-09-02T10:13:07.380-0300][info][safepoint     ] Application time: 0.0026145 seconds
[2026-09-02T10:13:07.380-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:07.380-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:07.380-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000887 seconds, Stopping threads took: 0.0000052 seconds
[2026-09-02T10:13:07.381-0300][info][safepoint     ] Application time: 0.0008053 seconds
[2026-09-02T10:13:07.381-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:07.381-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:07.381-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000778 seconds, Stopping threads took: 0.0000051 seconds
[2026-09-02T10:13:07.415-0300][info][safepoint     ] Application time: 0.0339177 seconds
[2026-09-02T10:13:07.415-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:07.415-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:07.415-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002228 seconds, Stopping threads took: 0.0000490 seconds
[2026-09-02T10:13:07.415-0300][info][safepoint     ] Application time: 0.0002577 seconds
[2026-09-02T10:13:07.415-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:07.415-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:07.415-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000946 seconds, Stopping threads took: 0.0000079 seconds
[2026-09-02T10:13:07.431-0300][info][safepoint     ] Application time: 0.0151080 seconds
[2026-09-02T10:13:07.431-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:07.431-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:07.431-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001203 seconds, Stopping threads took: 0.0000156 seconds
[2026-09-02T10:13:07.432-0300][info][safepoint     ] Application time: 0.0015885 seconds
[2026-09-02T10:13:07.432-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:07.432-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:07.432-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001178 seconds, Stopping threads took: 0.0000261 seconds
[2026-09-02T10:13:07.433-0300][info][safepoint     ] Application time: 0.0005047 seconds
[2026-09-02T10:13:07.433-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:07.433-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:07.433-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001012 seconds, Stopping threads took: 0.0000048 seconds
[2026-09-02T10:13:08.433-0300][info][safepoint     ] Application time: 1.0000898 seconds
[2026-09-02T10:13:08.433-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:08.433-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:08.433-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001648 seconds, Stopping threads took: 0.0000389 seconds
[2026-09-02T10:13:09.433-0300][info][safepoint     ] Application time: 1.0000785 seconds
[2026-09-02T10:13:09.433-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:09.434-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:09.434-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001314 seconds, Stopping threads took: 0.0000212 seconds
[2026-09-02T10:13:10.434-0300][info][safepoint     ] Application time: 1.0000892 seconds
[2026-09-02T10:13:10.434-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:10.434-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:10.434-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001366 seconds, Stopping threads took: 0.0000202 seconds
[2026-09-02T10:13:11.434-0300][info][safepoint     ] Application time: 1.0000846 seconds
[2026-09-02T10:13:11.434-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:11.434-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:11.434-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001793 seconds, Stopping threads took: 0.0000556 seconds
[2026-09-02T10:13:12.434-0300][info][safepoint     ] Application time: 1.0001094 seconds
[2026-09-02T10:13:12.434-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:12.434-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:12.434-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001340 seconds, Stopping threads took: 0.0000201 seconds
[2026-09-02T10:13:13.435-0300][info][safepoint     ] Application time: 1.0001128 seconds
[2026-09-02T10:13:13.435-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:13.435-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:13.435-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001482 seconds, Stopping threads took: 0.0000401 seconds
[2026-09-02T10:13:14.435-0300][info][safepoint     ] Application time: 1.0001136 seconds
[2026-09-02T10:13:14.435-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:14.435-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:14.435-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001614 seconds, Stopping threads took: 0.0000212 seconds
[2026-09-02T10:13:15.435-0300][info][safepoint     ] Application time: 1.0000996 seconds
[2026-09-02T10:13:15.435-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:15.435-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:15.435-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001491 seconds, Stopping threads took: 0.0000221 seconds
[2026-09-02T10:13:16.436-0300][info][safepoint     ] Application time: 1.0001158 seconds
[2026-09-02T10:13:16.436-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:16.436-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:16.436-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001269 seconds, Stopping threads took: 0.0000216 seconds
[2026-09-02T10:13:17.371-0300][info][safepoint     ] Application time: 0.9349116 seconds
[2026-09-02T10:13:17.371-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:17.371-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:17.371-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001654 seconds, Stopping threads took: 0.0000295 seconds
[2026-09-02T10:13:17.371-0300][info][safepoint     ] Application time: 0.0001513 seconds
[2026-09-02T10:13:17.371-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:17.371-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:17.371-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001348 seconds, Stopping threads took: 0.0000593 seconds
[2026-09-02T10:13:17.371-0300][info][safepoint     ] Application time: 0.0002447 seconds
[2026-09-02T10:13:17.371-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:17.371-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:17.371-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000648 seconds, Stopping threads took: 0.0000054 seconds
[2026-09-02T10:13:17.373-0300][info][safepoint     ] Application time: 0.0014658 seconds
[2026-09-02T10:13:17.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:17.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:17.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001355 seconds, Stopping threads took: 0.0000245 seconds
[2026-09-02T10:13:17.373-0300][info][safepoint     ] Application time: 0.0002532 seconds
[2026-09-02T10:13:17.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:17.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:17.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000964 seconds, Stopping threads took: 0.0000253 seconds
[2026-09-02T10:13:17.373-0300][info][safepoint     ] Application time: 0.0000629 seconds
[2026-09-02T10:13:17.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:17.374-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:17.374-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001134 seconds, Stopping threads took: 0.0000453 seconds
[2026-09-02T10:13:17.374-0300][info][safepoint     ] Application time: 0.0003264 seconds
[2026-09-02T10:13:17.374-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:17.374-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:17.374-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001118 seconds, Stopping threads took: 0.0000271 seconds
[2026-09-02T10:13:17.374-0300][info][safepoint     ] Application time: 0.0001076 seconds
[2026-09-02T10:13:17.374-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:17.374-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:17.374-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001282 seconds, Stopping threads took: 0.0000431 seconds
[2026-09-02T10:13:17.375-0300][info][safepoint     ] Application time: 0.0002883 seconds
[2026-09-02T10:13:17.375-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:17.375-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:17.375-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001581 seconds, Stopping threads took: 0.0000977 seconds
[2026-09-02T10:13:17.377-0300][info][safepoint     ] Application time: 0.0026100 seconds
[2026-09-02T10:13:17.377-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:17.377-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:17.377-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000737 seconds, Stopping threads took: 0.0000073 seconds
[2026-09-02T10:13:17.379-0300][info][safepoint     ] Application time: 0.0019684 seconds
[2026-09-02T10:13:17.379-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:17.379-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:17.379-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001060 seconds, Stopping threads took: 0.0000173 seconds
[2026-09-02T10:13:17.380-0300][info][safepoint     ] Application time: 0.0007862 seconds
[2026-09-02T10:13:17.380-0300][info][safepoint     ] Entering safepoint region: ThreadDump
[2026-09-02T10:13:17.381-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:17.381-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0007289 seconds, Stopping threads took: 0.0000053 seconds
[2026-09-02T10:13:17.381-0300][info][safepoint     ] Application time: 0.0003576 seconds
[2026-09-02T10:13:17.381-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:17.381-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:17.381-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000854 seconds, Stopping threads took: 0.0000073 seconds
2026-09-02 10:13:17,306 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@2ec807a0)
2026-09-02 10:13:17,307 INFO  [ora.jdbc] (agroal-11) traceId=6BE87530. 
2026-09-02 10:13:17,308 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:13:17,309 INFO  [ora.jdbc] (agroal-11) traceId=6BE87530, anoEnabled=true. 
2026-09-02 10:13:17,310 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:13:17,311 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:13:17,312 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:13:17,313 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 6BE87530
2026-09-02 10:13:17,314 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:13:17,315 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:13:17,316 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:13:17,317 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:13:17,318 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:13:17,319 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 6BE87530
2026-09-02 10:13:17,320 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:13:17,321 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:13:17,322 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:13:17,323 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:13:17,324 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:13:17,325 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 6BE87530
2026-09-02 10:13:17,326 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:13:17,327 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=16wa63ihQIanTB3duH1R/w==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=16wa63ihQIanTB3duH1R/w==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-09-02 10:13:17,328 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-09-02 10:13:17,398 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=16wa63ihQIanTB3duH1R/w==)
https://docs.oracle.com/error-help/db/ora-12514/
[2026-09-02T10:13:17.404-0300][info][safepoint     ] Application time: 0.0229760 seconds
[2026-09-02T10:13:17.405-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:17.405-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:17.405-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001480 seconds, Stopping threads took: 0.0000228 seconds
2026-09-02 10:13:17,407 INFO  [io.sma.health] (executor-thread-15) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=16wa63ihQIanTB3duH1R/w==)\nhttps://docs.oracle.com/error-help/db/ora-12514/","pge":"UP"}}]}
[2026-09-02T10:13:17.407-0300][info][safepoint     ] Application time: 0.0027859 seconds
[2026-09-02T10:13:17.407-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:17.408-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:17.408-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001343 seconds, Stopping threads took: 0.0000331 seconds
[2026-09-02T10:13:17.408-0300][info][safepoint     ] Application time: 0.0002525 seconds
[2026-09-02T10:13:17.408-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:17.408-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:17.408-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000795 seconds, Stopping threads took: 0.0000048 seconds
[2026-09-02T10:13:17.409-0300][info][safepoint     ] Application time: 0.0012459 seconds
[2026-09-02T10:13:17.409-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:17.409-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:17.409-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000999 seconds, Stopping threads took: 0.0000078 seconds
[2026-09-02T10:13:18.409-0300][info][safepoint     ] Application time: 1.0000883 seconds
[2026-09-02T10:13:18.409-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:18.410-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:18.410-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001631 seconds, Stopping threads took: 0.0000382 seconds
[2026-09-02T10:13:19.410-0300][info][safepoint     ] Application time: 1.0000754 seconds
[2026-09-02T10:13:19.410-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:19.410-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:19.410-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001423 seconds, Stopping threads took: 0.0000212 seconds
[2026-09-02T10:13:20.410-0300][info][safepoint     ] Application time: 1.0000943 seconds
[2026-09-02T10:13:20.410-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:20.410-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:20.410-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001194 seconds, Stopping threads took: 0.0000194 seconds
[2026-09-02T10:13:21.410-0300][info][safepoint     ] Application time: 1.0000996 seconds
[2026-09-02T10:13:21.410-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:21.410-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:21.410-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001477 seconds, Stopping threads took: 0.0000204 seconds
[2026-09-02T10:13:22.411-0300][info][safepoint     ] Application time: 1.0000986 seconds
[2026-09-02T10:13:22.411-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:22.411-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:22.411-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001682 seconds, Stopping threads took: 0.0000260 seconds
[2026-09-02T10:13:23.411-0300][info][safepoint     ] Application time: 1.0001016 seconds
[2026-09-02T10:13:23.411-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:23.411-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:23.411-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001942 seconds, Stopping threads took: 0.0000517 seconds
[2026-09-02T10:13:24.411-0300][info][safepoint     ] Application time: 1.0001032 seconds
[2026-09-02T10:13:24.411-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:24.411-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:24.411-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001547 seconds, Stopping threads took: 0.0000220 seconds
[2026-09-02T10:13:25.411-0300][info][safepoint     ] Application time: 1.0001110 seconds
[2026-09-02T10:13:25.412-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:25.412-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:25.412-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001549 seconds, Stopping threads took: 0.0000207 seconds
[2026-09-02T10:13:26.412-0300][info][safepoint     ] Application time: 1.0001186 seconds
[2026-09-02T10:13:26.412-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:26.412-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:26.412-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001549 seconds, Stopping threads took: 0.0000220 seconds
[2026-09-02T10:13:27.370-0300][info][safepoint     ] Application time: 0.9579918 seconds
[2026-09-02T10:13:27.370-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:27.370-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:27.370-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001410 seconds, Stopping threads took: 0.0000175 seconds
[2026-09-02T10:13:27.371-0300][info][safepoint     ] Application time: 0.0004596 seconds
[2026-09-02T10:13:27.371-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:27.371-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:27.371-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000729 seconds, Stopping threads took: 0.0000055 seconds
[2026-09-02T10:13:27.372-0300][info][safepoint     ] Application time: 0.0013391 seconds
[2026-09-02T10:13:27.372-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:27.372-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:27.372-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001109 seconds, Stopping threads took: 0.0000156 seconds
[2026-09-02T10:13:27.373-0300][info][safepoint     ] Application time: 0.0003954 seconds
[2026-09-02T10:13:27.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:27.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:27.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001155 seconds, Stopping threads took: 0.0000359 seconds
[2026-09-02T10:13:27.373-0300][info][safepoint     ] Application time: 0.0001187 seconds
[2026-09-02T10:13:27.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:27.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:27.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001220 seconds, Stopping threads took: 0.0000349 seconds
[2026-09-02T10:13:27.373-0300][info][safepoint     ] Application time: 0.0001972 seconds
[2026-09-02T10:13:27.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:27.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:27.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000589 seconds, Stopping threads took: 0.0000047 seconds
[2026-09-02T10:13:27.373-0300][info][safepoint     ] Application time: 0.0002724 seconds
[2026-09-02T10:13:27.374-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:27.374-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:27.374-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000733 seconds, Stopping threads took: 0.0000228 seconds
[2026-09-02T10:13:27.374-0300][info][safepoint     ] Application time: 0.0008554 seconds
[2026-09-02T10:13:27.374-0300][info][safepoint     ] Entering safepoint region: ThreadDump
[2026-09-02T10:13:27.375-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:27.375-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0006183 seconds, Stopping threads took: 0.0000105 seconds
2026-09-02 10:13:27,306 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@23e5a536)
2026-09-02 10:13:27,307 INFO  [ora.jdbc] (agroal-11) traceId=172C23F3. 
2026-09-02 10:13:27,308 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:13:27,309 INFO  [ora.jdbc] (agroal-11) traceId=172C23F3, anoEnabled=true. 
2026-09-02 10:13:27,310 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:13:27,311 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:13:27,312 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:13:27,313 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 172C23F3
2026-09-02 10:13:27,314 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:13:27,315 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:13:27,316 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:13:27,317 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:13:27,318 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:13:27,319 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 172C23F3
2026-09-02 10:13:27,320 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:13:27,321 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:13:27,322 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:13:27,323 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:13:27,324 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:13:27,325 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 172C23F3
2026-09-02 10:13:27,326 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:13:27,327 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=CvfGZFmZTMmxXPHH48HMIQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=CvfGZFmZTMmxXPHH48HMIQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-09-02 10:13:27,328 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-09-02 10:13:27,418 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=CvfGZFmZTMmxXPHH48HMIQ==)
https://docs.oracle.com/error-help/db/ora-12514/
[2026-09-02T10:13:27.424-0300][info][safepoint     ] Application time: 0.0486543 seconds
[2026-09-02T10:13:27.424-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:27.424-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:27.424-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001754 seconds, Stopping threads took: 0.0000229 seconds
2026-09-02 10:13:27,424 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=CvfGZFmZTMmxXPHH48HMIQ==)\nhttps://docs.oracle.com/error-help/db/ora-12514/","pge":"UP"}}]}
[2026-09-02T10:13:27.425-0300][info][safepoint     ] Application time: 0.0007328 seconds
[2026-09-02T10:13:27.425-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:27.425-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:27.425-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001440 seconds, Stopping threads took: 0.0000388 seconds
[2026-09-02T10:13:27.425-0300][info][safepoint     ] Application time: 0.0003473 seconds
[2026-09-02T10:13:27.425-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:27.425-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:27.425-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001015 seconds, Stopping threads took: 0.0000255 seconds
[2026-09-02T10:13:28.425-0300][info][safepoint     ] Application time: 1.0001086 seconds
[2026-09-02T10:13:28.425-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:28.426-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:28.426-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001771 seconds, Stopping threads took: 0.0000388 seconds
[2026-09-02T10:13:29.426-0300][info][safepoint     ] Application time: 1.0000895 seconds
[2026-09-02T10:13:29.426-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:29.426-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:29.426-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001319 seconds, Stopping threads took: 0.0000208 seconds
[2026-09-02T10:13:30.426-0300][info][safepoint     ] Application time: 1.0002136 seconds
[2026-09-02T10:13:30.426-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:30.426-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:30.426-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001463 seconds, Stopping threads took: 0.0000204 seconds
[2026-09-02T10:13:31.426-0300][info][safepoint     ] Application time: 1.0000817 seconds
[2026-09-02T10:13:31.426-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:31.427-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:31.427-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001415 seconds, Stopping threads took: 0.0000219 seconds
[2026-09-02T10:13:32.427-0300][info][safepoint     ] Application time: 1.0000777 seconds
[2026-09-02T10:13:32.427-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:32.427-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:32.427-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001389 seconds, Stopping threads took: 0.0000211 seconds
[2026-09-02T10:13:33.427-0300][info][safepoint     ] Application time: 1.0000807 seconds
[2026-09-02T10:13:33.427-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:33.427-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:33.427-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001472 seconds, Stopping threads took: 0.0000350 seconds
[2026-09-02T10:13:34.427-0300][info][safepoint     ] Application time: 1.0000790 seconds
[2026-09-02T10:13:34.427-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:34.427-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:34.427-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001325 seconds, Stopping threads took: 0.0000216 seconds
[2026-09-02T10:13:35.428-0300][info][safepoint     ] Application time: 1.0001126 seconds
[2026-09-02T10:13:35.428-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:35.428-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:35.428-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001633 seconds, Stopping threads took: 0.0000266 seconds
[2026-09-02T10:13:36.428-0300][info][safepoint     ] Application time: 1.0000853 seconds
[2026-09-02T10:13:36.428-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:36.428-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:36.428-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001543 seconds, Stopping threads took: 0.0000206 seconds
[2026-09-02T10:13:37.370-0300][info][safepoint     ] Application time: 0.9419133 seconds
[2026-09-02T10:13:37.370-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:37.370-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:37.370-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002004 seconds, Stopping threads took: 0.0000359 seconds
[2026-09-02T10:13:37.370-0300][info][safepoint     ] Application time: 0.0002564 seconds
[2026-09-02T10:13:37.370-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:37.370-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:37.370-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000742 seconds, Stopping threads took: 0.0000059 seconds
[2026-09-02T10:13:37.372-0300][info][safepoint     ] Application time: 0.0011691 seconds
[2026-09-02T10:13:37.372-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:37.372-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:37.372-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001241 seconds, Stopping threads took: 0.0000504 seconds
[2026-09-02T10:13:37.372-0300][info][safepoint     ] Application time: 0.0000431 seconds
[2026-09-02T10:13:37.372-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:37.372-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:37.372-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000883 seconds, Stopping threads took: 0.0000326 seconds
[2026-09-02T10:13:37.372-0300][info][safepoint     ] Application time: 0.0003713 seconds
[2026-09-02T10:13:37.372-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:37.372-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:37.372-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000825 seconds, Stopping threads took: 0.0000110 seconds
[2026-09-02T10:13:37.373-0300][info][safepoint     ] Application time: 0.0001126 seconds
[2026-09-02T10:13:37.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:37.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:37.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001519 seconds, Stopping threads took: 0.0000436 seconds
[2026-09-02T10:13:37.373-0300][info][safepoint     ] Application time: 0.0001699 seconds
[2026-09-02T10:13:37.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:37.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:37.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000978 seconds, Stopping threads took: 0.0000239 seconds
[2026-09-02T10:13:37.374-0300][info][safepoint     ] Application time: 0.0014662 seconds
[2026-09-02T10:13:37.374-0300][info][safepoint     ] Entering safepoint region: ThreadDump
[2026-09-02T10:13:37.375-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:37.375-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0005720 seconds, Stopping threads took: 0.0000068 seconds
2026-09-02 10:13:37,306 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@43013207)
2026-09-02 10:13:37,307 INFO  [ora.jdbc] (agroal-11) traceId=FA88DBC. 
2026-09-02 10:13:37,308 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:13:37,309 INFO  [ora.jdbc] (agroal-11) traceId=FA88DBC, anoEnabled=true. 
2026-09-02 10:13:37,310 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:13:37,311 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:13:37,312 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:13:37,313 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = FA88DBC
2026-09-02 10:13:37,314 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:13:37,315 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:13:37,316 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:13:37,317 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:13:37,318 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:13:37,319 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = FA88DBC
2026-09-02 10:13:37,320 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:13:37,321 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:13:37,322 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:13:37,323 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:13:37,324 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:13:37,325 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = FA88DBC
2026-09-02 10:13:37,326 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:13:37,327 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=F0YVXr9fQVG3qGMvuA+20w==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=F0YVXr9fQVG3qGMvuA+20w==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-09-02 10:13:37,328 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-09-02 10:13:37,410 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=F0YVXr9fQVG3qGMvuA+20w==)
https://docs.oracle.com/error-help/db/ora-12514/
[2026-09-02T10:13:37.414-0300][info][safepoint     ] Application time: 0.0392319 seconds
[2026-09-02T10:13:37.414-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:37.414-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:37.414-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001415 seconds, Stopping threads took: 0.0000168 seconds
2026-09-02 10:13:37,415 INFO  [io.sma.health] (executor-thread-15) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=F0YVXr9fQVG3qGMvuA+20w==)\nhttps://docs.oracle.com/error-help/db/ora-12514/","pge":"UP"}}]}
[2026-09-02T10:13:37.415-0300][info][safepoint     ] Application time: 0.0007119 seconds
[2026-09-02T10:13:37.415-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:37.415-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:37.415-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000996 seconds, Stopping threads took: 0.0000134 seconds
[2026-09-02T10:13:37.416-0300][info][safepoint     ] Application time: 0.0003834 seconds
[2026-09-02T10:13:37.416-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:37.416-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:37.416-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000866 seconds, Stopping threads took: 0.0000048 seconds
[2026-09-02T10:13:38.416-0300][info][safepoint     ] Application time: 1.0000913 seconds
[2026-09-02T10:13:38.416-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:38.416-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:38.416-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001581 seconds, Stopping threads took: 0.0000394 seconds
[2026-09-02T10:13:39.416-0300][info][safepoint     ] Application time: 1.0000809 seconds
[2026-09-02T10:13:39.416-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:39.416-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:39.416-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001318 seconds, Stopping threads took: 0.0000207 seconds
[2026-09-02T10:13:40.416-0300][info][safepoint     ] Application time: 1.0000796 seconds
[2026-09-02T10:13:40.416-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:40.417-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:40.417-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001377 seconds, Stopping threads took: 0.0000217 seconds
[2026-09-02T10:13:41.417-0300][info][safepoint     ] Application time: 1.0000752 seconds
[2026-09-02T10:13:41.417-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:41.417-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:41.417-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001356 seconds, Stopping threads took: 0.0000209 seconds
[2026-09-02T10:13:42.417-0300][info][safepoint     ] Application time: 1.0000793 seconds
[2026-09-02T10:13:42.417-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:42.417-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:42.417-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001492 seconds, Stopping threads took: 0.0000211 seconds
[2026-09-02T10:13:43.417-0300][info][safepoint     ] Application time: 1.0000834 seconds
[2026-09-02T10:13:43.417-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:43.417-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:43.417-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001535 seconds, Stopping threads took: 0.0000363 seconds
[2026-09-02T10:13:44.417-0300][info][safepoint     ] Application time: 1.0000735 seconds
[2026-09-02T10:13:44.417-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:44.418-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:44.418-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001595 seconds, Stopping threads took: 0.0000222 seconds
[2026-09-02T10:13:45.418-0300][info][safepoint     ] Application time: 1.0000774 seconds
[2026-09-02T10:13:45.418-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:45.418-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:45.418-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001596 seconds, Stopping threads took: 0.0000213 seconds
[2026-09-02T10:13:46.418-0300][info][safepoint     ] Application time: 1.0000847 seconds
[2026-09-02T10:13:46.418-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:46.418-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:46.418-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001515 seconds, Stopping threads took: 0.0000263 seconds
[2026-09-02T10:13:47.370-0300][info][safepoint     ] Application time: 0.9516407 seconds
[2026-09-02T10:13:47.370-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:47.370-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:47.370-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001867 seconds, Stopping threads took: 0.0000180 seconds
[2026-09-02T10:13:47.370-0300][info][safepoint     ] Application time: 0.0002467 seconds
[2026-09-02T10:13:47.370-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:47.370-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:47.370-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000880 seconds, Stopping threads took: 0.0000057 seconds
[2026-09-02T10:13:47.372-0300][info][safepoint     ] Application time: 0.0012411 seconds
[2026-09-02T10:13:47.372-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:47.372-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:47.372-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001391 seconds, Stopping threads took: 0.0000579 seconds
[2026-09-02T10:13:47.372-0300][info][safepoint     ] Application time: 0.0000351 seconds
[2026-09-02T10:13:47.372-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:47.372-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:47.372-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000817 seconds, Stopping threads took: 0.0000252 seconds
[2026-09-02T10:13:47.372-0300][info][safepoint     ] Application time: 0.0004054 seconds
[2026-09-02T10:13:47.372-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:47.372-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:47.372-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001338 seconds, Stopping threads took: 0.0000528 seconds
[2026-09-02T10:13:47.373-0300][info][safepoint     ] Application time: 0.0001866 seconds
[2026-09-02T10:13:47.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:47.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:47.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002104 seconds, Stopping threads took: 0.0001297 seconds
[2026-09-02T10:13:47.373-0300][info][safepoint     ] Application time: 0.0001317 seconds
[2026-09-02T10:13:47.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:47.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:47.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000994 seconds, Stopping threads took: 0.0000371 seconds
[2026-09-02T10:13:47.375-0300][info][safepoint     ] Application time: 0.0020321 seconds
[2026-09-02T10:13:47.375-0300][info][safepoint     ] Entering safepoint region: ThreadDump
[2026-09-02T10:13:47.376-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:47.376-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0006648 seconds, Stopping threads took: 0.0000081 seconds
2026-09-02 10:13:47,306 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@70f2c55b)
2026-09-02 10:13:47,307 INFO  [ora.jdbc] (agroal-11) traceId=41F4950E. 
2026-09-02 10:13:47,308 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:13:47,309 INFO  [ora.jdbc] (agroal-11) traceId=41F4950E, anoEnabled=true. 
2026-09-02 10:13:47,310 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:13:47,311 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:13:47,312 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:13:47,313 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 41F4950E
2026-09-02 10:13:47,314 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:13:47,315 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:13:47,316 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:13:47,317 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:13:47,318 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:13:47,319 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 41F4950E
2026-09-02 10:13:47,320 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:13:47,321 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:13:47,322 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:13:47,323 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:13:47,324 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:13:47,325 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 41F4950E
2026-09-02 10:13:47,326 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:13:47,327 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=CD7clEvGRFm3BdOi6fatlg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=CD7clEvGRFm3BdOi6fatlg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-09-02 10:13:47,328 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-09-02 10:13:47,410 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=CD7clEvGRFm3BdOi6fatlg==)
https://docs.oracle.com/error-help/db/ora-12514/
[2026-09-02T10:13:47.415-0300][info][safepoint     ] Application time: 0.0392122 seconds
[2026-09-02T10:13:47.415-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:47.415-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:47.415-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001587 seconds, Stopping threads took: 0.0000166 seconds
2026-09-02 10:13:47,415 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=CD7clEvGRFm3BdOi6fatlg==)\nhttps://docs.oracle.com/error-help/db/ora-12514/","pge":"UP"}}]}
[2026-09-02T10:13:47.416-0300][info][safepoint     ] Application time: 0.0005740 seconds
[2026-09-02T10:13:47.416-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:47.416-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:47.416-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000800 seconds, Stopping threads took: 0.0000058 seconds
[2026-09-02T10:13:47.417-0300][info][safepoint     ] Application time: 0.0011120 seconds
[2026-09-02T10:13:47.417-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:47.417-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:47.417-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000778 seconds, Stopping threads took: 0.0000139 seconds
[2026-09-02T10:13:48.417-0300][info][safepoint     ] Application time: 1.0000794 seconds
[2026-09-02T10:13:48.417-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:48.417-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:48.417-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001279 seconds, Stopping threads took: 0.0000205 seconds
[2026-09-02T10:13:49.419-0300][info][safepoint     ] Application time: 1.0016059 seconds
[2026-09-02T10:13:49.419-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:49.419-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:49.419-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001857 seconds, Stopping threads took: 0.0000463 seconds
[2026-09-02T10:13:50.419-0300][info][safepoint     ] Application time: 1.0000718 seconds
[2026-09-02T10:13:50.419-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:50.419-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:50.419-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001332 seconds, Stopping threads took: 0.0000216 seconds
[2026-09-02T10:13:51.420-0300][info][safepoint     ] Application time: 1.0000727 seconds
[2026-09-02T10:13:51.420-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:51.420-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:51.420-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001480 seconds, Stopping threads took: 0.0000190 seconds
[2026-09-02T10:13:52.425-0300][info][safepoint     ] Application time: 1.0049574 seconds
[2026-09-02T10:13:52.425-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:52.425-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:52.425-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001399 seconds, Stopping threads took: 0.0000202 seconds
[2026-09-02T10:13:53.425-0300][info][safepoint     ] Application time: 1.0000732 seconds
[2026-09-02T10:13:53.425-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:53.425-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:53.425-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001513 seconds, Stopping threads took: 0.0000284 seconds
[2026-09-02T10:13:54.425-0300][info][safepoint     ] Application time: 1.0000774 seconds
[2026-09-02T10:13:54.425-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:54.425-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:54.425-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001826 seconds, Stopping threads took: 0.0000412 seconds
[2026-09-02T10:13:55.426-0300][info][safepoint     ] Application time: 1.0000938 seconds
[2026-09-02T10:13:55.426-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:55.426-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:55.426-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001571 seconds, Stopping threads took: 0.0000211 seconds
[2026-09-02T10:13:56.426-0300][info][safepoint     ] Application time: 1.0000780 seconds
[2026-09-02T10:13:56.426-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:56.426-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:56.426-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001498 seconds, Stopping threads took: 0.0000209 seconds
[2026-09-02T10:13:57.370-0300][info][safepoint     ] Application time: 0.9441853 seconds
[2026-09-02T10:13:57.370-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:57.370-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:57.370-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001638 seconds, Stopping threads took: 0.0000399 seconds
[2026-09-02T10:13:57.371-0300][info][safepoint     ] Application time: 0.0002932 seconds
[2026-09-02T10:13:57.371-0300][info][safepoint     ] Entering safepoint region: BulkRevokeBias
[2026-09-02T10:13:57.371-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:57.371-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0004687 seconds, Stopping threads took: 0.0000181 seconds
[2026-09-02T10:13:57.372-0300][info][safepoint     ] Application time: 0.0011293 seconds
[2026-09-02T10:13:57.372-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:57.372-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:57.372-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000920 seconds, Stopping threads took: 0.0000158 seconds
[2026-09-02T10:13:57.373-0300][info][safepoint     ] Application time: 0.0002653 seconds
[2026-09-02T10:13:57.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:57.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:57.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001514 seconds, Stopping threads took: 0.0000668 seconds
[2026-09-02T10:13:57.373-0300][info][safepoint     ] Application time: 0.0002614 seconds
[2026-09-02T10:13:57.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:57.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:57.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001275 seconds, Stopping threads took: 0.0000483 seconds
[2026-09-02T10:13:57.373-0300][info][safepoint     ] Application time: 0.0001124 seconds
[2026-09-02T10:13:57.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:57.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:57.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001314 seconds, Stopping threads took: 0.0000265 seconds
[2026-09-02T10:13:57.374-0300][info][safepoint     ] Application time: 0.0002122 seconds
[2026-09-02T10:13:57.374-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:57.374-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:57.374-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000976 seconds, Stopping threads took: 0.0000301 seconds
[2026-09-02T10:13:57.375-0300][info][safepoint     ] Application time: 0.0012556 seconds
[2026-09-02T10:13:57.375-0300][info][safepoint     ] Entering safepoint region: ThreadDump
[2026-09-02T10:13:57.376-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:57.376-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0006329 seconds, Stopping threads took: 0.0000074 seconds
2026-09-02 10:13:57,307 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@4e248b29)
2026-09-02 10:13:57,308 INFO  [ora.jdbc] (agroal-11) traceId=1DB8236D. 
2026-09-02 10:13:57,309 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:13:57,310 INFO  [ora.jdbc] (agroal-11) traceId=1DB8236D, anoEnabled=true. 
2026-09-02 10:13:57,311 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:13:57,312 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:13:57,313 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:13:57,314 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 1DB8236D
2026-09-02 10:13:57,315 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:13:57,316 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:13:57,317 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:13:57,318 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:13:57,319 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:13:57,320 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 1DB8236D
2026-09-02 10:13:57,321 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:13:57,322 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:13:57,323 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:13:57,324 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:13:57,325 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:13:57,326 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 1DB8236D
2026-09-02 10:13:57,327 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:13:57,328 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=+HzuxbgWTMS1guQ6B8D1dA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=+HzuxbgWTMS1guQ6B8D1dA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-09-02 10:13:57,329 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-09-02 10:13:57,406 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=+HzuxbgWTMS1guQ6B8D1dA==)
https://docs.oracle.com/error-help/db/ora-12514/
[2026-09-02T10:13:57.411-0300][info][safepoint     ] Application time: 0.0353917 seconds
[2026-09-02T10:13:57.411-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:57.411-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:57.411-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001527 seconds, Stopping threads took: 0.0000229 seconds
2026-09-02 10:13:57,411 INFO  [io.sma.health] (executor-thread-15) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=+HzuxbgWTMS1guQ6B8D1dA==)\nhttps://docs.oracle.com/error-help/db/ora-12514/","pge":"UP"}}]}
[2026-09-02T10:13:57.412-0300][info][safepoint     ] Application time: 0.0005317 seconds
[2026-09-02T10:13:57.412-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:57.412-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:57.412-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001175 seconds, Stopping threads took: 0.0000471 seconds
[2026-09-02T10:13:57.412-0300][info][safepoint     ] Application time: 0.0003908 seconds
[2026-09-02T10:13:57.412-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:13:57.412-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:57.412-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000858 seconds, Stopping threads took: 0.0000052 seconds
[2026-09-02T10:13:58.413-0300][info][safepoint     ] Application time: 1.0000844 seconds
[2026-09-02T10:13:58.413-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:58.413-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:58.413-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001828 seconds, Stopping threads took: 0.0000226 seconds
[2026-09-02T10:13:59.413-0300][info][safepoint     ] Application time: 1.0000755 seconds
[2026-09-02T10:13:59.413-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:13:59.413-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:13:59.413-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001755 seconds, Stopping threads took: 0.0000400 seconds
[2026-09-02T10:14:00.413-0300][info][safepoint     ] Application time: 1.0000989 seconds
[2026-09-02T10:14:00.413-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:00.413-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:00.413-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001619 seconds, Stopping threads took: 0.0000221 seconds
[2026-09-02T10:14:01.413-0300][info][safepoint     ] Application time: 1.0001340 seconds
[2026-09-02T10:14:01.414-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:01.414-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:01.414-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001500 seconds, Stopping threads took: 0.0000212 seconds
[2026-09-02T10:14:02.414-0300][info][safepoint     ] Application time: 1.0000820 seconds
[2026-09-02T10:14:02.414-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:02.414-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:02.414-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001623 seconds, Stopping threads took: 0.0000214 seconds
[2026-09-02T10:14:03.414-0300][info][safepoint     ] Application time: 1.0000978 seconds
[2026-09-02T10:14:03.414-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:03.414-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:03.414-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001511 seconds, Stopping threads took: 0.0000231 seconds
[2026-09-02T10:14:04.414-0300][info][safepoint     ] Application time: 1.0000845 seconds
[2026-09-02T10:14:04.414-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:04.415-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:04.415-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002034 seconds, Stopping threads took: 0.0000383 seconds
[2026-09-02T10:14:05.415-0300][info][safepoint     ] Application time: 1.0001025 seconds
[2026-09-02T10:14:05.415-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:05.415-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:05.415-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001553 seconds, Stopping threads took: 0.0000252 seconds
[2026-09-02T10:14:06.415-0300][info][safepoint     ] Application time: 1.0001170 seconds
[2026-09-02T10:14:06.415-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:06.415-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:06.415-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001599 seconds, Stopping threads took: 0.0000231 seconds
[2026-09-02T10:14:07.370-0300][info][safepoint     ] Application time: 0.9550124 seconds
[2026-09-02T10:14:07.370-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:07.370-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:07.370-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001824 seconds, Stopping threads took: 0.0000171 seconds
[2026-09-02T10:14:07.371-0300][info][safepoint     ] Application time: 0.0002272 seconds
[2026-09-02T10:14:07.371-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:07.371-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:07.371-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000959 seconds, Stopping threads took: 0.0000052 seconds
[2026-09-02T10:14:07.372-0300][info][safepoint     ] Application time: 0.0012136 seconds
[2026-09-02T10:14:07.372-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:07.372-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:07.372-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001011 seconds, Stopping threads took: 0.0000184 seconds
[2026-09-02T10:14:07.372-0300][info][safepoint     ] Application time: 0.0001200 seconds
[2026-09-02T10:14:07.372-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:07.372-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:07.372-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000838 seconds, Stopping threads took: 0.0000235 seconds
[2026-09-02T10:14:07.373-0300][info][safepoint     ] Application time: 0.0003185 seconds
[2026-09-02T10:14:07.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:07.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:07.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001101 seconds, Stopping threads took: 0.0000397 seconds
[2026-09-02T10:14:07.373-0300][info][safepoint     ] Application time: 0.0001105 seconds
[2026-09-02T10:14:07.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:07.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:07.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001187 seconds, Stopping threads took: 0.0000376 seconds
[2026-09-02T10:14:07.373-0300][info][safepoint     ] Application time: 0.0002115 seconds
[2026-09-02T10:14:07.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:07.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:07.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000986 seconds, Stopping threads took: 0.0000225 seconds
[2026-09-02T10:14:07.374-0300][info][safepoint     ] Application time: 0.0009942 seconds
[2026-09-02T10:14:07.374-0300][info][safepoint     ] Entering safepoint region: ThreadDump
[2026-09-02T10:14:07.375-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:07.375-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0005339 seconds, Stopping threads took: 0.0000231 seconds
2026-09-02 10:14:07,306 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@2d8875e6)
2026-09-02 10:14:07,307 INFO  [ora.jdbc] (agroal-11) traceId=57479F57. 
2026-09-02 10:14:07,308 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:14:07,309 INFO  [ora.jdbc] (agroal-11) traceId=57479F57, anoEnabled=true. 
2026-09-02 10:14:07,310 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:14:07,311 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:14:07,312 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:14:07,313 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 57479F57
2026-09-02 10:14:07,314 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:14:07,315 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:14:07,316 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:14:07,317 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:14:07,318 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:14:07,319 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 57479F57
2026-09-02 10:14:07,320 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:14:07,321 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:14:07,322 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:14:07,323 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:14:07,324 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:14:07,325 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 57479F57
2026-09-02 10:14:07,326 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:14:07,327 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=6Vw3XnPWTy6EPKTrxKF1AQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=6Vw3XnPWTy6EPKTrxKF1AQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-09-02 10:14:07,328 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-09-02 10:14:07,406 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=6Vw3XnPWTy6EPKTrxKF1AQ==)
https://docs.oracle.com/error-help/db/ora-12514/
[2026-09-02T10:14:07.412-0300][info][safepoint     ] Application time: 0.0368814 seconds
[2026-09-02T10:14:07.412-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:07.412-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:07.412-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001574 seconds, Stopping threads took: 0.0000253 seconds
2026-09-02 10:14:07,412 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=6Vw3XnPWTy6EPKTrxKF1AQ==)\nhttps://docs.oracle.com/error-help/db/ora-12514/","pge":"UP"}}]}
[2026-09-02T10:14:07.413-0300][info][safepoint     ] Application time: 0.0006311 seconds
[2026-09-02T10:14:07.413-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:07.413-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:07.413-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001078 seconds, Stopping threads took: 0.0000251 seconds
[2026-09-02T10:14:07.413-0300][info][safepoint     ] Application time: 0.0003491 seconds
[2026-09-02T10:14:07.413-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:07.413-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:07.413-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000777 seconds, Stopping threads took: 0.0000049 seconds
[2026-09-02T10:14:08.413-0300][info][safepoint     ] Application time: 1.0000576 seconds
[2026-09-02T10:14:08.413-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:08.413-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:08.413-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001451 seconds, Stopping threads took: 0.0000246 seconds
[2026-09-02T10:14:09.011-0300][info][safepoint     ] Application time: 0.5978630 seconds
[2026-09-02T10:14:09.011-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:09.011-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:09.011-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001705 seconds, Stopping threads took: 0.0000299 seconds
[2026-09-02T10:14:09.012-0300][info][safepoint     ] Application time: 0.0002216 seconds
[2026-09-02T10:14:09.012-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:09.012-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:09.012-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000882 seconds, Stopping threads took: 0.0000079 seconds
[2026-09-02T10:14:09.013-0300][info][safepoint     ] Application time: 0.0013235 seconds
[2026-09-02T10:14:09.013-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:09.013-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:09.013-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001020 seconds, Stopping threads took: 0.0000098 seconds
[2026-09-02T10:14:09.015-0300][info][safepoint     ] Application time: 0.0016792 seconds
[2026-09-02T10:14:09.015-0300][info][safepoint     ] Entering safepoint region: ThreadDump
[2026-09-02T10:14:09.015-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:09.015-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0005821 seconds, Stopping threads took: 0.0000066 seconds
2026-09-02 10:14:08,306 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@6bd9d781)
2026-09-02 10:14:08,307 INFO  [ora.jdbc] (agroal-11) traceId=2DCBFCD9. 
2026-09-02 10:14:08,308 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:14:08,309 INFO  [ora.jdbc] (agroal-11) traceId=2DCBFCD9, anoEnabled=true. 
2026-09-02 10:14:08,310 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:14:08,311 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:14:08,312 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:14:08,313 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 2DCBFCD9
2026-09-02 10:14:08,314 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:14:08,315 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:14:08,316 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:14:08,317 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:14:08,318 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:14:08,319 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 2DCBFCD9
2026-09-02 10:14:08,320 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:14:08,321 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:14:08,322 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:14:08,323 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:14:08,324 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:14:08,325 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 2DCBFCD9
2026-09-02 10:14:08,326 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:14:08,327 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=XFkhSM4bRxG1UqQQ5/kWvw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=XFkhSM4bRxG1UqQQ5/kWvw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-09-02 10:14:08,328 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-09-02 10:14:09,066 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=XFkhSM4bRxG1UqQQ5/kWvw==)
https://docs.oracle.com/error-help/db/ora-12514/
[2026-09-02T10:14:09.070-0300][info][safepoint     ] Application time: 0.0542936 seconds
[2026-09-02T10:14:09.070-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:09.070-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:09.070-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001170 seconds, Stopping threads took: 0.0000152 seconds
2026-09-02 10:14:09,070 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=XFkhSM4bRxG1UqQQ5/kWvw==)\nhttps://docs.oracle.com/error-help/db/ora-12514/","pge":"UP"}}]}
[2026-09-02T10:14:09.070-0300][info][safepoint     ] Application time: 0.0005599 seconds
[2026-09-02T10:14:09.070-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:09.071-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:09.071-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001171 seconds, Stopping threads took: 0.0000263 seconds
[2026-09-02T10:14:09.071-0300][info][safepoint     ] Application time: 0.0004424 seconds
[2026-09-02T10:14:09.071-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:09.071-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:09.071-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000762 seconds, Stopping threads took: 0.0000071 seconds
[2026-09-02T10:14:10.071-0300][info][safepoint     ] Application time: 1.0001079 seconds
[2026-09-02T10:14:10.071-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:10.071-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:10.071-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001691 seconds, Stopping threads took: 0.0000242 seconds
[2026-09-02T10:14:11.072-0300][info][safepoint     ] Application time: 1.0000782 seconds
[2026-09-02T10:14:11.072-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:11.072-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:11.072-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001455 seconds, Stopping threads took: 0.0000230 seconds
[2026-09-02T10:14:12.072-0300][info][safepoint     ] Application time: 1.0000968 seconds
[2026-09-02T10:14:12.072-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:12.072-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:12.072-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001452 seconds, Stopping threads took: 0.0000278 seconds
[2026-09-02T10:14:13.072-0300][info][safepoint     ] Application time: 1.0000832 seconds
[2026-09-02T10:14:13.072-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:13.072-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:13.072-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001274 seconds, Stopping threads took: 0.0000230 seconds
[2026-09-02T10:14:14.072-0300][info][safepoint     ] Application time: 1.0001138 seconds
[2026-09-02T10:14:14.072-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:14.073-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:14.073-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001454 seconds, Stopping threads took: 0.0000226 seconds
[2026-09-02T10:14:15.073-0300][info][safepoint     ] Application time: 1.0000872 seconds
[2026-09-02T10:14:15.073-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:15.073-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:15.073-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001789 seconds, Stopping threads took: 0.0000457 seconds
[2026-09-02T10:14:16.073-0300][info][safepoint     ] Application time: 1.0001114 seconds
[2026-09-02T10:14:16.073-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:16.073-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:16.073-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001626 seconds, Stopping threads took: 0.0000238 seconds
[2026-09-02T10:14:17.073-0300][info][safepoint     ] Application time: 1.0000968 seconds
[2026-09-02T10:14:17.073-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:17.074-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:17.074-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001559 seconds, Stopping threads took: 0.0000275 seconds
[2026-09-02T10:14:17.370-0300][info][safepoint     ] Application time: 0.2968263 seconds
[2026-09-02T10:14:17.370-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:17.371-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:17.371-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001436 seconds, Stopping threads took: 0.0000229 seconds
[2026-09-02T10:14:17.371-0300][info][safepoint     ] Application time: 0.0002768 seconds
[2026-09-02T10:14:17.371-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:17.371-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:17.371-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000950 seconds, Stopping threads took: 0.0000069 seconds
[2026-09-02T10:14:17.372-0300][info][safepoint     ] Application time: 0.0012528 seconds
[2026-09-02T10:14:17.372-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:17.372-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:17.372-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001026 seconds, Stopping threads took: 0.0000053 seconds
[2026-09-02T10:14:17.373-0300][info][safepoint     ] Application time: 0.0003782 seconds
[2026-09-02T10:14:17.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:17.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:17.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000945 seconds, Stopping threads took: 0.0000248 seconds
[2026-09-02T10:14:17.373-0300][info][safepoint     ] Application time: 0.0001070 seconds
[2026-09-02T10:14:17.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:17.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:17.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001465 seconds, Stopping threads took: 0.0000329 seconds
[2026-09-02T10:14:17.373-0300][info][safepoint     ] Application time: 0.0001421 seconds
[2026-09-02T10:14:17.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:17.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:17.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001144 seconds, Stopping threads took: 0.0000410 seconds
[2026-09-02T10:14:17.374-0300][info][safepoint     ] Application time: 0.0010315 seconds
[2026-09-02T10:14:17.374-0300][info][safepoint     ] Entering safepoint region: ThreadDump
[2026-09-02T10:14:17.375-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:17.375-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0005419 seconds, Stopping threads took: 0.0000051 seconds
2026-09-02 10:14:17,306 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@2fee4508)
2026-09-02 10:14:17,307 INFO  [ora.jdbc] (agroal-11) traceId=2BFB5BCA. 
2026-09-02 10:14:17,308 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:14:17,309 INFO  [ora.jdbc] (agroal-11) traceId=2BFB5BCA, anoEnabled=true. 
2026-09-02 10:14:17,310 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:14:17,311 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:14:17,312 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:14:17,313 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 2BFB5BCA
2026-09-02 10:14:17,314 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:14:17,315 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:14:17,316 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:14:17,317 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:14:17,318 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:14:17,319 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 2BFB5BCA
2026-09-02 10:14:17,320 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:14:17,321 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:14:17,322 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:14:17,323 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:14:17,324 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:14:17,325 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 2BFB5BCA
2026-09-02 10:14:17,326 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:14:17,327 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=CtMFxH3USm6r5M7c+Rr/KQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=CtMFxH3USm6r5M7c+Rr/KQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-09-02 10:14:17,328 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-09-02 10:14:17,404 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=CtMFxH3USm6r5M7c+Rr/KQ==)
https://docs.oracle.com/error-help/db/ora-12514/
[2026-09-02T10:14:17.408-0300][info][safepoint     ] Application time: 0.0326745 seconds
[2026-09-02T10:14:17.408-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:17.408-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:17.408-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001455 seconds, Stopping threads took: 0.0000175 seconds
2026-09-02 10:14:17,408 INFO  [io.sma.health] (executor-thread-15) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=CtMFxH3USm6r5M7c+Rr/KQ==)\nhttps://docs.oracle.com/error-help/db/ora-12514/","pge":"UP"}}]}
[2026-09-02T10:14:17.408-0300][info][safepoint     ] Application time: 0.0005502 seconds
[2026-09-02T10:14:17.408-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:17.408-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:17.408-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001405 seconds, Stopping threads took: 0.0000437 seconds
[2026-09-02T10:14:17.409-0300][info][safepoint     ] Application time: 0.0003344 seconds
[2026-09-02T10:14:17.409-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:17.409-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:17.409-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001206 seconds, Stopping threads took: 0.0000353 seconds
[2026-09-02T10:14:18.409-0300][info][safepoint     ] Application time: 1.0000933 seconds
[2026-09-02T10:14:18.409-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:18.409-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:18.409-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001150 seconds, Stopping threads took: 0.0000233 seconds
[2026-09-02T10:14:19.409-0300][info][safepoint     ] Application time: 1.0000630 seconds
[2026-09-02T10:14:19.409-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:19.409-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:19.409-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001669 seconds, Stopping threads took: 0.0000493 seconds
[2026-09-02T10:14:20.410-0300][info][safepoint     ] Application time: 1.0000815 seconds
[2026-09-02T10:14:20.410-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:20.410-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:20.410-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001672 seconds, Stopping threads took: 0.0000243 seconds
[2026-09-02T10:14:21.410-0300][info][safepoint     ] Application time: 1.0000791 seconds
[2026-09-02T10:14:21.410-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:21.410-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:21.410-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001487 seconds, Stopping threads took: 0.0000297 seconds
[2026-09-02T10:14:22.410-0300][info][safepoint     ] Application time: 1.0000845 seconds
[2026-09-02T10:14:22.410-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:22.410-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:22.410-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001311 seconds, Stopping threads took: 0.0000235 seconds
[2026-09-02T10:14:23.410-0300][info][safepoint     ] Application time: 1.0000905 seconds
[2026-09-02T10:14:23.410-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:23.411-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:23.411-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001603 seconds, Stopping threads took: 0.0000225 seconds
[2026-09-02T10:14:24.411-0300][info][safepoint     ] Application time: 1.0001010 seconds
[2026-09-02T10:14:24.411-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:24.411-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:24.411-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001638 seconds, Stopping threads took: 0.0000439 seconds
[2026-09-02T10:14:25.411-0300][info][safepoint     ] Application time: 1.0000866 seconds
[2026-09-02T10:14:25.411-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:25.411-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:25.411-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001597 seconds, Stopping threads took: 0.0000239 seconds
[2026-09-02T10:14:26.411-0300][info][safepoint     ] Application time: 1.0000799 seconds
[2026-09-02T10:14:26.411-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:26.411-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:26.411-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001372 seconds, Stopping threads took: 0.0000242 seconds
[2026-09-02T10:14:27.370-0300][info][safepoint     ] Application time: 0.9589031 seconds
[2026-09-02T10:14:27.370-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:27.371-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:27.371-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001629 seconds, Stopping threads took: 0.0000269 seconds
[2026-09-02T10:14:27.371-0300][info][safepoint     ] Application time: 0.0002761 seconds
[2026-09-02T10:14:27.371-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:27.371-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:27.371-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001214 seconds, Stopping threads took: 0.0000245 seconds
[2026-09-02T10:14:27.371-0300][info][safepoint     ] Application time: 0.0000770 seconds
[2026-09-02T10:14:27.371-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:27.371-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:27.371-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000897 seconds, Stopping threads took: 0.0000257 seconds
[2026-09-02T10:14:27.372-0300][info][safepoint     ] Application time: 0.0011157 seconds
[2026-09-02T10:14:27.372-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:27.372-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:27.372-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000815 seconds, Stopping threads took: 0.0000147 seconds
[2026-09-02T10:14:27.373-0300][info][safepoint     ] Application time: 0.0006013 seconds
[2026-09-02T10:14:27.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:27.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:27.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001909 seconds, Stopping threads took: 0.0000901 seconds
[2026-09-02T10:14:27.374-0300][info][safepoint     ] Application time: 0.0003458 seconds
[2026-09-02T10:14:27.374-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:27.374-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:27.374-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001282 seconds, Stopping threads took: 0.0000182 seconds
[2026-09-02T10:14:27.374-0300][info][safepoint     ] Application time: 0.0001140 seconds
[2026-09-02T10:14:27.374-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:27.374-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:27.374-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001519 seconds, Stopping threads took: 0.0000349 seconds
[2026-09-02T10:14:27.374-0300][info][safepoint     ] Application time: 0.0001844 seconds
[2026-09-02T10:14:27.374-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:27.374-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:27.374-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001000 seconds, Stopping threads took: 0.0000255 seconds
[2026-09-02T10:14:27.375-0300][info][safepoint     ] Application time: 0.0008294 seconds
[2026-09-02T10:14:27.375-0300][info][safepoint     ] Entering safepoint region: ThreadDump
[2026-09-02T10:14:27.376-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:27.376-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0005319 seconds, Stopping threads took: 0.0000059 seconds
2026-09-02 10:14:27,306 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@7bb549c7)
2026-09-02 10:14:27,307 INFO  [ora.jdbc] (agroal-11) traceId=579C1D. 
2026-09-02 10:14:27,308 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:14:27,309 INFO  [ora.jdbc] (agroal-11) traceId=579C1D, anoEnabled=true. 
2026-09-02 10:14:27,310 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:14:27,311 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:14:27,312 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:14:27,313 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 579C1D
2026-09-02 10:14:27,314 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:14:27,315 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:14:27,316 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:14:27,317 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:14:27,318 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:14:27,319 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 579C1D
2026-09-02 10:14:27,320 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:14:27,321 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:14:27,322 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:14:27,323 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:14:27,324 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:14:27,325 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 579C1D
2026-09-02 10:14:27,326 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:14:27,327 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=ySArxZpyTHiyBWonP/QlGQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=ySArxZpyTHiyBWonP/QlGQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-09-02 10:14:27,328 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-09-02 10:14:27,401 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=ySArxZpyTHiyBWonP/QlGQ==)
https://docs.oracle.com/error-help/db/ora-12514/
[2026-09-02T10:14:27.403-0300][info][safepoint     ] Application time: 0.0275363 seconds
[2026-09-02T10:14:27.403-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:27.403-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:27.403-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001274 seconds, Stopping threads took: 0.0000170 seconds
2026-09-02 10:14:27,404 INFO  [io.sma.health] (executor-thread-15) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=ySArxZpyTHiyBWonP/QlGQ==)\nhttps://docs.oracle.com/error-help/db/ora-12514/","pge":"UP"}}]}
[2026-09-02T10:14:27.404-0300][info][safepoint     ] Application time: 0.0005207 seconds
[2026-09-02T10:14:27.404-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:27.404-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:27.404-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001315 seconds, Stopping threads took: 0.0000362 seconds
[2026-09-02T10:14:27.404-0300][info][safepoint     ] Application time: 0.0003129 seconds
[2026-09-02T10:14:27.404-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:27.404-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:27.404-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000603 seconds, Stopping threads took: 0.0000053 seconds
[2026-09-02T10:14:28.405-0300][info][safepoint     ] Application time: 1.0001137 seconds
[2026-09-02T10:14:28.405-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:28.405-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:28.405-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001544 seconds, Stopping threads took: 0.0000229 seconds
[2026-09-02T10:14:29.405-0300][info][safepoint     ] Application time: 1.0001027 seconds
[2026-09-02T10:14:29.405-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:29.405-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:29.405-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001394 seconds, Stopping threads took: 0.0000308 seconds
[2026-09-02T10:14:30.405-0300][info][safepoint     ] Application time: 1.0000731 seconds
[2026-09-02T10:14:30.405-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:30.405-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:30.405-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002041 seconds, Stopping threads took: 0.0000558 seconds
[2026-09-02T10:14:31.405-0300][info][safepoint     ] Application time: 1.0000828 seconds
[2026-09-02T10:14:31.405-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:31.406-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:31.406-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001400 seconds, Stopping threads took: 0.0000235 seconds
[2026-09-02T10:14:32.406-0300][info][safepoint     ] Application time: 1.0000748 seconds
[2026-09-02T10:14:32.406-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:32.406-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:32.406-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001449 seconds, Stopping threads took: 0.0000243 seconds
[2026-09-02T10:14:33.406-0300][info][safepoint     ] Application time: 1.0000873 seconds
[2026-09-02T10:14:33.406-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:33.406-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:33.406-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001425 seconds, Stopping threads took: 0.0000229 seconds
[2026-09-02T10:14:34.406-0300][info][safepoint     ] Application time: 1.0000742 seconds
[2026-09-02T10:14:34.406-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:34.406-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:34.406-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001465 seconds, Stopping threads took: 0.0000221 seconds
[2026-09-02T10:14:35.406-0300][info][safepoint     ] Application time: 1.0000750 seconds
[2026-09-02T10:14:35.407-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:35.407-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:35.407-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001658 seconds, Stopping threads took: 0.0000387 seconds
[2026-09-02T10:14:36.407-0300][info][safepoint     ] Application time: 1.0000829 seconds
[2026-09-02T10:14:36.407-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:36.407-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:36.407-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001439 seconds, Stopping threads took: 0.0000287 seconds
[2026-09-02T10:14:37.370-0300][info][safepoint     ] Application time: 0.9633467 seconds
[2026-09-02T10:14:37.370-0300][info][safepoint     ] Entering safepoint region: BulkRevokeBias
[2026-09-02T10:14:37.371-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:37.371-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0004992 seconds, Stopping threads took: 0.0000373 seconds
[2026-09-02T10:14:37.371-0300][info][safepoint     ] Application time: 0.0002576 seconds
[2026-09-02T10:14:37.371-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:37.371-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:37.371-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000825 seconds, Stopping threads took: 0.0000070 seconds
[2026-09-02T10:14:37.372-0300][info][safepoint     ] Application time: 0.0011318 seconds
[2026-09-02T10:14:37.372-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:37.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:37.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0003533 seconds, Stopping threads took: 0.0000223 seconds
[2026-09-02T10:14:37.373-0300][info][safepoint     ] Application time: 0.0005732 seconds
[2026-09-02T10:14:37.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:37.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:37.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000950 seconds, Stopping threads took: 0.0000257 seconds
[2026-09-02T10:14:37.373-0300][info][safepoint     ] Application time: 0.0001247 seconds
[2026-09-02T10:14:37.374-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:37.374-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:37.374-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001063 seconds, Stopping threads took: 0.0000351 seconds
[2026-09-02T10:14:37.374-0300][info][safepoint     ] Application time: 0.0002008 seconds
[2026-09-02T10:14:37.374-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:37.374-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:37.374-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001161 seconds, Stopping threads took: 0.0000239 seconds
[2026-09-02T10:14:37.375-0300][info][safepoint     ] Application time: 0.0010053 seconds
[2026-09-02T10:14:37.375-0300][info][safepoint     ] Entering safepoint region: ThreadDump
[2026-09-02T10:14:37.375-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:37.375-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0004824 seconds, Stopping threads took: 0.0000312 seconds
2026-09-02 10:14:37,306 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@57bf8434)
2026-09-02 10:14:37,307 INFO  [ora.jdbc] (agroal-11) traceId=5936597D. 
2026-09-02 10:14:37,308 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:14:37,309 INFO  [ora.jdbc] (agroal-11) traceId=5936597D, anoEnabled=true. 
2026-09-02 10:14:37,310 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:14:37,311 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:14:37,312 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:14:37,313 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 5936597D
2026-09-02 10:14:37,314 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:14:37,315 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:14:37,316 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:14:37,317 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:14:37,318 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:14:37,319 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 5936597D
2026-09-02 10:14:37,320 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:14:37,321 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:14:37,322 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:14:37,323 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:14:37,324 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:14:37,325 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 5936597D
2026-09-02 10:14:37,326 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:14:37,327 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=oJ9PoaxATMK2DBEx4g7hIg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=oJ9PoaxATMK2DBEx4g7hIg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-09-02 10:14:37,328 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-09-02 10:14:37,407 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=oJ9PoaxATMK2DBEx4g7hIg==)
https://docs.oracle.com/error-help/db/ora-12514/
[2026-09-02T10:14:37.410-0300][info][safepoint     ] Application time: 0.0347750 seconds
[2026-09-02T10:14:37.410-0300][info][safepoint     ] Entering safepoint region: BulkRevokeBias
[2026-09-02T10:14:37.411-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:37.411-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0004741 seconds, Stopping threads took: 0.0000154 seconds
2026-09-02 10:14:37,411 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=oJ9PoaxATMK2DBEx4g7hIg==)\nhttps://docs.oracle.com/error-help/db/ora-12514/","pge":"UP"}}]}
[2026-09-02T10:14:37.411-0300][info][safepoint     ] Application time: 0.0005481 seconds
[2026-09-02T10:14:37.411-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:37.411-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:37.411-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001461 seconds, Stopping threads took: 0.0000384 seconds
[2026-09-02T10:14:37.412-0300][info][safepoint     ] Application time: 0.0003523 seconds
[2026-09-02T10:14:37.412-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:37.412-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:37.412-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000670 seconds, Stopping threads took: 0.0000052 seconds
[2026-09-02T10:14:37.412-0300][info][safepoint     ] Application time: 0.0002926 seconds
[2026-09-02T10:14:37.412-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:37.412-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:37.412-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001139 seconds, Stopping threads took: 0.0000066 seconds
[2026-09-02T10:14:38.412-0300][info][safepoint     ] Application time: 1.0000888 seconds
[2026-09-02T10:14:38.412-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:38.413-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:38.413-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002171 seconds, Stopping threads took: 0.0000298 seconds
[2026-09-02T10:14:39.413-0300][info][safepoint     ] Application time: 1.0001007 seconds
[2026-09-02T10:14:39.413-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:39.413-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:39.413-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002056 seconds, Stopping threads took: 0.0000306 seconds
[2026-09-02T10:14:40.413-0300][info][safepoint     ] Application time: 1.0000907 seconds
[2026-09-02T10:14:40.413-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:40.413-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:40.413-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001614 seconds, Stopping threads took: 0.0000555 seconds
[2026-09-02T10:14:41.413-0300][info][safepoint     ] Application time: 1.0000820 seconds
[2026-09-02T10:14:41.413-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:41.414-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:41.414-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001495 seconds, Stopping threads took: 0.0000231 seconds
[2026-09-02T10:14:42.414-0300][info][safepoint     ] Application time: 1.0000853 seconds
[2026-09-02T10:14:42.414-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:42.414-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:42.414-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001354 seconds, Stopping threads took: 0.0000213 seconds
[2026-09-02T10:14:43.414-0300][info][safepoint     ] Application time: 1.0000917 seconds
[2026-09-02T10:14:43.414-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:43.414-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:43.414-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001491 seconds, Stopping threads took: 0.0000317 seconds
[2026-09-02T10:14:44.414-0300][info][safepoint     ] Application time: 1.0000872 seconds
[2026-09-02T10:14:44.414-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:44.414-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:44.414-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001392 seconds, Stopping threads took: 0.0000225 seconds
[2026-09-02T10:14:45.415-0300][info][safepoint     ] Application time: 1.0000846 seconds
[2026-09-02T10:14:45.415-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:45.415-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:45.415-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001497 seconds, Stopping threads took: 0.0000381 seconds
[2026-09-02T10:14:46.415-0300][info][safepoint     ] Application time: 1.0000820 seconds
[2026-09-02T10:14:46.415-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:46.415-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:46.415-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001599 seconds, Stopping threads took: 0.0000231 seconds
[2026-09-02T10:14:47.370-0300][info][safepoint     ] Application time: 0.9547433 seconds
[2026-09-02T10:14:47.370-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:47.370-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:47.370-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001389 seconds, Stopping threads took: 0.0000190 seconds
[2026-09-02T10:14:47.370-0300][info][safepoint     ] Application time: 0.0002334 seconds
[2026-09-02T10:14:47.370-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:47.370-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:47.370-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000972 seconds, Stopping threads took: 0.0000072 seconds
[2026-09-02T10:14:47.371-0300][info][safepoint     ] Application time: 0.0012012 seconds
[2026-09-02T10:14:47.371-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:47.372-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:47.372-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001297 seconds, Stopping threads took: 0.0000115 seconds
[2026-09-02T10:14:47.372-0300][info][safepoint     ] Application time: 0.0004428 seconds
[2026-09-02T10:14:47.372-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:47.372-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:47.372-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001337 seconds, Stopping threads took: 0.0000604 seconds
[2026-09-02T10:14:47.372-0300][info][safepoint     ] Application time: 0.0002817 seconds
[2026-09-02T10:14:47.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:47.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:47.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001083 seconds, Stopping threads took: 0.0000253 seconds
[2026-09-02T10:14:47.380-0300][info][safepoint     ] Application time: 0.0069079 seconds
[2026-09-02T10:14:47.380-0300][info][safepoint     ] Entering safepoint region: ThreadDump
[2026-09-02T10:14:47.380-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:47.380-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0006052 seconds, Stopping threads took: 0.0000137 seconds
2026-09-02 10:14:47,306 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@5f3e58b9)
2026-09-02 10:14:47,307 INFO  [ora.jdbc] (agroal-11) traceId=192EF3FB. 
2026-09-02 10:14:47,308 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:14:47,309 INFO  [ora.jdbc] (agroal-11) traceId=192EF3FB, anoEnabled=true. 
2026-09-02 10:14:47,310 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:14:47,311 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:14:47,312 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:14:47,313 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 192EF3FB
2026-09-02 10:14:47,314 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:14:47,315 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:14:47,316 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:14:47,317 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:14:47,318 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:14:47,319 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 192EF3FB
2026-09-02 10:14:47,320 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:14:47,321 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:14:47,322 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:14:47,323 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:14:47,324 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:14:47,325 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 192EF3FB
2026-09-02 10:14:47,326 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:14:47,327 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=Y2IHpnphRP+6t/qxRB69TQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=Y2IHpnphRP+6t/qxRB69TQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-09-02 10:14:47,328 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-09-02 10:14:47,462 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=Y2IHpnphRP+6t/qxRB69TQ==)
https://docs.oracle.com/error-help/db/ora-12514/
[2026-09-02T10:14:47.466-0300][info][safepoint     ] Application time: 0.0858544 seconds
[2026-09-02T10:14:47.466-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:47.466-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:47.466-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001597 seconds, Stopping threads took: 0.0000184 seconds
2026-09-02 10:14:47,466 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=Y2IHpnphRP+6t/qxRB69TQ==)\nhttps://docs.oracle.com/error-help/db/ora-12514/","pge":"UP"}}]}
[2026-09-02T10:14:47.467-0300][info][safepoint     ] Application time: 0.0006574 seconds
[2026-09-02T10:14:47.467-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:47.467-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:47.467-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001399 seconds, Stopping threads took: 0.0000469 seconds
[2026-09-02T10:14:47.467-0300][info][safepoint     ] Application time: 0.0003459 seconds
[2026-09-02T10:14:47.467-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:47.467-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:47.467-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000952 seconds, Stopping threads took: 0.0000257 seconds
[2026-09-02T10:14:48.468-0300][info][safepoint     ] Application time: 1.0001116 seconds
[2026-09-02T10:14:48.468-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:48.468-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:48.468-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001232 seconds, Stopping threads took: 0.0000251 seconds
[2026-09-02T10:14:49.468-0300][info][safepoint     ] Application time: 1.0001419 seconds
[2026-09-02T10:14:49.468-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:49.468-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:49.468-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001959 seconds, Stopping threads took: 0.0000297 seconds
[2026-09-02T10:14:50.468-0300][info][safepoint     ] Application time: 1.0001083 seconds
[2026-09-02T10:14:50.468-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:50.468-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:50.468-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001498 seconds, Stopping threads took: 0.0000404 seconds
[2026-09-02T10:14:51.469-0300][info][safepoint     ] Application time: 1.0001282 seconds
[2026-09-02T10:14:51.469-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:51.469-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:51.469-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001269 seconds, Stopping threads took: 0.0000297 seconds
[2026-09-02T10:14:52.469-0300][info][safepoint     ] Application time: 1.0000946 seconds
[2026-09-02T10:14:52.469-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:52.469-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:52.469-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002185 seconds, Stopping threads took: 0.0000326 seconds
[2026-09-02T10:14:53.469-0300][info][safepoint     ] Application time: 1.0000845 seconds
[2026-09-02T10:14:53.469-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:53.469-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:53.469-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001358 seconds, Stopping threads took: 0.0000241 seconds
[2026-09-02T10:14:54.469-0300][info][safepoint     ] Application time: 1.0000835 seconds
[2026-09-02T10:14:54.470-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:54.470-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:54.470-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001745 seconds, Stopping threads took: 0.0000293 seconds
[2026-09-02T10:14:55.470-0300][info][safepoint     ] Application time: 1.0000863 seconds
[2026-09-02T10:14:55.470-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:55.470-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:55.470-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001705 seconds, Stopping threads took: 0.0000437 seconds
[2026-09-02T10:14:56.470-0300][info][safepoint     ] Application time: 1.0000926 seconds
[2026-09-02T10:14:56.470-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:56.470-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:56.470-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001521 seconds, Stopping threads took: 0.0000288 seconds
[2026-09-02T10:14:57.370-0300][info][safepoint     ] Application time: 0.9000853 seconds
[2026-09-02T10:14:57.370-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:57.371-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:57.371-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001435 seconds, Stopping threads took: 0.0000219 seconds
[2026-09-02T10:14:57.371-0300][info][safepoint     ] Application time: 0.0002638 seconds
[2026-09-02T10:14:57.371-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:57.371-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:57.371-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000775 seconds, Stopping threads took: 0.0000054 seconds
[2026-09-02T10:14:57.372-0300][info][safepoint     ] Application time: 0.0011251 seconds
[2026-09-02T10:14:57.372-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:57.372-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:57.372-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001192 seconds, Stopping threads took: 0.0000358 seconds
[2026-09-02T10:14:57.372-0300][info][safepoint     ] Application time: 0.0000300 seconds
[2026-09-02T10:14:57.372-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:57.372-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:57.372-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000779 seconds, Stopping threads took: 0.0000242 seconds
[2026-09-02T10:14:57.373-0300][info][safepoint     ] Application time: 0.0003550 seconds
[2026-09-02T10:14:57.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:57.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:57.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000773 seconds, Stopping threads took: 0.0000053 seconds
[2026-09-02T10:14:57.373-0300][info][safepoint     ] Application time: 0.0001257 seconds
[2026-09-02T10:14:57.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:57.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:57.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001417 seconds, Stopping threads took: 0.0000451 seconds
[2026-09-02T10:14:57.373-0300][info][safepoint     ] Application time: 0.0003730 seconds
[2026-09-02T10:14:57.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:57.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:57.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000732 seconds, Stopping threads took: 0.0000067 seconds
[2026-09-02T10:14:57.375-0300][info][safepoint     ] Application time: 0.0019254 seconds
[2026-09-02T10:14:57.375-0300][info][safepoint     ] Entering safepoint region: ThreadDump
[2026-09-02T10:14:57.376-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:57.376-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0006406 seconds, Stopping threads took: 0.0000160 seconds
2026-09-02 10:14:57,306 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@237220cf)
2026-09-02 10:14:57,307 INFO  [ora.jdbc] (agroal-11) traceId=4119A62B. 
2026-09-02 10:14:57,308 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:14:57,309 INFO  [ora.jdbc] (agroal-11) traceId=4119A62B, anoEnabled=true. 
2026-09-02 10:14:57,310 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:14:57,311 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:14:57,312 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:14:57,313 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 4119A62B
2026-09-02 10:14:57,314 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:14:57,315 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:14:57,316 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:14:57,317 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:14:57,318 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:14:57,319 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 4119A62B
2026-09-02 10:14:57,320 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:14:57,321 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:14:57,322 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:14:57,323 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:14:57,324 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:14:57,325 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 4119A62B
2026-09-02 10:14:57,326 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:14:57,327 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=oBMirMYGTS+SrZYlOVogWw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=oBMirMYGTS+SrZYlOVogWw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-09-02 10:14:57,328 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-09-02 10:14:57,408 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=oBMirMYGTS+SrZYlOVogWw==)
https://docs.oracle.com/error-help/db/ora-12514/
[2026-09-02T10:14:57.412-0300][info][safepoint     ] Application time: 0.0363928 seconds
[2026-09-02T10:14:57.412-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:57.413-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:57.413-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001498 seconds, Stopping threads took: 0.0000182 seconds
2026-09-02 10:14:57,413 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=oBMirMYGTS+SrZYlOVogWw==)\nhttps://docs.oracle.com/error-help/db/ora-12514/","pge":"UP"}}]}
[2026-09-02T10:14:57.413-0300][info][safepoint     ] Application time: 0.0008323 seconds
[2026-09-02T10:14:57.413-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:57.414-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:57.414-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000916 seconds, Stopping threads took: 0.0000121 seconds
[2026-09-02T10:14:57.414-0300][info][safepoint     ] Application time: 0.0004455 seconds
[2026-09-02T10:14:57.414-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:14:57.414-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:57.414-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000873 seconds, Stopping threads took: 0.0000059 seconds
[2026-09-02T10:14:58.414-0300][info][safepoint     ] Application time: 1.0000785 seconds
[2026-09-02T10:14:58.414-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:58.414-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:58.414-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001458 seconds, Stopping threads took: 0.0000235 seconds
[2026-09-02T10:14:59.414-0300][info][safepoint     ] Application time: 1.0000755 seconds
[2026-09-02T10:14:59.415-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:14:59.415-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:14:59.415-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001521 seconds, Stopping threads took: 0.0000238 seconds
[2026-09-02T10:15:00.415-0300][info][safepoint     ] Application time: 1.0000779 seconds
[2026-09-02T10:15:00.415-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:00.415-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:00.415-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001931 seconds, Stopping threads took: 0.0000533 seconds
[2026-09-02T10:15:01.415-0300][info][safepoint     ] Application time: 1.0000371 seconds
[2026-09-02T10:15:01.415-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:01.415-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:01.415-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001317 seconds, Stopping threads took: 0.0000236 seconds
[2026-09-02T10:15:01.812-0300][info][safepoint     ] Application time: 0.3970193 seconds
[2026-09-02T10:15:01.812-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:01.812-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:01.812-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001828 seconds, Stopping threads took: 0.0000217 seconds
[2026-09-02T10:15:02.812-0300][info][safepoint     ] Application time: 1.0000787 seconds
[2026-09-02T10:15:02.813-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:02.813-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:02.813-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001947 seconds, Stopping threads took: 0.0000228 seconds
[2026-09-02T10:15:03.813-0300][info][safepoint     ] Application time: 1.0000888 seconds
[2026-09-02T10:15:03.813-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:03.813-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:03.813-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001741 seconds, Stopping threads took: 0.0000228 seconds
[2026-09-02T10:15:04.813-0300][info][safepoint     ] Application time: 1.0000818 seconds
[2026-09-02T10:15:04.813-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:04.813-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:04.813-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001462 seconds, Stopping threads took: 0.0000236 seconds
[2026-09-02T10:15:05.813-0300][info][safepoint     ] Application time: 1.0000818 seconds
[2026-09-02T10:15:05.813-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:05.814-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:05.814-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002165 seconds, Stopping threads took: 0.0000553 seconds
[2026-09-02T10:15:06.814-0300][info][safepoint     ] Application time: 1.0000755 seconds
[2026-09-02T10:15:06.814-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:06.814-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:06.814-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001546 seconds, Stopping threads took: 0.0000284 seconds
[2026-09-02T10:15:07.371-0300][info][safepoint     ] Application time: 0.5568597 seconds
[2026-09-02T10:15:07.371-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:07.371-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:07.371-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001553 seconds, Stopping threads took: 0.0000411 seconds
[2026-09-02T10:15:07.371-0300][info][safepoint     ] Application time: 0.0003276 seconds
[2026-09-02T10:15:07.371-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:07.371-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:07.371-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001550 seconds, Stopping threads took: 0.0000095 seconds
[2026-09-02T10:15:07.373-0300][info][safepoint     ] Application time: 0.0012780 seconds
[2026-09-02T10:15:07.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:07.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:07.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000991 seconds, Stopping threads took: 0.0000130 seconds
[2026-09-02T10:15:07.373-0300][info][safepoint     ] Application time: 0.0004092 seconds
[2026-09-02T10:15:07.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:07.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:07.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001022 seconds, Stopping threads took: 0.0000296 seconds
[2026-09-02T10:15:07.374-0300][info][safepoint     ] Application time: 0.0001533 seconds
[2026-09-02T10:15:07.374-0300][info][safepoint     ] Entering safepoint region: BulkRevokeBias
[2026-09-02T10:15:07.374-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:07.374-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0005146 seconds, Stopping threads took: 0.0000405 seconds
[2026-09-02T10:15:07.374-0300][info][safepoint     ] Application time: 0.0000686 seconds
[2026-09-02T10:15:07.374-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:07.374-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:07.374-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000853 seconds, Stopping threads took: 0.0000057 seconds
[2026-09-02T10:15:07.376-0300][info][safepoint     ] Application time: 0.0022037 seconds
[2026-09-02T10:15:07.376-0300][info][safepoint     ] Entering safepoint region: ThreadDump
[2026-09-02T10:15:07.377-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:07.377-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0005480 seconds, Stopping threads took: 0.0000249 seconds
[2026-09-02T10:15:07.379-0300][info][safepoint     ] Application time: 0.0017167 seconds
[2026-09-02T10:15:07.379-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:07.379-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:07.379-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001068 seconds, Stopping threads took: 0.0000112 seconds
[2026-09-02T10:15:07.379-0300][info][safepoint     ] Application time: 0.0002294 seconds
[2026-09-02T10:15:07.379-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:07.379-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:07.379-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000743 seconds, Stopping threads took: 0.0000056 seconds
[2026-09-02T10:15:07.380-0300][info][safepoint     ] Application time: 0.0003563 seconds
[2026-09-02T10:15:07.380-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:07.380-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:07.380-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000886 seconds, Stopping threads took: 0.0000225 seconds
2026-09-02 10:15:07,306 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@39c6fed4)
2026-09-02 10:15:07,307 INFO  [ora.jdbc] (agroal-11) traceId=5C17DF2E. 
2026-09-02 10:15:07,308 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:15:07,309 INFO  [ora.jdbc] (agroal-11) traceId=5C17DF2E, anoEnabled=true. 
2026-09-02 10:15:07,310 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:15:07,311 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:15:07,312 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:15:07,313 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 5C17DF2E
2026-09-02 10:15:07,314 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:15:07,315 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:15:07,316 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:15:07,317 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:15:07,318 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:15:07,319 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 5C17DF2E
2026-09-02 10:15:07,320 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:15:07,321 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:15:07,322 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:15:07,323 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:15:07,324 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:15:07,325 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 5C17DF2E
2026-09-02 10:15:07,326 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:15:07,327 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=LqOLMs7QQL+vQ4aN2LVOog==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=LqOLMs7QQL+vQ4aN2LVOog==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-09-02 10:15:07,328 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-09-02 10:15:07,416 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=LqOLMs7QQL+vQ4aN2LVOog==)
https://docs.oracle.com/error-help/db/ora-12514/
[2026-09-02T10:15:07.421-0300][info][safepoint     ] Application time: 0.0410044 seconds
[2026-09-02T10:15:07.421-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:07.421-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:07.421-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002077 seconds, Stopping threads took: 0.0000195 seconds
2026-09-02 10:15:07,421 INFO  [io.sma.health] (executor-thread-15) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=LqOLMs7QQL+vQ4aN2LVOog==)\nhttps://docs.oracle.com/error-help/db/ora-12514/","pge":"UP"}}]}
[2026-09-02T10:15:07.422-0300][info][safepoint     ] Application time: 0.0012576 seconds
[2026-09-02T10:15:07.422-0300][info][safepoint     ] Entering safepoint region: BulkRevokeBias
[2026-09-02T10:15:07.423-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:07.423-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0004320 seconds, Stopping threads took: 0.0000057 seconds
[2026-09-02T10:15:07.423-0300][info][safepoint     ] Application time: 0.0007856 seconds
[2026-09-02T10:15:07.423-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:07.423-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:07.423-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001268 seconds, Stopping threads took: 0.0000167 seconds
[2026-09-02T10:15:08.424-0300][info][safepoint     ] Application time: 1.0000937 seconds
[2026-09-02T10:15:08.424-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:08.424-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:08.424-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001583 seconds, Stopping threads took: 0.0000237 seconds
[2026-09-02T10:15:09.424-0300][info][safepoint     ] Application time: 1.0000931 seconds
[2026-09-02T10:15:09.424-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:09.424-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:09.424-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001768 seconds, Stopping threads took: 0.0000299 seconds
[2026-09-02T10:15:10.012-0300][info][safepoint     ] Application time: 0.5878824 seconds
[2026-09-02T10:15:10.012-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:10.012-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:10.012-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001585 seconds, Stopping threads took: 0.0000201 seconds
[2026-09-02T10:15:10.023-0300][info][safepoint     ] Application time: 0.0108255 seconds
[2026-09-02T10:15:10.023-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:10.023-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:10.023-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001473 seconds, Stopping threads took: 0.0000215 seconds
[2026-09-02T10:15:10.026-0300][info][safepoint     ] Application time: 0.0027997 seconds
[2026-09-02T10:15:10.026-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:10.026-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:10.026-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001269 seconds, Stopping threads took: 0.0000150 seconds
[2026-09-02T10:15:10.028-0300][info][safepoint     ] Application time: 0.0019976 seconds
[2026-09-02T10:15:10.028-0300][info][safepoint     ] Entering safepoint region: ThreadDump
[2026-09-02T10:15:10.029-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:10.029-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0006225 seconds, Stopping threads took: 0.0000463 seconds
2026-09-02 10:15:09,306 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@689d95e4)
2026-09-02 10:15:09,307 INFO  [ora.jdbc] (agroal-11) traceId=16A6F458. 
2026-09-02 10:15:09,308 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:15:09,309 INFO  [ora.jdbc] (agroal-11) traceId=16A6F458, anoEnabled=true. 
2026-09-02 10:15:09,310 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:15:09,311 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:15:09,312 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:15:09,313 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 16A6F458
2026-09-02 10:15:09,314 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:15:09,315 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:15:09,316 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:15:09,317 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:15:09,318 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:15:09,319 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 16A6F458
2026-09-02 10:15:09,320 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:15:09,321 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:15:09,322 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:15:09,323 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:15:09,324 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:15:09,325 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 16A6F458
2026-09-02 10:15:09,326 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:15:09,327 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=GHLMJcWqQMuBnlf0ZL5J3A==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=GHLMJcWqQMuBnlf0ZL5J3A==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-09-02 10:15:09,328 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-09-02 10:15:10,047 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=GHLMJcWqQMuBnlf0ZL5J3A==)
https://docs.oracle.com/error-help/db/ora-12514/
[2026-09-02T10:15:10.050-0300][info][safepoint     ] Application time: 0.0208962 seconds
[2026-09-02T10:15:10.050-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:10.050-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:10.050-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001547 seconds, Stopping threads took: 0.0000180 seconds
2026-09-02 10:15:10,050 INFO  [io.sma.health] (executor-thread-15) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=GHLMJcWqQMuBnlf0ZL5J3A==)\nhttps://docs.oracle.com/error-help/db/ora-12514/","pge":"UP"}}]}
[2026-09-02T10:15:10.050-0300][info][safepoint     ] Application time: 0.0005083 seconds
[2026-09-02T10:15:10.050-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:10.050-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:10.050-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001155 seconds, Stopping threads took: 0.0000367 seconds
[2026-09-02T10:15:10.051-0300][info][safepoint     ] Application time: 0.0003287 seconds
[2026-09-02T10:15:10.051-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:10.051-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:10.051-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000672 seconds, Stopping threads took: 0.0000052 seconds
[2026-09-02T10:15:11.051-0300][info][safepoint     ] Application time: 1.0000934 seconds
[2026-09-02T10:15:11.051-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:11.051-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:11.051-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001773 seconds, Stopping threads took: 0.0000518 seconds
[2026-09-02T10:15:12.051-0300][info][safepoint     ] Application time: 1.0000786 seconds
[2026-09-02T10:15:12.051-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:12.052-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:12.052-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001760 seconds, Stopping threads took: 0.0000243 seconds
[2026-09-02T10:15:13.052-0300][info][safepoint     ] Application time: 1.0001277 seconds
[2026-09-02T10:15:13.052-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:13.052-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:13.052-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001388 seconds, Stopping threads took: 0.0000226 seconds
[2026-09-02T10:15:14.052-0300][info][safepoint     ] Application time: 1.0001127 seconds
[2026-09-02T10:15:14.052-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:14.052-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:14.052-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001567 seconds, Stopping threads took: 0.0000243 seconds
[2026-09-02T10:15:15.052-0300][info][safepoint     ] Application time: 1.0000901 seconds
[2026-09-02T10:15:15.052-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:15.052-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:15.052-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001772 seconds, Stopping threads took: 0.0000293 seconds
[2026-09-02T10:15:16.053-0300][info][safepoint     ] Application time: 1.0000947 seconds
[2026-09-02T10:15:16.053-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:16.053-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:16.053-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001507 seconds, Stopping threads took: 0.0000442 seconds
[2026-09-02T10:15:17.053-0300][info][safepoint     ] Application time: 1.0001040 seconds
[2026-09-02T10:15:17.053-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:17.053-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:17.053-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001604 seconds, Stopping threads took: 0.0000298 seconds
[2026-09-02T10:15:17.370-0300][info][safepoint     ] Application time: 0.3167356 seconds
[2026-09-02T10:15:17.370-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:17.370-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:17.370-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001408 seconds, Stopping threads took: 0.0000188 seconds
[2026-09-02T10:15:17.370-0300][info][safepoint     ] Application time: 0.0002513 seconds
[2026-09-02T10:15:17.370-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:17.370-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:17.370-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000635 seconds, Stopping threads took: 0.0000052 seconds
[2026-09-02T10:15:17.371-0300][info][safepoint     ] Application time: 0.0010295 seconds
[2026-09-02T10:15:17.371-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:17.371-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:17.371-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000988 seconds, Stopping threads took: 0.0000053 seconds
[2026-09-02T10:15:17.372-0300][info][safepoint     ] Application time: 0.0003399 seconds
[2026-09-02T10:15:17.372-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:17.372-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:17.372-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001092 seconds, Stopping threads took: 0.0000351 seconds
[2026-09-02T10:15:17.372-0300][info][safepoint     ] Application time: 0.0001029 seconds
[2026-09-02T10:15:17.372-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:17.372-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:17.372-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001221 seconds, Stopping threads took: 0.0000364 seconds
[2026-09-02T10:15:17.373-0300][info][safepoint     ] Application time: 0.0004370 seconds
[2026-09-02T10:15:17.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:17.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:17.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001450 seconds, Stopping threads took: 0.0000545 seconds
[2026-09-02T10:15:17.373-0300][info][safepoint     ] Application time: 0.0003061 seconds
[2026-09-02T10:15:17.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:17.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:17.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000632 seconds, Stopping threads took: 0.0000064 seconds
[2026-09-02T10:15:17.374-0300][info][safepoint     ] Application time: 0.0008679 seconds
[2026-09-02T10:15:17.374-0300][info][safepoint     ] Entering safepoint region: ThreadDump
[2026-09-02T10:15:17.375-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:17.375-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0006124 seconds, Stopping threads took: 0.0000216 seconds
2026-09-02 10:15:17,306 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@554fd382)
2026-09-02 10:15:17,307 INFO  [ora.jdbc] (agroal-11) traceId=47E27515. 
2026-09-02 10:15:17,308 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:15:17,309 INFO  [ora.jdbc] (agroal-11) traceId=47E27515, anoEnabled=true. 
2026-09-02 10:15:17,310 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:15:17,311 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:15:17,312 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:15:17,313 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 47E27515
2026-09-02 10:15:17,314 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:15:17,315 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:15:17,316 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:15:17,317 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:15:17,318 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:15:17,319 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 47E27515
2026-09-02 10:15:17,320 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:15:17,321 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:15:17,322 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:15:17,323 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:15:17,324 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:15:17,325 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 47E27515
2026-09-02 10:15:17,326 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:15:17,327 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=HFu8DGsbSIaYhFrNQIAjkA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=HFu8DGsbSIaYhFrNQIAjkA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-09-02 10:15:17,328 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-09-02 10:15:17,402 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=HFu8DGsbSIaYhFrNQIAjkA==)
https://docs.oracle.com/error-help/db/ora-12514/
[2026-09-02T10:15:17.406-0300][info][safepoint     ] Application time: 0.0310870 seconds
[2026-09-02T10:15:17.406-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:17.406-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:17.406-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001417 seconds, Stopping threads took: 0.0000185 seconds
2026-09-02 10:15:17,406 INFO  [io.sma.health] (executor-thread-15) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=HFu8DGsbSIaYhFrNQIAjkA==)\nhttps://docs.oracle.com/error-help/db/ora-12514/","pge":"UP"}}]}
[2026-09-02T10:15:17.407-0300][info][safepoint     ] Application time: 0.0006613 seconds
[2026-09-02T10:15:17.407-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:17.407-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:17.407-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000807 seconds, Stopping threads took: 0.0000134 seconds
[2026-09-02T10:15:17.407-0300][info][safepoint     ] Application time: 0.0005280 seconds
[2026-09-02T10:15:17.407-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:17.407-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:17.407-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000901 seconds, Stopping threads took: 0.0000122 seconds
[2026-09-02T10:15:18.408-0300][info][safepoint     ] Application time: 1.0003676 seconds
[2026-09-02T10:15:18.408-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:18.408-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:18.408-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001840 seconds, Stopping threads took: 0.0000302 seconds
[2026-09-02T10:15:19.408-0300][info][safepoint     ] Application time: 1.0000811 seconds
[2026-09-02T10:15:19.408-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:19.408-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:19.408-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001328 seconds, Stopping threads took: 0.0000242 seconds
[2026-09-02T10:15:20.408-0300][info][safepoint     ] Application time: 1.0001106 seconds
[2026-09-02T10:15:20.408-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:20.408-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:20.408-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001252 seconds, Stopping threads took: 0.0000308 seconds
[2026-09-02T10:15:21.409-0300][info][safepoint     ] Application time: 1.0000792 seconds
[2026-09-02T10:15:21.409-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:21.409-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:21.409-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002162 seconds, Stopping threads took: 0.0000425 seconds
[2026-09-02T10:15:22.409-0300][info][safepoint     ] Application time: 1.0000684 seconds
[2026-09-02T10:15:22.409-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:22.409-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:22.409-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001554 seconds, Stopping threads took: 0.0000267 seconds
[2026-09-02T10:15:23.409-0300][info][safepoint     ] Application time: 1.0000874 seconds
[2026-09-02T10:15:23.409-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:23.409-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:23.409-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001206 seconds, Stopping threads took: 0.0000226 seconds
[2026-09-02T10:15:24.409-0300][info][safepoint     ] Application time: 1.0000799 seconds
[2026-09-02T10:15:24.409-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:24.410-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:24.410-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001322 seconds, Stopping threads took: 0.0000225 seconds
[2026-09-02T10:15:25.410-0300][info][safepoint     ] Application time: 1.0000961 seconds
[2026-09-02T10:15:25.410-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:25.410-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:25.410-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001401 seconds, Stopping threads took: 0.0000238 seconds
[2026-09-02T10:15:26.410-0300][info][safepoint     ] Application time: 1.0000805 seconds
[2026-09-02T10:15:26.410-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:26.410-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:26.410-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001749 seconds, Stopping threads took: 0.0000594 seconds
[2026-09-02T10:15:27.370-0300][info][safepoint     ] Application time: 0.9601732 seconds
[2026-09-02T10:15:27.370-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:27.370-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:27.370-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001696 seconds, Stopping threads took: 0.0000248 seconds
[2026-09-02T10:15:27.371-0300][info][safepoint     ] Application time: 0.0002326 seconds
[2026-09-02T10:15:27.371-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:27.371-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:27.371-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001241 seconds, Stopping threads took: 0.0000372 seconds
[2026-09-02T10:15:27.372-0300][info][safepoint     ] Application time: 0.0012039 seconds
[2026-09-02T10:15:27.372-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:27.372-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:27.372-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001070 seconds, Stopping threads took: 0.0000114 seconds
[2026-09-02T10:15:27.373-0300][info][safepoint     ] Application time: 0.0004279 seconds
[2026-09-02T10:15:27.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:27.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:27.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001142 seconds, Stopping threads took: 0.0000322 seconds
[2026-09-02T10:15:27.373-0300][info][safepoint     ] Application time: 0.0001112 seconds
[2026-09-02T10:15:27.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:27.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:27.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001376 seconds, Stopping threads took: 0.0000384 seconds
[2026-09-02T10:15:27.373-0300][info][safepoint     ] Application time: 0.0002530 seconds
[2026-09-02T10:15:27.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:27.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:27.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000872 seconds, Stopping threads took: 0.0000189 seconds
[2026-09-02T10:15:27.374-0300][info][safepoint     ] Application time: 0.0010898 seconds
[2026-09-02T10:15:27.374-0300][info][safepoint     ] Entering safepoint region: ThreadDump
[2026-09-02T10:15:27.375-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:27.375-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0007827 seconds, Stopping threads took: 0.0000301 seconds
2026-09-02 10:15:27,307 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@10a80287)
2026-09-02 10:15:27,308 INFO  [ora.jdbc] (agroal-11) traceId=22BA7429. 
2026-09-02 10:15:27,309 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:15:27,310 INFO  [ora.jdbc] (agroal-11) traceId=22BA7429, anoEnabled=true. 
2026-09-02 10:15:27,311 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:15:27,312 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:15:27,313 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:15:27,314 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 22BA7429
2026-09-02 10:15:27,315 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:15:27,316 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:15:27,317 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:15:27,318 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:15:27,319 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:15:27,320 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 22BA7429
2026-09-02 10:15:27,321 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:15:27,322 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:15:27,323 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:15:27,324 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:15:27,325 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:15:27,326 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 22BA7429
2026-09-02 10:15:27,327 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:15:27,328 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=iO3hwntcSKWLHp5NYBBS7w==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=iO3hwntcSKWLHp5NYBBS7w==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-09-02 10:15:27,329 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-09-02 10:15:27,411 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=iO3hwntcSKWLHp5NYBBS7w==)
https://docs.oracle.com/error-help/db/ora-12514/
[2026-09-02T10:15:27.415-0300][info][safepoint     ] Application time: 0.0401605 seconds
[2026-09-02T10:15:27.415-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:27.416-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:27.416-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001995 seconds, Stopping threads took: 0.0000364 seconds
2026-09-02 10:15:27,416 INFO  [io.sma.health] (executor-thread-15) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=iO3hwntcSKWLHp5NYBBS7w==)\nhttps://docs.oracle.com/error-help/db/ora-12514/","pge":"UP"}}]}
[2026-09-02T10:15:27.416-0300][info][safepoint     ] Application time: 0.0005493 seconds
[2026-09-02T10:15:27.416-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:27.416-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:27.416-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001233 seconds, Stopping threads took: 0.0000319 seconds
[2026-09-02T10:15:27.417-0300][info][safepoint     ] Application time: 0.0003488 seconds
[2026-09-02T10:15:27.417-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:27.417-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:27.417-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000780 seconds, Stopping threads took: 0.0000056 seconds
[2026-09-02T10:15:27.417-0300][info][safepoint     ] Application time: 0.0004622 seconds
[2026-09-02T10:15:27.417-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:27.417-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:27.417-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000906 seconds, Stopping threads took: 0.0000061 seconds
[2026-09-02T10:15:28.417-0300][info][safepoint     ] Application time: 1.0001257 seconds
[2026-09-02T10:15:28.418-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:28.418-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:28.418-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001579 seconds, Stopping threads took: 0.0000333 seconds
[2026-09-02T10:15:29.418-0300][info][safepoint     ] Application time: 1.0000965 seconds
[2026-09-02T10:15:29.418-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:29.418-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:29.418-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001747 seconds, Stopping threads took: 0.0000299 seconds
[2026-09-02T10:15:30.418-0300][info][safepoint     ] Application time: 1.0000830 seconds
[2026-09-02T10:15:30.418-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:30.418-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:30.418-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001218 seconds, Stopping threads took: 0.0000236 seconds
[2026-09-02T10:15:31.418-0300][info][safepoint     ] Application time: 1.0000800 seconds
[2026-09-02T10:15:31.418-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:31.419-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:31.419-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001518 seconds, Stopping threads took: 0.0000421 seconds
[2026-09-02T10:15:32.419-0300][info][safepoint     ] Application time: 1.0000841 seconds
[2026-09-02T10:15:32.419-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:32.419-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:32.419-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001373 seconds, Stopping threads took: 0.0000222 seconds
[2026-09-02T10:15:33.419-0300][info][safepoint     ] Application time: 1.0000763 seconds
[2026-09-02T10:15:33.419-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:33.419-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:33.419-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001526 seconds, Stopping threads took: 0.0000279 seconds
[2026-09-02T10:15:34.419-0300][info][safepoint     ] Application time: 1.0000781 seconds
[2026-09-02T10:15:34.419-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:34.419-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:34.419-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001378 seconds, Stopping threads took: 0.0000236 seconds
[2026-09-02T10:15:35.419-0300][info][safepoint     ] Application time: 1.0000725 seconds
[2026-09-02T10:15:35.419-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:35.420-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:35.420-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001582 seconds, Stopping threads took: 0.0000238 seconds
[2026-09-02T10:15:36.420-0300][info][safepoint     ] Application time: 1.0000816 seconds
[2026-09-02T10:15:36.420-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:36.420-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:36.420-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001870 seconds, Stopping threads took: 0.0000435 seconds
[2026-09-02T10:15:37.370-0300][info][safepoint     ] Application time: 0.9498707 seconds
[2026-09-02T10:15:37.370-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:37.370-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:37.370-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0006091 seconds, Stopping threads took: 0.0000419 seconds
[2026-09-02T10:15:37.371-0300][info][safepoint     ] Application time: 0.0002057 seconds
[2026-09-02T10:15:37.371-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:37.371-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:37.371-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001125 seconds, Stopping threads took: 0.0000099 seconds
[2026-09-02T10:15:37.372-0300][info][safepoint     ] Application time: 0.0011346 seconds
[2026-09-02T10:15:37.372-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:37.372-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:37.372-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001775 seconds, Stopping threads took: 0.0000344 seconds
[2026-09-02T10:15:37.373-0300][info][safepoint     ] Application time: 0.0005135 seconds
[2026-09-02T10:15:37.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:37.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:37.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001020 seconds, Stopping threads took: 0.0000103 seconds
[2026-09-02T10:15:37.381-0300][info][safepoint     ] Application time: 0.0085006 seconds
[2026-09-02T10:15:37.381-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:37.382-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:37.382-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0005692 seconds, Stopping threads took: 0.0000120 seconds
2026-09-02 10:15:37,306 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@52d81ebe)
2026-09-02 10:15:37,307 INFO  [ora.jdbc] (agroal-11) traceId=6923626C. 
2026-09-02 10:15:37,308 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:15:37,309 INFO  [ora.jdbc] (agroal-11) traceId=6923626C, anoEnabled=true. 
2026-09-02 10:15:37,310 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:15:37,311 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:15:37,312 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:15:37,313 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 6923626C
2026-09-02 10:15:37,314 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:15:37,315 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:15:37,316 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:15:37,317 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:15:37,318 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:15:37,319 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 6923626C
2026-09-02 10:15:37,320 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:15:37,321 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:15:37,322 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:15:37,323 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:15:37,324 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:15:37,325 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 6923626C
2026-09-02 10:15:37,326 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
[2026-09-02T10:15:37.406-0300][info][safepoint     ] Application time: 0.0241657 seconds
[2026-09-02T10:15:37.414-0300][info][safepoint     ] Entering safepoint region: BulkRevokeBias
[2026-09-02T10:15:37.415-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:37.415-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0087828 seconds, Stopping threads took: 0.0076050 seconds
2026-09-02 10:15:37,327 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=b/UcHWiBQqin3E0TXy1Igw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=b/UcHWiBQqin3E0TXy1Igw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-09-02 10:15:37,328 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-09-02 10:15:37,415 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=b/UcHWiBQqin3E0TXy1Igw==)
https://docs.oracle.com/error-help/db/ora-12514/
[2026-09-02T10:15:37.423-0300][info][safepoint     ] Application time: 0.0085131 seconds
[2026-09-02T10:15:37.423-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:37.424-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:37.424-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001648 seconds, Stopping threads took: 0.0000173 seconds
2026-09-02 10:15:37,424 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=b/UcHWiBQqin3E0TXy1Igw==)\nhttps://docs.oracle.com/error-help/db/ora-12514/","pge":"UP"}}]}
[2026-09-02T10:15:37.424-0300][info][safepoint     ] Application time: 0.0008902 seconds
[2026-09-02T10:15:37.424-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:37.425-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:37.425-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001282 seconds, Stopping threads took: 0.0000271 seconds
[2026-09-02T10:15:37.425-0300][info][safepoint     ] Application time: 0.0002543 seconds
[2026-09-02T10:15:37.425-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:37.425-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:37.425-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000715 seconds, Stopping threads took: 0.0000053 seconds
[2026-09-02T10:15:38.425-0300][info][safepoint     ] Application time: 1.0000873 seconds
[2026-09-02T10:15:38.425-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:38.425-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:38.425-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001311 seconds, Stopping threads took: 0.0000284 seconds
[2026-09-02T10:15:39.425-0300][info][safepoint     ] Application time: 1.0000737 seconds
[2026-09-02T10:15:39.425-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:39.425-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:39.425-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001329 seconds, Stopping threads took: 0.0000243 seconds
[2026-09-02T10:15:40.426-0300][info][safepoint     ] Application time: 1.0000777 seconds
[2026-09-02T10:15:40.426-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:40.426-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:40.426-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001406 seconds, Stopping threads took: 0.0000245 seconds
[2026-09-02T10:15:41.426-0300][info][safepoint     ] Application time: 1.0003125 seconds
[2026-09-02T10:15:41.426-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:41.426-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:41.426-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001719 seconds, Stopping threads took: 0.0000522 seconds
[2026-09-02T10:15:42.428-0300][info][safepoint     ] Application time: 1.0017718 seconds
[2026-09-02T10:15:42.428-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:42.435-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:42.435-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0070283 seconds, Stopping threads took: 0.0000213 seconds
[2026-09-02T10:15:43.435-0300][info][safepoint     ] Application time: 1.0000835 seconds
[2026-09-02T10:15:43.435-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:43.435-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:43.435-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001749 seconds, Stopping threads took: 0.0000239 seconds
[2026-09-02T10:15:44.435-0300][info][safepoint     ] Application time: 1.0000938 seconds
[2026-09-02T10:15:44.436-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:44.436-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:44.436-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001431 seconds, Stopping threads took: 0.0000255 seconds
[2026-09-02T10:15:45.001-0300][info][safepoint     ] Application time: 0.5653059 seconds
[2026-09-02T10:15:45.001-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:45.001-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:45.001-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001536 seconds, Stopping threads took: 0.0000236 seconds
[2026-09-02T10:15:46.001-0300][info][safepoint     ] Application time: 1.0000894 seconds
[2026-09-02T10:15:46.001-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:46.001-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:46.001-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001348 seconds, Stopping threads took: 0.0000218 seconds
[2026-09-02T10:15:47.001-0300][info][safepoint     ] Application time: 1.0000595 seconds
[2026-09-02T10:15:47.002-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:47.002-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:47.002-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001344 seconds, Stopping threads took: 0.0000299 seconds
[2026-09-02T10:15:47.371-0300][info][safepoint     ] Application time: 0.3689890 seconds
[2026-09-02T10:15:47.371-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:47.371-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:47.371-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001541 seconds, Stopping threads took: 0.0000201 seconds
[2026-09-02T10:15:47.371-0300][info][safepoint     ] Application time: 0.0001067 seconds
[2026-09-02T10:15:47.371-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:47.371-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:47.371-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000958 seconds, Stopping threads took: 0.0000065 seconds
[2026-09-02T10:15:47.372-0300][info][safepoint     ] Application time: 0.0007732 seconds
[2026-09-02T10:15:47.372-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:47.372-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:47.372-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000976 seconds, Stopping threads took: 0.0000298 seconds
[2026-09-02T10:15:47.372-0300][info][safepoint     ] Application time: 0.0004293 seconds
[2026-09-02T10:15:47.372-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:47.372-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:47.372-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001270 seconds, Stopping threads took: 0.0000355 seconds
[2026-09-02T10:15:47.373-0300][info][safepoint     ] Application time: 0.0000877 seconds
[2026-09-02T10:15:47.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:47.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:47.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000872 seconds, Stopping threads took: 0.0000281 seconds
[2026-09-02T10:15:47.373-0300][info][safepoint     ] Application time: 0.0002090 seconds
[2026-09-02T10:15:47.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:47.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:47.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000816 seconds, Stopping threads took: 0.0000196 seconds
[2026-09-02T10:15:47.374-0300][info][safepoint     ] Application time: 0.0010470 seconds
[2026-09-02T10:15:47.374-0300][info][safepoint     ] Entering safepoint region: ThreadDump
[2026-09-02T10:15:47.375-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:47.375-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0005551 seconds, Stopping threads took: 0.0000070 seconds
2026-09-02 10:15:47,306 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@60b823b9)
2026-09-02 10:15:47,307 INFO  [ora.jdbc] (agroal-11) traceId=26845782. 
2026-09-02 10:15:47,308 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:15:47,309 INFO  [ora.jdbc] (agroal-11) traceId=26845782, anoEnabled=true. 
2026-09-02 10:15:47,310 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:15:47,311 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:15:47,312 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:15:47,313 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 26845782
2026-09-02 10:15:47,314 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:15:47,315 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:15:47,316 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:15:47,317 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:15:47,318 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:15:47,319 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 26845782
2026-09-02 10:15:47,320 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:15:47,321 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:15:47,322 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:15:47,323 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:15:47,324 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:15:47,325 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 26845782
2026-09-02 10:15:47,326 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:15:47,327 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=b1bMYa+vTZul1YKhl8vksQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=b1bMYa+vTZul1YKhl8vksQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-09-02 10:15:47,328 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-09-02 10:15:47,393 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=b1bMYa+vTZul1YKhl8vksQ==)
https://docs.oracle.com/error-help/db/ora-12514/
[2026-09-02T10:15:47.395-0300][info][safepoint     ] Application time: 0.0202211 seconds
[2026-09-02T10:15:47.395-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:47.395-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:47.395-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001457 seconds, Stopping threads took: 0.0000206 seconds
2026-09-02 10:15:47,395 INFO  [io.sma.health] (executor-thread-15) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=b1bMYa+vTZul1YKhl8vksQ==)\nhttps://docs.oracle.com/error-help/db/ora-12514/","pge":"UP"}}]}
[2026-09-02T10:15:47.395-0300][info][safepoint     ] Application time: 0.0004176 seconds
[2026-09-02T10:15:47.395-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:47.396-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:47.396-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001191 seconds, Stopping threads took: 0.0000411 seconds
[2026-09-02T10:15:47.396-0300][info][safepoint     ] Application time: 0.0002855 seconds
[2026-09-02T10:15:47.396-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:47.396-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:47.396-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000732 seconds, Stopping threads took: 0.0000057 seconds
[2026-09-02T10:15:48.396-0300][info][safepoint     ] Application time: 1.0000846 seconds
[2026-09-02T10:15:48.396-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:48.396-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:48.396-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001508 seconds, Stopping threads took: 0.0000233 seconds
[2026-09-02T10:15:49.396-0300][info][safepoint     ] Application time: 1.0000866 seconds
[2026-09-02T10:15:49.396-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:49.396-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:49.396-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001628 seconds, Stopping threads took: 0.0000257 seconds
[2026-09-02T10:15:50.397-0300][info][safepoint     ] Application time: 1.0001038 seconds
[2026-09-02T10:15:50.397-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:50.397-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:50.397-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001515 seconds, Stopping threads took: 0.0000246 seconds
[2026-09-02T10:15:51.397-0300][info][safepoint     ] Application time: 1.0000976 seconds
[2026-09-02T10:15:51.397-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:51.397-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:51.397-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001686 seconds, Stopping threads took: 0.0000438 seconds
[2026-09-02T10:15:52.397-0300][info][safepoint     ] Application time: 1.0001080 seconds
[2026-09-02T10:15:52.397-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:52.397-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:52.397-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001436 seconds, Stopping threads took: 0.0000267 seconds
[2026-09-02T10:15:53.397-0300][info][safepoint     ] Application time: 1.0001058 seconds
[2026-09-02T10:15:53.398-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:53.398-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:53.398-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001699 seconds, Stopping threads took: 0.0000261 seconds
[2026-09-02T10:15:54.398-0300][info][safepoint     ] Application time: 1.0000858 seconds
[2026-09-02T10:15:54.398-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:54.398-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:54.398-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001335 seconds, Stopping threads took: 0.0000231 seconds
[2026-09-02T10:15:55.398-0300][info][safepoint     ] Application time: 1.0000714 seconds
[2026-09-02T10:15:55.398-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:55.398-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:55.398-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001596 seconds, Stopping threads took: 0.0000234 seconds
[2026-09-02T10:15:56.398-0300][info][safepoint     ] Application time: 1.0000750 seconds
[2026-09-02T10:15:56.398-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:56.399-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:56.399-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001295 seconds, Stopping threads took: 0.0000248 seconds
[2026-09-02T10:15:57.370-0300][info][safepoint     ] Application time: 0.9718159 seconds
[2026-09-02T10:15:57.370-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:57.371-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:57.371-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002014 seconds, Stopping threads took: 0.0000459 seconds
[2026-09-02T10:15:57.371-0300][info][safepoint     ] Application time: 0.0001293 seconds
[2026-09-02T10:15:57.371-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:57.371-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:57.371-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001065 seconds, Stopping threads took: 0.0000319 seconds
[2026-09-02T10:15:57.372-0300][info][safepoint     ] Application time: 0.0008880 seconds
[2026-09-02T10:15:57.372-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:57.372-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:57.372-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001100 seconds, Stopping threads took: 0.0000285 seconds
[2026-09-02T10:15:57.372-0300][info][safepoint     ] Application time: 0.0004782 seconds
[2026-09-02T10:15:57.372-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:57.372-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:57.372-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000877 seconds, Stopping threads took: 0.0000091 seconds
[2026-09-02T10:15:57.373-0300][info][safepoint     ] Application time: 0.0001150 seconds
[2026-09-02T10:15:57.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:57.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:57.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001615 seconds, Stopping threads took: 0.0000560 seconds
[2026-09-02T10:15:57.373-0300][info][safepoint     ] Application time: 0.0001249 seconds
[2026-09-02T10:15:57.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:57.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:57.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001020 seconds, Stopping threads took: 0.0000264 seconds
[2026-09-02T10:15:57.374-0300][info][safepoint     ] Application time: 0.0011361 seconds
[2026-09-02T10:15:57.374-0300][info][safepoint     ] Entering safepoint region: ThreadDump
[2026-09-02T10:15:57.375-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:57.375-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0006238 seconds, Stopping threads took: 0.0000127 seconds
2026-09-02 10:15:57,306 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@56d3a300)
2026-09-02 10:15:57,307 INFO  [ora.jdbc] (agroal-11) traceId=4AC0536F. 
2026-09-02 10:15:57,308 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:15:57,309 INFO  [ora.jdbc] (agroal-11) traceId=4AC0536F, anoEnabled=true. 
2026-09-02 10:15:57,310 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:15:57,311 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:15:57,312 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:15:57,313 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 4AC0536F
2026-09-02 10:15:57,314 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:15:57,315 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:15:57,316 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:15:57,317 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:15:57,318 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:15:57,319 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 4AC0536F
2026-09-02 10:15:57,320 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:15:57,321 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:15:57,322 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:15:57,323 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:15:57,324 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:15:57,325 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 4AC0536F
2026-09-02 10:15:57,326 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:15:57,327 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=p2jlv/BTTpuAaE2oLepDYQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=p2jlv/BTTpuAaE2oLepDYQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-09-02 10:15:57,328 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-09-02 10:15:57,389 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=p2jlv/BTTpuAaE2oLepDYQ==)
https://docs.oracle.com/error-help/db/ora-12514/
[2026-09-02T10:15:57.391-0300][info][safepoint     ] Application time: 0.0163841 seconds
[2026-09-02T10:15:57.391-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:57.391-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:57.391-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001528 seconds, Stopping threads took: 0.0000158 seconds
2026-09-02 10:15:57,391 INFO  [io.sma.health] (executor-thread-15) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=p2jlv/BTTpuAaE2oLepDYQ==)\nhttps://docs.oracle.com/error-help/db/ora-12514/","pge":"UP"}}]}
[2026-09-02T10:15:57.392-0300][info][safepoint     ] Application time: 0.0004018 seconds
[2026-09-02T10:15:57.392-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:57.392-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:57.392-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001180 seconds, Stopping threads took: 0.0000401 seconds
[2026-09-02T10:15:57.392-0300][info][safepoint     ] Application time: 0.0003508 seconds
[2026-09-02T10:15:57.392-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:15:57.392-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:57.392-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000636 seconds, Stopping threads took: 0.0000060 seconds
[2026-09-02T10:15:58.392-0300][info][safepoint     ] Application time: 1.0001060 seconds
[2026-09-02T10:15:58.392-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:58.393-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:58.393-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001410 seconds, Stopping threads took: 0.0000262 seconds
[2026-09-02T10:15:59.393-0300][info][safepoint     ] Application time: 1.0001019 seconds
[2026-09-02T10:15:59.393-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:15:59.393-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:15:59.393-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001593 seconds, Stopping threads took: 0.0000263 seconds
[2026-09-02T10:16:00.393-0300][info][safepoint     ] Application time: 1.0000725 seconds
[2026-09-02T10:16:00.393-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:16:00.393-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:16:00.393-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001479 seconds, Stopping threads took: 0.0000292 seconds
[2026-09-02T10:16:01.393-0300][info][safepoint     ] Application time: 1.0001070 seconds
[2026-09-02T10:16:01.393-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:16:01.393-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:16:01.393-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001569 seconds, Stopping threads took: 0.0000246 seconds
[2026-09-02T10:16:02.394-0300][info][safepoint     ] Application time: 1.0001123 seconds
[2026-09-02T10:16:02.394-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:16:02.394-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:16:02.394-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0002036 seconds, Stopping threads took: 0.0000579 seconds
[2026-09-02T10:16:03.394-0300][info][safepoint     ] Application time: 1.0001110 seconds
[2026-09-02T10:16:03.394-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:16:03.394-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:16:03.394-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001630 seconds, Stopping threads took: 0.0000253 seconds
[2026-09-02T10:16:04.394-0300][info][safepoint     ] Application time: 1.0001102 seconds
[2026-09-02T10:16:04.394-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:16:04.394-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:16:04.394-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001467 seconds, Stopping threads took: 0.0000252 seconds
[2026-09-02T10:16:05.395-0300][info][safepoint     ] Application time: 1.0001598 seconds
[2026-09-02T10:16:05.395-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:16:05.395-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:16:05.395-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001219 seconds, Stopping threads took: 0.0000235 seconds
[2026-09-02T10:16:06.395-0300][info][safepoint     ] Application time: 1.0001041 seconds
[2026-09-02T10:16:06.395-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:16:06.395-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:16:06.395-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001855 seconds, Stopping threads took: 0.0000247 seconds
[2026-09-02T10:16:07.370-0300][info][safepoint     ] Application time: 0.9751605 seconds
[2026-09-02T10:16:07.370-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:16:07.370-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:16:07.370-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001891 seconds, Stopping threads took: 0.0000388 seconds
[2026-09-02T10:16:07.371-0300][info][safepoint     ] Application time: 0.0001224 seconds
[2026-09-02T10:16:07.371-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:16:07.371-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:16:07.371-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001588 seconds, Stopping threads took: 0.0000758 seconds
[2026-09-02T10:16:07.371-0300][info][safepoint     ] Application time: 0.0000674 seconds
[2026-09-02T10:16:07.371-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:16:07.371-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:16:07.371-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000774 seconds, Stopping threads took: 0.0000066 seconds
[2026-09-02T10:16:07.372-0300][info][safepoint     ] Application time: 0.0008441 seconds
[2026-09-02T10:16:07.372-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:16:07.372-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:16:07.372-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000977 seconds, Stopping threads took: 0.0000065 seconds
[2026-09-02T10:16:07.372-0300][info][safepoint     ] Application time: 0.0004887 seconds
[2026-09-02T10:16:07.372-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:16:07.372-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:16:07.372-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001620 seconds, Stopping threads took: 0.0000673 seconds
[2026-09-02T10:16:07.373-0300][info][safepoint     ] Application time: 0.0001111 seconds
[2026-09-02T10:16:07.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:16:07.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:16:07.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001314 seconds, Stopping threads took: 0.0000505 seconds
[2026-09-02T10:16:07.373-0300][info][safepoint     ] Application time: 0.0001952 seconds
[2026-09-02T10:16:07.373-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:16:07.373-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:16:07.373-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0004455 seconds, Stopping threads took: 0.0003756 seconds
[2026-09-02T10:16:07.374-0300][info][safepoint     ] Application time: 0.0010794 seconds
[2026-09-02T10:16:07.374-0300][info][safepoint     ] Entering safepoint region: ThreadDump
[2026-09-02T10:16:07.375-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:16:07.375-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0005654 seconds, Stopping threads took: 0.0000069 seconds
2026-09-02 10:16:07,306 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@bfebe4b)
2026-09-02 10:16:07,307 INFO  [ora.jdbc] (agroal-11) traceId=58F79C0. 
2026-09-02 10:16:07,308 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:16:07,309 INFO  [ora.jdbc] (agroal-11) traceId=58F79C0, anoEnabled=true. 
2026-09-02 10:16:07,310 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:16:07,311 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:16:07,312 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:16:07,313 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 58F79C0
2026-09-02 10:16:07,314 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:16:07,315 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:16:07,316 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:16:07,317 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:16:07,318 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:16:07,319 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 58F79C0
2026-09-02 10:16:07,320 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:16:07,321 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-09-02 10:16:07,322 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-09-02 10:16:07,323 FINEST [ora.jdbc] (agroal-11) 290 bytes written to the Socket.
2026-09-02 10:16:07,324 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-09-02 10:16:07,325 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 58F79C0
2026-09-02 10:16:07,326 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-09-02 10:16:07,327 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=+cqy/+6AQMSIqL3dIQChYw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=+cqy/+6AQMSIqL3dIQChYw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-09-02 10:16:07,328 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-09-02 10:16:07,398 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=+cqy/+6AQMSIqL3dIQChYw==)
https://docs.oracle.com/error-help/db/ora-12514/
[2026-09-02T10:16:07.400-0300][info][safepoint     ] Application time: 0.0251727 seconds
[2026-09-02T10:16:07.400-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:16:07.400-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:16:07.400-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001566 seconds, Stopping threads took: 0.0000468 seconds
2026-09-02 10:16:07,401 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=+cqy/+6AQMSIqL3dIQChYw==)\nhttps://docs.oracle.com/error-help/db/ora-12514/","pge":"UP"}}]}
[2026-09-02T10:16:07.401-0300][info][safepoint     ] Application time: 0.0004699 seconds
[2026-09-02T10:16:07.401-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:16:07.401-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:16:07.401-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0000955 seconds, Stopping threads took: 0.0000055 seconds
[2026-09-02T10:16:07.401-0300][info][safepoint     ] Application time: 0.0003117 seconds
[2026-09-02T10:16:07.401-0300][info][safepoint     ] Entering safepoint region: RevokeBias
[2026-09-02T10:16:07.401-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:16:07.401-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001228 seconds, Stopping threads took: 0.0000323 seconds
[2026-09-02T10:16:08.402-0300][info][safepoint     ] Application time: 1.0001160 seconds
[2026-09-02T10:16:08.402-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:16:08.402-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:16:08.402-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001426 seconds, Stopping threads took: 0.0000255 seconds
[2026-09-02T10:16:09.402-0300][info][safepoint     ] Application time: 1.0000906 seconds
[2026-09-02T10:16:09.402-0300][info][safepoint     ] Entering safepoint region: Cleanup
[2026-09-02T10:16:09.402-0300][info][safepoint     ] Leaving safepoint region
[2026-09-02T10:16:09.402-0300][info][safepoint     ] Total time for which application threads were stopped: 0.0001444 seconds, Stopping threads took: 0.0000292 seconds
