framework.jar
framework_sisgd.jar
wmq.jmsra.rar
 
[root@caddeapllx2884 p981778]# tail -n 40 /logs/jboss/jboss-eap/standalone/sigec-portabilidade-batch/server.log

2026-11-17 12:27:25,719 INFO  [org.apache.activemq.artemis.ra] (MSC service thread 1-1) AMQ151007: Resource adaptor started

2026-11-17 12:27:25,720 INFO  [org.jboss.as.connector.services.resourceadapters.ResourceAdapterActivatorService$ResourceAdapterActivator] (MSC service thread 1-1) IJ020002: Deployed: file://RaActivatoractivemq-ra

2026-11-17 12:27:25,720 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-4) WFLYJCA0002: Conectores de Jakarta vinculados ConnectionFactory [java:/JmsXA]

2026-11-17 12:27:25,721 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-4) WFLYJCA0118: Vínculo de criação de conexão chamado java:/JmsXA para o alias java:jboss/DefaultJMSConnectionFactory

2026-11-17 12:27:25,722 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "gec-ear.ear")]) - falha na descrição: {

    "WFLYCTL0412: Serviços necessários que não estão instalados:" => [

        "module.resolved.service.\"deployment.gec-ear.ear.gec-ejb.jar\".main",

        "jboss.module.spec.service.\"deployment.framework_sisgd.jar\".main",

        "jboss.module.spec.service.\"deployment.framework.jar\".main",

        "jboss.module.spec.service.\"deployment.wmq.jmsra.rar\".main",

        "module.resolved.service.\"deployment.gec-ear.ear.gec-api.war\".main",

        "module.resolved.service.\"deployment.gec-ear.ear.gec-batch.jar\".main",

        "module.resolved.service.\"deployment.gec-ear.ear\".main"

    ],

    "WFLYCTL0180: Os serviços com falta/indisponibilidade de dependências " => [

        "jboss.module.service.\"deployment.gec-ear.ear.gec-ejb.jar\".main faltam [module.resolved.service.\"deployment.gec-ear.ear.gec-ejb.jar\".main]",

        "jboss.module.resolve.phase.\"deployment.gec-ear.ear\".main.1 faltam [jboss.module.spec.service.\"deployment.framework_sisgd.jar\".main, jboss.module.spec.service.\"deployment.framework.jar\".main, jboss.module.spec.service.\"deployment.wmq.jmsra.rar\".main]",

        "jboss.module.service.\"deployment.gec-ear.ear.gec-api.war\".main faltam [module.resolved.service.\"deployment.gec-ear.ear.gec-api.war\".main]",

        "jboss.module.resolve.phase.\"deployment.gec-ear.ear.gec-ejb.jar\".main.1 faltam [jboss.module.spec.service.\"deployment.framework.jar\".main, jboss.module.spec.service.\"deployment.wmq.jmsra.rar\".main]",

        "jboss.module.service.\"deployment.gec-ear.ear.gec-batch.jar\".main faltam [module.resolved.service.\"deployment.gec-ear.ear.gec-batch.jar\".main]",

        "jboss.module.resolve.phase.\"deployment.gec-ear.ear.gec-batch.jar\".main.1 faltam [jboss.module.spec.service.\"deployment.framework.jar\".main, jboss.module.spec.service.\"deployment.wmq.jmsra.rar\".main]",

        "jboss.module.resolve.phase.\"deployment.gec-ear.ear.gec-api.war\".main.1 faltam [jboss.module.spec.service.\"deployment.framework_sisgd.jar\".main, jboss.module.spec.service.\"deployment.framework.jar\".main, jboss.module.spec.service.\"deployment.wmq.jmsra.rar\".main]",

        "jboss.module.service.\"deployment.gec-ear.ear\".main faltam [module.resolved.service.\"deployment.gec-ear.ear\".main]"

    ]

}

2026-11-17 12:27:25,804 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 47) WFLYSRV0010: "gec-ear.ear" foi implantado (runtime-name: "gec-ear.ear")

2026-11-17 12:27:25,805 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0183: Relatório

de status de serviçoWFLYCTL0184: Não falta/insatisfaz nenhuma das dependências:

service jboss.module.spec.service."deployment.framework.jar".main (faltam) dependentes: [service jboss.module.resolve.phase."deployment.gec-ear.ear".main.1, service jboss.module.resolve.phase."deployment.gec-ear.ear.gec-ejb.jar".main.1, service jboss.module.resolve.phase."deployment.gec-ear.ear.gec-batch.jar".main.1, service jboss.module.resolve.phase."deployment.gec-ear.ear.gec-api.war".main.1]

service jboss.module.spec.service."deployment.framework_sisgd.jar".main (faltam) dependentes: [service jboss.module.resolve.phase."deployment.gec-ear.ear".main.1, service jboss.module.resolve.phase."deployment.gec-ear.ear.gec-api.war".main.1]

service jboss.module.spec.service."deployment.wmq.jmsra.rar".main (faltam) dependentes: [service jboss.module.resolve.phase."deployment.gec-ear.ear".main.1, service jboss.module.resolve.phase."deployment.gec-ear.ear.gec-ejb.jar".main.1, service jboss.module.resolve.phase."deployment.gec-ear.ear.gec-batch.jar".main.1, service jboss.module.resolve.phase."deployment.gec-ear.ear.gec-api.war".main.1]

service module.resolved.service."deployment.gec-ear.ear".main (faltam) dependentes: [service jboss.module.service."deployment.gec-ear.ear".main]

service module.resolved.service."deployment.gec-ear.ear.gec-api.war".main (faltam) dependentes: [service jboss.module.service."deployment.gec-ear.ear.gec-api.war".main]

service module.resolved.service."deployment.gec-ear.ear.gec-batch.jar".main (faltam) dependentes: [service jboss.module.service."deployment.gec-ear.ear.gec-batch.jar".main]

service module.resolved.service."deployment.gec-ear.ear.gec-ejb.jar".main (faltam) dependentes: [service jboss.module.service."deployment.gec-ear.ear.gec-ejb.jar".main]

WFLYCTL0448: 5 serviços adicionais estão inativos devido a ausência ou falha das suas dependências

2026-11-17 12:27:25,833 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Retomando servidor

2026-11-17 12:27:25,835 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) iniciado (com erros) em 8136ms - Iniciado(s) 457 de serviços 741 (12 serviços falharam ou tinham dependências ausentes, os serviços 469 estão lentos, passivos ou sob demanda)

2026-11-17 12:27:25,836 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: A interface de gerenciamento http escutando em http://0.0.0.0:9990/management

2026-11-17 12:27:25,836 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0051: O console de administração escutando em http://0.0.0.0:9990

[root@caddeapllx2884 p981778]#






 esse erro o do batch é a mesma correção??

 Se for me mada ai que ja madn oprop jeferson ajustar
