jest.config.js 


const esModules = ['@angular'];
const path = require('path');
const { pathsToModuleNameMapper } = require('ts-jest');
const { paths } = require('./tsconfig.json').compilerOptions;
globalThis.ngJest = {
  skipNgcc: true,
  tsconfig: 'tsconfig.spec.json',
};

module.exports = {
  preset: 'jest-preset-angular',
  globalSetup: 'jest-preset-angular/global-setup',
  roots: ['<rootDir>/src'],
  setupFilesAfterEnv: ['<rootDir>/setup-jest.ts'],
  extensionsToTreatAsEsm: ['.ts'],
  moduleFileExtensions: ['ts', 'html', 'js', 'json', 'mjs'],
  moduleNameMapper: {
    '^(\\.{1,2}/.*)\\.js$': '$1',
    '^src/(.*)$': '<rootDir>/src/$1',
    '^caixa-sipnc-core$': path.resolve(__dirname, 'caixa-sipnc-core.ts'),
  },

  transformIgnorePatterns: [`<rootDir>/node_modules/(?!.*\\.mjs$|${esModules.join('|')})`],
  snapshotSerializers: [
    'jest-preset-angular/build/serializers/no-ng-attributes',
    'jest-preset-angular/build/serializers/ng-snapshot',
    'jest-preset-angular/build/serializers/html-comment',
  ],
  coverageDirectory: './coverage',
  coverageReporters: ['clover', 'json', 'lcov', 'text', 'text-summary'],
  collectCoverage: true,
  testResultsProcessor: 'jest-sonar-reporter',
};

=====
sonar-project.properties



# SonarQube server connection details
sonar.host.url=http://sonar.produtos.caixa

# Project information
sonar.projectKey=SIPNC-conta1288-microfront
sonar.projectName=SIPNC-conta1288-microfront

# Source code encoding
sonar.sourceEncoding=UTF-8

# Source code directories
sonar.sources=src
sonar.tests=src
sonar.language=ts

# Coverage configuration
sonar.javascript.lcov.reportPaths=coverage/lcov.info
sonar.typescript.lcov.reportPaths=coverage/lcov.info
sonar.testExecutionReportPaths=test-report.xml

# Additional
sonar.test.inclusions=**/*.spec.ts
sonar.exclusions=**/node_modules/**,**/assets/**,**/environments/**,**/i18n/**,**/single-spa/**,**/*spa.ts,**/main.ts,**/value-accessor-base.ts,**/*.js,**/*.model.ts,**/*.enum.ts,**/*.factory.ts,**/*.directive.ts,**/utils.ts,**/value-acessor-base.ts,**/caixa-sipnc-core.ts,**/constantes.ts,**/logradouro.mock.ts,**/setup-jest.ts,app/model/**/*.ts




{
  "name": "caixa-sipnc-abe-conta-pf-1288-des",
  "version": "1.1.0.1",
  "scripts": {
    "ng": "ng",
    "start": "ng serve --port 4286",
    "build": "ng build",
    "lint": "ng lint",
    "e2e": "ng e2e",
    "build:single-spa": "ng build --prod",
    "serve:single-spa": "ng serve --disable-host-check --port 4330 --live-reload false",
    "sonar": "sonar-scanner",
    "test": "jest --coverage",
    "test:verbose": "jest --verbose",
    "test:watch": "jest --watchAll"
  },
  "private": true,
  "dependencies": {
    "@angular-builders/jest": "^16.0.0",
    "@angular/animations": "~16.2.0",
    "@angular/cdk": "^16.2.4",
    "@angular/common": "~16.2.0",
    "@angular/compiler": "~16.2.0",
    "@angular/core": "~16.2.0",
    "@angular/forms": "~16.2.0",
    "@angular/material": "^16.2.4",
    "@angular/platform-browser": "~16.2.0",
    "@angular/platform-browser-dynamic": "~16.2.0",
    "@angular/router": "~16.2.0",
    "@auth0/angular-jwt": "^5.0.2",
    "@babel/core": "^7.26.0",
    "@fortawesome/fontawesome-free": "^5.15.4",
    "@ng-select/ng-select": "^11.1.1",
    "angular-mydatepicker": "^0.11.5",
    "babel-preset-jest": "^29.6.3",
    "bootstrap": "^4.6.2",
    "moment": "^2.29.4",
    "ngx-bootstrap": "^11.0.2",
    "ngx-mask": "^16.3.8",
    "ngx-pagination": "^6.0.3",
    "ngx-perfect-scrollbar": "^8.0.0",
    "rxjs": "~7.8.0",
    "single-spa": ">=5.5.0",
    "single-spa-angular": "^8.1.0",
    "sipnc-componentes": "^0.3.0",
    "tslib": "^2.3.0",
    "utf8": "^3.0.0",
    "vanilla-masker": "^1.2.0",
    "zone.js": "~0.13.0",
    "sidsc-components": "16.4.0"
  },
  "devDependencies": {
    "@angular-builders/custom-webpack": "16.0.1",
    "@angular-devkit/build-angular": "~16.2.1",
    "@angular-eslint/builder": "^16.3.1",
    "@angular-eslint/eslint-plugin": "^16.3.1",
    "@angular-eslint/schematics": "^16.3.1",
    "@angular/cli": "~16.2.1",
    "@angular/compiler-cli": "~16.2.0",
    "@types/jest": "^29.5.14",
    "@types/node": "^12.11.1",
    "@typescript-eslint/eslint-plugin": "^4.33.0",
    "@typescript-eslint/parser": "^4.33.0",
    "eslint": "^7.26.0",
    "jest": "^29.7.0",
    "jest-environment-jsdom": "^29.7.0",
    "jest-preset-angular": "^14.0.3",
    "jest-transform-stub": "^2.0.0",
    "protractor": "~7.0.0",
    "sonarqube-scanner": "^3.5.0",
    "ts-jest": "^29.2.5",
    "ts-node": "^8.10.2",
    "typescript": "~5.1.3",
    "webpack-config-single-spa": "^5.2.0",
    "webpack-merge": "^5.8.0",
    "@babel/core": "^7.25.2",
    "babel-preset-jest": "^29.6.3",
    "ts-jest": "^29.2.4"
  }
}
