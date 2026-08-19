Prezados,

Sobre o atendimento das properties do Keycloak para o SISMH: verificamos que a solicitação original informava apenas o ambiente (TQS), sem indicar o hostname do servidor ou o fato de se tratar de um ambiente legado (JBoss EAP 6.0.1, fora do padrão de repositório atual). Por conta disso, a alteração foi inicialmente aplicada no arquivo de configuração padrão do repositório SISMH-web-config (standalone-full-ha.xml), que não é o arquivo efetivamente utilizado por esse servidor.

Identificado o cenário durante a investigação, a alteração no repositório foi desfeita, e as properties foram aplicadas corretamente no arquivo standalone.xml do servidor scttqapllx0032.df.caixa, com o serviço já reiniciado. Falta apenas a validação de vocês testando a chamada da API para confirmar que o erro foi solucionado.

Para agilizar o atendimento de próximas solicitações e evitar retrabalho, pedimos que, ao abrir chamados, sejam sempre informados:

Hostname/IP do servidor
Ambiente (DES/TQS/HMP/PRD)
Indicação caso se trate de sistema legado ou configuração fora do padrão
