
-sh-4.2$
-sh-4.2$ oc project simpg-des
Now using project "simpg-des" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ find /opt/jboss -name "*vault*" -type f 2>/dev/null
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -A 5 "<vault>" /opt/jboss/standalone/configuration/standalone-full-ha.xml | head -20
grep: /opt/jboss/standalone/configuration/standalone-full-ha.xml: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ls -la /opt/jboss/standalone/configuration/vault-des 2>/dev/null || echo "NÃO EXISTE"
NÃO EXISTE
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ find /opt/jboss -name "*.keystore" -type f
find: ‘/opt/jboss’: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ ls -la /opt/jboss/standalone/configuration/ | grep -i vault
ls: não é possível acessar /opt/jboss/standalone/configuration/: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
