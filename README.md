
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]# cd /opt/jboss-eap/standalone/deployments
[root@caddeapllx955 deployments]# rm -f sigsj_intranet-ear.ear.failed
[root@caddeapllx955 deployments]# touch sigsj_intranet-ear.ear.dodeploy
[root@caddeapllx955 deployments]# sleep 40; ls -l
total 58856
-rw-r--r-- 1 jboss jboss  7497817 out 28 16:23 ojdbc8.jar
-rw-r--r-- 1 jboss jboss       10 out 28 16:23 ojdbc8.jar.deployed
-rwxrwxr-x 1 jboss jboss     8888 jun 23  2021 README.txt
-rwxrw-rw- 1 jboss jboss 51856831 out 28 16:00 sigsj_intranet-ear.ear
-rw-r--r-- 1 jboss jboss     2847 out 28 16:45 sigsj_intranet-ear.ear.failed
-rw-r--r-- 1 jboss jboss   884041 out 28 16:23 sirotcon-ejb.jar
-rw-r--r-- 1 jboss jboss       16 out 28 16:23 sirotcon-ejb.jar.deployed
[root@caddeapllx955 deployments]# grep -nE "WFLYEE0047|WFLYCTL0412|WFLYJCA0018|SIGSJ04|Caused by" /logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log | tail -15
1451:2026-10-28 16:23:40,542 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0018: Serviço de driver iniciado com nome-do-driver = ojdbc8.jar
1460:2026-10-28 16:29:26,739 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-4) WFLYJCA0010: Fonte de dados sem limite [java:jboss/datasources/SIGSJ04]
1591:2026-10-28 16:29:30,945 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0018: Serviço de driver iniciado com nome-do-driver = h2
1600:2026-10-28 16:29:31,106 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-4) WFLYJCA0018: Serviço de driver iniciado com nome-do-driver = oracle
1617:2026-10-28 16:29:31,622 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-2) WFLYJCA0001: Fonte de dados vinculada[java:jboss/datasources/SIGSJ04]
1638:2026-10-28 16:29:33,000 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0018: Serviço de driver iniciado com nome-do-driver = ojdbc8.jar
1678:Caused by: java.lang.IllegalArgumentException: WFLYEE0047: Conflito de incompatibilidade de vínculo na java:global/SERVER fonte:org.jboss.as.ee.component.EnvEntryInjectionSource@ca49a78c
1687:    Caused by: java.lang.IllegalArgumentException: WFLYEE0047: Conflito de incompatibilidade de vínculo na java:global/SERVER fonte:org.jboss.as.ee.component.EnvEntryInjectionSource@ca49a78c"},
1688:    "WFLYCTL0412: Serviços necessários que não estão instalados:" => [
1755:Caused by: java.lang.IllegalArgumentException: WFLYEE0047: Conflito de incompatibilidade de vínculo na java:global/SERVER fonte:org.jboss.as.ee.component.EnvEntryInjectionSource@ca49a78c
1766:    Caused by: java.lang.IllegalArgumentException: WFLYEE0047: Conflito de incompatibilidade de vínculo na java:global/SERVER fonte:org.jboss.as.ee.component.EnvEntryInjectionSource@ca49a78c"},
1767:    "WFLYCTL0412: Serviços necessários que não estão instalados:" => [
1824:Caused by: java.lang.IllegalArgumentException: WFLYEE0047: Conflito de incompatibilidade de vínculo na java:global/SERVER fonte:org.jboss.as.ee.component.EnvEntryInjectionSource@ca49a78c
1834:    Caused by: java.lang.IllegalArgumentException: WFLYEE0047: Conflito de incompatibilidade de vínculo na java:global/SERVER fonte:org.jboss.as.ee.component.EnvEntryInjectionSource@ca49a78c"},
1835:    "WFLYCTL0412: Serviços necessários que não estão instalados:" => [
[root@caddeapllx955 deployments]#
