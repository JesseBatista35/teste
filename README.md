
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

      
