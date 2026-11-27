ANTES

{
  "options": [
    {
      "enabled": false,
      "definition": {
        "id": "5d58cc01-7c75-450c-be18-a388ddb129ec"
      },
      "inputs": {
        "branchFilters": "[\"+refs/heads/*\"]",
        "additionalFields": "{}"
      }
    },
    {
      "enabled": false,
      "definition": {
        "id": "a9db38f9-9fdc-478c-b0f9-464221e58316"
      },
      "inputs": {
        "workItemType": "Bug",
        "assignToRequestor": "true",
        "additionalFields": "{}"
      }
    }
  ],
  "triggers": [
    {
      "branchFilters": [
        "+refs/heads/liberty-to-quarkus"
      ],
      "pathFilters": [],
      "batchChanges": false,
      "maxConcurrentBuildsPerBranch": 1,
      "pollingInterval": 0,
      "triggerType": 2
    }
  ],
  "variables": {
    "ImageBuild_OKD": {
      "value": "quarkus-java-binary-s2i"
    },
    "nome_imagem": {
      "value": "quarkus-java-binary-s2i"
    },
    "SITE": {
      "value": "okd4_nprd",
      "allowOverride": true
    },
    "tag_imagem": {
      "value": "8.2-openjdk21.0.1"
    },
    "TemplateVersaoProduto_OKD": {
      "value": "8.2-openjdk21.0.1"
    },
    "version.app": {
      "value": "",
      "allowOverride": true
    },
    "HTTPS_PROXY": {
      "value": "http://proxynuvem.caixa:80"
    }
  },
  "variableGroups": [
    {
      "variables": {
        "ANSIBLE_INVENTORY": {
          "value": "$(HOME_ADS_AGENT)/$(DIR_ANSIBLE)/hosts"
        },
        "ANSIBLE_VAULT": {
          "value": null,
          "isSecret": true
        },
        "AZPAT": {
          "value": null,
          "isSecret": true
        },
        "AZUSER": {
          "value": "s736639"
        },
        "DIR_ANSIBLE": {
          "value": "esteira-qa"
        },
        "DOTNET_TESTARGS": {
          "value": "--configuration Release --collect \"code coverage\""
        },
        "FORTIFY_API": {
          "value": "https://novocodigoseguro.caixa/ssc/api/v1"
        },
        "FORTIFY_APITOKEN": {
          "value": null,
          "isSecret": true
        },
        "FORTIFY_BUILD_FILE": {
          "value": "."
        },
        "FORTIFY_CI_TOKEN": {
          "value": null,
          "isSecret": true
        },
        "FORTIFY_CLIENT_AUTH_TOKEN": {
          "value": null,
          "isSecret": true
        },
        "fortify_disable": {
          "value": "false"
        },
        "FORTIFY_PASS": {
          "value": null,
          "isSecret": true
        },
        "FORTIFY_POOL_COMPLEX_NOVO": {
          "value": "55e6b358-710a-4c3d-ad15-4a3ec96c3dca"
        },
        "FORTIFY_POOL_DIAMOND_NOVO": {
          "value": "9fa96d5a-3b13-4ecb-8639-e2ec97d1b4e9"
        },
        "FORTIFY_POOL_GOLD_NOVO": {
          "value": "1a3e11fe-719a-475a-905b-e61b743e550d"
        },
        "FORTIFY_POOL_MONOLITO_NOVO": {
          "value": "7c2e05fb-2f1d-4045-ac12-69c806df50be"
        },
        "FORTIFY_POOL_SILVER_NOVO": {
          "value": "794601f7-da27-467b-a734-06f92c4d63aa"
        },
        "FORTIFY_REGEX": {
          "value": "'(?:\\*\\/)?(\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})'"
        },
        "FORTIFY_REGISTRY_PASSWORD": {
          "value": null,
          "isSecret": true
        },
        "FORTIFY_REGISTRY_USERNAME": {
          "value": "ads-sa"
        },
        "FORTIFY_SENSOR_VERSION": {
          "value": "24.4"
        },
        "FORTIFY_TOKEN": {
          "value": null,
          "isSecret": true
        },
        "FORTIFY_UPTOKEN": {
          "value": null,
          "isSecret": true
        },
        "FORTIFY_URL": {
          "value": "https://sast.caixa/ssc"
        },
        "FORTIFY_URL_CONTROLLER": {
          "value": "http://sast.caixa/scancentral-ctrl"
        },
        "FORTIFY_USER": {
          "value": "admin"
        },
        "HOME_ADS_AGENT": {
          "value": "/opt/ads-agent"
        },
        "KEYSTORE_PWD": {
          "value": null,
          "isSecret": true
        },
        "KEYSTORE_SECUREFILEPATH": {
          "value": "/etc/pki/ca-trust/source/anchors/keystore-ssc24.jks"
        },
        "nexus_interno_pass": {
          "value": null,
          "isSecret": true
        },
        "nexus_interno_user": {
          "value": "pipeline-agil"
        },
        "NEXUS_REPOSITORY_ID": {
          "value": "NEXUS_INTERNO"
        },
        "NEXUS_URL_ANGULAR_RELEASE": {
          "value": "http://binario.caixa:8081/repository/caixa-raw-releases/angular"
        },
        "NEXUS_URL_ANGULAR_SNAPSHOT": {
          "value": "http://binario.caixa:8081/repository/caixa-raw-snapshots/angular"
        },
        "NEXUS_URL_ASP_RELEASE": {
          "value": "http://binario.caixa:8081/repository/caixa-raw-releases/asp"
        },
        "NEXUS_URL_ASP_SNAPHOT": {
          "value": "http://binario.caixa:8081/repository/caixa-raw-snapshots/asp"
        },
        "NEXUS_URL_CAIXA_GROUP": {
          "value": "http://binario.caixa:8081/repository/caixa-group-br/"
        },
        "NEXUS_URL_DOTNET_RELEASE": {
          "value": "http://binario.caixa:8081/repository/caixa-raw-releases/dotnet"
        },
        "NEXUS_URL_DOTNET_SNAPSHOT": {
          "value": "http://binario.caixa:8081/repository/caixa-raw-snapshots/dotnet"
        },
        "NEXUS_URL_MAVEN_RELEASE": {
          "value": "http://binario.caixa:8081/repository/releases"
        },
        "NEXUS_URL_MAVEN_SNAPSHOT": {
          "value": "http://binario.caixa:8081/repository/snapshots"
        },
        "NEXUS_URL_NODE_INTERNAL_RELEASE": {
          "value": "http://binario.caixa:8081/repository/npm-internal"
        },
        "NEXUS_URL_NODE_RELEASE": {
          "value": "http://binario.caixa:8081/repository/caixa-raw-releases/node"
        },
        "NEXUS_URL_NODE_SNAPSHOT": {
          "value": "http://binario.caixa:8081/repository/caixa-raw-snapshots/node"
        },
        "NEXUS_URL_NPM_RELEASE": {
          "value": "http://binario.caixa:8081/repository/caixa-npm-releases/"
        },
        "NEXUS_URL_NPM_SNAPSHOT": {
          "value": "http://binario.caixa:8081/repository/caixa-npm-snapshots/"
        },
        "NEXUS_URL_PHP_RELEASE": {
          "value": "http://binario.caixa:8081/repository/caixa-php-releases"
        },
        "NEXUS_URL_PHP_SNAPSHOT": {
          "value": "http://binario.caixa:8081/repository/caixa-php-snapshots"
        },
        "NEXUS_URL_RAW_RELEASE": {
          "value": "http://binario.caixa:8081/repository/caixa-raw-releases"
        },
        "NEXUS_URL_RAW_SNAPSHOT": {
          "value": "http://binario.caixa:8081/repository/caixa-raw-snapshots"
        },
        "NEXUS_URL_ZCONBT_RELEASE": {
          "value": "http://binario.caixa:8081/repository/caixa-raw-releases/zconbt"
        },
        "NEXUS_URL_ZCONBT_SNAPSHOT": {
          "value": "http://binario.caixa:8081/repository/caixa-raw-snapshots/zconbt"
        },
        "NODE_EXTRA_CA_CERTS": {
          "value": "/etc/pki/ca-trust/source/anchors/AC-V4.cer"
        },
        "SCANCENTRAL_URL": {
          "value": "http://scancentral.apps.produtos4.caixa/scancentral-ctrl"
        },
        "ScanCentral.ClientToken": {
          "value": null,
          "isSecret": true
        },
        "ScanCentral.SscCiToken": {
          "value": null,
          "isSecret": true
        },
        "sonar_disable": {
          "value": "false"
        },
        "SSC_URL": {
          "value": "https://novocodigoseguro.caixa/ssc"
        },
        "GITHUB_PAT": {
          "value": null,
          "isSecret": true
        }
      },
      "type": "Vsts",
      "name": "BUILD_VARIABLES",
      "description": "Variáveis disponíveis para todas as builds.",
      "id": 1
    },
    {
      "variables": {
        "OKD_API": {
          "value": "https://cloudnprd2.caixa"
        },
        "OKD_TOKEN": {
          "value": null,
          "isSecret": true
        },
        "OKD_USER_SERVICE": {
          "value": "ads-sa"
        },
        "ProjetoBuild": {
          "value": "build-images-ads"
        },
        "OKD_API_REGISTRY": {
          "value": "api.produtos4.caixa:6443"
        },
        "OKD_REGISTRY": {
          "value": "default-route-openshift-image-registry.apps.produtos4.caixa"
        },
        "OKD_TOKEN_REGISTRY": {
          "value": null,
          "isSecret": true
        },
        "OKD_USER_SERVICE_REGISTRY": {
          "value": "ads-sa"
        }
      },
      "type": "Vsts",
      "name": "OKD-REGISTRY-BUILD",
      "description": "Credenciais para o Cluster OKD de NPRD2 (DES/TQS/HMP)",
      "id": 41
    },
    {
      "variables": {
        "KIND_DEPLOY": {
          "value": "deploymentconfig"
        },
        "OKD_API_REGISTRY": {
          "value": "api.produtos4.caixa:6443"
        },
        "OKD_REGISTRY": {
          "value": "default-route-openshift-image-registry.apps.produtos4.caixa"
        },
        "OKD_TOKEN_REGISTRY": {
          "value": null,
          "isSecret": true
        },
        "OKD_USER_SERVICE_REGISTRY": {
          "value": "ads-sa"
        },
        "ProjetoBuild": {
          "value": "build-images-ads"
        },
        "TIMEOUT_DEPLOY": {
          "value": "300"
        }
      },
      "type": "Vsts",
      "name": "OKD-REGISTRY-CENTRALIZADO",
      "description": "Credenciais para o Registry Centralizado - Produtos 4 (OKD)",
      "id": 3577
    },
    {
      "variables": {
        "_SECRET.SONAR_PASSWORD": {
          "value": "SONAR_PASSWORD"
        },
        "SONAR_JAVA_BINARIES": {
          "value": "."
        },
        "SONAR_JAVA_COVERAGEPLUGIN": {
          "value": "jacoco"
        },
        "SONAR_JAVA_LIBRARIES": {
          "value": "."
        },
        "SONAR_LOGIN": {
          "value": "ads-sa"
        },
        "SONAR_PASSWORD": {
          "value": null,
          "isSecret": true
        },
        "SONAR_PROPERTIES": {
          "value": "-Dproject.settings=NONE -Dsonar.branch.name=$(sonar_branch) -Dsonar.java.binaries=$(SONAR_JAVA_BINARIES) -Dsonar.java.coveragePlugin=$(SONAR_JAVA_COVERAGEPLUGIN) -Dsonar.java.libraries=$(SONAR_JAVA_LIBRARIES) -Dsonar.coverage.jacoco.xmlReportPaths=`find . -path '*jacoco.xml' | sed 's/.*/&/' | tr '\\n' ','` -Dsonar.junit.reportPaths=`find . -type d -name 'surefire-reports' | sed 's/.*/&/' | tr '\\n' ','` -X"
        },
        "SONAR_URL": {
          "value": "http://sonar.apps.produtos4.caixa"
        }
      },
      "type": "Vsts",
      "name": "SONAR_VARIABLES - PRODUTOS",
      "description": "Variáveis do SONAR disponíveis para todas as builds.",
      "id": 8198
    },
    {
      "variables": {
        "FORTIFY_COMUNIDADE": {
          "value": "ARRECADAÇÃO E CONVÊNIOS"
        },
        "FORTIFY_FILTERSET_GUARDRAIL": {
          "value": "32142c2d-3f7f-4863-a1bf-9b1e2f34d2ed"
        },
        "FORTIFY_LDAP_GROUP": {
          "value": "SAST_Arrec_Conv,SAST_Arrec_Conv_Fabrica"
        },
        "FORTIFY_SENSOR_POOL": {
          "value": "3bc7860a-0df2-40da-8133-81850b28adba"
        }
      },
      "type": "Vsts",
      "name": "SAST_FORTIFY_COMUNIDADE_ARRECADACAO",
      "description": "WO0000076688772",
      "id": 12347
    }
  ],
  "properties": {},
  "tags": [],
  "_links": {
    "self": {
      "href": "https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_apis/build/Definitions/1019?revision=19"
    },
    "web": {
      "href": "https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_build/definition?definitionId=1019"
    },
    "editor": {
      "href": "https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_build/designer?id=1019&_a=edit-build-definition"
    },
    "badge": {
      "href": "https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_apis/build/status/1019"
    }
  },
  "buildNumberFormat": "$(Date:yyyyMMdd)$(Rev:.r)",
  "comment": "WO0000078112400",
  "jobAuthorizationScope": 1,
  "jobTimeoutInMinutes": 60,
  "jobCancelTimeoutInMinutes": 5,
  "process": {
    "phases": [
      {
        "steps": [
          {
            "environment": {},
            "enabled": true,
            "continueOnError": true,
            "alwaysRun": true,
            "displayName": "BUILD_DEFAULT_QUARKUS_JDK11",
            "timeoutInMinutes": 0,
            "retryCountOnTaskFailure": 0,
            "condition": "succeededOrFailed()",
            "task": {
              "id": "12717f70-70f3-4ba7-b8fb-d03ec7741714",
              "versionSpec": "7.*",
              "definitionType": "metaTask"
            },
            "inputs": {
              "AZPAT": "$(AZPAT)",
              "FORTIFY_API": "$(FORTIFY_API)",
              "FORTIFY_APITOKEN": "$(FORTIFY_APITOKEN)",
              "FORTIFY_BUILD": "$(FORTIFY_BUILD)",
              "fortify_disable": "$(fortify_disable)",
              "FORTIFY_PASS": "$(FORTIFY_PASS)",
              "FORTIFY_POOL_GOLD_NOVO": "$(FORTIFY_POOL_GOLD_NOVO)",
              "FORTIFY_POOL_SILVER_NOVO": "$(FORTIFY_POOL_SILVER_NOVO)",
              "FORTIFY_UPTOKEN": "$(FORTIFY_UPTOKEN)",
              "FORTIFY_USER": "$(FORTIFY_USER)",
              "FORTIFY_VERSION_BUILD": "$(FORTIFY_VERSION_BUILD)",
              "GradleVersion": "$(GradleVersion)",
              "JAVA_VERSION": "open-jdk-21.0.5/",
              "lista_versao": "$(lista_versao)",
              "MAVEN_VERSION": "",
              "MVN_GOAL": "",
              "nexus_interno_pass": "$(nexus_interno_pass)",
              "nexus_interno_user": "$(nexus_interno_user)",
              "NEXUS_REPOSITORY_ID": "$(NEXUS_REPOSITORY_ID)",
              "NEXUS_URL_MAVEN_RELEASE": "$(NEXUS_URL_MAVEN_RELEASE)",
              "NEXUS_URL_MAVEN_SNAPSHOT": "$(NEXUS_URL_MAVEN_SNAPSHOT)",
              "p_language": "$(p_language)",
              "POM_PATH": "",
              "POM_VERSION": "$(POM_VERSION)",
              "project.group": "$(project.group)",
              "project.name": "$(project.name)",
              "project.release": "$(project.release)",
              "project.version": "$(project.version)",
              "REPOSITORIO": "$(REPOSITORIO)",
              "SCANCENTRAL_URL": "$(SCANCENTRAL_URL)",
              "SONAR_LOGIN": "$(SONAR_LOGIN)",
              "SONAR_PASSWORD": "$(SONAR_PASSWORD)",
              "SONAR_PROPERTIES": "$(SONAR_PROPERTIES)",
              "SONAR_URL": "$(SONAR_URL)",
              "tbuild": "$(tbuild)",
              "token": "$(token)",
              "token_id": "$(token_id)",
              "valida.vec": "$(valida.vec)",
              "version.app": "$(version.app)",
              "versionApp": "$(versionApp)"
            }
          },
          {
            "environment": {},
            "enabled": true,
            "continueOnError": true,
            "alwaysRun": true,
            "displayName": "CRIA_IMAGE_OKD_QUARKUS",
            "timeoutInMinutes": 0,
            "retryCountOnTaskFailure": 0,
            "condition": "succeededOrFailed()",
            "task": {
              "id": "98d3c924-d731-45f0-a5d4-2c46b3e6566e",
              "versionSpec": "4.*",
              "definitionType": "metaTask"
            },
            "inputs": {
              "IMAGE_NAME": "$(IMAGE_NAME)",
              "IMAGE_NAMESPACE": "$(IMAGE_NAMESPACE)",
              "IMAGE_TAG": "$(IMAGE_TAG)",
              "ImageBuild_OKD": "$(ImageBuild_OKD)",
              "nome_imagem": "$(nome_imagem)",
              "OCP_API_IBMCLOUD": "$(OCP_API_IBMCLOUD)",
              "OCP_TOKEN_IBMCLOUD": "$(OCP_TOKEN_IBMCLOUD)",
              "OKD_4_API": "$(OKD_4_API)",
              "OKD_4_API_APL": "$(OKD_4_API_APL)",
              "OKD_4_TOKEN": "$(OKD_4_TOKEN)",
              "OKD_4_TOKEN_APL": "$(OKD_4_TOKEN_APL)",
              "OKD_API": "$(OKD_API)",
              "OKD_API_APL": "$(OKD_4_API_APL)",
              "OKD_API_PRD_CANAIS_CTC": "$(OKD_API_PRD_CANAIS_CTC)",
              "OKD_API_PRD_CANAIS_DTC": "$(OKD_API_PRD_CANAIS_DTC)",
              "OKD_API_PRD_DTC": "$(OKD_API_PRD_DTC)",
              "OKD_API_REGISTRY": "$(OKD_API_REGISTRY)",
              "OKD_TOKEN": "$(OKD_TOKEN)",
              "OKD_TOKEN_APL": "$(OKD_TOKEN_APL)",
              "OKD_TOKEN_PRD_CANAIS_CTC": "$(OKD_TOKEN_PRD_CANAIS_CTC)",
              "OKD_TOKEN_PRD_CANAIS_DTC": "$(OKD_TOKEN_PRD_CANAIS_DTC)",
              "OKD_TOKEN_PRD_DTC": "$(OKD_TOKEN_PRD_DTC)",
              "OKD_TOKEN_REGISTRY": "$(OKD_TOKEN_REGISTRY)",
              "OPENSHIFT_API_URL": "$(OPENSHIFT_API_URL)",
              "ProjetoBuild": "$(ProjetoBuild)",
              "REPOSITORIO": "$(REPOSITORIO)",
              "SITE": "$(SITE)",
              "tag_imagem": "$(tag_imagem)",
              "TemplateVersaoProduto_OKD": "$(TemplateVersaoProduto_OKD)",
              "TOKEN": "$(TOKEN)"
            }
          }
        ],
        "name": "Agent job 1",
        "refName": "Job_1",
        "condition": "succeeded()",
        "target": {
          "demands": [
            "Agent.Name -equals cadsvaprlx373.intra.caixa.gov.br"
          ],
          "executionOptions": {
            "type": 0
          },
          "allowScriptsAuthAccessOption": false,
          "type": 1
        },
        "jobAuthorizationScope": "projectCollection"
      }
    ],
    "type": 1
  },
  "repository": {
    "properties": {
      "cleanOptions": "0",
      "labelSources": "0",
      "labelSourcesFormat": "$(build.buildNumber)",
      "reportBuildStatus": "true",
      "gitLfsSupport": "false",
      "skipSyncSource": "false",
      "checkoutNestedSubmodules": "false",
      "fetchDepth": "0",
      "connectedServiceId": "2226a062-5b45-411f-b643-b372dea71431"
    },
    "id": "https://github.com/caixagithub/SICAP-webhook.git",
    "type": "Git",
    "name": "SICAP-webhook_GITHUB",
    "url": "https://github.com/caixagithub/SICAP-webhook.git",
    "defaultBranch": "refs/heads/main",
    "clean": "false",
    "checkoutSubmodules": false
  },
  "processParameters": {},
  "quality": 1,
  "authoredBy": {
    "displayName": "s736639",
    "url": "https://devops.caixa/projetos/_apis/Identities/a995fe5f-4e9b-4c88-bdc7-b5a360055174",
    "_links": {
      "avatar": {
        "href": "https://devops.caixa/projetos/_apis/GraphProfile/MemberAvatars/win.Uy0xLTUtMjEtMjk5NDYzNzUxMS03OTAwMzE5NzgtMTc5Nzc0NDY2NS0xMzIwOTgx"
      }
    },
    "id": "a995fe5f-4e9b-4c88-bdc7-b5a360055174",
    "uniqueName": "CORPCAIXA\\s736639",
    "imageUrl": "https://devops.caixa/projetos/_apis/GraphProfile/MemberAvatars/win.Uy0xLTUtMjEtMjk5NDYzNzUxMS03OTAwMzE5NzgtMTc5Nzc0NDY2NS0xMzIwOTgx",
    "descriptor": "win.Uy0xLTUtMjEtMjk5NDYzNzUxMS03OTAwMzE5NzgtMTc5Nzc0NDY2NS0xMzIwOTgx"
  },
  "drafts": [],
  "queue": {
    "_links": {
      "self": {
        "href": "https://devops.caixa/projetos/_apis/build/Queues/5"
      }
    },
    "id": 5,
    "name": "Build-Linux",
    "url": "https://devops.caixa/projetos/_apis/build/Queues/5",
    "pool": {
      "id": 5,
      "name": "Build-Linux"
    }
  },
  "id": 1019,
  "name": "SICAP-webhook",
  "url": "https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_apis/build/Definitions/1019?revision=19",
  "uri": "vstfs:///Build/Definition/1019",
  "path": "\\SICAP",
  "type": 2,
  "queueStatus": 0,
  "revision": 19,
  "createdDate": "2026-07-13T20:03:27.927Z",
  "project": {
    "id": "98fe0311-ffd2-418a-9d0d-507043380abd",
    "name": "Caixa",
    "url": "https://devops.caixa/projetos/_apis/projects/98fe0311-ffd2-418a-9d0d-507043380abd",
    "state": "wellFormed",
    "revision": 2932,
    "visibility": 0,
    "lastUpdateTime": "2026-10-15T14:22:00.493Z"
  }
}




