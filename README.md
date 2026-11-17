Próxima coleta

No CLI:

/host=srjtqapllx0056/server=srjtqapllx0056_sigaf_intra_8083/subsystem=datasources/data-source=idmsapf:read-resource
/host=srjtqapllx0056/server=srjtqapllx0056_sigaf_intra_8083/subsystem=datasources/data-source=idmsapf/statistics=pool:read-resource(include-runtime=true)
/host=srjtqapllx0056/server=srjtqapllx0056_sigaf_intra_8083/subsystem=datasources/data-source=db2gaf:read-resource
/server-group=sigaf:read-resource
/server-group=sigaf/jvm=*:read-resource

No shell (root), para ver se a VM aguenta as 10 instâncias:

bash
nproc; free -m
ps -ef | grep -o '\-D\[Server:[^]]*\] -Xms[0-9a-zA-Z]* -Xmx[0-9a-zA-Z]*'
cat /infra_app/config/sigaf/sigaf_jconnector.properties

Também falta descobrir qual Apache faz o proxy do SIGAF em TQS (é ele que devolve o 502) e o ProxyTimeout do vhost.

No idmsapf, os campos que importam são max-pool-size, blocking-timeout-wait-millis, statistics-enabled e a URL/driver, para confirmar que é IDMS. Se statistics-enabled vier false, as estatísticas do pool vão aparecer zeradas. Ligar esse atributo é uma alteração de configuração, mesmo sendo TQS, então é melhor combinar com o time antes.
