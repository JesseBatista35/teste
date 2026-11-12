
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$ sudo grep -a -m1 -B10 -A40 "NoSuchFieldError: value" /logs/jboss/jboss-eap/standalone/siemp-java-web/server.log
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
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$ ls /opt/jboss-eap/standalone/deployments/
framework.jar  framework.jar.deployed  README.txt  siemp-ear.ear  siemp-ear.ear.deployed
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$ unzip -l /opt/jboss-eap/standalone/deployments/siemp.ear | grep -iE "\.jar|\.war"
unzip:  cannot find or open /opt/jboss-eap/standalone/deployments/siemp.ear, /opt/jboss-eap/standalone/deployments/siemp.ear.zip or /opt/jboss-eap/standalone/deployments/siemp.ear.ZIP.
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$ unzip -p /opt/jboss-eap/standalone/deployments/siemp.ear siemp-web.war > /tmp/siemp-web.war && unzip -l /tmp/siemp-web.war | grep -iE "WEB-INF/lib/.*(jstl|jsp|servlet|el-api|struts|taglib|standard|display)"
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
