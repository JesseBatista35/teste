# Porta que o HC da 104 usa para falar com o DC
grep -iE 'remote|master' /opt/jboss/jboss-eap/hc/configuration/host-slave.xml
ss -tnp | grep 10.116.89.0

# Se for 9999 (protocolo nativo):
/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=remote://10.116.89.0:9999
# Se for outra porta HTTP (ex.: 9990 + offset):
/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:<PORTA>

systemctl restart jboss-eap7_hc

grep -E "WFLYSRV0025|WFLYSRV0026" /opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade-batch_node1_lx104/server.log | tail -2
