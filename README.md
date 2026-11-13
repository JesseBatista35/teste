Próximo passo: comparar a definição do realm internet

Na 471 (root):

grep -n -A10 '<realm name="internet"' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -viE 'secret|credential' | head -15

No 6.4 (10.116.88.20):

sudo grep -n -A10 '<realm name="internet"' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -viE 'secret|credential' | head -15

Como o sifec-intranet do 6.4 vai até a linha 20972, use o primeiro bloco, o de linha menor que 20972.

Também vale ver o realm intranet, porque o token pode estar vindo dele:

grep -n -A10 '<realm name="intranet"' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -viE 'secret|credential' | head -15




[root@cbrdeapllx471 p585600]# grep -n -A10 '<realm name="internet"' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -viE 'secret|credential' | head -15
1429:                <realm name="internet">
1430-                    <auth-server-url>https://logindes.caixa.gov.br/auth</auth-server-url>
1431-                    <ssl-required>external</ssl-required>
1432-                    <disable-trust-manager>true</disable-trust-manager>
1433-                </realm>
1434-                <secure-deployment name="hub-web.war">
1435-                    <realm>intranet</realm>
1436-                    <resource>cli-web-fec</resource>
1438-                </secure-deployment>
1439-                <secure-deployment name="simtr-rest-web.war">
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#




-sh-4.1$ grep -n -A10 '<realm name="intranet"' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -viE 'secret|credential' | head -15
5911:                <realm name="intranet">
5912-                    <auth-server-url>https://login.des.caixa/auth</auth-server-url>
5913-                    <ssl-required>external</ssl-required>
5914-                    <disable-trust-manager>true</disable-trust-manager>
5915-                </realm>
5916-                <realm name="internet">
5917-                    <auth-server-url>https://logindes.caixa.gov.br/auth</auth-server-url>
5918-                    <ssl-required>external</ssl-required>
5919-                    <disable-trust-manager>true</disable-trust-manager>
5920-                </realm>
5921-                <secure-deployment name="fes-web.war">
--
6470:                <realm name="intranet">
6471-                    <auth-server-url>https://login.des.caixa/auth</auth-server-url>
6472-                    <ssl-required>external</ssl-required>
-sh-4.1$



-sh-4.1$ sudo grep -n -A10 '<realm name="internet"' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -viE 'secret|credential' | head -15
5916:                <realm name="internet">
5917-                    <auth-server-url>https://logindes.caixa.gov.br/auth</auth-server-url>
5918-                    <ssl-required>external</ssl-required>
5919-                    <disable-trust-manager>true</disable-trust-manager>
5920-                </realm>
5921-                <secure-deployment name="fes-web.war">
5922-                    <realm>intranet</realm>
5923-                    <resource>cli-web-fes</resource>
5924-                    <auth-server-url>https://login.des.caixa/auth</auth-server-url>
5925-                    <ssl-required>EXTERNAL</ssl-required>
--
6475:                <realm name="internet">
6476-                    <auth-server-url>https://logindes.caixa.gov.br/auth</auth-server-url>
6477-                    <ssl-required>external</ssl-required>
6478-                    <disable-trust-manager>true</disable-trust-manager>
-sh-4.1$


