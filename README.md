2026-06-24T16:56:05.9654140Z ##[section]Starting: Build Application
2026-06-24T16:56:05.9658910Z ==============================================================================
2026-06-24T16:56:05.9658999Z Task         : Bash
2026-06-24T16:56:05.9659080Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-24T16:56:05.9659143Z Version      : 3.227.0
2026-06-24T16:56:05.9659188Z Author       : Microsoft Corporation
2026-06-24T16:56:05.9659276Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-24T16:56:05.9659347Z ==============================================================================
2026-06-24T16:56:06.1100277Z Generating script.
2026-06-24T16:56:06.1111748Z ========================== Starting Command Output ===========================
2026-06-24T16:56:06.1118982Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/65b3b3af-f869-4aeb-b4f7-b605d9133b6a.sh
2026-06-24T16:56:06.1166739Z ng build --prod --build-optimizer --aot --outputPath=dist && npm test 
2026-06-24T16:56:06.1167255Z <----ANGULAR---->
2026-06-24T16:56:06.4947274Z 
2026-06-24T16:56:06.4948149Z      _                      _                 ____ _     ___
2026-06-24T16:56:06.4948373Z     / \   _ __   __ _ _   _| | __ _ _ __     / ___| |   |_ _|
2026-06-24T16:56:06.4948888Z    / △ \ | '_ \ / _` | | | | |/ _` | '__|   | |   | |    | |
2026-06-24T16:56:06.4949040Z   / ___ \| | | | (_| | |_| | | (_| | |      | |___| |___ | |
2026-06-24T16:56:06.4949157Z  /_/   \_\_| |_|\__, |\__,_|_|\__,_|_|       \____|_____|___|
2026-06-24T16:56:06.4949297Z                 |___/
2026-06-24T16:56:06.4949431Z     
2026-06-24T16:56:06.7737258Z 
2026-06-24T16:56:06.7737733Z Angular CLI: 12.2.18
2026-06-24T16:56:06.7738013Z Node: 14.18.2
2026-06-24T16:56:06.7738186Z Package Manager: npm 6.14.15
2026-06-24T16:56:06.7738327Z OS: linux x64
2026-06-24T16:56:06.7738367Z 
2026-06-24T16:56:06.7738490Z Angular: 12.2.17
2026-06-24T16:56:06.7738919Z ... animations, common, compiler, compiler-cli, core, forms
2026-06-24T16:56:06.7739161Z ... platform-browser, platform-browser-dynamic, router
2026-06-24T16:56:06.7739233Z 
2026-06-24T16:56:06.7739364Z Package                         Version
2026-06-24T16:56:06.7739569Z ---------------------------------------------------------
2026-06-24T16:56:06.7739750Z @angular-devkit/architect       0.1202.18
2026-06-24T16:56:06.7739962Z @angular-devkit/build-angular   12.2.18
2026-06-24T16:56:06.7740714Z @angular-devkit/core            12.2.18
2026-06-24T16:56:06.7740904Z @angular-devkit/schematics      12.2.18
2026-06-24T16:56:06.7741051Z @angular/cdk                    12.2.13
2026-06-24T16:56:06.7741192Z @angular/cli                    12.2.18
2026-06-24T16:56:06.7741293Z @angular/material               12.2.13
2026-06-24T16:56:06.7741448Z @schematics/angular             12.2.18
2026-06-24T16:56:06.7741587Z rxjs                            6.6.7
2026-06-24T16:56:06.7741724Z typescript                      4.3.5
2026-06-24T16:56:06.7741864Z     
2026-06-24T16:56:07.3112634Z Option "--prod" is deprecated: Use "--configuration production" instead.
2026-06-24T16:56:08.5017481Z - Generating browser application bundles (phase: setup)...
2026-06-24T16:56:11.2371766Z [33mWarning:[0m Entry point 'dsc-components' contains deep imports into '/opt/ads-agent/_work/42/s/node_modules/inputmask/dist/inputmask.js', '/opt/ads-agent/_work/42/s/node_modules/@angular/common/locales/pt'. This is probably not a problem, but may cause the compilation of entry points to be out of order.
2026-06-24T16:56:11.8474116Z Compiling @angular/core : es2015 as esm2015
2026-06-24T16:56:11.8946406Z Compiling @angular/cdk/keycodes : es2015 as esm2015
2026-06-24T16:56:11.9421232Z Compiling @angular/animations : es2015 as esm2015
2026-06-24T16:56:14.4442381Z Compiling @angular/common : es2015 as esm2015
2026-06-24T16:56:14.4442807Z Compiling @angular/animations/browser : es2015 as esm2015
2026-06-24T16:56:14.4442979Z Compiling @angular/cdk/observers : es2015 as esm2015
2026-06-24T16:56:14.4458954Z Compiling @angular/cdk/collections : es2015 as esm2015
2026-06-24T16:56:15.2207827Z Compiling @angular/cdk/platform : es2015 as esm2015
2026-06-24T16:56:15.3013508Z Compiling @angular/cdk/bidi : es2015 as esm2015
2026-06-24T16:56:15.4177805Z Compiling @angular/platform-browser : es2015 as esm2015
2026-06-24T16:56:15.5077174Z Compiling @angular/cdk/a11y : es2015 as esm2015
2026-06-24T16:56:15.5886312Z Compiling @angular/forms : es2015 as esm2015
2026-06-24T16:56:15.8089410Z Compiling @angular/platform-browser/animations : es2015 as esm2015
2026-06-24T16:56:15.9147935Z Compiling @angular/cdk/scrolling : es2015 as esm2015
2026-06-24T16:56:16.0140795Z Compiling @angular/cdk/portal : es2015 as esm2015
2026-06-24T16:56:16.2034244Z Compiling @angular/cdk/layout : es2015 as esm2015
2026-06-24T16:56:16.2227060Z Compiling @angular/common/http : es2015 as esm2015
2026-06-24T16:56:16.4342254Z Compiling @angular/cdk/text-field : es2015 as esm2015
2026-06-24T16:56:16.5854898Z Compiling @angular/cdk/overlay : es2015 as esm2015
2026-06-24T16:56:16.6079306Z Compiling @angular/material/core : es2015 as esm2015
2026-06-24T16:56:16.6905615Z Compiling @angular/router : es2015 as esm2015
2026-06-24T16:56:16.7755409Z Compiling @angular/cdk/accordion : es2015 as esm2015
2026-06-24T16:56:16.9119227Z Compiling @angular/cdk/table : es2015 as esm2015
2026-06-24T16:56:17.1849503Z Compiling @angular/platform-browser-dynamic : es2015 as esm2015
2026-06-24T16:56:17.1886811Z Compiling @azure/msal-angular : es2015 as esm2015
2026-06-24T16:56:17.3331313Z Compiling @angular/material/form-field : es2015 as esm2015
2026-06-24T16:56:17.5043717Z Compiling @angular/material/button : es2015 as esm2015
2026-06-24T16:56:17.5841865Z Compiling @angular/material/tooltip : es2015 as esm2015
2026-06-24T16:56:17.8732011Z Compiling @angular/material/select : es2015 as esm2015
2026-06-24T16:56:17.8762136Z Compiling @angular/material/input : es2015 as esm2015
2026-06-24T16:56:18.0364190Z Compiling @angular/material/divider : es2015 as esm2015
2026-06-24T16:56:18.0963003Z Compiling @angular/material/icon : es2015 as esm2015
2026-06-24T16:56:18.1347061Z Compiling @angular/material/datepicker : es2015 as esm2015
2026-06-24T16:56:18.3141961Z Compiling @angular/material/tabs : es2015 as esm2015
2026-06-24T16:56:18.3823826Z Compiling @angular/material/toolbar : es2015 as esm2015
2026-06-24T16:56:18.4346968Z Compiling @angular/material/sidenav : es2015 as esm2015
2026-06-24T16:56:18.5816917Z Compiling @angular/material/list : es2015 as esm2015
2026-06-24T16:56:18.9209941Z Compiling @angular/material/paginator : es2015 as esm2015
2026-06-24T16:56:18.9975879Z Compiling @angular/material/sort : es2015 as esm2015
2026-06-24T16:56:19.0060625Z Compiling @angular/material/dialog : es2015 as esm2015
2026-06-24T16:56:19.0929204Z Compiling dsc-components : es2015 as esm2015
2026-06-24T16:56:19.2172210Z Compiling @angular/material/checkbox : es2015 as esm2015
2026-06-24T16:56:19.2973715Z Compiling @angular/material/expansion : es2015 as esm2015
2026-06-24T16:56:19.3364477Z Compiling @angular/material/grid-list : es2015 as esm2015
2026-06-24T16:56:19.4347261Z Compiling @angular/material/menu : es2015 as esm2015
2026-06-24T16:56:19.5242165Z Compiling @angular/material/progress-spinner : es2015 as esm2015
2026-06-24T16:56:19.6266935Z Compiling @angular/material/radio : es2015 as esm2015
2026-06-24T16:56:19.7749480Z Compiling @angular/material/table : es2015 as esm2015
2026-06-24T16:56:19.8245290Z Compiling @angular/material/card : es2015 as esm2015
2026-06-24T16:56:19.8968031Z Compiling @angular/material/chips : es2015 as esm2015
2026-06-24T16:56:20.0018037Z Compiling @angular/material/snack-bar : es2015 as esm2015
2026-06-24T17:08:31.3357007Z ✔ Browser application bundle generation complete.
2026-06-24T17:08:31.3415326Z ✔ Browser application bundle generation complete.
2026-06-24T17:08:31.3576256Z 
2026-06-24T17:08:31.3577746Z Error: node_modules/@types/lodash/common/common.d.ts:266:65 - error TS1005: '?' expected.
2026-06-24T17:08:31.3577886Z 
2026-06-24T17:08:31.3580588Z 266     type StringToNumber<T> = T extends `${infer N extends number}` ? N : never;
2026-06-24T17:08:31.3581726Z                                                                     ~
2026-06-24T17:08:31.3581927Z 
2026-06-24T17:08:31.3581988Z 
2026-06-24T17:08:31.3582550Z Error: node_modules/@types/lodash/common/object.d.ts:1026:46 - error TS1005: '?' expected.
2026-06-24T17:08:31.3582689Z 
2026-06-24T17:08:31.3582913Z 1026         : K extends `${infer N extends number}` ? T[N]
2026-06-24T17:08:31.3583150Z                                                   ~
2026-06-24T17:08:31.3583222Z 
2026-06-24T17:08:31.3583278Z 
2026-06-24T17:08:31.3583704Z Error: node_modules/@types/lodash/common/object.d.ts:1026:51 - error TS2536: Type 'N' cannot be used to index type 'T'.
2026-06-24T17:08:31.3583862Z 
2026-06-24T17:08:31.3584126Z 1026         : K extends `${infer N extends number}` ? T[N]
2026-06-24T17:08:31.3584410Z                                                        ~~~~
2026-06-24T17:08:31.3584483Z 
2026-06-24T17:08:31.3584581Z 
2026-06-24T17:08:31.3584962Z Error: node_modules/@types/lodash/common/object.d.ts:1031:46 - error TS1005: '?' expected.
2026-06-24T17:08:31.3585100Z 
2026-06-24T17:08:31.3585327Z 1031         : K extends `${infer N extends number}` ? T[N]
2026-06-24T17:08:31.3585558Z                                                   ~
2026-06-24T17:08:31.3585622Z 
2026-06-24T17:08:31.3585672Z 
2026-06-24T17:08:31.3586086Z Error: node_modules/@types/lodash/common/object.d.ts:1031:51 - error TS2536: Type 'N' cannot be used to index type 'T'.
2026-06-24T17:08:31.3586242Z 
2026-06-24T17:08:31.3586655Z 1031         : K extends `${infer N extends number}` ? T[N]
2026-06-24T17:08:31.3586909Z                                                        ~~~~
2026-06-24T17:08:31.3586974Z 
2026-06-24T17:08:31.3587138Z 
2026-06-24T17:08:31.3587482Z Error: node_modules/@types/lodash/common/object.d.ts:1041:46 - error TS1005: '?' expected.
2026-06-24T17:08:31.3587660Z 
2026-06-24T17:08:31.3587876Z 1041         : K extends `${infer N extends number}`
2026-06-24T17:08:31.3588056Z                                                   ~
2026-06-24T17:08:31.3588179Z 
2026-06-24T17:08:31.3588234Z 
2026-06-24T17:08:31.3588288Z 
2026-06-24T17:08:31.5996188Z ##[error]Bash exited with code '1'.
2026-06-24T17:08:31.6034059Z ##[section]Finishing: Build Application
