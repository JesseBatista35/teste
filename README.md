I0708 14:32:54.019964   55759 tar.go:312] Adding to tar: /opt/ads-agent/_work/12226/a/lib/boot/io.github.crac.org-crac-0.1.3.redhat-00002.jar as lib/boot/io.github.crac.org-crac-0.1.3.redhat-00002.jar
I0708 14:32:54.020028   55759 tar.go:312] Adding to tar: /opt/ads-agent/_work/12226/a/lib/boot/io.quarkus.quarkus-bootstrap-runner-3.15.3.redhat-00002.jar as lib/boot/io.quarkus.quarkus-bootstrap-runner-3.15.3.redhat-00002.jar
I0708 14:32:54.023123   55759 tar.go:312] Adding to tar: /opt/ads-agent/_work/12226/a/lib/boot/io.quarkus.quarkus-classloader-commons-3.15.3.redhat-00002.jar as lib/boot/io.quarkus.quarkus-classloader-commons-3.15.3.redhat-00002.jar
I0708 14:32:54.024069   55759 tar.go:312] Adding to tar: /opt/ads-agent/_work/12226/a/lib/boot/io.quarkus.quarkus-development-mode-spi-3.15.3.redhat-00002.jar as lib/boot/io.quarkus.quarkus-development-mode-spi-3.15.3.redhat-00002.jar
I0708 14:32:54.026638   55759 tar.go:312] Adding to tar: /opt/ads-agent/_work/12226/a/lib/boot/io.quarkus.quarkus-vertx-latebound-mdc-provider-3.15.3.redhat-00002.jar as lib/boot/io.quarkus.quarkus-vertx-latebound-mdc-provider-3.15.3.redhat-00002.jar
I0708 14:32:54.026823   55759 tar.go:312] Adding to tar: /opt/ads-agent/_work/12226/a/lib/boot/io.smallrye.common.smallrye-common-constraint-2.6.0.redhat-00001.jar as lib/boot/io.smallrye.common.smallrye-common-constraint-2.6.0.redhat-00001.jar
I0708 14:32:54.027027   55759 tar.go:312] Adding to tar: /opt/ads-agent/_work/12226/a/lib/boot/io.smallrye.common.smallrye-common-cpu-2.6.0.redhat-00001.jar as lib/boot/io.smallrye.common.smallrye-common-cpu-2.6.0.redhat-00001.jar
I0708 14:32:54.028107   55759 tar.go:312] Adding to tar: /opt/ads-agent/_work/12226/a/lib/boot/io.smallrye.common.smallrye-common-expression-2.6.0.redhat-00001.jar as lib/boot/io.smallrye.common.smallrye-common-expression-2.6.0.redhat-00001.jar
I0708 14:32:54.029696   55759 tar.go:312] Adding to tar: /opt/ads-agent/_work/12226/a/lib/boot/io.smallrye.common.smallrye-common-function-2.6.0.redhat-00001.jar as lib/boot/io.smallrye.common.smallrye-common-function-2.6.0.redhat-00001.jar
I0708 14:32:54.031399   55759 tar.go:312] Adding to tar: /opt/ads-agent/_work/12226/a/lib/boot/io.smallrye.common.smallrye-common-io-2.6.0.redhat-00001.jar as lib/boot/io.smallrye.common.smallrye-common-io-2.6.0.redhat-00001.jar
I0708 14:32:54.032614   55759 tar.go:312] Adding to tar: /opt/ads-agent/_work/12226/a/lib/boot/io.smallrye.common.smallrye-common-net-2.6.0.redhat-00001.jar as lib/boot/io.smallrye.common.smallrye-common-net-2.6.0.redhat-00001.jar
I0708 14:32:54.034519   55759 tar.go:312] Adding to tar: /opt/ads-agent/_work/12226/a/lib/boot/io.smallrye.common.smallrye-common-os-2.6.0.redhat-00001.jar as lib/boot/io.smallrye.common.smallrye-common-os-2.6.0.redhat-00001.jar
I0708 14:32:54.034649   55759 tar.go:312] Adding to tar: /opt/ads-agent/_work/12226/a/lib/boot/io.smallrye.common.smallrye-common-ref-2.6.0.redhat-00001.jar as lib/boot/io.smallrye.common.smallrye-common-ref-2.6.0.redhat-00001.jar
I0708 14:32:54.034854   55759 tar.go:312] Adding to tar: /opt/ads-agent/_work/12226/a/lib/boot/org.jboss.logging.jboss-logging-3.6.0.Final-redhat-00001.jar as lib/boot/org.jboss.logging.jboss-logging-3.6.0.Final-redhat-00001.jar
I0708 14:32:54.037348   55759 tar.go:312] Adding to tar: /opt/ads-agent/_work/12226/a/lib/boot/org.jboss.logmanager.jboss-logmanager-3.1.1.Final-redhat-00001.jar as lib/boot/org.jboss.logmanager.jboss-logmanager-3.1.1.Final-redhat-00001.jar
............
Uploading finished
I0708 14:33:54.057204   55759 helpers.go:219] Connection error: Post https://api.produtos4.caixa:6443/apis/build.openshift.io/v1/namespaces/build-images-ads/buildconfigs/sispx-qrcode-atualiza-status/instantiatebinary?name=sispx-qrcode-atualiza-status&namespace=build-images-ads: unexpected EOF
F0708 14:33:54.057217   55759 helpers.go:119] Unable to connect to the server: unexpected EOF
##[error]Bash exited with code '255'.
##[warning]RetryHelper encountered task failure, will retry (attempt #: 1 out of 1) after 1000 ms
Generating script.
========================== Starting Command Output ===========================
/bin/bash /opt/ads-agent/_work/_temp/1a667b5e-52e1-4fcb-a0bb-7fafb29d0b41.sh
+ set -o errexit
+ set -o pipefail
+ echo ocp_nprd
+ egrep -q '^(okd4|ocp)'
+ buildconfig=sispx-qrcode-atualiza-status
+ oc start-build sispx-qrcode-atualiza-status --from-dir=/opt/ads-agent/_work/12226/a --follow --wait=true -n build-images-ads -v=5
I0708 14:33:55.269736   55878 repository.go:424] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
I0708 14:33:55.271425   55878 repository.go:484] Error executing command: exit status 128
Uploading directory "/opt/ads-agent/_work/12226/a" as binary input for the build ...
I0708 14:33:55.271514   55878 tar.go:217] Adding "/opt/ads-agent/_work/12226/a" to tar ...
I0708 14:33:55.271766   55878 tar.go:312] Adding to tar: /opt/ads-agent/_work/12226/a/app as app
I0708 14:33:55.272138   55878 tar.go:312] Adding to tar: /opt/ads-agent/_work/12226/a/app/sispx-qrcode-atualiza-status-1.0.0-SNAPSHOT.jar as app/sispx-qrcode-atualiza-status-1.0.0-SNAPSHOT.jar
I0708 14:33:55.295817   55878 tar.go:312] Adding to tar: /opt/ads-agent/_work/12226/a/lib as lib
I0708 14:33:55.295954   55878 tar.go:312] Adding to tar: /opt/ads-agent/_work/12226/a/lib/boot as lib/boot
I0708 14:33:55.295991   55878 tar.go:312] Adding to tar: /opt/ads-agent/_work/12226/a/lib/boot/io.github.crac.org-crac-0.1.3.redhat-00002.jar as lib/boot/io.github.crac.org-crac-0.1.3.redhat-00002.jar
I0708 14:33:55.296034   55878 tar.go:312] Adding to tar: /opt/ads-agent/_work/12226/a/lib/boot/io.quarkus.quarkus-bootstrap-runner-3.15.3.redhat-00002.jar as lib/boot/io.quarkus.quarkus-bootstrap-runner-3.15.3.redhat-00002.jar
