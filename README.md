# GC (nome real do arquivo rotacionado)
ls -la /logs/jboss/jboss-eap/standalone/sigpd-backend/
tail -n 40 /logs/jboss/jboss-eap/standalone/sigpd-backend/gc.log*.current
grep -c "Full GC" /logs/jboss/jboss-eap/standalone/sigpd-backend/gc.log*

# Uso de heap agora (O = old gen; FGC/FGCT subindo = thrash)
sudo -u jboss jstat -gcutil 8867 2000 5

# Thread dump (2 dumps com intervalo, para ver se as threads estão paradas no mesmo ponto)
sudo -u jboss jstack -l 8867 > /tmp/sigpd_td1_$(date +%H%M%S).txt
sleep 15
sudo -u jboss jstack -l 8867 > /tmp/sigpd_td2_$(date +%H%M%S).txt
#   sem jstack/sudo: kill -3 8867 (sai no console.log do JBoss)

# Onde as threads estão presas
grep -A12 '"default task' /tmp/sigpd_td1_*.txt | grep -E "^\s+at " | sort | uniq -c | sort -rn | head -20
grep -c 'BLOCKED' /tmp/sigpd_td1_*.txt

# Confirmar estado no mod_cluster (sem filtrar)
curl -s -m 10 http://caddeapllx135.extra.caixa.gov.br:6666/mod_cluster_manager | head -40
