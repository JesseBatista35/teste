watch -n 60 'stat -c "%U:%G %a %y" /sigdb/sigdb/TRANSMITE'


ausearch -f /sigdb/sigdb/TRANSMITE 2>/dev/null | tail -50
# ou, se auditd não tiver essa trilha configurada:
systemctl status auditd


