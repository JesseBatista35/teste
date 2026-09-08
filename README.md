
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# cat /opt/httpd/conf.d/vhost.conf
<VirtualHost  *:80>
        ServerName siarg-interno.esteiras.des.caixa

        RewriteEngine On
        RewriteCond %{HTTPS} off
        RewriteRule (.*) https://%{HTTP_HOST}%{REQUEST_URI}
</VirtualHost>
<VirtualHost *:443>
        ServerName siarg-interno.esteiras.des.caixa

        KeepAlive On
        KeepAliveTimeout 60
        MaxKeepAliveRequests 0

        ProxyRequests Off
        ProxyPreserveHost On
        Timeout 300


        RequestHeader set X-Forwarded-Proto "https"
        RequestHeader set X-Forwarded-Port "443"
        #RequestHeader set X-Forwarded-Host "siarg-interno.esteiras.des.caixa"


        # SSL Configuration
        #SSLEngine on
        #SSLProtocol all -SSLv2 -SSLv3
        #SSLCipherSuite HIGH:MEDIUM:!aNULL:!MD5:!SEED:!IDEA
        #SSLCACertificatePath /opt/jboss-eap/standalone/configuration/certificado/des
        #SSLCertificateFile /opt/jboss-eap/standalone/configuration/certificado/des/siarg-interno.esteiras.des.caixa_ACInternaIcptestes.crt
        #SSLCertificateKeyFile /opt/jboss-eap/standalone/configuration/certificado/des/siarg-interno.esteiras.des.caixa_ACInternaIcptestes.key

        # Headers
        Header always set Strict-Transport-Security "max-age=63072000; includeSubDomains; preload"
        Header always set X-Frame-Options DENY
        Header always set X-Content-Type-Options nosniff


        ProxyPass / ajp://localhost:8009/ nocanon
        ProxyPassReverse / ajp://localhost:8009/

        <Location "/status">
            SetHandler server-status
            Require all granted
        </Location>

        LogLevel INFO
        #LogLevel debug
        CustomLog /logs/httpd/siarg-interno.caixa-access.log combined
        ErrorLog /logs/httpd/siarg-interno.caixa-error.log

</VirtualHost>
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# grep -B5 -A30 -i siarg /opt/httpd/conf/httpd.conf
LogFormat "%h %l %u %t \"%r\" %>s %b" common
LogFormat "%{Referer}i -> %U" referer
LogFormat "%{User-agent}i" agent
# BEGIN MONITORACAO LOGFORMAT
SetEnvIf Request_URI "\.png$|\.gif$|\.jpg$|\.js$|\.css$|\.ico$|\/fonts\/" is_exclude
LogFormat "{ \"requestTime\":\"%{%Y-%m-%d %T}t.%{msec_frac}t %{%z}t\", \"sigla\":\"SIARG\", \"responseTime\":\"%D\", \"filename\":\"%f\", \"forwardedIP\":\"%{X-Forwarded-For}i\", \"remoteIP\":\"%h\", \"virtualHost\":\"%V\", \"request\":\"%U\", \"query\":\"%q\", \"method\":\"%m\", \"status\":\"%>s\", \"userAgent\":\"%{User-agent}i\", \"referer\":\"%{Referer}i\", \"bytesResponse\":\"%B\" }" monitoracao
# END MONITORACAO LOGFORMAT

# "combinedio" includes actual counts of actual bytes received (%I) and sent (%O); this
# requires the mod_logio module to be loaded.
#LogFormat "%h %l %u %t \"%r\" %>s %b \"%{Referer}i\" \"%{User-Agent}i\" %I %O" combinedio

#
# The location and format of the access logfile (Common Logfile Format).
# If you do not define any access logfiles within a <VirtualHost>
# container, they will be logged here.  Contrariwise, if you *do*
# define per-<VirtualHost> access logfiles, transactions will be
# logged therein and *not* in this file.
#
#CustomLog logs/access_log common

#
# If you would like to have separate agent and referer logfiles, uncomment
# the following directives.
#
#CustomLog logs/referer_log referer
#CustomLog logs/agent_log agent

#
# For a single logfile with access, agent, and referer information
# (Combined Logfile Format), use the following directive:
#
CustomLog /logs/httpd/access_log combined

