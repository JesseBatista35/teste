
-sh-4.2$
-sh-4.2$ ls -la /opt/jboss-eap/standalone/deployments/SICMU-ear.ear stat /opt/jboss-eap/standalone/deployments/SICMU-ear.ear
ls: não é possível acessar stat: Arquivo ou diretório não encontrado
-rwxrw-rw- 1 jboss jboss 22593647 Jun 29 11:02 /opt/jboss-eap/standalone/deployments/SICMU-ear.ear
-rwxrw-rw- 1 jboss jboss 22593647 Jun 29 11:02 /opt/jboss-eap/standalone/deployments/SICMU-ear.ear
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ls -la /opt/jboss-eap/standalone/deployments/SICMU-ear.ear stat /opt/jboss-eap/standalone/deployments/SICMU-ear.ear
ls: não é possível acessar stat: Arquivo ou diretório não encontrado
-rwxrw-rw- 1 jboss jboss 22593647 Jun 29 11:02 /opt/jboss-eap/standalone/deployments/SICMU-ear.ear
-rwxrw-rw- 1 jboss jboss 22593647 Jun 29 11:02 /opt/jboss-eap/standalone/deployments/SICMU-ear.ear
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ cd /tmp cp /opt/jboss-eap/standalone/deployments/SICMU-ear.ear . unzip -l SICMU-ear.ear | grep -i "SICMU-web"
-sh-4.2$
-sh-4.2$
-sh-4.2$ unzip -p SICMU-ear.ear SICMU-web.war > SICMU-web.war unzip -l SICMU-web.war | grep -i "vendor.js"
-sh: SICMU-web.war: Permissão negada
-sh-4.2$ unzip -p SICMU-ear.ear SICMU-web.war > SICMU-web.war
-sh: SICMU-web.war: Permissão negada
-sh-4.2$ unzip -l SICMU-web.war | grep -i "vendor.js"
unzip:  cannot find or open SICMU-web.war, SICMU-web.war.zip or SICMU-web.war.ZIP.
-sh-4.2$
