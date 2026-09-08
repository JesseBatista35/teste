
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# cat /opt/httpd/conf/httpd.conf | grep -i -E "include|listen"
# Listen: Allows you to bind Apache to specific IP addresses and/or
# Change this to Listen on specific IP addresses as shown below to
#Listen 12.34.56.78:80
Listen 80
Listen 443
#Listen 8443
Include conf.modules.d/*.conf
#   Indexes Includes FollowSymLinks SymLinksifOwnerMatch ExecCGI MultiViews
# Possible values include: debug, info, notice, warn, error, crit,
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
IncludeOptional conf.d/*.conf
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# find /opt/httpd/conf -iname "*vhost*"
[root@caddeapllx2577 p585600]#
