2026-06-24T19:04:01.9434261Z ##[section]Starting: Build Application
2026-06-24T19:04:01.9438180Z ==============================================================================
2026-06-24T19:04:01.9438402Z Task         : Bash
2026-06-24T19:04:01.9438450Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-24T19:04:01.9438522Z Version      : 3.227.0
2026-06-24T19:04:01.9438614Z Author       : Microsoft Corporation
2026-06-24T19:04:01.9438667Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-24T19:04:01.9438734Z ==============================================================================
2026-06-24T19:04:02.0910877Z Generating script.
2026-06-24T19:04:02.0922829Z ========================== Starting Command Output ===========================
2026-06-24T19:04:02.0930073Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/dceda7dc-9707-4d46-b403-43068d485352.sh
2026-06-24T19:04:02.0979644Z ng build --prod --build-optimizer --aot --outputPath=dist && npm test 
2026-06-24T19:04:02.7287419Z <----ANGULAR---->
2026-06-24T19:04:02.7287571Z 
2026-06-24T19:04:02.7287821Z      _                      _                 ____ _     ___
2026-06-24T19:04:02.7288210Z     / \   _ __   __ _ _   _| | __ _ _ __     / ___| |   |_ _|
2026-06-24T19:04:02.7288605Z    / △ \ | '_ \ / _` | | | | |/ _` | '__|   | |   | |    | |
2026-06-24T19:04:02.7288787Z   / ___ \| | | | (_| | |_| | | (_| | |      | |___| |___ | |
2026-06-24T19:04:02.7289027Z  /_/   \_\_| |_|\__, |\__,_|_|\__,_|_|       \____|_____|___|
2026-06-24T19:04:02.7289242Z                 |___/
2026-06-24T19:04:02.7289611Z     
2026-06-24T19:04:03.1858416Z 
2026-06-24T19:04:03.1858886Z Angular CLI: 12.2.18
2026-06-24T19:04:03.1859267Z Node: 16.14.0 (Unsupported)
2026-06-24T19:04:03.1859423Z Package Manager: npm 8.3.1
2026-06-24T19:04:03.1859576Z OS: linux x64
2026-06-24T19:04:03.1859620Z 
2026-06-24T19:04:03.1859747Z Angular: 12.2.17
2026-06-24T19:04:03.1860188Z ... animations, common, compiler, compiler-cli, core, forms
2026-06-24T19:04:03.1860378Z ... platform-browser, platform-browser-dynamic, router
2026-06-24T19:04:03.1860501Z 
2026-06-24T19:04:03.1860596Z Package                         Version
2026-06-24T19:04:03.1860805Z ---------------------------------------------------------
2026-06-24T19:04:03.1861234Z @angular-devkit/architect       0.1202.18
2026-06-24T19:04:03.1861613Z @angular-devkit/build-angular   12.2.17
2026-06-24T19:04:03.1861944Z @angular-devkit/core            12.2.18
2026-06-24T19:04:03.1862150Z @angular-devkit/schematics      12.2.18
2026-06-24T19:04:03.1862257Z @angular/cdk                    12.2.13
2026-06-24T19:04:03.1862410Z @angular/cli                    12.2.18
2026-06-24T19:04:03.1862552Z @angular/material               12.2.13
2026-06-24T19:04:03.1862693Z @schematics/angular             12.2.18
2026-06-24T19:04:03.1862828Z rxjs                            6.6.7
2026-06-24T19:04:03.1862927Z typescript                      4.3.5
2026-06-24T19:04:03.1863049Z     
2026-06-24T19:04:03.1863236Z Warning: The current version of Node (16.14.0) is not supported by Angular.
2026-06-24T19:04:03.7383565Z Option "--prod" is deprecated: Use "--configuration production" instead.
2026-06-24T19:04:04.9001894Z Browserslist: caniuse-lite is outdated. Please run:
2026-06-24T19:04:04.9002204Z   npx update-browserslist-db@latest
2026-06-24T19:04:04.9002483Z   Why you should do it regularly: https://github.com/browserslist/update-db#readme
2026-06-24T19:04:04.9334699Z - Generating browser application bundles (phase: setup)...
2026-06-24T19:04:07.5263874Z [33mWarning:[0m Entry point 'dsc-components' contains deep imports into '/opt/ads-agent/_work/33/s/node_modules/inputmask/dist/inputmask.js', '/opt/ads-agent/_work/33/s/node_modules/@angular/common/locales/pt'. This is probably not a problem, but may cause the compilation of entry points to be out of order.
2026-06-24T19:04:08.0927544Z Compiling @angular/core : es2015 as esm2015
2026-06-24T19:04:08.1395962Z Compiling @angular/cdk/keycodes : es2015 as esm2015
2026-06-24T19:04:08.1817418Z Compiling @angular/animations : es2015 as esm2015
2026-06-24T19:04:10.3040952Z Compiling @angular/common : es2015 as esm2015
2026-06-24T19:04:10.3041162Z Compiling @angular/cdk/observers : es2015 as esm2015
2026-06-24T19:04:10.3041343Z Compiling @angular/animations/browser : es2015 as esm2015
2026-06-24T19:04:10.3050459Z Compiling @angular/cdk/collections : es2015 as esm2015
2026-06-24T19:04:11.1299977Z Compiling @angular/cdk/platform : es2015 as esm2015
2026-06-24T19:04:11.1300222Z Compiling @angular/cdk/bidi : es2015 as esm2015
2026-06-24T19:04:11.2615062Z Compiling @angular/platform-browser : es2015 as esm2015
2026-06-24T19:04:11.3721505Z Compiling @angular/cdk/a11y : es2015 as esm2015
2026-06-24T19:04:11.4363026Z Compiling @angular/forms : es2015 as esm2015
2026-06-24T19:04:11.5602809Z Compiling @angular/cdk/scrolling : es2015 as esm2015
2026-06-24T19:04:11.7462358Z Compiling @angular/platform-browser/animations : es2015 as esm2015
2026-06-24T19:04:11.8739749Z Compiling @angular/cdk/portal : es2015 as esm2015
2026-06-24T19:04:11.9653020Z Compiling @angular/cdk/layout : es2015 as esm2015
2026-06-24T19:04:12.1257870Z Compiling @angular/common/http : es2015 as esm2015
2026-06-24T19:04:12.3316906Z Compiling @angular/cdk/overlay : es2015 as esm2015
2026-06-24T19:04:12.3597939Z Compiling @angular/cdk/text-field : es2015 as esm2015
2026-06-24T19:04:12.3642821Z Compiling @angular/material/core : es2015 as esm2015
2026-06-24T19:04:12.3674739Z Compiling @angular/router : es2015 as esm2015
2026-06-24T19:04:12.5656480Z Compiling @angular/cdk/accordion : es2015 as esm2015
2026-06-24T19:04:12.7512884Z Compiling @angular/cdk/table : es2015 as esm2015
2026-06-24T19:04:12.8367200Z Compiling @angular/platform-browser-dynamic : es2015 as esm2015
2026-06-24T19:04:12.8445464Z Compiling @azure/msal-angular : es2015 as esm2015
2026-06-24T19:04:12.9616980Z Compiling @angular/material/form-field : es2015 as esm2015
2026-06-24T19:04:13.1789579Z Compiling @angular/material/button : es2015 as esm2015
2026-06-24T19:04:13.3418724Z Compiling @angular/material/tooltip : es2015 as esm2015
2026-06-24T19:04:13.4567727Z Compiling @angular/material/select : es2015 as esm2015
2026-06-24T19:04:13.5678511Z Compiling @angular/material/input : es2015 as esm2015
2026-06-24T19:04:13.7804419Z Compiling @angular/material/divider : es2015 as esm2015
2026-06-24T19:04:13.8431931Z Compiling @angular/material/icon : es2015 as esm2015
2026-06-24T19:04:13.8461038Z Compiling @angular/material/datepicker : es2015 as esm2015
2026-06-24T19:04:13.9735221Z Compiling @angular/material/tabs : es2015 as esm2015
2026-06-24T19:04:14.0359193Z Compiling @angular/material/toolbar : es2015 as esm2015
2026-06-24T19:04:14.1332056Z Compiling @angular/material/sidenav : es2015 as esm2015
2026-06-24T19:04:14.1842369Z Compiling @angular/material/list : es2015 as esm2015
2026-06-24T19:04:14.4760065Z Compiling @angular/material/paginator : es2015 as esm2015
2026-06-24T19:04:14.5309907Z Compiling @angular/material/sort : es2015 as esm2015
2026-06-24T19:04:14.6249386Z Compiling @angular/material/dialog : es2015 as esm2015
2026-06-24T19:04:14.6717957Z Compiling dsc-components : es2015 as esm2015
2026-06-24T19:04:14.7451683Z Compiling @angular/material/checkbox : es2015 as esm2015
2026-06-24T19:04:14.8449346Z Compiling @angular/material/expansion : es2015 as esm2015
2026-06-24T19:04:14.9519619Z Compiling @angular/material/grid-list : es2015 as esm2015
2026-06-24T19:04:14.9690219Z Compiling @angular/material/menu : es2015 as esm2015
2026-06-24T19:04:15.1337969Z Compiling @angular/material/progress-spinner : es2015 as esm2015
2026-06-24T19:04:15.1415056Z Compiling @angular/material/radio : es2015 as esm2015
2026-06-24T19:04:15.3452027Z Compiling @angular/material/table : es2015 as esm2015
2026-06-24T19:04:15.3465941Z Compiling @angular/material/card : es2015 as esm2015
2026-06-24T19:04:15.3992871Z Compiling @angular/material/chips : es2015 as esm2015
2026-06-24T19:04:15.4858526Z Compiling @angular/material/snack-bar : es2015 as esm2015
2026-06-24T19:12:55.6291587Z Browserslist: caniuse-lite is outdated. Please run:
2026-06-24T19:12:55.6292930Z   npx update-browserslist-db@latest
2026-06-24T19:12:55.6293462Z   Why you should do it regularly: https://github.com/browserslist/update-db#readme
2026-06-24T19:12:56.3936593Z ✔ Browser application bundle generation complete.
2026-06-24T19:12:56.3977786Z ✔ Browser application bundle generation complete.
2026-06-24T19:12:56.4003005Z - Copying assets...
2026-06-24T19:12:56.4211489Z ✔ Copying assets complete.
2026-06-24T19:12:56.4211693Z - Generating index html...
2026-06-24T19:12:56.5205452Z ✔ Index html generation complete.
2026-06-24T19:12:56.5233472Z 
2026-06-24T19:12:56.5236490Z Initial Chunk Files               | Names         |      Size
2026-06-24T19:12:56.5236647Z vendor.017e5f21384be358ef46.js    | vendor        |   3.46 MB
2026-06-24T19:12:56.5236870Z styles.b1547df73ec5169eaf69.css   | styles        | 106.64 kB
2026-06-24T19:12:56.5237041Z main.ef79245f86b6fd8a2afd.js      | main          |  96.49 kB
2026-06-24T19:12:56.5240121Z polyfills.d798822d03162e0f4a7f.js | polyfills     |  33.10 kB
2026-06-24T19:12:56.5290658Z runtime.9e3e9ef26618863b9683.js   | runtime       |   3.08 kB
2026-06-24T19:12:56.5290799Z 
2026-06-24T19:12:56.5291114Z | Initial Total |   3.69 MB
2026-06-24T19:12:56.5291335Z 
2026-06-24T19:12:56.5291602Z Lazy Chunk Files                  | Names         |      Size
2026-06-24T19:12:56.5292166Z 672.aafce5bd0877a5d7dc2d.js       | -             | 808.91 kB
2026-06-24T19:12:56.5292520Z 35.fe9886cadca41d58f4b6.js        | -             | 433.53 kB
2026-06-24T19:12:56.5292870Z 757.9596cbbdeb21146e12a3.js       | -             | 403.62 kB
2026-06-24T19:12:56.5293309Z 623.ee1944cccabb6453fe6e.js       | -             | 381.95 kB
2026-06-24T19:12:56.5293667Z 104.a72dc0bf19475370536e.js       | -             | 308.57 kB
2026-06-24T19:12:56.5293968Z 467.bdcc361f5f781fd1c1d0.js       | -             | 160.67 kB
2026-06-24T19:12:56.5294320Z 566.06f2bff01db623d1b13a.js       | -             |  80.74 kB
2026-06-24T19:12:56.5294689Z 459.5fdc859397074668ecf2.js       | -             |  14.82 kB
2026-06-24T19:12:56.5295034Z 933.d335c9e603c39778668c.js       | -             |  10.53 kB
2026-06-24T19:12:56.5295295Z common.b86139585f2f7a273d01.js    | common        |   9.95 kB
2026-06-24T19:12:56.5295392Z 
2026-06-24T19:12:56.5296140Z Build at: 2026-06-24T19:12:56.521Z - Hash: 4b3199cf3ac16cc00060 - Time: 530577ms
2026-06-24T19:12:56.8543873Z 
2026-06-24T19:12:56.8544785Z > SIGCB-frontend@1.0.0-snapshot test
2026-06-24T19:12:56.8545092Z > ng test
2026-06-24T19:12:56.8545132Z 
2026-06-24T19:12:58.0017244Z - Generating browser application bundles (phase: setup)...
2026-06-24T19:12:59.0912972Z 'karma-coverage-istanbul-reporter' usage has been deprecated since version 11.
2026-06-24T19:12:59.0913330Z Please install 'karma-coverage' and update 'karma.conf.js.' For more info, see https://github.com/karma-runner/karma-coverage/blob/master/README.md
2026-06-24T19:13:00.5237715Z [33mWarning:[0m Entry point 'dsc-components' contains deep imports into '/opt/ads-agent/_work/33/s/node_modules/inputmask/dist/inputmask.js', '/opt/ads-agent/_work/33/s/node_modules/@angular/common/locales/pt'. This is probably not a problem, but may cause the compilation of entry points to be out of order.
2026-06-24T19:13:01.0935367Z Compiling @angular/core/testing : es2015 as esm2015
2026-06-24T19:13:01.1519524Z Compiling @angular/platform-browser/testing : es2015 as esm2015
2026-06-24T19:13:01.1938128Z Compiling @angular/compiler/testing : es2015 as esm2015
2026-06-24T19:13:01.2406387Z Compiling @angular/common/testing : es2015 as esm2015
2026-06-24T19:13:02.5251160Z Compiling @angular/common/http/testing : es2015 as esm2015
2026-06-24T19:13:02.5595494Z Error: Error on worker #2: Error: EACCES: permission denied, open '/opt/ads-agent/_work/33/s/node_modules/@angular/platform-browser/__ivy_ngcc__/fesm2015/testing.js'
2026-06-24T19:13:02.5595918Z     at Object.openSync (node:fs:585:3)
2026-06-24T19:13:02.5596064Z     at Object.writeFileSync (node:fs:2155:35)
2026-06-24T19:13:02.5596547Z     at NodeJSFileSystem.writeFile (/opt/ads-agent/_work/33/s/node_modules/@angular/compiler-cli/src/ngtsc/file_system/src/node_js_file_system.js:130:16)
2026-06-24T19:13:02.5597182Z     at NewEntryPointFileWriter.writeFile (/opt/ads-agent/_work/33/s/node_modules/@angular/compiler-cli/ngcc/src/writing/new_entry_point_file_writer.js:134:25)
2026-06-24T19:13:02.5597522Z     at /opt/ads-agent/_work/33/s/node_modules/@angular/compiler-cli/ngcc/src/writing/new_entry_point_file_writer.js:47:69
2026-06-24T19:13:02.5597758Z     at Array.forEach (<anonymous>)
2026-06-24T19:13:02.5598071Z     at NewEntryPointFileWriter.writeBundle (/opt/ads-agent/_work/33/s/node_modules/@angular/compiler-cli/ngcc/src/writing/new_entry_point_file_writer.js:47:30)
2026-06-24T19:13:02.5598413Z     at writeBundle (/opt/ads-agent/_work/33/s/node_modules/@angular/compiler-cli/ngcc/src/execution/create_compile_function.js:58:36)
2026-06-24T19:13:02.5598600Z     at processTicksAndRejections (node:internal/process/task_queues:96:5)
2026-06-24T19:13:02.5598922Z     at ClusterMaster.onWorkerMessage (/opt/ads-agent/_work/33/s/node_modules/@angular/compiler-cli/ngcc/src/execution/cluster/master.js:195:27)
2026-06-24T19:13:02.5599237Z     at /opt/ads-agent/_work/33/s/node_modules/@angular/compiler-cli/ngcc/src/execution/cluster/master.js:55:95
2026-06-24T19:13:02.5599588Z     at ClusterMaster.<anonymous> (/opt/ads-agent/_work/33/s/node_modules/@angular/compiler-cli/ngcc/src/execution/cluster/master.js:293:57)
2026-06-24T19:13:02.5599865Z     at step (/opt/ads-agent/_work/33/s/node_modules/tslib/tslib.js:195:27)
2026-06-24T19:13:02.5600200Z     at Object.next (/opt/ads-agent/_work/33/s/node_modules/tslib/tslib.js:176:57)
2026-06-24T19:13:02.5600470Z     at /opt/ads-agent/_work/33/s/node_modules/tslib/tslib.js:169:75
2026-06-24T19:13:02.5600596Z     at new Promise (<anonymous>)
2026-06-24T19:13:02.5600838Z     at Object.__awaiter (/opt/ads-agent/_work/33/s/node_modules/tslib/tslib.js:165:16)
2026-06-24T19:13:02.5601142Z     at EventEmitter.<anonymous> (/opt/ads-agent/_work/33/s/node_modules/@angular/compiler-cli/ngcc/src/execution/cluster/master.js:287:32)
2026-06-24T19:13:02.5601349Z     at EventEmitter.emit (node:events:520:28)
2026-06-24T19:13:02.5743051Z 24 06 2026 16:13:02.572:ERROR [karma-server]: UncaughtException: Error: NGCC failed.
2026-06-24T19:13:02.5743776Z     at NgccProcessor.process (/opt/ads-agent/_work/33/s/node_modules/@ngtools/webpack/src/ngcc_processor.js:139:19)
2026-06-24T19:13:02.5744021Z     at /opt/ads-agent/_work/33/s/node_modules/@ngtools/webpack/src/ivy/plugin.js:129:27
2026-06-24T19:13:02.5744346Z     at Hook.eval [as call] (eval at create (/opt/ads-agent/_work/33/s/node_modules/tapable/lib/HookCodeFactory.js:19:10), <anonymous>:20:1)
2026-06-24T19:13:02.5744688Z     at Hook.CALL_DELEGATE [as _call] (/opt/ads-agent/_work/33/s/node_modules/tapable/lib/Hook.js:14:14)
2026-06-24T19:13:02.5744973Z     at Compiler.newCompilation (/opt/ads-agent/_work/33/s/node_modules/webpack/lib/Compiler.js:1043:30)
2026-06-24T19:13:02.5745233Z     at /opt/ads-agent/_work/33/s/node_modules/webpack/lib/Compiler.js:1088:29
2026-06-24T19:13:02.5745560Z     at Hook.eval [as callAsync] (eval at create (/opt/ads-agent/_work/33/s/node_modules/tapable/lib/HookCodeFactory.js:33:10), <anonymous>:22:1)
2026-06-24T19:13:02.5745867Z     at Hook.CALL_ASYNC_DELEGATE [as _callAsync] (/opt/ads-agent/_work/33/s/node_modules/tapable/lib/Hook.js:18:14)
2026-06-24T19:13:02.5746121Z     at Compiler.compile (/opt/ads-agent/_work/33/s/node_modules/webpack/lib/Compiler.js:1083:28)
2026-06-24T19:13:02.5746374Z     at /opt/ads-agent/_work/33/s/node_modules/webpack/lib/Watching.js:200:19
2026-06-24T19:13:02.5746836Z 24 06 2026 16:13:02.573:ERROR [karma-server]: Error: NGCC failed.
2026-06-24T19:13:02.5747155Z     at NgccProcessor.process (/opt/ads-agent/_work/33/s/node_modules/@ngtools/webpack/src/ngcc_processor.js:139:19)
2026-06-24T19:13:02.6247332Z     at /opt/ads-agent/_work/33/s/node_modules/@ngtools/webpack/src/ivy/plugin.js:129:27
2026-06-24T19:13:02.6262429Z     at Hook.eval [as call] (eval at create (/opt/ads-agent/_work/33/s/node_modules/tapable/lib/HookCodeFactory.js:19:10), <anonymous>:20:1)
2026-06-24T19:13:02.6263255Z     at Hook.CALL_DELEGATE [as _call] (/opt/ads-agent/_work/33/s/node_modules/tapable/lib/Hook.js:14:14)
2026-06-24T19:13:02.6263658Z     at Compiler.newCompilation (/opt/ads-agent/_work/33/s/node_modules/webpack/lib/Compiler.js:1043:30)
2026-06-24T19:13:02.6263928Z     at /opt/ads-agent/_work/33/s/node_modules/webpack/lib/Compiler.js:1088:29
2026-06-24T19:13:02.6264274Z     at Hook.eval [as callAsync] (eval at create (/opt/ads-agent/_work/33/s/node_modules/tapable/lib/HookCodeFactory.js:33:10), <anonymous>:22:1)
2026-06-24T19:13:02.6264559Z     at Hook.CALL_ASYNC_DELEGATE [as _callAsync] (/opt/ads-agent/_work/33/s/node_modules/tapable/lib/Hook.js:18:14)
2026-06-24T19:13:02.6264975Z     at Compiler.compile (/opt/ads-agent/_work/33/s/node_modules/webpack/lib/Compiler.js:1083:28)
2026-06-24T19:13:02.6265236Z     at /opt/ads-agent/_work/33/s/node_modules/webpack/lib/Watching.js:200:19
2026-06-24T19:13:02.6265480Z (node:50853) MaxListenersExceededWarning: Possible EventEmitter memory leak detected. 11 run_complete listeners added to [Server]. Use emitter.setMaxListeners() to increase limit
2026-06-24T19:13:02.6265767Z (Use `node --trace-warnings ...` to show where the warning was created)
2026-06-24T19:13:02.7290798Z node:internal/errors:464
2026-06-24T19:13:02.7291024Z     ErrorCaptureStackTrace(err);
2026-06-24T19:13:02.7291616Z     ^
2026-06-24T19:13:02.7291700Z 
2026-06-24T19:13:02.7291879Z Error: write EPIPE
2026-06-24T19:13:02.7292092Z     at process.target._send (node:internal/child_process:866:20)
2026-06-24T19:13:02.7292412Z     at process.target.send (node:internal/child_process:739:19)
2026-06-24T19:13:02.7292911Z     at /opt/ads-agent/_work/33/s/node_modules/@angular/compiler-cli/ngcc/src/execution/cluster/utils.js:51:21
2026-06-24T19:13:02.7293092Z     at new Promise (<anonymous>)
2026-06-24T19:13:02.7293352Z     at Object.sendMessageToMaster (/opt/ads-agent/_work/33/s/node_modules/@angular/compiler-cli/ngcc/src/execution/cluster/utils.js:46:16)
2026-06-24T19:13:02.7293691Z     at /opt/ads-agent/_work/33/s/node_modules/@angular/compiler-cli/ngcc/src/execution/cluster/worker.js:104:66
2026-06-24T19:13:02.7294008Z     at step (/opt/ads-agent/_work/33/s/node_modules/tslib/tslib.js:195:27)
2026-06-24T19:13:02.7294500Z     at Object.throw (/opt/ads-agent/_work/33/s/node_modules/tslib/tslib.js:176:57)
2026-06-24T19:13:02.7294756Z     at rejected (/opt/ads-agent/_work/33/s/node_modules/tslib/tslib.js:167:69)
2026-06-24T19:13:02.7294956Z     at processTicksAndRejections (node:internal/process/task_queues:96:5) {
2026-06-24T19:13:02.7295085Z   errno: -32,
2026-06-24T19:13:02.7295275Z   code: 'EPIPE',
2026-06-24T19:13:02.7295438Z   syscall: 'write'
2026-06-24T19:13:02.7295560Z }
2026-06-24T19:13:02.8905163Z node:internal/errors:464
2026-06-24T19:13:02.8905382Z     ErrorCaptureStackTrace(err);
2026-06-24T19:13:02.8905630Z     ^
2026-06-24T19:13:02.8905693Z 
2026-06-24T19:13:02.8905933Z Error: write EPIPE
2026-06-24T19:13:02.8906085Z     at process.target._send (node:internal/child_process:866:20)
2026-06-24T19:13:02.8906283Z     at process.target.send (node:internal/child_process:739:19)
2026-06-24T19:13:02.8906768Z     at /opt/ads-agent/_work/33/s/node_modules/@angular/compiler-cli/ngcc/src/execution/cluster/utils.js:51:21
2026-06-24T19:13:02.8906962Z     at new Promise (<anonymous>)
2026-06-24T19:13:02.8907262Z     at Object.sendMessageToMaster (/opt/ads-agent/_work/33/s/node_modules/@angular/compiler-cli/ngcc/src/execution/cluster/utils.js:46:16)
2026-06-24T19:13:02.8907566Z     at /opt/ads-agent/_work/33/s/node_modules/@angular/compiler-cli/ngcc/src/execution/cluster/worker.js:104:66
2026-06-24T19:13:02.8907790Z     at step (/opt/ads-agent/_work/33/s/node_modules/tslib/tslib.js:195:27)
2026-06-24T19:13:02.8908178Z     at Object.throw (/opt/ads-agent/_work/33/s/node_modules/tslib/tslib.js:176:57)
2026-06-24T19:13:02.8908429Z     at rejected (/opt/ads-agent/_work/33/s/node_modules/tslib/tslib.js:167:69)
2026-06-24T19:13:02.8908931Z     at processTicksAndRejections (node:internal/process/task_queues:96:5) {
2026-06-24T19:13:02.8909093Z   errno: -32,
2026-06-24T19:13:02.8909252Z   code: 'EPIPE',
2026-06-24T19:13:02.8909378Z   syscall: 'write'
2026-06-24T19:13:02.8909518Z }
2026-06-24T19:13:02.9898526Z node:internal/errors:464
2026-06-24T19:13:02.9898747Z     ErrorCaptureStackTrace(err);
2026-06-24T19:13:02.9899038Z     ^
2026-06-24T19:13:02.9899079Z 
2026-06-24T19:13:02.9899577Z Error: write EPIPE
2026-06-24T19:13:02.9899724Z     at process.target._send (node:internal/child_process:866:20)
2026-06-24T19:13:02.9899926Z     at process.target.send (node:internal/child_process:739:19)
2026-06-24T19:13:02.9900447Z     at /opt/ads-agent/_work/33/s/node_modules/@angular/compiler-cli/ngcc/src/execution/cluster/utils.js:51:21
2026-06-24T19:13:02.9900642Z     at new Promise (<anonymous>)
2026-06-24T19:13:02.9901237Z     at Object.sendMessageToMaster (/opt/ads-agent/_work/33/s/node_modules/@angular/compiler-cli/ngcc/src/execution/cluster/utils.js:46:16)
2026-06-24T19:13:02.9901722Z     at /opt/ads-agent/_work/33/s/node_modules/@angular/compiler-cli/ngcc/src/execution/cluster/worker.js:104:66
2026-06-24T19:13:02.9902001Z     at step (/opt/ads-agent/_work/33/s/node_modules/tslib/tslib.js:195:27)
2026-06-24T19:13:02.9902508Z     at Object.throw (/opt/ads-agent/_work/33/s/node_modules/tslib/tslib.js:176:57)
2026-06-24T19:13:02.9903320Z     at rejected (/opt/ads-agent/_work/33/s/node_modules/tslib/tslib.js:167:69)
2026-06-24T19:13:02.9903536Z     at processTicksAndRejections (node:internal/process/task_queues:96:5) {
2026-06-24T19:13:02.9903712Z   errno: -32,
2026-06-24T19:13:02.9903872Z   code: 'EPIPE',
2026-06-24T19:13:02.9904002Z   syscall: 'write'
2026-06-24T19:13:02.9904126Z }
2026-06-24T19:13:03.0160495Z ##[error]Bash exited with code '1'.
2026-06-24T19:13:03.0170563Z ##[section]Finishing: Build Application
