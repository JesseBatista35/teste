Prezados, bom dia/tarde.

Estamos identificando indisponibilidade no serviço de SSO (Keycloak) do ambiente TQS, impactando a autenticação de sistemas nesse ambiente.

Evidências:

1. Acesso direto à tela de login do realm intranet retorna erro 503:
URL: login.tqs.caixa/auth/realms/intranet/protocol/openid-connect/auth?client_id=cli-web-naf
Retorno: "503 Service Unavailable - The server is temporarily unable to service your request due to maintenance downtime or capacity problems."

2. Reflexo no log de aplicação (SINAF, JBoss EAP, ambiente TQS): o processo de atualização de chaves públicas do token (ValidadorSegurancaToken.atualizarPublicKeys) falha ao chamar o SSO, recebendo o mesmo HTML de 503 como resposta. Isso ocorreu tanto na subida da aplicação quanto em nova tentativa automática (timer) às 00:00:00, indicando que a indisponibilidade não foi pontual.

Como consequência, o deploy da aplicação sobe com erros (falha ao construir o componente responsável pela atualização de chaves), e novas autenticações/renovações de token no ambiente TQS ficam bloqueadas.

Solicitamos verificação da saúde do serviço de SSO/Keycloak no ambiente TQS (login.tqs.caixa) e retorno sobre previsão de normalização.

Fico à disposição para mais detalhes.

Atenciosamente,
Jessé Batista
CTIS/CESTI — Esteira DevOps DES TQS NPRD

