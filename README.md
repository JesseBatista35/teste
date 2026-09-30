name: Qualidade - Analise estática de código

run-name: ${{ github.repository }}_${{ github.ref_name }}_${{ github.run_id }}.${{ github.run_number }}
on:
  pull_request:
    types: [opened, synchronize, reopened]
  workflow_call:
     inputs:
        SONAR_HOST_URL:
          type: string
          required: false
          default: ${{ vars.SONAR_HOST_URL_ORG }}
        PROJECTKEY:
          description: 'Nome do repositorio'
          required: false
          default: '${{ github.event.repository.name }}'
          type: string
        PROJECTNAME:
          description: 'Nome do repositorio'
          required: false
          default: '${{ github.event.repository.name }}'
          type: string
        DOTNET_BUILD_ARGUMENTS:
          description: 'Informe os argumentos que serão usados na build'
          required: false
          type: string
          default: ${{ vars.DOTNET_BUILD_ARGUMENTS }}
        DOTNET_TEST_ARGUMENTS:
          description: 'Informe os argumentos que serão usados na fase de teste da aplicação'
          required: false
          type: string
          default: ${{ vars.DOTNET_TEST_ARGUMENTS }}
        DOTNET_VERSION:
          description: 'Informe a versão do SDK do .Net usado no projeto, por exemplo 6.0.x'
          required: false
          type: string
          default: ${{ vars.DOTNET_VERSION }}
        PYTHON_VERSION:
          description: 'Informe a versão do Python usado no projeto, por exemplo 3.10'
          required: false
          type: string
          default: ${{ vars.PYTHON_VERSION }}
        NODE_VERSION:
          required: false
          default: ${{ vars.NODE_VERSION }}
          type: string
        NG_GOAL:
          description: 'Goal de Compilação Angular'
          required: false
          default:  ${{ vars.NG_GOAL}}
          type: string
        NG_TEST:
          description: 'Goal de teste Angular'
          required: false
          default: ${{ vars.NG_TEST }}
          type: string
        KOTLIN_TESTPARAMETER:
          description: 'Goal de teste Kotlin (Android)'
          required: false
          default: ${{ vars.KOTLIN_TESTPARAMETER }}
          type: string
        JAVA_VERSION:
          description: 'Versao do Java usado pelo projeto'
          type: string
          required: false
          default:  ${{ vars.JAVA_VERSION }}
        JAVA_DISTRIBUTION:
          description: 'Distribuição Java usado pelo projeto'
          type: string
          required: false
          default:  ${{ vars.JAVA_DISTRIBUTION }}
