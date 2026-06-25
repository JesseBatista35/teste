2026-06-25T19:04:13.3606581Z ##[section]Starting: Build Gradle
2026-06-25T19:04:13.3610528Z ==============================================================================
2026-06-25T19:04:13.3610632Z Task         : Bash
2026-06-25T19:04:13.3610686Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-25T19:04:13.3610770Z Version      : 3.227.0
2026-06-25T19:04:13.3610824Z Author       : Microsoft Corporation
2026-06-25T19:04:13.3610892Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-25T19:04:13.3610969Z ==============================================================================
2026-06-25T19:04:13.4344464Z Warning: Ignoring extra certs from `/etc/pki/ca-trust/source/anchors/AC-V4.cer`, load failed: error:02001002:system library:fopen:No such file or directory
2026-06-25T19:04:13.5150627Z Generating script.
2026-06-25T19:04:13.5160938Z ========================== Starting Command Output ===========================
2026-06-25T19:04:13.5168660Z [command]/bin/bash /opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/_temp/daf20841-1577-44a0-bc0f-bce43e395f1d.sh
2026-06-25T19:04:14.1130518Z Starting a Gradle Daemon, 15 busy and 8 incompatible and 2 stopped Daemons could not be reused, use --status for details
2026-06-25T19:04:20.8136827Z 
2026-06-25T19:04:20.8158226Z > Configure project :app
2026-06-25T19:04:20.8158943Z WARNING: The option setting 'android.defaults.buildfeatures.buildconfig=true' is deprecated.
2026-06-25T19:04:20.8159821Z The current default is 'false'.
2026-06-25T19:04:20.8160146Z It will be removed in version 9.0 of the Android Gradle plugin.
2026-06-25T19:04:20.8160552Z To keep using this feature, add the following to your module-level build.gradle files:
2026-06-25T19:04:20.8161088Z     android.buildFeatures.buildConfig = true
2026-06-25T19:04:20.8161516Z or from Android Studio, click: `Refactor` > `Migrate BuildConfig to Gradle Build Files`.
2026-06-25T19:04:21.0135116Z [Incubating] Problems report is available at: file:///opt/ferramentas/agent-tfs/agent-mobile-linux-2024/work_ads/r4/a/_SIMSC-android/build/reports/problems/problems-report.html
2026-06-25T19:04:21.0135672Z 
2026-06-25T19:04:21.0136068Z FAILURE: Build failed with an exception.
2026-06-25T19:04:21.0136886Z 
2026-06-25T19:04:21.0137165Z * What went wrong:
2026-06-25T19:04:21.0137547Z A problem occurred configuring project ':app'.
2026-06-25T19:04:21.0137850Z > android.defaultConfig.versionCode is set to 0, but it should be a positive integer.
2026-06-25T19:04:21.0138128Z   See https://developer.android.com/studio/publish/versioning#appversioning for more information.
2026-06-25T19:04:21.0138383Z 
2026-06-25T19:04:21.0138717Z * Try:
2026-06-25T19:04:21.0143451Z > Run with --stacktrace option to get the stack trace.
2026-06-25T19:04:21.0143798Z > Run with --info or --debug option to get more log output.
2026-06-25T19:04:21.0144082Z > Run with --scan to get full insights.
2026-06-25T19:04:21.1192949Z > Get more help at https://help.gradle.org.
2026-06-25T19:04:21.1215012Z 
2026-06-25T19:04:21.1215557Z BUILD FAILED in 7s
2026-06-25T19:04:21.1215864Z 
2026-06-25T19:04:21.1217346Z Deprecated Gradle features were used in this build, making it incompatible with Gradle 9.0.
2026-06-25T19:04:21.1217558Z 
2026-06-25T19:04:21.1218059Z You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.
2026-06-25T19:04:21.1218393Z 
2026-06-25T19:04:21.1218949Z For more on this, please refer to https://docs.gradle.org/8.11.1/userguide/command_line_interface.html#sec:command_line_warnings in the Gradle documentation.
2026-06-25T19:04:21.4623108Z ##[error]Bash exited with code '1'.
2026-06-25T19:04:21.4652044Z ##[section]Finishing: Build Gradle
