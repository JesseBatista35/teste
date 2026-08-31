[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# cp siavl.conf backup/siavl.conf.$(date +%Y%m%d).WO0000081522583-v2
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# mv siavl.conf.NOVO siavl.conf
mv: overwrite `siavl.conf'? yes
[root@sspdeaprlx0027 siavl]# /opt/apache/jbcs-httpd24-2.4/httpd/sbin/apachectl configtest
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# grep -n -B 2 -A 10 "REQUEST_METHOD} =OPTIONS" siavl.conf
62-        Header always set Access-Control-Allow-Headers "Accept, Content-Type, Authorization, Origin, X-Requested-With"
63-    </Location>
64:    RewriteCond %{REQUEST_METHOD} =OPTIONS
65-    RewriteRule ^/(siavl-web)(/.*)?$ - [R=204,L]
66-
67-    RewriteCond %{HTTP:Connection} upgrade [NC]
68-    RewriteCond %{HTTP:Upgrade} websocket [NC]
69-    RewriteRule /siavl-web(.*) balancer://wscluster/siavl-web$1 [P,L]
70-
71-    ProxyRequests Off
72-    ProxyPass /siavl-web balancer://httpcluster/siavl-web
73-    ProxyPassReverse /siavl-web balancer://httpcluster/siavl-web
74-
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
