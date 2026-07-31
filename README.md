Estou tentando subir a aplicação em ambiente de TQS pela primeira vez, já solicitei os certificados e instalação, e tbm o DNS, gostaria que me ajudasse a identificar o problema que está ocorrendo no Deploy em TQS.

https://github.com/caixagithub/sirmc-frontend-campanhas-gestao/actions/runs/30361254351/job/90282433342



5s
0s
Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/argocd-get-destination@main
  with:
    argocd_server: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io
    app_name: sirmc-frontend-campanhas-gestao
    environment: TQS
  env:
    APIM_VERSIONAPI: 
    APIM_displaynameAPI: 
    APIM_PATH: 
    APIM_SWAGGERPATH: 
    APIM_TAGSAPI: 
    APIM_POLICIESALLOPERATIONSPATH: 
    environment: tqs
    repository_suffix: infranprd
    REPO: sirmc-frontend-campanhas-gestao
    JOB_ID: 123374
    ARGOCD_AUTH_TOKEN: ***
Run set -euo pipefail
  set -euo pipefail
  
  # Converte environment para lowercase
  ENVIRONMENT_LOWER=$(echo "${ENVIRONMENT}" | tr '[:upper:]' '[:lower:]')
  
  echo "ENVIRONMENT_LOWER=${ENVIRONMENT_LOWER}"
  
  APP_NAME_LOWER=$(echo "${APP_NAME}" | tr '[:upper:]' '[:lower:]')
  
  echo "APP_NAME_LOWER=${APP_NAME_LOWER}"
  
  # Concatena app_name com ambiente
  FULL_APP_NAME="${APP_NAME_LOWER}-${ENVIRONMENT_LOWER}"
  
  # Monta a URL
  URL="${ARGOCD_SERVER}/api/v1/applications/${FULL_APP_NAME}"
  
  # Consulta a API
  RESP="$(curl -sS -H "Authorization: ***" -H "Content-Type: application/json" "$URL")"
  
  # Valida resposta básica
  if [ -z "$RESP" ] || echo "$RESP" | jq -e '.code, .status, .error' >/dev/null 2>&1; then
    echo "Falha ao obter Application ou erro retornado:"
    echo "$RESP"
    exit 1
  fi
  
  echo "::group::Resposta bruta da API"
  echo "$RESP" | jq .
  echo "::endgroup::"
  
  # Exporta JSON para o próximo step
  echo "$RESP" > app.json
  shell: /usr/bin/bash --noprofile --norc -e -o pipefail {0}
  env:
    APIM_VERSIONAPI: 
    APIM_displaynameAPI: 
    APIM_PATH: 
    APIM_SWAGGERPATH: 
    APIM_TAGSAPI: 
    APIM_POLICIESALLOPERATIONSPATH: 
    environment: tqs
    repository_suffix: infranprd
    REPO: sirmc-frontend-campanhas-gestao
    JOB_ID: 123374
    ARGOCD_AUTH_TOKEN: ***
    ARGOCD_SERVER: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io
    APP_NAME: sirmc-frontend-campanhas-gestao
    ENVIRONMENT: TQS
    TOKEN: 
ENVIRONMENT_LOWER=tqs
APP_NAME_LOWER=sirmc-frontend-campanhas-gestao
Falha ao obter Application ou erro retornado:
{"error":"permission denied","code":7,"message":"permission denied"}
Error: Process completed with exit code 1.


Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081192379
Criado em	 30/07/2026 13:05:18
Criado por	 P669476
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À
Esteira DES TQS,

Segue demanda para avaliação e tratamento.

Atenciosamente,
André Hebert dos Santos
Preposto
CTIS/CESTI/ESTEIRA - APLICAÇÃO/DEVOPS
ID da Ordem de Trabalho	 WO0000081192379
Criado em	 30/07/2026 10:07:49
Criado por	 P548031
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado,

O procedimento é para ser executado dentro do repositório GitOps para inicialização da aplicações pelo ArgoCD.

Mas por ser um repositório de alta criticidade, pode ocorrer o que as automações que utilize o repositório   podem quebrar, por exemplo, nos merges, após atuação humana no repositório.

Necessário a atuação para Time de Esteiras de PRD ou Time de Nuvem para a correção do problema em todos os projetos, com a criação de todas as subpastas des, tqs, tst, hmp, plt, prd e sandbox para que não tenha procedimentos manuais/humano através da ferramente Git

Atenciosamente
ID da Ordem de Trabalho	 WO0000081192379
Criado em	 30/07/2026 09:26:10
Criado por	 F629844
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 De que pasta você fala?
se for a referente a configuração no INFRANPRD, ela está aqui:

https://github.com/caixagithub/sirmc-frontend-campanhas-gestao-infranprd/tree/main/tqs
ID da Ordem de Trabalho	 WO0000081192379
Criado em	 29/07/2026 17:03:06
Criado por	 P548031
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado,

Não existe a pasta TQS dentro do projeto no repositório GitOps.

Atenciosamente
ID da Ordem de Trabalho	 WO0000081192379
Criado em	 29/07/2026 10:16:52
Criado por	 F629844
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 DESCONSIDERE AS NOTAS DADAS POR MIM, trata-se de um outro chamado sobre o problema no BACKEND.
ID da Ordem de Trabalho	 WO0000081192379
Criado em	 29/07/2026 10:04:48
Criado por	 F629844
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 evidência em anexo
ID da Ordem de Trabalho	 WO0000081192379
Criado em	 29/07/2026 10:04:19
Criado por	 F629844
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Segue a Action:

https://github.com/caixagithub/sirmc-backend-campanhas-gestao/actions/runs/30453183606/job/90581029778
ID da Ordem de Trabalho	 WO0000081192379
Criado em	 28/07/2026 11:14:05
Criado por	 P776093
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial sem viés de falha, erro, degradação ou esgotamento de infraestrutura, serviço, máquina, armazenamento, rotina ou situação que não esteja na iminência de tornar-se incidente. Previsto atendimento em até 24 horas. [CENTRAL-SID]
ID da Ordem de Trabalho	 WO0000081192379
Criado em	 28/07/2026 10:48:24
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
ID da Ordem de Trabalho	 WO0000081192379
Criado em	 28/07/2026 10:35:50
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Sexta-feira, 31/07/2026 09:39:31
