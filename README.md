# Variable Group 'BUILD_VARIABLES' was defined in the Variables tab
# Variable Group 'SONAR_VARIABLES - PRODUTOS' was defined in the Variables tab
# Variable Group 'SAST_FORTIFY_COMUNIDADE_RISCO' was defined in the Variables tab
resources:
  repositories:
  - repository: self
    type: git
    ref: refs/heads/master
jobs:
- job: Job_1
  displayName: Agent job 1
  pool:
    name: Build-Linux
  steps:
  - checkout: self
  - task: Bash@3
    displayName: Validação da VEC
    enabled: False
    inputs:
      targetType: inline
      script: "echo \"##[section]branch/tag: $BUILD_SOURCEBRANCHNAME\"\n\necho \"##[warning] -------------------- ATENÇÃO --------------------\n##[warning] Foi definido que a partir de 01/2025 apenas compilações oriundas de tag dentro do padrão estabelecido no PPDS poderão ser implantadas em HMP/PRD.\n##[warning] Para mais informações visite https://caixa.sharepoint.com/sites/PPDS/SitePages/GCM_Diretrizes_Padrao_Baseline.aspx ou consulte a GEQTI04\n-------------------------------------------------\"\n\npontos=`echo ${BUILD_SOURCEBRANCHNAME//[^\\.]} | sed 's/\\./\\.\\n/g' | wc -w`\nnumber=`echo $BUILD_SOURCEBRANCHNAME | sed 's/\\.//g'`\n\nif [[ ${pontos} = 3 ]];then\nif [[ ${number} =~ ^([0-9]+)$ ]];then\necho \"VEC $BUILD_SOURCEBRANCHNAME dentro do padrão estabelecido pelo PPDS.\nPacote apto a ser implantado em HMP/PRD.\"\nvec='true'\necho \"##vso[build.updatebuildnumber]\"$BUILD_SOURCEBRANCHNAME\"\"\nelse\necho \"A TAG $BUILD_SOURCEBRANCHNAME utilizada não se encontra dentro do padrão estabelecido pelo PPDS e este pacote não poderá ser implantado nos ambientes HMP/PRD.\"\nvec='false'\nfi\nelse\necho \"Foi selecionada para compilação uma branch ou tag fora do padrão estabelcido no PPDS. Esteja ciente de que este pacote poderá ser implantado somente em ambientes NPRD\"\nvec='false'\nfi\necho \"##[section]Valida VEC: $vec\"\necho \"##vso[task.setvariable variable=valida.vec;]$vec\"\n\necho \"------------------------------------------------- \nps: Essa regra se aplicará somente a projetos que possuem infra HMP/PRD criada na esteira devops.\nAté o presente momento esse passo é meramente INFORMATIVO, a aplicação da trava será realizada somente em janeiro de 2025\""
  - task: Bash@3
    displayName: Localização do Repositório
    inputs:
      targetType: inline
      script: >
        if [[ "$BUILD_REPOSITORY_URI" == *"github.com"* ]]; then

        echo "É um repositório do GitHub"

        REPO_FINAL_NAME=`basename "$BUILD_REPOSITORY_URI" .git`

        echo "##vso[task.setvariable variable=fortify_disable;]gecmi"

        echo "##vso[task.setvariable variable=sonar_disable;]true"

        else

        echo "É um repositório do Devops.Caixa"

        REPO_FINAL_NAME=`echo $(Build.Repository.Name)`

        fi

        echo "Nome do repositório: $REPO_FINAL_NAME"

        echo "##vso[task.setvariable variable=REPO_FINAL_NAME;]$REPO_FINAL_NAME"
  - task: Bash@3
    displayName: Validação da VEC
    inputs:
      targetType: inline
      script: "echo \"##[section]branch/tag: $BUILD_SOURCEBRANCHNAME\"\n\necho \"##[warning] -------------------- ATENÇÃO --------------------\n##[warning] Foi definido conforme CE GEQTI 011/2024 que a partir de 03/2025 apenas compilações oriundas de tag dentro do padrão estabelecido no PPDS poderão ser implantadas em TQS/HMP/PRD.\n##[warning] Para mais informações acesse as urls:\n##[warning] https://devops.caixa/projetos/Caixa/_wiki/wikis/Caixa.wiki/1689/Valida%C3%A7%C3%A3o-da-VEC\n##[warning] https://caixa.sharepoint.com/sites/PPDS/SitePages/GCM_Diretrizes_Padrao_Baseline.aspx ou consulte a GEQTI04\n-------------------------------------------------\"\necho $BUILD_SOURCEBRANCH\nif [[ `echo $BUILD_SOURCEBRANCH | grep -c tags` -gt 0 ]];then\npontos=`echo ${BUILD_SOURCEBRANCHNAME//[^\\.]} | sed 's/\\./\\.\\n/g' | wc -w`\nnumber=`echo $BUILD_SOURCEBRANCHNAME | sed 's/\\\\.//g'`\n\nif [[ ${pontos} = 3 ]];then\nif [[ ${number} =~ ^([0-9]+)$ ]];then\necho \"VEC $BUILD_SOURCEBRANCHNAME dentro do padrão estabelecido pelo PPDS.\nPacote apto a ser implantado em TQS/HMP/PRD.\"\nvec='true'\necho \"##vso[build.updatebuildnumber]\"$BUILD_SOURCEBRANCHNAME\"\"\nelse\necho \"A TAG $BUILD_SOURCEBRANCHNAME não se encontra dentro do padrão estabelecido pelo PPDS e este pacote não poderá ser implantado nos ambientes TQS/HMP/PRD.\"\nvec='false'\nfi\nelse\necho \"A TAG $BUILD_SOURCEBRANCHNAME não se encontra dentro do padrão estabelecido pelo PPDS e este pacote não poderá ser implantado nos ambientes TQS/HMP/PRD.\"\nvec='false'\nfi\nelif [[ `echo $BUILD_SOURCEBRANCH | grep -c heads` -gt 0 ]];then\necho \"##[warning]Foi selecionada para compilação uma branch. Esteja ciente de que este pacote poderá ser implantado somente em ambiente DES.\"\nvec='false'\nelse\necho \"##[warning]Foi selecionada para compilação uma branch. Esteja ciente de que este pacote poderá ser implantado somente em ambiente DES.\"\nvec='false'\nfi\n\necho \"##[section]Valida VEC: $vec\"\necho \"##vso[task.setvariable variable=valida.vec;]$vec\"\n\necho \"------------------------------------------------- \nps: Essa regra se aplica somente a projetos que possuem infra criada na esteira devops.\""
  - task: Bash@3
    displayName: Obtendo branch do Sonar
    enabled: False
    inputs:
      targetType: inline
      script: >-
        if [[ `echo $BUILD_SOURCEBRANCH | grep -c tags` -gt 0 ]];then

        token=$(AZPAT)


        #Apresenta object_id da tag

        object_id_tag=`curl -s -u :$token "https://devops.caixa/projetos/Caixa/_apis/git/repositories/$BUILD_REPOSITORY_NAME/refs?filter=tags/$BUILD_SOURCEBRANCHNAME&api-version=7.0" | jq -r '.value[0].objectId'`


        echo "Commit da TAG: " $object_id_tag


        #Apresenta commit_id branch

        object_id_commit=`curl -s -u :$token "https://devops.caixa/projetos/Caixa/_apis/git/repositories/$BUILD_REPOSITORY_NAME/annotatedtags/$object_id_tag?api-version=7.0" | jq -r '.taggedObject.objectId'`


        echo "Commit da branch que gerou a tag: " $object_id_commit


        #Pasea json localiza branch

        branch_of_tag=`curl -s -u :$token "https://devops.caixa/projetos/Caixa/_apis/git/repositories/$BUILD_REPOSITORY_NAME/refs?filter=heads&api-version=7.0" | jq -c '.value[] | select(.objectId | contains("'$object_id_commit'")).name' | awk 'NR==1'`


        if [ -z $branch_of_tag ];then

        echo "Não foi possível localizar a Branch que originou a TAG."

        sonar_branch=$BUILD_SOURCEBRANCHNAME

        else

        branch_of_tag=`echo $branch_of_tag | sed -e 's/\"//g'`

        echo "Branch que gerou a Tag: " $branch_of_tag

        sonar_branch=`echo $branch_of_tag | awk -F '/' '{print $NF'}`

        fi


        else


        sonar_branch=$BUILD_SOURCEBRANCHNAME


        fi


        echo $sonar_branch


        echo "##vso[task.setvariable variable=sonar_branch;]$sonar_branch"
  - task: Bash@3
    displayName: Obtendo branch do Sonar
    inputs:
      targetType: inline
      script: "#!/usr/bin/env bash\nset -euo pipefail\n\nif [[ `echo $BUILD_SOURCEBRANCH | grep -c tags` -gt 0 ]];then\n\necho \"Build originada de uma TAG.\"\n\n# ====== CONFIGURAÇÃO ======\nTAG=$BUILD_SOURCEBRANCH\nREMOTE=\"origin\"\n\n# ====== RESOLVER COMMIT FINAL DA TAG ======\nif ! COMMIT=`git rev-parse \"$TAG^{commit}\" 2>/dev/null`; then\n  echo \"Erro: a tag '$TAG' não existe ou não é válida.\"\n  exit 1\nfi\n\necho \"Tag        : $TAG\"\necho \"Commit     : $COMMIT\"\necho \"Remote     : $REMOTE\"\necho\necho \"Analisando branches que contêm o commit...\"\necho \"------------------------------------------------------------\"\nprintf \"%-8s %s\\n\" \"DISTÂNCIA\" \"BRANCH\"\necho \"------------------------------------------------------------\"\n\nFOUND=0\n\nwhile read -r BRANCH; do\n  if git merge-base --is-ancestor \"$COMMIT\" \"$BRANCH\"; then\n    DIST=`git rev-list --count \"$COMMIT..$BRANCH\"`\n    \n    # Remove origin/\n    BRANCH_DISPLAY=\"${BRANCH#origin/}\"    \n\n    printf \"%-8s %s\\n\" \"$DIST\" \"$BRANCH_DISPLAY\"\n    FOUND=1\n  fi\ndone < <(\n  git for-each-ref \\\n    --format='%(refname:short)' \\\n    \"refs/remotes/$REMOTE\"\n)\n\nif [[ \"$FOUND\" -eq 0 ]]; then\n  echo \"Nenhuma branch remota contém esse commit.\"\n  exit 1\nfi\n\necho \"------------------------------------------------------------\"\n\n# ====== BRANCH MAIS PROVÁVEL ======\nBEST_BRANCH=$(\n  while read -r BRANCH; do\n    if git merge-base --is-ancestor \"$COMMIT\" \"$BRANCH\"; then\n      # Remove origin/\n      BRANCH_DISPLAY=\"${BRANCH#origin/}\"    \n      echo \"`git rev-list --count \"$COMMIT..$BRANCH\"` $BRANCH_DISPLAY\"\n    fi\n  done < <(\n    git for-each-ref \\\n      --format='%(refname:short)' \\\n      \"refs/remotes/$REMOTE\"\n  ) | sort -n | head -n1\n)\n\nBEST_DISTANCE=`echo \"$BEST_BRANCH\" | awk '{print $1}'`\nBEST_NAME=`echo \"$BEST_BRANCH\" | awk '{print $2}'`\n\necho \"Branch mais provável de origem:\"\necho \"$BEST_NAME (distância: $BEST_DISTANCE commits)\"\n\nelse\n\necho \"Build originada de uma BRANCH.\"\nBEST_NAME=$BUILD_SOURCEBRANCHNAME\n\nfi\n\necho \"Branch que será informada para o SONAR: $BEST_NAME \"\n\necho \"##vso[task.setvariable variable=sonar_branch;]$BEST_NAME\"\n"
  - task: Bash@3
    displayName: Configurando Registry NPM
    inputs:
      targetType: inline
      script: >-
        npm config set email pipeline-agil@mail.caixa

        npm config set registry http://binario.caixa:8081/repository/npm-all/

        npm config set sass_binary_site http://binario.caixa:8081/repository/node-sass/

        npm config set strict-ssl false


        npm config list
  - task: CopyFiles@2
    displayName: 'Copy Files to: $(Agent.BuildDirectory)/fortify'
    condition: ne(variables['fortify_disable'], 'gecmi')
    inputs:
      SourceFolder: $(Build.SourcesDirectory)
      TargetFolder: $(Agent.BuildDirectory)/fortify
      CleanTargetFolder: true
  - task: Maven@4
    displayName: Maven
    inputs:
      mavenPOMFile: spring-batch-main/pom.xml
      goals: clean compile install -DskipTests=false
      publishJUnitResults: false
      javaHomeSelection: Path
      jdkUserInputPath: /usr/java/open-jdk-21.0.5/
      mavenVersionSelection: Path
      mavenPath: /opt/apache-maven/apache-maven-3.9.9/
      mavenOpts: '-Xms1024m -Xmx6144m '
  - task: Bash@3
    displayName: Recupera versão projeto (groupId:artifactId:type:version)
    inputs:
      targetType: inline
      script: "cd $(Build.SourcesDirectory)\n\nfind . -name maven-wrapper.jar -delete\n\necho \"Entrando no diretório: $(Build.SourcesDirectory)\"\necho \"Arquivos encontrados: `ls -la`\"\n\nif [ -z \"$TARGET_PATH\" ]; then \n	TARGET_PATH=\".\" \nfi\n\nfor extension in ear war jar\ndo\n   file=`find $TARGET_PATH -name \"*.${extension}\"`\n   if [ -n \"${file}\" ]\n   then\n			PROJECT_FILE=\"${file}\"\n			p_extension=\"${extension}\"\n			break\n   fi\ndone\n\necho \"Encontrado o arquivo: $file\\n\"\n\nexport PROJECT_DIR=`dirname ${PROJECT_FILE}`\nexport PROJECT_POM_PROPERTIES_FILE=`find ${PROJECT_DIR} -name pom.properties`\n\necho \"Diretório do projeto: $PROJECT_DIR\"\necho \"Conteúdo do diretório: `ls -la $PROJECT_DIR`\"\necho \"Arquivo POM: $PROJECT_POM_PROPERTIES_FILE\"\n\n#if [ -z $PROJECT_POM_PROPERTIES_FILE ]\n#then\n#      echo \"Arquivo pom.properties não encontrado, favor verificar a versão da TAG <maven-ear-plugin-version> no pom.properties, algumas versões #possuem BUG e não gera o arquivo.\"\n#      exit 1\n#fi\n\n\np_version=`egrep version ${PROJECT_POM_PROPERTIES_FILE} | awk -F = {'print $2'}`		 \np_group=`egrep groupId ${PROJECT_POM_PROPERTIES_FILE} | awk -F = {'print $2'}`\np_artifact=`egrep artifactId ${PROJECT_POM_PROPERTIES_FILE} | awk -F = {'print $2'}`\np_projectKey=`echo $p_artifact | tr -cd '[:alnum:]'` \n\necho \"${p_group}:${p_artifact}:${p_extension}:${p_version}\"\n\necho \"##vso[task.setvariable variable=project.group;]$p_group\"\n\necho \"##vso[task.setvariable variable=project.name;]$p_artifact\"\n\necho \"##vso[task.setvariable variable=project.version;]$p_version\"\n\necho \"##vso[task.setvariable variable=project.extension;]$p_extension\"\n\necho \"##vso[task.setvariable variable=project.key;]$p_projectKey\"\n\necho \"##vso[task.setvariable variable=project.file;]${PROJECT_FILE}\"\n\nif [[ ! -z ${PROJECT_RELEASE} ]] && ([ ${PROJECT_RELEASE} == false ] || [ ${PROJECT_RELEASE} == true ]) ; then\n\necho \"##vso[task.setvariable variable=project.release;]${PROJECT_RELEASE}\"\n\nelse\n\necho \"##vso[task.setvariable variable=project.release;]true\"\n\nif [[ ${p_version} == *\"SNAPSHOT\"* ]]; then\n  echo \"##vso[task.setvariable variable=project.release;]false\"\nfi\n\nfi\n\necho \"##vso[task.setvariable variable=POM_PATH;]spring-batch-main/pom.xml\"\n\n"
      failOnStderr: true
  - task: Bash@3
    displayName: Recupera repositório nexus
    inputs:
      targetType: inline
      script: >-
        #tudo que não for padrão VEC é snapshot

        if [ $(valida.vec) = true ]; then

        NEXUS_URL=$(NEXUS_URL_MAVEN_RELEASE)

        else

        NEXUS_URL=$(NEXUS_URL_MAVEN_SNAPSHOT)

        fi



        p_repository=`echo ${NEXUS_URL##*/}`

        echo "##vso[task.setvariable variable=project.repository;]$p_repository"
  - task: DownloadSecureFile@1
    displayName: Download secure file
    inputs:
      secureFile: d2041121-de1c-45da-9c21-5e8a73c00647
  - task: Bash@3
    displayName: Definindo Linguagem de Programação
    inputs:
      targetType: inline
      script: >
        #!/bin/bash

        set -o errexit

        set -o nounset

        set -o pipefail


        cd $(Build.SourcesDirectory)

        for file in pom.xml angular.json tsconfig.json package.json project.ini *.csproj *.sln

        do
           f_language=`find . -maxdepth 3 -name "${file}" -exec basename {} \; | head -n 1`
           if [[ "${f_language}" == pom.xml ]]
            then
                p_language=java
                break
           elif [[ "${f_language}" == angular.json ]] || [[ "${f_language}" == tsconfig.json ]]
                 then
                    p_language=angular
                break
           elif [[ "${f_language}" == package.json ]]
             then
                    p_language=nodejs
                break
           elif [[ "${f_language}" == project.ini ]]
             then
                    p_language=php
                break
           elif [[ "${f_language}" == *".csproj" ]] || [[ "${f_language}" == *".sln" ]]
             then
                    p_language=dotnet
                break
             else
                echo "Não foi possivel determinar a linguagem da aplicação do codigo fonte"
                   p_language=null
           fi
        done


        echo "Linguagem de Programação:" $p_language

        echo "##vso[task.setvariable variable=p_language;]$p_language"



        RepositoryName=`(echo "$(REPO_FINAL_NAME)" | tr '[[:upper:]]' '[[:lower:]]')`

        echo "##vso[task.setvariable variable=REPOSITORIO;]$RepositoryName"
  - task: Bash@3
    displayName: Verifica se pacote existe no binario.caixa
    inputs:
      targetType: inline
      script: "if [ $(valida.vec) = true ]; then\n\nreplace=\"\\/\"\n\np_name=\"$(project.name)\"\np_version=\"$(project.version)\"\np_extension=\"$(project.extension)\"\np_group=$(project.group) || true\np_group=`[ -z \"$p_group\" ] && echo \"\"br.gov.caixa.$p_name\"\" || echo \"$p_group\"`\np_group=`echo $p_group | awk -F \":\" '{print $1}' | sed -e \"s/\\./${replace}/g\"`\n\np_group=`[ ! -z \"$p_group\" ] && echo \"/$p_group\"`\n	\np_version=$BUILD_SOURCEBRANCHNAME	\n\n	p_version=`echo \"${p_version}\" | sed -r 's/([A-Z]+)//g'`\n        [[ $p_version = *- ]] && p_version=`echo $p_version | sed 's/.$//'`\n\n	p_file=\"$p_name-$p_version.$p_extension\"\n\n       echo $(NEXUS_URL_MAVEN_RELEASE)/$p_group/$p_name/$p_version/$p_file\n	response=`curl -s --head $(NEXUS_URL_MAVEN_RELEASE)/$p_group/$p_name/$p_version/$p_file | head -n 1 | grep \"HTTP/1.[01] [234]..\"`\n\n	code=`echo $response | awk '{print $2}'` \n\n	if [ ${code} = \"200\" ]; then\n		echo \"Pacote com identificador $BUILD_SOURCEBRANCHNAME já existe no repositório, por favor compile utilizando outra TAG\";\n		exit 1\n	fi\nfi"
  - task: Bash@3
    displayName: Run Code Analisis
    condition: and(ne(variables['sonar_disable'], 'true'), succeeded())
    inputs:
      targetType: inline
      script: >-
        #!/bin/bash


        if [[ "$(p_language)" != "dotnet" ]]

        then


        p_name=$(REPO_FINAL_NAME)

        p_version=$(project.version)

        p_projectKey=$(REPO_FINAL_NAME)


        #p_properties=`echo $(SONAR_PROPERTIES)`

        #echo "SONAR_PROPERTIES" $(SONAR_PROPERTIES)

        #echo "p_properties" $p_properties


        echo sonar-scanner -Dsonar.host.url=$(SONAR_URL) -Dsonar.login=$(SONAR_LOGIN) -Dsonar.password=$(SONAR_PASSWORD) -Dsonar.projectKey=$p_projectKey -Dsonar.projectName=$p_name -Dsonar.projectVersion=$p_version -Dsonar.sources=. $(SONAR_PROPERTIES)


        sonar-scanner -Dsonar.host.url=$(SONAR_URL) -Dsonar.login=$(SONAR_LOGIN) -Dsonar.password=$(SONAR_PASSWORD) -Dsonar.projectKey=$p_projectKey -Dsonar.projectName=$p_name -Dsonar.projectVersion=$p_version -Dsonar.sources=. $(SONAR_PROPERTIES)


        fi
  - task: Bash@3
    displayName: Publish Quality Gate Result
    condition: and(ne(variables['sonar_disable'], 'true'), succeeded())
    timeoutInMinutes: 5
    inputs:
      targetType: inline
      script: >-
        #!/bin/bash


        if [[ "$(p_language)" != "dotnet" ]]

        then


        cd $(Build.SourcesDirectory)


        REPORT_PATH=".scannerwork/report-task.txt"

        CE_TASK_ID_KEY="ceTaskId="


        SONAR_INSTANCE=$(SONAR_URL)

        SONAR_ACCESS_LOGIN=$(SONAR_LOGIN)

        SONAR_ACCESS_PASSWORD=$(SONAR_PASSWORD)

        SLEEP_TIME=5


        echo "QG Script --> Using SonarQube instance ${SONAR_INSTANCE}"

        echo "QG Script --> Using SonarQube access login ${SONAR_ACCESS_LOGIN}"


        # get the compute engine task id

        ce_task_id=`cat $REPORT_PATH | grep $CE_TASK_ID_KEY | cut -d'=' -f2`

        echo "QG Script --> Using task id of ${ce_task_id}"


        if [ -z "$ce_task_id" ]; then
           echo "QG Script --> No task id found"
           exit 1
        fi


        # grab the status of the task

        # if CANCELLED or FAILED, fail the Build

        # if SUCCESS, stop waiting and grab the analysisId

        wait_for_success=true


        while [ "${wait_for_success}" = "true" ]

        do

          ce_status=`curl --connect-timeout 3 --max-time 7 --retry 7 --retry-delay 0 --retry-max-time 50 -s -u ${SONAR_ACCESS_LOGIN}:${SONAR_ACCESS_PASSWORD} "${SONAR_INSTANCE}"/api/ce/task?id=${ce_task_id} | jq -r .task.status`

          echo "QG Script --> Status of SonarQube task is ${ce_status}"

          if [ "${ce_status}" = "CANCELLED" ]; then
            echo "QG Script --> SonarQube Compute job has been cancelled - exiting with error"
            exit 1
          fi

          if [ "${ce_status}" = "FAILED" ]; then
            echo "QG Script --> Ocorrência prevista na TE102 - Não atendimento aos critérios de qualidade"
            exit 1
          fi

          if [ "${ce_status}" = "SUCCESS" ]; then
            wait_for_success=false
          fi

          sleep "${SLEEP_TIME}"

        done


        ce_analysis_id=`curl --connect-timeout 3 --max-time 7 --retry 7 --retry-delay 0 --retry-max-time 50 -s -u ${SONAR_ACCESS_LOGIN}:${SONAR_ACCESS_PASSWORD} $SONAR_INSTANCE/api/ce/task?id=$ce_task_id | jq -r .task.analysisId`

        echo "QG Script --> Using analysis id of ${ce_analysis_id}"


        # get the status of the quality gate for this analysisId

        qg_status=`curl --connect-timeout 3 --max-time 7 --retry 7 --retry-delay 0 --retry-max-time 50 -s -u ${SONAR_ACCESS_LOGIN}:${SONAR_ACCESS_PASSWORD} $SONAR_INSTANCE/api/qualitygates/project_status?analysisId="${ce_analysis_id}" | jq -r .projectStatus.status`

        echo "QG Script --> Quality Gate status is ${qg_status}"


        if [ "${qg_status}" != "OK" ]; then
          echo "##[error]QG Script --> Ocorrência prevista na TE102 - Não atendimento aos critérios de qualidade"
          exit 1
        fi


        fi
      failOnStderr: true
  - task: Bash@3
    displayName: Definindo Version no Fortify
    enabled: False
    inputs:
      targetType: inline
      script: >
        #!/bin/bash


        #set -x


        extrair_versao() {

        echo "$1" | grep -oE '^[0-9]+(\.[0-9]+){0,2}'

        }

        if [[ -n "$(version.app)" && "$(version.app)" =~ ^[0-9] ]] || [[ -n "$(versionApp)" && "$(versionApp)" =~ ^[0-9] ]]

        then

        FORTIFY_VERSION_BUILD=$(extrair_versao "$(version.app)" || extrair_versao "$(versionApp)" )

        if [[ -n "$(Agent.ReleaseDirectory)" && -n "$(Release.PrimaryArtifactSourceAlias)" ]]

        then

        Build_SourcesDirectory="$(Agent.ReleaseDirectory)/$(Release.PrimaryArtifactSourceAlias)"

        echo "##vso[task.setvariable variable=Build.SourcesDirectory;]$Build_SourcesDirectory"

        fi

        else

        FORTIFY_VERSION_BUILD=$(Build.BuildNumber)

        fi

        echo "##vso[task.setvariable variable=FORTIFY_VERSION_BUILD;]$FORTIFY_VERSION_BUILD"

        echo "FORTIFY_VERSION_BUILD=$FORTIFY_VERSION_BUILD"
  - task: Bash@3
    displayName: Checagem de bypass
    condition: and(succeeded(), ne(variables['p_language'], 'dotnet'))
    enabled: False
    inputs:
      targetType: inline
      script: "#!/bin/bash\n\n#set -x\nif [ ! -z \"$(fortify_disable)\" ] && [ $(fortify_disable) = \"true\" ];\nthen\necho - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \necho Análise do fortify encontra-se desabilitada, procure imediatamente o suporte da CESTI36 para que este passo seja habilitado. \necho Bypass a partir de 2024 somente com autorização da GECMI.\necho - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \nreturn 1 2>/dev/null\nexit 1\nelif [ $(fortify_disable) = \"gecmi\" ];\nthen\necho Bypass autorizado pela GECMI.\nelse\necho Projeto habilitado para análise do fortify.\nfi"
  - task: Bash@3
    displayName: Definindo variáveis Fortify
    condition: and(succeeded(), ne(variables['fortify_disable'], 'gecmi'))
    enabled: False
    timeoutInMinutes: 2
    inputs:
      targetType: inline
      script: >-
        #!/bin/bash

        set -o errexit

        set -o nounset

        set -o pipefail

        #set -x


        GitRepositoryName=$(Build.Repository.Name)

        DefinitionName=$(Build.DefinitionName)


        RepositoryName=`(echo "$GitRepositoryName" | tr '[[:upper:]]' '[[:lower:]]')`

        echo "##vso[task.setvariable variable=REPOSITORIO;]$RepositoryName"

        ProjectName=`(echo "$GitRepositoryName" | tr '[[:upper:]]' '[[:lower:]]' | cut -f1 -d"-")`

        echo "##vso[task.setvariable variable=PROJETO;]$ProjectName"


        echo "Definindo liguagem de programação"

        cd $(Build.SourcesDirectory)

        for file in pom.xml angular.json tsconfig.json package.json project.ini *.csproj *.sln build.gradle

        do
           f_language=`find . -maxdepth 3 -name "${file}" -exec basename {} \; | head -n 1`
           if [[ "${f_language}" == pom.xml ]]
            then
                p_language=java
                break
           elif [[ "${f_language}" == angular.json ]] || [[ "${f_language}" == tsconfig.json ]]
                 then
                    p_language=angular
                break
           elif [[ "${f_language}" == package.json ]]
             then
                    p_language=nodejs
                break
           elif [[ "${f_language}" == project.ini ]]
             then
                    p_language=php
                break
           elif [[ "${f_language}" == *".csproj" ]] || [[ "${f_language}" == *".sln" ]]
             then
                    p_language=dotnet
                break
        elif [[ "${f_language}" == "build.gradle" ]]

        then

        p_language=android

        break
             else
                echo "Não foi possivel determinar a linguagem da aplicação do codigo fonte"
                   p_language=null
           fi
        done


        echo "Linguagem de Programação:" $p_language


        echo "##vso[task.setvariable variable=p_language;]$p_language"


        p_lang=`echo "${p_language}" | sed 's/[[:punct:]]\+$//'`

        echo "Liguagem de programação: $p_lang"


        if [ $p_language == null ]
         then
           echo "Não foi possivel definir a linguagem de programação deste codigo fonte"
           exit 1
        fi


        echo "Autenticando no Fortify e adquirindo token"
        	get_token=`curl -s --user $(FORTIFY_USER):$(FORTIFY_PASS) -k -X POST -H "Content-Type:application/json" -d '{"type": "UnifiedLoginToken"}' '$(FORTIFY_API)/tokens'`
            token=`echo $get_token | jq -r '.data.token'`
        	token_id=`echo $get_token | jq -r '.data.id'`
        	response=`echo $get_token | jq -r '.responseCode'`
        	    if [[ $response != 201 ]]
                then
                    echo "Ocorreu um erro ao realizar ação no Fortify Status_code: $response"
        			exit 1
                fi

        echo "##vso[task.setvariable variable=token]$token"

        echo "##vso[task.setvariable variable=token_id]$token_id"
  - task: script-retryer@0
    displayName: Criando Application no Fortify
    condition: and(succeeded(), ne(variables['fortify_disable'], 'gecmi'), ne(variables['p_language'], 'dotnet'))
    enabled: False
    timeoutInMinutes: 2
    inputs:
      targetType: inline
      script: "#!/bin/bash\n\necho \"Repo: $(REPOSITORIO)\"\n#Corrigir caracter bizzaro que o ads coloca (java'\\''')\np_lang=`echo '$(p_language)' | sed 's/[[:punct:]]\\+$//'`\necho \"Liguagem de programação: $p_lang\"\n\necho \"Iniciando fluxo de criação de Application no Fortify\"\nlista_projeto=`curl -k -s -X POST \"$(FORTIFY_API)/projects/action/test\" -H \"Authorization:FortifyToken $(token)\" -H \"accept: application/json\" -H \"Content-Type: application/json\" -d \"{ \\\"applicationName\\\": \\\"$(REPOSITORIO)\\\"}\"`\nlprojeto=`echo $lista_projeto | jq -r '.data.found'`\nresponse=`echo $lista_projeto | jq -r '.responseCode'`\n        if [[ $response != 200 ]]\n        then\n            echo \"Ocorreu um erro ao realizar ação no Fortify Status_code: $response\"\n			exit 1\n        fi\necho \"Listando Application ==>\"$lprojeto\necho \"Listando Application response ==> \"$response\nif [ $lprojeto = false ]\nthen \n  echo \"Criando o Application no Fortify\"\n	cria_projeto=`curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d '{\"name\":\"'$(FORTIFY_VERSION_BUILD)'\",\"description\":\"\",\"active\":true,\"project\":{\"name\":\"'$(REPOSITORIO)'\",\"description\":\"\",\"issueTemplateId\":\"Prioritized-HighRisk-Project-Template\"},\"issueTemplateId\":\"Prioritized-HighRisk-Project-Template\",\"committed\":true}' '$(FORTIFY_API)/projectVersions'`\n	idFortify=`echo $cria_projeto | jq -r '.data.id'`\n    response=`echo $cria_projeto | jq -r '.responseCode'`\n	    if [[ $response != 201 ]]\n        then\n            echo \"Ocorreu um erro ao realizar ação no Fortify Status_code: $response\"\n			exit 1\n        fi	\n    echo \"Project Fortify ID ==> \"$idFortify\n    echo \"Project Fortify ID response ==> \"$response\nsleep 10	\n    #id_versao=`curl -k -s \"$(FORTIFY_API)/projectVersions?start=0&limit=2000&fulltextsearch=false\" -H \"Authorization:FortifyToken $(token)\" -H \"accept: application/json\" -H \"Content-Type: application/json\"`\n	#iversao=`echo $id_versao | jq -r '.data[] | select(.name==\"$(FORTIFY_VERSION_BUILD)\" and .project.name==\"$(REPOSITORIO)\") | .id'`\n	#response=`echo $id_versao | jq -r '.responseCode'`\n	#	if [[ $response != 200 ]]\n    #    then\n    #        echo \"Ocorreu um erro ao realizar ação no Fortify Status_code: $response\"\n	#		exit 1\n    #    fi	\n	#echo \"Project Version ID ==> \"$iversao\n	#echo \"Project Version ID response ==> \"$response\n	\n	if [ $p_lang == android ]\n	then\n		cat /opt/ads-agent/javaDefault.json | sed -e 's/idFortify/'$idFortify'/g' | curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d @- '$(FORTIFY_API)/bulk'	\n	elif [ $p_lang == java ]\n	  then\n	     cat /opt/ads-agent/javaDefault.json | sed -e 's/idFortify/'$idFortify'/g' | curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d @- '$(FORTIFY_API)/bulk'\n	elif [ $p_lang == angular ] || [ $p_lang == nodejs ]\n	   then\n	     cat /opt/ads-agent/javascriptDefault.json | sed -e 's/idFortify/'$idFortify'/g' | curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d @- '$(FORTIFY_API)/bulk'\n	elif [ $p_lang == php ]\n	   then\n	     cat /opt/ads-agent/phpDefault.json | sed -e 's/idFortify/'$idFortify'/g' | curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d @- '$(FORTIFY_API)/bulk'\n	fi\nelse \n  echo \"A Application $(REPOSITORIO) já esta criada no Fortify\"	\nfi"
      delay: 10
      retryTimes: 3
  - task: Bash@3
    displayName: Criando Version no Fortify
    condition: and(succeeded(), ne(variables['fortify_disable'], 'gecmi'), ne(variables['p_language'], 'dotnet'))
    enabled: False
    timeoutInMinutes: 2
    inputs:
      targetType: inline
      script: "#!/bin/bash\n\necho \"Repo: $(REPOSITORIO)\"\n#Corrigir caracter bizzaro que o ads coloca (java'\\''')\np_lang=`echo '$(p_language)' | sed 's/[[:punct:]]\\+$//'`\necho \"Liguagem de programação: $p_lang\"\n\necho \"Criando nova Application Version\"\nlista_versao=`curl -k -s -X POST \"$(FORTIFY_API)/projectVersions/action/test\" -H \"Authorization:FortifyToken $(token)\" -H \"accept: application/json\" -H \"Content-Type: application/json\" -d \"{ \\\"projectName\\\": \\\"$(REPOSITORIO)\\\", \\\"projectVersionName\\\": \\\"$(FORTIFY_VERSION_BUILD)\\\"}\"`\nlversao=`echo $lista_versao | jq -r '.data.found'`\nresponse=`echo $lista_versao | jq -r '.responseCode'`\n        if [[ $response != 200 ]]\n        then\n            echo \"Ocorreu um erro ao realizar ação no Fortify Status_code: $response\"\n			exit 1\n        fi\necho \"listar_versão ==>\"$lversao\necho \"listar_versão response ==>\"$response\nif [ $lversao = false ]\nthen \n  echo \"Criando o versão no fortify para o projeto '$(REPOSITORIO)'\"\n  id_project=`curl -k -s \"$(FORTIFY_API)/projects?start=0&limit=2000&fulltextsearch=false\" -H \"Authorization:FortifyToken $(token) \" -H \"accept: application/json\" -H \"Content-Type: application/json\"`\n    iproject=`echo $id_project | jq -r '.data[] | select (.name==\"$(REPOSITORIO)\") | .id'`\n    response=`echo $id_project | jq -r '.responseCode'`\n	    if [[ $response != 200 ]]\n        then\n            echo \"Ocorreu um erro ao realizar ação no Fortify Status_code: $response\"\n			exit 1\n        fi	\n    echo \"Project ID ==> \"$iproject\n    echo \"Project ID response ==> \"$response\nsleep 8	\n  cria_versao=`curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d '{\"name\":\"'$(FORTIFY_VERSION_BUILD)'\",\"description\":\"\",\"active\":true,\"committed\":true,\"project\":{\"name\":\"'$(REPOSITORIO)'\",\"description\":null,\"issueTemplateId\":\"Prioritized-HighRisk-Project-Template\",\"id\":'$iproject'},\"issueTemplateId\":\"Prioritized-HighRisk-Project-Template\"}' '$(FORTIFY_API)/projectVersions'`\n  	cversion=`echo $cria_versao | jq -r '.data.id'`\n    response=`echo $cria_versao | jq -r '.responseCode'`\n	    if [[ $response != 201 ]]\n        then\n            echo \"Ocorreu um erro ao realizar ação no Fortify Status_code: $response\"\n			exit 1\n        fi	\n    echo \"Criando Application Version ==> \"$cversion\n    echo \"Criando  Application Version response ==> \"$response\nsleep 8\necho \"Atribuindo atributos a Application Version\"$cversion\necho \"Linguagem de programacao $p_lang\"\n 	if [ $p_lang == android ]\n	  then\ncat /opt/ads-agent/javaDefault.json | sed -e 's/idFortify/'$cversion'/g' | curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d @- '$(FORTIFY_API)/bulk'\n 	elif [ $p_lang == java ]\n	  then\n	     cat /opt/ads-agent/javaDefault.json | sed -e 's/idFortify/'$cversion'/g' | curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d @- '$(FORTIFY_API)/bulk'\n	elif [ $p_lang == angular ] || [ $p_lang == nodejs ]\n	   then\n	     cat /opt/ads-agent/javascriptDefault.json | sed -e 's/idFortify/'$cversion'/g' | curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d @- '$(FORTIFY_API)/bulk'\n	elif [ $p_lang == php ]\n	   then\n	     cat /opt/ads-agent/phpDefault.json | sed -e 's/idFortify/'$cversion'/g' | curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d @- '$(FORTIFY_API)/bulk'\n	fi\nelse \n  echo \"A Application Version: $(FORTIFY_VERSION_BUILD) já esta criada no Fortify\"	\nfi\necho \"##vso[task.setvariable variable=lista_versao;]$lista_versao\"\necho $lista_versao"
  - task: Bash@3
    displayName: Herdando Atributos
    condition: and(succeeded(), ne(variables['fortify_disable'], 'gecmi'), ne(variables['p_language'], 'dotnet'))
    enabled: False
    inputs:
      targetType: inline
      filePath: /opt/ads-agent/fortify_analisis.sh
      script: >
        #!/bin/bash

        #set -x

        echo "LANGUAGE $(p_language)"


        identificar_projeto=$(curl -s -k --location --request GET "$(FORTIFY_API)/projects?q=name:$(REPOSITORIO)" \

        --header "Accept: application/json" \

        --header "Authorization: FortifyToken $(FORTIFY_APITOKEN)" | jq '.data[].id')


        identificar_versao=`curl -k -s -X GET "$(FORTIFY_API)/projects/$identificar_projeto/versions?orderby=creationDate&limit=0" \

        -H "Authorization: FortifyToken $(FORTIFY_APITOKEN)" \

        -H "accept: application/json"`


        if [[ $(echo "$(lista_versao)" | grep "found":true) ]]

        then

        IdUltimaVersao=`echo "$identificar_versao" | jq -r '.data[-1].id'`

        else

        IdUltimaVersao=`echo "$identificar_versao" | jq -r '.data[-2].id'`

        fi


        IdAtualVersao=`curl -s -k --location --request GET "$(FORTIFY_API)/projects/$identificar_projeto/versions?orderby=creationDate&limit=0" --header "Accept: application/json" --header "Authorization: FortifyToken $(FORTIFY_APITOKEN)" | jq '.data[] | select(.name == "$(FORTIFY_VERSION_BUILD)") | .id'`

        echo "IdUltimaVersao: $IdUltimaVersao"

        echo "IdAtualVersao: $IdAtualVersao"

        version_count=`echo "$identificar_versao" | jq -r '.count'`

        if [[ $version_count -eq 1 ]]

        then
        	echo "Esta e a primeira versao, skip na heranca de atributos"
        	exit 0
        elif [[ "$IdUltimaVersao" == "$IdAtualVersao" ]]

        then
                echo "Esta e a ultima versao, skip na heranca de atributos"
        	exit 0
        else
        	echo "Fazendo a Heranca de Atributo da ultima para a versao atual"
        	refresh_audit=$(curl -o /dev/null -w "%{http_code}" -k -s -L -X POST "$(FORTIFY_API)/projectVersions/action/refresh" \
        	-H "accept: application/json" \
        	-H "Content-Type: application/json" \
        	-H "Authorization: FortifyToken $(token)" \
        	-d '{
        	 "projectVersionIds": [ '$IdUltimaVersao' ]
        	}')
        	if [[ $refresh_audit -ne 200 ]]
        	then
        		echo "Skip refresh"
        	else
        		echo "Refresh da ultima versao realizado com sucesso"
                        sleep 20
        	fi
        	replicar_atributos=$(curl -o /dev/null -w "%{http_code}" -k -s -L -X POST "$(FORTIFY_API)/projectVersions/action/copyCurrentState" \
        	-H "accept: application/json" \
        	-H "Content-Type: application/json" \
        	-H "Authorization: FortifyToken $(token)" \
        	-d '{
        	 "previousProjectVersionId": '$IdUltimaVersao',
        	 "projectVersionId": '$IdAtualVersao'
        	}')
        	if [[ $replicar_atributos -ne 200 ]]
        	then
        		echo "Erro ao copiar application state da ultima para a versao atual"
        		exit 1
        	else
        		echo "Replicado application state da ultima para a versao atual"
        	fi
        	response_acessos=$(curl -k -s -L -X GET "$(FORTIFY_API)/projectVersions/$IdUltimaVersao/authEntities" \
        	-H "accept: application/json" \
        	-H "Authorization: FortifyToken $(token)")
                 response_acessos_code=`echo $response_acessos | jq -r '.responseCode'`
        	if [[ $response_acessos_code -ne 200 ]]
        	then
        		echo "Erro ao capturar response de acessos da ultima versao"
        		exit 1
        	else
        		echo "Identificado o response de acesso da ultima versao"
        	fi
                 response_acessos_data=`echo $response_acessos | jq -r '.data'`
        	replicar_acessos=$(curl -o /dev/null -w "%{http_code}" -k -s -L -X PUT "$(FORTIFY_API)/projectVersions/$IdAtualVersao/authEntities" \
        	-H "accept: application/json" \
        	-H "Content-Type: application/json" \
        	-H "Authorization: FortifyToken $(token)" \
        	-d "$response_acessos_data")
        	if [[ $replicar_acessos -ne 200 ]]
        	then
        		echo "Erro ao atualizar acessos da versao atual"
        		exit 1
        	else
        		echo "Replicado acessos para a versao atual"
        	fi
        fi
  - task: Bash@3
    displayName: Iniciando Análise no Fortify
    condition: and(succeeded(), ne(variables['fortify_disable'], 'gecmi'), ne(variables['p_language'], 'dotnet'))
    enabled: False
    inputs:
      targetType: inline
      filePath: /opt/ads-agent/fortify_analisis.sh
      script: "#!/bin/bash\n\nexport PATH=/opt/apache-maven/apache-maven-3.8.5/bin:$PATH\nmvn -version\n\necho \"Iniciando Fortify Clean, Translate e Analysis\" \n\np_lang=`echo '$(p_language)' | sed 's/[[:punct:]]\\+$//'`\necho \"LANG $p_lang\"\n\nif [ $p_lang == java ]\n  then\n      \n	  DIR=$(Agent.BuildDirectory)/fortify\n     \n	  if [ -d \"$DIR\" ]; then\n		  echo \"Pasta ${DIR} existe...\"\n		  cd ${DIR}\n	  else\n	    DIR=$(Build.SourcesDirectory)\n	  fi\n	  \n	  if [ $POM_PATH ]\n	   then\n	     POM=`dirname $POM_PATH`\n	  cd ${DIR}/$POM\n	   else\n	  cd ${DIR}\n      fi\n\nscancentral -url $(SCANCENTRAL_URL) start -bt mvn -pool $(FORTIFY_POOL_SILVER_NOVO) -application $(REPOSITORIO) -version $(FORTIFY_VERSION_BUILD) -uptoken $(FORTIFY_UPTOKEN) -fprssc $(Build.BuildId).fpr -upload\n\nelif [ $p_lang == android ]\nthen\ncd $(Build.SourcesDirectory)\nchmod +x gradlew\nsed -i  \"s,distributionUrl=.*,distributionUrl=file:///opt/ferramentas/gradle/gradle-$(GradleVersion)-all.zip,\" gradle/wrapper/gradle-wrapper.properties\nscancentral arguments -o -targs \"-exclude './**/build/**/*'\"\nscancentral -url $(SCANCENTRAL_URL) start -bt gradle -bc $(FORTIFY_BUILD) -skipBuild -pool $(FORTIFY_POOL_GOLD_NOVO) -application $(REPOSITORIO) -version $(FORTIFY_VERSION_BUILD) -uptoken $(FORTIFY_UPTOKEN) -fprssc $(Build.BuildId).fpr -upload\n\nelse\n      if [ $PACKAGE_JSON_PATH ]\n	    then\n          cd $PACKAGE_JSON_PATH\n		else\n		  cd $(Build.SourcesDirectory)\n		fi\n	  scancentral arguments -o -targs \"-Dcom.fortify.sca.exclude.unimported.node.modules 'true'\" -targs \"-exclude './**/node_modules/**/*'\" -targs \"-exclude './**/*.min.js'\" -targs \"-exclude './**/dist/**/*'\"\n          scancentral -url $(SCANCENTRAL_URL) start -bt none -pool $(FORTIFY_POOL_GOLD_NOVO) -application $(REPOSITORIO) -version $(FORTIFY_VERSION_BUILD) -uptoken $(FORTIFY_UPTOKEN) -fprssc $(Build.BuildId).fpr -upload\nfi\n"
  - task: Bash@3
    displayName: Revogando Token
    condition: always()
    enabled: False
    inputs:
      targetType: inline
      filePath: /opt/ads-agent/fortify_analisis.sh
      script: >-
        #!/bin/bash

        set -o errexit

        set -o nounset

        set -o pipefail

        #set -x


        echo "Verificando se o token foi criado."

        if [[ -n $(token_id) ]]

        then
            echo "Revogando token"
        	delete_token=`curl -s --user $(FORTIFY_USER):$(FORTIFY_PASS) -k -X DELETE -H "Content-Type:application/json" '$(FORTIFY_API)/tokens/$(token_id)'`
        	response=`echo $delete_token | jq -r '.responseCode'`
        	    if [[ $response != 200 ]]
                    then
                        echo "Ocorreu um erro ao revogar o token no Fortify Status_code: $response"
        		#exit 1
                    fi
        else
          echo "Token não foi criado. Favor verificar se alguma task apresenta erro."
        fi
  - task: CmdLine@2
    displayName: 'SAST: Limpando MVN_GOAL'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), ne(variables['fortify_disable'], 'gecmi'), eq(variables['p_language'], 'java'))
    inputs:
      script: "if [[ -n $MVN_GOAL ]]; then\n  FTFY_MVN_GOAL=\"$(\n    printf '%s' \"$MVN_GOAL\" |\n      sed -E '\n        s/(^|[[:space:]])-DskipTests=(true|false)([[:space:]]|$)/ /g;\n        s/(^|[[:space:]])(clean|install)([[:space:]]|$)/ /g;\n        s/[[:space:]]+/ /g;\n        s/^ //; s/ $//\n      '\n  )\"\n\n  # Força -DskipTests=true no final para garantir que testes não sejam executados em análise\n  FTFY_MVN_GOAL=\"${FTFY_MVN_GOAL:+$FTFY_MVN_GOAL }-DskipTests=true\"\n  echo \"##vso[task.setvariable variable=FTFY_MVN_GOAL]$FTFY_MVN_GOAL\"\n  echo MVN_GOAL: $FTFY_MVN_GOAL  \nfi"
  - task: CmdLine@2
    displayName: 'SAST: Define Variáveis'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), ne(variables['fortify_disable'], 'gecmi'))
    inputs:
      script: >-
        echo "Verificando a existência das variáveis de comunidade..."

        if [[ -z $FORTIFY_SENSOR_POOL ]]; then
            echo "##vso[task.logissue type=error;]Não foi possível determinar a comunidade responsável por este sistema. Entre em contato com a CESET10 para vincular seu pipeline ao Variable Group correspondente à sua comunidade."
            exit 1
        fi


        if [[ -n $FORTIFY_SOBRESCREVE_POOL ]]; then
          echo "##vso[task.setvariable variable=FORTIFY_SENSOR_POOL;]$FORTIFY_SOBRESCREVE_POOL"
          echo POOL: $FORTIFY_SOBRESCREVE_POOL
        fi


        #######


        JAVA_HOME_17_X64=/usr/java/open-jdk-17.0.8

        echo "##[command]echo \$JAVA_HOME_17_X64"

        echo JAVA_HOME_17_X64: $JAVA_HOME_17_X64


        echo "##vso[task.setvariable variable=JAVA_HOME_17_X64;]$JAVA_HOME_17_X64"


        if [[ -n $MVN_GOAL ]]; then

        echo MVN_GOAL: $FTFY_MVN_GOAL

        fi


        #######


        echo Build.Repository.Name=$(Build.Repository.Name)

        echo Build.DefinitionName=$(Build.DefinitionName)

        echo Build.BuildNumber=$(Build.BuildNumber)

        echo Build.BuildId=$(Build.BuildId)

        echo Build.SourceBranch=$(Build.SourceBranch)

        echo Build.SourceBranchName=$(Build.SourceBranchName)

        echo Build.SourceVersion=$(Build.SourceVersion)


        echo "##[command]echo \$valida.vec"

        echo vec=$(valida.vec)


        echo "##[command]echo \$sonar_branch"

        echo branch=$sonar_branch

        if [[ $sonar_branch =~ ^INC(\d)* ]]; then
            echo "##[warning]Hotfix detectado. Aplicando bypass no Guardrail."
            echo "##vso[task.setvariable variable=guardrail.sec;]false"
        fi


        echo FORTIFY_APPLICATION=$FORTIFY_APPLICATION

        echo FORTIFY_SESSION=$FORTIFY_SESSION

        echo KEYSTORE_SECUREFILEPATH=$(KEYSTORE_SECUREFILEPATH)

        echo NODE_EXTRA_CA_CERTS=$(NODE_EXTRA_CA_CERTS)


        #verificar diretório contendo os certificados necessários para a próxima task

        #ls -lah /etc/pki/ca-trust/source/anchors/


        echo "Versão atual:"

        echo "##[command]git log --pretty=format:"%H %D" | sed -n '1p'"

        git -c safe.directory=* log --pretty=format:"%H %D" | sed -n '1p'

        echo "##[command]git describe --tags $(Build.SourceVersion)"

        git -c safe.directory=* describe --tags $(Build.SourceVersion)


        #######


        echo "Versões anteriores [tag] seguindo a branch atual:"


        FORTIFY_NEW_VERSION=`git -c safe.directory=* log --pretty=format:"%H %D" | grep -oP '(?<=tag: )[^\s]*([0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3})' | sed -n '1p'`

        FORTIFY_LAST_VERSION=`git -c safe.directory=* log --pretty=format:"%H %D" | grep -oP '(?<=tag: )[^\s]*([0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3})' | sed -n '2p'`

        FORTIFY_THIRD_VERSION=`git -c safe.directory=* log --pretty=format:"%H %D" | grep -oP '(?<=tag: )[^\s]*([0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3})' | sed -n '3p'`


        echo Última tag mais recente: $FORTIFY_NEW_VERSION

        echo Penúltima tag mais recente: $FORTIFY_LAST_VERSION

        echo Antepenúltima tag mais recente: $FORTIFY_THIRD_VERSION


        if [[ $FORTIFY_NEW_VERSION == null ]]; then
            echo "##[error]Incapaz de determinar a versão da aplicação."
            exit 1
        fi


        echo Validando VEC e versão...

        # A VEC dá false pois o valor $(Build.SourceBranchName) não passa o valor da tag quando o build é disparado a partir da branch.

        if [[ $(valida.vec) == false ]]; then

        echo "O nome de versão ' $(Build.SourceBranchName) ' NÃO ATENDE aos parâmetros da VEC."

        fi

        if [[ -n $FORTIFY_NEW_VERSION ]]; then
          FORTIFY_NEW_VERSION=`echo $FORTIFY_NEW_VERSION | grep -oP $(FORTIFY_REGEX)`
          FORTIFY_LAST_VERSION=`echo $FORTIFY_LAST_VERSION | grep -oP $(FORTIFY_REGEX)`
        else

        if [[ -n $FORTIFY_LAST_VERSION ]]; then
          FORTIFY_NEW_VERSION="develop"
        else
          FORTIFY_NEW_VERSION=`echo $FORTIFY_LAST_VERSION | grep -oP $(FORTIFY_REGEX)`
          FORTIFY_LAST_VERSION=`echo $FORTIFY_THIRD_VERSION | grep -oP $(FORTIFY_REGEX)`
        fi

        fi


        echo "##[debug]Seu resultado será publicado no Fortify sob a Versão de nome: ' $FORTIFY_APPLICATION:$FORTIFY_NEW_VERSION '"


        #######


        FORTIFY_FPR_NAME=`git -c safe.directory=* describe --tags $(Build.SourceVersion)`


        echo "##vso[task.setvariable variable=FORTIFY_NEW_VERSION]$FORTIFY_NEW_VERSION"

        echo "##vso[task.setvariable variable=FORTIFY_LAST_VERSION]$FORTIFY_LAST_VERSION"

        echo "##vso[task.setvariable variable=FORTIFY_FPR_NAME]$FORTIFY_FPR_NAME"


        #######


        echo "Agent Name: $AGENT_NAME"

        AGENT_SHORT_NAME=$(echo "$AGENT_NAME" | sed -E 's/^([a-zA-Z]+)[0-9]*\..*/\1/')


        echo "Nome curto do agente: $AGENT_SHORT_NAME"


        if [[ "$AGENT_SHORT_NAME" == "cadsvaprlx" && -n $DOTNET_VERSION ]]; then
            echo DOTNET_VERSION: $DOTNET_VERSION
            echo "##[warning]Este Agent não possui os requisitos para executar a ferramenta de SAST ( .NET 8.0 ). O Bypass do SAST será ativado."
            echo "##vso[task.setvariable variable=fortify_disable;]gecmi"
        fi


        if [[ "$AGENT_SHORT_NAME" == "cadsvaprlx" ]]; then
            CONTAINER_ENGINE=docker
            echo "##vso[task.setvariable variable=CONTAINER_ENGINE]docker"
        else
            CONTAINER_ENGINE=podman
            echo "##vso[task.setvariable variable=CONTAINER_ENGINE]podman"
        fi


        echo "##[debug]Container engine selecionado: $CONTAINER_ENGINE"
  - task: CmdLine@2
    displayName: '[MANTER] SAST: Validando a Passagem de Valores'
    enabled: False
    inputs:
      script: >-
        scancentral --version

        /opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/bin/scancentral --version


        echo FORTIFY_SESSION: $FORTIFY_SESSION

        echo FORTIFY_APPLICATION: $FORTIFY_APPLICATION


        echo FORTIFY_NEW_VERSION: $FORTIFY_NEW_VERSION

        echo FORTIFY_LAST_VERSION: $FORTIFY_LAST_VERSION

        echo FORTIFY_APPLICATION-FORTIFY_NEW_VERSION

        echo $FORTIFY_APPLICATION-$FORTIFY_NEW_VERSION

        #echo FORTIFY_APPLICATION-[ dependencies.A.outputs['FORTIFY_NEW_VERSION'] ]

        #echo $FORTIFY_APPLICATION-$[ dependencies.A.outputs['FORTIFY_NEW_VERSION'] ]
  - task: CmdLine@2
    displayName: 'SAST: Cria Aplicação'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), ne(variables['fortify_disable'], 'gecmi'))
    retryCountOnTaskFailure: 5
    inputs:
      script: "command -v docker && docker --version\ncommand -v podman && podman --version\n\n#sudo usermod -aG docker $USER\n\n#ls -l /var/run/docker.sock\n\n#set -o errexit\n#set -o pipefail\n#echo Engine selecionado: $CONTAINER_ENGINE\n#echo Versão mais recente: $FORTIFY_NEW_VERSION\n#echo Versão anterior: $FORTIFY_LAST_VERSION\n\necho \"$FORTIFY_REGISTRY_PASSWORD\" | $CONTAINER_ENGINE login default-route-openshift-image-registry.apps.produtos4.caixa --username \"$FORTIFY_REGISTRY_USERNAME\" --password-stdin\n \necho FORTIFY_APPLICATION: $FORTIFY_APPLICATION\necho KEYSTORE_SECUREFILEPATH: $(KEYSTORE_SECUREFILEPATH)\nKEYSTORE_SECUREFILEPATH=$(KEYSTORE_SECUREFILEPATH)\ncp $KEYSTORE_SECUREFILEPATH $(System.DefaultWorkingDirectory)/keystore.jks\n#echo \"##vso[task.setvariable variable=KEYSTORE_SECUREFILEPATH]$KEYSTORE_SECUREFILEPATH\"\n\n# Valida Integridade do JKS (parte 1, fora do container)\necho Valida integridade do certificado FORA do container\necho \"##[command]md5sum /etc/pki/ca-trust/source/anchors/keystore-ssc24.jks\"\nmd5sum /etc/pki/ca-trust/source/anchors/keystore-ssc24.jks\necho \"##[command]md5sum $KEYSTORE_SECUREFILEPATH\"\nmd5sum $KEYSTORE_SECUREFILEPATH\necho \"##[command]md5sum $(System.DefaultWorkingDirectory)/keystore.jks\"\nmd5sum $(System.DefaultWorkingDirectory)/keystore.jks\n\n# Executa o container Fortify com as variáveis herdadas do ambiente\necho \"##[command]$CONTAINER_ENGINE --version\"\n$CONTAINER_ENGINE --version\necho \"##[command]$CONTAINER_ENGINE run -v $(System.DefaultWorkingDirectory):/src default-route-openshift-image-registry.apps.produtos4.caixa/fortify/fortify-ci-tools:7.0.0-jdk-17\"\n$CONTAINER_ENGINE run --rm \\\n  --security-opt seccomp=unconfined \\\n  --memory=12g \\\n  --memory-swap=12g \\\n  -v $(System.DefaultWorkingDirectory):/src \\\n  -w /src \\\n  -e FORTIFY_APPLICATION \\\n  -e FORTIFY_APP_VERSION=$FORTIFY_NEW_VERSION \\\n  -e FORTIFY_PREVIOUS_VERSION=$FORTIFY_LAST_VERSION \\\n  -e FORTIFY_SESSION \\\n  -e FORTIFY_URL \\\n  -e FORTIFY_CI_TOKEN \\\n  -e FORTIFY_CLIENT_AUTH_TOKEN \\\n  -e FORTIFY_SENSOR_VERSION \\\n  -e FORTIFY_SIGLA=$(Build.DefinitionName) \\\n  -e FORTIFY_COMUNIDADE \\\n  -e FORTIFY_LDAP_GROUP \\\n  default-route-openshift-image-registry.apps.produtos4.caixa/fortify/fortify-ci-tools:7.0.0-jdk-17 \\\n  bash -c \"\n    \n    echo Valida integridade do certificado DENTRO do container\n    echo md5sum /src/keystore.jks\n    md5sum /src/keystore.jks\n    \n    echo Configurando Key Store\n    fcli config truststore set \\\n      --file=/src/keystore.jks \\\n      --password=$KEYSTORE_PWD \\\n      --type=jks\n \n    echo \\\"Nome do Sistema: \\$FORTIFY_APPLICATION\\\"\n \n    echo \\\"Nome da Versão: \\$FORTIFY_APP_VERSION\\\"\n \n    echo \\\"Nome da Versão Anterior: \\$FORTIFY_PREVIOUS_VERSION\\\"\n \n   #FORTIFY_CI_TOKEN proveniente do Fortify (expira)\n   #FORTIFY_CLIENT_AUTH_TOKEN (não expira)\n    echo Login no Fortify...\n    fcli ssc session login \\\n      --url=\\$FORTIFY_URL \\\n      --token=\\$FORTIFY_CI_TOKEN \\\n      --client-auth-token=\\$FORTIFY_CLIENT_AUTH_TOKEN \\\n      --socket-timeout=10m \\\n      --connect-timeout=5m \\\n      --ssc-session=\\$FORTIFY_SESSION\n    \n \n    echo Criando aplicação no Fortify...\n    fcli ssc action run setup-appversion \\\n      --appversion=\\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION \\\n      --attributes=\\\"Comunidade=\\$FORTIFY_COMUNIDADE,Sigla=\\$FORTIFY_SIGLA\\\" \\\n      --add-users=\\$FORTIFY_LDAP_GROUP \\\n      --copy-from=\\$FORTIFY_APPLICATION:\\$FORTIFY_PREVIOUS_VERSION \\\n      --ssc-session=\\$FORTIFY_SESSION || true\n \n    fcli ssc action run setup-appversion \\\n      --appversion=\\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION \\\n      --attributes=\\\"Comunidade=\\$FORTIFY_COMUNIDADE,Sigla=\\$FORTIFY_SIGLA\\\" \\\n      --add-users=\\$FORTIFY_LDAP_GROUP \\\n      --ssc-session=\\$FORTIFY_SESSION || true\n \n    echo Atribuindo acessos ao Fortify...\n    fcli ssc appversion update \\\n      \\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION \\\n      --add-users=\\$FORTIFY_LDAP_GROUP \\\n      --ssc-session=\\$FORTIFY_SESSION || true\n \n    echo Logout do Fortify...\n    fcli ssc session logout \\\n      --ssc-session=\\$FORTIFY_SESSION \\\n      --no-revoke-token\n  \""
  - task: CmdLine@2
    displayName: '[MANTER] SAST: Disparando SAST no Fortify'
    enabled: False
    inputs:
      script: "echo Sistema: $FORTIFY_APPLICATION\necho Versão mais recente: $FORTIFY_NEW_VERSION\necho Versão anterior: $FORTIFY_LAST_VERSION\n\necho Empacotando aplicação...\n/opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/bin/scancentral package --output package.zip\n\necho Disparando requisição de análise SAST...\n/opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/bin/scancentral \\\n    -url $FORTIFY_URL_CONTROLLER \\\n    start --upload-to-ssc \\\n    -application $FORTIFY_APPLICATION \\\n    -version $FORTIFY_NEW_VERSION \\\n    --package package.zip \\\n    --ssc-upload-token $FORTIFY_CI_TOKEN "
  - task: CmdLine@2
    displayName: 'SAST: Confirmando Variáveis'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), ne(variables['fortify_disable'], 'gecmi'))
    inputs:
      script: >-
        echo "Definindo liguagem de programação"

        cd $(Build.SourcesDirectory)

        for file in pom.xml angular.json tsconfig.json package.json project.ini *.csproj *.sln build.gradle

        do
            f_language=`find . -maxdepth 3 -name "${file}" -exec basename {} \; | head -n 1`
            if [[ "${f_language}" == pom.xml ]]; then
                echo MVN_GOAL: $FTFY_MVN_GOAL
                p_language=java
                break
            elif [[ "${f_language}" == angular.json ]] || [[ "${f_language}" == tsconfig.json ]]; then
                p_language=angular
                break
            elif [[ "${f_language}" == package.json ]]; then
                p_language=nodejs
                break
            elif [[ "${f_language}" == project.ini ]]; then
                p_language=php
                break
            elif [[ "${f_language}" == *".csproj" ]] || [[ "${f_language}" == *".sln" ]];then
                p_language=dotnet
                break
            elif [[ "${f_language}" == "build.gradle" ]]; then
                p_language=android
                break
            else
                p_language=null
            fi
        done


        echo "Linguagem de Programação:" $p_language

        echo "##vso[task.setvariable variable=p_language;]$p_language"


        if [ $p_language == null ]; then
            echo "##[warning]Não foi possivel definir a linguagem de programação deste codigo fonte"
        fi


        #######


        JAVA_HOME_17_X64=/usr/java/open-jdk-17.0.8

        echo "##[command]echo \$JAVA_HOME_17_X64"

        echo JAVA_HOME_17_X64: $JAVA_HOME_17_X64


        echo "##vso[task.setvariable variable=JAVA_HOME_17_X64;]$JAVA_HOME_17_X64"


        echo MAVEN_VERSION: $MAVEN_VERSION


        if [[ -n $MAVEN_VERSION ]]; then
            export PATH=/opt/apache-maven/apache-maven-$MAVEN_VERSION/bin:$PATH
            echo "##vso[task.setvariable variable=PATH;]$PATH"
        fi

        echo PATH: $PATH


        #######


        echo Build.Repository.Name=$(Build.Repository.Name)


        echo FORTIFY_APPLICATION=$FORTIFY_APPLICATION

        echo FORTIFY_SESSION=$FORTIFY_SESSION


        echo "##[command]echo NODE_EXTRA_CA_CERTS"

        echo $(NODE_EXTRA_CA_CERTS)

        echo "##[command]md5sum NODE_EXTRA_CA_CERTS"

        md5sum $(NODE_EXTRA_CA_CERTS)


        #verificar diretório contendo os certificados necessários para a próxima task

        #ls -lah /etc/pki/ca-trust/source/anchors/


        echo Build.DefinitionName=$(Build.DefinitionName)

        echo Build.BuildNumber=$(Build.BuildNumber)

        echo Build.BuildId=$(Build.BuildId)

        echo Build.SourceBranch=$(Build.SourceBranch)

        echo Build.SourceBranchName=$(Build.SourceBranchName)

        echo Build.SourceVersion=$(Build.SourceVersion)


        echo "##[command]echo \$valida.vec"

        echo vec=$(valida.vec)


        #######


        echo "Versão atual:"

        echo "##[command]git log --pretty=format:"%H %D" | sed -n '1p'"

        git -c safe.directory=* log --pretty=format:"%H %D" | sed -n '1p'

        echo "##[command]git describe --tags $(Build.SourceVersion)"

        git -c safe.directory=* describe --tags $(Build.SourceVersion)


        #######


        echo "Versões anteriores [tag] seguindo a branch atual:"


        FORTIFY_NEW_VERSION=`git -c safe.directory=* log --pretty=format:"%H %D" | grep -oP '(?<=tag: )[^\s]*([0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3})' | sed -n '1p'`

        FORTIFY_LAST_VERSION=`git -c safe.directory=* log --pretty=format:"%H %D" | grep -oP '(?<=tag: )[^\s]*([0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3})' | sed -n '2p'`

        FORTIFY_THIRD_VERSION=`git -c safe.directory=* log --pretty=format:"%H %D" | grep -oP '(?<=tag: )[^\s]*([0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3})' | sed -n '3p'`


        echo Última tag mais recente: $FORTIFY_NEW_VERSION

        echo Penúltima tag mais recente: $FORTIFY_LAST_VERSION

        echo Antepenúltima tag mais recente: $FORTIFY_THIRD_VERSION


        echo Validando VEC e versão...

        # A VEC dá false pois o valor $(Build.SourceBranchName) não passa o valor da tag quando o build é disparado a partir da branch.

        if [[ $(valida.vec) == false ]]; then

        echo "O nome de versão ' $(Build.SourceBranchName) ' NÃO ATENDE aos parâmetros da VEC."

        fi

        if [[ -n $FORTIFY_NEW_VERSION ]]; then
          FORTIFY_NEW_VERSION=`echo $FORTIFY_NEW_VERSION | grep -oP $(FORTIFY_REGEX)`
          FORTIFY_LAST_VERSION=`echo $FORTIFY_LAST_VERSION | grep -oP $(FORTIFY_REGEX)`
        else

        if [[ -n $FORTIFY_LAST_VERSION ]]; then
          FORTIFY_NEW_VERSION="develop"
        else
          FORTIFY_NEW_VERSION=`echo $FORTIFY_LAST_VERSION | grep -oP $(FORTIFY_REGEX)`
          FORTIFY_LAST_VERSION=`echo $FORTIFY_THIRD_VERSION | grep -oP $(FORTIFY_REGEX)`
        fi

        fi

        #

        #echo FORTIFY_NEW_VERSION=$FORTIFY_NEW_VERSION

        #echo FORTIFY_LAST_VERSION=$FORTIFY_LAST_VERSION

        echo "##[debug]Seu resultado será publicado no Fortify sob a Versão de nome: ' $FORTIFY_APPLICATION:$FORTIFY_NEW_VERSION '"


        echo "##vso[task.setvariable variable=FORTIFY_NEW_VERSION]$FORTIFY_NEW_VERSION"

        echo "##vso[task.setvariable variable=FORTIFY_LAST_VERSION]$FORTIFY_LAST_VERSION"


        ########


        echo "Agent Name: $AGENT_NAME"

        AGENT_SHORT_NAME=$(echo "$AGENT_NAME" | sed -E 's/^([a-zA-Z]+)[0-9]*\..*/\1/')


        echo "Nome curto do agente: $AGENT_SHORT_NAME"


        if [[ "$AGENT_SHORT_NAME" == "cadsvaprlx" ]]; then
            CONTAINER_ENGINE=docker
            echo "##vso[task.setvariable variable=CONTAINER_ENGINE]docker"
        else
            CONTAINER_ENGINE=podman
            echo "##vso[task.setvariable variable=CONTAINER_ENGINE]podman"
        fi


        echo "##[debug]Container engine selecionado: $CONTAINER_ENGINE"
  - task: CmdLine@2
    displayName: '[MANTER] SAST: Validando Passagem de Variáveis'
    enabled: False
    inputs:
      script: >-
        scancentral --version

        /opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/bin/scancentral --version


        echo FORTIFY_SESSION: $FORTIFY_SESSION

        echo FORTIFY_APPLICATION: $FORTIFY_APPLICATION


        echo FORTIFY_NEW_VERSION: $FORTIFY_NEW_VERSION

        echo FORTIFY_LAST_VERSION: $FORTIFY_LAST_VERSION

        echo FORTIFY_APPLICATION-FORTIFY_NEW_VERSION

        echo $FORTIFY_APPLICATION-$FORTIFY_NEW_VERSION

        #echo FORTIFY_APPLICATION-[ dependencies.A.outputs['FORTIFY_NEW_VERSION'] ]

        #echo $FORTIFY_APPLICATION-$[ dependencies.A.outputs['FORTIFY_NEW_VERSION'] ]
  - task: CmdLine@2
    displayName: '[MANTER] SAST: Fortify ScanCentral SAST Assessment v1'
    enabled: False
    inputs:
      script: "echo Sistema: $FORTIFY_APPLICATION\necho Versão mais recente: $FORTIFY_NEW_VERSION\necho Versão anterior: $FORTIFY_LAST_VERSION\n\necho Empacotando aplicação...\n/opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/bin/scancentral package --output package.zip\n\necho Disparando requisição de análise SAST...\n/opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/bin/scancentral \\\n    -url $FORTIFY_URL_CONTROLLER \\\n    start --upload-to-ssc \\\n    -application $FORTIFY_APPLICATION \\\n    -version $FORTIFY_NEW_VERSION \\\n    --fpr-filename-on-ssc $(Build.BuildNumber)\n    --package package.zip \\\n    --ssc-upload-token $FORTIFY_CI_TOKEN "
  - task: FortifyScanCentralSAST@7
    displayName: 'SAST: Análise Java [Assíncrona]'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), ne(variables['guardrail.sec'], 'true'), ne(variables['fortify_disable'], 'gecmi'), eq(variables['p_language'], 'java'))
    retryCountOnTaskFailure: 2
    inputs:
      scanCentralCtrlUrl: $(FORTIFY_URL_CONTROLLER)
      scanCentralClientToken: $(FORTIFY_CLIENT_AUTH_TOKEN)
      sscUrl: $(FORTIFY_URL)
      sscCiToken: $(FORTIFY_CI_TOKEN)
      uploadToSSC: true
      applicationName: $(Build.Repository.Name)
      applicationVersion: $(FORTIFY_NEW_VERSION)
      buildTool: mvn
      buildCommand: $(FTFY_MVN_GOAL)
      buildFile: spring-batch-main/pom.xml
      additionalTranslationArgs: >-
        -Dcom.fortify.sca.NullPtrMaxFunctionTime=30000

        -Dcom.fortify.sca.exclude.unimported.node.modules=true

        -Dcom.fortify.sca.EnableDOMModeling=true

        -Dcom.fortify.sca.fileextensions.inc=PHP

        -Dcom.fortify.sca.rules.password_regex.global=(?i)(s|_)?(user|usr|member|admin|guest|login|default|new|current|old|client|server|proxy|sqlserver|my|mysql|mongo|mongodb|db|database|ldap|smtp|email|email(_)?smtp)?(_|\.)?(pass(wd|word|phrase)|secret|senha)
      excludeArgs: >-
        ./**/node_modules/**/*

        ./**/*.min.js

        ./**/dist/**/*
      skipBuild: false
      excludeDisabledProjects: false
      includeTest: false
      includeNodeModules: false
      additionalScanArgs: >-
        -build-label $(FORTIFY_FPR_NAME)

        -build-version $(FORTIFY_FPR_NAME)-$(Build.BuildNumber)
      sensorPool: $(FORTIFY_SENSOR_POOL)
      overwrite: false
      quiet: false
      downloadDebugLogs: false
      debugLogFileName: $(Build.Repository.Name)-$(FORTIFY_FPR_NAME)-fortify-debug-logs.zip
  - task: FortifyScanCentralSAST@7
    displayName: 'SAST: Análise Default [Assíncrona]'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), ne(variables['guardrail.sec'], 'true'), ne(variables['fortify_disable'], 'gecmi'), ne(variables['p_language'], 'java'))
    retryCountOnTaskFailure: 2
    inputs:
      scanCentralCtrlUrl: $(FORTIFY_URL_CONTROLLER)
      scanCentralClientToken: $(FORTIFY_CLIENT_AUTH_TOKEN)
      sscUrl: $(FORTIFY_URL)
      sscCiToken: $(FORTIFY_CI_TOKEN)
      uploadToSSC: true
      applicationName: $(Build.Repository.Name)
      applicationVersion: $(FORTIFY_NEW_VERSION)
      autoDetectBuildTool: true
      additionalTranslationArgs: >-
        -Dcom.fortify.sca.exclude.unimported.node.modules=true

        -Dcom.fortify.sca.EnableDOMModeling=true

        -Dcom.fortify.sca.fileextensions.inc=PHP

        -Dcom.fortify.sca.rules.password_regex.global=(?i)(s|_)?(user|usr|member|admin|guest|login|default|new|current|old|client|server|proxy|sqlserver|my|mysql|mongo|mongodb|db|database|ldap|smtp|email|email(_)?smtp)?(_|\.)?(pass(wd|word|phrase)|secret|senha)
      excludeArgs: >-
        ./**/node_modules/**/*

        ./**/*.min.js

        ./**/dist/**/*
      skipBuild: false
      excludeDisabledProjects: false
      includeTest: false
      includeNodeModules: false
      additionalScanArgs: >-
        -build-label $(FORTIFY_FPR_NAME)

        -build-version $(FORTIFY_FPR_NAME)-$(Build.BuildNumber)
      sensorPool: $(FORTIFY_SENSOR_POOL)
      overwrite: false
      quiet: false
      downloadDebugLogs: false
      debugLogFileName: $(Build.Repository.Name)-$(FORTIFY_FPR_NAME)-fortify-debug-logs.zip
  - task: FortifyScanCentralSAST@7
    displayName: 'SAST: Análise Java [Síncrona]'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), eq(variables['guardrail.sec'], 'true'), ne(variables['fortify_disable'], 'gecmi'), eq(variables['p_language'], 'java'))
    retryCountOnTaskFailure: 2
    inputs:
      scanCentralCtrlUrl: $(FORTIFY_URL_CONTROLLER)
      scanCentralClientToken: $(FORTIFY_CLIENT_AUTH_TOKEN)
      sscUrl: $(FORTIFY_URL)
      sscCiToken: $(FORTIFY_CI_TOKEN)
      uploadToSSC: true
      applicationName: $(Build.Repository.Name)
      applicationVersion: $(FORTIFY_NEW_VERSION)
      buildTool: mvn
      buildCommand: $(FTFY_MVN_GOAL)
      buildFile: spring-batch-main/pom.xml
      additionalTranslationArgs: >-
        -Dcom.fortify.sca.NullPtrMaxFunctionTime=30000

        -Dcom.fortify.sca.exclude.unimported.node.modules=true

        -Dcom.fortify.sca.EnableDOMModeling=true

        -Dcom.fortify.sca.fileextensions.inc=PHP

        -Dcom.fortify.sca.rules.password_regex.global=(?i)(s|_)?(user|usr|member|admin|guest|login|default|new|current|old|client|server|proxy|sqlserver|my|mysql|mongo|mongodb|db|database|ldap|smtp|email|email(_)?smtp)?(_|\.)?(pass(wd|word|phrase)|secret|senha)
      excludeArgs: >-
        ./**/node_modules/**/*

        ./**/*.min.js

        ./**/dist/**/*
      skipBuild: false
      excludeDisabledProjects: false
      includeTest: false
      includeNodeModules: false
      additionalScanArgs: >-
        -build-label $(FORTIFY_FPR_NAME)

        -build-version $(FORTIFY_FPR_NAME)-$(Build.BuildNumber)
      sensorPool: $(FORTIFY_SENSOR_POOL)
      block: true
      logFile: $(Build.Repository.Name)-$(FORTIFY_NEW_VERSION)-$(Build.BuildNumber).log
      overwrite: true
      quiet: false
      downloadDebugLogs: false
      debugLogFileName: $(Build.Repository.Name)-$(FORTIFY_FPR_NAME)-fortify-debug-logs.zip
  - task: FortifyScanCentralSAST@7
    displayName: 'SAST: Análise Default [Síncrona]'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), eq(variables['guardrail.sec'], 'true'), ne(variables['fortify_disable'], 'gecmi'), ne(variables['p_language'], 'java'))
    retryCountOnTaskFailure: 2
    inputs:
      scanCentralCtrlUrl: $(FORTIFY_URL_CONTROLLER)
      scanCentralClientToken: $(FORTIFY_CLIENT_AUTH_TOKEN)
      sscUrl: $(FORTIFY_URL)
      sscCiToken: $(FORTIFY_CI_TOKEN)
      uploadToSSC: true
      applicationName: $(Build.Repository.Name)
      applicationVersion: $(FORTIFY_NEW_VERSION)
      autoDetectBuildTool: true
      additionalTranslationArgs: >-
        -Dcom.fortify.sca.exclude.unimported.node.modules=true

        -Dcom.fortify.sca.EnableDOMModeling=true

        -Dcom.fortify.sca.fileextensions.inc=PHP

        -Dcom.fortify.sca.rules.password_regex.global=(?i)(s|_)?(user|usr|member|admin|guest|login|default|new|current|old|client|server|proxy|sqlserver|my|mysql|mongo|mongodb|db|database|ldap|smtp|email|email(_)?smtp)?(_|\.)?(pass(wd|word|phrase)|secret|senha)
      excludeArgs: >-
        ./**/node_modules/**/*

        ./**/*.min.js

        ./**/dist/**/*
      skipBuild: false
      excludeDisabledProjects: false
      includeTest: false
      includeNodeModules: false
      additionalScanArgs: >-
        -build-label $(FORTIFY_FPR_NAME)

        -build-version $(FORTIFY_FPR_NAME)-$(Build.BuildNumber)
      sensorPool: $(FORTIFY_SENSOR_POOL)
      block: true
      logFile: $(Build.Repository.Name)-$(FORTIFY_NEW_VERSION)-$(Build.BuildNumber).log
      overwrite: true
      quiet: false
      downloadDebugLogs: false
      debugLogFileName: $(Build.Repository.Name)-$(FORTIFY_FPR_NAME)-fortify-debug-logs.zip
  - task: CmdLine@2
    displayName: '[MANTER] SAST: Imprime Log da execução -- Futuro Guardrail'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded())
    continueOnError: True
    enabled: False
    inputs:
      script: >-
        echo Imprimindo log da execução...


        echo "##[command]cat $(System.DefaultWorkingDirectory)/$(Build.Repository.Name)-$(FORTIFY_FPR_NAME)-$(Build.BuildNumber).log"


        cat $(System.DefaultWorkingDirectory)/$(Build.Repository.Name)-$(FORTIFY_FPR_NAME)-$(Build.BuildNumber).log
  - task: CmdLine@2
    displayName: 'SAST: Guardrail Segurança Cibernética'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), eq(variables['guardrail.sec'], 'true'), ne(variables['fortify_disable'], 'gecmi'))
    inputs:
      script: "command -v docker && docker --version\ncommand -v podman && podman --version\n\necho \"$FORTIFY_REGISTRY_PASSWORD\" | $CONTAINER_ENGINE login default-route-openshift-image-registry.apps.produtos4.caixa \\\n  --username \"$FORTIFY_REGISTRY_USERNAME\" \\\n  --password-stdin\n \necho FORTIFY_APPLICATION: $FORTIFY_APPLICATION\n\necho KEYSTORE_SECUREFILEPATH: $KEYSTORE_SECUREFILEPATH\ncp \"$KEYSTORE_SECUREFILEPATH\" \"$(System.DefaultWorkingDirectory)/keystore.jks\"\n\necho \"##[command]$CONTAINER_ENGINE --version\"\n$CONTAINER_ENGINE --version\n\necho \"##[command]Executando container Fortify...\"\n\n$CONTAINER_ENGINE run --rm \\\n  --security-opt seccomp=unconfined \\\n  --memory=12g \\\n  --memory-swap=12g \\\n  -v $(System.DefaultWorkingDirectory):/src \\\n  -w /src \\\n  -e FORTIFY_APPLICATION \\\n  -e FORTIFY_APP_VERSION=$FORTIFY_NEW_VERSION \\\n  -e FORTIFY_PREVIOUS_VERSION=$FORTIFY_LAST_VERSION \\\n  -e FORTIFY_SESSION \\\n  -e FORTIFY_URL \\\n  -e FORTIFY_CI_TOKEN \\\n  -e FORTIFY_CLIENT_AUTH_TOKEN \\\n  -e FORTIFY_FILTERSET_GUARDRAIL \\\n  -e FORTIFY_SENSOR_VERSION \\\n  -e FORTIFY_SIGLA=$(Build.DefinitionName) \\\n  -e FORTIFY_COMUNIDADE \\\n  -e FORTIFY_LDAP_GROUP \\\n  default-route-openshift-image-registry.apps.produtos4.caixa/fortify/fortify-ci-tools:7.0.0-jdk-17 \\\n  bash -c \"\n    \n    echo Configurando Key Store\n    fcli config truststore set \\\n      --file=/src/keystore.jks \\\n      --password=$KEYSTORE_PWD \\\n      --type=jks\n    \n    echo \\\"Nome do Sistema: \\$FORTIFY_APPLICATION\\\"\n    echo \\\"Nome da Versão: \\$FORTIFY_APP_VERSION\\\"\n    echo \\\"Nome da Versão Anterior: \\$FORTIFY_PREVIOUS_VERSION\\\"\n    \n    echo Login no Fortify...\n    fcli ssc session login \\\n      --ssc-session=\\$FORTIFY_SESSION \\\n      --url=\\$FORTIFY_URL \\\n      --token=\\$FORTIFY_CI_TOKEN \\\n      --client-auth-token=\\$FORTIFY_CLIENT_AUTH_TOKEN \\\n      --socket-timeout=180\n    \n    echo Atualizando aplicação no Fortify...\n    fcli ssc appversion refresh-metrics \\\n      \\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION \\\n      --ssc-session=\\$FORTIFY_SESSION || true\n\n    echo\n    echo ===== BUSCANDO VULNERABILIDADES CRÍTICAS =====\n    \n    fcli ssc issue list \\\n      --appversion=\\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION \\\n      --filterset=\\$FORTIFY_FILTERSET_GUARDRAIL \\\n      --filter='Folder:Critical' \\\n      --output=csv \\\n      --to-file=guardrail-raw.csv \\\n      --ssc-session=\\$FORTIFY_SESSION || true\n\n    echo\n    echo ===== FILTRANDO ITENS INVÁLIDOS =====\n    \n    grep -v 'Not an Issue' guardrail-raw.csv > guardrail-results.csv || true\n\n    echo Resultado final:\n    cat guardrail-results.csv\n\n    echo\n    echo Logout do Fortify...\n    fcli ssc session logout \\\n      --ssc-session=\\$FORTIFY_SESSION \\\n      --no-revoke-token\n  \"\n\necho\necho \"##[debug]Resultado do Guardrail...\"\n\nguardrail_count=$(awk -F',' '\nNR > 1 {\n  for(i=1;i<=NF;i++){\n    if ($i == \"Critical\") {\n      count++\n      break\n    }\n  }\n}\nEND { print count+0 }\n' guardrail-results.csv)\n\nguardrail_count=${guardrail_count:-0}\n\necho \"##[debug]Total de vulnerabilidades críticas válidas: $guardrail_count\"\n\nif [ \"$guardrail_count\" -gt 0 ]; then\n  echo \"##vso[task.logissue type=error]Foram encontradas $guardrail_count vulnerabilidades críticas que violam os padrões de segurança exigidos.\"\n  exit 1\nelse\n  echo \"##[debug]Não foram encontradas vulnerabilidades críticas válidas.\"\nfi\n\necho \"##[debug]Resultado publicado no Fortify: '$FORTIFY_APPLICATION:$FORTIFY_NEW_VERSION'\""
  - task: CmdLine@2
    displayName: 'SAST: Guardrail Segurança Cibernética - Backup'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), eq(variables['guardrail.sec'], 'true'), ne(variables['fortify_disable'], 'gecmi'))
    enabled: False
    inputs:
      script: "command -v docker && docker --version\ncommand -v podman && podman --version\n\n#sudo usermod -aG docker $USER\n\n#ls -l /var/run/docker.sock\n\n#set -o errexit\n#set -o pipefail\n#echo Engine selecionado: $CONTAINER_ENGINE\n#echo Versão mais recente: $FORTIFY_NEW_VERSION\n#echo Versão anterior: $FORTIFY_LAST_VERSION\n\necho \"$FORTIFY_REGISTRY_PASSWORD\" | $CONTAINER_ENGINE login default-route-openshift-image-registry.apps.produtos4.caixa --username \"$FORTIFY_REGISTRY_USERNAME\" --password-stdin\n \necho FORTIFY_APPLICATION: $FORTIFY_APPLICATION\necho KEYSTORE_SECUREFILEPATH: $(KEYSTORE_SECUREFILEPATH)\nKEYSTORE_SECUREFILEPATH=$(KEYSTORE_SECUREFILEPATH)\ncp $KEYSTORE_SECUREFILEPATH $(System.DefaultWorkingDirectory)/keystore.jks\n#echo \"##vso[task.setvariable variable=KEYSTORE_SECUREFILEPATH]$KEYSTORE_SECUREFILEPATH\"\n\n# Valida Integridade do JKS (parte 1, fora do container)\n#echo Valida integridade do certificado FORA do container\n#echo \"##[command]md5sum /etc/pki/ca-trust/source/anchors/keystore-ssc24.jks\"\n#md5sum /etc/pki/ca-trust/source/anchors/keystore-ssc24.jks\n#echo \"##[command]md5sum $KEYSTORE_SECUREFILEPATH\"\n#md5sum $KEYSTORE_SECUREFILEPATH\n#echo \"##[command]md5sum $(System.DefaultWorkingDirectory)/keystore.jks\"\n#md5sum $(System.DefaultWorkingDirectory)/keystore.jks\n\n# Executa o container Fortify com as variáveis herdadas do ambiente\necho \"##[command]$CONTAINER_ENGINE --version\"\n$CONTAINER_ENGINE --version\necho \"##[command]$CONTAINER_ENGINE run -v $(System.DefaultWorkingDirectory):/src default-route-openshift-image-registry.apps.produtos4.caixa/fortify/fortify-ci-tools:7.0.0-jdk-17\"\n$CONTAINER_ENGINE run --rm \\\n  --security-opt seccomp=unconfined \\\n  --memory=12g \\\n  --memory-swap=12g \\\n  -v $(System.DefaultWorkingDirectory):/src \\\n  -w /src \\\n  -e FORTIFY_APPLICATION \\\n  -e FORTIFY_APP_VERSION=$FORTIFY_NEW_VERSION \\\n  -e FORTIFY_PREVIOUS_VERSION=$FORTIFY_LAST_VERSION \\\n  -e FORTIFY_SESSION \\\n  -e FORTIFY_URL \\\n  -e FORTIFY_CI_TOKEN \\\n  -e FORTIFY_CLIENT_AUTH_TOKEN \\\n  -e FORTIFY_FILTERSET_GUARDRAIL \\\n  -e FORTIFY_SENSOR_VERSION \\\n  -e FORTIFY_SIGLA=$(Build.DefinitionName) \\\n  -e FORTIFY_COMUNIDADE \\\n  -e FORTIFY_LDAP_GROUP \\\n  default-route-openshift-image-registry.apps.produtos4.caixa/fortify/fortify-ci-tools:7.0.0-jdk-17 \\\n  bash -c \"\n    \n    #echo Valida integridade do certificado DENTRO do container\n    #echo md5sum /src/keystore.jks\n    #md5sum /src/keystore.jks\n    \n    echo Configurando Key Store\n    fcli config truststore set \\\n      --file=/src/keystore.jks \\\n      --password=$KEYSTORE_PWD \\\n      --type=jks\n    \n    echo \\\"Nome do Sistema: \\$FORTIFY_APPLICATION\\\"\n    \n    echo \\\"Nome da Versão: \\$FORTIFY_APP_VERSION\\\"\n    \n    echo \\\"Nome da Versão Anterior: \\$FORTIFY_PREVIOUS_VERSION\\\"\n    \n    echo Login no Fortify...\n    fcli ssc session login \\\n      --ssc-session=\\$FORTIFY_SESSION \\\n      --url=\\$FORTIFY_URL \\\n      --token=\\$FORTIFY_CI_TOKEN \\\n      --client-auth-token=\\$FORTIFY_CLIENT_AUTH_TOKEN \\\n    \n    \n    echo Atualizando aplicação no Fortify...\n    fcli ssc appversion refresh-metrics \\\n      \\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION \\\n      --ssc-session=\\$FORTIFY_SESSION || true\n    \n    echo Consultando número de vulnerabilidades da aplicação...\n    fcli ssc issue count \\\n      --appversion=\\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION \\\n      --by=FOLDER \\\n      --filterset=\\$FORTIFY_FILTERSET_GUARDRAIL \\\n      --filter='Folder:Critical' \\\n      --output=csv \\\n      --to-file=guardrail-results.csv \\\n      --ssc-session=\\$FORTIFY_SESSION || true\n    \n    cat guardrail-results.csv\n    \n    echo\n    echo Logout do Fortify...\n    fcli ssc session logout \\\n      --ssc-session=\\$FORTIFY_SESSION \\\n      --no-revoke-token\n  \"\n\necho \"##[debug]Resultado do Guardrail...\"\nguardrail_results=false\nwhile IFS=',' read -r id cleanName name totalCount auditedCount visibleCount; do\n  if [ \"$cleanName\" == \"Critical\" ] && [ \"$totalCount\" -gt 0 ]; then\n    guardrail_results=true\n    guardrail_count=$totalCount\n  fi\ndone < guardrail-results.csv\nif [ $guardrail_results == \"true\" ]; then\n  echo \"##vso[task.logissue type=error]Foram encontradas $guardrail_count vulnerabilidades que violam os padrões de segurança exigidos.\"\n  exit 1\nelse\n  echo \"##[debug]Não foram encontradas vulnerabilidades que violam os padrões de segurança exigidos.\"\nfi\necho \"##[debug]Seu resultado está publicado no Fortify sob a Versão de nome: ' $FORTIFY_APPLICATION:$FORTIFY_NEW_VERSION '\""
  - task: Bash@3
    displayName: md5
    inputs:
      targetType: inline
      script: >
        pwd

        ls $(project.file)

        HASH=`md5sum -b $(project.file)`

        SHA=`sha1sum -b $(project.file)`

        echo "MD5-BUILD: $HASH"

        echo "SHA1-BUILD: $SHA"
  - task: Bash@3
    displayName: Publica no Nexus
    inputs:
      targetType: inline
      script: >-
        cd $(Build.SourcesDirectory)


        p_group=$(project.group) || true

        p_name=$(project.name)

        p_version=$(project.version)

        p_extension=$(project.extension)


        p_group=`[ -z "$p_group" ] && echo ""br.gov.caixa.$p_name"" || echo "$p_group"`


        echo VEC $(valida.vec)

        if [ $(valida.vec) = true ];then

        p_version=$BUILD_SOURCEBRANCHNAME

        NEXUS_URL=$(NEXUS_URL_MAVEN_RELEASE)

        else

        p_version=${p_version^^}

        p_version=${p_version/-SNAPSHOT/}-SNAPSHOT

        #definido por GECPA em Nov/2025 que todo artefato não release candidate deve conter sufixo -SNAPSHOT

        echo "##vso[build.updatebuildnumber]"$p_version""

        NEXUS_URL=$(NEXUS_URL_MAVEN_SNAPSHOT)

        fi


        echo "##[section]=== Info do pacote ==="

        echo "##[section]groupid= $p_group"

        echo "##[section]artifact= $p_name"

        echo "##[section]version= $p_version"

        echo "========================================================="


        LIB="$(library)"

        # quando for uma pipeline do tipo lib o pom original do projeto precisa subir junto

        if [ "${LIB:-}" = "true" ] || [ "${LIB:-}" = "TRUE" ]; then


        echo -Dversion.app=$(Build.BuildNumber) -Dnexus_interno_user=$(nexus_interno_user) -Dnexus_interno_pass=$(nexus_interno_pass) -DgroupId="${p_group}" -DartifactId="${p_name}" -Dversion="${p_version}" -Dpackaging="${p_extension}" -Dfile="$(project.file)" -DpomFile="$(Build.SourcesDirectory)/spring-batch-main/pom.xml" -DrepositoryId=$(NEXUS_REPOSITORY_ID) -DgeneratePom=false -Durl=${NEXUS_URL} -Drevision="${p_version}"


        /opt/apache-maven/apache-maven-3.8.5/bin/mvn deploy:deploy-file -Dversion.app=$(Build.BuildNumber) -Dnexus_interno_user=$(nexus_interno_user) -Dnexus_interno_pass=$(nexus_interno_pass) -DgroupId="${p_group}" -DartifactId="${p_name}" -Dversion="${p_version}" -Dpackaging="${p_extension}" -Dfile="$(project.file)" -DpomFile="$(Build.SourcesDirectory)/spring-batch-main/pom.xml" -DrepositoryId=$(NEXUS_REPOSITORY_ID) -DgeneratePom=false -Durl=${NEXUS_URL} -Drevision="${p_version}"


        else


        echo -Dversion.app=$(Build.BuildNumber) -DgroupId="${p_group}" -DartifactId="${p_name}" -Dversion="${p_version}" -Dpackaging="${p_extension}" -Dfile="$(project.file)" -DrepositoryId=$(NEXUS_REPOSITORY_ID) -DgeneratePom=true -Durl=${NEXUS_URL}


        /opt/apache-maven/apache-maven-3.8.5/bin/mvn deploy:deploy-file -Dversion.app=$(Build.BuildNumber) -Dnexus_interno_user=$(nexus_interno_user) -Dnexus_interno_pass=$(nexus_interno_pass) -DgroupId="${p_group}" -DartifactId="${p_name}" -Dversion="${p_version}" -Dpackaging="${p_extension}" -Dfile="$(project.file)" -DrepositoryId=$(NEXUS_REPOSITORY_ID) -DgeneratePom=true -Durl=${NEXUS_URL} -Drevision="${p_version}"


        fi


        echo "##vso[task.setvariable variable=project.uploaded;]true"
  - task: Bash@3
    displayName: Publica no Nexus old
    enabled: False
    inputs:
      targetType: inline
      script: >-
        cd $(Build.SourcesDirectory)


        p_group=$(project.group) || true

        p_name=$(project.name)

        p_version=$(project.version)

        p_extension=$(project.extension)


        p_group=`[ -z "$p_group" ] && echo ""br.gov.caixa.$p_name"" || echo "$p_group"`



        if [ $(project.release) = true ]; then

        NEXUS_URL=$(NEXUS_URL_MAVEN_RELEASE)

        else

        NEXUS_URL=$(NEXUS_URL_MAVEN_SNAPSHOT)

        p_version=${p_version/-SNAPSHOT/}-SNAPSHOT

        fi


        echo $(valida.vec)

        if [ $(valida.vec) = true ];then

        p_version=$BUILD_SOURCEBRANCHNAME

        NEXUS_URL=$(NEXUS_URL_MAVEN_RELEASE)

        fi


        echo "##[section]info: -Dversion.app=$(Build.BuildNumber) -DgroupId="${p_group}" -DartifactId="${p_name}" -Dversion="${p_version}" -Dpackaging="${p_extension}" -Dfile="$(project.file)" -DrepositoryId=$(NEXUS_REPOSITORY_ID) -DgeneratePom=true -Durl=${NEXUS_URL}"


        /opt/apache-maven/apache-maven-3.8.5/bin/mvn deploy:deploy-file -Dversion.app=$(Build.BuildNumber) -Dnexus_interno_user=$(nexus_interno_user) -Dnexus_interno_pass=$(nexus_interno_pass) -DgroupId="${p_group}" -DartifactId="${p_name}" -Dversion="${p_version}" -Dpackaging="${p_extension}" -Dfile="$(project.file)" -DrepositoryId=$(NEXUS_REPOSITORY_ID) -DgeneratePom=true -Durl=${NEXUS_URL} -Drevision="${p_version}"



        echo "##vso[task.setvariable variable=project.uploaded;]true"
      failOnStderr: true
  - task: Bash@3
    displayName: Bash Script
    enabled: False
    inputs:
      targetType: inline
      script: exit 1
  - task: DeleteFiles@1
    displayName: Delete files from $(Agent.BuildDirectory)/fortify
    condition: always()
    inputs:
      SourceFolder: $(Agent.BuildDirectory)/fortify
      Contents: '*'
      RemoveSourceFolder: true
  - task: PublishTestResults@2
    displayName: Publica o resultado do teste
