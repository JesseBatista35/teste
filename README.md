

[sudo] senha para p585600:
[root@caddeapllx763 p585600]#
[root@caddeapllx763 p585600]#
[root@caddeapllx763 p585600]#
[root@caddeapllx763 p585600]#
[root@caddeapllx763 p585600]# CFG=/opt/jboss/jboss-eap/standalone/configuration/standalone-full-ha.xml
[root@caddeapllx763 p585600]#
[root@caddeapllx763 p585600]#
[root@caddeapllx763 p585600]# grep -n 'ajp-listener\|max-post-size\|node-timeout' $CFG
589:                <ajp-listener name="ajp" socket-binding="ajp"/>
590:                <http-listener name="default" socket-binding="http" max-post-size="209715200" redirect-socket="https" enable-http2="true"/>
591:                <https-listener name="https" socket-binding="https" max-post-size="209715200" security-realm="ApplicationRealm" enable-http2="true"/>                                <host name="default-host" alias="localhost">
[root@caddeapllx763 p585600]# grep -iE 'UT000020|UT000047|larger than|max-post-size' /opt/jboss/jboss-eap/standalone/log/server.log | tail
grep: /opt/jboss/jboss-eap/standalone/log/server.log: Arquivo ou diretório não encontrado
[root@caddeapllx763 p585600]#
[root@caddeapllx763 p585600]#
[root@caddeapllx763 p585600]#
[root@caddeapllx763 p585600]#
[root@caddeapllx763 p585600]#
