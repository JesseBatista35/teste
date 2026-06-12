Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
sisph-mfe-jnd-central-servicos
Repository navigation
Code
Issues
Pull requests
Actions
Projects
Models
Wiki
Security and quality
22
 (22)
Insights
Settings
Owner avatar
sisph-mfe-jnd-central-servicos
Private
caixagithub/sisph-mfe-jnd-central-servicos
Go to file
t
T
Name		
f583161_caixa
Matheus Neves Oliveira (f583161_caixa)
Merge pull request #11 from caixagithub/feat/IB-25116219-config-TQS
43bf256
 · 
yesterday
.github
feat(config-TQS): inclusão do TQS no generic-pipeline, criação de ser…
2 days ago
.vscode
Sucesso
6 months ago
docs
docs(gerenciador-atend): movimentação de documentações para pasta doc…
2 months ago
projects
feat(gerenciador-atend): ajustes conforme apontamento sonar Refs: IB …
last month
public
initial commit
5 months ago
src
feat(config-TQS): ajustes de redução de complexidade apontados pelo S…
yesterday
.dockerignore
initial commit
5 months ago
.editorconfig
Sucesso
6 months ago
.gitignore
feat(config-TQS): inclusão e ajustes em testes Refs: IB 25116219, TA …
yesterday
.hintrc
initial commit
5 months ago
.npmrc
Sucesso
6 months ago
.prettierignore
initial commit
5 months ago
.prettierrc
initial commit
5 months ago
Dockerfile
feat(altera-dt-venc): atualizacao dos arquivos conforme mfe-padrao, i…
3 months ago
README.md
feat(altera-dt-venc): atualizacao dos arquivos conforme mfe-padrao, i…
3 months ago
angular.json
feat(config-TQS): inclusão e ajustes em testes Refs: IB 25116219, TA …
yesterday
catalog-info.yaml
feat(altera-dt-venc): atualizacao dos arquivos conforme mfe-padrao, i…
3 months ago
extra-webpack.config.js
Sucesso
6 months ago
initial-config.bat
feat(altera-dt-venc): atualizacao dos arquivos conforme mfe-padrao, i…
3 months ago
karma.conf.cjs
karma.conf.cjs e Alteração no packages.json
2 months ago
mkdocs.yaml
feat(altera-dt-venc): atualizacao dos arquivos conforme mfe-padrao, i…
3 months ago
nginx.default.conf
bugfix(gerenciador-atend): ajuste nos arquivos angular.json e nginx p…
2 months ago
package-lock.json
bugfix(gerenciador-atend): correção nas chamadas nos arquivos de test…
2 months ago
package.json
bugfix(gerenciador-atend): correção de endpoints da identificação pos…
2 months ago
sonar-project.properties
feat(gerenciador-atend): correção de rota da tela-atendimento inclusã…
last month
swagger-ui (1).json
feat(gerenciador-atend): ajustes de responsividade em telas menores R…
2 months ago
test-output.log
feat(config-TQS): inclusão e ajustes em testes Refs: IB 25116219, TA …
yesterday
test-results.txt
feat(gerenciador-atend): ampliação de justes em testes unitários conf…
last month
tsconfig.app.json
feat(gerenciador-atend): alteração de moduleResolution: bundler para …
last month
tsconfig.json
feat(gerenciador-atend): alteração de moduleResolution: bundler para …
last month
tsconfig.spec.json
initial commit
5 months ago
Repository files navigation
README
Plataforma MFE - Jornada Utiliza��o FGTS
Este projeto � um Micro Frontend (MFE) desenvolvido em Angular, respons�vel pela jornada de utiliza��o do FGTS no Backoffice. Ele utiliza a biblioteca single-spa-angular para integra��o com a plataforma principal.

Pr�-requisitos
Node.js (vers�o LTS recomendada)
NPM
Angular CLI
Instala��o
Dentro da pasta do projeto, execute o comando para instalar as depend�ncias:

`�ash npm install ``r

E necessario tambem instalar manualmente as depend�ncias abaixo, utilizando o comandi npm install nome-da-dependencia:

`�ash @angular/animations@^19.2.15 @angular/material@^19.2.19 @angular/material-date-fns-adapter@^19.2.19 inputmask@^5.0.9-beta.62 ng2-currency-mask@^13.0.3 ngx-mask@^19.0.6 ``r

Execu��o Local (Modo Single-SPA)
Para rodar o micro frontend isoladamente em modo de desenvolvimento (porta 4215):

`�ash npm run serve:single-spa:mfe-central-servicos ``r

Nota: Para visualizar o MFE funcionando, ele geralmente precisa ser referenciado pelo orquestrador (root config) ou testado via playground do single-spa acessando http://localhost:4215/main.js.

Build de Produ��o
Para gerar os artefatos de produ��o otimizados para o single-spa:

`�ash npm run build:single-spa:backoffice_mfe-poc2 ``r

Os arquivos gerados estar�o na pasta dist/backoffice-mfe-poc2.

Estrutura do Projeto
src/app/features: Cont�m as funcionalidades principais (ex: tela de atendimento, home).
src/app/shared: Componentes, servi�os e modelos reutiliz�veis.
single-spa: Configura��es espec�ficas para o ciclo de vida do micro frontend.
About
Adicionando aplicação:

Topics
frontend boxnovosnegociosmoradia
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
No releases published
Create a new release
Deployments
65
 DES yesterday
 HMP
 TQS
+ 62 deployments
Packages
No packages published
Publish your first package
Contributors
3
@f583161_caixa
f583161_caixa Matheus Neves Oliveira
@c137459_caixa
c137459_caixa Thiago da Silva Menezes
@c080042_caixa
c080042_caixa Flavio Junior Carlos Nunes
Languages
TypeScript
72.1%
 
SCSS
14.9%
 
HTML
8.9%
 
CSS
3.4%
 
Batchfile
0.3%
 
JavaScript
0.3%
 
Dockerfile
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
 caixagithub/sisph-mfe-jnd-central-servicos: Adicionando aplicação:
single-spa content loaded
