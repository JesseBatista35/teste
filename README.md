-sh-4.2$
-sh-4.2$ oc logs sifug-siofg-api-des-275-gxq9l -n sifug-des --previous | grep -iE 'srcfg|caused by|mq|jms|auth|connect|exception' | head -25
2026-06-02 10:34:29.375-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - Unable to retrieve appId: exception sending request to https://southcentralus-3.in.applicationinsights.azure.com/api/profiles/8148a712-eee7-4c41-95ef-5153b19d0497/appId (future warnings will be aggregated and logged once every 5 minutes)
reactor.core.Exceptions$ReactiveException: io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException: http, none, proxydes.caixa/10.252.32.63:80 => southcentralus-3.in.applicationinsights.azure.com:443, status: 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
        at reactor.core.Exceptions.propagate(Exceptions.java:392)
        Suppressed: java.lang.Exception: #block terminated with an error
Caused by: io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException: http, none, proxydes.caixa/10.252.32.63:80 => southcentralus-3.in.applicationinsights.azure.com:443, status: 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
  - SRCFG00011: Could not expand value SIFUG_DATASOURCE_02 in property DATASOURCE_CONSULTAPEF_PASSWORD
  - SRCFG00011: Could not expand value SIFUG_DATASOURCE_02 in property DATASOURCE_DB2_PASSWORD
io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException: http, none, proxydes.caixa/10.252.32.63:80 => southcentralus-3.in.applicationinsights.azure.com:443, status: 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
-sh-4.2$
