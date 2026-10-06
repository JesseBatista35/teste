# confirma o import
/opt/ctmage/JRE/bin/keytool -list -keystore $KS -storepass changeit 2>/dev/null | grep -i "ac-interna"

# reinicia o agente para o AI recarregar o Java
/opt/ctmage/ctm/scripts/shut-ag -u ctmagelx -p ALL
/opt/ctmage/ctm/scripts/start-ag -u ctmagelx -p ALL
su - ctmagelx -c "ag_diag_comm" | grep -E "ping"

cat $(ls -t /opt/ctmage/ctm/cm/AI/CustomerLogs/*.xml | head -1) | grep -E "<step>|<operation>|<success>"
