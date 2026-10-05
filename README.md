Aplicação SIREP Frontend Intranet Novo indisponível após deploy em DES2
Em resposta a REQ000146319877, informamos que a alteração feita na branch CESTI_TESTE, na WO0000081760585, não surtiu o efeito esperado e a aplicação continua apresentado o mesmo retorno: Application is not available
Solicito apoio na análise da aplicação SIREP Frontend Intranet Novo implantada no ambiente DES2.

Após a execução da release, o deployment foi concluído com sucesso pela esteira, porém a aplicação permanece indisponível ao acessar a URL:

https://sirep-frontend-intranet-novo-des2-des.apps.nprd.caixa


Retorno apresentado:

Application is not available


Durante a análise dos logs da release, foram observados os seguintes comportamentos:

O pacote foi recuperado com sucesso do Nexus e a imagem localizada no registry.
O DeploymentConfig foi atualizado normalmente.
O rollout foi executado e concluído com sucesso:
replication controller
"sirep-frontend-intranet-novo-des2-des-15"
successfully rolled out

Entretanto, na etapa de coleta dos logs da aplicação, a própria esteira não conseguiu localizar nenhum pod associado à aplicação:
oc get pod -l name=sirep-frontend-intranet-novo-des2-des -n sirep-des

last_pod=
Bash exited with code '1'


Diante desse comportamento, solicitamos verificar no namespace:

sirep-des


a aplicação:

sirep-frontend-intranet-novo-des2-des


realizando as seguintes validações:

Status dos pods;
Eventos do DeploymentConfig;
Existência de pods em CrashLoopBackOff;
Falhas de Readiness Probe ou Liveness Probe;
Logs dos containers da aplicação;
Existência de endpoints ativos associados ao Service;
Possíveis falhas na inicialização do Nginx ou da aplicação Angular.

Informações adicionais:

Release: SIREP-frontend-novo-1.0.0-SNAPSHOT(74)
Ambiente: EC DES2
Namespace: sirep-des
Imagem implantada:
build-images-ads/sirep-frontend-novo:1.0.0-SNAPSHOT


Observação: esta versão contempla atualização tecnológica do frontend para Angular 19, o que pode auxiliar na investigação de eventuais problemas de inicialização da aplicação.

Agradeço o apoio e fico à disposição para fornecer informações adicionais.

Atenciosamente,

Gabriel Sampaio


Aplicação SIREP Frontend Intranet Novo indisponível após deploy em DES2

Prezados,

Solicito apoio na análise da aplicação SIREP Frontend Intranet Novo implantada no ambiente DES2.

Após a execução da release, o deployment foi concluído com sucesso pela esteira, porém a aplicação permanece indisponível ao acessar a URL:

https://sirep-frontend-intranet-novo-des2-des.apps.nprd.caixa


Retorno apresentado:

Application is not available


Durante a análise dos logs da release, foram observados os seguintes comportamentos:

O pacote foi recuperado com sucesso do Nexus e a imagem localizada no registry.
O DeploymentConfig foi atualizado normalmente.
O rollout foi executado e concluído com sucesso:
replication controller
"sirep-frontend-intranet-novo-des2-des-15"
successfully rolled out

Entretanto, na etapa de coleta dos logs da aplicação, a própria esteira não conseguiu localizar nenhum pod associado à aplicação:
oc get pod -l name=sirep-frontend-intranet-novo-des2-des -n sirep-des

last_pod=
Bash exited with code '1'


Diante desse comportamento, solicitamos verificar no namespace:

sirep-des


a aplicação:

sirep-frontend-intranet-novo-des2-des


realizando as seguintes validações:

Status dos pods;
Eventos do DeploymentConfig;
Existência de pods em CrashLoopBackOff;
Falhas de Readiness Probe ou Liveness Probe;
Logs dos containers da aplicação;
Existência de endpoints ativos associados ao Service;
Possíveis falhas na inicialização do Nginx ou da aplicação Angular.

Informações adicionais:

Release: SIREP-frontend-novo-1.0.0-SNAPSHOT(72)
Ambiente: EC DES2
Namespace: sirep-des
Imagem implantada:
build-images-ads/sirep-frontend-novo:1.0.0-SNAPSHOT


Observação: esta versão contempla atualização tecnológica do frontend para Angular 19, o que pode auxiliar na investigação de eventuais problemas de inicialização da aplicação.

Agradeço o apoio e fico à disposição para fornecer informações adicionais.

Atenciosamente,

Gabriel Sampaio


Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081761102
Criado em	 30/09/2026 14:49:15
Criado por	 P585600
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À CAIXA


Prezados

A analise realizada e ajustada na branch CESTI_TESTE, na WO0000081760585, é o mesmo ajuste para que o DES2 também possa executar o deploy. favor realizar os ajustes mencionados no atendimento da w.o mencionada acima.


Atenciosamente,

Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD




