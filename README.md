Análise – Solicitação de atualização do Chrome no Selenium Grid
URL: https://selenium-router-selenium-grid.apps.produtos4.caixa/ui
Release com erro: releaseId 532373 / environmentId 2473296
Erro: org.openqa.selenium.WebDriverException: unknown error: session deleted because of page crash / cannot determine loading status

1. Responsabilidade pela ferramenta
- O Selenium Grid roda no namespace selenium-grid, no cluster produtos4. É uma ferramenta compartilhada e não faz parte das esteiras de aplicação DES/TQS.
- Projeto criado há cerca de 2 anos e meio pela matrícula p911751 (Wanderson Farias França), conforme annotation openshift.io/requester.
- O RoleBinding "admin" do namespace tem como único subject o usuário p911751. Não há grupo ou time vinculado.
- Conclusão: a atualização está fora do escopo de atendimento das esteiras DES/TQS e deve ser direcionada ao responsável pela ferramenta.

2. Versão atual dos componentes
- Nó Chrome: Google Chrome 120.0.6099.224 (início de 2024). Confirmada a defasagem apontada pelo solicitante.
- Os 8 componentes do Grid (DCs chrome, edge, firefox, selenium-router, selenium-distributor, selenium-event-bus, selenium-sessions, selenium-session-queue) usam imagens fixadas por digest (@sha256), e não por tag. Por isso nunca receberam atualização desde a criação.
- A atualização deve ser feita em conjunto em todos os componentes, mantendo a mesma versão do Selenium. Atualizar apenas o nó Chrome pode causar incompatibilidade com o router/distributor.

3. Causa provável do "page crash"
- O /dev/shm do container do nó Chrome está com o padrão de 64 MB. A DC chrome não tem nenhum volume dedicado montado em /dev/shm.
- O Chrome usa /dev/shm para renderização e, em páginas pesadas (como nos testes de acessibilidade com axe), o esgotamento desse espaço derruba a aba, gerando exatamente o erro "session deleted because of page crash".
- A documentação oficial do Selenium para execução em containers recomenda cerca de 2 GB de /dev/shm.
- Portanto, a atualização de versão, isoladamente, provavelmente não resolve o crash.

4. Recomendações ao responsável pela ferramenta
a) Ajuste imediato (baixo impacto, deve resolver o crash): incluir nas DCs dos nós (chrome, e avaliar edge/firefox) um volume para /dev/shm:
   volumes:
     - name: dshm
       emptyDir:
         medium: Memory
         sizeLimit: 2Gi
   volumeMounts (no container):
     - name: dshm
       mountPath: /dev/shm
   Revisar o limite de memória do pod para comportar o volume.
b) Atualização de versão: atualizar todos os componentes do Grid para uma versão recente do Selenium, em conjunto, para alinhar o navegador à versão atual e não impactar o resultado dos testes de acessibilidade.

5. Evidências coletadas (oc, cluster produtos4)
- oc get project selenium-grid -o yaml -> openshift.io/requester: p911751
- oc describe rolebinding admin -n selenium-grid -> subject único: User p911751
- oc get dc -n selenium-grid -> 8 DCs com imagens selenium/* fixadas por digest
- oc rsh -n selenium-grid dc/chrome google-chrome --version -> Google Chrome 120.0.6099.224
- oc rsh -n selenium-grid dc/chrome df -h /dev/shm -> shm 64M
- oc get dc chrome -n selenium-grid -o yaml | grep -i shm -> sem retorno (nenhum volume configurado)

Encaminhamento: demanda será repassada via preposto ao responsável pela ferramenta, Wanderson Farias França (p911751).
