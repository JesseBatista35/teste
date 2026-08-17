Mensagem pra Livia (Teams):

Livia, resolvido! 🎉

Confirmamos a causa raiz: o código estava lendo a senha do banco através da variável de ambiente bruta do container (Environment.GetEnvironmentVariable), que ainda continha o placeholder não resolvido (${spgcdr01_sqlserver}, 21 caracteres) em vez do valor já processado pelo BeyondTrust via IConfiguration (12 caracteres, senha correta).

O vault e a configuração de pipeline estavam corretos o tempo todo — era um ajuste de código na forma de ler a variável.

Com a correção (usar IConfiguration em vez da env var direta), a aplicação conectou normalmente e já está executando queries no banco sem erro.

Qualquer coisa é só chamar!

Texto formal de fechamento do atendimento/WO:

Atendimento referente a erro 500 na aplicação SIPGC-api-seguranca em ambiente DES, ao acessar dados via integração com banco de dados SQL Server (PGCDB001).

Diagnóstico: através de análise de logs da aplicação e testes de conectividade direta ao banco de dados via pod no cluster OKD4 DES, identificou-se que o carregamento e a resolução da senha pelo vault BeyondTrust ocorriam corretamente, disponibilizando o valor resolvido através do mecanismo de configuração padrão do .NET (IConfiguration). Entretanto, o código da aplicação realizava a leitura da senha diretamente da variável de ambiente do sistema operacional, através do método Environment.GetEnvironmentVariable, capturando o valor não resolvido do placeholder (formato ${nome_variavel}) ao invés do valor processado pelo BeyondTrust.

Causa raiz: divergência entre o mecanismo de leitura de configuração utilizado no código da aplicação e o mecanismo de injeção de valores resolvidos pelo BeyondTrust, resultando em senha inválida na string de conexão com o banco de dados.

Ação realizada: orientação técnica ao time de desenvolvimento para ajuste no código da aplicação, substituindo a leitura via variável de ambiente direta pela leitura via IConfiguration, garantindo o uso correto do valor resolvido pelo vault.

Resultado: após o ajuste e novo deploy em DES, a aplicação conectou com sucesso ao banco de dados SQL Server, com execução normal de queries confirmada em log.

Atendimento encerrado com sucesso.
