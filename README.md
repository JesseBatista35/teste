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



entao oo analista amigo meu me passou isso aqui para solucionar o problema


1. Para teste gerado a branch cesti-teste01 a partir da da TAG 2.1.0.7.
 
2. Feito os seguintes ajustes:
 
2.1. no arquivo assemble alterado:
 
DE:
mv $DEPLOY_DIR/dist/*  $DEPLOY_DIR/.
 
PARA:
mv $DEPLOY_DIR/dist/browser/*  $DEPLOY_DIR/.
 
2.2. No arquivo angular.json
 
DE:
          "builder": "@angular/build:application",
          "options": {
            "outputPath": {
              "base": "dist/sigrm-frontend",
              "browser": ""
            },
            "index": "src/index.html",
PARA:
          "builder": "@angular/build:application",
          "options": {
            "outputPath": "dist/sigrm-frontend",
            "index": "src/index.html",
            "browser": "src/main.ts",
