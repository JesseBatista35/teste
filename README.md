Denilson, segue o diagnóstico do erro dentro do SIEMP. O log completo está em anexo.

Erro: java.lang.NoSuchFieldError: value ao renderizar /layout/banner_topo.jsp, que entra no template de todas as telas.

Causa: o banner_topo.jsp usa <c:out> através do TLD antigo /WEB-INF/tags/c.tld, que aponta para as classes da JSTL 1.1 (standard-1.1.2.jar, empacotado no WAR). O JBoss 7.4 já fornece a JSTL 1.2, e a mistura das duas versões gera o erro em org.apache.taglibs.standard.tag.el.core.OutTag.

Ajuste sugerido no pacote:

Nas JSPs, trocar <%@ taglib uri="/WEB-INF/tags/c.tld" prefix="c" %> por <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>. O mesmo vale para outros TLDs antigos da JSTL (fmt/fn), se houver.
No pom do siemp-web, deixar como provided: jstl-1.1.2, standard-1.1.2, servlet-api-2.5, jsp-api-2.2 e jboss-j2ee-4.2.2.GA. O servidor já fornece essas APIs, e mantê-las no WAR pode gerar outros conflitos.
Gerar a nova versão e rodar a esteira.
