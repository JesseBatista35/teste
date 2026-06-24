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
/usr/bin/bash /opt/ads-agent/_work/_temp/ea43b66b-99c5-4bb2-9c91-c76281d82be4.sh
ng build --configuration production --output-path=dist
<----ANGULAR---->

     _                      _                 ____ _     ___
    / \   _ __   __ _ _   _| | __ _ _ __     / ___| |   |_ _|
   / △ \ | '_ \ / _` | | | | |/ _` | '__|   | |   | |    | |
  / ___ \| | | | (_| | |_| | | (_| | |      | |___| |___ | |
 /_/   \_\_| |_|\__, |\__,_|_|\__,_|_|       \____|_____|___|
                |___/
    

Angular CLI: 12.2.18
Node: 14.18.2
Package Manager: npm 6.14.15
OS: linux x64

Angular: 12.2.17
... animations, common, compiler, compiler-cli, core, forms
... platform-browser, platform-browser-dynamic, router

Package                         Version
---------------------------------------------------------
@angular-devkit/architect       0.1202.18
@angular-devkit/build-angular   12.2.18
@angular-devkit/core            12.2.18
@angular-devkit/schematics      12.2.18
@angular/cdk                    12.2.13
@angular/cli                    12.2.18
@angular/material               12.2.13

Compiling @azure/msal-angular : es2015 as esm2015
Compiling @angular/material/form-field : es2015 as esm2015
Compiling @angular/material/button : es2015 as esm2015
Compiling @angular/material/tooltip : es2015 as esm2015
Compiling @angular/material/select : es2015 as esm2015
Compiling @angular/material/input : es2015 as esm2015
Compiling @angular/material/divider : es2015 as esm2015
Compiling @angular/material/icon : es2015 as esm2015
Compiling @angular/material/datepicker : es2015 as esm2015
Compiling @angular/material/tabs : es2015 as esm2015
Compiling @angular/material/toolbar : es2015 as esm2015
Compiling @angular/material/sidenav : es2015 as esm2015
Compiling @angular/material/list : es2015 as esm2015
Compiling @angular/material/paginator : es2015 as esm2015
Compiling @angular/material/sort : es2015 as esm2015
Compiling @angular/material/dialog : es2015 as esm2015
Compiling @angular/material/checkbox : es2015 as esm2015
Compiling @angular/material/expansion : es2015 as esm2015
Compiling dsc-components : es2015 as esm2015
Compiling @angular/material/grid-list : es2015 as esm2015
Compiling @angular/material/menu : es2015 as esm2015
Compiling @angular/material/progress-spinner : es2015 as esm2015
Compiling @angular/material/radio : es2015 as esm2015
Compiling @angular/material/table : es2015 as esm2015
Compiling @angular/material/card : es2015 as esm2015
Compiling @angular/material/chips : es2015 as esm2015
Compiling @angular/material/snack-bar : es2015 as esm2015
✔ Browser application bundle generation complete.
✔ Browser application bundle generation complete.

Error: node_modules/@types/lodash/common/common.d.ts:266:65 - error TS1005: '?' expected.

266     type StringToNumber<T> = T extends `${infer N extends number}` ? N : never;
                                                                    ~


Error: node_modules/@types/lodash/common/object.d.ts:1026:46 - error TS1005: '?' expected.

1026         : K extends `${infer N extends number}` ? T[N]
                                                  ~


Error: node_modules/@types/lodash/common/object.d.ts:1026:51 - error TS2536: Type 'N' cannot be used to index type 'T'.

1026         : K extends `${infer N extends number}` ? T[N]
                                                       ~~~~


Error: node_modules/@types/lodash/common/object.d.ts:1031:46 - error TS1005: '?' expected.

1031         : K extends `${infer N extends number}` ? T[N]
                                                  ~


Error: node_modules/@types/lodash/common/object.d.ts:1031:51 - error TS2536: Type 'N' cannot be used to index type 'T'.

1031         : K extends `${infer N extends number}` ? T[N]
                                                       ~~~~


Error: node_modules/@types/lodash/common/object.d.ts:1041:46 - error TS1005: '?' expected.

1041         : K extends `${infer N extends number}`
                                                  ~



##[error]Bash exited with code '1'.
Finishing: Build Application
