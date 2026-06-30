<img width="1634" height="827" alt="image" src="https://github.com/user-attachments/assets/c7dd7aac-9373-4f02-88a1-3e86b0a2c043" />


coloquei ela antes do sdkey biometria

2026-06-30T20:32:21.8267740Z ##[section]Starting: Configura .netrc para Heartbeat
2026-06-30T20:32:21.8301390Z ==============================================================================
2026-06-30T20:32:21.8301810Z Task         : Bash
2026-06-30T20:32:21.8301970Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-30T20:32:21.8302280Z Version      : 3.274.1
2026-06-30T20:32:21.8302470Z Author       : Microsoft Corporation
2026-06-30T20:32:21.8302720Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-30T20:32:21.8303020Z ==============================================================================
2026-06-30T20:32:22.1891300Z Generating script.
2026-06-30T20:32:22.1920950Z ========================== Starting Command Output ===========================
2026-06-30T20:32:22.1950160Z [command]/bin/bash /Users/runner/work/_temp/51d6a2ed-ac8f-4312-b5c2-ce78763c7d25.sh
2026-06-30T20:32:22.3232310Z 
2026-06-30T20:32:22.3340880Z ##[section]Finishing: Configura .netrc para Heartbeat



agora quebra no pod instal com mesmo erro

tirei isso da vairaive exporta sd key
pod install --project-directory=$(System.DefaultWorkingDirectory)/$(Release.PrimaryArtifactSourceAlias)



voltei tudo antes de tudo antes de configura oltei tamne o podfilie

vamos analisar o erro 




2026-06-30T20:46:06.4721740Z ##[section]Starting: Exporta SD_KEY_BIOMETRIA
2026-06-30T20:46:06.4737600Z ==============================================================================
2026-06-30T20:46:06.4737990Z Task         : Bash
2026-06-30T20:46:06.4738150Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-30T20:46:06.4738420Z Version      : 3.274.1
2026-06-30T20:46:06.4738590Z Author       : Microsoft Corporation
2026-06-30T20:46:06.4738810Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-30T20:46:06.4739120Z ==============================================================================
2026-06-30T20:46:06.9348500Z Generating script.
2026-06-30T20:46:06.9565680Z ========================== Starting Command Output ===========================
2026-06-30T20:46:06.9638670Z [command]/bin/bash /Users/runner/work/_temp/f448eb3f-b16d-46a3-ab35-4c11eb3d3ade.sh
2026-06-30T20:46:06.9673840Z  SD_KEY_BIOMETRIA = ***
2026-06-30T20:46:15.5775120Z Analyzing dependencies
2026-06-30T20:46:16.1260750Z Adding spec repo `trunk` with CDN `https://cdn.cocoapods.org`
2026-06-30T20:46:16.1287920Z Cloning spec repo `git-codecommit-v1-repos-release-mobile-ios-specs` from `https://cef-read-mobile-repo-at-536598375304:***@git-codecommit.us-east-1.amazonaws.com/v1/repos/release-mobile-ios-specs`
2026-06-30T20:46:27.8020020Z Downloading dependencies
2026-06-30T20:46:27.8167760Z Installing AppAuth (2.1.0)
2026-06-30T20:46:30.1570720Z Installing AppCenter (5.12.0)
2026-06-30T20:46:36.0691540Z Installing Arcane (2.1)
2026-06-30T20:46:37.1147570Z Installing Differentiator (5.0.0)
2026-06-30T20:46:38.0688700Z Installing Heartbeat (4.36.0.1638431)
2026-06-30T20:46:38.3848310Z 
2026-06-30T20:46:38.3885330Z [!] Error installing Heartbeat
2026-06-30T20:46:38.3919180Z [!] /usr/local/opt/curl/bin/curl -f -L -o /var/folders/2r/4m184kdj27q4yqjdw53cpjfc0000gn/T/d20260630-11438-60ecti/file.tbz https://download-ofd.apps.topazevolution.com/ios-cdn-releases/4.36.0.1638431/Heartbeat.xcframework.tar.bz2 --create-dirs --netrc-optional --retry 2 -A 'CocoaPods/1.16.2 cocoapods-downloader/2.1'
2026-06-30T20:46:38.3940500Z 
2026-06-30T20:46:38.3979150Z   % Total    % Received % Xferd  Average Speed  Time    Time    Time   Current
2026-06-30T20:46:38.4019490Z                                  Dload  Upload  Total   Spent   Left   Speed
2026-06-30T20:46:38.4047880Z 
2026-06-30T20:46:38.4089290Z   0      0   0      0   0      0      0      0                              0
2026-06-30T20:46:38.4111890Z curl: (22) The requested URL returned error: 401
2026-06-30T20:46:38.4177040Z 
2026-06-30T20:46:38.4243050Z ##[error]Bash exited with code '1'.
2026-06-30T20:46:38.4280400Z ##[section]Finishing: Exporta SD_KEY_BIOMETRIA
