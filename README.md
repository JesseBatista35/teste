Pessoal, boa noite!

Em análise conjunta com o Rainier, verificamos que a falha na atualização em massa de contratos do SIGAF em TQS não é causada por falta de recurso do JBoss:

Memória: a VM (srjtqapllx0056) tem cerca de 21 GB livres, e o heap de 1 GB do SIGAF não está pressionado.
Pool de conexões com o IDMS (idmsapf): usou no máximo 11 das 20 conexões, sem nenhuma espera por conexão.
Esteira/deploy: a versão em TQS é a 2.24.0.9, publicada em 05/11. A execução de 11/11 republicou o mesmo pacote (mesmo build, commit e hash), e a esteira não altera configuração do JBoss.

A “indisponibilidade temporária da APFAP327” vem da conexão com o IDMS (mainframe):

Em 17/11, entre 14:39 e 14:44, começaram falhas intermitentes nas consultas.
Entre 14:47 e 15:04, houve falha total: mais de 12 mil consultas rejeitadas.
Erros registrados: EOFException (conexão fechada pelo lado do IDMS), IJ031084 Unable to create connection (IDMS não aceitando conexões novas) e Connection reset.

Próximos passos:

Vamos acionar o time de IDMS/mainframe para verificar o que ocorreu do lado deles nessa janela (usuário SGAFTR01, idms.caixa:3740, DICTSSG).
Do lado de vocês, precisamos de três verificações:
O que mudou da 2.24.0.7 para a 2.24.0.9 na rotina de atualização de inadimplência / chamada da APFAP327?
O log da aplicação está em DEBUG (cerca de 2 GB em menos de 3 horas). Isso pesa no processamento em massa. Dá para voltar para INFO em TQS?
Há um ERROR de configuração no log: sgr_usuario.properties não encontrado. Esse arquivo é esperado?
Para fecharmos o cenário do 502 Proxy Error, nos passem a URL usada no teste e a quantidade média de contratos por execução. Com processamento sequencial, o tempo total tende a passar do timeout do proxy, independentemente do recurso.

Assim que tivermos retorno do mainframe, alinhamos a próxima ação. Obrigado!
