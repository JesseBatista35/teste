
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$ ps -ef | grep -i node
p585600  123298 122903  0 15:41 pts/1    00:00:00 grep -i node
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$ ps -ef | grep -i pm2
p585600  123338 122903  0 15:41 pts/1    00:00:00 grep -i pm2
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$ sudo netstat -tulnp | grep 8604
tcp        0      0 10.116.20.76:8604           0.0.0.0:*                   LISTEN      124550/httpd
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$ cat /opt/open/apache/2.4.6/https-sirpl.tqs.intra.corerj.caixa8604/httpd/httpd.conf | grep -i proxy
LoadModule proxy_module /opt/open/apache/2.4.6/modules/mod_proxy.so
LoadModule proxy_connect_module /opt/open/apache/2.4.6/modules/mod_proxy_connect.so
LoadModule proxy_ftp_module /opt/open/apache/2.4.6/modules/mod_proxy_ftp.so
LoadModule proxy_http_module /opt/open/apache/2.4.6/modules/mod_proxy_http.so
LoadModule proxy_fcgi_module /opt/open/apache/2.4.6/modules/mod_proxy_fcgi.so
LoadModule proxy_scgi_module /opt/open/apache/2.4.6/modules/mod_proxy_scgi.so
#LoadModule proxy_fdpass_module /opt/open/apache/2.4.6/modules/mod_proxy_fdpass.so
LoadModule proxy_wstunnel_module /opt/open/apache/2.4.6/modules/mod_proxy_wstunnel.so
LoadModule proxy_ajp_module /opt/open/apache/2.4.6/modules/mod_proxy_ajp.so
#LoadModule proxy_balancer_module /opt/open/apache/2.4.6/modules/mod_proxy_balancer.so
LoadModule proxy_express_module /opt/open/apache/2.4.6/modules/mod_proxy_express.so
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$ crontab -l
no crontab for p585600
[p585600@srjtqaprlx015 ~]$ crontab -l -u spapatr1 2>/dev/null
[p585600@srjtqaprlx015 ~]$ ls -la /etc/init.d/ | grep -i sirpl
lrwxrwxrwx   1 root root    82 Aug  4  2018 sirpl.tqs.https -> /opt/open/apache/2.4.6/https-sirpl.tqs.intra.corerj.caixa8604/scripts/apache-admin
[p585600@srjtqaprlx015 ~]$ systemctl list-units --all | grep -i sirpl
-bash: systemctl: command not found
[p585600@srjtqaprlx015 ~]$
