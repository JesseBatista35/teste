grep -A1 "inet-address" /opt/open/sso/7.3.0/standalone/configuration/standalone.xml

cp /opt/open/sso/7.3.0/standalone/configuration/standalone.xml /opt/open/sso/7.3.0/standalone/configuration/standalone.xml.bkp_$(date +%Y%m%d%H%M)
cp /opt/open/sso/7.3.0/standalone/configuration/set_config.properties /opt/open/sso/7.3.0/standalone/configuration/set_config.properties.bkp_$(date +%Y%m%d%H%M)
