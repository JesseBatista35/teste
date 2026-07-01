TEM DOIS
SISPX-notificacao-webhook

.mvn
docs
src
main
docker
java
resources
application-dev.properties
application.properties
es-cert.p12
test
.dockerignore
.gitignore
mvnw
mvnw.cmd
pom.xml
README.md




#CONFIGURAÇÕES DA APLICAÇÃO
application.name=(PIX) WEBHOOK NOTIFICACAO
application.version=2.0
application.log.tag=[WEBHOOK-NOTIFICACAO]

quarkus.application.name=${application.name}
quarkus.application.version=${application.version}

# ======================== PLATAFORMA ========================
quarkus.test.continuous-testing=disabled
# ======================== PLATAFORMA ========================


# ======================== BANCO ========================
##Configuracoes do Datasource
# ====== banco ====== #
quarkus.datasource.db-kind=oracle
quarkus.datasource.jdbc.driver=oracle.jdbc.xa.client.OracleXADataSource
quarkus.datasource.jdbc.url=${DATASOURCE.URL}
quarkus.datasource.username=${DATASOURCE.USERNAME}
quarkus.datasource.password=${DATASOURCE.PASSWORD}
quarkus.hibernate-orm.database.generation=none
quarkus.hibernate-orm.scripts.generation=none
quarkus.hibernate-orm.validate-in-dev-mode=false
quarkus.hibernate-orm.packages=br.gov.caixa
quarkus.datasource.jdbc.max-size=20
quarkus.datasource.jdbc.min-size=5
quarkus.datasource.jdbc.initial-size=5

quarkus.datasource.dataguard.db-kind=oracle
quarkus.datasource.dataguard.jdbc.driver=oracle.jdbc.xa.client.OracleXADataSource
quarkus.datasource.dataguard.jdbc.url=${DATASOURCE.DATAGUARD.URL}
quarkus.datasource.dataguard.username=${DATASOURCE.DATAGUARD.USERNAME}
quarkus.datasource.dataguard.password=${DATASOURCE.DATAGUARD.PASSWORD}
quarkus.hibernate-orm.dataguard.database.generation=none
quarkus.hibernate-orm.dataguard.scripts.generation=none
quarkus.hibernate-orm.dataguard.validate-in-dev-mode=false
quarkus.hibernate-orm.dataguard.datasource=dataguard
quarkus.hibernate-orm.dataguard.packages=br.gov.caixa
quarkus.datasource.dataguard.jdbc.max-size=20
quarkus.datasource.dataguard.jdbc.min-size=5
quarkus.datasource.dataguard.jdbc.initial-size=5



##Configurações do Datasource - SPI
quarkus.datasource.sispi.db-kind=oracle
quarkus.datasource.sispi.jdbc.driver=oracle.jdbc.driver.OracleDriver
quarkus.datasource.sispi.jdbc.url=${DATASOURCE.SISPI.URL}
quarkus.datasource.sispi.username=${DATASOURCE.SISPI.USERNAME}
quarkus.datasource.sispi.password=${DATASOURCE.SISPI.PASSWORD}
quarkus.hibernate-orm.sispi.database.generation=none
quarkus.hibernate-orm.sispi.scripts.generation=none
quarkus.hibernate-orm.sispi.validate-in-dev-mode=false
quarkus.hibernate-orm.sispi.datasource=sispi
quarkus.hibernate-orm.sispi.packages=br.gov.caixa
quarkus.datasource.sispi.jdbc.max-size=20
quarkus.datasource.sispi.jdbc.min-size=5
quarkus.datasource.sispi.jdbc.initial-size=5


# ====== fim config banco ====== #
# ======================== BANCO ========================

# ======================== FILA ========================
MQ.HOSTNAME=${MQ_HOSTNAME}
MQ.HOSTPORT=${MQ_HOSTPORT}
MQ.CHANNEL=${MQ_CHANNEL}
MQ.QUEUE.MANAGER=${MQ_QUEUE_MANAGER}
MQ.USERID=${MQ_USERID}
MQ.PASSWORD=${MQ_PASSWORD}
MQ.QUEUE=${MQ_QUEUE}
MQ.RECONNECT.TIMEOUT=${MQ_RECONNECT_TIMEOUT}
MQ.MAX.CONNECTIONS=${MQ_MAX_CONNECTIONS}
MQ.MAX.SESSIONS=${MQ_MAX_SESSIONS}

