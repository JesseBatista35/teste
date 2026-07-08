2026-07-08T18:27:40.3599340Z ##[section]Starting: Verificando Status do Deployment
2026-07-08T18:27:40.3602729Z ==============================================================================
2026-07-08T18:27:40.3602839Z Task         : Bash
2026-07-08T18:27:40.3602881Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-08T18:27:40.3602942Z Version      : 3.227.0
2026-07-08T18:27:40.3603017Z Author       : Microsoft Corporation
2026-07-08T18:27:40.3603067Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-08T18:27:40.3603135Z ==============================================================================
2026-07-08T18:27:40.4977388Z Generating script.
2026-07-08T18:27:40.4987517Z ========================== Starting Command Output ===========================
2026-07-08T18:27:40.4994184Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/3c1d7c67-9da7-4618-80e1-2c46553a2522.sh
2026-07-08T18:27:40.5920717Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-07-08T18:27:56.8413638Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-07-08T18:27:56.8920833Z Waiting for rollout to finish: 0 of 1 updated replicas are available...
2026-07-08T18:33:47.8701215Z ##[error]The task has timed out.
2026-07-08T18:33:47.8702138Z ##[section]Finishing: Verificando Status do Deployment



2026-07-08T18:33:47.8721873Z ##[section]Starting: Logs da Aplicação
2026-07-08T18:33:47.8725207Z ==============================================================================
2026-07-08T18:33:47.8725326Z Task         : Bash
2026-07-08T18:33:47.8725368Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-08T18:33:47.8725431Z Version      : 3.227.0
2026-07-08T18:33:47.8725542Z Author       : Microsoft Corporation
2026-07-08T18:33:47.8725597Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-08T18:33:47.8725678Z ==============================================================================
2026-07-08T18:33:48.0158756Z Generating script.
2026-07-08T18:33:48.0169671Z ========================== Starting Command Output ===========================
2026-07-08T18:33:48.0176679Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/d8ad10f6-dbe1-4154-870d-356494db6c5b.sh
2026-07-08T18:33:48.0226016Z + shopt -s expand_aliases
2026-07-08T18:33:48.0226257Z + [[ -n okd4_nprd ]]
2026-07-08T18:33:48.0226483Z + [[ okd4_nprd =~ ocp ]]
2026-07-08T18:33:48.0226606Z + [[ -n okd4_nprd ]]
2026-07-08T18:33:48.0226743Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-07-08T18:33:48.0227307Z + app=sinch-web-angular20-intra-des
2026-07-08T18:33:48.0227405Z + oc version
2026-07-08T18:33:48.0879866Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-07-08T18:33:48.0880133Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-07-08T18:33:48.0880344Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-07-08T18:33:48.0909225Z ++ tac
2026-07-08T18:33:48.0909770Z ++ oc get pod -l name=sinch-web-angular20-intra-des -n sinch-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-07-08T18:33:48.0910797Z ++ grep -v '^$'
2026-07-08T18:33:48.0911051Z ++ head -n1
2026-07-08T18:33:48.1858042Z + last_pod=sinch-web-angular20-intra-des-5-2swwv
2026-07-08T18:33:48.1858765Z + echo 'Logs do POD: sinch-web-angular20-intra-des-5-2swwv'
2026-07-08T18:33:48.1859076Z + oc logs sinch-web-angular20-intra-des-5-2swwv -c sinch-web-angular20-intra-des -n sinch-des
2026-07-08T18:33:48.1859296Z Logs do POD: sinch-web-angular20-intra-des-5-2swwv
2026-07-08T18:33:48.2646004Z sed: can't read /opt/app-root/src/main*.js: No such file or directory
2026-07-08T18:33:48.2726666Z ##[section]Finishing: Logs da Aplicação




{
  "$schema": "./node_modules/@angular/cli/lib/config/schema.json",
  "version": 1,
  "newProjectRoot": "projects",
  "projects": {
    "sinch-front": {
      "projectType": "application",
      "schematics": {
        "@schematics/angular:component": {
          "style": "scss"
        }
      },
      "root": "",
      "sourceRoot": "src",
      "prefix": "app",
      "architect": {
        "build": {
          "builder": "@angular-devkit/build-angular:application",
          "options": {
            "outputPath": {
              "base": "dist/sinch-front"
            },
            "index": "src/index.html",
            "polyfills": [
              "src/polyfills.ts"
            ],
            "tsConfig": "tsconfig.app.json",
            "aot": true,
            "assets": [
              "src/favicon.ico",
              "src/assets"
            ],
            "styles": [
              "src/assets/fonts/fontawesome-free-5.13.0/css/fontawesome.min.css",
              "src/styles.scss"
            ],
            "scripts": [],
            "allowedCommonJsDependencies": [
              "lodash",
              "html2canvas",
              "pdfmake",
              "pdfmake/build/pdfmake",
              "pdfmake/build/vfs_fonts",
              "xlsx",
              "jsrsasign"
            ],
            "browser": "src/main.ts"
          },
          "configurations": {
            "production": {
              "fileReplacements": [
                {
                  "replace": "src/environments/environment.ts",
                  "with": "src/environments/environment.prod.ts"
                }
              ],
              "optimization": true,
              "outputHashing": "all",
              "sourceMap": false,
              "namedChunks": false,
              "extractLicenses": true,
              "budgets": [
                {
                  "type": "initial",
                  "maximumWarning": "6mb",
                  "maximumError": "8mb"
                },
                {
                  "type": "anyComponentStyle",
                  "maximumWarning": "6kb",
                  "maximumError": "10kb"
                }
              ]
            }
          }
        },
        "serve": {
          "builder": "@angular-devkit/build-angular:dev-server",
          "options": {
            "buildTarget": "sinch-front:build"
          },
          "configurations": {
            "production": {
              "buildTarget": "sinch-front:build:production"
            }
          }
        },
        "extract-i18n": {
          "builder": "@angular-devkit/build-angular:extract-i18n",
          "options": {
            "buildTarget": "sinch-front:build"
          }
        },
        "test": {
          "builder": "@angular-devkit/build-angular:karma",
          "options": {
            "main": "src/test.ts",
            "polyfills": "src/polyfills.ts",
            "tsConfig": "tsconfig.spec.json",
            "karmaConfig": "karma.conf.js",
            "include": [
              "src/app/models/**/*.spec.ts"
            ],
            "assets": [
              "src/favicon.ico",
              "src/assets"
            ],
            "styles": [
              "src/styles.scss"
            ],
            "scripts": []
          }
        },
        "e2e": {
          "builder": "@angular-devkit/build-angular:protractor",
          "options": {
            "protractorConfig": "e2e/protractor.conf.js",
            "devServerTarget": "sinch-front:serve"
          },
          "configurations": {
            "production": {
              "devServerTarget": "sinch-front:serve:production"
            }
          }
        }
      }
    }
  },
  "cli": {
    "analytics": "a16d3369-a19b-47ce-b76e-66c4a5c58bf2"
  },
  "schematics": {
    "@schematics/angular:component": {
      "type": "component"
    },
    "@schematics/angular:directive": {
      "type": "directive"
    },
    "@schematics/angular:service": {
      "type": "service"
    },
    "@schematics/angular:guard": {
      "typeSeparator": "."
    },
    "@schematics/angular:interceptor": {
      "typeSeparator": "."
    },
    "@schematics/angular:module": {
      "typeSeparator": "."
    },
    "@schematics/angular:pipe": {
      "typeSeparator": "."
    },
    "@schematics/angular:resolver": {
      "typeSeparator": "."
    }
  }
}


