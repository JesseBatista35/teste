me solicitral para achar o conteudo do arquico ~/.netrc

e falaram isso:

Está havendo problema com a formatação da URL, pois as credenciais estão sendo utilizadas diretamente na URL. Como ela tem caracteres especiais, está invalidando a URL.
 
A recomendação da TOPAZ é utilizar autenticação via arquivo .netrc, evitando o uso de credenciais na URL.
 
Segue documentação explicativa:
 
https://docs.apps.topazevolution.com/heartbeat/
Docs Login
 

na pipiline 

resources:
  repositories:
  - repository: templates
    type: git
    name: SIFAM-APP-ios/devops
parameters:
- name: versionName
  displayName: 'Versão do Aplicativo para a Loja'
  type: string
  default: '0.0.1'
- name: versionCode
  type: string
  default: '1'
  displayName: 'Versão do Code do Aplicativo para a Loja'
stages:
- stage: DES
  variables:
  - group: SIFAM_ANDROID_DES
  jobs:
  - job: Build
    pool:
      vmImage: 'ubuntu-latest'
    steps:
    - task: 6d15af64-176c-496d-b583-fd2ae21d4df4@1
      inputs:
        repository: self
    - task: 6d15af64-176c-496d-b583-fd2ae21d4df4@1
      inputs:
        repository: git://SIFAM-APP-ios/devops
    - task: Bash@3
      displayName: 'Exibe informações do Aplicativo (Build, Versão e Code)'
      inputs:
        targetType: inline
        script: "java -version \ncode=1\nexport code_new=$((code + $(N)))\necho \"##vso[task.setvariable variable=CODE_NEW]$code_new\"\nversion=0.0.1\necho \"##vso[task.setvariable variable=VERSION_BUILD]$version\"\necho \"Build: $(buildType)\"\necho \"Versão: $version\" \necho \"Code: $code_new\"\n"
    - task: Bash@3
      displayName: 'Atualiza BuildName'
      inputs:
        targetType: inline
        script: >
          echo "Build $(buildType) | Version 0.0.1 | Code $(CODE_NEW)"

          build_name="Version 0.0.1 - ID $(build.buildNumber) - Code $(CODE_NEW)"

          echo "##vso[build.updatebuildnumber]$build_name"
    - task: Bash@3
      displayName: 'Valida Integridade da Branch'
      inputs:
        targetType: inline
        script: |
          curl -v --silent --user $(gitUser):$(gitToken) $(gitUrl)/diffs/commits?baseVersion=$(Build.SourceVersion)'&'baseVersionType=commit'&'targetVersion=main'&'api-version=6.0 | grep "\"aheadCount\":0," && echo "##vso[task.complete result=Succeeded;]" || echo "##vso[task.complete result=Failed;]"
    - task: Bash@3
      condition: failed()
      displayName: 'Exibe alerta de Branch expirada'
      inputs:
        targetType: inline
        script: |
          echo "##vso[task.logissue type=error]---- ALERTA ---- Verifique o merge da main para a sua branch ---- ALERTA ----."
          exit 1
    - task: Cache@2
      inputs:
        key: 'gradle | "$(Agent.OS)" | **/build.gradle | **/dependencies.gradle'
        restoreKeys: |
          gradle | "$(Agent.OS)"
          gradle
        path: $(GRADLE_USER_HOME)
      displayName: 'Configura o Gradle Cache'
    - task: Gradle@3
      inputs:
        gradleWrapperFile: '$(Build.Repository.Name)/gradlew'
        workingDirectory: '$(Build.Repository.Name)'
        tasks: '$(gradleBuild)'
        publishJUnitResults: false
        javaHomeOption: 'JDKVersion'
        jdkVersionOption: '1.11'
        gradleOptions: '-Xmx3072m'
        sonarQubeRunAnalysis: false
        spotBugsAnalysis: false
      displayName: 'Gera Pacote'
    - task: CmdLine@2
      displayName: 'Para o Gradle Daemon'
      inputs:
        script: |
          $(Build.Repository.Name)/gradlew --stop
    - task: Bash@3
      name: Variaveis
      displayName: 'Recupera Informações do Pacote'
      inputs:
        targetType: inline
        script: >
          app_path=$(find . -iname "$(nameApp)-0.0.1*$(buildType)*.a*" | head -n 1)

          app_name=$(basename "$app_path")

          app_ext="${app_name##*.}"

          app_signed=$(nameApp)-0.0.1-$(buildType).$app_ext

          echo "##vso[task.setvariable variable=APP_PATH]$app_path"

          echo "##vso[task.setvariable variable=APP_NAME]$app_name"

          echo "##vso[task.setvariable variable=APP_EXT]$app_ext"

          echo "##vso[task.setvariable variable=APP_SIGNED]$app_signed"

          echo "Caminho do aplicativo compilado: $app_path"

          echo "Nome do aplicativo compilado: $app_name"

          echo "Extensão do aplicativo: $app_ext"

          echo "Nome do aplicativo assinado: $app_signed"
    - task: Bash@3
      condition: eq(variables['APP_EXT'], 'apk')
      displayName: 'Assina Pacote APK'
      inputs:
        targetType: inline
        script: |
          /usr/local/lib/android/sdk/build-tools/$(buildTools)/apksigner sign -v --ks $(System.DefaultWorkingDirectory)/devops/config/$(caixaKeyStore) --ks-key-alias $(aliasKeyStore) --ks-pass pass:$(caixaKeystorePass) --key-pass pass:$(caixaKeystorePass) $(APP_PATH)
          mv $(APP_PATH) $(APP_SIGNED)
          /usr/local/lib/android/sdk/build-tools/$(buildTools)/apksigner verify -v $(APP_SIGNED)
    - task: Bash@3
      condition: eq(variables['APP_EXT'], 'aab')
      displayName: 'Assina Pacote BUNDLE'
      inputs:
        targetType: inline
        script: |
          jarsigner -verbose -sigalg SHA1withRSA -digestalg SHA1 -keystore $(System.DefaultWorkingDirectory)/devops/config/$(caixaKeyStore) -storepass $(caixaKeystorePass) $(APP_PATH) $(aliasKeyStore)
          mv $(APP_PATH) $(APP_SIGNED)
          jarsigner -verbose -verify $(APP_SIGNED)
    - task: PublishBuildArtifacts@1
      inputs:
        PathtoPublish: $(APP_SIGNED)
        artifactName: $(buildType)-0.0.1
      displayName: 'Publica Pacote APK ou BUNDLE'
  - job: NexusUpload
    dependsOn:
    - Build
    pool:
      name: 'VMSSAgentPoolUbuntu'
    steps:
    - task: 6d15af64-176c-496d-b583-fd2ae21d4df4@1
      inputs:
        repository: self
    - task: DownloadBuildArtifacts@1
      inputs:
        buildType: 'current'
        downloadType: 'single'
        artifactName: $(buildType)-0.0.1
        downloadPath: '$(Build.ArtifactStagingDirectory)'
      displayName: 'Resgata APP do Drop'
    - task: Bash@3
      displayName: 'Armazena APP no Nexus'
      inputs:
        targetType: inline
        script: >
          cd $(Build.ArtifactStagingDirectory)/$(buildType)-0.0.1

          app_path=$(find . -iname "$(nameApp)-0.0.1-$(buildType)*.a*" | head -n 1)

          app_name=$(basename "$app_path")

          app_ext="${app_name##*.}"

          app_signed=$(nameApp)-0.0.1-$(buildType).$app_ext

          PATH=$PATH:/opt/apache-maven-3.8.6/bin

          mvn deploy:deploy-file -Durl=$(nexusUrl) -DrepositoryId=caixa-mobilidade -Dfile=$app_signed -DgroupId=$(packageId) -DartifactId=$(nameApp) -Dversion=0.0.1-$(buildType).$(build.buildId) -Dpackaging=$app_ext
  - job: SonarDevSecOps
    pool:
      name: 'VMSSAgentPoolUbuntu'
    steps:
    - task: 6d15af64-176c-496d-b583-fd2ae21d4df4@1
      inputs:
        repository: self
    - task: SonarQubePrepare@5
      inputs:
        SonarQube: 'sonar.produtos.caixa'
        scannerMode: 'CLI'
        configMode: 'manual'
        cliProjectKey: '$(Build.Repository.Name)'
        cliProjectName: '$(Build.Repository.Name)'
        cliProjectVersion: '0.0.1'
        cliSources: '.'
        extraProperties: >
          sonar.projectVersion=0.0.1

          sonar.sources=.

          sonar.java.binaries=.

          sonar.binaries=.

          sonar.sourceEncoding=UTF-8

          sonar.exclusions=**/build/**
    - task: SonarQubeAnalyze@5
      inputs:
        jdkversion: 'JAVA_HOME_11_X64'
      displayName: 'Varredura SonarQube'
  - job: FortifyDevSecOps
    pool:
      name: 'VMSSAgentPoolUbuntu'
    condition: false
    steps:
    - task: 6d15af64-176c-496d-b583-fd2ae21d4df4@1
      inputs:
        repository: self
    - task: 6d15af64-176c-496d-b583-fd2ae21d4df4@1
      inputs:
        repository: git://SIFAM-APP-ios/devops
    - task: Bash@3
      displayName: 'Definindo Variaveis Fortify'
      inputs:
        targetType: inline
        script: |
          GitRepositoryName=$(Build.Repository.Name)
          DefinitionName=$(Build.DefinitionName)
          RepositoryName=`(echo "$GitRepositoryName" | tr '[[:upper:]]' '[[:lower:]]')`
          echo "##vso[task.setvariable variable=REPOSITORIO;]$RepositoryName"
          ProjectName=`(echo "$GitRepositoryName" | tr '[[:upper:]]' '[[:lower:]]' | cut -f1 -d"-")`
          echo "##vso[task.setvariable variable=PROJETO;]$ProjectName"
          echo "Definindo liguagem de programação"
          p_language=java
          echo "Liguagem de programação = $p_language"
          echo "##vso[task.setvariable variable=p_language]$p_language"
          echo "Autenticando no Fortify e adquirindo token"
          get_token=`curl -s --user $(FORTIFY_USER):$(FORTIFY_PASS) -k -X POST -H "Content-Type:application/json" -d '{"type": "UnifiedLoginToken"}' '$(FORTIFY_API)/tokens'`
          token=`echo $get_token | jq -r '.data.token'`
          response=`echo $get_token | jq -r '.responseCode'`
          if [[ $response != 201 ]]
          then
          echo "Ocorreu um erro ao realizar ação no Fortify Status_code: $response"
          exit 1
          fi
          echo "##vso[task.setvariable variable=token]$token"
    - task: Bash@3
      displayName: 'Criando Aplication no Fortify'
      inputs:
        targetType: inline
        script: "#!/bin/bash\nset -x\necho \"Repo: $(REPOSITORIO)\"\n#Corrigir caracter bizzaro que o ads coloca (java'\\''')\np_lang=`echo '$(p_language)' | sed 's/[[:punct:]]\\+$//'`\necho \"Liguagem de programação: $p_lang\"\necho \"Iniciando fluxo de criação de Application no Fortify\"\nlista_projeto=`curl -s -X POST \"$(FORTIFY_API)/projects/action/test\" -H \"Authorization:FortifyToken $(token)\" -H \"accept: application/json\" -H \"Content-Type: application/json\" -d \"{ \\\"applicationName\\\": \\\"$(REPOSITORIO)\\\"}\"`\nlprojeto=`echo $lista_projeto | jq -r '.data.found'`\nresponse=`echo $lista_projeto | jq -r '.responseCode'`\nif [[ $response != 200 ]]\nthen\necho \"Ocorreu um erro ao realizar ação no Fortify Status_code: $response\"\nexit 1\nfi\necho \"Listando Application ==>\"$lprojeto\necho \"Listando Application response ==> \"$response\nif [ $lprojeto = false ]\nthen\necho \"Criando o Application no Fortify\"\ncria_projeto=`curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d '{\"name\":\"'0.0.1'\",\"description\":\"\",\"active\":true,\"project\":{\"name\":\"'$(REPOSITORIO)'\",\"description\":\"\",\"issueTemplateId\":\"Prioritized-HighRisk-Project-Template\"},\"issueTemplateId\":\"Prioritized-HighRisk-Project-Template\",\"committed\":true}' '$(FORTIFY_API)/projectVersions'`\nidFortify=`echo $cria_projeto | jq -r '.data.id'`\nresponse=`echo $cria_projeto | jq -r '.responseCode'`\nif [[ $response != 201 ]]\nthen\necho \"Ocorreu um erro ao realizar ação no Fortify Status_code: $response\"\nexit 1\nfi\necho \"Project Fortify ID ==> \"$idFortify\necho \"Project Fortify ID response ==> \"$response\nid_versao=`curl -s \"$(FORTIFY_API)/projectVersions?start=0&limit=2000&fulltextsearch=false\" -H \"Authorization:FortifyToken $(token)\" -H \"accept: application/json\" -H \"Content-Type: application/json\"`\niversao=`echo $id_versao | jq -r '.data[] | select(.name==\"0.0.1\" and .project.name==\"$(REPOSITORIO)\") | .id'`\nresponse=`echo $id_versao | jq -r '.responseCode'`\nif [[ $response != 200 ]]\nthen\necho \"Ocorreu um erro ao realizar ação no Fortify Status_code: $response\"\nexit 1\nfi\necho \"Project Version ID ==> \"$iversao\necho \"Project Version ID response ==> \"$response\nif [ $p_lang == java ]\nthen\ncat $(Build.SourcesDirectory)/devops/config/javaDefault.json | sed -e 's/idFortify/'$iversao'/g' | curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d @- '$(FORTIFY_API)/bulk'\nelif [ $p_lang == angular ] || [ $p_lang == nodejs ]\nthen\ncat /opt/ads-agent/javascriptDefault.json | sed -e 's/idFortify/'$iversao'/g' | curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d @- '$(FORTIFY_API)/bulk'\nelif [ $p_lang == php ]\nthen\ncat /opt/ads-agent/phpDefault.json | sed -e 's/idFortify/'$iversao'/g' | curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d @- '$(FORTIFY_API)/bulk'\nfi\nelse \necho \"A Application $(REPOSITORIO) já esta criada no Fortify\"\nfi\n"
    - task: Bash@3
      displayName: 'Criando Version no Fortify'
      inputs:
        targetType: inline
        script: "#!/bin/bash\nset -x \necho \"Repo: $(REPOSITORIO)\"\n#Corrigir caracter bizzaro que o ads coloca (java'\\''')\np_lang=`echo '$(p_language)' | sed 's/[[:punct:]]\\+$//'`\necho \"Liguagem de programação: $p_lang\"\necho \"Criando nova Application Version\"\nlista_versao=`curl -s -X POST \"$(FORTIFY_API)/projectVersions/action/test\" -H \"Authorization:FortifyToken $(token)\" -H \"accept: application/json\" -H \"Content-Type: application/json\" -d \"{ \\\"projectName\\\": \\\"$(REPOSITORIO)\\\", \\\"projectVersionName\\\": \\\"0.0.1\\\"}\"`\nlversao=`echo $lista_versao | jq -r '.data.found'`\nresponse=`echo $lista_versao | jq -r '.responseCode'`\nif [[ $response != 200 ]]\nthen\necho \"Ocorreu um erro ao realizar ação no Fortify Status_code: $response\"\nexit 1\nfi\necho \"listar_versão ==>\"$lversao\necho \"listar_versão response ==>\"$response\nif [ $lversao = false ]\nthen \necho \"Criando o versão no fortify para o projeto '$(REPOSITORIO)'\"\nid_project=`curl -s \"$(FORTIFY_API)/projects?start=0&limit=2000&fulltextsearch=false\" -H \"Authorization:FortifyToken $(token) \" -H \"accept: application/json\" -H \"Content-Type: application/json\"`\niproject=`echo $id_project | jq -r '.data[] | select (.name==\"$(REPOSITORIO)\") | .id'`\nresponse=`echo $id_project | jq -r '.responseCode'`\nif [[ $response != 200 ]]\nthen\necho \"Ocorreu um erro ao realizar ação no Fortify Status_code: $response\"\nexit 1\nfi	\necho \"Project ID ==> \"$iproject\necho \"Project ID response ==> \"$response	\ncria_versao=`curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d '{\"name\":\"'0.0.1'\",\"description\":\"\",\"active\":true,\"committed\":true,\"project\":{\"name\":\"'$(REPOSITORIO)'\",\"description\":null,\"issueTemplateId\":\"Prioritized-HighRisk-Project-Template\",\"id\":'$iproject'},\"issueTemplateId\":\"Prioritized-HighRisk-Project-Template\"}' '$(FORTIFY_API)/projectVersions'`\ncversion=`echo $cria_versao | jq -r '.data.id'`\nresponse=`echo $cria_versao | jq -r '.responseCode'`\nif [[ $response != 201 ]]\nthen\necho \"Ocorreu um erro ao realizar ação no Fortify Status_code: $response\"\nexit 1\nfi	\necho \"Criando Application Version ==> \"$cversion\necho \"Criando  Application Version response ==> \"$response\necho \"Atribuindo atributos a Application Version\"$cversion\necho \"Linguagem de programacao $p_lang\"\nif [ $p_lang == java ]\nthen\ncat $(Build.SourcesDirectory)/devops/config/javaDefault.json | sed -e 's/idFortify/'$cversion'/g' | curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d @- '$(FORTIFY_API)/bulk'\nelif [ $p_lang == angular ] || [ $p_lang == nodejs ]\nthen\ncat /opt/ads-agent/javascriptDefault.json | sed -e 's/idFortify/'$cversion'/g' | curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d @- '$(FORTIFY_API)/bulk'\nelif [ $p_lang == php ]\nthen\ncat /opt/ads-agent/phpDefault.json | sed -e 's/idFortify/'$cversion'/g' | curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d @- '$(FORTIFY_API)/bulk'\nfi\nelse \necho \"A Application Version: 0.0.1 já esta criada no Fortify\"\nfi\n"
    - task: Bash@3
      displayName: 'Iniciando Analise no Fortify'
      inputs:
        targetType: inline
        script: "set -x\necho \"Iniciando Fortify Clean, Translate e Analysis\" \np_lang=`echo '$(p_language)' | sed \"s/[[:punct:]]\\+$//\"`\necho \"LANG $p_lang\"\ncd $(Build.SourcesDirectory)\nchmod +x gradlew\nscancentral arguments -o -targs \"-exclude './**/build/**/*'\" -targs \"-Xms8G -Xmx8G\" -sargs \"-Xms12G -Xmx12G\"\nscancentral -url $(SCANCENTRAL_URL) start -bt gradle -bc assemble$(buildType) -skipBuild -pool $(FORTIFY_POOL_SILVER) -application $(REPOSITORIO) -version 0.0.1 -uptoken $(FORTIFY_UPTOKEN) -upload\n"
