s://console-openshift-console.apps.pixnprd4.caixa/k8s/ns/sispi-des/core~v1~Pod?name=container


Red Hat OpenShift



p585600@corp.caixa.gov.br

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
Service Mesh

Project: sispi-des
Pods

Filter

Name
container
/
Name
container

Name

Status

Ready

Restarts

Owner

Memory

CPU

Created
Pod
P
sispi-container-backend-des-861-deploy
Completed
0/1	0	
ReplicationController
RC
sispi-container-backend-des-861
-	-	
27 de mai. de 2026, 16:56

Pod
P
sispi-container-backend-des-862-52468
Running
2/2	0	
ReplicationController
RC
sispi-container-backend-des-862
3.169,6 MiB	0,091 cores	
27 de mai. de 2026, 17:53

Pod
P
sispi-container-backend-des-862-deploy
Completed
0/1	0	
ReplicationController
RC
sispi-container-backend-des-862
-	-	
27 de mai. de 2026, 17:53

Pod
P
sispi-container-dict-des-738-deploy
Error
0/1	0	
ReplicationController
RC
sispi-container-dict-des-738
-	-	
29 de mai. de 2026, 09:17

Pod
P
sispi-container-dict-des-739-deploy
Completed
0/1	0	
ReplicationController
RC
sispi-container-dict-des-739
-	-	
29 de mai. de 2026, 09:31

Pod
P
sispi-container-dict-des-739-jrctx
Running
2/2	0	
ReplicationController
RC
sispi-container-dict-des-739
1.439,8 MiB	0,164 cores	
29 de mai. de 2026, 09:31

Pod
P
sispi-container-frontend-des-536-deploy
Completed
0/1	0	
ReplicationController
RC
sispi-container-frontend-des-536
-	-	
28 de mai. de 2026, 16:55

Pod
P
sispi-container-frontend-des-537-b6vm7
Terminating
3/3	3	
ReplicationController
RC
sispi-container-frontend-des-537
195,6 MiB	0,004 cores	
29 de mai. de 2026, 15:09

Pod
P
sispi-container-frontend-des-537-deploy
Completed
0/1	0	
ReplicationController
RC
sispi-container-frontend-des-537
-	-	
29 de mai. de 2026, 15:08

Pod
P
sispi-container-frontend-des-538-deploy
Completed
0/1	0	
ReplicationController
RC
sispi-container-frontend-des-538
-	-	
29 de mai. de 2026, 16:05

Pod
P
sispi-container-frontend-des-538-wpnqd
Running
3/3	2	
ReplicationController
RC
sispi-container-frontend-des-538
-	-	
29 de mai. de 2026, 16:05



éle é do okd do pix sim:


no okd4 

os comando deu isso:


-sh-4.2$ oc get builds -n build-images-ads | grep sispi-backend
-sh-4.2$ oc describe build/sispi-backend-<n> -n build-images-ads
-sh: n: Arquivo ou diretório não encontrado
-sh-4.2$ oc logs build/sispi-backend-<n> -n build-images-ads
-sh: n: Arquivo ou diretório não encontrado
-sh-4.2$ du -sh /opt/ads-agent/_work/10311/a
du: não é possível acessar “/opt/ads-agent/_work/10311/a”: Arquivo ou diretório não encontrado
-sh-4.2$



Logged into "https://api.pixnprd4.caixa:6443" as "p585600@corp.caixa.gov.br" using the token provided.

You have access to 147 projects, the list has been suppressed. You can list all projects with 'oc projects'

Using project "default".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get builds -n build-images-ads | grep sispi-backend
No resources found.
-sh-4.2$ oc describe build/sispi-backend-<n> -n build-images-ads
-sh: n: Arquivo ou diretório não encontrado
-sh-4.2$  oc logs build/sispi-backend-<n> -n build-images-ads
-sh: n: Arquivo ou diretório não encontrado
-sh-4.2$  oc logs build/sispi-backend-<n> -n build-images-ads
-sh: n: Arquivo ou diretório não encontrado
-sh-4.2$ du -sh /opt/ads-agent/_work/10311/a
du: não é possível acessar “/opt/ads-agent/_work/10311/a”: Arquivo ou diretório não encontrado
-sh-4.2$

