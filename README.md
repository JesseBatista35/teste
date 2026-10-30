grep -E "CTMSHOST|CTMPERMHOSTS|AGENT_TO_SERVER_PORT|SERVER_TO_AGENT_PORT" ~/ctm/data/CONFIG.dat
getent hosts crjdeaprlx038 crjdeaprlx039
grep -i crjdeaprlx /etc/hosts
ag_diag_comm | grep -iE "server host|port|ping"
