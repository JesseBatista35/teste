




DevSecOps-Solutions/.github/workflows
/akv.yml


name: 'Retrieve All Secrets from Key Vault'
on:
  workflow_call:
    inputs:
      keyvault_name:
        description: 'Informe o nome do keyvault'
        required: true
        type: string
      identity_id:
        description: 'Informe o identity id'
        required: true
        type: string
      subscription_id:
        description: 'Informe o subscription_id'
        required: true
        type: string
jobs:
  retrieve-secrets:
    runs-on: ubuntu-latest
    steps:
      - name: 'Checkout repository'
        uses: actions/checkout@v4

      - name: 'Retrieve all secrets'
        uses: caixagithub/DevSecOps-Actions/.github/integrations/azure/akv@main
        with:
          keyvault-name: ${{ inputs.keyvault_name }}
          identity_id: ${{ inputs.identity_id }}
          subscription_id: ${{ inputs.subscription_id }}




          Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
code Search Results · org:caixagithub path:.github/workflows ubuntu-latest techdocs-pipelines
Filter by
Repositories
Advanced
4 files
 (236 ms)
4 files
in
caixagithub(press backspace or delete to remove)
Files with identical content are grouped together. 


caixagithub/DevSecOps-Solutions · .github/workflows/techdocs-pipelines.yaml
YAML
·
1
 (1)
jobs:
 publish-techdocs-site:
   runs-on: ubuntu-latest
   env:
     TECHDOCS_STG_CONTAINER_NAME: ${{ vars.STG_TECHDOCS_CONTAINER_ORG }}
     TECHDOCS_STG_ACC_NAME: ${{ vars.STG_TECHDOCS_ACC_NAME_ORG }}


caixagithub/sidgc-doc-arquitetura · .github/workflows/call-techdocs-pipelines.yaml
YAML
·
1
 (1)
jobs:
  build-techdocs-site:
    runs-on: ubuntu-latest
    # The following secrets are required in your CI environment for publishing files to AWS S3.
    # e.g. You can use GitHub Organization secrets to set them for all existing and new repositories.


caixagithub/sidgc-arquiteturaArchived · .github/workflows/call-techdocs-pipelines.yaml


caixagithub/DevSecOps-Solutions-New-Flow-Test · .github/workflows/techdocs-pipelines.yaml
YAML
·
1
 (1)
jobs:
 publish-techdocs-site:
   runs-on: ubuntu-latest
   env:
     TECHDOCS_STG_CONTAINER_NAME: ${{ vars.STG_TECHDOCS_CONTAINER_ORG }}
     TECHDOCS_STG_ACC_NAME: ${{ vars.STG_TECHDOCS_ACC_NAME_ORG }}  



Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
code Search Results · org:caixagithub path:.github/workflows ubuntu-latest /mvn|gradle|java/
Filter by
Repositories
Paths
Advanced
75 files
 (461 ms)
75 files
in
caixagithub(press backspace or delete to remove)
Files with identical content are grouped together. 


caixagithub/DevSecOps-Templates · .github/workflows/buildGradle.yml
YAML
·
8
 (8)
        type: string
jobs:
  build-gradle:
    runs-on: ubuntu-latest
    steps:
Show 6 more matches


caixagithub/DevSecOps-Templates-New-Flow-Test · .github/workflows/buildGradle.yml


caixagithub/DevSecOps-Actions-New-Flow-Test · .github/workflows/buildGradle.yml


caixagithub/DevSecOps-Develop-Test · .github/workflows/buildGradle.yml


caixagithub/DevSecOps-Actions · .github/workflows/buildGradle.yml


caixagithub/siacx-sonar-mcp-server · .github/workflows.bkp/build.yml
YAML
·
5
 (5)
          sonar-platform: sqc-eu
          gradle-args: :cyclonedxBom jacocoTestReport
          use-develocity: true
    needs: [build]
    runs-on: github-ubuntu-latest-m
    name: IT - ${{ matrix.name }}
