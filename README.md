Adição de novo link de acesso no SSO para o frontend da aplicação  
Link de inclusão de acesso ao SSO : https://simcn-frontend-des.apps.nprd.caixa/
LINK DO repositorio :
https://devops.caixa/projetos/Caixa/_git/SIMCN-frontend

Dúvidas contatar: c159783 ou C159949


https://simcn-frontend-des.apps.nprd.caixa/

SIMCN

API do SIMCN instável ou indisponível!


nao enteid essa demanda ano sei nem pra onde vai


tem essa task na release:

2026-05-29T16:57:05.7924189Z ##[section]Starting: Atualizando versão no PortalIF
2026-05-29T16:57:05.7927370Z ==============================================================================
2026-05-29T16:57:05.7927460Z Task         : Bash
2026-05-29T16:57:05.7927505Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-05-29T16:57:05.7927572Z Version      : 3.227.0
2026-05-29T16:57:05.7927612Z Author       : Microsoft Corporation
2026-05-29T16:57:05.7927663Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-05-29T16:57:05.7927738Z ==============================================================================
2026-05-29T16:57:05.9290799Z Generating script.
2026-05-29T16:57:05.9303381Z ========================== Starting Command Output ===========================
2026-05-29T16:57:05.9311119Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/a4d185fe-507c-456c-bbdd-048a92d7f590.sh
2026-05-29T16:57:05.9369392Z + '[' okd4_nprd == ctc_nprd -a des == prd ']'
2026-05-29T16:57:05.9369612Z + '[' -z okd4_nprd -a des '!=' prd -o okd4_nprd == ctc_nprd ']'
2026-05-29T16:57:05.9369870Z + '[' -z okd4_nprd -a des == prd -o okd4_nprd == ctc_npcn ']'
2026-05-29T16:57:05.9369988Z + SITE=okd4_nprd
2026-05-29T16:57:05.9370397Z + echo okd4_nprd
2026-05-29T16:57:05.9370546Z + echo 'SIMCN-frontend-1.0.0-SNAPSHOT(17)'
2026-05-29T16:57:05.9370874Z okd4_nprd
2026-05-29T16:57:05.9371023Z SIMCN-frontend-1.0.0-SNAPSHOT(17)
2026-05-29T16:57:05.9375515Z ++ curl --connect-timeout 3 --max-time 7 --retry 5 --retry-delay 0 --retry-max-time 50 -kfSL -w '%{http_code}' --location --request POST 'https://infradevops-novoportal-backend-prd.apps.produtos4.caixa/api.php?acao=editarServidor' --header 'Content-Type: application/json' --data '{
2026-05-29T16:57:05.9375828Z                  "dados": {
2026-05-29T16:57:05.9376005Z                  "versao": "SIMCN-frontend-1.0.0-SNAPSHOT(17)",
2026-05-29T16:57:05.9376130Z                  "nome_imagem": "nginx",
2026-05-29T16:57:05.9376228Z 	         "versao_imagem": "1.26"
2026-05-29T16:57:05.9376340Z                  },
2026-05-29T16:57:05.9376434Z                  "consulta": {
2026-05-29T16:57:05.9376574Z                  "sistema": "simcn-frontend",
2026-05-29T16:57:05.9376690Z                  "ambiente": "des",
2026-05-29T16:57:05.9378355Z                  "site": "okd4_nprd",
2026-05-29T16:57:05.9378635Z                  "hostname": "simcn-frontend"
2026-05-29T16:57:05.9378740Z                  }
2026-05-29T16:57:05.9378823Z                  }'
2026-05-29T16:57:05.9424066Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-05-29T16:57:05.9424273Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-05-29T16:57:05.9424360Z 
2026-05-29T16:57:06.0200489Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-05-29T16:57:06.0200786Z 100  2670  100  2247  100   423  29181   5493 --:--:-- --:--:-- --:--:-- 34675
2026-05-29T16:57:06.0215171Z + response='{
2026-05-29T16:57:06.0215324Z     "dados": {
2026-05-29T16:57:06.0215686Z         "versao": "SIMCN-frontend-1.0.0-SNAPSHOT(17)",
2026-05-29T16:57:06.0215882Z         "nome_imagem": "nginx",
2026-05-29T16:57:06.0215988Z         "versao_imagem": "1.26",
2026-05-29T16:57:06.0216172Z         "data_atualizacao": "2026-05-29 13:57:05"
2026-05-29T16:57:06.0216282Z     },
2026-05-29T16:57:06.0216372Z     "consulta": {
2026-05-29T16:57:06.0216508Z         "sistema": "simcn-frontend",
2026-05-29T16:57:06.0216615Z         "ambiente": "des",
2026-05-29T16:57:06.0216717Z         "site": "okd4_nprd",
2026-05-29T16:57:06.0216859Z         "hostname": "simcn-frontend"
2026-05-29T16:57:06.0216943Z     },
2026-05-29T16:57:06.0217030Z     "retorno": {
2026-05-29T16:57:06.0217124Z         "status": "sucesso",
2026-05-29T16:57:06.0217235Z         "mensagem": "cadastro realizado com sucesso!",
2026-05-29T16:57:06.0217332Z         "dados": [
2026-05-29T16:57:06.0217417Z             {
2026-05-29T16:57:06.0217504Z                 "id": 12991,
2026-05-29T16:57:06.0217645Z                 "sistema": "simcn-frontend",
2026-05-29T16:57:06.0218025Z                 "ambiente": "des",
2026-05-29T16:57:06.0218133Z                 "plataforma": "container",
2026-05-29T16:57:06.0218246Z                 "versao_plataforma": null,
2026-05-29T16:57:06.0218438Z                 "servidores_json": "[{\"nome\":\"simcn-frontend\",\"ip\":\"10.116.209.118\"}]",
2026-05-29T16:57:06.0218565Z                 "status": "ativado",
2026-05-29T16:57:06.0218731Z                 "data_inclusao": "2026-04-20 14:02:39",
2026-05-29T16:57:06.0218917Z                 "data_atualizacao": "2026-05-29 13:57:05",
2026-05-29T16:57:06.0219027Z                 "produto": null,
2026-05-29T16:57:06.0219129Z                 "solicitacoes_id": null,
2026-05-29T16:57:06.0219230Z                 "ipbackup": "",
2026-05-29T16:57:06.0219323Z                 "tipo": "novo",
2026-05-29T16:57:06.0219416Z                 "id_limites_cotas": null,
2026-05-29T16:57:06.0219521Z                 "template_name": null,
2026-05-29T16:57:06.0219626Z                 "site": "okd4_nprd",
2026-05-29T16:57:06.0219787Z                 "versao": "SIMCN-frontend-1.0.0-SNAPSHOT(17)",
2026-05-29T16:57:06.0219966Z                 "objeto_origem": "SIMCN-FRONTEND_DES_SERVIDOR",
2026-05-29T16:57:06.0220146Z                 "cgc_des": null,
2026-05-29T16:57:06.0220244Z                 "cgc_ops": null,
2026-05-29T16:57:06.0220333Z                 "vertical": null,
2026-05-29T16:57:06.0220442Z                 "jboss_apache_status": "ativado",
2026-05-29T16:57:06.0220545Z                 "cpu": 2,
2026-05-29T16:57:06.0220655Z                 "memoria": 4,
2026-05-29T16:57:06.0220741Z                 "disco_opt": 10,
2026-05-29T16:57:06.0220835Z                 "disco_log": 2,
2026-05-29T16:57:06.0220931Z                 "terraform": false,
2026-05-29T16:57:06.0221030Z                 "cluster": "nao_consta",
2026-05-29T16:57:06.0221127Z                 "nome_imagem": "nginx",
2026-05-29T16:57:06.0221227Z                 "versao_imagem": "1.26",
2026-05-29T16:57:06.0221331Z                 "info_tecnologia": null,
2026-05-29T16:57:06.0221425Z                 "info_versao": null,
2026-05-29T16:57:06.0221521Z                 "farm": null,
2026-05-29T16:57:06.0221621Z                 "info_linguagem": null,
2026-05-29T16:57:06.0221724Z                 "info_framework": null,
2026-05-29T16:57:06.0221818Z                 "recursos_max_id": null,
2026-05-29T16:57:06.0221917Z                 "legado": false,
2026-05-29T16:57:06.0222015Z                 "frameworks": null,
2026-05-29T16:57:06.0222115Z                 "nome_instancia": null,
2026-05-29T16:57:06.0222208Z                 "terraform_id": null,
2026-05-29T16:57:06.0222308Z                 "camada_rede": null,
2026-05-29T16:57:06.0222408Z                 "camada": null,
2026-05-29T16:57:06.0222494Z                 "if_ativo": true
2026-05-29T16:57:06.0222583Z             }
2026-05-29T16:57:06.0222665Z         ]
2026-05-29T16:57:06.0222745Z     }
2026-05-29T16:57:06.0222837Z }201'
2026-05-29T16:57:06.0222973Z ++ awk '-F}' '{print $NF}'
2026-05-29T16:57:06.0224821Z ++ echo '{' '"dados":' '{' '"versao":' '"SIMCN-frontend-1.0.0-SNAPSHOT(17)",' '"nome_imagem":' '"nginx",' '"versao_imagem":' '"1.26",' '"data_atualizacao":' '"2026-05-29' '13:57:05"' '},' '"consulta":' '{' '"sistema":' '"simcn-frontend",' '"ambiente":' '"des",' '"site":' '"okd4_nprd",' '"hostname":' '"simcn-frontend"' '},' '"retorno":' '{' '"status":' '"sucesso",' '"mensagem":' '"cadastro' realizado com 'sucesso!",' '"dados":' '[' '{' '"id":' 12991, '"sistema":' '"simcn-frontend",' '"ambiente":' '"des",' '"plataforma":' '"container",' '"versao_plataforma":' null, '"servidores_json":' '"[{\"nome\":\"simcn-frontend\",\"ip\":\"10.116.209.118\"}]",' '"status":' '"ativado",' '"data_inclusao":' '"2026-04-20' '14:02:39",' '"data_atualizacao":' '"2026-05-29' '13:57:05",' '"produto":' null, '"solicitacoes_id":' null, '"ipbackup":' '"",' '"tipo":' '"novo",' '"id_limites_cotas":' null, '"template_name":' null, '"site":' '"okd4_nprd",' '"versao":' '"SIMCN-frontend-1.0.0-SNAPSHOT(17)",' '"objeto_origem":' '"SIMCN-FRONTEND_DES_SERVIDOR",' '"cgc_des":' null, '"cgc_ops":' null, '"vertical":' null, '"jboss_apache_status":' '"ativado",' '"cpu":' 2, '"memoria":' 4, '"disco_opt":' 10, '"disco_log":' 2, '"terraform":' false, '"cluster":' '"nao_consta",' '"nome_imagem":' '"nginx",' '"versao_imagem":' '"1.26",' '"info_tecnologia":' null, '"info_versao":' null, '"farm":' null, '"info_linguagem":' null, '"info_framework":' null, '"recursos_max_id":' null, '"legado":' false, '"frameworks":' null, '"nome_instancia":' null, '"terraform_id":' null, '"camada_rede":' null, '"camada":' null, '"if_ativo":' true '}' ']' '}' '}201'
2026-05-29T16:57:06.0250820Z + status_code=201
2026-05-29T16:57:06.0251739Z + [[ 201 != 201 ]]
2026-05-29T16:57:06.0252268Z + echo 'Atualizando versão na API InfraDevops'
2026-05-29T16:57:06.0252577Z Atualizando versão na API InfraDevops
2026-05-29T16:57:06.0255305Z { "dados": { "versao": "SIMCN-frontend-1.0.0-SNAPSHOT(17)", "nome_imagem": "nginx", "versao_imagem": "1.26", "data_atualizacao": "2026-05-29 13:57:05" }, "consulta": { "sistema": "simcn-frontend", "ambiente": "des", "site": "okd4_nprd", "hostname": "simcn-frontend" }, "retorno": { "status": "sucesso", "mensagem": "cadastro realizado com sucesso!", "dados": [ { "id": 12991, "sistema": "simcn-frontend", "ambiente": "des", "plataforma": "container", "versao_plataforma": null, "servidores_json": "[{\"nome\":\"simcn-frontend\",\"ip\":\"10.116.209.118\"}]", "status": "ativado", "data_inclusao": "2026-04-20 14:02:39", "data_atualizacao": "2026-05-29 13:57:05", "produto": null, "solicitacoes_id": null, "ipbackup": "", "tipo": "novo", "id_limites_cotas": null, "template_name": null, "site": "okd4_nprd", "versao": "SIMCN-frontend-1.0.0-SNAPSHOT(17)", "objeto_origem": "SIMCN-FRONTEND_DES_SERVIDOR", "cgc_des": null, "cgc_ops": null, "vertical": null, "jboss_apache_status": "ativado", "cpu": 2, "memoria": 4, "disco_opt": 10, "disco_log": 2, "terraform": false, "cluster": "nao_consta", "nome_imagem": "nginx", "versao_imagem": "1.26", "info_tecnologia": null, "info_versao": null, "farm": null, "info_linguagem": null, "info_framework": null, "recursos_max_id": null, "legado": false, "frameworks": null, "nome_instancia": null, "terraform_id": null, "camada_rede": null, "camada": null, "if_ativo": true } ] } }201
2026-05-29T16:57:06.0259933Z + echo '{' '"dados":' '{' '"versao":' '"SIMCN-frontend-1.0.0-SNAPSHOT(17)",' '"nome_imagem":' '"nginx",' '"versao_imagem":' '"1.26",' '"data_atualizacao":' '"2026-05-29' '13:57:05"' '},' '"consulta":' '{' '"sistema":' '"simcn-frontend",' '"ambiente":' '"des",' '"site":' '"okd4_nprd",' '"hostname":' '"simcn-frontend"' '},' '"retorno":' '{' '"status":' '"sucesso",' '"mensagem":' '"cadastro' realizado com 'sucesso!",' '"dados":' '[' '{' '"id":' 12991, '"sistema":' '"simcn-frontend",' '"ambiente":' '"des",' '"plataforma":' '"container",' '"versao_plataforma":' null, '"servidores_json":' '"[{\"nome\":\"simcn-frontend\",\"ip\":\"10.116.209.118\"}]",' '"status":' '"ativado",' '"data_inclusao":' '"2026-04-20' '14:02:39",' '"data_atualizacao":' '"2026-05-29' '13:57:05",' '"produto":' null, '"solicitacoes_id":' null, '"ipbackup":' '"",' '"tipo":' '"novo",' '"id_limites_cotas":' null, '"template_name":' null, '"site":' '"okd4_nprd",' '"versao":' '"SIMCN-frontend-1.0.0-SNAPSHOT(17)",' '"objeto_origem":' '"SIMCN-FRONTEND_DES_SERVIDOR",' '"cgc_des":' null, '"cgc_ops":' null, '"vertical":' null, '"jboss_apache_status":' '"ativado",' '"cpu":' 2, '"memoria":' 4, '"disco_opt":' 10, '"disco_log":' 2, '"terraform":' false, '"cluster":' '"nao_consta",' '"nome_imagem":' '"nginx",' '"versao_imagem":' '"1.26",' '"info_tecnologia":' null, '"info_versao":' null, '"farm":' null, '"info_linguagem":' null, '"info_framework":' null, '"recursos_max_id":' null, '"legado":' false, '"frameworks":' null, '"nome_instancia":' null, '"terraform_id":' null, '"camada_rede":' null, '"camada":' null, '"if_ativo":' true '}' ']' '}' '}201'
2026-05-29T16:57:06.0313975Z ##[section]Finishing: Atualizando versão no PortalIF



