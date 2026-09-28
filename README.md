systemctl status controlm_agent.service --no-pager | head -15
ps -ef | grep -E "p_ctmag|p_ctmat" | grep -v grep
ss -lntp | grep 7016


su - ctmagelx -c "ag_diag_comm"

