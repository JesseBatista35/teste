
su - spssodr1
cd /opt/open/sso/7.3.0/bin
nohup ./standalone.sh -c standalone.xml > /tmp/jboss_start.log 2>&1 &


tail -f /infra_app/logs/siset/server-crjtqapllx036.log

ps -ef | grep java