2026-05-29T16:55:59.3312773Z ##[section]Starting: Criando o ConfigMap nginx-conf.d
2026-05-29T16:55:59.3317159Z ==============================================================================
2026-05-29T16:55:59.3317280Z Task         : Bash
2026-05-29T16:55:59.3317332Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-05-29T16:55:59.3317396Z Version      : 3.227.0
2026-05-29T16:55:59.3317457Z Author       : Microsoft Corporation
2026-05-29T16:55:59.3317517Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-05-29T16:55:59.3317587Z ==============================================================================
2026-05-29T16:55:59.4801015Z Generating script.
2026-05-29T16:55:59.4810213Z Script contents:
2026-05-29T16:55:59.4810882Z oc create configmap nginx-conf-d-simcn-frontend  --from-file="/opt/ads-agent/_work/r661/a/_SIMCN-frontend-config/simcn-nginx.conf" -n simcn-des
2026-05-29T16:55:59.4814316Z ========================== Starting Command Output ===========================
2026-05-29T16:55:59.4827348Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/dc9cfa8c-62ec-4f84-82f8-0f067ce74d7d.sh
2026-05-29T16:55:59.5564443Z configmap/nginx-conf-d-simcn-frontend created
2026-05-29T16:55:59.5649794Z ##[section]Finishing: Criando o ConfigMap nginx-conf.d


