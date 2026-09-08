
[p585600@srjdeapllx0051 ~]$ for pid in 15838 15883 15890 50140 50143 117056; do
>   echo "PID $pid:"; sudo ls -la /proc/$pid/cwd 2>/dev/null
> done
PID 15838:
lrwxrwxrwx 1 spnoddr1 nodejs 0 Apr 18 12:54 /proc/15838/cwd -> /opt/open/nodejs/sirpl
PID 15883:
lrwxrwxrwx 1 spnoddr1 nodejs 0 Apr 18 12:54 /proc/15883/cwd -> /opt/open/nodejs/sirpl
PID 15890:
lrwxrwxrwx 1 spnoddr1 nodejs 0 Apr 18 12:54 /proc/15890/cwd -> /opt/open/nodejs/sirpl
PID 50140:
lrwxrwxrwx 1 spnoddr1 nodejs 0 Apr 18 12:54 /proc/50140/cwd -> /opt/open/nodejs/sinet
PID 50143:
lrwxrwxrwx 1 spnoddr1 nodejs 0 Apr 18 12:54 /proc/50143/cwd -> /opt/open/nodejs/sisvc
PID 117056:
lrwxrwxrwx 1 spnoddr1 nodejs 0 Jul 27 11:51 /proc/117056/cwd -> /opt/open/nodejs/sisad
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$ ps -ef | grep -i pm2
p585600   94248  93588  0 15:53 pts/7    00:00:00 grep --color=auto -i pm2
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$ ps -ef | grep -i forever
p585600   94282  93588  0 15:53 pts/7    00:00:00 grep --color=auto -i forever
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$ sudo systemctl list-units --all | grep -i sirpl
  sirpl.service                                                                                                  loaded    active   running   sirpl.service
● sirpldb.service                                                                                                not-found inactive dead      sirpldb.service
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$ find / -iname "*sirpl*" -path "*/systemd/*" 2>/dev/null
/sys/fs/cgroup/systemd/system.slice/sirpl.service
/etc/systemd/system/sirpl.service_11122023
/etc/systemd/system/.sirpl.service.20230615130654.p725476
/etc/systemd/system/sirpl.service.20230615
/etc/systemd/system/sirpl.service.20210812
/etc/systemd/system/sirpl.service.20210720
/etc/systemd/system/sirpl.service.20210809
/etc/systemd/system/sirpl.service
/etc/systemd/system/sirpl.service_59170270
/etc/systemd/system/multi-user.target.wants/sirpl.service
/etc/systemd/system/multi-user.target.wants/sirpldb.service
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$ crontab -l -u spnoddr1 2>/dev/null
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$ sudo -u spnoddr1 pm2 list 2>/dev/null
[p585600@srjdeapllx0051 ~]$
