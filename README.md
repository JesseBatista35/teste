
[root@sbrdeapllx0001 p585600]#
[root@sbrdeapllx0001 p585600]#
[root@sbrdeapllx0001 p585600]# ps -ef | grep -oE 'jboss\.home\.dir=[^ ]+|jboss\.domain\.[a-z.]*dir=[^ ]+' | sort -u
jboss.domain.base.dir=/opt/jboss/jboss-eap/dc
jboss.domain.base.dir=/opt/jboss/jboss-eap/dc??-Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize??-Dhttps.protocols=TLSv1.2,TLSv1.3
jboss.domain.log.dir=/logs/jboss-eap/dc/
jboss.home.dir=/opt/jboss/jboss-eap
[root@sbrdeapllx0001 p585600]#
[root@sbrdeapllx0001 p585600]#
[root@sbrdeapllx0001 p585600]#
[root@sbrdeapllx0001 p585600]#
