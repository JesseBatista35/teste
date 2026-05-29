Verificar  geração da build do modulo SIMTR-API


Prezados boa tarde

Estamos com problema na geração da build do modulo SIMTR-API

O mesmo está acusando erro no passo da SAST, temos entregas hoje precisamos gerar as releases, poderiam por favor verificar por gentileza

Evidência

https://devops.caixa/projetos/Caixa/_build/results?buildId=733166&view=logs&j=275f1d19-1bd8-5591-b06b-07d489ea915a&t=e73d691f-7b26-5ce3-d518-700413f3ba2c

Muito obrigado !!


Starting: SAST: Guardrail Segurança Cibernética
==============================================================================
Task         : Command line
Description  : Run a command line script using Bash on Linux and macOS and cmd.exe on Windows
Version      : 2.212.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/command-line
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/bin/bash --noprofile --norc /opt/ads-agent/work_ads/_temp/4fa3d641-d510-4419-9fcd-18c746fc5dc2.sh
/bin/docker
Docker version 18.09.9, build 039a7df9ba
/bin/podman
podman version 1.6.4
WARNING! Your password will be stored unencrypted in /home/sadscp01/.docker/config.json.
Configure a credential helper to remove this warning. See
https://docs.docker.com/engine/reference/commandline/login/#credentials-store

Login Succeeded
FORTIFY_APPLICATION: SIMTR-api
KEYSTORE_SECUREFILEPATH: /etc/pki/ca-trust/source/anchors/keystore-ssc24.jks
docker --version
Docker version 18.09.9, build 039a7df9ba
docker run -v /opt/ads-agent/work_ads/5431/s:/src default-route-openshift-image-registry.apps.produtos4.caixa/fortify/fortify-ci-tools:7.0.0-jdk-17
Configurando Key Store
 Path               Type  Action     
 /src/keystore.jks  jks   CONFIGURED 


Nome do Sistema: SIMTR-api
Nome da Versão: 2.58.2
Nome da Versão Anterior: 2.58.2
Login no Fortify...
 Name                       Type  Url                                          Created                  Expires                  Expired  Action  
 SIMTR-api-2.58.2.9-733570  SSC   SSC:     https://sast.caixa/ssc              2026-05-29 19:37:47 UTC  2027-04-29 17:06:42 UTC  No       CREATED 
                                  SC-SAST: http://sast.caixa/scancentral-ctrl                                                                     
                                  SC-DAST: N/A (Disabled in SSC)                                                                                  




APOS A SOLICITAÇAO NA REQ: REQ000144293442

1. Favor realizar  a adição da variável "guardrail.sec=true" na "Pipeline variable" na esteira dos seguintes repositórios: SIMTR-api

2. Essa alteração é relativa à quarta onda de implementação do guardrail de segurança.


A BUILD QUEBRA NESSE JOB


Starting: SAST: Guardrail Segurança Cibernética
==============================================================================
Task         : Command line
Description  : Run a command line script using Bash on Linux and macOS and cmd.exe on Windows
Version      : 2.212.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/command-line
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash --noprofile --norc /opt/ads-agent/_work/_temp/e3e7173c-d30c-4b0a-8861-e226b8169e05.sh
/usr/bin/docker
Docker version 18.09.9, build 039a7df9ba
/usr/bin/podman
podman version 1.6.4
WARNING! Your password will be stored unencrypted in /home/sadscp01/.docker/config.json.
Configure a credential helper to remove this warning. See
https://docs.docker.com/engine/reference/commandline/login/#credentials-store

Login Succeeded
FORTIFY_APPLICATION: SIMTR-api
KEYSTORE_SECUREFILEPATH: /etc/pki/ca-trust/source/anchors/keystore-ssc24.jks
docker --version
Docker version 18.09.9, build 039a7df9ba
docker run -v /opt/ads-agent/_work/11280/s:/src default-route-openshift-image-registry.apps.produtos4.caixa/fortify/fortify-ci-tools:7.0.0-jdk-17
Configurando Key Store
 Path               Type  Action     
 /src/keystore.jks  jks   CONFIGURED 


Nome do Sistema: SIMTR-api
Nome da Versão: 2.58.2
Nome da Versão Anterior: 2.58.2
Login no Fortify...
 Name                       Type  Url                                          Created                  Expires                  Expired  Action  
 SIMTR-api-2.58.2.9-733804  SSC   SSC:     https://sast.caixa/ssc              2026-05-29 22:46:39 UTC  2027-04-29 17:06:42 UTC  No       CREATED 
                                  SC-SAST: http://sast.caixa/scancentral-ctrl                                                                     
                                  SC-DAST: N/A (Disabled in SSC)                                                                                  




ME AJUDA COM UMA MENSSAGEM PARA MANDAR NA W.O INFORMANDO O MOTIVO DO ERRO E POR CONTA DA SOLICITAÇÃO FEITA NA W.O. VERIFICAREM CONFIGURAÇAO

