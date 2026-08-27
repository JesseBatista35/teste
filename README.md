2026-08-20T16:31:38.8540936Z ##[debug]Evaluating condition for step: 'Log - Branch expirada'
2026-08-20T16:31:38.8542237Z ##[debug]Evaluating: failed()
2026-08-20T16:31:38.8542466Z ##[debug]Evaluating failed:
2026-08-20T16:31:38.8544512Z ##[debug]=> True
2026-08-20T16:31:38.8544942Z ##[debug]Result: True
2026-08-20T16:31:38.8545278Z ##[section]Starting: Log - Branch expirada
2026-08-20T16:31:38.8549876Z ==============================================================================
2026-08-20T16:31:38.8549960Z Task         : Bash
2026-08-20T16:31:38.8550003Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-20T16:31:38.8550113Z Version      : 3.227.0
2026-08-20T16:31:38.8550159Z Author       : Microsoft Corporation
2026-08-20T16:31:38.8550211Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-20T16:31:38.8550329Z ==============================================================================
2026-08-20T16:31:38.9220950Z ##[debug]Using node path: /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/externals/node16/bin/node
2026-08-20T16:31:38.9332045Z Warning: Ignoring extra certs from `/etc/pki/ca-trust/source/anchors/AC-V4.cer`, load failed: error:02001002:system library:fopen:No such file or directory
2026-08-20T16:31:39.0003428Z ##[debug]agent.TempDirectory=/opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp
2026-08-20T16:31:39.0007525Z ##[debug]loading inputs and endpoints
2026-08-20T16:31:39.0010063Z ##[debug]loading INPUT_TARGETTYPE
2026-08-20T16:31:39.0018208Z ##[debug]loading INPUT_FILEPATH
2026-08-20T16:31:39.0019390Z ##[debug]loading INPUT_SCRIPT
2026-08-20T16:31:39.0019982Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-08-20T16:31:39.0020596Z ##[debug]loading INPUT_FAILONSTDERR
2026-08-20T16:31:39.0022203Z ##[debug]loading INPUT_NOPROFILE
2026-08-20T16:31:39.0023014Z ##[debug]loading INPUT_NORC
2026-08-20T16:31:39.0024588Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-08-20T16:31:39.0025345Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-08-20T16:31:39.0026642Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-08-20T16:31:39.0031221Z ##[debug]loading SECRET_FORTIFY_CI_TOKEN
2026-08-20T16:31:39.0033184Z ##[debug]loading SECRET_KEYSTOREPASS
2026-08-20T16:31:39.0034689Z ##[debug]loading SECRET_AZPAT
2026-08-20T16:31:39.0036141Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-08-20T16:31:39.0036874Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-08-20T16:31:39.0037502Z ##[debug]loading SECRET_KEYSTORE_PWD
2026-08-20T16:31:39.0038066Z ##[debug]loading SECRET_TOKEN_CRQ
2026-08-20T16:31:39.0038605Z ##[debug]loading SECRET_FORTIFY_UPTOKEN
2026-08-20T16:31:39.0039108Z ##[debug]loading SECRET_APIJSONGOOGLE
2026-08-20T16:31:39.0039678Z ##[debug]loading SECRET_FIREBASE_TOKEN
2026-08-20T16:31:39.0040908Z ##[debug]loading SECRET_GITTOKEN
2026-08-20T16:31:39.0041591Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-08-20T16:31:39.0042217Z ##[debug]loading SECRET_FORTIFY_CLIENT_AUTH_TOKEN
2026-08-20T16:31:39.0043218Z ##[debug]loading SECRET_SCANCENTRAL_CLIENTTOKEN
2026-08-20T16:31:39.0044251Z ##[debug]loading SECRET_SCANCENTRAL_SSCCITOKEN
2026-08-20T16:31:39.0044766Z ##[debug]loading SECRET_FORTIFY_REGISTRY_PASSWORD
2026-08-20T16:31:39.0046097Z ##[debug]loading SECRET_FORTIFY_TOKEN
2026-08-20T16:31:39.0046412Z ##[debug]loading SECRET_NEXUS_INTERNO_PASS
2026-08-20T16:31:39.0046667Z ##[debug]loading SECRET_FORTIFY_PASS
2026-08-20T16:31:39.0047127Z ##[debug]loaded 29
2026-08-20T16:31:39.0051652Z ##[debug]Agent.ProxyUrl=undefined
2026-08-20T16:31:39.0052163Z ##[debug]Agent.CAInfo=undefined
2026-08-20T16:31:39.0052655Z ##[debug]Agent.ClientCert=undefined
2026-08-20T16:31:39.0052935Z ##[debug]Agent.SkipCertValidation=True
2026-08-20T16:31:39.0077272Z ##[debug]check path : /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-08-20T16:31:39.0079178Z ##[debug]adding resource file: /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-08-20T16:31:39.0080129Z ##[debug]system.culture=en-US
2026-08-20T16:31:39.0088725Z ##[debug]failOnStderr=false
2026-08-20T16:31:39.0089483Z ##[debug]workingDirectory=/opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r14/a
2026-08-20T16:31:39.0090001Z ##[debug]check path : /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r14/a
2026-08-20T16:31:39.0090675Z ##[debug]targetType=inline
2026-08-20T16:31:39.0090946Z ##[debug]bashEnvValue=undefined
2026-08-20T16:31:39.0091378Z ##[debug]script=echo "##vso[task.logissue type=error]---- ALERTA ---- Verifique o merge da master para a sua branch ---- ALERTA ----."
exit 1
2026-08-20T16:31:39.0100441Z Generating script.
2026-08-20T16:31:39.0102406Z ##[debug]which 'bash'
2026-08-20T16:31:39.0107421Z ##[debug]found: '/bin/bash'
2026-08-20T16:31:39.0107945Z ##[debug]Agent.Version=3.225.2
2026-08-20T16:31:39.0108450Z ##[debug]agent.tempDirectory=/opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp
2026-08-20T16:31:39.0109135Z ##[debug]check path : /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp
2026-08-20T16:31:39.0110654Z ========================== Starting Command Output ===========================
2026-08-20T16:31:39.0111808Z ##[debug]which '/bin/bash'
2026-08-20T16:31:39.0112625Z ##[debug]found: '/bin/bash'
2026-08-20T16:31:39.0113370Z ##[debug]/bin/bash arg: /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp/644ba4c8-30c8-4d42-9e5d-cd89d3c2e10c.sh
2026-08-20T16:31:39.0115738Z ##[debug]exec tool: /bin/bash
2026-08-20T16:31:39.0116192Z ##[debug]arguments:
2026-08-20T16:31:39.0116650Z ##[debug]   /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp/644ba4c8-30c8-4d42-9e5d-cd89d3c2e10c.sh
2026-08-20T16:31:39.0117974Z [command]/bin/bash /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp/644ba4c8-30c8-4d42-9e5d-cd89d3c2e10c.sh
2026-08-20T16:31:39.0173365Z ##[error]---- ALERTA ---- Verifique o merge da master para a sua branch ---- ALERTA ----.
2026-08-20T16:31:39.0174018Z ##[debug]Processed: ##vso[task.logissue type=error]---- ALERTA ---- Verifique o merge da master para a sua branch ---- ALERTA ----.
2026-08-20T16:31:39.0177863Z ##[debug]Exit code 1 received from tool '/bin/bash'
2026-08-20T16:31:39.0182621Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-08-20T16:31:39.0188553Z ##[error]Bash exited with code '1'.
2026-08-20T16:31:39.0188850Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '1'.
2026-08-20T16:31:39.0189132Z ##[debug]task result: Failed
2026-08-20T16:31:39.0190419Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-08-20T16:31:39.0225134Z ##[section]Finishing: Log - Branch expirada




essa seguida no dia 20 quebrou aqui.


ai vem uma series de release quebrando nessa mesmo step no dia 20

ai no dia 24. ela passa e quebra aqui


2026-08-24T19:19:22.1405319Z ##[debug]Evaluating condition for step: 'Iniciando Análise no Fortify'
2026-08-24T19:19:22.1406379Z ##[debug]Evaluating: and(succeeded(), ne(variables['fortify_disable'], 'gecmi'), ne(variables['p_language'], 'dotnet'))
2026-08-24T19:19:22.1406571Z ##[debug]Evaluating and:
2026-08-24T19:19:22.1406719Z ##[debug]..Evaluating succeeded:
2026-08-24T19:19:22.1407045Z ##[debug]..=> True
2026-08-24T19:19:22.1407244Z ##[debug]..Evaluating ne:
2026-08-24T19:19:22.1407390Z ##[debug]....Evaluating indexer:
2026-08-24T19:19:22.1407539Z ##[debug]......Evaluating variables:
2026-08-24T19:19:22.1408130Z ##[debug]......=> Object
2026-08-24T19:19:22.1408303Z ##[debug]......Evaluating String:
2026-08-24T19:19:22.1408477Z ##[debug]......=> 'fortify_disable'
2026-08-24T19:19:22.1408687Z ##[debug]....=> ''
2026-08-24T19:19:22.1408824Z ##[debug]....Evaluating String:
2026-08-24T19:19:22.1408970Z ##[debug]....=> 'gecmi'
2026-08-24T19:19:22.1409083Z ##[debug]..=> True
2026-08-24T19:19:22.1409202Z ##[debug]..Evaluating ne:
2026-08-24T19:19:22.1409376Z ##[debug]....Evaluating indexer:
2026-08-24T19:19:22.1409519Z ##[debug]......Evaluating variables:
2026-08-24T19:19:22.1409648Z ##[debug]......=> Object
2026-08-24T19:19:22.1409785Z ##[debug]......Evaluating String:
2026-08-24T19:19:22.1409942Z ##[debug]......=> 'p_language'
2026-08-24T19:19:22.1410158Z ##[debug]....=> 'android'
2026-08-24T19:19:22.1410367Z ##[debug]....Evaluating String:
2026-08-24T19:19:22.1410513Z ##[debug]....=> 'dotnet'
2026-08-24T19:19:22.1410622Z ##[debug]..=> True
2026-08-24T19:19:22.1410726Z ##[debug]=> True
2026-08-24T19:19:22.1411138Z ##[debug]Expanded: and(True, ne('', 'gecmi'), ne('android', 'dotnet'))
2026-08-24T19:19:22.1411361Z ##[debug]Result: True
2026-08-24T19:19:22.1411602Z ##[section]Starting: Iniciando Análise no Fortify
2026-08-24T19:19:22.1415362Z ==============================================================================
2026-08-24T19:19:22.1415457Z Task         : Bash
2026-08-24T19:19:22.1415502Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-24T19:19:22.1415584Z Version      : 3.227.0
2026-08-24T19:19:22.1415636Z Author       : Microsoft Corporation
2026-08-24T19:19:22.1415692Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-24T19:19:22.1415775Z ==============================================================================
2026-08-24T19:19:22.1894407Z ##[debug]Using node path: /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/externals/node16/bin/node
2026-08-24T19:19:22.1999358Z Warning: Ignoring extra certs from `/etc/pki/ca-trust/source/anchors/AC-V4.cer`, load failed: error:02001002:system library:fopen:No such file or directory
2026-08-24T19:19:22.2780685Z ##[debug]agent.TempDirectory=/opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp
2026-08-24T19:19:22.2787940Z ##[debug]loading inputs and endpoints
2026-08-24T19:19:22.2790126Z ##[debug]loading INPUT_TARGETTYPE
2026-08-24T19:19:22.2800952Z ##[debug]loading INPUT_FILEPATH
2026-08-24T19:19:22.2801531Z ##[debug]loading INPUT_SCRIPT
2026-08-24T19:19:22.2802372Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-08-24T19:19:22.2803108Z ##[debug]loading INPUT_FAILONSTDERR
2026-08-24T19:19:22.2805671Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-08-24T19:19:22.2806808Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-08-24T19:19:22.2808870Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-08-24T19:19:22.2815178Z ##[debug]loading SECRET_APIJSONGOOGLE
2026-08-24T19:19:22.2817452Z ##[debug]loading SECRET_FORTIFY_PASS
2026-08-24T19:19:22.2819549Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-08-24T19:19:22.2822195Z ##[debug]loading SECRET_GITTOKEN
2026-08-24T19:19:22.2824236Z ##[debug]loading SECRET_KEYSTOREPASS
2026-08-24T19:19:22.2827764Z ##[debug]loading SECRET_SCANCENTRAL_CLIENTTOKEN
2026-08-24T19:19:22.2828421Z ##[debug]loading SECRET_FIREBASE_TOKEN
2026-08-24T19:19:22.2829054Z ##[debug]loading SECRET_SCANCENTRAL_SSCCITOKEN
2026-08-24T19:19:22.2831979Z ##[debug]loading SECRET_AZPAT
2026-08-24T19:19:22.2832646Z ##[debug]loading SECRET_TOKEN_CRQ
2026-08-24T19:19:22.2835724Z ##[debug]loading SECRET_KEYSTORE_PWD
2026-08-24T19:19:22.2837121Z ##[debug]loading SECRET_FORTIFY_CI_TOKEN
2026-08-24T19:19:22.2837854Z ##[debug]loading SECRET_FORTIFY_REGISTRY_PASSWORD
2026-08-24T19:19:22.2838403Z ##[debug]loading SECRET_FORTIFY_CLIENT_AUTH_TOKEN
2026-08-24T19:19:22.2838940Z ##[debug]loading SECRET_NEXUS_INTERNO_PASS
2026-08-24T19:19:22.2839526Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-08-24T19:19:22.2840132Z ##[debug]loading SECRET_FORTIFY_UPTOKEN
2026-08-24T19:19:22.2840616Z ##[debug]loading SECRET_FORTIFY_TOKEN
2026-08-24T19:19:22.2840972Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-08-24T19:19:22.2841909Z ##[debug]loaded 27
2026-08-24T19:19:22.2842428Z ##[debug]Agent.ProxyUrl=undefined
2026-08-24T19:19:22.2843139Z ##[debug]Agent.CAInfo=undefined
2026-08-24T19:19:22.2843516Z ##[debug]Agent.ClientCert=undefined
2026-08-24T19:19:22.2843867Z ##[debug]Agent.SkipCertValidation=True
2026-08-24T19:19:22.2871121Z ##[debug]check path : /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-08-24T19:19:22.2872779Z ##[debug]adding resource file: /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-08-24T19:19:22.2873303Z ##[debug]system.culture=en-US
2026-08-24T19:19:22.2902363Z ##[debug]failOnStderr=false
2026-08-24T19:19:22.2902702Z ##[debug]workingDirectory=/opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r14/a
2026-08-24T19:19:22.2903040Z ##[debug]check path : /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r14/a
2026-08-24T19:19:22.2903335Z ##[debug]targetType=inline
2026-08-24T19:19:22.2903574Z ##[debug]bashEnvValue=undefined
2026-08-24T19:19:22.2905086Z ##[debug]script=#!/bin/bash

