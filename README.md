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
/usr/bin/bash /opt/ads-agent/_work/_temp/b3b7fad8-c8ee-4f1a-ae52-ef3280244b48.sh
+ echo okd4_nprd
+ egrep -q '^(okd4|ocp)'
+ buildconfig=sifap-front-v2
+ oc start-build sifap-front-v2 --from-dir=/opt/ads-agent/_work/26/a --follow --wait=true -n build-images-ads -v=5
I0720 09:08:22.312917  241333 repository.go:450] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
I0720 09:08:22.315185  241333 repository.go:533] Error executing command: exit status 128
Uploading directory "/opt/ads-agent/_work/26/a" as binary input for the build ...
I0720 09:08:22.315373  241333 tar.go:238] Adding "/opt/ads-agent/_work/26/a" to tar ...
I0720 09:08:22.315716  241333 tar.go:336] Adding to tar: /opt/ads-agent/_work/26/a/.s2i as .s2i
I0720 09:08:22.316165  241333 tar.go:336] Adding to tar: /opt/ads-agent/_work/26/a/.s2i/bin as .s2i/bin
I0720 09:08:22.316308  241333 tar.go:336] Adding to tar: /opt/ads-agent/_work/26/a/.s2i/bin/assemble as .s2i/bin/assemble
I0720 09:08:22.316405  241333 tar.go:336] Adding to tar: /opt/ads-agent/_work/26/a/.s2i/bin/run as .s2i/bin/run
I0720 09:08:22.316524  241333 tar.go:336] Adding to tar: /opt/ads-agent/_work/26/a/sifap-front-v2.zip as sifap-front-v2.zip
.......................
Uploading finished
I0720 09:10:22.277328  241333 helpers.go:237] Connection error: Post https://api.produtos4.caixa:6443/apis/build.openshift.io/v1/namespaces/build-images-ads/buildconfigs/sifap-front-v2/instantiatebinary?name=sifap-front-v2&namespace=build-images-ads: unexpected EOF
Unable to connect to the server: unexpected EOF
##[error]Bash exited with code '1'.
##[warning]RetryHelper encountered task failure, will retry (attempt #: 1 out of 1) after 1000 ms
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/c26a6256-8ba5-4865-9a0f-799cf3ca3eca.sh
+ echo okd4_nprd
+ egrep -q '^(okd4|ocp)'
+ buildconfig=sifap-front-v2
+ oc start-build sifap-front-v2 --from-dir=/opt/ads-agent/_work/26/a --follow --wait=true -n build-images-ads -v=5
I0720 09:10:23.470827  241372 repository.go:450] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
I0720 09:10:23.473811  241372 repository.go:533] Error executing command: exit status 128
Uploading directory "/opt/ads-agent/_work/26/a" as binary input for the build ...
