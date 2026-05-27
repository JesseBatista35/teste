
[p585600@sspdeapllx0041 ~]$ grep -r "domain.master.address|JBOSS_DOMAIN_MASTER|master.address" /opt/jboss/jboss-eap-7.0/domain/configuration/ 2>/dev/null
[p585600@sspdeapllx0041 ~]$ cat /etc/hosts | grep domain
127.0.0.1   localhost localhost.localdomain localhost4 localhost4.localdomain4
::1         localhost localhost.localdomain localhost6 localhost6.localdomain6
10.116.88.97    sspdeapllx0040  sspdeapllx0040.intra.caixa.gov.br       domain          # Diversos - JBOSS-EAP 7 - domain
[p585600@sspdeapllx0041 ~]$

