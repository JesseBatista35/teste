root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# echo | openssl s_client -connect sicsn.caixa:443 -showcerts 2>/dev/null | grep -E "^ *[0-9] s:|i:"
 0 s:C = BR, O = Caixa Economica Federal, CN = sicsn.caixa
   i:C = BR, O = Caixa Economica Federal, CN = AC Interna APL
 1 s:C = BR, O = Caixa Economica Federal, CN = AC Interna APL
   i:C = BR, O = Caixa Economica Federal, CN = AC Interna Caixa
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# ls -la /opt/ctmage/JRE/lib/security/cacerts
-r--r--r-- 1 ctmagelx ctmagelx 163165 fev  5  2026 /opt/ctmage/JRE/lib/security/cacerts
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# /opt/ctmage/JRE/bin/keytool -list -cacerts -storepass changeit 2>/dev/null | grep -i caixa \
 || /opt/ctmage/JRE/bin/keytool -list -keystore /opt/ctmage/JRE/lib/security/cacerts -storepass changeit | grep -i caixa
cadsvgerlx080.intra.caixa.gov.br, 5 de fev. de 2026, trustedCertEntry,
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