jobs:
  QA:
    name: Quality Assurance
    runs-on: ${{ github.event.repository.name == 'sictm-android' && 'arc-runner-set-default-az-corp-nprod' || 'arc-runner-set-default-nprod' }}
    env:
      LANGUAGE: ${{ vars.LANGUAGE }}
      TOKEN_GITHUB_ORG: ${{ secrets.TOKEN_GITHUB_ORG }}

    steps:
    - name: Checkout code
      uses: actions/checkout@v4

    - name: Load variables from configmap
      uses: caixagithub/DevSecOps-Actions/.github/util/load_variables_from_configmap@main
      with:
        environment: des
        github_token: ${{ secrets.TOKEN_GITHUB_ORG }}

    - name: Set up jq
      run: sudo apt-get install -y jq

    - name: Get Repository Language
      if: env.LANGUAGE == '' || env.LANGUAGE == null
      env:
        GITHUB_TOKEN: ${{ secrets.GITHUB_TOKEN }}
        REPO_NAME: ${{ github.repository }}
      run: |
        #!/bin/bash

        # Função para obter a linguagem de programação principal de um repositório do GitHub
        get_repo_language() {
            local owner=$1
            local repo=$2
            local token=$GITHUB_TOKEN
            if [ -z "$token" ]; then
                echo "GITHUB_TOKEN não encontrado. Certifique-se de que está configurado como uma variável de ambiente."
                exit 1
            fi

            local url="https://api.github.com/repos/$owner/$repo"
            local response=$(curl -s -H "Authorization: token $token" $url)

            if [ $(echo "$response" | jq -r '.message') == "Not Found" ]; then
                echo "Repositório não encontrado."
                exit 1
            fi

            local language=$(echo "$response" | jq -r '.language' | tr 'A-Z' 'a-z')
            echo "LANGUAGE=$language" >> $GITHUB_ENV
            echo "A linguagem de programação principal para o repositório '$repo' é: $language "
        }

        # Extrai o nome do proprietário e do repositório do contexto do GitHub
        owner=$(echo $REPO_NAME | cut -d'/' -f1)
        repo=$(echo $REPO_NAME | cut -d'/' -f2)

        get_repo_language $owner $repo
      shell: bash

    - name: Determinar nome da branch relevante
      id: branch-name
      run: |
        if [ "${{ github.event_name }}" = "pull_request" ]; then
          echo "Branch de destino detectada: ${{ github.event.pull_request.base.ref }}"
          echo "branch_name=${{ github.event.pull_request.base.ref }}" >> $GITHUB_ENV
        else
          echo "Branch atual detectada: ${{ github.ref_name }}"
          echo "branch_name=${{ github.ref_name }}" >> $GITHUB_ENV
        fi

    - name: Exibir nome da branch
      run: |
          echo "Branch relevante: ${{ env.branch_name }}"

    #JAVA
    - name: Build Application Java/Quarkus
      if: ${{ env.LANGUAGE == 'java' }}
      uses: caixagithub/DevSecOps-Qualidade/.github/sonar_unico/java@main
      with:
          SONAR_HOST_URL: ${{ inputs.SONAR_HOST_URL }}
          SONAR_TOKEN: ${{ secrets.SONAR_TOKEN_ORG }}
          JAVA_VERSION: ${{ env.JAVA_VERSION || inputs.JAVA_VERSION || '21' }}
          JAVA_DISTRIBUTION: ${{ env.JAVA_DISTRIBUTION || inputs.JAVA_DISTRIBUTION || 'temurin' }}
          REPOSITORY_ARTIFACTS_APP: ${{ env.REPOSITORY_ARTIFACTS_APP }}
          TOKEN_GITHUB_ORG: ${{ secrets.TOKEN_GITHUB_ORG }}

    #DOTNET
    - name: Build Application Dotnet
      if: ${{ env.LANGUAGE == 'c#' }}
      uses: caixagithub/DevSecOps-Qualidade/.github/sonar_unico/dotnet@main
      with:
          SONAR_HOST_URL: ${{ inputs.SONAR_HOST_URL }}
          SONAR_TOKEN: ${{ secrets.SONAR_TOKEN_ORG }}
          DOTNET_BUILD_ARGUMENTS: ${{ env.DOTNET_BUILD_ARGUMENTS || inputs.DOTNET_BUILD_ARGUMENTS || '' }}
          DOTNET_TEST_ARGUMENTS: ${{ env.DOTNET_TEST_ARGUMENTS || inputs.DOTNET_TEST_ARGUMENTS || '--no-build /p:CollectCoverage=true /p:CoverletOutputFormat=opencover --logger "trx"' }}
          DOTNET_VERSION: ${{ env.DOTNET_VERSION || inputs.DOTNET_VERSION || '8.0.x' }}
          TOKEN_GITHUB_ORG: ${{ secrets.TOKEN_GITHUB_ORG }}

    #TYPESCRIPT
    - name: Build Application Typescript
      if: ${{ env.LANGUAGE == 'typescript' || env.LANGUAGE == 'javascript' }}
      uses: caixagithub/DevSecOps-Qualidade/.github/sonar_unico/angular@main
      with:
          SONAR_HOST_URL: ${{ inputs.SONAR_HOST_URL }}
          SONAR_TOKEN: ${{ secrets.SONAR_TOKEN_ORG }}
          NODE_VERSION: ${{ env.NODE_VERSION || inputs.NODE_VERSION || '22.x' }}
          NG_GOAL: ${{ env.NG_GOAL || inputs.NG_GOAL || 'ng build' }}
          NG_TEST: ${{ env.NG_TEST || inputs.NG_TEST || 'npm test' }}
          REPOSITORY_ARTIFACTS_APP: ${{ env.REPOSITORY_ARTIFACTS_APP }}

    # PYTHON
    - name: Build Application Python
      if: ${{ env.LANGUAGE == 'python' || env.LANGUAGE == 'jupyter notebook' }}
      uses: caixagithub/DevSecOps-Qualidade/.github/sonar_unico/python@main
      with:
        SONAR_HOST_URL: ${{ inputs.SONAR_HOST_URL }}
        SONAR_TOKEN: ${{ secrets.SONAR_TOKEN_ORG }}
        PYTHON_VERSION: ${{ env.PYTHON_VERSION || inputs.PYTHON_VERSION || '3.10' }}
        REPOSITORY_ARTIFACTS_APP: ${{ env.REPOSITORY_ARTIFACTS_APP || 'NEXUS' }}

    #KOTLIN
    - name: Build Application Kotlin
      if: ${{ contains(env.LANGUAGE, 'kotlin') }}
      uses: caixagithub/DevSecOps-Qualidade/.github/sonar_unico/kotlin@main
      with:
          SONAR_HOST_URL: ${{ inputs.SONAR_HOST_URL }}
          SONAR_TOKEN: ${{ secrets.SONAR_TOKEN_ORG }}
          TEST_PARAMETER: ${{ env.KOTLIN_TESTPARAMETER || inputs.KOTLIN_TESTPARAMETER }}
          TOKEN_GITHUB: ${{ secrets.TOKEN_GITHUB_ORG }}
