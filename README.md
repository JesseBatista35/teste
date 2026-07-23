W.O. 0000081144627

Descricao do problema:

A aplicacao silce-backend-valida-assinatura apresentava status Degraded nos ambientes DES e TQS apos o registro no ArgoCD, com o pod em CrashLoopBackOff. A analise dos logs e dos eventos do pod identificou falhas recorrentes nos probes de liveness e readiness, com retorno HTTP 404 ao consultar os endpoints /q/health/live e /q/health/ready.

Causa raiz:

 A aplicacao nao possuia a extensao quarkus-smallrye-health declarada no pom.xml, motivo pelo qual os endpoints de health check padrao do Quarkus nao estavam disponiveis, causando a falha continua dos probes configurados no values.yaml do repositorio GitOps.

Acao realizada:

Solicitada ao time de desenvolvimento a inclusao da dependencia quarkus-smallrye-health no pom.xml da aplicacao. A alteracao foi implementada e submetida via Pull Request #9 (Update pom.xml), posteriormente aprovada e mesclada ao branch main.

Resultado:

Apos o novo build e deploy automatico via ArgoCD, o pod da aplicacao silce-backend-valida-assinatura-des passou a apresentar status Healthy e Synced, com os probes de liveness e readiness respondendo corretamente. Deploy estabilizado no ambiente DES.

Observacao:

Foi identificada, durante a execucao da pipeline, uma falha adicional e nao relacionada na etapa de publicacao da API no APIM (falha ao acessar a URL do Swagger da aplicacao). Tal ocorrencia foi reconhecida pelo time de desenvolvimento, que ja possui conhecimento da causa e encaminhara o tratamento correspondente, nao fazendo parte do escopo desta W.O.

Status: Resolvido.

Atenciosamente,
Jesse Batista
CTIS/CESTI - DES/TQS NPRD
