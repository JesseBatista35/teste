Nota de escalonamento pronta pra colar no Teams/ticket:

Escalonamento — SonarQube (sonar.apps.produtos4.caixa) — Fila de Compute Engine represada afetando múltiplos pipelines

Prezados,

Identificamos que a instância SonarQube sonar.apps.produtos4.caixa está com a fila do Compute Engine (CE) represada, causando status PENDING prolongado na etapa de Quality Gate de múltiplos pipelines (não se trata de um caso isolado).

Sintoma observado:

Task de análise submetida e aceita normalmente pela API, porém permanece em PENDING por tempo excessivo (dezenas de verificações consecutivas sem progresso).
Comportamento replicado em outras esteiras além desta, indicando represamento geral na fila do servidor, não falha pontual de projeto.

Exemplo de task afetada:

Task ID: AaAggJyh1aD2bmOGCBu3
Instância: http://sonar.apps.produtos4.caixa
Usuário de acesso: ads-sa

Suspeita técnica:

Fila do CE congestionada (sonar.ce.workerCount insuficiente para o volume atual) e/ou task travada em IN_PROGRESS bloqueando o processamento sequencial de outras análises.
Possível saturação de recursos (CPU/memória/disco) no host do SonarQube, ou reindexação do Elasticsearch em andamento.

Solicitação:

Verificar Administration → Projects → Background Tasks no Sonar para identificar tasks travadas e, se necessário, cancelá-las/reiniciar o worker do CE.
Verificar saúde/recursos do host da instância.
Confirmar se há manutenção ou upgrade em andamento no servidor.

Como se trata de infraestrutura do servidor SonarQube (fora do escopo da esteira DevOps DES/TQS NPRD), encaminho para tratativa da equipe responsável pela instância.
