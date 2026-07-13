2026-07-13T19:38:01.8015458Z ##[section]Starting: Bash Script
2026-07-13T19:38:01.8020314Z ==============================================================================
2026-07-13T19:38:01.8020437Z Task         : Bash
2026-07-13T19:38:01.8020491Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-13T19:38:01.8020555Z Version      : 3.227.0
2026-07-13T19:38:01.8020689Z Author       : Microsoft Corporation
2026-07-13T19:38:01.8020756Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-13T19:38:01.8020830Z ==============================================================================
2026-07-13T19:38:02.3741450Z Generating script.
2026-07-13T19:38:02.3753277Z ========================== Starting Command Output ===========================
2026-07-13T19:38:02.3760630Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/fd35cff4-c2ec-47f8-8cb2-97d53ba6df6c.sh
2026-07-13T19:38:02.3824246Z ===== DEBUG VARIAVEIS =====
2026-07-13T19:38:02.3824436Z AMBIENTE = des
2026-07-13T19:38:02.3824554Z PROJETO = simpi
2026-07-13T19:38:02.3824747Z KIND_DEPLOY = deploymentconfig
2026-07-13T19:38:02.3825188Z resource_app (raw) = simpi-med-des
2026-07-13T19:38:02.3830812Z /opt/ads-agent/_work/_temp/fd35cff4-c2ec-47f8-8cb2-97d53ba6df6c.sh: line 7: sistema_nome: command not found
2026-07-13T19:38:02.3831997Z sistema_nome = 
2026-07-13T19:38:02.3837110Z /opt/ads-agent/_work/_temp/fd35cff4-c2ec-47f8-8cb2-97d53ba6df6c.sh: line 8: is_new_app: command not found
2026-07-13T19:38:02.3838065Z is_new_app() = 
2026-07-13T19:38:02.3838741Z resource_app() = simpi-med-des
2026-07-13T19:38:02.3839188Z ============================
2026-07-13T19:38:02.3839240Z 
2026-07-13T19:38:02.3839364Z ===== COMANDO QUE SERIA EXECUTADO =====
2026-07-13T19:38:02.3839582Z oc set env deploymentconfig "simpi-med-des" -n simpi-des --list
2026-07-13T19:38:02.3839731Z ========================================
2026-07-13T19:38:02.3839785Z 
2026-07-13T19:38:02.3839903Z ===== VALIDANDO RECURSO NO CLUSTER =====
2026-07-13T19:38:02.5299979Z Warning: apps.openshift.io/v1 DeploymentConfig is deprecated in v4.14+, unavailable in v4.10000+
2026-07-13T19:38:02.6573920Z deploymentconfig.apps.openshift.io/simpi-api-resolve-pendencia-des
2026-07-13T19:38:02.6574327Z deploymentconfig.apps.openshift.io/simpi-cadastro-fluxo-des
2026-07-13T19:38:02.6574533Z deploymentconfig.apps.openshift.io/simpi-container-contabil-des
2026-07-13T19:38:02.6574749Z deploymentconfig.apps.openshift.io/simpi-container-dict-des
2026-07-13T19:38:02.6574968Z deploymentconfig.apps.openshift.io/simpi-container-frontend-des
2026-07-13T19:38:02.6575204Z deploymentconfig.apps.openshift.io/simpi-container-mensageria-des
2026-07-13T19:38:02.6575421Z deploymentconfig.apps.openshift.io/simpi-container-polling-des
2026-07-13T19:38:02.6575632Z deploymentconfig.apps.openshift.io/simpi-dict-politicas-des
2026-07-13T19:38:02.6575854Z deploymentconfig.apps.openshift.io/simpi-envio-pagamento-interno-des
2026-07-13T19:38:02.6576057Z deploymentconfig.apps.openshift.io/simpi-med-des
2026-07-13T19:38:02.6576287Z deploymentconfig.apps.openshift.io/simpi-mensageria-automatico-dlq-des
2026-07-13T19:38:02.6576520Z deploymentconfig.apps.openshift.io/simpi-mensageria-envio-administrativo-des
2026-07-13T19:38:02.6576753Z deploymentconfig.apps.openshift.io/simpi-mensageria-envio-automatico-des
2026-07-13T19:38:02.6576965Z deploymentconfig.apps.openshift.io/simpi-mensageria-envio-des
2026-07-13T19:38:02.6577167Z deploymentconfig.apps.openshift.io/simpi-mensageria-envio-secundario-des
2026-07-13T19:38:02.6577392Z deploymentconfig.apps.openshift.io/simpi-mensageria-envio-transacional-des
2026-07-13T19:38:02.6577617Z deploymentconfig.apps.openshift.io/simpi-mensageria-expiradas-des
2026-07-13T19:38:02.6577837Z deploymentconfig.apps.openshift.io/simpi-mensageria-expiradas-jboss-des
2026-07-13T19:38:02.6578066Z deploymentconfig.apps.openshift.io/simpi-mensageria-recebimento-automatico-des
2026-07-13T19:38:02.6578289Z deploymentconfig.apps.openshift.io/simpi-mensageria-recebimento-des
2026-07-13T19:38:02.6578623Z deploymentconfig.apps.openshift.io/simpi-mensageria-recebimento-secundario-des
2026-07-13T19:38:02.6579284Z deploymentconfig.apps.openshift.io/simpi-mensageria-retorno-administrativas-des
2026-07-13T19:38:02.6579562Z deploymentconfig.apps.openshift.io/simpi-mensageria-retorno-canceladas-des
2026-07-13T19:38:02.6579854Z deploymentconfig.apps.openshift.io/simpi-mensageria-retorno-des
2026-07-13T19:38:02.6580086Z deploymentconfig.apps.openshift.io/simpi-mensageria-roteador-automatico-des
2026-07-13T19:38:02.6580306Z deploymentconfig.apps.openshift.io/simpi-mensageria-secundario-des
2026-07-13T19:38:02.6580517Z deploymentconfig.apps.openshift.io/simpi-pix-batch-des
2026-07-13T19:38:02.6580708Z deploymentconfig.apps.openshift.io/simpi-pix-batch-secundario-des
2026-07-13T19:38:02.6580917Z deploymentconfig.apps.openshift.io/simpi-pix-carga-bacen-des
2026-07-13T19:38:02.6581117Z deploymentconfig.apps.openshift.io/simpi-pix-contabil-des
2026-07-13T19:38:02.6581319Z deploymentconfig.apps.openshift.io/simpi-pix-frontend-des
2026-07-13T19:38:02.6581529Z deploymentconfig.apps.openshift.io/simpi-pix-gestao-batch-des
2026-07-13T19:38:02.6581733Z deploymentconfig.apps.openshift.io/simpi-pix-gestao-des
2026-07-13T19:38:02.6581956Z deploymentconfig.apps.openshift.io/simpi-pix-mensageria-envio-sencundario-des
2026-07-13T19:38:02.6582197Z deploymentconfig.apps.openshift.io/simpi-pix-mensageria-recebimento-secundario-des
2026-07-13T19:38:02.6582411Z deploymentconfig.apps.openshift.io/simpi-pix-polling-des
2026-07-13T19:38:02.6582621Z deploymentconfig.apps.openshift.io/simpi-pix-polling-primario-des
2026-07-13T19:38:02.6582943Z deploymentconfig.apps.openshift.io/simpi-pix-polling-secundario-des
2026-07-13T19:38:02.6583166Z deploymentconfig.apps.openshift.io/simpi-pix-processador-xml-primario-des
2026-07-13T19:38:02.6583374Z deploymentconfig.apps.openshift.io/simpi-pix-processador-xml-secundario-des
2026-07-13T19:38:02.6583587Z deploymentconfig.apps.openshift.io/simpi-pix-relatorio-des
2026-07-13T19:38:02.6583800Z deploymentconfig.apps.openshift.io/simpi-pix-resolve-pendencia-des
2026-07-13T19:38:02.6584025Z deploymentconfig.apps.openshift.io/simpi-pix-resolve-pendencia-externo-des
2026-07-13T19:38:02.6584242Z deploymentconfig.apps.openshift.io/simpi-pix-roteador-backend-des
2026-07-13T19:38:02.6584710Z deploymentconfig.apps.openshift.io/simpi-pix-roteador-frontend-des
2026-07-13T19:38:02.6585000Z deploymentconfig.apps.openshift.io/simpi-pix-simulador-icom-des
2026-07-13T19:38:02.6585210Z deploymentconfig.apps.openshift.io/simpi-polling-secundario-des
2026-07-13T19:38:02.6585426Z deploymentconfig.apps.openshift.io/simpi-processador-xml-primario-des
2026-07-13T19:38:02.6585646Z deploymentconfig.apps.openshift.io/simpi-processador-xml-secundario-des
2026-07-13T19:38:02.6585859Z deploymentconfig.apps.openshift.io/simpi-processar-log-dict-des
2026-07-13T19:38:02.6586062Z deploymentconfig.apps.openshift.io/simpi-rate-limit-des
2026-07-13T19:38:02.6586251Z deploymentconfig.apps.openshift.io/simpi-resolve-pendencia-des
2026-07-13T19:38:02.6586463Z deploymentconfig.apps.openshift.io/simpi-retorno-pagamento-interno-des
2026-07-13T19:38:02.6586677Z deploymentconfig.apps.openshift.io/simpi-roteador-ambientes-des
2026-07-13T19:38:02.6586881Z deploymentconfig.apps.openshift.io/simpi-simulador-icon-des
2026-07-13T19:38:02.6587040Z ==========================================
2026-07-13T19:38:02.6644675Z ##[section]Finishing: Bash Script
