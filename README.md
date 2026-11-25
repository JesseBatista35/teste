LOG=/logs/jboss/jboss-eap/standalone/sigec-portabilidade-batch/server.log
N=$(grep -n "WFLYSRV0049" $LOG | tail -1 | cut -d: -f1)
M=$(grep -n "WFLYSRV0026" $LOG | tail -1 | cut -d: -f1)
sed -n "${N},${M}p" $LOG > /tmp/batch-boot.log
cp /opt/jboss-eap/standalone/deployments/gec-ear.ear.failed /tmp/batch-gec-ear.failed.txt
chmod 644 /tmp/batch-*
ls -l /tmp/batch-*
