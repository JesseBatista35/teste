Verificar não está gerando a build e publicando no Kubernates deu erro de acesso negado: ENVIRONMENT_LOWER=des

APP_NAME_LOWER=sipge-frontend-intranet
Falha ao obter Application ou erro retornado:
{"error":"permission denied","code":7,"message":"permission denied"}
Error: Process completed with exit code 1.


Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081161786
Criado em	 30/07/2026 17:49:51
Criado por	 P962527
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Olá, Marcos.
Obrigado pelas informações.
Analisando os dados enviados, observamos que a falha ocorre durante a execução da integração com o ArgoCD, especificamente na etapa de obtenção das informações da aplicação:

Falha ao obter Application ou erro retornado:
{"error":"permission denied","code":7,"message":"permission denied"}

Como esta é a primeira publicação na esteira GitOps, o cenário sugere que a aplicação/projeto ainda não possui as permissões necessárias no ArgoCD ou que a credencial utilizada pela esteira não possui acesso à aplicação sipge-frontend-intranet no ambiente des.
Neste momento, não há evidência de erro de build da aplicação. A falha está ocorrendo na integração com o ArgoCD durante a consulta/publicação.
Vamos direcionar a análise para validação das permissões e configuração da aplicação no ArgoCD para identificar o bloqueio de acesso retornado pelo erro permission denied.
Atenciosamente.

Minha avaliação técnica: neste ponto eu abriria ou escalaria para a equipe responsável pelo ArgoCD/GitOps/DevSecOps, pois o solicitante já forneceu as informações necessárias e o erro aponta para autorização no ArgoCD, não para problema na aplicação ou na build.

Atenciosamente,
Jesse da Silva Lucas
CTIS / CESTI / Nuvem Pública
ID da Ordem de Trabalho	 WO0000081161786
Criado em	 30/07/2026 17:48:39
Criado por	 P962527
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Olá, Marcos.
Obrigado pelas informações.
Analisando os dados enviados, observamos que a falha ocorre durante a execução da integração com o ArgoCD, especificamente na etapa de obtenção das informações da aplicação:

Falha ao obter Application ou erro retornado:
{"error":"permission denied","code":7,"message":"permission denied"}

Como esta é a primeira publicação na esteira GitOps, o cenário sugere que a aplicação/projeto ainda não possui as permissões necessárias no ArgoCD ou que a credencial utilizada pela esteira não possui acesso à aplicação sipge-frontend-intranet no ambiente des.
Neste momento, não há evidência de erro de build da aplicação. A falha está ocorrendo na integração com o ArgoCD durante a consulta/publicação.
Vamos direcionar a análise para validação das permissões e configuração da aplicação no ArgoCD para identificar o bloqueio de acesso retornado pelo erro permission denied.
Atenciosamente.

Minha avaliação técnica: neste ponto eu abriria ou escalaria para a equipe responsável pelo ArgoCD/GitOps/DevSecOps, pois o solicitante já forneceu as informações necessárias e o erro aponta para autorização no ArgoCD, não para problema na aplicação ou na build.

Atenciosamente,
Jesse da Silva Lucas
CTIS / CESTI / Nuvem Pública
ID da Ordem de Trabalho	 WO0000081161786
Criado em	 29/07/2026 14:46:53
Criado por	 C101218
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Boa tarde! Tudo bem! Segue as informações solicitadas: A URL da execução do pipeline que apresentou a falha;
https://github.com/caixagithub/sipge-frontend-intranet/actions/runs/29595733020/job/87936283397
O log completo da etapa de deploy/publicação;
Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/argocd-get-destination@main
Run set -euo pipefail
ENVIRONMENT_LOWER=des
APP_NAME_LOWER=sipge-frontend-intranet
Falha ao obter Application ou erro retornado:
{"error":"permission denied","code":7,"message":"permission denied"}
Error: Process completed with exit code 1.
A informação da última execução que ocorreu com sucesso;
Primeira execução na esteira GitOps
A confirmação se o deploy é realizado via ArgoCD ou diretamente no Kubernetes;
utilizando Argo
Caso tenha conhecimento, informar se houve alguma alteração recente de credenciais, tokens ou permissões no ambiente.
Como se trata de primeira publicação nessa esteira não sei informar
ID da Ordem de Trabalho	 WO0000081161786
Criado em	 29/07/2026 12:27:35
Criado por	 P962527
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Bom dia, Marcos!
Tudo bem?

Foi identificada falha na etapa de publicação da aplicação sipge-frontend-intranet no ambiente DES.
Evidência encontrada:

