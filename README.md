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
•	ConfigMap/Secrets/variáveis disponibilizadas 


As queries são:
 
 SolicitacaoAnalise.listarAnaliseConformidadeAtacadoAbertas e DocumentoSolicitacao.localizarRecebidoPorIdSolicitacao. 
 
Paulo Henrique Barros Santos
Boa tarde! Na semana passada, iniciamos com o time de Produção o alinhamento para criação do ambiente do SIPEN. Acredito que essa solicitação tenha partido de lá
Certo, sem problema! Só reforçando, conforme a Beth explicou, toda criação de infraestrutura deve ser direcionada exclusivamente ao CTC (ambiente principal e de contingência).
DTC é exclusivo para DR e  segue como site "apagado" 
 
Jesse Mouta Pereira Batista
Pablo Leite Costa   grep -nE "ERROR|Exception" $LOG | grep -viE "SECRET|PASSWORD|SENHA|API_KEY|TOKEN" | tail -40 23298:15:58:37,038 ERROR [org.hibernate.internal.SessionFactoryImpl] (ServerService Th…
Boa tarde Jesse.
Corrigido o erro.
sifec-ccr-pj 4.ear
 
Pablo Leite Costa
Boa tarde Jesse. Corrigido o erro. 📄
Jesse.
 
14:53 Reunião encerrada 26min 6s Migração JBoss 7.4 - SIFEC, SICCR, SIEMP, SIPENquarta-feira, 4 de novembro de 2026 14:30 - 14:53Exibir recapitulação4ConteúdoTranscriçãoSISTEMAS JBOSS CEDESBR 1.xlsxADDR FEC,CCR,EMP,PEN -  Migração JBoss 7.4 - 2210.pdf+1

 
 
Pablo Leite Costa, não consigo baixar. 
 
1 minuto vou fazer melhor
 
Jesse Mouta Pereira Batista
📷   Pablo Leite Costa, não consigo baixar.
http://binario.caixa:8081/repository/snapshots/br/gov/caixa/workflow-credito/workflow-credito-pj-ear/8.40.1-SNAPSHOT/workflow-credito-pj-ear-8.40.1-20261104.180249-4.ear
 
Subi para o NEXUS Jesse Mouta Pereira Batista
 
Eliza Tiburcio Borges Marques
Certo, sem problema! Só reforçando, conforme a Beth explicou, toda criação de infraestrutura deve ser direcionada exclusivamente ao CTC (ambiente principal e de contingência). DTC é exclusivo para DR
ótimo, obrigado!! aproveitando o time de produção abriu WO0000082199946 fazendo essa correção para "site primário e contingência". Poderia por gentileza priorizar o atendimento!?
 
p/c Elisabeth da Silva



 Estamos fazeno o deploy do siccr me ajdua ver se via funfar
