Prezados,

Informamos que o sistema SISMH TQS está no ar e operacional. Validamos o acesso via navegador na URL https://sismh.tqs.caixa/sismh/login.cef, com a tela de login carregando normalmente, além do teste direto no servidor (scttqapllx0032.df.caixa), que retornou HTTP 200 OK.

Resumo do atendimento:

Properties sismh.api.keycloak.public.key e sismh.api.clients.servico.id aplicadas corretamente no arquivo standalone.xml do servidor, com o serviço reiniciado e validado.
Alteração anteriormente aplicada por engano no repositório SISMH-web-config (standalone-full-ha.xml) foi revertida.
Identificamos, à parte, um erro de log referente à integração agendada com o SIACI (URL inválida para integração ao SIACI de Demandas e Contratos), que já estava presente antes da nossa alteração e não tem relação com a indisponibilidade reportada nem com o ajuste do Keycloak — não impacta o funcionamento do sistema em si.

Aguardamos retorno de vocês validando o teste na API que originou o chamado.

Status: Resolvido — sistema operacional.

