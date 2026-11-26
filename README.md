{
  "name": "sidsc",
  "version": "3.4.1",
  "scripts": {
    "ng": "ng",
    "storybook": "ng run sidsc-storybook:storybook --debug-webpack --no-open",
    "build:storybook": "ng run sidsc-storybook:build-storybook --output-dir=dist/sidsc-storybook",
    "build:storybook-dataset": "tsx ./projects/sidsc-storybook/scripts/generate-stories-dataset.ts",
    "package": "cd dist/sidsc-components && npm pack",
    "build": "npm-run-all --sequential build:lib build:schematics --parallel lib:copy-files:collection lib:copy-files:ng-add-schema",
    "build:lib": "ng build sidsc-components",
    "build:schematics": "tsc -p projects/sidsc-components/tsconfig.schematics.json",
    "build:stats": "ng run sidsc-storybook:build-storybook --stats-json --output-dir=dist/sidsc-storybook",
    "build:lib:development": "npm-run-all clean --sequential build:lib build:schematics --parallel lib:copy-files:collection lib:copy-files:ng-add-schema",
    "lib:copy-files:collection": "copyfiles -f -s projects/sidsc-components/schematics/collection.json dist/sidsc-components/schematics",
    "lib:copy-files:ng-add-schema": "copyfiles -f -s projects/sidsc-components/schematics/ng-add/schema.json dist/sidsc-components/schematics/ng-add",
    "lib:generate-reporter": "npm-run-all clean --sequential build:stats analyze",
    "analyze": "webpack-bundle-analyzer dist/sidsc-storybook/preview-stats.json",
    "watch": "ng build --watch --configuration development",
    "test": "jest --coverage",
    "test:verbose": "jest --verbose",
    "test:watch": "jest --watchAll",
    "clean": "rimraf dist",
    "format": "prettier --write \"projects/sidsc-components/**/*.{ts,js,html,scss,css,json}\"",
    "format:check": "prettier --check \"projects/sidsc-components/**/*.{ts,js,html,scss,css,json}\"",
    "type-check": "tsc --noEmit --skipLibCheck"
  },
  "private": true,
  "dependencies": {
    "@angular/animations": "^19.2.18",
    "@angular/cdk": "^19.2.18",
    "@angular/common": "^19.2.18",
    "@angular/compiler": "^19.2.18",
    "@angular/core": "^19.2.18",
    "@angular/forms": "^19.2.18",
    "@angular/localize": "^19.2.18",
    "@angular/material": "^19.2.18",
    "@angular/material-date-fns-adapter": "^19.2.18",
    "@angular/platform-browser": "^19.2.18",
    "@angular/platform-browser-dynamic": "^19.2.18",
    "@angular/router": "^19.2.18",
    "date-fns": "^3.6.0",
    "highlight.js": "^11.9.0",
    "inputmask": "^5.0.9-beta.62",
    "lodash-es": "^4.18.1",
    "ng2-currency-mask": "^13.0.3",
    "ngx-mask": "^19.0.6",
    "rxjs": "~7.8.1",
    "sidsc-components": "^19.4.0",
    "tslib": "^2.6.2",
    "zone.js": "^0.15.1"
  },
  "devDependencies": {
    "@angular-devkit/build-angular": "^19.2.9",
    "@angular/cli": "~19.2.9",
    "@angular/compiler-cli": "^19.2.18",
    "@compodoc/compodoc": "^1.1.26",
    "@storybook/addon-a11y": "^8.6.17",
    "@storybook/addon-docs": "^8.6.17",
    "@storybook/addon-essentials": "^8.6.17",
    "@storybook/addon-interactions": "^8.6.17",
    "@storybook/addon-links": "^8.6.17",
    "@storybook/addon-styling-webpack": "^1.0.1",
    "@storybook/addon-webpack5-compiler-swc": "^3.0.0",
    "@storybook/angular": "^8.6.17",
    "@storybook/blocks": "^8.6.17",
    "@storybook/manager-api": "^8.6.17",
    "@storybook/test": "^8.6.17",
    "@storybook/theming": "^8.6.17",
    "@types/jest": "^29.5.14",
    "@types/lodash": "4.14.201",
    "@types/lodash-es": "4.17.11",
    "copyfiles": "^2.4.1",
    "css-loader": "^7.1.2",
    "jest": "^29.7.0",
    "jest-preset-angular": "^14.5.5",
    "jest-sonar": "^0.2.16",
    "jest-sonar-reporter": "^2.0.0",
    "ng-packagr": "^19.2.0",
    "npm-run-all": "^4.1.5",
    "prettier": "^3.7.1",
    "resolve-url-loader": "^5.0.0",
    "rimraf": "^5.0.5",
    "sass": "^1.87.0",
    "sass-loader": "^16.0.5",
    "storybook": "^8.6.17",
    "style-loader": "^4.0.0",
    "ts-node": "^10.9.2",
    "tsx": "^4.20.6",
    "typescript": "~5.6.2",
    "wait-on": "^7.2.0",
    "webpack-bundle-analyzer": "^4.10.1"
  },
  "overrides": {
    "webpack": "~5.98.0",
    "@compodoc/compodoc": {
      "chokidar": "~3.6.0"
    }
  }
}


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

SIDSC
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
SIDSC

.github
.s2i
.vscode
projects
.editorconfig
.gitignore
.hintrc
.npmrc
.prettierignore
.prettierrc
angular.json
jest-global-mocks.ts
jest.config.ts
package-lock.json
package.json
plan.md
README.md
setup-jest.ts
tsconfig.json
tsconfig.spec.json

3.4.1.202611131636

/
karma.conf
karma.conf

Contents
No item exists at path '/karma.conf' at version 'Tag 3.4.1.202611131636'
File not found or you do not have permission
No item exists at path '/karma.conf' at version 'Tag 3.4.1.202611131636'
Go to default branch
Showing 1 items.

No items found

No items found

No items found

Showing 3 items.

Showing 2 items.

Showing 1 items.

Showing 1 items.

Showing 2 items.

Showing 2 items.

No items found

No items found

Showing 1 items.

No items found

Showing 1 items.

No items found

No items found

No items found

Showing 1 items.

Collapsed



nao tem karma.conf




