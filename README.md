2026-06-25T19:08:09.6026805Z ##[section]Starting: Build Gradle
2026-06-25T19:08:09.6030809Z ==============================================================================
2026-06-25T19:08:09.6030908Z Task         : Bash
2026-06-25T19:08:09.6030961Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-25T19:08:09.6031042Z Version      : 3.227.0
2026-06-25T19:08:09.6031094Z Author       : Microsoft Corporation
2026-06-25T19:08:09.6031164Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-25T19:08:09.6031242Z ==============================================================================
2026-06-25T19:08:09.6727063Z Warning: Ignoring extra certs from `/etc/pki/ca-trust/source/anchors/AC-V4.cer`, load failed: error:02001002:system library:fopen:No such file or directory
2026-06-25T19:08:09.7532308Z Generating script.
2026-06-25T19:08:09.7535175Z ========================== Starting Command Output ===========================
2026-06-25T19:08:09.7542911Z [command]/bin/bash /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp/405ff6c4-5389-41bd-84a5-4bd8285d81a6.sh
2026-06-25T19:08:10.3630934Z Starting a Gradle Daemon, 15 busy and 8 incompatible and 3 stopped Daemons could not be reused, use --status for details
2026-06-25T19:08:17.0682703Z 
2026-06-25T19:08:17.0753954Z > Configure project :app
2026-06-25T19:08:17.0796120Z WARNING: The option setting 'android.defaults.buildfeatures.buildconfig=true' is deprecated.
2026-06-25T19:08:17.0819661Z The current default is 'false'.
2026-06-25T19:08:17.0819852Z It will be removed in version 9.0 of the Android Gradle plugin.
2026-06-25T19:08:17.0820114Z To keep using this feature, add the following to your module-level build.gradle files:
2026-06-25T19:08:17.0820595Z     android.buildFeatures.buildConfig = true
2026-06-25T19:08:17.0820769Z or from Android Studio, click: `Refactor` > `Migrate BuildConfig to Gradle Build Files`.
2026-06-25T19:08:20.1641286Z WARNING: We recommend using a newer Android Gradle plugin to use compileSdk = 36
2026-06-25T19:08:20.1641884Z 
2026-06-25T19:08:20.1642252Z This Android Gradle plugin (8.6.0) was tested up to compileSdk = 35.
2026-06-25T19:08:20.1642479Z 
2026-06-25T19:08:20.1642914Z You are strongly encouraged to update your project to use a newer
2026-06-25T19:08:20.1643234Z Android Gradle plugin that has been tested with compileSdk = 36.
2026-06-25T19:08:20.1643454Z 
2026-06-25T19:08:20.1643745Z If you are already using the latest version of the Android Gradle plugin,
2026-06-25T19:08:20.1644033Z you may need to wait until a newer version with support for compileSdk = 36 is available.
2026-06-25T19:08:20.1644199Z 
2026-06-25T19:08:20.1644467Z For more information refer to the compatibility table:
2026-06-25T19:08:20.1645037Z https://d.android.com/r/tools/api-level-support
2026-06-25T19:08:20.1647648Z 
2026-06-25T19:08:20.1647927Z To suppress this warning, add/update
2026-06-25T19:08:20.1648216Z     android.suppressUnsupportedCompileSdk=36
2026-06-25T19:08:20.1648532Z to this project's gradle.properties.
2026-06-25T19:08:20.5610878Z 
2026-06-25T19:08:20.5640979Z > Task :app:clean UP-TO-DATE
2026-06-25T19:08:20.6627023Z > Task :core:clean UP-TO-DATE
2026-06-25T19:08:20.6642524Z > Task :design-system:clean UP-TO-DATE
2026-06-25T19:08:20.6643077Z > Task :app:preBuild UP-TO-DATE
2026-06-25T19:08:20.6643537Z > Task :app:preDevBuild UP-TO-DATE
2026-06-25T19:08:20.6643935Z > Task :app:mergeDevNativeDebugMetadata NO-SOURCE
2026-06-25T19:08:20.6644269Z > Task :app:checkKotlinGradlePluginConfigurationErrors SKIPPED
2026-06-25T19:08:21.6597333Z > Task :app:generateDevResValues
2026-06-25T19:08:21.6597894Z > Task :app:dataBindingMergeDependencyArtifactsDev
2026-06-25T19:08:22.8599956Z > Task :app:generateDevResources
2026-06-25T19:08:22.8600745Z > Task :app:injectCrashlyticsMappingFileIdDev
2026-06-25T19:08:22.9597092Z > Task :app:injectCrashlyticsVersionControlInfoDev
2026-06-25T19:08:22.9600972Z > Task :app:processDevGoogleServices
2026-06-25T19:08:22.9602053Z > Task :core:preBuild UP-TO-DATE
2026-06-25T19:08:22.9602303Z > Task :core:preDevBuild UP-TO-DATE
2026-06-25T19:08:22.9605528Z > Task :core:generateDevResValues
2026-06-25T19:08:22.9605867Z > Task :core:generateDevResources
2026-06-25T19:08:23.0599277Z > Task :core:packageDevResources
2026-06-25T19:08:23.0600063Z > Task :design-system:preBuild UP-TO-DATE
2026-06-25T19:08:23.0601108Z > Task :design-system:preDevBuild UP-TO-DATE
2026-06-25T19:08:23.0601576Z > Task :design-system:generateDevResValues
2026-06-25T19:08:23.2608907Z > Task :design-system:generateDevResources
2026-06-25T19:08:23.7598917Z > Task :design-system:packageDevResources
2026-06-25T19:08:32.4598121Z > Task :app:packageDevResources
2026-06-25T19:08:32.6602725Z > Task :core:parseDevLocalResources
2026-06-25T19:08:32.7597568Z > Task :app:parseDevLocalResources
2026-06-25T19:08:33.3599596Z > Task :app:mergeDevResources
2026-06-25T19:08:33.3600671Z > Task :design-system:dataBindingMergeDependencyArtifactsDev
2026-06-25T19:08:33.3601000Z > Task :app:dataBindingTriggerDev
2026-06-25T19:08:33.3601315Z > Task :design-system:parseDevLocalResources
2026-06-25T19:08:33.3601572Z > Task :app:generateDevBuildConfig
2026-06-25T19:08:33.3601908Z > Task :core:generateDevRFile
2026-06-25T19:08:33.4618590Z > Task :design-system:generateDevRFile
2026-06-25T19:08:33.7613114Z > Task :design-system:dataBindingGenBaseClassesDev
2026-06-25T19:08:34.8624080Z > Task :app:dataBindingGenBaseClassesDev
2026-06-25T19:08:35.2619818Z > Task :app:generateSafeArgsDev
2026-06-25T19:08:35.2672629Z > Task :core:writeDevAarMetadata
2026-06-25T19:08:35.2673425Z > Task :design-system:writeDevAarMetadata
2026-06-25T19:08:35.2673736Z > Task :app:mapDevSourceSetPaths
2026-06-25T19:08:35.3603671Z > Task :app:createDevCompatibleScreenManifests
2026-06-25T19:08:35.3604044Z > Task :app:checkDevAarMetadata
2026-06-25T19:08:35.3604627Z > Task :app:extractDeepLinksDev
2026-06-25T19:08:35.4661466Z > Task :core:extractDeepLinksDev
2026-06-25T19:08:35.4662076Z > Task :design-system:extractDeepLinksDev
2026-06-25T19:08:35.4662325Z > Task :core:compileDevLibraryResources
2026-06-25T19:08:35.4662590Z > Task :core:checkKotlinGradlePluginConfigurationErrors SKIPPED
2026-06-25T19:08:35.5598586Z > Task :core:generateDevBuildConfig
2026-06-25T19:08:35.5598926Z > Task :core:generateSafeArgsDev
2026-06-25T19:08:35.5599349Z > Task :design-system:processDevManifest
2026-06-25T19:08:35.5599582Z > Task :core:processDevManifest
2026-06-25T19:08:35.7598156Z > Task :design-system:compileDevLibraryResources
2026-06-25T19:08:36.8598001Z > Task :app:processDevMainManifest
2026-06-25T19:08:36.9648921Z > Task :app:processDevManifest
2026-06-25T19:08:37.0617627Z > Task :app:processDevManifestForPackage
2026-06-25T19:08:37.3638038Z > Task :design-system:checkKotlinGradlePluginConfigurationErrors SKIPPED
2026-06-25T19:08:37.3638905Z > Task :design-system:generateDevBuildConfig
2026-06-25T19:08:37.3639319Z > Task :core:javaPreCompileDev
2026-06-25T19:08:37.3639802Z > Task :design-system:generateSafeArgsDev
2026-06-25T19:08:37.4660369Z > Task :design-system:javaPreCompileDev
2026-06-25T19:08:37.5631287Z > Task :app:javaPreCompileDev
2026-06-25T19:08:37.6598512Z > Task :app:mergeDevShaders
2026-06-25T19:08:37.6599219Z > Task :app:compileDevShaders NO-SOURCE
2026-06-25T19:08:37.6599613Z > Task :app:generateDevAssets UP-TO-DATE
2026-06-25T19:08:37.7622764Z > Task :core:mergeDevShaders
2026-06-25T19:08:37.7713154Z > Task :core:compileDevShaders NO-SOURCE
2026-06-25T19:08:37.7713864Z > Task :core:generateDevAssets UP-TO-DATE
2026-06-25T19:08:37.7714511Z > Task :core:packageDevAssets
2026-06-25T19:08:37.7714839Z > Task :design-system:mergeDevShaders
2026-06-25T19:08:37.7715054Z > Task :design-system:compileDevShaders NO-SOURCE
2026-06-25T19:08:37.7715295Z > Task :design-system:generateDevAssets UP-TO-DATE
2026-06-25T19:08:37.7715496Z > Task :design-system:packageDevAssets
2026-06-25T19:08:38.1623003Z > Task :app:mergeDevAssets
2026-06-25T19:08:38.1623564Z > Task :app:desugarDevFileDependencies
2026-06-25T19:08:38.4627134Z > Task :app:compressDevAssets
2026-06-25T19:08:38.7651900Z > Task :app:mergeDevJniLibFolders
2026-06-25T19:08:38.7695190Z > Task :core:mergeDevJniLibFolders
2026-06-25T19:08:38.7769620Z > Task :core:mergeDevNativeLibs NO-SOURCE
2026-06-25T19:08:38.7770066Z > Task :app:checkDevDuplicateClasses
2026-06-25T19:08:38.7770392Z > Task :core:copyDevJniLibsProjectOnly
2026-06-25T19:08:38.7770737Z > Task :app:processDevResources
2026-06-25T19:08:39.7678549Z > Task :design-system:mergeDevJniLibFolders
2026-06-25T19:08:39.7704118Z > Task :design-system:mergeDevNativeLibs NO-SOURCE
2026-06-25T19:08:39.8697109Z > Task :design-system:copyDevJniLibsProjectOnly
2026-06-25T19:08:40.1605194Z > Task :app:validateSigningDev
2026-06-25T19:08:40.1605698Z > Task :app:writeDevAppMetadata
2026-06-25T19:08:40.1606530Z > Task :app:writeDevSigningConfigVersions
2026-06-25T19:08:40.1607018Z > Task :core:stripDevDebugSymbols NO-SOURCE
2026-06-25T19:08:40.1607294Z > Task :core:copyDevJniLibsProjectAndLocalJars
2026-06-25T19:08:40.2637674Z > Task :core:extractDeepLinksForAarDev
2026-06-25T19:08:40.2638227Z > Task :core:prepareDevArtProfile
2026-06-25T19:08:40.2638735Z > Task :core:prepareLintJarForPublish
2026-06-25T19:08:40.2639218Z > Task :design-system:stripDevDebugSymbols NO-SOURCE
2026-06-25T19:08:40.2639599Z > Task :design-system:copyDevJniLibsProjectAndLocalJars
2026-06-25T19:08:40.3605874Z > Task :design-system:extractDeepLinksForAarDev
2026-06-25T19:08:40.3606430Z > Task :app:mergeDevNativeLibs
2026-06-25T19:08:40.3606821Z > Task :design-system:prepareDevArtProfile
2026-06-25T19:08:40.4624780Z > Task :design-system:prepareLintJarForPublish
2026-06-25T19:08:40.4629867Z > Task :app:extractProguardFiles
2026-06-25T19:08:40.4630316Z > Task :core:extractProguardFiles
2026-06-25T19:08:40.5662831Z > Task :design-system:extractProguardFiles
2026-06-25T19:08:40.5663506Z > Task :app:preDevUnitTestBuild UP-TO-DATE
2026-06-25T19:08:40.5663974Z > Task :core:writeDevLintModelMetadata
2026-06-25T19:08:40.5664631Z > Task :design-system:writeDevLintModelMetadata
2026-06-25T19:08:40.5665499Z > Task :core:preDevUnitTestBuild UP-TO-DATE
2026-06-25T19:08:40.5666600Z > Task :design-system:preDevUnitTestBuild UP-TO-DATE
2026-06-25T19:08:41.7635020Z 
2026-06-25T19:08:41.7635881Z > Task :app:stripDevDebugSymbols
2026-06-25T19:08:41.7636156Z Unable to strip the following libraries, packaging them as they are: libauthjni.so.
2026-06-25T19:08:52.1744606Z 
2026-06-25T19:08:52.1745406Z > Task :core:kspDevKotlin
2026-06-25T19:08:57.6642732Z > Task :app:mergeExtDexDev
2026-06-25T19:09:08.5603063Z 
2026-06-25T19:09:08.5603791Z > Task :core:compileDevKotlin
2026-06-25T19:09:08.5605895Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/core/src/main/java/br/gov/caixa/apps/core/data/auth/common/local/CoreAuthLocalDataSourceImpl.kt:153:50 Unchecked cast of 'AuthState!' to 'T (of fun <T> convertData)'.
2026-06-25T19:09:08.5606802Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/core/src/main/java/br/gov/caixa/apps/core/data/auth/common/local/CoreAuthLocalDataSourceImpl.kt:155:56 Unchecked cast of 'T? (of fun <T> convertData)' to 'T (of fun <T> convertData)'.
2026-06-25T19:09:08.5609403Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/core/src/main/java/br/gov/caixa/apps/core/data/auth/facade/BiometryFacadeImpl.kt:125:21 'fun setUserAuthenticationValidityDurationSeconds(p0: Int): KeyGenParameterSpec.Builder' is deprecated. Deprecated in Java.
2026-06-25T19:09:08.5610230Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/core/src/main/java/br/gov/caixa/apps/core/data/auth/xid/repository/XIDAuthTokenRepository.kt:112:39 'suspend fun getDeviceID(): DataState<String>' is deprecated. Método depreciado pela Topaz.
2026-06-25T19:09:08.5610791Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/core/src/main/java/br/gov/caixa/apps/core/data/common/remote/pmf/CallBackParseData.kt:80:30 Unchecked cast of 'String' to 'S? (of class CallBackParseData<S : Any, E : Parcelable>)'.
2026-06-25T19:09:08.5611969Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/core/src/main/java/br/gov/caixa/apps/core/data/common/remote/pmf/CallBackParseData.kt:82:65 Unchecked cast of 'Any!' to 'S? (of class CallBackParseData<S : Any, E : Parcelable>)'.
2026-06-25T19:09:08.5612516Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/core/src/main/java/br/gov/caixa/apps/core/data/common/remote/pmf/CallBackParseData.kt:89:57 Unchecked cast of 'Any!' to 'E? (of class CallBackParseData<S : Any, E : Parcelable>)'.
2026-06-25T19:09:08.5614765Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/core/src/main/java/br/gov/caixa/apps/core/data/ofd/OFDHBImpl.kt:70:32 'static fun getInfo(p0: Context!, p1: Int): String!' is deprecated. Deprecated in Java.
2026-06-25T19:09:08.5615410Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/core/src/main/java/br/gov/caixa/apps/core/domain/auth/common/usecase/DeviceIdentifierUseCaseImpl.kt:17:43 'suspend fun getDeviceID(): DataState<String>' is deprecated. Método depreciado pela Topaz.
2026-06-25T19:09:08.5616000Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/core/src/main/java/br/gov/caixa/apps/core/ui/auth/xid/viewModel/AuthXIDViewModel.kt:89:24 'fun getSerializableExtra(p0: String!): Serializable?' is deprecated. Deprecated in Java.
2026-06-25T19:09:13.1624250Z 
2026-06-25T19:09:13.1624913Z > Task :core:compileDevJavaWithJavac
2026-06-25T19:09:13.2665406Z > Task :core:processDevJavaRes
2026-06-25T19:09:13.3632828Z > Task :core:extractDevAnnotations
2026-06-25T19:09:13.4605002Z > Task :core:mergeDevJavaResource
2026-06-25T19:09:15.1602076Z > Task :core:transformDevClassesWithAsm
2026-06-25T19:09:15.3601552Z > Task :core:generateDevLintModel
2026-06-25T19:09:15.4600083Z > Task :core:mergeDevGeneratedProguardFiles
2026-06-25T19:09:15.4600699Z > Task :core:mergeDevConsumerProguardFiles
2026-06-25T19:09:15.4602072Z > Task :core:bundleLibCompileToJarDev
2026-06-25T19:09:15.4602379Z > Task :core:bundleLibRuntimeToJarDev
2026-06-25T19:09:15.5597254Z > Task :core:syncDevLibJars
2026-06-25T19:09:18.0599928Z > Task :core:bundleLibRuntimeToDirDev
2026-06-25T19:09:18.5689006Z > Task :core:createFullJarDev
2026-06-25T19:09:18.7604144Z > Task :core:bundleDevAar
2026-06-25T19:09:18.7604650Z > Task :core:assembleDev
2026-06-25T19:09:18.7604968Z > Task :core:bundleDevLocalLintAar
2026-06-25T19:09:19.5604073Z > Task :core:generateDevUnitTestLintModel
2026-06-25T19:09:22.7663070Z > Task :core:generateDevLintReportModel
2026-06-25T19:09:25.4600229Z > Task :design-system:kspDevKotlin
2026-06-25T19:09:34.0604069Z 
2026-06-25T19:09:34.0605069Z > Task :design-system:compileDevKotlin
2026-06-25T19:09:34.0605864Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/design-system/src/main/java/br/gov/caixa/design_system/view/base/dialog/select/model/SelectUIModel.kt:13:9 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:09:34.0606519Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:09:34.0608013Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:09:34.0608267Z 
2026-06-25T19:09:34.0608715Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:09:34.0609272Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/design-system/src/main/java/br/gov/caixa/design_system/view/base/dialog/select/view/SelectDialog.kt:35:27 'fun <T : Parcelable!> getParcelable(p0: String?): T?' is deprecated. Deprecated in Java.
2026-06-25T19:09:34.0609976Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/design-system/src/main/java/br/gov/caixa/design_system/view/base/model/AppThrowable.kt:5:20 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:09:34.0610619Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:09:34.0610984Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:09:34.0611142Z 
2026-06-25T19:09:34.0611421Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:09:34.0612087Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/design-system/src/main/java/br/gov/caixa/design_system/view/viewHolder/card/CardUIModel.kt:35:9 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:09:34.0612594Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:09:34.0612973Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:09:34.0613127Z 
2026-06-25T19:09:34.0613400Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:09:34.0613955Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/design-system/src/main/java/br/gov/caixa/design_system/view/viewHolder/others/UIModel.kt:20:9 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:09:34.0614456Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:09:34.0614934Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:09:34.0615095Z 
2026-06-25T19:09:34.0615365Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:09:34.0615904Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/design-system/src/main/java/br/gov/caixa/design_system/view/viewHolder/others/UIModel.kt:66:9 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:09:34.0616387Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:09:34.0616744Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:09:34.0616895Z 
2026-06-25T19:09:34.0617164Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:09:34.0617712Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/design-system/src/main/java/br/gov/caixa/design_system/view/viewHolder/others/UIModel.kt:67:9 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:09:34.0618174Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:09:34.0618529Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:09:34.0618693Z 
2026-06-25T19:09:34.0618975Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:09:34.0619606Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/design-system/src/main/java/br/gov/caixa/design_system/view/viewHolder/others/UIModel.kt:73:9 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:09:34.0620083Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:09:34.0620627Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:09:34.0623652Z 
2026-06-25T19:09:34.0624026Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:09:37.9633946Z 
2026-06-25T19:09:37.9634921Z > Task :design-system:compileDevJavaWithJavac
2026-06-25T19:09:38.0638155Z > Task :design-system:processDevJavaRes
2026-06-25T19:09:38.0674757Z > Task :design-system:extractDevAnnotations
2026-06-25T19:09:38.0675347Z > Task :design-system:mergeDevJavaResource
2026-06-25T19:09:38.6596929Z > Task :design-system:transformDevClassesWithAsm
2026-06-25T19:09:39.1733663Z > Task :design-system:generateDevLintModel
2026-06-25T19:09:39.2713278Z > Task :design-system:bundleLibCompileToJarDev
2026-06-25T19:09:39.2835549Z > Task :design-system:bundleLibRuntimeToJarDev
2026-06-25T19:09:41.2625665Z > Task :core:lintAnalyzeDevUnitTest
2026-06-25T19:09:43.0613855Z > Task :design-system:createFullJarDev
2026-06-25T19:09:43.5597430Z > Task :design-system:mergeDevGeneratedProguardFiles
2026-06-25T19:09:43.5598046Z > Task :design-system:mergeDevConsumerProguardFiles
2026-06-25T19:09:44.0597129Z > Task :design-system:bundleLibRuntimeToDirDev
2026-06-25T19:09:44.1596582Z > Task :design-system:syncDevLibJars
2026-06-25T19:09:44.2597298Z > Task :design-system:bundleDevAar
2026-06-25T19:09:44.2597848Z > Task :design-system:assembleDev
2026-06-25T19:09:44.3696968Z > Task :design-system:bundleDevLocalLintAar
2026-06-25T19:09:44.6597999Z > Task :design-system:generateDevUnitTestLintModel
2026-06-25T19:09:47.5676766Z > Task :app:mergeLibDexDev
2026-06-25T19:09:47.6640811Z > Task :design-system:generateDevLintReportModel
2026-06-25T19:09:48.6703385Z > Task :design-system:lintAnalyzeDevUnitTest
2026-06-25T19:09:48.8702165Z > Task :core:lintAnalyzeDev
2026-06-25T19:09:55.0702965Z 
2026-06-25T19:09:55.0751266Z > Task :core:lintReportDev
2026-06-25T19:09:55.0752126Z Wrote HTML report to file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/core/build/reports/lint-results-dev.html
2026-06-25T19:09:55.0916610Z 
2026-06-25T19:09:55.0917537Z > Task :core:lintDev
2026-06-25T19:10:07.9690073Z > Task :design-system:lintAnalyzeDev
2026-06-25T19:10:08.2604238Z 
2026-06-25T19:10:08.2605198Z > Task :design-system:lintReportDev
2026-06-25T19:10:08.2605822Z Wrote HTML report to file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/design-system/build/reports/lint-results-dev.html
2026-06-25T19:10:08.2606212Z 
2026-06-25T19:10:08.2606532Z > Task :design-system:lintDev
2026-06-25T19:10:09.2597395Z > Task :app:kspDevKotlin
2026-06-25T19:10:55.5600924Z > Task :app:kaptGenerateStubsDevKotlin
2026-06-25T19:11:21.4609629Z 
2026-06-25T19:11:21.4610552Z > Task :app:kaptDevKotlin
2026-06-25T19:11:21.4611184Z warning: Binding adapter AK(android.view.View, float) already exists for android:layout_marginLeft! Overriding br.gov.caixa.saudecaixa.ui.order.newOrder.chooseOrderType.view.BindingAdapters.Companion#setLeftMargin with br.gov.caixa.saudecaixa.ui.order.newOrder.chooseOrderType.view.BindingAdapters#setLeftMargin
2026-06-25T19:11:21.4612183Z warning: Binding adapter AK(android.view.View, float) already exists for android:layout_marginLeft! Overriding br.gov.caixa.saudecaixa.ui.order.newOrder.chooseOrderType.view.BindingAdapters.Companion#setLeftMargin with br.gov.caixa.saudecaixa.ui.order.newOrder.chooseOrderType.view.BindingAdapters#setLeftMargin
2026-06-25T19:11:21.4612940Z warning: Binding adapter AK(android.view.View, float) already exists for android:layout_marginRight! Overriding br.gov.caixa.saudecaixa.ui.order.newOrder.chooseOrderType.view.BindingAdapters.Companion#setRightMargin with br.gov.caixa.saudecaixa.ui.order.newOrder.chooseOrderType.view.BindingAdapters#setRightMargin
2026-06-25T19:11:21.4613699Z warning: Binding adapter AK(android.view.View, float) already exists for android:layout_marginRight! Overriding br.gov.caixa.saudecaixa.ui.order.newOrder.chooseOrderType.view.BindingAdapters.Companion#setRightMargin with br.gov.caixa.saudecaixa.ui.order.newOrder.chooseOrderType.view.BindingAdapters#setRightMargin
2026-06-25T19:11:21.4614618Z warning: Binding adapter AK(android.view.View, float) already exists for android:layout_marginTop! Overriding br.gov.caixa.saudecaixa.ui.order.newOrder.chooseOrderType.view.BindingAdapters.Companion#setTopMargin with br.gov.caixa.saudecaixa.ui.order.newOrder.chooseOrderType.view.BindingAdapters#setTopMargin
2026-06-25T19:11:21.4615118Z warning: Binding adapter AK(android.view.View, float) already exists for android:layout_marginTop! Overriding br.gov.caixa.saudecaixa.ui.order.newOrder.chooseOrderType.view.BindingAdapters.Companion#setTopMargin with br.gov.caixa.saudecaixa.ui.order.newOrder.chooseOrderType.view.BindingAdapters#setTopMargin
2026-06-25T19:11:21.4615623Z warning: Binding adapter AK(android.view.View, float) already exists for android:layout_marginBottom! Overriding br.gov.caixa.saudecaixa.ui.order.newOrder.chooseOrderType.view.BindingAdapters.Companion#setBottomMargin with br.gov.caixa.saudecaixa.ui.order.newOrder.chooseOrderType.view.BindingAdapters#setBottomMargin
2026-06-25T19:11:21.4616122Z warning: Binding adapter AK(android.view.View, float) already exists for android:layout_marginBottom! Overriding br.gov.caixa.saudecaixa.ui.order.newOrder.chooseOrderType.view.BindingAdapters.Companion#setBottomMargin with br.gov.caixa.saudecaixa.ui.order.newOrder.chooseOrderType.view.BindingAdapters#setBottomMargin
2026-06-25T19:11:21.4617027Z warning: The following options were not recognized by any processor: '[dagger.hilt.internal.useAggregatingRootProcessor, kapt.kotlin.generated, dagger.fastInit, dagger.hilt.android.internal.disableAndroidSuperclassValidation, dagger.hilt.android.internal.projectType]'
2026-06-25T19:11:52.3602379Z 
2026-06-25T19:11:52.3625713Z > Task :app:compileDevKotlin
2026-06-25T19:11:52.3628242Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/common/resources/ResourceProvider.kt:15:51 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:11:52.3628923Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:11:52.3629361Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:11:52.3629618Z 
2026-06-25T19:11:52.3630151Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:11:52.3630677Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/data/common/local/AppDatabase.kt:50:34 The corresponding parameter in the supertype 'Migration' is named 'db'. This may cause problems when calling this function with named arguments.
2026-06-25T19:11:52.3638002Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/data/common/local/BaseShared.kt:5:8 'class EncryptedSharedPreferences : Any, SharedPreferences' is deprecated. Deprecated in Java.
2026-06-25T19:11:52.3646004Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/data/common/local/BaseShared.kt:6:8 'class MasterKey : Any' is deprecated. Deprecated in Java.
2026-06-25T19:11:52.3646889Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/data/common/local/BaseShared.kt:12:25 'class MasterKey : Any' is deprecated. Deprecated in Java.
2026-06-25T19:11:52.3647476Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/data/common/local/BaseShared.kt:12:35 'constructor(p0: @NonNull() Context): MasterKey.Builder' is deprecated. Deprecated in Java.
2026-06-25T19:11:52.3647978Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/data/common/local/BaseShared.kt:12:65 'class MasterKey : Any' is deprecated. Deprecated in Java.
2026-06-25T19:11:52.3648655Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/data/common/local/BaseShared.kt:12:75 'enum class KeyScheme : Enum<MasterKey.KeyScheme!>' is deprecated. Deprecated in Java.
2026-06-25T19:11:52.3649747Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/data/common/local/BaseShared.kt:14:18 'class EncryptedSharedPreferences : Any, SharedPreferences' is deprecated. Deprecated in Java.
2026-06-25T19:11:52.3650720Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/data/common/local/BaseShared.kt:18:13 'class EncryptedSharedPreferences : Any, SharedPreferences' is deprecated. Deprecated in Java.
2026-06-25T19:11:52.3651447Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/data/common/local/BaseShared.kt:18:40 'enum class PrefKeyEncryptionScheme : Enum<EncryptedSharedPreferences.PrefKeyEncryptionScheme!>' is deprecated. Deprecated in Java.
2026-06-25T19:11:52.3652113Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/data/common/local/BaseShared.kt:19:13 'class EncryptedSharedPreferences : Any, SharedPreferences' is deprecated. Deprecated in Java.
2026-06-25T19:11:52.3652835Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/data/common/local/BaseShared.kt:19:40 'enum class PrefValueEncryptionScheme : Enum<EncryptedSharedPreferences.PrefValueEncryptionScheme!>' is deprecated. Deprecated in Java.
2026-06-25T19:11:52.3653465Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/data/common/local/BaseShared.kt:34:59 Unchecked cast of 'Boolean' to 'T (of fun <T> get)'.
2026-06-25T19:11:52.3653971Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/data/common/local/BaseShared.kt:35:58 Unchecked cast of 'String?' to 'T (of fun <T> get)'.
2026-06-25T19:11:52.3654504Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/data/common/local/BaseShared.kt:36:51 Unchecked cast of 'Int' to 'T (of fun <T> get)'.
2026-06-25T19:11:52.3655132Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/data/favorite/local/RecentLocalServiceImpl.kt:11:39 The corresponding parameter in the supertype 'RecentLocalService' is named 'recentEntity'. This may cause problems when calling this function with named arguments.
2026-06-25T19:11:52.3655825Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/data/favorite/local/SpecialtyLocalServiceImpl.kt:10:39 The corresponding parameter in the supertype 'SpecialtyLocalService' is named 'user'. This may cause problems when calling this function with named arguments.
2026-06-25T19:11:52.3656553Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/data/favorite/local/SpecialtyLocalServiceImpl.kt:19:33 The corresponding parameter in the supertype 'SpecialtyLocalService' is named 'specialty'. This may cause problems when calling this function with named arguments.
2026-06-25T19:11:52.3657363Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/card/detail/CardDetailUIModel.kt:44:9 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:11:52.3660041Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:11:52.3660389Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:11:52.3661666Z 
2026-06-25T19:11:52.3662087Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:11:52.3662600Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/card/detail/view/CardDetailBackFragment.kt:35:20 'fun <T : Parcelable!> getParcelable(p0: String?): T?' is deprecated. Deprecated in Java.
2026-06-25T19:11:52.3663291Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/common/button/fillbutton/ReloadButtonModel.kt:11:9 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:11:52.3663755Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:11:52.3664078Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:11:52.3664221Z 
2026-06-25T19:11:52.3664465Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:11:52.3665018Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/common/button/outlined/ListButtonViewHolder.kt:20:40 The corresponding parameter in the supertype 'ItemClickListener' is named 'item'. This may cause problems when calling this function with named arguments.
2026-06-25T19:11:52.3665726Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/common/button/outlined/OutlinedButtonModel.kt:12:9 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:11:52.3666170Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:11:52.3666590Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:11:52.3666685Z 
2026-06-25T19:11:52.3666973Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:11:52.3667539Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/common/button/outlined/OutlinedButtonViewHolder.kt:23:40 The corresponding parameter in the supertype 'ItemClickListener' is named 'item'. This may cause problems when calling this function with named arguments.
2026-06-25T19:11:52.3668289Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/common/inputtext/textwatcher/PhoneTextWatcher.kt:3:8 'class PhoneNumberFormattingTextWatcher : Any, TextWatcher' is deprecated. Deprecated in Java.
2026-06-25T19:11:52.3668888Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/common/inputtext/textwatcher/PhoneTextWatcher.kt:17:4 'constructor(p0: String!): PhoneNumberFormattingTextWatcher' is deprecated. Deprecated in Java.
2026-06-25T19:11:52.3669476Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/common/inputtext/textwatcher/PhoneTextWatcher.kt:17:4 'class PhoneNumberFormattingTextWatcher : Any, TextWatcher' is deprecated. Deprecated in Java.
2026-06-25T19:11:52.3670148Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/common/inputtext/textwatcher/PhoneTextWatcher.kt:26:18 This declaration overrides a deprecated member but is not marked as deprecated itself. Add the '@Deprecated' annotation or suppress the diagnostic.
2026-06-25T19:11:52.3670865Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/common/inputtext/textwatcher/PhoneTextWatcher.kt:27:15 'fun beforeTextChanged(p0: CharSequence!, p1: Int, p2: Int, p3: Int): Unit' is deprecated. Deprecated in Java.
2026-06-25T19:11:52.3671521Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/common/inputtext/textwatcher/PhoneTextWatcher.kt:30:18 This declaration overrides a deprecated member but is not marked as deprecated itself. Add the '@Deprecated' annotation or suppress the diagnostic.
2026-06-25T19:11:52.3672214Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/common/inputtext/textwatcher/PhoneTextWatcher.kt:31:15 'fun onTextChanged(p0: CharSequence!, p1: Int, p2: Int, p3: Int): Unit' is deprecated. Deprecated in Java.
2026-06-25T19:11:52.3672862Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/common/inputtext/textwatcher/PhoneTextWatcher.kt:50:18 This declaration overrides a deprecated member but is not marked as deprecated itself. Add the '@Deprecated' annotation or suppress the diagnostic.
2026-06-25T19:11:52.3673510Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/common/inputtext/textwatcher/PhoneTextWatcher.kt:51:15 'fun afterTextChanged(p0: Editable!): Unit' is deprecated. Deprecated in Java.
2026-06-25T19:11:52.3674177Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/common/listempty/ListEmptyModel.kt:9:5 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:11:52.3674635Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:11:52.3674957Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:11:52.3675086Z 
2026-06-25T19:11:52.3675323Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:11:52.3675821Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/common/listempty/ListEmptyModel.kt:10:5 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:11:52.3676258Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:11:52.3676579Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:11:52.3676734Z 
2026-06-25T19:11:52.3676972Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:11:52.3677482Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/common/others/model/OthersUIModels.kt:13:9 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:11:52.3677920Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:11:52.3678241Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:11:52.3678378Z 
2026-06-25T19:11:52.3678615Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:11:52.3679099Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/common/others/model/OthersUIModels.kt:19:9 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:11:52.3679650Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:11:52.3679969Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:11:52.3680097Z 
2026-06-25T19:11:52.3680425Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:11:52.3680944Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/common/others/model/OthersUIModels.kt:20:9 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:11:52.3681380Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:11:52.3681773Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:11:52.3681912Z 
2026-06-25T19:11:52.3682178Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:11:52.3682667Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/common/others/model/OthersUIModels.kt:21:9 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:11:52.3683165Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:11:52.3683482Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:11:52.3683572Z 
2026-06-25T19:11:52.3683804Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:11:52.3684316Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/common/others/model/OthersUIModels.kt:26:9 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:11:52.3684748Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:11:52.3685097Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:11:52.3685192Z 
2026-06-25T19:11:52.3685432Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:11:52.3685960Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/common/others/model/OthersUIModels.kt:27:9 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:11:52.3686392Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:11:52.3686716Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:11:52.3686803Z 
2026-06-25T19:11:52.3687035Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:11:52.3687508Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/common/others/model/OthersUIModels.kt:28:9 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:11:52.3688025Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:11:52.3688404Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:11:52.3688497Z 
2026-06-25T19:11:52.3688734Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:11:52.3689226Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/common/others/model/OthersUIModels.kt:29:9 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:11:52.3689708Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:11:52.3690022Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:11:52.3690113Z 
2026-06-25T19:11:52.3690377Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:11:52.3690865Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/common/others/model/OthersUIModels.kt:48:9 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:11:52.3691336Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:11:52.3691653Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:11:52.3691838Z 
2026-06-25T19:11:52.3692081Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:11:52.3692627Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/common/others/model/OthersUIModels.kt:56:9 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:11:52.3693118Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:11:52.3693434Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:11:52.3693526Z 
2026-06-25T19:11:52.3693758Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:11:52.3694246Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/common/others/model/OthersUIModels.kt:57:9 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:11:52.3694681Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:11:52.3695048Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:11:52.3695141Z 
2026-06-25T19:11:52.3695369Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:11:52.3695909Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/dependent/cancellation/reason/view/viewHolder/AditionalContactViewHolder.kt:3:8 'class PhoneNumberFormattingTextWatcher : Any, TextWatcher' is deprecated. Deprecated in Java.
2026-06-25T19:11:52.3696551Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/dependent/cancellation/reason/view/viewHolder/AditionalContactViewHolder.kt:50:56 'class PhoneNumberFormattingTextWatcher : Any, TextWatcher' is deprecated. Deprecated in Java.
2026-06-25T19:11:52.3697239Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/dependent/cancellation/reason/view/viewHolder/AditionalContactViewHolder.kt:50:56 'constructor(p0: String!): PhoneNumberFormattingTextWatcher' is deprecated. Deprecated in Java.
2026-06-25T19:11:52.3697933Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/dependent/cancellation/reason/view/viewHolder/AditionalContactViewHolder.kt:54:23 'fun beforeTextChanged(p0: CharSequence!, p1: Int, p2: Int, p3: Int): Unit' is deprecated. Deprecated in Java.
2026-06-25T19:11:52.3698570Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/dependent/cancellation/reason/view/viewHolder/AditionalContactViewHolder.kt:58:23 'fun onTextChanged(p0: CharSequence!, p1: Int, p2: Int, p3: Int): Unit' is deprecated. Deprecated in Java.
2026-06-25T19:11:52.3699196Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/dependent/cancellation/reason/view/viewHolder/AditionalContactViewHolder.kt:82:23 'fun afterTextChanged(p0: Editable!): Unit' is deprecated. Deprecated in Java.
2026-06-25T19:11:52.3699874Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/dependent/register/protocol/model/ProtocolUIModel.kt:18:9 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:11:52.3700329Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:11:52.3700648Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:11:52.3700838Z 
2026-06-25T19:11:52.3701080Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:11:52.3701600Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/financial/home/irpf/details/list/model/ItemListTotalUIModel.kt:13:5 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:11:52.3702144Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:11:52.3702468Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:11:52.3702620Z 
2026-06-25T19:11:52.3702854Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:11:52.3703371Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/financial/home/irpf/details/list/model/ItemListTotalUIModel.kt:14:5 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:11:52.3703827Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:11:52.3704151Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:11:52.3704236Z 
2026-06-25T19:11:52.3704475Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:11:52.3705074Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/financial/home/irpf/details/viewModel/IrpfDataViewModelImp.kt:44:34 The corresponding parameter in the supertype 'IrpfDataViewModel' is named 'selected'. This may cause problems when calling this function with named arguments.
2026-06-25T19:11:52.3705817Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/financial/home/irpf/details/viewModel/IrpfRefundDetailViewModelImp.kt:30:9 The corresponding parameter in the supertype 'IrpfLayoutViewModel' is named 'data'. This may cause problems when calling this function with named arguments.
2026-06-25T19:11:52.3706536Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/financial/list/item/detailed/model/DetailedItemListFinancialUI.kt:19:5 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:11:52.3706993Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:11:52.3707350Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:11:52.3707444Z 
2026-06-25T19:11:52.3707678Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:11:52.3708382Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/financial/list/separator/title/model/TitleUIModel.kt:11:5 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:11:52.3708867Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:11:52.3709253Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:11:52.3709346Z 
2026-06-25T19:11:52.3709578Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:11:52.3710123Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/financial/refund/list/RefundDataViewModelImp.kt:47:34 The corresponding parameter in the supertype 'RefundDataViewModel' is named 'selected'. This may cause problems when calling this function with named arguments.
2026-06-25T19:11:52.3824890Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/main/telemedicine/model/TelemedicineUI.kt:12:9 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:11:52.3825438Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:11:52.3825724Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:11:52.3825821Z 
2026-06-25T19:11:52.3826025Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:11:52.3826499Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/order/home/model/OrderUIModel.kt:79:17 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:11:52.3826898Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:11:52.3827186Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:11:52.3827279Z 
2026-06-25T19:11:52.3827475Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:11:52.3827919Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/order/home/model/OrderUIModel.kt:80:17 This annotation is currently applied to the value parameter only, but in the future it will also be applied to field.
2026-06-25T19:11:52.3828314Z - To opt in to applying to both value parameter and field, add '-Xannotation-default-target=param-property' to your compiler arguments.
2026-06-25T19:11:52.3828590Z - To keep applying to the value parameter only, use the '@param:' annotation target.
2026-06-25T19:11:52.3828679Z 
2026-06-25T19:11:52.3828865Z See https://youtrack.jetbrains.com/issue/KT-73255 for more details.
2026-06-25T19:11:52.3829710Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/order/newOrder/refund/documents/common/model/DocumentsUIModel.kt:26:11 The primary constructor is empty, no data will be serialized to 'Parcel'.
2026-06-25T19:11:52.3830241Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/order/newOrder/refund/documents/send/view/viewHolder/DocumentCardViewHolder.kt:13:41 'val position: Int' is deprecated. Deprecated in Java.
2026-06-25T19:11:52.3830776Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/search/common/GetLocation.kt:93:48 'fun getFromLocation(p0: Double, p1: Double, p2: Int): (Mutable)List<Address!>?' is deprecated. Deprecated in Java.
2026-06-25T19:11:52.3831261Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/search/home/view/SearchHomeFragment.kt:367:25 Duplicate branch condition in 'when'.
2026-06-25T19:11:52.3831897Z w: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/src/main/java/br/gov/caixa/saudecaixa/ui/search/result/list/view/OptionsMenuBottomSheetDialogFragment.kt:48:41 'fun <T : Parcelable!> getParcelable(p0: String?): T?' is deprecated. Deprecated in Java.
2026-06-25T19:12:13.0604730Z 
2026-06-25T19:12:13.0673190Z > Task :app:compileDevJavaWithJavac
2026-06-25T19:12:13.5612077Z > Task :app:hiltAggregateDepsDev
2026-06-25T19:12:22.5629295Z > Task :app:hiltJavaCompileDev
2026-06-25T19:12:23.4635051Z > Task :app:processDevJavaRes
2026-06-25T19:12:23.7713174Z > Task :app:generateDevLintReportModel
2026-06-25T19:12:24.5634987Z > Task :app:bundleDevClassesToCompileJar
2026-06-25T19:12:26.2617597Z > Task :app:generateDevUnitTestLintModel
2026-06-25T19:12:46.8703083Z > Task :app:transformDevClassesWithAsm
2026-06-25T19:12:46.8784239Z > Task :app:mergeDevJavaResource
2026-06-25T19:12:53.7596227Z > Task :app:lintAnalyzeDev
2026-06-25T19:12:56.2662938Z > Task :app:lintAnalyzeDevUnitTest
2026-06-25T19:13:16.8605067Z > Task :app:dexBuilderDev
2026-06-25T19:13:19.5672794Z > Task :app:mergeDevGlobalSynthetics
2026-06-25T19:13:21.3692682Z > Task :app:mergeProjectDexDev
2026-06-25T19:13:23.6772974Z > Task :app:packageDev
2026-06-25T19:13:23.6810534Z > Task :app:createDevApkListingFileRedirect
2026-06-25T19:13:23.6893082Z > Task :app:assembleDev
2026-06-25T19:15:59.2602257Z 
2026-06-25T19:15:59.2606131Z > Task :app:lintReportDev
2026-06-25T19:15:59.2606850Z Wrote HTML report to file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/app/build/reports/lint-results-dev.html
2026-06-25T19:15:59.2607099Z 
2026-06-25T19:15:59.2607373Z > Task :app:lintDev
2026-06-25T19:15:59.3571565Z [Incubating] Problems report is available at: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/build/reports/problems/problems-report.html
2026-06-25T19:15:59.3572514Z 
2026-06-25T19:15:59.3573332Z Deprecated Gradle features were used in this build, making it incompatible with Gradle 9.0.
2026-06-25T19:15:59.3573604Z 
2026-06-25T19:15:59.3574029Z You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.
2026-06-25T19:15:59.3574282Z 
2026-06-25T19:15:59.3575901Z For more on this, please refer to https://docs.gradle.org/8.11.1/userguide/command_line_interface.html#sec:command_line_warnings in the Gradle documentation.
2026-06-25T19:15:59.3576380Z 
2026-06-25T19:15:59.3576747Z BUILD SUCCESSFUL in 7m 49s
2026-06-25T19:15:59.3577046Z 153 actionable tasks: 150 executed, 3 up-to-date
2026-06-25T19:15:59.6877677Z ##[section]Finishing: Build Gradle



