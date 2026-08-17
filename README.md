Search
12026-08-17T15:01:50.927Z Beginning step 🔍 PASSO 1 - Verificação Inicial - Verificando se repositórios já existem22026-08-17T15:02:18.273Z Finished step 🔍 PASSO 1 - Verificação Inicial - Verificando se repositórios já existem32026-08-17T15:02:18.278Z Beginning step ❌ Tratamento de Erro - Cancelando porque repositórios existem42026-08-17T15:02:18.284Z Skipping step validateRepositoriesExistence because its if condition was false52026-08-17T15:02:18.289Z Beginning step 🔧 PASSO 2 - Preparação de variáveis62026-08-17T15:02:29.557Z Finished step 🔧 PASSO 2 - Preparação de variáveis72026-08-17T15:02:29.560Z Beginning step 📦 PASSO 3.1 - Preparação Fontes - Modelo do usuário82026-08-17T15:02:29.565Z Skipping step templateSourceCustom because its if condition was false92026-08-17T15:02:29.568Z Beginning step 📦 PASSO 3.2 - Preparação Fontes - Padrão CAIXA102026-08-17T15:02:32.921Z Error: Request failed for https://api.github.com/repos/CAIXAPLATFORM/siidp-backend-templates/tarball/f6f3b5b85cd140e6a1203df08f396f0a37e21908, 403 Forbidden11    at GithubUrlReader.fetchResponse (/opt/app-root/src/node_modules/@backstage/backend-defaults/dist/entrypoints/urlReader/lib/GithubUrlReader.cjs.js:239:13)


 at process.processTicksAndRejections (node:internal/process/task_queues:105:5)13    at async GithubUrlReader.doReadTree (/opt/app-root/src/node_modules/@backstage/backend-defaults/dist/entrypoints/urlReader/lib/GithubUrlReader.cjs.js:155:21)14    at async UrlReaderPredicateMux.readTree (/opt/app-root/src/node_modules/@backstage/backend-defaults/dist/entrypoints/urlReader/lib/UrlReaderPredicateMux.cjs.js:26:16)15    at async Object.fetchContents (/opt/app-root/src/node_modules/@backstage/plugin-scaffolder-node/dist/actions/fetch.cjs.js:29:17)16    at async Object.handler (/opt/app-root/src/node_modules/@backstage/plugin-scaffolder-backend/dist/scaffolder/actions/builtin/fetch/template.cjs.js:131:7)17    at async NunjucksWorkflowRunner.executeStep (/opt/app-root/src/node_modules/@backstage/plugin-scaffolder-backend/dist/scaffolder/tasks/NunjucksWorkflowRunner.cjs.js:240:9)18    at async NunjucksWorkflowRunner.execute (/opt/app-root/src/node_modules/@backstage/plugin-scaffolder-backend/dist/scaffolder/tasks/NunjucksWorkflowRunner.cjs.js:356:9)19    at async TaskWorker.runOneTask (/opt/app-root/src/node_modules/@backstage/plugin-scaffolder-backend/dist/scaffolder/tasks/TaskWorker.cjs.js:119:26) at async run (/opt/app-root/src/node_modules/p-queue/dist/index.js:163:29)


 <img width="1891" height="915" alt="image" src="https://github.com/user-attachments/assets/e32bbe19-1750-41c4-aa2a-aeab95318dec" />



