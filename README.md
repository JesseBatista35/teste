À 
Esteira DES TQS,
 
Segue demanda para avaliação e tratamento por se tratar de atendimento a esteira mobile, conforme analista.
 
Atenciosamente,
André Hebert dos Santos
Preposto
CTIS/CESTI/ESTEIRA - APLICAÇÃO/DEVOPS



eles devolveram falar que e com agente com oque vamos descobrir esse firebase


mkdir -p /opt/temp/$(nameApp)/app-$(versionApp).$(versionBuild)
cd /opt/temp/$(nameApp)/app-$(versionApp).$(versionBuild)
wget $(NexusUrl)br/gov/caixa/$(nameAppNexus)/$(nameApp)/$(versionApp)-$(typeApp).$(versionBuild)/$(nameApp)-$(versionApp)-$(typeApp).$(versionBuild).$(extApp)

xport App=$(nameApp)-$(versionApp)-$(typeApp).$(versionBuild).$(extApp)

cd /opt/temp/$(nameApp)/app-$(versionApp).$(versionBuild)

firebase appdistribution:distribute ${App} \
--app $(FIREBASE_ID_APP) \
--groups "$(FIREBASE_GROUPS)" \
--release-notes "$(FIREBASE_NOTES)"  \
--token $(FIREBASE_TOKEN)



2026-08-10T19:03:06.5132767Z ##[section]Starting: Android - Firebase Distribution App
2026-08-10T19:03:06.5135042Z ==============================================================================
2026-08-10T19:03:06.5135103Z Task         : Bash
2026-08-10T19:03:06.5135147Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-10T19:03:06.5135191Z Version      : 3.227.0
2026-08-10T19:03:06.5135239Z Author       : Microsoft Corporation
2026-08-10T19:03:06.5135288Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-10T19:03:06.5135353Z ==============================================================================
2026-08-10T19:03:06.6232908Z Generating script.
2026-08-10T19:03:06.6249875Z ========================== Starting Command Output ===========================
2026-08-10T19:03:06.6251566Z [command]/bin/bash /opt/ferramentas/agent-tfs/agent-mobile-linux-proxy-1/_work/_temp/47a8e869-240b-43ec-8668-6e172a8087dd.sh
2026-08-10T19:03:11.1098865Z [1m[36mi [39m[22m uploading distribution...
2026-08-10T19:03:27.6257217Z 
2026-08-10T19:03:27.6258553Z [1m[31mError:[39m[22m failed to upload distribution. HTTP Error: 500, Unknown Error
2026-08-10T19:03:27.8963938Z ##[error]Bash exited with code '1'.
2026-08-10T19:03:27.8974166Z ##[section]Finishing: Android - Firebase Distribution App




Skip to main content
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIMSC-Android-Nativo
/
SIMSC-Android-Nativo 7.1.2 | ID 512232 | Code 202614040
Search








SIMSC-Android-Nativo

SIMSC-Android-Nativo 7.1.2 | ID 512232 | Code 202614040


TQS - Firebase

Failed


Pipeline

Tasks

Variables

Logs

Tests
Predefined variables
Filter by keywords
Release (+1)


AdapterGroupId
$(PackageId)
build.tools
30.0.3
BuildGradle
gradle clean assemble$(typeApp) lint$(typeApp) -PversionApp=$(versionApp) -PversionCode=${CodeNew} -PminimoSDK=23
BuildGradleSdkMinor
gradle clean assemble$(typeApp)Release  -PversionApp=$(versionApp) -PversionCode=${CodeNew} -PminimoSDK=23
FIREBASE_ID_APP
1:840974012579:android:a99bcb3f459370366a6f16
FIREBASE_NOTES
NATIVO-$(versionApp)-$(typeApp).$(versionBuild)
FORTIFY_BUILD
assemble$(typeApp)
GradleVersion
8.11.1
JavaVersion
17.0.7
nameApp
simsc
nameAppNexus
saudecaixamobile
system.debug
false
versionApp
7.1.2
versionBuild
$(RELEASE.RELEASEID)
versionCode
202614039
Row 2

Row 2

Row 2

Showing filters 1 through 2


