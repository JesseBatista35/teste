
estou com esse erro 


2026-05-13T20:33:47.7999165Z ##[section]Starting: Verificando Status do Deployment
2026-05-13T20:33:47.8002129Z ==============================================================================
2026-05-13T20:33:47.8002215Z Task         : Bash
2026-05-13T20:33:47.8002257Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-05-13T20:33:47.8002314Z Version      : 3.227.0
2026-05-13T20:33:47.8002356Z Author       : Microsoft Corporation
2026-05-13T20:33:47.8002417Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-05-13T20:33:47.8002484Z ==============================================================================
2026-05-13T20:33:47.9299633Z Generating script.
2026-05-13T20:33:47.9313142Z ========================== Starting Command Output ===========================
2026-05-13T20:33:47.9320628Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/74f2fd4d-eced-4f2c-adec-538d3719d940.sh
2026-05-13T20:33:48.0224077Z Waiting for rollout to finish: 0 out of 2 new replicas have been updated...
2026-05-13T20:33:49.1871769Z Waiting for rollout to finish: 0 out of 2 new replicas have been updated...
2026-05-13T20:33:49.3082386Z Waiting for rollout to finish: 0 of 2 updated replicas are available...
2026-05-13T20:39:55.3108735Z ##[error]The task has timed out.
2026-05-13T20:39:55.3109868Z ##[section]Finishing: Verificando Status do Deployment

Streaming events...
Showing 14 events
Older events are not stored.
PodPsitop-frontend-des-5-mzzkd
NamespaceNSsitop-des
13 de mai. de 2026, 18:47
Generated from kubelet on ceadecldlx080.nprd.caixa
4 times in the last 0 minutes
Back-off restarting failed container
PodPsitop-frontend-des-5-mzzkd
NamespaceNSsitop-des
13 de mai. de 2026, 18:47
Generated from kubelet on ceadecldlx080.nprd.caixa
4 times in the last 0 minutes
Back-off restarting failed container
PodPsitop-frontend-des-5-mzzkd
NamespaceNSsitop-des
13 de mai. de 2026, 18:47
Generated from kubelet on ceadecldlx080.nprd.caixa
2 times in the last 0 minutes
Started container sitop-frontend-des-exporter
PodPsitop-frontend-des-5-mzzkd
NamespaceNSsitop-des
13 de mai. de 2026, 18:47
Generated from kubelet on ceadecldlx080.nprd.caixa
2 times in the last 0 minutes
Created container sitop-frontend-des-exporter
PodPsitop-frontend-des-5-mzzkd
NamespaceNSsitop-des
13 de mai. de 2026, 18:47
Generated from kubelet on ceadecldlx080.nprd.caixa
Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sitop-frontend:1.0.0-SNAPSHOT" in 56.200813ms (56.212164ms including waiting)



erro do log do pod:

sed: can't read /opt/app-root/src/main*.js: No such file or directory




