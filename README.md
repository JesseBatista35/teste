grep -n "datasources" -A 5 /opt/jboss/jboss-eap/hc/configuration/domain.xml | head -60

grep -n "jdbc:oracle\|connection-url\|<datasource " -B2 -A2 /opt/jboss/jboss-eap/hc/configuration/domain.xml

grep -iE "domain-controller|<remote|host=" /opt/jboss/jboss-eap/hc/configuration/host-slave.xml | head -20
