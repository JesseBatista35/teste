Procure a classe em todo o host, incluindo os três deployments externos e os módulos:

echo "=== qualquer jar/rar do host com AppServlet ==="
find /opt /u01 /app /home -xdev \( -name '*.jar' -o -name '*.rar' \) 2>/dev/null | while read j; do
  unzip -l "$j" 2>/dev/null | grep -q 'arqrefweb/controle/AppServlet' && echo "$j"
done

echo "=== deployments externos ==="
cd /opt/jboss-eap/standalone/deployments
for j in framework.jar framework_sisgd.jar wmq.jmsra.rar; do
  echo "-- $j"; unzip -l $j | grep -ci arqref
done

echo "=== o que o framework_sisgd tem de arqref ==="
unzip -l framework_sisgd.jar | grep -i arqref | head

Verifique também no código, o que decide a correção definitiva. Na raiz do projeto (Azure DevOps, aba Files, busca arqref-web), ou nos poms:

gec-web/pom.xml e o pom.xml raiz: existe uma dependência arqref-web (ou arqrefweb)? Com que scope? provided explicaria a ausência no war.
Compare com o pom da branch de origem (rtc/STRY00052082_migracao_java_17, ou a anterior à migração) para ver se a dependência foi removida.

Me mande a saída do find e o que achar nos poms. O resultado indica:

Achou o jar em algum lugar do host (por exemplo, em um módulo ou diretório legado). Dá para expor como módulo ou incluir no EAR, conforme o caso.
Não achou em lugar nenhum e o pom não o tem. Falta a dependência no gec-web/pom.xml. Eu preciso da versão e do groupId no Nexus, e o arqref-core ajuda a inferir (br.gov.caixa.arqref:arqref-core:3.7.2.2, então provavelmente br.gov.caixa.arqref:arqref-web:3.7.2.2). A confirmação é no Nexus.
