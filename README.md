cd /tmp && rm -rf inet && mkdir inet && cd inet
unzip -o -q /opt/jboss-eap/standalone/deployments/sigsj_internet-ear.ear '*.war'
unzip -p *.war WEB-INF/web.xml | grep -A1 'log4j'
cd /tmp && rm -rf /tmp/inet
