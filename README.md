
[root@caddeapllx2484 p585600]# curl -vk https://127.0.0.1/sicmu 2>&1 | head -20]
head: opção inválida -- ]
Try 'head --help' for more information.
[root@caddeapllx2484 p585600]# curl -vk https://127.0.0.1/sicmu 2>&1 | head -20]
head: opção inválida -- ]
Try 'head --help' for more information.
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]# grep -r "SSLCertificate\|SSLEngine\|ssl" /opt/httpd/conf.modules.d/ 2>/dev/null | head -10
/opt/httpd/conf.modules.d/00-ssl.conf:LoadModule ssl_module modules/mod_ssl.so
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]# ls /opt/httpd/conf.modules.d
00-base.conf  00-mpm.conf    00-proxyhtml.conf  00-systemd.conf  01-ldap.conf  01-session.conf  10-mod_security.conf.disabled
00-dav.conf   00-proxy.conf  00-ssl.conf        01-cgi.conf      01-md.conf    10-h2.conf       10-proxy_h2.conf
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
