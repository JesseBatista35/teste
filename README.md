unzip -l /opt/jboss-eap/standalone/deployments/SICMU-ear.ear

ls -la /tmp/SICMU-web.war


mkdir -p ~/verificacao_sicmu
cd ~/verificacao_sicmu
cp /opt/jboss-eap/standalone/deployments/SICMU-ear.ear .
unzip -l SICMU-ear.ear


