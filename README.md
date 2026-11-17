
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$ cd /opt/jboss-eap/standalone/deployments
ls -l gec-ear.ear
unzip -p gec-ear.ear META-INF/jboss-deployment-structure.xml | sed -n '/gec-web.war/,/<\/sub-deployment>/p'
-rwxrw-rw- 1 jboss jboss 95739870 nov 17 12:32 gec-ear.ear
        <sub-deployment name="gec-web.war">
                <!-- gec-web.war carrega o proprio WEB-INF/lib/arqref-core, que usa
                        br.gov.caixa.bsb.sisgd.framework.cm.ConectorException (framework_sisgd.jar).
                        As dependencias do <deployment> nao sao herdadas pelo subdeployment,
                        entao precisam ser declaradas aqui, como no gec-api.war. -->
                <dependencies>
                        <module name="deployment.framework.jar" />
                        <module name="deployment.framework_sisgd.jar" />
                </dependencies>
        </sub-deployment>
[p585600@caddeapllx2871 deployments]$
[p585600@caddeapllx2871 deployments]$
[p585600@caddeapllx2871 deployments]$
[p585600@caddeapllx2871 deployments]$
[p585600@caddeapllx2871 deployments]$ ls -l gec-ear.ear
-rwxrw-rw- 1 jboss jboss 95739870 nov 17 12:32 gec-ear.ear
[p585600@caddeapllx2871 deployments]$
[p585600@caddeapllx2871 deployments]$
[p585600@caddeapllx2871 deployments]$
[p585600@caddeapllx2871 deployments]$ L=/logs/jboss/jboss-eap/standalone/sigec-portabilidade/server.log
[p585600@caddeapllx2871 deployments]$ sed -n '/2026-11-17 12:32:5/,$p' $L > /tmp/boot.log
[p585600@caddeapllx2871 deployments]$
[p585600@caddeapllx2871 deployments]$
[p585600@caddeapllx2871 deployments]$
[p585600@caddeapllx2871 deployments]$ sudo su
[sudo] senha para p585600:
Sinto muito, tente novamente.
[sudo] senha para p585600:
[root@caddeapllx2871 deployments]# sed -n '/2026-11-17 12:32:5/,$p' $L > /tmp/boot.log
^C
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]# grep -n "Caused by" /tmp/boot.log | head -20
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]# grep -n -A14 "WFLYCTL0013.*deploy" /tmp/boot.log | head -80
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
