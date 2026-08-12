-sh-4.2$ cat /opt/jboss-eap/modules/system/layers/base/br/gov/caixa/framework/main/module.xml
<?xml version='1.0' encoding='UTF-8'?>

<module xmlns="urn:jboss:module:1.1" name="br.gov.caixa.framework">

    <properties>
        <property name="jboss.api" value="private"/>
    </properties>

    <resources>
        <resource-root path="framework-2.0.1.jar"/>
    </resources>

    <dependencies>
        <module name="javax.api"/>
        <module name="org.apache.log4j"/>
    </dependencies>
</module>-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ls -la /opt/jboss-eap/modules/system/layers/base/br/gov/caixa/framework/main/
total 68
drwxr-xr-x 2 root root    51 Jul 30 16:43 .
drwxr-xr-x 3 root root    18 Jul 30 16:43 ..
-rw-r--r-- 1 root root 63527 Jul 30 16:43 framework-2.0.1.jar
-rw-r--r-- 1 root root   409 Jul 30 16:43 module.xml
-sh-4.2$
-sh-4.2$
-sh-4.2$ unzip -p /opt/jboss-eap/standalone/deployments/SICMU-ear.ear META-INF/jboss-deployment-structure.xml
<?xml version="1.0" encoding="UTF-8"?>
<jboss-deployment-structure xmlns="urn:jboss:deployment-structure:1.1">
        <ear-subdeployments-isolated>false</ear-subdeployments-isolated>
        <sub-deployment name="SICMU-ejb.jar">
                <dependencies>
                        <module name="br.gov.caixa.psc.jconnector" />
                        <module name="br.gov.caixa.sisgr" />
                        <module name="javax.jms.api" />
                </dependencies>
        </sub-deployment>
        <sub-deployment name="SICMU-web.war">
                <dependencies>
                        <module name="org.primefaces" meta-inf="export" slot="4.0">
                    <imports>
                       <include path="META-INF" />
                    </imports>
                 </module>
                        <module name="org.apache.poi" slot="3.11.a"/>
                        <module name="org.jfree.chart" slot="1.0.9.a"/>
                        <module name="net.sourceforge.jasperreports" />
                        <module name="br.gov.caixa.sisgr" />
                        <module name="br.gov.caixa.psc.jconnector" />
                        <module name="org.apache.commons.io" />
                </dependencies>
        </sub-deployment>
</jboss-deployment-structure>-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
