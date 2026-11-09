Elas não estão no env do DC nem num envFrom, mas o pod tem esses valores. Rode para ver a origem:

bash
oc get pod sismn-gecci-tqs-28-glhxs -n sismn-tqs -o yaml | grep -B2 -A6 QUARKUS_DATASOURCE
oc get dc sismn-gecci-tqs -n sismn-tqs -o jsonpath='{.spec.triggers}'; echo

Há duas possibilidades. Se o pod mostrar env/valueFrom e o DC não, o pod (rc 28) foi criado de um template antigo e o DC foi alterado depois sem novo rollout. Se o pod não mostrar nada, as variáveis estão embutidas na imagem (ENV no build). Também vale olhar a secret sismn-gecci-tqs (1 chave), que pode ser montada como arquivo:

bash
oc get secret sismn-gecci-tqs -n sismn-tqs -o jsonpath='{.data}' | sed 's/:.*//'; echo

Esse comando só lista o nome da chave, sem expor o valor.

Correção no grupo SISMN-GECCI-TQS

QUARKUS_DATASOURCE_JDBC_URL = jdbc:sybase:Tds:bbrdedadux001.corecaixa:20113?ServiceName=SMNDB001. É a URL que o pod já usa, sem ;, então a task passa.
QUARKUS_DATASOURCE_USERNAME = o usuário de serviço de TQS para o SMNDB001, equivalente ao SSMNBD04 do DES. Confirme com o DBA ou o dev qual é.
SYSBASEDB01_DBPASS = a senha desse usuário de serviço.
Inclua APL_AUTH_SERVICO_URL e APL_LOG_OPERACAO_NU_SITE, como estão no DES.

Com isso a release passa na task de variáveis e o pod novo sobe com uma credencial que não expira junto com a senha de alguém.
