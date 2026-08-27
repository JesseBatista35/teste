<img width="800" height="94" alt="image" src="https://github.com/user-attachments/assets/961b616b-ca00-40fc-8116-4fd968a751e5" />


<img width="1068" height="902" alt="image" src="https://github.com/user-attachments/assets/e0cdfe92-cc78-48be-855d-998cfa035fc4" />


<img width="929" height="870" alt="image" src="https://github.com/user-attachments/assets/6d4c26a8-bee4-49fe-a387-1b7654c26cdf" />


Jesse Mouta Pereira Batista
A troca é intencional. Algumas vezes preciso mandar 1.0.0, outras 1.4.8, às vezes 1.4.7; então, depende da situação.
 
As 2 últimas vezes deram erro no Fortify tanto para 1.0.0 quanto para 1.4.8:


2026-08-27T14:47:36.8619432Z ##[debug]Evaluating condition for step: 'Iniciando Análise no Fortify'
2026-08-27T14:47:36.8620145Z ##[debug]Evaluating: and(succeeded(), ne(variables['fortify_disable'], 'gecmi'), ne(variables['p_language'], 'dotnet'))
2026-08-27T14:47:36.8620390Z ##[debug]Evaluating and:
2026-08-27T14:47:36.8620569Z ##[debug]..Evaluating succeeded:
2026-08-27T14:47:36.8620969Z ##[debug]..=> True
2026-08-27T14:47:36.8621354Z ##[debug]..Evaluating ne:
2026-08-27T14:47:36.8621493Z ##[debug]....Evaluating indexer:
2026-08-27T14:47:36.8621638Z ##[debug]......Evaluating variables:
2026-08-27T14:47:36.8622103Z ##[debug]......=> Object
2026-08-27T14:47:36.8622250Z ##[debug]......Evaluating String:
2026-08-27T14:47:36.8622423Z ##[debug]......=> 'fortify_disable'
2026-08-27T14:47:36.8622622Z ##[debug]....=> ''
2026-08-27T14:47:36.8622749Z ##[debug]....Evaluating String:
2026-08-27T14:47:36.8622895Z ##[debug]....=> 'gecmi'
2026-08-27T14:47:36.8623035Z ##[debug]..=> True
2026-08-27T14:47:36.8623193Z ##[debug]..Evaluating ne:
2026-08-27T14:47:36.8623358Z ##[debug]....Evaluating indexer:
2026-08-27T14:47:36.8623496Z ##[debug]......Evaluating variables:
2026-08-27T14:47:36.8623619Z ##[debug]......=> Object
2026-08-27T14:47:36.8623763Z ##[debug]......Evaluating String:
2026-08-27T14:47:36.8623916Z ##[debug]......=> 'p_language'
2026-08-27T14:47:36.8624133Z ##[debug]....=> 'android'
2026-08-27T14:47:36.8624280Z ##[debug]....Evaluating String:
2026-08-27T14:47:36.8624418Z ##[debug]....=> 'dotnet'
2026-08-27T14:47:36.8624524Z ##[debug]..=> True
2026-08-27T14:47:36.8624627Z ##[debug]=> True
2026-08-27T14:47:36.8624931Z ##[debug]Expanded: and(True, ne('', 'gecmi'), ne('android', 'dotnet'))
2026-08-27T14:47:36.8625144Z ##[debug]Result: True
2026-08-27T14:47:36.8625435Z ##[section]Starting: Iniciando Análise no Fortify
2026-08-27T14:47:36.8628927Z ==============================================================================
2026-08-27T14:47:36.8629017Z Task         : Bash
2026-08-27T14:47:36.8629081Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-27T14:47:36.8629164Z Version      : 3.227.0
2026-08-27T14:47:36.8629211Z Author       : Microsoft Corporation
2026-08-27T14:47:36.8629262Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-27T14:47:36.8629344Z ==============================================================================
2026-08-27T14:47:36.9029574Z ##[debug]Using node path: /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/externals/node16/bin/node
2026-08-27T14:47:36.9139528Z Warning: Ignoring extra certs from `/etc/pki/ca-trust/source/anchors/AC-V4.cer`, load failed: error:02001002:system library:fopen:No such file or directory
2026-08-27T14:47:36.9924201Z ##[debug]agent.TempDirectory=/opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp
2026-08-27T14:47:36.9933425Z ##[debug]loading inputs and endpoints
2026-08-27T14:47:36.9936773Z ##[debug]loading INPUT_TARGETTYPE
2026-08-27T14:47:36.9944602Z ##[debug]loading INPUT_FILEPATH
2026-08-27T14:47:36.9945372Z ##[debug]loading INPUT_SCRIPT
2026-08-27T14:47:36.9946309Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-08-27T14:47:36.9947468Z ##[debug]loading INPUT_FAILONSTDERR
2026-08-27T14:47:36.9948959Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-08-27T14:47:36.9949650Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-08-27T14:47:36.9951239Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-08-27T14:47:36.9955803Z ##[debug]loading SECRET_AZPAT
2026-08-27T14:47:36.9957226Z ##[debug]loading SECRET_KEYSTORE_PWD
2026-08-27T14:47:36.9958842Z ##[debug]loading SECRET_APIJSONGOOGLE
2026-08-27T14:47:36.9961290Z ##[debug]loading SECRET_FORTIFY_UPTOKEN
2026-08-27T14:47:36.9962477Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-08-27T14:47:36.9963876Z ##[debug]loading SECRET_SCANCENTRAL_SSCCITOKEN
2026-08-27T14:47:36.9964249Z ##[debug]loading SECRET_FORTIFY_CI_TOKEN
2026-08-27T14:47:36.9964851Z ##[debug]loading SECRET_NEXUS_INTERNO_PASS
2026-08-27T14:47:36.9965543Z ##[debug]loading SECRET_FORTIFY_CLIENT_AUTH_TOKEN
2026-08-27T14:47:36.9966227Z ##[debug]loading SECRET_FORTIFY_PASS
2026-08-27T14:47:36.9967118Z ##[debug]loading SECRET_TOKEN_CRQ
2026-08-27T14:47:36.9968084Z ##[debug]loading SECRET_KEYSTOREPASS
2026-08-27T14:47:36.9968828Z ##[debug]loading SECRET_FORTIFY_TOKEN
2026-08-27T14:47:36.9969629Z ##[debug]loading SECRET_FORTIFY_REGISTRY_PASSWORD
2026-08-27T14:47:36.9971400Z ##[debug]loading SECRET_GITTOKEN
2026-08-27T14:47:36.9971694Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-08-27T14:47:36.9971946Z ##[debug]loading SECRET_SCANCENTRAL_CLIENTTOKEN
2026-08-27T14:47:36.9972468Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-08-27T14:47:36.9973149Z ##[debug]loading SECRET_FIREBASE_TOKEN
2026-08-27T14:47:36.9973853Z ##[debug]loaded 27
2026-08-27T14:47:36.9980919Z ##[debug]Agent.ProxyUrl=undefined
2026-08-27T14:47:36.9981884Z ##[debug]Agent.CAInfo=undefined
2026-08-27T14:47:36.9982142Z ##[debug]Agent.ClientCert=undefined
2026-08-27T14:47:36.9982368Z ##[debug]Agent.SkipCertValidation=True
2026-08-27T14:47:37.0012671Z ##[debug]check path : /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-08-27T14:47:37.0014251Z ##[debug]adding resource file: /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-08-27T14:47:37.0015086Z ##[debug]system.culture=en-US
2026-08-27T14:47:37.0052582Z ##[debug]failOnStderr=false
2026-08-27T14:47:37.0053551Z ##[debug]workingDirectory=/opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r14/a
2026-08-27T14:47:37.0054301Z ##[debug]check path : /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r14/a
2026-08-27T14:47:37.0054895Z ##[debug]targetType=inline
2026-08-27T14:47:37.0055376Z ##[debug]bashEnvValue=undefined
2026-08-27T14:47:37.0057925Z ##[debug]script=#!/bin/bash

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

scancentral -url http://scancentral.apps.produtos4.caixa/scancentral-ctrl start -bt mvn -pool 794601f7-da27-467b-a734-06f92c4d63aa -application sieco-android -version 1.0.0 -uptoken *** -fprssc aa3f5b11c012c2da7052b4376057dabb5760ea5c.fpr -upload

elif [ $p_lang == android ]
then
cd /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r14/a/SIECO-Android
chmod +x gradlew
sed -i  "s,distributionUrl=.*,distributionUrl=file:///opt/ferramentas/gradle/gradle-$(awk '/distributionUrl/ {print $0}' /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r14/a/SIECO-Android/gradle/wrapper/gradle-wrapper.properties | sed 's/.*gradle-\(.*\)-.*/\1/g')-all.zip," gradle/wrapper/gradle-wrapper.properties
scancentral arguments -o -targs "-exclude './**/build/**/*'"
scancentral -url http://scancentral.apps.produtos4.caixa/scancentral-ctrl start -bt gradle -bc assembleDev -skipBuild -pool 25b9ff35-8b38-4a58-a54b-40b46436b3a1 -application sieco-android -version 1.0.0 -uptoken *** -fprssc aa3f5b11c012c2da7052b4376057dabb5760ea5c.fpr -upload

else
      if [ $PACKAGE_JSON_PATH ]
	    then
          cd $PACKAGE_JSON_PATH
		else
		  cd /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r14/a/SIECO-Android
		fi
	  scancentral arguments -o -targs "-Dcom.fortify.sca.exclude.unimported.node.modules 'true'" -targs "-exclude './**/node_modules/**/*'" -targs "-exclude './**/*.min.js'" -targs "-exclude './**/dist/**/*'"
          scancentral -url http://scancentral.apps.produtos4.caixa/scancentral-ctrl start -bt none -pool 25b9ff35-8b38-4a58-a54b-40b46436b3a1 -application sieco-android -version 1.0.0 -uptoken *** -fprssc aa3f5b11c012c2da7052b4376057dabb5760ea5c.fpr -upload
