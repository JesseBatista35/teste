
Qual o tipo de serviço?*:	Ajustar ambiente ou parametrização de software
Informar o Ambiente:*:	DES
Nome do serviço ou sistema:*:	SIECO-Android-ORIGINAL

<https://devops.caixa/projetos/Caixa/_release?_a=releases&view=mine&definitionId=486>
Janela de atendimento:*:	27/08/2026 11:20:00
Prazo final da janela de atendimento:*:	27/08/2026 11:20:00
Haverá previsão de indisponibilidade durante a execução do serviço:*:	Não
Contato do responsável pela validação do ambiente após alteração:*:	Teams
Descrição da solicitação:*:	Prezados(as),

Solicitamos correção do erro de Fortify apresentado recentemente, conforme release <https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=518961&environmentId=2409591>

Agradeço desde já.
Informar formas de contato:*:	Teams


log do step


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
