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
