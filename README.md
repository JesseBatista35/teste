SAST: Guardrail Segurança Cibernética

View raw log

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
/usr/bin/bash --noprofile --norc /opt/ads-agent/_work/_temp/29561f60-1951-4caf-a9bf-87c98db08627.sh
/usr/bin/docker
Docker version 18.09.9, build 039a7df9ba
WARNING! Your password will be stored unencrypted in /home/sadscp01/.docker/config.json.
Configure a credential helper to remove this warning. See
https://docs.docker.com/engine/reference/commandline/login/#credentials-store

Login Succeeded
FORTIFY_APPLICATION: SIMTR-api
KEYSTORE_SECUREFILEPATH: /etc/pki/ca-trust/source/anchors/keystore-ssc24.jks
docker --version
Docker version 18.09.9, build 039a7df9ba
docker run -v /opt/ads-agent/_work/7658/s:/src default-route-openshift-image-registry.apps.produtos4.caixa/fortify/fortify-ci-tools:7.0.0-jdk-17
Configurando Key Store
 Path               Type  Action     
 /src/keystore.jks  jks   CONFIGURED 


Nome do Sistema: SIMTR-api
Nome da Versão: 2.58.2
Nome da Versão Anterior: 2.58.2
Login no Fortify...
 Name                       Type  Url                                          Created                  Expires                  Expired  Action  
 SIMTR-api-2.58.2.9-733166  SSC   SSC:     https://sast.caixa/ssc              2026-05-29 18:14:10 UTC  2027-04-29 17:06:42 UTC  No       CREATED 
                                  SC-SAST: http://sast.caixa/scancentral-ctrl                                                                     
                                  SC-DAST: N/A (Disabled in SSC)                                                                                  


Atualizando aplicação no Fortify...
 Id     Application name  Name    Active  Issue template name                   Created by            Action              
