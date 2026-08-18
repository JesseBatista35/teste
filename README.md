Segue nota pronta pra colar no WO/registro de execução:

Sistema: SISMH-web-config
Repositório: SISMH-web-config (branch master)
Arquivo alterado: jboss/standalone-full-ha.xml
Ambiente: DES/TQS

Descrição da alteração:
Inclusão de duas novas properties na seção <system-properties>, necessárias para validação e acesso à API do sistema (integração Keycloak):

sismh.api.keycloak.public.key — chave pública do Keycloak para validação de token
sismh.api.clients.servico.id — ID do cliente de serviço (cli-ser-smh)

Ação necessária no próximo deploy:
Nenhuma ação adicional de infraestrutura — as properties já foram inseridas diretamente no standalone-full-ha.xml versionado no repositório. O pipeline de deploy deve aplicar o arquivo normalmente; não há impacto em datasources, subsystems ou demais configurações do domínio.

Observação:
Alteração restrita à seção <system-properties>. Nenhuma outra tag do arquivo foi modificada.

Status: Pronto para próxima execução de deploy.

Jessé Batista / CTIS/CESTI — Esteira DevOps DES TQS NPRD