ID da Ordem de Trabalho	 WO0000081761102
Criado em	 30/09/2026 13:04:39
Criado por	 P730708
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial sem viés de falha, erro, degradação ou

esgotamento de infraestrutura, serviço, máquina, armazenamento,

rotina ou situação que não esteja na iminência de tornar-se

incidente. Previsto atendimento em até 24 horas úteis.

[CENTRAL-SID]
ID da Ordem de Trabalho	 WO0000081761102
Criado em	 30/09/2026 12:30:13
Criado por	 P768728
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),

Informamos que sua solicitação foi recebida.

Nosso SLA para atendimento é de até 24h úteis, analisaremos a solicitação para nos certificarmos que o atendimento está dentro do escopo de atuação da nossa equipe.

Caso seja identificado que o atendimento não corresponde ao nosso escopo, a solicitação será redirecionada à equipe responsável.

Novas informações e atualizações serão registradas diretamente nesta WO.

Atte.

Esteira Devops DES TQS NPRD
Impresso por P585600 em Segunda-feira, 05/10/2026 14:36:05


2026-10-05T13:47:56.6778119Z ##[section]Starting: Logs da Aplicação
2026-10-05T13:47:56.6781261Z ==============================================================================
2026-10-05T13:47:56.6781351Z Task         : Bash
2026-10-05T13:47:56.6781393Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-05T13:47:56.6781453Z Version      : 3.227.0
2026-10-05T13:47:56.6781503Z Author       : Microsoft Corporation
2026-10-05T13:47:56.6781553Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-05T13:47:56.6781623Z ==============================================================================
2026-10-05T13:47:56.8064541Z Generating script.
2026-10-05T13:47:56.8074836Z ========================== Starting Command Output ===========================
2026-10-05T13:47:56.8083541Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/a454060e-b293-4442-a191-57c148298917.sh
2026-10-05T13:47:56.8132797Z + shopt -s expand_aliases
2026-10-05T13:47:56.8132940Z + [[ -n okd4_nprd ]]
2026-10-05T13:47:56.8133200Z + [[ okd4_nprd =~ ocp ]]
2026-10-05T13:47:56.8133337Z + [[ -n okd4_nprd ]]
2026-10-05T13:47:56.8133467Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-10-05T13:47:56.8133665Z + app=sirep-frontend-intranet-novo-des2-des
2026-10-05T13:47:56.8133768Z + oc version
2026-10-05T13:47:56.8742873Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-10-05T13:47:56.8743150Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-10-05T13:47:56.8743342Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-10-05T13:47:56.8774858Z ++ oc get pod -l name=sirep-frontend-intranet-novo-des2-des -n sirep-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-10-05T13:47:56.8775146Z ++ tac
2026-10-05T13:47:56.8776569Z ++ grep -v '^$'
2026-10-05T13:47:56.8777451Z ++ head -n1
2026-10-05T13:47:56.9418041Z + last_pod=
2026-10-05T13:47:56.9439918Z ##[error]Bash exited with code '1'.
2026-10-05T13:47:56.9475682Z ##[section]Finishing: Logs da Aplicação


2026-10-05T13:47:56.9496849Z ##[section]Starting: Resumo da Release
2026-10-05T13:47:56.9500557Z ==============================================================================
2026-10-05T13:47:56.9500637Z Task         : Bash
2026-10-05T13:47:56.9500678Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-05T13:47:56.9500738Z Version      : 3.227.0
2026-10-05T13:47:56.9500826Z Author       : Microsoft Corporation
2026-10-05T13:47:56.9500875Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-05T13:47:56.9500944Z ==============================================================================
2026-10-05T13:47:57.2505441Z Generating script.
2026-10-05T13:47:57.2517020Z ========================== Starting Command Output ===========================
2026-10-05T13:47:57.2524268Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/33dd49f6-92c5-4bd6-85d3-545b296ce8f0.sh
2026-10-05T13:47:57.2575109Z URL do Projeto no OKD: api.nprd.caixa:6443/console/project/sirep-des/overview
2026-10-05T13:47:57.2580956Z /opt/ads-agent/_work/_temp/33dd49f6-92c5-4bd6-85d3-545b296ce8f0.sh: line 82: ISTIO_INJECTION: command not found
2026-10-05T13:47:57.2585147Z /opt/ads-agent/_work/_temp/33dd49f6-92c5-4bd6-85d3-545b296ce8f0.sh: line 92: CONTEXTO_JBOSS: command not found
2026-10-05T13:47:57.3418817Z APP Publicada na URL: https://sirep-frontend-intranet-novo-des2-des.apps.nprd.caixa
2026-10-05T13:47:57.3507623Z ##[section]Finishing: Resumo da Release

Application is not available
The application is currently not serving requests at this endpoint. It may not have been started or is still starting.

Possible reasons you are seeing this page:

