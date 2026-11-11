1. No 6.4: gerar o comando da senha
sudo sed -n '19236,19252p' /opt/jboss/jboss-eap/dc/configuration/domain.xml | sed -n 's#.*<password>\(.*\)</password>.*#/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/SybaseSibanDS":write-attribute(name=password,value="\1")#p'

O resultado é uma linha começando com /profile=...write-attribute(name=password,...). Não cole essa linha na sala nem aqui. Ela vai direto para o CLI da 471.

Se o valor dentro de value="..." começar com ${VAULT::, não rode. Me avise, porque o cofre do 7.4 pode não ter essa entrada.

2. Na 471 (CLI): aplicar os três ajustes
/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/SybaseSibanDS":write-attribute(name=connection-url,value="jdbc:sybase:Tds:10.116.92.132:4101/EMDB04?SERVER_INITIATED_TRANSACTIONS=false")
/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/SybaseSibanDS":write-attribute(name=user-name,value="sccd")

Depois, cole a linha gerada no passo 1, a da senha.

3. Restart e teste (combine o horário na sala antes)
/server-group=sifec-intranet:restart-servers(blocking=true)
/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473/subsystem=datasources/data-source="jdbc/SybaseSibanDS":test-connection-in-pool

Se o teste voltar "result" => [true], o datasource do MCM está corrigido.
