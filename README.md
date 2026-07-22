Skip to main content
Azure DevOps
projetos
/
Caixa
/
Repos
/
Files
/

SIAFF-frontend
Search


Caixa

Overview

Boards

Repos
Files
Commits
Pushes
Branches
Tags
Pull requests

Pipelines

Test Plans

Artifacts
Project settings
SIAFF-frontend

.s2i
src
.browserslistrc
.editorconfig
.gitignore
.npmrc
angular.json
karma.conf.js
package-lock.json
package.json

README.md
sonar-project.properties
tsconfig.app.json
tsconfig.json
tsconfig.spec.json

sprint1-3t2026

/
package.json
package.json

Edit

Contents
History
Compare
Blame

1234567891011121314151617181920212223242526272829303132333435363738394041424344
{
  "name": "SIAFF-Frontend",
  "version": "1.41.0.201",
  "scripts": {
    "ng": "ng",
    "start": "ng serve",
    "build": "ng build",
    "test": "ng test --code-coverage --watch=false --source-map=true",
    "lint": "ng lint",
    "preversion": "npm test",



{
  "name": "SIAFF-Frontend",
  "version": "1.41.0.201",
  "scripts": {
    "ng": "ng",
    "start": "ng serve",
    "build": "ng build",
    "test": "ng test --code-coverage --watch=false --source-map=true",
    "lint": "ng lint",
    "preversion": "npm test",
    "version": "npm run build",
    "postversion": "git push && git push --tags && rm -rf build/temp"
  },
  "private": true,
  "dependencies": {
    "@angular/animations": "~13.4.0",
    "@angular/cdk": "^12.2.13",
    "@angular/common": "~13.4.0",
    "@angular/compiler": "~13.4.0",
    "@angular/core": "~13.4.0",
    "@angular/forms": "~13.4.0",
    "@angular/material": "^12.2.13",
    "@angular/material-moment-adapter": "^12.2.13",
    "@angular/platform-browser": "~13.4.0",
    "@angular/platform-browser-dynamic": "~13.4.0",
    "@angular/router": "~13.4.0",
    "@material/checkbox": "^12.0.0",
    "@material/form-field": "^12.0.0",
    "bootstrap": "^5.2.1",
    "chessboardjs": "0.0.1",
    "crypto-js": "^4.2.0",
    "date-fns": "^2.30.0",
    "file-saver": "^2.0.5",
    "fs": "0.0.1-security",
    "internal-ip": "^7.0.0",
    "jwt-decode": "^3.1.2",
    "karma-firefox-launcher": "^2.1.2",
    "karma-junit-reporter": "^2.0.1",
    "karma-sonarqube-reporter": "^1.4.0",
    "karma-spec-reporter": "^0.0.36",
    "keycloak-angular": "^10.0.0",
    "keycloak-js": "^18.0.0",
    "moment": "^2.29.4",
    "ms": "^2.1.3",
    "ng2-currency-mask": "^13.0.3",
    "ngx-mask": "^12.0.0",
    "ngx-slick-carousel": "^15.0.0",
    "ngx-toastr": "^14.1.4",
    "rxjs": "~6.6.0",
    "tslib": "^2.3.0",
    "xlsx": "^0.18.5",
    "xlsx-color": "^0.14.30",
    "xlsx-style": "^0.8.13",
    "zone.js": "~0.11.4"
  },
  "devDependencies": {
    "@angular-devkit/build-angular": "~13.3.11",
    "@angular/cli": "~13.3.11",
    "@angular/compiler-cli": "~13.4.0",
    "@types/crypto-js": "^4.2.1",
    "@types/file-saver": "^2.0.7",
    "@types/jasmine": "~3.8.0",
    "@types/node": "^14.18.63",
    "jasmine-core": "~3.8.0",
    "karma": "~6.3.0",
    "karma-chrome-launcher": "~3.1.0",
    "karma-coverage": "~2.0.3",
    "karma-coverage-istanbul-reporter": "^3.0.3",
    "karma-jasmine": "~4.0.0",
    "karma-jasmine-html-reporter": "~1.7.0",
    "karma-script-launcher": "^1.0.0",
    "sonar-scanner": "^3.1.0",
    "typescript": "~4.6.4"
  }
}

