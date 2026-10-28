# 1) Status dos deployments (marcadores)
ls -l /opt/jboss-eap/standalone/deployments/

# 2) Erros desde o start das 16:05
LOG=/logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log
grep -nE "ERROR|WFLYCTL0412|WFLYCTL0180|WFLYSRV0153|ClassNotFound|NoClassDefFound|DuplicateService|Caused by" $LOG | awk -F: '$1>0' | tail -40

# 3) Quais deployments subiram e quais falharam
grep -nE "WFLYSRV0010|WFLYSRV0026|WFLYSRV0025|foi implantado|falhou" $LOG | tail -10

