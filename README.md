
[root@caddeapllx2484 verificacao_sicmu2]# cd /tmp/verificacao_sicmu2
[root@caddeapllx2484 verificacao_sicmu2]# cp /opt/jboss-eap/standalone/deployments/SICMU-ear.ear .
cp: sobrescrever “./SICMU-ear.ear”?
[root@caddeapllx2484 verificacao_sicmu2]# unzip -p SICMU-ear.ear META-INF/jboss-deployment-structure.xml
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
</jboss-deployment-structure>[root@caddeapllx2484 verificacao_sicmu2]#
