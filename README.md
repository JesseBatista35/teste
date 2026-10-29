LOG=/logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log

# Status dos deployments
ls -l /opt/jboss-eap/standalone/deployments/

# Resultado do boot e erros desde 09:58
grep -nE "WFLYSRV0025|WFLYSRV0026|WFLYEE0047|WFLYCTL0412|SIGSJ04|ORA-|Caused by|WFLYUT0021" $LOG | tail -25

# Acompanhar ao vivo (Ctrl+C para sair)
tail -f $LOG
