2026-10-19T21:24:06.4831307Z ##[section]Starting: Alterando Valores placeholders nos arquivos de config
2026-10-19T21:24:06.4834838Z ==============================================================================
2026-10-19T21:24:06.4834933Z Task         : Replace Tokens
2026-10-19T21:24:06.4834982Z Description  : Replace tokens in files
2026-10-19T21:24:06.4835045Z Version      : 3.3.1
2026-10-19T21:24:06.4835089Z Author       : Guillaume Rouchon
2026-10-19T21:24:06.4835378Z Help         : v3.3.1 - [More Information](https://github.com/qetza/vsts-replacetokens-task#readme)
2026-10-19T21:24:06.4835477Z ==============================================================================
2026-10-19T21:24:06.6731129Z replacing tokens in: /opt/ads-agent/_work/r19317/a/_SIGSJ-intranet-config/jboss/standalone-full-ha.xml
2026-10-19T21:24:06.6936284Z replacing tokens in: /opt/ads-agent/_work/r19317/a/_SIGSJ-intranet-config/jboss/standalone.conf
2026-10-19T21:24:06.6945990Z ##[error]  variable not found: JVM_HEAP_MIN
2026-10-19T21:24:06.6948511Z ##[error]  variable not found: JVM_HEAP_MAX
2026-10-19T21:24:06.6950431Z ##[error]  variable not found: JVM_METASPACE_MIN
2026-10-19T21:24:06.6952217Z ##[error]  variable not found: JVM_METASPACE_MAX
2026-10-19T21:24:06.6954785Z ##[error]  variable not found: PASSWORD_TRUSTSTORE
2026-10-19T21:24:06.6957518Z ##[error]  variable not found: URL_APM_SERVER
2026-10-19T21:24:06.7388531Z ##[section]Finishing: Alterando Valores placeholders nos arquivos de config

<img width="1878" height="913" alt="image" src="https://github.com/user-attachments/assets/bd3c447a-8189-4e06-8bd7-e2a6eb6f95f9" />


o intranet passou esa faltando varaivel..


o do boleto ta assim:



2026-10-19T20:47:01.2515931Z ##[section]Starting: Check Deployments [JBOSS]
2026-10-19T20:47:01.2518997Z ==============================================================================
2026-10-19T20:47:01.2519085Z Task         : Bash
2026-10-19T20:47:01.2519125Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-19T20:47:01.2519184Z Version      : 3.227.0
2026-10-19T20:47:01.2519234Z Author       : Microsoft Corporation
2026-10-19T20:47:01.2519280Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-19T20:47:01.2519346Z ==============================================================================
2026-10-19T20:47:01.3655473Z Generating script.
2026-10-19T20:47:01.3664665Z Script contents:
2026-10-19T20:47:01.3665255Z ansible-playbook /opt/ads-agent/_work/r19326/a/esteira-jboss-vm-v2/site.yml --tags check_deployments -e sistema_ambiente=des -e sistema_nome=sigsj-boleto -e site=ctc_nprd
2026-10-19T20:47:01.3668041Z ========================== Starting Command Output ===========================
2026-10-19T20:47:01.3675362Z [command]/bin/bash /opt/ads-agent/_work/_temp/f787efcf-1a0b-4c34-91f1-e87063a29b8c.sh
2026-10-19T20:47:03.6120131Z 
2026-10-19T20:47:03.6120633Z PLAY [local] *******************************************************************
2026-10-19T20:47:03.6424560Z 
2026-10-19T20:47:03.6425271Z PLAY [Configurando o DNS] ******************************************************
2026-10-19T20:47:03.8452633Z 
2026-10-19T20:47:03.8453085Z PLAY [local] *******************************************************************
2026-10-19T20:47:03.8488390Z 
2026-10-19T20:47:03.8488869Z PLAY [Verificando serviços] ****************************************************
2026-10-19T20:47:03.8580058Z 
2026-10-19T20:47:03.8580301Z PLAY [Configuração LDAP] *******************************************************
2026-10-19T20:47:03.8615358Z [WARNING]: Found variable using reserved name: when
2026-10-19T20:47:03.8622041Z 
2026-10-19T20:47:03.8622199Z PLAY [jboss] *******************************************************************
2026-10-19T20:47:03.8722174Z 
2026-10-19T20:47:03.8722670Z PLAY [Stack Jboss] *************************************************************
2026-10-19T20:47:03.8972371Z Monday 19 October 2026  17:47:03 -0300 (0:00:00.346)       0:00:00.346 ******** 
2026-10-19T20:47:04.3851198Z 
2026-10-19T20:47:04.3851864Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-10-19T20:47:04.3852453Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-10-19T20:47:04.3852689Z caddeapllx2557.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-10-19T20:47:04.3853403Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-10-19T20:47:04.3853621Z releases. A future Ansible release will default to using the discovered 
2026-10-19T20:47:04.3853800Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-10-19T20:47:04.3853944Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-10-19T20:47:04.3854105Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-10-19T20:47:04.3854257Z setting deprecation_warnings=False in ansible.cfg.
2026-10-19T20:47:04.3854891Z ok: [caddeapllx2557.agil.nprd.caixa.gov.br]
2026-10-19T20:47:04.3877669Z 
2026-10-19T20:47:04.3877952Z PLAY [jboss] *******************************************************************
2026-10-19T20:47:04.3920846Z 
2026-10-19T20:47:04.3921412Z PLAY [jboss] *******************************************************************
2026-10-19T20:47:04.3958846Z 
2026-10-19T20:47:04.3959291Z PLAY [jboss] *******************************************************************
2026-10-19T20:47:04.3985982Z 
2026-10-19T20:47:04.3986263Z PLAY [Copiando deployments adicionais] *****************************************
2026-10-19T20:47:04.4012035Z 
2026-10-19T20:47:04.4012302Z PLAY [Copiando modules adicionais] *********************************************
2026-10-19T20:47:04.4038739Z 
2026-10-19T20:47:04.4038875Z PLAY [jboss] *******************************************************************
2026-10-19T20:47:04.4073432Z 
2026-10-19T20:47:04.4073568Z PLAY [jboss] *******************************************************************
2026-10-19T20:47:04.4107980Z 
2026-10-19T20:47:04.4108296Z PLAY [jboss] *******************************************************************
2026-10-19T20:47:04.4152750Z Monday 19 October 2026  17:47:04 -0300 (0:00:00.518)       0:00:00.864 ******** 
2026-10-19T20:50:25.0030107Z 
2026-10-19T20:50:25.0030897Z TASK [Wait for Jboss Management port] ******************************************
2026-10-19T20:50:25.0031153Z fatal: [caddeapllx2557.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "elapsed": 200, "msg": "Timeout when waiting for 10.116.201.25:9990"}
2026-10-19T20:50:25.0081755Z Monday 19 October 2026  17:50:25 -0300 (0:03:20.592)       0:03:21.456 ******** 
2026-10-19T20:50:31.9530178Z 
2026-10-19T20:50:31.9530860Z TASK [systemd] *****************************************************************
2026-10-19T20:50:31.9533501Z changed: [caddeapllx2557.agil.nprd.caixa.gov.br]
2026-10-19T20:50:31.9604074Z Monday 19 October 2026  17:50:31 -0300 (0:00:06.952)       0:03:28.409 ******** 
2026-10-19T20:53:52.4567499Z 
2026-10-19T20:53:52.4568736Z TASK [Wait for Jboss Management port] ******************************************
2026-10-19T20:53:52.4569199Z fatal: [caddeapllx2557.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "elapsed": 200, "msg": "Timeout when waiting for 10.116.201.25:9990"}
2026-10-19T20:53:52.4578591Z 
2026-10-19T20:53:52.4580229Z PLAY RECAP *********************************************************************
2026-10-19T20:53:52.4580843Z caddeapllx2557.agil.nprd.caixa.gov.br : ok=2    changed=1    unreachable=0    failed=1    skipped=0    rescued=1    ignored=0   
2026-10-19T20:53:52.4580955Z 
2026-10-19T20:53:52.4583385Z Monday 19 October 2026  17:53:52 -0300 (0:03:20.497)       0:06:48.907 ******** 
2026-10-19T20:53:52.4693224Z =============================================================================== 
2026-10-19T20:53:52.4757869Z Wait for Jboss Management port ---------------------------------------- 200.59s
2026-10-19T20:53:52.4758324Z Wait for Jboss Management port ---------------------------------------- 200.50s
2026-10-19T20:53:52.4758558Z systemd ----------------------------------------------------------------- 6.95s
2026-10-19T20:53:52.4758782Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.52s
2026-10-19T20:53:52.4758930Z Playbook run took 0 days, 0 hours, 6 minutes, 48 seconds
2026-10-19T20:53:52.5247730Z ##[error]Bash exited with code '2'.
2026-10-19T20:53:52.5279464Z ##[section]Finishing: Check Deployments [JBOSS]


diszenod o thiago analista aqui da esteiras que 

SIGSJ-boleto - A release falhou porque o JBoss não conseguiu processar o arquivo standalone-full-ha.xml. O XML contém o subsystem modcluster (namespace urn:jboss:domain:modcluster:5.0), porém a extensão org.jboss.as.modcluster não está declarada no bloco <extensions>. Como resultado a inicialização do JBoss é abortada com erro de validação do XML, a porta de gerenciamento 9990 não sobe e a esteira encerra por timeout. Necessária correção da geração do standalone-full-ha.xml ou inclusão da extensão correspondente na configuração.
 
https://devops.caixa/projetos/Caixa/_git/SIGSJ-boleto-config?path=/jboss/standalone-full-ha.xml
Linha 454



 e o internet ta assim:

 <img width="1852" height="889" alt="image" src="https://github.com/user-attachments/assets/6ff56cad-00da-4f18-9797-ae5f90eb24f7" />


eu decerifa ter rorada a vm com destroyre ou recreate true nao fiz isso

ai temos que esperar ou podemos cancelar nesse step vai dar ruim nep se cancelar aqui


 
