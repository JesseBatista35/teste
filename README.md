Deploy via jboss-cli — JBoss EAP Domain
1 de out. de 2026 · @Jessé Batista
Pré-requisitos
No modo domain, o CLI conecta sempre no Domain Controller (master), não no host onde a instância roda. O deploy sobe o arquivo para o repositório do domínio e depois o atribui a um ou mais server-groups.
• Host e porta de management do Domain Controller (padrão 9990).
• Nome do server-group de destino. Para listar: jboss-cli.sh --connect --controller=<host-DC>:9990 --command=":read-children-names(child-type=server-group)".
• O arquivo .ear/.war na máquina onde o CLI roda (ex.: /tmp/aplicacao.ear).
• Se a management exigir autenticação: --user=<usuario> --password=<senha>.
Passo a passo
1. Verificar o deployment atual e em quais grupos está
   /opt/jboss/bin/jboss-cli.sh --connect --controller=<host-DC>:9990 --command="deployment-info --server-group=<grupo>"
   Anote o nome do deployment (ex.: aplicacao.ear ou aplicacao-1.0.ear).
2. Fazer o deploy
   Primeiro deploy (a aplicação ainda não existe no domínio): informe o server-group.
   /opt/jboss/bin/jboss-cli.sh --connect --controller=<host-DC>:9990 --command="deploy /tmp/aplicacao.ear --server-groups=<grupo>"
   Para mais de um grupo, separe por vírgula; para todos, use --all-server-groups.
   Atualização (redeploy): use --force sem --server-groups. Ele troca o conteúdo e redeploya em todos os grupos onde a aplicação já estava.
   /opt/jboss/bin/jboss-cli.sh --connect --controller=<host-DC>:9990 --command="deploy /tmp/aplicacao.ear --force"
   Se o nome do deployment atual for diferente do arquivo novo, acrescente --name=<nome-atual>.
3. Conferir o resultado
   /opt/jboss/bin/jboss-cli.sh --connect --controller=<host-DC>:9990 --command="deployment-info --name=aplicacao.ear"
   Mostra o status em cada server-group. O log fica por instância, no host onde ela roda:
   tail -f <JBOSS_HOME>/domain/servers/<nome-da-instancia>/log/server.log
Alternativa: modo interativo
/opt/jboss/bin/jboss-cli.sh --connect --controller=<host-DC>:9990
O prompt fica [domain@<host-DC>:9990 /]. Então:
deployment-info --server-group=<grupo>
deploy /tmp/aplicacao.ear --force
deployment-info --name=aplicacao.ear
exit
No primeiro deploy, troque --force por --server-groups=<grupo>.
Undeploy
• Remover de todos os grupos e do repositório:
  jboss-cli.sh --connect --controller=<host-DC>:9990 --command="undeploy aplicacao.ear --all-relevant-server-groups"
• Remover só de um grupo, mantendo o arquivo no repositório:
  jboss-cli.sh --connect --controller=<host-DC>:9990 --command="undeploy aplicacao.ear --server-groups=<grupo> --keep-content"
Problemas comuns
