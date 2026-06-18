Starting: Executando Build S2I Binary
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/54285297-6335-42e7-94a7-b9a3fd536072.sh
+ echo okd4_nprd
+ egrep -q '^(okd4|ocp)'
+ buildconfig=sihdg-jboss8
+ DOTNET_ASSEMBLY=
/opt/ads-agent/_work/_temp/54285297-6335-42e7-94a7-b9a3fd536072.sh: line 12:  -4: substring expression < 0
+ cd /opt/ads-agent/_work/32/a
+ FILES=(`find -maxdepth 1 -name "*.runtimeconfig*.json"`)
++ find -maxdepth 1 -name '*.runtimeconfig*.json'
+ '[' -d /opt/ads-agent/_work/32/s/target/server ']'
+ oc start-build sihdg-jboss8 --from-dir=/opt/ads-agent/_work/32/a --follow --wait=true -n build-images-ads -v=5
I0618 17:09:37.451863   46635 repository.go:450] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
I0618 17:09:37.454444   46635 repository.go:533] Error executing command: exit status 128
Uploading directory "/opt/ads-agent/_work/32/a" as binary input for the build ...
I0618 17:09:37.454647   46635 tar.go:238] Adding "/opt/ads-agent/_work/32/a" to tar ...
I0618 17:09:37.454994   46635 tar.go:336] Adding to tar: /opt/ads-agent/_work/32/a/sihdg-jboss8.ear as sihdg-jboss8.ear
.
Uploading finished
build.build.openshift.io/sihdg-jboss8-3 started
Adding cluster TLS certificate authority to trust store
Receiving source from STDIN as archive ...
Adding cluster TLS certificate authority to trust store
Adding cluster TLS certificate authority to trust store
time="2026-06-18T20:10:11Z" level=info msg="Not using native diff for overlay, this may cause degraded performance for building images: kernel has CONFIG_OVERLAY_FS_REDIRECT_DIR enabled"
I0618 20:10:11.624509       1 defaults.go:102] Defaulting to storage driver "overlay" with options [mountopt=metacopy=on].
Caching blobs under "/var/cache/blobs".

I0618 17:10:36.275099   46671 tar.go:238] Adding "/opt/ads-agent/_work/32/a" to tar ...
I0618 17:10:36.275364   46671 tar.go:336] Adding to tar: /opt/ads-agent/_work/32/a/sihdg-jboss8.ear as sihdg-jboss8.ear
.
Uploading finished
build.build.openshift.io/sihdg-jboss8-4 started
Adding cluster TLS certificate authority to trust store
Receiving source from STDIN as archive ...
Adding cluster TLS certificate authority to trust store
Adding cluster TLS certificate authority to trust store
time="2026-06-18T20:11:24Z" level=info msg="Not using native diff for overlay, this may cause degraded performance for building images: kernel has CONFIG_OVERLAY_FS_REDIRECT_DIR enabled"
I0618 20:11:24.460845       1 defaults.go:102] Defaulting to storage driver "overlay" with options [mountopt=metacopy=on].
Caching blobs under "/var/cache/blobs".
Trying to pull registry.redhat.io/jboss-eap-8/eap8-openjdk21-runtime-openshift-rhel9@sha256:ed3ae098aca62ce353303c098ed2d43b773d9706f78f5e6c05323850659ab826...
Getting image source signatures
Copying blob sha256:144071c1871ebeffab93c91b84ed5a631ae269555d000c90db197a54c0604d5f
Copying blob sha256:1ca3207e35f8b9541da33cc8496312af6d57e69b13a69e4f7817b869202cdc1f
Copying config sha256:861827b880d47c7e2a957544aeeed7bc02fc572b6d16c39b264a0a97606a056e
Writing manifest to image destination
Storing signatures
Generating dockerfile with builder image registry.redhat.io/jboss-eap-8/eap8-openjdk21-runtime-openshift-rhel9@sha256:ed3ae098aca62ce353303c098ed2d43b773d9706f78f5e6c05323850659ab826
STEP 1/9: FROM registry.redhat.io/jboss-eap-8/eap8-openjdk21-runtime-openshift-rhel9@sha256:ed3ae098aca62ce353303c098ed2d43b773d9706f78f5e6c05323850659ab826
STEP 2/9: LABEL "io.openshift.build.image"="registry.redhat.io/jboss-eap-8/eap8-openjdk21-runtime-openshift-rhel9@sha256:ed3ae098aca62ce353303c098ed2d43b773d9706f78f5e6c05323850659ab826"       "io.openshift.build.source-location"="/tmp/build/inputs"
STEP 3/9: ENV OPENSHIFT_BUILD_NAME="sihdg-jboss8-4"     OPENSHIFT_BUILD_NAMESPACE="build-images-ads"
STEP 4/9: USER root
STEP 5/9: COPY upload/src /tmp/src
STEP 6/9: RUN chown -R 185:0 /tmp/src
STEP 7/9: USER 185
STEP 8/9: RUN /usr/libexec/s2i/assemble
/bin/sh: line 1: /usr/libexec/s2i/assemble: No such file or directory
error: build error: error building at STEP "RUN /usr/libexec/s2i/assemble": error while running runtime: exit status 127
error: the build build-images-ads/sihdg-jboss8-4 status is "Failed"
##[error]Bash exited with code '1'.
Finishing: Executando Build S2I Binary

