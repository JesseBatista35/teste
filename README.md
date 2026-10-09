
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $P -- curl -s http://localhost:8080/login2/ | head -60
<html><head><title>ERROR</title><style>
body {
    font-family: "Lucida Grande", "Lucida Sans Unicode", "Trebuchet MS", Helvetica, Arial, Verdana, sans-serif;
    margin: 5px;
}

.header {
    background-image: linear-gradient(bottom, rgb(153,151,153) 8%, rgb(199,199,199) 54%);
    background-image: -o-linear-gradient(bottom, rgb(153,151,153) 8%, rgb(199,199,199) 54%);
    background-image: -moz-linear-gradient(bottom, rgb(153,151,153) 8%, rgb(199,199,199) 54%);
    background-image: -webkit-linear-gradient(bottom, rgb(153,151,153) 8%, rgb(199,199,199) 54%);
    background-image: -ms-linear-gradient(bottom, rgb(153,151,153) 8%, rgb(199,199,199) 54%);

    background-image: -webkit-gradient(
        linear,
        left bottom,
        left top,
        color-stop(0.08, rgb(153,151,153)),
        color-stop(0.54, rgb(199,199,199))
    );
    color: black;
    padding: 2px;
    font-weight: normal;
    border: solid 1px;
    font-size: 170%;
    text-align: left;
    vertical-align: middle;
    height: 32px;
    margin-bottom: 10px;
}
.error-div {
    display: inline-block;
    width: 32px;
    height: 32px;
    background: url('data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAABmJLR0QAAAAAAAD5Q7t/AAAACXBIWXMAAABIAAAASABGyWs+AAAACXZwQWcAAAAgAAAAIACH+pydAAAGGElEQVRYw8WXW2wcVxnHf+fM7NXrdXbdtZ3ipGqCEzvQKmlFoUggwkvvGBoaqVVV5Y0nkCoQPPCAhMQbQlzUh/IWHoh6QUVKZVLxUCGogKZRW9uJkyg0iVzZ2dhre9c7u7M7c87hYWc2M7t2bBASI306O/85+v7/7zLn24H/8yV2u/EcFNvwVNK2X0DKw1qpYaX1gCWlY0m5arRe8JQ6I2DmaVj/nwk4CxO2Zf1aw9dKo6N67+eOZHN7x0gViiSHBmlXa7hrazjLt1i+eKmxUi5bwpg/e8a8PA3X/msBr0MyJ+WvgFOffehY8v7HH5OW78HqGjgOtNrge2AnIJWAgQEYLqBsm3/NvKM/mZ1rYczpRa2/9x3w/iMBM1BCiHfuGRmZevClF9NJ5cP1m9B0+/aa3t/ZDNw3TtuSfPy737trK6sXtTGPPwOruxLwNhSEEHMHpqZGDz93wubKFdio3ZXUGNOHs2cIDh/g6pt/9G8uXLnlGPP5k1Dt5bN60m6lhXj34OTkxKET37SZm4d6oz/KgFRH7yOrBozbwlTWGf7ql6RZrWTcytrxaTj9Ro9OGb3JS/mz0nDxgYnnvmWbuUsdJ6FTY2JmImShqZA83N90UbOXOXDiG4nCcPFoTsqfbluCP8DenJQLx1/+7pBcXILaZl9qo2svFmalb48xkM9hxkf5+29+u9HSenIayn0ZyEr5i0NHpnKy7aGrtW6UehsLozRBRlRQEh3BwzLpWh3h++yfPJRLSvnzvhK8DkPamOl7n3nCUjcXtyXuK0X0WViaAFc9QtSNJe594uu2MubZGcjHBGTgqeFiQQml0K12nDgSpd4iyi4uRMci6Q8xJSWq7SGEZCg/qD14LCYgIcTzoxMHc6qygYk40aETKTFSdh2aANOWhbEsjJSYCK6C/V0LcH+9xvCB/TlbiBdCAXbQMJPZ/fvQjUbXEULAa6/1deyuh0dwNU+e7DSzEOhmi8xn9iI+ujgVE6ChlBwpYcqVjuIgA3IXBMYYtNbd30IIpJQI0ZEa+gPQnk9ieA8GSrESaGNyiWIBrVQntUHqdrq01iiluo0WilBK4fs+WutOr4S9YAyJoRzamMGYAClEve046ETyTr13EKCU6kZ+N4GNCxfwKpVOryQSuOUVhBCbsRIIuN1cWRkaSCfRrdaOTncijgltNPDn5xHZLIn7x3GNh4CVmADgcv3a9YmBY0cxm06nAQH31KlOao3BL5fxbtzAOE73hAt7JXb6RU7PGO44WK5Do1ZHw6WYAN+YM+X5S8dLXziWizVNvY5aWcFfWuq8Idsctb1Yr8DwmRwrUr1yfVMbcyYmwIWZ2mbdai9+gvfBAsaAbrUwrrtllLuJPibIGGQ2hUlIHLdlA+diTXgSqkKIt5b/OevL+8bwqlWU63anW3jyhaa4c9T2Hs0hrsL5EOCJQ/sov7/gS8Mb07AZEwDgav2D5aVy3eSziEL+Dllk0PSRcmcMqx6BUeGykINsksrttboPP4w2aVfACVhGiFevvft+I/XwJCad3DF6tc2MiD4zmRSZhyZY/OusI4V4JTqKYwIA6lr/2Gm6s5/+7UMv/egDmEyqL7VbRR/LViR6sikGvniYpffm2m6r/VFd65/0vqZ9R/tbsMeG+WKpMDL+lWMJ58Jl/NVqvOG26PAoDmCXhhg4epDl9+a9zUp1uQkPbvWfcMvZchbuEXAuk0kf2X/84YxpuDQv3kA5zW1fw9CswSyZyXFEJsmnf/m46bntuTY8+SxUtuLadri9CokxeEUK8WJhtJgaeeSIxG3RurWGv+Gg3RbaU5CwkOkU1lCWxFgBmbS4ff6qX7297rXh9Gn4/llobMcjtsFywACQ+zZMTsOP8vBIOpNS+bFiJj2cxx7MYg+k8ZwmrWqD9lqNjVvrTc9tWRtw/k345dtwFagDTmTdUUA2EDAYXffB2JPw6FH4ch7GUpCzIemD50J9A1Y+hH/8Cc4vdTq9Tud9D9dNOt+MajclyNL53xZmIhusmcBSQJLOd4UJnHqACzTppDy0kHizl/yuPRB5nggIM0A6IE4GuA34EQFtoBUQuwGm7kbwb+eaEEXmuV5dAAAAJXRFWHRjcmVhdGUtZGF0ZQAyMDA5LTExLTEwVDE5OjM4OjI0LTA3OjAwdDKp4gAAACV0RVh0ZGF0ZTpjcmVhdGUAMjAxMC0wMi0yMFQyMzoyNjoyNC0wNzowMC7DUNYAAAAldEVYdGRhdGU6bW9kaWZ5ADIwMTAtMDEtMTFUMDg6NTc6MzUtMDc6MDCruapPAAAAMnRFWHRMaWNlbnNlAGh0dHA6Ly9lbi53aWtpcGVkaWEub3JnL3dpa2kvUHVibGljX2RvbWFpbj/96s8AAAAldEVYdG1vZGlmeS1kYXRlADIwMDktMTEtMTBUMTk6Mzg6MjQtMDc6MDArg9/WAAAAGXRFWHRTb3VyY2UAVGFuZ28gSWNvbiBMaWJyYXJ5VM/tggAAADp0RVh0U291cmNlX1VSTABodHRwOi8vdGFuZ28uZnJlZWRlc2t0b3Aub3JnL1RhbmdvX0ljb25fTGlicmFyebzIrdYAAAAASUVORK5CYII=') left center no-repeat;
}
.error-text-div {
    display: inline-block;
    vertical-align: top;
    height: 32px;
}
.label {
    font-weight:bold;
    display: inline-block;
}
.value {
    display: inline-block;
    margin-left: 5px;
}
pre {
    font-size: 110%;
    margin-left: 1.5em;
    white-space: pre-wrap;
    white-space: -moz-pre-wrap;
    white-space: -pre-wrap;
    white-space: -o-pre-wrap;
    word-wrap: break-word;
}
</style></head><body><div class="header"><div class="error-div"></div><div class="error-text-div">Error processing request</div></div><div class="label">Context Path:</div><div class="value">/login2</div><br/><div class="label">Servlet Path:</div><div class="value">/index.jsp</div><br/><div class="label">Path Info:</div><div class="value">null</div><br/><div class="label">Query String:</div><div class="value">null</div><br/><div class="label">Stack Trace:</div><div class="value"></div><br/><pre>java.lang.NoClassDefFoundError: org/apache/commons/lang/StringUtils
        at br.gov.caixa.util.SessionUtil.isResource(SessionUtil.java:133)
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $P -- tail -150 /opt/jboss/standalone/log/server.log | grep -E -A25 "ERROR|Exception|Caused by" | head -120
2026-10-09 15:28:07,514 ERROR [io.undertow.request] (default task-1) UT005023: Exception handling request to /login2/: java.lang.NoClassDefFoundError: org/apache/commons/lang/StringUtils
        at br.gov.caixa.util.SessionUtil.isResource(SessionUtil.java:133)
        at br.gov.caixa.filter.LoginUnicoFilter.doFilter(LoginUnicoFilter.java:66)
        at io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:67)
        at io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at io.undertow.servlet.handlers.FilterHandler.handleRequest(FilterHandler.java:84)
        at io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62)
        at io.undertow.jsp.JspFileHandler.handleRequest(JspFileHandler.java:32)
        at io.undertow.servlet.handlers.ServletChain$1.handleRequest(ServletChain.java:68)
        at io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36)
        at org.wildfly.extension.undertow.security.SecurityContextAssociationHandler.handleRequest(SecurityContextAssociationHandler.java:78)
        at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.servlet.handlers.RedirectDirHandler.handleRequest(RedirectDirHandler.java:68)
        at io.undertow.servlet.handlers.security.SSLInformationAssociationHandler.handleRequest(SSLInformationAssociationHandler.java:117)
        at io.undertow.servlet.handlers.security.ServletAuthenticationCallHandler.handleRequest(ServletAuthenticationCallHandler.java:57)
        at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.security.handlers.AuthenticationConstraintHandler.handleRequest(AuthenticationConstraintHandler.java:53)
        at io.undertow.security.handlers.AbstractConfidentialityHandler.handleRequest(AbstractConfidentialityHandler.java:46)
        at io.undertow.servlet.handlers.security.ServletConfidentialityConstraintHandler.handleRequest(ServletConfidentialityConstraintHandler.java:64)
        at io.undertow.servlet.handlers.security.ServletSecurityConstraintHandler.handleRequest(ServletSecurityConstraintHandler.java:60)
        at io.undertow.security.handlers.AuthenticationMechanismsHandler.handleRequest(AuthenticationMechanismsHandler.java:60)
        at io.undertow.servlet.handlers.security.CachedAuthenticatedSessionHandler.handleRequest(CachedAuthenticatedSessionHandler.java:77)
        at io.undertow.security.handlers.NotificationReceiverHandler.handleRequest(NotificationReceiverHandler.java:50)
        at io.undertow.security.handlers.AbstractSecurityContextAssociationHandler.handleRequest(AbstractSecurityContextAssociationHandler.java:43)
        at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.wildfly.extension.undertow.security.jacc.JACCContextIdHandler.handleRequest(JACCContextIdHandler.java:61)