fi
2026-08-27T14:47:37.0060721Z Generating script.
2026-08-27T14:47:37.0061237Z ##[debug]which 'bash'
2026-08-27T14:47:37.0061761Z ##[debug]found: '/bin/bash'
2026-08-27T14:47:37.0062664Z ##[debug]Agent.Version=3.225.2
2026-08-27T14:47:37.0063112Z ##[debug]agent.tempDirectory=/opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp
2026-08-27T14:47:37.0063413Z ##[debug]check path : /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp
2026-08-27T14:47:37.0063823Z ========================== Starting Command Output ===========================
2026-08-27T14:47:37.0064044Z ##[debug]which '/bin/bash'
2026-08-27T14:47:37.0064313Z ##[debug]found: '/bin/bash'
2026-08-27T14:47:37.0065023Z ##[debug]/bin/bash arg: /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp/f05c015f-de9b-457d-ad47-09f5e0ff6a3b.sh
2026-08-27T14:47:37.0065441Z ##[debug]exec tool: /bin/bash
2026-08-27T14:47:37.0065782Z ##[debug]arguments:
2026-08-27T14:47:37.0066182Z ##[debug]   /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp/f05c015f-de9b-457d-ad47-09f5e0ff6a3b.sh
2026-08-27T14:47:37.0066659Z [command]/bin/bash /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp/f05c015f-de9b-457d-ad47-09f5e0ff6a3b.sh
2026-08-27T14:47:37.1744347Z Apache Maven 3.6.2 (40f52333136460af0dc0d7232c0dc0bcf0d9e117; 2019-08-27T12:06:16-03:00)
2026-08-27T14:47:37.1744916Z Maven home: /opt/ferramentas/maven/apache-maven-3.6.2
2026-08-27T14:47:37.1745469Z Java version: 17.0.7, vendor: Oracle Corporation, runtime: /opt/ferramentas/jdk/jdk17.0.7
2026-08-27T14:47:37.1745705Z Default locale: pt_BR, platform encoding: UTF-8
2026-08-27T14:47:37.1746083Z OS name: "linux", version: "3.10.0-1062.9.1.el7.x86_64", arch: "amd64", family: "unix"
2026-08-27T14:47:37.1802884Z Iniciando Fortify Clean, Translate e Analysis
2026-08-27T14:47:37.1824258Z LANG android
2026-08-27T14:47:37.6465684Z launcher.log will be stored in "/home/sadscp01/.fortify/scancentral-22.2.0/log" directory.
2026-08-27T14:47:38.4349460Z Update failed.
2026-08-27T14:47:38.4350182Z Unable to identify the Controller URL. Specify either the -url option or the -sscurl and -ssctoken options.
2026-08-27T14:47:38.9563093Z scancentral.log will be stored in "/home/sadscp01/.fortify/scancentral-22.2.0/log" directory.
2026-08-27T14:47:41.1838697Z Creating the fortify-sca.settings file.
2026-08-27T14:47:41.5312989Z launcher.log will be stored in "/home/sadscp01/.fortify/scancentral-22.2.0/log" directory.
2026-08-27T14:47:42.0562580Z Checking for updates...
2026-08-27T14:47:42.0935995Z No update available or auto update is disabled on the controller.
2026-08-27T14:47:42.2933480Z scancentral.log will be stored in "/home/sadscp01/.fortify/scancentral-22.2.0/log" directory.
2026-08-27T14:47:43.9432557Z Verifying controller URL...
2026-08-27T14:47:44.0546331Z The Controller at http://scancentral.apps.produtos4.caixa/scancentral-ctrl is UP
2026-08-27T14:47:44.0709297Z No email address detected. No status emails will be sent for this job.
2026-08-27T14:47:44.0731805Z Gathering project information...
2026-08-27T14:47:45.4285518Z To honour the JVM settings for this build a single-use Daemon process will be forked. See https://docs.gradle.org/8.1/userguide/gradle_daemon.html#sec:disabling_the_daemon.
2026-08-27T14:47:46.9265776Z Daemon will be stopped at the end of the build 
2026-08-27T14:47:47.3267752Z Configuration on demand is an incubating feature.
2026-08-27T14:47:54.6335935Z > Task :spec
2026-08-27T14:47:56.3364843Z Warning: SDK processing. This version only understands SDK XML versions up to 3 but an SDK XML file of version 4 was encountered. This can happen if you use versions of Android Studio and the command-line tools that were released at different times.
2026-08-27T14:47:56.3393819Z 
2026-08-27T14:47:56.3394453Z > Task :app:spec
2026-08-27T14:47:56.3394891Z WARNING: We recommend using a newer Android Gradle plugin to use compileSdk = 35
2026-08-27T14:47:56.3395993Z 
2026-08-27T14:47:56.3396269Z This Android Gradle plugin (8.1.1) was tested up to compileSdk = 34.
2026-08-27T14:47:56.3396736Z 
2026-08-27T14:47:56.3396974Z You are strongly encouraged to update your project to use a newer
2026-08-27T14:47:56.3397400Z Android Gradle plugin that has been tested with compileSdk = 35.
2026-08-27T14:47:56.3399253Z 
2026-08-27T14:47:56.3399671Z If you are already using the latest version of the Android Gradle plugin,
2026-08-27T14:47:56.3399958Z you may need to wait until a newer version with support for compileSdk = 35 is available.
2026-08-27T14:47:56.3400194Z 
2026-08-27T14:47:56.3400572Z To suppress this warning, add/update
2026-08-27T14:47:56.3400983Z     android.suppressUnsupportedCompileSdk=36,35
2026-08-27T14:47:56.3401630Z to this project's gradle.properties.
2026-08-27T14:47:56.3402114Z Can't resolve artifacts for implementationDependenciesMetadata configuration. Artifacts are ignored.
2026-08-27T14:47:56.3542589Z org.gradle.internal.exceptions.DefaultMultiCauseException: Could not resolve all files for configuration ':app:implementationDependenciesMetadata'.
2026-08-27T14:47:56.3609757Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.mapFailure(DefaultConfiguration.java:1716)
2026-08-27T14:47:56.3632287Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$3400(DefaultConfiguration.java:177)
2026-08-27T14:47:56.3731871Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$DefaultResolutionHost.mapFailure(DefaultConfiguration.java:2443)
2026-08-27T14:47:56.3732354Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionHost.rethrowFailure(ResolutionHost.java:30)
2026-08-27T14:47:56.3733006Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:74)
2026-08-27T14:47:56.3733570Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-27T14:47:56.3733823Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-27T14:47:56.3734057Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-27T14:47:56.3734266Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-27T14:47:56.3735917Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-27T14:47:56.3736162Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-27T14:47:56.3736673Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-27T14:47:56.3736895Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-27T14:47:56.3737087Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-27T14:47:56.3737290Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-27T14:47:56.3737588Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-27T14:47:56.3737892Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-27T14:47:56.3738154Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-27T14:47:56.3738359Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-27T14:47:56.3738706Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-27T14:47:56.3739015Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-27T14:47:56.3739345Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-27T14:47:56.3739566Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-27T14:47:56.3740101Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-27T14:47:56.3740319Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:56.3740526Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.3740841Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:56.3741275Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.3741548Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-27T14:47:56.3741764Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-27T14:47:56.3741990Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-27T14:47:56.3742201Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-27T14:47:56.3742422Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-27T14:47:56.3742638Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-27T14:47:56.3742842Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-27T14:47:56.3743037Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-27T14:47:56.3743227Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-27T14:47:56.3743418Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-27T14:47:56.3743645Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T14:47:56.3743909Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T14:47:56.3744149Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:56.3744363Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.3744669Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:56.3744959Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.3745168Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T14:47:56.3745383Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T14:47:56.3745581Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-27T14:47:56.3745761Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-27T14:47:56.3745964Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-27T14:47:56.3746180Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-27T14:47:56.3746392Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-27T14:47:56.3746594Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-27T14:47:56.3746790Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-27T14:47:56.3747047Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-27T14:47:56.3747411Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-27T14:47:56.3747729Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-27T14:47:56.3747978Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-27T14:47:56.3748275Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-27T14:47:56.3748667Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-27T14:47:56.3748991Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-27T14:47:56.3749311Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-27T14:47:56.3749556Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-27T14:47:56.3749743Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-27T14:47:56.3749967Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-27T14:47:56.3750240Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-27T14:47:56.3750534Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-27T14:47:56.3750742Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-27T14:47:56.3750951Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-27T14:47:56.3751275Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-27T14:47:56.3751482Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-27T14:47:56.3751690Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-27T14:47:56.3751901Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-27T14:47:56.3752114Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-27T14:47:56.3752380Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-27T14:47:56.3752671Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-27T14:47:56.3753043Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-27T14:47:56.3753291Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-27T14:47:56.3753517Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-27T14:47:56.3753944Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-27T14:47:56.3754189Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-27T14:47:56.3754399Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-27T14:47:56.3754666Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-27T14:47:56.3754916Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-27T14:47:56.3755127Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-27T14:47:56.3755360Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-27T14:47:56.3755777Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-27T14:47:56.3756064Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-27T14:47:56.3756307Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-27T14:47:56.3756594Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-27T14:47:56.3756996Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-27T14:47:56.3757253Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-27T14:47:56.3757497Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-27T14:47:56.3757730Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-27T14:47:56.3757949Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-27T14:47:56.3758156Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-27T14:47:56.3758377Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-27T14:47:56.3758722Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-27T14:47:56.3758932Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-27T14:47:56.3759136Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-27T14:47:56.3759336Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-27T14:47:56.3759535Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-27T14:47:56.3759725Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-27T14:47:56.3759916Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-27T14:47:56.3760168Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-27T14:47:56.3760398Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-27T14:47:56.3760632Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-27T14:47:56.3760861Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-27T14:47:56.3761196Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-27T14:47:56.3761500Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-27T14:47:56.3761726Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-27T14:47:56.3761947Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-27T14:47:56.3762172Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-27T14:47:56.3762398Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-27T14:47:56.3762614Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-27T14:47:56.3762847Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T14:47:56.3763180Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T14:47:56.3763404Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:56.3763621Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.3763832Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:56.3764104Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.3764319Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T14:47:56.3764582Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T14:47:56.3764847Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-27T14:47:56.3765061Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-27T14:47:56.3765295Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-27T14:47:56.3765545Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-27T14:47:56.3765851Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-27T14:47:56.3766183Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-27T14:47:56.3766546Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-27T14:47:56.3766873Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-27T14:47:56.3767132Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-27T14:47:56.3767339Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-27T14:47:56.3767545Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-27T14:47:56.3767760Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-27T14:47:56.3767934Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-27T14:47:56.3768103Z Cause 1: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :ticket.
2026-08-27T14:47:56.3768247Z Required by:
2026-08-27T14:47:56.3768360Z     project :app
2026-08-27T14:47:56.3768967Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :ticket:
2026-08-27T14:47:56.3769341Z   - devApiElements
2026-08-27T14:47:56.3769474Z   - hmpApiElements
2026-08-27T14:47:56.3769610Z   - pilotoApiElements
2026-08-27T14:47:56.3769749Z   - producaoApiElements
2026-08-27T14:47:56.3769872Z All of them match the consumer attributes:
2026-08-27T14:47:56.3770130Z   - Variant 'devApiElements' capability SIECO-Android:ticket:unspecified declares a component for use during compile-time:
2026-08-27T14:47:56.3770325Z       - Unmatched attributes:
2026-08-27T14:47:56.3770579Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:56.3770867Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T14:47:56.3771383Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T14:47:56.3771698Z           - Doesn't say anything about its component category (required a library)
2026-08-27T14:47:56.3772110Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T14:47:56.3772603Z   - Variant 'hmpApiElements' capability SIECO-Android:ticket:unspecified declares a component for use during compile-time:
2026-08-27T14:47:56.3772900Z       - Unmatched attributes:
2026-08-27T14:47:56.3773251Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:56.3773651Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T14:47:56.3774101Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T14:47:56.3774456Z           - Doesn't say anything about its component category (required a library)
2026-08-27T14:47:56.3774822Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T14:47:56.3775259Z   - Variant 'pilotoApiElements' capability SIECO-Android:ticket:unspecified declares a component for use during compile-time:
2026-08-27T14:47:56.3775576Z       - Unmatched attributes:
2026-08-27T14:47:56.3775913Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:56.3776371Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T14:47:56.3776804Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T14:47:56.3777180Z           - Doesn't say anything about its component category (required a library)
2026-08-27T14:47:56.3777534Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T14:47:56.3777969Z   - Variant 'producaoApiElements' capability SIECO-Android:ticket:unspecified declares a component for use during compile-time:
2026-08-27T14:47:56.3778310Z       - Unmatched attributes:
2026-08-27T14:47:56.3778690Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:56.3779142Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T14:47:56.3779626Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T14:47:56.3780016Z           - Doesn't say anything about its component category (required a library)
2026-08-27T14:47:56.3780365Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T14:47:56.3780703Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-27T14:47:56.3792008Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-27T14:47:56.3792494Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-27T14:47:56.3792754Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-27T14:47:56.3793006Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-27T14:47:56.3793507Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-27T14:47:56.3793864Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-27T14:47:56.3794143Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-27T14:47:56.3794491Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-27T14:47:56.3794750Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-27T14:47:56.3795008Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-27T14:47:56.3795263Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-27T14:47:56.3795516Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-27T14:47:56.3795764Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-27T14:47:56.3796165Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-27T14:47:56.3796408Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-27T14:47:56.3796628Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-27T14:47:56.3796867Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T14:47:56.3797120Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T14:47:56.3797350Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:56.3797569Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.3797777Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:56.3797993Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.3798193Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T14:47:56.3798406Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T14:47:56.3798637Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-27T14:47:56.3798876Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-27T14:47:56.3799126Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-27T14:47:56.3799367Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-27T14:47:56.3799602Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-27T14:47:56.3799919Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-27T14:47:56.3800154Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-27T14:47:56.3800399Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-27T14:47:56.3800645Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-27T14:47:56.3800941Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-27T14:47:56.3801372Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-27T14:47:56.3801635Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-27T14:47:56.3801925Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-27T14:47:56.3802150Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-27T14:47:56.3802365Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-27T14:47:56.3802562Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-27T14:47:56.3802763Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-27T14:47:56.3802986Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-27T14:47:56.3803208Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-27T14:47:56.3803417Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-27T14:47:56.3803610Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-27T14:47:56.3803796Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-27T14:47:56.3804019Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-27T14:47:56.3804215Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-27T14:47:56.3804386Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-27T14:47:56.3804584Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-27T14:47:56.3804797Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-27T14:47:56.3805009Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-27T14:47:56.3805207Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-27T14:47:56.3805410Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-27T14:47:56.3805622Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-27T14:47:56.3805834Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:56.3806039Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.3806243Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:56.3806515Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.3806721Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-27T14:47:56.3806927Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-27T14:47:56.3807133Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-27T14:47:56.3807372Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-27T14:47:56.3807586Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-27T14:47:56.3807794Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-27T14:47:56.3807992Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-27T14:47:56.3808180Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-27T14:47:56.3808364Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-27T14:47:56.3808545Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-27T14:47:56.3808761Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T14:47:56.3809009Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T14:47:56.3809242Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:56.3809455Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.3809668Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:56.3809882Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.3810092Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T14:47:56.3810301Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T14:47:56.3810496Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-27T14:47:56.3810678Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-27T14:47:56.3810879Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-27T14:47:56.3811205Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-27T14:47:56.3811428Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-27T14:47:56.3811629Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-27T14:47:56.3811819Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-27T14:47:56.3812006Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-27T14:47:56.3812260Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-27T14:47:56.3812491Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-27T14:47:56.3812735Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-27T14:47:56.3812957Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-27T14:47:56.3813230Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-27T14:47:56.3813435Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-27T14:47:56.3813638Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-27T14:47:56.3813840Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-27T14:47:56.3814054Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-27T14:47:56.3814296Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-27T14:47:56.3814485Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-27T14:47:56.3814670Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-27T14:47:56.3814858Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-27T14:47:56.3815069Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-27T14:47:56.3815267Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-27T14:47:56.3815459Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-27T14:47:56.3815658Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-27T14:47:56.3815864Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-27T14:47:56.3816050Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-27T14:47:56.3816233Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-27T14:47:56.3816428Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-27T14:47:56.3816625Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-27T14:47:56.3816819Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-27T14:47:56.3817037Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-27T14:47:56.3817280Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-27T14:47:56.3817593Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-27T14:47:56.3817917Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-27T14:47:56.3818117Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-27T14:47:56.3818297Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-27T14:47:56.3818509Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-27T14:47:56.3818741Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-27T14:47:56.3818969Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-27T14:47:56.3819175Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-27T14:47:56.3819377Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-27T14:47:56.3819596Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-27T14:47:56.3819836Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-27T14:47:56.3820142Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-27T14:47:56.3820372Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-27T14:47:56.3820592Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-27T14:47:56.3820852Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-27T14:47:56.3821236Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-27T14:47:56.3821516Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-27T14:47:56.3821727Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-27T14:47:56.3821935Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-27T14:47:56.3822135Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-27T14:47:56.3822332Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-27T14:47:56.3822526Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-27T14:47:56.3822708Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-27T14:47:56.3822898Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-27T14:47:56.3823100Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-27T14:47:56.3823328Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-27T14:47:56.3823561Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-27T14:47:56.3823794Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-27T14:47:56.3824031Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-27T14:47:56.3824320Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-27T14:47:56.3824549Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-27T14:47:56.3824764Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-27T14:47:56.3824986Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-27T14:47:56.3825204Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-27T14:47:56.3825426Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-27T14:47:56.3825658Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T14:47:56.3825904Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T14:47:56.3826137Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:56.3826402Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.3826628Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:56.3826842Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.3827114Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T14:47:56.3827415Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T14:47:56.3827731Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-27T14:47:56.3828031Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-27T14:47:56.3828566Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-27T14:47:56.3828888Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-27T14:47:56.3829134Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-27T14:47:56.3829382Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-27T14:47:56.3829610Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-27T14:47:56.3829813Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-27T14:47:56.3830021Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-27T14:47:56.3830224Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-27T14:47:56.3830428Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-27T14:47:56.3830634Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-27T14:47:56.3830810Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-27T14:47:56.3830985Z Cause 2: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :core.
2026-08-27T14:47:56.3831278Z Required by:
2026-08-27T14:47:56.3831434Z     project :app
2026-08-27T14:47:56.3832011Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :core:
2026-08-27T14:47:56.3832343Z   - devApiElements
2026-08-27T14:47:56.3832469Z   - hmpApiElements
2026-08-27T14:47:56.3832603Z   - pilotoApiElements
2026-08-27T14:47:56.3832743Z   - producaoApiElements
2026-08-27T14:47:56.3832912Z All of them match the consumer attributes:
2026-08-27T14:47:56.3833174Z   - Variant 'devApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-27T14:47:56.3833373Z       - Unmatched attributes:
2026-08-27T14:47:56.3833634Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:56.3834105Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T14:47:56.3834412Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T14:47:56.3834668Z           - Doesn't say anything about its component category (required a library)
2026-08-27T14:47:56.3834946Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T14:47:56.3835219Z   - Variant 'hmpApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-27T14:47:56.3835539Z       - Unmatched attributes:
2026-08-27T14:47:56.3835786Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:56.3836175Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T14:47:56.3836536Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T14:47:56.3836881Z           - Doesn't say anything about its component category (required a library)
2026-08-27T14:47:56.3837176Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T14:47:56.3837525Z   - Variant 'pilotoApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-27T14:47:56.3837725Z       - Unmatched attributes:
2026-08-27T14:47:56.3838038Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:56.3838363Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T14:47:56.3838701Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T14:47:56.3838985Z           - Doesn't say anything about its component category (required a library)
2026-08-27T14:47:56.3839277Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T14:47:56.3839615Z   - Variant 'producaoApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-27T14:47:56.3839813Z       - Unmatched attributes:
2026-08-27T14:47:56.3840056Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:56.3840416Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T14:47:56.3840723Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T14:47:56.3840966Z           - Doesn't say anything about its component category (required a library)
2026-08-27T14:47:56.3841369Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T14:47:56.3841646Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-27T14:47:56.3841985Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-27T14:47:56.3842336Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-27T14:47:56.3842587Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-27T14:47:56.3842860Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-27T14:47:56.3843160Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-27T14:47:56.3843421Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-27T14:47:56.3843752Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-27T14:47:56.3844033Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-27T14:47:56.3844400Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-27T14:47:56.3844781Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-27T14:47:56.3845138Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-27T14:47:56.3845586Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-27T14:47:56.3845955Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-27T14:47:56.3846316Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-27T14:47:56.3846671Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-27T14:47:56.3847009Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-27T14:47:56.3847347Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T14:47:56.3847652Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T14:47:56.3847890Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:56.3848105Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.3848318Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:56.3848537Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.3848746Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T14:47:56.3848954Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T14:47:56.3849179Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-27T14:47:56.3849415Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-27T14:47:56.3849656Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-27T14:47:56.3849925Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-27T14:47:56.3850179Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-27T14:47:56.3850407Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-27T14:47:56.3850642Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-27T14:47:56.3850889Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-27T14:47:56.3851302Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-27T14:47:56.3851638Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-27T14:47:56.3852011Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-27T14:47:56.3852258Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-27T14:47:56.3852484Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-27T14:47:56.3852759Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-27T14:47:56.3852974Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-27T14:47:56.3853169Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-27T14:47:56.3853394Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-27T14:47:56.3853670Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-27T14:47:56.3853894Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-27T14:47:56.3854104Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-27T14:47:56.3854296Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-27T14:47:56.3927523Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-27T14:47:56.3928145Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-27T14:47:56.3928496Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-27T14:47:56.3928773Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-27T14:47:56.3929055Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-27T14:47:56.3929352Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-27T14:47:56.4060216Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-27T14:47:56.4060680Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-27T14:47:56.4061140Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-27T14:47:56.4061469Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-27T14:47:56.4061768Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:56.4062071Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4062363Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:56.4062656Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4062948Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-27T14:47:56.4063243Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-27T14:47:56.4063538Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-27T14:47:56.4063938Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-27T14:47:56.4064243Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-27T14:47:56.4064797Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-27T14:47:56.4065087Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-27T14:47:56.4065354Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-27T14:47:56.4065621Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-27T14:47:56.4065965Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-27T14:47:56.4066251Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T14:47:56.4066591Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T14:47:56.4066894Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:56.4067311Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4067667Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:56.4067957Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4068239Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T14:47:56.4068537Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T14:47:56.4068804Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-27T14:47:56.4069075Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-27T14:47:56.4069343Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-27T14:47:56.4069640Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-27T14:47:56.4069911Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-27T14:47:56.4070198Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-27T14:47:56.4070462Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-27T14:47:56.4070741Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-27T14:47:56.4071065Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-27T14:47:56.4071401Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-27T14:47:56.4071720Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-27T14:47:56.4072035Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-27T14:47:56.4072323Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-27T14:47:56.4072709Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-27T14:47:56.4072986Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-27T14:47:56.4073281Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-27T14:47:56.4073527Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-27T14:47:56.4073792Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-27T14:47:56.4074104Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-27T14:47:56.4074383Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-27T14:47:56.4074651Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-27T14:47:56.4074947Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-27T14:47:56.4075260Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-27T14:47:56.4075532Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-27T14:47:56.4075818Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-27T14:47:56.4076092Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-27T14:47:56.4076370Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-27T14:47:56.4076633Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-27T14:47:56.4076895Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-27T14:47:56.4077179Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-27T14:47:56.4121800Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-27T14:47:56.4122354Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-27T14:47:56.4122692Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-27T14:47:56.4123010Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-27T14:47:56.4123328Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-27T14:47:56.4123597Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-27T14:47:56.4123871Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-27T14:47:56.4124159Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-27T14:47:56.4124458Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-27T14:47:56.4124939Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-27T14:47:56.4125213Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-27T14:47:56.4125519Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-27T14:47:56.4125804Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-27T14:47:56.4126127Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-27T14:47:56.4126432Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-27T14:47:56.4126755Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-27T14:47:56.4127049Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-27T14:47:56.4127487Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-27T14:47:56.4127868Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-27T14:47:56.4128587Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-27T14:47:56.4128963Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-27T14:47:56.4129328Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-27T14:47:56.4129617Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-27T14:47:56.4129984Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-27T14:47:56.4130257Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-27T14:47:56.4130515Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-27T14:47:56.4130785Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-27T14:47:56.4131165Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-27T14:47:56.4131482Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-27T14:47:56.4131785Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-27T14:47:56.4132109Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-27T14:47:56.4132418Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-27T14:47:56.4132742Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-27T14:47:56.4133082Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-27T14:47:56.4133488Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-27T14:47:56.4133790Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-27T14:47:56.4134101Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-27T14:47:56.4134485Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-27T14:47:56.4134807Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T14:47:56.4135123Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T14:47:56.4135445Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:56.4135726Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4136019Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:56.4136298Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4136597Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T14:47:56.4136874Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T14:47:56.4137254Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-27T14:47:56.4137533Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-27T14:47:56.4137845Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-27T14:47:56.4138218Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-27T14:47:56.4138552Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-27T14:47:56.4138870Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-27T14:47:56.4139241Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-27T14:47:56.4139511Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-27T14:47:56.4139804Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-27T14:47:56.4140076Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-27T14:47:56.4140366Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-27T14:47:56.4140640Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-27T14:47:56.4140925Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-27T14:47:56.4141241Z Cause 3: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :dto.
2026-08-27T14:47:56.4141470Z Required by:
2026-08-27T14:47:56.4141641Z     project :app
2026-08-27T14:47:56.4142348Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :dto:
2026-08-27T14:47:56.4147795Z   - devApiElements
2026-08-27T14:47:56.4150448Z   - hmpApiElements
2026-08-27T14:47:56.4150770Z   - pilotoApiElements
2026-08-27T14:47:56.4151192Z   - producaoApiElements
2026-08-27T14:47:56.4151384Z All of them match the consumer attributes:
2026-08-27T14:47:56.4151737Z   - Variant 'devApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-27T14:47:56.4152051Z       - Unmatched attributes:
2026-08-27T14:47:56.4152392Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:56.4152769Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T14:47:56.4153151Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T14:47:56.4153473Z           - Doesn't say anything about its component category (required a library)
2026-08-27T14:47:56.4153787Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T14:47:56.4154142Z   - Variant 'hmpApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-27T14:47:56.4154413Z       - Unmatched attributes:
2026-08-27T14:47:56.4154740Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:56.4155116Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T14:47:56.4155529Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T14:47:56.4155860Z           - Doesn't say anything about its component category (required a library)
2026-08-27T14:47:56.4156167Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T14:47:56.4156627Z   - Variant 'pilotoApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-27T14:47:56.4156899Z       - Unmatched attributes:
2026-08-27T14:47:56.4157373Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:56.4157964Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T14:47:56.4158578Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T14:47:56.4158915Z           - Doesn't say anything about its component category (required a library)
2026-08-27T14:47:56.4159227Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T14:47:56.4159660Z   - Variant 'producaoApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-27T14:47:56.4160041Z       - Unmatched attributes:
2026-08-27T14:47:56.4160413Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:56.4160787Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T14:47:56.4161282Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T14:47:56.4161608Z           - Doesn't say anything about its component category (required a library)
2026-08-27T14:47:56.4161923Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T14:47:56.4162221Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-27T14:47:56.4162569Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-27T14:47:56.4162910Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-27T14:47:56.4163241Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-27T14:47:56.4163568Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-27T14:47:56.4163899Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-27T14:47:56.4164233Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-27T14:47:56.4164585Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-27T14:47:56.4164985Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-27T14:47:56.4165353Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-27T14:47:56.4174317Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-27T14:47:56.4174821Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-27T14:47:56.4202011Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-27T14:47:56.4202733Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-27T14:47:56.4203089Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-27T14:47:56.4203433Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-27T14:47:56.4203824Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-27T14:47:56.4204146Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T14:47:56.4204478Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T14:47:56.4204798Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:56.4205095Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4205392Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:56.4205687Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4205983Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T14:47:56.4206276Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T14:47:56.4206580Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-27T14:47:56.4206906Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-27T14:47:56.4207302Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-27T14:47:56.4207623Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-27T14:47:56.4207937Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-27T14:47:56.4208248Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-27T14:47:56.4208573Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-27T14:47:56.4208911Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-27T14:47:56.4209231Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-27T14:47:56.4209565Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-27T14:47:56.4209886Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-27T14:47:56.4210266Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-27T14:47:56.4210560Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-27T14:47:56.4210878Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-27T14:47:56.4211293Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-27T14:47:56.4211728Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-27T14:47:56.4212086Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-27T14:47:56.4212381Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-27T14:47:56.4212829Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-27T14:47:56.4213117Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-27T14:47:56.4213384Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-27T14:47:56.4213656Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-27T14:47:56.4213956Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-27T14:47:56.4214225Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-27T14:47:56.4214473Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-27T14:47:56.4214740Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-27T14:47:56.4215031Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-27T14:47:56.4215322Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-27T14:47:56.4215598Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-27T14:47:56.4215882Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-27T14:47:56.4216181Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-27T14:47:56.4216472Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:56.4216760Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4217098Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:56.4217403Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4217688Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-27T14:47:56.4217975Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-27T14:47:56.4218258Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-27T14:47:56.4218549Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-27T14:47:56.4218840Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-27T14:47:56.4219120Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-27T14:47:56.4219392Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-27T14:47:56.4219662Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-27T14:47:56.4219925Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-27T14:47:56.4220184Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-27T14:47:56.4220486Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T14:47:56.4220952Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T14:47:56.4221332Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:56.4221623Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4221958Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:56.4222249Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4222537Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T14:47:56.4222827Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T14:47:56.4223105Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-27T14:47:56.4223365Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-27T14:47:56.4223682Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-27T14:47:56.4223972Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-27T14:47:56.4224256Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-27T14:47:56.4224533Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-27T14:47:56.4224802Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-27T14:47:56.4225069Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-27T14:47:56.4225343Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-27T14:47:56.4225652Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-27T14:47:56.4225980Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-27T14:47:56.4226283Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-27T14:47:56.4226583Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-27T14:47:56.4226870Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-27T14:47:56.4227142Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-27T14:47:56.4227553Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-27T14:47:56.4227911Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-27T14:47:56.4228284Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-27T14:47:56.4228583Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-27T14:47:56.4229011Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-27T14:47:56.4229285Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-27T14:47:56.4229583Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-27T14:47:56.4229848Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-27T14:47:56.4230132Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-27T14:47:56.4230457Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-27T14:47:56.4230754Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-27T14:47:56.4231061Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-27T14:47:56.4231337Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-27T14:47:56.4231651Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-27T14:47:56.4231937Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-27T14:47:56.4232200Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-27T14:47:56.4232513Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-27T14:47:56.4232827Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-27T14:47:56.4233142Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-27T14:47:56.4233416Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-27T14:47:56.4233693Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-27T14:47:56.4233948Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-27T14:47:56.4234244Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-27T14:47:56.4234548Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-27T14:47:56.4234860Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-27T14:47:56.4235132Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-27T14:47:56.4235416Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-27T14:47:56.4235697Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-27T14:47:56.4236060Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-27T14:47:56.4236364Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-27T14:47:56.4236685Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-27T14:47:56.4236978Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-27T14:47:56.4237281Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-27T14:47:56.4237553Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-27T14:47:56.4237851Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-27T14:47:56.4238126Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-27T14:47:56.4238415Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-27T14:47:56.4238681Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-27T14:47:56.4238964Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-27T14:47:56.4239276Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-27T14:47:56.4239554Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-27T14:47:56.4239807Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-27T14:47:56.4240096Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-27T14:47:56.4240388Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-27T14:47:56.4240750Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-27T14:47:56.4241096Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-27T14:47:56.4241427Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-27T14:47:56.4241748Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-27T14:47:56.4242057Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-27T14:47:56.4242342Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-27T14:47:56.4242659Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-27T14:47:56.4242951Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-27T14:47:56.4243252Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-27T14:47:56.4243553Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T14:47:56.4243892Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T14:47:56.4244218Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:56.4244628Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4245009Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:56.4245452Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4245771Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T14:47:56.4246073Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T14:47:56.4246467Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-27T14:47:56.4246904Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-27T14:47:56.4247335Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-27T14:47:56.4247776Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-27T14:47:56.4248160Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-27T14:47:56.4248499Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-27T14:47:56.4248799Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-27T14:47:56.4249163Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-27T14:47:56.4256459Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-27T14:47:56.4256851Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-27T14:47:56.4257220Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-27T14:47:56.4257657Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-27T14:47:56.4257917Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-27T14:47:56.4258169Z Cause 4: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :caixaui.
2026-08-27T14:47:56.4258392Z Required by:
2026-08-27T14:47:56.4258570Z     project :app
2026-08-27T14:47:56.4259236Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :caixaui:
2026-08-27T14:47:56.4259634Z   - devApiElements
2026-08-27T14:47:56.4259850Z   - hmpApiElements
2026-08-27T14:47:56.4260068Z   - pilotoApiElements
2026-08-27T14:47:56.4260284Z   - producaoApiElements
2026-08-27T14:47:56.4260479Z All of them match the consumer attributes:
2026-08-27T14:47:56.4260823Z   - Variant 'devApiElements' capability SIECO-Android:caixaui:unspecified declares a component for use during compile-time:
2026-08-27T14:47:56.4261222Z       - Unmatched attributes:
2026-08-27T14:47:56.4261571Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:56.4261940Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T14:47:56.4262319Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T14:47:56.4262643Z           - Doesn't say anything about its component category (required a library)
2026-08-27T14:47:56.4262978Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T14:47:56.4263459Z   - Variant 'hmpApiElements' capability SIECO-Android:caixaui:unspecified declares a component for use during compile-time:
2026-08-27T14:47:56.4263829Z       - Unmatched attributes:
2026-08-27T14:47:56.4264300Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:56.4264727Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T14:47:56.4265155Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T14:47:56.4265482Z           - Doesn't say anything about its component category (required a library)
2026-08-27T14:47:56.4265835Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T14:47:56.4266333Z   - Variant 'pilotoApiElements' capability SIECO-Android:caixaui:unspecified declares a component for use during compile-time:
2026-08-27T14:47:56.4266686Z       - Unmatched attributes:
2026-08-27T14:47:56.4267070Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:56.4267558Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T14:47:56.4267949Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T14:47:56.4268473Z           - Doesn't say anything about its component category (required a library)
2026-08-27T14:47:56.4268862Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T14:47:56.4269338Z   - Variant 'producaoApiElements' capability SIECO-Android:caixaui:unspecified declares a component for use during compile-time:
2026-08-27T14:47:56.4269628Z       - Unmatched attributes:
2026-08-27T14:47:56.4270097Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:56.4270577Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T14:47:56.4271147Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T14:47:56.4271606Z           - Doesn't say anything about its component category (required a library)
2026-08-27T14:47:56.4272265Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T14:47:56.4272636Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-27T14:47:56.4272987Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-27T14:47:56.4273420Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-27T14:47:56.4273869Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-27T14:47:56.4274292Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-27T14:47:56.4274705Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-27T14:47:56.4275109Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-27T14:47:56.4275454Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-27T14:47:56.4275868Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-27T14:47:56.4276213Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-27T14:47:56.4276611Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-27T14:47:56.4277016Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-27T14:47:56.4277459Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-27T14:47:56.4277891Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-27T14:47:56.4278329Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-27T14:47:56.4278648Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-27T14:47:56.4278973Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-27T14:47:56.4279414Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T14:47:56.4279764Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T14:47:56.4280119Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:56.4280471Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4280942Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:56.4281466Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4281888Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T14:47:56.4282273Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T14:47:56.4282663Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-27T14:47:56.4283083Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-27T14:47:56.4283521Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-27T14:47:56.4284946Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-27T14:47:56.4285398Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-27T14:47:56.4285839Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-27T14:47:56.4286220Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-27T14:47:56.4286562Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-27T14:47:56.4286900Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-27T14:47:56.4287293Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-27T14:47:56.4287622Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-27T14:47:56.4287949Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-27T14:47:56.4288254Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-27T14:47:56.4288549Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-27T14:47:56.4288843Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-27T14:47:56.4289116Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-27T14:47:56.4289395Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-27T14:47:56.4289695Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-27T14:47:56.4289997Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-27T14:47:56.4290471Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-27T14:47:56.4290805Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-27T14:47:56.4291279Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-27T14:47:56.4291604Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-27T14:47:56.4291937Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-27T14:47:56.4292239Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-27T14:47:56.4292558Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-27T14:47:56.4292850Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-27T14:47:56.4293135Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-27T14:47:56.4293408Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-27T14:47:56.4293695Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-27T14:47:56.4293990Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-27T14:47:56.4294283Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:56.4294637Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4294950Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:56.4295240Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4295529Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-27T14:47:56.4295817Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-27T14:47:56.4296164Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-27T14:47:56.4296459Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-27T14:47:56.4296751Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-27T14:47:56.4297138Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-27T14:47:56.4297422Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-27T14:47:56.4297697Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-27T14:47:56.4297964Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-27T14:47:56.4298225Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-27T14:47:56.4298517Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T14:47:56.4298847Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T14:47:56.4299180Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:56.4299533Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4299820Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:56.4300168Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4300453Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T14:47:56.4300756Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T14:47:56.4301266Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-27T14:47:56.4302260Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-27T14:47:56.4302632Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-27T14:47:56.4302938Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-27T14:47:56.4303227Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-27T14:47:56.4303514Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-27T14:47:56.4303788Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-27T14:47:56.4304066Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-27T14:47:56.4304338Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-27T14:47:56.4304719Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-27T14:47:56.4305064Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-27T14:47:56.4305370Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-27T14:47:56.4305667Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-27T14:47:56.4305957Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-27T14:47:56.4306237Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-27T14:47:56.4306590Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-27T14:47:56.4306931Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-27T14:47:56.4307230Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-27T14:47:56.4307485Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-27T14:47:56.4307767Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-27T14:47:56.4308131Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-27T14:47:56.4308435Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-27T14:47:56.4308703Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-27T14:47:56.4308984Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-27T14:47:56.4309250Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-27T14:47:56.4309543Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-27T14:47:56.4309797Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-27T14:47:56.4310066Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-27T14:47:56.4310418Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-27T14:47:56.4310864Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-27T14:47:56.4311374Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-27T14:47:56.4311823Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-27T14:47:56.4312283Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-27T14:47:56.4312682Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-27T14:47:56.4312957Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-27T14:47:56.4313239Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-27T14:47:56.4313490Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-27T14:47:56.4313787Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-27T14:47:56.4314082Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-27T14:47:56.4314389Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-27T14:47:56.4314659Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-27T14:47:56.4315046Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-27T14:47:56.4315344Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-27T14:47:56.4315671Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-27T14:47:56.4316050Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-27T14:47:56.4316433Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-27T14:47:56.4316727Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-27T14:47:56.4317087Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-27T14:47:56.4317375Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-27T14:47:56.4317672Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-27T14:47:56.4317948Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-27T14:47:56.4318236Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-27T14:47:56.4318506Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-27T14:47:56.4318779Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-27T14:47:56.4319048Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-27T14:47:56.4319313Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-27T14:47:56.4319574Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-27T14:47:56.4319846Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-27T14:47:56.4320147Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-27T14:47:56.4320557Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-27T14:47:56.4320927Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-27T14:47:56.4321391Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-27T14:47:56.4321723Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-27T14:47:56.4322061Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-27T14:47:56.4322366Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-27T14:47:56.4322662Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-27T14:47:56.4323020Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-27T14:47:56.4323378Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-27T14:47:56.4323805Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T14:47:56.4324220Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T14:47:56.4324584Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:56.4325036Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4325412Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:56.4325697Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4326064Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T14:47:56.4326449Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T14:47:56.4326817Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-27T14:47:56.4327185Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-27T14:47:56.4327626Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-27T14:47:56.4328073Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-27T14:47:56.4328468Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-27T14:47:56.4328933Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-27T14:47:56.4329391Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-27T14:47:56.4329795Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-27T14:47:56.4330190Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-27T14:47:56.4330577Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-27T14:47:56.4330895Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-27T14:47:56.4331354Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-27T14:47:56.4331759Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-27T14:47:56.4332013Z Cause 5: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :payer.
2026-08-27T14:47:56.4332233Z Required by:
2026-08-27T14:47:56.4332416Z     project :app
2026-08-27T14:47:56.4333069Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :payer:
2026-08-27T14:47:56.4333512Z   - devApiElements
2026-08-27T14:47:56.4333725Z   - hmpApiElements
2026-08-27T14:47:56.4333939Z   - pilotoApiElements
2026-08-27T14:47:56.4334158Z   - producaoApiElements
2026-08-27T14:47:56.4334352Z All of them match the consumer attributes:
2026-08-27T14:47:56.4334687Z   - Variant 'devApiElements' capability SIECO-Android:payer:unspecified declares a component for use during compile-time:
2026-08-27T14:47:56.4334972Z       - Unmatched attributes:
2026-08-27T14:47:56.4335349Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:56.4335821Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T14:47:56.4336281Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T14:47:56.4336617Z           - Doesn't say anything about its component category (required a library)
2026-08-27T14:47:56.4336957Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T14:47:56.4337501Z   - Variant 'hmpApiElements' capability SIECO-Android:payer:unspecified declares a component for use during compile-time:
2026-08-27T14:47:56.4337806Z       - Unmatched attributes:
2026-08-27T14:47:56.4338202Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:56.4338634Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T14:47:56.4339026Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T14:47:56.4339350Z           - Doesn't say anything about its component category (required a library)
2026-08-27T14:47:56.4339724Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T14:47:56.4340153Z   - Variant 'pilotoApiElements' capability SIECO-Android:payer:unspecified declares a component for use during compile-time:
2026-08-27T14:47:56.4340430Z       - Unmatched attributes:
2026-08-27T14:47:56.4340764Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:56.4341288Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T14:47:56.4341822Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T14:47:56.4342267Z           - Doesn't say anything about its component category (required a library)
2026-08-27T14:47:56.4342605Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T14:47:56.4343046Z   - Variant 'producaoApiElements' capability SIECO-Android:payer:unspecified declares a component for use during compile-time:
2026-08-27T14:47:56.4343338Z       - Unmatched attributes:
2026-08-27T14:47:56.4343735Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:56.4344226Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T14:47:56.4344604Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T14:47:56.4344929Z           - Doesn't say anything about its component category (required a library)
2026-08-27T14:47:56.4345240Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T14:47:56.4345590Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-27T14:47:56.4345937Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-27T14:47:56.4346283Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-27T14:47:56.4346615Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-27T14:47:56.4346989Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-27T14:47:56.4347437Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-27T14:47:56.4347914Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-27T14:47:56.4348380Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-27T14:47:56.4348879Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-27T14:47:56.4349354Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-27T14:47:56.4349856Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-27T14:47:56.4350254Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-27T14:47:56.4350582Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-27T14:47:56.4350965Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-27T14:47:56.4351492Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-27T14:47:56.4351813Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-27T14:47:56.4352108Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-27T14:47:56.4352423Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T14:47:56.4352754Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T14:47:56.4353294Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:56.4353587Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4353936Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:56.4354227Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4354551Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T14:47:56.4354915Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T14:47:56.4355261Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-27T14:47:56.4355571Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-27T14:47:56.4355895Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-27T14:47:56.4356214Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-27T14:47:56.4356535Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-27T14:47:56.4356837Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-27T14:47:56.4357284Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-27T14:47:56.4357717Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-27T14:47:56.4358043Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-27T14:47:56.4358406Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-27T14:47:56.4358837Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-27T14:47:56.4359266Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-27T14:47:56.4359664Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-27T14:47:56.4360069Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-27T14:47:56.4360474Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-27T14:47:56.4360868Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-27T14:47:56.4361421Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-27T14:47:56.4361871Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-27T14:47:56.4362279Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-27T14:47:56.4362748Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-27T14:47:56.4363131Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-27T14:47:56.4363462Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-27T14:47:56.4363768Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-27T14:47:56.4364041Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-27T14:47:56.4364448Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-27T14:47:56.4364778Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-27T14:47:56.4365078Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-27T14:47:56.4365367Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-27T14:47:56.4365701Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-27T14:47:56.4365997Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-27T14:47:56.4366296Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-27T14:47:56.4366591Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:56.4366883Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4367168Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:56.4367465Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4367916Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-27T14:47:56.4368280Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-27T14:47:56.4368563Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-27T14:47:56.4368844Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-27T14:47:56.4369133Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-27T14:47:56.4369540Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-27T14:47:56.4369819Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-27T14:47:56.4370087Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-27T14:47:56.4370350Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-27T14:47:56.4370615Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-27T14:47:56.4370906Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T14:47:56.4371309Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T14:47:56.4371612Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:56.4371904Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4372253Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:56.4372578Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4372865Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T14:47:56.4373155Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T14:47:56.4373426Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-27T14:47:56.4373684Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-27T14:47:56.4374015Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-27T14:47:56.4374317Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-27T14:47:56.4374596Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-27T14:47:56.4374880Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-27T14:47:56.4375151Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-27T14:47:56.4375464Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-27T14:47:56.4375733Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-27T14:47:56.4376039Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-27T14:47:56.4376364Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-27T14:47:56.4376710Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-27T14:47:56.4377002Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-27T14:47:56.4377289Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-27T14:47:56.4377560Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-27T14:47:56.4377852Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-27T14:47:56.4378098Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-27T14:47:56.4378359Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-27T14:47:56.4378615Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-27T14:47:56.4378890Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-27T14:47:56.4379154Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-27T14:47:56.4379448Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-27T14:47:56.4379714Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-27T14:47:56.4380000Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-27T14:47:56.4380265Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-27T14:47:56.4380559Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-27T14:47:56.4380820Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-27T14:47:56.4381344Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-27T14:47:56.4381747Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-27T14:47:56.4382134Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-27T14:47:56.4382544Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-27T14:47:56.4382869Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-27T14:47:56.4383194Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-27T14:47:56.4383500Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-27T14:47:56.4383874Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-27T14:47:56.4384145Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-27T14:47:56.4384407Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-27T14:47:56.4384689Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-27T14:47:56.4385047Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-27T14:47:56.4385345Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-27T14:47:56.4385625Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-27T14:47:56.4385943Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-27T14:47:56.4386326Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-27T14:47:56.4386687Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-27T14:47:56.4387083Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-27T14:47:56.4387402Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-27T14:47:56.4387709Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-27T14:47:56.4388000Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-27T14:47:56.4388283Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-27T14:47:56.4388569Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-27T14:47:56.4388854Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-27T14:47:56.4389179Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-27T14:47:56.4389456Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-27T14:47:56.4389728Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-27T14:47:56.4389999Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-27T14:47:56.4390269Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-27T14:47:56.4390533Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-27T14:47:56.4390908Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-27T14:47:56.4391328Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-27T14:47:56.4391641Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-27T14:47:56.4391945Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-27T14:47:56.4392265Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-27T14:47:56.4392583Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-27T14:47:56.4392886Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-27T14:47:56.4393243Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-27T14:47:56.4393548Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-27T14:47:56.4393853Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-27T14:47:56.4394146Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-27T14:47:56.4394640Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T14:47:56.4395089Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T14:47:56.4395617Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:56.4396039Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4396474Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:56.4396873Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4397171Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T14:47:56.4397461Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T14:47:56.4397752Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-27T14:47:56.4398038Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-27T14:47:56.4398399Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-27T14:47:56.4398729Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-27T14:47:56.4399102Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-27T14:47:56.4399436Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-27T14:47:56.4399788Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-27T14:47:56.4400073Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-27T14:47:56.4400409Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-27T14:47:56.4400748Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-27T14:47:56.4401271Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-27T14:47:56.4401618Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-27T14:47:56.4401975Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-27T14:47:56.4403295Z Cause 6: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :pix.
2026-08-27T14:47:56.4403537Z Required by:
2026-08-27T14:47:56.4403720Z     project :app
2026-08-27T14:47:56.4404363Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :pix:
2026-08-27T14:47:56.4404754Z   - devApiElements
2026-08-27T14:47:56.4405065Z   - hmpApiElements
2026-08-27T14:47:56.4405279Z   - pilotoApiElements
2026-08-27T14:47:56.4405495Z   - producaoApiElements
2026-08-27T14:47:56.4405696Z All of them match the consumer attributes:
2026-08-27T14:47:56.4406116Z   - Variant 'devApiElements' capability SIECO-Android:pix:unspecified declares a library for use during compile-time, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-27T14:47:56.4406476Z       - Unmatched attributes:
2026-08-27T14:47:56.4406872Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:56.4407297Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T14:47:56.4407735Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T14:47:56.4408095Z           - Provides attribute 'org.gradle.jvm.environment' with value 'android' but the consumer didn't ask for it
2026-08-27T14:47:56.4408532Z   - Variant 'hmpApiElements' capability SIECO-Android:pix:unspecified declares a library for use during compile-time, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-27T14:47:56.4408841Z       - Unmatched attributes:
2026-08-27T14:47:56.4425342Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:56.4425939Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T14:47:56.4426331Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T14:47:56.4426704Z           - Provides attribute 'org.gradle.jvm.environment' with value 'android' but the consumer didn't ask for it
2026-08-27T14:47:56.4427170Z   - Variant 'pilotoApiElements' capability SIECO-Android:pix:unspecified declares a library for use during compile-time, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-27T14:47:56.4427662Z       - Unmatched attributes:
2026-08-27T14:47:56.4428098Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:56.4428536Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T14:47:56.4428918Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T14:47:56.4429277Z           - Provides attribute 'org.gradle.jvm.environment' with value 'android' but the consumer didn't ask for it
2026-08-27T14:47:56.4429727Z   - Variant 'producaoApiElements' capability SIECO-Android:pix:unspecified declares a library for use during compile-time, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-27T14:47:56.4430037Z       - Unmatched attributes:
2026-08-27T14:47:56.4430375Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:56.4430752Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T14:47:56.4431241Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T14:47:56.4431638Z           - Provides attribute 'org.gradle.jvm.environment' with value 'android' but the consumer didn't ask for it
2026-08-27T14:47:56.4432027Z The following variants were also considered but didn't match the requested attributes:
2026-08-27T14:47:56.4432635Z   - Variant 'devSourcesElements' capability SIECO-Android:pix:unspecified declares a component for use during runtime, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-27T14:47:56.4433016Z       - Incompatible because this component declares documentation and the consumer needed a library
2026-08-27T14:47:56.4433547Z   - Variant 'hmpSourcesElements' capability SIECO-Android:pix:unspecified declares a component for use during runtime, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-27T14:47:56.4433989Z       - Incompatible because this component declares documentation and the consumer needed a library
2026-08-27T14:47:56.4434440Z   - Variant 'pilotoSourcesElements' capability SIECO-Android:pix:unspecified declares a component for use during runtime, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-27T14:47:56.4434823Z       - Incompatible because this component declares documentation and the consumer needed a library
2026-08-27T14:47:56.4435267Z   - Variant 'producaoSourcesElements' capability SIECO-Android:pix:unspecified declares a component for use during runtime, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-27T14:47:56.4435652Z       - Incompatible because this component declares documentation and the consumer needed a library
2026-08-27T14:47:56.4435952Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-27T14:47:56.4436302Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-27T14:47:56.4436645Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-27T14:47:56.4436976Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-27T14:47:56.4437310Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-27T14:47:56.4437641Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-27T14:47:56.4437974Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-27T14:47:56.4438323Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-27T14:47:56.4438671Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-27T14:47:56.4439016Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-27T14:47:56.4439353Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-27T14:47:56.4439683Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-27T14:47:56.4440008Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-27T14:47:56.4440333Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-27T14:47:56.4440672Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-27T14:47:56.4440983Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-27T14:47:56.4441417Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-27T14:47:56.4441806Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T14:47:56.4442137Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T14:47:56.4442482Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:56.4442774Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4443067Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:56.4443361Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4443640Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T14:47:56.4443957Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T14:47:56.4444259Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-27T14:47:56.4444662Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-27T14:47:56.4445119Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-27T14:47:56.4445465Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-27T14:47:56.4445767Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-27T14:47:56.4446087Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-27T14:47:56.4446402Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-27T14:47:56.4446724Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-27T14:47:56.4447053Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-27T14:47:56.4447377Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-27T14:47:56.4447705Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-27T14:47:56.4448049Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-27T14:47:56.4448359Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-27T14:47:56.4448644Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-27T14:47:56.4448956Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-27T14:47:56.4449216Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-27T14:47:56.4449493Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-27T14:47:56.4449794Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-27T14:47:56.4450166Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-27T14:47:56.4450454Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-27T14:47:56.4450783Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-27T14:47:56.4451127Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-27T14:47:56.4451465Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-27T14:47:56.4451751Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-27T14:47:56.4451988Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-27T14:47:56.4452270Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-27T14:47:56.4452552Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-27T14:47:56.4452853Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-27T14:47:56.4453129Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-27T14:47:56.4453601Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-27T14:47:56.4454013Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-27T14:47:56.4454449Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:56.4454859Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4455285Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:56.4455577Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4455936Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-27T14:47:56.4456214Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-27T14:47:56.4456511Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-27T14:47:56.4456795Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-27T14:47:56.4457194Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-27T14:47:56.4457471Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-27T14:47:56.4457755Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-27T14:47:56.4458011Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-27T14:47:56.4458283Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-27T14:47:56.4458535Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-27T14:47:56.4458839Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T14:47:56.4459159Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T14:47:56.4459484Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:56.4459855Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4460281Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:56.4460564Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4460875Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T14:47:56.4461222Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T14:47:56.4461567Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-27T14:47:56.4461844Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-27T14:47:56.4462109Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-27T14:47:56.4462410Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-27T14:47:56.4462688Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-27T14:47:56.4462979Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-27T14:47:56.4463241Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-27T14:47:56.4463522Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-27T14:47:56.4463789Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-27T14:47:56.4464110Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-27T14:47:56.4464424Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-27T14:47:56.4464737Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-27T14:47:56.4465023Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-27T14:47:56.4465339Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-27T14:47:56.4465610Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-27T14:47:56.4465902Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-27T14:47:56.4466149Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-27T14:47:56.4466401Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-27T14:47:56.4466677Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-27T14:47:56.4466932Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-27T14:47:56.4467220Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-27T14:47:56.4467495Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-27T14:47:56.4467780Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-27T14:47:56.4468077Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-27T14:47:56.4468366Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-27T14:47:56.4468665Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-27T14:47:56.4468940Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-27T14:47:56.4469197Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-27T14:47:56.4469511Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-27T14:47:56.4469783Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-27T14:47:56.4470067Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-27T14:47:56.4470355Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-27T14:47:56.4470732Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-27T14:47:56.4471090Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-27T14:47:56.4471373Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-27T14:47:56.4471707Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-27T14:47:56.4472069Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-27T14:47:56.4472357Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-27T14:47:56.4472652Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-27T14:47:56.4472965Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-27T14:47:56.4473250Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-27T14:47:56.4473530Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-27T14:47:56.4473808Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-27T14:47:56.4474127Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-27T14:47:56.4474433Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-27T14:47:56.4474752Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-27T14:47:56.4475044Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-27T14:47:56.4475348Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-27T14:47:56.4475649Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-27T14:47:56.4475944Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-27T14:47:56.4476222Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-27T14:47:56.4476511Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-27T14:47:56.4476781Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-27T14:47:56.4477130Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-27T14:47:56.4477438Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-27T14:47:56.4477713Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-27T14:47:56.4477984Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-27T14:47:56.4478250Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-27T14:47:56.4478562Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-27T14:47:56.4478929Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-27T14:47:56.4479247Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-27T14:47:56.4479552Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-27T14:47:56.4479950Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-27T14:47:56.4480241Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-27T14:47:56.4480546Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-27T14:47:56.4480915Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-27T14:47:56.4481287Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-27T14:47:56.4481577Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-27T14:47:56.4481898Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T14:47:56.4482219Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T14:47:56.4482550Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:56.4482831Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4483122Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:56.4483418Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:56.4483705Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T14:47:56.4484055Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T14:47:56.4484463Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-27T14:47:56.4484856Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-27T14:47:56.4485268Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-27T14:47:56.4485708Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-27T14:47:56.4486134Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-27T14:47:56.4486581Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-27T14:47:56.4487023Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-27T14:47:56.4487413Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-27T14:47:56.4487813Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-27T14:47:56.4488203Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-27T14:47:56.4488610Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-27T14:47:56.4489185Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-27T14:47:56.4489584Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-27T14:47:56.6281540Z 
2026-08-27T14:47:56.6282309Z > Task :caixaui:spec
2026-08-27T14:47:56.6282683Z WARNING: We recommend using a newer Android Gradle plugin to use compileSdk = 35
2026-08-27T14:47:56.6282909Z 
2026-08-27T14:47:56.6283177Z This Android Gradle plugin (8.1.1) was tested up to compileSdk = 34.
2026-08-27T14:47:56.6283560Z 
2026-08-27T14:47:56.6283748Z You are strongly encouraged to update your project to use a newer
2026-08-27T14:47:56.6283983Z Android Gradle plugin that has been tested with compileSdk = 35.
2026-08-27T14:47:56.6284124Z 
2026-08-27T14:47:56.6284325Z If you are already using the latest version of the Android Gradle plugin,
2026-08-27T14:47:56.6284555Z you may need to wait until a newer version with support for compileSdk = 35 is available.
2026-08-27T14:47:56.6284708Z 
2026-08-27T14:47:56.6284881Z To suppress this warning, add/update
2026-08-27T14:47:56.6285097Z     android.suppressUnsupportedCompileSdk=36,35
2026-08-27T14:47:56.6285455Z to this project's gradle.properties.
2026-08-27T14:47:56.8293912Z 
2026-08-27T14:47:56.8294707Z > Task :core:spec
2026-08-27T14:47:56.8294922Z > Task :dto:spec
2026-08-27T14:47:57.0392260Z > Task :payer:spec
2026-08-27T14:47:57.2376336Z 
2026-08-27T14:47:57.2377074Z > Task :pix:spec
2026-08-27T14:47:57.2377528Z Can't resolve artifacts for implementationDependenciesMetadata configuration. Artifacts are ignored.
2026-08-27T14:47:57.2378031Z org.gradle.internal.exceptions.DefaultMultiCauseException: Could not resolve all files for configuration ':pix:implementationDependenciesMetadata'.
2026-08-27T14:47:57.2378410Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.mapFailure(DefaultConfiguration.java:1716)
2026-08-27T14:47:57.2378837Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$3400(DefaultConfiguration.java:177)
2026-08-27T14:47:57.2379181Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$DefaultResolutionHost.mapFailure(DefaultConfiguration.java:2443)
2026-08-27T14:47:57.2379500Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionHost.rethrowFailure(ResolutionHost.java:30)
2026-08-27T14:47:57.2379805Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:74)
2026-08-27T14:47:57.2380122Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-27T14:47:57.2380407Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-27T14:47:57.2380699Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-27T14:47:57.2380974Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-27T14:47:57.2381466Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-27T14:47:57.2381814Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-27T14:47:57.2382117Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-27T14:47:57.2382406Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-27T14:47:57.2382679Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-27T14:47:57.2383000Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-27T14:47:57.2383443Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-27T14:47:57.2384045Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-27T14:47:57.2384434Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-27T14:47:57.2384705Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-27T14:47:57.2385001Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-27T14:47:57.2385288Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-27T14:47:57.2385648Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-27T14:47:57.2385934Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-27T14:47:57.2386236Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-27T14:47:57.2386531Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:57.2386824Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:57.2387175Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:57.2387466Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:57.2387872Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-27T14:47:57.2388159Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-27T14:47:57.2388445Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-27T14:47:57.2388790Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-27T14:47:57.2389083Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-27T14:47:57.2389364Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-27T14:47:57.2389638Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-27T14:47:57.2392958Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-27T14:47:57.2397631Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-27T14:47:57.2398033Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-27T14:47:57.2398465Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T14:47:57.2414865Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T14:47:57.2415323Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:57.2415684Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:57.2416034Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:57.2416400Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:57.2416788Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T14:47:57.2417085Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T14:47:57.2417362Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-27T14:47:57.2417634Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-27T14:47:57.2418179Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-27T14:47:57.2418477Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-27T14:47:57.2418854Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-27T14:47:57.2419281Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-27T14:47:57.2419737Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-27T14:47:57.2420129Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-27T14:47:57.2420508Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-27T14:47:57.2420928Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-27T14:47:57.2421445Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-27T14:47:57.2421846Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-27T14:47:57.2422669Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-27T14:47:57.2423103Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-27T14:47:57.2423352Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-27T14:47:57.2423569Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-27T14:47:57.2423754Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-27T14:47:57.2423930Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-27T14:47:57.2424117Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-27T14:47:57.2424309Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-27T14:47:57.2424553Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-27T14:47:57.2424843Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-27T14:47:57.2425049Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-27T14:47:57.2425244Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-27T14:47:57.2425444Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-27T14:47:57.2425651Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-27T14:47:57.2425880Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-27T14:47:57.2426153Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-27T14:47:57.2426353Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-27T14:47:57.2426551Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-27T14:47:57.2426748Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-27T14:47:57.2427400Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-27T14:47:57.2427785Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-27T14:47:57.2428124Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-27T14:47:57.2428574Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-27T14:47:57.2428775Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-27T14:47:57.2428953Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-27T14:47:57.2429162Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-27T14:47:57.2429587Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-27T14:47:57.2429879Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-27T14:47:57.2430092Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-27T14:47:57.2430290Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-27T14:47:57.2430513Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-27T14:47:57.2430744Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-27T14:47:57.2430981Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-27T14:47:57.2431353Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-27T14:47:57.2431587Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-27T14:47:57.2431810Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-27T14:47:57.2432023Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-27T14:47:57.2432239Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-27T14:47:57.2432463Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-27T14:47:57.2432673Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-27T14:47:57.2432883Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-27T14:47:57.2433093Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-27T14:47:57.2433289Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-27T14:47:57.2433485Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-27T14:47:57.2433676Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-27T14:47:57.2433882Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-27T14:47:57.2434116Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-27T14:47:57.2434353Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-27T14:47:57.2434697Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-27T14:47:57.2434992Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-27T14:47:57.2435240Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-27T14:47:57.2435475Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-27T14:47:57.2435816Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-27T14:47:57.2436092Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-27T14:47:57.2436325Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-27T14:47:57.2436559Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-27T14:47:57.2436975Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T14:47:57.2437397Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T14:47:57.2437716Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:57.2437947Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:57.2438164Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:57.2438381Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:57.2438676Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T14:47:57.2439004Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T14:47:57.2439271Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-27T14:47:57.2439501Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-27T14:47:57.2439737Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-27T14:47:57.2439987Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-27T14:47:57.2440235Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-27T14:47:57.2440495Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-27T14:47:57.2440732Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-27T14:47:57.2440940Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-27T14:47:57.2441253Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-27T14:47:57.2441464Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-27T14:47:57.2441670Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-27T14:47:57.2441881Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-27T14:47:57.2442061Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-27T14:47:57.2442235Z Cause 1: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :core.
2026-08-27T14:47:57.2442381Z Required by:
2026-08-27T14:47:57.2442483Z     project :pix
2026-08-27T14:47:57.2443176Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :core:
2026-08-27T14:47:57.2443626Z   - devApiElements
2026-08-27T14:47:57.2443767Z   - hmpApiElements
2026-08-27T14:47:57.2443905Z   - pilotoApiElements
2026-08-27T14:47:57.2444050Z   - producaoApiElements
2026-08-27T14:47:57.2444169Z All of them match the consumer attributes:
2026-08-27T14:47:57.2444428Z   - Variant 'devApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-27T14:47:57.2444699Z       - Unmatched attributes:
2026-08-27T14:47:57.2444956Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:57.2445323Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T14:47:57.2445622Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T14:47:57.2445866Z           - Doesn't say anything about its component category (required a library)
2026-08-27T14:47:57.2446094Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T14:47:57.2446370Z   - Variant 'hmpApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-27T14:47:57.2446561Z       - Unmatched attributes:
2026-08-27T14:47:57.2446813Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:57.2447109Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T14:47:57.2447403Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T14:47:57.2447647Z           - Doesn't say anything about its component category (required a library)
2026-08-27T14:47:57.2447880Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T14:47:57.2448153Z   - Variant 'pilotoApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-27T14:47:57.2448345Z       - Unmatched attributes:
2026-08-27T14:47:57.2448592Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:57.2448879Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T14:47:57.2449179Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T14:47:57.2449423Z           - Doesn't say anything about its component category (required a library)
2026-08-27T14:47:57.2449648Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T14:47:57.2449926Z   - Variant 'producaoApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-27T14:47:57.2450118Z       - Unmatched attributes:
2026-08-27T14:47:57.2450361Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:57.2450753Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T14:47:57.2451131Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T14:47:57.2451392Z           - Doesn't say anything about its component category (required a library)
2026-08-27T14:47:57.2451612Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T14:47:57.2451900Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-27T14:47:57.2452173Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-27T14:47:57.2452430Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-27T14:47:57.2452893Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-27T14:47:57.2453167Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-27T14:47:57.2453427Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-27T14:47:57.2453781Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-27T14:47:57.2454061Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-27T14:47:57.2454334Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-27T14:47:57.2454673Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-27T14:47:57.2455006Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-27T14:47:57.2455259Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-27T14:47:57.2455508Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-27T14:47:57.2455752Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-27T14:47:57.2456007Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-27T14:47:57.2456243Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-27T14:47:57.2456455Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-27T14:47:57.2456686Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T14:47:57.2456931Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T14:47:57.2457164Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:57.2457375Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:57.2457584Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:57.2457797Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:57.2458002Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T14:47:57.2458209Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T14:47:57.2458428Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-27T14:47:57.2458748Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-27T14:47:57.2459006Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-27T14:47:57.2459258Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-27T14:47:57.2459577Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-27T14:47:57.2459809Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-27T14:47:57.2460050Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-27T14:47:57.2460305Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-27T14:47:57.2460558Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-27T14:47:57.2460805Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-27T14:47:57.2461143Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-27T14:47:57.2461403Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-27T14:47:57.2461631Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-27T14:47:57.2461848Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-27T14:47:57.2462063Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-27T14:47:57.2462260Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-27T14:47:57.2462457Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-27T14:47:57.2462679Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-27T14:47:57.2462899Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-27T14:47:57.2463106Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-27T14:47:57.2463293Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-27T14:47:57.2463490Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-27T14:47:57.2463710Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-27T14:47:57.2463902Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-27T14:47:57.2464062Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-27T14:47:57.2464256Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-27T14:47:57.2464478Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-27T14:47:57.2464695Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-27T14:47:57.2464898Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-27T14:47:57.2465189Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-27T14:47:57.2465405Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-27T14:47:57.2465617Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:57.2465825Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:57.2466089Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:57.2466301Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:57.2466513Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-27T14:47:57.2466717Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-27T14:47:57.2466927Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-27T14:47:57.2467127Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-27T14:47:57.2467336Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-27T14:47:57.2467542Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-27T14:47:57.2467733Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-27T14:47:57.2467920Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-27T14:47:57.2468105Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-27T14:47:57.2468285Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-27T14:47:57.2468498Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T14:47:57.2468745Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T14:47:57.2468973Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:57.2469184Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:57.2469399Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:57.2469608Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:57.2469817Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T14:47:57.2470025Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T14:47:57.2470227Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-27T14:47:57.2470403Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-27T14:47:57.2470607Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-27T14:47:57.2470821Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-27T14:47:57.2471085Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-27T14:47:57.2471299Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-27T14:47:57.2471485Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-27T14:47:57.2471747Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-27T14:47:57.2471947Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-27T14:47:57.2472261Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-27T14:47:57.2472500Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-27T14:47:57.2472800Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-27T14:47:57.2473015Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-27T14:47:57.2473224Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-27T14:47:57.2473427Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-27T14:47:57.2473628Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-27T14:47:57.2473803Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-27T14:47:57.2473971Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-27T14:47:57.2474156Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-27T14:47:57.2474347Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-27T14:47:57.2474545Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-27T14:47:57.2474748Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-27T14:47:57.2474945Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-27T14:47:57.2475131Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-27T14:47:57.2475327Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-27T14:47:57.2475537Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-27T14:47:57.2475790Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-27T14:47:57.2475973Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-27T14:47:57.2476171Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-27T14:47:57.2476369Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-27T14:47:57.2476565Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-27T14:47:57.2476789Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-27T14:47:57.2477116Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-27T14:47:57.2477485Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-27T14:47:57.2477745Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-27T14:47:57.2477941Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-27T14:47:57.2478120Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-27T14:47:57.2478322Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-27T14:47:57.2478546Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-27T14:47:57.2478856Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-27T14:47:57.2479050Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-27T14:47:57.2479242Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-27T14:47:57.2479456Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-27T14:47:57.2479743Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-27T14:47:57.2479976Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-27T14:47:57.2480207Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-27T14:47:57.2480537Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-27T14:47:57.2480805Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-27T14:47:57.2481690Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-27T14:47:57.2482061Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-27T14:47:57.2482291Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-27T14:47:57.2482500Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-27T14:47:57.2482701Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-27T14:47:57.2482896Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-27T14:47:57.2483093Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-27T14:47:57.2483281Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-27T14:47:57.2483463Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-27T14:47:57.2483656Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-27T14:47:57.2483926Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-27T14:47:57.2484290Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-27T14:47:57.2484564Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-27T14:47:57.2484802Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-27T14:47:57.2485041Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-27T14:47:57.2485263Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-27T14:47:57.2485483Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-27T14:47:57.2485706Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-27T14:47:57.2485925Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-27T14:47:57.2486139Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-27T14:47:57.2486370Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T14:47:57.2486720Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T14:47:57.2487018Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:57.2487240Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:57.2487541Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:57.2487755Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:57.2487963Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T14:47:57.2488169Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T14:47:57.2488384Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-27T14:47:57.2488588Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-27T14:47:57.2488807Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-27T14:47:57.2489040Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-27T14:47:57.2489285Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-27T14:47:57.2489536Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-27T14:47:57.2489765Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-27T14:47:57.2489975Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-27T14:47:57.2490185Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-27T14:47:57.2490389Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-27T14:47:57.2490590Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-27T14:47:57.2490794Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-27T14:47:57.2490969Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-27T14:47:57.2491227Z Cause 2: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :dto.
2026-08-27T14:47:57.2491370Z Required by:
2026-08-27T14:47:57.2491472Z     project :pix
2026-08-27T14:47:57.2492015Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :dto:
2026-08-27T14:47:57.2492329Z   - devApiElements
2026-08-27T14:47:57.2492462Z   - hmpApiElements
2026-08-27T14:47:57.2492587Z   - pilotoApiElements
2026-08-27T14:47:57.2492723Z   - producaoApiElements
2026-08-27T14:47:57.2492842Z All of them match the consumer attributes:
2026-08-27T14:47:57.2493098Z   - Variant 'devApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-27T14:47:57.2493291Z       - Unmatched attributes:
2026-08-27T14:47:57.2493553Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:57.2493921Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T14:47:57.2494215Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T14:47:57.2494456Z           - Doesn't say anything about its component category (required a library)
2026-08-27T14:47:57.2494684Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T14:47:57.2495120Z   - Variant 'hmpApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-27T14:47:57.2495371Z       - Unmatched attributes:
2026-08-27T14:47:57.2495620Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:57.2495909Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T14:47:57.2496203Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T14:47:57.2496441Z           - Doesn't say anything about its component category (required a library)
2026-08-27T14:47:57.2496661Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T14:47:57.2496987Z   - Variant 'pilotoApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-27T14:47:57.2497190Z       - Unmatched attributes:
2026-08-27T14:47:57.2497438Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:57.2497726Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T14:47:57.2498018Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T14:47:57.2498262Z           - Doesn't say anything about its component category (required a library)
2026-08-27T14:47:57.2498487Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T14:47:57.2498760Z   - Variant 'producaoApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-27T14:47:57.2498953Z       - Unmatched attributes:
2026-08-27T14:47:57.2499198Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T14:47:57.2499487Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T14:47:57.2499784Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T14:47:57.2500025Z           - Doesn't say anything about its component category (required a library)
2026-08-27T14:47:57.2500248Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T14:47:57.2500488Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-27T14:47:57.2500861Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-27T14:47:57.2501329Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-27T14:47:57.2501720Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-27T14:47:57.2502072Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-27T14:47:57.2502325Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-27T14:47:57.2502570Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-27T14:47:57.2502840Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-27T14:47:57.2503170Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-27T14:47:57.2503428Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-27T14:47:57.2503685Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-27T14:47:57.2503939Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-27T14:47:57.2504189Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-27T14:47:57.2504440Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-27T14:47:57.2504693Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-27T14:47:57.2504927Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-27T14:47:57.2505138Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-27T14:47:57.2505483Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T14:47:57.2505850Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T14:47:57.2506191Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:57.2506588Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:57.2506899Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:57.2507221Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:57.2507527Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T14:47:57.2507858Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T14:47:57.2508192Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-27T14:47:57.2508543Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-27T14:47:57.2508923Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-27T14:47:57.2509300Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-27T14:47:57.2509666Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-27T14:47:57.2510126Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-27T14:47:57.2510597Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-27T14:47:57.2511106Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-27T14:47:57.2511367Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-27T14:47:57.2511691Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-27T14:47:57.2511945Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-27T14:47:57.2512196Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-27T14:47:57.2512422Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-27T14:47:57.2512641Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-27T14:47:57.2512853Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-27T14:47:57.2513049Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-27T14:47:57.2513251Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-27T14:47:57.2513471Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-27T14:47:57.2513700Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-27T14:47:57.2513908Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-27T14:47:57.2514098Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-27T14:47:57.2514293Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-27T14:47:57.2514514Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-27T14:47:57.2514713Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-27T14:47:57.2514879Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-27T14:47:57.2515074Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-27T14:47:57.2515285Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-27T14:47:57.2515494Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-27T14:47:57.2515685Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-27T14:47:57.2515889Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-27T14:47:57.2516103Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-27T14:47:57.2516315Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:57.2516523Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:57.2516725Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:57.2517090Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:57.2517330Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-27T14:47:57.2517539Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-27T14:47:57.2517748Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-27T14:47:57.2518012Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-27T14:47:57.2518225Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-27T14:47:57.2518434Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-27T14:47:57.2518625Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-27T14:47:57.2518815Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-27T14:47:57.2518999Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-27T14:47:57.2519179Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-27T14:47:57.2519382Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T14:47:57.2519627Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T14:47:57.2519858Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:57.2520072Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:57.2520282Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:57.2520495Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:57.2520715Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T14:47:57.2521088Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T14:47:57.2521408Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-27T14:47:57.2521609Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-27T14:47:57.2521810Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-27T14:47:57.2522019Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-27T14:47:57.2522300Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-27T14:47:57.2522503Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-27T14:47:57.2522699Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-27T14:47:57.2522887Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-27T14:47:57.2523082Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-27T14:47:57.2523313Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-27T14:47:57.2523547Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-27T14:47:57.2523772Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-27T14:47:57.2524066Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-27T14:47:57.2524274Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-27T14:47:57.2524476Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-27T14:47:57.2524674Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-27T14:47:57.2524935Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-27T14:47:57.2525109Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-27T14:47:57.2525297Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-27T14:47:57.2525484Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-27T14:47:57.2525682Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-27T14:47:57.2525891Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-27T14:47:57.2526091Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-27T14:47:57.2526283Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-27T14:47:57.2526483Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-27T14:47:57.2526691Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-27T14:47:57.2526880Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-27T14:47:57.2527089Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-27T14:47:57.2527388Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-27T14:47:57.2527677Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-27T14:47:57.2527952Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-27T14:47:57.2528265Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-27T14:47:57.2528509Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-27T14:47:57.2528731Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-27T14:47:57.2528934Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-27T14:47:57.2529124Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-27T14:47:57.2529304Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-27T14:47:57.2529508Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-27T14:47:57.2529730Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-27T14:47:57.2529950Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-27T14:47:57.2530149Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-27T14:47:57.2530365Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-27T14:47:57.2530629Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-27T14:47:57.2530862Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-27T14:47:57.2531231Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-27T14:47:57.2531462Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-27T14:47:57.2531685Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-27T14:47:57.2531898Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-27T14:47:57.2532159Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-27T14:47:57.2532361Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-27T14:47:57.2532569Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-27T14:47:57.2532775Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-27T14:47:57.2532974Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-27T14:47:57.2533170Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-27T14:47:57.2533362Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-27T14:47:57.2533549Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-27T14:47:57.2533734Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-27T14:47:57.2533932Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-27T14:47:57.2534159Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-27T14:47:57.2534392Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-27T14:47:57.2534619Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-27T14:47:57.2534854Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-27T14:47:57.2535088Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-27T14:47:57.2535305Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-27T14:47:57.2535523Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-27T14:47:57.2535747Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-27T14:47:57.2535975Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-27T14:47:57.2536194Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-27T14:47:57.2536427Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T14:47:57.2536676Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T14:47:57.2536903Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T14:47:57.2537112Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:57.2537318Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T14:47:57.2537586Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T14:47:57.2537796Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T14:47:57.2538002Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T14:47:57.2538214Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-27T14:47:57.2538471Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-27T14:47:57.2538691Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-27T14:47:57.2538933Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-27T14:47:57.2539177Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-27T14:47:57.2539425Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-27T14:47:57.2539648Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-27T14:47:57.2539850Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-27T14:47:57.2540050Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-27T14:47:57.2540252Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-27T14:47:57.2540606Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-27T14:47:57.2540864Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-27T14:47:57.2541163Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-27T14:47:57.4276733Z 
2026-08-27T14:47:57.4346647Z > Task :ticket:spec
2026-08-27T14:47:57.4346898Z 
2026-08-27T14:47:57.4347140Z Deprecated Gradle features were used in this build, making it incompatible with Gradle 9.0.
2026-08-27T14:47:57.4347522Z 
2026-08-27T14:47:57.4348202Z You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.
2026-08-27T14:47:57.4348327Z 
2026-08-27T14:47:57.4348492Z See https://docs.gradle.org/8.1/userguide/command_line_interface.html#sec:command_line_warnings
2026-08-27T14:47:57.4348590Z 
2026-08-27T14:47:57.4348682Z BUILD SUCCESSFUL in 13s
2026-08-27T14:47:57.4348806Z 8 actionable tasks: 8 executed
2026-08-27T14:47:58.0059701Z Packaging project...
2026-08-27T14:48:07.6542960Z Compressing job files...
2026-08-27T14:48:12.9934773Z Uploading job...
2026-08-27T14:48:16.3620683Z ErrorResponse: Failed to access application version: sieco-android-1.0.0. Access denied. Unauthorized.
2026-08-27T14:48:16.3621183Z Uploading of job to Controller failed with error
2026-08-27T14:48:16.3622503Z ErrorResponse: Failed to access application version: sieco-android-1.0.0. Access denied. Unauthorized.
2026-08-27T14:48:16.3623682Z Shutting down with errors. Please see log for details.
2026-08-27T14:48:16.4594112Z ##[debug]Exit code 1 received from tool '/bin/bash'
2026-08-27T14:48:16.4602798Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-08-27T14:48:16.4618584Z ##[error]Bash exited with code '1'.
2026-08-27T14:48:16.4620167Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '1'.
2026-08-27T14:48:16.4620598Z ##[debug]task result: Failed
2026-08-27T14:48:16.4621892Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-08-27T14:48:16.4636929Z ##[section]Finishing: Iniciando Análise no Fortify



