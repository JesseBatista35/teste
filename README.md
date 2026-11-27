
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]# grep -A2 'SCMUTR01' <arquivo_config> | grep '<password>' | head -1 \
bash: erro de sintaxe próximo do `token' não esperado `|'
[root@caddeapllx2540 /]#   | sed -E 's#.*<password>(.*)</password>.*#\1#' | md5sum
bash: erro de sintaxe próximo do `token' não esperado `|'
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]# /opt/jboss-eap/bin/jboss-cli.sh -c --command="/subsystem=datasources/data-source=db2cmu:test-connection-in-pool"
{
    "outcome" => "failed",
    "failure-description" => "WFLYJCA0040: falha ao invocar a operação: WFLYJCA0047: A conexão não é válida",
    "rolled-back" => true
}
[root@caddeapllx2540 /]# /opt/jboss-eap/bin/jboss-cli.sh -c --command="/subsystem=datasources/data-source=db2cdm:test-connection-in-pool"
{
    "outcome" => "failed",
    "failure-description" => "WFLYJCA0040: falha ao invocar a operação: WFLYJCA0047: A conexão não é válida",
    "rolled-back" => true
}
[root@caddeapllx2540 /]#
