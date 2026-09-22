Prezados,

Em continuidade à REQ000145919145 / REQ000145977947 e após o atendimento da REQ000145999028 (WO0000081660693 – liberação de acesso ao domínio cdn.perfdrive.com para o EgressIP 10.121.104.113), registramos as ações realizadas e a conclusão da análise.

1. Validação do proxy indicado pelo CETEL

Testado, a partir do nó do Selenium Grid (pod firefox, namespace selenium-grid, cluster produtos4, SO Linux), o acesso via proxydes.caixa:80, conforme orientado na WO0000081660693.
O nome resolve (10.252.32.63 e 10.252.32.65), porém a conexão TCP na porta 80 expira nos dois endereços. Não há rota da origem para o proxydes.
Verificado que o proxy de saída configurado no cluster produtos4 é o proxyprd.caixa:80 (10.252.32.136 e 10.252.32.220), acessível a partir dos pods.
Via proxyprd.caixa:80, o acesso a https://cdn.perfdrive.com/ foi estabelecido com sucesso: CONNECT 200, certificado *.perfdrive.com válido e resposta HTTP 200.

2. Configuração aplicada

Incluídas as variáveis de ambiente abaixo nos DeploymentConfigs dos nós chrome, firefox e edge do namespace selenium-grid. Os componentes router, distributor, event-bus, sessions e session-queue não foram alterados.

HTTP_PROXY / HTTPS_PROXY (e minúsculas) = http://proxyprd.caixa:80
NO_PROXY (e minúscula) = .caixa, .caixa.gov.br, .corecaixa, .local, .svc, localhost, 127.0.0.1, 10.0.0.0/8, 25.0.0.0/8

Os domínios internos, incluindo o SSO logindes.caixa.gov.br e a aplicação sicbs-frontend-des.apps.nprd.caixa, seguem por rota direta. A configuração fica persistida no DeploymentConfig e se mantém em reinícios dos pods. Verificado também que o Grid não é gerenciado por ferramenta de deploy (ArgoCD/Helm), portanto não há risco de sobrescrita automática.

3. Validação

Novos pods (chrome-4, edge-4, firefox-5) em execução e registrados no Grid (status "ready": true).
Aberta sessão WebDriver via Grid em cada navegador (Firefox 122, Chrome e Edge), com carregamento de https://cdn.perfdrive.com/ concluído entre 0,3s e 1,8s. Antes da configuração ocorria timeout.
Página de login SSO (logindes.caixa.gov.br) e SICBS-frontend carregadas normalmente pelos navegadores do Grid.
Executado o pipeline QAAPI-apitests (Release-1000, estágio QA ACESSIBILIDADE) com fluxo de login SSO. O WebDriver foi inicializado no Grid, a página de login carregou o script https://cdn.perfdrive.com/aperture/aperture.js e as etapas de CPF, avançar, senha e Entrar foram concluídas em cerca de 6 segundos, sem ocorrência de 504 Gateway Time-out ou TimeoutException.

4. Conclusão (infraestrutura)

A causa dos timeouts (bloqueio de saída dos nós do Selenium Grid para o domínio externo cdn.perfdrive.com) foi corrigida. O Selenium Grid está apto para execução dos testes com login SSO.

5. Ponto para avaliação do time de desenvolvimento / qualidade

Na execução de validação, o teste falhou em etapa posterior, por motivo não relacionado à infraestrutura:

[SSO] Falha na etapa: BOTAO_ENTRAR
[SSO] Título atual: Login CAIXA - Informe sua senha
Caused by: java.lang.RuntimeException: LoginDES retornou erro de autenticação: Senha inválida.
  at com.deque.axe.SSOLoginAutomation.performLoginIfRequired(SSOLoginAutomation.java:100)

O SSO recebeu a requisição e recusou a credencial do usuário de teste. As credenciais são lidas do arquivo parametros-login.json do repositório _sicbs-qualidade (teste-acessibilidade/SICBS-frontend). Solicitamos ao time responsável:

a) verificar e atualizar a senha do usuário de teste no LoginDES e no parametros-login.json (ou na variável/secret que o alimenta);

b) evitar execuções repetidas com a credencial atual, para não bloquear o usuário no SSO;

c) após o ajuste, reexecutar o pipeline QAAPI-apitests e, persistindo erro de conectividade, abrir nova demanda para a Esteira DevOps.

Diante do exposto, encerramos esta WO no escopo de infraestrutura da Esteira DevOps.

Atenciosamente,

Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
