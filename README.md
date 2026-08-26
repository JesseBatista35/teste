2026-08-25T20:23:26.5492995Z ##[section]Starting: Deploy Pacote no JBOSS
2026-08-25T20:23:26.5496313Z ==============================================================================
2026-08-25T20:23:26.5496406Z Task         : Bash
2026-08-25T20:23:26.5496448Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-25T20:23:26.5496512Z Version      : 3.227.0
2026-08-25T20:23:26.5496566Z Author       : Microsoft Corporation
2026-08-25T20:23:26.5496616Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-25T20:23:26.5496700Z ==============================================================================
2026-08-25T20:23:27.4926644Z Generating script.
2026-08-25T20:23:27.4933911Z Script contents:
2026-08-25T20:23:27.4936666Z ansible-playbook /opt/ads-agent/_work/r15163/a/esteira-jboss-vm-v2/site.yml --tags deploy -e sistema_ambiente=des -e quantidade_vm=$(quantidade_vm) -e url_deploy="`echo "http://binario.caixa:8081/repository/snapshots/br/gov/caixa/SICMU-ear/0.0.1-SNAPSHOT/SICMU-ear-0.0.1-20260731.185324-4.ear" | tr -d "\'"`" -e package_path=/opt/ads-agent/_work/r15163/a/binario/`basename http://binario.caixa:8081/repository/snapshots/br/gov/caixa/SICMU-ear/0.0.1-SNAPSHOT/SICMU-ear-0.0.1-20260731.185324-4.ear` -e package_hash=$(HASH_BUILD) -e http_context_default=sicmu -e site=ctc_nprd
2026-08-25T20:23:27.4954296Z ========================== Starting Command Output ===========================
2026-08-25T20:23:27.4971023Z [command]/bin/bash /opt/ads-agent/_work/_temp/05d7b41b-aaee-4a16-b2ba-50774a2e29ea.sh
2026-08-25T20:23:27.4999174Z /opt/ads-agent/_work/_temp/05d7b41b-aaee-4a16-b2ba-50774a2e29ea.sh: line 1: quantidade_vm: comando não encontrado
2026-08-25T20:23:27.5032695Z /opt/ads-agent/_work/_temp/05d7b41b-aaee-4a16-b2ba-50774a2e29ea.sh: line 1: HASH_BUILD: comando não encontrado
2026-08-25T20:23:29.5938813Z 
2026-08-25T20:23:29.5939472Z PLAY [local] *******************************************************************
2026-08-25T20:23:29.6239779Z 
2026-08-25T20:23:29.6240768Z PLAY [Configurando o DNS] ******************************************************
2026-08-25T20:23:29.7862739Z 
2026-08-25T20:23:29.7863348Z PLAY [local] *******************************************************************
2026-08-25T20:23:29.7898432Z 
2026-08-25T20:23:29.7898819Z PLAY [Verificando serviços] ****************************************************
2026-08-25T20:23:29.7996126Z 
2026-08-25T20:23:29.7996574Z PLAY [Configuração LDAP] *******************************************************
2026-08-25T20:23:29.8032536Z [WARNING]: Found variable using reserved name: when
2026-08-25T20:23:29.8038618Z 
2026-08-25T20:23:29.8038851Z PLAY [jboss] *******************************************************************
2026-08-25T20:23:29.8135034Z 
2026-08-25T20:23:29.8135723Z PLAY [Stack Jboss] *************************************************************
2026-08-25T20:23:29.8385137Z Tuesday 25 August 2026  17:23:29 -0300 (0:00:00.306)       0:00:00.306 ******** 
2026-08-25T20:23:30.3484700Z 
2026-08-25T20:23:30.3486137Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-08-25T20:23:30.3486526Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-08-25T20:23:30.3504844Z 
2026-08-25T20:23:30.3505323Z PLAY [jboss] *******************************************************************
2026-08-25T20:23:30.3548647Z 
2026-08-25T20:23:30.3549306Z PLAY [jboss] *******************************************************************
2026-08-25T20:23:30.3589503Z 
2026-08-25T20:23:30.3589893Z PLAY [jboss] *******************************************************************
2026-08-25T20:23:30.3616846Z 
2026-08-25T20:23:30.3617413Z PLAY [Copiando deployments adicionais] *****************************************
2026-08-25T20:23:30.3645595Z 
2026-08-25T20:23:30.3645858Z PLAY [Copiando modules adicionais] *********************************************
2026-08-25T20:23:30.3672754Z 
2026-08-25T20:23:30.3673176Z PLAY [jboss] *******************************************************************
2026-08-25T20:23:30.3708223Z 
2026-08-25T20:23:30.3708804Z PLAY [jboss] *******************************************************************
2026-08-25T20:23:30.3747128Z Tuesday 25 August 2026  17:23:30 -0300 (0:00:00.536)       0:00:00.842 ******** 
2026-08-25T20:23:31.3515666Z 
2026-08-25T20:23:31.3516273Z TASK [Gathering Facts] *********************************************************
2026-08-25T20:23:31.3516458Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-08-25T20:23:31.3691220Z Tuesday 25 August 2026  17:23:31 -0300 (0:00:00.994)       0:00:01.836 ******** 
2026-08-25T20:23:31.7559353Z 
2026-08-25T20:23:31.7560351Z TASK [Get path of deploy] ******************************************************
2026-08-25T20:23:31.7560985Z changed: [caddeapllx2484.agil.nprd.caixa.gov.br] => (item=http://binario.caixa:8081/repository/snapshots/br/gov/caixa/SICMU-ear/0.0.1-SNAPSHOT/SICMU-ear-0.0.1-20260731.185324-4.ear)
2026-08-25T20:23:31.7680549Z Tuesday 25 August 2026  17:23:31 -0300 (0:00:00.398)       0:00:02.235 ******** 
2026-08-25T20:23:31.8260429Z 
2026-08-25T20:23:31.8261231Z TASK [set package_urls] ********************************************************
2026-08-25T20:23:31.8261411Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-08-25T20:23:31.8391296Z Tuesday 25 August 2026  17:23:31 -0300 (0:00:00.071)       0:00:02.306 ******** 
2026-08-25T20:23:32.1552634Z 
2026-08-25T20:23:32.1553212Z TASK [reload systemctl] ********************************************************
2026-08-25T20:23:32.1553387Z changed: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-08-25T20:23:32.1870657Z Tuesday 25 August 2026  17:23:32 -0300 (0:00:00.347)       0:00:02.654 ******** 
2026-08-25T20:23:32.5958743Z 
2026-08-25T20:23:32.5960022Z TASK [Verifica o se package existe] ********************************************
2026-08-25T20:23:32.5960958Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r15163/a/binario/SICMU-ear-0.0.1-20260731.185324-4.ear)
2026-08-25T20:23:32.6089887Z Tuesday 25 August 2026  17:23:32 -0300 (0:00:00.422)       0:00:03.076 ******** 
2026-08-25T20:23:33.4630019Z 
2026-08-25T20:23:33.4630938Z TASK [Deploy do pacote Local] **************************************************
2026-08-25T20:23:33.4631403Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r15163/a/binario/SICMU-ear-0.0.1-20260731.185324-4.ear)
2026-08-25T20:23:33.4759485Z Tuesday 25 August 2026  17:23:33 -0300 (0:00:00.866)       0:00:03.943 ******** 
2026-08-25T20:23:33.7547496Z 
2026-08-25T20:23:33.7548727Z TASK [Verifica se o arquivo /opt/jboss-eap/standalone/configuration/custom-deploy.sh existe] ***
2026-08-25T20:23:33.7548940Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-08-25T20:23:33.7665845Z Tuesday 25 August 2026  17:23:33 -0300 (0:00:00.290)       0:00:04.234 ******** 
2026-08-25T20:23:33.8208818Z Tuesday 25 August 2026  17:23:33 -0300 (0:00:00.054)       0:00:04.288 ******** 
2026-08-25T20:23:34.5069211Z 
2026-08-25T20:23:34.5069996Z TASK [Garante que o Jboss esteja startado] *************************************
2026-08-25T20:23:34.5071131Z fatal: [caddeapllx2484.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "msg": "Unable to start service jboss-eap-standalone: Job for jboss-eap-standalone.service failed because the control process exited with error code. See \"systemctl status jboss-eap-standalone.service\" and \"journalctl -xe\" for details.\n"}
2026-08-25T20:23:34.5078783Z 
2026-08-25T20:23:34.5079054Z PLAY RECAP *********************************************************************
2026-08-25T20:23:34.5079283Z caddeapllx2484.agil.nprd.caixa.gov.br : ok=8    changed=2    unreachable=0    failed=1    skipped=1    rescued=0    ignored=0   
2026-08-25T20:23:34.5079376Z 
2026-08-25T20:23:34.5080124Z Tuesday 25 August 2026  17:23:34 -0300 (0:00:00.687)       0:00:04.975 ******** 
2026-08-25T20:23:34.5080410Z =============================================================================== 
2026-08-25T20:23:34.5080851Z Gathering Facts --------------------------------------------------------- 0.99s
2026-08-25T20:23:34.5081527Z Deploy do pacote Local -------------------------------------------------- 0.87s
2026-08-25T20:23:34.5082128Z Garante que o Jboss esteja startado ------------------------------------- 0.69s
2026-08-25T20:23:34.5082440Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.54s
2026-08-25T20:23:34.5082713Z Verifica o se package existe -------------------------------------------- 0.42s
2026-08-25T20:23:34.5082965Z Get path of deploy ------------------------------------------------------ 0.40s
2026-08-25T20:23:34.5083186Z reload systemctl -------------------------------------------------------- 0.35s
2026-08-25T20:23:34.5083435Z Verifica se o arquivo /opt/jboss-eap/standalone/configuration/custom-deploy.sh existe --- 0.29s
2026-08-25T20:23:34.5083674Z set package_urls -------------------------------------------------------- 0.07s
2026-08-25T20:23:34.5083902Z Executa shell customizada do deploy ------------------------------------- 0.05s
2026-08-25T20:23:34.5085467Z Playbook run took 0 days, 0 hours, 0 minutes, 4 seconds
2026-08-25T20:23:34.5779990Z ##[error]Bash exited with code '2'.
2026-08-25T20:23:34.5810420Z ##[section]Finishing: Deploy Pacote no JBOSS



