oc logsoc rsh <pod-siint-saquetecban-pendencia-api-des> ls -la /usr/src/app/secrets_files/SIINT_DES/

oc logs <pod> -c secrets-agent-sidecar




Now using project "siint-des" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh ls -la /usr/src/app/secrets_files/SIINT_DES/
Error from server (NotFound): pods "ls" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods
NAME                                            READY     STATUS      RESTARTS       AGE
siint-consulta-limite-saque-des-8-bbhks         1/1       Running     0              301d
siint-frontend-des-148-deploy                   0/1       Completed   0              5d20h
siint-frontend-des-149-deploy                   0/1       Completed   0              44h
siint-frontend-des-149-rdccp                    2/2       Running     0              44h
siint-rtsi-des-39-deploy                        0/1       Completed   0              69d
siint-rtsi-des-40-deploy                        0/1       Completed   0              55d
siint-rtsi-des-40-xrrqg                         1/1       Running     0              55d
siint-rtsi-des-44-deploy                        0/1       Error       0              43h
siint-rtsi-des-45-deploy                        0/1       Error       0              42h
siint-rtsi-des-46-deploy                        0/1       Error       0              25h
siint-saque-des-29-l6kl9                        1/1       Running     1 (175d ago)   373d
siint-saquetecban-pendencia-api-des-36-deploy   0/1       Completed   0              6d19h
siint-saquetecban-pendencia-api-des-37-8clsc    1/1       Running     0              6d
siint-saquetecban-pendencia-api-des-37-deploy   0/1       Completed   0              6d
siint-saquetecban-pendencia-api-des-41-deploy   0/1       Error       0              19h
siint-saquetecban-pendencia-api-des-43-deploy   0/1       Error       0              79m
siint-saquetecban-pendencia-api-des-44-deploy   0/1       Error       0              34m
siint-saquetecban-pendencia-api-des-45-deploy   0/1       Error       0              13m
siint-visamtt-des-20-deploy                     0/1       Completed   0              236d
siint-visamtt-des-20-tllgn                      1/1       Running     0              236d
siint-web-backend-des-300-deploy                0/1       Completed   0              6d21h
siint-web-backend-des-301-7q28f                 1/1       Running     0              6d20h
siint-web-backend-des-301-deploy                0/1       Completed   0              6d20h
siint-zosconnproxy-des-3-deploy                 0/1       Completed   0              104d
siint-zosconnproxy-des-4-deploy                 0/1       Completed   0              103d
siint-zosconnproxy-des-4-mvvr7                  2/2       Running     0              103d
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$





o pod ja morreu




no repo:

application-dev.properties:

quarkus.datasource.username=${DATASOURCE_USERNAME}
quarkus.datasource.password=${DATASOURCE_PASSWORD}

SIINT_API_KEY="l70b96355b16d04a56b4db2c991509759f
'

api.confirmacao.client-id=${API_CLIENT_ID:cli-ser-int}
api.confirmacao.client-secret=${API_CLIENT_SECRET:8d78faea-64a1-4b00-a9c7-4dc7501ae6f5}
api.confirmacao.siint-api-key=${API_KEY:l70b96355b16d04a56b4db2c991509759f}
api.confirmacao.grant-type=${API_GRANT_TYPE:client_credentials}

application.properties


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

