
##[warning]RetryHelper encountered task failure, will retry (attempt #: 1 out of 1) after 1000 ms
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/25f52ede-7fa3-4a46-89a6-2355a6083cb9.sh
+ echo okd4_nprd
+ egrep -q '^(okd4|ocp)'
+ buildconfig=sihdg-jboss8
+ DOTNET_ASSEMBLY=
/opt/ads-agent/_work/_temp/25f52ede-7fa3-4a46-89a6-2355a6083cb9.sh: line 12:  -4: substring expression < 0
+ cd /opt/ads-agent/_work/40/a
+ FILES=(`find -maxdepth 1 -name "*.runtimeconfig*.json"`)
++ find -maxdepth 1 -name '*.runtimeconfig*.json'
+ '[' -d /opt/ads-agent/_work/40/s/target/server ']'
+ oc start-build sihdg-jboss8 --from-dir=/opt/ads-agent/_work/40/a --follow --wait=true -n build-images-ads -v=5
I0618 16:50:19.431868   58931 repository.go:450] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
I0618 16:50:19.433944   58931 repository.go:533] Error executing command: exit status 128
Uploading directory "/opt/ads-agent/_work/40/a" as binary input for the build ...
I0618 16:50:19.434079   58931 tar.go:238] Adding "/opt/ads-agent/_work/40/a" to tar ...
I0618 16:50:19.434332   58931 tar.go:336] Adding to tar: /opt/ads-agent/_work/40/a/sihdg-jboss8.ear as sihdg-jboss8.ear
.
Uploading finished
build.build.openshift.io/sihdg-jboss8-2 started
Adding cluster TLS certificate authority to trust store
Receiving source from STDIN as archive ...
failed to watch file "/var/log/pods/build-images-ads_sihdg-jboss8-2-build_c45e2f43-dd54-46d8-9dd7-20a4cd194db7/git-clone/0.log": no space left on deviceAdding cluster TLS certificate authority to trust store
Adding cluster TLS certificate authority to trust store
time="2026-06-18T19:50:27Z" level=info msg="Not using native diff for overlay, this may cause degraded performance for building images: kernel has CONFIG_OVERLAY_FS_REDIRECT_DIR enabled"
I0618 19:50:27.903123       1 defaults.go:102] Defaulting to storage driver "overlay" with options [mountopt=metacopy=on].
Caching blobs under "/var/cache/blobs".
Trying to pull registry.redhat.io/jboss-eap-8/eap8-openjdk21-runtime-openshift-rhel9@sha256:ed3ae098aca62ce353303c098ed2d43b773d9706f78f5e6c05323850659ab826...
failed to watch file "/var/log/pods/build-images-ads_sihdg-jboss8-2-build_c45e2f43-dd54-46d8-9dd7-20a4cd194db7/sti-build/0.log": no space left on deviceerror: the build build-images-ads/sihdg-jboss8-2 status is "Failed"
##[error]Bash exited with code '1'.
Finishing: Executando Build S2I Binary
