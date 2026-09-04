Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
SIMPF-frontend
Repository navigation
Code
Issues
Pull requests
36
 (36)
Actions
Projects
Wiki
Security and quality
251
 (251)
Insights
Settings
caixagithub
SIMPF-frontend
Private
Go to file
t
T
This branch is 62 commits ahead of develop.
f541242_caixa
Alexandre Nobrega Araujo (f541242_caixa)
Removendo botão Recarregar contrato
4ba4c8e
 · 
12 hours ago
Name		
.claude
chore: adicionar configurações de agentes de IA para Copilot e Claude
4 months ago
.github
Add files via upload
3 weeks ago
.s2i/bin
Removido a pasta web
3 weeks ago
.vscode
IB-25139611 - Repaginada a tela de AIMM (create)
2 months ago
src
Removendo botão Recarregar contrato
12 hours ago
.angulardoc.json
Primeiro commit SIMPF-Angular
4 years ago
.browserslistrc
Removido a pasta web
3 weeks ago
.editorconfig
Removido a pasta web
3 weeks ago
.gitignore
Merge branch 'main' into merge-develop-into-main
3 months ago
.npmrc
Primeiro commit SIMPF-Angular
4 years ago
AGENTS.md
chore: adicionar configurações de agentes de IA para Copilot e Claude
4 months ago
CLAUDE.md
chore: adicionar configurações de agentes de IA para Copilot e Claude
4 months ago
README.md
Code review
2 months ago
SIMPF-frontend.iml
21232475: Detalhar informações
3 years ago
angular.json
Removido a pasta web
3 weeks ago
karma.conf.js
Removido a pasta web
3 weeks ago
package-lock.json
Removido a pasta web
3 weeks ago
package.json
Atualização versão package.json
2 days ago
sonar.properties
Removido a pasta web
3 weeks ago
testes-cobertura-codigo.md
(feat) Add DependaBot AutoFix conf files + guard-rails
4 months ago
tsconfig.app.json
Removido a pasta web
3 weeks ago
tsconfig.json
Removido a pasta web
3 weeks ago
tsconfig.spec.json
Removido a pasta web
3 weeks ago
tslint.json
Removido a pasta web
3 weeks ago
Repository files navigation
README
SIMPF Frontend
This project was generated with Angular CLI version 11.2.14.

Development server
Run ng serve for a dev server. Navigate to http://localhost:4200/. The app will automatically reload if you change any of the source files.

Para rodar o servidor de desenvolvimento com o ambiente customizado, utilize:

npm run start:dev
Esse comando executa o Angular usando o arquivo environment.dev.ts.

O comando padrão continua disponível:

ng serve ou npm run start
Code scaffolding
Run ng generate component component-name to generate a new component. You can also use ng generate directive|pipe|service|class|guard|interface|enum|module.

Build
Run ng build to build the project. The build artifacts will be stored in the dist/ directory. Use the --prod flag for a production build.

Running unit tests
Run ng test to execute the unit tests via Karma.

Running end-to-end tests
Run ng e2e to execute the end-to-end tests via Protractor.

Debugging com VS Code
O projeto inclui um arquivo launch.json para facilitar o debug com o Chrome via VS Code (apenas para Windows). Para utilizar:

Crie manualmente a pasta C:\chrome-dev no seu sistema antes de iniciar o debug.
Abra o VS Code e pressione F5 ou selecione "Debug VSCODE SIMPF" na aba de execução.
O navegador Chrome será iniciado em modo de desenvolvimento, acessando http://localhost:4200/.
O Chrome será executado com as flags --disable-web-security (desabilita CORS) e --user-data-dir=C:\chrome-dev para facilitar testes locais.
Certifique-se de que o servidor Angular (ng serve) está rodando antes de iniciar o debug.

Outros sistemas operacionais
O arquivo launch.json atual foi configurado para Windows. Para Linux ou macOS, ajuste o caminho do Chrome (runtimeExecutable) e o diretório de usuário (--user-data-dir) conforme a estrutura do seu sistema. Consulte a documentação do VS Code para detalhes sobre configuração multiplataforma.

Alterando a versão do Node.js (Git Bash)
Se precisar usar uma versão específica do Node.js no Git Bash, você pode alterar o PATH manualmente:

# Veja seu PATH atualPATH
echo $

# Adicione o Node 16 ao PATH para a sessão atual
export PATH="/c/sw/node-16:$PATH"

#se obtiver o erro no such file, utilize:
touch ~/.bashrc

#Então, Para tornar permanente, adicione ao ~/.bashrc. Altere o path /c/sw/node-16 de acordo com seu local da pasta do node.
echo 'export PATH="/c/sw/node-16:$PATH"' >> ~/.bashrc

#para finalizar:
source ~/.bashrc
Further help
To get more help on the Angular CLI use ng help or go check out the Angular CLI Overview and Command Reference page.

About

Adicionando aplicação:

Topics
Resources
Readme
Activity
Custom properties
Stars
0 stars
Watchers
0 watching
Forks
0 forks
Releases
55
 (55)
3.12.0.8
Latest
2 days ago
+ 54 releases
Packages
No packages published
Publish your first package
Contributors
10
 (10)
@c152735_caixa
@c071310_caixa
@0e844c0e10f59d2276803bebafa722_caixa
@c137153_caixa
@c160737_caixa
@c159754_caixa
@8d2bfb2c031def8474409479304a8b_caixa
@c135738_caixa
@c159719_caixa
@c135737_caixa
Languages
TypeScript
50.9%
HTML
19%
SCSS
12.7%
Less
8%
CSS
4.8%
JavaScript
4.5%
Shell
0.1%
 
