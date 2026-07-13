Bom dia, vlw!
 
Jesse, eu consigo fazer com que os devs do meu time não possam comitar em uma Branch específica? Queria que fosse apenas por pull request, e o pull request tem que estar aprovado por mim
 
e acredito que descobri porque ele mostrou a tela de login errada. ele builda a aplicação com 
ng build --configuration production --output-path=dist
e no meu angular.json tem uma parte assim:
"configurations": {
            "production": {
              "fileReplacements": [
                {
                  "replace": "src/environments/environment.ts",
                  "with": "src/environments/environment.prod.ts"
                }
              ],
              "optimization": true,
              "extractLicenses": false,
              "sourceMap": false,
              "namedChunks": false,
              "budgets": [
                {
                  "type": "initial",
                  "maximumWarning": "2mb",
                  "maximumError": "5mb"
                },
                {
                  "type": "anyComponentStyle",
                  "maximumWarning": "2kb",
                  "maximumError": "10kb"
                }
              ],
              "outputHashing": "all"
            },
            "development": {
              "optimization": false,
              "extractLicenses": false,
              "sourceMap": true,
              "namedChunks": true
            }
          },
          "defaultConfiguration": "production"
        },
        "serve": {
          "builder": "@angular/build:dev-server",
          "configurations": {
            "production": {
              "buildTarget": "quickstart-angular-dsc:build:production"
            },
            "development": {
              "buildTarget": "quickstart-angular-dsc:build:development"
            }
          },
          "defaultConfiguration": "development"
        },
        "extract-i18n": {
          "builder": "@angular/build:extract-i18n",
          "options": {
            "buildTarget": "quickstart-angular-dsc:build"
          }
        },
 
ele substitui o arquivo de environment por src/environments/environment.prod.ts que tem o link do login de produção e não de des
 
export enum DnsSSO {
  DES = 'https://login.des.caixa/auth',
  PRD = 'https://login.prd.caixa/auth',
}
 
