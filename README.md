<img width="1809" height="892" alt="image" src="https://github.com/user-attachments/assets/aa2f9f8b-fa8c-41d2-9fdf-51503f59ca75" />


<img width="1821" height="923" alt="image" src="https://github.com/user-attachments/assets/1304a1ab-2900-4f79-a17f-daf17e31e6c3" />

Skip to main content
projetos
/
Caixa
/
Pipelines
/
Releases
/
SISPL-canal-webhook-pix-ocp4-plus

    All pipelines
    
    SISPL
    

Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
EGRESS_IP_OKD (74)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
MUDANCA_GSC (3)
WO0000079495945
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
OPENSHIFT-NPRD-LOTERIAS (8)
Credenciais para o Cluster OPENSHIFT de NPRD LOTERIAS
Scopes: EC DES,EC TQS,EC HMP
SISPL-CANAL-LOTERICO-PIX-WEBHOOK-DES (40)
Grupo de variáveis de Desenvolvimento
Scopes: EC DES
DATASOURCE_DB2_CONNECTION_URL
jdbc:db2://10.192.224.76:5021/CSD1
DATASOURCE_DB2_JNDI_NAME
java:/sisplDS
DATASOURCE_DB2_PASSWORD
${VAULT::SISPL_DES::DATASOURCE_DB2_PASSWORD::1}
DATASOURCE_DB2_POOL_NAME
sisplDS
DATASOURCE_DB2_USER_NAME
${VAULT::SISPL_DES::DATASOURCE_DB2_USER_NAME::1}
JKS_FILE
/opt/jboss/jboss-eap/cacerts.jks
JVM_HEAP_MAX
2048m
JVM_HEAP_MIN
1024m
JVM_METASPACE_MAX
512m
JVM_METASPACE_MIN
96m
JVM_PASSWORD_TRUSTSTORE
changeit
LOG_LEVEL
DEBUG
MQ_ADMIN_JNDI_NAME_RESPOSTA_PIX
java:/jms/queueRspPix
MQ_ADMIN_JNDI_NAME_RESPOSTA_PIX_DEAD
java:/jms/queueRspPixDead
MQ_ADMIN_NOME_DA_FILA_RESPOSTA_PIX
LQ.RSP.SISPL.RETORNO_PIX
MQ_ADMIN_NOME_DA_FILA_RESPOSTA_PIX_DEAD
LQ.RSP.SISPL.RETORNO_PIX.DEAD
MQ_ADMIN_POOL_NAME_RESPOSTA_PIX
jms/queueRspPix
MQ_ADMIN_POOL_NAME_RESPOSTA_PIX_DEAD
jms/queueRspPixDead
MQ_FACTORY_CANAL_SISPL
BRD6.SVRCONN.SILCE
MQ_FACTORY_HOST_NAME_SISPL
10.192.228.145
MQ_FACTORY_JNDI_NAME_SISPL
java:/conn/MQ-ALTA-BR-SISPL
MQ_FACTORY_PASSWORD_SISPL
${VAULT::SISPL_DES::MQ_FACTORY_PASSWORD_SISPL::1}
MQ_FACTORY_POOL_NAME_SISPL
java:/MQ-ALTA-BR-SISPL
MQ_FACTORY_PORT_SISPL
1418
MQ_FACTORY_QUEUE_MANAGER_SISPL
BRD6
MQ_FACTORY_USERNAME_SISPL
${VAULT::SISPL_DES::MQ_FACTORY_USERNAME_SISPL::1}
SISPL.CERTIFICATE.REQUIRED
N
SISTEMA_AMBIENTE
des
sispl.ds.connection-url
jdbc:db2://10.192.224.76:5021/CSD1
sispl.ds.jndi-name
java:/sisplDS
sispl.ds.password
${VAULT::SISPL_DES::sispl.ds.password::1}
sispl.ds.user-name
${VAULT::SISPL_DES::sispl.ds.username::1}
sispl.mq.channel
BRD6.SVRCONN.SILCE
sispl.mq.hostName
10.192.228.145
sispl.mq.jndi-name
java:/conn/MQ-ALTA-BR-SISPL
sispl.mq.password
${VAULT::SISPL_DES::sispl.mq.password::1}
sispl.mq.pool-name
java:/MQ-ALTA-BR-SISPL
sispl.mq.port
1418
sispl.mq.queueManager
BRD6
sispl.mq.userName
${VAULT::SISPL_DES::sispl.mq.userName::1}
SISPL-CANAL-LOTERICO-PIX-WEBHOOK-TQS (40)
Grupo de variáveis de Testes
Scopes: EC TQS
SISPL-CANAL-LOTERICO-PIX-WEBHOOK-HMP (40)
Grupo de variáveis de Desenvolvimento
Scopes: EC HMP
SISPL-CANAL-LOTERICO-PIX-WEBHOOK-PRD - OKD4 (42)
Grupo de variáveis de PRD
Scopes: EC PRD
|Manage variable groups

Showing filters 1 through 2

Showing 4 deployments

Showing 4 deployments

1 pipelines found

Showing 3 deployments

Showing filters 1 through 2

Showing filters 1 through 2

Showing 4 deployments

Row 3

Expanded

Row 2

Collapsed

Showing 3 deployments

Row 2

Row 2

Row 2

Row 2

Row 2

Row 2

Showing filters 1 through 2
