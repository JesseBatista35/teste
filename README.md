
[root@caddeapllx1567 p585600]#
[root@caddeapllx1567 p585600]#
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
[root@caddeapllx1567 p585600]#
[root@caddeapllx1567 p585600]# su - f517263 -c "head -c1 /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks >/dev/null && echo LEITURA OK || echo SEM PERMISSAO"
LEITURA OK
[root@caddeapllx1567 p585600]#
[root@caddeapllx1567 p585600]#
[root@caddeapllx1567 p585600]# setfacl -m u:f517263:r /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks
[root@caddeapllx1567 p585600]# grep -r "JAVA_TOOL_OPTIONS\|ssl-sirsa" /producao/rotina/RSADB001/ /opt/batch/ 2>/dev/null
[root@caddeapllx1567 p585600]# stat /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks | grep -E "Modify|Change"
Modify: 2026-07-24 15:45:05.866541096 -0300
Change: 2026-10-02 16:03:59.868794055 -0300
[root@caddeapllx1567 p585600]#
