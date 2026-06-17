[p585600@caddeapllx2520 ~]$ sudo systemctl status apache2

Presumimos que você recebeu as instruções de sempre do administrador
de sistema local. Basicamente, resume-se a estas três coisas:

    #1) Respeite a privacidade dos outros.
    #2) Pense antes de digitar.
    #3) Com grandes poderes vêm grandes responsabilidades.

[sudo] senha para p585600:
Unit apache2.service could not be found.
[p585600@caddeapllx2520 ~]$ sudo systemctl status apache
Unit apache.service could not be found.
[p585600@caddeapllx2520 ~]$
[p585600@caddeapllx2520 ~]$
[p585600@caddeapllx2520 ~]$ sudo su
[root@caddeapllx2520 p585600]# netstat -tulpn | grep 443
tcp        0      0 0.0.0.0:8443            0.0.0.0:*               OUÇA       2031/java
[root@caddeapllx2520 p585600]#
[root@caddeapllx2520 p585600]#
[root@caddeapllx2520 p585600]#
[root@caddeapllx2520 p585600]# cat /etc/
cat: /etc/: É um diretório
[root@caddeapllx2520 p585600]# cd /etc/
[root@caddeapllx2520 etc]# ls -la
total 1224
drwxr-xr-x. 109 root root     8192 jun 17 14:43 .
dr-xr-xr-x.  19 root root      267 mai 28  2025 ..
-rw-r--r--.   1 root root       44 mai 29 11:38 adjtime
-rw-r--r--.   1 root root     1529 jun 23  2020 aliases
drwxr-xr-x    3 root root       20 mai 28  2025 alsa
drwxr-xr-x.   2 root root     4096 mai 28  2025 alternatives
-rw-r--r--    1 root root      542 mai 29 11:47 anacrontab
-rw-r--r--    1 root root       55 jun 17  2024 asound.conf
drwxr-x---.   4 root root      100 mai 28  2025 audit
drwxr-xr-x.   3 root root     4096 mai 29 11:40 authselect
drwxr-xr-x.   2 root root       38 mai 28  2025 bash_completion.d
-rw-r--r--.   1 root root     2658 dez 21  2022 bashrc
-rw-r--r--.   1 root root      535 jun  6  2023 bindresvport.blacklist
drwxr-xr-x.   2 root root        6 ago 22  2023 binfmt.d
-rw-r--r--    1 root root     1025 mai 29 11:46 chrony.conf
-rw-r-----.   1 root chrony    540 ago 29  2022 chrony.keys
drwxr-xr-x.   2 root root       26 fev 12  2024 cifs-utils
drwxr-xr-x.   2 root root       35 mai 29 11:47 cron.d
drwxr-xr-x.   2 root root       23 mai 29 11:47 cron.daily
-rw-r--r--.   1 root root        0 jul 11  2022 cron.deny
drwxr-xr-x.   2 root root       22 mar 23  2022 cron.hourly
drwxr-xr-x.   2 root root        6 mar 23  2022 cron.monthly
-rw-r--r--.   1 root root      451 mar 23  2022 crontab
drwxr-xr-x.   2 root root        6 mar 23  2022 cron.weekly
drwxr-xr-x.   6 root root       81 mai 29 11:40 crypto-policies
-rw-------.   1 root root        0 mai 28  2025 crypttab
-rw-r--r--.   1 root root     1401 dez 21  2022 csh.cshrc
-rw-r--r--.   1 root root     1087 dez 21  2022 csh.login
drwxr-xr-x.   4 root root       78 mai 28  2025 dbus-1
drwxr-xr-x    4 root root       31 mai 28  2025 dconf
drwxr-xr-x.   2 root root       33 mai 29 11:46 default
drwxr-xr-x.   2 root root       23 mai 28  2025 depmod.d
drwxr-xr-x.   3 root root       24 mai 28  2025 dhcp
-rw-r--r--.   1 root root     4673 jan  6  2023 DIR_COLORS
-rw-r--r--.   1 root root     4755 jan  6  2023 DIR_COLORS.lightbgcolor
drwxr-xr-x.   8 root root      128 mai 28  2025 dnf
-rw-r--r--.   1 root root      117 ago 22  2023 dracut.conf
drwxr-xr-x.   2 root root        6 ago 22  2023 dracut.conf.d
drwxr-xr-x    3 root root       37 mai 28  2025 egl
-rw-r--r--.   1 root root        0 dez 21  2022 environment
-rw-r--r--.   1 root root     1362 jun 23  2020 ethertypes
-rw-r--r--.   1 root root        0 jun 23  2020 exports
drwxr-xr-x.   2 root root        6 ago  7  2023 exports.d
-rw-r--r--.   1 root root       66 jun 23  2020 filesystems
drwxr-x---.   8 root root      149 mai 28  2025 firewalld
drwxr-xr-x    3 root root       23 mai 28  2025 flatpak
drwxr-xr-x.   3 root root       38 mai 28  2025 fonts
-rw-r--r--.   1 root root      935 mai 28  2025 fstab
-rw-r--r--.   1 root root       38 ago 10  2023 fuse.conf
drwxr-xr-x.   2 root root        6 mar 24  2023 gcrypt
drwxr-xr-x    2 root root       26 mai 28  2025 geoclue
drwxr-xr-x    3 root root       26 mai 28  2025 glvnd
drwxr-xr-x.   2 root root        6 abr 26  2023 gnupg
-rw-r--r--.   1 root root       94 ago  9  2021 GREP_COLORS
drwxr-xr-x.   4 root root       40 mai 28  2025 groff
-rw-r--r--    1 root root      664 mai 29 11:47 group
-rw-r--r--.   1 root root      653 mai 29 11:40 group-
lrwxrwxrwx.   1 root root       22 set  7  2023 grub2.cfg -> ../boot/grub2/grub.cfg
drwx------.   2 root root     4096 mai 29 11:46 grub.d
----------    1 root root      521 mai 29 11:47 gshadow
----------.   1 root root      512 mai 29 11:40 gshadow-
drwxr-xr-x.   3 root root       20 mai 28  2025 gss
drwxr-xr-x.   2 root root       79 mai 28  2025 gssproxy
-rw-r--r--.   1 root root        9 jun 23  2020 host.conf
-rw-r--r--    1 root root       38 mai 29 11:40 hostname
-rw-r--r--.   1 root root      227 mai 29 11:38 hosts
-rw-r--r--.   1 root root     5799 ago  7  2023 idmapd.conf
-rw-r--r--.   1 root root      490 ago 22  2023 inittab
-rw-r--r--.   1 root root      943 jun 23  2020 inputrc
drwxr-xr-x.   2 root root     4096 mai 29 13:07 insights-client
drwxr-xr-x.   2 root root      159 mai 28  2025 iproute2
-rw-r--r--.   1 root root       23 set 27  2023 issue
drwxr-xr-x.   2 root root        6 set 27  2023 issue.d
-rw-r--r--.   1 root root       22 set 27  2023 issue.net
drwxr-xr-x    3 root root       26 mai 28  2025 .java
drwxr-xr-x    4 root root       45 mai 28  2025 java
drwxr-xr-x    2 root root        6 nov 19  2024 jvm
drwxr-xr-x    2 root root        6 nov 19  2024 jvm-common
drwxr-xr-x.   4 root root       33 mai 28  2025 kdump
-rw-r--r--.   1 root root     8979 mai 28  2025 kdump.conf
drwxr-xr-x.   3 root root       38 mai 28  2025 kernel
drwxr-xr-x.   2 root root        6 out 17  2022 keyutils
-rw-r--r--.   1 root root      880 ago  9  2023 krb5.conf
drwxr-xr-x.   2 root root       83 mai 29 11:40 krb5.conf.d
-rw-r--r--    1 root root    27839 mai 29 11:47 ld.so.cache
-rw-r--r--    1 root root       28 ago  2  2021 ld.so.conf
drwxr-xr-x.   2 root root       39 jan 30  2024 ld.so.conf.d
-rw-r-----.   1 root root      191 jan 23  2022 libaudit.conf
drwxr-xr-x.   2 root root     4096 mai 28  2025 libibverbs.d
drwxr-xr-x.   2 root root       35 mai 28  2025 libnl
drwxr-xr-x.   6 root root       70 mai 28  2025 libreport
drwxr-xr-x.   2 root root       62 mai 28  2025 libssh
-rw-r--r--.   1 root root     2391 mar  1  2021 libuser.conf
-rw-r--r--.   1 root root       19 mai 28  2025 locale.conf
lrwxrwxrwx.   1 root root       39 mai 28  2025 localtime -> ../usr/share/zoneinfo/America/Sao_Paulo
-rw-r--r--.   1 root root     7778 jul 12  2023 login.defs
-rw-r--r--.   1 root root      496 jun  7  2020 logrotate.conf
drwxr-xr-x.   2 root root     4096 mai 29 11:47 logrotate.d
drwxr-xr-x.   7 root root      115 mai 28  2025 lvm
-r--r--r--.   1 root root       33 mai 28  2025 machine-id
-rw-r--r--.   1 root root      111 jul 17  2023 magic
-rw-r--r--.   1 root root      272 abr 22  2020 mailcap
-rw-r--r--.   1 root root     5122 jul  4  2023 makedumpfile.conf.sample
-rw-r--r--.   1 root root     5235 set 20  2022 man_db.conf
drwxr-xr-x.   3 root root       32 mai 28  2025 microcode_ctl
-rw-r--r--.   1 root root    67454 abr 22  2020 mime.types
-rw-r--r--.   1 root root     1208 jun  8  2022 mke2fs.conf
drwxr-xr-x.   2 root root       72 mai 29 11:46 modprobe.d
drwxr-xr-x.   2 root root        6 ago 22  2023 modules-load.d
-rw-r--r--.   1 root root        0 jun 23  2020 motd
drwxr-xr-x.   2 root root        6 mai 28  2025 motd.d
lrwxrwxrwx.   1 root root       19 mai 28  2025 mtab -> ../proc/self/mounts
-rw-r--r--.   1 root root      767 jun  6  2023 netconfig
drwxr-xr-x.   7 root root      134 mai 28  2025 NetworkManager
-rw-r--r--.   1 root root       58 jun 23  2020 networks
-rw-r--r--.   1 root root     1468 ago  7  2023 nfs.conf
-rw-r--r--.   1 root root     3604 ago  7  2023 nfsmount.conf
drwx------.   3 root root       66 mai 28  2025 nftables
-rw-r--r--    1 root root     2714 jan 30  2024 nscd.conf
lrwxrwxrwx    1 root root       29 mai 29 11:40 nsswitch.conf -> /etc/authselect/nsswitch.conf
-rw-r--r--.   1 root root     2108 set 25  2023 nsswitch.conf.bak
drwxr-xr-x.   2 root root        6 dez  9  2022 oddjob
-rw-r--r--.   1 root root     4922 dez  9  2022 oddjobd.conf
drwxr-xr-x.   2 root root       70 mai 28  2025 oddjobd.conf.d
drwxr-xr-x.   3 root root       36 mai 28  2025 openldap
drwxr-xr-x.   2 root root        6 ago  9  2021 opt
lrwxrwxrwx.   1 root root       21 set 27  2023 os-release -> ../usr/lib/os-release
drwxr-xr-x    3 root root       23 mai 28  2025 ostree
drwxr-xr-x.   2 root root     4096 mai 29 11:40 pam.d
-rw-r--r--    1 root root     1649 mai 29 11:47 passwd
-rw-r--r--.   1 root root     1604 mai 28  2025 passwd-
drwxr-xr-x.  25 root root     4096 mai 28  2025 pcp
-rw-r--r--.   1 root root     7329 ago  7  2023 pcp.conf
-rw-r--r--.   1 root root     6662 ago  7  2023 pcp.env
drwxr-xr-x.   3 root root       21 mai 28  2025 pkcs11
drwxr-xr-x.   3 root root       27 mai 28  2025 pkgconfig
drwxr-xr-x.  13 root root      173 mai 28  2025 pki
drwxr-xr-x.   5 root root       52 mai 28  2025 pm
drwxr-xr-x    5 root root       72 mai 28  2025 polkit-1
drwxr-xr-x.   2 root root        6 ago 10  2021 popt.d
-rw-r--r--.   1 root root      233 jun 23  2020 printcap
-rw-r--r--.   1 root root     1899 dez 21  2022 profile
drwxr-xr-x.   2 root root     4096 mai 28  2025 profile.d
-rw-r--r--.   1 root root     6568 jun 23  2020 protocols
drwxr-xr-x    2 root root       25 mai 28  2025 pulse
-rw-------.   1 root root        0 mai 28  2025 .pwd.lock
drwxr-xr-x.   3 root root       36 mai 28  2025 rc.d
lrwxrwxrwx.   1 root root       13 ago 22  2023 rc.local -> rc.d/rc.local
-rw-r--r--.   1 root root       44 set 27  2023 redhat-release
-rw-r--r--.   1 root root     1787 out 17  2022 request-key.conf
drwxr-xr-x.   2 root root       30 mai 28  2025 request-key.d
-rw-r--r--    1 root root      110 jun 17 14:43 resolv.conf
drwxr-xr-x.   3 root root       40 mai 28  2025 rhc
drwxr-xr-x.   6 root root      105 mai 29 12:05 rhsm
-rw-r--r--    1 root root     1634 ago  1  2021 rpc
drwxr-xr-x.   2 root root        6 jun 30  2023 rpm
-rw-r--r--.   1 root root     3303 jul 31  2023 rsyslog.conf
drwxr-xr-x.   2 root root        6 jul 31  2023 rsyslog.d
drwxr-xr-x.   2 root root       51 mai 29 11:40 rwtab.d
drwxr-xr-x    2 root root       61 mai 29 11:40 samba
drwxr-xr-x.   2 root root       23 mai 28  2025 sasl2
drwxr-xr-x.   7 root root     4096 mai 28  2025 security
drwxr-xr-x.   3 root root       57 mai 28  2025 selinux
-rw-r--r--.   1 root root   692252 jun 23  2020 services
-rw-r--r--.   1 root root      216 jun 27  2023 sestatus.conf
drwxr-xr-x.   3 root root       21 mai 28  2025 sgml
----------    1 root root      894 mai 29 11:47 shadow
----------.   1 root root      874 mai 28  2025 shadow-
-rw-r--r--.   1 root root       44 jun 23  2020 shells
drwxr-xr-x.   2 root root       62 mai 28  2025 skel
drwxr-xr-x.   4 root root     4096 mai 28  2025 ssh
drwxr-xr-x.   2 root root       77 mai 28  2025 ssl
drw-------.   4 root root       48 mai 29 11:40 sssd
drwxr-xr-x.   2 root root        6 ago  9  2021 statetab.d
-rw-r--r--.   1 root root       20 mai 28  2025 subgid
-rw-r--r--.   1 root root        0 jun 23  2020 subgid-
-rw-r--r--.   1 root root       20 mai 28  2025 subuid
-rw-r--r--.   1 root root        0 jun 23  2020 subuid-
-rw-r-----.   1 root root     3983 jan 19  2023 sudo.conf
-r--r-----.   1 root root     4328 jan 19  2023 sudoers
drwxr-x---.   2 root root       22 mai 29 12:05 sudoers.d
-rw-r-----.   1 root root     3181 jan 19  2023 sudo-ldap.conf
drwxr-xr-x.   3 root root       24 mai 28  2025 swid
drwxr-xr-x.   3 root root     4096 mai 29 11:40 sysconfig
-rw-r--r--    1 root root      483 mai 28  2025 sysctl.conf
drwxr-xr-x.   2 root root       55 mai 28  2025 sysctl.d
drwxr-xr-x.   4 root root      166 mai 28  2025 systemd
lrwxrwxrwx.   1 root root       14 set 27  2023 system-release -> redhat-release
-rw-r--r--.   1 root root       41 set 27  2023 system-release-cpe
drwxr-xr-x.   2 root root        6 ago 21  2023 terminfo
drwxr-xr-x.   2 root root        6 ago 22  2023 tmpfiles.d
drwxr-xr-x.   3 root root       51 mai 28  2025 tpm2-tss
-rw-r--r--.   1 root root      375 set 20  2023 trusted-key.key
drwxr-xr-x    3 root root      136 mai 29 11:46 tuned
drwxr-xr-x.   4 root root       68 mai 28  2025 udev
-rw-r--r--    1 root root      208 mai 28  2025 .updated
drwxr-xr-x    2 root root       25 mai 28  2025 UPower
-rw-r--r--.   1 root root       28 mai 28  2025 vconsole.conf
-rw-r--r--.   1 root root     4017 fev  9  2023 vimrc
-rw-r--r--.   1 root root     1184 fev  9  2023 virc
drwxr-xr-x.   4 root root     4096 mai 28  2025 vmware-tools
-rw-r--r--.   1 root root     4925 nov  3  2021 wgetrc
drwxr-xr-x    6 root root       81 mai 28  2025 wireplumber
drwxr-xr-x.   6 root root       70 mai 28  2025 X11
-rw-r--r--.   1 root root      817 ago  9  2021 xattr.conf
drwxr-xr-x.   5 root root       64 mai 28  2025 xdg
drwxr-xr-x.   2 root root       21 mai 28  2025 xml
drwxr-xr-x.   2 root root       57 mai 28  2025 yum
lrwxrwxrwx.   1 root root       12 jun 29  2023 yum.conf -> dnf/dnf.conf
drwxr-xr-x.   2 root root       73 mai 29 12:05 yum.repos.d
[root@caddeapllx2520 etc]#

