cp -p /opt/jboss-eap/bin/standalone.conf /opt/jboss-eap/bin/standalone.conf.bkp_20261119

echo '' >> /opt/jboss-eap/bin/standalone.conf
echo '# SIGSJ - lib nativa SenhasSIIBC (criptografia SIPER/SIROT)' >> /opt/jboss-eap/bin/standalone.conf
echo 'JAVA_OPTS="$JAVA_OPTS -Djava.library.path=/apl/sigsj/lib"' >> /opt/jboss-eap/bin/standalone.conf

tail -3 /opt/jboss-eap/bin/standalone.conf

systemctl restart jboss-eap-standalone
sleep 60
systemctl status jboss-eap-standalone --no-pager | head -5
ps -ef | grep -v grep | grep -o "java.library.path=[^ ]*"
ls -la /opt/jboss-eap/standalone/deployments/ | grep -E "deployed|failed"
