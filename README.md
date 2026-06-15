	A
CTIS / CESTI Esteira DEVOPS DES TQS NPRD

1) Pedimos acrescentar na variable group "SIAPT-DES" uma nova variable conforme abaixo:

Name: SD_KEY_BIOMETRIA
Value:
Type: Secret

1.2) A variável deve ser propagada para as tasks individuais (pod install e Xcode archive) por injeção explícita no contexto de execução.
Solução similar a que foi aplicada na REQ000144484639 em atendimento realizado em conjunto por Luis Henrique e Jose Mouta.

SOLUÇÃO A SER APLICADA:

a) Adicionar parâmetro "SD_KEY_BIOMETRIA" na task group BUILD-DEPLOY_DEFAULT_IOS

b) Modificar o script "Sequence e Version" para injetar a variável no project.pbxproj:

#Altera o valor do campo SD_KEY_BIOMETRIA por $(SD_KEY_BIOMETRIA)
SD_KEY_BIOMETRIA=$(SD_KEY_BIOMETRIA)
#Altera o valor do campo SD_KEY_BIOMETRIA por $(SD_KEY_BIOMETRIA)
sed -i '' -e 's/SD_KEY_BIOMETRIA =\s*.*/SD_KEY_BIOMETRIA = $(SD_KEY_BIOMETRIA);/g' $(APP_NAME).xcodeproj/project.pbxproj

c) Criar novo bash script (Exporta SD_KEY_BIOMETRIA)que exporta a variável antes do pod install:

export SD_KEY_BIOMETRIA="$(SD_KEY_BIOMETRIA)"
echo " SD_KEY_BIOMETRIA = $SD_KEY_BIOMETRIA"  
pod install --project-directory=$(System.DefaultWorkingDirectory)/$(Release.PrimaryArtifactSourceAlias)    

VALIDAÇÃO:

a) Pod install executado com sucesso

b) Xcode archive receber SD_KEY_BIOMETRIA=*** (confirmar nos logs)

2) Por tratar-se de informação sensível, conforme orientação do C160428 - Danilo Pedroso, o Value foi encaminhado via e-mail, para a caixa postal "cepro20@caixa.gov.br":
Informar formas de contato:*:	Teams - C079249

req atendida:


À CAIXA.

Prezados.

A variável de ambiente SD_KEY_BIOMETRIA não estava sendo injetada automaticamente nas tasks do Xcode durante a execução do pipeline de build.

A variável estava configurada no Azure DevOps (Release variables), mas não estava sendo propagada para as tasks individuais (pod install e Xcode archive) por falta de injeção explícita no contexto de execução.

SOLUÇÃO APLICADA:
- Adicionado parâmetro "SD_KEY_BIOMETRIA" na task group BUILD-DEPLOY_DEFAULT_IOS
- Modificado o script "Sequence e Version" para injetar a variável no project.pbxproj:
   - sed: 's/SD_KEY_BIOMETRIA =\s*.*/SD_KEY_BIOMETRIA = $(SD_KEY_BIOMETRIA);/g'
- Criado novo bash script que exporta a variável antes do pod install:
   - export SD_KEY_BIOMETRIA="$(SD_KEY_BIOMETRIA)"
   - pod install com variável exportada

VALIDAÇÃO:
Pod install executado com sucesso
Xcode archive recebeu SD_KEY_BIOMETRIA=*** (confirmado nos logs)



Atenciosamente,

Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD




Antonia Edilene Gomes Costa
 
Retificamos o item 1 para criar a nova variável nas 03 variables groups.
 
1) Pedimos acrescentar nas 03 variable groups "SIAPT-DES", "SIAPT-PILOTO" e "SIAPT-PRD" uma nova variable conforme abaixo:
 
Name: SD_KEY_BIOMETRIA
Value:
Type: Secret




