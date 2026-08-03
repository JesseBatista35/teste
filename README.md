
sispi-dict-balde-chaves-des-19-bgr9s
Running





exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
14:34:01.693 INFO  CorrelationID[] [io.quarkus]-[1](main) sispi-dict-balde-api 1.0.0-SNAPSHOT on JVM (powered by Quarkus 3.15.1) started in 2.898s. Listening on: http://0.0.0.0:8080
14:34:01.694 INFO  CorrelationID[] [io.quarkus]-[1](main) Profile prod activated. 
14:34:01.694 INFO  CorrelationID[] [io.quarkus]-[1](main) Installed features: [agroal, cache, cdi, hibernate-validator, infinispan-client, jdbc-oracle, micrometer, narayana-jta, problem-details, rest, rest-client, rest-client-jackson, rest-jackson, scheduler, servlet, smallrye-context-propagation, smallrye-health, smallrye-openapi, swagger-ui, validacao-token, vertx]
14:35:30.221 WARN  CorrelationID[e66ef6d6-13a2-4250-9294-63fc7bbc48f9] [or.in.HOTROD]-[18](executor-thread-1) ISPN004001: Could not find 'hotrod-client.properties' file in classpath, using defaults.
14:35:30.413 INFO  CorrelationID[e66ef6d6-13a2-4250-9294-63fc7bbc48f9] [or.in.HOTROD]-[18](executor-thread-1) ISPN004074: Native Epoll transport not available, using NIO instead: io.netty.channel.epoll.Epoll
14:35:30.413 INFO  CorrelationID[e66ef6d6-13a2-4250-9294-63fc7bbc48f9] [or.in.HOTROD]-[18](executor-thread-1) ISPN004108: Native IOUring transport not available, using NIO instead: io.netty.incubator.channel.uring.IOUring
14:35:30.530 INFO  CorrelationID[e66ef6d6-13a2-4250-9294-63fc7bbc48f9] [or.in.HOTROD]-[18](executor-thread-1) ISPN004021: Infinispan version: Infinispan 'I'm Still Standing' 15.0.8.Final
14:35:30.815 INFO  CorrelationID[e66ef6d6-13a2-4250-9294-63fc7bbc48f9] [or.in.HOTROD]-[18](executor-thread-1) ISPN004021: Infinispan version: Infinispan 'I'm Still Standing' 15.0.8.Final
14:35:30.836 WARN  CorrelationID[] [or.in.HOTROD]-[29](HotRod-client-async-pool-2-2) ISPN004005: Error received from the server: java.lang.IllegalArgumentException: No interface address matching '/25.129.4.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
14:35:30.837 ERROR CorrelationID[e66ef6d6-13a2-4250-9294-63fc7bbc48f9] [br.go.ca.si.ba.ca.ControleBaldeCache]-[18](executor-thread-1) [CONTROLE_BALDE_CACHE] Erro ao obter cache. Prosseguindo sem verificacao de ataque de leitura. errMsg: java.lang.IllegalArgumentException: No interface address matching '/25.129.4.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
14:35:30.839 WARN  CorrelationID[] [or.in.HOTROD]-[29](HotRod-client-async-pool-2-2) ISPN004005: Error received from the server: java.lang.IllegalArgumentException: No interface address matching '/25.129.4.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
14:35:30.840 ERROR CorrelationID[e66ef6d6-13a2-4250-9294-63fc7bbc48f9] [br.go.ca.si.ba.ca.ControleBaldeCache]-[18](executor-thread-1) [CONTROLE_BALDE_CACHE] Erro ao obter cache. Prosseguindo sem verificacao de ataque de leitura. errMsg: java.lang.IllegalArgumentException: No interface address matching '/25.129.4.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
14:35:31.866 INFO  CorrelationID[e66ef6d6-13a2-4250-9294-63fc7bbc48f9] [br.go.ca.si.ba.se.IniciarConsultaServiceImpl]-[18](executor-thread-1) [DICT-BALDE-CHAVES] [iniciarConsulta] - Balde usuario movimentado. identificador=030*****201, tipo=PF, grupo=1, saldoAnterior=28, saldoAtual=27, tempoMs=1025
14:35:33.341 WARN  CorrelationID[] [or.in.HOTROD]-[29](HotRod-client-async-pool-2-2) ISPN004005: Error received from the server: java.lang.IllegalArgumentException: No interface address matching '/25.129.4.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
14:35:33.341 ERROR CorrelationID[bb9f54f7-42fe-44ba-99d4-041dfc175da3] [br.go.ca.si.ba.ca.ControleBaldeCache]-[18](executor-thread-1) [CONTROLE_BALDE_CACHE] Erro ao obter cache. Prosseguindo sem verificacao de ataque de leitura. errMsg: java.lang.IllegalArgumentException: No interface address matching '/25.129.4.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
14:35:33.343 WARN  CorrelationID[] [or.in.HOTROD]-[29](HotRod-client-async-pool-2-2) ISPN004005: Error received from the server: java.lang.IllegalArgumentException: No interface address matching '/25.129.4.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
14:35:33.343 ERROR CorrelationID[bb9f54f7-42fe-44ba-99d4-041dfc175da3] [br.go.ca.si.ba.ca.ControleBaldeCache]-[18](executor-thread-1) [CONTROLE_BALDE_CACHE] Erro ao obter cache. Prosseguindo sem verificacao de ataque de leitura. errMsg: java.lang.IllegalArgumentException: No interface address matching '/25.129.4.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
14:35:33.358 INFO  CorrelationID[bb9f54f7-42fe-44ba-99d4-041dfc175da3] [br.go.ca.si.ba.se.IniciarConsultaServiceImpl]-[18](executor-thread-1) [DICT-BALDE-CHAVES] [iniciarConsulta] - Balde usuario movimentado. identificador=030*****201, tipo=PF, grupo=1, saldoAnterior=27, saldoAtual=26, tempoMs=15
14:35:34.342 WARN  CorrelationID[] [or.in.HOTROD]-[29](HotRod-client-async-pool-2-2) ISPN004005: Error received from the server: java.lang.IllegalArgumentException: No interface address matching '/25.129.4.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
14:35:34.343 ERROR CorrelationID[eb21d01a-7927-4d57-9205-99efd832ec81] [br.go.ca.si.ba.ca.ControleBaldeCache]-[18](executor-thread-1) [CONTROLE_BALDE_CACHE] Erro ao obter cache. Prosseguindo sem verificacao de ataque de leitura. errMsg: java.lang.IllegalArgumentException: No interface address matching '/25.129.4.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
14:35:34.345 WARN  CorrelationID[] [or.in.HOTROD]-[29](HotRod-client-async-pool-2-2) ISPN004005: Error received from the server: java.lang.IllegalArgumentException: No interface address matching '/25.129.4.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
14:35:34.345 ERROR CorrelationID[eb21d01a-7927-4d57-9205-99efd832ec81] [br.go.ca.si.ba.ca.ControleBaldeCache]-[18](executor-thread-1) [CONTROLE_BALDE_CACHE] Erro ao obter cache. Prosseguindo sem verificacao de ataque de leitura. errMsg: java.lang.IllegalArgumentException: No interface address matching '/25.129.4.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
14:35:34.356 INFO  CorrelationID[eb21d01a-7927-4d57-9205-99efd832ec81] [br.go.ca.si.ba.se.IniciarConsultaServiceImpl]-[18](executor-thread-1) [DICT-BALDE-CHAVES] [iniciarConsulta] - Balde usuario movimentado. identificador=030*****201, tipo=PF, grupo=1, saldoAnterior=26, saldoAtual=25, tempoMs=10
14:35:35.485 WARN  CorrelationID[] [or.in.HOTROD]-[29](HotRod-client-async-pool-2-2) ISPN004005: Error received from the server: java.lang.IllegalArgumentException: No interface address matching '/25.129.4.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
14:35:35.485 ERROR CorrelationID[6b997bfb-7c3f-4a66-a0b8-2c476a621afe] [br.go.ca.si.ba.ca.ControleBaldeCache]-[18](executor-thread-1) [CONTROLE_BALDE_CACHE] Erro ao obter cache. Prosseguindo sem verificacao de ataque de leitura. errMsg: java.lang.IllegalArgumentException: No interface address matching '/25.129.4.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
14:35:35.487 WARN  CorrelationID[] [or.in.HOTROD]-[29](HotRod-client-async-pool-2-2) ISPN004005: Error received from the server: java.lang.IllegalArgumentException: No interface address matching '/25.129.4.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
14:35:35.488 ERROR CorrelationID[6b997bfb-7c3f-4a66-a0b8-2c476a621afe] [br.go.ca.si.ba.ca.ControleBaldeCache]-[18](executor-thread-1) [CONTROLE_BALDE_CACHE] Erro ao obter cache. Prosseguindo sem verificacao de ataque de leitura. errMsg: java.lang.IllegalArgumentException: No interface address matching '/25.129.4.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
14:35:35.498 INFO  CorrelationID[6b997bfb-7c3f-4a66-a0b8-2c476a621afe] [br.go.ca.si.ba.se.IniciarConsultaServiceImpl]-[18](executor-thread-1) [DICT-BALDE-CHAVES] [iniciarConsulta] - Balde usuario movimentado. identificador=030*****201, tipo=PF, grupo=1, saldoAnterior=25, saldoAtual=24, tempoMs=10
14:35:36.430 WARN  CorrelationID[] [or.in.HOTROD]-[29](HotRod-client-async-pool-2-2) ISPN004005: Error received from the server: java.lang.IllegalArgumentException: No interface address matching '/25.129.4.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
14:35:36.431 ERROR CorrelationID[c6bc5d73-d6c7-4eed-9cdd-e7320609c6e6] [br.go.ca.si.ba.ca.ControleBaldeCache]-[18](executor-thread-1) [CONTROLE_BALDE_CACHE] Erro ao obter cache. Prosseguindo sem verificacao de ataque de leitura. errMsg: java.lang.IllegalArgumentException: No interface address matching '/25.129.4.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
14:35:36.434 WARN  CorrelationID[] [or.in.HOTROD]-[29](HotRod-client-async-pool-2-2) ISPN004005: Error received from the server: java.lang.IllegalArgumentException: No interface address matching '/25.129.4.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
14:35:36.434 ERROR CorrelationID[c6bc5d73-d6c7-4eed-9cdd-e7320609c6e6] [br.go.ca.si.ba.ca.ControleBaldeCache]-[18](executor-thread-1) [CONTROLE_BALDE_CACHE] Erro ao obter cache. Prosseguindo sem verificacao de ataque de leitura. errMsg: java.lang.IllegalArgumentException: No interface address matching '/25.129.4.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
14:35:36.443 INFO  CorrelationID[c6bc5d73-d6c7-4eed-9cdd-e7320609c6e6] [br.go.ca.si.ba.se.IniciarConsultaServiceImpl]-[18](executor-thread-1) [DICT-BALDE-CHAVES] [iniciarConsulta] - Balde usuario movimentado. identificador=030*****201, tipo=PF, grupo=1, saldoAnterior=24, saldoAtual=23, tempoMs=8
14:35:38.416 WARN  CorrelationID[] [or.in.HOTROD]-[29](HotRod-client-async-pool-2-2) ISPN004005: Error received from the server: java.lang.IllegalArgumentException: No interface address matching '/25.129.4.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
14:35:38.417 ERROR CorrelationID[a4870998-ff1c-4e4f-8a27-2d20ddcab9e8] [br.go.ca.si.ba.ca.ControleBaldeCache]-[18](executor-thread-1) [CONTROLE_BALDE_CACHE] Erro ao obter cache. Prosseguindo sem verificacao de ataque de leitura. errMsg: java.lang.IllegalArgumentException: No interface address matching '/25.129.4.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
14:35:38.418 WARN  CorrelationID[] [or.in.HOTROD]-[29](HotRod-client-async-pool-2-2) ISPN004005: Error received from the server: java.lang.IllegalArgumentException: No interface address matching '/25.129.4.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
14:35:38.418 ERROR CorrelationID[a4870998-ff1c-4e4f-8a27-2d20ddcab9e8] [br.go.ca.si.ba.ca.ControleBaldeCache]-[18](executor-thread-1) [CONTROLE_BALDE_CACHE] Erro ao obter cache. Prosseguindo sem verificacao de ataque de leitura. errMsg: java.lang.IllegalArgumentException: No interface address matching '/25.129.4.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
14:35:38.429 INFO  CorrelationID[a4870998-ff1c-4e4f-8a27-2d20ddcab9e8] [br.go.ca.si.ba.se.IniciarConsultaServiceImpl]-[18](executor-thread-1) [DICT-BALDE-CHAVES] [iniciarConsulta] - Balde usuario movimentado. identificador=030*****201, tipo=PF, grupo=1, saldoAnterior=23, saldoAtual=22, tempoMs=10
14:35:39.362 WARN  CorrelationID[] [or.in.HOTROD]-[29](HotRod-client-async-pool-2-2) ISPN004005: Error received from the server: java.lang.IllegalArgumentException: No interface address matching '/25.129.4.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
14:35:39.362 ERROR CorrelationID[55ffb482-b6e5-4d29-9e75-44ed89650b08] [br.go.ca.si.ba.ca.ControleBaldeCache]-[18](executor-thread-1) [CONTROLE_BALDE_CACHE] Erro ao obter cache. Prosseguindo sem verificacao de ataque de leitura. errMsg: java.lang.IllegalArgumentException: No interface address matching '/25.129.4.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
14:35:39.364 WARN  CorrelationID[] [or.in.HOTROD]-[29](HotRod-client-async-pool-2-2) ISPN004005: Error received from the server: java.lang.IllegalArgumentException: No interface address matching '/25.129.4.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
14:35:39.364 ERROR CorrelationID[55ffb482-b6e5-4d29-9e75-44ed89650b08] [br.go.ca.si.ba.ca.ControleBaldeCache]-[18](executor-thread-1) [CONTROLE_BALDE_CACHE] Erro ao obter cache. Prosseguindo sem verificacao de ataque de leitura. errMsg: java.lang.IllegalArgumentException: No interface address matching '/25.129.4.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
14:35:39.374 INFO  CorrelationID[55ffb482-b6e5-4d29-9e75-44ed89650b08] [br.go.ca.si.ba.se.IniciarConsultaServiceImpl]-[18](executor-thread-1) [DICT-BALDE-CHAVES] [iniciarConsulta] - Balde usuario movimentado. identificador=030*****201, tipo=PF, grupo=1, saldoAnterior=22, saldoAtual=21, tempoMs=9
12:37:39.668 WARN  CorrelationID[] [or.in.HOTROD]-[35](HotRod-client-async-pool-2-3) ISPN004005: Error received from the server: java.lang.IllegalArgumentException: No interface address matching '/25.130.14.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
12:37:39.668 ERROR CorrelationID[45930554-2941-4620-81e5-b226d2c6cd77] [br.go.ca.si.ba.ca.ControleBaldeCache]-[18](executor-thread-1) [CONTROLE_BALDE_CACHE] Erro ao obter cache. Prosseguindo sem verificacao de ataque de leitura. errMsg: java.lang.IllegalArgumentException: No interface address matching '/25.130.14.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
12:37:39.670 WARN  CorrelationID[] [or.in.HOTROD]-[35](HotRod-client-async-pool-2-3) ISPN004005: Error received from the server: java.lang.IllegalArgumentException: No interface address matching '/25.130.14.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
12:37:39.670 ERROR CorrelationID[45930554-2941-4620-81e5-b226d2c6cd77] [br.go.ca.si.ba.ca.ControleBaldeCache]-[18](executor-thread-1) [CONTROLE_BALDE_CACHE] Erro ao obter cache. Prosseguindo sem verificacao de ataque de leitura. errMsg: java.lang.IllegalArgumentException: No interface address matching '/25.130.14.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
12:37:39.758 INFO  CorrelationID[45930554-2941-4620-81e5-b226d2c6cd77] [br.go.ca.si.ba.se.IniciarConsultaServiceImpl]-[18](executor-thread-1) [DICT-BALDE-CHAVES] [iniciarConsulta] - Balde usuario movimentado. identificador=030*****201, tipo=PF, grupo=1, saldoAnterior=100, saldoAtual=99, tempoMs=88
12:37:57.776 WARN  CorrelationID[] [or.in.HOTROD]-[35](HotRod-client-async-pool-2-3) ISPN004005: Error received from the server: java.lang.IllegalArgumentException: No interface address matching '/25.130.14.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
12:37:57.776 ERROR CorrelationID[4a4acc21-a0d6-43e0-9f0c-2c04e8405a9a] [br.go.ca.si.ba.ca.ControleBaldeCache]-[18](executor-thread-1) [CONTROLE_BALDE_CACHE] Erro ao obter cache. Prosseguindo sem verificacao de ataque de leitura. errMsg: java.lang.IllegalArgumentException: No interface address matching '/25.130.14.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
12:37:57.777 WARN  CorrelationID[] [or.in.HOTROD]-[35](HotRod-client-async-pool-2-3) ISPN004005: Error received from the server: java.lang.IllegalArgumentException: No interface address matching '/25.130.14.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
12:37:57.778 ERROR CorrelationID[4a4acc21-a0d6-43e0-9f0c-2c04e8405a9a] [br.go.ca.si.ba.ca.ControleBaldeCache]-[18](executor-thread-1) [CONTROLE_BALDE_CACHE] Erro ao obter cache. Prosseguindo sem verificacao de ataque de leitura. errMsg: java.lang.IllegalArgumentException: No interface address matching '/25.130.14.33' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}
12:37:57.796 INFO  CorrelationID[4a4acc21-a0d6-43e0-9f0c-2c04e8405a9a] [br.go.ca.si.ba.se.IniciarConsultaServiceImpl]-[18](executor-thread-1) [DICT-BALDE-CHAVES] [iniciarConsulta] - Balde usuario movimentado. identificador=030*****201, tipo=PF, grupo=1, saldoAnterior=99, saldoAtual=98, tempoMs=18






