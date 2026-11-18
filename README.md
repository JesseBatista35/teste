cd /opt/jboss-eap/standalone/deployments
ls -l gec-ear.ear
unzip -p gec-ear.ear gec-web.war > /tmp/gw.war
echo "=== poi no war ==="; unzip -l /tmp/gw.war | grep -i "poi\|xmlbeans\|commons-compress"
echo "=== causas no .failed ==="
grep -o "was not found: [A-Za-z0-9_.]*" gec-ear.ear.failed | sort | uniq -c
grep -o "Unsatisfied dependencies for type [A-Za-z0-9_.]*" gec-ear.ear.failed | sort | uniq -c
