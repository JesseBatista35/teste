2026-06-29T13:36:56.5556200Z ##[section]Starting: Exporta SD_KEY_BIOMETRIA
2026-06-29T13:36:56.5568690Z ==============================================================================
2026-06-29T13:36:56.5568920Z Task         : Bash
2026-06-29T13:36:56.5569050Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-29T13:36:56.5569230Z Version      : 3.274.1
2026-06-29T13:36:56.5569370Z Author       : Microsoft Corporation
2026-06-29T13:36:56.5569510Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-29T13:36:56.5569710Z ==============================================================================
2026-06-29T13:36:56.7819640Z Generating script.
2026-06-29T13:36:56.7835410Z ========================== Starting Command Output ===========================
2026-06-29T13:36:56.7843790Z [command]/bin/bash /Users/runner/work/_temp/6d841fdf-ec47-4461-a7b2-295b6d988847.sh
2026-06-29T13:36:56.7935040Z  SD_KEY_BIOMETRIA = ***
2026-06-29T13:37:01.6485420Z Analyzing dependencies
2026-06-29T13:37:02.0746730Z Adding spec repo `trunk` with CDN `https://cdn.cocoapods.org`
2026-06-29T13:37:02.0748610Z Cloning spec repo `git-codecommit-v1-repos-release-mobile-ios-specs` from `https://cef-read-mobile-repo-at-536598375304:***@git-codecommit.us-east-1.amazonaws.com/v1/repos/release-mobile-ios-specs`
2026-06-29T13:37:10.4963270Z Downloading dependencies
2026-06-29T13:37:10.4965390Z Installing AppAuth (2.1.0)
2026-06-29T13:37:12.3071400Z Installing AppCenter (5.12.0)
2026-06-29T13:37:16.8195390Z Installing Arcane (2.1)
2026-06-29T13:37:17.8411310Z Installing Differentiator (5.0.0)
2026-06-29T13:37:19.1397340Z Installing Heartbeat (4.36.0.1638431)
2026-06-29T13:37:19.9064170Z 
2026-06-29T13:37:19.9065520Z [!] Error installing Heartbeat
2026-06-29T13:37:19.9066280Z [!] /usr/local/opt/curl/bin/curl -f -L -o /var/folders/2r/4m184kdj27q4yqjdw53cpjfc0000gn/T/d20260629-36975-73cncr/file.tbz https://download-ofd.apps.topazevolution.com/ios-cdn-releases/4.36.0.1638431/Heartbeat.xcframework.tar.bz2 --create-dirs --netrc-optional --retry 2 -A 'CocoaPods/1.16.2 cocoapods-downloader/2.1'
2026-06-29T13:37:19.9066840Z 
2026-06-29T13:37:19.9067180Z   % Total    % Received % Xferd  Average Speed  Time    Time    Time   Current
2026-06-29T13:37:19.9067590Z                                  Dload  Upload  Total   Spent   Left   Speed
2026-06-29T13:37:19.9067730Z 
2026-06-29T13:37:19.9067990Z   0      0   0      0   0      0      0      0                              0
2026-06-29T13:37:19.9068320Z curl: (22) The requested URL returned error: 401
2026-06-29T13:37:19.9293170Z 
2026-06-29T13:37:19.9321810Z ##[error]Bash exited with code '1'.
2026-06-29T13:37:19.9350680Z ##[section]Finishing: Exporta SD_KEY_BIOMETRIA


o scirpt da task é esse:


export SD_KEY_BIOMETRIA="$(SD_KEY_BIOMETRIA)" 
echo " SD_KEY_BIOMETRIA = $SD_KEY_BIOMETRIA"  
pod install --project-directory=$(System.DefaultWorkingDirectory)/$(Release.PrimaryArtifactSourceAlias) 

