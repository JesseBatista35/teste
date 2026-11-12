SIEMP (DES, JBoss EAP 7.4 - caddeapllx2864) - trecho do server.log
Arquivo: /logs/jboss/jboss-eap/standalone/siemp-java-web/server.log
Ocorrências do erro no log: 73

===== Ocorrência em 2026-11-12 10:38:41 =====
2026-11-12 10:35:56,509 INFO  [org.apache.struts.tiles.TilesRequestProcessor] (default task-3) Tiles definition factory found for request processor ''.
2026-11-12 10:38:41,260 WARN  [org.apache.commons.validator.ValidatorResources] (default task-7) Form 'mantemMatrizTaxaConvenio' not found for locale 'pt_BR'
2026-11-12 10:38:41,554 ERROR [org.apache.struts.taglib.tiles.InsertTag] (default task-7) ServletException in '/layout/banner_topo.jsp': value: javax.servlet.ServletException: java.lang.NoSuchFieldError: value
        at io.undertow.jsp@2.0.14.Final-redhat-00001//org.apache.jasper.runtime.PageContextImpl.doHandlePageException(PageContextImpl.java:889)
        at io.undertow.jsp@2.0.14.Final-redhat-00001//org.apache.jasper.runtime.PageContextImpl.handlePageException(PageContextImpl.java:818)
        at org.apache.jsp.layout.banner_005ftopo_jsp._jspService(banner_005ftopo_jsp.java:215)
        at io.undertow.jsp@2.0.14.Final-redhat-00001//org.apache.jasper.runtime.HttpJspBase.service(HttpJspBase.java:70)
        at javax.servlet.api@2.0.0.Final-redhat-00001//javax.servlet.http.HttpServlet.service(HttpServlet.java:590)
        at io.undertow.jsp@2.0.14.Final-redhat-00001//org.apache.jasper.servlet.JspServletWrapper.service(JspServletWrapper.java:433)
        at io.undertow.jsp@2.0.14.Final-redhat-00001//org.apache.jasper.servlet.JspServlet.serviceJspFile(JspServlet.java:403)
        at io.undertow.jsp@2.0.14.Final-redhat-00001//org.apache.jasper.servlet.JspServlet.service(JspServlet.java:347)
        at javax.servlet.api@2.0.0.Final-redhat-00001//javax.servlet.http.HttpServlet.service(HttpServlet.java:590)
        at io.undertow.servlet@2.2.33.SP1-redhat-00001//io.undertow.servlet.handlers.ServletHandler.handleRequest(ServletHandler.java:74)
        at io.undertow.servlet@2.2.33.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62)
        at io.undertow.jsp@2.0.14.Final-redhat-00001//io.undertow.jsp.JspFileHandler.handleRequest(JspFileHandler.java:32)
        at io.undertow.servlet@2.2.33.SP1-redhat-00001//io.undertow.servlet.handlers.ServletChain$1.handleRequest(ServletChain.java:68)
        at io.undertow.servlet@2.2.33.SP1-redhat-00001//io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36)
        at org.wildfly.security.elytron-web.undertow-server@1.9.4.Final-redhat-00001//org.wildfly.elytron.web.undertow.server.ElytronRunAsHandler.lambda$handleRequest$1(ElytronRunAsHandler.java:68)
        at org.wildfly.security.elytron-private@1.15.23.Final-redhat-00001//org.wildfly.security.auth.server.FlexibleIdentityAssociation.runAsFunctionEx(FlexibleIdentityAssociation.java:103)
        at org.wildfly.security.elytron-private@1.15.23.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
        at org.wildfly.security.elytron-private@1.15.23.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAs(Scoped.java:73)
        at org.wildfly.security.elytron-web.undertow-server@1.9.4.Final-redhat-00001//org.wildfly.elytron.web.undertow.server.ElytronRunAsHandler.handleRequest(ElytronRunAsHandler.java:67)
        at io.undertow.servlet@2.2.33.SP1-redhat-00001//io.undertow.servlet.handlers.RedirectDirHandler.handleRequest(RedirectDirHandler.java:68)
        at io.undertow.core@2.2.33.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.core@2.2.33.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.servlet@2.2.33.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:257)
        at io.undertow.servlet@2.2.33.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.dispatchToServlet(ServletInitialHandler.java:192)
        at io.undertow.servlet@2.2.33.SP1-redhat-00001//io.undertow.servlet.spec.RequestDispatcherImpl.includeImpl(RequestDispatcherImpl.java:337)
        at io.undertow.servlet@2.2.33.SP1-redhat-00001//io.undertow.servlet.spec.RequestDispatcherImpl.setupIncludeImpl(RequestDispatcherImpl.java:285)
        at io.undertow.servlet@2.2.33.SP1-redhat-00001//io.undertow.servlet.spec.RequestDispatcherImpl.include(RequestDispatcherImpl.java:249)
        at io.undertow.jsp@2.0.14.Final-redhat-00001//org.apache.jasper.runtime.JspRuntimeLibrary.include(JspRuntimeLibrary.java:912)
        at io.undertow.jsp@2.0.14.Final-redhat-00001//org.apache.jasper.runtime.PageContextImpl.include(PageContextImpl.java:631)
        at deployment.siemp-ear.ear.siemp-web.war//org.apache.struts.tiles.TilesUtilImpl.doInclude(TilesUtilImpl.java:101)
        at deployment.siemp-ear.ear.siemp-web.war//org.apache.struts.tiles.TilesUtil.doInclude(TilesUtil.java:137)
        at deployment.siemp-ear.ear.siemp-web.war//org.apache.struts.taglib.tiles.InsertTag.doInclude(InsertTag.java:758)
        at deployment.siemp-ear.ear.siemp-web.war//org.apache.struts.taglib.tiles.InsertTag$InsertHandler.doEndTag(InsertTag.java:890)
        at deployment.siemp-ear.ear.siemp-web.war//org.apache.struts.taglib.tiles.InsertTag.doEndTag(InsertTag.java:460)
        at org.apache.jsp.layout.template_jsp._jspx_meth_tiles_005finsert_005f0(template_jsp.java:304)
        at org.apache.jsp.layout.template_jsp._jspService(template_jsp.java:172)
        at io.undertow.jsp@2.0.14.Final-redhat-00001//org.apache.jasper.runtime.HttpJspBase.service(HttpJspBase.java:70)
        at javax.servlet.api@2.0.0.Final-redhat-00001//javax.servlet.http.HttpServlet.service(HttpServlet.java:590)
        at io.undertow.jsp@2.0.14.Final-redhat-00001//org.apache.jasper.servlet.JspServletWrapper.service(JspServletWrapper.java:433)
        at io.undertow.jsp@2.0.14.Final-redhat-00001//org.apache.jasper.servlet.JspServlet.serviceJspFile(JspServlet.java:403)
        ...

===== Causa raiz =====
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

===== Bibliotecas JSTL/API empacotadas no siemp-web.war (WEB-INF/lib) =====
   105112  11-09-2026 10:11   WEB-INF/lib/servlet-api-2.5.jar
    49757  11-09-2026 10:11   WEB-INF/lib/jsp-api-2.2.jar
   423706  11-09-2026 10:11   WEB-INF/lib/jboss-j2ee-4.2.2.GA.jar
    20682  11-09-2026 10:11   WEB-INF/lib/jstl-1.1.2.jar
   393259  11-09-2026 10:11   WEB-INF/lib/standard-1.1.2.jar

===== Taglibs do /layout/banner_topo.jsp =====
1:<%@ page contentType="text/html;charset=ISO-8859-1" language="java" %>
2:<%@page import="br.gov.caixa.siemp.comum.filtros.formatador.FormatadorNomeUsuario"%>
3:<%@ taglib uri="/WEB-INF/tags/struts-tiles.tld" prefix="tiles" %>
4:<%@ taglib uri="/WEB-INF/tags/c.tld" prefix="c" %>
5:<%@ taglib uri="/WEB-INF/tlds/siemptag-html.tld" prefix="taghtml" %>
