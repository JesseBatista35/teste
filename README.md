Análise técnica – REQ000145919145

Resumo do problema:
Os testes de acessibilidade do pipeline QAAPI-apitests (projeto AxeAutomator/axe-selenium), executados contra o SICBS-frontend via SSO (logindes.caixa.gov.br) através do Selenium Grid (selenium-router-selenium-grid.apps.produtos4.caixa), passaram a apresentar falhas intermitentes de timeout a partir de 10/09/2026: inicialmente como "504 Gateway Time-out" no carregamento da página, e em 14/09/2026 como org.openqa.selenium.TimeoutException (30s) durante a etapa de login SSO.

Investigação realizada:
1. Verificado o Selenium Grid (Overview e Sessions) e confirmado que os 3 nós (Chrome, Firefox, Edge) estavam saudáveis, ociosos e sem fila de espera, descartando problema de capacidade ou indisponibilidade do próprio Grid.
2. Aberta sessão manual via VNC para observar o comportamento em tempo real. A página de login (logindes.caixa.gov.br) carregou normalmente, porém a barra de status permaneceu em "Connecting to cdn.perfdrive.com...", domínio externo referente ao script de proteção anti-bot (Radware/Shieldsquare) embarcado na tela de login.
3. Verificado o DeploymentConfig e o YAML do pod firefox-3-rwpfb (namespace selenium-grid) no OKD e confirmado que não há nenhuma variável de proxy configurada (HTTP_PROXY/HTTPS_PROXY/NO_PROXY) nos pods do Selenium Grid.
4. Executado teste de conectividade direto de dentro do pod firefox-3-rwpfb: curl -v --max-time 15 https://cdn.perfdrive.com/ resultou em timeout de conexão (Connection timed out after 15001 milliseconds). Do mesmo domínio, acessado de estação de trabalho com saída normal à internet, o retorno foi imediato.
5. Analisado o log de uma execução anterior bem-sucedida (23/04/2026) e confirmado que, naquele caso, o parâmetro loginSSO estava vazio e o fluxo de login SSO foi ignorado — ou seja, aquela execução não chegou a exercitar o trecho de código dependente de cdn.perfdrive.com, não havendo contradição com a causa raiz identificada.

Causa raiz:
Os pods de nó do Selenium Grid rodam no namespace selenium-grid, classificado como Não Produção, sem liberação de saída direta à internet (regra de negócio 43365 – bloqueio Não Produção/CLOUD para Produção/EXTERNO/INTERNET). Sem proxy configurado, os pods não conseguem estabelecer conexão com o domínio externo cdn.perfdrive.com, responsável por carregar o script de proteção anti-bot presente na tela de login SSO. Essa falha de conectividade faz o navegador travar durante o carregamento da página, gerando os timeouts intermitentes relatados (504 Gateway Time-out e TimeoutException do Selenium). Não há evidência de falha na aplicação SICBS-frontend, no Selenium Grid ou no script de teste.

Encaminhamento:
Solicitação de liberação de proxy aberta via SIGSC em 15/09/2026 (formulário "Proxy", ambiente Não produção), com origem namespace selenium-grid (EgressIP 10.121.104.113) e destino cdn.perfdrive.com, porta 443 — protocolo de atendimento REQ000145999028. Após aprovação, serão configuradas as variáveis de ambiente HTTP_PROXY, HTTPS_PROXY e NO_PROXY nos DeploymentConfigs dos nós do Selenium Grid.

Pendência:
Aguardando aprovação da REQ000145999028 (solicitação de proxy). Esta REQ (REQ000145919145) permanece vinculada e será encerrada mediante conclusão daquela solicitação.




Assunto: Autorização para liberação de proxy - REQ000145999028

Prezado(a),

Solicito autorização para a REQ000145999028, aberta via SIGSC (formulário Proxy, ambiente Não produção), referente à liberação de saída de rede do namespace selenium-grid (EgressIP 10.121.104.113) para o domínio cdn.perfdrive.com, na porta 443 (HTTPS).

Motivo: o pipeline QAAPI-apitests (testes de acessibilidade AxeAutomator) está apresentando falhas intermitentes de timeout (504 Gateway Time-out / TimeoutException) na etapa de login SSO contra o SICBS-frontend, registradas na REQ000145919145. A investigação identificou que a tela de login SSO carrega um script de proteção anti-bot hospedado em cdn.perfdrive.com, e que os pods do Selenium Grid, por estarem em ambiente de Não Produção, não possuem saída liberada para esse domínio externo (regra de negócio 43365), o que foi confirmado via teste de conectividade direto do pod (timeout de conexão).

A liberação solicitada é o encaminhamento necessário para resolver a causa raiz identificada e normalizar a execução do pipeline.

Fico à disposição para esclarecimentos adicionais.

Atenciosamente,
Jessé Batista
