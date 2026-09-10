ls -la /opt/open/sso/7.3.0/bin/init.d/
cat /opt/open/sso/7.3.0/bin/init.d/*


su - spssodr1
cd /opt/open/sso/7.3.0/bin
nohup ./standalone.sh -c standalone.xml > /tmp/jboss_start.log 2>&1 &


tail -f /infra_app/logs/siset/server-*.log
