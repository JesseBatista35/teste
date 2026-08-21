[root@caddeapllx2560 opt]# auditctl -w /sigdb/sigdb/TRANSMITE -p wa -k transmite_watch
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]# echo "-w /sigdb/sigdb/TRANSMITE -p wa -k transmite_watch" >> /etc/audit/rules.d/audit.rules
augenrules --load
No rules
enabled 1
failure 1
pid 829
rate_limit 0
backlog_limit 8192
lost 0
backlog 0
backlog_wait_time 60000
backlog_wait_time_actual 0
enabled 1
failure 1
pid 829
rate_limit 0
backlog_limit 8192
lost 0
backlog 0
backlog_wait_time 60000
backlog_wait_time_actual 0
enabled 1
failure 1
pid 829
rate_limit 0
backlog_limit 8192
lost 0
backlog 0
backlog_wait_time 60000
backlog_wait_time_actual 0
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]# auditctl -l | grep transmite_watch
-w /sigdb/sigdb/TRANSMITE -p wa -k transmite_watch
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]# ausearch -k transmite_watch | tail -50
----
time->Fri Aug 21 11:38:45 2026
type=PROCTITLE msg=audit(1787323125.621:148024): proctitle=617564697463746C002D77002F73696764622F73696764622F5452414E534D495445002D70007761002D6B007472616E736D6974655F7761746368
type=SYSCALL msg=audit(1787323125.621:148024): arch=c000003e syscall=44 success=yes exit=1096 a0=4 a1=7ffcac3c4950 a2=448 a3=0 items=0 ppid=738668 pid=738755 auid=10585600 uid=0 gid=0 euid=0 suid=0 fsuid=0 egid=0 sgid=0 fsgid=0 tty=pts0 ses=281 comm="auditctl" exe="/usr/sbin/auditctl" key=(null)
type=CONFIG_CHANGE msg=audit(1787323125.621:148024): auid=10585600 ses=281 op=add_rule key="transmite_watch" list=4 res=1
----
time->Fri Aug 21 11:38:51 2026
type=PROCTITLE msg=audit(1787323131.361:148025): proctitle=2F7362696E2F617564697463746C002D52002F6574632F61756469742F61756469742E72756C6573
type=SOCKADDR msg=audit(1787323131.361:148025): saddr=100000000000000000000000
type=SYSCALL msg=audit(1787323131.361:148025): arch=c000003e syscall=44 success=yes exit=1096 a0=3 a1=7fff784fef50 a2=448 a3=0 items=0 ppid=738759 pid=738773 auid=10585600 uid=0 gid=0 euid=0 suid=0 fsuid=0 egid=0 sgid=0 fsgid=0 tty=pts0 ses=281 comm="auditctl" exe="/usr/sbin/auditctl" key=(null)
type=CONFIG_CHANGE msg=audit(1787323131.361:148025): auid=10585600 ses=281 op=remove_rule key="transmite_watch" list=4 res=1
----
time->Fri Aug 21 11:38:51 2026
type=PROCTITLE msg=audit(1787323131.362:148029): proctitle=2F7362696E2F617564697463746C002D52002F6574632F61756469742F61756469742E72756C6573
type=SYSCALL msg=audit(1787323131.362:148029): arch=c000003e syscall=44 success=yes exit=1096 a0=3 a1=7fff785013f0 a2=448 a3=0 items=0 ppid=738759 pid=738773 auid=10585600 uid=0 gid=0 euid=0 suid=0 fsuid=0 egid=0 sgid=0 fsgid=0 tty=pts0 ses=281 comm="auditctl" exe="/usr/sbin/auditctl" key=(null)
type=CONFIG_CHANGE msg=audit(1787323131.362:148029): auid=10585600 ses=281 op=add_rule key="transmite_watch" list=4 res=1
[root@caddeapllx2560 opt]#
