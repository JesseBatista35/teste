$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$ awk 'NR>27940 && /ERROR/' /logs/jboss/jboss-eap/standalone/siarg-interno/server.log | head -5
21:36:02,195 ERROR [io.undertow.request] (default task-1) UT005023: Exception handling request to /siarg/WEB-INF/errorpages/404.xhtml: java.lang.RuntimeException: java.lang.IllegalArgumentException: Either HTTP 500 or java.lang.Throwable error page is required in web.xml or web-fragment.xml. Neither was found.
21:36:02,199 ERROR [io.undertow.servlet.request] (default task-1) UT015012: Failed to generate error page /siarg/WEB-INF/errorpages/404.xhtml for original exception: null. Generating error page resulted in a 500.: java.lang.RuntimeException: java.lang.IllegalArgumentException: Either HTTP 500 or java.lang.Throwable error page is required in web.xml or web-fragment.xml. Neither was found.
21:36:20,179 ERROR [io.undertow.request] (default task-1) UT005023: Exception handling request to /siarg/WEB-INF/errorpages/404.xhtml: java.lang.RuntimeException: java.lang.IllegalArgumentException: Either HTTP 500 or java.lang.Throwable error page is required in web.xml or web-fragment.xml. Neither was found.
21:36:20,183 ERROR [io.undertow.servlet.request] (default task-1) UT015012: Failed to generate error page /siarg/WEB-INF/errorpages/404.xhtml for original exception: null. Generating error page resulted in a 500.: java.lang.RuntimeException: java.lang.IllegalArgumentException: Either HTTP 500 or java.lang.Throwable error page is required in web.xml or web-fragment.xml. Neither was found.
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$ awk 'NR>27940 && /ERROR/{print NR; exit}' /logs/jboss/jboss-eap/standalone/siarg-interno/server.log
28038
[p585600@caddeapllx2577 ~]$
