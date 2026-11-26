2026-11-26T20:11:16.8352331Z ##[section]Starting: Criando o ConfigMap nginx-conf.d
2026-11-26T20:11:16.8358117Z ==============================================================================
2026-11-26T20:11:16.8358385Z Task         : Bash
2026-11-26T20:11:16.8358452Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-26T20:11:16.8358515Z Version      : 3.227.0
2026-11-26T20:11:16.8358579Z Author       : Microsoft Corporation
2026-11-26T20:11:16.8358640Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-26T20:11:16.8358735Z ==============================================================================
2026-11-26T20:11:16.9753785Z Generating script.
2026-11-26T20:11:16.9763570Z Script contents:
2026-11-26T20:11:16.9764132Z oc create configmap nginx-conf-d-sidsc-storybook-v22  --from-file="/opt/ads-agent/_work/r500/a/_SIDSC-storybook-v22-config/sidsc-nginx.conf" -n sidsc-des
2026-11-26T20:11:16.9768584Z ========================== Starting Command Output ===========================
2026-11-26T20:11:16.9779443Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/73cdb32e-6d0f-4cca-96c0-17cfbc785c5a.sh
2026-11-26T20:11:17.0352078Z error: error reading /opt/ads-agent/_work/r500/a/_SIDSC-storybook-v22-config/sidsc-nginx.conf: no such file or directory
2026-11-26T20:11:17.0412634Z ##[error]Bash exited with code '1'.
2026-11-26T20:11:17.0447351Z ##[section]Finishing: Criando o ConfigMap nginx-conf.d



esse é da 22 ta dono esse pau


location /api/ {
    client_max_body_size 10M;
    proxy_set_header X-Forwarded-Host $host;
    proxy_set_header X-Forwarded-Server $host;
    proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
    proxy_pass __HTTP_SERVICE_API__; 
    proxy_redirect off;
    server_tokens off;
}
