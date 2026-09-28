org:caixagithub path:.github/workflows ubuntu-latest
org:caixadepartamental path:.github/workflows ubuntu-latest



Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
code Search Results · org:caixagithub path:.github/workflows ubuntu-latest
Filter by
Languages
Repositories
Paths
Advanced
135 files
 (362 ms)
135 files
in
caixagithub(press backspace or delete to remove)
Files with identical content are grouped together. 


caixagithub/automation-padroniza-workflow-callers · .github/workflows/ci.yml
YAML
·
3
 (3)
    name: Lint Ansible
    runs-on: ubuntu-latest
    name: Teste Ansible
    runs-on: ubuntu-latest
    needs: lint
Show 1 more match


caixagithub/DevSecOps-Automation-Create-Ecr-Repositories · .github/workflows/ci.yml


caixagithub/siacx-sonar-mcp-server · .github/workflows.bkp/build.yml
YAML
·
2
 (2)
    needs: [build]
    runs-on: github-ubuntu-latest-m
    name: IT - ${{ matrix.name }}
    needs: [build, integration]
    runs-on: github-ubuntu-latest-s  # Public repository runner
    name: Promote


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


caixagithub/silce-bff · .github/workflows/call-generic-sec-pipelines.yaml
YAML
·
1
 (1)
jobs:
  analyze:
    name: Analyze Java
    runs-on: ubuntu-latest
    permissions:
      actions: read


caixagithub/silce-gestao-operacional · .github/workflows/call-generic-sec-pipelines.yaml


caixagithub/silce-parametros-jogos · .github/workflows/call-generic-sec-pipelines.yaml


caixagithub/DevSecOps-Seguranca · .github/workflows/codeql.yml
YAML
·
1
 (1)
    #   - https://gh.io/supported-runners-and-hardware-resources
    #   - https://gh.io/using-larger-runners (GitHub.com only)
    # Consider using larger runners or machines with greater resources for possible analysis time improvements.
    runs-on: ${{ (matrix.language == 'swift' && 'macos-latest') || 'ubuntu-latest' }}
    permissions:
      # required for all workflows
      security-events: write


caixagithub/silce-quarkus-logging · .github/workflows/publish-snapshot.yaml
YAML
·
1
 (1)
jobs:
  publish-snapshot:
    runs-on: ubuntu-latest
    
    steps:
      - name: Checkout code


caixagithub/DevSecOps-Actions-New-Flow-Test · .github/workflows/versioning.yml
YAML
·
1
 (1)
jobs:
  TAG_ON_MERGE:
    if: github.event.pull_request.merged == true
    runs-on: ubuntu-latest
    steps:
      - name: Checkout code


caixagithub/DevSecOps-Develop-Test · .github/workflows/versioning.yml


caixagithub/DevSecOps-Actions · .github/workflows/versioning.yml


caixagithub/sirmc-backend-marcas · .github/workflows/codeql.yml
YAML
·
1
 (1)
    #   - https://gh.io/supported-runners-and-hardware-resources
    #   - https://gh.io/using-larger-runners (GitHub.com only)
    # Consider using larger runners or machines with greater resources for possible analysis time improvements.
    runs-on: ${{ (matrix.language == 'swift' && 'macos-latest') || 'ubuntu-latest' }}
    permissions:
      # required for all workflows
      security-events: write


caixagithub/DevSecOps-Solutions · .github/workflows/akv.yml
YAML
·
1
 (1)
        type: string
jobs:
  retrieve-secrets:
    runs-on: ubuntu-latest
    steps:
      - name: 'Checkout repository'
        uses: actions/checkout@v4


caixagithub/siplx-databases · .github/workflows/build-sqlproj.yml
YAML
·
1
 (1)
jobs:
  build:
    runs-on: ubuntu-latest
    steps:
      - name: Checkout repository
        uses: actions/checkout@v4


caixagithub/Suporte-IaC · .github/workflows/terraform-azure-subscription.yml
YAML
·
2
 (2)
    # Use the latest Ubuntu runner
    runs-on: ubuntu-latest
    
  destroy_cluster:
    runs-on: ubuntu-latest
    


caixagithub/sictm-ios · .github/workflows/ios.yml
YAML
·
1
 (1)
    if: ${{ !cancelled() && needs.SUBIR.result == 'success' }}
    name: 📣 Notificar Teams
    needs: [CI, SUBIR, FARM]
    runs-on: ubuntu-latest
    steps:
      - name: 📣 Notificar Teams (TestFlight OK)
        env:


caixagithub/siiah-api-nest · .github/workflows/pr-template-validation.yml
YAML
·
1
 (1)
jobs:
    validate-pr:
        runs-on: ubuntu-latest
        timeout-minutes: 15
        steps:


caixagithub/coe-java-api · .github/workflows/call-gsc-integration-generic-pipeline.yaml
YAML
·
1
 (1)
  #  uses: caixagithub/DevSecOps-Solutions/.github/workflows/codeql-pipelines.yaml@feat/shift-left-dockerfile
  #  secrets: inherit
    dependabot-validation:
      runs-on: ubuntu-latest
      steps:
        # - name: Create GitHub App token
        #   id: app_token


caixagithub/DevSecOps-SpectralCheck · .github/workflows/linter.yml
YAML
·
1
 (1)
jobs:
  lint:
    name: Lint Codebase
    runs-on: ubuntu-latest
    steps:
      - name: Checkout


caixagithub/sifac-doc · .github/workflows/static.yml
YAML
·
1
 (1)
    environment:
      name: github-pages
      url: ${{ steps.deployment.outputs.page_url }}
    runs-on: ubuntu-latest
    steps:
      - name: Checkout
        uses: actions/checkout@v4


caixagithub/siopi-backend-modulo-engenharia · .github/workflows/pr-title-checker.yml
YAML
·
1
 (1)
jobs:
  check:
    runs-on: ubuntu-latest
    name: 🧪 Check PR title
    steps:
      - name: 📋 Check Pull Request title


caixagithub/demo-jhoy-repositorio-fonte · .github/workflows/workflow.yaml
YAML
·
1
 (1)
  # This workflow contains a single job called "build"
  build:
    # The type of runner that the job will run on
    runs-on: ubuntu-latest
    # Steps represent a sequence of tasks that will be executed as part of the job
    steps:


caixagithub/sipgc-desenvolveai-fabric · .github/workflows/validate-spec-pr.yml
YAML
·
1
 (1)
jobs:
  validate-spec-path:
    runs-on: ubuntu-latest
    env:
      FORCE_JAVASCRIPT_ACTIONS_TO_NODE24: true


caixagithub/DevSecOps-Templates · .github/workflows/zap-generate-full-rules.yaml
OASv3-yaml
·
1
 (1)
jobs:
  generate:
    runs-on: ubuntu-latest
    permissions:
      contents: write


caixagithub/DevSecOps-Templates-New-Flow-Test · .github/workflows/zap-generate-full-rules.yaml


Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
code Search Results · org:caixadepartamental path:.github/workflows ubuntu-latest
Filter by
0 files
 (130 ms)
0 files
in
caixadepartamental(press backspace or delete to remove)
Mona looking through a globe hologram for code
Your search did not match any code
You could try one of the tips below.

Within a repository:
repo:github/linguist
Across several:
repo:github/linguist OR repo:github/fetch
Note that we don't currently support regular expressions in the repo or org qualifiers. For more information on search syntax, see our syntax guide.

