sudo -u jboss7 cp /opt/jboss/jboss-eap-7.0/domain/configuration/host.xml /opt/jboss/jboss-eap-7.0/domain/configuration/host.xml.bkp_$(date +%Y%m%d)


grep -n -A 20 'name="sisag-lx0041"' /opt/jboss/jboss-eap-7.0/domain/configuration/host.xml
