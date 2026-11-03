FUSIONX e GITHUB CAIXA
=====================
Falha no deploy da API HUB CIAUSSP em DES - Deployment Degraded no ArgoCD

O repositorio é:

https://github.com/caixadepartamental/vitec-sda8c-frontend-hub-ciaussp-frontend-2026

Segue em ANEXO todo o problema relatado.


Resolver Falha no deploy da API HUB CIAUSSP em DES - Deployment Degraded no ArgoCD, conforme detalhamento na REQ.


ANEXO:

Assunto:
Falha no deploy da API HUB CIAUSSP em DES - Deployment Degraded no ArgoCD
Descrição:
Bom dia!	
Solicito apoio na análise do deploy da aplicação vitec-sda8c-backend-hub-ciaussp-backend no ambiente DES.
A pipeline conclui normalmente as etapas de validação e build, porém apresenta falha na etapa de deploy pelo ArgoCD.
A aplicação no ArgoCD consta como Synced, porém o Deployment permanece como Degraded, apresentando a seguinte mensagem:
Deployment "vitec-sda8c-backend-hub-ciaussp-backend-des" exceeded its progress deadline

O pod mais recente identificado pela própria esteira foi:
vitec-sda8c-backend-hub-ciaussp-backend-des-67498d6ddb-mkb2g

A imagem/tag configurada para o deploy é:
41081845620

A configuração atual utiliza:
Service port: 80
TargetPort: 8080
Readiness probe: /healthz:8080
Liveness probe: /healthz:8080

Foi realizada validação local utilizando o publish Release da mesma aplicação em ambiente Production e porta 8080.

A aplicação iniciou normalmente:
Environment: Production
Now listening on: http://[::]:8080
Application started.
Hosting environment: Production

O health check também respondeu corretamente:
GET http://localhost:8080/healthz
HTTP/1.1 200 OK
Healthy

Dessa forma, solicito apoio para verificar no cluster o motivo pelo qual o pod não atinge o estado Ready e o Deployment excede o progress deadline.

Se possível, favor verificar:
•	status e reason do container;
•	Events do pod;
•	estado das probes de readiness e liveness;
•	restartCount e lastState do container;
•	ocorrência de CrashLoopBackOff, CreateContainerConfigError, ImagePullBackOff, OOMKilled ou falha nas probes;
•	logs atuais e anteriores do container;
•	imagem/tag efetivamente executada pelo pod;
•	ConfigMap/Secrets/variáveis disponibilizadas ao container durante a inicialização.
A própria action da pipeline consegue localizar o pod, porém a etapa de coleta não apresenta conteúdo útil dos logs, o que impede identificar pela esteira a causa da degradação.
Até o momento, as evidências disponíveis indicam que os manifests foram sincronizados pelo ArgoCD, mas o Deployment não consegue atingir o estado saudável dentro do prazo.
Agradeço o apoio na identificação da causa no ambiente.






Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixadepartamental
vitec-sda8c-frontend-hub-ciaussp-frontend-2026
Repository navigation
Code
Issues
Pull requests
Actions
Projects
Wiki
Security and quality
114
 (114)
Insights
Settings
CI/CD Workflow Departamental
caixadepartamental/vitec-sda8c-frontend-hub-ciaussp-frontend-2026_main_41667482076.4 #4
All jobs
Run details
Annotations
5 errors and 1 warning
CI_DES / VALIDATION / VALIDATION
failed 1 hour ago in 1m 5s
Search logs
5s
1s
1s
1s
8s
0s
3s
0s
0s
0s
0s
0s
30s
3s
1s
3s
0s
Run set -euo pipefail
Validação de ambientes...
Ambientes finais: ['DES', 'PRD']
Seguindo a pipeline...
❌ Existem alertas GHAS:

Dependabot - 
        🚨 4 alertas de Dependabot foram encontrados!
        🔧 Criticidade vigente: CRITICAL
        📌 Motivo da reprovação: Foram identificados 4 alertas do Dependabot que permanecem abertos ou foram fechados manualmente sem a resolução adequada, com nível de criticidade igual ou superior ao permitido.
        Observação: Alertas só podem permanecer abertos ou sem resolução se a criticidade estiver abaixo do nível estabelecido.


        📋 alertas reprovados:
        - https://github.com/caixadepartamental/vitec-sda8c-frontend-hub-ciaussp-frontend-2026/security/dependabot/117
- https://github.com/caixadepartamental/vitec-sda8c-frontend-hub-ciaussp-frontend-2026/security/dependabot/115
- https://github.com/caixadepartamental/vitec-sda8c-frontend-hub-ciaussp-frontend-2026/security/dependabot/112
- https://github.com/caixadepartamental/vitec-sda8c-frontend-hub-ciaussp-frontend-2026/security/dependabot/80

         


Code Scanning - 
🚨 2 alertas de Code Scanning encontrados!
🔧 Criticidade vigente: MEDIUM
📌 Motivo da reprovação: Foi identificado na branch main 1 alerta de code scanning que permanece aberto ou foi fechado manualmente sem a resolução adequada, com nível de criticidade igual ou superior ao permitido.
Observação: Alertas só podem permanecer abertos ou sem resolução se a criticidade estiver abaixo do nível estabelecido.


📋 alerta reprovado:
- https://github.com/caixadepartamental/vitec-sda8c-frontend-hub-ciaussp-frontend-2026/security/code-scanning/1
 

Interrompendo pipeline.
Para mais informações, consulte o guia de guardrails de segurança na esteira: https://caixa.sharepoint.com/sites/PPDS/SitePages/Guardrail-de-Seguran%C3%A7a.aspx.
Em caso de dúvidas, entre em contato com a GESED05 - Segurança no Processo de Desenvolvimento pelo e-mail gepro07@caixa.gov.br
Error: Process completed with exit code 1.
0s
0s
0s
0s
0s
0s
1s
0s
0s
0s
1s
0s


