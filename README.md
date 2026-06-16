sudo sed -i 's/^VirtualHost \*:443>$/<VirtualHost *:443>/' /opt/httpd/conf.d/vhost.conf


sudo /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -t





[root@caddeapllx2484 p585600]# sudo sed -i 's/^VirtualHost \*:443>$/<VirtualHost *:443>/' /opt/httpd/conf.d/vhost.conf
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]# sudo /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -t
httpd: Syntax error on line 849 of /opt/httpd/conf/httpd.conf: Syntax error on line 1 of /opt/httpd/conf.d/vhost.conf: /opt/httpd/conf.d/vhost.conf:1: <VirtualHost> was not closed.
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
