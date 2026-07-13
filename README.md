awk 'NR<=13183 && /<profile /{line=NR; name=$0} END{print line": "name}' /opt/jboss/jboss-eap/dc/configuration/domain.xml

ls -la /opt/jboss/jboss-eap/dc/configuration/domain.xml

