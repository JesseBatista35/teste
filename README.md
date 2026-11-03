o Deployment vitec-sda8c-frontend-hub-ciaussp-frontend-2026-des permanecia Degraded no ArgoCD (“exceeded its progress deadline”). O pod reiniciava em BackOff por falha nas probes de liveness e readiness (HTTP 404).

Causa: no arquivo des/values.yaml do repositório vitec-sda8c-frontend-hub-ciaussp-frontend-2026-infranprd, as probes estavam configuradas com o path /q/health/live, endpoint padrão de aplicações Quarkus. A aplicação é um frontend servido por nginx, que não possui esse caminho.

Correção aplicada: as probes foram ajustadas para path: / na porta 8080. Após o sync do ArgoCD, um novo pod foi criado e passou a responder HTTP 200 às probes. A aplicação encontra-se Healthy/Synced em DES.

Pendência sob responsabilidade da equipe de desenvolvimento: a pipeline do frontend (CI/CD Workflow Departamental) está sendo interrompida na etapa VALIDATION pelo guardrail de segurança (GHAS), e não por falha de infraestrutura ou da esteira. Para que novas versões sejam implantadas, é necessário tratar os alertas abertos no repositório:

Dependabot (CRITICAL): alertas #117, #115, #112 e #80. Atualizar as dependências apontadas;
Code Scanning: alerta #1 na branch main. Corrigir o código apontado.

Os alertas só podem ser fechados com a resolução adequada, conforme o Guia de Guardrail de Segurança. Dúvidas ou pedidos de exceção devem ser tratados com a GESED05 – Segurança no Processo de Desenvolvimento (gepro07@caixa.gov.br).

Observação: a descrição da demanda cita a aplicação backend (vitec-sda8c-backend-hub-ciaussp-backend), mas o repositório informado é o do frontend, que foi o objeto desta análise. O values.yaml do backend está com as probes corretas (/healthz:8080), portanto eventual problema nele tem causa distinta. Caso necessário, favor abrir nova W.O. informando o módulo correto.

Demanda encerrada.