2026-08-27T15:43:06.4137518Z ##[debug]Evaluating condition for step: 'Iniciando Análise no Fortify'
2026-08-27T15:43:06.4138204Z ##[debug]Evaluating: and(succeeded(), ne(variables['fortify_disable'], 'gecmi'), ne(variables['p_language'], 'dotnet'))
2026-08-27T15:43:06.4138400Z ##[debug]Evaluating and:
2026-08-27T15:43:06.4138542Z ##[debug]..Evaluating succeeded:
2026-08-27T15:43:06.4138920Z ##[debug]..=> True
2026-08-27T15:43:06.4139136Z ##[debug]..Evaluating ne:
2026-08-27T15:43:06.4139330Z ##[debug]....Evaluating indexer:
2026-08-27T15:43:06.4139475Z ##[debug]......Evaluating variables:
2026-08-27T15:43:06.4140386Z ##[debug]......=> Object
2026-08-27T15:43:06.4140528Z ##[debug]......Evaluating String:
2026-08-27T15:43:06.4140704Z ##[debug]......=> 'fortify_disable'
2026-08-27T15:43:06.4140900Z ##[debug]....=> ''
2026-08-27T15:43:06.4141027Z ##[debug]....Evaluating String:
2026-08-27T15:43:06.4141162Z ##[debug]....=> 'gecmi'
2026-08-27T15:43:06.4141270Z ##[debug]..=> True
2026-08-27T15:43:06.4141406Z ##[debug]..Evaluating ne:
2026-08-27T15:43:06.4141562Z ##[debug]....Evaluating indexer:
2026-08-27T15:43:06.4141697Z ##[debug]......Evaluating variables:
2026-08-27T15:43:06.4141821Z ##[debug]......=> Object
2026-08-27T15:43:06.4141954Z ##[debug]......Evaluating String:
2026-08-27T15:43:06.4142109Z ##[debug]......=> 'p_language'
2026-08-27T15:43:06.4142318Z ##[debug]....=> 'android'
2026-08-27T15:43:06.4142461Z ##[debug]....Evaluating String:
2026-08-27T15:43:06.4142588Z ##[debug]....=> 'dotnet'
2026-08-27T15:43:06.4142698Z ##[debug]..=> True
2026-08-27T15:43:06.4142797Z ##[debug]=> True
2026-08-27T15:43:06.4143112Z ##[debug]Expanded: and(True, ne('', 'gecmi'), ne('android', 'dotnet'))
2026-08-27T15:43:06.4143316Z ##[debug]Result: True
2026-08-27T15:43:06.4143536Z ##[section]Starting: Iniciando Análise no Fortify
2026-08-27T15:43:06.4147160Z ==============================================================================
2026-08-27T15:43:06.4147255Z Task         : Bash
2026-08-27T15:43:06.4147376Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-27T15:43:06.4147446Z Version      : 3.227.0
2026-08-27T15:43:06.4147502Z Author       : Microsoft Corporation
2026-08-27T15:43:06.4147555Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-27T15:43:06.4147627Z ==============================================================================
2026-08-27T15:43:06.4651731Z ##[debug]Using node path: /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/externals/node16/bin/node
2026-08-27T15:43:06.4757169Z Warning: Ignoring extra certs from `/etc/pki/ca-trust/source/anchors/AC-V4.cer`, load failed: error:02001002:system library:fopen:No such file or directory
2026-08-27T15:43:06.5469956Z ##[debug]agent.TempDirectory=/opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp
2026-08-27T15:43:06.5477735Z ##[debug]loading inputs and endpoints
2026-08-27T15:43:06.5481487Z ##[debug]loading INPUT_TARGETTYPE
2026-08-27T15:43:06.5501444Z ##[debug]loading INPUT_FILEPATH
2026-08-27T15:43:06.5502308Z ##[debug]loading INPUT_SCRIPT
2026-08-27T15:43:06.5504542Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-08-27T15:43:06.5504906Z ##[debug]loading INPUT_FAILONSTDERR
2026-08-27T15:43:06.5507173Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-08-27T15:43:06.5507549Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-08-27T15:43:06.5509990Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-08-27T15:43:06.5510446Z ##[debug]loading SECRET_KEYSTOREPASS
2026-08-27T15:43:06.5513008Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-08-27T15:43:06.5513369Z ##[debug]loading SECRET_TOKEN_CRQ
2026-08-27T15:43:06.5515435Z ##[debug]loading SECRET_FORTIFY_TOKEN
2026-08-27T15:43:06.5515784Z ##[debug]loading SECRET_SCANCENTRAL_CLIENTTOKEN
2026-08-27T15:43:06.5517904Z ##[debug]loading SECRET_SCANCENTRAL_SSCCITOKEN
2026-08-27T15:43:06.5519750Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-08-27T15:43:06.5520591Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-08-27T15:43:06.5520902Z ##[debug]loading SECRET_GITTOKEN
2026-08-27T15:43:06.5521412Z ##[debug]loading SECRET_AZPAT
2026-08-27T15:43:06.5521658Z ##[debug]loading SECRET_FORTIFY_CLIENT_AUTH_TOKEN
2026-08-27T15:43:06.5521913Z ##[debug]loading SECRET_APIJSONGOOGLE
2026-08-27T15:43:06.5522156Z ##[debug]loading SECRET_KEYSTORE_PWD
2026-08-27T15:43:06.5522393Z ##[debug]loading SECRET_FIREBASE_TOKEN
2026-08-27T15:43:06.5522642Z ##[debug]loading SECRET_FORTIFY_PASS
2026-08-27T15:43:06.5522875Z ##[debug]loading SECRET_FORTIFY_REGISTRY_PASSWORD
2026-08-27T15:43:06.5523118Z ##[debug]loading SECRET_FORTIFY_CI_TOKEN
2026-08-27T15:43:06.5523357Z ##[debug]loading SECRET_NEXUS_INTERNO_PASS
2026-08-27T15:43:06.5523590Z ##[debug]loading SECRET_FORTIFY_UPTOKEN
2026-08-27T15:43:06.5523809Z ##[debug]loaded 27
2026-08-27T15:43:06.5524027Z ##[debug]Agent.ProxyUrl=undefined
2026-08-27T15:43:06.5524246Z ##[debug]Agent.CAInfo=undefined
2026-08-27T15:43:06.5524470Z ##[debug]Agent.ClientCert=undefined
2026-08-27T15:43:06.5524705Z ##[debug]Agent.SkipCertValidation=True
2026-08-27T15:43:06.5566817Z ##[debug]check path : /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-08-27T15:43:06.5585198Z ##[debug]adding resource file: /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-08-27T15:43:06.5587516Z ##[debug]system.culture=en-US
2026-08-27T15:43:06.5590909Z ##[debug]failOnStderr=false
2026-08-27T15:43:06.5593837Z ##[debug]workingDirectory=/opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r10/a
2026-08-27T15:43:06.5596730Z ##[debug]check path : /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r10/a
2026-08-27T15:43:06.5600635Z ##[debug]targetType=inline
2026-08-27T15:43:06.5603471Z ##[debug]bashEnvValue=undefined
2026-08-27T15:43:06.5608176Z ##[debug]script=#!/bin/bash

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

