L=/logs/jboss/jboss-eap/standalone/sigpd-backend
grep -c "TrilhaAuditoria é NULL" $L/server.log
grep -o "idsVencidos=\[[0-9]*\]" $L/server.log | sort | uniq -c
grep -c "TrilhaAuditoria é NULL" $L/server.log.2026-10-17.1     # confirma que já ocorria antes
grep "Heap:" $L/gc.log.*.current | tail -3                       # repita em ~30 min p/ ver se o heap sobe
