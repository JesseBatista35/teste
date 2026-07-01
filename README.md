entao analisando a esteiras aqui a ultima build com sucesso foi ha mais de um ano nessa build usavam o angular 16 acredito que migrama para 19 sem utilizar o manual do angular fazens as coreeçoes necessarias para o codigo fuicniar com a bibliotecas atualizadas... veja se e isso mesmo se for, vamos motnar uma mensssegem par ao time de desenvolvimento realizar os ajuste... pois somos analistas de esteiras e nao podemos fica mechendo no codigo


<img width="1809" height="916" alt="image" src="https://github.com/user-attachments/assets/a202237d-01a4-4a34-8dad-c0f1182a47a8" />


/usr/bin/bash /opt/ads-agent/_work/_temp/4db2af62-fe73-42d6-94a3-f44e910ce697.sh
ng build --configuration production --build-optimizer --aot --output-path=dist && npm test
<----ANGULAR---->

     _                      _                 ____ _     ___
    / \   _ __   __ _ _   _| | __ _ _ __     / ___| |   |_ _|
   / △ \ | '_ \ / _` | | | | |/ _` | '__|   | |   | |    | |
  / ___ \| | | | (_| | |_| | | (_| | |      | |___| |___ | |
 /_/   \_\_| |_|\__, |\__,_|_|\__,_|_|       \____|_____|___|
                |___/
    

Angular CLI: 16.2.16
Node: 16.14.0
Package Manager: npm 8.3.1
OS: linux x64

Angular: 16.2.12
... animations, common, compiler, compiler-cli, core, forms
... platform-browser, platform-browser-dynamic, router

Package                              Version
--------------------------------------------------------------
@angular-devkit/architect            0.1602.16
@angular-devkit/build-angular        16.2.16
@angular-devkit/core                 16.2.16
@angular-devkit/schematics           16.2.16
@angular/cdk                         16.2.14
@angular/cli                         16.2.16
@angular/material                    16.2.14
@angular/material-date-fns-adapter   16.2.14
@schematics/angular                  16.2.16
rxjs                                 7.8.1
typescript                           5.1.6
zone.js                              0.13.3

✔ Copying assets complete.
- Generating index html...
- Generating index html...
1 rules skipped due to selector errors:
  .form-floating>~label -> Did not expect successive traversals.
✔ Index html generation complete.

Initial Chunk Files           | Names         |  Raw Size | Estimated Transfer Size
main.38ae6e1b03ac2afa.js      | main          |   1.68 MB |               320.97 kB
styles.974dbfd631310adf.css   | styles        | 466.52 kB |                60.61 kB
scripts.fd98897143fd8bdf.js   | scripts       | 144.98 kB |                42.20 kB
polyfills.89be8ff1d6b9c8cd.js | polyfills     |  33.03 kB |                10.63 kB
runtime.8814fb663d94bd53.js   | runtime       | 931 bytes |               530 bytes

| Initial Total |   2.31 MB |               434.93 kB

Build at: 2025-05-19T19:49:11.220Z - Hash: a68bfa5a18ca6e9d - Time: 36814ms

./src/styles.scss - Warning: Module Warning (from ./node_modules/sass-loader/dist/cjs.js):
Deprecation This operation is parsed as:

    ($header-altura - $userinfo-tamanho) * 0.5 + 10

but you may have intended it to mean:

    ($header-altura - $userinfo-tamanho) * 0.5 (+10)

Add a space after + to clarify that it's meant to be a binary operation, or wrap
it in parentheses to make it a unary operation. This will be an error in future
versions of Sass.

More info and automated migrator: https://sass-lang.com/d/strict-unary

null

-------------------------------------|---------|----------|---------|---------|-----------------------------------------------------
All files                            |   89.76 |       80 |   85.29 |   90.66 |                                                     
 app                                 |     100 |      100 |     100 |     100 |                                                     
  app.component.html                 |     100 |      100 |     100 |     100 |                                                     
  app.component.ts                   |     100 |      100 |     100 |     100 |                                                     
 app/core/auth                       |     100 |    77.77 |     100 |     100 |                                                     
  auth.service.ts                    |     100 |    77.77 |     100 |     100 | 28-31,70                                            
  user-profile.ts                    |     100 |      100 |     100 |     100 |                                                     
 app/core/components/acesso-negado   |     100 |      100 |     100 |     100 |                                                     
  acesso-negado.component.html       |     100 |      100 |     100 |     100 |                                                     
  acesso-negado.component.ts         |     100 |      100 |     100 |     100 |                                                     
 app/core/components/content-layout  |     100 |      100 |     100 |     100 |                                                     
  content-layout.component.html      |     100 |      100 |     100 |     100 |                                                     
  content-layout.component.ts        |     100 |      100 |     100 |     100 |                                                     
 app/core/components/header          |   83.33 |      100 |      50 |   83.33 |                                                     
  header.component.html              |     100 |      100 |     100 |     100 |                                                     
  header.component.ts                |   81.81 |      100 |      50 |   81.81 | 26-31                                               
 app/core/components/nav-menu        |      90 |      100 |   66.66 |      90 |                                                     
  nav-menu.component.html            |     100 |      100 |     100 |     100 |                                                     
  nav-menu.component.ts              |   88.88 |      100 |   66.66 |   88.88 | 25                                                  
 app/modules/cadastro-calendario     |   82.75 |    66.66 |    87.5 |   84.82 |                                                     
  cadastro-calendario.component.html |     100 |      100 |     100 |     100 |                                                     
  cadastro-calendario.component.ts   |    82.6 |    66.66 |    87.5 |   84.68 | 73-83,136-138,142-144,165-166,189-190,245-246       
 app/modules/consulta                |   86.66 |    80.48 |    77.5 |   87.31 |                                                     
  consulta.component.html            |     100 |      100 |     100 |     100 |                                                     
  consulta.component.ts              |   86.56 |    80.48 |    77.5 |   87.21 | 101,131,210-212,263-264,274-275,325,334-343,389-403 
 app/modules/home                    |     100 |      100 |     100 |     100 |                                                     
  home.component.html                |     100 |      100 |     100 |     100 |                                                     
  home.component.ts                  |     100 |      100 |     100 |     100 |                                                     
 app/shared/service                  |     100 |      100 |     100 |     100 |                                                     
  abstract.service.ts                |     100 |      100 |     100 |     100 |                                                     
  calendario.service.ts              |     100 |      100 |     100 |     100 |                                                     
  tipo-funcionalidade.service.ts     |     100 |      100 |     100 |     100 |        
 app/shared/util                     |   95.52 |    90.47 |     100 |   96.82 |                                                     
  dataUtil.ts                        |   94.82 |    89.47 |     100 |   96.29 | 39-40                                               
  errorUtil.ts                       |     100 |      100 |     100 |     100 |                                                     
 environments                        |     100 |      100 |     100 |     100 |                                                     
  environment.ts                     |     100 |      100 |     100 |     100 |                                                     
-------------------------------------|---------|----------|---------|---------|-----------------------------------------------------

=============================== Coverage summary ===============================
Statements   : 89.76% ( 386/430 )
Branches     : 80% ( 84/105 )
Functions    : 85.29% ( 87/102 )
Lines        : 90.66% ( 379/418 )
================================================================================

Test Suites: 13 passed, 13 total
Tests:       87 passed, 87 total
Snapshots:   0 total
Time:        29.332 s
Ran all test suites.
Finishing: Build Application


erro que levou abertura da demanda


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
/usr/bin/bash /opt/ads-agent/_work/_temp/a93674c7-7792-491a-b758-cccdd6b0b476.sh
ng build --configuration production --build-optimizer --aot --output-path=dist && npm test
<----ANGULAR---->

     _                      _                 ____ _     ___
    / \   _ __   __ _ _   _| | __ _ _ __     / ___| |   |_ _|
   / △ \ | '_ \ / _` | | | | |/ _` | '__|   | |   | |    | |
  / ___ \| | | | (_| | |_| | | (_| | |      | |___| |___ | |
 /_/   \_\_| |_|\__, |\__,_|_|\__,_|_|       \____|_____|___|
                |___/
    

Angular CLI: 19.0.7
Node: 22.13.1
Package Manager: npm 10.9.2
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
    
Error: Unknown argument: build-optimizer
##[error]Bash exited with code '1'.
Finishing: Build Application


erro atualizado apos nosssa analise e mudanças nas configuraçoes e no repo



@angular/material-date-fns-adapter   19.2.19
@schematics/angular                  19.0.7
rxjs                                 7.8.2
typescript                           5.8.3
zone.js                              0.15.1
    
❯ Building...
Browserslist: browsers data (caniuse-lite) is 7 months old. Please run:
  npx update-browserslist-db@latest
  Why you should do it regularly: https://github.com/browserslist/update-db#readme
✔ Building...
Initial chunk files   | Names         |  Raw size | Estimated transfer size
main-YULICW3E.js      | main          |   2.01 MB |               361.34 kB
styles-KL3XFG2A.css   | styles        | 355.25 kB |                30.64 kB
polyfills-EO764MBO.js | polyfills     |  34.76 kB |                11.41 kB

                      | Initial total |   2.40 MB |               403.39 kB

Application bundle generation complete. [9.539 seconds]

▲ [WARNING] bundle initial exceeded maximum budget. Budget 2.00 MB was not met by 399.15 kB with a total of 2.40 MB.


Output location: /opt/ads-agent/_work/73/s/dist

> quickstart-angular-dsc@1.0.0-snapshot test
> jest --coverage

PASS src/app/services/loading.service.spec.ts (6.186 s)
PASS src/app/shared/components/loading-caixa/loading-caixa.component.spec.ts (6.679 s)
PASS src/app/shared/components/btn-reset-select/btn-reset-select.component.spec.ts (7.185 s)
PASS src/app/services/message.service.spec.ts (8.1 s)
  ● Console

    console.log
      #[INFO]: 10:17:37
      Success Message [ [ { data: 'response' } ] ]

      at Function.log (src/app/utils/logger.ts:14:13)

    console.log
      #[ERRO]: 10:17:37
      Error Message [ [ { error: 'error' } ] ]

      at Function.log (src/app/utils/logger.ts:14:13)

PASS src/app/pages/tabela-crud/form-photo/form-photo.component.spec.ts (9.605 s)
PASS src/app/pages/home/home.component.spec.ts (11.138 s)
FAIL src/app/pages/tabela-crud/tabela-crud.component.spec.ts (11.856 s)
  ● TabelaCrudComponent › CRUD Operations › Create › should open create dialog

    TypeError: this.messageService.showDialogTemplate is not a function

      140 |     this.resetForm();
      141 |
    > 142 |     this.messageService.showDialogTemplate(

      at _ZoneDelegate.invoke (node_modules/zone.js/bundles/zone.umd.js:410:32)
      at ProxyZoneSpec.Object.<anonymous>.ProxyZoneSpec.onInvoke (node_modules/zone.js/bundles/zone-testing.umd.js:2219:43)
      at _ZoneDelegate.invoke (node_modules/zone.js/bundles/zone.umd.js:409:38)
      at ZoneImpl.run (node_modules/zone.js/bundles/zone.umd.js:145:47)
      at Object.wrappedFunc (node_modules/zone.js/bundles/zone-testing.umd.js:449:38)

  ● TabelaCrudComponent › CRUD Operations › Create › should save new photo successfully

    expect(jest.fn()).toHaveBeenCalled()

    Expected number of calls: >= 1
    Received number of calls:    0

      159 |           newPhoto
      160 |         );
    > 161 |         expect(messageService.closeAllDialogs).toHaveBeenCalled();
          |                                                ^
      162 |         expect(component.itemSelecionado).toBeUndefined();
      163 |         expect(atualizaSpy).toHaveBeenCalled();
      164 |       });

      at src/app/pages/tabela-crud/tabela-crud.component.spec.ts:161:48
      at _ZoneDelegate.invoke (node_modules/zone.js/bundles/zone.umd.js:410:32)
      at ProxyZoneSpec.Object.<anonymous>.ProxyZoneSpec.onInvoke (node_modules/zone.js/bundles/zone-testing.umd.js:2219:43)
      at _ZoneDelegate.invoke (node_modules/zone.js/bundles/zone.umd.js:409:38)
      at ZoneImpl.run (node_modules/zone.js/bundles/zone.umd.js:145:47)
      at Object.wrappedFunc (node_modules/zone.js/bundles/zone-testing.umd.js:449:38)

  ● TabelaCrudComponent › CRUD Operations › Create › should handle error when creating photo

  
      181 |     });
      182 |

      at src/app/pages/tabela-crud/tabela-crud.component.spec.ts:179:29
      at _ZoneDelegate.invoke (node_modules/zone.js/bundles/zone.umd.js:410:32)
      at ProxyZoneSpec.Object.<anonymous>.ProxyZoneSpec.onInvoke (node_modules/zone.js/bundles/zone-testing.umd.js:2219:43)
      at _ZoneDelegate.invoke (node_modules/zone.js/bundles/zone.umd.js:409:38)
      at ZoneImpl.run (node_modules/zone.js/bundles/zone.umd.js:145:47)
      at Object.wrappedFunc (node_modules/zone.js/bundles/zone-testing.umd.js:449:38)

  ● TabelaCrudComponent › CRUD Operations › Edit › should open edit dialog with selected item

    TypeError: this.messageService.showDialogTemplate is not a function

      152 |     this.itemSelecionado = item;
      153 |
    > 154 |     this.messageService.showDialogTemplate(
          |                         ^
      155 |       this.mensagens.BTN_EDITAR_REGISTRO_TEXT,
      156 |       this.mensagens.BTN_EDITAR_REGISTRO_TEXT,
      157 |       this.templateForm,

      at TabelaCrudComponent.showDialogTemplate [as editar] (src/app/pages/tabela-crud/tabela-crud.component.ts:154:25)
      at src/app/pages/tabela-crud/tabela-crud.component.spec.ts:185:19
      at _ZoneDelegate.invoke (node_modules/zone.js/bundles/zone.umd.js:410:32)
      at ProxyZoneSpec.Object.<anonymous>.ProxyZoneSpec.onInvoke (node_modules/zone.js/bundles/zone-testing.umd.js:2219:43)
      at _ZoneDelegate.invoke (node_modules/zone.js/bundles/zone.umd.js:409:38)
      at ZoneImpl.run (node_modules/zone.js/bundles/zone.umd.js:145:47)
      at Object.wrappedFunc (node_modules/zone.js/bundles/zone-testing.umd.js:449:38)

PASS src/app/pages/form-etapas/form-etapas.component.spec.ts (12.836 s)



 app/shared/components/btn-reset-select    |    90.9 |    66.66 |     100 |     100 |                            
  btn-reset-select.component.ts            |    90.9 |    66.66 |     100 |     100 | 32                         
 app/shared/components/loading-caixa       |     100 |      100 |     100 |     100 |                            
  loading-caixa.component.html             |     100 |      100 |     100 |     100 |                            
  loading-caixa.component.ts               |     100 |      100 |     100 |     100 |                            
 app/shared/components/page-header         |   53.84 |        0 |      50 |      50 |                            
  page-header.component.ts                 |   53.84 |        0 |      50 |      50 | 25-30                      
 app/shared/components/stepper-nav-buttons |   30.55 |        0 |   14.28 |   34.48 |                            
  stepper-nav-buttons.component.html       |     100 |      100 |     100 |     100 |                            
  stepper-nav-buttons.component.ts         |   28.57 |        0 |   14.28 |   32.14 | 37-74                      
 app/shared/components/table-filters       |     5.3 |        0 |       0 |    5.11 |                            
  table-filters.component.html             |     100 |      100 |     100 |     100 |                            
  table-filters.component.ts               |    4.88 |        0 |       0 |    4.67 | 100-660                    
 app/shared/modules                        |     100 |      100 |     100 |     100 |                            
  dsc-crud.module.ts                       |     100 |      100 |     100 |     100 |                            
  dsc.module.ts                            |     100 |      100 |     100 |     100 |                            
 app/utils                                 |   12.82 |        0 |   10.71 |   13.39 |                            
  logger.ts                                |     100 |      100 |     100 |     100 |                            
  utils.ts                                 |    5.55 |        0 |    3.84 |    5.82 | 11-309,320                 
 environments                              |    74.6 |    52.94 |   71.42 |   80.35 |                            
  environment.model.ts                     |    70.9 |    52.94 |   71.42 |   77.08 | 13,18,44,57-59,68-71,81-84 
  environment.ts                           |     100 |      100 |     100 |     100 |                            
-------------------------------------------|---------|----------|---------|---------|----------------------------

=============================== Coverage summary ===============================
Statements   : 52.06% ( 453/870 )
Branches     : 25.32% ( 58/229 )
Functions    : 39.03% ( 89/228 )
Lines        : 52.21% ( 425/814 )
================================================================================

Test Suites: 1 failed, 7 passed, 8 total
Tests:       4 failed, 75 passed, 79 total
Snapshots:   0 total
Time:        14.963 s
Ran all test suites.
##[error]Bash exited with code '1'.
Finishing: Build Application



  
