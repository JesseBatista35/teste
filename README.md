root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]# cd /opt/jboss-eap/standalone/deployments
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]# grep -n -B3 -A8 "TransferenciaEletronicaLegacyCallNCR" gec-ear.ear.failed | head -60
1-"{\"WFLYCTL0080: Falha de serviços\" => {\"jboss.deployment.unit.\\\"gec-ear.ear\\\".WeldStartService\" => \"Failed to start service
2:    Caused by: org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type TransferenciaEletronicaLegacyCallNCR with qualifiers @Default
3-  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.sigec.rest.dev.ProcessadorDevRest.transferenciaEletronicaLegacyCallNCR
4-  at br.gov.caixa.sigec.rest.dev.ProcessadorDevRest.transferenciaEletronicaLegacyCallNCR(ProcessadorDevRest.java:0)
5-\"}}"
[root@caddeapllx2871 deployments]#
