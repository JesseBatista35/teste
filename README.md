me auda a resolver isso daqui o pod nao sobe


2026-07-10T18:00:09.3164357Z ##[debug]Evaluating condition for step: 'VAULT_KEYSTORE_OKD'
2026-07-10T18:00:09.3165499Z ##[debug]Evaluating: succeeded()
2026-07-10T18:00:09.3165758Z ##[debug]Evaluating succeeded:
2026-07-10T18:00:09.3166195Z ##[debug]=> True
2026-07-10T18:00:09.3166653Z ##[debug]Result: True
2026-07-10T18:00:09.3166911Z ##[section]Starting: VAULT_KEYSTORE_OKD
2026-07-10T18:00:09.3172218Z ==============================================================================
2026-07-10T18:00:09.3172502Z Task         : Bash
2026-07-10T18:00:09.3172565Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-10T18:00:09.3172862Z Version      : 3.227.0
2026-07-10T18:00:09.3172986Z Author       : Microsoft Corporation
2026-07-10T18:00:09.3173059Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-10T18:00:09.3173167Z ==============================================================================
2026-07-10T18:00:09.3937387Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-07-10T18:00:09.4648593Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-07-10T18:00:09.4655992Z ##[debug]loading inputs and endpoints
2026-07-10T18:00:09.4663383Z ##[debug]loading INPUT_TARGETTYPE
2026-07-10T18:00:09.4671994Z ##[debug]loading INPUT_FILEPATH
2026-07-10T18:00:09.4672572Z ##[debug]loading INPUT_SCRIPT
2026-07-10T18:00:09.4673393Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-07-10T18:00:09.4674139Z ##[debug]loading INPUT_FAILONSTDERR
2026-07-10T18:00:09.4674800Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-07-10T18:00:09.4675365Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-07-10T18:00:09.4677645Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-07-10T18:00:09.4682569Z ##[debug]loading SECRET_FORTIFY_PASS
2026-07-10T18:00:09.4684265Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-07-10T18:00:09.4685936Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-07-10T18:00:09.4687908Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-07-10T18:00:09.4690041Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-07-10T18:00:09.4691161Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-07-10T18:00:09.4691790Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-07-10T18:00:09.4692419Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-07-10T18:00:09.4693214Z ##[debug]loading SECRET_PASSWORD_CGC
2026-07-10T18:00:09.4693974Z ##[debug]loading SECRET_TOKEN_CRQ
2026-07-10T18:00:09.4694488Z ##[debug]loading SECRET_AZPAT
2026-07-10T18:00:09.4695023Z ##[debug]loaded 19
2026-07-10T18:00:09.4700554Z ##[debug]Agent.ProxyUrl=undefined
2026-07-10T18:00:09.4700970Z ##[debug]Agent.CAInfo=undefined
2026-07-10T18:00:09.4701727Z ##[debug]Agent.ClientCert=undefined
2026-07-10T18:00:09.4702200Z ##[debug]Agent.SkipCertValidation=True
2026-07-10T18:00:09.4716934Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-07-10T18:00:09.4718780Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-07-10T18:00:09.4719212Z ##[debug]system.culture=en-US
2026-07-10T18:00:09.4726969Z ##[debug]failOnStderr=false
2026-07-10T18:00:09.4727927Z ##[debug]workingDirectory=/opt/ads-agent/_work/r478/a
2026-07-10T18:00:09.4728330Z ##[debug]check path : /opt/ads-agent/_work/r478/a
2026-07-10T18:00:09.4728897Z ##[debug]targetType=inline
2026-07-10T18:00:09.4729373Z ##[debug]bashEnvValue=undefined
2026-07-10T18:00:09.4731164Z ##[debug]script=app="sisam-backend-internet-tqs"

# Remover secret existente (se houver)
oc delete secret vault-sisam-internet-keystore -n sisam-tqs --ignore-not-found=true

# Remover o volume antigo com nome errado (da execução anterior)
oc set volume dc $app --remove --name=vault-sisam-keystore -n sisam-tqs 2>/dev/null || true

# Remover o volume com nome correto (caso já exista de tentativa anterior)
oc set volume dc $app --remove --name=vault-sisam-internet-keystore -n sisam-tqs 2>/dev/null || true

# Criar secret com o keystore baixado pelo DownloadSecureFile
oc create secret generic vault-sisam-internet-keystore \
  --from-file=vault-sisam-internet-des.keystore=$DOWNLOADSECUREFILE2_SECUREFILEPATH \
  -n sisam-des

# Montar o keystore no path esperado pelo JBoss
oc set volume dc $app \
  --add --name=vault-sisam-internet-keystore \
  --secret-name=vault-sisam-internet-keystore \
  --mount-path=/opt/jboss/standalone/configuration/vault-sisam-internet-tqs.keystore \
  --sub-path=vault-sisam-internet-tqs.keystore \
  --overwrite -n sisam-tqs
