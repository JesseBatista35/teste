Os eventos do Kubernetes são notificações em tempo real que fornecem insights sobre ações e alterações que ocorrem em um cluster do Kubernetes, ajudando você a monitorar e solucionar problemas de integridade e comportamento de seus aplicativos. Saiba mais
Solucionar problemas evento de aviso PreemptScheduled
Solucionar problemas evento de aviso VMEventScheduled
Solucionar problemas evento de aviso SpotEvictionIncoming
Solucionar problemas evento de aviso ErrAzureVault

Para clusters com um grande volume de eventos, Logs do contêiner facilita a exibição e a análise dos logs.
Search for message...
Mostrando os primeiros 230 eventos (do Log Analytics)
Liveness probe failed: Get "http://192.168.11.20:8080/healthz/live": context deadline exceeded (Client.Timeout exceeded while awaiting headers)
Warning
Unhealthy
kubelet, aks-appssibko-28871677-vmss0000so
Pod/sibko-pos-venda-process-des-6f6658dc9d-9jlqv
sibko-pos-venda-process
11
2026-08-06T20:34:34Z
Liveness probe failed: Get "http://192.168.11.20:8080/healthz/live": context deadline exceeded (Client.Timeout exceeded while awaiting headers)
Warning
Unhealthy
kubelet, aks-appssibko-28871677-vmss0000so
Pod/sibko-pos-venda-process-des-6f6658dc9d-9jlqv
sibko-pos-venda-process
12
2026-08-06T20:44:34Z
0/19 nodes are available: 19 node(s) had untolerated taint(s). no new claims to deallocate, preemption: 0/19 nodes are available: 19 Preemption is not helpful for scheduling.
Warning
FailedScheduling
Pod/sibko-originacao-digital-cron-des-86457f576-vs6zf
sibko-originacao-digital-cron
-
2026-08-06T20:33:43Z
Liveness probe failed: Get "http://192.168.12.12:8080/healthz/live": context deadline exceeded (Client.Timeout exceeded while awaiting headers)
Warning
Unhealthy
kubelet, aks-appssidgc-20779849-vmss0000oo
Pod/sidgc-registro-eletronico-cron-des-56757b998f-qnj6r
sidgc-registro-eletronico-cron
2
2026-08-06T20:31:11Z
Liveness probe failed: Get "http://192.168.12.12:8080/healthz/live": context deadline exceeded (Client.Timeout exceeded while awaiting headers)
Warning
Unhealthy
kubelet, aks-appssidgc-20779849-vmss0000oo
Pod/sidgc-registro-eletronico-cron-des-56757b998f-qnj6r
sidgc-registro-eletronico-cron
1
2026-08-06T20:30:41Z
0/19 nodes are available: 19 node(s) had untolerated taint(s). no new claims to deallocate, preemption: 0/19 nodes are available: 19 Preemption is not helpful for scheduling.
Warning
FailedScheduling
Pod/sibko-originacao-digital-cron-des-86457f576-vs6zf
sibko-originacao-digital-cron
-
2026-08-06T20:28:43Z
Liveness probe failed: Get "http://192.168.12.13:8080/healthz/live": context deadline exceeded (Client.Timeout exceeded while awaiting headers)
Warning
Unhealthy
kubelet, aks-appssidgc-20779849-vmss0000oo
Pod/sidgc-registro-eletronico-cron-tqs-55dcf669b9-vmbtv
sidgc-registro-eletronico-cron-tqs
1
2026-08-06T20:27:26Z
Liveness probe failed:
Warning
Unhealthy
kubelet, aks-appssidgc-20779849-vmss0000op
Pod/ama-logs-499vl
kube-system
3
2026-08-06T20:28:51Z
Liveness probe failed:
Warning
Unhealthy
kubelet, aks-appssidgc-20779849-vmss0000op
Pod/ama-logs-499vl
kube-system
1
2026-08-06T20:26:51Z
Liveness probe failed:
Warning
Unhealthy
kubelet, aks-appssidgc-20779849-vmss0000op
Pod/ama-logs-499vl
kube-system
2
2026-08-06T20:27:51Z
Liveness probe failed: HTTP probe failed with statuscode: 503
Warning
Unhealthy
kubelet, aks-appssidgc-20779849-vmss0000op
Pod/ama-metrics-node-bw2nt
kube-system
3
2026-08-06T20:26:27Z
Failed to create pod sandbox: rpc error: code = Unknown desc = failed to setup network for sandbox "23c2fc9e06001258cccfd088d36a694a820d4df102e2fba6dd12df75afa80f70": plugin type="portmap" failed (add): unable to setup DNAT: running [/usr/sbin/iptables -t nat -C CNI-DN-0bc940f2bfdf8143c9030 -p tcp --dport 28330 -s 192.168.26.6/24 -j KUBE-MARK-MASQ --wait]: exit status 2: iptables v1.8.10 (nf_tables): Chain 'KUBE-MARK-MASQ' does not exist Try `iptables -h' or 'iptables --help' for more information.
Warning
FailedCreatePodSandBox
kubelet, aks-appssidgc-20779849-vmss0000op
Pod/ama-logs-499vl
kube-system
1
2026-08-06T20:24:29Z
Failed to create pod sandbox: rpc error: code = Unknown desc = failed to setup network for sandbox "2f6651e962f96d6a10ae7a12b15620250156f824071dc49ce0033585f6678597": plugin type="portmap" failed (add): unable to setup DNAT: running [/usr/sbin/iptables -t nat -C CNI-DN-4e5ba300d82d8d22b1772 -p tcp --dport 28330 -s 192.168.26.2/24 -j KUBE-MARK-MASQ --wait]: exit status 2: iptables v1.8.10 (nf_tables): Chain 'KUBE-MARK-MASQ' does not exist Try `iptables -h' or 'iptables --help' for more information.
Warning
FailedCreatePodSandBox
kubelet, aks-appssidgc-20779849-vmss0000op
Pod/ama-logs-499vl
kube-system
1
2026-08-06T20:24:15Z
failed to get cpu utilization: did not receive metrics for targeted pods (pods might be unready)
Warning
FailedGetResourceMetric
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-asyncapi-tqs
sidgc-registro-eletronico-asyncapi
8
2026-08-06T20:23:48Z
failed to get cpu utilization: did not receive metrics for targeted pods (pods might be unready)
Warning
FailedGetResourceMetric
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-asyncapi-tqs
sidgc-registro-eletronico-asyncapi
9
2026-08-06T20:24:03Z
failed to get cpu utilization: did not receive metrics for targeted pods (pods might be unready)
Warning
FailedGetResourceMetric
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-api-des
sidgc-registro-eletronico-api
8
2026-08-06T20:23:45Z
failed to get cpu utilization: did not receive metrics for targeted pods (pods might be unready)
Warning
FailedGetResourceMetric
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-api-tqs
sidgc-registro-eletronico-api
8
2026-08-06T20:23:45Z
failed to get cpu utilization: did not receive metrics for targeted pods (pods might be unready)
Warning
FailedGetResourceMetric
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-asyncapi-des
sidgc-registro-eletronico-asyncapi
8
2026-08-06T20:23:45Z
failed to get cpu utilization: did not receive metrics for targeted pods (pods might be unready)
Warning
FailedGetResourceMetric
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-api-des
sidgc-registro-eletronico-api
9
2026-08-06T20:24:00Z
(excluído) Node is not ready
Warning
NodeNotReady
node-controller
(excluído) Pod/ama-metrics-node-vshbl
kube-system
1
2026-08-06T20:23:30Z
(excluído) Node is not ready
Warning
NodeNotReady
node-controller
(excluído) Pod/csi-azuredisk-node-4cssn
kube-system
1
2026-08-06T20:23:30Z
failed to get cpu utilization: did not receive metrics for targeted pods (pods might be unready)
Warning
FailedGetResourceMetric
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-asyncapi-des
sidgc-registro-eletronico-asyncapi
9
2026-08-06T20:24:00Z
failed to get cpu utilization: did not receive metrics for targeted pods (pods might be unready)
Warning
FailedGetResourceMetric
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-api-tqs
sidgc-registro-eletronico-api
9
2026-08-06T20:24:00Z
(excluído) Node is not ready
Warning
NodeNotReady
node-controller
(excluído) Pod/retina-agent-dfv8h
kube-system
1
2026-08-06T20:23:29Z
(excluído) Node is not ready
Warning
NodeNotReady
node-controller
(excluído) Pod/aks-secrets-store-csi-driver-92tdn
kube-system
1
2026-08-06T20:23:29Z
(excluído) Node is not ready
Warning
NodeNotReady
node-controller
(excluído) Pod/aks-secrets-store-provider-azure-9bvqg
kube-system
1
2026-08-06T20:23:29Z
(excluído) Node is not ready
Warning
NodeNotReady
node-controller
(excluído) Pod/ama-logs-97nvv
kube-system
1
2026-08-06T20:23:29Z
(excluído) Node is not ready
Warning
NodeNotReady
node-controller
(excluído) Pod/azure-ip-masq-agent-vkbxg
kube-system
1
2026-08-06T20:23:29Z
(excluído) Node is not ready
Warning
NodeNotReady
node-controller
(excluído) Pod/cloud-node-manager-lmqnr
kube-system
1
2026-08-06T20:23:29Z
(excluído) Node is not ready
Warning
NodeNotReady
node-controller
(excluído) Pod/csi-azurefile-node-2lp98
kube-system
1
2026-08-06T20:23:29Z
(excluído) Node is not ready
Warning
NodeNotReady
node-controller
(excluído) Pod/retina-agent-dfv8h
kube-system
1
2026-08-06T20:23:29Z
(excluído) Node is not ready
Warning
NodeNotReady
node-controller
(excluído) Pod/kube-proxy-vbc2z
kube-system
1
2026-08-06T20:23:29Z
(excluído) Node is not ready
Warning
NodeNotReady
node-controller
(excluído) Pod/azure-ip-masq-agent-vkbxg
kube-system
1
2026-08-06T20:23:29Z
Readiness probe failed: Get "http://192.168.12.13:8080/healthz/ready": context deadline exceeded (Client.Timeout exceeded while awaiting headers)
Warning
Unhealthy
kubelet, aks-appssidgc-20779849-vmss0000oo
Pod/sidgc-registro-eletronico-cron-tqs-55dcf669b9-vmbtv
sidgc-registro-eletronico-cron-tqs
1
2026-08-06T20:22:37Z
invalid metrics (2 invalid out of 2), first error is: failed to get cpu resource metric value: failed to get cpu utilization: unable to get metrics for resource cpu: no metrics returned from resource metrics API
Warning
FailedComputeMetricsReplicas
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-asyncapi-tqs
sidgc-registro-eletronico-asyncapi
14
2026-08-06T20:23:18Z
failed to get memory utilization: unable to get metrics for resource memory: no metrics returned from resource metrics API
Warning
FailedGetResourceMetric
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-asyncapi-tqs
sidgc-registro-eletronico-asyncapi
12
2026-08-06T20:22:48Z
invalid metrics (2 invalid out of 2), first error is: failed to get cpu resource metric value: failed to get cpu utilization: unable to get metrics for resource cpu: no metrics returned from resource metrics API
Warning
FailedComputeMetricsReplicas
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-asyncapi-tqs
sidgc-registro-eletronico-asyncapi
12
2026-08-06T20:22:48Z
failed to get memory utilization: unable to get metrics for resource memory: no metrics returned from resource metrics API
Warning
FailedGetResourceMetric
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-asyncapi-tqs
sidgc-registro-eletronico-asyncapi
14
2026-08-06T20:23:18Z
failed to get cpu utilization: unable to get metrics for resource cpu: no metrics returned from resource metrics API
Warning
FailedGetResourceMetric
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-asyncapi-tqs
sidgc-registro-eletronico-asyncapi
14
2026-08-06T20:23:18Z
failed to get cpu utilization: unable to get metrics for resource cpu: no metrics returned from resource metrics API
Warning
FailedGetResourceMetric
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-asyncapi-tqs
sidgc-registro-eletronico-asyncapi
12
2026-08-06T20:22:48Z
failed to get memory utilization: unable to get metrics for resource memory: no metrics returned from resource metrics API
Warning
FailedGetResourceMetric
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-asyncapi-des
sidgc-registro-eletronico-asyncapi
12
2026-08-06T20:22:45Z
failed to get cpu utilization: unable to get metrics for resource cpu: no metrics returned from resource metrics API
Warning
FailedGetResourceMetric
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-api-tqs
sidgc-registro-eletronico-api
12
2026-08-06T20:22:45Z
invalid metrics (2 invalid out of 2), first error is: failed to get cpu resource metric value: failed to get cpu utilization: unable to get metrics for resource cpu: no metrics returned from resource metrics API
Warning
FailedComputeMetricsReplicas
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-api-des
sidgc-registro-eletronico-api
12
2026-08-06T20:22:45Z
failed to get memory utilization: unable to get metrics for resource memory: no metrics returned from resource metrics API
Warning
FailedGetResourceMetric
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-api-des
sidgc-registro-eletronico-api
12
2026-08-06T20:22:45Z
invalid metrics (2 invalid out of 2), first error is: failed to get cpu resource metric value: failed to get cpu utilization: unable to get metrics for resource cpu: no metrics returned from resource metrics API
Warning
FailedComputeMetricsReplicas
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-api-tqs
sidgc-registro-eletronico-api
12
2026-08-06T20:22:45Z
failed to get cpu utilization: unable to get metrics for resource cpu: no metrics returned from resource metrics API
Warning
FailedGetResourceMetric
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-api-des
sidgc-registro-eletronico-api
12
2026-08-06T20:22:45Z
failed to get cpu utilization: unable to get metrics for resource cpu: no metrics returned from resource metrics API
Warning
FailedGetResourceMetric
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-asyncapi-des
sidgc-registro-eletronico-asyncapi
12
2026-08-06T20:22:45Z
failed to get cpu utilization: unable to get metrics for resource cpu: no metrics returned from resource metrics API
Warning
FailedGetResourceMetric
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-api-tqs
sidgc-registro-eletronico-api
14
2026-08-06T20:23:15Z
invalid metrics (2 invalid out of 2), first error is: failed to get cpu resource metric value: failed to get cpu utilization: unable to get metrics for resource cpu: no metrics returned from resource metrics API
Warning
FailedComputeMetricsReplicas
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-api-des
sidgc-registro-eletronico-api
14
2026-08-06T20:23:15Z
failed to get cpu utilization: unable to get metrics for resource cpu: no metrics returned from resource metrics API
Warning
FailedGetResourceMetric
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-api-des
sidgc-registro-eletronico-api
14
2026-08-06T20:23:15Z
failed to get memory utilization: unable to get metrics for resource memory: no metrics returned from resource metrics API
Warning
FailedGetResourceMetric
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-api-tqs
sidgc-registro-eletronico-api
12
2026-08-06T20:22:45Z
invalid metrics (2 invalid out of 2), first error is: failed to get cpu resource metric value: failed to get cpu utilization: unable to get metrics for resource cpu: no metrics returned from resource metrics API
Warning
FailedComputeMetricsReplicas
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-asyncapi-des
sidgc-registro-eletronico-asyncapi
12
2026-08-06T20:22:45Z
failed to get memory utilization: unable to get metrics for resource memory: no metrics returned from resource metrics API
Warning
FailedGetResourceMetric
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-api-des
sidgc-registro-eletronico-api
14
2026-08-06T20:23:15Z
invalid metrics (2 invalid out of 2), first error is: failed to get cpu resource metric value: failed to get cpu utilization: unable to get metrics for resource cpu: no metrics returned from resource metrics API
Warning
FailedComputeMetricsReplicas
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-asyncapi-des
sidgc-registro-eletronico-asyncapi
14
2026-08-06T20:23:15Z
failed to get memory utilization: unable to get metrics for resource memory: no metrics returned from resource metrics API
Warning
FailedGetResourceMetric
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-asyncapi-des
sidgc-registro-eletronico-asyncapi
14
2026-08-06T20:23:15Z
failed to get cpu utilization: unable to get metrics for resource cpu: no metrics returned from resource metrics API
Warning
FailedGetResourceMetric
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-asyncapi-des
sidgc-registro-eletronico-asyncapi
14
2026-08-06T20:23:15Z
invalid metrics (2 invalid out of 2), first error is: failed to get cpu resource metric value: failed to get cpu utilization: unable to get metrics for resource cpu: no metrics returned from resource metrics API
Warning
FailedComputeMetricsReplicas
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-api-tqs
sidgc-registro-eletronico-api
14
2026-08-06T20:23:15Z
failed to get memory utilization: unable to get metrics for resource memory: no metrics returned from resource metrics API
Warning
FailedGetResourceMetric
horizontal-pod-autoscaler
HorizontalPodAutoscaler/sidgc-registro-eletronico-api-tqs
sidgc-registro-eletronico-api
14
2026-08-06T20:23:15Z
0/19 nodes are available: 19 node(s) had untolerated taint(s). no new claims to deallocate, preemption: 0/19 nodes are available: 19 Preemption is not helpful for scheduling.
Warning
FailedScheduling
Pod/sibko-originacao-digital-cron-des-86457f576-vs6zf
sibko-originacao-digital-cron
-
2026-08-06T20:08:43Z
0/19 nodes are available: 19 node(s) had untolerated taint(s). no new claims to deallocate, preemption: 0/19 nodes are available: 19 Preemption is not helpful for scheduling.
Warning
FailedScheduling
Pod/siidx-shared-tqs-f488999c9-98689
siidx-shared
-
2026-08-06T20:08:13Z
0/19 nodes are available: 19 node(s) had untolerated taint(s). no new claims to deallocate, preemption: 0/19 nodes are available: 19 Preemption is not helpful for scheduling.
Warning
FailedScheduling
Pod/siidx-assinador-api-neosigner-tqs-5cf76665c5-rl9rp
siidx-assinador-api-neosigner
-
2026-08-06T20:08:13Z
0/19 nodes are available: 19 node(s) had untolerated taint(s). no new claims to deallocate, preemption: 0/19 nodes are available: 19 Preemption is not helpful for scheduling.
Warning
FailedScheduling
Pod/sibko-pos-venda-asyncapi-tqs-5c7cbf7976-d4jq9
sibko-pos-venda-asyncapi
-
2026-08-06T20:08:13Z
0/19 nodes are available: 19 node(s) had untolerated taint(s). no new claims to deallocate, preemption: 0/19 nodes are available: 19 Preemption is not helpful for scheduling.
Warning
FailedScheduling
Pod/sibko-sibko-api-des-857dfdfdd6-qzpqk
sibko-sibko-api
-
2026-08-06T20:08:13Z
0/19 nodes are available: 19 node(s) had untolerated taint(s). no new claims to deallocate, preemption: 0/19 nodes are available: 19 Preemption is not helpful for scheduling.
Warning
FailedScheduling
Pod/sibko-pos-venda-asyncapi-des-78bc7c58b9-xcqbj
sibko-pos-venda-asyncapi
-
2026-08-06T20:07:43Z
0/19 nodes are available: 19 node(s) had untolerated taint(s). no new claims to deallocate, preemption: 0/19 nodes are available: 19 Preemption is not helpful for scheduling.
Warning
FailedScheduling
Pod/simtr-backend-pre-validacao-bff-tqs-c7f7d9556-2vn9h
simtr-backend-pre-validacao-bff
-
2026-08-06T20:07:13Z
0/19 nodes are available: 19 node(s) had untolerated taint(s). no new claims to deallocate, preemption: 0/19 nodes are available: 19 Preemption is not helpful for scheduling.
Warning
FailedScheduling
Pod/simtr-pre-validacao-doctree-tqs-94f6d4675-pb9c4
simtr-pre-validacao-doctree
-
2026-08-06T20:07:13Z
0/19 nodes are available: 19 node(s) had untolerated taint(s). no new claims to deallocate, preemption: 0/19 nodes are available: 19 Preemption is not helpful for scheduling.
Warning
FailedScheduling
Pod/simtr-backend-pre-validacao-core-ia-tqs-745494b4f8-d4vg2
simtr-backend-pre-validacao-core-ia
-
2026-08-06T20:06:43Z
0/19 nodes are available: 19 node(s) had untolerated taint(s). no new claims to deallocate, preemption: 0/19 nodes are available: 19 Preemption is not helpful for scheduling.
Warning
FailedScheduling
Pod/sidgc-shared-tqs-5779c6b76d-4p5ct
sidgc-shared
-
2026-08-06T20:06:13Z
0/19 nodes are available: 19 node(s) had untolerated taint(s). no new claims to deallocate, preemption: 0/19 nodes are available: 19 Preemption is not helpful for scheduling.
Warning
FailedScheduling
Pod/sibko-originacao-digital-api-des-68dc5d4f74-77sv4
sibko-originacao-digital-api
-
2026-08-06T20:05:13Z
0/19 nodes are available: 19 node(s) had untolerated taint(s). no new claims to deallocate, preemption: 0/19 nodes are available: 19 Preemption is not helpful for scheduling.
Warning
FailedScheduling
Pod/siidx-assinador-api-neosigner-des-5c97cbbf8c-xzkrp
siidx-assinador-api-neosigner
-
2026-08-06T20:04:43Z
