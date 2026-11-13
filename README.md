Próximo passo: comparar a definição do realm internet

Na 471 (root):

grep -n -A10 '<realm name="internet"' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -viE 'secret|credential' | head -15

No 6.4 (10.116.88.20):

sudo grep -n -A10 '<realm name="internet"' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -viE 'secret|credential' | head -15

Como o sifec-intranet do 6.4 vai até a linha 20972, use o primeiro bloco, o de linha menor que 20972.

Também vale ver o realm intranet, porque o token pode estar vindo dele:

grep -n -A10 '<realm name="intranet"' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -viE 'secret|credential' | head -15
