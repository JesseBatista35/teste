api é essa


siagf-backend-clerk-transaction-raw



​
Search...

Home logo
Home
Catalogo
Self-service
APIs
Aprendizado
Meu grupo
Notifications
1
My Org Catalog
Kind

component
Type

api
Personal

0

0
My Org

23
Owner
group:g_az_box_beopf
​
Lifecycle
​
Tags
​
Processing Status
​
Namespace
​
All api Components (24)
Search
sibsa-api-bacen-mqd	
sibsa	
G_AZ_BOX_BEOPF	estavel	
Projeto do Open Finance na CAIXA
sibsa-api-dc-cartao-de-credito	
sibsa	
G_AZ_BOX_BEOPF	estavel	
Projeto do Open Finance na CAIXA
sibsa-api-intra-mqd-worker	
sibsa	
G_AZ_BOX_BEOPF	estavel	
Projeto do Open Finance na CAIXA
sibsa-api-intra-pcm-worker	
sibsa	
G_AZ_BOX_BEOPF	estavel	
Projeto do Open Finance na CAIXA
sibsa-api-intra-webhook-notifier	
sibsa	
G_AZ_BOX_BEOPF	estavel	
Projeto do Open Finance na CAIXA
sidpn-api-dc-credito-financiamentos	
sidpn	
G_AZ_BOX_BEOPF	estavel	
Projeto do Open Finance na CAIXA
sidpn-api-dc-fundos-investimento	
sidpn	
G_AZ_BOX_BEOPF	estavel	
Projeto do Open Finance na CAIXA
sidpn-api-dc-titulos-tesouro-direto	
sidpn	
G_AZ_BOX_BEOPF	estavel	
Projeto do Open Finance na CAIXA
sidpn-api-intra-cambio	
sidpn	
G_AZ_BOX_BEOPF	estavel	
Projeto do OpenFinance da Caixa
sidpn-api-intra-listar-investimentos	
sidpn	
G_AZ_BOX_BEOPF	estavel	
Projeto do Open Finance da CAIXA
sidpn-api-intra-scheduler	
sidpn	
G_AZ_BOX_BEOPF	estavel	
Projeto do Open Finance na CAIXA
sioba-api-dc-consentimento	
sioba	
G_AZ_BOX_BEOPF	estavel	
Projeto do Open Finance na CAIXA
sioba-api-intra-integracao	
sioba	
G_AZ_BOX_BEOPF	estavel	
Projeto do Open Finance na CAIXA
sioba-api-intra-integracao-crawler	
sioba	
G_AZ_BOX_BEOPF	estavel	
projeto da sigla SIOBA do OpenFinance da Caixa
sioba-api-intra-integracao-sibsa	
sioba	
G_AZ_BOX_BEOPF	estavel	
Projeto do Open Finance na CAIXA
sioba-api-intra-pingid	
sioba	
G_AZ_BOX_BEOPF	estavel	
projeto da sigla SIOBA do OpenFinance da Caixa
sioba-api-intra-portal	
sioba	
G_AZ_BOX_BEOPF	estavel	
Projeto do Open Finance na CAIXA
sioba-api-intra-recepcao	
sioba	
G_AZ_BOX_BEOPF	estavel	
Projeto do Open Finance na CAIXA
sioba-api-intra-scheduler	
sioba	
G_AZ_BOX_BEOPF	estavel	
Projeto do Open Finance na CAIXA
sioba-api-intra-transmissao	
sioba	
G_AZ_BOX_BEOPF	estavel	
Projeto do Open Finance na CAIXA








nao ta aqui na lista


tem ela no git hub


Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
siagf-backend-clerk-transaction-raw
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
1
 (1)
Insights
Settings
caixagithub
siagf-backend-clerk-transaction-raw
Private
Go to file
t
T
c050605_caixa
Rosana Cristina Faverao (c050605_caixa)
Merge pull request #6 from caixagithub/feature/prd-env-and-cnpj-first…
83b0851
 · 
