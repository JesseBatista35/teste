Estabilização do deploy com erro de sync https://github.com/caixagithub/siidx-ferramenta-fakemail/actions/runs/27768779593/job/82163629384



Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
siidx-ferramenta-fakemail
Repository navigation
Code
Issues
Pull requests
Actions
Projects
Models
Wiki
Security and quality
Insights
Settings
CI/CD Workflow
caixagithub/siidx-ferramenta-fakemail_staging_27768779593.14 #14
All jobs
Run details
Annotations
1 error and 1 warning
CI_DES / ArgoCD_Deploy / ArgoCD_Deploy (DES)
failed 5 hours ago in 9m 27s
Search logs
12s
1s
0s
0s
0s
0s
0s
0s
0s
0s
0s
0s
1m 2s
0s
8s
0s
4s
0s
1s
0s
22s
5s
0s
0s
1s
7m 22s
0s
Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/logs@main
Run echo "REPO_NAME=$(echo 'caixagithub/siidx-ferramenta-fakemail' | cut -d'/' -f2)" >> $GITHUB_ENV
INPUT_IMAGE_TAG: '27768779593'
Run RESOURCE_TREE_URL="https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/siidx-ferramenta-fakemail-des/resource-tree?appNamespace=openshift-gitops"
Fazendo requisição para: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/siidx-ferramenta-fakemail-des/resource-tree?appNamespace=openshift-gitops
Resource-tree obtido com sucesso
Filtrando pods e encontrando o mais recente...
Pod mais recente encontrado: siidx-ferramenta-fakemail-des-7498997759-27zvk
URL dos logs: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/siidx-ferramenta-fakemail-des/logs?appNamespace=openshift-gitops&container=siidx-ferramenta-fakemail-des&namespace=siidx-ferramenta-fakemail&follow=false&podName=siidx-ferramenta-fakemail-des-7498997759-27zvk&tailLines=1000&sinceSeconds=0
Logs obtidos com sucesso
Logs do pod siidx-ferramenta-fakemail-des-7498997759-27zvk:
================================================
Exibindo os Logs:
INFO exec -a "java" java -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:+ExitOnOutOfMemoryError -Dquarkus.http.host=0.0.0.0 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -cp "." -jar /deployments/quarkus-run.jar
INFO running in /deployments
SLF4J: Class path contains multiple SLF4J bindings.
SLF4J: Found binding in [jar:file:/deployments/lib/main/com.icegreen.greenmail-standalone-2.1.7.jar!/org/slf4j/impl/StaticLoggerBinder.class]
SLF4J: Found binding in [jar:file:/deployments/lib/main/org.jboss.slf4j.slf4j-jboss-logmanager-2.0.2.Final.jar!/org/slf4j/impl/StaticLoggerBinder.class]
SLF4J: See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.
SLF4J: Actual binding is of type [org.apache.logging.slf4j.Log4jLoggerFactory]
   _____ ____________ _  __
  / ___//  _/  _/ __ \ |/ /
  \__ \ / / / // / / /   /
 ___/ // /_/ // /_/ /   |
/____/___/___/_____/_/|_|


Ferramentas - FakeMail

                                  Powered by Quarkus 3.33.2
2026-06-18 12:13:35,239 WARN  [io.quarkus.qute.runtime.ContentTypes] (main) Unable to detect the content type for templates/template.mustache; using application/octet-stream
2026-06-18 12:13:35,241 WARN  [io.quarkus.qute.runtime.ContentTypes] (main) Unable to detect the content type for templates/receive-emails.mustache; using application/octet-stream
2026-06-18 12:13:35,242 WARN  [io.quarkus.qute.runtime.ContentTypes] (main) Unable to detect the content type for templates/reset-mail-server.mustache; using application/octet-stream
2026-06-18 12:13:35,242 WARN  [io.quarkus.qute.runtime.ContentTypes] (main) Unable to detect the content type for templates/search-emails.mustache; using application/octet-stream
2026-06-18 12:13:35,243 WARN  [io.quarkus.qute.runtime.ContentTypes] (main) Unable to detect the content type for templates/expunge-emails.mustache; using application/octet-stream
2026-06-18 12:13:35,336 WARN  [io.quarkus.qute.runtime.ContentTypes] (main) Unable to detect the content type for templates/partials/emails.mustache; using application/octet-stream
2026-06-18 12:13:35,338 WARN  [io.quarkus.qute.runtime.ContentTypes] (main) Unable to detect the content type for templates/send-test-mail.mustache; using application/octet-stream
2026-06-18 12:13:35,444 INFO  [br.gov.caixa.siidx.fakemail.lifecycle.GreenMailLifecycle] (main) FakeMail SMTP server started on port 3025
2026-06-18 12:13:35,444 INFO  [br.gov.caixa.siidx.fakemail.lifecycle.GreenMailLifecycle] (main) FakeMail IMAP server started on port 3143
2026-06-18 12:13:35,735 INFO  [io.quarkus] (main) fakemail-server 0.1.0-SNAPSHOT on JVM (powered by Quarkus 3.33.2) started in 4.489s. Listening on: http://0.0.0.0:8080
2026-06-18 12:13:35,735 INFO  [io.quarkus] (main) Profile prod activated.
2026-06-18 12:13:35,736 INFO  [io.quarkus] (main) Installed features: [cdi, qute, qute-web, qute-web-markdown, rest, rest-jackson, rest-qute, scheduler, smallrye-context-propagation, vertx, web-dependency-locator]

0s
0s
0s
0s
0s
0s
0s
1s
0s
