
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc debug dc/siint-saquetecban-pendencia-api-des
Defaulting container name to siint-saquetecban-pendencia-api-des.
Use 'oc describe pod/siint-saquetecban-pendencia-api-des-debug -n siint-des' to see all of the containers in this pod.

Debugging with pod/siint-saquetecban-pendencia-api-des-debug, original command: <image entrypoint>
siint-saquetecban-pendencia-api-des-debug   0/1       Pending   0         0s
Waiting for pod to start ...
siint-saquetecban-pendencia-api-des-debug   0/1       Pending   0         0s
siint-saquetecban-pendencia-api-des-debug   0/1       Init:0/2   0         0s
siint-saquetecban-pendencia-api-des-debug   0/1       Init:0/2   0         3s
siint-saquetecban-pendencia-api-des-debug   0/1       Init:0/2   0         3s
siint-saquetecban-pendencia-api-des-debug   0/1       Init:1/2   0         5s
siint-saquetecban-pendencia-api-des-debug   0/1       PodInitializing   0         6s
siint-saquetecban-pendencia-api-des-debug   1/1       Running   0         9s
If you don't see a command prompt, try pressing enter.
sh-4.4$ siint-saquetecban-pendencia-api-des-48-fjhpz   0/1       Running   4         1m
                                                                                       siint-saquetecban-pendencia-api-des-48-fjhpz   0/1       Error     4         2m
                                                                                                                                                                      siint-saquetecban-pendencia-api-des-48-fjhpz   0/1       CrashLoopBackOff   4         2m
                                                          java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trusks -cp . -jar /deployments/quarkus-run.jaste-nprd.jk
Error: Unable to access jarfile /deployments/quarkus-run.ja
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$ java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.ks -cp . -jar /deployments/quarkus-run.ja
Error: Unable to access jarfile /deployments/quarkus-run.ja
sh-4.4$ java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.ks -cp . -jar /deployments/quarkus-run.jar

__  ____  __  _____   ___  __ ____  ______
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-08-12 11:41:00,209 WARN  [io.quarkus.config] (main) The "quarkus.hibernate-orm.database.generation" config property is deprecated and should not be used anymore.
Failed to load config value of type class java.lang.String for: api.confirmacao.siint-api-key
Failed to load config value of type class java.lang.String for: api.confirmacao.client-secret

sh-4.4$
sh-4.4$
