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
/usr/bin/bash /opt/ads-agent/_work/_temp/b55f1cf9-c97c-4ea4-a208-bcafcb5ee61d.sh
+ set -e
+ set -o pipefail
+ echo '===== BUILD S2I NO OPENSHIFT ====='
+ OCP_TOKEN=
+ OCP_SERVER=https://api.nprd.caixa:6443
+ OCP_USER=p585600
+ APP_NAME=sifof-api-aplicacao
+ NAMESPACE=build-images-ads
+ BUILD_DIR=/opt/ads-agent/_work/61/a
+ echo 'Server: https://api.nprd.caixa:6443'
+ echo 'User: p585600'
+ echo 'App: sifof-api-aplicacao'
+ echo ''
+ echo '>>> PASSO 1: Fazendo login...'
+ oc login --token= --server=https://api.nprd.caixa:6443 --insecure-skip-tls-verify=true
===== BUILD S2I NO OPENSHIFT =====
Server: https://api.nprd.caixa:6443
User: p585600
App: sifof-api-aplicacao

>>> PASSO 1: Fazendo login...
You must obtain an API token by visiting https://oauth-openshift.apps.nprd.caixa/oauth/token/request
+ echo 'FALHA no login!'
+ exit 1
FALHA no login!
##[error]Bash exited with code '1'.
Finishing: Bash Script


a agente loga assim/:

oc login --token=apageuiotoken --server=https://api.nprd.caixa:6443
