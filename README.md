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
Storage
Builds
Observe
Compute
User Management
Administration

Project: sisam-des
Pods
Pod details
Pod
P
sisam-backend-internet-des-62-dwpp9
Init:CrashLoopBackOff

Actions
Details
Metrics
YAML
Environment
Logs
Events
Terminal
Streaming events...
Showing 9 events
Older events are not stored.
PodPsisam-backend-internet-des-62-dwpp9
NamespaceNSsisam-des
31 de jul. de 2026, 11:31
Generated from kubelet on ceadecldlx019.nprd.caixa
2 times in the last 0 minutes
Back-off restarting failed container
PodPsisam-backend-internet-des-62-dwpp9
NamespaceNSsisam-des
31 de jul. de 2026, 11:31
Generated from kubelet on ceadecldlx019.nprd.caixa
2 times in the last 0 minutes
Container image "default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552" already present on machine
PodPsisam-backend-internet-des-62-dwpp9
NamespaceNSsisam-des
31 de jul. de 2026, 11:31
Generated from kubelet on ceadecldlx019.nprd.caixa
2 times in the last 0 minutes
Created container secrets-check
PodPsisam-backend-internet-des-62-dwpp9
NamespaceNSsisam-des
31 de jul. de 2026, 11:31
Generated from kubelet on ceadecldlx019.nprd.caixa
2 times in the last 0 minutes
Started container secrets-check
PodPsisam-backend-internet-des-62-dwpp9
NamespaceNSsisam-des
31 de jul. de 2026, 11:31
Generated from multus
Add eth0 [25.3.7.165/23] from openshift-sdn
PodPsisam-backend-internet-des-62-dwpp9
NamespaceNSsisam-des
31 de jul. de 2026, 11:31
Generated from kubelet on ceadecldlx019.nprd.caixa
Container image "default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.2" already present on machine
PodPsisam-backend-internet-des-62-dwpp9
NamespaceNSsisam-des
31 de jul. de 2026, 11:31
Generated from kubelet on ceadecldlx019.nprd.caixa
Created container secrets-agent-sidecar
PodPsisam-backend-internet-des-62-dwpp9
NamespaceNSsisam-des
31 de jul. de 2026, 11:31
Generated from kubelet on ceadecldlx019.nprd.caixa
Started container secrets-agent-sidecar
PodPsisam-backend-internet-des-62-dwpp9
NamespaceNSsisam-des
31 de jul. de 2026, 11:31
Generated from default-scheduler
Successfully assigned sisam-des/sisam-backend-internet-des-62-dwpp9 to ceadecldlx019.nprd.caixa


container = secrets-agent-sidecar

2026-07-31 14:31:04,072 INFO Getting secrets just once, POLLING_WAIT_BETWEEN_REQUESTS_MINUTES was not configured
2026-07-31 14:31:04,072 INFO (75bda4e8-8cec-11f1-a822-0a58190307a5) APP VERSION: 2.1.0
2026-07-31 14:31:04,073 INFO (75bda4e8-8cec-11f1-a822-0a58190307a5) Starting Execution...75bda4e8-8cec-11f1-a822-0a58190307a5
2026-07-31 14:31:04,073 INFO (75bda4e8-8cec-11f1-a822-0a58190307a5) You are using: <,> as List delimiter
2026-07-31 14:31:04,073 WARNING (75bda4e8-8cec-11f1-a822-0a58190307a5) InsecureRequestWarning: Unverified HTTPS request is being made to host https://sicsn.caixa/BeyondTrust/api/public/v3'. Adding certificate verification isstrongly advised. See: https://urllib3.readthedocs.io/en/1.26.x/advanced-usage.html#ssl-warnings
2026-07-31 14:31:04,073 INFO (75bda4e8-8cec-11f1-a822-0a58190307a5) Certificate was not configured
Traceback (most recent call last):
File "/usr/src/app/get_secrets_from_secret_safe.py", line 75, in main
authentication_obj = controller.get_auth_object(
session=session, logger=logger
)
File "/usr/src/app/sidecar_agent_project/controller.py", line 90, in get_auth_object
authentication_obj = authentication.Authentication(**config)
File "/usr/local/lib/python3.13/site-packages/secrets_safe_library/authentication.py", line 61, in __init__
self.validate_input("client_id", client_id)
~~~~~~~~~~~~~~~~~~~^^^^^^^^^^^^^^^^^^^^^^^^
File "/usr/local/lib/python3.13/site-packages/secrets_safe_library/authentication.py", line 246, in validate_input
raise exceptions.OptionsError(f"{parameter_name} parameter is missing")
secrets_safe_library.exceptions.OptionsError: client_id parameter is missing
2026-07-31 14:31:04,074 ERROR (75bda4e8-8cec-11f1-a822-0a58190307a5) There was an error in the execution: client_id parameter is missing


container secres-check

ERRO: Nao foram encontrados arquivos com segredos no diretorio '/usr/src/app/secrets_files'.



