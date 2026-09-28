# 1. Config do agente
grep -E "CTMSHOST|CTMPERMHOSTS|AGCMNDATA|ATCMNDATA|LOGICAL_AGENT_NAME" /opt/ctmage/ctm/data/CONFIG.dat

# 2. Processos e porta
ps -ef | grep -E "p_ctmag|p_ctmat" | grep -v grep
ss -lntp | grep -E "18008|7016"

# 3. hosts e /producao (o backup pode ter voltado os arquivos)
cat /etc/hosts
ls -lrt /producao /producao/configuration

# 4. Diagnóstico completo (não dar Ctrl+C)
su - ctmagelx -c "ag_diag_comm"