2026-07-10T18:00:09.4740796Z Generating script.
2026-07-10T18:00:09.4742713Z ##[debug]which 'bash'
2026-07-10T18:00:09.4749406Z ##[debug]found: '/usr/bin/bash'
2026-07-10T18:00:09.4749908Z ##[debug]Agent.Version=3.236.1
2026-07-10T18:00:09.4750291Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-07-10T18:00:09.4750659Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-07-10T18:00:09.4752313Z ========================== Starting Command Output ===========================
2026-07-10T18:00:09.4753876Z ##[debug]which '/usr/bin/bash'
2026-07-10T18:00:09.4754841Z ##[debug]found: '/usr/bin/bash'
2026-07-10T18:00:09.4755422Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/3cb05ba4-ecf6-43fa-a31f-398c44729ac5.sh
2026-07-10T18:00:09.4757906Z ##[debug]exec tool: /usr/bin/bash
2026-07-10T18:00:09.4758273Z ##[debug]arguments:
2026-07-10T18:00:09.4758695Z ##[debug]   /opt/ads-agent/_work/_temp/3cb05ba4-ecf6-43fa-a31f-398c44729ac5.sh
2026-07-10T18:00:09.4762020Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/3cb05ba4-ecf6-43fa-a31f-398c44729ac5.sh
2026-07-10T18:00:09.8120753Z error: failed to create secret secrets "vault-sisam-internet-keystore" already exists
2026-07-10T18:00:09.9087405Z warning: volume "vault-sisam-internet-keystore" did not previously exist and was not overwritten. A new volume with this name has been created instead.deploymentconfig.apps.openshift.io/sisam-backend-internet-tqs volume updated
2026-07-10T18:00:09.9135556Z ##[debug]Exit code 0 received from tool '/usr/bin/bash'
2026-07-10T18:00:09.9137971Z ##[debug]STDIO streams have closed for tool '/usr/bin/bash'
2026-07-10T18:00:09.9144325Z ##[debug]task result: Succeeded
2026-07-10T18:00:09.9145653Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-07-10T18:00:09.9184863Z ##[section]Finishing: VAULT_KEYSTORE_OKD



OKD


Jesse Mouta Pereira Batista

Administrator
Home
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
Services
Routes
Ingresses
NetworkPolicies
Storage
PersistentVolumes
PersistentVolumeClaims
StorageClasses
VolumeSnapshots
VolumeSnapshotClasses
VolumeSnapshotContents
Builds
Observe
Compute
User Management
Administration

Project: sisam-tqs
Pods
Pod details
Pod
P
sisam-backend-internet-tqs-2-sgxjz
ContainerCreating

Actions
Details
Metrics
YAML
Environment
Logs
Events
Terminal
Streaming events...
Showing 4 events
Older events are not stored.
PodPsisam-backend-internet-tqs-2-sgxjz
NamespaceNSsisam-tqs
10 de jul. de 2026, 15:07
Generated from kubelet on ceadecldlx066.nprd.caixa
2 times in the last 3 minutes
Unable to attach or mount volumes: unmounted volumes=[vault-sisam-internet-keystore], unattached volumes=[java-config-sisam-backend-internet kube-api-access-f99c8 vault-sisam-backend-internet vault-sisam-internet-keystore jboss-config-sisam-backend-internet]: timed out waiting for the condition
PodPsisam-backend-internet-tqs-2-sgxjz
NamespaceNSsisam-tqs
10 de jul. de 2026, 15:06
Generated from kubelet on ceadecldlx066.nprd.caixa
11 times in the last 7 minutes
MountVolume.SetUp failed for volume "vault-sisam-internet-keystore" : secret "vault-sisam-internet-keystore" not found
PodPsisam-backend-internet-tqs-2-sgxjz
NamespaceNSsisam-tqs
10 de jul. de 2026, 15:02
Generated from kubelet on ceadecldlx066.nprd.caixa
Unable to attach or mount volumes: unmounted volumes=[vault-sisam-internet-keystore], unattached volumes=[vault-sisam-internet-keystore jboss-config-sisam-backend-internet java-config-sisam-backend-internet kube-api-access-f99c8 vault-sisam-backend-internet]: timed out waiting for the condition
PodPsisam-backend-internet-tqs-2-sgxjz
NamespaceNSsisam-tqs
10 de jul. de 2026, 15:00
Generated from default-scheduler
Successfully assigned sisam-tqs/sisam-backend-internet-tqs-2-sgxjz to ceadecldlx066.nprd.caixa
11 of 14 found for mou at 334:15
