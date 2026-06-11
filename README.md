[root@caddeapllx2484 p585600]# curl -vk https://127.0.0.1/sicmu 2>&1 | head -20
* About to connect() to 127.0.0.1 port 443 (#0)
*   Trying 127.0.0.1...
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0* Connected to 127.0.0.1 (127.0.0.1) port 443 (#0)
* Initializing NSS with certpath: sql:/etc/pki/nssdb
* NSS error -12263 (SSL_ERROR_RX_RECORD_TOO_LONG)
* SSL received a record that exceeded the maximum permissible length.
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
* Closing connection 0
curl: (35) SSL received a record that exceeded the maximum permissible length.
[root@caddeapllx2484 p585600]# ls /opt/httpd/conf.d/old/ | grep -v sample
manual.conf
mod_cluster.conf
proxy_ajp.conf
README
ssl.conf.disabled
userdir.conf
welcome.conf
[root@caddeapllx2484 p585600]# cat /opt/httpd/conf.d/old/ssl.conf.disabled | grep -v "^#\|^$" | head -40
Listen localhost:443
AddType application/x-x509-ca-cert .crt
AddType application/x-pkcs7-crl    .crl
SSLPassPhraseDialog exec:/opt/httpd/sbin/httpd-ssl-pass-dialog
SSLSessionCache         shmcb:/opt/httpd/run/sslcache(512000)
SSLSessionCacheTimeout  300
Mutex default
SSLRandomSeed startup file:/dev/urandom  256
SSLRandomSeed connect builtin
SSLCryptoDevice builtin
<VirtualHost _default_:443>
ErrorLog logs/ssl_error_log
TransferLog logs/ssl_access_log
LogLevel warn
SSLEngine on
SSLProtocol all -SSLv2
SSLCipherSuite HIGH:MEDIUM:!aNULL:!MD5
SSLCertificateFile /opt/httpd/conf/openssl/pki/tls/certs/localhost.crt
SSLCertificateKeyFile /opt/httpd/conf/openssl/pki/tls/private/localhost.key
<Files ~ "\.(cgi|shtml|phtml|php3?)$">
    SSLOptions +StdEnvVars
</Files>
<Directory "/opt/httpd/www/cgi-bin">
    SSLOptions +StdEnvVars
</Directory>
BrowserMatch "MSIE [2-5]" \
         nokeepalive ssl-unclean-shutdown \
         downgrade-1.0 force-response-1.0
CustomLog logs/ssl_request_log \
          "%t %h %{SSL_PROTOCOL}x %{SSL_CIPHER}x \"%r\" %b"
</VirtualHost>
[root@caddeapllx2484 p585600]#