export PATH=/opt/apache-maven/apache-maven-3.8.5/bin:$PATH
mvn -version

echo "Iniciando Fortify Clean, Translate e Analysis" 

p_lang=`echo 'android' | sed 's/[[:punct:]]\+$//'`
echo "LANG $p_lang"

if [ $p_lang == java ]
  then
      
	  DIR=$(Agent.BuildDirectory)/fortify
     
	  if [ -d "$DIR" ]; then
		  echo "Pasta ${DIR} existe..."
		  cd ${DIR}
	  else
	    DIR=/opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r14/a/SIECO-Android
	  fi
	  
	  if [ $POM_PATH ]
	   then
	     POM=`dirname $POM_PATH`
	  cd ${DIR}/$POM
	   else
	  cd ${DIR}
      fi

scancentral -url http://scancentral.apps.produtos4.caixa/scancentral-ctrl start -bt mvn -pool 794601f7-da27-467b-a734-06f92c4d63aa -application sieco-android -version 1.4.8 -uptoken *** -fprssc aa3f5b11c012c2da7052b4376057dabb5760ea5c.fpr -upload

elif [ $p_lang == android ]
then
cd /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r14/a/SIECO-Android
chmod +x gradlew
sed -i  "s,distributionUrl=.*,distributionUrl=file:///opt/ferramentas/gradle/gradle-$(awk '/distributionUrl/ {print $0}' /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r14/a/SIECO-Android/gradle/wrapper/gradle-wrapper.properties | sed 's/.*gradle-\(.*\)-.*/\1/g')-all.zip," gradle/wrapper/gradle-wrapper.properties
scancentral arguments -o -targs "-exclude './**/build/**/*'"
scancentral -url http://scancentral.apps.produtos4.caixa/scancentral-ctrl start -bt gradle -bc assembleDev -skipBuild -pool 25b9ff35-8b38-4a58-a54b-40b46436b3a1 -application sieco-android -version 1.4.8 -uptoken *** -fprssc aa3f5b11c012c2da7052b4376057dabb5760ea5c.fpr -upload

else
      if [ $PACKAGE_JSON_PATH ]
	    then
          cd $PACKAGE_JSON_PATH
		else
		  cd /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r14/a/SIECO-Android
		fi
	  scancentral arguments -o -targs "-Dcom.fortify.sca.exclude.unimported.node.modules 'true'" -targs "-exclude './**/node_modules/**/*'" -targs "-exclude './**/*.min.js'" -targs "-exclude './**/dist/**/*'"
          scancentral -url http://scancentral.apps.produtos4.caixa/scancentral-ctrl start -bt none -pool 25b9ff35-8b38-4a58-a54b-40b46436b3a1 -application sieco-android -version 1.4.8 -uptoken *** -fprssc aa3f5b11c012c2da7052b4376057dabb5760ea5c.fpr -upload
