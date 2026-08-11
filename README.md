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
  "variables": {
    "ImageBuild_OKD": {
      "value": "quarkus-java-binary-s2i"
    },
    "NODE_VERSION": {
      "value": "20.x"
    },
    "nome_imagem": {
      "value": "quarkus-java-binary-s2i"
    },
    "SITE": {
      "value": "okd4_nprd",
      "allowOverride": true
    },
    "tag_imagem": {
      "value": "openjdk17"
    },
    "TemplateVersaoProduto_OKD": {
      "value": "openjdk17"
    },
    "version.app": {
      "value": "",
      "allowOverride": true
    }
  },
  "variableGroups": [
    {
      "variables": {
        "ANSIBLE_INVENTORY": {
          "value": "$(HOME_ADS_AGENT)/$(DIR_ANSIBLE)/hosts"
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
        "SSC_URL": {
          "value": "https://novocodigoseguro.caixa/ssc"
        }
      },
      "type": "Vsts",
      "name": "BUILD_VARIABLES",
      "description": "Variáveis disponíveis para todas as builds.",
      "id": 1
    },
    {
      "variables": {
        "AZPAT": {
          "value": null,
          "isSecret": true
        },
        "AZUSER": {
          "value": "s736639"
        },
        "BT_API_URL": {
          "value": "https://sicsn.caixa/BeyondTrust/api/public/v3"
        },
        "BT_SECRETS_PATH": {
          "value": null,
          "isSecret": true
        },
        "FORTIFY_API": {
          "value": "https://novocodigoseguro.caixa/ssc/api/v1"
        },
        "FORTIFY_APITOKEN": {
          "value": null,
          "isSecret": true
        },
        "FORTIFY_PASS": {
          "value": null,
          "isSecret": true
        },
        "FORTIFY_USER": {
          "value": "admin"
        },
        "OKD_KAFKA": {
          "value": "api.kafka-nprd.caixa:6443"
        },
        "OKD_TOKEN_KAFKA": {
          "value": null,
          "isSecret": true
        },
        "URL_CRQ": {
          "value": "https://infradevops-novoportal-backend-prd.apps.produtos4.caixa/api.php?acao=devopsCaixacriarMudancaPadrao"
        },
        "TOKEN_CRQ": {
          "value": null,
          "isSecret": true
        }
      },
      "type": "Vsts",
      "name": "Usuario-Azure-DevOps",
      "id": 28
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
          "value": "http://sonar-esteira.apps.produtos4.caixa"
        }
      },
      "type": "Vsts",
      "name": "SONAR_VARIABLES - ESTEIRA",
      "description": "Variáveis do SONAR disponíveis para todas as builds.",
      "id": 8149
    },
    {
      "variables": {
        "FORTIFY_COMUNIDADE": {
          "value": "CANAIS FÍSICOS"
        },
        "FORTIFY_FILTERSET_GUARDRAIL": {
          "value": "32142c2d-3f7f-4863-a1bf-9b1e2f34d2ed"
        },
        "FORTIFY_LDAP_GROUP": {
          "value": "SAST_C_fisicos,SAST_C_Fisicos_Fabrica"
        },
        "FORTIFY_SENSOR_POOL": {
          "value": "3bc7860a-0df2-40da-8133-81850b28adba"
        }
      },
      "type": "Vsts",
      "name": "SAST_FORTIFY_COMUNIDADE_CANAIS_FISICOS",
      "description": "WO0000076688772",
      "id": 12348
    }
  ],
  "properties": {},
  "tags": [],
  "_links": {
    "self": {
      "href": "https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_apis/build/Definitions/6831?revision=8"
    },
    "web": {
      "href": "https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_build/definition?definitionId=6831"
    },
    "editor": {
      "href": "https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_build/designer?id=6831&_a=edit-build-definition"
    },
    "badge": {
      "href": "https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_apis/build/status/6831"
    }
  },
  "buildNumberFormat": "$(Date:yyyyMMdd)$(Rev:.r)",
  "jobAuthorizationScope": 1,
  "jobTimeoutInMinutes": 60,
  "jobCancelTimeoutInMinutes": 5,
  "process": {
    "phases": [
      {
        "steps": [
          {
            "environment": {},
            "enabled": false,
            "continueOnError": true,
            "alwaysRun": true,
            "displayName": "BUILD_DEFAULT_SPRING",
            "timeoutInMinutes": 0,
            "retryCountOnTaskFailure": 0,
            "condition": "succeededOrFailed()",
            "task": {
              "id": "71fa3c55-8e86-4609-920e-f919e040c93c",
              "versionSpec": "1.*",
              "definitionType": "metaTask"
            },
            "inputs": {
              "AZPAT": "$(AZPAT)",
              "AZUSER": "$(AZUSER)",
              "DOTNET_VERSION": "$(DOTNET_VERSION)",
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
              "FRAMEWORK": "$(FRAMEWORK)",
              "FTFY_MVN_GOAL": "$(FTFY_MVN_GOAL)",
              "GradleVersion": "$(GradleVersion)",
              "JAVA_VERSION": "open-jdk-21.0.5/",
              "KEYSTORE_SECUREFILEPATH": "$(KEYSTORE_SECUREFILEPATH)",
              "LENG": "$(LENG)",
              "lista_versao": "$(lista_versao)",
              "MAVEN_VERSION": "",
              "MVN_GOAL": "",
              "nexus_interno_pass": "$(nexus_interno_pass)",
              "nexus_interno_user": "$(nexus_interno_user)",
              "NEXUS_REPOSITORY_ID": "$(NEXUS_REPOSITORY_ID)",
              "NEXUS_URL_MAVEN_RELEASE": "$(NEXUS_URL_MAVEN_RELEASE)",
              "NEXUS_URL_MAVEN_SNAPSHOT": "$(NEXUS_URL_MAVEN_SNAPSHOT)",
              "NEXUS_URL_SNAPSHOT_ALIAS": "",
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
              "VER_TECNOLOGIA": "$(VER_TECNOLOGIA)",
              "VERSION_PADRAO": "$(VERSION_PADRAO)",
              "version.app": "$(version.app)",
              "versionApp": "$(versionApp)"
            }
          },
          {
            "environment": {},
            "enabled": true,
            "continueOnError": true,
            "alwaysRun": true,
            "displayName": "Angular-Build",
            "timeoutInMinutes": 0,
            "retryCountOnTaskFailure": 0,
            "condition": "succeededOrFailed()",
            "task": {
              "id": "62218068-7840-4390-b11b-70b70fabee76",
              "versionSpec": "6.*",
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
              "KEYSTORE_SECUREFILEPATH": "$(KEYSTORE_SECUREFILEPATH)",
              "library": "$(library)",
              "lista_versao": "$(lista_versao)",
              "nexus_interno_pass": "$(nexus_interno_pass)",
              "nexus_interno_user": "$(nexus_interno_user)",
              "NEXUS_REPOSITORY_ID": "$(NEXUS_REPOSITORY_ID)",
              "NEXUS_URL_RELEASE": "$(NEXUS_URL_ANGULAR_RELEASE)",
              "NEXUS_URL_SNAPSHOT": "$(NEXUS_URL_ANGULAR_SNAPSHOT)",
              "NEXUS_URL_SNAPSHOT_ALIAS": "",
              "NG_GOAL": "ng build --configuration production --build-optimizer --aot --output-path=dist && npm test",
              "NODE_EXTRA_CA_CERTS": "$(NODE_EXTRA_CA_CERTS)",
              "NODE_VERSION": "$(NODE_VERSION)",
              "p_language": "$(p_language)",
              "PACKAGE_JSON_PATH": "$(Build.Repository.LocalPath)",
              "POM_PATH": "$(POM_PATH)",
              "project.extension": "$(project.extension)",
              "project.file": "$(project.file)",
              "project.group": "$(project.group)",
              "project.name": "$(project.name)",
              "project.release": "$(project.release)",
              "project.version": "$(project.version)",
              "REPO_FINAL_NAME": "$(REPO_FINAL_NAME)",
              "REPOSITORIO": "$(REPOSITORIO)",
              "SCANCENTRAL_URL": "$(SCANCENTRAL_URL)",
              "SONAR_LOGIN": "$(SONAR_LOGIN)",
              "SONAR_PASSWORD": "$(SONAR_PASSWORD)",
              "SONAR_PROPERTIES": "$(SONAR_PROPERTIES)",
              "SONAR_URL": "$(SONAR_URL)",
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
            "displayName": "CRIA_IMAGE_OKD",
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
      "fetchDepth": "0"
    },
    "id": "bea920b8-48f7-4356-9bc0-a2013ae42bb6",
    "type": "TfsGit",
    "name": "SIAVL-gerencial-frontend",
    "url": "https://devops.caixa/projetos/Caixa/_git/SIAVL-gerencial-frontend",
    "defaultBranch": "refs/heads/main",
    "clean": "false",
    "checkoutSubmodules": false
  },
  "processParameters": {},
  "quality": 1,
  "authoredBy": {
    "displayName": "Thiago Jeferson de Sousa Silva",
    "url": "https://devops.caixa/projetos/_apis/Identities/c5457235-fbfb-4b25-b65c-1db7e20bbe6c",
    "_links": {
      "avatar": {
        "href": "https://devops.caixa/projetos/_apis/GraphProfile/MemberAvatars/win.Uy0xLTUtMjEtMjk5NDYzNzUxMS03OTAwMzE5NzgtMTc5Nzc0NDY2NS0yMTg1NjM1"
      }
    },
    "id": "c5457235-fbfb-4b25-b65c-1db7e20bbe6c",
    "uniqueName": "CORPCAIXA\\p981778",
    "imageUrl": "https://devops.caixa/projetos/_apis/GraphProfile/MemberAvatars/win.Uy0xLTUtMjEtMjk5NDYzNzUxMS03OTAwMzE5NzgtMTc5Nzc0NDY2NS0yMTg1NjM1",
    "descriptor": "win.Uy0xLTUtMjEtMjk5NDYzNzUxMS03OTAwMzE5NzgtMTc5Nzc0NDY2NS0yMTg1NjM1"
  },
  "drafts": [],
  "queue": {
    "_links": {
      "self": {
        "href": "https://devops.caixa/projetos/_apis/build/Queues/150"
      }
    },
    "id": 150,
    "name": "Build-Linux-Node",
    "url": "https://devops.caixa/projetos/_apis/build/Queues/150",
    "pool": {
      "id": 43,
      "name": "Build-Linux-Node"
    }
  },
  "id": 6831,
  "name": "SIAVL-gerencial-frontend",
  "url": "https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_apis/build/Definitions/6831?revision=8",
  "uri": "vstfs:///Build/Definition/6831",
  "path": "\\SIAVL",
  "type": 2,
  "queueStatus": 0,
  "revision": 8,
  "createdDate": "2026-08-06T18:27:19.150Z",
  "project": {
    "id": "98fe0311-ffd2-418a-9d0d-507043380abd",
    "name": "Caixa",
    "url": "https://devops.caixa/projetos/_apis/projects/98fe0311-ffd2-418a-9d0d-507043380abd",
    "state": "wellFormed",
    "revision": 2931,
    "visibility": 0,
    "lastUpdateTime": "2026-07-29T14:28:39.653Z"
  }
}



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
  "variables": {
    "ImageBuild_OKD": {
      "value": "nginx"
    },
    "NODE_VERSION": {
      "value": "20.x"
    },
    "nome_imagem": {
      "value": "nginx"
    },
    "SITE": {
      "value": "okd4_nprd",
      "allowOverride": true
    },
    "tag_imagem": {
      "value": "1.26"
    },
    "TemplateVersaoProduto_OKD": {
      "value": "1.18"
    },
    "version.app": {
      "value": "",
      "allowOverride": true
    },
    "TemplateBuild_OKD": {
      "value": "openshift/angular-caixa-binary-ads"
    }
  },
  "variableGroups": [
    {
      "variables": {
        "ANSIBLE_INVENTORY": {
          "value": "$(HOME_ADS_AGENT)/$(DIR_ANSIBLE)/hosts"
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
        "SSC_URL": {
          "value": "https://novocodigoseguro.caixa/ssc"
        }
      },
      "type": "Vsts",
      "name": "BUILD_VARIABLES",
      "description": "Variáveis disponíveis para todas as builds.",
      "id": 1
    },
    {
      "variables": {
        "AZPAT": {
          "value": null,
          "isSecret": true
        },
        "AZUSER": {
          "value": "s736639"
        },
        "BT_API_URL": {
          "value": "https://sicsn.caixa/BeyondTrust/api/public/v3"
        },
        "BT_SECRETS_PATH": {
          "value": null,
          "isSecret": true
        },
        "FORTIFY_API": {
          "value": "https://novocodigoseguro.caixa/ssc/api/v1"
        },
        "FORTIFY_APITOKEN": {
          "value": null,
          "isSecret": true
        },
        "FORTIFY_PASS": {
          "value": null,
          "isSecret": true
        },
        "FORTIFY_USER": {
          "value": "admin"
        },
        "OKD_KAFKA": {
          "value": "api.kafka-nprd.caixa:6443"
        },
        "OKD_TOKEN_KAFKA": {
          "value": null,
          "isSecret": true
        },
        "URL_CRQ": {
          "value": "https://infradevops-novoportal-backend-prd.apps.produtos4.caixa/api.php?acao=devopsCaixacriarMudancaPadrao"
        },
        "TOKEN_CRQ": {
          "value": null,
          "isSecret": true
        }
      },
      "type": "Vsts",
      "name": "Usuario-Azure-DevOps",
      "id": 28
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
          "value": "http://sonar-esteira.apps.produtos4.caixa"
        }
      },
      "type": "Vsts",
      "name": "SONAR_VARIABLES - ESTEIRA",
      "description": "Variáveis do SONAR disponíveis para todas as builds.",
      "id": 8149
    },
    {
      "variables": {
        "FORTIFY_COMUNIDADE": {
          "value": "CANAIS FÍSICOS"
        },
        "FORTIFY_FILTERSET_GUARDRAIL": {
          "value": "32142c2d-3f7f-4863-a1bf-9b1e2f34d2ed"
        },
        "FORTIFY_LDAP_GROUP": {
          "value": "SAST_C_fisicos,SAST_C_Fisicos_Fabrica"
        },
        "FORTIFY_SENSOR_POOL": {
          "value": "3bc7860a-0df2-40da-8133-81850b28adba"
        }
      },
      "type": "Vsts",
      "name": "SAST_FORTIFY_COMUNIDADE_CANAIS_FISICOS",
      "description": "WO0000076688772",
      "id": 12348
    }
  ],
  "properties": {},
  "tags": [],
  "_links": {
    "self": {
      "href": "https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_apis/build/Definitions/6831?revision=9"
    },
    "web": {
      "href": "https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_build/definition?definitionId=6831"
    },
    "editor": {
      "href": "https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_build/designer?id=6831&_a=edit-build-definition"
    },
    "badge": {
      "href": "https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_apis/build/status/6831"
    }
  },
  "buildNumberFormat": "$(Date:yyyyMMdd)$(Rev:.r)",
  "comment": "WO0000081316530",
  "jobAuthorizationScope": 1,
  "jobTimeoutInMinutes": 60,
  "jobCancelTimeoutInMinutes": 5,
  "process": {
    "phases": [
      {
        "steps": [
          {
            "environment": {},
            "enabled": false,
            "continueOnError": true,
            "alwaysRun": true,
            "displayName": "BUILD_DEFAULT_SPRING",
            "timeoutInMinutes": 0,
            "retryCountOnTaskFailure": 0,
            "condition": "succeededOrFailed()",
            "task": {
              "id": "71fa3c55-8e86-4609-920e-f919e040c93c",
              "versionSpec": "1.*",
              "definitionType": "metaTask"
            },
            "inputs": {
              "AZPAT": "$(AZPAT)",
              "AZUSER": "$(AZUSER)",
              "DOTNET_VERSION": "$(DOTNET_VERSION)",
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
              "FRAMEWORK": "$(FRAMEWORK)",
              "FTFY_MVN_GOAL": "$(FTFY_MVN_GOAL)",
              "GradleVersion": "$(GradleVersion)",
              "JAVA_VERSION": "open-jdk-21.0.5/",
              "KEYSTORE_SECUREFILEPATH": "$(KEYSTORE_SECUREFILEPATH)",
              "LENG": "$(LENG)",
              "lista_versao": "$(lista_versao)",
              "MAVEN_VERSION": "",
              "MVN_GOAL": "",
              "nexus_interno_pass": "$(nexus_interno_pass)",
              "nexus_interno_user": "$(nexus_interno_user)",
              "NEXUS_REPOSITORY_ID": "$(NEXUS_REPOSITORY_ID)",
              "NEXUS_URL_MAVEN_RELEASE": "$(NEXUS_URL_MAVEN_RELEASE)",
              "NEXUS_URL_MAVEN_SNAPSHOT": "$(NEXUS_URL_MAVEN_SNAPSHOT)",
              "NEXUS_URL_SNAPSHOT_ALIAS": "",
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
              "VER_TECNOLOGIA": "$(VER_TECNOLOGIA)",
              "VERSION_PADRAO": "$(VERSION_PADRAO)",
              "version.app": "$(version.app)",
              "versionApp": "$(versionApp)"
            }
          },
          {
            "environment": {},
            "enabled": true,
            "continueOnError": true,
            "alwaysRun": true,
            "displayName": "Angular-Build",
            "timeoutInMinutes": 0,
            "retryCountOnTaskFailure": 0,
            "condition": "succeededOrFailed()",
            "task": {
              "id": "62218068-7840-4390-b11b-70b70fabee76",
              "versionSpec": "6.*",
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
              "KEYSTORE_SECUREFILEPATH": "$(KEYSTORE_SECUREFILEPATH)",
              "library": "$(library)",
              "lista_versao": "$(lista_versao)",
              "nexus_interno_pass": "$(nexus_interno_pass)",
              "nexus_interno_user": "$(nexus_interno_user)",
              "NEXUS_REPOSITORY_ID": "$(NEXUS_REPOSITORY_ID)",
              "NEXUS_URL_RELEASE": "$(NEXUS_URL_ANGULAR_RELEASE)",
              "NEXUS_URL_SNAPSHOT": "$(NEXUS_URL_ANGULAR_SNAPSHOT)",
              "NEXUS_URL_SNAPSHOT_ALIAS": "",
              "NG_GOAL": "ng build --configuration production --build-optimizer --aot --output-path=dist && npm test",
              "NODE_EXTRA_CA_CERTS": "$(NODE_EXTRA_CA_CERTS)",
              "NODE_VERSION": "$(NODE_VERSION)",
              "p_language": "$(p_language)",
              "PACKAGE_JSON_PATH": "$(Build.Repository.LocalPath)",
              "POM_PATH": "$(POM_PATH)",
              "project.extension": "$(project.extension)",
              "project.file": "$(project.file)",
              "project.group": "$(project.group)",
              "project.name": "$(project.name)",
              "project.release": "$(project.release)",
              "project.version": "$(project.version)",
              "REPO_FINAL_NAME": "$(REPO_FINAL_NAME)",
              "REPOSITORIO": "$(REPOSITORIO)",
              "SCANCENTRAL_URL": "$(SCANCENTRAL_URL)",
              "SONAR_LOGIN": "$(SONAR_LOGIN)",
              "SONAR_PASSWORD": "$(SONAR_PASSWORD)",
              "SONAR_PROPERTIES": "$(SONAR_PROPERTIES)",
              "SONAR_URL": "$(SONAR_URL)",
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
            "displayName": "CRIA_IMAGE_OKD",
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
      "fetchDepth": "0"
    },
    "id": "bea920b8-48f7-4356-9bc0-a2013ae42bb6",
    "type": "TfsGit",
    "name": "SIAVL-gerencial-frontend",
    "url": "https://devops.caixa/projetos/Caixa/_git/SIAVL-gerencial-frontend",
    "defaultBranch": "refs/heads/main",
    "clean": "false",
    "checkoutSubmodules": false
  },
  "processParameters": {},
  "quality": 1,
  "authoredBy": {
    "displayName": "Flavio Longue Guimaraes",
    "url": "https://devops.caixa/projetos/_apis/Identities/bb1ab1f6-8423-490b-8a25-632bb5e48625",
    "_links": {
      "avatar": {
        "href": "https://devops.caixa/projetos/_apis/GraphProfile/MemberAvatars/win.Uy0xLTUtMjEtMjk5NDYzNzUxMS03OTAwMzE5NzgtMTc5Nzc0NDY2NS0xODc4NzEy"
      }
    },
    "id": "bb1ab1f6-8423-490b-8a25-632bb5e48625",
    "uniqueName": "CORPCAIXA\\p573448",
    "imageUrl": "https://devops.caixa/projetos/_apis/GraphProfile/MemberAvatars/win.Uy0xLTUtMjEtMjk5NDYzNzUxMS03OTAwMzE5NzgtMTc5Nzc0NDY2NS0xODc4NzEy",
    "descriptor": "win.Uy0xLTUtMjEtMjk5NDYzNzUxMS03OTAwMzE5NzgtMTc5Nzc0NDY2NS0xODc4NzEy"
  },
  "drafts": [],
  "queue": {
    "_links": {
      "self": {
        "href": "https://devops.caixa/projetos/_apis/build/Queues/150"
      }
    },
    "id": 150,
    "name": "Build-Linux-Node",
    "url": "https://devops.caixa/projetos/_apis/build/Queues/150",
    "pool": {
      "id": 43,
      "name": "Build-Linux-Node"
    }
  },
  "id": 6831,
  "name": "SIAVL-gerencial-frontend",
  "url": "https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_apis/build/Definitions/6831?revision=9",
  "uri": "vstfs:///Build/Definition/6831",
  "path": "\\SIAVL",
  "type": 2,
  "queueStatus": 0,
  "revision": 9,
  "createdDate": "2026-08-07T15:35:13.747Z",
  "project": {
    "id": "98fe0311-ffd2-418a-9d0d-507043380abd",
    "name": "Caixa",
    "url": "https://devops.caixa/projetos/_apis/projects/98fe0311-ffd2-418a-9d0d-507043380abd",
    "state": "wellFormed",
    "revision": 2931,
    "visibility": 0,
    "lastUpdateTime": "2026-07-29T14:28:39.653Z"
  }
}
