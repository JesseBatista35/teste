2026-11-25T20:09:19.5364581Z ##[debug]Evaluating condition for step: 'Build Application'
2026-11-25T20:09:19.5365379Z ##[debug]Evaluating: succeeded()
2026-11-25T20:09:19.5365658Z ##[debug]Evaluating succeeded:
2026-11-25T20:09:19.5366080Z ##[debug]=> True
2026-11-25T20:09:19.5366294Z ##[debug]Result: True
2026-11-25T20:09:19.5366509Z ##[section]Starting: Build Application
2026-11-25T20:09:19.5370068Z ==============================================================================
2026-11-25T20:09:19.5370147Z Task         : Bash
2026-11-25T20:09:19.5370247Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-25T20:09:19.5370313Z Version      : 3.227.0
2026-11-25T20:09:19.5370358Z Author       : Microsoft Corporation
2026-11-25T20:09:19.5370551Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-25T20:09:19.5370626Z ==============================================================================
2026-11-25T20:09:19.6057783Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-11-25T20:09:19.6725798Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-11-25T20:09:19.6732171Z ##[debug]loading inputs and endpoints
2026-11-25T20:09:19.6737877Z ##[debug]loading INPUT_TARGETTYPE
2026-11-25T20:09:19.6744939Z ##[debug]loading INPUT_FILEPATH
2026-11-25T20:09:19.6746133Z ##[debug]loading INPUT_SCRIPT
2026-11-25T20:09:19.6746803Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-11-25T20:09:19.6747442Z ##[debug]loading INPUT_FAILONSTDERR
2026-11-25T20:09:19.6748145Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-11-25T20:09:19.6748758Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-11-25T20:09:19.6750725Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-11-25T20:09:19.6753615Z ##[debug]loading SECRET_FORTIFY_TOKEN
2026-11-25T20:09:19.6754857Z ##[debug]loading SECRET_SCANCENTRAL_CLIENTTOKEN
2026-11-25T20:09:19.6756207Z ##[debug]loading SECRET_FORTIFY_PASS
2026-11-25T20:09:19.6758123Z ##[debug]loading SECRET_AZPAT
2026-11-25T20:09:19.6759746Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-11-25T20:09:19.6761335Z ##[debug]loading SECRET_ANSIBLE_VAULT
2026-11-25T20:09:19.6761615Z ##[debug]loading SECRET_FORTIFY_CLIENT_AUTH_TOKEN
2026-11-25T20:09:19.6762263Z ##[debug]loading SECRET_FORTIFY_CI_TOKEN
2026-11-25T20:09:19.6762819Z ##[debug]loading SECRET_KEYSTORE_PWD
2026-11-25T20:09:19.6763390Z ##[debug]loading SECRET_FORTIFY_UPTOKEN
2026-11-25T20:09:19.6763930Z ##[debug]loading SECRET_GITHUB_PAT
2026-11-25T20:09:19.6764451Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-11-25T20:09:19.6765846Z ##[debug]loading SECRET_FORTIFY_REGISTRY_PASSWORD
2026-11-25T20:09:19.6766348Z ##[debug]loading SECRET_SONAR_PASSWORD
2026-11-25T20:09:19.6766953Z ##[debug]loading SECRET_NEXUS_INTERNO_PASS
2026-11-25T20:09:19.6767485Z ##[debug]loading SECRET_SCANCENTRAL_SSCCITOKEN
2026-11-25T20:09:19.6768604Z ##[debug]loaded 24
2026-11-25T20:09:19.6771810Z ##[debug]Agent.ProxyUrl=undefined
2026-11-25T20:09:19.6772192Z ##[debug]Agent.CAInfo=undefined
2026-11-25T20:09:19.6772485Z ##[debug]Agent.ClientCert=undefined
2026-11-25T20:09:19.6772776Z ##[debug]Agent.SkipCertValidation=True
2026-11-25T20:09:19.6785795Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-11-25T20:09:19.6787939Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-11-25T20:09:19.6788313Z ##[debug]system.culture=en-US
2026-11-25T20:09:19.6796684Z ##[debug]failOnStderr=false
2026-11-25T20:09:19.6797197Z ##[debug]workingDirectory=/opt/ads-agent/_work/57/s
2026-11-25T20:09:19.6797548Z ##[debug]check path : /opt/ads-agent/_work/57/s
2026-11-25T20:09:19.6798067Z ##[debug]targetType=inline
2026-11-25T20:09:19.6798348Z ##[debug]bashEnvValue=undefined
2026-11-25T20:09:19.6798898Z ##[debug]script=export HOME=/tmp/firefox-home3    
mkdir -p $HOME

