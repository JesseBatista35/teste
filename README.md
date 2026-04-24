2026-04-24T18:07:21.7345920Z ##[section]Starting: pod install
2026-04-24T18:07:21.7358390Z ==============================================================================
2026-04-24T18:07:21.7358630Z Task         : CocoaPods
2026-04-24T18:07:21.7358790Z Description  : Install CocoaPods dependencies for Swift and Objective-C Cocoa projects
2026-04-24T18:07:21.7359210Z Version      : 0.269.0
2026-04-24T18:07:21.7359380Z Author       : Microsoft Corporation
2026-04-24T18:07:21.7359530Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/package/cocoapods
2026-04-24T18:07:21.7359770Z ==============================================================================
2026-04-24T18:07:22.0813090Z [command]/usr/local/lib/ruby/gems/3.3.0/bin/pod --version
2026-04-24T18:07:30.4645450Z 1.16.2
2026-04-24T18:07:30.4771190Z 
2026-04-24T18:07:30.4794170Z [command]/usr/local/lib/ruby/gems/3.3.0/bin/pod install --project-directory=/Users/runner/work/r1/a/_SIFAM-iOS-Nativo
2026-04-24T18:07:31.8319640Z Analyzing dependencies
2026-04-24T18:07:31.8320350Z Pre-downloading: `XID` from `https://binario.caixa/repository/caixa-ios-releases/XID/XID-r2.3.3.BETA.zip`
2026-04-24T18:07:34.9439710Z 
2026-04-24T18:07:34.9513490Z [!] Error installing XID
2026-04-24T18:07:34.9593480Z [!] Failed to download 'XID': [!] /usr/local/opt/curl/bin/curl -f -L -o /var/folders/4b/2nnnxx0n2f15srrx6d6ndm7c0000gn/T/d20260424-11780-uujz4o/file.zip https://binario.caixa/repository/caixa-ios-releases/XID/XID-r2.3.3.BETA.zip --create-dirs --netrc-optional --retry 2 -A 'CocoaPods/1.16.2 cocoapods-downloader/2.1'
2026-04-24T18:07:34.9658040Z 
2026-04-24T18:07:34.9664840Z   % Total    % Received % Xferd  Average Speed  Time    Time    Time   Current
2026-04-24T18:07:34.9699490Z                                  Dload  Upload  Total   Spent   Left   Speed
2026-04-24T18:07:34.9726800Z 
2026-04-24T18:07:34.9730180Z   0      0   0      0   0      0      0      0                              0curl: (6) Could not resolve host: binario.caixa
2026-04-24T18:07:34.9734120Z Warning: Problem : timeout. Will retry in 1 second. 2 retries left.
2026-04-24T18:07:34.9736230Z curl: (6) Could not resolve host: binario.caixa
2026-04-24T18:07:34.9739090Z Warning: Problem : timeout. Will retry in 2 seconds. 1 retry left.
2026-04-24T18:07:34.9743160Z curl: (6) Could not resolve host: binario.caixa
2026-04-24T18:07:34.9747680Z 
2026-04-24T18:07:34.9803760Z ##[error]The process '/usr/local/lib/ruby/gems/3.3.0/bin/pod' failed with exit code 1
2026-04-24T18:07:34.9816860Z ##[error]The 'pod' command failed with error: The process '/usr/local/lib/ruby/gems/3.3.0/bin/pod' failed with exit code 1
2026-04-24T18:07:34.9826880Z ##[section]Finishing: pod install
