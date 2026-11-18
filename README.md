
    580 15:01
    870 15:03
    580 15:04
[p585600@srjtqapllx0056 ~]$ grep -E "WFLYSRV0010|WFLYSRV0013|WFLYSRV0016" /infra_app/logs/sigaf/server-srjtqapllx0056_sigaf_intra_8083.log | tail -5; head -1 /infra_app/logs/sigaf/srjtqapllx0056_sigaf_intra_8083.log | cut -c1-120
2026-11-17 03:06:11,423 INFO  [org.jboss.as.server] (Controller Boot Thread), WFLYSRV0010: Deployed "sigaf-ear.ear" (runtime-name : "sigaf-ear.ear")
2026-11-17 03:06:11,424 INFO  [org.jboss.as.server] (Controller Boot Thread), WFLYSRV0010: Deployed "DBConnect.ear" (runtime-name : "DBConnect.ear")
13:07:46,704 ERROR [br.gov.caixa.sigaf.util.Utils] (default task-9), Erro na leitura das propriedades de configuração do
[p585600@srjtqapllx0056 ~]$
[p585600@srjtqapllx0056 ~]$
[p585600@srjtqapllx0056 ~]$
