2026-06-25T13:39:05.1056976Z ##[section]Starting: Build Application
2026-06-25T13:39:05.1061733Z ==============================================================================
2026-06-25T13:39:05.1061866Z Task         : Bash
2026-06-25T13:39:05.1061950Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-25T13:39:05.1062257Z Version      : 3.227.0
2026-06-25T13:39:05.1062330Z Author       : Microsoft Corporation
2026-06-25T13:39:05.1062450Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-25T13:39:05.1062547Z ==============================================================================
2026-06-25T13:39:05.2533847Z Generating script.
2026-06-25T13:39:05.2546083Z ========================== Starting Command Output ===========================
2026-06-25T13:39:05.2561234Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/563b5ffc-756f-4375-ace2-ddb649f1aad6.sh
2026-06-25T13:39:05.2612959Z ng build --configuration production --output-path=dist && npm test
2026-06-25T13:39:05.2617623Z <----ANGULAR---->
2026-06-25T13:39:05.8596432Z 
2026-06-25T13:39:05.8597149Z      _                      _                 ____ _     ___
2026-06-25T13:39:05.8597940Z     / \   _ __   __ _ _   _| | __ _ _ __     / ___| |   |_ _|
2026-06-25T13:39:05.8598572Z    / △ \ | '_ \ / _` | | | | |/ _` | '__|   | |   | |    | |
2026-06-25T13:39:05.8598822Z   / ___ \| | | | (_| | |_| | | (_| | |      | |___| |___ | |
2026-06-25T13:39:05.8599030Z  /_/   \_\_| |_|\__, |\__,_|_|\__,_|_|       \____|_____|___|
2026-06-25T13:39:05.8599245Z                 |___/
2026-06-25T13:39:05.8599451Z     
2026-06-25T13:39:05.8599531Z 
2026-06-25T13:39:05.8599693Z Angular CLI: 8.3.29
2026-06-25T13:39:05.8599877Z Node: 12.18.3
2026-06-25T13:39:05.8600045Z OS: linux x64
2026-06-25T13:39:05.8600222Z Angular: 8.2.14
2026-06-25T13:39:05.8603178Z ... animations, common, compiler, compiler-cli, core, forms
2026-06-25T13:39:05.8605651Z ... language-service, platform-browser, platform-browser-dynamic
2026-06-25T13:39:05.8605950Z ... router, service-worker
2026-06-25T13:39:05.8606078Z 
2026-06-25T13:39:05.8606614Z Package                            Version
2026-06-25T13:39:05.8607277Z ------------------------------------------------------------
2026-06-25T13:39:05.8607574Z @angular-devkit/architect          0.803.29
2026-06-25T13:39:05.8607926Z @angular-devkit/build-angular      0.803.29
2026-06-25T13:39:05.8608180Z @angular-devkit/build-optimizer    0.803.29
2026-06-25T13:39:05.8608422Z @angular-devkit/build-webpack      0.803.29
2026-06-25T13:39:05.8608683Z @angular-devkit/core               8.3.29
2026-06-25T13:39:05.8608917Z @angular-devkit/schematics         8.3.29
2026-06-25T13:39:05.8624421Z @angular/cdk                       8.2.3
2026-06-25T13:39:05.8624728Z @angular/cli                       8.3.29
2026-06-25T13:39:05.8624921Z @angular/material                  8.2.3
2026-06-25T13:39:05.8625309Z @angular/material-moment-adapter   8.2.3
2026-06-25T13:39:05.8625501Z @ngtools/webpack                   8.3.29
2026-06-25T13:39:05.8625691Z @schematics/angular                8.3.29
2026-06-25T13:39:05.8625899Z @schematics/update                 0.803.29
2026-06-25T13:39:05.8626082Z rxjs                               6.6.7
2026-06-25T13:39:05.8626271Z typescript                         3.5.3
2026-06-25T13:39:05.8626457Z webpack                            4.39.2
2026-06-25T13:39:05.8626596Z     
2026-06-25T13:39:06.8272761Z Your global Angular CLI version (12.2.16) is greater than your local version (8.3.29). The local Angular CLI version is used.
2026-06-25T13:39:06.8273336Z 
2026-06-25T13:39:06.8274055Z To disable this warning use "ng config -g cli.warnings.versionMismatch false".
2026-06-25T13:39:33.2963274Z Generating ES5 bundles for differential loading...
2026-06-25T13:40:00.2685509Z ES5 bundle generation complete.
2026-06-25T13:40:00.2901367Z 
2026-06-25T13:40:00.2902563Z chunk {3} 3-es2015.4de2ec73d28580c01aa0.js () 47.3 kB  [rendered]
2026-06-25T13:40:00.2903115Z chunk {3} 3-es5.4de2ec73d28580c01aa0.js () 58.8 kB  [rendered]
2026-06-25T13:40:00.2933331Z chunk {1} 1-es2015.0f130a29fb4d3981249f.js () 29.1 kB  [rendered]
2026-06-25T13:40:00.2933680Z chunk {1} 1-es5.0f130a29fb4d3981249f.js () 35.8 kB  [rendered]
2026-06-25T13:40:00.2933983Z chunk {0} 0-es2015.279ce6a023b426e947c3.js () 12.6 kB  [rendered]
2026-06-25T13:40:00.2934455Z chunk {0} 0-es5.279ce6a023b426e947c3.js () 15.9 kB  [rendered]
2026-06-25T13:40:00.2934815Z chunk {5} 5-es2015.9291a5f343fce4b555dc.js () 29.1 kB  [rendered]
2026-06-25T13:40:00.2979672Z chunk {5} 5-es5.9291a5f343fce4b555dc.js () 38.9 kB  [rendered]
2026-06-25T13:40:00.2980107Z chunk {6} 6-es2015.ec57fc37b45c65cfeaa2.js () 12.5 kB  [rendered]
2026-06-25T13:40:00.2980433Z chunk {6} 6-es5.ec57fc37b45c65cfeaa2.js () 11.7 kB  [rendered]
2026-06-25T13:40:00.2980976Z chunk {7} 7-es2015.16e522a29f6f1dfedb96.js () 18.4 kB  [rendered]
2026-06-25T13:40:00.2981625Z chunk {7} 7-es5.16e522a29f6f1dfedb96.js () 18.4 kB  [rendered]
2026-06-25T13:40:00.2981941Z chunk {11} 11-es2015.aaecb33a323d3f1f31d4.js () 204 kB  [rendered]
2026-06-25T13:40:00.2982364Z chunk {11} 11-es5.aaecb33a323d3f1f31d4.js () 227 kB  [rendered]
2026-06-25T13:40:00.2982769Z chunk {4} 4-es2015.2d7d15db4f44041d037c.js () 137 kB  [rendered]
2026-06-25T13:40:00.2983812Z chunk {4} 4-es5.2d7d15db4f44041d037c.js () 167 kB  [rendered]
2026-06-25T13:40:00.2984151Z chunk {36} 36-es2015.541266a0f3b1ec5b98c0.js () 8.8 kB  [rendered]
2026-06-25T13:40:00.2984421Z chunk {36} 36-es5.541266a0f3b1ec5b98c0.js () 14.5 kB  [rendered]
2026-06-25T13:40:00.2990168Z chunk {37} 37-es2015.5d2406c9207b3f727a10.js () 7.85 kB  [rendered]
2026-06-25T13:40:00.2990565Z chunk {37} 37-es5.5d2406c9207b3f727a10.js () 9.22 kB  [rendered]
2026-06-25T13:40:00.2990979Z chunk {runtime} runtime-es2015.fe58a358724f89f7a8d3.js (runtime) 10 kB [entry] [rendered]
2026-06-25T13:40:00.2991371Z chunk {runtime} runtime-es5.fe58a358724f89f7a8d3.js (runtime) 10 kB [entry] [rendered]
2026-06-25T13:40:00.2991747Z chunk {10} 10-es2015.68ed31956d056957fecb.js () 295 kB  [rendered]
2026-06-25T13:40:00.2992380Z chunk {10} 10-es5.68ed31956d056957fecb.js () 333 kB  [rendered]
2026-06-25T13:40:00.2992705Z chunk {14} 14-es2015.22db436e1ab36e4b094f.js () 139 kB  [rendered]
2026-06-25T13:40:00.2993006Z chunk {14} 14-es5.22db436e1ab36e4b094f.js () 161 kB  [rendered]
2026-06-25T13:40:00.2993327Z chunk {13} 13-es2015.f3f7f2cfb2e697644f8c.js () 197 kB  [rendered]
2026-06-25T13:40:00.2993654Z chunk {13} 13-es5.f3f7f2cfb2e697644f8c.js () 214 kB  [rendered]
2026-06-25T13:40:00.2993957Z chunk {2} 2-es2015.07d484996b1563601f45.js () 161 kB  [rendered]
2026-06-25T13:40:00.2994252Z chunk {2} 2-es5.07d484996b1563601f45.js () 185 kB  [rendered]
2026-06-25T13:40:00.2994553Z chunk {17} 17-es2015.21aa1b99505b9519227a.js () 113 kB  [rendered]
2026-06-25T13:40:00.2994826Z chunk {17} 17-es5.21aa1b99505b9519227a.js () 133 kB  [rendered]
2026-06-25T13:40:00.2995111Z chunk {12} 12-es2015.1a40e02c63bd1fec119b.js () 351 kB  [rendered]
2026-06-25T13:40:00.2995386Z chunk {12} 12-es5.1a40e02c63bd1fec119b.js () 396 kB  [rendered]
2026-06-25T13:40:00.2996250Z chunk {20} 20-es2015.1eff6dcaa70f96264ed1.js () 56.7 kB  [rendered]
2026-06-25T13:40:00.2996595Z chunk {20} 20-es5.1eff6dcaa70f96264ed1.js () 63.2 kB  [rendered]
2026-06-25T13:40:00.2996979Z chunk {16} 16-es2015.b1dbde4dadd0f29f4cc6.js () 109 kB  [rendered]
2026-06-25T13:40:00.2997399Z chunk {16} 16-es5.b1dbde4dadd0f29f4cc6.js () 129 kB  [rendered]
2026-06-25T13:40:00.2997936Z chunk {15} 15-es2015.78ea6bb76ec59f850365.js () 151 kB  [rendered]
2026-06-25T13:40:00.2998387Z chunk {15} 15-es5.78ea6bb76ec59f850365.js () 177 kB  [rendered]
2026-06-25T13:40:00.2998952Z chunk {19} 19-es2015.27e2e6042c8cc5847e0b.js () 131 kB  [rendered]
2026-06-25T13:40:00.2999381Z chunk {19} 19-es5.27e2e6042c8cc5847e0b.js () 145 kB  [rendered]
2026-06-25T13:40:00.2999843Z chunk {21} 21-es2015.f12058654f7b34132caf.js () 77.3 kB  [rendered]
2026-06-25T13:40:00.3000253Z chunk {21} 21-es5.f12058654f7b34132caf.js () 92.8 kB  [rendered]
2026-06-25T13:40:00.3000602Z chunk {22} 22-es2015.f2cd006489e4933826ad.js () 89.1 kB  [rendered]
2026-06-25T13:40:00.3001113Z chunk {22} 22-es5.f2cd006489e4933826ad.js () 106 kB  [rendered]
2026-06-25T13:40:00.3001470Z chunk {23} 23-es2015.b67549a5207fbe13aa57.js () 73.4 kB  [rendered]
2026-06-25T13:40:00.3001745Z chunk {23} 23-es5.b67549a5207fbe13aa57.js () 83.1 kB  [rendered]
2026-06-25T13:40:00.3002240Z chunk {9} 9-es2015.a901c9a9eac83bfb6988.js () 467 kB  [rendered]
2026-06-25T13:40:00.3002581Z chunk {9} 9-es5.a901c9a9eac83bfb6988.js () 537 kB  [rendered]
2026-06-25T13:40:00.3002881Z chunk {25} 25-es2015.d74e86df83697154aaa2.js () 65.7 kB  [rendered]
2026-06-25T13:40:00.3003184Z chunk {25} 25-es5.d74e86df83697154aaa2.js () 73.6 kB  [rendered]
2026-06-25T13:40:00.3003522Z chunk {24} 24-es2015.f6871535c8e0ea1006c7.js () 61.3 kB  [rendered]
2026-06-25T13:40:00.3003803Z chunk {24} 24-es5.f6871535c8e0ea1006c7.js () 75.1 kB  [rendered]
2026-06-25T13:40:00.3004123Z chunk {18} 18-es2015.d2ae0d781f413d312127.js () 212 kB  [rendered]
2026-06-25T13:40:00.3004421Z chunk {18} 18-es5.d2ae0d781f413d312127.js () 238 kB  [rendered]
2026-06-25T13:40:00.3009265Z chunk {31} 31-es2015.9799be245336b5809053.js () 61.8 kB  [rendered]
2026-06-25T13:40:00.3010164Z chunk {31} 31-es5.9799be245336b5809053.js () 67.8 kB  [rendered]
2026-06-25T13:40:00.3010440Z chunk {26} 26-es2015.fd67cf68d6409b561baf.js () 135 kB  [rendered]
2026-06-25T13:40:00.3010669Z chunk {26} 26-es5.fd67cf68d6409b561baf.js () 158 kB  [rendered]
2026-06-25T13:40:00.3010885Z chunk {29} 29-es2015.4853969f866eb675b174.js () 67 kB  [rendered]
2026-06-25T13:40:00.3011119Z chunk {29} 29-es5.4853969f866eb675b174.js () 79.9 kB  [rendered]
2026-06-25T13:40:00.3011317Z chunk {27} 27-es2015.b1af8f581bd38a9bcdc1.js () 110 kB  [rendered]
2026-06-25T13:40:00.3011676Z chunk {27} 27-es5.b1af8f581bd38a9bcdc1.js () 124 kB  [rendered]
2026-06-25T13:40:00.3011890Z chunk {30} 30-es2015.5d3a4d86f32f4d926e82.js () 56.2 kB  [rendered]
2026-06-25T13:40:00.3012292Z chunk {30} 30-es5.5d3a4d86f32f4d926e82.js () 64.4 kB  [rendered]
2026-06-25T13:40:00.3012522Z chunk {33} 33-es2015.34036ce683073c92421a.js () 54.4 kB  [rendered]
2026-06-25T13:40:00.3012741Z chunk {33} 33-es5.34036ce683073c92421a.js () 63.7 kB  [rendered]
2026-06-25T13:40:00.3012958Z chunk {35} 35-es2015.faf8209a1d5e22c9ec3a.js () 40.8 kB  [rendered]
2026-06-25T13:40:00.3013156Z chunk {35} 35-es5.faf8209a1d5e22c9ec3a.js () 48.8 kB  [rendered]
2026-06-25T13:40:00.3013373Z chunk {28} 28-es2015.72e3172e7cb0529d0456.js () 80.7 kB  [rendered]
2026-06-25T13:40:00.3013584Z chunk {28} 28-es5.72e3172e7cb0529d0456.js () 96.4 kB  [rendered]
2026-06-25T13:40:00.3013827Z chunk {34} 34-es2015.219a05bbaa32cf977087.js () 50.3 kB  [rendered]
2026-06-25T13:40:00.3014042Z chunk {34} 34-es5.219a05bbaa32cf977087.js () 59.2 kB  [rendered]
2026-06-25T13:40:00.3014251Z chunk {32} 32-es2015.d4800a7f5c1e280c35b0.js () 45.3 kB  [rendered]
2026-06-25T13:40:00.3014441Z chunk {32} 32-es5.d4800a7f5c1e280c35b0.js () 54.8 kB  [rendered]
2026-06-25T13:40:00.3014660Z chunk {common} common-es2015.9e3efc6c5880ed73f9de.js (common) 34.2 kB  [rendered]
2026-06-25T13:40:00.3014889Z chunk {common} common-es5.9e3efc6c5880ed73f9de.js (common) 43.1 kB  [rendered]
2026-06-25T13:40:00.3015139Z chunk {polyfills} polyfills-es2015.973f4178ad746fb054dd.js (polyfills) 763 kB [initial] [rendered]
2026-06-25T13:40:00.3015367Z chunk {8} 8-es2015.c0b19e22f771ba938b5c.js () 1.54 MB  [rendered]
2026-06-25T13:40:00.3015578Z chunk {8} 8-es5.c0b19e22f771ba938b5c.js () 1.72 MB  [rendered]
2026-06-25T13:40:00.3015827Z chunk {polyfills-es5} polyfills-es5.32284998b8679988cc04.js (polyfills-es5) 1.29 MB [initial] [rendered]
2026-06-25T13:40:00.3016060Z chunk {main} main-es2015.c3a05eddbf72bfcf6311.js (main) 12.5 MB [initial] [rendered]
2026-06-25T13:40:00.3016302Z chunk {main} main-es5.c3a05eddbf72bfcf6311.js (main) 14.4 MB [initial] [rendered]
2026-06-25T13:40:00.3016469Z chunk {scripts} scripts.ad4edd1fdc8de50d3898.js (scripts) 2.41 MB [entry] [rendered]
2026-06-25T13:40:00.3016637Z chunk {styles} styles.2d07a9d795315c215e02.css (styles) 1020 kB [initial] [rendered]
2026-06-25T13:40:00.3016906Z Date: 2026-06-25T13:40:00.288Z - Hash: a7d83e2a4a58118bde0a - Time: 51872ms
2026-06-25T13:40:00.6056131Z 
2026-06-25T13:40:00.6056834Z > sinep-app-web@1.0.0-snapshot test /opt/ads-agent/_work/11105/s
2026-06-25T13:40:00.6056977Z > ng test
2026-06-25T13:40:00.6057244Z 
2026-06-25T13:40:02.7215370Z [33m25 06 2026 10:40:02.719:WARN [karma-server]: [39mPassing raw CLI options to `new Server(config, done)` is deprecated. Use `parseConfig(configFilePath, cliOptions, {promiseConfig: true, throwErrors: true})` to prepare a processed `Config` instance and pass that as the `config` argument instead.
2026-06-25T13:40:02.7220911Z [91m25 06 2026 10:40:02.721:ERROR [config]: [39mError in config file!
2026-06-25T13:40:02.7221247Z   /opt/ads-agent/_work/11105/s/karma.conf.js:75
2026-06-25T13:40:02.7221562Z       echo "Instalando karma-chrome-launcher..."
2026-06-25T13:40:02.7223091Z            ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
2026-06-25T13:40:02.7224556Z 
2026-06-25T13:40:02.7225436Z SyntaxError: Unexpected string
2026-06-25T13:40:02.7225877Z     at compileFunction (<anonymous>)
2026-06-25T13:40:02.7226275Z     at wrapSafe (internal/modules/cjs/loader.js:1053:16)
2026-06-25T13:40:02.7226757Z     at Module._compile (internal/modules/cjs/loader.js:1101:27)
2026-06-25T13:40:02.7227851Z     at Object.Module._extensions..js (internal/modules/cjs/loader.js:1157:10)
2026-06-25T13:40:02.7228609Z     at Module.load (internal/modules/cjs/loader.js:985:32)
2026-06-25T13:40:02.7229205Z     at Function.Module._load (internal/modules/cjs/loader.js:878:14)
2026-06-25T13:40:02.7229591Z     at Module.require (internal/modules/cjs/loader.js:1025:19)
2026-06-25T13:40:02.7230013Z     at require (internal/modules/cjs/helpers.js:72:18)
2026-06-25T13:40:02.7230673Z     at Object.parseConfig (/opt/ads-agent/_work/11105/s/node_modules/karma/lib/config.js:434:22)
2026-06-25T13:40:02.7231152Z     at new Server (/opt/ads-agent/_work/11105/s/node_modules/karma/lib/server.js:81:22)
2026-06-25T13:40:02.7231563Z     at Observable._subscribe (/opt/ads-agent/_work/11105/s/node_modules/@angular-devkit/build-angular/src/karma/index.js:100:29)
2026-06-25T13:40:02.7232279Z     at Observable._trySubscribe (/opt/ads-agent/_work/11105/s/node_modules/@angular-devkit/build-angular/node_modules/rxjs/internal/Observable.js:44:25)
2026-06-25T13:40:02.7232821Z     at Observable.subscribe (/opt/ads-agent/_work/11105/s/node_modules/@angular-devkit/build-angular/node_modules/rxjs/internal/Observable.js:30:22)
2026-06-25T13:40:02.7233307Z     at /opt/ads-agent/_work/11105/s/node_modules/@angular-devkit/build-angular/node_modules/rxjs/internal/util/subscribeTo.js:22:31
2026-06-25T13:40:02.7233857Z     at Object.subscribeToResult (/opt/ads-agent/_work/11105/s/node_modules/@angular-devkit/build-angular/node_modules/rxjs/internal/util/subscribeToResult.js:10:45)
2026-06-25T13:40:02.7234394Z     at SwitchMapSubscriber._innerSub (/opt/ads-agent/_work/11105/s/node_modules/@angular-devkit/build-angular/node_modules/rxjs/internal/operators/switchMap.js:65:54)
2026-06-25T13:40:02.7444347Z npm ERR! Test failed.  See above for more details.
2026-06-25T13:40:02.7553869Z ##[error]Bash exited with code '1'.
2026-06-25T13:40:02.7586432Z ##[section]Finishing: Build Application
