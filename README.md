P=$(pgrep -f 'Server:sigec-portabilidade-batch_node1_lx104')
LOG=/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade-batch_node1_lx104/server.log

# 3 thread dumps com 10 s de intervalo (mostra se a thread está parada no mesmo ponto)
for i in 1 2 3; do sudo -u jboss jstack -l $P > /tmp/batch-td$i.txt; sleep 10; done

# Quando começou a travar e quais timers estão sendo barrados
grep -n "WFLYEJB0241" $LOG | head -3
grep "WFLYEJB0241" $LOG | grep -oE "info=[A-Z0-9]+" | sort | uniq -c



grep -n "GerenciadorTimersBean\|br.gov.caixa" /tmp/batch-td1.txt | head -30
