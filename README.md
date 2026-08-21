
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$ sudo grep "p515324" /var/log/secure | grep "Aug 21 1[45]:"

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

Senha SUDO:
Aug 21 14:27:32 cspdeapllx011 sshd[120959]: pam_unix(sshd:auth): authentication failure; logname= uid=0 euid=0 tty=ssh ruser= rhost=10.122.150.31  user=p515324
Aug 21 14:27:32 cspdeapllx011 sshd[120959]: pam_sss(sshd:auth): authentication success; logname= uid=0 euid=0 tty=ssh ruser= rhost=10.122.150.31 user=p515324
Aug 21 14:27:32 cspdeapllx011 sshd[120959]: Accepted password for p515324 from 10.122.150.31 port 36970 ssh2
Aug 21 14:27:32 cspdeapllx011 sshd[120959]: pam_unix(sshd:session): session opened for user p515324 by (uid=0)
Aug 21 14:28:27 cspdeapllx011 bash[121091]: Comando: Sessao PRINCIPAL iniciada por: 10.122.150.31 36970 22 p515324 para p515324
Aug 21 15:03:20 cspdeapllx011 sshd[126784]: pam_unix(sshd:auth): authentication failure; logname= uid=0 euid=0 tty=ssh ruser= rhost=10.122.150.31  user=p515324
Aug 21 15:03:20 cspdeapllx011 sshd[126784]: pam_sss(sshd:auth): authentication success; logname= uid=0 euid=0 tty=ssh ruser= rhost=10.122.150.31 user=p515324
Aug 21 15:03:20 cspdeapllx011 sshd[126784]: Accepted password for p515324 from 10.122.150.31 port 45958 ssh2
Aug 21 15:03:20 cspdeapllx011 sshd[126784]: pam_unix(sshd:session): session opened for user p515324 by (uid=0)
Aug 21 15:03:21 cspdeapllx011 bash[126880]: Comando: Sessao PRINCIPAL iniciada por: 10.122.150.31 45958 22 p515324 para p515324
Aug 21 15:27:21 cspdeapllx011 sshd[126784]: pam_unix(sshd:session): session closed for user p515324
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$ sudo ausearch -f /opt/keystore -ts today 2>&1 | grep -E "type=PATH|uid=|exe="
[p585600@cspdeapllx011 ~]$ sudo find /home -maxdepth 2 -user p515324 -name ".bash_history" -exec sudo cat {} \; 2>/dev/null | grep -i "keystore\|cert\|4570"
[p585600@cspdeapllx011 ~]$ sudo su
bash-4.1#
bash-4.1#
bash-4.1#
bash-4.1# su grep "p515324" /var/log/secure | grep "Aug 21 1[45]:"
su: usu▒rio grep n▒o existe
bash-4.1# ausearch -f /opt/keystore -ts today 2>&1 | grep -E "type=PATH|uid=|exe="
bash-4.1#
