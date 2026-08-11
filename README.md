2026-08-11T18:57:11.3515156Z ##[debug]Evaluating condition for step: 'Android - Firebase Distribution App'
2026-08-11T18:57:11.3516308Z ##[debug]Evaluating: succeeded()
2026-08-11T18:57:11.3516616Z ##[debug]Evaluating succeeded:
2026-08-11T18:57:11.3517211Z ##[debug]=> True
2026-08-11T18:57:11.3517563Z ##[debug]Result: True
2026-08-11T18:57:11.3517981Z ##[section]Starting: Android - Firebase Distribution App
2026-08-11T18:57:11.3537524Z ==============================================================================
2026-08-11T18:57:11.3537743Z Task         : Bash
2026-08-11T18:57:11.3537999Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-11T18:57:11.3538228Z Version      : 3.227.0
2026-08-11T18:57:11.3538427Z Author       : Microsoft Corporation
2026-08-11T18:57:11.3538652Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-11T18:57:11.3538899Z ==============================================================================
2026-08-11T18:57:11.3582118Z ##[debug]Using node path: /opt/ferramentas/agent-tfs/agent-mobile-linux-proxy-novo/externals/node10/bin/node
2026-08-11T18:57:11.4649634Z ##[debug]agent.TempDirectory=/opt/ferramentas/agent-tfs/agent-mobile-linux-proxy-novo/work_ads/_temp
2026-08-11T18:57:11.4666328Z ##[debug]loading inputs and endpoints
2026-08-11T18:57:11.4671694Z ##[debug]loading INPUT_TARGETTYPE
2026-08-11T18:57:11.4687398Z ##[debug]loading INPUT_FILEPATH
2026-08-11T18:57:11.4688973Z ##[debug]loading INPUT_SCRIPT
2026-08-11T18:57:11.4697030Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-08-11T18:57:11.4714150Z ##[debug]loading INPUT_FAILONSTDERR
2026-08-11T18:57:11.4715614Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-08-11T18:57:11.4716188Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-08-11T18:57:11.4716765Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-08-11T18:57:11.4746059Z ##[debug]loading SECRET_FORTIFY_PASS
2026-08-11T18:57:11.4749533Z ##[debug]loading SECRET_FIREBASE_TOKEN
2026-08-11T18:57:11.4755175Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-08-11T18:57:11.4756003Z ##[debug]loading SECRET_GITTOKEN
2026-08-11T18:57:11.4756531Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-08-11T18:57:11.4757030Z ##[debug]loading SECRET_TOKEN_CRQ
2026-08-11T18:57:11.4757527Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-08-11T18:57:11.4758017Z ##[debug]loading SECRET_KEYSTOREPASS
2026-08-11T18:57:11.4758507Z ##[debug]loading SECRET_AZPAT
2026-08-11T18:57:11.4758992Z ##[debug]loading SECRET_APIJSONGOOGLE
2026-08-11T18:57:11.4759475Z ##[debug]loading SECRET_MFPPASSWORD
2026-08-11T18:57:11.4759940Z ##[debug]loaded 19
2026-08-11T18:57:11.4760410Z ##[debug]Agent.ProxyUrl=undefined
2026-08-11T18:57:11.4760897Z ##[debug]Agent.CAInfo=undefined
2026-08-11T18:57:11.4810597Z ##[debug]Agent.ClientCert=undefined
2026-08-11T18:57:11.4811416Z ##[debug]Agent.SkipCertValidation=True
2026-08-11T18:57:11.4812814Z ##[debug]check path : /opt/ferramentas/agent-tfs/agent-mobile-linux-proxy-novo/work_ads/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-08-11T18:57:11.4813917Z ##[debug]adding resource file: /opt/ferramentas/agent-tfs/agent-mobile-linux-proxy-novo/work_ads/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-08-11T18:57:11.4814809Z ##[debug]system.culture=en-US
2026-08-11T18:57:11.4815485Z ##[debug]failOnStderr=false
2026-08-11T18:57:11.4816301Z ##[debug]workingDirectory=/opt/ferramentas/agent-tfs/agent-mobile-linux-proxy-novo/work_ads/r1/a
2026-08-11T18:57:11.4817135Z ##[debug]check path : /opt/ferramentas/agent-tfs/agent-mobile-linux-proxy-novo/work_ads/r1/a
2026-08-11T18:57:11.4817896Z ##[debug]targetType=inline
2026-08-11T18:57:11.4818568Z ##[debug]bashEnvValue=undefined
2026-08-11T18:57:11.4819864Z ##[debug]script=export App=habitacao-5.12.0-Dev.512762.apk

