sudo grep -a -oE "(Caused by: [a-zA-Z.]+(Exception|Error)[^\n]{0,80})" /logs/jboss/jboss-eap/standalone/siemp-java-web/server.log | sort | uniq -c | sort -rn | head -15
