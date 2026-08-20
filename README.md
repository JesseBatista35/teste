grep -n -A20 -B5 "11:53:" /logs/jboss/jboss-eap/standalone/siatd-intranet-vm/console-stdout.log

ls -la /opt/jboss-eap/standalone/deployments/ | grep -E "failed|isdeploying|deployed"

cat /opt/jboss-eap/standalone/deployments/siatdEAR.ear.failed 2>/dev/null

grep -n -B5 -A5 "11:53:5" /logs/jboss/jboss-eap/standalone/siatd-intranet-vm/audit.log

grep -n -i "metaspace\|OutOfMemory" /logs/jboss/jboss-eap/standalone/siatd-intranet-vm/*.log
