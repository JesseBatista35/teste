name: Solution

on:
  workflow_call:


jobs:

  Build:
    name: DES Build
    runs-on: self-hosted
    needs: Checkout-Repositories
    environment: DES
    permissions:
      contents: read
      security-events: write
      packages: read
      actions: read
    strategy:
      fail-fast: false
      matrix:
        include:
        - language: java-kotlin
          build-mode: manual

    steps:
    - uses: actions/checkout@v4
    - uses: caixagithub/coe-nuvem-devsecops-solutions/.github/workflows/pipelines-extends/checkout-repositories.yml
    #

    # - name: Instalar jq
    #   run: sudo apt-get update && sudo apt-get install -y jq

    # - name: Verificar última versão no Nexus
    #   env:
    #     NEXUS_URL: ${{ vars.NEXUS_URL }}
    #     NAME_APP_NEXUS: ${{ vars.NAME_APP_NEXUS }}
    #   run: |
    #     export latest_version=$(curl -s "${NEXUS_URL}service/rest/v1/search?repository=${NAME_APP_NEXUS}&group=br.gov.caixa&name=${{ vars.NAMEAPP }}" | jq -r '.items | sort_by(.version) | last(.version)')
    #     echo "Última versão no Nexus: $latest_version"

    # - name: Quebrar versão em version_app e version_code
    #   id: break-version
    #   run: |
    #     version_app=$(echo $latest_version | grep -oP '^\d+\.\d+\.\d+' | awk '{print $0 + 1}')
    #     version_code=$(echo $latest_version | grep -oP '\d+$' | awk '{print $0 + 1}')
    #     echo "::set-output name=version_app::$version_app"
    #     echo "::set-output name=version_code::$version_code"
    #     echo "Versão do App: $version_app"
    #     echo "Código da Versão: $version_code"

    # - name: Instalando JAVA JDK 17
    #   uses: actions/setup-java@v4
    #   with:
    #     java-version: '17'
    #     distribution: 'temurin'
    #     cache: gradle


    # - name: Instalando Android SDK
    #   uses: android-actions/setup-android@v3

    # - name: Dando Permissão de execução para o gradlew
    #   run: chmod +x gradlew

    # - name: Initialize CodeQL
    #   uses: coe-nuvem-devsecops-seguranca/.github/workflows/codeql-init.yml@main
    #   with:
    #     language: 'java-kotlin'

    # - name: Validacao de Integridade
    #   uses: coe-nuvem-devsecops-actions/framework/android/validacao-integridade.yml@main
    #   with:
    #     git_token: ${{ secrets.GIT_TOKEN }}

    # - name: Log - Branch expirada
    #   uses: coe-nuvem-devsecops-actions/framework/android/log-branch-expirada.yml
    #   with:
    #     condition: ${{ failure() }}

    # - name: Verifica Versão do Pacote no Binario
    #   uses: coe-nuvem-devsecops-actions/framework/android/verifica-versao-pacote.yml
    #   with:
    #     versionApp: ${{ needs.Build.outputs.version_app }}
    #     versionCode: ${{ needs.Build.outputs.version_code }}

    # - name: Build Gradle via BASH
    #   uses: coe-nuvem-devsecops-actions/framework/android/build-gradle.yml
    #   with:
    #     versionApp: ${{ needs.Build.outputs.version_app }}
    #     versionCode: ${{ needs.Build.outputs.version_code }}

    # - name: Perform CodeQL Analysis
    #   uses: coe-nuvem-devsecops-seguranca/.github/workflows/codeql-analysis.yml
    #   with:
    #     language: 'java-kotlin'

    GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
DevSecOps-Solutions
Repository navigation
Code
Issues
Pull requests
11
 (11)
Actions
Projects
Wiki
Security and quality
3
 (3)
Insights
Settings
Files
Go to file
t
T
pipelines-extends content loaded
.github/workflows
pipelines-extends
android-pipelines.yaml
CODEOWNERS
adapter-pipelines.yaml
akv.yml
android-libs-pipelines.yaml
arc-runner-aws-test-run.yaml
codeql-pipelines.yaml
dockerfile-validation-pipelines.yaml
dotnet-azureapps-pipelines.yaml
dotnet-build-pipelines-onpremise.yaml
dotnet-build-win-pipelines.yaml
dotnet-libs-pipelines.yml
generic-android-apk-pipelines.yaml
generic-apigtw.yaml
generic-apim.yaml
generic-blob-pipelines.yaml
generic-pipelines-app-android.yaml
generic-pipelines-departamental.yaml
generic-pipelines.yaml
generic-s3-pipelines.yaml
generic-sdk-ios.yaml
gsc-integration-generic-pipeline.yaml
gsc-integration-generic-sdk-ios.yaml
ios-pipelines.yaml
java-libs-pipelines-multimodules.yaml
java-libs-pipelines.yaml
java-maven-build-pipelines-onpremise.yaml
java-maven-build-pipelines.yaml
mkdocs-pipelines.yaml
node-lib-pipelines.yaml
python-lib-pipelines.yaml
quality-assurance.yml
techdocs-pipelines.yaml
typescript-build-pipelines-onpremise.yaml
.gitignore
README.md
debug.log
DevSecOps-Solutions/.github/workflows/pipelines-extends
/android-pipelines.yaml
c159719_caixa
c159719_caixa
android-pipelines (unused)