#
# Optionally add a line containing the server version and virtual host
[root@caddeapllx2577 p585600]#
tail -50 /logs/httpd/error_log
[Tue Sep 08 00:00:03.139629 2026] [ssl:warn] [pid 723742:tid 723742] AH01873: Init: Session Cache is not configured [hint: SSLSessionCache]
[Tue Sep 08 00:00:03.143054 2026] [mpm_event:notice] [pid 723742:tid 723742] AH00489: Apache/2.4.57 (Red Hat) (Release 15.el8jbcs-SP6) OpenSSL/1.1.1k configured -- resuming normal operations
[Tue Sep 08 00:00:03.143073 2026] [core:notice] [pid 723742:tid 723742] AH00094: Command line: '/opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log'
[Tue Sep 08 08:43:36.906245 2026] [mpm_event:notice] [pid 723742:tid 723742] AH00491: caught SIGTERM, shutting down
[Tue Sep 08 08:43:36.971255 2026] [:notice] [pid 743095:tid 743095] ModSecurity for Apache/2.9.3 (http://www.modsecurity.org/) configured.
[Tue Sep 08 08:43:36.971288 2026] [:notice] [pid 743095:tid 743095] ModSecurity: APR compiled version="1.7.0-8"; loaded version="1.7.0-8"
[Tue Sep 08 08:43:36.971294 2026] [:notice] [pid 743095:tid 743095] ModSecurity: PCRE compiled version="8.42 "; loaded version="8.44 2020-02-12"
[Tue Sep 08 08:43:36.971300 2026] [:warn] [pid 743095:tid 743095] ModSecurity: Loaded PCRE do not match with compiled!
[Tue Sep 08 08:43:36.971302 2026] [:notice] [pid 743095:tid 743095] ModSecurity: LIBXML compiled version="2.9.7"
[Tue Sep 08 08:43:36.971304 2026] [:notice] [pid 743095:tid 743095] ModSecurity: Status engine is currently disabled, enable it by set SecStatusEngine to On.
[Tue Sep 08 08:43:36.986903 2026] [ssl:warn] [pid 743096:tid 743096] AH01873: Init: Session Cache is not configured [hint: SSLSessionCache]
[Tue Sep 08 08:43:36.990221 2026] [mpm_event:notice] [pid 743096:tid 743096] AH00489: Apache/2.4.57 (Red Hat) (Release 15.el8jbcs-SP6) OpenSSL/1.1.1k configured -- resuming normal operations
[Tue Sep 08 08:43:36.990242 2026] [core:notice] [pid 743096:tid 743096] AH00094: Command line: '/opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log'
[Tue Sep 08 08:44:56.420570 2026] [mpm_event:notice] [pid 743096:tid 743096] AH00491: caught SIGTERM, shutting down
[Tue Sep 08 08:45:04.338067 2026] [:notice] [pid 750314:tid 750314] ModSecurity for Apache/2.9.3 (http://www.modsecurity.org/) configured.
[Tue Sep 08 08:45:04.338100 2026] [:notice] [pid 750314:tid 750314] ModSecurity: APR compiled version="1.7.0-8"; loaded version="1.7.0-8"
[Tue Sep 08 08:45:04.338108 2026] [:notice] [pid 750314:tid 750314] ModSecurity: PCRE compiled version="8.42 "; loaded version="8.44 2020-02-12"
[Tue Sep 08 08:45:04.338112 2026] [:warn] [pid 750314:tid 750314] ModSecurity: Loaded PCRE do not match with compiled!
[Tue Sep 08 08:45:04.338114 2026] [:notice] [pid 750314:tid 750314] ModSecurity: LIBXML compiled version="2.9.7"
[Tue Sep 08 08:45:04.338116 2026] [:notice] [pid 750314:tid 750314] ModSecurity: Status engine is currently disabled, enable it by set SecStatusEngine to On.
[Tue Sep 08 08:45:04.352771 2026] [ssl:warn] [pid 750315:tid 750315] AH01873: Init: Session Cache is not configured [hint: SSLSessionCache]
[Tue Sep 08 08:45:04.356503 2026] [mpm_event:notice] [pid 750315:tid 750315] AH00489: Apache/2.4.57 (Red Hat) (Release 15.el8jbcs-SP6) OpenSSL/1.1.1k configured -- resuming normal operations
[Tue Sep 08 08:45:04.356525 2026] [core:notice] [pid 750315:tid 750315] AH00094: Command line: '/opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log'
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
find /opt/httpd/modsecurity.d -iname "*log*"
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# find /opt/httpd/modsecurity.d -iname "*log*"
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
