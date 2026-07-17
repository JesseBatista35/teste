me ajuda a croorigr esse problema e saber o prque ele ta acontecendo


sifof-api-aplicacao-tqs-63-w65l9
Init:0/2



2026-07-17T13:26:10.7283556Z ##[section]Starting: Logs da Aplicação
2026-07-17T13:26:10.7286680Z ==============================================================================
2026-07-17T13:26:10.7286759Z Task         : Bash
2026-07-17T13:26:10.7286804Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-17T13:26:10.7286887Z Version      : 3.227.0
2026-07-17T13:26:10.7286932Z Author       : Microsoft Corporation
2026-07-17T13:26:10.7286985Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-17T13:26:10.7287066Z ==============================================================================
2026-07-17T13:26:10.8573103Z Generating script.
2026-07-17T13:26:10.8583750Z ========================== Starting Command Output ===========================
2026-07-17T13:26:10.8590864Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/d709a618-3848-4f65-a64e-514b650a4e6a.sh
2026-07-17T13:26:10.8641951Z + shopt -s expand_aliases
2026-07-17T13:26:10.8642991Z + [[ -n okd4_nprd ]]
2026-07-17T13:26:10.8643299Z + [[ okd4_nprd =~ ocp ]]
2026-07-17T13:26:10.8643470Z + [[ -n okd4_nprd ]]
2026-07-17T13:26:10.8643628Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-07-17T13:26:10.8643815Z + app=sifof-api-aplicacao-tqs
2026-07-17T13:26:10.8643952Z + oc version
2026-07-17T13:26:10.9307387Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-07-17T13:26:10.9307699Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-07-17T13:26:10.9307885Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-07-17T13:26:10.9335063Z ++ oc get pod -l name=sifof-api-aplicacao-tqs -n sifof-tqs -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-07-17T13:26:10.9336139Z ++ tac
2026-07-17T13:26:10.9337296Z ++ grep -v '^$'
2026-07-17T13:26:10.9337434Z ++ head -n1
2026-07-17T13:26:11.0115881Z + last_pod=sifof-api-aplicacao-tqs-62-wdps7
2026-07-17T13:26:11.0116185Z + echo 'Logs do POD: sifof-api-aplicacao-tqs-62-wdps7'
2026-07-17T13:26:11.0116451Z + oc logs sifof-api-aplicacao-tqs-62-wdps7 -c sifof-api-aplicacao-tqs -n sifof-tqs
2026-07-17T13:26:11.0116701Z Logs do POD: sifof-api-aplicacao-tqs-62-wdps7
2026-07-17T13:26:11.0895514Z Error from server (BadRequest): container "sifof-api-aplicacao-tqs" in pod "sifof-api-aplicacao-tqs-62-wdps7" is waiting to start: PodInitializing
2026-07-17T13:26:11.0971440Z ##[error]Bash exited with code '1'.
2026-07-17T13:26:11.0991103Z ##[section]Finishing: Logs da Aplicação





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
Storage
Builds
Observe
Compute
User Management
Administration

Project: sifof-tqs
Pods

Filter

Name
api-a
/
Name
api-a

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
sifof-api-aplicacao-tqs-55-deploy
Completed
0/1	0	
ReplicationController
RC
sifof-api-aplicacao-tqs-55
-	-	
14 de jul. de 2026, 09:34

Pod
P
sifof-api-aplicacao-tqs-56-54dnh
Running
1/1	0	
ReplicationController
RC
sifof-api-aplicacao-tqs-56
380,4 MiB	0,001 cores	
14 de jul. de 2026, 12:31

Pod
P
sifof-api-aplicacao-tqs-56-deploy
Completed
0/1	0	
ReplicationController
RC
sifof-api-aplicacao-tqs-56
-	-	
14 de jul. de 2026, 12:31

Pod
P
sifof-api-aplicacao-tqs-63-deploy
Running
1/1	0	
ReplicationController
RC
sifof-api-aplicacao-tqs-63
25,1 MiB	0,001 cores	
17 de jul. de 2026, 10:41

Pod
P
sifof-api-aplicacao-tqs-63-w65l9
Init:0/2	0/1	0	
ReplicationController
RC
sifof-api-aplicacao-tqs-63
-	-	
17 de jul. de 2026, 10:41



ele tenta iniciar e nao conssegue 


