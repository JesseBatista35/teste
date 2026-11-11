Oi Jesse Mouta Pereira Batista! Tudo bem?
 
Mais uma vez, preciso da sua consultoria
 
Tentaram implantar em PRD as releases do SIHDG e postaram o erro abaixo na tarefa: poderia traduzir o erro pra mim, por favor, kkk
 
À CAIXA\CEMOTBR\PRODUCAO BATCH (x)ATENDIDO COM ERRO
1- Informamos que as variáveis foram devidamente ajustadas nas libraries SIHDG-ANGULAR18-PRD e SIHDG-JBOSS8-PRD:
A task foi configurada
2- Criado e executada novas releases:
SIHDG-angular18:SIHDG-angular18-3.27.0.0(3) https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-pipeline-progress&releaseId=552884 
SIHDG-jboss8 ---> SIHDG-jboss8-3.22.0.5(14) https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-pipeline-progress&releaseId=553178 3- 
Para a release do "SIHDG-jboss8" na chamada do banco conforme erro abaixo:
19:42:43,300 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Operation ("deploy") failed - address: ([("deployment" => "sihdg-3.22.0.4.ear")]) - failure description: { "WFLYCTL0412: Required services that are not installed:" => ["jboss.naming.context.java.jboss.jdbc.sihdgDS"], "WFLYCTL0180: Services with missing/unavailable dependencies" => [ "jboss.persistenceunit.\"sihdg-3.22.0.4.ear/sihdg-api.war#sihdgDS\" is missing [jboss.naming.context.java.jboss.jdbc.sihdgDS]", "jboss.persistenceunit.\"sihdg-3.22.0.4.ear/sihdg-api.war#sihdgDS\".__FIRST_PHASE__ is missing [jboss.naming.context.java.jboss.jdbc.sihdgDS]" ] }
19:42:43,305 INFO [org.jboss.as.server] (ServerService Thread Pool -- 33) WFLYSRV0010: Deployed "sihdg-3.22.0.4.ear" (runtime-name : "sihdg-3.22.0.4.ear")
19:42:43,306 INFO [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0183: Service status report WFLYCTL0184: New missing/unsatisfied dependencies: service jboss.naming.context.java.jboss.jdbc.sihdgDS (missing) dependents: [service jboss.persistenceunit."sihdg-3.22.0.4.ear/sihdg-api.war#sihdgDS".__FIRST_PHASE__, service jboss.persistenceunit."sihdg-3.22.0.4.ear/sihdg-api.war#sihdgDS"] WFLYCTL0448: 190 additional services are down due to their dependencies being missing or failed
19:42:43,323 INFO [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
19:42:43,325 INFO [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: Http management interface listening on http://0.0.0.0:9990/management
19:42:43,325 INFO [org.jboss.as] (Controller Boot Thread) WFLYSRV0054: Admin console is not enabled 19:42:43,325 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) started (with errors) in 10920ms - Started 1018 of 1372 services (196 services failed or missing dependencies, 260 services are lazy, passive or on-demand) - Server configuration file in use: standalone.xml
4- Ficamos à disposição
Att;
HITSS\CEMOTBR\Análise e Preparo da Produção
Edgar Menezes
 
 
Preciso muito da sua ajuda, Jesse Mouta Pereira Batista
 
Jesse Mouta Pereira Batista, bom dia!
 
