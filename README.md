auditctl -w /sigdb/sigdb/TRANSMITE -p wa -k transmite_watch

echo "-w /sigdb/sigdb/TRANSMITE -p wa -k transmite_watch" >> /etc/audit/rules.d/audit.rules
augenrules --load

auditctl -l | grep transmite_watch

ausearch -k transmite_watch | tail -50

