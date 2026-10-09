Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
CAIXAPLATFORM
github-solutions
Repository navigation
Code
Issues
Pull requests
1
 (1)
Actions
Projects
Wiki
Security and quality
Insights
Settings
CAIXAPLATFORM
github-solutions
Internal
Go to file
t
T
author
Guilherme Tadeu
docs: adiciona especificacao argocd
f40ab9d
 · 
last month
Name		
.github/workflows
Merge branch 'main' of https://github.com/CAIXAPLATFORM/github-solutions
2 months ago
caller-examples-ios
fix(ios): simplify testflight deploy caller
2 months ago
docs
docs: adiciona especificacao argocd
last month
tests
fix(ios): valitdation contract
2 months ago
README.md
up test
2 months ago
Repository files navigation
README
github-solutions
Repositório de contratos públicos consumidos via workflow_call. Define a interface pública consumida pelos callers, valida pré-condições e orquestra a chamada para o CI específico do domínio e para o CD compartilhado.

!!! info "Princípio" Funciona como uma fachada — desacopla o consumidor (caller) da implementação interna. Trate os inputs como API pública.

Histórico de Merge
Merge realizado com o repositório https://github.com/caixagithub/DevSecOps-Solutions/
Commit: 6de1e74bfff7bef67b6c88e8b021fd3156be4bd0
Data: Wed Jun 24 15:50:17 2026 -0300
Convenção de Nomes
Os workflows seguem o padrão:

{domínio}--{subdomínio}--{nome}.yml
Segmento	Propósito	Exemplos
domínio	Área tecnológica principal	docker, java, dotnet, typescript, ios, android
subdomínio	Refinamento opcional	maven, gradle, app, lib
nome	Ação do pipeline	ci-cd, release, deploy-des, quality-gate
!!! example "Exemplos" - java--maven--ci-cd.yml → CI/CD completo para Java Maven - dotnet--ci-cd.yml → CI/CD completo para .NET (sem subdomínio) - ios--ci.yml → Apenas CI para iOS - docker--build-push-quarantine.yml → Build e push Docker

Estrutura de Diretórios
github-solutions/
└── .github/
    └── workflows/
        ├── docker--build-push-quarantine.yml
        ├── docker--promote-to-stable.yml
        ├── java--maven--ci-cd.yml
        ├── java--gradle--ci-cd.yml
        ├── dotnet--ci-cd.yml
        ├── typescript--ci-cd.yml
        ├── ios--ci.yml
        ├── ios--release.yml
        ├── ios--deploy-des.yml
        ├── ios--quality-gate.yml
        ├── ios--gitflow-auto-pr.yml
        ├── android--ci.yml
        ├── android--release.yml
        ├── android--deploy-des.yml
        ├── security--daily-scan.yml
        └── versioning--tag-on-merge.yml
Contratos por Domínio
Docker — Build & Push Quarantine
Input	Tipo	Obrigatório	Default	Descrição
image_name	string	sim	—	Nome da imagem
event_name	string	sim	—	Evento que disparou o workflow
name: Docker – Build & Push Quarantine
on:
  workflow_call:
    inputs:
      image_name:
        required: true
        type: string
      event_name:
        required: true
        type: string
jobs:
  orchestrate:
    uses: CAIXAPLATFORM/github-workflows-jobs/.github/workflows/docker--build-scan-push-quarantine.yml@v1
    with:
      image_name: ${{ inputs.image_name }}
      event_name: ${{ inputs.event_name }}
    secrets: inherit
Java Maven — CI/CD
Input	Tipo	Obrigatório	Default	Descrição
java_version	string	não	"21"	Versão do JDK
artifact_id	string	sim	—	ID do artefato Maven
deploy_environment	string	não	"des"	Ambiente: des / tqs / hmp / prd
name: Java – CI/CD Maven
on:
  workflow_call:
    inputs:
      java_version:
        required: false
        type: string
        default: "21"
      artifact_id:
        required: true
        type: string
      deploy_environment:
        required: false
        type: string
        default: "des"
jobs:
  ci:
    uses: CAIXAPLATFORM/github-workflows-jobs/.github/workflows/java--maven--ci.yml@v1
    with:
      java_version: ${{ inputs.java_version }}
      artifact_id: ${{ inputs.artifact_id }}
    secrets: inherit
  cd:
    uses: CAIXAPLATFORM/github-workflows-jobs/.github/workflows/shared--cd.yml@v1
    needs: ci
    with:
      artifact_id: ${{ inputs.artifact_id }}
      artifact_type: "jar"
      deploy_environment: ${{ inputs.deploy_environment }}
    secrets: inherit
