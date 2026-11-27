{
  "name": "sdsc-library",
  "version": "5.0.0",
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
    "iconoir:update": "npm update iconoir && npm run iconoir:build"
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
  "packageManager": "npm@10.9.3",
  "dependencies": {
    "@angular/cdk": "^21.2.14",
    "@caixa/sidsc-sdsc-components": "^21.0.0-beta.0",
    "glob": "^13.0.6",
    "iconoir": "^7.11.1",
    "lottie-web": "^5.13.0",
    "ngx-mask": "^21.0.1",
    "rxjs": "~7.8.0",
    "tslib": "^2.3.0",
    "zone.js": "^0.16.2"
  },
  "devDependencies": {
    "@angular-devkit/architect": "^0.2102.18",
    "@angular-devkit/build-angular": "^21.2.18",
    "@angular-devkit/core": "^21.2.18",
    "@angular/build": "^21.2.17",
    "@angular/cli": "^21.2.17",
    "@angular/common": "^21.2.17",
    "@angular/compiler": "^21.2.17",
    "@angular/compiler-cli": "^21.2.17",
    "@angular/core": "^21.2.17",
    "@angular/forms": "^21.2.17",
    "@angular/platform-browser": "^21.2.17",
    "@angular/platform-browser-dynamic": "^21.2.17",
    "@angular/router": "^21.2.17",
    "@compodoc/compodoc": "^2.0.0",
    "@storybook/addon-a11y": "^10.4.6",
    "@storybook/addon-docs": "^10.4.6",
    "@storybook/angular": "^10.4.6",
    "@types/node": "^26.1.0",
    "jsdom": "^28.1.0",
    "ng-packagr": "^21.2.0",
    "prettier": "^3.8.1",
    "react": "^19.0.0",
    "react-dom": "^19.0.0",
    "storybook": "^10.4.6",
    "ts-node": "^10.9.2",
    "typescript": "~5.9.2",
    "vitest": "^4.0.8"
  }
}
