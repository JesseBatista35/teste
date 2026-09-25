Avaliar erro ao tentar rodar a pipeline no github 

Prezados, ao tentarmos rodar as pipeline lines no github, estamos recebendo error.

Action: https://github.com/caixagithub/sisfm-mfe-host/actions/runs/36154830896/job/108137376620

Error:

Purge Cache
0s
Run echo "CUSTOM_DOMAIN=supergerenciador.des.caixa.gov.br"
  CUSTOM_DOMAIN=supergerenciador.des.caixa.gov.br
  * URL rejected: No host part in the URL
  * Closing connection
  curl: (3) URL rejected: No host part in the URL
  Error: Process completed with exit code 3.
Purge Cache
0s
Run echo "CUSTOM_DOMAIN=supergerenciador.des.caixa.gov.br"
  CUSTOM_DOMAIN=supergerenciador.des.caixa.gov.br
  * URL rejected: No host part in the URL
  * Closing connection
  curl: (3) URL rejected: No host part in the URL
  Error: Process completed with exit code 3.


Poderiam estar verificando, por favor?


Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
sisfm-mfe-host
Repository navigation
Code
Issues
Pull requests
Actions
Projects
Wiki
Security and quality
90
 (90)
Insights
Settings
CI/CD Workflow Generic
__. #60
All jobs
Run details
Annotations
1 error, 1 warning, and 1 notice
CI_DES / DEPLOY (DES)
failed 4 hours ago in 30s
Search logs
4s
1s
1s
7s
1s
1s
6s
4s
0s
Run caixagithub/DevSecOps-Actions/.github/integrations/azion/purge@main
  with:
    API_TOKEN: ***
    CUSTOM_DOMAIN: supergerenciador.des.caixa.gov.br
  env:
    DOCKER_TLS_VERIFY: 
    DOCKER_CERT_PATH: 
    pythonLocation: /opt/hostedtoolcache/Python/3.11.16/x64
    PKG_CONFIG_PATH: /opt/hostedtoolcache/Python/3.11.16/x64/lib/pkgconfig
    Python_ROOT_DIR: /opt/hostedtoolcache/Python/3.11.16/x64
    Python2_ROOT_DIR: /opt/hostedtoolcache/Python/3.11.16/x64
    Python3_ROOT_DIR: /opt/hostedtoolcache/Python/3.11.16/x64
    LD_LIBRARY_PATH: /opt/hostedtoolcache/Python/3.11.16/x64/lib
    ACCOUNT_KEY: 143495498779
    TESTE_FRONT_GERAL: qualquer_coisa
    LANGUAGE: node
    NODE_VERSION: v24.x
    BUILD_OUTPUT_DIRECTORY: dist
    BUCKET: s3-sisfm-mfe-host-des-nprd
    CLOUD_DISTRIBUTION_ID: E1YXXFWO38TOGA
    AWS_DEFAULT_REGION: sa-east-1
    AWS_REGION: sa-east-1
    AWS_ACCESS_KEY_ID: ***
    AWS_SECRET_ACCESS_KEY: ***
    AWS_SESSION_TOKEN: ***
Purge Cache
0s
Run echo "CUSTOM_DOMAIN=supergerenciador.des.caixa.gov.br"
  CUSTOM_DOMAIN=supergerenciador.des.caixa.gov.br
  * URL rejected: No host part in the URL
  * Closing connection
  curl: (3) URL rejected: No host part in the URL
  Error: Process completed with exit code 3.
0s
0s
0s
1s
0s
0s
0s
