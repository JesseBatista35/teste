Todos  PC
 
Erros de Conexão com Banco de Dados em Desenvolvimento
 
Para alinharmos o tratamento dos chamados relacionados a erro de conexão com banco de dados em ambiente de desenvolvimento, Pós migração , segue a orientação atualizada após a migração realizada neste final de semana.
 
O que aconteceu?
Foi realizada a migração do banco de dados Oracle do ambiente de desenvolvimento. 
Como consequência, algumas aplicações estão apontando para a URL de conexão antiga, gerando erros de comunicação ou conexão com o banco. 
 
Como proceder ao receber uma WO com erro de conexão de banco de dados?
Verificar a URL de conexão configurada na aplicação. 
Confirmar se a aplicação está utilizando a URL antiga. jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/orad01ng 
Caso esteja, substituir pela URL nova  jdbc:oracle:thin:@oracle-nprd-1000.caixa:1521/prim_D01NGSRV de conexão do ambiente de desenvolvimento.
Após a alteração, fechar a WO solicitando que a equipe gere uma nova release.
Atenção
Nem todo erro de conexão está necessariamente relacionado à migração do banco.
Não encerrar os atendimentos apenas informando a existência da CRQ de migração, sem antes verificar o apontamento da aplicação. 
Caso a URL já esteja correta e o erro persista, seguir a análise normal da aplicação e, se necessário, acionar a equipe responsável pelo sistema. 
Resumo
Erro de conexão → Verificar URL → Se estiver na URL antiga, atualizar para a nova → Encerrar a WO solicitando que seja gerado uma nova release
 
Vamos seguir esse procedimento para garantir uniformidade nos atendimentos e evitar encaminhamentos incorret
