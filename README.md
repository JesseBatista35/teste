P
sirex-agenda-api-des-82-j468j
Running


exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-09-30 14:19:29,304 WARN  [io.quarkus.config] (main) The "quarkus.oidc.tls.verification" config property is deprecated and should not be used anymore.
2026-09-30 14:19:29,308 WARN  [io.quarkus.config] (main) The "quarkus.hibernate-orm.database.generation" config property is deprecated and should not be used anymore.
2026-09-30 14:19:30,131 WARN  [org.hibernate.orm.jdbc] (JPA Startup Thread) HHH100123: Low default JDBC fetch size: 10 (consider setting 'hibernate.jdbc.fetch_size')
2026-09-30 14:19:31,789 INFO  [br.gov.caixa.bsb.sirex.agenda.ApplicationCache] (main) ? Iniciando pr?-carregamento de dados do cache da aplica??o...
2026-09-30 14:19:31,790 INFO  [br.gov.caixa.bsb.sirex.agenda.ApplicationCache] (main) ? Carregando fun??es gratificadas dos empregados do SIICO...
2026-09-30 14:19:31,876 INFO  [br.gov.caixa.bsb.sirex.agenda.infrastructure.security.TokenService] (main) TokenService: solicitando token de acesso. auth-server-url=https://login.des.caixa/auth/realms/intranet
2026-09-30 14:19:31,877 INFO  [br.gov.caixa.bsb.sirex.agenda.infrastructure.security.TokenService] (main) TokenService: cache vazio, buscando novo token no SSO...
2026-09-30 14:19:32,112 INFO  [br.gov.caixa.bsb.sirex.agenda.infrastructure.security.TokenService] (main) TokenService: token obtido com sucesso. expiresIn=300
=== REQUEST ===
GET https://api.des.caixa:8443/informacoes-corporativas-privadas/v1/empregados/funcoes
apiKey: [l7e51fbc0a95e24739b4eee7694bf30cb7]
Authorization: [Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiI1ZWQwOTE5Ni0xNDc5LTRiNzYtOGI3YS1jNjQ2Mzk4YTE4MzkiLCJleHAiOjE3OTA3ODkwNzIsIm5iZiI6MCwiaWF0IjoxNzkwNzg4NzcyLCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsInN1YiI6IjYyZDFlOTgwLWJkY2UtNDhhYS1hNDc1LWZkZDlkNzgwNGE4ZCIsInR5cCI6IkJlYXJlciIsImF6cCI6ImNsaS1zZXItcmV4LWFnZW5kYSIsImF1dGhfdGltZSI6MCwic2Vzc2lvbl9zdGF0ZSI6IjU5MGNiZTZjLTk4YWYtNDJiMS04MGViLWNhZDllNjAxYzBkZiIsImFjciI6IjEiLCJyZWFsbV9hY2Nlc3MiOnsicm9sZXMiOlsib2ZmbGluZV9hY2Nlc3MiLCJ1bWFfYXV0aG9yaXphdGlvbiJdfSwic2NvcGUiOiJlbWFpbCBwcm9maWxlIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJjbGllbnRIb3N0IjoiMTAuMTE2LjIyMC40NyIsImNsaWVudElkIjoiY2xpLXNlci1yZXgtYWdlbmRhIiwicHJlZmVycmVkX3VzZXJuYW1lIjoic2VydmljZS1hY2NvdW50LWNsaS1zZXItcmV4LWFnZW5kYSIsImNsaWVudEFkZHJlc3MiOiIxMC4xMTYuMjIwLjQ3IiwiZW1haWwiOiJzZXJ2aWNlLWFjY291bnQtY2xpLXNlci1yZXgtYWdlbmRhQHBsYWNlaG9sZGVyLm9yZyJ9.NeZ8qx30NZ0kUraxzpopzSuwCD_9daV05696xPA0AgytbCQnNxPc9tPcLNuo4_wMyGGLDnQBldAnrSvJ-9kha0-8GSJw9wXh-Hj9ujZCeUZsfB9N9yn6Hy9Hg4QDXYUD1Z3fbBpIVmkQtMM76sSpxQq5SEakK804O_mw3E9E4xfXk5bit-K7M9chwZ4FqOXqHYzUGLmbEHy4nPD0Sskklwk_1zRtwqKvT2pmOxbZCHlSW561MzBKkg6A26ha6XfSFgvkXw29mhdoVc2qxXOWFB2D8Z_Gp9_qoL9h_n1SS0-yNwY46C9nGzhudgT1rfvvxJjagkjvc79n_j820Bm4oA]
User-Agent: [Quarkus REST Client]
2026-09-30 14:19:32,165 INFO  [br.gov.caixa.bsb.sirex.agenda.ApplicationCache] (main) ? Cache da aplica??o inicializado com sucesso!
2026-09-30 14:19:32,267 INFO  [io.quarkus] (main) sirex-agenda-backend 0.2.4.5-SNAPSHOT on JVM (powered by Quarkus 3.38.1) started in 6.280s. Listening on: http://0.0.0.0:8080
2026-09-30 14:19:32,267 INFO  [io.quarkus] (main) Profile prod activated. 
2026-09-30 14:19:32,267 INFO  [io.quarkus] (main) Installed features: [agroal, cache, cdi, config-yaml, hibernate-orm, hibernate-orm-panache, jdbc-oracle, keycloak-authorization, narayana-jta, oidc, oidc-client, rest, rest-client, rest-client-jackson, rest-client-oidc-token-propagation, rest-jackson, security, smallrye-context-propagation, smallrye-fault-tolerance, smallrye-health, smallrye-jwt, smallrye-openapi, swagger-ui, vertx]
2026-09-30 14:19:32,487 INFO  [br.gov.caixa.bsb.sirex.agenda.ApplicationCache] (vert.x-eventloop-thread-1) Informa??es sobre fun??es gratificadas dos empregados do SIICO carregadas com sucesso, total de 1417 registros.



<img width="1813" height="935" alt="image" src="https://github.com/user-attachments/assets/f9f01755-6207-4685-8bc2-180e7fc305f3" />
