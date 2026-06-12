Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
code Search Results · org:caixagithub DevSecOps-Solutions
Filter by
Languages
Repositories
Paths
Advanced
1.1k files
 (505 ms)
1.1k files
in
caixagithub(press backspace or delete to remove)
Files with identical content are grouped together. 


caixagithub/DevSecOps-Solutions · README.md
Markdown
·
1
 (1)
"# coe-nuvem-devsecops-solutions " 


caixagithub/DevSecOps-Solutions-New-Flow-Test · README.md


caixagithub/sigcn-documentacao · devsecops/workflows.md
Markdown
·
7
 (7)
| Repositório | Descrição |
|-------------|-----------|
| [DevSecOps-StandAloneDocs](https://github.com/caixagithub/DevSecOps-StandAloneDocs) | Documentação |
| [DevSecOps-Solutions](https://github.com/caixagithub/DevSecOps-Solutions) | Pipelines genéricas |
| [DevSecOps-Templates](https://github.com/caixagithub/DevSecOps-Templates) | Templates de workflow |
| [DevSecOps-Pipelines](https://github.com/caixagithub/DevSecOps-Pipelines) | Pipelines auxiliares |
| [DevSecOps-Qualidade](https://github.com/caixagithub/DevSecOps-Qualidade) | Qualidade de código |
Show 5 more matches


caixagithub/DevSecOps-Automations · testa-autmotion.py
Python
·
1
 (1)
    'jobs': {
        'Generic-Solution': {
            'name': 'CI_DES',
            'uses': 'caixagithub/DevSecOps-Solutions/.github/workflows/generic-pipelines.yaml@main',
            'secrets': 'inherit',
            'with': {
                'DEPLOY_ENVIRONMENTS': '["DES","TQS","HMP","PLT","PRD"]',


caixagithub/DevSecOps-StandAloneDocs · sec-pipeline.md
Markdown
·
1
 (1)
`caixagithub/DevSecOps-Solutions/.github/workflows/codeql-pipelines.yaml@main`


caixagithub/software-template-devhub · catalog/box_LN.txt
Text
·
1
 (1)
sictm-ios	appios,cidadaniadigital
coe-nuvem-devsecops-projetos	
DevSecOps-Seguranca	
DevSecOps-Solutions	
DevSecOps-Templates	
sictm-android	cidadaniadigital
DevSecOps-Pipelines	templatecoe,templatecoe2


caixagithub/silce-carrinho · azure-pipelines.yaml
YAML
·
1
 (1)
  repositories:
    - repository: devsecopsSolutions
      type: git
      name: CoE - Nuvem DevSecOps/DevSecOps-Solutions
      ref: refs/heads/custom-ingress-class
name: $(Build.Repository.Name)_$(Build.SourceBranch)_$(Build.BuildId).$(Rev:.r)


caixagithub/sisph-documentacao · docs/libs/libs-net/Criação de Libs Para o .Net.md
Markdown
·
2
 (2)
    name: call-template
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/dotnet-libs-pipelines.yml@main
    with:
    name: call-template
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/dotnet-libs-pipelines.yml@dotnet_test
    secrets: inherit


caixagithub/siacx-plataforma-apis · apim.yaml
YAML
·
1
 (1)
  repositories:
    - repository: devsecopsSolutions
      type: git
      name: CoE - Nuvem DevSecOps/DevSecOps-Solutions
      ref: refs/heads/main
name: $(Build.Repository.Name)_$(Build.SourceBranch)_$(Build.BuildId).$(Rev:.r)


caixagithub/siacx-plataforma-backend · azure-pipelines.yml
YAML
·
1
 (1)
  repositories:
    - repository: devsecopsSolutions
      type: git
      name: CoE - Nuvem DevSecOps/DevSecOps-Solutions
      ref: refs/heads/main
name: $(Build.Repository.Name)_$(Build.SourceBranch)_$(Build.BuildId).$(Rev:.r)


caixagithub/siplx-agentes · knowledge_base/devops/SETUP_CICD_PIPELINE.md
Markdown
·
6
 (6)
…ias, baseado no workflow reutilizável caixagithub/DevSecOps-Solutions (generic-pipelines.yaml). Define o arquivo .gith…
…chamam o workflow reutilizável central `caixagithub/DevSecOps-Solutions/.github/workflows/generic-pipelines.yaml@main`.
…ela **chama** o workflow reutilizável central do `DevSecOps-Solutions`, passando parâmetros via `with:` e repassando o…
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/generic-pipelines.yaml@main
| `uses` | `caixagithub/DevSecOps-Solutions/.github/workflows/generic-pipelines.yaml@main` | Manter `@main` |
- [ ] `uses` aponta para `DevSecOps-Solutions/.github/workflows/generic-pipelines.yaml@main` com `secrets: inherit`


caixagithub/sirmc-emailmarketing-block-emails · dotnet-pipelines.yaml
YAML
·
1
 (1)
  repositories:
    - repository: devsecopsSolutions
      type: git
      name: CoE - Nuvem DevSecOps/DevSecOps-Solutions
      ref: refs/heads/main
    
  


caixagithub/siacx-motor-indexacao · python-pipelines.yaml
YAML
·
1
 (1)
  repositories:
    - repository: devsecopsSolutions
      type: git
      name: CoE - Nuvem DevSecOps/DevSecOps-Solutions
      ref: refs/heads/custom-ingress-class
name: $(Build.Repository.Name)_$(Build.SourceBranch)_$(Build.BuildId).$(Rev:.r)


caixagithub/siana-backend · siana-pipeline.yaml
YAML
·
1
 (1)
  repositories:
    - repository: devsecopsSolutions
      type: git
      name: CoE - Nuvem DevSecOps/DevSecOps-Solutions
      ref: refs/heads/main
name: $(Build.Repository.Name)_$(Build.SourceBranch)_$(Build.BuildId).$(Rev:.r)


caixagithub/silce-meio-pagamento · azure-pipelines-apim.yaml
YAML
·
1
 (1)
  repositories:
    - repository: devsecopsSolutions
      type: git
      name: CoE - Nuvem DevSecOps/DevSecOps-Solutions
      ref: refs/heads/main
name: $(Build.Repository.Name)_$(Build.SourceBranch)_$(Build.BuildId).$(Rev:.r)


caixagithub/siacx-backend-curadoria · java-quarkus-pipelines.yaml
YAML
·
1
 (1)
  repositories:
    - repository: devsecopsSolutions
      type: git
      name: CoE - Nuvem DevSecOps/DevSecOps-Solutions
      ref: refs/heads/main
name: $(Build.Repository.Name)_$(Build.SourceBranch)_$(Build.BuildId).$(Rev:.r)


caixagithub/silce-parametros-gestao · call-generic-apim.yaml
YAML
·
2
 (2)
# uses: caixagithub/DevSecOps-Solutions/.github/workflows/generic-apim.yaml@main      -> Template reutilizado          …
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/generic-apim.yaml@main


caixagithub/siacx-backend-chatcaixa-agents365 · workflows/call-generic-sec-pipelines.yaml
YAML
·
2
 (2)
# uses: caixagithub/DevSecOps-Solutions/.github/workflows/codeql-pipelines.yaml@main  -> Template reutilizado          …
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/codeql-pipelines.yaml@main


caixagithub/sisph-bff-jnd-pagamentos · workflows/call-generic-sec-pipelines.yaml


caixagithub/siidx-assinador-api-neosigner · azure-pipelines.yml
YAML
·
1
 (1)
      name: CoE - Nuvem DevSecOps/DevSecOps-Solutions


caixagithub/sirmc-api-meu-relacionamento · dotnet-pipelines.yaml
YAML
·
1
 (1)
  repositories:
    - repository: devsecopsSolutions
      type: git
      name: CoE - Nuvem DevSecOps/DevSecOps-Solutions
      ref: refs/heads/ativacaoServicosCaixaMudanca
 
name: $(Build.Repository.Name)_$(Build.SourceBranch)_$(Build.BuildId).$(Rev:.r)


caixagithub/DevSecOps-StandAloneDocs · integracao-gsc.md
Markdown
·
1
 (1)
…rquivo `generics-pipelines.yml` no repositório de DevSecOps-Solutions branch: **[integracao-gsc]**. A pipeline é respo…



tem o gitops



Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
gitops
Repository navigation
Code
Issues
Pull requests
8
 (8)
Actions
Projects
Models
Wiki
Security and quality
Insights
Settings
Files
Go to file
t
T
apps
06052026-teste-ativar-ambiente
aplicacao-teste
coe-java-api
demo-sd195-backend-04052026-teste-jornada-dep
demo-sd603-sd603-frontend
devsecops-webhooks
sample-quarkus-aks
siaad-teste-140042026
siaad-teste-prd-pipelineagil-20260401-03
siaad-teste-prd-pipelineagil-20260401-04
siaad-us86163-output-new-repo-1
siaad-us86163-output-new-repo-2
siaad-us86163-output-playbook-1
siaas-lib-teste-qualquer-21
siabm-cadastro-kit-bio-api
siabm-doc-teste-de-criacao
siabm-matcher-facial
siabm-teste-60
siacc-demo
siaci-api-manual
siaci-componentes-net
siaci-frontend-manual
siaci-lib-mainframe
siacx-backend-bd-neo4j-grafos-conhecimento
siacx-backend-chatcaixa-agents365
siacx-backend-curadoria
siacx-chatcaixa-frontend
siacx-chatcaixa-mcp-server
siacx-chatcaixa-orquestrador
siacx-frontend-curadoria
siacx-motor-indexacao
siacx-plataforma-apis
siacx-plataforma-backend
siacx-plataforma-frontend
siacx-sonar-mcp-server
siagf-api-gestor
siagf-app
siagf-clerk-api
siagf-clerk-opf-api
siagf-clerk-worker
siagf-gestor
siagf-mfe-adm-vinculo-opf
siagf-mfe-plataforma-opf-dados
siagf-microofertas-api
siagf-microofertas-service
siagf-mpc-server
siagf-plataforma-adm-vinculos
siagf-plataforma-opf-dados
siagf-portabilidade-service
siagf-user-preferences-service
siana-backend
siath-backend-app
siath-frontend-internet
sibko-administracao-api
sibko-administracao-spa
sibko-api-fluxo-guiado-api
sibko-api-gerenciador-financeiro
sibko-arquivos-api
sibko-backend-gerenciador-financeiro
sibko-frontend-gerenciador-financeiro
sibko-gateway-api
sibko-originacao-digital-api-dossie
sibko-originacao-digital-api
sibko-pos-venda-api
sibko-pos-venda-asyncapi
sibko-pos-venda-process
sibko-sibko-api
sicia-backend-web-quarkus
sicli-api-cadastro-perfil-pf
sictm-abono-service
sictm-antecipa-saque-aniversario
sictm-azulzinha-service
sictm-banners-service
sictm-bolsa-service
sictm-brcode-service
sictm-cartao-contratacao-service
sictm-cartao-debito-service
sictm-cartaovirtual-service
sictm-central-notificacoes-service
sictm-consulta-cep-service
sictm-contas-service
sictm-conversa-service
sictm-credito-trabalhador
sictm-credito
sictm-criptografia-service
sictm-demonstrativo-credito-service
sictm-emprestimo-consignado-service
sictm-encerramento-conta-service
sictm-extrato-service
sictm-geolocalizacao-service
sictm-gestao-limites-service
sictm-habitacao-service
sictm-identificacao-pos-service
sictm-meu-nis-service
sictm-mobilidade-service
sictm-mock-adapters
sictm-notas-negociacao-service
sictm-notificacao-service
sictm-open-banking-service
sictm-operacoes-lgpd-service
sictm-pagamento-boleto-service
sictm-pe-de-meia-service
sictm-pix-service
sictm-portabilidade-service
sictm-pos-venda-service
sictm-qrcode-service
sictm-rapidex-service
sictm-saiba-mais-service
sictm-saldo-service
sictm-seguranca-adapter
sictm-seguros-service
sictm-sicli-service
sictm-sictm-sinda-service
sictm-sigcn-service
sictm-siiso-service
sictm-sinda-service
sictm-termo-service
sictm-teste-adapter
sictm-transacao-elo-service
sictm-transacao-service
sidgc-registro-eletronico-api
sidgc-registro-eletronico-asyncapi
sidgc-registro-eletronico-cron
sidgc-registro-eletronico-spa
sidgc-shared
sidpn-agf-accounts
sidpn-api-dc-cambio
sidpn-api-dc-contas
sidpn-api-dc-cred-direitos-creditorios-desc
sidpn-api-dc-credito-adiantamento-depositante
sidpn-api-dc-credito-emprestimos
sidpn-api-dc-credito-financiamentos
sidpn-api-dc-fundos-investimento
sidpn-api-dc-renda-fixa-bancaria
sidpn-api-dc-renda-fixa-credito
sidpn-api-dc-renda-variavel
sidpn-api-dc-titulos-tesouro-direto
sidpn-api-intra-cambio
sidpn-api-intra-contas
sidpn-api-intra-cred-adiantamento-depositante
sidpn-api-intra-cred-prospec-portabilidade
sidpn-api-intra-credito-emprestimos
sidpn-api-intra-credito-financiamentos
sidpn-api-intra-credito-listar-contratos
sidpn-api-intra-credito-prospeccao-portabilidade
sidpn-api-intra-fundos-investimento
sidpn-api-intra-listar-investimentos
sidpn-api-intra-prospec-credconsignadofederal
sidpn-api-intra-renda-fixa-bancaria
sidpn-api-intra-renda-fixa-credito
sidpn-api-intra-renda-variavel
sidpn-api-intra-titulos-tesouro-direto
sidpn-api-pc-credito-portabilidade
sidpn-lib-services
sidpn-opf-jwt
sidpn-pc-creditoconsignadofederal
sidpn-services
sidre-da-adiantamentoadepositantes
sidre-da-cambio
sidre-da-canaisdeatendimento
sidre-da-cartaodecredito
sidre-da-contas
sidre-da-direitoscreditoriosdescontados
sidre-da-emprestimos
sidre-da-financiamentos
sidre-da-investimentos
sidre-da-previdencia
sidre-da-seguros
sidre-da-titulosdecapitalizacao
sidre-mt-admin
sidre-mt-comum
sidre-opf-participantes
sidre-portal-api
sidre-portal-web
sidre-worker
sidrx-ativos-sustentabilidade
sidsc-sdsc-angular
sidsc-template
siecm-api-middleware
siecm-frontend
sifap-intranet-backend
sifap-poc-ia-backend
sifce-api-agendador
sifce-api-cadastro-fundos
sifce-api-cadastro
sifce-api-canais
sifce-api-contabilidade
sifce-api-contrato
sifce-api-financeiro
sifce-api-fundos
sifce-api-relatorio
sifce-api-transferencia-recursos
sifce-front-autenticacao
sifce-fundos
sigac-api-gestao-arquivistica
sigam-teste-andre-3
sigam-teste-andre2
sigaq-api-gestao-documental
sigaq-api-gestor-mfe-host
sigaq-back-api
sigaq-front-gestor-mfe-header
sigaq-front-gestor-mfe-host
sigaq-front-gestor-mfe-infra
sigaq-front-gestor-mfe-temporalidade
sigch-teste-corrige-times-1
sigcn-api-orquestrador-api
sigcn-api-orquestrador
sigcn-contestacao-backend
sigcn-contestacao-mfe
sigcn-devolucao-worker
sigcn-digital-painel-gestao-backend
sigcn-digital-painel-gestao-frontend
sigcn-digital-painel-gestao
sigcn-frontend-contestacao-mfe-aks
sigcn-frontend-parecer-contestacao-aks
sigcn-frontend-raf
sigcn-gestao-backend
sigcn-gestao-contestacoes-backend
sigcn-lib
sigcn-med-backend
sigcn-med-frontend-aks
sigcn-med-worker
sigcn-parecer-contestacao-frontend
sigcn-pix-api
sigcn-pix-lib
sigcn-pix-worker
sigcn-raf-backend
sigcn-raf-lib
sigcn-raf-worker
sigcn-template-backend
sigcn-teste-correcao-times-1
sigcn-teste-correcao-times-2
sigcn-teste-corrige-times-1
sigec-opf-mfe-adm
sigec-opf-wrk-integra-crm
sigec-opf-wrk-liquidacao
sigec-opf-wrk-maquina-estados
sigec-opf
sigex-api-painel-presi
sigex-frontend-painel-presi-v2
sigex-frontend-painel-presi
sigms-motor-decisao
sigms-webhook-internet
sigms-worker-push
sigos-api-integracoes
sigos-backend-internet
sigos-backend-intranet
sigos-core
sigos-financeiro
sigos-frontend-internet
sigos-frontend-intranet
sigos-processamento-arquivo
sigos-processamento-arquivos
sigrm-backend-sigrm
sigrm-frontend-sigrm
sigsr-api
sigsr-api2
sigsr-web-intranet
sigsr-web-mfa
sigsr-web-spa
sigsr-worker-api-key
sigsr-worker-apim
sigsr-worker-sso
siiad-backend
siiad-batch
siiad-frontend
siidp-api-teste-us103332-a
siidp-api-teste-us103332-req3
siidp-api-teste-us115932-reqs-3
siidp-app-04052026-modulo-teste-ms-caixa
siidp-app-04052026-modulo-teste-r
siidp-app-06052026-ms-teste-13
siidp-app-06052026-ms-teste-14
siidp-app-06052026-ms-teste-16
siidp-app-demonstracao
siidp-app-nome-teste
siidp-app-teste-completo
siidp-app-teste-de-migracao-12
siidp-app-teste-migracao-08
siidp-app-teste-us103332-completo-1
siidp-app-teste-us103332-fluxo-3
siidp-app-teste-us103332-fluxo-4
siidp-app-teste-us115932-req3
siidp-app-teste-us115932-reqs-2
siidp-app-teste-us115932-reqs
siidp-app-teste-us117323-3
siidp-app-teste-us118200-1
siidp-app-teste-us119187-3
siidp-app-teste-us119187-angularaz
siidp-app-teste-us119187-jsbaws
siidp-backend-arquitetura
siidp-backend-teste-fimafim
siidp-backend-teste-us103332-mudaordem
siidp-backend-teste-us119187-4
siidp-frontend-25052026-teste-2
siidp-frontend-teste-us103332-completo
siidp-frontend-teste-us103332-infra-s3
siidp-frontend-teste-us103332-novooutput-1
siidp-frontend-teste-us103332-novooutput-2
siidp-frontend-teste-us103332-req-1
siidp-frontend-teste-us103332-req-2
siidp-frontend-teste-us119187-1
siidp-frontend-teste-us119187-2
siidp-frontend-teste-us119187-angs3
siidp-ghbypass
siidp-lib-28052026-microsservico-ralph
siidx-arquivos-api
siidx-assinador-api-internet
siidx-assinador-api-neosigner
siidx-assinador-api
siidx-assinador-cron
siidx-assinador-spa-internet
siidx-assinador-spa-intranet
siidx-assinatura-cron
siidx-ferramenta-fakemail
siidx-gateway-api
siidx-lib-shared-frontend
siidx-shared
siiga-backend-cliente
siiga-backend-gestao-canais-monitoria
siiga-backend-gestao-canais
siiga-backend
siiga-batch-batch
siiga-batch-v1
siiga-frontend-gestao-canais-documentos
siiga-frontend-gestao-canais-monitoria
siiga-frontend-mfe-gestao-canais
siiga-frontend-mfe-host
siiga-frontend-mfe-siiga
siiga-gestao-canais-documentos
siinp-gestao-web
siinp-gestao
siinp-nucleo-web
siinp-nucleo
siipc-api-backend-mfa
siipc-api-preproc-entrada-simulada
siipc-backend-onboarding-biometria-worker-unico
siipc-backend-onboarding-login
siipc-batch-preproc-enriq
siipc-batch-preproc-pad-app
siipc-batch-preproc-pad-moc
siipc-batch-preproc-pad-sag
siipc-batch-preproc-pad-spi
siipc-batch-preproc-pad-spl
siipc-batch-preproc-pad-tae
siipc-batch-preproc-pad-telecomunicacoes
siipc-isd-localizacao-segura-android
siipc-isd-localizacao-segura-api
siipc-lab-trilha-auditoria
siipc-lib-preproc-trndto
siipc-lib-preproc-xmp
siipc-lib-teste
siipc-novo-frontend-aks
siipc-novo-frontend
siipc-novo-worker
siipc-novo
siipc-onboarding-biometria-worker
siipc-onboarding-dominios
siipc-onboarding-gestao
siipc-onboarding-worker-grava-cadastro
siipc-onboarding-worker-notificacao
siipc-onboarding-worker-zerotap
siipc-preproc-api-entrada-simulada
siipc-preproc-wrk-enriq
siipc-preproc-wrk-pad-moc
siipc-seglab-cont-core
siipc-seglab-libtrndto
siipc-seglab-superpoc-preproc-gerador
siipc-seglab-superpoc-preproc
siipc-seglab-xmp
siipc-xid-gestao-api
siipc-xid-habitualidade-agregador
siipc-xid-habitualidade-api
siipc-xid-habitualidade-dashboard
siipc-xid-habitualidade-worker
siipc-xid-servicos-comuns
siipc-xid-worker-tombamento
siitx-painel-whatsapp-frontend
siitx-painel-whatsapp
silce-api-silce-bff-ibc
silce-apostador
silce-bff
silce-caixa-silce-blueprint
silce-carrinho-processamento-cotas-expiradas
silce-carrinho-processamento
silce-carrinho
silce-compra-processamento
silce-compra
silce-consolida-compras
silce-gestao-operacional-web
silce-gestao-operacional
silce-gestao-parametros
silce-ibc-bff
silce-ibc-compra
silce-jogos-parametros
silce-meio-pagamento-debito
silce-meio-pagamento-pix
silce-meio-pagamento
silce-mock
silce-parametros-gestao
silce-parametros-jogos
silce-pos-compra
silce-processamento-cotas-expiradas
silce-quarkus-error-handler
silce-registro-aposta
silce-silce-consolida-compras
silce-silce-parametros-jogos
silce-silce-processamento-cotas-expiradas
silce-silce-quarkus-logging
silce-sincronizacao-legado
silce-template
simoa-api-test-api
simoa-backend-analytics-service
simoa-backend-evaluations-service
simoa-backend-orchestrator
simoa-frontend-temp-test
simoa-frontend
simoa-simoa-api-atendimento
simov-backend-api-imoveis-internet
simpf-backend
simpf-frontend
simtr-backend-pre-validacao-core-ia
simtr-doc-pre-validacao
simtr-pre-validacao-api-orquestrador
simtr-pre-validacao-conformidade
simtr-pre-validacao-doctree
simtr-pre-validacao-dossie
simtr-pre-validacao-ingestao
simtr-pre-validacao-webview-backoffice
sinad-backend
sinad-frontend
sinbm-servico-exemplo-dotnet
sinbm-servico-login
sinda-batch-worker-pref-usr-load-txt
sinda-worker-contas
sinda-worker-pref-usr-load-txt
sioba-api-dc-recursos
sioba-api-intra-recursos-worker
siobs-api-intra-administracaofido
siobs-api-intra-selecaodejornada
siobs-backend-fluxohibrido
siobs-frontend-fluxohibrido
siobs-intra-administracaodovinculo
siobs-intra-administracaopingfederate
siobs-intra-remocaodovinculoworker
siobs-intra-vinculostateworker
siobs-plataforma-vinculos-adm
siobs-siobs-intra-admpingfederate
siobs-sv-vinculodedispositivo
siopi-backend-contrato-digital
siopi-backend-hab-melhorias-painel
siopi-backend-hab-melhorias
siopi-backend-modulo-engenharia
siopi-backend-periferia-viva
siopi-batch-hab-melhorias
siopi-batchmelhoriashabitacionais
siopi-frontend-contrato-digital
siopi-frontend-hab-melhorias-painel
siopi-frontend-melhorias
siopi-function-durable-melhorias-habitacionais
sipdd-api-proxy
sipdd-web-mfe
sipgc-backend-desenvolveai-mcp
sipgc-backend-mcp-desenvolveai
sipgc-backend-mcp
sipgc-backend-spring-ai
sipgi-backend-painel-mcmv
sipgi-backend-painel-novopac
sipgi-batch-mcmv-etl
sipgi-batch-novopac-etl
sipgi-mcmv-backend
sipgs-backend-poc
sipgs-batch-poc
sipgs-frontend-poc2-eks
sipgs-poc-backend
siplx-api-canal
siplx-api-consulta-parametros-canal
siplx-api-consulta-parametros-produto-prognostico-numerico
siplx-api-param-produ-prognum
siplx-api-registro-aposta-prognostico-numerico
siplx-backend-schedulers-prognostico-numerico
siplx-backend-siplx-registro-aposta-prognostico-numerico
siplx-configuracao
siplx-gestao-auditoria
siplx-gestao-concurso
siplx-gestao-distribuicao-arrecadacao
siplx-gestao-distribuicao-financeira
siplx-gestao-produtos
siplx-gestao-prognostico-numerico-modalidade
siplx-portal-gestao-backend
siplx-portal-gestao
siplx-processa-fila-auditoria
siplx-processa-fila-financeiro
siplx-processa-fila-prognostico-numerico
siplx-registra-aposta-orquestrador
siplx-registra-aposta
siplx-servicos-auditoria
siplx-servicos-financeiros
siplx-servicos-produto-prognostico-numerico
sirmc-api-api-registro-interacoes-clientes
sirmc-api-campanhas
sirmc-api-emailmarketing-rastreamento
sirmc-api-id-unico-cliente
sirmc-api-lista-imagens
sirmc-api-marcas
sirmc-api-mensagens-relacionamento
sirmc-api-meu-relacionamento
sirmc-api-minhas-trilhas
sirmc-api-posse-produtos
sirmc-api-registro-interacoes-clientes
sirmc-api-relacionamento-visao360
sirmc-api-suitability
sirmc-api-trilhas-transacional
sirmc-backend-campanhas-gestao
sirmc-backend-marcas
sirmc-backend-suitability
sirmc-backend-template
sirmc-emailmarketing-block-emails
sirmc-emailmarketing-optout-frontend
sirmc-emailmarketing-optout
sirmc-emailmarketing-relatoria
sirmc-frontend-campanhas-gestao
sirmc-frontend-documentacao
sirmc-frontend-marcas
sirmc-frontend-relacionamento-visao360
sirmc-frontend-suitability
sirmc-sdk-observability
sirmc-worker-avaliacao
sirmc-worker-emailmarketing-rastreamento
sirmc-worker-suitability-atualizacao
sirmc-worker-trilhas-transacional
sirmc-worker-trilhas
sisfm-api-boleto
sisfm-api-home
sisfm-api-investimento
sisfm-api-perfil
sisfm-api-pixpagamento
sisfm-api-poc
sisfm-api-saldoextrato
sisfm-api-suporte
sisfm-api-template
sisfm-api-transacaopendente
sisfm-backend-pagamento
sisfm-backend-pix
sisfm-bff-accessprofile
sisfm-bff-cardmovimentacaofinanceira
sisfm-bff-cardpagamento
sisfm-bff-cardpainelconta
sisfm-bff-cardtransacaopendente
sisfm-bff-dashboard
sisfm-bff-home
sisfm-bff-host
sisfm-bff-navbar
sisfm-bff-template-demo
sisfm-bff-template
sisfm-doc
sisfm-ext-auditoria
sisfm-ext-bff-core
sisfm-ext-cache
sisfm-ext-commons
sisfm-ext-exceptions
sisfm-ext-security
sisfm-ext-sisfm-xid
sisfm-ext-xid
sisfm-extensions
sisfm-host
sisfm-mfe-dashboard
sisfm-mfe-landing-page
sisfm-mfe-template
sisfm-robot-automation
sisfm-teste-sisfm-gef-sigla-20260325-04
sisfm-teste-sisfm-ger-sigla-20260325-03
sisph-api-auditoria-internet
sisph-api-auditoria
sisph-api-core-config-internet
sisph-api-core-config
sisph-backend-jnd-gestao-plataforma-internet
sisph-backend-teste-generico-dois
sisph-backend-teste-generico
sisph-bff-jnd-baixa-garantia
sisph-bff-jnd-central-servicos
sisph-bff-jnd-construtoras
sisph-bff-jnd-gestao-mo
sisph-bff-jnd-gestao-plataforma
sisph-bff-jnd-mutuario
sisph-bff-jnd-pagamentos
sisph-bff-padrao-java
sisph-bff-padrao-net
sisph-frontend-host-layout-internet
sisph-frontend-host-spa-internet
sisph-frontend-jnd-gestao-plataforma-internet
sisph-frontend-jnd-mutuario-internet
sisph-frontend-shared-services-internet
sisph-frontend-shared-services
sisph-frontend-teste-generico
sisph-mfe-host-layout
sisph-mfe-host-spa
sisph-mfe-jnd-baixa-garantia
sisph-mfe-jnd-central-servicos
sisph-mfe-jnd-construtoras
sisph-mfe-jnd-gestao-mo
sisph-mfe-jnd-gestao-plataforma
sisph-mfe-jnd-mutuario
sisph-mfe-jnd-pagamentos
sisph-mfe-padrao-angular
sisva-adk-orquestrador
sisva-transacional-mcp-client
sisva-transacional-mcp-server
sizap-action-orchestrator-pix-py
sizap-autorization-service
sizap-backend-intent-detection
sizap-genesys-adapter
sizap-intent-detection-service
sizap-intent-router
sizap-sender-service
teste-04-05-2026
teste-33-33
teste
vicor-sdaad-backend-portal-gemor-backend
vimar-sda0w-calamidade-backend
vipes-sd565-portal-beneficios-frontend
vipes-sd565-portal-de-beneficios
vitec-sd584-frontend
vitec-sd584-testefrontend
vitec-sd603-sd603-frontend
vitec-sdce2-contratos-backend
vitec-sdce7-sdmcc-back
vitec-sdce7-sdmcc-backend
vitec-sdce7-sdmcc-frontend
vitec-sdce7-sdmcc-teste
vitec-sdszj-webhook-sonarqube
vitec-sinop-analise-automacao
vivar-sdax3-redeparceira-backend
vivar-sdax3-redeparceira-frontend
vivar-sdax3-rp-backend
vivar-sdax3-rp-frontend
.gitignore
gitops
/apps/
devhub-connect-emu[bot]
devhub-connect-emu[bot]
Adicionar configuração ArgoCD (Infra NPRD) para: simoa-frontend-temp-…
28a65d1
 · 
4 minutes ago
Name	Last commit message	Last commit date
..
06052026-teste-ativar-ambiente
Adicionar configuração ArgoCD (Infra PRD) para: 06052026-teste-ativar…
last month
aplicacao-teste/plt
Adicionar configuração ArgoCD (Infra PRD) para: aplicacao-teste
2 months ago
coe-java-api/des
Adicao aplicaçao teste coe
4 months ago
demo-sd195-backend-04052026-teste-jornada-dep
Adicionar configuração ArgoCD (Infra PRD) para: demo-sd195-backend-04…
last month
demo-sd603-sd603-frontend
Adicionar configuração ArgoCD (Infra PRD) para: demo-sd603-sd603-fron…
2 months ago
devsecops-webhooks
Create config.yaml
4 months ago
sample-quarkus-aks/des
Update config.yaml
2 months ago
siaad-teste-140042026
Adicionar configuração ArgoCD (Infra NPRD) para: siaad-teste-140042026
2 months ago
siaad-teste-prd-pipelineagil-20260401-03
Adicionar configuração ArgoCD (Infra NPRD) para: siaad-teste-prd-pipe…
3 months ago
siaad-teste-prd-pipelineagil-20260401-04
Adicionar configuração ArgoCD (Infra NPRD) para: siaad-teste-prd-pipe…
3 months ago
siaad-us86163-output-new-repo-1
Adicionar configuração ArgoCD (Infra NPRD) para: siaad-us86163-output…
2 months ago
siaad-us86163-output-new-repo-2
Adicionar configuração ArgoCD (Infra NPRD) para: siaad-us86163-output…
2 months ago
siaad-us86163-output-playbook-1
Adicionar configuração ArgoCD (Infra NPRD) para: siaad-us86163-output…
2 months ago
siaas-lib-teste-qualquer-21
Adicionar configuração ArgoCD (Infra NPRD) para: siaas-lib-teste-qual…
last month
siabm-cadastro-kit-bio-api/des
limpeza
6 months ago
siabm-doc-teste-de-criacao
Adicionar configuração ArgoCD (Infra NPRD) para: siabm-doc-teste-de-c…
2 months ago
siabm-matcher-facial/des
limpeza
6 months ago
siabm-teste-60
Adicionar configuração ArgoCD (Infra NPRD) para: siabm-teste-60
2 months ago
siacc-demo
Adicionar configuração ArgoCD (Infra NPRD) para: siacc-demo
4 months ago
siaci-api-manual
Update config.yaml
10 months ago
siaci-componentes-net/des
limpeza
5 months ago
siaci-frontend-manual
Remove obsolete config files for various applications in the siabe-do…
8 months ago
siaci-lib-mainframe
Adicionar configuração ArgoCD (Infra NPRD) para: siaci-lib-mainframe
2 weeks ago
siacx-backend-bd-neo4j-grafos-conhecimento
Adicionar configuração ArgoCD (Infra NPRD) para: siacx-backend-bd-neo…
2 weeks ago
siacx-backend-chatcaixa-agents365/des
Delete apps/siacx-backend-chatcaixa-agents365/tqs directory
last week
siacx-backend-curadoria
Remove obsolete config files for various applications in the siabe-do…
8 months ago
siacx-chatcaixa-frontend
Adicionar configuração ArgoCD (Infra PRD) para: siacx-chatcaixa-frontend
6 months ago
siacx-chatcaixa-mcp-server
Adicionar configuração ArgoCD (Infra NPRD) para: siacx-chatcaixa-mcp-…
2 months ago
siacx-chatcaixa-orquestrador
Adicionar configuração ArgoCD (Infra PRD) para: siacx-chatcaixa-orque…
7 months ago
siacx-frontend-curadoria
Adicionar configuração ArgoCD (Infra PRD) para: siacx-frontend-curadoria
7 months ago
siacx-motor-indexacao
Add global
10 months ago
siacx-plataforma-apis
Adicionar configuração ArgoCD (Infra PRD) para: siacx-plataforma-apis
6 months ago
siacx-plataforma-backend
Adicionar configuração ArgoCD (Infra PRD) para: siacx-plataforma-backend
6 months ago
siacx-plataforma-frontend
Adicionar configuração ArgoCD (Infra PRD) para: siacx-plataforma-fron…
7 months ago
siacx-sonar-mcp-server
Adicionar configuração ArgoCD (Infra NPRD) para: siacx-sonar-mcp-server
2 months ago
siagf-api-gestor
Adicionar configuração ArgoCD (Infra PRD) para: siagf-api-gestor
last month
siagf-app
limpeza
5 months ago
siagf-clerk-api
Update config.yaml to change destinatio from aks-siagf-des to aks-gf-des
4 months ago
siagf-clerk-opf-api
Adicionar configuração ArgoCD (Infra PRD) para: siagf-clerk-opf-api
2 months ago
siagf-clerk-worker
Adicionar configuração ArgoCD (Infra PRD) para: siagf-clerk-worker
2 months ago
siagf-gestor
Adicionar configuração ArgoCD (Infra PRD) para: siagf-gestor
last month
siagf-mfe-adm-vinculo-opf
limpeza
6 months ago
siagf-mfe-plataforma-opf-dados
Update config.yaml
3 months ago
siagf-microofertas-api
Adicionar configuração ArgoCD (Infra NPRD) para: siagf-microofertas-api
4 months ago
siagf-microofertas-service
Update config.yaml
3 months ago
siagf-mpc-server/des
ajustes
5 months ago
siagf-plataforma-adm-vinculos
limpeza
6 months ago
siagf-plataforma-opf-dados
Adicionar configuração ArgoCD (Infra PRD) para: siagf-plataforma-opf-…
6 months ago
siagf-portabilidade-service
Adicionar configuração ArgoCD (Infra NPRD) para: siagf-portabilidade-…
4 months ago
siagf-user-preferences-service
Update config.yaml of the user-preferences-service
3 months ago
siana-backend/des
limpeza
6 months ago
siath-backend-app/des
Update config.yaml
10 months ago
siath-frontend-internet/des
Update config.yaml
10 months ago
sibko-administracao-api
Adciona tqs para sibko, sidgc e siidx, corrige namespaces
10 months ago
sibko-administracao-spa
Adciona tqs para sibko, sidgc e siidx, corrige namespaces
10 months ago
sibko-api-fluxo-guiado-api
Adicionar configuração ArgoCD (Infra NPRD) para: sibko-api-fluxo-guia…
last month
sibko-api-gerenciador-financeiro
Adicionar configuração ArgoCD (Infra NPRD) para: sibko-api-gerenciado…
last week
sibko-arquivos-api
Adicionar configuração ArgoCD (Infra PRD) para: sibko-arquivos-api
7 months ago
sibko-backend-gerenciador-financeiro
Adicionar configuração ArgoCD (Infra NPRD) para: sibko-backend-gerenc…
last week
sibko-frontend-gerenciador-financeiro
Adicionar configuração ArgoCD (Infra NPRD) para: sibko-frontend-geren…
last week
sibko-gateway-api
limpeza
5 months ago
sibko-originacao-digital-api-dossie
Adicionar configuração ArgoCD (Infra PRD) para: sibko-originacao-digi…
7 months ago
sibko-originacao-digital-api
Corrige repo infra sibko e sidgc
10 months ago
sibko-pos-venda-api
Remove obsolete config files for various applications in the siabe-do…
8 months ago
sibko-pos-venda-asyncapi
Adciona tqs para sibko, sidgc e siidx, corrige namespaces
10 months ago
sibko-pos-venda-process
Adicionar configuração ArgoCD (Infra PRD) para: sibko-pos-venda-process
5 months ago
sibko-sibko-api/des
Remove obsolete config files for various applications in the siabe-do…
8 months ago
sicia-backend-web-quarkus
Adicionar configuração ArgoCD (Infra NPRD) para: sicia-backend-web-qu…
3 weeks ago
sicli-api-cadastro-perfil-pf/des
Remove obsolete config files for siacx and sicli applications; update…
10 months ago
sictm-abono-service/des
limpeza
11 months ago
sictm-antecipa-saque-aniversario/des
limpeza
11 months ago
sictm-azulzinha-service/des
limpeza
last year
sictm-banners-service/des
limpeza
11 months ago
sictm-bolsa-service/des
Delete apps/sictm-bolsa-service/tst directory
last year
sictm-brcode-service/des
limpeza
11 months ago
sictm-cartao-contratacao-service/des
limpeza
11 months ago
sictm-cartao-debito-service/des
limpeza
11 months ago
sictm-cartaovirtual-service/des
limpeza
11 months ago
sictm-central-notificacoes-service/des
limpeza
11 months ago
sictm-consulta-cep-service/des
limpeza
11 months ago
sictm-contas-service/des
Update config.yaml
11 months ago
sictm-conversa-service/des
limpeza
11 months ago
sictm-credito-trabalhador/des
Delete apps/sictm-credito-trabalhador/tst directory
last year
sictm-credito/des
limpeza
11 months ago
sictm-criptografia-service/des
limpeza
11 months ago
sictm-demonstrativo-credito-service/des
limpeza
11 months ago
sictm-emprestimo-consignado-service/des
limpeza
11 months ago
sictm-encerramento-conta-service/des
limpeza
11 months ago
sictm-extrato-service
Update config.yaml
11 months ago
sictm-geolocalizacao-service/des
limpeza
11 months ago
sictm-gestao-limites-service/des
limpeza
11 months ago
sictm-habitacao-service/des
limpeza
11 months ago
sictm-identificacao-pos-service/des
limpeza
11 months ago
sictm-meu-nis-service/des
limpeza
11 months ago
sictm-mobilidade-service/des
limpeza
11 months ago
sictm-mock-adapters/des
limpeza
6 months ago
sictm-notas-negociacao-service/des
limpeza
11 months ago
sictm-notificacao-service/des
limpeza
11 months ago
sictm-open-banking-service/des
Delete apps/sictm-open-banking-service/tst directory
last year
sictm-operacoes-lgpd-service/des
limpeza
11 months ago
sictm-pagamento-boleto-service/des
limpeza
11 months ago
sictm-pe-de-meia-service/des
limpeza
11 months ago
sictm-pix-service/des
limpeza
last year
sictm-portabilidade-service/des
limpeza
11 months ago
sictm-pos-venda-service/des
limpeza
11 months ago
sictm-qrcode-service/des
limpeza
11 months ago
sictm-rapidex-service/des
limpeza
11 months ago
sictm-saiba-mais-service/des
limpeza
11 months ago
sictm-saldo-service/des
limpeza
11 months ago
sictm-seguranca-adapter/des
limpeza
11 months ago
sictm-seguros-service/des
limpeza
11 months ago
sictm-sicli-service/des
limpeza
last year
sictm-sictm-sinda-service/des
limpeza
11 months ago
sictm-sigcn-service/des
limpeza
11 months ago
sictm-siiso-service/des
limpeza
11 months ago
sictm-sinda-service/des
limpeza
last year
sictm-termo-service/des
limpeza
11 months ago
sictm-teste-adapter/des
limpeza
6 months ago
sictm-transacao-elo-service/des
limpeza
11 months ago
sictm-transacao-service/des
Removing the values from source tag
last year
sidgc-registro-eletronico-api
Corrige namespaces sibko, sidgc e siidx
10 months ago
sidgc-registro-eletronico-asyncapi
criandorepos
5 months ago
sidgc-registro-eletronico-cron
Update config.yaml
4 months ago
sidgc-registro-eletronico-spa
Adicionar configuração ArgoCD (Infra PRD) para: sidgc-registro-eletro…
7 months ago
sidgc-shared
limpeza
5 months ago
sidpn-agf-accounts/des
incluir global
11 months ago
sidpn-api-dc-cambio
Adicionar configuração ArgoCD para: sidpn-api-dc-cambio
2 months ago
sidpn-api-dc-contas
Adicionar configuração ArgoCD para: sidpn-api-dc-contas
2 months ago
sidpn-api-dc-cred-direitos-creditorios-desc
ajuste de nome repo sidpn-api-dc-cred-direitos-creditorios-desc
2 days ago
sidpn-api-dc-credito-adiantamento-depositante
Adicionar configuração ArgoCD para: sidpn-api-dc-credito-adiantamento…
2 months ago
sidpn-api-dc-credito-emprestimos
Adicionar configuração ArgoCD para: sidpn-api-dc-credito-emprestimos
2 months ago
sidpn-api-dc-credito-financiamentos
Adicionar configuração ArgoCD para: sidpn-api-dc-credito-financiamentos
2 weeks ago
sidpn-api-dc-fundos-investimento
Adicionar configuração ArgoCD para: sidpn-api-dc-fundos-investimento
2 weeks ago
sidpn-api-dc-renda-fixa-bancaria
Adicionar configuração ArgoCD para: sidpn-api-dc-renda-fixa-bancaria
3 weeks ago
sidpn-api-dc-renda-fixa-credito
Adicionar configuração ArgoCD para: sidpn-api-dc-renda-fixa-credito
last month
sidpn-api-dc-renda-variavel
Adicionar configuração ArgoCD para: sidpn-api-dc-renda-variavel
last month
sidpn-api-dc-titulos-tesouro-direto
Adicionar configuração ArgoCD para: sidpn-api-dc-titulos-tesouro-direto
2 weeks ago
sidpn-api-intra-cambio
Adicionar configuração ArgoCD para: sidpn-api-intra-cambio
2 weeks ago
sidpn-api-intra-contas
Adicionar configuração ArgoCD para: sidpn-api-intra-contas
2 months ago
sidpn-api-intra-cred-adiantamento-depositante/des
ajuste de aks e nome do repo sidpn-api-intra-cred-adiantamento-deposi…
last week
sidpn-api-intra-cred-prospec-portabilidade
Adicionar configuração ArgoCD (Infra NPRD) para: sidpn-api-intra-cred…
last week
sidpn-api-intra-credito-emprestimos
Adicionar configuração ArgoCD para: sidpn-api-intra-credito-emprestimos
2 months ago
sidpn-api-intra-credito-financiamentos
Adicionar configuração ArgoCD para: sidpn-api-intra-credito-financiam…
2 months ago
sidpn-api-intra-credito-listar-contratos
Adicionar configuração ArgoCD para: sidpn-api-intra-credito-listar-co…
2 months ago
sidpn-api-intra-credito-prospeccao-portabilidade
Adicionar configuração ArgoCD para: sidpn-api-intra-credito-prospecca…
2 months ago
sidpn-api-intra-fundos-investimento
Adicionar configuração ArgoCD para: sidpn-api-intra-fundos-investimento
last month
sidpn-api-intra-listar-investimentos
Adicionar configuração ArgoCD para: sidpn-api-intra-listar-investimentos
2 days ago
sidpn-api-intra-prospec-credconsignadofederal
Update config.yaml
last week
sidpn-api-intra-renda-fixa-bancaria
Adicionar configuração ArgoCD para: sidpn-api-intra-renda-fixa-bancaria
last month
sidpn-api-intra-renda-fixa-credito
Adicionar configuração ArgoCD para: sidpn-api-intra-renda-fixa-credito
last month
sidpn-api-intra-renda-variavel
Update config.yaml
last week
sidpn-api-intra-titulos-tesouro-direto
Adicionar configuração ArgoCD para: sidpn-api-intra-titulos-tesouro-d…
2 months ago
sidpn-api-pc-credito-portabilidade
Adicionar configuração ArgoCD para: sidpn-api-pc-credito-portabilidade
2 months ago
sidpn-lib-services
Adicionar configuração ArgoCD para: sidpn-lib-services
2 months ago
sidpn-opf-jwt
Adicionar configuração ArgoCD (Infra NPRD) para: sidpn-opf-jwt
5 months ago
sidpn-pc-creditoconsignadofederal
Update config.yaml
5 months ago
sidpn-services
Adicionar configuração ArgoCD (Infra NPRD) para: sidpn-services
5 months ago
sidre-da-adiantamentoadepositantes
limpeza
5 months ago
sidre-da-cambio
limpeza
5 months ago
sidre-da-canaisdeatendimento
limpeza
5 months ago
sidre-da-cartaodecredito
limpeza
5 months ago
sidre-da-contas
limpeza
5 months ago
sidre-da-direitoscreditoriosdescontados
limpeza
5 months ago
sidre-da-emprestimos
Ajustes para mudança em PRD do SIDRE
8 months ago
sidre-da-financiamentos
Rename config-global.yaml to config.yaml
3 months ago
sidre-da-investimentos
limpeza
5 months ago
sidre-da-previdencia
limpeza
5 months ago
sidre-da-seguros
.
8 months ago
sidre-da-titulosdecapitalizacao
limpeza
5 months ago
sidre-mt-admin
Alterações para PRD
8 months ago
sidre-mt-comum
Alterações para PRD
8 months ago
sidre-opf-participantes
Adicionar configuração ArgoCD (Infra PRD) para: sidre-opf-participantes
5 months ago
sidre-portal-api
Ajuste portal api
7 months ago
sidre-portal-web
inserção da aplicaçao sidre-portal-web nprd
last week
sidre-worker
limpeza
5 months ago
sidrx-ativos-sustentabilidade/des
limpeza
5 months ago
sidsc-sdsc-angular/des
Update config.yaml
3 weeks ago
sidsc-template
Adicionar configuração ArgoCD (Infra NPRD) para: sidsc-template
3 months ago
siecm-api-middleware/des
Refactor ArgoCD configurations: update cluster names and remove unuse…
10 months ago
siecm-frontend/des
Refactor ArgoCD configurations: update cluster names and remove unuse…
10 months ago
sifap-intranet-backend
Adicionar configuração ArgoCD (Infra NPRD) para: sifap-intranet-backend
4 months ago
sifap-poc-ia-backend
Adicionar configuração ArgoCD (Infra NPRD) para: sifap-poc-ia-backend
3 months ago
sifce-api-agendador/des
Remove deprecated config files and add new configuration for various …
9 months ago
sifce-api-cadastro-fundos/des
Update config.yaml
11 months ago
sifce-api-cadastro
Create config.yaml
2 weeks ago
sifce-api-canais
Create config.yaml
2 weeks ago
sifce-api-contabilidade
Adicionar configuração ArgoCD (Infra PRD) para: sifce-api-contabilidade
5 months ago
sifce-api-contrato
Create config.yaml
2 weeks ago
sifce-api-financeiro
Create config.yaml
2 weeks ago
sifce-api-fundos/des
Remove deprecated config files and add new configuration for various …
9 months ago
sifce-api-relatorio
Create config.yaml
2 weeks ago
sifce-api-transferencia-recursos
Create config.yaml
2 weeks ago
sifce-front-autenticacao
Create config.yaml
2 weeks ago
sifce-fundos
Create config.yaml
2 weeks ago
sigac-api-gestao-arquivistica/des
Removed sigac-api-gestao-arquivistica/hmp - WO0000078228474
7 months ago
sigam-teste-andre-3
Adicionar configuração ArgoCD (Infra NPRD) para: sigam-teste-andre-3
2 months ago
sigam-teste-andre2
Adicionar configuração ArgoCD (Infra NPRD) para: sigam-teste-andre2
2 months ago
sigaq-api-gestao-documental/des
limpeza
6 months ago
sigaq-api-gestor-mfe-host/des
limpeza
5 months ago
sigaq-back-api/des
limpeza
5 months ago
sigaq-front-gestor-mfe-header/des
limpeza
6 months ago
sigaq-front-gestor-mfe-host/des
limpeza
6 months ago
sigaq-front-gestor-mfe-infra/des
added infra des sigaq
3 months ago
sigaq-front-gestor-mfe-temporalidade/des
limpeza
6 months ago
sigch-teste-corrige-times-1
Adicionar configuração ArgoCD (Infra NPRD) para: sigch-teste-corrige-…
4 months ago
sigcn-api-orquestrador-api
Adicionar configuração ArgoCD (Infra NPRD) para: sigcn-api-orquestrad…
last month
sigcn-api-orquestrador
Correção do aks de destino do projeto sigcn-api-orquestrador do ambie…
last month
sigcn-contestacao-backend
Criação da configuração do ambiente TQS do projeto sigcn-contestacao-…
last month
sigcn-contestacao-mfe/des
limpeza
5 months ago
sigcn-devolucao-worker
Create config.yaml
last month
sigcn-digital-painel-gestao-backend
Update config.yaml
2 months ago
sigcn-digital-painel-gestao-frontend
Update config.yaml
2 months ago
sigcn-digital-painel-gestao
Adicionar configuração ArgoCD (Infra NPRD) para: sigcn-digital-painel…
4 months ago
sigcn-frontend-contestacao-mfe-aks
Adicionar configuração ArgoCD (Infra NPRD) para: sigcn-frontend-conte…
2 weeks ago
sigcn-frontend-parecer-contestacao-aks
Adicionar configuração ArgoCD (Infra NPRD) para: sigcn-frontend-parec…
2 weeks ago
sigcn-frontend-raf
Update config.yaml
2 hours ago
sigcn-gestao-backend
Update config.yaml
4 months ago
sigcn-gestao-contestacoes-backend
Criação da configuração do ambiente TQS do projeto sigcn-gestao-conte…
last month
sigcn-lib
Adicionar configuração ArgoCD (Infra NPRD) para: sigcn-lib
5 months ago
sigcn-med-backend
Create config.yaml
last month
sigcn-med-frontend-aks
Adicionar configuração ArgoCD (Infra PRD) para: sigcn-med-frontend-aks
last month
sigcn-med-worker
Create config.yaml
last month
sigcn-parecer-contestacao-frontend/des
limpeza
6 months ago
sigcn-pix-api
Update config.yaml REQ000143287449
3 months ago
sigcn-pix-lib
Adicionar configuração ArgoCD (Infra NPRD) para: sigcn-pix-lib
5 months ago
sigcn-pix-worker
Update config.yaml - REQ000143287449
3 months ago
sigcn-raf-backend
Adicionar configuração ArgoCD (Infra PRD) para: sigcn-raf-backend
2 months ago
sigcn-raf-lib
Adicionar configuração ArgoCD (Infra NPRD) para: sigcn-raf-lib
4 months ago
sigcn-raf-worker
Adicionar configuração ArgoCD (Infra PRD) para: sigcn-raf-worker
2 months ago
sigcn-template-backend/des
ajustes
5 months ago
sigcn-teste-correcao-times-1
Adicionar configuração ArgoCD (Infra NPRD) para: sigcn-teste-correcao…
4 months ago
sigcn-teste-correcao-times-2
Adicionar configuração ArgoCD (Infra NPRD) para: sigcn-teste-correcao…
4 months ago
sigcn-teste-corrige-times-1
Adicionar configuração ArgoCD (Infra NPRD) para: sigcn-teste-corrige-…
4 months ago
sigec-opf-mfe-adm
WO0000080549406 - Criação do ambiente TQS - SIGEC-OPF-MFE-ADM
3 weeks ago
sigec-opf-wrk-integra-crm
WO0000080549406 - Criação do ambiente TQS - SIGEC-OPF-WRK-INTEGRA-CRM
3 weeks ago
sigec-opf-wrk-liquidacao
WO0000080549406 - Criação do ambiente TQS - SIGEC-OPF-WRK-LIQUIDACAO
3 weeks ago
sigec-opf-wrk-maquina-estados
WO0000080549406 - Criação do ambiente TQS - SIGEC-OPF-WRK-MAQUINA-EST…
3 weeks ago
sigec-opf
Update config.yaml
7 hours ago
sigex-api-painel-presi
Adicionar configuração ArgoCD (Infra PRD) para: sigex-api-painel-presi
6 months ago
sigex-frontend-painel-presi-v2
WO0000079348425 - Atualização do nome do cluster de destino
4 months ago
sigex-frontend-painel-presi
Adicionar configuração ArgoCD (Infra PRD) para: sigex-frontend-painel…
6 months ago
sigms-motor-decisao
Update config.yaml
last month
sigms-webhook-internet
limpeza
6 months ago
sigms-worker-push
WO0000080270679
2 weeks ago
sigos-api-integracoes
Adicionar configuração ArgoCD (Infra NPRD) para: sigos-api-integracoes
4 days ago
sigos-backend-internet
Adicionar configuração ArgoCD (Infra PRD) para: sigos-backend-internet
last month
sigos-backend-intranet
Update config.yaml
2 months ago
sigos-core
ajuste sigos
6 months ago
sigos-financeiro
ajuste sigos
6 months ago
sigos-frontend-internet
Adicionar configuração ArgoCD (Infra PRD) para: sigos-frontend-internet
last month
sigos-frontend-intranet
Update config.yaml
2 months ago
sigos-processamento-arquivo
ajuste sigos
6 months ago
sigos-processamento-arquivos
limpeza
6 months ago
sigrm-backend-sigrm/des
ajustes
5 months ago
sigrm-frontend-sigrm/des
ajustes
5 months ago
sigsr-api/des
ajustes
5 months ago
sigsr-api2
Adicionar configuração ArgoCD (Infra NPRD) para: sigsr-api2
2 months ago
sigsr-web-intranet/des
limpeza
6 months ago
sigsr-web-mfa/des
Add ArgoCD configuration for sigsr-web-mfa (Infra NPRD)
10 months ago
sigsr-web-spa/des
Add ArgoCD configuration for sigsr-web-mfa (Infra NPRD)
10 months ago
sigsr-worker-api-key/des
Update config.yaml
10 months ago
sigsr-worker-apim/des
limpeza
6 months ago
sigsr-worker-sso/des
limpeza
6 months ago
siiad-backend
Update config.yaml WO0000079883155
3 months ago
siiad-batch
Adicionar configuração ArgoCD (Infra NPRD) para: siiad-batch
3 months ago
siiad-frontend
Update config.yaml WO0000079883155
3 months ago
siidp-api-teste-us103332-a
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-api-teste-us10…
5 hours ago
siidp-api-teste-us103332-req3
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-api-teste-us10…
2 weeks ago
siidp-api-teste-us115932-reqs-3
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-api-teste-us11…
last week
siidp-app-04052026-modulo-teste-ms-caixa
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-app-04052026-m…
last month
siidp-app-04052026-modulo-teste-r
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-app-04052026-m…
last month
siidp-app-06052026-ms-teste-13
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-app-06052026-m…
last month
siidp-app-06052026-ms-teste-14
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-app-06052026-m…
last month
siidp-app-06052026-ms-teste-16
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-app-06052026-m…
last month
siidp-app-demonstracao
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-app-demonstracao
2 hours ago
siidp-app-nome-teste
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-app-nome-teste
last week
siidp-app-teste-completo
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-app-teste-comp…
3 weeks ago
siidp-app-teste-de-migracao-12
Adicionar configuração ArgoCD para: siidp-app-teste-de-migracao-12
3 weeks ago
siidp-app-teste-migracao-08
Adicionar configuração ArgoCD para: siidp-app-teste-migracao-08
3 weeks ago
siidp-app-teste-us103332-completo-1
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-app-teste-us10…
3 weeks ago
siidp-app-teste-us103332-fluxo-3
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-app-teste-us10…
2 weeks ago
siidp-app-teste-us103332-fluxo-4
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-app-teste-us10…
2 weeks ago
siidp-app-teste-us115932-req3
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-app-teste-us11…
last week
siidp-app-teste-us115932-reqs-2
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-app-teste-us11…
last week
siidp-app-teste-us115932-reqs
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-app-teste-us11…
last week
siidp-app-teste-us117323-3
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-app-teste-us11…
2 weeks ago
siidp-app-teste-us118200-1
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-app-teste-us11…
2 weeks ago
siidp-app-teste-us119187-3
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-app-teste-us11…
last week
siidp-app-teste-us119187-angularaz
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-app-teste-us11…
last week
siidp-app-teste-us119187-jsbaws
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-app-teste-us11…
last week
siidp-backend-arquitetura
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-backend-arquit…
2 weeks ago
siidp-backend-teste-fimafim
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-backend-teste-…
2 weeks ago
siidp-backend-teste-us103332-mudaordem
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-backend-teste-…
5 hours ago
siidp-backend-teste-us119187-4
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-backend-teste-…
last week
siidp-frontend-25052026-teste-2
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-frontend-25052…
3 weeks ago
siidp-frontend-teste-us103332-completo
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-frontend-teste…
3 weeks ago
siidp-frontend-teste-us103332-infra-s3
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-frontend-teste…
3 weeks ago
siidp-frontend-teste-us103332-novooutput-1
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-frontend-teste…
2 weeks ago
siidp-frontend-teste-us103332-novooutput-2
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-frontend-teste…
2 weeks ago
siidp-frontend-teste-us103332-req-1
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-frontend-teste…
3 weeks ago
siidp-frontend-teste-us103332-req-2
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-frontend-teste…
3 weeks ago
siidp-frontend-teste-us119187-1
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-frontend-teste…
last week
siidp-frontend-teste-us119187-2
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-frontend-teste…
last week
siidp-frontend-teste-us119187-angs3
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-frontend-teste…
last week
siidp-ghbypass
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-ghbypass
2 months ago
siidp-lib-28052026-microsservico-ralph
Adicionar configuração ArgoCD (Infra NPRD) para: siidp-lib-28052026-m…
2 weeks ago
siidx-arquivos-api
Adicionar configuração ArgoCD (Infra PRD) para: siidx-arquivos-api
6 months ago
siidx-assinador-api-internet
limpeza
6 months ago
siidx-assinador-api-neosigner
Adciona tqs para sibko, sidgc e siidx, corrige namespaces
10 months ago
siidx-assinador-api
Adicionar configuração ArgoCD (Infra PRD) para: siidx-assinador-api
6 months ago
siidx-assinador-cron
Adicionar configuração ArgoCD (Infra PRD) para: siidx-assinador-cron
last month
siidx-assinador-spa-internet
Adicionar configuração ArgoCD (Infra PRD) para: siidx-assinador-spa-i…
6 months ago
siidx-assinador-spa-intranet
Corrige namespaces sibko, sidgc e siidx
10 months ago
siidx-assinatura-cron
limpeza
6 months ago
siidx-ferramenta-fakemail
limpeza
6 months ago
siidx-gateway-api
Adicionar configuração ArgoCD (Infra PRD) para: siidx-gateway-api
6 months ago
siidx-lib-shared-frontend
Adicionar configuração ArgoCD (Infra NPRD) para: siidx-lib-shared-fro…
2 days ago
siidx-shared
limpeza
5 months ago
siiga-backend-cliente
WO0000080601977
last week
siiga-backend-gestao-canais-monitoria
Adicionar configuração ArgoCD (Infra NPRD) para: siiga-backend-gestao…
3 months ago
siiga-backend-gestao-canais
Update config.yaml
2 weeks ago
siiga-backend
Update config.yaml
2 weeks ago
siiga-batch-batch
Adicionar configuração ArgoCD (Infra NPRD) para: siiga-batch-batch
3 weeks ago
siiga-batch-v1
Update config.yaml
yesterday
siiga-frontend-gestao-canais-documentos
Adicionar configuração ArgoCD (Infra NPRD) para: siiga-frontend-gesta…
3 months ago
siiga-frontend-gestao-canais-monitoria
Update config.yaml
3 months ago
siiga-frontend-mfe-gestao-canais
Update config.yaml
last week
siiga-frontend-mfe-host
Adicionar configuração ArgoCD (Infra NPRD) para: siiga-frontend-mfe-host
3 months ago
siiga-frontend-mfe-siiga
Update config.yaml
2 days ago
siiga-gestao-canais-documentos
Adicionar configuração ArgoCD (Infra NPRD) para: siiga-gestao-canais-…
3 months ago
siinp-gestao-web/des
limpeza
6 months ago
siinp-gestao/des
limpeza
6 months ago
siinp-nucleo-web/des
limpeza
6 months ago
siinp-nucleo/des
limpeza
6 months ago
siipc-api-backend-mfa
Update config.yaml
yesterday
siipc-api-preproc-entrada-simulada
Adicionar configuração ArgoCD (Infra NPRD) para: siipc-api-preproc-en…
2 weeks ago
siipc-backend-onboarding-biometria-worker-unico
Update config.yaml
2 days ago
siipc-backend-onboarding-login
Adicionar configuração ArgoCD para: siipc-backend-onboarding-login
last week
siipc-batch-preproc-enriq
Adicionar configuração ArgoCD (Infra NPRD) para: siipc-batch-preproc-…
2 weeks ago
siipc-batch-preproc-pad-app
Adicionar configuração ArgoCD (Infra NPRD) para: siipc-batch-preproc-…
2 weeks ago
siipc-batch-preproc-pad-moc
Adicionar configuração ArgoCD (Infra NPRD) para: siipc-batch-preproc-…
2 weeks ago
siipc-batch-preproc-pad-sag
Adicionar configuração ArgoCD (Infra NPRD) para: siipc-batch-preproc-…
3 weeks ago
siipc-batch-preproc-pad-spi
Adicionar configuração ArgoCD (Infra NPRD) para: siipc-batch-preproc-…
2 weeks ago
siipc-batch-preproc-pad-spl
Adicionar configuração ArgoCD (Infra NPRD) para: siipc-batch-preproc-…
3 weeks ago
siipc-batch-preproc-pad-tae
Adicionar configuração ArgoCD (Infra NPRD) para: siipc-batch-preproc-…
2 weeks ago
siipc-batch-preproc-pad-telecomunicacoes
Adicionar configuração ArgoCD (Infra NPRD) para: siipc-batch-preproc-…
2 weeks ago
siipc-isd-localizacao-segura-android/des
Update config.yaml
11 months ago
siipc-isd-localizacao-segura-api/des
Removing the values from source tag
last year
siipc-lab-trilha-auditoria/des
Removing the values from source tag
last year
siipc-lib-preproc-trndto
Adicionar configuração ArgoCD (Infra NPRD) para: siipc-lib-preproc-tr…
2 weeks ago
siipc-lib-preproc-xmp
Adicionar configuração ArgoCD (Infra NPRD) para: siipc-lib-preproc-xmp
2 weeks ago
siipc-lib-teste
Adicionar configuração ArgoCD (Infra NPRD) para: siipc-lib-teste
3 weeks ago
siipc-novo-frontend-aks
Update config.yaml
3 months ago
siipc-novo-frontend/des
Remove obsolete config files for various applications in the siabe-do…
8 months ago
siipc-novo-worker
Update config.yaml
4 months ago
siipc-novo/des
Update config.yaml - REQ000143287449
3 months ago
siipc-onboarding-biometria-worker
Update config.yaml
2 months ago
siipc-onboarding-dominios
Adicionar configuração ArgoCD (Infra PRD) para: siipc-onboarding-domi…
3 months ago
siipc-onboarding-gestao
Adicionar configuração ArgoCD (Infra PRD) para: siipc-onboarding-gestao
2 months ago
siipc-onboarding-worker-grava-cadastro
Adicionar configuração ArgoCD (Infra PRD) para: siipc-onboarding-work…
last month
siipc-onboarding-worker-notificacao
Adicionar configuração ArgoCD (Infra PRD) para: siipc-onboarding-work…
3 months ago
siipc-onboarding-worker-zerotap
Adicionar configuração ArgoCD (Infra PRD) para: siipc-onboarding-work…
2 months ago
siipc-preproc-api-entrada-simulada
Update config.yaml WO0000080702880
2 days ago
siipc-preproc-wrk-enriq
Update config.yaml WO0000080702880
2 days ago
siipc-preproc-wrk-pad-moc
Update config.yaml WO0000080702880
2 days ago
siipc-seglab-cont-core
Adicionar configuração ArgoCD (Infra NPRD) para: siipc-seglab-cont-core
8 months ago
siipc-seglab-libtrndto
limpeza
5 months ago
siipc-seglab-superpoc-preproc-gerador
Update config.yaml
3 days ago
siipc-seglab-superpoc-preproc
Update config.yaml
3 days ago
siipc-seglab-xmp
Removed Workload siipc-seglab-xmp-des WO0000080688111
3 days ago
siipc-xid-gestao-api
Update config.yaml
last month
siipc-xid-habitualidade-agregador
Update config.yaml
2 months ago
siipc-xid-habitualidade-api
Adicionar configuração ArgoCD (Infra PRD) para: siipc-xid-habitualida…
2 months ago
siipc-xid-habitualidade-dashboard
Adicionar configuração ArgoCD para: siipc-xid-habitualidade-dashboard
4 months ago
siipc-xid-habitualidade-worker
Adicionar configuração ArgoCD (Infra PRD) para: siipc-xid-habitualida…
4 months ago
siipc-xid-servicos-comuns
Adicionar configuração ArgoCD (Infra PRD) para: siipc-xid-servicos-co…
2 months ago
siipc-xid-worker-tombamento
Adicionar configuração ArgoCD (Infra NPRD) para: siipc-xid-worker-tom…
2 months ago
siitx-painel-whatsapp-frontend
Adicionar configuração ArgoCD (Infra NPRD) para: siitx-painel-whatsap…
3 months ago
siitx-painel-whatsapp
Adicionar configuração ArgoCD (Infra NPRD) para: siitx-painel-whatsapp
3 months ago
silce-api-silce-bff-ibc
Adicionar configuração ArgoCD (Infra NPRD) para: silce-api-silce-bff-ibc
3 weeks ago
silce-apostador
Create config.yaml
7 months ago
silce-bff
Adicionar configuração ArgoCD (Infra PRD) para: silce-bff
3 months ago
silce-caixa-silce-blueprint
limpeza
6 months ago
silce-carrinho-processamento-cotas-expiradas
Adicionar configuração ArgoCD (Infra NPRD) para: silce-carrinho-proce…
4 months ago
silce-carrinho-processamento
limpeza
5 months ago
silce-carrinho
ajustes no sourcevar
11 months ago
silce-compra-processamento
Create config.yaml
4 months ago
silce-compra
ajustes no sourcevar
11 months ago
silce-consolida-compras
Adicionar configuração ArgoCD (Infra NPRD) para: silce-consolida-compras
3 months ago
silce-gestao-operacional-web
Adicionar configuração ArgoCD (Infra PRD) para: silce-gestao-operacio…
3 months ago
silce-gestao-operacional
Adicionar configuração ArgoCD (Infra PRD) para: silce-gestao-operacional
3 months ago
silce-gestao-parametros
Adicionar configuração ArgoCD (Infra NPRD) para: silce-gestao-parametros
4 months ago
silce-ibc-bff
Update config.yaml
3 weeks ago
silce-ibc-compra
Adicionar configuração ArgoCD (Infra NPRD) para: silce-ibc-compra
2 months ago
silce-jogos-parametros
Adicionar configuração ArgoCD (Infra NPRD) para: silce-jogos-parametros
3 months ago
silce-meio-pagamento-debito
Update config.yaml
last week
silce-meio-pagamento-pix
Adicionar configuração ArgoCD (Infra PRD) para: silce-meio-pagamento-pix
3 months ago
silce-meio-pagamento
ajustes
5 months ago
silce-mock
limpeza
6 months ago
silce-parametros-gestao
Adicionar configuração ArgoCD (Infra PRD) para: silce-parametros-gestao
3 months ago
silce-parametros-jogos
Adicionar configuração ArgoCD (Infra PRD) para: silce-parametros-jogos
3 months ago
silce-pos-compra
Correção da tag name
5 months ago
silce-processamento-cotas-expiradas
Adicionar configuração ArgoCD (Infra NPRD) para: silce-processamento-…
4 months ago
silce-quarkus-error-handler/des
limpeza
11 months ago
silce-registro-aposta
add tqs silce registro aposta
9 months ago
silce-silce-consolida-compras
Adicionar configuração ArgoCD (Infra NPRD) para: silce-silce-consolid…
3 months ago
silce-silce-parametros-jogos
Adicionar configuração ArgoCD (Infra NPRD) para: silce-silce-parametr…
4 months ago
silce-silce-processamento-cotas-expiradas
Adicionar configuração ArgoCD (Infra NPRD) para: silce-silce-processa…
4 months ago
silce-silce-quarkus-logging
limpeza
6 months ago
silce-sincronizacao-legado
Update config.yaml
last week
silce-template/des
limpeza
11 months ago
simoa-api-test-api
Adicionar configuração ArgoCD (Infra NPRD) para: simoa-api-test-api
yesterday
simoa-backend-analytics-service
Adicionar configuração ArgoCD (Infra NPRD) para: simoa-backend-analyt…
yesterday
simoa-backend-evaluations-service
Adicionar configuração ArgoCD (Infra NPRD) para: simoa-backend-evalua…
yesterday
simoa-backend-orchestrator
Adicionar configuração ArgoCD (Infra NPRD) para: simoa-backend-orches…
yesterday
simoa-frontend-temp-test
Adicionar configuração ArgoCD (Infra NPRD) para: simoa-frontend-temp-…
4 minutes ago
simoa-frontend
Update config.yaml
4 days ago
simoa-simoa-api-atendimento
Update config.yaml
last month
simov-backend-api-imoveis-internet
Adicionar configuração ArgoCD (Infra NPRD) para: simov-backend-api-im…
2 months ago
simpf-backend/des
limpeza
5 months ago
simpf-frontend
Adicionar configuração ArgoCD (Infra NPRD) para: simpf-frontend
6 months ago
simtr-backend-pre-validacao-core-ia
Adicionar configuração ArgoCD (Infra NPRD) para: simtr-backend-pre-va…
last week
simtr-doc-pre-validacao
Adicionar configuração ArgoCD (Infra NPRD) para: simtr-doc-pre-validacao
last week
simtr-pre-validacao-api-orquestrador
Adicionar configuração ArgoCD (Infra NPRD) para: simtr-pre-validacao-…
2 months ago
simtr-pre-validacao-conformidade
Adicionar configuração ArgoCD (Infra NPRD) para: simtr-pre-validacao-…
2 months ago
simtr-pre-validacao-doctree
Adicionar configuração ArgoCD (Infra NPRD) para: simtr-pre-validacao-…
2 months ago
simtr-pre-validacao-dossie
Adicionar configuração ArgoCD (Infra NPRD) para: simtr-pre-validacao-…
2 months ago
simtr-pre-validacao-ingestao
Adicionar configuração ArgoCD (Infra NPRD) para: simtr-pre-validacao-…
2 months ago
simtr-pre-validacao-webview-backoffice
Adicionar configuração ArgoCD (Infra NPRD) para: simtr-pre-validacao-…
2 months ago
sinad-backend
Update config.yaml
2 months ago
sinad-frontend
Update config.yaml
2 months ago
sinbm-servico-exemplo-dotnet
Remove unused config.yaml files for various applications and add new …
10 months ago
sinbm-servico-login/des
limpeza
11 months ago
sinda-batch-worker-pref-usr-load-txt
Adicionar configuração ArgoCD (Infra NPRD) para: sinda-batch-worker-p…
3 weeks ago
sinda-worker-contas
fix aks name
4 months ago
sinda-worker-pref-usr-load-txt
Adicionar configuração ArgoCD (Infra NPRD) para: sinda-worker-pref-us…
3 months ago
sioba-api-dc-recursos
Update config.yaml
last month
sioba-api-intra-recursos-worker
Update config.yaml
2 weeks ago
siobs-api-intra-administracaofido
Adicionar configuração ArgoCD (Infra NPRD) para: siobs-api-intra-admi…
2 weeks ago
siobs-api-intra-selecaodejornada/des
Delete apps/siobs-api-intra-selecaodejornada/tst directory
3 weeks ago
siobs-backend-fluxohibrido
Adicionar configuração ArgoCD (Infra NPRD) para: siobs-backend-fluxoh…
last month
siobs-frontend-fluxohibrido
Adicionar configuração ArgoCD (Infra NPRD) para: siobs-frontend-fluxo…
3 weeks ago
siobs-intra-administracaodovinculo
Update config-global.yaml
3 months ago
siobs-intra-administracaopingfederate
Rename config.yaml to config-global.yaml
2 months ago
siobs-intra-remocaodovinculoworker
Adicionar configuração ArgoCD (Infra PRD) para: siobs-intra-remocaodo…
5 months ago
siobs-intra-vinculostateworker
Rename config.yaml to config-global.yaml
2 months ago
siobs-plataforma-vinculos-adm/des
ajustes
5 months ago
siobs-siobs-intra-admpingfederate
Adicionar configuração ArgoCD (Infra NPRD) para: siobs-siobs-intra-ad…
3 months ago
siobs-sv-vinculodedispositivo
Rename config.yaml to config-global.yaml
last month
siopi-backend-contrato-digital/des
limpeza
6 months ago
siopi-backend-hab-melhorias-painel
Delete apps/siopi-backend-hab-melhorias-painel/hmp directory
7 months ago
siopi-backend-hab-melhorias
Update config.yaml
8 months ago
siopi-backend-modulo-engenharia
Update config.yaml
3 weeks ago
siopi-backend-periferia-viva
Adicionar configuração ArgoCD (Infra PRD) para: siopi-backend-perifer…
2 months ago
siopi-batch-hab-melhorias
restoring batch prd
7 months ago
siopi-batchmelhoriashabitacionais/des
limpeza
6 months ago
siopi-frontend-contrato-digital
Adicionar configuração ArgoCD (Infra PRD) para: siopi-frontend-contra…
5 months ago
siopi-frontend-hab-melhorias-painel
Create config.yaml
7 months ago
siopi-frontend-melhorias
limpeza
6 months ago
siopi-function-durable-melhorias-habitacionais/des
limpeza
6 months ago
sipdd-api-proxy
Update config.yaml
2 months ago
sipdd-web-mfe
Update config.yaml
2 months ago
sipgc-backend-desenvolveai-mcp
Adicionar configuração ArgoCD (Infra NPRD) para: sipgc-backend-desenv…
last month
sipgc-backend-mcp-desenvolveai
Adicionar configuração ArgoCD (Infra NPRD) para: sipgc-backend-mcp-de…
last month
sipgc-backend-mcp
Adicionar configuração ArgoCD (Infra NPRD) para: sipgc-backend-mcp
last month
sipgc-backend-spring-ai
Adicionar configuração ArgoCD (Infra NPRD) para: sipgc-backend-spring-ai
last week
sipgi-backend-painel-mcmv
Update config.yaml
last month
sipgi-backend-painel-novopac
Update config.yaml
last month
sipgi-batch-mcmv-etl
Update config.yaml
last month
sipgi-batch-novopac-etl
Update config.yaml
last month
sipgi-mcmv-backend
Adicionar configuração ArgoCD (Infra NPRD) para: sipgi-mcmv-backend
2 months ago
sipgs-backend-poc
Update config.yaml
3 days ago
sipgs-batch-poc
Adicionar configuração ArgoCD (Infra NPRD) para: sipgs-batch-poc
5 hours ago
sipgs-frontend-poc2-eks
Update config.yaml
4 hours ago
sipgs-poc-backend
Adicionar configuração ArgoCD (Infra NPRD) para: sipgs-poc-backend
2 months ago
siplx-api-canal
Update config.yaml
2 weeks ago
siplx-api-consulta-parametros-canal
remove space
2 weeks ago
siplx-api-consulta-parametros-produto-prognostico-numerico
Update config.yaml
2 weeks ago
siplx-api-param-produ-prognum
Delete apps/siplx-api-param-produ-prognum/tst directory
last week
siplx-api-registro-aposta-prognostico-numerico
Update config.yaml
last month
siplx-backend-schedulers-prognostico-numerico
Update config.yaml
2 weeks ago
siplx-backend-siplx-registro-aposta-prognostico-numerico
Adicionar configuração ArgoCD (Infra NPRD) para: siplx-backend-siplx-…
last month
siplx-configuracao
WO0000080084565 - Update config.yaml
2 months ago
siplx-gestao-auditoria
Update config.yaml
3 months ago
siplx-gestao-concurso
Update config.yaml
3 months ago
siplx-gestao-distribuicao-arrecadacao
Update config.yaml WO0000079894666
3 months ago
siplx-gestao-distribuicao-financeira
Update config.yaml WO0000079894666
3 months ago
siplx-gestao-produtos
Update config.yaml
3 months ago
siplx-gestao-prognostico-numerico-modalidade
Update config.yaml WO0000079894666
3 months ago
siplx-portal-gestao-backend
Update config.yaml WO0000079894666
3 months ago
siplx-portal-gestao
Update config.yaml WO0000079894666
3 months ago
siplx-processa-fila-auditoria
Update config.yaml
last month
siplx-processa-fila-financeiro
Update config.yaml - alterando aks
last month
siplx-processa-fila-prognostico-numerico
Update config.yaml
last month
siplx-registra-aposta-orquestrador
Update config.yaml
last month
siplx-registra-aposta
Update config.yaml
last month
siplx-servicos-auditoria
Update config.yaml
last month
siplx-servicos-financeiros
Update config.yaml
last month
siplx-servicos-produto-prognostico-numerico
Update config.yaml
last month
sirmc-api-api-registro-interacoes-clientes
Adicionar configuração ArgoCD (Infra NPRD) para: sirmc-api-api-regist…
last week
sirmc-api-campanhas
Update config.yaml
2 days ago
sirmc-api-emailmarketing-rastreamento/des
Update config.yaml
3 weeks ago
sirmc-api-id-unico-cliente
Create config.yaml- WO0000080214680
2 months ago
sirmc-api-lista-imagens
sirmc-global-prd
5 months ago
sirmc-api-marcas
Update config.yaml
2 months ago
sirmc-api-mensagens-relacionamento
Adicionando pasta tqs no sirmc-api-mensagens-relacionamento WO0000079…
3 months ago
sirmc-api-meu-relacionamento
Adicionar configuração ArgoCD (Infra PRD) para: sirmc-api-meu-relacio…
3 months ago
sirmc-api-minhas-trilhas
Update config.yaml
3 months ago
sirmc-api-posse-produtos
Adiciionando aks-crm-nprd
3 months ago
sirmc-api-registro-interacoes-clientes
Adicionar configuração ArgoCD (Infra NPRD) para: sirmc-api-registro-i…
last week
sirmc-api-relacionamento-visao360
Adicionar configuração ArgoCD (Infra NPRD) para: sirmc-api-relacionam…
5 months ago
sirmc-api-suitability
Update config.yaml
3 months ago
sirmc-api-trilhas-transacional
Update config.yaml
2 months ago
sirmc-backend-campanhas-gestao
Create config.yaml
5 months ago
sirmc-backend-marcas
Update config.yaml
3 months ago
sirmc-backend-suitability
Update config.yaml
last month
sirmc-backend-template/des
ajustes
5 months ago
sirmc-emailmarketing-block-emails
Adicionar configuração ArgoCD (Infra PRD) para: sirmc-emailmarketing-…
6 months ago
sirmc-emailmarketing-optout-frontend/des
.
10 months ago
sirmc-emailmarketing-optout
Adicionar configuração ArgoCD (Infra PRD) para: sirmc-emailmarketing-…
6 months ago
sirmc-emailmarketing-relatoria
Adicionar configuração ArgoCD (Infra PRD) para: sirmc-emailmarketing-…
7 months ago
sirmc-frontend-campanhas-gestao
Adicionar configuração ArgoCD (Infra PRD) para: sirmc-frontend-campan…
5 months ago
sirmc-frontend-documentacao/des
ajustes
6 months ago
sirmc-frontend-marcas
Adicionar configuração ArgoCD (Infra PRD) para: sirmc-frontend-marcas
4 months ago
sirmc-frontend-relacionamento-visao360
Adicionar configuração ArgoCD (Infra NPRD) para: sirmc-frontend-relac…
5 months ago
sirmc-frontend-suitability
Adicionar configuração ArgoCD (Infra NPRD) para: sirmc-frontend-suita…
4 months ago
sirmc-sdk-observability/des
ajustes
6 months ago
sirmc-worker-avaliacao
Atualização da nomenclatura do AKS
5 months ago
sirmc-worker-emailmarketing-rastreamento/des
Update config.yaml
3 weeks ago
sirmc-worker-suitability-atualizacao/des
limpeza
5 months ago
sirmc-worker-trilhas-transacional
Update config.yaml
2 months ago
sirmc-worker-trilhas
Adicionar configuração ArgoCD (Infra NPRD) para: sirmc-worker-trilhas
2 months ago
sisfm-api-boleto
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-api-boleto
2 months ago
sisfm-api-home
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-api-home
2 months ago
sisfm-api-investimento
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-api-investimento
2 months ago
sisfm-api-perfil
Update config.yaml
3 months ago
sisfm-api-pixpagamento
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-api-pixpagamento
2 months ago
sisfm-api-poc
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-api-poc
2 weeks ago
sisfm-api-saldoextrato
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-api-saldoextrato
2 months ago
sisfm-api-suporte
Update config.yaml
3 months ago
sisfm-api-template
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-api-template
4 months ago
sisfm-api-transacaopendente
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-api-transacaop…
2 months ago
sisfm-backend-pagamento
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-backend-pagamento
3 days ago
sisfm-backend-pix
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-backend-pix
3 days ago
sisfm-bff-accessprofile
Update config.yaml
3 months ago
sisfm-bff-cardmovimentacaofinanceira
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-bff-cardmovime…
2 months ago
sisfm-bff-cardpagamento
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-bff-cardpagamento
2 months ago
sisfm-bff-cardpainelconta/des
Create config.yaml
last month
sisfm-bff-cardtransacaopendente
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-bff-cardtransa…
2 months ago
sisfm-bff-dashboard
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-bff-dashboard
5 months ago
sisfm-bff-home
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-bff-home
2 months ago
sisfm-bff-host
Update config.yaml
3 months ago
sisfm-bff-navbar
Update config.yaml
4 months ago
sisfm-bff-template-demo
Update config.yaml
3 months ago
sisfm-bff-template
Update config.yaml
4 months ago
sisfm-doc
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-doc
4 months ago
sisfm-ext-auditoria
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-ext-auditoria
4 months ago
sisfm-ext-bff-core
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-ext-bff-core
4 months ago
sisfm-ext-cache
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-ext-cache
4 months ago
sisfm-ext-commons
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-ext-commons
4 months ago
sisfm-ext-exceptions
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-ext-exceptions
4 months ago
sisfm-ext-security
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-ext-security
4 months ago
sisfm-ext-sisfm-xid
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-ext-sisfm-xid
4 months ago
sisfm-ext-xid
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-ext-xid
4 months ago
sisfm-extensions
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-extensions
4 months ago
sisfm-host
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-host
5 months ago
sisfm-mfe-dashboard
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-mfe-dashboard
3 months ago
sisfm-mfe-landing-page
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-mfe-landing-page
5 months ago
sisfm-mfe-template
Update config.yaml
4 months ago
sisfm-robot-automation
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-robot-automation
5 months ago
sisfm-teste-sisfm-gef-sigla-20260325-04
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-teste-sisfm-ge…
3 months ago
sisfm-teste-sisfm-ger-sigla-20260325-03
Adicionar configuração ArgoCD (Infra NPRD) para: sisfm-teste-sisfm-ge…
3 months ago
sisph-api-auditoria-internet
WO0000080557917
2 weeks ago
sisph-api-auditoria
Adicionar configuração ArgoCD (Infra PRD) para: sisph-api-auditoria
3 days ago
sisph-api-core-config-internet
Update config.yaml
2 weeks ago
sisph-api-core-config
Create config.yaml
last month
sisph-backend-jnd-gestao-plataforma-internet
Update config.yaml
2 weeks ago
sisph-backend-teste-generico-dois
Adicionar configuração ArgoCD (Infra NPRD) para: sisph-backend-teste-…
last month
sisph-backend-teste-generico
Update config.yaml
2 weeks ago
sisph-bff-jnd-baixa-garantia
Update config.yaml
2 weeks ago
sisph-bff-jnd-central-servicos
Create config.yaml
last week
sisph-bff-jnd-construtoras/des
ajustes
5 months ago
sisph-bff-jnd-gestao-mo
Added TQS WO0000080076561
2 months ago
sisph-bff-jnd-gestao-plataforma
Create config.yaml
last month
sisph-bff-jnd-mutuario
Update config.yaml
3 days ago
sisph-bff-jnd-pagamentos
WO0000079991804
2 months ago
sisph-bff-padrao-java/des
ajustes
5 months ago
sisph-bff-padrao-net/des
ajustes
5 months ago
sisph-frontend-host-layout-internet
WO0000080557599
2 weeks ago
sisph-frontend-host-spa-internet
Update config.yaml
2 weeks ago
sisph-frontend-jnd-gestao-plataforma-internet
WO0000080558023
2 weeks ago
sisph-frontend-jnd-mutuario-internet
Adicionar configuração ArgoCD (Infra NPRD) para: sisph-frontend-jnd-m…
3 days ago
sisph-frontend-shared-services-internet
Update config.yaml
2 weeks ago
sisph-frontend-shared-services
Update config.yaml
3 weeks ago
sisph-frontend-teste-generico
Adicionar configuração ArgoCD (Infra NPRD) para: sisph-frontend-teste…
last month
sisph-mfe-host-layout
Adicionar configuração ArgoCD (Infra PRD) para: sisph-mfe-host-layout
3 days ago
sisph-mfe-host-spa
Adicionar configuração ArgoCD (Infra PRD) para: sisph-mfe-host-spa
2 weeks ago
sisph-mfe-jnd-baixa-garantia
Update config.yaml
3 days ago
sisph-mfe-jnd-central-servicos
Create config.yaml
last week
sisph-mfe-jnd-construtoras/des
ajustes
5 months ago
sisph-mfe-jnd-gestao-mo
Update config.yaml
last month
sisph-mfe-jnd-gestao-plataforma
Create config.yaml
last month
sisph-mfe-jnd-mutuario/des
ajustes
5 months ago
sisph-mfe-jnd-pagamentos
WO0000079991804
2 months ago
sisph-mfe-padrao-angular/des
ajustes
5 months ago
sisva-adk-orquestrador
Adicionar configuração ArgoCD (Infra PRD) para: sisva-adk-orquestrador
6 months ago
sisva-transacional-mcp-client/des
limpeza
5 months ago
sisva-transacional-mcp-server/des
limpeza
5 months ago
sizap-action-orchestrator-pix-py
Update config.yaml
3 months ago
sizap-autorization-service
Update config.yaml
3 months ago
sizap-backend-intent-detection
Adicionar configuração ArgoCD (Infra NPRD) para: sizap-backend-intent…
3 days ago
sizap-genesys-adapter
Update config.yaml
3 months ago
sizap-intent-detection-service
Adicionar configuração ArgoCD (Infra NPRD) para: sizap-intent-detecti…
2 months ago
sizap-intent-router
Update config.yaml
3 months ago
sizap-sender-service
Update config.yaml
3 months ago
teste-04-05-2026
Adicionar configuração ArgoCD (Infra PRD) para: teste-04-05-2026
last month
teste-33-33
Adicionar configuração ArgoCD (Infra PRD) para: teste-33-33
last month
teste
Adicionar configuração ArgoCD (Infra PRD) para: teste
last month
vicor-sdaad-backend-portal-gemor-backend
Adicionar configuração ArgoCD (Infra PRD) para: vicor-sdaad-backend-p…
3 weeks ago
vimar-sda0w-calamidade-backend
Update config.yaml
3 months ago
vipes-sd565-portal-beneficios-frontend
Adicionar configuração ArgoCD (Infra PRD) para: vipes-sd565-portal-be…
5 months ago
vipes-sd565-portal-de-beneficios
Adicionar configuração ArgoCD (Infra PRD) para: vipes-sd565-portal-de…
5 months ago
vitec-sd584-frontend
Adicionar configuração ArgoCD (Infra PRD) para: vitec-sd584-frontend
3 months ago
vitec-sd584-testefrontend
Adicionar configuração ArgoCD (Infra PRD) para: vitec-sd584-testefron…
3 months ago
vitec-sd603-sd603-frontend
Adicionar configuração ArgoCD (Infra PRD) para: vitec-sd603-sd603-fro…
2 months ago
vitec-sdce2-contratos-backend
Adicionar configuração ArgoCD (Infra PRD) para: vitec-sdce2-contratos…
3 months ago
vitec-sdce7-sdmcc-back
Create config.yaml
3 months ago
vitec-sdce7-sdmcc-backend
Create config.yaml
3 months ago
vitec-sdce7-sdmcc-frontend
Update config.yaml
3 months ago
vitec-sdce7-sdmcc-teste
Create config.yaml
3 months ago
vitec-sdszj-webhook-sonarqube
Adicionar configuração ArgoCD (Infra PRD) para: vitec-sdszj-webhook-s…
3 months ago
vitec-sinop-analise-automacao
Update config.yaml
3 months ago
vivar-sdax3-redeparceira-backend
Adicionar configuração ArgoCD (Infra PRD) para: vivar-sdax3-redeparce…
5 months ago
vivar-sdax3-redeparceira-frontend
Adicionar configuração ArgoCD (Infra PRD) para: vivar-sdax3-redeparce…
4 months ago
vivar-sdax3-rp-backend
Adicionar configuração ArgoCD (Infra PRD) para: vivar-sdax3-rp-backend
3 months ago
vivar-sdax3-rp-frontend
Adicionar configuração ArgoCD (Infra PRD) para: vivar-sdax3-rp-frontend
3 months ago


