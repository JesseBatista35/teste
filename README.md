
[p585600@caddeapllx2577 ~]$ netstat -tlnp 2>/dev/null | grep 8009
tcp        0      0 0.0.0.0:8009            0.0.0.0:*               OUÇA       -
[p585600@caddeapllx2577 ~]$ ss -tlnp 2>/dev/null | grep 8009
LISTEN 0      10000        0.0.0.0:8009       0.0.0.0:*
[p585600@caddeapllx2577 ~]$ ss -tlnp 2>/dev/null | grep java
[p585600@caddeapllx2577 ~]$ grep -n -i "ajp" /logs/jboss/jboss-eap/standalone/siarg-interno/server.log
22:21:04:42,215 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0008: Undertow AJP ouvinte ajp está suspendendo
24:21:04:42,226 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0007: Undertow AJP ouvinte ajp interrompido, estava vinculado a 0.0.0.0:8009
171:21:04:46,178 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0006: UndertowAJP ouvinte ajp escutando em 0.0.0.0:8009
[p585600@caddeapllx2577 ~]$
