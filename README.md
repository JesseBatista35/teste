find /opt/jboss-eap/standalone/data/content -iname "*.war" 2>/dev/null


find /opt/jboss-eap/standalone/tmp/vfs -iname "*.xhtml" 2>/dev/null | grep -i -E "login|index"


curl -v http://10.116.201.44:443/siarg/
curl -v http://10.116.201.44:443/siarg/index.xhtml


