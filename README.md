À Suporte/CAIXA / Wanderson França (P911751)

A solicitação é de atualização da versão do Chrome no Selenium Grid (namespace selenium-grid, cluster produtos4), ferramenta cujo único administrador é o P911751. A alteração não está no escopo das esteiras NPRD.

Confirmamos que o pedido procede: o nó Chrome roda a versão 120.0.6099.224 (início de 2024), com as imagens de todos os componentes fixadas por digest desde a criação. A atualização deve ser feita em conjunto em todos os componentes do Grid (router, distributor, event-bus, sessions, session-queue e nós chrome/edge/firefox).

Sobre a devolução: a criação da sessão com sucesso não descarta o Grid. O log mostra que a etapa BOTAO_ENTRAR falhou por "session deleted because of page crash", ou seja, a aba do Chrome crashou dentro do nó do Grid. Identificamos ainda que o /dev/shm do nó Chrome está com o padrão de 64 MB, causa mais comum desse erro em containers. Recomendamos, junto com a atualização, incluir volume de 2 GB para /dev/shm nas DCs dos nós (emptyDir, medium: Memory), pois a atualização isolada pode não resolver o crash.

Devolvemos ao responsável pela ferramenta.