- stage: HMP
  dependsOn: []
  variables:
  - group: SIFAM_ANDROID_HMP
  jobs:
  - deployment: GooglePlay_HMP
    pool:
      vmImage: 'ubuntu-latest'
    displayName: 'Build e Distribuição App HMP'
    environment:
      name: 'HMP'
    strategy:
      runOnce:
        deploy:
          steps:
          - task: 6d15af64-176c-496d-b583-fd2ae21d4df4@1
            inputs:
              repository: self
          - task: Bash@3
            displayName: 'Exibe informações do Aplicativo (Build, Versão e Code)'
            inputs:
              targetType: inline
              script: "java -version \ncode=1\nexport code_new=$((code + $(N)))\necho \"##vso[task.setvariable variable=CODE_NEW]$code_new\"\nversion=0.0.1\necho \"##vso[task.setvariable variable=VERSION_BUILD]$version\"\necho \"Build: $(buildType)\"\necho \"Versão: $version\" \necho \"Code: $code_new\"\n"
          - task: Bash@3
            displayName: 'Atualiza BuildName'
            inputs:
              targetType: inline
              script: >
                echo "Build $(buildType) | Version 0.0.1 | Code $(CODE_NEW)"

                build_name="Version 0.0.1 - ID $(build.buildNumber) - Code $(CODE_NEW)"

                echo "##vso[build.updatebuildnumber]$build_name"
          - task: Bash@3
            displayName: 'Valida Integridade da Branch'
            inputs:
              targetType: inline
              script: |
                curl -v --silent --user $(gitUser):$(gitToken) $(gitUrl)/diffs/commits?baseVersion=$(Build.SourceVersion)'&'baseVersionType=commit'&'targetVersion=main'&'api-version=6.0 | grep "\"aheadCount\":0," && echo "##vso[task.complete result=Succeeded;]" || echo "##vso[task.complete result=Failed;]"
          - task: Bash@3
            condition: failed()
            displayName: 'Exibe alerta de Branch expirada'
            inputs:
              targetType: inline
              script: |
                echo "##vso[task.logissue type=error]---- ALERTA ---- Verifique o merge da main para a sua branch ---- ALERTA ----."
                exit 1
          - task: Cache@2
            inputs:
              key: 'gradle | "$(Agent.OS)" | **/build.gradle | **/dependencies.gradle'
              restoreKeys: |
                gradle | "$(Agent.OS)"
                gradle
              path: $(GRADLE_USER_HOME)
            displayName: 'Configura o Gradle Cache'
          - task: Gradle@3
            inputs:
              gradleWrapperFile: '$(Build.Repository.Name)/gradlew'
              workingDirectory: '$(Build.Repository.Name)'
              tasks: '$(gradleBuild)'
              publishJUnitResults: false
              javaHomeOption: 'JDKVersion'
              jdkVersionOption: '1.11'
              gradleOptions: '-Xmx3072m'
              sonarQubeRunAnalysis: false
              spotBugsAnalysis: false
            displayName: 'Gera Pacote'
          - task: CmdLine@2
            displayName: 'Para o Gradle Daemon'
            inputs:
              script: |
                $(Build.Repository.Name)/gradlew --stop
          - task: Bash@3
            name: Variaveis
            displayName: 'Recupera Informações do Pacote'
            inputs:
              targetType: inline
              script: >
                app_path=$(find . -iname "$(nameApp)-0.0.1*$(buildType)*.a*" | head -n 1)

                app_name=$(basename "$app_path")

                app_ext="${app_name##*.}"

                app_signed=$(nameApp)-0.0.1-$(buildType).$app_ext

                echo "##vso[task.setvariable variable=APP_PATH]$app_path"

                echo "##vso[task.setvariable variable=APP_NAME]$app_name"

                echo "##vso[task.setvariable variable=APP_EXT]$app_ext"

                echo "##vso[task.setvariable variable=APP_SIGNED]$app_signed"

                echo "Caminho do aplicativo compilado: $app_path"

                echo "Nome do aplicativo compilado: $app_name"

                echo "Extensão do aplicativo: $app_ext"

                echo "Nome do aplicativo assinado: $app_signed"
          - task: Bash@3
            condition: eq(variables['APP_EXT'], 'apk')
            displayName: 'Assina Pacote APK'
            inputs:
              targetType: inline
              script: |
                /usr/local/lib/android/sdk/build-tools/$(buildTools)/apksigner sign -v --ks $(System.DefaultWorkingDirectory)/devops/config/$(caixaKeyStore) --ks-key-alias $(aliasKeyStore) --ks-pass pass:$(caixaKeystorePass) --key-pass pass:$(caixaKeystorePass) $(APP_PATH)
                mv $(APP_PATH) $(APP_SIGNED)
                /usr/local/lib/android/sdk/build-tools/$(buildTools)/apksigner verify -v $(APP_SIGNED)
          - task: Bash@3
            condition: eq(variables['APP_EXT'], 'aab')
            displayName: 'Assina Pacote BUNDLE'
            inputs:
              targetType: inline
              script: |
                jarsigner -verbose -sigalg SHA1withRSA -digestalg SHA1 -keystore $(System.DefaultWorkingDirectory)/devops/config/$(caixaKeyStore) -storepass $(caixaKeystorePass) $(APP_PATH) $(aliasKeyStore)
                mv $(APP_PATH) $(APP_SIGNED)
                jarsigner -verbose -verify $(APP_SIGNED)
          - task: PublishBuildArtifacts@1
            inputs:
              PathtoPublish: $(APP_SIGNED)
              artifactName: $(buildType)-0.0.1
            displayName: 'Publica Pacote APK ou BUNDLE'
          - task: GooglePlayRelease@4
            inputs:
              authType: 'JsonFile'
              serviceAccountKey: '$(System.DefaultWorkingDirectory)/devops/config/$(JsonApiCaixaKey)'
              applicationId: '$(packageId)'
              action: 'SingleBundle'
              bundleFile: '$(APP_SIGNED)'
              track: '$(trackGooglePlay)'
              languageCode: 'pt-BR'
              releaseName: '0.0.1'
              isDraftRelease: true
            displayName: 'Distribui aplicativo BUNDLE - Google Play'
  - job: NexusUpload
    dependsOn:
    - GooglePlay_HMP
    pool:
      name: 'VMSSAgentPoolUbuntu'
    steps:
    - task: DownloadBuildArtifacts@1
      inputs:
        buildType: 'current'
        downloadType: 'single'
        artifactName: $(buildType)-0.0.1
        downloadPath: '$(Build.ArtifactStagingDirectory)'
      displayName: 'Resgata APP do Drop'
    - task: Bash@3
      displayName: 'Armazena APP no Nexus'
      inputs:
        targetType: inline
        script: >
          cd $(Build.ArtifactStagingDirectory)/$(buildType)-0.0.1

          app_path=$(find . -iname "$(nameApp)-0.0.1-$(buildType)*.a*" | head -n 1)

          app_name=$(basename "$app_path")

          app_ext="${app_name##*.}"

          app_signed=$(nameApp)-0.0.1-$(buildType).$app_ext

          PATH=$PATH:/opt/apache-maven-3.8.6/bin

          mvn deploy:deploy-file -Durl=$(nexusUrl) -DrepositoryId=caixa-mobilidade -Dfile=$app_signed -DgroupId=$(packageId) -DartifactId=$(nameApp) -Dversion=0.0.1-$(buildType).$(build.buildId) -Dpackaging=$app_ext