{"error":"permission denied","code":7,"message":"permission denied"}

O erro indica possível problema de permissão do usuário, token ou service account utilizada pelo pipeline para acessar a aplicação no Kubernetes/ArgoCD.
Para prosseguirmos com a análise, solicitamos:

URL da execução do pipeline com falha;
Log completo da etapa de deploy/publicação;
Informação sobre a última execução realizada com sucesso;
Confirmação se o deploy é realizado via ArgoCD ou diretamente no Kubernetes;
Confirmação se houve alteração recente de credenciais, tokens ou permissões do ambiente.

Com essas informações será possível validar se a falha está relacionada a credenciais, permissões (RBAC), ArgoCD ou ao ambiente de destino.

Atenciosamente,
Jesse da Silva Lucas
CTIS / CESTI / Nuvem Pública
ID da Ordem de Trabalho	 WO0000081161786
Criado em	 27/07/2026 16:12:50
Criado por	 P558217
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À


Equipe de Nuvem Pública


Solicitamos análise conforme nota abaixo.


Atte.



CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081161786
Criado em	 27/07/2026 15:26:40
Criado por	 P585600
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À NUVEM,

Prezados,

Após analise foi verificado que o cluster no Microsoft azure para aplicação não existe, favor analisar a criação do cluster.


Atenciosamente,

Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD

ID da Ordem de Trabalho	 WO0000081161786
Criado em	 24/07/2026 17:05:59
Criado por	 P585600
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À CAIXA,

Prezados,

Após analise foi verificado que o cluster no Microsoft azure para aplicação não existe, estamos aguardando resposta em sala teams: WO0000081161786 para qual equipe devemos enviar para a criação do cluster.


Dessa forma a demanda permanece pendente.

Atenciosamente,

Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD


ID da Ordem de Trabalho	 WO0000081161786
Criado em	 24/07/2026 11:35:09
Criado por	 P767992
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial sem viés de falha, erro, degradação ou
esgotamento de infraestrutura, serviço, máquina, armazenamento,
rotina ou situação que não esteja na iminência de tornar-se
incidente. Previsto atendimento em até 24 horas úteis.

[CENTRAL-SID]
ID da Ordem de Trabalho	 WO0000081161786
Criado em	 24/07/2026 11:11:37
Criado por	 C101218
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados, ignore o anexo: Erro FusionX.png
ID da Ordem de Trabalho	 WO0000081161786
Criado em	 24/07/2026 11:11:20
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
ID da Ordem de Trabalho	 WO0000081161786
Criado em	 24/07/2026 10:57:37
Criado por	 C101218
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Anexo do Registro de Solicitação.
ID da Ordem de Trabalho	 WO0000081161786
Criado em	 24/07/2026 10:57:34
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Sexta-feira, 31/07/2026 10:26:11




Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
sipge-frontend-intranet
Repository navigation
Code
Issues
Pull requests
Actions
Projects
Wiki
Security and quality
34
 (34)
Insights
Settings
CI/CD Workflow Generic
__. #5
All jobs
Run details
Annotations
1 error and 1 warning
CI_DES / ArgoCD_Deploy / ArgoCD_Deploy (DES)
failed 2 weeks ago in 1m 22s
Search logs
10s
0s
0s
0s
0s
0s
0s
0s
0s
0s
0s
0s
31s
0s
5s
0s
4s
0s
0s
0s
21s
5s
0s
Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/argocd-get-destination@main
  with:
    argocd_server: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io
    app_name: sipge-frontend-intranet
    environment: DES
  env:
    APIM_VERSIONAPI: 
    APIM_displaynameAPI: 
    APIM_PATH: 
    APIM_SWAGGERPATH: 
    APIM_TAGSAPI: 
    APIM_POLICIESALLOPERATIONSPATH: 
    environment: des
    repository_suffix: infranprd
    REPO: sipge-frontend-intranet
    JOB_ID: 119948
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
    environment: des
    repository_suffix: infranprd
    REPO: sipge-frontend-intranet
    JOB_ID: 119948
    ARGOCD_AUTH_TOKEN: ***
    ARGOCD_SERVER: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io
    APP_NAME: sipge-frontend-intranet
    ENVIRONMENT: DES
    TOKEN: 
ENVIRONMENT_LOWER=des
APP_NAME_LOWER=sipge-frontend-intranet
Falha ao obter Application ou erro retornado:
{"error":"permission denied","code":7,"message":"permission denied"}
Error: Process completed with exit code 1.
0s
0s
0s
0s
0s
0s
0s
0s
0s
0s
0s
0s
1s
0s
