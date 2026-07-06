Prezados,

Estamos tendo erros na recuperação de credenciais no Vault em TQS.

Ao que parece, está havendo timeout ao consultar a url https://sicsn.caixa/BeyondTrust/api/public/v3
Anexo a evidência

https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=496846&environmentId=2309703


2026-07-06T15:44:34.3763449Z ##[section]Starting: Verificando Status do Deployment
2026-07-06T15:44:34.3766498Z ==============================================================================
2026-07-06T15:44:34.3766575Z Task         : Bash
2026-07-06T15:44:34.3766627Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-06T15:44:34.3766690Z Version      : 3.227.0
2026-07-06T15:44:34.3766733Z Author       : Microsoft Corporation
2026-07-06T15:44:34.3766877Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-06T15:44:34.3766952Z ==============================================================================
2026-07-06T15:44:34.5070279Z Generating script.
2026-07-06T15:44:34.5082851Z ========================== Starting Command Output ===========================
2026-07-06T15:44:34.5093108Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/b1d2b865-1a31-4137-aab7-6d25c28f0248.sh
2026-07-06T15:44:34.6023974Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-07-06T15:44:36.7411076Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-07-06T15:44:36.8591743Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-07-06T15:50:41.8853332Z ##[error]The task has timed out.
2026-07-06T15:50:41.8854806Z ##[section]Finishing: Verificando Status do Deployment


lod do pod okd: apo eu fzar manualment o stat rolout, pois o que estava com erro ja havida sumido o log

sisbg-backend-tqs-8-bjggp
Running



exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-07-06 13:54:03,123 INFO  [io.quarkus] (main) sisbg-intranet 1.0-SNAPSHOT on JVM (powered by Quarkus 3.4.3) started in 4.628s. Listening on: http://0.0.0.0:8080
2026-07-06 13:54:03,126 INFO  [io.quarkus] (main) Profile prod activated. 
2026-07-06 13:54:03,126 INFO  [io.quarkus] (main) Installed features: [agroal, cdi, hibernate-orm, hibernate-orm-panache, hibernate-validator, jdbc-mssql, narayana-jta, resteasy, resteasy-jackson, smallrye-context-propagation, smallrye-health, smallrye-openapi, spring-data-jpa, spring-di, swagger-ui, vertx]


estou rodando um novo deploy.



sisbg-backend-tqs-9-zb7bh
Running

exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__ ____ __ _____ ___ __ ____ ______
--/ __ \/ / / / _ | / _ \/ //_/ / / / __/
-/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-07-06 13:58:12,852 INFO [io.quarkus] (main) sisbg-intranet 1.0-SNAPSHOT on JVM (powered by Quarkus 3.4.3) started in 4.528s. Listening on: http://0.0.0.0:8080
2026-07-06 13:58:12,856 INFO [io.quarkus] (main) Profile prod activated.
2026-07-06 13:58:12,856 INFO [io.quarkus] (main) Installed features: [agroal, cdi, hibernate-orm, hibernate-orm-panache, hibernate-validator, jdbc-mssql, narayana-jta, resteasy, resteasy-jackson, smallrye-context-propagation, smallrye-health, smallrye-openapi, spring-data-jpa, spring-di, swagger-ui, vertx]



<img width="1885" height="914" alt="image" src="https://github.com/user-attachments/assets/e962770c-5b2d-4288-b100-cc919a21af85" />


passou deu certo.. me ajuda com o texto para encerrar a w.o












