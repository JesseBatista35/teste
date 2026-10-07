cat /opt/jboss/version.txt 2>/dev/null || cat /opt/jboss/jboss-eap/version.txt

ps -ef | grep -i [j]boss | grep -o 'jboss-modules.jar\|-D\[Standalone\]\|eap[^ /]*'
