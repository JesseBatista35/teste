2026-08-07T12:28:26.5411212Z ##[section]Starting: Criando o ConfigMap nginx-conf.d
2026-08-07T12:28:26.5415133Z ==============================================================================
2026-08-07T12:28:26.5415269Z Task         : Bash
2026-08-07T12:28:26.5415331Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-07T12:28:26.5415423Z Version      : 3.227.0
2026-08-07T12:28:26.5415502Z Author       : Microsoft Corporation
2026-08-07T12:28:26.5415575Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-07T12:28:26.5415680Z ==============================================================================
2026-08-07T12:28:27.4713043Z Generating script.
2026-08-07T12:28:27.4721394Z Script contents:
2026-08-07T12:28:27.4721947Z oc create configmap nginx-conf-d-sigsj-frontend-11  --from-file="/opt/ads-agent/_work/r11757/a/_SIGSJ-frontend-11-config/sigsj-nginx.conf" -n sigsj-des
2026-08-07T12:28:27.4724463Z ========================== Starting Command Output ===========================
2026-08-07T12:28:27.4731248Z [command]/bin/bash /opt/ads-agent/_work/_temp/6c663d8b-22b2-4e11-a40f-c8453754fd5e.sh
2026-08-07T12:28:27.6280568Z error: error reading /opt/ads-agent/_work/r11757/a/_SIGSJ-frontend-11-config/sigsj-nginx.conf: no such file or directory
2026-08-07T12:28:27.6349424Z ##[error]Bash exited with code '1'.
2026-08-07T12:28:27.6359597Z ##[section]Finishing: Criando o ConfigMap nginx-conf.d



2026-08-07T12:28:27.6493735Z ##[section]Starting: Logs da Aplicação
2026-08-07T12:28:27.6496347Z ==============================================================================
2026-08-07T12:28:27.6496431Z Task         : Bash
2026-08-07T12:28:27.6496469Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-07T12:28:27.6496527Z Version      : 3.227.0
2026-08-07T12:28:27.6496579Z Author       : Microsoft Corporation
2026-08-07T12:28:27.6496635Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-07T12:28:27.6496698Z ==============================================================================
2026-08-07T12:28:28.6641343Z Generating script.
2026-08-07T12:28:28.6651587Z ========================== Starting Command Output ===========================
2026-08-07T12:28:28.6658570Z [command]/bin/bash /opt/ads-agent/_work/_temp/8fe0c0ef-6783-4dbf-aa7f-6d53ca7d23bc.sh
2026-08-07T12:28:28.6706897Z + shopt -s expand_aliases
2026-08-07T12:28:28.6707919Z + [[ -n okd4_nprd ]]
2026-08-07T12:28:28.6708115Z + [[ okd4_nprd =~ ocp ]]
2026-08-07T12:28:28.6708267Z + [[ -n okd4_nprd ]]
2026-08-07T12:28:28.6708385Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-08-07T12:28:28.6708529Z + app=sigsj-frontend-11-des
2026-08-07T12:28:28.6708630Z + oc version
2026-08-07T12:28:28.7997940Z oc v3.11.0+0cbc58b
2026-08-07T12:28:28.7998126Z kubernetes v1.11.0+d4cacc0
2026-08-07T12:28:28.7998393Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-08-07T12:28:28.8095858Z 
2026-08-07T12:28:28.8096287Z Server https://api.nprd.caixa:6443
2026-08-07T12:28:28.8096688Z kubernetes v1.25.0-2824+27e744f55d2e99-dirty
2026-08-07T12:28:28.8131087Z ++ oc get pod -l name=sigsj-frontend-11-des -n sigsj-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-08-07T12:28:28.8131449Z ++ tac
2026-08-07T12:28:28.8132084Z ++ grep -v '^$'
2026-08-07T12:28:28.8132231Z ++ head -n1
2026-08-07T12:28:29.0142491Z + last_pod=
2026-08-07T12:28:29.0164720Z ##[error]Bash exited with code '1'.
2026-08-07T12:28:29.0192358Z ##[section]Finishing: Logs da Aplicação
