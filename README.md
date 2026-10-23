Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
siplx-plataforma-geracao-relatorios
Repository navigation
Code
Issues
Pull requests
Actions
Projects
Wiki
Security and quality
Insights
Settings
CI/CD Workflow Generic
caixagithub/siplx-plataforma-geracao-relatorios_develop_39967565844.11 #11
All jobs
Run details
Annotations
1 error and 1 warning
CI_DES / ArgoCD_Deploy / ArgoCD_Deploy (DES)
failed 32 minutes ago in 5m 43s
Search logs
10s
Current runner version: '2.336.0'
Runner name: 'arc-runner-set-default-nprod-tkwkw-runner-txx6d'
Runner group name: 'default'
Machine name: 'arc-runner-set-default-nprod-tkwkw-runner-txx6d'
GITHUB_TOKEN Permissions
Secret source: Actions
Cache mode: write
Prepare workflow directory
Prepare all required actions
Getting action download info
Download action repository 'actions/create-github-app-token@v2' (SHA:fee1f7d63c2ff003460e3d139729b119787bc349)
Download action repository 'caixagithub/DevSecOps-Actions@main' (SHA:a79e586c597725d00f0e476029ded8413b6f0151)
Download action repository 'caixagithub/DevSecOps-Qualidade@main' (SHA:df3a7fe7305831ed8c5df442f4a3d0a5a1d0c92e)
Getting action download info
Download action repository 'actions/upload-artifact@v4' (SHA:ea165f8d65b6e75b540449e92b4886f43607fa02)
Getting action download info
Download action repository 'actions/download-artifact@v4' (SHA:d3f86a106a0bac45b974a628896c90dbdf5c8093)
Getting action download info
Download action repository 'actions/checkout@v5' (SHA:fbc6f3992d24b796d5a048ff273f7fcc4a7b6c09)
Getting action download info
Getting action download info
Getting action download info
Getting action download info
Getting action download info
Download action repository 'actions/checkout@v4' (SHA:11d5960a326750d5838078e36cf38b85af677262)
Download action repository 'zaproxy/action-api-scan@v0.9.0' (SHA:77dfa9a647bb0f583e39d4df8531634d6ddd8df4)
Download action repository 'zaproxy/action-baseline@v0.14.0' (SHA:7c4deb10e6261301961c86d65d54a516394f9aed)
Getting action download info
Download action repository 'actions/setup-python@v2' (SHA:e9aba2c848f5ebd159c070c61ea2c4e2b122355e)
Download action repository 'actions/cache@v4' (SHA:0057852bfaa89a56745cba8c7296529d2fc39830)
Getting action download info
Download action repository 'actions/setup-java@v3' (SHA:e9fbacdec3bb3b6036605a3e6f7995d66773a8c6)
Download action repository 'actions/checkout@v4.1.0' (SHA:8ade135a41bc03ea155e62e844d188df1ea18608)
Download action repository 'actions/setup-node@v3' (SHA:3235b876344d2a9aa001b8d1453c930bba69e610)
Getting action download info
Download action repository 'actions/setup-python@v4' (SHA:7f4fc3e22c37d6ff65e88745f38bd3157c663f7c)
Getting action download info
Uses: caixagithub/DevSecOps-Workflow-Jobs/.github/workflows/default-argo-cd-deploy-job.yaml@refs/heads/main (ade40669d345b0b0414fe9f3d9d5e5c1201f616b)
 Inputs
Complete job name: CI_DES / ArgoCD_Deploy / ArgoCD_Deploy (DES)
1s
Run actions/create-github-app-token@v2
Input 'repositories' is not set. Creating token for all repositories owned by caixagithub.
0s
Run actions/create-github-app-token@v2
Input 'repositories' is not set. Creating token for all repositories owned by caixadepartamental.
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
1m 7s
Run caixagithub/DevSecOps-Actions/.github/integrations/azure/install-az-cli@main
  with:
    version: latest
  env:
    APIM_VERSIONAPI: 
    APIM_displaynameAPI: 
    APIM_PATH: 
    APIM_SWAGGERPATH: 
    APIM_TAGSAPI: 
    APIM_POLICIESALLOPERATIONSPATH: 
