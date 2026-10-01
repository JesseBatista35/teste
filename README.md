Ver o nome do deployment atual:
/opt/jboss/bin/jboss-cli.sh --connect --command="deployment-info"
Fazer o deploy:
Se o nome listado for o mesmo do arquivo novo (aplicacao.ear), o comando do exemplo funciona:
     /opt/jboss/bin/jboss-cli.sh --connect --command="deploy /tmp/aplicacao.ear --force"
Se o nome listado for diferente (ex.: aplicacao-1.0.ear), use --name para substituir em vez de criar um segundo deployment:
     /opt/jboss/bin/jboss-cli.sh --connect --command="deploy /tmp/aplicacao.ear --name=aplicacao-1.0.ear --force"
Conferir o resultado:
/opt/jboss/bin/jboss-cli.sh --connect --command="deployment-info"
