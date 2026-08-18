URL: https://fusionx.caixa/create/tasks/9f440f12-e94d-47c5-bfb1-8f8bdf69a47a
Erro: GithubResponseError
Mensagem: Pull request creation failed; caused by HttpError: Not Found - https://docs.github.com/rest/repos/repos#get-a-repository
O site https://www.githubstatus.com/ apresenta a mensagem "All Systems Operational".


​
Search...

Home logo
Home
Catalogo
Self-service
APIs
Aprendizado
Meu grupo
Feedback
Docs
Notifications
1
Self-service
Create new software components using standard templates in your organization
Criar um microsserviço
Crie um microsserviço para suas aplicações Inclui configurações para Docker, Application Insights, Helm e GitOps.

Vamos identificar sua aplicação
Identifique a infraestrutura
Vamos catalogar sua aplicação
Review
Olá! Seja bem-vindo(a) ao nosso assistente de criação de aplicações.

Vice-presidência *
10
Sigla do Sistema
Selecione a sigla do sistema (integrado ao SIPGC)

Tipo de Repositório *
1
Escolha Qual o Tipo de Repositório

Informe o NOME DO MÓDULO - SEM SIGLA OU TIPO *
teste-fusionx
Informe o nome do módulo, NÃO deve ter a SIGLA nem o TIPO. OBS: o nome final do repositório será formado por sigla-tipo-modulo

Descrição do módulo *
Teste
Fale um pouco sobre o seu módulo/serviço

Modelo de Código Fonte *
0
Você gostaria de utilizar seu próprio modelo ou um modelo padrão?

Linguagem de Programação *
0
Selecione a linguagem de programação do seu módulo/serviço

Utilizar Pipeline Ágil de Mudança?
1
Se 'Sim', serão solicitadas informações para preenchimento automático, via pipeline, do formulário de Mudanças.


o problems e que ele ta criando um teste sem sigla.. fizeram isso qui na sala com outro ambiente que estava com mesmo problema

Bom dia Mateus Fidelis Marinho Maia. Já realizamos a sanitização do sidsc-lib-sidsc-angular.  Não tem mais os reapositórios sidsc-lib-sidsc-angular, sidsc-lib-sidsc-angular-infranprd e sidsc-lib-sidsc-angular-infraprd.
 
 
 
mas a execução no FusionX persiste em informar que esses repositórios existem.
 
(1) Run of Jornada Corporativa | FusionX
 
pode ser realmente que pegue a string "lib-sidsc-angular" que faz parte de outros repositórios conforme imagem acima. Poderia verificar isso pra gente por favor ?
 
 
 
Cledson Moreira Parente
Bom dia Mateus Fidelis Marinho Maia. Já realizamos a sanitização do sidsc-lib-sidsc-angular.  Não tem mais os reapositórios sidsc-lib-sidsc-angular, sidsc-lib-sidsc-angular-infranprd e sidsc-lib-sids…
Bom dia. 
 
Na execução que foi passada o nome completo do repositório é sidsc-frontend-lib-sdsc-angular, o que já existe mesmo.
 
As variáveis preenchidas:

SIGLA: "SIDSC"
TIPO DE REPOSITORIO: "frontend"
NOME DO MÓDULO - SEM SIGLA OU TIPO: "lib-sdsc-angular"

Montagem do nome do repositório: (SIGLA)-(TIPO DE REPOSITORIO)-(NOME DO MÓDULO - SEM SIGLA OU TIPO)

Resultado: sidsc-frontend-lib-sdsc-angular
 