Init variables
0s
Run echo "AZ_INSTALL_STATUS=none" >> $GITHUB_ENV
Verify AZ CLI Latest Version
0s
Run AZ_LATEST_VERSION=$(curl -s https://api.github.com/repos/Azure/azure-cli/releases/latest | jq -r '.tag_name' | sed 's/azure-cli-//')
    AZ_LATEST_VERSION=$(curl -s https://api.github.com/repos/Azure/azure-cli/releases/latest | jq -r '.tag_name' | sed 's/azure-cli-//')
    echo "AZ_LATEST_VERSION=$AZ_LATEST_VERSION" >> $GITHUB_ENV
    echo -e "\033[1;34m[AZ-SETUP] Versão mais recente do Azure CLI: $AZ_LATEST_VERSION. Consulte em: https://github.com/Azure/azure-cli/releases \033[0m"
    shell: /usr/bin/bash --noprofile --norc -e -o pipefail {0}
    env:
      APIM_VERSIONAPI: 
      APIM_displaynameAPI: 
      APIM_PATH: 
      APIM_SWAGGERPATH: 
      APIM_TAGSAPI: 
      APIM_POLICIESALLOPERATIONSPATH: 
      AZ_INSTALL_STATUS: none
      AZ_VERSION: latest
      INSTALL_PREREQUISITES: true
  [AZ-SETUP] Versão mais recente do Azure CLI: 2.91.0. Consulte em: https://github.com/Azure/azure-cli/releases 
Verify AZ CLI Runner
3s
Run echo -e "\033[1;34m[AZ-SETUP] Verificando se o runner possuí az-cli\033[0m"
  [AZ-SETUP] Verificando se o runner possuí az-cli
  [AZ-SETUP] Azure CLI na versão latest não foi encontrada.
Install prerequisites (wget, python3, pipx)
15s
Run echo -e "\033[1;34m[INFO] Instalando pré-requisitos...\033[0m"
  [INFO] Instalando pré-requisitos...
  Get:1 https://packages.microsoft.com/repos/azure-cli noble InRelease [3564 B]
  Get:2 https://packages.microsoft.com/ubuntu/24.04/prod noble InRelease [3600 B]
  Get:3 https://cli.github.com/packages stable InRelease [3917 B]
  Get:4 https://deb.nodesource.com/node_24.x nodistro InRelease [12.1 kB]
  Get:5 https://packages.microsoft.com/repos/azure-cli noble/main amd64 Packages [2576 B]
  Get:6 https://packages.microsoft.com/ubuntu/24.04/prod noble/main all Packages [640 B]
  Get:7 https://packages.microsoft.com/ubuntu/24.04/prod noble/main amd64 Packages [640 kB]
  Get:9 https://dl.google.com/linux/chrome-stable/deb stable InRelease [2548 B]
  Get:10 https://cli.github.com/packages stable/main amd64 Packages [358 B]
  Get:8 https://prod-cdn.packages.k8s.io/repositories/isv:/kubernetes:/core:/stable:/v1.34/deb  InRelease [1230 B]
  Get:11 https://deb.nodesource.com/node_24.x nodistro/main amd64 Packages [9819 B]
  Get:12 http://security.ubuntu.com/ubuntu noble-security InRelease [126 kB]
  Get:13 https://prod-cdn.packages.k8s.io/repositories/isv:/kubernetes:/core:/stable:/v1.34/deb  Packages [18.0 kB]
  Get:14 http://archive.ubuntu.com/ubuntu noble InRelease [256 kB]
  Get:15 https://dl.google.com/linux/chrome-stable/deb stable/main amd64 Packages [1411 B]
  Get:16 https://packages.buildkite.com/helm-linux/helm-debian/any any InRelease [29.3 kB]
  Get:18 https://ppa.launchpadcontent.net/git-core/ppa/ubuntu noble InRelease [24.3 kB]
  Get:19 http://security.ubuntu.com/ubuntu noble-security/universe amd64 Packages [1549 kB]
  Get:20 https://ppa.launchpadcontent.net/mozillateam/ppa/ubuntu noble InRelease [24.4 kB]
  Get:17 https://packages.buildkite.com/helm-linux/helm-debian/any any/main amd64 Packages [4009 B]
  Get:21 https://ppa.launchpadcontent.net/git-core/ppa/ubuntu noble/main amd64 Packages [5796 B]
  Get:22 http://archive.ubuntu.com/ubuntu noble-updates InRelease [126 kB]
  Get:23 https://ppa.launchpadcontent.net/mozillateam/ppa/ubuntu noble/main amd64 Packages [69.5 kB]
  Get:24 http://archive.ubuntu.com/ubuntu noble-backports InRelease [126 kB]
  Get:25 http://security.ubuntu.com/ubuntu noble-security/main amd64 Packages [1411 kB]
  Get:26 http://security.ubuntu.com/ubuntu noble-security/restricted amd64 Packages [2122 kB]
  Get:27 http://archive.ubuntu.com/ubuntu noble/restricted amd64 Packages [117 kB]
  Get:28 http://archive.ubuntu.com/ubuntu noble/multiverse amd64 Packages [331 kB]
  Get:29 http://security.ubuntu.com/ubuntu noble-security/multiverse amd64 Packages [55.6 kB]
  Get:30 http://archive.ubuntu.com/ubuntu noble/universe amd64 Packages [19.3 MB]
  Get:31 http://archive.ubuntu.com/ubuntu noble/main amd64 Packages [1808 kB]
  Get:32 http://archive.ubuntu.com/ubuntu noble-updates/multiverse amd64 Packages [61.7 kB]
  Get:33 http://archive.ubuntu.com/ubuntu noble-updates/universe amd64 Packages [2171 kB]
  Get:34 http://archive.ubuntu.com/ubuntu noble-updates/restricted amd64 Packages [2231 kB]
  Get:35 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 Packages [1733 kB]
  Get:36 http://archive.ubuntu.com/ubuntu noble-backports/multiverse amd64 Packages [669 B]
  Get:37 http://archive.ubuntu.com/ubuntu noble-backports/universe amd64 Packages [36.0 kB]
  Get:38 http://archive.ubuntu.com/ubuntu noble-backports/main amd64 Packages [49.0 kB]
  Fetched 34.5 MB in 5s (6389 kB/s)
  Reading package lists...
  Reading package lists...
  Building dependency tree...
  Reading state information...
  python3 is already the newest version (3.12.3-0ubuntu2.1).
  python3 set to manually installed.
  The following additional packages will be installed:
    libpython3.12-minimal libpython3.12-stdlib python3-argcomplete python3-click
    python3-colorama python3-packaging python3-pip-whl python3-platformdirs
    python3-psutil python3-setuptools-whl python3-userpath python3-venv
    python3.12 python3.12-minimal python3.12-venv
  Suggested packages:
    python3.12-doc binutils binfmt-support
  The following NEW packages will be installed:
    pipx python3-argcomplete python3-click python3-colorama python3-packaging
    python3-pip-whl python3-platformdirs python3-psutil python3-setuptools-whl
    python3-userpath python3-venv python3.12-venv
  The following packages will be upgraded:
    libpython3.12-minimal libpython3.12-stdlib python3.12 python3.12-minimal
    wget
  5 upgraded, 12 newly installed, 0 to remove and 109 not upgraded.
  Need to get 9852 kB of archives.
  After this operation, 8345 kB of additional disk space will be used.
  Get:1 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 python3.12 amd64 3.12.3-1ubuntu0.17 [651 kB]
  Get:2 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 libpython3.12-stdlib amd64 3.12.3-1ubuntu0.17 [2071 kB]
  Get:3 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 python3.12-minimal amd64 3.12.3-1ubuntu0.17 [2335 kB]
  Get:4 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 libpython3.12-minimal amd64 3.12.3-1ubuntu0.17 [839 kB]
  Get:5 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 wget amd64 1.21.4-1ubuntu4.5 [334 kB]
  Get:6 http://archive.ubuntu.com/ubuntu noble-updates/universe amd64 python3-pip-whl all 24.0+dfsg-1ubuntu1.3 [1707 kB]
  Get:7 http://archive.ubuntu.com/ubuntu noble-updates/universe amd64 python3-setuptools-whl all 68.1.2-2ubuntu1.2 [716 kB]
  Get:8 http://archive.ubuntu.com/ubuntu noble-updates/universe amd64 python3.12-venv amd64 3.12.3-1ubuntu0.17 [5684 B]
  Get:9 http://archive.ubuntu.com/ubuntu noble-updates/universe amd64 python3-venv amd64 3.12.3-0ubuntu2.1 [1032 B]
  Get:10 http://archive.ubuntu.com/ubuntu noble-updates/universe amd64 python3-argcomplete all 3.1.4-1ubuntu0.1 [33.8 kB]
  Get:11 http://archive.ubuntu.com/ubuntu noble/main amd64 python3-packaging all 24.0-1 [41.1 kB]
  Get:12 http://archive.ubuntu.com/ubuntu noble/main amd64 python3-platformdirs all 4.2.0-1 [16.1 kB]
  Get:13 http://archive.ubuntu.com/ubuntu noble/main amd64 python3-colorama all 0.4.6-4 [32.1 kB]
  Get:14 http://archive.ubuntu.com/ubuntu noble/main amd64 python3-click all 8.1.6-2 [79.0 kB]
  Get:15 http://archive.ubuntu.com/ubuntu noble/universe amd64 python3-userpath all 1.9.1-1 [9416 B]
  Get:16 http://archive.ubuntu.com/ubuntu noble/universe amd64 pipx all 1.4.3-1 [787 kB]
  Get:17 http://archive.ubuntu.com/ubuntu noble/main amd64 python3-psutil amd64 5.9.8-2build2 [195 kB]
  debconf: delaying package configuration, since apt-utils is not installed
  Fetched 9852 kB in 2s (5197 kB/s)
  (Reading database ... 
  (Reading database ... 5%
  (Reading database ... 10%
  (Reading database ... 15%
  (Reading database ... 20%
  (Reading database ... 25%
  (Reading database ... 30%
  (Reading database ... 35%
  (Reading database ... 40%
  (Reading database ... 45%
  (Reading database ... 50%
  (Reading database ... 55%
  (Reading database ... 60%
  (Reading database ... 65%
  (Reading database ... 70%
  (Reading database ... 75%
  (Reading database ... 80%
  (Reading database ... 85%
  (Reading database ... 90%
  (Reading database ... 95%
  (Reading database ... 100%
  (Reading database ... 69024 files and directories currently installed.)
  Preparing to unpack .../00-python3.12_3.12.3-1ubuntu0.17_amd64.deb ...
  Unpacking python3.12 (3.12.3-1ubuntu0.17) over (3.12.3-1ubuntu0.15) ...
  Preparing to unpack .../01-libpython3.12-stdlib_3.12.3-1ubuntu0.17_amd64.deb ...
  Unpacking libpython3.12-stdlib:amd64 (3.12.3-1ubuntu0.17) over (3.12.3-1ubuntu0.15) ...
  Preparing to unpack .../02-python3.12-minimal_3.12.3-1ubuntu0.17_amd64.deb ...
  Unpacking python3.12-minimal (3.12.3-1ubuntu0.17) over (3.12.3-1ubuntu0.15) ...
  Preparing to unpack .../03-libpython3.12-minimal_3.12.3-1ubuntu0.17_amd64.deb ...
  Unpacking libpython3.12-minimal:amd64 (3.12.3-1ubuntu0.17) over (3.12.3-1ubuntu0.15) ...
  Preparing to unpack .../04-wget_1.21.4-1ubuntu4.5_amd64.deb ...
  Unpacking wget (1.21.4-1ubuntu4.5) over (1.21.4-1ubuntu4.4) ...
  Selecting previously unselected package python3-pip-whl.
  Preparing to unpack .../05-python3-pip-whl_24.0+dfsg-1ubuntu1.3_all.deb ...
  Unpacking python3-pip-whl (24.0+dfsg-1ubuntu1.3) ...
  Selecting previously unselected package python3-setuptools-whl.
  Preparing to unpack .../06-python3-setuptools-whl_68.1.2-2ubuntu1.2_all.deb ...
  Unpacking python3-setuptools-whl (68.1.2-2ubuntu1.2) ...
  Selecting previously unselected package python3.12-venv.
  Preparing to unpack .../07-python3.12-venv_3.12.3-1ubuntu0.17_amd64.deb ...
  Unpacking python3.12-venv (3.12.3-1ubuntu0.17) ...
  Selecting previously unselected package python3-venv.
  Preparing to unpack .../08-python3-venv_3.12.3-0ubuntu2.1_amd64.deb ...
  Unpacking python3-venv (3.12.3-0ubuntu2.1) ...
  Selecting previously unselected package python3-argcomplete.
  Preparing to unpack .../09-python3-argcomplete_3.1.4-1ubuntu0.1_all.deb ...
  Unpacking python3-argcomplete (3.1.4-1ubuntu0.1) ...
  Selecting previously unselected package python3-packaging.
  Preparing to unpack .../10-python3-packaging_24.0-1_all.deb ...
  Unpacking python3-packaging (24.0-1) ...
  Selecting previously unselected package python3-platformdirs.
  Preparing to unpack .../11-python3-platformdirs_4.2.0-1_all.deb ...
  Unpacking python3-platformdirs (4.2.0-1) ...
  Selecting previously unselected package python3-colorama.
  Preparing to unpack .../12-python3-colorama_0.4.6-4_all.deb ...
  Unpacking python3-colorama (0.4.6-4) ...
  Selecting previously unselected package python3-click.
  Preparing to unpack .../13-python3-click_8.1.6-2_all.deb ...
  Unpacking python3-click (8.1.6-2) ...
  Selecting previously unselected package python3-userpath.
  Preparing to unpack .../14-python3-userpath_1.9.1-1_all.deb ...
  Unpacking python3-userpath (1.9.1-1) ...
  Selecting previously unselected package pipx.
  Preparing to unpack .../15-pipx_1.4.3-1_all.deb ...
  Unpacking pipx (1.4.3-1) ...
  Selecting previously unselected package python3-psutil.
  Preparing to unpack .../16-python3-psutil_5.9.8-2build2_amd64.deb ...
  Unpacking python3-psutil (5.9.8-2build2) ...
  Setting up python3-setuptools-whl (68.1.2-2ubuntu1.2) ...
  Setting up wget (1.21.4-1ubuntu4.5) ...
  Setting up python3-colorama (0.4.6-4) ...
  Setting up python3-pip-whl (24.0+dfsg-1ubuntu1.3) ...
  Setting up libpython3.12-minimal:amd64 (3.12.3-1ubuntu0.17) ...
  Setting up python3-click (8.1.6-2) ...
  Setting up python3-platformdirs (4.2.0-1) ...
  Setting up python3-psutil (5.9.8-2build2) ...
  Setting up python3-packaging (24.0-1) ...
  Setting up python3-argcomplete (3.1.4-1ubuntu0.1) ...
  Setting up python3-userpath (1.9.1-1) ...
  Setting up python3.12-minimal (3.12.3-1ubuntu0.17) ...
  Setting up libpython3.12-stdlib:amd64 (3.12.3-1ubuntu0.17) ...
  Setting up python3.12 (3.12.3-1ubuntu0.17) ...
  Setting up python3.12-venv (3.12.3-1ubuntu0.17) ...
  Setting up python3-venv (3.12.3-0ubuntu2.1) ...
  Setting up pipx (1.4.3-1) ...
  Processing triggers for systemd (255.4-1ubuntu8.17) ...
Install Azure CLI from Microsoft repo (latest)
48s
0s
6s
Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/pr@main
  with:
    ambiente: DES
    TOKEN_GITHUB: ***
    acr_name: acrcentralcaixanprd
    sigla: siplx
    modulo: plataforma-geracao-relatorios
    registry_url: acrcentralcaixanprd.azurecr.io
    image_dir: siplx/plataforma-geracao-relatorios/siplx-plataforma-geracao-relatorios
    image_tag: 39967565844
    github_org: caixagithub
    repository: siplx-plataforma-geracao-relatorios
  env:
    APIM_VERSIONAPI: 
    APIM_displaynameAPI: 
    APIM_PATH: 
    APIM_SWAGGERPATH: 
    APIM_TAGSAPI: 
    APIM_POLICIESALLOPERATIONSPATH: 
    AZ_INSTALL_STATUS: ms_repo_ok
    AZ_VERSION: latest
    INSTALL_PREREQUISITES: true
    AZ_LATEST_VERSION: 2.91.0
Lower environment input
0s
Run environment=$(echo "$NON_PARSED_ENVIRONMENT" | tr '[:upper:]' '[:lower:]')
Verify Environment to set repo
0s
Run repository_suffix="infranprd"
  des
  repository_suffix=infranprd
Checkout Infra Repository
1s
Run actions/checkout@v5
  Syncing repository: caixagithub/siplx-plataforma-geracao-relatorios-infranprd
Getting Git version info
  Temporarily overriding HOME='/home/runner/_work/_temp/96901bb4-d0b7-4442-992b-060b720c609a' before making global git config changes
  Adding repository directory to the temporary git global config as a safe directory
  /usr/bin/git config --global --add safe.directory /home/runner/_work/siplx-plataforma-geracao-relatorios/siplx-plataforma-geracao-relatorios
  Deleting the contents of '/home/runner/_work/siplx-plataforma-geracao-relatorios/siplx-plataforma-geracao-relatorios'
Initializing the repository
Disabling automatic garbage collection
Setting up auth
Fetching the repository
Determining the checkout info
  /usr/bin/git sparse-checkout disable
  /usr/bin/git config --local --unset-all extensions.worktreeConfig
Checking out the ref
  /usr/bin/git log -1 --format=%H
  d4e2ae750c7b9abe9916a6d77b42a22b1900266e
Verify YAML File Exists
0s
Run echo `find . -name 'values.yaml'`
    echo `find . -name 'values.yaml'`
    if [ ! -f des/values.yaml ]; then
      echo "Error: File des/values.yaml does not exist."
      exit 1
    fi
    shell: /usr/bin/bash --noprofile --norc -e -o pipefail {0}
    env:
      APIM_VERSIONAPI: 
      APIM_displaynameAPI: 
      APIM_PATH: 
      APIM_SWAGGERPATH: 
      APIM_TAGSAPI: 
      APIM_POLICIESALLOPERATIONSPATH: 
      AZ_INSTALL_STATUS: ms_repo_ok
      AZ_VERSION: latest
      INSTALL_PREREQUISITES: true
      AZ_LATEST_VERSION: 2.91.0
      environment: des
      repository_suffix: infranprd
  ./des/values.yaml ./hmp/values.yaml ./tst/values.yaml ./tqs/values.yaml
Run Bash PR
5s
Run REPO="caixagithub/siplx-plataforma-geracao-relatorios-infranprd"
    REPO="caixagithub/siplx-plataforma-geracao-relatorios-infranprd"
    BRANCH="update-image-siplx-plataforma-geracao-relatorios-des-39967565844"
    BASE_BRANCH="main"
    TOKEN="***"
    FILE_PATH="des/values.yaml"
    COMMIT_MESSAGE="Update image tag to siplx-plataforma-geracao-relatorios-des-39967565844"
    PR_TITLE="Update image tag to siplx-plataforma-geracao-relatorios-des-39967565844"
    PR_BODY="This PR updates the image tag and repository."
    
    if [ -n "39967565844" ]; then
      IMAGE_TAG="39967565844"
    else
      IMAGE_TAG="39967565844"
    fi
    
    # Use registry_url if provided, otherwise fall back to acr_name
    IMAGE_REPOSITORY=acrcentralcaixanprd.azurecr.io/siplx/plataforma-geracao-relatorios/siplx-plataforma-geracao-relatorios
    
    
    # Escapar caracteres especiais em IMAGE_REPOSITORY
    ESCAPED_IMAGE_REPOSITORY=$(echo $IMAGE_REPOSITORY | sed 's/\//\\\//g')
    
    sed -i "s/\(tag:\s*\).*/\1\"$IMAGE_TAG\"/" des/values.yaml
    sed -i "s/\(repository:\s*\).*/\1$ESCAPED_IMAGE_REPOSITORY/" des/values.yaml
    
    # Criar uma nova branch
    curl -X POST -H "Authorization: token $TOKEN" \
      -H "Accept: application/vnd.github.v3+json" \
      https://api.github.com/repos/$REPO/git/refs \
      -d @- << EOF
    {
      "ref": "refs/heads/$BRANCH",
      "sha": "$(curl -H "Authorization: token $TOKEN" -H "Accept: application/vnd.github.v3+json" https://api.github.com/repos/$REPO/git/refs/heads/$BASE_BRANCH | jq -r .object.sha)"
    }
    EOF
    
    # Obter o SHA do arquivo existente
    FILE_SHA=$(curl -H "Authorization: token $TOKEN" \
      -H "Accept: application/vnd.github.v3+json" \
      https://api.github.com/repos/$REPO/contents/$FILE_PATH?ref=$BASE_BRANCH | jq -r .sha)
    
    # Ler o conteúdo do arquivo values.yaml e codificá-lo em base64
    CONTENT=$(base64 -w 0 $FILE_PATH)
    
    # Fazer commit das mudanças
    curl -X PUT -H "Authorization: token $TOKEN" \
      -H "Accept: application/vnd.github.v3+json" \
      https://api.github.com/repos/$REPO/contents/$FILE_PATH \
      -d @- << EOF
    {
      "message": "$COMMIT_MESSAGE",
      "content": "$CONTENT",
      "sha": "$FILE_SHA",
      "branch": "$BRANCH"
    }
    EOF
    
    # Criar o Pull Request
    curl -X POST -H "Authorization: token $TOKEN" \
      -H "Accept: application/vnd.github.v3+json" \
      https://api.github.com/repos/$REPO/pulls \
      -d @- << EOF
    {
      "title": "$PR_TITLE",
      "body": "$PR_BODY",
      "head": "$BRANCH",
      "base": "$BASE_BRANCH"
    }
    EOF
    shell: /usr/bin/bash --noprofile --norc -e -o pipefail {0}
    env:
      APIM_VERSIONAPI: 
      APIM_displaynameAPI: 
      APIM_PATH: 
      APIM_SWAGGERPATH: 
      APIM_TAGSAPI: 
      APIM_POLICIESALLOPERATIONSPATH: 
      AZ_INSTALL_STATUS: ms_repo_ok
      AZ_VERSION: latest
      INSTALL_PREREQUISITES: true
      AZ_LATEST_VERSION: 2.91.0
      environment: des
      repository_suffix: infranprd
    % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                   Dload  Upload   Total   Spent    Left  Speed
  
    0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
  100   451  100   451    0     0   1082      0 --:--:-- --:--:-- --:--:--  1081
  100   451  100   451    0     0   1082      0 --:--:-- --:--:-- --:--:--  1081
    % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                   Dload  Upload   Total   Spent    Left  Speed
  
    0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
  100   794  100   654  100   140    795    170 --:--:-- --:--:-- --:--:--   965
  {
    "ref": "refs/heads/update-image-siplx-plataforma-geracao-relatorios-des-39967565844",
    "node_id": "REF_kwDOVP6pitoAS3JlZnMvaGVhZHMvdXBkYXRlLWltYWdlLXNpcGx4LXBsYXRhZm9ybWEtZ2VyYWNhby1yZWxhdG9yaW9zLWRlcy0zOTk2NzU2NTg0NA",
    "url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/git/refs/heads/update-image-siplx-plataforma-geracao-relatorios-des-39967565844",
    "object": {
      "sha": "d4e2ae750c7b9abe9916a6d77b42a22b1900266e",
      "type": "commit",
      "url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/git/commits/d4e2ae750c7b9abe9916a6d77b42a22b1900266e"
    }
  }
    % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                   Dload  Upload   Total   Spent    Left  Speed
  
    0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
  100  6901  100  6901    0     0  20866      0 --:--:-- --:--:-- --:--:-- 20848
  100  6901  100  6901    0     0  20862      0 --:--:-- --:--:-- --:--:-- 20848
    % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                   Dload  Upload   Total   Spent    Left  Speed
  
    0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
  100  5659    0     0  100  5659      0   5408  0:00:01  0:00:01 --:--:--  5410
  {
    "content": {
      "name": "values.yaml",
      "path": "des/values.yaml",
  100 10070  100  4411  100  5659   2449   3142  0:00:01  0:00:01 --:--:--  5591
  100 10070  100  4411  100  5659   2449   3142  0:00:01  0:00:01 --:--:--  5591
      "sha": "7d93ea4130aa43daa1510205f8580ae4a5e4c6da",
      "size": 4068,
      "url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/contents/des/values.yaml?ref=update-image-siplx-plataforma-geracao-relatorios-des-39967565844",
      "html_url": "https://github.com/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/blob/update-image-siplx-plataforma-geracao-relatorios-des-39967565844/des/values.yaml",
      "git_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/git/blobs/7d93ea4130aa43daa1510205f8580ae4a5e4c6da",
      "download_url": "https://raw.githubusercontent.com/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/update-image-siplx-plataforma-geracao-relatorios-des-39967565844/des/values.yaml?token=B6HRFR72UFTEEXTYNFLFEZDK3NWLHAVPNFXHG5DBNRWGC5DJN5XF62LEZYDIO3LXWFUW443UMFWGYYLUNFXW4X3UPFYGLN2JNZ2GKZ3SMF2GS33OJFXHG5DBNRWGC5DJN5XA",
      "type": "file",
      "_links": {
        "self": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/contents/des/values.yaml?ref=update-image-siplx-plataforma-geracao-relatorios-des-39967565844",
        "git": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/git/blobs/7d93ea4130aa43daa1510205f8580ae4a5e4c6da",
        "html": "https://github.com/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/blob/update-image-siplx-plataforma-geracao-relatorios-des-39967565844/des/values.yaml"
      }
    },
    "commit": {
      "sha": "4069e545972616869d407e2097f37fab515969eb",
      "node_id": "C_kwDOVP6pitoAKDQwNjllNTQ1OTcyNjE2ODY5ZDQwN2UyMDk3ZjM3ZmFiNTE1OTY5ZWI",
      "url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/git/commits/4069e545972616869d407e2097f37fab515969eb",
      "html_url": "https://github.com/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/commit/4069e545972616869d407e2097f37fab515969eb",
      "author": {
        "name": "app-actions-for-ci-cd[bot]",
        "email": "261034695+app-actions-for-ci-cd[bot]@users.noreply.github.com",
        "date": "2026-10-23T14:17:26Z"
      },
      "committer": {
        "name": "GitHub",
        "email": "noreply@github.com",
        "date": "2026-10-23T14:17:26Z"
      },
      "tree": {
        "sha": "9db8d795cb7cd403de51c052d23c566907ce3ee2",
        "url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/git/trees/9db8d795cb7cd403de51c052d23c566907ce3ee2"
      },
      "message": "Update image tag to siplx-plataforma-geracao-relatorios-des-39967565844",
      "parents": [
        {
          "sha": "d4e2ae750c7b9abe9916a6d77b42a22b1900266e",
          "url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/git/commits/d4e2ae750c7b9abe9916a6d77b42a22b1900266e",
          "html_url": "https://github.com/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/commit/d4e2ae750c7b9abe9916a6d77b42a22b1900266e"
        }
      ],
      "verification": {
        "verified": true,
        "reason": "valid",
        "signature": "-----BEGIN PGP SIGNATURE-----\n\nwsFcBAABCAAQBQJq22x2CRC1aQ7uu5UhlAAAgZcQABxHJ0/+jNVcmllvhXBLUcTs\nkAgkloTkgQ22YyOX7m5P2hxhbLJhfmThR37LzbwXwY9qUOBk96LBhfWx6STD+x7e\nLrXDwDm4TdZDUvuJqofY90ZG7NBNBEkw5f+Cgi+1k3N/KnFk3Dx6zyj5IyKFwRHI\ni0MsNc1NqQK/wJt7uXKQf+ojTzBdH9nFtypCralZvxHAQrcZaMESAi808pQkGGyO\n8L+2tWXWZuX557HRWDVwyYoG0nBBRh/LEmRNDBRxxbPOsUPxcB5ooGbyzXoVs/10\nEOijoD0d4YnmTAFqY8BJthqg2ul+2GRB0MNBL13sRUDdv6ei0YQSC4RheD2nN5RH\n2kNkdm+U9oko20ysP6XFpGBkyU5cDZlh3CKI5KVXFjMpKlV8w6S9hgnAtKCqyKU0\nMyPHyfSiiIrwhoYi4ZzqBXcHFKs+h5sHZyT3LynR9DVlS5fM3aM8bZRgGlZzPAq9\n1BeB0O3s8m1kSygyuGWwOHOe/ffn5pnH7muNulWsrwccrreib6VUEKi+hzQ4fRnR\nY2XRdDla1C6Eh9IMtNmg7rVU1ENQqi0SeNcCHI7Gmqu7qytZVtnrtl/2p6iJnjnA\nMoTABHz6vX4wyRQAsJ1hrPysTv1vyI63AxG+ssDv2ATu5S64p56cEvn8YOvYluUj\nfZayVb3mKI1yqlNeAS/q\n=nNFl\n-----END PGP SIGNATURE-----\n",
        "payload": "tree 9db8d795cb7cd403de51c052d23c566907ce3ee2\nparent d4e2ae750c7b9abe9916a6d77b42a22b1900266e\nauthor app-actions-for-ci-cd[bot] <261034695+app-actions-for-ci-cd[bot]@users.noreply.github.com> 1792765046 +0000\ncommitter GitHub <noreply@github.com> 1792765046 +0000\n\nUpdate image tag to siplx-plataforma-geracao-relatorios-des-39967565844",
        "verified_at": "2026-10-23T14:17:27Z"
      }
    }
  }
    % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                   Dload  Upload   Total   Spent    Left  Speed
  
    0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
  {
    "url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/pulls/6",
    "id": 4984166485,
    "node_id": "PR_kwDOVP6pis8AAAABKRRYVQ",
    "html_url": "https://github.com/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/pull/6",
    "diff_url": "https://github.com/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/pull/6.diff",
    "patch_url": "https://github.com/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/pull/6.patch",
    "issue_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/issues/6",
    "number": 6,
    "state": "open",
    "locked": false,
    "title": "Update image tag to siplx-plataforma-geracao-relatorios-des-39967565844",
    "user": {
      "login": "app-actions-for-ci-cd[bot]",
      "id": 261034695,
      "node_id": "BOT_kgDOD48Sxw",
      "avatar_url": "https://avatars.githubusercontent.com/b/199837?v=4",
      "gravatar_id": "",
      "url": "https://api.github.com/users/app-actions-for-ci-cd%5Bbot%5D",
      "html_url": "https://github.com/apps/app-actions-for-ci-cd",
      "followers_url": "https://api.github.com/users/app-actions-for-ci-cd%5Bbot%5D/followers",
      "following_url": "https://api.github.com/users/app-actions-for-ci-cd%5Bbot%5D/following{/other_user}",
      "gists_url": "https://api.github.com/users/app-actions-for-ci-cd%5Bbot%5D/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/app-actions-for-ci-cd%5Bbot%5D/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/app-actions-for-ci-cd%5Bbot%5D/subscriptions",
      "organizations_url": "https://api.github.com/users/app-actions-for-ci-cd%5Bbot%5D/orgs",
      "repos_url": "https://api.github.com/users/app-actions-for-ci-cd%5Bbot%5D/repos",
      "events_url": "https://api.github.com/users/app-actions-for-ci-cd%5Bbot%5D/events{/privacy}",
      "received_events_url": "https://api.github.com/users/app-actions-for-ci-cd%5Bbot%5D/received_events",
      "type": "Bot",
      "user_view_type": "public",
      "site_admin": false
    },
    "body": "This PR updates the image tag and repository.",
    "created_at": "2026-10-23T14:17:28Z",
    "updated_at": "2026-10-23T14:17:28Z",
    "closed_at": null,
    "merged_at": null,
    "merge_commit_sha": null,
    "assignees": [
  
    ],
    "requested_reviewers": [
  
    ],
    "requested_teams": [
  
    ],
    "labels": [
  
    ],
    "milestone": null,
    "draft": false,
    "commits_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/pulls/6/commits",
    "review_comments_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/pulls/6/comments",
    "review_comment_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/pulls/comments{/number}",
    "comments_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/issues/6/comments",
    "statuses_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/statuses/4069e545972616869d407e2097f37fab515969eb",
    "head": {
      "label": "caixagithub:update-image-siplx-plataforma-geracao-relatorios-des-39967565844",
      "ref": "update-image-siplx-plataforma-geracao-relatorios-des-39967565844",
      "sha": "4069e545972616869d407e2097f37fab515969eb",
      "user": {
        "login": "caixagithub",
        "id": 176627713,
        "node_id": "O_kgDOCocgAQ",
        "avatar_url": "https://avatars.githubusercontent.com/u/176627713?v=4",
        "gravatar_id": "",
        "url": "https://api.github.com/users/caixagithub",
        "html_url": "https://github.com/caixagithub",
        "followers_url": "https://api.github.com/users/caixagithub/followers",
        "following_url": "https://api.github.com/users/caixagithub/following{/other_user}",
        "gists_url": "https://api.github.com/users/caixagithub/gists{/gist_id}",
        "starred_url": "https://api.github.com/users/caixagithub/starred{/owner}{/repo}",
        "subscriptions_url": "https://api.github.com/users/caixagithub/subscriptions",
        "organizations_url": "https://api.github.com/users/caixagithub/orgs",
        "repos_url": "https://api.github.com/users/caixagithub/repos",
        "events_url": "https://api.github.com/users/caixagithub/events{/privacy}",
        "received_events_url": "https://api.github.com/users/caixagithub/received_events",
        "type": "Organization",
        "user_view_type": "public",
        "site_admin": false
      },
      "repo": {
        "id": 1425975690,
        "node_id": "R_kgDOVP6pig",
        "name": "siplx-plataforma-geracao-relatorios-infranprd",
        "full_name": "caixagithub/siplx-plataforma-geracao-relatorios-infranprd",
        "private": true,
        "owner": {
          "login": "caixagithub",
          "id": 176627713,
          "node_id": "O_kgDOCocgAQ",
          "avatar_url": "https://avatars.githubusercontent.com/u/176627713?v=4",
          "gravatar_id": "",
          "url": "https://api.github.com/users/caixagithub",
          "html_url": "https://github.com/caixagithub",
          "followers_url": "https://api.github.com/users/caixagithub/followers",
          "following_url": "https://api.github.com/users/caixagithub/following{/other_user}",
          "gists_url": "https://api.github.com/users/caixagithub/gists{/gist_id}",
          "starred_url": "https://api.github.com/users/caixagithub/starred{/owner}{/repo}",
          "subscriptions_url": "https://api.github.com/users/caixagithub/subscriptions",
          "organizations_url": "https://api.github.com/users/caixagithub/orgs",
          "repos_url": "https://api.github.com/users/caixagithub/repos",
          "events_url": "https://api.github.com/users/caixagithub/events{/privacy}",
          "received_events_url": "https://api.github.com/users/caixagithub/received_events",
          "type": "Organization",
          "user_view_type": "public",
          "site_admin": false
  100   238    0     0  100   238      0    227  0:00:01  0:00:01 --:--:--   227
  100 22946  100 22708  100   238  12958    135  0:00:01  0:00:01 --:--:-- 13097
        },
        "html_url": "https://github.com/caixagithub/siplx-plataforma-geracao-relatorios-infranprd",
        "description": "Adicionando aplicação: siplx-api-plataforma-geracao-relatorios-infranprd",
        "fork": false,
        "url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd",
        "forks_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/forks",
        "keys_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/keys{/key_id}",
        "collaborators_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/collaborators{/collaborator}",
        "teams_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/teams",
        "hooks_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/hooks",
        "issue_events_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/issues/events{/number}",
        "events_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/events",
        "assignees_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/assignees{/user}",
        "branches_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/branches{/branch}",
        "tags_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/tags",
        "blobs_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/git/blobs{/sha}",
        "git_tags_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/git/tags{/sha}",
        "git_refs_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/git/refs{/sha}",
        "trees_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/git/trees{/sha}",
        "statuses_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/statuses/{sha}",
        "languages_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/languages",
        "stargazers_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/stargazers",
        "contributors_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/contributors",
        "subscribers_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/subscribers",
        "subscription_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/subscription",
        "commits_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/commits{/sha}",
        "git_commits_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/git/commits{/sha}",
        "comments_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/comments{/number}",
        "issue_comment_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/issues/comments{/number}",
        "contents_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/contents/{+path}",
        "compare_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/compare/{base}...{head}",
        "merges_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/merges",
        "archive_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/{archive_format}{/ref}",
        "downloads_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/downloads",
        "issues_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/issues{/number}",
        "pulls_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/pulls{/number}",
        "milestones_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/milestones{/number}",
        "notifications_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/notifications{?since,all,participating}",
        "labels_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/labels{/name}",
        "releases_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/releases{/id}",
        "deployments_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/deployments",
        "created_at": "2026-10-19T17:48:13Z",
        "updated_at": "2026-10-23T13:34:11Z",
        "pushed_at": "2026-10-23T14:17:25Z",
        "git_url": "git://github.com/caixagithub/siplx-plataforma-geracao-relatorios-infranprd.git",
        "ssh_url": "git@github.com:caixagithub/siplx-plataforma-geracao-relatorios-infranprd.git",
        "clone_url": "https://github.com/caixagithub/siplx-plataforma-geracao-relatorios-infranprd.git",
        "svn_url": "https://github.com/caixagithub/siplx-plataforma-geracao-relatorios-infranprd",
        "homepage": null,
        "size": 28,
        "stargazers_count": 0,
        "watchers_count": 0,
        "language": null,
        "has_issues": true,
        "has_projects": true,
        "has_downloads": false,
        "has_wiki": true,
        "has_pages": false,
        "has_discussions": false,
        "forks_count": 0,
        "mirror_url": null,
        "archived": false,
        "disabled": false,
        "open_issues_count": 2,
        "license": null,
        "allow_forking": true,
        "is_template": false,
        "web_commit_signoff_required": false,
        "has_pull_requests": true,
        "pull_request_creation_policy": "all",
        "topics": [
          "estavel",
          "infra",
          "infranprd",
          "siplx"
        ],
        "visibility": "private",
        "forks": 0,
        "open_issues": 2,
        "watchers": 0,
        "default_branch": "main"
      }
    },
    "base": {
      "label": "caixagithub:main",
      "ref": "main",
      "sha": "d4e2ae750c7b9abe9916a6d77b42a22b1900266e",
      "user": {
        "login": "caixagithub",
        "id": 176627713,
        "node_id": "O_kgDOCocgAQ",
        "avatar_url": "https://avatars.githubusercontent.com/u/176627713?v=4",
        "gravatar_id": "",
        "url": "https://api.github.com/users/caixagithub",
        "html_url": "https://github.com/caixagithub",
        "followers_url": "https://api.github.com/users/caixagithub/followers",
        "following_url": "https://api.github.com/users/caixagithub/following{/other_user}",
        "gists_url": "https://api.github.com/users/caixagithub/gists{/gist_id}",
        "starred_url": "https://api.github.com/users/caixagithub/starred{/owner}{/repo}",
        "subscriptions_url": "https://api.github.com/users/caixagithub/subscriptions",
        "organizations_url": "https://api.github.com/users/caixagithub/orgs",
        "repos_url": "https://api.github.com/users/caixagithub/repos",
        "events_url": "https://api.github.com/users/caixagithub/events{/privacy}",
        "received_events_url": "https://api.github.com/users/caixagithub/received_events",
        "type": "Organization",
        "user_view_type": "public",
        "site_admin": false
      },
      "repo": {
        "id": 1425975690,
        "node_id": "R_kgDOVP6pig",
        "name": "siplx-plataforma-geracao-relatorios-infranprd",
        "full_name": "caixagithub/siplx-plataforma-geracao-relatorios-infranprd",
        "private": true,
        "owner": {
          "login": "caixagithub",
          "id": 176627713,
          "node_id": "O_kgDOCocgAQ",
          "avatar_url": "https://avatars.githubusercontent.com/u/176627713?v=4",
          "gravatar_id": "",
          "url": "https://api.github.com/users/caixagithub",
          "html_url": "https://github.com/caixagithub",
          "followers_url": "https://api.github.com/users/caixagithub/followers",
          "following_url": "https://api.github.com/users/caixagithub/following{/other_user}",
          "gists_url": "https://api.github.com/users/caixagithub/gists{/gist_id}",
          "starred_url": "https://api.github.com/users/caixagithub/starred{/owner}{/repo}",
          "subscriptions_url": "https://api.github.com/users/caixagithub/subscriptions",
          "organizations_url": "https://api.github.com/users/caixagithub/orgs",
          "repos_url": "https://api.github.com/users/caixagithub/repos",
          "events_url": "https://api.github.com/users/caixagithub/events{/privacy}",
          "received_events_url": "https://api.github.com/users/caixagithub/received_events",
          "type": "Organization",
          "user_view_type": "public",
          "site_admin": false
        },
        "html_url": "https://github.com/caixagithub/siplx-plataforma-geracao-relatorios-infranprd",
        "description": "Adicionando aplicação: siplx-api-plataforma-geracao-relatorios-infranprd",
        "fork": false,
        "url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd",
        "forks_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/forks",
        "keys_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/keys{/key_id}",
        "collaborators_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/collaborators{/collaborator}",
        "teams_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/teams",
        "hooks_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/hooks",
        "issue_events_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/issues/events{/number}",
        "events_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/events",
        "assignees_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/assignees{/user}",
        "branches_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/branches{/branch}",
        "tags_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/tags",
        "blobs_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/git/blobs{/sha}",
        "git_tags_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/git/tags{/sha}",
        "git_refs_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/git/refs{/sha}",
        "trees_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/git/trees{/sha}",
        "statuses_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/statuses/{sha}",
        "languages_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/languages",
        "stargazers_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/stargazers",
        "contributors_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/contributors",
        "subscribers_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/subscribers",
        "subscription_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/subscription",
        "commits_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/commits{/sha}",
        "git_commits_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/git/commits{/sha}",
        "comments_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/comments{/number}",
        "issue_comment_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/issues/comments{/number}",
        "contents_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/contents/{+path}",
        "compare_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/compare/{base}...{head}",
        "merges_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/merges",
        "archive_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/{archive_format}{/ref}",
        "downloads_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/downloads",
        "issues_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/issues{/number}",
        "pulls_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/pulls{/number}",
        "milestones_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/milestones{/number}",
        "notifications_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/notifications{?since,all,participating}",
        "labels_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/labels{/name}",
        "releases_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/releases{/id}",
        "deployments_url": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/deployments",
        "created_at": "2026-10-19T17:48:13Z",
        "updated_at": "2026-10-23T13:34:11Z",
        "pushed_at": "2026-10-23T14:17:25Z",
        "git_url": "git://github.com/caixagithub/siplx-plataforma-geracao-relatorios-infranprd.git",
        "ssh_url": "git@github.com:caixagithub/siplx-plataforma-geracao-relatorios-infranprd.git",
        "clone_url": "https://github.com/caixagithub/siplx-plataforma-geracao-relatorios-infranprd.git",
        "svn_url": "https://github.com/caixagithub/siplx-plataforma-geracao-relatorios-infranprd",
        "homepage": null,
        "size": 28,
        "stargazers_count": 0,
        "watchers_count": 0,
        "language": null,
        "has_issues": true,
        "has_projects": true,
        "has_downloads": false,
        "has_wiki": true,
        "has_pages": false,
        "has_discussions": false,
        "forks_count": 0,
        "mirror_url": null,
        "archived": false,
        "disabled": false,
        "open_issues_count": 2,
        "license": null,
        "allow_forking": true,
        "is_template": false,
        "web_commit_signoff_required": false,
        "has_pull_requests": true,
        "pull_request_creation_policy": "all",
        "topics": [
          "estavel",
          "infra",
          "infranprd",
          "siplx"
        ],
        "visibility": "private",
        "forks": 0,
        "open_issues": 2,
        "watchers": 0,
        "default_branch": "main"
      }
    },
    "_links": {
      "self": {
        "href": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/pulls/6"
      },
      "html": {
        "href": "https://github.com/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/pull/6"
      },
      "issue": {
        "href": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/issues/6"
      },
      "comments": {
        "href": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/issues/6/comments"
      },
      "review_comments": {
        "href": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/pulls/6/comments"
      },
      "review_comment": {
        "href": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/pulls/comments{/number}"
      },
      "commits": {
        "href": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/pulls/6/commits"
      },
      "statuses": {
        "href": "https://api.github.com/repos/caixagithub/siplx-plataforma-geracao-relatorios-infranprd/statuses/4069e545972616869d407e2097f37fab515969eb"
      }
    },
    "author_association": "NONE",
    "auto_merge": null,
    "assignee": null,
    "active_lock_reason": null,
    "merged": false,
    "mergeable": null,
    "rebaseable": null,
    "mergeable_state": "unknown",
    "merged_by": null,
    "comments": 0,
    "review_comments": 0,
    "maintainer_can_modify": false,
    "commits": 1,
    "additions": 1,
    "deletions": 1,
    "changed_files": 1
  }
Verify Updated File
0s
0s
0s
0s
5s
0s
0s
0s
0s
0s
21s
6s
0s
0s
0s
3m 21s
1s
Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/logs@main
  with:
    ARGOCD_SERVER: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io
    ARGOCD_APP: caixagithub/siplx-plataforma-geracao-relatorios
    AMBIENTE: DES
    IMAGE_TAG: 39967565844
    HEALTH_CHECK_WAS_SUCCESSFUL: true
  env:
    APIM_VERSIONAPI: 
    APIM_displaynameAPI: 
    APIM_PATH: 
    APIM_SWAGGERPATH: 
    APIM_TAGSAPI: 
    APIM_POLICIESALLOPERATIONSPATH: 
    AZ_INSTALL_STATUS: ms_repo_ok
    AZ_VERSION: latest
    INSTALL_PREREQUISITES: true
    AZ_LATEST_VERSION: 2.91.0
    environment: des
    repository_suffix: infranprd
    REPO: siplx-plataforma-geracao-relatorios
    JOB_ID: 167585
    ARGOCD_AUTH_TOKEN: ***
Formate ARGO REPOSITORY
0s
Run echo "REPO_NAME=$(echo 'caixagithub/siplx-plataforma-geracao-relatorios' | cut -d'/' -f2)" >> $GITHUB_ENV
    echo "REPO_NAME=$(echo 'caixagithub/siplx-plataforma-geracao-relatorios' | cut -d'/' -f2)" >> $GITHUB_ENV
    echo "INPUT_IMAGE_TAG: '39967565844'"
    echo "AMBIENTE_LOWER=$(echo 'DES' | tr '[:upper:]' '[:lower:]')" >> $GITHUB_ENV
    shell: /usr/bin/bash --noprofile --norc -e -o pipefail {0}
    env:
      APIM_VERSIONAPI: 
      APIM_displaynameAPI: 
      APIM_PATH: 
      APIM_SWAGGERPATH: 
      APIM_TAGSAPI: 
      APIM_POLICIESALLOPERATIONSPATH: 
      AZ_INSTALL_STATUS: ms_repo_ok
      AZ_VERSION: latest
      INSTALL_PREREQUISITES: true
      AZ_LATEST_VERSION: 2.91.0
      environment: des
      repository_suffix: infranprd
      REPO: siplx-plataforma-geracao-relatorios
      JOB_ID: 167585
      ARGOCD_AUTH_TOKEN: ***
  INPUT_IMAGE_TAG: '39967565844'
Coletando logs dos pods
0s
Run RESOURCE_TREE_URL="https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/siplx-plataforma-geracao-relatorios-des/resource-tree?appNamespace=openshift-gitops"
  Fazendo requisição para: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/siplx-plataforma-geracao-relatorios-des/resource-tree?appNamespace=openshift-gitops
  Resource-tree obtido com sucesso
  Filtrando pods e encontrando o mais recente...
  Pod mais recente encontrado: siplx-plataforma-geracao-relatorios-des-8448ff68f5-2rlbh
  URL dos logs: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/siplx-plataforma-geracao-relatorios-des/logs?appNamespace=openshift-gitops&container=siplx-plataforma-geracao-relatorios-des&namespace=siplx-plataforma-geracao-relatorios&follow=false&podName=siplx-plataforma-geracao-relatorios-des-8448ff68f5-2rlbh&tailLines=1000&sinceSeconds=0
  Logs obtidos com sucesso
  Logs do pod siplx-plataforma-geracao-relatorios-des-8448ff68f5-2rlbh:
  ================================================
  Exibindo os Logs:
  I1023 14:19:43.833559       1 version.go:31] "version info" version="" commit="0eef8df" buildDate="2025-05-19T06:17:15Z" component="vaultenv"
  I1023 14:19:43.833712       1 main.go:184] "azure key vault env injector initializing"
  I1023 14:19:43.833958       1 main.go:253] "found original container command" cmd="/usr/bin/java" args=["java","-XX:+UseContainerSupport","-XX:MaxRAMPercentage=75.0","-jar","/opt/deploy/quarkus-run.jar"]
  I1023 14:19:43.834011       1 authentication.go:110] "checking if current auth service credentials are stale" url="http://akv2k8s-envinjector.akv2k8s.svc:80/auth/siplx-plataforma-geracao-relatorios/siplx-plataforma-geracao-relatorios-des-8448ff68f5-2rlbh?secret=akv2k8s-siplx-plataforma-geracao-relatorios-des"
  I1023 14:19:43.907182       1 authentication.go:123] "auth service credentials ok" url="http://akv2k8s-envinjector.akv2k8s.svc:80/auth/siplx-plataforma-geracao-relatorios/siplx-plataforma-geracao-relatorios-des-8448ff68f5-2rlbh?secret=akv2k8s-siplx-plataforma-geracao-relatorios-des"
  I1023 14:19:43.907720       1 authentication.go:159] "requesting azure key vault oauth token" url="https://akv2k8s-envinjector.akv2k8s.svc:9443/auth/siplx-plataforma-geracao-relatorios/siplx-plataforma-geracao-relatorios-des-8448ff68f5-2rlbh"
  I1023 14:19:43.942709       1 authentication.go:179] "successfully received oauth token"
  I1023 14:19:44.077302       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="siplx-plataforma-geracao-relatorios/akvs-siplx-api-plataforma-geracao-relatorios-sql-des" env="DATASOURCE_PASSWORD"
  I1023 14:19:44.141151       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="siplx-plataforma-geracao-relatorios/akvs-env-redis-password-des" env="REDIS_PASSWORD"
  I1023 14:19:44.231022       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="siplx-plataforma-geracao-relatorios/akvs-env-sso-secret-des" env="AUTH_SERVER_CLIENT_SECRET"
  I1023 14:19:44.289729       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="siplx-plataforma-geracao-relatorios/akvs-env-sso-secret-des" env="APPLICATION_CLIENT_SECRET"
  I1023 14:19:44.289765       1 main.go:343] "starting process with secrets in env vars" cmd="/usr/bin/java" args=["java","-XX:+UseContainerSupport","-XX:MaxRAMPercentage=75.0","-jar","/opt/deploy/quarkus-run.jar"]
  __  ____  __  _____   ___  __ ____  ______
   --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
   -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
  --\___\_\____/_/ |_/_/|_/_/|_|\____/___/
  2026-10-23 14:19:44,959 DEBUG [org.jbo.logging] (main) Logging Provider: org.jboss.logging.JBossLogManagerProvider
  2026-10-23 14:19:45,047 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource BuildTime RunTime Fixed with ordinal 2147483647
  2026-10-23 14:19:45,047 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource SysPropConfigSource with ordinal 400
  2026-10-23 14:19:45,047 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource EnvConfigSource with ordinal 300
  2026-10-23 14:19:45,047 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource PropertiesConfigSource[source=jar:file:///opt/deploy/app/api-plataforma-geracao-relatorios-1.0.0.jar!/application.properties] with ordinal 250
  2026-10-23 14:19:45,047 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource DefaultValuesConfigSource with ordinal -2147483648
  2026-10-23 14:19:45,442 DEBUG [org.jos.jwa.AlgorithmFactoryFactory] (main) Initializing jose4j (running with Java 21.0.12.1 from Microsoft at /usr/lib/jvm/msopenjdk-21-amd64 with [SUN version 21, SunRsaSign version 21, SunEC version 21, SunJSSE version 21, SunJCE version 21, SunJGSS version 21, SunSASL version 21, XMLDSig version 21, SunPCSC version 21, JdkLDAP version 21, JdkSASL version 21, SunPKCS11 version 21] security providers installed)...
  2026-10-23 14:19:45,443 DEBUG [org.jos.jwa.AlgorithmFactory->JsonWebSignatureAlgorithm] (main) org.jose4j.jws.UnsecuredNoneAlgorithm(none|null) registered for alg algorithm none
  2026-10-23 14:19:45,447 DEBUG [org.jos.jwa.AlgorithmFactory->JsonWebSignatureAlgorithm] (main) org.jose4j.jws.HmacUsingShaAlgorithm$HmacSha256(HS256|HmacSHA256) registered for alg algorithm HS256
  2026-10-23 14:19:45,447 DEBUG [org.jos.jwa.AlgorithmFactory->JsonWebSignatureAlgorithm] (main) org.jose4j.jws.HmacUsingShaAlgorithm$HmacSha384(HS384|HmacSHA384) registered for alg algorithm HS384
  2026-10-23 14:19:45,448 DEBUG [org.jos.jwa.AlgorithmFactory->JsonWebSignatureAlgorithm] (main) org.jose4j.jws.HmacUsingShaAlgorithm$HmacSha512(HS512|HmacSHA512) registered for alg algorithm HS512
  2026-10-23 14:19:45,449 DEBUG [org.jos.jwa.AlgorithmFactory->JsonWebSignatureAlgorithm] (main) org.jose4j.jws.EdDsaAlgorithm(EdDSA|EdDSA) registered for alg algorithm EdDSA
  2026-10-23 14:19:45,450 DEBUG [org.jos.jwa.AlgorithmFactory->JsonWebSignatureAlgorithm] (main) org.jose4j.jws.EcdsaUsingShaAlgorithm$EcdsaP256UsingSha256(ES256|SHA256withECDSA) registered for alg algorithm ES256
  2026-10-23 14:19:45,451 DEBUG [org.jos.jwa.AlgorithmFactory->JsonWebSignatureAlgorithm] (main) org.jose4j.jws.EcdsaUsingShaAlgorithm$EcdsaP384UsingSha384(ES384|SHA384withECDSA) registered for alg algorithm ES384
  2026-10-23 14:19:45,451 DEBUG [org.jos.jwa.AlgorithmFactory->JsonWebSignatureAlgorithm] (main) org.jose4j.jws.EcdsaUsingShaAlgorithm$EcdsaP521UsingSha512(ES512|SHA512withECDSA) registered for alg algorithm ES512
  2026-10-23 14:19:45,539 DEBUG [org.jos.jws.EcdsaUsingShaAlgorithm$EcdsaSECP256K1UsingSha256] (main) ES256K is not available due to org.jose4j.lang.JoseException: Problem creating signature.; caused by: java.security.SignatureException: Curve not supported: java.security.spec.ECParameterSpec@235834f2
  2026-10-23 14:19:45,539 DEBUG [org.jos.jwa.AlgorithmFactory->JsonWebSignatureAlgorithm] (main) ES256K is unavailable so will not be registered for alg algorithms.
  2026-10-23 14:19:45,540 DEBUG [org.jos.jwa.AlgorithmFactory->JsonWebSignatureAlgorithm] (main) org.jose4j.jws.RsaUsingShaAlgorithm$RsaSha256(RS256|SHA256withRSA) registered for alg algorithm RS256
  2026-10-23 14:19:45,540 DEBUG [org.jos.jwa.AlgorithmFactory->JsonWebSignatureAlgorithm] (main) org.jose4j.jws.RsaUsingShaAlgorithm$RsaSha384(RS384|SHA384withRSA) registered for alg algorithm RS384
  2026-10-23 14:19:45,540 DEBUG [org.jos.jwa.AlgorithmFactory->JsonWebSignatureAlgorithm] (main) org.jose4j.jws.RsaUsingShaAlgorithm$RsaSha512(RS512|SHA512withRSA) registered for alg algorithm RS512
  2026-10-23 14:19:45,542 DEBUG [org.jos.jwa.AlgorithmFactory->JsonWebSignatureAlgorithm] (main) org.jose4j.jws.RsaUsingShaAlgorithm$RsaPssSha256(PS256|RSASSA-PSS) registered for alg algorithm PS256
  2026-10-23 14:19:45,543 DEBUG [org.jos.jwa.AlgorithmFactory->JsonWebSignatureAlgorithm] (main) org.jose4j.jws.RsaUsingShaAlgorithm$RsaPssSha384(PS384|RSASSA-PSS) registered for alg algorithm PS384
  2026-10-23 14:19:45,544 DEBUG [org.jos.jwa.AlgorithmFactory->JsonWebSignatureAlgorithm] (main) org.jose4j.jws.RsaUsingShaAlgorithm$RsaPssSha512(PS512|RSASSA-PSS) registered for alg algorithm PS512
  2026-10-23 14:19:45,544 DEBUG [org.jos.jwa.AlgorithmFactoryFactory] (main) JWS signature algorithms: [none, HS256, HS384, HS512, EdDSA, ES256, ES384, ES512, RS256, RS384, RS512, PS256, PS384, PS512]
  2026-10-23 14:19:45,547 DEBUG [org.jos.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.RsaKeyManagementAlgorithm$Rsa1_5(RSA1_5|RSA/ECB/PKCS1Padding) registered for alg algorithm RSA1_5
  2026-10-23 14:19:45,547 DEBUG [org.jos.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.RsaKeyManagementAlgorithm$RsaOaep(RSA-OAEP|RSA/ECB/OAEPWithSHA-1AndMGF1Padding) registered for alg algorithm RSA-OAEP
  2026-10-23 14:19:45,631 DEBUG [org.jos.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.RsaKeyManagementAlgorithm$RsaOaep256(RSA-OAEP-256|RSA/ECB/OAEPWithSHA-256AndMGF1Padding) registered for alg algorithm RSA-OAEP-256
  2026-10-23 14:19:45,631 DEBUG [org.jos.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.DirectKeyManagementAlgorithm(dir|null) registered for alg algorithm dir
  2026-10-23 14:19:45,634 DEBUG [org.jos.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.AesKeyWrapManagementAlgorithm$Aes128(A128KW|AESWrap) registered for alg algorithm A128KW
  2026-10-23 14:19:45,634 DEBUG [org.jos.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.AesKeyWrapManagementAlgorithm$Aes192(A192KW|AESWrap) registered for alg algorithm A192KW
  2026-10-23 14:19:45,634 DEBUG [org.jos.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.AesKeyWrapManagementAlgorithm$Aes256(A256KW|AESWrap) registered for alg algorithm A256KW
  2026-10-23 14:19:45,640 DEBUG [org.jos.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.EcdhKeyAgreementAlgorithm(ECDH-ES|ECDH) registered for alg algorithm ECDH-ES
  2026-10-23 14:19:45,641 DEBUG [org.jos.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.EcdhKeyAgreementWithAesKeyWrapAlgorithm$EcdhKeyAgreementWithAes128KeyWrapAlgorithm(ECDH-ES+A128KW|N/A) registered for alg algorithm ECDH-ES+A128KW
  2026-10-23 14:19:45,642 DEBUG [org.jos.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.EcdhKeyAgreementWithAesKeyWrapAlgorithm$EcdhKeyAgreementWithAes192KeyWrapAlgorithm(ECDH-ES+A192KW|N/A) registered for alg algorithm ECDH-ES+A192KW
  2026-10-23 14:19:45,643 DEBUG [org.jos.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.EcdhKeyAgreementWithAesKeyWrapAlgorithm$EcdhKeyAgreementWithAes256KeyWrapAlgorithm(ECDH-ES+A256KW|N/A) registered for alg algorithm ECDH-ES+A256KW
  2026-10-23 14:19:45,644 DEBUG [org.jos.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.Pbes2HmacShaWithAesKeyWrapAlgorithm$HmacSha256Aes128(PBES2-HS256+A128KW|n/a) registered for alg algorithm PBES2-HS256+A128KW
  2026-10-23 14:19:45,644 DEBUG [org.jos.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.Pbes2HmacShaWithAesKeyWrapAlgorithm$HmacSha384Aes192(PBES2-HS384+A192KW|n/a) registered for alg algorithm PBES2-HS384+A192KW
  2026-10-23 14:19:45,644 DEBUG [org.jos.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.Pbes2HmacShaWithAesKeyWrapAlgorithm$HmacSha512Aes256(PBES2-HS512+A256KW|n/a) registered for alg algorithm PBES2-HS512+A256KW
  2026-10-23 14:19:45,646 DEBUG [org.jos.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.AesGcmKeyEncryptionAlgorithm$Aes128Gcm(A128GCMKW|AES/GCM/NoPadding) registered for alg algorithm A128GCMKW
  2026-10-23 14:19:45,647 DEBUG [org.jos.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.AesGcmKeyEncryptionAlgorithm$Aes192Gcm(A192GCMKW|AES/GCM/NoPadding) registered for alg algorithm A192GCMKW
  2026-10-23 14:19:45,647 DEBUG [org.jos.jwa.AlgorithmFactory->KeyManagementAlgorithm] (main) org.jose4j.jwe.AesGcmKeyEncryptionAlgorithm$Aes256Gcm(A256GCMKW|AES/GCM/NoPadding) registered for alg algorithm A256GCMKW
  2026-10-23 14:19:45,647 DEBUG [org.jos.jwa.AlgorithmFactoryFactory] (main) JWE key management algorithms: [RSA1_5, RSA-OAEP, RSA-OAEP-256, dir, A128KW, A192KW, A256KW, ECDH-ES, ECDH-ES+A128KW, ECDH-ES+A192KW, ECDH-ES+A256KW, PBES2-HS256+A128KW, PBES2-HS384+A192KW, PBES2-HS512+A256KW, A128GCMKW, A192GCMKW, A256GCMKW]
  2026-10-23 14:19:45,647 DEBUG [org.jos.jwa.AlgorithmFactory->ContentEncryptionAlgorithm] (main) org.jose4j.jwe.AesCbcHmacSha2ContentEncryptionAlgorithm$Aes128CbcHmacSha256(A128CBC-HS256|AES/CBC/PKCS5Padding) registered for enc algorithm A128CBC-HS256
  2026-10-23 14:19:45,648 DEBUG [org.jos.jwa.AlgorithmFactory->ContentEncryptionAlgorithm] (main) org.jose4j.jwe.AesCbcHmacSha2ContentEncryptionAlgorithm$Aes192CbcHmacSha384(A192CBC-HS384|AES/CBC/PKCS5Padding) registered for enc algorithm A192CBC-HS384
  2026-10-23 14:19:45,648 DEBUG [org.jos.jwa.AlgorithmFactory->ContentEncryptionAlgorithm] (main) org.jose4j.jwe.AesCbcHmacSha2ContentEncryptionAlgorithm$Aes256CbcHmacSha512(A256CBC-HS512|AES/CBC/PKCS5Padding) registered for enc algorithm A256CBC-HS512
  2026-10-23 14:19:45,648 DEBUG [org.jos.jwa.AlgorithmFactory->ContentEncryptionAlgorithm] (main) org.jose4j.jwe.AesGcmContentEncryptionAlgorithm$Aes128Gcm(A128GCM|AES/GCM/NoPadding) registered for enc algorithm A128GCM
  2026-10-23 14:19:45,649 DEBUG [org.jos.jwa.AlgorithmFactory->ContentEncryptionAlgorithm] (main) org.jose4j.jwe.AesGcmContentEncryptionAlgorithm$Aes192Gcm(A192GCM|AES/GCM/NoPadding) registered for enc algorithm A192GCM
  2026-10-23 14:19:45,649 DEBUG [org.jos.jwa.AlgorithmFactory->ContentEncryptionAlgorithm] (main) org.jose4j.jwe.AesGcmContentEncryptionAlgorithm$Aes256Gcm(A256GCM|AES/GCM/NoPadding) registered for enc algorithm A256GCM
  2026-10-23 14:19:45,650 DEBUG [org.jos.jwa.AlgorithmFactoryFactory] (main) JWE content encryption algorithms: [A128CBC-HS256, A192CBC-HS384, A256CBC-HS512, A128GCM, A192GCM, A256GCM]
  2026-10-23 14:19:45,650 DEBUG [org.jos.zip.DeflateRFC1951CompressionAlgorithm] (main)
  2026-10-23 14:19:45,650 DEBUG [org.jos.jwa.AlgorithmFactory->CompressionAlgorithm] (main) org.jose4j.zip.DeflateRFC1951CompressionAlgorithm@2118cddf registered for zip algorithm DEF
  2026-10-23 14:19:45,650 DEBUG [org.jos.jwa.AlgorithmFactoryFactory] (main) JWE compression algorithms: [DEF]
  2026-10-23 14:19:45,650 DEBUG [org.jos.jwa.AlgorithmFactoryFactory] (main) Initialized jose4j in 208ms
  2026-10-23 14:19:46,033 DEBUG [io.qua.arc.impl] (main) ArC DI container initialized [beans=168, observers=6]
  2026-10-23 14:19:46,039 DEBUG [org.hib.val.int.uti.Version] (main) HV000001: Hibernate Validator 8.0.2.Final
  2026-10-23 14:19:46,041 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) Setting custom LocaleResolver of type io.quarkus.hibernate.validator.runtime.locale.LocaleResolversWrapper
  2026-10-23 14:19:46,043 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) Setting custom BeanMetaDataClassNormalizer of type io.quarkus.hibernate.validator.runtime.ArcProxyBeanMetaDataClassNormalizer
  2026-10-23 14:19:46,047 DEBUG [io.qua.arc.impl] (main) Loaded 67 removed beans lazily
  2026-10-23 14:19:46,047 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) Setting custom ConstraintValidatorFactory of type io.quarkus.hibernate.validator.runtime.ArcConstraintValidatorFactoryImpl
  2026-10-23 14:19:46,047 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) Setting custom TraversableResolver of type io.quarkus.hibernate.validator.runtime.TraverseAllTraversableResolver
  2026-10-23 14:19:46,048 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) Setting custom ClockProvider of type io.quarkus.hibernate.validator.runtime.clockprovider.RuntimeReinitializedDefaultClockProvider
  2026-10-23 14:19:46,049 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) HV000002: Ignoring XML configuration.
  2026-10-23 14:19:46,057 DEBUG [org.hib.val.res.PlatformResourceBundleLocator] (main) ValidationMessages not found.
  2026-10-23 14:19:46,128 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000255: Using io.quarkus.hibernate.validator.runtime.locale.LocaleResolversWrapper as locale resolver.
  2026-10-23 14:19:46,129 DEBUG [org.hib.val.res.PlatformResourceBundleLocator] (main) ContributorValidationMessages not found.
  2026-10-23 14:19:46,131 DEBUG [org.hib.val.res.PlatformResourceBundleLocator] (main) org.hibernate.validator.ValidationMessages found.
  2026-10-23 14:19:46,137 DEBUG [org.hib.val.mes.ResourceBundleMessageInterpolator] (main) Loaded expression factory via original TCCL
  2026-10-23 14:19:46,139 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000252: Using org.hibernate.validator.internal.engine.DefaultPropertyNodeNameProvider as property node name provider.
  2026-10-23 14:19:46,233 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000234: Using org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator as ValidatorFactory-scoped message interpolator.
  2026-10-23 14:19:46,233 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000234: Using io.quarkus.hibernate.validator.runtime.TraverseAllTraversableResolver as ValidatorFactory-scoped traversable resolver.
  2026-10-23 14:19:46,233 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000234: Using org.hibernate.validator.internal.util.ExecutableParameterNameProvider as ValidatorFactory-scoped parameter name provider.
  2026-10-23 14:19:46,233 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000234: Using io.quarkus.hibernate.validator.runtime.clockprovider.RuntimeReinitializedDefaultClockProvider as ValidatorFactory-scoped clock provider.
  2026-10-23 14:19:46,233 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000234: Using org.hibernate.validator.internal.engine.scripting.DefaultScriptEvaluatorFactory as ValidatorFactory-scoped script evaluator factory.
  2026-10-23 14:19:46,235 DEBUG [io.qua.arc.run.ArcRecorder] (main) Bean container listener io.quarkus.hibernate.validator.runtime.HibernateValidatorRecorder$2 finished in 202 ms
  2026-10-23 14:19:46,241 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.common.runtime.serialisers.vertx.VertxJsonArrayBasicMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,242 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.common.runtime.serialisers.vertx.VertxJsonObjectBasicMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,242 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.common.runtime.serialisers.vertx.VertxJsonArrayBasicMessageBodyReader and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,243 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.common.runtime.serialisers.vertx.VertxJsonObjectBasicMessageBodyReader and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,258 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.vertx.serializers.ServerVertxBufferMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,259 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.vertx.serializers.ServerMutinyBufferMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,259 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.vertx.serializers.ServerVertxAsyncFileMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,260 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.vertx.serializers.ServerMutinyAsyncFileMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,261 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonArrayMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,261 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonObjectMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,261 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.server.runtime.QuarkusServerPathBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,261 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonArrayMessageBodyReader and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,261 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonObjectMessageBodyReader and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,262 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,262 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,262 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,262 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,262 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,262 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerCharArrayMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,262 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerByteArrayMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,262 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerFormUrlEncodedProvider and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,262 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerInputStreamMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,262 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.StreamingOutputMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,262 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerReaderBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,262 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerFileBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,262 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerFilePartBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,262 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.core.multipart.MultipartMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,262 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerPathBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,262 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerPathPartBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,262 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,262 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerBooleanMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,262 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerCharacterMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,262 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerNumberMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,263 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerInputStreamMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,263 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerReaderBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,263 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.server.runtime.QuarkusServerFileBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,263 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerByteArrayMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,263 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerDefaultTextPlainBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,264 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.server.runtime.exceptionmappers.ForbiddenExceptionMapper and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,264 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.server.runtime.exceptionmappers.AuthenticationRedirectExceptionMapper and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,264 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.server.runtime.exceptionmappers.AuthenticationCompletionExceptionMapper and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,264 DEBUG [io.qua.arc.run.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.rest.runtime.__QuarkusInit and qualifiers []. The bean might have been marked as unused and removed during build.
  2026-10-23 14:19:46,436 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource BuildTime RunTime Fixed with ordinal 2147483647
  2026-10-23 14:19:46,436 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource SysPropConfigSource with ordinal 400
  2026-10-23 14:19:46,436 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource EnvConfigSource with ordinal 300
  2026-10-23 14:19:46,436 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource PropertiesConfigSource[source=jar:file:///opt/deploy/app/api-plataforma-geracao-relatorios-1.0.0.jar!/application.properties] with ordinal 250
  2026-10-23 14:19:46,436 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource QuarkusUUIDConfigSource with ordinal -2147483648
  2026-10-23 14:19:46,436 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource DefaultValuesConfigSource with ordinal -2147483648
  2026-10-23 14:19:46,937 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.otel.logs.level" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
  2026-10-23 14:19:46,940 DEBUG [io.net.uti.int.log.InternalLoggerFactory] (Thread-1) Using SLF4J as the default logging framework
  2026-10-23 14:19:47,036 DEBUG [io.net.uti.int.PlatformDependent0] (Thread-1) -Dio.netty.noUnsafe: false
  2026-10-23 14:19:47,036 DEBUG [io.net.uti.int.PlatformDependent0] (Thread-1) Java version: 21
  2026-10-23 14:19:47,037 DEBUG [io.net.uti.int.PlatformDependent0] (Thread-1) java.nio.Buffer.address: available
  2026-10-23 14:19:47,038 DEBUG [io.net.uti.int.PlatformDependent0] (Thread-1) java.nio.Bits.unaligned: available, true
  2026-10-23 14:19:47,038 DEBUG [io.net.uti.int.PlatformDependent0] (Thread-1) java.nio.DirectByteBuffer.<init>(long, {int,long}): unavailable
  2026-10-23 14:19:47,038 DEBUG [io.net.uti.int.PlatformDependent] (Thread-1) sun.misc.Unsafe: available
  2026-10-23 14:19:47,038 DEBUG [io.net.uti.int.PlatformDependent] (Thread-1) -Dio.netty.tmpdir: /tmp (java.io.tmpdir)
  2026-10-23 14:19:47,038 DEBUG [io.net.uti.int.PlatformDependent] (Thread-1) -Dio.netty.bitMode: 64 (sun.arch.data.model)
  2026-10-23 14:19:47,039 DEBUG [io.net.uti.int.PlatformDependent] (Thread-1) -Dio.netty.maxDirectMemory: -1 bytes
  2026-10-23 14:19:47,039 DEBUG [io.net.uti.int.PlatformDependent] (Thread-1) -Dio.netty.uninitializedArrayAllocationThreshold: -1
  2026-10-23 14:19:47,040 DEBUG [io.net.uti.int.CleanerJava9] (Thread-1) java.nio.ByteBuffer.cleaner(): available
  2026-10-23 14:19:47,040 DEBUG [io.net.uti.int.PlatformDependent] (Thread-1) -Dio.netty.noPreferDirect: false
  2026-10-23 14:19:47,042 DEBUG [io.net.cha.DefaultChannelId] (Thread-1) -Dio.netty.processId: 1 (auto-detected)
  2026-10-23 14:19:47,130 DEBUG [io.net.cha.DefaultChannelId] (Thread-1) -Dio.netty.machineId: ce:5e:18:63:9f:68:4e:70 (user-set)
  2026-10-23 14:19:47,142 DEBUG [io.ver.cor.log.LoggerFactory] (main) Using io.quarkus.vertx.core.runtime.VertxLogDelegateFactory
  2026-10-23 14:19:47,144 DEBUG [io.qua.ver.cor.run.VertxCoreRecorder] (main) Vert.x Cache configured to: /tmp/vertx-cache/9143637131368425035
  2026-10-23 14:19:47,154 DEBUG [io.net.uti.ResourceLeakDetector] (main) -Dio.netty.leakDetection.level: simple
  2026-10-23 14:19:47,154 DEBUG [io.net.uti.ResourceLeakDetector] (main) -Dio.netty.leakDetection.targetRecords: 4
  2026-10-23 14:19:47,234 DEBUG [io.net.cha.MultithreadEventLoopGroup] (main) -Dio.netty.eventLoopThreads: 2
  2026-10-23 14:19:47,240 DEBUG [io.net.uti.con.GlobalEventExecutor] (main) -Dio.netty.globalEventExecutor.quietPeriodSeconds: 1
  2026-10-23 14:19:47,242 DEBUG [io.net.uti.int.InternalThreadLocalMap] (main) -Dio.netty.threadLocalMap.stringBuilder.initialSize: 1024
  2026-10-23 14:19:47,242 DEBUG [io.net.uti.int.InternalThreadLocalMap] (main) -Dio.netty.threadLocalMap.stringBuilder.maxSize: 4096
  2026-10-23 14:19:47,245 DEBUG [io.net.cha.nio.NioEventLoop] (main) -Dio.netty.noKeySetOptimization: false
  2026-10-23 14:19:47,245 DEBUG [io.net.cha.nio.NioEventLoop] (main) -Dio.netty.selectorAutoRebuildThreshold: 512
  2026-10-23 14:19:47,247 DEBUG [io.net.uti.int.PlatformDependent] (main) org.jctools-core.MpscChunkedArrayQueue: available
  2026-10-23 14:19:47,256 DEBUG [io.qua.ver.cor.run.VertxCoreRecorder] (main) Vertx has Native Transport Enabled: false
  2026-10-23 14:19:47,345 FINE  [jak.jso.spi.JsonProvider] (main) Checking system property jakarta.json.provider
  2026-10-23 14:19:47,345 FINE  [jak.jso.spi.JsonProvider] (main) Checking ServiceLoader
  2026-10-23 14:19:47,347 FINE  [jak.jso.spi.JsonProvider] (main) ServiceLoader loading Facility used; returning object [org.eclipse.parsson.JsonProviderImpl]
  2026-10-23 14:19:47,351 FINE  [jak.jso.spi.JsonProvider] (main) Checking system property jakarta.json.provider
  2026-10-23 14:19:47,351 FINE  [jak.jso.spi.JsonProvider] (main) Checking ServiceLoader
  2026-10-23 14:19:47,352 FINE  [jak.jso.spi.JsonProvider] (main) ServiceLoader loading Facility used; returning object [org.eclipse.parsson.JsonProviderImpl]
  2026-10-23 14:19:47,355 DEBUG [io.qua.oid.cli.run.OidcClientRecorder] (main) Either 'quarkus.oidc-client.auth-server-url' or absolute 'quarkus.oidc-client.token-path' URL must be set
  2026-10-23 14:19:47,659 DEBUG [io.net.uti.NetUtil] (main) -Djava.net.preferIPv4Stack: false
  2026-10-23 14:19:47,659 DEBUG [io.net.uti.NetUtil] (main) -Djava.net.preferIPv6Addresses: false
  2026-10-23 14:19:47,660 DEBUG [io.net.uti.NetUtilInitializations] (main) Loopback interface: lo (lo, 0:0:0:0:0:0:0:1%lo)
  2026-10-23 14:19:47,660 DEBUG [io.net.uti.NetUtil] (main) /proc/sys/net/core/somaxconn: 4096
  2026-10-23 14:19:47,852 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.numHeapArenas: 2
  2026-10-23 14:19:47,852 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.numDirectArenas: 2
  2026-10-23 14:19:47,852 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.pageSize: 8192
  2026-10-23 14:19:47,852 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.maxOrder: 3
  2026-10-23 14:19:47,852 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.chunkSize: 65536
  2026-10-23 14:19:47,852 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.smallCacheSize: 256
  2026-10-23 14:19:47,852 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.normalCacheSize: 64
  2026-10-23 14:19:47,852 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.maxCachedBufferCapacity: 32768
  2026-10-23 14:19:47,852 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.cacheTrimInterval: 8192
  2026-10-23 14:19:47,852 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.cacheTrimIntervalMillis: 0
  2026-10-23 14:19:47,852 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.useCacheForAllThreads: false
  2026-10-23 14:19:47,852 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.maxCachedByteBuffersPerChunk: 1023
  2026-10-23 14:19:47,852 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.disableCacheFinalizersForFastThreadLocalThreads: true
  2026-10-23 14:19:47,932 DEBUG [io.net.buf.ByteBufUtil] (vert.x-eventloop-thread-1) -Dio.netty.allocator.type: pooled
  2026-10-23 14:19:47,932 DEBUG [io.net.buf.ByteBufUtil] (vert.x-eventloop-thread-1) -Dio.netty.threadLocalDirectBufferSize: 0
  2026-10-23 14:19:47,932 DEBUG [io.net.buf.ByteBufUtil] (vert.x-eventloop-thread-1) -Dio.netty.maxThreadLocalCharBufferSize: 16384
  2026-10-23 14:19:47,936 DEBUG [io.net.boo.ChannelInitializerExtensions] (vert.x-eventloop-thread-1) -Dio.netty.bootstrap.extensions: null
  2026-10-23 14:19:48,046 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:01, Subject:CN=TWCA Root Certification Authority, OU=Root CA, O=TAIWAN-CA, C=TW, Issuer:CN=TWCA Root Certification Authority, OU=Root CA, O=TAIWAN-CA, C=TW, Key type:RSA, Length:2048, Cert Id:2652873033, Valid from:8/28/08, 7:24 AM, Valid until:12/31/30, 3:59 PM
  2026-10-23 14:19:48,046 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:62:f6:32:6c:e5:c4:e3:68:5c:1b:62:dd:9c:2e:9d:95, Subject:CN=AC RAIZ FNMT-RCM SERVIDORES SEGUROS, OID.2.5.4.97=VATES-Q2826004J, OU=Ceres, O=FNMT-RCM, C=ES, Issuer:CN=AC RAIZ FNMT-RCM SERVIDORES SEGUROS, OID.2.5.4.97=VATES-Q2826004J, OU=Ceres, O=FNMT-RCM, C=ES, Key type:EC, Length:384, Cert Id:246315697, Valid from:12/20/18, 9:37 AM, Valid until:12/20/43, 9:37 AM
  2026-10-23 14:19:48,047 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:0d:d3:e3:bc:6c:f9:6b:b1, Subject:CN=ANF Secure Server Root CA, OU=ANF CA Raiz, O=ANF Autoridad de Certificacion, C=ES, SERIALNUMBER=G63287510, Issuer:CN=ANF Secure Server Root CA, OU=ANF CA Raiz, O=ANF Autoridad de Certificacion, C=ES, SERIALNUMBER=G63287510, Key type:RSA, Length:4096, Cert Id:3453317601, Valid from:9/4/19, 10:00 AM, Valid until:8/30/39, 10:00 AM
  2026-10-23 14:19:48,047 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:05:55:56:bc:f2:5e:a4:35:35:c3:a4:0f:d5:ab:45:72, Subject:CN=DigiCert Global Root G3, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root G3, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:EC, Length:384, Cert Id:3498998753, Valid from:8/1/13, 12:00 PM, Valid until:1/15/38, 12:00 PM
  2026-10-23 14:19:48,047 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:5c:8b:99:c5:5a:94:c5:d2:71:56:de:cd:89:80:cc:26, Subject:CN=USERTrust ECC Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Issuer:CN=USERTrust ECC Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:EC, Length:384, Cert Id:3329287386, Valid from:2/1/10, 12:00 AM, Valid until:1/18/38, 11:59 PM
  2026-10-23 14:19:48,048 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:0a:01:42:80:00:00:01:45:23:c8:44:b5:00:00:00:02, Subject:CN=IdenTrust Commercial Root CA 1, O=IdenTrust, C=US, Issuer:CN=IdenTrust Commercial Root CA 1, O=IdenTrust, C=US, Key type:RSA, Length:4096, Cert Id:1232565210, Valid from:1/16/14, 6:12 PM, Valid until:1/16/34, 6:12 PM
  2026-10-23 14:19:48,048 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:4f:23:64:b8:8e:97:63:9e:c6:53:81:c1:76:4e:cb:2a:74:15:d6:d7, Subject:CN=TrustAsia Global Root CA G4, O="TrustAsia Technologies, Inc.", C=CN, Issuer:CN=TrustAsia Global Root CA G4, O="TrustAsia Technologies, Inc.", C=CN, Key type:EC, Length:384, Cert Id:3167719659, Valid from:5/20/21, 2:10 AM, Valid until:5/19/46, 2:10 AM
  2026-10-23 14:19:48,048 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:39:ca:93:1c:ef:43:f3:c6:8e:93:c7:f4:64:89:38:7e, Subject:CN=HARICA TLS RSA Root CA 2021, O=Hellenic Academic and Research Institutions CA, C=GR, Issuer:CN=HARICA TLS RSA Root CA 2021, O=Hellenic Academic and Research Institutions CA, C=GR, Key type:RSA, Length:4096, Cert Id:1709624614, Valid from:2/19/21, 10:55 AM, Valid until:2/13/45, 10:55 AM
  2026-10-23 14:19:48,048 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:5d:df:b1:da:5a:a3:ed:5d:be:5a:65:20:65:03:90:ef, Subject:CN=UCA Global G2 Root, O=UniTrust, C=CN, Issuer:CN=UCA Global G2 Root, O=UniTrust, C=CN, Key type:RSA, Length:4096, Cert Id:1844967193, Valid from:3/11/16, 12:00 AM, Valid until:12/31/40, 12:00 AM
  2026-10-23 14:19:48,049 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:41:d2:9d:d1:72:ea:ee:a7:80:c1:2c:6c:e9:2f:87:52, Subject:CN=ISRG Root X2, O=Internet Security Research Group, C=US, Issuer:CN=ISRG Root X2, O=Internet Security Research Group, C=US, Key type:EC, Length:384, Cert Id:3398642244, Valid from:9/4/20, 12:00 AM, Valid until:9/17/40, 4:00 PM
  2026-10-23 14:19:48,049 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:66:f2:3d:af:87:de:8b:b1:4a:ea:0c:57:31:01:c2:ec, Subject:CN=Microsoft ECC Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft ECC Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Key type:EC, Length:384, Cert Id:3240761285, Valid from:12/18/19, 11:06 PM, Valid until:7/18/42, 11:16 PM
  2026-10-23 14:19:48,049 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:5d:93:8d:30:67:36:c8:06:1d:1a:c7:54:84:69:07, Subject:OU=AC RAIZ FNMT-RCM, O=FNMT-RCM, C=ES, Issuer:OU=AC RAIZ FNMT-RCM, O=FNMT-RCM, C=ES, Key type:RSA, Length:4096, Cert Id:1555523573, Valid from:10/29/08, 3:59 PM, Valid until:1/1/30, 12:00 AM
  2026-10-23 14:19:48,050 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:5f:02:41:d7:7a:87:7c:4c:03:a3:ac:96:8d:fb:ff:d0, Subject:CN=D-TRUST EV Root CA 1 2020, O=D-Trust GmbH, C=DE, Issuer:CN=D-TRUST EV Root CA 1 2020, O=D-Trust GmbH, C=DE, Key type:EC, Length:384, Cert Id:238735896, Valid from:2/11/20, 10:00 AM, Valid until:2/11/35, 9:59 AM
  2026-10-23 14:19:48,051 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:00, Subject:CN=Hellenic Academic and Research Institutions RootCA 2015, O=Hellenic Academic and Research Institutions Cert. Authority, L=Athens, C=GR, Issuer:CN=Hellenic Academic and Research Institutions RootCA 2015, O=Hellenic Academic and Research Institutions Cert. Authority, L=Athens, C=GR, Key type:RSA, Length:4096, Cert Id:3491990565, Valid from:7/7/15, 10:11 AM, Valid until:6/30/40, 10:11 AM
  2026-10-23 14:19:48,051 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:08:f9:b4:78:a8:fa:7e:da:6a:33:37:89:de:7c:cf:8a, Subject:CN=DigiCert TLS RSA4096 Root G5, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert TLS RSA4096 Root G5, O="DigiCert, Inc.", C=US, Key type:RSA, Length:4096, Cert Id:165956757, Valid from:1/15/21, 12:00 AM, Valid until:1/14/46, 11:59 PM
  2026-10-23 14:19:48,128 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:4f:d2:2b:8f:f5:64:c8:33:9e:4f:34:58:66:23:70:60, Subject:CN=UCA Extended Validation Root, O=UniTrust, C=CN, Issuer:CN=UCA Extended Validation Root, O=UniTrust, C=CN, Key type:RSA, Length:4096, Cert Id:649181271, Valid from:3/13/15, 12:00 AM, Valid until:12/31/38, 12:00 AM
  2026-10-23 14:19:48,129 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:1e:d3:97:09:5f:d8:b4:b3:47:70:1e:aa:be:7f:45:b3, Subject:CN=Microsoft RSA Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft RSA Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:2848349048, Valid from:12/18/19, 10:51 PM, Valid until:7/18/42, 11:00 PM
  2026-10-23 14:19:48,129 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:14:03:f5:ab:fb:37:8b:17:40:5b:e2:43:b2:a5:d1:c4, Subject:CN=SSL.com TLS ECC Root CA 2022, O=SSL Corporation, C=US, Issuer:CN=SSL.com TLS ECC Root CA 2022, O=SSL Corporation, C=US, Key type:EC, Length:384, Cert Id:683561703, Valid from:8/25/22, 4:33 PM, Valid until:8/19/46, 4:33 PM
  2026-10-23 14:19:48,129 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:06:6c:9f:d2:96:35:86:9f:0a:0f:e5:86:78:f8:5b:26:bb:8a:37, Subject:CN=Amazon Root CA 2, O=Amazon, C=US, Issuer:CN=Amazon Root CA 2, O=Amazon, C=US, Key type:RSA, Length:4096, Cert Id:2528834908, Valid from:5/26/15, 12:00 AM, Valid until:5/26/40, 12:00 AM
  2026-10-23 14:19:48,129 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:21:2a:56:0c:ae:da:0c:ab:40:45:bf:2b:a2:2d:3a:ea, Subject:CN=OISTE WISeKey Global Root GC CA, OU=OISTE Foundation Endorsed, O=WISeKey, C=CH, Issuer:CN=OISTE WISeKey Global Root GC CA, OU=OISTE Foundation Endorsed, O=WISeKey, C=CH, Key type:EC, Length:384, Cert Id:2781801839, Valid from:5/9/17, 9:48 AM, Valid until:5/9/42, 9:58 AM
  2026-10-23 14:19:48,130 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:55:a5:d9:67:94:28:c6:ed:0c:fa:27:dd:5b:01:4d:18, Subject:CN=OISTE Server Root RSA G1, O=OISTE Foundation, C=CH, Issuer:CN=OISTE Server Root RSA G1, O=OISTE Foundation, C=CH, Key type:RSA, Length:4096, Cert Id:1583668620, Valid from:5/31/23, 2:37 PM, Valid until:5/24/48, 2:37 PM
  2026-10-23 14:19:48,130 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:06:6c:9f:d7:c1:bb:10:4c:29:43:e5:71:7b:7b:2c:c8:1a:c1:0e, Subject:CN=Amazon Root CA 4, O=Amazon, C=US, Issuer:CN=Amazon Root CA 4, O=Amazon, C=US, Key type:EC, Length:384, Cert Id:2640694783, Valid from:5/26/15, 12:00 AM, Valid until:5/26/40, 12:00 AM
  2026-10-23 14:19:48,130 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:5c:33:cb:62:2c:5f:b3:32, Subject:C=DE, O=Atos, CN=Atos TrustedRoot 2011, Issuer:C=DE, O=Atos, CN=Atos TrustedRoot 2011, Key type:RSA, Length:2048, Cert Id:4266438672, Valid from:7/7/11, 2:58 PM, Valid until:12/31/30, 11:59 PM
  2026-10-23 14:19:48,130 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:7b:2c:9b:d3:16:80:32:99, Subject:CN=SSL.com Root Certification Authority RSA, O=SSL Corporation, L=Houston, ST=Texas, C=US, Issuer:CN=SSL.com Root Certification Authority RSA, O=SSL Corporation, L=Houston, ST=Texas, C=US, Key type:RSA, Length:4096, Cert Id:156725711, Valid from:2/12/16, 5:39 PM, Valid until:2/12/41, 5:39 PM
  2026-10-23 14:19:48,131 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:36:74:e1:4d:7c:65:13:c9:ac:83:55:25:a0:3e:52:7e:2f:50:68:c7, Subject:CN=TrustAsia TLS ECC Root CA, O="TrustAsia Technologies, Inc.", C=CN, Issuer:CN=TrustAsia TLS ECC Root CA, O="TrustAsia Technologies, Inc.", C=CN, Key type:EC, Length:384, Cert Id:3267627789, Valid from:5/15/24, 5:41 AM, Valid until:5/15/44, 5:41 AM
  2026-10-23 14:19:48,131 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:13:02:d5:e2:40:4c:92:46:86:16:67:5d:b4:bb:bb:b2:6b:3e:fc:13, Subject:CN=TunTrust Root CA, O=Agence Nationale de Certification Electronique, C=TN, Issuer:CN=TunTrust Root CA, O=Agence Nationale de Certification Electronique, C=TN, Key type:RSA, Length:4096, Cert Id:1973181427, Valid from:4/26/19, 8:57 AM, Valid until:4/26/44, 8:57 AM
  2026-10-23 14:19:48,131 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withECDSA, Serial:2c:29:9c:5b:16:ed:05:95, Subject:CN=SSL.com EV Root Certification Authority ECC, O=SSL Corporation, L=Houston, ST=Texas, C=US, Issuer:CN=SSL.com EV Root Certification Authority ECC, O=SSL Corporation, L=Houston, ST=Texas, C=US, Key type:EC, Length:384, Cert Id:1789254518, Valid from:2/12/16, 6:15 PM, Valid until:2/12/41, 6:15 PM
  2026-10-23 14:19:48,131 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:06:25:33:b1:47:03:33:27:5c:f9:8d:9a:b9:bf:cc:f8, Subject:CN=Certainly Root E1, O=Certainly, C=US, Issuer:CN=Certainly Root E1, O=Certainly, C=US, Key type:EC, Length:384, Cert Id:792571453, Valid from:4/1/21, 12:00 AM, Valid until:4/1/46, 12:00 AM
  2026-10-23 14:19:48,132 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:00, Subject:CN=Starfield Root Certificate Authority - G2, O="Starfield Technologies, Inc.", L=Scottsdale, ST=Arizona, C=US, Issuer:CN=Starfield Root Certificate Authority - G2, O="Starfield Technologies, Inc.", L=Scottsdale, ST=Arizona, C=US, Key type:RSA, Length:2048, Cert Id:3268325709, Valid from:9/1/09, 12:00 AM, Valid until:12/31/37, 11:59 PM
  2026-10-23 14:19:48,132 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:60:59:49:e0:26:2e:bb:55:f9:0a:77:8a:71:f9:4a:d8:6c, Subject:CN=GlobalSign, O=GlobalSign, OU=GlobalSign ECC Root CA - R5, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign ECC Root CA - R5, Key type:EC, Length:384, Cert Id:1997048439, Valid from:11/13/12, 12:00 AM, Valid until:1/19/38, 3:14 AM
  2026-10-23 14:19:48,132 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withECDSA, Serial:02:03:e5:7e:f5:3f:93:fd:a5:09:21:b2:a6, Subject:CN=GlobalSign, O=GlobalSign, OU=GlobalSign ECC Root CA - R4, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign ECC Root CA - R4, Key type:EC, Length:256, Cert Id:3777996779, Valid from:11/13/12, 12:00 AM, Valid until:1/19/38, 3:14 AM
  2026-10-23 14:19:48,132 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:43:fa:0c:5f:4e:1b:80:18:44:ef:d1:b4:4f:35:1f:44:f4:80:ed:cb, Subject:CN=SwissSign RSA TLS Root CA 2022 - 1, O=SwissSign AG, C=CH, Issuer:CN=SwissSign RSA TLS Root CA 2022 - 1, O=SwissSign AG, C=CH, Key type:RSA, Length:4096, Cert Id:2764753514, Valid from:6/8/22, 11:08 AM, Valid until:6/8/47, 11:08 AM
  2026-10-23 14:19:48,132 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:1e:bf:59:50:b8:c9:80:37:4c:06:f7:eb:55:4f:b5:ed, Subject:CN=Certum Trusted Root CA, OU=Certum Certification Authority, O=Asseco Data Systems S.A., C=PL, Issuer:CN=Certum Trusted Root CA, OU=Certum Certification Authority, O=Asseco Data Systems S.A., C=PL, Key type:RSA, Length:4096, Cert Id:3520640245, Valid from:3/16/18, 12:10 PM, Valid until:3/16/43, 12:10 PM
  2026-10-23 14:19:48,133 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:64:f6:0e:65:77:61:6a:ab:3b:b4:ea:85:84:bb:b1:89:b8:71:93:0f, Subject:CN=TrustAsia Global Root CA G3, O="TrustAsia Technologies, Inc.", C=CN, Issuer:CN=TrustAsia Global Root CA G3, O="TrustAsia Technologies, Inc.", C=CN, Key type:RSA, Length:4096, Cert Id:3528443285, Valid from:5/20/21, 2:10 AM, Valid until:5/19/46, 2:10 AM
  2026-10-23 14:19:48,133 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:49:41:2c:e4:00:10, Subject:CN=NetLock Arany (Class Gold) Főtanúsítvány, OU=Tanúsítványkiadók (Certification Services), O=NetLock Kft., L=Budapest, C=HU, Issuer:CN=NetLock Arany (Class Gold) Főtanúsítvány, OU=Tanúsítványkiadók (Certification Services), O=NetLock Kft., L=Budapest, C=HU, Key type:RSA, Length:2048, Cert Id:58541246, Valid from:12/11/08, 3:08 PM, Valid until:12/6/28, 3:08 PM
  2026-10-23 14:19:48,133 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:64:db:5a:0c:20:4e:e8:d7:29:77:c8:50:27:a2:5a:27:dd:2d:f2:cb, Subject:CN=SecureSign Root CA14, O="Cybertrust Japan Co., Ltd.", C=JP, Issuer:CN=SecureSign Root CA14, O="Cybertrust Japan Co., Ltd.", C=JP, Key type:RSA, Length:4096, Cert Id:3471868125, Valid from:4/8/20, 7:06 AM, Valid until:4/8/45, 7:06 AM
  2026-10-23 14:19:48,134 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:57:0a:11:97:42:c4:e3:cc, Subject:CN=Actalis Authentication Root CA, O=Actalis S.p.A./03358520967, L=Milan, C=IT, Issuer:CN=Actalis Authentication Root CA, O=Actalis S.p.A./03358520967, L=Milan, C=IT, Key type:RSA, Length:4096, Cert Id:1729119956, Valid from:9/22/11, 11:22 AM, Valid until:9/22/30, 11:22 AM
  2026-10-23 14:19:48,134 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:11:00:34:b6:4e:c6:36:2d:36, Subject:OU=certSIGN ROOT CA G2, O=CERTSIGN SA, C=RO, Issuer:OU=certSIGN ROOT CA G2, O=CERTSIGN SA, C=RO, Key type:RSA, Length:4096, Cert Id:2181086866, Valid from:2/6/17, 9:27 AM, Valid until:2/6/42, 9:27 AM
  2026-10-23 14:19:48,134 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:3e:8a:5d:07:ec:55:d2:32:d5:b7:e3:b6:5f:01:eb:2d:dc:e4:d6:e4, Subject:CN=SZAFIR ROOT CA2, O=Krajowa Izba Rozliczeniowa S.A., C=PL, Issuer:CN=SZAFIR ROOT CA2, O=Krajowa Izba Rozliczeniowa S.A., C=PL, Key type:RSA, Length:2048, Cert Id:381279303, Valid from:10/19/15, 7:43 AM, Valid until:10/19/35, 7:43 AM
  2026-10-23 14:19:48,134 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:11:d2:bb:b9:d7:23:18:9e:40:5f:0a:9d:2d:d0:df:25:67:d1, Subject:CN=GlobalSign Root R46, O=GlobalSign nv-sa, C=BE, Issuer:CN=GlobalSign Root R46, O=GlobalSign nv-sa, C=BE, Key type:RSA, Length:4096, Cert Id:1275948927, Valid from:3/20/19, 12:00 AM, Valid until:3/20/46, 12:00 AM
  2026-10-23 14:19:48,134 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:18:4a:cc:d6, Subject:CN=CFCA EV ROOT, O=China Financial Certification Authority, C=CN, Issuer:CN=CFCA EV ROOT, O=China Financial Certification Authority, C=CN, Key type:RSA, Length:4096, Cert Id:551407782, Valid from:8/8/12, 3:07 AM, Valid until:12/31/29, 3:07 AM
  2026-10-23 14:19:48,135 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:7b:71:b6:82:56:b8:12:7c:9c:a8, Subject:CN=emSign ECC Root CA - C3, O=eMudhra Inc, OU=emSign PKI, C=US, Issuer:CN=emSign ECC Root CA - C3, O=eMudhra Inc, OU=emSign PKI, C=US, Key type:EC, Length:384, Cert Id:3346510540, Valid from:2/18/18, 6:30 PM, Valid until:2/18/43, 6:30 PM
  2026-10-23 14:19:48,135 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:3c:f6:07:a9:68:70:0e:da:8b:84, Subject:CN=emSign ECC Root CA - G3, O=eMudhra Technologies Limited, OU=emSign PKI, C=IN, Issuer:CN=emSign ECC Root CA - G3, O=eMudhra Technologies Limited, OU=emSign PKI, C=IN, Key type:EC, Length:384, Cert Id:3832035707, Valid from:2/18/18, 6:30 PM, Valid until:2/18/43, 6:30 PM
  2026-10-23 14:19:48,135 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:3d:98:3b:a6:66:3d:90:63:f7:7e:26:57:38:04:ef:00, Subject:C=DE, O=Atos, CN=Atos TrustedRoot Root CA ECC TLS 2021, Issuer:C=DE, O=Atos, CN=Atos TrustedRoot Root CA ECC TLS 2021, Key type:EC, Length:384, Cert Id:3147217643, Valid from:4/22/21, 9:26 AM, Valid until:4/17/41, 9:26 AM
  2026-10-23 14:19:48,135 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:02, Subject:CN=Buypass Class 3 Root CA, O=Buypass AS-983163327, C=NO, Issuer:CN=Buypass Class 3 Root CA, O=Buypass AS-983163327, C=NO, Key type:RSA, Length:4096, Cert Id:1264269967, Valid from:10/26/10, 8:28 AM, Valid until:10/26/40, 8:28 AM
  2026-10-23 14:19:48,136 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:01, Subject:CN=TUBITAK Kamu SM SSL Kok Sertifikasi - Surum 1, OU=Kamu Sertifikasyon Merkezi - Kamu SM, O=Turkiye Bilimsel ve Teknolojik Arastirma Kurumu - TUBITAK, L=Gebze - Kocaeli, C=TR, Issuer:CN=TUBITAK Kamu SM SSL Kok Sertifikasi - Surum 1, OU=Kamu Sertifikasyon Merkezi - Kamu SM, O=Turkiye Bilimsel ve Teknolojik Arastirma Kurumu - TUBITAK, L=Gebze - Kocaeli, C=TR, Key type:RSA, Length:2048, Cert Id:1093603654, Valid from:11/25/13, 8:25 AM, Valid until:10/25/43, 8:25 AM
  2026-10-23 14:19:48,136 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:78:58:5f:2e:ad:2c:19:4b:e3:37:07:35:34:13:28:b5:96:d4:65:93, Subject:CN=QuoVadis Root CA 1 G3, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 1 G3, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:3532531262, Valid from:1/12/12, 5:27 PM, Valid until:1/12/42, 5:27 PM
  2026-10-23 14:19:48,136 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:02:03:e5:c0:68:ef:63:1a:9c:72:90:50:52, Subject:CN=GTS Root R4, O=Google Trust Services LLC, C=US, Issuer:CN=GTS Root R4, O=Google Trust Services LLC, C=US, Key type:EC, Length:384, Cert Id:1326433111, Valid from:6/22/16, 12:00 AM, Valid until:6/22/36, 12:00 AM
  2026-10-23 14:19:48,136 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withECDSA, Serial:00:e8:6f:18:7b:d6:39:6b:98:4a:49:98:0a, Subject:CN=e-Szigno TLS Root CA 2023, OID.2.5.4.97=VATHU-23584497, O=Microsec Ltd., L=Budapest, C=HU, Issuer:CN=e-Szigno TLS Root CA 2023, OID.2.5.4.97=VATHU-23584497, O=Microsec Ltd., L=Budapest, C=HU, Key type:EC, Length:521, Cert Id:2537772715, Valid from:7/17/23, 2:00 PM, Valid until:7/17/38, 2:00 PM
  2026-10-23 14:19:48,137 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:1c:18:d8:cf:e5:53:3f:22:35:46:53:54:24:3c:6c:47:d1:5c:4a:9c, Subject:CN=TrustAsia TLS RSA Root CA, O="TrustAsia Technologies, Inc.", C=CN, Issuer:CN=TrustAsia TLS RSA Root CA, O="TrustAsia Technologies, Inc.", C=CN, Key type:RSA, Length:4096, Cert Id:375865335, Valid from:5/15/24, 5:41 AM, Valid until:5/15/44, 5:41 AM
  2026-10-23 14:19:48,137 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:78:8f:27:5c:81:12:52:20:a5:04:d0:2d:dd:ba:73:f4, Subject:CN=Certum EC-384 CA, OU=Certum Certification Authority, O=Asseco Data Systems S.A., C=PL, Issuer:CN=Certum EC-384 CA, OU=Certum Certification Authority, O=Asseco Data Systems S.A., C=PL, Key type:EC, Length:384, Cert Id:994586241, Valid from:3/26/18, 7:24 AM, Valid until:3/26/43, 7:24 AM
  2026-10-23 14:19:48,137 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:15:c8:bd:65:47:5c:af:b8:97:00:5e:e4:06:d2:bc:9d, Subject:OU=ePKI Root Certification Authority, O="Chunghwa Telecom Co., Ltd.", C=TW, Issuer:OU=ePKI Root Certification Authority, O="Chunghwa Telecom Co., Ltd.", C=TW, Key type:RSA, Length:4096, Cert Id:3632331159, Valid from:12/20/04, 2:31 AM, Valid until:12/20/34, 2:31 AM
  2026-10-23 14:19:48,137 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:02:03:e5:b8:82:eb:20:f8:25:27:6d:3d:66, Subject:CN=GTS Root R3, O=Google Trust Services LLC, C=US, Issuer:CN=GTS Root R3, O=Google Trust Services LLC, C=US, Key type:EC, Length:384, Cert Id:1163081155, Valid from:6/22/16, 12:00 AM, Valid until:6/22/36, 12:00 AM
  2026-10-23 14:19:48,137 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:01, Subject:CN=T-TeleSec GlobalRoot Class 2, OU=T-Systems Trust Center, O=T-Systems Enterprise Services GmbH, C=DE, Issuer:CN=T-TeleSec GlobalRoot Class 2, OU=T-Systems Trust Center, O=T-Systems Enterprise Services GmbH, C=DE, Key type:RSA, Length:2048, Cert Id:3056503257, Valid from:10/1/08, 10:40 AM, Valid until:10/1/33, 11:59 PM
  2026-10-23 14:19:48,138 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:5e:c3:b7:a6:43:7f:a4:e0, Subject:C=ES, O=ACCV, OU=PKIACCV, CN=ACCVRAIZ1, Issuer:C=ES, O=ACCV, OU=PKIACCV, CN=ACCVRAIZ1, Key type:RSA, Length:4096, Cert Id:3702856060, Valid from:5/5/11, 9:37 AM, Valid until:12/31/30, 9:37 AM
  2026-10-23 14:19:48,139 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:73:3b:30:04:48:5b:d9:4d:78:2e:73:4b:c9:a1:dc:66, Subject:CN=D-TRUST BR Root CA 2 2023, O=D-Trust GmbH, C=DE, Issuer:CN=D-TRUST BR Root CA 2 2023, O=D-Trust GmbH, C=DE, Key type:RSA, Length:4096, Cert Id:2330314016, Valid from:5/9/23, 8:56 AM, Valid until:5/9/38, 8:56 AM
  2026-10-23 14:19:48,139 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:00:d6:5d:9b:b3:78:81:2e:eb, Subject:CN=Security Communication ECC RootCA1, O="SECOM Trust Systems CO.,LTD.", C=JP, Issuer:CN=Security Communication ECC RootCA1, O="SECOM Trust Systems CO.,LTD.", C=JP, Key type:EC, Length:384, Cert Id:2131361491, Valid from:6/16/16, 5:15 AM, Valid until:1/18/38, 5:15 AM
  2026-10-23 14:19:48,139 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:08:16:5f:8a:4c:a5:ec:00:c9:93:40:df:c4:c6:ae:23:b8:1c:5a:a4, Subject:CN=Hongkong Post Root CA 3, O=Hongkong Post, L=Hong Kong, ST=Hong Kong, C=HK, Issuer:CN=Hongkong Post Root CA 3, O=Hongkong Post, L=Hong Kong, ST=Hong Kong, C=HK, Key type:RSA, Length:4096, Cert Id:3393016216, Valid from:6/3/17, 2:29 AM, Valid until:6/3/42, 2:29 AM
  2026-10-23 14:19:48,139 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:6e:6a:bc:59:aa:53:be:98:39:67:a2:d2:6b:a4:3b:e6:6d:1c:d6:da, Subject:CN=vTrus ECC Root CA, O="iTrusChina Co.,Ltd.", C=CN, Issuer:CN=vTrus ECC Root CA, O="iTrusChina Co.,Ltd.", C=CN, Key type:EC, Length:384, Cert Id:268503342, Valid from:7/31/18, 7:26 AM, Valid until:7/31/43, 7:26 AM
  2026-10-23 14:19:48,139 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:0c:be, Subject:CN=TWCA Global Root CA, OU=Root CA, O=TAIWAN-CA, C=TW, Issuer:CN=TWCA Global Root CA, OU=Root CA, O=TAIWAN-CA, C=TW, Key type:RSA, Length:4096, Cert Id:861175838, Valid from:6/27/12, 6:28 AM, Valid until:12/31/30, 3:59 PM
  2026-10-23 14:19:48,139 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:42:f2:cc:da:1b:69:37:44:5f:15:fe:75:28:10:b8:f4, Subject:CN=Sectigo Public Server Authentication Root E46, O=Sectigo Limited, C=GB, Issuer:CN=Sectigo Public Server Authentication Root E46, O=Sectigo Limited, C=GB, Key type:EC, Length:384, Cert Id:3789385269, Valid from:3/22/21, 12:00 AM, Valid until:3/21/46, 11:59 PM
  2026-10-23 14:19:48,140 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:00, Subject:CN=Go Daddy Root Certificate Authority - G2, O="GoDaddy.com, Inc.", L=Scottsdale, ST=Arizona, C=US, Issuer:CN=Go Daddy Root Certificate Authority - G2, O="GoDaddy.com, Inc.", L=Scottsdale, ST=Arizona, C=US, Key type:RSA, Length:2048, Cert Id:439600313, Valid from:9/1/09, 12:00 AM, Valid until:12/31/37, 11:59 PM
  2026-10-23 14:19:48,140 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:00, Subject:OU=Security Communication RootCA2, O="SECOM Trust Systems CO.,LTD.", C=JP, Issuer:OU=Security Communication RootCA2, O="SECOM Trust Systems CO.,LTD.", C=JP, Key type:RSA, Length:2048, Cert Id:1521072570, Valid from:5/29/09, 5:00 AM, Valid until:5/29/29, 5:00 AM
  2026-10-23 14:19:48,140 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:21:9c:54:2d:e8:f6:ec:71:77:fa:4e:e8:c3:70:57:97, Subject:CN=Telekom Security TLS RSA Root 2023, O=Deutsche Telekom Security GmbH, C=DE, Issuer:CN=Telekom Security TLS RSA Root 2023, O=Deutsche Telekom Security GmbH, C=DE, Key type:RSA, Length:4096, Cert Id:2296218035, Valid from:3/28/23, 12:16 PM, Valid until:3/27/48, 11:59 PM
  2026-10-23 14:19:48,140 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:0b:93:1c:3a:d6:39:67:ea:67:23:bf:c3:af:9a:f4:4b, Subject:CN=DigiCert Assured ID Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Assured ID Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:3909568913, Valid from:8/1/13, 12:00 PM, Valid until:1/15/38, 12:00 PM
  2026-10-23 14:19:48,141 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:00:ca:e9:1b:89:f1:55:03:0d:a3:e6:41:6d:c4:e3:a6:e1, Subject:CN=Certigna Root CA, OU=0002 48146308100036, O=Dhimyotis, C=FR, Issuer:CN=Certigna Root CA, OU=0002 48146308100036, O=Dhimyotis, C=FR, Key type:RSA, Length:4096, Cert Id:356684591, Valid from:10/1/13, 8:32 AM, Valid until:10/1/33, 8:32 AM
  2026-10-23 14:19:48,141 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:09:83:f3, Subject:CN=D-TRUST Root Class 3 CA 2 2009, O=D-Trust GmbH, C=DE, Issuer:CN=D-TRUST Root Class 3 CA 2 2009, O=D-Trust GmbH, C=DE, Key type:RSA, Length:2048, Cert Id:1430153102, Valid from:11/5/09, 8:35 AM, Valid until:11/5/29, 8:35 AM
  2026-10-23 14:19:48,141 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:6f:be:da:ad:73:bd:08:40:e2:8b:4d:be:d4:f7:5b:91, Subject:CN=SSL.com TLS RSA Root CA 2022, O=SSL Corporation, C=US, Issuer:CN=SSL.com TLS RSA Root CA 2022, O=SSL Corporation, C=US, Key type:RSA, Length:4096, Cert Id:556880013, Valid from:8/25/22, 4:34 PM, Valid until:8/19/46, 4:34 PM
  2026-10-23 14:19:48,141 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:01:67:5f:27:d6:fe:7a:e3:e4:ac:be:09:5b:05:9e, Subject:CN=Telia Root CA v2, O=Telia Finland Oyj, C=FI, Issuer:CN=Telia Root CA v2, O=Telia Finland Oyj, C=FI, Key type:RSA, Length:4096, Cert Id:3473063976, Valid from:11/29/18, 11:55 AM, Valid until:11/29/43, 11:55 AM
  2026-10-23 14:19:48,141 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:00:c2:7e:43:04:4e:47:3f:19, Subject:EMAILADDRESS=info@e-szigno.hu, CN=Microsec e-Szigno Root CA 2009, O=Microsec Ltd., L=Budapest, C=HU, Issuer:EMAILADDRESS=info@e-szigno.hu, CN=Microsec e-Szigno Root CA 2009, O=Microsec Ltd., L=Budapest, C=HU, Key type:RSA, Length:2048, Cert Id:2391017284, Valid from:6/16/09, 11:30 AM, Valid until:12/30/29, 11:30 AM
  2026-10-23 14:19:48,141 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:31:f5:e4:62:0c:6c:58:ed:d6:d8, Subject:CN=emSign Root CA - G1, O=eMudhra Technologies Limited, OU=emSign PKI, C=IN, Issuer:CN=emSign Root CA - G1, O=eMudhra Technologies Limited, OU=emSign PKI, C=IN, Key type:RSA, Length:2048, Cert Id:392709196, Valid from:2/18/18, 6:30 PM, Valid until:2/18/43, 6:30 PM
  2026-10-23 14:19:48,141 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:44:57:34:24:5b:81:89:9b:35:f2:ce:b8:2b:3b:5b:a7:26:f0:75:28, Subject:CN=QuoVadis Root CA 2 G3, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 2 G3, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:696763521, Valid from:1/12/12, 6:59 PM, Valid until:1/12/42, 6:59 PM
  2026-10-23 14:19:48,142 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:2c:17:08:7d:64:2a:c0:fe:85:18:59:06:cf:b4:4a:eb, Subject:CN=BJCA Global Root CA2, O=BEIJING CERTIFICATE AUTHORITY, C=CN, Issuer:CN=BJCA Global Root CA2, O=BEIJING CERTIFICATE AUTHORITY, C=CN, Key type:EC, Length:384, Cert Id:1781225575, Valid from:12/19/19, 3:18 AM, Valid until:12/12/44, 3:18 AM
  2026-10-23 14:19:48,142 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:06:6c:9f:cf:99:bf:8c:0a:39:e2:f0:78:8a:43:e6:96:36:5b:ca, Subject:CN=Amazon Root CA 1, O=Amazon, C=US, Issuer:CN=Amazon Root CA 1, O=Amazon, C=US, Key type:RSA, Length:2048, Cert Id:2822522334, Valid from:5/26/15, 12:00 AM, Valid until:1/17/38, 12:00 AM
  2026-10-23 14:19:48,142 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:00, Subject:CN=Starfield Services Root Certificate Authority - G2, O="Starfield Technologies, Inc.", L=Scottsdale, ST=Arizona, C=US, Issuer:CN=Starfield Services Root Certificate Authority - G2, O="Starfield Technologies, Inc.", L=Scottsdale, ST=Arizona, C=US, Key type:RSA, Length:2048, Cert Id:1964785574, Valid from:9/1/09, 12:00 AM, Valid until:12/31/37, 11:59 PM
  2026-10-23 14:19:48,142 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:43:e3:71:13:d8:b3:59:14:5d:b7:ce:8c:fd:35:fd:6f:bc:05:8d:45, Subject:CN=vTrus Root CA, O="iTrusChina Co.,Ltd.", C=CN, Issuer:CN=vTrus Root CA, O="iTrusChina Co.,Ltd.", C=CN, Key type:RSA, Length:4096, Cert Id:2469083546, Valid from:7/31/18, 7:24 AM, Valid until:7/31/43, 7:24 AM
  2026-10-23 14:19:48,142 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:36:3a:96:8c:c9:5c:b2:58:cd:d0:01:5d:c5:e5:57:00, Subject:CN=Telekom Security TLS ECC Root 2020, O=Deutsche Telekom Security GmbH, C=DE, Issuer:CN=Telekom Security TLS ECC Root 2020, O=Deutsche Telekom Security GmbH, C=DE, Key type:EC, Length:384, Cert Id:771592905, Valid from:8/25/20, 7:48 AM, Valid until:8/25/45, 11:59 PM
  2026-10-23 14:19:48,142 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:00:92:b8:88:db:b0:8a:c1:63, Subject:CN=CA Disig Root R2, O=Disig a.s., L=Bratislava, C=SK, Issuer:CN=CA Disig Root R2, O=Disig a.s., L=Bratislava, C=SK, Key type:RSA, Length:4096, Cert Id:747175721, Valid from:7/19/12, 9:15 AM, Valid until:7/19/42, 9:15 AM
  2026-10-23 14:19:48,143 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:4c:aa:f9:ca:db:63:6f:e0:1f:f7:4e:d8:5b:03:86:9d, Subject:CN=COMODO RSA Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=COMODO RSA Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:4096, Cert Id:1769425049, Valid from:1/19/10, 12:00 AM, Valid until:1/18/38, 11:59 PM
  2026-10-23 14:19:48,143 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:04:44:c0, Subject:CN=Certum Trusted Network CA, OU=Certum Certification Authority, O=Unizeto Technologies S.A., C=PL, Issuer:CN=Certum Trusted Network CA, OU=Certum Certification Authority, O=Unizeto Technologies S.A., C=PL, Key type:RSA, Length:2048, Cert Id:2014002193, Valid from:10/22/08, 12:07 PM, Valid until:12/31/29, 12:07 PM
  2026-10-23 14:19:48,143 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:76:b1:20:52:74:f0:85:87:46:b3:f8:23:1a:f6:c2:c0, Subject:CN=OISTE WISeKey Global Root GB CA, OU=OISTE Foundation Endorsed, O=WISeKey, C=CH, Issuer:CN=OISTE WISeKey Global Root GB CA, OU=OISTE Foundation Endorsed, O=WISeKey, C=CH, Key type:RSA, Length:2048, Cert Id:3681485780, Valid from:12/1/14, 3:00 PM, Valid until:12/1/39, 3:10 PM
  2026-10-23 14:19:48,143 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:09:e0:93:65:ac:f7:d9:c8:b9:3e:1c:0b:04:2a:2e:f3, Subject:CN=DigiCert TLS ECC P384 Root G5, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert TLS ECC P384 Root G5, O="DigiCert, Inc.", C=US, Key type:EC, Length:384, Cert Id:3940772018, Valid from:1/15/21, 12:00 AM, Valid until:1/14/46, 11:59 PM
  2026-10-23 14:19:48,143 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:1f:47:af:aa:62:00:70:50:54:4c:01:9e:9b:63:99:2a, Subject:CN=COMODO ECC Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=COMODO ECC Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:EC, Length:384, Cert Id:1146488932, Valid from:3/6/08, 12:00 AM, Valid until:1/18/38, 11:59 PM
  2026-10-23 14:19:48,143 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withECDSA, Serial:06:6c:9f:d5:74:97:36:66:3f:3b:0b:9a:d9:e8:9e:76:03:f2:4a, Subject:CN=Amazon Root CA 3, O=Amazon, C=US, Issuer:CN=Amazon Root CA 3, O=Amazon, C=US, Key type:EC, Length:256, Cert Id:2732679773, Valid from:5/26/15, 12:00 AM, Valid until:5/26/40, 12:00 AM
  2026-10-23 14:19:48,143 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:02, Subject:CN=Buypass Class 2 Root CA, O=Buypass AS-983163327, C=NO, Issuer:CN=Buypass Class 2 Root CA, O=Buypass AS-983163327, C=NO, Key type:RSA, Length:4096, Cert Id:969960563, Valid from:10/26/10, 8:38 AM, Valid until:10/26/40, 8:38 AM
  2026-10-23 14:19:48,143 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:53:d5:cf:e6:19:93:0b:fb:2b:05:12:d8:c2:2a:a2:a4, Subject:C=DE, O=Atos, CN=Atos TrustedRoot Root CA RSA TLS 2021, Issuer:C=DE, O=Atos, CN=Atos TrustedRoot Root CA RSA TLS 2021, Key type:RSA, Length:4096, Cert Id:2972582853, Valid from:4/22/21, 9:21 AM, Valid until:4/17/41, 9:21 AM
  2026-10-23 14:19:48,144 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:45:e6:bb:03:83:33:c3:85:65:48:e6:ff:45:51, Subject:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R6, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R6, Key type:RSA, Length:4096, Cert Id:3788339543, Valid from:12/10/14, 12:00 AM, Valid until:12/10/34, 12:00 AM
  2026-10-23 14:19:48,144 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:02:03:e5:93:6f:31:b0:13:49:88:6b:a2:17, Subject:CN=GTS Root R1, O=Google Trust Services LLC, C=US, Issuer:CN=GTS Root R1, O=Google Trust Services LLC, C=US, Key type:RSA, Length:4096, Cert Id:657172038, Valid from:6/22/16, 12:00 AM, Valid until:6/22/36, 12:00 AM
  2026-10-23 14:19:48,144 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:69:26:09:7e:80:4b:4c:a0:a7:8c:78:62:53:5f:5a:6f, Subject:CN=D-TRUST EV Root CA 2 2023, O=D-Trust GmbH, C=DE, Issuer:CN=D-TRUST EV Root CA 2 2023, O=D-Trust GmbH, C=DE, Key type:RSA, Length:4096, Cert Id:1534616122, Valid from:5/9/23, 9:10 AM, Valid until:5/9/38, 9:10 AM
  2026-10-23 14:19:48,228 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:11:d2:bb:ba:33:6e:d4:bc:e6:24:68:c5:0d:84:1d:98:e8:43, Subject:CN=GlobalSign Root E46, O=GlobalSign nv-sa, C=BE, Issuer:CN=GlobalSign Root E46, O=GlobalSign nv-sa, C=BE, Key type:EC, Length:384, Cert Id:3405603905, Valid from:3/20/19, 12:00 AM, Valid until:3/20/46, 12:00 AM
  2026-10-23 14:19:48,229 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:04:00:00:00:00:01:21:58:53:08:a2, Subject:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R3, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R3, Key type:RSA, Length:2048, Cert Id:733875591, Valid from:3/18/09, 10:00 AM, Valid until:3/18/29, 10:00 AM
  2026-10-23 14:19:48,229 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:0b:a1:5a:fa:1d:df:a0:b5:49:44:af:cd:24:a0:6c:ec, Subject:CN=DigiCert Assured ID Root G3, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Assured ID Root G3, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:EC, Length:384, Cert Id:3649430051, Valid from:8/1/13, 12:00 PM, Valid until:1/15/38, 12:00 PM
  2026-10-23 14:19:48,229 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withECDSA, Serial:75:e6:df:cb:c1:68:5b:a8, Subject:CN=SSL.com Root Certification Authority ECC, O=SSL Corporation, L=Houston, ST=Texas, C=US, Issuer:CN=SSL.com Root Certification Authority ECC, O=SSL Corporation, L=Houston, ST=Texas, C=US, Key type:EC, Length:384, Cert Id:2926673683, Valid from:2/12/16, 6:14 PM, Valid until:2/12/41, 6:14 PM
  2026-10-23 14:19:48,229 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:1b:70:e9:d2:ff:ae:6c:71, Subject:CN=Autoridad de Certificacion Firmaprofesional CIF A62634068, C=ES, Issuer:CN=Autoridad de Certificacion Firmaprofesional CIF A62634068, C=ES, Key type:RSA, Length:4096, Cert Id:2528236982, Valid from:9/23/14, 3:22 PM, Valid until:5/5/36, 3:22 PM
  2026-10-23 14:19:48,229 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:67:74:9d:8d:77:d8:3b:6a:db:22:f4:ff:59:e2:bf:ce, Subject:CN=HARICA TLS ECC Root CA 2021, O=Hellenic Academic and Research Institutions CA, C=GR, Issuer:CN=HARICA TLS ECC Root CA 2021, O=Hellenic Academic and Research Institutions CA, C=GR, Key type:EC, Length:384, Cert Id:3601034952, Valid from:2/19/21, 11:01 AM, Valid until:2/13/45, 11:01 AM
  2026-10-23 14:19:48,230 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:05:9b:1b:57:9e:8e:21:32:e2:39:07:bd:a7:77:75:5c, Subject:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:1057369358, Valid from:8/1/13, 12:00 PM, Valid until:1/15/38, 12:00 PM
  2026-10-23 14:19:48,230 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:40:01:34:8c:c2:00:00:00:00:00:00:00:01:3c:f2:c6, Subject:CN=TWCA CYBER Root CA, OU=Root CA, O=TAIWAN-CA, C=TW, Issuer:CN=TWCA CYBER Root CA, OU=Root CA, O=TAIWAN-CA, C=TW, Key type:RSA, Length:4096, Cert Id:344256879, Valid from:11/22/22, 6:54 AM, Valid until:11/22/47, 3:59 PM
  2026-10-23 14:19:48,230 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:75:8d:fd:8b:ae:7c:07:00:fa:a9:25:a7:e1:c7:ad:14, Subject:CN=Sectigo Public Server Authentication Root R46, O=Sectigo Limited, C=GB, Issuer:CN=Sectigo Public Server Authentication Root R46, O=Sectigo Limited, C=GB, Key type:RSA, Length:4096, Cert Id:3806652169, Valid from:3/22/21, 12:00 AM, Valid until:3/21/46, 11:59 PM
  2026-10-23 14:19:48,230 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:55:6f:65:e3:b4:d9:90:6a:1b:09:d1:6c:3e:c0:6c:20, Subject:CN=BJCA Global Root CA1, O=BEIJING CERTIFICATE AUTHORITY, C=CN, Issuer:CN=BJCA Global Root CA1, O=BEIJING CERTIFICATE AUTHORITY, C=CN, Key type:RSA, Length:4096, Cert Id:2405703929, Valid from:12/19/19, 3:16 AM, Valid until:12/12/44, 3:16 AM
  2026-10-23 14:19:48,230 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:09:83:f4, Subject:CN=D-TRUST Root Class 3 CA 2 EV 2009, O=D-Trust GmbH, C=DE, Issuer:CN=D-TRUST Root Class 3 CA 2 EV 2009, O=D-Trust GmbH, C=DE, Key type:RSA, Length:2048, Cert Id:971313728, Valid from:11/5/09, 8:50 AM, Valid until:11/5/29, 8:50 AM
  2026-10-23 14:19:48,230 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withECDSA, Serial:00, Subject:CN=Hellenic Academic and Research Institutions ECC RootCA 2015, O=Hellenic Academic and Research Institutions Cert. Authority, L=Athens, C=GR, Issuer:CN=Hellenic Academic and Research Institutions ECC RootCA 2015, O=Hellenic Academic and Research Institutions Cert. Authority, L=Athens, C=GR, Key type:EC, Length:384, Cert Id:513613456, Valid from:7/7/15, 10:37 AM, Valid until:6/30/40, 10:37 AM
  2026-10-23 14:19:48,230 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:03:3a:f1:e6:a7:11:a9:a0:bb:28:64:b1:1d:09:fa:e5, Subject:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:1136084297, Valid from:8/1/13, 12:00 PM, Valid until:1/15/38, 12:00 PM
  2026-10-23 14:19:48,230 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:16:15:c7:c3:d8:49:a7:be:69:0c:8a:88:ed:f0:70:f9:dd:b7:3e:87, Subject:CN=SecureSign Root CA15, O="Cybertrust Japan Co., Ltd.", C=JP, Issuer:CN=SecureSign Root CA15, O="Cybertrust Japan Co., Ltd.", C=JP, Key type:EC, Length:384, Cert Id:87882820, Valid from:4/8/20, 8:32 AM, Valid until:4/8/45, 8:32 AM
  2026-10-23 14:19:48,231 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:01, Subject:CN=T-TeleSec GlobalRoot Class 3, OU=T-Systems Trust Center, O=T-Systems Enterprise Services GmbH, C=DE, Issuer:CN=T-TeleSec GlobalRoot Class 3, OU=T-Systems Trust Center, O=T-Systems Enterprise Services GmbH, C=DE, Key type:RSA, Length:2048, Cert Id:1894096264, Valid from:10/1/08, 10:29 AM, Valid until:10/1/33, 11:59 PM
  2026-10-23 14:19:48,231 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:2d:dd:ac:ce:62:97:94:a1:43:e8:b0:cd:76:6a:5e:60, Subject:CN=HiPKI Root CA - G1, O="Chunghwa Telecom Co., Ltd.", C=TW, Issuer:CN=HiPKI Root CA - G1, O="Chunghwa Telecom Co., Ltd.", C=TW, Key type:RSA, Length:4096, Cert Id:2278609152, Valid from:2/22/19, 9:46 AM, Valid until:12/31/37, 3:59 PM
  2026-10-23 14:19:48,231 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:2e:f5:9b:02:28:a7:db:7a:ff:d5:a3:a9:ee:bd:03:a0:cf:12:6a:1d, Subject:CN=QuoVadis Root CA 3 G3, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 3 G3, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:3589344305, Valid from:1/12/12, 8:26 PM, Valid until:1/12/42, 8:26 PM
  2026-10-23 14:19:48,231 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withECDSA, Serial:01:54:48:ef:21:fd:97:59:0d:f5:04:0a, Subject:CN=e-Szigno Root CA 2017, OID.2.5.4.97=VATHU-23584497, O=Microsec Ltd., L=Budapest, C=HU, Issuer:CN=e-Szigno Root CA 2017, OID.2.5.4.97=VATHU-23584497, O=Microsec Ltd., L=Budapest, C=HU, Key type:EC, Length:256, Cert Id:3303793581, Valid from:8/22/17, 12:07 PM, Valid until:8/22/42, 12:07 PM
  2026-10-23 14:19:48,235 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:21:d6:d0:4a:4f:25:0f:c9:32:37:fc:aa:5e:12:8d:e9, Subject:CN=Certum Trusted Network CA 2, OU=Certum Certification Authority, O=Unizeto Technologies S.A., C=PL, Issuer:CN=Certum Trusted Network CA 2, OU=Certum Certification Authority, O=Unizeto Technologies S.A., C=PL, Key type:RSA, Length:4096, Cert Id:1983350452, Valid from:10/6/11, 8:39 AM, Valid until:10/6/46, 8:39 AM
  2026-10-23 14:19:48,235 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:00:ae:cf:00:ba:c4:cf:32:f8:43:b2, Subject:CN=emSign Root CA - C1, O=eMudhra Inc, OU=emSign PKI, C=US, Issuer:CN=emSign Root CA - C1, O=eMudhra Inc, OU=emSign PKI, C=US, Key type:RSA, Length:2048, Cert Id:3026103940, Valid from:2/18/18, 6:30 PM, Valid until:2/18/43, 6:30 PM
  2026-10-23 14:19:48,236 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:01:94:30:1e:a2:0b:dd:f5:c5:33:2a:b1:43:44:71:f8:d6:50:4d:0d, Subject:CN=NAVER Global Root Certification Authority, O=NAVER BUSINESS PLATFORM Corp., C=KR, Issuer:CN=NAVER Global Root Certification Authority, O=NAVER BUSINESS PLATFORM Corp., C=KR, Key type:RSA, Length:4096, Cert Id:1777546867, Valid from:8/18/17, 8:58 AM, Valid until:8/18/37, 11:59 PM
  2026-10-23 14:19:48,236 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:7c:c9:8f:2b:84:d7:df:ea:0f:c9:65:9a:d3:4b:4d:96, Subject:CN=D-TRUST BR Root CA 1 2020, O=D-Trust GmbH, C=DE, Issuer:CN=D-TRUST BR Root CA 1 2020, O=D-Trust GmbH, C=DE, Key type:EC, Length:384, Cert Id:4211149558, Valid from:2/11/20, 9:45 AM, Valid until:2/11/35, 9:44 AM
  2026-10-23 14:19:48,236 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:01:fd:6d:30:fc:a3:ca:51:a8:1b:bc:64:0e:35:03:2d, Subject:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Issuer:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:RSA, Length:4096, Cert Id:3947601401, Valid from:2/1/10, 12:00 AM, Valid until:1/18/38, 11:59 PM
  2026-10-23 14:19:48,236 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:23:f9:c3:d6:35:af:8f:28:4b:1f:f0:54:ea:7e:97:9d, Subject:CN=OISTE Server Root ECC G1, O=OISTE Foundation, C=CH, Issuer:CN=OISTE Server Root ECC G1, O=OISTE Foundation, C=CH, Key type:EC, Length:384, Cert Id:1304216476, Valid from:5/31/23, 2:42 PM, Valid until:5/24/48, 2:42 PM
  2026-10-23 14:19:48,236 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:00:8e:0f:f9:4b:90:71:68:65:33:54:f4:d4:44:39:b7:e0, Subject:CN=Certainly Root R1, O=Certainly, C=US, Issuer:CN=Certainly Root R1, O=Certainly, C=US, Key type:RSA, Length:4096, Cert Id:2255958535, Valid from:4/1/21, 12:00 AM, Valid until:4/1/46, 12:00 AM
  2026-10-23 14:19:48,236 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:00:82:10:cf:b0:d2:40:e3:59:44:63:e0:bb:63:82:8b:00, Subject:CN=ISRG Root X1, O=Internet Security Research Group, C=US, Issuer:CN=ISRG Root X1, O=Internet Security Research Group, C=US, Key type:RSA, Length:4096, Cert Id:1521974916, Valid from:6/4/15, 11:04 AM, Valid until:6/4/35, 11:04 AM
  2026-10-23 14:19:48,237 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:7d:09:97:fe:f0:47:ea:7a, Subject:CN=GDCA TrustAUTH R5 ROOT, O="GUANG DONG CERTIFICATE AUTHORITY CO.,LTD.", C=CN, Issuer:CN=GDCA TrustAUTH R5 ROOT, O="GUANG DONG CERTIFICATE AUTHORITY CO.,LTD.", C=CN, Key type:RSA, Length:4096, Cert Id:494136981, Valid from:11/26/14, 5:13 AM, Valid until:12/31/40, 3:59 PM
  2026-10-23 14:19:48,237 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:0a:01:42:80:00:00:01:45:23:cf:46:7c:00:00:00:02, Subject:CN=IdenTrust Public Sector Root CA 1, O=IdenTrust, C=US, Issuer:CN=IdenTrust Public Sector Root CA 1, O=IdenTrust, C=US, Key type:RSA, Length:4096, Cert Id:2123370772, Valid from:1/16/14, 5:53 PM, Valid until:1/16/34, 5:53 PM
  2026-10-23 14:19:48,237 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:56:b6:29:cd:34:bc:78:f6, Subject:CN=SSL.com EV Root Certification Authority RSA R2, O=SSL Corporation, L=Houston, ST=Texas, C=US, Issuer:CN=SSL.com EV Root Certification Authority RSA R2, O=SSL Corporation, L=Houston, ST=Texas, C=US, Key type:RSA, Length:4096, Cert Id:1381862403, Valid from:5/31/17, 6:14 PM, Valid until:5/30/42, 6:14 PM
  2026-10-23 14:19:48,333 DEBUG [io.net.han.ssl.JdkSslContext] (vert.x-eventloop-thread-1) Default protocols (JDK): [TLSv1.3, TLSv1.2]
  2026-10-23 14:19:48,333 DEBUG [io.net.han.ssl.JdkSslContext] (vert.x-eventloop-thread-1) Default cipher suites (JDK): [TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, TLS_AES_128_GCM_SHA256, TLS_AES_256_GCM_SHA384]
  2026-10-23 14:19:48,739 DEBUG [io.net.buf.AbstractByteBuf] (vert.x-eventloop-thread-1) -Dio.netty.buffer.checkAccessible: true
  2026-10-23 14:19:48,739 DEBUG [io.net.buf.AbstractByteBuf] (vert.x-eventloop-thread-1) -Dio.netty.buffer.checkBounds: true
  2026-10-23 14:19:48,739 DEBUG [io.net.uti.ResourceLeakDetectorFactory] (vert.x-eventloop-thread-1) Loaded default ResourceLeakDetector: io.netty.util.ResourceLeakDetector@4f7941e3
  2026-10-23 14:19:48,742 DEBUG [io.net.uti.Recycler] (vert.x-eventloop-thread-1) -Dio.netty.recycler.maxCapacityPerThread: 4096
  2026-10-23 14:19:48,742 DEBUG [io.net.uti.Recycler] (vert.x-eventloop-thread-1) -Dio.netty.recycler.ratio: 8
  2026-10-23 14:19:48,742 DEBUG [io.net.uti.Recycler] (vert.x-eventloop-thread-1) -Dio.netty.recycler.chunkSize: 32
  2026-10-23 14:19:48,742 DEBUG [io.net.uti.Recycler] (vert.x-eventloop-thread-1) -Dio.netty.recycler.blocking: false
  2026-10-23 14:19:48,742 DEBUG [io.net.uti.Recycler] (vert.x-eventloop-thread-1) -Dio.netty.recycler.batchFastThreadLocalOnly: true
  2026-10-23 14:19:48,831 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:00:bf:91:15:f6:92:0e:ba:9c:fd:c1:01:58:7a:74:02:cc, Subject:CN=logindes.caixa.gov.br, Issuer:CN=Sectigo Public Server Authentication CA DV R36, O=Sectigo Limited, C=GB, Key type:RSA, Length:2048, Cert Id:1321442559, Valid from:6/16/26, 12:00 AM, Valid until:12/31/26, 11:59 PM
  2026-10-23 14:19:48,831 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:39:7a:66:cc:27:56:36:2e:0d:aa:87:ca:6e:ab:e3:b1, Subject:CN=Sectigo Public Server Authentication CA DV R36, O=Sectigo Limited, C=GB, Issuer:CN=Sectigo Public Server Authentication Root R46, O=Sectigo Limited, C=GB, Key type:RSA, Length:3072, Cert Id:1180805919, Valid from:3/22/21, 12:00 AM, Valid until:3/21/36, 11:59 PM
  2026-10-23 14:19:48,936 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) ValidationChain: 3806652169, 1180805919, 1321442559
  2026-10-23 14:19:48,937 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:01, Subject:CN=TWCA Root Certification Authority, OU=Root CA, O=TAIWAN-CA, C=TW, Issuer:CN=TWCA Root Certification Authority, OU=Root CA, O=TAIWAN-CA, C=TW, Key type:RSA, Length:2048, Cert Id:2652873033, Valid from:8/28/08, 7:24 AM, Valid until:12/31/30, 3:59 PM
  2026-10-23 14:19:48,937 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:62:f6:32:6c:e5:c4:e3:68:5c:1b:62:dd:9c:2e:9d:95, Subject:CN=AC RAIZ FNMT-RCM SERVIDORES SEGUROS, OID.2.5.4.97=VATES-Q2826004J, OU=Ceres, O=FNMT-RCM, C=ES, Issuer:CN=AC RAIZ FNMT-RCM SERVIDORES SEGUROS, OID.2.5.4.97=VATES-Q2826004J, OU=Ceres, O=FNMT-RCM, C=ES, Key type:EC, Length:384, Cert Id:246315697, Valid from:12/20/18, 9:37 AM, Valid until:12/20/43, 9:37 AM
  2026-10-23 14:19:48,937 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:0d:d3:e3:bc:6c:f9:6b:b1, Subject:CN=ANF Secure Server Root CA, OU=ANF CA Raiz, O=ANF Autoridad de Certificacion, C=ES, SERIALNUMBER=G63287510, Issuer:CN=ANF Secure Server Root CA, OU=ANF CA Raiz, O=ANF Autoridad de Certificacion, C=ES, SERIALNUMBER=G63287510, Key type:RSA, Length:4096, Cert Id:3453317601, Valid from:9/4/19, 10:00 AM, Valid until:8/30/39, 10:00 AM
  2026-10-23 14:19:48,937 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:05:55:56:bc:f2:5e:a4:35:35:c3:a4:0f:d5:ab:45:72, Subject:CN=DigiCert Global Root G3, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root G3, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:EC, Length:384, Cert Id:3498998753, Valid from:8/1/13, 12:00 PM, Valid until:1/15/38, 12:00 PM
  2026-10-23 14:19:48,937 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:5c:8b:99:c5:5a:94:c5:d2:71:56:de:cd:89:80:cc:26, Subject:CN=USERTrust ECC Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Issuer:CN=USERTrust ECC Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:EC, Length:384, Cert Id:3329287386, Valid from:2/1/10, 12:00 AM, Valid until:1/18/38, 11:59 PM
  2026-10-23 14:19:48,937 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:0a:01:42:80:00:00:01:45:23:c8:44:b5:00:00:00:02, Subject:CN=IdenTrust Commercial Root CA 1, O=IdenTrust, C=US, Issuer:CN=IdenTrust Commercial Root CA 1, O=IdenTrust, C=US, Key type:RSA, Length:4096, Cert Id:1232565210, Valid from:1/16/14, 6:12 PM, Valid until:1/16/34, 6:12 PM
  2026-10-23 14:19:48,937 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:4f:23:64:b8:8e:97:63:9e:c6:53:81:c1:76:4e:cb:2a:74:15:d6:d7, Subject:CN=TrustAsia Global Root CA G4, O="TrustAsia Technologies, Inc.", C=CN, Issuer:CN=TrustAsia Global Root CA G4, O="TrustAsia Technologies, Inc.", C=CN, Key type:EC, Length:384, Cert Id:3167719659, Valid from:5/20/21, 2:10 AM, Valid until:5/19/46, 2:10 AM
  2026-10-23 14:19:48,938 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:39:ca:93:1c:ef:43:f3:c6:8e:93:c7:f4:64:89:38:7e, Subject:CN=HARICA TLS RSA Root CA 2021, O=Hellenic Academic and Research Institutions CA, C=GR, Issuer:CN=HARICA TLS RSA Root CA 2021, O=Hellenic Academic and Research Institutions CA, C=GR, Key type:RSA, Length:4096, Cert Id:1709624614, Valid from:2/19/21, 10:55 AM, Valid until:2/13/45, 10:55 AM
  2026-10-23 14:19:48,938 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:5d:df:b1:da:5a:a3:ed:5d:be:5a:65:20:65:03:90:ef, Subject:CN=UCA Global G2 Root, O=UniTrust, C=CN, Issuer:CN=UCA Global G2 Root, O=UniTrust, C=CN, Key type:RSA, Length:4096, Cert Id:1844967193, Valid from:3/11/16, 12:00 AM, Valid until:12/31/40, 12:00 AM
  2026-10-23 14:19:48,938 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:41:d2:9d:d1:72:ea:ee:a7:80:c1:2c:6c:e9:2f:87:52, Subject:CN=ISRG Root X2, O=Internet Security Research Group, C=US, Issuer:CN=ISRG Root X2, O=Internet Security Research Group, C=US, Key type:EC, Length:384, Cert Id:3398642244, Valid from:9/4/20, 12:00 AM, Valid until:9/17/40, 4:00 PM
  2026-10-23 14:19:48,938 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:66:f2:3d:af:87:de:8b:b1:4a:ea:0c:57:31:01:c2:ec, Subject:CN=Microsoft ECC Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft ECC Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Key type:EC, Length:384, Cert Id:3240761285, Valid from:12/18/19, 11:06 PM, Valid until:7/18/42, 11:16 PM
  2026-10-23 14:19:48,938 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:5d:93:8d:30:67:36:c8:06:1d:1a:c7:54:84:69:07, Subject:OU=AC RAIZ FNMT-RCM, O=FNMT-RCM, C=ES, Issuer:OU=AC RAIZ FNMT-RCM, O=FNMT-RCM, C=ES, Key type:RSA, Length:4096, Cert Id:1555523573, Valid from:10/29/08, 3:59 PM, Valid until:1/1/30, 12:00 AM
  2026-10-23 14:19:48,938 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:5f:02:41:d7:7a:87:7c:4c:03:a3:ac:96:8d:fb:ff:d0, Subject:CN=D-TRUST EV Root CA 1 2020, O=D-Trust GmbH, C=DE, Issuer:CN=D-TRUST EV Root CA 1 2020, O=D-Trust GmbH, C=DE, Key type:EC, Length:384, Cert Id:238735896, Valid from:2/11/20, 10:00 AM, Valid until:2/11/35, 9:59 AM
  2026-10-23 14:19:48,938 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:00, Subject:CN=Hellenic Academic and Research Institutions RootCA 2015, O=Hellenic Academic and Research Institutions Cert. Authority, L=Athens, C=GR, Issuer:CN=Hellenic Academic and Research Institutions RootCA 2015, O=Hellenic Academic and Research Institutions Cert. Authority, L=Athens, C=GR, Key type:RSA, Length:4096, Cert Id:3491990565, Valid from:7/7/15, 10:11 AM, Valid until:6/30/40, 10:11 AM
  2026-10-23 14:19:48,941 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:08:f9:b4:78:a8:fa:7e:da:6a:33:37:89:de:7c:cf:8a, Subject:CN=DigiCert TLS RSA4096 Root G5, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert TLS RSA4096 Root G5, O="DigiCert, Inc.", C=US, Key type:RSA, Length:4096, Cert Id:165956757, Valid from:1/15/21, 12:00 AM, Valid until:1/14/46, 11:59 PM
  2026-10-23 14:19:48,941 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:4f:d2:2b:8f:f5:64:c8:33:9e:4f:34:58:66:23:70:60, Subject:CN=UCA Extended Validation Root, O=UniTrust, C=CN, Issuer:CN=UCA Extended Validation Root, O=UniTrust, C=CN, Key type:RSA, Length:4096, Cert Id:649181271, Valid from:3/13/15, 12:00 AM, Valid until:12/31/38, 12:00 AM
  2026-10-23 14:19:48,941 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:1e:d3:97:09:5f:d8:b4:b3:47:70:1e:aa:be:7f:45:b3, Subject:CN=Microsoft RSA Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft RSA Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:2848349048, Valid from:12/18/19, 10:51 PM, Valid until:7/18/42, 11:00 PM
  2026-10-23 14:19:48,941 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:14:03:f5:ab:fb:37:8b:17:40:5b:e2:43:b2:a5:d1:c4, Subject:CN=SSL.com TLS ECC Root CA 2022, O=SSL Corporation, C=US, Issuer:CN=SSL.com TLS ECC Root CA 2022, O=SSL Corporation, C=US, Key type:EC, Length:384, Cert Id:683561703, Valid from:8/25/22, 4:33 PM, Valid until:8/19/46, 4:33 PM
  2026-10-23 14:19:48,941 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:06:6c:9f:d2:96:35:86:9f:0a:0f:e5:86:78:f8:5b:26:bb:8a:37, Subject:CN=Amazon Root CA 2, O=Amazon, C=US, Issuer:CN=Amazon Root CA 2, O=Amazon, C=US, Key type:RSA, Length:4096, Cert Id:2528834908, Valid from:5/26/15, 12:00 AM, Valid until:5/26/40, 12:00 AM
  2026-10-23 14:19:48,941 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:21:2a:56:0c:ae:da:0c:ab:40:45:bf:2b:a2:2d:3a:ea, Subject:CN=OISTE WISeKey Global Root GC CA, OU=OISTE Foundation Endorsed, O=WISeKey, C=CH, Issuer:CN=OISTE WISeKey Global Root GC CA, OU=OISTE Foundation Endorsed, O=WISeKey, C=CH, Key type:EC, Length:384, Cert Id:2781801839, Valid from:5/9/17, 9:48 AM, Valid until:5/9/42, 9:58 AM
  2026-10-23 14:19:48,941 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:55:a5:d9:67:94:28:c6:ed:0c:fa:27:dd:5b:01:4d:18, Subject:CN=OISTE Server Root RSA G1, O=OISTE Foundation, C=CH, Issuer:CN=OISTE Server Root RSA G1, O=OISTE Foundation, C=CH, Key type:RSA, Length:4096, Cert Id:1583668620, Valid from:5/31/23, 2:37 PM, Valid until:5/24/48, 2:37 PM
  2026-10-23 14:19:48,941 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:06:6c:9f:d7:c1:bb:10:4c:29:43:e5:71:7b:7b:2c:c8:1a:c1:0e, Subject:CN=Amazon Root CA 4, O=Amazon, C=US, Issuer:CN=Amazon Root CA 4, O=Amazon, C=US, Key type:EC, Length:384, Cert Id:2640694783, Valid from:5/26/15, 12:00 AM, Valid until:5/26/40, 12:00 AM
  2026-10-23 14:19:48,941 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:5c:33:cb:62:2c:5f:b3:32, Subject:C=DE, O=Atos, CN=Atos TrustedRoot 2011, Issuer:C=DE, O=Atos, CN=Atos TrustedRoot 2011, Key type:RSA, Length:2048, Cert Id:4266438672, Valid from:7/7/11, 2:58 PM, Valid until:12/31/30, 11:59 PM
  2026-10-23 14:19:48,941 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:7b:2c:9b:d3:16:80:32:99, Subject:CN=SSL.com Root Certification Authority RSA, O=SSL Corporation, L=Houston, ST=Texas, C=US, Issuer:CN=SSL.com Root Certification Authority RSA, O=SSL Corporation, L=Houston, ST=Texas, C=US, Key type:RSA, Length:4096, Cert Id:156725711, Valid from:2/12/16, 5:39 PM, Valid until:2/12/41, 5:39 PM
  2026-10-23 14:19:48,941 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:36:74:e1:4d:7c:65:13:c9:ac:83:55:25:a0:3e:52:7e:2f:50:68:c7, Subject:CN=TrustAsia TLS ECC Root CA, O="TrustAsia Technologies, Inc.", C=CN, Issuer:CN=TrustAsia TLS ECC Root CA, O="TrustAsia Technologies, Inc.", C=CN, Key type:EC, Length:384, Cert Id:3267627789, Valid from:5/15/24, 5:41 AM, Valid until:5/15/44, 5:41 AM
  2026-10-23 14:19:48,941 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:13:02:d5:e2:40:4c:92:46:86:16:67:5d:b4:bb:bb:b2:6b:3e:fc:13, Subject:CN=TunTrust Root CA, O=Agence Nationale de Certification Electronique, C=TN, Issuer:CN=TunTrust Root CA, O=Agence Nationale de Certification Electronique, C=TN, Key type:RSA, Length:4096, Cert Id:1973181427, Valid from:4/26/19, 8:57 AM, Valid until:4/26/44, 8:57 AM
  2026-10-23 14:19:48,941 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withECDSA, Serial:2c:29:9c:5b:16:ed:05:95, Subject:CN=SSL.com EV Root Certification Authority ECC, O=SSL Corporation, L=Houston, ST=Texas, C=US, Issuer:CN=SSL.com EV Root Certification Authority ECC, O=SSL Corporation, L=Houston, ST=Texas, C=US, Key type:EC, Length:384, Cert Id:1789254518, Valid from:2/12/16, 6:15 PM, Valid until:2/12/41, 6:15 PM
  2026-10-23 14:19:48,941 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:06:25:33:b1:47:03:33:27:5c:f9:8d:9a:b9:bf:cc:f8, Subject:CN=Certainly Root E1, O=Certainly, C=US, Issuer:CN=Certainly Root E1, O=Certainly, C=US, Key type:EC, Length:384, Cert Id:792571453, Valid from:4/1/21, 12:00 AM, Valid until:4/1/46, 12:00 AM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:00, Subject:CN=Starfield Root Certificate Authority - G2, O="Starfield Technologies, Inc.", L=Scottsdale, ST=Arizona, C=US, Issuer:CN=Starfield Root Certificate Authority - G2, O="Starfield Technologies, Inc.", L=Scottsdale, ST=Arizona, C=US, Key type:RSA, Length:2048, Cert Id:3268325709, Valid from:9/1/09, 12:00 AM, Valid until:12/31/37, 11:59 PM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:60:59:49:e0:26:2e:bb:55:f9:0a:77:8a:71:f9:4a:d8:6c, Subject:CN=GlobalSign, O=GlobalSign, OU=GlobalSign ECC Root CA - R5, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign ECC Root CA - R5, Key type:EC, Length:384, Cert Id:1997048439, Valid from:11/13/12, 12:00 AM, Valid until:1/19/38, 3:14 AM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withECDSA, Serial:02:03:e5:7e:f5:3f:93:fd:a5:09:21:b2:a6, Subject:CN=GlobalSign, O=GlobalSign, OU=GlobalSign ECC Root CA - R4, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign ECC Root CA - R4, Key type:EC, Length:256, Cert Id:3777996779, Valid from:11/13/12, 12:00 AM, Valid until:1/19/38, 3:14 AM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:43:fa:0c:5f:4e:1b:80:18:44:ef:d1:b4:4f:35:1f:44:f4:80:ed:cb, Subject:CN=SwissSign RSA TLS Root CA 2022 - 1, O=SwissSign AG, C=CH, Issuer:CN=SwissSign RSA TLS Root CA 2022 - 1, O=SwissSign AG, C=CH, Key type:RSA, Length:4096, Cert Id:2764753514, Valid from:6/8/22, 11:08 AM, Valid until:6/8/47, 11:08 AM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:1e:bf:59:50:b8:c9:80:37:4c:06:f7:eb:55:4f:b5:ed, Subject:CN=Certum Trusted Root CA, OU=Certum Certification Authority, O=Asseco Data Systems S.A., C=PL, Issuer:CN=Certum Trusted Root CA, OU=Certum Certification Authority, O=Asseco Data Systems S.A., C=PL, Key type:RSA, Length:4096, Cert Id:3520640245, Valid from:3/16/18, 12:10 PM, Valid until:3/16/43, 12:10 PM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:64:f6:0e:65:77:61:6a:ab:3b:b4:ea:85:84:bb:b1:89:b8:71:93:0f, Subject:CN=TrustAsia Global Root CA G3, O="TrustAsia Technologies, Inc.", C=CN, Issuer:CN=TrustAsia Global Root CA G3, O="TrustAsia Technologies, Inc.", C=CN, Key type:RSA, Length:4096, Cert Id:3528443285, Valid from:5/20/21, 2:10 AM, Valid until:5/19/46, 2:10 AM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:49:41:2c:e4:00:10, Subject:CN=NetLock Arany (Class Gold) Főtanúsítvány, OU=Tanúsítványkiadók (Certification Services), O=NetLock Kft., L=Budapest, C=HU, Issuer:CN=NetLock Arany (Class Gold) Főtanúsítvány, OU=Tanúsítványkiadók (Certification Services), O=NetLock Kft., L=Budapest, C=HU, Key type:RSA, Length:2048, Cert Id:58541246, Valid from:12/11/08, 3:08 PM, Valid until:12/6/28, 3:08 PM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:64:db:5a:0c:20:4e:e8:d7:29:77:c8:50:27:a2:5a:27:dd:2d:f2:cb, Subject:CN=SecureSign Root CA14, O="Cybertrust Japan Co., Ltd.", C=JP, Issuer:CN=SecureSign Root CA14, O="Cybertrust Japan Co., Ltd.", C=JP, Key type:RSA, Length:4096, Cert Id:3471868125, Valid from:4/8/20, 7:06 AM, Valid until:4/8/45, 7:06 AM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:57:0a:11:97:42:c4:e3:cc, Subject:CN=Actalis Authentication Root CA, O=Actalis S.p.A./03358520967, L=Milan, C=IT, Issuer:CN=Actalis Authentication Root CA, O=Actalis S.p.A./03358520967, L=Milan, C=IT, Key type:RSA, Length:4096, Cert Id:1729119956, Valid from:9/22/11, 11:22 AM, Valid until:9/22/30, 11:22 AM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:11:00:34:b6:4e:c6:36:2d:36, Subject:OU=certSIGN ROOT CA G2, O=CERTSIGN SA, C=RO, Issuer:OU=certSIGN ROOT CA G2, O=CERTSIGN SA, C=RO, Key type:RSA, Length:4096, Cert Id:2181086866, Valid from:2/6/17, 9:27 AM, Valid until:2/6/42, 9:27 AM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:3e:8a:5d:07:ec:55:d2:32:d5:b7:e3:b6:5f:01:eb:2d:dc:e4:d6:e4, Subject:CN=SZAFIR ROOT CA2, O=Krajowa Izba Rozliczeniowa S.A., C=PL, Issuer:CN=SZAFIR ROOT CA2, O=Krajowa Izba Rozliczeniowa S.A., C=PL, Key type:RSA, Length:2048, Cert Id:381279303, Valid from:10/19/15, 7:43 AM, Valid until:10/19/35, 7:43 AM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:11:d2:bb:b9:d7:23:18:9e:40:5f:0a:9d:2d:d0:df:25:67:d1, Subject:CN=GlobalSign Root R46, O=GlobalSign nv-sa, C=BE, Issuer:CN=GlobalSign Root R46, O=GlobalSign nv-sa, C=BE, Key type:RSA, Length:4096, Cert Id:1275948927, Valid from:3/20/19, 12:00 AM, Valid until:3/20/46, 12:00 AM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:18:4a:cc:d6, Subject:CN=CFCA EV ROOT, O=China Financial Certification Authority, C=CN, Issuer:CN=CFCA EV ROOT, O=China Financial Certification Authority, C=CN, Key type:RSA, Length:4096, Cert Id:551407782, Valid from:8/8/12, 3:07 AM, Valid until:12/31/29, 3:07 AM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:7b:71:b6:82:56:b8:12:7c:9c:a8, Subject:CN=emSign ECC Root CA - C3, O=eMudhra Inc, OU=emSign PKI, C=US, Issuer:CN=emSign ECC Root CA - C3, O=eMudhra Inc, OU=emSign PKI, C=US, Key type:EC, Length:384, Cert Id:3346510540, Valid from:2/18/18, 6:30 PM, Valid until:2/18/43, 6:30 PM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:3c:f6:07:a9:68:70:0e:da:8b:84, Subject:CN=emSign ECC Root CA - G3, O=eMudhra Technologies Limited, OU=emSign PKI, C=IN, Issuer:CN=emSign ECC Root CA - G3, O=eMudhra Technologies Limited, OU=emSign PKI, C=IN, Key type:EC, Length:384, Cert Id:3832035707, Valid from:2/18/18, 6:30 PM, Valid until:2/18/43, 6:30 PM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:3d:98:3b:a6:66:3d:90:63:f7:7e:26:57:38:04:ef:00, Subject:C=DE, O=Atos, CN=Atos TrustedRoot Root CA ECC TLS 2021, Issuer:C=DE, O=Atos, CN=Atos TrustedRoot Root CA ECC TLS 2021, Key type:EC, Length:384, Cert Id:3147217643, Valid from:4/22/21, 9:26 AM, Valid until:4/17/41, 9:26 AM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:02, Subject:CN=Buypass Class 3 Root CA, O=Buypass AS-983163327, C=NO, Issuer:CN=Buypass Class 3 Root CA, O=Buypass AS-983163327, C=NO, Key type:RSA, Length:4096, Cert Id:1264269967, Valid from:10/26/10, 8:28 AM, Valid until:10/26/40, 8:28 AM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:01, Subject:CN=TUBITAK Kamu SM SSL Kok Sertifikasi - Surum 1, OU=Kamu Sertifikasyon Merkezi - Kamu SM, O=Turkiye Bilimsel ve Teknolojik Arastirma Kurumu - TUBITAK, L=Gebze - Kocaeli, C=TR, Issuer:CN=TUBITAK Kamu SM SSL Kok Sertifikasi - Surum 1, OU=Kamu Sertifikasyon Merkezi - Kamu SM, O=Turkiye Bilimsel ve Teknolojik Arastirma Kurumu - TUBITAK, L=Gebze - Kocaeli, C=TR, Key type:RSA, Length:2048, Cert Id:1093603654, Valid from:11/25/13, 8:25 AM, Valid until:10/25/43, 8:25 AM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:78:58:5f:2e:ad:2c:19:4b:e3:37:07:35:34:13:28:b5:96:d4:65:93, Subject:CN=QuoVadis Root CA 1 G3, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 1 G3, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:3532531262, Valid from:1/12/12, 5:27 PM, Valid until:1/12/42, 5:27 PM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:02:03:e5:c0:68:ef:63:1a:9c:72:90:50:52, Subject:CN=GTS Root R4, O=Google Trust Services LLC, C=US, Issuer:CN=GTS Root R4, O=Google Trust Services LLC, C=US, Key type:EC, Length:384, Cert Id:1326433111, Valid from:6/22/16, 12:00 AM, Valid until:6/22/36, 12:00 AM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withECDSA, Serial:00:e8:6f:18:7b:d6:39:6b:98:4a:49:98:0a, Subject:CN=e-Szigno TLS Root CA 2023, OID.2.5.4.97=VATHU-23584497, O=Microsec Ltd., L=Budapest, C=HU, Issuer:CN=e-Szigno TLS Root CA 2023, OID.2.5.4.97=VATHU-23584497, O=Microsec Ltd., L=Budapest, C=HU, Key type:EC, Length:521, Cert Id:2537772715, Valid from:7/17/23, 2:00 PM, Valid until:7/17/38, 2:00 PM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:1c:18:d8:cf:e5:53:3f:22:35:46:53:54:24:3c:6c:47:d1:5c:4a:9c, Subject:CN=TrustAsia TLS RSA Root CA, O="TrustAsia Technologies, Inc.", C=CN, Issuer:CN=TrustAsia TLS RSA Root CA, O="TrustAsia Technologies, Inc.", C=CN, Key type:RSA, Length:4096, Cert Id:375865335, Valid from:5/15/24, 5:41 AM, Valid until:5/15/44, 5:41 AM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:78:8f:27:5c:81:12:52:20:a5:04:d0:2d:dd:ba:73:f4, Subject:CN=Certum EC-384 CA, OU=Certum Certification Authority, O=Asseco Data Systems S.A., C=PL, Issuer:CN=Certum EC-384 CA, OU=Certum Certification Authority, O=Asseco Data Systems S.A., C=PL, Key type:EC, Length:384, Cert Id:994586241, Valid from:3/26/18, 7:24 AM, Valid until:3/26/43, 7:24 AM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:15:c8:bd:65:47:5c:af:b8:97:00:5e:e4:06:d2:bc:9d, Subject:OU=ePKI Root Certification Authority, O="Chunghwa Telecom Co., Ltd.", C=TW, Issuer:OU=ePKI Root Certification Authority, O="Chunghwa Telecom Co., Ltd.", C=TW, Key type:RSA, Length:4096, Cert Id:3632331159, Valid from:12/20/04, 2:31 AM, Valid until:12/20/34, 2:31 AM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:02:03:e5:b8:82:eb:20:f8:25:27:6d:3d:66, Subject:CN=GTS Root R3, O=Google Trust Services LLC, C=US, Issuer:CN=GTS Root R3, O=Google Trust Services LLC, C=US, Key type:EC, Length:384, Cert Id:1163081155, Valid from:6/22/16, 12:00 AM, Valid until:6/22/36, 12:00 AM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:01, Subject:CN=T-TeleSec GlobalRoot Class 2, OU=T-Systems Trust Center, O=T-Systems Enterprise Services GmbH, C=DE, Issuer:CN=T-TeleSec GlobalRoot Class 2, OU=T-Systems Trust Center, O=T-Systems Enterprise Services GmbH, C=DE, Key type:RSA, Length:2048, Cert Id:3056503257, Valid from:10/1/08, 10:40 AM, Valid until:10/1/33, 11:59 PM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:5e:c3:b7:a6:43:7f:a4:e0, Subject:C=ES, O=ACCV, OU=PKIACCV, CN=ACCVRAIZ1, Issuer:C=ES, O=ACCV, OU=PKIACCV, CN=ACCVRAIZ1, Key type:RSA, Length:4096, Cert Id:3702856060, Valid from:5/5/11, 9:37 AM, Valid until:12/31/30, 9:37 AM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:73:3b:30:04:48:5b:d9:4d:78:2e:73:4b:c9:a1:dc:66, Subject:CN=D-TRUST BR Root CA 2 2023, O=D-Trust GmbH, C=DE, Issuer:CN=D-TRUST BR Root CA 2 2023, O=D-Trust GmbH, C=DE, Key type:RSA, Length:4096, Cert Id:2330314016, Valid from:5/9/23, 8:56 AM, Valid until:5/9/38, 8:56 AM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:00:d6:5d:9b:b3:78:81:2e:eb, Subject:CN=Security Communication ECC RootCA1, O="SECOM Trust Systems CO.,LTD.", C=JP, Issuer:CN=Security Communication ECC RootCA1, O="SECOM Trust Systems CO.,LTD.", C=JP, Key type:EC, Length:384, Cert Id:2131361491, Valid from:6/16/16, 5:15 AM, Valid until:1/18/38, 5:15 AM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:08:16:5f:8a:4c:a5:ec:00:c9:93:40:df:c4:c6:ae:23:b8:1c:5a:a4, Subject:CN=Hongkong Post Root CA 3, O=Hongkong Post, L=Hong Kong, ST=Hong Kong, C=HK, Issuer:CN=Hongkong Post Root CA 3, O=Hongkong Post, L=Hong Kong, ST=Hong Kong, C=HK, Key type:RSA, Length:4096, Cert Id:3393016216, Valid from:6/3/17, 2:29 AM, Valid until:6/3/42, 2:29 AM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:6e:6a:bc:59:aa:53:be:98:39:67:a2:d2:6b:a4:3b:e6:6d:1c:d6:da, Subject:CN=vTrus ECC Root CA, O="iTrusChina Co.,Ltd.", C=CN, Issuer:CN=vTrus ECC Root CA, O="iTrusChina Co.,Ltd.", C=CN, Key type:EC, Length:384, Cert Id:268503342, Valid from:7/31/18, 7:26 AM, Valid until:7/31/43, 7:26 AM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:0c:be, Subject:CN=TWCA Global Root CA, OU=Root CA, O=TAIWAN-CA, C=TW, Issuer:CN=TWCA Global Root CA, OU=Root CA, O=TAIWAN-CA, C=TW, Key type:RSA, Length:4096, Cert Id:861175838, Valid from:6/27/12, 6:28 AM, Valid until:12/31/30, 3:59 PM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:42:f2:cc:da:1b:69:37:44:5f:15:fe:75:28:10:b8:f4, Subject:CN=Sectigo Public Server Authentication Root E46, O=Sectigo Limited, C=GB, Issuer:CN=Sectigo Public Server Authentication Root E46, O=Sectigo Limited, C=GB, Key type:EC, Length:384, Cert Id:3789385269, Valid from:3/22/21, 12:00 AM, Valid until:3/21/46, 11:59 PM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:00, Subject:CN=Go Daddy Root Certificate Authority - G2, O="GoDaddy.com, Inc.", L=Scottsdale, ST=Arizona, C=US, Issuer:CN=Go Daddy Root Certificate Authority - G2, O="GoDaddy.com, Inc.", L=Scottsdale, ST=Arizona, C=US, Key type:RSA, Length:2048, Cert Id:439600313, Valid from:9/1/09, 12:00 AM, Valid until:12/31/37, 11:59 PM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:00, Subject:OU=Security Communication RootCA2, O="SECOM Trust Systems CO.,LTD.", C=JP, Issuer:OU=Security Communication RootCA2, O="SECOM Trust Systems CO.,LTD.", C=JP, Key type:RSA, Length:2048, Cert Id:1521072570, Valid from:5/29/09, 5:00 AM, Valid until:5/29/29, 5:00 AM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:21:9c:54:2d:e8:f6:ec:71:77:fa:4e:e8:c3:70:57:97, Subject:CN=Telekom Security TLS RSA Root 2023, O=Deutsche Telekom Security GmbH, C=DE, Issuer:CN=Telekom Security TLS RSA Root 2023, O=Deutsche Telekom Security GmbH, C=DE, Key type:RSA, Length:4096, Cert Id:2296218035, Valid from:3/28/23, 12:16 PM, Valid until:3/27/48, 11:59 PM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:0b:93:1c:3a:d6:39:67:ea:67:23:bf:c3:af:9a:f4:4b, Subject:CN=DigiCert Assured ID Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Assured ID Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:3909568913, Valid from:8/1/13, 12:00 PM, Valid until:1/15/38, 12:00 PM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:00:ca:e9:1b:89:f1:55:03:0d:a3:e6:41:6d:c4:e3:a6:e1, Subject:CN=Certigna Root CA, OU=0002 48146308100036, O=Dhimyotis, C=FR, Issuer:CN=Certigna Root CA, OU=0002 48146308100036, O=Dhimyotis, C=FR, Key type:RSA, Length:4096, Cert Id:356684591, Valid from:10/1/13, 8:32 AM, Valid until:10/1/33, 8:32 AM
  2026-10-23 14:19:48,942 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:09:83:f3, Subject:CN=D-TRUST Root Class 3 CA 2 2009, O=D-Trust GmbH, C=DE, Issuer:CN=D-TRUST Root Class 3 CA 2 2009, O=D-Trust GmbH, C=DE, Key type:RSA, Length:2048, Cert Id:1430153102, Valid from:11/5/09, 8:35 AM, Valid until:11/5/29, 8:35 AM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:6f:be:da:ad:73:bd:08:40:e2:8b:4d:be:d4:f7:5b:91, Subject:CN=SSL.com TLS RSA Root CA 2022, O=SSL Corporation, C=US, Issuer:CN=SSL.com TLS RSA Root CA 2022, O=SSL Corporation, C=US, Key type:RSA, Length:4096, Cert Id:556880013, Valid from:8/25/22, 4:34 PM, Valid until:8/19/46, 4:34 PM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:01:67:5f:27:d6:fe:7a:e3:e4:ac:be:09:5b:05:9e, Subject:CN=Telia Root CA v2, O=Telia Finland Oyj, C=FI, Issuer:CN=Telia Root CA v2, O=Telia Finland Oyj, C=FI, Key type:RSA, Length:4096, Cert Id:3473063976, Valid from:11/29/18, 11:55 AM, Valid until:11/29/43, 11:55 AM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:00:c2:7e:43:04:4e:47:3f:19, Subject:EMAILADDRESS=info@e-szigno.hu, CN=Microsec e-Szigno Root CA 2009, O=Microsec Ltd., L=Budapest, C=HU, Issuer:EMAILADDRESS=info@e-szigno.hu, CN=Microsec e-Szigno Root CA 2009, O=Microsec Ltd., L=Budapest, C=HU, Key type:RSA, Length:2048, Cert Id:2391017284, Valid from:6/16/09, 11:30 AM, Valid until:12/30/29, 11:30 AM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:31:f5:e4:62:0c:6c:58:ed:d6:d8, Subject:CN=emSign Root CA - G1, O=eMudhra Technologies Limited, OU=emSign PKI, C=IN, Issuer:CN=emSign Root CA - G1, O=eMudhra Technologies Limited, OU=emSign PKI, C=IN, Key type:RSA, Length:2048, Cert Id:392709196, Valid from:2/18/18, 6:30 PM, Valid until:2/18/43, 6:30 PM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:44:57:34:24:5b:81:89:9b:35:f2:ce:b8:2b:3b:5b:a7:26:f0:75:28, Subject:CN=QuoVadis Root CA 2 G3, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 2 G3, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:696763521, Valid from:1/12/12, 6:59 PM, Valid until:1/12/42, 6:59 PM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:2c:17:08:7d:64:2a:c0:fe:85:18:59:06:cf:b4:4a:eb, Subject:CN=BJCA Global Root CA2, O=BEIJING CERTIFICATE AUTHORITY, C=CN, Issuer:CN=BJCA Global Root CA2, O=BEIJING CERTIFICATE AUTHORITY, C=CN, Key type:EC, Length:384, Cert Id:1781225575, Valid from:12/19/19, 3:18 AM, Valid until:12/12/44, 3:18 AM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:06:6c:9f:cf:99:bf:8c:0a:39:e2:f0:78:8a:43:e6:96:36:5b:ca, Subject:CN=Amazon Root CA 1, O=Amazon, C=US, Issuer:CN=Amazon Root CA 1, O=Amazon, C=US, Key type:RSA, Length:2048, Cert Id:2822522334, Valid from:5/26/15, 12:00 AM, Valid until:1/17/38, 12:00 AM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:00, Subject:CN=Starfield Services Root Certificate Authority - G2, O="Starfield Technologies, Inc.", L=Scottsdale, ST=Arizona, C=US, Issuer:CN=Starfield Services Root Certificate Authority - G2, O="Starfield Technologies, Inc.", L=Scottsdale, ST=Arizona, C=US, Key type:RSA, Length:2048, Cert Id:1964785574, Valid from:9/1/09, 12:00 AM, Valid until:12/31/37, 11:59 PM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:43:e3:71:13:d8:b3:59:14:5d:b7:ce:8c:fd:35:fd:6f:bc:05:8d:45, Subject:CN=vTrus Root CA, O="iTrusChina Co.,Ltd.", C=CN, Issuer:CN=vTrus Root CA, O="iTrusChina Co.,Ltd.", C=CN, Key type:RSA, Length:4096, Cert Id:2469083546, Valid from:7/31/18, 7:24 AM, Valid until:7/31/43, 7:24 AM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:36:3a:96:8c:c9:5c:b2:58:cd:d0:01:5d:c5:e5:57:00, Subject:CN=Telekom Security TLS ECC Root 2020, O=Deutsche Telekom Security GmbH, C=DE, Issuer:CN=Telekom Security TLS ECC Root 2020, O=Deutsche Telekom Security GmbH, C=DE, Key type:EC, Length:384, Cert Id:771592905, Valid from:8/25/20, 7:48 AM, Valid until:8/25/45, 11:59 PM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:00:92:b8:88:db:b0:8a:c1:63, Subject:CN=CA Disig Root R2, O=Disig a.s., L=Bratislava, C=SK, Issuer:CN=CA Disig Root R2, O=Disig a.s., L=Bratislava, C=SK, Key type:RSA, Length:4096, Cert Id:747175721, Valid from:7/19/12, 9:15 AM, Valid until:7/19/42, 9:15 AM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:4c:aa:f9:ca:db:63:6f:e0:1f:f7:4e:d8:5b:03:86:9d, Subject:CN=COMODO RSA Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=COMODO RSA Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:4096, Cert Id:1769425049, Valid from:1/19/10, 12:00 AM, Valid until:1/18/38, 11:59 PM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:04:44:c0, Subject:CN=Certum Trusted Network CA, OU=Certum Certification Authority, O=Unizeto Technologies S.A., C=PL, Issuer:CN=Certum Trusted Network CA, OU=Certum Certification Authority, O=Unizeto Technologies S.A., C=PL, Key type:RSA, Length:2048, Cert Id:2014002193, Valid from:10/22/08, 12:07 PM, Valid until:12/31/29, 12:07 PM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:76:b1:20:52:74:f0:85:87:46:b3:f8:23:1a:f6:c2:c0, Subject:CN=OISTE WISeKey Global Root GB CA, OU=OISTE Foundation Endorsed, O=WISeKey, C=CH, Issuer:CN=OISTE WISeKey Global Root GB CA, OU=OISTE Foundation Endorsed, O=WISeKey, C=CH, Key type:RSA, Length:2048, Cert Id:3681485780, Valid from:12/1/14, 3:00 PM, Valid until:12/1/39, 3:10 PM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:09:e0:93:65:ac:f7:d9:c8:b9:3e:1c:0b:04:2a:2e:f3, Subject:CN=DigiCert TLS ECC P384 Root G5, O="DigiCert, Inc.", C=US, Issuer:CN=DigiCert TLS ECC P384 Root G5, O="DigiCert, Inc.", C=US, Key type:EC, Length:384, Cert Id:3940772018, Valid from:1/15/21, 12:00 AM, Valid until:1/14/46, 11:59 PM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:1f:47:af:aa:62:00:70:50:54:4c:01:9e:9b:63:99:2a, Subject:CN=COMODO ECC Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=COMODO ECC Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:EC, Length:384, Cert Id:1146488932, Valid from:3/6/08, 12:00 AM, Valid until:1/18/38, 11:59 PM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withECDSA, Serial:06:6c:9f:d5:74:97:36:66:3f:3b:0b:9a:d9:e8:9e:76:03:f2:4a, Subject:CN=Amazon Root CA 3, O=Amazon, C=US, Issuer:CN=Amazon Root CA 3, O=Amazon, C=US, Key type:EC, Length:256, Cert Id:2732679773, Valid from:5/26/15, 12:00 AM, Valid until:5/26/40, 12:00 AM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:02, Subject:CN=Buypass Class 2 Root CA, O=Buypass AS-983163327, C=NO, Issuer:CN=Buypass Class 2 Root CA, O=Buypass AS-983163327, C=NO, Key type:RSA, Length:4096, Cert Id:969960563, Valid from:10/26/10, 8:38 AM, Valid until:10/26/40, 8:38 AM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:53:d5:cf:e6:19:93:0b:fb:2b:05:12:d8:c2:2a:a2:a4, Subject:C=DE, O=Atos, CN=Atos TrustedRoot Root CA RSA TLS 2021, Issuer:C=DE, O=Atos, CN=Atos TrustedRoot Root CA RSA TLS 2021, Key type:RSA, Length:4096, Cert Id:2972582853, Valid from:4/22/21, 9:21 AM, Valid until:4/17/41, 9:21 AM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:45:e6:bb:03:83:33:c3:85:65:48:e6:ff:45:51, Subject:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R6, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R6, Key type:RSA, Length:4096, Cert Id:3788339543, Valid from:12/10/14, 12:00 AM, Valid until:12/10/34, 12:00 AM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:02:03:e5:93:6f:31:b0:13:49:88:6b:a2:17, Subject:CN=GTS Root R1, O=Google Trust Services LLC, C=US, Issuer:CN=GTS Root R1, O=Google Trust Services LLC, C=US, Key type:RSA, Length:4096, Cert Id:657172038, Valid from:6/22/16, 12:00 AM, Valid until:6/22/36, 12:00 AM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:69:26:09:7e:80:4b:4c:a0:a7:8c:78:62:53:5f:5a:6f, Subject:CN=D-TRUST EV Root CA 2 2023, O=D-Trust GmbH, C=DE, Issuer:CN=D-TRUST EV Root CA 2 2023, O=D-Trust GmbH, C=DE, Key type:RSA, Length:4096, Cert Id:1534616122, Valid from:5/9/23, 9:10 AM, Valid until:5/9/38, 9:10 AM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:11:d2:bb:ba:33:6e:d4:bc:e6:24:68:c5:0d:84:1d:98:e8:43, Subject:CN=GlobalSign Root E46, O=GlobalSign nv-sa, C=BE, Issuer:CN=GlobalSign Root E46, O=GlobalSign nv-sa, C=BE, Key type:EC, Length:384, Cert Id:3405603905, Valid from:3/20/19, 12:00 AM, Valid until:3/20/46, 12:00 AM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:04:00:00:00:00:01:21:58:53:08:a2, Subject:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R3, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R3, Key type:RSA, Length:2048, Cert Id:733875591, Valid from:3/18/09, 10:00 AM, Valid until:3/18/29, 10:00 AM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:0b:a1:5a:fa:1d:df:a0:b5:49:44:af:cd:24:a0:6c:ec, Subject:CN=DigiCert Assured ID Root G3, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Assured ID Root G3, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:EC, Length:384, Cert Id:3649430051, Valid from:8/1/13, 12:00 PM, Valid until:1/15/38, 12:00 PM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withECDSA, Serial:75:e6:df:cb:c1:68:5b:a8, Subject:CN=SSL.com Root Certification Authority ECC, O=SSL Corporation, L=Houston, ST=Texas, C=US, Issuer:CN=SSL.com Root Certification Authority ECC, O=SSL Corporation, L=Houston, ST=Texas, C=US, Key type:EC, Length:384, Cert Id:2926673683, Valid from:2/12/16, 6:14 PM, Valid until:2/12/41, 6:14 PM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:1b:70:e9:d2:ff:ae:6c:71, Subject:CN=Autoridad de Certificacion Firmaprofesional CIF A62634068, C=ES, Issuer:CN=Autoridad de Certificacion Firmaprofesional CIF A62634068, C=ES, Key type:RSA, Length:4096, Cert Id:2528236982, Valid from:9/23/14, 3:22 PM, Valid until:5/5/36, 3:22 PM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:67:74:9d:8d:77:d8:3b:6a:db:22:f4:ff:59:e2:bf:ce, Subject:CN=HARICA TLS ECC Root CA 2021, O=Hellenic Academic and Research Institutions CA, C=GR, Issuer:CN=HARICA TLS ECC Root CA 2021, O=Hellenic Academic and Research Institutions CA, C=GR, Key type:EC, Length:384, Cert Id:3601034952, Valid from:2/19/21, 11:01 AM, Valid until:2/13/45, 11:01 AM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:05:9b:1b:57:9e:8e:21:32:e2:39:07:bd:a7:77:75:5c, Subject:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:1057369358, Valid from:8/1/13, 12:00 PM, Valid until:1/15/38, 12:00 PM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:40:01:34:8c:c2:00:00:00:00:00:00:00:01:3c:f2:c6, Subject:CN=TWCA CYBER Root CA, OU=Root CA, O=TAIWAN-CA, C=TW, Issuer:CN=TWCA CYBER Root CA, OU=Root CA, O=TAIWAN-CA, C=TW, Key type:RSA, Length:4096, Cert Id:344256879, Valid from:11/22/22, 6:54 AM, Valid until:11/22/47, 3:59 PM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:75:8d:fd:8b:ae:7c:07:00:fa:a9:25:a7:e1:c7:ad:14, Subject:CN=Sectigo Public Server Authentication Root R46, O=Sectigo Limited, C=GB, Issuer:CN=Sectigo Public Server Authentication Root R46, O=Sectigo Limited, C=GB, Key type:RSA, Length:4096, Cert Id:3806652169, Valid from:3/22/21, 12:00 AM, Valid until:3/21/46, 11:59 PM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:55:6f:65:e3:b4:d9:90:6a:1b:09:d1:6c:3e:c0:6c:20, Subject:CN=BJCA Global Root CA1, O=BEIJING CERTIFICATE AUTHORITY, C=CN, Issuer:CN=BJCA Global Root CA1, O=BEIJING CERTIFICATE AUTHORITY, C=CN, Key type:RSA, Length:4096, Cert Id:2405703929, Valid from:12/19/19, 3:16 AM, Valid until:12/12/44, 3:16 AM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:09:83:f4, Subject:CN=D-TRUST Root Class 3 CA 2 EV 2009, O=D-Trust GmbH, C=DE, Issuer:CN=D-TRUST Root Class 3 CA 2 EV 2009, O=D-Trust GmbH, C=DE, Key type:RSA, Length:2048, Cert Id:971313728, Valid from:11/5/09, 8:50 AM, Valid until:11/5/29, 8:50 AM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withECDSA, Serial:00, Subject:CN=Hellenic Academic and Research Institutions ECC RootCA 2015, O=Hellenic Academic and Research Institutions Cert. Authority, L=Athens, C=GR, Issuer:CN=Hellenic Academic and Research Institutions ECC RootCA 2015, O=Hellenic Academic and Research Institutions Cert. Authority, L=Athens, C=GR, Key type:EC, Length:384, Cert Id:513613456, Valid from:7/7/15, 10:37 AM, Valid until:6/30/40, 10:37 AM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:03:3a:f1:e6:a7:11:a9:a0:bb:28:64:b1:1d:09:fa:e5, Subject:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:1136084297, Valid from:8/1/13, 12:00 PM, Valid until:1/15/38, 12:00 PM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:16:15:c7:c3:d8:49:a7:be:69:0c:8a:88:ed:f0:70:f9:dd:b7:3e:87, Subject:CN=SecureSign Root CA15, O="Cybertrust Japan Co., Ltd.", C=JP, Issuer:CN=SecureSign Root CA15, O="Cybertrust Japan Co., Ltd.", C=JP, Key type:EC, Length:384, Cert Id:87882820, Valid from:4/8/20, 8:32 AM, Valid until:4/8/45, 8:32 AM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:01, Subject:CN=T-TeleSec GlobalRoot Class 3, OU=T-Systems Trust Center, O=T-Systems Enterprise Services GmbH, C=DE, Issuer:CN=T-TeleSec GlobalRoot Class 3, OU=T-Systems Trust Center, O=T-Systems Enterprise Services GmbH, C=DE, Key type:RSA, Length:2048, Cert Id:1894096264, Valid from:10/1/08, 10:29 AM, Valid until:10/1/33, 11:59 PM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:2d:dd:ac:ce:62:97:94:a1:43:e8:b0:cd:76:6a:5e:60, Subject:CN=HiPKI Root CA - G1, O="Chunghwa Telecom Co., Ltd.", C=TW, Issuer:CN=HiPKI Root CA - G1, O="Chunghwa Telecom Co., Ltd.", C=TW, Key type:RSA, Length:4096, Cert Id:2278609152, Valid from:2/22/19, 9:46 AM, Valid until:12/31/37, 3:59 PM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:2e:f5:9b:02:28:a7:db:7a:ff:d5:a3:a9:ee:bd:03:a0:cf:12:6a:1d, Subject:CN=QuoVadis Root CA 3 G3, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 3 G3, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:3589344305, Valid from:1/12/12, 8:26 PM, Valid until:1/12/42, 8:26 PM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withECDSA, Serial:01:54:48:ef:21:fd:97:59:0d:f5:04:0a, Subject:CN=e-Szigno Root CA 2017, OID.2.5.4.97=VATHU-23584497, O=Microsec Ltd., L=Budapest, C=HU, Issuer:CN=e-Szigno Root CA 2017, OID.2.5.4.97=VATHU-23584497, O=Microsec Ltd., L=Budapest, C=HU, Key type:EC, Length:256, Cert Id:3303793581, Valid from:8/22/17, 12:07 PM, Valid until:8/22/42, 12:07 PM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:21:d6:d0:4a:4f:25:0f:c9:32:37:fc:aa:5e:12:8d:e9, Subject:CN=Certum Trusted Network CA 2, OU=Certum Certification Authority, O=Unizeto Technologies S.A., C=PL, Issuer:CN=Certum Trusted Network CA 2, OU=Certum Certification Authority, O=Unizeto Technologies S.A., C=PL, Key type:RSA, Length:4096, Cert Id:1983350452, Valid from:10/6/11, 8:39 AM, Valid until:10/6/46, 8:39 AM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:00:ae:cf:00:ba:c4:cf:32:f8:43:b2, Subject:CN=emSign Root CA - C1, O=eMudhra Inc, OU=emSign PKI, C=US, Issuer:CN=emSign Root CA - C1, O=eMudhra Inc, OU=emSign PKI, C=US, Key type:RSA, Length:2048, Cert Id:3026103940, Valid from:2/18/18, 6:30 PM, Valid until:2/18/43, 6:30 PM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:01:94:30:1e:a2:0b:dd:f5:c5:33:2a:b1:43:44:71:f8:d6:50:4d:0d, Subject:CN=NAVER Global Root Certification Authority, O=NAVER BUSINESS PLATFORM Corp., C=KR, Issuer:CN=NAVER Global Root Certification Authority, O=NAVER BUSINESS PLATFORM Corp., C=KR, Key type:RSA, Length:4096, Cert Id:1777546867, Valid from:8/18/17, 8:58 AM, Valid until:8/18/37, 11:59 PM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:7c:c9:8f:2b:84:d7:df:ea:0f:c9:65:9a:d3:4b:4d:96, Subject:CN=D-TRUST BR Root CA 1 2020, O=D-Trust GmbH, C=DE, Issuer:CN=D-TRUST BR Root CA 1 2020, O=D-Trust GmbH, C=DE, Key type:EC, Length:384, Cert Id:4211149558, Valid from:2/11/20, 9:45 AM, Valid until:2/11/35, 9:44 AM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:01:fd:6d:30:fc:a3:ca:51:a8:1b:bc:64:0e:35:03:2d, Subject:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Issuer:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:RSA, Length:4096, Cert Id:3947601401, Valid from:2/1/10, 12:00 AM, Valid until:1/18/38, 11:59 PM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:23:f9:c3:d6:35:af:8f:28:4b:1f:f0:54:ea:7e:97:9d, Subject:CN=OISTE Server Root ECC G1, O=OISTE Foundation, C=CH, Issuer:CN=OISTE Server Root ECC G1, O=OISTE Foundation, C=CH, Key type:EC, Length:384, Cert Id:1304216476, Valid from:5/31/23, 2:42 PM, Valid until:5/24/48, 2:42 PM
  2026-10-23 14:19:48,943 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:00:8e:0f:f9:4b:90:71:68:65:33:54:f4:d4:44:39:b7:e0, Subject:CN=Certainly Root R1, O=Certainly, C=US, Issuer:CN=Certainly Root R1, O=Certainly, C=US, Key type:RSA, Length:4096, Cert Id:2255958535, Valid from:4/1/21, 12:00 AM, Valid until:4/1/46, 12:00 AM
  2026-10-23 14:19:48,944 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:00:82:10:cf:b0:d2:40:e3:59:44:63:e0:bb:63:82:8b:00, Subject:CN=ISRG Root X1, O=Internet Security Research Group, C=US, Issuer:CN=ISRG Root X1, O=Internet Security Research Group, C=US, Key type:RSA, Length:4096, Cert Id:1521974916, Valid from:6/4/15, 11:04 AM, Valid until:6/4/35, 11:04 AM
  2026-10-23 14:19:48,944 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:7d:09:97:fe:f0:47:ea:7a, Subject:CN=GDCA TrustAUTH R5 ROOT, O="GUANG DONG CERTIFICATE AUTHORITY CO.,LTD.", C=CN, Issuer:CN=GDCA TrustAUTH R5 ROOT, O="GUANG DONG CERTIFICATE AUTHORITY CO.,LTD.", C=CN, Key type:RSA, Length:4096, Cert Id:494136981, Valid from:11/26/14, 5:13 AM, Valid until:12/31/40, 3:59 PM
  2026-10-23 14:19:48,944 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:0a:01:42:80:00:00:01:45:23:cf:46:7c:00:00:00:02, Subject:CN=IdenTrust Public Sector Root CA 1, O=IdenTrust, C=US, Issuer:CN=IdenTrust Public Sector Root CA 1, O=IdenTrust, C=US, Key type:RSA, Length:4096, Cert Id:2123370772, Valid from:1/16/14, 5:53 PM, Valid until:1/16/34, 5:53 PM
  2026-10-23 14:19:48,944 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:56:b6:29:cd:34:bc:78:f6, Subject:CN=SSL.com EV Root Certification Authority RSA R2, O=SSL Corporation, L=Houston, ST=Texas, C=US, Issuer:CN=SSL.com EV Root Certification Authority RSA R2, O=SSL Corporation, L=Houston, ST=Texas, C=US, Key type:RSA, Length:4096, Cert Id:1381862403, Valid from:5/31/17, 6:14 PM, Valid until:5/30/42, 6:14 PM
  2026-10-23 14:19:49,052 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1)  TLSHandshake: logindes.caixa.gov.br:443, TLSv1.2, TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, 1321442559
  2026-10-23 14:19:49,056 DEBUG [io.net.han.ssl.SslHandler] (vert.x-eventloop-thread-1) [id: 0xd1929677, L:/192.168.30.14:39530 - R:logindes.caixa.gov.br/10.116.81.75:443] HANDSHAKEN: protocol:TLSv1.2 cipher suite:TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256
  2026-10-23 14:19:49,235 WARN  [io.qua.ope.run.tra.int.ver.OpenTelemetryVertxTracingFactory$VertxDelegator] (vert.x-eventloop-thread-1) VertxTracer delegate not set. Will not submit this trace. SpanKind: RPC; Request: io.vertx.core.http.impl.HttpRequestHead@1948a907; Operation:GET.
  2026-10-23 14:19:49,337 WARN  [io.qua.ope.run.tra.int.ver.OpenTelemetryVertxTracingFactory$VertxDelegator] (vert.x-eventloop-thread-1) VertxTracer delegate not set. Will not submit this trace. Response: io.vertx.core.http.impl.HttpResponseHead@367db94c; Failure: null.
  2026-10-23 14:19:50,079 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:00:bf:91:15:f6:92:0e:ba:9c:fd:c1:01:58:7a:74:02:cc, Subject:CN=logindes.caixa.gov.br, Issuer:CN=Sectigo Public Server Authentication CA DV R36, O=Sectigo Limited, C=GB, Key type:RSA, Length:2048, Cert Id:1321442559, Valid from:6/16/26, 12:00 AM, Valid until:12/31/26, 11:59 PM
  2026-10-23 14:19:50,128 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:39:7a:66:cc:27:56:36:2e:0d:aa:87:ca:6e:ab:e3:b1, Subject:CN=Sectigo Public Server Authentication CA DV R36, O=Sectigo Limited, C=GB, Issuer:CN=Sectigo Public Server Authentication Root R46, O=Sectigo Limited, C=GB, Key type:RSA, Length:3072, Cert Id:1180805919, Valid from:3/22/21, 12:00 AM, Valid until:3/21/36, 11:59 PM
  2026-10-23 14:19:50,129 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) ValidationChain: 3806652169, 1180805919, 1321442559
  2026-10-23 14:19:50,154 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1)  TLSHandshake: logindes.caixa.gov.br:443, TLSv1.2, TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, 1321442559
  2026-10-23 14:19:50,154 DEBUG [io.net.han.ssl.SslHandler] (vert.x-eventloop-thread-1) [id: 0x8af381d6, L:/192.168.30.14:39542 - R:logindes.caixa.gov.br/10.116.81.75:443] HANDSHAKEN: protocol:TLSv1.2 cipher suite:TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256
  2026-10-23 14:19:50,154 WARN  [io.qua.ope.run.tra.int.ver.OpenTelemetryVertxTracingFactory$VertxDelegator] (vert.x-eventloop-thread-1) VertxTracer delegate not set. Will not submit this trace. SpanKind: RPC; Request: io.vertx.core.http.impl.HttpRequestHead@35ccc38c; Operation:GET.
  2026-10-23 14:19:50,179 WARN  [io.qua.ope.run.tra.int.ver.OpenTelemetryVertxTracingFactory$VertxDelegator] (vert.x-eventloop-thread-1) VertxTracer delegate not set. Will not submit this trace. Response: io.vertx.core.http.impl.HttpResponseHead@30296bd5; Failure: null.
  2026-10-23 14:19:50,182 DEBUG [io.qua.oid.run.OidcProviderClientImpl] (vert.x-eventloop-thread-1) Get verification JWT Key Set at https://logindes.caixa.gov.br/auth/realms/internet/protocol/openid-connect/certs
  2026-10-23 14:19:50,183 WARN  [io.qua.ope.run.tra.int.ver.OpenTelemetryVertxTracingFactory$VertxDelegator] (vert.x-eventloop-thread-1) VertxTracer delegate not set. Will not submit this trace. SpanKind: RPC; Request: io.vertx.core.http.impl.HttpRequestHead@5d0c1079; Operation:GET.
  2026-10-23 14:19:50,229 WARN  [io.qua.ope.run.tra.int.ver.OpenTelemetryVertxTracingFactory$VertxDelegator] (vert.x-eventloop-thread-1) VertxTracer delegate not set. Will not submit this trace. Response: io.vertx.core.http.impl.HttpResponseHead@29918b90; Failure: null.
  2026-10-23 14:19:50,229 DEBUG [io.qua.oid.run.OidcProviderClientImpl] (vert.x-eventloop-thread-1) Request succeeded: {"keys":[{"kid":"olg3hbVEM3_gRt1DdpXMwOXtS-E2MQQDb0Bhw6IvZdo","kty":"RSA","alg":"RS256","use":"sig","n":"xz8PNmiUW5J1669pWY0APB4flqqDnghAv_QV5DIHyXE39fj9u1DPXbgfDUhUfK0i_B0CHJukbI44Rgo_vuhCMImTnLjS49XuTH6GI4lU_CtdzE_qACMO_GUky73m0Uszo2Bh1wNV-fvw_mMQVAGKj6_qXjSB9npRZKydoXnwGPIepcrqF6KkMJIFtZ-0w35J9SYwgLNezUbAJgs9dq3yMj4ussSfxMFcUC9UKziJJSg0UQfl0fOQGMsrsnUbS2GgXeDqdskbZq9_wfL0ikU2pWf0hKjX-PXtqZI0SVWurVyydc0efbTE7qIlrwF8lWZ8NZ8zcV2oVk7TjoIktZ4zBw","e":"AQAB"}]}
  2026-10-23 14:19:50,349 FINE  [io.ope.sdk.int.JavaVersionSpecific] (main) Using the APIs optimized for: Java 9+
  2026-10-23 14:19:50,434 FINE  [io.qua.ope.run.met.spi.MetricsExporterCDIProvider] (main) available exporters: io.quarkus.opentelemetry.runtime.exporter.otlp.metrics.VertxGrpcMetricExporter
  2026-10-23 14:19:50,529 FINE  [io.qua.ope.run.log.spi.LogsExporterCDIProvider] (main) available exporters: io.quarkus.opentelemetry.runtime.exporter.otlp.logs.VertxGrpcLogRecordExporter
  2026-10-23 14:19:50,529 FINE  [io.qua.ope.run.log.spi.LogsExporterCDIProvider] (main) using exporter: io.quarkus.opentelemetry.runtime.exporter.otlp.logs.VertxGrpcLogRecordExporter
  2026-10-23 14:19:50,535 FINE  [io.ope.sdk.aut.AutoConfiguredOpenTelemetrySdkBuilder] (main) Global OpenTelemetry set to OpenTelemetrySdk{tracerProvider=SdkTracerProvider{clock=SystemClock{}, idGenerator=RandomIdGenerator{}, resource=Resource{schemaUrl=null, attributes={host.name="siplx-plataforma-geracao-relatorios-des-8448ff68f5-2rlbh", service.instance.id="siplx-plataforma-geracao-relatorios-des-8448ff68f5-2rlbh", service.name="SIPLX-API-PLATAFORMA-GESTAO-RELATORIOS-DES", service.version="1.0.0", telemetry.sdk.language="java", telemetry.sdk.name="opentelemetry", telemetry.sdk.version="1.44.1", webengine.name="Quarkus", webengine.version="3.19.4"}}, spanLimitsSupplier=SpanLimitsValue{maxNumberOfAttributes=128, maxNumberOfEvents=128, maxNumberOfLinks=128, maxNumberOfAttributesPerEvent=128, maxNumberOfAttributesPerLink=128, maxAttributeValueLength=2147483647}, sampler=io.quarkus.opentelemetry.runtime.tracing.DropTargetsSampler@52227eb2, spanProcessor=MultiSpanProcessor{spanProcessorsStart=[], spanProcessorsEnding=[], spanProcessorsEnd=[BatchSpanProcessor{spanExporter=NoopSpanExporter{}, exportUnsampledSpans=false, scheduleDelayNanos=5000000000, maxExportBatchSize=512, exporterTimeoutNanos=30000000000}, io.quarkus.opentelemetry.runtime.exporter.otlp.tracing.LateBoundSpanProcessor@5ad1904f], spanProcessorsAll=[BatchSpanProcessor{spanExporter=NoopSpanExporter{}, exportUnsampledSpans=false, scheduleDelayNanos=5000000000, maxExportBatchSize=512, exporterTimeoutNanos=30000000000}, io.quarkus.opentelemetry.runtime.exporter.otlp.tracing.LateBoundSpanProcessor@5ad1904f]}}, meterProvider=SdkMeterProvider{clock=SystemClock{}, resource=Resource{schemaUrl=null, attributes={host.name="siplx-plataforma-geracao-relatorios-des-8448ff68f5-2rlbh", service.instance.id="siplx-plataforma-geracao-relatorios-des-8448ff68f5-2rlbh", service.name="SIPLX-API-PLATAFORMA-GESTAO-RELATORIOS-DES", service.version="1.0.0", telemetry.sdk.language="java", telemetry.sdk.name="opentelemetry", telemetry.sdk.version="1.44.1", webengine.name="Quarkus", webengine.version="3.19.4"}}, metricReaders=[PeriodicMetricReader{exporter=io.quarkus.opentelemetry.runtime.exporter.otlp.metrics.VertxGrpcMetricExporter@f438904, intervalNanos=60000000000}], metricProducers=[], views=[]}, loggerProvider=SdkLoggerProvider{clock=SystemClock{}, resource=Resource{schemaUrl=null, attributes={host.name="siplx-plataforma-geracao-relatorios-des-8448ff68f5-2rlbh", service.instance.id="siplx-plataforma-geracao-relatorios-des-8448ff68f5-2rlbh", service.name="SIPLX-API-PLATAFORMA-GESTAO-RELATORIOS-DES", service.version="1.0.0", telemetry.sdk.language="java", telemetry.sdk.name="opentelemetry", telemetry.sdk.version="1.44.1", webengine.name="Quarkus", webengine.version="3.19.4"}}, logLimits=LogLimits{maxNumberOfAttributes=128, maxAttributeValueLength=2147483647}, logRecordProcessor=BatchLogRecordProcessor{logRecordExporter=io.quarkus.opentelemetry.runtime.exporter.otlp.logs.VertxGrpcLogRecordExporter@4ed5a1b0, scheduleDelayNanos=1000000000, maxExportBatchSize=512, exporterTimeoutNanos=30000000000}}, propagators=DefaultContextPropagators{textMapPropagator=MultiTextMapPropagator{textMapPropagators=[W3CTraceContextPropagator, W3CBaggagePropagator]}}} by autoconfiguration
  2026-10-23 14:19:50,540 FINE  [io.ope.ins.api.int.EmbeddedInstrumentationProperties] (main) Did not find embedded instrumentation properties file META-INF/io/opentelemetry/instrumentation/io.quarkus.opentelemetry.properties
  2026-10-23 14:19:50,548 FINE  [io.ope.ins.api.int.EmbeddedInstrumentationProperties] (main) Did not find embedded instrumentation properties file META-INF/io/opentelemetry/instrumentation/io.quarkus.opentelemetry.properties
  2026-10-23 14:19:50,550 FINE  [io.ope.ins.api.int.EmbeddedInstrumentationProperties] (main) Did not find embedded instrumentation properties file META-INF/io/opentelemetry/instrumentation/io.quarkus.opentelemetry.properties
  2026-10-23 14:19:50,550 FINE  [io.ope.ins.api.int.EmbeddedInstrumentationProperties] (main) Did not find embedded instrumentation properties file META-INF/io/opentelemetry/instrumentation/io.quarkus.opentelemetry.properties
  2026-10-23 14:19:53,033 INFO  [io.quarkus] (main) siplx-api-plataforma-geracao-relatorios 1.0.0 on JVM (powered by Quarkus 3.19.4) started in 8.710s. Listening on: http://0.0.0.0:8080
  2026-10-23 14:19:53,036 INFO  [io.quarkus] (main) Profile prod activated.
  2026-10-23 14:19:53,036 INFO  [io.quarkus] (main) Installed features: [cdi, hibernate-validator, oidc, oidc-client, opentelemetry, rest, rest-client, rest-client-jackson, rest-client-oidc-filter, rest-jackson, security, smallrye-context-propagation, smallrye-health, smallrye-jwt, smallrye-openapi, swagger-ui, vertx]
  
  ================================================
  Script executado com sucesso!
  Pod utilizado: siplx-plataforma-geracao-relatorios-des-8448ff68f5-2rlbh
17s
Run caixagithub/DevSecOps-Actions/.github/integrations/apim/import/dotnet@main
  with:
    aks_url: siplx-plataforma-geracao-relatorios.apl.des.private.azure
    apim_service_name: siplx-plataforma-geracao-relatorios-des
    resource_group: rg-plx-nprd
    apim_name: apim-external-general-plx-nprd
    client_id_runner: ***
    subscription_id: 1aed8ab6-41aa-40c5-a53b-92227ae1f525
    protocolo_conexao: http
    apim_path_api: /siplx-plataforma-geracao-relatorios-des
  env:
    APIM_VERSIONAPI: 
    APIM_displaynameAPI: 
    APIM_PATH: 
    APIM_SWAGGERPATH: 
    APIM_TAGSAPI: 
    APIM_POLICIESALLOPERATIONSPATH: 
    AZ_INSTALL_STATUS: ms_repo_ok
    AZ_VERSION: latest
    INSTALL_PREREQUISITES: true
    AZ_LATEST_VERSION: 2.91.0
    environment: des
    repository_suffix: infranprd
    REPO: siplx-plataforma-geracao-relatorios
    JOB_ID: 167585
    ARGOCD_AUTH_TOKEN: ***
    REPO_NAME: siplx-plataforma-geracao-relatorios
    AMBIENTE_LOWER: des
Install Az CLI
16s
Run curl -sL https://aka.ms/InstallAzureCLIDeb | sudo bash
    curl -sL https://aka.ms/InstallAzureCLIDeb | sudo bash
    sudo az aks install-cli
    shell: /usr/bin/bash --noprofile --norc -e -o pipefail {0}
    env:
      APIM_VERSIONAPI: 
      APIM_displaynameAPI: 
      APIM_PATH: 
      APIM_SWAGGERPATH: 
      APIM_TAGSAPI: 
      APIM_POLICIESALLOPERATIONSPATH: 
      AZ_INSTALL_STATUS: ms_repo_ok
      AZ_VERSION: latest
      INSTALL_PREREQUISITES: true
      AZ_LATEST_VERSION: 2.91.0
      environment: des
      repository_suffix: infranprd
      REPO: siplx-plataforma-geracao-relatorios
      JOB_ID: 167585
      ARGOCD_AUTH_TOKEN: ***
      REPO_NAME: siplx-plataforma-geracao-relatorios
      AMBIENTE_LOWER: des
  Hit:1 https://cli.github.com/packages stable InRelease
  Hit:2 https://packages.microsoft.com/repos/azure-cli noble InRelease
  Hit:3 https://packages.microsoft.com/ubuntu/24.04/prod noble InRelease
  Hit:4 https://deb.nodesource.com/node_24.x nodistro InRelease
  Hit:5 https://dl.google.com/linux/chrome-stable/deb stable InRelease
  Hit:6 https://prod-cdn.packages.k8s.io/repositories/isv:/kubernetes:/core:/stable:/v1.34/deb  InRelease
  Hit:7 http://archive.ubuntu.com/ubuntu noble InRelease
  Hit:9 http://security.ubuntu.com/ubuntu noble-security InRelease
  Hit:10 http://archive.ubuntu.com/ubuntu noble-updates InRelease
  Hit:11 http://archive.ubuntu.com/ubuntu noble-backports InRelease
  Hit:12 https://ppa.launchpadcontent.net/git-core/ppa/ubuntu noble InRelease
  Hit:8 https://packages.buildkite.com/helm-linux/helm-debian/any any InRelease
  Hit:13 https://ppa.launchpadcontent.net/mozillateam/ppa/ubuntu noble InRelease
  Reading package lists...
  Reading package lists...
  Building dependency tree...
  Reading state information...
  apt-transport-https is already the newest version (2.8.3).
  ca-certificates is already the newest version (20260816ubuntu0.24.04.1).
  curl is already the newest version (8.5.0-2ubuntu10.16).
  gnupg is already the newest version (2.4.4-2ubuntu17.6).
  lsb-release is already the newest version (12.0-2).
  0 upgraded, 0 newly installed, 0 to remove and 95 not upgraded.
  Types: deb
  URIs: https://packages.microsoft.com/repos/azure-cli/
  Suites: noble
  Components: main
  Architectures: amd64
  Signed-by: /etc/apt/keyrings/microsoft.gpg
  Hit:1 https://cli.github.com/packages stable InRelease
  Hit:2 https://deb.nodesource.com/node_24.x nodistro InRelease
  Hit:3 https://packages.microsoft.com/repos/azure-cli noble InRelease
  Hit:4 https://dl.google.com/linux/chrome-stable/deb stable InRelease
  Hit:5 https://prod-cdn.packages.k8s.io/repositories/isv:/kubernetes:/core:/stable:/v1.34/deb  InRelease
  Hit:6 https://packages.microsoft.com/ubuntu/24.04/prod noble InRelease
  Hit:7 http://security.ubuntu.com/ubuntu noble-security InRelease
  Hit:8 http://archive.ubuntu.com/ubuntu noble InRelease
  Hit:10 http://archive.ubuntu.com/ubuntu noble-updates InRelease
  Hit:11 http://archive.ubuntu.com/ubuntu noble-backports InRelease
  Hit:12 https://ppa.launchpadcontent.net/git-core/ppa/ubuntu noble InRelease
  Hit:13 https://ppa.launchpadcontent.net/mozillateam/ppa/ubuntu noble InRelease
  Hit:9 https://packages.buildkite.com/helm-linux/helm-debian/any any InRelease
  Reading package lists...
  Reading package lists...
  Building dependency tree...
  Reading state information...
  azure-cli is already the newest version (2.91.0-1~noble).
  0 upgraded, 0 newly installed, 0 to remove and 95 not upgraded.
  WARNING: The detected architecture of current device is "x86_64", and the binary for "amd64" will be downloaded. If the detection is wrong, please download and install the binary corresponding to the appropriate architecture.
  WARNING: No version specified, will get the latest version of kubectl from "https://dl.k8s.io/release/stable.txt"
  WARNING: Downloading client to "/usr/local/bin/kubectl" from "https://dl.k8s.io/release/v1.37.1/bin/linux/amd64/kubectl"
  WARNING: Please ensure that /usr/local/bin is in your search PATH, so the `kubectl` command can be found.
  WARNING: No version specified, will get the latest version of kubelogin from "https://api.github.com/repos/Azure/kubelogin/releases/latest"
  WARNING: Downloading client to "/tmp/tmpc8kperkh/kubelogin.zip" from "https://github.com/Azure/kubelogin/releases/download/v0.2.21/kubelogin.zip"
  WARNING: Moving binary to "/usr/local/bin/kubelogin" from "/tmp/tmpc8kperkh/bin/linux_amd64/kubelogin"
  WARNING: Please ensure that /usr/local/bin is in your search PATH, so the `kubelogin` command can be found.
Login on Azure
1s
Run az login --identity --client-id *** --output none
    az login --identity --client-id *** --output none
    az account set -s 1aed8ab6-41aa-40c5-a53b-92227ae1f525
    shell: /usr/bin/bash --noprofile --norc -e -o pipefail {0}
    env:
      APIM_VERSIONAPI: 
      APIM_displaynameAPI: 
      APIM_PATH: 
      APIM_SWAGGERPATH: 
      APIM_TAGSAPI: 
      APIM_POLICIESALLOPERATIONSPATH: 
      AZ_INSTALL_STATUS: ms_repo_ok
      AZ_VERSION: latest
      INSTALL_PREREQUISITES: true
      AZ_LATEST_VERSION: 2.91.0
      environment: des
      repository_suffix: infranprd
      REPO: siplx-plataforma-geracao-relatorios
      JOB_ID: 167585
      ARGOCD_AUTH_TOKEN: ***
      REPO_NAME: siplx-plataforma-geracao-relatorios
      AMBIENTE_LOWER: des
Publish API to APIM
0s
Run set -x  # Ativa o modo de depuração
    set -x  # Ativa o modo de depuração
    echo "Iniciando a publicação da API para APIM..."
    
    swaggerUrl="http://siplx-plataforma-geracao-relatorios.apl.des.private.azure/"
    echo "Verificando a URL do Swagger: $swaggerUrl"
    httpStatus=$(curl -k --max-time 10 --write-out "%{http_code}" --silent --output /dev/null $swaggerUrl)
    echo "HTTP STATUS=$httpStatus"
    
    if [ "$httpStatus" -eq 200 ]; then
      echo "Swagger JSON encontrado na URL padrão. Prosseguindo com a validação..."
      curl -k -o swagger.json "$swaggerUrl"
      echo "Swagger JSON baixado com sucesso."
    
      az apim api import --api-id siplx-plataforma-geracao-relatorios-des \
      --resource-group rg-plx-nprd \
      --service-name apim-external-general-plx-nprd \
      --service-url http://siplx-plataforma-geracao-relatorios.apl.des.private.azure \
      --path /siplx-plataforma-geracao-relatorios-des \
      --specification-format "OpenApi" \
      --specification-path swagger.json \
      --display-name siplx-plataforma-geracao-relatorios-des \
      --subscription-required false --verbose
      echo "API importada com sucesso no APIM."
    
      echo "Acesse: http://siplx-plataforma-geracao-relatorios.apl.des.private.azure/"
    
    else
      echo "Swagger JSON não encontrado ou erro ao acessar $swaggerUrl. Código de status HTTP: $httpStatus. A publicação foi cancelada."
      exit 1
    fi
    set +x  # Desativa o modo de depuração
    shell: /usr/bin/bash --noprofile --norc -e -o pipefail {0}
    env:
      APIM_VERSIONAPI: 
      APIM_displaynameAPI: 
      APIM_PATH: 
      APIM_SWAGGERPATH: 
      APIM_TAGSAPI: 
      APIM_POLICIESALLOPERATIONSPATH: 
      AZ_INSTALL_STATUS: ms_repo_ok
      AZ_VERSION: latest
      INSTALL_PREREQUISITES: true
      AZ_LATEST_VERSION: 2.91.0
      environment: des
      repository_suffix: infranprd
      REPO: siplx-plataforma-geracao-relatorios
      JOB_ID: 167585
      ARGOCD_AUTH_TOKEN: ***
      REPO_NAME: siplx-plataforma-geracao-relatorios
      AMBIENTE_LOWER: des
  + echo 'Iniciando a publicação da API para APIM...'
  Iniciando a publicação da API para APIM...
  + swaggerUrl=http://siplx-plataforma-geracao-relatorios.apl.des.private.azure/
  + echo 'Verificando a URL do Swagger: http://siplx-plataforma-geracao-relatorios.apl.des.private.azure/'
  Verificando a URL do Swagger: http://siplx-plataforma-geracao-relatorios.apl.des.private.azure/
  ++ curl -k --max-time 10 --write-out '%{http_code}' --silent --output /dev/null http://siplx-plataforma-geracao-relatorios.apl.des.private.azure/
  + httpStatus=000
  Error: Process completed with exit code 6.
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




essa auqi rodu a 41 min atras
