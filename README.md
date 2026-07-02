
-sh-4.2$ cd /tmp && mkdir checkver_$$ && cd checkver_$$ unzip -o /opt/jboss-eap/standalone/deployments/sisme-ear.ear -d ear_extracted > /dev/null unzip -o ear_extracted/sisme-web.war -d war_extracted > /dev/null find war_extracted -iname "MANIFEST.MF" -exec grep -H -i "version" {} ;
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ find war_extracted -iname "*.properties" | xargs grep -l -i "version" 2>/dev/null
find: ‘war_extracted’: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
