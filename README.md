
***********************************************************************
p585600@10.116.84.136's password:
Last login: Tue Mar 10 15:01:56 2026 from 10.122.150.31
,-sh-4.1$ ,
-sh: ,: command not found
-sh-4.1$
-sh-4.1$
-sh-4.1$ ps -ef | grep httpd
daemon   21881 54783  0 07:11 ?        00:00:01 /usr/sbin/httpd.worker -d /etc/httpd/ -f /etc/httpd/httpd_eap_des_financeiro_64.conf -k start
root     38617     1  0 08:02 ?        00:00:01 /usr/sbin/httpd.worker -d /etc/httpd/ -f /etc/httpd/httpd_eap7_des.conf -k start
root     38618     1  0 08:02 ?        00:00:01 /usr/sbin/httpd.worker -d /etc/httpd/ -f /etc/httpd/httpd_eap_prodt_64.conf -k start
root     38619     1  0 08:02 ?        00:00:00 /usr/sbin/httpd.worker -d /etc/httpd/ -f /etc/httpd/httpd_des.conf -k start
daemon   38642 38619  0 08:02 ?        00:00:01 /usr/sbin/httpd.worker -d /etc/httpd/ -f /etc/httpd/httpd_des.conf -k start
daemon   42565 38617  0 08:02 ?        00:00:00 /usr/sbin/httpd.worker -d /etc/httpd/ -f /etc/httpd/httpd_eap7_des.conf -k start
daemon   43122 53589  0 Sep17 ?        00:00:03 /usr/sbin/httpd.worker -d /etc/httpd/ -f /etc/httpd/httpd_eap_des_empresarial_64.conf -k start
daemon   48868 38618  0 10:22 ?        00:00:00 /usr/sbin/httpd.worker -d /etc/httpd/ -f /etc/httpd/httpd_eap_prodt_64.conf -k start
root     49707     1  0 10:24 ?        00:00:00 /usr/sbin/httpd.worker -d /etc/httpd/ -f /etc/httpd/httpd_eap_des_64.conf -k start
daemon   49721 49707  0 10:24 ?        00:00:05 /usr/sbin/httpd.worker -d /etc/httpd/ -f /etc/httpd/httpd_eap_des_64.conf -k start
p585600  50756 50728  0 10:37 pts/3    00:00:00 grep httpd
root     53589     1  0  2025 ?        01:15:54 /usr/sbin/httpd.worker -d /etc/httpd/ -f /etc/httpd/httpd_eap_des_empresarial_64.conf -k start
root     54783     1  0  2025 ?        01:17:05 /usr/sbin/httpd.worker -d /etc/httpd/ -f /etc/httpd/httpd_eap_des_financeiro_64.conf -k start
-sh-4.1$ netstat -tlnp | grep 6666    # ou: ss -tlnp | grep 6666
(No info could be read for "-p": geteuid()=10585600 but you should be root.)
tcp        0      0 10.116.84.136:6666          0.0.0.0:*                   LISTEN      -
tcp        0      0 10.116.84.149:6666          0.0.0.0:*                   LISTEN      -
tcp        0      0 10.116.84.220:6666          0.0.0.0:*                   LISTEN      -
tcp        0      0 10.116.85.250:6666          0.0.0.0:*                   LISTEN      -
tcp        0      0 10.116.98.48:6666           0.0.0.0:*                   LISTEN      -
-sh-4.1$ tail -f /etc/httpd/logs/.../error_log
tail: cannot open `/etc/httpd/logs/.../error_log' for reading: Permission denied
tail: no files remaining
-sh-4.1$




p585600@10.116.88.24's password:
Last login: Fri Aug 14 14:23:16 2026 from 10.122.150.31
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ ps -ef | grep jboss
p585600   6289  5920  0 10:26 pts/0    00:00:00 grep jboss
-sh-4.1$ ps -ef | grep jboss
p585600   6291  5920  0 10:26 pts/0    00:00:00 grep jboss
-sh-4.1$ hostname -f
sbrdeapllx0005
-sh-4.1$ ps -ef | grep jboss
p585600   8064  5920  0 10:31 pts/0    00:00:00 grep jboss
-sh-4.1$ ps -ef | grep jboss
p585600   8066  5920  0 10:31 pts/0    00:00:00 grep jboss
-sh-4.1$ telnet 10.116.84.137 6666
Trying 10.116.84.137...
Connected to 10.116.84.137.
Escape character is '^]'.
Connection closed by foreign host.
-sh-4.1$ telnet 10.116.84.136 6666
Trying 10.116.84.136...
Connected to 10.116.84.136.
Escape character is '^]'.
Connection closed by foreign host.
-sh-4.1$
-sh-4.1$
-sh-4.1$ nc -zv 10.116.84.137 6666
Connection to 10.116.84.137 6666 port [tcp/ircu-2] succeeded!
-sh-4.1$ nc -zv 10.116.84.136 6666
Connection to 10.116.84.136 6666 port [tcp/ircu-2] succeeded!
-sh-4.1$
-sh-4.1$
-sh-4.1$ ps -ef | grep httpd
p585600  10169  5920  0 10:35 pts/0    00:00:00 grep httpd
-sh-4.1$




Pressione <Control+D> IMEDIATAMENTE se voce nao concorda com as
condicoes deste aviso
***********************************************************************
p585600@10.116.84.137's password:
Last login: Tue Mar 10 16:23:43 2026 from 10.116.83.140
-sh-4.1$
-sh-4.1$
-sh-4.1$ ps -ef | grep httpd
root      3238     1  0 10:17 ?        00:00:00 /usr/sbin/httpd.worker -d /etc/httpd/ -f /etc/httpd/httpd_eap_des_64.conf -k start
daemon    3252  3238  0 10:17 ?        00:00:10 /usr/sbin/httpd.worker -d /etc/httpd/ -f /etc/httpd/httpd_eap_des_64.conf -k start
p585600   4543  4516  0 10:38 pts/2    00:00:00 grep httpd
root     37762     1  0  2025 ?        01:08:52 /usr/sbin/httpd.worker -d /etc/httpd/ -f /etc/httpd/httpd_eap_des_financeiro_64.conf -k start
root     39116     1  0  2025 ?        01:08:30 /usr/sbin/httpd.worker -d /etc/httpd/ -f /etc/httpd/httpd_eap_des_habitacao_64.conf -k start
daemon   57935 37762  0 07:23 ?        00:00:01 /usr/sbin/httpd.worker -d /etc/httpd/ -f /etc/httpd/httpd_eap_des_financeiro_64.conf -k start
daemon   60176 39116  0 08:40 ?        00:00:00 /usr/sbin/httpd.worker -d /etc/httpd/ -f /etc/httpd/httpd_eap_des_habitacao_64.conf -k start
-sh-4.1$ netstat -tlnp | grep 6666    # ou: ss -tlnp | grep 6666
(No info could be read for "-p": geteuid()=10585600 but you should be root.)
tcp        0      0 10.116.84.137:6666          0.0.0.0:*                   LISTEN      -
tcp        0      0 10.116.98.237:6666          0.0.0.0:*                   LISTEN      -
tcp        0      0 10.116.85.251:6666          0.0.0.0:*                   LISTEN      -
-sh-4.1$ sudo su

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
[root@sbrdeaprlx0002 p585600]# tail -f /etc/httpd/logs/.../error_log
tail: cannot open `/etc/httpd/logs/.../error_log' for reading: No such file or directory
tail: no files remaining
[root@sbrdeaprlx0002 p585600]#
[root@sbrdeaprlx0002 p585600]#
[root@sbrdeaprlx0002 p585600]#

