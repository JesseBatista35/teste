2026-10-01T17:49:28.1055427Z ##[section]Starting: Logs da Aplicação
2026-10-01T17:49:28.1058567Z ==============================================================================
2026-10-01T17:49:28.1058807Z Task         : Bash
2026-10-01T17:49:28.1058860Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-01T17:49:28.1058921Z Version      : 3.227.0
2026-10-01T17:49:28.1058963Z Author       : Microsoft Corporation
2026-10-01T17:49:28.1059018Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-01T17:49:28.1059088Z ==============================================================================
2026-10-01T17:49:28.2404488Z Generating script.
2026-10-01T17:49:28.2414996Z ========================== Starting Command Output ===========================
2026-10-01T17:49:28.2422127Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/20bbd64b-e553-4c82-bf1d-7d881f8c552f.sh
2026-10-01T17:49:28.2475993Z + shopt -s expand_aliases
2026-10-01T17:49:28.2476530Z + [[ -n okd4_nprd ]]
2026-10-01T17:49:28.2476864Z + [[ okd4_nprd =~ ocp ]]
2026-10-01T17:49:28.2479042Z + [[ -n okd4_nprd ]]
2026-10-01T17:49:28.2479323Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-10-01T17:49:28.2479509Z + app=sigec-com-frontend-des
2026-10-01T17:49:28.2479610Z + oc version
2026-10-01T17:49:28.3353348Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-10-01T17:49:28.3353596Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-10-01T17:49:28.3353792Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-10-01T17:49:28.3391713Z ++ oc get pod -l name=sigec-com-frontend-des -n sigec-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-10-01T17:49:28.3393911Z ++ tac
2026-10-01T17:49:28.3394685Z ++ grep -v '^$'
2026-10-01T17:49:28.3394899Z ++ head -n1
2026-10-01T17:49:28.4390925Z + last_pod=sigec-com-frontend-des-16-zw9k5
2026-10-01T17:49:28.4391246Z + echo 'Logs do POD: sigec-com-frontend-des-16-zw9k5'
2026-10-01T17:49:28.4391545Z + oc logs sigec-com-frontend-des-16-zw9k5 -c sigec-com-frontend-des -n sigec-des
2026-10-01T17:49:28.4391781Z Logs do POD: sigec-com-frontend-des-16-zw9k5
2026-10-01T17:49:28.5332041Z ====== CONTEUDO DISPONIVEL PARA O NGINX ======
2026-10-01T17:49:28.5332647Z /opt/app-root/src/favicon.ico
2026-10-01T17:49:28.5333572Z /opt/app-root/src/index.html
2026-10-01T17:49:28.5333872Z /opt/app-root/src/main-GEDX7JHW.js
2026-10-01T17:49:28.5334133Z /opt/app-root/src/media/CAIXAStd-Bold-5EQSECIG.woff
2026-10-01T17:49:28.5334401Z /opt/app-root/src/media/CAIXAStd-Bold-IQIQ75RM.woff2
2026-10-01T17:49:28.5334600Z /opt/app-root/src/media/CAIXAStd-BoldItalic-7YK6XUJI.woff
2026-10-01T17:49:28.5337489Z /opt/app-root/src/media/CAIXAStd-BoldItalic-GUSPHHT5.woff2
2026-10-01T17:49:28.5337891Z /opt/app-root/src/media/CAIXAStd-Regular-HCDFS2NR.woff2
2026-10-01T17:49:28.5338136Z /opt/app-root/src/media/CAIXAStd-Regular-LZO4VLPC.woff
2026-10-01T17:49:28.5338393Z /opt/app-root/src/media/CAIXAStd-SemiBold-M2VWJILV.woff
2026-10-01T17:49:28.5338587Z /opt/app-root/src/media/CAIXAStd-SemiBold-O2ITU6XV.woff2
2026-10-01T17:49:28.5338798Z /opt/app-root/src/media/CAIXAStd-SemiBoldItalic-D7W3F35V.woff2
2026-10-01T17:49:28.5338991Z /opt/app-root/src/media/CAIXAStd-SemiBoldItalic-TW5LEXRM.woff
2026-10-01T17:49:28.5339180Z /opt/app-root/src/media/futura-bold-BBQ4OA6N.ttf
2026-10-01T17:49:28.5339368Z /opt/app-root/src/media/futura-bold-italic-ZYM57P66.ttf
2026-10-01T17:49:28.5339550Z /opt/app-root/src/media/futura-book-MI3YEQRX.ttf
2026-10-01T17:49:28.5339733Z /opt/app-root/src/media/futura-book-italic-LWS33T2C.ttf
2026-10-01T17:49:28.5339899Z /opt/app-root/src/media/futura-heavy-K6VHVMZP.ttf
2026-10-01T17:49:28.5340080Z /opt/app-root/src/media/futura-heavy-italic-TWWLHNVT.ttf
2026-10-01T17:49:28.5340261Z /opt/app-root/src/media/futura-medium-X6FVHNJE.ttf
2026-10-01T17:49:28.5340442Z /opt/app-root/src/media/futura-medium-italic-R5EH4NYN.ttf
2026-10-01T17:49:28.5340621Z /opt/app-root/src/media/material-icons-LEZCGFVT.woff2
2026-10-01T17:49:28.5340811Z /opt/app-root/src/media/material-icons-outlined-7BWLPMFK.woff2
2026-10-01T17:49:28.5341383Z /opt/app-root/src/media/material-icons-round-WEHMTW23.woff2
2026-10-01T17:49:28.5341573Z /opt/app-root/src/media/material-icons-sharp-HCCYMPXE.woff2
2026-10-01T17:49:28.5341830Z /opt/app-root/src/media/material-icons-two-tone-M5N5K6F5.woff2
2026-10-01T17:49:28.5342004Z /opt/app-root/src/polyfills-EO764MBO.js
2026-10-01T17:49:28.5342176Z /opt/app-root/src/styles-MVOUFIU7.css
2026-10-01T17:49:28.5342293Z AVISO: URL_API nao foi informada
2026-10-01T17:49:28.5342396Z AVISO: URL_SSO nao foi informada
2026-10-01T17:49:28.5342706Z [01/Oct/2026:14:48:52 -0300] 127.0.0.1 - - - _ to: -: GET /stub_status HTTP/1.1 upstream_response_time - msec 1790876932.867 request_time 0.000 200 97 - NGINX-Prometheus-Exporter/v -
2026-10-01T17:49:28.5343056Z [01/Oct/2026:14:49:07 -0300] 25.3.40.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790876947.686 request_time 0.000 200 108847 - kube-probe/1.25 -
2026-10-01T17:49:28.5343385Z [01/Oct/2026:14:49:17 -0300] 25.3.40.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790876957.685 request_time 0.000 200 108847 - kube-probe/1.25 -
2026-10-01T17:49:28.5343705Z [01/Oct/2026:14:49:17 -0300] 25.3.40.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790876957.685 request_time 0.001 200 108847 - kube-probe/1.25 -
2026-10-01T17:49:28.5344023Z [01/Oct/2026:14:49:27 -0300] 25.3.40.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790876967.685 request_time 0.000 200 108847 - kube-probe/1.25 -
2026-10-01T17:49:28.5344343Z [01/Oct/2026:14:49:27 -0300] 25.3.40.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790876967.685 request_time 0.000 200 108847 - kube-probe/1.25 -
2026-10-01T17:49:28.5439561Z ##[section]Finishing: Logs da Aplicação



