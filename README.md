[root@caddeapllx2484 p585600]# find /opt/httpd -name "*.conf" | xargs grep -l "sicmu-intranet-update" 2>/dev/null
/opt/httpd/conf.d/vhost.conf
[root@caddeapllx2484 p585600]# cat /opt/httpd/conf/httpd.conf | grep -i "include\|vhost\|sicmu"
Include conf.modules.d/*.conf
#   Indexes Includes FollowSymLinks SymLinksifOwnerMatch ExecCGI MultiViews
# Possible values include: debug, info, notice, warn, error, crit,
LogFormat "{ \"requestTime\":\"%{%Y-%m-%d %T}t.%{msec_frac}t %{%z}t\", \"sigla\":\"SICMU\", \"responseTime\":\"%D\", \"filename\":\"%f\", \"forwardedIP\":\"%{X-Forwarded-For}i\", \"remoteIP\":\"%h\", \"virtualHost\":\"%V\", \"request\":\"%U\", \"query\":\"%q\", \"method\":\"%m\", \"status\":\"%>s\", \"userAgent\":\"%{User-agent}i\", \"referer\":\"%{Referer}i\", \"bytesResponse\":\"%B\" }" monitoracao
# "combinedio" includes actual counts of actual bytes received (%I) and sent (%O); this
# Set to "EMail" to also include a mailto: link to the ServerAdmin.
# Note that if you include a trailing / on fakename then the server will
# We include the /icons/ alias for FancyIndexed directory listings.  If you
# and not include in the listing.  Shell-style wildcarding is permitted.
# For files that include their own HTTP headers:
# To parse .shtml files for server-side includes (SSI):
# (You will also need to add "Includes" to the "Options" directive.)
AddOutputFilter INCLUDES .shtml
# includes to substitute the appropriate text.
#   Alias /error/include/ "/your/include/path/"
# /opt/httpd/www/error/include/ files and
# copying them to /your/include/path/, even on a per-VirtualHost basis.
#<IfModule mod_include.c>
#        Options IncludesNoExec
#        AddOutputFilter Includes html
# a directory that does not include the trailing slash.  This fixes a
# <URL:http://httpd.apache.org/docs/2.4/vhosts/>
IncludeOptional conf.d/*.conf
[root@caddeapllx2484 p585600]# ls /opt/httpd/conf.d/
old  vhost.conf
[root@caddeapllx2484 p585600]#
