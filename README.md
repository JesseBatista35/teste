ps -ef | grep p_ctmag | grep -v grep
grep -E "CTMSHOST|CTMPERMHOSTS" /opt/ctmage/ctm/data/CONFIG.dat
cat /etc/hosts
su - ctmagelx -c "ag_diag_comm" | grep -iE "server host|port|ping"


