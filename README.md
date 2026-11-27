h-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc cancel-build siavl-atddigital-frontend-126
build.build.openshift.io/siavl-atddigital-frontend-126 marked for cancellation, waiting to be cancelled
error: build build-images-ads/siavl-atddigital-frontend-126 failed to cancel: builds.build.openshift.io "siavl-atddigital-frontend-126" not found
error: failure during the build cancellation
-sh-4.2$ oc get build -l buildconfig=siavl-atddigital-frontend | grep -E 'Running|New'   # deve voltar vazio
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod -l openshift.io/build.name -o wide | grep cadnpcldlx1180
sifep-chamamento-frontend-273-build                0/1     Completed   0          18h     25.2.31.248   cadnpcldlx1180   <none>           <none>
sigsj-backend-apoio-15-build                       0/1     Init:0/2    2          19h     25.2.31.231   cadnpcldlx1180   <none>           <none>
sipdi-api-bff-tipo-investimento-8-build            0/1     Init:0/2    0          20h     25.2.31.238   cadnpcldlx1180   <none>           <none>
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -A -o wide --field-selector spec.nodeName=cadnpcldlx1180 | grep -Ev 'Running|Completed'
NAMESPACE                                NAME                                                        READY   STATUS                        RESTARTS        AGE     IP              NODE             NOMINATED NODE   READINESS GATES
ads-agents-qa                            qa-agentes-ads-57b855c4c4-9rgj8                             0/1     Error                         0               42h     25.2.31.72      cadnpcldlx1180   <none>           <none>
ads-agents-qa                            qa-agentes-ads-57b855c4c4-gxm4k                             0/1     ContainerStatusUnknown        1               3d20h   25.2.30.11      cadnpcldlx1180   <none>           <none>
ads-agents-qa                            qa-agentes-ads-57b855c4c4-jt27m                             0/1     ContainerStatusUnknown        0               20h     25.2.31.228     cadnpcldlx1180   <none>           <none>
ads-agents-qa                            qa-agentes-ads-57b855c4c4-sbj7s                             0/1     ContainerStatusUnknown        1               46h     25.2.31.28      cadnpcldlx1180   <none>           <none>
ads-agents-qa                            qa-agentes-ads-57b855c4c4-tpm5v                             0/1     ContainerStatusUnknown        1               3d21h   25.2.31.196     cadnpcldlx1180   <none>           <none>
ads-agents-qa                            qa-agentes-ads-57b855c4c4-xp7lz                             0/1     ContainerStatusUnknown        1               42h     25.2.31.78      cadnpcldlx1180   <none>           <none>
ads-agents                               agent-qa-azd-167-8l8t2                                      0/2     ContainerStatusUnknown        2               41h     25.2.31.111     cadnpcldlx1180   <none>           <none>
automacoes-producao                      pre-api-observatorio-6675d96c9f-4kbvc                       0/1     ContainerStatusUnknown        1               2d9h    25.2.30.217     cadnpcldlx1180   <none>           <none>
build-images-ads                         sigsj-backend-apoio-15-build                                0/1     Init:0/2                      2               19h     25.2.31.231     cadnpcldlx1180   <none>           <none>
build-images-ads                         sipdi-api-bff-tipo-investimento-8-build                     0/1     Init:0/2                      0               20h     25.2.31.238     cadnpcldlx1180   <none>           <none>
cesti36                                  jobapprove-29927055-q4gh7                                   0/1     ContainerStatusUnknown        0               42h     25.2.31.67      cadnpcldlx1180   <none>           <none>
cesti36                                  jobremove-29918055-2k7sp                                    0/1     ContainerStatusUnknown        0               2d4h    25.2.30.239     cadnpcldlx1180   <none>           <none>
cesti36                                  jobremove-29918055-86zvp                                    0/1     ContainerStatusUnknown        0               2d20h   25.2.31.253     cadnpcldlx1180   <none>           <none>
cesti36                                  jobremove-29918055-jrzcx                                    0/1     ContainerStatusUnknown        0               42h     25.2.31.65      cadnpcldlx1180   <none>           <none>
cesti36                                  jobstatusnode-29918580-5qqhm                                0/1     ContainerStatusUnknown        0               2d20h   25.2.31.254     cadnpcldlx1180   <none>           <none>
cesti36                                  jobstatusnode-29918580-xflg7                                0/1     ContainerStatusUnknown        0               2d4h    25.2.30.240     cadnpcldlx1180   <none>           <none>
cesti36                                  jobstatusnode-test-29919120-45pbq                           0/1     ContainerStatusUnknown        0               2d20h   25.2.30.2       cadnpcldlx1180   <none>           <none>
cesti36                                  jobstatusnode-test-29919120-cvzhd                           0/1     ContainerStatusUnknown        0               2d4h    25.2.30.241     cadnpcldlx1180   <none>           <none>
monitor-ads-stack                        prometheus-7776b9dc9-ct9cz                                  0/1     ContainerStatusUnknown        4 (42h ago)     42h     25.2.31.73      cadnpcldlx1180   <none>           <none>
monitoracao-esteiras                     opensearch-operator-controller-manager-75585f5b66-z68sn     0/2     ContainerStatusUnknown        162 (42h ago)   2d4h    25.2.30.243     cadnpcldlx1180   <none>           <none>
quay                                     quay-registry-clair-app-7586d959fb-czbf6                    0/1     Error                         4 (42h ago)     42h     25.2.31.75      cadnpcldlx1180   <none>           <none>
quay                                     quay-registry-clair-app-7586d959fb-g4ckn                    0/1     ContainerStatusUnknown        50 (19h ago)    25h     25.2.31.150     cadnpcldlx1180   <none>           <none>
quay                                     quay-registry-quay-app-56c8498676-72srs                     0/1     CrashLoopBackOff              58 (85s ago)    4h27m   25.2.31.249     cadnpcldlx1180   <none>           <none>
quay                                     quay-registry-quay-app-56c8498676-s4vfl                     0/1     ContainerStatusUnknown        3 (42h ago)     42h     25.2.31.71      cadnpcldlx1180   <none>           <none>
quay                                     quay-registry-quay-mirror-56649d6759-x5pkp                  0/1     Init:ContainerStatusUnknown   420 (42h ago)   3d21h   25.2.31.135     cadnpcldlx1180   <none>           <none>
-sh-4.2$ oc describe node cadnpcldlx1180 | grep -A8 Conditions
Conditions:
  Type             Status  LastHeartbeatTime                 LastTransitionTime                Reason                       Message
  ----             ------  -----------------                 ------------------                ------                       -------
  MemoryPressure   False   Fri, 27 Nov 2026 11:29:44 -0300   Tue, 27 Oct 2026 15:41:52 -0300   KubeletHasSufficientMemory   kubelet has sufficient memory available
  DiskPressure     False   Fri, 27 Nov 2026 11:29:44 -0300   Thu, 26 Nov 2026 17:22:51 -0300   KubeletHasNoDiskPressure     kubelet has no disk pressure
  PIDPressure      False   Fri, 27 Nov 2026 11:29:44 -0300   Tue, 27 Oct 2026 15:41:52 -0300   KubeletHasSufficientPID      kubelet has sufficient PID available
  Ready            True    Fri, 27 Nov 2026 11:29:44 -0300   Tue, 27 Oct 2026 15:42:12 -0300   KubeletReady                 kubelet is posting ready status
Addresses:
  InternalIP:  10.121.105.95
-sh-4.2$
-sh-4.2$
-sh-4.2$
