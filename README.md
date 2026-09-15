name: 'Android Apps Default Build'
inputs:
  VERSION_CODE_VARIABLE_NAME:
    required: false
    type: string
  GRADLE_VERSION_NAME:
    required: false
    type: string
  GRADLE_VERSION_CODE:
    required: false
    type: string
  VERSION_CODE:
    required: false
    type: string
  VERSION_NAME:
    required: false
    type: string
  ENVIRONMENT:
    required: true
    type: string
  TOKEN_GITHUB:
    required: true
    type: string
  SD_KEY_BIOMETRIA:
    required: true
    type: string

outputs:
  APK_NAME_WITH_EXTENSION:
    value: ${{ steps.setting-vars.outputs.APK_NAME_WITH_EXTENSION }}
  APK_NAME:
    value: ${{ steps.setting-vars.outputs.APK_NAME }}
  UNSIGNED_APK_NAME_WITH_EXTENSION:
    value: ${{ steps.setting-vars.outputs.UNSIGNED_APK_NAME_WITH_EXTENSION }}
  SECURED_APK_NAME_WITH_EXTENSION:
    value: ${{ steps.setting-vars.outputs.SECURED_APK_NAME_WITH_EXTENSION }}
  ALIGNED_APK_NAME_WITH_EXTENSION:
    value: ${{ steps.setting-vars.outputs.ALIGNED_APK_NAME_WITH_EXTENSION }}
  SIGNED_APK_NAME_WITH_EXTENSION:
    value: ${{ steps.setting-vars.outputs.SIGNED_APK_NAME_WITH_EXTENSION }}
  APK_PATH:
    value: ${{ steps.setting-vars.outputs.APK_PATH }}
  ANDROID_API_LEVEL:
    value: ${{ steps.build-tools-setup.outputs.ANDROID_API_LEVEL }}
  BUILD_TOOLS_VERSION:
    value: ${{ steps.build-tools-setup.outputs.BUILD_TOOLS_VERSION }}

