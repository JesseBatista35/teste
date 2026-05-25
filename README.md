grep -n "sisag\|jvm\|javaagent" /opt/jboss/jboss-eap-7.0/domain/configuration/domain.xml | head -80


sed -n '140,200p' /opt/jboss/jboss-eap-7.0/domain/configuration/host.xml
