1. Criar o datasource (CLI do 471). Troque SENHA_AQUI pela senha do banco (a que o Inocêncio passou), digitando direto no CLI:

/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/OracleSicdtDS":add(jndi-name="java:/jdbc/OracleSicdtDS", driver-name=oracle19, connection-url="jdbc:oracle:thin:@//oracle-nprd-1000.caixa:1521/prim_D01NGSRV", user-name=SCDTBD01, password="SENHA_AQUI", use-java-context=true, enabled=true, min-pool-size=10, max-pool-size=30, pool-prefill=true, check-valid-connection-sql="SELECT 1 FROM DUAL", background-validation=true, background-validation-millis=700000)

O esperado é "outcome" => "success".

2. Testar a conexão:

/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473/subsystem=datasources/data-source="jdbc/OracleSicdtDS":test-connection-in-pool

O esperado é "result" => [true]. Se falhar, me mande o erro antes de seguir.

3. Restart, para carregar as properties novas:

/server-group=sifec-intranet:restart-servers(blocking=true)
/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)

Espere ficar running.

4. Deploy pela console: Deployments → Upload Deployment → sifec-cdt-3.24.3.001.ear → Name: SIFEC-CDT → Runtime name: sifec-cdt-3.24.3.001.ear → server-group sifec-intranet → Enable.

5. Acompanhe no 473 enquanto sobe:

sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "WFLYSRV0010|WFLYCTL0013|ERROR|WELD-001408|sifec-cdt|sicdt"

O esperado é WFLYSRV0010: Deployed "sifec-cdt-3.24.3.001.ear". Se aparecer ERROR, me mande.

6. Avise o Inocêncio para validar pela https://migracaosifec.des.caixa/fec-web/, no menu do SICDT.