pod no okd:


P
simcn-frontend-des-16-xqw29
Running



[01/Jun/2026:13:30:14 -0300] 25.3.44.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1780331414.447 request_time 0.000 200 2487 - kube-probe/1.25 -
[01/Jun/2026:13:30:24 -0300] 25.3.44.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1780331424.447 request_time 0.000 200 2487 - kube-probe/1.25 -
[01/Jun/2026:13:30:24 -0300] 25.3.44.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1780331424.447 request_time 0.000 200 2487 - kube-probe/1.25 -
[01/Jun/2026:13:30:30 -0300] 25.2.2.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1780331430.786 request_time 0.000 200 980 - Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/146.0.0.0 Safari/537.36 10.116.4.145
[01/Jun/2026:13:30:30 -0300] 25.2.2.1 - - - _ to: -: GET /main.c5deddaeaa568e4a1806.js HTTP/1.1 upstream_response_time - msec 1780331430.881 request_time 0.000 200 541077 https://simcn-frontend-des.apps.nprd.caixa/ Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/146.0.0.0 Safari/537.36 10.116.4.145
[01/Jun/2026:13:30:34 -0300] 25.3.44.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1780331434.447 request_time 0.000 200 2487 - kube-probe/1.25 -
[01/Jun/2026:13:30:34 -0300] 25.3.44.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1780331434.447 request_time 0.000 200 2487 - kube-probe/1.25 -

em networkint rotas tem iss:


Project: simcn-des
Routes
Route details
Route
RT
simcn-frontend-des
Accepted

Actions
Details
Metrics
YAML
Route details
simcn-frontend-des
Namespace
NS
simcn-des
app
=
simcn-frontend-des
application
=
simcn-frontend-des
template
=
angular-caixa-release
Service
S
simcn-frontend-des
web
20 de abr. de 2026, 13:37
No owner
Location
https://simcn-frontend-des.apps.nprd.caixa Copy to clipboard
Status
Accepted
simcn-frontend-des.apps.nprd.caixa
-
router-default.apps.nprd.caixa



na verdae a demanda nao expçlica muito bem o que eles precisam
