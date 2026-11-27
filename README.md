Fabio, achei a causa do gec-ear.ear.failed no batch (caddeapllx2884).

O gec-api.war não sobe porque o JaxRsActivator dá NoClassDefFoundError: org/apache/commons/lang3/StringUtils (ClassNotFoundException no módulo deployment.gec-ear.ear).

Conferi o EAR publicado (unzip -l gec-ear.ear | grep lang3) e não tem nenhuma lib commons-lang3 dentro. Ela não está sendo empacotada no build.

Precisa ajustar no gec-ear/pom.xml (dependência commons-lang3 com scope compile, para entrar no lib/ do EAR) e gerar novo build.

O JBoss está de pé e os demais deployments estão OK (framework.jar, framework_sisgd.jar, wmq.jmsra.rar). Só o gec-ear.ear fica FAILED, e por isso a task Check Deployments fica nos 2 loops de 60 tentativas (~11 min).

Segue o log em anexo (server.log, do boot das 12:06 com o erro) e o gec-ear.ear.failed.
