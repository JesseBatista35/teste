I0722 12:06:59.994752       1 version.go:31] "version info" version="" commit="1e11cd2" buildDate="2024-10-04T10:20:06Z" component="vaultenv"
I0722 12:06:59.994868       1 main.go:184] "azure key vault env injector initializing"
I0722 12:06:59.995054       1 main.go:253] "found original container command" cmd="/usr/bin/java" args=["java","-jar","/opt/deploy/quarkus-run.jar"]
I0722 12:06:59.995103       1 authentication.go:110] "checking if current auth service credentials are stale" url="http://akv2k8s-envinjector.akv2k8s.svc:80/auth/silce-carrinho/silce-carrinho-des-85b474cbf7-bc59b?secret=akv2k8s-silce-carrinho-des"
I0722 12:07:00.091437       1 authentication.go:123] "auth service credentials ok" url="http://akv2k8s-envinjector.akv2k8s.svc:80/auth/silce-carrinho/silce-carrinho-des-85b474cbf7-bc59b?secret=akv2k8s-silce-carrinho-des"
I0722 12:07:00.092241       1 authentication.go:159] "requesting azure key vault oauth token" url="https://akv2k8s-envinjector.akv2k8s.svc:9443/auth/silce-carrinho/silce-carrinho-des-85b474cbf7-bc59b"
I0722 12:07:00.132183       1 authentication.go:179] "successfully received oauth token"
I0722 12:07:00.271314       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="silce-carrinho/akvs-env-silce-carrinho-apikey" env="silce-carrinho-apikey"
I0722 12:07:00.331471       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="silce-carrinho/akvs-env-sso-secret" env="sso-secret"
I0722 12:07:00.416304       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="silce-carrinho/akvs-env-datasource-password" env="datasource-password"
I0722 12:07:00.416439       1 main.go:343] "starting process with secrets in env vars" cmd="/usr/bin/java" args=["java","-jar","/opt/deploy/quarkus-run.jar"]
__  ____  __  _____   ___  __ ____  ______
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-07-22 12:07:12,531 WARN  [io.qua.agr.run.AgroalConnectionConfigurer] (JPA Startup Thread) Agroal does not support detecting if a connection is still usable after an exception for database kind: mssql
2026-07-22 12:07:19,490 INFO  [org.hib.orm.jdb.batch] (JPA Startup Thread) HHH100501: Automatic JDBC statement batching enabled (maximum batch size 50)
2026-07-22 12:07:23,067 INFO  [io.quarkus] (main) silce-carrinho azure-2026-01-07-11-05 on JVM (powered by Quarkus 3.27.1) started in 22.524s. Listening on: http://0.0.0.0:80
2026-07-22 12:07:23,079 INFO  [io.quarkus] (main) Profile prod activated.
2026-07-22 12:07:23,138 INFO  [io.quarkus] (main) Installed features: [agroal, cache, cdi, hibernate-orm, hibernate-orm-panache, jdbc-h2, narayana-jta, oidc, oidc-client, opentelemetry, rest, rest-client, rest-client-jackson, rest-client-oidc-filter, rest-client-oidc-token-propagation, rest-jackson, scheduler, security, servlet, smallrye-context-propagation, smallrye-fault-tolerance, smallrye-health, smallrye-jwt, smallrye-openapi, swagger-ui, vertx]
2026-07-22 12:07:31,019 INFO  [br.cai.lot.uti.obj.Print] (executor-thread-3) starting...
2026-07-22 12:07:31,530 INFO  [br.cai.lot.uti.obj.Print] (executor-thread-3)
==============================================================================================
 ooooo  oooo  oooo  oooo  o  o    o  o  o  oooo     o  o    o  o  ooooo  o  oooo  oooo   oooo
 o      o  o  o  o  o  o  o  o o  o  o  o  o  o     o  o o  o  o  o      o  o  o  o   o  o  o
 o      oooo  oooo  oooo  o  o  o o  oooo  o  o     o  o  o o  o  o      o  oooo  o   o  o  o
 o      o  o  o o   o o   o  o   oo  o  o  o  o     o  o   oo  o  o      o  o  o  o   o  o  o
 ooooo  o  o  o  o  o  o  o  o    o  o  o  oooo     o  o    o  o  ooooo  o  o  o  oooo   oooo
==============================================================================================

<img width="1895" height="960" alt="image" src="https://github.com/user-attachments/assets/fb4dd239-9096-4856-8bbe-340475aa60da" />