Show 3 more matches


caixagithub/DevSecOps-Solutions · .github/workflows/java-libs-pipelines-multimodules.yaml
YAML
·
39
 (39)
      java_version:
        description: "Versão do java utilizado pela aplicação"
      java_distribution:
        description: "Distribuição do java"
    runs-on: arc-runner-set-default-nprod #ubuntu-latest
      MVN_ARGS: "-B -ntp"
      # 2. Setup Java (NÃO cria settings.xml)
        uses: actions/setup-java@v4
Show 31 more matches


caixagithub/siplx-portal-gestao · .github/workflows/codeql.yml
YAML
·
8
 (8)
    runs-on: ${{ (matrix.language == 'swift' && 'macos-latest') || 'ubuntu-latest' }}
        - language: javascript-typescript
…rds for 'language': 'actions', 'c-cpp', 'csharp', 'go', 'java-kotlin', 'javascript-typescript', 'python', 'ruby', 'rus…
        # Use 'java-kotlin' to analyze code written in Java, Kotlin or both
        # Use 'javascript-typescript' to analyze code written in JavaScript, TypeScript or both


caixagithub/SIMPF-backend · .github/workflows/copilot-setup-steps.yml
YAML
·
5
 (5)
  copilot-setup-steps:
    runs-on: ubuntu-latest
      - name: Configurar Java (Temurin 21)
        uses: actions/setup-java@v4
Show 2 more matches


caixagithub/silce-quarkus-logging · .github/workflows/deploy-package.yaml
YAML
·
12
 (12)
  deploy:
    runs-on: ubuntu-latest
    
      - name: Set up JDK 17
        uses: actions/setup-java@v4
        with:
Show 10 more matches


caixagithub/silce-compra · .github/workflows/call-generic-sec-pipelines.yaml
YAML
·
3
 (3)
jobs:
  analyze:
    name: Analyze (java)
    runs-on: ubuntu-latest
    strategy:
      fail-fast: false
Show 1 more match


caixagithub/DevSecOps-Solutions-New-Flow-Test · .github/workflows/codeql-pipelines.yaml
YAML
·
28
 (28)
  analyze:
    needs: [create-matrix]
    name: Analyze
    runs-on: ${{ matrix.language == 'java' && 'arc-runner-set-default-nprod' || 'ubuntu-latest' }}
    env:
      ANDROID_HOME: /usr/lib/android-sdk/
      GITHUB_TOKEN: ${{ secrets.GITHUB_TOKEN }}
Show 26 more matches


caixagithub/sidas-doc-arquitetura · .github/workflows/publish-site.yml
YAML
·
6
 (6)
    name: Build MkDocs
    runs-on: ubuntu-latest
    steps:
      - name: Configurar Java (para o PlantUML)
        uses: actions/setup-java@v4
Show 3 more matches


caixagithub/sirmc-doc-wiki · .github/workflows/publish-site.yml


caixagithub/sipgc-desenvolveai-fabric · .github/workflows/spec-agent.yml
YAML
·
2
 (2)
      startsWith(github.event.comment.body, '/spec') &&
      github.actor != 'github-actions[bot]' &&
      github.actor != 'copilot'
    runs-on: ubuntu-latest
    env:
      FORCE_JAVASCRIPT_ACTIONS_TO_NODE24: true
      TARGET_OWNER: caixagithub


caixagithub/silce-bff · .github/workflows/call-generic-sec-pipelines.yaml
YAML
·
5
 (5)
  contents: read
jobs:
  analyze:
    name: Analyze Java
    runs-on: ubuntu-latest
    permissions:
Show 3 more matches


caixagithub/silce-gestao-operacional · .github/workflows/call-generic-sec-pipelines.yaml


caixagithub/silce-parametros-jogos · .github/workflows/call-generic-sec-pipelines.yaml