- stage: PRD
  dependsOn: []
  variables:
  - group: SIFAM_ANDROID_PRD
  jobs:
  - deployment: GooglePlay_PRD
    pool:
      vmImage: 'ubuntu-latest'
    displayName: 'Build e Distribuição App PRD'
    environment:
      name: 'PRD'
    strategy:
      runOnce:
        deploy:
          steps:
          - task: 6d15af64-176c-496d-b583-fd2ae21d4df4@1
            inputs:
              repository: self
          - task: Bash@3
            displayName: 'Exibe informações do Aplicativo (Build, Versão e Code)'
            inputs:
              targetType: inline
              script: "java -version \ncode=1\nexport code_new=$((code + $(N)))\necho \"##vso[task.setvariable variable=CODE_NEW]$code_new\"\nversion=0.0.1\necho \"##vso[task.setvariable variable=VERSION_BUILD]$version\"\necho \"Build: $(buildType)\"\necho \"Versão: $version\" \necho \"Code: $code_new\"\n"
          - task: Bash@3
            displayName: 'Atualiza BuildName'
            inputs:
              targetType: inline
              script: >
                echo "Build $(buildType) | Version 0.0.1 | Code $(CODE_NEW)"

                build_name="Version 0.0.1 - ID $(build.buildNumber) - Code $(CODE_NEW)"

                echo "##vso[build.updatebuildnumber]$build_name"
          - task: Bash@3
            displayName: 'Valida Integridade da Branch'
            inputs:
              targetType: inline
              script: |
                curl -v --silent --user $(gitUser):$(gitToken) $(gitUrl)/diffs/commits?baseVersion=$(Build.SourceVersion)'&'baseVersionType=commit'&'targetVersion=main'&'api-version=6.0 | grep "\"aheadCount\":0," && echo "##vso[task.complete result=Succeeded;]" || echo "##vso[task.complete result=Failed;]"
          - task: Bash@3
            condition: failed()
            displayName: 'Exibe alerta de Branch expirada'
            inputs:
              targetType: inline
              script: |
                echo "##vso[task.logissue type=error]---- ALERTA ---- Verifique o merge da main para a sua branch ---- ALERTA ----."
                exit 1
          - task: Cache@2
            inputs:
              key: 'gradle | "$(Agent.OS)" | **/build.gradle | **/dependencies.gradle'
              restoreKeys: |
                gradle | "$(Agent.OS)"
                gradle
              path: $(GRADLE_USER_HOME)
            displayName: 'Configura o Gradle Cache'
          - task: Gradle@3
            inputs:
              gradleWrapperFile: '$(Build.Repository.Name)/gradlew'
              workingDirectory: '$(Build.Repository.Name)'
              tasks: '$(gradleBuild)'
              publishJUnitResults: false
              javaHomeOption: 'JDKVersion'
              jdkVersionOption: '1.11'
              gradleOptions: '-Xmx3072m'
              sonarQubeRunAnalysis: false
              spotBugsAnalysis: false
            displayName: 'Gera Pacote'
          - task: CmdLine@2
            displayName: 'Para o Gradle Daemon'
            inputs:
              script: |
                $(Build.Repository.Name)/gradlew --stop
          - task: Bash@3
            name: Variaveis
            displayName: 'Recupera Informações do Pacote'
            inputs:
              targetType: inline
              script: >
                app_path=$(find . -iname "$(nameApp)-0.0.1*$(buildType)*.a*" | head -n 1)

                app_name=$(basename "$app_path")

                app_ext="${app_name##*.}"

                app_signed=$(nameApp)-0.0.1-$(buildType).$app_ext

                echo "##vso[task.setvariable variable=APP_PATH]$app_path"

                echo "##vso[task.setvariable variable=APP_NAME]$app_name"

                echo "##vso[task.setvariable variable=APP_EXT]$app_ext"

                echo "##vso[task.setvariable variable=APP_SIGNED]$app_signed"

                echo "Caminho do aplicativo compilado: $app_path"

                echo "Nome do aplicativo compilado: $app_name"

                echo "Extensão do aplicativo: $app_ext"

                echo "Nome do aplicativo assinado: $app_signed"
          - task: Bash@3
            condition: eq(variables['APP_EXT'], 'apk')
            displayName: 'Assina Pacote APK'
            inputs:
              targetType: inline
              script: |
                /usr/local/lib/android/sdk/build-tools/$(buildTools)/apksigner sign -v --ks $(System.DefaultWorkingDirectory)/devops/config/$(caixaKeyStore) --ks-key-alias $(aliasKeyStore) --ks-pass pass:$(caixaKeystorePass) --key-pass pass:$(caixaKeystorePass) $(APP_PATH)
                mv $(APP_PATH) $(APP_SIGNED)
                /usr/local/lib/android/sdk/build-tools/$(buildTools)/apksigner verify -v $(APP_SIGNED)
          - task: Bash@3
            condition: eq(variables['APP_EXT'], 'aab')
            displayName: 'Assina Pacote BUNDLE'
            inputs:
              targetType: inline
              script: |
                jarsigner -verbose -sigalg SHA1withRSA -digestalg SHA1 -keystore $(System.DefaultWorkingDirectory)/devops/config/$(caixaKeyStore) -storepass $(caixaKeystorePass) $(APP_PATH) $(aliasKeyStore)
                mv $(APP_PATH) $(APP_SIGNED)
                jarsigner -verbose -verify $(APP_SIGNED)
          - task: PublishBuildArtifacts@1
            inputs:
              PathtoPublish: $(APP_SIGNED)
              artifactName: $(buildType)-0.0.1
            displayName: 'Publica Pacote APK ou BUNDLE'
          - task: GooglePlayRelease@4
            inputs:
              authType: 'JsonFile'
              serviceAccountKey: '$(System.DefaultWorkingDirectory)/devops/config/$(JsonApiCaixaKey)'
              applicationId: '$(packageId)'
              action: 'SingleBundle'
              bundleFile: '$(APP_SIGNED)'
              track: '$(trackGooglePlay)'
              languageCode: 'pt-BR'
              releaseName: '0.0.1'
              isDraftRelease: true
            displayName: 'Distribui aplicativo BUNDLE - Google Play'
          - task: Bash@3
            displayName: 'Unlock Main'
            inputs:
              targetType: inline
              script: |
                curl -k --user $(gitUser):$(gitToken) \
                --header "Content-Type: application/json" \
                --request PATCH \
                --data '{"isLocked": false}' \
                $(gitUrl)/refs?filter=heads/main'&'api-version=6.0
          - task: Bash@3
            displayName: 'Realiza merge do commit da entrega para a branch Main'
            inputs:
              targetType: inline
              script: |
                cd $(System.DefaultWorkingDirectory)
                git remote set-url origin https://$(gitUser):$(gitToken)@$(gitName)
                git checkout main
                git merge $(Build.SourceVersion)
                git push origin main
          - task: Bash@3
            displayName: 'Lock Main'
            inputs:
              targetType: inline
              script: |
                curl -k --user $(gitUser):$(gitToken) \
                --header "Content-Type: application/json" \
                --request PATCH \
                --data '{"isLocked": true}' \
                $(gitUrl)/refs?filter=heads/main'&'api-version=6.0
  - job: NexusUpload
    dependsOn:
    - GooglePlay_PRD
    pool:
      name: 'VMSSAgentPoolUbuntu'
    steps:
    - task: DownloadBuildArtifacts@1
      inputs:
        buildType: 'current'
        downloadType: 'single'
        artifactName: $(buildType)-0.0.1
        downloadPath: '$(Build.ArtifactStagingDirectory)'
      displayName: 'Resgata APP do Drop'
    - task: Bash@3
      displayName: 'Armazena APP no Nexus'
      inputs:
        targetType: inline
        script: >
          cd $(Build.ArtifactStagingDirectory)/$(buildType)-0.0.1

          app_path=$(find . -iname "$(nameApp)-0.0.1-$(buildType)*.a*" | head -n 1)

          app_name=$(basename "$app_path")

          app_ext="${app_name##*.}"

          app_signed=$(nameApp)-0.0.1-$(buildType).$app_ext

          PATH=$PATH:/opt/apache-maven-3.8.6/bin

          mvn deploy:deploy-file -Durl=$(nexusUrl) -DrepositoryId=caixa-mobilidade -Dfile=$app_signed -DgroupId=$(packageId) -DartifactId=$(nameApp) -Dversion=0.0.1-$(buildType).$(build.buildId) -Dpackaging=$app_ext

