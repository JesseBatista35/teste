Ajustar ambiente ou parametrização de software

	Ajustar ambiente ou parametrização de software
Informar o Ambiente:*:	DES
Nome do serviço ou sistema:*:	SIFAM
Janela de atendimento:*:	10/6/2026 08:46:00
Prazo final da janela de atendimento:*:	11/6/2026 09:00:00
Haverá previsão de indisponibilidade durante a execução do serviço:*:	Não
Contato do responsável pela validação do ambiente após alteração:*:	Teams c111482
Descrição da solicitação:*:	A
CTIS / CESTI Esteira DEVOPS DES TQS NPRD

Solicitamos verificar o motivo da variavel de ambiente
SD_KEY_BIOMETRIA não estar sendo injetada de forma automatica nas tasks do Xcode, seguem envidencias em anexo.

https://dev.azure.com/CAIXAAZURE/SIFAM-APP-ios/_releaseProgress?_a=release-environment-logs&releaseId=324&environmentId=934
Informar formas de contato:*:	Teams - C111482





2026-06-05T18:33:11.6834660Z ##[section]Starting: pod install
2026-06-05T18:33:11.6850980Z ==============================================================================
2026-06-05T18:33:11.6851270Z Task         : CocoaPods
2026-06-05T18:33:11.6851450Z Description  : Install CocoaPods dependencies for Swift and Objective-C Cocoa projects
2026-06-05T18:33:11.6851710Z Version      : 0.274.0
2026-06-05T18:33:11.6851890Z Author       : Microsoft Corporation
2026-06-05T18:33:11.6852100Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/package/cocoapods
2026-06-05T18:33:11.6852490Z ==============================================================================
2026-06-05T18:33:11.9472490Z [command]/usr/local/lib/ruby/gems/3.4.0/bin/pod --version
2026-06-05T18:33:17.6057010Z 1.16.2
2026-06-05T18:33:17.6146960Z 
2026-06-05T18:33:17.6172200Z [command]/usr/local/lib/ruby/gems/3.4.0/bin/pod install --project-directory=/Users/runner/work/r1/a/_SIFAM-iOS-Nativo
2026-06-05T18:33:19.6879990Z Analyzing dependencies
2026-06-05T18:33:20.2185750Z Adding spec repo `trunk` with CDN `https://cdn.cocoapods.org`
2026-06-05T18:33:20.2189870Z Cloning spec repo `git-codecommit-v1-repos-release-mobile-ios-specs` from `https://cef-read-mobile-repo-at-536598375304:***@git-codecommit.us-east-1.amazonaws.com/v1/repos/release-mobile-ios-specs`
2026-06-05T18:33:30.3017880Z Downloading dependencies
2026-06-05T18:33:30.3019420Z Installing AppAuth (2.0.0)
2026-06-05T18:33:33.2242090Z Installing AppCenter (5.12.0)
2026-06-05T18:33:41.6947110Z Installing Arcane (2.1)
2026-06-05T18:33:43.4442020Z Installing Differentiator (5.0.0)
2026-06-05T18:33:45.1919450Z Installing Heartbeat (4.35.1.1622927)
2026-06-05T18:33:45.1921360Z Generating an AWS S3 pre signed URL from: https://mobile-artifacts-repo.s3.amazonaws.com/ios/release/4.35.1.1622927/Heartbeat.xcframework.tar.bz2
2026-06-05T18:33:46.3526150Z Installing KeychainAccess (4.2.2)
2026-06-05T18:33:47.6361900Z Installing RxCocoa (6.9.0)
2026-06-05T18:33:51.8595720Z Installing RxDataSources (5.0.0)
2026-06-05T18:33:52.9851100Z Installing RxRelay (6.9.0)
2026-06-05T18:33:57.5287820Z Installing RxSwift (6.9.0)
2026-06-05T18:34:09.0241830Z Installing SQLite.swift (0.14.1)
2026-06-05T18:34:10.6088550Z Installing SideMenu (6.5.0)
2026-06-05T18:34:12.5693070Z Installing SnapKit (5.7.1)
2026-06-05T18:34:13.7371180Z Installing TLCustomMask (2.0.0)
2026-06-05T18:34:14.7810790Z Installing XID (2.3.6)
2026-06-05T18:34:14.7814080Z Installing unicocheck-ios (3.0.0)
2026-06-05T18:34:26.5118670Z Generating Pods project
2026-06-05T18:34:26.5119460Z SD_KEY_BIOMETRIA = 
2026-06-05T18:34:26.5120110Z Integrating client project
2026-06-05T18:34:26.5120440Z 
2026-06-05T18:34:26.5121200Z [!] Please close any current Xcode sessions and use `SIFAM.xcworkspace` for this project from now on.
2026-06-05T18:34:26.5352820Z Pod installation complete! There are 15 dependencies from the Podfile and 16 total pods installed.
2026-06-05T18:34:26.5712250Z 
2026-06-05T18:34:26.5852250Z ##[section]Finishing: pod install


Skip to main content

Azure DevOps
CAIXAAZURE
/
SIFAM-APP-ios
/
Pipelines
/
Releases
/
SIFAM-iOS
/
SIFAM-iOS 4.9.0 | Build 7 | ID 332
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
SIFAM-iOS

SIFAM-iOS 4.9.0 | Build 7 | ID 332


DES

Succeeded


Pipeline

Tasks

Variables

Logs

Tests

 You can edit approvals, tasks, and variables by clicking on Edit release.  Edits will be saved only to this release. 
Predefined variables
RELEASE_VARIABLE_SIFAM (18)
Library com informações relativas ao projeto do SIFAM
Scopes: Release
SIFAM-DES (8)
Scopes: DES
Configuration
$(Environment)
Environment
Debug
N
0
SDK
iphoneos
SD_KEY_BIOMETRIA
********
Scheme
SIFAM-$(Environment)
TestConfiguration
Debug
TestSDK
iphonesimulator
SIFAM-PILOTO (8)
Scopes: PILOTO
SIFAM-PRD (8)
Scopes: PRD
Exited full-screen mode

Exited full-screen mode

Row 2

Exited full-screen mode

Showing filters 1 through 2

a questão é memso com a varaivel configurada ele na ta pegando o valor
