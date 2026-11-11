[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]# grep -H -A2 'deployment name="SICCR-PARAMETROS"' $(find /opt/jboss -name domain.xml)
/opt/jboss/jboss-eap/dc/configuration/domain.xml:        <deployment name="SICCR-PARAMETROS" runtime-name="sifec-ccr-parametros.ear">
/opt/jboss/jboss-eap/dc/configuration/domain.xml-            <content sha1="1eecf4c6065937c24797bf96123dacdc62730ddf"/>
/opt/jboss/jboss-eap/dc/configuration/domain.xml-        </deployment>
--
/opt/jboss/jboss-eap/dc/configuration/domain.xml:                <deployment name="SICCR-PARAMETROS" runtime-name="sifec-ccr-parametros.ear"/>
/opt/jboss/jboss-eap/dc/configuration/domain.xml-            </deployments>
/opt/jboss/jboss-eap/dc/configuration/domain.xml-            <system-properties>
[root@cbrdeapllx471 p585600]#
