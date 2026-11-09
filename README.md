2026-11-09T17:47:46.0444254Z ##[section]Starting: Build Application
2026-11-09T17:47:46.0448842Z ==============================================================================
2026-11-09T17:47:46.0448923Z Task         : Bash
2026-11-09T17:47:46.0449034Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-09T17:47:46.0449105Z Version      : 3.227.0
2026-11-09T17:47:46.0449151Z Author       : Microsoft Corporation
2026-11-09T17:47:46.0449248Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-09T17:47:46.0449319Z ==============================================================================
2026-11-09T17:47:46.2146948Z Generating script.
2026-11-09T17:47:46.2160451Z ========================== Starting Command Output ===========================
2026-11-09T17:47:46.2168396Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/5d3638c3-df07-4e02-85ec-4f654b609527.sh
2026-11-09T17:47:46.2314126Z npx jest --ci --coverage --coverageReporters=lcov --coverageReporters=text-summary && ng build --configuration production --build-optimizer --aot --output-path=dist
2026-11-09T17:47:46.2315101Z <----ANGULAR---->
2026-11-09T17:47:46.9907092Z 
2026-11-09T17:47:46.9907734Z      _                      _                 ____ _     ___
2026-11-09T17:47:46.9907920Z     / \   _ __   __ _ _   _| | __ _ _ __     / ___| |   |_ _|
2026-11-09T17:47:46.9908574Z    / △ \ | '_ \ / _` | | | | |/ _` | '__|   | |   | |    | |
2026-11-09T17:47:46.9909010Z   / ___ \| | | | (_| | |_| | | (_| | |      | |___| |___ | |
2026-11-09T17:47:46.9909215Z  /_/   \_\_| |_|\__, |\__,_|_|\__,_|_|       \____|_____|___|
2026-11-09T17:47:46.9909374Z                 |___/
2026-11-09T17:47:46.9909515Z     
2026-11-09T17:47:47.2753578Z 
2026-11-09T17:47:47.2754627Z Angular CLI: 19.2.27
2026-11-09T17:47:47.2754976Z Node: 18.19.0
2026-11-09T17:47:47.2755135Z Package Manager: npm 10.2.3
2026-11-09T17:47:47.2755280Z OS: linux x64
2026-11-09T17:47:47.2755327Z 
2026-11-09T17:47:47.2755459Z Angular: 19.2.25
2026-11-09T17:47:47.2756164Z ... animations, common, compiler, compiler-cli, core, forms
2026-11-09T17:47:47.2756439Z ... platform-browser, platform-browser-dynamic, router
2026-11-09T17:47:47.2756503Z 
2026-11-09T17:47:47.2756635Z Package                         Version
2026-11-09T17:47:47.2756940Z ---------------------------------------------------------
2026-11-09T17:47:47.2757198Z @angular-devkit/architect       0.1902.27 (cli-only)
2026-11-09T17:47:47.2757426Z @angular-devkit/build-angular   19.2.27
2026-11-09T17:47:47.2757585Z @angular-devkit/core            19.2.27
2026-11-09T17:47:47.2757790Z @angular-devkit/schematics      19.2.27
2026-11-09T17:47:47.2757941Z @angular/cdk                    19.2.19
2026-11-09T17:47:47.2758108Z @angular/cli                    19.2.27
2026-11-09T17:47:47.2758251Z @angular/material               19.2.19
2026-11-09T17:47:47.2758409Z @schematics/angular             19.2.27
2026-11-09T17:47:47.2758672Z rxjs                            7.8.2
2026-11-09T17:47:47.2758812Z typescript                      5.8.3
2026-11-09T17:47:47.2758918Z zone.js                         0.15.1
2026-11-09T17:47:47.2759061Z     
2026-11-09T17:48:20.9592163Z PASS tools/transforme/src/converters/jquery-to-reactive-forms.spec.ts (26.307 s)
2026-11-09T17:48:21.0541164Z PASS tools/transforme/src/converters/ajax-to-httpclient.spec.ts (26.299 s)
2026-11-09T17:48:21.1450516Z PASS tools/transforme/src/mappers/bootstrap-to-sidsc.spec.ts (26.598 s)
2026-11-09T17:48:21.1655124Z PASS src/app/shared/services/cnpj-consulta.service.spec.ts (26.417 s)
2026-11-09T17:48:21.2453493Z PASS tools/transforme/src/generators/component-generator.spec.ts (26.696 s)
2026-11-09T17:48:21.2699558Z PASS tools/transforme/src/parsers/html-parser.spec.ts (26.716 s)
2026-11-09T17:48:21.2880960Z PASS tools/transforme/src/engine.spec.ts (26.432 s)
2026-11-09T17:48:21.4842346Z FAIL src/app/shared/components/pdf-viewer/pdf-mime-fix-sw.spec.ts (26.935 s)
2026-11-09T17:48:21.4843386Z   ● pdf-mime-fix-sw.js › ativa e assume o controle da aplicação durante o ciclo de vida
2026-11-09T17:48:21.5350308Z 
2026-11-09T17:48:21.5351248Z     expect(jest.fn()).toHaveBeenCalledTimes(expected)
2026-11-09T17:48:21.5351578Z 
2026-11-09T17:48:21.5352150Z     Expected number of calls: 1
2026-11-09T17:48:21.5352330Z     Received number of calls: 0
2026-11-09T17:48:21.5352456Z 
2026-11-09T17:48:21.5356959Z       113 |   harness.listeners.get('activate')?.({ waitUntil: activateWaitUntil });
2026-11-09T17:48:21.5357383Z       114 |
2026-11-09T17:48:21.5357699Z     > 115 |   expect(harness.serviceWorker.skipWaiting).toHaveBeenCalledTimes(1);
2026-11-09T17:48:21.5357838Z           |                                             ^
2026-11-09T17:48:21.5358076Z       116 |   expect(harness.serviceWorker.clients.claim).toHaveBeenCalledTimes(1);
2026-11-09T17:48:21.5358292Z       117 |   await expect(installWaitUntil.mock.calls[0][0]).resolves.toBeUndefined();
2026-11-09T17:48:21.5358493Z       118 |   await expect(activateWaitUntil.mock.calls[0][0]).resolves.toBeUndefined();
2026-11-09T17:48:21.5358951Z 
2026-11-09T17:48:21.5359245Z       at Object.verifyLifecycle (src/app/shared/components/pdf-viewer/pdf-mime-fix-sw.spec.ts:115:45)
2026-11-09T17:48:21.5359675Z 
2026-11-09T17:48:21.5359994Z   ● pdf-mime-fix-sw.js › corrige o MIME de módulos .mjs na pasta assets e preserva os demais headers
2026-11-09T17:48:21.5360090Z 
2026-11-09T17:48:21.5360291Z     A requisição .mjs não foi interceptada.
2026-11-09T17:48:21.5362119Z 
2026-11-09T17:48:21.5362803Z       180 |
2026-11-09T17:48:21.5362978Z       181 |   if (!responsePromise) {
2026-11-09T17:48:21.5363598Z     > 182 |     throw new Error('A requisição .mjs não foi interceptada.');
2026-11-09T17:48:21.5363814Z           |           ^
2026-11-09T17:48:21.5363994Z       183 |   }
2026-11-09T17:48:21.5364196Z       184 |
2026-11-09T17:48:21.5364390Z       185 |   return responsePromise;
2026-11-09T17:48:21.5364461Z 
2026-11-09T17:48:21.5364816Z       at interceptRequest (src/app/shared/components/pdf-viewer/pdf-mime-fix-sw.spec.ts:182:11)
2026-11-09T17:48:21.5365217Z       at Object.verifyMimeCorrection (src/app/shared/components/pdf-viewer/pdf-mime-fix-sw.spec.ts:128:37)
2026-11-09T17:48:21.5365372Z 
2026-11-09T17:48:21.5365715Z   ● pdf-mime-fix-sw.js › mantém resposta com MIME JavaScript sem recriá-la
2026-11-09T17:48:21.5365858Z 
2026-11-09T17:48:21.5366165Z     A requisição .mjs não foi interceptada.
2026-11-09T17:48:21.5366257Z 
2026-11-09T17:48:21.5366439Z       180 |
2026-11-09T17:48:21.5366736Z       181 |   if (!responsePromise) {
2026-11-09T17:48:21.5366993Z     > 182 |     throw new Error('A requisição .mjs não foi interceptada.');
2026-11-09T17:48:21.5367200Z           |           ^
2026-11-09T17:48:21.5367371Z       183 |   }
2026-11-09T17:48:21.5367537Z       184 |
2026-11-09T17:48:21.5367746Z       185 |   return responsePromise;
2026-11-09T17:48:21.5367815Z 
2026-11-09T17:48:21.5368133Z       at interceptRequest (src/app/shared/components/pdf-viewer/pdf-mime-fix-sw.spec.ts:182:11)
2026-11-09T17:48:21.5368702Z       at Object.verifyExistingJavascriptMime (src/app/shared/components/pdf-viewer/pdf-mime-fix-sw.spec.ts:142:16)
2026-11-09T17:48:21.5368833Z 
2026-11-09T17:48:21.5369134Z   ● pdf-mime-fix-sw.js › mantém respostas HTTP de erro sem alterar o MIME
2026-11-09T17:48:21.5369309Z 
2026-11-09T17:48:21.5369507Z     A requisição .mjs não foi interceptada.
2026-11-09T17:48:21.5370042Z 
2026-11-09T17:48:21.5370202Z       180 |
2026-11-09T17:48:21.5370382Z       181 |   if (!responsePromise) {
2026-11-09T17:48:21.5370644Z     > 182 |     throw new Error('A requisição .mjs não foi interceptada.');
2026-11-09T17:48:21.5370880Z           |           ^
2026-11-09T17:48:21.5371047Z       183 |   }
2026-11-09T17:48:21.5371225Z       184 |
2026-11-09T17:48:21.5371406Z       185 |   return responsePromise;
2026-11-09T17:48:21.5371473Z 
2026-11-09T17:48:21.5371796Z       at interceptRequest (src/app/shared/components/pdf-viewer/pdf-mime-fix-sw.spec.ts:182:11)
2026-11-09T17:48:21.5372197Z       at Object.verifyErrorResponse (src/app/shared/components/pdf-viewer/pdf-mime-fix-sw.spec.ts:153:16)
2026-11-09T17:48:21.5372493Z 
2026-11-09T17:48:21.8490923Z PASS src/app/features/agente-financeiro/services/contato.service.spec.ts (27.084 s)
2026-11-09T17:48:21.9207331Z PASS src/app/features/agente-financeiro/services/agente-financeiro.service.spec.ts (27.062 s)
2026-11-09T17:48:21.9697196Z PASS src/app/app.component.spec.ts (27.421 s)
2026-11-09T17:49:45.4926497Z 
2026-11-09T17:49:45.4927963Z =============================== Coverage summary ===============================
2026-11-09T17:49:45.4928469Z Statements   : 7.6% ( 377/4957 )
2026-11-09T17:49:45.4928664Z Branches     : 6.11% ( 132/2160 )
2026-11-09T17:49:45.4928825Z Functions    : 6.82% ( 103/1510 )
2026-11-09T17:49:45.4928992Z Lines        : 7.43% ( 344/4629 )
2026-11-09T17:49:45.4929211Z ================================================================================
2026-11-09T17:49:45.4932231Z 
2026-11-09T17:49:45.4937108Z Test Suites: 1 failed, 10 passed, 11 total
2026-11-09T17:49:45.4937335Z Tests:       4 failed, 33 passed, 37 total
2026-11-09T17:49:45.4937719Z Snapshots:   0 total
2026-11-09T17:49:45.4937872Z Time:        115.138 s
2026-11-09T17:49:45.4938011Z Ran all test suites.
2026-11-09T17:49:45.6115001Z ##[error]Bash exited with code '1'.
2026-11-09T17:49:45.6127514Z ##[section]Finishing: Build Application


quebrou
