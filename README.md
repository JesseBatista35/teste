lx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# nslookup crjdeaprlx038.agil.nprd.caixa.gov.br
Server:         10.116.193.77
Address:        10.116.193.77#53

** server can't find crjdeaprlx038.agil.nprd.caixa.gov.br: NXDOMAIN

[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# cat /etc/hosts
127.0.0.1   localhost localhost.localdomain localhost4 localhost4.localdomain4
::1         localhost localhost.localdomain localhost6 localhost6.localdomain6

10.116.201.173  caddeapllx2695.agil.nprd.caixa.gov.br caddeapllx2695
# BEGIN ANSIBLE MANAGED BLOCK
#10.116.99.99   crjdeaprlx038
#10.116.99.100   crjdeaprlx039
# END ANSIBLE MANAGED BLOCK

10.116.84.154 sspdeaprlx0028
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# ls -la /etc/hosts*
-rw-r--r-- 1 root root 376 ago 20 15:55 /etc/hosts
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# grep -rs crjdeaprlx03 /etc/ /opt/ctmage/ctm/data/ 2>/dev/null
/etc/hosts:#10.116.99.99        crjdeaprlx038
/etc/hosts:#10.116.99.100   crjdeaprlx039
/opt/ctmage/ctm/data/CONFIG.dat:CTMSHOST                            crjdeaprlx038
/opt/ctmage/ctm/data/CONFIG.dat:CTMPERMHOSTS                        crjdeaprlx038|crjdeaprlx039
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#   getent hosts crjdeaprlx038 crjdeaprlx039
[root@caddeapllx2695 p585600]# getent hosts crjdeaprlx038 crjdeaprlx039
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# ssh 10.116.201.113 "grep -i crjdeaprlx /etc/hosts"
The authenticity of host '10.116.201.113 (10.116.201.113)' can't be established.
ED25519 key fingerprint is SHA256:nUeIvBFrSC3NFPoCobdHkzyxYxUxjc77QZklc6lFtc0.
This key is not known by any other names
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '10.116.201.113' (ED25519) to the list of known hosts.
root@10.116.201.113's password:
Permission denied, please try again.
root@10.116.201.113's password:
Permission denied, please try again.
root@10.116.201.113's password:
root@10.116.201.113: Permission denied (publickey,gssapi-keyex,gssapi-with-mic,password).
[root@caddeapllx2695 p585600]# grep -rhoE "([0-9]{1,3}\.){3}[0-9]{1,3}" /opt/ctmage/ctm/proclog/ 2>/dev/null | sort | uniq -c | sort -rn | head
   2606 9.0.22.100
   1871 127.0.0.1
   1682 9.0.22.106
    852 9.0.22.103
    852 4.9.0.22
    494 0.0.0.0
    446 9.0.21.200
    284 3.9.0.22
     31 9.0.18.000
      7 9.0.20.000
[root@caddeapllx2695 p585600]# find / -xdev -type f -newermt "2026-09-26 11:20" ! -newermt "2026-09-26 11:40" 2>/dev/null | grep -vE "^/(proc|sys|run)"
/etc/tuned/active_profile
/etc/tuned/post_loaded_profile
/etc/tuned/profile_mode
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# find / -xdev \( -name "*~" -o -name "*.bak*" -o -name "*.bkp*" -o -name "*.orig" -o -name "*.old" -o -name "*.rpmsave" -o -name "*@*~" \) -newermt "2026-06-01" 2>/dev/null | grep -vE "^/(proc|sys)"
/etc/sssd/sssd.conf_20260820.bkp
/etc/fstab.17117.2026-06-25@16:16:23~
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# cat /etc/hosts
127.0.0.1   localhost localhost.localdomain localhost4 localhost4.localdomain4
::1         localhost localhost.localdomain localhost6 localhost6.localdomain6

10.116.201.173  caddeapllx2695.agil.nprd.caixa.gov.br caddeapllx2695
# BEGIN ANSIBLE MANAGED BLOCK
#10.116.99.99   crjdeaprlx038
#10.116.99.100   crjdeaprlx039
# END ANSIBLE MANAGED BLOCK

10.116.84.154 sspdeaprlx0028
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# ls -la /etc/hosts*
-rw-r--r-- 1 root root 376 ago 20 15:55 /etc/hosts
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# grep -rs crjdeaprlx03 /etc/ /opt/ctmage/ctm/data/ 2>/dev/null
/etc/hosts:#10.116.99.99        crjdeaprlx038
/etc/hosts:#10.116.99.100   crjdeaprlx039
/opt/ctmage/ctm/data/CONFIG.dat:CTMSHOST                            crjdeaprlx038
/opt/ctmage/ctm/data/CONFIG.dat:CTMPERMHOSTS                        crjdeaprlx038|crjdeaprlx039
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#   getent hosts crjdeaprlx038 crjdeaprlx039
[root@caddeapllx2695 p585600]# getent hosts crjdeaprlx038 crjdeaprlx039
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# ssh 10.116.201.113 "grep -i crjdeaprlx /etc/hosts"
The authenticity of host '10.116.201.113 (10.116.201.113)' can't be established.
ED25519 key fingerprint is SHA256:nUeIvBFrSC3NFPoCobdHkzyxYxUxjc77QZklc6lFtc0.
This key is not known by any other names
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '10.116.201.113' (ED25519) to the list of known hosts.
root@10.116.201.113's password:
Permission denied, please try again.
root@10.116.201.113's password:
Permission denied, please try again.
root@10.116.201.113's password:
root@10.116.201.113: Permission denied (publickey,gssapi-keyex,gssapi-with-mic,password).
[root@caddeapllx2695 p585600]# grep -rhoE "([0-9]{1,3}\.){3}[0-9]{1,3}" /opt/ctmage/ctm/proclog/ 2>/dev/null | sort | uniq -c | sort -rn | head
   2606 9.0.22.100
   1871 127.0.0.1
   1682 9.0.22.106
    852 9.0.22.103
    852 4.9.0.22
    494 0.0.0.0
    446 9.0.21.200
    284 3.9.0.22
     31 9.0.18.000
      7 9.0.20.000
[root@caddeapllx2695 p585600]#
^C
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# ^C
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# cat /etc/hosts
127.0.0.1   localhost localhost.localdomain localhost4 localhost4.localdomain4
::1         localhost localhost.localdomain localhost6 localhost6.localdomain6

10.116.201.173  caddeapllx2695.agil.nprd.caixa.gov.br caddeapllx2695
# BEGIN ANSIBLE MANAGED BLOCK
#10.116.99.99   crjdeaprlx038
#10.116.99.100   crjdeaprlx039
# END ANSIBLE MANAGED BLOCK

10.116.84.154 sspdeaprlx0028
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# ls -la /etc/hosts*
-rw-r--r-- 1 root root 376 ago 20 15:55 /etc/hosts
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# grep -rs crjdeaprlx03 /etc/ /opt/ctmage/ctm/data/ 2>/dev/null
/etc/hosts:#10.116.99.99        crjdeaprlx038
/etc/hosts:#10.116.99.100   crjdeaprlx039
/opt/ctmage/ctm/data/CONFIG.dat:CTMSHOST                            crjdeaprlx038
/opt/ctmage/ctm/data/CONFIG.dat:CTMPERMHOSTS                        crjdeaprlx038|crjdeaprlx039
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#   getent hosts crjdeaprlx038 crjdeaprlx039
[root@caddeapllx2695 p585600]# getent hosts crjdeaprlx038 crjdeaprlx039
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# ssh 10.116.201.113 "grep -i crjdeaprlx /etc/hosts"
The authenticity of host '10.116.201.113 (10.116.201.113)' can't be established.
ED25519 key fingerprint is SHA256:nUeIvBFrSC3NFPoCobdHkzyxYxUxjc77QZklc6lFtc0.
This key is not known by any other names
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '10.116.201.113' (ED25519) to the list of known hosts.
root@10.116.201.113's password:
Permission denied, please try again.
root@10.116.201.113's password:
Permission denied, please try again.
root@10.116.201.113's password:
root@10.116.201.113: Permission denied (publickey,gssapi-keyex,gssapi-with-mic,password).
[root@caddeapllx2695 p585600]# grep -rhoE "([0-9]{1,3}\.){3}[0-9]{1,3}" /opt/ctmage/ctm/proclog/ 2>/dev/null | sort | uniq -c | sort -rn | head
   2606 9.0.22.100
   1871 127.0.0.1
   1682 9.0.22.106
    852 9.0.22.103
    852 4.9.0.22
    494 0.0.0.0
    446 9.0.21.200
    284 3.9.0.22
     31 9.0.18.000
      7 9.0.20.000
[root@caddeapllx2695 p585600]#
bash: [root@caddeapllx2695: comando não encontrado
bash: 127.0.0.1: comando não encontrado
bash: ::1: comando não encontrado
bash: 10.116.201.173: comando não encontrado
bash: 10.116.84.154: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
bash: -rw-r--r--: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
bash: /etc/hosts:#10.116.99.99: Arquivo ou diretório inexistente
bash: /etc/hosts:#10.116.99.100 : Arquivo ou diretório inexistente
bash: /opt/ctmage/ctm/data/CONFIG.dat:CTMSHOST: Arquivo ou diretório inexistente
bash: /opt/ctmage/ctm/data/CONFIG.dat:CTMPERMHOSTS: Arquivo ou diretório inexistente
bash: crjdeaprlx039: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
bash: The: comando não encontrado
bash: Permission: comando não encontrado
bash: $'root@10.116.201.113s password:\nPermission denied, please try again.\nroot@10.116.201.113s': comando não encontrado
bash: erro de sintaxe próximo ao token inesperado `('
bash: 2606: comando não encontrado
bash: 1871: comando não encontrado
bash: 1682: comando não encontrado
bash: 852: comando não encontrado
bash: 852: comando não encontrado
bash: 494: comando não encontrado
bash: 446: comando não encontrado
bash: 284: comando não encontrado
bash: 31: comando não encontrado
bash: 7: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# cat /etc/hosts
127.0.0.1   localhost localhost.localdomain localhost4 localhost4.localdomain4
::1         localhost localhost.localdomain localhost6 localhost6.localdomain6

10.116.201.173  caddeapllx2695.agil.nprd.caixa.gov.br caddeapllx2695
# BEGIN ANSIBLE MANAGED BLOCK
#10.116.99.99   crjdeaprlx038
#10.116.99.100   crjdeaprlx039
# END ANSIBLE MANAGED BLOCK

10.116.84.154 sspdeaprlx0028
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# ls -la /etc/hosts*
-rw-r--r-- 1 root root 376 ago 20 15:55 /etc/hosts
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# grep -rs crjdeaprlx03 /etc/ /opt/ctmage/ctm/data/ 2>/dev/null
/etc/hosts:#10.116.99.99        crjdeaprlx038
/etc/hosts:#10.116.99.100   crjdeaprlx039
/opt/ctmage/ctm/data/CONFIG.dat:CTMSHOST                            crjdeaprlx038
/opt/ctmage/ctm/data/CONFIG.dat:CTMPERMHOSTS                        crjdeaprlx038|crjdeaprlx039
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#   getent hosts crjdeaprlx038 crjdeaprlx039
[root@caddeapllx2695 p585600]# getent hosts crjdeaprlx038 crjdeaprlx039
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# ssh 10.116.201.113 "grep -i crjdeaprlx /etc/hosts"
The authenticity of host '10.116.201.113 (10.116.201.113)' can't be established.
ED25519 key fingerprint is SHA256:nUeIvBFrSC3NFPoCobdHkzyxYxUxjc77QZklc6lFtc0.
This key is not known by any other names
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '10.116.201.113' (ED25519) to the list of known hosts.
root@10.116.201.113's password:
Permission denied, please try again.
root@10.116.201.113's password:
Permission denied, please try again.
root@10.116.201.113's password:
root@10.116.201.113: Permission denied (publickey,gssapi-keyex,gssapi-with-mic,password).
[root@caddeapllx2695 p585600]# grep -rhoE "([0-9]{1,3}\.){3}[0-9]{1,3}" /opt/ctmage/ctm/proclog/ 2>/dev/null | sort | uniq -c | sort -rn | head
   2606 9.0.22.100
   1871 127.0.0.1
   1682 9.0.22.106
    852 9.0.22.103
    852 4.9.0.22
    494 0.0.0.0
    446 9.0.21.200
    284 3.9.0.22
     31 9.0.18.000
      7 9.0.20.000
[root@caddeapllx2695 p585600]#
bash: [root@caddeapllx2695: comando não encontrado
bash: 127.0.0.1: comando não encontrado
bash: ::1: comando não encontrado
bash: 10.116.201.173: comando não encontrado
bash: 10.116.84.154: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
bash: -rw-r--r--: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
bash: /etc/hosts:#10.116.99.99: Arquivo ou diretório inexistente
bash: /etc/hosts:#10.116.99.100 : Arquivo ou diretório inexistente
bash: /opt/ctmage/ctm/data/CONFIG.dat:CTMSHOST: Arquivo ou diretório inexistente
bash: /opt/ctmage/ctm/data/CONFIG.dat:CTMPERMHOSTS: Arquivo ou diretório inexistente
bash: crjdeaprlx039: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
bash: The: comando não encontrado
bash: Permission: comando não encontrado
bash: $'root@10.116.201.113s password:\nPermission denied, please try again.\nroot@10.116.201.113s': comando não encontrado
bash: erro de sintaxe próximo ao token inesperado `('
bash: 2606: comando não encontrado
bash: 1871: comando não encontrado
bash: 1682: comando não encontrado
bash: 852: comando não encontrado
bash: 852: comando não encontrado
bash: 494: comando não encontrado
bash: 446: comando não encontrado
bash: 284: comando não encontrado
bash: 31: comando não encontrado
bash: 7: comando não encontrado
bash: [root@caddeapllx2695: comando não encontrado
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# grep "Sep 26 11:[12]" /var/log/secure* /var/log/messages* 2>/dev/null | head -50
/var/log/secure-20260927:Sep 26 11:10:39 caddeapllx2695 sshd[1114537]: Received disconnect from 10.122.155.67 port 32998:11: disconnected by user
/var/log/secure-20260927:Sep 26 11:10:39 caddeapllx2695 sshd[1114537]: Disconnected from user sansbp01 10.122.155.67 port 32998
/var/log/secure-20260927:Sep 26 11:10:39 caddeapllx2695 sshd[1114525]: pam_unix(sshd:session): session closed for user sansbp01
/var/log/secure-20260927:Sep 26 11:26:16 caddeapllx2695 sshd[1130381]: pam_sss(sshd:auth): authentication success; logname= uid=0 euid=0 tty=ssh ruser= rhost=10.122.155.67 user=sansbp01
/var/log/secure-20260927:Sep 26 11:26:16 caddeapllx2695 sshd[1130381]: Accepted password for sansbp01 from 10.122.155.67 port 41170 ssh2
/var/log/secure-20260927:Sep 26 11:26:16 caddeapllx2695 systemd[1130384]: pam_unix(systemd-user:session): session opened for user sansbp01(uid=20003846) by (uid=0)
/var/log/secure-20260927:Sep 26 11:26:17 caddeapllx2695 sshd[1130381]: pam_unix(sshd:session): session opened for user sansbp01(uid=20003846) by (uid=0)
/var/log/secure-20260927:Sep 26 11:26:17 caddeapllx2695 sudo[1130457]: sansbp01 : PWD=/root ; USER=root ; COMMAND=/bin/bash --login -c \/bin\/sh -c echo\ BECOME-SUCCESS-cdrwtmjjynrehqrggzapevbcviwmpgdb\ \;\ \/usr\/bin\/python
/var/log/secure-20260927:Sep 26 11:26:17 caddeapllx2695 sudo[1130457]: pam_unix(sudo-i:session): session opened for user root(uid=0) by (uid=20003846)
/var/log/secure-20260927:Sep 26 11:26:17 caddeapllx2695 sudo[1130457]: pam_unix(sudo-i:session): session closed for user root
/var/log/secure-20260927:Sep 26 11:26:18 caddeapllx2695 sudo[1130501]: sansbp01 : PWD=/root ; USER=root ; COMMAND=/bin/bash --login -c \/bin\/sh -c echo\ BECOME-SUCCESS-wfhrmrnuqogircxstdhquywdqkjcemsl\ \;\ \/usr\/bin\/python
/var/log/secure-20260927:Sep 26 11:26:18 caddeapllx2695 sudo[1130501]: pam_unix(sudo-i:session): session opened for user root(uid=0) by (uid=20003846)
/var/log/secure-20260927:Sep 26 11:26:19 caddeapllx2695 sudo[1130501]: pam_unix(sudo-i:session): session closed for user root
/var/log/secure-20260927:Sep 26 11:26:19 caddeapllx2695 sudo[1130637]: sansbp01 : PWD=/root ; USER=root ; COMMAND=/bin/bash --login -c \/bin\/sh -c echo\ BECOME-SUCCESS-xqlpqhvzyqxbbxngiqngcpfyurqzvufq\ \;\ \/usr\/bin\/python
/var/log/secure-20260927:Sep 26 11:26:19 caddeapllx2695 sudo[1130637]: pam_unix(sudo-i:session): session opened for user root(uid=0) by (uid=20003846)
/var/log/secure-20260927:Sep 26 11:26:19 caddeapllx2695 sudo[1130637]: pam_unix(sudo-i:session): session closed for user root
/var/log/secure-20260927:Sep 26 11:26:19 caddeapllx2695 sudo[1130682]: sansbp01 : PWD=/root ; USER=root ; COMMAND=/bin/bash --login -c \/bin\/sh -c echo\ BECOME-SUCCESS-rskabdzcgvhwabfvykzbvdphteltwilp\ \;\ \/usr\/bin\/python
/var/log/secure-20260927:Sep 26 11:26:19 caddeapllx2695 sudo[1130682]: pam_unix(sudo-i:session): session opened for user root(uid=0) by (uid=20003846)
/var/log/secure-20260927:Sep 26 11:26:19 caddeapllx2695 sudo[1130682]: pam_unix(sudo-i:session): session closed for user root
/var/log/secure-20260927:Sep 26 11:26:20 caddeapllx2695 sudo[1130746]: sansbp01 : PWD=/root ; USER=root ; COMMAND=/bin/bash --login -c \/bin\/sh -c echo\ BECOME-SUCCESS-uuybripoaofcfnnxdrolwitxanmrtawl\ \;\ \/usr\/bin\/python
/var/log/secure-20260927:Sep 26 11:26:20 caddeapllx2695 sudo[1130746]: pam_unix(sudo-i:session): session opened for user root(uid=0) by (uid=20003846)
/var/log/secure-20260927:Sep 26 11:26:20 caddeapllx2695 sudo[1130746]: pam_unix(sudo-i:session): session closed for user root
/var/log/secure-20260927:Sep 26 11:26:20 caddeapllx2695 sudo[1130796]: sansbp01 : PWD=/root ; USER=root ; COMMAND=/bin/bash --login -c \/bin\/sh -c echo\ BECOME-SUCCESS-vxavzlghspefeaineskqggbphzrftgse\ \;\ \/usr\/bin\/python
/var/log/secure-20260927:Sep 26 11:26:20 caddeapllx2695 sudo[1130796]: pam_unix(sudo-i:session): session opened for user root(uid=0) by (uid=20003846)
/var/log/secure-20260927:Sep 26 11:26:23 caddeapllx2695 sudo[1130796]: pam_unix(sudo-i:session): session closed for user root
/var/log/secure-20260927:Sep 26 11:26:23 caddeapllx2695 sudo[1130850]: sansbp01 : PWD=/root ; USER=root ; COMMAND=/bin/bash --login -c \/bin\/sh -c echo\ BECOME-SUCCESS-raftctuklhdeqavxxaqekuclytzsqqpc\ \;\ \/usr\/bin\/python
/var/log/secure-20260927:Sep 26 11:26:23 caddeapllx2695 sudo[1130850]: pam_unix(sudo-i:session): session opened for user root(uid=0) by (uid=20003846)
/var/log/secure-20260927:Sep 26 11:26:23 caddeapllx2695 sudo[1130850]: pam_unix(sudo-i:session): session closed for user root
/var/log/secure-20260927:Sep 26 11:26:23 caddeapllx2695 sudo[1130893]: sansbp01 : PWD=/root ; USER=root ; COMMAND=/bin/bash --login -c \/bin\/sh -c echo\ BECOME-SUCCESS-dkgpmadfxjalxutvrixpkfmkjglldujl\ \;\ \/usr\/bin\/python
/var/log/secure-20260927:Sep 26 11:26:23 caddeapllx2695 sudo[1130893]: pam_unix(sudo-i:session): session opened for user root(uid=0) by (uid=20003846)
/var/log/secure-20260927:Sep 26 11:26:24 caddeapllx2695 sudo[1130893]: pam_unix(sudo-i:session): session closed for user root
/var/log/secure-20260927:Sep 26 11:26:24 caddeapllx2695 sudo[1130982]: sansbp01 : PWD=/root ; USER=root ; COMMAND=/bin/bash --login -c \/bin\/sh -c echo\ BECOME-SUCCESS-vjnfvftlnunsgyspqttwharyzkzmeuvo\ \;\ \/usr\/bin\/python
/var/log/secure-20260927:Sep 26 11:26:24 caddeapllx2695 sudo[1130982]: pam_unix(sudo-i:session): session opened for user root(uid=0) by (uid=20003846)
/var/log/secure-20260927:Sep 26 11:26:24 caddeapllx2695 sudo[1130982]: pam_unix(sudo-i:session): session closed for user root
/var/log/secure-20260927:Sep 26 11:26:24 caddeapllx2695 sudo[1131027]: sansbp01 : PWD=/root ; USER=root ; COMMAND=/bin/bash --login -c \/bin\/sh -c echo\ BECOME-SUCCESS-jmcjdtiamzuozfeegoadyzcpjrrtepda\ \;\ \/usr\/bin\/python
/var/log/secure-20260927:Sep 26 11:26:24 caddeapllx2695 sudo[1131027]: pam_unix(sudo-i:session): session opened for user root(uid=0) by (uid=20003846)
/var/log/secure-20260927:Sep 26 11:26:24 caddeapllx2695 sudo[1131027]: pam_unix(sudo-i:session): session closed for user root
/var/log/secure-20260927:Sep 26 11:26:24 caddeapllx2695 sudo[1131137]: sansbp01 : PWD=/root ; USER=root ; COMMAND=/bin/bash --login -c \/bin\/sh -c echo\ BECOME-SUCCESS-upacktxorsdfupaadqqbtbnjsmaxeemr\ \;\ \/usr\/bin\/python
/var/log/secure-20260927:Sep 26 11:26:24 caddeapllx2695 sudo[1131137]: pam_unix(sudo-i:session): session opened for user root(uid=0) by (uid=20003846)
/var/log/secure-20260927:Sep 26 11:26:25 caddeapllx2695 sudo[1131137]: pam_unix(sudo-i:session): session closed for user root
/var/log/secure-20260927:Sep 26 11:26:25 caddeapllx2695 sudo[1131182]: sansbp01 : PWD=/root ; USER=root ; COMMAND=/bin/bash --login -c \/bin\/sh -c echo\ BECOME-SUCCESS-huabbnoirccaewjbiddvvogujsgkwqaf\ \;\ \/usr\/bin\/python
/var/log/secure-20260927:Sep 26 11:26:25 caddeapllx2695 sudo[1131182]: pam_unix(sudo-i:session): session opened for user root(uid=0) by (uid=20003846)
/var/log/secure-20260927:Sep 26 11:26:25 caddeapllx2695 sudo[1131182]: pam_unix(sudo-i:session): session closed for user root
/var/log/secure-20260927:Sep 26 11:26:25 caddeapllx2695 sudo[1131246]: sansbp01 : PWD=/root ; USER=root ; COMMAND=/bin/bash --login -c \/bin\/sh -c echo\ BECOME-SUCCESS-ukeczjqukfcpgvqjhkcemnubouhgfdhs\ \;\ \/usr\/bin\/python
/var/log/secure-20260927:Sep 26 11:26:25 caddeapllx2695 sudo[1131246]: pam_unix(sudo-i:session): session opened for user root(uid=0) by (uid=20003846)
/var/log/secure-20260927:Sep 26 11:26:25 caddeapllx2695 sudo[1131246]: pam_unix(sudo-i:session): session closed for user root
/var/log/secure-20260927:Sep 26 11:26:25 caddeapllx2695 sudo[1131289]: sansbp01 : PWD=/root ; USER=root ; COMMAND=/bin/bash --login -c \/bin\/sh -c echo\ BECOME-SUCCESS-egrnkpanjarnulrkxtfalbnibnextwst\ \;\ \/usr\/bin\/python
/var/log/secure-20260927:Sep 26 11:26:25 caddeapllx2695 sudo[1131289]: pam_unix(sudo-i:session): session opened for user root(uid=0) by (uid=20003846)
/var/log/secure-20260927:Sep 26 11:26:26 caddeapllx2695 sudo[1131289]: pam_unix(sudo-i:session): session closed for user root
/var/log/secure-20260927:Sep 26 11:26:26 caddeapllx2695 sudo[1131333]: sansbp01 : PWD=/root ; USER=root ; COMMAND=/bin/bash --login -c \/bin\/sh -c echo\ BECOME-SUCCESS-uozdtqmwljtznxnybliwtsmsdbadtvge\ \;\ \/usr\/bin\/python
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# journalctl --since "2026-09-26 11:15" --until "2026-09-26 11:45" --no-pager | head -100
set 26 11:20:20 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1]: Starting system activity accounting tool...
set 26 11:20:20 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1]: sysstat-collect.service: Deactivated successfully.
set 26 11:20:20 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1]: Finished system activity accounting tool.
set 26 11:25:25 caddeapllx2695.agil.nprd.caixa.gov.br nfsidmap[1130380]: nss_name_to_gid: name 'b2b@localdomain' does not map into domain 'agil.nprd.caixa.gov.br'
set 26 11:26:16 caddeapllx2695.agil.nprd.caixa.gov.br sshd[1130381]: pam_sss(sshd:auth): authentication success; logname= uid=0 euid=0 tty=ssh ruser= rhost=10.122.155.67 user=sansbp01
set 26 11:26:16 caddeapllx2695.agil.nprd.caixa.gov.br sshd[1130381]: Accepted password for sansbp01 from 10.122.155.67 port 41170 ssh2
set 26 11:26:16 caddeapllx2695.agil.nprd.caixa.gov.br systemd-logind[848]: New session 158 of user sansbp01.
set 26 11:26:16 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1]: Created slice User Slice of UID 20003846.
set 26 11:26:16 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1]: Starting User Runtime Directory /run/user/20003846...
set 26 11:26:16 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1]: Finished User Runtime Directory /run/user/20003846.
set 26 11:26:16 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1]: Starting User Manager for UID 20003846...
set 26 11:26:16 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1130384]: pam_unix(systemd-user:session): session opened for user sansbp01(uid=20003846) by (uid=0)
set 26 11:26:17 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1130384]: Queued start job for default target Main User Target.
set 26 11:26:17 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1130384]: Created slice User Application Slice.
set 26 11:26:17 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1130384]: Started Mark boot as successful after the user session has run 2 minutes.
set 26 11:26:17 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1130384]: Started Daily Cleanup of User's Temporary Directories.
set 26 11:26:17 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1130384]: Reached target Paths.
set 26 11:26:17 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1130384]: Reached target Timers.
set 26 11:26:17 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1130384]: Starting D-Bus User Message Bus Socket...
set 26 11:26:17 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1130384]: Listening on PipeWire PulseAudio.
set 26 11:26:17 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1130384]: Listening on PipeWire Multimedia System Sockets.
set 26 11:26:17 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1130384]: Starting Create User's Volatile Files and Directories...
set 26 11:26:17 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1130384]: Finished Create User's Volatile Files and Directories.
set 26 11:26:17 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1130384]: Listening on D-Bus User Message Bus Socket.
set 26 11:26:17 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1130384]: Reached target Sockets.
set 26 11:26:17 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1130384]: Reached target Basic System.
set 26 11:26:17 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1130384]: Reached target Main User Target.
set 26 11:26:17 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1130384]: Startup finished in 62ms.
set 26 11:26:17 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1]: Started User Manager for UID 20003846.
set 26 11:26:17 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1]: Started Session 158 of User sansbp01.
set 26 11:26:17 caddeapllx2695.agil.nprd.caixa.gov.br sshd[1130381]: pam_unix(sshd:session): session opened for user sansbp01(uid=20003846) by (uid=0)
set 26 11:26:17 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1130457]: sansbp01 : PWD=/root ; USER=root ; COMMAND=/bin/bash --login -c \/bin\/sh -c echo\ BECOME-SUCCESS-cdrwtmjjynrehqrggzapevbcviwmpgdb\ \;\ \/usr\/bin\/python
set 26 11:26:17 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1130457]: pam_unix(sudo-i:session): session opened for user root(uid=0) by (uid=20003846)
set 26 11:26:17 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1]: Starting Hostname Service...
set 26 11:26:17 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1]: Started Hostname Service.
set 26 11:26:17 caddeapllx2695.agil.nprd.caixa.gov.br python[1130458]: ansible-stat Invoked with path=/opt/jboss-eap/jboss-modules.jar follow=False get_md5=False get_checksum=True get_mime=True get_attributes=True checksum_algorithm=sha1
set 26 11:26:17 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1130457]: pam_unix(sudo-i:session): session closed for user root
set 26 11:26:18 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1130501]: sansbp01 : PWD=/root ; USER=root ; COMMAND=/bin/bash --login -c \/bin\/sh -c echo\ BECOME-SUCCESS-wfhrmrnuqogircxstdhquywdqkjcemsl\ \;\ \/usr\/bin\/python
set 26 11:26:18 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1130501]: pam_unix(sudo-i:session): session opened for user root(uid=0) by (uid=20003846)
set 26 11:26:18 caddeapllx2695.agil.nprd.caixa.gov.br python[1130502]: ansible-setup Invoked with gather_timeout=10 gather_subset=['all'] filter=* fact_path=/etc/ansible/facts.d
set 26 11:26:19 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1130501]: pam_unix(sudo-i:session): session closed for user root
set 26 11:26:19 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1130637]: sansbp01 : PWD=/root ; USER=root ; COMMAND=/bin/bash --login -c \/bin\/sh -c echo\ BECOME-SUCCESS-xqlpqhvzyqxbbxngiqngcpfyurqzvufq\ \;\ \/usr\/bin\/python
set 26 11:26:19 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1130637]: pam_unix(sudo-i:session): session opened for user root(uid=0) by (uid=20003846)
set 26 11:26:19 caddeapllx2695.agil.nprd.caixa.gov.br python[1130638]: ansible-stat Invoked with checksum_algorithm=sha1 get_checksum=True follow=False path=/etc/chrony.conf get_md5=False get_mime=True get_attributes=True
set 26 11:26:19 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1130637]: pam_unix(sudo-i:session): session closed for user root
set 26 11:26:19 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1130682]: sansbp01 : PWD=/root ; USER=root ; COMMAND=/bin/bash --login -c \/bin\/sh -c echo\ BECOME-SUCCESS-rskabdzcgvhwabfvykzbvdphteltwilp\ \;\ \/usr\/bin\/python
set 26 11:26:19 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1130682]: pam_unix(sudo-i:session): session opened for user root(uid=0) by (uid=20003846)
set 26 11:26:19 caddeapllx2695.agil.nprd.caixa.gov.br python[1130683]: ansible-file Invoked with dest=/etc/chrony.conf _original_basename=chrony.conf recurse=False state=file mode=0644 path=/etc/chrony.conf force=False follow=True modification_time_format=%Y%m%d%H%M.%S access_time_format=%Y%m%d%H%M.%S _diff_peek=None src=None modification_time=None access_time=None owner=None group=None seuser=None serole=None selevel=None setype=None attributes=None content=NOT_LOGGING_PARAMETER backup=None remote_src=None regexp=None delimiter=None directory_mode=None unsafe_writes=None
set 26 11:26:19 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1130682]: pam_unix(sudo-i:session): session closed for user root
set 26 11:26:20 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1130746]: sansbp01 : PWD=/root ; USER=root ; COMMAND=/bin/bash --login -c \/bin\/sh -c echo\ BECOME-SUCCESS-uuybripoaofcfnnxdrolwitxanmrtawl\ \;\ \/usr\/bin\/python
set 26 11:26:20 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1130746]: pam_unix(sudo-i:session): session opened for user root(uid=0) by (uid=20003846)
set 26 11:26:20 caddeapllx2695.agil.nprd.caixa.gov.br python[1130747]: ansible-command Invoked with _uses_shell=True _raw_params=systemctl restart chronyd warn=True stdin_add_newline=True strip_empty_ends=True argv=None chdir=None executable=None creates=None removes=None stdin=None
set 26 11:26:20 caddeapllx2695.agil.nprd.caixa.gov.br chronyd[1114918]: chronyd exiting
set 26 11:26:20 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1]: Stopping NTP client/server...
set 26 11:26:20 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1]: chronyd.service: Deactivated successfully.
set 26 11:26:20 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1]: Stopped NTP client/server.
set 26 11:26:20 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1]: Starting NTP client/server...
set 26 11:26:20 caddeapllx2695.agil.nprd.caixa.gov.br chronyd[1130774]: chronyd version 4.3 starting (+CMDMON +NTP +REFCLOCK +RTC +PRIVDROP +SCFILTER +SIGND +ASYNCDNS +NTS +SECHASH +IPV6 +DEBUG)
set 26 11:26:20 caddeapllx2695.agil.nprd.caixa.gov.br chronyd[1130774]: Frequency 10.776 +/- 0.374 ppm read from /var/lib/chrony/drift
set 26 11:26:20 caddeapllx2695.agil.nprd.caixa.gov.br chronyd[1130774]: Loaded seccomp filter (level 2)
set 26 11:26:20 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1]: Started NTP client/server.
set 26 11:26:20 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1130746]: pam_unix(sudo-i:session): session closed for user root
set 26 11:26:20 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1130796]: sansbp01 : PWD=/root ; USER=root ; COMMAND=/bin/bash --login -c \/bin\/sh -c echo\ BECOME-SUCCESS-vxavzlghspefeaineskqggbphzrftgse\ \;\ \/usr\/bin\/python
set 26 11:26:20 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1130796]: pam_unix(sudo-i:session): session opened for user root(uid=0) by (uid=20003846)
set 26 11:26:21 caddeapllx2695.agil.nprd.caixa.gov.br python[1130797]: ansible-dnf Invoked with name=['tuned'] state=installed allow_downgrade=False autoremove=False bugfix=False disable_gpg_check=False disable_plugin=[] disablerepo=[] download_only=False enable_plugin=[] enablerepo=[] exclude=[] installroot=/ install_repoquery=True install_weak_deps=True security=False skip_broken=False update_cache=False update_only=False validate_certs=True lock_timeout=30 conf_file=None disable_excludes=None download_dir=None list=None releasever=None
set 26 11:26:23 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1130796]: pam_unix(sudo-i:session): session closed for user root
set 26 11:26:23 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1130850]: sansbp01 : PWD=/root ; USER=root ; COMMAND=/bin/bash --login -c \/bin\/sh -c echo\ BECOME-SUCCESS-raftctuklhdeqavxxaqekuclytzsqqpc\ \;\ \/usr\/bin\/python
set 26 11:26:23 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1130850]: pam_unix(sudo-i:session): session opened for user root(uid=0) by (uid=20003846)
set 26 11:26:23 caddeapllx2695.agil.nprd.caixa.gov.br python[1130851]: ansible-file Invoked with state=absent path=/etc/sysctl.d/30-nproc-nofile.conf recurse=False force=False follow=True modification_time_format=%Y%m%d%H%M.%S access_time_format=%Y%m%d%H%M.%S _original_basename=None _diff_peek=None src=None modification_time=None access_time=None mode=None owner=None group=None seuser=None serole=None selevel=None setype=None attributes=None content=NOT_LOGGING_PARAMETER backup=None remote_src=None regexp=None delimiter=None directory_mode=None unsafe_writes=None
set 26 11:26:23 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1130850]: pam_unix(sudo-i:session): session closed for user root
set 26 11:26:23 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1130893]: sansbp01 : PWD=/root ; USER=root ; COMMAND=/bin/bash --login -c \/bin\/sh -c echo\ BECOME-SUCCESS-dkgpmadfxjalxutvrixpkfmkjglldujl\ \;\ \/usr\/bin\/python
set 26 11:26:23 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1130893]: pam_unix(sudo-i:session): session opened for user root(uid=0) by (uid=20003846)
set 26 11:26:24 caddeapllx2695.agil.nprd.caixa.gov.br python[1130894]: ansible-file Invoked with state=absent path=/etc/security/limits.d/20-nproc.conf recurse=False force=False follow=True modification_time_format=%Y%m%d%H%M.%S access_time_format=%Y%m%d%H%M.%S _original_basename=None _diff_peek=None src=None modification_time=None access_time=None mode=None owner=None group=None seuser=None serole=None selevel=None setype=None attributes=None content=NOT_LOGGING_PARAMETER backup=None remote_src=None regexp=None delimiter=None directory_mode=None unsafe_writes=None
set 26 11:26:24 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1130893]: pam_unix(sudo-i:session): session closed for user root
set 26 11:26:24 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1130982]: sansbp01 : PWD=/root ; USER=root ; COMMAND=/bin/bash --login -c \/bin\/sh -c echo\ BECOME-SUCCESS-vjnfvftlnunsgyspqttwharyzkzmeuvo\ \;\ \/usr\/bin\/python
set 26 11:26:24 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1130982]: pam_unix(sudo-i:session): session opened for user root(uid=0) by (uid=20003846)
set 26 11:26:24 caddeapllx2695.agil.nprd.caixa.gov.br python[1130983]: ansible-stat Invoked with checksum_algorithm=sha1 get_checksum=True follow=False path=/etc/sysctl.d/90-rhel-sysctl.conf get_md5=False get_mime=True get_attributes=True
set 26 11:26:24 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1130982]: pam_unix(sudo-i:session): session closed for user root
set 26 11:26:24 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1131027]: sansbp01 : PWD=/root ; USER=root ; COMMAND=/bin/bash --login -c \/bin\/sh -c echo\ BECOME-SUCCESS-jmcjdtiamzuozfeegoadyzcpjrrtepda\ \;\ \/usr\/bin\/python
set 26 11:26:24 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1131027]: pam_unix(sudo-i:session): session opened for user root(uid=0) by (uid=20003846)
set 26 11:26:24 caddeapllx2695.agil.nprd.caixa.gov.br python[1131028]: ansible-file Invoked with dest=/etc/sysctl.d/90-rhel-sysctl.conf _original_basename=90-rhel-sysctl.conf recurse=False state=file mode=0644 path=/etc/sysctl.d/90-rhel-sysctl.conf force=False follow=True modification_time_format=%Y%m%d%H%M.%S access_time_format=%Y%m%d%H%M.%S _diff_peek=None src=None modification_time=None access_time=None owner=None group=None seuser=None serole=None selevel=None setype=None attributes=None content=NOT_LOGGING_PARAMETER backup=None remote_src=None regexp=None delimiter=None directory_mode=None unsafe_writes=None
set 26 11:26:24 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1131027]: pam_unix(sudo-i:session): session closed for user root
set 26 11:26:24 caddeapllx2695.agil.nprd.caixa.gov.br chronyd[1130774]: Selected source 10.122.142.12 (relogio.caixa)
set 26 11:26:24 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1131137]: sansbp01 : PWD=/root ; USER=root ; COMMAND=/bin/bash --login -c \/bin\/sh -c echo\ BECOME-SUCCESS-upacktxorsdfupaadqqbtbnjsmaxeemr\ \;\ \/usr\/bin\/python
set 26 11:26:24 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1131137]: pam_unix(sudo-i:session): session opened for user root(uid=0) by (uid=20003846)
set 26 11:26:25 caddeapllx2695.agil.nprd.caixa.gov.br python[1131138]: ansible-stat Invoked with checksum_algorithm=sha1 get_checksum=True follow=False path=/etc/security/limits.d/30-nproc-nofile.conf get_md5=False get_mime=True get_attributes=True
set 26 11:26:25 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1131137]: pam_unix(sudo-i:session): session closed for user root
set 26 11:26:25 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1131182]: sansbp01 : PWD=/root ; USER=root ; COMMAND=/bin/bash --login -c \/bin\/sh -c echo\ BECOME-SUCCESS-huabbnoirccaewjbiddvvogujsgkwqaf\ \;\ \/usr\/bin\/python
set 26 11:26:25 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1131182]: pam_unix(sudo-i:session): session opened for user root(uid=0) by (uid=20003846)
set 26 11:26:25 caddeapllx2695.agil.nprd.caixa.gov.br python[1131183]: ansible-file Invoked with dest=/etc/security/limits.d/30-nproc-nofile.conf _original_basename=30-nproc-nofile.conf recurse=False state=file mode=0644 path=/etc/security/limits.d/30-nproc-nofile.conf force=False follow=True modification_time_format=%Y%m%d%H%M.%S access_time_format=%Y%m%d%H%M.%S _diff_peek=None src=None modification_time=None access_time=None owner=None group=None seuser=None serole=None selevel=None setype=None attributes=None content=NOT_LOGGING_PARAMETER backup=None remote_src=None regexp=None delimiter=None directory_mode=None unsafe_writes=None
set 26 11:26:25 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1131182]: pam_unix(sudo-i:session): session closed for user root
set 26 11:26:25 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1131246]: sansbp01 : PWD=/root ; USER=root ; COMMAND=/bin/bash --login -c \/bin\/sh -c echo\ BECOME-SUCCESS-ukeczjqukfcpgvqjhkcemnubouhgfdhs\ \;\ \/usr\/bin\/python
set 26 11:26:25 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1131246]: pam_unix(sudo-i:session): session opened for user root(uid=0) by (uid=20003846)
set 26 11:26:25 caddeapllx2695.agil.nprd.caixa.gov.br python[1131247]: ansible-lineinfile Invoked with dest=/etc/sysctl.conf line=net.ipv4.tcp_keepalive_time = 180 path=/etc/sysctl.conf state=present backrefs=False create=False backup=False firstmatch=False follow=False regexp=None insertafter=None insertbefore=None validate=None mode=None owner=None group=None seuser=None serole=None selevel=None setype=None attributes=None src=None force=None content=NOT_LOGGING_PARAMETER remote_src=None delimiter=None directory_mode=None unsafe_writes=None
set 26 11:26:25 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1131246]: pam_unix(sudo-i:session): session closed for user root
set 26 11:26:25 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1131289]: sansbp01 : PWD=/root ; USER=root ; COMMAND=/bin/bash --login -c \/bin\/sh -c echo\ BECOME-SUCCESS-egrnkpanjarnulrkxtfalbnibnextwst\ \;\ \/usr\/bin\/python
set 26 11:26:25 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1131289]: pam_unix(sudo-i:session): session opened for user root(uid=0) by (uid=20003846)
set 26 11:26:25 caddeapllx2695.agil.nprd.caixa.gov.br python[1131290]: ansible-command Invoked with _uses_shell=True _raw_params=sysctl -p warn=True stdin_add_newline=True strip_empty_ends=True argv=None chdir=None executable=None creates=None removes=None stdin=None
set 26 11:26:26 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1131289]: pam_unix(sudo-i:session): session closed for user root
set 26 11:26:26 caddeapllx2695.agil.nprd.caixa.gov.br sudo[1131333]: sansbp01 : PWD=/root ; USER=root ; COMMAND=/bin/bash --login -c \/bin\/sh -c echo\ BECOME-SUCCESS-uozdtqmwljtznxnybliwtsmsdbadtvge\ \;\ \/usr\/bin\/python
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# ls -d /usr/openv /opt/commvault /opt/tivoli /opt/veeam 2>/dev/null
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# systemctl list-units --all | grep -iE "netbackup|commvault|dsm|veeam|bacula"
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# ssh 10.116.201.113 "cat /etc/hosts; ls -la /opt/ctmage/ctm/data/CONFIG.dat"
root@10.116.201.113's password:
Permission denied, please try again.
root@10.116.201.113's password:
Permission denied, please try again.
root@10.116.201.113's password:
root@10.116.201.113: Permission denied (publickey,gssapi-keyex,gssapi-with-mic,password).
[root@caddeapllx2695 p585600]#