# ======================== FILA ========================

# ======================== HEALTH ========================
quarkus.smallrye-health.root-path=/health
# ======================== HEALTH ========================

# ======================== ROTINA ========================
CRON.EXPR=0/10 * * ? * * *


# MENSAGERIA KAFKA
PIX.QUANTIDADE.THREADS.PROCESSAMENTO=

kafka.bootstrap.servers=${KAFKA_BOOTSTRAP_SERVER}:${KAFKA_BOOTSTRAP_PORT}
kafka.security.protocol=SASL_SSL

kafka.ssl.truststore.type=PKCS12
kafka.ssl.truststore.location=${TRUST_STORE_KAFKA_LOCATION}
kafka.ssl.truststore.password=${TRUST_STORE_KAFKA_PASSWORD}
kafka.sasl.jaas.config=org.apache.kafka.common.security.scram.ScramLoginModule required username="${KAFKA_USER}" password="${KAFKA_PASS}";
kafka.sasl.mechanism=SCRAM-SHA-512
smallrye.messaging.worker.requests-worker-pool.max-concurrency=${PIX.QUANTIDADE.THREADS.PROCESSAMENTO}


# ======================== MENSAGERIA KAFKA ========================
quarkus.messaging.auto-connector-attachment=false

mp.messaging.incoming.confirmar_recorrencia_jornada_4.connector=smallrye-kafka
mp.messaging.incoming.confirmar_recorrencia_jornada_4.topic=${SPX_TOPICO_CONFIRMAR_RECORRENCIA_JORNADA_4}
mp.messaging.incoming.confirmar_recorrencia_jornada_4.group.id=${SPX_TOPICO_GROUP_CONFIRMAR_RECORRENCIA_JORNADA_4}
mp.messaging.incoming.confirmar_recorrencia_jornada_4.key.deserializer=org.apache.kafka.common.serialization.StringDeserializer
mp.messaging.incoming.confirmar_recorrencia_jornada_4.value.deserializer=org.apache.kafka.common.serialization.StringDeserializer
mp.messaging.incoming.confirmar_recorrencia_jornada_4.partitions=3
mp.messaging.incoming.confirmar_recorrencia_jornada_4.commit-strategy=latest
mp.messaging.incoming.confirmar_recorrencia_jornada_4.enable.auto.commit=true

mp.messaging.outgoing.confirmar_recorrencia_jornada_4_out.connector=smallrye-kafka
mp.messaging.outgoing.confirmar_recorrencia_jornada_4_out.topic=${SPX_TOPICO_CONFIRMAR_RECORRENCIA_JORNADA_4}
mp.messaging.outgoing.confirmar_recorrencia_jornada_4_out.value.serializer=org.apache.kafka.common.serialization.StringSerializer

mp.messaging.incoming.cancelar_cobr.connector=smallrye-kafka
mp.messaging.incoming.cancelar_cobr.topic=${SPX_TOPICO_CANCELAR_COBR}
mp.messaging.incoming.cancelar_cobr.group.id=${SPX_TOPICO_GROUP_CANCELAR_COBR}
mp.messaging.incoming.cancelar_cobr.key.deserializer=org.apache.kafka.common.serialization.StringDeserializer
mp.messaging.incoming.cancelar_cobr.partitions=3
mp.messaging.incoming.cancelar_cobr.commit-strategy=latest
mp.messaging.incoming.cancelar_cobr.enable.auto.commit=true

mp.messaging.incoming.cadastrar_cobr.connector=smallrye-kafka
mp.messaging.incoming.cadastrar_cobr.topic=${SPX_TOPICO_CADASTRAR_COBR_RECEBEDOR_CAIXA}
mp.messaging.incoming.cadastrar_cobr.group.id=${SPX_TOPICO_GROUP_CADASTRAR_COBR_RECEBEDOR_CAIXA}
mp.messaging.incoming.cadastrar_cobr.key.deserializer=org.apache.kafka.common.serialization.StringDeserializer
mp.messaging.incoming.cadastrar_cobr.partitions=3
mp.messaging.incoming.cadastrar_cobr.commit-strategy=latest
mp.messaging.incoming.cadastrar_cobr.enable.auto.commit=true

