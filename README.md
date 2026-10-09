


<img width="1895" height="846" alt="image" src="https://github.com/user-attachments/assets/5cc80185-f351-41a4-b9d8-55217e131842" />


fizeram agora me ajda a ver esse qowrkfloy que te manda como e ajuste no codgi eles que fazer lá


Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
sifgm-ios
Repository navigation
Code
Issues
1
 (1)
Pull requests
2
 (2)
Actions
Projects
Wiki
Security and quality
20
 (20)
Insights
Settings
caixagithub
sifgm-ios
Private
Your main branch isn't protected
Protect this branch from force pushing or deletion, or require status checks before merging. View documentation.
Go to file
t
T
c150977_caixa
Elinatan Amorim de Oliveira (c150977_caixa)
Merge pull request #135 from caixagithub/release/5.11.0-build-34
22c8b21
 · 
3 weeks ago
Name		
.github
chore(release): manifesto 5.11.0 build-base 34
3 weeks ago
.vs/sifgm-ios/v17
Ajustes git ignore
last year
FGTS
Atualizando versão do podfile.lock
3 weeks ago
readme_source
Merged PR 25357: Atualizando README do projeto
3 years ago
.DS_Store
Adicionando o inicio do novo fluxo desenrola brasil
5 months ago
.gitattributes
Arquivos da esteira do github
5 months ago
.gitignore
Arquivos da esteira do github
5 months ago
.gitlab-ci.yml
Removendo log desnecessario do runner de test
6 years ago
README.md
Updated README.md
3 years ago
azure-pipelines-stages.yml
Atualizando esteira devops e projeto para compilações no Xcode 26.2 a…
6 months ago
azure-pipelines.yml
Updated azure-pipelines.yml
3 years ago
Repository files navigation
README
FGTS iOS APP
🚀 Começando
Essas instruções permitirão que você obtenha uma cópia do projeto em operação na sua máquina local para fins de desenvolvimento e teste.

📋 Pré-requisitos
Xcode 14.0 ou superior
🔧 Instalação
Para rodar o projeto é necessário instalar as dependências. Primeiro instale o cocoa pods e o modulo da Amazon.

Instalar cocoapods
# Instalar cocoapods
sudo gem install cocoapods

# Instalar o modulo para baixar o source da Amazon
sudo gem install cocoapods-s3-download
Configurar as variáveis de ambiente
export AWS_ACCESS_KEY=AKIAXZ36BNOEHARLLVYF
export AWS_SECRET_ACCESS_KEY=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
export AWS_REGION=us-east-1
export HEARTBEAT_AWS_CODECOMMIT_REPO_URL=git-codecommit.us-east-1.amazonaws.com/v1/repos/release-mobile-ios-specs
export HEARTBEAT_AWS_CODECOMMIT_USERNAME="cef-read-mobile-repo-at-536598375304"
export HEARTBEAT_AWS_CODECOMMIT_URLENCODED_PASSWORD="Js2coGflh7k%2FcxrD1nFnldFZozqp9rEhSSI6uyr802A%3D"
Credenciais para baixar do source do heartbeat, colocar quando for requisitado.
username: cef-read-mobile-repo-at-536598375304
password: Js2coGflh7k/cxrD1nFnldFZozqp9rEhSSI6uyr802A=
Atualizar repositorio do Heartbeat
sudo pod repo update
Instalar dependencias
pod install
⚙️ Executando os testes
Testes unitários
Para rodar os testes unitários do projeto no Xcode é necessário acessar o Xcode Test Navigator pelo menu esquerdo do projeto selecionando o ícone de diamante ou pressionando Command + 6.

Após acessar o menu necessário, pressione o botão de play ao lado do grupo de testes ou da classe de teste que deseja executar. alt text

📌 Versão
Gerenciar versão de Build
Para subir uma nova versão do aplicativo em desenvolvimento para o TestFlight é necessário gerenciar o número da versão no arquivo de configuração DevFoton.xcconfig.

Dentro desse arquivo a constante com o número da versão deve ser escrito seguindo a ordem ano, mês, dia, sprint e build como no exemplo abaixo:

IS_BUILD_NUMBER = 2023.05.09.107.00
About

No description or website provided.
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
602tags
Create a new release
Deployments
500+
 (500+)
DES
3 minutes ago
PLT
3 weeks ago
PRD
3 weeks ago
Packages
No packages published
Publish your first package
Contributors
13
 (13)
@43353d46fee735dd4b166d7cb45ee0_caixa
@f515848_caixa
@c150977_caixa
@f652187_caixa
@c137050_caixa
@f596898_caixa
@f671632_caixa
@c159788_caixa
@c158799_caixa
@1fead827793cb8c254a5c67bc03566_caixa
@c144987_caixa
@p938514_caixa
@p548031_caixa
Languages
Swift
92.1%
Objective-C
6.8%
Other
1.1%
