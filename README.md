
-sh-4.2$ tail -50 /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | grep -E "ERROR|FAILED|Exception|Caused by|WFLY"
2026-05-28 20:23:49,038 WARN  [org.jboss.as.clustering.infinispan] (Controller Boot Thread) WFLYCLINF0004: O atributo 'strategy' do elemento 'eviction' deixou de ser suportado e será ignorado.
2026-05-28 20:23:49,038 WARN  [org.jboss.as.clustering.infinispan] (Controller Boot Thread) WFLYCLINF0004: O atributo 'strategy' do elemento 'eviction' deixou de ser suportado e será ignorado.
2026-05-28 20:23:49,202 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 22) WFLYCTL0033: A extensão 'security' é obsoleta e talvez não seja suportada em versões futuras
2026-05-28 20:23:49,542 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: O atributo 'security-realm' no recurso, no endereço '/core-service=management/management-interface=http-interface', é obsoleto e pode ser removido em uma versão futura. Veja a descrição do atributo no resultado da operação read-resource-description para saber mais sobre a substituição.
2026-05-28 20:23:49,580 WARN  [org.wildfly.iiop.openjdk] (ServerService Thread Pool -- 30) WFLYIIOP0111: SSL não foi configurado mas ssl-port property foi especificado. A conexão usará protocolo de texto não criptografado
2026-05-28 20:23:49,608 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: A nova tentativa implantação de SICMU-ear.ear falhou
2026-05-28 20:23:49,609 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: A nova tentativa implantação de wmq.jmsra.rar falhou
2026-05-28 20:23:49,609 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: A nova tentativa implantação de framework.jar falhou
2026-05-28 20:23:49,609 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: A nova tentativa implantação de applicationinsights-agent.jar falhou
2026-05-28 20:23:50,062 ERROR [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0362: As funcionalidades exigidas pelo recurso '/subsystem=infinispan/cache-container=hibernate/invalidation-cache=entity' não estão disponíveis:
2026-05-28 20:23:50,070 FATAL [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0056: A inicialização do servidor falhou numa maneira irrecuperável: encerrando. Consulte mensagens anteriores para maiores detalhes.
2026-05-28 20:23:50,093 INFO  [org.jboss.as] (MSC service thread 1-3) WFLYSRV0050: JBoss EAP 7.4.8.GA (WildFly Core 15.0.19.Final-redhat-00001) interrompido em 15ms
-sh-4.2$ ps aux | grep jboss | grep java | grep -o "log.dir=[^ ]*"
-sh-4.2$ grep -A 5 "TCPPING" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
        <!-- CORRIGIDO: jgroups TCPPING com host fixo local (sem variavel nao resolvida) -->
        <subsystem xmlns="urn:jboss:domain:jgroups:4.0">
            <channels default="ee">
                <channel name="ee" stack="tcp" cluster="ejb"/>
            </channels>
            <stacks>
--
                    <protocol type="TCPPING">
                        <property name="initial_hosts">127.0.0.1[7600]</property>
                        <property name="port_range">0</property>
                    </protocol>
                    <protocol type="MERGE3"/>
                    <protocol type="FD_SOCK"/>
-sh-4.2$

