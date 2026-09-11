sed -i 's/10.116.88.148/10.116.26.227/g' /opt/open/sso/7.3.0/standalone/configuration/standalone.xml


grep -A1 "inet-address" /opt/open/sso/7.3.0/standalone/configuration/standalone.xml
