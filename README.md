Achamos o erro que o Denilson está vendo. Ele aparece 73 vezes:

Caused by: java.lang.NoSuchFieldError: value
Caused by: javax.servlet.jsp.JspException: ServletException

O que significa: uma página JSP do SIEMP chama uma classe esperando um campo value que não existe na versão da biblioteca carregada no JBoss 7.4. Isso costuma acontecer quando o pacote traz uma biblioteca antiga (taglib, JSTL, Struts, displaytag, jsp-api, servlet-api ou el-api) que conflita com a versão do JBoss 7.4, ou quando a lib foi compilada contra uma versão diferente. É um problema de empacotamento/código, não de ambiente. Para afirmar com certeza, preciso ver a pilha completa e saber qual classe dispara o erro.

Pegar a pilha completa de uma ocorrência (na 2864)
sudo grep -a -m1 -B10 -A40 "NoSuchFieldError: value" /logs/jboss/jboss-eap/standalone/siemp-java-web/server.log

Nas linhas at ... logo abaixo do NoSuchFieldError, a primeira classe mostra de qual biblioteca vem o erro.

Para ver quais bibliotecas vêm dentro do EAR:

ls /opt/jboss-eap/standalone/deployments/
unzip -l /opt/jboss-eap/standalone/deployments/siemp.ear | grep -iE "\.jar|\.war"

Se o nome do EAR for outro, troque pelo que apareceu no ls. Depois, dentro do WAR:

unzip -p /opt/jboss-eap/standalone/deployments/siemp.ear siemp-web.war > /tmp/siemp-web.war && unzip -l /tmp/siemp-web.war | grep -iE "WEB-INF/lib/.*(jstl|jsp|servlet|el-api|struts|taglib|standard|display)"

Me manda a saída da pilha e a lista de libs, que eu te digo exatamente qual jar está conflitando e qual ajuste o dev precisa fazer.

Prévia para o Denilson

Denilson, achei no log: o erro é java.lang.NoSuchFieldError: value na renderização de páginas JSP. Ele apareceu 73 vezes. Esse tipo de erro indica conflito de versão de biblioteca entre o pacote do SIEMP e o JBoss 7.4 (taglib, JSTL, Struts ou similar). Já estou levantando a pilha completa para identificar qual biblioteca é e te mando em seguida. Também te envio o log completo do servidor.
