
-sh-4.2$ date
Sex Jul  3 12:18:46 -03 2026
-sh-4.2$ ls -la /opt/jboss-eap/standalone/deployments/sisme-ear.ear*
-rwxrw-rw- 1 jboss jboss 83159033 Jul  2 19:46 /opt/jboss-eap/standalone/deployments/sisme-ear.ear
-rw-r--r-- 1 jboss jboss       13 Jul  2 19:46 /opt/jboss-eap/standalone/deployments/sisme-ear.ear.deployed
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ cd /tmp && rm -rf checkver_prova && mkdir checkver_prova && cd checkver_prova
-sh-4.2$
-sh-4.2$
-sh-4.2$ unzip -o /opt/jboss-eap/standalone/deployments/sisme-ear.ear -d ear_extracted | grep -E "\.war|\.jar" | grep -iE "sisme-web|sisme-api|sisme-ejb"
  inflating: ear_extracted/sisme-web-2.93.2.0.war
  inflating: ear_extracted/lib/sisme-api-2.93.2.0.jar
  inflating: ear_extracted/sisme-ejb-2.93.2.0.jar
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ find ear_extracted -iname "versao.txt"
-sh-4.2$ cat ear_extracted/CAMINHO/versao.txt
cat: ear_extracted/CAMINHO/versao.txt: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ cat ear_extracted/CAMINHO/version.txt
cat: ear_extracted/CAMINHO/version.txt: Arquivo ou diretório não encontrado
-sh-4.2$ find ear_extracted -iname "version.txt"
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ date
Sex Jul  3 13:59:15 -03 2026
-sh-4.2$


ele ta criando m novo com a versão antiga... 

<img width="1886" height="278" alt="image" src="https://github.com/user-attachments/assets/177986a9-9507-42bf-8a91-185a9378f679" />


-sh-4.2$
-sh-4.2$ date
Sex Jul  3 12:18:46 -03 2026
-sh-4.2$ ls -la /opt/jboss-eap/standalone/deployments/sisme-ear.ear*
-rwxrw-rw- 1 jboss jboss 83159033 Jul  2 19:46 /opt/jboss-eap/standalone/deployments/sisme-ear.ear
-rw-r--r-- 1 jboss jboss       13 Jul  2 19:46 /opt/jboss-eap/standalone/deployments/sisme-ear.ear.deployed
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ cd /tmp && rm -rf checkver_prova && mkdir checkver_prova && cd checkver_prova
-sh-4.2$
-sh-4.2$
-sh-4.2$ unzip -o /opt/jboss-eap/standalone/deployments/sisme-ear.ear -d ear_extracted | grep -E "\.war|\.jar" | grep -iE "sisme-web|sisme-api|sisme-ejb"
  inflating: ear_extracted/sisme-web-2.93.2.0.war
  inflating: ear_extracted/lib/sisme-api-2.93.2.0.jar
  inflating: ear_extracted/sisme-ejb-2.93.2.0.jar
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ find ear_extracted -iname "versao.txt"
-sh-4.2$ cat ear_extracted/CAMINHO/versao.txt
cat: ear_extracted/CAMINHO/versao.txt: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ cat ear_extracted/CAMINHO/version.txt
cat: ear_extracted/CAMINHO/version.txt: Arquivo ou diretório não encontrado
-sh-4.2$ find ear_extracted -iname "version.txt"
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ date
Sex Jul  3 13:59:15 -03 2026
-sh-4.2$ ls -la /opt/jboss-eap/standalone/deployments/sisme-ear.ear*
-rwxrw-rw- 1 jboss jboss 86315293 Jul  3 14:03 /opt/jboss-eap/standalone/deployments/sisme-ear.ear
-rw-r--r-- 1 jboss jboss       13 Jul  3 14:03 /opt/jboss-eap/standalone/deployments/sisme-ear.ear.deployed
-sh-4.2$ unzip -o /opt/jboss-eap/standalone/deployments/sisme-ear.ear -d ear_extracted | grep -E "\.war|\.jar" | grep -iE "sisme-web|sisme-api|sisme-ejb"
  inflating: ear_extracted/sisme-web-2.90.8.0.war
  inflating: ear_extracted/lib/sisme-api-2.90.8.0.jar
  inflating: ear_extracted/sisme-ejb-2.90.8.0.jar
-sh-4.2$






