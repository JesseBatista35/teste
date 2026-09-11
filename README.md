ps -ef | grep java

kill -9 <PID_AQUI>

ps -ef | grep java

su - spssodr1
cd /opt/open/sso/7.3.0/bin
nohup ./standalone.sh -c standalone.xml > /tmp/jboss_start2.log 2>&1 &
tail -f /tmp/jboss_start2.log
