
[p585600@sspdeaprlx0027 ~]$ sudo grep -n -B 10 -A 5 "REQUEST_METHOD} =OPTIONS" /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl/siavl.conf
46-      FileETag None
47-      <IfModule mod_headers.c>
48-       Header unset ETag
49-       Header set Cache-Control "max-age=0, no-cache, no-store, must-revalidate"
50-       Header set Pragma "no-cache"
51-       Header set Expires "Wed, 12 Jan 1980 05:00:00 GMT"
52-      </IfModule>
53-    </FilesMatch>
54-    #RewriteCond %{REQUEST_METHOD} ^OPTIONS
55-    #RewriteRule .* - [F]
56:    RewriteCond %{REQUEST_METHOD} =OPTIONS
57-    RewriteRule ^/(siavl-web)(/.*)?$ - [R=204,L]
58-
59-    RewriteCond %{HTTP:Connection} upgrade [NC]
60-    RewriteCond %{HTTP:Upgrade} websocket [NC]
61-    RewriteRule /siavl-web(.*) balancer://wscluster/siavl-web$1 [P,L]
[p585600@sspdeaprlx0027 ~]$

