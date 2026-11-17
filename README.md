outro e está na fase POST_MODULE do gec-web.war:

ClassNotFoundException: br.gov.caixa.arqrefweb.controle.AppServlet

AppServlet é a classe que o web.xml registra como servlet, e ela vem do framework ArqRef (arqrefweb). Falta saber qual jar a contém e se esse jar está chegando ao classpath do war. Rode isto como root no host. Descompacta o EAR em /tmp e não mexe no que está em deployments:

rm -rf /tmp/ear && mkdir /tmp/ear && cd /tmp/ear
unzip -q /opt/jboss-eap/standalone/deployments/gec-ear.ear
mkdir war && cd war && unzip -q ../gec-web.war && cd ..

echo "=== web.xml: AppServlet ==="
grep -n -B2 -A4 "AppServlet" war/WEB-INF/web.xml

echo "=== jars que contêm AppServlet (EAR e WAR) ==="
for j in $(find . -name '*.jar'); do unzip -l "$j" 2>/dev/null | grep -q 'arqrefweb/controle/AppServlet' && echo "$j"; done

echo "=== classes soltas no WAR ==="
find war/WEB-INF/classes -path '*arqrefweb*' | head

echo "=== jars arqref no EAR/WAR ==="
find . -iname '*arqref*' | sort

echo "=== modulos do JBoss com arqref ==="
find /opt/jboss-eap/modules -iname '*arqref*' | head

Me mande a saída inteira. Pelo que ela mostrar, o caminho é um destes:

Nenhum jar contém a classe. O pacote arqrefweb (jar arqref-web* ou similar) não está indo para o war. É dependência faltando ou escopo provided no gec-web/pom.xml, e a correção é no pom.
O jar existe no EAR ou no war. O problema é de visibilidade ou isolamento de classloader. Aí ajusto o jboss-deployment-structure.xml (como já fizemos).
O jar só existe como módulo do JBoss ou no ambiente antigo. Então a esteira ou o módulo precisa ser provido, como o que fizemos com os framework*.jar.
