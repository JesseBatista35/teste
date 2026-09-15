Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
sifgm-android
Repository navigation
Code
Issues
2
 (2)
Pull requests
Actions
Projects
Wiki
Security and quality
35
 (35)
Insights
Settings
Call Android Workflow
5.11.0(5) Reatoração SMS #301
All jobs
Run details
CI_CD / BUILD / BUILD (FARM_BUILD)
failed now in 43s
Search logs
5s
4s
0s
27s
Run caixagithub/DevSecOps-Actions/.github/android/default-build@develop
Run actions/checkout@v4.1.0
1s
Local infrastructure repository checkout
2s
Checkout Actions repository
1s
Python setup
9s
Setting build environment vars from configmap
1s
Setting des vars from configmap
1s
JAVA JDK 17 setup
5s
  Node 20 is being deprecated. This workflow is running with Node 24 by default. If you need to temporarily use Node 20, you can set the ACTIONS_ALLOW_USE_UNSECURE_NODE_VERSION=true environment variable. For more information see: https://github.blog/changelog/2025-09-19-deprecation-of-node-20-on-github-actions-runners/
Run actions/setup-java@v4
  Warning: setup-java v4 is deprecated and will no longer receive updates. Please migrate to actions/setup-java@v5.
Installed distributions
  Creating settings.xml with server-id: github
  Writing to /home/runner/.m2/settings.xml
  gradle cache is not found
JAVA_HOME check
0s
Given permission to gradle
0s
Android SDK setup
7s
  Node 20 is being deprecated. This workflow is running with Node 24 by default. If you need to temporarily use Node 20, you can set the ACTIONS_ALLOW_USE_UNSECURE_NODE_VERSION=true environment variable. For more information see: https://github.blog/changelog/2025-09-19-deprecation-of-node-20-on-github-actions-runners/
Run android-actions/setup-android@v3
    with:
      accept-android-sdk-licenses: true
      cmdline-tools-version: 12266719
      log-accepted-android-sdk-licenses: true
      packages: tools platform-tools
    env:
      pythonLocation: /home/runner/_work/_tool/Python/3.11.16/x64
      PKG_CONFIG_PATH: /home/runner/_work/_tool/Python/3.11.16/x64/lib/pkgconfig
      Python_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.16/x64
      Python2_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.16/x64
      Python3_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.16/x64
      LD_LIBRARY_PATH: /home/runner/_work/_tool/Python/3.11.16/x64/lib
      APP_NAME: fgts
      BUILD_TYPE: debug
      PRODUCTION: false
      BUILD_WITH_FLAVOR: false
      ANDROID_API_LEVEL: 36
      BUILD_TOOLS_VERSION: 36.0.0
      NEXUS_URL: http://binario.caixa:8081/repository/caixa-adapters-zip/
      NEXUS_REPOSITORY_ID: caixa-mobilidade
      NEXUS_GROUP_ID: br.gov.caixa.fgts
      FARM_OAUTH2_ENDPOINT_URL: https://labmobilecaixa-hml.keeggo.com:443/rest/oauth2/token
      FARM_APP_ENDPOINT_URL: https://labmobilecaixa-hml.keeggo.com:443/rest/apps
      WORKSPACE_ID: d73a0054-31c6-4cfb-ab15-e8e11c0eea15
      PACKAGE: true
      RESIGN: false
      LANGUAGES: ["java-kotlin"]
      ENVIRONMENTS: ["FARM", "DES", "PLT", "PRD"]
      SONAR_JAVA_TEST_BINARIES: app/build/tmp/kotlin-classes/producaoUnitTest
      SONAR_SOURCES: app/src/main/java
      SONAR_JAVA_SUREFIRE_REPORTPATHS: app/build/test-results/testDesenvolvimentoDebug
      SONAR_COVERAGE_JACOCO_XMLREPORTPATHS: app/build/reports/jacoco/jacocoProducaoUnitTestReport/jacocoProducaoUnitTestReport.xml
      SONAR_KOTLIN_COVERAGE_REPORTPATHS: 
      SONAR_JUNIT_REPORTPATHS: app/build/test-results/testProducaoUnitTest
      SONAR_KOTLIN_DETEKT_REPORTPATHS: 
      SONAR_TESTS: app/src/test/java
      JAVA_HOME: /home/runner/_work/_tool/Java_Temurin-Hotspot_jdk/17.0.20-101/x64
      JAVA_HOME_17_X64: /home/runner/_work/_tool/Java_Temurin-Hotspot_jdk/17.0.20-101/x64
  Downloading commandline tools from https://dl.google.com/android/repository/commandlinetools-linux-12266719_latest.zip
  /usr/bin/unzip -o -q /home/runner/_work/_temp/1bff14ca-b428-4808-ac93-5529f30397b7
  Accepting Android SDK licenses
  /home/runner/.android/sdk/cmdline-tools/16.0/bin/sdkmanager --licenses
  Loading local repository...                                                     
  [=========                              ] 25% Loading local repository...       
  [=========                              ] 25% Fetch remote repository...        
  [==========                             ] 26% Fetch remote repository...        
  [============                           ] 31% Fetch remote repository...        
  [============                           ] 32% Fetch remote repository...        
  [=============                          ] 33% Fetch remote repository...        
  [=============                          ] 35% Fetch remote repository...        
  [==============                         ] 36% Fetch remote repository...        
  [==============                         ] 37% Fetch remote repository...        
  [===============                        ] 38% Fetch remote repository...        
  [===============                        ] 39% Fetch remote repository...        
  [================                       ] 40% Fetch remote repository...        
  [================                       ] 41% Fetch remote repository...        
  [================                       ] 42% Fetch remote repository...        
0s
0s
0s
0s
0s
0s
0s
0s
0s
0s
0s
0s
0s
1s
0s
0s

    shell: bash

  - name: Given permission to gradle
    run: chmod +x gradlew
    shell: bash

  - name: Android SDK setup
    uses: android-actions/setup-android@v4
    with:
      accept-android-sdk-licenses: true
      packages: ''

  - name: Build tools packages setup
    run: |
      sdkmanager --install "platform-tools" "platforms;android-${{ env.ANDROID_API_LEVEL }}" "build-tools;${{ env.BUILD_TOOLS_VERSION }}"
    shell: bash

  - name: Adding build-tools to PATH



  fo ifeito o ajuste

  e mesmo assim deu ruim vc me fez passar vergoha
  