mp.messaging.incoming.cobr_atualizado.connector=smallrye-kafka
mp.messaging.incoming.cobr_atualizado.topic=${SPX_TOPICO_COBR_ATUALIZADO_RECEBEDOR_CAIXA}
mp.messaging.incoming.cobr_atualizado.group.id=${SPX_TOPICO_GROUP_COBR_ATUALIZADO_RECEBEDOR_CAIXA}
mp.messaging.incoming.cobr_atualizado.key.deserializer=org.apache.kafka.common.serialization.StringDeserializer
mp.messaging.incoming.cobr_atualizado.partitions=3
mp.messaging.incoming.cobr_atualizado.commit-strategy=latest
mp.messaging.incoming.cobr_atualizado.enable.auto.commit=true




=================================


# ====== banco ====== #
datasource.url=jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/prim_SPXSRV
datasource.username=sspxbd01
datasource.password=Caneca01

DATASOURCE.URL=${datasource.url}
DATASOURCE.USERNAME=${datasource.username}
DATASOURCE.PASSWORD=${datasource.password}

DATASOURCE.DATAGUARD.URL=${datasource.url}
DATASOURCE.DATAGUARD.USERNAME=${datasource.username}
DATASOURCE.DATAGUARD.PASSWORD=${datasource.password}

DATASOURCE.SISPI.URL=jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=off)(ADDRESS=(PROTOCOL=TCP)(HOST=10.116.101.16)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=ORAD09NG)(SERVER=DEDICATED)))
DATASOURCE.SISPI.USERNAME=SSPIBD03
DATASOURCE.SISPI.PASSWORD=sspibd0303

# ====== fim banco ====== #



#KAFKA_BOOTSTRAP_SERVER=localhost
#KAFKA_BOOTSTRAP_PORT=9092

PIX.QUANTIDADE.THREADS.PROCESSAMENTO=20
KAFKA_BOOTSTRAP_SERVER=development-kafka-bootstrap-cp4i.apps.pixnprd4.caixa
KAFKA_BOOTSTRAP_PORT=443

TRUST_STORE_KAFKA_LOCATION=src/main/resources/es-cert.p12
TRUST_STORE_KAFKA_PASSWORD=TBZ3YROGOB2E
KAFKA_USER=dev
KAFKA_PASS=GwgFdZAHc122ZYU0putadD6U0OP5kkwa




# ======================== FILA ========================
MQ_HOSTNAME=10.116.95.99
MQ_HOSTPORT=1414
MQ_CHANNEL=SISPI.SVRCONN
MQ_QUEUE_MANAGER=XMQD1
MQ_USERID=SSPXDA01
MQ_PASSWORD=
MQ_QUEUE=SISPX.REQ.NOTIFICACAO.WEBHOOK
MQ_RECONNECT_TIMEOUT=60
MQ_MAX_CONNECTIONS=1
MQ_MAX_SESSIONS=300
# ======================== FILA ========================

SPX_TOPICO_CONFIRMAR_RECORRENCIA_JORNADA_4=PIX.AUT.ATUALIZACAO.AUTORIZACAO
SPX_TOPICO_GROUP_CONFIRMAR_RECORRENCIA_JORNADA_4=PIX.AUT.ATUALIZACAO.AUTORIZACAO.GROUP2
SPX_TOPICO_CANCELAR_COBR=PIX.AUT.CANCELAR.COBR 
SPX_TOPICO_GROUP_CANCELAR_COBR=PIX.AUT.CANCELAR.COBR.GROUP2
SPX_TOPICO_CADASTRAR_COBR_RECEBEDOR_CAIXA=PIX.AUT.CADASTRAR.COBR.RECEBEDOR.CAIXA
SPX_TOPICO_GROUP_CADASTRAR_COBR_RECEBEDOR_CAIXA=PIX.AUT.CADASTRAR.COBR.RECEBEDOR.CAIXA.GROUP2
SPX_TOPICO_COBR_ATUALIZADO_RECEBEDOR_CAIXA=PIX.AUT.ATUALIZACAO.AGENDAMENTO
SPX_TOPICO_GROUP_COBR_ATUALIZADO_RECEBEDOR_CAIXA=PIX.AUT.ATUALIZACAO.AGENDAMENTO.GROUP2

#quarkus.hibernate-orm.log.sql=true
