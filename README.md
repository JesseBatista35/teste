brdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# echo -e 'jboss soft nproc 16384\njboss hard nproc 16384' > /etc/security/limits.d/30-jboss-nproc.conf
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# ps -ef | grep -i "java -D" | awk '{print $2}' | xargs -r kill -9
kill: sending signal to 35332 failed: Processo inexistente
[root@sbrdeapllx104 p585600]#


