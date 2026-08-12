#------------------------- Config API -------------------------
PORTA=8443
SCHEDULER_INTERVALO=5

#------------------------- DB ---------------------------------
QUARKUS_DATASOURCE_JDBC_URL=jdbc:db2://10.192.225.76:2905/DBD0

scheduler.intervalo=${SCHEDULER_INTERVALO}m

#------------------------- API TecBan B24 -------------------------
quarkus.rest-client.tecban-resolve-pendencia.url=https://api.des.caixa:8443
quarkus.rest-client.gen-token.url=https://login.des.caixa

#------------------------- API SIINT -------------------------
quarkus.rest-client.tecban-confirmacao-pendencia.url=https://api.des.caixa:8443

api.confirmacao.client-id=${API_CLIENT_ID}
api.confirmacao.client-secret=${API_CLIENT_SECRET}
api.confirmacao.siint-api-key=${API_KEY}
api.confirmacao.grant-type=${API_GRANT_TYPE}

#------------------------- Keystore -------------------------
##quarkus.ssl.trust-store-path=client.p12
##quarkus.http.ssl.certificate.trust-store-password=${SENHA_SSL}
##quarkus.http.ssl.certificate.trust-store-file-type=PKCS12
#
#quarkus.rest-client.tecban-resolve-pendencia.trust-store=truststore.jks
#quarkus.rest-client.tecban-resolve-pendencia.trust-store-password=caixa14
#
#quarkus.rest-client.tecban-confirmacao-pendencia.trust-store=truststore.jks
#quarkus.rest-client.tecban-confirmacao-pendencia.trust-store-password=caixa14
#
#quarkus.rest-client.gen-token.trust-store=truststore.jks
#quarkus.rest-client.gen-token.trust-store-password=caixa14
#
##quarkus.tls.key-store-file=keystore.p12
##quarkus.tls.key-store-password=senha
##quarkus.tls.key-store-file-type=PKCS12

#------------------------- Configuração DataSource -------------------------
quarkus.datasource.db-kind=db2
quarkus.datasource.jdbc.url=${QUARKUS_DATASOURCE_JDBC_URL}
quarkus.datasource.username=${QUARKUS_DATASOURCE_USERNAME}
quarkus.datasource.password=${QUARKUS_DATASOURCE_PASSWORD}
quarkus.datasource.jdbc.driver=com.ibm.db2.jcc.DB2Driver

#------------------------- Configuração Hibernate -------------------------
quarkus.hibernate-orm.database.generation=none
quarkus.hibernate-orm.validate-in-dev-mode=false

#------------------------- DEBUG ------------------------------------------
quarkus.log.category."org.jboss.resteasy.reactive.client".level=DEBUG
quarkus.log.category."org.apache.http".level=DEBUG
