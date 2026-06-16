
[root@caddeapllx2484 p585600]# find /opt/httpd /etc/pki -name "*.crt" -o -name "*.pem" 2>/dev/null | grep -v "ca-bundle\|trust\|katello\|legacy" | head -20
/etc/pki/product-default/69.pem
/etc/pki/tls/cert.pem
/etc/pki/tls/certs/ldapclient.pem
/etc/pki/consumer/key.pem
/etc/pki/consumer/cert.pem
/etc/pki/entitlement/2637535356975515052-key.pem
/etc/pki/entitlement/2637535356975515052.pem
/etc/pki/product/204.pem
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]# find /opt/httpd -name "*.crt" -o -name "*.key" 2>/dev/null
/opt/httpd/conf/openssl/pki/tls/private/localhost.key
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
