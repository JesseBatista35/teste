ot@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# ps -ef | grep -i "java -D" | awk '{print $2}' | xargs -r kill -9
kill: sending signal to 35332 failed: Processo inexistente
[root@sbrdeapllx104 p585600]# ^C
[root@sbrdeapllx104 p585600]# cd /opt/jboss/jboss-eap/hc/ && rm -rf data tmp
[root@sbrdeapllx104 hc]# cd /opt/jboss/jboss-eap/hc/servers && rm -rf s*
[root@sbrdeapllx104 servers]# cd /opt/jboss/jboss-eap/hc/log/servers/ && rm -rf s*
[root@sbrdeapllx104 servers]# systemctl start jboss-eap7_hc
Job for jboss-eap7_hc.service failed because a configured resource limit was exceeded. See "systemctl status jboss-eap7_hc.service" and "journalctl -xe" for details.
[root@sbrdeapllx104 servers]#
