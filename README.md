Análise e resolução

Servidor: caddeapllx929 (10.116.194.156), JBoss EAP 7.1.6 standalone, aplicação sigpd-backend (DES), balanceada via mod_cluster (caddeapllx135/136) na VIP 10.116.180.22.

Causa: esgotamento do heap da JVM (Xmx 2 GB). A JVM entrou em ciclo contínuo de Full GC sem liberar memória (heap em 2041M/2048M após cada coleta). Com isso, deixou de processar requisições: a aplicação parou de registrar log a partir das 14:27, o conector AJP ficou com a fila de conexões saturada e o nó deixou de responder ao balanceador, resultando no 503 em https://sigpd-backend.esteiras.des.caixa.

Ação realizada: coletados thread dump e logs de GC para análise. O serviço jboss-eap-standalone foi reiniciado às 15:27.

Validação: health-check /sigpd-api/v1/health-check/live retornando 200 {"status":"UP"} diretamente no nó, pela VIP e a partir de estação de trabalho via HTTPS. Após o restart o heap se mantém estável (~370 MB após GC) e não houve nenhum Full GC.

Observação sobre acesso: a porta 80 da VIP 10.116.180.22 não é acessível a partir da rede de estações (bloqueio de firewall). O acesso deve ser feito via https://. Por http:// o navegador apresenta timeout, sem relação com a disponibilidade da aplicação.

Ponto de atenção para a equipe de desenvolvimento do SIGPD: após o restart foi identificado reprocessamento contínuo de mensagens JMS pelo AuditoriaOperacaoJMSConsumerImpl. As mensagens são do tipo InativacaoConjuntoTO com trilhaAuditoria nula, referentes aos conjuntos 1451 e 1365. Cada uma gera NegocioException: TrilhaAuditoria não pode ser nula, seguida de rollback da transação e reentrega pela fila MQ, em loop.

Foram registradas 983 ocorrências em cerca de 6 minutos após o restart, e 1.417 ocorrências em um único arquivo de log de 17/10, o que indica que o comportamento já ocorria antes do incidente. Esse loop eleva o consumo de CPU, de memória e o volume de log, e pode levar à reincidência da indisponibilidade.

Recomenda-se:

à equipe de desenvolvimento, corrigir o envio da trilha de auditoria na rotina de inativação e o tratamento de erro de negócio no consumer, para que a mensagem não seja reentregue;
à equipe de MQ, configurar backout na fila (BOTHRESH/BOQNAME) e remover as mensagens pendentes dos conjuntos 1451 e 1365.

Serviço restabelecido. Demanda encerrada.