yesterday
Name		
.github/workflows
feat: CNPJ-first customerId resolution, cpf passthrough field and PRD…
yesterday
siagf-backend-clerk-transaction-raw.Worker.Tests
feat: CNPJ-first customerId resolution, cpf passthrough field and PRD…
yesterday
siagf-backend-clerk-transaction-raw.Worker
feat: CNPJ-first customerId resolution, cpf passthrough field and PRD…
yesterday
.dockerignore
feat: migrate ehdadosclientesout worker source to siagf-backend-clerk…
5 days ago
.gitignore
feat: migrate ehdadosclientesout worker source to siagf-backend-clerk…
5 days ago
Dockerfile
feat: migrate ehdadosclientesout worker source to siagf-backend-clerk…
5 days ago
README.md
feat: migrate ehdadosclientesout worker source to siagf-backend-clerk…
5 days ago
catalog-info.yaml
Adicionando informações ao catálogo no repositório: siagf-backend-cle…
last week
mkdocs.yaml
feat: migrate ehdadosclientesout worker source to siagf-backend-clerk…
5 days ago
siagf-backend-clerk-transaction-raw.sln
feat: migrate ehdadosclientesout worker source to siagf-backend-clerk…
5 days ago
Repository files navigation
README
siagf-backend-clerk-transaction-raw
Worker que consome eventos de transaÃ§Ãµes do Open Finance da fila ehdadosclientes_out, identifica a famÃ­lia da transaÃ§Ã£o pela uri de origem, normaliza o envelope e republica o resultado na fila of-raw-transaction-received-account-normal.

Ã‰ o primeiro estÃ¡gio da esteira de transaÃ§Ãµes do Clerk/SIAGF:

ehdadosclientes_out
        |
        v
[ este worker ]  -->  of-raw-transaction-received-account-normal
                                    |
                                    v
                            normalization  -->  ledger  -->  projections (hot / warm / cold)
O que o worker faz
Consome o evento bruto da fila de entrada usando EventProcessorClient, com checkpoint em Azure Blob Storage.
LÃª o campo uri do evento e localiza o descritor correspondente no TransactionUriCatalog. Uri nÃ£o catalogada Ã© rejeitada com motivo explÃ­cito (Unsupported uri: ...), sem derrubar o processamento.
Monta o OutboundRawTransactionEvent, resolvendo cada campo do envelope com fallbacks (ver tabela abaixo).
Publica o evento transformado na fila de saÃ­da com partitionKey = "{userId}:{accountId}", garantindo ordenaÃ§Ã£o por conta.
Faz checkpoint do evento processado.
Discriminador movementType
O worker deriva movementType da uri, e nÃ£o do shape do payload. Isso torna o campo um discriminador autoritativo: os serviÃ§os seguintes nÃ£o precisam inferir a famÃ­lia da transaÃ§Ã£o inspecionando o JSON.

FamÃ­lia	movementType	investmentType
Contas	ACCOUNT	ausente
CartÃ£o de crÃ©dito	CREDIT_CARD	ausente
Investimentos	INVESTMENT	BANK_FIXED_INCOME, CREDIT_FIXED_INCOME, VARIABLE_INCOME, TREASURE_TITLES, FUNDS
Uris suportadas
15 descritores no total. Cada famÃ­lia expÃµe transactions e transactions-current:

accounts/v2 â€” contas (filtros fromBookingDate / toBookingDate)
credit-cards-accounts/v2 â€” cartÃ£o de crÃ©dito (filtros fromTransactionDate / toTransactionDate)
credit-cards-accounts/v2/.../bills/{billId}/transactions â€” transaÃ§Ãµes escopadas por fatura
bank-fixed-incomes/v1, credit-fixed-incomes/v1, variable-incomes/v1, treasure-titles/v1, funds/v1 â€” investimentos
ResoluÃ§Ã£o dos campos do envelope
Campo de saÃ­da	Origem	Fallback
institutionId	transmitterOrgId	â€” (obrigatÃ³rio)
userId	userId	cpf, depois cnpj
accountId	accountId	segmento do path em endPoint / links.self
fromTransactionDate	campo direto	query param da uri conforme a famÃ­lia
toTransactionDate	campo direto	query param da uri conforme a famÃ­lia
rawPayload	payload	â€” (deve ser JSON vÃ¡lido)
billId	billId	segmento bills/{billId} do path
correlationId	correlationId	gerado quando ausente
Atributo billId
billId Ã© propagado apenas como dado. NÃ£o participa da canonizaÃ§Ã£o nem da deduplicaÃ§Ã£o a jusante: no Open Finance (credit-cards-accounts 2.4.0) o campo nÃ£o Ã© required e passa a existir somente quando a fatura fecha. UsÃ¡-lo como identidade faria a mesma transaÃ§Ã£o trocar de id ao fechamento da fatura, duplicando documentos na projeÃ§Ã£o warm.

