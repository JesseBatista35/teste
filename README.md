# o nome curto resolve?
getent hosts caddeapllx2501

# outros agentes da esteira estão no /etc/hosts?
grep -iE "caddeapl|agil.nprd" /etc/hosts | head -20

# DNS e search domain usados
cat /etc/resolv.conf

# usuário dono do Control-M/Server
ps -ef | grep -E "p_ctm|ctmsrv" | grep -v grep | head -5
