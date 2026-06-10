2026-06-10T14:02:05.2212134Z ##[section]Starting: Bash Script
2026-06-10T14:02:05.2475640Z ==============================================================================
2026-06-10T14:02:05.2476863Z Task         : Bash
2026-06-10T14:02:05.2477401Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-10T14:02:05.2477671Z Version      : 3.274.1
2026-06-10T14:02:05.2478176Z Author       : Microsoft Corporation
2026-06-10T14:02:05.2478665Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-10T14:02:05.2478979Z ==============================================================================
2026-06-10T14:02:08.3718087Z Generating script.
2026-06-10T14:02:08.3739878Z ========================== Starting Command Output ===========================
2026-06-10T14:02:08.3788635Z [command]/usr/bin/bash /agent/_work/_temp/185a7b10-f738-4780-a31f-c8d2fc69159a.sh
2026-06-10T14:02:08.3916476Z /agent/_work/_temp/185a7b10-f738-4780-a31f-c8d2fc69159a.sh: line 1: Display: command not found
2026-06-10T14:02:08.3936133Z /agent/_work/_temp/185a7b10-f738-4780-a31f-c8d2fc69159a.sh: line 2: Script: command not found
2026-06-10T14:02:08.3950044Z /agent/_work/_temp/185a7b10-f738-4780-a31f-c8d2fc69159a.sh: line 3: Inline: command not found
2026-06-10T14:02:08.3997715Z SD_KEY_BIOMETRIA exportada: ***
2026-06-10T14:02:08.3999778Z 
2026-06-10T14:02:08.4338904Z ##[section]Finishing: Bash Script

NO BASH CONSEGUIU EXPORTAR

MASI NO POD INSTAL CONTIUA SEM:

2026-06-10T14:03:18.9857480Z ##[section]Starting: pod install
2026-06-10T14:03:18.9874660Z ==============================================================================
2026-06-10T14:03:18.9875050Z Task         : CocoaPods
2026-06-10T14:03:18.9875200Z Description  : Install CocoaPods dependencies for Swift and Objective-C Cocoa projects
2026-06-10T14:03:18.9875490Z Version      : 0.274.0
2026-06-10T14:03:18.9875630Z Author       : Microsoft Corporation
2026-06-10T14:03:18.9875830Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/package/cocoapods
2026-06-10T14:03:18.9876070Z ==============================================================================
2026-06-10T14:03:19.4208310Z [command]/usr/local/lib/ruby/gems/3.4.0/bin/pod --version
2026-06-10T14:03:23.7384610Z 1.16.2
2026-06-10T14:03:23.7471270Z 
2026-06-10T14:03:23.7490840Z [command]/usr/local/lib/ruby/gems/3.4.0/bin/pod install --project-directory=/Users/runner/work/r1/a/_SIFAM-iOS-Nativo
2026-06-10T14:03:25.5425550Z Analyzing dependencies
2026-06-10T14:03:26.3394670Z Adding spec repo `trunk` with CDN `https://cdn.cocoapods.org`
2026-06-10T14:03:26.3966880Z Cloning spec repo `git-codecommit-v1-repos-release-mobile-ios-specs` from `https://cef-read-mobile-repo-at-536598375304:***@git-codecommit.us-east-1.amazonaws.com/v1/repos/release-mobile-ios-specs`
2026-06-10T14:03:36.4713670Z Downloading dependencies
2026-06-10T14:03:36.5067610Z Installing AppAuth (2.0.0)
2026-06-10T14:03:38.5973890Z Installing AppCenter (5.12.0)
2026-06-10T14:03:44.7202650Z Installing Arcane (2.1)
2026-06-10T14:03:46.2584450Z Installing Differentiator (5.0.0)
2026-06-10T14:03:47.7578600Z Installing Heartbeat (4.35.1.1622927)
2026-06-10T14:03:47.7583960Z Generating an AWS S3 pre signed URL from: https://mobile-artifacts-repo.s3.amazonaws.com/ios/release/4.35.1.1622927/Heartbeat.xcframework.tar.bz2
2026-06-10T14:03:49.0311380Z Installing KeychainAccess (4.2.2)
2026-06-10T14:03:50.3502250Z Installing RxCocoa (6.9.0)
2026-06-10T14:03:54.2723630Z Installing RxDataSources (5.0.0)
2026-06-10T14:03:55.4459610Z Installing RxRelay (6.9.0)
2026-06-10T14:03:58.9770060Z Installing RxSwift (6.9.0)
2026-06-10T14:04:02.4571530Z Installing SQLite.swift (0.14.1)
2026-06-10T14:04:03.6768160Z Installing SideMenu (6.5.0)
2026-06-10T14:04:05.1074200Z Installing SnapKit (5.7.1)
2026-06-10T14:04:06.2732790Z Installing TLCustomMask (2.0.0)
2026-06-10T14:04:07.3351530Z Installing XID (2.3.6)
2026-06-10T14:04:07.3360270Z Installing unicocheck-ios (3.0.1)
2026-06-10T14:04:19.6830850Z Generating Pods project
2026-06-10T14:04:19.6835500Z SD_KEY_BIOMETRIA = 
2026-06-10T14:04:19.6837560Z Integrating client project
2026-06-10T14:04:19.6840000Z 
2026-06-10T14:04:19.6849570Z [!] Please close any current Xcode sessions and use `SIFAM.xcworkspace` for this project from now on.
2026-06-10T14:04:19.7067280Z Pod installation complete! There are 15 dependencies from the Podfile and 16 total pods installed.
2026-06-10T14:04:19.7395710Z 
2026-06-10T14:04:19.7515520Z ##[section]Finishing: pod install


NA VAIVEIIS DA PIPILINE TEM ISSO:



APPLE_APP_PASS
********

APPLE_USERNAME

CURRENT_PROJECT_VERSION

SEQUENCE
$[counter(variables['VERSION'],1)]
VERSION