cd /opt/temp/habitacao/app-5.12.0.512762


firebase --debug appdistribution:distribute ${App} \
--app 1:978309264263:android:fb2ea54ff4fdfdc1b95922 \
--groups "teste-de-qualidade" \
--release-notes "5.12.0-Dev.512762-Nativo hu contatos seguradoras"  \
--token ***
2026-08-11T18:57:11.4820974Z Generating script.
2026-08-11T18:57:11.4821860Z ##[debug]which 'bash'
2026-08-11T18:57:11.4843685Z ##[debug]found: '/bin/bash'
2026-08-11T18:57:11.4844361Z ##[debug]Agent.Version=2.182.1
2026-08-11T18:57:11.4845165Z ##[debug]agent.tempDirectory=/opt/ferramentas/agent-tfs/agent-mobile-linux-proxy-novo/work_ads/_temp
2026-08-11T18:57:11.4845902Z ##[debug]check path : /opt/ferramentas/agent-tfs/agent-mobile-linux-proxy-novo/work_ads/_temp
2026-08-11T18:57:11.4846427Z ========================== Starting Command Output ===========================
2026-08-11T18:57:11.4846995Z ##[debug]which '/bin/bash'
2026-08-11T18:57:11.4847887Z ##[debug]found: '/bin/bash'
2026-08-11T18:57:11.4848753Z ##[debug]/bin/bash arg: /opt/ferramentas/agent-tfs/agent-mobile-linux-proxy-novo/work_ads/_temp/5d23d952-6030-4b2f-9ca7-47a7f1a49d10.sh
2026-08-11T18:57:11.4849473Z ##[debug]exec tool: /bin/bash
2026-08-11T18:57:11.4850019Z ##[debug]arguments:
2026-08-11T18:57:11.4850833Z ##[debug]   /opt/ferramentas/agent-tfs/agent-mobile-linux-proxy-novo/work_ads/_temp/5d23d952-6030-4b2f-9ca7-47a7f1a49d10.sh
2026-08-11T18:57:11.4851866Z [command]/bin/bash /opt/ferramentas/agent-tfs/agent-mobile-linux-proxy-novo/work_ads/_temp/5d23d952-6030-4b2f-9ca7-47a7f1a49d10.sh
2026-08-11T18:57:12.6836491Z [2026-08-11T18:57:12.680Z] > command requires scopes: ["email","openid","https://www.googleapis.com/auth/cloudplatformprojects.readonly","https://www.googleapis.com/auth/firebase","https://www.googleapis.com/auth/cloud-platform"]
2026-08-11T18:57:12.6839677Z [2026-08-11T18:57:12.680Z] > authorizing via --token option
2026-08-11T18:57:12.6897665Z [2026-08-11T18:57:12.684Z] > refreshing access token with scopes: ["email","https://www.googleapis.com/auth/cloud-platform","https://www.googleapis.com/auth/cloudplatformprojects.readonly","https://www.googleapis.com/auth/firebase","openid"]
2026-08-11T18:57:12.6923722Z [2026-08-11T18:57:12.684Z] >>> HTTP REQUEST POST https://www.googleapis.com/oauth2/v3/token  
2026-08-11T18:57:12.6925385Z  <request body omitted>
2026-08-11T18:57:12.9376538Z [2026-08-11T18:57:12.933Z] <<< HTTP RESPONSE 200 {"date":"Tue, 11 Aug 2026 18:57:12 GMT","pragma":"no-cache","expires":"Mon, 01 Jan 1990 00:00:00 GMT","cache-control":"no-cache, no-store, max-age=0, must-revalidate","content-type":"application/json; charset=utf-8","vary":"X-Origin, Referer, Origin,Accept-Encoding","server":"scaffolding on HTTPServer2","x-xss-protection":"0","x-frame-options":"SAMEORIGIN","x-content-type-options":"nosniff","alt-svc":"h3=\":443\"; ma=2592000,h3-29=\":443\"; ma=2592000","accept-ranges":"none","transfer-encoding":"chunked"}
2026-08-11T18:57:12.9398521Z [2026-08-11T18:57:12.934Z] >>> HTTP REQUEST GET https://firebaseappdistribution.googleapis.com/v1alpha/apps/1:978309264263:android:fb2ea54ff4fdfdc1b95922?appView=BASIC  
2026-08-11T18:57:12.9403154Z  
2026-08-11T18:57:14.2799900Z [2026-08-11T18:57:14.278Z] <<< HTTP RESPONSE 200 {"content-type":"application/json; charset=UTF-8","vary":"X-Origin, Referer, Origin,Accept-Encoding","date":"Tue, 11 Aug 2026 18:57:14 GMT","server":"ESF","x-xss-protection":"0","x-frame-options":"SAMEORIGIN","x-content-type-options":"nosniff","alt-svc":"h3=\":443\"; ma=2592000,h3-29=\":443\"; ma=2592000","accept-ranges":"none","transfer-encoding":"chunked"}
2026-08-11T18:57:14.5055785Z [2026-08-11T18:57:14.494Z] >>> HTTP REQUEST GET https://firebaseappdistribution.googleapis.com/v1alpha/apps/1:978309264263:android:fb2ea54ff4fdfdc1b95922/upload_status/projects%2F978309264263%2Fapps%2F1%3A978309264263%3Aandroid%3Afb2ea54ff4fdfdc1b95922%2Freleases%2F-%2Fbinaries%2Ff0063e7ec9a80f3f3fdc0693f7c14430f801ed19c8fa166db322a811c1623f87  
2026-08-11T18:57:14.5057337Z  
2026-08-11T18:57:15.0323981Z [2026-08-11T18:57:15.025Z] <<< HTTP RESPONSE 200 {"content-type":"application/json; charset=UTF-8","vary":"X-Origin, Referer, Origin,Accept-Encoding","date":"Tue, 11 Aug 2026 18:57:14 GMT","server":"ESF","x-xss-protection":"0","x-frame-options":"SAMEORIGIN","x-content-type-options":"nosniff","alt-svc":"h3=\":443\"; ma=2592000,h3-29=\":443\"; ma=2592000","accept-ranges":"none","transfer-encoding":"chunked"}
2026-08-11T18:57:15.0335197Z i  uploading distribution... 
2026-08-11T18:57:15.0343019Z [2026-08-11T18:57:15.026Z] >>> HTTP REQUEST POST https://firebaseappdistribution.googleapis.com/app-binary-uploads?app_id=1:978309264263:android:fb2ea54ff4fdfdc1b95922  
2026-08-11T18:57:15.0345225Z  {"_readableState":{"objectMode":false,"highWaterMark":65536,"buffer":{"head":null,"tail":null,"length":0},"length":0,"pipes":null,"pipesCount":0,"flowing":null,"ended":false,"endEmitted":false,"reading":false,"sync":true,"needReadable":false,"emittedReadable":false,"readableListening":false,"resumeScheduled":false,"emitClose":false,"destroyed":false,"defaultEncoding":"utf8","awaitDrain":0,"readingMore":false,"decoder":null,"encoding":null},"readable":true,"domain":null,"_events":{},"_eventsCount":1,"path":"habitacao-5.12.0-Dev.512762.apk","fd":null,"flags":"r","mode":438,"end":null,"autoClose":true,"bytesRead":0,"closed":false}
2026-08-11T18:57:25.0294742Z [2026-08-11T18:57:25.027Z] <<< HTTP RESPONSE 500 {"x-guploader-uploadid":"AKhXX7LdpnIC7vt9ziTpjexIxALCupnGpNbivR8CbenJv_5M9RxUfZ_5x3IoNPUop-kI8Fw","content-length":"0","date":"Tue, 11 Aug 2026 18:57:24 GMT","server":"UploadServer","content-type":"text/html; charset=UTF-8","alt-svc":"h3=\":443\"; ma=2592000,h3-29=\":443\"; ma=2592000"}
2026-08-11T18:57:25.0312671Z [2026-08-11T18:57:25.028Z] <<< HTTP RESPONSE BODY 
2026-08-11T18:57:25.0315610Z 
2026-08-11T18:57:25.0321544Z Error: failed to upload distribution. HTTP Error: 500, Unknown Error
2026-08-11T18:57:25.3025880Z ##[debug]Exit code 1 received from tool '/bin/bash'
2026-08-11T18:57:25.3026844Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-08-11T18:57:25.3088805Z ##[error]Bash exited with code '1'.
2026-08-11T18:57:25.3098847Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '1'.
2026-08-11T18:57:25.3100284Z ##[debug]task result: Failed
2026-08-11T18:57:25.3102178Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-08-11T18:57:25.3104974Z ##[section]Finishing: Android - Firebase Distribution App
