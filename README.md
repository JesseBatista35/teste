oc set env dc/sismn-gecci-tqs --list -n sismn-tqs

Se vier vazio ou quase vazio, não faça oc rollout latest nem um redeploy manual agora. O pod novo subiria sem datasource.

Caminho para resolver

Corrija o grupo SISMN-GECCI-TQS:
QUARKUS_DATASOURCE_JDBC_URL = jdbc:sybase:Tds:bbrdedadux001.corecaixa:20113?ServiceName=SMNDB001
QUARKUS_DATASOURCE_USERNAME = usuário de serviço de TQS para o SMNDB001 (com o DBA ou o dev), no lugar do f710695
SYSBASEDB01_DBPASS = senha desse usuário de serviço
inclua APL_AUTH_SERVICO_URL e APL_LOG_OPERACAO_NU_SITE, como estão no DES
Reexecute o stage TQS. A task de variáveis vai repopular o DC e a secret, e a release faz o rollout.

Se o DBA demorar para informar o usuário de serviço, uma opção provisória é manter f710695 com a senha atualizada, só para destravar. O certo, porém, é não ficar com matrícula pessoal no TQS.
