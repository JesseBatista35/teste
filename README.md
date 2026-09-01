
[p585600@sspdeaprlx0027 ~]$
[p585600@sspdeaprlx0027 ~]$
[p585600@sspdeaprlx0027 ~]$ whoami
p585600
[p585600@sspdeaprlx0027 ~]$
[p585600@sspdeaprlx0027 ~]$
[p585600@sspdeaprlx0027 ~]$ sudo su

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

Senha SUDO:
[root@sspdeaprlx0027 p585600]#
[root@sspdeaprlx0027 p585600]#
[root@sspdeaprlx0027 p585600]#
[root@sspdeaprlx0027 p585600]#
[root@sspdeaprlx0027 p585600]#
[root@sspdeaprlx0027 p585600]# grep -n -A 6 "<Location /siavl-web>" /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl/siavl.conf
56:    <Location /siavl-web>
57-        Header always set Access-Control-Allow-Origin "*"
58-        Header always set Access-Control-Allow-Methods "GET, POST, PUT, DELETE, OPTIONS"
59-        Header always set Access-Control-Allow-Headers "Accept, Content-Type, Authorization, Origin, X-Requested-With"
60-    </Location>
61-    RewriteCond %{REQUEST_METHOD} =OPTIONS
62-    RewriteRule ^/(siavl-web)(/.*)?$ - [R=204,L]
[root@sspdeaprlx0027 p585600]#
[root@sspdeaprlx0027 p585600]#
[root@sspdeaprlx0027 p585600]#
[root@sspdeaprlx0027 p585600]#
[root@sspdeaprlx0027 p585600]#
[root@sspdeaprlx0027 p585600]#
