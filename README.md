
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]# grep -n "WebXmlSingleton\|omnifaces" /logs/jboss/jboss-eap/standalone/siarg-interno/server.log | head -50
1636:08:38:42,759 ERROR [io.undertow.request] (default task-33) UT005023: Exception handling request to /siarg/WEB-INF/errorpages/404.xhtml: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
1637:   at org.omnifaces.config.WebXml.instance(WebXml.java:131) [omnifaces-3.14.jar:3.14]
1638:   at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.findErrorPageLocation(FullAjaxExceptionHandler.java:483) [omnifaces-3.14.jar:3.14]
1639:   at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handleAjaxException(FullAjaxExceptionHandler.java:411) [omnifaces-3.14.jar:3.14]
1640:   at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handle(FullAjaxExceptionHandler.java:383) [omnifaces-3.14.jar:3.14]
1684:08:38:43,013 ERROR [io.undertow.servlet.request] (default task-33) UT015012: Failed to generate error page /siarg/WEB-INF/errorpages/404.xhtml for original exception: null. Generating error page resulted in a 500.: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
1685:   at org.omnifaces.config.WebXml.instance(WebXml.java:131) [omnifaces-3.14.jar:3.14]
1686:   at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.findErrorPageLocation(FullAjaxExceptionHandler.java:483) [omnifaces-3.14.jar:3.14]
1687:   at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handleAjaxException(FullAjaxExceptionHandler.java:411) [omnifaces-3.14.jar:3.14]
1688:   at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handle(FullAjaxExceptionHandler.java:383) [omnifaces-3.14.jar:3.14]
1733:08:42:24,496 ERROR [io.undertow.request] (default task-33) UT005023: Exception handling request to /siarg/WEB-INF/errorpages/404.xhtml: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
1734:   at org.omnifaces.config.WebXml.instance(WebXml.java:131) [omnifaces-3.14.jar:3.14]
1735:   at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.findErrorPageLocation(FullAjaxExceptionHandler.java:483) [omnifaces-3.14.jar:3.14]
1736:   at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handleAjaxException(FullAjaxExceptionHandler.java:411) [omnifaces-3.14.jar:3.14]
1737:   at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handle(FullAjaxExceptionHandler.java:383) [omnifaces-3.14.jar:3.14]
1781:08:42:24,509 ERROR [io.undertow.servlet.request] (default task-33) UT015012: Failed to generate error page /siarg/WEB-INF/errorpages/404.xhtml for original exception: null. Generating error page resulted in a 500.: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
1782:   at org.omnifaces.config.WebXml.instance(WebXml.java:131) [omnifaces-3.14.jar:3.14]
1783:   at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.findErrorPageLocation(FullAjaxExceptionHandler.java:483) [omnifaces-3.14.jar:3.14]
1784:   at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handleAjaxException(FullAjaxExceptionHandler.java:411) [omnifaces-3.14.jar:3.14]
1785:   at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handle(FullAjaxExceptionHandler.java:383) [omnifaces-3.14.jar:3.14]
1830:08:42:43,691 ERROR [io.undertow.request] (default task-33) UT005023: Exception handling request to /siarg/WEB-INF/errorpages/404.xhtml: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
1831:   at org.omnifaces.config.WebXml.instance(WebXml.java:131) [omnifaces-3.14.jar:3.14]
1832:   at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.findErrorPageLocation(FullAjaxExceptionHandler.java:483) [omnifaces-3.14.jar:3.14]
1833:   at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handleAjaxException(FullAjaxExceptionHandler.java:411) [omnifaces-3.14.jar:3.14]
1834:   at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handle(FullAjaxExceptionHandler.java:383) [omnifaces-3.14.jar:3.14]
1878:08:42:43,702 ERROR [io.undertow.servlet.request] (default task-33) UT015012: Failed to generate error page /siarg/WEB-INF/errorpages/404.xhtml for original exception: null. Generating error page resulted in a 500.: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
1879:   at org.omnifaces.config.WebXml.instance(WebXml.java:131) [omnifaces-3.14.jar:3.14]
1880:   at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.findErrorPageLocation(FullAjaxExceptionHandler.java:483) [omnifaces-3.14.jar:3.14]
1881:   at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handleAjaxException(FullAjaxExceptionHandler.java:411) [omnifaces-3.14.jar:3.14]
1882:   at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handle(FullAjaxExceptionHandler.java:383) [omnifaces-3.14.jar:3.14]
2016:08:46:02,872 ERROR [io.undertow.request] (default task-33) UT005023: Exception handling request to /siarg/WEB-INF/errorpages/404.xhtml: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
2017:   at org.omnifaces.config.WebXml.instance(WebXml.java:131) [omnifaces-3.14.jar:3.14]
2018:   at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.findErrorPageLocation(FullAjaxExceptionHandler.java:483) [omnifaces-3.14.jar:3.14]
2019:   at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handleAjaxException(FullAjaxExceptionHandler.java:411) [omnifaces-3.14.jar:3.14]
2020:   at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handle(FullAjaxExceptionHandler.java:383) [omnifaces-3.14.jar:3.14]
2064:08:46:02,879 ERROR [io.undertow.servlet.request] (default task-33) UT015012: Failed to generate error page /siarg/WEB-INF/errorpages/404.xhtml for original exception: null. Generating error page resulted in a 500.: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
2065:   at org.omnifaces.config.WebXml.instance(WebXml.java:131) [omnifaces-3.14.jar:3.14]
2066:   at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.findErrorPageLocation(FullAjaxExceptionHandler.java:483) [omnifaces-3.14.jar:3.14]
2067:   at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handleAjaxException(FullAjaxExceptionHandler.java:411) [omnifaces-3.14.jar:3.14]
2068:   at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handle(FullAjaxExceptionHandler.java:383) [omnifaces-3.14.jar:3.14]
2113:08:47:37,390 ERROR [io.undertow.request] (default task-33) UT005023: Exception handling request to /siarg/WEB-INF/errorpages/404.xhtml: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
2114:   at org.omnifaces.config.WebXml.instance(WebXml.java:131) [omnifaces-3.14.jar:3.14]
2115:   at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.findErrorPageLocation(FullAjaxExceptionHandler.java:483) [omnifaces-3.14.jar:3.14]
2116:   at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handleAjaxException(FullAjaxExceptionHandler.java:411) [omnifaces-3.14.jar:3.14]
2117:   at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handle(FullAjaxExceptionHandler.java:383) [omnifaces-3.14.jar:3.14]
2161:08:47:37,402 ERROR [io.undertow.servlet.request] (default task-33) UT015012: Failed to generate error page /siarg/WEB-INF/errorpages/404.xhtml for original exception: null. Generating error page resulted in a 500.: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
2162:   at org.omnifaces.config.WebXml.instance(WebXml.java:131) [omnifaces-3.14.jar:3.14]
2163:   at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.findErrorPageLocation(FullAjaxExceptionHandler.java:483) [omnifaces-3.14.jar:3.14]
2164:   at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handleAjaxException(FullAjaxExceptionHandler.java:411) [omnifaces-3.14.jar:3.14]
2165:   at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handle(FullAjaxExceptionHandler.java:383) [omnifaces-3.14.jar:3.14]
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]# grep -n "ExceptionInInitializerError\|Caused by" /logs/jboss/jboss-eap/standalone/siarg-interno/server.log | head -30
107:Caused by: java.net.SocketException: Connection reset
225:Caused by: java.net.SocketException: Connection reset
343:Caused by: java.net.SocketException: Connection reset
461:Caused by: java.net.SocketException: Connection reset
579:Caused by: java.net.SocketException: Connection reset
718:Caused by: java.lang.NullPointerException
760:Caused by: java.lang.IllegalStateException: WFLYEE0042: Falha ao construir a instância do componente
849:Caused by: java.lang.NullPointerException
980:Caused by: java.lang.NullPointerException
1023:Caused by: java.lang.IllegalStateException: WFLYEE0042: Falha ao construir a instância do componente
1112:Caused by: java.lang.NullPointerException
1240:Caused by: java.lang.NullPointerException
1282:Caused by: java.lang.IllegalStateException: WFLYEE0042: Falha ao construir a instância do componente
1371:Caused by: java.lang.NullPointerException
1502:Caused by: java.lang.NullPointerException
1545:Caused by: java.lang.IllegalStateException: WFLYEE0042: Falha ao construir a instância do componente
1634:Caused by: java.lang.NullPointerException
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
.../content-b0bfd7c964c20f17/WEB-INF/lib/commons-logging-1.1.1.jar (deleted)
bash: erro de sintaxe próximo ao token inesperado `deleted'
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]# .../content-b0bfd7c964c20f17/WEB-INF/lib/log4j-1.2.15.jar (deleted)
bash: erro de sintaxe próximo ao token inesperado `deleted'
[root@caddeapllx2577 tmp]#
