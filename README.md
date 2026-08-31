
[root@sspdeaprlx0027 siavl05]# chown apache:apache /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl02/siavl02.conf
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# /opt/apache/jbcs-httpd24-2.4/httpd/sbin/apachectl configtest
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# for n in 02 03 04 05; do
>   echo "=== siavl${n}.conf ==="
>   grep -n -B 2 -A 2 "REQUEST_METHOD} =OPTIONS" /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl${n}/siavl${n}.conf
> done
=== siavl02.conf ===
51-        Header always set Access-Control-Allow-Headers "Accept, Content-Type, Authorization, Origin, X-Requested-With"
52-    </Location>
53:    RewriteCond %{REQUEST_METHOD} =OPTIONS
54-    RewriteRule ^/(siavl-web)(/.*)?$ - [R=204,L]
55-
=== siavl03.conf ===
51-        Header always set Access-Control-Allow-Headers "Accept, Content-Type, Authorization, Origin, X-Requested-With"
52-    </Location>
53:    RewriteCond %{REQUEST_METHOD} =OPTIONS
54-    RewriteRule ^/(siavl-web)(/.*)?$ - [R=204,L]
55-
=== siavl04.conf ===
51-        Header always set Access-Control-Allow-Headers "Accept, Content-Type, Authorization, Origin, X-Requested-With"
52-    </Location>
53:   RewriteCond %{REQUEST_METHOD} =OPTIONS
54-   RewriteRule ^/(siavl-web)(/.*)?$ - [R=204,L]
55-
=== siavl05.conf ===
51-        Header always set Access-Control-Allow-Headers "Accept, Content-Type, Authorization, Origin, X-Requested-With"
52-    </Location>
53:    RewriteCond %{REQUEST_METHOD} =OPTIONS
54-    RewriteRule ^/(siavl-web)(/.*)?$ - [R=204,L]
55-
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
