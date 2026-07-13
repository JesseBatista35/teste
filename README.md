find /opt/jboss/jboss-eap -iname "domain.xml" 2>/dev/null
grep -n "OracleSiouvDS" -A 15 /opt/jboss/jboss-eap/hc/configuration/domain.xml

/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.88.20:9990 --command="reload"