I0618 17:10:36.275099   46671 tar.go:238] Adding "/opt/ads-agent/_work/32/a" to tar ...
I0618 17:10:36.275364   46671 tar.go:336] Adding to tar: /opt/ads-agent/_work/32/a/sihdg-jboss8.ear as sihdg-jboss8.ear
.
Uploading finished
build.build.openshift.io/sihdg-jboss8-4 started
Adding cluster TLS certificate authority to trust store
Receiving source from STDIN as archive ...
Adding cluster TLS certificate authority to trust store
Adding cluster TLS certificate authority to trust store
time="2026-06-18T20:11:24Z" level=info msg="Not using native diff for overlay, this may cause degraded performance for building images: kernel has CONFIG_OVERLAY_FS_REDIRECT_DIR enabled"
I0618 20:11:24.460845       1 defaults.go:102] Defaulting to storage driver "overlay" with options [mountopt=metacopy=on].
Caching blobs under "/var/cache/blobs".
Trying to pull registry.redhat.io/jboss-eap-8/eap8-openjdk21-runtime-openshift-rhel9@sha256:ed3ae098aca62ce353303c098ed2d43b773d9706f78f5e6c05323850659ab826...
Getting image source signatures
Copying blob sha256:144071c1871ebeffab93c91b84ed5a631ae269555d000c90db197a54c0604d5f
Copying blob sha256:1ca3207e35f8b9541da33cc8496312af6d57e69b13a69e4f7817b869202cdc1f
Copying config sha256:861827b880d47c7e2a957544aeeed7bc02fc572b6d16c39b264a0a97606a056e
Writing manifest to image destination
Storing signatures
Generating dockerfile with builder image registry.redhat.io/jboss-eap-8/eap8-openjdk21-runtime-openshift-rhel9@sha256:ed3ae098aca62ce353303c098ed2d43b773d9706f78f5e6c05323850659ab826
STEP 1/9: FROM registry.redhat.io/jboss-eap-8/eap8-openjdk21-runtime-openshift-rhel9@sha256:ed3ae098aca62ce353303c098ed2d43b773d9706f78f5e6c05323850659ab826
STEP 2/9: LABEL "io.openshift.build.image"="registry.redhat.io/jboss-eap-8/eap8-openjdk21-runtime-openshift-rhel9@sha256:ed3ae098aca62ce353303c098ed2d43b773d9706f78f5e6c05323850659ab826"       "io.openshift.build.source-location"="/tmp/build/inputs"
STEP 3/9: ENV OPENSHIFT_BUILD_NAME="sihdg-jboss8-4"     OPENSHIFT_BUILD_NAMESPACE="build-images-ads"
STEP 4/9: USER root
STEP 5/9: COPY upload/src /tmp/src
STEP 6/9: RUN chown -R 185:0 /tmp/src
STEP 7/9: USER 185
STEP 8/9: RUN /usr/libexec/s2i/assemble
/bin/sh: line 1: /usr/libexec/s2i/assemble: No such file or directory
error: build error: error building at STEP "RUN /usr/libexec/s2i/assemble": error while running runtime: exit status 127
error: the build build-images-ads/sihdg-jboss8-4 status is "Failed"
##[error]Bash exited with code '1'.
Finishing: Executando Build S2I Binary
