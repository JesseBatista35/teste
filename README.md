nao vou colocar mue token e nem meu usiro para cirar nada. 

isso é pratica errada..


troquei o agent:

e rodei novamente:


Starting: Bash Script
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/2a5618b7-cabb-4664-9b36-40c7b86dbafa.sh
+ set -e
+ set -o pipefail
+ echo '===== DEBUG OPENSHIFT BUILD ====='
+ echo '1. Quem estou logado?'
+ oc whoami
===== DEBUG OPENSHIFT BUILD =====
1. Quem estou logado?
Error from server (Forbidden): users.user.openshift.io "~" is forbidden: User "system:anonymous" cannot get resource "users" in API group "user.openshift.io" at the cluster scope
+ true
+ echo '2. Projeto:'
+ oc project
2. Projeto:
error: you do not have rights to view project "default" specified in your config or the project doesn't exist
+ true
+ echo '3. Testando API (healthz):'
+ oc get --raw=/healthz
3. Testando API (healthz):
ok+ echo '4. Testando listagem de pods:'
4. Testando listagem de pods:
+ oc get pods -n build-images-ads
+ head -n 5
Error from server (Forbidden): pods is forbidden: User "system:anonymous" cannot list resource "pods" in API group "" in the namespace "build-images-ads"
+ echo 'FAIL PODS'
FAIL PODS
5. Testando estabilidade (loop):
+ echo '5. Testando estabilidade (loop):'
+ for i in {1..5}
+ oc get pods -n build-images-ads
Error from server (Forbidden): pods is forbidden: User "system:anonymous" cannot list resource "pods" in API group "" in the namespace "build-images-ads"
