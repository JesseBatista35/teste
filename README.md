[root@caddeapllx1945 bin]# nohup ./standalone.sh -c standalone-full-ha.xml > /tmp/jboss-full.log 2>&1 &
[1] 24712
[root@caddeapllx1945 bin]# tail -100 /logs/jboss/server.log | grep -i "started\|fatal\|error"
2026-06-16 15:05:04,896 ERROR [org.jboss.as.controller] (Controller Boot Thread)
2026-06-16 15:05:04,897 ERROR [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0055: Foi vista uma exceção durante a inicialização: org.jboss.as.controller.persistence.ConfigurationPersistenceException: WFLYCTL0085: Falha ao pesquisar a configuração
2026-06-16 15:05:04,898 FATAL [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0056: A inicialização do servidor falhou numa maneira irrecuperável: encerrando. Consulte mensagens anteriores para maiores detalhes.
[1]+  Fim da execução com status 1      nohup ./standalone.sh -c standalone-full-ha.xml > /tmp/jboss-full.log 2>&1
[root@caddeapllx1945 bin]#
[root@caddeapllx1945 bin]#
[root@caddeapllx1945 bin]#
[root@caddeapllx1945 bin]#
