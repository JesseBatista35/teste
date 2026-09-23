Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
sisfm-mfe-cardmovimentacaofinanceira
Repository navigation
Code
Issues
Pull requests
1
 (1)
Actions
Projects
Wiki
Security and quality
181
 (181)
Insights
Settings
caixagithub
sisfm-mfe-cardmovimentacaofinanceira
Private
Go to file
t
T
author
Scaffolder
initial commit
91c5aeb
 · 
5 months ago
Name		
.github/workflows
initial commit
5 months ago
docs
initial commit
5 months ago
public
initial commit
5 months ago
src
initial commit
5 months ago
.editorconfig
initial commit
5 months ago
.gitignore
initial commit
5 months ago
.hintrc
initial commit
5 months ago
.npmrc
initial commit
5 months ago
.prettierignore
initial commit
5 months ago
.prettierrc
initial commit
5 months ago
README.md
initial commit
5 months ago
angular.json
initial commit
5 months ago
catalog-info.yaml
initial commit
5 months ago
extra-webpack.config.js
initial commit
5 months ago
jest.config.js
initial commit
5 months ago
mkdocs.yaml
initial commit
5 months ago
package-lock.json
initial commit
5 months ago
package.json
initial commit
5 months ago
tsconfig.app.json
initial commit
5 months ago
tsconfig.json
initial commit
5 months ago
tsconfig.spec.json
initial commit
5 months ago
Repository files navigation
README
Sumário
Getting Started
Pré-requisitos
Configuração de ambiente
Instalação
Getting Started
O sisfm é composto pelo projeto sisfm-components e sisfm-portal. O sisfm-compeonents disponibiliza componentes Angular Material customizáveis para uso em aplicações Angular. O sisfm-portal fornece informações de design, uso em desenvolvimento e casos de uso dos componentes.

Este documento explica como configurar o ambiente de desenvolvimento do sisfm. Inclui também informações sobre pré-requisitos e instalação da biblioteca de componentes sisfm-components em projetos Angular.

Pré-requisitos
As dependências principais do projeto são GIT, Node.JS, Angular CLI e Angular Material.

Angular CLI	NODE.JS	Angular Material
16.1.x or 16.2.x	^16.14.0 or ^18.10.0	^16.2.x
Node.JS - Usado execução de programas Node via linha de comando. Para verificar a versão do Node instalado, execute o comando node -v no terminal.
Nota: NVM é uma maneira popular de instalar e utilizar diferentes versões do Node.JS por meio de linha de comando no terminal.

Configuração de ambiente
Esta seção explica como configurar o ambiente para desenvolvimento Angular usando Angular CLI além de incluir informações sobre pré-requisitos, instalação do Angular CLI, git clone do projeto e execução dos scripts configurados.

Instalação do Angular CLI
O Angular CLI é usado para criar projetos, gerar códigos para a aplicação/biblioteca, e uma variedade de tarefas de desenvolvimento relacionadas a teste, construção e publicação.

Com o Node.JS disponibilizado no ambiente, para instalar o Angular CLI na versão compatível com o sisfm, execute o seguinte comando:

npm install -g @angular/cli@16
Clone do projeto
Para clonar o projeto no seu ambiente local, execute o seguinte comando:

git clone [repositorio_ainda_indisponível]
Em seguida, proceda com os seguintes comandos:

cd sisfm
npm i
Instalação
Usando o Angular CLI
Use o comando de isntalação do Angular CLI para configurar o sisfm-components em um projeto Angular:

ng add sisfm-components
Nota: Em um workspace de múltiplos projetos adicione o parâmetro --project<nome-do-projeto>.

O comando acima irá instalar o sisfm-components e irá executar a ação de adicionar o arquivo de estilo na propriedade no angular.json do projeto.

Instalando manualmente
Use o comando de isntalação do NPM para configurar o sisfm-components em um projeto Angular:

npm i sisfm-components
Para instalar o arquivo de estilo do sisfm-components será necessário informar manualmente o caminho no angular.json do projeto.

{
  ...
  "styles": [
    "node_modules/sisfm-components/styles/main.scss"
  ],
  ...
}
Utilizando um componente
Após o processo de instalação concluído, adicione um componente e execute o projeto para verificar se tudo funcionou corretamente.

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ButtonComponent } from 'sisfm-components/button';

@NgModule({
  declarations: [AppComponent],
  imports: [BrowserModule, AppRoutingModule, ButtonComponent],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
<dsc-button label="Botão"></dsc-button>
About

Adicionando aplicação: sisfm-mfe-cardmovimentacaofinanceira

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
No releases published
Create a new release
Deployments
28
 (28)
DES
3 weeks ago
Packages
No packages published
Publish your first package
Contributors
No contributors
Languages
TypeScript
69.2%
HTML
25%
JavaScript
5.1%
SCSS
0.7%



 <img width="1869" height="882" alt="image" src="https://github.com/user-attachments/assets/ebdfbda4-62b8-4a49-b228-d59d08f67b7f" />


 <img width="1854" height="919" alt="image" src="https://github.com/user-attachments/assets/d7e967dc-11b0-4521-9ef4-9478d8445bc1" />


<img width="1793" height="894" alt="image" src="https://github.com/user-attachments/assets/e557d035-38c4-47f2-a931-a43dc121ecb8" />