DEPOIS


{
  "options": [
    {
      "enabled": false,
      "definition": {
        "id": "5d58cc01-7c75-450c-be18-a388ddb129ec"
      },
      "inputs": {
        "branchFilters": "[\"+refs/heads/*\"]",
        "additionalFields": "{}"
      }
    },
    {
      "enabled": false,
      "definition": {
        "id": "a9db38f9-9fdc-478c-b0f9-464221e58316"
      },
      "inputs": {
        "workItemType": "Bug",
        "assignToRequestor": "true",
        "additionalFields": "{}"
      }
    }
  ],
  "triggers": [
    {
      "branchFilters": [
        "+refs/heads/liberty-to-quarkus"
      ],
      "pathFilters": [],
      "batchChanges": false,
      "maxConcurrentBuildsPerBranch": 1,
      "pollingInterval": 0,
      "triggerType": 2
    }
  ],
  "variables": {
    "HTTPS_PROXY": {
      "value": "http://proxynuvem.caixa:80"
    },
    "ImageBuild_OKD": {
      "value": "quarkus-java-binary-s2i"
    },
    "nome_imagem": {
      "value": "quarkus-java-binary-s2i"
    },
    "SITE": {
      "value": "okd4_nprd",
      "allowOverride": true
    },
    "tag_imagem": {
      "value": "8.2-openjdk21.0.1"
    },
    "TemplateVersaoProduto_OKD": {
      "value": "8.2-openjdk21.0.1"
    },
    "version.app": {
      "value": "",
      "allowOverride": true
    },
    "guardrail.sec": {
      "value": "true"
    }
  },
  "variableGroups": [
    {
      "variables": {
        "ANSIBLE_INVENTORY": {
          "value": "$(HOME_ADS_AGENT)/$(DIR_ANSIBLE)/hosts"
        },
        "ANSIBLE_VAULT": {
          "value": null,
          "isSecret": true
        },
        "AZPAT": {
          "value": null,
          "isSecret": true
        },
        "AZUSER": {
          "value": "s736639"
        },
        "DIR_ANSIBLE": {
          "value": "esteira-qa"
        },
        "DOTNET_TESTARGS": {
          "value": "--configuration Release --collect \"code coverage\""
        },
        "FORTIFY_API": {
          "value": "https://novocodigoseguro.caixa/ssc/api/v1"
        },
        "FORTIFY_APITOKEN": {
          "value": null,
          "isSecret": true
        },
        "FORTIFY_BUILD_FILE": {
          "value": "."
        },
        "FORTIFY_CI_TOKEN": {
          "value": null,
          "isSecret": true
        },
        "FORTIFY_CLIENT_AUTH_TOKEN": {
          "value": null,
          "isSecret": true
        },
        "fortify_disable": {
          "value": "false"
        },
        "FORTIFY_PASS": {
          "value": null,
          "isSecret": true
        },
        "FORTIFY_POOL_COMPLEX_NOVO": {
          "value": "55e6b358-710a-4c3d-ad15-4a3ec96c3dca"
        },
        "FORTIFY_POOL_DIAMOND_NOVO": {
          "value": "9fa96d5a-3b13-4ecb-8639-e2ec97d1b4e9"
        },
        "FORTIFY_POOL_GOLD_NOVO": {
          "value": "1a3e11fe-719a-475a-905b-e61b743e550d"
        },
        "FORTIFY_POOL_MONOLITO_NOVO": {
          "value": "7c2e05fb-2f1d-4045-ac12-69c806df50be"
        },
        "FORTIFY_POOL_SILVER_NOVO": {
          "value": "794601f7-da27-467b-a734-06f92c4d63aa"
        },
        "FORTIFY_REGEX": {
          "value": "'(?:\\*\\/)?(\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})'"
        },
        "FORTIFY_REGISTRY_PASSWORD": {
          "value": null,
          "isSecret": true
        },
        "FORTIFY_REGISTRY_USERNAME": {
          "value": "ads-sa"
        },
        "FORTIFY_SENSOR_VERSION": {
          "value": "24.4"
        },
        "FORTIFY_TOKEN": {
          "value": null,
          "isSecret": true
        },
        "FORTIFY_UPTOKEN": {
          "value": null,
          "isSecret": true
        },
        "FORTIFY_URL": {
          "value": "https://sast.caixa/ssc"
        },
        "FORTIFY_URL_CONTROLLER": {
          "value": "http://sast.caixa/scancentral-ctrl"
        },
        "FORTIFY_USER": {
          "value": "admin"
        },
        "HOME_ADS_AGENT": {
          "value": "/opt/ads-agent"
        },
        "KEYSTORE_PWD": {
          "value": null,
          "isSecret": true
        },
        "KEYSTORE_SECUREFILEPATH": {
          "value": "/etc/pki/ca-trust/source/anchors/keystore-ssc24.jks"
        },
        "nexus_interno_pass": {
          "value": null,
          "isSecret": true
        },
        "nexus_interno_user": {
          "value": "pipeline-agil"
        },
        "NEXUS_REPOSITORY_ID": {
          "value": "NEXUS_INTERNO"
        },
        "NEXUS_URL_ANGULAR_RELEASE": {
          "value": "http://binario.caixa:8081/repository/caixa-raw-releases/angular"
        },
        "NEXUS_URL_ANGULAR_SNAPSHOT": {
          "value": "http://binario.caixa:8081/repository/caixa-raw-snapshots/angular"
        },
        "NEXUS_URL_ASP_RELEASE": {
          "value": "http://binario.caixa:8081/repository/caixa-raw-releases/asp"
        },
        "NEXUS_URL_ASP_SNAPHOT": {
          "value": "http://binario.caixa:8081/repository/caixa-raw-snapshots/asp"
        },
        "NEXUS_URL_CAIXA_GROUP": {
          "value": "http://binario.caixa:8081/repository/caixa-group-br/"
        },
        "NEXUS_URL_DOTNET_RELEASE": {
          "value": "http://binario.caixa:8081/repository/caixa-raw-releases/dotnet"
        },
        "NEXUS_URL_DOTNET_SNAPSHOT": {
          "value": "http://binario.caixa:8081/repository/caixa-raw-snapshots/dotnet"
        },
        "NEXUS_URL_MAVEN_RELEASE": {
          "value": "http://binario.caixa:8081/repository/releases"
        },
        "NEXUS_URL_MAVEN_SNAPSHOT": {
          "value": "http://binario.caixa:8081/repository/snapshots"
        },
        "NEXUS_URL_NODE_INTERNAL_RELEASE": {
          "value": "http://binario.caixa:8081/repository/npm-internal"
        },
        "NEXUS_URL_NODE_RELEASE": {
          "value": "http://binario.caixa:8081/repository/caixa-raw-releases/node"
        },
        "NEXUS_URL_NODE_SNAPSHOT": {
          "value": "http://binario.caixa:8081/repository/caixa-raw-snapshots/node"
        },
        "NEXUS_URL_NPM_RELEASE": {
          "value": "http://binario.caixa:8081/repository/caixa-npm-releases/"
        },
        "NEXUS_URL_NPM_SNAPSHOT": {
          "value": "http://binario.caixa:8081/repository/caixa-npm-snapshots/"
        },
        "NEXUS_URL_PHP_RELEASE": {
          "value": "http://binario.caixa:8081/repository/caixa-php-releases"
        },
        "NEXUS_URL_PHP_SNAPSHOT": {
          "value": "http://binario.caixa:8081/repository/caixa-php-snapshots"
        },
        "NEXUS_URL_RAW_RELEASE": {
          "value": "http://binario.caixa:8081/repository/caixa-raw-releases"
        },
        "NEXUS_URL_RAW_SNAPSHOT": {
          "value": "http://binario.caixa:8081/repository/caixa-raw-snapshots"
        },
        "NEXUS_URL_ZCONBT_RELEASE": {
          "value": "http://binario.caixa:8081/repository/caixa-raw-releases/zconbt"
        },
        "NEXUS_URL_ZCONBT_SNAPSHOT": {
          "value": "http://binario.caixa:8081/repository/caixa-raw-snapshots/zconbt"
        },
        "NODE_EXTRA_CA_CERTS": {
          "value": "/etc/pki/ca-trust/source/anchors/AC-V4.cer"
        },
        "SCANCENTRAL_URL": {
          "value": "http://scancentral.apps.produtos4.caixa/scancentral-ctrl"
        },
        "ScanCentral.ClientToken": {
          "value": null,
          "isSecret": true
        },
        "ScanCentral.SscCiToken": {
          "value": null,
          "isSecret": true
        },
        "sonar_disable": {
          "value": "false"
        },
        "SSC_URL": {
          "value": "https://novocodigoseguro.caixa/ssc"
        },
        "GITHUB_PAT": {
          "value": null,
          "isSecret": true
        }
      },
      "type": "Vsts",
      "name": "BUILD_VARIABLES",
      "description": "Variáveis disponíveis para todas as builds.",
      "id": 1
    },
    {
      "variables": {
        "OKD_API": {
          "value": "https://cloudnprd2.caixa"
        },
        "OKD_TOKEN": {
          "value": null,
          "isSecret": true
        },
        "OKD_USER_SERVICE": {
          "value": "ads-sa"
        },
        "ProjetoBuild": {
          "value": "build-images-ads"
        },
        "OKD_API_REGISTRY": {
          "value": "api.produtos4.caixa:6443"
        },
        "OKD_REGISTRY": {
          "value": "default-route-openshift-image-registry.apps.produtos4.caixa"
        },
        "OKD_TOKEN_REGISTRY": {
          "value": null,
          "isSecret": true
        },
        "OKD_USER_SERVICE_REGISTRY": {
          "value": "ads-sa"
        }
      },
      "type": "Vsts",
      "name": "OKD-REGISTRY-BUILD",
      "description": "Credenciais para o Cluster OKD de NPRD2 (DES/TQS/HMP)",
      "id": 41
    },
    {
      "variables": {
        "KIND_DEPLOY": {
          "value": "deploymentconfig"
        },
        "OKD_API_REGISTRY": {
          "value": "api.produtos4.caixa:6443"
        },
        "OKD_REGISTRY": {
          "value": "default-route-openshift-image-registry.apps.produtos4.caixa"
        },
        "OKD_TOKEN_REGISTRY": {
          "value": null,
          "isSecret": true
        },
        "OKD_USER_SERVICE_REGISTRY": {
          "value": "ads-sa"
        },
        "ProjetoBuild": {
          "value": "build-images-ads"
        },
        "TIMEOUT_DEPLOY": {
          "value": "300"
        }
      },
      "type": "Vsts",
      "name": "OKD-REGISTRY-CENTRALIZADO",
      "description": "Credenciais para o Registry Centralizado - Produtos 4 (OKD)",
      "id": 3577
    },
    {
      "variables": {
        "_SECRET.SONAR_PASSWORD": {
          "value": "SONAR_PASSWORD"
        },
        "SONAR_JAVA_BINARIES": {
          "value": "."
        },
        "SONAR_JAVA_COVERAGEPLUGIN": {
          "value": "jacoco"
        },
        "SONAR_JAVA_LIBRARIES": {
          "value": "."
        },
        "SONAR_LOGIN": {
          "value": "ads-sa"
        },
        "SONAR_PASSWORD": {
          "value": null,
          "isSecret": true
        },
        "SONAR_PROPERTIES": {
          "value": "-Dproject.settings=NONE -Dsonar.branch.name=$(sonar_branch) -Dsonar.java.binaries=$(SONAR_JAVA_BINARIES) -Dsonar.java.coveragePlugin=$(SONAR_JAVA_COVERAGEPLUGIN) -Dsonar.java.libraries=$(SONAR_JAVA_LIBRARIES) -Dsonar.coverage.jacoco.xmlReportPaths=`find . -path '*jacoco.xml' | sed 's/.*/&/' | tr '\\n' ','` -Dsonar.junit.reportPaths=`find . -type d -name 'surefire-reports' | sed 's/.*/&/' | tr '\\n' ','` -X"
        },
        "SONAR_URL": {
          "value": "http://sonar.apps.produtos4.caixa"
        }
      },
      "type": "Vsts",
      "name": "SONAR_VARIABLES - PRODUTOS",
      "description": "Variáveis do SONAR disponíveis para todas as builds.",
      "id": 8198
    },
    {
      "variables": {
        "FORTIFY_COMUNIDADE": {
          "value": "ARRECADAÇÃO E CONVÊNIOS"
        },
        "FORTIFY_FILTERSET_GUARDRAIL": {
          "value": "32142c2d-3f7f-4863-a1bf-9b1e2f34d2ed"
        },
        "FORTIFY_LDAP_GROUP": {
          "value": "SAST_Arrec_Conv,SAST_Arrec_Conv_Fabrica"
        },
        "FORTIFY_SENSOR_POOL": {
          "value": "3bc7860a-0df2-40da-8133-81850b28adba"
        }
      },
      "type": "Vsts",
      "name": "SAST_FORTIFY_COMUNIDADE_ARRECADACAO",
      "description": "WO0000076688772",
      "id": 12347
    }
  ],
  "properties": {},
  "tags": [],
  "_links": {
    "self": {
      "href": "https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_apis/build/Definitions/1019?revision=20"
    },
    "web": {
      "href": "https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_build/definition?definitionId=1019"
    },
    "editor": {
      "href": "https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_build/designer?id=1019&_a=edit-build-definition"
    },
    "badge": {
      "href": "https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_apis/build/status/1019"
    }
  },
  "buildNumberFormat": "$(Date:yyyyMMdd)$(Rev:.r)",
  "comment": "WO0000081494097",
  "jobAuthorizationScope": 1,
  "jobTimeoutInMinutes": 60,
  "jobCancelTimeoutInMinutes": 5,
  "process": {
    "phases": [
      {
        "steps": [
          {
            "environment": {},
            "enabled": true,
            "continueOnError": true,
            "alwaysRun": true,
            "displayName": "BUILD_DEFAULT_QUARKUS_JDK11",
            "timeoutInMinutes": 0,
            "retryCountOnTaskFailure": 0,
            "condition": "succeededOrFailed()",
            "task": {
              "id": "12717f70-70f3-4ba7-b8fb-d03ec7741714",
              "versionSpec": "7.*",
              "definitionType": "metaTask"
            },
            "inputs": {
              "AZPAT": "$(AZPAT)",
              "FORTIFY_API": "$(FORTIFY_API)",
              "FORTIFY_APITOKEN": "$(FORTIFY_APITOKEN)",
              "FORTIFY_BUILD": "$(FORTIFY_BUILD)",
              "FORTIFY_CI_TOKEN": "$(FORTIFY_CI_TOKEN)",
              "FORTIFY_CLIENT_AUTH_TOKEN": "$(FORTIFY_CLIENT_AUTH_TOKEN)",
              "fortify_disable": "$(fortify_disable)",
              "FORTIFY_FPR_NAME": "$(FORTIFY_FPR_NAME)",
              "FORTIFY_NEW_VERSION": "$(FORTIFY_NEW_VERSION)",
              "FORTIFY_PASS": "$(FORTIFY_PASS)",
              "FORTIFY_POOL_GOLD_NOVO": "$(FORTIFY_POOL_GOLD_NOVO)",
              "FORTIFY_POOL_SILVER_NOVO": "$(FORTIFY_POOL_SILVER_NOVO)",
              "FORTIFY_REGEX": "$(FORTIFY_REGEX)",
              "FORTIFY_SENSOR_POOL": "$(FORTIFY_SENSOR_POOL)",
              "FORTIFY_UPTOKEN": "$(FORTIFY_UPTOKEN)",
              "FORTIFY_URL": "$(FORTIFY_URL)",
              "FORTIFY_URL_CONTROLLER": "$(FORTIFY_URL_CONTROLLER)",
              "FORTIFY_USER": "$(FORTIFY_USER)",
              "FORTIFY_VERSION_BUILD": "$(FORTIFY_VERSION_BUILD)",
              "FTFY_MVN_GOAL": "$(FTFY_MVN_GOAL)",
              "GradleVersion": "$(GradleVersion)",
              "JAVA_VERSION": "open-jdk-21.0.5/",
              "KEYSTORE_SECUREFILEPATH": "$(KEYSTORE_SECUREFILEPATH)",
              "lista_versao": "$(lista_versao)",
              "MAVEN_VERSION": "",
              "MVN_GOAL": "",
              "nexus_interno_pass": "$(nexus_interno_pass)",
              "nexus_interno_user": "$(nexus_interno_user)",
              "NEXUS_REPOSITORY_ID": "$(NEXUS_REPOSITORY_ID)",
              "NEXUS_URL_MAVEN_RELEASE": "$(NEXUS_URL_MAVEN_RELEASE)",
              "NEXUS_URL_MAVEN_SNAPSHOT": "$(NEXUS_URL_MAVEN_SNAPSHOT)",
              "NODE_EXTRA_CA_CERTS": "$(NODE_EXTRA_CA_CERTS)",
              "p_language": "$(p_language)",
              "POM_PATH": "",
              "POM_VERSION": "$(POM_VERSION)",
              "project.group": "$(project.group)",
              "project.name": "$(project.name)",
              "project.version": "$(project.version)",
              "REPO_FINAL_NAME": "$(REPO_FINAL_NAME)",
              "REPOSITORIO": "$(REPOSITORIO)",
              "SCANCENTRAL_URL": "$(SCANCENTRAL_URL)",
              "SONAR_LOGIN": "$(SONAR_LOGIN)",
              "SONAR_PASSWORD": "$(SONAR_PASSWORD)",
              "SONAR_PROPERTIES": "$(SONAR_PROPERTIES)",
              "SONAR_URL": "$(SONAR_URL)",
              "tbuild": "$(tbuild)",
              "token": "$(token)",
              "token_id": "$(token_id)",
              "valida.vec": "$(valida.vec)",
              "version.app": "$(version.app)",
              "versionApp": "$(versionApp)"
            }
          },
          {
            "environment": {},
            "enabled": true,
            "continueOnError": true,
            "alwaysRun": true,
            "displayName": "CRIA_IMAGE_OKD_QUARKUS",
            "timeoutInMinutes": 0,
            "retryCountOnTaskFailure": 0,
            "condition": "succeededOrFailed()",
            "task": {
              "id": "98d3c924-d731-45f0-a5d4-2c46b3e6566e",
              "versionSpec": "4.*",
              "definitionType": "metaTask"
            },
            "inputs": {
              "IMAGE_NAME": "$(IMAGE_NAME)",
              "IMAGE_NAMESPACE": "$(IMAGE_NAMESPACE)",
              "IMAGE_TAG": "$(IMAGE_TAG)",
              "ImageBuild_OKD": "$(ImageBuild_OKD)",
              "nome_imagem": "$(nome_imagem)",
              "OCP_API_IBMCLOUD": "$(OCP_API_IBMCLOUD)",
              "OCP_TOKEN_IBMCLOUD": "$(OCP_TOKEN_IBMCLOUD)",
              "OKD_4_API": "$(OKD_4_API)",
              "OKD_4_API_APL": "$(OKD_4_API_APL)",
              "OKD_4_TOKEN": "$(OKD_4_TOKEN)",
              "OKD_4_TOKEN_APL": "$(OKD_4_TOKEN_APL)",
              "OKD_API": "$(OKD_API)",
              "OKD_API_APL": "$(OKD_4_API_APL)",
              "OKD_API_PRD_CANAIS_CTC": "$(OKD_API_PRD_CANAIS_CTC)",
              "OKD_API_PRD_CANAIS_DTC": "$(OKD_API_PRD_CANAIS_DTC)",
              "OKD_API_PRD_DTC": "$(OKD_API_PRD_DTC)",
              "OKD_API_REGISTRY": "$(OKD_API_REGISTRY)",
              "OKD_TOKEN": "$(OKD_TOKEN)",
              "OKD_TOKEN_APL": "$(OKD_TOKEN_APL)",
              "OKD_TOKEN_PRD_CANAIS_CTC": "$(OKD_TOKEN_PRD_CANAIS_CTC)",
              "OKD_TOKEN_PRD_CANAIS_DTC": "$(OKD_TOKEN_PRD_CANAIS_DTC)",
              "OKD_TOKEN_PRD_DTC": "$(OKD_TOKEN_PRD_DTC)",
              "OKD_TOKEN_REGISTRY": "$(OKD_TOKEN_REGISTRY)",
              "OPENSHIFT_API_URL": "$(OPENSHIFT_API_URL)",
              "ProjetoBuild": "$(ProjetoBuild)",
              "REPO_FINAL_NAME": "$(REPO_FINAL_NAME)",
              "REPOSITORIO": "$(REPOSITORIO)",
              "SITE": "$(SITE)",
              "tag_imagem": "$(tag_imagem)",
              "TemplateVersaoProduto_OKD": "$(TemplateVersaoProduto_OKD)",
              "TOKEN": "$(TOKEN)"
            }
          }
        ],
        "name": "Agent job 1",
        "refName": "Job_1",
        "condition": "succeeded()",
        "target": {
          "demands": [
            "Agent.Name -equals cadsvaprlx373.intra.caixa.gov.br"
          ],
          "executionOptions": {
            "type": 0
          },
          "allowScriptsAuthAccessOption": false,
          "type": 1
        },
        "jobAuthorizationScope": "projectCollection"
      }
    ],
    "type": 1
  },
  "repository": {
    "properties": {
      "fullName": "repository",
      "cloneUrl": "https://github.com/caixagithub/SICAP-webhook.git",
      "isPrivate": "True",
      "checkoutNestedSubmodules": "false",
      "cleanOptions": "0",
      "fetchDepth": "0",
      "gitLfsSupport": "false",
      "reportBuildStatus": "true",
      "connectedServiceId": "2226a062-5b45-411f-b643-b372dea71431",
      "skipSyncSource": "false",
      "fetchTags": "true",
      "labelSourcesFormat": "$(build.buildNumber)",
      "labelSources": "0"
    },
    "id": "https://github.com/caixagithub/SICAP-webhook.git",
    "type": "Git",
    "name": "SICAP-webhook_GITHUB",
    "url": "https://github.com/caixagithub/SICAP-webhook.git",
    "defaultBranch": "refs/heads/main",
    "clean": "false",
    "checkoutSubmodules": false
  },
  "processParameters": {},
  "quality": 1,
  "authoredBy": {
    "displayName": "Aguillera Pontes Portela",
    "url": "https://devops.caixa/projetos/_apis/Identities/8f646df2-5439-4496-ae6b-5631eb427fd4",
    "_links": {
      "avatar": {
        "href": "https://devops.caixa/projetos/_apis/GraphProfile/MemberAvatars/win.Uy0xLTUtMjEtMjk5NDYzNzUxMS03OTAwMzE5NzgtMTc5Nzc0NDY2NS0xOTE0OTIw"
      }
    },
    "id": "8f646df2-5439-4496-ae6b-5631eb427fd4",
    "uniqueName": "CORPCAIXA\\p734144",
    "imageUrl": "https://devops.caixa/projetos/_apis/GraphProfile/MemberAvatars/win.Uy0xLTUtMjEtMjk5NDYzNzUxMS03OTAwMzE5NzgtMTc5Nzc0NDY2NS0xOTE0OTIw",
    "descriptor": "win.Uy0xLTUtMjEtMjk5NDYzNzUxMS03OTAwMzE5NzgtMTc5Nzc0NDY2NS0xOTE0OTIw"
  },
  "drafts": [],
  "queue": {
    "_links": {
      "self": {
        "href": "https://devops.caixa/projetos/_apis/build/Queues/5"
      }
    },
    "id": 5,
    "name": "Build-Linux",
    "url": "https://devops.caixa/projetos/_apis/build/Queues/5",
    "pool": {
      "id": 5,
      "name": "Build-Linux"
    }
  },
  "id": 1019,
  "name": "SICAP-webhook",
  "url": "https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_apis/build/Definitions/1019?revision=20",
  "uri": "vstfs:///Build/Definition/1019",
  "path": "\\SICAP",
  "type": 2,
  "queueStatus": 0,
  "revision": 20,
  "createdDate": "2026-08-28T17:30:00.557Z",
  "project": {
    "id": "98fe0311-ffd2-418a-9d0d-507043380abd",
    "name": "Caixa",
    "url": "https://devops.caixa/projetos/_apis/projects/98fe0311-ffd2-418a-9d0d-507043380abd",
    "state": "wellFormed",
    "revision": 2932,
    "visibility": 0,
    "lastUpdateTime": "2026-10-15T14:22:00.493Z"
  }
}
