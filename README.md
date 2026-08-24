# Ver o padrão de permissão correto no CSD1 (que funciona)
ls -la /home/jboss-eap-6.4/bin/standaloneCSD1.sh 2>/dev/null
ls -la /home/jboss-eap-6.4/bin/standaloneCSD6.sh

# Corrigir permissão de CSD2
chmod 755 /home/jboss-eap-6.4/bin/standaloneCSD2.sh
ls -la /home/jboss-eap-6.4/bin/standaloneCSD2.sh


chmod 755 /home/jboss-eap-6.4/bin/standaloneCSD6.sh

mkdir -p /var/run/jboss-as /var/log/jboss-as
cat /dev/null > /var/log/jboss-as/consoleCSD2.log
LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/var/run/jboss-as/standaloneCSD2.pid \
  /home/jboss-eap-6.4/bin/standaloneCSD2.sh -c standaloneCSD2.xml \
  > /var/log/jboss-as/consoleCSD2.log 2>&1 &

sleep 15
tail -50 /var/log/jboss-as/consoleCSD2.log
ps -ef | grep -i CSD2

