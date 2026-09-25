/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9990


# 1) Confirmar o nome exato do server-group e do host
:read-children-names(child-type=server-group)
:read-children-names(child-type=host)

# 2) Restart só do batch (não mexe no sipon nem no portabilidade2)
/server-group=sigec-portabilidade-batch:restart-servers(blocking=true)


/host=<NOME_DO_HOST>/server-config=sigec-portabilidade-batch_node1_lx104:restart(blocking=true)

/host=<NOME_DO_HOST>/server-config=sigec-portabilidade-batch_node1_lx104:read-attribute(name=status)


LOG=/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade-batch_node1_lx104/server.log
grep -E "WFLYSRV0025|WFLYSRV0026" $LOG | tail -2        # "iniciado em Xms" = subiu
tail -f $LOG | grep -E "processar\(\) - INICIO|Gerando XML|WFLYEJB0241"

systemctl restart jboss-eap7_hc
