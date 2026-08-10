Segue o texto pronto pra colar no fechamento da WO:

Ação Realizada:

Verificado que os releases do sistema SIACC-TELA-BRANCA (ambiente DES, servidor caddeapllx2725) estavam falhando na etapa de deployment do JBoss EAP, com os pacotes siacc-ear.ear e applicationinsights-agent.jar sendo revertidos pela controller sem indicar erro de aplicação.

Diagnóstico:

Identificado, via análise do server.log, que a instância anterior do JBoss (processo ativo desde 07/08) não havia sido finalizada corretamente, permanecendo com as portas 8080 (HTTP), 8009 (AJP) e 9990 (Management) em uso. Ao subir uma nova instância na tentativa de deploy, o controller do WildFly não conseguiu registrar os serviços de gerenciamento por indisponibilidade das portas, acionando reversão automática da operação de composição (WFLYCTL0459) e, consequentemente, o rollback dos deployments do EAR e do agente do Application Insights.

Correção:

Finalizado manualmente o processo Java remanescente da instância anterior (PIDs 859957/859791/859788) para liberação das portas. Confirmada a liberação via ss -tlnp. Reexecutada a pipeline de deploy, com subida de nova instância do JBoss (PID 1192621) sem conflito de portas. Confirmado deployment bem-sucedido dos pacotes siacc-ear.ear e applicationinsights-agent.jar, sem status .failed nos deployments.

Status: Resolvido.

Jessé Batista
CTIS/CESTI — Esteira DevOps DES TQS NPRD
