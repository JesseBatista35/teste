#!/bin/bash
set -o errexit

# Login
oc login -u "$OCP_USER" -p "$OCP_PASSWORD" https://api.nprd.caixa:6443

# Configurar
export APP_NAME="sifof-api-aplicacao"
export NAMESPACE="build-images-ads"
export IMAGESTREAM="rhel9/openjdk-21"
export BUILD_DIR="./app"

# Executar
chmod +x build-s2i.sh
./build-s2i.sh




rodamso esse bash aqui:

#!/bin/bash
set -x
set -e
set -o pipefail

echo "===== DEBUG OPENSHIFT BUILD ====="

echo "1. Quem estou logado?"
oc whoami || true

echo "2. Projeto:"
oc project || true

echo "3. Testando API (healthz):"
oc get --raw='/healthz' || echo "FAIL API"

echo "4. Testando listagem de pods:"
oc get pods -n build-images-ads | head -n 5 || echo "FAIL PODS"

echo "5. Testando estabilidade (loop):"
for i in {1..5}; do
  oc get pods -n build-images-ads >/dev/null \
    && echo "OK tentativa $i" \
    || echo "FAIL tentativa $i"
  sleep 2
done

echo "6. Testando conexão TCP:"
timeout 5 bash -c "</dev/tcp/api.produtos4.caixa/6443" \
  && echo "TCP OK" \
  || echo "TCP FAIL"

echo "7. Tamanho do payload:"
du -sh $(Build.StagingDirectory) || true

echo "8. Arquivos principais:"
ls -lh $(Build.StagingDirectory)


deu esse resultado:



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
/usr/bin/bash /opt/ads-agent/_work/_temp/59b8e5ee-faad-43a8-932f-d568d7f3a08d.sh
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
error: the server doesn't have a resource type "pods"
+ echo 'FAIL PODS'
+ echo '5. Testando estabilidade (loop):'
FAIL PODS
5. Testando estabilidade (loop):
+ for i in {1..5}
+ oc get pods -n build-images-ads
error: the server doesn't have a resource type "pods"



vou rodar com seu bash agora:


