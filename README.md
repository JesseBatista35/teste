cd /opt/jboss/jboss-eap/hc/ && rm -rf data tmp && cd servers && rm -rf s* && cd /opt/jboss/jboss-eap/hc/log/servers/ && rm -rf s*

exit

sudo systemctl start jboss-eap7_hc.service
ps -ef | grep jboss




[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]# cd /opt/jboss/jboss-eap/hc/ && rm -rf data tmp && cd servers && rm -rf s* && cd /opt/jboss/jboss-eap/hc/log/servers/ && rm -rf s*
bash: cd: /opt/jboss/jboss-eap/hc/: No such file or directory
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
