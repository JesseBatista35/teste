


#PORTA
quarkus.http.port=8898

#CONFIG CORS
quarkus.http.cors=true
#quarkus.http.cors.origins=http://siopm-frontend-des-esteiras.nprd2.caixa
#quarkus.http.cors.origins=https://login.des.caixa/auth/realms/intranet

#SSO-Keycloak
#quarkus.oidc.auth-server-url=https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
#quarkus.oidc.client-id=cli-ser-fug
#quarkus.oidc.credentials.secret=c606765c-2dee-4d91-a5f2-34eb4e2fee43



#########################################################################################################
#                                       DATABASE e CRUD exemplo	            							#
#########################################################################################################
#           Antes de iniciar ... comentar as linhas abaixo e deletar todas classes ClientXXX            # 
#                                                                                                       #
												
#																										
#########################################################################################################

#BD: DB2
db2.schema=FUG

quarkus.datasource.db2.jdbc.driver=com.ibm.db2.jcc.DB2Driver
quarkus.datasource.db2.db-kind=db2
quarkus.datasource.db2.username=${DATASOURCE_DB2_USERNAME}
quarkus.datasource.db2.password=${DATASOURCE_DB2_PASSWORD}
quarkus.datasource.db2.jdbc.url=${DATASOURCE_DB2_JDBC_URL}

#BD: IDMS CONSULTA
#quarkus.datasource.consulta.jdbc.driver=ca.idms.jdbc.IdmsJdbcDriver
#quarkus.datasource.consulta.db-kind=consulta
#quarkus.datasource.consulta.jdbc.url=${DATASOURCE_CONSULTA_JDBC_URL}
#quarkus.datasource.consulta.username=${DATASOURCE_CONSULTA_USERNAME}
#quarkus.datasource.consulta.password=${DATASOURCE_CONSULTA_PASSWORD}

#BD: IDMS CONSULTA PEF
quarkus.datasource.consultapef.jdbc.driver=ca.idms.jdbc.IdmsJdbcDriver
quarkus.datasource.consultapef.db-kind=consultapef
quarkus.datasource.consultapef.jdbc.url=${DATASOURCE_CONSULTAPEF_JDBC_URL}
quarkus.datasource.consultapef.username=${DATASOURCE_CONSULTAPEF_USERNAME}
quarkus.datasource.consultapef.password=${DATASOURCE_CONSULTAPEF_PASSWORD}

chave.publica.sso.internet=${KEY_TOKEN_INTERNET}
chave.publica.sso.intranet=${KEY_TOKEN_INTRANET}
chave.token.caixatem=${KEY_TOKEN_CAIXA_TEM}


idms.codigo.dialogo=${KEY_CODIGO_IDMS_DIALOGO}
idms.sureg=${KEY_IDMS_SUREG}
#idms.alias.base=${KEY_IDMS_ALIAS_BASE}

####################################### TEST MOCKITO/JUNIT###############################################

%test.chave.token.caixatem=MOCK_TOKEN_CAIXA_TEM
%test.chave.publica.sso.internet=MOCK_TOKEN_SSO_INTRANET
%test.chave.publica.sso.intranet=MOCK_TOKEN_SSO_INTERNET

quarkus.http.test-port=8083
quarkus.http.test-ssl-port=8446

%test.quarkus.datasource.consultapef.jdbc.driver=ca.idms.jdbc.IdmsJdbcDriver
%test.quarkus.datasource.consultapef.db-kind=consultaPefIdms
%test.quarkus.datasource.consultapef.jdbc.url=MOCK_URL
%test.quarkus.datasource.consultapef.username=MOCK_USER_NAME
%test.quarkus.datasource.consultapef.password=${DATASOURCE_CONSULTAPEF_PASSWORD}

%test.quarkus.datasource.db2.jdbc.driver=com.ibm.db2.jcc.DB2Driver
%test.quarkus.datasource.db2.db-kind=db2
%test.quarkus.datasource.db2.jdbc.url=MOCK_URL
%test.quarkus.datasource.db2.username=MOCK_USER_NAME
%test.quarkus.datasource.db2.password=${DATASOURCE_DB2_PASSWORD}

%test.quarkus.datasource.consulta.jdbc.driver=ca.idms.jdbc.IdmsJdbcDriver
%test.quarkus.datasource.consulta.db-kind=consultaIdms
%test.quarkus.datasource.consulta.jdbc.url==MOCK_URL
%test.quarkus.datasource.consulta.username=MOCK_USER_NAME
%test.quarkus.datasource.consulta.password=${DATASOURCE_CONSULTA_PASSWORD}
%test.quarkus.log.level=ERROR

%test.idms.codigo.dialogo=515
%test.idms.sureg=TA
%test.idms.alias.base=PEF


