
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


  
