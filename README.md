ls -la /producao/env_config.sh /producao/executa-job.sh

cat $(ls -t /opt/ctmage/ctm/cm/AI/CustomerLogs/*.xml | head -1) | grep -E "<time>|<step>|<success>"