caixagithub/siplx-agentes · .github/workflows/codeql.yml
YAML
·
8
 (8)
    runs-on: ${{ (matrix.language == 'swift' && 'macos-latest') || 'ubuntu-latest' }}
        - language: javascript-typescript
…rds for 'language': 'actions', 'c-cpp', 'csharp', 'go', 'java-kotlin', 'javascript-typescript', 'python', 'ruby', 'rus…
        # Use 'java-kotlin' to analyze code written in Java, Kotlin or both
        # Use 'javascript-typescript' to analyze code written in JavaScript, TypeScript or both


caixagithub/sidvi-doc-fabricademov2 · .github/workflows/discovery-agent.yml
YAML
·
2
 (2)
      startsWith(github.event.comment.body, '/discovery') &&
      github.actor != 'github-actions[bot]' &&
      github.actor != 'copilot'
    runs-on: ubuntu-latest
    env:
      FORCE_JAVASCRIPT_ACTIONS_TO_NODE24: true


caixagithub/sidvi-doc-fabrica · .github/workflows/discovery-agent.yml


caixagithub/DevSecOps-Solutions-New-Flow-Test · .github/workflows/java-libs-pipelines.yaml
YAML
·
27
 (27)
      java_distribution:
        description: "Distribuição do java"
        required: false
    if: ${{ github.ref_name == 'main' || github.ref_name == 'develop' }} 
    runs-on: ubuntu-latest
    
Show 24 more matches


caixagithub/silce-quarkus-logging · .github/workflows/publish-snapshot.yaml
YAML
·
11
 (11)
  publish-snapshot:
    runs-on: ubuntu-latest
    
      - name: Set up JDK 17
        uses: actions/setup-java@v4
        with:
Show 9 more matches


caixagithub/sidvi-backend-spring-desenvolve-ai · .github/workflows/call-generic-sec-pipelines.yaml
YAML
·
6
 (6)
    name: CodeQL
    runs-on: ubuntu-latest
    steps:
      - name: Setup Java 25
        uses: actions/setup-java@v4
Show 3 more matches


caixagithub/DevSecOps-SpectralCheck · .github/workflows/check-dist.yml
YAML
·
2
 (2)
    name: Check dist/
    runs-on: ubuntu-latest
Show 1 more match


caixagithub/sidgc-doc-arquitetura · .github/workflows/call-techdocs-pipelines.yaml
YAML
·
12
 (12)
  build-techdocs-site:
    runs-on: ubuntu-latest
      - name: Get latest java LTS family version number
        run: |
Show 10 more matches


caixagithub/sidgc-arquiteturaArchived · .github/workflows/call-techdocs-pipelines.yaml


caixagithub/sigcn-sdk-android · .github/workflows/publish.yaml
YAML
·
11
 (11)
  build-and-publish:
    runs-on: ubuntu-latest
      - name: Set up JDK
        uses: actions/setup-java@v4
        with:
Show 9 more matches


caixagithub/coe-java-api · .github/workflows/maven.yml
YAML
·
4
 (4)
name: Java CI with Maven
    runs-on: ubuntu-latest
Show 2 more matches



Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
code Search Results · org:caixagithub path:.github/workflows ubuntu-latest /pip|python|ansible|helm|docker/
Filter by
Languages
Repositories
Paths
Advanced
134 files
 (264 ms)
134 files
in
caixagithub(press backspace or delete to remove)
Files with identical content are grouped together. 


caixagithub/automation-padroniza-workflow-callers · .github/workflows/ci.yml
YAML
·
41
 (41)
    name: Lint Ansible
    runs-on: ubuntu-latest
  test:
    name: Teste Ansible
    runs-on: ubuntu-latest
Show 37 more matches


caixagithub/DevSecOps-Automation-Create-Ecr-Repositories · .github/workflows/ci.yml