...









Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings

SIRSA

SIRSA-batch

Tasks

Variables

Triggers

Options

History
Java-Build
Task version
5.*
Display name
Java-Build
AZPAT
$(AZPAT)
FORTIFY_API
$(FORTIFY_API)
FORTIFY_APITOKEN
$(FORTIFY_APITOKEN)
FORTIFY_BUILD
$(FORTIFY_BUILD)
FORTIFY_CI_TOKEN
$(FORTIFY_CI_TOKEN)
FORTIFY_CLIENT_AUTH_TOKEN
$(FORTIFY_CLIENT_AUTH_TOKEN)
fortify_disable
$(fortify_disable)
FORTIFY_FPR_NAME
$(FORTIFY_FPR_NAME)
FORTIFY_NEW_VERSION
$(FORTIFY_NEW_VERSION)
FORTIFY_PASS
$(FORTIFY_PASS)
FORTIFY_POOL_GOLD_NOVO
$(FORTIFY_POOL_GOLD_NOVO)
FORTIFY_POOL_SILVER_NOVO
$(FORTIFY_POOL_SILVER_NOVO)
FORTIFY_REGEX
$(FORTIFY_REGEX)
FORTIFY_SENSOR_POOL
$(FORTIFY_SENSOR_POOL)
FORTIFY_UPTOKEN
$(FORTIFY_UPTOKEN)
FORTIFY_URL
$(FORTIFY_URL)
FORTIFY_URL_CONTROLLER
$(FORTIFY_URL_CONTROLLER)
FORTIFY_USER
$(FORTIFY_USER)
FORTIFY_VERSION_BUILD
$(FORTIFY_VERSION_BUILD)
GradleVersion
$(GradleVersion)
JAVA_VERSION
open-jdk-21.0.5/
KEYSTORE_SECUREFILEPATH
$(KEYSTORE_SECUREFILEPATH)
lista_versao
$(lista_versao)
MAVEN_VERSION
3.9.9
MVN_GOAL
clean compile install -DskipTests=false
nexus_interno_pass
$(nexus_interno_pass)
nexus_interno_user
$(nexus_interno_user)
NEXUS_REPOSITORY_ID
$(NEXUS_REPOSITORY_ID)
NEXUS_URL_RELEASE
$(NEXUS_URL_MAVEN_RELEASE)
NEXUS_URL_SNAPSHOT
$(NEXUS_URL_MAVEN_SNAPSHOT)
NEXUS_URL_SNAPSHOT_ALIAS
SNAPSHOT
NODE_EXTRA_CA_CERTS
$(NODE_EXTRA_CA_CERTS)
p_language
$(p_language)
POM_PATH
spring-batch-main/pom.xml
project.extension
$(project.extension)
project.file
$(project.file)
project.group
$(project.group)
project.name
$(project.name)
project.release
$(project.release)
project.version
$(project.version)
REPOSITORIO
$(REPOSITORIO)
SCANCENTRAL_URL
$(SCANCENTRAL_URL)
SONAR_LOGIN
$(SONAR_LOGIN)
SONAR_PASSWORD
$(SONAR_PASSWORD)
SONAR_PROPERTIES
$(SONAR_PROPERTIES)
SONAR_URL
$(SONAR_URL)
token
$(token)
token_id
$(token_id)
valida.vec
$(valida.vec)
version.app
$(version.app)
versionApp
$(versionApp)
Control Options
Output Variables
Showing 11 filtered items.

Showing 11 filtered items.

Get started and run this pipeline for the first time!

Showing 11 filtered items.

Showing 11 filtered items.

1 pipelines found

Row 2

Row 2

Row 2

Row 2

Expanded

Collapsed

Row 5. Clickable

Showing 25 filtered items.

Get started and run this pipeline for the first time!

Showing 38 filtered items.

Showing 25 filtered items.

Expanded

Collapsed

Collapsed







