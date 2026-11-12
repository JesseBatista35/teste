Bom dia, Inocêncio! O redeploy da sifec-cdt-3.24.3.004 foi concluído no JBoss 7.4 (sifec-intranet) às 10:31. A versão 3.24.3.003 foi substituída e os contextos /sifec-cdt-web e /sicdt-orig-api-rest estão publicados.

Pode fazer a validação final, inclusive o download de relatórios (PDF e CSV)? Estando tudo ok, registramos a 3.24.3.004 como a versão estável do SICDT na migração. Obrigado pelo apoio!


Mensagem para o Michael (SIRUR)

Bom dia, Michael! Obrigado pelo ajuste. Para validar a 3.55.51.01 precisamos fazer o deploy no JBoss 7.4, já que o erro só aparece no startup do servidor. Pode nos enviar o link do pacote no Nexus (binario.caixa)? Assim que recebermos, fazemos o deploy e retornamos com o resultado do log.

Do nosso lado, estamos ajustando a credencial do banco do SIRUR no 7.4, que também impedia a subida. Ela estará pronta para o deploy da nova versão.


1. No 6.4 (10.116.88.20): gerar o comando com a senha
sudo sed -n '19311,19340p' /opt/jboss/jboss-eap/dc/configuration/domain.xml | sed -n 's#.*<password>\(.*\)</password>.*#/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/OracleSirurDS":write-attribute(name=password,value="\1")#p'

O resultado é uma linha começando com /profile=.... Copie essa linha.

Se não sair nada: me avise, porque a senha pode estar em outro formato.
2. Na 471 (10.116.97.59): aplicar a senha

Entre no CLI:

/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=localhost:9999

Com o prompt em [domain@localhost:9999 /], cole a linha gerada no passo 1.

3. Na 471: avisar a sala e reiniciar

Aviso na sala:

Pessoal, vou fazer um restart rápido do sifec-intranet em 5 minutos para aplicar a credencial do banco do SIRUR no JBoss 7.4. São alguns minutos de indisponibilidade.

Depois dos 5 minutos, no CLI:

/server-group=sifec-intranet:restart-servers(blocking=true)
4. Na 471: testar o banco
/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473/subsystem=datasources/data-source="jdbc/OracleSirurDS":test-connection-in-pool
"result" => [true]: o banco do SIRUR está corrigido. Daí é só esperar o link da 3.55.51.01 do Michael para fazer o deploy.
Falhou de novo: na 473, rode o comando abaixo e me mande a saída:
  sudo grep -n "ORA-" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -3






-sh-4.1$
-sh-4.1$
-sh-4.1$ sudo sed -n '19311,19340p' /opt/jboss/jboss-eap/dc/configuration/domain.xml | sed -n 's#.*<password>\(.*\)</password>.*#/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/OracleSirurDS":write-attribute(name=password,value="\1")#p'
[sudo] password for p585600:
/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/OracleSirurDS":write-attribute(name=password,value="usururng")
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$