rodei um deplo y novo em uma nova tag que eles passaram hoje e deu certo

passou
Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIGEC-com-frontend
/
SIGEC-com-frontend-0.1.1.6(1)
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings
SIGEC-com-frontend

SIGEC-com-frontend-0.1.1.6(1)


EC DES

Succeeded


Pipeline

Tasks

Variables

Logs

Tests
Agent job
Started: 01/10/2026, 14:47:12
Pool:
Release-Linux-OKD4
·
Agent: azp-ads-agent-release-5cd876f98-99vfs

2m 20s

Initialize job
·
succeeded
<1s

Download Artifacts
·
succeeded
1 warning
<1s

Valida Variáveis Obrigatórias
·
succeeded
<1s

Recuperando URL Pacote Nexus
·
succeeded
1s

Recupera Pacote
·
succeeded
<1s

Recuperando nome do repositório
·
succeeded
1s

Convertendo Minúsculo e Definindo nome do Projeto/Repositório
·
succeeded
<1s

Corrigindo Codificação Arquivos dos2unix
·
succeeded
<1s

Alterando Valores placeholders nos arquivos de config
·
succeeded
<1s

Git clone https://devops.caixa/projetos/Infraestrutura/_git/esteira-logs
·
succeeded
<1s

Cria Streams Graylog
·
succeeded
3s

Recupera VEC
·
succeeded
1s

VEC - Aferição
·
succeeded
<1s

Login OpenShift
·
succeeded
<1s

Exportando Variáveis de Ambiente "_ENV."
·
succeeded
<1s

Criando novo Projeto
·
succeeded
3s

Adicionando ISTIO_INJECTION
·
skipped


Criando nova APP
·
succeeded
<1s

Atualizando Variáveis de Ambiente
·
succeeded
<1s

Criando Rota Customizada
·
succeeded
<1s

Aplicando Service Mesh
·
skipped


Excluindo ConfigMap nginx-conf.d
·
succeeded
<1s

Criando o ConfigMap nginx-conf.d
·
succeeded
<1s

Configurando o ConfigMap nginx-conf.d
·
succeeded
<1s

Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
·
succeeded
22s

Concedendo Acesso OKD
·
succeeded
<1s

Verificando IP de Saída
·
succeeded
<1s

Configurando IP de Saída - deployment
·
skipped


Configurando IP de Saída - deploymentconfig
·
succeeded
<1s

Cadastrando no Portal IIF
·
succeeded
<1s

Verificando Status do Deployment
·
succeeded
1m 34s

Logs da Aplicação
·
succeeded

<1s

Resumo da Release
·
succeeded
<1s

Coletando dados da imagem
·
succeeded
3s

Atualizando versão no PortalIF
·
succeeded
<1s

Realizando Logout OKD
·
succeeded
<1s

Finalize Job
·
succeeded
<1s
Expanded

Collapsed

Collapsed

Expanded

1 pipelines found

Row 2

Row 2

Showing filters 1 through 2

Row 2

Row 2

Row 2

Row 2


