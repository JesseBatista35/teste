
-sh-4.2$ find /opt/jboss-eap/standalone/configuration -iname "*jconnector*"
-sh-4.2$ find / -iname "*jconnector*" 2>/dev/null
/opt/jboss-eap/modules/system/layers/base/br/gov/caixa/psc/jconnector
/opt/jboss-eap/modules/system/layers/base/br/gov/caixa/psc/jconnector/main/jconnector-2.10.jar
/tmp/src/jconnector-2.10.jar
-sh-4.2$ unzip -l /opt/jboss-eap/modules/system/layers/base/br/gov/caixa/psc/jconnector/main/jconnector-2.10.jar | grep -i properties
-sh-4.2$
-sh-4.2$
-sh-4.2$ cat /opt/jboss-eap/modules/system/layers/base/br/gov/caixa/psc/jconnector/main/module.xml
<?xml version='1.0' encoding='UTF-8'?>

<module xmlns="urn:jboss:module:1.1" name="br.gov.caixa.psc.jconnector">

    <properties>
        <property name="jboss.api" value="private"/>
    </properties>

    <resources>
        <resource-root path="jconnector-2.10.jar"/>
    </resources>

    <dependencies>
        <module name="javax.api"/>
        <module name="org.apache.log4j"/>
        <module name="br.gov.caixa.framework"/>
    </dependencies>
</module>-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -i "jconnector" -A 3 -B 3 /opt/jboss-eap/standalone/configuration/standalone.xml
-sh-4.2$
-sh-4.2$
-sh-4.2$ find /opt/jboss-eap/standalone/deployments -iname "*jconnector*" 2>/dev/null
-sh-4.2$
-sh-4.2$
-sh-4.2$