.NET — CI/CD
Input	Tipo	Obrigatório	Default	Descrição
dotnet_version	string	não	"8.0"	Versão do .NET SDK
project_name	string	sim	—	Nome do projeto
deploy_environment	string	não	"des"	Ambiente: des / tqs / hmp / prd
name: .NET – CI/CD
on:
  workflow_call:
    inputs:
      dotnet_version:
        required: false
        type: string
        default: "8.0"
      project_name:
        required: true
        type: string
      deploy_environment:
        required: false
        type: string
        default: "des"
jobs:
  ci:
    uses: CAIXAPLATFORM/github-workflows-jobs/.github/workflows/dotnet--ci.yml@v1
    with:
      dotnet_version: ${{ inputs.dotnet_version }}
      project_name: ${{ inputs.project_name }}
    secrets: inherit
  cd:
    uses: CAIXAPLATFORM/github-workflows-jobs/.github/workflows/shared--cd.yml@v1
    needs: ci
    with:
      artifact_id: ${{ inputs.project_name }}
      artifact_type: "dll"
      deploy_environment: ${{ inputs.deploy_environment }}
    secrets: inherit
TypeScript — CI/CD
Input	Tipo	Obrigatório	Default	Descrição
node_version	string	não	"20"	Versão do Node.js
package_manager	string	não	"npm"	npm ou yarn
project_name	string	sim	—	Nome do projeto
deploy_environment	string	não	"des"	Ambiente: des / tqs / hmp / prd
name: TypeScript – CI/CD
on:
  workflow_call:
    inputs:
      node_version:
        required: false
        type: string
        default: "20"
      package_manager:
        required: false
        type: string
        default: "npm"
      project_name:
        required: true
        type: string
      deploy_environment:
        required: false
        type: string
        default: "des"
jobs:
  ci:
    uses: CAIXAPLATFORM/github-workflows-jobs/.github/workflows/typescript--ci.yml@v1
    with:
      node_version: ${{ inputs.node_version }}
      package_manager: ${{ inputs.package_manager }}
      project_name: ${{ inputs.project_name }}
    secrets: inherit
  cd:
    uses: CAIXAPLATFORM/github-workflows-jobs/.github/workflows/shared--cd.yml@v1
    needs: ci
    with:
      artifact_id: ${{ inputs.project_name }}
      artifact_type: "npm"
      deploy_environment: ${{ inputs.deploy_environment }}
    secrets: inherit
iOS — CI
Input	Tipo	Obrigatório	Default	Descrição
scheme	string	sim	—	Scheme do Xcode
xcode_version	string	não	"15.4"	Versão do Xcode
bundle_id	string	sim	—	Bundle identifier
name: iOS – CI
on:
  workflow_call:
    inputs:
      scheme:
        required: true
        type: string
      xcode_version:
        required: false
        type: string
        default: "15.4"
      bundle_id:
        required: true
        type: string
jobs:
  orchestrate:
    uses: CAIXAPLATFORM/github-workflows-jobs/.github/workflows/ios--ci.yml@v1
    with:
      scheme: ${{ inputs.scheme }}
      xcode_version: ${{ inputs.xcode_version }}
      bundle_id: ${{ inputs.bundle_id }}
    secrets: inherit
Android — CI
Input	Tipo	Obrigatório	Default	Descrição
module	string	não	"app"	Módulo Gradle
build_variant	string	não	"debug"	Variante de build
java_version	string	não	"17"	Versão do JDK
name: Android – CI
on:
  workflow_call:
    inputs:
      module:
        required: false
        type: string
        default: "app"
      build_variant:
        required: false
        type: string
        default: "debug"
      java_version:
        required: false
        type: string
        default: "17"
jobs:
  orchestrate:
    uses: CAIXAPLATFORM/github-workflows-jobs/.github/workflows/android--ci.yml@v1
    with:
      module: ${{ inputs.module }}
      build_variant: ${{ inputs.build_variant }}
      java_version: ${{ inputs.java_version }}
    secrets: inherit
App-Infra — Policy Gate & GitOps Sync
Valida o values.yaml de um repositório app-infra contra as políticas de security-policies-as-code e, após o merge, propaga o resultado para o gitops-apps via PR.

