[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]# stat -c "%U:%G %a %y" /sigdb/sigdb/TRANSMITE
ctmagelx:controlm 755 2026-08-21 11:34:01.000755597 -0300
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]# ausearch -k transmite_watch --start recent | tail -50
----
time->Fri Aug 21 13:53:49 2026
type=PROCTITLE msg=audit(1787331229.754:148718): proctitle=63686D6F6400373535002F73696764622F73696764622F5452414E534D495445
type=PATH msg=audit(1787331229.754:148718): item=0 name="/sigdb/sigdb/TRANSMITE" inode=18709315 dev=fd:00 mode=040775 ouid=20003596 ogid=30000018 rdev=00:00 nametype=NORMAL cap_fp=0 cap_fi=0 cap_fe=0 cap_fver=0 cap_frootid=0
type=CWD msg=audit(1787331229.754:148718): cwd="/root"
type=SYSCALL msg=audit(1787331229.754:148718): arch=c000003e syscall=268 success=yes exit=0 a0=ffffff9c a1=55e3151be660 a2=1ed a3=0 items=1 ppid=742186 pid=742188 auid=20003846 uid=0 gid=0 euid=0 suid=0 fsuid=0 egid=0 sgid=0 fsgid=0 tty=(none) ses=285 comm="chmod" exe="/usr/bin/chmod" key="transmite_watch"
[root@caddeapllx2560 opt]#
