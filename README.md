2026-08-20T15:36:29.5709095Z ##[debug]Evaluating condition for step: 'Iniciando Análise no Fortify'
2026-08-20T15:36:29.5710118Z ##[debug]Evaluating: and(succeeded(), ne(variables['fortify_disable'], 'gecmi'), ne(variables['p_language'], 'dotnet'))
2026-08-20T15:36:29.5710305Z ##[debug]Evaluating and:
2026-08-20T15:36:29.5710446Z ##[debug]..Evaluating succeeded:
2026-08-20T15:36:29.5710928Z ##[debug]..=> True
2026-08-20T15:36:29.5711079Z ##[debug]..Evaluating ne:
2026-08-20T15:36:29.5711212Z ##[debug]....Evaluating indexer:
2026-08-20T15:36:29.5711351Z ##[debug]......Evaluating variables:
2026-08-20T15:36:29.5711554Z ##[debug]......=> Object
2026-08-20T15:36:29.5711698Z ##[debug]......Evaluating String:
2026-08-20T15:36:29.5711866Z ##[debug]......=> 'fortify_disable'
2026-08-20T15:36:29.5712062Z ##[debug]....=> ''
2026-08-20T15:36:29.5712191Z ##[debug]....Evaluating String:
2026-08-20T15:36:29.5712335Z ##[debug]....=> 'gecmi'
2026-08-20T15:36:29.5712461Z ##[debug]..=> True
2026-08-20T15:36:29.5712581Z ##[debug]..Evaluating ne:
2026-08-20T15:36:29.5712743Z ##[debug]....Evaluating indexer:
2026-08-20T15:36:29.5712877Z ##[debug]......Evaluating variables:
2026-08-20T15:36:29.5712998Z ##[debug]......=> Object
2026-08-20T15:36:29.5713176Z ##[debug]......Evaluating String:
2026-08-20T15:36:29.5713323Z ##[debug]......=> 'p_language'
2026-08-20T15:36:29.5713529Z ##[debug]....=> 'android'
2026-08-20T15:36:29.5713672Z ##[debug]....Evaluating String:
2026-08-20T15:36:29.5713807Z ##[debug]....=> 'dotnet'
2026-08-20T15:36:29.5713914Z ##[debug]..=> True
2026-08-20T15:36:29.5714011Z ##[debug]=> True
2026-08-20T15:36:29.5714317Z ##[debug]Expanded: and(True, ne('', 'gecmi'), ne('android', 'dotnet'))
2026-08-20T15:36:29.5714521Z ##[debug]Result: True
2026-08-20T15:36:29.5714741Z ##[section]Starting: Iniciando Análise no Fortify
2026-08-20T15:36:29.5718108Z ==============================================================================
2026-08-20T15:36:29.5718337Z Task         : Bash
2026-08-20T15:36:29.5718404Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-20T15:36:29.5718519Z Version      : 3.227.0
2026-08-20T15:36:29.5718586Z Author       : Microsoft Corporation
2026-08-20T15:36:29.5718659Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-20T15:36:29.5718772Z ==============================================================================
2026-08-20T15:36:29.6071189Z ##[debug]Using node path: /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/externals/node16/bin/node
2026-08-20T15:36:29.6169378Z Warning: Ignoring extra certs from `/etc/pki/ca-trust/source/anchors/AC-V4.cer`, load failed: error:02001002:system library:fopen:No such file or directory
2026-08-20T15:36:29.6897036Z ##[debug]agent.TempDirectory=/opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp
2026-08-20T15:36:29.6905144Z ##[debug]loading inputs and endpoints
2026-08-20T15:36:29.6908279Z ##[debug]loading INPUT_TARGETTYPE
2026-08-20T15:36:29.6971588Z ##[debug]loading INPUT_FILEPATH
2026-08-20T15:36:29.6972023Z ##[debug]loading INPUT_SCRIPT
2026-08-20T15:36:29.6972438Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-08-20T15:36:29.6973521Z ##[debug]loading INPUT_FAILONSTDERR
2026-08-20T15:36:29.6974288Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-08-20T15:36:29.6974755Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-08-20T15:36:29.6975199Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-08-20T15:36:29.6975615Z ##[debug]loading SECRET_APIJSONGOOGLE
2026-08-20T15:36:29.6975995Z ##[debug]loading SECRET_FORTIFY_REGISTRY_PASSWORD
2026-08-20T15:36:29.6976388Z ##[debug]loading SECRET_KEYSTORE_PWD
2026-08-20T15:36:29.6976766Z ##[debug]loading SECRET_FORTIFY_TOKEN
2026-08-20T15:36:29.6977159Z ##[debug]loading SECRET_NEXUS_INTERNO_PASS
2026-08-20T15:36:29.6977542Z ##[debug]loading SECRET_FORTIFY_UPTOKEN
2026-08-20T15:36:29.6977929Z ##[debug]loading SECRET_FORTIFY_CI_TOKEN
2026-08-20T15:36:29.6978489Z ##[debug]loading SECRET_SCANCENTRAL_CLIENTTOKEN
2026-08-20T15:36:29.6978897Z ##[debug]loading SECRET_FORTIFY_CLIENT_AUTH_TOKEN
2026-08-20T15:36:29.6979617Z ##[debug]loading SECRET_SCANCENTRAL_SSCCITOKEN
2026-08-20T15:36:29.6980132Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-08-20T15:36:29.6980513Z ##[debug]loading SECRET_FORTIFY_PASS
2026-08-20T15:36:29.6981353Z ##[debug]loading SECRET_KEYSTOREPASS
2026-08-20T15:36:29.6981805Z ##[debug]loading SECRET_GITTOKEN
2026-08-20T15:36:29.6982066Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-08-20T15:36:29.6982311Z ##[debug]loading SECRET_TOKEN_CRQ
2026-08-20T15:36:29.6982548Z ##[debug]loading SECRET_AZPAT
2026-08-20T15:36:29.6982788Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-08-20T15:36:29.6983032Z ##[debug]loading SECRET_FIREBASE_TOKEN
2026-08-20T15:36:29.6983255Z ##[debug]loaded 27
2026-08-20T15:36:29.6983483Z ##[debug]Agent.ProxyUrl=undefined
2026-08-20T15:36:29.6983714Z ##[debug]Agent.CAInfo=undefined
2026-08-20T15:36:29.6983961Z ##[debug]Agent.ClientCert=undefined
2026-08-20T15:36:29.6984195Z ##[debug]Agent.SkipCertValidation=True
2026-08-20T15:36:29.6990386Z ##[debug]check path : /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-08-20T15:36:29.6991092Z ##[debug]adding resource file: /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-08-20T15:36:29.6991598Z ##[debug]system.culture=en-US
2026-08-20T15:36:29.6998654Z ##[debug]failOnStderr=false
2026-08-20T15:36:29.7000393Z ##[debug]workingDirectory=/opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r10/a
2026-08-20T15:36:29.7000709Z ##[debug]check path : /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r10/a
2026-08-20T15:36:29.7001419Z ##[debug]targetType=inline
2026-08-20T15:36:29.7001657Z ##[debug]bashEnvValue=undefined
2026-08-20T15:36:29.7015288Z ##[debug]script=#!/bin/bash

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
	    DIR=/opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r10/a/SIECO-Android
	  fi
	  
	  if [ $POM_PATH ]
	   then
	     POM=`dirname $POM_PATH`
	  cd ${DIR}/$POM
	   else
	  cd ${DIR}
      fi

scancentral -url http://scancentral.apps.produtos4.caixa/scancentral-ctrl start -bt mvn -pool 794601f7-da27-467b-a734-06f92c4d63aa -application sieco-android -version 1.0.0 -uptoken *** -fprssc 0db70d4ebe8f6bf9615d5b0d64c151c80e5543ae.fpr -upload

elif [ $p_lang == android ]
then
cd /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r10/a/SIECO-Android
chmod +x gradlew
sed -i  "s,distributionUrl=.*,distributionUrl=file:///opt/ferramentas/gradle/gradle-$(awk '/distributionUrl/ {print $0}' /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r10/a/SIECO-Android/gradle/wrapper/gradle-wrapper.properties | sed 's/.*gradle-\(.*\)-.*/\1/g')-all.zip," gradle/wrapper/gradle-wrapper.properties
scancentral arguments -o -targs "-exclude './**/build/**/*'"
scancentral -url http://scancentral.apps.produtos4.caixa/scancentral-ctrl start -bt gradle -bc assembleDev -skipBuild -pool 25b9ff35-8b38-4a58-a54b-40b46436b3a1 -application sieco-android -version 1.0.0 -uptoken *** -fprssc 0db70d4ebe8f6bf9615d5b0d64c151c80e5543ae.fpr -upload

else
      if [ $PACKAGE_JSON_PATH ]
	    then
          cd $PACKAGE_JSON_PATH
		else
		  cd /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r10/a/SIECO-Android
		fi
	  scancentral arguments -o -targs "-Dcom.fortify.sca.exclude.unimported.node.modules 'true'" -targs "-exclude './**/node_modules/**/*'" -targs "-exclude './**/*.min.js'" -targs "-exclude './**/dist/**/*'"
          scancentral -url http://scancentral.apps.produtos4.caixa/scancentral-ctrl start -bt none -pool 25b9ff35-8b38-4a58-a54b-40b46436b3a1 -application sieco-android -version 1.0.0 -uptoken *** -fprssc 0db70d4ebe8f6bf9615d5b0d64c151c80e5543ae.fpr -upload
