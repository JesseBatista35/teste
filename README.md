cp /logs/jboss/jboss-eap/standalone/sigpd-backend/console-stdout.log /tmp/sigpd_threaddump_$(date +%Y%m%d_%H%M).log

# resumo rápido: onde as threads de request estão paradas
grep -A10 '"default task' /tmp/sigpd_threaddump_*.log | grep -E "^\s+at " | sort | uniq -c | sort -rn | head -15


sudo su -
runuser -u jboss -- /usr/java/jdk1.8.0_221/bin/jcmd 8867 GC.class_histogram > /tmp/sigpd_histo.txt; head -30 /tmp/sigpd_histo.txt

systemctl restart jboss-eap-standalone
systemctl status jboss-eap-standalone | head -5
tail -f /logs/jboss/jboss-eap/standalone/sigpd-backend/server.log    # aguarde o "WFLYSRV0025 ... started"

curl -sv -m 10 http://10.116.194.156:8080/sigpd-api/v1/health-check/live
curl -sk -m 10 -o /dev/null -w "%{http_code}\n" https://sigpd-backend.esteiras.des.caixa/sigpd-api/v1/health-check/live
grep -c "Full GC" /logs/jboss/jboss-eap/standalone/sigpd-backend/gc.log*.current
