# CSD2
mkdir -p /var/run/jboss-as /var/log/jboss-as
cat /dev/null > /var/log/jboss-as/consoleCSD2.log
LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/var/run/jboss-as/standaloneCSD2.pid \
  /home/jboss-eap-6.4/bin/standaloneCSD2.sh -c standaloneCSD2.xml \
  > /var/log/jboss-as/consoleCSD2.log 2>&1 &

# aguardar alguns segundos e checar
sleep 15
tail -50 /var/log/jboss-as/consoleCSD2.log
ps -ef | grep -i CSD2# CSD2
mkdir -p /var/run/jboss-as /var/log/jboss-as
cat /dev/null > /var/log/jboss-as/consoleCSD2.log
LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/var/run/jboss-as/standaloneCSD2.pid \
  /home/jboss-eap-6.4/bin/standaloneCSD2.sh -c standaloneCSD2.xml \
  > /var/log/jboss-as/consoleCSD2.log 2>&1 &

# aguardar alguns segundos e checar
sleep 15
tail -50 /var/log/jboss-as/consoleCSD2.log
ps -ef | grep -i CSD2
