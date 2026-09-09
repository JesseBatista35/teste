2026-09-02T18:58:24.8390957Z ##[section]Starting: Executando Build S2I Binary
2026-09-02T18:58:24.8394631Z ==============================================================================
2026-09-02T18:58:24.8394720Z Task         : Bash
2026-09-02T18:58:24.8394763Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-02T18:58:24.8394843Z Version      : 3.227.0
2026-09-02T18:58:24.8394889Z Author       : Microsoft Corporation
2026-09-02T18:58:24.8394942Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-02T18:58:24.8395023Z ==============================================================================
2026-09-02T18:58:24.9657237Z Generating script.
2026-09-02T18:58:24.9679545Z ========================== Starting Command Output ===========================
2026-09-02T18:58:24.9688082Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/6598536a-c2e4-4a38-b7a9-abc50d22be81.sh
2026-09-02T18:58:24.9750492Z + set -o errexit
2026-09-02T18:58:24.9750686Z + set -o pipefail
2026-09-02T18:58:24.9758541Z + echo okd4_nprd
2026-09-02T18:58:24.9762337Z + egrep -q '^(okd4|ocp)'
2026-09-02T18:58:24.9788787Z + buildconfig=sisgf-backend
2026-09-02T18:58:24.9793786Z + oc start-build sisgf-backend --from-dir=/opt/ads-agent/_work/14233/a --follow --wait=true -n build-images-ads -v=5
2026-09-02T18:58:25.1045970Z I0902 15:58:25.104209    1145 repository.go:424] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
2026-09-02T18:58:25.1063276Z I0902 15:58:25.106193    1145 repository.go:484] Error executing command: exit status 128
2026-09-02T18:58:25.1064222Z Uploading directory "/opt/ads-agent/_work/14233/a" as binary input for the build ...
2026-09-02T18:58:25.1064558Z I0902 15:58:25.106311    1145 tar.go:217] Adding "/opt/ads-agent/_work/14233/a" to tar ...
2026-09-02T18:58:25.1067030Z I0902 15:58:25.106598    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/app as app
2026-09-02T18:58:25.1071514Z I0902 15:58:25.107044    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/app/sisgf-backend-11.01.01.01.jar as app/sisgf-backend-11.01.01.01.jar
2026-09-02T18:58:29.9257540Z I0902 15:58:29.925398    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib as lib
2026-09-02T18:58:29.9269965Z I0902 15:58:29.926780    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/boot as lib/boot
2026-09-02T18:58:29.9271539Z I0902 15:58:29.926837    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/boot/io.quarkus.quarkus-bootstrap-runner-3.38.1.jar as lib/boot/io.quarkus.quarkus-bootstrap-runner-3.38.1.jar
2026-09-02T18:58:29.9312928Z I0902 15:58:29.930534    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/boot/io.quarkus.quarkus-classloader-commons-3.38.1.jar as lib/boot/io.quarkus.quarkus-classloader-commons-3.38.1.jar
2026-09-02T18:58:29.9318551Z I0902 15:58:29.931748    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/boot/io.quarkus.quarkus-development-mode-spi-3.38.1.jar as lib/boot/io.quarkus.quarkus-development-mode-spi-3.38.1.jar
2026-09-02T18:58:29.9337812Z I0902 15:58:29.933660    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/boot/io.quarkus.quarkus-value-registry-3.38.1.jar as lib/boot/io.quarkus.quarkus-value-registry-3.38.1.jar
2026-09-02T18:58:29.9346811Z I0902 15:58:29.934582    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/boot/io.quarkus.quarkus-vertx-latebound-mdc-provider-3.38.1.jar as lib/boot/io.quarkus.quarkus-vertx-latebound-mdc-provider-3.38.1.jar
2026-09-02T18:58:29.9349151Z I0902 15:58:29.934779    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/boot/io.smallrye.common.smallrye-common-constraint-2.19.0.jar as lib/boot/io.smallrye.common.smallrye-common-constraint-2.19.0.jar
2026-09-02T18:58:29.9358481Z I0902 15:58:29.935733    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/boot/io.smallrye.common.smallrye-common-cpu-2.19.0.jar as lib/boot/io.smallrye.common.smallrye-common-cpu-2.19.0.jar
2026-09-02T18:58:29.9359457Z I0902 15:58:29.935862    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/boot/io.smallrye.common.smallrye-common-expression-2.19.0.jar as lib/boot/io.smallrye.common.smallrye-common-expression-2.19.0.jar
2026-09-02T18:58:29.9376510Z I0902 15:58:29.937480    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/boot/io.smallrye.common.smallrye-common-function-2.19.0.jar as lib/boot/io.smallrye.common.smallrye-common-function-2.19.0.jar
2026-09-02T18:58:29.9409839Z I0902 15:58:29.940808    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/boot/io.smallrye.common.smallrye-common-io-2.19.0.jar as lib/boot/io.smallrye.common.smallrye-common-io-2.19.0.jar
2026-09-02T18:58:29.9461427Z I0902 15:58:29.945979    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/boot/io.smallrye.common.smallrye-common-net-2.19.0.jar as lib/boot/io.smallrye.common.smallrye-common-net-2.19.0.jar
2026-09-02T18:58:29.9484677Z I0902 15:58:29.947954    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/boot/io.smallrye.common.smallrye-common-os-2.19.0.jar as lib/boot/io.smallrye.common.smallrye-common-os-2.19.0.jar
2026-09-02T18:58:29.9485429Z I0902 15:58:29.948156    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/boot/io.smallrye.common.smallrye-common-ref-2.19.0.jar as lib/boot/io.smallrye.common.smallrye-common-ref-2.19.0.jar
2026-09-02T18:58:29.9491311Z I0902 15:58:29.948986    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/boot/org.crac.crac-1.5.0.jar as lib/boot/org.crac.crac-1.5.0.jar
2026-09-02T18:58:29.9504170Z I0902 15:58:29.950259    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/boot/org.jboss.logging.jboss-logging-3.6.3.Final.jar as lib/boot/org.jboss.logging.jboss-logging-3.6.3.Final.jar
2026-09-02T18:58:29.9532264Z I0902 15:58:29.952998    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/boot/org.jboss.logmanager.jboss-logmanager-3.2.2.Final.jar as lib/boot/org.jboss.logmanager.jboss-logmanager-3.2.2.Final.jar
2026-09-02T18:58:29.9808677Z I0902 15:58:29.980493    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main as lib/main
2026-09-02T18:58:29.9811443Z I0902 15:58:29.980891    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/antlr.antlr-2.7.7.jar as lib/main/antlr.antlr-2.7.7.jar
2026-09-02T18:58:30.0017033Z I0902 15:58:30.001372    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/com.aayushatharva.brotli4j.brotli4j-1.23.0.jar as lib/main/com.aayushatharva.brotli4j.brotli4j-1.23.0.jar
2026-09-02T18:58:30.0044978Z I0902 15:58:30.004286    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/com.aayushatharva.brotli4j.native-linux-x86_64-1.23.0.jar as lib/main/com.aayushatharva.brotli4j.native-linux-x86_64-1.23.0.jar
2026-09-02T18:58:30.0171138Z I0902 15:58:30.016742    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/com.aayushatharva.brotli4j.service-1.23.0.jar as lib/main/com.aayushatharva.brotli4j.service-1.23.0.jar
2026-09-02T18:58:30.0178099Z I0902 15:58:30.017704    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/com.cronutils.cron-utils-9.2.1.jar as lib/main/com.cronutils.cron-utils-9.2.1.jar
2026-09-02T18:58:30.0268988Z I0902 15:58:30.026601    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/com.fasterxml.jackson.core.jackson-annotations-2.22.jar as lib/main/com.fasterxml.jackson.core.jackson-annotations-2.22.jar
2026-09-02T18:58:30.0300250Z I0902 15:58:30.029880    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/com.fasterxml.jackson.core.jackson-core-2.22.0.jar as lib/main/com.fasterxml.jackson.core.jackson-core-2.22.0.jar
2026-09-02T18:58:30.0595644Z I0902 15:58:30.059239    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/com.fasterxml.jackson.core.jackson-databind-2.22.0.jar as lib/main/com.fasterxml.jackson.core.jackson-databind-2.22.0.jar
2026-09-02T18:58:30.1417466Z .I0902 15:58:30.141399    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/com.fasterxml.jackson.dataformat.jackson-dataformat-yaml-2.22.0.jar as lib/main/com.fasterxml.jackson.dataformat.jackson-dataformat-yaml-2.22.0.jar
2026-09-02T18:58:30.1436091Z I0902 15:58:30.143276    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/com.fasterxml.jackson.datatype.jackson-datatype-jdk8-2.22.0.jar as lib/main/com.fasterxml.jackson.datatype.jackson-datatype-jdk8-2.22.0.jar
2026-09-02T18:58:30.1463859Z I0902 15:58:30.145928    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/com.fasterxml.jackson.datatype.jackson-datatype-jsr310-2.22.0.jar as lib/main/com.fasterxml.jackson.datatype.jackson-datatype-jsr310-2.22.0.jar
2026-09-02T18:58:30.1523698Z I0902 15:58:30.152063    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/com.fasterxml.jackson.module.jackson-module-parameter-names-2.22.0.jar as lib/main/com.fasterxml.jackson.module.jackson-module-parameter-names-2.22.0.jar
2026-09-02T18:58:30.1536234Z I0902 15:58:30.152941    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/com.github.ben-manes.caffeine.caffeine-3.2.4.jar as lib/main/com.github.ben-manes.caffeine.caffeine-3.2.4.jar
2026-09-02T18:58:30.1950871Z I0902 15:58:30.194734    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/com.github.ben-manes.caffeine.jcache-3.2.4.jar as lib/main/com.github.ben-manes.caffeine.jcache-3.2.4.jar
2026-09-02T18:58:30.2015755Z I0902 15:58:30.200115    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/com.github.virtuald.curvesapi-1.08.jar as lib/main/com.github.virtuald.curvesapi-1.08.jar
2026-09-02T18:58:30.2072945Z I0902 15:58:30.206571    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/com.google.code.gson.gson-2.10.jar as lib/main/com.google.code.gson.gson-2.10.jar
2026-09-02T18:58:30.2224815Z I0902 15:58:30.221665    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/com.google.errorprone.error_prone_annotations-2.49.0.jar as lib/main/com.google.errorprone.error_prone_annotations-2.49.0.jar
2026-09-02T18:58:30.2225373Z I0902 15:58:30.221897    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/com.ibm.db2.jcc-11.5.6.0.jar as lib/main/com.ibm.db2.jcc-11.5.6.0.jar
2026-09-02T18:58:30.5175857Z I0902 15:58:30.517276    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/com.itextpdf.itextpdf-5.5.13.6.jar as lib/main/com.itextpdf.itextpdf-5.5.13.6.jar
2026-09-02T18:58:30.6290879Z I0902 15:58:30.628705    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar as lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar
2026-09-02T18:58:32.1855009Z I0902 15:58:32.185002    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/com.oracle.database.jdbc.ojdbc17-23.26.2.0.0.jar as lib/main/com.oracle.database.jdbc.ojdbc17-23.26.2.0.0.jar
2026-09-02T18:58:32.5168719Z I0902 15:58:32.516456    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/com.oracle.database.nls.orai18n-23.26.2.0.0.jar as lib/main/com.oracle.database.nls.orai18n-23.26.2.0.0.jar
2026-09-02T18:58:32.5864632Z I0902 15:58:32.586026    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/com.sun.istack.istack-commons-runtime-4.1.2.jar as lib/main/com.sun.istack.istack-commons-runtime-4.1.2.jar
2026-09-02T18:58:32.5872641Z I0902 15:58:32.587140    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/com.thoughtworks.qdox.qdox-1.12.1.jar as lib/main/com.thoughtworks.qdox.qdox-1.12.1.jar
2026-09-02T18:58:32.5952944Z I0902 15:58:32.595017    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/com.typesafe.config-1.4.7.jar as lib/main/com.typesafe.config-1.4.7.jar
2026-09-02T18:58:32.6094580Z I0902 15:58:32.608204    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/com.zaxxer.SparseBitSet-1.3.jar as lib/main/com.zaxxer.SparseBitSet-1.3.jar
2026-09-02T18:58:32.6095379Z I0902 15:58:32.608397    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/commons-codec.commons-codec-1.22.0.jar as lib/main/commons-codec.commons-codec-1.22.0.jar
2026-09-02T18:58:32.6262498Z I0902 15:58:32.625959    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/commons-io.commons-io-2.22.0.jar as lib/main/commons-io.commons-io-2.22.0.jar
2026-09-02T18:58:32.6515440Z I0902 15:58:32.651226    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.agroal.agroal-api-3.2.1.jar as lib/main/io.agroal.agroal-api-3.2.1.jar
2026-09-02T18:58:32.6542093Z I0902 15:58:32.654047    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.agroal.agroal-narayana-3.2.1.jar as lib/main/io.agroal.agroal-narayana-3.2.1.jar
2026-09-02T18:58:32.6555811Z I0902 15:58:32.655047    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.agroal.agroal-pool-3.2.1.jar as lib/main/io.agroal.agroal-pool-3.2.1.jar
2026-09-02T18:58:32.6617016Z I0902 15:58:32.661510    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.micrometer.micrometer-commons-1.17.0.jar as lib/main/io.micrometer.micrometer-commons-1.17.0.jar
2026-09-02T18:58:32.6657893Z I0902 15:58:32.665534    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.micrometer.micrometer-core-1.17.0.jar as lib/main/io.micrometer.micrometer-core-1.17.0.jar
2026-09-02T18:58:32.7061263Z I0902 15:58:32.705767    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.micrometer.micrometer-observation-1.17.0.jar as lib/main/io.micrometer.micrometer-observation-1.17.0.jar
2026-09-02T18:58:32.7099419Z I0902 15:58:32.709714    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.netty.netty-buffer-4.1.136.Final.jar as lib/main/io.netty.netty-buffer-4.1.136.Final.jar
2026-09-02T18:58:32.7276302Z I0902 15:58:32.727287    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.netty.netty-codec-4.1.136.Final.jar as lib/main/io.netty.netty-codec-4.1.136.Final.jar
2026-09-02T18:58:32.7444986Z I0902 15:58:32.744188    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.netty.netty-codec-dns-4.1.136.Final.jar as lib/main/io.netty.netty-codec-dns-4.1.136.Final.jar
2026-09-02T18:58:32.7476214Z I0902 15:58:32.747392    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.netty.netty-codec-haproxy-4.1.136.Final.jar as lib/main/io.netty.netty-codec-haproxy-4.1.136.Final.jar
2026-09-02T18:58:32.7494018Z I0902 15:58:32.749227    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.netty.netty-codec-http-4.1.136.Final.jar as lib/main/io.netty.netty-codec-http-4.1.136.Final.jar
2026-09-02T18:58:32.7796451Z I0902 15:58:32.779167    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.netty.netty-codec-http2-4.1.136.Final.jar as lib/main/io.netty.netty-codec-http2-4.1.136.Final.jar
2026-09-02T18:58:32.8027236Z I0902 15:58:32.802371    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.netty.netty-codec-socks-4.1.136.Final.jar as lib/main/io.netty.netty-codec-socks-4.1.136.Final.jar
2026-09-02T18:58:32.8071778Z I0902 15:58:32.807032    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.netty.netty-common-4.1.136.Final.jar as lib/main/io.netty.netty-common-4.1.136.Final.jar
2026-09-02T18:58:32.8416705Z I0902 15:58:32.840475    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.netty.netty-handler-4.1.136.Final.jar as lib/main/io.netty.netty-handler-4.1.136.Final.jar
2026-09-02T18:58:32.8666071Z I0902 15:58:32.865700    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.netty.netty-handler-proxy-4.1.136.Final.jar as lib/main/io.netty.netty-handler-proxy-4.1.136.Final.jar
2026-09-02T18:58:32.8672307Z I0902 15:58:32.867054    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.netty.netty-resolver-4.1.136.Final.jar as lib/main/io.netty.netty-resolver-4.1.136.Final.jar
2026-09-02T18:58:32.8691393Z I0902 15:58:32.868997    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.netty.netty-resolver-dns-4.1.136.Final.jar as lib/main/io.netty.netty-resolver-dns-4.1.136.Final.jar
2026-09-02T18:58:32.8781383Z I0902 15:58:32.877757    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.netty.netty-tcnative-classes-2.0.78.Final.jar as lib/main/io.netty.netty-tcnative-classes-2.0.78.Final.jar
2026-09-02T18:58:32.8804095Z I0902 15:58:32.879858    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.netty.netty-transport-4.1.136.Final.jar as lib/main/io.netty.netty-transport-4.1.136.Final.jar
2026-09-02T18:58:32.9027519Z I0902 15:58:32.902436    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.netty.netty-transport-native-unix-common-4.1.136.Final.jar as lib/main/io.netty.netty-transport-native-unix-common-4.1.136.Final.jar
2026-09-02T18:58:32.9046308Z I0902 15:58:32.904522    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.opentelemetry.instrumentation.opentelemetry-instrumentation-api-2.28.1.jar as lib/main/io.opentelemetry.instrumentation.opentelemetry-instrumentation-api-2.28.1.jar
2026-09-02T18:58:32.9163597Z I0902 15:58:32.915898    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.opentelemetry.opentelemetry-api-1.62.0.jar as lib/main/io.opentelemetry.opentelemetry-api-1.62.0.jar
2026-09-02T18:58:32.9235786Z I0902 15:58:32.923167    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.opentelemetry.opentelemetry-api-incubator-1.62.0-alpha.jar as lib/main/io.opentelemetry.opentelemetry-api-incubator-1.62.0-alpha.jar
2026-09-02T18:58:32.9271215Z I0902 15:58:32.926873    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.opentelemetry.opentelemetry-common-1.62.0.jar as lib/main/io.opentelemetry.opentelemetry-common-1.62.0.jar
2026-09-02T18:58:32.9283756Z I0902 15:58:32.928088    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.opentelemetry.opentelemetry-context-1.62.0.jar as lib/main/io.opentelemetry.opentelemetry-context-1.62.0.jar
2026-09-02T18:58:32.9302672Z I0902 15:58:32.930034    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.opentelemetry.semconv.opentelemetry-semconv-1.41.1.jar as lib/main/io.opentelemetry.semconv.opentelemetry-semconv-1.41.1.jar
2026-09-02T18:58:32.9312829Z I0902 15:58:32.931147    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.arc.arc-3.38.1.jar as lib/main/io.quarkus.arc.arc-3.38.1.jar
2026-09-02T18:58:32.9462126Z I0902 15:58:32.945852    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.http.quarkus-http-core-5.5.0.jar as lib/main/io.quarkus.http.quarkus-http-core-5.5.0.jar
2026-09-02T18:58:32.9870900Z I0902 15:58:32.986612    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.http.quarkus-http-http-core-5.5.0.jar as lib/main/io.quarkus.http.quarkus-http-http-core-5.5.0.jar
2026-09-02T18:58:32.9888557Z I0902 15:58:32.988650    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.http.quarkus-http-servlet-5.5.0.jar as lib/main/io.quarkus.http.quarkus-http-servlet-5.5.0.jar
2026-09-02T18:58:33.0125456Z I0902 15:58:33.010650    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.http.quarkus-http-vertx-backend-5.5.0.jar as lib/main/io.quarkus.http.quarkus-http-vertx-backend-5.5.0.jar
2026-09-02T18:58:33.0134831Z I0902 15:58:33.013025    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-agroal-3.38.1.jar as lib/main/io.quarkus.quarkus-agroal-3.38.1.jar
2026-09-02T18:58:33.0158162Z I0902 15:58:33.015703    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-apache-httpclient-3.38.1.jar as lib/main/io.quarkus.quarkus-apache-httpclient-3.38.1.jar
2026-09-02T18:58:33.0160595Z I0902 15:58:33.015970    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-arc-3.38.1.jar as lib/main/io.quarkus.quarkus-arc-3.38.1.jar
2026-09-02T18:58:33.0192040Z I0902 15:58:33.019071    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-cache-3.38.1.jar as lib/main/io.quarkus.quarkus-cache-3.38.1.jar
2026-09-02T18:58:33.0236849Z I0902 15:58:33.023537    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-caffeine-3.38.1.jar as lib/main/io.quarkus.quarkus-caffeine-3.38.1.jar
2026-09-02T18:58:33.0237980Z I0902 15:58:33.023683    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-container-image-3.38.1.jar as lib/main/io.quarkus.quarkus-container-image-3.38.1.jar
2026-09-02T18:58:33.0245197Z I0902 15:58:33.024371    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-container-image-docker-3.38.1.jar as lib/main/io.quarkus.quarkus-container-image-docker-3.38.1.jar
2026-09-02T18:58:33.0245954Z I0902 15:58:33.024476    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-container-image-docker-common-3.38.1.jar as lib/main/io.quarkus.quarkus-container-image-docker-common-3.38.1.jar
2026-09-02T18:58:33.0246913Z I0902 15:58:33.024600    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-core-3.38.1.jar as lib/main/io.quarkus.quarkus-core-3.38.1.jar
2026-09-02T18:58:33.0468011Z I0902 15:58:33.046191    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-credentials-3.38.1.jar as lib/main/io.quarkus.quarkus-credentials-3.38.1.jar
2026-09-02T18:58:33.0468512Z I0902 15:58:33.046333    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-datasource-3.38.1.jar as lib/main/io.quarkus.quarkus-datasource-3.38.1.jar
2026-09-02T18:58:33.0475783Z I0902 15:58:33.047387    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-datasource-common-3.38.1.jar as lib/main/io.quarkus.quarkus-datasource-common-3.38.1.jar
2026-09-02T18:58:33.0477460Z I0902 15:58:33.047641    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-devservices-3.38.1.jar as lib/main/io.quarkus.quarkus-devservices-3.38.1.jar
2026-09-02T18:58:33.0485411Z I0902 15:58:33.048405    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-elytron-security-3.38.1.jar as lib/main/io.quarkus.quarkus-elytron-security-3.38.1.jar
2026-09-02T18:58:33.0486654Z I0902 15:58:33.048539    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-elytron-security-common-3.38.1.jar as lib/main/io.quarkus.quarkus-elytron-security-common-3.38.1.jar
2026-09-02T18:58:33.0496518Z I0902 15:58:33.049512    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-elytron-security-properties-file-3.38.1.jar as lib/main/io.quarkus.quarkus-elytron-security-properties-file-3.38.1.jar
2026-09-02T18:58:33.0506696Z I0902 15:58:33.050505    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-fs-util-1.4.2.jar as lib/main/io.quarkus.quarkus-fs-util-1.4.2.jar
2026-09-02T18:58:33.0545973Z I0902 15:58:33.053868    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-hibernate-orm-3.38.1.jar as lib/main/io.quarkus.quarkus-hibernate-orm-3.38.1.jar
2026-09-02T18:58:33.0677191Z I0902 15:58:33.067523    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-hibernate-orm-panache-3.38.1.jar as lib/main/io.quarkus.quarkus-hibernate-orm-panache-3.38.1.jar
2026-09-02T18:58:33.0697034Z I0902 15:58:33.069087    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-hibernate-orm-panache-common-3.38.1.jar as lib/main/io.quarkus.quarkus-hibernate-orm-panache-common-3.38.1.jar
2026-09-02T18:58:33.0704884Z I0902 15:58:33.070280    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-jackson-3.38.1.jar as lib/main/io.quarkus.quarkus-jackson-3.38.1.jar
2026-09-02T18:58:33.0714133Z I0902 15:58:33.071299    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-jaxb-3.38.1.jar as lib/main/io.quarkus.quarkus-jaxb-3.38.1.jar
2026-09-02T18:58:33.0720273Z I0902 15:58:33.071924    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-jaxp-3.38.1.jar as lib/main/io.quarkus.quarkus-jaxp-3.38.1.jar
2026-09-02T18:58:33.0722531Z I0902 15:58:33.072170    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-jdbc-oracle-3.38.1.jar as lib/main/io.quarkus.quarkus-jdbc-oracle-3.38.1.jar
2026-09-02T18:58:33.0723332Z I0902 15:58:33.072253    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-jsonp-3.38.1.jar as lib/main/io.quarkus.quarkus-jsonp-3.38.1.jar
2026-09-02T18:58:33.0735429Z I0902 15:58:33.073130    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-keycloak-authorization-3.38.1.jar as lib/main/io.quarkus.quarkus-keycloak-authorization-3.38.1.jar
2026-09-02T18:58:33.0782031Z I0902 15:58:33.075984    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-mailer-3.38.1.jar as lib/main/io.quarkus.quarkus-mailer-3.38.1.jar
2026-09-02T18:58:33.0802346Z I0902 15:58:33.080107    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-micrometer-3.38.1.jar as lib/main/io.quarkus.quarkus-micrometer-3.38.1.jar
2026-09-02T18:58:33.0897694Z I0902 15:58:33.089626    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-mutiny-3.38.1.jar as lib/main/io.quarkus.quarkus-mutiny-3.38.1.jar
2026-09-02T18:58:33.0899102Z I0902 15:58:33.089828    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-narayana-jta-3.38.1.jar as lib/main/io.quarkus.quarkus-narayana-jta-3.38.1.jar
2026-09-02T18:58:33.0932024Z I0902 15:58:33.093108    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-netty-3.38.1.jar as lib/main/io.quarkus.quarkus-netty-3.38.1.jar
2026-09-02T18:58:33.0969960Z I0902 15:58:33.096740    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-oidc-3.38.1.jar as lib/main/io.quarkus.quarkus-oidc-3.38.1.jar
2026-09-02T18:58:33.1224718Z I0902 15:58:33.121439    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-oidc-client-3.38.1.jar as lib/main/io.quarkus.quarkus-oidc-client-3.38.1.jar
2026-09-02T18:58:33.1259760Z I0902 15:58:33.125724    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-oidc-client-spi-3.38.1.jar as lib/main/io.quarkus.quarkus-oidc-client-spi-3.38.1.jar
2026-09-02T18:58:33.1261497Z I0902 15:58:33.125878    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-oidc-common-3.38.1.jar as lib/main/io.quarkus.quarkus-oidc-common-3.38.1.jar
2026-09-02T18:58:33.1312287Z I0902 15:58:33.131074    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-panache-common-3.38.1.jar as lib/main/io.quarkus.quarkus-panache-common-3.38.1.jar
2026-09-02T18:58:33.1314075Z I0902 15:58:33.131257    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-panache-hibernate-common-3.38.1.jar as lib/main/io.quarkus.quarkus-panache-hibernate-common-3.38.1.jar
2026-09-02T18:58:33.1323776Z I0902 15:58:33.132224    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-proxy-registry-3.38.1.jar as lib/main/io.quarkus.quarkus-proxy-registry-3.38.1.jar
2026-09-02T18:58:33.1325006Z I0902 15:58:33.132363    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-qute-3.38.1.jar as lib/main/io.quarkus.quarkus-qute-3.38.1.jar
2026-09-02T18:58:33.1375694Z I0902 15:58:33.137350    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-rest-3.38.1.jar as lib/main/io.quarkus.quarkus-rest-3.38.1.jar
2026-09-02T18:58:33.1433156Z I0902 15:58:33.143087    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-rest-client-3.38.1.jar as lib/main/io.quarkus.quarkus-rest-client-3.38.1.jar
2026-09-02T18:58:33.1485209Z I0902 15:58:33.147604    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-rest-client-config-3.38.1.jar as lib/main/io.quarkus.quarkus-rest-client-config-3.38.1.jar
2026-09-02T18:58:33.1500601Z I0902 15:58:33.149521    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-rest-client-jackson-3.38.1.jar as lib/main/io.quarkus.quarkus-rest-client-jackson-3.38.1.jar
2026-09-02T18:58:33.1501389Z I0902 15:58:33.149684    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-rest-client-jaxrs-3.38.1.jar as lib/main/io.quarkus.quarkus-rest-client-jaxrs-3.38.1.jar
2026-09-02T18:58:33.1525554Z I0902 15:58:33.152350    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-rest-common-3.38.1.jar as lib/main/io.quarkus.quarkus-rest-common-3.38.1.jar
2026-09-02T18:58:33.1526338Z I0902 15:58:33.152469    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-rest-jackson-3.38.1.jar as lib/main/io.quarkus.quarkus-rest-jackson-3.38.1.jar
2026-09-02T18:58:33.1560868Z I0902 15:58:33.155951    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-rest-jackson-common-3.38.1.jar as lib/main/io.quarkus.quarkus-rest-jackson-common-3.38.1.jar
2026-09-02T18:58:33.1567063Z I0902 15:58:33.156616    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-scheduler-3.38.1.jar as lib/main/io.quarkus.quarkus-scheduler-3.38.1.jar
2026-09-02T18:58:33.1590615Z I0902 15:58:33.158457    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-scheduler-api-3.38.1.jar as lib/main/io.quarkus.quarkus-scheduler-api-3.38.1.jar
2026-09-02T18:58:33.1591439Z I0902 15:58:33.158741    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-scheduler-common-3.38.1.jar as lib/main/io.quarkus.quarkus-scheduler-common-3.38.1.jar
2026-09-02T18:58:33.1613235Z I0902 15:58:33.161189    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-scheduler-kotlin-3.38.1.jar as lib/main/io.quarkus.quarkus-scheduler-kotlin-3.38.1.jar
2026-09-02T18:58:33.1613805Z I0902 15:58:33.161295    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-scheduler-spi-3.38.1.jar as lib/main/io.quarkus.quarkus-scheduler-spi-3.38.1.jar
2026-09-02T18:58:33.1620842Z I0902 15:58:33.161997    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-security-3.38.1.jar as lib/main/io.quarkus.quarkus-security-3.38.1.jar
2026-09-02T18:58:33.1659155Z I0902 15:58:33.165821    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-security-jpa-3.38.1.jar as lib/main/io.quarkus.quarkus-security-jpa-3.38.1.jar
2026-09-02T18:58:33.1672717Z I0902 15:58:33.167121    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-security-jpa-common-3.38.1.jar as lib/main/io.quarkus.quarkus-security-jpa-common-3.38.1.jar
2026-09-02T18:58:33.1673159Z I0902 15:58:33.167229    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-security-runtime-spi-3.38.1.jar as lib/main/io.quarkus.quarkus-security-runtime-spi-3.38.1.jar
2026-09-02T18:58:33.1681530Z I0902 15:58:33.168054    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-smallrye-context-propagation-3.38.1.jar as lib/main/io.quarkus.quarkus-smallrye-context-propagation-3.38.1.jar
2026-09-02T18:58:33.1691018Z I0902 15:58:33.168996    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-smallrye-fault-tolerance-3.38.1.jar as lib/main/io.quarkus.quarkus-smallrye-fault-tolerance-3.38.1.jar
2026-09-02T18:58:33.1702623Z I0902 15:58:33.170155    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-smallrye-health-3.38.1.jar as lib/main/io.quarkus.quarkus-smallrye-health-3.38.1.jar
2026-09-02T18:58:33.1722432Z I0902 15:58:33.172041    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-smallrye-jwt-3.38.1.jar as lib/main/io.quarkus.quarkus-smallrye-jwt-3.38.1.jar
2026-09-02T18:58:33.1730289Z I0902 15:58:33.172901    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-smallrye-jwt-build-3.38.1.jar as lib/main/io.quarkus.quarkus-smallrye-jwt-build-3.38.1.jar
2026-09-02T18:58:33.1738787Z I0902 15:58:33.173753    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-smallrye-openapi-3.38.1.jar as lib/main/io.quarkus.quarkus-smallrye-openapi-3.38.1.jar
2026-09-02T18:58:33.1755501Z I0902 15:58:33.175433    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-spring-aop-api-6.2.SP3.jar as lib/main/io.quarkus.quarkus-spring-aop-api-6.2.SP3.jar
2026-09-02T18:58:33.1775084Z I0902 15:58:33.177365    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-spring-beans-api-6.2.SP3.jar as lib/main/io.quarkus.quarkus-spring-beans-api-6.2.SP3.jar
2026-09-02T18:58:33.1814893Z I0902 15:58:33.181333    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-spring-boot-orm-api-3.4.jar as lib/main/io.quarkus.quarkus-spring-boot-orm-api-3.4.jar
2026-09-02T18:58:33.1815658Z I0902 15:58:33.181500    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-spring-cache-3.38.1.jar as lib/main/io.quarkus.quarkus-spring-cache-3.38.1.jar
2026-09-02T18:58:33.1816734Z I0902 15:58:33.181613    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-spring-context-api-6.2.SP3.jar as lib/main/io.quarkus.quarkus-spring-context-api-6.2.SP3.jar
2026-09-02T18:58:33.1879310Z I0902 15:58:33.187817    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-spring-core-api-6.2.SP3.jar as lib/main/io.quarkus.quarkus-spring-core-api-6.2.SP3.jar
2026-09-02T18:58:33.2002396Z I0902 15:58:33.199937    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-spring-data-commons-api-3.5.jar as lib/main/io.quarkus.quarkus-spring-data-commons-api-3.5.jar
2026-09-02T18:58:33.2046797Z I0902 15:58:33.204495    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-spring-data-jpa-3.38.1.jar as lib/main/io.quarkus.quarkus-spring-data-jpa-3.38.1.jar
2026-09-02T18:58:33.2054781Z I0902 15:58:33.205384    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-spring-data-jpa-api-3.5.jar as lib/main/io.quarkus.quarkus-spring-data-jpa-api-3.5.jar
2026-09-02T18:58:33.2056916Z I0902 15:58:33.205593    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-spring-di-3.38.1.jar as lib/main/io.quarkus.quarkus-spring-di-3.38.1.jar
2026-09-02T18:58:33.2058590Z I0902 15:58:33.205781    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-spring-security-3.38.1.jar as lib/main/io.quarkus.quarkus-spring-security-3.38.1.jar
2026-09-02T18:58:33.2064565Z I0902 15:58:33.206377    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-spring-security-core-api-6.4.jar as lib/main/io.quarkus.quarkus-spring-security-core-api-6.4.jar
2026-09-02T18:58:33.2067472Z I0902 15:58:33.206671    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-spring-web-3.38.1.jar as lib/main/io.quarkus.quarkus-spring-web-3.38.1.jar
2026-09-02T18:58:33.2074915Z I0902 15:58:33.207322    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-spring-web-api-6.2.SP3.jar as lib/main/io.quarkus.quarkus-spring-web-api-6.2.SP3.jar
2026-09-02T18:58:33.2132202Z I0902 15:58:33.212991    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-spring-web-common-3.38.1.jar as lib/main/io.quarkus.quarkus-spring-web-common-3.38.1.jar
2026-09-02T18:58:33.2133864Z I0902 15:58:33.213134    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-spring-web-rest-3.38.1.jar as lib/main/io.quarkus.quarkus-spring-web-rest-3.38.1.jar
2026-09-02T18:58:33.2143009Z I0902 15:58:33.214155    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-spring-webmvc-api-6.2.SP3.jar as lib/main/io.quarkus.quarkus-spring-webmvc-api-6.2.SP3.jar
2026-09-02T18:58:33.2144582Z I0902 15:58:33.214257    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-swagger-ui-3.38.1.jar as lib/main/io.quarkus.quarkus-swagger-ui-3.38.1.jar
2026-09-02T18:58:33.2145818Z I0902 15:58:33.214451    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-tls-registry-3.38.1.jar as lib/main/io.quarkus.quarkus-tls-registry-3.38.1.jar
2026-09-02T18:58:33.2181002Z I0902 15:58:33.217957    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-tls-registry-spi-3.38.1.jar as lib/main/io.quarkus.quarkus-tls-registry-spi-3.38.1.jar
2026-09-02T18:58:33.2197406Z I0902 15:58:33.219613    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-transaction-annotations-3.38.1.jar as lib/main/io.quarkus.quarkus-transaction-annotations-3.38.1.jar
2026-09-02T18:58:33.2198621Z I0902 15:58:33.219750    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-undertow-3.38.1.jar as lib/main/io.quarkus.quarkus-undertow-3.38.1.jar
2026-09-02T18:58:33.2238018Z I0902 15:58:33.223657    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-vertx-3.38.1.jar as lib/main/io.quarkus.quarkus-vertx-3.38.1.jar
2026-09-02T18:58:33.2298457Z I0902 15:58:33.229697    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-vertx-http-3.38.1.jar as lib/main/io.quarkus.quarkus-vertx-http-3.38.1.jar
2026-09-02T18:58:33.2644134Z I0902 15:58:33.264029    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-virtual-threads-3.38.1.jar as lib/main/io.quarkus.quarkus-virtual-threads-3.38.1.jar
2026-09-02T18:58:33.2654331Z I0902 15:58:33.265254    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.quarkus-websockets-next-spi-3.38.1.jar as lib/main/io.quarkus.quarkus-websockets-next-spi-3.38.1.jar
2026-09-02T18:58:33.2664328Z I0902 15:58:33.266302    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.qute.qute-core-3.38.1.jar as lib/main/io.quarkus.qute.qute-core-3.38.1.jar
2026-09-02T18:58:33.2834749Z I0902 15:58:33.283170    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-3.38.1.jar as lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-3.38.1.jar
2026-09-02T18:58:33.3059836Z I0902 15:58:33.305424    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-client-3.38.1.jar as lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-client-3.38.1.jar
2026-09-02T18:58:33.3206494Z I0902 15:58:33.320299    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-common-3.38.1.jar as lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-common-3.38.1.jar
2026-09-02T18:58:33.3351840Z I0902 15:58:33.334421    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-common-types-3.38.1.jar as lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-common-types-3.38.1.jar
2026-09-02T18:58:33.3353320Z I0902 15:58:33.334713    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-jackson-3.38.1.jar as lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-jackson-3.38.1.jar
2026-09-02T18:58:33.3356672Z I0902 15:58:33.335537    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-vertx-3.38.1.jar as lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-vertx-3.38.1.jar
2026-09-02T18:58:33.3369041Z I0902 15:58:33.336725    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.security.quarkus-security-2.3.2.jar as lib/main/io.quarkus.security.quarkus-security-2.3.2.jar
2026-09-02T18:58:33.3384564Z I0902 15:58:33.338259    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.quarkus.vertx.utils.quarkus-vertx-utils-3.38.1.jar as lib/main/io.quarkus.vertx.utils.quarkus-vertx-utils-3.38.1.jar
2026-09-02T18:58:33.3400413Z I0902 15:58:33.339449    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.certs.smallrye-private-key-pem-parser-0.9.3.jar as lib/main/io.smallrye.certs.smallrye-private-key-pem-parser-0.9.3.jar
2026-09-02T18:58:33.3401131Z I0902 15:58:33.339692    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.common.smallrye-common-annotation-2.19.0.jar as lib/main/io.smallrye.common.smallrye-common-annotation-2.19.0.jar
2026-09-02T18:58:33.3409645Z I0902 15:58:33.340593    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.common.smallrye-common-classloader-2.19.0.jar as lib/main/io.smallrye.common.smallrye-common-classloader-2.19.0.jar
2026-09-02T18:58:33.3414828Z I0902 15:58:33.341344    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.common.smallrye-common-search-2.19.0.jar as lib/main/io.smallrye.common.smallrye-common-search-2.19.0.jar
2026-09-02T18:58:33.3426653Z I0902 15:58:33.342205    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.common.smallrye-common-vertx-context-2.19.0.jar as lib/main/io.smallrye.common.smallrye-common-vertx-context-2.19.0.jar
2026-09-02T18:58:33.3435177Z I0902 15:58:33.343223    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.config.smallrye-config-3.17.2.jar as lib/main/io.smallrye.config.smallrye-config-3.17.2.jar
2026-09-02T18:58:33.3451348Z I0902 15:58:33.344999    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.config.smallrye-config-common-3.17.2.jar as lib/main/io.smallrye.config.smallrye-config-common-3.17.2.jar
2026-09-02T18:58:33.3452649Z I0902 15:58:33.345147    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.config.smallrye-config-core-3.17.2.jar as lib/main/io.smallrye.config.smallrye-config-core-3.17.2.jar
2026-09-02T18:58:33.3624685Z I0902 15:58:33.362207    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.config.smallrye-config-source-file-system-3.13.2.jar as lib/main/io.smallrye.config.smallrye-config-source-file-system-3.13.2.jar
2026-09-02T18:58:33.3636819Z I0902 15:58:33.363071    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.jandex-3.6.0.jar as lib/main/io.smallrye.jandex-3.6.0.jar
2026-09-02T18:58:33.3816467Z I0902 15:58:33.381422    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.reactive.mutiny-3.3.0.jar as lib/main/io.smallrye.reactive.mutiny-3.3.0.jar
2026-09-02T18:58:33.4197686Z I0902 15:58:33.419409    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.reactive.mutiny-smallrye-context-propagation-3.3.0.jar as lib/main/io.smallrye.reactive.mutiny-smallrye-context-propagation-3.3.0.jar
2026-09-02T18:58:33.4199043Z I0902 15:58:33.419596    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.reactive.mutiny-zero-flow-adapters-1.2.1.jar as lib/main/io.smallrye.reactive.mutiny-zero-flow-adapters-1.2.1.jar
2026-09-02T18:58:33.4211568Z I0902 15:58:33.420921    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-auth-common-3.23.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-auth-common-3.23.0.jar
2026-09-02T18:58:33.4235833Z I0902 15:58:33.423467    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-bridge-common-3.23.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-bridge-common-3.23.0.jar
2026-09-02T18:58:33.4238215Z I0902 15:58:33.423729    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-core-3.23.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-core-3.23.0.jar
2026-09-02T18:58:33.4385804Z I0902 15:58:33.438287    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-mail-client-3.23.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-mail-client-3.23.0.jar
2026-09-02T18:58:33.4386994Z I0902 15:58:33.438597    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-runtime-3.23.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-runtime-3.23.0.jar
2026-09-02T18:58:33.4394678Z I0902 15:58:33.439334    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-uri-template-3.23.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-uri-template-3.23.0.jar
2026-09-02T18:58:33.4410369Z I0902 15:58:33.440844    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-3.23.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-3.23.0.jar
2026-09-02T18:58:33.4473864Z I0902 15:58:33.447138    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-client-3.23.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-client-3.23.0.jar
2026-09-02T18:58:33.4501188Z I0902 15:58:33.449949    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-common-3.23.0.jar as lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-common-3.23.0.jar
2026-09-02T18:58:33.4503068Z I0902 15:58:33.450200    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.reactive.smallrye-reactive-converter-api-3.0.3.jar as lib/main/io.smallrye.reactive.smallrye-reactive-converter-api-3.0.3.jar
2026-09-02T18:58:33.4512431Z I0902 15:58:33.451115    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.reactive.smallrye-reactive-converter-mutiny-3.0.3.jar as lib/main/io.smallrye.reactive.smallrye-reactive-converter-mutiny-3.0.3.jar
2026-09-02T18:58:33.4519375Z I0902 15:58:33.451812    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.smallrye-context-propagation-2.3.0.jar as lib/main/io.smallrye.smallrye-context-propagation-2.3.0.jar
2026-09-02T18:58:33.4555107Z I0902 15:58:33.455372    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.smallrye-context-propagation-api-2.3.0.jar as lib/main/io.smallrye.smallrye-context-propagation-api-2.3.0.jar
2026-09-02T18:58:33.4562566Z I0902 15:58:33.456108    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.smallrye-context-propagation-jta-2.3.0.jar as lib/main/io.smallrye.smallrye-context-propagation-jta-2.3.0.jar
2026-09-02T18:58:33.4564899Z I0902 15:58:33.456376    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.smallrye-context-propagation-storage-2.3.0.jar as lib/main/io.smallrye.smallrye-context-propagation-storage-2.3.0.jar
2026-09-02T18:58:33.4566781Z I0902 15:58:33.456569    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.smallrye-fault-tolerance-6.11.2.jar as lib/main/io.smallrye.smallrye-fault-tolerance-6.11.2.jar
2026-09-02T18:58:33.4631228Z I0902 15:58:33.462906    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.smallrye-fault-tolerance-api-6.11.2.jar as lib/main/io.smallrye.smallrye-fault-tolerance-api-6.11.2.jar
2026-09-02T18:58:33.4651556Z I0902 15:58:33.465027    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.smallrye-fault-tolerance-apiimpl-6.11.2.jar as lib/main/io.smallrye.smallrye-fault-tolerance-apiimpl-6.11.2.jar
2026-09-02T18:58:33.4720319Z I0902 15:58:33.471687    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.smallrye-fault-tolerance-autoconfig-core-6.11.2.jar as lib/main/io.smallrye.smallrye-fault-tolerance-autoconfig-core-6.11.2.jar
2026-09-02T18:58:33.4720929Z I0902 15:58:33.471823    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.smallrye-fault-tolerance-context-propagation-6.11.2.jar as lib/main/io.smallrye.smallrye-fault-tolerance-context-propagation-6.11.2.jar
2026-09-02T18:58:33.4721403Z I0902 15:58:33.472000    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.smallrye-fault-tolerance-core-6.11.2.jar as lib/main/io.smallrye.smallrye-fault-tolerance-core-6.11.2.jar
2026-09-02T18:58:33.4799131Z I0902 15:58:33.479718    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.smallrye-fault-tolerance-mutiny-6.11.2.jar as lib/main/io.smallrye.smallrye-fault-tolerance-mutiny-6.11.2.jar
2026-09-02T18:58:33.4800673Z I0902 15:58:33.479975    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.smallrye-fault-tolerance-vertx-6.11.2.jar as lib/main/io.smallrye.smallrye-fault-tolerance-vertx-6.11.2.jar
2026-09-02T18:58:33.4802121Z I0902 15:58:33.480124    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.smallrye-health-4.3.0.jar as lib/main/io.smallrye.smallrye-health-4.3.0.jar
2026-09-02T18:58:33.4826062Z I0902 15:58:33.482485    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.smallrye-health-api-4.3.0.jar as lib/main/io.smallrye.smallrye-health-api-4.3.0.jar
2026-09-02T18:58:33.4828924Z I0902 15:58:33.482774    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.smallrye-health-provided-checks-4.3.0.jar as lib/main/io.smallrye.smallrye-health-provided-checks-4.3.0.jar
2026-09-02T18:58:33.4841454Z I0902 15:58:33.484024    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.smallrye-jwt-4.6.3.jar as lib/main/io.smallrye.smallrye-jwt-4.6.3.jar
2026-09-02T18:58:33.4902387Z I0902 15:58:33.489957    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.smallrye-jwt-build-4.6.3.jar as lib/main/io.smallrye.smallrye-jwt-build-4.6.3.jar
2026-09-02T18:58:33.4936307Z I0902 15:58:33.493410    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.smallrye-jwt-common-4.6.3.jar as lib/main/io.smallrye.smallrye-jwt-common-4.6.3.jar
2026-09-02T18:58:33.4951034Z I0902 15:58:33.494972    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.smallrye-open-api-core-4.3.5.jar as lib/main/io.smallrye.smallrye-open-api-core-4.3.5.jar
2026-09-02T18:58:33.5252822Z I0902 15:58:33.524899    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.smallrye-open-api-model-4.3.5.jar as lib/main/io.smallrye.smallrye-open-api-model-4.3.5.jar
2026-09-02T18:58:33.5264105Z I0902 15:58:33.526223    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.smallrye.stork.stork-api-2.7.10.jar as lib/main/io.smallrye.stork.stork-api-2.7.10.jar
2026-09-02T18:58:33.5280996Z I0902 15:58:33.527904    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.vertx.vertx-auth-common-4.5.30.jar as lib/main/io.vertx.vertx-auth-common-4.5.30.jar
2026-09-02T18:58:33.5346209Z I0902 15:58:33.534437    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.vertx.vertx-bridge-common-4.5.30.jar as lib/main/io.vertx.vertx-bridge-common-4.5.30.jar
2026-09-02T18:58:33.5347252Z I0902 15:58:33.534630    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.vertx.vertx-codegen-4.5.30.jar as lib/main/io.vertx.vertx-codegen-4.5.30.jar
2026-09-02T18:58:33.5443301Z I0902 15:58:33.544079    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.vertx.vertx-core-4.5.30.jar as lib/main/io.vertx.vertx-core-4.5.30.jar
2026-09-02T18:58:33.6195751Z I0902 15:58:33.619204    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.vertx.vertx-mail-client-4.5.30.jar as lib/main/io.vertx.vertx-mail-client-4.5.30.jar
2026-09-02T18:58:33.6261207Z I0902 15:58:33.625877    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.vertx.vertx-uri-template-4.5.30.jar as lib/main/io.vertx.vertx-uri-template-4.5.30.jar
2026-09-02T18:58:33.6291698Z I0902 15:58:33.629064    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.vertx.vertx-web-4.5.30.jar as lib/main/io.vertx.vertx-web-4.5.30.jar
2026-09-02T18:58:33.6456483Z I0902 15:58:33.645358    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.vertx.vertx-web-client-4.5.30.jar as lib/main/io.vertx.vertx-web-client-4.5.30.jar
2026-09-02T18:58:33.6506329Z I0902 15:58:33.650473    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/io.vertx.vertx-web-common-4.5.30.jar as lib/main/io.vertx.vertx-web-common-4.5.30.jar
2026-09-02T18:58:33.6516055Z I0902 15:58:33.651517    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/jakarta.activation.jakarta.activation-api-2.0.0.jar as lib/main/jakarta.activation.jakarta.activation-api-2.0.0.jar
2026-09-02T18:58:33.6546903Z I0902 15:58:33.654378    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/jakarta.annotation.jakarta.annotation-api-3.0.0.jar as lib/main/jakarta.annotation.jakarta.annotation-api-3.0.0.jar
2026-09-02T18:58:33.6574580Z I0902 15:58:33.656436    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/jakarta.authentication.jakarta.authentication-api-3.1.0.jar as lib/main/jakarta.authentication.jakarta.authentication-api-3.1.0.jar
2026-09-02T18:58:33.6580230Z I0902 15:58:33.657813    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/jakarta.authorization.jakarta.authorization-api-3.0.0.jar as lib/main/jakarta.authorization.jakarta.authorization-api-3.0.0.jar
2026-09-02T18:58:33.6607774Z I0902 15:58:33.660369    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/jakarta.el.jakarta.el-api-6.0.1.jar as lib/main/jakarta.el.jakarta.el-api-6.0.1.jar
2026-09-02T18:58:33.6654673Z I0902 15:58:33.665027    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/jakarta.enterprise.jakarta.enterprise.cdi-api-4.1.0.jar as lib/main/jakarta.enterprise.jakarta.enterprise.cdi-api-4.1.0.jar
2026-09-02T18:58:33.6706939Z I0902 15:58:33.670431    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/jakarta.enterprise.jakarta.enterprise.lang-model-4.1.0.jar as lib/main/jakarta.enterprise.jakarta.enterprise.lang-model-4.1.0.jar
2026-09-02T18:58:33.6716699Z I0902 15:58:33.671566    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/jakarta.inject.jakarta.inject-api-2.0.1.jar as lib/main/jakarta.inject.jakarta.inject-api-2.0.1.jar
2026-09-02T18:58:33.6727904Z I0902 15:58:33.672697    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/jakarta.interceptor.jakarta.interceptor-api-2.2.0.jar as lib/main/jakarta.interceptor.jakarta.interceptor-api-2.2.0.jar
2026-09-02T18:58:33.6743195Z I0902 15:58:33.674221    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/jakarta.json.jakarta.json-api-2.1.3.jar as lib/main/jakarta.json.jakarta.json-api-2.1.3.jar
2026-09-02T18:58:33.6756052Z I0902 15:58:33.675238    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/jakarta.persistence.jakarta.persistence-api-3.2.0.jar as lib/main/jakarta.persistence.jakarta.persistence-api-3.2.0.jar
2026-09-02T18:58:33.6840743Z I0902 15:58:33.683867    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/jakarta.resource.jakarta.resource-api-2.1.0.jar as lib/main/jakarta.resource.jakarta.resource-api-2.1.0.jar
2026-09-02T18:58:33.6863194Z I0902 15:58:33.686222    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/jakarta.servlet.jakarta.servlet-api-6.0.0.jar as lib/main/jakarta.servlet.jakarta.servlet-api-6.0.0.jar
2026-09-02T18:58:33.7025563Z I0902 15:58:33.702312    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/jakarta.transaction.jakarta.transaction-api-2.0.1.jar as lib/main/jakarta.transaction.jakarta.transaction-api-2.0.1.jar
2026-09-02T18:58:33.7040026Z I0902 15:58:33.703907    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/jakarta.ws.rs.jakarta.ws.rs-api-3.1.0.jar as lib/main/jakarta.ws.rs.jakarta.ws.rs-api-3.1.0.jar
2026-09-02T18:58:33.7101554Z I0902 15:58:33.709947    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/jakarta.xml.bind.jakarta.xml.bind-api-3.0.1.jar as lib/main/jakarta.xml.bind.jakarta.xml.bind-api-3.0.1.jar
2026-09-02T18:58:33.7152604Z I0902 15:58:33.715079    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/javax.cache.cache-api-1.1.1.jar as lib/main/javax.cache.cache-api-1.1.1.jar
2026-09-02T18:58:33.7177617Z I0902 15:58:33.717635    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/net.arnx.wmf2svg-0.10.6.jar as lib/main/net.arnx.wmf2svg-0.10.6.jar
2026-09-02T18:58:33.7343598Z I0902 15:58:33.734086    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/net.engio.mbassador-1.3.2.jar as lib/main/net.engio.mbassador-1.3.2.jar
2026-09-02T18:58:33.7396333Z I0902 15:58:33.739507    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.antlr.antlr-runtime-3.5.3.jar as lib/main/org.antlr.antlr-runtime-3.5.3.jar
2026-09-02T18:58:33.7468629Z I0902 15:58:33.746720    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.antlr.antlr4-runtime-4.13.2.jar as lib/main/org.antlr.antlr4-runtime-4.13.2.jar
2026-09-02T18:58:33.7623637Z I0902 15:58:33.762069    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.antlr.stringtemplate-3.2.1.jar as lib/main/org.antlr.stringtemplate-3.2.1.jar
2026-09-02T18:58:33.7683546Z I0902 15:58:33.768100    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.apache.commons.commons-collections4-4.5.0.jar as lib/main/org.apache.commons.commons-collections4-4.5.0.jar
2026-09-02T18:58:33.8083239Z I0902 15:58:33.807899    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.apache.commons.commons-compress-1.28.0.jar as lib/main/org.apache.commons.commons-compress-1.28.0.jar
2026-09-02T18:58:33.8573220Z I0902 15:58:33.856841    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.apache.commons.commons-csv-1.10.0.jar as lib/main/org.apache.commons.commons-csv-1.10.0.jar
2026-09-02T18:58:33.8604925Z I0902 15:58:33.860174    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.apache.commons.commons-lang3-3.20.0.jar as lib/main/org.apache.commons.commons-lang3-3.20.0.jar
2026-09-02T18:58:33.8925102Z I0902 15:58:33.892151    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.apache.commons.commons-math3-3.6.1.jar as lib/main/org.apache.commons.commons-math3-3.6.1.jar
2026-09-02T18:58:33.9871052Z I0902 15:58:33.986614    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.apache.httpcomponents.httpclient-4.5.14.jar as lib/main/org.apache.httpcomponents.httpclient-4.5.14.jar
2026-09-02T18:58:34.0236021Z I0902 15:58:34.022641    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.apache.httpcomponents.httpcore-4.4.16.jar as lib/main/org.apache.httpcomponents.httpcore-4.4.16.jar
2026-09-02T18:58:34.0384986Z I0902 15:58:34.037975    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.apache.logging.log4j.log4j-api-2.26.0.jar as lib/main/org.apache.logging.log4j.log4j-api-2.26.0.jar
2026-09-02T18:58:34.0545264Z I0902 15:58:34.053890    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.apache.pdfbox.fontbox-3.0.8.jar as lib/main/org.apache.pdfbox.fontbox-3.0.8.jar
2026-09-02T18:58:34.1216936Z I0902 15:58:34.120843    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.apache.pdfbox.pdfbox-io-3.0.8.jar as lib/main/org.apache.pdfbox.pdfbox-io-3.0.8.jar
2026-09-02T18:58:34.1231449Z I0902 15:58:34.122861    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.apache.poi.poi-5.5.1.jar as lib/main/org.apache.poi.poi-5.5.1.jar
2026-09-02T18:58:34.2552827Z I0902 15:58:34.254958    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.apache.poi.poi-ooxml-5.5.1.jar as lib/main/org.apache.poi.poi-ooxml-5.5.1.jar
2026-09-02T18:58:34.3442281Z I0902 15:58:34.343827    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.apache.poi.poi-ooxml-lite-5.5.1.jar as lib/main/org.apache.poi.poi-ooxml-lite-5.5.1.jar
2026-09-02T18:58:34.6004495Z I0902 15:58:34.600052    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.apache.xmlbeans.xmlbeans-5.3.0.jar as lib/main/org.apache.xmlbeans.xmlbeans-5.3.0.jar
2026-09-02T18:58:34.6935969Z I0902 15:58:34.693265    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.apache.xmlgraphics.xmlgraphics-commons-2.11.jar as lib/main/org.apache.xmlgraphics.xmlgraphics-commons-2.11.jar
2026-09-02T18:58:34.7251182Z I0902 15:58:34.724770    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.bitbucket.b_c.jose4j-0.9.6.jar as lib/main/org.bitbucket.b_c.jose4j-0.9.6.jar
2026-09-02T18:58:34.7390436Z I0902 15:58:34.738689    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.checkerframework.checker-qual-4.2.0.jar as lib/main/org.checkerframework.checker-qual-4.2.0.jar
2026-09-02T18:58:34.7481792Z I0902 15:58:34.747909    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.docx4j.docx4j-JAXB-ReferenceImpl-11.4.11.jar as lib/main/org.docx4j.docx4j-JAXB-ReferenceImpl-11.4.11.jar
2026-09-02T18:58:34.7482295Z I0902 15:58:34.748004    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.docx4j.docx4j-copy-17.0.2.jar as lib/main/org.docx4j.docx4j-copy-17.0.2.jar
2026-09-02T18:58:34.7482670Z I0902 15:58:34.748126    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.docx4j.docx4j-core-17.0.2.jar as lib/main/org.docx4j.docx4j-core-17.0.2.jar
2026-09-02T18:58:34.9270023Z I0902 15:58:34.926395    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.docx4j.docx4j-generated-objects-17.0.2.jar as lib/main/org.docx4j.docx4j-generated-objects-17.0.2.jar
2026-09-02T18:58:35.1102862Z .I0902 15:58:35.109504    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.docx4j.org.apache.xalan-interpretive-11.0.0.jar as lib/main/org.docx4j.org.apache.xalan-interpretive-11.0.0.jar
2026-09-02T18:58:35.1925525Z I0902 15:58:35.192181    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.docx4j.org.apache.xalan-serializer-11.0.0.jar as lib/main/org.docx4j.org.apache.xalan-serializer-11.0.0.jar
2026-09-02T18:58:35.2063734Z I0902 15:58:35.205548    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.eclipse.angus.angus-activation-2.0.3.jar as lib/main/org.eclipse.angus.angus-activation-2.0.3.jar
2026-09-02T18:58:35.2070642Z I0902 15:58:35.206659    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.eclipse.microprofile.config.microprofile-config-api-3.1.1.jar as lib/main/org.eclipse.microprofile.config.microprofile-config-api-3.1.1.jar
2026-09-02T18:58:35.2078827Z I0902 15:58:35.207644    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.eclipse.microprofile.context-propagation.microprofile-context-propagation-api-1.3.jar as lib/main/org.eclipse.microprofile.context-propagation.microprofile-context-propagation-api-1.3.jar
2026-09-02T18:58:35.2087505Z I0902 15:58:35.208319    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.eclipse.microprofile.fault-tolerance.microprofile-fault-tolerance-api-4.1.2.jar as lib/main/org.eclipse.microprofile.fault-tolerance.microprofile-fault-tolerance-api-4.1.2.jar
2026-09-02T18:58:35.2100619Z I0902 15:58:35.209373    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.eclipse.microprofile.health.microprofile-health-api-4.0.1.jar as lib/main/org.eclipse.microprofile.health.microprofile-health-api-4.0.1.jar
2026-09-02T18:58:35.2101683Z I0902 15:58:35.209681    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.eclipse.microprofile.jwt.microprofile-jwt-auth-api-2.1.jar as lib/main/org.eclipse.microprofile.jwt.microprofile-jwt-auth-api-2.1.jar
2026-09-02T18:58:35.2120106Z I0902 15:58:35.210679    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.eclipse.microprofile.openapi.microprofile-openapi-api-4.1.1.jar as lib/main/org.eclipse.microprofile.openapi.microprofile-openapi-api-4.1.1.jar
2026-09-02T18:58:35.2155140Z I0902 15:58:35.214918    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.eclipse.microprofile.rest.client.microprofile-rest-client-api-4.0.jar as lib/main/org.eclipse.microprofile.rest.client.microprofile-rest-client-api-4.0.jar
2026-09-02T18:58:35.2155657Z I0902 15:58:35.215029    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.eclipse.parsson.parsson-1.1.9.jar as lib/main/org.eclipse.parsson.parsson-1.1.9.jar
2026-09-02T18:58:35.2207270Z I0902 15:58:35.220520    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.glassfish.expressly.expressly-6.0.0.jar as lib/main/org.glassfish.expressly.expressly-6.0.0.jar
2026-09-02T18:58:35.2297970Z I0902 15:58:35.229541    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.glassfish.jaxb.jaxb-core-4.0.9.jar as lib/main/org.glassfish.jaxb.jaxb-core-4.0.9.jar
2026-09-02T18:58:35.2361976Z I0902 15:58:35.236043    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.glassfish.jaxb.jaxb-runtime-3.0.1.jar as lib/main/org.glassfish.jaxb.jaxb-runtime-3.0.1.jar
2026-09-02T18:58:35.2771269Z I0902 15:58:35.276739    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.glassfish.jaxb.txw2-4.0.9.jar as lib/main/org.glassfish.jaxb.txw2-4.0.9.jar
2026-09-02T18:58:35.2803815Z I0902 15:58:35.280140    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.hdrhistogram.HdrHistogram-2.2.2.jar as lib/main/org.hdrhistogram.HdrHistogram-2.2.2.jar
2026-09-02T18:58:35.2877045Z I0902 15:58:35.287402    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.hibernate.models.hibernate-models-1.1.1.jar as lib/main/org.hibernate.models.hibernate-models-1.1.1.jar
2026-09-02T18:58:35.2983604Z I0902 15:58:35.298029    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.hibernate.orm.hibernate-core-7.4.5.Final.jar as lib/main/org.hibernate.orm.hibernate-core-7.4.5.Final.jar
2026-09-02T18:58:35.9879323Z I0902 15:58:35.987451    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.hibernate.orm.hibernate-graalvm-7.4.5.Final.jar as lib/main/org.hibernate.orm.hibernate-graalvm-7.4.5.Final.jar
2026-09-02T18:58:35.9887832Z I0902 15:58:35.988568    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.hibernate.orm.hibernate-jcache-7.4.5.Final.jar as lib/main/org.hibernate.orm.hibernate-jcache-7.4.5.Final.jar
2026-09-02T18:58:35.9889651Z I0902 15:58:35.988801    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.jboss.jboss-transaction-spi-8.0.0.Final.jar as lib/main/org.jboss.jboss-transaction-spi-8.0.0.Final.jar
2026-09-02T18:58:35.9900603Z I0902 15:58:35.989808    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.jboss.logging.commons-logging-jboss-logging-2.0.0.Final.jar as lib/main/org.jboss.logging.commons-logging-jboss-logging-2.0.0.Final.jar
2026-09-02T18:58:35.9909767Z I0902 15:58:35.990841    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.jboss.narayana.jta.narayana-jta-7.3.4.Final.jar as lib/main/org.jboss.narayana.jta.narayana-jta-7.3.4.Final.jar
2026-09-02T18:58:36.0632660Z I0902 15:58:36.062878    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.jboss.narayana.jts.narayana-jts-integration-7.3.4.Final.jar as lib/main/org.jboss.narayana.jts.narayana-jts-integration-7.3.4.Final.jar
2026-09-02T18:58:36.0664568Z I0902 15:58:36.065634    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.jboss.slf4j.slf4j-jboss-logmanager-2.0.2.Final.jar as lib/main/org.jboss.slf4j.slf4j-jboss-logmanager-2.0.2.Final.jar
2026-09-02T18:58:36.0665477Z I0902 15:58:36.065780    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.jboss.threads.jboss-threads-3.9.2.jar as lib/main/org.jboss.threads.jboss-threads-3.9.2.jar
2026-09-02T18:58:36.0727635Z I0902 15:58:36.072473    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.jctools.jctools-core-4.0.5.jar as lib/main/org.jctools.jctools-core-4.0.5.jar
2026-09-02T18:58:36.0945996Z I0902 15:58:36.094168    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.jspecify.jspecify-1.0.0.jar as lib/main/org.jspecify.jspecify-1.0.0.jar
2026-09-02T18:58:36.0946907Z I0902 15:58:36.094326    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.jvnet.jaxb.jaxb-plugins-runtime-4.0.13.jar as lib/main/org.jvnet.jaxb.jaxb-plugins-runtime-4.0.13.jar
2026-09-02T18:58:36.1010194Z I0902 15:58:36.100689    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.keycloak.keycloak-authz-client-26.0.11.jar as lib/main/org.keycloak.keycloak-authz-client-26.0.11.jar
2026-09-02T18:58:36.1048501Z I0902 15:58:36.104663    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.keycloak.keycloak-client-common-synced-26.0.11.jar as lib/main/org.keycloak.keycloak-client-common-synced-26.0.11.jar
2026-09-02T18:58:36.1338729Z I0902 15:58:36.133481    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.keycloak.keycloak-policy-enforcer-26.0.11.jar as lib/main/org.keycloak.keycloak-policy-enforcer-26.0.11.jar
2026-09-02T18:58:36.1357361Z I0902 15:58:36.135462    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.latencyutils.LatencyUtils-2.0.3.jar as lib/main/org.latencyutils.LatencyUtils-2.0.3.jar
2026-09-02T18:58:36.1369933Z I0902 15:58:36.136637    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.modelmapper.modelmapper-2.3.0.jar as lib/main/org.modelmapper.modelmapper-2.3.0.jar
2026-09-02T18:58:36.3008823Z I0902 15:58:36.300473    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.osgi.org.osgi.namespace.extender-1.0.1.jar as lib/main/org.osgi.org.osgi.namespace.extender-1.0.1.jar
2026-09-02T18:58:36.3011247Z I0902 15:58:36.300771    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.osgi.org.osgi.service.component.annotations-1.5.1.jar as lib/main/org.osgi.org.osgi.service.component.annotations-1.5.1.jar
2026-09-02T18:58:36.3033115Z I0902 15:58:36.303193    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.osgi.org.osgi.util.function-1.0.0.jar as lib/main/org.osgi.org.osgi.util.function-1.0.0.jar
2026-09-02T18:58:36.3035392Z I0902 15:58:36.303447    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.osgi.org.osgi.util.promise-1.0.0.jar as lib/main/org.osgi.org.osgi.util.promise-1.0.0.jar
2026-09-02T18:58:36.3055431Z I0902 15:58:36.305430    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.osgi.osgi.annotation-8.1.0.jar as lib/main/org.osgi.osgi.annotation-8.1.0.jar
2026-09-02T18:58:36.3074073Z I0902 15:58:36.307282    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.plutext.jaxb-svg11-11.4.0.jar as lib/main/org.plutext.jaxb-svg11-11.4.0.jar
2026-09-02T18:58:36.3225615Z I0902 15:58:36.322129    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.reactivestreams.reactive-streams-1.0.4.jar as lib/main/org.reactivestreams.reactive-streams-1.0.4.jar
2026-09-02T18:58:36.3226141Z I0902 15:58:36.322286    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.slf4j.jcl-over-slf4j-2.0.18.jar as lib/main/org.slf4j.jcl-over-slf4j-2.0.18.jar
2026-09-02T18:58:36.3246295Z I0902 15:58:36.324474    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.slf4j.slf4j-api-2.0.18.jar as lib/main/org.slf4j.slf4j-api-2.0.18.jar
2026-09-02T18:58:36.3276319Z I0902 15:58:36.327443    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.wildfly.common.wildfly-common-2.0.1.jar as lib/main/org.wildfly.common.wildfly-common-2.0.1.jar
2026-09-02T18:58:36.3392159Z I0902 15:58:36.338892    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.wildfly.security.wildfly-elytron-asn1-2.9.2.Final.jar as lib/main/org.wildfly.security.wildfly-elytron-asn1-2.9.2.Final.jar
2026-09-02T18:58:36.3411828Z I0902 15:58:36.340983    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.wildfly.security.wildfly-elytron-auth-2.9.2.Final.jar as lib/main/org.wildfly.security.wildfly-elytron-auth-2.9.2.Final.jar
2026-09-02T18:58:36.3412616Z I0902 15:58:36.341171    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.wildfly.security.wildfly-elytron-auth-server-2.9.2.Final.jar as lib/main/org.wildfly.security.wildfly-elytron-auth-server-2.9.2.Final.jar
2026-09-02T18:58:36.3541464Z I0902 15:58:36.353836    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.wildfly.security.wildfly-elytron-base-2.9.2.Final.jar as lib/main/org.wildfly.security.wildfly-elytron-base-2.9.2.Final.jar
2026-09-02T18:58:36.3554011Z I0902 15:58:36.355183    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.wildfly.security.wildfly-elytron-credential-2.9.2.Final.jar as lib/main/org.wildfly.security.wildfly-elytron-credential-2.9.2.Final.jar
2026-09-02T18:58:36.3628442Z I0902 15:58:36.362550    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.wildfly.security.wildfly-elytron-encryption-2.9.2.Final.jar as lib/main/org.wildfly.security.wildfly-elytron-encryption-2.9.2.Final.jar
2026-09-02T18:58:36.3630233Z I0902 15:58:36.362782    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.wildfly.security.wildfly-elytron-keystore-2.9.2.Final.jar as lib/main/org.wildfly.security.wildfly-elytron-keystore-2.9.2.Final.jar
2026-09-02T18:58:36.3649549Z I0902 15:58:36.364750    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.wildfly.security.wildfly-elytron-password-impl-2.9.2.Final.jar as lib/main/org.wildfly.security.wildfly-elytron-password-impl-2.9.2.Final.jar
2026-09-02T18:58:36.3701349Z I0902 15:58:36.369847    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.wildfly.security.wildfly-elytron-permission-2.9.2.Final.jar as lib/main/org.wildfly.security.wildfly-elytron-permission-2.9.2.Final.jar
2026-09-02T18:58:36.3718754Z I0902 15:58:36.371723    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.wildfly.security.wildfly-elytron-provider-util-2.9.2.Final.jar as lib/main/org.wildfly.security.wildfly-elytron-provider-util-2.9.2.Final.jar
2026-09-02T18:58:36.3735535Z I0902 15:58:36.373403    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.wildfly.security.wildfly-elytron-realm-2.9.2.Final.jar as lib/main/org.wildfly.security.wildfly-elytron-realm-2.9.2.Final.jar
2026-09-02T18:58:36.3798924Z I0902 15:58:36.379629    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.wildfly.security.wildfly-elytron-util-2.9.2.Final.jar as lib/main/org.wildfly.security.wildfly-elytron-util-2.9.2.Final.jar
2026-09-02T18:58:36.3825472Z I0902 15:58:36.382302    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.wildfly.security.wildfly-elytron-x500-2.9.2.Final.jar as lib/main/org.wildfly.security.wildfly-elytron-x500-2.9.2.Final.jar
2026-09-02T18:58:36.3841161Z I0902 15:58:36.383989    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.wildfly.security.wildfly-elytron-x500-cert-2.9.2.Final.jar as lib/main/org.wildfly.security.wildfly-elytron-x500-cert-2.9.2.Final.jar
2026-09-02T18:58:36.3869326Z I0902 15:58:36.386797    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.wildfly.security.wildfly-elytron-x500-cert-util-2.9.2.Final.jar as lib/main/org.wildfly.security.wildfly-elytron-x500-cert-util-2.9.2.Final.jar
2026-09-02T18:58:36.3870502Z I0902 15:58:36.386922    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/org.yaml.snakeyaml-2.6.jar as lib/main/org.yaml.snakeyaml-2.6.jar
2026-09-02T18:58:36.4023803Z I0902 15:58:36.402001    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/stax.stax-1.2.0.jar as lib/main/stax.stax-1.2.0.jar
2026-09-02T18:58:36.4111849Z I0902 15:58:36.410564    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/stax.stax-api-1.0.1.jar as lib/main/stax.stax-api-1.0.1.jar
2026-09-02T18:58:36.4119547Z I0902 15:58:36.411836    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/xerces.xercesImpl-2.12.2.jar as lib/main/xerces.xercesImpl-2.12.2.jar
2026-09-02T18:58:36.4757884Z I0902 15:58:36.475459    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/lib/main/xml-apis.xml-apis-1.4.01.jar as lib/main/xml-apis.xml-apis-1.4.01.jar
2026-09-02T18:58:36.4856007Z I0902 15:58:36.485266    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/quarkus as quarkus
2026-09-02T18:58:36.4857209Z I0902 15:58:36.485458    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/quarkus/generated-bytecode.jar as quarkus/generated-bytecode.jar
2026-09-02T18:58:36.6632275Z I0902 15:58:36.662859    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/quarkus/quarkus-application.dat as quarkus/quarkus-application.dat
2026-09-02T18:58:36.6752813Z I0902 15:58:36.674934    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/quarkus/transformed-bytecode.jar as quarkus/transformed-bytecode.jar
2026-09-02T18:58:36.7126488Z I0902 15:58:36.712282    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/quarkus-app-dependencies.txt as quarkus-app-dependencies.txt
2026-09-02T18:58:36.7127323Z I0902 15:58:36.712510    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/quarkus-run.jar as quarkus-run.jar
2026-09-02T18:58:36.7129346Z I0902 15:58:36.712858    1145 tar.go:312] Adding to tar: /opt/ads-agent/_work/14233/a/sisgf-backend-14-0-6-11.zip as sisgf-backend-14-0-6-11.zip
2026-09-02T18:58:40.1742173Z .
2026-09-02T18:58:40.1742367Z Uploading finished
2026-09-02T18:58:40.1743134Z build.build.openshift.io/sisgf-backend-303 started
2026-09-02T18:58:40.2151433Z Adding cluster TLS certificate authority to trust store
2026-09-02T18:58:40.2151739Z Receiving source from STDIN as archive ...
2026-09-02T18:58:41.9618898Z Adding cluster TLS certificate authority to trust store
2026-09-02T18:58:42.9687855Z Adding cluster TLS certificate authority to trust store
2026-09-02T18:58:43.0112830Z time="2026-09-02T18:58:43Z" level=info msg="Not using native diff for overlay, this may cause degraded performance for building images: kernel has CONFIG_OVERLAY_FS_REDIRECT_DIR enabled"
2026-09-02T18:58:43.0115274Z I0902 18:58:43.008826       1 defaults.go:102] Defaulting to storage driver "overlay" with options [mountopt=metacopy=on].
2026-09-02T18:58:43.1460731Z Caching blobs under "/var/cache/blobs".
2026-09-02T18:58:43.1528223Z Trying to pull image-registry.openshift-image-registry.svc:5000/openshift/quarkus-java-binary-s2i@sha256:c14dd0ad9ae18713c127b5f98c9b2f2a4d85ce5215bc6e659432b7c112e6ef25...
2026-09-02T18:58:43.2881128Z Getting image source signatures
2026-09-02T18:58:43.3655949Z Copying blob sha256:7f24bdb73d536337c7d82dee9c11e09acd3bacb0e1a76e98c6e82a8208e82284
2026-09-02T18:58:43.4309382Z Copying blob sha256:0a9a2db04f3ebe8121912deecd1a66d98a4ff35c7a3ee57e3eeffcb667119be1
2026-09-02T18:58:43.4567717Z Copying blob sha256:c98bbacb82bbf386496c2e0ef89b288bc8782dd9ae664dddcb285cf0965ba7f2
2026-09-02T18:58:43.4643978Z Copying blob sha256:e1c363c96d760cb85e197cc8e2ab950760067935b29e7c098ae51ed371f5b0cd
2026-09-02T18:58:43.4808431Z Copying blob sha256:24dafab7f594e7a2b9e71b74932f6f72d2e31ac8f84fbd5062d173e63637b237
2026-09-02T18:58:43.4910995Z Copying blob sha256:264aaa453271eaaf6bc92b521f62e38cbda4f01e1a3fbf50abdb8b466be58a64
2026-09-02T18:58:43.9930774Z Copying blob sha256:9d5b85cf24e32083e165099afcc1bd9cc0a57a764f9077301e686e2d27f0eb2c
2026-09-02T18:58:44.0621522Z Copying blob sha256:067039afffe5f5aa56bc578e5d9256b8b0055763a32c54a38a73b969a8fd4f13
2026-09-02T18:58:44.0829853Z Copying blob sha256:4e0cd4f607fede7693f7eb61b31b84c051e5897ce5a096534ed90dc4808e5523
2026-09-02T18:58:44.1210032Z Copying blob sha256:586ae232f6757fb4248eda7dca86bf361d076242d052ee30965fec2eb1ea5a1c
2026-09-02T18:58:44.1297642Z Copying blob sha256:62d739cb3ca9a7f2a63e12f99c516e6432170af671b061195e6eafa7e864d6a2
2026-09-02T18:58:44.5091079Z Copying blob sha256:7749ffa7020405743e3e0425d93720455a83619d343e217645f48f948260ab49
2026-09-02T18:58:44.5370455Z Copying blob sha256:da2064a8b4a27db53f236c51c89c049f993c4438da41f6c80cb24242776bf1da
2026-09-02T18:58:52.8535272Z Copying config sha256:db5724295b3ca3bdc954cddb4ae13f779ef6dc185fa6fa797276b78493e1b0b2
2026-09-02T18:58:53.1241920Z Writing manifest to image destination
2026-09-02T18:58:53.1597361Z Storing signatures
2026-09-02T18:59:13.8057672Z Generating dockerfile with builder image image-registry.openshift-image-registry.svc:5000/openshift/quarkus-java-binary-s2i@sha256:c14dd0ad9ae18713c127b5f98c9b2f2a4d85ce5215bc6e659432b7c112e6ef25
2026-09-02T18:59:15.8277335Z STEP 1/9: FROM image-registry.openshift-image-registry.svc:5000/openshift/quarkus-java-binary-s2i@sha256:c14dd0ad9ae18713c127b5f98c9b2f2a4d85ce5215bc6e659432b7c112e6ef25
2026-09-02T18:59:15.9222596Z STEP 2/9: LABEL "io.openshift.build.image"="image-registry.openshift-image-registry.svc:5000/openshift/quarkus-java-binary-s2i@sha256:c14dd0ad9ae18713c127b5f98c9b2f2a4d85ce5215bc6e659432b7c112e6ef25"       "io.openshift.build.source-location"="/tmp/build/inputs"
2026-09-02T18:59:15.9502564Z STEP 3/9: ENV OPENSHIFT_BUILD_NAME="sisgf-backend-303"     OPENSHIFT_BUILD_NAMESPACE="build-images-ads"
2026-09-02T18:59:15.9775829Z STEP 4/9: USER root
2026-09-02T18:59:16.0064579Z STEP 5/9: COPY upload/src /tmp/src
2026-09-02T18:59:18.1126919Z STEP 6/9: RUN chown -R 1001:0 /tmp/src
2026-09-02T18:59:18.9835800Z STEP 7/9: USER 1001
2026-09-02T18:59:19.0116714Z STEP 8/9: RUN /usr/local/s2i/assemble
2026-09-02T18:59:19.6627546Z + LOCAL_SOURCE_DIR=/tmp/src
2026-09-02T18:59:19.6627768Z + DEPLOY_DIR=/deployments
2026-09-02T18:59:19.6628298Z + copy_artifacts deployments
2026-09-02T18:59:19.6628589Z + '[' -d /tmp/src ']'
2026-09-02T18:59:19.6631696Z + echo 'Copying all WAR and EAR artifacts from /tmp/src directory into /deployments for later deployment...'
2026-09-02T18:59:19.6631943Z Copying all WAR and EAR artifacts from /tmp/src directory into /deployments for later deployment...
2026-09-02T18:59:19.6632326Z + cp -rfv '/tmp/src/*-runner.jar' /tmp/src/quarkus-run.jar /tmp/src/app /tmp/src/lib /tmp/src/quarkus /tmp/src/quarkus-app-dependencies.txt /tmp/src/quarkus-run.jar /tmp/src/sisgf-backend-14-0-6-11.zip /deployments
2026-09-02T18:59:19.7092950Z '/tmp/src/quarkus-run.jar' -> '/deployments/quarkus-run.jar'
2026-09-02T18:59:19.7093749Z '/tmp/src/app' -> '/deployments/app'
2026-09-02T18:59:19.7094862Z '/tmp/src/app/sisgf-backend-11.01.01.01.jar' -> '/deployments/app/sisgf-backend-11.01.01.01.jar'
2026-09-02T18:59:19.7095618Z '/tmp/src/lib' -> '/deployments/lib'
2026-09-02T18:59:19.7095805Z '/tmp/src/lib/main' -> '/deployments/lib/main'
2026-09-02T18:59:19.7096050Z '/tmp/src/lib/main/antlr.antlr-2.7.7.jar' -> '/deployments/lib/main/antlr.antlr-2.7.7.jar'
2026-09-02T18:59:19.7096372Z '/tmp/src/lib/main/com.aayushatharva.brotli4j.brotli4j-1.23.0.jar' -> '/deployments/lib/main/com.aayushatharva.brotli4j.brotli4j-1.23.0.jar'
2026-09-02T18:59:19.7096706Z '/tmp/src/lib/main/com.aayushatharva.brotli4j.native-linux-x86_64-1.23.0.jar' -> '/deployments/lib/main/com.aayushatharva.brotli4j.native-linux-x86_64-1.23.0.jar'
2026-09-02T18:59:19.7097029Z '/tmp/src/lib/main/com.aayushatharva.brotli4j.service-1.23.0.jar' -> '/deployments/lib/main/com.aayushatharva.brotli4j.service-1.23.0.jar'
2026-09-02T18:59:19.7097318Z '/tmp/src/lib/main/com.cronutils.cron-utils-9.2.1.jar' -> '/deployments/lib/main/com.cronutils.cron-utils-9.2.1.jar'
2026-09-02T18:59:19.7097631Z '/tmp/src/lib/main/com.fasterxml.jackson.core.jackson-annotations-2.22.jar' -> '/deployments/lib/main/com.fasterxml.jackson.core.jackson-annotations-2.22.jar'
2026-09-02T18:59:19.7097960Z '/tmp/src/lib/main/com.fasterxml.jackson.core.jackson-core-2.22.0.jar' -> '/deployments/lib/main/com.fasterxml.jackson.core.jackson-core-2.22.0.jar'
2026-09-02T18:59:19.7098290Z '/tmp/src/lib/main/com.fasterxml.jackson.core.jackson-databind-2.22.0.jar' -> '/deployments/lib/main/com.fasterxml.jackson.core.jackson-databind-2.22.0.jar'
2026-09-02T18:59:19.7098639Z '/tmp/src/lib/main/com.fasterxml.jackson.dataformat.jackson-dataformat-yaml-2.22.0.jar' -> '/deployments/lib/main/com.fasterxml.jackson.dataformat.jackson-dataformat-yaml-2.22.0.jar'
2026-09-02T18:59:19.7099143Z '/tmp/src/lib/main/com.fasterxml.jackson.datatype.jackson-datatype-jdk8-2.22.0.jar' -> '/deployments/lib/main/com.fasterxml.jackson.datatype.jackson-datatype-jdk8-2.22.0.jar'
2026-09-02T18:59:19.7099507Z '/tmp/src/lib/main/com.fasterxml.jackson.datatype.jackson-datatype-jsr310-2.22.0.jar' -> '/deployments/lib/main/com.fasterxml.jackson.datatype.jackson-datatype-jsr310-2.22.0.jar'
2026-09-02T18:59:19.7099882Z '/tmp/src/lib/main/com.fasterxml.jackson.module.jackson-module-parameter-names-2.22.0.jar' -> '/deployments/lib/main/com.fasterxml.jackson.module.jackson-module-parameter-names-2.22.0.jar'
2026-09-02T18:59:19.7100208Z '/tmp/src/lib/main/com.github.ben-manes.caffeine.caffeine-3.2.4.jar' -> '/deployments/lib/main/com.github.ben-manes.caffeine.caffeine-3.2.4.jar'
2026-09-02T18:59:19.7100520Z '/tmp/src/lib/main/com.github.ben-manes.caffeine.jcache-3.2.4.jar' -> '/deployments/lib/main/com.github.ben-manes.caffeine.jcache-3.2.4.jar'
2026-09-02T18:59:19.7100807Z '/tmp/src/lib/main/com.github.virtuald.curvesapi-1.08.jar' -> '/deployments/lib/main/com.github.virtuald.curvesapi-1.08.jar'
2026-09-02T18:59:19.7101081Z '/tmp/src/lib/main/com.google.code.gson.gson-2.10.jar' -> '/deployments/lib/main/com.google.code.gson.gson-2.10.jar'
2026-09-02T18:59:19.7101445Z '/tmp/src/lib/main/com.google.errorprone.error_prone_annotations-2.49.0.jar' -> '/deployments/lib/main/com.google.errorprone.error_prone_annotations-2.49.0.jar'
2026-09-02T18:59:19.7101754Z '/tmp/src/lib/main/com.ibm.db2.jcc-11.5.6.0.jar' -> '/deployments/lib/main/com.ibm.db2.jcc-11.5.6.0.jar'
2026-09-02T18:59:19.7102142Z '/tmp/src/lib/main/com.itextpdf.itextpdf-5.5.13.6.jar' -> '/deployments/lib/main/com.itextpdf.itextpdf-5.5.13.6.jar'
2026-09-02T18:59:19.7102460Z '/tmp/src/lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar' -> '/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar'
2026-09-02T18:59:19.7102782Z '/tmp/src/lib/main/com.oracle.database.jdbc.ojdbc17-23.26.2.0.0.jar' -> '/deployments/lib/main/com.oracle.database.jdbc.ojdbc17-23.26.2.0.0.jar'
2026-09-02T18:59:19.7103088Z '/tmp/src/lib/main/com.oracle.database.nls.orai18n-23.26.2.0.0.jar' -> '/deployments/lib/main/com.oracle.database.nls.orai18n-23.26.2.0.0.jar'
2026-09-02T18:59:19.7103504Z '/tmp/src/lib/main/com.sun.istack.istack-commons-runtime-4.1.2.jar' -> '/deployments/lib/main/com.sun.istack.istack-commons-runtime-4.1.2.jar'
2026-09-02T18:59:19.7103875Z '/tmp/src/lib/main/com.thoughtworks.qdox.qdox-1.12.1.jar' -> '/deployments/lib/main/com.thoughtworks.qdox.qdox-1.12.1.jar'
2026-09-02T18:59:19.7104155Z '/tmp/src/lib/main/com.typesafe.config-1.4.7.jar' -> '/deployments/lib/main/com.typesafe.config-1.4.7.jar'
2026-09-02T18:59:19.7104421Z '/tmp/src/lib/main/com.zaxxer.SparseBitSet-1.3.jar' -> '/deployments/lib/main/com.zaxxer.SparseBitSet-1.3.jar'
2026-09-02T18:59:19.7104706Z '/tmp/src/lib/main/commons-codec.commons-codec-1.22.0.jar' -> '/deployments/lib/main/commons-codec.commons-codec-1.22.0.jar'
2026-09-02T18:59:19.7160105Z '/tmp/src/lib/main/commons-io.commons-io-2.22.0.jar' -> '/deployments/lib/main/commons-io.commons-io-2.22.0.jar'
2026-09-02T18:59:19.7160398Z '/tmp/src/lib/main/io.agroal.agroal-api-3.2.1.jar' -> '/deployments/lib/main/io.agroal.agroal-api-3.2.1.jar'
2026-09-02T18:59:19.7160697Z '/tmp/src/lib/main/io.agroal.agroal-narayana-3.2.1.jar' -> '/deployments/lib/main/io.agroal.agroal-narayana-3.2.1.jar'
2026-09-02T18:59:19.7160975Z '/tmp/src/lib/main/io.agroal.agroal-pool-3.2.1.jar' -> '/deployments/lib/main/io.agroal.agroal-pool-3.2.1.jar'
2026-09-02T18:59:19.7161273Z '/tmp/src/lib/main/io.micrometer.micrometer-commons-1.17.0.jar' -> '/deployments/lib/main/io.micrometer.micrometer-commons-1.17.0.jar'
2026-09-02T18:59:19.7161571Z '/tmp/src/lib/main/io.micrometer.micrometer-core-1.17.0.jar' -> '/deployments/lib/main/io.micrometer.micrometer-core-1.17.0.jar'
2026-09-02T18:59:19.7161883Z '/tmp/src/lib/main/io.micrometer.micrometer-observation-1.17.0.jar' -> '/deployments/lib/main/io.micrometer.micrometer-observation-1.17.0.jar'
2026-09-02T18:59:19.7162184Z '/tmp/src/lib/main/io.netty.netty-buffer-4.1.136.Final.jar' -> '/deployments/lib/main/io.netty.netty-buffer-4.1.136.Final.jar'
2026-09-02T18:59:19.7162476Z '/tmp/src/lib/main/io.netty.netty-codec-4.1.136.Final.jar' -> '/deployments/lib/main/io.netty.netty-codec-4.1.136.Final.jar'
2026-09-02T18:59:19.7162781Z '/tmp/src/lib/main/io.netty.netty-codec-dns-4.1.136.Final.jar' -> '/deployments/lib/main/io.netty.netty-codec-dns-4.1.136.Final.jar'
2026-09-02T18:59:19.7163090Z '/tmp/src/lib/main/io.netty.netty-codec-haproxy-4.1.136.Final.jar' -> '/deployments/lib/main/io.netty.netty-codec-haproxy-4.1.136.Final.jar'
2026-09-02T18:59:19.7163456Z '/tmp/src/lib/main/io.netty.netty-codec-http-4.1.136.Final.jar' -> '/deployments/lib/main/io.netty.netty-codec-http-4.1.136.Final.jar'
2026-09-02T18:59:19.7163779Z '/tmp/src/lib/main/io.netty.netty-codec-http2-4.1.136.Final.jar' -> '/deployments/lib/main/io.netty.netty-codec-http2-4.1.136.Final.jar'
2026-09-02T18:59:19.7164087Z '/tmp/src/lib/main/io.netty.netty-codec-socks-4.1.136.Final.jar' -> '/deployments/lib/main/io.netty.netty-codec-socks-4.1.136.Final.jar'
2026-09-02T18:59:19.7164378Z '/tmp/src/lib/main/io.netty.netty-common-4.1.136.Final.jar' -> '/deployments/lib/main/io.netty.netty-common-4.1.136.Final.jar'
2026-09-02T18:59:19.7164678Z '/tmp/src/lib/main/io.netty.netty-handler-4.1.136.Final.jar' -> '/deployments/lib/main/io.netty.netty-handler-4.1.136.Final.jar'
2026-09-02T18:59:19.7164979Z '/tmp/src/lib/main/io.netty.netty-handler-proxy-4.1.136.Final.jar' -> '/deployments/lib/main/io.netty.netty-handler-proxy-4.1.136.Final.jar'
2026-09-02T18:59:19.7165349Z '/tmp/src/lib/main/io.netty.netty-resolver-4.1.136.Final.jar' -> '/deployments/lib/main/io.netty.netty-resolver-4.1.136.Final.jar'
2026-09-02T18:59:19.7165661Z '/tmp/src/lib/main/io.netty.netty-resolver-dns-4.1.136.Final.jar' -> '/deployments/lib/main/io.netty.netty-resolver-dns-4.1.136.Final.jar'
2026-09-02T18:59:19.7165969Z '/tmp/src/lib/main/io.netty.netty-tcnative-classes-2.0.78.Final.jar' -> '/deployments/lib/main/io.netty.netty-tcnative-classes-2.0.78.Final.jar'
2026-09-02T18:59:19.7166269Z '/tmp/src/lib/main/io.netty.netty-transport-4.1.136.Final.jar' -> '/deployments/lib/main/io.netty.netty-transport-4.1.136.Final.jar'
2026-09-02T18:59:19.7166612Z '/tmp/src/lib/main/io.netty.netty-transport-native-unix-common-4.1.136.Final.jar' -> '/deployments/lib/main/io.netty.netty-transport-native-unix-common-4.1.136.Final.jar'
2026-09-02T18:59:19.7167120Z '/tmp/src/lib/main/io.opentelemetry.instrumentation.opentelemetry-instrumentation-api-2.28.1.jar' -> '/deployments/lib/main/io.opentelemetry.instrumentation.opentelemetry-instrumentation-api-2.28.1.jar'
2026-09-02T18:59:19.7167474Z '/tmp/src/lib/main/io.opentelemetry.opentelemetry-api-1.62.0.jar' -> '/deployments/lib/main/io.opentelemetry.opentelemetry-api-1.62.0.jar'
2026-09-02T18:59:19.7167816Z '/tmp/src/lib/main/io.opentelemetry.opentelemetry-api-incubator-1.62.0-alpha.jar' -> '/deployments/lib/main/io.opentelemetry.opentelemetry-api-incubator-1.62.0-alpha.jar'
2026-09-02T18:59:19.7168138Z '/tmp/src/lib/main/io.opentelemetry.opentelemetry-common-1.62.0.jar' -> '/deployments/lib/main/io.opentelemetry.opentelemetry-common-1.62.0.jar'
2026-09-02T18:59:19.7168453Z '/tmp/src/lib/main/io.opentelemetry.opentelemetry-context-1.62.0.jar' -> '/deployments/lib/main/io.opentelemetry.opentelemetry-context-1.62.0.jar'
2026-09-02T18:59:19.7168791Z '/tmp/src/lib/main/io.opentelemetry.semconv.opentelemetry-semconv-1.41.1.jar' -> '/deployments/lib/main/io.opentelemetry.semconv.opentelemetry-semconv-1.41.1.jar'
2026-09-02T18:59:19.7169079Z '/tmp/src/lib/main/io.quarkus.arc.arc-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.arc.arc-3.38.1.jar'
2026-09-02T18:59:19.7204295Z '/tmp/src/lib/main/io.quarkus.http.quarkus-http-core-5.5.0.jar' -> '/deployments/lib/main/io.quarkus.http.quarkus-http-core-5.5.0.jar'
2026-09-02T18:59:19.7204931Z '/tmp/src/lib/main/io.quarkus.http.quarkus-http-http-core-5.5.0.jar' -> '/deployments/lib/main/io.quarkus.http.quarkus-http-http-core-5.5.0.jar'
2026-09-02T18:59:19.7205469Z '/tmp/src/lib/main/io.quarkus.http.quarkus-http-servlet-5.5.0.jar' -> '/deployments/lib/main/io.quarkus.http.quarkus-http-servlet-5.5.0.jar'
2026-09-02T18:59:19.7206262Z '/tmp/src/lib/main/io.quarkus.http.quarkus-http-vertx-backend-5.5.0.jar' -> '/deployments/lib/main/io.quarkus.http.quarkus-http-vertx-backend-5.5.0.jar'
2026-09-02T18:59:19.7206779Z '/tmp/src/lib/main/io.quarkus.quarkus-agroal-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-agroal-3.38.1.jar'
2026-09-02T18:59:19.7207284Z '/tmp/src/lib/main/io.quarkus.quarkus-apache-httpclient-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-apache-httpclient-3.38.1.jar'
2026-09-02T18:59:19.7207751Z '/tmp/src/lib/main/io.quarkus.quarkus-arc-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-arc-3.38.1.jar'
2026-09-02T18:59:19.7208196Z '/tmp/src/lib/main/io.quarkus.quarkus-cache-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-cache-3.38.1.jar'
2026-09-02T18:59:19.7208642Z '/tmp/src/lib/main/io.quarkus.quarkus-caffeine-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-caffeine-3.38.1.jar'
2026-09-02T18:59:19.7209133Z '/tmp/src/lib/main/io.quarkus.quarkus-container-image-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-container-image-3.38.1.jar'
2026-09-02T18:59:19.7209646Z '/tmp/src/lib/main/io.quarkus.quarkus-container-image-docker-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-container-image-docker-3.38.1.jar'
2026-09-02T18:59:19.7210198Z '/tmp/src/lib/main/io.quarkus.quarkus-container-image-docker-common-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-container-image-docker-common-3.38.1.jar'
2026-09-02T18:59:19.7210925Z '/tmp/src/lib/main/io.quarkus.quarkus-core-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-core-3.38.1.jar'
2026-09-02T18:59:19.7211379Z '/tmp/src/lib/main/io.quarkus.quarkus-credentials-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-credentials-3.38.1.jar'
2026-09-02T18:59:19.7211840Z '/tmp/src/lib/main/io.quarkus.quarkus-datasource-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-datasource-3.38.1.jar'
2026-09-02T18:59:19.7212328Z '/tmp/src/lib/main/io.quarkus.quarkus-datasource-common-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-datasource-common-3.38.1.jar'
2026-09-02T18:59:19.7212794Z '/tmp/src/lib/main/io.quarkus.quarkus-devservices-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-devservices-3.38.1.jar'
2026-09-02T18:59:19.7213499Z '/tmp/src/lib/main/io.quarkus.quarkus-elytron-security-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-elytron-security-3.38.1.jar'
2026-09-02T18:59:19.7214038Z '/tmp/src/lib/main/io.quarkus.quarkus-elytron-security-common-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-elytron-security-common-3.38.1.jar'
2026-09-02T18:59:19.7215729Z '/tmp/src/lib/main/io.quarkus.quarkus-elytron-security-properties-file-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-elytron-security-properties-file-3.38.1.jar'
2026-09-02T18:59:19.7216284Z '/tmp/src/lib/main/io.quarkus.quarkus-fs-util-1.4.2.jar' -> '/deployments/lib/main/io.quarkus.quarkus-fs-util-1.4.2.jar'
2026-09-02T18:59:19.7216735Z '/tmp/src/lib/main/io.quarkus.quarkus-hibernate-orm-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-hibernate-orm-3.38.1.jar'
2026-09-02T18:59:19.7217209Z '/tmp/src/lib/main/io.quarkus.quarkus-hibernate-orm-panache-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-hibernate-orm-panache-3.38.1.jar'
2026-09-02T18:59:19.7217739Z '/tmp/src/lib/main/io.quarkus.quarkus-hibernate-orm-panache-common-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-hibernate-orm-panache-common-3.38.1.jar'
2026-09-02T18:59:19.7218201Z '/tmp/src/lib/main/io.quarkus.quarkus-jackson-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-jackson-3.38.1.jar'
2026-09-02T18:59:19.7218641Z '/tmp/src/lib/main/io.quarkus.quarkus-jaxb-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-jaxb-3.38.1.jar'
2026-09-02T18:59:19.7219085Z '/tmp/src/lib/main/io.quarkus.quarkus-jaxp-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-jaxp-3.38.1.jar'
2026-09-02T18:59:19.7219538Z '/tmp/src/lib/main/io.quarkus.quarkus-jdbc-oracle-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-jdbc-oracle-3.38.1.jar'
2026-09-02T18:59:19.7219952Z '/tmp/src/lib/main/io.quarkus.quarkus-jsonp-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-jsonp-3.38.1.jar'
2026-09-02T18:59:19.7220442Z '/tmp/src/lib/main/io.quarkus.quarkus-keycloak-authorization-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-keycloak-authorization-3.38.1.jar'
2026-09-02T18:59:19.7239412Z '/tmp/src/lib/main/io.quarkus.quarkus-mailer-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-mailer-3.38.1.jar'
2026-09-02T18:59:19.7239961Z '/tmp/src/lib/main/io.quarkus.quarkus-micrometer-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-micrometer-3.38.1.jar'
2026-09-02T18:59:19.7240432Z '/tmp/src/lib/main/io.quarkus.quarkus-mutiny-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-mutiny-3.38.1.jar'
2026-09-02T18:59:19.7240920Z '/tmp/src/lib/main/io.quarkus.quarkus-narayana-jta-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-narayana-jta-3.38.1.jar'
2026-09-02T18:59:19.7241380Z '/tmp/src/lib/main/io.quarkus.quarkus-netty-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-netty-3.38.1.jar'
2026-09-02T18:59:19.7241844Z '/tmp/src/lib/main/io.quarkus.quarkus-oidc-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-oidc-3.38.1.jar'
2026-09-02T18:59:19.7242311Z '/tmp/src/lib/main/io.quarkus.quarkus-oidc-client-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-oidc-client-3.38.1.jar'
2026-09-02T18:59:19.7243008Z '/tmp/src/lib/main/io.quarkus.quarkus-oidc-client-spi-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-oidc-client-spi-3.38.1.jar'
2026-09-02T18:59:19.7243598Z '/tmp/src/lib/main/io.quarkus.quarkus-oidc-common-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-oidc-common-3.38.1.jar'
2026-09-02T18:59:19.7244244Z '/tmp/src/lib/main/io.quarkus.quarkus-panache-common-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-panache-common-3.38.1.jar'
2026-09-02T18:59:19.7244767Z '/tmp/src/lib/main/io.quarkus.quarkus-panache-hibernate-common-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-panache-hibernate-common-3.38.1.jar'
2026-09-02T18:59:19.7245266Z '/tmp/src/lib/main/io.quarkus.quarkus-proxy-registry-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-proxy-registry-3.38.1.jar'
2026-09-02T18:59:19.7245844Z '/tmp/src/lib/main/io.quarkus.quarkus-qute-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-qute-3.38.1.jar'
2026-09-02T18:59:19.7246324Z '/tmp/src/lib/main/io.quarkus.quarkus-rest-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-rest-3.38.1.jar'
2026-09-02T18:59:19.7246773Z '/tmp/src/lib/main/io.quarkus.quarkus-rest-client-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-rest-client-3.38.1.jar'
2026-09-02T18:59:19.7247267Z '/tmp/src/lib/main/io.quarkus.quarkus-rest-client-config-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-rest-client-config-3.38.1.jar'
2026-09-02T18:59:19.7247893Z '/tmp/src/lib/main/io.quarkus.quarkus-rest-client-jackson-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-rest-client-jackson-3.38.1.jar'
2026-09-02T18:59:19.7248398Z '/tmp/src/lib/main/io.quarkus.quarkus-rest-client-jaxrs-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-rest-client-jaxrs-3.38.1.jar'
2026-09-02T18:59:19.7248895Z '/tmp/src/lib/main/io.quarkus.quarkus-rest-common-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-rest-common-3.38.1.jar'
2026-09-02T18:59:19.7249381Z '/tmp/src/lib/main/io.quarkus.quarkus-rest-jackson-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-rest-jackson-3.38.1.jar'
2026-09-02T18:59:19.7249880Z '/tmp/src/lib/main/io.quarkus.quarkus-rest-jackson-common-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-rest-jackson-common-3.38.1.jar'
2026-09-02T18:59:19.7250357Z '/tmp/src/lib/main/io.quarkus.quarkus-scheduler-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-scheduler-3.38.1.jar'
2026-09-02T18:59:19.7250839Z '/tmp/src/lib/main/io.quarkus.quarkus-scheduler-api-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-scheduler-api-3.38.1.jar'
2026-09-02T18:59:19.7251339Z '/tmp/src/lib/main/io.quarkus.quarkus-scheduler-common-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-scheduler-common-3.38.1.jar'
2026-09-02T18:59:19.7251842Z '/tmp/src/lib/main/io.quarkus.quarkus-scheduler-kotlin-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-scheduler-kotlin-3.38.1.jar'
2026-09-02T18:59:19.7252332Z '/tmp/src/lib/main/io.quarkus.quarkus-scheduler-spi-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-scheduler-spi-3.38.1.jar'
2026-09-02T18:59:19.7252802Z '/tmp/src/lib/main/io.quarkus.quarkus-security-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-security-3.38.1.jar'
2026-09-02T18:59:19.7253281Z '/tmp/src/lib/main/io.quarkus.quarkus-security-jpa-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-security-jpa-3.38.1.jar'
2026-09-02T18:59:19.7253881Z '/tmp/src/lib/main/io.quarkus.quarkus-security-jpa-common-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-security-jpa-common-3.38.1.jar'
2026-09-02T18:59:19.7254389Z '/tmp/src/lib/main/io.quarkus.quarkus-security-runtime-spi-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-security-runtime-spi-3.38.1.jar'
2026-09-02T18:59:19.7254871Z '/tmp/src/lib/main/io.quarkus.quarkus-smallrye-context-propagation-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-smallrye-context-propagation-3.38.1.jar'
2026-09-02T18:59:19.7260413Z '/tmp/src/lib/main/io.quarkus.quarkus-smallrye-fault-tolerance-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-smallrye-fault-tolerance-3.38.1.jar'
2026-09-02T18:59:19.7260950Z '/tmp/src/lib/main/io.quarkus.quarkus-smallrye-health-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-smallrye-health-3.38.1.jar'
2026-09-02T18:59:19.7261425Z '/tmp/src/lib/main/io.quarkus.quarkus-smallrye-jwt-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-smallrye-jwt-3.38.1.jar'
2026-09-02T18:59:19.7261923Z '/tmp/src/lib/main/io.quarkus.quarkus-smallrye-jwt-build-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-smallrye-jwt-build-3.38.1.jar'
2026-09-02T18:59:19.7262406Z '/tmp/src/lib/main/io.quarkus.quarkus-smallrye-openapi-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-smallrye-openapi-3.38.1.jar'
2026-09-02T18:59:19.7263027Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-aop-api-6.2.SP3.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-aop-api-6.2.SP3.jar'
2026-09-02T18:59:19.7263600Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-beans-api-6.2.SP3.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-beans-api-6.2.SP3.jar'
2026-09-02T18:59:19.7264102Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-boot-orm-api-3.4.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-boot-orm-api-3.4.jar'
2026-09-02T18:59:19.7264583Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-cache-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-cache-3.38.1.jar'
2026-09-02T18:59:19.7265084Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-context-api-6.2.SP3.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-context-api-6.2.SP3.jar'
2026-09-02T18:59:19.7265580Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-core-api-6.2.SP3.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-core-api-6.2.SP3.jar'
2026-09-02T18:59:19.7266084Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-data-commons-api-3.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-data-commons-api-3.5.jar'
2026-09-02T18:59:19.7266586Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-data-jpa-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-data-jpa-3.38.1.jar'
2026-09-02T18:59:19.7267077Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-data-jpa-api-3.5.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-data-jpa-api-3.5.jar'
2026-09-02T18:59:19.7267551Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-di-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-di-3.38.1.jar'
2026-09-02T18:59:19.7268042Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-security-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-security-3.38.1.jar'
2026-09-02T18:59:19.7268555Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-security-core-api-6.4.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-security-core-api-6.4.jar'
2026-09-02T18:59:19.7269048Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-web-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-web-3.38.1.jar'
2026-09-02T18:59:19.7269553Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-web-api-6.2.SP3.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-web-api-6.2.SP3.jar'
2026-09-02T18:59:19.7270053Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-web-common-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-web-common-3.38.1.jar'
2026-09-02T18:59:19.7270546Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-web-rest-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-web-rest-3.38.1.jar'
2026-09-02T18:59:19.7271041Z '/tmp/src/lib/main/io.quarkus.quarkus-spring-webmvc-api-6.2.SP3.jar' -> '/deployments/lib/main/io.quarkus.quarkus-spring-webmvc-api-6.2.SP3.jar'
2026-09-02T18:59:19.7271517Z '/tmp/src/lib/main/io.quarkus.quarkus-swagger-ui-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-swagger-ui-3.38.1.jar'
2026-09-02T18:59:19.7271994Z '/tmp/src/lib/main/io.quarkus.quarkus-tls-registry-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-tls-registry-3.38.1.jar'
2026-09-02T18:59:19.7272586Z '/tmp/src/lib/main/io.quarkus.quarkus-tls-registry-spi-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-tls-registry-spi-3.38.1.jar'
2026-09-02T18:59:19.7273101Z '/tmp/src/lib/main/io.quarkus.quarkus-transaction-annotations-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-transaction-annotations-3.38.1.jar'
2026-09-02T18:59:19.7273652Z '/tmp/src/lib/main/io.quarkus.quarkus-undertow-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-undertow-3.38.1.jar'
2026-09-02T18:59:19.7274070Z '/tmp/src/lib/main/io.quarkus.quarkus-vertx-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-vertx-3.38.1.jar'
2026-09-02T18:59:19.7274507Z '/tmp/src/lib/main/io.quarkus.quarkus-vertx-http-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-vertx-http-3.38.1.jar'
2026-09-02T18:59:19.7300183Z '/tmp/src/lib/main/io.quarkus.quarkus-virtual-threads-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-virtual-threads-3.38.1.jar'
2026-09-02T18:59:19.7301154Z '/tmp/src/lib/main/io.quarkus.quarkus-websockets-next-spi-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.quarkus-websockets-next-spi-3.38.1.jar'
2026-09-02T18:59:19.7301818Z '/tmp/src/lib/main/io.quarkus.qute.qute-core-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.qute.qute-core-3.38.1.jar'
2026-09-02T18:59:19.7302440Z '/tmp/src/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-3.38.1.jar'
2026-09-02T18:59:19.7302885Z '/tmp/src/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-client-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-client-3.38.1.jar'
2026-09-02T18:59:19.7303332Z '/tmp/src/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-common-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-common-3.38.1.jar'
2026-09-02T18:59:19.7303919Z '/tmp/src/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-common-types-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-common-types-3.38.1.jar'
2026-09-02T18:59:19.7304426Z '/tmp/src/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-jackson-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-jackson-3.38.1.jar'
2026-09-02T18:59:19.7304892Z '/tmp/src/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-vertx-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.resteasy.reactive.resteasy-reactive-vertx-3.38.1.jar'
2026-09-02T18:59:19.7305315Z '/tmp/src/lib/main/io.quarkus.security.quarkus-security-2.3.2.jar' -> '/deployments/lib/main/io.quarkus.security.quarkus-security-2.3.2.jar'
2026-09-02T18:59:19.7305794Z '/tmp/src/lib/main/io.quarkus.vertx.utils.quarkus-vertx-utils-3.38.1.jar' -> '/deployments/lib/main/io.quarkus.vertx.utils.quarkus-vertx-utils-3.38.1.jar'
2026-09-02T18:59:19.7306254Z '/tmp/src/lib/main/io.smallrye.certs.smallrye-private-key-pem-parser-0.9.3.jar' -> '/deployments/lib/main/io.smallrye.certs.smallrye-private-key-pem-parser-0.9.3.jar'
2026-09-02T18:59:19.7306729Z '/tmp/src/lib/main/io.smallrye.common.smallrye-common-annotation-2.19.0.jar' -> '/deployments/lib/main/io.smallrye.common.smallrye-common-annotation-2.19.0.jar'
2026-09-02T18:59:19.7307265Z '/tmp/src/lib/main/io.smallrye.common.smallrye-common-classloader-2.19.0.jar' -> '/deployments/lib/main/io.smallrye.common.smallrye-common-classloader-2.19.0.jar'
2026-09-02T18:59:19.7416753Z '/tmp/src/lib/main/io.smallrye.common.smallrye-common-search-2.19.0.jar' -> '/deployments/lib/main/io.smallrye.common.smallrye-common-search-2.19.0.jar'
2026-09-02T18:59:19.7417170Z '/tmp/src/lib/main/io.smallrye.common.smallrye-common-vertx-context-2.19.0.jar' -> '/deployments/lib/main/io.smallrye.common.smallrye-common-vertx-context-2.19.0.jar'
2026-09-02T18:59:19.7417497Z '/tmp/src/lib/main/io.smallrye.config.smallrye-config-3.17.2.jar' -> '/deployments/lib/main/io.smallrye.config.smallrye-config-3.17.2.jar'
2026-09-02T18:59:19.7417879Z '/tmp/src/lib/main/io.smallrye.config.smallrye-config-common-3.17.2.jar' -> '/deployments/lib/main/io.smallrye.config.smallrye-config-common-3.17.2.jar'
2026-09-02T18:59:19.7418679Z '/tmp/src/lib/main/io.smallrye.config.smallrye-config-core-3.17.2.jar' -> '/deployments/lib/main/io.smallrye.config.smallrye-config-core-3.17.2.jar'
2026-09-02T18:59:19.7419144Z '/tmp/src/lib/main/io.smallrye.config.smallrye-config-source-file-system-3.13.2.jar' -> '/deployments/lib/main/io.smallrye.config.smallrye-config-source-file-system-3.13.2.jar'
2026-09-02T18:59:19.7419556Z '/tmp/src/lib/main/io.smallrye.jandex-3.6.0.jar' -> '/deployments/lib/main/io.smallrye.jandex-3.6.0.jar'
2026-09-02T18:59:19.7419922Z '/tmp/src/lib/main/io.smallrye.reactive.mutiny-3.3.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.mutiny-3.3.0.jar'
2026-09-02T18:59:19.7420322Z '/tmp/src/lib/main/io.smallrye.reactive.mutiny-smallrye-context-propagation-3.3.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.mutiny-smallrye-context-propagation-3.3.0.jar'
2026-09-02T18:59:19.7420768Z '/tmp/src/lib/main/io.smallrye.reactive.mutiny-zero-flow-adapters-1.2.1.jar' -> '/deployments/lib/main/io.smallrye.reactive.mutiny-zero-flow-adapters-1.2.1.jar'
2026-09-02T18:59:19.7421128Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-auth-common-3.23.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-auth-common-3.23.0.jar'
2026-09-02T18:59:19.7421492Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-bridge-common-3.23.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-bridge-common-3.23.0.jar'
2026-09-02T18:59:19.7421908Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-core-3.23.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-core-3.23.0.jar'
2026-09-02T18:59:19.7422259Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-mail-client-3.23.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-mail-client-3.23.0.jar'
2026-09-02T18:59:19.7422612Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-runtime-3.23.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-runtime-3.23.0.jar'
2026-09-02T18:59:19.7422973Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-uri-template-3.23.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-uri-template-3.23.0.jar'
2026-09-02T18:59:19.7423322Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-3.23.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-3.23.0.jar'
2026-09-02T18:59:19.7423760Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-client-3.23.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-client-3.23.0.jar'
2026-09-02T18:59:19.7424115Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-common-3.23.0.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-mutiny-vertx-web-common-3.23.0.jar'
2026-09-02T18:59:19.7424469Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-reactive-converter-api-3.0.3.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-reactive-converter-api-3.0.3.jar'
2026-09-02T18:59:19.7424827Z '/tmp/src/lib/main/io.smallrye.reactive.smallrye-reactive-converter-mutiny-3.0.3.jar' -> '/deployments/lib/main/io.smallrye.reactive.smallrye-reactive-converter-mutiny-3.0.3.jar'
2026-09-02T18:59:19.7425151Z '/tmp/src/lib/main/io.smallrye.smallrye-context-propagation-2.3.0.jar' -> '/deployments/lib/main/io.smallrye.smallrye-context-propagation-2.3.0.jar'
2026-09-02T18:59:19.7425475Z '/tmp/src/lib/main/io.smallrye.smallrye-context-propagation-api-2.3.0.jar' -> '/deployments/lib/main/io.smallrye.smallrye-context-propagation-api-2.3.0.jar'
2026-09-02T18:59:19.7425801Z '/tmp/src/lib/main/io.smallrye.smallrye-context-propagation-jta-2.3.0.jar' -> '/deployments/lib/main/io.smallrye.smallrye-context-propagation-jta-2.3.0.jar'
2026-09-02T18:59:19.7426137Z '/tmp/src/lib/main/io.smallrye.smallrye-context-propagation-storage-2.3.0.jar' -> '/deployments/lib/main/io.smallrye.smallrye-context-propagation-storage-2.3.0.jar'
2026-09-02T18:59:19.7426521Z '/tmp/src/lib/main/io.smallrye.smallrye-fault-tolerance-6.11.2.jar' -> '/deployments/lib/main/io.smallrye.smallrye-fault-tolerance-6.11.2.jar'
2026-09-02T18:59:19.7426839Z '/tmp/src/lib/main/io.smallrye.smallrye-fault-tolerance-api-6.11.2.jar' -> '/deployments/lib/main/io.smallrye.smallrye-fault-tolerance-api-6.11.2.jar'
2026-09-02T18:59:19.7427163Z '/tmp/src/lib/main/io.smallrye.smallrye-fault-tolerance-apiimpl-6.11.2.jar' -> '/deployments/lib/main/io.smallrye.smallrye-fault-tolerance-apiimpl-6.11.2.jar'
2026-09-02T18:59:19.7427503Z '/tmp/src/lib/main/io.smallrye.smallrye-fault-tolerance-autoconfig-core-6.11.2.jar' -> '/deployments/lib/main/io.smallrye.smallrye-fault-tolerance-autoconfig-core-6.11.2.jar'
2026-09-02T18:59:19.7427858Z '/tmp/src/lib/main/io.smallrye.smallrye-fault-tolerance-context-propagation-6.11.2.jar' -> '/deployments/lib/main/io.smallrye.smallrye-fault-tolerance-context-propagation-6.11.2.jar'
2026-09-02T18:59:19.7428264Z '/tmp/src/lib/main/io.smallrye.smallrye-fault-tolerance-core-6.11.2.jar' -> '/deployments/lib/main/io.smallrye.smallrye-fault-tolerance-core-6.11.2.jar'
2026-09-02T18:59:19.7428593Z '/tmp/src/lib/main/io.smallrye.smallrye-fault-tolerance-mutiny-6.11.2.jar' -> '/deployments/lib/main/io.smallrye.smallrye-fault-tolerance-mutiny-6.11.2.jar'
2026-09-02T18:59:19.7428923Z '/tmp/src/lib/main/io.smallrye.smallrye-fault-tolerance-vertx-6.11.2.jar' -> '/deployments/lib/main/io.smallrye.smallrye-fault-tolerance-vertx-6.11.2.jar'
2026-09-02T18:59:19.7429219Z '/tmp/src/lib/main/io.smallrye.smallrye-health-4.3.0.jar' -> '/deployments/lib/main/io.smallrye.smallrye-health-4.3.0.jar'
2026-09-02T18:59:19.7429510Z '/tmp/src/lib/main/io.smallrye.smallrye-health-api-4.3.0.jar' -> '/deployments/lib/main/io.smallrye.smallrye-health-api-4.3.0.jar'
2026-09-02T18:59:19.7429830Z '/tmp/src/lib/main/io.smallrye.smallrye-health-provided-checks-4.3.0.jar' -> '/deployments/lib/main/io.smallrye.smallrye-health-provided-checks-4.3.0.jar'
2026-09-02T18:59:19.7430116Z '/tmp/src/lib/main/io.smallrye.smallrye-jwt-4.6.3.jar' -> '/deployments/lib/main/io.smallrye.smallrye-jwt-4.6.3.jar'
2026-09-02T18:59:19.7430400Z '/tmp/src/lib/main/io.smallrye.smallrye-jwt-build-4.6.3.jar' -> '/deployments/lib/main/io.smallrye.smallrye-jwt-build-4.6.3.jar'
2026-09-02T18:59:19.7430689Z '/tmp/src/lib/main/io.smallrye.smallrye-jwt-common-4.6.3.jar' -> '/deployments/lib/main/io.smallrye.smallrye-jwt-common-4.6.3.jar'
2026-09-02T18:59:19.7430983Z '/tmp/src/lib/main/io.smallrye.smallrye-open-api-core-4.3.5.jar' -> '/deployments/lib/main/io.smallrye.smallrye-open-api-core-4.3.5.jar'
2026-09-02T18:59:19.7431279Z '/tmp/src/lib/main/io.smallrye.smallrye-open-api-model-4.3.5.jar' -> '/deployments/lib/main/io.smallrye.smallrye-open-api-model-4.3.5.jar'
2026-09-02T18:59:19.7431566Z '/tmp/src/lib/main/io.smallrye.stork.stork-api-2.7.10.jar' -> '/deployments/lib/main/io.smallrye.stork.stork-api-2.7.10.jar'
2026-09-02T18:59:19.7431843Z '/tmp/src/lib/main/io.vertx.vertx-auth-common-4.5.30.jar' -> '/deployments/lib/main/io.vertx.vertx-auth-common-4.5.30.jar'
2026-09-02T18:59:19.7432131Z '/tmp/src/lib/main/io.vertx.vertx-bridge-common-4.5.30.jar' -> '/deployments/lib/main/io.vertx.vertx-bridge-common-4.5.30.jar'
2026-09-02T18:59:19.7432400Z '/tmp/src/lib/main/io.vertx.vertx-codegen-4.5.30.jar' -> '/deployments/lib/main/io.vertx.vertx-codegen-4.5.30.jar'
2026-09-02T18:59:19.7432662Z '/tmp/src/lib/main/io.vertx.vertx-core-4.5.30.jar' -> '/deployments/lib/main/io.vertx.vertx-core-4.5.30.jar'
2026-09-02T18:59:19.7432937Z '/tmp/src/lib/main/io.vertx.vertx-mail-client-4.5.30.jar' -> '/deployments/lib/main/io.vertx.vertx-mail-client-4.5.30.jar'
2026-09-02T18:59:19.7433219Z '/tmp/src/lib/main/io.vertx.vertx-uri-template-4.5.30.jar' -> '/deployments/lib/main/io.vertx.vertx-uri-template-4.5.30.jar'
2026-09-02T18:59:19.7433532Z '/tmp/src/lib/main/io.vertx.vertx-web-4.5.30.jar' -> '/deployments/lib/main/io.vertx.vertx-web-4.5.30.jar'
2026-09-02T18:59:19.7433814Z '/tmp/src/lib/main/io.vertx.vertx-web-client-4.5.30.jar' -> '/deployments/lib/main/io.vertx.vertx-web-client-4.5.30.jar'
2026-09-02T18:59:19.7434160Z '/tmp/src/lib/main/io.vertx.vertx-web-common-4.5.30.jar' -> '/deployments/lib/main/io.vertx.vertx-web-common-4.5.30.jar'
2026-09-02T18:59:19.7434464Z '/tmp/src/lib/main/jakarta.activation.jakarta.activation-api-2.0.0.jar' -> '/deployments/lib/main/jakarta.activation.jakarta.activation-api-2.0.0.jar'
2026-09-02T18:59:19.7434782Z '/tmp/src/lib/main/jakarta.annotation.jakarta.annotation-api-3.0.0.jar' -> '/deployments/lib/main/jakarta.annotation.jakarta.annotation-api-3.0.0.jar'
2026-09-02T18:59:19.7435119Z '/tmp/src/lib/main/jakarta.authentication.jakarta.authentication-api-3.1.0.jar' -> '/deployments/lib/main/jakarta.authentication.jakarta.authentication-api-3.1.0.jar'
2026-09-02T18:59:19.7435457Z '/tmp/src/lib/main/jakarta.authorization.jakarta.authorization-api-3.0.0.jar' -> '/deployments/lib/main/jakarta.authorization.jakarta.authorization-api-3.0.0.jar'
2026-09-02T18:59:19.7435815Z '/tmp/src/lib/main/jakarta.el.jakarta.el-api-6.0.1.jar' -> '/deployments/lib/main/jakarta.el.jakarta.el-api-6.0.1.jar'
2026-09-02T18:59:19.7436135Z '/tmp/src/lib/main/jakarta.enterprise.jakarta.enterprise.cdi-api-4.1.0.jar' -> '/deployments/lib/main/jakarta.enterprise.jakarta.enterprise.cdi-api-4.1.0.jar'
2026-09-02T18:59:19.7436479Z '/tmp/src/lib/main/jakarta.enterprise.jakarta.enterprise.lang-model-4.1.0.jar' -> '/deployments/lib/main/jakarta.enterprise.jakarta.enterprise.lang-model-4.1.0.jar'
2026-09-02T18:59:19.7436793Z '/tmp/src/lib/main/jakarta.inject.jakarta.inject-api-2.0.1.jar' -> '/deployments/lib/main/jakarta.inject.jakarta.inject-api-2.0.1.jar'
2026-09-02T18:59:19.7437111Z '/tmp/src/lib/main/jakarta.interceptor.jakarta.interceptor-api-2.2.0.jar' -> '/deployments/lib/main/jakarta.interceptor.jakarta.interceptor-api-2.2.0.jar'
2026-09-02T18:59:19.7437411Z '/tmp/src/lib/main/jakarta.json.jakarta.json-api-2.1.3.jar' -> '/deployments/lib/main/jakarta.json.jakarta.json-api-2.1.3.jar'
2026-09-02T18:59:19.7437731Z '/tmp/src/lib/main/jakarta.persistence.jakarta.persistence-api-3.2.0.jar' -> '/deployments/lib/main/jakarta.persistence.jakarta.persistence-api-3.2.0.jar'
2026-09-02T18:59:19.7438040Z '/tmp/src/lib/main/jakarta.resource.jakarta.resource-api-2.1.0.jar' -> '/deployments/lib/main/jakarta.resource.jakarta.resource-api-2.1.0.jar'
2026-09-02T18:59:19.7438344Z '/tmp/src/lib/main/jakarta.servlet.jakarta.servlet-api-6.0.0.jar' -> '/deployments/lib/main/jakarta.servlet.jakarta.servlet-api-6.0.0.jar'
2026-09-02T18:59:19.7438662Z '/tmp/src/lib/main/jakarta.transaction.jakarta.transaction-api-2.0.1.jar' -> '/deployments/lib/main/jakarta.transaction.jakarta.transaction-api-2.0.1.jar'
2026-09-02T18:59:19.7438969Z '/tmp/src/lib/main/jakarta.ws.rs.jakarta.ws.rs-api-3.1.0.jar' -> '/deployments/lib/main/jakarta.ws.rs.jakarta.ws.rs-api-3.1.0.jar'
2026-09-02T18:59:19.7439277Z '/tmp/src/lib/main/jakarta.xml.bind.jakarta.xml.bind-api-3.0.1.jar' -> '/deployments/lib/main/jakarta.xml.bind.jakarta.xml.bind-api-3.0.1.jar'
2026-09-02T18:59:19.7439555Z '/tmp/src/lib/main/javax.cache.cache-api-1.1.1.jar' -> '/deployments/lib/main/javax.cache.cache-api-1.1.1.jar'
2026-09-02T18:59:19.7634196Z '/tmp/src/lib/main/net.arnx.wmf2svg-0.10.6.jar' -> '/deployments/lib/main/net.arnx.wmf2svg-0.10.6.jar'
2026-09-02T18:59:19.7634516Z '/tmp/src/lib/main/net.engio.mbassador-1.3.2.jar' -> '/deployments/lib/main/net.engio.mbassador-1.3.2.jar'
2026-09-02T18:59:19.7634786Z '/tmp/src/lib/main/org.antlr.antlr-runtime-3.5.3.jar' -> '/deployments/lib/main/org.antlr.antlr-runtime-3.5.3.jar'
2026-09-02T18:59:19.7635064Z '/tmp/src/lib/main/org.antlr.antlr4-runtime-4.13.2.jar' -> '/deployments/lib/main/org.antlr.antlr4-runtime-4.13.2.jar'
2026-09-02T18:59:19.7635341Z '/tmp/src/lib/main/org.antlr.stringtemplate-3.2.1.jar' -> '/deployments/lib/main/org.antlr.stringtemplate-3.2.1.jar'
2026-09-02T18:59:19.7635652Z '/tmp/src/lib/main/org.apache.commons.commons-collections4-4.5.0.jar' -> '/deployments/lib/main/org.apache.commons.commons-collections4-4.5.0.jar'
2026-09-02T18:59:19.7636165Z '/tmp/src/lib/main/org.apache.commons.commons-compress-1.28.0.jar' -> '/deployments/lib/main/org.apache.commons.commons-compress-1.28.0.jar'
2026-09-02T18:59:19.7636465Z '/tmp/src/lib/main/org.apache.commons.commons-csv-1.10.0.jar' -> '/deployments/lib/main/org.apache.commons.commons-csv-1.10.0.jar'
2026-09-02T18:59:19.7636761Z '/tmp/src/lib/main/org.apache.commons.commons-lang3-3.20.0.jar' -> '/deployments/lib/main/org.apache.commons.commons-lang3-3.20.0.jar'
2026-09-02T18:59:19.7637053Z '/tmp/src/lib/main/org.apache.commons.commons-math3-3.6.1.jar' -> '/deployments/lib/main/org.apache.commons.commons-math3-3.6.1.jar'
2026-09-02T18:59:19.7637360Z '/tmp/src/lib/main/org.apache.httpcomponents.httpclient-4.5.14.jar' -> '/deployments/lib/main/org.apache.httpcomponents.httpclient-4.5.14.jar'
2026-09-02T18:59:19.7637664Z '/tmp/src/lib/main/org.apache.httpcomponents.httpcore-4.4.16.jar' -> '/deployments/lib/main/org.apache.httpcomponents.httpcore-4.4.16.jar'
2026-09-02T18:59:19.7638055Z '/tmp/src/lib/main/org.apache.logging.log4j.log4j-api-2.26.0.jar' -> '/deployments/lib/main/org.apache.logging.log4j.log4j-api-2.26.0.jar'
2026-09-02T18:59:19.7638344Z '/tmp/src/lib/main/org.apache.pdfbox.fontbox-3.0.8.jar' -> '/deployments/lib/main/org.apache.pdfbox.fontbox-3.0.8.jar'
2026-09-02T18:59:19.7638621Z '/tmp/src/lib/main/org.apache.pdfbox.pdfbox-io-3.0.8.jar' -> '/deployments/lib/main/org.apache.pdfbox.pdfbox-io-3.0.8.jar'
2026-09-02T18:59:19.7638948Z '/tmp/src/lib/main/org.apache.poi.poi-5.5.1.jar' -> '/deployments/lib/main/org.apache.poi.poi-5.5.1.jar'
2026-09-02T18:59:19.7639326Z '/tmp/src/lib/main/org.apache.poi.poi-ooxml-5.5.1.jar' -> '/deployments/lib/main/org.apache.poi.poi-ooxml-5.5.1.jar'
2026-09-02T18:59:19.7639618Z '/tmp/src/lib/main/org.apache.poi.poi-ooxml-lite-5.5.1.jar' -> '/deployments/lib/main/org.apache.poi.poi-ooxml-lite-5.5.1.jar'
2026-09-02T18:59:19.7639911Z '/tmp/src/lib/main/org.apache.xmlbeans.xmlbeans-5.3.0.jar' -> '/deployments/lib/main/org.apache.xmlbeans.xmlbeans-5.3.0.jar'
2026-09-02T18:59:19.7640223Z '/tmp/src/lib/main/org.apache.xmlgraphics.xmlgraphics-commons-2.11.jar' -> '/deployments/lib/main/org.apache.xmlgraphics.xmlgraphics-commons-2.11.jar'
2026-09-02T18:59:19.7640523Z '/tmp/src/lib/main/org.bitbucket.b_c.jose4j-0.9.6.jar' -> '/deployments/lib/main/org.bitbucket.b_c.jose4j-0.9.6.jar'
2026-09-02T18:59:19.7640817Z '/tmp/src/lib/main/org.checkerframework.checker-qual-4.2.0.jar' -> '/deployments/lib/main/org.checkerframework.checker-qual-4.2.0.jar'
2026-09-02T18:59:19.7641135Z '/tmp/src/lib/main/org.docx4j.docx4j-JAXB-ReferenceImpl-11.4.11.jar' -> '/deployments/lib/main/org.docx4j.docx4j-JAXB-ReferenceImpl-11.4.11.jar'
2026-09-02T18:59:19.7641426Z '/tmp/src/lib/main/org.docx4j.docx4j-copy-17.0.2.jar' -> '/deployments/lib/main/org.docx4j.docx4j-copy-17.0.2.jar'
2026-09-02T18:59:19.7641702Z '/tmp/src/lib/main/org.docx4j.docx4j-core-17.0.2.jar' -> '/deployments/lib/main/org.docx4j.docx4j-core-17.0.2.jar'
2026-09-02T18:59:19.7642062Z '/tmp/src/lib/main/org.docx4j.docx4j-generated-objects-17.0.2.jar' -> '/deployments/lib/main/org.docx4j.docx4j-generated-objects-17.0.2.jar'
2026-09-02T18:59:19.7642396Z '/tmp/src/lib/main/org.docx4j.org.apache.xalan-interpretive-11.0.0.jar' -> '/deployments/lib/main/org.docx4j.org.apache.xalan-interpretive-11.0.0.jar'
2026-09-02T18:59:19.7642718Z '/tmp/src/lib/main/org.docx4j.org.apache.xalan-serializer-11.0.0.jar' -> '/deployments/lib/main/org.docx4j.org.apache.xalan-serializer-11.0.0.jar'
2026-09-02T18:59:19.7643022Z '/tmp/src/lib/main/org.eclipse.angus.angus-activation-2.0.3.jar' -> '/deployments/lib/main/org.eclipse.angus.angus-activation-2.0.3.jar'
2026-09-02T18:59:19.7643365Z '/tmp/src/lib/main/org.eclipse.microprofile.config.microprofile-config-api-3.1.1.jar' -> '/deployments/lib/main/org.eclipse.microprofile.config.microprofile-config-api-3.1.1.jar'
2026-09-02T18:59:19.7643862Z '/tmp/src/lib/main/org.eclipse.microprofile.context-propagation.microprofile-context-propagation-api-1.3.jar' -> '/deployments/lib/main/org.eclipse.microprofile.context-propagation.microprofile-context-propagation-api-1.3.jar'
2026-09-02T18:59:19.7788431Z '/tmp/src/lib/main/org.eclipse.microprofile.fault-tolerance.microprofile-fault-tolerance-api-4.1.2.jar' -> '/deployments/lib/main/org.eclipse.microprofile.fault-tolerance.microprofile-fault-tolerance-api-4.1.2.jar'
2026-09-02T18:59:19.7789113Z '/tmp/src/lib/main/org.eclipse.microprofile.health.microprofile-health-api-4.0.1.jar' -> '/deployments/lib/main/org.eclipse.microprofile.health.microprofile-health-api-4.0.1.jar'
2026-09-02T18:59:19.7789537Z '/tmp/src/lib/main/org.eclipse.microprofile.jwt.microprofile-jwt-auth-api-2.1.jar' -> '/deployments/lib/main/org.eclipse.microprofile.jwt.microprofile-jwt-auth-api-2.1.jar'
2026-09-02T18:59:19.7789913Z '/tmp/src/lib/main/org.eclipse.microprofile.openapi.microprofile-openapi-api-4.1.1.jar' -> '/deployments/lib/main/org.eclipse.microprofile.openapi.microprofile-openapi-api-4.1.1.jar'
2026-09-02T18:59:19.7790540Z '/tmp/src/lib/main/org.eclipse.microprofile.rest.client.microprofile-rest-client-api-4.0.jar' -> '/deployments/lib/main/org.eclipse.microprofile.rest.client.microprofile-rest-client-api-4.0.jar'
2026-09-02T18:59:19.7790868Z '/tmp/src/lib/main/org.eclipse.parsson.parsson-1.1.9.jar' -> '/deployments/lib/main/org.eclipse.parsson.parsson-1.1.9.jar'
2026-09-02T18:59:19.7791162Z '/tmp/src/lib/main/org.glassfish.expressly.expressly-6.0.0.jar' -> '/deployments/lib/main/org.glassfish.expressly.expressly-6.0.0.jar'
2026-09-02T18:59:19.7791456Z '/tmp/src/lib/main/org.glassfish.jaxb.jaxb-core-4.0.9.jar' -> '/deployments/lib/main/org.glassfish.jaxb.jaxb-core-4.0.9.jar'
2026-09-02T18:59:19.7791750Z '/tmp/src/lib/main/org.glassfish.jaxb.jaxb-runtime-3.0.1.jar' -> '/deployments/lib/main/org.glassfish.jaxb.jaxb-runtime-3.0.1.jar'
2026-09-02T18:59:19.7792035Z '/tmp/src/lib/main/org.glassfish.jaxb.txw2-4.0.9.jar' -> '/deployments/lib/main/org.glassfish.jaxb.txw2-4.0.9.jar'
2026-09-02T18:59:19.7792327Z '/tmp/src/lib/main/org.hdrhistogram.HdrHistogram-2.2.2.jar' -> '/deployments/lib/main/org.hdrhistogram.HdrHistogram-2.2.2.jar'
2026-09-02T18:59:19.7792637Z '/tmp/src/lib/main/org.hibernate.models.hibernate-models-1.1.1.jar' -> '/deployments/lib/main/org.hibernate.models.hibernate-models-1.1.1.jar'
2026-09-02T18:59:19.7792958Z '/tmp/src/lib/main/org.hibernate.orm.hibernate-core-7.4.5.Final.jar' -> '/deployments/lib/main/org.hibernate.orm.hibernate-core-7.4.5.Final.jar'
2026-09-02T18:59:19.7793274Z '/tmp/src/lib/main/org.hibernate.orm.hibernate-graalvm-7.4.5.Final.jar' -> '/deployments/lib/main/org.hibernate.orm.hibernate-graalvm-7.4.5.Final.jar'
2026-09-02T18:59:19.7793728Z '/tmp/src/lib/main/org.hibernate.orm.hibernate-jcache-7.4.5.Final.jar' -> '/deployments/lib/main/org.hibernate.orm.hibernate-jcache-7.4.5.Final.jar'
2026-09-02T18:59:19.7794547Z '/tmp/src/lib/main/org.jboss.jboss-transaction-spi-8.0.0.Final.jar' -> '/deployments/lib/main/org.jboss.jboss-transaction-spi-8.0.0.Final.jar'
2026-09-02T18:59:19.7794949Z '/tmp/src/lib/main/org.jboss.logging.commons-logging-jboss-logging-2.0.0.Final.jar' -> '/deployments/lib/main/org.jboss.logging.commons-logging-jboss-logging-2.0.0.Final.jar'
2026-09-02T18:59:19.7795291Z '/tmp/src/lib/main/org.jboss.narayana.jta.narayana-jta-7.3.4.Final.jar' -> '/deployments/lib/main/org.jboss.narayana.jta.narayana-jta-7.3.4.Final.jar'
2026-09-02T18:59:19.7795642Z '/tmp/src/lib/main/org.jboss.narayana.jts.narayana-jts-integration-7.3.4.Final.jar' -> '/deployments/lib/main/org.jboss.narayana.jts.narayana-jts-integration-7.3.4.Final.jar'
2026-09-02T18:59:19.7795985Z '/tmp/src/lib/main/org.jboss.slf4j.slf4j-jboss-logmanager-2.0.2.Final.jar' -> '/deployments/lib/main/org.jboss.slf4j.slf4j-jboss-logmanager-2.0.2.Final.jar'
2026-09-02T18:59:19.7796302Z '/tmp/src/lib/main/org.jboss.threads.jboss-threads-3.9.2.jar' -> '/deployments/lib/main/org.jboss.threads.jboss-threads-3.9.2.jar'
2026-09-02T18:59:19.7796590Z '/tmp/src/lib/main/org.jctools.jctools-core-4.0.5.jar' -> '/deployments/lib/main/org.jctools.jctools-core-4.0.5.jar'
2026-09-02T18:59:19.7796867Z '/tmp/src/lib/main/org.jspecify.jspecify-1.0.0.jar' -> '/deployments/lib/main/org.jspecify.jspecify-1.0.0.jar'
2026-09-02T18:59:19.7797285Z '/tmp/src/lib/main/org.jvnet.jaxb.jaxb-plugins-runtime-4.0.13.jar' -> '/deployments/lib/main/org.jvnet.jaxb.jaxb-plugins-runtime-4.0.13.jar'
2026-09-02T18:59:19.7797606Z '/tmp/src/lib/main/org.keycloak.keycloak-authz-client-26.0.11.jar' -> '/deployments/lib/main/org.keycloak.keycloak-authz-client-26.0.11.jar'
2026-09-02T18:59:19.7798050Z '/tmp/src/lib/main/org.keycloak.keycloak-client-common-synced-26.0.11.jar' -> '/deployments/lib/main/org.keycloak.keycloak-client-common-synced-26.0.11.jar'
2026-09-02T18:59:19.7798403Z '/tmp/src/lib/main/org.keycloak.keycloak-policy-enforcer-26.0.11.jar' -> '/deployments/lib/main/org.keycloak.keycloak-policy-enforcer-26.0.11.jar'
2026-09-02T18:59:19.7836138Z '/tmp/src/lib/main/org.latencyutils.LatencyUtils-2.0.3.jar' -> '/deployments/lib/main/org.latencyutils.LatencyUtils-2.0.3.jar'
2026-09-02T18:59:19.7836521Z '/tmp/src/lib/main/org.modelmapper.modelmapper-2.3.0.jar' -> '/deployments/lib/main/org.modelmapper.modelmapper-2.3.0.jar'
2026-09-02T18:59:19.7836852Z '/tmp/src/lib/main/org.osgi.org.osgi.namespace.extender-1.0.1.jar' -> '/deployments/lib/main/org.osgi.org.osgi.namespace.extender-1.0.1.jar'
2026-09-02T18:59:19.7837190Z '/tmp/src/lib/main/org.osgi.org.osgi.service.component.annotations-1.5.1.jar' -> '/deployments/lib/main/org.osgi.org.osgi.service.component.annotations-1.5.1.jar'
2026-09-02T18:59:19.7837533Z '/tmp/src/lib/main/org.osgi.org.osgi.util.function-1.0.0.jar' -> '/deployments/lib/main/org.osgi.org.osgi.util.function-1.0.0.jar'
2026-09-02T18:59:19.7837887Z '/tmp/src/lib/main/org.osgi.org.osgi.util.promise-1.0.0.jar' -> '/deployments/lib/main/org.osgi.org.osgi.util.promise-1.0.0.jar'
2026-09-02T18:59:19.7838171Z '/tmp/src/lib/main/org.osgi.osgi.annotation-8.1.0.jar' -> '/deployments/lib/main/org.osgi.osgi.annotation-8.1.0.jar'
2026-09-02T18:59:19.7838451Z '/tmp/src/lib/main/org.plutext.jaxb-svg11-11.4.0.jar' -> '/deployments/lib/main/org.plutext.jaxb-svg11-11.4.0.jar'
2026-09-02T18:59:19.7838757Z '/tmp/src/lib/main/org.reactivestreams.reactive-streams-1.0.4.jar' -> '/deployments/lib/main/org.reactivestreams.reactive-streams-1.0.4.jar'
2026-09-02T18:59:19.7839050Z '/tmp/src/lib/main/org.slf4j.jcl-over-slf4j-2.0.18.jar' -> '/deployments/lib/main/org.slf4j.jcl-over-slf4j-2.0.18.jar'
2026-09-02T18:59:19.7839411Z '/tmp/src/lib/main/org.slf4j.slf4j-api-2.0.18.jar' -> '/deployments/lib/main/org.slf4j.slf4j-api-2.0.18.jar'
2026-09-02T18:59:19.7839721Z '/tmp/src/lib/main/org.wildfly.common.wildfly-common-2.0.1.jar' -> '/deployments/lib/main/org.wildfly.common.wildfly-common-2.0.1.jar'
2026-09-02T18:59:19.7840049Z '/tmp/src/lib/main/org.wildfly.security.wildfly-elytron-asn1-2.9.2.Final.jar' -> '/deployments/lib/main/org.wildfly.security.wildfly-elytron-asn1-2.9.2.Final.jar'
2026-09-02T18:59:19.7840388Z '/tmp/src/lib/main/org.wildfly.security.wildfly-elytron-auth-2.9.2.Final.jar' -> '/deployments/lib/main/org.wildfly.security.wildfly-elytron-auth-2.9.2.Final.jar'
2026-09-02T18:59:19.7840743Z '/tmp/src/lib/main/org.wildfly.security.wildfly-elytron-auth-server-2.9.2.Final.jar' -> '/deployments/lib/main/org.wildfly.security.wildfly-elytron-auth-server-2.9.2.Final.jar'
2026-09-02T18:59:19.7841094Z '/tmp/src/lib/main/org.wildfly.security.wildfly-elytron-base-2.9.2.Final.jar' -> '/deployments/lib/main/org.wildfly.security.wildfly-elytron-base-2.9.2.Final.jar'
2026-09-02T18:59:19.7841450Z '/tmp/src/lib/main/org.wildfly.security.wildfly-elytron-credential-2.9.2.Final.jar' -> '/deployments/lib/main/org.wildfly.security.wildfly-elytron-credential-2.9.2.Final.jar'
2026-09-02T18:59:19.7841810Z '/tmp/src/lib/main/org.wildfly.security.wildfly-elytron-encryption-2.9.2.Final.jar' -> '/deployments/lib/main/org.wildfly.security.wildfly-elytron-encryption-2.9.2.Final.jar'
2026-09-02T18:59:19.7842158Z '/tmp/src/lib/main/org.wildfly.security.wildfly-elytron-keystore-2.9.2.Final.jar' -> '/deployments/lib/main/org.wildfly.security.wildfly-elytron-keystore-2.9.2.Final.jar'
2026-09-02T18:59:19.7842603Z '/tmp/src/lib/main/org.wildfly.security.wildfly-elytron-password-impl-2.9.2.Final.jar' -> '/deployments/lib/main/org.wildfly.security.wildfly-elytron-password-impl-2.9.2.Final.jar'
2026-09-02T18:59:19.7842959Z '/tmp/src/lib/main/org.wildfly.security.wildfly-elytron-permission-2.9.2.Final.jar' -> '/deployments/lib/main/org.wildfly.security.wildfly-elytron-permission-2.9.2.Final.jar'
2026-09-02T18:59:19.7843319Z '/tmp/src/lib/main/org.wildfly.security.wildfly-elytron-provider-util-2.9.2.Final.jar' -> '/deployments/lib/main/org.wildfly.security.wildfly-elytron-provider-util-2.9.2.Final.jar'
2026-09-02T18:59:19.7843763Z '/tmp/src/lib/main/org.wildfly.security.wildfly-elytron-realm-2.9.2.Final.jar' -> '/deployments/lib/main/org.wildfly.security.wildfly-elytron-realm-2.9.2.Final.jar'
2026-09-02T18:59:19.7844101Z '/tmp/src/lib/main/org.wildfly.security.wildfly-elytron-util-2.9.2.Final.jar' -> '/deployments/lib/main/org.wildfly.security.wildfly-elytron-util-2.9.2.Final.jar'
2026-09-02T18:59:19.7844532Z '/tmp/src/lib/main/org.wildfly.security.wildfly-elytron-x500-2.9.2.Final.jar' -> '/deployments/lib/main/org.wildfly.security.wildfly-elytron-x500-2.9.2.Final.jar'
2026-09-02T18:59:19.7846233Z '/tmp/src/lib/main/org.wildfly.security.wildfly-elytron-x500-cert-2.9.2.Final.jar' -> '/deployments/lib/main/org.wildfly.security.wildfly-elytron-x500-cert-2.9.2.Final.jar'
2026-09-02T18:59:19.7846653Z '/tmp/src/lib/main/org.wildfly.security.wildfly-elytron-x500-cert-util-2.9.2.Final.jar' -> '/deployments/lib/main/org.wildfly.security.wildfly-elytron-x500-cert-util-2.9.2.Final.jar'
2026-09-02T18:59:19.8135385Z '/tmp/src/lib/main/org.yaml.snakeyaml-2.6.jar' -> '/deployments/lib/main/org.yaml.snakeyaml-2.6.jar'
2026-09-02T18:59:19.8135694Z '/tmp/src/lib/main/stax.stax-1.2.0.jar' -> '/deployments/lib/main/stax.stax-1.2.0.jar'
2026-09-02T18:59:19.8135972Z '/tmp/src/lib/main/stax.stax-api-1.0.1.jar' -> '/deployments/lib/main/stax.stax-api-1.0.1.jar'
2026-09-02T18:59:19.8136238Z '/tmp/src/lib/main/xerces.xercesImpl-2.12.2.jar' -> '/deployments/lib/main/xerces.xercesImpl-2.12.2.jar'
2026-09-02T18:59:19.8136517Z '/tmp/src/lib/main/xml-apis.xml-apis-1.4.01.jar' -> '/deployments/lib/main/xml-apis.xml-apis-1.4.01.jar'
2026-09-02T18:59:19.8136720Z '/tmp/src/lib/boot' -> '/deployments/lib/boot'
2026-09-02T18:59:19.8136997Z '/tmp/src/lib/boot/io.quarkus.quarkus-bootstrap-runner-3.38.1.jar' -> '/deployments/lib/boot/io.quarkus.quarkus-bootstrap-runner-3.38.1.jar'
2026-09-02T18:59:19.8137885Z '/tmp/src/lib/boot/io.quarkus.quarkus-classloader-commons-3.38.1.jar' -> '/deployments/lib/boot/io.quarkus.quarkus-classloader-commons-3.38.1.jar'
2026-09-02T18:59:19.8138259Z '/tmp/src/lib/boot/io.quarkus.quarkus-development-mode-spi-3.38.1.jar' -> '/deployments/lib/boot/io.quarkus.quarkus-development-mode-spi-3.38.1.jar'
2026-09-02T18:59:19.8138565Z '/tmp/src/lib/boot/io.quarkus.quarkus-value-registry-3.38.1.jar' -> '/deployments/lib/boot/io.quarkus.quarkus-value-registry-3.38.1.jar'
2026-09-02T18:59:19.8139049Z '/tmp/src/lib/boot/io.quarkus.quarkus-vertx-latebound-mdc-provider-3.38.1.jar' -> '/deployments/lib/boot/io.quarkus.quarkus-vertx-latebound-mdc-provider-3.38.1.jar'
2026-09-02T18:59:19.8139414Z '/tmp/src/lib/boot/io.smallrye.common.smallrye-common-constraint-2.19.0.jar' -> '/deployments/lib/boot/io.smallrye.common.smallrye-common-constraint-2.19.0.jar'
2026-09-02T18:59:19.8139740Z '/tmp/src/lib/boot/io.smallrye.common.smallrye-common-cpu-2.19.0.jar' -> '/deployments/lib/boot/io.smallrye.common.smallrye-common-cpu-2.19.0.jar'
2026-09-02T18:59:19.8140071Z '/tmp/src/lib/boot/io.smallrye.common.smallrye-common-expression-2.19.0.jar' -> '/deployments/lib/boot/io.smallrye.common.smallrye-common-expression-2.19.0.jar'
2026-09-02T18:59:19.8140413Z '/tmp/src/lib/boot/io.smallrye.common.smallrye-common-function-2.19.0.jar' -> '/deployments/lib/boot/io.smallrye.common.smallrye-common-function-2.19.0.jar'
2026-09-02T18:59:19.8140737Z '/tmp/src/lib/boot/io.smallrye.common.smallrye-common-io-2.19.0.jar' -> '/deployments/lib/boot/io.smallrye.common.smallrye-common-io-2.19.0.jar'
2026-09-02T18:59:19.8141361Z '/tmp/src/lib/boot/io.smallrye.common.smallrye-common-net-2.19.0.jar' -> '/deployments/lib/boot/io.smallrye.common.smallrye-common-net-2.19.0.jar'
2026-09-02T18:59:19.8141682Z '/tmp/src/lib/boot/io.smallrye.common.smallrye-common-os-2.19.0.jar' -> '/deployments/lib/boot/io.smallrye.common.smallrye-common-os-2.19.0.jar'
2026-09-02T18:59:19.8142007Z '/tmp/src/lib/boot/io.smallrye.common.smallrye-common-ref-2.19.0.jar' -> '/deployments/lib/boot/io.smallrye.common.smallrye-common-ref-2.19.0.jar'
2026-09-02T18:59:19.8142284Z '/tmp/src/lib/boot/org.crac.crac-1.5.0.jar' -> '/deployments/lib/boot/org.crac.crac-1.5.0.jar'
2026-09-02T18:59:19.8142587Z '/tmp/src/lib/boot/org.jboss.logging.jboss-logging-3.6.3.Final.jar' -> '/deployments/lib/boot/org.jboss.logging.jboss-logging-3.6.3.Final.jar'
2026-09-02T18:59:19.8143005Z '/tmp/src/lib/boot/org.jboss.logmanager.jboss-logmanager-3.2.2.Final.jar' -> '/deployments/lib/boot/org.jboss.logmanager.jboss-logmanager-3.2.2.Final.jar'
2026-09-02T18:59:19.8143229Z '/tmp/src/quarkus' -> '/deployments/quarkus'
2026-09-02T18:59:19.8143576Z '/tmp/src/quarkus/generated-bytecode.jar' -> '/deployments/quarkus/generated-bytecode.jar'
2026-09-02T18:59:19.8143838Z '/tmp/src/quarkus/quarkus-application.dat' -> '/deployments/quarkus/quarkus-application.dat'
2026-09-02T18:59:19.8144085Z '/tmp/src/quarkus/transformed-bytecode.jar' -> '/deployments/quarkus/transformed-bytecode.jar'
2026-09-02T18:59:19.8144326Z '/tmp/src/quarkus-app-dependencies.txt' -> '/deployments/quarkus-app-dependencies.txt'
2026-09-02T18:59:19.8872720Z '/tmp/src/sisgf-backend-14-0-6-11.zip' -> '/deployments/sisgf-backend-14-0-6-11.zip'
2026-09-02T18:59:19.8872969Z + exit 0
2026-09-02T18:59:20.2283994Z STEP 9/9: CMD /usr/local/s2i/run
2026-09-02T18:59:20.2563281Z COMMIT temp.builder.openshift.io/build-images-ads/sisgf-backend-303:f4853d68
2026-09-02T18:59:20.2586094Z time="2026-09-02T18:59:20Z" level=warning msg="Adding metacopy option, configured globally"
2026-09-02T18:59:26.3155366Z Getting image source signatures
2026-09-02T18:59:26.3173324Z Copying blob sha256:f9327c1608ad0ae79b5f4a4c47eda907a980ea9640c70e6036811ea76d641249
2026-09-02T18:59:26.3184374Z Copying blob sha256:449675ca11bc217d5066dcce0a7dcb774bc87cb2553a8f137bc875cb5dddf4d4
2026-09-02T18:59:26.3192806Z Copying blob sha256:9d33dbfb9e8abcd14e0a55be85f30752600448499b0dddb846f2bf5fd21d8d37
2026-09-02T18:59:26.3195188Z Copying blob sha256:d08ff564362ee8ca55bca00895929a4f92fc6c574c9ce4de07024e9627540fc8
2026-09-02T18:59:26.3198102Z Copying blob sha256:88fe04f85e71aef700a24d555248930b381fbdedb2be87e65dd9128fa4b93bf5
2026-09-02T18:59:26.3219216Z Copying blob sha256:6a8d5f164ca47b1c2e7bdb23f07d1bc02247c71c181d3950f2d0012967247ecf
2026-09-02T18:59:26.3224780Z Copying blob sha256:fc52cb1db6a2236e936683e32d7d60350c381fcb63403826f35e5d20a42ea4b4
2026-09-02T18:59:26.3250807Z Copying blob sha256:27f2ced2acdb114c526bf645b9d1b01fec071e61780410099142b37949a8e177
2026-09-02T18:59:26.3257336Z Copying blob sha256:e578e7bf31c2bac2e9cae908f01970074818ba19564ba62c52e4f60d293e22d2
2026-09-02T18:59:26.3266152Z Copying blob sha256:b29fa49cd757a63e0eb6f03b1998612903715a4dcd8b50b12f6b53910c2e67ae
2026-09-02T18:59:26.3273768Z Copying blob sha256:405281dd08e52c573399a3d7dd112b545a92923636ede89d04c5c76a5e9f929a
2026-09-02T18:59:26.3279337Z Copying blob sha256:7a2b528f79445d7c059524929c661a8297e6a4a9663206c104826eb2b51a1dfe
2026-09-02T18:59:26.3296980Z Copying blob sha256:19c2241f978dfd51ee0e33a16fbf562ec5285bd8ea9c16cb473269d2408df3fc
2026-09-02T18:59:26.3352157Z Copying blob sha256:dc6e496ff07c4814f18ec49accf0bb795a4a7786707e49a7f7f0422e2936a114
2026-09-02T18:59:30.8959962Z Copying config sha256:34afadb39761a9bda6542de7dc87e7206e7411df863101d0ca4588550f6ef7f4
2026-09-02T18:59:30.9609502Z Writing manifest to image destination
2026-09-02T18:59:31.0680415Z Storing signatures
2026-09-02T18:59:33.2461379Z --> 34afadb3976
2026-09-02T18:59:33.2461712Z Successfully tagged temp.builder.openshift.io/build-images-ads/sisgf-backend-303:f4853d68
2026-09-02T18:59:33.4477057Z 34afadb39761a9bda6542de7dc87e7206e7411df863101d0ca4588550f6ef7f4
2026-09-02T18:59:33.6292749Z 
2026-09-02T18:59:33.6293978Z Pushing image image-registry.openshift-image-registry.svc:5000/build-images-ads/sisgf-backend:latest ...
2026-09-02T18:59:33.6383662Z Getting image source signatures
2026-09-02T18:59:34.3150815Z Copying blob sha256:24dafab7f594e7a2b9e71b74932f6f72d2e31ac8f84fbd5062d173e63637b237
2026-09-02T18:59:34.3683867Z Copying blob sha256:264aaa453271eaaf6bc92b521f62e38cbda4f01e1a3fbf50abdb8b466be58a64
2026-09-02T18:59:34.4211022Z Copying blob sha256:c98bbacb82bbf386496c2e0ef89b288bc8782dd9ae664dddcb285cf0965ba7f2
2026-09-02T18:59:34.6240981Z Copying blob sha256:7f24bdb73d536337c7d82dee9c11e09acd3bacb0e1a76e98c6e82a8208e82284
2026-09-02T18:59:34.6647027Z Copying blob sha256:e1c363c96d760cb85e197cc8e2ab950760067935b29e7c098ae51ed371f5b0cd
2026-09-02T18:59:34.9585053Z Copying blob sha256:0a9a2db04f3ebe8121912deecd1a66d98a4ff35c7a3ee57e3eeffcb667119be1
2026-09-02T18:59:35.1787291Z Copying blob sha256:4e0cd4f607fede7693f7eb61b31b84c051e5897ce5a096534ed90dc4808e5523
2026-09-02T18:59:35.2031685Z Copying blob sha256:586ae232f6757fb4248eda7dca86bf361d076242d052ee30965fec2eb1ea5a1c
2026-09-02T18:59:35.2250063Z Copying blob sha256:62d739cb3ca9a7f2a63e12f99c516e6432170af671b061195e6eafa7e864d6a2
2026-09-02T18:59:35.2309098Z Copying blob sha256:9d5b85cf24e32083e165099afcc1bd9cc0a57a764f9077301e686e2d27f0eb2c
2026-09-02T18:59:35.2602269Z Copying blob sha256:067039afffe5f5aa56bc578e5d9256b8b0055763a32c54a38a73b969a8fd4f13
2026-09-02T18:59:35.2914899Z Copying blob sha256:7749ffa7020405743e3e0425d93720455a83619d343e217645f48f948260ab49
2026-09-02T18:59:35.3252470Z Copying blob sha256:da2064a8b4a27db53f236c51c89c049f993c4438da41f6c80cb24242776bf1da
2026-09-02T18:59:35.3462778Z Copying blob sha256:dc6e496ff07c4814f18ec49accf0bb795a4a7786707e49a7f7f0422e2936a114
2026-09-02T18:59:39.9377034Z Copying config sha256:34afadb39761a9bda6542de7dc87e7206e7411df863101d0ca4588550f6ef7f4
2026-09-02T18:59:40.1763615Z Writing manifest to image destination
2026-09-02T18:59:40.2635489Z Storing signatures
2026-09-02T18:59:40.2636210Z Successfully pushed image-registry.openshift-image-registry.svc:5000/build-images-ads/sisgf-backend@sha256:bdd7733f2d74807d4f36b5b8d216a0249e33028e0ca4bbb34bb2ebbe67c18c76
2026-09-02T18:59:40.2884114Z Push successful
2026-09-02T18:59:49.7532774Z ##[section]Finishing: Executando Build S2I Binary
