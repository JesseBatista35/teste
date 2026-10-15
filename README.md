app:
  name: siarx-backend-autoridade-registro-des
project:
  name: des
labels:
  appName: siarx-backend-autoridade-registro
  environment: des
source:
  repo: "https://github.com/caixagithub/siarx-backend-autoridade-registro-infranprd"
  path: des
sourcevar:
  repo: "https://github.com/caixagithub/siarx-globalnprd"
  path: des
  values: global.yaml  
cluster:
  destination:  
    name: aks-siarx-nprd
    namespace: siarx-backend-autoridade-registro

    ajustei e rodei uma nova buildo



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
caixagithub/siarx-backend-autoridade-registro_main_38740866749.2 #2
All jobs
Run details
CI_DES / BUILD / BUILD
Started 3m ago
Search logs
7s
1s
1s
1s
13s
0s
10s
1m 14s
0s
46s
            "OCI exporter": true
          },
          "labels": {
            "org.mobyproject.buildkit.worker.executor": "oci",
            "org.mobyproject.buildkit.worker.hostname": "ec1f7efc4609",
            "org.mobyproject.buildkit.worker.network": "host",
            "org.mobyproject.buildkit.worker.oci.process-mode": "sandbox",
            "org.mobyproject.buildkit.worker.selinux.enabled": "false",
            "org.mobyproject.buildkit.worker.snapshotter": "overlayfs"
          },
          "gcPolicy": [
            {
              "all": false,
              "filter": [
                "type==source.local type==exec.cachemount type==source.git.checkout"
              ],
              "keepDuration": "48h0m0s",
              "maxUsedSpace": "488.3MiB"
            },
            {
              "all": false,
              "keepDuration": "1440h0m0s",
              "reservedSpace": "9.313GiB",
              "maxUsedSpace": "92.2GiB",
              "minFreeSpace": "23.28GiB"
            },
            {
              "all": false,
              "reservedSpace": "9.313GiB",
              "maxUsedSpace": "92.2GiB",
              "minFreeSpace": "23.28GiB"
            },
            {
              "all": true,
              "reservedSpace": "9.313GiB",
              "maxUsedSpace": "92.2GiB",
              "minFreeSpace": "23.28GiB"
            }
          ]
        }
      ],
      "name": "builder-68d1f00b-dfb7-4524-a989-47cbd7a6832a",
      "driver": "docker-container",
      "lastActivity": "2026-10-15T13:16:26.000Z"
    }
BuildKit version
Connecting on Registry
3s
Run set -euo pipefail
  Connecting to Azure Container Registry...
  WARNING: Note: The token in both the accessToken and refreshToken fields is an ACR Refresh Token, not an ACR Access Token. This ACR Refresh Token cannot be used directly to authenticate with registry APIs such as pushing/pulling images and listing repositories/tags. This ACR Refresh Token must be subsequently exchanged for an ACR Access.Please see https://aka.ms/acr/auth/oauth
  WARNING: You can perform manual login using the provided refresh token below, for example: 'docker login loginServer -u 00000000-0000-0000-0000-000000000000 -p refreshToken'
  IMAGE=acrcentralcaixanprd.azurecr.io/siarx/backend-autoridade-registro/siarx-backend-autoridade-registro
Login to Docker
1s
Run docker/login-action@v3
    
  Logging into acrcentralcaixanprd.azurecr.io...
  (node:3485) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
  (Use `node --trace-deprecation ...` to show where the warning was created)
  Login Succeeded!
Docker meta
2s
Run docker/metadata-action@v5
    
  (node:3508) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
  (Use `node --trace-deprecation ...` to show where the warning was created)
Context info
Processing images input
Processing tags input
Processing flavor input
0s
14s
1s
1s
0s
1s
0s