scancentral -url http://scancentral.apps.produtos4.caixa/scancentral-ctrl start -bt mvn -pool 794601f7-da27-467b-a734-06f92c4d63aa -application sieco-android -version 1.4.8 -uptoken *** -fprssc aa3f5b11c012c2da7052b4376057dabb5760ea5c.fpr -upload

elif [ $p_lang == android ]
then
cd /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r10/a/SIECO-Android
chmod +x gradlew
sed -i  "s,distributionUrl=.*,distributionUrl=file:///opt/ferramentas/gradle/gradle-$(awk '/distributionUrl/ {print $0}' /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r10/a/SIECO-Android/gradle/wrapper/gradle-wrapper.properties | sed 's/.*gradle-\(.*\)-.*/\1/g')-all.zip," gradle/wrapper/gradle-wrapper.properties
scancentral arguments -o -targs "-exclude './**/build/**/*'"
scancentral -url http://scancentral.apps.produtos4.caixa/scancentral-ctrl start -bt gradle -bc assembleDev -skipBuild -pool 25b9ff35-8b38-4a58-a54b-40b46436b3a1 -application sieco-android -version 1.4.8 -uptoken *** -fprssc aa3f5b11c012c2da7052b4376057dabb5760ea5c.fpr -upload

else
      if [ $PACKAGE_JSON_PATH ]
	    then
          cd $PACKAGE_JSON_PATH
		else
		  cd /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r10/a/SIECO-Android
		fi
	  scancentral arguments -o -targs "-Dcom.fortify.sca.exclude.unimported.node.modules 'true'" -targs "-exclude './**/node_modules/**/*'" -targs "-exclude './**/*.min.js'" -targs "-exclude './**/dist/**/*'"
          scancentral -url http://scancentral.apps.produtos4.caixa/scancentral-ctrl start -bt none -pool 25b9ff35-8b38-4a58-a54b-40b46436b3a1 -application sieco-android -version 1.4.8 -uptoken *** -fprssc aa3f5b11c012c2da7052b4376057dabb5760ea5c.fpr -upload