Ajuda Status da comunidade
GitHub.com Inscreva-se para receber atualizações
Cabeçalho do GitHub
Incidente com o GitHub.comInscreva-se
Atualização - Identificamos o componente problemático e tomamos medidas corretivas. Há fortes indícios de recuperação, mas ainda estamos trabalhando para restabelecer completamente o serviço, com as taxas de erro ainda ligeiramente elevadas. Publicaremos novas atualizações conforme a recuperação progride.
17 de agosto de 2026 - 16:36 UTC
Atualização - Estamos enfrentando altas taxas de erro, em torno de 20%, para experiências web e tráfego de API. Os downloads de arquivos e de conteúdo bruto do repositório estão apresentando uma taxa de erro de aproximadamente 50%. A autenticação SAML e OIDC, o SCIM e o Team Sync também estão sendo afetados. Ainda estamos trabalhando para identificar a causa raiz e continuaremos publicando atualizações à medida que aprendermos mais e implementarmos medidas de mitigação.
17 de agosto de 2026 - 16:16 UTC
Atualização - Estamos enfrentando altas taxas de erro, em torno de 20%, para experiências web e tráfego de API. Os downloads de arquivos e de conteúdo bruto do repositório estão apresentando uma taxa de erro de aproximadamente 50%. A autenticação SAML e OIDC, o SCIM e o Team Sync também estão sendo afetados. Estamos implementando medidas de mitigação e publicaremos atualizações conforme avançarmos.
17 de agosto de 2026 - 15:42 UTC
Atualização - O desempenho dos Webhooks está degradado. Continuamos investigando.
17 de agosto de 2026 - 15:40 UTC
Atualização - O Git Operations está apresentando desempenho degradado. Continuamos investigando.
17 de agosto de 2026 - 15:21 UTC
Atualização - O Pages está apresentando desempenho degradado. Continuamos investigando.
17 de agosto de 2026 - 15:10 UTC
Atualização - O serviço de requisições à API está apresentando instabilidade. Continuamos investigando o problema.
17 de agosto de 2026 - 15:01 UTC
Atualização - O serviço Webhooks está apresentando instabilidade. Continuamos investigando o problema.
17 de agosto de 2026 - 14:58 UTC
Update - We are experiencing high error rates around 20% for web experiences and api traffic. Archive downloads and raw repository content downloads are experiencing an approximate 50% error rate. SAML and OIDC authentication, SCIM, and Team Sync are also impacted. We are currently performing mitigations based on our investigation thus far and are monitoring for improvement.
Aug 17, 2026 - 14:58 UTC
Update - Actions is experiencing degraded availability. We are continuing to investigate.
Aug 17, 2026 - 14:58 UTC
Update - Pull Requests is experiencing degraded availability. We are continuing to investigate.
Aug 17, 2026 - 14:54 UTC
Update - Issues is experiencing degraded availability. We are continuing to investigate.
Aug 17, 2026 - 14:49 UTC
Update - Pull Requests is experiencing degraded availability. We are continuing to investigate.
Aug 17, 2026 - 14:45 UTC
Update - Copilot is experiencing degraded availability. We are continuing to investigate.
Aug 17, 2026 - 14:31 UTC
Update - We are experiencing high error rates around 20% for web experiences and api traffic. Archive downloads and raw repository content downloads are experiencing an approximate 50% error rate. SAML and OIDC authentication, SCIM, and Team Sync are also impacted. Investigations are on-going and we will continue to provide updates as we discover more information.
Aug 17, 2026 - 14:24 UTC
Update - We are experiencing high error rates around 20% for web experiences and api traffic. Archive downloads and raw repository content downloads are experiencing an approximate 50% error rate. Investigations are on-going into the root cause, and updates will continue to be provided as we investigate.
Aug 17, 2026 - 14:04 UTC
Update - Pull Requests is experiencing degraded performance. We are continuing to investigate.
Aug 17, 2026 - 13:58 UTC
Update - Issues is experiencing degraded performance. We are continuing to investigate.
Aug 17, 2026 - 13:46 UTC
Atualização - Estamos observando uma taxa de erro de aproximadamente 20% em diversas experiências, incluindo Pull Requests, Issues e outras. Investigações estão em andamento e publicaremos atualizações assim que estiverem disponíveis.
17 de agosto de 2026 - 13:45 UTC
Atualização - O desempenho dos Webhooks está degradado. Continuamos investigando.
17 de agosto de 2026 - 13:44 UTC
Atualização - O Actions está apresentando desempenho degradado. Continuamos investigando.
17 de agosto de 2026 - 13:42 UTC
Atualização - O serviço de requisições à API está apresentando desempenho degradado. Continuamos investigando o problema.
17 de agosto de 2026 - 13:41 UTC
Investigando - Estamos investigando relatos de problemas de desempenho em alguns serviços do GitHub.
17 de agosto de 2026 - 13:40 UTC
Tempo de atividade nos últimos 90 dias. Veja o histórico de tempo de atividade.
Operações Git ?
90 dias atrás
99,99 % de tempo de atividade
Hoje
Degradado
Webhooks ?
90 dias atrás
99,99 % de tempo de atividade
Hoje
Degradado
Requisições de API ?
90 dias atrás
99,83 % de tempo de atividade
Hoje
Incidente
Problemas ?
90 dias atrás
99,89 % de tempo de atividade
Hoje
Incidente
Solicitações de Pull Requests ?
90 dias atrás
99,89 % de tempo de atividade
Hoje
Incidente
Ações ?
90 dias atrás
99,34 % de tempo de atividade
Hoje
Incidente
Pacotes ?
90 dias atrás
100 % de tempo de atividade
Hoje
Normal
Páginas ?
90 dias atrás
99,65 % de tempo de atividade
Hoje
Degradado
Co-piloto
90 dias atrás
99,85 % de tempo de atividade
Hoje
Incidente
Espaços de código ?
90 dias atrás
99,97 % de tempo de atividade
Hoje
Normal
Fornecedores de modelos de IA da Copilot
90 dias atrás
99,88 % de tempo de atividade
Hoje
Normal
Histórico de incidentes
Verifique o status do GitHub Enterprise Cloud por região:
- Austrália: au.githubstatus.com
- UE: eu.githubstatus.com
- Japão: jp.githubstatus.com
- EUA: us.githubstatus.com

Página de status da Atlassian
Assine nossa newsletter para desenvolvedores
Receba dicas, guias técnicos e boas práticas. Duas vezes por mês. Diretamente na sua caixa de entrada.

Inscreva-se
Produto
Características
Empresa
Co-piloto
Segurança
Preços
Equipe
Recursos
Roteiro
Comparar GitHub
Plataforma
API para desenvolvedores
Parceiros
Educação
CLI do GitHub
GitHub Desktop
GitHub Mobile
Apoiar
Documentos
Fórum da Comunidade
Serviços profissionais
Habilidades
Contate o GitHub
Empresa
Sobre
Histórias de clientes
Blog
O Projeto ReadME
Carreiras
Sala de imprensa
Inclusão
Impacto social
Comprar
© 2026 GitHub, Inc.
Termos
Privacidade ( Atualizada)08/2022)
