
[root@caddeapllx2484 p585600]# sudo sed -i 's/virtuallHost/VirtualHost/g' /opt/httpd/conf.d/vhost.conf
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]# sudo /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -t
AH00526: Syntax error on line 33 of /opt/httpd/conf.d/vhost.conf:
Invalid command 'VirtualHost', perhaps misspelled or defined by a module not included in the server configuration
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#

