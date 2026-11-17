No mesmo CLI, cole este bloco (só os dois últimos comandos precisam de ajuste, explicado logo abaixo):

ls /server-group
ls /profile
/host=srjtqapllx0056/server-config=srjtqapllx0056_sigaf_intra_8083:read-resource(recursive=true)

ls /host=srjtqapllx0056/server=srjtqapllx0056_sigaf_intra_8083/subsystem=datasources/data-source
ls /host=srjtqapllx0056/server=srjtqapllx0056_sigaf_intra_8083/subsystem=datasources/xa-data-source

/host=srjtqapllx0056/server=srjtqapllx0056_sigaf_intra_8083/subsystem=transactions:read-attribute(name=default-timeout)
/host=srjtqapllx0056/server=srjtqapllx0056_sigaf_intra_8083/subsystem=io/worker=default:read-resource(include-runtime=true)
/host=srjtqapllx0056/server=srjtqapllx0056_sigaf_intra_8083/subsystem=undertow/server=default-server/http-listener=default:read-resource
/host=srjtqapllx0056/server=srjtqapllx0056_sigaf_intra_8083/subsystem=ejb3:read-resource(recursive=true)

Depois, para cada datasource que o ls listar (principalmente o do DB2), troque NOME_DS pelo nome:

/host=srjtqapllx0056/server=srjtqapllx0056_sigaf_intra_8083/subsystem=datasources/data-source=NOME_DS:read-resource
/host=srjtqapllx0056/server=srjtqapllx0056_sigaf_intra_8083/subsystem=datasources/data-source=NOME_DS/statistics=pool:read-resource(include-runtime=true)

Esse bloco cobre:

server-config (recursive): o server-group da instância e se há JVM sobrescrita no nível do servidor.
datasources: min/max-pool-size e blocking-timeout-wait-millis. As estatísticas (ActiveCount, MaxUsedCount, WaitCount) mostram se o pool chega no teto. Só vêm preenchidas se o datasource tiver statistics-enabled=true.
transactions: se o default-timeout estiver em 300, ele bate com o 500 que aparece ao final do Cenário 2.
io worker / ejb3: os limites de thread da requisição HTTP e do pool de EJB, caso o loop rode num EJB.

Ainda falta o cat /infra_app/config/sigaf/sigaf_jconnector.properties (fora do CLI, como root). Se o APFAP327 for chamado por esse conector, é lá que estão os limites que importam.
