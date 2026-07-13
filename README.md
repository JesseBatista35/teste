-sh-4.2$ find /opt/jboss-eap/standalone/deployments -iname "jboss-web.xml" 2>/dev/null
-sh-4.2$ unzip -p /opt/jboss-eap/standalone/deployments/siamc-ear.ear siamc-web-3.0.0-SNAPSHOT.war | \
>   jar tf /dev/stdin 2>/dev/null | grep -i jboss-web
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ mkdir -p /tmp/siamc-check && cd /tmp/siamc-check
-sh-4.2$ unzip -o /opt/jboss-eap/standalone/deployments/siamc-ear.ear -d ear_extract
Archive:  /opt/jboss-eap/standalone/deployments/siamc-ear.ear
   creating: ear_extract/META-INF/
  inflating: ear_extract/META-INF/MANIFEST.MF
   creating: ear_extract/lib/
  inflating: ear_extract/siamc-ejb-3.0.0-SNAPSHOT.jar
  inflating: ear_extract/siamc-web-3.0.0-SNAPSHOT.war
  inflating: ear_extract/lib/siamc-importacao-3.0.0-SNAPSHOT.jar
  inflating: ear_extract/lib/siico-api-1.0.41.jar
  inflating: ear_extract/lib/amsfw-api-1.0.55.jar
  inflating: ear_extract/lib/siamc-api-3.0.0-SNAPSHOT.jar
  inflating: ear_extract/lib/amsfw-web-1.0.55.jar
  inflating: ear_extract/lib/sisdu-client-0.0.0.5.jar
  inflating: ear_extract/siico-ejb-1.0.41.jar
  inflating: ear_extract/amsfw-ejb-1.0.60.jar
  inflating: ear_extract/META-INF/application.xml
   creating: ear_extract/META-INF/maven/
   creating: ear_extract/META-INF/maven/com.unisys.br.siamc/
   creating: ear_extract/META-INF/maven/com.unisys.br.siamc/siamc-ear/
  inflating: ear_extract/META-INF/maven/com.unisys.br.siamc/siamc-ear/pom.xml
  inflating: ear_extract/META-INF/maven/com.unisys.br.siamc/siamc-ear/pom.properties
-sh-4.2$ unzip -o ear_extract/siamc-web-3.0.0-SNAPSHOT.war -d war_extract WEB-INF/jboss-web.xml WEB-INF/web.xml
Archive:  ear_extract/siamc-web-3.0.0-SNAPSHOT.war
  inflating: war_extract/WEB-INF/jboss-web.xml
  inflating: war_extract/WEB-INF/web.xml
-sh-4.2$ cat war_extract/WEB-INF/jboss-web.xml
<?xml version="1.0" encoding="UTF-8"?>
<jboss-web xmlns="https://www.jboss.com/xml/ns/javaee"
           xmlns:xsi="https://www.w3.org/2001/XMLSchema-instance"
           xsi:schemaLocation="https://www.jboss.com/xml/ns/javaee https://www.jboss.org/j2ee/schema/jboss-web_5_1.xsd"
           version="5.1">
    <context-root>siamc</context-root>
    <!--<security-domain>keycloak</security-domain>-->
</jboss-web>-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
