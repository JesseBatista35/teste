LOG=/logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log

# Ver o arquivo inteiro, paginado (q para sair, / para buscar)
less $LOG

# Só o último boot: do último "Iniciando JBoss" até o fim
tac $LOG | sed '/WFLYSRV0049/q' | tac

# Acompanhar ao vivo
tail -f $LOG


# Cópia do log completo no seu home
cp $LOG ~/server_sigsj_intranet_$(date +%Y%m%d_%H%M).log

# Ou só o último boot, num arquivo menor
tac $LOG | sed '/WFLYSRV0049/q' | tac > ~/boot_sigsj_intranet_$(date +%H%M).log
ls -lh ~/*.log

ls -lh /logs/jboss/jboss-eap/standalone/sigsj-intranet/
