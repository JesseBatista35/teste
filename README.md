Análise realizada – SIGEC Portabilidade Batch (DES)

Foi verificada a instância sigec-portabilidade-batch_node1_lx104, no host sbrdeapllx104, no domain JBoss EAP 7.1 (DC sbrdeapllx069).

Situação da instância e do deploy

A instância está ativa (status STARTED / running).
O deploy via esteira foi aplicado com sucesso em 22/10/2026 às 13:48. Houve a substituição do pacote gec-4.53.2batch-b1506.ear pelo gec-4.53.2batch.build.1-b1510.ear, com status OK no domain.
Não foi encontrada nos logs do JBoss nenhuma ocorrência de canal ou deployment “stopped”. Caso a mensagem volte a ocorrer, solicitamos que seja aberta nova demanda com o print ou log da execução da esteira, informando data/hora e a task em que o erro aparece.

Causa da instabilidade recorrente do batch
A análise identificou pontos na aplicação que precisam de correção pela equipe de desenvolvimento:

O processo do batch mantém centenas de conexões abertas com o proxy corporativo (proxydes.caixa). As conexões em estado CLOSE-WAIT crescem continuamente (de 81 para 152 em cerca de 1 hora), o que indica conexões que não são encerradas pela aplicação. O acúmulo tende a levar ao travamento da instância, que hoje é contornado com restart.
O server.log está sendo inundado por stack traces de erros de negócio da integração NUCLEA (HTTP 400, “Erro de validação do arquivo de evidência”, tipo PROSPECAO). Isso gera rotação do log a cada ~40 minutos.
A aplicação utiliza versões antigas do SDK do Azure Service Bus (azure-messaging-servicebus 7.0.0, azure-core 1.11.0). Recomendamos avaliar a atualização.

Observação – instância sigec-portabilidade2
O agente Application Insights configurado na instância sigec-portabilidade2_node1_lx104 não consegue enviar telemetria. O proxy corporativo bloqueia as URLs *.in.applicationinsights.azure.com, *.livediagnostics.monitor.azure.com e agent.azureserviceprofiler.net (HTTP 502, Forefront TMG). Caso a telemetria seja necessária, deve ser aberta requisição de liberação dessas URLs no proxy.

Encaminhamento
Do ponto de vista de esteira e infraestrutura, o ambiente está operacional e o deploy funcionando. Os itens 1 a 3 devem ser tratados pela fábrica/equipe de desenvolvimento do SIGEC. Encerramos a demanda.
