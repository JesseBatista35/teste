@angular-devkit/build-angular      14.2.13
@angular-devkit/core               14.2.13
@angular-devkit/schematics         14.2.13
@angular/cdk                       14.2.7
@angular/cli                       14.2.13
@angular/material                  14.2.7
@angular/material-moment-adapter   14.2.7
@schematics/angular                14.2.13
rxjs                               7.8.2
typescript                         4.6.4
    
Browserslist: browsers data (caniuse-lite) is 12 months old. Please run:
  npx update-browserslist-db@latest
  Why you should do it regularly: https://github.com/browserslist/update-db#readme
- Generating browser application bundles (phase: setup)...
Another process, with id 77687, is currently running ngcc.
Waiting up to 250s for it to finish.
(If you are sure no ngcc process is running then you should delete the lock-file at /opt/ads-agent/_work/11859/s/node_modules/.ngcc_lock_file.)
Error: Timed out waiting 250s for another ngcc process, with id 77687, to complete.
(If you are sure no ngcc process is running then you should delete the lock-file at /opt/ads-agent/_work/11859/s/node_modules/.ngcc_lock_file.)
    at AsyncLocker.create (file:///opt/ads-agent/_work/11859/s/node_modules/@angular/compiler-cli/bundles/chunk-2LU77VSE.js:1700:11)
    at async AsyncLocker.lock (file:///opt/ads-agent/_work/11859/s/node_modules/@angular/compiler-cli/bundles/chunk-2LU77VSE.js:1671:5)
    at async file:///opt/ads-agent/_work/11859/s/node_modules/@angular/compiler-cli/bundles/ngcc/main-ngcc.js:32:5
✔ Browser application bundle generation complete.
✔ Browser application bundle generation complete.

./src/main.ts - Error: Module build failed (from ./node_modules/@ngtools/webpack/src/ivy/index.js):
Error: Emit attempted before Angular Webpack plugin initialization.

./src/polyfills.ts - Error: Module build failed (from ./node_modules/@ngtools/webpack/src/ivy/index.js):
Error: Emit attempted before Angular Webpack plugin initialization.

Error: Failed to initialize Angular compilation - NGCC failed.


##[error]Bash exited with code '1'.
Finishing: Build Application



rodamos uma uma build dsem versao e passou


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
/bin/bash /opt/ads-agent/work_ads/_temp/1144ee38-e16d-4264-a138-41b6ad83310d.sh
ng build --configuration production --build-optimizer --aot --output-path=dist && npm test
<----ANGULAR---->

     _                      _                 ____ _     ___
    / \   _ __   __ _ _   _| | __ _ _ __     / ___| |   |_ _|
   / △ \ | '_ \ / _` | | | | |/ _` | '__|   | |   | |    | |
  / ___ \| | | | (_| | |_| | | (_| | |      | |___| |___ | |
 /_/   \_\_| |_|\__, |\__,_|_|\__,_|_|       \____|_____|___|
                |___/
    

Angular CLI: 14.2.13
Node: 16.14.0
Package Manager: npm 8.3.1 
OS: linux x64

Angular: 14.3.0
... animations, common, compiler, compiler-cli, core, forms
... language-service, platform-browser, platform-browser-dynamic
... router

Package                            Version
------------------------------------------------------------
@angular-devkit/architect          0.1402.13
@angular-devkit/build-angular      14.2.13
@angular-devkit/core               14.2.13
@angular-devkit/schematics         14.2.13
@angular/cdk                       14.2.7
@angular/cli                       14.2.13