runs:
  using: "composite"
  steps:
  - uses: actions/checkout@v4.1.0
    with:
      token: ${{ inputs.TOKEN_GITHUB }}

  - name: Local infrastructure repository checkout
    uses: actions/checkout@v4.1.0
    with:
      repository: caixagithub/${{ github.event.repository.name }}-infranprd
      path: ${{ github.event.repository.name }}-infranprd
      token: ${{ inputs.TOKEN_GITHUB }}

  - name: Checkout Actions repository
    uses: actions/checkout@v4.1.0
    with:
      repository: caixagithub/DevSecOps-Actions
      ref: main
      path: devsecops-actions
      token: ${{ inputs.TOKEN_GITHUB }}

  - name: Python setup
    uses: actions/setup-python@v4
    with:
      python-version: '3.11'

  - name: Setting build environment vars from configmap
    uses: caixagithub/DevSecOps-Actions/.github/util/parse_config_map_to_vars@main
    with:
      infra_local_path: ${{ github.event.repository.name }}-infranprd
      environment: ${{ inputs.ENVIRONMENT }}

  - name: Setting des vars from configmap
    uses: caixagithub/DevSecOps-Actions/.github/util/parse_config_map_to_vars@main
    with:
      infra_local_path: ${{ github.event.repository.name }}-infranprd
      environment: des

  - name: JAVA JDK ${{ env.JAVA_VERSION || '17' }} setup
    uses: actions/setup-java@v4
    with:
      java-version: ${{ env.JAVA_VERSION || '17' }}
      distribution: ${{ env.JAVA_DISTRIBUTION || 'temurin' }}
      cache: gradle

  - name: JAVA_HOME check
    run: echo $JAVA_HOME
    shell: bash

  - name: Given permission to gradle
    run: chmod +x gradlew
    shell: bash

  - name: Android SDK setup
    uses: android-actions/setup-android@v3
    with:
      accept-android-sdk-licenses: true

  - name: Build tools packages setup
    run: |
      sdkmanager --install "platform-tools" "platforms;android-${{ env.ANDROID_API_LEVEL }}" "build-tools;${{ env.BUILD_TOOLS_VERSION }}"
    shell: bash

  - name: Adding build-tools to PATH
    run: |
      BUILD_TOOLS_VERSION=$(ls $ANDROID_HOME/build-tools | sort -V | tail -n 1)
      echo "$ANDROID_HOME/build-tools/${{ env.BUILD_TOOLS_VERSION }}" >> $GITHUB_PATH
    shell: bash

  - name: Check build-tools version
    run: ls $ANDROID_HOME/build-tools
    shell: bash

  - name: Setting vars
    id: setting-vars
    run: |
      python devsecops-actions/src/apps/setting-app-vars.py
    shell: bash
    env:
      BUILD_WITH_FLAVOR: ${{ env.BUILD_WITH_FLAVOR }}
      BUILD_TYPE: ${{ env.BUILD_TYPE }}
      PRODUCT_FLAVOR: ${{ env.PRODUCT_FLAVOR }}
      GITHUB_WORKSPACE: ${{ github.workspace }}
      ENVIRONMENT: ${{ inputs.ENVIRONMENT }}
      APP_NAME: ${{ env.APP_NAME }}
      VERSION_NAME: ${{ inputs.GRADLE_VERSION_NAME || inputs.VERSION_NAME }}

  - name: Increment Version Code
    if: ${{ inputs.ENVIRONMENT == 'plt_build' || inputs.ENVIRONMENT == 'prd_build' }}
    id: setting-version-code
    run: |
      VERSION_CODE=${{ inputs.VERSION_CODE }}

      VERSION_CODE=${VERSION_CODE:-1}

      if [ "${{ inputs.ENVIRONMENT }}" == "plt_build" ]; then
        echo "VERSION_CODE=$((VERSION_CODE + 1))" >> $GITHUB_OUTPUT
      elif [ "${{ inputs.ENVIRONMENT }}" == "prd_build" ]; then
        echo "VERSION_CODE=$((VERSION_CODE + 2))" >> $GITHUB_OUTPUT
      fi
    shell: bash

  - name: Gradle Build with lint
    if: ${{ inputs.ENVIRONMENT == 'des_build' }}
    env:
      SD_KEY_BIOMETRIA: ${{ inputs.SD_KEY_BIOMETRIA }}
    run: |
      ./gradlew --version

      ./gradlew clean assemble${{ steps.setting-vars.outputs.BUILD_COMMAND }} \
        lint${{ steps.setting-vars.outputs.BUILD_COMMAND }} \
        -PappVersionName=${{ inputs.VERSION_NAME || env.VERSION_NAME || '0.0.1' }} \
        -PappVersionCode=${{ inputs.VERSION_CODE || 1 }} \
        -Pproduction=${{ env.PRODUCTION }} \
        --stacktrace
    shell: bash

  - name: Gradle Build without lint
    if: ${{ inputs.ENVIRONMENT != 'des_build' }}
    env:
        SD_KEY_BIOMETRIA: ${{ inputs.SD_KEY_BIOMETRIA }}
    run: |
      ./gradlew --version

      ./gradlew clean assemble${{ steps.setting-vars.outputs.BUILD_COMMAND }} \
        -PappVersionName=${{ inputs.VERSION_NAME || env.VERSION_NAME || '0.0.1' }} \
        -PappVersionCode=${{ steps.setting-version-code.outputs.VERSION_CODE || inputs.VERSION_CODE || 1 }} \
        -Pproduction=${{ env.PRODUCTION }} \
        --stacktrace
    shell: bash

  - name: Set SIGNED_APK_NAME_WITH_EXTENSION in env context
    run: |
      echo "SIGNED_APK_NAME_WITH_EXTENSION=$SIGNED_APK_NAME_WITH_EXTENSION" >> "$GITHUB_ENV"
      echo "MAPPING_FILE_NAME=$MAPPING_FILE_NAME" >> "$GITHUB_ENV"
      echo "NEXUS_VERSION_NAME=$NEXUS_VERSION_NAME" >> "$GITHUB_ENV"
    shell: bash
    env:
      SIGNED_APK_NAME_WITH_EXTENSION: ${{ steps.setting-vars.outputs.SIGNED_APK_NAME_WITH_EXTENSION }}
      MAPPING_FILE_NAME: ${{ inputs.ENVIRONMENT }}-mapping.txt
      NEXUS_VERSION_NAME: ${{ inputs.GRADLE_VERSION_NAME || inputs.VERSION_NAME }}-${{ env.BUILD_TYPE }}.${{ inputs.GRADLE_VERSION_CODE || steps.setting-version-code.outputs.VERSION_CODE || inputs.VERSION_CODE }}

  - name: Export app version vars by environment
    run: |
      ENV_RAW="${{ inputs.ENVIRONMENT }}"
      ENV=$(echo "${ENV_RAW%_build}" | tr '[:lower:]' '[:upper:]')

      if [ -n "${{ inputs.GRADLE_VERSION_NAME }}" ]; then
        echo "${ENV}_VERSION_NAME=${{ inputs.GRADLE_VERSION_NAME }}" >> "$GITHUB_ENV"
      fi

      if [ -n "${{ inputs.GRADLE_VERSION_CODE }}" ]; then
        echo "${ENV}_VERSION_CODE=${{ inputs.GRADLE_VERSION_CODE }}" >> "$GITHUB_ENV"
      fi
    shell: bash

  - name: Dump envs into sh file
    run: |
      printenv | sort | grep -Ev '^(GITHUB|RUNNER|ACTIONS|KUBERNETES|TRACKS|ENVIRONMENTS)' > "${{ steps.setting-vars.outputs.APK_PATH }}/${{ inputs.ENVIRONMENT }}-vars.sh"
    shell: bash

  - name: Upload envs artifact
    uses: actions/upload-artifact@v4
    with:
      name: ${{ inputs.ENVIRONMENT }}-vars.sh
      path: ${{ steps.setting-vars.outputs.APK_PATH }}/${{ inputs.ENVIRONMENT }}-vars.sh
      if-no-files-found: 'error'

  - name: List generated apk
    run: ls -lhat ${{ steps.setting-vars.outputs.APK_PATH }}
    shell: bash

  - name: Renaming APK
    run: |
      ORIGINAL_APK=$(find "$APK_PATH" -name "*.apk")

      GRADLE_BUILD_NAME=$(basename "$ORIGINAL_APK")

      mv $APK_PATH/$GRADLE_BUILD_NAME $APK_PATH/"${{ steps.setting-vars.outputs.UNSIGNED_APK_NAME_WITH_EXTENSION }}"
    shell: bash
    env:
      APK_PATH: ${{ steps.setting-vars.outputs.APK_PATH }}

  - name: List renamed apk
    run: ls -lhat ${{ steps.setting-vars.outputs.APK_PATH }}
    shell: bash
