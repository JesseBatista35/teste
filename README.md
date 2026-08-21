# Ver se a permissão mudou
stat -c "%U:%G %a %y" /sigdb/sigdb/TRANSMITE

# Ver o evento de auditoria, se algo mexeu
ausearch -k transmite_watch --start recent | tail -50
