cd /opt/jboss-eap/standalone/deployments
ls -l gec-ear.ear*
echo "=== arqref no war ==="
unzip -l gec-ear.ear | grep "gec-web.war"
unzip -p gec-ear.ear gec-web.war > /tmp/gw.war
unzip -l /tmp/gw.war | grep -i "arqref"

echo "=== causa no .failed ==="
head -c 3000 gec-ear.ear.failed

echo "=== log da subida das 09:53 ==="
L=/logs/jboss/jboss-eap/standalone/sigec-portabilidade/server.log
grep -n "09:5[3-9].*\(WFLYCTL0013\|WFLYSRV0153\|Caused by\|ClassNotFound\|NoClassDef\)" $L | head -20
