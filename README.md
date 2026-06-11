
[root@caddeapllx2484 p585600]# find /opt/httpd/conf.d/old -name "ssl.conf.disabled" | xargs grep -A 30 "VirtualHost.*443" | head -50
<VirtualHost _default_:443>

# General setup for the virtual host, inherited from global configuration
#DocumentRoot "/opt/httpd/www/html"
#ServerName localhost:443

# Use separate log files for the SSL virtual host; note that LogLevel
# is not inherited from httpd.conf.
ErrorLog logs/ssl_error_log
TransferLog logs/ssl_access_log
LogLevel warn

#   SSL Engine Switch:
#   Enable/Disable SSL for this virtual host.
SSLEngine on

#   SSL Protocol support:
# List the enable protocol levels with which clients will be able to
# connect.  Disable SSLv2 access by default:
SSLProtocol all -SSLv2

#   SSL Cipher Suite:
#   List the ciphers that the client is permitted to negotiate.
#   See the mod_ssl documentation for a complete list.
SSLCipherSuite HIGH:MEDIUM:!aNULL:!MD5

#   Speed-optimized SSL Cipher configuration:
#   If speed is your main concern (on busy HTTPS servers e.g.),
#   you might want to force clients to specific, performance
#   optimized ciphers. In this case, prepend those ciphers
#   to the SSLCipherSuite list, and enable SSLHonorCipherOrder.
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]# find /opt/httpd -name "vhost*" 2>/dev/null
/opt/httpd/conf.d/vhost.conf
[root@caddeapllx2484 p585600]# find /opt/httpd/conf -name "*.crt" -o -name "*.pem" -o -name "*.key" 2>/dev/null
/opt/httpd/conf/openssl/pki/tls/private/localhost.key
[root@caddeapllx2484 p585600]#
