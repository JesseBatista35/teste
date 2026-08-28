
Verificar problemas geração de pipeline parece que ele não está lendo os arquivos novos de teste oque gera percentual baixo de cobertura. 

Estou com problemas geração de pipeline parece que ele não está lendo os arquivos novos de teste oque gera percentual baixo de cobertura. 

https://devops.caixa/projetos/Caixa/_git/SIFAP-backend

Publish Quality Gate Result

View raw log

Starting: Publish Quality Gate Result
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/00bbe6bf-a511-4d27-b6fa-04611167261f.sh
QG Script --> Using SonarQube instance http://sonar.apps.produtos4.caixa
QG Script --> Using SonarQube access login ads-sa
QG Script --> Using task id of AaBIY16G1aD2bmOGCFIb
QG Script --> Status of SonarQube task is PENDING
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is SUCCESS
QG Script --> Using analysis id of AaBIY2jgxfza9vY27J6X
QG Script --> Quality Gate status is ERROR
##[error]QG Script --> Ocorrência prevista na TE102 - Não atendimento aos critérios de qualidade
##[error]Bash exited with code '1'.
Finishing: Publish Quality Gate Result



falei com demandante apontanso os erros ele fez a correcçao e passou

<img width="800" height="445" alt="image" src="https://github.com/user-attachments/assets/f26d14fe-85e6-4ba5-bf79-ac46ae98bbfa" />


Publish Quality Gate Result

View raw log

Starting: Publish Quality Gate Result
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/7bce658e-8aee-48e6-aa71-6cda7b540fdf.sh
QG Script --> Using SonarQube instance http://sonar.apps.produtos4.caixa
QG Script --> Using SonarQube access login ads-sa
QG Script --> Using task id of AaBIf0hP1aD2bmOGCFJb
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is SUCCESS
QG Script --> Using analysis id of AaBIf0nNxfza9vY29ngA
QG Script --> Quality Gate status is OK
Finishing: Publish Quality Gate Result


em ajdua co mteto simples para fechar a demanda


