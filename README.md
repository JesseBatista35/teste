2026-08-06T18:24:15.7988057Z ##[section]Starting: Build Application
2026-08-06T18:24:15.7991609Z ==============================================================================
2026-08-06T18:24:15.7991702Z Task         : Bash
2026-08-06T18:24:15.7991748Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-06T18:24:15.7991821Z Version      : 3.227.0
2026-08-06T18:24:15.7991873Z Author       : Microsoft Corporation
2026-08-06T18:24:15.7991929Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-06T18:24:15.7992011Z ==============================================================================
2026-08-06T18:24:15.9335314Z Generating script.
2026-08-06T18:24:15.9346472Z ========================== Starting Command Output ===========================
2026-08-06T18:24:15.9353260Z [command]/bin/bash /opt/ads-agent/_work/_temp/0afeca2f-c539-43ea-b1f4-6d14dce84d7c.sh
2026-08-06T18:24:15.9399968Z ng build --configuration production --build-optimizer --aot --output-path=dist && npm test
2026-08-06T18:24:15.9400238Z <----ANGULAR---->
2026-08-06T18:24:16.4049001Z 
2026-08-06T18:24:16.4049570Z      _                      _                 ____ _     ___
2026-08-06T18:24:16.4049801Z     / \   _ __   __ _ _   _| | __ _ _ __     / ___| |   |_ _|
2026-08-06T18:24:16.4050341Z    / △ \ | '_ \ / _` | | | | |/ _` | '__|   | |   | |    | |
2026-08-06T18:24:16.4050698Z   / ___ \| | | | (_| | |_| | | (_| | |      | |___| |___ | |
2026-08-06T18:24:16.4050912Z  /_/   \_\_| |_|\__, |\__,_|_|\__,_|_|       \____|_____|___|
2026-08-06T18:24:16.4051096Z                 |___/
2026-08-06T18:24:16.4051246Z     
2026-08-06T18:24:16.5116985Z 
2026-08-06T18:24:16.5117421Z Angular CLI: 19.2.27
2026-08-06T18:24:16.5117539Z Node: 20.18.2
2026-08-06T18:24:16.5117674Z Package Manager: npm 10.8.2
2026-08-06T18:24:16.5117782Z OS: linux x64
2026-08-06T18:24:16.5117821Z 
2026-08-06T18:24:16.5117915Z Angular: 19.2.25
2026-08-06T18:24:16.5118739Z ... animations, common, compiler, compiler-cli, core, forms
2026-08-06T18:24:16.5118969Z ... platform-browser, platform-browser-dynamic, platform-server
2026-08-06T18:24:16.5119585Z ... router
2026-08-06T18:24:16.5119630Z 
2026-08-06T18:24:16.5119965Z Package                              Version
2026-08-06T18:24:16.5120179Z --------------------------------------------------------------
2026-08-06T18:24:16.5120382Z @angular-devkit/architect            0.1902.27
2026-08-06T18:24:16.5120637Z @angular-devkit/build-angular        19.2.27
2026-08-06T18:24:16.5120808Z @angular-devkit/core                 19.2.27
2026-08-06T18:24:16.5120996Z @angular-devkit/schematics           19.2.27
2026-08-06T18:24:16.5121114Z @angular/cdk                         19.2.19
2026-08-06T18:24:16.5121220Z @angular/cli                         19.2.27
2026-08-06T18:24:16.5121329Z @angular/material                    19.2.19
2026-08-06T18:24:16.5121715Z @angular/material-date-fns-adapter   19.2.19
2026-08-06T18:24:16.5121845Z @angular/ssr                         19.2.27
2026-08-06T18:24:16.5121953Z @schematics/angular                  19.2.27
2026-08-06T18:24:16.5122065Z rxjs                                 7.8.2
2026-08-06T18:24:16.5122165Z typescript                           5.7.3
2026-08-06T18:24:16.5122273Z zone.js                              0.15.1
2026-08-06T18:24:16.5122369Z     
2026-08-06T18:24:17.8832710Z - Generating browser application bundles (phase: setup)...
2026-08-06T18:24:34.0921998Z ✔ Browser application bundle generation complete.
2026-08-06T18:24:34.4497493Z ✔ Browser application bundle generation complete.
2026-08-06T18:24:34.4539279Z 
2026-08-06T18:24:34.4540016Z ./src/styles.scss - Warning: Module Warning (from ./node_modules/sass-loader/dist/cjs.js):
2026-08-06T18:24:34.4540502Z Deprecation Warning on line 1, column 8 of file:///opt/ads-agent/_work/222/s/src/styles.scss:1:8:
2026-08-06T18:24:34.4540694Z Sass @import rules are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-06T18:24:34.4540765Z 
2026-08-06T18:24:34.4540951Z More info and automated migrator: https://sass-lang.com/d/import
2026-08-06T18:24:34.4541294Z 
2026-08-06T18:24:34.4541477Z 1 | @import '../node_modules/sidsc-components/styles/main.scss';
2026-08-06T18:24:34.4541542Z 
2026-08-06T18:24:34.4541588Z 
2026-08-06T18:24:34.4541697Z src/styles.scss 2:9  root stylesheet
2026-08-06T18:24:34.4541752Z 
2026-08-06T18:24:34.4541784Z 
2026-08-06T18:24:34.4541982Z ./src/styles.scss - Warning: Module Warning (from ./node_modules/sass-loader/dist/cjs.js):
2026-08-06T18:24:34.4542249Z Deprecation Warning on line 2, column 8 of file:///opt/ads-agent/_work/222/s/src/styles.scss:2:8:
2026-08-06T18:24:34.4542415Z Sass @import rules are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-06T18:24:34.4542480Z 
2026-08-06T18:24:34.4542657Z More info and automated migrator: https://sass-lang.com/d/import
2026-08-06T18:24:34.4542729Z 
2026-08-06T18:24:34.4542871Z 2 | @import './app/layout/page';
2026-08-06T18:24:34.4542917Z 
2026-08-06T18:24:34.4542950Z 
2026-08-06T18:24:34.4543056Z src/styles.scss 3:9  root stylesheet
2026-08-06T18:24:34.4543113Z 
2026-08-06T18:24:34.4543154Z 
2026-08-06T18:24:34.4543426Z Warning: /opt/ads-agent/_work/222/s/node_modules/keycloak-js/dist/keycloak.mjs depends on 'base64-js'. CommonJS or AMD dependencies can cause optimization bailouts.
2026-08-06T18:24:34.4543706Z For more info see: https://angular.dev/tools/cli/build#configuring-commonjs-dependencies
2026-08-06T18:24:34.4543784Z 
2026-08-06T18:24:34.4544051Z Warning: /opt/ads-agent/_work/222/s/node_modules/keycloak-js/dist/keycloak.mjs depends on 'js-sha256'. CommonJS or AMD dependencies can cause optimization bailouts.
2026-08-06T18:24:34.4544316Z For more info see: https://angular.dev/tools/cli/build#configuring-commonjs-dependencies
2026-08-06T18:24:34.4544392Z 
2026-08-06T18:24:34.4544665Z Warning: /opt/ads-agent/_work/222/s/src/app/layout/header/header.component.scss exceeded maximum budget. Budget 2.00 kB was not met by 1.60 kB with a total of 3.60 kB.
2026-08-06T18:24:34.4544778Z 
2026-08-06T18:24:34.4544811Z 
2026-08-06T18:24:34.4544841Z 
2026-08-06T18:24:34.4545252Z ./src/app/features/unidades/pages/importar-unidade/importar-unidade.component.ts:6:0-132 - Error: Module not found: Error: Can't resolve '../../components/dialogs/importar-unidade-dialog/importar-unidade-dialog.component' in '/opt/ads-agent/_work/222/s/src/app/features/unidades/pages/importar-unidade'
2026-08-06T18:24:34.4545455Z 
2026-08-06T18:24:34.4545834Z Error: src/app/auth/auth-init.ts:32:22 - error TS2339: Property 'authentication' does not exist on type '{ production: boolean; urlModeloBackend: string; SIAVL_GERENCIAL_BACKEND: string; emissaoSenhaBackend: string; urlSSO: string; realmSSO: string; clientIdSSO: string; }'.
2026-08-06T18:24:34.4545991Z 
2026-08-06T18:24:34.4546095Z 32     url: environment.authentication.url,
2026-08-06T18:24:34.4546214Z                         ~~~~~~~~~~~~~~
2026-08-06T18:24:34.4546258Z 
2026-08-06T18:24:34.4546297Z 
2026-08-06T18:24:34.4546658Z Error: src/app/auth/auth-init.ts:33:24 - error TS2339: Property 'authentication' does not exist on type '{ production: boolean; urlModeloBackend: string; SIAVL_GERENCIAL_BACKEND: string; emissaoSenhaBackend: string; urlSSO: string; realmSSO: string; clientIdSSO: string; }'.
2026-08-06T18:24:34.4546822Z 
2026-08-06T18:24:34.4546926Z 33     realm: environment.authentication.realm,
2026-08-06T18:24:34.4547043Z                           ~~~~~~~~~~~~~~
2026-08-06T18:24:34.4547161Z 
2026-08-06T18:24:34.4547191Z 
2026-08-06T18:24:34.4547559Z Error: src/app/auth/auth-init.ts:34:27 - error TS2339: Property 'authentication' does not exist on type '{ production: boolean; urlModeloBackend: string; SIAVL_GERENCIAL_BACKEND: string; emissaoSenhaBackend: string; urlSSO: string; realmSSO: string; clientIdSSO: string; }'.
2026-08-06T18:24:34.4547712Z 
2026-08-06T18:24:34.4547824Z 34     clientId: environment.authentication.clientId,
2026-08-06T18:24:34.4547947Z                              ~~~~~~~~~~~~~~
2026-08-06T18:24:34.4547992Z 
2026-08-06T18:24:34.4548022Z 
2026-08-06T18:24:34.4548456Z Error: src/app/auth/auth.interceptor.ts:44:17 - error TS2551: Property 'siavlGerencialBackend' does not exist on type '{ production: boolean; urlModeloBackend: string; SIAVL_GERENCIAL_BACKEND: string; emissaoSenhaBackend: string; urlSSO: string; realmSSO: string; clientIdSSO: string; }'. Did you mean 'SIAVL_GERENCIAL_BACKEND'?
2026-08-06T18:24:34.4548697Z 
2026-08-06T18:24:34.4548804Z 44     environment.siavlGerencialBackend;
2026-08-06T18:24:34.4548917Z                    ~~~~~~~~~~~~~~~~~~~~~
2026-08-06T18:24:34.4548971Z 
2026-08-06T18:24:34.4549081Z   src/environments/environment.prod.ts:7:3
2026-08-06T18:24:34.4549280Z     7   SIAVL_GERENCIAL_BACKEND: '__SIAVL_GERENCIAL_BACKEND__',
2026-08-06T18:24:34.4549418Z         ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
2026-08-06T18:24:34.4549601Z     'SIAVL_GERENCIAL_BACKEND' is declared here.
2026-08-06T18:24:34.4549664Z 
2026-08-06T18:24:34.4549696Z 
2026-08-06T18:24:34.4550133Z Error: src/app/core/health/siavl-health.service.ts:14:32 - error TS2551: Property 'siavlGerencialBackend' does not exist on type '{ production: boolean; urlModeloBackend: string; SIAVL_GERENCIAL_BACKEND: string; emissaoSenhaBackend: string; urlSSO: string; realmSSO: string; clientIdSSO: string; }'. Did you mean 'SIAVL_GERENCIAL_BACKEND'?
2026-08-06T18:24:34.4550323Z 
2026-08-06T18:24:34.4550561Z 14   apiUrl: string = environment.siavlGerencialBackend;
2026-08-06T18:24:34.4550711Z                                   ~~~~~~~~~~~~~~~~~~~~~
2026-08-06T18:24:34.4550768Z 
2026-08-06T18:24:34.4550880Z   src/environments/environment.prod.ts:7:3
2026-08-06T18:24:34.4551075Z     7   SIAVL_GERENCIAL_BACKEND: '__SIAVL_GERENCIAL_BACKEND__',
2026-08-06T18:24:34.4551225Z         ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
2026-08-06T18:24:34.4551407Z     'SIAVL_GERENCIAL_BACKEND' is declared here.
2026-08-06T18:24:34.4551471Z 
2026-08-06T18:24:34.4551502Z 
2026-08-06T18:24:34.4551898Z Error: src/app/core/health/siavl-health.service.ts:15:33 - error TS2339: Property 'baseUrl' does not exist on type '{ production: boolean; urlModeloBackend: string; SIAVL_GERENCIAL_BACKEND: string; emissaoSenhaBackend: string; urlSSO: string; realmSSO: string; clientIdSSO: string; }'.
2026-08-06T18:24:34.4552067Z 
2026-08-06T18:24:34.4552176Z 15   baseUrl: string = environment.baseUrl;
2026-08-06T18:24:34.4552293Z                                    ~~~~~~~
2026-08-06T18:24:34.4552335Z 
2026-08-06T18:24:34.4552377Z 
2026-08-06T18:24:34.4552668Z Error: src/app/domains/unidade/data-access/unidade-api.service.ts:16:30 - error TS2307: Cannot find module '../models/unidade-siico.model' or its corresponding type declarations.
2026-08-06T18:24:34.4552792Z 
2026-08-06T18:24:34.4552965Z 16 import { UnidadeSiico } from '../models/unidade-siico.model';
2026-08-06T18:24:34.4553104Z                                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
2026-08-06T18:24:34.4553156Z 
2026-08-06T18:24:34.4553197Z 
2026-08-06T18:24:34.4553642Z Error: src/app/domains/unidade/data-access/unidade-api.service.ts:30:34 - error TS2551: Property 'siavlGerencialBackend' does not exist on type '{ production: boolean; urlModeloBackend: string; SIAVL_GERENCIAL_BACKEND: string; emissaoSenhaBackend: string; urlSSO: string; realmSSO: string; clientIdSSO: string; }'. Did you mean 'SIAVL_GERENCIAL_BACKEND'?
2026-08-06T18:24:34.4553844Z 
2026-08-06T18:24:34.4553959Z 30     apiUrl: string = environment.siavlGerencialBackend;
2026-08-06T18:24:34.4554132Z                                     ~~~~~~~~~~~~~~~~~~~~~
2026-08-06T18:24:34.4554180Z 
2026-08-06T18:24:34.4554291Z   src/environments/environment.prod.ts:7:3
2026-08-06T18:24:34.4554490Z     7   SIAVL_GERENCIAL_BACKEND: '__SIAVL_GERENCIAL_BACKEND__',
2026-08-06T18:24:34.4554633Z         ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
2026-08-06T18:24:34.4554814Z     'SIAVL_GERENCIAL_BACKEND' is declared here.
2026-08-06T18:24:34.4554868Z 
2026-08-06T18:24:34.4554899Z 
2026-08-06T18:24:34.4555303Z Error: src/app/domains/unidade/data-access/unidade-api.service.ts:31:33 - error TS2339: Property 'baseUrl' does not exist on type '{ production: boolean; urlModeloBackend: string; SIAVL_GERENCIAL_BACKEND: string; emissaoSenhaBackend: string; urlSSO: string; realmSSO: string; clientIdSSO: string; }'.
2026-08-06T18:24:34.4555513Z 
2026-08-06T18:24:34.4555622Z 31   baseUrl: string = environment.baseUrl;
2026-08-06T18:24:34.4555736Z                                    ~~~~~~~
2026-08-06T18:24:34.4555778Z 
2026-08-06T18:24:34.4555809Z 
2026-08-06T18:24:34.4556096Z Error: src/app/domains/unidade/models/consulta-importacao-unidade.model.ts:1:30 - error TS2307: Cannot find module './unidade-siico.model' or its corresponding type declarations.
2026-08-06T18:24:34.4556219Z 
2026-08-06T18:24:34.4556383Z 1 import { UnidadeSiico } from './unidade-siico.model';
2026-08-06T18:24:34.4556507Z                                ~~~~~~~~~~~~~~~~~~~~~~~
2026-08-06T18:24:34.4556562Z 
2026-08-06T18:24:34.4556593Z 
2026-08-06T18:24:34.4556859Z Error: src/app/domains/unidade/models/unidade-api.model.ts:1:30 - error TS2307: Cannot find module './unidade-siico.model' or its corresponding type declarations.
2026-08-06T18:24:34.4556970Z 
2026-08-06T18:24:34.4557133Z 1 import { UnidadeSiico } from './unidade-siico.model';
2026-08-06T18:24:34.4557261Z                                ~~~~~~~~~~~~~~~~~~~~~~~
2026-08-06T18:24:34.4557317Z 
2026-08-06T18:24:34.4557348Z 
2026-08-06T18:24:34.4557747Z Error: src/app/features/unidades/components/dialogs/importar-unidade-dialog/components/conferencia-unidade-siico/conferencia-unidade-siico.component.ts:7:48 - error TS2307: Cannot find module '../bloco-alerta-importacao/bloco-alerta-importacao.component' or its corresponding type declarations.
2026-08-06T18:24:34.4557914Z 
2026-08-06T18:24:34.4558140Z 7 import { BlocoAlertaImportacaoComponent } from '../bloco-alerta-importacao/bloco-alerta-importacao.component';
2026-08-06T18:24:34.4558315Z                                                  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
2026-08-06T18:24:34.4558388Z 
2026-08-06T18:24:34.4558419Z 
2026-08-06T18:24:34.4558810Z Error: src/app/features/unidades/components/dialogs/importar-unidade-dialog/components/conferencia-unidade-siico/conferencia-unidade-siico.component.ts:8:30 - error TS2307: Cannot find module '../../../../../../../domains/unidade/models/unidade-siico.model' or its corresponding type declarations.
2026-08-06T18:24:34.4558983Z 
2026-08-06T18:24:34.4559185Z 8 import { UnidadeSiico } from '../../../../../../../domains/unidade/models/unidade-siico.model';
2026-08-06T18:24:34.4559351Z                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
2026-08-06T18:24:34.4559416Z 
2026-08-06T18:24:34.4559457Z 
2026-08-06T18:24:34.4559813Z Error: src/app/features/unidades/components/dialogs/importar-unidade-dialog/components/conferencia-unidade-siico/conferencia-unidade-siico.component.ts:14:16 - error NG2008: Could not find template file './conferencia-unidade-siico.component.html'.
2026-08-06T18:24:34.4559961Z 
2026-08-06T18:24:34.4560135Z 14   templateUrl: './conferencia-unidade-siico.component.html',
2026-08-06T18:24:34.4560280Z                   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
2026-08-06T18:24:34.4560336Z 
2026-08-06T18:24:34.4560374Z 
2026-08-06T18:24:34.4560839Z Error: src/app/features/unidades/components/dialogs/importar-unidade-dialog/components/conflito-unidade-inativa/conflito-unidade-inativa.component.ts:8:48 - error TS2307: Cannot find module '../bloco-alerta-importacao/bloco-alerta-importacao.component' or its corresponding type declarations.
2026-08-06T18:24:34.4561041Z 
2026-08-06T18:24:34.4561264Z 8 import { BlocoAlertaImportacaoComponent } from '../bloco-alerta-importacao/bloco-alerta-importacao.component';
2026-08-06T18:24:34.4561434Z                                                  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
2026-08-06T18:24:34.4561501Z 
2026-08-06T18:24:34.4561541Z 
2026-08-06T18:24:34.4561884Z Error: src/app/features/unidades/components/dialogs/importar-unidade-dialog/components/conflito-unidade-inativa/conflito-unidade-inativa.component.ts:19:16 - error NG2008: Could not find template file './conflito-unidade-inativa.component.html'.
2026-08-06T18:24:34.4562072Z 
2026-08-06T18:24:34.4562245Z 19   templateUrl: './conflito-unidade-inativa.component.html',
2026-08-06T18:24:34.4562388Z                   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
2026-08-06T18:24:34.4562442Z 
2026-08-06T18:24:34.4562476Z 
2026-08-06T18:24:34.4562829Z Error: src/app/features/unidades/pages/importar-unidade/importar-unidade.component.ts:9:8 - error TS2307: Cannot find module '../../components/dialogs/importar-unidade-dialog/importar-unidade-dialog.component' or its corresponding type declarations.
2026-08-06T18:24:34.4562986Z 
2026-08-06T18:24:34.4563186Z 9 } from '../../components/dialogs/importar-unidade-dialog/importar-unidade-dialog.component';
2026-08-06T18:24:34.4563356Z          ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
2026-08-06T18:24:34.4563428Z 
2026-08-06T18:24:34.4563460Z 
2026-08-06T18:24:34.4563756Z Error: src/app/features/unidades/pages/importar-unidade/importar-unidade.component.ts:14:27 - error NG1010: 'imports' must be an array of components, directives, pipes, or NgModules.
2026-08-06T18:24:34.4563947Z   Value could not be determined statically.
2026-08-06T18:24:34.4564008Z 
2026-08-06T18:24:34.4564115Z 14   imports: [CommonModule, ImportarUnidadeDialogComponent],
2026-08-06T18:24:34.4564250Z                              ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
2026-08-06T18:24:34.4564310Z 
2026-08-06T18:24:34.4564527Z   src/app/features/unidades/pages/importar-unidade/importar-unidade.component.ts:14:27
2026-08-06T18:24:34.4564691Z     14   imports: [CommonModule, ImportarUnidadeDialogComponent],
2026-08-06T18:24:34.4564825Z                                  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
2026-08-06T18:24:34.4564930Z     Unknown reference.
2026-08-06T18:24:34.4564981Z 
2026-08-06T18:24:34.4565011Z 
2026-08-06T18:24:34.4565320Z Error: src/app/features/unidades/state/importacao-unidade.store.ts:5:30 - error TS2307: Cannot find module '../../../domains/unidade/models/unidade-siico.model' or its corresponding type declarations.
2026-08-06T18:24:34.4565449Z 
2026-08-06T18:24:34.4565640Z 5 import { UnidadeSiico } from '../../../domains/unidade/models/unidade-siico.model';
2026-08-06T18:24:34.4565795Z                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
2026-08-06T18:24:34.4565866Z 
2026-08-06T18:24:34.4565895Z 
2026-08-06T18:24:34.4565926Z 
2026-08-06T18:24:34.5039767Z ##[error]Bash exited with code '1'.
2026-08-06T18:24:34.5047295Z ##[section]Finishing: Build Application
 
