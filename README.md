

<img width="1861" height="907" alt="image" src="https://github.com/user-attachments/assets/2a460d1e-60db-47ab-98cd-379811992591" />


estamos com problema no build que roda no azuredevos porem o repositrio dele vem do github

Starting: Checkout repository@release/3.10.0-funcionalidade-preliminar to s
==============================================================================
Task         : Get sources
Description  : Get sources from a repository. Supports Git, TfsVC, and SVN repositories.
Version      : 1.0.0
Author       : Microsoft
Help         : [More Information](https://go.microsoft.com/fwlink/?LinkId=798199)
==============================================================================
Syncing repository: repository (ExternalGit)
git version
git version 2.43.5
git config --get remote.origin.url
git clean -ffdx
git reset --hard HEAD
fatal: ambiguous argument 'HEAD': unknown revision or path not in the working tree.
Use '--' to separate paths from revisions, like this:
'git <command> [<revision>...] -- [<file>...]'
##[warning]Unable to run "git clean -ffdx" and "git reset --hard HEAD" successfully, delete source folder instead.
git init "/opt/ads-agent/_work/258/s"
hint: Using 'master' as the name for the initial branch. This default branch name
hint: is subject to change. To configure the initial branch name to use in all
hint: of your new repositories, which will suppress this warning, call:
hint: 
hint: 	git config --global init.defaultBranch <name>
hint: 
hint: Names commonly chosen instead of 'master' are 'main', 'trunk' and
hint: 'development'. The just-created branch can be renamed via this command:
hint: 
hint: 	git branch -m <name>
Initialized empty Git repository in /opt/ads-agent/_work/258/s/.git/
git remote add origin https://github.com/caixagithub/SIMPF-frontend.git
git config gc.auto 0
git config --get-all http.https://github.com/caixagithub/SIMPF-frontend.git.extraheader
git config --get-all http.extraheader
git config --get-regexp .*extraheader
git config --get-all http.proxy
git config http.version HTTP/1.1
git remote set-url origin https://emptyusername:***@github.com/caixagithub/SIMPF-frontend.git
git remote set-url --push origin https://emptyusername:***@github.com/caixagithub/SIMPF-frontend.git
git -c http.sslVerify=false fetch --force --tags --prune --prune-tags --progress --no-recurse-submodules origin



esssa aqui do dia 30 passou


Starting: Checkout repository@refs/tags/3.10.0.4 to s
==============================================================================
Task         : Get sources
Description  : Get sources from a repository. Supports Git, TfsVC, and SVN repositories.
Version      : 1.0.0
Author       : Microsoft
Help         : [More Information](https://go.microsoft.com/fwlink/?LinkId=798199)
==============================================================================
Syncing repository: repository (ExternalGit)
git version
git version 2.43.5
git config --get remote.origin.url
git clean -ffdx
Removing .scannerwork/
Removing web/.npmrc
Removing web/coverage/
Removing web/dist/
Removing web/junit/
Removing web/node_modules/
Removing web/reports/
git reset --hard HEAD
HEAD is now at 7c8e80a3 Update package.json
git config gc.auto 0
git config --get-all http.https://github.com/caixagithub/SIMPF-frontend.git.extraheader
git config --get-all http.extraheader
git config --get-regexp .*extraheader
git config --get-all http.proxy
git config http.version HTTP/1.1
git remote set-url origin https://emptyusername:***@github.com/caixagithub/SIMPF-frontend.git
git remote set-url --push origin https://emptyusername:***@github.com/caixagithub/SIMPF-frontend.git
git -c http.sslVerify=false fetch --force --no-tags --prune --prune-tags --progress --no-recurse-submodules origin
remote: Enumerating objects: 97, done.        
remote: Counting objects:   1% (1/97)        
remote: Counting objects:   2% (2/97)        
remote: Counting objects:   3% (3/97)        
remote: Counting objects:   4% (4/97)        
remote: Counting objects:   5% (5/97)        
remote: Counting objects:   6% (6/97)        
remote: Counting objects:   7% (7/97)        
remote: Counting objects:   8% (8/97)        


repo no github



Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
SIMPF-frontend
Repository navigation
Code
Issues
Pull requests
19
 (19)
Actions
Projects
Models
Wiki
Security and quality
182
 (182)
Insights
Settings
Owner avatar
SIMPF-frontend
Private
caixagithub/SIMPF-frontend
Go to file
t
T
Name		
c161233_caixa
Luiz Gustavo Santos Amarante (c161233_caixa)
Merge pull request #84 from caixagithub/hotfix/IB-25322487-campos-mis…
d8f609b
 · 
2 days ago
.claude
chore: adicionar configurações de agentes de IA para Copilot e Claude
2 months ago
.github
Merge branch 'main' into merge-develop-into-main
3 weeks ago
.s2i/bin
Primeiro commit SIMPF-Angular
4 years ago
.vscode
IB-24765154 - Correções da 38
2 months ago
web
Update package.json
3 days ago
.angulardoc.json
Primeiro commit SIMPF-Angular
4 years ago
.editorconfig
Primeiro commit SIMPF-Angular
4 years ago
.gitignore
Merge branch 'main' into merge-develop-into-main
3 weeks ago
.npmrc
Primeiro commit SIMPF-Angular
4 years ago
AGENTS.md
chore: adicionar configurações de agentes de IA para Copilot e Claude
2 months ago
CLAUDE.md
chore: adicionar configurações de agentes de IA para Copilot e Claude
2 months ago
README.md
Atualizado a documentação com instrução de trocar o nodejs
10 months ago
SIMPF-frontend.iml
21232475: Detalhar informações
3 years ago
package-lock.json
IB-00000000 - removido dependencia circular
3 months ago
package.json
IB-00000000 - removido dependencia circular
3 months ago
testes-cobertura-codigo.md
(feat) Add DependaBot AutoFix conf files + guard-rails
2 months ago
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
backend comestruturanteti
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
Releases 37
3.9.3.1
Latest
17 hours ago
+ 36 releases
Packages
No packages published
Publish your first package
Contributors
10
@c152735_caixa
@c071310_caixa
@c137153_caixa
@c161233_caixa
@c160737_caixa
@c159754_caixa
@8d2bfb2c031def8474409479304a8b_caixa
@c135738_caixa
@c159719_caixa
@c135737_caixa
Languages
TypeScript
49.4%
 
HTML
19.1%
 
SCSS
13.0%
 
Less
8.5%
 
CSS
5.1%
 
JavaScript
4.8%
 
Shell
0.1%
Footer
© 2026 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Community
Docs
Contact
Manage cookies
Do not share my personal information
