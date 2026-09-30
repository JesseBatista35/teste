2026-09-30T16:56:46.5866426Z ##[section]Starting: Executando Build S2I Binary
2026-09-30T16:56:46.5870333Z ==============================================================================
2026-09-30T16:56:46.5870420Z Task         : Bash
2026-09-30T16:56:46.5870466Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-30T16:56:46.5870537Z Version      : 3.227.0
2026-09-30T16:56:46.5870583Z Author       : Microsoft Corporation
2026-09-30T16:56:46.5870635Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-30T16:56:46.5870719Z ==============================================================================
2026-09-30T16:56:46.7239305Z Generating script.
2026-09-30T16:56:46.7252249Z ========================== Starting Command Output ===========================
2026-09-30T16:56:46.7259780Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/501646c0-23c5-44cf-b584-8c8c47dbb1b0.sh
2026-09-30T16:56:46.7308026Z + set -o errexit
2026-09-30T16:56:46.7308236Z + set -o pipefail
2026-09-30T16:56:46.7310361Z + echo okd4_nprd
2026-09-30T16:56:46.7311529Z + egrep -q '^(okd4|ocp)'
2026-09-30T16:56:46.7345671Z + buildconfig=sirex-agenda-api
2026-09-30T16:56:46.7346734Z + oc start-build sirex-agenda-api --from-dir=/opt/ads-agent/_work/21/a --follow --wait=true -n build-images-ads -v=5
2026-09-30T16:56:56.7818311Z I0930 13:56:56.781133   31444 helpers.go:237] Connection error: Get https://api.produtos4.caixa:6443/apis/build.openshift.io/v1/namespaces/build-images-ads/buildconfigs/sirex-agenda-api: net/http: TLS handshake timeout
2026-09-30T16:56:56.7818771Z Unable to connect to the server: net/http: TLS handshake timeout
2026-09-30T16:56:56.7868008Z ##[error]Bash exited with code '1'.
2026-09-30T16:56:56.7912047Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 1 out of 1) after 1000 ms
2026-09-30T16:56:57.8746963Z Generating script.
2026-09-30T16:56:57.8759356Z ========================== Starting Command Output ===========================
2026-09-30T16:56:57.8766871Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/d70914fa-82ab-46e2-9211-6efc74a369cf.sh
2026-09-30T16:56:57.8815753Z + set -o errexit
2026-09-30T16:56:57.8815991Z + set -o pipefail
2026-09-30T16:56:57.8818218Z + echo okd4_nprd
2026-09-30T16:56:57.8818881Z + egrep -q '^(okd4|ocp)'
2026-09-30T16:56:57.8851694Z + buildconfig=sirex-agenda-api
2026-09-30T16:56:57.8852019Z + oc start-build sirex-agenda-api --from-dir=/opt/ads-agent/_work/21/a --follow --wait=true -n build-images-ads -v=5
2026-09-30T16:57:01.6312868Z I0930 13:57:01.630841   31474 repository.go:450] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
2026-09-30T16:57:01.6329826Z I0930 13:57:01.632844   31474 repository.go:533] Error executing command: exit status 128
2026-09-30T16:57:01.6330561Z Uploading directory "/opt/ads-agent/_work/21/a" as binary input for the build ...
2026-09-30T16:57:01.6331092Z I0930 13:57:01.632951   31474 tar.go:238] Adding "/opt/ads-agent/_work/21/a" to tar ...
2026-09-30T16:57:01.6332608Z I0930 13:57:01.633190   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/app as app
2026-09-30T16:57:01.6337793Z I0930 13:57:01.633647   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/app/sirex-agenda-backend-0.2.4.5-SNAPSHOT.jar as app/sirex-agenda-backend-0.2.4.5-SNAPSHOT.jar
2026-09-30T16:57:01.6414959Z I0930 13:57:01.641217   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib as lib
2026-09-30T16:57:01.6416404Z I0930 13:57:01.641537   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/boot as lib/boot
2026-09-30T16:57:01.6417080Z I0930 13:57:01.641581   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/boot/io.quarkus.quarkus-bootstrap-runner-3.38.1.jar as lib/boot/io.quarkus.quarkus-bootstrap-runner-3.38.1.jar
2026-09-30T16:57:01.6454324Z I0930 13:57:01.645185   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/boot/io.quarkus.quarkus-classloader-commons-3.38.1.jar as lib/boot/io.quarkus.quarkus-classloader-commons-3.38.1.jar
2026-09-30T16:57:01.6462309Z I0930 13:57:01.645983   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/boot/io.quarkus.quarkus-development-mode-spi-3.38.1.jar as lib/boot/io.quarkus.quarkus-development-mode-spi-3.38.1.jar
2026-09-30T16:57:01.6485280Z I0930 13:57:01.648301   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/boot/io.quarkus.quarkus-value-registry-3.38.1.jar as lib/boot/io.quarkus.quarkus-value-registry-3.38.1.jar
2026-09-30T16:57:01.6494443Z I0930 13:57:01.649275   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/boot/io.quarkus.quarkus-vertx-latebound-mdc-provider-3.38.1.jar as lib/boot/io.quarkus.quarkus-vertx-latebound-mdc-provider-3.38.1.jar
2026-09-30T16:57:01.6501357Z I0930 13:57:01.649981   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/boot/io.smallrye.common.smallrye-common-constraint-2.19.0.jar as lib/boot/io.smallrye.common.smallrye-common-constraint-2.19.0.jar
2026-09-30T16:57:01.6502569Z I0930 13:57:01.650142   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/boot/io.smallrye.common.smallrye-common-cpu-2.19.0.jar as lib/boot/io.smallrye.common.smallrye-common-cpu-2.19.0.jar
2026-09-30T16:57:01.6514064Z I0930 13:57:01.651263   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/boot/io.smallrye.common.smallrye-common-expression-2.19.0.jar as lib/boot/io.smallrye.common.smallrye-common-expression-2.19.0.jar
2026-09-30T16:57:01.6530022Z I0930 13:57:01.652797   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/boot/io.smallrye.common.smallrye-common-function-2.19.0.jar as lib/boot/io.smallrye.common.smallrye-common-function-2.19.0.jar
2026-09-30T16:57:01.6552288Z I0930 13:57:01.655037   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/boot/io.smallrye.common.smallrye-common-io-2.19.0.jar as lib/boot/io.smallrye.common.smallrye-common-io-2.19.0.jar
2026-09-30T16:57:01.6588411Z I0930 13:57:01.658704   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/boot/io.smallrye.common.smallrye-common-net-2.19.0.jar as lib/boot/io.smallrye.common.smallrye-common-net-2.19.0.jar
2026-09-30T16:57:01.6609712Z I0930 13:57:01.660843   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/boot/io.smallrye.common.smallrye-common-os-2.19.0.jar as lib/boot/io.smallrye.common.smallrye-common-os-2.19.0.jar
2026-09-30T16:57:01.6610326Z I0930 13:57:01.660962   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/boot/io.smallrye.common.smallrye-common-ref-2.19.0.jar as lib/boot/io.smallrye.common.smallrye-common-ref-2.19.0.jar
2026-09-30T16:57:01.6613629Z I0930 13:57:01.661259   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/boot/org.crac.crac-1.5.0.jar as lib/boot/org.crac.crac-1.5.0.jar
2026-09-30T16:57:31.4276829Z .....I0930 13:57:31.427014   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/boot/org.jboss.logging.jboss-logging-3.6.3.Final.jar as lib/boot/org.jboss.logging.jboss-logging-3.6.3.Final.jar
2026-09-30T16:57:31.4315325Z I0930 13:57:31.430968   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/boot/org.jboss.logmanager.jboss-logmanager-3.2.2.Final.jar as lib/boot/org.jboss.logmanager.jboss-logmanager-3.2.2.Final.jar
2026-09-30T16:57:31.4648062Z I0930 13:57:31.464215   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main as lib/main
2026-09-30T16:57:31.4648632Z I0930 13:57:31.464728   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/com.aayushatharva.brotli4j.brotli4j-1.23.0.jar as lib/main/com.aayushatharva.brotli4j.brotli4j-1.23.0.jar
2026-09-30T16:57:31.4684837Z I0930 13:57:31.467940   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/com.aayushatharva.brotli4j.native-linux-x86_64-1.23.0.jar as lib/main/com.aayushatharva.brotli4j.native-linux-x86_64-1.23.0.jar
2026-09-30T16:57:31.4815704Z I0930 13:57:31.481022   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/com.aayushatharva.brotli4j.service-1.23.0.jar as lib/main/com.aayushatharva.brotli4j.service-1.23.0.jar
2026-09-30T16:57:31.4830184Z I0930 13:57:31.482699   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/com.fasterxml.jackson.core.jackson-annotations-2.22.jar as lib/main/com.fasterxml.jackson.core.jackson-annotations-2.22.jar
2026-09-30T16:57:31.4878811Z I0930 13:57:31.487441   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/com.fasterxml.jackson.core.jackson-core-2.22.0.jar as lib/main/com.fasterxml.jackson.core.jackson-core-2.22.0.jar
2026-09-30T16:57:31.5200694Z I0930 13:57:31.519422   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/com.fasterxml.jackson.core.jackson-databind-2.22.0.jar as lib/main/com.fasterxml.jackson.core.jackson-databind-2.22.0.jar
2026-09-30T16:57:31.6092733Z I0930 13:57:31.608784   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/com.fasterxml.jackson.dataformat.jackson-dataformat-yaml-2.22.0.jar as lib/main/com.fasterxml.jackson.dataformat.jackson-dataformat-yaml-2.22.0.jar
2026-09-30T16:57:31.6123109Z I0930 13:57:31.611989   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/com.fasterxml.jackson.datatype.jackson-datatype-jdk8-2.22.0.jar as lib/main/com.fasterxml.jackson.datatype.jackson-datatype-jdk8-2.22.0.jar
2026-09-30T16:57:31.6154448Z I0930 13:57:31.614985   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/com.fasterxml.jackson.datatype.jackson-datatype-jsr310-2.22.0.jar as lib/main/com.fasterxml.jackson.datatype.jackson-datatype-jsr310-2.22.0.jar
2026-09-30T16:57:31.6234661Z I0930 13:57:31.622738   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/com.fasterxml.jackson.module.jackson-module-parameter-names-2.22.0.jar as lib/main/com.fasterxml.jackson.module.jackson-module-parameter-names-2.22.0.jar
2026-09-30T16:57:31.6235527Z I0930 13:57:31.622981   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/com.github.ben-manes.caffeine.caffeine-3.2.4.jar as lib/main/com.github.ben-manes.caffeine.caffeine-3.2.4.jar
2026-09-30T16:57:31.6697756Z .I0930 13:57:31.669217   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/com.github.ben-manes.caffeine.jcache-3.2.4.jar as lib/main/com.github.ben-manes.caffeine.jcache-3.2.4.jar
2026-09-30T16:57:31.6751141Z I0930 13:57:31.674640   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/com.google.errorprone.error_prone_annotations-2.49.0.jar as lib/main/com.google.errorprone.error_prone_annotations-2.49.0.jar
2026-09-30T16:57:31.6764371Z I0930 13:57:31.676160   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/com.oracle.database.jdbc.ojdbc17-23.26.2.0.0.jar as lib/main/com.oracle.database.jdbc.ojdbc17-23.26.2.0.0.jar
2026-09-30T16:57:32.0451738Z I0930 13:57:32.044671   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/com.oracle.database.nls.orai18n-23.26.2.0.0.jar as lib/main/com.oracle.database.nls.orai18n-23.26.2.0.0.jar
2026-09-30T16:57:32.1260405Z I0930 13:57:32.125516   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/com.sun.istack.istack-commons-runtime-4.1.2.jar as lib/main/com.sun.istack.istack-commons-runtime-4.1.2.jar
2026-09-30T16:57:32.1275454Z I0930 13:57:32.127227   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/com.typesafe.config-1.4.7.jar as lib/main/com.typesafe.config-1.4.7.jar
2026-09-30T16:57:32.1430732Z I0930 13:57:32.142432   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/commons-codec.commons-codec-1.22.0.jar as lib/main/commons-codec.commons-codec-1.22.0.jar
2026-09-30T16:57:32.1663206Z I0930 13:57:32.165728   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.agroal.agroal-api-3.2.1.jar as lib/main/io.agroal.agroal-api-3.2.1.jar
2026-09-30T16:57:32.1705013Z I0930 13:57:32.170016   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.agroal.agroal-narayana-3.2.1.jar as lib/main/io.agroal.agroal-narayana-3.2.1.jar
2026-09-30T16:57:32.1705512Z I0930 13:57:32.170204   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.agroal.agroal-pool-3.2.1.jar as lib/main/io.agroal.agroal-pool-3.2.1.jar
2026-09-30T16:57:32.1783954Z I0930 13:57:32.177779   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.netty.netty-buffer-4.1.136.Final.jar as lib/main/io.netty.netty-buffer-4.1.136.Final.jar
2026-09-30T16:57:32.1953610Z I0930 13:57:32.194788   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.netty.netty-codec-4.1.136.Final.jar as lib/main/io.netty.netty-codec-4.1.136.Final.jar
2026-09-30T16:57:32.2152946Z I0930 13:57:32.214679   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.netty.netty-codec-dns-4.1.136.Final.jar as lib/main/io.netty.netty-codec-dns-4.1.136.Final.jar
2026-09-30T16:57:32.2190522Z I0930 13:57:32.218597   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.netty.netty-codec-haproxy-4.1.136.Final.jar as lib/main/io.netty.netty-codec-haproxy-4.1.136.Final.jar
2026-09-30T16:57:32.2204092Z I0930 13:57:32.220228   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.netty.netty-codec-http-4.1.136.Final.jar as lib/main/io.netty.netty-codec-http-4.1.136.Final.jar
2026-09-30T16:57:32.2533740Z I0930 13:57:32.252752   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.netty.netty-codec-http2-4.1.136.Final.jar as lib/main/io.netty.netty-codec-http2-4.1.136.Final.jar
2026-09-30T16:57:32.2777646Z I0930 13:57:32.277156   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.netty.netty-codec-socks-4.1.136.Final.jar as lib/main/io.netty.netty-codec-socks-4.1.136.Final.jar
2026-09-30T16:57:32.2834825Z I0930 13:57:32.283085   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.netty.netty-common-4.1.136.Final.jar as lib/main/io.netty.netty-common-4.1.136.Final.jar
2026-09-30T16:57:32.3189272Z I0930 13:57:32.318331   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.netty.netty-handler-4.1.136.Final.jar as lib/main/io.netty.netty-handler-4.1.136.Final.jar
2026-09-30T16:57:32.3521716Z I0930 13:57:32.351616   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.netty.netty-handler-proxy-4.1.136.Final.jar as lib/main/io.netty.netty-handler-proxy-4.1.136.Final.jar
2026-09-30T16:57:32.3522497Z I0930 13:57:32.351772   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.netty.netty-resolver-4.1.136.Final.jar as lib/main/io.netty.netty-resolver-4.1.136.Final.jar
2026-09-30T16:57:32.3570721Z I0930 13:57:32.356513   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.netty.netty-resolver-dns-4.1.136.Final.jar as lib/main/io.netty.netty-resolver-dns-4.1.136.Final.jar
2026-09-30T16:57:32.3669062Z I0930 13:57:32.366361   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.netty.netty-tcnative-classes-2.0.78.Final.jar as lib/main/io.netty.netty-tcnative-classes-2.0.78.Final.jar
2026-09-30T16:57:32.3695548Z I0930 13:57:32.369172   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.netty.netty-transport-4.1.136.Final.jar as lib/main/io.netty.netty-transport-4.1.136.Final.jar
2026-09-30T16:57:32.3955226Z I0930 13:57:32.394955   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.netty.netty-transport-native-unix-common-4.1.136.Final.jar as lib/main/io.netty.netty-transport-native-unix-common-4.1.136.Final.jar
2026-09-30T16:57:32.3973684Z I0930 13:57:32.396937   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.arc.arc-3.38.1.jar as lib/main/io.quarkus.arc.arc-3.38.1.jar
2026-09-30T16:57:32.4123064Z I0930 13:57:32.411725   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-agroal-3.38.1.jar as lib/main/io.quarkus.quarkus-agroal-3.38.1.jar
2026-09-30T16:57:32.4154093Z I0930 13:57:32.415085   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-apache-httpclient-3.38.1.jar as lib/main/io.quarkus.quarkus-apache-httpclient-3.38.1.jar
2026-09-30T16:57:32.4155027Z I0930 13:57:32.415346   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-arc-3.38.1.jar as lib/main/io.quarkus.quarkus-arc-3.38.1.jar
2026-09-30T16:57:32.4199110Z I0930 13:57:32.419377   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-cache-3.38.1.jar as lib/main/io.quarkus.quarkus-cache-3.38.1.jar
2026-09-30T16:57:32.4245989Z I0930 13:57:32.424205   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-caffeine-3.38.1.jar as lib/main/io.quarkus.quarkus-caffeine-3.38.1.jar
2026-09-30T16:57:32.4246522Z I0930 13:57:32.424437   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-config-yaml-3.38.1.jar as lib/main/io.quarkus.quarkus-config-yaml-3.38.1.jar
2026-09-30T16:57:32.4253814Z I0930 13:57:32.425195   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-core-3.38.1.jar as lib/main/io.quarkus.quarkus-core-3.38.1.jar
2026-09-30T16:57:32.4508495Z I0930 13:57:32.450200   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-credentials-3.38.1.jar as lib/main/io.quarkus.quarkus-credentials-3.38.1.jar
2026-09-30T16:57:32.4509394Z I0930 13:57:32.450359   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-datasource-3.38.1.jar as lib/main/io.quarkus.quarkus-datasource-3.38.1.jar
2026-09-30T16:57:32.4521333Z I0930 13:57:32.451804   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-datasource-common-3.38.1.jar as lib/main/io.quarkus.quarkus-datasource-common-3.38.1.jar
2026-09-30T16:57:32.4534480Z I0930 13:57:32.452919   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-devservices-3.38.1.jar as lib/main/io.quarkus.quarkus-devservices-3.38.1.jar
2026-09-30T16:57:32.4535540Z I0930 13:57:32.453029   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-fs-util-1.4.2.jar as lib/main/io.quarkus.quarkus-fs-util-1.4.2.jar
2026-09-30T16:57:32.4580684Z I0930 13:57:32.457582   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-hibernate-orm-3.38.1.jar as lib/main/io.quarkus.quarkus-hibernate-orm-3.38.1.jar
2026-09-30T16:57:32.4731764Z I0930 13:57:32.472541   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-hibernate-orm-panache-3.38.1.jar as lib/main/io.quarkus.quarkus-hibernate-orm-panache-3.38.1.jar
2026-09-30T16:57:32.4748360Z I0930 13:57:32.474512   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-hibernate-orm-panache-common-3.38.1.jar as lib/main/io.quarkus.quarkus-hibernate-orm-panache-common-3.38.1.jar
2026-09-30T16:57:32.4770731Z I0930 13:57:32.476783   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-jackson-3.38.1.jar as lib/main/io.quarkus.quarkus-jackson-3.38.1.jar
2026-09-30T16:57:32.4774030Z I0930 13:57:32.477224   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-jdbc-oracle-3.38.1.jar as lib/main/io.quarkus.quarkus-jdbc-oracle-3.38.1.jar
2026-09-30T16:57:32.4792188Z I0930 13:57:32.478991   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-jsonp-3.38.1.jar as lib/main/io.quarkus.quarkus-jsonp-3.38.1.jar
2026-09-30T16:57:32.4792909Z I0930 13:57:32.479140   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-keycloak-authorization-3.38.1.jar as lib/main/io.quarkus.quarkus-keycloak-authorization-3.38.1.jar
2026-09-30T16:57:32.4834971Z I0930 13:57:32.483087   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-mutiny-3.38.1.jar as lib/main/io.quarkus.quarkus-mutiny-3.38.1.jar
2026-09-30T16:57:32.4836400Z I0930 13:57:32.483468   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-narayana-jta-3.38.1.jar as lib/main/io.quarkus.quarkus-narayana-jta-3.38.1.jar
2026-09-30T16:57:32.4883398Z I0930 13:57:32.487847   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-netty-3.38.1.jar as lib/main/io.quarkus.quarkus-netty-3.38.1.jar
2026-09-30T16:57:32.4923873Z I0930 13:57:32.491928   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-oidc-3.38.1.jar as lib/main/io.quarkus.quarkus-oidc-3.38.1.jar
2026-09-30T16:57:32.5213985Z I0930 13:57:32.520869   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-oidc-client-3.38.1.jar as lib/main/io.quarkus.quarkus-oidc-client-3.38.1.jar
2026-09-30T16:57:32.5276495Z I0930 13:57:32.527152   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-oidc-client-spi-3.38.1.jar as lib/main/io.quarkus.quarkus-oidc-client-spi-3.38.1.jar
2026-09-30T16:57:32.5277673Z I0930 13:57:32.527358   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-oidc-common-3.38.1.jar as lib/main/io.quarkus.quarkus-oidc-common-3.38.1.jar
2026-09-30T16:57:32.5345489Z I0930 13:57:32.533959   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-oidc-token-propagation-common-3.38.1.jar as lib/main/io.quarkus.quarkus-oidc-token-propagation-common-3.38.1.jar
2026-09-30T16:57:32.5346831Z I0930 13:57:32.534224   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-panache-common-3.38.1.jar as lib/main/io.quarkus.quarkus-panache-common-3.38.1.jar
2026-09-30T16:57:32.5354972Z I0930 13:57:32.535315   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-panache-hibernate-common-3.38.1.jar as lib/main/io.quarkus.quarkus-panache-hibernate-common-3.38.1.jar
2026-09-30T16:57:32.5357664Z I0930 13:57:32.535571   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-proxy-registry-3.38.1.jar as lib/main/io.quarkus.quarkus-proxy-registry-3.38.1.jar
2026-09-30T16:57:32.5369616Z I0930 13:57:32.536713   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-rest-3.38.1.jar as lib/main/io.quarkus.quarkus-rest-3.38.1.jar
2026-09-30T16:57:32.5432329Z I0930 13:57:32.542694   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-rest-client-3.38.1.jar as lib/main/io.quarkus.quarkus-rest-client-3.38.1.jar
2026-09-30T16:57:32.5483188Z I0930 13:57:32.547828   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-rest-client-config-3.38.1.jar as lib/main/io.quarkus.quarkus-rest-client-config-3.38.1.jar
2026-09-30T16:57:32.5505690Z I0930 13:57:32.550280   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-rest-client-jackson-3.38.1.jar as lib/main/io.quarkus.quarkus-rest-client-jackson-3.38.1.jar
2026-09-30T16:57:32.5513369Z I0930 13:57:32.551146   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-rest-client-jaxrs-3.38.1.jar as lib/main/io.quarkus.quarkus-rest-client-jaxrs-3.38.1.jar
2026-09-30T16:57:32.5534442Z I0930 13:57:32.553154   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-rest-client-oidc-token-propagation-3.38.1.jar as lib/main/io.quarkus.quarkus-rest-client-oidc-token-propagation-3.38.1.jar
2026-09-30T16:57:32.5535166Z I0930 13:57:32.553328   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-rest-common-3.38.1.jar as lib/main/io.quarkus.quarkus-rest-common-3.38.1.jar
2026-09-30T16:57:32.5544991Z I0930 13:57:32.554328   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-rest-jackson-3.38.1.jar as lib/main/io.quarkus.quarkus-rest-jackson-3.38.1.jar
2026-09-30T16:57:32.5580864Z I0930 13:57:32.557832   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-rest-jackson-common-3.38.1.jar as lib/main/io.quarkus.quarkus-rest-jackson-common-3.38.1.jar
2026-09-30T16:57:32.5582430Z I0930 13:57:32.558141   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-security-3.38.1.jar as lib/main/io.quarkus.quarkus-security-3.38.1.jar
2026-09-30T16:57:32.5648349Z I0930 13:57:32.564446   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-security-runtime-spi-3.38.1.jar as lib/main/io.quarkus.quarkus-security-runtime-spi-3.38.1.jar
2026-09-30T16:57:32.5661495Z I0930 13:57:32.565870   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-smallrye-context-propagation-3.38.1.jar as lib/main/io.quarkus.quarkus-smallrye-context-propagation-3.38.1.jar
2026-09-30T16:57:32.5662264Z I0930 13:57:32.566072   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-smallrye-fault-tolerance-3.38.1.jar as lib/main/io.quarkus.quarkus-smallrye-fault-tolerance-3.38.1.jar
2026-09-30T16:57:32.5694321Z I0930 13:57:32.569151   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-smallrye-health-3.38.1.jar as lib/main/io.quarkus.quarkus-smallrye-health-3.38.1.jar
2026-09-30T16:57:32.5713965Z I0930 13:57:32.571110   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-smallrye-jwt-3.38.1.jar as lib/main/io.quarkus.quarkus-smallrye-jwt-3.38.1.jar
2026-09-30T16:57:32.5724823Z I0930 13:57:32.572248   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-smallrye-jwt-build-3.38.1.jar as lib/main/io.quarkus.quarkus-smallrye-jwt-build-3.38.1.jar
2026-09-30T16:57:32.5727283Z I0930 13:57:32.572422   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-smallrye-openapi-3.38.1.jar as lib/main/io.quarkus.quarkus-smallrye-openapi-3.38.1.jar
2026-09-30T16:57:32.5744352Z I0930 13:57:32.574118   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-swagger-ui-3.38.1.jar as lib/main/io.quarkus.quarkus-swagger-ui-3.38.1.jar
2026-09-30T16:57:32.5748508Z I0930 13:57:32.574660   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-tls-registry-3.38.1.jar as lib/main/io.quarkus.quarkus-tls-registry-3.38.1.jar
2026-09-30T16:57:32.5792682Z I0930 13:57:32.578922   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-tls-registry-spi-3.38.1.jar as lib/main/io.quarkus.quarkus-tls-registry-spi-3.38.1.jar
2026-09-30T16:57:32.5799261Z I0930 13:57:32.579679   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-transaction-annotations-3.38.1.jar as lib/main/io.quarkus.quarkus-transaction-annotations-3.38.1.jar
2026-09-30T16:57:32.5802923Z I0930 13:57:32.580042   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-vertx-3.38.1.jar as lib/main/io.quarkus.quarkus-vertx-3.38.1.jar
2026-09-30T16:57:32.5878112Z I0930 13:57:32.587261   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-vertx-http-3.38.1.jar as lib/main/io.quarkus.quarkus-vertx-http-3.38.1.jar
2026-09-30T16:57:32.6249075Z I0930 13:57:32.624352   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-virtual-threads-3.38.1.jar as lib/main/io.quarkus.quarkus-virtual-threads-3.38.1.jar
2026-09-30T16:57:32.6262589Z I0930 13:57:32.626072   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.quarkus-websockets-next-spi-3.38.1.jar as lib/main/io.quarkus.quarkus-websockets-next-spi-3.38.1.jar
2026-09-30T16:57:32.6264256Z I0930 13:57:32.626326   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-3.38.1.jar as lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-3.38.1.jar
2026-09-30T16:57:32.6519169Z I0930 13:57:32.651302   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-client-3.38.1.jar as lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-client-3.38.1.jar
2026-09-30T16:57:32.6677729Z I0930 13:57:32.667144   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-common-3.38.1.jar as lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-common-3.38.1.jar
2026-09-30T16:57:32.6842290Z I0930 13:57:32.683633   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-common-types-3.38.1.jar as lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-common-types-3.38.1.jar
2026-09-30T16:57:32.6843235Z I0930 13:57:32.683807   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-jackson-3.38.1.jar as lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-jackson-3.38.1.jar
2026-09-30T16:57:32.6844043Z I0930 13:57:32.684036   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-vertx-3.38.1.jar as lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-vertx-3.38.1.jar
2026-09-30T16:57:32.6867479Z I0930 13:57:32.686289   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.security.quarkus-security-2.3.2.jar as lib/main/io.quarkus.security.quarkus-security-2.3.2.jar
2026-09-30T16:57:32.6874249Z I0930 13:57:32.687229   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.quarkus.vertx.utils.quarkus-vertx-utils-3.38.1.jar as lib/main/io.quarkus.vertx.utils.quarkus-vertx-utils-3.38.1.jar
2026-09-30T16:57:32.6887744Z I0930 13:57:32.688511   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.certs.smallrye-private-key-pem-parser-0.9.3.jar as lib/main/io.smallrye.certs.smallrye-private-key-pem-parser-0.9.3.jar
2026-09-30T16:57:32.6898824Z I0930 13:57:32.689572   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.common.smallrye-common-annotation-2.19.0.jar as lib/main/io.smallrye.common.smallrye-common-annotation-2.19.0.jar
2026-09-30T16:57:32.6907336Z I0930 13:57:32.690456   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.common.smallrye-common-classloader-2.19.0.jar as lib/main/io.smallrye.common.smallrye-common-classloader-2.19.0.jar
2026-09-30T16:57:32.6918365Z I0930 13:57:32.691619   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.common.smallrye-common-search-2.19.0.jar as lib/main/io.smallrye.common.smallrye-common-search-2.19.0.jar
2026-09-30T16:57:32.6945870Z I0930 13:57:32.694313   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.common.smallrye-common-vertx-context-2.19.0.jar as lib/main/io.smallrye.common.smallrye-common-vertx-context-2.19.0.jar
2026-09-30T16:57:32.6947326Z I0930 13:57:32.694539   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.config.smallrye-config-3.17.2.jar as lib/main/io.smallrye.config.smallrye-config-3.17.2.jar
2026-09-30T16:57:32.6978578Z I0930 13:57:32.697625   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.config.smallrye-config-common-3.17.2.jar as lib/main/io.smallrye.config.smallrye-config-common-3.17.2.jar
2026-09-30T16:57:32.6982663Z I0930 13:57:32.698002   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.config.smallrye-config-core-3.17.2.jar as lib/main/io.smallrye.config.smallrye-config-core-3.17.2.jar
2026-09-30T16:57:32.7165915Z I0930 13:57:32.716039   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.config.smallrye-config-source-file-system-3.16.0.jar as lib/main/io.smallrye.config.smallrye-config-source-file-system-3.16.0.jar
2026-09-30T16:57:32.7167684Z I0930 13:57:32.716551   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.config.smallrye-config-source-yaml-3.17.2.jar as lib/main/io.smallrye.config.smallrye-config-source-yaml-3.17.2.jar
2026-09-30T16:57:32.7173231Z I0930 13:57:32.716742   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.jandex-3.6.0.jar as lib/main/io.smallrye.jandex-3.6.0.jar
2026-09-30T16:57:32.7393241Z I0930 13:57:32.738686   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.reactive.mutiny-3.3.0.jar as lib/main/io.smallrye.reactive.mutiny-3.3.0.jar
2026-09-30T16:57:32.7803546Z I0930 13:57:32.779748   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.reactive.mutiny-smallrye-context-propagation-3.3.0.jar as lib/main/io.smallrye.reactive.mutiny-smallrye-context-propagation-3.3.0.jar
2026-09-30T16:57:32.7804576Z I0930 13:57:32.779946   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.reactive.mutiny-zero-flow-adapters-1.2.1.jar as lib/main/io.smallrye.reactive.mutiny-zero-flow-adapters-1.2.1.jar
2026-09-30T16:57:32.7815226Z I0930 13:57:32.781323   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-auth-common-3.23.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-auth-common-3.23.0.jar
2026-09-30T16:57:32.7846010Z I0930 13:57:32.784071   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-bridge-common-3.23.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-bridge-common-3.23.0.jar
2026-09-30T16:57:32.7847039Z I0930 13:57:32.784460   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-core-3.23.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-core-3.23.0.jar
2026-09-30T16:57:32.8020367Z I0930 13:57:32.801446   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-runtime-3.23.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-runtime-3.23.0.jar
2026-09-30T16:57:32.8029443Z I0930 13:57:32.802743   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-uri-template-3.23.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-uri-template-3.23.0.jar
2026-09-30T16:57:32.8038629Z I0930 13:57:32.803615   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-3.23.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-3.23.0.jar
2026-09-30T16:57:32.8120546Z I0930 13:57:32.811506   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-client-3.23.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-client-3.23.0.jar
2026-09-30T16:57:32.8144543Z I0930 13:57:32.814089   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-common-3.23.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-common-3.23.0.jar
2026-09-30T16:57:32.8156339Z I0930 13:57:32.815396   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.reactive.smallrye-reactive-converter-api-3.0.3.jar as lib/main/io.smallrye.reactive.smallrye-reactive-converter-api-3.0.3.jar
2026-09-30T16:57:32.8165775Z I0930 13:57:32.816367   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.reactive.smallrye-reactive-converter-mutiny-3.0.3.jar as lib/main/io.smallrye.reactive.smallrye-reactive-converter-mutiny-3.0.3.jar
2026-09-30T16:57:32.8171501Z I0930 13:57:32.816992   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.smallrye-context-propagation-2.3.0.jar as lib/main/io.smallrye.smallrye-context-propagation-2.3.0.jar
2026-09-30T16:57:32.8210450Z I0930 13:57:32.820635   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.smallrye-context-propagation-api-2.3.0.jar as lib/main/io.smallrye.smallrye-context-propagation-api-2.3.0.jar
2026-09-30T16:57:32.8224495Z I0930 13:57:32.822164   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.smallrye-context-propagation-jta-2.3.0.jar as lib/main/io.smallrye.smallrye-context-propagation-jta-2.3.0.jar
2026-09-30T16:57:32.8225305Z I0930 13:57:32.822341   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.smallrye-context-propagation-storage-2.3.0.jar as lib/main/io.smallrye.smallrye-context-propagation-storage-2.3.0.jar
2026-09-30T16:57:32.8236729Z I0930 13:57:32.823384   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.smallrye-fault-tolerance-6.11.2.jar as lib/main/io.smallrye.smallrye-fault-tolerance-6.11.2.jar
2026-09-30T16:57:32.8304668Z I0930 13:57:32.829993   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.smallrye-fault-tolerance-api-6.11.2.jar as lib/main/io.smallrye.smallrye-fault-tolerance-api-6.11.2.jar
2026-09-30T16:57:32.8321118Z I0930 13:57:32.831834   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.smallrye-fault-tolerance-apiimpl-6.11.2.jar as lib/main/io.smallrye.smallrye-fault-tolerance-apiimpl-6.11.2.jar
2026-09-30T16:57:32.8395209Z I0930 13:57:32.839097   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.smallrye-fault-tolerance-autoconfig-core-6.11.2.jar as lib/main/io.smallrye.smallrye-fault-tolerance-autoconfig-core-6.11.2.jar
2026-09-30T16:57:32.8402869Z I0930 13:57:32.839994   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.smallrye-fault-tolerance-context-propagation-6.11.2.jar as lib/main/io.smallrye.smallrye-fault-tolerance-context-propagation-6.11.2.jar
2026-09-30T16:57:32.8403377Z I0930 13:57:32.840238   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.smallrye-fault-tolerance-core-6.11.2.jar as lib/main/io.smallrye.smallrye-fault-tolerance-core-6.11.2.jar
2026-09-30T16:57:32.8492874Z I0930 13:57:32.848777   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.smallrye-fault-tolerance-mutiny-6.11.2.jar as lib/main/io.smallrye.smallrye-fault-tolerance-mutiny-6.11.2.jar
2026-09-30T16:57:32.8497872Z I0930 13:57:32.849638   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.smallrye-fault-tolerance-vertx-6.11.2.jar as lib/main/io.smallrye.smallrye-fault-tolerance-vertx-6.11.2.jar
2026-09-30T16:57:32.8498794Z I0930 13:57:32.849795   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.smallrye-health-4.3.0.jar as lib/main/io.smallrye.smallrye-health-4.3.0.jar
2026-09-30T16:57:32.8515485Z I0930 13:57:32.851395   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.smallrye-health-api-4.3.0.jar as lib/main/io.smallrye.smallrye-health-api-4.3.0.jar
2026-09-30T16:57:32.8517046Z I0930 13:57:32.851592   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.smallrye-health-provided-checks-4.3.0.jar as lib/main/io.smallrye.smallrye-health-provided-checks-4.3.0.jar
2026-09-30T16:57:32.8525543Z I0930 13:57:32.852454   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.smallrye-jwt-4.6.3.jar as lib/main/io.smallrye.smallrye-jwt-4.6.3.jar
2026-09-30T16:57:32.8595560Z I0930 13:57:32.859132   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.smallrye-jwt-build-4.6.3.jar as lib/main/io.smallrye.smallrye-jwt-build-4.6.3.jar
2026-09-30T16:57:32.8616166Z I0930 13:57:32.861269   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.smallrye-jwt-common-4.6.3.jar as lib/main/io.smallrye.smallrye-jwt-common-4.6.3.jar
2026-09-30T16:57:32.8622483Z I0930 13:57:32.862056   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.smallrye-open-api-core-4.3.5.jar as lib/main/io.smallrye.smallrye-open-api-core-4.3.5.jar
2026-09-30T16:57:32.8959311Z I0930 13:57:32.895411   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.smallrye-open-api-model-4.3.5.jar as lib/main/io.smallrye.smallrye-open-api-model-4.3.5.jar
2026-09-30T16:57:32.8978406Z I0930 13:57:32.897567   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.smallrye.stork.stork-api-2.7.10.jar as lib/main/io.smallrye.stork.stork-api-2.7.10.jar
2026-09-30T16:57:32.8997448Z I0930 13:57:32.899417   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.vertx.vertx-auth-common-4.5.30.jar as lib/main/io.vertx.vertx-auth-common-4.5.30.jar
2026-09-30T16:57:32.9078966Z I0930 13:57:32.907225   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.vertx.vertx-bridge-common-4.5.30.jar as lib/main/io.vertx.vertx-bridge-common-4.5.30.jar
2026-09-30T16:57:32.9079756Z I0930 13:57:32.907396   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.vertx.vertx-core-4.5.30.jar as lib/main/io.vertx.vertx-core-4.5.30.jar
2026-09-30T16:57:32.9859774Z I0930 13:57:32.985278   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.vertx.vertx-uri-template-4.5.30.jar as lib/main/io.vertx.vertx-uri-template-4.5.30.jar
2026-09-30T16:57:32.9874048Z I0930 13:57:32.987206   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.vertx.vertx-web-4.5.30.jar as lib/main/io.vertx.vertx-web-4.5.30.jar
2026-09-30T16:57:33.0040003Z I0930 13:57:33.003500   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.vertx.vertx-web-client-4.5.30.jar as lib/main/io.vertx.vertx-web-client-4.5.30.jar
2026-09-30T16:57:33.0095786Z I0930 13:57:33.009137   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/io.vertx.vertx-web-common-4.5.30.jar as lib/main/io.vertx.vertx-web-common-4.5.30.jar
2026-09-30T16:57:33.0107204Z I0930 13:57:33.010564   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/jakarta.activation.jakarta.activation-api-2.1.4.jar as lib/main/jakarta.activation.jakarta.activation-api-2.1.4.jar
2026-09-30T16:57:33.0154354Z I0930 13:57:33.014957   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/jakarta.annotation.jakarta.annotation-api-3.0.0.jar as lib/main/jakarta.annotation.jakarta.annotation-api-3.0.0.jar
2026-09-30T16:57:33.0165220Z I0930 13:57:33.016288   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/jakarta.el.jakarta.el-api-6.0.1.jar as lib/main/jakarta.el.jakarta.el-api-6.0.1.jar
2026-09-30T16:57:33.0219575Z I0930 13:57:33.021241   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/jakarta.enterprise.jakarta.enterprise.cdi-api-4.1.0.jar as lib/main/jakarta.enterprise.jakarta.enterprise.cdi-api-4.1.0.jar
2026-09-30T16:57:33.0289558Z I0930 13:57:33.028351   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/jakarta.enterprise.jakarta.enterprise.lang-model-4.1.0.jar as lib/main/jakarta.enterprise.jakarta.enterprise.lang-model-4.1.0.jar
2026-09-30T16:57:33.0296243Z I0930 13:57:33.029398   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/jakarta.inject.jakarta.inject-api-2.0.1.jar as lib/main/jakarta.inject.jakarta.inject-api-2.0.1.jar
2026-09-30T16:57:33.0307915Z I0930 13:57:33.030571   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/jakarta.interceptor.jakarta.interceptor-api-2.2.0.jar as lib/main/jakarta.interceptor.jakarta.interceptor-api-2.2.0.jar
2026-09-30T16:57:33.0328519Z I0930 13:57:33.032591   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/jakarta.json.jakarta.json-api-2.1.3.jar as lib/main/jakarta.json.jakarta.json-api-2.1.3.jar
2026-09-30T16:57:33.0343871Z I0930 13:57:33.034125   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/jakarta.persistence.jakarta.persistence-api-3.2.0.jar as lib/main/jakarta.persistence.jakarta.persistence-api-3.2.0.jar
2026-09-30T16:57:33.0449470Z I0930 13:57:33.044361   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/jakarta.resource.jakarta.resource-api-2.1.0.jar as lib/main/jakarta.resource.jakarta.resource-api-2.1.0.jar
2026-09-30T16:57:33.0482476Z I0930 13:57:33.047761   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/jakarta.transaction.jakarta.transaction-api-2.0.1.jar as lib/main/jakarta.transaction.jakarta.transaction-api-2.0.1.jar
2026-09-30T16:57:33.0500214Z I0930 13:57:33.049635   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/jakarta.ws.rs.jakarta.ws.rs-api-3.1.0.jar as lib/main/jakarta.ws.rs.jakarta.ws.rs-api-3.1.0.jar
2026-09-30T16:57:33.0591109Z I0930 13:57:33.058506   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/jakarta.xml.bind.jakarta.xml.bind-api-4.0.5.jar as lib/main/jakarta.xml.bind.jakarta.xml.bind-api-4.0.5.jar
2026-09-30T16:57:33.0651603Z I0930 13:57:33.064676   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/javax.cache.cache-api-1.1.1.jar as lib/main/javax.cache.cache-api-1.1.1.jar
2026-09-30T16:57:33.0676421Z I0930 13:57:33.067352   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.antlr.antlr4-runtime-4.13.2.jar as lib/main/org.antlr.antlr4-runtime-4.13.2.jar
2026-09-30T16:57:33.0849763Z I0930 13:57:33.083948   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.apache.httpcomponents.httpclient-4.5.14.jar as lib/main/org.apache.httpcomponents.httpclient-4.5.14.jar
2026-09-30T16:57:33.1266730Z I0930 13:57:33.126092   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.apache.httpcomponents.httpcore-4.4.16.jar as lib/main/org.apache.httpcomponents.httpcore-4.4.16.jar
2026-09-30T16:57:33.1450325Z I0930 13:57:33.144416   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.bitbucket.b_c.jose4j-0.9.6.jar as lib/main/org.bitbucket.b_c.jose4j-0.9.6.jar
2026-09-30T16:57:33.1604580Z I0930 13:57:33.159834   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.eclipse.angus.angus-activation-2.0.3.jar as lib/main/org.eclipse.angus.angus-activation-2.0.3.jar
2026-09-30T16:57:33.1615934Z I0930 13:57:33.161380   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.eclipse.microprofile.config.microprofile-config-api-3.1.1.jar as lib/main/org.eclipse.microprofile.config.microprofile-config-api-3.1.1.jar
2026-09-30T16:57:33.1618060Z I0930 13:57:33.161645   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.eclipse.microprofile.context-propagation.microprofile-context-propagation-api-1.3.jar as lib/main/org.eclipse.microprofile.context-propagation.microprofile-context-propagation-api-1.3.jar
2026-09-30T16:57:33.1627189Z I0930 13:57:33.162526   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.eclipse.microprofile.fault-tolerance.microprofile-fault-tolerance-api-4.1.2.jar as lib/main/org.eclipse.microprofile.fault-tolerance.microprofile-fault-tolerance-api-4.1.2.jar
2026-09-30T16:57:33.1637448Z I0930 13:57:33.163460   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.eclipse.microprofile.health.microprofile-health-api-4.0.1.jar as lib/main/org.eclipse.microprofile.health.microprofile-health-api-4.0.1.jar
2026-09-30T16:57:33.1650853Z I0930 13:57:33.164843   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.eclipse.microprofile.jwt.microprofile-jwt-auth-api-2.1.jar as lib/main/org.eclipse.microprofile.jwt.microprofile-jwt-auth-api-2.1.jar
2026-09-30T16:57:33.1664045Z I0930 13:57:33.166149   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.eclipse.microprofile.openapi.microprofile-openapi-api-4.1.1.jar as lib/main/org.eclipse.microprofile.openapi.microprofile-openapi-api-4.1.1.jar
2026-09-30T16:57:33.1704615Z I0930 13:57:33.169832   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.eclipse.microprofile.rest.client.microprofile-rest-client-api-4.0.jar as lib/main/org.eclipse.microprofile.rest.client.microprofile-rest-client-api-4.0.jar
2026-09-30T16:57:33.1712281Z I0930 13:57:33.170933   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.eclipse.parsson.parsson-1.1.9.jar as lib/main/org.eclipse.parsson.parsson-1.1.9.jar
2026-09-30T16:57:33.1785638Z I0930 13:57:33.177995   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.glassfish.jaxb.jaxb-core-4.0.9.jar as lib/main/org.glassfish.jaxb.jaxb-core-4.0.9.jar
2026-09-30T16:57:33.1862062Z I0930 13:57:33.185616   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.glassfish.jaxb.jaxb-runtime-4.0.9.jar as lib/main/org.glassfish.jaxb.jaxb-runtime-4.0.9.jar
2026-09-30T16:57:33.2277241Z I0930 13:57:33.227044   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.glassfish.jaxb.txw2-4.0.9.jar as lib/main/org.glassfish.jaxb.txw2-4.0.9.jar
2026-09-30T16:57:33.2315830Z I0930 13:57:33.231005   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.hibernate.models.hibernate-models-1.1.1.jar as lib/main/org.hibernate.models.hibernate-models-1.1.1.jar
2026-09-30T16:57:33.2453455Z I0930 13:57:33.244788   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.hibernate.orm.hibernate-core-7.4.5.Final.jar as lib/main/org.hibernate.orm.hibernate-core-7.4.5.Final.jar
2026-09-30T16:57:33.9710095Z I0930 13:57:33.970421   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.hibernate.orm.hibernate-graalvm-7.4.5.Final.jar as lib/main/org.hibernate.orm.hibernate-graalvm-7.4.5.Final.jar
2026-09-30T16:57:33.9710669Z I0930 13:57:33.970722   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.hibernate.orm.hibernate-jcache-7.4.5.Final.jar as lib/main/org.hibernate.orm.hibernate-jcache-7.4.5.Final.jar
2026-09-30T16:57:33.9711097Z I0930 13:57:33.971028   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.jboss.jboss-transaction-spi-8.0.0.Final.jar as lib/main/org.jboss.jboss-transaction-spi-8.0.0.Final.jar
2026-09-30T16:57:33.9737138Z I0930 13:57:33.973468   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.jboss.logging.commons-logging-jboss-logging-2.0.0.Final.jar as lib/main/org.jboss.logging.commons-logging-jboss-logging-2.0.0.Final.jar
2026-09-30T16:57:33.9739743Z I0930 13:57:33.973884   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.jboss.narayana.jta.narayana-jta-7.3.4.Final.jar as lib/main/org.jboss.narayana.jta.narayana-jta-7.3.4.Final.jar
2026-09-30T16:57:34.0460310Z I0930 13:57:34.045489   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.jboss.narayana.jts.narayana-jts-integration-7.3.4.Final.jar as lib/main/org.jboss.narayana.jts.narayana-jts-integration-7.3.4.Final.jar
2026-09-30T16:57:34.0486262Z I0930 13:57:34.047999   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.jboss.slf4j.slf4j-jboss-logmanager-2.0.2.Final.jar as lib/main/org.jboss.slf4j.slf4j-jboss-logmanager-2.0.2.Final.jar
2026-09-30T16:57:34.0498210Z I0930 13:57:34.049597   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.jboss.threads.jboss-threads-3.9.2.jar as lib/main/org.jboss.threads.jboss-threads-3.9.2.jar
2026-09-30T16:57:34.0565724Z I0930 13:57:34.056099   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.jctools.jctools-core-4.0.5.jar as lib/main/org.jctools.jctools-core-4.0.5.jar
2026-09-30T16:57:34.0802900Z I0930 13:57:34.079712   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.jspecify.jspecify-1.0.0.jar as lib/main/org.jspecify.jspecify-1.0.0.jar
2026-09-30T16:57:34.0803500Z I0930 13:57:34.079881   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.keycloak.keycloak-authz-client-26.0.11.jar as lib/main/org.keycloak.keycloak-authz-client-26.0.11.jar
2026-09-30T16:57:34.0845985Z I0930 13:57:34.084179   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.keycloak.keycloak-client-common-synced-26.0.11.jar as lib/main/org.keycloak.keycloak-client-common-synced-26.0.11.jar
2026-09-30T16:57:34.1125159Z I0930 13:57:34.111999   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.keycloak.keycloak-policy-enforcer-26.0.11.jar as lib/main/org.keycloak.keycloak-policy-enforcer-26.0.11.jar
2026-09-30T16:57:34.1151309Z I0930 13:57:34.114742   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.osgi.org.osgi.namespace.extender-1.0.1.jar as lib/main/org.osgi.org.osgi.namespace.extender-1.0.1.jar
2026-09-30T16:57:34.1161024Z I0930 13:57:34.115918   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.osgi.org.osgi.service.component.annotations-1.5.1.jar as lib/main/org.osgi.org.osgi.service.component.annotations-1.5.1.jar
2026-09-30T16:57:34.1189462Z I0930 13:57:34.118257   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.osgi.org.osgi.util.function-1.0.0.jar as lib/main/org.osgi.org.osgi.util.function-1.0.0.jar
2026-09-30T16:57:34.1189906Z I0930 13:57:34.118365   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.osgi.org.osgi.util.promise-1.0.0.jar as lib/main/org.osgi.org.osgi.util.promise-1.0.0.jar
2026-09-30T16:57:34.1204197Z I0930 13:57:34.120268   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.osgi.osgi.annotation-8.1.0.jar as lib/main/org.osgi.osgi.annotation-8.1.0.jar
2026-09-30T16:57:34.1222383Z I0930 13:57:34.122084   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.ow2.asm.asm-9.10.1.jar as lib/main/org.ow2.asm.asm-9.10.1.jar
2026-09-30T16:57:34.1272063Z I0930 13:57:34.126893   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.projectlombok.lombok-1.18.32.jar as lib/main/org.projectlombok.lombok-1.18.32.jar
2026-09-30T16:57:34.2237088Z I0930 13:57:34.223117   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.reactivestreams.reactive-streams-1.0.4.jar as lib/main/org.reactivestreams.reactive-streams-1.0.4.jar
2026-09-30T16:57:34.2237931Z I0930 13:57:34.223527   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.slf4j.slf4j-api-2.0.18.jar as lib/main/org.slf4j.slf4j-api-2.0.18.jar
2026-09-30T16:57:34.2276333Z I0930 13:57:34.227357   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.wildfly.common.wildfly-common-2.0.1.jar as lib/main/org.wildfly.common.wildfly-common-2.0.1.jar
2026-09-30T16:57:34.2414545Z I0930 13:57:34.241007   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/lib/main/org.yaml.snakeyaml-2.6.jar as lib/main/org.yaml.snakeyaml-2.6.jar
2026-09-30T16:57:34.2590680Z I0930 13:57:34.258579   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/quarkus as quarkus
2026-09-30T16:57:34.2591134Z I0930 13:57:34.258874   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/quarkus/generated-bytecode.jar as quarkus/generated-bytecode.jar
2026-09-30T16:57:34.3675976Z I0930 13:57:34.367047   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/quarkus/quarkus-application.dat as quarkus/quarkus-application.dat
2026-09-30T16:57:34.3733651Z I0930 13:57:34.372863   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/quarkus/transformed-bytecode.jar as quarkus/transformed-bytecode.jar
2026-09-30T16:57:34.3839867Z I0930 13:57:34.383270   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/quarkus-app-dependencies.txt as quarkus-app-dependencies.txt
2026-09-30T16:57:34.3840474Z I0930 13:57:34.383528   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/quarkus-run.jar as quarkus-run.jar
2026-09-30T16:57:34.3843007Z I0930 13:57:34.383784   31474 tar.go:336] Adding to tar: /opt/ads-agent/_work/21/a/sirex-agenda-backend-20260930-1355-0-2-4-5-SNAPSHOT.zip as sirex-agenda-backend-20260930-1355-0-2-4-5-SNAPSHOT.zip
2026-09-30T16:57:35.9351810Z 
2026-09-30T16:57:35.9352681Z Uploading finished
2026-09-30T16:57:35.9353489Z build.build.openshift.io/sirex-agenda-api-63 started
2026-09-30T16:57:36.0157465Z Adding cluster TLS certificate authority to trust store
2026-09-30T16:57:36.0157792Z Receiving source from STDIN as archive ...
2026-09-30T16:57:41.0309850Z Adding cluster TLS certificate authority to trust store
2026-09-30T16:57:53.0156076Z Adding cluster TLS certificate authority to trust store
2026-09-30T16:58:49.1161104Z I0930 13:58:49.115573   31474 startbuild.go:526] Error: unable to stream the build logs; caused by: stream error: stream ID 5; INTERNAL_ERROR; received from peer
2026-09-30T16:58:49.1161968Z Failed to stream the build logs - to view the logs, run oc logs build/sirex-agenda-api-63
2026-09-30T16:58:49.1165922Z Error: unable to stream the build logs; caused by: stream error: stream ID 5; INTERNAL_ERROR; received from peer
2026-09-30T16:58:59.1211771Z I0930 13:58:59.120324   31474 helpers.go:219] server response object: [{
2026-09-30T16:58:59.1212034Z   "metadata": {},
2026-09-30T16:58:59.1212153Z   "status": "Failure",
2026-09-30T16:58:59.1212296Z   "message": "the server is currently unable to handle the request (get builds.build.openshift.io)",
2026-09-30T16:58:59.1212454Z   "reason": "ServiceUnavailable",
2026-09-30T16:58:59.1220791Z   "details": {
2026-09-30T16:58:59.1220980Z     "group": "build.openshift.io",
2026-09-30T16:58:59.1221131Z     "kind": "builds",
2026-09-30T16:58:59.1221244Z     "causes": [
2026-09-30T16:58:59.1221340Z       {
2026-09-30T16:58:59.1221452Z         "reason": "UnexpectedServerResponse",
2026-09-30T16:58:59.1221588Z         "message": "error trying to reach service: net/http: TLS handshake timeout"
2026-09-30T16:58:59.1221717Z       }
2026-09-30T16:58:59.1221818Z     ]
2026-09-30T16:58:59.1221908Z   },
2026-09-30T16:58:59.1222002Z   "code": 503
2026-09-30T16:58:59.1222096Z }]
2026-09-30T16:58:59.1222244Z Error from server (ServiceUnavailable): the server is currently unable to handle the request (get builds.build.openshift.io)
2026-09-30T16:58:59.1330707Z ##[error]Bash exited with code '1'.
2026-09-30T16:58:59.1387025Z ##[section]Finishing: Executando Build S2I Binary
