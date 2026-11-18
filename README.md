<img width="1543" height="843" alt="image" src="https://github.com/user-attachments/assets/a7ca01f0-5ff7-43c7-b605-be37ad9d36a8" />




log de 05 11




2026-11-05T13:11:43.2787591Z ##[section]Starting: Agent job
2026-11-05T13:11:44.1027601Z ##[section]Starting: Initialize job
2026-11-05T13:11:44.1029857Z Agent name: 'cbrsvaprlx214'
2026-11-05T13:11:44.1030110Z Agent machine name: 'cbrsvaprlx214'
2026-11-05T13:11:44.1030231Z Current agent version: '3.225.2'
2026-11-05T13:11:44.1045335Z Agent running as: 'sadscp01'
2026-11-05T13:11:44.1053392Z Prepare release directory.
2026-11-05T13:11:44.1060451Z ReleaseId=550978, TeamProjectId=98fe0311-ffd2-418a-9d0d-507043380abd, ReleaseDefinitionName=SIGAF
2026-11-05T13:11:44.1100538Z Release folder: /opt/ads-agent/_work/r251/a
2026-11-05T13:11:44.1176208Z Environment variables available are below.  Note that these environment variables can be referred to in the task (in the ReleaseDefinition) by replacing "_" with "." e.g. AGENT_NAME environment variable can be referenced using Agent.Name in the ReleaseDefinition: 
				[AGENT_ACCEPTTEEEULA] --> [True]
				[AGENT_CLOUDID] --> []
				[AGENT_DISABLELOGPLUGIN_TESTFILEPUBLISHERPLUGIN] --> [true]
				[AGENT_DISABLELOGPLUGIN_TESTRESULTLOGPLUGIN] --> [true]
				[AGENT_HOMEDIRECTORY] --> [/opt/ads-agent]
				[AGENT_ID] --> [369]
				[AGENT_ISSELFHOSTED] --> [1]
				[AGENT_JOBNAME] --> [Agent job]
				[AGENT_MACHINENAME] --> [cbrsvaprlx214]
				[AGENT_NAME] --> [cbrsvaprlx214]
				[AGENT_OS] --> [Linux]
				[AGENT_OSARCHITECTURE] --> [X64]
				[AGENT_READONLYVARIABLES] --> [true]
				[AGENT_RELEASEDIRECTORY] --> [/opt/ads-agent/_work/r251/a]
				[AGENT_RETAINDEFAULTENCODING] --> [false]
				[AGENT_ROOTDIRECTORY] --> [/opt/ads-agent/_work]
				[AGENT_SKIPCERTVALIDATION] --> [True]
				[AGENT_TASKRESTRICTIONSENFORCEMENTMODE] --> [Enabled]
				[AGENT_TEMPDIRECTORY] --> [/opt/ads-agent/_work/_temp]
				[AGENT_TOOLSDIRECTORY] --> [/opt/ads-agent/_work/_tool]
				[AGENT_USEWORKSPACEID] --> [true]
				[AGENT_VERSION] --> [3.225.2]
				[AGENT_WORKFOLDER] --> [/opt/ads-agent/_work]
				[AZURE_HTTP_USER_AGENT] --> [TFS_7b4c9d5c-b041-4798-8dcb-fb11786a173b_Release__550978_2560757_1]
				[AZUSER] --> [s736639]
				[BT_API_URL] --> [https://sicsn.caixa/BeyondTrust/api/public/v3]
				[BUILD_BUILDID] --> [869772]
				[BUILD_BUILDNUMBER] --> [2.24.0.9]
				[BUILD_BUILDURI] --> [vstfs:///Build/Build/869772]
				[BUILD_DEFINITIONID] --> [2300]
				[BUILD_DEFINITIONNAME] --> [SIGAF]
				[BUILD_PROJECTID] --> [98fe0311-ffd2-418a-9d0d-507043380abd]
				[BUILD_PROJECTNAME] --> [Caixa]
				[BUILD_REPOSITORY_ID] --> [6b76b338-84ed-466b-aa24-8c527a952cfd]
				[BUILD_REPOSITORY_NAME] --> [SIGAF]
				[BUILD_REPOSITORY_PROVIDER] --> [TfsGit]
				[BUILD_REQUESTEDFOR] --> [Cauan Henrique Cunha Mendonca]
				[BUILD_REQUESTEDFORID] --> [76e9e2a6-78b5-4965-b72d-7e53e3cd415b]
				[BUILD_SOURCEBRANCH] --> [refs/tags/2.24.0.9]
				[BUILD_SOURCEBRANCHNAME] --> [2.24.0.9]
				[BUILD_SOURCEVERSION] --> [1544b7ed665e8c7df2dd528e02ae8f498df52397]
				[BUILD_TYPE] --> [Build]
				[FORTIFY_API] --> [https://novocodigoseguro.caixa/ssc/api/v1]
				[FORTIFY_USER] --> [admin]
				[GIT_TERMINAL_PROMPT] --> [0]
				[IP_SERVER] --> [10.116.24.150]
				[MSDEPLOY_HTTP_USER_AGENT] --> [TFS_7b4c9d5c-b041-4798-8dcb-fb11786a173b_Release__550978_2560757_1]
				[OKD_KAFKA] --> [api.kafka-nprd.caixa:6443]
				[PACKAGE_NAME] --> [sigaf-ear.ear]
				[RELEASE_ARTIFACTS__SIGAF_BUILDID] --> [869772]
				[RELEASE_ARTIFACTS__SIGAF_BUILDNUMBER] --> [2.24.0.9]
				[RELEASE_ARTIFACTS__SIGAF_BUILDURI] --> [vstfs:///Build/Build/869772]
				[RELEASE_ARTIFACTS__SIGAF_DEFINITIONID] --> [2300]
				[RELEASE_ARTIFACTS__SIGAF_DEFINITIONNAME] --> [SIGAF]
				[RELEASE_ARTIFACTS__SIGAF_PROJECTID] --> [98fe0311-ffd2-418a-9d0d-507043380abd]
				[RELEASE_ARTIFACTS__SIGAF_PROJECTNAME] --> [Caixa]
				[RELEASE_ARTIFACTS__SIGAF_REPOSITORY_ID] --> [6b76b338-84ed-466b-aa24-8c527a952cfd]
				[RELEASE_ARTIFACTS__SIGAF_REPOSITORY_NAME] --> [SIGAF]
				[RELEASE_ARTIFACTS__SIGAF_REPOSITORY_PROVIDER] --> [TfsGit]
				[RELEASE_ARTIFACTS__SIGAF_REQUESTEDFOR] --> [Cauan Henrique Cunha Mendonca]
				[RELEASE_ARTIFACTS__SIGAF_REQUESTEDFORID] --> [76e9e2a6-78b5-4965-b72d-7e53e3cd415b]
				[RELEASE_ARTIFACTS__SIGAF_SOURCEBRANCH] --> [refs/tags/2.24.0.9]
				[RELEASE_ARTIFACTS__SIGAF_SOURCEBRANCHNAME] --> [2.24.0.9]
				[RELEASE_ARTIFACTS__SIGAF_SOURCEVERSION] --> [1544b7ed665e8c7df2dd528e02ae8f498df52397]
				[RELEASE_ARTIFACTS__SIGAF_TYPE] --> [Build]
				[RELEASE_ATTEMPTNUMBER] --> [1]
				[RELEASE_DEFINITIONENVIRONMENTID] --> [10186]
				[RELEASE_DEFINITIONID] --> [2617]
				[RELEASE_DEFINITIONNAME] --> [SIGAF]
				[RELEASE_DEPLOYMENT_REQUESTEDFOR] --> [Cauan Henrique Cunha Mendonca]
				[RELEASE_DEPLOYMENT_REQUESTEDFOREMAIL] --> [f793002@corp.caixa.gov.br]
				[RELEASE_DEPLOYMENT_REQUESTEDFORID] --> [76e9e2a6-78b5-4965-b72d-7e53e3cd415b]
				[RELEASE_DEPLOYMENT_STARTTIME] --> [2026-11-05 13:11:38Z]
				[RELEASE_DEPLOYMENTID] --> [864646]
				[RELEASE_DEPLOYPHASEID] --> [850763]
				[RELEASE_ENVIRONMENTID] --> [2560757]
				[RELEASE_ENVIRONMENTNAME] --> [EC TQS]
				[RELEASE_ENVIRONMENTS_EC_DES_STATUS] --> [InProgress]
				[RELEASE_ENVIRONMENTS_EC_TQS_STATUS] --> [InProgress]
				[RELEASE_ENVIRONMENTURI] --> [vstfs:///ReleaseManagement/Environment/2560757]
				[RELEASE_PRIMARYARTIFACTSOURCEALIAS] --> [_sigaf]
				[RELEASE_REASON] --> [Manual]
				[RELEASE_RELEASEDESCRIPTION] --> []
				[RELEASE_RELEASEID] --> [550978]
				[RELEASE_RELEASENAME] --> [SIGAF-2.24.0.9(1)]
				[RELEASE_RELEASEURI] --> [vstfs:///ReleaseManagement/Release/550978]
				[RELEASE_RELEASEWEBURL] --> [https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_release?releaseId=550978&_a=release-summary]
				[RELEASE_REQUESTEDFOR] --> [Cauan Henrique Cunha Mendonca]
				[RELEASE_REQUESTEDFOREMAIL] --> [f793002@corp.caixa.gov.br]
				[RELEASE_REQUESTEDFORID] --> [76e9e2a6-78b5-4965-b72d-7e53e3cd415b]
				[RELEASE_SKIPARTIFACTSDOWNLOAD] --> [False]
				[RELEASE_TRIGGERINGARTIFACT_ALIAS] --> []
				[REQUESTEDFORID] --> [76e9e2a6-78b5-4965-b72d-7e53e3cd415b]
				[SERVER_GROUP] --> [sigaf]
				[SYSTEM] --> [release]
				[SYSTEM_ARTIFACTSDIRECTORY] --> [/opt/ads-agent/_work/r251/a]
				[SYSTEM_COLLECTIONID] --> [7b4c9d5c-b041-4798-8dcb-fb11786a173b]
				[SYSTEM_COLLECTIONURI] --> [https://devops.caixa/projetos/]
				[SYSTEM_CULTURE] --> [en-US]
				[SYSTEM_DEFAULTWORKINGDIRECTORY] --> [/opt/ads-agent/_work/r251/a]
				[SYSTEM_DEFINITIONID] --> [2617]
				[SYSTEM_DEFINITIONNAME] --> [SIGAF]
				[SYSTEM_ENABLEACCESSTOKEN] --> [False]
				[SYSTEM_HOSTTYPE] --> [release]
				[SYSTEM_ISDOCKERCONTAINER] --> [0]
				[SYSTEM_ISSCHEDULED] --> [False]
				[SYSTEM_JOBATTEMPT] --> [1]
				[SYSTEM_JOBDISPLAYNAME] --> [Agent job]
				[SYSTEM_JOBID] --> [2be754c7-b9ca-55e0-964c-afcaba8e4e91]
				[SYSTEM_JOBIDENTIFIER] --> [Stage_98fe0311ffd2418a9d0d507043380abd_10186_1.Phase_1.__default]
				[SYSTEM_JOBNAME] --> [__default]
				[SYSTEM_JOBPARALLELISMTAG] --> [Private]
				[SYSTEM_JOBPOSITIONINPHASE] --> [1]
				[SYSTEM_JOBTIMEOUT] --> [0]
				[SYSTEM_PHASEATTEMPT] --> [1]
				[SYSTEM_PHASEDISPLAYNAME] --> [Agent job]
				[SYSTEM_PHASEID] --> [3f922215-d3f4-5d01-806c-59293fac9ba9]
				[SYSTEM_PHASENAME] --> [Phase_1]
				[SYSTEM_PIPELINESTARTTIME] --> [2026-11-05 10:11:40-03:00]
				[SYSTEM_PLANID] --> [530bf5fe-92ff-41e0-9130-02bc924aa4e9]
				[SYSTEM_SERVERTYPE] --> [OnPremises]
				[SYSTEM_STAGEATTEMPT] --> [1]
				[SYSTEM_STAGEDISPLAYNAME] --> [EC TQS]
				[SYSTEM_STAGEID] --> [46ece8ce-9d52-542a-3d6a-94ed7faa13f0]
				[SYSTEM_STAGENAME] --> [Stage_98fe0311ffd2418a9d0d507043380abd_10186_1]
				[SYSTEM_TASKDEFINITIONSURI] --> [https://devops.caixa/projetos/]
				[SYSTEM_TEAMFOUNDATIONCOLLECTIONURI] --> [https://devops.caixa/projetos/]
				[SYSTEM_TEAMFOUNDATIONSERVERURI] --> [https://devops.caixa/projetos/]
				[SYSTEM_TEAMPROJECT] --> [Caixa]
				[SYSTEM_TEAMPROJECTID] --> [98fe0311-ffd2-418a-9d0d-507043380abd]
				[SYSTEM_TIMELINEID] --> [530bf5fe-92ff-41e0-9130-02bc924aa4e9]
				[SYSTEM_TOTALJOBSINPHASE] --> [1]
				[SYSTEM_WORKFOLDER] --> [/opt/ads-agent/_work]
				[URL_CRQ] --> [https://infradevops-novoportal-backend-prd.apps.produtos4.caixa/api.php?acao=devopsCaixacriarMudancaPadrao]
				[USERNAME] --> [cedesrj01]
2026-11-05T13:11:44.9229222Z Download all required tasks.
2026-11-05T13:11:44.9448419Z Checking job knob settings.
2026-11-05T13:11:44.9458264Z Finished checking job knob settings.
2026-11-05T13:11:44.9628136Z Start tracking orphan processes.
2026-11-05T13:11:44.9964506Z ##[section]Finishing: Initialize job
2026-11-05T13:11:45.0101469Z ##[section]Async Command Start: DetectDockerContainer
2026-11-05T13:11:45.0101658Z ##[section]Async Command End: DetectDockerContainer
2026-11-05T13:11:45.0102228Z ##[section]Async Command Start: DetectDockerContainer
2026-11-05T13:11:45.0102359Z ##[section]Async Command End: DetectDockerContainer
2026-11-05T13:11:45.0230558Z ##[section]Starting: Download Artifacts
2026-11-05T13:11:45.0291940Z Creating artifacts directory: /opt/ads-agent/_work/r251/a
2026-11-05T13:11:45.0367637Z Created artifacts directory: /opt/ads-agent/_work/r251/a
2026-11-05T13:11:45.0367894Z Downloading artifact
2026-11-05T13:11:45.0376126Z Starting artifacts download...
2026-11-05T13:11:45.0386275Z Downloading linked artifact _sigaf of type Build...
2026-11-05T13:11:45.0404319Z Ensuring artifact folder /opt/ads-agent/_work/r251/a/_sigaf exists and is clean.
2026-11-05T13:11:45.0450260Z Preparing to get the list of available artifacts from build
2026-11-05T13:11:45.9262821Z ##[warning]No artifacts are available in the build 869772.
2026-11-05T13:11:45.9302558Z Downloaded linked artifact _sigaf
2026-11-05T13:11:45.9302675Z Finished artifacts download
2026-11-05T13:11:45.9330325Z ##[section]Finishing: Download Artifacts
2026-11-05T13:11:45.9347894Z ##[section]Starting: Recuperando URL Pacote Nexus
2026-11-05T13:11:45.9507073Z ==============================================================================
2026-11-05T13:11:45.9507419Z Task         : Bash
2026-11-05T13:11:45.9507541Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-05T13:11:45.9507610Z Version      : 3.227.0
2026-11-05T13:11:45.9507726Z Author       : Microsoft Corporation
2026-11-05T13:11:45.9507863Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-05T13:11:45.9507944Z ==============================================================================
2026-11-05T13:11:47.1996242Z Generating script.
2026-11-05T13:11:47.2007465Z ========================== Starting Command Output ===========================
2026-11-05T13:11:47.2102393Z [command]/bin/bash /opt/ads-agent/_work/_temp/c3dcabd6-ba10-4e4f-9927-df4508614681.sh
2026-11-05T13:11:47.2111136Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-11-05T13:11:47.2111766Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-11-05T13:11:47.2112080Z 
2026-11-05T13:11:47.3867012Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-11-05T13:11:47.3875107Z 100 70267  100 70267    0     0   392k      0 --:--:-- --:--:-- --:--:--  394k
2026-11-05T13:11:47.3879176Z 869772
2026-11-05T13:11:47.3946703Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-11-05T13:11:47.3947122Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-11-05T13:11:47.3947577Z 
2026-11-05T13:11:47.5209912Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-11-05T13:11:47.5210867Z 100  4739  100  4739    0     0  37503      0 --:--:-- --:--:-- --:--:-- 37611
2026-11-05T13:11:47.5229783Z https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_apis/build/builds/869772/logs
2026-11-05T13:11:47.5287082Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-11-05T13:11:47.5287913Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-11-05T13:11:47.5288735Z 
2026-11-05T13:11:47.6436073Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-11-05T13:11:47.6436594Z 100  9614  100  9614    0     0  83591      0 --:--:-- --:--:-- --:--:-- 84333
2026-11-05T13:11:47.6453880Z https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_apis/build/builds/869772/logs
2026-11-05T13:11:47.6515160Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-11-05T13:11:47.6515397Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-11-05T13:11:47.6515466Z 
2026-11-05T13:11:47.7636385Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-11-05T13:11:47.7782421Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-11-05T13:11:47.7783468Z 100    37    0    37    0     0    291      0 --:--:-- --:--:-- --:--:--   291
2026-11-05T13:11:47.7907934Z 
2026-11-05T13:11:47.7908581Z 100   246    0   246    0     0  19714      0 --:--:-- --:--:-- --:--:-- 19714
2026-11-05T13:11:47.8044651Z 
2026-11-05T13:11:47.8045393Z 100   883    0   883    0     0  65300      0 --:--:-- --:--:-- --:--:-- 65300
2026-11-05T13:11:47.8188581Z 
2026-11-05T13:11:47.8189494Z 100 41896    0 41896    0     0  2869k      0 --:--:-- --:--:-- --:--:-- 2869k
2026-11-05T13:11:47.8332644Z 
2026-11-05T13:11:47.8334051Z 100   816    0   816    0     0  57138      0 --:--:-- --:--:-- --:--:-- 57138
2026-11-05T13:11:47.8447408Z 
2026-11-05T13:11:47.8448341Z 100 10127    0 10127    0     0   872k      0 --:--:-- --:--:-- --:--:--  872k
2026-11-05T13:11:47.8561737Z 
2026-11-05T13:11:47.8562262Z 100  1347    0  1347    0     0   116k      0 --:--:-- --:--:-- --:--:--  116k
2026-11-05T13:11:47.8681296Z 
2026-11-05T13:11:47.8682370Z 100    98    0    98    0     0   8299      0 --:--:-- --:--:-- --:--:--  8299
2026-11-05T13:11:47.8793873Z 
2026-11-05T13:11:47.8794369Z 100    98    0    98    0     0   8802      0 --:--:-- --:--:-- --:--:--  8802
2026-11-05T13:11:47.9031569Z 
2026-11-05T13:11:47.9032743Z 100    98    0    98    0     0   4156      0 --:--:-- --:--:-- --:--:--  4156
2026-11-05T13:11:47.9154280Z 
2026-11-05T13:11:47.9154814Z 100    98    0    98    0     0   8079      0 --:--:-- --:--:-- --:--:--  8079
2026-11-05T13:11:47.9272844Z 
2026-11-05T13:11:47.9273258Z 100    98    0    98    0     0   8324      0 --:--:-- --:--:-- --:--:--  8324
2026-11-05T13:11:47.9393206Z 
2026-11-05T13:11:47.9393879Z 100 16480    0 16480    0     0  1349k      0 --:--:-- --:--:-- --:--:-- 1349k
2026-11-05T13:11:47.9535766Z 
2026-11-05T13:11:47.9536634Z 100  4067    0  4067    0     0   281k      0 --:--:-- --:--:-- --:--:--  281k
2026-11-05T13:11:47.9651910Z 
2026-11-05T13:11:47.9652653Z 100 13778    0 13778    0     0  1172k      0 --:--:-- --:--:-- --:--:-- 1172k
2026-11-05T13:11:47.9771762Z 
2026-11-05T13:11:47.9772753Z 100  3442    0  3442    0     0   285k      0 --:--:-- --:--:-- --:--:--  285k
2026-11-05T13:11:47.9886715Z 
2026-11-05T13:11:47.9887624Z 100  1170    0  1170    0     0   102k      0 --:--:-- --:--:-- --:--:--  102k
2026-11-05T13:11:47.9997415Z 
2026-11-05T13:11:47.9998509Z 100  1867    0  1867    0     0   165k      0 --:--:-- --:--:-- --:--:--  165k
2026-11-05T13:11:48.0280246Z 
2026-11-05T13:11:48.0280879Z 100  796k    0  796k    0     0  27.8M      0 --:--:-- --:--:-- --:--:-- 27.8M
2026-11-05T13:11:48.0410747Z 
2026-11-05T13:11:48.0413293Z 100  1192    0  1192    0     0  91054      0 --:--:-- --:--:-- --:--:-- 91054
2026-11-05T13:11:48.0523560Z 
2026-11-05T13:11:48.0524558Z 100  1336    0  1336    0     0   116k      0 --:--:-- --:--:-- --:--:--  116k
2026-11-05T13:11:48.0637124Z 
2026-11-05T13:11:48.0637811Z 100  1030    0  1030    0     0  92318      0 --:--:-- --:--:-- --:--:-- 92318
2026-11-05T13:11:48.0751773Z 
2026-11-05T13:11:48.0752715Z 100  2793    0  2793    0     0   239k      0 --:--:-- --:--:-- --:--:--  239k
2026-11-05T13:11:48.0884729Z 
2026-11-05T13:11:48.0885681Z 100 71797    0 71797    0     0  5371k      0 --:--:-- --:--:-- --:--:-- 5371k
2026-11-05T13:11:48.3120802Z 
2026-11-05T13:11:48.3121917Z 100 9530k    0 9530k    0     0  41.6M      0 --:--:-- --:--:-- --:--:-- 41.6M
2026-11-05T13:11:48.5512273Z 
2026-11-05T13:11:48.5512979Z 100 11.2M    0 11.2M    0     0  46.9M      0 --:--:-- --:--:-- --:--:-- 46.9M
2026-11-05T13:11:48.5667809Z 
2026-11-05T13:11:48.5668599Z 100  2207    0  2207    0     0   138k      0 --:--:-- --:--:-- --:--:--  138k
2026-11-05T13:11:48.5790367Z 
2026-11-05T13:11:48.5791536Z 100  1987    0  1987    0     0   161k      0 --:--:-- --:--:-- --:--:--  161k
2026-11-05T13:11:48.5911173Z 
2026-11-05T13:11:48.5911670Z 100  2543    0  2543    0     0   207k      0 --:--:-- --:--:-- --:--:--  207k
2026-11-05T13:11:48.6033198Z 
2026-11-05T13:11:48.6033704Z 100  1157    0  1157    0     0  95786      0 --:--:-- --:--:-- --:--:-- 95786
2026-11-05T13:11:48.6162554Z 
2026-11-05T13:11:48.6163056Z 100  6212    0  6212    0     0   472k      0 --:--:-- --:--:-- --:--:--  472k
2026-11-05T13:11:48.6279332Z 
2026-11-05T13:11:48.6279993Z 100  3674    0  3674    0     0   311k      0 --:--:-- --:--:-- --:--:--  311k
2026-11-05T13:11:48.6573349Z 
2026-11-05T13:11:48.6574493Z 100  883k    0  883k    0     0  29.5M      0 --:--:-- --:--:-- --:--:-- 29.5M
2026-11-05T13:11:48.6722464Z 
2026-11-05T13:11:48.6723031Z 100  1026    0  1026    0     0  69432      0 --:--:-- --:--:-- --:--:-- 69432
2026-11-05T13:11:48.6855633Z 
2026-11-05T13:11:48.6856928Z 100   987    0   987    0     0  74699      0 --:--:-- --:--:-- --:--:-- 74699
2026-11-05T13:11:48.6978825Z 
2026-11-05T13:11:48.6979510Z 100  1328    0  1328    0     0   107k      0 --:--:-- --:--:-- --:--:--  107k
2026-11-05T13:11:48.7100896Z 
2026-11-05T13:11:48.7101957Z 100   987    0   987    0     0  81935      0 --:--:-- --:--:-- --:--:-- 81935
2026-11-05T13:11:48.7245839Z 
2026-11-05T13:11:48.7246780Z 100 77715    0 77715    0     0  5283k      0 --:--:-- --:--:-- --:--:-- 5283k
2026-11-05T13:11:48.7377984Z 
2026-11-05T13:11:48.7378887Z 100   768    0   768    0     0  58371      0 --:--:-- --:--:-- --:--:-- 58371
2026-11-05T13:11:48.7507198Z 
2026-11-05T13:11:48.7508086Z 100   751    0   751    0     0  59073      0 --:--:-- --:--:-- --:--:-- 59073
2026-11-05T13:11:48.7625394Z 
2026-11-05T13:11:48.7637999Z 100  1024    0  1024    0     0  87919      0 --:--:-- --:--:-- --:--:-- 87919
2026-11-05T13:11:48.7638547Z 100  7359    0  7359    0     0   556k      0 --:--:-- --:--:-- --:--:-- 6186k
2026-11-05T13:11:48.7662633Z http://binario.caixa:8081/repository/releases/br/gov/caixa/sigaf-ear/2.24.0.9/sigaf-ear-2.24.0.9.ear
2026-11-05T13:11:48.7725516Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-11-05T13:11:48.7726707Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-11-05T13:11:48.7726995Z 
2026-11-05T13:11:48.8886608Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-11-05T13:11:48.8886923Z 100  9614  100  9614    0     0  82711      0 --:--:-- --:--:-- --:--:-- 82879
2026-11-05T13:11:48.9012807Z ##[section]Finishing: Recuperando URL Pacote Nexus
2026-11-05T13:11:48.9022555Z ##[section]Starting: Verificando se o pacote existe no Nexus
2026-11-05T13:11:48.9026087Z ==============================================================================
2026-11-05T13:11:48.9026161Z Task         : Bash
2026-11-05T13:11:48.9026201Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-05T13:11:48.9026275Z Version      : 3.227.0
2026-11-05T13:11:48.9026313Z Author       : Microsoft Corporation
2026-11-05T13:11:48.9026358Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-05T13:11:48.9026421Z ==============================================================================
2026-11-05T13:11:49.6675908Z Generating script.
2026-11-05T13:11:49.6687798Z ========================== Starting Command Output ===========================
2026-11-05T13:11:49.6689119Z [command]/bin/bash /opt/ads-agent/_work/_temp/9e225beb-cbb9-490a-aad5-aa2f139d2216.sh
2026-11-05T13:11:49.7136710Z URL retornou status: 200
2026-11-05T13:11:49.7187265Z ##[section]Finishing: Verificando se o pacote existe no Nexus
2026-11-05T13:11:49.7196190Z ##[section]Starting: Recupera Pacote - sigaf-ear.ear
2026-11-05T13:11:49.7199266Z ==============================================================================
2026-11-05T13:11:49.7199338Z Task         : Bash
2026-11-05T13:11:49.7199460Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-05T13:11:49.7199528Z Version      : 3.227.0
2026-11-05T13:11:49.7199566Z Author       : Microsoft Corporation
2026-11-05T13:11:49.7199611Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-05T13:11:49.7199674Z ==============================================================================
2026-11-05T13:11:50.6099352Z Generating script.
2026-11-05T13:11:50.6111002Z ========================== Starting Command Output ===========================
2026-11-05T13:11:50.6126735Z [command]/bin/bash /opt/ads-agent/_work/_temp/eae2ed26-92c0-4517-9bb4-ac029fb0c957.sh
2026-11-05T13:11:50.6180113Z + rm -rf '*'
2026-11-05T13:11:50.6180567Z + mkdir binario
2026-11-05T13:11:50.6195358Z + cd binario
2026-11-05T13:11:50.6195755Z + pwd
2026-11-05T13:11:50.6196103Z + ls
2026-11-05T13:11:50.6197526Z /opt/ads-agent/_work/r251/a/_sigaf/binario
2026-11-05T13:11:50.6213098Z + echo http://binario.caixa:8081/repository/releases/br/gov/caixa/sigaf-ear/2.24.0.9/sigaf-ear-2.24.0.9.ear
2026-11-05T13:11:50.6213964Z + URL_DEPLOY=http://binario.caixa:8081/repository/releases/br/gov/caixa/sigaf-ear/2.24.0.9/sigaf-ear-2.24.0.9.ear
2026-11-05T13:11:50.6214333Z + deploys=(${URL_DEPLOY//,/ })
2026-11-05T13:11:50.6214793Z http://binario.caixa:8081/repository/releases/br/gov/caixa/sigaf-ear/2.24.0.9/sigaf-ear-2.24.0.9.ear
2026-11-05T13:11:50.6215312Z + for deploy in '"${deploys[@]}"'
2026-11-05T13:11:50.6215652Z + deploy_name=sigaf-ear-2.24.0.9.ear
2026-11-05T13:11:50.6216169Z + curl http://binario.caixa:8081/repository/releases/br/gov/caixa/sigaf-ear/2.24.0.9/sigaf-ear-2.24.0.9.ear -o sigaf-ear-2.24.0.9.ear
2026-11-05T13:11:50.6269002Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-11-05T13:11:50.6269260Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-11-05T13:11:50.6269315Z 
2026-11-05T13:11:50.6821282Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-11-05T13:11:50.6822832Z 100 38.6M  100 38.6M    0     0   698M      0 --:--:-- --:--:-- --:--:--  701M
2026-11-05T13:11:50.6829191Z ++ md5sum -b sigaf-ear-2.24.0.9.ear
2026-11-05T13:11:50.7586143Z + HASH_RELEASE='818d85b785d17cdd0b39cd923c6ab328 *sigaf-ear-2.24.0.9.ear'
2026-11-05T13:11:50.7586641Z + HASH_RELEASE=818d85b785d17cdd0b39cd923c6ab328
2026-11-05T13:11:50.7587379Z + echo 818d85b785d17cdd0b39cd923c6ab328
2026-11-05T13:11:50.7587625Z + echo - - - - - - - - - -
2026-11-05T13:11:50.7587778Z + echo sigaf-ear-2.24.0.9.ear
2026-11-05T13:11:50.7587917Z + mv sigaf-ear-2.24.0.9.ear sigaf-ear.ear
2026-11-05T13:11:50.7588065Z 818d85b785d17cdd0b39cd923c6ab328
2026-11-05T13:11:50.7588198Z - - - - - - - - - -
2026-11-05T13:11:50.7588331Z sigaf-ear-2.24.0.9.ear
2026-11-05T13:11:50.7603918Z + ls
2026-11-05T13:11:50.7610998Z sigaf-ear.ear
2026-11-05T13:11:50.7682754Z ##[section]Finishing: Recupera Pacote - sigaf-ear.ear
2026-11-05T13:11:50.7692367Z ##[section]Starting: Reciclagem sigaf
2026-11-05T13:11:50.7695715Z ==============================================================================
2026-11-05T13:11:50.7695801Z Task         : Bash
2026-11-05T13:11:50.7695839Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-05T13:11:50.7695896Z Version      : 3.227.0
2026-11-05T13:11:50.7695933Z Author       : Microsoft Corporation
2026-11-05T13:11:50.7695992Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-05T13:11:50.7696056Z ==============================================================================
2026-11-05T13:11:51.7642274Z Generating script.
2026-11-05T13:11:51.7656915Z ========================== Starting Command Output ===========================
2026-11-05T13:11:51.7666101Z [command]/bin/bash /opt/ads-agent/_work/_temp/435bd8d9-7f5e-4a8c-9fc4-d9d4bfca9dd3.sh
2026-11-05T13:11:51.7724432Z - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
2026-11-05T13:11:51.7727157Z Reciclando 10.116.24.150
2026-11-05T13:11:51.7727798Z - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
2026-11-05T13:11:52.4320009Z {
2026-11-05T13:11:52.4320339Z     "outcome" => "success",
2026-11-05T13:11:52.4320502Z     "result" => undefined,
2026-11-05T13:11:52.4320780Z     "server-groups" => undefined
2026-11-05T13:11:52.4320910Z }
2026-11-05T13:11:52.4487818Z ##[section]Finishing: Reciclagem sigaf
2026-11-05T13:11:52.4498538Z ##[section]Starting: deploy package domain - 10.116.24.150
2026-11-05T13:11:52.4502023Z ==============================================================================
2026-11-05T13:11:52.4502093Z Task         : Bash
2026-11-05T13:11:52.4502130Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-05T13:11:52.4502230Z Version      : 3.227.0
2026-11-05T13:11:52.4502274Z Author       : Microsoft Corporation
2026-11-05T13:11:52.4502319Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-05T13:11:52.4502388Z ==============================================================================
2026-11-05T13:11:53.2015439Z Generating script.
2026-11-05T13:11:53.2029087Z ========================== Starting Command Output ===========================
2026-11-05T13:11:53.2039447Z [command]/bin/bash /opt/ads-agent/_work/_temp/32161af7-c497-4ed5-9997-a5d14f0f3575.sh
2026-11-05T13:11:53.2095723Z - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
2026-11-05T13:11:53.2096194Z Deploy será feito em 10.116.24.150
2026-11-05T13:11:53.2097050Z - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
2026-11-05T13:11:53.8099612Z #1 undeploy sigaf-ear.ear  --server-groups=sigaf
2026-11-05T13:11:53.8810435Z #1 deploy /opt/ads-agent/_work/r251/a/_sigaf/binario/sigaf-ear.ear --server-groups=sigaf
2026-11-05T13:11:58.2217202Z ##[section]Finishing: deploy package domain - 10.116.24.150
2026-11-05T13:11:58.2226006Z ##[section]Starting: Checagem de status do deploy
2026-11-05T13:11:58.2229293Z ==============================================================================
2026-11-05T13:11:58.2229372Z Task         : Bash
2026-11-05T13:11:58.2229410Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-05T13:11:58.2229466Z Version      : 3.227.0
2026-11-05T13:11:58.2229505Z Author       : Microsoft Corporation
2026-11-05T13:11:58.2229559Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-05T13:11:58.2229622Z ==============================================================================
2026-11-05T13:11:58.9687627Z Generating script.
2026-11-05T13:11:58.9699766Z ========================== Starting Command Output ===========================
2026-11-05T13:11:58.9707398Z [command]/bin/bash /opt/ads-agent/_work/_temp/07517a0e-3169-4b35-86ab-1291c8f51433.sh
2026-11-05T13:11:58.9772283Z - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
2026-11-05T13:11:58.9772417Z Checando 10.116.24.150
2026-11-05T13:11:58.9774863Z - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
2026-11-05T13:11:59.5742065Z NAME          RUNTIME-NAME  
2026-11-05T13:11:59.5742348Z sigaf-ear.ear sigaf-ear.ear 
2026-11-05T13:11:59.5742404Z 
2026-11-05T13:11:59.5749160Z SERVER-GROUP STATE     
2026-11-05T13:11:59.5749388Z siamt        not added 
2026-11-05T13:11:59.5749513Z sicrf        not added 
2026-11-05T13:11:59.5749703Z sicrh        not added 
2026-11-05T13:11:59.5749793Z sicse        not added 
2026-11-05T13:11:59.5750079Z sigaf        enabled   
2026-11-05T13:11:59.5750200Z siigf        not added 
2026-11-05T13:11:59.5750288Z siind        not added 
2026-11-05T13:11:59.5750415Z sipar        not added 
2026-11-05T13:11:59.5750493Z sirep        not added 
2026-11-05T13:11:59.5750622Z sitkn        not added 
2026-11-05T13:11:59.5920775Z ##[section]Finishing: Checagem de status do deploy
2026-11-05T13:11:59.5999924Z ##[section]Starting: Finalize Job
2026-11-05T13:11:59.6025132Z Cleaning up task key
2026-11-05T13:11:59.6026011Z Start cleaning up orphan processes.
2026-11-05T13:11:59.6440607Z ##[section]Finishing: Finalize Job
2026-11-05T13:11:59.6493071Z ##[section]Finishing: Agent job






log de 11/11  que o rainier rodou


2026-11-11T14:57:43.6792452Z ##[section]Starting: Agent job
2026-11-11T14:57:44.5040845Z ##[section]Starting: Initialize job
2026-11-11T14:57:44.5042844Z Agent name: 'cbrsvaprlx172'
2026-11-11T14:57:44.5043047Z Agent machine name: 'cbrsvaprlx172'
2026-11-11T14:57:44.5043139Z Current agent version: '3.225.2'
2026-11-11T14:57:44.5055714Z Agent running as: 'sadscp01'
2026-11-11T14:57:44.5062521Z Prepare release directory.
2026-11-11T14:57:44.5066970Z ReleaseId=554042, TeamProjectId=98fe0311-ffd2-418a-9d0d-507043380abd, ReleaseDefinitionName=SIGAF
2026-11-11T14:57:44.5101783Z Release folder: /opt/ads-agent/_work/r510/a
2026-11-11T14:57:44.5175327Z Environment variables available are below.  Note that these environment variables can be referred to in the task (in the ReleaseDefinition) by replacing "_" with "." e.g. AGENT_NAME environment variable can be referenced using Agent.Name in the ReleaseDefinition: 
				[AGENT_ACCEPTTEEEULA] --> [True]
				[AGENT_CLOUDID] --> []
				[AGENT_DISABLELOGPLUGIN_TESTFILEPUBLISHERPLUGIN] --> [true]
				[AGENT_DISABLELOGPLUGIN_TESTRESULTLOGPLUGIN] --> [true]
				[AGENT_HOMEDIRECTORY] --> [/opt/ads-agent]
				[AGENT_ID] --> [368]
				[AGENT_ISSELFHOSTED] --> [1]
				[AGENT_JOBNAME] --> [Agent job]
				[AGENT_MACHINENAME] --> [cbrsvaprlx172]
				[AGENT_NAME] --> [cbrsvaprlx172]
				[AGENT_OS] --> [Linux]
				[AGENT_OSARCHITECTURE] --> [X64]
				[AGENT_READONLYVARIABLES] --> [true]
				[AGENT_RELEASEDIRECTORY] --> [/opt/ads-agent/_work/r510/a]
				[AGENT_RETAINDEFAULTENCODING] --> [false]
				[AGENT_ROOTDIRECTORY] --> [/opt/ads-agent/_work]
				[AGENT_TASKRESTRICTIONSENFORCEMENTMODE] --> [Enabled]
				[AGENT_TEMPDIRECTORY] --> [/opt/ads-agent/_work/_temp]
				[AGENT_TOOLSDIRECTORY] --> [/opt/ads-agent/_work/_tool]
				[AGENT_USEWORKSPACEID] --> [true]
				[AGENT_VERSION] --> [3.225.2]
				[AGENT_WORKFOLDER] --> [/opt/ads-agent/_work]
				[AZURE_HTTP_USER_AGENT] --> [TFS_7b4c9d5c-b041-4798-8dcb-fb11786a173b_Release__554042_2575513_1]
				[AZUSER] --> [s736639]
				[BT_API_URL] --> [https://sicsn.caixa/BeyondTrust/api/public/v3]
				[BUILD_BUILDID] --> [869772]
				[BUILD_BUILDNUMBER] --> [2.24.0.9]
				[BUILD_BUILDURI] --> [vstfs:///Build/Build/869772]
				[BUILD_DEFINITIONID] --> [2300]
				[BUILD_DEFINITIONNAME] --> [SIGAF]
				[BUILD_PROJECTID] --> [98fe0311-ffd2-418a-9d0d-507043380abd]
				[BUILD_PROJECTNAME] --> [Caixa]
				[BUILD_REPOSITORY_ID] --> [6b76b338-84ed-466b-aa24-8c527a952cfd]
				[BUILD_REPOSITORY_NAME] --> [SIGAF]
				[BUILD_REPOSITORY_PROVIDER] --> [TfsGit]
				[BUILD_REQUESTEDFOR] --> [Cauan Henrique Cunha Mendonca]
				[BUILD_REQUESTEDFORID] --> [76e9e2a6-78b5-4965-b72d-7e53e3cd415b]
				[BUILD_SOURCEBRANCH] --> [refs/tags/2.24.0.9]
				[BUILD_SOURCEBRANCHNAME] --> [2.24.0.9]
				[BUILD_SOURCEVERSION] --> [1544b7ed665e8c7df2dd528e02ae8f498df52397]
				[BUILD_TYPE] --> [Build]
				[FORTIFY_API] --> [https://novocodigoseguro.caixa/ssc/api/v1]
				[FORTIFY_USER] --> [admin]
				[GIT_TERMINAL_PROMPT] --> [0]
				[IP_SERVER] --> [10.116.24.150]
				[MSDEPLOY_HTTP_USER_AGENT] --> [TFS_7b4c9d5c-b041-4798-8dcb-fb11786a173b_Release__554042_2575513_1]
				[OKD_KAFKA] --> [api.kafka-nprd.caixa:6443]
				[PACKAGE_NAME] --> [sigaf-ear.ear]
				[RELEASE_ARTIFACTS__SIGAF_BUILDID] --> [869772]
				[RELEASE_ARTIFACTS__SIGAF_BUILDNUMBER] --> [2.24.0.9]
				[RELEASE_ARTIFACTS__SIGAF_BUILDURI] --> [vstfs:///Build/Build/869772]
				[RELEASE_ARTIFACTS__SIGAF_DEFINITIONID] --> [2300]
				[RELEASE_ARTIFACTS__SIGAF_DEFINITIONNAME] --> [SIGAF]
				[RELEASE_ARTIFACTS__SIGAF_PROJECTID] --> [98fe0311-ffd2-418a-9d0d-507043380abd]
				[RELEASE_ARTIFACTS__SIGAF_PROJECTNAME] --> [Caixa]
				[RELEASE_ARTIFACTS__SIGAF_REPOSITORY_ID] --> [6b76b338-84ed-466b-aa24-8c527a952cfd]
				[RELEASE_ARTIFACTS__SIGAF_REPOSITORY_NAME] --> [SIGAF]
				[RELEASE_ARTIFACTS__SIGAF_REPOSITORY_PROVIDER] --> [TfsGit]
				[RELEASE_ARTIFACTS__SIGAF_REQUESTEDFOR] --> [Cauan Henrique Cunha Mendonca]
				[RELEASE_ARTIFACTS__SIGAF_REQUESTEDFORID] --> [76e9e2a6-78b5-4965-b72d-7e53e3cd415b]
				[RELEASE_ARTIFACTS__SIGAF_SOURCEBRANCH] --> [refs/tags/2.24.0.9]
				[RELEASE_ARTIFACTS__SIGAF_SOURCEBRANCHNAME] --> [2.24.0.9]
				[RELEASE_ARTIFACTS__SIGAF_SOURCEVERSION] --> [1544b7ed665e8c7df2dd528e02ae8f498df52397]
				[RELEASE_ARTIFACTS__SIGAF_TYPE] --> [Build]
				[RELEASE_ATTEMPTNUMBER] --> [1]
				[RELEASE_DEFINITIONENVIRONMENTID] --> [10186]
				[RELEASE_DEFINITIONID] --> [2617]
				[RELEASE_DEFINITIONNAME] --> [SIGAF]
				[RELEASE_DEPLOYMENT_REQUESTEDFOR] --> [Rainier Barbosa dos Santos Viana]
				[RELEASE_DEPLOYMENT_REQUESTEDFOREMAIL] --> [p686198@corp.caixa.gov.br]
				[RELEASE_DEPLOYMENT_REQUESTEDFORID] --> [e07d04b2-d681-4313-a8c7-9516f3a49bd1]
				[RELEASE_DEPLOYMENT_STARTTIME] --> [2026-11-11 14:57:38Z]
				[RELEASE_DEPLOYMENTID] --> [869168]
				[RELEASE_DEPLOYPHASEID] --> [855239]
				[RELEASE_ENVIRONMENTID] --> [2575513]
				[RELEASE_ENVIRONMENTNAME] --> [EC TQS]
				[RELEASE_ENVIRONMENTS_EC_DES_STATUS] --> [Succeeded]
				[RELEASE_ENVIRONMENTS_EC_TQS_STATUS] --> [InProgress]
				[RELEASE_ENVIRONMENTURI] --> [vstfs:///ReleaseManagement/Environment/2575513]
				[RELEASE_PRIMARYARTIFACTSOURCEALIAS] --> [_sigaf]
				[RELEASE_REASON] --> [Manual]
				[RELEASE_RELEASEDESCRIPTION] --> []
				[RELEASE_RELEASEID] --> [554042]
				[RELEASE_RELEASENAME] --> [SIGAF-2.24.0.9(2)]
				[RELEASE_RELEASEURI] --> [vstfs:///ReleaseManagement/Release/554042]
				[RELEASE_RELEASEWEBURL] --> [https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_release?releaseId=554042&_a=release-summary]
				[RELEASE_REQUESTEDFOR] --> [Rainier Barbosa dos Santos Viana]
				[RELEASE_REQUESTEDFOREMAIL] --> [p686198@corp.caixa.gov.br]
				[RELEASE_REQUESTEDFORID] --> [e07d04b2-d681-4313-a8c7-9516f3a49bd1]
				[RELEASE_SKIPARTIFACTSDOWNLOAD] --> [False]
				[RELEASE_TRIGGERINGARTIFACT_ALIAS] --> []
				[REQUESTEDFORID] --> [e07d04b2-d681-4313-a8c7-9516f3a49bd1]
				[SERVER_GROUP] --> [sigaf]
				[SYSTEM] --> [release]
				[SYSTEM_ARTIFACTSDIRECTORY] --> [/opt/ads-agent/_work/r510/a]
				[SYSTEM_COLLECTIONID] --> [7b4c9d5c-b041-4798-8dcb-fb11786a173b]
				[SYSTEM_COLLECTIONURI] --> [https://devops.caixa/projetos/]
				[SYSTEM_CULTURE] --> [en-US]
				[SYSTEM_DEFAULTWORKINGDIRECTORY] --> [/opt/ads-agent/_work/r510/a]
				[SYSTEM_DEFINITIONID] --> [2617]
				[SYSTEM_DEFINITIONNAME] --> [SIGAF]
				[SYSTEM_ENABLEACCESSTOKEN] --> [False]
				[SYSTEM_HOSTTYPE] --> [release]
				[SYSTEM_ISDOCKERCONTAINER] --> [0]
				[SYSTEM_ISSCHEDULED] --> [False]
				[SYSTEM_JOBATTEMPT] --> [1]
				[SYSTEM_JOBDISPLAYNAME] --> [Agent job]
				[SYSTEM_JOBID] --> [2be754c7-b9ca-55e0-964c-afcaba8e4e91]
				[SYSTEM_JOBIDENTIFIER] --> [Stage_98fe0311ffd2418a9d0d507043380abd_10186_1.Phase_1.__default]
				[SYSTEM_JOBNAME] --> [__default]
				[SYSTEM_JOBPARALLELISMTAG] --> [Private]
				[SYSTEM_JOBPOSITIONINPHASE] --> [1]
				[SYSTEM_JOBTIMEOUT] --> [0]
				[SYSTEM_PHASEATTEMPT] --> [1]
				[SYSTEM_PHASEDISPLAYNAME] --> [Agent job]
				[SYSTEM_PHASEID] --> [3f922215-d3f4-5d01-806c-59293fac9ba9]
				[SYSTEM_PHASENAME] --> [Phase_1]
				[SYSTEM_PIPELINESTARTTIME] --> [2026-11-11 11:57:40-03:00]
				[SYSTEM_PLANID] --> [a08c32f2-7ff8-4cfe-a36a-00c782cafd4e]
				[SYSTEM_SERVERTYPE] --> [OnPremises]
				[SYSTEM_STAGEATTEMPT] --> [1]
				[SYSTEM_STAGEDISPLAYNAME] --> [EC TQS]
				[SYSTEM_STAGEID] --> [46ece8ce-9d52-542a-3d6a-94ed7faa13f0]
				[SYSTEM_STAGENAME] --> [Stage_98fe0311ffd2418a9d0d507043380abd_10186_1]
				[SYSTEM_TASKDEFINITIONSURI] --> [https://devops.caixa/projetos/]
				[SYSTEM_TEAMFOUNDATIONCOLLECTIONURI] --> [https://devops.caixa/projetos/]
				[SYSTEM_TEAMFOUNDATIONSERVERURI] --> [https://devops.caixa/projetos/]
				[SYSTEM_TEAMPROJECT] --> [Caixa]
				[SYSTEM_TEAMPROJECTID] --> [98fe0311-ffd2-418a-9d0d-507043380abd]
				[SYSTEM_TIMELINEID] --> [a08c32f2-7ff8-4cfe-a36a-00c782cafd4e]
				[SYSTEM_TOTALJOBSINPHASE] --> [1]
				[SYSTEM_WORKFOLDER] --> [/opt/ads-agent/_work]
				[URL_CRQ] --> [https://infradevops-novoportal-backend-prd.apps.produtos4.caixa/api.php?acao=devopsCaixacriarMudancaPadrao]
				[USERNAME] --> [cedesrj01]
2026-11-11T14:57:45.3787305Z Download all required tasks.
2026-11-11T14:57:45.3996881Z Checking job knob settings.
2026-11-11T14:57:45.4006522Z Finished checking job knob settings.
2026-11-11T14:57:45.4166235Z Start tracking orphan processes.
2026-11-11T14:57:45.4477095Z ##[section]Finishing: Initialize job
2026-11-11T14:57:45.4624348Z ##[section]Async Command Start: DetectDockerContainer
2026-11-11T14:57:45.4624604Z ##[section]Async Command End: DetectDockerContainer
2026-11-11T14:57:45.4625191Z ##[section]Async Command Start: DetectDockerContainer
2026-11-11T14:57:45.4625331Z ##[section]Async Command End: DetectDockerContainer
2026-11-11T14:57:45.4755159Z ##[section]Starting: Download Artifacts
2026-11-11T14:57:45.4817517Z Creating artifacts directory: /opt/ads-agent/_work/r510/a
2026-11-11T14:57:45.4891184Z Created artifacts directory: /opt/ads-agent/_work/r510/a
2026-11-11T14:57:45.4891320Z Downloading artifact
2026-11-11T14:57:45.4900447Z Starting artifacts download...
2026-11-11T14:57:45.4913601Z Downloading linked artifact _sigaf of type Build...
2026-11-11T14:57:45.4936841Z Ensuring artifact folder /opt/ads-agent/_work/r510/a/_sigaf exists and is clean.
2026-11-11T14:57:45.4983214Z Preparing to get the list of available artifacts from build
2026-11-11T14:57:46.1448525Z ##[warning]No artifacts are available in the build 869772.
2026-11-11T14:57:46.1489328Z Downloaded linked artifact _sigaf
2026-11-11T14:57:46.1489451Z Finished artifacts download
2026-11-11T14:57:46.1516776Z ##[section]Finishing: Download Artifacts
2026-11-11T14:57:46.1532397Z ##[section]Starting: Recuperando URL Pacote Nexus
2026-11-11T14:57:46.1690561Z ==============================================================================
2026-11-11T14:57:46.1691197Z Task         : Bash
2026-11-11T14:57:46.1691407Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-11T14:57:46.1691611Z Version      : 3.227.0
2026-11-11T14:57:46.1691834Z Author       : Microsoft Corporation
2026-11-11T14:57:46.1692025Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-11T14:57:46.1692134Z ==============================================================================
2026-11-11T14:57:47.2342333Z Generating script.
2026-11-11T14:57:47.2352628Z ========================== Starting Command Output ===========================
2026-11-11T14:57:47.2437286Z [command]/bin/bash /opt/ads-agent/_work/_temp/7a2a93b6-bcd5-4dac-81b8-1d6656bd06f9.sh
2026-11-11T14:57:47.2465809Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-11-11T14:57:47.2467909Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-11-11T14:57:47.2468121Z 
2026-11-11T14:57:47.3951677Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-11-11T14:57:47.4162722Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-11-11T14:57:47.4163453Z 100 72778  100 72778    0     0   417k      0 --:--:-- --:--:-- --:--:--  415k
2026-11-11T14:57:47.4190225Z 869772
2026-11-11T14:57:47.4231264Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-11-11T14:57:47.4231683Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-11-11T14:57:47.4232048Z 
2026-11-11T14:57:47.5491979Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-11-11T14:57:47.5492309Z 100  4739  100  4739    0     0  37602      0 --:--:-- --:--:-- --:--:-- 37912
2026-11-11T14:57:47.5506783Z https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_apis/build/builds/869772/logs
2026-11-11T14:57:47.5566265Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-11-11T14:57:47.5566730Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-11-11T14:57:47.5566864Z 
2026-11-11T14:57:47.6736073Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-11-11T14:57:47.6736619Z 100  9614  100  9614    0     0  82295      0 --:--:-- --:--:-- --:--:-- 82879
2026-11-11T14:57:47.6755560Z https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_apis/build/builds/869772/logs
2026-11-11T14:57:47.6802843Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-11-11T14:57:47.6803293Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-11-11T14:57:47.6803591Z 
2026-11-11T14:57:47.7972605Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-11-11T14:57:47.7972859Z 100    37    0    37    0     0    316      0 --:--:-- --:--:-- --:--:--   318
2026-11-11T14:57:47.8100837Z 
2026-11-11T14:57:47.8101744Z 100   246    0   246    0     0  19179      0 --:--:-- --:--:-- --:--:-- 19179
2026-11-11T14:57:47.8236909Z 
2026-11-11T14:57:47.8237482Z 100   883    0   883    0     0  65446      0 --:--:-- --:--:-- --:--:-- 65446
2026-11-11T14:57:47.8373788Z 
2026-11-11T14:57:47.8374226Z 100 41896    0 41896    0     0  3013k      0 --:--:-- --:--:-- --:--:-- 3013k
2026-11-11T14:57:47.8502070Z 
2026-11-11T14:57:47.8502703Z 100   816    0   816    0     0  63735      0 --:--:-- --:--:-- --:--:-- 63735
2026-11-11T14:57:47.8645257Z 
2026-11-11T14:57:47.8646222Z 100 10127    0 10127    0     0   695k      0 --:--:-- --:--:-- --:--:--  695k
2026-11-11T14:57:47.8825214Z 
2026-11-11T14:57:47.8825977Z 100  1347    0  1347    0     0  75720      0 --:--:-- --:--:-- --:--:-- 75720
2026-11-11T14:57:47.8966113Z 
2026-11-11T14:57:47.8967533Z 100    98    0    98    0     0   7000      0 --:--:-- --:--:-- --:--:--  7000
2026-11-11T14:57:47.9104113Z 
2026-11-11T14:57:47.9105065Z 100    98    0    98    0     0   7171      0 --:--:-- --:--:-- --:--:--  7171
2026-11-11T14:57:47.9236980Z 
2026-11-11T14:57:47.9237747Z 100    98    0    98    0     0   7449      0 --:--:-- --:--:-- --:--:--  7449
2026-11-11T14:57:47.9359218Z 
2026-11-11T14:57:47.9360232Z 100    98    0    98    0     0   8094      0 --:--:-- --:--:-- --:--:--  8094
2026-11-11T14:57:47.9487253Z 
2026-11-11T14:57:47.9487881Z 100    98    0    98    0     0   7767      0 --:--:-- --:--:-- --:--:--  7767
2026-11-11T14:57:47.9635388Z 
2026-11-11T14:57:47.9635867Z 100 16480    0 16480    0     0  1094k      0 --:--:-- --:--:-- --:--:-- 1094k
2026-11-11T14:57:47.9811102Z 
2026-11-11T14:57:47.9811800Z 100  4067    0  4067    0     0   227k      0 --:--:-- --:--:-- --:--:--  227k
2026-11-11T14:57:47.9968516Z 
2026-11-11T14:57:47.9969739Z 100 13778    0 13778    0     0   858k      0 --:--:-- --:--:-- --:--:--  858k
2026-11-11T14:57:48.0131554Z 
2026-11-11T14:57:48.0132101Z 100  3442    0  3442    0     0   208k      0 --:--:-- --:--:-- --:--:--  208k
2026-11-11T14:57:48.0315563Z 
2026-11-11T14:57:48.0316752Z 100  1170    0  1170    0     0  64338      0 --:--:-- --:--:-- --:--:-- 64338
2026-11-11T14:57:48.0459634Z 
2026-11-11T14:57:48.0460363Z 100  1867    0  1867    0     0   127k      0 --:--:-- --:--:-- --:--:--  127k
2026-11-11T14:57:48.0744562Z 
2026-11-11T14:57:48.0745432Z 100  796k    0  796k    0     0  27.4M      0 --:--:-- --:--:-- --:--:-- 27.4M
2026-11-11T14:57:48.0878056Z 
2026-11-11T14:57:48.0878886Z 100  1192    0  1192    0     0  90173      0 --:--:-- --:--:-- --:--:-- 90173
2026-11-11T14:57:48.1008226Z 
2026-11-11T14:57:48.1008711Z 100  1336    0  1336    0     0   101k      0 --:--:-- --:--:-- --:--:--  101k
2026-11-11T14:57:48.1139784Z 
2026-11-11T14:57:48.1140239Z 100  1030    0  1030    0     0  79340      0 --:--:-- --:--:-- --:--:-- 79340
2026-11-11T14:57:48.1260756Z 
2026-11-11T14:57:48.1261596Z 100  2793    0  2793    0     0   227k      0 --:--:-- --:--:-- --:--:--  227k
2026-11-11T14:57:48.1398366Z 
2026-11-11T14:57:48.1398803Z 100 71797    0 71797    0     0  5139k      0 --:--:-- --:--:-- --:--:-- 5139k
2026-11-11T14:57:48.2885314Z 
2026-11-11T14:57:48.3489128Z 100 4813k    0 4813k    0     0  31.6M      0 --:--:-- --:--:-- --:--:-- 31.6M
2026-11-11T14:57:48.3489858Z 100 9530k    0 9530k    0     0  44.5M      0 --:--:-- --:--:-- --:--:-- 76.7M
2026-11-11T14:57:48.5857407Z 
2026-11-11T14:57:48.5858400Z 100 11.2M    0 11.2M    0     0  47.3M      0 --:--:-- --:--:-- --:--:-- 47.3M
2026-11-11T14:57:48.6002248Z 
2026-11-11T14:57:48.6003012Z 100  2207    0  2207    0     0   149k      0 --:--:-- --:--:-- --:--:--  149k
2026-11-11T14:57:48.6141583Z 
2026-11-11T14:57:48.6142052Z 100  1987    0  1987    0     0   140k      0 --:--:-- --:--:-- --:--:--  140k
2026-11-11T14:57:48.6285048Z 
2026-11-11T14:57:48.6285983Z 100  2543    0  2543    0     0   174k      0 --:--:-- --:--:-- --:--:--  174k
2026-11-11T14:57:48.6523501Z 
2026-11-11T14:57:48.6524340Z 100  1157    0  1157    0     0  48899      0 --:--:-- --:--:-- --:--:-- 48899
2026-11-11T14:57:48.6691163Z 
2026-11-11T14:57:48.6692140Z 100  6212    0  6212    0     0   365k      0 --:--:-- --:--:-- --:--:--  365k
2026-11-11T14:57:48.6858140Z 
2026-11-11T14:57:48.6859999Z 100  3674    0  3674    0     0   216k      0 --:--:-- --:--:-- --:--:--  216k
2026-11-11T14:57:48.7163683Z 
2026-11-11T14:57:48.7164771Z 100  883k    0  883k    0     0  28.4M      0 --:--:-- --:--:-- --:--:-- 28.4M
2026-11-11T14:57:48.7322079Z 
2026-11-11T14:57:48.7322971Z 100  1026    0  1026    0     0  65122      0 --:--:-- --:--:-- --:--:-- 65122
2026-11-11T14:57:48.7465702Z 
2026-11-11T14:57:48.7466682Z 100   987    0   987    0     0  69614      0 --:--:-- --:--:-- --:--:-- 69614
2026-11-11T14:57:48.7623771Z 
2026-11-11T14:57:48.7624759Z 100  1328    0  1328    0     0  84612      0 --:--:-- --:--:-- --:--:-- 84612
2026-11-11T14:57:48.7794733Z 
2026-11-11T14:57:48.7796286Z 100   987    0   987    0     0  58481      0 --:--:-- --:--:-- --:--:-- 58481
2026-11-11T14:57:48.7972910Z 
2026-11-11T14:57:48.7973886Z 100 77715    0 77715    0     0  4307k      0 --:--:-- --:--:-- --:--:-- 4307k
2026-11-11T14:57:48.8179530Z 
2026-11-11T14:57:48.8180145Z 100   768    0   768    0     0  37600      0 --:--:-- --:--:-- --:--:-- 37600
2026-11-11T14:57:48.8346304Z 
2026-11-11T14:57:48.8347094Z 100   751    0   751    0     0  45202      0 --:--:-- --:--:-- --:--:-- 45202
2026-11-11T14:57:48.8518797Z 
2026-11-11T14:57:48.8519712Z 100  7359    0  7359    0     0   420k      0 --:--:-- --:--:-- --:--:--  420k
2026-11-11T14:57:48.8542600Z http://binario.caixa:8081/repository/releases/br/gov/caixa/sigaf-ear/2.24.0.9/sigaf-ear-2.24.0.9.ear
2026-11-11T14:57:48.8594014Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-11-11T14:57:48.8594197Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-11-11T14:57:48.8594249Z 
2026-11-11T14:57:48.9803798Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-11-11T14:57:48.9804404Z 100  9614  100  9614    0     0  79458      0 --:--:-- --:--:-- --:--:-- 80116
2026-11-11T14:57:48.9927090Z ##[section]Finishing: Recuperando URL Pacote Nexus
2026-11-11T14:57:48.9938922Z ##[section]Starting: Verificando se o pacote existe no Nexus
2026-11-11T14:57:48.9942927Z ==============================================================================
2026-11-11T14:57:48.9943006Z Task         : Bash
2026-11-11T14:57:48.9943044Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-11T14:57:48.9943108Z Version      : 3.227.0
2026-11-11T14:57:48.9943146Z Author       : Microsoft Corporation
2026-11-11T14:57:48.9943199Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-11T14:57:48.9943262Z ==============================================================================
2026-11-11T14:57:49.8496486Z Generating script.
2026-11-11T14:57:49.8507140Z ========================== Starting Command Output ===========================
2026-11-11T14:57:49.8515574Z [command]/bin/bash /opt/ads-agent/_work/_temp/3be538b3-efcb-4a0f-86ff-cf1cbc860d6e.sh
2026-11-11T14:57:49.8922231Z URL retornou status: 200
2026-11-11T14:57:49.8974071Z ##[section]Finishing: Verificando se o pacote existe no Nexus
2026-11-11T14:57:49.8985616Z ##[section]Starting: Recupera Pacote - sigaf-ear.ear
2026-11-11T14:57:49.8989826Z ==============================================================================
2026-11-11T14:57:49.8990960Z Task         : Bash
2026-11-11T14:57:49.8991263Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-11T14:57:49.8991358Z Version      : 3.227.0
2026-11-11T14:57:49.8991400Z Author       : Microsoft Corporation
2026-11-11T14:57:49.8991445Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-11T14:57:49.8991591Z ==============================================================================
2026-11-11T14:57:50.8137852Z Generating script.
2026-11-11T14:57:50.8150674Z ========================== Starting Command Output ===========================
2026-11-11T14:57:50.8163214Z [command]/bin/bash /opt/ads-agent/_work/_temp/18ee708f-163d-423e-8ed8-d937a9adb451.sh
2026-11-11T14:57:50.8212245Z + rm -rf '*'
2026-11-11T14:57:50.8213006Z + mkdir binario
2026-11-11T14:57:50.8230085Z + cd binario
2026-11-11T14:57:50.8232899Z + pwd
2026-11-11T14:57:50.8244905Z + ls
2026-11-11T14:57:50.8247775Z /opt/ads-agent/_work/r510/a/_sigaf/binario
2026-11-11T14:57:50.8256581Z + echo http://binario.caixa:8081/repository/releases/br/gov/caixa/sigaf-ear/2.24.0.9/sigaf-ear-2.24.0.9.ear
2026-11-11T14:57:50.8257418Z + URL_DEPLOY=http://binario.caixa:8081/repository/releases/br/gov/caixa/sigaf-ear/2.24.0.9/sigaf-ear-2.24.0.9.ear
2026-11-11T14:57:50.8257955Z + deploys=(${URL_DEPLOY//,/ })
2026-11-11T14:57:50.8258631Z + for deploy in '"${deploys[@]}"'
2026-11-11T14:57:50.8258849Z + deploy_name=sigaf-ear-2.24.0.9.ear
2026-11-11T14:57:50.8259284Z + curl http://binario.caixa:8081/repository/releases/br/gov/caixa/sigaf-ear/2.24.0.9/sigaf-ear-2.24.0.9.ear -o sigaf-ear-2.24.0.9.ear
2026-11-11T14:57:50.8259690Z http://binario.caixa:8081/repository/releases/br/gov/caixa/sigaf-ear/2.24.0.9/sigaf-ear-2.24.0.9.ear
2026-11-11T14:57:50.8281083Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-11-11T14:57:50.8281510Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-11-11T14:57:50.8282418Z 
2026-11-11T14:57:50.8749059Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-11-11T14:57:50.8749396Z 100 38.6M  100 38.6M    0     0   823M      0 --:--:-- --:--:-- --:--:--  839M
2026-11-11T14:57:50.8760332Z ++ md5sum -b sigaf-ear-2.24.0.9.ear
2026-11-11T14:57:50.9508427Z + HASH_RELEASE='818d85b785d17cdd0b39cd923c6ab328 *sigaf-ear-2.24.0.9.ear'
2026-11-11T14:57:50.9508936Z + HASH_RELEASE=818d85b785d17cdd0b39cd923c6ab328
2026-11-11T14:57:50.9511500Z + echo 818d85b785d17cdd0b39cd923c6ab328
2026-11-11T14:57:50.9512191Z + echo - - - - - - - - - -
2026-11-11T14:57:50.9512349Z + echo sigaf-ear-2.24.0.9.ear
2026-11-11T14:57:50.9512506Z + mv sigaf-ear-2.24.0.9.ear sigaf-ear.ear
2026-11-11T14:57:50.9512608Z 818d85b785d17cdd0b39cd923c6ab328
2026-11-11T14:57:50.9512740Z - - - - - - - - - -
2026-11-11T14:57:50.9513727Z sigaf-ear-2.24.0.9.ear
2026-11-11T14:57:50.9528414Z + ls
2026-11-11T14:57:50.9542025Z sigaf-ear.ear
2026-11-11T14:57:50.9594071Z ##[section]Finishing: Recupera Pacote - sigaf-ear.ear
2026-11-11T14:57:50.9603506Z ##[section]Starting: Reciclagem sigaf
2026-11-11T14:57:50.9606688Z ==============================================================================
2026-11-11T14:57:50.9606757Z Task         : Bash
2026-11-11T14:57:50.9606804Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-11T14:57:50.9606861Z Version      : 3.227.0
2026-11-11T14:57:50.9606899Z Author       : Microsoft Corporation
2026-11-11T14:57:50.9606943Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-11T14:57:50.9607017Z ==============================================================================
2026-11-11T14:57:51.9380963Z Generating script.
2026-11-11T14:57:51.9393153Z ========================== Starting Command Output ===========================
2026-11-11T14:57:51.9402241Z [command]/bin/bash /opt/ads-agent/_work/_temp/69132b39-9c5f-4a27-8795-82eb1ed76795.sh
2026-11-11T14:57:51.9477096Z - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
2026-11-11T14:57:51.9477765Z Reciclando 10.116.24.150
2026-11-11T14:57:51.9480698Z - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
2026-11-11T14:57:52.6067594Z {
2026-11-11T14:57:52.6067769Z     "outcome" => "success",
2026-11-11T14:57:52.6069441Z     "result" => undefined,
2026-11-11T14:57:52.6070378Z     "server-groups" => undefined
2026-11-11T14:57:52.6070517Z }
2026-11-11T14:57:52.6268128Z ##[section]Finishing: Reciclagem sigaf
2026-11-11T14:57:52.6278354Z ##[section]Starting: deploy package domain - 10.116.24.150
2026-11-11T14:57:52.6281858Z ==============================================================================
2026-11-11T14:57:52.6281937Z Task         : Bash
2026-11-11T14:57:52.6281975Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-11T14:57:52.6282033Z Version      : 3.227.0
2026-11-11T14:57:52.6282072Z Author       : Microsoft Corporation
2026-11-11T14:57:52.6282129Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-11T14:57:52.6282193Z ==============================================================================
2026-11-11T14:57:53.5859391Z Generating script.
2026-11-11T14:57:53.5871449Z ========================== Starting Command Output ===========================
2026-11-11T14:57:53.5897976Z [command]/bin/bash /opt/ads-agent/_work/_temp/1baa84f0-b394-4c5e-9abf-4609f153a28f.sh
2026-11-11T14:57:53.5973503Z - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
2026-11-11T14:57:53.5983579Z Deploy será feito em 10.116.24.150
2026-11-11T14:57:53.5985006Z - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
2026-11-11T14:57:54.2186638Z #1 undeploy sigaf-ear.ear  --server-groups=sigaf
2026-11-11T14:57:54.2858724Z #1 deploy /opt/ads-agent/_work/r510/a/_sigaf/binario/sigaf-ear.ear --server-groups=sigaf
2026-11-11T14:57:58.4224168Z ##[section]Finishing: deploy package domain - 10.116.24.150
2026-11-11T14:57:58.4233855Z ##[section]Starting: Checagem de status do deploy
2026-11-11T14:57:58.4237473Z ==============================================================================
2026-11-11T14:57:58.4237541Z Task         : Bash
2026-11-11T14:57:58.4237578Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-11T14:57:58.4237642Z Version      : 3.227.0
2026-11-11T14:57:58.4237679Z Author       : Microsoft Corporation
2026-11-11T14:57:58.4237724Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-11T14:57:58.4237793Z ==============================================================================
2026-11-11T14:57:59.1398916Z Generating script.
2026-11-11T14:57:59.1442911Z ========================== Starting Command Output ===========================
2026-11-11T14:57:59.1471713Z [command]/bin/bash /opt/ads-agent/_work/_temp/46057f9f-650b-4d06-a8ae-09abd6251458.sh
2026-11-11T14:57:59.1498235Z - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
2026-11-11T14:57:59.1498699Z Checando 10.116.24.150
2026-11-11T14:57:59.1503352Z - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
2026-11-11T14:57:59.7837049Z NAME          RUNTIME-NAME  
2026-11-11T14:57:59.7837530Z sigaf-ear.ear sigaf-ear.ear 
2026-11-11T14:57:59.7837778Z 
2026-11-11T14:57:59.7844921Z SERVER-GROUP STATE     
2026-11-11T14:57:59.7845080Z siamt        not added 
2026-11-11T14:57:59.7845278Z sicrf        not added 
2026-11-11T14:57:59.7845380Z sicrh        not added 
2026-11-11T14:57:59.7845469Z sicse        not added 
2026-11-11T14:57:59.7845568Z sigaf        enabled   
2026-11-11T14:57:59.7845655Z siigf        not added 
2026-11-11T14:57:59.7845750Z siind        not added 
2026-11-11T14:57:59.7845836Z sipar        not added 
2026-11-11T14:57:59.7845939Z sirep        not added 
2026-11-11T14:57:59.7846032Z sitkn        not added 
2026-11-11T14:57:59.8009266Z ##[section]Finishing: Checagem de status do deploy
2026-11-11T14:57:59.8092858Z ##[section]Starting: Finalize Job
2026-11-11T14:57:59.8119735Z Cleaning up task key
2026-11-11T14:57:59.8120762Z Start cleaning up orphan processes.
2026-11-11T14:57:59.8414890Z ##[section]Finishing: Finalize Job
2026-11-11T14:57:59.8478274Z ##[section]Finishing: Agent job



