Prezados,
Durante a execução da pipeline do simtx.arrecadacoes.barra, identificamos falha na fase de testes (Maven Surefire), com BUILD FAILURE.
O erro ocorre porque o Quarkus tenta montar o SmallRyeConfig em tempo de build/teste e não consegue expandir diversas variáveis referenciadas no application.properties, entre elas:

TAREFA_100214_VALIDA_TITULAR_CONTA_SIDEC_V1_TIPO_TOKEN (client.valida-titular-conta-sidec-v1.token-type)
URL_APIMANAGER (client.valida-titular-conta-sidec-v1.url)
TAREFA_100040_VALIDA_PERMISSAO_V3_TIMEOUT_CONEXAO / TIMEOUT_RESPOSTA
TAREFA_100116_VALIDA_TITULAR_V2_TIMEOUT_CONEXAO / TIMEOUT_RESPOSTA
TAREFA_100043_VALIDA_ASSINATURA_SIMPLES_V3_TIMEOUT_CONEXAO / TIMEOUT_RESPOSTA
TAREFA_100208_VALIDA_TRANSACAO_V1_TIMEOUT (conexão e resposta)
WMQ_HOSTNAME, WMQ_PORT, WMQ_QUEUEMANAGER, WMQ_USER
WMQ_SICCO_RECEBE_TRANSACAO_REQ_FILA / POOL_SIZE / TIMEOUT

Essas variáveis são normalmente injetadas via variable group do pipeline em tempo de deploy no OKD4, mas não existem no ambiente do agente de build, onde os testes unitários rodam. O application-test.properties (src/test/resources) cobre datasource, oidc e sso, mas não tem override para essas propriedades específicas, causando o erro SRCFG00011 e ExceptionInInitializerError no GreetingResourceTest.
Isso é uma questão de código/configuração de teste do projeto, e não da pipeline ou do ambiente OKD. Solicitamos que o time de desenvolvimento adicione valores default nessas properties (ex: ${WMQ_HOSTNAME:localhost}) ou inclua os valores mockados correspondentes no application.properties de teste, para que o contexto Quarkus suba corretamente durante a execução dos testes.
