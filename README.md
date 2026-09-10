scp standalone.xml set_config.properties p585600@10.116.26.227:/tmp/




cp /tmp/standalone.xml /opt/open/sso/7.3.0/standalone/configuration/standalone.xml
cp /tmp/set_config.properties /opt/open/sso/7.3.0/standalone/configuration/set_config.properties
chown spssodr1:singlesignon /opt/open/sso/7.3.0/standalone/configuration/standalone.xml /opt/open/sso/7.3.0/standalone/configuration/set_config.properties
