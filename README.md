Direcionamento de demanda

Equipe responsável: CETEL / Redes

Motivo: Falha de carregamento no GitHub Enterprise para empregados usuários de Mac. Já há 2 ocorrências reportadas com a mesma causa raiz:

Caso 1: página do PR não carrega.
Caso 2: página principal carrega, mas componentes dinâmicos de Pull Request (code review, aplicação de PR) ficam em loading infinito. Investigação já realizada pelo usuário (via Copilot) descartou DNS, SSL e apontou HTTP 200 nos requests, com erro no DevTools: Loading chunk failed after 3 retries, originado de github.githubassets.com.mcas.ms, com stacktrace envolvendo inline.cdn.mcas.ms/proxyweb/js-wrapper.js. Testado em Safari e Edge, mesmo comportamento.

Causa identificada: proxy corporativo Microsoft Defender for Cloud Apps (MCAS) está reescrevendo as URLs dos assets/módulos JS carregados dinamicamente pela aplicação do GitHub, o que impede o carregamento dos chunks. Não é falha da aplicação nem do repositório.

Ação solicitada: Verificar política de reescrita/exclusão de domínio no MCAS para github.com e domínios associados (githubassets.com, cdn.mcas.ms), já que o impacto está afetando produtividade em code review e aplicação de PRs.
