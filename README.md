
-sh-4.2$ cat /opt/jboss-eap/modules/system/layers/base/br/gov/caixa/sisgr/main/module.xml
<?xml version='1.0' encoding='UTF-8'?>

<module xmlns="urn:jboss:module:1.1" name="br.gov.caixa.sisgr">

    <properties>
        <property name="jboss.api" value="private"/>
    </properties>

    <resources>
        <resource-root path="sisgr-1.2.jar"/>
    </resources>

    <dependencies>
        <module name="javax.faces.api"/>
        <module name="org.apache.log4j"/>
        <module name="javax.api"/>
    </dependencies>
</module>-sh-4.2$
-sh-4.2$
-sh-4.2$
