Skip to main content

Azure DevOps
CAIXAAZURE
/
SIFAM-APP-ios
/
Pipelines
/
Task groups
Search





Account manager for Jesse Batista
SIFAM-APP-ios

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Allure config
Build Tags

Test Plans

Artifacts
Project settings
Task groups

BUILD-DEPLOY_DEFAULT_IOS

Tasks

History

References
Task group : BUILD-DEPLOY_DEFAULT_IOS
Version
Properties
Name
BUILD-DEPLOY_DEFAULT_IOS
Description
1.1 - Essa Task group verifica se a versão do pacote já existe no Nexus, instala o certificado e o provisioning profile, instala as dependências, compila o pacote, renomeia o IPA e armazena no Artifact.
(Etapa realizada no MAC)
Category
Parameters
NameDefault valueDescription
APP_BUNDLE_IDENTIFIER
$(APP_BUNDLE_IDENTIFIER)
Preencha com o valor do Bundle Identifier do aplicativo.
APP_NAME
$(APP_NAME)
Preencha com nome do aplicativo.
APPLE_APP_PASS
$(APPLE_APP_PASS)
Preencha com a senha de distribuicao do aplicativo.
APPLE_CERTIFICATE_SIGNING_IDENTITY
$(APPLE_CERTIFICATE_SIGNING_IDENTITY)
(Optional) Enter a signing identity override with which to sign the build. This may require unlocking the default keychain on the agent machine. If no value is entered, the Xcode project's setting will be used.
APPLE_PROV_PROFILE_UUID
$(APPLE_PROV_PROFILE_UUID)
(Optional) Enter the UUID of an installed provisioning profile to be used for this build. Use separate build tasks with different schemes or targets to specify separate provisioning profiles by target in a single workspace (iOS, tvOS, watchOS).
APPLE_USERNAME
$(APPLE_USERNAME)
Preencha com o email de distribuicao do aplicativo.
ArtifactUrl
$(ArtifactUrl)
Preencha com a URL do Artifact.
AWS_ACCESS_KEY
$(AWS_ACCESS_KEY)
Preencha com o valor de AWS_ACCESS_KEY do Heartbeat
AWS_REGION
$(AWS_REGION)
Preencha com o valor de AWS_REGION do Heartbeat
AWS_SECRET_ACCESS_KEY
$(AWS_SECRET_ACCESS_KEY)
Preencha com o valor de AWS_SECRET_ACCESS_KEY do Heartbeat
Configuration
$(Configuration)
Preencha com o nome do buildConfigurations referente a cada ambiente conforme o arquivo project.pbxproj
CURRENT_PROJECT_VERSION
$(CURRENT_PROJECT_VERSION)
Preencha com o numero da build que deseja gerar
Environment
$(Environment)
Preencha com o nome do arquivo xcconfig
HEARTBEAT_AWS_CODECOMMIT_REPO_URL
$(HEARTBEAT_AWS_CODECOMMIT_REPO_URL)
Preencha com o valor de HEARTBEAT_AWS_CODECOMMIT_REPO_URL do Heartbeat
HEARTBEAT_AWS_CODECOMMIT_URLENCODED_PASSWORD
$(HEARTBEAT_AWS_CODECOMMIT_URLENCODED_PASSWORD)
Preencha com o valor de HEARTBEAT_AWS_CODECOMMIT_URLENCODED_PASSWORD do Heartbeat
HEARTBEAT_AWS_CODECOMMIT_USERNAME
$(HEARTBEAT_AWS_CODECOMMIT_USERNAME)
Preencha com o valor de HEARTBEAT_AWS_CODECOMMIT_USERNAME do Heartbeat
N
$(N)
variável que soma +1 para cada ambiente na variavel CURRENT_PROJECT_VERSION
P12password
$(P12password)
Password to the Apple certificate (.p12). Use a new build variable with its lock enabled on the `Variables` tab to encrypt this value.
Scheme
$(Scheme)
(Optional) Enter a scheme name defined in Xcode. It must be a shared scheme, with its <strong>Shared</strong> checkbox enabled under <strong>Managed Schemes</strong> in Xcode. If you specify a <strong>Workspace or project path</strong> above without specifying a scheme, and the workspace has a single shared scheme, it will be automatically used.
SDK
$(SDK)
Specify an SDK to use when building the Xcode project or workspace. From the macOS Terminal application, run `xcodebuild -showsdks` to display the valid list of SDKs. The default value of this field is the variable `$(SDK)`. When using a variable, make sure to specify a value (for example, `iphonesimulator`) on the **Variables** tab.
SequenceNew
$(SequenceNew)
Variavel de preenchimento automatico por script
VERSION
$(VERSION)
Preencha com o numero da versao que deseja gerar
Exited full-screen mode

Showing filters 1 through 1

Exited full-screen mode



ersion 1.* 
Sequence e Version
Bash
Install an Apple certificate
Install Apple certificate
Install an Apple provisioning profile
Install Apple provisioning profile
 
Hearbeat pod setup
Bash
pod install
CocoaPods
Generate exportOptions plist
Bash
Xcode archive - Build
Xcode
Rename IPA
Bash
Maven Authenticate
Disabled: Maven Authenticate
Maven pom.xml
Disabled: Maven
Upload Artifacts
Disabled: Bash
Upload to App Store / TestFlight
Bash
Atualiza ReleaseName
Bash



