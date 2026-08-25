Direcionamento de demanda

Equipe responsável: CETEL / Redes

Motivo: Falha de carregamento de página (GitHub Enterprise) para empregado usuário de Mac. Causa identificada: reescrita de URL pelo proxy corporativo Microsoft Defender for Cloud Apps (MCAS - github.com.mcas.ms), que injeta parâmetros na URL dos módulos JavaScript da aplicação e invalida o import map, impedindo o carregamento dos chunks. Não é falha da aplicação.

Ação solicitada: Verificar política de reescrita/exclusão de domínio no MCAS para github.com.


Prezada,

Analisamos o caso relatado. O erro não está relacionado à aplicação (Painel de Gestão / sigcn-digital-painel-gestao-frontend) em si, e sim ao proxy corporativo Microsoft Defender for Cloud Apps (MCAS), identificado pela URL github.com.mcas.ms utilizada pelo empregado.

O MCAS está reescrevendo as URLs dos módulos JavaScript carregados dinamicamente pela aplicação (import maps do React), injetando parâmetros de contexto (McasCtx, McasTsid) que invalidam o JSON esperado. Isso causa falha no carregamento dos chunks e impede a renderização da página no Mac desse empregado. Em outros ambientes sem essa reescrita a página carrega normalmente, o que confirma que o problema está na camada de proxy, não no código da aplicação.

Esse item é de responsabilidade da equipe de rede/proxy (CETEL/Redes). Encaminhamos para verificação de política de reescrita/exclusão de domínio no MCAS para este repositório.
