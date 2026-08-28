sudo sed -i 's|<root-logger>|<logger category="br.gov.caixa.psc"><level name="DEBUG"/></logger>\n        <root-logger>|' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
