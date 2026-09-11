
[p585600@srjtqaprlx0001 ~]$
[p585600@srjtqaprlx0001 ~]$ find / -xdev \( -iname "server.log*" -o -iname "boot.log*" \) -mmin -4320 2>/dev/null
[p585600@srjtqaprlx0001 ~]$ ls -la /opt | grep -iE 'jboss|eap|wildfly'
[p585600@srjtqaprlx0001 ~]$
[p585600@srjtqaprlx0001 ~]$
[p585600@srjtqaprlx0001 ~]$ cd /opt/
[p585600@srjtqaprlx0001 opt]$ ls -la
total 60
drwxr-xr-x. 12 root     root      4096 May 26 12:02 .
dr-xr-xr-x. 32 root     root      4096 May 26 12:02 ..
drwxr-xr-x   2 root     root      4096 Sep  8  2023 backup
drwxr-xr-x   3 root     root      4096 Apr  1  2020 BESClient
drwx---r-x   7 spctmtr3 controlm  4096 Dec  6  2023 ctmage8
drwx------.  2 root     root     16384 Jan  6  2016 lost+found
drwxr-xr-x   6 root     root      4096 May 26 12:02 networker
drwxr-xr-x   7 root     root      4096 May 26 12:02 nsr
drwxr-xr-x.  4 root     root      4096 Mar 23  2017 open
drwxr-xr-x   6 root     root      4096 Jul  3  2024 puppetlabs
drwxr-xr-x.  2 root     root      4096 Aug 10  2017 rh
drwxr-xr-x.  4 root     root      4096 Dec  2  2019 tivoli
[p585600@srjtqaprlx0001 opt]$ cd ..
[p585600@srjtqaprlx0001 /]$ ls -la
total 10244
dr-xr-xr-x.  32 root     root      4096 May 26 12:02 .
dr-xr-xr-x.  32 root     root      4096 May 26 12:02 ..
-rw-r--r--    1 root     root         0 Sep 12  2023 .autofsck
-rw-r--r--    1 root     root         0 Apr 11  2016 .autorelabel
dr-xr-xr-x.   2 root     root      4096 Mar  7  2025 bin
dr-xr-xr-x.   5 root     root      3072 Sep 12  2023 boot
drwxr-xr-x.   2 root     root      4096 Aug 22  2018 cgroup
drwxr-xr-x   18 root     root      3820 May 25 17:18 dev
drwxr-xr-x. 115 root     root     12288 Sep  8 06:55 etc
drwxr-xr-x.   3 root     root      4096 Jan  6  2016 export
drwx------    2 root     root      4096 Sep 11 05:07 .gnupg
drwxr-xr-x.   3 root     root      4096 Dec 18  2024 home
drwxr-xr-x.   8 root     root      4096 Jan 31  2023 infra_app
drwxr-xr-x    3 spapatr1 apache    4096 Nov  1  2018 infra_web
dr-xr-xr-x.  13 root     root      4096 Mar  7  2025 lib
dr-xr-xr-x.  10 root     root     12288 Mar  7  2025 lib64
drwx------.   2 root     root     16384 Jan  6  2016 lost+found
drwxr-xr-x.   2 root     root      4096 Jun 28  2011 media
drwxr-xr-x    2 root     root         0 Sep 12  2023 misc
drwxr-xr-x.   3 root     root      4096 Mar  3  2016 mnt
drwxr-xr-x    2 root     root         0 Sep 12  2023 net
drwxr-xr-x   10 root     root      4096 May 26 12:02 nsr
drwxr-xr-x.  12 root     root      4096 May 26 12:02 opt
drwxr-xr-x.   6 root     root      4096 Feb  8  2018 pacotes
dr-xr-xr-x  731 root     root         0 Sep 12  2023 proc
dr-xr-x---.   8 root     root      4096 Aug 13 18:02 root
dr-xr-xr-x.   2 root     root     12288 Mar  7  2025 sbin
drwxr-xr-x.   2 root     root      4096 Jan  6  2016 selinux
drwxr-xr-x.   2 root     root      4096 Jun 28  2011 srv
drwxr-xr-x   13 root     root         0 Sep 12  2023 sys
drwxrwxrwt. 501 root     root     32768 Sep 11 07:10 tmp
drwxr-xr-x.   2 root     root      4096 Jan  6  2016 tmp_old
-rw-r--r--    1 root     root         0 Oct 17  2022 typescript
drwxr-xr-x.  14 root     root      4096 Dec  2  2019 usr
drwxr-xr-x.  22 root     root      4096 May 10  2023 var
-rw-r--r--    1 root     root   9365137 Feb 13  2026 wazuh-agent-4.10.1-1.x86_64.rpm
-rwxr-xr-x    1 root     root    941944 Jul 17  2018 x
[p585600@srjtqaprlx0001 /]$ cd /log
-bash: cd: /log: No such file or directory
[p585600@srjtqaprlx0001 /]$ cd /logs
-bash: cd: /logs: No such file or directory
[p585600@srjtqaprlx0001 /]$
