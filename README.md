2026-09-10T18:27:35.3556268Z ##[section]Starting: Verificando Status do Deployment
2026-09-10T18:27:35.3559937Z ==============================================================================
2026-09-10T18:27:35.3560032Z Task         : Bash
2026-09-10T18:27:35.3560074Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-10T18:27:35.3560239Z Version      : 3.227.0
2026-09-10T18:27:35.3560289Z Author       : Microsoft Corporation
2026-09-10T18:27:35.3560338Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-10T18:27:35.3560404Z ==============================================================================
2026-09-10T18:27:36.3043114Z Generating script.
2026-09-10T18:27:36.3054100Z ========================== Starting Command Output ===========================
2026-09-10T18:27:36.3061544Z [command]/bin/bash /opt/ads-agent/_work/_temp/0c8501cf-21ae-4515-b1ff-44588905bc88.sh
2026-09-10T18:27:36.4179696Z Waiting for deployment "sispl-consulta-transacao-des" rollout to finish: 1 old replicas are pending termination...
2026-09-10T18:33:42.8658878Z ##[error]The task has timed out.
2026-09-10T18:33:42.8660505Z ##[section]Finishing: Verificando Status do Deployment




2026-09-10T18:33:42.8679195Z ##[section]Starting: Logs da Aplicação
2026-09-10T18:33:42.8682731Z ==============================================================================
2026-09-10T18:33:42.8682807Z Task         : Bash
2026-09-10T18:33:42.8682857Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-10T18:33:42.8682914Z Version      : 3.227.0
2026-09-10T18:33:42.8682953Z Author       : Microsoft Corporation
2026-09-10T18:33:42.8683012Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-10T18:33:42.8683077Z ==============================================================================
2026-09-10T18:33:43.8095537Z Generating script.
2026-09-10T18:33:43.8107310Z ========================== Starting Command Output ===========================
2026-09-10T18:33:43.8120134Z [command]/bin/bash /opt/ads-agent/_work/_temp/a4fd1436-465d-4de6-8504-2924a2370179.sh
2026-09-10T18:33:43.8166914Z + shopt -s expand_aliases
2026-09-10T18:33:43.8167329Z + [[ -n openshift_nprd_loterias ]]
2026-09-10T18:33:43.8167961Z + [[ openshift_nprd_loterias =~ ocp ]]
2026-09-10T18:33:43.8168274Z + [[ -n openshift_nprd_loterias ]]
2026-09-10T18:33:43.8168393Z + [[ openshift_nprd_loterias =~ (okd4|openshift) ]]
2026-09-10T18:33:43.8168563Z + app=sispl-consulta-transacao-des
2026-09-10T18:33:43.8168672Z + oc version
2026-09-10T18:33:43.9001400Z Client Version: v4.2.0-alpha.0-1650-g31aa3e8
2026-09-10T18:33:43.9001598Z Kustomize Version: v4.5.7
2026-09-10T18:33:43.9001701Z Kubernetes Version: v1.33.12
2026-09-10T18:33:43.9035212Z ++ oc get pod -l name=sispl-consulta-transacao-des -n sispl-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-09-10T18:33:43.9036553Z ++ tac
2026-09-10T18:33:43.9036720Z ++ grep -v '^$'
2026-09-10T18:33:43.9036812Z ++ head -n1
2026-09-10T18:33:44.0058181Z + last_pod=sispl-consulta-transacao-des-7784569d78-x6l66
2026-09-10T18:33:44.0058915Z + echo 'Logs do POD: sispl-consulta-transacao-des-7784569d78-x6l66'
2026-09-10T18:33:44.0059615Z + oc logs sispl-consulta-transacao-des-7784569d78-x6l66 -c sispl-consulta-transacao-des -n sispl-des
2026-09-10T18:33:44.0060157Z Logs do POD: sispl-consulta-transacao-des-7784569d78-x6l66
2026-09-10T18:33:44.2305638Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.5.1.jar -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-09-10T18:33:44.2306003Z Error occurred during initialization of VM
2026-09-10T18:33:44.2306120Z agent library failed to init: instrument
2026-09-10T18:33:44.2306383Z Error opening zip file or JAR manifest missing : /deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.5.1.jar
2026-09-10T18:33:44.2390332Z ##[section]Finishing: Logs da Aplicação