The host doesn't exist. Make sure the hostname was typed correctly and that a route matching this hostname exists.
The host exists, but doesn't have a matching path. Check if the URL path was typed correctly and that the route was created using the desired path.
Route and path matches, but all pods are down. Make sure that the resources exposed by this route (pods, services, deployment configs, etc) have at least one pod running.




P
sirep-frontend-internet-novo-des2-des-11-x8pcz
Running

undle Angular localizado em: /opt/app-root/src/main-BE72RG5E.js
[30/Sep/2026:13:12:32 -0300] 127.0.0.1 - - - _ to: -: GET /stub_status HTTP/1.1 upstream_response_time - msec 1790784752.055 request_time 0.000 200 97 - NGINX-Prometheus-Exporter/v -
[30/Sep/2026:13:12:53 -0300] 25.3.6.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790784773.457 request_time 0.000 200 52722 - kube-probe/1.25 -
[30/Sep/2026:13:13:03 -0300] 25.3.6.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790784783.455 request_time 0.000 200 52722 - kube-probe/1.25 -
[30/Sep/2026:13:13:03 -0300] 25.3.6.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790784783.456 request_time 0.000 200 52722 - kube-probe/1.25 -
[30/Sep/2026:13:13:13 -0300] 25.3.6.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790784793.455 request_time 0.000 200 52722 - kube-probe/1.25 -
[30/Sep/2026:13:13:13 -0300] 25.3.6.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790784793.456 request_time 0.000 200 52722 - kube-probe/1.25 -
[30/Sep/2026:13:13:23 -0300] 25.3.6.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790784803.455 request_time 0.000 200 52722 - kube-probe/1.25 -
[30/Sep/2026:13:13:23 -0300] 25.3.6.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790784803.455 request_time 0.000 200 52722 - kube-probe/1.25 -
[30/Sep/2026:13:13:33 -0300] 25.3.6.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790784813.456 request_time 0.000 200 52722 - kube-probe/1.25 -
[30/Sep/2026:13:13:33 -0300] 25.3.6.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790784813.456 request_time 0.000 200 52722 - kube-probe/1.25 -
[30/Sep/2026:13:13:43 -0300] 25.3.6.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790784823.456 request_time 0.000 200 52722 - kube-probe/1.25 -
[30/Sep/2026:13:13:43 -0300] 25.3.6.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790784823.456 request_time 0.000 200 52722 - kube-probe/1.25 -
[30/Sep/2026:13:13:53 -0300] 25.3.6.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790784833.456 request_time 0.000 200 52722 - kube-probe/1.25 -
[30/Sep/2026:13:13:53 -0300] 25.3.6.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790784833.456 request_time 0.000 200 52722 - kube-probe/1.25 -
[30/Sep/2026:13:14:03 -0300] 25.3.6.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790784843.455 request_time 0.000 200 52722 - kube-probe/1.25 -
[30/Sep/2026:13:14:03 -0300] 25.3.6.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790784843.455 request_time 0.000 200 52722 - kube-probe/1.25 -
[30/Sep/2026:13:14:13 -0300] 25.3.6.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790784853.456 request_time 0.000 200 52722 - kube-probe/1.25 -
[30/Sep/2026:13:14:13 -0300] 25.3.6.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790784853.456 request_time 0.000 200 52722 - kube-probe/1.25 -
[30/Sep/2026:13:14:23 -0300] 25.3.6.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790784863.455 request_time 0.000 200 52722 - kube-probe/1.25 -
[30/Sep/2026:13:14:23 -0300] 25.3.6.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790784863.455 request_time 0.000 200 52722 - kube-probe/1.25 -
[30/Sep/2026:13:14:33 -0300] 25.3.6.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790784873.456 request_time 0.000 200 52722 - kube-probe/1.25 -
[30/Sep/2026:13:14:33 -0300] 25.3.6.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790784873.456 request_time 0.000 200 52722 - kube-probe/1.25 -



URL da Solicitação
https://sirep-frontend-intranet-novo-des2-des.apps.nprd.caixa/
Request method
GET
Status code
503 Service Unavailable
Remote address
10.116.180.64:443
Referrer policy
strict-origin-when-cross-origin
cache-control
private, max-age=0, no-cache, no-store
content-type
text/html
pragma
no-cache
accept
text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7
accept-encoding
gzip, deflate, br, zstd
accept-language
pt-BR,pt;q=0.9,en;q=0.8,en-GB;q=0.7,en-US;q=0.6
cache-control
no-cache
connection
keep-alive
host
sirep-frontend-intranet-novo-des2-des.apps.nprd.caixa
pragma
no-cache
sec-ch-ua
"Chromium";v="154", "Microsoft Edge";v="154", "Not A(Brand";v="99"
sec-ch-ua-mobile
?0
sec-ch-ua-platform
"Windows"
sec-fetch-dest
document
sec-fetch-mode
navigate
sec-fetch-site
none
sec-fetch-user
?1
upgrade-insecure-requests
1
user-agent
Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/154.0.0.0 Safari/537.36 Edg/154.0.0.0