fi
2026-08-24T19:19:22.2922803Z Generating script.
2026-08-24T19:19:22.2923393Z ##[debug]which 'bash'
2026-08-24T19:19:22.2923815Z ##[debug]found: '/bin/bash'
2026-08-24T19:19:22.2924977Z ##[debug]Agent.Version=3.225.2
2026-08-24T19:19:22.2925482Z ##[debug]agent.tempDirectory=/opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp
2026-08-24T19:19:22.2926054Z ##[debug]check path : /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp
2026-08-24T19:19:22.2926379Z ========================== Starting Command Output ===========================
2026-08-24T19:19:22.2927178Z ##[debug]which '/bin/bash'
2026-08-24T19:19:22.2927491Z ##[debug]found: '/bin/bash'
2026-08-24T19:19:22.2927872Z ##[debug]/bin/bash arg: /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp/53d82237-4e78-4aff-9035-071e21fe829f.sh
2026-08-24T19:19:22.2930917Z ##[debug]exec tool: /bin/bash
2026-08-24T19:19:22.2931818Z ##[debug]arguments:
2026-08-24T19:19:22.2932319Z ##[debug]   /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp/53d82237-4e78-4aff-9035-071e21fe829f.sh
2026-08-24T19:19:22.2940816Z [command]/bin/bash /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp/53d82237-4e78-4aff-9035-071e21fe829f.sh
2026-08-24T19:19:22.4531518Z Apache Maven 3.6.2 (40f52333136460af0dc0d7232c0dc0bcf0d9e117; 2019-08-27T12:06:16-03:00)
2026-08-24T19:19:22.4532186Z Maven home: /opt/ferramentas/maven/apache-maven-3.6.2
2026-08-24T19:19:22.4538517Z Java version: 17.0.7, vendor: Oracle Corporation, runtime: /opt/ferramentas/jdk/jdk17.0.7
2026-08-24T19:19:22.4543568Z Default locale: pt_BR, platform encoding: UTF-8
2026-08-24T19:19:22.4549009Z OS name: "linux", version: "3.10.0-1062.9.1.el7.x86_64", arch: "amd64", family: "unix"
2026-08-24T19:19:22.4595384Z Iniciando Fortify Clean, Translate e Analysis
2026-08-24T19:19:22.4621948Z LANG android
2026-08-24T19:19:22.8226331Z launcher.log will be stored in "/home/sadscp01/.fortify/scancentral-22.2.0/log" directory.
2026-08-24T19:19:23.4316539Z Update failed.
2026-08-24T19:19:23.4317644Z Unable to identify the Controller URL. Specify either the -url option or the -sscurl and -ssctoken options.
2026-08-24T19:19:23.8233560Z scancentral.log will be stored in "/home/sadscp01/.fortify/scancentral-22.2.0/log" directory.
2026-08-24T19:19:25.5611453Z Creating the fortify-sca.settings file.
2026-08-24T19:19:25.8161587Z launcher.log will be stored in "/home/sadscp01/.fortify/scancentral-22.2.0/log" directory.
2026-08-24T19:19:26.2710276Z Checking for updates...
2026-08-24T19:19:26.3024144Z No update available or auto update is disabled on the controller.
2026-08-24T19:19:26.5071951Z scancentral.log will be stored in "/home/sadscp01/.fortify/scancentral-22.2.0/log" directory.
2026-08-24T19:19:28.1126989Z Verifying controller URL...
2026-08-24T19:19:28.2307057Z The Controller at http://scancentral.apps.produtos4.caixa/scancentral-ctrl is UP
2026-08-24T19:19:28.2474891Z No email address detected. No status emails will be sent for this job.
2026-08-24T19:19:28.2493888Z Gathering project information...
2026-08-24T19:19:28.9706740Z To honour the JVM settings for this build a single-use Daemon process will be forked. See https://docs.gradle.org/8.1/userguide/gradle_daemon.html#sec:disabling_the_daemon.
2026-08-24T19:19:29.7708368Z Daemon will be stopped at the end of the build 
2026-08-24T19:19:29.9703183Z Configuration on demand is an incubating feature.
2026-08-24T19:19:35.7784218Z > Task :spec
2026-08-24T19:19:37.2765503Z 
2026-08-24T19:19:37.2766637Z Warning: SDK processing. This version only understands SDK XML versions up to 3 but an SDK XML file of version 4 was encountered. This can happen if you use versions of Android Studio and the command-line tools that were released at different times.
2026-08-24T19:19:37.2769989Z > Task :app:spec
2026-08-24T19:19:37.2770402Z WARNING: We recommend using a newer Android Gradle plugin to use compileSdk = 35
2026-08-24T19:19:37.2770605Z 
2026-08-24T19:19:37.2770866Z This Android Gradle plugin (8.1.1) was tested up to compileSdk = 34.
2026-08-24T19:19:37.2771516Z 
2026-08-24T19:19:37.2771769Z You are strongly encouraged to update your project to use a newer
2026-08-24T19:19:37.2772052Z Android Gradle plugin that has been tested with compileSdk = 35.
2026-08-24T19:19:37.2818659Z 
2026-08-24T19:19:37.2819295Z If you are already using the latest version of the Android Gradle plugin,
2026-08-24T19:19:37.2819566Z you may need to wait until a newer version with support for compileSdk = 35 is available.
2026-08-24T19:19:37.2819718Z 
2026-08-24T19:19:37.2819918Z To suppress this warning, add/update
2026-08-24T19:19:37.2820134Z     android.suppressUnsupportedCompileSdk=36,35
2026-08-24T19:19:37.2820486Z to this project's gradle.properties.
2026-08-24T19:19:37.2820802Z Can't resolve artifacts for implementationDependenciesMetadata configuration. Artifacts are ignored.
2026-08-24T19:19:37.2880131Z org.gradle.internal.exceptions.DefaultMultiCauseException: Could not resolve all files for configuration ':app:implementationDependenciesMetadata'.
2026-08-24T19:19:37.2982381Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.mapFailure(DefaultConfiguration.java:1716)
2026-08-24T19:19:37.3072535Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$3400(DefaultConfiguration.java:177)
2026-08-24T19:19:37.3486708Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$DefaultResolutionHost.mapFailure(DefaultConfiguration.java:2443)
2026-08-24T19:19:37.3572096Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionHost.rethrowFailure(ResolutionHost.java:30)
2026-08-24T19:19:37.3612020Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:74)
2026-08-24T19:19:37.3612356Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-24T19:19:37.3612597Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-24T19:19:37.3612852Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-24T19:19:37.3613060Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-24T19:19:37.3613275Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-24T19:19:37.3613513Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-24T19:19:37.3613746Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-24T19:19:37.3613967Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-24T19:19:37.3614274Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-24T19:19:37.3614482Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-24T19:19:37.3614712Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-24T19:19:37.3614915Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-24T19:19:37.3615092Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-24T19:19:37.3615291Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-24T19:19:37.3615510Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-24T19:19:37.3615721Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-24T19:19:37.3615922Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-24T19:19:37.3616139Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-24T19:19:37.3616693Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-24T19:19:37.3616979Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:37.3617202Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3617421Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:37.3617648Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3617865Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-24T19:19:37.3618084Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-24T19:19:37.3618302Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-24T19:19:37.3618518Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-24T19:19:37.3618738Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-24T19:19:37.3618951Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-24T19:19:37.3619151Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-24T19:19:37.3619345Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-24T19:19:37.3619540Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-24T19:19:37.3619726Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-24T19:19:37.3619954Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-24T19:19:37.3620199Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-24T19:19:37.3620432Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:37.3620654Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3620872Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:37.3621189Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3621412Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-24T19:19:37.3621632Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-24T19:19:37.3621838Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-24T19:19:37.3622024Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-24T19:19:37.3622234Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-24T19:19:37.3622453Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-24T19:19:37.3622683Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-24T19:19:37.3622890Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-24T19:19:37.3623113Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-24T19:19:37.3623307Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-24T19:19:37.3623605Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-24T19:19:37.3623847Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-24T19:19:37.3624150Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-24T19:19:37.3624372Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-24T19:19:37.3624599Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-24T19:19:37.3624836Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-24T19:19:37.3625055Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-24T19:19:37.3625268Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-24T19:19:37.3625455Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-24T19:19:37.3625634Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-24T19:19:37.3625827Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-24T19:19:37.3626022Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-24T19:19:37.3626228Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-24T19:19:37.3626444Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-24T19:19:37.3626650Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-24T19:19:37.3626848Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-24T19:19:37.3627057Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-24T19:19:37.3627267Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-24T19:19:37.3627459Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-24T19:19:37.3627637Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-24T19:19:37.3627841Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-24T19:19:37.3628057Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-24T19:19:37.3628265Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-24T19:19:37.3628493Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-24T19:19:37.3628753Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-24T19:19:37.3629450Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-24T19:19:37.3629661Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-24T19:19:37.3629859Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-24T19:19:37.3630049Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-24T19:19:37.3630259Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-24T19:19:37.3630494Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-24T19:19:37.3630780Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-24T19:19:37.3631109Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-24T19:19:37.3631317Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-24T19:19:37.3631535Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-24T19:19:37.3631765Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-24T19:19:37.3632072Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-24T19:19:37.3632367Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-24T19:19:37.3632597Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-24T19:19:37.3632820Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-24T19:19:37.3633081Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-24T19:19:37.3633306Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-24T19:19:37.3633521Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-24T19:19:37.3633731Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-24T19:19:37.3633934Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-24T19:19:37.3634134Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-24T19:19:37.3634333Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-24T19:19:37.3634619Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-24T19:19:37.3634907Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-24T19:19:37.3635198Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-24T19:19:37.3635428Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-24T19:19:37.3635662Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-24T19:19:37.3635897Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-24T19:19:37.3636137Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-24T19:19:37.3636371Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-24T19:19:37.3636597Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-24T19:19:37.3636817Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-24T19:19:37.3637045Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-24T19:19:37.3637272Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-24T19:19:37.3637493Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-24T19:19:37.3637733Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-24T19:19:37.3638062Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-24T19:19:37.3638347Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:37.3638568Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3638785Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:37.3639005Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3639223Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-24T19:19:37.3639438Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-24T19:19:37.3639660Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-24T19:19:37.3639873Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-24T19:19:37.3640100Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-24T19:19:37.3640391Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-24T19:19:37.3640726Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-24T19:19:37.3640980Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-24T19:19:37.3641287Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-24T19:19:37.3641500Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-24T19:19:37.3641705Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-24T19:19:37.3641914Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-24T19:19:37.3642123Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-24T19:19:37.3642335Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-24T19:19:37.3642519Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-24T19:19:37.3642702Z Cause 1: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :ticket.
2026-08-24T19:19:37.3642849Z Required by:
2026-08-24T19:19:37.3642955Z     project :app
2026-08-24T19:19:37.3643607Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :ticket:
2026-08-24T19:19:37.3643969Z   - devApiElements
2026-08-24T19:19:37.3644107Z   - hmpApiElements
2026-08-24T19:19:37.3644241Z   - pilotoApiElements
2026-08-24T19:19:37.3644385Z   - producaoApiElements
2026-08-24T19:19:37.3644500Z All of them match the consumer attributes:
2026-08-24T19:19:37.3644767Z   - Variant 'devApiElements' capability SIECO-Android:ticket:unspecified declares a component for use during compile-time:
2026-08-24T19:19:37.3644975Z       - Unmatched attributes:
2026-08-24T19:19:37.3645231Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:37.3645549Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-24T19:19:37.3646124Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-24T19:19:37.3646387Z           - Doesn't say anything about its component category (required a library)
2026-08-24T19:19:37.3646625Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-24T19:19:37.3646907Z   - Variant 'hmpApiElements' capability SIECO-Android:ticket:unspecified declares a component for use during compile-time:
2026-08-24T19:19:37.3647107Z       - Unmatched attributes:
2026-08-24T19:19:37.3647363Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:37.3647657Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-24T19:19:37.3647960Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-24T19:19:37.3648211Z           - Doesn't say anything about its component category (required a library)
2026-08-24T19:19:37.3648443Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-24T19:19:37.3648731Z   - Variant 'pilotoApiElements' capability SIECO-Android:ticket:unspecified declares a component for use during compile-time:
2026-08-24T19:19:37.3648929Z       - Unmatched attributes:
2026-08-24T19:19:37.3649170Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:37.3649458Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-24T19:19:37.3649759Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-24T19:19:37.3650013Z           - Doesn't say anything about its component category (required a library)
2026-08-24T19:19:37.3650251Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-24T19:19:37.3650579Z   - Variant 'producaoApiElements' capability SIECO-Android:ticket:unspecified declares a component for use during compile-time:
2026-08-24T19:19:37.3650792Z       - Unmatched attributes:
2026-08-24T19:19:37.3651126Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:37.3651437Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-24T19:19:37.3651738Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-24T19:19:37.3651989Z           - Doesn't say anything about its component category (required a library)
2026-08-24T19:19:37.3652220Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-24T19:19:37.3652442Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-24T19:19:37.3652720Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-24T19:19:37.3652989Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-24T19:19:37.3653241Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-24T19:19:37.3653493Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-24T19:19:37.3653855Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-24T19:19:37.3654119Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-24T19:19:37.3654394Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-24T19:19:37.3654672Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-24T19:19:37.3654932Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-24T19:19:37.3655194Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-24T19:19:37.3655454Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-24T19:19:37.3655729Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-24T19:19:37.3655979Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-24T19:19:37.3656232Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-24T19:19:37.3656461Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-24T19:19:37.3656684Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-24T19:19:37.3656924Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-24T19:19:37.3657178Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-24T19:19:37.3657412Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:37.3657631Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3657846Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:37.3658064Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3658279Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-24T19:19:37.3658497Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-24T19:19:37.3658732Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-24T19:19:37.3658974Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-24T19:19:37.3659219Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-24T19:19:37.3659460Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-24T19:19:37.3659729Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-24T19:19:37.3660021Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-24T19:19:37.3660330Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-24T19:19:37.3660586Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-24T19:19:37.3660841Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-24T19:19:37.3661145Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-24T19:19:37.3661411Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-24T19:19:37.3661667Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-24T19:19:37.3661898Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-24T19:19:37.3662174Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-24T19:19:37.3662404Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-24T19:19:37.3662593Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-24T19:19:37.3662800Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-24T19:19:37.3663025Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-24T19:19:37.3663255Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-24T19:19:37.3663474Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-24T19:19:37.3663668Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-24T19:19:37.3663897Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-24T19:19:37.3664145Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-24T19:19:37.3664350Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-24T19:19:37.3664537Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-24T19:19:37.3664737Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-24T19:19:37.3664954Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-24T19:19:37.3665174Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-24T19:19:37.3665379Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-24T19:19:37.3665628Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-24T19:19:37.3665943Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-24T19:19:37.3666229Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:37.3666481Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3666697Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:37.3666988Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3667255Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-24T19:19:37.3667478Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-24T19:19:37.3667693Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-24T19:19:37.3667904Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-24T19:19:37.3668122Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-24T19:19:37.3668338Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-24T19:19:37.3668540Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-24T19:19:37.3668738Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-24T19:19:37.3668934Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-24T19:19:37.3669123Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-24T19:19:37.3669348Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-24T19:19:37.3669607Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-24T19:19:37.3669843Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:37.3670095Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3670320Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:37.3670527Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3670753Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-24T19:19:37.3670965Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-24T19:19:37.3671247Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-24T19:19:37.3671434Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-24T19:19:37.3671637Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-24T19:19:37.3671857Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-24T19:19:37.3672074Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-24T19:19:37.3672283Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-24T19:19:37.3672510Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-24T19:19:37.3672705Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-24T19:19:37.3672903Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-24T19:19:37.3673133Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-24T19:19:37.3673381Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-24T19:19:37.3673615Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-24T19:19:37.3673909Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-24T19:19:37.3674186Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-24T19:19:37.3674394Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-24T19:19:37.3674590Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-24T19:19:37.3674773Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-24T19:19:37.3674952Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-24T19:19:37.3675147Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-24T19:19:37.3675342Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-24T19:19:37.3675545Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-24T19:19:37.3675761Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-24T19:19:37.3675972Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-24T19:19:37.3676171Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-24T19:19:37.3676381Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-24T19:19:37.3676595Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-24T19:19:37.3676786Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-24T19:19:37.3676976Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-24T19:19:37.3677177Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-24T19:19:37.3677381Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-24T19:19:37.3677575Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-24T19:19:37.3677805Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-24T19:19:37.3678062Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-24T19:19:37.3678296Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-24T19:19:37.3678514Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-24T19:19:37.3678715Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-24T19:19:37.3678903Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-24T19:19:37.3679121Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-24T19:19:37.3679362Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-24T19:19:37.3679591Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-24T19:19:37.3679806Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-24T19:19:37.3680040Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-24T19:19:37.3680357Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-24T19:19:37.3680664Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-24T19:19:37.3680981Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-24T19:19:37.3681328Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-24T19:19:37.3681560Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-24T19:19:37.3681782Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-24T19:19:37.3681995Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-24T19:19:37.3682200Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-24T19:19:37.3682414Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-24T19:19:37.3682624Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-24T19:19:37.3682829Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-24T19:19:37.3683029Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-24T19:19:37.3683229Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-24T19:19:37.3683423Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-24T19:19:37.3683613Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-24T19:19:37.3683820Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-24T19:19:37.3684051Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-24T19:19:37.3684292Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-24T19:19:37.3684550Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-24T19:19:37.3684794Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-24T19:19:37.3685046Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-24T19:19:37.3685272Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-24T19:19:37.3685497Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-24T19:19:37.3685727Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-24T19:19:37.3685954Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-24T19:19:37.3686186Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-24T19:19:37.3686418Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-24T19:19:37.3686673Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-24T19:19:37.3686911Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:37.3687134Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3687352Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:37.3687570Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3687886Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-24T19:19:37.3688175Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-24T19:19:37.3688409Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-24T19:19:37.3688622Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-24T19:19:37.3688854Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-24T19:19:37.3689104Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-24T19:19:37.3689357Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-24T19:19:37.3689616Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-24T19:19:37.3689852Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-24T19:19:37.3690060Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-24T19:19:37.3690322Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-24T19:19:37.3690540Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-24T19:19:37.3690750Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-24T19:19:37.3690964Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-24T19:19:37.3691232Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-24T19:19:37.3691428Z Cause 2: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :core.
2026-08-24T19:19:37.3691580Z Required by:
2026-08-24T19:19:37.3691691Z     project :app
2026-08-24T19:19:37.3692261Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :core:
2026-08-24T19:19:37.3692714Z   - devApiElements
2026-08-24T19:19:37.3692909Z   - hmpApiElements
2026-08-24T19:19:37.3693072Z   - pilotoApiElements
2026-08-24T19:19:37.3693215Z   - producaoApiElements
2026-08-24T19:19:37.3693342Z All of them match the consumer attributes:
2026-08-24T19:19:37.3693753Z   - Variant 'devApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-24T19:19:37.3694067Z       - Unmatched attributes:
2026-08-24T19:19:37.3694403Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:37.3694728Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-24T19:19:37.3695035Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-24T19:19:37.3695284Z           - Doesn't say anything about its component category (required a library)
2026-08-24T19:19:37.3695516Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-24T19:19:37.3695798Z   - Variant 'hmpApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-24T19:19:37.3696088Z       - Unmatched attributes:
2026-08-24T19:19:37.3696346Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:37.3696703Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-24T19:19:37.3697078Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-24T19:19:37.3697368Z           - Doesn't say anything about its component category (required a library)
2026-08-24T19:19:37.3697604Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-24T19:19:37.3697882Z   - Variant 'pilotoApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-24T19:19:37.3698084Z       - Unmatched attributes:
2026-08-24T19:19:37.3698341Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:37.3698640Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-24T19:19:37.3698943Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-24T19:19:37.3699190Z           - Doesn't say anything about its component category (required a library)
2026-08-24T19:19:37.3699423Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-24T19:19:37.3699706Z   - Variant 'producaoApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-24T19:19:37.3699915Z       - Unmatched attributes:
2026-08-24T19:19:37.3700167Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:37.3700465Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-24T19:19:37.3700773Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-24T19:19:37.3701080Z           - Doesn't say anything about its component category (required a library)
2026-08-24T19:19:37.3701330Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-24T19:19:37.3701552Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-24T19:19:37.3701824Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-24T19:19:37.3702088Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-24T19:19:37.3702347Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-24T19:19:37.3702597Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-24T19:19:37.3702855Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-24T19:19:37.3703111Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-24T19:19:37.3703387Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-24T19:19:37.3703666Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-24T19:19:37.3704031Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-24T19:19:37.3704309Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-24T19:19:37.3704567Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-24T19:19:37.3704822Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-24T19:19:37.3705076Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-24T19:19:37.3705362Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-24T19:19:37.3705606Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-24T19:19:37.3705831Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-24T19:19:37.3706068Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-24T19:19:37.3706322Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-24T19:19:37.3706555Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:37.3706776Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3707065Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:37.3707291Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3707505Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-24T19:19:37.3707721Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-24T19:19:37.3707950Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-24T19:19:37.3708195Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-24T19:19:37.3708444Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-24T19:19:37.3708684Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-24T19:19:37.3708919Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-24T19:19:37.3709148Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-24T19:19:37.3709392Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-24T19:19:37.3709647Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-24T19:19:37.3709899Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-24T19:19:37.3710150Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-24T19:19:37.3710570Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-24T19:19:37.3710958Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-24T19:19:37.3711367Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-24T19:19:37.3711601Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-24T19:19:37.3711909Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-24T19:19:37.3712110Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-24T19:19:37.3712318Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-24T19:19:37.3712577Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-24T19:19:37.3712806Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-24T19:19:37.3713014Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-24T19:19:37.3713212Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-24T19:19:37.3713414Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-24T19:19:37.3713642Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-24T19:19:37.3713842Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-24T19:19:37.3714020Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-24T19:19:37.3714219Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-24T19:19:37.3714443Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-24T19:19:37.3714657Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-24T19:19:37.3714866Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-24T19:19:37.3715077Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-24T19:19:37.3715342Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-24T19:19:37.3715671Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:37.3716001Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3716348Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:37.3716694Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3716928Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-24T19:19:37.3717151Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-24T19:19:37.3717453Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-24T19:19:37.3717713Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-24T19:19:37.3718023Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-24T19:19:37.3718398Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-24T19:19:37.3718601Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-24T19:19:37.3718799Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-24T19:19:37.3718989Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-24T19:19:37.3719176Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-24T19:19:37.3719397Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-24T19:19:37.3719654Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-24T19:19:37.3719886Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:37.3720110Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3720327Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:37.3720601Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3720894Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-24T19:19:37.3724638Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-24T19:19:37.3724861Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-24T19:19:37.3725042Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-24T19:19:37.3725256Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-24T19:19:37.3725485Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-24T19:19:37.3725704Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-24T19:19:37.3725912Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-24T19:19:37.3726114Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-24T19:19:37.3726316Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-24T19:19:37.3726544Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-24T19:19:37.3726782Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-24T19:19:37.3727039Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-24T19:19:37.3727280Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-24T19:19:37.3727506Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-24T19:19:37.3727722Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-24T19:19:37.3727938Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-24T19:19:37.3728148Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-24T19:19:37.3728335Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-24T19:19:37.3728514Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-24T19:19:37.3728827Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-24T19:19:37.3729082Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-24T19:19:37.3729285Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-24T19:19:37.3729496Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-24T19:19:37.3729700Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-24T19:19:37.3729899Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-24T19:19:37.3730103Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-24T19:19:37.3730314Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-24T19:19:37.3730580Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-24T19:19:37.3730867Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-24T19:19:37.3731271Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-24T19:19:37.3731571Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-24T19:19:37.3731875Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-24T19:19:37.3732178Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-24T19:19:37.3732430Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-24T19:19:37.3732667Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-24T19:19:37.3732885Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-24T19:19:37.3733078Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-24T19:19:37.3733296Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-24T19:19:37.3733506Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-24T19:19:37.3733737Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-24T19:19:37.3733965Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-24T19:19:37.3734174Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-24T19:19:37.3734386Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-24T19:19:37.3734607Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-24T19:19:37.3734849Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-24T19:19:37.3735085Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-24T19:19:37.3735323Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-24T19:19:37.3735553Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-24T19:19:37.3735774Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-24T19:19:37.3735985Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-24T19:19:37.3736268Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-24T19:19:37.3736540Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-24T19:19:37.3736747Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-24T19:19:37.3736951Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-24T19:19:37.3737147Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-24T19:19:37.3737336Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-24T19:19:37.3737529Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-24T19:19:37.3737718Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-24T19:19:37.3737923Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-24T19:19:37.3738152Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-24T19:19:37.3738389Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-24T19:19:37.3738625Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-24T19:19:37.3738865Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-24T19:19:37.3739105Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-24T19:19:37.3739333Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-24T19:19:37.3739554Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-24T19:19:37.3739783Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-24T19:19:37.3740013Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-24T19:19:37.3740238Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-24T19:19:37.3740475Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-24T19:19:37.3740728Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-24T19:19:37.3740965Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:37.3741283Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3741498Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:37.3741706Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3741919Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-24T19:19:37.3742131Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-24T19:19:37.3742350Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-24T19:19:37.3742559Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-24T19:19:37.3742782Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-24T19:19:37.3743135Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-24T19:19:37.3743392Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-24T19:19:37.3743647Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-24T19:19:37.3743877Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-24T19:19:37.3744085Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-24T19:19:37.3744299Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-24T19:19:37.3744508Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-24T19:19:37.3744722Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-24T19:19:37.3744933Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-24T19:19:37.3745119Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-24T19:19:37.3745302Z Cause 3: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :dto.
2026-08-24T19:19:37.3745450Z Required by:
2026-08-24T19:19:37.3745547Z     project :app
2026-08-24T19:19:37.3746084Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :dto:
2026-08-24T19:19:37.3746416Z   - devApiElements
2026-08-24T19:19:37.3746560Z   - hmpApiElements
2026-08-24T19:19:37.3746703Z   - pilotoApiElements
2026-08-24T19:19:37.3746846Z   - producaoApiElements
2026-08-24T19:19:37.3746968Z All of them match the consumer attributes:
2026-08-24T19:19:37.3747253Z   - Variant 'devApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-24T19:19:37.3747449Z       - Unmatched attributes:
2026-08-24T19:19:37.3747708Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:37.3748005Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-24T19:19:37.3748330Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-24T19:19:37.3748573Z           - Doesn't say anything about its component category (required a library)
2026-08-24T19:19:37.3748807Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-24T19:19:37.3749079Z   - Variant 'hmpApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-24T19:19:37.3749267Z       - Unmatched attributes:
2026-08-24T19:19:37.3749516Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:37.3749804Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-24T19:19:37.3750099Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-24T19:19:37.3750343Z           - Doesn't say anything about its component category (required a library)
2026-08-24T19:19:37.3750574Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-24T19:19:37.3750954Z   - Variant 'pilotoApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-24T19:19:37.3751222Z       - Unmatched attributes:
2026-08-24T19:19:37.3751472Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:37.3751765Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-24T19:19:37.3752065Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-24T19:19:37.3752390Z           - Doesn't say anything about its component category (required a library)
2026-08-24T19:19:37.3752630Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-24T19:19:37.3752912Z   - Variant 'producaoApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-24T19:19:37.3753111Z       - Unmatched attributes:
2026-08-24T19:19:37.3753437Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:37.3753747Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-24T19:19:37.3754074Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-24T19:19:37.3754320Z           - Doesn't say anything about its component category (required a library)
2026-08-24T19:19:37.3754540Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-24T19:19:37.3754761Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-24T19:19:37.3755057Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-24T19:19:37.3755319Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-24T19:19:37.3755574Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-24T19:19:37.3755824Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-24T19:19:37.3756079Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-24T19:19:37.3756340Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-24T19:19:37.3756622Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-24T19:19:37.3756899Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-24T19:19:37.3757159Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-24T19:19:37.3757480Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-24T19:19:37.3757742Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-24T19:19:37.3757995Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-24T19:19:37.3758344Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-24T19:19:37.3758603Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-24T19:19:37.3758841Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-24T19:19:37.3759063Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-24T19:19:37.3759302Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-24T19:19:37.3759558Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-24T19:19:37.3759798Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:37.3760019Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3760235Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:37.3760454Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3760670Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-24T19:19:37.3760893Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-24T19:19:37.3761171Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-24T19:19:37.3761423Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-24T19:19:37.3761673Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-24T19:19:37.3761923Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-24T19:19:37.3762161Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-24T19:19:37.3762397Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-24T19:19:37.3762637Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-24T19:19:37.3762890Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-24T19:19:37.3763147Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-24T19:19:37.3763395Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-24T19:19:37.3763649Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-24T19:19:37.3763898Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-24T19:19:37.3764126Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-24T19:19:37.3764347Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-24T19:19:37.3764621Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-24T19:19:37.3764891Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-24T19:19:37.3765095Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-24T19:19:37.3765320Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-24T19:19:37.3765545Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-24T19:19:37.3765755Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-24T19:19:37.3765951Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-24T19:19:37.3766151Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-24T19:19:37.3766376Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-24T19:19:37.3766577Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-24T19:19:37.3766744Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-24T19:19:37.3766944Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-24T19:19:37.3767187Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-24T19:19:37.3767400Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-24T19:19:37.3767607Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-24T19:19:37.3767815Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-24T19:19:37.3768039Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-24T19:19:37.3768257Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:37.3768469Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3768683Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:37.3768901Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3769111Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-24T19:19:37.3769329Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-24T19:19:37.3769542Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-24T19:19:37.3769753Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-24T19:19:37.3769969Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-24T19:19:37.3770180Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-24T19:19:37.3770368Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-24T19:19:37.3770562Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-24T19:19:37.3770754Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-24T19:19:37.3770944Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-24T19:19:37.3771231Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-24T19:19:37.3771577Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-24T19:19:37.3771808Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:37.3772028Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3772243Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:37.3772497Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3772792Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-24T19:19:37.3773052Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-24T19:19:37.3773261Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-24T19:19:37.3773443Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-24T19:19:37.3773711Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-24T19:19:37.3774030Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-24T19:19:37.3774313Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-24T19:19:37.3774646Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-24T19:19:37.3774967Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-24T19:19:37.3775277Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-24T19:19:37.3775599Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-24T19:19:37.3775985Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-24T19:19:37.3776275Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-24T19:19:37.3776564Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-24T19:19:37.3776790Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-24T19:19:37.3777002Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-24T19:19:37.3777210Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-24T19:19:37.3777419Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-24T19:19:37.3777604Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-24T19:19:37.3777783Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-24T19:19:37.3777971Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-24T19:19:37.3778163Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-24T19:19:37.3778367Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-24T19:19:37.3778577Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-24T19:19:37.3778772Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-24T19:19:37.3778974Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-24T19:19:37.3779321Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-24T19:19:37.3779534Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-24T19:19:37.3779723Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-24T19:19:37.3779913Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-24T19:19:37.3780110Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-24T19:19:37.3780312Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-24T19:19:37.3780516Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-24T19:19:37.3780744Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-24T19:19:37.3780998Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-24T19:19:37.3781312Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-24T19:19:37.3781548Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-24T19:19:37.3781745Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-24T19:19:37.3781932Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-24T19:19:37.3782192Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-24T19:19:37.3782463Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-24T19:19:37.3782682Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-24T19:19:37.3782892Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-24T19:19:37.3783088Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-24T19:19:37.3783306Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-24T19:19:37.3783543Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-24T19:19:37.3783792Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-24T19:19:37.3784153Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-24T19:19:37.3784482Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-24T19:19:37.3784819Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-24T19:19:37.3785112Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-24T19:19:37.3785328Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-24T19:19:37.3785543Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-24T19:19:37.3785748Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-24T19:19:37.3785953Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-24T19:19:37.3786154Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-24T19:19:37.3786415Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-24T19:19:37.3786664Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-24T19:19:37.3786853Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-24T19:19:37.3787044Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-24T19:19:37.3787274Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-24T19:19:37.3787511Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-24T19:19:37.3787747Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-24T19:19:37.3787992Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-24T19:19:37.3788235Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-24T19:19:37.3788465Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-24T19:19:37.3788693Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-24T19:19:37.3788924Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-24T19:19:37.3789152Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-24T19:19:37.3789375Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-24T19:19:37.3789615Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-24T19:19:37.3789873Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-24T19:19:37.3790114Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:37.3790332Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3790546Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:37.3790762Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3790975Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-24T19:19:37.3791256Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-24T19:19:37.3791478Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-24T19:19:37.3791692Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-24T19:19:37.3791911Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-24T19:19:37.3792159Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-24T19:19:37.3792408Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-24T19:19:37.3792663Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-24T19:19:37.3792895Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-24T19:19:37.3793155Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-24T19:19:37.3793419Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-24T19:19:37.3793731Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-24T19:19:37.3794022Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-24T19:19:37.3794312Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-24T19:19:37.3794576Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-24T19:19:37.3794764Z Cause 4: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :caixaui.
2026-08-24T19:19:37.3794911Z Required by:
2026-08-24T19:19:37.3795017Z     project :app
2026-08-24T19:19:37.3795529Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :caixaui:
2026-08-24T19:19:37.3795838Z   - devApiElements
2026-08-24T19:19:37.3795974Z   - hmpApiElements
2026-08-24T19:19:37.3796101Z   - pilotoApiElements
2026-08-24T19:19:37.3796268Z   - producaoApiElements
2026-08-24T19:19:37.3796389Z All of them match the consumer attributes:
2026-08-24T19:19:37.3796651Z   - Variant 'devApiElements' capability SIECO-Android:caixaui:unspecified declares a component for use during compile-time:
2026-08-24T19:19:37.3796856Z       - Unmatched attributes:
2026-08-24T19:19:37.3797113Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:37.3797404Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-24T19:19:37.3797707Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-24T19:19:37.3797953Z           - Doesn't say anything about its component category (required a library)
2026-08-24T19:19:37.3798181Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-24T19:19:37.3798460Z   - Variant 'hmpApiElements' capability SIECO-Android:caixaui:unspecified declares a component for use during compile-time:
2026-08-24T19:19:37.3798657Z       - Unmatched attributes:
2026-08-24T19:19:37.3798910Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:37.3799199Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-24T19:19:37.3799498Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-24T19:19:37.3799744Z           - Doesn't say anything about its component category (required a library)
2026-08-24T19:19:37.3799966Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-24T19:19:37.3800246Z   - Variant 'pilotoApiElements' capability SIECO-Android:caixaui:unspecified declares a component for use during compile-time:
2026-08-24T19:19:37.3800442Z       - Unmatched attributes:
2026-08-24T19:19:37.3800694Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:37.3800988Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-24T19:19:37.3801365Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-24T19:19:37.3801712Z           - Doesn't say anything about its component category (required a library)
2026-08-24T19:19:37.3801950Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-24T19:19:37.3802264Z   - Variant 'producaoApiElements' capability SIECO-Android:caixaui:unspecified declares a component for use during compile-time:
2026-08-24T19:19:37.3802459Z       - Unmatched attributes:
2026-08-24T19:19:37.3802709Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:37.3803004Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-24T19:19:37.3803322Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-24T19:19:37.3803572Z           - Doesn't say anything about its component category (required a library)
2026-08-24T19:19:37.3803803Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-24T19:19:37.3804024Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-24T19:19:37.3804293Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-24T19:19:37.3804559Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-24T19:19:37.3804813Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-24T19:19:37.3805060Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-24T19:19:37.3805312Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-24T19:19:37.3805573Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-24T19:19:37.3805842Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-24T19:19:37.3806112Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-24T19:19:37.3806369Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-24T19:19:37.3806626Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-24T19:19:37.3806887Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-24T19:19:37.3807136Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-24T19:19:37.3807432Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-24T19:19:37.3807691Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-24T19:19:37.3807927Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-24T19:19:37.3808148Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-24T19:19:37.3808508Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-24T19:19:37.3808760Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-24T19:19:37.3808993Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:37.3809211Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3809426Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:37.3809640Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3809853Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-24T19:19:37.3810118Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-24T19:19:37.3810349Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-24T19:19:37.3810588Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-24T19:19:37.3810832Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-24T19:19:37.3811147Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-24T19:19:37.3811393Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-24T19:19:37.3811625Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-24T19:19:37.3811869Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-24T19:19:37.3812164Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-24T19:19:37.3812431Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-24T19:19:37.3812680Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-24T19:19:37.3812932Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-24T19:19:37.3813179Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-24T19:19:37.3813411Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-24T19:19:37.3813634Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-24T19:19:37.3813848Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-24T19:19:37.3814043Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-24T19:19:37.3814247Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-24T19:19:37.3814474Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-24T19:19:37.3814702Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-24T19:19:37.3815016Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-24T19:19:37.3815214Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-24T19:19:37.3815415Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-24T19:19:37.3815638Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-24T19:19:37.3815841Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-24T19:19:37.3816028Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-24T19:19:37.3816228Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-24T19:19:37.3816443Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-24T19:19:37.3816648Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-24T19:19:37.3816861Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-24T19:19:37.3817081Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-24T19:19:37.3817303Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-24T19:19:37.3817518Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:37.3817733Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3817945Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:37.3818160Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3818374Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-24T19:19:37.3818587Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-24T19:19:37.3818796Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-24T19:19:37.3818999Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-24T19:19:37.3819213Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-24T19:19:37.3819428Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-24T19:19:37.3819627Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-24T19:19:37.3819822Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-24T19:19:37.3820012Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-24T19:19:37.3820200Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-24T19:19:37.3820411Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-24T19:19:37.3820661Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-24T19:19:37.3820896Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:37.3822691Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3823001Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:37.3823304Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3823612Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-24T19:19:37.3823833Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-24T19:19:37.3824034Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-24T19:19:37.3824220Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-24T19:19:37.3824425Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-24T19:19:37.3824640Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-24T19:19:37.3824852Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-24T19:19:37.3825061Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-24T19:19:37.3825263Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-24T19:19:37.3825458Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-24T19:19:37.3825657Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-24T19:19:37.3825884Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-24T19:19:37.3826136Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-24T19:19:37.3826367Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-24T19:19:37.3826594Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-24T19:19:37.3826812Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-24T19:19:37.3827023Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-24T19:19:37.3827228Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-24T19:19:37.3827426Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-24T19:19:37.3827683Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-24T19:19:37.3827887Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-24T19:19:37.3828082Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-24T19:19:37.3828281Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-24T19:19:37.3828497Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-24T19:19:37.3828700Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-24T19:19:37.3828902Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-24T19:19:37.3829106Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-24T19:19:37.3829314Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-24T19:19:37.3829496Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-24T19:19:37.3829700Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-24T19:19:37.3829901Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-24T19:19:37.3830161Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-24T19:19:37.3830412Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-24T19:19:37.3830638Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-24T19:19:37.3830889Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-24T19:19:37.3831190Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-24T19:19:37.3831408Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-24T19:19:37.3831608Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-24T19:19:37.3831798Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-24T19:19:37.3832012Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-24T19:19:37.3832246Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-24T19:19:37.3832479Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-24T19:19:37.3832688Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-24T19:19:37.3832885Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-24T19:19:37.3833103Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-24T19:19:37.3833338Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-24T19:19:37.3833571Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-24T19:19:37.3833809Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-24T19:19:37.3834037Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-24T19:19:37.3834256Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-24T19:19:37.3834466Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-24T19:19:37.3834678Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-24T19:19:37.3834887Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-24T19:19:37.3835093Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-24T19:19:37.3835299Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-24T19:19:37.3835497Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-24T19:19:37.3835692Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-24T19:19:37.3835883Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-24T19:19:37.3836070Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-24T19:19:37.3836274Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-24T19:19:37.3836536Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-24T19:19:37.3836769Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-24T19:19:37.3837093Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-24T19:19:37.3837335Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-24T19:19:37.3837575Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-24T19:19:37.3837793Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-24T19:19:37.3838018Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-24T19:19:37.3838247Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-24T19:19:37.3838475Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-24T19:19:37.3838703Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-24T19:19:37.3838942Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-24T19:19:37.3839195Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-24T19:19:37.3839433Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:37.3839649Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3839866Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:37.3840084Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3840301Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-24T19:19:37.3840514Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-24T19:19:37.3840734Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-24T19:19:37.3840944Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-24T19:19:37.3841228Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-24T19:19:37.3841476Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-24T19:19:37.3841725Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-24T19:19:37.3841984Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-24T19:19:37.3842287Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-24T19:19:37.3842496Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-24T19:19:37.3842699Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-24T19:19:37.3842938Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-24T19:19:37.3843143Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-24T19:19:37.3843356Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-24T19:19:37.3843632Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-24T19:19:37.3843865Z Cause 5: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :payer.
2026-08-24T19:19:37.3844010Z Required by:
2026-08-24T19:19:37.3844116Z     project :app
2026-08-24T19:19:37.3844622Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :payer:
2026-08-24T19:19:37.3844934Z   - devApiElements
2026-08-24T19:19:37.3845068Z   - hmpApiElements
2026-08-24T19:19:37.3845205Z   - pilotoApiElements
2026-08-24T19:19:37.3845348Z   - producaoApiElements
2026-08-24T19:19:37.3845461Z All of them match the consumer attributes:
2026-08-24T19:19:37.3845727Z   - Variant 'devApiElements' capability SIECO-Android:payer:unspecified declares a component for use during compile-time:
2026-08-24T19:19:37.3845931Z       - Unmatched attributes:
2026-08-24T19:19:37.3846193Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:37.3846493Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-24T19:19:37.3846803Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-24T19:19:37.3847051Z           - Doesn't say anything about its component category (required a library)
2026-08-24T19:19:37.3847285Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-24T19:19:37.3847563Z   - Variant 'hmpApiElements' capability SIECO-Android:payer:unspecified declares a component for use during compile-time:
2026-08-24T19:19:37.3847763Z       - Unmatched attributes:
2026-08-24T19:19:37.3848019Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:37.3848313Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-24T19:19:37.3848613Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-24T19:19:37.3848858Z           - Doesn't say anything about its component category (required a library)
2026-08-24T19:19:37.3849089Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-24T19:19:37.3849367Z   - Variant 'pilotoApiElements' capability SIECO-Android:payer:unspecified declares a component for use during compile-time:
2026-08-24T19:19:37.3849566Z       - Unmatched attributes:
2026-08-24T19:19:37.3849810Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:37.3850112Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-24T19:19:37.3850416Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-24T19:19:37.3850666Z           - Doesn't say anything about its component category (required a library)
2026-08-24T19:19:37.3850901Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-24T19:19:37.3851243Z   - Variant 'producaoApiElements' capability SIECO-Android:payer:unspecified declares a component for use during compile-time:
2026-08-24T19:19:37.3851448Z       - Unmatched attributes:
2026-08-24T19:19:37.3851703Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:37.3852056Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-24T19:19:37.3852417Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-24T19:19:37.3852668Z           - Doesn't say anything about its component category (required a library)
2026-08-24T19:19:37.3852908Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-24T19:19:37.3853243Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-24T19:19:37.3853640Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-24T19:19:37.3854048Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-24T19:19:37.3854454Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-24T19:19:37.3854841Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-24T19:19:37.3855175Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-24T19:19:37.3855439Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-24T19:19:37.3855717Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-24T19:19:37.3855997Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-24T19:19:37.3856262Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-24T19:19:37.3856521Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-24T19:19:37.3856779Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-24T19:19:37.3857033Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-24T19:19:37.3857314Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-24T19:19:37.3857575Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-24T19:19:37.3857809Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-24T19:19:37.3858033Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-24T19:19:37.3858283Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-24T19:19:37.3858536Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-24T19:19:37.3859011Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:37.3859233Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3859535Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:37.3859808Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3860022Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-24T19:19:37.3860235Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-24T19:19:37.3860461Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-24T19:19:37.3860707Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-24T19:19:37.3860953Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-24T19:19:37.3861273Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-24T19:19:37.3861512Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-24T19:19:37.3861745Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-24T19:19:37.3861984Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-24T19:19:37.3862237Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-24T19:19:37.3862492Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-24T19:19:37.3862744Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-24T19:19:37.3862998Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-24T19:19:37.3863248Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-24T19:19:37.3863509Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-24T19:19:37.3863732Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-24T19:19:37.3863948Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-24T19:19:37.3864154Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-24T19:19:37.3864360Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-24T19:19:37.3864585Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-24T19:19:37.3864812Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-24T19:19:37.3865026Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-24T19:19:37.3865249Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-24T19:19:37.3865448Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-24T19:19:37.3865674Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-24T19:19:37.3865878Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-24T19:19:37.3866117Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-24T19:19:37.3866379Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-24T19:19:37.3866596Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-24T19:19:37.3866813Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-24T19:19:37.3867019Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-24T19:19:37.3867234Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-24T19:19:37.3867458Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-24T19:19:37.3867677Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:37.3867886Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3868106Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:37.3868322Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3868537Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-24T19:19:37.3868751Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-24T19:19:37.3868965Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-24T19:19:37.3869173Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-24T19:19:37.3869391Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-24T19:19:37.3869610Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-24T19:19:37.3869809Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-24T19:19:37.3870003Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-24T19:19:37.3870195Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-24T19:19:37.3870384Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-24T19:19:37.3870603Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-24T19:19:37.3870857Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-24T19:19:37.3871143Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:37.3871375Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3871592Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:37.3871800Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3872025Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-24T19:19:37.3872306Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-24T19:19:37.3872510Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-24T19:19:37.3872699Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-24T19:19:37.3872968Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-24T19:19:37.3873239Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-24T19:19:37.3873448Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-24T19:19:37.3873653Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-24T19:19:37.3873854Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-24T19:19:37.3874049Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-24T19:19:37.3874252Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-24T19:19:37.3874489Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-24T19:19:37.3874739Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-24T19:19:37.3874976Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-24T19:19:37.3875198Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-24T19:19:37.3875414Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-24T19:19:37.3875626Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-24T19:19:37.3875820Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-24T19:19:37.3876011Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-24T19:19:37.3876286Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-24T19:19:37.3876601Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-24T19:19:37.3876936Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-24T19:19:37.3877298Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-24T19:19:37.3877625Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-24T19:19:37.3877978Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-24T19:19:37.3878282Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-24T19:19:37.3878536Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-24T19:19:37.3878748Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-24T19:19:37.3878946Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-24T19:19:37.3879352Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-24T19:19:37.3879554Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-24T19:19:37.3879759Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-24T19:19:37.3879961Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-24T19:19:37.3880178Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-24T19:19:37.3880499Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-24T19:19:37.3880757Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-24T19:19:37.3881149Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-24T19:19:37.3881407Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-24T19:19:37.3881598Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-24T19:19:37.3881808Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-24T19:19:37.3882040Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-24T19:19:37.3882269Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-24T19:19:37.3882481Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-24T19:19:37.3882679Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-24T19:19:37.3882898Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-24T19:19:37.3883135Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-24T19:19:37.3883381Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-24T19:19:37.3883619Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-24T19:19:37.3883844Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-24T19:19:37.3884068Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-24T19:19:37.3884278Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-24T19:19:37.3884494Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-24T19:19:37.3884726Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-24T19:19:37.3884928Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-24T19:19:37.3885135Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-24T19:19:37.3885334Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-24T19:19:37.3885534Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-24T19:19:37.3885728Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-24T19:19:37.3885918Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-24T19:19:37.3886119Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-24T19:19:37.3886348Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-24T19:19:37.3886585Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-24T19:19:37.3886817Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-24T19:19:37.3887058Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-24T19:19:37.3887293Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-24T19:19:37.3887523Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-24T19:19:37.3887802Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-24T19:19:37.3888080Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-24T19:19:37.3888307Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-24T19:19:37.3888524Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-24T19:19:37.3888759Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-24T19:19:37.3889018Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-24T19:19:37.3889242Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:37.3889461Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3889678Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:37.3889894Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3890109Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-24T19:19:37.3890347Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-24T19:19:37.3890613Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-24T19:19:37.3890828Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-24T19:19:37.3891141Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-24T19:19:37.3891407Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-24T19:19:37.3891652Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-24T19:19:37.3891903Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-24T19:19:37.3892135Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-24T19:19:37.3892341Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-24T19:19:37.3892552Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-24T19:19:37.3892763Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-24T19:19:37.3892974Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-24T19:19:37.3893183Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-24T19:19:37.3893364Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-24T19:19:37.3893602Z Cause 6: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :pix.
2026-08-24T19:19:37.3893889Z Required by:
2026-08-24T19:19:37.3894042Z     project :app
2026-08-24T19:19:37.3894581Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :pix:
2026-08-24T19:19:37.3894891Z   - devApiElements
2026-08-24T19:19:37.3895099Z   - hmpApiElements
2026-08-24T19:19:37.3895241Z   - pilotoApiElements
2026-08-24T19:19:37.3895444Z   - producaoApiElements
2026-08-24T19:19:37.3895571Z All of them match the consumer attributes:
2026-08-24T19:19:37.3895919Z   - Variant 'devApiElements' capability SIECO-Android:pix:unspecified declares a library for use during compile-time, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-24T19:19:37.3896159Z       - Unmatched attributes:
2026-08-24T19:19:37.3896422Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:37.3896718Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-24T19:19:37.3897018Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-24T19:19:37.3897298Z           - Provides attribute 'org.gradle.jvm.environment' with value 'android' but the consumer didn't ask for it
2026-08-24T19:19:37.3897656Z   - Variant 'hmpApiElements' capability SIECO-Android:pix:unspecified declares a library for use during compile-time, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-24T19:19:37.3897891Z       - Unmatched attributes:
2026-08-24T19:19:37.3898188Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:37.3898484Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-24T19:19:37.3898836Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-24T19:19:37.3899184Z           - Provides attribute 'org.gradle.jvm.environment' with value 'android' but the consumer didn't ask for it
2026-08-24T19:19:37.3899611Z   - Variant 'pilotoApiElements' capability SIECO-Android:pix:unspecified declares a library for use during compile-time, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-24T19:19:37.3899848Z       - Unmatched attributes:
2026-08-24T19:19:37.3900095Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:37.3900381Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-24T19:19:37.3900675Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-24T19:19:37.3900948Z           - Provides attribute 'org.gradle.jvm.environment' with value 'android' but the consumer didn't ask for it
2026-08-24T19:19:37.3901404Z   - Variant 'producaoApiElements' capability SIECO-Android:pix:unspecified declares a library for use during compile-time, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-24T19:19:37.3901646Z       - Unmatched attributes:
2026-08-24T19:19:37.3901898Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:37.3902290Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-24T19:19:37.3902609Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-24T19:19:37.3902889Z           - Provides attribute 'org.gradle.jvm.environment' with value 'android' but the consumer didn't ask for it
2026-08-24T19:19:37.3903137Z The following variants were also considered but didn't match the requested attributes:
2026-08-24T19:19:37.3903564Z   - Variant 'devSourcesElements' capability SIECO-Android:pix:unspecified declares a component for use during runtime, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-24T19:19:37.3903925Z       - Incompatible because this component declares documentation and the consumer needed a library
2026-08-24T19:19:37.3904291Z   - Variant 'hmpSourcesElements' capability SIECO-Android:pix:unspecified declares a component for use during runtime, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-24T19:19:37.3904601Z       - Incompatible because this component declares documentation and the consumer needed a library
2026-08-24T19:19:37.3904968Z   - Variant 'pilotoSourcesElements' capability SIECO-Android:pix:unspecified declares a component for use during runtime, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-24T19:19:37.3905274Z       - Incompatible because this component declares documentation and the consumer needed a library
2026-08-24T19:19:37.3905667Z   - Variant 'producaoSourcesElements' capability SIECO-Android:pix:unspecified declares a component for use during runtime, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-24T19:19:37.3905976Z       - Incompatible because this component declares documentation and the consumer needed a library
2026-08-24T19:19:37.3906204Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-24T19:19:37.3906484Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-24T19:19:37.3906749Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-24T19:19:37.3906996Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-24T19:19:37.3907254Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-24T19:19:37.3907514Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-24T19:19:37.3907775Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-24T19:19:37.3908059Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-24T19:19:37.3908339Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-24T19:19:37.3908603Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-24T19:19:37.3908866Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-24T19:19:37.3909123Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-24T19:19:37.3909376Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-24T19:19:37.3909627Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-24T19:19:37.3909890Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-24T19:19:37.3910133Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-24T19:19:37.3910458Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-24T19:19:37.3910696Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-24T19:19:37.3910952Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-24T19:19:37.3911259Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:37.3911478Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3911694Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:37.3911927Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3912146Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-24T19:19:37.3912387Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-24T19:19:37.3912617Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-24T19:19:37.3912858Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-24T19:19:37.3913102Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-24T19:19:37.3913373Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-24T19:19:37.3913614Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-24T19:19:37.3913839Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-24T19:19:37.3914081Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-24T19:19:37.3914338Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-24T19:19:37.3914588Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-24T19:19:37.3914836Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-24T19:19:37.3915087Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-24T19:19:37.3915341Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-24T19:19:37.3915572Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-24T19:19:37.3915792Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-24T19:19:37.3916009Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-24T19:19:37.3916207Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-24T19:19:37.3916412Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-24T19:19:37.3916640Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-24T19:19:37.3916976Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-24T19:19:37.3917192Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-24T19:19:37.3917388Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-24T19:19:37.3917587Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-24T19:19:37.3917813Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-24T19:19:37.3918015Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-24T19:19:37.3918189Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-24T19:19:37.3918384Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-24T19:19:37.3918592Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-24T19:19:37.3918807Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-24T19:19:37.3919013Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-24T19:19:37.3919245Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-24T19:19:37.3919464Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-24T19:19:37.3919680Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:37.3919892Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3920106Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:37.3920344Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3920556Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-24T19:19:37.3920764Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-24T19:19:37.3920975Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-24T19:19:37.3921242Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-24T19:19:37.3921465Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-24T19:19:37.3921674Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-24T19:19:37.3921876Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-24T19:19:37.3922071Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-24T19:19:37.3922415Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-24T19:19:37.3922611Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-24T19:19:37.3922834Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-24T19:19:37.3923089Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-24T19:19:37.3923322Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:37.3923598Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3923936Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:37.3924219Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3924433Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-24T19:19:37.3924649Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-24T19:19:37.3924853Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-24T19:19:37.3925040Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-24T19:19:37.3925246Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-24T19:19:37.3925467Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-24T19:19:37.3925691Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-24T19:19:37.3925899Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-24T19:19:37.3926123Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-24T19:19:37.3926321Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-24T19:19:37.3926513Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-24T19:19:37.3926753Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-24T19:19:37.3926998Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-24T19:19:37.3927245Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-24T19:19:37.3927472Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-24T19:19:37.3927694Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-24T19:19:37.3927905Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-24T19:19:37.3928113Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-24T19:19:37.3928297Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-24T19:19:37.3928475Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-24T19:19:37.3928665Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-24T19:19:37.3928858Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-24T19:19:37.3929062Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-24T19:19:37.3929277Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-24T19:19:37.3929481Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-24T19:19:37.3929705Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-24T19:19:37.3930000Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-24T19:19:37.3930218Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-24T19:19:37.3930411Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-24T19:19:37.3930599Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-24T19:19:37.3930871Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-24T19:19:37.3931182Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-24T19:19:37.3931386Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-24T19:19:37.3931612Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-24T19:19:37.3931855Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-24T19:19:37.3932085Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-24T19:19:37.3947992Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-24T19:19:37.3948264Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-24T19:19:37.3948476Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-24T19:19:37.3948688Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-24T19:19:37.3948927Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-24T19:19:37.3949156Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-24T19:19:37.3949369Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-24T19:19:37.3949576Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-24T19:19:37.3949801Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-24T19:19:37.3950035Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-24T19:19:37.3950281Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-24T19:19:37.3950516Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-24T19:19:37.3950747Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-24T19:19:37.3950968Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-24T19:19:37.3951267Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-24T19:19:37.3951484Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-24T19:19:37.3951703Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-24T19:19:37.3951910Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-24T19:19:37.3952179Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-24T19:19:37.3952397Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-24T19:19:37.3952598Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-24T19:19:37.3952795Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-24T19:19:37.3952983Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-24T19:19:37.3953217Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-24T19:19:37.3953454Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-24T19:19:37.3953981Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-24T19:19:37.3954216Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-24T19:19:37.3954458Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-24T19:19:37.3954685Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-24T19:19:37.3954915Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-24T19:19:37.3955142Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-24T19:19:37.3955371Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-24T19:19:37.3955598Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-24T19:19:37.3955822Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-24T19:19:37.3956061Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-24T19:19:37.3956314Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-24T19:19:37.3956551Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:37.3956771Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3956986Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:37.3957207Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:37.3957416Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-24T19:19:37.3957630Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-24T19:19:37.3957848Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-24T19:19:37.3958058Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-24T19:19:37.3958286Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-24T19:19:37.3958534Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-24T19:19:37.3958782Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-24T19:19:37.3959037Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-24T19:19:37.3959270Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-24T19:19:37.3959469Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-24T19:19:37.3959681Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-24T19:19:37.3959889Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-24T19:19:37.3960114Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-24T19:19:37.3960402Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-24T19:19:37.3960666Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-24T19:19:37.5761746Z 
2026-08-24T19:19:37.5781701Z > Task :caixaui:spec
2026-08-24T19:19:37.5782171Z WARNING: We recommend using a newer Android Gradle plugin to use compileSdk = 35
2026-08-24T19:19:37.5782539Z 
2026-08-24T19:19:37.5783006Z This Android Gradle plugin (8.1.1) was tested up to compileSdk = 34.
2026-08-24T19:19:37.5785959Z 
2026-08-24T19:19:37.5786350Z You are strongly encouraged to update your project to use a newer
2026-08-24T19:19:37.5786647Z Android Gradle plugin that has been tested with compileSdk = 35.
2026-08-24T19:19:37.5786780Z 
2026-08-24T19:19:37.5787792Z If you are already using the latest version of the Android Gradle plugin,
2026-08-24T19:19:37.5814800Z you may need to wait until a newer version with support for compileSdk = 35 is available.
2026-08-24T19:19:37.5815089Z 
2026-08-24T19:19:37.5815308Z To suppress this warning, add/update
2026-08-24T19:19:37.5815628Z     android.suppressUnsupportedCompileSdk=36,35
2026-08-24T19:19:37.5816096Z to this project's gradle.properties.
2026-08-24T19:19:37.6731305Z 
2026-08-24T19:19:37.6735636Z > Task :core:spec
2026-08-24T19:19:37.7701678Z > Task :dto:spec
2026-08-24T19:19:37.8822419Z > Task :payer:spec
2026-08-24T19:19:38.1699321Z 
2026-08-24T19:19:38.1703254Z > Task :pix:spec
2026-08-24T19:19:38.1707948Z Can't resolve artifacts for implementationDependenciesMetadata configuration. Artifacts are ignored.
2026-08-24T19:19:38.1721892Z org.gradle.internal.exceptions.DefaultMultiCauseException: Could not resolve all files for configuration ':pix:implementationDependenciesMetadata'.
2026-08-24T19:19:38.1722444Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.mapFailure(DefaultConfiguration.java:1716)
2026-08-24T19:19:38.1723002Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$3400(DefaultConfiguration.java:177)
2026-08-24T19:19:38.1725183Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$DefaultResolutionHost.mapFailure(DefaultConfiguration.java:2443)
2026-08-24T19:19:38.1725515Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionHost.rethrowFailure(ResolutionHost.java:30)
2026-08-24T19:19:38.1725926Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:74)
2026-08-24T19:19:38.1727452Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-24T19:19:38.1727788Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-24T19:19:38.1728139Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-24T19:19:38.1728460Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-24T19:19:38.1728805Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-24T19:19:38.1729222Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-24T19:19:38.1729603Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-24T19:19:38.1729957Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-24T19:19:38.1730277Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-24T19:19:38.1736574Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-24T19:19:38.1830963Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-24T19:19:38.1831824Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-24T19:19:38.1832537Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-24T19:19:38.1832923Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-24T19:19:38.1833307Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-24T19:19:38.1833588Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-24T19:19:38.1833998Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-24T19:19:38.1834199Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-24T19:19:38.1834422Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-24T19:19:38.1834637Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:38.1834875Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:38.1835096Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:38.1835318Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:38.1835532Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-24T19:19:38.1835747Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-24T19:19:38.1835962Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-24T19:19:38.1836181Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-24T19:19:38.1836398Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-24T19:19:38.1836615Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-24T19:19:38.1836835Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-24T19:19:38.1837103Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-24T19:19:38.1837379Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-24T19:19:38.1837635Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-24T19:19:38.1837861Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-24T19:19:38.1838115Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-24T19:19:38.1838342Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:38.1838563Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:38.1838821Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:38.1839131Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:38.1839414Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-24T19:19:38.1839655Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-24T19:19:38.1839859Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-24T19:19:38.1840044Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-24T19:19:38.1840504Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-24T19:19:38.1840802Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-24T19:19:38.1841119Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-24T19:19:38.1841338Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-24T19:19:38.1841540Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-24T19:19:38.1841733Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-24T19:19:38.1841995Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-24T19:19:38.1842245Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-24T19:19:38.1842508Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-24T19:19:38.1842740Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-24T19:19:38.1842954Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-24T19:19:38.1843217Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-24T19:19:38.1843483Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-24T19:19:38.1843689Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-24T19:19:38.1843872Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-24T19:19:38.1844049Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-24T19:19:38.1844243Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-24T19:19:38.1844438Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-24T19:19:38.1844643Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-24T19:19:38.1844857Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-24T19:19:38.1845070Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-24T19:19:38.1845272Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-24T19:19:38.1845480Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-24T19:19:38.1845692Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-24T19:19:38.1845888Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-24T19:19:38.1846078Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-24T19:19:38.1846272Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-24T19:19:38.1846472Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-24T19:19:38.1846711Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-24T19:19:38.1846997Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-24T19:19:38.1847256Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-24T19:19:38.1847493Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-24T19:19:38.1847825Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-24T19:19:38.1848033Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-24T19:19:38.1848227Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-24T19:19:38.1848439Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-24T19:19:38.1848669Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-24T19:19:38.1848909Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-24T19:19:38.1849119Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-24T19:19:38.1849323Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-24T19:19:38.1849545Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-24T19:19:38.1849787Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-24T19:19:38.1850068Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-24T19:19:38.1850327Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-24T19:19:38.1850647Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-24T19:19:38.1850861Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-24T19:19:38.1851154Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-24T19:19:38.1851387Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-24T19:19:38.1851599Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-24T19:19:38.1851809Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-24T19:19:38.1852012Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-24T19:19:38.1852212Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-24T19:19:38.1852414Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-24T19:19:38.1852613Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-24T19:19:38.1852802Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-24T19:19:38.1853013Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-24T19:19:38.1853340Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-24T19:19:38.1853614Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-24T19:19:38.1853851Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-24T19:19:38.1854092Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-24T19:19:38.1854404Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-24T19:19:38.1854715Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-24T19:19:38.1855031Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-24T19:19:38.1855306Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-24T19:19:38.1855535Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-24T19:19:38.1855759Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-24T19:19:38.1855996Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-24T19:19:38.1856249Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-24T19:19:38.1856489Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:38.1856716Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:38.1857009Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:38.1857333Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:38.1857595Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-24T19:19:38.1857816Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-24T19:19:38.1858041Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-24T19:19:38.1858260Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-24T19:19:38.1858494Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-24T19:19:38.1858748Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-24T19:19:38.1859005Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-24T19:19:38.1859264Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-24T19:19:38.1859503Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-24T19:19:38.1859720Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-24T19:19:38.1859984Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-24T19:19:38.1860236Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-24T19:19:38.1860518Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-24T19:19:38.1860747Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-24T19:19:38.1860933Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-24T19:19:38.1861198Z Cause 1: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :core.
2026-08-24T19:19:38.1861351Z Required by:
2026-08-24T19:19:38.1861462Z     project :pix
2026-08-24T19:19:38.1862065Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :core:
2026-08-24T19:19:38.1862475Z   - devApiElements
2026-08-24T19:19:38.1862674Z   - hmpApiElements
2026-08-24T19:19:38.1862817Z   - pilotoApiElements
2026-08-24T19:19:38.1862958Z   - producaoApiElements
2026-08-24T19:19:38.1863089Z All of them match the consumer attributes:
2026-08-24T19:19:38.1863436Z   - Variant 'devApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-24T19:19:38.1863667Z       - Unmatched attributes:
2026-08-24T19:19:38.1863931Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:38.1864225Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-24T19:19:38.1864527Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-24T19:19:38.1864780Z           - Doesn't say anything about its component category (required a library)
2026-08-24T19:19:38.1865015Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-24T19:19:38.1865342Z   - Variant 'hmpApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-24T19:19:38.1865600Z       - Unmatched attributes:
2026-08-24T19:19:38.1865850Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:38.1866210Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-24T19:19:38.1866519Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-24T19:19:38.1866766Z           - Doesn't say anything about its component category (required a library)
2026-08-24T19:19:38.1867006Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-24T19:19:38.1867318Z   - Variant 'pilotoApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-24T19:19:38.1867517Z       - Unmatched attributes:
2026-08-24T19:19:38.1867768Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:38.1868059Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-24T19:19:38.1868359Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-24T19:19:38.1868603Z           - Doesn't say anything about its component category (required a library)
2026-08-24T19:19:38.1868825Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-24T19:19:38.1869108Z   - Variant 'producaoApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-24T19:19:38.1869316Z       - Unmatched attributes:
2026-08-24T19:19:38.1869567Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:38.1869862Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-24T19:19:38.1870167Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-24T19:19:38.1870477Z           - Doesn't say anything about its component category (required a library)
2026-08-24T19:19:38.1870716Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-24T19:19:38.1871068Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-24T19:19:38.1871390Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-24T19:19:38.1871652Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-24T19:19:38.1871956Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-24T19:19:38.1872224Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-24T19:19:38.1872481Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-24T19:19:38.1872751Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-24T19:19:38.1873027Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-24T19:19:38.1873389Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-24T19:19:38.1873652Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-24T19:19:38.1873913Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-24T19:19:38.1874174Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-24T19:19:38.1874430Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-24T19:19:38.1874686Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-24T19:19:38.1874948Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-24T19:19:38.1875190Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-24T19:19:38.1875412Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-24T19:19:38.1875643Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-24T19:19:38.1875903Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-24T19:19:38.1876142Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:38.1876363Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:38.1876584Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:38.1876809Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:38.1877028Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-24T19:19:38.1877245Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-24T19:19:38.1877498Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-24T19:19:38.1877854Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-24T19:19:38.1878104Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-24T19:19:38.1878348Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-24T19:19:38.1878585Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-24T19:19:38.1878821Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-24T19:19:38.1879102Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-24T19:19:38.1879464Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-24T19:19:38.1879752Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-24T19:19:38.1880002Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-24T19:19:38.1880258Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-24T19:19:38.1880589Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-24T19:19:38.1880823Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-24T19:19:38.1881113Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-24T19:19:38.1881340Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-24T19:19:38.1881541Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-24T19:19:38.1881745Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-24T19:19:38.1881959Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-24T19:19:38.1882184Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-24T19:19:38.1882396Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-24T19:19:38.1882591Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-24T19:19:38.1882793Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-24T19:19:38.1883024Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-24T19:19:38.1883299Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-24T19:19:38.1883520Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-24T19:19:38.1883720Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-24T19:19:38.1883936Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-24T19:19:38.1884153Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-24T19:19:38.1884404Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-24T19:19:38.1884682Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-24T19:19:38.1884976Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-24T19:19:38.1885194Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:38.1885405Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:38.1885614Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:38.1885821Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:38.1886032Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-24T19:19:38.1886243Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-24T19:19:38.1886456Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-24T19:19:38.1886661Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-24T19:19:38.1886876Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-24T19:19:38.1887089Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-24T19:19:38.1887287Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-24T19:19:38.1887488Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-24T19:19:38.1887677Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-24T19:19:38.1887869Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-24T19:19:38.1888095Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-24T19:19:38.1888349Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-24T19:19:38.1888580Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:38.1888796Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:38.1889010Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:38.1889223Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:38.1889433Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-24T19:19:38.1889638Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-24T19:19:38.1889838Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-24T19:19:38.1890021Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-24T19:19:38.1890222Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-24T19:19:38.1890438Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-24T19:19:38.1890648Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-24T19:19:38.1890853Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-24T19:19:38.1891151Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-24T19:19:38.1891410Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-24T19:19:38.1891680Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-24T19:19:38.1891917Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-24T19:19:38.1892169Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-24T19:19:38.1892401Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-24T19:19:38.1892626Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-24T19:19:38.1892842Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-24T19:19:38.1893053Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-24T19:19:38.1893264Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-24T19:19:38.1893578Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-24T19:19:38.1893819Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-24T19:19:38.1894094Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-24T19:19:38.1894308Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-24T19:19:38.1894512Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-24T19:19:38.1894732Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-24T19:19:38.1894940Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-24T19:19:38.1895140Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-24T19:19:38.1895347Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-24T19:19:38.1895557Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-24T19:19:38.1895749Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-24T19:19:38.1895935Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-24T19:19:38.1896132Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-24T19:19:38.1896334Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-24T19:19:38.1896531Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-24T19:19:38.1896754Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-24T19:19:38.1896997Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-24T19:19:38.1897227Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-24T19:19:38.1897437Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-24T19:19:38.1897637Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-24T19:19:38.1897824Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-24T19:19:38.1898034Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-24T19:19:38.1898270Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-24T19:19:38.1898566Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-24T19:19:38.1898827Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-24T19:19:38.1899029Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-24T19:19:38.1899246Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-24T19:19:38.1899482Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-24T19:19:38.1899725Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-24T19:19:38.1899963Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-24T19:19:38.1900197Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-24T19:19:38.1900423Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-24T19:19:38.1900636Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-24T19:19:38.1900850Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-24T19:19:38.1901138Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-24T19:19:38.1901345Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-24T19:19:38.1901547Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-24T19:19:38.1901748Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-24T19:19:38.1901995Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-24T19:19:38.1902204Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-24T19:19:38.1902392Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-24T19:19:38.1902589Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-24T19:19:38.1902818Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-24T19:19:38.1903059Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-24T19:19:38.1903294Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-24T19:19:38.1903531Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-24T19:19:38.1903771Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-24T19:19:38.1903998Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-24T19:19:38.1904216Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-24T19:19:38.1904442Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-24T19:19:38.1904670Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-24T19:19:38.1904889Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-24T19:19:38.1905149Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-24T19:19:38.1905491Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-24T19:19:38.1905729Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:38.1905939Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:38.1906153Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:38.1906365Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:38.1906579Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-24T19:19:38.1906789Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-24T19:19:38.1907013Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-24T19:19:38.1907220Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-24T19:19:38.1907445Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-24T19:19:38.1907688Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-24T19:19:38.1907932Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-24T19:19:38.1908180Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-24T19:19:38.1908414Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-24T19:19:38.1908622Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-24T19:19:38.1908832Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-24T19:19:38.1909035Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-24T19:19:38.1909236Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-24T19:19:38.1909445Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-24T19:19:38.1909623Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-24T19:19:38.1909802Z Cause 2: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :dto.
2026-08-24T19:19:38.1909936Z Required by:
2026-08-24T19:19:38.1910040Z     project :pix
2026-08-24T19:19:38.1910564Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :dto:
2026-08-24T19:19:38.1910877Z   - devApiElements
2026-08-24T19:19:38.1911123Z   - hmpApiElements
2026-08-24T19:19:38.1911283Z   - pilotoApiElements
2026-08-24T19:19:38.1911426Z   - producaoApiElements
2026-08-24T19:19:38.1911548Z All of them match the consumer attributes:
2026-08-24T19:19:38.1911811Z   - Variant 'devApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-24T19:19:38.1912011Z       - Unmatched attributes:
2026-08-24T19:19:38.1912278Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:38.1912635Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-24T19:19:38.1912994Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-24T19:19:38.1913245Z           - Doesn't say anything about its component category (required a library)
2026-08-24T19:19:38.1913474Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-24T19:19:38.1913752Z   - Variant 'hmpApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-24T19:19:38.1913952Z       - Unmatched attributes:
2026-08-24T19:19:38.1914206Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:38.1914496Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-24T19:19:38.1914791Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-24T19:19:38.1915037Z           - Doesn't say anything about its component category (required a library)
2026-08-24T19:19:38.1915270Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-24T19:19:38.1915573Z   - Variant 'pilotoApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-24T19:19:38.1915769Z       - Unmatched attributes:
2026-08-24T19:19:38.1916020Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:38.1916309Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-24T19:19:38.1916605Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-24T19:19:38.1916860Z           - Doesn't say anything about its component category (required a library)
2026-08-24T19:19:38.1917092Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-24T19:19:38.1917367Z   - Variant 'producaoApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-24T19:19:38.1917565Z       - Unmatched attributes:
2026-08-24T19:19:38.1917808Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-24T19:19:38.1918106Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-24T19:19:38.1918416Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-24T19:19:38.1918672Z           - Doesn't say anything about its component category (required a library)
2026-08-24T19:19:38.1918903Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-24T19:19:38.1919125Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-24T19:19:38.1919397Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-24T19:19:38.1919666Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-24T19:19:38.1919923Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-24T19:19:38.1920242Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-24T19:19:38.1920558Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-24T19:19:38.1920815Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-24T19:19:38.1921153Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-24T19:19:38.1921440Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-24T19:19:38.1921697Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-24T19:19:38.1922031Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-24T19:19:38.1922430Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-24T19:19:38.1922765Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-24T19:19:38.1923142Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-24T19:19:38.1923536Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-24T19:19:38.1923794Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-24T19:19:38.1924014Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-24T19:19:38.1924254Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-24T19:19:38.1924505Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-24T19:19:38.1924739Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:38.1924956Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:38.1925166Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:38.1925382Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:38.1925588Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-24T19:19:38.1925805Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-24T19:19:38.1926033Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-24T19:19:38.1926277Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-24T19:19:38.1926522Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-24T19:19:38.1926759Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-24T19:19:38.1926996Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-24T19:19:38.1927319Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-24T19:19:38.1927618Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-24T19:19:38.1927866Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-24T19:19:38.1928118Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-24T19:19:38.1928366Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-24T19:19:38.1928621Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-24T19:19:38.1928873Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-24T19:19:38.1929190Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-24T19:19:38.1929518Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-24T19:19:38.1929737Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-24T19:19:38.1929933Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-24T19:19:38.1930137Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-24T19:19:38.1930363Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-24T19:19:38.1930594Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-24T19:19:38.1930830Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-24T19:19:38.1931087Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-24T19:19:38.1931291Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-24T19:19:38.1931520Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-24T19:19:38.1931722Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-24T19:19:38.1931947Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-24T19:19:38.1932157Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-24T19:19:38.1932374Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-24T19:19:38.1932589Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-24T19:19:38.1932793Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-24T19:19:38.1933002Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-24T19:19:38.1933226Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-24T19:19:38.1933440Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:38.1933655Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:38.1933869Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:38.1934151Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:38.1934429Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-24T19:19:38.1934644Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-24T19:19:38.1934934Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-24T19:19:38.1935139Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-24T19:19:38.1935355Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-24T19:19:38.1935566Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-24T19:19:38.1935767Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-24T19:19:38.1935964Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-24T19:19:38.1936146Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-24T19:19:38.1936333Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-24T19:19:38.1936557Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-24T19:19:38.1936806Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-24T19:19:38.1937036Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:38.1937254Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:38.1937470Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:38.1937692Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:38.1937906Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-24T19:19:38.1938125Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-24T19:19:38.1938326Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-24T19:19:38.1938510Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-24T19:19:38.1938713Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-24T19:19:38.1938934Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-24T19:19:38.1939150Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-24T19:19:38.1939362Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-24T19:19:38.1939560Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-24T19:19:38.1939757Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-24T19:19:38.1939949Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-24T19:19:38.1940246Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-24T19:19:38.1940586Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-24T19:19:38.1940890Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-24T19:19:38.1941246Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-24T19:19:38.1941515Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-24T19:19:38.1941726Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-24T19:19:38.1941934Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-24T19:19:38.1942118Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-24T19:19:38.1942296Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-24T19:19:38.1942488Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-24T19:19:38.1942681Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-24T19:19:38.1942914Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-24T19:19:38.1943132Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-24T19:19:38.1943337Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-24T19:19:38.1943549Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-24T19:19:38.1943752Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-24T19:19:38.1943951Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-24T19:19:38.1944144Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-24T19:19:38.1944328Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-24T19:19:38.1944531Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-24T19:19:38.1944736Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-24T19:19:38.1944939Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-24T19:19:38.1945166Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-24T19:19:38.1945417Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-24T19:19:38.1945649Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-24T19:19:38.1945857Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-24T19:19:38.1946053Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-24T19:19:38.1946272Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-24T19:19:38.1946485Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-24T19:19:38.1946714Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-24T19:19:38.1946939Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-24T19:19:38.1947147Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-24T19:19:38.1947344Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-24T19:19:38.1947553Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-24T19:19:38.1947788Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-24T19:19:38.1948084Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-24T19:19:38.1948374Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-24T19:19:38.1948605Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-24T19:19:38.1948827Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-24T19:19:38.1949038Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-24T19:19:38.1949250Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-24T19:19:38.1949459Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-24T19:19:38.1949666Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-24T19:19:38.1949871Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-24T19:19:38.1950070Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-24T19:19:38.1950267Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-24T19:19:38.1950458Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-24T19:19:38.1950642Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-24T19:19:38.1950840Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-24T19:19:38.1951119Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-24T19:19:38.1951366Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-24T19:19:38.1951602Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-24T19:19:38.1951834Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-24T19:19:38.1952074Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-24T19:19:38.1952382Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-24T19:19:38.1952617Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-24T19:19:38.1952847Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-24T19:19:38.1953075Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-24T19:19:38.1953306Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-24T19:19:38.1953538Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-24T19:19:38.1953788Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-24T19:19:38.1954024Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-24T19:19:38.1954240Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:38.1954449Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-24T19:19:38.1954719Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-24T19:19:38.1954981Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-24T19:19:38.1955196Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-24T19:19:38.1955416Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-24T19:19:38.1955627Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-24T19:19:38.1955854Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-24T19:19:38.1956105Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-24T19:19:38.1956354Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-24T19:19:38.1956614Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-24T19:19:38.1956845Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-24T19:19:38.1957048Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-24T19:19:38.1957261Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-24T19:19:38.1957471Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-24T19:19:38.1957679Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-24T19:19:38.1957888Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-24T19:19:38.1958072Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-24T19:19:38.3700176Z 
2026-08-24T19:19:38.3700817Z > Task :ticket:spec
2026-08-24T19:19:38.3701114Z 
2026-08-24T19:19:38.3701278Z Deprecated Gradle features were used in this build, making it incompatible with Gradle 9.0.
2026-08-24T19:19:38.3701363Z 
2026-08-24T19:19:38.3701736Z You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.
2026-08-24T19:19:38.3701843Z 
2026-08-24T19:19:38.3702021Z See https://docs.gradle.org/8.1/userguide/command_line_interface.html#sec:command_line_warnings
2026-08-24T19:19:38.3702123Z 
2026-08-24T19:19:38.3702236Z BUILD SUCCESSFUL in 10s
2026-08-24T19:19:38.3702475Z 8 actionable tasks: 8 executed
2026-08-24T19:19:38.9588900Z Packaging project...
2026-08-24T19:19:47.7901387Z Compressing job files...
2026-08-24T19:19:53.0347828Z Uploading job...
2026-08-24T19:19:56.4137298Z ErrorResponse: Failed to access application version: sieco-android-1.4.8. Access denied. Unauthorized.
2026-08-24T19:19:56.4137977Z Uploading of job to Controller failed with error
2026-08-24T19:19:56.4138452Z ErrorResponse: Failed to access application version: sieco-android-1.4.8. Access denied. Unauthorized.
2026-08-24T19:19:56.4139203Z Shutting down with errors. Please see log for details.
2026-08-24T19:19:56.5165554Z ##[debug]Exit code 1 received from tool '/bin/bash'
2026-08-24T19:19:56.5192979Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-08-24T19:19:56.5194552Z ##[error]Bash exited with code '1'.
2026-08-24T19:19:56.5195067Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '1'.
2026-08-24T19:19:56.5195359Z ##[debug]task result: Failed
2026-08-24T19:19:56.5196427Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-08-24T19:19:56.5210015Z ##[section]Finishing: Iniciando Análise no Fortify


<img width="1686" height="903" alt="image" src="https://github.com/user-attachments/assets/eb000f5f-36cd-4a86-88ca-ee779bfb5a76" />


<img width="1683" height="961" alt="image" src="https://github.com/user-attachments/assets/4f4de4e8-d9d7-46c2-8588-72eb35b27b9b" />
dia 20 teve essa mudança


Dia 24 essa

<img width="1612" height="649" alt="image" src="https://github.com/user-attachments/assets/93936095-209f-4964-8915-795ba6af013f" />






