Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
sirmc-api-emailmarketing-rastreamento
Repository navigation
Code
Issues
Pull requests
Actions
Projects
Wiki
Security and quality
1
 (1)
Insights
Settings
APIM Workflow
APIM_main_30935041944.16 #16
All jobs
Run details
Annotations
1 error and 1 warning
API Management / APIM_BASIC / APIM_BASIC (DES)
failed 1 hour ago in 2m 28s
Search logs
2s
1s
0s
1s
1s
12s
2m 2s
  
  Setting up gnupg-utils (2.4.4-2ubuntu17.4) ...
  Setting up gnupg (2.4.4-2ubuntu17.4) ...
  Processing triggers for libc-bin (2.39-0ubuntu8.7) ...
  Types: deb
  URIs: https://packages.microsoft.com/repos/azure-cli/
  Suites: noble
  Components: main
  Architectures: amd64
  Signed-by: /etc/apt/keyrings/microsoft.gpg
  Get:1 https://packages.microsoft.com/repos/azure-cli noble InRelease [3564 B]
  Get:2 https://packages.microsoft.com/repos/azure-cli noble/main amd64 Packages [2375 B]
  Hit:3 https://ppa.launchpadcontent.net/git-core/ppa/ubuntu noble InRelease
  Hit:4 http://archive.ubuntu.com/ubuntu noble InRelease
  Hit:5 http://archive.ubuntu.com/ubuntu noble-updates InRelease
  Hit:6 http://archive.ubuntu.com/ubuntu noble-backports InRelease
  Hit:7 http://security.ubuntu.com/ubuntu noble-security InRelease
  Fetched 5939 B in 33s (180 B/s)
  Reading package lists...
  Reading package lists...
  Building dependency tree...
  Reading state information...
  The following NEW packages will be installed:
    azure-cli
  0 upgraded, 1 newly installed, 0 to remove and 22 not upgraded.
  Need to get 56.4 MB of archives.
  After this operation, 600 MB of additional disk space will be used.
  Get:1 https://packages.microsoft.com/repos/azure-cli noble/main amd64 azure-cli amd64 2.89.0-1~noble [56.4 MB]
  debconf: delaying package configuration, since apt-utils is not installed
  Fetched 56.4 MB in 1s (94.5 MB/s)
  Selecting previously unselected package azure-cli.
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
  (Reading database ... 14434 files and directories currently installed.)
  Preparing to unpack .../azure-cli_2.89.0-1~noble_amd64.deb ...
  Unpacking azure-cli (2.89.0-1~noble) ...
  Setting up azure-cli (2.89.0-1~noble) ...
  WARNING: The detected architecture of current device is "x86_64", and the binary for "amd64" will be downloaded. If the detection is wrong, please download and install the binary corresponding to the appropriate architecture.
  WARNING: No version specified, will get the latest version of kubectl from "https://dl.k8s.io/release/stable.txt"
  WARNING: Downloading client to "/usr/local/bin/kubectl" from "https://dl.k8s.io/release/v1.36.3/bin/linux/amd64/kubectl"
  WARNING: Please ensure that /usr/local/bin is in your search PATH, so the `kubectl` command can be found.
  WARNING: No version specified, will get the latest version of kubelogin from "https://api.github.com/repos/Azure/kubelogin/releases/latest"
  WARNING: Downloading client to "/tmp/tmp5axbwbt6/kubelogin.zip" from "https://github.com/Azure/kubelogin/releases/download/v0.2.19/kubelogin.zip"
  WARNING: Moving binary to "/usr/local/bin/kubelogin" from "/tmp/tmp5axbwbt6/bin/linux_amd64/kubelogin"
  WARNING: Please ensure that /usr/local/bin is in your search PATH, so the `kubelogin` command can be found.
Login on Azure
4s
Run az login --identity --client-id *** --output none
Publish API to APIM
0s
Run set -x  # Ativa o modo de depuração
  + echo 'Iniciando a publicação da API para APIM...'
  Iniciando a publicação da API para APIM...
  Verificando a URL do Swagger: http://sirmc-api-emailmarketing-rastreamento.apl.des.private.azure/swagger/v1/swagger.json
  + swaggerUrl=http://sirmc-api-emailmarketing-rastreamento.apl.des.private.azure/swagger/v1/swagger.json
  + echo 'Verificando a URL do Swagger: http://sirmc-api-emailmarketing-rastreamento.apl.des.private.azure/swagger/v1/swagger.json'
  ++ curl -k --max-time 10 --write-out '%{http_code}' --silent --output /dev/null http://sirmc-api-emailmarketing-rastreamento.apl.des.private.azure/swagger/v1/swagger.json
  + httpStatus=000
  Error: Process completed with exit code 6.
0s
0s
0s
1s
0s
