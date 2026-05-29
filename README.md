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
/bin/bash /opt/ads-agent/_work/_temp/6bb3e94a-26c0-411e-a052-ee87143e9465.sh
+ echo ocp_nprd
+ egrep -q '^(okd4|ocp)'
+ buildconfig=sispi-backend
+ DOTNET_ASSEMBLY=
/opt/ads-agent/_work/_temp/6bb3e94a-26c0-411e-a052-ee87143e9465.sh: line 12:  -4: expressão de substring < 0
+ cd /opt/ads-agent/_work/10311/a
+ FILES=(`find -maxdepth 1 -name "*.runtimeconfig*.json"`)
++ find -maxdepth 1 -name '*.runtimeconfig*.json'
+ '[' -d /opt/ads-agent/_work/10311/s/target/server ']'
+ oc start-build sispi-backend --from-dir=/opt/ads-agent/_work/10311/a --follow --wait=true -n build-images-ads -v=5
I0529 15:10:24.094358   92847 repository.go:424] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
I0529 15:10:24.096063   92847 repository.go:484] Error executing command: exit status 128
Uploading directory "/opt/ads-agent/_work/10311/a" as binary input for the build ...
I0529 15:10:24.096176   92847 tar.go:217] Adding "/opt/ads-agent/_work/10311/a" to tar ...
I0529 15:10:24.096476   92847 tar.go:312] Adding to tar: /opt/ads-agent/_work/10311/a/cli-offline.sh as cli-offline.sh
I0529 15:10:24.096979   92847 tar.go:312] Adding to tar: /opt/ads-agent/_work/10311/a/jboss-deployments as jboss-deployments
I0529 15:10:24.097175   92847 tar.go:312] Adding to tar: /opt/ads-agent/_work/10311/a/jboss-modules as jboss-modules
I0529 15:10:24.097277   92847 tar.go:312] Adding to tar: /opt/ads-agent/_work/10311/a/sispi-backend.ear as sispi-backend.ear
............
Uploading finished
I0529 15:11:24.137565   92847 helpers.go:219] Connection error: Post https://api.produtos4.caixa:6443/apis/build.openshift.io/v1/namespaces/build-images-ads/buildconfigs/sispi-backend/instantiatebinary?name=sispi-backend&namespace=build-images-ads: unexpected EOF
F0529 15:11:24.137582   92847 helpers.go:119] Unable to connect to the server: unexpected EOF
##[error]Bash exited with code '255'.
##[warning]RetryHelper encountered task failure, will retry (attempt #: 1 out of 1) after 1000 ms
Generating script.
========================== Starting Command Output ===========================
/bin/bash /opt/ads-agent/_work/_temp/2067df8a-1a53-4d0a-933e-901c470ea905.sh
+ echo ocp_nprd
+ egrep -q '^(okd4|ocp)'
+ buildconfig=sispi-backend
+ DOTNET_ASSEMBLY=
/opt/ads-agent/_work/_temp/2067df8a-1a53-4d0a-933e-901c470ea905.sh: line 12:  -4: expressão de substring < 0
+ cd /opt/ads-agent/_work/10311/a
+ FILES=(`find -maxdepth 1 -name "*.runtimeconfig*.json"`)
++ find -maxdepth 1 -name '*.runtimeconfig*.json'
+ '[' -d /opt/ads-agent/_work/10311/s/target/server ']'
+ oc start-build sispi-backend --from-dir=/opt/ads-agent/_work/10311/a --follow --wait=true -n build-images-ads -v=5
I0529 15:11:25.355372   92937 repository.go:424] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
I0529 15:11:25.356863   92937 repository.go:484] Error executing command: exit status 128
Uploading directory "/opt/ads-agent/_work/10311/a" as binary input for the build ...
I0529 15:11:25.356950   92937 tar.go:217] Adding "/opt/ads-agent/_work/10311/a" to tar ...
I0529 15:11:25.357147   92937 tar.go:312] Adding to tar: /opt/ads-agent/_work/10311/a/cli-offline.sh as cli-offline.sh
I0529 15:11:25.357541   92937 tar.go:312] Adding to tar: /opt/ads-agent/_work/10311/a/jboss-deployments as jboss-deployments
I0529 15:11:25.357689   92937 tar.go:312] Adding to tar: /opt/ads-agent/_work/10311/a/jboss-modules as jboss-modules
I0529 15:11:25.357760   92937 tar.go:312] Adding to tar: /opt/ads-agent/_work/10311/a/sispi-backend.ear as sispi-backend.ear
............
Uploading finished
I0529 15:12:25.394468   92937 helpers.go:219] Connection error: Post https://api.produtos4.caixa:6443/apis/build.openshift.io/v1/namespaces/build-images-ads/buildconfigs/sispi-backend/instantiatebinary?name=sispi-backend&namespace=build-images-ads: unexpected EOF
F0529 15:12:25.394484   92937 helpers.go:119] Unable to connect to the server: unexpected EOF
##[error]Bash exited with code '255'.
Finishing: Executando Build S2I Binary
