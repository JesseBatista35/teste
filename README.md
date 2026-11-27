
[root@caddeapllx2884 standalone]# cd /logs/jboss/jboss-eap/standalone/sigec-portabilidade-batch
[root@caddeapllx2884 sigec-portabilidade-batch]#
[root@caddeapllx2884 sigec-portabilidade-batch]#
[root@caddeapllx2884 sigec-portabilidade-batch]#
[root@caddeapllx2884 sigec-portabilidade-batch]# ls -lh
total 136M
-rw-r--r-- 1 jboss jboss    0 nov 17 11:08 audit.log
-rw-r--r-- 1 jboss jboss  77K nov 27 12:06 backupgc.log
-rw-r--r-- 1 root  root  218K nov 27 12:16 console-stdout.log
-rw-r--r-- 1 jboss jboss  79K nov 27 12:21 gc.log
-rw-r--r-- 1 jboss jboss 464K nov 27 12:16 server.log
-rw-r--r-- 1 jboss jboss  78K nov 17 14:19 server.log.2026-11-17.gz
-rw-r--r-- 1 jboss jboss 2,8M nov 18 23:59 server.log.2026-11-18.gz
-rw-r--r-- 1 jboss jboss 5,2M nov 19 23:59 server.log.2026-11-19.gz
-rw-r--r-- 1 jboss jboss 5,2M nov 20 23:59 server.log.2026-11-20.gz
-rw-r--r-- 1 jboss jboss 2,8M nov 21 23:59 server.log.2026-11-21.gz
-rw-r--r-- 1 jboss jboss 2,8M nov 22 23:59 server.log.2026-11-22.gz
-rw-r--r-- 1 jboss jboss 5,2M nov 23 23:59 server.log.2026-11-23.gz
-rw-r--r-- 1 jboss jboss 5,2M nov 24 23:59 server.log.2026-11-24.gz
-rw-r--r-- 1 jboss jboss 4,9M nov 25 23:59 server.log.2026-11-25.gz
-rw-r--r-- 1 jboss jboss 102M nov 26 17:44 server.log.2026-11-26
-rw-r--r-- 1 jboss jboss  301 nov 25 17:13 sigec.log
-rw-r--r-- 1 jboss jboss  382 nov 18 17:40 sigec.log.2026-11-18.gz
[root@caddeapllx2884 sigec-portabilidade-batch]#
[root@caddeapllx2884 sigec-portabilidade-batch]#
[root@caddeapllx2884 sigec-portabilidade-batch]#
[root@caddeapllx2884 sigec-portabilidade-batch]# grep -n -E "WFLYCTL0013|WFLYCTL0080|WFLYSRV0021|Caused by" server.log | tail -40
2374:Caused by: java.lang.RuntimeException: RESTEASY003325: Failed to construct public br.gov.caixa.api.JaxRsActivator(javax.servlet.ServletConfig)
2401:Caused by: java.lang.NoClassDefFoundError: org/apache/commons/lang3/StringUtils
2412:Caused by: java.lang.ClassNotFoundException: org.apache.commons.lang3.StringUtils from [Module "deployment.gec-ear.ear" from Service Module Loader]
2420:2026-11-27 12:00:40,845 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "gec-ear.ear")]) - falha na descrição: {"WFLYCTL0080: Falha de serviços" => {"jboss.deployment.subunit.\"gec-ear.ear\".\"gec-api.war\".undertow-deployment" => "java.lang.RuntimeException: RESTEASY003325: Failed to construct public br.gov.caixa.api.JaxRsActivator(javax.servlet.ServletConfig)
2421:    Caused by: java.lang.RuntimeException: RESTEASY003325: Failed to construct public br.gov.caixa.api.JaxRsActivator(javax.servlet.ServletConfig)
2422:    Caused by: java.lang.NoClassDefFoundError: org/apache/commons/lang3/StringUtils
2423:    Caused by: java.lang.ClassNotFoundException: org.apache.commons.lang3.StringUtils from [Module \"deployment.gec-ear.ear\" from Service Module Loader]"}}
4808:Caused by: java.lang.RuntimeException: RESTEASY003325: Failed to construct public br.gov.caixa.api.JaxRsActivator(javax.servlet.ServletConfig)
4835:Caused by: java.lang.NoClassDefFoundError: org/apache/commons/lang3/StringUtils
4846:Caused by: java.lang.ClassNotFoundException: org.apache.commons.lang3.StringUtils from [Module "deployment.gec-ear.ear" from Service Module Loader]
4854:2026-11-27 12:06:30,361 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "gec-ear.ear")]) - falha na descrição: {"WFLYCTL0080: Falha de serviços" => {"jboss.deployment.subunit.\"gec-ear.ear\".\"gec-api.war\".undertow-deployment" => "java.lang.RuntimeException: RESTEASY003325: Failed to construct public br.gov.caixa.api.JaxRsActivator(javax.servlet.ServletConfig)
4855:    Caused by: java.lang.RuntimeException: RESTEASY003325: Failed to construct public br.gov.caixa.api.JaxRsActivator(javax.servlet.ServletConfig)
4856:    Caused by: java.lang.NoClassDefFoundError: org/apache/commons/lang3/StringUtils
4857:    Caused by: java.lang.ClassNotFoundException: org.apache.commons.lang3.StringUtils from [Module \"deployment.gec-ear.ear\" from Service Module Loader]"}}
[root@caddeapllx2884 sigec-portabilidade-batch]#
[root@caddeapllx2884 sigec-portabilidade-batch]#
[root@caddeapllx2884 sigec-portabilidade-batch]#
[root@caddeapllx2884 sigec-portabilidade-batch]# head -c 3000 /opt/jboss-eap/standalone/deployments/gec-ear.ear.failed
"{\"WFLYCTL0080: Falha de serviços\" => {\"jboss.deployment.subunit.\\\"gec-ear.ear\\\".\\\"gec-api.war\\\".undertow-deployment\" => \"java.lang.RuntimeException: RESTEASY003325: Failed to construct public br.gov.caixa.api.JaxRsActivator(javax.servlet.ServletConfig)
    Caused by: java.lang.RuntimeException: RESTEASY003325: Failed to construct public br.gov.caixa.api.JaxRsActivator(javax.servlet.ServletConfig)
    Caused by: java.lang.NoClassDefFoundError: org/apache/commons/lang3/StringUtils
    Caused by: java.lang.ClassNotFoundException: org.apache.commons.lang3.StringUtils from [Module \\\"deployment.gec-ear.ear\\\" from Service Module Loader]\"}}"[root@caddeapllx2884 sigec-portabilidade-batch]#
[root@caddeapllx2884 sigec-portabilidade-batch]#
[root@caddeapllx2884 sigec-portabilidade-batch]#
[root@caddeapllx2884 sigec-portabilidade-batch]#
