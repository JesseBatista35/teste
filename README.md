dei um roulout e cirou outro

Project: sisgf-des
Pods
Pod details
Pod
P
sisgf-backend-des-221-deploy
Running

Actions
Details
Metrics
YAML
Environment
Logs
Events
Terminal
Streaming events...
Showing 5 events
Older events are not stored.
PodPsisgf-backend-des-221-deploy
NamespaceNSsisgf-des
27 de mai. de 2026, 16:04
Generated from multus
Add eth0 [25.2.25.189/23] from openshift-sdn
PodPsisgf-backend-des-221-deploy
NamespaceNSsisgf-des
27 de mai. de 2026, 16:04
Generated from kubelet on ceadecldlx053.nprd.caixa
Container image "quay.io/openshift/okd-content@sha256:0c49a1e144b537b9c69339d504287fe5c6974ffe69a3212345a5608c06db8a18" already present on machine
PodPsisgf-backend-des-221-deploy
NamespaceNSsisgf-des
27 de mai. de 2026, 16:04
Generated from kubelet on ceadecldlx053.nprd.caixa
Created container deployment
PodPsisgf-backend-des-221-deploy
NamespaceNSsisgf-des
27 de mai. de 2026, 16:04
Generated from kubelet on ceadecldlx053.nprd.caixa
Started container deployment
PodPsisgf-backend-des-221-deploy
NamespaceNSsisgf-des
27 de mai. de 2026, 16:04
Generated from default-scheduler
Successfully assigned sisgf-des/sisgf-backend-des-221-deploy to ceadecldlx053.nprd.caixa

exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__ ____ __ _____ ___ __ ____ ______
--/ __ \/ / / / _ | / _ \/ //_/ / / / __/
-/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-05-27 16:05:38,420 INFO [com.arj.ats.jbossatx] (main) ARJUNA032014: Stopping transaction recovery manager
Failed to load config value of type class java.lang.String for: api.key


