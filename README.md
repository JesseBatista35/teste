
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]# grep -n "Deployed\|WFLYSRV0010\|siarg.war" /logs/jboss/jboss-eap/standalone/siarg-interno/server.log | head -20
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]# grep -n "WebXml\|omnifaces.config" /logs/jboss/jboss-eap/standalone/siarg-interno/server.log | head -10
1636:08:38:42,759 ERROR [io.undertow.request] (default task-33) UT005023: Exception handling request to /siarg/WEB-INF/errorpages/404.xhtml: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
1637:   at org.omnifaces.config.WebXml.instance(WebXml.java:131) [omnifaces-3.14.jar:3.14]
1684:08:38:43,013 ERROR [io.undertow.servlet.request] (default task-33) UT015012: Failed to generate error page /siarg/WEB-INF/errorpages/404.xhtml for original exception: null. Generating error page resulted in a 500.: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
1685:   at org.omnifaces.config.WebXml.instance(WebXml.java:131) [omnifaces-3.14.jar:3.14]
1733:08:42:24,496 ERROR [io.undertow.request] (default task-33) UT005023: Exception handling request to /siarg/WEB-INF/errorpages/404.xhtml: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
1734:   at org.omnifaces.config.WebXml.instance(WebXml.java:131) [omnifaces-3.14.jar:3.14]
1781:08:42:24,509 ERROR [io.undertow.servlet.request] (default task-33) UT015012: Failed to generate error page /siarg/WEB-INF/errorpages/404.xhtml for original exception: null. Generating error page resulted in a 500.: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
1782:   at org.omnifaces.config.WebXml.instance(WebXml.java:131) [omnifaces-3.14.jar:3.14]
1830:08:42:43,691 ERROR [io.undertow.request] (default task-33) UT005023: Exception handling request to /siarg/WEB-INF/errorpages/404.xhtml: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
1831:   at org.omnifaces.config.WebXml.instance(WebXml.java:131) [omnifaces-3.14.jar:3.14]
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]# ls -la /logs/jboss/jboss-eap/standalone/siarg-interno/ | grep server.log
-rw-r--r-- 1 jboss jboss  453489 set  8 10:22 server.log
-rw-r--r-- 1 root  root     2085 ago 10 09:21 server.log.2026-08-07.gz
-rw-r--r-- 1 jboss jboss  573613 ago 10 14:49 server.log.2026-08-10.gz
-rw-r--r-- 1 jboss jboss  984272 ago 11 15:42 server.log.2026-08-11.gz
-rw-r--r-- 1 jboss jboss 1051581 ago 12 16:03 server.log.2026-08-12.gz
-rw-r--r-- 1 jboss jboss  471568 ago 13 17:17 server.log.2026-08-13.gz
-rw-r--r-- 1 jboss jboss  267692 ago 14 09:58 server.log.2026-08-14.gz
-rw-r--r-- 1 jboss jboss  208506 ago 15 02:20 server.log.2026-08-15.gz
-rw-r--r-- 1 jboss jboss  205049 ago 16 02:20 server.log.2026-08-16.gz
-rw-r--r-- 1 jboss jboss  204750 ago 17 02:20 server.log.2026-08-17.gz
-rw-r--r-- 1 jboss jboss  383007 ago 18 19:06 server.log.2026-08-18.gz
-rw-r--r-- 1 jboss jboss 1009749 ago 19 20:49 server.log.2026-08-19.gz
-rw-r--r-- 1 jboss jboss  580726 ago 20 17:59 server.log.2026-08-20.gz
-rw-r--r-- 1 jboss jboss  205597 ago 21 02:20 server.log.2026-08-21.gz
-rw-r--r-- 1 jboss jboss  205440 ago 22 02:20 server.log.2026-08-22.gz
-rw-r--r-- 1 jboss jboss  204771 ago 23 02:20 server.log.2026-08-23.gz
-rw-r--r-- 1 root  root     2098 ago 25 08:24 server.log.2026-08-24.gz
-rw-r--r-- 1 jboss jboss  369565 ago 25 21:18 server.log.2026-08-25.gz
-rw-r--r-- 1 jboss jboss  416419 ago 26 17:40 server.log.2026-08-26.gz
-rw-r--r-- 1 jboss jboss  211297 ago 27 02:20 server.log.2026-08-27.gz
-rw-r--r-- 1 jboss jboss  972427 ago 28 15:45 server.log.2026-08-28.gz
-rw-r--r-- 1 jboss jboss  212940 ago 29 02:20 server.log.2026-08-29.gz
-rw-r--r-- 1 jboss jboss  207897 ago 30 02:20 server.log.2026-08-30.gz
-rw-r--r-- 1 jboss jboss  237257 ago 31 23:05 server.log.2026-08-31.gz
-rw-r--r-- 1 jboss jboss  760077 set  1 22:26 server.log.2026-09-01.gz
-rw-r--r-- 1 jboss jboss  269018 set  2 06:00 server.log.2026-09-02.gz
-rw-r--r-- 1 root  root     2094 set  4 13:54 server.log.2026-09-03.gz
-rw-r--r-- 1 jboss jboss  485026 set  4 15:49 server.log.2026-09-04.gz
-rw-r--r-- 1 jboss jboss    7073 set  5 02:20 server.log.2026-09-05.gz
-rw-r--r-- 1 jboss jboss    6973 set  6 02:20 server.log.2026-09-06.gz
-rw-r--r-- 1 jboss jboss    7899 set  7 06:00 server.log.2026-09-07.gz
[root@caddeapllx2577 tmp]#
