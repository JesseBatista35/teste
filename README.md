Fabio, fizemos o rename do online para sigec-portabilidade-online e ajustamos a release.

O problema que estava impedindo a config de chegar no servidor era o alias do artefato (o playbook procura _SIGEC-portabilidade-online-config), então o standalone-full-ha.xml do repo não era copiado e o JBoss caía no boot por causa do security-realm legado no Java 17. Corrigido: o standalone agora vai pro caddeapllx2871 e o JBoss sobe, a 9990 responde.

Agora quebra só o deploy do gec-ear.ear: no Check Deployments ele fica FAILED, enquanto framework.jar, framework_sisgd.jar e wmq.jmsra.rar ficam OK. O motivo está no server.log do JBoss (/opt/jboss-eap/standalone/log/server.log); ainda não li. Os suspeitos que tínhamos eram o ELY01148 (keycloak legado + application-security-domain "other" no Undertow) e o commons-lang3 fora do EAR (gec-ear/pom.xml com scope compile). Também vale confirmar se a build 878866 (5.0.0-BATCH-SNAPSHOT) é a do perfil online.

Pode seguir daqui com os ajustes e as validações?
