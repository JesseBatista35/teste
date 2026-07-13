
-sh-4.1$ awk 'NR<=13183 && /<profile /{line=NR; name=$0} END{print line": "name}' /opt/jboss/jboss-eap/dc/configuration/domain.xml
13108:         <profile name="full-ha-siouv">
-sh-4.1$ ls -la /opt/jboss/jboss-eap/dc/configuration/domain.xml
-rw-rw-r-- 1 jboss jboss 4084127 Jul 13 14:49 /opt/jboss/jboss-eap/dc/configuration/domain.xml
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$

