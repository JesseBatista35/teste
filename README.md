****
    │               • MobaXterm Professional Edition v24.2 •               │
    │               (SSH client, X server and network tools)               │
    │                                                                      │
    │ ⮞ SSH session to p585600@10.122.150.31                               │
    │   • Direct SSH      :  ✓                                             │
    │   • SSH compression :  ✓                                             │
    │   • SSH-browser     :  ✓                                             │
    │   • X11-forwarding  :  ✓  (remote display is forwarded through SSH)  │
    │                                                                      │
    │ ⮞ For more info, ctrl+click on help or visit our website.            │
    └──────────────────────────────────────────────────────────────────────┘

Last login: Thu Oct 22 10:10:08 2026 from 10.211.12.44
[p585600@cadsvitrlx100 ~]$ ssh 10.116.195.93
p585600@10.116.195.93's password:
Permission denied, please try again.
p585600@10.116.195.93's password:
Last failed login: Thu Oct 22 11:01:28 -03 2026 from 10.122.150.31 on ssh:notty
There was 1 failed login attempt since the last successful login.
Last login: Thu Oct 22 10:14:52 2026 from 10.122.150.31
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ^C
-sh-4.2$ ls -l --time-style=long-iso /opt/jboss/jboss-eap/standalone/deployments/
total 30336
-rw------- 1 jboss jboss 30388081 2021-07-27 17:38 sigsj_internet-ear.ear
-rw-r--r-- 1 jboss jboss       22 2021-07-27 17:38 sigsj_internet-ear.ear.deployed
-rw-r--r-- 1 jboss jboss   450031 2020-11-19 11:59 sirotcon-ejb.jar
-rw-r--r-- 1 jboss jboss       16 2020-11-19 11:59 sirotcon-ejb.jar.deployed
-rw-r--r-- 1 jboss jboss   211362 2020-11-19 11:59 ValidaSirotcon.war
-rw-r--r-- 1 jboss jboss       18 2020-11-19 11:59 ValidaSirotcon.war.deployed
-sh-4.2$ find /opt/jboss /var/log/httpd /logs -name "*access*" -newermt "2026-09-01" 2>/dev/null | head
-sh-4.2$
-sh-4.2$
-sh-4.2$ uptime; last -n 15 | head -15
 11:01:52 up 1 day, 18:57,  1 user,  load average: 0,00, 0,01, 0,05
p585600  pts/0        10.122.150.31    Thu Oct 22 11:01   still logged in
p585600  pts/0        10.122.150.31    Thu Oct 22 10:14 - 10:40  (00:25)
p981778  pts/0        10.122.150.31    Thu Oct 22 10:04 - 10:04  (00:00)
spcsnpb1 pts/0        cadnpaplnt006.in Thu Oct 22 07:38 - 07:38  (00:00)

wtmp begins Thu Oct 22 07:38:29 2026
-sh-4.2$
-sh-4.2$
-sh-4.2$ ss -tn state established '( sport = :8080 or sport = :8009 or sport = :443 or sport = :80 )' 2>/dev/null | head
Recv-Q Send-Q Local Address:Port               Peer Address:Port
0      0      10.116.195.93:8009               10.116.223.232:44620
0      0      10.116.195.93:8009               10.116.223.231:48752
0      0      10.116.195.93:8009               10.116.223.232:49118
0      0      10.116.195.93:8009               10.116.223.232:49460
0      0      10.116.195.93:8009               10.116.223.231:38902
0      0      10.116.195.93:8009               10.116.223.231:37154
0      0      10.116.195.93:8009               10.116.223.231:45992
-sh-4.2$



Creating home directory for p585600.
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$ ps -ef | grep -i [j]boss | tr ' ' '\n' | grep -E "jboss.home.dir|jboss.server.base.dir|port-offset|jboss.node.name|-c$|\.xml$" | sort -u
-c
jboss.home.dir|jboss.server.base.dir|port-offset|jboss.node.name|-c$|\.xml$
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$ ss -ltnp 2>/dev/null | grep -E ":80[0-9]{2} |:8443 |:9990 |:9999 " | awk '{print $4}' | sort -u
10.116.82.156:8001
10.116.82.156:8003
10.116.82.156:8011
10.116.82.156:8012
10.116.82.156:8013
10.116.82.156:8014
10.116.82.156:8015
10.116.82.156:8016
10.116.82.156:8022
10.116.82.156:8023
10.116.82.156:8024
10.116.82.156:8025
10.116.82.156:8026
10.116.82.156:8028
10.116.82.156:8029
10.116.82.156:8030
10.116.82.156:8031
10.116.82.156:8036
10.116.82.156:8037
10.116.82.156:8040
10.116.82.156:8042
10.116.82.157:8080
10.116.82.157:8081
10.116.82.157:8083
10.116.82.157:8093
10.116.82.157:8443
:::8002
[p585600@sspdeaprlx0045 ~]$




