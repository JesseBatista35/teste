
sh-5.1$ ls -la /opt/app-root/src/
total 24764
drwxrwxr-x. 1 default root       62 Aug 10 15:25 .
drwxr-xr-x. 1 root    root       17 Mar  1 21:36 ..
drwxrwxr-x. 1 default root       19 Feb 17 21:49 .pki
drwxrwxr-x. 2 default root        6 Mar  1 21:39 nginx-start
-rw-rw-r--. 1 default root 25355796 Aug 10 15:25 siavl-gerencial-frontend-0.2.2.2.zip
sh-5.1$ ^C
sh-5.1$ 



path saida:

ng build --configuration production --build-optimizer --aot --output-path=dist && npm test


angular.json

{
  "$schema": "./node_modules/@angular/cli/lib/config/schema.json",
  "version": 1,
  "newProjectRoot": "projects",
  "projects": {
    "siavl-gerencial-frontend": {
      "projectType": "application",
      "schematics": {
        "@schematics/angular:component": {
          "standalone": true,
          "style": "scss"
        }
      },
      "root": "",
      "sourceRoot": "src",
      "prefix": "app",
      "architect": {
        "build": {
          "builder": "@angular-devkit/build-angular:browser",
          "options": {
            "main": "src/main.ts",
            "outputPath": "dist/siavl-gerencial-frontend",
            "index": "src/index.html",
            "polyfills": ["zone.js"],
            "tsConfig": "tsconfig.app.json",
            "inlineStyleLanguage": "scss",
            "assets": [
              "src/assets",
              {
                "glob": "**/*",
                "input": "src/public",
                "output": "/"
              }
            ],
            "styles": ["node_modules/sidsc-components/styles/main.scss", "src/styles.scss"],
            "scripts": []
          },
          "configurations": {
            "production": {
              "fileReplacements": [
                {
                  "replace": "src/environments/environment.ts",
                  "with": "src/environments/environment.prod.ts"
                }
              ],
              "optimization": {
                "scripts": true,
                "styles": {
                  "minify": true,
                  "inlineCritical": false
                },
                "fonts": {
                  "inline": false
                }
              },
              "budgets": [
                {
                  "type": "initial",
                  "maximumWarning": "2mb",
                  "maximumError": "5mb"
                },
                {
                  "type": "anyComponentStyle",
                  "maximumWarning": "2kB",
                  "maximumError": "4kB"
                }
              ],
              "outputHashing": "all"
            },
            "development": {
              "buildOptimizer": false,
              "optimization": false,
              "extractLicenses": false,
              "sourceMap": true,
              "outputHashing": "none"
            }
          },
          "defaultConfiguration": "production"
        },
        "serve": {
          "builder": "@angular-devkit/build-angular:dev-server",
          "configurations": {
            "production": {
              "buildTarget": "siavl-gerencial-frontend:build:production"
            },
            "development": {
              "buildTarget": "siavl-gerencial-frontend:build:development",
              "port": 3002
            }
          },
          "defaultConfiguration": "development"
        },
        "extract-i18n": {
          "builder": "@angular-devkit/build-angular:extract-i18n",
          "options": {
            "buildTarget": "siavl-gerencial-frontend:build"
          }
        },
        "test": {
          "builder": "@angular-devkit/build-angular:jest",
          "options": {
            "polyfills": ["zone.js", "zone.js/testing"],
            "tsConfig": "tsconfig.spec.json"
          }
        },
        "lint": {
          "builder": "@angular-eslint/builder:lint",
          "options": {
            "eslintConfig": ".eslintrc.js",
            "lintFilePatterns": ["src/**/*.ts"]
          }
        }
      }
    }
  },
  "cli": {
    "analytics": false
  }
}
