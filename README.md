Deploy via jboss-cli — JBoss EAP Standalone
1 de out. de 2026 · @Jessé Batista
Pré-requisitos
O deploy é feito com o jboss-cli.sh em modo não interativo (--connect + --command), sem precisar abrir a console antes.
• Acesso SSH ao servidor (ou a uma máquina com o jboss-cli.sh que alcance a management do JBoss).
• O arquivo .ear/.war copiado para a máquina onde o CLI roda (ex.: /tmp/aplicacao.ear). O CLI faz o upload do arquivo para o servidor.
• Management do JBoss acessível. Padrão: localhost:9990. Se for outra porta ou host, use --controller=<host>:<porta>.
• Se a management exigir autenticação: --user=<usuario> --password=<senha>.
Passo a passo
1. Verificar o nome do deployment atual
   /opt/jboss/bin/jboss-cli.sh --connect --command="deployment-info"
   Anote o nome que aparece na coluna NAME (ex.: aplicacao.ear ou aplicacao-1.0.ear).
2. Fazer o deploy
   Se o nome atual for igual ao do arquivo novo (ou se for o primeiro deploy):
   /opt/jboss/bin/jboss-cli.sh --connect --command="deploy /tmp/aplicacao.ear --force"
   Se o nome atual for diferente do arquivo novo, informe o nome atual com --name para substituir em vez de criar um segundo deployment:
   /opt/jboss/bin/jboss-cli.sh --connect --command="deploy /tmp/aplicacao.ear --name=aplicacao-1.0.ear --force"
3. Conferir o resultado
   /opt/jboss/bin/jboss-cli.sh --connect --command="deployment-info"
   O STATUS deve estar OK. Em seguida, verifique o log:
   tail -f <JBOSS_HOME>/standalone/log/server.log
   Procure por Deployed "aplicacao.ear" e confira se não há exceções.
Alternativa: modo interativo
Dá o mesmo resultado, comando a comando:
/opt/jboss/bin/jboss-cli.sh --connect
O prompt fica [standalone@localhost:9990 /]. Então:
deployment-info
deploy /tmp/aplicacao.ear --force
deployment-info
exit
Se abrir sem --connect, o prompt fica [disconnected /]; digite connect (ou connect <host>:<porta>) antes dos comandos.
Problemas comuns
Sintoma
Causa provável
O que fazer
Dois deployments da mesma aplicação / conflito de context-root
--force com nome diferente do deployment existente
Usar --name=<nome-atual> ou fazer undeploy <nome-antigo> antes
Failed to connect to the controller
Management em outra porta/host ou JBoss parado
Conferir porta no standalone.xml e usar --controller=<host>:<porta>
Path ... doesn't exist
Arquivo não está na máquina onde o CLI roda
Copiar o .ear para o caminho informado
Deploy com STATUS FAILED
Erro na aplicação (dependência, datasource, etc.)
Ver a exceção no server.log
Para remover uma aplicação: jboss-cli.sh --connect --command="undeploy aplicacao.ear".
