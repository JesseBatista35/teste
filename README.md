Prezados, solicitamos verificar esteira de release de TQS do projeto:

SIPNC-conta2777-microfront

Estamos com problema na task "Criando nova APP"
 
Esteira: https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-pipeline-progress&releaseId=531627


2026-09-23T12:55:43.3552884Z ##[section]Starting: Criando nova APP
2026-09-23T12:55:43.3555812Z ==============================================================================
2026-09-23T12:55:43.3555897Z Task         : Bash
2026-09-23T12:55:43.3555940Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-23T12:55:43.3556000Z Version      : 3.227.0
2026-09-23T12:55:43.3556044Z Author       : Microsoft Corporation
2026-09-23T12:55:43.3556113Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-23T12:55:43.3556183Z ==============================================================================
2026-09-23T12:55:43.4998001Z Generating script.
2026-09-23T12:55:43.5010281Z ========================== Starting Command Output ===========================
2026-09-23T12:55:43.5017904Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/7682a17d-0ae9-4440-a42b-8c80a09b0033.sh
2026-09-23T12:55:43.5071040Z OKD4 NPRD - des, tqs ou hmp
2026-09-23T12:55:43.5777704Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-09-23T12:55:43.5778047Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-09-23T12:55:43.5778236Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-09-23T12:55:43.7087206Z Iniciando criação da APP
2026-09-23T12:55:43.8144103Z error: error processing template "openshift/angular-caixa-release": the namespace of the provided object does not match the namespace sent on the request
2026-09-23T12:55:43.8217585Z ##[error]Bash exited with code '1'.
2026-09-23T12:55:43.8232127Z ##[section]Finishing: Criando nova APP



<img width="1881" height="894" alt="image" src="https://github.com/user-attachments/assets/6b75b98c-cea5-4b78-a9bf-97fc3cb7c9b4" />


as taks cria_app_okd e

Exporta_Varaivle_cira_projeto_okd 

estavam com versoes antigas. atualizae para as mais noves e rodei uma nova release..



<img width="1657" height="778" alt="image" src="https://github.com/user-attachments/assets/544b0f03-b41c-4295-a070-9802afd30ddc" />



deploy efetuadso com uscess o em TQS.



<img width="1858" height="922" alt="image" src="https://github.com/user-attachments/assets/0cc2d689-9a89-441f-bfdc-0018e1a2bf8e" />



me ajdua com anota para fechar a w.o