Using project "sispl-tqs".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get project sispi-des
NAME        DISPLAY NAME   STATUS
sispi-des                  Active
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods
NAME                                          READY     STATUS      RESTARTS   AGE
sispl-api-apostas-tqs-15-9qtl2                2/2       Running     0          4d23h
sispl-api-mkp-tqs-76-deploy                   0/1       Completed   0          37d
sispl-api-mkp-tqs-77-9b65x                    1/1       Running     0          35d
sispl-api-mkp-tqs-77-deploy                   0/1       Completed   0          35d
sispl-canal-webhook-pix-tqs-12-27rd6          2/2       Running     0          4d3h
sispl-captacao-atendimento-tqs-5-777pj        2/2       Running     0          44d
sispl-consulta-apostas-api-tqs-66-k4svq       1/1       Running     0          44d
sispl-consulta-transacao-ocp4-tqs-17-5zln6    2/2       Running     0          44d
sispl-integracao-fiserv-ocp-tqs-1-9wj8s       2/2       Running     0          44d
sispl-parametros-tqs-31-5jvfq                 2/2       Running     0          5d2h
sispl-parametros-tqs-31-9ttkd                 2/2       Running     0          5d2h
sispl-parametros-tqs-31-deploy                0/1       Completed   0          31d
sispl-parametros-tqs-31-h8jpz                 2/2       Running     0          3d21h
sispl-parametros-tqs-31-lxw97                 2/2       Running     0          5d2h
sispl-parametros-tqs-31-vt8kp                 2/2       Running     0          5d2h
sispl-processamento-sumarizacao-tqs-7-8wv2n   2/2       Running     0          44d
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$


