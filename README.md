Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
siarx-backend-autoridade-registro
Repository navigation
Code
Issues
Pull requests
Actions
Projects
Wiki
Security and quality
2
 (2)
Insights
Settings
CI/CD Workflow Generic
caixagithub/siarx-backend-autoridade-registro_main_34386495130.1 #1
All jobs
Run details
Annotations
1 error and 1 warning
CI_DES / BUILD / BUILD
failed on Sep 9 in 1m 1s
Search logs
9s
0s
1s
1s
23s
0s
0s
0s
0s
14s
Connecting on Registry
0s
Run set -euo pipefail
    set -euo pipefail
    
    # Normalize image path (lowercase)
    REPO_PATH="$(echo "siarx/backend-autoridade-registro/siarx-backend-autoridade-registro" | tr '[:upper:]' '[:lower:]')"
    echo "image_dir=$REPO_PATH" >> "$GITHUB_OUTPUT"
    if [[ "" == "azure" ]]; then
      echo "Connecting to Azure Container Registry..."
      USERNAME="00000000-0000-0000-0000-000000000000"
    
      az login --identity --client-id "***" --output none
    
      TOKEN="$(az acr login \
        --name "acrcentralcaixanprd" \
        --expose-token \
        --output tsv \
        --query accessToken)"
    
      REGISTRY="acrcentralcaixanprd.azurecr.io"
      REGISTR_PRD="acrcentralcaixaprd.azurecr.io"
      IMAGE_NAME="${REGISTRY}/${REPO_PATH}"
    
      # Outputs for Azure
      echo "username=$USERNAME" >> "$GITHUB_OUTPUT"
      echo "token=$TOKEN" >> "$GITHUB_OUTPUT"
      echo "image=$IMAGE_NAME" >> "$GITHUB_OUTPUT"
      echo "registry_url=$REGISTRY" >> "$GITHUB_OUTPUT"
      echo "registry_url_prd=$REGISTR_PRD" >> "$GITHUB_OUTPUT"
    elif [[ "" == "aws" ]]; then
      echo "Connecting to AWS ECR..."
      REGISTRY=""
      echo "registry_url=$REGISTRY"
      echo "registry_url=" >> "$GITHUB_OUTPUT"
      IMAGE_NAME="${REGISTRY}/${REPO_PATH}"
    
      # Outputs for AWS (no username/token needed)
      echo "image=$IMAGE_NAME" >> "$GITHUB_OUTPUT"
    else
      echo "Unsupported cloud_provider: " >&2
      exit 1
    fi
    
    echo "IMAGE=$IMAGE_NAME"
    shell: /usr/bin/bash --noprofile --norc -e -o pipefail {0}
    env:
      pythonLocation: /home/runner/_work/_tool/Python/3.11.16/x64
      PKG_CONFIG_PATH: /home/runner/_work/_tool/Python/3.11.16/x64/lib/pkgconfig
      Python_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.16/x64
      Python2_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.16/x64
      Python3_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.16/x64
      LD_LIBRARY_PATH: /home/runner/_work/_tool/Python/3.11.16/x64/lib
      REPOSITORY_ARTIFACTS_APP: NEXUS
      LANGUAGES: ["java"]
      Informe o nome da variavel usada no projeto: Informe o valor referente a esta variavel
  Unsupported cloud_provider: 
  Error: Process completed with exit code 1.
0s
6s
0s
0s
1s
0s
0s
