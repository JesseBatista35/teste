1. No 6.4: configuração completa do SybaseSibanDS (sem a senha)
sudo sed -n '19236,19252p' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -v -i password
2. Na 471: a mesma coisa no 7.4

Entre no CLI (o comando anterior falhou porque você já tinha saído com exit e ele rodou no bash):

/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=localhost:9999
/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/SybaseSibanDS":read-resource

Quando me mandar a saída, apague a linha do password.

3. Na 473: o erro detalhado do Sybase depois do restart
sudo awk 'NR>=38021' /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -iE -A4 'SibanDS|JZ0|sybase|WFLYJCA' | head -40

Com essas três saídas eu vejo se a diferença está no SQL de validação, no driver ou no usuário, e te passo o ajuste exato.
