-sh-4.2$
-sh-4.2$ sudo su
[sudo] senha para p585600:
[root@sbrdeapllx069 p585600]# /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /] /host=sbrdeapllx104_credito/server-config=sigec-portabilidade-batch_node1_lx104:read-attribute(name=status)
{
    "outcome" => "success",
    "result" => "STARTED"
}
[domain@10.116.89.0:9999 /] /host=sbrdeapllx104_credito/server=sigec-portabilidade-batch_node1_lx104:read-attribute(name=server-state)
{
    "outcome" => "success",
    "result" => "running"
}
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /] /host=sbrdeapllx104_credito/server=sigec-portabilidade-batch_node1_lx104:read-children-resources(child-type=deployment, include-runtime=true)
{
    "outcome" => "success",
    "result" => {
        "SIGEC-PORTABILIDADE-BATCH" => {
            "content" => [{
                "hash" => bytes {
                    0x2b, 0x6d, 0xcb, 0x33, 0xbe, 0xc9, 0x2c, 0x78,
                    0x7d, 0x67, 0x92, 0xfb, 0x3d, 0x58, 0x00, 0x5f,
                    0x2a, 0x27, 0x17, 0x60
                },
                "archive" => undefined
            }],
            "disabled-time" => undefined,
            "disabled-timestamp" => undefined,
            "enabled" => true,
            "enabled-time" => 1792687733271L,
            "enabled-timestamp" => "2026-10-22 13:48:53,271 BRT",
            "managed" => true,
            "name" => "SIGEC-PORTABILIDADE-BATCH",
            "owner" => undefined,
            "persistent" => true,
            "runtime-name" => "gec-4.53.2batch.build.1-b1510.ear",
            "status" => "OK",
            "subdeployment" => {
                "gec-ejb.jar" => undefined,
                "gec-web.war" => undefined,
                "gec-api.war" => undefined
            },
            "subsystem" => {
                "jaxrs" => undefined,
                "jpa" => undefined,
                "logging" => undefined
            }
        },
        "framework-2.0.1.jar" => {
            "content" => [{
                "hash" => bytes {
                    0xbe, 0xe2, 0xa4, 0x60, 0x2a, 0x1e, 0x97, 0x85,
                    0x99, 0x4c, 0x5d, 0xdf, 0x82, 0xc3, 0x15, 0x3f,
                    0x64, 0xc7, 0x0f, 0xc7
                },
                "archive" => undefined
            }],
            "disabled-time" => undefined,
            "disabled-timestamp" => undefined,
            "enabled" => true,
            "enabled-time" => 1792498808615L,
            "enabled-timestamp" => "2026-10-20 09:20:08,615 BRT",
            "managed" => true,
            "name" => "framework-2.0.1.jar",
            "owner" => undefined,
            "persistent" => true,
            "runtime-name" => "framework.jar",
            "status" => "OK",
            "subdeployment" => undefined,
            "subsystem" => {
                "ejb3" => undefined,
                "logging" => undefined
            }
        },
        "wmq.jmsra.rar" => {
            "content" => [{
                "hash" => bytes {
                    0x73, 0xf3, 0xf9, 0x5d, 0x33, 0x99, 0x3f, 0x96,
                    0x81, 0x13, 0xd1, 0xff, 0x26, 0x88, 0x60, 0xbb,
                    0xbc, 0x73, 0x7d, 0xaa
                },
                "archive" => undefined
            }],
            "disabled-time" => undefined,
            "disabled-timestamp" => undefined,
            "enabled" => true,
            "enabled-time" => 1792498808678L,
            "enabled-timestamp" => "2026-10-20 09:20:08,678 BRT",
            "managed" => true,
            "name" => "wmq.jmsra.rar",
            "owner" => undefined,
            "persistent" => true,
            "runtime-name" => "wmq.jmsra.rar",
            "status" => "OK",
            "subdeployment" => undefined,
            "subsystem" => {"logging" => undefined}
        }
    }
}
[domain@10.116.89.0:9999 /] /host=sbrdeapllx104_credito/server-config=sigec-portabilidade-batch_node1_lx104:read-attribute(name=group)
{
    "outcome" => "success",
    "result" => "sigec-portabilidade-batch"
}
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]




