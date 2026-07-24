Starting: Build Application
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/a554915d-abfc-46d0-8f2b-4772120b92f7.sh
ng build --configuration production --build-optimizer --aot --output-path=dist
<----ANGULAR---->

     _                      _                 ____ _     ___
    / \   _ __   __ _ _   _| | __ _ _ __     / ___| |   |_ _|
   / △ \ | '_ \ / _` | | | | |/ _` | '__|   | |   | |    | |
  / ___ \| | | | (_| | |_| | | (_| | |      | |___| |___ | |
 /_/   \_\_| |_|\__, |\__,_|_|\__,_|_|       \____|_____|___|
                |___/
    

Angular CLI: 16.2.16
Node: 18.19.0
Package Manager: npm 10.2.3
OS: linux x64

Angular: 16.2.12
... animations, common, compiler, compiler-cli, core, forms
... localize, platform-browser, platform-browser-dynamic, router

Package                              Version
--------------------------------------------------------------
@angular-devkit/architect            0.1602.16
@angular-devkit/build-angular        16.2.16
@angular-devkit/core                 16.2.16
@angular-devkit/schematics           16.2.16
@angular/cdk                         16.2.14
@angular/cli                         16.2.16
@angular/material                    16.2.14


For more info see: https://angular.io/guide/build#configuring-commonjs-dependencies

Warning: /opt/ads-agent/_work/8/s/node_modules/sipnc-componentes/fesm2022/sipnc-componentes.mjs depends on 'moment'. CommonJS or AMD dependencies can cause optimization bailouts.
For more info see: https://angular.io/guide/build#configuring-commonjs-dependencies

Warning: /opt/ads-agent/_work/8/s/node_modules/sipnc-componentes/fesm2022/sipnc-componentes.mjs depends on 'utf8'. CommonJS or AMD dependencies can cause optimization bailouts.
For more info see: https://angular.io/guide/build#configuring-commonjs-dependencies

Warning: /opt/ads-agent/_work/8/s/src/styles.scss?ngGlobalStyle depends on '!../node_modules/style-loader/dist/runtime/injectStylesIntoStyleTag.js'. CommonJS or AMD dependencies can cause optimization bailouts.
For more info see: https://angular.io/guide/build#configuring-commonjs-dependencies

Warning: /opt/ads-agent/_work/8/s/src/styles.scss?ngGlobalStyle depends on '!../node_modules/style-loader/dist/runtime/insertBySelector.js'. CommonJS or AMD dependencies can cause optimization bailouts.
For more info see: https://angular.io/guide/build#configuring-commonjs-dependencies

Warning: /opt/ads-agent/_work/8/s/src/styles.scss?ngGlobalStyle depends on '!../node_modules/style-loader/dist/runtime/insertStyleElement.js'. CommonJS or AMD dependencies can cause optimization bailouts.
For more info see: https://angular.io/guide/build#configuring-commonjs-dependencies

Warning: /opt/ads-agent/_work/8/s/src/styles.scss?ngGlobalStyle depends on '!../node_modules/style-loader/dist/runtime/setAttributesWithoutAttributes.js'. CommonJS or AMD dependencies can cause optimization bailouts.
For more info see: https://angular.io/guide/build#configuring-commonjs-dependencies

Warning: /opt/ads-agent/_work/8/s/src/styles.scss?ngGlobalStyle depends on '!../node_modules/style-loader/dist/runtime/styleDomAPI.js'. CommonJS or AMD dependencies can cause optimization bailouts.
For more info see: https://angular.io/guide/build#configuring-commonjs-dependencies

Warning: /opt/ads-agent/_work/8/s/src/styles.scss?ngGlobalStyle depends on '!../node_modules/style-loader/dist/runtime/styleTagTransform.js'. CommonJS or AMD dependencies can cause optimization bailouts.
For more info see: https://angular.io/guide/build#configuring-commonjs-dependencies



Error: src/app/services/notificacao-snackbar.service.ts:33:37 - error TS2339: Property 'snackBar' does not exist on type 'DscSnackbarService'.

33             this.dscSnackbarService.snackBar.dismiss();
                                       ~~~~~~~~



##[error]Bash exited with code '1'.
Finishing: Build Application