caixagithub/DevSecOps-hotfix-test · .github/workflows/ExtractDevAzure.yml
YAML
·
45
 (45)
  ExtraiDadosPipelines:
    runs-on: ubuntu-latest
    steps:
        run: |
          python -m pip install --upgrade pip
          pip install pandas openpyxl requests
Show 39 more matches


caixagithub/coe-java-api · .github/workflows/ExtractDevAzure.yml


caixagithub/DevSecOps-Dependabot-ZeroAlerts-Test · .github/workflows/build-image.yaml
YAML
·
13
 (13)
  Generic-Solution:
    runs-on: ubuntu-latest
    steps:
      - name: Set up Docker Buildx
        uses: docker/setup-buildx-action@v3
Show 10 more matches


caixagithub/DevSecOps-Solutions-New-Flow-Test · .github/workflows/gsc-integration-generic-pipeline.yaml
YAML
·
19
 (19)
  VALIDATION:
    runs-on: ubuntu-latest
    environment: ${{ matrix.environment }}
      - name: Configurar Python
        uses: actions/setup-python@v4
Show 16 more matches


caixagithub/sigcn-digital-painel-gestao-frontend · .github/workflows/call-generic-pipelines.yaml
YAML
·
5
 (5)
…packages: read         -> Permite ler pacotes (ex: npm, docker)                                                       …
…caixagithub/DevSecOps-Solutions/.github/workflows/generic-pipelines.yaml@main -> Template reutilizado                 …
    runs-on: ubuntu-latest
    # uses: caixagithub/DevSecOps-Solutions/.github/workflows/generic-pipelines.yaml@main
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/gsc-integration-generic-pipeline.yaml@main


caixagithub/sigcn-lib-contestacao · .github/workflows/call-dotnet-libs-pipelines.yaml
YAML
·
8
 (8)
…packages: read         -> Permite ler pacotes (ex: npm, docker)                                                       …
  group: 'call-dotnet-libs-pipelines'
…caixagithub/DevSecOps-Solutions/.github/workflows/generic-pipelines.yaml@main -> Template reutilizado                 …
    uses: ./.github/workflows/call-docs-pipelines.yaml
    runs-on: ubuntu-latest
    uses: ./.github/workflows/call-single-lib-pipeline.yaml
    uses: ./.github/workflows/call-single-lib-pipeline.yaml
    uses: ./.github/workflows/call-single-lib-pipeline.yaml


caixagithub/github-permission-automation · .github/workflows/sync-permissions.yml
YAML
·
6
 (6)
  sync:
    runs-on: ubuntu-latest
    steps:
      - name: Configurar Python
        uses: actions/setup-python@v4
Show 3 more matches


caixagithub/sisph-doc-devsecops-policies · .github/workflows/sync-github-environments.yml
YAML
·
9
 (9)
    name: Sincronizar environments GitHub
    runs-on: ubuntu-latest
      - name: Configurar Python
        uses: actions/setup-python@v5
Show 6 more matches


caixagithub/sidgc-doc-arquitetura · .github/workflows/call-techdocs-pipelines.yaml
YAML
·
18
 (18)
  build-techdocs-site:
    runs-on: ubuntu-latest
          echo -n '>=' >> .python-version
          wget -O python-versions.html https://devguide.python.org/versions/
Show 14 more matches


caixagithub/sidgc-arquiteturaArchived · .github/workflows/call-techdocs-pipelines.yaml


caixagithub/sirmc-backend-marcas · .github/workflows/codeql.yml
YAML
·
2
 (2)
    runs-on: ${{ (matrix.language == 'swift' && 'macos-latest') || 'ubuntu-latest' }}
…anguage': 'actions', 'c-cpp', 'csharp', 'go', 'java-kotlin', 'javascript-typescript', 'python', 'ruby', 'rust', 'swift'


