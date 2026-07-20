
-sh-4.2$
-sh-4.2$ v^C
-sh-4.2$ oc whoami --show-server
https://api.nprd.caixa:6443
-sh-4.2$



esse pe de um build que passou na sextafeira


Executando Build S2I Binary

View raw log

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
/usr/bin/bash /opt/ads-agent/_work/_temp/947b7fca-8cf6-44c1-9147-4c8dfb766e8f.sh
+ echo okd4_nprd
+ egrep -q '^(okd4|ocp)'
+ buildconfig=sifap-front-v2
+ oc start-build sifap-front-v2 --from-dir=/opt/ads-agent/_work/26/a --follow --wait=true -n build-images-ads -v=5
I0717 20:24:26.390707  195299 repository.go:450] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
I0717 20:24:26.393114  195299 repository.go:533] Error executing command: exit status 128
Uploading directory "/opt/ads-agent/_work/26/a" as binary input for the build ...
I0717 20:24:26.393283  195299 tar.go:238] Adding "/opt/ads-agent/_work/26/a" to tar ...
I0717 20:24:26.393594  195299 tar.go:336] Adding to tar: /opt/ads-agent/_work/26/a/.s2i as .s2i
I0717 20:24:26.395087  195299 tar.go:336] Adding to tar: /opt/ads-agent/_work/26/a/.s2i/bin as .s2i/bin
I0717 20:24:26.395327  195299 tar.go:336] Adding to tar: /opt/ads-agent/_work/26/a/.s2i/bin/assemble as .s2i/bin/assemble
I0717 20:24:26.395527  195299 tar.go:336] Adding to tar: /opt/ads-agent/_work/26/a/.s2i/bin/run as .s2i/bin/run
I0717 20:24:26.395701  195299 tar.go:336] Adding to tar: /opt/ads-agent/_work/26/a/sifap-front-v2.zip as sifap-front-v2.zip
.
Uploading finished
build.build.openshift.io/sifap-front-v2-245 started
Adding cluster TLS certificate authority to trust store
Receiving source from STDIN as archive ...
Adding cluster TLS certificate authority to trust store
Adding cluster TLS certificate authority to trust store
time="2026-07-17T23:24:34Z" level=info msg="Not using native diff for overlay, this may cause degraded performance for building images: kernel has CONFIG_OVERLAY_FS_REDIRECT_DIR enabled"
I0717 23:24:34.736291       1 defaults.go:102] Defaulting to storage driver "overlay" with options [mountopt=metacopy=on].
Caching blobs under "/var/cache/blobs".
Trying to pull image-registry.openshift-image-registry.svc:5000/openshift/nginx@sha256:d4c426a72029951c5b81d6ea57ecae73e9a4ea8aeeb115cf871bf7b375bcd44c...
Getting image source signatures
Copying blob sha256:06038631a24a25348b51d1bfc7d0a0ee555552a8998f8328f9b657d02dd4c64c
Copying blob sha256:16ced056df22eeca4ed0180b92a884beb321e53afded464e9c64bab3e5f7a650
Copying blob sha256:b7874c7c745526edc862e5c886bfa9b9ded6e01ef384d46ce1aee844f8a7eefc
Copying blob sha256:44115d860fcecaa250b811cc4120d7ba18a2250bada1fe15199de53cefde7fc7