--
Caused by: java.lang.ClassNotFoundException: org.apache.commons.lang.StringUtils from [Module "deployment.sipcs-login-unico-jboss-okd.war" from Service Module Loader]
        at org.jboss.modules.ModuleClassLoader.findClass(ModuleClassLoader.java:255)
        at org.jboss.modules.ConcurrentClassLoader.performLoadClassUnchecked(ConcurrentClassLoader.java:410)
        at org.jboss.modules.ConcurrentClassLoader.performLoadClass(ConcurrentClassLoader.java:398)
        at org.jboss.modules.ConcurrentClassLoader.loadClass(ConcurrentClassLoader.java:116)
        ... 51 more

2026-10-09 15:29:03,974 ERROR [io.undertow.request] (default task-1) UT005023: Exception handling request to /login2/: java.lang.NoClassDefFoundError: org/apache/commons/lang/StringUtils
        at br.gov.caixa.util.SessionUtil.isResource(SessionUtil.java:133)
        at br.gov.caixa.filter.LoginUnicoFilter.doFilter(LoginUnicoFilter.java:66)
        at io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:67)
        at io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at io.undertow.servlet.handlers.FilterHandler.handleRequest(FilterHandler.java:84)
        at io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62)
        at io.undertow.jsp.JspFileHandler.handleRequest(JspFileHandler.java:32)
        at io.undertow.servlet.handlers.ServletChain$1.handleRequest(ServletChain.java:68)
        at io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36)
        at org.wildfly.extension.undertow.security.SecurityContextAssociationHandler.handleRequest(SecurityContextAssociationHandler.java:78)
        at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.servlet.handlers.RedirectDirHandler.handleRequest(RedirectDirHandler.java:68)
        at io.undertow.servlet.handlers.security.SSLInformationAssociationHandler.handleRequest(SSLInformationAssociationHandler.java:117)
        at io.undertow.servlet.handlers.security.ServletAuthenticationCallHandler.handleRequest(ServletAuthenticationCallHandler.java:57)
        at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.security.handlers.AuthenticationConstraintHandler.handleRequest(AuthenticationConstraintHandler.java:53)
        at io.undertow.security.handlers.AbstractConfidentialityHandler.handleRequest(AbstractConfidentialityHandler.java:46)
        at io.undertow.servlet.handlers.security.ServletConfidentialityConstraintHandler.handleRequest(ServletConfidentialityConstraintHandler.java:64)
        at io.undertow.servlet.handlers.security.ServletSecurityConstraintHandler.handleRequest(ServletSecurityConstraintHandler.java:60)
        at io.undertow.security.handlers.AuthenticationMechanismsHandler.handleRequest(AuthenticationMechanismsHandler.java:60)
        at io.undertow.servlet.handlers.security.CachedAuthenticatedSessionHandler.handleRequest(CachedAuthenticatedSessionHandler.java:77)
        at io.undertow.security.handlers.NotificationReceiverHandler.handleRequest(NotificationReceiverHandler.java:50)
        at io.undertow.security.handlers.AbstractSecurityContextAssociationHandler.handleRequest(AbstractSecurityContextAssociationHandler.java:43)
        at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.wildfly.extension.undertow.security.jacc.JACCContextIdHandler.handleRequest(JACCContextIdHandler.java:61)
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $P -- /opt/jboss/bin/jboss-cli.sh -c --command="/subsystem=datasources:read-children-names(child-type=data-source)"
{
    "outcome" => "success",
    "result" => [
        "ExampleDS",
        "siatcDS"
    ]
}
-sh-4.2$ oc exec $P -- /opt/jboss/bin/jboss-cli.sh -c --command="/subsystem=datasources/data-source=NOME:test-connection-in-pool"
{
    "outcome" => "failed",
    "failure-description" => "WFLYCTL0216: Management resource '[
    (\"subsystem\" => \"datasources\"),
    (\"data-source\" => \"NOME\")
]' not found",
    "rolled-back" => true
}
command terminated with exit code 1
-sh-4.2$
