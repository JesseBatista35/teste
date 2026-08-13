Prezados,

Analisamos o log de inicialização e a configuração das duas releases (1.1.37 e 1.1.16) do SINAF-acoes-em-lote-mensageria em DES.

O erro -4214 (User ID invalid) não decorre de indisponibilidade do banco nem de erro de código da aplicação. Ele ocorre porque o grupo de variáveis SINAF-ACOES-EM-LOTE-MENSAGERIA-DES passou a conter, na release atual, duas fontes concorrentes de credencial de datasource: as variáveis originais SPRING_DATASOURCE_USERNAME e SPRING_DATASOURCE_PASSWORD, já existentes e mascaradas, e um novo conjunto de variáveis duplicadas com prefixo _ENV., contendo o usuário SNAFBD01 e senha em texto puro, além de uma variável _SECRET.SPRING_DATASOURCE_PASSWORD cujo valor ainda está como token não resolvido.

Essa duplicidade está fazendo com que a aplicação suba com uma credencial diferente da que era usada com sucesso na release 1.1.37, e essa credencial está sendo rejeitada pelo DB2 no momento da conexão.

Solicitamos que o time responsável valide junto ao DBA se o usuário SNAFBD01 com a senha atualmente cadastrada está correto e autorizado para a instância CSD1 em 10.192.224.76:5021, e que seja removida a duplicidade de variáveis do grupo DES, mantendo apenas a fonte única e correta de credencial, no mesmo padrão utilizado na release anterior que funcionava. Também recomendamos marcar a senha como variável secreta, já que está exposta em texto puro no grupo atual.

Ficamos à disposição para apoiar na correção.
