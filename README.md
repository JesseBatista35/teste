Ao realizar nova pipeline está dando erro no job:

Executando Build S2I Binary

I0904 11:50:17.014850  335839 helpers.go:237] Connection error: Post https://api.produtos4.caixa:6443/apis/build.openshift.io/v1/namespaces/build-images-ads/buildconfigs/sibec-estatico/instantiatebinary?name=sibec-estatico&namespace=build-images-ads: unexpected EOF
Unable to connect to the server: unexpected EOF
##[error]Bash exited with code '1'.


2026-09-04T15:03:08.8400130Z ##[section]Starting: Executando Build S2I Binary
2026-09-04T15:03:08.8404333Z ==============================================================================
2026-09-04T15:03:08.8404426Z Task         : Bash
2026-09-04T15:03:08.8404473Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-04T15:03:08.8404546Z Version      : 3.227.0
2026-09-04T15:03:08.8404599Z Author       : Microsoft Corporation
2026-09-04T15:03:08.8404653Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-04T15:03:08.8404731Z ==============================================================================
2026-09-04T15:03:08.9690821Z Generating script.
2026-09-04T15:03:08.9703177Z ========================== Starting Command Output ===========================
2026-09-04T15:03:08.9711123Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/22b8d6b3-1f0e-418d-9808-40d80749a422.sh
2026-09-04T15:03:08.9765662Z + echo okd4_nprd
2026-09-04T15:03:08.9767148Z + egrep -q '^(okd4|ocp)'
2026-09-04T15:03:08.9805715Z + buildconfig=sibec-estatico
2026-09-04T15:03:08.9806967Z + oc start-build sibec-estatico --from-dir=/opt/ads-agent/_work/1/a --follow --wait=true -n build-images-ads -v=5
2026-09-04T15:03:09.0547090Z I0904 12:03:09.054314    1662 repository.go:450] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
2026-09-04T15:03:09.0565739Z I0904 12:03:09.056441    1662 repository.go:533] Error executing command: exit status 128
2026-09-04T15:03:09.0567292Z Uploading directory "/opt/ads-agent/_work/1/a" as binary input for the build ...
2026-09-04T15:03:09.0567676Z I0904 12:03:09.056553    1662 tar.go:238] Adding "/opt/ads-agent/_work/1/a" to tar ...
2026-09-04T15:03:09.0569796Z I0904 12:03:09.056890    1662 tar.go:336] Adding to tar: /opt/ads-agent/_work/1/a/.s2i as .s2i
2026-09-04T15:03:09.0574009Z I0904 12:03:09.057295    1662 tar.go:336] Adding to tar: /opt/ads-agent/_work/1/a/.s2i/bin as .s2i/bin
2026-09-04T15:03:09.0575037Z I0904 12:03:09.057424    1662 tar.go:336] Adding to tar: /opt/ads-agent/_work/1/a/.s2i/bin/assemble as .s2i/bin/assemble
2026-09-04T15:03:09.0576272Z I0904 12:03:09.057543    1662 tar.go:336] Adding to tar: /opt/ads-agent/_work/1/a/.s2i/bin/run as .s2i/bin/run
2026-09-04T15:03:09.0577106Z I0904 12:03:09.057640    1662 tar.go:336] Adding to tar: /opt/ads-agent/_work/1/a/sibec-estatico.zip as sibec-estatico.zip
2026-09-04T15:04:09.0746224Z ............
2026-09-04T15:04:09.0755167Z Uploading finished
2026-09-04T15:04:09.0757942Z I0904 12:04:09.074390    1662 helpers.go:237] Connection error: Post https://api.produtos4.caixa:6443/apis/build.openshift.io/v1/namespaces/build-images-ads/buildconfigs/sibec-estatico/instantiatebinary?name=sibec-estatico&namespace=build-images-ads: unexpected EOF
2026-09-04T15:04:09.0758305Z Unable to connect to the server: unexpected EOF
2026-09-04T15:04:09.0847626Z ##[error]Bash exited with code '1'.
2026-09-04T15:04:09.5204092Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 1 out of 1) after 1000 ms
2026-09-04T15:04:12.0716950Z Generating script.
2026-09-04T15:04:12.0766498Z ========================== Starting Command Output ===========================
2026-09-04T15:04:12.0767962Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/70e12dd7-8fa5-4ef6-987e-0c9e37a4af88.sh
2026-09-04T15:04:12.0794508Z + echo okd4_nprd
2026-09-04T15:04:12.0796323Z + egrep -q '^(okd4|ocp)'
2026-09-04T15:04:12.0828501Z + buildconfig=sibec-estatico
2026-09-04T15:04:12.0833692Z + oc start-build sibec-estatico --from-dir=/opt/ads-agent/_work/1/a --follow --wait=true -n build-images-ads -v=5
2026-09-04T15:04:12.1528825Z I0904 12:04:12.152435    1712 repository.go:450] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
2026-09-04T15:04:12.1546281Z I0904 12:04:12.154503    1712 repository.go:533] Error executing command: exit status 128
2026-09-04T15:04:12.1547174Z Uploading directory "/opt/ads-agent/_work/1/a" as binary input for the build ...
2026-09-04T15:04:12.1547590Z I0904 12:04:12.154629    1712 tar.go:238] Adding "/opt/ads-agent/_work/1/a" to tar ...
2026-09-04T15:04:12.1550196Z I0904 12:04:12.154904    1712 tar.go:336] Adding to tar: /opt/ads-agent/_work/1/a/.s2i as .s2i
2026-09-04T15:04:12.1554337Z I0904 12:04:12.155320    1712 tar.go:336] Adding to tar: /opt/ads-agent/_work/1/a/.s2i/bin as .s2i/bin
2026-09-04T15:04:12.1555379Z I0904 12:04:12.155450    1712 tar.go:336] Adding to tar: /opt/ads-agent/_work/1/a/.s2i/bin/assemble as .s2i/bin/assemble
2026-09-04T15:04:12.1556471Z I0904 12:04:12.155551    1712 tar.go:336] Adding to tar: /opt/ads-agent/_work/1/a/.s2i/bin/run as .s2i/bin/run
2026-09-04T15:04:12.1557403Z I0904 12:04:12.155663    1712 tar.go:336] Adding to tar: /opt/ads-agent/_work/1/a/sibec-estatico.zip as sibec-estatico.zip
2026-09-04T15:05:12.1730537Z ............
2026-09-04T15:05:12.1733992Z Uploading finished
2026-09-04T15:05:12.1764421Z I0904 12:05:12.169092    1712 helpers.go:237] Connection error: Post https://api.produtos4.caixa:6443/apis/build.openshift.io/v1/namespaces/build-images-ads/buildconfigs/sibec-estatico/instantiatebinary?name=sibec-estatico&namespace=build-images-ads: unexpected EOF
2026-09-04T15:05:12.1764837Z Unable to connect to the server: unexpected EOF
2026-09-04T15:05:12.1792334Z ##[error]Bash exited with code '1'.
2026-09-04T15:05:12.1821480Z ##[section]Finishing: Executando Build S2I Binary
