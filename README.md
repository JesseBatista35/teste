
}
[domain@10.116.89.0:9999 /] undeploy SIMCN
Undeploy failed: {"WFLYCTL0062: Composite operation failed and was rolled back. Steps that failed:" => {"Operation step-1" => "WFLYDC0043: Cannot remove deployment SIMCN from the domain as it is still used by server groups [simcn]"}}
[domain@10.116.89.0:9999 /] undeploy SIMCN --server-groups=<nome_do_group>
Undeploy failed: {"WFLYCTL0062: Composite operation failed and was rolled back. Steps that failed:" => {"Operation step-1" => "WFLYCTL0216: Management resource '[(\"server-group\" => \"<nome_do_group>\")]' not found"}}
[domain@10.116.89.0:9999 /] undeploy SIMCN --server-groups=simcn
Undeploy failed: java.lang.InterruptedException
[domain@10.116.89.0:9999 /] :read-children-names(child-type=deployment)
{
    "outcome" => "success",
    "result" => [
        "AUTORH",
        "ClienteSIECM_EAR.ear",
        "RoteadorSISGD.ear",
        "Roteador_SISGD.ear",
        "SIAEF",
        "SIAOI",
        "SIAOI-API",
        "SICRS",
        "SIECM",
        "SIEMP",
        "SIFEC-RURAL",
        "SIGEC-PORTABILIDADE-BATCH",
        "SIGEC-PORTABILIDADE2",
        "SIGIP",
        "SIMCN",
        "SINAD",
        "SINAFWEB",
        "SIOSP",
        "SIPLD",
        "SIRIC",
        "SIRIC-ADM",
        "SIRIC-API",
        "SIRIC2",
        "SIRIC2-ADM",
        "SIRIC2-API",
        "SISGD",
        "SISOU",
        "SISOU-INTERNET",
        "SISRH",
        "SQLSERVER-sqljdbc4.jar",
        "activemq-ra",
        "db2jcc4.jar",
        "framework-2.0.1.jar",
        "framework_sisgd-1.0.0.jar",
        "jconn4-16.jar",
        "jconn4.jar",
        "mssql-jdbc-9.4.1.jre8.jar",
        "ojdbc14.jar",
        "ojdbc6.jar",
        "ojdbc8.jar",
        "postgresql-42.0.0.jar",
        "postgresql-9.1-901.jdbc4.jar",
        "wmq.jmsra-7.0.1.12-transaction.rar",
        "wmq.jmsra-7.5.0.8.rar",
        "wmq.jmsra.rar"
    ]
}
[domain@10.116.89.0:9999 /]
