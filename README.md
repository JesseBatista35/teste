
/usr/bin/bash /opt/ads-agent/_work/_temp/0fd46007-9198-4ffe-8336-cd794662859b.sh
ng build --configuration production --aot && npm test
<----ANGULAR---->

     _                      _                 ____ _     ___
    / \   _ __   __ _ _   _| | __ _ _ __     / ___| |   |_ _|
   / △ \ | '_ \ / _` | | | | |/ _` | '__|   | |   | |    | |
  / ___ \| | | | (_| | |_| | | (_| | |      | |___| |___ | |
 /_/   \_\_| |_|\__, |\__,_|_|\__,_|_|       \____|_____|___|
                |___/
    

Angular CLI: 19.0.7
Node: 20.18.2
Package Manager: npm 10.8.2
OS: linux x64

Angular: 19.2.17
... animations, common, compiler, compiler-cli, core, forms
... localize, platform-browser, platform-browser-dynamic, router

Package                              Version
--------------------------------------------------------------
@angular-devkit/architect            0.2003.13
@angular-devkit/core                 20.3.13
@angular-devkit/schematics           20.3.13
@angular/build                       19.2.19
@angular/cdk                         19.2.19
@angular/cli                         19.0.7
@angular/material                    19.2.19
@angular/material-date-fns-adapter   19.2.19
@schematics/angular                  19.0.7
rxjs                                 7.8.2
typescript                           5.8.3
zone.js                              0.15.1


> quickstart-angular-dsc@1.0.0-snapshot test
> jest --coverage

PASS src/app/services/loading.service.spec.ts (6.314 s)
PASS src/app/shared/components/loading-caixa/loading-caixa.component.spec.ts (6.771 s)
PASS src/app/shared/components/btn-reset-select/btn-reset-select.component.spec.ts (6.977 s)
FAIL src/app/services/message.service.spec.ts
  ● Test suite failed to run

    [ENV] Variavel obrigatoria nao definida: _ENV.REALM

      42 |   const value = getRuntimeEnvString(key);
      43 |   if (!value) {
    > 44 |     throw new Error(
         |           ^
      45 |       `[ENV] Variavel obrigatoria nao definida: _ENV.${key}`
      46 |     );
      47 |   }

      at getRequiredRuntimeEnvString (src/environments/environment.model.ts:44:11)
      at Object.<anonymous> (src/environments/environment.ts:17:42)
      at Object.require (src/app/utils/utils.ts:1:1)
      at Object.require (src/app/services/message.service.ts:12:1)
      at Object.<anonymous> (src/app/services/message.service.spec.ts:2:1)

FAIL src/app/pages/form-etapas/form-etapas.component.spec.ts
  ● Test suite failed to run

    [ENV] Variavel obrigatoria nao definida: _ENV.REALM

      42 |   const value = getRuntimeEnvString(key);
      43 |   if (!value) {
    > 44 |     throw new Error(

         |           ^
      45 |       `[ENV] Variavel obrigatoria nao definida: _ENV.${key}`
      46 |     );
      47 |   }

      at getRequiredRuntimeEnvString (src/environments/environment.model.ts:44:11)
      at Object.<anonymous> (src/environments/environment.ts:17:42)
      at Object.require (src/app/utils/utils.ts:1:1)
      at Object.require (src/app/pages/tabela-crud/form-photo/form-photo.component.ts:14:1)
      at Object.<anonymous> (src/app/pages/tabela-crud/form-photo/form-photo.component.spec.ts:1:1)

------------------------------------|---------|----------|---------|---------|-------------------
File                                | % Stmts | % Branch | % Funcs | % Lines | Uncovered Line #s 
------------------------------------|---------|----------|---------|---------|-------------------
All files                           |   97.82 |     87.5 |     100 |     100 |                   
 services                           |     100 |      100 |     100 |     100 |                   
  loading.service.ts                |     100 |      100 |     100 |     100 |                   
 shared/components/btn-reset-select |    90.9 |    66.66 |     100 |     100 |                   
  btn-reset-select.component.ts     |    90.9 |    66.66 |     100 |     100 | 32                
 shared/components/loading-caixa    |     100 |      100 |     100 |     100 |                   
  loading-caixa.component.html      |     100 |      100 |     100 |     100 |                   
  loading-caixa.component.ts        |     100 |      100 |     100 |     100 |                   
------------------------------------|---------|----------|---------|---------|-------------------

=============================== Coverage summary ===============================
Statements   : 97.82% ( 45/46 )
Branches     : 87.5% ( 7/8 )
Functions    : 100% ( 9/9 )
Lines        : 100% ( 41/41 )
================================================================================
Test Suites: 5 failed, 3 passed, 8 total
Tests:       12 passed, 12 total
Snapshots:   0 total
Time:        10.327 s
Ran all test suites.
##[error]Bash exited with code '1'.
Finishing: Build Application
