zcat /logs/jboss/jboss-eap/standalone/siarg-interno/server.log.2026-09-07.gz | grep -n "WebXml\|NoClassDefFoundError"


sed -n '1,50p' /logs/jboss/jboss-eap/standalone/siarg-interno/server.log


for f in /logs/jboss/jboss-eap/standalone/siarg-interno/server.log.2026-09-0*.gz; do echo "== $f =="; zgrep -c "WebXmlSingleton" "$f"; done
