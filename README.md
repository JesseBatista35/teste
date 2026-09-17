Resumo: Aplicação SIGSJ apresentava erro ao autenticar via logindes.caixa.gov.br (endpoint /auth/realms/internet/protocol/openid-connect/token).

Sintomas observados:

Inicialmente, a chamada ao endpoint de token retornava 503 Service Unavailable (página padrão do Apache indicando falha de comunicação com o backend), evidenciando indisponibilidade momentânea do serviço de autenticação (Keycloak) em logindes.caixa.gov.br.
Em seguida, a tela de login exibiu erro interno ("Ocorreu um erro interno"), sugerindo instabilidade transitória no serviço.

Diagnóstico: A resposta 503 partia do Apache (Server: Apache/2.4.46), indicando que o proxy não conseguia alcançar o backend do Keycloak no momento — comportamento típico de reinício ou indisponibilidade momentânea do serviço, sem intervenção de configuração ou deploy por parte desta equipe.

Resolução: Sem ação de configuração realizada por este analista. O serviço se normalizou espontaneamente, possivelmente em decorrência de reinicialização do servidor/serviço por equipe de infraestrutura responsável pelo ambiente.

Validação: Realizado teste manual via chamada POST direta ao endpoint /auth/realms/internet/protocol/openid-connect/token, com retorno 200 OK e emissão válida de access_token/refresh_token. Equipe da aplicação SIGSJ também confirmou funcionamento normal em testes próprios.

Status: Encerrado — serviço restabelecido e validado.