ConfiguraÃ§Ã£o
SeÃ§Ãµes de appsettings.json:

Chave	DescriÃ§Ã£o	PadrÃ£o
EventHub:InputHubName	Fila de entrada	ehdadosclientes_out
EventHub:OutputHubName	Fila de saÃ­da	of-raw-transaction-received-account-normal
EventHub:ConsumerGroup	Consumer group	siagf-cg-clerk-worker
EventHub:CheckpointContainer	Container de checkpoint no Blob Storage	eventhub-checkpoints
EventHub:InitialPosition	PosiÃ§Ã£o inicial de leitura	Earliest
Worker:MaxConcurrentEventsPerInstance	Eventos processados em paralelo (1â€“256)	8
Retry:*	Backoff exponencial com jitter para falhas transitÃ³rias	ver arquivo
HealthChecks:Path	Rota do health check	/healthz
Todas as seÃ§Ãµes sÃ£o validadas na inicializaÃ§Ã£o (ValidateOnStart): configuraÃ§Ã£o invÃ¡lida falha o start em vez de degradar em runtime.

Segredos
Nunca versionados. Devem vir de variÃ¡veis de ambiente, user secrets ou do cofre:

Segredo	Chave
ConexÃ£o do Event Hubs	ConnectionStrings:EventHub
ConexÃ£o do Storage de checkpoint	ConnectionStrings:Storage ou AZURE_STORAGE_CONNECTION_STRING
dotnet user-secrets --project siagf-backend-clerk-transaction-raw.Worker `
  set "ConnectionStrings:EventHub" "<connection-string>"
Executando
dotnet restore siagf-backend-clerk-transaction-raw.sln
dotnet build   siagf-backend-clerk-transaction-raw.sln
dotnet test    siagf-backend-clerk-transaction-raw.sln
dotnet run --project siagf-backend-clerk-transaction-raw.Worker
Health check: GET http://localhost:5116/healthz. Responde Healthy somente depois que o processador de eventos estÃ¡ ativo. O worker nÃ£o expÃµe nenhum outro endpoint HTTP.

Windows / MAX_PATH. Os nomes de projeto sÃ£o longos. Em mÃ¡quinas com LongPathsEnabled = 0, o build falha com MSB3202 (projeto nÃ£o encontrado) mesmo com os arquivos presentes. Contorne mapeando uma unidade curta: subst X: <caminho-do-repo>; Set-Location X:\

ContÃªiner
docker build -t siagf-backend-clerk-transaction-raw .
docker run --rm -p 8080:8080 `
  -e "ConnectionStrings__EventHub=<connection-string>" `
  -e "ConnectionStrings__Storage=<connection-string>" `
  siagf-backend-clerk-transaction-raw
Testes
36 casos cobrindo o catÃ¡logo de uris, o transformador genÃ©rico e o dispatcher.

dotnet test siagf-backend-clerk-transaction-raw.sln
Cobertura em formato OpenCover para o Sonar:

dotnet test siagf-backend-clerk-transaction-raw.sln `
  /p:CollectCoverage=true /p:CoverletOutputFormat=opencover
Estrutura
siagf-backend-clerk-transaction-raw.Worker/
  Configuration/    opÃ§Ãµes tipadas e validadas (EventHub, Worker, Retry, HealthChecks)
  Extensions/       composiÃ§Ã£o de DI e da infraestrutura do Event Hubs
  Health/           health check baseado no estado do processador
  HostedServices/   loop de consumo, despacho, publicaÃ§Ã£o e checkpoint
  Interfaces/       contratos do transformador e do dispatcher
  Models/           envelope de saÃ­da e descritor de uri
  Operational/      polÃ­tica de retry para falhas transitÃ³rias
  Transformers/     catÃ¡logo de uris, transformador genÃ©rico e dispatcher

siagf-backend-clerk-transaction-raw.Worker.Tests/
  Transformers/     testes do catÃ¡logo, do transformador e do dispatcher
About

Adicionando aplicação: siagf-backend-clerk-transaction-raw

Topics
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
29
 (29)
DES
2 hours ago
PRD
Packages
No packages published
Publish your first package
Contributors
4
 (4)
@c050605_caixa
c050605_caixaRosana Cristina Faverao
@c161625_caixa
c161625_caixaMarthus Athaide Sera
@c161501_caixa
c161501_caixaArthur Braz Farias
@S77620B01_caixa
S77620B01_caixaS77620B01
Languages
C#
98.5%
Dockerfile
1.5%
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
 
