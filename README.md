Avaliar se o servidor de origem possuir SO WINDOWS favor configurar o proxy no navegador apontando para PROXYDES.CAIXA na PORTA 80, conforme REQ.

Em continuidade a REQ000145977947, e após atendimento da REQ000145999028 foi solicitado o seguinte, abaixo, favor avaliar para atendimento:

a) Se o servidor de origem possuir SO WINDOWS favor configurar o proxy no navegador apontando para PROXYDES.CAIXA na PORTA 80.

b) Se o servidor de origem possuir SO LINUX, configurar as variáveis de ambiente conforme exemplo abaixo:

export http_proxy="http://proxydes.caixa:80"
export https_proxy="http://proxydes.caixa:80"
export ftp_proxy="http://proxydes.caixa:80"
export no_proxy="Inserir as URL/IP que não quer enviar para o proxy. Ex: "*localhost,127.0.0.1,*.caixa"


Atenciosamente.
CETEL08/CETEL960


Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081654444
Criado em	 15/09/2026 12:05:45
Criado por	 P585600
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À CAIXA

Prezados,

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
Solicitação de liberação de proxy aberta via SIGSC em 15/09/2026 (formulário "Proxy", ambiente Não produção), com origem namespace selenium-grid (EgressIP 10.121.104.113) e destino cdn.perfdrive.com, porta 443 — protocolo de atendimento REQ000145999028.

Após aprovação, devem ser configuradas as variáveis de ambiente HTTP_PROXY, HTTPS_PROXY e NO_PROXY nos DeploymentConfigs dos nós do Selenium Grid.

Acompanhar o andamento da REQ000145999028 (solicitação de proxy).

Atenciosamente,

Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081654444
Criado em	 14/09/2026 16:39:32
Criado por	 P642161
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial com viés de falha, erro, degradação ou esgotamento de infraestrutura, serviço, máquina, armazenamento, rotina ou situação que esteja na iminência de tornar-se incidente. Previsto atendimento em até 8 horas. [CENTRAL-SID]
ID da Ordem de Trabalho	 WO0000081654444
Criado em	 14/09/2026 14:01:20
Criado por	 P558217
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),



Informamos que sua solicitação foi recebida.  



Nosso SLA para atendimento é de até 24h úteis, analisaremos a solicitação para nos certificarmos que o atendimento está dentro do escopo de atuação da nossa equipe.



Caso seja identificado que o atendimento não corresponde ao nosso escopo, a solicitação será redirecionada à equipe responsável.



Novas informações e atualizações serão registradas diretamente nesta WO.



Atte.



Esteira Devops DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081654444
Criado em	 14/09/2026 13:59:11
Criado por	 C111750
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Sobre o exposto na REQ000145919145, o problema está na comunicação da ferramenta Selenium Grid com o site alvo do teste.
ID da Ordem de Trabalho	 WO0000081654444
Criado em	 14/09/2026 13:57:11
Criado por	 C111750
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Anexo do Registro de Solicitação.
ID da Ordem de Trabalho	 WO0000081654444
Criado em	 14/09/2026 13:57:09
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Terça-feira, 22/09/2026 18:58:08


Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081660693
Criado em	 15/09/2026 19:11:30
Criado por	 P566266
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Sr(a). Usuário(a),

1. Realizada a liberação do acesso conforme solicitado.

2. Favor realizar os testes de validação do acesso considerando as observações abaixo:
 
a) Se o servidor de origem possuir SO WINDOWS favor configurar o proxy no navegador apontando para PROXYDES.CAIXA na PORTA 80.

b) Se o servidor de origem possuir SO LINUX, configurar as variáveis de ambiente conforme exemplo abaixo:
 
export http_proxy="http://proxydes.caixa:80"


export https_proxy="http://proxydes.caixa:80"

 
export ftp_proxy="http://proxydes.caixa:80"

 
export no_proxy="Inserir as URL/IP que não quer enviar para o proxy. Ex: "*localhost,127.0.0.1,*.caixa"

 
Atenciosamente.

 
CETEL08/CETEL960

Para análise técnica:


Tuesday, September 15, 2026 7:10:41 PM CORPCAIXA\a566266 Computer Set [PND - Selenium Grid - IN] added
Domain Name Set [PND - Selenium Grid - OUT] added
Domain Name Sets [DomainNameSets] modified
WO0000081660693 CAIXA
Computer Set [PND - Selenium Grid - IN] [Name] is [PND - Selenium Grid - IN]
Computer Set [PND - Selenium Grid - IN] Computers added item [Name {10.121.104.113}, Description {}, IP Address {10.121.104.113}]
Domain Name Set [PND - Selenium Grid - OUT] [Name] is [PND - Selenium Grid - OUT]
Domain Name Set [PND - Selenium Grid - OUT] Domain Name Set added item [cdn.perfdrive.com]

ID da Ordem de Trabalho	 WO0000081660693
Criado em	 15/09/2026 14:45:35
Criado por	 P978773
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À
CETEL

Com base no acesso solicitado e análise realizada, concordamos com a liberação.


Atenciosamente,

GLOBAL HITSS - CONECTIVIDADE INTERNA
CEPRO - CN PROTEÇÕES EM SEGURANÇA DIGITAL
ID da Ordem de Trabalho	 WO0000081660693
Criado em	 15/09/2026 14:33:21
Criado por	 P739639
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À

HITSS\CESET\Segurança de Conectividade Interna

1. Verificado que os endereços de origem não pertencem a nenhuma regra atualmente no proxynuvem/DES.

2.  Desta forma, solicitamos análise para liberação da(s) URL(s) citada(s).

Atenciosamente.

CETEL08 - Integração e Serviços de Rede
ID da Ordem de Trabalho	 WO0000081660693
Criado em	 15/09/2026 13:21:27
Criado por	 P655225
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado (a) usuário (a)

1. Informamos que sua solicitação foi recebida em nossa fila e seguirá o fluxo de atendimento.
2. Trata-se de uma atividade de complexidade baixa e será atendida o mais breve
possível.
3. Esta demanda será apresentada para deliberação na reunião de Overview?
( X ) SIM (  ) NÃO
4. Em complemento as informações, destaca-se que: a atividade será encaminhada para a avaliação e autorização da área de Cibersegurança e será executada a partir das 19:00h, após a aprovação da segurança.
5. Informações futuras serão adicionadas a esta WO.

Atenciosamente,

Anderson Campelo Serpa Gama
Preposto
CTIS / CETEL / DHCP, DNS e Proxy de Serviços
ID da Ordem de Trabalho	 WO0000081660693
Criado em	 15/09/2026 12:36:41
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Terça-feira, 22/09/2026 18:58:36



