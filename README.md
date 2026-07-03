
[p585600@caddeapllx2577 ~]$ unzip -l /opt/jboss-eap/standalone/deployments/siarg.war | grep -iE "login.xhtml|index.xhtml|home.xhtml"
     2918  06-25-2026 20:28   WEB-INF/templates/template_login.xhtml
      155  06-25-2026 20:28   home.xhtml
      156  06-25-2026 20:28   index.xhtml
     2962  06-25-2026 20:28   login.xhtml
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$ jar tf /opt/jboss-eap/standalone/deployments/siarg.war | grep -v "WEB-INF/classes|WEB-INF/lib" | head -50
META-INF/MANIFEST.MF
META-INF/
WEB-INF/
WEB-INF/errorpages/
WEB-INF/templates/
WEB-INF/classes/
WEB-INF/classes/files/
WEB-INF/classes/reports/
WEB-INF/classes/reports/imagens/
WEB-INF/classes/META-INF/
WEB-INF/classes/br/
WEB-INF/classes/br/gov/
WEB-INF/classes/br/gov/caixa/
WEB-INF/classes/br/gov/caixa/gitecsa/
WEB-INF/classes/br/gov/caixa/gitecsa/siarg/
WEB-INF/classes/br/gov/caixa/gitecsa/siarg/dao/
WEB-INF/classes/br/gov/caixa/gitecsa/siarg/dao/impl/
WEB-INF/classes/br/gov/caixa/gitecsa/siarg/model/
WEB-INF/classes/br/gov/caixa/gitecsa/siarg/model/dto/
WEB-INF/classes/br/gov/caixa/gitecsa/siarg/model/comparator/
WEB-INF/classes/br/gov/caixa/gitecsa/siarg/model/relatorio/
WEB-INF/classes/br/gov/caixa/gitecsa/siarg/enumerator/
WEB-INF/classes/br/gov/caixa/gitecsa/siarg/service/
WEB-INF/classes/br/gov/caixa/gitecsa/siarg/dto/
WEB-INF/classes/br/gov/caixa/gitecsa/siarg/email/
WEB-INF/classes/br/gov/caixa/gitecsa/siarg/ws/
WEB-INF/classes/br/gov/caixa/gitecsa/siarg/ws/model/
WEB-INF/classes/br/gov/caixa/gitecsa/siarg/ws/security/
WEB-INF/classes/br/gov/caixa/gitecsa/siarg/ws/exception/
WEB-INF/classes/br/gov/caixa/gitecsa/siarg/ws/serializer/
WEB-INF/classes/br/gov/caixa/gitecsa/siarg/helper/
WEB-INF/classes/br/gov/caixa/gitecsa/siarg/controller/
WEB-INF/classes/br/gov/caixa/gitecsa/siarg/schedule/
WEB-INF/classes/br/gov/caixa/gitecsa/siarg/servlet/
WEB-INF/classes/br/gov/caixa/gitecsa/siarg/util/
WEB-INF/classes/br/gov/caixa/gitecsa/siarg/exporter/
WEB-INF/classes/br/gov/caixa/gitecsa/siarg/security/
WEB-INF/classes/br/gov/caixa/gitecsa/arquitetura/
WEB-INF/classes/br/gov/caixa/gitecsa/arquitetura/dao/
WEB-INF/classes/br/gov/caixa/gitecsa/arquitetura/enumerator/
WEB-INF/classes/br/gov/caixa/gitecsa/arquitetura/repository/
WEB-INF/classes/br/gov/caixa/gitecsa/arquitetura/service/
WEB-INF/classes/br/gov/caixa/gitecsa/arquitetura/exception/
WEB-INF/classes/br/gov/caixa/gitecsa/arquitetura/controller/
WEB-INF/classes/br/gov/caixa/gitecsa/arquitetura/web/
WEB-INF/classes/br/gov/caixa/gitecsa/arquitetura/util/
WEB-INF/classes/br/gov/caixa/gitecsa/arquitetura/entity/
WEB-INF/classes/br/gov/caixa/gitecsa/arquitetura/hibernate/
WEB-INF/classes/br/gov/caixa/gitecsa/arquitetura/converter/
WEB-INF/classes/br/gov/caixa/gitecsa/arquitetura/interceptor/
[p585600@caddeapllx2577 ~]$