cd /opt/ads-agent/_work/57/s/
echo "ng build --configuration production --build-optimizer --aot --output-path=dist"
echo "<----ANGULAR---->"
npx ng version
ng build --configuration production --build-optimizer --aot --output-path=dist
2026-11-25T20:09:19.6807130Z Generating script.
2026-11-25T20:09:19.6809067Z ##[debug]which 'bash'
2026-11-25T20:09:19.6816595Z ##[debug]found: '/usr/bin/bash'
2026-11-25T20:09:19.6817006Z ##[debug]Agent.Version=3.236.1
2026-11-25T20:09:19.6817486Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-11-25T20:09:19.6818091Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-11-25T20:09:19.6819514Z ========================== Starting Command Output ===========================
2026-11-25T20:09:19.6820555Z ##[debug]which '/usr/bin/bash'
2026-11-25T20:09:19.6822115Z ##[debug]found: '/usr/bin/bash'
2026-11-25T20:09:19.6822691Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/ff34ac27-a32d-495f-a758-7e3b379ddd3e.sh
2026-11-25T20:09:19.6824932Z ##[debug]exec tool: /usr/bin/bash
2026-11-25T20:09:19.6825330Z ##[debug]arguments:
2026-11-25T20:09:19.6825796Z ##[debug]   /opt/ads-agent/_work/_temp/ff34ac27-a32d-495f-a758-7e3b379ddd3e.sh
2026-11-25T20:09:19.6826814Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/ff34ac27-a32d-495f-a758-7e3b379ddd3e.sh
2026-11-25T20:09:19.6892973Z ng build --configuration production --build-optimizer --aot --output-path=dist
2026-11-25T20:09:19.6893148Z <----ANGULAR---->
2026-11-25T20:09:20.3265473Z 
2026-11-25T20:09:20.3266026Z      _                      _                 ____ _     ___
2026-11-25T20:09:20.3266307Z     / \   _ __   __ _ _   _| | __ _ _ __     / ___| |   |_ _|
2026-11-25T20:09:20.3266770Z    / △ \ | '_ \ / _` | | | | |/ _` | '__|   | |   | |    | |
2026-11-25T20:09:20.3266893Z   / ___ \| | | | (_| | |_| | | (_| | |      | |___| |___ | |
2026-11-25T20:09:20.3267050Z  /_/   \_\_| |_|\__, |\__,_|_|\__,_|_|       \____|_____|___|
2026-11-25T20:09:20.3267194Z                 |___/
2026-11-25T20:09:20.3267319Z     
2026-11-25T20:09:20.3267357Z 
2026-11-25T20:09:20.3267444Z 
2026-11-25T20:09:20.3267567Z Angular CLI: 20.3.26
2026-11-25T20:09:20.3267702Z Node: 22.13.1
2026-11-25T20:09:20.3267833Z Package Manager: npm 10.9.2
2026-11-25T20:09:20.3267987Z OS: linux x64
2026-11-25T20:09:20.3268109Z     
2026-11-25T20:09:20.3268181Z 
2026-11-25T20:09:20.3268272Z Angular: 20.3.21
2026-11-25T20:09:20.3268477Z ... common, compiler, compiler-cli, core, forms
2026-11-25T20:09:20.3268707Z ... platform-browser, platform-browser-dynamic, router
2026-11-25T20:09:20.3268815Z 
2026-11-25T20:09:20.3268913Z Package                         Version
2026-11-25T20:09:20.3269111Z ---------------------------------------
2026-11-25T20:09:20.3269315Z @angular-devkit/architect       0.2003.26
2026-11-25T20:09:20.3269524Z @angular-devkit/build-angular   20.3.26
2026-11-25T20:09:20.3269709Z @angular-devkit/core            20.3.26
2026-11-25T20:09:20.3269902Z @angular-devkit/schematics      20.3.26
2026-11-25T20:09:20.3270048Z @angular/build                  20.3.26
2026-11-25T20:09:20.3270195Z @angular/cdk                    20.2.14
2026-11-25T20:09:20.3270326Z @angular/cli                    20.3.26
2026-11-25T20:09:20.3270532Z @schematics/angular             20.3.26
2026-11-25T20:09:20.3270696Z ng-packagr                      20.3.2
2026-11-25T20:09:20.3270836Z rxjs                            7.8.2
2026-11-25T20:09:20.3270986Z typescript                      5.9.3
2026-11-25T20:09:20.3271342Z zone.js                         0.15.1
2026-11-25T20:09:21.5098667Z Error: Unknown arguments: build-optimizer, aot, output-path
2026-11-25T20:09:21.5160371Z ##[debug]Exit code 1 received from tool '/usr/bin/bash'
2026-11-25T20:09:21.5163346Z ##[debug]STDIO streams have closed for tool '/usr/bin/bash'
2026-11-25T20:09:21.5195147Z ##[error]Bash exited with code '1'.
2026-11-25T20:09:21.5200084Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '1'.
2026-11-25T20:09:21.5200803Z ##[debug]task result: Failed
2026-11-25T20:09:21.5201861Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-11-25T20:09:21.5205012Z ##[section]Finishing: Build Application
