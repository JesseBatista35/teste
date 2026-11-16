# 1. Config atual e IP do servidor
grep -E "^(CTMSHOST|CTMPERMHOSTS|ATCMNDATA|AGCMNDATA)" /opt/ctmage/ctm/data/CONFIG.dat
getent hosts cxextrlx038

# 2. Firewall local da VM (RHEL 9) — pode estar barrando a 7016 de entrada
firewall-cmd --state && firewall-cmd --list-all
iptables -S | grep -E "7016|REJECT|DROP"

# 3. Log do agente de hoje, procurando rejeição/permissão
tail -50 /opt/ctmage/ctm/dailylog/daily_ctmag_20261116.log
grep -iE "reject|denied|permit|authoriz" /opt/ctmage/ctm/dailylog/daily_ctmag_2026111*.log | tail -20

# 4. Captura enquanto o Iury força o job de novo
tcpdump -nn -i any tcp port 7016
