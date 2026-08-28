Fazer Suporte ao ambiente de aplicação nas esteiras DevOps
Qual o nome do Sistema?*:	SIBEM
Qual o ambiente*:	DES
Selecione a sua Comunidade*:	Contratações e Logística
Formas de contato*:	TEAMS
Descrição da necessidade*:	Prezados, mesmo com a REQ000145529309 finalizada seguimos sem conseguir gerar a Pipeline do SIBEM-doacao-frontend-intranet

https://devops.caixa/projetos/Caixa/_build/results?buildId=808381&view=results

Analisamos e pode ser esse o problema mas pedimos auxilio na avaliação e correção:
Fui até a configuração da esteira e confirmei que o "SONAR_PROPERTIES", vindo do grupo compartilhado "SONAR VARIABLES - ESTEIRA", possui parâmetros de cobertura Java/JaCoCo/JUnit, mas não há parâmetro apontando para o relatório LCOV gerado pelo Jest, como "sonar.javascript.lcov.reportPaths=coverage/lcov.info".

Sendo assim, pelas evidências, os testes e a cobertura estão sendo gerados normalmente pelo Jest, mas essa cobertura não está sendo importada pelo Sonar.

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
/usr/bin/bash /opt/ads-agent/_work/_temp/69c38c9a-058a-4bdb-8f55-395bdb019d1b.sh
QG Script --> Using SonarQube instance http://sonar-esteira.apps.produtos4.caixa
QG Script --> Using SonarQube access login ads-sa
QG Script --> Using task id of AaA_Pq0zGHDk3iLob80Z
QG Script --> Status of SonarQube task is PENDING
QG Script --> Status of SonarQube task is PENDING
QG Script --> Status of SonarQube task is PENDING
QG Script --> Status of SonarQube task is PENDING
QG Script --> Status of SonarQube task is PENDING
QG Script --> Status of SonarQube task is PENDING
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is SUCCESS
QG Script --> Using analysis id of AaA_PzIPY43_fXmT-OVV
QG Script --> Quality Gate status is ERROR
##[error]QG Script --> Ocorrência prevista na TE102 - Não atendimento aos critérios de qualidade
##[error]Bash exited with code '1'.
Finishing: Publish Quality Gate Result





deu certo eles fizeram os ajustes


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
/usr/bin/bash /opt/ads-agent/_work/_temp/16cddb2b-cced-43c8-be71-d914ba050214.sh
QG Script --> Using SonarQube instance http://sonar-esteira.apps.produtos4.caixa
QG Script --> Using SonarQube access login ads-sa
QG Script --> Using task id of AaBE9e17GHDk3iLob-p8
QG Script --> Status of SonarQube task is SUCCESS
QG Script --> Using analysis id of AaBE9fJyY43_fXmTTU1U
QG Script --> Quality Gate status is OK
Finishing: Publish Quality Gate Result
