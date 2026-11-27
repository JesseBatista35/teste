Matheus, explicando o que fizemos com a Node na v22 (develop-v22):

O Angular 22 exige no mínimo Node 22.22.3 ou 24.15. Os agentes da esteira só têm até a Node 22.13.1 instalada, e o download de outras versões pelo nodejs.org é bloqueado pelo proxy. Então, com a Node padrão dos agentes, a build da v22 nem começa (o próprio Angular CLI barra pela versão).

O que eu fiz: no início da build, a esteira baixa a Node 24 pelo Nexus (via npm, pacote node-linux-x64) e usa ela só durante a execução. Não precisou de nada da infra e a pipeline passou completa.

Mudar o projeto para Node 22 não resolveria, porque o mínimo do Angular 22 é a 22.22.3, que também não existe nos agentes. Então, por enquanto, seguimos com esse contorno. Do seu lado não precisa mudar nada.

A v20 e a v21 não têm esse problema: o Angular 20/21 aceita a Node 22.13.1 dos agentes.