[sudo] senha para p585600:
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# LOG=/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade-batch_node1_lx104/server.log
[root@sbrdeapllx104 p585600]# ls -lt $(dirname $LOG) | head
total 1985704
-rw-rw-r-- 1 jboss jboss    738836 Out 22 14:26 server.log
-rw-rw-r-- 1 jboss jboss 100217582 Out 22 14:26 sigec.log
-rw-rw-r-- 1 jboss jboss  20971552 Out 22 14:23 server.log.1
-rw-rw-r-- 1 jboss jboss  21214943 Out 22 13:20 server.log.2
-rw-rw-r-- 1 jboss jboss  21103757 Out 22 12:35 server.log.3
-rw-rw-r-- 1 jboss jboss 210368054 Out 21 23:59 sigec.log.2026-10-21
-rw-rw-r-- 1 jboss jboss  96208584 Out 20 23:59 sigec.log.2026-10-20
-rw-rw-r-- 1 jboss jboss  20285276 Out 19 23:59 sigec.log.2026-10-19
-rw-rw-r-- 1 jboss jboss  20936000 Out 16 01:33 server.log.2026-10-16
[root@sbrdeapllx104 p585600]# grep -niE "stopped|WFLYSRV0028|WFLYSRV0010|WFLYCTL0013|deploy" $LOG | tail -40
770:    at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
1007:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
1066:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
1138:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
1375:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
1434:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
1506:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
1743:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
1802:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
1874:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
2111:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
2170:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
2242:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
2489:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
2548:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
2620:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
2857:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
2916:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
2988:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
3226:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
3286:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
3355:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
3586:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
3646:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
3715:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
3946:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
4006:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
4075:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
4306:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
4366:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
4435:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
4666:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
4726:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
4795:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
5026:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
5086:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
5155:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
5386:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
5446:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
5515:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
[root@sbrdeapllx104 p585600]# grep -nE "ACTC403|WFLYEJB0241|WFLYEJB0043|OutOfMemory|native thread" $LOG | tail -30
77:2026-10-22 14:24:00,847INFO (EJB default - 6)Verificando calendario envio FEBRABAN - ACTC403
78:2026-10-22 14:24:00,848INFO (EJB default - 6)Verificando existencia de portabilidades tipo ACTC403
80:2026-10-22 14:24:00,872INFO (EJB default - 6)Gerando XML ACTC403
84:2026-10-22 14:24:00,894INFO (EJB default - 6)XML ACTC403 não possui portabilidades para envio.
85:2026-10-22 14:24:00,895INFO (EJB default - 6)XML ACTC403 gerado com sucesso!
454:2026-10-22 14:25:00,650INFO (EJB default - 2)Verificando calendario envio FEBRABAN - ACTC403
455:2026-10-22 14:25:00,651INFO (EJB default - 2)Verificando existencia de portabilidades tipo ACTC403
457:2026-10-22 14:25:00,671INFO (EJB default - 2)Gerando XML ACTC403
461:2026-10-22 14:25:00,694INFO (EJB default - 2)XML ACTC403 não possui portabilidades para envio.
462:2026-10-22 14:25:00,694INFO (EJB default - 2)XML ACTC403 gerado com sucesso!
5934:2026-10-22 14:26:00,976INFO (EJB default - 9)Verificando calendario envio FEBRABAN - ACTC403
5935:2026-10-22 14:26:00,977INFO (EJB default - 9)Verificando existencia de portabilidades tipo ACTC403
5937:2026-10-22 14:26:01,045INFO (EJB default - 9)Gerando XML ACTC403
5941:2026-10-22 14:26:01,070INFO (EJB default - 9)XML ACTC403 não possui portabilidades para envio.
5942:2026-10-22 14:26:01,070INFO (EJB default - 9)XML ACTC403 gerado com sucesso!
[root@sbrdeapllx104 p585600]# ss -tnp | grep "pid=72951" | grep -cE "10.252.32.6[35]:80"
191
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