fi
2026-08-27T15:43:06.5612957Z Generating script.
2026-08-27T15:43:06.5615712Z ##[debug]which 'bash'
2026-08-27T15:43:06.5618475Z ##[debug]found: '/bin/bash'
2026-08-27T15:43:06.5621357Z ##[debug]Agent.Version=3.225.2
2026-08-27T15:43:06.5624253Z ##[debug]agent.tempDirectory=/opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp
2026-08-27T15:43:06.5627124Z ##[debug]check path : /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp
2026-08-27T15:43:06.5629926Z ========================== Starting Command Output ===========================
2026-08-27T15:43:06.5632276Z ##[debug]which '/bin/bash'
2026-08-27T15:43:06.5634367Z ##[debug]found: '/bin/bash'
2026-08-27T15:43:06.5636510Z ##[debug]/bin/bash arg: /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp/5dca5373-2a05-4568-9e7d-733bcd80762a.sh
2026-08-27T15:43:06.5638826Z ##[debug]exec tool: /bin/bash
2026-08-27T15:43:06.5641241Z ##[debug]arguments:
2026-08-27T15:43:06.5643397Z ##[debug]   /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp/5dca5373-2a05-4568-9e7d-733bcd80762a.sh
2026-08-27T15:43:06.5645737Z [command]/bin/bash /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp/5dca5373-2a05-4568-9e7d-733bcd80762a.sh
2026-08-27T15:43:06.7200826Z Apache Maven 3.6.2 (40f52333136460af0dc0d7232c0dc0bcf0d9e117; 2019-08-27T12:06:16-03:00)
2026-08-27T15:43:06.7201567Z Maven home: /opt/ferramentas/maven/apache-maven-3.6.2
2026-08-27T15:43:06.7203082Z Java version: 17.0.7, vendor: Oracle Corporation, runtime: /opt/ferramentas/jdk/jdk17.0.7
2026-08-27T15:43:06.7203446Z Default locale: pt_BR, platform encoding: UTF-8
2026-08-27T15:43:06.7219389Z OS name: "linux", version: "3.10.0-1062.9.1.el7.x86_64", arch: "amd64", family: "unix"
2026-08-27T15:43:06.7264335Z Iniciando Fortify Clean, Translate e Analysis
2026-08-27T15:43:06.7293026Z LANG android
2026-08-27T15:43:07.0998009Z launcher.log will be stored in "/home/sadscp01/.fortify/scancentral-22.2.0/log" directory.
2026-08-27T15:43:07.8292753Z Update failed.
2026-08-27T15:43:07.8293673Z Unable to identify the Controller URL. Specify either the -url option or the -sscurl and -ssctoken options.
2026-08-27T15:43:08.4084761Z scancentral.log will be stored in "/home/sadscp01/.fortify/scancentral-22.2.0/log" directory.
2026-08-27T15:43:10.3839134Z Creating the fortify-sca.settings file.
2026-08-27T15:43:10.6351265Z launcher.log will be stored in "/home/sadscp01/.fortify/scancentral-22.2.0/log" directory.
2026-08-27T15:43:11.0791032Z Checking for updates...
2026-08-27T15:43:11.1166297Z No update available or auto update is disabled on the controller.
2026-08-27T15:43:11.3080397Z scancentral.log will be stored in "/home/sadscp01/.fortify/scancentral-22.2.0/log" directory.
2026-08-27T15:43:12.9102819Z Verifying controller URL...
2026-08-27T15:43:13.0079454Z The Controller at http://scancentral.apps.produtos4.caixa/scancentral-ctrl is UP
2026-08-27T15:43:13.0220420Z No email address detected. No status emails will be sent for this job.
2026-08-27T15:43:13.0231111Z Gathering project information...
2026-08-27T15:43:13.1673463Z Downloading file:/opt/ferramentas/gradle/gradle-8.1-all.zip
2026-08-27T15:43:13.5824490Z ................................................................................................................................................................
2026-08-27T15:43:13.5825156Z Unzipping /home/sadscp01/.gradle/wrapper/dists/gradle-8.1-all/1sp3qgxnb9s64yqxhl6y68wjz/gradle-8.1-all.zip to /home/sadscp01/.gradle/wrapper/dists/gradle-8.1-all/1sp3qgxnb9s64yqxhl6y68wjz
2026-08-27T15:43:15.6086444Z Set executable permissions for: /home/sadscp01/.gradle/wrapper/dists/gradle-8.1-all/1sp3qgxnb9s64yqxhl6y68wjz/gradle-8.1/bin/gradle
2026-08-27T15:43:16.0521847Z To honour the JVM settings for this build a single-use Daemon process will be forked. See https://docs.gradle.org/8.1/userguide/gradle_daemon.html#sec:disabling_the_daemon.
2026-08-27T15:43:17.0555330Z Daemon will be stopped at the end of the build 
2026-08-27T15:43:17.3657928Z Configuration on demand is an incubating feature.
2026-08-27T15:43:24.6553024Z > Task :spec
2026-08-27T15:43:26.5573147Z Warning: SDK processing. This version only understands SDK XML versions up to 3 but an SDK XML file of version 4 was encountered. This can happen if you use versions of Android Studio and the command-line tools that were released at different times.
2026-08-27T15:43:26.5639278Z 
2026-08-27T15:43:26.5640654Z > Task :app:spec
2026-08-27T15:43:26.5640994Z WARNING: We recommend using a newer Android Gradle plugin to use compileSdk = 35
2026-08-27T15:43:26.5641185Z 
2026-08-27T15:43:26.5641513Z This Android Gradle plugin (8.1.1) was tested up to compileSdk = 34.
2026-08-27T15:43:26.5641807Z 
2026-08-27T15:43:26.5642128Z You are strongly encouraged to update your project to use a newer
2026-08-27T15:43:26.5642456Z Android Gradle plugin that has been tested with compileSdk = 35.
2026-08-27T15:43:26.5642679Z 
2026-08-27T15:43:26.5642950Z If you are already using the latest version of the Android Gradle plugin,
2026-08-27T15:43:26.5643309Z you may need to wait until a newer version with support for compileSdk = 35 is available.
2026-08-27T15:43:26.5643540Z 
2026-08-27T15:43:26.5643777Z To suppress this warning, add/update
2026-08-27T15:43:26.5644100Z     android.suppressUnsupportedCompileSdk=36,35
2026-08-27T15:43:26.5644560Z to this project's gradle.properties.
2026-08-27T15:43:26.5644970Z Can't resolve artifacts for implementationDependenciesMetadata configuration. Artifacts are ignored.
2026-08-27T15:43:26.5827227Z org.gradle.internal.exceptions.DefaultMultiCauseException: Could not resolve all files for configuration ':app:implementationDependenciesMetadata'.
2026-08-27T15:43:26.5850738Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.mapFailure(DefaultConfiguration.java:1716)
2026-08-27T15:43:26.5851991Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$3400(DefaultConfiguration.java:177)
2026-08-27T15:43:26.5852764Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$DefaultResolutionHost.mapFailure(DefaultConfiguration.java:2443)
2026-08-27T15:43:26.5853012Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionHost.rethrowFailure(ResolutionHost.java:30)
2026-08-27T15:43:26.5854865Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:74)
2026-08-27T15:43:26.5855354Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-27T15:43:26.5855722Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-27T15:43:26.5856088Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-27T15:43:26.5861290Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-27T15:43:26.5861660Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-27T15:43:26.5862118Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-27T15:43:26.5862593Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-27T15:43:26.5863125Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-27T15:43:26.5863444Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-27T15:43:26.5863781Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-27T15:43:26.5864142Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-27T15:43:26.5864499Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-27T15:43:26.5864985Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-27T15:43:26.5865305Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-27T15:43:26.5865628Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-27T15:43:26.6061073Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-27T15:43:26.6061835Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-27T15:43:26.6062271Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-27T15:43:26.6062700Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-27T15:43:26.6063210Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:26.6064202Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6064634Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:26.6065064Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6065441Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-27T15:43:26.6065788Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-27T15:43:26.6066228Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-27T15:43:26.6066587Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-27T15:43:26.6067264Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-27T15:43:26.6067658Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-27T15:43:26.6067990Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-27T15:43:26.6068317Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-27T15:43:26.6068620Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-27T15:43:26.6068900Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-27T15:43:26.6242197Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T15:43:26.6247022Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T15:43:26.6247618Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:26.6248086Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6248470Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:26.6248931Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6249269Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T15:43:26.6587402Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T15:43:26.6591852Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-27T15:43:26.6592195Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-27T15:43:26.6592680Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-27T15:43:26.6594893Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-27T15:43:26.6595289Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-27T15:43:26.6597370Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-27T15:43:26.6597676Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-27T15:43:26.6599779Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-27T15:43:26.6600083Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-27T15:43:26.6602176Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-27T15:43:26.6602541Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-27T15:43:26.6604592Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-27T15:43:26.6604914Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-27T15:43:26.6605265Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-27T15:43:26.6605572Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-27T15:43:26.6605910Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-27T15:43:26.6606192Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-27T15:43:26.6608192Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-27T15:43:26.6608668Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-27T15:43:26.6610744Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-27T15:43:26.6611046Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-27T15:43:26.6613087Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-27T15:43:26.6613392Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-27T15:43:26.6615412Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-27T15:43:26.6615713Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-27T15:43:26.6617900Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-27T15:43:26.6618196Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-27T15:43:26.6621262Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-27T15:43:26.6621565Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-27T15:43:26.6623609Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-27T15:43:26.6623951Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-27T15:43:26.6625987Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-27T15:43:26.6626333Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-27T15:43:26.6628379Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-27T15:43:26.6628797Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-27T15:43:26.6629110Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-27T15:43:26.6631196Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-27T15:43:26.6631506Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-27T15:43:26.6633559Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-27T15:43:26.6633881Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-27T15:43:26.6635924Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-27T15:43:26.6636220Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-27T15:43:26.6636960Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-27T15:43:26.6637344Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-27T15:43:26.6637731Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-27T15:43:26.6638111Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-27T15:43:26.6638510Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-27T15:43:26.6638852Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-27T15:43:26.6639163Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-27T15:43:26.6639721Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-27T15:43:26.6640105Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-27T15:43:26.6640472Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-27T15:43:26.6640873Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-27T15:43:26.6641218Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-27T15:43:26.6641557Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-27T15:43:26.6641942Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-27T15:43:26.6642592Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-27T15:43:26.6642933Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-27T15:43:26.6643172Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-27T15:43:26.6643410Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-27T15:43:26.6643646Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-27T15:43:26.6643884Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-27T15:43:26.6644117Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-27T15:43:26.6644342Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-27T15:43:26.6644745Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-27T15:43:26.6644974Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-27T15:43:26.6645201Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-27T15:43:26.6645421Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-27T15:43:26.6645661Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T15:43:26.6645913Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T15:43:26.6646143Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:26.6646362Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6646572Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:26.6646775Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6646989Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T15:43:26.6647278Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T15:43:26.6647494Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-27T15:43:26.6647705Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-27T15:43:26.6648006Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-27T15:43:26.6648255Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-27T15:43:26.6648497Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-27T15:43:26.6648750Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-27T15:43:26.6648981Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-27T15:43:26.6649184Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-27T15:43:26.6649393Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-27T15:43:26.6649600Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-27T15:43:26.6649948Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-27T15:43:26.6650169Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-27T15:43:26.6650345Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-27T15:43:26.6650525Z Cause 1: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :ticket.
2026-08-27T15:43:26.6650671Z Required by:
2026-08-27T15:43:26.6650768Z     project :app
2026-08-27T15:43:26.6651359Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :ticket:
2026-08-27T15:43:26.6651674Z   - devApiElements
2026-08-27T15:43:26.6651868Z   - hmpApiElements
2026-08-27T15:43:26.6651999Z   - pilotoApiElements
2026-08-27T15:43:26.6652137Z   - producaoApiElements
2026-08-27T15:43:26.6652255Z All of them match the consumer attributes:
2026-08-27T15:43:26.6652513Z   - Variant 'devApiElements' capability SIECO-Android:ticket:unspecified declares a component for use during compile-time:
2026-08-27T15:43:26.6652711Z       - Unmatched attributes:
2026-08-27T15:43:26.6652970Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:26.6653261Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T15:43:26.6653557Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T15:43:26.6653797Z           - Doesn't say anything about its component category (required a library)
2026-08-27T15:43:26.6654026Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T15:43:26.6654287Z   - Variant 'hmpApiElements' capability SIECO-Android:ticket:unspecified declares a component for use during compile-time:
2026-08-27T15:43:26.6654480Z       - Unmatched attributes:
2026-08-27T15:43:26.6654725Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:26.6655014Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T15:43:26.6655304Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T15:43:26.6655544Z           - Doesn't say anything about its component category (required a library)
2026-08-27T15:43:26.6655832Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T15:43:26.6656114Z   - Variant 'pilotoApiElements' capability SIECO-Android:ticket:unspecified declares a component for use during compile-time:
2026-08-27T15:43:26.6656308Z       - Unmatched attributes:
2026-08-27T15:43:26.6656557Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:26.6656848Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T15:43:26.6657148Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T15:43:26.6657390Z           - Doesn't say anything about its component category (required a library)
2026-08-27T15:43:26.6657618Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T15:43:26.6657903Z   - Variant 'producaoApiElements' capability SIECO-Android:ticket:unspecified declares a component for use during compile-time:
2026-08-27T15:43:26.6658099Z       - Unmatched attributes:
2026-08-27T15:43:26.6658344Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:26.6658632Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T15:43:26.6658927Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T15:43:26.6659159Z           - Doesn't say anything about its component category (required a library)
2026-08-27T15:43:26.6659386Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T15:43:26.6659607Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-27T15:43:26.6660028Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-27T15:43:26.6660297Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-27T15:43:26.6660547Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-27T15:43:26.6660794Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-27T15:43:26.6661049Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-27T15:43:26.6661307Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-27T15:43:26.6661583Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-27T15:43:26.6661933Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-27T15:43:26.6662191Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-27T15:43:26.6662444Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-27T15:43:26.6662698Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-27T15:43:26.6663002Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-27T15:43:26.6663249Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-27T15:43:26.6663501Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-27T15:43:26.6663734Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-27T15:43:26.6663951Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-27T15:43:26.6664183Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T15:43:26.6664431Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T15:43:26.6664662Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:26.6664876Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6665087Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:26.6665300Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6665509Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T15:43:26.6665718Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T15:43:26.6665930Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-27T15:43:26.6666229Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-27T15:43:26.6666479Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-27T15:43:26.6666723Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-27T15:43:26.6666955Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-27T15:43:26.6667186Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-27T15:43:26.6667424Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-27T15:43:26.6667676Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-27T15:43:26.6667928Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-27T15:43:26.6668174Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-27T15:43:26.6668424Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-27T15:43:26.6668672Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-27T15:43:26.6668898Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-27T15:43:26.6669174Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-27T15:43:26.6669389Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-27T15:43:26.6669583Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-27T15:43:26.6690870Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-27T15:43:26.6691143Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-27T15:43:26.6691374Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-27T15:43:26.6691613Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-27T15:43:26.6692015Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-27T15:43:26.6692549Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-27T15:43:26.6692775Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-27T15:43:26.6693014Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-27T15:43:26.6693249Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-27T15:43:26.6693557Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-27T15:43:26.6693832Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-27T15:43:26.6694040Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-27T15:43:26.6694247Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-27T15:43:26.6694464Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-27T15:43:26.6694890Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-27T15:43:26.6695105Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:26.6695317Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6695526Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:26.6695740Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6695950Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-27T15:43:26.6696162Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-27T15:43:26.6696376Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-27T15:43:26.6696580Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-27T15:43:26.6696789Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-27T15:43:26.6696999Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-27T15:43:26.6697186Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-27T15:43:26.6697381Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-27T15:43:26.6697570Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-27T15:43:26.6697752Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-27T15:43:26.6698037Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T15:43:26.6698289Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T15:43:26.6698520Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:26.6698734Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6698942Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:26.6699150Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6699360Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T15:43:26.6699571Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T15:43:26.6699914Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-27T15:43:26.6700097Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-27T15:43:26.6700300Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-27T15:43:26.6700514Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-27T15:43:26.6700719Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-27T15:43:26.6700918Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-27T15:43:26.6701102Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-27T15:43:26.6701296Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-27T15:43:26.6701646Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-27T15:43:26.6701903Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-27T15:43:26.6702236Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-27T15:43:26.6702463Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-27T15:43:26.6702682Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-27T15:43:26.6702981Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-27T15:43:26.6703192Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-27T15:43:26.6703398Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-27T15:43:26.6703574Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-27T15:43:26.6703747Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-27T15:43:26.6703931Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-27T15:43:26.6704181Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-27T15:43:26.6704469Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-27T15:43:26.6704774Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-27T15:43:26.6705104Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-27T15:43:26.6705466Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-27T15:43:26.6705775Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-27T15:43:26.6706107Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-27T15:43:26.6706415Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-27T15:43:26.6706726Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-27T15:43:26.6707049Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-27T15:43:26.6707380Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-27T15:43:26.6707713Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-27T15:43:26.6708086Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-27T15:43:26.6708503Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-27T15:43:26.6708874Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-27T15:43:26.6709243Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-27T15:43:26.6709573Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-27T15:43:26.6710023Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-27T15:43:26.6710458Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-27T15:43:26.6710858Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-27T15:43:26.6711324Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-27T15:43:26.6711664Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-27T15:43:26.6712007Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-27T15:43:26.6712377Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-27T15:43:26.6712780Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-27T15:43:26.6713196Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-27T15:43:26.6713593Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-27T15:43:26.6713995Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-27T15:43:26.6714372Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-27T15:43:26.6714730Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-27T15:43:26.6715089Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-27T15:43:26.6715459Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-27T15:43:26.6715803Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-27T15:43:26.6716155Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-27T15:43:26.6716492Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-27T15:43:26.6716881Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-27T15:43:26.6717218Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-27T15:43:26.6717524Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-27T15:43:26.6717866Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-27T15:43:26.6718246Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-27T15:43:26.6718645Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-27T15:43:26.6719043Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-27T15:43:26.6719445Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-27T15:43:26.6719945Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-27T15:43:26.6720330Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-27T15:43:26.6720704Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-27T15:43:26.6721086Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-27T15:43:26.6721452Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-27T15:43:26.6721897Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-27T15:43:26.6722325Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T15:43:26.6722832Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T15:43:26.6723234Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:26.6723592Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6723917Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:26.6724226Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6724533Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T15:43:26.6724849Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T15:43:26.6725157Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-27T15:43:26.6725373Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-27T15:43:26.6725593Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-27T15:43:26.6725846Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-27T15:43:26.6726095Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-27T15:43:26.6726351Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-27T15:43:26.6726579Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-27T15:43:26.6726897Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-27T15:43:26.6727103Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-27T15:43:26.6727304Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-27T15:43:26.6727505Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-27T15:43:26.6727768Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-27T15:43:26.6728033Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-27T15:43:26.6728212Z Cause 2: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :core.
2026-08-27T15:43:26.6728373Z Required by:
2026-08-27T15:43:26.6728538Z     project :app
2026-08-27T15:43:26.6729277Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :core:
2026-08-27T15:43:26.6729596Z   - devApiElements
2026-08-27T15:43:26.6730644Z   - hmpApiElements
2026-08-27T15:43:26.6730850Z   - pilotoApiElements
2026-08-27T15:43:26.6730997Z   - producaoApiElements
2026-08-27T15:43:26.6731122Z All of them match the consumer attributes:
2026-08-27T15:43:26.6731445Z   - Variant 'devApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-27T15:43:26.6731648Z       - Unmatched attributes:
2026-08-27T15:43:26.6731961Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:26.6732375Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T15:43:26.6732929Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T15:43:26.6733308Z           - Doesn't say anything about its component category (required a library)
2026-08-27T15:43:26.6733661Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T15:43:26.6734056Z   - Variant 'hmpApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-27T15:43:26.6734377Z       - Unmatched attributes:
2026-08-27T15:43:26.6734780Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:26.6735184Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T15:43:26.6735486Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T15:43:26.6735722Z           - Doesn't say anything about its component category (required a library)
2026-08-27T15:43:26.6735941Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T15:43:26.6736243Z   - Variant 'pilotoApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-27T15:43:26.6736640Z       - Unmatched attributes:
2026-08-27T15:43:26.6736986Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:26.6737412Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T15:43:26.6737846Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T15:43:26.6738158Z           - Doesn't say anything about its component category (required a library)
2026-08-27T15:43:26.6738385Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T15:43:26.6738659Z   - Variant 'producaoApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-27T15:43:26.6738854Z       - Unmatched attributes:
2026-08-27T15:43:26.6739098Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:26.6739385Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T15:43:26.6739822Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T15:43:26.6740122Z           - Doesn't say anything about its component category (required a library)
2026-08-27T15:43:26.6740345Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T15:43:26.6740563Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-27T15:43:26.6740834Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-27T15:43:26.6741098Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-27T15:43:26.6741347Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-27T15:43:26.6741597Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-27T15:43:26.6741997Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-27T15:43:26.6742287Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-27T15:43:26.6742562Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-27T15:43:26.6742832Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-27T15:43:26.6743085Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-27T15:43:26.6743343Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-27T15:43:26.6743645Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-27T15:43:26.6744010Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-27T15:43:26.6744262Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-27T15:43:26.6744513Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-27T15:43:26.6744746Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-27T15:43:26.6745015Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-27T15:43:26.6745252Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T15:43:26.6745514Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T15:43:26.6745778Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:26.6746031Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6746239Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:26.6746455Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6746667Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T15:43:26.6746874Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T15:43:26.6747096Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-27T15:43:26.6747334Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-27T15:43:26.6747578Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-27T15:43:26.6747815Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-27T15:43:26.6748045Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-27T15:43:26.6748276Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-27T15:43:26.6748600Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-27T15:43:26.6748850Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-27T15:43:26.6749094Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-27T15:43:26.6749345Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-27T15:43:26.6749600Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-27T15:43:26.6749924Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-27T15:43:26.6750200Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-27T15:43:26.6750456Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-27T15:43:26.6750771Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-27T15:43:26.6751067Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-27T15:43:26.6751273Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-27T15:43:26.6751497Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-27T15:43:26.6751831Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-27T15:43:26.6752138Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-27T15:43:26.6752334Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-27T15:43:26.6752530Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-27T15:43:26.6752754Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-27T15:43:26.6752952Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-27T15:43:26.6753123Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-27T15:43:26.6753333Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-27T15:43:26.6753583Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-27T15:43:26.6753798Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-27T15:43:26.6753996Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-27T15:43:26.6754278Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-27T15:43:26.6754502Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-27T15:43:26.6754716Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:26.6754972Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6755186Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:26.6755445Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6755717Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-27T15:43:26.6756013Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-27T15:43:26.6756223Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-27T15:43:26.6756423Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-27T15:43:26.6756636Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-27T15:43:26.6756843Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-27T15:43:26.6757037Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-27T15:43:26.6757224Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-27T15:43:26.6757410Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-27T15:43:26.6757593Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-27T15:43:26.6757798Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T15:43:26.6758044Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T15:43:26.6758301Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:26.6758522Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6758732Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:26.6759001Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6759212Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T15:43:26.6759423Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T15:43:26.6759620Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-27T15:43:26.6759874Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-27T15:43:26.6760073Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-27T15:43:26.6760284Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-27T15:43:26.6760495Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-27T15:43:26.6760698Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-27T15:43:26.6760890Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-27T15:43:26.6761168Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-27T15:43:26.6761432Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-27T15:43:26.6761665Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-27T15:43:26.6761951Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-27T15:43:26.6762222Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-27T15:43:26.6762442Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-27T15:43:26.6762707Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-27T15:43:26.6762909Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-27T15:43:26.6763106Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-27T15:43:26.6763282Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-27T15:43:26.6763454Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-27T15:43:26.6763638Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-27T15:43:26.6763824Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-27T15:43:26.6764022Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-27T15:43:26.6764231Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-27T15:43:26.6764429Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-27T15:43:26.6764623Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-27T15:43:26.6764820Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-27T15:43:26.6765075Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-27T15:43:26.6765291Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-27T15:43:26.6765497Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-27T15:43:26.6765695Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-27T15:43:26.6766012Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-27T15:43:26.6766217Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-27T15:43:26.6766441Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-27T15:43:26.6766682Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-27T15:43:26.6766905Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-27T15:43:26.6767197Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-27T15:43:26.6767396Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-27T15:43:26.6767581Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-27T15:43:26.6767789Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-27T15:43:26.6768015Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-27T15:43:26.6768361Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-27T15:43:26.6768570Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-27T15:43:26.6768766Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-27T15:43:26.6768979Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-27T15:43:26.6769213Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-27T15:43:26.6769507Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-27T15:43:26.6769801Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-27T15:43:26.6770030Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-27T15:43:26.6770245Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-27T15:43:26.6770451Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-27T15:43:26.6770697Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-27T15:43:26.6770938Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-27T15:43:26.6771196Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-27T15:43:26.6771437Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-27T15:43:26.6771634Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-27T15:43:26.6771827Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-27T15:43:26.6772095Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-27T15:43:26.6772279Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-27T15:43:26.6772474Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-27T15:43:26.6772695Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-27T15:43:26.6772981Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-27T15:43:26.6773216Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-27T15:43:26.6773453Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-27T15:43:26.6773722Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-27T15:43:26.6774004Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-27T15:43:26.6774215Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-27T15:43:26.6774441Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-27T15:43:26.6774664Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-27T15:43:26.6774881Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-27T15:43:26.6775118Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T15:43:26.6775365Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T15:43:26.6775595Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:26.6775833Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6776102Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:26.6776318Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6776586Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T15:43:26.6776791Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T15:43:26.6777002Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-27T15:43:26.6777206Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-27T15:43:26.6777431Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-27T15:43:26.6777672Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-27T15:43:26.6777955Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-27T15:43:26.6778241Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-27T15:43:26.6778470Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-27T15:43:26.6778677Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-27T15:43:26.6778887Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-27T15:43:26.6779082Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-27T15:43:26.6779285Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-27T15:43:26.6779491Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-27T15:43:26.6779833Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-27T15:43:26.6780083Z Cause 3: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :dto.
2026-08-27T15:43:26.6780229Z Required by:
2026-08-27T15:43:26.6780334Z     project :app
2026-08-27T15:43:26.6780829Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :dto:
2026-08-27T15:43:26.6781135Z   - devApiElements
2026-08-27T15:43:26.6781291Z   - hmpApiElements
2026-08-27T15:43:26.6781480Z   - pilotoApiElements
2026-08-27T15:43:26.6781627Z   - producaoApiElements
2026-08-27T15:43:26.6781792Z All of them match the consumer attributes:
2026-08-27T15:43:26.6782126Z   - Variant 'devApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-27T15:43:26.6782334Z       - Unmatched attributes:
2026-08-27T15:43:26.6782585Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:26.6782877Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T15:43:26.6783172Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T15:43:26.6783416Z           - Doesn't say anything about its component category (required a library)
2026-08-27T15:43:26.6783670Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T15:43:26.6783993Z   - Variant 'hmpApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-27T15:43:26.6784262Z       - Unmatched attributes:
2026-08-27T15:43:26.6784581Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:26.6784883Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T15:43:26.6785185Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T15:43:26.6785488Z           - Doesn't say anything about its component category (required a library)
2026-08-27T15:43:26.6785722Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T15:43:26.6786054Z   - Variant 'pilotoApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-27T15:43:26.6786251Z       - Unmatched attributes:
2026-08-27T15:43:26.6786489Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:26.6786762Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T15:43:26.6787047Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T15:43:26.6787283Z           - Doesn't say anything about its component category (required a library)
2026-08-27T15:43:26.6787512Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T15:43:26.6787781Z   - Variant 'producaoApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-27T15:43:26.6787975Z       - Unmatched attributes:
2026-08-27T15:43:26.6788218Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:26.6788575Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T15:43:26.6788880Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T15:43:26.6789125Z           - Doesn't say anything about its component category (required a library)
2026-08-27T15:43:26.6789353Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T15:43:26.6789570Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-27T15:43:26.6789920Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-27T15:43:26.6790188Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-27T15:43:26.6790488Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-27T15:43:26.6790736Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-27T15:43:26.6791062Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-27T15:43:26.6791321Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-27T15:43:26.6791685Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-27T15:43:26.6792036Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-27T15:43:26.6792380Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-27T15:43:26.6792636Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-27T15:43:26.6792897Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-27T15:43:26.6793215Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-27T15:43:26.6793462Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-27T15:43:26.6793721Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-27T15:43:26.6793959Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-27T15:43:26.6794169Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-27T15:43:26.6794397Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T15:43:26.6794646Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T15:43:26.6794879Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:26.6795093Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6795354Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:26.6795573Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6795796Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T15:43:26.6796082Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T15:43:26.6796309Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-27T15:43:26.6796570Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-27T15:43:26.6796890Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-27T15:43:26.6797139Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-27T15:43:26.6797377Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-27T15:43:26.6797606Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-27T15:43:26.6797849Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-27T15:43:26.6798103Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-27T15:43:26.6798356Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-27T15:43:26.6798609Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-27T15:43:26.6798911Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-27T15:43:26.6799159Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-27T15:43:26.6799390Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-27T15:43:26.6799611Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-27T15:43:26.6799897Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-27T15:43:26.6800085Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-27T15:43:26.6800289Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-27T15:43:26.6800514Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-27T15:43:26.6800733Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-27T15:43:26.6800988Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-27T15:43:26.6801180Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-27T15:43:26.6801465Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-27T15:43:26.6801797Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-27T15:43:26.6802083Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-27T15:43:26.6802436Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-27T15:43:26.6802753Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-27T15:43:26.6802972Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-27T15:43:26.6803182Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-27T15:43:26.6803470Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-27T15:43:26.6803706Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-27T15:43:26.6803986Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-27T15:43:26.6804313Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:26.6804630Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6804949Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:26.6805575Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6805793Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-27T15:43:26.6806005Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-27T15:43:26.6806220Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-27T15:43:26.6806424Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-27T15:43:26.6806642Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-27T15:43:26.6806924Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-27T15:43:26.6807139Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-27T15:43:26.6807437Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-27T15:43:26.6807722Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-27T15:43:26.6808019Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-27T15:43:26.6808372Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T15:43:26.6808786Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T15:43:26.6809166Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:26.6809496Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6809929Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:26.6810280Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6810636Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T15:43:26.6810962Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T15:43:26.6811272Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-27T15:43:26.6811563Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-27T15:43:26.6812054Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-27T15:43:26.6812416Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-27T15:43:26.6812737Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-27T15:43:26.6813053Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-27T15:43:26.6813363Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-27T15:43:26.6813663Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-27T15:43:26.6813972Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-27T15:43:26.6814343Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-27T15:43:26.6814739Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-27T15:43:26.6815109Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-27T15:43:26.6815468Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-27T15:43:26.6815741Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-27T15:43:26.6815948Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-27T15:43:26.6816150Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-27T15:43:26.6816318Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-27T15:43:26.6816494Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-27T15:43:26.6816763Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-27T15:43:26.6816955Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-27T15:43:26.6817160Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-27T15:43:26.6817369Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-27T15:43:26.6817572Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-27T15:43:26.6817770Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-27T15:43:26.6817972Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-27T15:43:26.6818180Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-27T15:43:26.6818376Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-27T15:43:26.6818566Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-27T15:43:26.6818767Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-27T15:43:26.6818970Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-27T15:43:26.6819186Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-27T15:43:26.6819402Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-27T15:43:26.6819728Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-27T15:43:26.6819969Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-27T15:43:26.6820250Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-27T15:43:26.6820452Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-27T15:43:26.6820638Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-27T15:43:26.6820848Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-27T15:43:26.6821082Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-27T15:43:26.6821334Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-27T15:43:26.6821639Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-27T15:43:26.6821924Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-27T15:43:26.6822229Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-27T15:43:26.6822577Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-27T15:43:26.6822934Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-27T15:43:26.6823260Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-27T15:43:26.6823576Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-27T15:43:26.6823890Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-27T15:43:26.6824213Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-27T15:43:26.6824608Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-27T15:43:26.6824826Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-27T15:43:26.6825024Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-27T15:43:26.6825227Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-27T15:43:26.6825428Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-27T15:43:26.6825620Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-27T15:43:26.6825816Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-27T15:43:26.6826002Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-27T15:43:26.6826207Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-27T15:43:26.6826435Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-27T15:43:26.6826672Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-27T15:43:26.6826902Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-27T15:43:26.6827140Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-27T15:43:26.6827380Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-27T15:43:26.6827604Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-27T15:43:26.6827984Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-27T15:43:26.6828281Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-27T15:43:26.6828584Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-27T15:43:26.6828910Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-27T15:43:26.6829287Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T15:43:26.6829623Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T15:43:26.6829953Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:26.6830176Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6830392Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:26.6830607Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6830860Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T15:43:26.6831190Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T15:43:26.6831538Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-27T15:43:26.6831838Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-27T15:43:26.6832070Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-27T15:43:26.6832414Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-27T15:43:26.6832663Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-27T15:43:26.6832921Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-27T15:43:26.6833177Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-27T15:43:26.6833516Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-27T15:43:26.6833851Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-27T15:43:26.6834147Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-27T15:43:26.6834488Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-27T15:43:26.6834846Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-27T15:43:26.6835041Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-27T15:43:26.6835212Z Cause 4: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :caixaui.
2026-08-27T15:43:26.6835360Z Required by:
2026-08-27T15:43:26.6835470Z     project :app
2026-08-27T15:43:26.6836029Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :caixaui:
2026-08-27T15:43:26.6836572Z   - devApiElements
2026-08-27T15:43:26.6836753Z   - hmpApiElements
2026-08-27T15:43:26.6836940Z   - pilotoApiElements
2026-08-27T15:43:26.6837133Z   - producaoApiElements
2026-08-27T15:43:26.6837303Z All of them match the consumer attributes:
2026-08-27T15:43:26.6837580Z   - Variant 'devApiElements' capability SIECO-Android:caixaui:unspecified declares a component for use during compile-time:
2026-08-27T15:43:26.6837783Z       - Unmatched attributes:
2026-08-27T15:43:26.6838040Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:26.6838332Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T15:43:26.6838628Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T15:43:26.6838861Z           - Doesn't say anything about its component category (required a library)
2026-08-27T15:43:26.6839091Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T15:43:26.6839363Z   - Variant 'hmpApiElements' capability SIECO-Android:caixaui:unspecified declares a component for use during compile-time:
2026-08-27T15:43:26.6839561Z       - Unmatched attributes:
2026-08-27T15:43:26.6843196Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:26.6843522Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T15:43:26.6843820Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T15:43:26.6844062Z           - Doesn't say anything about its component category (required a library)
2026-08-27T15:43:26.6844297Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T15:43:26.6844696Z   - Variant 'pilotoApiElements' capability SIECO-Android:caixaui:unspecified declares a component for use during compile-time:
2026-08-27T15:43:26.6844894Z       - Unmatched attributes:
2026-08-27T15:43:26.6845144Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:26.6845434Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T15:43:26.6846059Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T15:43:26.6846415Z           - Doesn't say anything about its component category (required a library)
2026-08-27T15:43:26.6846721Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T15:43:26.6847039Z   - Variant 'producaoApiElements' capability SIECO-Android:caixaui:unspecified declares a component for use during compile-time:
2026-08-27T15:43:26.6847235Z       - Unmatched attributes:
2026-08-27T15:43:26.6847472Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:26.6847758Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T15:43:26.6848139Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T15:43:26.6848398Z           - Doesn't say anything about its component category (required a library)
2026-08-27T15:43:26.6848625Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T15:43:26.6848927Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-27T15:43:26.6849199Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-27T15:43:26.6849455Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-27T15:43:26.6849799Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-27T15:43:26.6850059Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-27T15:43:26.6850314Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-27T15:43:26.6850566Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-27T15:43:26.6850834Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-27T15:43:26.6851100Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-27T15:43:26.6851354Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-27T15:43:26.6851605Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-27T15:43:26.6851855Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-27T15:43:26.6852122Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-27T15:43:26.6852745Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-27T15:43:26.6853010Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-27T15:43:26.6853247Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-27T15:43:26.6853557Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-27T15:43:26.6853905Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T15:43:26.6854269Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T15:43:26.6854627Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:26.6854948Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6855250Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:26.6855585Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6855880Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T15:43:26.6856170Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T15:43:26.6856517Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-27T15:43:26.6856949Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-27T15:43:26.6857273Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-27T15:43:26.6857627Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-27T15:43:26.6857963Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-27T15:43:26.6858264Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-27T15:43:26.6858601Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-27T15:43:26.6858988Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-27T15:43:26.6859260Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-27T15:43:26.6859951Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-27T15:43:26.6860486Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-27T15:43:26.6860840Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-27T15:43:26.6861190Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-27T15:43:26.6861526Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-27T15:43:26.6861984Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-27T15:43:26.6862246Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-27T15:43:26.6862507Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-27T15:43:26.6862812Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-27T15:43:26.6863096Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-27T15:43:26.6863383Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-27T15:43:26.6863631Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-27T15:43:26.6863870Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-27T15:43:26.6864161Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-27T15:43:26.6864448Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-27T15:43:26.6864685Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-27T15:43:26.6864936Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-27T15:43:26.6865210Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-27T15:43:26.6865498Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-27T15:43:26.6865762Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-27T15:43:26.6866145Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-27T15:43:26.6866466Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-27T15:43:26.6866800Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:26.6867105Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6867376Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:26.6867658Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6867938Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-27T15:43:26.6868149Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-27T15:43:26.6868361Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-27T15:43:26.6868564Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-27T15:43:26.6868768Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-27T15:43:26.6868974Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-27T15:43:26.6869171Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-27T15:43:26.6869360Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-27T15:43:26.6869545Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-27T15:43:26.6869832Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-27T15:43:26.6870053Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T15:43:26.6870383Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T15:43:26.6870610Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:26.6870823Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6871030Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:26.6871239Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6871567Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T15:43:26.6871962Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T15:43:26.6872226Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-27T15:43:26.6872469Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-27T15:43:26.6872771Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-27T15:43:26.6873043Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-27T15:43:26.6873332Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-27T15:43:26.6873630Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-27T15:43:26.6873900Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-27T15:43:26.6874183Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-27T15:43:26.6874385Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-27T15:43:26.6874612Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-27T15:43:26.6874860Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-27T15:43:26.6875090Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-27T15:43:26.6875307Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-27T15:43:26.6875520Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-27T15:43:26.6875723Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-27T15:43:26.6875959Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-27T15:43:26.6876185Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-27T15:43:26.6876358Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-27T15:43:26.6876544Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-27T15:43:26.6876734Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-27T15:43:26.6876921Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-27T15:43:26.6877200Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-27T15:43:26.6877511Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-27T15:43:26.6877809Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-27T15:43:26.6878145Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-27T15:43:26.6878430Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-27T15:43:26.6878672Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-27T15:43:26.6878925Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-27T15:43:26.6879185Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-27T15:43:26.6879453Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-27T15:43:26.6879904Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-27T15:43:26.6880257Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-27T15:43:26.6880526Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-27T15:43:26.6880752Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-27T15:43:26.6880960Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-27T15:43:26.6881161Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-27T15:43:26.6881345Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-27T15:43:26.6881538Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-27T15:43:26.6881764Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-27T15:43:26.6882066Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-27T15:43:26.6882315Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-27T15:43:26.6882631Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-27T15:43:26.6882930Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-27T15:43:26.6883267Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-27T15:43:26.6883557Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-27T15:43:26.6883917Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-27T15:43:26.6884283Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-27T15:43:26.6884506Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-27T15:43:26.6884716Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-27T15:43:26.6884924Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-27T15:43:26.6885134Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-27T15:43:26.6885335Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-27T15:43:26.6885547Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-27T15:43:26.6885859Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-27T15:43:26.6886120Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-27T15:43:26.6886483Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-27T15:43:26.6886759Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-27T15:43:26.6887072Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-27T15:43:26.6887486Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-27T15:43:26.6887880Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-27T15:43:26.6888249Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-27T15:43:26.6888684Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-27T15:43:26.6889105Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-27T15:43:26.6889512Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-27T15:43:26.6890016Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-27T15:43:26.6890340Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-27T15:43:26.6890681Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-27T15:43:26.6891037Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-27T15:43:26.6891442Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T15:43:26.6892039Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T15:43:26.6892413Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:26.6892763Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6893059Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:26.6893405Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6893752Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T15:43:26.6894021Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T15:43:26.6894254Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-27T15:43:26.6894467Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-27T15:43:26.6894694Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-27T15:43:26.6895109Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-27T15:43:26.6895368Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-27T15:43:26.6895621Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-27T15:43:26.6895850Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-27T15:43:26.6896167Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-27T15:43:26.6896380Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-27T15:43:26.6896586Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-27T15:43:26.6896797Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-27T15:43:26.6897008Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-27T15:43:26.6897187Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-27T15:43:26.6897368Z Cause 5: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :payer.
2026-08-27T15:43:26.6897512Z Required by:
2026-08-27T15:43:26.6897616Z     project :app
2026-08-27T15:43:26.6898144Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :payer:
2026-08-27T15:43:26.6898471Z   - devApiElements
2026-08-27T15:43:26.6898596Z   - hmpApiElements
2026-08-27T15:43:26.6898732Z   - pilotoApiElements
2026-08-27T15:43:26.6898874Z   - producaoApiElements
2026-08-27T15:43:26.6898996Z All of them match the consumer attributes:
2026-08-27T15:43:26.6899255Z   - Variant 'devApiElements' capability SIECO-Android:payer:unspecified declares a component for use during compile-time:
2026-08-27T15:43:26.6899456Z       - Unmatched attributes:
2026-08-27T15:43:26.6899828Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:26.6900200Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T15:43:26.6900507Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T15:43:26.6900753Z           - Doesn't say anything about its component category (required a library)
2026-08-27T15:43:26.6900985Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T15:43:26.6901261Z   - Variant 'hmpApiElements' capability SIECO-Android:payer:unspecified declares a component for use during compile-time:
2026-08-27T15:43:26.6901456Z       - Unmatched attributes:
2026-08-27T15:43:26.6901697Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:26.6902117Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T15:43:26.6902413Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T15:43:26.6902649Z           - Doesn't say anything about its component category (required a library)
2026-08-27T15:43:26.6902879Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T15:43:26.6903157Z   - Variant 'pilotoApiElements' capability SIECO-Android:payer:unspecified declares a component for use during compile-time:
2026-08-27T15:43:26.6903350Z       - Unmatched attributes:
2026-08-27T15:43:26.6903593Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:26.6903880Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T15:43:26.6904218Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T15:43:26.6904593Z           - Doesn't say anything about its component category (required a library)
2026-08-27T15:43:26.6904825Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T15:43:26.6905101Z   - Variant 'producaoApiElements' capability SIECO-Android:payer:unspecified declares a component for use during compile-time:
2026-08-27T15:43:26.6905297Z       - Unmatched attributes:
2026-08-27T15:43:26.6905544Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:26.6905834Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T15:43:26.6906133Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T15:43:26.6906379Z           - Doesn't say anything about its component category (required a library)
2026-08-27T15:43:26.6906609Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T15:43:26.6906903Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-27T15:43:26.6907190Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-27T15:43:26.6907452Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-27T15:43:26.6907708Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-27T15:43:26.6908006Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-27T15:43:26.6908268Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-27T15:43:26.6908525Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-27T15:43:26.6908796Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-27T15:43:26.6909145Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-27T15:43:26.6909500Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-27T15:43:26.6909961Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-27T15:43:26.6910242Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-27T15:43:26.6910495Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-27T15:43:26.6910748Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-27T15:43:26.6911008Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-27T15:43:26.6911245Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-27T15:43:26.6911462Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-27T15:43:26.6911772Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T15:43:26.6912107Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T15:43:26.6912360Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:26.6912575Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6912782Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:26.6912997Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6913212Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T15:43:26.6913423Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T15:43:26.6913653Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-27T15:43:26.6913890Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-27T15:43:26.6914138Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-27T15:43:26.6914439Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-27T15:43:26.6914677Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-27T15:43:26.6914963Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-27T15:43:26.6915210Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-27T15:43:26.6915464Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-27T15:43:26.6915716Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-27T15:43:26.6915966Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-27T15:43:26.6916218Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-27T15:43:26.6916471Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-27T15:43:26.6916702Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-27T15:43:26.6916922Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-27T15:43:26.6917139Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-27T15:43:26.6917383Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-27T15:43:26.6917617Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-27T15:43:26.6917841Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-27T15:43:26.6918117Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-27T15:43:26.6918398Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-27T15:43:26.6918591Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-27T15:43:26.6918785Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-27T15:43:26.6919004Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-27T15:43:26.6919202Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-27T15:43:26.6919373Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-27T15:43:26.6919558Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-27T15:43:26.6919848Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-27T15:43:26.6920067Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-27T15:43:26.6920267Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-27T15:43:26.6920475Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-27T15:43:26.6920690Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-27T15:43:26.6920900Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:26.6921107Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6921315Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:26.6921580Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6921791Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-27T15:43:26.6922103Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-27T15:43:26.6922404Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-27T15:43:26.6922631Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-27T15:43:26.6922846Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-27T15:43:26.6923053Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-27T15:43:26.6923250Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-27T15:43:26.6923441Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-27T15:43:26.6923625Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-27T15:43:26.6923808Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-27T15:43:26.6924026Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T15:43:26.6924277Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T15:43:26.6924505Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:26.6924719Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6924930Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:26.6925198Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6925408Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T15:43:26.6925618Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T15:43:26.6925813Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-27T15:43:26.6925991Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-27T15:43:26.6926190Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-27T15:43:26.6926406Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-27T15:43:26.6926613Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-27T15:43:26.6926818Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-27T15:43:26.6927015Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-27T15:43:26.6927199Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-27T15:43:26.6927397Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-27T15:43:26.6927629Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-27T15:43:26.6927875Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-27T15:43:26.6928104Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-27T15:43:26.6928374Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-27T15:43:26.6928586Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-27T15:43:26.6928788Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-27T15:43:26.6945777Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-27T15:43:26.6945979Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-27T15:43:26.6946162Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-27T15:43:26.6946356Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-27T15:43:26.6946550Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-27T15:43:26.6946756Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-27T15:43:26.6946987Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-27T15:43:26.6947197Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-27T15:43:26.6947395Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-27T15:43:26.6947600Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-27T15:43:26.6947809Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-27T15:43:26.6947997Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-27T15:43:26.6948176Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-27T15:43:26.6948373Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-27T15:43:26.6948574Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-27T15:43:26.6948908Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-27T15:43:26.6949137Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-27T15:43:26.6949388Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-27T15:43:26.6949618Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-27T15:43:26.6949948Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-27T15:43:26.6950145Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-27T15:43:26.6950329Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-27T15:43:26.6950538Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-27T15:43:26.6950768Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-27T15:43:26.6950992Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-27T15:43:26.6951197Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-27T15:43:26.6951388Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-27T15:43:26.6951596Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-27T15:43:26.6951825Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-27T15:43:26.6952256Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-27T15:43:26.6952495Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-27T15:43:26.6952719Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-27T15:43:26.6952933Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-27T15:43:26.6953138Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-27T15:43:26.6953337Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-27T15:43:26.6953546Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-27T15:43:26.6953750Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-27T15:43:26.6953953Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-27T15:43:26.6954150Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-27T15:43:26.6954342Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-27T15:43:26.6954527Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-27T15:43:26.6954712Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-27T15:43:26.6954908Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-27T15:43:26.6955130Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-27T15:43:26.6955363Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-27T15:43:26.6955710Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-27T15:43:26.6956022Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-27T15:43:26.6956260Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-27T15:43:26.6956481Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-27T15:43:26.6956699Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-27T15:43:26.6956922Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-27T15:43:26.6957144Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-27T15:43:26.6957362Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-27T15:43:26.6957587Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T15:43:26.6957837Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T15:43:26.6958064Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:26.6958278Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6958489Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:26.6958760Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6958969Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T15:43:26.6959178Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T15:43:26.6959391Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-27T15:43:26.6959599Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-27T15:43:26.6959956Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-27T15:43:26.6960208Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-27T15:43:26.6960451Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-27T15:43:26.6960712Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-27T15:43:26.6960942Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-27T15:43:26.6961149Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-27T15:43:26.6961359Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-27T15:43:26.6961562Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-27T15:43:26.6961814Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-27T15:43:26.6962140Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-27T15:43:26.6962315Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-27T15:43:26.6962542Z Cause 6: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :pix.
2026-08-27T15:43:26.6962693Z Required by:
2026-08-27T15:43:26.6962799Z     project :app
2026-08-27T15:43:26.6963320Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :pix:
2026-08-27T15:43:26.6963625Z   - devApiElements
2026-08-27T15:43:26.6963760Z   - hmpApiElements
2026-08-27T15:43:26.6963892Z   - pilotoApiElements
2026-08-27T15:43:26.6964028Z   - producaoApiElements
2026-08-27T15:43:26.6964145Z All of them match the consumer attributes:
2026-08-27T15:43:26.6964479Z   - Variant 'devApiElements' capability SIECO-Android:pix:unspecified declares a library for use during compile-time, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-27T15:43:26.6964713Z       - Unmatched attributes:
2026-08-27T15:43:26.6964974Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:26.6965262Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T15:43:26.6965546Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T15:43:26.6965821Z           - Provides attribute 'org.gradle.jvm.environment' with value 'android' but the consumer didn't ask for it
2026-08-27T15:43:26.6966172Z   - Variant 'hmpApiElements' capability SIECO-Android:pix:unspecified declares a library for use during compile-time, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-27T15:43:26.6966461Z       - Unmatched attributes:
2026-08-27T15:43:26.6966715Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:26.6967028Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T15:43:26.6967330Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T15:43:26.6967610Z           - Provides attribute 'org.gradle.jvm.environment' with value 'android' but the consumer didn't ask for it
2026-08-27T15:43:26.6967972Z   - Variant 'pilotoApiElements' capability SIECO-Android:pix:unspecified declares a library for use during compile-time, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-27T15:43:26.6968206Z       - Unmatched attributes:
2026-08-27T15:43:26.6968458Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:26.6968753Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T15:43:26.6969049Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T15:43:26.6969324Z           - Provides attribute 'org.gradle.jvm.environment' with value 'android' but the consumer didn't ask for it
2026-08-27T15:43:26.6969747Z   - Variant 'producaoApiElements' capability SIECO-Android:pix:unspecified declares a library for use during compile-time, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-27T15:43:26.6969991Z       - Unmatched attributes:
2026-08-27T15:43:26.6970239Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:26.6970586Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T15:43:26.6970883Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T15:43:26.6971152Z           - Provides attribute 'org.gradle.jvm.environment' with value 'android' but the consumer didn't ask for it
2026-08-27T15:43:26.6971391Z The following variants were also considered but didn't match the requested attributes:
2026-08-27T15:43:26.6971749Z   - Variant 'devSourcesElements' capability SIECO-Android:pix:unspecified declares a component for use during runtime, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-27T15:43:26.6972098Z       - Incompatible because this component declares documentation and the consumer needed a library
2026-08-27T15:43:26.6972445Z   - Variant 'hmpSourcesElements' capability SIECO-Android:pix:unspecified declares a component for use during runtime, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-27T15:43:26.6972736Z       - Incompatible because this component declares documentation and the consumer needed a library
2026-08-27T15:43:26.6973151Z   - Variant 'pilotoSourcesElements' capability SIECO-Android:pix:unspecified declares a component for use during runtime, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-27T15:43:26.6973453Z       - Incompatible because this component declares documentation and the consumer needed a library
2026-08-27T15:43:26.6973814Z   - Variant 'producaoSourcesElements' capability SIECO-Android:pix:unspecified declares a component for use during runtime, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
2026-08-27T15:43:26.6974164Z       - Incompatible because this component declares documentation and the consumer needed a library
2026-08-27T15:43:26.6974374Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-27T15:43:26.6974638Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-27T15:43:26.6974890Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-27T15:43:26.6975136Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-27T15:43:26.6975404Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-27T15:43:26.6975682Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-27T15:43:26.6975942Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-27T15:43:26.6976218Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-27T15:43:26.6976488Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-27T15:43:26.6976742Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-27T15:43:26.6976990Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-27T15:43:26.6977243Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-27T15:43:26.6977566Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-27T15:43:26.6977816Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-27T15:43:26.6978067Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-27T15:43:26.6978305Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-27T15:43:26.6978527Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-27T15:43:26.6978763Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T15:43:26.6979018Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T15:43:26.6979250Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:26.6979468Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6979733Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:26.6979957Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6980172Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T15:43:26.6980381Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T15:43:26.6980662Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-27T15:43:26.6980905Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-27T15:43:26.6981149Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-27T15:43:26.6981382Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-27T15:43:26.6981619Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-27T15:43:26.6981858Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-27T15:43:26.6982200Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-27T15:43:26.6982458Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-27T15:43:26.6982704Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-27T15:43:26.6982949Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-27T15:43:26.6983196Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-27T15:43:26.6983441Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-27T15:43:26.6983666Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-27T15:43:26.6983935Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-27T15:43:26.6984144Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-27T15:43:26.6984429Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-27T15:43:26.6984628Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-27T15:43:26.6984853Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-27T15:43:26.6985073Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-27T15:43:26.6985284Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-27T15:43:26.6985476Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-27T15:43:26.6985670Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-27T15:43:26.6985891Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-27T15:43:26.6986087Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-27T15:43:26.6986256Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-27T15:43:26.6986448Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-27T15:43:26.6986657Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-27T15:43:26.6986868Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-27T15:43:26.6987142Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-27T15:43:26.6987354Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-27T15:43:26.6987562Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-27T15:43:26.6987776Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:26.6987984Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6988196Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:26.6988410Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6988619Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-27T15:43:26.6988830Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-27T15:43:26.6989037Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-27T15:43:26.6989239Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-27T15:43:26.6989454Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-27T15:43:26.6989731Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-27T15:43:26.6989934Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-27T15:43:26.6990125Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-27T15:43:26.6990310Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-27T15:43:26.6990551Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-27T15:43:26.6990773Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T15:43:26.6991023Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T15:43:26.6991258Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:26.6991465Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6991678Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:26.6992019Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.6992247Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T15:43:26.6992459Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T15:43:26.6992652Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-27T15:43:26.6992836Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-27T15:43:26.6993032Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-27T15:43:26.6993246Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-27T15:43:26.6993448Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-27T15:43:26.6993649Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-27T15:43:26.6993907Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-27T15:43:26.6994103Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-27T15:43:26.6994300Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-27T15:43:26.6994534Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-27T15:43:26.6994783Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-27T15:43:26.6995011Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-27T15:43:26.6995230Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-27T15:43:26.6995432Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-27T15:43:26.6995648Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-27T15:43:26.6995853Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-27T15:43:26.6996033Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-27T15:43:26.6996206Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-27T15:43:26.6996463Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-27T15:43:26.6996702Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-27T15:43:26.6996902Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-27T15:43:26.6997108Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-27T15:43:26.6997312Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-27T15:43:26.6997565Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-27T15:43:26.6997764Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-27T15:43:26.6997968Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-27T15:43:26.6998155Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-27T15:43:26.6998337Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-27T15:43:26.6998523Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-27T15:43:26.6998718Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-27T15:43:26.6998917Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-27T15:43:26.6999140Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-27T15:43:26.6999380Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-27T15:43:26.6999607Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-27T15:43:26.6999883Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-27T15:43:26.7000083Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-27T15:43:26.7000267Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-27T15:43:26.7000475Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-27T15:43:26.7000762Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-27T15:43:26.7000991Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-27T15:43:26.7001197Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-27T15:43:26.7001391Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-27T15:43:26.7001600Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-27T15:43:26.7001832Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-27T15:43:26.7002134Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-27T15:43:26.7002373Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-27T15:43:26.7002601Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-27T15:43:26.7002807Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-27T15:43:26.7003019Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-27T15:43:26.7003226Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-27T15:43:26.7003434Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-27T15:43:26.7003639Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-27T15:43:26.7003839Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-27T15:43:26.7004095Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-27T15:43:26.7004287Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-27T15:43:26.7004480Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-27T15:43:26.7004666Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-27T15:43:26.7004866Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-27T15:43:26.7005090Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-27T15:43:26.7005322Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-27T15:43:26.7005553Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-27T15:43:26.7005796Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-27T15:43:26.7006031Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-27T15:43:26.7006253Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-27T15:43:26.7006473Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-27T15:43:26.7006708Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-27T15:43:26.7006921Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-27T15:43:26.7007141Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-27T15:43:26.7007422Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T15:43:26.7007668Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T15:43:26.7007899Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:26.7008114Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.7008326Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:26.7008537Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:26.7008747Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T15:43:26.7008960Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T15:43:26.7009177Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-27T15:43:26.7009384Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-27T15:43:26.7009606Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-27T15:43:26.7009912Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-27T15:43:26.7010156Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-27T15:43:26.7010405Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-27T15:43:26.7010722Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-27T15:43:26.7010929Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-27T15:43:26.7011142Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-27T15:43:26.7011345Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-27T15:43:26.7011550Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-27T15:43:26.7011771Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-27T15:43:26.7012014Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-27T15:43:26.8606701Z 
2026-08-27T15:43:26.8607459Z > Task :caixaui:spec
2026-08-27T15:43:26.8607716Z WARNING: We recommend using a newer Android Gradle plugin to use compileSdk = 35
2026-08-27T15:43:26.8607874Z 
2026-08-27T15:43:26.8608094Z This Android Gradle plugin (8.1.1) was tested up to compileSdk = 34.
2026-08-27T15:43:26.8608235Z 
2026-08-27T15:43:26.8608439Z You are strongly encouraged to update your project to use a newer
2026-08-27T15:43:26.8608669Z Android Gradle plugin that has been tested with compileSdk = 35.
2026-08-27T15:43:26.8608801Z 
2026-08-27T15:43:26.8609007Z If you are already using the latest version of the Android Gradle plugin,
2026-08-27T15:43:26.8609263Z you may need to wait until a newer version with support for compileSdk = 35 is available.
2026-08-27T15:43:26.8609404Z 
2026-08-27T15:43:26.8609593Z To suppress this warning, add/update
2026-08-27T15:43:26.8609969Z     android.suppressUnsupportedCompileSdk=36,35
2026-08-27T15:43:26.8610331Z to this project's gradle.properties.
2026-08-27T15:43:27.0649837Z 
2026-08-27T15:43:27.0650440Z > Task :core:spec
2026-08-27T15:43:27.0650868Z > Task :dto:spec
2026-08-27T15:43:27.2599611Z > Task :payer:spec
2026-08-27T15:43:27.5605808Z 
2026-08-27T15:43:27.5606599Z > Task :pix:spec
2026-08-27T15:43:27.5607119Z Can't resolve artifacts for implementationDependenciesMetadata configuration. Artifacts are ignored.
2026-08-27T15:43:27.5607668Z org.gradle.internal.exceptions.DefaultMultiCauseException: Could not resolve all files for configuration ':pix:implementationDependenciesMetadata'.
2026-08-27T15:43:27.5608007Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.mapFailure(DefaultConfiguration.java:1716)
2026-08-27T15:43:27.5608322Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$3400(DefaultConfiguration.java:177)
2026-08-27T15:43:27.5608642Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$DefaultResolutionHost.mapFailure(DefaultConfiguration.java:2443)
2026-08-27T15:43:27.5608958Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionHost.rethrowFailure(ResolutionHost.java:30)
2026-08-27T15:43:27.5609293Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:74)
2026-08-27T15:43:27.5609606Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-27T15:43:27.5610045Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-27T15:43:27.5610342Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-27T15:43:27.5610617Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-27T15:43:27.5610896Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-27T15:43:27.5611203Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-27T15:43:27.5611723Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-27T15:43:27.5612028Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-27T15:43:27.5612303Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-27T15:43:27.5612577Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-27T15:43:27.5612879Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-27T15:43:27.5613154Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-27T15:43:27.5613406Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-27T15:43:27.5614004Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-27T15:43:27.5614305Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-27T15:43:27.5614614Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-27T15:43:27.5614884Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-27T15:43:27.5615184Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-27T15:43:27.5615468Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-27T15:43:27.5615775Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:27.5616052Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:27.5616349Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:27.5616712Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:27.5617007Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-27T15:43:27.5617302Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-27T15:43:27.5617579Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-27T15:43:27.5617869Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-27T15:43:27.5618150Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-27T15:43:27.5618443Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-27T15:43:27.5618703Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-27T15:43:27.5618982Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-27T15:43:27.5619316Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-27T15:43:27.5619584Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-27T15:43:27.5619939Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T15:43:27.5620285Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T15:43:27.5620592Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:27.5620885Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:27.5621164Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:27.5621513Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:27.5621794Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T15:43:27.5622091Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T15:43:27.5622355Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-27T15:43:27.5622628Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-27T15:43:27.5622898Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-27T15:43:27.5623206Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-27T15:43:27.5623481Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-27T15:43:27.5623773Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-27T15:43:27.5624034Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-27T15:43:27.5624307Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-27T15:43:27.5624654Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-27T15:43:27.5624977Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-27T15:43:27.5625291Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-27T15:43:27.5625601Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-27T15:43:27.5625928Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-27T15:43:27.5626226Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-27T15:43:27.5626500Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-27T15:43:27.5626856Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-27T15:43:27.5627117Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-27T15:43:27.5627379Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-27T15:43:27.5627636Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-27T15:43:27.5627906Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-27T15:43:27.5628185Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-27T15:43:27.5628477Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-27T15:43:27.5628740Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-27T15:43:27.5629022Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-27T15:43:27.5629287Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-27T15:43:27.5629575Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-27T15:43:27.5629893Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-27T15:43:27.5630164Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-27T15:43:27.5630430Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-27T15:43:27.5630762Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-27T15:43:27.5631029Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-27T15:43:27.5631367Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-27T15:43:27.5631681Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-27T15:43:27.5631990Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-27T15:43:27.5632261Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-27T15:43:27.5632543Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-27T15:43:27.5632797Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-27T15:43:27.5633092Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-27T15:43:27.5633387Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-27T15:43:27.5633692Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-27T15:43:27.5633962Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-27T15:43:27.5634240Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-27T15:43:27.5634521Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-27T15:43:27.5634841Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-27T15:43:27.5635191Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-27T15:43:27.5635521Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-27T15:43:27.5635810Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-27T15:43:27.5636108Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-27T15:43:27.5636609Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-27T15:43:27.5636980Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-27T15:43:27.5637296Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-27T15:43:27.5637696Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-27T15:43:27.5637981Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-27T15:43:27.5638255Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-27T15:43:27.5638514Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-27T15:43:27.5638780Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-27T15:43:27.5639039Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-27T15:43:27.5639316Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-27T15:43:27.5639615Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-27T15:43:27.5640080Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-27T15:43:27.5640389Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-27T15:43:27.5640707Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-27T15:43:27.5641022Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-27T15:43:27.5641321Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-27T15:43:27.5641615Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-27T15:43:27.5641916Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-27T15:43:27.5642222Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-27T15:43:27.5642518Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-27T15:43:27.5642855Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T15:43:27.5643187Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T15:43:27.5643494Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:27.5643791Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:27.5644067Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:27.5644402Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:27.5644690Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T15:43:27.5644972Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T15:43:27.5645260Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-27T15:43:27.5645541Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-27T15:43:27.5645840Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-27T15:43:27.5646158Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-27T15:43:27.5646484Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-27T15:43:27.5646812Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-27T15:43:27.5647122Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-27T15:43:27.5647404Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-27T15:43:27.5647689Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-27T15:43:27.5647959Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-27T15:43:27.5648240Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-27T15:43:27.5648524Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-27T15:43:27.5648827Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-27T15:43:27.5671542Z Cause 1: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :core.
2026-08-27T15:43:27.5671836Z Required by:
2026-08-27T15:43:27.5672020Z     project :pix
2026-08-27T15:43:27.5672622Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :core:
2026-08-27T15:43:27.5672999Z   - devApiElements
2026-08-27T15:43:27.5673232Z   - hmpApiElements
2026-08-27T15:43:27.5673444Z   - pilotoApiElements
2026-08-27T15:43:27.5673664Z   - producaoApiElements
2026-08-27T15:43:27.5673863Z All of them match the consumer attributes:
2026-08-27T15:43:27.5674212Z   - Variant 'devApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-27T15:43:27.5674494Z       - Unmatched attributes:
2026-08-27T15:43:27.5674831Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:27.5675204Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T15:43:27.5675582Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T15:43:27.5675912Z           - Doesn't say anything about its component category (required a library)
2026-08-27T15:43:27.5676222Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T15:43:27.5676576Z   - Variant 'hmpApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-27T15:43:27.5676945Z       - Unmatched attributes:
2026-08-27T15:43:27.5677279Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:27.5677656Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T15:43:27.5678121Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T15:43:27.5678452Z           - Doesn't say anything about its component category (required a library)
2026-08-27T15:43:27.5678763Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T15:43:27.5679126Z   - Variant 'pilotoApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-27T15:43:27.5679393Z       - Unmatched attributes:
2026-08-27T15:43:27.5679809Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:27.5680179Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T15:43:27.5680560Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T15:43:27.5680899Z           - Doesn't say anything about its component category (required a library)
2026-08-27T15:43:27.5681215Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T15:43:27.5681567Z   - Variant 'producaoApiElements' capability SIECO-Android:core:unspecified declares a component for use during compile-time:
2026-08-27T15:43:27.5681852Z       - Unmatched attributes:
2026-08-27T15:43:27.5682172Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:27.5682631Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T15:43:27.5683012Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T15:43:27.5683334Z           - Doesn't say anything about its component category (required a library)
2026-08-27T15:43:27.5683635Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T15:43:27.5683942Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-27T15:43:27.5684282Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-27T15:43:27.5684633Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-27T15:43:27.5684965Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-27T15:43:27.5685341Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-27T15:43:27.5685676Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-27T15:43:27.5686005Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-27T15:43:27.5686355Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-27T15:43:27.5686752Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-27T15:43:27.5687093Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-27T15:43:27.5687426Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-27T15:43:27.5687756Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-27T15:43:27.5688080Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-27T15:43:27.5688405Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-27T15:43:27.5688740Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-27T15:43:27.5689052Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-27T15:43:27.5689345Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-27T15:43:27.5689724Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T15:43:27.5690104Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T15:43:27.5690410Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:27.5690702Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:27.5691042Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:27.5691332Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:27.5691617Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T15:43:27.5691902Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T15:43:27.5692203Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-27T15:43:27.5692518Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-27T15:43:27.5692837Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-27T15:43:27.5693159Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-27T15:43:27.5693468Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-27T15:43:27.5693768Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-27T15:43:27.5694079Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-27T15:43:27.5694476Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-27T15:43:27.5694808Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-27T15:43:27.5695182Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-27T15:43:27.5695538Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-27T15:43:27.5695863Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-27T15:43:27.5696161Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-27T15:43:27.5696456Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-27T15:43:27.5696754Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-27T15:43:27.5697029Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-27T15:43:27.5697317Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-27T15:43:27.5697620Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-27T15:43:27.5697925Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-27T15:43:27.5698216Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-27T15:43:27.5698486Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-27T15:43:27.5698760Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-27T15:43:27.5699059Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-27T15:43:27.5699334Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-27T15:43:27.5699705Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-27T15:43:27.5700241Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-27T15:43:27.5700966Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-27T15:43:27.5701250Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-27T15:43:27.5701463Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-27T15:43:27.5701678Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-27T15:43:27.5701904Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-27T15:43:27.5702132Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:27.5702345Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:27.5702552Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:27.5702769Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:27.5702980Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-27T15:43:27.5703190Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-27T15:43:27.5703401Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-27T15:43:27.5703604Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-27T15:43:27.5703994Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-27T15:43:27.5704218Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-27T15:43:27.5704418Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-27T15:43:27.5704613Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-27T15:43:27.5704805Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-27T15:43:27.5704990Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-27T15:43:27.5705208Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T15:43:27.5705459Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T15:43:27.5705697Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:27.5705954Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:27.5706164Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:27.5706379Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:27.5706590Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T15:43:27.5706800Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T15:43:27.5706998Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-27T15:43:27.5707180Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-27T15:43:27.5707448Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-27T15:43:27.5707658Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-27T15:43:27.5707856Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-27T15:43:27.5708056Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-27T15:43:27.5708341Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-27T15:43:27.5708532Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-27T15:43:27.5708728Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-27T15:43:27.5708954Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-27T15:43:27.5709206Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-27T15:43:27.5709432Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-27T15:43:27.5709724Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-27T15:43:27.5710073Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-27T15:43:27.5710280Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-27T15:43:27.5710486Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-27T15:43:27.5710668Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-27T15:43:27.5710924Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-27T15:43:27.5711118Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-27T15:43:27.5711307Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-27T15:43:27.5711507Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-27T15:43:27.5711707Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-27T15:43:27.5711912Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-27T15:43:27.5712105Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-27T15:43:27.5712304Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-27T15:43:27.5712508Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-27T15:43:27.5712704Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-27T15:43:27.5712888Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-27T15:43:27.5713086Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-27T15:43:27.5713281Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-27T15:43:27.5713477Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-27T15:43:27.5713704Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-27T15:43:27.5713953Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-27T15:43:27.5714179Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-27T15:43:27.5714439Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-27T15:43:27.5714638Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-27T15:43:27.5714826Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-27T15:43:27.5715033Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-27T15:43:27.5715254Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-27T15:43:27.5715487Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-27T15:43:27.5715701Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-27T15:43:27.5715905Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-27T15:43:27.5716122Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-27T15:43:27.5716357Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-27T15:43:27.5716595Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-27T15:43:27.5716831Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-27T15:43:27.5717056Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-27T15:43:27.5717274Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-27T15:43:27.5717532Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-27T15:43:27.5717748Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-27T15:43:27.5717958Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-27T15:43:27.5718206Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-27T15:43:27.5718421Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-27T15:43:27.5718618Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-27T15:43:27.5718809Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-27T15:43:27.5718995Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-27T15:43:27.5719179Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-27T15:43:27.5719369Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-27T15:43:27.5719593Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-27T15:43:27.5719891Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-27T15:43:27.5720121Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-27T15:43:27.5720357Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-27T15:43:27.5720590Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-27T15:43:27.5720810Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-27T15:43:27.5721086Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-27T15:43:27.5721308Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-27T15:43:27.5721531Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-27T15:43:27.5721804Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-27T15:43:27.5722040Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T15:43:27.5722287Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T15:43:27.5722513Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:27.5722729Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:27.5722936Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:27.5723145Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:27.5723348Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T15:43:27.5723551Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T15:43:27.5723758Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-27T15:43:27.5723955Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-27T15:43:27.5724231Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-27T15:43:27.5724483Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-27T15:43:27.5724732Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-27T15:43:27.5724985Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-27T15:43:27.5725221Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-27T15:43:27.5725428Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-27T15:43:27.5725642Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-27T15:43:27.5725864Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-27T15:43:27.5726072Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-27T15:43:27.5726283Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-27T15:43:27.5726462Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-27T15:43:27.5726640Z Cause 2: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :dto.
2026-08-27T15:43:27.5726785Z Required by:
2026-08-27T15:43:27.5726888Z     project :pix
2026-08-27T15:43:27.5727420Z Caused by: org.gradle.internal.component.AmbiguousConfigurationSelectionException: The consumer was configured to find a library for use during 'kotlin-metadata', as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common'. However we cannot choose between the following variants of project :dto:
2026-08-27T15:43:27.5727870Z   - devApiElements
2026-08-27T15:43:27.5728006Z   - hmpApiElements
2026-08-27T15:43:27.5728162Z   - pilotoApiElements
2026-08-27T15:43:27.5728373Z   - producaoApiElements
2026-08-27T15:43:27.5728511Z All of them match the consumer attributes:
2026-08-27T15:43:27.5728771Z   - Variant 'devApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-27T15:43:27.5728970Z       - Unmatched attributes:
2026-08-27T15:43:27.5729223Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:27.5729520Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T15:43:27.5729887Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'dev' but the consumer didn't ask for it
2026-08-27T15:43:27.5730138Z           - Doesn't say anything about its component category (required a library)
2026-08-27T15:43:27.5730369Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T15:43:27.5730640Z   - Variant 'hmpApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-27T15:43:27.5730850Z       - Unmatched attributes:
2026-08-27T15:43:27.5731181Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:27.5731548Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T15:43:27.5731849Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'hmp' but the consumer didn't ask for it
2026-08-27T15:43:27.5732086Z           - Doesn't say anything about its component category (required a library)
2026-08-27T15:43:27.5732384Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T15:43:27.5732653Z   - Variant 'pilotoApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-27T15:43:27.5732835Z       - Unmatched attributes:
2026-08-27T15:43:27.5733073Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:27.5733355Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T15:43:27.5733642Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'piloto' but the consumer didn't ask for it
2026-08-27T15:43:27.5733884Z           - Doesn't say anything about its component category (required a library)
2026-08-27T15:43:27.5734105Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T15:43:27.5734378Z   - Variant 'producaoApiElements' capability SIECO-Android:dto:unspecified declares a component for use during compile-time:
2026-08-27T15:43:27.5734570Z       - Unmatched attributes:
2026-08-27T15:43:27.5734813Z           - Provides attribute 'com.android.build.api.attributes.AgpVersionAttr' with value '8.1.1' but the consumer didn't ask for it
2026-08-27T15:43:27.5735097Z           - Provides attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T15:43:27.5735387Z           - Provides attribute 'com.android.build.gradle.internal.attributes.VariantAttr' with value 'producao' but the consumer didn't ask for it
2026-08-27T15:43:27.5735622Z           - Doesn't say anything about its component category (required a library)
2026-08-27T15:43:27.5735840Z           - Doesn't say anything about org.jetbrains.kotlin.platform.type (required 'common')
2026-08-27T15:43:27.5736055Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:106)
2026-08-27T15:43:27.5736478Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:109)
2026-08-27T15:43:27.5736867Z 	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectVariantsUsingAttributeMatching(AttributeConfigurationSelector.java:51)
2026-08-27T15:43:27.5737122Z 	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectVariants(LocalComponentDependencyMetadata.java:149)
2026-08-27T15:43:27.5737368Z 	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectVariants(DslOriginDependencyMetadataWrapper.java:71)
2026-08-27T15:43:27.5737621Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:267)
2026-08-27T15:43:27.5737881Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:152)
2026-08-27T15:43:27.5738149Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:366)
2026-08-27T15:43:27.5738422Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:249)
2026-08-27T15:43:27.5738678Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:186)
2026-08-27T15:43:27.5738933Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:146)
2026-08-27T15:43:27.5739185Z 	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:142)
2026-08-27T15:43:27.5739496Z 	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveGraph(DefaultConfigurationResolver.java:195)
2026-08-27T15:43:27.5739819Z 	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveGraph(ShortCircuitEmptyConfigurationResolver.java:85)
2026-08-27T15:43:27.5740082Z 	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveGraph(ErrorHandlingConfigurationResolver.java:76)
2026-08-27T15:43:27.5740318Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:720)
2026-08-27T15:43:27.5740532Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$1.call(DefaultConfiguration.java:711)
2026-08-27T15:43:27.5740768Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T15:43:27.5741026Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T15:43:27.5741322Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:27.5741635Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:27.5741963Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:27.5742358Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:27.5742746Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T15:43:27.5743054Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T15:43:27.5743407Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphIfRequired(DefaultConfiguration.java:711)
2026-08-27T15:43:27.5743760Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveExclusively$4(DefaultConfiguration.java:691)
2026-08-27T15:43:27.5744006Z 	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:493)
2026-08-27T15:43:27.5744246Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveExclusively(DefaultConfiguration.java:688)
2026-08-27T15:43:27.5744482Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveToStateOrLater(DefaultConfiguration.java:675)
2026-08-27T15:43:27.5744718Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:177)
2026-08-27T15:43:27.5744954Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1661)
2026-08-27T15:43:27.5745211Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$VisitedArtifactsSetProvider.getValue(DefaultConfiguration.java:1650)
2026-08-27T15:43:27.5745464Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1697)
2026-08-27T15:43:27.5745713Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getValue(DefaultConfiguration.java:1666)
2026-08-27T15:43:27.5745965Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.getSelectedArtifacts(ResolutionBackedFileCollection.java:85)
2026-08-27T15:43:27.5746212Z 	at org.gradle.api.internal.artifacts.configurations.ResolutionBackedFileCollection.visitContents(ResolutionBackedFileCollection.java:72)
2026-08-27T15:43:27.5746427Z 	at org.gradle.api.internal.file.AbstractFileCollection.visitStructure(AbstractFileCollection.java:366)
2026-08-27T15:43:27.5746705Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.visitContents(DefaultConfiguration.java:569)
2026-08-27T15:43:27.5746930Z 	at org.gradle.api.internal.file.AbstractFileCollection.getFiles(AbstractFileCollection.java:130)
2026-08-27T15:43:27.5747126Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration_Decorated.getFiles(Unknown Source)
2026-08-27T15:43:27.5747327Z 	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolve(DefaultConfiguration.java:559)
2026-08-27T15:43:27.5747554Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.resolveDependencies(AbstractProjectHandler.java:100)
2026-08-27T15:43:27.5747777Z 	at com.fortify.cloud.plugins.gradle.handlers.AbstractProjectHandler.collect(AbstractProjectHandler.java:82)
2026-08-27T15:43:27.5747993Z 	at com.fortify.cloud.plugins.gradle.CollectProjectInfoTask.collect(CollectProjectInfoTask.java:73)
2026-08-27T15:43:27.5748182Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-27T15:43:27.5748385Z 	at java.base@17.0.7/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-27T15:43:27.5748609Z 	at java.base@17.0.7/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-27T15:43:27.5748810Z 	at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-27T15:43:27.5748980Z 	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:125)
2026-08-27T15:43:27.5749235Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:58)
2026-08-27T15:43:27.5749563Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:51)
2026-08-27T15:43:27.5749974Z 	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:29)
2026-08-27T15:43:27.5750245Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$3.run(TaskExecution.java:242)
2026-08-27T15:43:27.5750461Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
2026-08-27T15:43:27.5750725Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
2026-08-27T15:43:27.5750940Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:27.5751149Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:27.5751360Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:27.5751576Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:27.5751854Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
2026-08-27T15:43:27.5752070Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
2026-08-27T15:43:27.5752279Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeAction(TaskExecution.java:227)
2026-08-27T15:43:27.5752486Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeActions(TaskExecution.java:210)
2026-08-27T15:43:27.5752698Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.executeWithPreviousOutputFiles(TaskExecution.java:193)
2026-08-27T15:43:27.5752906Z 	at org.gradle.api.internal.tasks.execution.TaskExecution.execute(TaskExecution.java:166)
2026-08-27T15:43:27.5753100Z 	at org.gradle.internal.execution.steps.ExecuteStep.executeInternal(ExecuteStep.java:105)
2026-08-27T15:43:27.5753310Z 	at org.gradle.internal.execution.steps.ExecuteStep.access$000(ExecuteStep.java:44)
2026-08-27T15:43:27.5753598Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:59)
2026-08-27T15:43:27.5753878Z 	at org.gradle.internal.execution.steps.ExecuteStep$1.call(ExecuteStep.java:56)
2026-08-27T15:43:27.5754236Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T15:43:27.5754494Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T15:43:27.5754731Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:27.5754938Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:27.5755150Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:27.5755366Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:27.5755581Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T15:43:27.5755802Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T15:43:27.5756006Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:56)
2026-08-27T15:43:27.5756192Z 	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:44)
2026-08-27T15:43:27.5756395Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:67)
2026-08-27T15:43:27.5756614Z 	at org.gradle.internal.execution.steps.RemovePreviousOutputsStep.execute(RemovePreviousOutputsStep.java:37)
2026-08-27T15:43:27.5756822Z 	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:41)
2026-08-27T15:43:27.5757029Z 	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:74)
2026-08-27T15:43:27.5757229Z 	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:55)
2026-08-27T15:43:27.5757426Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:50)
2026-08-27T15:43:27.5757679Z 	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:28)
2026-08-27T15:43:27.5757909Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.executeDelegateBroadcastingChanges(CaptureStateAfterExecutionStep.java:100)
2026-08-27T15:43:27.5758157Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:72)
2026-08-27T15:43:27.5758380Z 	at org.gradle.internal.execution.steps.CaptureStateAfterExecutionStep.execute(CaptureStateAfterExecutionStep.java:50)
2026-08-27T15:43:27.5758598Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:40)
2026-08-27T15:43:27.5758800Z 	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:29)
2026-08-27T15:43:27.5759008Z 	at org.gradle.internal.execution.steps.BuildCacheStep.executeWithoutCache(BuildCacheStep.java:166)
2026-08-27T15:43:27.5759282Z 	at org.gradle.internal.execution.steps.BuildCacheStep.lambda$execute$1(BuildCacheStep.java:70)
2026-08-27T15:43:27.5759463Z 	at org.gradle.internal.Either$Right.fold(Either.java:175)
2026-08-27T15:43:27.5759695Z 	at org.gradle.internal.execution.caching.CachingState.fold(CachingState.java:59)
2026-08-27T15:43:27.5759899Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:68)
2026-08-27T15:43:27.5760088Z 	at org.gradle.internal.execution.steps.BuildCacheStep.execute(BuildCacheStep.java:46)
2026-08-27T15:43:27.5760288Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:36)
2026-08-27T15:43:27.5760498Z 	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:25)
2026-08-27T15:43:27.5760703Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:36)
2026-08-27T15:43:27.5760952Z 	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:22)
2026-08-27T15:43:27.5761157Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:91)
2026-08-27T15:43:27.5761357Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$2(SkipUpToDateStep.java:55)
2026-08-27T15:43:27.5761549Z 	at java.base@17.0.7/java.util.Optional.orElseGet(Optional.java:364)
2026-08-27T15:43:27.5761737Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
2026-08-27T15:43:27.5761925Z 	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:37)
2026-08-27T15:43:27.5762122Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:65)
2026-08-27T15:43:27.5762320Z 	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:36)
2026-08-27T15:43:27.5762546Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:37)
2026-08-27T15:43:27.5762791Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:27)
2026-08-27T15:43:27.5763018Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:76)
2026-08-27T15:43:27.5763224Z 	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:37)
2026-08-27T15:43:27.5763419Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:94)
2026-08-27T15:43:27.5763604Z 	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:49)
2026-08-27T15:43:27.5763811Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:71)
2026-08-27T15:43:27.5764042Z 	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:45)
2026-08-27T15:43:27.5764328Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.executeWithNonEmptySources(SkipEmptyWorkStep.java:177)
2026-08-27T15:43:27.5764538Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:81)
2026-08-27T15:43:27.5764733Z 	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:53)
2026-08-27T15:43:27.5764950Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:32)
2026-08-27T15:43:27.5765190Z 	at org.gradle.internal.execution.steps.RemoveUntrackedExecutionStateStep.execute(RemoveUntrackedExecutionStateStep.java:21)
2026-08-27T15:43:27.5765429Z 	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:38)
2026-08-27T15:43:27.5765666Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:36)
2026-08-27T15:43:27.5765896Z 	at org.gradle.internal.execution.steps.LoadPreviousExecutionStateStep.execute(LoadPreviousExecutionStateStep.java:23)
2026-08-27T15:43:27.5766106Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:75)
2026-08-27T15:43:27.5766317Z 	at org.gradle.internal.execution.steps.CleanupStaleOutputsStep.execute(CleanupStaleOutputsStep.java:41)
2026-08-27T15:43:27.5766529Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.lambda$execute$0(AssignWorkspaceStep.java:32)
2026-08-27T15:43:27.5766745Z 	at org.gradle.api.internal.tasks.execution.TaskExecution$4.withWorkspace(TaskExecution.java:287)
2026-08-27T15:43:27.5766952Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:30)
2026-08-27T15:43:27.5767153Z 	at org.gradle.internal.execution.steps.AssignWorkspaceStep.execute(AssignWorkspaceStep.java:21)
2026-08-27T15:43:27.5767348Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:37)
2026-08-27T15:43:27.5767709Z 	at org.gradle.internal.execution.steps.IdentityCacheStep.execute(IdentityCacheStep.java:27)
2026-08-27T15:43:27.5767910Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:47)
2026-08-27T15:43:27.5768095Z 	at org.gradle.internal.execution.steps.IdentifyStep.execute(IdentifyStep.java:34)
2026-08-27T15:43:27.5768295Z 	at org.gradle.internal.execution.impl.DefaultExecutionEngine$1.execute(DefaultExecutionEngine.java:64)
2026-08-27T15:43:27.5768520Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:146)
2026-08-27T15:43:27.5768754Z 	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:135)
2026-08-27T15:43:27.5769045Z 	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
2026-08-27T15:43:27.5769362Z 	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:51)
2026-08-27T15:43:27.5769601Z 	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
2026-08-27T15:43:27.5769899Z 	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:74)
2026-08-27T15:43:27.5770118Z 	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
2026-08-27T15:43:27.5770346Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
2026-08-27T15:43:27.5770560Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
2026-08-27T15:43:27.5770782Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
2026-08-27T15:43:27.5771026Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
2026-08-27T15:43:27.5771347Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
2026-08-27T15:43:27.5771587Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
2026-08-27T15:43:27.5771806Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:27.5772026Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
2026-08-27T15:43:27.5772245Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
2026-08-27T15:43:27.5772459Z 	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
2026-08-27T15:43:27.5772669Z 	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
2026-08-27T15:43:27.5772892Z 	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
2026-08-27T15:43:27.5773102Z 	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:42)
2026-08-27T15:43:27.5773331Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:337)
2026-08-27T15:43:27.5773583Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:324)
2026-08-27T15:43:27.5773827Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:317)
2026-08-27T15:43:27.5774080Z 	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:303)
2026-08-27T15:43:27.5774365Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:463)
2026-08-27T15:43:27.5774577Z 	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:380)
2026-08-27T15:43:27.5774787Z 	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
2026-08-27T15:43:27.5774993Z 	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
2026-08-27T15:43:27.5775188Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-27T15:43:27.5775400Z 	at java.base@17.0.7/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-27T15:43:27.5775581Z 	at java.base@17.0.7/java.lang.Thread.run(Thread.java:833)
2026-08-27T15:43:27.6610450Z 
2026-08-27T15:43:27.6611263Z > Task :ticket:spec
2026-08-27T15:43:27.7170244Z 
2026-08-27T15:43:27.7171756Z Deprecated Gradle features were used in this build, making it incompatible with Gradle 9.0.
2026-08-27T15:43:27.7172241Z 
2026-08-27T15:43:27.7172783Z You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.
2026-08-27T15:43:27.7173029Z 
2026-08-27T15:43:27.7173423Z See https://docs.gradle.org/8.1/userguide/command_line_interface.html#sec:command_line_warnings
2026-08-27T15:43:27.7175415Z 
2026-08-27T15:43:27.7175687Z BUILD SUCCESSFUL in 14s
2026-08-27T15:43:27.7176368Z 8 actionable tasks: 8 executed
2026-08-27T15:43:28.3600714Z Packaging project...
2026-08-27T15:43:36.3320578Z Compressing job files...
2026-08-27T15:43:41.3908247Z Uploading job...
2026-08-27T15:43:45.8637906Z ErrorResponse: Failed to access application version: sieco-android-1.4.8. Access denied. Unauthorized.
2026-08-27T15:43:45.8638199Z Uploading of job to Controller failed with error
2026-08-27T15:43:45.8638449Z ErrorResponse: Failed to access application version: sieco-android-1.4.8. Access denied. Unauthorized.
2026-08-27T15:43:45.8638633Z Shutting down with errors. Please see log for details.
2026-08-27T15:43:45.9564689Z ##[debug]Exit code 1 received from tool '/bin/bash'
2026-08-27T15:43:45.9566613Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-08-27T15:43:45.9573663Z ##[error]Bash exited with code '1'.
2026-08-27T15:43:45.9574316Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '1'.
2026-08-27T15:43:45.9586872Z ##[debug]task result: Failed
2026-08-27T15:43:45.9601378Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-08-27T15:43:45.9602939Z ##[section]Finishing: Iniciando Análise no Fortify

