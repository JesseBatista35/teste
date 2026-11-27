grep -A2 'SCMUTR01' <arquivo_config> | grep '<password>' | head -1 \
  | sed -E 's#.*<password>(.*)</password>.*#\1#' | md5sum
Hashes diferentes: o valor da Library de TQS está desatualizado. Pegue a senha vigente com quem a administra, atualize a Library e rode a release.
Hashes iguais, ou não há servidor antigo para comparar: o problema está no RACF.
Encaminhamento ao time de banco/RACF

Peça para verificar o usuário SCMUTR01 no subsistema RJKDB2DSDH (10.216.80.111:446):

se o usuário existe nesse subsistema;
se a senha está expirada;
se está revogado. Se estiver, peça resume e reset, e coloque a nova senha na Library de TQS.

Antes do reset, vale parar o JBoss do caddeapllx2540. Assim o PoolFiller não revoga o usuário de novo enquanto a Library não estiver atualizada.

Quando voltarem com a senha nova ou o desbloqueio, rode a release de TQS e valide com:

bash
/opt/jboss-eap/bin/jboss-cli.sh -c --command="/subsystem=datasources/data-source=db2cmu:test-connection-in-pool"
/opt/jboss-eap/bin/jboss-cli.sh -c --command="/subsystem=datasources/data-source=db2cdm:test-connection-in-pool"