Um workflow só, com os dois gatilhos — mesma ideia de docker--build-push-quarantine: em pull_request apenas valida; em push valida e escreve. O evento é detectado pela própria orquestração (github.event_name já é o evento do chamador dentro de um reusable workflow), então não há input para isso.

Input	Tipo	Obrigatório	Default	Descrição
env_name	string	sim	—	nprd ou prd — qual bloco de limits.yaml aplica
values_path	string	sim	—	Caminho do values.yaml da app no repositório chamador
gitops_team	string	não	""	Segmento de time em apps/<team>/.... Vazio desliga o sync
gitops_app	string	não	""	Segmento da app em apps/<team>/<app>/...
gitops_repo	string	não	CAIXAPLATFORM/gitops-apps	Repositório GitOps de destino
gitops_owner	string	não	CAIXAPLATFORM	Org dona do token de escrita
gitops_base_branch	string	não	main	Branch base do PR no GitOps
direct_commit_envs	string	não	""	Ambientes escritos direto na branch base, sem PR. Vazio (padrão) = PR para todos os ambientes. Inclua um ambiente só depois de validar o fluxo nele
security_policies_repo	string	não	CAIXA-GOVERNANCE/security-policies-as-code	Repositório das políticas de segurança
security_policies_ref	string	não	main	Branch/tag das políticas
security_policies_dir	string	não	security-policies	Diretório local do checkout das políticas
security_policies_owner	string	não	CAIXA-GOVERNANCE	Org dona do token de GitHub App
runner_label	string	não	ubuntu-latest	Label do runner
Secret	Obrigatório	Descrição
GH_APP_ID	sim	App ID do GitHub App com leitura em CAIXA-GOVERNANCE/security-policies-as-code
GH_APP_PRIVATE_KEY	sim	Chave privada do mesmo GitHub App
GH_PLATFORM_APP_ID	não	Client ID do GitHub App multi-org (o mesmo usado pelos workflows migration--*), com Contents: Write e Pull requests: Write em gitops-apps. Só necessário quando gitops_team está preenchido
GH_PLATFORM_APP_PRIVATE_KEY	não	Chave privada do mesmo App
name: App-Infra Policy Gate

on:
  pull_request:
    paths:
      - "nprd/values.yaml"
  push:
    branches: [main]
    paths:
      - "nprd/values.yaml"

jobs:
  gate:
    uses: CAIXAPLATFORM/github-solutions/.github/workflows/appinfra--policy-gate.yml@main
    with:
      env_name: nprd
      values_path: nprd/values.yaml
      gitops_team: poc
      gitops_app: demo-app
    secrets:
      GH_APP_ID: ${{ secrets.GH_APP_ID }}
      GH_APP_PRIVATE_KEY: ${{ secrets.GH_APP_PRIVATE_KEY }}
      GH_PLATFORM_APP_ID: ${{ secrets.GH_PLATFORM_APP_ID }}
      GH_PLATFORM_APP_PRIVATE_KEY: ${{ secrets.GH_PLATFORM_APP_PRIVATE_KEY }}
Para usar apenas o portão, sem propagar: omita gitops_team/gitops_app e os dois secrets GH_PLATFORM_APP_*, e deixe só o gatilho pull_request.

O que é escrito no gitops-apps
Destino: apps/<gitops_team>/<gitops_app>/environments/<env_name>/values-<env_name>.yaml.

O conteúdo é o bloco caixa-base-chart: do values.yaml da app-infra, sem o wrapper (o destino é plano) e sem image — essa chave pertence a release-patch.yaml, reescrito por FusionX/Ansible a cada release. A fronteira está documentada no próprio gitops-apps.

A escrita só acontece quando há mudança de fato: rodar de novo com o mesmo values.yaml não produz commit nem PR. Se o diretório da app não existir no gitops-apps, o job falha com mensagem explícita — o onboarding da app lá continua sendo passo à parte.

Como a mudança chega ao gitops-apps depende de direct_commit_envs:

Ambiente	Comportamento
fora da lista — padrão para todos	PR aberto aguardando revisão humana
na lista (ex.: direct_commit_envs: "nprd")	Commit direto na branch base. Sem PR, sem espera — o ArgoCD sincroniza na próxima passada
O padrão é conservador de propósito: nada chega a um cluster sem alguém ver o diff. Habilite o commit direto por ambiente depois de validar o fluxo nele.