fi
2026-08-20T15:36:29.7017125Z Generating script.
2026-08-20T15:36:29.7030384Z ##[debug]which 'bash'
2026-08-20T15:36:29.7030670Z ##[debug]found: '/bin/bash'
2026-08-20T15:36:29.7030914Z ##[debug]Agent.Version=3.225.2
2026-08-20T15:36:29.7031190Z ##[debug]agent.tempDirectory=/opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp
2026-08-20T15:36:29.7031547Z ##[debug]check path : /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp
2026-08-20T15:36:29.7033019Z ========================== Starting Command Output ===========================
2026-08-20T15:36:29.7046638Z ##[debug]which '/bin/bash'
2026-08-20T15:36:29.7047150Z ##[debug]found: '/bin/bash'
2026-08-20T15:36:29.7047675Z ##[debug]/bin/bash arg: /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp/be0e16da-9b96-43fc-93c4-3381726ddd4d.sh
2026-08-20T15:36:29.7048097Z ##[debug]exec tool: /bin/bash
2026-08-20T15:36:29.7048586Z ##[debug]arguments:
2026-08-20T15:36:29.7050912Z ##[debug]   /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp/be0e16da-9b96-43fc-93c4-3381726ddd4d.sh
2026-08-20T15:36:29.7051500Z [command]/bin/bash /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp/be0e16da-9b96-43fc-93c4-3381726ddd4d.sh
2026-08-20T15:36:29.8571509Z Apache Maven 3.6.2 (40f52333136460af0dc0d7232c0dc0bcf0d9e117; 2019-08-27T12:06:16-03:00)
2026-08-20T15:36:29.8600601Z Maven home: /opt/ferramentas/maven/apache-maven-3.6.2
2026-08-20T15:36:29.8601184Z Java version: 17.0.7, vendor: Oracle Corporation, runtime: /opt/ferramentas/jdk/jdk17.0.7
2026-08-20T15:36:29.8601497Z Default locale: pt_BR, platform encoding: UTF-8
2026-08-20T15:36:29.8602319Z OS name: "linux", version: "3.10.0-1062.9.1.el7.x86_64", arch: "amd64", family: "unix"
2026-08-20T15:36:29.8640175Z Iniciando Fortify Clean, Translate e Analysis
2026-08-20T15:36:29.8663006Z LANG android
2026-08-20T15:36:30.3692798Z launcher.log will be stored in "/home/sadscp01/.fortify/scancentral-22.2.0/log" directory.
2026-08-20T15:36:31.2602204Z Update failed.
2026-08-20T15:36:31.2602966Z Unable to identify the Controller URL. Specify either the -url option or the -sscurl and -ssctoken options.
2026-08-20T15:36:31.9488846Z scancentral.log will be stored in "/home/sadscp01/.fortify/scancentral-22.2.0/log" directory.
2026-08-20T15:36:34.1554837Z Creating the fortify-sca.settings file.
2026-08-20T15:36:34.4310364Z launcher.log will be stored in "/home/sadscp01/.fortify/scancentral-22.2.0/log" directory.
2026-08-20T15:36:34.8973845Z Checking for updates...
2026-08-20T15:36:34.9299853Z No update available or auto update is disabled on the controller.
2026-08-20T15:36:35.1162819Z scancentral.log will be stored in "/home/sadscp01/.fortify/scancentral-22.2.0/log" directory.
2026-08-20T15:36:36.6742527Z Verifying controller URL...
2026-08-20T15:36:36.7879560Z The Controller at http://scancentral.apps.produtos4.caixa/scancentral-ctrl is UP
2026-08-20T15:36:36.8092878Z No email address detected. No status emails will be sent for this job.
2026-08-20T15:36:36.8093426Z Gathering project information...
2026-08-20T15:36:38.2001041Z To honour the JVM settings for this build a single-use Daemon process will be forked. See https://docs.gradle.org/8.1.1/userguide/gradle_daemon.html#sec:disabling_the_daemon.
2026-08-20T15:36:40.0869852Z Daemon will be stopped at the end of the build 
2026-08-20T15:36:40.4842251Z Configuration on demand is an incubating feature.
2026-08-20T15:36:47.6006869Z > Task :spec
2026-08-20T15:36:49.5944997Z 
2026-08-20T15:36:49.5945975Z > Task :app:spec
2026-08-20T15:36:49.5946631Z WARNING: We recommend using a newer Android Gradle plugin to use compileSdk = 35
2026-08-20T15:36:49.5946928Z 
2026-08-20T15:36:49.5947576Z This Android Gradle plugin (8.1.1) was tested up to compileSdk = 34.
2026-08-20T15:36:49.5947999Z 
2026-08-20T15:36:49.5948484Z You are strongly encouraged to update your project to use a newer
2026-08-20T15:36:49.5948948Z Android Gradle plugin that has been tested with compileSdk = 35.
2026-08-20T15:36:49.5949593Z 
2026-08-20T15:36:49.5950386Z If you are already using the latest version of the Android Gradle plugin,
2026-08-20T15:36:49.5950839Z you may need to wait until a newer version with support for compileSdk = 35 is available.
2026-08-20T15:36:49.5951213Z 
2026-08-20T15:36:49.5953626Z To suppress this warning, add/update
2026-08-20T15:36:49.5954036Z     android.suppressUnsupportedCompileSdk=35
2026-08-20T15:36:49.5954647Z to this project's gradle.properties.
2026-08-20T15:36:49.5955275Z Can't resolve artifacts for implementationDependenciesMetadata configuration. Artifacts are ignored.
2026-08-20T15:36:49.5956175Z Warning: SDK processing. This version only understands SDK XML versions up to 3 but an SDK XML file of version 4 was encountered. This can happen if you use versions of Android Studio and the command-line tools that were released at different times.
2026-08-20T15:36:49.6139737Z org.gradle.internal.exceptions.DefaultMultiCauseException: Could not resolve all files for configuration ':app:implementationDependenciesMetadata'.
2026-08-20T15:36:49.6450859Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.mapFailure(DefaultConfiguration.java:1716)
2026-08-20T15:36:49.6523124Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$3400(DefaultConfiguration.java:177)
2026-08-20T15:36:49.6670810Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$DefaultResolutionHost.mapFailure(DefaultConfiguration.java:2443)
2026-08-20T15:36:49.6770661Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionHost.rethrowFailure(ResolutionHost.java:30)
2026-08-20T15:36:49.6780411Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:74)
2026-08-20T15:36:49.6855177Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-20T15:36:49.6950832Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-20T15:36:49.6979364Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-20T15:36:49.6980105Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-20T15:36:49.6980636Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-20T15:36:49.6982904Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-20T15:36:49.6983260Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-20T15:36:49.6983676Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-20T15:36:49.6984045Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-20T15:36:49.6984533Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-20T15:36:49.6987272Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-20T15:36:49.6987596Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-20T15:36:49.6987952Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-20T15:36:49.6988301Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-20T15:36:49.6988630Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-20T15:36:49.6988949Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-20T15:36:49.6989377Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-20T15:36:49.6989818Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-20T15:36:49.6990680Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-20T15:36:49.6991198Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:49.6991676Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.6992048Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:49.6992382Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.6992684Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-20T15:36:49.7258534Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-20T15:36:49.7259792Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-20T15:36:49.7260409Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-20T15:36:49.7261015Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-20T15:36:49.7261651Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-20T15:36:49.7262341Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-20T15:36:49.7264020Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-20T15:36:49.7264611Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-20T15:36:49.7265411Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-20T15:36:49.7266116Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-20T15:36:49.7266645Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-20T15:36:49.7267150Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:49.7267746Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7600893Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:49.7613045Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7613612Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-20T15:36:49.7614040Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-20T15:36:49.7614492Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-20T15:36:49.7614852Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-20T15:36:49.7617012Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-20T15:36:49.7617319Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-20T15:36:49.7617609Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-20T15:36:49.7617979Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-20T15:36:49.7621128Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-20T15:36:49.7621420Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-20T15:36:49.7622238Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-20T15:36:49.7622556Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-20T15:36:49.7622819Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-20T15:36:49.7623061Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-20T15:36:49.7623295Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-20T15:36:49.7623512Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-20T15:36:49.7623747Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-20T15:36:49.7623961Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-20T15:36:49.7624149Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-20T15:36:49.7624330Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-20T15:36:49.7624530Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-20T15:36:49.7624725Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-20T15:36:49.7624927Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-20T15:36:49.7625143Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-20T15:36:49.7625335Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-20T15:36:49.7625712Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-20T15:36:49.7625922Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-20T15:36:49.7626136Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-20T15:36:49.7626332Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-20T15:36:49.7626522Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-20T15:36:49.7626724Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-20T15:36:49.7626927Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-20T15:36:49.7627126Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-20T15:36:49.7627360Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-20T15:36:49.7627862Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-20T15:36:49.7628096Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-20T15:36:49.7628312Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-20T15:36:49.7628511Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-20T15:36:49.7628695Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-20T15:36:49.7628905Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-20T15:36:49.7629139Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-20T15:36:49.7629446Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-20T15:36:49.7629735Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-20T15:36:49.7629937Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-20T15:36:49.7630154Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-20T15:36:49.7630396Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-20T15:36:49.7630707Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-20T15:36:49.7630966Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-20T15:36:49.7631199Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-20T15:36:49.7631418Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-20T15:36:49.7631634Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-20T15:36:49.7631850Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-20T15:36:49.7632068Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-20T15:36:49.7632277Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-20T15:36:49.7632481Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-20T15:36:49.7632738Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-20T15:36:49.7632940Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-20T15:36:49.7633134Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-20T15:36:49.7633324Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-20T15:36:49.7633522Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-20T15:36:49.7633745Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-20T15:36:49.7633990Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-20T15:36:49.7634226Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-20T15:36:49.7634470Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-20T15:36:49.7634716Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-20T15:36:49.7634947Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-20T15:36:49.7635174Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-20T15:36:49.7635411Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-20T15:36:49.7635632Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-20T15:36:49.7635854Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-20T15:36:49.7636099Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-20T15:36:49.7636533Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-20T15:36:49.7636860Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:49.7637083Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7637298Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:49.7637590Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7637809Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-20T15:36:49.7638097Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-20T15:36:49.7638437Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-20T15:36:49.7638656Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-20T15:36:49.7638889Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-20T15:36:49.7639219Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-20T15:36:49.7639467Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-20T15:36:49.7639810Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-20T15:36:49.7640146Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-20T15:36:49.7640369Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-20T15:36:49.7640600Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-20T15:36:49.7640877Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-20T15:36:49.7641094Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-20T15:36:49.7641310Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-20T15:36:49.7641558Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-20T15:36:49.7641743Z Cause 1: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :ticket.
2026-08-20T15:36:49.7641896Z Required by:
2026-08-20T15:36:49.7642007Z     project :app
2026-08-20T15:36:49.7642615Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :ticket:
2026-08-20T15:36:49.7643052Z   - devApiElements
2026-08-20T15:36:49.7643221Z   - hmpApiElements
2026-08-20T15:36:49.7643357Z   - pilotoApiElements
2026-08-20T15:36:49.7643496Z   - producaoApiElements
2026-08-20T15:36:49.7643611Z All of them match the consumer attributes:
2026-08-20T15:36:49.7643924Z   - Variant 'devApiElements' capability SIECO-Android:ticket:unspecified declares a component for use during compile-time:
2026-08-20T15:36:49.7644129Z       - Unmatched attributes:
2026-08-20T15:36:49.7644389Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:49.7644731Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-20T15:36:49.7645126Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-20T15:36:49.7645421Z           - Doesn't say anything about its component category (required a library)
2026-08-20T15:36:49.7645666Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-20T15:36:49.7645943Z   - Variant 'hmpApiElements' capability SIECO-Android:ticket:unspecified declares a component for use during compile-time:
2026-08-20T15:36:49.7646172Z       - Unmatched attributes:
2026-08-20T15:36:49.7646450Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:49.7646743Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-20T15:36:49.7647096Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-20T15:36:49.7647339Z           - Doesn't say anything about its component category (required a library)
2026-08-20T15:36:49.7647572Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-20T15:36:49.7647900Z   - Variant 'pilotoApiElements' capability SIECO-Android:ticket:unspecified declares a component for use during compile-time:
2026-08-20T15:36:49.7648208Z       - Unmatched attributes:
2026-08-20T15:36:49.7648506Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:49.7648823Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-20T15:36:49.7649328Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-20T15:36:49.7649601Z           - Doesn't say anything about its component category (required a library)
2026-08-20T15:36:49.7650067Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-20T15:36:49.7650361Z   - Variant 'producaoApiElements' capability SIECO-Android:ticket:unspecified declares a component for use during compile-time:
2026-08-20T15:36:49.7650647Z       - Unmatched attributes:
2026-08-20T15:36:49.7650900Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:49.7651217Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-20T15:36:49.7651621Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-20T15:36:49.7651876Z           - Doesn't say anything about its component category (required a library)
2026-08-20T15:36:49.7652108Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-20T15:36:49.7652449Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-20T15:36:49.7652755Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-20T15:36:49.7653021Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-20T15:36:49.7653350Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-20T15:36:49.7653608Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-20T15:36:49.7653975Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-20T15:36:49.7654291Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-20T15:36:49.7654567Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-20T15:36:49.7654911Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-20T15:36:49.7655174Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-20T15:36:49.7655438Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-20T15:36:49.7655772Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-20T15:36:49.7656030Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-20T15:36:49.7656280Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-20T15:36:49.7656602Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-20T15:36:49.7656831Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-20T15:36:49.7657107Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-20T15:36:49.7657417Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-20T15:36:49.7657667Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-20T15:36:49.7657912Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:49.7658276Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7658545Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:49.7658767Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7659054Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-20T15:36:49.7659293Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-20T15:36:49.7659527Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-20T15:36:49.7659925Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-20T15:36:49.7660183Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-20T15:36:49.7660433Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-20T15:36:49.7660806Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-20T15:36:49.7661114Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-20T15:36:49.7661440Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-20T15:36:49.7661703Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-20T15:36:49.7661955Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-20T15:36:49.7662288Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-20T15:36:49.7662548Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-20T15:36:49.7662801Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-20T15:36:49.7663116Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-20T15:36:49.7663339Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-20T15:36:49.7663557Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-20T15:36:49.7663827Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-20T15:36:49.7664082Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-20T15:36:49.7664310Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-20T15:36:49.7664688Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-20T15:36:49.7664916Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-20T15:36:49.7665111Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-20T15:36:49.7665354Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-20T15:36:49.7665633Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-20T15:36:49.7665842Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-20T15:36:49.7666019Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-20T15:36:49.7666303Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-20T15:36:49.7666561Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-20T15:36:49.7666858Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-20T15:36:49.7667169Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-20T15:36:49.7667507Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-20T15:36:49.7667732Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-20T15:36:49.7667971Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:49.7668256Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7668467Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:49.7668798Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7669076Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-20T15:36:49.7669293Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-20T15:36:49.7669502Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-20T15:36:49.7669874Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-20T15:36:49.7670095Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-20T15:36:49.7670317Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-20T15:36:49.7670595Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-20T15:36:49.7670794Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-20T15:36:49.7670984Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-20T15:36:49.7671230Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-20T15:36:49.7671471Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-20T15:36:49.7671793Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-20T15:36:49.7672234Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:49.7672460Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7672752Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:49.7673055Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7673260Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-20T15:36:49.7673475Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-20T15:36:49.7673760Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-20T15:36:49.7673949Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-20T15:36:49.7674153Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-20T15:36:49.7674409Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-20T15:36:49.7674670Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-20T15:36:49.7674879Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-20T15:36:49.7675074Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-20T15:36:49.7675347Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-20T15:36:49.7675552Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-20T15:36:49.7675789Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-20T15:36:49.7676121Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-20T15:36:49.7676353Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-20T15:36:49.7676635Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-20T15:36:49.7676935Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-20T15:36:49.7677147Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-20T15:36:49.7677343Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-20T15:36:49.7677560Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-20T15:36:49.7677779Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-20T15:36:49.7678010Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-20T15:36:49.7678248Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-20T15:36:49.7678458Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-20T15:36:49.7678684Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-20T15:36:49.7678992Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-20T15:36:49.7679282Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-20T15:36:49.7679488Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-20T15:36:49.7679768Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-20T15:36:49.7679970Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-20T15:36:49.7680156Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-20T15:36:49.7680440Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-20T15:36:49.7680715Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-20T15:36:49.7680911Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-20T15:36:49.7681147Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-20T15:36:49.7681401Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-20T15:36:49.7681634Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-20T15:36:49.7681849Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-20T15:36:49.7682050Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-20T15:36:49.7682243Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-20T15:36:49.7682459Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-20T15:36:49.7682774Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-20T15:36:49.7683006Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-20T15:36:49.7683215Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-20T15:36:49.7683408Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-20T15:36:49.7683622Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-20T15:36:49.7683856Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-20T15:36:49.7684156Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-20T15:36:49.7684390Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-20T15:36:49.7684620Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-20T15:36:49.7684836Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-20T15:36:49.7685045Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-20T15:36:49.7685259Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-20T15:36:49.7685466Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-20T15:36:49.7685673Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-20T15:36:49.7685874Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-20T15:36:49.7686075Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-20T15:36:49.7686270Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-20T15:36:49.7686520Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-20T15:36:49.7686733Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-20T15:36:49.7686934Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-20T15:36:49.7687161Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-20T15:36:49.7687444Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-20T15:36:49.7687682Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-20T15:36:49.7687932Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-20T15:36:49.7688217Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-20T15:36:49.7688444Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-20T15:36:49.7688663Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-20T15:36:49.7688889Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-20T15:36:49.7689117Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-20T15:36:49.7689342Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-20T15:36:49.7689577Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-20T15:36:49.7689892Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-20T15:36:49.7690131Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:49.7690347Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7690559Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:49.7690845Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7716400Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-20T15:36:49.7716682Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-20T15:36:49.7716918Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-20T15:36:49.7717136Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-20T15:36:49.7717368Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-20T15:36:49.7717619Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-20T15:36:49.7717879Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-20T15:36:49.7718142Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-20T15:36:49.7718377Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-20T15:36:49.7718587Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-20T15:36:49.7718799Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-20T15:36:49.7719005Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-20T15:36:49.7719213Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-20T15:36:49.7719938Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-20T15:36:49.7720138Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-20T15:36:49.7720310Z Cause 2: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :core.
2026-08-20T15:36:49.7720461Z Required by:
2026-08-20T15:36:49.7720572Z     project :app
2026-08-20T15:36:49.7721210Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :core:
2026-08-20T15:36:49.7721513Z   - devApiElements
2026-08-20T15:36:49.7721649Z   - hmpApiElements
2026-08-20T15:36:49.7721786Z   - pilotoApiElements
2026-08-20T15:36:49.7721929Z   - producaoApiElements
2026-08-20T15:36:49.7722052Z All of them match the consumer attributes:
2026-08-20T15:36:49.7722312Z   - Variant 'devApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-20T15:36:49.7722515Z       - Unmatched attributes:
2026-08-20T15:36:49.7722778Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:49.7723070Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-20T15:36:49.7723393Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-20T15:36:49.7723664Z           - Doesn't say anything about its component category (required a library)
2026-08-20T15:36:49.7723896Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-20T15:36:49.7724174Z   - Variant 'hmpApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-20T15:36:49.7724476Z       - Unmatched attributes:
2026-08-20T15:36:49.7724731Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:49.7725025Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-20T15:36:49.7725317Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-20T15:36:49.7725563Z           - Doesn't say anything about its component category (required a library)
2026-08-20T15:36:49.7725793Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-20T15:36:49.7726075Z   - Variant 'pilotoApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-20T15:36:49.7726275Z       - Unmatched attributes:
2026-08-20T15:36:49.7726520Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:49.7726812Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-20T15:36:49.7727105Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-20T15:36:49.7727349Z           - Doesn't say anything about its component category (required a library)
2026-08-20T15:36:49.7727575Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-20T15:36:49.7727852Z   - Variant 'producaoApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-20T15:36:49.7728038Z       - Unmatched attributes:
2026-08-20T15:36:49.7728342Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:49.7728676Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-20T15:36:49.7729117Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-20T15:36:49.7729466Z           - Doesn't say anything about its component category (required a library)
2026-08-20T15:36:49.7729896Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-20T15:36:49.7730128Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-20T15:36:49.7730392Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-20T15:36:49.7730715Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-20T15:36:49.7731082Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-20T15:36:49.7731481Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-20T15:36:49.7731822Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-20T15:36:49.7732074Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-20T15:36:49.7732350Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-20T15:36:49.7732623Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-20T15:36:49.7732962Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-20T15:36:49.7733221Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-20T15:36:49.7733581Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-20T15:36:49.7733833Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-20T15:36:49.7734082Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-20T15:36:49.7734340Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-20T15:36:49.7734579Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-20T15:36:49.7734804Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-20T15:36:49.7735040Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-20T15:36:49.7735287Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-20T15:36:49.7735519Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:49.7735793Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7736009Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:49.7736220Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7736435Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-20T15:36:49.7736696Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-20T15:36:49.7736970Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-20T15:36:49.7737213Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-20T15:36:49.7737465Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-20T15:36:49.7737716Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-20T15:36:49.7737983Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-20T15:36:49.7738255Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-20T15:36:49.7738495Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-20T15:36:49.7738752Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-20T15:36:49.7739002Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-20T15:36:49.7739252Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-20T15:36:49.7739596Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-20T15:36:49.7739937Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-20T15:36:49.7740166Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-20T15:36:49.7740388Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-20T15:36:49.7740604Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-20T15:36:49.7740804Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-20T15:36:49.7741011Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-20T15:36:49.7741235Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-20T15:36:49.7741462Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-20T15:36:49.7741681Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-20T15:36:49.7741867Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-20T15:36:49.7742066Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-20T15:36:49.7742297Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-20T15:36:49.7742551Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-20T15:36:49.7742731Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-20T15:36:49.7742929Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-20T15:36:49.7743150Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-20T15:36:49.7743368Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-20T15:36:49.7743576Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-20T15:36:49.7743788Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-20T15:36:49.7744009Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-20T15:36:49.7744225Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:49.7744439Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7744652Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:49.7744871Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7745084Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-20T15:36:49.7745296Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-20T15:36:49.7745500Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-20T15:36:49.7745710Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-20T15:36:49.7745928Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-20T15:36:49.7746191Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-20T15:36:49.7746391Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-20T15:36:49.7746587Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-20T15:36:49.7746778Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-20T15:36:49.7746968Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-20T15:36:49.7747192Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-20T15:36:49.7747446Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-20T15:36:49.7747684Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:49.7747902Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7748177Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:49.7748394Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7748605Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-20T15:36:49.7748815Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-20T15:36:49.7749016Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-20T15:36:49.7749253Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-20T15:36:49.7749450Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-20T15:36:49.7749724Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-20T15:36:49.7749948Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-20T15:36:49.7750157Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-20T15:36:49.7750354Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-20T15:36:49.7750552Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-20T15:36:49.7750821Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-20T15:36:49.7751133Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-20T15:36:49.7751478Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-20T15:36:49.7751709Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-20T15:36:49.7751934Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-20T15:36:49.7752149Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-20T15:36:49.7752359Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-20T15:36:49.7752560Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-20T15:36:49.7752742Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-20T15:36:49.7752925Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-20T15:36:49.7753172Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-20T15:36:49.7753359Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-20T15:36:49.7753566Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-20T15:36:49.7753783Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-20T15:36:49.7753987Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-20T15:36:49.7754185Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-20T15:36:49.7754393Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-20T15:36:49.7754604Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-20T15:36:49.7754798Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-20T15:36:49.7754984Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-20T15:36:49.7755188Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-20T15:36:49.7755390Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-20T15:36:49.7755595Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-20T15:36:49.7755821Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-20T15:36:49.7756072Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-20T15:36:49.7756352Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-20T15:36:49.7756564Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-20T15:36:49.7756765Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-20T15:36:49.7756942Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-20T15:36:49.7757148Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-20T15:36:49.7757382Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-20T15:36:49.7757605Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-20T15:36:49.7757815Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-20T15:36:49.7758077Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-20T15:36:49.7758303Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-20T15:36:49.7758545Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-20T15:36:49.7758786Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-20T15:36:49.7759024Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-20T15:36:49.7759254Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-20T15:36:49.7759477Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-20T15:36:49.7759746Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-20T15:36:49.7760012Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-20T15:36:49.7760225Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-20T15:36:49.7760432Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-20T15:36:49.7760639Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-20T15:36:49.7760839Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-20T15:36:49.7761026Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-20T15:36:49.7761217Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-20T15:36:49.7761404Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-20T15:36:49.7761609Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-20T15:36:49.7761836Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-20T15:36:49.7762068Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-20T15:36:49.7762299Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-20T15:36:49.7762535Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-20T15:36:49.7762772Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-20T15:36:49.7763049Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-20T15:36:49.7763275Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-20T15:36:49.7763503Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-20T15:36:49.7763729Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-20T15:36:49.7763951Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-20T15:36:49.7764185Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-20T15:36:49.7764441Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-20T15:36:49.7764676Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:49.7764897Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7765115Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:49.7765331Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7765537Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-20T15:36:49.7765748Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-20T15:36:49.7765969Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-20T15:36:49.7766184Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-20T15:36:49.7766415Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-20T15:36:49.7766730Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-20T15:36:49.7766972Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-20T15:36:49.7767225Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-20T15:36:49.7767457Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-20T15:36:49.7767665Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-20T15:36:49.7767879Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-20T15:36:49.7768200Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-20T15:36:49.7768512Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-20T15:36:49.7768750Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-20T15:36:49.7768930Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-20T15:36:49.7769112Z Cause 3: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :dto.
2026-08-20T15:36:49.7769257Z Required by:
2026-08-20T15:36:49.7769361Z     project :app
2026-08-20T15:36:49.7769945Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :dto:
2026-08-20T15:36:49.7770328Z   - devApiElements
2026-08-20T15:36:49.7770467Z   - hmpApiElements
2026-08-20T15:36:49.7770606Z   - pilotoApiElements
2026-08-20T15:36:49.7770744Z   - producaoApiElements
2026-08-20T15:36:49.7770867Z All of them match the consumer attributes:
2026-08-20T15:36:49.7771121Z   - Variant 'devApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-20T15:36:49.7771317Z       - Unmatched attributes:
2026-08-20T15:36:49.7771576Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:49.7772082Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-20T15:36:49.7772440Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-20T15:36:49.7772691Z           - Doesn't say anything about its component category (required a library)
2026-08-20T15:36:49.7772926Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-20T15:36:49.7773202Z   - Variant 'hmpApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-20T15:36:49.7773390Z       - Unmatched attributes:
2026-08-20T15:36:49.7773640Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:49.7773924Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-20T15:36:49.7774220Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-20T15:36:49.7774464Z           - Doesn't say anything about its component category (required a library)
2026-08-20T15:36:49.7774700Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-20T15:36:49.7775078Z   - Variant 'pilotoApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-20T15:36:49.7775349Z       - Unmatched attributes:
2026-08-20T15:36:49.7775679Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:49.7776079Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-20T15:36:49.7776499Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-20T15:36:49.7776822Z           - Doesn't say anything about its component category (required a library)
2026-08-20T15:36:49.7777059Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-20T15:36:49.7777339Z   - Variant 'producaoApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-20T15:36:49.7777536Z       - Unmatched attributes:
2026-08-20T15:36:49.7777780Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:49.7778143Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-20T15:36:49.7778449Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-20T15:36:49.7778692Z           - Doesn't say anything about its component category (required a library)
2026-08-20T15:36:49.7778909Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-20T15:36:49.7779189Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-20T15:36:49.7779456Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-20T15:36:49.7779790Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-20T15:36:49.7780055Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-20T15:36:49.7780312Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-20T15:36:49.7780575Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-20T15:36:49.7780958Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-20T15:36:49.7781356Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-20T15:36:49.7781636Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-20T15:36:49.7781899Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-20T15:36:49.7782157Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-20T15:36:49.7782414Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-20T15:36:49.7782666Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-20T15:36:49.7782974Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-20T15:36:49.7783229Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-20T15:36:49.7783470Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-20T15:36:49.7783696Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-20T15:36:49.7783936Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-20T15:36:49.7784186Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-20T15:36:49.7784426Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:49.7784648Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7784863Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:49.7785083Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7785299Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-20T15:36:49.7785516Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-20T15:36:49.7785795Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-20T15:36:49.7786029Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-20T15:36:49.7786277Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-20T15:36:49.7786518Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-20T15:36:49.7786752Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-20T15:36:49.7786985Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-20T15:36:49.7787226Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-20T15:36:49.7787481Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-20T15:36:49.7787734Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-20T15:36:49.7787982Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-20T15:36:49.7788239Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-20T15:36:49.7788489Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-20T15:36:49.7788719Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-20T15:36:49.7788937Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-20T15:36:49.7789206Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-20T15:36:49.7789406Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-20T15:36:49.7789613Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-20T15:36:49.7789908Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-20T15:36:49.7790137Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-20T15:36:49.7790348Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-20T15:36:49.7790541Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-20T15:36:49.7790739Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-20T15:36:49.7791051Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-20T15:36:49.7791253Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-20T15:36:49.7791416Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-20T15:36:49.7791613Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-20T15:36:49.7791828Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-20T15:36:49.7792039Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-20T15:36:49.7792243Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-20T15:36:49.7792533Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-20T15:36:49.7792755Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-20T15:36:49.7792967Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:49.7793173Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7793383Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:49.7794019Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7794235Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-20T15:36:49.7794449Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-20T15:36:49.7794659Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-20T15:36:49.7794863Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-20T15:36:49.7795080Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-20T15:36:49.7795291Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-20T15:36:49.7795487Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-20T15:36:49.7795672Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-20T15:36:49.7795860Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-20T15:36:49.7796048Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-20T15:36:49.7796265Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-20T15:36:49.7796568Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-20T15:36:49.7796803Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:49.7797022Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7797236Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:49.7797451Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7797664Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-20T15:36:49.7797881Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-20T15:36:49.7798083Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-20T15:36:49.7798270Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-20T15:36:49.7798472Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-20T15:36:49.7798691Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-20T15:36:49.7798904Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-20T15:36:49.7799110Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-20T15:36:49.7799308Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-20T15:36:49.7799544Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-20T15:36:49.7799818Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-20T15:36:49.7800058Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-20T15:36:49.7800310Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-20T15:36:49.7800544Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-20T15:36:49.7800783Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-20T15:36:49.7801087Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-20T15:36:49.7801347Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-20T15:36:49.7801558Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-20T15:36:49.7801741Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-20T15:36:49.7801920Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-20T15:36:49.7802112Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-20T15:36:49.7802308Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-20T15:36:49.7802512Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-20T15:36:49.7802750Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-20T15:36:49.7802957Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-20T15:36:49.7803149Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-20T15:36:49.7803401Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-20T15:36:49.7803612Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-20T15:36:49.7803802Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-20T15:36:49.7803988Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-20T15:36:49.7804190Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-20T15:36:49.7804388Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-20T15:36:49.7804590Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-20T15:36:49.7804819Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-20T15:36:49.7805067Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-20T15:36:49.7805296Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-20T15:36:49.7805507Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-20T15:36:49.7805705Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-20T15:36:49.7805892Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-20T15:36:49.7806102Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-20T15:36:49.7806330Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-20T15:36:49.7806614Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-20T15:36:49.7806824Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-20T15:36:49.7807016Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-20T15:36:49.7807232Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-20T15:36:49.7807467Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-20T15:36:49.7807802Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-20T15:36:49.7808157Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-20T15:36:49.7808394Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-20T15:36:49.7808617Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-20T15:36:49.7808829Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-20T15:36:49.7809038Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-20T15:36:49.7809249Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-20T15:36:49.7809456Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-20T15:36:49.7809726Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-20T15:36:49.7809938Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-20T15:36:49.7810189Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-20T15:36:49.7810384Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-20T15:36:49.7810572Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-20T15:36:49.7810886Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-20T15:36:49.7811217Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-20T15:36:49.7811467Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-20T15:36:49.7811703Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-20T15:36:49.7811949Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-20T15:36:49.7812189Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-20T15:36:49.7812415Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-20T15:36:49.7812634Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-20T15:36:49.7812861Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-20T15:36:49.7813085Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-20T15:36:49.7813306Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-20T15:36:49.7813598Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-20T15:36:49.7813853Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-20T15:36:49.7814087Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:49.7814299Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7814513Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:49.7814726Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7814936Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-20T15:36:49.7815148Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-20T15:36:49.7815369Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-20T15:36:49.7815579Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-20T15:36:49.7815803Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-20T15:36:49.7816046Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-20T15:36:49.7816279Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-20T15:36:49.7816532Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-20T15:36:49.7816763Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-20T15:36:49.7817039Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-20T15:36:49.7817248Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-20T15:36:49.7817459Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-20T15:36:49.7817666Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-20T15:36:49.7817873Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-20T15:36:49.7818053Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-20T15:36:49.7818238Z Cause 4: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :caixaui.
2026-08-20T15:36:49.7818385Z Required by:
2026-08-20T15:36:49.7818491Z     project :app
2026-08-20T15:36:49.7818984Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :caixaui:
2026-08-20T15:36:49.7819298Z   - devApiElements
2026-08-20T15:36:49.7819433Z   - hmpApiElements
2026-08-20T15:36:49.7819568Z   - pilotoApiElements
2026-08-20T15:36:49.7819779Z   - producaoApiElements
2026-08-20T15:36:49.7819909Z All of them match the consumer attributes:
2026-08-20T15:36:49.7820175Z   - Variant 'devApiElements' capability SIECO-Android:caixaui:unspecified declares a component for use during compile-time:
2026-08-20T15:36:49.7820377Z       - Unmatched attributes:
2026-08-20T15:36:49.7820630Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:49.7821055Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-20T15:36:49.7821457Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-20T15:36:49.7821722Z           - Doesn't say anything about its component category (required a library)
2026-08-20T15:36:49.7821950Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-20T15:36:49.7822227Z   - Variant 'hmpApiElements' capability SIECO-Android:caixaui:unspecified declares a component for use during compile-time:
2026-08-20T15:36:49.7822422Z       - Unmatched attributes:
2026-08-20T15:36:49.7822672Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:49.7822959Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-20T15:36:49.7823250Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-20T15:36:49.7823490Z           - Doesn't say anything about its component category (required a library)
2026-08-20T15:36:49.7823716Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-20T15:36:49.7823985Z   - Variant 'pilotoApiElements' capability SIECO-Android:caixaui:unspecified declares a component for use during compile-time:
2026-08-20T15:36:49.7824181Z       - Unmatched attributes:
2026-08-20T15:36:49.7824427Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:49.7824714Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-20T15:36:49.7825008Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-20T15:36:49.7825357Z           - Doesn't say anything about its component category (required a library)
2026-08-20T15:36:49.7825685Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-20T15:36:49.7826013Z   - Variant 'producaoApiElements' capability SIECO-Android:caixaui:unspecified declares a component for use during compile-time:
2026-08-20T15:36:49.7826211Z       - Unmatched attributes:
2026-08-20T15:36:49.7826462Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:49.7826752Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-20T15:36:49.7827138Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-20T15:36:49.7827393Z           - Doesn't say anything about its component category (required a library)
2026-08-20T15:36:49.7827621Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-20T15:36:49.7827839Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-20T15:36:49.7828107Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-20T15:36:49.7828370Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-20T15:36:49.7828620Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-20T15:36:49.7828929Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-20T15:36:49.7829189Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-20T15:36:49.7829448Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-20T15:36:49.7829790Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-20T15:36:49.7830066Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-20T15:36:49.7830370Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-20T15:36:49.7830665Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-20T15:36:49.7831004Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-20T15:36:49.7831260Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-20T15:36:49.7831510Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-20T15:36:49.7831763Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-20T15:36:49.7832000Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-20T15:36:49.7832228Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-20T15:36:49.7832528Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-20T15:36:49.7832776Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-20T15:36:49.7833009Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:49.7833225Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7833437Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:49.7833658Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7833902Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-20T15:36:49.7834236Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-20T15:36:49.7834536Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-20T15:36:49.7834778Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-20T15:36:49.7835022Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-20T15:36:49.7835261Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-20T15:36:49.7835495Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-20T15:36:49.7835789Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-20T15:36:49.7836035Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-20T15:36:49.7836298Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-20T15:36:49.7836552Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-20T15:36:49.7836802Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-20T15:36:49.7837051Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-20T15:36:49.7837304Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-20T15:36:49.7837536Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-20T15:36:49.7837757Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-20T15:36:49.7837976Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-20T15:36:49.7838176Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-20T15:36:49.7838381Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-20T15:36:49.7838609Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-20T15:36:49.7838839Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-20T15:36:49.7839105Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-20T15:36:49.7839300Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-20T15:36:49.7839497Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-20T15:36:49.7839786Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-20T15:36:49.7839995Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-20T15:36:49.7840170Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-20T15:36:49.7840440Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-20T15:36:49.7840731Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-20T15:36:49.7841053Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-20T15:36:49.7841265Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-20T15:36:49.7841470Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-20T15:36:49.7841695Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-20T15:36:49.7841913Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:49.7842130Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7842345Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:49.7842637Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7842851Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-20T15:36:49.7843063Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-20T15:36:49.7843276Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-20T15:36:49.7843480Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-20T15:36:49.7843696Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-20T15:36:49.7843907Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-20T15:36:49.7844106Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-20T15:36:49.7844302Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-20T15:36:49.7844490Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-20T15:36:49.7844675Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-20T15:36:49.7844894Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-20T15:36:49.7845135Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-20T15:36:49.7845367Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:49.7845584Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7845797Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:49.7846070Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7846283Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-20T15:36:49.7846499Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-20T15:36:49.7846702Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-20T15:36:49.7846890Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-20T15:36:49.7847092Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-20T15:36:49.7847310Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-20T15:36:49.7847521Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-20T15:36:49.7847726Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-20T15:36:49.7847924Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-20T15:36:49.7848117Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-20T15:36:49.7848318Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-20T15:36:49.7848556Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-20T15:36:49.7848804Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-20T15:36:49.7849036Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-20T15:36:49.7849296Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-20T15:36:49.7849516Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-20T15:36:49.7849812Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-20T15:36:49.7850092Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-20T15:36:49.7850386Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-20T15:36:49.7850570Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-20T15:36:49.7850767Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-20T15:36:49.7851022Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-20T15:36:49.7851226Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-20T15:36:49.7851442Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-20T15:36:49.7851649Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-20T15:36:49.7851849Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-20T15:36:49.7852051Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-20T15:36:49.7852261Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-20T15:36:49.7852451Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-20T15:36:49.7852628Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-20T15:36:49.7852827Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-20T15:36:49.7853092Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-20T15:36:49.7853297Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-20T15:36:49.7853524Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-20T15:36:49.7853775Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-20T15:36:49.7854003Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-20T15:36:49.7854211Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-20T15:36:49.7854413Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-20T15:36:49.7854600Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-20T15:36:49.7854809Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-20T15:36:49.7855047Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-20T15:36:49.7855276Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-20T15:36:49.7855487Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-20T15:36:49.7855688Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-20T15:36:49.7855907Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-20T15:36:49.7856143Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-20T15:36:49.7856438Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-20T15:36:49.7856681Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-20T15:36:49.7856905Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-20T15:36:49.7857129Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-20T15:36:49.7857342Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-20T15:36:49.7857558Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-20T15:36:49.7857772Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-20T15:36:49.7857984Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-20T15:36:49.7858196Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-20T15:36:49.7858399Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-20T15:36:49.7858599Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-20T15:36:49.7858794Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-20T15:36:49.7858981Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-20T15:36:49.7859179Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-20T15:36:49.7859407Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-20T15:36:49.7859711Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-20T15:36:49.7859999Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-20T15:36:49.7860251Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-20T15:36:49.7860601Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-20T15:36:49.7860926Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-20T15:36:49.7861204Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-20T15:36:49.7861422Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-20T15:36:49.7861648Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-20T15:36:49.7861872Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-20T15:36:49.7862110Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-20T15:36:49.7862361Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-20T15:36:49.7862592Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:49.7862810Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7863022Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:49.7863297Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7863511Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-20T15:36:49.7863721Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-20T15:36:49.7863935Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-20T15:36:49.7864142Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-20T15:36:49.7864364Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-20T15:36:49.7864613Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-20T15:36:49.7864858Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-20T15:36:49.7865115Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-20T15:36:49.7865350Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-20T15:36:49.7865559Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-20T15:36:49.7865770Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-20T15:36:49.7865977Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-20T15:36:49.7866174Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-20T15:36:49.7866378Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-20T15:36:49.7866622Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-20T15:36:49.7866805Z Cause 5: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :payer.
2026-08-20T15:36:49.7866952Z Required by:
2026-08-20T15:36:49.7867060Z     project :app
2026-08-20T15:36:49.7867559Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :payer:
2026-08-20T15:36:49.7867871Z   - devApiElements
2026-08-20T15:36:49.7868006Z   - hmpApiElements
2026-08-20T15:36:49.7868141Z   - pilotoApiElements
2026-08-20T15:36:49.7868283Z   - producaoApiElements
2026-08-20T15:36:49.7868405Z All of them match the consumer attributes:
2026-08-20T15:36:49.7868658Z   - Variant 'devApiElements' capability SIECO-Android:payer:unspecified declares a component for use during compile-time:
2026-08-20T15:36:49.7868860Z       - Unmatched attributes:
2026-08-20T15:36:49.7869111Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:49.7869405Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-20T15:36:49.7869766Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-20T15:36:49.7870024Z           - Doesn't say anything about its component category (required a library)
2026-08-20T15:36:49.7870281Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-20T15:36:49.7870601Z   - Variant 'hmpApiElements' capability SIECO-Android:payer:unspecified declares a component for use during compile-time:
2026-08-20T15:36:49.7870919Z       - Unmatched attributes:
2026-08-20T15:36:49.7871176Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:49.7871463Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-20T15:36:49.7871905Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-20T15:36:49.7872260Z           - Doesn't say anything about its component category (required a library)
2026-08-20T15:36:49.7872513Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-20T15:36:49.7872790Z   - Variant 'pilotoApiElements' capability SIECO-Android:payer:unspecified declares a component for use during compile-time:
2026-08-20T15:36:49.7872991Z       - Unmatched attributes:
2026-08-20T15:36:49.7873242Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:49.7873537Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-20T15:36:49.7873834Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-20T15:36:49.7874066Z           - Doesn't say anything about its component category (required a library)
2026-08-20T15:36:49.7874294Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-20T15:36:49.7874572Z   - Variant 'producaoApiElements' capability SIECO-Android:payer:unspecified declares a component for use during compile-time:
2026-08-20T15:36:49.7874769Z       - Unmatched attributes:
2026-08-20T15:36:49.7875016Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:49.7875377Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-20T15:36:49.7875678Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-20T15:36:49.7875924Z           - Doesn't say anything about its component category (required a library)
2026-08-20T15:36:49.7876158Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-20T15:36:49.7876382Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-20T15:36:49.7876653Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-20T15:36:49.7876917Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-20T15:36:49.7877170Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-20T15:36:49.7877452Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-20T15:36:49.7877821Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-20T15:36:49.7878203Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-20T15:36:49.7878498Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-20T15:36:49.7878834Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-20T15:36:49.7879097Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-20T15:36:49.7879357Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-20T15:36:49.7879618Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-20T15:36:49.7879945Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-20T15:36:49.7880196Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-20T15:36:49.7880522Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-20T15:36:49.7880763Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-20T15:36:49.7880985Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-20T15:36:49.7881213Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-20T15:36:49.7881460Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-20T15:36:49.7881693Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:49.7881913Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7882195Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:49.7882413Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7882628Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-20T15:36:49.7882843Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-20T15:36:49.7883070Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-20T15:36:49.7883314Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-20T15:36:49.7883562Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-20T15:36:49.7883809Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-20T15:36:49.7884045Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-20T15:36:49.7884274Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-20T15:36:49.7884513Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-20T15:36:49.7884766Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-20T15:36:49.7885017Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-20T15:36:49.7885321Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-20T15:36:49.7885577Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-20T15:36:49.7885826Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-20T15:36:49.7886053Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-20T15:36:49.7886270Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-20T15:36:49.7886487Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-20T15:36:49.7886686Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-20T15:36:49.7886879Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-20T15:36:49.7887104Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-20T15:36:49.7887324Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-20T15:36:49.7887533Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-20T15:36:49.7887725Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-20T15:36:49.7887920Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-20T15:36:49.7888144Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-20T15:36:49.7888346Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-20T15:36:49.7888571Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-20T15:36:49.7888769Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-20T15:36:49.7888981Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-20T15:36:49.7889194Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-20T15:36:49.7889398Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-20T15:36:49.7889604Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-20T15:36:49.7889895Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-20T15:36:49.7890111Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:49.7890318Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7890528Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:49.7890732Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7890943Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-20T15:36:49.7891192Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-20T15:36:49.7891504Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-20T15:36:49.7891797Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-20T15:36:49.7892148Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-20T15:36:49.7892369Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-20T15:36:49.7892566Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-20T15:36:49.7892761Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-20T15:36:49.7892949Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-20T15:36:49.7893137Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-20T15:36:49.7893356Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-20T15:36:49.7893608Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-20T15:36:49.7893845Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:49.7894062Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7894275Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:49.7894491Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7894701Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-20T15:36:49.7894903Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-20T15:36:49.7895104Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-20T15:36:49.7895292Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-20T15:36:49.7895545Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-20T15:36:49.7895765Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-20T15:36:49.7895973Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-20T15:36:49.7896176Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-20T15:36:49.7896374Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-20T15:36:49.7896566Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-20T15:36:49.7896762Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-20T15:36:49.7896992Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-20T15:36:49.7897242Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-20T15:36:49.7897471Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-20T15:36:49.7897690Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-20T15:36:49.7897903Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-20T15:36:49.7898113Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-20T15:36:49.7898316Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-20T15:36:49.7898491Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-20T15:36:49.7898716Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-20T15:36:49.7898912Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-20T15:36:49.7899106Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-20T15:36:49.7899310Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-20T15:36:49.7899521Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-20T15:36:49.7899846Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-20T15:36:49.7900120Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-20T15:36:49.7900366Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-20T15:36:49.7900577Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-20T15:36:49.7900826Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-20T15:36:49.7901013Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-20T15:36:49.7901212Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-20T15:36:49.7901412Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-20T15:36:49.7901613Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-20T15:36:49.7901829Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-20T15:36:49.7902080Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-20T15:36:49.7902310Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-20T15:36:49.7902597Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-20T15:36:49.7902795Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-20T15:36:49.7902982Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-20T15:36:49.7903188Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-20T15:36:49.7903421Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-20T15:36:49.7903652Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-20T15:36:49.7903861Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-20T15:36:49.7904060Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-20T15:36:49.7904283Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-20T15:36:49.7904520Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-20T15:36:49.7904758Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-20T15:36:49.7904996Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-20T15:36:49.7905219Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-20T15:36:49.7905437Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-20T15:36:49.7905697Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-20T15:36:49.7905912Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-20T15:36:49.7906125Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-20T15:36:49.7906323Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-20T15:36:49.7906528Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-20T15:36:49.7906732Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-20T15:36:49.7906931Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-20T15:36:49.7907126Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-20T15:36:49.7907315Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-20T15:36:49.7907517Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-20T15:36:49.7907749Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-20T15:36:49.7907985Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-20T15:36:49.7908217Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-20T15:36:49.7908460Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-20T15:36:49.7908699Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-20T15:36:49.7908928Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-20T15:36:49.7909206Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-20T15:36:49.7909435Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-20T15:36:49.7909721Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-20T15:36:49.7909953Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-20T15:36:49.7910187Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-20T15:36:49.7910437Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-20T15:36:49.7910662Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:49.7910881Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7911094Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:49.7911307Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7911520Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-20T15:36:49.7911731Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-20T15:36:49.7911947Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-20T15:36:49.7912157Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-20T15:36:49.7912442Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-20T15:36:49.7912694Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-20T15:36:49.7912937Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-20T15:36:49.7913189Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-20T15:36:49.7913420Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-20T15:36:49.7913625Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-20T15:36:49.7913837Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-20T15:36:49.7914045Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-20T15:36:49.7914255Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-20T15:36:49.7914461Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-20T15:36:49.7914639Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-20T15:36:49.7914809Z Cause 6: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :pix.
2026-08-20T15:36:49.7914953Z Required by:
2026-08-20T15:36:49.7915058Z     project :app
2026-08-20T15:36:49.7915545Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :pix:
2026-08-20T15:36:49.7915848Z   - devApiElements
2026-08-20T15:36:49.7916045Z   - hmpApiElements
2026-08-20T15:36:49.7916179Z   - pilotoApiElements
2026-08-20T15:36:49.7916321Z   - producaoApiElements
2026-08-20T15:36:49.7916440Z All of them match the consumer attributes:
2026-08-20T15:36:49.7916781Z   - Variant 'devApiElements' capability SIECO-Android:pix:unspecified declares a library for use during compile-time, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-20T15:36:49.7917015Z       - Unmatched attributes:
2026-08-20T15:36:49.7917272Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:49.7917559Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-20T15:36:49.7917854Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-20T15:36:49.7918135Z           - Provides attribute 'org.gradle.jvm.environment' with value 'android' but the consumer didn't ask for it
2026-08-20T15:36:49.7918481Z   - Variant 'hmpApiElements' capability SIECO-Android:pix:unspecified declares a library for use during compile-time, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-20T15:36:49.7918719Z       - Unmatched attributes:
2026-08-20T15:36:49.7918958Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:49.7919251Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-20T15:36:49.7919547Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-20T15:36:49.7919933Z           - Provides attribute 'org.gradle.jvm.environment' with value 'android' but the consumer didn't ask for it
2026-08-20T15:36:49.7920299Z   - Variant 'pilotoApiElements' capability SIECO-Android:pix:unspecified declares a library for use during compile-time, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-20T15:36:49.7920530Z       - Unmatched attributes:
2026-08-20T15:36:49.7920775Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:49.7921063Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-20T15:36:49.7921359Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-20T15:36:49.7921633Z           - Provides attribute 'org.gradle.jvm.environment' with value 'android' but the consumer didn't ask for it
2026-08-20T15:36:49.7921997Z   - Variant 'producaoApiElements' capability SIECO-Android:pix:unspecified declares a library for use during compile-time, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-20T15:36:49.7922229Z       - Unmatched attributes:
2026-08-20T15:36:49.7922480Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:49.7922771Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-20T15:36:49.7923071Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-20T15:36:49.7923345Z           - Provides attribute 'org.gradle.jvm.environment' with value 'android' but the consumer didn't ask for it
2026-08-20T15:36:49.7923591Z The following variants were also considered but didn't match the requested attributes:
2026-08-20T15:36:49.7924000Z   - Variant 'devSourcesElements' capability SIECO-Android:pix:unspecified declares a component for use during runtime, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-20T15:36:49.7924300Z       - Incompatible because this component declares documentation and the consumer needed a library
2026-08-20T15:36:49.7924655Z   - Variant 'hmpSourcesElements' capability SIECO-Android:pix:unspecified declares a component for use during runtime, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-20T15:36:49.7924949Z       - Incompatible because this component declares documentation and the consumer needed a library
2026-08-20T15:36:49.7925308Z   - Variant 'pilotoSourcesElements' capability SIECO-Android:pix:unspecified declares a component for use during runtime, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-20T15:36:49.7925607Z       - Incompatible because this component declares documentation and the consumer needed a library
2026-08-20T15:36:49.7925968Z   - Variant 'producaoSourcesElements' capability SIECO-Android:pix:unspecified declares a component for use during runtime, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-20T15:36:49.7926267Z       - Incompatible because this component declares documentation and the consumer needed a library
2026-08-20T15:36:49.7926487Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-20T15:36:49.7926754Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-20T15:36:49.7927008Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-20T15:36:49.7927302Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-20T15:36:49.7927554Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-20T15:36:49.7927814Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-20T15:36:49.7928072Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-20T15:36:49.7928348Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-20T15:36:49.7928621Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-20T15:36:49.7928881Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-20T15:36:49.7929138Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-20T15:36:49.7929396Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-20T15:36:49.7929712Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-20T15:36:49.7929978Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-20T15:36:49.7930236Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-20T15:36:49.7930478Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-20T15:36:49.7930824Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-20T15:36:49.7931066Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-20T15:36:49.7931315Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-20T15:36:49.7931546Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:49.7931762Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7931974Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:49.7932188Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7932401Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-20T15:36:49.7932613Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-20T15:36:49.7932837Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-20T15:36:49.7933079Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-20T15:36:49.7933323Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-20T15:36:49.7933563Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-20T15:36:49.7933850Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-20T15:36:49.7934075Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-20T15:36:49.7934317Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-20T15:36:49.7934572Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-20T15:36:49.7934826Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-20T15:36:49.7935075Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-20T15:36:49.7935332Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-20T15:36:49.7935585Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-20T15:36:49.7935814Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-20T15:36:49.7936032Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-20T15:36:49.7936247Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-20T15:36:49.7936447Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-20T15:36:49.7936651Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-20T15:36:49.7936877Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-20T15:36:49.7937153Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-20T15:36:49.7937368Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-20T15:36:49.7937566Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-20T15:36:49.7937768Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-20T15:36:49.7937995Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-20T15:36:49.7938197Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-20T15:36:49.7938370Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-20T15:36:49.7938569Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-20T15:36:49.7938778Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-20T15:36:49.7938993Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-20T15:36:49.7939202Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-20T15:36:49.7939416Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-20T15:36:49.7939692Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-20T15:36:49.7939918Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:49.7940131Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7940391Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:49.7940609Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7940822Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-20T15:36:49.7941036Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-20T15:36:49.7941245Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-20T15:36:49.7941449Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-20T15:36:49.7941667Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-20T15:36:49.7941879Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-20T15:36:49.7942081Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-20T15:36:49.7942275Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-20T15:36:49.7942465Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-20T15:36:49.7942645Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-20T15:36:49.7942863Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-20T15:36:49.7943116Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-20T15:36:49.7943353Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:49.7943576Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7943843Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:49.7944059Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7944274Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-20T15:36:49.7944487Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-20T15:36:49.7944690Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-20T15:36:49.7944878Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-20T15:36:49.7945083Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-20T15:36:49.7945303Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-20T15:36:49.7945518Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-20T15:36:49.7945725Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-20T15:36:49.7945922Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-20T15:36:49.7946118Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-20T15:36:49.7946311Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-20T15:36:49.7946548Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-20T15:36:49.7946796Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-20T15:36:49.7947071Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-20T15:36:49.7947288Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-20T15:36:49.7947501Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-20T15:36:49.7947706Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-20T15:36:49.7947911Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-20T15:36:49.7948094Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-20T15:36:49.7948276Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-20T15:36:49.7948466Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-20T15:36:49.7948660Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-20T15:36:49.7948864Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-20T15:36:49.7949076Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-20T15:36:49.7949279Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-20T15:36:49.7949478Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-20T15:36:49.7949736Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-20T15:36:49.7949948Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-20T15:36:49.7950136Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-20T15:36:49.7950320Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-20T15:36:49.7950573Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-20T15:36:49.7950776Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-20T15:36:49.7950978Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-20T15:36:49.7951207Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-20T15:36:49.7951454Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-20T15:36:49.7951689Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-20T15:36:49.7951901Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-20T15:36:49.7952103Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-20T15:36:49.7952291Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-20T15:36:49.7952499Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-20T15:36:49.7952734Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-20T15:36:49.7952963Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-20T15:36:49.7953172Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-20T15:36:49.7953371Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-20T15:36:49.7953580Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-20T15:36:49.7953865Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-20T15:36:49.7954106Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-20T15:36:49.7954339Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-20T15:36:49.7954563Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-20T15:36:49.7954781Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-20T15:36:49.7954987Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-20T15:36:49.7955199Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-20T15:36:49.7955416Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-20T15:36:49.7955622Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-20T15:36:49.7955827Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-20T15:36:49.7956031Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-20T15:36:49.7956226Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-20T15:36:49.7956419Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-20T15:36:49.7956616Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-20T15:36:49.7956821Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-20T15:36:49.7957049Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-20T15:36:49.7957330Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-20T15:36:49.7957563Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-20T15:36:49.7957805Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-20T15:36:49.7958041Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-20T15:36:49.7958268Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-20T15:36:49.7958491Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-20T15:36:49.7958717Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-20T15:36:49.7958943Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-20T15:36:49.7959154Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-20T15:36:49.7959388Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-20T15:36:49.7959692Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-20T15:36:49.7959936Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:49.7960155Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7960426Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:49.7960695Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:49.7960923Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-20T15:36:49.7961139Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-20T15:36:49.7961362Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-20T15:36:49.7961575Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-20T15:36:49.7961804Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-20T15:36:49.7962057Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-20T15:36:49.7962304Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-20T15:36:49.7962560Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-20T15:36:49.7962795Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-20T15:36:49.7963008Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-20T15:36:49.7963223Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-20T15:36:49.7963434Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-20T15:36:49.7963643Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-20T15:36:49.7963946Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-20T15:36:49.7964120Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-20T15:36:54.4843566Z 
2026-08-20T15:36:54.4844296Z > Task :caixaui:spec
2026-08-20T15:36:54.4844741Z WARNING: We recommend using a newer Android Gradle plugin to use compileSdk = 35
2026-08-20T15:36:54.4846292Z 
2026-08-20T15:36:54.4846562Z This Android Gradle plugin (8.1.1) was tested up to compileSdk = 34.
2026-08-20T15:36:54.4846747Z 
2026-08-20T15:36:54.4846988Z You are strongly encouraged to update your project to use a newer
2026-08-20T15:36:54.4847364Z Android Gradle plugin that has been tested with compileSdk = 35.
2026-08-20T15:36:54.4848702Z 
2026-08-20T15:36:54.4849075Z If you are already using the latest version of the Android Gradle plugin,
2026-08-20T15:36:54.4849442Z you may need to wait until a newer version with support for compileSdk = 35 is available.
2026-08-20T15:36:54.4849805Z 
2026-08-20T15:36:54.4850562Z To suppress this warning, add/update
2026-08-20T15:36:54.4850926Z     android.suppressUnsupportedCompileSdk=35
2026-08-20T15:36:54.4851393Z to this project's gradle.properties.
2026-08-20T15:36:55.4896885Z 
2026-08-20T15:36:55.4897646Z > Task :core:spec
2026-08-20T15:36:55.5848607Z > Task :dto:spec
2026-08-20T15:36:55.6906958Z > Task :payer:spec
2026-08-20T15:36:55.8033099Z 
2026-08-20T15:36:55.8033869Z > Task :pix:spec
2026-08-20T15:36:55.8034507Z Can't resolve artifacts for implementationDependenciesMetadata configuration. Artifacts are ignored.
2026-08-20T15:36:55.8035153Z org.gradle.internal.exceptions.DefaultMultiCauseException: Could not resolve all files for configuration ':pix:implementationDependenciesMetadata'.
2026-08-20T15:36:55.8035625Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.mapFailure(DefaultConfiguration.java:1716)
2026-08-20T15:36:55.8036644Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$3400(DefaultConfiguration.java:177)
2026-08-20T15:36:55.8037054Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$DefaultResolutionHost.mapFailure(DefaultConfiguration.java:2443)
2026-08-20T15:36:55.8037441Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionHost.rethrowFailure(ResolutionHost.java:30)
2026-08-20T15:36:55.8037819Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:74)
2026-08-20T15:36:55.8038256Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-20T15:36:55.8040159Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-20T15:36:55.8040497Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-20T15:36:55.8040904Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-20T15:36:55.8041458Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-20T15:36:55.8042372Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-20T15:36:55.8042732Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-20T15:36:55.8042960Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-20T15:36:55.8043159Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-20T15:36:55.8043367Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-20T15:36:55.8043601Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-20T15:36:55.8044002Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-20T15:36:55.8044186Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-20T15:36:55.8044388Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-20T15:36:55.8044611Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-20T15:36:55.8044832Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-20T15:36:55.8045042Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-20T15:36:55.8045257Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-20T15:36:55.8045486Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-20T15:36:55.8045704Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:55.8045919Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:55.8046132Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:55.8046352Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:55.8046571Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-20T15:36:55.8046784Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-20T15:36:55.8047001Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-20T15:36:55.8047289Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-20T15:36:55.8047509Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-20T15:36:55.8047726Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-20T15:36:55.8047920Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-20T15:36:55.8048116Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-20T15:36:55.8048316Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-20T15:36:55.8048505Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-20T15:36:55.8048733Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-20T15:36:55.8048994Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-20T15:36:55.8049237Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:55.8049455Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:55.8049766Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:55.8050000Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:55.8050221Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-20T15:36:55.8050439Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-20T15:36:55.8050649Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-20T15:36:55.8050837Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-20T15:36:55.8051094Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-20T15:36:55.8051311Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-20T15:36:55.8051523Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-20T15:36:55.8051718Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-20T15:36:55.8051919Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-20T15:36:55.8052115Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-20T15:36:55.8052316Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-20T15:36:55.8052557Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-20T15:36:55.8052810Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-20T15:36:55.8053041Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-20T15:36:55.8053265Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-20T15:36:55.8053479Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-20T15:36:55.8053691Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-20T15:36:55.8053899Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-20T15:36:55.8054131Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-20T15:36:55.8054313Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-20T15:36:55.8054512Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-20T15:36:55.8054706Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-20T15:36:55.8054915Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-20T15:36:55.8055131Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-20T15:36:55.8055328Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-20T15:36:55.8055526Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-20T15:36:55.8055733Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-20T15:36:55.8055949Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-20T15:36:55.8056145Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-20T15:36:55.8056334Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-20T15:36:55.8056537Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-20T15:36:55.8056737Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-20T15:36:55.8056939Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-20T15:36:55.8057169Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-20T15:36:55.8057422Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-20T15:36:55.8057656Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-20T15:36:55.8057925Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-20T15:36:55.8058122Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-20T15:36:55.8058311Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-20T15:36:55.8058517Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-20T15:36:55.8058753Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-20T15:36:55.8058971Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-20T15:36:55.8059179Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-20T15:36:55.8059377Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-20T15:36:55.8059595Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-20T15:36:55.8059937Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-20T15:36:55.8060351Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-20T15:36:55.8060700Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-20T15:36:55.8060935Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-20T15:36:55.8061157Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-20T15:36:55.8061563Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-20T15:36:55.8061850Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-20T15:36:55.8062067Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-20T15:36:55.8062277Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-20T15:36:55.8062480Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-20T15:36:55.8062677Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-20T15:36:55.8062873Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-20T15:36:55.8063067Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-20T15:36:55.8063256Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-20T15:36:55.8063451Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-20T15:36:55.8063682Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-20T15:36:55.8063916Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-20T15:36:55.8064153Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-20T15:36:55.8064395Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-20T15:36:55.8064631Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-20T15:36:55.8064866Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-20T15:36:55.8065140Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-20T15:36:55.8065370Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-20T15:36:55.8065594Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-20T15:36:55.8065813Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-20T15:36:55.8066054Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-20T15:36:55.8066310Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-20T15:36:55.8066547Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:55.8066770Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:55.8066983Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:55.8067198Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:55.8067412Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-20T15:36:55.8067625Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-20T15:36:55.8067846Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-20T15:36:55.8068112Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-20T15:36:55.8068335Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-20T15:36:55.8068587Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-20T15:36:55.8068836Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-20T15:36:55.8069095Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-20T15:36:55.8069332Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-20T15:36:55.8069550Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-20T15:36:55.8100173Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-20T15:36:55.8100426Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-20T15:36:55.8100639Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-20T15:36:55.8100934Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-20T15:36:55.8101218Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-20T15:36:55.8101542Z Cause 1: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :core.
2026-08-20T15:36:55.8101698Z Required by:
2026-08-20T15:36:55.8101813Z     project :pix
2026-08-20T15:36:55.8102316Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :core:
2026-08-20T15:36:55.8102830Z   - devApiElements
2026-08-20T15:36:55.8102971Z   - hmpApiElements
2026-08-20T15:36:55.8103108Z   - pilotoApiElements
2026-08-20T15:36:55.8103241Z   - producaoApiElements
2026-08-20T15:36:55.8103369Z All of them match the consumer attributes:
2026-08-20T15:36:55.8103633Z   - Variant 'devApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-20T15:36:55.8103834Z       - Unmatched attributes:
2026-08-20T15:36:55.8104105Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:55.8104411Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-20T15:36:55.8104720Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-20T15:36:55.8104976Z           - Doesn't say anything about its component category (required a library)
2026-08-20T15:36:55.8105214Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-20T15:36:55.8105497Z   - Variant 'hmpApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-20T15:36:55.8105698Z       - Unmatched attributes:
2026-08-20T15:36:55.8105953Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:55.8106257Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-20T15:36:55.8106558Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-20T15:36:55.8106888Z           - Doesn't say anything about its component category (required a library)
2026-08-20T15:36:55.8107117Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-20T15:36:55.8107403Z   - Variant 'pilotoApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-20T15:36:55.8107603Z       - Unmatched attributes:
2026-08-20T15:36:55.8107857Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:55.8108147Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-20T15:36:55.8108451Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-20T15:36:55.8108699Z           - Doesn't say anything about its component category (required a library)
2026-08-20T15:36:55.8108937Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-20T15:36:55.8109222Z   - Variant 'producaoApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-20T15:36:55.8109428Z       - Unmatched attributes:
2026-08-20T15:36:55.8109755Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:55.8110065Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-20T15:36:55.8110369Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-20T15:36:55.8110616Z           - Doesn't say anything about its component category (required a library)
2026-08-20T15:36:55.8110886Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-20T15:36:55.8111248Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-20T15:36:55.8111522Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-20T15:36:55.8111784Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-20T15:36:55.8112037Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-20T15:36:55.8112287Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-20T15:36:55.8112550Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-20T15:36:55.8112800Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-20T15:36:55.8113078Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-20T15:36:55.8113356Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-20T15:36:55.8113617Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-20T15:36:55.8113880Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-20T15:36:55.8114136Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-20T15:36:55.8114454Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-20T15:36:55.8114708Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-20T15:36:55.8114969Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-20T15:36:55.8115209Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-20T15:36:55.8115435Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-20T15:36:55.8115679Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-20T15:36:55.8115935Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-20T15:36:55.8116174Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:55.8116396Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:55.8116613Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:55.8116832Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:55.8117050Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-20T15:36:55.8117264Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-20T15:36:55.8117497Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-20T15:36:55.8117791Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-20T15:36:55.8118039Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-20T15:36:55.8118281Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-20T15:36:55.8118518Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-20T15:36:55.8118751Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-20T15:36:55.8118992Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-20T15:36:55.8119254Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-20T15:36:55.8119495Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-20T15:36:55.8120045Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-20T15:36:55.8120337Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-20T15:36:55.8120603Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-20T15:36:55.8121045Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-20T15:36:55.8121333Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-20T15:36:55.8121565Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-20T15:36:55.8121843Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-20T15:36:55.8122113Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-20T15:36:55.8122448Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-20T15:36:55.8122691Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-20T15:36:55.8122908Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-20T15:36:55.8123166Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-20T15:36:55.8123372Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-20T15:36:55.8123599Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-20T15:36:55.8123801Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-20T15:36:55.8123977Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-20T15:36:55.8124177Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-20T15:36:55.8124392Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-20T15:36:55.8124607Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-20T15:36:55.8124808Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-20T15:36:55.8125080Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-20T15:36:55.8125305Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-20T15:36:55.8125526Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:55.8125743Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:55.8125960Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:55.8126180Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:55.8126395Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-20T15:36:55.8126615Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-20T15:36:55.8126860Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-20T15:36:55.8127157Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-20T15:36:55.8127388Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-20T15:36:55.8127598Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-20T15:36:55.8127796Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-20T15:36:55.8127988Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-20T15:36:55.8128180Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-20T15:36:55.8128440Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-20T15:36:55.8128655Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-20T15:36:55.8128973Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-20T15:36:55.8129213Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:55.8129452Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:55.8129771Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:55.8130025Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:55.8130366Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-20T15:36:55.8130699Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-20T15:36:55.8131012Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-20T15:36:55.8131298Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-20T15:36:55.8131525Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-20T15:36:55.8131746Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-20T15:36:55.8131956Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-20T15:36:55.8132165Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-20T15:36:55.8132365Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-20T15:36:55.8132619Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-20T15:36:55.8132822Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-20T15:36:55.8133061Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-20T15:36:55.8133313Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-20T15:36:55.8133539Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-20T15:36:55.8133762Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-20T15:36:55.8133981Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-20T15:36:55.8134193Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-20T15:36:55.8134403Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-20T15:36:55.8134589Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-20T15:36:55.8134767Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-20T15:36:55.8134960Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-20T15:36:55.8135155Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-20T15:36:55.8135358Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-20T15:36:55.8135579Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-20T15:36:55.8135837Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-20T15:36:55.8136038Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-20T15:36:55.8136243Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-20T15:36:55.8136451Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-20T15:36:55.8136641Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-20T15:36:55.8136818Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-20T15:36:55.8137018Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-20T15:36:55.8137216Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-20T15:36:55.8137415Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-20T15:36:55.8137680Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-20T15:36:55.8138044Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-20T15:36:55.8138370Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-20T15:36:55.8138671Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-20T15:36:55.8138980Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-20T15:36:55.8139285Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-20T15:36:55.8139599Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-20T15:36:55.8140071Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-20T15:36:55.8140394Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-20T15:36:55.8140607Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-20T15:36:55.8140858Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-20T15:36:55.8141150Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-20T15:36:55.8141389Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-20T15:36:55.8141629Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-20T15:36:55.8141858Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-20T15:36:55.8142087Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-20T15:36:55.8142308Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-20T15:36:55.8142521Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-20T15:36:55.8142737Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-20T15:36:55.8142952Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-20T15:36:55.8143156Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-20T15:36:55.8143359Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-20T15:36:55.8143618Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-20T15:36:55.8143891Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-20T15:36:55.8144091Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-20T15:36:55.8144279Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-20T15:36:55.8144477Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-20T15:36:55.8144704Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-20T15:36:55.8144942Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-20T15:36:55.8145175Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-20T15:36:55.8145417Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-20T15:36:55.8145675Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-20T15:36:55.8145904Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-20T15:36:55.8146117Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-20T15:36:55.8146348Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-20T15:36:55.8146572Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-20T15:36:55.8146792Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-20T15:36:55.8147033Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-20T15:36:55.8147341Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-20T15:36:55.8147582Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:55.8147802Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:55.8148016Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:55.8148232Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:55.8148443Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-20T15:36:55.8148656Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-20T15:36:55.8148876Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-20T15:36:55.8149084Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-20T15:36:55.8149311Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-20T15:36:55.8149555Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-20T15:36:55.8149881Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-20T15:36:55.8150198Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-20T15:36:55.8150489Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-20T15:36:55.8150703Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-20T15:36:55.8151019Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-20T15:36:55.8151234Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-20T15:36:55.8151443Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-20T15:36:55.8151653Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-20T15:36:55.8151839Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-20T15:36:55.8152020Z Cause 2: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :dto.
2026-08-20T15:36:55.8152166Z Required by:
2026-08-20T15:36:55.8152274Z     project :pix
2026-08-20T15:36:55.8152785Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :dto:
2026-08-20T15:36:55.8153094Z   - devApiElements
2026-08-20T15:36:55.8153227Z   - hmpApiElements
2026-08-20T15:36:55.8153364Z   - pilotoApiElements
2026-08-20T15:36:55.8153505Z   - producaoApiElements
2026-08-20T15:36:55.8153626Z All of them match the consumer attributes:
2026-08-20T15:36:55.8153870Z   - Variant 'devApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-20T15:36:55.8154064Z       - Unmatched attributes:
2026-08-20T15:36:55.8154319Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:55.8154695Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-20T15:36:55.8155048Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-20T15:36:55.8155296Z           - Doesn't say anything about its component category (required a library)
2026-08-20T15:36:55.8155532Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-20T15:36:55.8155808Z   - Variant 'hmpApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-20T15:36:55.8156004Z       - Unmatched attributes:
2026-08-20T15:36:55.8156262Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:55.8156563Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-20T15:36:55.8156862Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-20T15:36:55.8157109Z           - Doesn't say anything about its component category (required a library)
2026-08-20T15:36:55.8157344Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-20T15:36:55.8157624Z   - Variant 'pilotoApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-20T15:36:55.8157822Z       - Unmatched attributes:
2026-08-20T15:36:55.8158073Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:55.8158355Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-20T15:36:55.8158711Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-20T15:36:55.8158958Z           - Doesn't say anything about its component category (required a library)
2026-08-20T15:36:55.8159187Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-20T15:36:55.8159463Z   - Variant 'producaoApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-20T15:36:55.8160189Z       - Unmatched attributes:
2026-08-20T15:36:55.8160526Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-20T15:36:55.8160878Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-20T15:36:55.8161266Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-20T15:36:55.8161520Z           - Doesn't say anything about its component category (required a library)
2026-08-20T15:36:55.8161751Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-20T15:36:55.8161978Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-20T15:36:55.8162254Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-20T15:36:55.8162514Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-20T15:36:55.8162771Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-20T15:36:55.8163121Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-20T15:36:55.8163391Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-20T15:36:55.8163657Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-20T15:36:55.8163933Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-20T15:36:55.8164214Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-20T15:36:55.8164476Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-20T15:36:55.8164741Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-20T15:36:55.8165006Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-20T15:36:55.8165338Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-20T15:36:55.8165683Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-20T15:36:55.8165943Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-20T15:36:55.8166184Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-20T15:36:55.8166452Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-20T15:36:55.8166690Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-20T15:36:55.8166943Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-20T15:36:55.8167175Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:55.8167393Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:55.8167606Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:55.8167825Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:55.8168040Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-20T15:36:55.8168251Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-20T15:36:55.8168483Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-20T15:36:55.8168732Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-20T15:36:55.8168978Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-20T15:36:55.8169224Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-20T15:36:55.8169459Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-20T15:36:55.8169827Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-20T15:36:55.8170072Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-20T15:36:55.8170321Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-20T15:36:55.8170673Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-20T15:36:55.8171092Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-20T15:36:55.8171497Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-20T15:36:55.8171891Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-20T15:36:55.8172150Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-20T15:36:55.8172374Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-20T15:36:55.8172593Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-20T15:36:55.8172785Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-20T15:36:55.8172992Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-20T15:36:55.8173219Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-20T15:36:55.8173514Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-20T15:36:55.8173737Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-20T15:36:55.8173933Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-20T15:36:55.8174134Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-20T15:36:55.8174364Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-20T15:36:55.8174606Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-20T15:36:55.8174819Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-20T15:36:55.8175020Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-20T15:36:55.8175239Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-20T15:36:55.8175455Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-20T15:36:55.8175664Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-20T15:36:55.8175876Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-20T15:36:55.8176094Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-20T15:36:55.8176310Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:55.8176523Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:55.8176729Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:55.8177005Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:55.8177221Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-20T15:36:55.8177440Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-20T15:36:55.8177655Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-20T15:36:55.8177863Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-20T15:36:55.8178084Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-20T15:36:55.8178298Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-20T15:36:55.8178503Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-20T15:36:55.8178701Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-20T15:36:55.8178896Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-20T15:36:55.8179127Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-20T15:36:55.8179444Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-20T15:36:55.8179768Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-20T15:36:55.8180054Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:55.8180284Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:55.8180576Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:55.8180840Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:55.8181121Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-20T15:36:55.8181349Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-20T15:36:55.8181555Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-20T15:36:55.8181743Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-20T15:36:55.8181952Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-20T15:36:55.8182172Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-20T15:36:55.8182387Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-20T15:36:55.8182599Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-20T15:36:55.8182801Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-20T15:36:55.8182999Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-20T15:36:55.8183204Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-20T15:36:55.8183447Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-20T15:36:55.8183701Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-20T15:36:55.8183938Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-20T15:36:55.8184220Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-20T15:36:55.8184437Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-20T15:36:55.8184651Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-20T15:36:55.8184849Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-20T15:36:55.8185038Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-20T15:36:55.8185217Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-20T15:36:55.8185437Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-20T15:36:55.8185630Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-20T15:36:55.8185846Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-20T15:36:55.8186061Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-20T15:36:55.8186270Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-20T15:36:55.8186471Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-20T15:36:55.8186678Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-20T15:36:55.8186892Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-20T15:36:55.8187085Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-20T15:36:55.8187273Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-20T15:36:55.8187580Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-20T15:36:55.8187787Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-20T15:36:55.8187989Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-20T15:36:55.8188203Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-20T15:36:55.8188449Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-20T15:36:55.8188680Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-20T15:36:55.8188891Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-20T15:36:55.8189143Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-20T15:36:55.8189387Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-20T15:36:55.8189597Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-20T15:36:55.8189898Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-20T15:36:55.8190131Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-20T15:36:55.8190344Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-20T15:36:55.8190622Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-20T15:36:55.8190909Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-20T15:36:55.8191159Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-20T15:36:55.8191457Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-20T15:36:55.8191748Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-20T15:36:55.8191976Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-20T15:36:55.8192195Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-20T15:36:55.8192410Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-20T15:36:55.8192622Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-20T15:36:55.8192835Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-20T15:36:55.8193042Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-20T15:36:55.8193246Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-20T15:36:55.8193437Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-20T15:36:55.8193639Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-20T15:36:55.8193833Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-20T15:36:55.8194022Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-20T15:36:55.8194225Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-20T15:36:55.8207303Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-20T15:36:55.8207743Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-20T15:36:55.8207990Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-20T15:36:55.8208238Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-20T15:36:55.8208483Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-20T15:36:55.8208718Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-20T15:36:55.8208947Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-20T15:36:55.8209178Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-20T15:36:55.8209409Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-20T15:36:55.8209735Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-20T15:36:55.8210029Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-20T15:36:55.8210301Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-20T15:36:55.8210535Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-20T15:36:55.8210766Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:55.8211050Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-20T15:36:55.8211344Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-20T15:36:55.8211558Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-20T15:36:55.8211773Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-20T15:36:55.8211993Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-20T15:36:55.8212203Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-20T15:36:55.8212430Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-20T15:36:55.8212668Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-20T15:36:55.8212911Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-20T15:36:55.8213170Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-20T15:36:55.8213401Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-20T15:36:55.8213608Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-20T15:36:55.8213819Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-20T15:36:55.8214030Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-20T15:36:55.8214236Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-20T15:36:55.8214493Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-20T15:36:55.8214664Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-20T15:36:56.0080492Z 
2026-08-20T15:36:56.0250733Z > Task :ticket:spec
2026-08-20T15:36:56.0930425Z 
2026-08-20T15:36:56.0940595Z Deprecated Gradle features were used in this build, making it incompatible with Gradle 9.0.
2026-08-20T15:36:56.0940973Z 
2026-08-20T15:36:56.0942544Z You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.
2026-08-20T15:36:56.0942758Z 
2026-08-20T15:36:56.0943100Z See https://docs.gradle.org/8.1.1/userguide/command_line_interface.html#sec:command_line_warnings
2026-08-20T15:36:56.0943374Z 
2026-08-20T15:36:56.0943644Z BUILD SUCCESSFUL in 19s
2026-08-20T15:36:56.0945137Z 8 actionable tasks: 8 executed
2026-08-20T15:36:56.6300760Z Packaging project...
2026-08-20T15:37:04.1834653Z Compressing job files...
2026-08-20T15:37:08.9321030Z Uploading job...
2026-08-20T15:37:13.3188922Z Submitted job and received token:  21805559-c989-43d3-9d6b-ec3c134caa86
2026-08-20T15:37:13.4017243Z ##[debug]Exit code 0 received from tool '/bin/bash'
2026-08-20T15:37:13.4017599Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-08-20T15:37:13.4017857Z ##[debug]task result: Succeeded
2026-08-20T15:37:13.4018816Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-08-20T15:37:13.4037909Z ##[section]Finishing: Iniciando Análise no Fortify
