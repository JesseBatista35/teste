date
ls -la /opt/jboss-eap/standalone/deployments/sisme-ear.ear*


cd /tmp && rm -rf checkver_prova && mkdir checkver_prova && cd checkver_prova
unzip -o /opt/jboss-eap/standalone/deployments/sisme-ear.ear -d ear_extracted | grep -E "\.war|\.jar" | grep -iE "sisme-web|sisme-api|sisme-ejb"


find ear_extracted -iname "versao.txt"

cat ear_extracted/CAMINHO/versao.txt
