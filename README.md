
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs sicow-penhor-okd-des-61-ml9pq -n sicow-des --since=10m | grep -E "ERROR|SEVERE|Exception|veio sem valor|scowdb01" | head -40
2026-10-23 10:17:44,620 WARN  [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (JCA PoolFiller) IJ000610: Unable to fill pool: java:/jboss/datasources/sicow-ds: javax.resource.ResourceException: IJ031084: Unable to create connection
Caused by: org.postgresql.util.PSQLException: FATAL: password authentication failed for user "scowdb01"
2026-10-23 10:17:56,076 WARN  [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (ServerService Thread Pool -- 67) IJ000604: Throwable while attempting to get a new connection: null: javax.resource.ResourceException: IJ031084: Unable to create connection
Caused by: org.postgresql.util.PSQLException: FATAL: password authentication failed for user "scowdb01"
2026-10-23 10:17:56,078 WARN  [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator] (ServerService Thread Pool -- 67) HHH000342: Could not obtain connection to query metadata : javax.resource.ResourceException: IJ000453: Unable to get managed connection for java:/jboss/datasources/sicow-ds
2026-10-23 10:20:44,041 SEVERE [javax.enterprise.resource.webcontainer.jsf.application] (default task-1) Error Rendering View[/login.xhtml]: javax.faces.FacesException: javax.el.ELException: /login.xhtml @12,54 onload="#{sicowLoginBean.logoutPortal()}": br.gov.caixa.pr.sicow.portal.exception.SicowPortalException: Parametro sicowportalURL veio sem valor
Caused by: javax.el.ELException: /login.xhtml @12,54 onload="#{sicowLoginBean.logoutPortal()}": br.gov.caixa.pr.sicow.portal.exception.SicowPortalException: Parametro sicowportalURL veio sem valor
Caused by: javax.el.ELException: br.gov.caixa.pr.sicow.portal.exception.SicowPortalException: Parametro sicowportalURL veio sem valor
Caused by: br.gov.caixa.pr.sicow.portal.exception.SicowPortalException: Parametro sicowportalURL veio sem valor
2026-10-23 10:20:44,046 ERROR [io.undertow.request] (default task-1) UT005023: Exception handling request to /sicowpenhor/login.cef: java.lang.RuntimeException: javax.servlet.ServletException: Parametro sicowportalURL veio sem valor
Caused by: javax.servlet.ServletException: Parametro sicowportalURL veio sem valor
Caused by: br.gov.caixa.pr.sicow.portal.exception.SicowPortalException: Parametro sicowportalURL veio sem valor
2026-10-23 10:22:53,021 SEVERE [javax.enterprise.resource.webcontainer.jsf.application] (default task-7) Error Rendering View[/login.xhtml]: javax.faces.FacesException: javax.el.ELException: /login.xhtml @12,54 onload="#{sicowLoginBean.logoutPortal()}": br.gov.caixa.pr.sicow.portal.exception.SicowPortalException: Parametro sicowportalURL veio sem valor
Caused by: javax.el.ELException: /login.xhtml @12,54 onload="#{sicowLoginBean.logoutPortal()}": br.gov.caixa.pr.sicow.portal.exception.SicowPortalException: Parametro sicowportalURL veio sem valor
Caused by: javax.el.ELException: br.gov.caixa.pr.sicow.portal.exception.SicowPortalException: Parametro sicowportalURL veio sem valor
Caused by: br.gov.caixa.pr.sicow.portal.exception.SicowPortalException: Parametro sicowportalURL veio sem valor
2026-10-23 10:22:53,024 ERROR [io.undertow.request] (default task-7) UT005023: Exception handling request to /sicowpenhor/login.cef: java.lang.RuntimeException: javax.servlet.ServletException: Parametro sicowportalURL veio sem valor
Caused by: javax.servlet.ServletException: Parametro sicowportalURL veio sem valor
Caused by: br.gov.caixa.pr.sicow.portal.exception.SicowPortalException: Parametro sicowportalURL veio sem valor
2026-10-23 10:23:08,765 SEVERE [javax.enterprise.resource.webcontainer.jsf.application] (default task-18) Error Rendering View[/login.xhtml]: javax.faces.FacesException: javax.el.ELException: /login.xhtml @12,54 onload="#{sicowLoginBean.logoutPortal()}": br.gov.caixa.pr.sicow.portal.exception.SicowPortalException: Parametro sicowportalURL veio sem valor
Caused by: javax.el.ELException: /login.xhtml @12,54 onload="#{sicowLoginBean.logoutPortal()}": br.gov.caixa.pr.sicow.portal.exception.SicowPortalException: Parametro sicowportalURL veio sem valor
Caused by: javax.el.ELException: br.gov.caixa.pr.sicow.portal.exception.SicowPortalException: Parametro sicowportalURL veio sem valor
Caused by: br.gov.caixa.pr.sicow.portal.exception.SicowPortalException: Parametro sicowportalURL veio sem valor
2026-10-23 10:23:08,768 ERROR [io.undertow.request] (default task-18) UT005023: Exception handling request to /sicowpenhor/login.cef: java.lang.RuntimeException: javax.servlet.ServletException: Parametro sicowportalURL veio sem valor
Caused by: javax.servlet.ServletException: Parametro sicowportalURL veio sem valor
Caused by: br.gov.caixa.pr.sicow.portal.exception.SicowPortalException: Parametro sicowportalURL veio sem valor
2026-10-23 10:23:44,141 SEVERE [javax.enterprise.resource.webcontainer.jsf.application] (default task-18) Error Rendering View[/login.xhtml]: javax.faces.FacesException: javax.el.ELException: /login.xhtml @12,54 onload="#{sicowLoginBean.logoutPortal()}": br.gov.caixa.pr.sicow.portal.exception.SicowPortalException: Parametro sicowportalURL veio sem valor
Caused by: javax.el.ELException: /login.xhtml @12,54 onload="#{sicowLoginBean.logoutPortal()}": br.gov.caixa.pr.sicow.portal.exception.SicowPortalException: Parametro sicowportalURL veio sem valor
Caused by: javax.el.ELException: br.gov.caixa.pr.sicow.portal.exception.SicowPortalException: Parametro sicowportalURL veio sem valor
Caused by: br.gov.caixa.pr.sicow.portal.exception.SicowPortalException: Parametro sicowportalURL veio sem valor
2026-10-23 10:23:44,144 ERROR [io.undertow.request] (default task-18) UT005023: Exception handling request to /sicowpenhor/login.cef: java.lang.RuntimeException: javax.servlet.ServletException: Parametro sicowportalURL veio sem valor
Caused by: javax.servlet.ServletException: Parametro sicowportalURL veio sem valor
Caused by: br.gov.caixa.pr.sicow.portal.exception.SicowPortalException: Parametro sicowportalURL veio sem valor
2026-10-23 10:23:51,323 SEVERE [javax.enterprise.resource.webcontainer.jsf.application] (default task-18) Error Rendering View[/login.xhtml]: javax.faces.FacesException: javax.el.ELException: /login.xhtml @12,54 onload="#{sicowLoginBean.logoutPortal()}": br.gov.caixa.pr.sicow.portal.exception.SicowPortalException: Parametro sicowportalURL veio sem valor
Caused by: javax.el.ELException: /login.xhtml @12,54 onload="#{sicowLoginBean.logoutPortal()}": br.gov.caixa.pr.sicow.portal.exception.SicowPortalException: Parametro sicowportalURL veio sem valor
Caused by: javax.el.ELException: br.gov.caixa.pr.sicow.portal.exception.SicowPortalException: Parametro sicowportalURL veio sem valor
Caused by: br.gov.caixa.pr.sicow.portal.exception.SicowPortalException: Parametro sicowportalURL veio sem valor
2026-10-23 10:23:51,325 ERROR [io.undertow.request] (default task-18) UT005023: Exception handling request to /sicowpenhor/login.cef: java.lang.RuntimeException: javax.servlet.ServletException: Parametro sicowportalURL veio sem valor
Caused by: javax.servlet.ServletException: Parametro sicowportalURL veio sem valor
Caused by: br.gov.caixa.pr.sicow.portal.exception.SicowPortalException: Parametro sicowportalURL veio sem valor
-sh-4.2$