No commit direto, se outra execução escrever no gitops-apps entre o checkout e o push, o job faz rebase e tenta de novo (até 3 vezes) — sem isso a sincronização se perderia em silêncio até a próxima alteração do values.yaml.

E2E de dispatch assíncrono multi-organização
Esta solução de referência comprova o transporte íntegro de um único artefato entre o repositório chamador e a plataforma, com duas janelas privilegiadas curtas. Solutions apenas orquestram workflows reutilizáveis: não executam steps ou comandos run e não recebem valores de segredos de aplicação.

Arquitetura e sequência dos cinco runs
Run	Organização	Responsabilidade
Run 1	Chamador	Executa qualidade, constrói o artefato uma única vez e envia a solicitação artifact.
Run 2	Plataforma	Busca, valida, sela e atesta o artefato; então envia o callback artifact-prepared.
Run 3	Chamador	Verifica o artefato republicado, executa o smoke test e envia a solicitação deploy-check.
Run 4	Plataforma	Repete a autorização do segredo, executa o deploy dry-run e envia o callback deploy-check-complete.
Run 5	Chamador	Valida a cadeia completa, o recibo e os cinco runs; publica o resultado final.
Os jobs dos runs 1, 3 e 5 executam no contexto do chamador com arc-runner-set-default-nprod. Os handlers da plataforma usam arc-runner-set-default-aks-nprod em DES e arc-runner-set-default-aks-prod em PRD.

O correlation_id, o SHA-256 do payload e os identificadores dos runs ligam as cinco execuções. A plataforma não recompila a aplicação e os callbacks não transportam tokens nem valores de segredos.

Contratos das solutions
Arquivo	Gatilho	Contrato
e2e--ci.yml	workflow_call	Encadeia qualidade, único build e dispatch da fase artifact.
e2e--artifact-handler.yml	workflow_dispatch	Valida a solicitação, transfere e sela o artefato e sempre tenta o callback do Run 2.
e2e--continue.yml	workflow_call	Valida artifact-prepared, executa o smoke test no Run 3 e despacha deploy-check.
e2e--deploy-handler.yml	workflow_dispatch	Executa o deploy dry-run e sempre tenta o callback do Run 4.
e2e--finalize.yml	workflow_call	Valida deploy-check-complete, o recibo e a proveniência antes do status final.
Os contratos usam inputs em kebab-case e payloads JSON com schema fechado. Os handlers são fail-closed: falhas, cancelamentos, jobs ignorados e outputs obrigatórios vazios produzem callback de falha sanitizado.

Variáveis, segredos e ambientes
O repositório chamador configura:

Tipo	Nome	Uso
Variável	GH_APP_ID	Identificador do GitHub App que inicia os handlers e lê artefatos.
Segredo	GH_APP_PRIVATE_KEY	Chave privada do GitHub App; nunca entra no payload.
O repositório github-solutions configura as variáveis AZURE_TENANT_ID, AZURE_TOKEN_ISSUER_CLIENT_ID, AZURE_APPS_KEYVAULT_NAME=kv-sigit-apps-prd, AZURE_GITHUB_APP_SIGNING_KEY_NAME, E2E_APP_ID e E2E_INSTALLATION_ID_CAIXAGITHUB.

Os ambientes do GitHub des e prd configuram AZURE_CLIENT_ID, AZURE_SUBSCRIPTION_ID e AZURE_CONSUMER_KEYVAULT_NAME. Nenhuma credencial estática do Azure é permitida como alternativa.

Identidades, cofres e executores
Operação	Identidade	Cofre	Executor
Token e callback da plataforma	SIDPPB011	kv-sigit-apps-prd	Executor protegido da plataforma sem ambiente de aplicação
Segredo de aplicação em des	SIDPPB013	kv-sigit-secrets-des	arc-runner-set-default-aks-nprod
Segredo de aplicação em prd	SIDPPB012	kv-sigit-secrets-prd	arc-runner-set-default-aks-prod
O ambiente validado seleciona o executor e a identidade. Não existe fallback automático de executor, cofre ou credencial quando OIDC, DNS, rede ou RBAC falha.

Nomes e autorização dos segredos
Os nomes corporativos usados pela matriz são:

