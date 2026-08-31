
[root@sspdeaprlx0027 siavl05]# ps aux | grep -E "siavl-httpd|siavl02-httpd|siavl03-httpd|siavl04-httpd|siavl05-httpd" | grep -v inter
apache    7538  0.0  0.1 271116  7816 ?        Ss   Aug28   0:08 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl-httpd.log -k start
apache    8542  0.0  0.1 271112  7808 ?        Ss   Aug28   0:08 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl02-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl02-httpd.log -k start
apache    9496  0.0  0.1 271112  7812 ?        Ss   Aug28   0:08 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl03-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl03-httpd.log -k start
apache   10476  0.0  0.1 271112  7808 ?        Ss   Aug28   0:07 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl04-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl04-httpd.log -k start
apache   11463  0.0  0.1 271112  7812 ?        Ss   Aug28   0:08 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl05-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl05-httpd.log -k start
apache   19076  0.0  0.0 270612  3236 ?        S    12:28   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl-httpd.log -k start
apache   19077  0.0  0.1 1707028 5764 ?        Sl   12:28   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl-httpd.log -k start
apache   19079  0.0  0.1 1543124 5556 ?        Sl   12:28   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl-httpd.log -k start
apache   19184  0.0  0.0 270608  3232 ?        S    12:28   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl02-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl02-httpd.log -k start
apache   19185  0.0  0.1 1641488 5728 ?        Sl   12:28   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl02-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl02-httpd.log -k start
apache   19187  0.0  0.1 1412048 5492 ?        Sl   12:28   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl02-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl02-httpd.log -k start
apache   19304  0.0  0.0 270608  3236 ?        S    12:28   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl03-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl03-httpd.log -k start
apache   19305  0.0  0.2 1182736 9596 ?        Sl   12:28   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl03-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl03-httpd.log -k start
apache   19307  0.0  0.1 953296  5272 ?        Sl   12:28   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl03-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl03-httpd.log -k start
apache   19420  0.0  0.0 270608  3232 ?        S    12:29   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl04-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl04-httpd.log -k start
apache   19421  0.0  0.1 1182736 5504 ?        Sl   12:29   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl04-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl04-httpd.log -k start
apache   19423  0.0  0.1 953296  5276 ?        Sl   12:29   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl04-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl04-httpd.log -k start
apache   19524  0.0  0.0 270608  3236 ?        S    12:29   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl05-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl05-httpd.log -k start
apache   19525  0.0  0.1 1117200 7532 ?        Sl   12:29   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl05-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl05-httpd.log -k start
apache   19526  0.0  0.1 887760  5244 ?        Sl   12:29   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl05-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl05-httpd.log -k start
root     19703  0.0  0.0 103460   984 pts/3    S+   12:29   0:00 grep -E siavl-httpd|siavl02-httpd|siavl03-httpd|siavl04-httpd|siavl05-httpd
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# curl -i -X OPTIONS https://agenciadigital.des.caixa:8002/siavl-web/index.html -H "Origin: https://exemplo.com"
curl: (60) Peer certificate cannot be authenticated with known CA certificates
More details here: http://curl.haxx.se/docs/sslcerts.html

curl performs SSL certificate verification by default, using a "bundle"
 of Certificate Authority (CA) public keys (CA certs). If the default
 bundle file isn't adequate, you can specify an alternate file
 using the --cacert option.
If this HTTPS server uses a certificate signed by a CA represented in
 the bundle, the certificate verification probably failed due to a
 problem with the certificate (it might be expired, or the name might
 not match the domain name in the URL).
If you'd like to turn off curl's verification of the certificate, use
 the -k (or --insecure) option.
[root@sspdeaprlx0027 siavl05]#