caixagithub/sictm-ios · .github/workflows/ios.yml
YAML
·
26
 (26)
      - name: Cloning appdome-api-python github repository
        if: ${{ env.ENABLE_APP_DOME == 'true' }}
    needs: [CI, SUBIR, FARM]
    runs-on: ubuntu-latest
    steps:
Show 24 more matches


caixagithub/DevSecOps-Workflow-Tests · .github/workflows/setting-initial-vars.yaml
YAML
·
6
 (6)
    needs: TEST_SETTING_OUTPUTS
    runs-on: ubuntu-latest
    strategy:
      - name: Set up Python
        uses: actions/setup-python@v4
Show 3 more matches


caixagithub/siplx-agentes · .github/workflows/plugin.yaml
YAML
·
4
 (4)
    name: Validar manifestos e componentes
    runs-on: ubuntu-latest
    steps:
      - uses: actions/setup-python@v7
        with:
Show 2 more matches


caixagithub/siacx-sonar-mcp-server · .github/workflows.bkp/docker-build-check.yml
YAML
·
8
 (8)
jobs:
  build-amd64:
    name: Docker Build (amd64)
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@de0fac2e4500dabe0009e67214ff5f5447ce83dd # v6.0.2
Show 6 more matches


caixagithub/DevSecOps-Seguranca · .github/workflows/codeql.yml
YAML
·
2
 (2)
    runs-on: ${{ (matrix.language == 'swift' && 'macos-latest') || 'ubuntu-latest' }}
…ues keywords for 'language': 'c-cpp', 'csharp', 'go', 'java-kotlin', 'javascript-typescript', 'python', 'ruby', 'swift'


caixagithub/DevSecOps-Pipelines · .github/workflows/syncDevHubSkeletons.yaml
YAML
·
41
 (41)
  validate-and-sync:
    runs-on: ubuntu-latest 
      # 9) (Opcional) Disparar aprovação via Ansible AAP assim que o PR for criado
      #    Requer secret: ANSIBLE_TOKEN com permissão no AAP.
Show 38 more matches


caixagithub/DevSecOps-Workflow-Jobs-New-Flow-Test · .github/workflows/default-validation-job.yaml
YAML
·
10
 (10)
  VALIDATION:
    runs-on: ubuntu-latest
    outputs:
      - name: Configurar Python
        uses: actions/setup-python@v4
Show 7 more matches


caixagithub/DevSecOps-Create-New-Automation · roles/provision/files/modelo_automacao/{[cookiecutter.directory_name]}/.github/workflows/cd.yml
YAML
·
13
 (13)
    name: Release Collection
    runs-on: ubuntu-latest
    
      
    - name: Setup Python
      uses: actions/setup-python@v4
Show 10 more matches


caixagithub/siidp-api-teste-api-d20260818h1617 · .github/workflows/syncDevHubSkeletons.yaml
YAML
·
41
 (41)
  validate-and-sync:
    runs-on: ubuntu-latest 
    steps:
      #       pipelines
      # 9) (Opcional) Disparar aprovação via Ansible AAP assim que o PR for criado
      #    Requer secret: ANSIBLE_TOKEN com permissão no AAP.
Show 37 more matches


caixagithub/siidp-api-teste-api-d20260819h1634 · .github/workflows/syncDevHubSkeletons.yaml


caixagithub/siidp-api-teste-api-d20260818h1653 · .github/workflows/syncDevHubSkeletons.yaml


caixagithub/siidp-api-teste-api-d20260819h1719 · .github/workflows/syncDevHubSkeletons.yaml


caixagithub/siidp-api-teste-api-d20260819h1652 · .github/workflows/syncDevHubSkeletons.yaml


caixagithub/DevSecOps-Solutions · .github/workflows/generic-s3-pipelines.yaml
YAML
·
3
 (3)
  DEPLOY:
    needs: [VALIDATION, BUILD]
    runs-on: ubuntu-latest
    env:
      DOCKER_TLS_VERIFY: ""
      DOCKER_CERT_PATH: ""
