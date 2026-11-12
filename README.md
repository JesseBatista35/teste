1. No 6.4: gerar o comando da senha
sudo sed -n '19311,19340p' /opt/jboss/jboss-eap/dc/configuration/domain.xml | sed -n 's#.*<password>\(.*\)</password>.*#/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/OracleSirurDS":write-attribute(name=password,value="\1")#p'

O resultado é uma linha começando com /profile=...write-attribute(name=password,...). Cole essa linha no CLI da 471.

Se o valor vier como ${VAULT::...}, pode usar mesmo assim, porque a 473 já tem o cofre do SIRUR configurado. Se não sair nenhuma linha, a senha está num security-domain. Nesse caso, me avise.

2. Na 471: restart e teste (avise a sala antes)
/server-group=sifec-intranet:restart-servers(blocking=true)
/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473/subsystem=datasources/data-source="jdbc/OracleSirurDS":test-connection-in-pool

O esperado é [true]. Se o SICDT 3.24.3.004 já estiver baixado, faça o deploy dele antes do restart, para aproveitar a mesma janela.

Mensagem para o Inocêncio

Bom dia, Inocêncio! Obrigado pelo novo build e pelos testes. Vou fazer o redeploy da sifec-cdt-3.24.3.004 no JBoss 7.4 (sifec-intranet) hoje e acompanhar o log, inclusive para confirmar que o warning de ConectorException não aparece mais. Assim que estiver no ar te aviso para a validação final. Se estiver tudo ok, registramos a 3.24.3.004 como a versão estável do SICDT na migração.

Sobre o SIFEC, a versão em uso no 7.4 continua sendo a sifec-2.160.4.0.

Mensagem para o Michael (SIRUR)

Bom dia, Michael! Obrigado pelo ajuste. Para validar a 3.55.51.01 precisamos fazer o deploy no JBoss 7.4, já que o erro só aparece no startup do servidor. Pode nos enviar o link do pacote no Nexus (binario.caixa)? Assim que recebermos, fazemos o deploy e retornamos com o resultado do log.

Do nosso lado, estamos ajustando a credencial do banco do SIRUR no 7.4, que também impedia a subida. Ela estará pronta para o deploy da nova versão.
