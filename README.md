2026-07-01T12:45:51.0390398Z ##[section]Starting: Build Application
2026-07-01T12:45:51.0393417Z ==============================================================================
2026-07-01T12:45:51.0393507Z Task         : Bash
2026-07-01T12:45:51.0393553Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-01T12:45:51.0393617Z Version      : 3.227.0
2026-07-01T12:45:51.0393668Z Author       : Microsoft Corporation
2026-07-01T12:45:51.0393720Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-01T12:45:51.0393798Z ==============================================================================
2026-07-01T12:45:51.1639243Z Generating script.
2026-07-01T12:45:51.1649029Z ========================== Starting Command Output ===========================
2026-07-01T12:45:51.1655667Z [command]/bin/bash /opt/ads-agent/_work/_temp/d0bef8a9-9b83-4737-8b7e-afb32aad4d42.sh
2026-07-01T12:45:51.1695834Z ng build --configuration production --aot && npm test
2026-07-01T12:45:51.1696017Z <----ANGULAR---->
2026-07-01T12:45:51.6073356Z 
2026-07-01T12:45:51.6073868Z      _                      _                 ____ _     ___
2026-07-01T12:45:51.6074012Z     / \   _ __   __ _ _   _| | __ _ _ __     / ___| |   |_ _|
2026-07-01T12:45:51.6075782Z    / △ \ | '_ \ / _` | | | | |/ _` | '__|   | |   | |    | |
2026-07-01T12:45:51.6076253Z   / ___ \| | | | (_| | |_| | | (_| | |      | |___| |___ | |
2026-07-01T12:45:51.6076584Z  /_/   \_\_| |_|\__, |\__,_|_|\__,_|_|       \____|_____|___|
2026-07-01T12:45:51.6076702Z                 |___/
2026-07-01T12:45:51.6076861Z     
2026-07-01T12:45:51.6917778Z 
2026-07-01T12:45:51.6918551Z Angular CLI: 19.0.7
2026-07-01T12:45:51.6919110Z Node: 22.13.1
2026-07-01T12:45:51.6919259Z Package Manager: npm 10.9.2
2026-07-01T12:45:51.6919369Z OS: linux x64
2026-07-01T12:45:51.6919417Z 
2026-07-01T12:45:51.6919514Z Angular: 19.2.17
2026-07-01T12:45:51.6919931Z ... animations, common, compiler, compiler-cli, core, forms
2026-07-01T12:45:51.6920138Z ... localize, platform-browser, platform-browser-dynamic, router
2026-07-01T12:45:51.6920225Z 
2026-07-01T12:45:51.6920327Z Package                              Version
2026-07-01T12:45:51.6920514Z --------------------------------------------------------------
2026-07-01T12:45:51.6920708Z @angular-devkit/architect            0.2003.13
2026-07-01T12:45:51.6920978Z @angular-devkit/core                 20.3.13
2026-07-01T12:45:51.6922130Z @angular-devkit/schematics           20.3.13
2026-07-01T12:45:51.6922365Z @angular/build                       19.2.19
2026-07-01T12:45:51.6922670Z @angular/cdk                         19.2.19
2026-07-01T12:45:51.6922900Z @angular/cli                         19.0.7
2026-07-01T12:45:51.6923019Z @angular/material                    19.2.19
2026-07-01T12:45:51.6923684Z @angular/material-date-fns-adapter   19.2.19
2026-07-01T12:45:51.6923814Z @schematics/angular                  19.0.7
2026-07-01T12:45:51.6923926Z rxjs                                 7.8.2
2026-07-01T12:45:51.6924032Z typescript                           5.8.3
2026-07-01T12:45:51.6924145Z zone.js                              0.15.1
2026-07-01T12:45:51.6924230Z     
2026-07-01T12:45:52.4397077Z ❯ Building...
2026-07-01T12:45:52.4432606Z Browserslist: browsers data (caniuse-lite) is 7 months old. Please run:
2026-07-01T12:45:52.4432879Z   npx update-browserslist-db@latest
2026-07-01T12:45:52.4433093Z   Why you should do it regularly: https://github.com/browserslist/update-db#readme
2026-07-01T12:46:03.0026344Z ✔ Building...
2026-07-01T12:46:03.0034921Z Initial chunk files   | Names         |  Raw size | Estimated transfer size
2026-07-01T12:46:03.0035348Z main-YULICW3E.js      | main          |   2.01 MB |               361.34 kB
2026-07-01T12:46:03.0035580Z styles-KL3XFG2A.css   | styles        | 355.25 kB |                30.64 kB
2026-07-01T12:46:03.0035781Z polyfills-EO764MBO.js | polyfills     |  34.76 kB |                11.41 kB
2026-07-01T12:46:03.0035839Z 
2026-07-01T12:46:03.0035948Z                       | Initial total |   2.40 MB |               403.39 kB
2026-07-01T12:46:03.0036675Z 
2026-07-01T12:46:03.0036798Z Application bundle generation complete. [10.562 seconds]
2026-07-01T12:46:03.0036858Z 
2026-07-01T12:46:03.0083485Z ▲ [WARNING] bundle initial exceeded maximum budget. Budget 2.00 MB was not met by 399.15 kB with a total of 2.40 MB.
2026-07-01T12:46:03.0083643Z 
2026-07-01T12:46:03.0083717Z 
2026-07-01T12:46:03.0095732Z Output location: /opt/ads-agent/_work/256/s/dist
2026-07-01T12:46:03.0095831Z 
2026-07-01T12:46:03.1460587Z 
2026-07-01T12:46:03.1461353Z > quickstart-angular-dsc@1.0.0-snapshot test
2026-07-01T12:46:03.1461519Z > jest --coverage
2026-07-01T12:46:03.1462037Z 
2026-07-01T12:46:08.4087236Z (node:2687654) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
2026-07-01T12:46:08.4088165Z (Use `node --trace-deprecation ...` to show where the warning was created)
2026-07-01T12:46:08.4111328Z PASS src/app/services/loading.service.spec.ts
2026-07-01T12:46:09.4320727Z PASS src/app/shared/components/loading-caixa/loading-caixa.component.spec.ts
2026-07-01T12:46:09.4884149Z (node:2687660) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
2026-07-01T12:46:09.4884720Z (Use `node --trace-deprecation ...` to show where the warning was created)
2026-07-01T12:46:09.4904510Z PASS src/app/shared/components/btn-reset-select/btn-reset-select.component.spec.ts
2026-07-01T12:46:09.8990343Z FAIL src/app/services/message.service.spec.ts
2026-07-01T12:46:09.8990820Z   ● Test suite failed to run
2026-07-01T12:46:09.8990876Z 
2026-07-01T12:46:09.8991015Z     [ENV] Nenhuma variavel obrigatoria foi definida: _ENV.API_BASE_PATH ou _ENV.HTTP_SERVICE_API
2026-07-01T12:46:09.8991120Z 
2026-07-01T12:46:09.8991222Z       55 |   }
2026-07-01T12:46:09.8992106Z       56 |
2026-07-01T12:46:09.8992349Z     > 57 |   throw new Error(
2026-07-01T12:46:09.8992586Z          |         ^
2026-07-01T12:46:09.8992894Z       58 |     `[ENV] Nenhuma variavel obrigatoria foi definida: ${keys
2026-07-01T12:46:09.8993093Z       59 |       .map((key) => `_ENV.${key}`)
2026-07-01T12:46:09.8993274Z       60 |       .join(' ou ')}`
2026-07-01T12:46:09.8993321Z 
2026-07-01T12:46:09.8993472Z       at getRequiredRuntimeEnvStringFrom (src/environments/environment.model.ts:57:9)
2026-07-01T12:46:09.8993642Z       at Object.<anonymous> (src/environments/environment.ts:14:34)
2026-07-01T12:46:09.8994946Z       at Object.require (src/app/utils/utils.ts:1:1)
2026-07-01T12:46:09.8995160Z       at Object.require (src/app/services/message.service.ts:12:1)
2026-07-01T12:46:09.8995532Z       at Object.<anonymous> (src/app/services/message.service.spec.ts:2:1)
2026-07-01T12:46:09.8996969Z 
2026-07-01T12:46:09.8997403Z (node:2687648) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
2026-07-01T12:46:09.8997925Z (Use `node --trace-deprecation ...` to show where the warning was created)
2026-07-01T12:46:09.9553789Z FAIL src/app/pages/form-etapas/form-etapas.component.spec.ts
2026-07-01T12:46:09.9554775Z   ● Test suite failed to run
2026-07-01T12:46:09.9555004Z 
2026-07-01T12:46:09.9555375Z     [ENV] Nenhuma variavel obrigatoria foi definida: _ENV.API_BASE_PATH ou _ENV.HTTP_SERVICE_API
2026-07-01T12:46:09.9555843Z 
2026-07-01T12:46:09.9556179Z       55 |   }
2026-07-01T12:46:09.9556279Z       56 |
2026-07-01T12:46:09.9556371Z     > 57 |   throw new Error(
2026-07-01T12:46:09.9556562Z          |         ^
2026-07-01T12:46:09.9556688Z       58 |     `[ENV] Nenhuma variavel obrigatoria foi definida: ${keys
2026-07-01T12:46:09.9556833Z       59 |       .map((key) => `_ENV.${key}`)
2026-07-01T12:46:09.9557348Z       60 |       .join(' ou ')}`
2026-07-01T12:46:09.9557396Z 
2026-07-01T12:46:09.9557545Z       at getRequiredRuntimeEnvStringFrom (src/environments/environment.model.ts:57:9)
2026-07-01T12:46:09.9557715Z       at Object.<anonymous> (src/environments/environment.ts:14:34)
2026-07-01T12:46:09.9557862Z       at Object.require (src/app/utils/utils.ts:1:1)
2026-07-01T12:46:09.9558419Z       at Object.require (src/app/services/message.service.ts:12:1)
2026-07-01T12:46:09.9558673Z       at Object.require (src/app/pages/form-etapas/form-etapas.component.ts:19:1)
2026-07-01T12:46:09.9558922Z       at Object.<anonymous> (src/app/pages/form-etapas/form-etapas.component.spec.ts:3:1)
2026-07-01T12:46:09.9559008Z 
2026-07-01T12:46:09.9559148Z (node:2687641) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
2026-07-01T12:46:09.9559395Z (Use `node --trace-deprecation ...` to show where the warning was created)
2026-07-01T12:46:10.2600571Z FAIL src/app/pages/home/home.component.spec.ts
2026-07-01T12:46:10.2601075Z   ● Test suite failed to run
2026-07-01T12:46:10.2601129Z 
2026-07-01T12:46:10.2601271Z     [ENV] Nenhuma variavel obrigatoria foi definida: _ENV.API_BASE_PATH ou _ENV.HTTP_SERVICE_API
2026-07-01T12:46:10.2601352Z 
2026-07-01T12:46:10.2601443Z       55 |   }
2026-07-01T12:46:10.2603005Z       56 |
2026-07-01T12:46:10.2603311Z     > 57 |   throw new Error(
2026-07-01T12:46:10.2603549Z          |         ^
2026-07-01T12:46:10.2603777Z       58 |     `[ENV] Nenhuma variavel obrigatoria foi definida: ${keys
2026-07-01T12:46:10.2604037Z       59 |       .map((key) => `_ENV.${key}`)
2026-07-01T12:46:10.2604442Z       60 |       .join(' ou ')}`
2026-07-01T12:46:10.2604621Z 
2026-07-01T12:46:10.2604896Z       at getRequiredRuntimeEnvStringFrom (src/environments/environment.model.ts:57:9)
2026-07-01T12:46:10.2605071Z       at Object.<anonymous> (src/environments/environment.ts:14:34)
2026-07-01T12:46:10.2605220Z       at Object.require (src/app/utils/utils.ts:1:1)
2026-07-01T12:46:10.2605388Z       at Object.require (src/app/services/message.service.ts:12:1)
2026-07-01T12:46:10.2605634Z       at Object.require (src/app/pages/form-etapas/form-etapas.component.ts:19:1)
2026-07-01T12:46:10.2605788Z       at Object.require (src/app/app.routes.ts:3:1)
2026-07-01T12:46:10.2605935Z       at Object.require (src/app/pages/home/home.component.ts:4:1)
2026-07-01T12:46:10.2606095Z       at Object.<anonymous> (src/app/pages/home/home.component.spec.ts:3:1)
2026-07-01T12:46:10.2606165Z 
2026-07-01T12:46:10.2606312Z (node:2687666) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
2026-07-01T12:46:10.2606647Z (Use `node --trace-deprecation ...` to show where the warning was created)
2026-07-01T12:46:10.3628240Z FAIL src/app/pages/tabela-crud/tabela-crud.component.spec.ts
2026-07-01T12:46:10.3628882Z   ● Test suite failed to run
2026-07-01T12:46:10.3629204Z 
2026-07-01T12:46:10.3629609Z     [ENV] Nenhuma variavel obrigatoria foi definida: _ENV.API_BASE_PATH ou _ENV.HTTP_SERVICE_API
2026-07-01T12:46:10.3629702Z 
2026-07-01T12:46:10.3629789Z       55 |   }
2026-07-01T12:46:10.3629893Z       56 |
2026-07-01T12:46:10.3629996Z     > 57 |   throw new Error(
2026-07-01T12:46:10.3630103Z          |         ^
2026-07-01T12:46:10.3630226Z       58 |     `[ENV] Nenhuma variavel obrigatoria foi definida: ${keys
2026-07-01T12:46:10.3630369Z       59 |       .map((key) => `_ENV.${key}`)
2026-07-01T12:46:10.3630654Z       60 |       .join(' ou ')}`
2026-07-01T12:46:10.3630724Z 
2026-07-01T12:46:10.3630878Z       at getRequiredRuntimeEnvStringFrom (src/environments/environment.model.ts:57:9)
2026-07-01T12:46:10.3631037Z       at Object.<anonymous> (src/environments/environment.ts:14:34)
2026-07-01T12:46:10.3631182Z       at Object.require (src/app/utils/utils.ts:1:1)
2026-07-01T12:46:10.3631330Z       at Object.require (src/app/services/message.service.ts:12:1)
2026-07-01T12:46:10.3631564Z       at Object.require (src/app/pages/tabela-crud/tabela-crud.component.ts:19:1)
2026-07-01T12:46:10.3631817Z       at Object.<anonymous> (src/app/pages/tabela-crud/tabela-crud.component.spec.ts:2:1)
2026-07-01T12:46:10.3631891Z 
2026-07-01T12:46:10.3632038Z (node:2687640) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
2026-07-01T12:46:10.3632644Z (Use `node --trace-deprecation ...` to show where the warning was created)
2026-07-01T12:46:10.8075664Z FAIL src/app/pages/tabela-crud/form-photo/form-photo.component.spec.ts
2026-07-01T12:46:10.8107657Z   ● Test suite failed to run
2026-07-01T12:46:10.8107780Z 
2026-07-01T12:46:10.8107926Z     [ENV] Nenhuma variavel obrigatoria foi definida: _ENV.API_BASE_PATH ou _ENV.HTTP_SERVICE_API
2026-07-01T12:46:10.8108007Z 
2026-07-01T12:46:10.8108097Z       55 |   }
2026-07-01T12:46:10.8108190Z       56 |
2026-07-01T12:46:10.8108286Z     > 57 |   throw new Error(
2026-07-01T12:46:10.8108385Z          |         ^
2026-07-01T12:46:10.8109216Z       58 |     `[ENV] Nenhuma variavel obrigatoria foi definida: ${keys
2026-07-01T12:46:10.8109350Z       59 |       .map((key) => `_ENV.${key}`)
2026-07-01T12:46:10.8109529Z       60 |       .join(' ou ')}`
2026-07-01T12:46:10.8109573Z 
2026-07-01T12:46:10.8109758Z       at getRequiredRuntimeEnvStringFrom (src/environments/environment.model.ts:57:9)
2026-07-01T12:46:10.8110023Z       at Object.<anonymous> (src/environments/environment.ts:14:34)
2026-07-01T12:46:10.8110226Z       at Object.require (src/app/utils/utils.ts:1:1)
2026-07-01T12:46:10.8110533Z       at Object.require (src/app/pages/tabela-crud/form-photo/form-photo.component.ts:14:1)
2026-07-01T12:46:10.8110795Z       at Object.<anonymous> (src/app/pages/tabela-crud/form-photo/form-photo.component.spec.ts:1:1)
2026-07-01T12:46:10.8110878Z 
2026-07-01T12:46:10.8111025Z (node:2687642) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
2026-07-01T12:46:10.8111263Z (Use `node --trace-deprecation ...` to show where the warning was created)
2026-07-01T12:46:10.8827814Z ------------------------------------|---------|----------|---------|---------|-------------------
2026-07-01T12:46:10.8828072Z File                                | % Stmts | % Branch | % Funcs | % Lines | Uncovered Line #s 
2026-07-01T12:46:10.8828534Z ------------------------------------|---------|----------|---------|---------|-------------------
2026-07-01T12:46:10.8828735Z All files                           |   97.82 |     87.5 |     100 |     100 |                   
2026-07-01T12:46:10.8828970Z  services                           |     100 |      100 |     100 |     100 |                   
2026-07-01T12:46:10.8831024Z   loading.service.ts                |     100 |      100 |     100 |     100 |                   
2026-07-01T12:46:10.8831276Z  shared/components/btn-reset-select |    90.9 |    66.66 |     100 |     100 |                   
2026-07-01T12:46:10.8831593Z   btn-reset-select.component.ts     |    90.9 |    66.66 |     100 |     100 | 32                
2026-07-01T12:46:10.8831818Z  shared/components/loading-caixa    |     100 |      100 |     100 |     100 |                   
2026-07-01T12:46:10.8832035Z   loading-caixa.component.html      |     100 |      100 |     100 |     100 |                   
2026-07-01T12:46:10.8832584Z   loading-caixa.component.ts        |     100 |      100 |     100 |     100 |                   
2026-07-01T12:46:10.8832812Z ------------------------------------|---------|----------|---------|---------|-------------------
2026-07-01T12:46:10.8836247Z 
2026-07-01T12:46:10.8836800Z =============================== Coverage summary ===============================
2026-07-01T12:46:10.8837390Z Statements   : 97.82% ( 45/46 )
2026-07-01T12:46:10.8837580Z Branches     : 87.5% ( 7/8 )
2026-07-01T12:46:10.8837727Z Functions    : 100% ( 9/9 )
2026-07-01T12:46:10.8837832Z Lines        : 100% ( 41/41 )
2026-07-01T12:46:10.8837969Z ================================================================================
2026-07-01T12:46:10.8842372Z Test Suites: 5 failed, 3 passed, 8 total
2026-07-01T12:46:10.8842497Z Tests:       12 passed, 12 total
2026-07-01T12:46:10.8842612Z Snapshots:   0 total
2026-07-01T12:46:10.8842714Z Time:        7.07 s
2026-07-01T12:46:10.8842805Z Ran all test suites.
2026-07-01T12:46:10.9286982Z ##[error]Bash exited with code '1'.
2026-07-01T12:46:10.9294564Z ##[section]Finishing: Build Application
