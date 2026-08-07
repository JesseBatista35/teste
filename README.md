<img width="1603" height="904" alt="image" src="https://github.com/user-attachments/assets/1534930f-248d-41cc-b9fa-864a50c339cb" />



sim cara ja esta tudo alterado e sim estou criando uma nova release





olha ai release craida agora

o erro contina


2026-08-07T13:09:06.1034465Z ##[section]Starting: Criando o ConfigMap nginx-conf.d
2026-08-07T13:09:06.1039956Z ==============================================================================
2026-08-07T13:09:06.1040112Z Task         : Bash
2026-08-07T13:09:06.1040192Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-07T13:09:06.1040296Z Version      : 3.227.0
2026-08-07T13:09:06.1040580Z Author       : Microsoft Corporation
2026-08-07T13:09:06.1040681Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-07T13:09:06.1040805Z ==============================================================================
2026-08-07T13:09:06.2423181Z Generating script.
2026-08-07T13:09:06.2430327Z Script contents:
2026-08-07T13:09:06.2431169Z oc create configmap nginx-conf-d-sigsj-frontend-11  --from-file="/opt/ads-agent/_work/r956/a/_SIGSJ-frontend-11-config/sigsj-nginx.conf" -n sigsj-des
2026-08-07T13:09:06.2434072Z ========================== Starting Command Output ===========================
2026-08-07T13:09:06.2440847Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/c1ad4fd6-7fe1-4d85-9c3c-5281b1135330.sh
2026-08-07T13:09:06.3076755Z error: error reading /opt/ads-agent/_work/r956/a/_SIGSJ-frontend-11-config/sigsj-nginx.conf: no such file or directory
2026-08-07T13:09:06.3148204Z ##[error]Bash exited with code '1'.
2026-08-07T13:09:06.3157179Z ##[section]Finishing: Criando o ConfigMap nginx-conf.d


2026-08-07T13:09:06.3306771Z ##[section]Starting: Logs da Aplicação
2026-08-07T13:09:06.3310687Z ==============================================================================
2026-08-07T13:09:06.3310772Z Task         : Bash
2026-08-07T13:09:06.3310818Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-07T13:09:06.3310887Z Version      : 3.227.0
2026-08-07T13:09:06.3310937Z Author       : Microsoft Corporation
2026-08-07T13:09:06.3310986Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-07T13:09:06.3311056Z ==============================================================================
2026-08-07T13:09:06.4602620Z Generating script.
2026-08-07T13:09:06.4613602Z ========================== Starting Command Output ===========================
2026-08-07T13:09:06.4620452Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/8e6d48c2-55e2-4255-847c-757d5eb9473c.sh
2026-08-07T13:09:06.4681357Z + shopt -s expand_aliases
2026-08-07T13:09:06.4681557Z + [[ -n okd4_nprd ]]
2026-08-07T13:09:06.4681732Z + [[ okd4_nprd =~ ocp ]]
2026-08-07T13:09:06.4681863Z + [[ -n okd4_nprd ]]
2026-08-07T13:09:06.4681969Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-08-07T13:09:06.4682111Z + app=sigsj-frontend-11-des
2026-08-07T13:09:06.4682212Z + oc version
2026-08-07T13:09:06.5310003Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-08-07T13:09:06.5310324Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-08-07T13:09:06.5310512Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-08-07T13:09:06.5343971Z ++ oc get pod -l name=sigsj-frontend-11-des -n sigsj-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-08-07T13:09:06.5344418Z ++ tac
2026-08-07T13:09:06.5345249Z ++ grep -v '^$'
2026-08-07T13:09:06.5346668Z ++ head -n1
2026-08-07T13:09:06.6127181Z + last_pod=
2026-08-07T13:09:06.6152356Z ##[error]Bash exited with code '1'.
2026-08-07T13:09:06.6186947Z ##[section]Finishing: Logs da Aplicação

<img width="1318" height="782" alt="image" src="https://github.com/user-attachments/assets/7df33ba5-40d9-45e5-8f22-eef12b8d3f20" />