#######################################FIM ################################################################


#########################################################################################################

# Swagger-ui
quarkus.swagger-ui.path=/swagger-ui
quarkus.swagger-ui.always-include=true
quarkus.swagger-ui.enable=true
quarkus.swagger-ui.theme=material
#original, feeling-blue, flattop, material, monokai, muted, newspaper, outline

# LOG
quarkus.log.level=${LEVEL_LOG_APP}
quarkus.log.console.enable=true
quarkus.log.file.enable=true
quarkus.log.category."io.quarkus.smallrye".level=INFO
quarkus.log.category."io.quarkus".level=INFO
smallrye.config.source.file.locations=/usr/src/app/secrets_files/SIOFG_DES/

############################
#### API MANAGER CONFIG ####
############################

# Caixa API Manager
#api.manager.url=https://api.des.caixa:8443/
api.manager.key=l7cf7839a6152c496da545ec6d05789810

#############################
#### INTERFACES EXTERNAS ####
#############################

# SIISO
#siiso-api.url=${SIISO_URL}
#siiso-api.manager.url=${api.manager.url}informacoes-sociais/
#siiso-api/mp-rest/url=${siiso-api.manager.url:${siiso-api.url}}
#siiso-api/mp-rest/scope=javax.inject.Singleton
#%dev.siiso-api/mp-rest/trustStore=${truststore.file}
#%dev.siiso-api/mp-rest/trustStorePassword=${truststore.password}
#%dev.siiso-api/mp-rest/trustStoreFileType=JKS
quarkus.smallrye-jwt.enabled=false
#quarkus.resteasy.path=/
#mp.jwt.verify.issuer=https://logindes.caixa.gov.br/auth/realms/internet

#############################
#### IBM MQ ####
#############################

quarkus.siofg.ibm.mq.host=${DATASOURCE_MQ_HOST}
quarkus.siofg.ibm.mq.port=${DATASOURCE_MQ_PORT}
quarkus.siofg.ibm.mq.qmgr=${DATASOURCE_MQ_QMGR}
quarkus.siofg.ibm.mq.channel=${DATASOURCE_MQ_CHANNEL}
quarkus.siofg.ibm.mq.user=${DATASOURCE_MQ_USERNAME}
quarkus.siofg.ibm.mq.password=${QUARKUS_SIOFG_IBM_MQ_PASSWORD}

# Habilita o uso do smallrye-reactive-messaging-jms no Quarkus
quarkus.index-dependency.smallrye-jms.group-id=io.smallrye.reactive
quarkus.index-dependency.smallrye-jms.artifact-id=smallrye-reactive-messaging-jms

mp.messaging.incoming.LISTA_CONTA.connector=smallrye-jms
mp.messaging.incoming.LISTA_CONTA.destination-type=queue
mp.messaging.incoming.LISTA_CONTA_OPTANTE.connector=smallrye-jms
mp.messaging.incoming.LISTA_CONTA_OPTANTE.destination-type=queue
mp.messaging.incoming.LISTA_CONTA_EXTRATO.connector=smallrye-jms
mp.messaging.incoming.LISTA_CONTA_EXTRATO.destination-type=queue
mp.messaging.incoming.LISTA_DADOS_CONTRATO.connector=smallrye-jms
mp.messaging.incoming.LISTA_DADOS_CONTRATO.destination-type=queue
#mp.messaging.incoming.CONSULTA_MORADIA.connector=smallrye-jms
#mp.messaging.incoming.CONSULTA_MORADIA.destination-type=queue

# Configuracao dos nomes da filas
mp.messaging.incoming.LISTA_CONTA.destination=${MQ_DESTINATION_LISTA_CONTA}
mp.messaging.incoming.LISTA_CONTA_OPTANTE.destination=${MQ_DESTINATION_LISTA_CONTA_OPTANTE}
mp.messaging.incoming.LISTA_CONTA_EXTRATO.destination=${MQ_DESTINATION_LISTA_CONTA_EXTRATO}
#mp.messaging.incoming.CONSULTA_MORADIA.destination=${MQ_DESTINATION_CONSULTA_MORADIA}
mp.messaging.incoming.LISTA_DADOS_CONTRATO.destination=${MQ_DESTINATION_DADOS_CONTRATO}

# Configuracao do ConnectionFactory que sera usado por cada Canal
mp.messaging.incoming.LISTA_CONTA_OPTANTE.connection-factory-name=${MQ_CONNECTION_FACTORY_NAME}
mp.messaging.incoming.LISTA_CONTA_EXTRATO.connection-factory-name=${MQ_CONNECTION_FACTORY_NAME}
#mp.messaging.incoming.CONSULTA_MORADIA.connection-factory-name=${MQ_CONNECTION_FACTORY_NAME}



