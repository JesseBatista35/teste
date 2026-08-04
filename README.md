Prezados,

Após a conclusão bem-sucedida das etapas de infraestrutura (instalação do certificado CA do SSO via ConfigMap e ajuste do script para validação TLS), o CronJob agendamento-sisou passou a obter o token de acesso via Keycloak com sucesso (client_credentials, client cli-ser-sou).

Entretanto, a chamada ao endpoint sac/cronjob/indecx/pesquisa-satisfacao, no serviço sisou-sac-okd-des, retorna HTTP 403 (Forbidden).

Analisando o payload do token gerado, identificamos que ele contém apenas roles de realm (SET_SERVICO, offline_access, uma_authorization), sem nenhuma seção resource_access associada a um client específico da aplicação. Isso sugere que o client cli-ser-sou não possui role de client mapeada para autorização na API sisou-sac-okd-des, o que pode ser a causa da negativa de acesso.

Solicitamos que a equipe de desenvolvimento responsável pela API sisou-sac-okd-des avalie:

Qual role de client (resource_access) é esperada pela aplicação para autorizar chamadas ao endpoint mencionado.
Se essa role precisa ser atribuída ao client cli-ser-sou no Keycloak (realm intranet, ambiente DES).
Se há alguma outra validação de contexto (ex.: campos co-unidade ou service_username) que possa estar bloqueando a chamada.

Ficamos à disposição para fornecer o payload completo do token ou realizar novos testes conforme necessário.

Atenciosamente,
Jessé Batista
CTIS/CESTI — DES/TQS NPRD
