
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
-sh-4.1$
