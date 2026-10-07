4/modules-caixa -jaxpmodule javax.xml.jaxp-provider org.jboss.as.server
[p585600@cspibapllx017 ~]$ cat /etc/redhat-release
Red Hat Enterprise Linux Server release 6.8 (Santiago)
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$ which mail mailx 2>&1
/bin/mail
/bin/mailx
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$ ls -l /bin/mail /usr/bin/mailx 2>&1
ls: cannot access /usr/bin/mailx: No such file or directory
lrwxrwxrwx 1 root root 22 2016-06-09 13:16 /bin/mail -> /etc/alternatives/mail
[p585600@cspibapllx017 ~]$ rpm -q mailx s-nail 2>&1
mailx-12.4-8.el6_6.x86_64
package s-nail is not installed
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$ rpm -q postfix sendmail 2>&1
postfix-2.6.6-6.el6_7.1.x86_64
package sendmail is not installed
[p585600@cspibapllx017 ~]$ alternatives --display mta 2>/dev/null | head -3
mta - status is auto.
 link currently points to /usr/sbin/sendmail.postfix
/usr/sbin/sendmail.postfix - priority 30
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$ service postfix status 2>&1; service sendmail status 2>&1
master is stopped
sendmail: unrecognized service
[p585600@cspibapllx017 ~]$ systemctl is-active postfix sendmail 2>/dev/null
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$ ss -ltn 2>/dev/null | grep ':25 ' || netstat -ltn | grep ':25 '
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$ postconf -n 2>/dev/null | egrep 'relayhost|myhostname|mydomain|inet_interfaces|myorigin'
inet_interfaces = localhost
mydestination = $myhostname, localhost.$mydomain, localhost
[p585600@cspibapllx017 ~]$ grep -E '^DS|^define\(.SMART_HOST' /etc/mail/sendmail.cf /etc/mail/sendmail.mc 2>/dev/null
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$ egrep -i 'smtp|from' /etc/mail.rc ~/.mailrc 2>/dev/null
/etc/mail.rc:fwdretain subject date from to
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$ mailq 2>&1 | tail -5
postqueue: fatal: Queue report unavailable - mail system is down
[p585600@cspibapllx017 ~]$ timeout 5 bash -c '</dev/tcp/NOME_DO_RELAY/25' && echo "relay OK" || echo "relay SEM ACESSO"
bash: NOME_DO_RELAY: Name or service not known
bash: /dev/tcp/NOME_DO_RELAY/25: Invalid argument
relay SEM ACESSO
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$ cho "Teste de envio $(hostname) $(date)" | mailx -s "Teste mailx $(hostname)" cesoa140@caixa.gov.br
-bash: cho: command not found
Null message body; hope that's ok
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$ echo "Teste de envio $(hostname) $(date)" | mailx -s "Teste mailx $(hostname)" cesoa140@caixa.gov.br
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$ sudo tail -20 /var/log/maillog   # precisa de root; mostra se o relay aceitou (status=sent) ou recusou

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

Senha SUDO:
Oct  7 09:43:34 cspibapllx017 postfix/postqueue[15174]: fatal: Queue report unavailable - mail system is down
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$ lslpp -l | grep -i -E 'mail|sendmail'
-bash: lslpp: command not found
[p585600@cspibapllx017 ~]$ lssrc -s sendmail
-bash: lssrc: command not found
[p585600@cspibapllx017 ~]$ grep '^DS' /etc/mail/sendmail.cf
grep: /etc/mail/sendmail.cf: No such file or directory
[p585600@cspibapllx017 ~]$ mailq
postqueue: fatal: Queue report unavailable - mail system is down
[p585600@cspibapllx017 ~]$
