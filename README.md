
-sh-4.2$ ls -la /usr/java/ 2>/dev/null
total 0
drwxr-xr-x   3 root root  55 Jul 13  2020 .
drwxr-xr-x. 14 root root 167 Jul 13  2020 ..
lrwxrwxrwx   1 root root  22 Jul 13  2020 default -> /usr/java/jdk1.8.0_181
drwxr-xr-x   7 root root 245 Jul  7  2018 jdk1.8.0_181
lrwxrwxrwx   1 root root  22 Jul 13  2020 latest -> /usr/java/jdk1.8.0_181
-sh-4.2$
-sh-4.2$
-sh-4.2$ find / -iname "java" -patch "*17*" -type f 2>/dev/null
-sh-4.2$

cada hora ele pega um agent diferenet eu nao to endendo o que voce quer logando dentro desses agents...

acabei de rodar uma nova release para pegar um nova agent consegui entra e roedie o comando acima, e deu pau


2026-07-21T18:32:21.2857669Z ##[debug]Evaluating condition for step: 'Arquivos de Configuração'
2026-07-21T18:32:21.2858155Z ##[debug]Evaluating: succeeded()
2026-07-21T18:32:21.2858324Z ##[debug]Evaluating succeeded:
2026-07-21T18:32:21.2858672Z ##[debug]=> True
2026-07-21T18:32:21.2858907Z ##[debug]Result: True
2026-07-21T18:32:21.2859134Z ##[section]Starting: Arquivos de Configuração
2026-07-21T18:32:21.2861963Z ==============================================================================
2026-07-21T18:32:21.2862066Z Task         : Bash
2026-07-21T18:32:21.2862110Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-21T18:32:21.2862173Z Version      : 3.227.0
2026-07-21T18:32:21.2862231Z Author       : Microsoft Corporation
2026-07-21T18:32:21.2862284Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-21T18:32:21.2862365Z ==============================================================================
2026-07-21T18:32:21.9945267Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-07-21T18:32:22.0617980Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-07-21T18:32:22.0625363Z ##[debug]loading inputs and endpoints
2026-07-21T18:32:22.0627325Z ##[debug]loading INPUT_TARGETTYPE
2026-07-21T18:32:22.0634995Z ##[debug]loading INPUT_FILEPATH
2026-07-21T18:32:22.0635736Z ##[debug]loading INPUT_SCRIPT
2026-07-21T18:32:22.0636549Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-07-21T18:32:22.0637184Z ##[debug]loading INPUT_FAILONSTDERR
2026-07-21T18:32:22.0639218Z ##[debug]loading INPUT_NOPROFILE
2026-07-21T18:32:22.0639828Z ##[debug]loading INPUT_NORC
2026-07-21T18:32:22.0641358Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-07-21T18:32:22.0642100Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-07-21T18:32:22.0643076Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-07-21T18:32:22.0647945Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-07-21T18:32:22.0649450Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-07-21T18:32:22.0650911Z ##[debug]loading SECRET_ANSIBLE_VAULT
2026-07-21T18:32:22.0652217Z ##[debug]loading SECRET_PW_ALOCAIP
2026-07-21T18:32:22.0652770Z ##[debug]loading SECRET_CLISECRET
2026-07-21T18:32:22.0653801Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-07-21T18:32:22.0654245Z ##[debug]loading SECRET_DB_PASS
2026-07-21T18:32:22.0654633Z ##[debug]loading SECRET_TOKEN_CRQ
2026-07-21T18:32:22.0655043Z ##[debug]loading SECRET_OKD_TOKEN_PRODUTOS
2026-07-21T18:32:22.0655643Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-07-21T18:32:22.0656853Z ##[debug]loading SECRET_API_KEY_SIRSA
2026-07-21T18:32:22.0657259Z ##[debug]loading SECRET_PW_ISILON
2026-07-21T18:32:22.0658044Z ##[debug]loading SECRET_FORTIFY_PASS
2026-07-21T18:32:22.0658576Z ##[debug]loading SECRET_API_KEY_SIICO
2026-07-21T18:32:22.0658980Z ##[debug]loading SECRET_AZPAT
2026-07-21T18:32:22.0659362Z ##[debug]loaded 25
2026-07-21T18:32:22.0663119Z ##[debug]Agent.ProxyUrl=undefined
2026-07-21T18:32:22.0663608Z ##[debug]Agent.CAInfo=undefined
2026-07-21T18:32:22.0664372Z ##[debug]Agent.ClientCert=undefined
2026-07-21T18:32:22.0664973Z ##[debug]Agent.SkipCertValidation=True
2026-07-21T18:32:22.0679821Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-07-21T18:32:22.0684660Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-07-21T18:32:22.0684991Z ##[debug]system.culture=en-US
2026-07-21T18:32:22.0689310Z ##[debug]failOnStderr=false
2026-07-21T18:32:22.0690122Z ##[debug]workingDirectory=/opt/ads-agent/_work/r11531/a
2026-07-21T18:32:22.0690488Z ##[debug]check path : /opt/ads-agent/_work/r11531/a
2026-07-21T18:32:22.0691458Z ##[debug]targetType=inline
2026-07-21T18:32:22.0691693Z ##[debug]bashEnvValue=undefined
2026-07-21T18:32:22.0714666Z ##[debug]script=REPO=$(echo _SIRSA-batch | sed 's/_//')
ansible-playbook /opt/ads-agent/esteira-batch/site.yml --tags batch --skip-tags "vm,monitoracao,autenticacao,git_conf,tsm,controlm" -e sistema_ambiente=des -e sistema_nome=sirsa-batch  -e default_working_directory_tfs=/opt/ads-agent/_work/r11531/a -e build_repository_name_tfs=$REPO -e quantidade_vm=1 -e url_deploy="`echo "http://binario.caixa:8081/repository/releases/br/gov/caixa/sirsa-batch/01.17.00.11/sirsa-batch-01.17.00.11.jar" | tr -d "\'"`" -e package_path=/opt/ads-agent/_work/r11531/a/binario/`basename http://binario.caixa:8081/repository/releases/br/gov/caixa/sirsa-batch/01.17.00.11/sirsa-batch-01.17.00.11.jar` -e site=$(site) -e batch_config=true
2026-07-21T18:32:22.0715736Z Generating script.
2026-07-21T18:32:22.0716358Z ##[debug]which 'bash'
2026-07-21T18:32:22.0716779Z ##[debug]found: '/bin/bash'
2026-07-21T18:32:22.0717193Z ##[debug]Agent.Version=3.225.2
2026-07-21T18:32:22.0717617Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-07-21T18:32:22.0718034Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-07-21T18:32:22.0718350Z ========================== Starting Command Output ===========================
2026-07-21T18:32:22.0718736Z ##[debug]which '/bin/bash'
2026-07-21T18:32:22.0719120Z ##[debug]found: '/bin/bash'
2026-07-21T18:32:22.0719551Z ##[debug]/bin/bash arg: /opt/ads-agent/_work/_temp/b8ddacbe-4285-4ba9-9f07-3a571359dc25.sh
2026-07-21T18:32:22.0719994Z ##[debug]exec tool: /bin/bash
2026-07-21T18:32:22.0720377Z ##[debug]arguments:
2026-07-21T18:32:22.0720800Z ##[debug]   /opt/ads-agent/_work/_temp/b8ddacbe-4285-4ba9-9f07-3a571359dc25.sh
2026-07-21T18:32:22.0721601Z [command]/bin/bash /opt/ads-agent/_work/_temp/b8ddacbe-4285-4ba9-9f07-3a571359dc25.sh
2026-07-21T18:32:22.0804108Z /opt/ads-agent/_work/_temp/b8ddacbe-4285-4ba9-9f07-3a571359dc25.sh: line 2: site: comando não encontrado
2026-07-21T18:32:23.5552577Z 
2026-07-21T18:32:23.5553442Z PLAY [local] *******************************************************************
2026-07-21T18:32:23.6061808Z 
2026-07-21T18:32:23.6062584Z PLAY [Configurando o DNS] ******************************************************
2026-07-21T18:32:23.7601261Z 
2026-07-21T18:32:23.7602065Z PLAY [local] *******************************************************************
2026-07-21T18:32:23.7631211Z 
2026-07-21T18:32:23.7631764Z PLAY [Verificando serviços] ****************************************************
2026-07-21T18:32:23.7665927Z 
2026-07-21T18:32:23.7666866Z PLAY [Configuração LDAP] *******************************************************
2026-07-21T18:32:23.7716653Z 
2026-07-21T18:32:23.7717023Z PLAY [batch] *******************************************************************
2026-07-21T18:32:23.7740831Z 
2026-07-21T18:32:23.7741382Z PLAY [Configura TSM] ***********************************************************
2026-07-21T18:32:23.7769774Z 
2026-07-21T18:32:23.7770374Z PLAY [Configura Control-M] *****************************************************
2026-07-21T18:32:23.7799463Z 
2026-07-21T18:32:23.7799901Z PLAY [batch] *******************************************************************
2026-07-21T18:32:23.7844726Z Tuesday 21 July 2026  15:32:23 -0300 (0:00:00.290)       0:00:00.290 ********** 
2026-07-21T18:32:25.2888975Z 
2026-07-21T18:32:25.2889916Z TASK [Gathering Facts] *********************************************************
2026-07-21T18:32:25.2890374Z ok: [caddeapllx1369.agil.nprd.caixa.gov.br]
2026-07-21T18:32:25.3228370Z Tuesday 21 July 2026  15:32:25 -0300 (0:00:01.538)       0:00:01.828 ********** 
2026-07-21T18:32:25.3649653Z 
2026-07-21T18:32:25.3650233Z TASK [Gerando lista de secure files] *******************************************
2026-07-21T18:32:25.3650501Z ok: [caddeapllx1369.agil.nprd.caixa.gov.br]
2026-07-21T18:32:25.3665843Z 
2026-07-21T18:32:25.3666453Z PLAY [batch] *******************************************************************
2026-07-21T18:32:25.3908618Z Tuesday 21 July 2026  15:32:25 -0300 (0:00:00.067)       0:00:01.896 ********** 
2026-07-21T18:32:25.9872171Z 
2026-07-21T18:32:25.9872717Z TASK [Gathering Facts] *********************************************************
2026-07-21T18:32:25.9872892Z ok: [caddeapllx1369.agil.nprd.caixa.gov.br]
2026-07-21T18:32:26.0152797Z Tuesday 21 July 2026  15:32:26 -0300 (0:00:00.624)       0:00:02.520 ********** 
2026-07-21T18:32:26.0526208Z 
2026-07-21T18:32:26.0527480Z TASK [Cria Diretórios em /opt/batch/] ******************************************
2026-07-21T18:32:26.0528368Z fatal: [caddeapllx1369.agil.nprd.caixa.gov.br]: FAILED! => {"msg": "'batch_path' is undefined"}
2026-07-21T18:32:26.0528504Z 
2026-07-21T18:32:26.0528645Z PLAY RECAP *********************************************************************
2026-07-21T18:32:26.0528852Z caddeapllx1369.agil.nprd.caixa.gov.br : ok=3    changed=0    unreachable=0    failed=1    skipped=0    rescued=0    ignored=0   
2026-07-21T18:32:26.0528943Z 
2026-07-21T18:32:26.0532987Z Tuesday 21 July 2026  15:32:26 -0300 (0:00:00.037)       0:00:02.558 ********** 
2026-07-21T18:32:26.0533334Z =============================================================================== 
2026-07-21T18:32:26.0533674Z Gathering Facts --------------------------------------------------------- 1.54s
2026-07-21T18:32:26.0533914Z Gathering Facts --------------------------------------------------------- 0.62s
2026-07-21T18:32:26.0534140Z Gerando lista de secure files ------------------------------------------- 0.07s
2026-07-21T18:32:26.0534372Z Cria Diretórios em /opt/batch/ ------------------------------------------ 0.04s
2026-07-21T18:32:26.0534530Z Playbook run took 0 days, 0 hours, 0 minutes, 2 seconds
2026-07-21T18:32:26.1015720Z ##[debug]Exit code 2 received from tool '/bin/bash'
2026-07-21T18:32:26.1016583Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-07-21T18:32:26.1040086Z ##[error]Bash exited with code '2'.
2026-07-21T18:32:26.1040613Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '2'.
2026-07-21T18:32:26.1041085Z ##[debug]task result: Failed
2026-07-21T18:32:26.1042242Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-07-21T18:32:26.1043444Z ##[section]Finishing: Arquivos de Configuração



o proble a e que aogra a demanda esta priorizada


