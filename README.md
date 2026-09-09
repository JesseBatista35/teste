2026-07-17T20:13:10.7538431Z ##[section]Starting: Executando Build S2I Binary
2026-07-17T20:13:10.7542002Z ==============================================================================
2026-07-17T20:13:10.7542086Z Task         : Bash
2026-07-17T20:13:10.7542129Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-17T20:13:10.7542199Z Version      : 3.227.0
2026-07-17T20:13:10.7542244Z Author       : Microsoft Corporation
2026-07-17T20:13:10.7542296Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-17T20:13:10.7542375Z ==============================================================================
2026-07-17T20:13:10.8915256Z Generating script.
2026-07-17T20:13:10.8932138Z ========================== Starting Command Output ===========================
2026-07-17T20:13:10.8940204Z [command]/usr/bin/bash /opt/ads-agent/work_ads/_temp/d485ca4c-5bc9-414e-b9d2-4f4de3f06e3a.sh
2026-07-17T20:13:10.8993984Z + set -o errexit
2026-07-17T20:13:10.8994954Z + set -o pipefail
2026-07-17T20:13:10.8995197Z + echo okd4_nprd
2026-07-17T20:13:10.8995331Z + egrep -q '^(okd4|ocp)'
2026-07-17T20:13:10.9026609Z + buildconfig=sisgf-api
2026-07-17T20:13:10.9028841Z + oc start-build sisgf-api --from-dir=/opt/ads-agent/work_ads/7189/a --follow --wait=true -n build-images-ads -v=5
2026-07-17T20:13:11.0143444Z I0717 17:13:11.013875   70238 repository.go:424] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
2026-07-17T20:13:11.0162783Z I0717 17:13:11.015922   70238 repository.go:484] Error executing command: exit status 128
2026-07-17T20:13:11.0163211Z Uploading directory "/opt/ads-agent/work_ads/7189/a" as binary input for the build ...
2026-07-17T20:13:11.0163498Z I0717 17:13:11.016053   70238 tar.go:217] Adding "/opt/ads-agent/work_ads/7189/a" to tar ...
2026-07-17T20:13:11.0165494Z I0717 17:13:11.016417   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/app as app
2026-07-17T20:13:11.0170549Z I0717 17:13:11.016918   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/app/sisgf-api-11.01.01.01.jar as app/sisgf-api-11.01.01.01.jar
2026-07-17T20:13:11.0535851Z I0717 17:13:11.053228   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib as lib
2026-07-17T20:13:11.0544352Z I0717 17:13:11.054341   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/boot as lib/boot
2026-07-17T20:13:11.0545085Z I0717 17:13:11.054401   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/boot/io.github.crac.org-crac-0.1.3.jar as lib/boot/io.github.crac.org-crac-0.1.3.jar
2026-07-17T20:13:11.0545862Z I0717 17:13:11.054495   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/boot/io.quarkus.quarkus-bootstrap-runner-3.13.0.jar as lib/boot/io.quarkus.quarkus-bootstrap-runner-3.13.0.jar
2026-07-17T20:13:11.0567219Z I0717 17:13:11.056601   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/boot/io.quarkus.quarkus-classloader-commons-3.13.0.jar as lib/boot/io.quarkus.quarkus-classloader-commons-3.13.0.jar
2026-07-17T20:13:11.0576446Z I0717 17:13:11.057547   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/boot/io.quarkus.quarkus-development-mode-spi-3.13.0.jar as lib/boot/io.quarkus.quarkus-development-mode-spi-3.13.0.jar
2026-07-17T20:13:11.0598863Z I0717 17:13:11.059772   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/boot/io.quarkus.quarkus-vertx-latebound-mdc-provider-3.13.0.jar as lib/boot/io.quarkus.quarkus-vertx-latebound-mdc-provider-3.13.0.jar
2026-07-17T20:13:11.0610162Z I0717 17:13:11.060897   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/boot/io.smallrye.common.smallrye-common-constraint-2.5.0.jar as lib/boot/io.smallrye.common.smallrye-common-constraint-2.5.0.jar
2026-07-17T20:13:11.0611295Z I0717 17:13:11.061059   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/boot/io.smallrye.common.smallrye-common-cpu-2.5.0.jar as lib/boot/io.smallrye.common.smallrye-common-cpu-2.5.0.jar
2026-07-17T20:13:11.0622118Z I0717 17:13:11.062095   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/boot/io.smallrye.common.smallrye-common-expression-2.5.0.jar as lib/boot/io.smallrye.common.smallrye-common-expression-2.5.0.jar
2026-07-17T20:13:11.0630019Z I0717 17:13:11.062902   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/boot/io.smallrye.common.smallrye-common-function-2.5.0.jar as lib/boot/io.smallrye.common.smallrye-common-function-2.5.0.jar
2026-07-17T20:13:11.0664743Z I0717 17:13:11.065752   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/boot/io.smallrye.common.smallrye-common-io-2.5.0.jar as lib/boot/io.smallrye.common.smallrye-common-io-2.5.0.jar
2026-07-17T20:13:11.0665875Z I0717 17:13:11.066212   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/boot/io.smallrye.common.smallrye-common-net-2.5.0.jar as lib/boot/io.smallrye.common.smallrye-common-net-2.5.0.jar
2026-07-17T20:13:11.0683136Z I0717 17:13:11.068097   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/boot/io.smallrye.common.smallrye-common-os-2.5.0.jar as lib/boot/io.smallrye.common.smallrye-common-os-2.5.0.jar
2026-07-17T20:13:11.0684178Z I0717 17:13:11.068225   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/boot/io.smallrye.common.smallrye-common-ref-2.5.0.jar as lib/boot/io.smallrye.common.smallrye-common-ref-2.5.0.jar
2026-07-17T20:13:11.0692570Z I0717 17:13:11.069135   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/boot/org.jboss.logging.jboss-logging-3.6.0.Final.jar as lib/boot/org.jboss.logging.jboss-logging-3.6.0.Final.jar
2026-07-17T20:13:11.0719294Z I0717 17:13:11.071740   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/boot/org.jboss.logmanager.jboss-logmanager-3.0.6.Final.jar as lib/boot/org.jboss.logmanager.jboss-logmanager-3.0.6.Final.jar
2026-07-17T20:13:15.1048504Z I0717 17:13:15.104145   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main as lib/main
2026-07-17T20:13:15.1049661Z I0717 17:13:15.104498   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/com.aayushatharva.brotli4j.brotli4j-1.16.0.jar as lib/main/com.aayushatharva.brotli4j.brotli4j-1.16.0.jar
2026-07-17T20:13:15.1084878Z I0717 17:13:15.108247   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/com.aayushatharva.brotli4j.native-linux-x86_64-1.16.0.jar as lib/main/com.aayushatharva.brotli4j.native-linux-x86_64-1.16.0.jar
2026-07-17T20:13:15.1205404Z I0717 17:13:15.120268   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/com.aayushatharva.brotli4j.service-1.16.0.jar as lib/main/com.aayushatharva.brotli4j.service-1.16.0.jar
2026-07-17T20:13:15.1206264Z I0717 17:13:15.120412   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/com.cronutils.cron-utils-9.2.1.jar as lib/main/com.cronutils.cron-utils-9.2.1.jar
2026-07-17T20:13:15.1302611Z I0717 17:13:15.129941   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/com.fasterxml.classmate-1.7.0.jar as lib/main/com.fasterxml.classmate-1.7.0.jar
2026-07-17T20:13:15.1338314Z I0717 17:13:15.133564   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/com.fasterxml.jackson.core.jackson-annotations-2.17.2.jar as lib/main/com.fasterxml.jackson.core.jackson-annotations-2.17.2.jar
2026-07-17T20:13:15.1379517Z I0717 17:13:15.137755   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/com.fasterxml.jackson.core.jackson-core-2.17.2.jar as lib/main/com.fasterxml.jackson.core.jackson-core-2.17.2.jar
2026-07-17T20:13:15.1707333Z I0717 17:13:15.170357   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/com.fasterxml.jackson.core.jackson-databind-2.17.2.jar as lib/main/com.fasterxml.jackson.core.jackson-databind-2.17.2.jar
2026-07-17T20:13:15.2601364Z I0717 17:13:15.259701   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/com.fasterxml.jackson.dataformat.jackson-dataformat-yaml-2.17.2.jar as lib/main/com.fasterxml.jackson.dataformat.jackson-dataformat-yaml-2.17.2.jar
2026-07-17T20:13:15.2627927Z I0717 17:13:15.262651   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/com.fasterxml.jackson.datatype.jackson-datatype-jdk8-2.17.2.jar as lib/main/com.fasterxml.jackson.datatype.jackson-datatype-jdk8-2.17.2.jar
2026-07-17T20:13:15.2646207Z I0717 17:13:15.264517   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/com.fasterxml.jackson.datatype.jackson-datatype-jsr310-2.17.2.jar as lib/main/com.fasterxml.jackson.datatype.jackson-datatype-jsr310-2.17.2.jar
2026-07-17T20:13:15.2716864Z I0717 17:13:15.271366   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/com.fasterxml.jackson.module.jackson-module-parameter-names-2.17.2.jar as lib/main/com.fasterxml.jackson.module.jackson-module-parameter-names-2.17.2.jar
2026-07-17T20:13:15.2717943Z I0717 17:13:15.271548   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/com.fasterxml.woodstox.woodstox-core-5.2.1.jar as lib/main/com.fasterxml.woodstox.woodstox-core-5.2.1.jar
2026-07-17T20:13:15.2993696Z I0717 17:13:15.298998   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/com.github.ben-manes.caffeine.caffeine-3.1.5.jar as lib/main/com.github.ben-manes.caffeine.caffeine-3.1.5.jar
2026-07-17T20:13:15.3320659Z I0717 17:13:15.331649   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/com.github.virtuald.curvesapi-1.06.jar as lib/main/com.github.virtuald.curvesapi-1.06.jar
2026-07-17T20:13:15.3376584Z I0717 17:13:15.337478   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/com.google.code.gson.gson-2.10.1.jar as lib/main/com.google.code.gson.gson-2.10.1.jar
2026-07-17T20:13:15.3516967Z I0717 17:13:15.351363   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/com.google.errorprone.error_prone_annotations-2.29.0.jar as lib/main/com.google.errorprone.error_prone_annotations-2.29.0.jar
2026-07-17T20:13:15.3518143Z I0717 17:13:15.351538   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/com.microsoft.azure.applicationinsights-agent-3.2.7.jar as lib/main/com.microsoft.azure.applicationinsights-agent-3.2.7.jar
2026-07-17T20:13:16.8716737Z .I0717 17:13:16.871190   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/com.oracle.database.ha.ons-23.3.0.23.09.jar as lib/main/com.oracle.database.ha.ons-23.3.0.23.09.jar
2026-07-17T20:13:16.8786682Z I0717 17:13:16.878109   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/com.oracle.database.ha.simplefan-23.3.0.23.09.jar as lib/main/com.oracle.database.ha.simplefan-23.3.0.23.09.jar
2026-07-17T20:13:16.8800759Z I0717 17:13:16.879947   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/com.oracle.database.jdbc.ojdbc8-12.2.0.1.jar as lib/main/com.oracle.database.jdbc.ojdbc8-12.2.0.1.jar
2026-07-17T20:13:17.0482084Z I0717 17:13:17.047838   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/com.oracle.database.jdbc.ucp-23.3.0.23.09.jar as lib/main/com.oracle.database.jdbc.ucp-23.3.0.23.09.jar
2026-07-17T20:13:17.1147738Z I0717 17:13:17.114330   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/com.oracle.database.security.oraclepki-23.3.0.23.09.jar as lib/main/com.oracle.database.security.oraclepki-23.3.0.23.09.jar
2026-07-17T20:13:17.1368843Z I0717 17:13:17.136451   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/com.oracle.database.security.osdt_cert-12.2.0.1.jar as lib/main/com.oracle.database.security.osdt_cert-12.2.0.1.jar
2026-07-17T20:13:17.1510671Z I0717 17:13:17.150619   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/com.oracle.database.security.osdt_core-12.2.0.1.jar as lib/main/com.oracle.database.security.osdt_core-12.2.0.1.jar
2026-07-17T20:13:17.1603527Z I0717 17:13:17.159976   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/com.sun.istack.istack-commons-runtime-4.1.2.jar as lib/main/com.sun.istack.istack-commons-runtime-4.1.2.jar
2026-07-17T20:13:17.1613610Z I0717 17:13:17.161133   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/com.zaxxer.SparseBitSet-1.2.jar as lib/main/com.zaxxer.SparseBitSet-1.2.jar
2026-07-17T20:13:17.1618926Z I0717 17:13:17.161784   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/commons-codec.commons-codec-1.17.1.jar as lib/main/commons-codec.commons-codec-1.17.1.jar
2026-07-17T20:13:17.1779263Z I0717 17:13:17.177550   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/commons-io.commons-io-2.16.1.jar as lib/main/commons-io.commons-io-2.16.1.jar
2026-07-17T20:13:17.2010737Z I0717 17:13:17.200524   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/de.rototor.pdfbox.graphics2d-0.30.jar as lib/main/de.rototor.pdfbox.graphics2d-0.30.jar
2026-07-17T20:13:17.2043586Z I0717 17:13:17.203633   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.agroal.agroal-api-2.4.jar as lib/main/io.agroal.agroal-api-2.4.jar
2026-07-17T20:13:17.2062504Z I0717 17:13:17.206024   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.agroal.agroal-narayana-2.4.jar as lib/main/io.agroal.agroal-narayana-2.4.jar
2026-07-17T20:13:17.2064897Z I0717 17:13:17.206192   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.agroal.agroal-pool-2.4.jar as lib/main/io.agroal.agroal-pool-2.4.jar
2026-07-17T20:13:17.2130327Z I0717 17:13:17.212350   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.netty.netty-buffer-4.1.111.Final.jar as lib/main/io.netty.netty-buffer-4.1.111.Final.jar
2026-07-17T20:13:17.2292618Z I0717 17:13:17.228246   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.netty.netty-codec-4.1.111.Final.jar as lib/main/io.netty.netty-codec-4.1.111.Final.jar
2026-07-17T20:13:17.2452249Z I0717 17:13:17.244238   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.netty.netty-codec-dns-4.1.111.Final.jar as lib/main/io.netty.netty-codec-dns-4.1.111.Final.jar
2026-07-17T20:13:17.2484368Z I0717 17:13:17.248236   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.netty.netty-codec-haproxy-4.1.111.Final.jar as lib/main/io.netty.netty-codec-haproxy-4.1.111.Final.jar
2026-07-17T20:13:17.2498430Z I0717 17:13:17.249714   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.netty.netty-codec-http-4.1.111.Final.jar as lib/main/io.netty.netty-codec-http-4.1.111.Final.jar
2026-07-17T20:13:17.2805389Z I0717 17:13:17.280102   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.netty.netty-codec-http2-4.1.111.Final.jar as lib/main/io.netty.netty-codec-http2-4.1.111.Final.jar
2026-07-17T20:13:17.3035928Z I0717 17:13:17.303122   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.netty.netty-codec-socks-4.1.111.Final.jar as lib/main/io.netty.netty-codec-socks-4.1.111.Final.jar
2026-07-17T20:13:17.3093721Z I0717 17:13:17.308991   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.netty.netty-common-4.1.111.Final.jar as lib/main/io.netty.netty-common-4.1.111.Final.jar
2026-07-17T20:13:17.3428236Z I0717 17:13:17.342393   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.netty.netty-handler-4.1.111.Final.jar as lib/main/io.netty.netty-handler-4.1.111.Final.jar
2026-07-17T20:13:17.3724682Z I0717 17:13:17.371999   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.netty.netty-handler-proxy-4.1.111.Final.jar as lib/main/io.netty.netty-handler-proxy-4.1.111.Final.jar
2026-07-17T20:13:17.3734644Z I0717 17:13:17.373303   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.netty.netty-resolver-4.1.111.Final.jar as lib/main/io.netty.netty-resolver-4.1.111.Final.jar
2026-07-17T20:13:17.3752260Z I0717 17:13:17.375028   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.netty.netty-resolver-dns-4.1.111.Final.jar as lib/main/io.netty.netty-resolver-dns-4.1.111.Final.jar
2026-07-17T20:13:17.3831318Z I0717 17:13:17.382888   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.netty.netty-transport-4.1.111.Final.jar as lib/main/io.netty.netty-transport-4.1.111.Final.jar
2026-07-17T20:13:17.4097777Z I0717 17:13:17.409351   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.netty.netty-transport-native-unix-common-4.1.111.Final.jar as lib/main/io.netty.netty-transport-native-unix-common-4.1.111.Final.jar
2026-07-17T20:13:17.4129063Z I0717 17:13:17.412585   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.opentelemetry.instrumentation.opentelemetry-instrumentation-api-2.5.0.jar as lib/main/io.opentelemetry.instrumentation.opentelemetry-instrumentation-api-2.5.0.jar
2026-07-17T20:13:17.4217296Z I0717 17:13:17.421508   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.opentelemetry.opentelemetry-api-1.39.0.jar as lib/main/io.opentelemetry.opentelemetry-api-1.39.0.jar
2026-07-17T20:13:17.4293154Z I0717 17:13:17.429039   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.opentelemetry.opentelemetry-api-incubator-1.39.0-alpha.jar as lib/main/io.opentelemetry.opentelemetry-api-incubator-1.39.0-alpha.jar
2026-07-17T20:13:17.4307290Z I0717 17:13:17.430571   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.opentelemetry.opentelemetry-context-1.39.0.jar as lib/main/io.opentelemetry.opentelemetry-context-1.39.0.jar
2026-07-17T20:13:17.4325877Z I0717 17:13:17.432440   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.opentelemetry.semconv.opentelemetry-semconv-1.25.0-alpha.jar as lib/main/io.opentelemetry.semconv.opentelemetry-semconv-1.25.0-alpha.jar
2026-07-17T20:13:17.4362424Z I0717 17:13:17.436107   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.arc.arc-3.13.0.jar as lib/main/io.quarkus.arc.arc-3.13.0.jar
2026-07-17T20:13:17.4495625Z I0717 17:13:17.449304   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.http.quarkus-http-core-5.3.0.jar as lib/main/io.quarkus.http.quarkus-http-core-5.3.0.jar
2026-07-17T20:13:17.4956784Z I0717 17:13:17.495235   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.http.quarkus-http-http-core-5.3.0.jar as lib/main/io.quarkus.http.quarkus-http-http-core-5.3.0.jar
2026-07-17T20:13:17.4973643Z I0717 17:13:17.497108   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.http.quarkus-http-servlet-5.3.0.jar as lib/main/io.quarkus.http.quarkus-http-servlet-5.3.0.jar
2026-07-17T20:13:17.5225914Z I0717 17:13:17.522197   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.http.quarkus-http-vertx-backend-5.3.0.jar as lib/main/io.quarkus.http.quarkus-http-vertx-backend-5.3.0.jar
2026-07-17T20:13:17.5245548Z I0717 17:13:17.524245   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-agroal-3.13.0.jar as lib/main/io.quarkus.quarkus-agroal-3.13.0.jar
2026-07-17T20:13:17.5277071Z I0717 17:13:17.527223   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-apache-httpclient-3.13.0.jar as lib/main/io.quarkus.quarkus-apache-httpclient-3.13.0.jar
2026-07-17T20:13:17.5278445Z I0717 17:13:17.527424   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-arc-3.13.0.jar as lib/main/io.quarkus.quarkus-arc-3.13.0.jar
2026-07-17T20:13:17.5318045Z I0717 17:13:17.531611   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-cache-3.13.0.jar as lib/main/io.quarkus.quarkus-cache-3.13.0.jar
2026-07-17T20:13:17.5349030Z I0717 17:13:17.534713   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-cache-runtime-spi-3.13.0.jar as lib/main/io.quarkus.quarkus-cache-runtime-spi-3.13.0.jar
2026-07-17T20:13:17.5375125Z I0717 17:13:17.536430   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-caffeine-3.13.0.jar as lib/main/io.quarkus.quarkus-caffeine-3.13.0.jar
2026-07-17T20:13:17.5375581Z I0717 17:13:17.536594   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-container-image-3.13.0.jar as lib/main/io.quarkus.quarkus-container-image-3.13.0.jar
2026-07-17T20:13:17.5376024Z I0717 17:13:17.536743   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-container-image-docker-3.13.0.jar as lib/main/io.quarkus.quarkus-container-image-docker-3.13.0.jar
2026-07-17T20:13:17.5376511Z I0717 17:13:17.536907   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-container-image-docker-common-3.13.0.jar as lib/main/io.quarkus.quarkus-container-image-docker-common-3.13.0.jar
2026-07-17T20:13:17.5376948Z I0717 17:13:17.536995   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-core-3.13.0.jar as lib/main/io.quarkus.quarkus-core-3.13.0.jar
2026-07-17T20:13:17.5577365Z I0717 17:13:17.557047   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-credentials-3.13.0.jar as lib/main/io.quarkus.quarkus-credentials-3.13.0.jar
2026-07-17T20:13:17.5577887Z I0717 17:13:17.557246   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-datasource-3.13.0.jar as lib/main/io.quarkus.quarkus-datasource-3.13.0.jar
2026-07-17T20:13:17.5585715Z I0717 17:13:17.558438   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-datasource-common-3.13.0.jar as lib/main/io.quarkus.quarkus-datasource-common-3.13.0.jar
2026-07-17T20:13:17.5586707Z I0717 17:13:17.558569   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-elytron-security-3.13.0.jar as lib/main/io.quarkus.quarkus-elytron-security-3.13.0.jar
2026-07-17T20:13:17.5596565Z I0717 17:13:17.559543   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-elytron-security-common-3.13.0.jar as lib/main/io.quarkus.quarkus-elytron-security-common-3.13.0.jar
2026-07-17T20:13:17.5599131Z I0717 17:13:17.559805   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-elytron-security-properties-file-3.13.0.jar as lib/main/io.quarkus.quarkus-elytron-security-properties-file-3.13.0.jar
2026-07-17T20:13:17.5609739Z I0717 17:13:17.560865   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-fs-util-0.0.10.jar as lib/main/io.quarkus.quarkus-fs-util-0.0.10.jar
2026-07-17T20:13:17.5620679Z I0717 17:13:17.561936   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-hibernate-orm-3.13.0.jar as lib/main/io.quarkus.quarkus-hibernate-orm-3.13.0.jar
2026-07-17T20:13:17.5757635Z I0717 17:13:17.574877   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-hibernate-orm-panache-3.13.0.jar as lib/main/io.quarkus.quarkus-hibernate-orm-panache-3.13.0.jar
2026-07-17T20:13:17.5758362Z I0717 17:13:17.575277   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-hibernate-orm-panache-common-3.13.0.jar as lib/main/io.quarkus.quarkus-hibernate-orm-panache-common-3.13.0.jar
2026-07-17T20:13:17.5772234Z I0717 17:13:17.577032   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-jackson-3.13.0.jar as lib/main/io.quarkus.quarkus-jackson-3.13.0.jar
2026-07-17T20:13:17.5781799Z I0717 17:13:17.578016   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-jaxb-3.13.0.jar as lib/main/io.quarkus.quarkus-jaxb-3.13.0.jar
2026-07-17T20:13:17.5797566Z I0717 17:13:17.579218   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-jaxp-3.13.0.jar as lib/main/io.quarkus.quarkus-jaxp-3.13.0.jar
2026-07-17T20:13:17.5798394Z I0717 17:13:17.579284   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-jsonp-3.13.0.jar as lib/main/io.quarkus.quarkus-jsonp-3.13.0.jar
2026-07-17T20:13:17.5804563Z I0717 17:13:17.579934   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-keycloak-authorization-3.13.0.jar as lib/main/io.quarkus.quarkus-keycloak-authorization-3.13.0.jar
2026-07-17T20:13:17.5820238Z I0717 17:13:17.581793   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-mailer-3.13.0.jar as lib/main/io.quarkus.quarkus-mailer-3.13.0.jar
2026-07-17T20:13:17.5854498Z I0717 17:13:17.585184   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-mutiny-3.13.0.jar as lib/main/io.quarkus.quarkus-mutiny-3.13.0.jar
2026-07-17T20:13:17.5856005Z I0717 17:13:17.585351   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-narayana-jta-3.13.0.jar as lib/main/io.quarkus.quarkus-narayana-jta-3.13.0.jar
2026-07-17T20:13:17.5893040Z I0717 17:13:17.589112   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-netty-3.13.0.jar as lib/main/io.quarkus.quarkus-netty-3.13.0.jar
2026-07-17T20:13:17.5923307Z I0717 17:13:17.592126   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-oidc-3.13.0.jar as lib/main/io.quarkus.quarkus-oidc-3.13.0.jar
2026-07-17T20:13:17.6102045Z I0717 17:13:17.609876   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-oidc-common-3.13.0.jar as lib/main/io.quarkus.quarkus-oidc-common-3.13.0.jar
2026-07-17T20:13:17.6118401Z I0717 17:13:17.611713   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-panache-common-3.13.0.jar as lib/main/io.quarkus.quarkus-panache-common-3.13.0.jar
2026-07-17T20:13:17.6121178Z I0717 17:13:17.612021   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-panache-hibernate-common-3.13.0.jar as lib/main/io.quarkus.quarkus-panache-hibernate-common-3.13.0.jar
2026-07-17T20:13:17.6134076Z I0717 17:13:17.613119   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-qute-3.13.0.jar as lib/main/io.quarkus.quarkus-qute-3.13.0.jar
2026-07-17T20:13:17.6180491Z I0717 17:13:17.617799   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-rest-3.13.0.jar as lib/main/io.quarkus.quarkus-rest-3.13.0.jar
2026-07-17T20:13:17.6241422Z I0717 17:13:17.623969   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-rest-client-3.13.0.jar as lib/main/io.quarkus.quarkus-rest-client-3.13.0.jar
2026-07-17T20:13:17.6282156Z I0717 17:13:17.628018   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-rest-client-config-3.13.0.jar as lib/main/io.quarkus.quarkus-rest-client-config-3.13.0.jar
2026-07-17T20:13:17.6295598Z I0717 17:13:17.629397   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-rest-client-jackson-3.13.0.jar as lib/main/io.quarkus.quarkus-rest-client-jackson-3.13.0.jar
2026-07-17T20:13:17.6307890Z I0717 17:13:17.630642   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-rest-client-jaxrs-3.13.0.jar as lib/main/io.quarkus.quarkus-rest-client-jaxrs-3.13.0.jar
2026-07-17T20:13:17.6326945Z I0717 17:13:17.632516   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-rest-common-3.13.0.jar as lib/main/io.quarkus.quarkus-rest-common-3.13.0.jar
2026-07-17T20:13:17.6339274Z I0717 17:13:17.633767   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-rest-jackson-3.13.0.jar as lib/main/io.quarkus.quarkus-rest-jackson-3.13.0.jar
2026-07-17T20:13:17.6356529Z I0717 17:13:17.635491   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-rest-jackson-common-3.13.0.jar as lib/main/io.quarkus.quarkus-rest-jackson-common-3.13.0.jar
2026-07-17T20:13:17.6366501Z I0717 17:13:17.636508   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-scheduler-3.13.0.jar as lib/main/io.quarkus.quarkus-scheduler-3.13.0.jar
2026-07-17T20:13:17.6384770Z I0717 17:13:17.638326   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-scheduler-api-3.13.0.jar as lib/main/io.quarkus.quarkus-scheduler-api-3.13.0.jar
2026-07-17T20:13:17.6395779Z I0717 17:13:17.639415   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-scheduler-common-3.13.0.jar as lib/main/io.quarkus.quarkus-scheduler-common-3.13.0.jar
2026-07-17T20:13:17.6407266Z I0717 17:13:17.640543   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-scheduler-kotlin-3.13.0.jar as lib/main/io.quarkus.quarkus-scheduler-kotlin-3.13.0.jar
2026-07-17T20:13:17.6409166Z I0717 17:13:17.640809   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-scheduler-spi-3.13.0.jar as lib/main/io.quarkus.quarkus-scheduler-spi-3.13.0.jar
2026-07-17T20:13:17.6418192Z I0717 17:13:17.641671   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-security-3.13.0.jar as lib/main/io.quarkus.quarkus-security-3.13.0.jar
2026-07-17T20:13:17.6464016Z I0717 17:13:17.646203   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-security-jpa-3.13.0.jar as lib/main/io.quarkus.quarkus-security-jpa-3.13.0.jar
2026-07-17T20:13:17.6465293Z I0717 17:13:17.646403   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-security-jpa-common-3.13.0.jar as lib/main/io.quarkus.quarkus-security-jpa-common-3.13.0.jar
2026-07-17T20:13:17.6474764Z I0717 17:13:17.647322   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-security-runtime-spi-3.13.0.jar as lib/main/io.quarkus.quarkus-security-runtime-spi-3.13.0.jar
2026-07-17T20:13:17.6486172Z I0717 17:13:17.648415   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-smallrye-context-propagation-3.13.0.jar as lib/main/io.quarkus.quarkus-smallrye-context-propagation-3.13.0.jar
2026-07-17T20:13:17.6487566Z I0717 17:13:17.648581   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-smallrye-fault-tolerance-3.13.0.jar as lib/main/io.quarkus.quarkus-smallrye-fault-tolerance-3.13.0.jar
2026-07-17T20:13:17.6494923Z I0717 17:13:17.649365   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-smallrye-health-3.13.0.jar as lib/main/io.quarkus.quarkus-smallrye-health-3.13.0.jar
2026-07-17T20:13:17.6504702Z I0717 17:13:17.650311   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-smallrye-jwt-3.13.0.jar as lib/main/io.quarkus.quarkus-smallrye-jwt-3.13.0.jar
2026-07-17T20:13:17.6513553Z I0717 17:13:17.651227   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-smallrye-jwt-build-3.13.0.jar as lib/main/io.quarkus.quarkus-smallrye-jwt-build-3.13.0.jar
2026-07-17T20:13:17.6514806Z I0717 17:13:17.651354   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-smallrye-metrics-3.13.0.jar as lib/main/io.quarkus.quarkus-smallrye-metrics-3.13.0.jar
2026-07-17T20:13:17.6558817Z I0717 17:13:17.655638   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-smallrye-openapi-3.13.0.jar as lib/main/io.quarkus.quarkus-smallrye-openapi-3.13.0.jar
2026-07-17T20:13:17.6577860Z I0717 17:13:17.657604   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-smallrye-stork-3.13.0.jar as lib/main/io.quarkus.quarkus-smallrye-stork-3.13.0.jar
2026-07-17T20:13:17.6587623Z I0717 17:13:17.658575   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-spring-aop-api-6.1.SP2.jar as lib/main/io.quarkus.quarkus-spring-aop-api-6.1.SP2.jar
2026-07-17T20:13:17.6608054Z I0717 17:13:17.660642   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-spring-beans-api-6.1.SP2.jar as lib/main/io.quarkus.quarkus-spring-beans-api-6.1.SP2.jar
2026-07-17T20:13:17.6649532Z I0717 17:13:17.664771   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-spring-boot-orm-api-3.2.jar as lib/main/io.quarkus.quarkus-spring-boot-orm-api-3.2.jar
2026-07-17T20:13:17.6650709Z I0717 17:13:17.664898   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-spring-cache-3.13.0.jar as lib/main/io.quarkus.quarkus-spring-cache-3.13.0.jar
2026-07-17T20:13:17.6657742Z I0717 17:13:17.665652   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-spring-context-api-6.1.SP2.jar as lib/main/io.quarkus.quarkus-spring-context-api-6.1.SP2.jar
2026-07-17T20:13:17.6734650Z I0717 17:13:17.673219   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-spring-core-api-6.1.SP2.jar as lib/main/io.quarkus.quarkus-spring-core-api-6.1.SP2.jar
2026-07-17T20:13:17.6854654Z I0717 17:13:17.685177   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-spring-data-commons-api-3.2.SP2.jar as lib/main/io.quarkus.quarkus-spring-data-commons-api-3.2.SP2.jar
2026-07-17T20:13:17.6904836Z I0717 17:13:17.690248   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-spring-data-jpa-3.13.0.jar as lib/main/io.quarkus.quarkus-spring-data-jpa-3.13.0.jar
2026-07-17T20:13:17.6906283Z I0717 17:13:17.690467   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-spring-data-jpa-api-3.2.SP2.jar as lib/main/io.quarkus.quarkus-spring-data-jpa-api-3.2.SP2.jar
2026-07-17T20:13:17.6909212Z I0717 17:13:17.690786   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-spring-di-3.13.0.jar as lib/main/io.quarkus.quarkus-spring-di-3.13.0.jar
2026-07-17T20:13:17.6917304Z I0717 17:13:17.691591   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-spring-security-3.13.0.jar as lib/main/io.quarkus.quarkus-spring-security-3.13.0.jar
2026-07-17T20:13:17.6928366Z I0717 17:13:17.692660   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-spring-security-core-api-6.2.jar as lib/main/io.quarkus.quarkus-spring-security-core-api-6.2.jar
2026-07-17T20:13:17.6929691Z I0717 17:13:17.692777   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-spring-web-3.13.0.jar as lib/main/io.quarkus.quarkus-spring-web-3.13.0.jar
2026-07-17T20:13:17.6931825Z I0717 17:13:17.693066   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-spring-web-api-6.1.SP2.jar as lib/main/io.quarkus.quarkus-spring-web-api-6.1.SP2.jar
2026-07-17T20:13:17.6991730Z I0717 17:13:17.698940   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-spring-web-common-3.13.0.jar as lib/main/io.quarkus.quarkus-spring-web-common-3.13.0.jar
2026-07-17T20:13:17.7000826Z I0717 17:13:17.699922   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-spring-web-rest-3.13.0.jar as lib/main/io.quarkus.quarkus-spring-web-rest-3.13.0.jar
2026-07-17T20:13:17.7003914Z I0717 17:13:17.700236   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-spring-webmvc-api-6.1.SP2.jar as lib/main/io.quarkus.quarkus-spring-webmvc-api-6.1.SP2.jar
2026-07-17T20:13:17.7005163Z I0717 17:13:17.700355   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-swagger-ui-3.13.0.jar as lib/main/io.quarkus.quarkus-swagger-ui-3.13.0.jar
2026-07-17T20:13:17.7014365Z I0717 17:13:17.701284   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-tls-registry-3.13.0.jar as lib/main/io.quarkus.quarkus-tls-registry-3.13.0.jar
2026-07-17T20:13:17.7038109Z I0717 17:13:17.703633   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-transaction-annotations-3.13.0.jar as lib/main/io.quarkus.quarkus-transaction-annotations-3.13.0.jar
2026-07-17T20:13:17.7041241Z I0717 17:13:17.704002   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-undertow-3.13.0.jar as lib/main/io.quarkus.quarkus-undertow-3.13.0.jar
2026-07-17T20:13:17.7082709Z I0717 17:13:17.708043   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-vertx-3.13.0.jar as lib/main/io.quarkus.quarkus-vertx-3.13.0.jar
2026-07-17T20:13:17.7147594Z I0717 17:13:17.714522   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-vertx-http-3.13.0.jar as lib/main/io.quarkus.quarkus-vertx-http-3.13.0.jar
2026-07-17T20:13:17.7480203Z I0717 17:13:17.746984   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.quarkus-virtual-threads-3.13.0.jar as lib/main/io.quarkus.quarkus-virtual-threads-3.13.0.jar
2026-07-17T20:13:17.7480996Z I0717 17:13:17.747485   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.qute.qute-core-3.13.0.jar as lib/main/io.quarkus.qute.qute-core-3.13.0.jar
2026-07-17T20:13:17.7655652Z I0717 17:13:17.765152   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-3.13.0.jar as lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-3.13.0.jar
2026-07-17T20:13:17.7903466Z I0717 17:13:17.789921   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-client-3.13.0.jar as lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-client-3.13.0.jar
2026-07-17T20:13:17.8041981Z I0717 17:13:17.803882   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-common-3.13.0.jar as lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-common-3.13.0.jar
2026-07-17T20:13:17.8194133Z I0717 17:13:17.819133   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-common-types-3.13.0.jar as lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-common-types-3.13.0.jar
2026-07-17T20:13:17.8194958Z I0717 17:13:17.819408   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-jackson-3.13.0.jar as lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-jackson-3.13.0.jar
2026-07-17T20:13:17.8197620Z I0717 17:13:17.819667   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-vertx-3.13.0.jar as lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-vertx-3.13.0.jar
2026-07-17T20:13:17.8219462Z I0717 17:13:17.821797   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.security.quarkus-security-2.1.0.jar as lib/main/io.quarkus.security.quarkus-security-2.1.0.jar
2026-07-17T20:13:17.8230451Z I0717 17:13:17.822932   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.quarkus.vertx.utils.quarkus-vertx-utils-3.13.0.jar as lib/main/io.quarkus.vertx.utils.quarkus-vertx-utils-3.13.0.jar
2026-07-17T20:13:17.8249675Z I0717 17:13:17.824758   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.common.smallrye-common-annotation-2.5.0.jar as lib/main/io.smallrye.common.smallrye-common-annotation-2.5.0.jar
2026-07-17T20:13:17.8250810Z I0717 17:13:17.824914   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.common.smallrye-common-classloader-2.5.0.jar as lib/main/io.smallrye.common.smallrye-common-classloader-2.5.0.jar
2026-07-17T20:13:17.8253221Z I0717 17:13:17.825197   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.common.smallrye-common-vertx-context-2.5.0.jar as lib/main/io.smallrye.common.smallrye-common-vertx-context-2.5.0.jar
2026-07-17T20:13:17.8256286Z I0717 17:13:17.825502   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.config.smallrye-config-3.9.0.jar as lib/main/io.smallrye.config.smallrye-config-3.9.0.jar
2026-07-17T20:13:17.8280337Z I0717 17:13:17.827850   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.config.smallrye-config-common-3.9.0.jar as lib/main/io.smallrye.config.smallrye-config-common-3.9.0.jar
2026-07-17T20:13:17.8281265Z I0717 17:13:17.827988   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.config.smallrye-config-core-3.9.0.jar as lib/main/io.smallrye.config.smallrye-config-core-3.9.0.jar
2026-07-17T20:13:17.8429891Z I0717 17:13:17.842610   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.config.smallrye-config-source-file-system-3.13.2.jar as lib/main/io.smallrye.config.smallrye-config-source-file-system-3.13.2.jar
2026-07-17T20:13:17.8431041Z I0717 17:13:17.842903   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.jandex-3.2.0.jar as lib/main/io.smallrye.jandex-3.2.0.jar
2026-07-17T20:13:17.8600750Z I0717 17:13:17.859691   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.reactive.mutiny-2.6.2.jar as lib/main/io.smallrye.reactive.mutiny-2.6.2.jar
2026-07-17T20:13:17.9023314Z I0717 17:13:17.901795   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.reactive.mutiny-smallrye-context-propagation-2.6.2.jar as lib/main/io.smallrye.reactive.mutiny-smallrye-context-propagation-2.6.2.jar
2026-07-17T20:13:17.9032567Z I0717 17:13:17.903066   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.reactive.mutiny-zero-flow-adapters-1.1.0.jar as lib/main/io.smallrye.reactive.mutiny-zero-flow-adapters-1.1.0.jar
2026-07-17T20:13:17.9033887Z I0717 17:13:17.903273   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-auth-common-3.14.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-auth-common-3.14.0.jar
2026-07-17T20:13:17.9060108Z I0717 17:13:17.905839   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-bridge-common-3.14.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-bridge-common-3.14.0.jar
2026-07-17T20:13:17.9060941Z I0717 17:13:17.905923   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-core-3.14.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-core-3.14.0.jar
2026-07-17T20:13:17.9211339Z I0717 17:13:17.920734   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-mail-client-3.14.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-mail-client-3.14.0.jar
2026-07-17T20:13:17.9212214Z I0717 17:13:17.920872   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-runtime-3.14.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-runtime-3.14.0.jar
2026-07-17T20:13:17.9220916Z I0717 17:13:17.921932   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-uri-template-3.14.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-uri-template-3.14.0.jar
2026-07-17T20:13:17.9231259Z I0717 17:13:17.922966   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-3.14.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-3.14.0.jar
2026-07-17T20:13:17.9306473Z I0717 17:13:17.930071   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-client-3.14.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-client-3.14.0.jar
2026-07-17T20:13:17.9325058Z I0717 17:13:17.932126   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-common-3.14.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-common-3.14.0.jar
2026-07-17T20:13:17.9335183Z I0717 17:13:17.933032   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.reactive.smallrye-reactive-converter-api-3.0.1.jar as lib/main/io.smallrye.reactive.smallrye-reactive-converter-api-3.0.1.jar
2026-07-17T20:13:17.9339501Z I0717 17:13:17.933825   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.reactive.smallrye-reactive-converter-mutiny-3.0.1.jar as lib/main/io.smallrye.reactive.smallrye-reactive-converter-mutiny-3.0.1.jar
2026-07-17T20:13:17.9346244Z I0717 17:13:17.934507   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.reactive.vertx-mutiny-generator-3.14.0.jar as lib/main/io.smallrye.reactive.vertx-mutiny-generator-3.14.0.jar
2026-07-17T20:13:17.9379523Z I0717 17:13:17.937732   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.smallrye-context-propagation-2.1.2.jar as lib/main/io.smallrye.smallrye-context-propagation-2.1.2.jar
2026-07-17T20:13:17.9423211Z I0717 17:13:17.942082   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.smallrye-context-propagation-api-2.1.2.jar as lib/main/io.smallrye.smallrye-context-propagation-api-2.1.2.jar
2026-07-17T20:13:17.9440926Z I0717 17:13:17.943263   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.smallrye-context-propagation-jta-2.1.2.jar as lib/main/io.smallrye.smallrye-context-propagation-jta-2.1.2.jar
2026-07-17T20:13:17.9441762Z I0717 17:13:17.943427   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.smallrye-context-propagation-storage-2.1.2.jar as lib/main/io.smallrye.smallrye-context-propagation-storage-2.1.2.jar
2026-07-17T20:13:17.9442212Z I0717 17:13:17.943609   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.smallrye-fault-tolerance-6.3.0.jar as lib/main/io.smallrye.smallrye-fault-tolerance-6.3.0.jar
2026-07-17T20:13:17.9500040Z I0717 17:13:17.949769   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.smallrye-fault-tolerance-api-6.3.0.jar as lib/main/io.smallrye.smallrye-fault-tolerance-api-6.3.0.jar
2026-07-17T20:13:17.9510411Z I0717 17:13:17.950858   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.smallrye-fault-tolerance-autoconfig-core-6.3.0.jar as lib/main/io.smallrye.smallrye-fault-tolerance-autoconfig-core-6.3.0.jar
2026-07-17T20:13:17.9520963Z I0717 17:13:17.951958   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.smallrye-fault-tolerance-context-propagation-6.3.0.jar as lib/main/io.smallrye.smallrye-fault-tolerance-context-propagation-6.3.0.jar
2026-07-17T20:13:17.9522575Z I0717 17:13:17.952162   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.smallrye-fault-tolerance-core-6.3.0.jar as lib/main/io.smallrye.smallrye-fault-tolerance-core-6.3.0.jar
2026-07-17T20:13:17.9618462Z I0717 17:13:17.961511   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.smallrye-fault-tolerance-mutiny-6.3.0.jar as lib/main/io.smallrye.smallrye-fault-tolerance-mutiny-6.3.0.jar
2026-07-17T20:13:17.9627425Z I0717 17:13:17.962597   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.smallrye-fault-tolerance-vertx-6.3.0.jar as lib/main/io.smallrye.smallrye-fault-tolerance-vertx-6.3.0.jar
2026-07-17T20:13:17.9628339Z I0717 17:13:17.962750   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.smallrye-health-4.1.0.jar as lib/main/io.smallrye.smallrye-health-4.1.0.jar
2026-07-17T20:13:17.9638482Z I0717 17:13:17.963736   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.smallrye-health-api-4.1.0.jar as lib/main/io.smallrye.smallrye-health-api-4.1.0.jar
2026-07-17T20:13:17.9647050Z I0717 17:13:17.964576   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.smallrye-health-provided-checks-4.1.0.jar as lib/main/io.smallrye.smallrye-health-provided-checks-4.1.0.jar
2026-07-17T20:13:17.9651643Z I0717 17:13:17.964988   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.smallrye-jwt-4.5.3.jar as lib/main/io.smallrye.smallrye-jwt-4.5.3.jar
2026-07-17T20:13:17.9704225Z I0717 17:13:17.970217   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.smallrye-jwt-build-4.5.3.jar as lib/main/io.smallrye.smallrye-jwt-build-4.5.3.jar
2026-07-17T20:13:17.9731974Z I0717 17:13:17.972891   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.smallrye-jwt-common-4.5.3.jar as lib/main/io.smallrye.smallrye-jwt-common-4.5.3.jar
2026-07-17T20:13:17.9766964Z I0717 17:13:17.974542   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.smallrye-metrics-4.0.0.jar as lib/main/io.smallrye.smallrye-metrics-4.0.0.jar
2026-07-17T20:13:17.9823119Z I0717 17:13:17.982060   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.smallrye-open-api-core-3.10.0.jar as lib/main/io.smallrye.smallrye-open-api-core-3.10.0.jar
2026-07-17T20:13:18.0063686Z I0717 17:13:18.005333   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.stork.stork-api-2.6.0.jar as lib/main/io.smallrye.stork.stork-api-2.6.0.jar
2026-07-17T20:13:18.0075272Z I0717 17:13:18.007283   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.smallrye.stork.stork-core-2.6.0.jar as lib/main/io.smallrye.stork.stork-core-2.6.0.jar
2026-07-17T20:13:18.0094666Z I0717 17:13:18.009193   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.vertx.vertx-auth-common-4.5.8.jar as lib/main/io.vertx.vertx-auth-common-4.5.8.jar
2026-07-17T20:13:18.0155821Z I0717 17:13:18.015298   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.vertx.vertx-bridge-common-4.5.8.jar as lib/main/io.vertx.vertx-bridge-common-4.5.8.jar
2026-07-17T20:13:18.0156278Z I0717 17:13:18.015411   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.vertx.vertx-codegen-4.5.8.jar as lib/main/io.vertx.vertx-codegen-4.5.8.jar
2026-07-17T20:13:18.0254956Z I0717 17:13:18.025214   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.vertx.vertx-core-4.5.8.jar as lib/main/io.vertx.vertx-core-4.5.8.jar
2026-07-17T20:13:18.1023013Z I0717 17:13:18.101782   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.vertx.vertx-mail-client-4.5.8.jar as lib/main/io.vertx.vertx-mail-client-4.5.8.jar
2026-07-17T20:13:18.1083416Z I0717 17:13:18.108008   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.vertx.vertx-uri-template-4.5.8.jar as lib/main/io.vertx.vertx-uri-template-4.5.8.jar
2026-07-17T20:13:18.1109585Z I0717 17:13:18.110713   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.vertx.vertx-web-4.5.8.jar as lib/main/io.vertx.vertx-web-4.5.8.jar
2026-07-17T20:13:18.1294354Z I0717 17:13:18.128838   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.vertx.vertx-web-client-4.5.8.jar as lib/main/io.vertx.vertx-web-client-4.5.8.jar
2026-07-17T20:13:18.1339182Z I0717 17:13:18.133683   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/io.vertx.vertx-web-common-4.5.8.jar as lib/main/io.vertx.vertx-web-common-4.5.8.jar
2026-07-17T20:13:18.1361174Z I0717 17:13:18.135435   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/jakarta.activation.jakarta.activation-api-2.0.0.jar as lib/main/jakarta.activation.jakarta.activation-api-2.0.0.jar
2026-07-17T20:13:18.1377550Z I0717 17:13:18.137577   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/jakarta.annotation.jakarta.annotation-api-3.0.0.jar as lib/main/jakarta.annotation.jakarta.annotation-api-3.0.0.jar
2026-07-17T20:13:18.1390793Z I0717 17:13:18.138515   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/jakarta.authentication.jakarta.authentication-api-3.0.0.jar as lib/main/jakarta.authentication.jakarta.authentication-api-3.0.0.jar
2026-07-17T20:13:18.1420496Z I0717 17:13:18.141441   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/jakarta.authorization.jakarta.authorization-api-2.1.0.jar as lib/main/jakarta.authorization.jakarta.authorization-api-2.1.0.jar
2026-07-17T20:13:18.1435338Z I0717 17:13:18.143121   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/jakarta.el.jakarta.el-api-5.0.1.jar as lib/main/jakarta.el.jakarta.el-api-5.0.1.jar
2026-07-17T20:13:18.1471176Z I0717 17:13:18.146951   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/jakarta.enterprise.jakarta.enterprise.cdi-api-4.1.0.jar as lib/main/jakarta.enterprise.jakarta.enterprise.cdi-api-4.1.0.jar
2026-07-17T20:13:18.1551844Z I0717 17:13:18.154960   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/jakarta.enterprise.jakarta.enterprise.lang-model-4.1.0.jar as lib/main/jakarta.enterprise.jakarta.enterprise.lang-model-4.1.0.jar
2026-07-17T20:13:18.1563895Z I0717 17:13:18.156193   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/jakarta.inject.jakarta.inject-api-2.0.1.jar as lib/main/jakarta.inject.jakarta.inject-api-2.0.1.jar
2026-07-17T20:13:18.1572373Z I0717 17:13:18.157101   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/jakarta.interceptor.jakarta.interceptor-api-2.2.0.jar as lib/main/jakarta.interceptor.jakarta.interceptor-api-2.2.0.jar
2026-07-17T20:13:18.1582012Z I0717 17:13:18.158046   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/jakarta.json.jakarta.json-api-2.1.3.jar as lib/main/jakarta.json.jakarta.json-api-2.1.3.jar
2026-07-17T20:13:18.1601028Z I0717 17:13:18.159843   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/jakarta.persistence.jakarta.persistence-api-3.1.0.jar as lib/main/jakarta.persistence.jakarta.persistence-api-3.1.0.jar
2026-07-17T20:13:18.1679927Z I0717 17:13:18.167717   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/jakarta.resource.jakarta.resource-api-2.1.0.jar as lib/main/jakarta.resource.jakarta.resource-api-2.1.0.jar
2026-07-17T20:13:18.1711537Z I0717 17:13:18.171010   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/jakarta.servlet.jakarta.servlet-api-6.0.0.jar as lib/main/jakarta.servlet.jakarta.servlet-api-6.0.0.jar
2026-07-17T20:13:18.1874004Z I0717 17:13:18.187024   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/jakarta.transaction.jakarta.transaction-api-2.0.1.jar as lib/main/jakarta.transaction.jakarta.transaction-api-2.0.1.jar
2026-07-17T20:13:18.1894397Z I0717 17:13:18.188180   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/jakarta.ws.rs.jakarta.ws.rs-api-3.1.0.jar as lib/main/jakarta.ws.rs.jakarta.ws.rs-api-3.1.0.jar
2026-07-17T20:13:18.1973639Z I0717 17:13:18.196497   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/jakarta.xml.bind.jakarta.xml.bind-api-3.0.1.jar as lib/main/jakarta.xml.bind.jakarta.xml.bind-api-3.0.1.jar
2026-07-17T20:13:18.2026485Z I0717 17:13:18.202311   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/net.bytebuddy.byte-buddy-1.14.15.jar as lib/main/net.bytebuddy.byte-buddy-1.14.15.jar
2026-07-17T20:13:18.3854502Z I0717 17:13:18.384972   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.antlr.antlr4-runtime-4.13.0.jar as lib/main/org.antlr.antlr4-runtime-4.13.0.jar
2026-07-17T20:13:18.4007622Z I0717 17:13:18.400135   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.commons.commons-collections4-4.4.jar as lib/main/org.apache.commons.commons-collections4-4.4.jar
2026-07-17T20:13:18.4340493Z I0717 17:13:18.433556   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.commons.commons-compress-1.26.2.jar as lib/main/org.apache.commons.commons-compress-1.26.2.jar
2026-07-17T20:13:18.4815110Z I0717 17:13:18.481138   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.commons.commons-lang3-3.15.0.jar as lib/main/org.apache.commons.commons-lang3-3.15.0.jar
2026-07-17T20:13:18.5116998Z I0717 17:13:18.510762   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.commons.commons-math3-3.6.1.jar as lib/main/org.apache.commons.commons-math3-3.6.1.jar
2026-07-17T20:13:18.6056486Z I0717 17:13:18.605249   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.httpcomponents.httpclient-4.5.14.jar as lib/main/org.apache.httpcomponents.httpclient-4.5.14.jar
2026-07-17T20:13:18.6416850Z I0717 17:13:18.641281   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.httpcomponents.httpcore-4.4.16.jar as lib/main/org.apache.httpcomponents.httpcore-4.4.16.jar
2026-07-17T20:13:18.6561789Z I0717 17:13:18.655831   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.pdfbox.fontbox-2.0.22.jar as lib/main/org.apache.pdfbox.fontbox-2.0.22.jar
2026-07-17T20:13:18.7174381Z I0717 17:13:18.716545   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.pdfbox.pdfbox-2.0.22.jar as lib/main/org.apache.pdfbox.pdfbox-2.0.22.jar
2026-07-17T20:13:18.8212665Z I0717 17:13:18.820903   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.poi.poi-5.0.0.jar as lib/main/org.apache.poi.poi-5.0.0.jar
2026-07-17T20:13:18.9487762Z I0717 17:13:18.948353   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.poi.poi-ooxml-5.0.0.jar as lib/main/org.apache.poi.poi-ooxml-5.0.0.jar
2026-07-17T20:13:19.0276444Z I0717 17:13:19.027259   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.poi.poi-ooxml-lite-5.0.0.jar as lib/main/org.apache.poi.poi-ooxml-lite-5.0.0.jar
2026-07-17T20:13:19.3737587Z I0717 17:13:19.372999   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.santuario.xmlsec-2.2.1.jar as lib/main/org.apache.santuario.xmlsec-2.2.1.jar
2026-07-17T20:13:19.4247987Z I0717 17:13:19.424450   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlbeans.xmlbeans-4.0.0.jar as lib/main/org.apache.xmlbeans.xmlbeans-4.0.0.jar
2026-07-17T20:13:19.5356063Z I0717 17:13:19.534865   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-all-1.13.jar as lib/main/org.apache.xmlgraphics.batik-all-1.13.jar
2026-07-17T20:13:19.7316306Z I0717 17:13:19.731183   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-anim-1.13.jar as lib/main/org.apache.xmlgraphics.batik-anim-1.13.jar
2026-07-17T20:13:19.7550299Z I0717 17:13:19.754623   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-awt-util-1.13.jar as lib/main/org.apache.xmlgraphics.batik-awt-util-1.13.jar
2026-07-17T20:13:19.7779192Z I0717 17:13:19.777549   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-bridge-1.13.jar as lib/main/org.apache.xmlgraphics.batik-bridge-1.13.jar
2026-07-17T20:13:19.8156380Z I0717 17:13:19.815281   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-codec-1.13.jar as lib/main/org.apache.xmlgraphics.batik-codec-1.13.jar
2026-07-17T20:13:19.8214331Z I0717 17:13:19.821178   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-constants-1.13.jar as lib/main/org.apache.xmlgraphics.batik-constants-1.13.jar
2026-07-17T20:13:19.8219321Z I0717 17:13:19.821837   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-css-1.13.jar as lib/main/org.apache.xmlgraphics.batik-css-1.13.jar
2026-07-17T20:13:19.8381281Z I0717 17:13:19.837780   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-dom-1.13.jar as lib/main/org.apache.xmlgraphics.batik-dom-1.13.jar
2026-07-17T20:13:19.8469254Z I0717 17:13:19.846707   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-ext-1.13.jar as lib/main/org.apache.xmlgraphics.batik-ext-1.13.jar
2026-07-17T20:13:19.8479458Z I0717 17:13:19.847781   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-extension-1.13.jar as lib/main/org.apache.xmlgraphics.batik-extension-1.13.jar
2026-07-17T20:13:19.8517432Z I0717 17:13:19.851610   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-gui-util-1.13.jar as lib/main/org.apache.xmlgraphics.batik-gui-util-1.13.jar
2026-07-17T20:13:19.8598732Z I0717 17:13:19.859659   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-gvt-1.13.jar as lib/main/org.apache.xmlgraphics.batik-gvt-1.13.jar
2026-07-17T20:13:19.8688285Z I0717 17:13:19.868552   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-i18n-1.13.jar as lib/main/org.apache.xmlgraphics.batik-i18n-1.13.jar
2026-07-17T20:13:19.8702069Z I0717 17:13:19.869701   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-parser-1.13.jar as lib/main/org.apache.xmlgraphics.batik-parser-1.13.jar
2026-07-17T20:13:19.8734429Z I0717 17:13:19.873051   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-rasterizer-1.13.jar as lib/main/org.apache.xmlgraphics.batik-rasterizer-1.13.jar
2026-07-17T20:13:19.8735237Z I0717 17:13:19.873337   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-rasterizer-ext-1.13.jar as lib/main/org.apache.xmlgraphics.batik-rasterizer-ext-1.13.jar
2026-07-17T20:13:19.8742093Z I0717 17:13:19.874067   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-script-1.13.jar as lib/main/org.apache.xmlgraphics.batik-script-1.13.jar
2026-07-17T20:13:19.8753023Z I0717 17:13:19.875172   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-shared-resources-1.13.jar as lib/main/org.apache.xmlgraphics.batik-shared-resources-1.13.jar
2026-07-17T20:13:19.8754110Z I0717 17:13:19.875303   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-slideshow-1.13.jar as lib/main/org.apache.xmlgraphics.batik-slideshow-1.13.jar
2026-07-17T20:13:19.8754995Z I0717 17:13:19.875436   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-squiggle-1.13.jar as lib/main/org.apache.xmlgraphics.batik-squiggle-1.13.jar
2026-07-17T20:13:19.8774134Z I0717 17:13:19.876411   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-squiggle-ext-1.13.jar as lib/main/org.apache.xmlgraphics.batik-squiggle-ext-1.13.jar
2026-07-17T20:13:19.8775301Z I0717 17:13:19.876581   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-svg-dom-1.13.jar as lib/main/org.apache.xmlgraphics.batik-svg-dom-1.13.jar
2026-07-17T20:13:19.8886287Z I0717 17:13:19.888375   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-svgbrowser-1.13.jar as lib/main/org.apache.xmlgraphics.batik-svgbrowser-1.13.jar
2026-07-17T20:13:19.9129887Z I0717 17:13:19.912608   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-svggen-1.13.jar as lib/main/org.apache.xmlgraphics.batik-svggen-1.13.jar
2026-07-17T20:13:19.9242422Z I0717 17:13:19.923621   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-svgpp-1.13.jar as lib/main/org.apache.xmlgraphics.batik-svgpp-1.13.jar
2026-07-17T20:13:19.9243335Z I0717 17:13:19.923806   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-svgrasterizer-1.13.jar as lib/main/org.apache.xmlgraphics.batik-svgrasterizer-1.13.jar
2026-07-17T20:13:19.9266484Z I0717 17:13:19.926431   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-swing-1.13.jar as lib/main/org.apache.xmlgraphics.batik-swing-1.13.jar
2026-07-17T20:13:19.9354682Z I0717 17:13:19.935160   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-transcoder-1.13.jar as lib/main/org.apache.xmlgraphics.batik-transcoder-1.13.jar
2026-07-17T20:13:19.9413287Z I0717 17:13:19.941002   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-ttf2svg-1.13.jar as lib/main/org.apache.xmlgraphics.batik-ttf2svg-1.13.jar
2026-07-17T20:13:19.9421589Z I0717 17:13:19.941981   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-util-1.13.jar as lib/main/org.apache.xmlgraphics.batik-util-1.13.jar
2026-07-17T20:13:19.9475976Z I0717 17:13:19.947278   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.batik-xml-1.13.jar as lib/main/org.apache.xmlgraphics.batik-xml-1.13.jar
2026-07-17T20:13:19.9499247Z I0717 17:13:19.949688   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.apache.xmlgraphics.xmlgraphics-commons-2.4.jar as lib/main/org.apache.xmlgraphics.xmlgraphics-commons-2.4.jar
2026-07-17T20:13:19.9820505Z I0717 17:13:19.981570   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.bitbucket.b_c.jose4j-0.9.6.jar as lib/main/org.bitbucket.b_c.jose4j-0.9.6.jar
2026-07-17T20:13:19.9970835Z I0717 17:13:19.996586   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.bouncycastle.bcpkix-jdk15on-1.68.jar as lib/main/org.bouncycastle.bcpkix-jdk15on-1.68.jar
2026-07-17T20:13:20.0341936Z I0717 17:13:20.033780   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.bouncycastle.bcprov-jdk15on-1.68.jar as lib/main/org.bouncycastle.bcprov-jdk15on-1.68.jar
2026-07-17T20:13:20.2880717Z I0717 17:13:20.287546   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.codehaus.woodstox.stax2-api-4.2.jar as lib/main/org.codehaus.woodstox.stax2-api-4.2.jar
2026-07-17T20:13:20.2960645Z I0717 17:13:20.295649   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.eclipse.angus.angus-activation-2.0.2.jar as lib/main/org.eclipse.angus.angus-activation-2.0.2.jar
2026-07-17T20:13:20.2970231Z I0717 17:13:20.296869   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.eclipse.microprofile.config.microprofile-config-api-3.1.jar as lib/main/org.eclipse.microprofile.config.microprofile-config-api-3.1.jar
2026-07-17T20:13:20.2984899Z I0717 17:13:20.298153   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.eclipse.microprofile.context-propagation.microprofile-context-propagation-api-1.3.jar as lib/main/org.eclipse.microprofile.context-propagation.microprofile-context-propagation-api-1.3.jar
2026-07-17T20:13:20.2990992Z I0717 17:13:20.298948   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.eclipse.microprofile.fault-tolerance.microprofile-fault-tolerance-api-4.0.2.jar as lib/main/org.eclipse.microprofile.fault-tolerance.microprofile-fault-tolerance-api-4.0.2.jar
2026-07-17T20:13:20.2999696Z I0717 17:13:20.299843   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.eclipse.microprofile.health.microprofile-health-api-4.0.1.jar as lib/main/org.eclipse.microprofile.health.microprofile-health-api-4.0.1.jar
2026-07-17T20:13:20.3013033Z I0717 17:13:20.301144   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.eclipse.microprofile.jwt.microprofile-jwt-auth-api-2.1.jar as lib/main/org.eclipse.microprofile.jwt.microprofile-jwt-auth-api-2.1.jar
2026-07-17T20:13:20.3014157Z I0717 17:13:20.301263   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.eclipse.microprofile.metrics.microprofile-metrics-api-4.0.1.jar as lib/main/org.eclipse.microprofile.metrics.microprofile-metrics-api-4.0.1.jar
2026-07-17T20:13:20.3031545Z I0717 17:13:20.302964   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.eclipse.microprofile.openapi.microprofile-openapi-api-3.1.1.jar as lib/main/org.eclipse.microprofile.openapi.microprofile-openapi-api-3.1.1.jar
2026-07-17T20:13:20.3079154Z I0717 17:13:20.307626   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.eclipse.microprofile.reactive-streams-operators.microprofile-reactive-streams-operators-api-3.0.jar as lib/main/org.eclipse.microprofile.reactive-streams-operators.microprofile-reactive-streams-operators-api-3.0.jar
2026-07-17T20:13:20.3098393Z I0717 17:13:20.309663   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.eclipse.microprofile.rest.client.microprofile-rest-client-api-3.0.1.jar as lib/main/org.eclipse.microprofile.rest.client.microprofile-rest-client-api-3.0.1.jar
2026-07-17T20:13:20.3108733Z I0717 17:13:20.310718   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.eclipse.parsson.parsson-1.1.6.jar as lib/main/org.eclipse.parsson.parsson-1.1.6.jar
2026-07-17T20:13:20.3175406Z I0717 17:13:20.317257   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.glassfish.expressly.expressly-5.0.0.jar as lib/main/org.glassfish.expressly.expressly-5.0.0.jar
2026-07-17T20:13:20.3251574Z I0717 17:13:20.324866   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.glassfish.jaxb.jaxb-core-4.0.5.jar as lib/main/org.glassfish.jaxb.jaxb-core-4.0.5.jar
2026-07-17T20:13:20.3313492Z I0717 17:13:20.331061   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.glassfish.jaxb.jaxb-runtime-3.0.1.jar as lib/main/org.glassfish.jaxb.jaxb-runtime-3.0.1.jar
2026-07-17T20:13:20.3711608Z I0717 17:13:20.370732   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.glassfish.jaxb.txw2-4.0.5.jar as lib/main/org.glassfish.jaxb.txw2-4.0.5.jar
2026-07-17T20:13:20.3745367Z I0717 17:13:20.374312   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.hibernate.common.hibernate-commons-annotations-6.0.6.Final.jar as lib/main/org.hibernate.common.hibernate-commons-annotations-6.0.6.Final.jar
2026-07-17T20:13:20.3773966Z I0717 17:13:20.377186   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.hibernate.orm.hibernate-core-6.5.2.Final.jar as lib/main/org.hibernate.orm.hibernate-core-6.5.2.Final.jar
2026-07-17T20:13:20.8758194Z I0717 17:13:20.875182   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.hibernate.orm.hibernate-graalvm-6.5.2.Final.jar as lib/main/org.hibernate.orm.hibernate-graalvm-6.5.2.Final.jar
2026-07-17T20:13:20.8758722Z I0717 17:13:20.875317   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.hibernate.quarkus-local-cache-0.3.0.jar as lib/main/org.hibernate.quarkus-local-cache-0.3.0.jar
2026-07-17T20:13:20.8795806Z I0717 17:13:20.878981   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.jboss.invocation.jboss-invocation-2.0.0.Final.jar as lib/main/org.jboss.invocation.jboss-invocation-2.0.0.Final.jar
2026-07-17T20:13:20.8824881Z I0717 17:13:20.882347   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.jboss.jboss-transaction-spi-8.0.0.Final.jar as lib/main/org.jboss.jboss-transaction-spi-8.0.0.Final.jar
2026-07-17T20:13:20.8828551Z I0717 17:13:20.882769   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.jboss.logging.commons-logging-jboss-logging-1.0.0.Final.jar as lib/main/org.jboss.logging.commons-logging-jboss-logging-1.0.0.Final.jar
2026-07-17T20:13:20.8844870Z I0717 17:13:20.884347   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.jboss.logging.jboss-logging-annotations-3.0.0.Final.jar as lib/main/org.jboss.logging.jboss-logging-annotations-3.0.0.Final.jar
2026-07-17T20:13:20.8847379Z I0717 17:13:20.884654   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.jboss.narayana.jta.narayana-jta-7.0.2.Final.jar as lib/main/org.jboss.narayana.jta.narayana-jta-7.0.2.Final.jar
2026-07-17T20:13:20.9295754Z I0717 17:13:20.928878   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.jboss.narayana.jts.narayana-jts-integration-7.0.2.Final.jar as lib/main/org.jboss.narayana.jts.narayana-jts-integration-7.0.2.Final.jar
2026-07-17T20:13:20.9319228Z I0717 17:13:20.931782   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.jboss.slf4j.slf4j-jboss-logmanager-2.0.0.Final.jar as lib/main/org.jboss.slf4j.slf4j-jboss-logmanager-2.0.0.Final.jar
2026-07-17T20:13:20.9320495Z I0717 17:13:20.931977   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.jboss.threads.jboss-threads-3.6.1.Final.jar as lib/main/org.jboss.threads.jboss-threads-3.6.1.Final.jar
2026-07-17T20:13:20.9377281Z I0717 17:13:20.936918   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.jctools.jctools-core-4.0.5.jar as lib/main/org.jctools.jctools-core-4.0.5.jar
2026-07-17T20:13:20.9588864Z I0717 17:13:20.958568   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.keycloak.keycloak-adapter-spi-25.0.0.jar as lib/main/org.keycloak.keycloak-adapter-spi-25.0.0.jar
2026-07-17T20:13:20.9590079Z I0717 17:13:20.958720   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.keycloak.keycloak-authz-client-25.0.0.jar as lib/main/org.keycloak.keycloak-authz-client-25.0.0.jar
2026-07-17T20:13:20.9624629Z I0717 17:13:20.962098   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.keycloak.keycloak-common-25.0.0.jar as lib/main/org.keycloak.keycloak-common-25.0.0.jar
2026-07-17T20:13:20.9702077Z I0717 17:13:20.969956   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.keycloak.keycloak-core-25.0.0.jar as lib/main/org.keycloak.keycloak-core-25.0.0.jar
2026-07-17T20:13:20.9896396Z I0717 17:13:20.989231   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.keycloak.keycloak-policy-enforcer-25.0.0.jar as lib/main/org.keycloak.keycloak-policy-enforcer-25.0.0.jar
2026-07-17T20:13:20.9920831Z I0717 17:13:20.991937   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.modelmapper.modelmapper-2.3.0.jar as lib/main/org.modelmapper.modelmapper-2.3.0.jar
2026-07-17T20:13:21.1438983Z .I0717 17:13:21.143488   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.reactivestreams.reactive-streams-1.0.4.jar as lib/main/org.reactivestreams.reactive-streams-1.0.4.jar
2026-07-17T20:13:21.1440096Z I0717 17:13:21.143877   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.slf4j.jcl-over-slf4j-1.7.30.jar as lib/main/org.slf4j.jcl-over-slf4j-1.7.30.jar
2026-07-17T20:13:21.1449139Z I0717 17:13:21.144800   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.slf4j.slf4j-api-2.0.6.jar as lib/main/org.slf4j.slf4j-api-2.0.6.jar
2026-07-17T20:13:21.1472511Z I0717 17:13:21.147084   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.wildfly.common.wildfly-common-1.7.0.Final.jar as lib/main/org.wildfly.common.wildfly-common-1.7.0.Final.jar
2026-07-17T20:13:21.1618405Z I0717 17:13:21.161347   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.wildfly.security.wildfly-elytron-asn1-2.5.0.Final.jar as lib/main/org.wildfly.security.wildfly-elytron-asn1-2.5.0.Final.jar
2026-07-17T20:13:21.1630871Z I0717 17:13:21.162973   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.wildfly.security.wildfly-elytron-auth-2.5.0.Final.jar as lib/main/org.wildfly.security.wildfly-elytron-auth-2.5.0.Final.jar
2026-07-17T20:13:21.1632264Z I0717 17:13:21.163147   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.wildfly.security.wildfly-elytron-auth-server-2.5.0.Final.jar as lib/main/org.wildfly.security.wildfly-elytron-auth-server-2.5.0.Final.jar
2026-07-17T20:13:21.1755814Z I0717 17:13:21.175311   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.wildfly.security.wildfly-elytron-base-2.5.0.Final.jar as lib/main/org.wildfly.security.wildfly-elytron-base-2.5.0.Final.jar
2026-07-17T20:13:21.1771229Z I0717 17:13:21.177017   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.wildfly.security.wildfly-elytron-credential-2.5.0.Final.jar as lib/main/org.wildfly.security.wildfly-elytron-credential-2.5.0.Final.jar
2026-07-17T20:13:21.1832258Z I0717 17:13:21.182994   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.wildfly.security.wildfly-elytron-encryption-2.5.0.Final.jar as lib/main/org.wildfly.security.wildfly-elytron-encryption-2.5.0.Final.jar
2026-07-17T20:13:21.1840069Z I0717 17:13:21.183895   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.wildfly.security.wildfly-elytron-keystore-2.5.0.Final.jar as lib/main/org.wildfly.security.wildfly-elytron-keystore-2.5.0.Final.jar
2026-07-17T20:13:21.1859116Z I0717 17:13:21.185699   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.wildfly.security.wildfly-elytron-password-impl-2.5.0.Final.jar as lib/main/org.wildfly.security.wildfly-elytron-password-impl-2.5.0.Final.jar
2026-07-17T20:13:21.1909519Z I0717 17:13:21.190778   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.wildfly.security.wildfly-elytron-permission-2.5.0.Final.jar as lib/main/org.wildfly.security.wildfly-elytron-permission-2.5.0.Final.jar
2026-07-17T20:13:21.1927107Z I0717 17:13:21.192580   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.wildfly.security.wildfly-elytron-provider-util-2.5.0.Final.jar as lib/main/org.wildfly.security.wildfly-elytron-provider-util-2.5.0.Final.jar
2026-07-17T20:13:21.1944054Z I0717 17:13:21.194219   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.wildfly.security.wildfly-elytron-realm-2.5.0.Final.jar as lib/main/org.wildfly.security.wildfly-elytron-realm-2.5.0.Final.jar
2026-07-17T20:13:21.1994556Z I0717 17:13:21.199250   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.wildfly.security.wildfly-elytron-util-2.5.0.Final.jar as lib/main/org.wildfly.security.wildfly-elytron-util-2.5.0.Final.jar
2026-07-17T20:13:21.2018080Z I0717 17:13:21.201672   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.wildfly.security.wildfly-elytron-x500-2.5.0.Final.jar as lib/main/org.wildfly.security.wildfly-elytron-x500-2.5.0.Final.jar
2026-07-17T20:13:21.2029399Z I0717 17:13:21.202815   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.wildfly.security.wildfly-elytron-x500-cert-2.5.0.Final.jar as lib/main/org.wildfly.security.wildfly-elytron-x500-cert-2.5.0.Final.jar
2026-07-17T20:13:21.2060536Z I0717 17:13:21.205917   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.wildfly.security.wildfly-elytron-x500-cert-util-2.5.0.Final.jar as lib/main/org.wildfly.security.wildfly-elytron-x500-cert-util-2.5.0.Final.jar
2026-07-17T20:13:21.2061813Z I0717 17:13:21.206080   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/org.yaml.snakeyaml-2.2.jar as lib/main/org.yaml.snakeyaml-2.2.jar
2026-07-17T20:13:21.2210615Z I0717 17:13:21.220858   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/xalan.serializer-2.7.2.jar as lib/main/xalan.serializer-2.7.2.jar
2026-07-17T20:13:21.2332784Z I0717 17:13:21.232981   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/xalan.xalan-2.7.2.jar as lib/main/xalan.xalan-2.7.2.jar
2026-07-17T20:13:21.3824087Z I0717 17:13:21.381832   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/xml-apis.xml-apis-1.4.01.jar as lib/main/xml-apis.xml-apis-1.4.01.jar
2026-07-17T20:13:21.3920815Z I0717 17:13:21.391685   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/lib/main/xml-apis.xml-apis-ext-1.3.04.jar as lib/main/xml-apis.xml-apis-ext-1.3.04.jar
2026-07-17T20:13:21.3965195Z I0717 17:13:21.396167   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/quarkus as quarkus
2026-07-17T20:13:21.3966021Z I0717 17:13:21.396446   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/quarkus/generated-bytecode.jar as quarkus/generated-bytecode.jar
2026-07-17T20:13:21.4967069Z I0717 17:13:21.493580   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/quarkus/quarkus-application.dat as quarkus/quarkus-application.dat
2026-07-17T20:13:21.5005818Z I0717 17:13:21.500242   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/quarkus/transformed-bytecode.jar as quarkus/transformed-bytecode.jar
2026-07-17T20:13:21.5142681Z I0717 17:13:21.513130   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/quarkus-app-dependencies.txt as quarkus-app-dependencies.txt
2026-07-17T20:13:21.5143204Z I0717 17:13:21.513507   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/quarkus-run.jar as quarkus-run.jar
2026-07-17T20:13:21.5143542Z I0717 17:13:21.513606   70238 tar.go:312] Adding to tar: /opt/ads-agent/work_ads/7189/a/sisgf-api-14-0-1-1.zip as sisgf-api-14-0-1-1.zip
2026-07-17T20:13:24.7533057Z 
2026-07-17T20:13:24.7533930Z Uploading finished
2026-07-17T20:13:24.7534371Z build.build.openshift.io/sisgf-api-71 started
2026-07-17T20:13:24.7666761Z Adding cluster TLS certificate authority to trust store
2026-07-17T20:13:24.7666967Z Receiving source from STDIN as archive ...
2026-07-17T20:13:26.1042332Z Adding cluster TLS certificate authority to trust store
2026-07-17T20:13:27.1120066Z Adding cluster TLS certificate authority to trust store
2026-07-17T20:13:27.5205508Z time="2026-07-17T20:13:27Z" level=info msg="Not using native diff for overlay, this may cause degraded performance for building images: kernel has CONFIG_OVERLAY_FS_REDIRECT_DIR enabled"
2026-07-17T20:13:27.5205849Z I0717 20:13:27.518778       1 defaults.go:102] Defaulting to storage driver "overlay" with options [mountopt=metacopy=on].
2026-07-17T20:13:27.5598740Z Caching blobs under "/var/cache/blobs".
2026-07-17T20:13:27.5609586Z Trying to pull image-registry.openshift-image-registry.svc:5000/openshift/quarkus-java-binary-s2i@sha256:c14dd0ad9ae18713c127b5f98c9b2f2a4d85ce5215bc6e659432b7c112e6ef25...
2026-07-17T20:13:27.6554172Z Getting image source signatures
2026-07-17T20:13:27.7347621Z Copying blob sha256:0a9a2db04f3ebe8121912deecd1a66d98a4ff35c7a3ee57e3eeffcb667119be1
2026-07-17T20:13:27.7537169Z Copying blob sha256:c98bbacb82bbf386496c2e0ef89b288bc8782dd9ae664dddcb285cf0965ba7f2
2026-07-17T20:13:27.7663591Z Copying blob sha256:e1c363c96d760cb85e197cc8e2ab950760067935b29e7c098ae51ed371f5b0cd
2026-07-17T20:13:27.7777126Z Copying blob sha256:7f24bdb73d536337c7d82dee9c11e09acd3bacb0e1a76e98c6e82a8208e82284
2026-07-17T20:13:27.7909282Z Copying blob sha256:24dafab7f594e7a2b9e71b74932f6f72d2e31ac8f84fbd5062d173e63637b237
2026-07-17T20:13:27.8003703Z Copying blob sha256:264aaa453271eaaf6bc92b521f62e38cbda4f01e1a3fbf50abdb8b466be58a64
2026-07-17T20:13:28.1024250Z Copying blob sha256:4e0cd4f607fede7693f7eb61b31b84c051e5897ce5a096534ed90dc4808e5523
2026-07-17T20:13:28.1122482Z Copying blob sha256:62d739cb3ca9a7f2a63e12f99c516e6432170af671b061195e6eafa7e864d6a2
2026-07-17T20:13:28.1416750Z Copying blob sha256:067039afffe5f5aa56bc578e5d9256b8b0055763a32c54a38a73b969a8fd4f13
2026-07-17T20:13:28.1536880Z Copying blob sha256:586ae232f6757fb4248eda7dca86bf361d076242d052ee30965fec2eb1ea5a1c
2026-07-17T20:13:28.1742731Z Copying blob sha256:9d5b85cf24e32083e165099afcc1bd9cc0a57a764f9077301e686e2d27f0eb2c
2026-07-17T20:13:28.3484958Z Copying blob sha256:7749ffa7020405743e3e0425d93720455a83619d343e217645f48f948260ab49
2026-07-17T20:13:28.3787455Z Copying blob sha256:da2064a8b4a27db53f236c51c89c049f993c4438da41f6c80cb24242776bf1da
2026-07-17T20:13:36.9183862Z Copying config sha256:db5724295b3ca3bdc954cddb4ae13f779ef6dc185fa6fa797276b78493e1b0b2
2026-07-17T20:13:36.9737780Z Writing manifest to image destination
2026-07-17T20:13:36.9758338Z Storing signatures
2026-07-17T20:13:51.6208301Z Generating dockerfile with builder image image-registry.openshift-image-registry.svc:5000/openshift/quarkus-java-binary-s2i@sha256:c14dd0ad9ae18713c127b5f98c9b2f2a4d85ce5215bc6e659432b7c112e6ef25
2026-07-17T20:13:51.9847462Z STEP 1/9: FROM image-registry.openshift-image-registry.svc:5000/openshift/quarkus-java-binary-s2i@sha256:c14dd0ad9ae18713c127b5f98c9b2f2a4d85ce5215bc6e659432b7c112e6ef25
2026-07-17T20:13:52.1269928Z STEP 2/9: LABEL "io.openshift.build.image"="image-registry.openshift-image-registry.svc:5000/openshift/quarkus-java-binary-s2i@sha256:c14dd0ad9ae18713c127b5f98c9b2f2a4d85ce5215bc6e659432b7c112e6ef25"       "io.openshift.build.source-location"="/tmp/build/inputs"
2026-07-17T20:13:52.1548900Z STEP 3/9: ENV OPENSHIFT_BUILD_NAME="sisgf-api-71"     OPENSHIFT_BUILD_NAMESPACE="build-images-ads"
2026-07-17T20:13:52.1801424Z STEP 4/9: USER root
2026-07-17T20:13:52.2049854Z STEP 5/9: COPY upload/src /tmp/src
2026-07-17T20:13:53.5139963Z STEP 6/9: RUN chown -R 1001:0 /tmp/src
2026-07-17T20:13:54.4383268Z STEP 7/9: USER 1001
2026-07-17T20:13:54.4645185Z STEP 8/9: RUN /usr/local/s2i/assemble
2026-07-17T20:13:54.9667660Z + LOCAL_SOURCE_DIR=/tmp/src
2026-07-17T20:13:54.9668548Z + DEPLOY_DIR=/deployments
2026-07-17T20:13:54.9668975Z + copy_artifacts deployments
2026-07-17T20:13:54.9669704Z + '[' -d /tmp/src ']'
2026-07-17T20:13:54.9670022Z + echo 'Copying all WAR and EAR artifacts from /tmp/src directory into /deployments for later deployment...'
2026-07-17T20:13:54.9670210Z Copying all WAR and EAR artifacts from /tmp/src directory into /deployments for later deployment...
2026-07-17T20:13:54.9670637Z + cp -rfv '/tmp/src/*-runner.jar' /tmp/src/quarkus-run.jar /tmp/src/app /tmp/src/lib /tmp/src/quarkus /tmp/src/quarkus-app-dependencies.txt /tmp/src/quarkus-run.jar /tmp/src/sisgf-api-14-0-1-1.zip /deployments
2026-07-17T20:13:54.9729629Z '/tmp/src/quarkus-run.jar' -> '/deployments/quarkus-run.jar'
2026-07-17T20:13:54.9729914Z '/tmp/src/app' -> '/deployments/app'
2026-07-17T20:13:54.9730156Z '/tmp/src/app/sisgf-api-11.01.01.01.jar' -> '/deployments/app/sisgf-api-11.01.01.01.jar'
2026-07-17T20:13:54.9730352Z '/tmp/src/lib' -> '/deployments/lib'
2026-07-17T20:13:54.9730542Z '/tmp/src/lib/boot' -> '/deployments/lib/boot'
2026-07-17T20:13:54.9730786Z '/tmp/src/lib/boot/io.github.crac.org-crac-0.1.3.jar' -> '/deployments/lib/boot/io.github.crac.org-crac-0.1.3.jar'
2026-07-17T20:13:54.9731091Z '/tmp/src/lib/boot/io.quarkus.quarkus-bootstrap-runner-3.13.0.jar' -> '/deployments/lib/boot/io.quarkus.quarkus-bootstrap-runner-3.13.0.jar'
2026-07-17T20:13:54.9731407Z '/tmp/src/lib/boot/io.quarkus.quarkus-classloader-commons-3.13.0.jar' -> '/deployments/lib/boot/io.quarkus.quarkus-classloader-commons-3.13.0.jar'
2026-07-17T20:13:54.9731731Z '/tmp/src/lib/boot/io.quarkus.quarkus-development-mode-spi-3.13.0.jar' -> '/deployments/lib/boot/io.quarkus.quarkus-development-mode-spi-3.13.0.jar'
2026-07-17T20:13:54.9732066Z '/tmp/src/lib/boot/io.quarkus.quarkus-vertx-latebound-mdc-provider-3.13.0.jar' -> '/deployments/lib/boot/io.quarkus.quarkus-vertx-latebound-mdc-provider-3.13.0.jar'
2026-07-17T20:13:54.9732406Z '/tmp/src/lib/boot/io.smallrye.common.smallrye-common-constraint-2.5.0.jar' -> '/deployments/lib/boot/io.smallrye.common.smallrye-common-constraint-2.5.0.jar'
2026-07-17T20:13:54.9733144Z '/tmp/src/lib/boot/io.smallrye.common.smallrye-common-cpu-2.5.0.jar' -> '/deployments/lib/boot/io.smallrye.common.smallrye-common-cpu-2.5.0.jar'
2026-07-17T20:13:54.9733480Z '/tmp/src/lib/boot/io.smallrye.common.smallrye-common-expression-2.5.0.jar' -> '/deployments/lib/boot/io.smallrye.common.smallrye-common-expression-2.5.0.jar'
2026-07-17T20:13:54.9733806Z '/tmp/src/lib/boot/io.smallrye.common.smallrye-common-function-2.5.0.jar' -> '/deployments/lib/boot/io.smallrye.common.smallrye-common-function-2.5.0.jar'
2026-07-17T20:13:54.9734121Z '/tmp/src/lib/boot/io.smallrye.common.smallrye-common-io-2.5.0.jar' -> '/deployments/lib/boot/io.smallrye.common.smallrye-common-io-2.5.0.jar'
2026-07-17T20:13:54.9734427Z '/tmp/src/lib/boot/io.smallrye.common.smallrye-common-net-2.5.0.jar' -> '/deployments/lib/boot/io.smallrye.common.smallrye-common-net-2.5.0.jar'
2026-07-17T20:13:54.9734736Z '/tmp/src/lib/boot/io.smallrye.common.smallrye-common-os-2.5.0.jar' -> '/deployments/lib/boot/io.smallrye.common.smallrye-common-os-2.5.0.jar'
2026-07-17T20:13:54.9735042Z '/tmp/src/lib/boot/io.smallrye.common.smallrye-common-ref-2.5.0.jar' -> '/deployments/lib/boot/io.smallrye.common.smallrye-common-ref-2.5.0.jar'
2026-07-17T20:13:54.9735353Z '/tmp/src/lib/boot/org.jboss.logging.jboss-logging-3.6.0.Final.jar' -> '/deployments/lib/boot/org.jboss.logging.jboss-logging-3.6.0.Final.jar'
2026-07-17T20:13:54.9735656Z '/tmp/src/lib/boot/org.jboss.logmanager.jboss-logmanager-3.0.6.Final.jar' -> '/deployments/lib/boot/org.jboss.logmanager.jboss-logmanager-3.0.6.Final.jar'
2026-07-17T20:13:54.9735876Z '/tmp/src/lib/main' -> '/deployments/lib/main'
2026-07-17T20:13:54.9736150Z '/tmp/src/lib/main/com.aayushatharva.brotli4j.brotli4j-1.16.0.jar' -> '/deployments/lib/main/com.aayushatharva.brotli4j.brotli4j-1.16.0.jar'
2026-07-17T20:13:54.9736494Z '/tmp/src/lib/main/com.aayushatharva.brotli4j.native-linux-x86_64-1.16.0.jar' -> '/deployments/lib/main/com.aayushatharva.brotli4j.native-linux-x86_64-1.16.0.jar'
2026-07-17T20:13:54.9736921Z '/tmp/src/lib/main/com.aayushatharva.brotli4j.service-1.16.0.jar' -> '/deployments/lib/main/com.aayushatharva.brotli4j.service-1.16.0.jar'
2026-07-17T20:13:54.9737212Z '/tmp/src/lib/main/com.cronutils.cron-utils-9.2.1.jar' -> '/deployments/lib/main/com.cronutils.cron-utils-9.2.1.jar'
2026-07-17T20:13:54.9739251Z '/tmp/src/lib/main/com.fasterxml.classmate-1.7.0.jar' -> '/deployments/lib/main/com.fasterxml.classmate-1.7.0.jar'
2026-07-17T20:13:54.9739650Z '/tmp/src/lib/main/com.fasterxml.jackson.core.jackson-annotations-2.17.2.jar' -> '/deployments/lib/main/com.fasterxml.jackson.core.jackson-annotations-2.17.2.jar'
2026-07-17T20:13:54.9739990Z '/tmp/src/lib/main/com.fasterxml.jackson.core.jackson-core-2.17.2.jar' -> '/deployments/lib/main/com.fasterxml.jackson.core.jackson-core-2.17.2.jar'
2026-07-17T20:13:54.9740322Z '/tmp/src/lib/main/com.fasterxml.jackson.core.jackson-databind-2.17.2.jar' -> '/deployments/lib/main/com.fasterxml.jackson.core.jackson-databind-2.17.2.jar'
2026-07-17T20:13:54.9740687Z '/tmp/src/lib/main/com.fasterxml.jackson.dataformat.jackson-dataformat-yaml-2.17.2.jar' -> '/deployments/lib/main/com.fasterxml.jackson.dataformat.jackson-dataformat-yaml-2.17.2.jar'
2026-07-17T20:13:54.9741050Z '/tmp/src/lib/main/com.fasterxml.jackson.datatype.jackson-datatype-jdk8-2.17.2.jar' -> '/deployments/lib/main/com.fasterxml.jackson.datatype.jackson-datatype-jdk8-2.17.2.jar'
2026-07-17T20:13:54.9951556Z '/tmp/src/lib/main/com.fasterxml.jackson.datatype.jackson-datatype-jsr310-2.17.2.jar' -> '/deployments/lib/main/com.fasterxml.jackson.datatype.jackson-datatype-jsr310-2.17.2.jar'
2026-07-17T20:13:54.9952157Z '/tmp/src/lib/main/com.fasterxml.jackson.module.jackson-module-parameter-names-2.17.2.jar' -> '/deployments/lib/main/com.fasterxml.jackson.module.jackson-module-parameter-names-2.17.2.jar'
2026-07-17T20:13:54.9952532Z '/tmp/src/lib/main/com.fasterxml.woodstox.woodstox-core-5.2.1.jar' -> '/deployments/lib/main/com.fasterxml.woodstox.woodstox-core-5.2.1.jar'
2026-07-17T20:13:54.9953546Z '/tmp/src/lib/main/com.github.ben-manes.caffeine.caffeine-3.1.5.jar' -> '/deployments/lib/main/com.github.ben-manes.caffeine.caffeine-3.1.5.jar'
2026-07-17T20:13:54.9953992Z '/tmp/src/lib/main/com.github.virtuald.curvesapi-1.06.jar' -> '/deployments/lib/main/com.github.virtuald.curvesapi-1.06.jar'
2026-07-17T20:13:54.9954289Z '/tmp/src/lib/main/com.google.code.gson.gson-2.10.1.jar' -> '/deployments/lib/main/com.google.code.gson.gson-2.10.1.jar'
2026-07-17T20:13:54.9954618Z '/tmp/src/lib/main/com.google.errorprone.error_prone_annotations-2.29.0.jar' -> '/deployments/lib/main/com.google.errorprone.error_prone_annotations-2.29.0.jar'
2026-07-17T20:13:54.9954956Z '/tmp/src/lib/main/com.microsoft.azure.applicationinsights-agent-3.2.7.jar' -> '/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.2.7.jar'
2026-07-17T20:13:54.9955304Z '/tmp/src/lib/main/com.oracle.database.ha.ons-23.3.0.23.09.jar' -> '/deployments/lib/main/com.oracle.database.ha.ons-23.3.0.23.09.jar'
2026-07-17T20:13:54.9955628Z '/tmp/src/lib/main/com.oracle.database.ha.simplefan-23.3.0.23.09.jar' -> '/deployments/lib/main/com.oracle.database.ha.simplefan-23.3.0.23.09.jar'
2026-07-17T20:13:54.9956039Z '/tmp/src/lib/main/com.oracle.database.jdbc.ojdbc8-12.2.0.1.jar' -> '/deployments/lib/main/com.oracle.database.jdbc.ojdbc8-12.2.0.1.jar'
2026-07-17T20:13:54.9956347Z '/tmp/src/lib/main/com.oracle.database.jdbc.ucp-23.3.0.23.09.jar' -> '/deployments/lib/main/com.oracle.database.jdbc.ucp-23.3.0.23.09.jar'
2026-07-17T20:13:54.9956674Z '/tmp/src/lib/main/com.oracle.database.security.oraclepki-23.3.0.23.09.jar' -> '/deployments/lib/main/com.oracle.database.security.oraclepki-23.3.0.23.09.jar'
2026-07-17T20:13:54.9957005Z '/tmp/src/lib/main/com.oracle.database.security.osdt_cert-12.2.0.1.jar' -> '/deployments/lib/main/com.oracle.database.security.osdt_cert-12.2.0.1.jar'
2026-07-17T20:13:54.9957384Z '/tmp/src/lib/main/com.oracle.database.security.osdt_core-12.2.0.1.jar' -> '/deployments/lib/main/com.oracle.database.security.osdt_core-12.2.0.1.jar'
2026-07-17T20:13:54.9957965Z '/tmp/src/lib/main/com.sun.istack.istack-commons-runtime-4.1.2.jar' -> '/deployments/lib/main/com.sun.istack.istack-commons-runtime-4.1.2.jar'
2026-07-17T20:13:54.9958255Z '/tmp/src/lib/main/com.zaxxer.SparseBitSet-1.2.jar' -> '/deployments/lib/main/com.zaxxer.SparseBitSet-1.2.jar'
2026-07-17T20:13:54.9958533Z '/tmp/src/lib/main/commons-codec.commons-codec-1.17.1.jar' -> '/deployments/lib/main/commons-codec.commons-codec-1.17.1.jar'
2026-07-17T20:13:54.9958810Z '/tmp/src/lib/main/commons-io.commons-io-2.16.1.jar' -> '/deployments/lib/main/commons-io.commons-io-2.16.1.jar'
2026-07-17T20:13:54.9959095Z '/tmp/src/lib/main/de.rototor.pdfbox.graphics2d-0.30.jar' -> '/deployments/lib/main/de.rototor.pdfbox.graphics2d-0.30.jar'
2026-07-17T20:13:54.9959358Z '/tmp/src/lib/main/io.agroal.agroal-api-2.4.jar' -> '/deployments/lib/main/io.agroal.agroal-api-2.4.jar'
2026-07-17T20:13:54.9959624Z '/tmp/src/lib/main/io.agroal.agroal-narayana-2.4.jar' -> '/deployments/lib/main/io.agroal.agroal-narayana-2.4.jar'
2026-07-17T20:13:54.9959886Z '/tmp/src/lib/main/io.agroal.agroal-pool-2.4.jar' -> '/deployments/lib/main/io.agroal.agroal-pool-2.4.jar'
2026-07-17T20:13:54.9960168Z '/tmp/src/lib/main/io.netty.netty-buffer-4.1.111.Final.jar' -> '/deployments/lib/main/io.netty.netty-buffer-4.1.111.Final.jar'
2026-07-17T20:13:54.9960463Z '/tmp/src/lib/main/io.netty.netty-codec-4.1.111.Final.jar' -> '/deployments/lib/main/io.netty.netty-codec-4.1.111.Final.jar'
2026-07-17T20:13:54.9960770Z '/tmp/src/lib/main/io.netty.netty-codec-dns-4.1.111.Final.jar' -> '/deployments/lib/main/io.netty.netty-codec-dns-4.1.111.Final.jar'
2026-07-17T20:13:54.9961083Z '/tmp/src/lib/main/io.netty.netty-codec-haproxy-4.1.111.Final.jar' -> '/deployments/lib/main/io.netty.netty-codec-haproxy-4.1.111.Final.jar'
2026-07-17T20:13:54.9961392Z '/tmp/src/lib/main/io.netty.netty-codec-http-4.1.111.Final.jar' -> '/deployments/lib/main/io.netty.netty-codec-http-4.1.111.Final.jar'
2026-07-17T20:13:54.9961840Z '/tmp/src/lib/main/io.netty.netty-codec-http2-4.1.111.Final.jar' -> '/deployments/lib/main/io.netty.netty-codec-http2-4.1.111.Final.jar'
2026-07-17T20:13:54.9962141Z '/tmp/src/lib/main/io.netty.netty-codec-socks-4.1.111.Final.jar' -> '/deployments/lib/main/io.netty.netty-codec-socks-4.1.111.Final.jar'
2026-07-17T20:13:54.9975389Z '/tmp/src/lib/main/io.netty.netty-common-4.1.111.Final.jar' -> '/deployments/lib/main/io.netty.netty-common-4.1.111.Final.jar'
2026-07-17T20:13:54.9976064Z '/tmp/src/lib/main/io.netty.netty-handler-4.1.111.Final.jar' -> '/deployments/lib/main/io.netty.netty-handler-4.1.111.Final.jar'
2026-07-17T20:13:54.9977266Z '/tmp/src/lib/main/io.netty.netty-handler-proxy-4.1.111.Final.jar' -> '/deployments/lib/main/io.netty.netty-handler-proxy-4.1.111.Final.jar'
2026-07-17T20:13:54.9977846Z '/tmp/src/lib/main/io.netty.netty-resolver-4.1.111.Final.jar' -> '/deployments/lib/main/io.netty.netty-resolver-4.1.111.Final.jar'
2026-07-17T20:13:54.9978255Z '/tmp/src/lib/main/io.netty.netty-resolver-dns-4.1.111.Final.jar' -> '/deployments/lib/main/io.netty.netty-resolver-dns-4.1.111.Final.jar'
2026-07-17T20:13:54.9980475Z '/tmp/src/lib/main/io.netty.netty-transport-4.1.111.Final.jar' -> '/deployments/lib/main/io.netty.netty-transport-4.1.111.Final.jar'
2026-07-17T20:13:54.9980966Z '/tmp/src/lib/main/io.netty.netty-transport-native-unix-common-4.1.111.Final.jar' -> '/deployments/lib/main/io.netty.netty-transport-native-unix-common-4.1.111.Final.jar'
2026-07-17T20:13:54.9981377Z '/tmp/src/lib/main/io.opentelemetry.instrumentation.opentelemetry-instrumentation-api-2.5.0.jar' -> '/deployments/lib/main/io.opentelemetry.instrumentation.opentelemetry-instrumentation-api-2.5.0.jar'
2026-07-17T20:13:54.9981717Z '/tmp/src/lib/main/io.opentelemetry.opentelemetry-api-1.39.0.jar' -> '/deployments/lib/main/io.opentelemetry.opentelemetry-api-1.39.0.jar'
2026-07-17T20:13:54.9982069Z '/tmp/src/lib/main/io.opentelemetry.opentelemetry-api-incubator-1.39.0-alpha.jar' -> '/deployments/lib/main/io.opentelemetry.opentelemetry-api-incubator-1.39.0-alpha.jar'
2026-07-17T20:13:54.9983128Z '/tmp/src/lib/main/io.opentelemetry.opentelemetry-context-1.39.0.jar' -> '/deployments/lib/main/io.opentelemetry.opentelemetry-context-1.39.0.jar'
2026-07-17T20:13:54.9983580Z '/tmp/src/lib/main/io.opentelemetry.semconv.opentelemetry-semconv-1.25.0-alpha.jar' -> '/deployments/lib/main/io.opentelemetry.semconv.opentelemetry-semconv-1.25.0-alpha.jar'
2026-07-17T20:13:54.9983903Z '/tmp/src/lib/main/io.quarkus.arc.arc-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.arc.arc-3.13.0.jar'
2026-07-17T20:13:54.9984334Z '/tmp/src/lib/main/io.quarkus.http.quarkus-http-core-5.3.0.jar' -> '/deployments/lib/main/io.quarkus.http.quarkus-http-core-5.3.0.jar'
2026-07-17T20:13:54.9984757Z '/tmp/src/lib/main/io.quarkus.http.quarkus-http-http-core-5.3.0.jar' -> '/deployments/lib/main/io.quarkus.http.quarkus-http-http-core-5.3.0.jar'
2026-07-17T20:13:54.9985266Z '/tmp/src/lib/main/io.quarkus.http.quarkus-http-servlet-5.3.0.jar' -> '/deployments/lib/main/io.quarkus.http.quarkus-http-servlet-5.3.0.jar'
2026-07-17T20:13:54.9985832Z '/tmp/src/lib/main/io.quarkus.http.quarkus-http-vertx-backend-5.3.0.jar' -> '/deployments/lib/main/io.quarkus.http.quarkus-http-vertx-backend-5.3.0.jar'
2026-07-17T20:13:54.9986323Z '/tmp/src/lib/main/io.quarkus.quarkus-agroal-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-agroal-3.13.0.jar'
2026-07-17T20:13:54.9986838Z '/tmp/src/lib/main/io.quarkus.quarkus-apache-httpclient-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-apache-httpclient-3.13.0.jar'
2026-07-17T20:13:54.9987319Z '/tmp/src/lib/main/io.quarkus.quarkus-arc-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-arc-3.13.0.jar'
2026-07-17T20:13:54.9987780Z '/tmp/src/lib/main/io.quarkus.quarkus-cache-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-cache-3.13.0.jar'
2026-07-17T20:13:54.9988274Z '/tmp/src/lib/main/io.quarkus.quarkus-cache-runtime-spi-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-cache-runtime-spi-3.13.0.jar'
2026-07-17T20:13:54.9988945Z '/tmp/src/lib/main/io.quarkus.quarkus-caffeine-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-caffeine-3.13.0.jar'
2026-07-17T20:13:54.9989420Z '/tmp/src/lib/main/io.quarkus.quarkus-container-image-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-container-image-3.13.0.jar'
2026-07-17T20:13:54.9989828Z '/tmp/src/lib/main/io.quarkus.quarkus-container-image-docker-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-container-image-docker-3.13.0.jar'
2026-07-17T20:13:54.9990190Z '/tmp/src/lib/main/io.quarkus.quarkus-container-image-docker-common-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-container-image-docker-common-3.13.0.jar'
2026-07-17T20:13:54.9990551Z '/tmp/src/lib/main/io.quarkus.quarkus-core-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-core-3.13.0.jar'
2026-07-17T20:13:54.9990893Z '/tmp/src/lib/main/io.quarkus.quarkus-credentials-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-credentials-3.13.0.jar'
2026-07-17T20:13:54.9991212Z '/tmp/src/lib/main/io.quarkus.quarkus-datasource-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-datasource-3.13.0.jar'
2026-07-17T20:13:54.9991543Z '/tmp/src/lib/main/io.quarkus.quarkus-datasource-common-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-datasource-common-3.13.0.jar'
2026-07-17T20:13:54.9991878Z '/tmp/src/lib/main/io.quarkus.quarkus-elytron-security-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-elytron-security-3.13.0.jar'
2026-07-17T20:13:54.9992221Z '/tmp/src/lib/main/io.quarkus.quarkus-elytron-security-common-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-elytron-security-common-3.13.0.jar'
2026-07-17T20:13:54.9992590Z '/tmp/src/lib/main/io.quarkus.quarkus-elytron-security-properties-file-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-elytron-security-properties-file-3.13.0.jar'
2026-07-17T20:13:54.9993012Z '/tmp/src/lib/main/io.quarkus.quarkus-fs-util-0.0.10.jar' -> '/deployments/lib/main/io.quarkus.quarkus-fs-util-0.0.10.jar'
2026-07-17T20:13:54.9993421Z '/tmp/src/lib/main/io.quarkus.quarkus-hibernate-orm-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-hibernate-orm-3.13.0.jar'
2026-07-17T20:13:54.9993765Z '/tmp/src/lib/main/io.quarkus.quarkus-hibernate-orm-panache-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-hibernate-orm-panache-3.13.0.jar'
2026-07-17T20:13:54.9995049Z '/tmp/src/lib/main/io.quarkus.quarkus-hibernate-orm-panache-common-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-hibernate-orm-panache-common-3.13.0.jar'
2026-07-17T20:13:54.9995460Z '/tmp/src/lib/main/io.quarkus.quarkus-jackson-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-jackson-3.13.0.jar'
2026-07-17T20:13:54.9995762Z '/tmp/src/lib/main/io.quarkus.quarkus-jaxb-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-jaxb-3.13.0.jar'
2026-07-17T20:13:54.9996047Z '/tmp/src/lib/main/io.quarkus.quarkus-jaxp-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-jaxp-3.13.0.jar'
2026-07-17T20:13:54.9996338Z '/tmp/src/lib/main/io.quarkus.quarkus-jsonp-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-jsonp-3.13.0.jar'
2026-07-17T20:13:54.9996654Z '/tmp/src/lib/main/io.quarkus.quarkus-keycloak-authorization-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-keycloak-authorization-3.13.0.jar'
2026-07-17T20:13:54.9996953Z '/tmp/src/lib/main/io.quarkus.quarkus-mailer-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-mailer-3.13.0.jar'
2026-07-17T20:13:54.9997248Z '/tmp/src/lib/main/io.quarkus.quarkus-mutiny-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-mutiny-3.13.0.jar'
2026-07-17T20:13:54.9997544Z '/tmp/src/lib/main/io.quarkus.quarkus-narayana-jta-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-narayana-jta-3.13.0.jar'
2026-07-17T20:13:54.9997830Z '/tmp/src/lib/main/io.quarkus.quarkus-netty-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-netty-3.13.0.jar'
2026-07-17T20:13:54.9998107Z '/tmp/src/lib/main/io.quarkus.quarkus-oidc-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-oidc-3.13.0.jar'
2026-07-17T20:13:54.9998533Z '/tmp/src/lib/main/io.quarkus.quarkus-oidc-common-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-oidc-common-3.13.0.jar'
2026-07-17T20:13:54.9998836Z '/tmp/src/lib/main/io.quarkus.quarkus-panache-common-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-panache-common-3.13.0.jar'
2026-07-17T20:13:54.9999161Z '/tmp/src/lib/main/io.quarkus.quarkus-panache-hibernate-common-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-panache-hibernate-common-3.13.0.jar'
2026-07-17T20:13:54.9999456Z '/tmp/src/lib/main/io.quarkus.quarkus-qute-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-qute-3.13.0.jar'
2026-07-17T20:13:54.9999725Z '/tmp/src/lib/main/io.quarkus.quarkus-rest-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-rest-3.13.0.jar'
2026-07-17T20:13:55.0000001Z '/tmp/src/lib/main/io.quarkus.quarkus-rest-client-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-rest-client-3.13.0.jar'
2026-07-17T20:13:55.0000311Z '/tmp/src/lib/main/io.quarkus.quarkus-rest-client-config-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-rest-client-config-3.13.0.jar'
2026-07-17T20:13:55.0000634Z '/tmp/src/lib/main/io.quarkus.quarkus-rest-client-jackson-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-rest-client-jackson-3.13.0.jar'
2026-07-17T20:13:55.0000950Z '/tmp/src/lib/main/io.quarkus.quarkus-rest-client-jaxrs-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-rest-client-jaxrs-3.13.0.jar'
2026-07-17T20:13:55.0001253Z '/tmp/src/lib/main/io.quarkus.quarkus-rest-common-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-rest-common-3.13.0.jar'
2026-07-17T20:13:55.0001550Z '/tmp/src/lib/main/io.quarkus.quarkus-rest-jackson-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-rest-jackson-3.13.0.jar'
2026-07-17T20:13:55.0001863Z '/tmp/src/lib/main/io.quarkus.quarkus-rest-jackson-common-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-rest-jackson-common-3.13.0.jar'
2026-07-17T20:13:55.0008392Z '/tmp/src/lib/main/io.quarkus.quarkus-scheduler-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-scheduler-3.13.0.jar'
2026-07-17T20:13:55.0008749Z '/tmp/src/lib/main/io.quarkus.quarkus-scheduler-api-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-scheduler-api-3.13.0.jar'
2026-07-17T20:13:55.0009077Z '/tmp/src/lib/main/io.quarkus.quarkus-scheduler-common-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-scheduler-common-3.13.0.jar'
2026-07-17T20:13:55.0009466Z '/tmp/src/lib/main/io.quarkus.quarkus-scheduler-kotlin-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-scheduler-kotlin-3.13.0.jar'
2026-07-17T20:13:55.0009772Z '/tmp/src/lib/main/io.quarkus.quarkus-scheduler-spi-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-scheduler-spi-3.13.0.jar'
2026-07-17T20:13:55.0010069Z '/tmp/src/lib/main/io.quarkus.quarkus-security-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-security-3.13.0.jar'
2026-07-17T20:13:55.0010364Z '/tmp/src/lib/main/io.quarkus.quarkus-security-jpa-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-security-jpa-3.13.0.jar'
2026-07-17T20:13:55.0010678Z '/tmp/src/lib/main/io.quarkus.quarkus-security-jpa-common-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-security-jpa-common-3.13.0.jar'
2026-07-17T20:13:55.0011048Z '/tmp/src/lib/main/io.quarkus.quarkus-security-runtime-spi-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-security-runtime-spi-3.13.0.jar'
2026-07-17T20:13:55.0011401Z '/tmp/src/lib/main/io.quarkus.quarkus-smallrye-context-propagation-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-smallrye-context-propagation-3.13.0.jar'
2026-07-17T20:13:55.0011734Z '/tmp/src/lib/main/io.quarkus.quarkus-smallrye-fault-tolerance-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-smallrye-fault-tolerance-3.13.0.jar'
2026-07-17T20:13:55.0012045Z '/tmp/src/lib/main/io.quarkus.quarkus-smallrye-health-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-smallrye-health-3.13.0.jar'
2026-07-17T20:13:55.0012430Z '/tmp/src/lib/main/io.quarkus.quarkus-smallrye-jwt-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-smallrye-jwt-3.13.0.jar'
2026-07-17T20:13:55.0012738Z '/tmp/src/lib/main/io.quarkus.quarkus-smallrye-jwt-build-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-smallrye-jwt-build-3.13.0.jar'
2026-07-17T20:13:55.0013117Z '/tmp/src/lib/main/io.quarkus.quarkus-smallrye-metrics-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-smallrye-metrics-3.13.0.jar'
2026-07-17T20:13:55.0013421Z '/tmp/src/lib/main/io.quarkus.quarkus-smallrye-openapi-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-smallrye-openapi-3.13.0.jar'
2026-07-17T20:13:55.0013723Z '/tmp/src/lib/main/io.quarkus.quarkus-smallrye-stork-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-smallrye-stork-3.13.0.jar'
2026-07-17T20:13:55.0014025Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-aop-api-6.1.SP2.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-aop-api-6.1.SP2.jar'
2026-07-17T20:13:55.0014334Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-beans-api-6.1.SP2.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-beans-api-6.1.SP2.jar'
2026-07-17T20:13:55.0014637Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-boot-orm-api-3.2.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-boot-orm-api-3.2.jar'
2026-07-17T20:13:55.0014930Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-cache-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-cache-3.13.0.jar'
2026-07-17T20:13:55.0015233Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-context-api-6.1.SP2.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-context-api-6.1.SP2.jar'
2026-07-17T20:13:55.0015548Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-core-api-6.1.SP2.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-core-api-6.1.SP2.jar'
2026-07-17T20:13:55.0015861Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-data-commons-api-3.2.SP2.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-data-commons-api-3.2.SP2.jar'
2026-07-17T20:13:55.0016238Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-data-jpa-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-data-jpa-3.13.0.jar'
2026-07-17T20:13:55.0016550Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-data-jpa-api-3.2.SP2.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-data-jpa-api-3.2.SP2.jar'
2026-07-17T20:13:55.0016848Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-di-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-di-3.13.0.jar'
2026-07-17T20:13:55.0017144Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-security-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-security-3.13.0.jar'
2026-07-17T20:13:55.0017459Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-security-core-api-6.2.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-security-core-api-6.2.jar'
2026-07-17T20:13:55.0035818Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-web-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-web-3.13.0.jar'
2026-07-17T20:13:55.0036230Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-web-api-6.1.SP2.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-web-api-6.1.SP2.jar'
2026-07-17T20:13:55.0036650Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-web-common-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-web-common-3.13.0.jar'
2026-07-17T20:13:55.0036976Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-web-rest-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-web-rest-3.13.0.jar'
2026-07-17T20:13:55.0037303Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-webmvc-api-6.1.SP2.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-webmvc-api-6.1.SP2.jar'
2026-07-17T20:13:55.0037812Z '/tmp/src/lib/main/io.quarkus.quarkus-swagger-ui-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-swagger-ui-3.13.0.jar'
2026-07-17T20:13:55.0038111Z '/tmp/src/lib/main/io.quarkus.quarkus-tls-registry-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-tls-registry-3.13.0.jar'
2026-07-17T20:13:55.0038433Z '/tmp/src/lib/main/io.quarkus.quarkus-transaction-annotations-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-transaction-annotations-3.13.0.jar'
2026-07-17T20:13:55.0038932Z '/tmp/src/lib/main/io.quarkus.quarkus-undertow-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-undertow-3.13.0.jar'
2026-07-17T20:13:55.0039336Z '/tmp/src/lib/main/io.quarkus.quarkus-vertx-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-vertx-3.13.0.jar'
2026-07-17T20:13:55.0039807Z '/tmp/src/lib/main/io.quarkus.quarkus-vertx-http-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-vertx-http-3.13.0.jar'
2026-07-17T20:13:55.0040116Z '/tmp/src/lib/main/io.quarkus.quarkus-virtual-threads-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.quarkus-virtual-threads-3.13.0.jar'
2026-07-17T20:13:55.0040424Z '/tmp/src/lib/main/io.quarkus.qute.qute-core-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.qute.qute-core-3.13.0.jar'
2026-07-17T20:13:55.0040758Z '/tmp/src/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-3.13.0.jar'
2026-07-17T20:13:55.0041129Z '/tmp/src/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-client-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-client-3.13.0.jar'
2026-07-17T20:13:55.0041498Z '/tmp/src/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-common-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-common-3.13.0.jar'
2026-07-17T20:13:55.0041875Z '/tmp/src/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-common-types-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-common-types-3.13.0.jar'
2026-07-17T20:13:55.0042250Z '/tmp/src/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-jackson-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-jackson-3.13.0.jar'
2026-07-17T20:13:55.0042613Z '/tmp/src/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-vertx-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-vertx-3.13.0.jar'
2026-07-17T20:13:55.0043137Z '/tmp/src/lib/main/io.quarkus.security.quarkus-security-2.1.0.jar' -> '/deployments/lib/main/io.quarkus.security.quarkus-security-2.1.0.jar'
2026-07-17T20:13:55.0043477Z '/tmp/src/lib/main/io.quarkus.vertx.utils.quarkus-vertx-utils-3.13.0.jar' -> '/deployments/lib/main/io.quarkus.vertx.utils.quarkus-vertx-utils-3.13.0.jar'
2026-07-17T20:13:55.0043815Z '/tmp/src/lib/main/io.smallrye.common.smallrye-common-annotation-2.5.0.jar' -> '/deployments/lib/main/io.smallrye.common.smallrye-common-annotation-2.5.0.jar'
2026-07-17T20:13:55.0044156Z '/tmp/src/lib/main/io.smallrye.common.smallrye-common-classloader-2.5.0.jar' -> '/deployments/lib/main/io.smallrye.common.smallrye-common-classloader-2.5.0.jar'
2026-07-17T20:13:55.0044505Z '/tmp/src/lib/main/io.smallrye.common.smallrye-common-vertx-context-2.5.0.jar' -> '/deployments/lib/main/io.smallrye.common.smallrye-common-vertx-context-2.5.0.jar'
2026-07-17T20:13:55.0044827Z '/tmp/src/lib/main/io.smallrye.config.smallrye-config-3.9.0.jar' -> '/deployments/lib/main/io.smallrye.config.smallrye-config-3.9.0.jar'
2026-07-17T20:13:55.0045146Z '/tmp/src/lib/main/io.smallrye.config.smallrye-config-common-3.9.0.jar' -> '/deployments/lib/main/io.smallrye.config.smallrye-config-common-3.9.0.jar'
2026-07-17T20:13:55.0045467Z '/tmp/src/lib/main/io.smallrye.config.smallrye-config-core-3.9.0.jar' -> '/deployments/lib/main/io.smallrye.config.smallrye-config-core-3.9.0.jar'
2026-07-17T20:13:55.0049405Z '/tmp/src/lib/main/io.smallrye.config.smallrye-config-source-file-system-3.13.2.jar' -> '/deployments/lib/main/io.smallrye.config.smallrye-config-source-file-system-3.13.2.jar'
2026-07-17T20:13:55.0049736Z '/tmp/src/lib/main/io.smallrye.jandex-3.2.0.jar' -> '/deployments/lib/main/io.smallrye.jandex-3.2.0.jar'
2026-07-17T20:13:55.0050029Z '/tmp/src/lib/main/io.smallrye.reactive.mutiny-2.6.2.jar' -> '/deployments/lib/main/io.smallrye.reactive.mutiny-2.6.2.jar'
2026-07-17T20:13:55.0050513Z '/tmp/src/lib/main/io.smallrye.reactive.mutiny-smallrye-context-propagation-2.6.2.jar' -> '/deployments/lib/main/io.smallrye.reactive.mutiny-smallrye-context-propagation-2.6.2.jar'
2026-07-17T20:13:55.0050864Z '/tmp/src/lib/main/io.smallrye.reactive.mutiny-zero-flow-adapters-1.1.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.mutiny-zero-flow-adapters-1.1.0.jar'
2026-07-17T20:13:55.0051295Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-auth-common-3.14.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-auth-common-3.14.0.jar'
2026-07-17T20:13:55.0051668Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-bridge-common-3.14.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-bridge-common-3.14.0.jar'
2026-07-17T20:13:55.0052019Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-core-3.14.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-core-3.14.0.jar'
2026-07-17T20:13:55.0052375Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-mail-client-3.14.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-mail-client-3.14.0.jar'
2026-07-17T20:13:55.0052724Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-runtime-3.14.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-runtime-3.14.0.jar'
2026-07-17T20:13:55.0053202Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-uri-template-3.14.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-uri-template-3.14.0.jar'
2026-07-17T20:13:55.0053575Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-3.14.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-3.14.0.jar'
2026-07-17T20:13:55.0053954Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-client-3.14.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-client-3.14.0.jar'
2026-07-17T20:13:55.0054310Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-common-3.14.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-common-3.14.0.jar'
2026-07-17T20:13:55.0054729Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-reactive-converter-api-3.0.1.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-reactive-converter-api-3.0.1.jar'
2026-07-17T20:13:55.0055090Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-reactive-converter-mutiny-3.0.1.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-reactive-converter-mutiny-3.0.1.jar'
2026-07-17T20:13:55.0055430Z '/tmp/src/lib/main/io.smallrye.reactive.vertx-mutiny-generator-3.14.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.vertx-mutiny-generator-3.14.0.jar'
2026-07-17T20:13:55.0055753Z '/tmp/src/lib/main/io.smallrye.smallrye-context-propagation-2.1.2.jar' -> '/deployments/lib/main/io.smallrye.smallrye-context-propagation-2.1.2.jar'
2026-07-17T20:13:55.0056081Z '/tmp/src/lib/main/io.smallrye.smallrye-context-propagation-api-2.1.2.jar' -> '/deployments/lib/main/io.smallrye.smallrye-context-propagation-api-2.1.2.jar'
2026-07-17T20:13:55.0056413Z '/tmp/src/lib/main/io.smallrye.smallrye-context-propagation-jta-2.1.2.jar' -> '/deployments/lib/main/io.smallrye.smallrye-context-propagation-jta-2.1.2.jar'
2026-07-17T20:13:55.0056749Z '/tmp/src/lib/main/io.smallrye.smallrye-context-propagation-storage-2.1.2.jar' -> '/deployments/lib/main/io.smallrye.smallrye-context-propagation-storage-2.1.2.jar'
2026-07-17T20:13:55.0057067Z '/tmp/src/lib/main/io.smallrye.smallrye-fault-tolerance-6.3.0.jar' -> '/deployments/lib/main/io.smallrye.smallrye-fault-tolerance-6.3.0.jar'
2026-07-17T20:13:55.0057385Z '/tmp/src/lib/main/io.smallrye.smallrye-fault-tolerance-api-6.3.0.jar' -> '/deployments/lib/main/io.smallrye.smallrye-fault-tolerance-api-6.3.0.jar'
2026-07-17T20:13:55.0057723Z '/tmp/src/lib/main/io.smallrye.smallrye-fault-tolerance-autoconfig-core-6.3.0.jar' -> '/deployments/lib/main/io.smallrye.smallrye-fault-tolerance-autoconfig-core-6.3.0.jar'
2026-07-17T20:13:55.0058152Z '/tmp/src/lib/main/io.smallrye.smallrye-fault-tolerance-context-propagation-6.3.0.jar' -> '/deployments/lib/main/io.smallrye.smallrye-fault-tolerance-context-propagation-6.3.0.jar'
2026-07-17T20:13:55.0058487Z '/tmp/src/lib/main/io.smallrye.smallrye-fault-tolerance-core-6.3.0.jar' -> '/deployments/lib/main/io.smallrye.smallrye-fault-tolerance-core-6.3.0.jar'
2026-07-17T20:13:55.0077077Z '/tmp/src/lib/main/io.smallrye.smallrye-fault-tolerance-mutiny-6.3.0.jar' -> '/deployments/lib/main/io.smallrye.smallrye-fault-tolerance-mutiny-6.3.0.jar'
2026-07-17T20:13:55.0077498Z '/tmp/src/lib/main/io.smallrye.smallrye-fault-tolerance-vertx-6.3.0.jar' -> '/deployments/lib/main/io.smallrye.smallrye-fault-tolerance-vertx-6.3.0.jar'
2026-07-17T20:13:55.0077801Z '/tmp/src/lib/main/io.smallrye.smallrye-health-4.1.0.jar' -> '/deployments/lib/main/io.smallrye.smallrye-health-4.1.0.jar'
2026-07-17T20:13:55.0078153Z '/tmp/src/lib/main/io.smallrye.smallrye-health-api-4.1.0.jar' -> '/deployments/lib/main/io.smallrye.smallrye-health-api-4.1.0.jar'
2026-07-17T20:13:55.0078495Z '/tmp/src/lib/main/io.smallrye.smallrye-health-provided-checks-4.1.0.jar' -> '/deployments/lib/main/io.smallrye.smallrye-health-provided-checks-4.1.0.jar'
2026-07-17T20:13:55.0078785Z '/tmp/src/lib/main/io.smallrye.smallrye-jwt-4.5.3.jar' -> '/deployments/lib/main/io.smallrye.smallrye-jwt-4.5.3.jar'
2026-07-17T20:13:55.0079067Z '/tmp/src/lib/main/io.smallrye.smallrye-jwt-build-4.5.3.jar' -> '/deployments/lib/main/io.smallrye.smallrye-jwt-build-4.5.3.jar'
2026-07-17T20:13:55.0079362Z '/tmp/src/lib/main/io.smallrye.smallrye-jwt-common-4.5.3.jar' -> '/deployments/lib/main/io.smallrye.smallrye-jwt-common-4.5.3.jar'
2026-07-17T20:13:55.0079652Z '/tmp/src/lib/main/io.smallrye.smallrye-metrics-4.0.0.jar' -> '/deployments/lib/main/io.smallrye.smallrye-metrics-4.0.0.jar'
2026-07-17T20:13:55.0079965Z '/tmp/src/lib/main/io.smallrye.smallrye-open-api-core-3.10.0.jar' -> '/deployments/lib/main/io.smallrye.smallrye-open-api-core-3.10.0.jar'
2026-07-17T20:13:55.0080351Z '/tmp/src/lib/main/io.smallrye.stork.stork-api-2.6.0.jar' -> '/deployments/lib/main/io.smallrye.stork.stork-api-2.6.0.jar'
2026-07-17T20:13:55.0080637Z '/tmp/src/lib/main/io.smallrye.stork.stork-core-2.6.0.jar' -> '/deployments/lib/main/io.smallrye.stork.stork-core-2.6.0.jar'
2026-07-17T20:13:55.0080922Z '/tmp/src/lib/main/io.vertx.vertx-auth-common-4.5.8.jar' -> '/deployments/lib/main/io.vertx.vertx-auth-common-4.5.8.jar'
2026-07-17T20:13:55.0081281Z '/tmp/src/lib/main/io.vertx.vertx-bridge-common-4.5.8.jar' -> '/deployments/lib/main/io.vertx.vertx-bridge-common-4.5.8.jar'
2026-07-17T20:13:55.0081612Z '/tmp/src/lib/main/io.vertx.vertx-codegen-4.5.8.jar' -> '/deployments/lib/main/io.vertx.vertx-codegen-4.5.8.jar'
2026-07-17T20:13:55.0081891Z '/tmp/src/lib/main/io.vertx.vertx-core-4.5.8.jar' -> '/deployments/lib/main/io.vertx.vertx-core-4.5.8.jar'
2026-07-17T20:13:55.0082173Z '/tmp/src/lib/main/io.vertx.vertx-mail-client-4.5.8.jar' -> '/deployments/lib/main/io.vertx.vertx-mail-client-4.5.8.jar'
2026-07-17T20:13:55.0082462Z '/tmp/src/lib/main/io.vertx.vertx-uri-template-4.5.8.jar' -> '/deployments/lib/main/io.vertx.vertx-uri-template-4.5.8.jar'
2026-07-17T20:13:55.0082724Z '/tmp/src/lib/main/io.vertx.vertx-web-4.5.8.jar' -> '/deployments/lib/main/io.vertx.vertx-web-4.5.8.jar'
2026-07-17T20:13:55.0083102Z '/tmp/src/lib/main/io.vertx.vertx-web-client-4.5.8.jar' -> '/deployments/lib/main/io.vertx.vertx-web-client-4.5.8.jar'
2026-07-17T20:13:55.0083392Z '/tmp/src/lib/main/io.vertx.vertx-web-common-4.5.8.jar' -> '/deployments/lib/main/io.vertx.vertx-web-common-4.5.8.jar'
2026-07-17T20:13:55.0083699Z '/tmp/src/lib/main/jakarta.activation.jakarta.activation-api-2.0.0.jar' -> '/deployments/lib/main/jakarta.activation.jakarta.activation-api-2.0.0.jar'
2026-07-17T20:13:55.0084022Z '/tmp/src/lib/main/jakarta.annotation.jakarta.annotation-api-3.0.0.jar' -> '/deployments/lib/main/jakarta.annotation.jakarta.annotation-api-3.0.0.jar'
2026-07-17T20:13:55.0084359Z '/tmp/src/lib/main/jakarta.authentication.jakarta.authentication-api-3.0.0.jar' -> '/deployments/lib/main/jakarta.authentication.jakarta.authentication-api-3.0.0.jar'
2026-07-17T20:13:55.0084814Z '/tmp/src/lib/main/jakarta.authorization.jakarta.authorization-api-2.1.0.jar' -> '/deployments/lib/main/jakarta.authorization.jakarta.authorization-api-2.1.0.jar'
2026-07-17T20:13:55.0085116Z '/tmp/src/lib/main/jakarta.el.jakarta.el-api-5.0.1.jar' -> '/deployments/lib/main/jakarta.el.jakarta.el-api-5.0.1.jar'
2026-07-17T20:13:55.0085444Z '/tmp/src/lib/main/jakarta.enterprise.jakarta.enterprise.cdi-api-4.1.0.jar' -> '/deployments/lib/main/jakarta.enterprise.jakarta.enterprise.cdi-api-4.1.0.jar'
2026-07-17T20:13:55.0085785Z '/tmp/src/lib/main/jakarta.enterprise.jakarta.enterprise.lang-model-4.1.0.jar' -> '/deployments/lib/main/jakarta.enterprise.jakarta.enterprise.lang-model-4.1.0.jar'
2026-07-17T20:13:55.0086104Z '/tmp/src/lib/main/jakarta.inject.jakarta.inject-api-2.0.1.jar' -> '/deployments/lib/main/jakarta.inject.jakarta.inject-api-2.0.1.jar'
2026-07-17T20:13:55.0086424Z '/tmp/src/lib/main/jakarta.interceptor.jakarta.interceptor-api-2.2.0.jar' -> '/deployments/lib/main/jakarta.interceptor.jakarta.interceptor-api-2.2.0.jar'
2026-07-17T20:13:55.0277710Z '/tmp/src/lib/main/jakarta.json.jakarta.json-api-2.1.3.jar' -> '/deployments/lib/main/jakarta.json.jakarta.json-api-2.1.3.jar'
2026-07-17T20:13:55.0278114Z '/tmp/src/lib/main/jakarta.persistence.jakarta.persistence-api-3.1.0.jar' -> '/deployments/lib/main/jakarta.persistence.jakarta.persistence-api-3.1.0.jar'
2026-07-17T20:13:55.0278441Z '/tmp/src/lib/main/jakarta.resource.jakarta.resource-api-2.1.0.jar' -> '/deployments/lib/main/jakarta.resource.jakarta.resource-api-2.1.0.jar'
2026-07-17T20:13:55.0278749Z '/tmp/src/lib/main/jakarta.servlet.jakarta.servlet-api-6.0.0.jar' -> '/deployments/lib/main/jakarta.servlet.jakarta.servlet-api-6.0.0.jar'
2026-07-17T20:13:55.0279072Z '/tmp/src/lib/main/jakarta.transaction.jakarta.transaction-api-2.0.1.jar' -> '/deployments/lib/main/jakarta.transaction.jakarta.transaction-api-2.0.1.jar'
2026-07-17T20:13:55.0279642Z '/tmp/src/lib/main/jakarta.ws.rs.jakarta.ws.rs-api-3.1.0.jar' -> '/deployments/lib/main/jakarta.ws.rs.jakarta.ws.rs-api-3.1.0.jar'
2026-07-17T20:13:55.0279957Z '/tmp/src/lib/main/jakarta.xml.bind.jakarta.xml.bind-api-3.0.1.jar' -> '/deployments/lib/main/jakarta.xml.bind.jakarta.xml.bind-api-3.0.1.jar'
2026-07-17T20:13:55.0280257Z '/tmp/src/lib/main/net.bytebuddy.byte-buddy-1.14.15.jar' -> '/deployments/lib/main/net.bytebuddy.byte-buddy-1.14.15.jar'
2026-07-17T20:13:55.0280541Z '/tmp/src/lib/main/org.antlr.antlr4-runtime-4.13.0.jar' -> '/deployments/lib/main/org.antlr.antlr4-runtime-4.13.0.jar'
2026-07-17T20:13:55.0280856Z '/tmp/src/lib/main/org.apache.commons.commons-collections4-4.4.jar' -> '/deployments/lib/main/org.apache.commons.commons-collections4-4.4.jar'
2026-07-17T20:13:55.0281166Z '/tmp/src/lib/main/org.apache.commons.commons-compress-1.26.2.jar' -> '/deployments/lib/main/org.apache.commons.commons-compress-1.26.2.jar'
2026-07-17T20:13:55.0281467Z '/tmp/src/lib/main/org.apache.commons.commons-lang3-3.15.0.jar' -> '/deployments/lib/main/org.apache.commons.commons-lang3-3.15.0.jar'
2026-07-17T20:13:55.0281772Z '/tmp/src/lib/main/org.apache.commons.commons-math3-3.6.1.jar' -> '/deployments/lib/main/org.apache.commons.commons-math3-3.6.1.jar'
2026-07-17T20:13:55.0282079Z '/tmp/src/lib/main/org.apache.httpcomponents.httpclient-4.5.14.jar' -> '/deployments/lib/main/org.apache.httpcomponents.httpclient-4.5.14.jar'
2026-07-17T20:13:55.0282391Z '/tmp/src/lib/main/org.apache.httpcomponents.httpcore-4.4.16.jar' -> '/deployments/lib/main/org.apache.httpcomponents.httpcore-4.4.16.jar'
2026-07-17T20:13:55.0282679Z '/tmp/src/lib/main/org.apache.pdfbox.fontbox-2.0.22.jar' -> '/deployments/lib/main/org.apache.pdfbox.fontbox-2.0.22.jar'
2026-07-17T20:13:55.0283035Z '/tmp/src/lib/main/org.apache.pdfbox.pdfbox-2.0.22.jar' -> '/deployments/lib/main/org.apache.pdfbox.pdfbox-2.0.22.jar'
2026-07-17T20:13:55.0283308Z '/tmp/src/lib/main/org.apache.poi.poi-5.0.0.jar' -> '/deployments/lib/main/org.apache.poi.poi-5.0.0.jar'
2026-07-17T20:13:55.0283655Z '/tmp/src/lib/main/org.apache.poi.poi-ooxml-5.0.0.jar' -> '/deployments/lib/main/org.apache.poi.poi-ooxml-5.0.0.jar'
2026-07-17T20:13:55.0283942Z '/tmp/src/lib/main/org.apache.poi.poi-ooxml-lite-5.0.0.jar' -> '/deployments/lib/main/org.apache.poi.poi-ooxml-lite-5.0.0.jar'
2026-07-17T20:13:55.0284225Z '/tmp/src/lib/main/org.apache.santuario.xmlsec-2.2.1.jar' -> '/deployments/lib/main/org.apache.santuario.xmlsec-2.2.1.jar'
2026-07-17T20:13:55.0284510Z '/tmp/src/lib/main/org.apache.xmlbeans.xmlbeans-4.0.0.jar' -> '/deployments/lib/main/org.apache.xmlbeans.xmlbeans-4.0.0.jar'
2026-07-17T20:13:55.0284802Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-all-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-all-1.13.jar'
2026-07-17T20:13:55.0285100Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-anim-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-anim-1.13.jar'
2026-07-17T20:13:55.0285405Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-awt-util-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-awt-util-1.13.jar'
2026-07-17T20:13:55.0285712Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-bridge-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-bridge-1.13.jar'
2026-07-17T20:13:55.0286016Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-codec-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-codec-1.13.jar'
2026-07-17T20:13:55.0286328Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-constants-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-constants-1.13.jar'
2026-07-17T20:13:55.0286625Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-css-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-css-1.13.jar'
2026-07-17T20:13:55.0286918Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-dom-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-dom-1.13.jar'
2026-07-17T20:13:55.0287209Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-ext-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-ext-1.13.jar'
2026-07-17T20:13:55.0327807Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-extension-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-extension-1.13.jar'
2026-07-17T20:13:55.0328140Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-gui-util-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-gui-util-1.13.jar'
2026-07-17T20:13:55.0328449Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-gvt-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-gvt-1.13.jar'
2026-07-17T20:13:55.0328801Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-i18n-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-i18n-1.13.jar'
2026-07-17T20:13:55.0329169Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-parser-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-parser-1.13.jar'
2026-07-17T20:13:55.0329589Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-rasterizer-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-rasterizer-1.13.jar'
2026-07-17T20:13:55.0330060Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-rasterizer-ext-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-rasterizer-ext-1.13.jar'
2026-07-17T20:13:55.0330492Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-script-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-script-1.13.jar'
2026-07-17T20:13:55.0330826Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-shared-resources-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-shared-resources-1.13.jar'
2026-07-17T20:13:55.0331143Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-slideshow-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-slideshow-1.13.jar'
2026-07-17T20:13:55.0331449Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-squiggle-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-squiggle-1.13.jar'
2026-07-17T20:13:55.0331775Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-squiggle-ext-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-squiggle-ext-1.13.jar'
2026-07-17T20:13:55.0332230Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-svg-dom-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-svg-dom-1.13.jar'
2026-07-17T20:13:55.0332543Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-svgbrowser-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-svgbrowser-1.13.jar'
2026-07-17T20:13:55.0332865Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-svggen-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-svggen-1.13.jar'
2026-07-17T20:13:55.0333275Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-svgpp-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-svgpp-1.13.jar'
2026-07-17T20:13:55.0333595Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-svgrasterizer-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-svgrasterizer-1.13.jar'
2026-07-17T20:13:55.0333900Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-swing-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-swing-1.13.jar'
2026-07-17T20:13:55.0334239Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-transcoder-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-transcoder-1.13.jar'
2026-07-17T20:13:55.0334585Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-ttf2svg-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-ttf2svg-1.13.jar'
2026-07-17T20:13:55.0334890Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-util-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-util-1.13.jar'
2026-07-17T20:13:55.0335182Z '/tmp/src/lib/main/org.apache.xmlgraphics.batik-xml-1.13.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.batik-xml-1.13.jar'
2026-07-17T20:13:55.0335492Z '/tmp/src/lib/main/org.apache.xmlgraphics.xmlgraphics-commons-2.4.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.xmlgraphics-commons-2.4.jar'
2026-07-17T20:13:55.0335777Z '/tmp/src/lib/main/org.bitbucket.b_c.jose4j-0.9.6.jar' -> '/deployments/lib/main/org.bitbucket.b_c.jose4j-0.9.6.jar'
2026-07-17T20:13:55.0336147Z '/tmp/src/lib/main/org.bouncycastle.bcpkix-jdk15on-1.68.jar' -> '/deployments/lib/main/org.bouncycastle.bcpkix-jdk15on-1.68.jar'
2026-07-17T20:13:55.0336438Z '/tmp/src/lib/main/org.bouncycastle.bcprov-jdk15on-1.68.jar' -> '/deployments/lib/main/org.bouncycastle.bcprov-jdk15on-1.68.jar'
2026-07-17T20:13:55.0336718Z '/tmp/src/lib/main/org.codehaus.woodstox.stax2-api-4.2.jar' -> '/deployments/lib/main/org.codehaus.woodstox.stax2-api-4.2.jar'
2026-07-17T20:13:55.0337013Z '/tmp/src/lib/main/org.eclipse.angus.angus-activation-2.0.2.jar' -> '/deployments/lib/main/org.eclipse.angus.angus-activation-2.0.2.jar'
2026-07-17T20:13:55.0337348Z '/tmp/src/lib/main/org.eclipse.microprofile.config.microprofile-config-api-3.1.jar' -> '/deployments/lib/main/org.eclipse.microprofile.config.microprofile-config-api-3.1.jar'
2026-07-17T20:13:55.0406973Z '/tmp/src/lib/main/org.eclipse.microprofile.context-propagation.microprofile-context-propagation-api-1.3.jar' -> '/deployments/lib/main/org.eclipse.microprofile.context-propagation.microprofile-context-propagation-api-1.3.jar'
2026-07-17T20:13:55.0407584Z '/tmp/src/lib/main/org.eclipse.microprofile.fault-tolerance.microprofile-fault-tolerance-api-4.0.2.jar' -> '/deployments/lib/main/org.eclipse.microprofile.fault-tolerance.microprofile-fault-tolerance-api-4.0.2.jar'
2026-07-17T20:13:55.0408069Z '/tmp/src/lib/main/org.eclipse.microprofile.health.microprofile-health-api-4.0.1.jar' -> '/deployments/lib/main/org.eclipse.microprofile.health.microprofile-health-api-4.0.1.jar'
2026-07-17T20:13:55.0408584Z '/tmp/src/lib/main/org.eclipse.microprofile.jwt.microprofile-jwt-auth-api-2.1.jar' -> '/deployments/lib/main/org.eclipse.microprofile.jwt.microprofile-jwt-auth-api-2.1.jar'
2026-07-17T20:13:55.0409126Z '/tmp/src/lib/main/org.eclipse.microprofile.metrics.microprofile-metrics-api-4.0.1.jar' -> '/deployments/lib/main/org.eclipse.microprofile.metrics.microprofile-metrics-api-4.0.1.jar'
2026-07-17T20:13:55.0409679Z '/tmp/src/lib/main/org.eclipse.microprofile.openapi.microprofile-openapi-api-3.1.1.jar' -> '/deployments/lib/main/org.eclipse.microprofile.openapi.microprofile-openapi-api-3.1.1.jar'
2026-07-17T20:13:55.0410597Z '/tmp/src/lib/main/org.eclipse.microprofile.reactive-streams-operators.microprofile-reactive-streams-operators-api-3.0.jar' -> '/deployments/lib/main/org.eclipse.microprofile.reactive-streams-operators.microprofile-reactive-streams-operators-api-3.0.jar'
2026-07-17T20:13:55.0411028Z '/tmp/src/lib/main/org.eclipse.microprofile.rest.client.microprofile-rest-client-api-3.0.1.jar' -> '/deployments/lib/main/org.eclipse.microprofile.rest.client.microprofile-rest-client-api-3.0.1.jar'
2026-07-17T20:13:55.0411343Z '/tmp/src/lib/main/org.eclipse.parsson.parsson-1.1.6.jar' -> '/deployments/lib/main/org.eclipse.parsson.parsson-1.1.6.jar'
2026-07-17T20:13:55.0411645Z '/tmp/src/lib/main/org.glassfish.expressly.expressly-5.0.0.jar' -> '/deployments/lib/main/org.glassfish.expressly.expressly-5.0.0.jar'
2026-07-17T20:13:55.0411944Z '/tmp/src/lib/main/org.glassfish.jaxb.jaxb-core-4.0.5.jar' -> '/deployments/lib/main/org.glassfish.jaxb.jaxb-core-4.0.5.jar'
2026-07-17T20:13:55.0412251Z '/tmp/src/lib/main/org.glassfish.jaxb.jaxb-runtime-3.0.1.jar' -> '/deployments/lib/main/org.glassfish.jaxb.jaxb-runtime-3.0.1.jar'
2026-07-17T20:13:55.0412533Z '/tmp/src/lib/main/org.glassfish.jaxb.txw2-4.0.5.jar' -> '/deployments/lib/main/org.glassfish.jaxb.txw2-4.0.5.jar'
2026-07-17T20:13:55.0412999Z '/tmp/src/lib/main/org.hibernate.common.hibernate-commons-annotations-6.0.6.Final.jar' -> '/deployments/lib/main/org.hibernate.common.hibernate-commons-annotations-6.0.6.Final.jar'
2026-07-17T20:13:55.0413345Z '/tmp/src/lib/main/org.hibernate.orm.hibernate-core-6.5.2.Final.jar' -> '/deployments/lib/main/org.hibernate.orm.hibernate-core-6.5.2.Final.jar'
2026-07-17T20:13:55.0413671Z '/tmp/src/lib/main/org.hibernate.orm.hibernate-graalvm-6.5.2.Final.jar' -> '/deployments/lib/main/org.hibernate.orm.hibernate-graalvm-6.5.2.Final.jar'
2026-07-17T20:13:55.0413976Z '/tmp/src/lib/main/org.hibernate.quarkus-local-cache-0.3.0.jar' -> '/deployments/lib/main/org.hibernate.quarkus-local-cache-0.3.0.jar'
2026-07-17T20:13:55.0414392Z '/tmp/src/lib/main/org.jboss.invocation.jboss-invocation-2.0.0.Final.jar' -> '/deployments/lib/main/org.jboss.invocation.jboss-invocation-2.0.0.Final.jar'
2026-07-17T20:13:55.0414714Z '/tmp/src/lib/main/org.jboss.jboss-transaction-spi-8.0.0.Final.jar' -> '/deployments/lib/main/org.jboss.jboss-transaction-spi-8.0.0.Final.jar'
2026-07-17T20:13:55.0415063Z '/tmp/src/lib/main/org.jboss.logging.commons-logging-jboss-logging-1.0.0.Final.jar' -> '/deployments/lib/main/org.jboss.logging.commons-logging-jboss-logging-1.0.0.Final.jar'
2026-07-17T20:13:55.0415446Z '/tmp/src/lib/main/org.jboss.logging.jboss-logging-annotations-3.0.0.Final.jar' -> '/deployments/lib/main/org.jboss.logging.jboss-logging-annotations-3.0.0.Final.jar'
2026-07-17T20:13:55.0415848Z '/tmp/src/lib/main/org.jboss.narayana.jta.narayana-jta-7.0.2.Final.jar' -> '/deployments/lib/main/org.jboss.narayana.jta.narayana-jta-7.0.2.Final.jar'
2026-07-17T20:13:55.0416192Z '/tmp/src/lib/main/org.jboss.narayana.jts.narayana-jts-integration-7.0.2.Final.jar' -> '/deployments/lib/main/org.jboss.narayana.jts.narayana-jts-integration-7.0.2.Final.jar'
2026-07-17T20:13:55.0416531Z '/tmp/src/lib/main/org.jboss.slf4j.slf4j-jboss-logmanager-2.0.0.Final.jar' -> '/deployments/lib/main/org.jboss.slf4j.slf4j-jboss-logmanager-2.0.0.Final.jar'
2026-07-17T20:13:55.0416845Z '/tmp/src/lib/main/org.jboss.threads.jboss-threads-3.6.1.Final.jar' -> '/deployments/lib/main/org.jboss.threads.jboss-threads-3.6.1.Final.jar'
2026-07-17T20:13:55.0446179Z '/tmp/src/lib/main/org.jctools.jctools-core-4.0.5.jar' -> '/deployments/lib/main/org.jctools.jctools-core-4.0.5.jar'
2026-07-17T20:13:55.0446641Z '/tmp/src/lib/main/org.keycloak.keycloak-adapter-spi-25.0.0.jar' -> '/deployments/lib/main/org.keycloak.keycloak-adapter-spi-25.0.0.jar'
2026-07-17T20:13:55.0447097Z '/tmp/src/lib/main/org.keycloak.keycloak-authz-client-25.0.0.jar' -> '/deployments/lib/main/org.keycloak.keycloak-authz-client-25.0.0.jar'
2026-07-17T20:13:55.0447649Z '/tmp/src/lib/main/org.keycloak.keycloak-common-25.0.0.jar' -> '/deployments/lib/main/org.keycloak.keycloak-common-25.0.0.jar'
2026-07-17T20:13:55.0447939Z '/tmp/src/lib/main/org.keycloak.keycloak-core-25.0.0.jar' -> '/deployments/lib/main/org.keycloak.keycloak-core-25.0.0.jar'
2026-07-17T20:13:55.0448291Z '/tmp/src/lib/main/org.keycloak.keycloak-policy-enforcer-25.0.0.jar' -> '/deployments/lib/main/org.keycloak.keycloak-policy-enforcer-25.0.0.jar'
2026-07-17T20:13:55.0448665Z '/tmp/src/lib/main/org.modelmapper.modelmapper-2.3.0.jar' -> '/deployments/lib/main/org.modelmapper.modelmapper-2.3.0.jar'
2026-07-17T20:13:55.0449113Z '/tmp/src/lib/main/org.reactivestreams.reactive-streams-1.0.4.jar' -> '/deployments/lib/main/org.reactivestreams.reactive-streams-1.0.4.jar'
2026-07-17T20:13:55.0449416Z '/tmp/src/lib/main/org.slf4j.jcl-over-slf4j-1.7.30.jar' -> '/deployments/lib/main/org.slf4j.jcl-over-slf4j-1.7.30.jar'
2026-07-17T20:13:55.0449751Z '/tmp/src/lib/main/org.slf4j.slf4j-api-2.0.6.jar' -> '/deployments/lib/main/org.slf4j.slf4j-api-2.0.6.jar'
2026-07-17T20:13:55.0450077Z '/tmp/src/lib/main/org.wildfly.common.wildfly-common-1.7.0.Final.jar' -> '/deployments/lib/main/org.wildfly.common.wildfly-common-1.7.0.Final.jar'
2026-07-17T20:13:55.0450559Z '/tmp/src/lib/main/org.wildfly.security.wildfly-elytron-asn1-2.5.0.Final.jar' -> '/deployments/lib/main/org.wildfly.security.wildfly-elytron-asn1-2.5.0.Final.jar'
2026-07-17T20:13:55.0450916Z '/tmp/src/lib/main/org.wildfly.security.wildfly-elytron-auth-2.5.0.Final.jar' -> '/deployments/lib/main/org.wildfly.security.wildfly-elytron-auth-2.5.0.Final.jar'
2026-07-17T20:13:55.0451313Z '/tmp/src/lib/main/org.wildfly.security.wildfly-elytron-auth-server-2.5.0.Final.jar' -> '/deployments/lib/main/org.wildfly.security.wildfly-elytron-auth-server-2.5.0.Final.jar'
2026-07-17T20:13:55.0451658Z '/tmp/src/lib/main/org.wildfly.security.wildfly-elytron-base-2.5.0.Final.jar' -> '/deployments/lib/main/org.wildfly.security.wildfly-elytron-base-2.5.0.Final.jar'
2026-07-17T20:13:55.0452102Z '/tmp/src/lib/main/org.wildfly.security.wildfly-elytron-credential-2.5.0.Final.jar' -> '/deployments/lib/main/org.wildfly.security.wildfly-elytron-credential-2.5.0.Final.jar'
2026-07-17T20:13:55.0452450Z '/tmp/src/lib/main/org.wildfly.security.wildfly-elytron-encryption-2.5.0.Final.jar' -> '/deployments/lib/main/org.wildfly.security.wildfly-elytron-encryption-2.5.0.Final.jar'
2026-07-17T20:13:55.0452802Z '/tmp/src/lib/main/org.wildfly.security.wildfly-elytron-keystore-2.5.0.Final.jar' -> '/deployments/lib/main/org.wildfly.security.wildfly-elytron-keystore-2.5.0.Final.jar'
2026-07-17T20:13:55.0453282Z '/tmp/src/lib/main/org.wildfly.security.wildfly-elytron-password-impl-2.5.0.Final.jar' -> '/deployments/lib/main/org.wildfly.security.wildfly-elytron-password-impl-2.5.0.Final.jar'
2026-07-17T20:13:55.0453637Z '/tmp/src/lib/main/org.wildfly.security.wildfly-elytron-permission-2.5.0.Final.jar' -> '/deployments/lib/main/org.wildfly.security.wildfly-elytron-permission-2.5.0.Final.jar'
2026-07-17T20:13:55.0453995Z '/tmp/src/lib/main/org.wildfly.security.wildfly-elytron-provider-util-2.5.0.Final.jar' -> '/deployments/lib/main/org.wildfly.security.wildfly-elytron-provider-util-2.5.0.Final.jar'
2026-07-17T20:13:55.0454380Z '/tmp/src/lib/main/org.wildfly.security.wildfly-elytron-realm-2.5.0.Final.jar' -> '/deployments/lib/main/org.wildfly.security.wildfly-elytron-realm-2.5.0.Final.jar'
2026-07-17T20:13:55.0454865Z '/tmp/src/lib/main/org.wildfly.security.wildfly-elytron-util-2.5.0.Final.jar' -> '/deployments/lib/main/org.wildfly.security.wildfly-elytron-util-2.5.0.Final.jar'
2026-07-17T20:13:55.0455359Z '/tmp/src/lib/main/org.wildfly.security.wildfly-elytron-x500-2.5.0.Final.jar' -> '/deployments/lib/main/org.wildfly.security.wildfly-elytron-x500-2.5.0.Final.jar'
2026-07-17T20:13:55.0455705Z '/tmp/src/lib/main/org.wildfly.security.wildfly-elytron-x500-cert-2.5.0.Final.jar' -> '/deployments/lib/main/org.wildfly.security.wildfly-elytron-x500-cert-2.5.0.Final.jar'
2026-07-17T20:13:55.0456144Z '/tmp/src/lib/main/org.wildfly.security.wildfly-elytron-x500-cert-util-2.5.0.Final.jar' -> '/deployments/lib/main/org.wildfly.security.wildfly-elytron-x500-cert-util-2.5.0.Final.jar'
2026-07-17T20:13:55.0456425Z '/tmp/src/lib/main/org.yaml.snakeyaml-2.2.jar' -> '/deployments/lib/main/org.yaml.snakeyaml-2.2.jar'
2026-07-17T20:13:55.0478305Z '/tmp/src/lib/main/xalan.serializer-2.7.2.jar' -> '/deployments/lib/main/xalan.serializer-2.7.2.jar'
2026-07-17T20:13:55.0478568Z '/tmp/src/lib/main/xalan.xalan-2.7.2.jar' -> '/deployments/lib/main/xalan.xalan-2.7.2.jar'
2026-07-17T20:13:55.0478830Z '/tmp/src/lib/main/xml-apis.xml-apis-1.4.01.jar' -> '/deployments/lib/main/xml-apis.xml-apis-1.4.01.jar'
2026-07-17T20:13:55.0479162Z '/tmp/src/lib/main/xml-apis.xml-apis-ext-1.3.04.jar' -> '/deployments/lib/main/xml-apis.xml-apis-ext-1.3.04.jar'
2026-07-17T20:13:55.0479366Z '/tmp/src/quarkus' -> '/deployments/quarkus'
2026-07-17T20:13:55.0479590Z '/tmp/src/quarkus/generated-bytecode.jar' -> '/deployments/quarkus/generated-bytecode.jar'
2026-07-17T20:13:55.0479836Z '/tmp/src/quarkus/quarkus-application.dat' -> '/deployments/quarkus/quarkus-application.dat'
2026-07-17T20:13:55.0480079Z '/tmp/src/quarkus/transformed-bytecode.jar' -> '/deployments/quarkus/transformed-bytecode.jar'
2026-07-17T20:13:55.0480309Z '/tmp/src/quarkus-app-dependencies.txt' -> '/deployments/quarkus-app-dependencies.txt'
2026-07-17T20:13:55.1075907Z '/tmp/src/sisgf-api-14-0-1-1.zip' -> '/deployments/sisgf-api-14-0-1-1.zip'
2026-07-17T20:13:55.1076195Z + exit 0
2026-07-17T20:13:55.2591394Z STEP 9/9: CMD /usr/local/s2i/run
2026-07-17T20:13:55.2855513Z COMMIT temp.builder.openshift.io/build-images-ads/sisgf-api-71:2188b2c2
2026-07-17T20:13:55.2880301Z time="2026-07-17T20:13:55Z" level=warning msg="Adding metacopy option, configured globally"
2026-07-17T20:13:59.6801453Z Getting image source signatures
2026-07-17T20:13:59.6802064Z Copying blob sha256:f9327c1608ad0ae79b5f4a4c47eda907a980ea9640c70e6036811ea76d641249
2026-07-17T20:13:59.6803016Z Copying blob sha256:449675ca11bc217d5066dcce0a7dcb774bc87cb2553a8f137bc875cb5dddf4d4
2026-07-17T20:13:59.6804563Z Copying blob sha256:9d33dbfb9e8abcd14e0a55be85f30752600448499b0dddb846f2bf5fd21d8d37
2026-07-17T20:13:59.6804750Z Copying blob sha256:d08ff564362ee8ca55bca00895929a4f92fc6c574c9ce4de07024e9627540fc8
2026-07-17T20:13:59.6813380Z Copying blob sha256:88fe04f85e71aef700a24d555248930b381fbdedb2be87e65dd9128fa4b93bf5
2026-07-17T20:13:59.6813656Z Copying blob sha256:6a8d5f164ca47b1c2e7bdb23f07d1bc02247c71c181d3950f2d0012967247ecf
2026-07-17T20:13:59.6815678Z Copying blob sha256:fc52cb1db6a2236e936683e32d7d60350c381fcb63403826f35e5d20a42ea4b4
2026-07-17T20:13:59.6818950Z Copying blob sha256:27f2ced2acdb114c526bf645b9d1b01fec071e61780410099142b37949a8e177
2026-07-17T20:13:59.6828285Z Copying blob sha256:e578e7bf31c2bac2e9cae908f01970074818ba19564ba62c52e4f60d293e22d2
2026-07-17T20:13:59.6830382Z Copying blob sha256:b29fa49cd757a63e0eb6f03b1998612903715a4dcd8b50b12f6b53910c2e67ae
2026-07-17T20:13:59.6834355Z Copying blob sha256:405281dd08e52c573399a3d7dd112b545a92923636ede89d04c5c76a5e9f929a
2026-07-17T20:13:59.6834657Z Copying blob sha256:7a2b528f79445d7c059524929c661a8297e6a4a9663206c104826eb2b51a1dfe
2026-07-17T20:13:59.6844222Z Copying blob sha256:19c2241f978dfd51ee0e33a16fbf562ec5285bd8ea9c16cb473269d2408df3fc
2026-07-17T20:13:59.6883361Z Copying blob sha256:84f859f36ecfc86f84b2e8dede514d94a0c79cdae27ab3ce8eb69258f7874981
2026-07-17T20:14:03.2885490Z Copying config sha256:426d1022be5623911125020356a5dde901336d112177c6fd32882243e463ae2b
2026-07-17T20:14:03.3377060Z Writing manifest to image destination
2026-07-17T20:14:03.3416789Z Storing signatures
2026-07-17T20:14:06.6138915Z --> 426d1022be5
2026-07-17T20:14:06.6139294Z Successfully tagged temp.builder.openshift.io/build-images-ads/sisgf-api-71:2188b2c2
2026-07-17T20:14:07.0331516Z 426d1022be5623911125020356a5dde901336d112177c6fd32882243e463ae2b
2026-07-17T20:14:07.0734398Z 
2026-07-17T20:14:07.0735296Z Pushing image image-registry.openshift-image-registry.svc:5000/build-images-ads/sisgf-api:latest ...
2026-07-17T20:14:07.0742637Z Getting image source signatures
2026-07-17T20:14:12.1733747Z Copying blob sha256:24dafab7f594e7a2b9e71b74932f6f72d2e31ac8f84fbd5062d173e63637b237
2026-07-17T20:14:12.1955118Z Copying blob sha256:e1c363c96d760cb85e197cc8e2ab950760067935b29e7c098ae51ed371f5b0cd
2026-07-17T20:14:12.2067671Z Copying blob sha256:7f24bdb73d536337c7d82dee9c11e09acd3bacb0e1a76e98c6e82a8208e82284
2026-07-17T20:14:12.2173460Z Copying blob sha256:0a9a2db04f3ebe8121912deecd1a66d98a4ff35c7a3ee57e3eeffcb667119be1
2026-07-17T20:14:12.2418238Z Copying blob sha256:c98bbacb82bbf386496c2e0ef89b288bc8782dd9ae664dddcb285cf0965ba7f2
2026-07-17T20:14:12.2628616Z Copying blob sha256:264aaa453271eaaf6bc92b521f62e38cbda4f01e1a3fbf50abdb8b466be58a64
2026-07-17T20:14:17.2907778Z Copying blob sha256:067039afffe5f5aa56bc578e5d9256b8b0055763a32c54a38a73b969a8fd4f13
2026-07-17T20:14:17.3000157Z Copying blob sha256:9d5b85cf24e32083e165099afcc1bd9cc0a57a764f9077301e686e2d27f0eb2c
2026-07-17T20:14:17.3074402Z Copying blob sha256:7749ffa7020405743e3e0425d93720455a83619d343e217645f48f948260ab49
2026-07-17T20:14:17.3128664Z Copying blob sha256:4e0cd4f607fede7693f7eb61b31b84c051e5897ce5a096534ed90dc4808e5523
2026-07-17T20:14:17.3234261Z Copying blob sha256:586ae232f6757fb4248eda7dca86bf361d076242d052ee30965fec2eb1ea5a1c
2026-07-17T20:14:17.3658012Z Copying blob sha256:62d739cb3ca9a7f2a63e12f99c516e6432170af671b061195e6eafa7e864d6a2
2026-07-17T20:14:17.3941232Z Copying blob sha256:da2064a8b4a27db53f236c51c89c049f993c4438da41f6c80cb24242776bf1da
2026-07-17T20:14:17.4320780Z Copying blob sha256:84f859f36ecfc86f84b2e8dede514d94a0c79cdae27ab3ce8eb69258f7874981
2026-07-17T20:14:21.0991833Z Copying config sha256:426d1022be5623911125020356a5dde901336d112177c6fd32882243e463ae2b
2026-07-17T20:14:26.3688162Z Writing manifest to image destination
2026-07-17T20:14:26.4325523Z Storing signatures
2026-07-17T20:14:26.4326450Z Successfully pushed image-registry.openshift-image-registry.svc:5000/build-images-ads/sisgf-api@sha256:c703f3f976791f50e2fc074c4e6f1b7f39887b82204142d4ce7dd3165c62af32
2026-07-17T20:14:26.4639294Z Push successful
2026-07-17T20:14:30.6456517Z ##[section]Finishing: Executando Build S2I Binary
