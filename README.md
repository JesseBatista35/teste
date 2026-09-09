cp -r /opt/jboss/jboss-eap/modules_bkp/system/layers/base/sun \
      /opt/jboss/jboss-eap/modules/system/layers/base/

chown -R jboss:jboss /opt/jboss/jboss-eap/modules/system/layers/base/sun

# validar que veio completo
find /opt/jboss/jboss-eap/modules/system/layers/base/sun -maxdepth 2

systemctl reset-failed jboss-eap7_hc
systemctl start jboss-eap7_hc
sleep 60
ps -ef | grep jboss
tail -80 /logs/jboss-eap/console-stdout.log
