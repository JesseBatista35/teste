# Xcode
# Build, test, and archive an Xcode workspace on macOS.
# Add steps that install certificates, test, sign, and distribute an app, save build artifacts, and more:
# https://docs.microsoft.com/azure/devops/pipelines/languages/xcode

trigger:
- master

stages:
- template: azure-pipelines-stages.yml
  parameters:
    environment: 'DES'
    scheme: 'FGTS-Development'
    envNumber: '1'
    configuration: 'Release-Development'

- template: azure-pipelines-stages.yml
  parameters:
    environment: 'PILOTO'
    scheme: 'FGTS-Staging'
    envNumber: '2'
    configuration: 'Release-Staging'

- template: azure-pipelines-stages.yml
  parameters:
    environment: 'PRD'
    scheme: 'FGTS-Production'
    envNumber: '3'
    configuration: 'Release-Production'



    # File: azure-pipelines-stages.yml

parameters:
  environment: ''
  scheme: ''
  envNumber: ''
  configuration: ''

stages:
- stage: ${{ parameters.environment }}
  displayName: ${{ parameters.environment }}
  jobs:
  - deployment: ${{ parameters.environment }}
    environment: ${{ parameters.environment }}
  - job: ${{ parameters.environment }}_BuildAndDeploy
    timeoutInMinutes: 80
    pool:
      vmImage: 'macOS-15'
    steps:
    - task: InstallAppleCertificate@2
      inputs:
        certSecureFile: 'distribution_cert.p12'
        certPwd: '$(P12password)'
        keychain: 'temp'
    - task: InstallAppleProvisioningProfile@1
      inputs:
        provisioningProfileLocation: 'secureFiles'
        provProfileSecureFile: 'app_prov_profile.mobileprovision'
    - task: Bash@3
      displayName: 'Configure Git Credentials'
      inputs:
        targetType: 'inline'
        script: |
          # Add git credentials
          
          git config --global user.email "azuredevops@azuredevops.azuredevops"
          git config --global user.name "Azure Devops Pipeline"

    - checkout: self
      persistCredentials: true
      clean: true
    
    - task: Bash@3
      displayName: 'Hearbeat pod setup'
      inputs:
        targetType: 'inline'
        script: |
          # Add enviroment variables to 'Heartbeat' pod
          
          export AWS_ACCESS_KEY=$(AWS_ACCESS_KEY)
          export AWS_SECRET_ACCESS_KEY=$(AWS_SECRET_ACCESS_KEY)
          export AWS_REGION=$(AWS_REGION)
          
          export HEARTBEAT_AWS_CODECOMMIT_REPO_URL=$(HEARTBEAT_AWS_CODECOMMIT_REPO_URL)
          export HEARTBEAT_AWS_CODECOMMIT_USERNAME=$(HEARTBEAT_AWS_CODECOMMIT_USERNAME)
          export HEARTBEAT_AWS_CODECOMMIT_URLENCODED_PASSWORD=$(HEARTBEAT_AWS_CODECOMMIT_URLENCODED_PASSWORD)
          
          # Install Cocoapod plugin to download files from AWS S3
          sudo gem install cocoapods-s3-download
    - task: CocoaPods@0
      inputs:
        workingDirectory: $(Build.SourcesDirectory)/FGTS
        forceRepoUpdate: false

    - task: Bash@3
      displayName: 'Generate exportOptions plist'
      inputs:
        targetType: 'inline'
        script: |
          # Add PlistBuddy to PATH
          export PATH="/usr/libexec:$PATH"
          
          # Generate exportOptions plist
          
          PlistBuddy -c "Add :method string app-store" $(Build.SourcesDirectory)/exportOptions.plist
          PlistBuddy -c "Add :teamID string ${APPLE_TEAM_ID_CAIXA}" $(Build.SourcesDirectory)/exportOptions.plist
          PlistBuddy -c "Add :provisioningProfiles:${APP_BUNDLE_IDENTIFIER} string ${APPLE_PROV_PROFILE_UUID}" $(Build.SourcesDirectory)/exportOptions.plist
    - task: Xcode@5
      inputs:
        actions: 'clean archive'
        scheme: ${{ parameters.scheme }}
        sdk: 'iphoneos'
        signingOption: manual
        signingIdentity: $(APPLE_CERTIFICATE_SIGNING_IDENTITY)
        provisioningProfileUuid: $(APPLE_PROV_PROFILE_UUID)
        archivePath: output/$(SDK)/${{ parameters.configuration }}/${{ parameters.scheme }}.xcarchive
        exportPath: output/$(SDK)/${{ parameters.configuration }}
        exportOptions: plist
        exportOptionsPlist: $(Build.SourcesDirectory)/exportOptions.plist
        packageApp: true
        args: MARKETING_VERSION=$(VERSAO_APP) CURRENT_PROJECT_VERSION=$(BUILD_APP).${{ parameters.envNumber }}
        configuration: ${{ parameters.configuration }}
        xcWorkspacePath: '$(Build.SourcesDirectory)/*/*.xcworkspace'
        xcodeVersion: 'specifyPath'
        xcodeDeveloperDir: '/Applications/Xcode_26.2.app/Contents/Developer'
        #xcodeVersion: '$(XCODE_VERSION)' # Options: 8, 9, 10, 11, 12, default, specifyPath
        #xcodeDeveloperDir: '$(XCODE_DEVELOPER_DIR)'
    - task: Bash@3
      displayName: 'Upload to App Store / TestFlight'
      inputs:
        targetType: 'inline'
        script: |
          # Upload IPA file to App Store Connect
          
          xcrun altool --upload-app -f output/$(SDK)/${{ parameters.configuration }}/*.ipa --type ios -u $(APPLE_USERNAME) -p $(APPLE_APP_PASS)
    - task: Bash@3
      displayName: 'Git Tag Repository'
      inputs:
        targetType: 'inline'
        script: |
          # Add new tag to git repository
          
          git tag -a v$(VERSAO_APP)-$(BUILD_APP).${{ parameters.envNumber }}-${{ parameters.environment }} -m 'Versão v$(VERSAO_APP) ($(BUILD_APP).${{ parameters.envNumber }}) gerada para ambiente ${{ parameters.environment }} e disponível no TestFlight.'
          git push --tags
        workingDirectory: $(Build.SourcesDirectory)



        # =============================================================================
# Pipeline de Release (FGTS)
# =============================================================================
# Caller ÚNICO da jornada de release. Cada evento roteia uma etapa:
#
#   workflow_dispatch          -> prepara release/X.Y.Z-build-N e abre o PR
#   pull_request (opened/sync) -> promove para PLT no SHA atual do PR
#   pull_request (closed)      -> promove para PRD sobre o merge commit
#
# Não há lógica inline: versão e build base vêm do manifesto
# .github/release/ios-release.yml gravado na preparação, e os approvals de PLT
# e PRD vivem nos GitHub Environments correspondentes.
#
# Configure o check estável de PLT como required status check em main:
#   Settings > Rules > Rulesets > main > "Require status checks to pass"
#
# Docs: GUIA-DEV.md → "Publicar (merge em main)"
# =============================================================================
name: "Release Pipeline"
run-name: "Release — ${{ github.event_name == 'workflow_dispatch' && format('preparar {0} build {1}', inputs.marketingVersion, inputs.buildBase) || github.event.pull_request.head.ref }}"

on:
  workflow_dispatch:
    inputs:
      sourceRef:
        description: "Origem do release"
        required: true
        type: string
        default: develop
      marketingVersion:
        description: "Nova versão DESEJADA (X.Y.Z). Não é a versão já publicada."
        required: true
        type: string
      buildBase:
        description: "Novo sequencial DESEJADO (inteiro positivo, ex: 453)"
        required: true
        type: string
  pull_request:
    branches: [main]
    types: [opened, synchronize, reopened, closed]

permissions:
  contents: read

jobs:
  prepare:
    name: "Preparar Release"
    if: github.event_name == 'workflow_dispatch'
    # A validação de permissões é estática: todo job que invoca a solution
    # precisa conceder o bloco `permissions` declarado nela, mesmo os escopos
    # que só a etapa de promoção consome. Cada job nested reduz de volta ao
    # mínimo que precisa.
    permissions:
      contents: write
      pull-requests: write
      id-token: write
      attestations: write
      actions: read
      security-events: write
      statuses: write
    uses: CAIXAPLATFORM/github-solutions/.github/workflows/ios--release-promotion.yaml@main
    with:
      stage: prepare
      source-ref: ${{ inputs.sourceRef }}
      marketing-version: ${{ inputs.marketingVersion }}
      build-base: ${{ inputs.buildBase }}
      testflight-description: ''
      bundle-identifier: ${{ vars.BUNDLE_IDENTIFIER }}
    secrets: inherit

  # Sem filtro por origem: a solution REPROVA origens fora de
  # release/X.Y.Z-build-N, para que este check não libere outro tipo de PR.
  plt:
    name: "Promover para PLT"
    if: github.event_name == 'pull_request' && github.event.action != 'closed'
    permissions:
      contents: write
      pull-requests: write
      id-token: write
      attestations: write
      actions: read
      security-events: write
      statuses: write
    uses: CAIXAPLATFORM/github-solutions/.github/workflows/ios--release-promotion.yaml@main
    with:
      stage: plt
      head-ref: ${{ github.event.pull_request.head.ref }}
      head-sha: ${{ github.event.pull_request.head.sha }}
      pr-number: ${{ github.event.pull_request.number }}
      xcode-scheme: ${{ vars.IOS_BUILD_SCHEME_PLT }}
      project-root: ${{ vars.IOS_PROJECT_ROOT }}
      xcode-workspace: ${{ vars.IOS_XCODE_WORKSPACE }}
      test-scheme: ${{ vars.IOS_TEST_SCHEME }}
      xcode-version: ${{ vars.IOS_XCODE_VERSION }}
      bundle-identifier: ${{ vars.BUNDLE_IDENTIFIER }}
      build-number-format: ${{ vars.IOS_BUILD_NUMBER_FORMAT }}
      resign-mode: manual
      # Perfil por UUID, como no ios.yaml legado
      # (PROVISIONING_PROFILE=<uuid> PROVISIONING_PROFILE_SPECIFIER=) e no
      # deploy-testflight. vars.SIGNING_PROFILE_APP é um rótulo interno, não o
      # campo Name do perfil, e o Xcode não o encontra.
      signing-profile-app-uuid: ${{ vars.UUID_MOBILE_PROVISION }}
      # O iOS Verify aprovado é o pré-requisito de testes.
      skip-tests: true
      use-legacy-signing-secrets: true
      upload-method: altool
      pre-build-script: .github/scripts/pre-build.sh
      private-pods: true
    secrets: inherit

  prd:
    name: "Promover para PRD"
    if: >-
      github.event_name == 'pull_request' &&
      github.event.action == 'closed' &&
      github.event.pull_request.merged == true &&
      startsWith(github.event.pull_request.head.ref, 'release/')
    permissions:
      contents: write
      pull-requests: write
      id-token: write
      attestations: write
      actions: read
      security-events: write
      statuses: write
    uses: CAIXAPLATFORM/github-solutions/.github/workflows/ios--release-promotion.yaml@main
    with:
      stage: prd
      head-ref: ${{ github.event.pull_request.head.ref }}
      head-sha: ${{ github.event.pull_request.head.sha }}
      merge-sha: ${{ github.event.pull_request.merge_commit_sha }}
      pr-number: ${{ github.event.pull_request.number }}
      xcode-scheme: ${{ vars.IOS_BUILD_SCHEME_PRD }}
      project-root: ${{ vars.IOS_PROJECT_ROOT }}
      xcode-workspace: ${{ vars.IOS_XCODE_WORKSPACE }}
      test-scheme: ${{ vars.IOS_TEST_SCHEME }}
      xcode-version: ${{ vars.IOS_XCODE_VERSION }}
      bundle-identifier: ${{ vars.BUNDLE_IDENTIFIER }}
      build-number-format: ${{ vars.IOS_BUILD_NUMBER_FORMAT }}
      resign-mode: manual
      signing-profile-app-uuid: ${{ vars.UUID_MOBILE_PROVISION }}
      skip-tests: true
      use-legacy-signing-secrets: true
      upload-method: altool
      pre-build-script: .github/scripts/pre-build.sh
      private-pods: true
    secrets: inherit




    ub Enterprise
Users managed by Caixa Economica Federal
caixagithub
sifgm-ios
Repository navigation
Code
Issues
1
 (1)
Pull requests
2
 (2)
Actions
Projects
Wiki
Security and quality
20
 (20)
Insights
Settings
Files
Go to file
t
T
workflows content loaded
.github
release
scripts
workflows
assinatura.sh
deploy-testflight.yaml
farm-keego.yaml
ios-gitflow.yaml
ios-verify.yaml
ios.yaml
preflight-check.yaml
release-pipeline.yaml
PIPELINE.md
pull_request_template.md
.vs
FGTS
readme_source
.DS_Store
.gitattributes
.gitignore
.gitlab-ci.yml
README.md
azure-pipelines-stages.yml
azure-pipelines.yml
sifgm-ios/.github/workflows
/release-pipeline.yaml
