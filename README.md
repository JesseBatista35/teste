LOG=/logs/jboss/jboss-eap/standalone/sigec-portabilidade-batch/server.log

# 1) o boot terminou? e como ficaram os deployments?
grep -E "WFLYSRV0025|WFLYSRV0026|WFLYSRV0010|WFLYSRV0021|WFLYSRV0056" $LOG | tail -15
ls -l /opt/jboss-eap/standalone/deployments/

# 2) erros do boot
grep -n -E " ERROR | FATAL |Caused by|WELD-|ClassNotFound|NoClassDefFound" $LOG | tail -60

# 3) separar só o boot de agora num arquivo para mandar
N=$(grep -n "WFLYSRV0049" $LOG | tail -1 | cut -d: -f1)
tail -n +$N $LOG > /tmp/batch-boot-17h12.log
wc -l /tmp/batch-boot-17h12.log