2026-09-10T15:19:44.2395860Z ##[section]Starting: Executando Build S2I Binary
2026-09-10T15:19:44.2401273Z ==============================================================================
2026-09-10T15:19:44.2401422Z Task         : Bash
2026-09-10T15:19:44.2401501Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-10T15:19:44.2401624Z Version      : 3.227.0
2026-09-10T15:19:44.2401703Z Author       : Microsoft Corporation
2026-09-10T15:19:44.2401786Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-10T15:19:44.2401914Z ==============================================================================
2026-09-10T15:19:44.4010077Z Generating script.
2026-09-10T15:19:44.4022438Z ========================== Starting Command Output ===========================
2026-09-10T15:19:44.4035941Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/1230838a-903c-40e9-be87-f851e6a353a7.sh
2026-09-10T15:19:44.4090132Z + set -o errexit
2026-09-10T15:19:44.4090430Z + set -o pipefail
2026-09-10T15:19:44.4091249Z + echo okd4_nprd
2026-09-10T15:19:44.4091498Z + egrep -q '^(okd4|ocp)'
2026-09-10T15:19:44.4122901Z + buildconfig=sispl-consulta-transacao
2026-09-10T15:19:44.4124334Z + oc start-build sispl-consulta-transacao --from-dir=/opt/ads-agent/_work/36/a --follow --wait=true -n build-images-ads -v=5
2026-09-10T15:19:44.4745637Z I0910 12:19:44.474110   67969 repository.go:450] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
2026-09-10T15:19:44.4764417Z I0910 12:19:44.476288   67969 repository.go:533] Error executing command: exit status 128
2026-09-10T15:19:44.4764818Z Uploading directory "/opt/ads-agent/_work/36/a" as binary input for the build ...
2026-09-10T15:19:44.4765842Z I0910 12:19:44.476514   67969 tar.go:238] Adding "/opt/ads-agent/_work/36/a" to tar ...
2026-09-10T15:19:44.4769765Z I0910 12:19:44.476892   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/app as app
2026-09-10T15:19:44.4775449Z I0910 12:19:44.477450   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/app/sispl-consulta-transacao-1.0.0-SNAPSHOT.jar as app/sispl-consulta-transacao-1.0.0-SNAPSHOT.jar
2026-09-10T15:19:44.4777696Z I0910 12:19:44.477696   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib as lib
2026-09-10T15:19:44.4800298Z I0910 12:19:44.479907   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/boot as lib/boot
2026-09-10T15:19:44.4800665Z I0910 12:19:44.479989   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/boot/io.github.crac.org-crac-0.1.3.jar as lib/boot/io.github.crac.org-crac-0.1.3.jar
2026-09-10T15:19:44.4801373Z I0910 12:19:44.480066   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/boot/io.quarkus.quarkus-bootstrap-runner-3.15.5.jar as lib/boot/io.quarkus.quarkus-bootstrap-runner-3.15.5.jar
2026-09-10T15:19:44.4837550Z I0910 12:19:44.483603   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/boot/io.quarkus.quarkus-classloader-commons-3.15.5.jar as lib/boot/io.quarkus.quarkus-classloader-commons-3.15.5.jar
2026-09-10T15:19:44.4847738Z I0910 12:19:44.484584   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/boot/io.quarkus.quarkus-development-mode-spi-3.15.5.jar as lib/boot/io.quarkus.quarkus-development-mode-spi-3.15.5.jar
2026-09-10T15:19:44.4872545Z I0910 12:19:44.487003   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/boot/io.quarkus.quarkus-vertx-latebound-mdc-provider-3.15.5.jar as lib/boot/io.quarkus.quarkus-vertx-latebound-mdc-provider-3.15.5.jar
2026-09-10T15:19:44.4885485Z I0910 12:19:44.488347   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/boot/io.smallrye.common.smallrye-common-constraint-2.6.1.jar as lib/boot/io.smallrye.common.smallrye-common-constraint-2.6.1.jar
2026-09-10T15:19:44.4897466Z I0910 12:19:44.489549   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/boot/io.smallrye.common.smallrye-common-cpu-2.6.1.jar as lib/boot/io.smallrye.common.smallrye-common-cpu-2.6.1.jar
2026-09-10T15:19:44.4898910Z I0910 12:19:44.489712   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/boot/io.smallrye.common.smallrye-common-expression-2.6.1.jar as lib/boot/io.smallrye.common.smallrye-common-expression-2.6.1.jar
2026-09-10T15:19:44.4913637Z I0910 12:19:44.491124   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/boot/io.smallrye.common.smallrye-common-function-2.6.1.jar as lib/boot/io.smallrye.common.smallrye-common-function-2.6.1.jar
2026-09-10T15:19:44.4944963Z I0910 12:19:44.494269   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/boot/io.smallrye.common.smallrye-common-io-2.6.1.jar as lib/boot/io.smallrye.common.smallrye-common-io-2.6.1.jar
2026-09-10T15:19:44.4946379Z I0910 12:19:44.494540   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/boot/io.smallrye.common.smallrye-common-net-2.6.1.jar as lib/boot/io.smallrye.common.smallrye-common-net-2.6.1.jar
2026-09-10T15:19:44.4972215Z I0910 12:19:44.497000   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/boot/io.smallrye.common.smallrye-common-os-2.6.1.jar as lib/boot/io.smallrye.common.smallrye-common-os-2.6.1.jar
2026-09-10T15:19:44.4973010Z I0910 12:19:44.497122   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/boot/io.smallrye.common.smallrye-common-ref-2.6.1.jar as lib/boot/io.smallrye.common.smallrye-common-ref-2.6.1.jar
2026-09-10T15:19:44.4987992Z I0910 12:19:44.498603   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/boot/org.jboss.logging.jboss-logging-3.6.0.Final.jar as lib/boot/org.jboss.logging.jboss-logging-3.6.0.Final.jar
2026-09-10T15:19:44.5030967Z I0910 12:19:44.502893   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/boot/org.jboss.logmanager.jboss-logmanager-3.1.1.Final.jar as lib/boot/org.jboss.logmanager.jboss-logmanager-3.1.1.Final.jar
2026-09-10T15:19:50.2659153Z .I0910 12:19:50.265565   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main as lib/main
2026-09-10T15:19:50.2660921Z I0910 12:19:50.265971   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/br.gov.caixa.caixa-dominio-1.0.0.4.jar as lib/main/br.gov.caixa.caixa-dominio-1.0.0.4.jar
2026-09-10T15:19:50.2691915Z I0910 12:19:50.268911   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/br.gov.caixa.caixa-negocio-infra-1.0.0.4.jar as lib/main/br.gov.caixa.caixa-negocio-infra-1.0.0.4.jar
2026-09-10T15:19:50.2739044Z I0910 12:19:50.273731   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/br.gov.caixa.caixa-util-1.0.0.4.jar as lib/main/br.gov.caixa.caixa-util-1.0.0.4.jar
2026-09-10T15:19:50.2796508Z I0910 12:19:50.279491   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/br.gov.caixa.loterias.api.loterias-api-commons-1.0.6.jar as lib/main/br.gov.caixa.loterias.api.loterias-api-commons-1.0.6.jar
2026-09-10T15:19:50.2798180Z I0910 12:19:50.279704   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/com.aayushatharva.brotli4j.brotli4j-1.16.0.jar as lib/main/com.aayushatharva.brotli4j.brotli4j-1.16.0.jar
2026-09-10T15:19:50.2819037Z I0910 12:19:50.281776   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/com.aayushatharva.brotli4j.native-linux-x86_64-1.16.0.jar as lib/main/com.aayushatharva.brotli4j.native-linux-x86_64-1.16.0.jar
2026-09-10T15:19:50.2937031Z I0910 12:19:50.293469   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/com.aayushatharva.brotli4j.service-1.16.0.jar as lib/main/com.aayushatharva.brotli4j.service-1.16.0.jar
2026-09-10T15:19:50.2937585Z I0910 12:19:50.293592   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/com.fasterxml.classmate-1.7.0.jar as lib/main/com.fasterxml.classmate-1.7.0.jar
2026-09-10T15:19:50.2977626Z I0910 12:19:50.297613   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/com.fasterxml.jackson.core.jackson-annotations-2.17.2.jar as lib/main/com.fasterxml.jackson.core.jackson-annotations-2.17.2.jar
2026-09-10T15:19:50.3011084Z I0910 12:19:50.300898   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/com.fasterxml.jackson.core.jackson-core-2.17.2.jar as lib/main/com.fasterxml.jackson.core.jackson-core-2.17.2.jar
2026-09-10T15:19:50.3249021Z I0910 12:19:50.324574   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/com.fasterxml.jackson.core.jackson-databind-2.17.2.jar as lib/main/com.fasterxml.jackson.core.jackson-databind-2.17.2.jar
2026-09-10T15:19:50.4028438Z I0910 12:19:50.402357   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/com.fasterxml.jackson.dataformat.jackson-dataformat-yaml-2.17.2.jar as lib/main/com.fasterxml.jackson.dataformat.jackson-dataformat-yaml-2.17.2.jar
2026-09-10T15:19:50.4037599Z I0910 12:19:50.403566   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/com.fasterxml.jackson.datatype.jackson-datatype-jdk8-2.17.2.jar as lib/main/com.fasterxml.jackson.datatype.jackson-datatype-jdk8-2.17.2.jar
2026-09-10T15:19:50.4065667Z I0910 12:19:50.406375   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/com.fasterxml.jackson.datatype.jackson-datatype-jsr310-2.17.2.jar as lib/main/com.fasterxml.jackson.datatype.jackson-datatype-jsr310-2.17.2.jar
2026-09-10T15:19:50.4122049Z I0910 12:19:50.411986   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/com.fasterxml.jackson.jakarta.rs.jackson-jakarta-rs-base-2.17.2.jar as lib/main/com.fasterxml.jackson.jakarta.rs.jackson-jakarta-rs-base-2.17.2.jar
2026-09-10T15:19:50.4135252Z I0910 12:19:50.413398   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/com.fasterxml.jackson.jakarta.rs.jackson-jakarta-rs-json-provider-2.17.2.jar as lib/main/com.fasterxml.jackson.jakarta.rs.jackson-jakarta-rs-json-provider-2.17.2.jar
2026-09-10T15:19:50.4136024Z I0910 12:19:50.413507   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/com.fasterxml.jackson.module.jackson-module-jakarta-xmlbind-annotations-2.17.2.jar as lib/main/com.fasterxml.jackson.module.jackson-module-jakarta-xmlbind-annotations-2.17.2.jar
2026-09-10T15:19:50.4147306Z I0910 12:19:50.414606   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/com.fasterxml.jackson.module.jackson-module-parameter-names-2.17.2.jar as lib/main/com.fasterxml.jackson.module.jackson-module-parameter-names-2.17.2.jar
2026-09-10T15:19:50.4164580Z I0910 12:19:50.416195   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/com.github.ben-manes.caffeine.caffeine-3.1.5.jar as lib/main/com.github.ben-manes.caffeine.caffeine-3.1.5.jar
2026-09-10T15:19:50.4431847Z I0910 12:19:50.442820   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/com.github.java-json-tools.btf-1.3.jar as lib/main/com.github.java-json-tools.btf-1.3.jar
2026-09-10T15:19:50.4432398Z I0910 12:19:50.442990   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/com.github.java-json-tools.jackson-coreutils-2.0.jar as lib/main/com.github.java-json-tools.jackson-coreutils-2.0.jar
2026-09-10T15:19:50.4441377Z I0910 12:19:50.444021   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/com.github.java-json-tools.json-patch-1.13.jar as lib/main/com.github.java-json-tools.json-patch-1.13.jar
2026-09-10T15:19:50.4466400Z I0910 12:19:50.446389   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/com.github.java-json-tools.msg-simple-1.2.jar as lib/main/com.github.java-json-tools.msg-simple-1.2.jar
2026-09-10T15:19:50.4487606Z I0910 12:19:50.448609   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/com.google.errorprone.error_prone_annotations-2.30.0.jar as lib/main/com.google.errorprone.error_prone_annotations-2.30.0.jar
2026-09-10T15:19:50.4488215Z I0910 12:19:50.448718   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/com.ibm.async.asyncutil-0.1.0.jar as lib/main/com.ibm.async.asyncutil-0.1.0.jar
2026-09-10T15:19:50.4546333Z I0910 12:19:50.454458   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/com.ibm.db2.db2jcc_license_cisuz-4.jar as lib/main/com.ibm.db2.db2jcc_license_cisuz-4.jar
2026-09-10T15:19:50.4553517Z I0910 12:19:50.455218   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/com.ibm.db2.jcc-11.5.8.0.jar as lib/main/com.ibm.db2.jcc-11.5.8.0.jar
2026-09-10T15:19:50.7380015Z I0910 12:19:50.737634   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/com.sun.istack.istack-commons-runtime-4.1.2.jar as lib/main/com.sun.istack.istack-commons-runtime-4.1.2.jar
2026-09-10T15:19:50.7381231Z I0910 12:19:50.737815   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/com.sun.istack.istack-commons-tools-4.1.2.jar as lib/main/com.sun.istack.istack-commons-tools-4.1.2.jar
2026-09-10T15:19:50.7389804Z I0910 12:19:50.738847   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/com.sun.xml.bind.external.relaxng-datatype-4.0.3.jar as lib/main/com.sun.xml.bind.external.relaxng-datatype-4.0.3.jar
2026-09-10T15:19:50.7401033Z I0910 12:19:50.739986   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/com.sun.xml.bind.external.rngom-4.0.3.jar as lib/main/com.sun.xml.bind.external.rngom-4.0.3.jar
2026-09-10T15:19:50.7537208Z I0910 12:19:50.753387   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.agroal.agroal-api-2.6.jar as lib/main/io.agroal.agroal-api-2.6.jar
2026-09-10T15:19:50.7547832Z I0910 12:19:50.754664   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.agroal.agroal-narayana-2.6.jar as lib/main/io.agroal.agroal-narayana-2.6.jar
2026-09-10T15:19:50.7563206Z I0910 12:19:50.756136   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.agroal.agroal-pool-2.6.jar as lib/main/io.agroal.agroal-pool-2.6.jar
2026-09-10T15:19:50.7622767Z I0910 12:19:50.762034   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.netty.netty-buffer-4.1.119.Final.jar as lib/main/io.netty.netty-buffer-4.1.119.Final.jar
2026-09-10T15:19:50.7783814Z I0910 12:19:50.778120   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.netty.netty-codec-4.1.119.Final.jar as lib/main/io.netty.netty-codec-4.1.119.Final.jar
2026-09-10T15:19:50.7948006Z I0910 12:19:50.794507   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.netty.netty-codec-dns-4.1.119.Final.jar as lib/main/io.netty.netty-codec-dns-4.1.119.Final.jar
2026-09-10T15:19:50.7984987Z I0910 12:19:50.798303   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.netty.netty-codec-haproxy-4.1.119.Final.jar as lib/main/io.netty.netty-codec-haproxy-4.1.119.Final.jar
2026-09-10T15:19:50.8001114Z I0910 12:19:50.799945   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.netty.netty-codec-http-4.1.119.Final.jar as lib/main/io.netty.netty-codec-http-4.1.119.Final.jar
2026-09-10T15:19:50.8302435Z I0910 12:19:50.829909   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.netty.netty-codec-http2-4.1.119.Final.jar as lib/main/io.netty.netty-codec-http2-4.1.119.Final.jar
2026-09-10T15:19:50.8502231Z I0910 12:19:50.849951   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.netty.netty-codec-socks-4.1.119.Final.jar as lib/main/io.netty.netty-codec-socks-4.1.119.Final.jar
2026-09-10T15:19:50.8547251Z I0910 12:19:50.854570   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.netty.netty-common-4.1.119.Final.jar as lib/main/io.netty.netty-common-4.1.119.Final.jar
2026-09-10T15:19:50.8828189Z I0910 12:19:50.882532   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.netty.netty-handler-4.1.119.Final.jar as lib/main/io.netty.netty-handler-4.1.119.Final.jar
2026-09-10T15:19:50.9082385Z I0910 12:19:50.907850   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.netty.netty-handler-proxy-4.1.119.Final.jar as lib/main/io.netty.netty-handler-proxy-4.1.119.Final.jar
2026-09-10T15:19:50.9093752Z I0910 12:19:50.909136   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.netty.netty-resolver-4.1.119.Final.jar as lib/main/io.netty.netty-resolver-4.1.119.Final.jar
2026-09-10T15:19:50.9108797Z I0910 12:19:50.910716   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.netty.netty-resolver-dns-4.1.119.Final.jar as lib/main/io.netty.netty-resolver-dns-4.1.119.Final.jar
2026-09-10T15:19:50.9187405Z I0910 12:19:50.918460   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.netty.netty-transport-4.1.119.Final.jar as lib/main/io.netty.netty-transport-4.1.119.Final.jar
2026-09-10T15:19:50.9419326Z I0910 12:19:50.941568   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.netty.netty-transport-native-unix-common-4.1.119.Final.jar as lib/main/io.netty.netty-transport-native-unix-common-4.1.119.Final.jar
2026-09-10T15:19:50.9437784Z I0910 12:19:50.943547   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.arc.arc-3.15.5.jar as lib/main/io.quarkus.arc.arc-3.15.5.jar
2026-09-10T15:19:50.9571585Z I0910 12:19:50.956874   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-agroal-3.15.5.jar as lib/main/io.quarkus.quarkus-agroal-3.15.5.jar
2026-09-10T15:19:50.9583813Z I0910 12:19:50.958224   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-arc-3.15.5.jar as lib/main/io.quarkus.quarkus-arc-3.15.5.jar
2026-09-10T15:19:50.9625341Z I0910 12:19:50.962365   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-caffeine-3.15.5.jar as lib/main/io.quarkus.quarkus-caffeine-3.15.5.jar
2026-09-10T15:19:50.9630857Z I0910 12:19:50.963008   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-core-3.15.5.jar as lib/main/io.quarkus.quarkus-core-3.15.5.jar
2026-09-10T15:19:50.9800061Z I0910 12:19:50.979695   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-credentials-3.15.5.jar as lib/main/io.quarkus.quarkus-credentials-3.15.5.jar
2026-09-10T15:19:50.9802418Z I0910 12:19:50.980096   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-datasource-3.15.5.jar as lib/main/io.quarkus.quarkus-datasource-3.15.5.jar
2026-09-10T15:19:50.9804082Z I0910 12:19:50.980290   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-datasource-common-3.15.5.jar as lib/main/io.quarkus.quarkus-datasource-common-3.15.5.jar
2026-09-10T15:19:50.9813925Z I0910 12:19:50.981284   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-fs-util-0.0.10.jar as lib/main/io.quarkus.quarkus-fs-util-0.0.10.jar
2026-09-10T15:19:50.9815693Z I0910 12:19:50.981501   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-hal-3.15.5.jar as lib/main/io.quarkus.quarkus-hal-3.15.5.jar
2026-09-10T15:19:50.9832420Z I0910 12:19:50.983154   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-hibernate-orm-3.15.5.jar as lib/main/io.quarkus.quarkus-hibernate-orm-3.15.5.jar
2026-09-10T15:19:50.9955190Z I0910 12:19:50.995207   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-hibernate-orm-panache-3.15.5.jar as lib/main/io.quarkus.quarkus-hibernate-orm-panache-3.15.5.jar
2026-09-10T15:19:50.9963336Z I0910 12:19:50.996230   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-hibernate-orm-panache-common-3.15.5.jar as lib/main/io.quarkus.quarkus-hibernate-orm-panache-common-3.15.5.jar
2026-09-10T15:19:50.9974388Z I0910 12:19:50.997313   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-hibernate-orm-rest-data-panache-3.15.5.jar as lib/main/io.quarkus.quarkus-hibernate-orm-rest-data-panache-3.15.5.jar
2026-09-10T15:19:50.9989253Z I0910 12:19:50.998800   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-hibernate-validator-3.15.5.jar as lib/main/io.quarkus.quarkus-hibernate-validator-3.15.5.jar
2026-09-10T15:19:50.9998023Z I0910 12:19:50.999677   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-jackson-3.15.5.jar as lib/main/io.quarkus.quarkus-jackson-3.15.5.jar
2026-09-10T15:19:51.0017879Z I0910 12:19:51.001579   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-jdbc-db2-3.15.5.jar as lib/main/io.quarkus.quarkus-jdbc-db2-3.15.5.jar
2026-09-10T15:19:51.0032280Z I0910 12:19:51.003120   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-jsonp-3.15.5.jar as lib/main/io.quarkus.quarkus-jsonp-3.15.5.jar
2026-09-10T15:19:51.0033386Z I0910 12:19:51.003212   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-mutiny-3.15.5.jar as lib/main/io.quarkus.quarkus-mutiny-3.15.5.jar
2026-09-10T15:19:51.0034804Z I0910 12:19:51.003355   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-narayana-jta-3.15.5.jar as lib/main/io.quarkus.quarkus-narayana-jta-3.15.5.jar
2026-09-10T15:19:51.0077579Z I0910 12:19:51.007479   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-netty-3.15.5.jar as lib/main/io.quarkus.quarkus-netty-3.15.5.jar
2026-09-10T15:19:51.0120262Z I0910 12:19:51.011798   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-oidc-3.15.5.jar as lib/main/io.quarkus.quarkus-oidc-3.15.5.jar
2026-09-10T15:19:51.0275734Z I0910 12:19:51.027289   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-oidc-common-3.15.5.jar as lib/main/io.quarkus.quarkus-oidc-common-3.15.5.jar
2026-09-10T15:19:51.0293618Z I0910 12:19:51.029254   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-panache-common-3.15.5.jar as lib/main/io.quarkus.quarkus-panache-common-3.15.5.jar
2026-09-10T15:19:51.0302803Z I0910 12:19:51.030187   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-panache-hibernate-common-3.15.5.jar as lib/main/io.quarkus.quarkus-panache-hibernate-common-3.15.5.jar
2026-09-10T15:19:51.0304564Z I0910 12:19:51.030340   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-rest-data-panache-3.15.5.jar as lib/main/io.quarkus.quarkus-rest-data-panache-3.15.5.jar
2026-09-10T15:19:51.0314880Z I0910 12:19:51.031261   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-resteasy-3.15.5.jar as lib/main/io.quarkus.quarkus-resteasy-3.15.5.jar
2026-09-10T15:19:51.0370502Z I0910 12:19:51.036832   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-resteasy-common-3.15.5.jar as lib/main/io.quarkus.quarkus-resteasy-common-3.15.5.jar
2026-09-10T15:19:51.0379810Z I0910 12:19:51.037878   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-resteasy-jackson-3.15.5.jar as lib/main/io.quarkus.quarkus-resteasy-jackson-3.15.5.jar
2026-09-10T15:19:51.0383952Z I0910 12:19:51.038205   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-resteasy-links-3.15.5.jar as lib/main/io.quarkus.quarkus-resteasy-links-3.15.5.jar
2026-09-10T15:19:51.0385013Z I0910 12:19:51.038404   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-resteasy-server-common-3.15.5.jar as lib/main/io.quarkus.quarkus-resteasy-server-common-3.15.5.jar
2026-09-10T15:19:51.0392090Z I0910 12:19:51.039045   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-security-3.15.5.jar as lib/main/io.quarkus.quarkus-security-3.15.5.jar
2026-09-10T15:19:51.0436667Z I0910 12:19:51.043448   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-security-runtime-spi-3.15.5.jar as lib/main/io.quarkus.quarkus-security-runtime-spi-3.15.5.jar
2026-09-10T15:19:51.0438420Z I0910 12:19:51.043752   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-smallrye-context-propagation-3.15.5.jar as lib/main/io.quarkus.quarkus-smallrye-context-propagation-3.15.5.jar
2026-09-10T15:19:51.0453750Z I0910 12:19:51.045290   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-smallrye-health-3.15.5.jar as lib/main/io.quarkus.quarkus-smallrye-health-3.15.5.jar
2026-09-10T15:19:51.0464844Z I0910 12:19:51.046378   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-smallrye-jwt-3.15.5.jar as lib/main/io.quarkus.quarkus-smallrye-jwt-3.15.5.jar
2026-09-10T15:19:51.0466019Z I0910 12:19:51.046527   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-smallrye-jwt-build-3.15.5.jar as lib/main/io.quarkus.quarkus-smallrye-jwt-build-3.15.5.jar
2026-09-10T15:19:51.0475756Z I0910 12:19:51.047494   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-smallrye-metrics-3.15.5.jar as lib/main/io.quarkus.quarkus-smallrye-metrics-3.15.5.jar
2026-09-10T15:19:51.0511335Z I0910 12:19:51.050972   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-smallrye-openapi-3.15.5.jar as lib/main/io.quarkus.quarkus-smallrye-openapi-3.15.5.jar
2026-09-10T15:19:51.0531909Z I0910 12:19:51.053071   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-swagger-ui-3.15.5.jar as lib/main/io.quarkus.quarkus-swagger-ui-3.15.5.jar
2026-09-10T15:19:51.0539053Z I0910 12:19:51.053805   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-tls-registry-3.15.5.jar as lib/main/io.quarkus.quarkus-tls-registry-3.15.5.jar
2026-09-10T15:19:51.0567775Z I0910 12:19:51.056654   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-transaction-annotations-3.15.5.jar as lib/main/io.quarkus.quarkus-transaction-annotations-3.15.5.jar
2026-09-10T15:19:51.0568528Z I0910 12:19:51.056791   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-vertx-3.15.5.jar as lib/main/io.quarkus.quarkus-vertx-3.15.5.jar
2026-09-10T15:19:51.0623374Z I0910 12:19:51.062068   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-vertx-http-3.15.5.jar as lib/main/io.quarkus.quarkus-vertx-http-3.15.5.jar
2026-09-10T15:19:51.0932212Z I0910 12:19:51.092831   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.quarkus-virtual-threads-3.15.5.jar as lib/main/io.quarkus.quarkus-virtual-threads-3.15.5.jar
2026-09-10T15:19:51.0940730Z I0910 12:19:51.093944   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.security.quarkus-security-2.1.0.jar as lib/main/io.quarkus.security.quarkus-security-2.1.0.jar
2026-09-10T15:19:51.0958806Z I0910 12:19:51.095664   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.quarkus.vertx.utils.quarkus-vertx-utils-3.15.5.jar as lib/main/io.quarkus.vertx.utils.quarkus-vertx-utils-3.15.5.jar
2026-09-10T15:19:51.0959508Z I0910 12:19:51.095829   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.common.smallrye-common-annotation-2.6.1.jar as lib/main/io.smallrye.common.smallrye-common-annotation-2.6.1.jar
2026-09-10T15:19:51.0971021Z I0910 12:19:51.096951   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.common.smallrye-common-classloader-2.6.1.jar as lib/main/io.smallrye.common.smallrye-common-classloader-2.6.1.jar
2026-09-10T15:19:51.0972234Z I0910 12:19:51.097135   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.common.smallrye-common-vertx-context-2.6.1.jar as lib/main/io.smallrye.common.smallrye-common-vertx-context-2.6.1.jar
2026-09-10T15:19:51.0979741Z I0910 12:19:51.097879   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.config.smallrye-config-3.9.1.jar as lib/main/io.smallrye.config.smallrye-config-3.9.1.jar
2026-09-10T15:19:51.0997402Z I0910 12:19:51.099562   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.config.smallrye-config-common-3.9.1.jar as lib/main/io.smallrye.config.smallrye-config-common-3.9.1.jar
2026-09-10T15:19:51.0998056Z I0910 12:19:51.099715   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.config.smallrye-config-core-3.9.1.jar as lib/main/io.smallrye.config.smallrye-config-core-3.9.1.jar
2026-09-10T15:19:51.1139769Z I0910 12:19:51.113711   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.config.smallrye-config-source-file-system-3.13.2.jar as lib/main/io.smallrye.config.smallrye-config-source-file-system-3.13.2.jar
2026-09-10T15:19:51.1141110Z I0910 12:19:51.114029   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.config.smallrye-config-validator-3.9.1.jar as lib/main/io.smallrye.config.smallrye-config-validator-3.9.1.jar
2026-09-10T15:19:51.1149223Z I0910 12:19:51.114834   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.jandex-3.2.3.jar as lib/main/io.smallrye.jandex-3.2.3.jar
2026-09-10T15:19:51.1296862Z I0910 12:19:51.129422   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.reactive.mutiny-2.6.2.jar as lib/main/io.smallrye.reactive.mutiny-2.6.2.jar
2026-09-10T15:19:51.1673547Z I0910 12:19:51.166974   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.reactive.mutiny-smallrye-context-propagation-2.6.2.jar as lib/main/io.smallrye.reactive.mutiny-smallrye-context-propagation-2.6.2.jar
2026-09-10T15:19:51.1675175Z I0910 12:19:51.167421   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.reactive.mutiny-zero-flow-adapters-1.1.0.jar as lib/main/io.smallrye.reactive.mutiny-zero-flow-adapters-1.1.0.jar
2026-09-10T15:19:51.1689046Z I0910 12:19:51.168646   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-auth-common-3.16.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-auth-common-3.16.0.jar
2026-09-10T15:19:51.1703795Z I0910 12:19:51.170216   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-bridge-common-3.16.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-bridge-common-3.16.0.jar
2026-09-10T15:19:51.1709990Z I0910 12:19:51.170840   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-core-3.16.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-core-3.16.0.jar
2026-09-10T15:19:51.1865354Z I0910 12:19:51.186135   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-runtime-3.16.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-runtime-3.16.0.jar
2026-09-10T15:19:51.1866247Z I0910 12:19:51.186279   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-uri-template-3.16.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-uri-template-3.16.0.jar
2026-09-10T15:19:51.1877101Z I0910 12:19:51.187481   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-3.16.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-3.16.0.jar
2026-09-10T15:19:51.1942743Z I0910 12:19:51.193977   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-client-3.16.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-client-3.16.0.jar
2026-09-10T15:19:51.1961233Z I0910 12:19:51.195921   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-common-3.16.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-common-3.16.0.jar
2026-09-10T15:19:51.1969129Z I0910 12:19:51.196771   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.reactive.smallrye-reactive-converter-api-3.0.1.jar as lib/main/io.smallrye.reactive.smallrye-reactive-converter-api-3.0.1.jar
2026-09-10T15:19:51.1979568Z I0910 12:19:51.197804   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.reactive.smallrye-reactive-converter-mutiny-3.0.1.jar as lib/main/io.smallrye.reactive.smallrye-reactive-converter-mutiny-3.0.1.jar
2026-09-10T15:19:51.1980474Z I0910 12:19:51.197973   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.reactive.vertx-mutiny-generator-3.16.0.jar as lib/main/io.smallrye.reactive.vertx-mutiny-generator-3.16.0.jar
2026-09-10T15:19:51.2016457Z I0910 12:19:51.201451   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.smallrye-context-propagation-2.1.2.jar as lib/main/io.smallrye.smallrye-context-propagation-2.1.2.jar
2026-09-10T15:19:51.2062431Z I0910 12:19:51.206025   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.smallrye-context-propagation-api-2.1.2.jar as lib/main/io.smallrye.smallrye-context-propagation-api-2.1.2.jar
2026-09-10T15:19:51.2065245Z I0910 12:19:51.206278   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.smallrye-context-propagation-jta-2.1.2.jar as lib/main/io.smallrye.smallrye-context-propagation-jta-2.1.2.jar
2026-09-10T15:19:51.2075686Z I0910 12:19:51.207289   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.smallrye-context-propagation-storage-2.1.2.jar as lib/main/io.smallrye.smallrye-context-propagation-storage-2.1.2.jar
2026-09-10T15:19:51.2076786Z I0910 12:19:51.207572   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.smallrye-fault-tolerance-vertx-6.4.3.jar as lib/main/io.smallrye.smallrye-fault-tolerance-vertx-6.4.3.jar
2026-09-10T15:19:51.2078535Z I0910 12:19:51.207765   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.smallrye-health-4.1.0.jar as lib/main/io.smallrye.smallrye-health-4.1.0.jar
2026-09-10T15:19:51.2087104Z I0910 12:19:51.208594   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.smallrye-health-api-4.1.0.jar as lib/main/io.smallrye.smallrye-health-api-4.1.0.jar
2026-09-10T15:19:51.2095927Z I0910 12:19:51.209473   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.smallrye-health-provided-checks-4.1.0.jar as lib/main/io.smallrye.smallrye-health-provided-checks-4.1.0.jar
2026-09-10T15:19:51.2104224Z I0910 12:19:51.210277   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.smallrye-jwt-4.5.3.jar as lib/main/io.smallrye.smallrye-jwt-4.5.3.jar
2026-09-10T15:19:51.2163205Z I0910 12:19:51.215989   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.smallrye-jwt-build-4.5.3.jar as lib/main/io.smallrye.smallrye-jwt-build-4.5.3.jar
2026-09-10T15:19:51.2179173Z I0910 12:19:51.217714   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.smallrye-jwt-common-4.5.3.jar as lib/main/io.smallrye.smallrye-jwt-common-4.5.3.jar
2026-09-10T15:19:51.2190118Z I0910 12:19:51.218869   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.smallrye-metrics-4.0.0.jar as lib/main/io.smallrye.smallrye-metrics-4.0.0.jar
2026-09-10T15:19:51.2272288Z I0910 12:19:51.226940   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.smallrye.smallrye-open-api-core-3.10.0.jar as lib/main/io.smallrye.smallrye-open-api-core-3.10.0.jar
2026-09-10T15:19:51.2522084Z I0910 12:19:51.251848   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.vertx.vertx-auth-common-4.5.14.jar as lib/main/io.vertx.vertx-auth-common-4.5.14.jar
2026-09-10T15:19:51.2590322Z I0910 12:19:51.258715   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.vertx.vertx-bridge-common-4.5.14.jar as lib/main/io.vertx.vertx-bridge-common-4.5.14.jar
2026-09-10T15:19:51.2590991Z I0910 12:19:51.258970   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.vertx.vertx-codegen-4.5.14.jar as lib/main/io.vertx.vertx-codegen-4.5.14.jar
2026-09-10T15:19:51.2696553Z I0910 12:19:51.269309   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.vertx.vertx-core-4.5.14.jar as lib/main/io.vertx.vertx-core-4.5.14.jar
2026-09-10T15:19:51.3491729Z I0910 12:19:51.348826   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.vertx.vertx-uri-template-4.5.14.jar as lib/main/io.vertx.vertx-uri-template-4.5.14.jar
2026-09-10T15:19:51.3513083Z I0910 12:19:51.351023   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.vertx.vertx-web-4.5.14.jar as lib/main/io.vertx.vertx-web-4.5.14.jar
2026-09-10T15:19:51.3679204Z I0910 12:19:51.367504   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.vertx.vertx-web-client-4.5.14.jar as lib/main/io.vertx.vertx-web-client-4.5.14.jar
2026-09-10T15:19:51.3725447Z I0910 12:19:51.372238   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/io.vertx.vertx-web-common-4.5.14.jar as lib/main/io.vertx.vertx-web-common-4.5.14.jar
2026-09-10T15:19:51.3741046Z I0910 12:19:51.373888   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/jakarta.activation.jakarta.activation-api-2.1.3.jar as lib/main/jakarta.activation.jakarta.activation-api-2.1.3.jar
2026-09-10T15:19:51.3785674Z I0910 12:19:51.378366   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/jakarta.annotation.jakarta.annotation-api-3.0.0.jar as lib/main/jakarta.annotation.jakarta.annotation-api-3.0.0.jar
2026-09-10T15:19:51.3794792Z I0910 12:19:51.379280   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/jakarta.el.jakarta.el-api-5.0.1.jar as lib/main/jakarta.el.jakarta.el-api-5.0.1.jar
2026-09-10T15:19:51.3844505Z I0910 12:19:51.384149   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/jakarta.enterprise.jakarta.enterprise.cdi-api-4.1.0.jar as lib/main/jakarta.enterprise.jakarta.enterprise.cdi-api-4.1.0.jar
2026-09-10T15:19:51.3911523Z I0910 12:19:51.390796   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/jakarta.enterprise.jakarta.enterprise.lang-model-4.1.0.jar as lib/main/jakarta.enterprise.jakarta.enterprise.lang-model-4.1.0.jar
2026-09-10T15:19:51.3918101Z I0910 12:19:51.391369   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/jakarta.inject.jakarta.inject-api-2.0.1.jar as lib/main/jakarta.inject.jakarta.inject-api-2.0.1.jar
2026-09-10T15:19:51.3938324Z I0910 12:19:51.393622   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/jakarta.interceptor.jakarta.interceptor-api-2.2.0.jar as lib/main/jakarta.interceptor.jakarta.interceptor-api-2.2.0.jar
2026-09-10T15:19:51.3949255Z I0910 12:19:51.394777   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/jakarta.json.jakarta.json-api-2.1.3.jar as lib/main/jakarta.json.jakarta.json-api-2.1.3.jar
2026-09-10T15:19:51.3959671Z I0910 12:19:51.395836   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/jakarta.persistence.jakarta.persistence-api-3.1.0.jar as lib/main/jakarta.persistence.jakarta.persistence-api-3.1.0.jar
2026-09-10T15:19:51.4051597Z I0910 12:19:51.404793   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/jakarta.resource.jakarta.resource-api-2.1.0.jar as lib/main/jakarta.resource.jakarta.resource-api-2.1.0.jar
2026-09-10T15:19:51.4068990Z I0910 12:19:51.406706   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/jakarta.servlet.jakarta.servlet-api-6.0.0.jar as lib/main/jakarta.servlet.jakarta.servlet-api-6.0.0.jar
2026-09-10T15:19:51.4241958Z I0910 12:19:51.423831   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/jakarta.transaction.jakarta.transaction-api-2.0.1.jar as lib/main/jakarta.transaction.jakarta.transaction-api-2.0.1.jar
2026-09-10T15:19:51.4250251Z I0910 12:19:51.424883   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/jakarta.validation.jakarta.validation-api-3.0.2.jar as lib/main/jakarta.validation.jakarta.validation-api-3.0.2.jar
2026-09-10T15:19:51.4292004Z I0910 12:19:51.428927   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/jakarta.ws.rs.jakarta.ws.rs-api-3.1.0.jar as lib/main/jakarta.ws.rs.jakarta.ws.rs-api-3.1.0.jar
2026-09-10T15:19:51.4381966Z I0910 12:19:51.437853   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/jakarta.xml.bind.jakarta.xml.bind-api-4.0.2.jar as lib/main/jakarta.xml.bind.jakarta.xml.bind-api-4.0.2.jar
2026-09-10T15:19:51.4441915Z I0910 12:19:51.443907   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/net.bytebuddy.byte-buddy-1.15.11.jar as lib/main/net.bytebuddy.byte-buddy-1.15.11.jar
2026-09-10T15:19:51.8162888Z I0910 12:19:51.815869   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.antlr.antlr4-runtime-4.13.0.jar as lib/main/org.antlr.antlr4-runtime-4.13.0.jar
2026-09-10T15:19:51.8314127Z I0910 12:19:51.830979   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.apache.commons.commons-lang3-3.14.0.jar as lib/main/org.apache.commons.commons-lang3-3.14.0.jar
2026-09-10T15:19:51.8597565Z I0910 12:19:51.859378   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.bitbucket.b_c.jose4j-0.9.6.jar as lib/main/org.bitbucket.b_c.jose4j-0.9.6.jar
2026-09-10T15:19:51.8731396Z I0910 12:19:51.872802   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.eclipse.angus.angus-activation-2.0.2.jar as lib/main/org.eclipse.angus.angus-activation-2.0.2.jar
2026-09-10T15:19:51.8731950Z I0910 12:19:51.872991   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.eclipse.microprofile.config.microprofile-config-api-3.1.jar as lib/main/org.eclipse.microprofile.config.microprofile-config-api-3.1.jar
2026-09-10T15:19:51.8748971Z I0910 12:19:51.874702   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.eclipse.microprofile.context-propagation.microprofile-context-propagation-api-1.3.jar as lib/main/org.eclipse.microprofile.context-propagation.microprofile-context-propagation-api-1.3.jar
2026-09-10T15:19:51.8752482Z I0910 12:19:51.875071   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.eclipse.microprofile.health.microprofile-health-api-4.0.1.jar as lib/main/org.eclipse.microprofile.health.microprofile-health-api-4.0.1.jar
2026-09-10T15:19:51.8761303Z I0910 12:19:51.875959   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.eclipse.microprofile.jwt.microprofile-jwt-auth-api-2.1.jar as lib/main/org.eclipse.microprofile.jwt.microprofile-jwt-auth-api-2.1.jar
2026-09-10T15:19:51.8773504Z I0910 12:19:51.877140   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.eclipse.microprofile.metrics.microprofile-metrics-api-4.0.1.jar as lib/main/org.eclipse.microprofile.metrics.microprofile-metrics-api-4.0.1.jar
2026-09-10T15:19:51.8792299Z I0910 12:19:51.879109   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.eclipse.microprofile.openapi.microprofile-openapi-api-3.1.1.jar as lib/main/org.eclipse.microprofile.openapi.microprofile-openapi-api-3.1.1.jar
2026-09-10T15:19:51.8834993Z I0910 12:19:51.883273   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.eclipse.microprofile.reactive-streams-operators.microprofile-reactive-streams-operators-api-3.0.1.jar as lib/main/org.eclipse.microprofile.reactive-streams-operators.microprofile-reactive-streams-operators-api-3.0.1.jar
2026-09-10T15:19:51.8851206Z I0910 12:19:51.884999   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.eclipse.parsson.parsson-1.1.7.jar as lib/main/org.eclipse.parsson.parsson-1.1.7.jar
2026-09-10T15:19:51.8904481Z I0910 12:19:51.890179   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.glassfish.expressly.expressly-5.0.0.jar as lib/main/org.glassfish.expressly.expressly-5.0.0.jar
2026-09-10T15:19:51.9013213Z I0910 12:19:51.900842   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.glassfish.jaxb.codemodel-4.0.3.jar as lib/main/org.glassfish.jaxb.codemodel-4.0.3.jar
2026-09-10T15:19:51.9110323Z I0910 12:19:51.910548   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.glassfish.jaxb.jaxb-core-4.0.5.jar as lib/main/org.glassfish.jaxb.jaxb-core-4.0.5.jar
2026-09-10T15:19:51.9187840Z I0910 12:19:51.918443   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.glassfish.jaxb.jaxb-jxc-4.0.3.jar as lib/main/org.glassfish.jaxb.jaxb-jxc-4.0.3.jar
2026-09-10T15:19:51.9235499Z I0910 12:19:51.923200   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.glassfish.jaxb.jaxb-runtime-4.0.5.jar as lib/main/org.glassfish.jaxb.jaxb-runtime-4.0.5.jar
2026-09-10T15:19:51.9621225Z I0910 12:19:51.961698   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.glassfish.jaxb.jaxb-xjc-4.0.3.jar as lib/main/org.glassfish.jaxb.jaxb-xjc-4.0.3.jar
2026-09-10T15:19:52.0036227Z I0910 12:19:52.003173   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.glassfish.jaxb.txw2-4.0.5.jar as lib/main/org.glassfish.jaxb.txw2-4.0.5.jar
2026-09-10T15:19:52.0072909Z I0910 12:19:52.006941   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.glassfish.jaxb.xsom-4.0.3.jar as lib/main/org.glassfish.jaxb.xsom-4.0.3.jar
2026-09-10T15:19:52.0280465Z I0910 12:19:52.027603   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.hibernate.common.hibernate-commons-annotations-7.0.3.Final.jar as lib/main/org.hibernate.common.hibernate-commons-annotations-7.0.3.Final.jar
2026-09-10T15:19:52.0314694Z I0910 12:19:52.031107   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.hibernate.orm.hibernate-core-6.6.13.Final.jar as lib/main/org.hibernate.orm.hibernate-core-6.6.13.Final.jar
2026-09-10T15:19:52.5352406Z I0910 12:19:52.534800   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.hibernate.orm.hibernate-graalvm-6.6.13.Final.jar as lib/main/org.hibernate.orm.hibernate-graalvm-6.6.13.Final.jar
2026-09-10T15:19:52.5352938Z I0910 12:19:52.535070   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.hibernate.quarkus-local-cache-0.3.1.jar as lib/main/org.hibernate.quarkus-local-cache-0.3.1.jar
2026-09-10T15:19:52.5382278Z I0910 12:19:52.538014   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.hibernate.validator.hibernate-validator-8.0.2.Final.jar as lib/main/org.hibernate.validator.hibernate-validator-8.0.2.Final.jar
2026-09-10T15:19:52.5927445Z I0910 12:19:52.592364   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.jboss.invocation.jboss-invocation-2.0.0.Final.jar as lib/main/org.jboss.invocation.jboss-invocation-2.0.0.Final.jar
2026-09-10T15:19:52.5963123Z I0910 12:19:52.595992   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.jboss.jboss-transaction-spi-8.0.0.Final.jar as lib/main/org.jboss.jboss-transaction-spi-8.0.0.Final.jar
2026-09-10T15:19:52.5972062Z I0910 12:19:52.596903   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.jboss.logging.jboss-logging-annotations-3.0.1.Final.jar as lib/main/org.jboss.logging.jboss-logging-annotations-3.0.1.Final.jar
2026-09-10T15:19:52.5981238Z I0910 12:19:52.597942   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.jboss.narayana.jta.narayana-jta-7.0.2.Final.jar as lib/main/org.jboss.narayana.jta.narayana-jta-7.0.2.Final.jar
2026-09-10T15:19:52.6408763Z I0910 12:19:52.640443   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.jboss.narayana.jts.narayana-jts-integration-7.0.2.Final.jar as lib/main/org.jboss.narayana.jts.narayana-jts-integration-7.0.2.Final.jar
2026-09-10T15:19:52.6426435Z I0910 12:19:52.642513   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.jboss.resteasy.microprofile.microprofile-config-2.1.5.Final.jar as lib/main/org.jboss.resteasy.microprofile.microprofile-config-2.1.5.Final.jar
2026-09-10T15:19:52.6437316Z I0910 12:19:52.643567   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.jboss.resteasy.resteasy-cdi-6.2.9.Final.jar as lib/main/org.jboss.resteasy.resteasy-cdi-6.2.9.Final.jar
2026-09-10T15:19:52.6454416Z I0910 12:19:52.645175   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.jboss.resteasy.resteasy-core-6.2.9.Final.jar as lib/main/org.jboss.resteasy.resteasy-core-6.2.9.Final.jar
2026-09-10T15:19:52.6783212Z I0910 12:19:52.677964   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.jboss.resteasy.resteasy-core-spi-6.2.9.Final.jar as lib/main/org.jboss.resteasy.resteasy-core-spi-6.2.9.Final.jar
2026-09-10T15:19:52.6888048Z I0910 12:19:52.688485   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.jboss.resteasy.resteasy-jackson2-provider-6.2.9.Final.jar as lib/main/org.jboss.resteasy.resteasy-jackson2-provider-6.2.9.Final.jar
2026-09-10T15:19:52.6888632Z I0910 12:19:52.688762   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.jboss.resteasy.resteasy-jaxb-provider-6.2.9.Final.jar as lib/main/org.jboss.resteasy.resteasy-jaxb-provider-6.2.9.Final.jar
2026-09-10T15:19:52.6938418Z I0910 12:19:52.693632   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.jboss.resteasy.resteasy-links-6.2.9.Final.jar as lib/main/org.jboss.resteasy.resteasy-links-6.2.9.Final.jar
2026-09-10T15:19:52.6957151Z I0910 12:19:52.695582   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.jboss.slf4j.slf4j-jboss-logmanager-2.0.0.Final.jar as lib/main/org.jboss.slf4j.slf4j-jboss-logmanager-2.0.0.Final.jar
2026-09-10T15:19:52.6960096Z I0910 12:19:52.695864   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.jboss.threads.jboss-threads-3.6.1.Final.jar as lib/main/org.jboss.threads.jboss-threads-3.6.1.Final.jar
2026-09-10T15:19:52.7021688Z I0910 12:19:52.701891   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.jctools.jctools-core-4.0.5.jar as lib/main/org.jctools.jctools-core-4.0.5.jar
2026-09-10T15:19:52.7215409Z I0910 12:19:52.721213   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.reactivestreams.reactive-streams-1.0.4.jar as lib/main/org.reactivestreams.reactive-streams-1.0.4.jar
2026-09-10T15:19:52.7215936Z I0910 12:19:52.721352   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.slf4j.slf4j-api-2.0.6.jar as lib/main/org.slf4j.slf4j-api-2.0.6.jar
2026-09-10T15:19:52.7240674Z I0910 12:19:52.723898   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.wildfly.common.wildfly-common-1.7.0.Final.jar as lib/main/org.wildfly.common.wildfly-common-1.7.0.Final.jar
2026-09-10T15:19:52.7361172Z I0910 12:19:52.734915   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/lib/main/org.yaml.snakeyaml-2.2.jar as lib/main/org.yaml.snakeyaml-2.2.jar
2026-09-10T15:19:52.7477634Z I0910 12:19:52.747335   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/quarkus as quarkus
2026-09-10T15:19:52.7478031Z I0910 12:19:52.747513   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/quarkus/generated-bytecode.jar as quarkus/generated-bytecode.jar
2026-09-10T15:19:52.7832603Z I0910 12:19:52.782926   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/quarkus/quarkus-application.dat as quarkus/quarkus-application.dat
2026-09-10T15:19:52.7864094Z I0910 12:19:52.786286   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/quarkus/transformed-bytecode.jar as quarkus/transformed-bytecode.jar
2026-09-10T15:19:52.7929160Z I0910 12:19:52.792722   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/quarkus-app-dependencies.txt as quarkus-app-dependencies.txt
2026-09-10T15:19:52.7933127Z I0910 12:19:52.793211   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/quarkus-run.jar as quarkus-run.jar
2026-09-10T15:19:52.7937714Z I0910 12:19:52.793530   67969 tar.go:336] Adding to tar: /opt/ads-agent/_work/36/a/sispl-consulta-transacao-20260910-1218-1-0-0-SNAPSHOT.zip as sispl-consulta-transacao-20260910-1218-1-0-0-SNAPSHOT.zip
2026-09-10T15:19:54.0876802Z 
2026-09-10T15:19:54.0877402Z Uploading finished
2026-09-10T15:19:54.0878855Z build.build.openshift.io/sispl-consulta-transacao-30 started
2026-09-10T15:19:54.1192955Z Adding cluster TLS certificate authority to trust store
2026-09-10T15:19:54.1193543Z Receiving source from STDIN as archive ...
2026-09-10T15:19:55.2934392Z Adding cluster TLS certificate authority to trust store
2026-09-10T15:19:56.3035697Z Adding cluster TLS certificate authority to trust store
2026-09-10T15:19:56.3036638Z time="2026-09-10T15:19:56Z" level=info msg="Not using native diff for overlay, this may cause degraded performance for building images: kernel has CONFIG_OVERLAY_FS_REDIRECT_DIR enabled"
2026-09-10T15:19:56.3037041Z I0910 15:19:56.219022       1 defaults.go:102] Defaulting to storage driver "overlay" with options [mountopt=metacopy=on].
2026-09-10T15:19:56.4085634Z Caching blobs under "/var/cache/blobs".
2026-09-10T15:19:56.4086870Z Trying to pull image-registry.openshift-image-registry.svc:5000/openshift/quarkus-java-binary-s2i@sha256:c14dd0ad9ae18713c127b5f98c9b2f2a4d85ce5215bc6e659432b7c112e6ef25...
2026-09-10T15:19:56.6243114Z Getting image source signatures
2026-09-10T15:19:56.7283170Z Copying blob sha256:e1c363c96d760cb85e197cc8e2ab950760067935b29e7c098ae51ed371f5b0cd
2026-09-10T15:19:56.7838392Z Copying blob sha256:0a9a2db04f3ebe8121912deecd1a66d98a4ff35c7a3ee57e3eeffcb667119be1
2026-09-10T15:19:56.7996828Z Copying blob sha256:24dafab7f594e7a2b9e71b74932f6f72d2e31ac8f84fbd5062d173e63637b237
2026-09-10T15:19:56.8746974Z Copying blob sha256:c98bbacb82bbf386496c2e0ef89b288bc8782dd9ae664dddcb285cf0965ba7f2
2026-09-10T15:19:56.9164022Z Copying blob sha256:7f24bdb73d536337c7d82dee9c11e09acd3bacb0e1a76e98c6e82a8208e82284
2026-09-10T15:19:56.9164620Z Copying blob sha256:264aaa453271eaaf6bc92b521f62e38cbda4f01e1a3fbf50abdb8b466be58a64
2026-09-10T15:19:57.4125841Z Copying blob sha256:586ae232f6757fb4248eda7dca86bf361d076242d052ee30965fec2eb1ea5a1c
2026-09-10T15:19:57.4758483Z Copying blob sha256:62d739cb3ca9a7f2a63e12f99c516e6432170af671b061195e6eafa7e864d6a2
2026-09-10T15:19:57.4930511Z Copying blob sha256:067039afffe5f5aa56bc578e5d9256b8b0055763a32c54a38a73b969a8fd4f13
2026-09-10T15:19:57.5589776Z Copying blob sha256:4e0cd4f607fede7693f7eb61b31b84c051e5897ce5a096534ed90dc4808e5523
2026-09-10T15:19:57.7660172Z Copying blob sha256:9d5b85cf24e32083e165099afcc1bd9cc0a57a764f9077301e686e2d27f0eb2c
2026-09-10T15:19:57.8160547Z Copying blob sha256:7749ffa7020405743e3e0425d93720455a83619d343e217645f48f948260ab49
2026-09-10T15:19:58.0243418Z Copying blob sha256:da2064a8b4a27db53f236c51c89c049f993c4438da41f6c80cb24242776bf1da
2026-09-10T15:20:14.2718326Z Copying config sha256:db5724295b3ca3bdc954cddb4ae13f779ef6dc185fa6fa797276b78493e1b0b2
2026-09-10T15:20:14.3973521Z Writing manifest to image destination
2026-09-10T15:20:14.4290282Z Storing signatures
2026-09-10T15:20:32.8536544Z Generating dockerfile with builder image image-registry.openshift-image-registry.svc:5000/openshift/quarkus-java-binary-s2i@sha256:c14dd0ad9ae18713c127b5f98c9b2f2a4d85ce5215bc6e659432b7c112e6ef25
2026-09-10T15:20:33.0947907Z STEP 1/9: FROM image-registry.openshift-image-registry.svc:5000/openshift/quarkus-java-binary-s2i@sha256:c14dd0ad9ae18713c127b5f98c9b2f2a4d85ce5215bc6e659432b7c112e6ef25
2026-09-10T15:20:33.1425413Z STEP 2/9: LABEL "io.openshift.build.source-location"="/tmp/build/inputs"       "io.openshift.build.image"="image-registry.openshift-image-registry.svc:5000/openshift/quarkus-java-binary-s2i@sha256:c14dd0ad9ae18713c127b5f98c9b2f2a4d85ce5215bc6e659432b7c112e6ef25"
2026-09-10T15:20:33.2035587Z STEP 3/9: ENV OPENSHIFT_BUILD_NAME="sispl-consulta-transacao-30"     OPENSHIFT_BUILD_NAMESPACE="build-images-ads"
2026-09-10T15:20:33.2281472Z STEP 4/9: USER root
2026-09-10T15:20:33.2663310Z STEP 5/9: COPY upload/src /tmp/src
2026-09-10T15:20:34.2816173Z STEP 6/9: RUN chown -R 1001:0 /tmp/src
2026-09-10T15:20:34.7059997Z STEP 7/9: USER 1001
2026-09-10T15:20:34.7312285Z STEP 8/9: RUN /usr/local/s2i/assemble
2026-09-10T15:20:35.1106140Z Copying all WAR and EAR artifacts from /tmp/src directory into /deployments for later deployment...
2026-09-10T15:20:35.1106377Z + LOCAL_SOURCE_DIR=/tmp/src
2026-09-10T15:20:35.1106487Z + DEPLOY_DIR=/deployments
2026-09-10T15:20:35.1110191Z + copy_artifacts deployments
2026-09-10T15:20:35.1110681Z + '[' -d /tmp/src ']'
2026-09-10T15:20:35.1110933Z + echo 'Copying all WAR and EAR artifacts from /tmp/src directory into /deployments for later deployment...'
2026-09-10T15:20:35.1111344Z + cp -rfv '/tmp/src/*-runner.jar' /tmp/src/quarkus-run.jar /tmp/src/app /tmp/src/lib /tmp/src/quarkus /tmp/src/quarkus-app-dependencies.txt /tmp/src/quarkus-run.jar /tmp/src/sispl-consulta-transacao-20260910-1218-1-0-0-SNAPSHOT.zip /deployments
2026-09-10T15:20:35.1128411Z '/tmp/src/quarkus-run.jar' -> '/deployments/quarkus-run.jar'
2026-09-10T15:20:35.1128706Z '/tmp/src/app' -> '/deployments/app'
2026-09-10T15:20:35.1128976Z '/tmp/src/app/sispl-consulta-transacao-1.0.0-SNAPSHOT.jar' -> '/deployments/app/sispl-consulta-transacao-1.0.0-SNAPSHOT.jar'
2026-09-10T15:20:35.1129197Z '/tmp/src/lib' -> '/deployments/lib'
2026-09-10T15:20:35.1129370Z '/tmp/src/lib/boot' -> '/deployments/lib/boot'
2026-09-10T15:20:35.1129618Z '/tmp/src/lib/boot/io.github.crac.org-crac-0.1.3.jar' -> '/deployments/lib/boot/io.github.crac.org-crac-0.1.3.jar'
2026-09-10T15:20:35.1129932Z '/tmp/src/lib/boot/io.quarkus.quarkus-bootstrap-runner-3.15.5.jar' -> '/deployments/lib/boot/io.quarkus.quarkus-bootstrap-runner-3.15.5.jar'
2026-09-10T15:20:35.1131181Z '/tmp/src/lib/boot/io.quarkus.quarkus-classloader-commons-3.15.5.jar' -> '/deployments/lib/boot/io.quarkus.quarkus-classloader-commons-3.15.5.jar'
2026-09-10T15:20:35.1131681Z '/tmp/src/lib/boot/io.quarkus.quarkus-development-mode-spi-3.15.5.jar' -> '/deployments/lib/boot/io.quarkus.quarkus-development-mode-spi-3.15.5.jar'
2026-09-10T15:20:35.1132356Z '/tmp/src/lib/boot/io.quarkus.quarkus-vertx-latebound-mdc-provider-3.15.5.jar' -> '/deployments/lib/boot/io.quarkus.quarkus-vertx-latebound-mdc-provider-3.15.5.jar'
2026-09-10T15:20:35.1132764Z '/tmp/src/lib/boot/io.smallrye.common.smallrye-common-constraint-2.6.1.jar' -> '/deployments/lib/boot/io.smallrye.common.smallrye-common-constraint-2.6.1.jar'
2026-09-10T15:20:35.1133108Z '/tmp/src/lib/boot/io.smallrye.common.smallrye-common-cpu-2.6.1.jar' -> '/deployments/lib/boot/io.smallrye.common.smallrye-common-cpu-2.6.1.jar'
2026-09-10T15:20:35.1133452Z '/tmp/src/lib/boot/io.smallrye.common.smallrye-common-expression-2.6.1.jar' -> '/deployments/lib/boot/io.smallrye.common.smallrye-common-expression-2.6.1.jar'
2026-09-10T15:20:35.1133791Z '/tmp/src/lib/boot/io.smallrye.common.smallrye-common-function-2.6.1.jar' -> '/deployments/lib/boot/io.smallrye.common.smallrye-common-function-2.6.1.jar'
2026-09-10T15:20:35.1134118Z '/tmp/src/lib/boot/io.smallrye.common.smallrye-common-io-2.6.1.jar' -> '/deployments/lib/boot/io.smallrye.common.smallrye-common-io-2.6.1.jar'
2026-09-10T15:20:35.1134517Z '/tmp/src/lib/boot/io.smallrye.common.smallrye-common-net-2.6.1.jar' -> '/deployments/lib/boot/io.smallrye.common.smallrye-common-net-2.6.1.jar'
2026-09-10T15:20:35.1134834Z '/tmp/src/lib/boot/io.smallrye.common.smallrye-common-os-2.6.1.jar' -> '/deployments/lib/boot/io.smallrye.common.smallrye-common-os-2.6.1.jar'
2026-09-10T15:20:35.1135140Z '/tmp/src/lib/boot/io.smallrye.common.smallrye-common-ref-2.6.1.jar' -> '/deployments/lib/boot/io.smallrye.common.smallrye-common-ref-2.6.1.jar'
2026-09-10T15:20:35.1135442Z '/tmp/src/lib/boot/org.jboss.logging.jboss-logging-3.6.0.Final.jar' -> '/deployments/lib/boot/org.jboss.logging.jboss-logging-3.6.0.Final.jar'
2026-09-10T15:20:35.1135772Z '/tmp/src/lib/boot/org.jboss.logmanager.jboss-logmanager-3.1.1.Final.jar' -> '/deployments/lib/boot/org.jboss.logmanager.jboss-logmanager-3.1.1.Final.jar'
2026-09-10T15:20:35.1136000Z '/tmp/src/lib/main' -> '/deployments/lib/main'
2026-09-10T15:20:35.1136254Z '/tmp/src/lib/main/br.gov.caixa.caixa-dominio-1.0.0.4.jar' -> '/deployments/lib/main/br.gov.caixa.caixa-dominio-1.0.0.4.jar'
2026-09-10T15:20:35.1136558Z '/tmp/src/lib/main/br.gov.caixa.caixa-negocio-infra-1.0.0.4.jar' -> '/deployments/lib/main/br.gov.caixa.caixa-negocio-infra-1.0.0.4.jar'
2026-09-10T15:20:35.1137040Z '/tmp/src/lib/main/br.gov.caixa.caixa-util-1.0.0.4.jar' -> '/deployments/lib/main/br.gov.caixa.caixa-util-1.0.0.4.jar'
2026-09-10T15:20:35.1137429Z '/tmp/src/lib/main/br.gov.caixa.loterias.api.loterias-api-commons-1.0.6.jar' -> '/deployments/lib/main/br.gov.caixa.loterias.api.loterias-api-commons-1.0.6.jar'
2026-09-10T15:20:35.1137741Z '/tmp/src/lib/main/com.aayushatharva.brotli4j.brotli4j-1.16.0.jar' -> '/deployments/lib/main/com.aayushatharva.brotli4j.brotli4j-1.16.0.jar'
2026-09-10T15:20:35.1138073Z '/tmp/src/lib/main/com.aayushatharva.brotli4j.native-linux-x86_64-1.16.0.jar' -> '/deployments/lib/main/com.aayushatharva.brotli4j.native-linux-x86_64-1.16.0.jar'
2026-09-10T15:20:35.1138391Z '/tmp/src/lib/main/com.aayushatharva.brotli4j.service-1.16.0.jar' -> '/deployments/lib/main/com.aayushatharva.brotli4j.service-1.16.0.jar'
2026-09-10T15:20:35.1138677Z '/tmp/src/lib/main/com.fasterxml.classmate-1.7.0.jar' -> '/deployments/lib/main/com.fasterxml.classmate-1.7.0.jar'
2026-09-10T15:20:35.1138989Z '/tmp/src/lib/main/com.fasterxml.jackson.core.jackson-annotations-2.17.2.jar' -> '/deployments/lib/main/com.fasterxml.jackson.core.jackson-annotations-2.17.2.jar'
2026-09-10T15:20:35.1139371Z '/tmp/src/lib/main/com.fasterxml.jackson.core.jackson-core-2.17.2.jar' -> '/deployments/lib/main/com.fasterxml.jackson.core.jackson-core-2.17.2.jar'
2026-09-10T15:20:35.1190582Z '/tmp/src/lib/main/com.fasterxml.jackson.core.jackson-databind-2.17.2.jar' -> '/deployments/lib/main/com.fasterxml.jackson.core.jackson-databind-2.17.2.jar'
2026-09-10T15:20:35.1191029Z '/tmp/src/lib/main/com.fasterxml.jackson.dataformat.jackson-dataformat-yaml-2.17.2.jar' -> '/deployments/lib/main/com.fasterxml.jackson.dataformat.jackson-dataformat-yaml-2.17.2.jar'
2026-09-10T15:20:35.1191401Z '/tmp/src/lib/main/com.fasterxml.jackson.datatype.jackson-datatype-jdk8-2.17.2.jar' -> '/deployments/lib/main/com.fasterxml.jackson.datatype.jackson-datatype-jdk8-2.17.2.jar'
2026-09-10T15:20:35.1191765Z '/tmp/src/lib/main/com.fasterxml.jackson.datatype.jackson-datatype-jsr310-2.17.2.jar' -> '/deployments/lib/main/com.fasterxml.jackson.datatype.jackson-datatype-jsr310-2.17.2.jar'
2026-09-10T15:20:35.1192136Z '/tmp/src/lib/main/com.fasterxml.jackson.jakarta.rs.jackson-jakarta-rs-base-2.17.2.jar' -> '/deployments/lib/main/com.fasterxml.jackson.jakarta.rs.jackson-jakarta-rs-base-2.17.2.jar'
2026-09-10T15:20:35.1192512Z '/tmp/src/lib/main/com.fasterxml.jackson.jakarta.rs.jackson-jakarta-rs-json-provider-2.17.2.jar' -> '/deployments/lib/main/com.fasterxml.jackson.jakarta.rs.jackson-jakarta-rs-json-provider-2.17.2.jar'
2026-09-10T15:20:35.1192918Z '/tmp/src/lib/main/com.fasterxml.jackson.module.jackson-module-jakarta-xmlbind-annotations-2.17.2.jar' -> '/deployments/lib/main/com.fasterxml.jackson.module.jackson-module-jakarta-xmlbind-annotations-2.17.2.jar'
2026-09-10T15:20:35.1193313Z '/tmp/src/lib/main/com.fasterxml.jackson.module.jackson-module-parameter-names-2.17.2.jar' -> '/deployments/lib/main/com.fasterxml.jackson.module.jackson-module-parameter-names-2.17.2.jar'
2026-09-10T15:20:35.1193658Z '/tmp/src/lib/main/com.github.ben-manes.caffeine.caffeine-3.1.5.jar' -> '/deployments/lib/main/com.github.ben-manes.caffeine.caffeine-3.1.5.jar'
2026-09-10T15:20:35.1193953Z '/tmp/src/lib/main/com.github.java-json-tools.btf-1.3.jar' -> '/deployments/lib/main/com.github.java-json-tools.btf-1.3.jar'
2026-09-10T15:20:35.1194429Z '/tmp/src/lib/main/com.github.java-json-tools.jackson-coreutils-2.0.jar' -> '/deployments/lib/main/com.github.java-json-tools.jackson-coreutils-2.0.jar'
2026-09-10T15:20:35.1194766Z '/tmp/src/lib/main/com.github.java-json-tools.json-patch-1.13.jar' -> '/deployments/lib/main/com.github.java-json-tools.json-patch-1.13.jar'
2026-09-10T15:20:35.1195069Z '/tmp/src/lib/main/com.github.java-json-tools.msg-simple-1.2.jar' -> '/deployments/lib/main/com.github.java-json-tools.msg-simple-1.2.jar'
2026-09-10T15:20:35.1195573Z '/tmp/src/lib/main/com.google.errorprone.error_prone_annotations-2.30.0.jar' -> '/deployments/lib/main/com.google.errorprone.error_prone_annotations-2.30.0.jar'
2026-09-10T15:20:35.1195868Z '/tmp/src/lib/main/com.ibm.async.asyncutil-0.1.0.jar' -> '/deployments/lib/main/com.ibm.async.asyncutil-0.1.0.jar'
2026-09-10T15:20:35.1196425Z '/tmp/src/lib/main/com.ibm.db2.db2jcc_license_cisuz-4.jar' -> '/deployments/lib/main/com.ibm.db2.db2jcc_license_cisuz-4.jar'
2026-09-10T15:20:35.1196704Z '/tmp/src/lib/main/com.ibm.db2.jcc-11.5.8.0.jar' -> '/deployments/lib/main/com.ibm.db2.jcc-11.5.8.0.jar'
2026-09-10T15:20:35.1196995Z '/tmp/src/lib/main/com.sun.istack.istack-commons-runtime-4.1.2.jar' -> '/deployments/lib/main/com.sun.istack.istack-commons-runtime-4.1.2.jar'
2026-09-10T15:20:35.1197314Z '/tmp/src/lib/main/com.sun.istack.istack-commons-tools-4.1.2.jar' -> '/deployments/lib/main/com.sun.istack.istack-commons-tools-4.1.2.jar'
2026-09-10T15:20:35.1197631Z '/tmp/src/lib/main/com.sun.xml.bind.external.relaxng-datatype-4.0.3.jar' -> '/deployments/lib/main/com.sun.xml.bind.external.relaxng-datatype-4.0.3.jar'
2026-09-10T15:20:35.1197938Z '/tmp/src/lib/main/com.sun.xml.bind.external.rngom-4.0.3.jar' -> '/deployments/lib/main/com.sun.xml.bind.external.rngom-4.0.3.jar'
2026-09-10T15:20:35.1198208Z '/tmp/src/lib/main/io.agroal.agroal-api-2.6.jar' -> '/deployments/lib/main/io.agroal.agroal-api-2.6.jar'
2026-09-10T15:20:35.1198459Z '/tmp/src/lib/main/io.agroal.agroal-narayana-2.6.jar' -> '/deployments/lib/main/io.agroal.agroal-narayana-2.6.jar'
2026-09-10T15:20:35.1198717Z '/tmp/src/lib/main/io.agroal.agroal-pool-2.6.jar' -> '/deployments/lib/main/io.agroal.agroal-pool-2.6.jar'
2026-09-10T15:20:35.1199047Z '/tmp/src/lib/main/io.netty.netty-buffer-4.1.119.Final.jar' -> '/deployments/lib/main/io.netty.netty-buffer-4.1.119.Final.jar'
2026-09-10T15:20:35.1199337Z '/tmp/src/lib/main/io.netty.netty-codec-4.1.119.Final.jar' -> '/deployments/lib/main/io.netty.netty-codec-4.1.119.Final.jar'
2026-09-10T15:20:35.1199698Z '/tmp/src/lib/main/io.netty.netty-codec-dns-4.1.119.Final.jar' -> '/deployments/lib/main/io.netty.netty-codec-dns-4.1.119.Final.jar'
2026-09-10T15:20:35.1200004Z '/tmp/src/lib/main/io.netty.netty-codec-haproxy-4.1.119.Final.jar' -> '/deployments/lib/main/io.netty.netty-codec-haproxy-4.1.119.Final.jar'
2026-09-10T15:20:35.1221457Z '/tmp/src/lib/main/io.netty.netty-codec-http-4.1.119.Final.jar' -> '/deployments/lib/main/io.netty.netty-codec-http-4.1.119.Final.jar'
2026-09-10T15:20:35.1221806Z '/tmp/src/lib/main/io.netty.netty-codec-http2-4.1.119.Final.jar' -> '/deployments/lib/main/io.netty.netty-codec-http2-4.1.119.Final.jar'
2026-09-10T15:20:35.1222110Z '/tmp/src/lib/main/io.netty.netty-codec-socks-4.1.119.Final.jar' -> '/deployments/lib/main/io.netty.netty-codec-socks-4.1.119.Final.jar'
2026-09-10T15:20:35.1222408Z '/tmp/src/lib/main/io.netty.netty-common-4.1.119.Final.jar' -> '/deployments/lib/main/io.netty.netty-common-4.1.119.Final.jar'
2026-09-10T15:20:35.1222696Z '/tmp/src/lib/main/io.netty.netty-handler-4.1.119.Final.jar' -> '/deployments/lib/main/io.netty.netty-handler-4.1.119.Final.jar'
2026-09-10T15:20:35.1223005Z '/tmp/src/lib/main/io.netty.netty-handler-proxy-4.1.119.Final.jar' -> '/deployments/lib/main/io.netty.netty-handler-proxy-4.1.119.Final.jar'
2026-09-10T15:20:35.1223305Z '/tmp/src/lib/main/io.netty.netty-resolver-4.1.119.Final.jar' -> '/deployments/lib/main/io.netty.netty-resolver-4.1.119.Final.jar'
2026-09-10T15:20:35.1223612Z '/tmp/src/lib/main/io.netty.netty-resolver-dns-4.1.119.Final.jar' -> '/deployments/lib/main/io.netty.netty-resolver-dns-4.1.119.Final.jar'
2026-09-10T15:20:35.1224068Z '/tmp/src/lib/main/io.netty.netty-transport-4.1.119.Final.jar' -> '/deployments/lib/main/io.netty.netty-transport-4.1.119.Final.jar'
2026-09-10T15:20:35.1224485Z '/tmp/src/lib/main/io.netty.netty-transport-native-unix-common-4.1.119.Final.jar' -> '/deployments/lib/main/io.netty.netty-transport-native-unix-common-4.1.119.Final.jar'
2026-09-10T15:20:35.1224947Z '/tmp/src/lib/main/io.quarkus.arc.arc-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.arc.arc-3.15.5.jar'
2026-09-10T15:20:35.1225425Z '/tmp/src/lib/main/io.quarkus.quarkus-agroal-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-agroal-3.15.5.jar'
2026-09-10T15:20:35.1225699Z '/tmp/src/lib/main/io.quarkus.quarkus-arc-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-arc-3.15.5.jar'
2026-09-10T15:20:35.1226063Z '/tmp/src/lib/main/io.quarkus.quarkus-caffeine-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-caffeine-3.15.5.jar'
2026-09-10T15:20:35.1226329Z '/tmp/src/lib/main/io.quarkus.quarkus-core-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-core-3.15.5.jar'
2026-09-10T15:20:35.1226614Z '/tmp/src/lib/main/io.quarkus.quarkus-credentials-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-credentials-3.15.5.jar'
2026-09-10T15:20:35.1226903Z '/tmp/src/lib/main/io.quarkus.quarkus-datasource-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-datasource-3.15.5.jar'
2026-09-10T15:20:35.1227206Z '/tmp/src/lib/main/io.quarkus.quarkus-datasource-common-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-datasource-common-3.15.5.jar'
2026-09-10T15:20:35.1227492Z '/tmp/src/lib/main/io.quarkus.quarkus-fs-util-0.0.10.jar' -> '/deployments/lib/main/io.quarkus.quarkus-fs-util-0.0.10.jar'
2026-09-10T15:20:35.1227764Z '/tmp/src/lib/main/io.quarkus.quarkus-hal-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-hal-3.15.5.jar'
2026-09-10T15:20:35.1228048Z '/tmp/src/lib/main/io.quarkus.quarkus-hibernate-orm-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-hibernate-orm-3.15.5.jar'
2026-09-10T15:20:35.1228359Z '/tmp/src/lib/main/io.quarkus.quarkus-hibernate-orm-panache-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-hibernate-orm-panache-3.15.5.jar'
2026-09-10T15:20:35.1229069Z '/tmp/src/lib/main/io.quarkus.quarkus-hibernate-orm-panache-common-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-hibernate-orm-panache-common-3.15.5.jar'
2026-09-10T15:20:35.1229464Z '/tmp/src/lib/main/io.quarkus.quarkus-hibernate-orm-rest-data-panache-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-hibernate-orm-rest-data-panache-3.15.5.jar'
2026-09-10T15:20:35.1229902Z '/tmp/src/lib/main/io.quarkus.quarkus-hibernate-validator-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-hibernate-validator-3.15.5.jar'
2026-09-10T15:20:35.1230214Z '/tmp/src/lib/main/io.quarkus.quarkus-jackson-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-jackson-3.15.5.jar'
2026-09-10T15:20:35.1230497Z '/tmp/src/lib/main/io.quarkus.quarkus-jdbc-db2-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-jdbc-db2-3.15.5.jar'
2026-09-10T15:20:35.1230773Z '/tmp/src/lib/main/io.quarkus.quarkus-jsonp-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-jsonp-3.15.5.jar'
2026-09-10T15:20:35.1231047Z '/tmp/src/lib/main/io.quarkus.quarkus-mutiny-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-mutiny-3.15.5.jar'
2026-09-10T15:20:35.1231336Z '/tmp/src/lib/main/io.quarkus.quarkus-narayana-jta-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-narayana-jta-3.15.5.jar'
2026-09-10T15:20:35.1231624Z '/tmp/src/lib/main/io.quarkus.quarkus-netty-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-netty-3.15.5.jar'
2026-09-10T15:20:35.1237628Z '/tmp/src/lib/main/io.quarkus.quarkus-oidc-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-oidc-3.15.5.jar'
2026-09-10T15:20:35.1239344Z '/tmp/src/lib/main/io.quarkus.quarkus-oidc-common-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-oidc-common-3.15.5.jar'
2026-09-10T15:20:35.1239739Z '/tmp/src/lib/main/io.quarkus.quarkus-panache-common-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-panache-common-3.15.5.jar'
2026-09-10T15:20:35.1240060Z '/tmp/src/lib/main/io.quarkus.quarkus-panache-hibernate-common-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-panache-hibernate-common-3.15.5.jar'
2026-09-10T15:20:35.1240376Z '/tmp/src/lib/main/io.quarkus.quarkus-rest-data-panache-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-rest-data-panache-3.15.5.jar'
2026-09-10T15:20:35.1240762Z '/tmp/src/lib/main/io.quarkus.quarkus-resteasy-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-resteasy-3.15.5.jar'
2026-09-10T15:20:35.1241065Z '/tmp/src/lib/main/io.quarkus.quarkus-resteasy-common-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-resteasy-common-3.15.5.jar'
2026-09-10T15:20:35.1241479Z '/tmp/src/lib/main/io.quarkus.quarkus-resteasy-jackson-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-resteasy-jackson-3.15.5.jar'
2026-09-10T15:20:35.1241841Z '/tmp/src/lib/main/io.quarkus.quarkus-resteasy-links-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-resteasy-links-3.15.5.jar'
2026-09-10T15:20:35.1242161Z '/tmp/src/lib/main/io.quarkus.quarkus-resteasy-server-common-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-resteasy-server-common-3.15.5.jar'
2026-09-10T15:20:35.1242461Z '/tmp/src/lib/main/io.quarkus.quarkus-security-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-security-3.15.5.jar'
2026-09-10T15:20:35.1242766Z '/tmp/src/lib/main/io.quarkus.quarkus-security-runtime-spi-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-security-runtime-spi-3.15.5.jar'
2026-09-10T15:20:35.1243102Z '/tmp/src/lib/main/io.quarkus.quarkus-smallrye-context-propagation-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-smallrye-context-propagation-3.15.5.jar'
2026-09-10T15:20:35.1243425Z '/tmp/src/lib/main/io.quarkus.quarkus-smallrye-health-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-smallrye-health-3.15.5.jar'
2026-09-10T15:20:35.1243721Z '/tmp/src/lib/main/io.quarkus.quarkus-smallrye-jwt-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-smallrye-jwt-3.15.5.jar'
2026-09-10T15:20:35.1244027Z '/tmp/src/lib/main/io.quarkus.quarkus-smallrye-jwt-build-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-smallrye-jwt-build-3.15.5.jar'
2026-09-10T15:20:35.1244450Z '/tmp/src/lib/main/io.quarkus.quarkus-smallrye-metrics-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-smallrye-metrics-3.15.5.jar'
2026-09-10T15:20:35.1244770Z '/tmp/src/lib/main/io.quarkus.quarkus-smallrye-openapi-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-smallrye-openapi-3.15.5.jar'
2026-09-10T15:20:35.1245062Z '/tmp/src/lib/main/io.quarkus.quarkus-swagger-ui-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-swagger-ui-3.15.5.jar'
2026-09-10T15:20:35.1245356Z '/tmp/src/lib/main/io.quarkus.quarkus-tls-registry-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-tls-registry-3.15.5.jar'
2026-09-10T15:20:35.1245673Z '/tmp/src/lib/main/io.quarkus.quarkus-transaction-annotations-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-transaction-annotations-3.15.5.jar'
2026-09-10T15:20:35.1245968Z '/tmp/src/lib/main/io.quarkus.quarkus-vertx-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-vertx-3.15.5.jar'
2026-09-10T15:20:35.1246331Z '/tmp/src/lib/main/io.quarkus.quarkus-vertx-http-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-vertx-http-3.15.5.jar'
2026-09-10T15:20:35.1246641Z '/tmp/src/lib/main/io.quarkus.quarkus-virtual-threads-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-virtual-threads-3.15.5.jar'
2026-09-10T15:20:35.1246947Z '/tmp/src/lib/main/io.quarkus.security.quarkus-security-2.1.0.jar' -> '/deployments/lib/main/io.quarkus.security.quarkus-security-2.1.0.jar'
2026-09-10T15:20:35.1247268Z '/tmp/src/lib/main/io.quarkus.vertx.utils.quarkus-vertx-utils-3.15.5.jar' -> '/deployments/lib/main/io.quarkus.vertx.utils.quarkus-vertx-utils-3.15.5.jar'
2026-09-10T15:20:35.1247680Z '/tmp/src/lib/main/io.smallrye.common.smallrye-common-annotation-2.6.1.jar' -> '/deployments/lib/main/io.smallrye.common.smallrye-common-annotation-2.6.1.jar'
2026-09-10T15:20:35.1248010Z '/tmp/src/lib/main/io.smallrye.common.smallrye-common-classloader-2.6.1.jar' -> '/deployments/lib/main/io.smallrye.common.smallrye-common-classloader-2.6.1.jar'
2026-09-10T15:20:35.1248339Z '/tmp/src/lib/main/io.smallrye.common.smallrye-common-vertx-context-2.6.1.jar' -> '/deployments/lib/main/io.smallrye.common.smallrye-common-vertx-context-2.6.1.jar'
2026-09-10T15:20:35.1257097Z '/tmp/src/lib/main/io.smallrye.config.smallrye-config-3.9.1.jar' -> '/deployments/lib/main/io.smallrye.config.smallrye-config-3.9.1.jar'
2026-09-10T15:20:35.1258157Z '/tmp/src/lib/main/io.smallrye.config.smallrye-config-common-3.9.1.jar' -> '/deployments/lib/main/io.smallrye.config.smallrye-config-common-3.9.1.jar'
2026-09-10T15:20:35.1258547Z '/tmp/src/lib/main/io.smallrye.config.smallrye-config-core-3.9.1.jar' -> '/deployments/lib/main/io.smallrye.config.smallrye-config-core-3.9.1.jar'
2026-09-10T15:20:35.1258903Z '/tmp/src/lib/main/io.smallrye.config.smallrye-config-source-file-system-3.13.2.jar' -> '/deployments/lib/main/io.smallrye.config.smallrye-config-source-file-system-3.13.2.jar'
2026-09-10T15:20:35.1259243Z '/tmp/src/lib/main/io.smallrye.config.smallrye-config-validator-3.9.1.jar' -> '/deployments/lib/main/io.smallrye.config.smallrye-config-validator-3.9.1.jar'
2026-09-10T15:20:35.1259532Z '/tmp/src/lib/main/io.smallrye.jandex-3.2.3.jar' -> '/deployments/lib/main/io.smallrye.jandex-3.2.3.jar'
2026-09-10T15:20:35.1259811Z '/tmp/src/lib/main/io.smallrye.reactive.mutiny-2.6.2.jar' -> '/deployments/lib/main/io.smallrye.reactive.mutiny-2.6.2.jar'
2026-09-10T15:20:35.1260148Z '/tmp/src/lib/main/io.smallrye.reactive.mutiny-smallrye-context-propagation-2.6.2.jar' -> '/deployments/lib/main/io.smallrye.reactive.mutiny-smallrye-context-propagation-2.6.2.jar'
2026-09-10T15:20:35.1260496Z '/tmp/src/lib/main/io.smallrye.reactive.mutiny-zero-flow-adapters-1.1.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.mutiny-zero-flow-adapters-1.1.0.jar'
2026-09-10T15:20:35.1260848Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-auth-common-3.16.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-auth-common-3.16.0.jar'
2026-09-10T15:20:35.1261218Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-bridge-common-3.16.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-bridge-common-3.16.0.jar'
2026-09-10T15:20:35.1261570Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-core-3.16.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-core-3.16.0.jar'
2026-09-10T15:20:35.1261914Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-runtime-3.16.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-runtime-3.16.0.jar'
2026-09-10T15:20:35.1262269Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-uri-template-3.16.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-uri-template-3.16.0.jar'
2026-09-10T15:20:35.1262612Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-3.16.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-3.16.0.jar'
2026-09-10T15:20:35.1262959Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-client-3.16.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-client-3.16.0.jar'
2026-09-10T15:20:35.1263310Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-common-3.16.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-common-3.16.0.jar'
2026-09-10T15:20:35.1263659Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-reactive-converter-api-3.0.1.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-reactive-converter-api-3.0.1.jar'
2026-09-10T15:20:35.1264135Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-reactive-converter-mutiny-3.0.1.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-reactive-converter-mutiny-3.0.1.jar'
2026-09-10T15:20:35.1264684Z '/tmp/src/lib/main/io.smallrye.reactive.vertx-mutiny-generator-3.16.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.vertx-mutiny-generator-3.16.0.jar'
2026-09-10T15:20:35.1265009Z '/tmp/src/lib/main/io.smallrye.smallrye-context-propagation-2.1.2.jar' -> '/deployments/lib/main/io.smallrye.smallrye-context-propagation-2.1.2.jar'
2026-09-10T15:20:35.1265330Z '/tmp/src/lib/main/io.smallrye.smallrye-context-propagation-api-2.1.2.jar' -> '/deployments/lib/main/io.smallrye.smallrye-context-propagation-api-2.1.2.jar'
2026-09-10T15:20:35.1265858Z '/tmp/src/lib/main/io.smallrye.smallrye-context-propagation-jta-2.1.2.jar' -> '/deployments/lib/main/io.smallrye.smallrye-context-propagation-jta-2.1.2.jar'
2026-09-10T15:20:35.1266344Z '/tmp/src/lib/main/io.smallrye.smallrye-context-propagation-storage-2.1.2.jar' -> '/deployments/lib/main/io.smallrye.smallrye-context-propagation-storage-2.1.2.jar'
2026-09-10T15:20:35.1266677Z '/tmp/src/lib/main/io.smallrye.smallrye-fault-tolerance-vertx-6.4.3.jar' -> '/deployments/lib/main/io.smallrye.smallrye-fault-tolerance-vertx-6.4.3.jar'
2026-09-10T15:20:35.1266963Z '/tmp/src/lib/main/io.smallrye.smallrye-health-4.1.0.jar' -> '/deployments/lib/main/io.smallrye.smallrye-health-4.1.0.jar'
2026-09-10T15:20:35.1294739Z '/tmp/src/lib/main/io.smallrye.smallrye-health-api-4.1.0.jar' -> '/deployments/lib/main/io.smallrye.smallrye-health-api-4.1.0.jar'
2026-09-10T15:20:35.1295129Z '/tmp/src/lib/main/io.smallrye.smallrye-health-provided-checks-4.1.0.jar' -> '/deployments/lib/main/io.smallrye.smallrye-health-provided-checks-4.1.0.jar'
2026-09-10T15:20:35.1295528Z '/tmp/src/lib/main/io.smallrye.smallrye-jwt-4.5.3.jar' -> '/deployments/lib/main/io.smallrye.smallrye-jwt-4.5.3.jar'
2026-09-10T15:20:35.1295979Z '/tmp/src/lib/main/io.smallrye.smallrye-jwt-build-4.5.3.jar' -> '/deployments/lib/main/io.smallrye.smallrye-jwt-build-4.5.3.jar'
2026-09-10T15:20:35.1296406Z '/tmp/src/lib/main/io.smallrye.smallrye-jwt-common-4.5.3.jar' -> '/deployments/lib/main/io.smallrye.smallrye-jwt-common-4.5.3.jar'
2026-09-10T15:20:35.1296700Z '/tmp/src/lib/main/io.smallrye.smallrye-metrics-4.0.0.jar' -> '/deployments/lib/main/io.smallrye.smallrye-metrics-4.0.0.jar'
2026-09-10T15:20:35.1296997Z '/tmp/src/lib/main/io.smallrye.smallrye-open-api-core-3.10.0.jar' -> '/deployments/lib/main/io.smallrye.smallrye-open-api-core-3.10.0.jar'
2026-09-10T15:20:35.1297321Z '/tmp/src/lib/main/io.vertx.vertx-auth-common-4.5.14.jar' -> '/deployments/lib/main/io.vertx.vertx-auth-common-4.5.14.jar'
2026-09-10T15:20:35.1297702Z '/tmp/src/lib/main/io.vertx.vertx-bridge-common-4.5.14.jar' -> '/deployments/lib/main/io.vertx.vertx-bridge-common-4.5.14.jar'
2026-09-10T15:20:35.1297986Z '/tmp/src/lib/main/io.vertx.vertx-codegen-4.5.14.jar' -> '/deployments/lib/main/io.vertx.vertx-codegen-4.5.14.jar'
2026-09-10T15:20:35.1298257Z '/tmp/src/lib/main/io.vertx.vertx-core-4.5.14.jar' -> '/deployments/lib/main/io.vertx.vertx-core-4.5.14.jar'
2026-09-10T15:20:35.1298550Z '/tmp/src/lib/main/io.vertx.vertx-uri-template-4.5.14.jar' -> '/deployments/lib/main/io.vertx.vertx-uri-template-4.5.14.jar'
2026-09-10T15:20:35.1298823Z '/tmp/src/lib/main/io.vertx.vertx-web-4.5.14.jar' -> '/deployments/lib/main/io.vertx.vertx-web-4.5.14.jar'
2026-09-10T15:20:35.1299251Z '/tmp/src/lib/main/io.vertx.vertx-web-client-4.5.14.jar' -> '/deployments/lib/main/io.vertx.vertx-web-client-4.5.14.jar'
2026-09-10T15:20:35.1299688Z '/tmp/src/lib/main/io.vertx.vertx-web-common-4.5.14.jar' -> '/deployments/lib/main/io.vertx.vertx-web-common-4.5.14.jar'
2026-09-10T15:20:35.1300031Z '/tmp/src/lib/main/jakarta.activation.jakarta.activation-api-2.1.3.jar' -> '/deployments/lib/main/jakarta.activation.jakarta.activation-api-2.1.3.jar'
2026-09-10T15:20:35.1300492Z '/tmp/src/lib/main/jakarta.annotation.jakarta.annotation-api-3.0.0.jar' -> '/deployments/lib/main/jakarta.annotation.jakarta.annotation-api-3.0.0.jar'
2026-09-10T15:20:35.1300791Z '/tmp/src/lib/main/jakarta.el.jakarta.el-api-5.0.1.jar' -> '/deployments/lib/main/jakarta.el.jakarta.el-api-5.0.1.jar'
2026-09-10T15:20:35.1301106Z '/tmp/src/lib/main/jakarta.enterprise.jakarta.enterprise.cdi-api-4.1.0.jar' -> '/deployments/lib/main/jakarta.enterprise.jakarta.enterprise.cdi-api-4.1.0.jar'
2026-09-10T15:20:35.1301498Z '/tmp/src/lib/main/jakarta.enterprise.jakarta.enterprise.lang-model-4.1.0.jar' -> '/deployments/lib/main/jakarta.enterprise.jakarta.enterprise.lang-model-4.1.0.jar'
2026-09-10T15:20:35.1301997Z '/tmp/src/lib/main/jakarta.inject.jakarta.inject-api-2.0.1.jar' -> '/deployments/lib/main/jakarta.inject.jakarta.inject-api-2.0.1.jar'
2026-09-10T15:20:35.1302744Z '/tmp/src/lib/main/jakarta.interceptor.jakarta.interceptor-api-2.2.0.jar' -> '/deployments/lib/main/jakarta.interceptor.jakarta.interceptor-api-2.2.0.jar'
2026-09-10T15:20:35.1303243Z '/tmp/src/lib/main/jakarta.json.jakarta.json-api-2.1.3.jar' -> '/deployments/lib/main/jakarta.json.jakarta.json-api-2.1.3.jar'
2026-09-10T15:20:35.1303564Z '/tmp/src/lib/main/jakarta.persistence.jakarta.persistence-api-3.1.0.jar' -> '/deployments/lib/main/jakarta.persistence.jakarta.persistence-api-3.1.0.jar'
2026-09-10T15:20:35.1303878Z '/tmp/src/lib/main/jakarta.resource.jakarta.resource-api-2.1.0.jar' -> '/deployments/lib/main/jakarta.resource.jakarta.resource-api-2.1.0.jar'
2026-09-10T15:20:35.1304413Z '/tmp/src/lib/main/jakarta.servlet.jakarta.servlet-api-6.0.0.jar' -> '/deployments/lib/main/jakarta.servlet.jakarta.servlet-api-6.0.0.jar'
2026-09-10T15:20:35.1304834Z '/tmp/src/lib/main/jakarta.transaction.jakarta.transaction-api-2.0.1.jar' -> '/deployments/lib/main/jakarta.transaction.jakarta.transaction-api-2.0.1.jar'
2026-09-10T15:20:35.1305160Z '/tmp/src/lib/main/jakarta.validation.jakarta.validation-api-3.0.2.jar' -> '/deployments/lib/main/jakarta.validation.jakarta.validation-api-3.0.2.jar'
2026-09-10T15:20:35.1305460Z '/tmp/src/lib/main/jakarta.ws.rs.jakarta.ws.rs-api-3.1.0.jar' -> '/deployments/lib/main/jakarta.ws.rs.jakarta.ws.rs-api-3.1.0.jar'
2026-09-10T15:20:35.1305765Z '/tmp/src/lib/main/jakarta.xml.bind.jakarta.xml.bind-api-4.0.2.jar' -> '/deployments/lib/main/jakarta.xml.bind.jakarta.xml.bind-api-4.0.2.jar'
2026-09-10T15:20:35.1482763Z '/tmp/src/lib/main/net.bytebuddy.byte-buddy-1.15.11.jar' -> '/deployments/lib/main/net.bytebuddy.byte-buddy-1.15.11.jar'
2026-09-10T15:20:35.1483131Z '/tmp/src/lib/main/org.antlr.antlr4-runtime-4.13.0.jar' -> '/deployments/lib/main/org.antlr.antlr4-runtime-4.13.0.jar'
2026-09-10T15:20:35.1483477Z '/tmp/src/lib/main/org.apache.commons.commons-lang3-3.14.0.jar' -> '/deployments/lib/main/org.apache.commons.commons-lang3-3.14.0.jar'
2026-09-10T15:20:35.1483776Z '/tmp/src/lib/main/org.bitbucket.b_c.jose4j-0.9.6.jar' -> '/deployments/lib/main/org.bitbucket.b_c.jose4j-0.9.6.jar'
2026-09-10T15:20:35.1484082Z '/tmp/src/lib/main/org.eclipse.angus.angus-activation-2.0.2.jar' -> '/deployments/lib/main/org.eclipse.angus.angus-activation-2.0.2.jar'
2026-09-10T15:20:35.1484517Z '/tmp/src/lib/main/org.eclipse.microprofile.config.microprofile-config-api-3.1.jar' -> '/deployments/lib/main/org.eclipse.microprofile.config.microprofile-config-api-3.1.jar'
2026-09-10T15:20:35.1484936Z '/tmp/src/lib/main/org.eclipse.microprofile.context-propagation.microprofile-context-propagation-api-1.3.jar' -> '/deployments/lib/main/org.eclipse.microprofile.context-propagation.microprofile-context-propagation-api-1.3.jar'
2026-09-10T15:20:35.1485416Z '/tmp/src/lib/main/org.eclipse.microprofile.health.microprofile-health-api-4.0.1.jar' -> '/deployments/lib/main/org.eclipse.microprofile.health.microprofile-health-api-4.0.1.jar'
2026-09-10T15:20:35.1485783Z '/tmp/src/lib/main/org.eclipse.microprofile.jwt.microprofile-jwt-auth-api-2.1.jar' -> '/deployments/lib/main/org.eclipse.microprofile.jwt.microprofile-jwt-auth-api-2.1.jar'
2026-09-10T15:20:35.1486151Z '/tmp/src/lib/main/org.eclipse.microprofile.metrics.microprofile-metrics-api-4.0.1.jar' -> '/deployments/lib/main/org.eclipse.microprofile.metrics.microprofile-metrics-api-4.0.1.jar'
2026-09-10T15:20:35.1486511Z '/tmp/src/lib/main/org.eclipse.microprofile.openapi.microprofile-openapi-api-3.1.1.jar' -> '/deployments/lib/main/org.eclipse.microprofile.openapi.microprofile-openapi-api-3.1.1.jar'
2026-09-10T15:20:35.1486944Z '/tmp/src/lib/main/org.eclipse.microprofile.reactive-streams-operators.microprofile-reactive-streams-operators-api-3.0.1.jar' -> '/deployments/lib/main/org.eclipse.microprofile.reactive-streams-operators.microprofile-reactive-streams-operators-api-3.0.1.jar'
2026-09-10T15:20:35.1487289Z '/tmp/src/lib/main/org.eclipse.parsson.parsson-1.1.7.jar' -> '/deployments/lib/main/org.eclipse.parsson.parsson-1.1.7.jar'
2026-09-10T15:20:35.1487842Z '/tmp/src/lib/main/org.glassfish.expressly.expressly-5.0.0.jar' -> '/deployments/lib/main/org.glassfish.expressly.expressly-5.0.0.jar'
2026-09-10T15:20:35.1488182Z '/tmp/src/lib/main/org.glassfish.jaxb.codemodel-4.0.3.jar' -> '/deployments/lib/main/org.glassfish.jaxb.codemodel-4.0.3.jar'
2026-09-10T15:20:35.1488467Z '/tmp/src/lib/main/org.glassfish.jaxb.jaxb-core-4.0.5.jar' -> '/deployments/lib/main/org.glassfish.jaxb.jaxb-core-4.0.5.jar'
2026-09-10T15:20:35.1488749Z '/tmp/src/lib/main/org.glassfish.jaxb.jaxb-jxc-4.0.3.jar' -> '/deployments/lib/main/org.glassfish.jaxb.jaxb-jxc-4.0.3.jar'
2026-09-10T15:20:35.1489037Z '/tmp/src/lib/main/org.glassfish.jaxb.jaxb-runtime-4.0.5.jar' -> '/deployments/lib/main/org.glassfish.jaxb.jaxb-runtime-4.0.5.jar'
2026-09-10T15:20:35.1489428Z '/tmp/src/lib/main/org.glassfish.jaxb.jaxb-xjc-4.0.3.jar' -> '/deployments/lib/main/org.glassfish.jaxb.jaxb-xjc-4.0.3.jar'
2026-09-10T15:20:35.1489723Z '/tmp/src/lib/main/org.glassfish.jaxb.txw2-4.0.5.jar' -> '/deployments/lib/main/org.glassfish.jaxb.txw2-4.0.5.jar'
2026-09-10T15:20:35.1489987Z '/tmp/src/lib/main/org.glassfish.jaxb.xsom-4.0.3.jar' -> '/deployments/lib/main/org.glassfish.jaxb.xsom-4.0.3.jar'
2026-09-10T15:20:35.1490313Z '/tmp/src/lib/main/org.hibernate.common.hibernate-commons-annotations-7.0.3.Final.jar' -> '/deployments/lib/main/org.hibernate.common.hibernate-commons-annotations-7.0.3.Final.jar'
2026-09-10T15:20:35.1490639Z '/tmp/src/lib/main/org.hibernate.orm.hibernate-core-6.6.13.Final.jar' -> '/deployments/lib/main/org.hibernate.orm.hibernate-core-6.6.13.Final.jar'
2026-09-10T15:20:35.1490956Z '/tmp/src/lib/main/org.hibernate.orm.hibernate-graalvm-6.6.13.Final.jar' -> '/deployments/lib/main/org.hibernate.orm.hibernate-graalvm-6.6.13.Final.jar'
2026-09-10T15:20:35.1491263Z '/tmp/src/lib/main/org.hibernate.quarkus-local-cache-0.3.1.jar' -> '/deployments/lib/main/org.hibernate.quarkus-local-cache-0.3.1.jar'
2026-09-10T15:20:35.1491586Z '/tmp/src/lib/main/org.hibernate.validator.hibernate-validator-8.0.2.Final.jar' -> '/deployments/lib/main/org.hibernate.validator.hibernate-validator-8.0.2.Final.jar'
2026-09-10T15:20:35.1491917Z '/tmp/src/lib/main/org.jboss.invocation.jboss-invocation-2.0.0.Final.jar' -> '/deployments/lib/main/org.jboss.invocation.jboss-invocation-2.0.0.Final.jar'
2026-09-10T15:20:35.1492231Z '/tmp/src/lib/main/org.jboss.jboss-transaction-spi-8.0.0.Final.jar' -> '/deployments/lib/main/org.jboss.jboss-transaction-spi-8.0.0.Final.jar'
2026-09-10T15:20:35.1492557Z '/tmp/src/lib/main/org.jboss.logging.jboss-logging-annotations-3.0.1.Final.jar' -> '/deployments/lib/main/org.jboss.logging.jboss-logging-annotations-3.0.1.Final.jar'
2026-09-10T15:20:35.1492882Z '/tmp/src/lib/main/org.jboss.narayana.jta.narayana-jta-7.0.2.Final.jar' -> '/deployments/lib/main/org.jboss.narayana.jta.narayana-jta-7.0.2.Final.jar'
2026-09-10T15:20:35.1493223Z '/tmp/src/lib/main/org.jboss.narayana.jts.narayana-jts-integration-7.0.2.Final.jar' -> '/deployments/lib/main/org.jboss.narayana.jts.narayana-jts-integration-7.0.2.Final.jar'
2026-09-10T15:20:35.1493582Z '/tmp/src/lib/main/org.jboss.resteasy.microprofile.microprofile-config-2.1.5.Final.jar' -> '/deployments/lib/main/org.jboss.resteasy.microprofile.microprofile-config-2.1.5.Final.jar'
2026-09-10T15:20:35.1493905Z '/tmp/src/lib/main/org.jboss.resteasy.resteasy-cdi-6.2.9.Final.jar' -> '/deployments/lib/main/org.jboss.resteasy.resteasy-cdi-6.2.9.Final.jar'
2026-09-10T15:20:35.1494210Z '/tmp/src/lib/main/org.jboss.resteasy.resteasy-core-6.2.9.Final.jar' -> '/deployments/lib/main/org.jboss.resteasy.resteasy-core-6.2.9.Final.jar'
2026-09-10T15:20:35.1494685Z '/tmp/src/lib/main/org.jboss.resteasy.resteasy-core-spi-6.2.9.Final.jar' -> '/deployments/lib/main/org.jboss.resteasy.resteasy-core-spi-6.2.9.Final.jar'
2026-09-10T15:20:35.1495151Z '/tmp/src/lib/main/org.jboss.resteasy.resteasy-jackson2-provider-6.2.9.Final.jar' -> '/deployments/lib/main/org.jboss.resteasy.resteasy-jackson2-provider-6.2.9.Final.jar'
2026-09-10T15:20:35.1495705Z '/tmp/src/lib/main/org.jboss.resteasy.resteasy-jaxb-provider-6.2.9.Final.jar' -> '/deployments/lib/main/org.jboss.resteasy.resteasy-jaxb-provider-6.2.9.Final.jar'
2026-09-10T15:20:35.1496167Z '/tmp/src/lib/main/org.jboss.resteasy.resteasy-links-6.2.9.Final.jar' -> '/deployments/lib/main/org.jboss.resteasy.resteasy-links-6.2.9.Final.jar'
2026-09-10T15:20:35.1496589Z '/tmp/src/lib/main/org.jboss.slf4j.slf4j-jboss-logmanager-2.0.0.Final.jar' -> '/deployments/lib/main/org.jboss.slf4j.slf4j-jboss-logmanager-2.0.0.Final.jar'
2026-09-10T15:20:35.1496904Z '/tmp/src/lib/main/org.jboss.threads.jboss-threads-3.6.1.Final.jar' -> '/deployments/lib/main/org.jboss.threads.jboss-threads-3.6.1.Final.jar'
2026-09-10T15:20:35.1497185Z '/tmp/src/lib/main/org.jctools.jctools-core-4.0.5.jar' -> '/deployments/lib/main/org.jctools.jctools-core-4.0.5.jar'
2026-09-10T15:20:35.1497481Z '/tmp/src/lib/main/org.reactivestreams.reactive-streams-1.0.4.jar' -> '/deployments/lib/main/org.reactivestreams.reactive-streams-1.0.4.jar'
2026-09-10T15:20:35.1497762Z '/tmp/src/lib/main/org.slf4j.slf4j-api-2.0.6.jar' -> '/deployments/lib/main/org.slf4j.slf4j-api-2.0.6.jar'
2026-09-10T15:20:35.1498050Z '/tmp/src/lib/main/org.wildfly.common.wildfly-common-1.7.0.Final.jar' -> '/deployments/lib/main/org.wildfly.common.wildfly-common-1.7.0.Final.jar'
2026-09-10T15:20:35.1498327Z '/tmp/src/lib/main/org.yaml.snakeyaml-2.2.jar' -> '/deployments/lib/main/org.yaml.snakeyaml-2.2.jar'
2026-09-10T15:20:35.1498529Z '/tmp/src/quarkus' -> '/deployments/quarkus'
2026-09-10T15:20:35.1498744Z '/tmp/src/quarkus/generated-bytecode.jar' -> '/deployments/quarkus/generated-bytecode.jar'
2026-09-10T15:20:35.1498979Z '/tmp/src/quarkus/quarkus-application.dat' -> '/deployments/quarkus/quarkus-application.dat'
2026-09-10T15:20:35.1499271Z '/tmp/src/quarkus/transformed-bytecode.jar' -> '/deployments/quarkus/transformed-bytecode.jar'
2026-09-10T15:20:35.1499529Z '/tmp/src/quarkus-app-dependencies.txt' -> '/deployments/quarkus-app-dependencies.txt'
2026-09-10T15:20:35.1707840Z '/tmp/src/sispl-consulta-transacao-20260910-1218-1-0-0-SNAPSHOT.zip' -> '/deployments/sispl-consulta-transacao-20260910-1218-1-0-0-SNAPSHOT.zip'
2026-09-10T15:20:35.1708064Z + exit 0
2026-09-10T15:20:35.2140864Z STEP 9/9: CMD /usr/local/s2i/run
2026-09-10T15:20:35.2402650Z COMMIT temp.builder.openshift.io/build-images-ads/sispl-consulta-transacao-30:800d4458
2026-09-10T15:20:35.2467273Z time="2026-09-10T15:20:35Z" level=warning msg="Adding metacopy option, configured globally"
2026-09-10T15:20:37.6811541Z Getting image source signatures
2026-09-10T15:20:37.6848765Z Copying blob sha256:f9327c1608ad0ae79b5f4a4c47eda907a980ea9640c70e6036811ea76d641249
2026-09-10T15:20:37.6848996Z Copying blob sha256:449675ca11bc217d5066dcce0a7dcb774bc87cb2553a8f137bc875cb5dddf4d4
2026-09-10T15:20:37.6849183Z Copying blob sha256:9d33dbfb9e8abcd14e0a55be85f30752600448499b0dddb846f2bf5fd21d8d37
2026-09-10T15:20:37.6849355Z Copying blob sha256:d08ff564362ee8ca55bca00895929a4f92fc6c574c9ce4de07024e9627540fc8
2026-09-10T15:20:37.6849548Z Copying blob sha256:88fe04f85e71aef700a24d555248930b381fbdedb2be87e65dd9128fa4b93bf5
2026-09-10T15:20:37.6849736Z Copying blob sha256:6a8d5f164ca47b1c2e7bdb23f07d1bc02247c71c181d3950f2d0012967247ecf
2026-09-10T15:20:37.6849923Z Copying blob sha256:fc52cb1db6a2236e936683e32d7d60350c381fcb63403826f35e5d20a42ea4b4
2026-09-10T15:20:37.6850104Z Copying blob sha256:27f2ced2acdb114c526bf645b9d1b01fec071e61780410099142b37949a8e177
2026-09-10T15:20:37.6850283Z Copying blob sha256:e578e7bf31c2bac2e9cae908f01970074818ba19564ba62c52e4f60d293e22d2
2026-09-10T15:20:37.6862583Z Copying blob sha256:b29fa49cd757a63e0eb6f03b1998612903715a4dcd8b50b12f6b53910c2e67ae
2026-09-10T15:20:37.6862791Z Copying blob sha256:405281dd08e52c573399a3d7dd112b545a92923636ede89d04c5c76a5e9f929a
2026-09-10T15:20:37.6876059Z Copying blob sha256:7a2b528f79445d7c059524929c661a8297e6a4a9663206c104826eb2b51a1dfe
2026-09-10T15:20:37.6881030Z Copying blob sha256:19c2241f978dfd51ee0e33a16fbf562ec5285bd8ea9c16cb473269d2408df3fc
2026-09-10T15:20:37.7818662Z Copying blob sha256:361b2026424a590f170b2c31b3eb2f61d33a85a820930c5b6232a5657608a9ad
2026-09-10T15:20:39.5869213Z Copying config sha256:48c6090acde9f5d06dcd9007068a68ff9647dcff6576a43e2fe8f555c867c687
2026-09-10T15:20:39.6821355Z Writing manifest to image destination
2026-09-10T15:20:39.6931869Z Storing signatures
2026-09-10T15:20:41.9251226Z --> 48c6090acde
2026-09-10T15:20:41.9251595Z Successfully tagged temp.builder.openshift.io/build-images-ads/sispl-consulta-transacao-30:800d4458
2026-09-10T15:20:42.3287627Z 48c6090acde9f5d06dcd9007068a68ff9647dcff6576a43e2fe8f555c867c687
2026-09-10T15:20:42.3941279Z 
2026-09-10T15:20:42.3942120Z Pushing image image-registry.openshift-image-registry.svc:5000/build-images-ads/sispl-consulta-transacao:latest ...
2026-09-10T15:20:42.3942351Z Getting image source signatures
2026-09-10T15:20:42.7138637Z Copying blob sha256:e1c363c96d760cb85e197cc8e2ab950760067935b29e7c098ae51ed371f5b0cd
2026-09-10T15:20:42.8086257Z Copying blob sha256:24dafab7f594e7a2b9e71b74932f6f72d2e31ac8f84fbd5062d173e63637b237
2026-09-10T15:20:42.8799801Z Copying blob sha256:264aaa453271eaaf6bc92b521f62e38cbda4f01e1a3fbf50abdb8b466be58a64
2026-09-10T15:20:42.9117738Z Copying blob sha256:0a9a2db04f3ebe8121912deecd1a66d98a4ff35c7a3ee57e3eeffcb667119be1
2026-09-10T15:20:42.9310637Z Copying blob sha256:7f24bdb73d536337c7d82dee9c11e09acd3bacb0e1a76e98c6e82a8208e82284
2026-09-10T15:20:42.9576316Z Copying blob sha256:c98bbacb82bbf386496c2e0ef89b288bc8782dd9ae664dddcb285cf0965ba7f2
2026-09-10T15:20:42.9951491Z Copying blob sha256:62d739cb3ca9a7f2a63e12f99c516e6432170af671b061195e6eafa7e864d6a2
2026-09-10T15:20:43.0230150Z Copying blob sha256:4e0cd4f607fede7693f7eb61b31b84c051e5897ce5a096534ed90dc4808e5523
2026-09-10T15:20:43.0766898Z Copying blob sha256:067039afffe5f5aa56bc578e5d9256b8b0055763a32c54a38a73b969a8fd4f13
2026-09-10T15:20:43.0975543Z Copying blob sha256:9d5b85cf24e32083e165099afcc1bd9cc0a57a764f9077301e686e2d27f0eb2c
2026-09-10T15:20:43.1073851Z Copying blob sha256:586ae232f6757fb4248eda7dca86bf361d076242d052ee30965fec2eb1ea5a1c
2026-09-10T15:20:43.1691949Z Copying blob sha256:7749ffa7020405743e3e0425d93720455a83619d343e217645f48f948260ab49
2026-09-10T15:20:43.2319622Z Copying blob sha256:da2064a8b4a27db53f236c51c89c049f993c4438da41f6c80cb24242776bf1da
2026-09-10T15:20:43.2498650Z Copying blob sha256:361b2026424a590f170b2c31b3eb2f61d33a85a820930c5b6232a5657608a9ad
2026-09-10T15:20:45.8156705Z Copying config sha256:48c6090acde9f5d06dcd9007068a68ff9647dcff6576a43e2fe8f555c867c687
2026-09-10T15:20:46.2541526Z Writing manifest to image destination
2026-09-10T15:20:46.3304388Z Storing signatures
2026-09-10T15:20:46.3305093Z Successfully pushed image-registry.openshift-image-registry.svc:5000/build-images-ads/sispl-consulta-transacao@sha256:c2fa60b224b6cfac009d3587c7cf83e564413f0fa3816a8663aef84cf09a046a
2026-09-10T15:20:46.3542491Z Push successful
2026-09-10T15:20:50.3826490Z ##[section]Finishing: Executando Build S2I Binary
