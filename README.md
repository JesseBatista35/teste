Prezados,

A indisponibilidade do SIGEC Portabilidade Batch (DES) foi normalizada com o restart das instâncias sigec-portabilidade-batch_node1_lx104 e sigec-portabilidade2_node1_lx104, no host sbrdeapllx104_credito (10.116.94.211). A aplicação voltou a responder e os timers do batch retomaram o processamento.

Análise:

O processo JBoss do batch não caiu. Ele travou. A partir das 09:24 de 25/09, o server.log registrou erros contínuos WFLYEJB0241 (ConcurrentAccessTimeoutException) no GerenciadorTimersBean. Uma execução do timer ACTC403 não terminou e manteve o lock do singleton, o que bloqueou os demais timers do batch (ACTC, APCS, REENVIO, REPROCESSAMENTO, entre outros). O timer ProcessadorLegadoTEDNCRRECEPCAO (ProcessadorLegacyCallTEDNCRBean) também ficou preso a partir das 09:33.

No thread dump, a execução do TED NCR estava parada em TransferenciaEletronicaLegacyCallNCRBean.criarContextoEnvioFilaVerificacao() (linha 440), na criação da conexão com a fila de verificação de TED (Service Bus). No mesmo momento, o processo mantinha cerca de 1.380 conexões TCP abertas para 10.252.32.63:80 e 10.252.32.65:80, número muito acima do esperado. Isso indica vazamento de conexões na integração com as filas: elas se acumulam ao longo do dia até a aplicação travar. O restart libera as conexões, o que explica a recorrência diária do problema.

Foi descartada falha de acesso à Núclea (APIM): o endpoint responde normalmente a partir do servidor.

Recomendações ao time de desenvolvimento do SIGEC, para evitar a recorrência:

Revisar o ciclo de vida das conexões com o Service Bus em TransferenciaEletronicaLegacyCallNCRBean, garantindo reutilização ou fechamento efetivo das conexões a cada ciclo.
Definir timeouts na criação de conexão e no envio para as filas.
Revisar a concorrência do GerenciadorTimersBean: hoje todos os timers compartilham o mesmo lock, e uma única execução presa interrompe todo o batch.

Observações de ambiente:

O server do batch roda no LX104 (10.116.94.211), e não no LX103 como consta no inventário. É necessário atualizar o cadastro.
A variável CONNECTION_QUEUE_REQ_ENVIO_TED_NCR do batch diverge da configurada no sigec-portabilidade2 (chave e EntityPath diferentes). O time deve confirmar se a divergência é intencional.
Os servers batch e portabilidade2 gravam no mesmo arquivo gc.log, o que prejudica análises futuras.

Evidências (server.log e thread dump) preservadas no servidor para consulta do time de desenvolvimento.

Encerramos a demanda do ponto de vista de ambiente. A correção definitiva depende de ajuste na aplicação.
