1. A causa real (a classe que lança o NoSuchFieldError)
sudo grep -a -m1 -A12 "Caused by: java.lang.NoSuchFieldError: value" /logs/jboss/jboss-eap/standalone/siemp-java-web/server.log

A primeira linha at ... depois do Caused by mostra a classe culpada. Se vier de br.gov.caixa... (framework) ou de uma taglib, saberemos qual jar é.

2. Bibliotecas do pacote (com o nome certo)
unzip -l /opt/jboss-eap/standalone/deployments/siemp-ear.ear | grep -iE "\.jar|\.war"
unzip -p /opt/jboss-eap/standalone/deployments/siemp-ear.ear siemp-web.war > /tmp/siemp-web.war && unzip -l /tmp/siemp-web.war | grep -i "WEB-INF/lib/"
3. O que o banner_topo.jsp usa
unzip -p /tmp/siemp-web.war layout/banner_topo.jsp | grep -nE "taglib|import|<%@|\.value"

Se o primeiro at apontar para uma classe do framework (br.gov.caixa...), o problema pode estar no framework.jar 2.0.1 que fornecemos pelo ambiente. Nesse caso, o banner foi feito para outra versão do framework e a correção pode ser nossa (versão do framework) ou do dev. Me manda as três saídas que eu fecho o diagnóstico.
