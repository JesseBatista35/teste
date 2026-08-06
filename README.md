[root@sbrdeapllx114 tmp]# ss -tlnp | grep 999
LISTEN     0      50     10.116.94.221:9999                     *:*                   users:(("java",pid=27411,fd=91))
[root@sbrdeapllx114 tmp]# grep -A5 "management-interfaces" /opt/jboss/jboss-eap/hc/configuration/host-slave.xml
        <management-interfaces>
            <native-interface security-realm="ManagementRealm">
                <socket interface="management" port="${jboss.management.native.port:9999}"/>
            </native-interface>
        </management-interfaces>
    </management>
    <domain-controller>
        <remote security-realm="ManagementRealm" username="admin">
            <discovery-options>
                <static-discovery name="primary" protocol="${jboss.domain.master.protocol:remote}" host="${jboss.domain.master.address}" port="${jboss.domain.master.port:9999}"/>
[root@sbrdeapllx114 tmp]# /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.94.221:9999
[domain@10.116.94.221:9999 /] /host=*:read-children-names(child-type=host)
{
    "outcome" => "failed",
    "failure-description" => "WFLYCTL0158: Falha no manuseador da operação: java.lang.NullPointerException",
    "rolled-back" => true
}
[domain@10.116.94.221:9999 /] /host=NOME_DO_HOST/server-config=sinad_node1_lx114:reload
{
    "outcome" => "failed",
    "failure-description" => "WFLYCTL0030: Nenhuma definição do recurso está registrada para o endereço [
    (\"host\" => \"NOME_DO_HOST\"),
    (\"server-config\" => \"sinad_node1_lx114\")
]",
    "rolled-back" => true
}
[domain@10.116.94.221:9999 /] /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.94.221:9999 \
>   --command="/host=NOME_DO_HOST/server-config=sinad_node1_lx114:reload"
Node path format is wrong around 'opt' (index=1).
[domain@10.116.94.221:9999 /]