siiad-backendtestepagamentos-nprd-smoketest para develop/des;
siiad-backendtestepagamentos-prd-smoketest para main/prd.
Antes de ler o valor, o workflow privilegiado exige as cinco tags:

Tag	Valor esperado
repository_id	1296736810
scope	app
team	siiad
app	backend-testepagamentos
environment	nprd em des; prd em prd
O valor só é lido depois da validação do nome, do repositório e das cinco tags. Ele permanece no job privilegiado e nunca aparece em saída, artefato, resumo, callback ou log.

Execução da matriz
Os pares permitidos são develop/des e main/prd. Uma execução manual por workflow_dispatch também deve informar um environment coerente com a ref; qualquer divergência falha em modo fail-closed antes do acesso privilegiado.

Execução manual padrão: main + prd.
Execução manual alternativa: develop + des.
Durante o desenvolvimento coordenado, as referências entre os repositórios são temporariamente @feat/e2e-dispatch. Antes da matriz OIDC real, há um gate obrigatório: substituir todas essas referências por tags ou SHAs imutáveis, publicados na ordem github-actions, github-workflow-jobs, github-solutions e repositório chamador. A matriz não deve ser executada contra branches mutáveis.

Resumos, callbacks e diagnóstico
Os jobs de verificação e smoke test registram executor (runner), pod e evidência do artefato. A finalização registra status, código de falha e links para os cinco runs. Os callbacks artifact-prepared e deploy-check-complete carregam somente o schema público sanitizado.

O deploy dry-run não chama ArgoCD, Ansible, registry ou endpoint da aplicação. O recibo final deve registrar executed=false; qualquer outro valor reprova o Run 5.

Use os códigos de falha abaixo para diagnóstico:

Código	Verificação principal
invalid_payload	Schema, tipos, UUID, branch e ambiente.
caller_validation_failed	Repositório, ID, SHA, ref e proveniência do run chamador.
oidc_login_failed	Subject, FIC, tenant e AZURE_CLIENT_ID.
vault_unreachable	DNS, private endpoint, rota e firewall do cofre.
vault_access_denied	RBAC da identidade no Key Vault.
secret_tags_invalid	Nome e cinco tags obrigatórias do segredo.
artifact_not_found	Nome, run de origem, retenção e permissão Actions: read.
artifact_digest_mismatch	Digest do payload, manifesto e atestação.
artifact_seal_failed	Selagem, atestação e publicação do artefato final.
smoke_test_failed	Pacote verificado e comando de smoke test do chamador.
dry_run_failed	Recibo, executed=false e ausência de operação real.
callback_failed	GitHub App, cofre de assinatura e permissão no repositório chamador.
Se o callback não puder ser enviado, consulte os jobs e logs do handler e do callback. Não reutilize segredo estático, não troque de identidade e não desvie para outro executor para mascarar a causa.

⚠️ Arquivos Legados
Os seguintes arquivos são legados e não seguem a convenção de nomes estabelecida. Eles devem ser refatorados para se adequar ao padrão atual:

Arquivo	Status	Observação
quality-assurance.yml	Legado	Refatorar para quality--analysis.yml
dotnet-libs-pipelines.yml	Legado	Refatorar para dotnet--lib--ci-cd.yml
generic-pipelines.yaml	Legado	Refatorar para generic--ci-cd.yml
dockerfile-validation-pipelines.yaml	Legado	Refatorar para docker--validation.yml
codeql-pipelines.yaml	Legado	Refatorar para security--codeql.yml
!!! warning "Importante" Não adicione novos workflows neste padrão. Siga a convenção de nomes ao criar novos workflows.

Governança
Aspecto	Regra
Versionamento	Semantic versioning via tags (v1, v1.2.0)
Breaking changes	Incremento de major version (v1 → v2)
Review	Mínimo 2 aprovações para merge em main
Testes	Todo contrato deve ter workflow de validação
About

No description, website, or topics provided.
Resources
Readme
Activity
Custom properties
Stars
0 stars
Watchers
0 watching
Forks
0 forks
Releases
No releases published
Create a new release
Deployments
44
 (44)
nprd
des
2 months ago
Packages
No packages published
Publish your first package
Contributors
6
 (6)
@c159719_caixa
@f671632_caixa
@f647481_caixa
@c159788_caixa
@c112141_caixa
@c161184_caixa
Languages
Python
100%
Footer
© 2026 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Community
Docs
Contact
Manage cookies
Do not share my personal information
 
