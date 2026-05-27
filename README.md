
Application Insights
Caixa Economica Federal (caixa.onmicrosoft.com)

appi-sisag-teams-des
Application Insights
Pesquisar

Visão geral
Log de atividade
IAM (Controle de acesso)
Marcações
Diagnosticar e resolver problemas
Visualizador de recursos

Investigar

Monitoramento

Uso

Configurar

Configurações

Automação

Ajuda
Adicione ou remova favoritos pressionando Ctrl+Shift+F

Exibição JSON
Grupo de recursos
(mover)
:
rg-sisag-teams-des
Local
:
Brazil South
Assinatura
(mover)
:
Serviços Compartilhados - DES
ID da Assinatura
:
7c5df858-6a37-43e8-baa4-7604626e1c5f
Chave de Instrumentação
:
6f78d4b0-89af-499e-b800-d1ab40750c8a
Cadeia de Conexão
:
InstrumentationKey=6f78d4b0-89af-499e-b800-d1ab40750c8a;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/;ApplicationId=894334cc-9c0e-46d3-8368-94a28d672944
Workspace
:
law-sisag-teams-des
Marcações
(editar)
:
















Mostrar dados para o último:
30 minutos
1 hora
6 horas
12 horas
1 dia
3 dias
7 dias
30 dias
Solicitações com falha
13:45
14
14:15
14:30
UTC-03:00
0
20
40
60
80
100
Failed requests (Contagem), appi-sisag-teams-des
0
Tempo de resposta do servidor
13:45
14
14:15
14:30
UTC-03:00
0ms
20ms
40ms
60ms
80ms
100ms
Server response time (Média), appi-sisag-teams-des
--
Solicitações do servidor
13:45
14
14:15
14:30
UTC-03:00
0
20
40
60
80
100
Server requests (Contagem), appi-sisag-teams-des
0
Disponibilidade
13:45
14
14:15
14:30
UTC-03:00
0%
20%
40%
60%
80%
100%
Availability (Média), appi-sisag-teams-des
--



mais a release nao suvbiu ta dano esse erro:


2026-05-27T17:38:04.1164200Z ##[section]Starting: Inclui agente do Application Insights definido na variável VERSAO_INSIGHTS
2026-05-27T17:38:04.1319283Z ==============================================================================
2026-05-27T17:38:04.1319606Z Task         : Bash
2026-05-27T17:38:04.1319743Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-05-27T17:38:04.1319830Z Version      : 3.227.0
2026-05-27T17:38:04.1319940Z Author       : Microsoft Corporation
2026-05-27T17:38:04.1320070Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-05-27T17:38:04.1320145Z ==============================================================================
2026-05-27T17:38:05.1208360Z Generating script.
2026-05-27T17:38:05.1209280Z ========================== Starting Command Output ===========================
2026-05-27T17:38:05.1274599Z [command]/bin/bash /opt/ads-agent/_work/_temp/53dd6935-f051-4fd0-8b3a-808ed699effc.sh
2026-05-27T17:38:05.1274898Z ################################################################
2026-05-27T17:38:05.1275018Z 
2026-05-27T17:38:05.1275199Z VERSÃO DO APPLICATION INSIGHTS ESCOLHIDA: 3.1.1
2026-05-27T17:38:05.1275257Z 
2026-05-27T17:38:05.1275353Z ################################################################
2026-05-27T17:38:05.1354570Z /opt/ads-agent/_work/_temp/53dd6935-f051-4fd0-8b3a-808ed699effc.sh: line 16: Build.StagingDirectory: comando não encontrado
2026-05-27T17:38:05.1361697Z mv: falta o operando arquivo de destino após “applicationinsights-agent-3.1.1.jar”
2026-05-27T17:38:05.1376432Z Try 'mv --help' for more information.
2026-05-27T17:38:05.1398128Z ##[error]Bash exited with code '1'.
2026-05-27T17:38:05.1436978Z ##[section]Finishing: Inclui agente do Application Insights definido na variável VERSAO_INSIGHTS
