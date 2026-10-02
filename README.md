
-sh-4.2$ sudo su
[sudo] senha para p585600:
[root@caddeapllx1567 p585600]#
[root@caddeapllx1567 p585600]#
[root@caddeapllx1567 p585600]#
[root@caddeapllx1567 p585600]# setfacl -m u:f517263:r /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks
[root@caddeapllx1567 p585600]# getfacl /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks
getfacl: Removing leading '/' from absolute path names
# file: opt/batch/securefiles/caixa-truststore-acteste-nprd.jks
# owner: ctmagelx
# group: controlm
user::rw-
user:f517263:r--
group::---
mask::r--
other::---

[root@caddeapllx1567 p585600]#
