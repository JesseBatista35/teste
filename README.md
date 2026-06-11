
[root@caddeapllx2484 p585600]# ls /opt/httpd/conf.d/old/
manual.conf       mod_jk.conf.sample        proxy_ajp.conf  ssl.conf.disabled               userdir.conf  workers.properties.sample
mod_cluster.conf  mod_security.conf.sample  README          uriworkermap.properties.sample  welcome.conf
[root@caddeapllx2484 p585600]# grep -r "VirtualHost.*443\|ssl\|SSL" /opt/httpd/conf.d/ | head -20
/opt/httpd/conf.d/old/mod_jk.conf.sample:# JkOptions indicates to send SSL KEY SIZE
/opt/httpd/conf.d/old/ssl.conf.disabled:# This is the Apache server configuration file providing SSL support.
/opt/httpd/conf.d/old/ssl.conf.disabled:# directives see <URL:http://httpd.apache.org/docs/2.4/mod/mod_ssl.html>
/opt/httpd/conf.d/old/ssl.conf.disabled:# When we also provide SSL we have to listen to the
/opt/httpd/conf.d/old/ssl.conf.disabled:##  SSL Global Context
/opt/httpd/conf.d/old/ssl.conf.disabled:##  All SSL configuration in this context applies both to
/opt/httpd/conf.d/old/ssl.conf.disabled:##  the main server and all SSL-enabled virtual hosts.
/opt/httpd/conf.d/old/ssl.conf.disabled:SSLPassPhraseDialog exec:/opt/httpd/sbin/httpd-ssl-pass-dialog
/opt/httpd/conf.d/old/ssl.conf.disabled:#   Configure the SSL Session Cache: First the mechanism
/opt/httpd/conf.d/old/ssl.conf.disabled:SSLSessionCache         shmcb:/opt/httpd/run/sslcache(512000)
/opt/httpd/conf.d/old/ssl.conf.disabled:SSLSessionCacheTimeout  300
/opt/httpd/conf.d/old/ssl.conf.disabled:#   SSL engine uses internally for inter-process synchronization.
/opt/httpd/conf.d/old/ssl.conf.disabled:#   SSL library. The seed data should be of good random quality.
/opt/httpd/conf.d/old/ssl.conf.disabled:#   block. So, if available, use this one instead. Read the mod_ssl User
/opt/httpd/conf.d/old/ssl.conf.disabled:SSLRandomSeed startup file:/dev/urandom  256
/opt/httpd/conf.d/old/ssl.conf.disabled:SSLRandomSeed connect builtin
/opt/httpd/conf.d/old/ssl.conf.disabled:#SSLRandomSeed startup file:/dev/random  512
/opt/httpd/conf.d/old/ssl.conf.disabled:#SSLRandomSeed connect file:/dev/random  512
/opt/httpd/conf.d/old/ssl.conf.disabled:#SSLRandomSeed connect file:/dev/urandom 512
/opt/httpd/conf.d/old/ssl.conf.disabled:# Use "SSLCryptoDevice" to enable any supported hardware
[root@caddeapllx2484 p585600]# grep -r "443\|ssl\|SSL" /opt/httpd/conf/httpd.conf | grep -v "^#" | head -20
Listen 443
[root@caddeapllx2484 p585600]# find /opt/httpd -name "ssl*" -o -name "*ssl*" 2>/dev/null | head -10
/opt/httpd/cache/mod_ssl
/opt/httpd/conf/openssl
/opt/httpd/conf/openssl/pki/tls/openssl.cnf
/opt/httpd/conf.d/old/ssl.conf.disabled
/opt/httpd/conf.modules.d/00-ssl.conf
/opt/httpd/include/mod_ssl.h
/opt/httpd/include/mod_ssl_openssl.h
/opt/httpd/include/openssl
/opt/httpd/include/openssl/opensslconf-x86_64.h
/opt/httpd/include/openssl/opensslconf.h
[root@caddeapllx2484 p585600]#
