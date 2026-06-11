
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]# find /opt/httpd -name "vhost*" 2>/dev/null
/opt/httpd/conf.d/vhost.conf
[root@caddeapllx2484 p585600]# find /opt/httpd/conf -name "*.crt" -o -name "*.pem" -o -name "*.key" 2>/dev/null
/opt/httpd/conf/openssl/pki/tls/private/localhost.key
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]# find /opt/httpd/conf -type f | xargs grep -l "SSLCertificate\|ssl_certificate" 2>/dev/null
[root@caddeapllx2484 p585600]# grep -r "SSLCertificate\|SSLEngine\|443" /opt/httpd/conf/ 2>/dev/null | grep -v "^#"
/opt/httpd/conf/httpd.conf:Listen 443
[root@caddeapllx2484 p585600]# grep -r "SSLCertificate\|SSLEngine" /opt/httpd/conf.modules.d/ 2>/dev/null | grep -v "^#"
[root@caddeapllx2484 p585600]# find /opt/httpd/conf -name "*.conf" | xargs grep -l "SSL\|443" 2>/dev/null
/opt/httpd/conf/httpd.conf
[root@caddeapllx2484 p585600]#
