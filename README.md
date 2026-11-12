
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$ sudo grep -a -m1 -A12 "Caused by: java.lang.NoSuchFieldError: value" /logs/jboss/jboss-eap/standalone/siemp-java-web/server.log
Caused by: java.lang.NoSuchFieldError: value
        at deployment.siemp-ear.ear.siemp-web.war//org.apache.taglibs.standard.tag.el.core.OutTag.evaluateExpressions(OutTag.java:99)
        at deployment.siemp-ear.ear.siemp-web.war//org.apache.taglibs.standard.tag.el.core.OutTag.doStartTag(OutTag.java:57)
        at org.apache.jsp.layout.banner_005ftopo_jsp._jspx_meth_c_005fout_005f0(banner_005ftopo_jsp.java:256)
        at org.apache.jsp.layout.banner_005ftopo_jsp._jspService(banner_005ftopo_jsp.java:114)
        ... 110 more

2026-11-12 10:38:41,561 ERROR [io.undertow.request] (default task-7) UT005023: Exception handling request to /siemp/layout/template.jsp: javax.servlet.ServletException: javax.servlet.jsp.JspException: ServletException in '/layout/banner_topo.jsp': value
        at io.undertow.jsp@2.0.14.Final-redhat-00001//org.apache.jasper.runtime.PageContextImpl.doHandlePageException(PageContextImpl.java:889)
        at io.undertow.jsp@2.0.14.Final-redhat-00001//org.apache.jasper.runtime.PageContextImpl.handlePageException(PageContextImpl.java:818)
        at org.apache.jsp.layout.template_jsp._jspService(template_jsp.java:247)
        at io.undertow.jsp@2.0.14.Final-redhat-00001//org.apache.jasper.runtime.HttpJspBase.service(HttpJspBase.java:70)
        at javax.servlet.api@2.0.0.Final-redhat-00001//javax.servlet.http.HttpServlet.service(HttpServlet.java:590)
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$ unzip -l /opt/jboss-eap/standalone/deployments/siemp-ear.ear | grep -iE "\.jar|\.war"
 37098135  11-09-2026 10:23   siemp-web.war
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$ unzip -p /opt/jboss-eap/standalone/deployments/siemp-ear.ear siemp-web.war > /tmp/siemp-web.war && unzip -l /tmp/siemp-web.war | grep -i "WEB-INF/lib/"
        0  11-09-2026 10:23   WEB-INF/lib/
  2645149  11-09-2026 10:11   WEB-INF/lib/xalan-2.5.0.jar
    68622  11-09-2026 10:11   WEB-INF/lib/commons-fileupload-1.3.jar
   138956  11-09-2026 10:11   WEB-INF/lib/commons-validator-1.3.1.jar
   168446  11-09-2026 10:11   WEB-INF/lib/commons-digester-1.6.jar
    38015  11-09-2026 10:11   WEB-INF/lib/commons-logging-1.0.4.jar
  1869113  11-09-2026 10:11   WEB-INF/lib/poi-3.9.jar
    73098  11-09-2026 10:11   WEB-INF/lib/commons-codec-1.5.jar
    81508  11-09-2026 10:11   WEB-INF/lib/batik-util-1.6.jar
   185016  11-09-2026 10:11   WEB-INF/lib/dwr-1.1.3.jar
   175348  11-09-2026 10:11   WEB-INF/lib/bsf-2.3.0.jar
   313898  11-09-2026 10:11   WEB-INF/lib/dom4j-1.6.1.jar
   153253  11-09-2026 10:11   WEB-INF/lib/jdom-1.0.jar
   431568  11-09-2026 10:11   WEB-INF/lib/xom-1.1.jar
   124724  11-09-2026 10:11   WEB-INF/lib/xmlParserAPIs-2.6.2.jar
   231706  11-09-2026 10:11   WEB-INF/lib/jaxen-1.1-beta-8.jar
    26574  11-09-2026 10:11   WEB-INF/lib/commons-beanutils-bean-collections-1.8.3.jar
   206711  11-09-2026 10:11   WEB-INF/lib/commons-beanutils-core-1.8.3.jar
   105112  11-09-2026 10:11   WEB-INF/lib/servlet-api-2.5.jar
    49757  11-09-2026 10:11   WEB-INF/lib/jsp-api-2.2.jar
   388864  11-09-2026 10:11   WEB-INF/lib/mail-1.4.jar
    69409  11-09-2026 10:11   WEB-INF/lib/activation-1.1.1.jar
   423706  11-09-2026 10:11   WEB-INF/lib/jboss-j2ee-4.2.2.GA.jar
  1367760  11-09-2026 10:11   WEB-INF/lib/xercesImpl-2.11.0.jar
   220536  11-09-2026 10:11   WEB-INF/lib/xml-apis-1.4.01.jar
    20682  11-09-2026 10:11   WEB-INF/lib/jstl-1.1.2.jar
   725735  11-09-2026 10:11   WEB-INF/lib/jxl-2.6.12.jar
  1553403  11-09-2026 10:11   WEB-INF/lib/itext-1.3.1.jar
   219121  11-09-2026 10:11   WEB-INF/lib/displaytag-1.2.jar
    15458  11-09-2026 10:11   WEB-INF/lib/jcl104-over-slf4j-1.4.2.jar
     8620  11-09-2026 10:11   WEB-INF/lib/slf4j-log4j12-1.4.2.jar
    15279  11-09-2026 10:11   WEB-INF/lib/slf4j-api-1.4.2.jar
   847257  11-09-2026 10:11   WEB-INF/lib/jasperreports-1.0.1.jar
   393259  11-09-2026 10:11   WEB-INF/lib/standard-1.1.2.jar
   185140  11-09-2026 10:11   WEB-INF/lib/commons-io-2.4.jar
   279193  11-09-2026 10:11   WEB-INF/lib/commons-lang-2.5.jar
   175426  11-09-2026 10:11   WEB-INF/lib/commons-collections-2.1.1.jar
   232019  11-09-2026 10:11   WEB-INF/lib/commons-beanutils-1.8.3.jar
   219078  11-09-2026 10:11   WEB-INF/lib/jaxp-api-1.4.jar
    91079  11-06-2026 15:43   WEB-INF/lib/barbecue-1.5-beta1.jar
   350677  11-09-2026 10:11   WEB-INF/lib/log4j-1.2.7.jar
   526578  11-09-2026 10:11   WEB-INF/lib/struts-1.2.4.jar
    65425  11-09-2026 10:11   WEB-INF/lib/oro-2.0.7.jar
   358273  11-09-2026 10:11   WEB-INF/lib/antlr-2.7.2.jar
   832960  11-09-2026 10:11   WEB-INF/lib/mysql-connector-java-5.1.22.jar
   576962  11-09-2026 10:11   WEB-INF/lib/resteasy-jaxrs-2.2.1.GA.jar
    46446  11-09-2026 10:11   WEB-INF/lib/jaxrs-api-2.2.1.GA.jar
    18767  11-09-2026 10:11   WEB-INF/lib/scannotation-1.0.3.jar
   644148  11-09-2026 10:11   WEB-INF/lib/javassist-3.12.1.GA.jar
     5848  11-06-2026 15:53   WEB-INF/lib/jsr250-api-1.0.jar
   305001  11-09-2026 10:11   WEB-INF/lib/commons-httpclient-3.1.jar
   292893  11-09-2026 10:11   WEB-INF/lib/httpclient-4.0.3.jar
   172888  11-09-2026 10:11   WEB-INF/lib/httpcore-4.0.1.jar
     2254  11-09-2026 10:11   WEB-INF/lib/jcip-annotations-1.0.jar
   232932  11-09-2026 10:11   WEB-INF/lib/gson-2.8.2.jar
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$ unzip -p /tmp/siemp-web.war layout/banner_topo.jsp | grep -nE "taglib|import|<%@|\.value"
1:<%@ page contentType="text/html;charset=ISO-8859-1" language="java" %>
2:<%@page import="br.gov.caixa.siemp.comum.filtros.formatador.FormatadorNomeUsuario"%>
3:<%@ taglib uri="/WEB-INF/tags/struts-tiles.tld" prefix="tiles" %>
4:<%@ taglib uri="/WEB-INF/tags/c.tld" prefix="c" %>
5:<%@ taglib uri="/WEB-INF/tlds/siemptag-html.tld" prefix="taghtml" %>
24:                     document.forms[0].method.value='<=form.getNomeDoMethodDoBotaoVoltar()>';
27:                     if (existeDescricao) document.forms[0].descricaoGenerica.value = descricaoGenericaValue;
[p585600@caddeapllx2864 ~]$
