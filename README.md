{
  "name": "sdsc-library",
  "version": "0.0.1",
  "scripts": {
    "ng": "ng",
    "build:lib": "ng build sdsc",
    "build:iconoir": "npm run iconoir:build && ng build sdsc",
    "watch": "ng build sdsc --watch",
    "test": "ng test sdsc",
    "package": "cd dist/sdsc && npm pack",
    "storybook": "ng run sdsc:storybook",
    "build:storybook": "ng run sdsc:build-storybook",
    "iconoir:build": "ts-node scripts/build-iconoir-icons.ts",
    "iconoir:update": "npm update iconoir && npm run iconoir:build",
    "tokens:verify": "node scripts/tokens/verify-colors.mjs",
    "storybook:verify": "node scripts/tokens/verify-storybook.mjs",
    "new-trademark:check": "npm run tokens:verify && npm run storybook:verify"
  },
  "prettier": {
    "printWidth": 100,
    "singleQuote": true,
    "overrides": [
      {
        "files": "*.html",
        "options": {
          "parser": "angular"
        }
      }
    ]
  },
  "private": true,
  "dependencies": {
    "@angular/cdk": "^20.2.14",
    "glob": "^13.0.1",
    "iconoir": "^7.11.0",
    "lottie-web": "^5.13.0",
    "ngx-mask": "^20.0.3",
    "rxjs": "~7.8.0",
    "tslib": "^2.3.0",
    "zone.js": "~0.15.0"
  },
  "devDependencies": {
    "@angular-devkit/architect": "^0.2003.0",
    "@angular-devkit/build-angular": "^20.3.0",
    "@angular-devkit/core": "^20.3.0",
    "@angular/build": "^20.3.13",
    "@angular/cli": "^20.3.13",
    "@angular/common": "^20.3.0",
    "@angular/compiler": "^20.3.0",
    "@angular/compiler-cli": "^20.3.0",
    "@angular/core": "^20.3.0",
    "@angular/forms": "^20.3.0",
    "@angular/platform-browser": "^20.3.0",
    "@angular/platform-browser-dynamic": "^20.3.0",
    "@angular/router": "^20.3.0",
    "@compodoc/compodoc": "^1.1.32",
    "@storybook/addon-a11y": "^10.1.11",
    "@storybook/addon-docs": "^10.1.11",
    "@storybook/angular": "^10.1.11",
    "@types/jasmine": "~5.1.0",
    "@types/node": "^25.2.1",
    "jasmine-core": "~5.9.0",
    "karma": "~6.4.0",
    "karma-chrome-launcher": "~3.2.0",
    "karma-coverage": "~2.2.0",
    "karma-jasmine": "~5.1.0",
    "karma-jasmine-html-reporter": "~2.1.0",
    "ng-packagr": "^20.3.2",
    "prettier": "^2.8.8",
    "storybook": "^10.1.11",
    "ts-node": "^10.9.2",
    "typescript": "~5.9.2"
  },
  "allowScripts": {
    "@compodoc/compodoc@1.2.1": true,
    "@parcel/watcher@2.5.6": true,
    "esbuild@0.28.0": true,
    "esbuild@0.25.12": true,
    "esbuild@0.27.7": true,
    "lmdb@3.4.2": true,
    "msgpackr-extract@3.0.3": true
  }
}
