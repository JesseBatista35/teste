
C:\Users\p585600>curl -k -s -o /dev/null -w "%{http_code}\n" https://migracaosifec.des.caixa/ccr-parametros-api/
200

C:\Users\p585600>curl -k -s -o /dev/null -w "%{http_code}\n" https://migracaosifec.des.caixa/ccr-parametros-web/
404

C:\Users\p585600>




**
-sh-4.1$
-sh-4.1$ sudo grep -n 'SICCR-PARAMETROS"' /opt/jboss/jboss-eap/dc/configuration/domain.xml
[sudo] password for p585600:
Sorry, try again.
[sudo] password for p585600:
Sorry, try again.
[sudo] password for p585600:
56870:        <deployment name="SICCR-PARAMETROS" runtime-name="sifec-ccr-parametros-3.2.0.1-b1073.ear">
57754:                <deployment name="SICCR-PARAMETROS" runtime-name="sifec-ccr-parametros-3.2.0.1-b1073.ear"/>
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ curl -k -s -o /dev/null -w "%{http_code}\n" https://migracaosifec.des.caixa/ccr-parametros-web/
000
-sh-4.1$ curl -k -s -o /dev/null -w "%{http_code}\n" https://migracaosifec.des.caixa/ccr-parametros-api/
000
-sh-4.1$
-sh-4.1$
-sh-4.1$ sudo sed -n '56870,56872p' /opt/jboss/jboss-eap/dc/configuration/domain.xml
        <deployment name="SICCR-PARAMETROS" runtime-name="sifec-ccr-parametros-3.2.0.1-b1073.ear">
            <content sha1="17eb02c18df167b8c50d388445f7a02cd4dd2c9e"/>
        </deployment>
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$
**
