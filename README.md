2026-09-16T12:15:42.7005154Z ##[section]Starting: Executando Build S2I Binary
2026-09-16T12:15:42.7009988Z ==============================================================================
2026-09-16T12:15:42.7010128Z Task         : Bash
2026-09-16T12:15:42.7010186Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-16T12:15:42.7010287Z Version      : 3.227.0
2026-09-16T12:15:42.7010350Z Author       : Microsoft Corporation
2026-09-16T12:15:42.7010405Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-16T12:15:42.7010487Z ==============================================================================
2026-09-16T12:15:42.8547567Z Generating script.
2026-09-16T12:15:42.8560839Z ========================== Starting Command Output ===========================
2026-09-16T12:15:42.8567757Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/5b1f6eda-3386-4c94-b166-1a702cc61965.sh
2026-09-16T12:15:42.8623141Z + set -o errexit
2026-09-16T12:15:42.8623480Z + set -o pipefail
2026-09-16T12:15:42.8625135Z + echo okd4_nprd
2026-09-16T12:15:42.8625303Z + egrep -q '^(okd4|ocp)'
2026-09-16T12:15:42.8659329Z + buildconfig=siifx-api-aplicacao
2026-09-16T12:15:42.8659921Z + oc start-build siifx-api-aplicacao --from-dir=/opt/ads-agent/_work/33/a --follow --wait=true -n build-images-ads -v=5
2026-09-16T12:15:42.9325834Z I0916 09:15:42.932057   66874 repository.go:450] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
2026-09-16T12:15:42.9395993Z I0916 09:15:42.934237   66874 repository.go:533] Error executing command: exit status 128
2026-09-16T12:15:42.9396607Z Uploading directory "/opt/ads-agent/_work/33/a" as binary input for the build ...
2026-09-16T12:15:42.9396865Z I0916 09:15:42.934389   66874 tar.go:238] Adding "/opt/ads-agent/_work/33/a" to tar ...
2026-09-16T12:15:42.9397152Z I0916 09:15:42.934673   66874 tar.go:336] Adding to tar: /opt/ads-agent/_work/33/a/app as app
2026-09-16T12:15:42.9397492Z I0916 09:15:42.934926   66874 tar.go:336] Adding to tar: /opt/ads-agent/_work/33/a/app/siifx-api-aplicacao-1.77.4.4.jar as app/siifx-api-aplicacao-1.77.4.4.jar
2026-09-16T12:16:42.9522324Z ............
2026-09-16T12:16:42.9522515Z Uploading finished
2026-09-16T12:16:42.9523191Z I0916 09:16:42.951734   66874 helpers.go:237] Connection error: Post https://api.produtos4.caixa:6443/apis/build.openshift.io/v1/namespaces/build-images-ads/buildconfigs/siifx-api-aplicacao/instantiatebinary?name=siifx-api-aplicacao&namespace=build-images-ads: unexpected EOF
2026-09-16T12:16:42.9523521Z Unable to connect to the server: unexpected EOF
2026-09-16T12:16:42.9609449Z ##[error]Bash exited with code '1'.
2026-09-16T12:16:42.9629683Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 1 out of 1) after 1000 ms
2026-09-16T12:16:44.0500310Z Generating script.
2026-09-16T12:16:44.0512590Z ========================== Starting Command Output ===========================
2026-09-16T12:16:44.0520426Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/9533bf46-4727-4526-a7f5-20317af506dd.sh
2026-09-16T12:16:44.0570985Z + set -o errexit
2026-09-16T12:16:44.0571178Z + set -o pipefail
2026-09-16T12:16:44.0573006Z + echo okd4_nprd
2026-09-16T12:16:44.0574436Z + egrep -q '^(okd4|ocp)'
2026-09-16T12:16:44.0620732Z + buildconfig=siifx-api-aplicacao
2026-09-16T12:16:44.0621379Z + oc start-build siifx-api-aplicacao --from-dir=/opt/ads-agent/_work/33/a --follow --wait=true -n build-images-ads -v=5
2026-09-16T12:16:44.1602909Z I0916 09:16:44.159779   66910 repository.go:450] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
2026-09-16T12:16:44.1622534Z I0916 09:16:44.162020   66910 repository.go:533] Error executing command: exit status 128
2026-09-16T12:16:44.1623465Z Uploading directory "/opt/ads-agent/_work/33/a" as binary input for the build ...
2026-09-16T12:16:44.1623923Z I0916 09:16:44.162177   66910 tar.go:238] Adding "/opt/ads-agent/_work/33/a" to tar ...
2026-09-16T12:16:44.1625780Z I0916 09:16:44.162463   66910 tar.go:336] Adding to tar: /opt/ads-agent/_work/33/a/app as app
2026-09-16T12:16:44.1630858Z I0916 09:16:44.162956   66910 tar.go:336] Adding to tar: /opt/ads-agent/_work/33/a/app/siifx-api-aplicacao-1.77.4.4.jar as app/siifx-api-aplicacao-1.77.4.4.jar
2026-09-16T12:17:44.1782875Z ............
2026-09-16T12:17:44.1783084Z Uploading finished
2026-09-16T12:17:44.1788221Z I0916 09:17:44.177931   66910 helpers.go:237] Connection error: Post https://api.produtos4.caixa:6443/apis/build.openshift.io/v1/namespaces/build-images-ads/buildconfigs/siifx-api-aplicacao/instantiatebinary?name=siifx-api-aplicacao&namespace=build-images-ads: unexpected EOF
2026-09-16T12:17:44.1788527Z Unable to connect to the server: unexpected EOF
2026-09-16T12:17:44.1919348Z ##[error]Bash exited with code '1'.
2026-09-16T12:17:44.1921512Z ##[section]Finishing: Executando Build S2I Binary
