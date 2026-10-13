-sh-4.2$ ls -ltr /logs/jboss/jboss-eap/standalone/simkt-backend-vm/
total 9552
-rw-r--r-- 1 jboss jboss       0 Ago 24 10:56 audit.log
-rw-r--r-- 1 jboss jboss     226 Set 13 00:00 server.log.2026-09-13.gz
-rw-r--r-- 1 jboss jboss  521190 Set 14 17:53 server.log.2026-09-14.gz
-rw-r--r-- 1 jboss jboss  158285 Set 15 18:42 server.log.2026-09-15.gz
-rw-r--r-- 1 jboss jboss  158113 Set 16 17:21 server.log.2026-09-16.gz
-rw-r--r-- 1 jboss jboss  226822 Set 17 18:32 server.log.2026-09-17.gz
-rw-r--r-- 1 jboss jboss  224609 Set 18 19:09 server.log.2026-09-18.gz
-rw-r--r-- 1 jboss jboss     226 Set 19 00:00 server.log.2026-09-19.gz
-rw-r--r-- 1 jboss jboss     225 Set 20 00:00 server.log.2026-09-20.gz
-rw-r--r-- 1 jboss jboss  579940 Set 21 18:27 server.log.2026-09-21.gz
-rw-r--r-- 1 jboss jboss  479429 Set 22 18:08 server.log.2026-09-22.gz
-rw-r--r-- 1 jboss jboss  478852 Set 23 21:37 server.log.2026-09-23.gz
-rw-r--r-- 1 jboss jboss 1094566 Set 24 17:09 server.log.2026-09-24.gz
-rw-r--r-- 1 jboss jboss  541348 Set 25 17:28 server.log.2026-09-25.gz
-rw-r--r-- 1 jboss jboss     225 Set 26 00:00 server.log.2026-09-26.gz
-rw-r--r-- 1 jboss jboss     226 Set 27 00:00 server.log.2026-09-27.gz
-rw-r--r-- 1 jboss jboss  285333 Set 28 17:34 server.log.2026-09-28.gz
-rw-r--r-- 1 jboss jboss  854453 Set 29 17:41 server.log.2026-09-29.gz
-rw-r--r-- 1 jboss jboss  878979 Set 30 16:08 server.log.2026-09-30.gz
-rw-r--r-- 1 jboss jboss  511791 Out  1 16:35 server.log.2026-10-01.gz
-rw-r--r-- 1 jboss jboss  328572 Out  2 15:50 server.log.2026-10-02.gz
-rw-r--r-- 1 jboss jboss     225 Out  3 00:00 server.log.2026-10-03.gz
-rw-r--r-- 1 jboss jboss     225 Out  4 00:00 server.log.2026-10-04.gz
-rw-r--r-- 1 jboss jboss   36201 Out  5 19:24 server.log.2026-10-05.gz
-rw-r--r-- 1 jboss jboss   23182 Out  6 16:14 server.log.2026-10-06.gz
-rw-r--r-- 1 jboss jboss   45037 Out  7 18:16 server.log.2026-10-07.gz
-rw-r--r-- 1 jboss jboss   56418 Out  8 16:03 backupgc.log
-rw-r--r-- 1 jboss jboss  237030 Out  8 16:18 server.log.2026-10-08.gz
-rw-r--r-- 1 jboss jboss   33053 Out  9 17:44 server.log.2026-10-09.gz
-rw-r--r-- 1 jboss jboss     224 Out 10 00:00 server.log.2026-10-10.gz
-rw-r--r-- 1 jboss jboss     226 Out 11 00:00 server.log.2026-10-11.gz
-rw-r--r-- 1 jboss jboss     225 Out 12 00:00 server.log.2026-10-12.gz
-rw-r--r-- 1 jboss jboss   48169 Out 13 07:19 gc.log
-rw-r--r-- 1 root  root  1008667 Out 13 10:52 console-stdout.log
-rw-r--r-- 1 jboss jboss  360989 Out 13 10:52 server.log
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -iE "ERROR|WARN|Privilege|datasource|WFLYCTL" /logs/jboss/jboss-eap/standalone/simkt-backend-vm/server.log.2026-10-08 | head -100
grep: /logs/jboss/jboss-eap/standalone/simkt-backend-vm/server.log.2026-10-08: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ /opt/jboss-eap/bin/jboss-cli.sh -c --command="deployment-info"
NAME                          RUNTIME-NAME                  PERSISTENT ENABLED STATUS
applicationinsights-agent.jar applicationinsights-agent.jar false      true    OK
postgresql.jar                postgresql.jar                false      true    OK
simkt.war                     simkt.war                     false      true    OK
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ /opt/jboss-eap/bin/jboss-cli.sh -c --command="/subsystem=datasources:read-resource"
{
    "outcome" => "success",
    "result" => {
        "data-source" => {
            "simkt-ds" => undefined,
            "siico-mkt-ds" => undefined
        },
        "jdbc-driver" => undefined,
        "xa-data-source" => undefined
    }
}
-sh-4.2$
-sh-4.2$
-sh-4.2$ /opt/jboss-eap/bin/jboss-cli.sh -c --command="/subsystem=datasources/data-source=<DS>:test-connection-in-pool"

{
    "outcome" => "failed",
    "failure-description" => "WFLYCTL0216: O recurso de gerenciamento '[
    (\"subsystem\" => \"datasources\"),
    (\"data-source\" => \"<DS>\")
]' não foi encontrado",
    "rolled-back" => true
}
-sh-4.2$
-sh-4.2$
