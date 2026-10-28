
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]# grep -nE "WFLYUT0021|WFLYEE0047" /logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log | tail -4
2096:Caused by: java.lang.IllegalArgumentException: WFLYEE0047: Conflito de incompatibilidade de vínculo na java:global/SERVER fonte:org.jboss.as.ee.component.EnvEntryInjectionSource@ca49a78c
2110:    Caused by: java.lang.IllegalArgumentException: WFLYEE0047: Conflito de incompatibilidade de vínculo na java:global/SERVER fonte:org.jboss.as.ee.component.EnvEntryInjectionSource@ca49a78c"},
2182:2026-10-28 16:47:47,179 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 140) WFLYUT0021: Contexto web registrado: '/sigsjintrastatic' para servidor 'default-server'
2185:2026-10-28 16:47:47,867 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 124) WFLYUT0021: Contexto web registrado: '/sigsj_intranet' para servidor 'default-server'
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]# curl -s -o /dev/null -w "%{http_code}\n" http://localhost:8080/sigsj_intranet/
200
[root@caddeapllx955 deployments]#
