Confira o estado agora no host:

date; ps -ef | grep [j]boss-modules | wc -l
ss -tlnp | grep -E ':8080|:9990'
tail -40 /opt/jboss-eap/standalone/log/server.log
grep -E "WFLYSRV0025|WFLYSRV0010|WFLYSRV0026|WFLYSRV0021|WFLYCTL0013|FATAL" /opt/jboss-eap/standalone/log/server.log | tail -20
systemctl status jboss-eap-standalone --no-pager

Se o processo estiver vivo e a 9990 respondendo:

/opt/jboss-eap/bin/jboss-cli.sh --connect --command="deployment-info"

Como ler o resultado:

Processo vivo, 9990 aberta e log com WFLYSRV0025: o servidor subiu. A etapa Check Deployment só está esperando os deployments, e o que falhar vai aparecer em WFLYSRV0021. O mais provável aqui é o Keycloak.
Processo vivo e log parado sem WFLYSRV0025: travou no boot. Para diagnosticar, rode jstack $(pgrep -f jboss-modules) | head -80 e me mande a saída.
Processo morto: o systemctl status e o journalctl -u jboss-eap-standalone | tail -40 dizem como saiu.

Me mande o resultado e o status da release.
