dress.unsecure=10.116.89.252 --host-config=host-slave.xml -Djboss.domain.log.dir=/logs/jboss-eap/hc/ -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -Dhttps.protocols=TLSv1.2,TLSv1.3 -c domain.xml
-sh-4.1$
-sh-4.1$
-sh-4.1$ grep -i "ecr-web" /var/log/httpd/*error_log* | tail -50
grep: /var/log/httpd/*error_log*: No such file or directory
-sh-4.1$ grep -rn "ecr-web" /etc/httpd/conf.d/ /etc/httpd/conf/
grep: /etc/httpd/conf.d/: No such file or directory
grep: /etc/httpd/conf/: No such file or directory
-sh-4.1$
-sh-4.1$
-sh-4.1$ sudo su
[sudo] password for p585600:
[root@sbrdeapllx093 p585600]#
[root@sbrdeapllx093 p585600]#
[root@sbrdeapllx093 p585600]# grep -i "ecr-web" /var/log/httpd/*error_log* | tail -50
grep: /var/log/httpd/*error_log*: No such file or directory
[root@sbrdeapllx093 p585600]#
[root@sbrdeapllx093 p585600]# /subsystem=modcluster/mod-cluster-config=configuration:enable-context(virtualhost=default-host,context=ecr-web)
bash: syntax error near unexpected token `virtualhost=default-host,context=ecr-web'
[root@sbrdeapllx093 p585600]#
