cat /etc/redhat-release
which mail mailx 2>&1
ls -l /bin/mail /usr/bin/mailx 2>&1
rpm -q mailx s-nail 2>&1


# Qual MTA está instalado
rpm -q postfix sendmail 2>&1
alternatives --display mta 2>/dev/null | head -3

# Serviço rodando? (RHEL 6 / RHEL 7+)
service postfix status 2>&1; service sendmail status 2>&1
systemctl is-active postfix sendmail 2>/dev/null

# Escutando na 25 local?
ss -ltn 2>/dev/null | grep ':25 ' || netstat -ltn | grep ':25 '

# Relay configurado
postconf -n 2>/dev/null | egrep 'relayhost|myhostname|mydomain|inet_interfaces|myorigin'
grep -E '^DS|^define\(.SMART_HOST' /etc/mail/sendmail.cf /etc/mail/sendmail.mc 2>/dev/null

# mailx configurado para SMTP externo (sem MTA local)
egrep -i 'smtp|from' /etc/mail.rc ~/.mailrc 2>/dev/null

# Fila presa
mailq 2>&1 | tail -5


timeout 5 bash -c '</dev/tcp/NOME_DO_RELAY/25' && echo "relay OK" || echo "relay SEM ACESSO"


echo "Teste de envio $(hostname) $(date)" | mailx -s "Teste mailx $(hostname)" cesoa140@caixa.gov.br
sudo tail -20 /var/log/maillog   # precisa de root; mostra se o relay aceitou (status=sent) ou recusou

lslpp -l | grep -i -E 'mail|sendmail'
lssrc -s sendmail
grep '^DS' /etc/mail/sendmail.cf
mailq
