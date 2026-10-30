sudo su - ctmagelx

# serviço/processos do agente de pé
ps -ef | grep -E "p_ctm|ctmag" | grep -v grep

# para qual servidor o agente aponta e quais portas usa
grep -E "CTMSHOST|CTMPERMHOSTS|AGENT_TO_SERVER_PORT|SERVER_TO_AGENT_PORT" ~/ctm/data/CONFIG.dat

# teste de comunicação agente -> servidor
ag_diag_comm

