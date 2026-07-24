Skip to main content
Azure DevOps
projetos
/
Caixa
/
Repos
/
Files
/

SIAVL-enviomsgativa-microfront
Search


Caixa

Overview

Boards

Repos
Files
Commits
Pushes
Branches
Tags
Pull requests

Pipelines

Test Plans

Artifacts
Project settings
SIAVL-enviomsgativa-microfront

.s2i
.sonarlint
src
.eslintrc.js
.gitignore
.npmrc
angular.json
browserslist
extra-webpack.config.js
karma.conf.js
package.json
README.md
sonar-project.properties
tsconfig.app.json
tsconfig.json
tsconfig.spec.json

feature/STRY00014921

/
Type to find a file or folder...
Files
failed

Clone

Contents
History

.s2i
14 de jul.
d2f7eaac
STRY00014921/01: Configuração inicial do MFE Envio de Mensagem. Ronaldo Rosa Junior
.sonarlint
14 de jul.
d2f7eaac
STRY00014921/01: Configuração inicial do MFE Envio de Mensagem. Ronaldo Rosa Junior
src
Yesterday
895883d5
STRY00014921/01: Implementação da inclusão manual de clientes no pré-lote. Ronaldo Rosa Junior
.eslintrc.js
14 de jul.
d2f7eaac
STRY00014921/01: Configuração inicial do MFE Envio de Mensagem. Ronaldo Rosa Junior
.gitignore
14 de jul.
d2f7eaac
STRY00014921/01: Configuração inicial do MFE Envio de Mensagem. Ronaldo Rosa Junior
.npmrc
14 de jul.
d2f7eaac
STRY00014921/01: Configuração inicial do MFE Envio de Mensagem. Ronaldo Rosa Junior
angular.json
14 de jul.
d2f7eaac
STRY00014921/01: Configuração inicial do MFE Envio de Mensagem. Ronaldo Rosa Junior
browserslist
14 de jul.
d2f7eaac
STRY00014921/01: Configuração inicial do MFE Envio de Mensagem. Ronaldo Rosa Junior
extra-webpack.config.js
14 de jul.
d2f7eaac
STRY00014921/01: Configuração inicial do MFE Envio de Mensagem. Ronaldo Rosa Junior
karma.conf.js
14 de jul.
d2f7eaac
STRY00014921/01: Configuração inicial do MFE Envio de Mensagem. Ronaldo Rosa Junior
package.json
Yesterday
895883d5
STRY00014921/01: Implementação da inclusão manual de clientes no pré-lote. Ronaldo Rosa Junior
README.md
14 de jul.
d2f7eaac
STRY00014921/01: Configuração inicial do MFE Envio de Mensagem. Ronaldo Rosa Junior
sonar-project.properties
14 de jul.
d2f7eaac
STRY00014921/01: Configuração inicial do MFE Envio de Mensagem. Ronaldo Rosa Junior
tsconfig.app.json
14 de jul.
d2f7eaac
STRY00014921/01: Configuração inicial do MFE Envio de Mensagem. Ronaldo Rosa Junior
tsconfig.json
14 de jul.
d2f7eaac
STRY00014921/01: Configuração inicial do MFE Envio de Mensagem. Ronaldo Rosa Junior
tsconfig.spec.json
14 de jul.
d2f7eaac
STRY00014921/01: Configuração inicial do MFE Envio de Mensagem. Ronaldo Rosa Junior
SIAVL Envio de Mensagem - Microfrontend
Microfrontend do SIAVL responsável pela composição e pelo envio de mensagens para clientes CAIXA.

O projeto utiliza Angular 16, Single-SPA e o Design System CAIXA (DSC), com execução integrada ao Host da Plataforma.CAIXA.

Objetivo
A jornada do MFE será composta pelas seguintes etapas:

inclusão e seleção de clientes;
seleção da mensagem;
revisão do envio;
resultado do processamento.
O primeiro escopo de desenvolvimento é:

[MFE Envio de Mensagem] Inserção manual de clientes - Step 1

Tecnologias
Angular 16;
TypeScript;
Single-SPA;
Design System CAIXA;
Karma e Jasmine;
ESLint;
SonarQube.
As versões das dependências estão definidas no package.json.

Instalação
Instale as dependências do projeto:

npm install
O repositório corporativo de pacotes está configurado no arquivo .npmrc.

Execução local
Inicie o MFE:

npm start
Por se tratar de um microfrontend, a validação completa deve ser realizada por meio do Host da Plataforma.CAIXA.

Build
Gere o build de produção:

npm run build
Testes
Execute os testes com Firefox Headless e cobertura:

npm test
Execute os testes com Chrome Headless:

npm run test:simple
Execute os testes com Chrome Headless e cobertura:

npm run test:coverage
Execute os testes utilizados pela esteira:

npm run test:devops
Lint
Execute a análise estática:

npm run lint
Variáveis de ambiente
As configurações dos ambientes estão nos arquivos:

src/environments/environment.ts;
src/environments/environment.prod.ts.
No ambiente de produção, os placeholders abaixo são substituídos durante a inicialização do container:

__SIAVL_BACKEND_ENVIOMSGATIVA__;
__CERT_REQUIRED__;
__CODIGO_CANAL_SIIPC__.
As substituições são realizadas pelo arquivo .s2i/bin/run.

Qualidade
As configurações de testes e análise de qualidade estão nos arquivos:

karma.conf.js;
tsconfig.spec.json;
sonar-project.properties;
.eslintrc.js.
