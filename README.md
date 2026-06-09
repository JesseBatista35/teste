Executando Build S2I Binary

View raw log

========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/8e743842-9b7b-4a31-97b1-8b73534675f2.sh
+ set -o errexit
+ set -o pipefail
+ echo okd4_nprd
+ egrep -q '^(okd4|ocp)'
+ buildconfig=sifof-api-aplicacao
+ oc start-build sifof-api-aplicacao --from-dir=/opt/ads-agent/_work/61/a --follow --wait=true -n build-images-ads -v=5
I0609 10:08:50.028120  145474 repository.go:450] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
I0609 10:08:50.030306  145474 repository.go:533] Error executing command: exit status 128
Uploading directory "/opt/ads-agent/_work/61/a" as binary input for the build ...
I0609 10:08:50.030407  145474 tar.go:238] Adding "/opt/ads-agent/_work/61/a" to tar ...
I0609 10:08:50.030654  145474 tar.go:336] Adding to tar: /opt/ads-agent/_work/61/a/app as app
I0609 10:08:50.031781  145474 tar.go:336] Adding to tar: /opt/ads-agent/_work/61/a/app/sifof-api-aplicacao-1.0.0.18.jar as app/sifof-api-aplicacao-1.0.0.18.jar
I0609 10:08:50.037130  145474 tar.go:336] Adding to tar: /opt/ads-agent/_work/61/a/lib as lib
I0609 10:08:50.037595  145474 tar.go:336] Adding to tar: /opt/ads-agent/_work/61/a/lib/boot as lib/boot
I0609 10:08:50.037645  145474 tar.go:336] Adding to tar: /opt/ads-agent/_work/61/a/lib/boot/io.quarkus.quarkus-bootstrap-runner-3.32.3.jar as lib/boot/io.quarkus.quarkus-bootstrap-runner-3.32.3.jar
I0609 10:08:50.040907  145474 tar.go:336] Adding to tar: /opt/ads-agent/_work/61/a/lib/boot/io.quarkus.quarkus-classloader-commons-3.32.3.jar as lib/boot/io.quarkus.quarkus-classloader-commons-3.32.3.jar
I0609 10:08:50.042661  145474 tar.go:336] Adding to tar: /opt/ads-agent/_work/61/a/lib/boot/io.quarkus.quarkus-development-mode-spi-3.32.3.jar as lib/boot/io.quarkus.quarkus-development-mode-spi-3.32.3.jar
I0609 10:08:50.043824  145474 tar.go:336] Adding to tar: /opt/ads-agent/_work/61/a/lib/boot/io.quarkus.quarkus-value-registry-3.32.3.jar as lib/boot/io.quarkus.quarkus-value-registry-3.32.3.jar
I0609 10:08:50.045302  145474 tar.go:336] Adding to tar: /opt/ads-agent/_work/61/a/lib/boot/io.quarkus.quarkus-vertx-latebound-mdc-provider-3.32.3.jar as lib/boot/io.quarkus.quarkus-vertx-latebound-mdc-provider-3.32.3.jar
I0609 10:08:50.045494  145474 tar.go:336] Adding to tar: /opt/ads-agent/_work/61/a/lib/boot/io.smallrye.common.smallrye-common-constraint-2.16.0.jar as lib/boot/io.smallrye.common.smallrye-common-constraint-2.16.0.jar
I0609 10:08:50.045671  145474 tar.go:336] Adding to tar: /opt/ads-agent/_work/61/a/lib/boot/io.smallrye.common.smallrye-common-cpu-2.16.0.jar as lib/boot/io.smallrye.common.smallrye-common-cpu-2.16.0.jar
I0609 10:08:50.046424  145474 tar.go:336] Adding to tar: /opt/ads-agent/_work/61/a/lib/boot/io.smallrye.common.smallrye-common-expression-2.16.0.jar as lib/boot/io.smallrye.common.smallrye-common-expression-2.16.0.jar
I0609 10:08:50.047739  145474 tar.go:336] Adding to tar: /opt/ads-agent/_work/61/a/lib/boot/io.smallrye.common.smallrye-common-function-2.16.0.jar as lib/boot/io.smallrye.common.smallrye-common-function-2.16.0.jar
I0609 10:08:50.050740  145474 tar.go:336] Adding to tar: /opt/ads-agent/_work/61/a/lib/boot/io.smallrye.common.smallrye-common-io-2.16.0.jar as lib/boot/io.smallrye.common.smallrye-common-io-2.16.0.jar
I0609 10:08:50.050961  145474 tar.go:336] Adding to tar: /opt/ads-agent/_work/61/a/lib/boot/io.smallrye.common.smallrye-common-net-2.16.0.jar as lib/boot/io.smallrye.common.smallrye-common-net-2.16.0.jar
I0609 10:08:50.052719  145474 tar.go:336] Adding to tar: /opt/ads-agent/_work/61/a/lib/boot/io.smallrye.common.smallrye-common-os-2.16.0.jar as lib/boot/io.smallrye.common.smallrye-common-os-2.16.0.jar
I0609 10:08:50.053350  145474 tar.go:336] Adding to tar: /opt/ads-agent/_work/61/a/lib/boot/io.smallrye.common.smallrye-common-ref-2.16.0.jar as lib/boot/io.smallrye.common.smallrye-common-ref-2.16.0.jar
I0609 10:08:50.053526  145474 tar.go:336] Adding to tar: /opt/ads-agent/_work/61/a/lib/boot/org.crac.crac-1.5.0.jar as lib/boot/org.crac.crac-1.5.0.jar
I0609 10:08:50.054383  145474 tar.go:336] Adding to tar: /opt/ads-agent/_work/61/a/lib/boot/org.jboss.logging.jboss-logging-3.6.2.Final.jar as lib/boot/org.jboss.logging.jboss-logging-3.6.2.Final.jar
I0609 10:08:50.056693  145474 tar.go:336] Adding to tar: /opt/ads-agent/_work/61/a/lib/boot/org.jboss.logmanager.jboss-logmanager-3.2.1.Final.jar as lib/boot/org.jboss.logmanager.jboss-logmanager-3.2.1.Final.jar
............
Uploading finished
I0609 10:09:50.063447  145474 helpers.go:237] Connection error: Post https://api.produtos4.caixa:6443/apis/build.openshift.io/v1/namespaces/build-images-ads/buildconfigs/sifof-api-aplicacao/instantiatebinary?name=sifof-api-aplicacao&namespace=build-images-ads: unexpected EOF
Unable to connect to the server: unexpected EOF
##[error]Bash exited with code '1'.
Finishing: Executando Build S2I Binary


me ajuda a reseovler esse problema na build azuure devosps classic
