LOG=/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade-batch_node1_lx104/server.log
D=$(dirname $LOG)

# 1. Qual é a exceção que se repete
grep -h "Caused by" $LOG | sort | uniq -c | sort -rn | head -15
grep -E " ERROR " $LOG | cut -c24- | cut -c1-200 | sort | uniq -c | sort -rn | head -15
sed -n '735,775p' $LOG

# 2. O que aconteceu no deploy das 13:48 (undeploy/deploy/stop)
grep -nE "WFLYSRV0027|WFLYSRV0028|WFLYSRV0009|WFLYSRV0010|WFLYSRV0016|WFLYSRV0013|WFLYCTL|stopped" $D/server.log.2 $D/server.log.1 | head -60

# 3. Crescimento das conexões (rodar agora e de novo em ~10 min)
date; ss -tnp | grep "pid=72951" | grep -cE "10.252.32.6[35]:80"
ss -tnp | grep "pid=72951" | awk '{print $4}' | sort | uniq -c | sort -rn | head


No DC (sbrdeapllx069), o log do Host Controller e do domain mostra quem fez o deploy das 13:48 e se houve tentativas falhas depois:

grep -nE "deploy|WFLYDC|WFLYCTL|SIGEC-PORTABILIDADE-BATCH" /opt/jboss/jboss-eap/domain/log/host-controller.log | tail -40
