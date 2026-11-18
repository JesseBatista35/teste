Boa tarde, pessoal! Analisei o ambiente e encontrei os pontos abaixo.

1. Script configurado no job
O job CRIACAO_OS_SIGDU está apontando para /producao/simil-precificacao-rotinas-batch.sh, mas esse arquivo não existe no servidor. O script publicado pela release é o /producao/script_simil_rotinas.sh. É ele que executa o simil-precificacao-rotinas-batch.jar em /opt/batch/deploy.
Ajustes necessários na definição do job no Control-M:

File Name: script_simil_rotinas.sh
Variável JOB_NAME: informar o nome do job Spring Batch a ser executado. O script recebe esse valor do Control-M.

2. Comunicação Control-M → agente
A comunicação do agente com o servidor está ok, mas até o momento nenhuma execução chegou ao caddeapllx2501. Vou solicitar a liberação da regra de firewall:

Origem: cxextrlx038 (10.192.224.54)
Destino: caddeapllx2501 (10.116.200.250)
Porta: TCP 7016

Observações para o time de desenvolvimento:

No script_simil_rotinas.sh, os parâmetros -Xms/-Xmx estão depois do -jar e por isso não são aplicados à JVM. O correto é java -Xms512m -Xmx1024m -jar "$JAR_FILE" ...
No grupo de variáveis SIMIL-PRECIFICACAO-ROTINAS-BATCH-DES da Library, há senhas e chaves em texto aberto (SPRING_DATASOURCE_PASSWORD, _ENV.SIICO_API_KEY, _ENV.SIICO_CLIENT_SECRET). Recomendo marcá-las como secretas.
