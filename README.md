Prezados (as)

Identificamos:

Falha nas pipelines de deploy do RAF (worker) – DES e TQS

Descrição do Problema:
Durante tentativas de deploy do worker do RAF realizadas na tarde de ontem, foram identificadas falhas intermitentes nas pipelines:


1ª tentativa:
Deploy concluído com sucesso em DES, porém travou em TQS.


2ª tentativa:
O processo passou a travar em DES, permanecendo nessa condição até o momento.


Pipelines afetadas:


DES ok / TQS com falha:
caixagithub/sigcn-raf-worker_main_27705154846.5 · commit 5c67e55

https://github.com/caixagithub/sigcn-raf-worker/actions/runs/27705154846

DES com falha:
caixagithub/sigcn-raf-worker_main_27707452021.6 · commit 5c67e55

https://github.com/caixagithub/sigcn-raf-worker/actions/runs/27707452021

Comportamento observado:

Ausência de logs detalhados que indiquem a causa raiz.
A falha ocorre na etapa de health check.
O deployment permanece com status "Progressing", não evoluindo para "Healthy", o que impede o avanço da pipeline para as próximas etapas.

Impacto:

Bloqueio no deploy do worker entre ambientes.
Impossibilidade de promoção e validação da versão.

Solicitação:

Análise da etapa de health check, verificando por que o status não evolui de "Progressing" para "Healthy".
Verificação de possíveis problemas de disponibilidade, readiness/liveness probes ou dependências externas nos ambientes DES e TQS.
Apoio na identificação da causa da ausência de logs conclusivos.

Observações adicionais:

Ambas as execuções utilizam o mesmo commit (5c67e55).
Comportamento inconsistente entre ambientes pode indicar instabilidade ou problema de configuração/infraestrutura.

Qualquer dúvidas, estamos a disposição.

Ademir Rodrigues de Carvalho
Agente Técnico - C151462-3

Gustavo Rodrigues de Brito

Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
sigcn-raf-worker
Repository navigation
Code
Issues
Pull requests
1
 (1)
Actions
Projects
Models
Wiki
Security and quality
Insights
Settings
CI/CD Workflow - PRD
caixagithub/sigcn-raf-worker_main_27705154846.5 #5
All jobs
Run details
Re-run triggered yesterday
@c159475_caixac159475_caixa
 5c67e55
main
Status
Failure
Total duration
12m 42s
Artifacts
1


CI_CD_PRD / BUILD / BUILD summary
Docker Build summary
For a detailed look at the build, download the following build record archive and import it into Docker Desktop's Builds view.
Build records include details such as timing, dependencies, results, logs, traces, and other information about a build. Learn more

⬇️ caixagithub~sigcn-raf-worker~V8XTG5.dockerbuild (69.74 KB - includes 1 build record)

Find this useful? Let us know

ID	Name	Status	Cached	Duration
V8XTG5	sigcn-raf-worker	✅ completed	0%	1m4s
Build inputs
Job summary generated at run-time
Deployment protection rules
Reviewers, timers, and other rules protecting deployments in this run
Event	Environments	Comment
@c159475_caixa
c159475_caixa
approved yesterday
TQS	
Primeira versão para PRD

Annotations
1 error and 1 warning
CI_CD_PRD / ArgoCD_Deploy / ArgoCD_Deploy (TQS)
Process completed with exit code 1.
CI_CD_PRD / ArgoCD_Deploy / ArgoCD_Deploy (TQS)
Node.js 20 is deprecated. The following actions target Node.js 20 but are being forced to run on Node.js 24: actions/create-github-app-token@v2. For more information see: https://github.blog/changelog/2025-09-19-deprecation-of-node-20-on-github-actions-runners/