p981778@sspdeaprlx0045 ~]$ df -h
Filesystem            Size  Used Avail Use% Mounted on
/dev/mapper/vg_local-lv_root
                       16G  2.9G   12G  20% /
tmpfs                 3.9G     0  3.9G   0% /dev/shm
/dev/sda1             190M   77M  104M  43% /boot
/dev/mapper/vg_local-lv_caixa
                      9.8G  3.2G  6.1G  35% /caixa
/dev/mapper/vg_local-lv_opt
                      4.8G  2.9G  1.7G  63% /opt
/dev/mapper/vg_local-lv_tmp
                      2.9G   73M  2.7G   3% /tmp
/dev/mapper/vg_local-lv_var
                      4.8G 1000M  3.6G  22% /var
/dev/mapper/vg_logapache-lv_logapache
                      4.8G  105M  4.5G   3% /log_apache
/dev/mapper/vg_optapache-lv_optapache
                      2.9G  221M  2.6G   8% /opt/apache
/dev/mapper/vg_optjboss-lv_optjboss
                      4.8G  1.4G  3.2G  31% /opt/jboss
/dev/mapper/vg_logjboss-lv_logjboss
                      4.8G   11M  4.6G   1% /log_jboss
/dev/mapper/vg_backup-lv_backup
                      4.8G  179M  4.4G   4% /backup
[p981778@sspdeaprlx0045 ~]$ cd /opt/jboss/
java-1.8.0-openjdk-1.8.0.275.b01-0.el6_10.x86_64/ jdk/                                              jdk1.6.0_45/
jboss-4.2.3.GA/                                   jdk1.6.0_211/                                     lost+found/
[p981778@sspdeaprlx0045 ~]$ cd /opt/jboss/jboss-4.2.3.GA/
bin/      client/   docs/     jboss.sh  lib/      server/
[p981778@sspdeaprlx0045 ~]$ cd /opt/jboss/jboss-4.2.3.GA/server/si
sidda/       simoc        simoc-intra/
[p981778@sspdeaprlx0045 ~]$ cd /opt/jboss/jboss-4.2.3.GA/server/sicd ^C
[p981778@sspdeaprlx0045 ~]$ cd /log_jboss
[p981778@sspdeaprlx0045 log_jboss]$ ls -ltrh
total 8.0K
drwx------  2 root   root   4.0K 2016-12-11 04:06 lost+found
drwxrwxr-x. 2 jboss4 jboss4 4.0K 2026-10-22 08:22 simoc
[p981778@sspdeaprlx0045 log_jboss]$ cd /log_apache
[p981778@sspdeaprlx0045 log_apache]$ ls -ltrh
total 8.0K
drwx------   2 apache apache 4.0K 2020-04-17 03:44 lost+found
drwxr-xr-x. 27 apache apache 4.0K 2026-10-22 01:30 2.2
[p981778@sspdeaprlx0045 log_apache]$ cd 2.2/
access.log-20170131  jk.shm.109847.lock   jk.shm.120501.lock   jk.shm.35634.lock    jk.shm.99000.lock    siats/               sigpf/               sisag02-lx0034/      sisag05-lx0034/
error.log            jk.shm.113483        jk.shm.2492          jk.shm.63642         mod_jk.log           siccl/               sigsj/               sisag02-lx0037/      sisag05-lx0037/
error.log-20261021   jk.shm.113483.lock   jk.shm.2492.lock     jk.shm.63642.lock    mod_jk.log-20261021  siccl-intra/         sigsj_boleto/        sisag03-lx0034/      sisag06-lx0034/
jk.shm.109650        jk.shm.116174        jk.shm.2639          jk.shm.8765          siabmc/              sicuc/               sigsj_internet/      sisag03-lx0037/      sisag06-lx0037/
jk.shm.109650.lock   jk.shm.116174.lock   jk.shm.2639.lock     jk.shm.8765.lock     siabmteste/          sidda/               sigsj_intranet/      sisag04-lx0034/
jk.shm.109847        jk.shm.120501        jk.shm.35634         jk.shm.99000         siabmws/             sigms/               sisag01-balance/     sisag04-lx0037/
[p981778@sspdeaprlx0045 log_apache]$ cd 2.2/sigsj_boleto/
access443.log           access443.log-20261021  access.log              access.log-20261021     error443.log            error443.log-20261021   error.log               error.log-20261021
[p981778@sspdeaprlx0045 log_apache]$ cd 2.2/sigsj_boleto/
[p981778@sspdeaprlx0045 sigsj_boleto]$ pwd
/log_apache/2.2/sigsj_boleto
[p981778@sspdeaprlx0045 sigsj_boleto]$

