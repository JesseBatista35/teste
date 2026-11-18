cd /opt/jboss-eap/standalone/deployments
echo "=== libs do EAR (commons-lang) ==="
unzip -l gec-ear.ear | grep -iE "commons-lang|lib/.*lang"
echo "=== conteudo raiz do EAR ==="
unzip -l gec-ear.ear | grep -vE "lib/.*\.jar" | head -40

echo "=== deployment-structure do EAR ==="
unzip -p gec-ear.ear META-INF/jboss-deployment-structure.xml

echo "=== jboss-web / web.xml dos WARs ==="
mkdir -p /tmp/ear_chk && cd /tmp/ear_chk && rm -rf *
unzip -q -o /opt/jboss-eap/standalone/deployments/gec-ear.ear 'gec-web.war' 'gec-api.war'
for w in gec-web gec-api; do
  echo "##### $w jboss-web.xml"; unzip -p $w.war WEB-INF/jboss-web.xml
  echo "##### $w web.xml (security)"; unzip -p $w.war WEB-INF/web.xml | grep -iE -B1 -A3 "security|auth-method|realm|login-config|keycloak"
  echo "##### $w jboss-deployment-structure"; unzip -p $w.war WEB-INF/jboss-deployment-structure.xml
done

echo "=== log ELY01148 com contexto ==="
grep -n -B2 -A12 "ELY01148" /logs/jboss/jboss-eap/standalone/sigec-portabilidade/server.log | head -60
