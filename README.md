2026-06-25T12:52:13.5324938Z ##[section]Starting: Build Application
2026-06-25T12:52:13.5328961Z ==============================================================================
2026-06-25T12:52:13.5329048Z Task         : Bash
2026-06-25T12:52:13.5329127Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-25T12:52:13.5329191Z Version      : 3.227.0
2026-06-25T12:52:13.5329236Z Author       : Microsoft Corporation
2026-06-25T12:52:13.5329325Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-25T12:52:13.5329396Z ==============================================================================
2026-06-25T12:52:13.6973267Z Generating script.
2026-06-25T12:52:13.6986480Z ========================== Starting Command Output ===========================
2026-06-25T12:52:13.6993562Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/66d6311d-b189-449c-870c-786188eac209.sh
2026-06-25T12:52:13.7048548Z ng build --configuration production --output-path=dist && npm test
2026-06-25T12:52:13.7048871Z <----ANGULAR---->
2026-06-25T12:52:14.1902700Z 
2026-06-25T12:52:14.1903429Z      _                      _                 ____ _     ___
2026-06-25T12:52:14.1903897Z     / \   _ __   __ _ _   _| | __ _ _ __     / ___| |   |_ _|
2026-06-25T12:52:14.1904433Z    / △ \ | '_ \ / _` | | | | |/ _` | '__|   | |   | |    | |
2026-06-25T12:52:14.1904557Z   / ___ \| | | | (_| | |_| | | (_| | |      | |___| |___ | |
2026-06-25T12:52:14.1904917Z  /_/   \_\_| |_|\__, |\__,_|_|\__,_|_|       \____|_____|___|
2026-06-25T12:52:14.1905076Z                 |___/
2026-06-25T12:52:14.1905596Z     
2026-06-25T12:52:14.1905639Z 
2026-06-25T12:52:14.1905765Z Angular CLI: 8.3.29
2026-06-25T12:52:14.1905905Z Node: 14.18.2
2026-06-25T12:52:14.1906083Z OS: linux x64
2026-06-25T12:52:14.1906172Z Angular: 8.2.14
2026-06-25T12:52:14.1906392Z ... animations, common, compiler, compiler-cli, core, forms
2026-06-25T12:52:14.1906668Z ... language-service, platform-browser, platform-browser-dynamic
2026-06-25T12:52:14.1906867Z ... router, service-worker
2026-06-25T12:52:14.1906930Z 
2026-06-25T12:52:14.1907060Z Package                            Version
2026-06-25T12:52:14.1907271Z ------------------------------------------------------------
2026-06-25T12:52:14.1907498Z @angular-devkit/architect          0.803.29
2026-06-25T12:52:14.1907661Z @angular-devkit/build-angular      0.803.29
2026-06-25T12:52:14.1907874Z @angular-devkit/build-optimizer    0.803.29
2026-06-25T12:52:14.1908092Z @angular-devkit/build-webpack      0.803.29
2026-06-25T12:52:14.1908286Z @angular-devkit/core               8.3.29
2026-06-25T12:52:14.1908474Z @angular-devkit/schematics         8.3.29
2026-06-25T12:52:14.1908586Z @angular/cdk                       8.2.3
2026-06-25T12:52:14.1908729Z @angular/cli                       8.3.29
2026-06-25T12:52:14.1908863Z @angular/material                  8.2.3
2026-06-25T12:52:14.1909050Z @angular/material-moment-adapter   8.2.3
2026-06-25T12:52:14.1909196Z @ngtools/webpack                   8.3.29
2026-06-25T12:52:14.1909300Z @schematics/angular                8.3.29
2026-06-25T12:52:14.1909461Z @schematics/update                 0.803.29
2026-06-25T12:52:14.1909622Z rxjs                               6.6.7
2026-06-25T12:52:14.1909754Z typescript                         3.5.3
2026-06-25T12:52:14.1909886Z webpack                            4.39.2
2026-06-25T12:52:14.1909973Z     
2026-06-25T12:52:16.1806927Z Browserslist: caniuse-lite is outdated. Please run the following command: `npx browserslist --update-db`
2026-06-25T12:52:41.7471896Z Generating ES5 bundles for differential loading...
2026-06-25T12:52:41.9201729Z ES5 bundle generation complete.
2026-06-25T12:52:41.9214148Z 
2026-06-25T12:52:41.9215158Z chunk {polyfills} polyfills-es2015.973f4178ad746fb054dd.js (polyfills) 763 kB [initial] [rendered]
2026-06-25T12:52:41.9215574Z chunk {polyfills-es5} polyfills-es5.32284998b8679988cc04.js (polyfills-es5) 1.29 MB [initial] [rendered]
2026-06-25T12:52:41.9215964Z chunk {2} 2-es2015.07d484996b1563601f45.js () 161 kB  [rendered]
2026-06-25T12:52:41.9216833Z chunk {2} 2-es5.07d484996b1563601f45.js () 185 kB  [rendered]
2026-06-25T12:52:41.9217276Z chunk {4} 4-es2015.2d7d15db4f44041d037c.js () 137 kB  [rendered]
2026-06-25T12:52:41.9217527Z chunk {4} 4-es5.2d7d15db4f44041d037c.js () 166 kB  [rendered]
2026-06-25T12:52:41.9217772Z chunk {0} 0-es2015.279ce6a023b426e947c3.js () 12.6 kB  [rendered]
2026-06-25T12:52:41.9218016Z chunk {0} 0-es5.279ce6a023b426e947c3.js () 15.8 kB  [rendered]
2026-06-25T12:52:41.9218214Z chunk {5} 5-es2015.9291a5f343fce4b555dc.js () 29.1 kB  [rendered]
2026-06-25T12:52:41.9218467Z chunk {5} 5-es5.9291a5f343fce4b555dc.js () 38.9 kB  [rendered]
2026-06-25T12:52:41.9218725Z chunk {1} 1-es2015.0f130a29fb4d3981249f.js () 29.1 kB  [rendered]
2026-06-25T12:52:41.9218963Z chunk {1} 1-es5.0f130a29fb4d3981249f.js () 35.8 kB  [rendered]
2026-06-25T12:52:41.9219210Z chunk {3} 3-es2015.4de2ec73d28580c01aa0.js () 47.3 kB  [rendered]
2026-06-25T12:52:41.9219401Z chunk {3} 3-es5.4de2ec73d28580c01aa0.js () 58.8 kB  [rendered]
2026-06-25T12:52:41.9219671Z chunk {6} 6-es2015.ec57fc37b45c65cfeaa2.js () 12.5 kB  [rendered]
2026-06-25T12:52:41.9219908Z chunk {6} 6-es5.ec57fc37b45c65cfeaa2.js () 11.7 kB  [rendered]
2026-06-25T12:52:41.9220149Z chunk {7} 7-es2015.16e522a29f6f1dfedb96.js () 18.4 kB  [rendered]
2026-06-25T12:52:41.9220390Z chunk {7} 7-es5.16e522a29f6f1dfedb96.js () 18.4 kB  [rendered]
2026-06-25T12:52:41.9220620Z chunk {8} 8-es2015.c0b19e22f771ba938b5c.js () 1.54 MB  [rendered]
2026-06-25T12:52:41.9220812Z chunk {8} 8-es5.c0b19e22f771ba938b5c.js () 1.71 MB  [rendered]
2026-06-25T12:52:41.9221205Z chunk {11} 11-es2015.aaecb33a323d3f1f31d4.js () 204 kB  [rendered]
2026-06-25T12:52:41.9221449Z chunk {11} 11-es5.aaecb33a323d3f1f31d4.js () 227 kB  [rendered]
2026-06-25T12:52:41.9221695Z chunk {9} 9-es2015.a901c9a9eac83bfb6988.js () 466 kB  [rendered]
2026-06-25T12:52:41.9221946Z chunk {9} 9-es5.a901c9a9eac83bfb6988.js () 537 kB  [rendered]
2026-06-25T12:52:41.9222148Z chunk {12} 12-es2015.1a40e02c63bd1fec119b.js () 350 kB  [rendered]
2026-06-25T12:52:41.9222394Z chunk {12} 12-es5.1a40e02c63bd1fec119b.js () 396 kB  [rendered]
2026-06-25T12:52:41.9222640Z chunk {13} 13-es2015.f3f7f2cfb2e697644f8c.js () 197 kB  [rendered]
2026-06-25T12:52:41.9222884Z chunk {13} 13-es5.f3f7f2cfb2e697644f8c.js () 214 kB  [rendered]
2026-06-25T12:52:41.9223137Z chunk {10} 10-es2015.68ed31956d056957fecb.js () 295 kB  [rendered]
2026-06-25T12:52:41.9223376Z chunk {10} 10-es5.68ed31956d056957fecb.js () 332 kB  [rendered]
2026-06-25T12:52:41.9223577Z chunk {15} 15-es2015.78ea6bb76ec59f850365.js () 151 kB  [rendered]
2026-06-25T12:52:41.9223815Z chunk {15} 15-es5.78ea6bb76ec59f850365.js () 177 kB  [rendered]
2026-06-25T12:52:41.9224056Z chunk {17} 17-es2015.21aa1b99505b9519227a.js () 113 kB  [rendered]
2026-06-25T12:52:41.9224317Z chunk {17} 17-es5.21aa1b99505b9519227a.js () 133 kB  [rendered]
2026-06-25T12:52:41.9224566Z chunk {16} 16-es2015.b1dbde4dadd0f29f4cc6.js () 109 kB  [rendered]
2026-06-25T12:52:41.9225132Z chunk {16} 16-es5.b1dbde4dadd0f29f4cc6.js () 129 kB  [rendered]
2026-06-25T12:52:41.9225348Z chunk {19} 19-es2015.27e2e6042c8cc5847e0b.js () 131 kB  [rendered]
2026-06-25T12:52:41.9225600Z chunk {19} 19-es5.27e2e6042c8cc5847e0b.js () 145 kB  [rendered]
2026-06-25T12:52:41.9225878Z chunk {14} 14-es2015.22db436e1ab36e4b094f.js () 139 kB  [rendered]
2026-06-25T12:52:41.9226174Z chunk {14} 14-es5.22db436e1ab36e4b094f.js () 160 kB  [rendered]
2026-06-25T12:52:41.9226537Z chunk {20} 20-es2015.1eff6dcaa70f96264ed1.js () 56.7 kB  [rendered]
2026-06-25T12:52:41.9226831Z chunk {20} 20-es5.1eff6dcaa70f96264ed1.js () 63.2 kB  [rendered]
2026-06-25T12:52:41.9227166Z chunk {18} 18-es2015.d2ae0d781f413d312127.js () 212 kB  [rendered]
2026-06-25T12:52:41.9227567Z chunk {18} 18-es5.d2ae0d781f413d312127.js () 238 kB  [rendered]
2026-06-25T12:52:41.9227933Z chunk {21} 21-es2015.f12058654f7b34132caf.js () 77.3 kB  [rendered]
2026-06-25T12:52:41.9228311Z chunk {21} 21-es5.f12058654f7b34132caf.js () 92.8 kB  [rendered]
2026-06-25T12:52:41.9228694Z chunk {22} 22-es2015.f2cd006489e4933826ad.js () 89.1 kB  [rendered]
2026-06-25T12:52:41.9229148Z chunk {22} 22-es5.f2cd006489e4933826ad.js () 106 kB  [rendered]
2026-06-25T12:52:41.9229504Z chunk {23} 23-es2015.b67549a5207fbe13aa57.js () 73.3 kB  [rendered]
2026-06-25T12:52:41.9229869Z chunk {23} 23-es5.b67549a5207fbe13aa57.js () 83 kB  [rendered]
2026-06-25T12:52:41.9230235Z chunk {24} 24-es2015.f6871535c8e0ea1006c7.js () 61.3 kB  [rendered]
2026-06-25T12:52:41.9230592Z chunk {24} 24-es5.f6871535c8e0ea1006c7.js () 75.1 kB  [rendered]
2026-06-25T12:52:41.9230931Z chunk {25} 25-es2015.d74e86df83697154aaa2.js () 65.7 kB  [rendered]
2026-06-25T12:52:41.9231382Z chunk {25} 25-es5.d74e86df83697154aaa2.js () 73.5 kB  [rendered]
2026-06-25T12:52:41.9231763Z chunk {27} 27-es2015.b1af8f581bd38a9bcdc1.js () 110 kB  [rendered]
2026-06-25T12:52:41.9232153Z chunk {27} 27-es5.b1af8f581bd38a9bcdc1.js () 123 kB  [rendered]
2026-06-25T12:52:41.9232548Z chunk {28} 28-es2015.72e3172e7cb0529d0456.js () 80.6 kB  [rendered]
2026-06-25T12:52:41.9232928Z chunk {28} 28-es5.72e3172e7cb0529d0456.js () 96.4 kB  [rendered]
2026-06-25T12:52:41.9233266Z chunk {29} 29-es2015.4853969f866eb675b174.js () 66.9 kB  [rendered]
2026-06-25T12:52:41.9233626Z chunk {29} 29-es5.4853969f866eb675b174.js () 79.8 kB  [rendered]
2026-06-25T12:52:41.9234000Z chunk {26} 26-es2015.fd67cf68d6409b561baf.js () 135 kB  [rendered]
2026-06-25T12:52:41.9234370Z chunk {26} 26-es5.fd67cf68d6409b561baf.js () 157 kB  [rendered]
2026-06-25T12:52:41.9234875Z chunk {30} 30-es2015.5d3a4d86f32f4d926e82.js () 56.2 kB  [rendered]
2026-06-25T12:52:41.9235282Z chunk {30} 30-es5.5d3a4d86f32f4d926e82.js () 64.4 kB  [rendered]
2026-06-25T12:52:41.9235737Z chunk {32} 32-es2015.d4800a7f5c1e280c35b0.js () 45.2 kB  [rendered]
2026-06-25T12:52:41.9236115Z chunk {32} 32-es5.d4800a7f5c1e280c35b0.js () 54.7 kB  [rendered]
2026-06-25T12:52:41.9236484Z chunk {33} 33-es2015.34036ce683073c92421a.js () 54.4 kB  [rendered]
2026-06-25T12:52:41.9236853Z chunk {33} 33-es5.34036ce683073c92421a.js () 63.7 kB  [rendered]
2026-06-25T12:52:41.9237207Z chunk {31} 31-es2015.9799be245336b5809053.js () 61.8 kB  [rendered]
2026-06-25T12:52:41.9237518Z chunk {31} 31-es5.9799be245336b5809053.js () 67.8 kB  [rendered]
2026-06-25T12:52:41.9237887Z chunk {34} 34-es2015.219a05bbaa32cf977087.js () 50.2 kB  [rendered]
2026-06-25T12:52:41.9238271Z chunk {34} 34-es5.219a05bbaa32cf977087.js () 59.2 kB  [rendered]
2026-06-25T12:52:41.9238709Z chunk {36} 36-es2015.541266a0f3b1ec5b98c0.js () 8.8 kB  [rendered]
2026-06-25T12:52:41.9239082Z chunk {36} 36-es5.541266a0f3b1ec5b98c0.js () 14.5 kB  [rendered]
2026-06-25T12:52:41.9239470Z chunk {37} 37-es2015.5d2406c9207b3f727a10.js () 7.85 kB  [rendered]
2026-06-25T12:52:41.9239795Z chunk {37} 37-es5.5d2406c9207b3f727a10.js () 9.22 kB  [rendered]
2026-06-25T12:52:41.9240216Z chunk {common} common-es2015.9e3efc6c5880ed73f9de.js (common) 34.2 kB  [rendered]
2026-06-25T12:52:41.9240617Z chunk {common} common-es5.9e3efc6c5880ed73f9de.js (common) 43.1 kB  [rendered]
2026-06-25T12:52:41.9241096Z chunk {main} main-es2015.c3a05eddbf72bfcf6311.js (main) 12.4 MB [initial] [rendered]
2026-06-25T12:52:41.9241528Z chunk {main} main-es5.c3a05eddbf72bfcf6311.js (main) 14.3 MB [initial] [rendered]
2026-06-25T12:52:41.9241952Z chunk {runtime} runtime-es2015.fe58a358724f89f7a8d3.js (runtime) 10 kB [entry] [rendered]
2026-06-25T12:52:41.9242351Z chunk {runtime} runtime-es5.fe58a358724f89f7a8d3.js (runtime) 10 kB [entry] [rendered]
2026-06-25T12:52:41.9242801Z chunk {35} 35-es2015.faf8209a1d5e22c9ec3a.js () 40.8 kB  [rendered]
2026-06-25T12:52:41.9243183Z chunk {35} 35-es5.faf8209a1d5e22c9ec3a.js () 48.8 kB  [rendered]
2026-06-25T12:52:41.9243496Z chunk {scripts} scripts.ad4edd1fdc8de50d3898.js (scripts) 2.41 MB [entry] [rendered]
2026-06-25T12:52:41.9243834Z chunk {styles} styles.829a87c709d63d3d0b6b.css (styles) 1020 kB [initial] [rendered]
2026-06-25T12:52:41.9244293Z Date: 2026-06-25T12:52:41.920Z - Hash: ef33d0c00c6650576b7c - Time: 25524ms
2026-06-25T12:52:42.2302723Z 
2026-06-25T12:52:42.2304126Z > sinep-app-web@1.0.0-snapshot test /opt/ads-agent/_work/14/s
2026-06-25T12:52:42.2308129Z > ng test
2026-06-25T12:52:42.2308457Z 
2026-06-25T12:52:44.0253416Z [33m25 06 2026 09:52:44.023:WARN [karma-server]: [39mPassing raw CLI options to `new Server(config, done)` is deprecated. Use `parseConfig(configFilePath, cliOptions, {promiseConfig: true, throwErrors: true})` to prepare a processed `Config` instance and pass that as the `config` argument instead.
2026-06-25T12:52:44.0257747Z [91m25 06 2026 09:52:44.025:ERROR [config]: [39mError in config file!
2026-06-25T12:52:44.0258180Z   /opt/ads-agent/_work/14/s/karma.conf.js:147
2026-06-25T12:52:44.0259001Z Karma - Configuration File
2026-06-25T12:52:44.0259484Z                       ^^^^
2026-06-25T12:52:44.0259526Z 
2026-06-25T12:52:44.0259957Z SyntaxError: Unexpected identifier
2026-06-25T12:52:44.0261308Z     at wrapSafe (internal/modules/cjs/loader.js:1001:16)
2026-06-25T12:52:44.0261743Z     at Module._compile (internal/modules/cjs/loader.js:1049:27)
2026-06-25T12:52:44.0261951Z     at Object.Module._extensions..js (internal/modules/cjs/loader.js:1114:10)
2026-06-25T12:52:44.0262159Z     at Module.load (internal/modules/cjs/loader.js:950:32)
2026-06-25T12:52:44.0262356Z     at Function.Module._load (internal/modules/cjs/loader.js:790:12)
2026-06-25T12:52:44.0262507Z     at Module.require (internal/modules/cjs/loader.js:974:19)
2026-06-25T12:52:44.0262775Z     at require (internal/modules/cjs/helpers.js:93:18)
2026-06-25T12:52:44.0263149Z     at Object.parseConfig (/opt/ads-agent/_work/14/s/node_modules/karma/lib/config.js:434:22)
2026-06-25T12:52:44.0263685Z     at new Server (/opt/ads-agent/_work/14/s/node_modules/karma/lib/server.js:81:22)
2026-06-25T12:52:44.0263997Z     at Observable._subscribe (/opt/ads-agent/_work/14/s/node_modules/@angular-devkit/build-angular/src/karma/index.js:100:29)
2026-06-25T12:52:44.0264343Z     at Observable._trySubscribe (/opt/ads-agent/_work/14/s/node_modules/@angular-devkit/build-angular/node_modules/rxjs/internal/Observable.js:44:25)
2026-06-25T12:52:44.0264651Z     at Observable.subscribe (/opt/ads-agent/_work/14/s/node_modules/@angular-devkit/build-angular/node_modules/rxjs/internal/Observable.js:30:22)
2026-06-25T12:52:44.0265161Z     at /opt/ads-agent/_work/14/s/node_modules/@angular-devkit/build-angular/node_modules/rxjs/internal/util/subscribeTo.js:22:31
2026-06-25T12:52:44.0265524Z     at Object.subscribeToResult (/opt/ads-agent/_work/14/s/node_modules/@angular-devkit/build-angular/node_modules/rxjs/internal/util/subscribeToResult.js:10:45)
2026-06-25T12:52:44.0265952Z     at SwitchMapSubscriber._innerSub (/opt/ads-agent/_work/14/s/node_modules/@angular-devkit/build-angular/node_modules/rxjs/internal/operators/switchMap.js:65:54)
2026-06-25T12:52:44.0266322Z     at SwitchMapSubscriber._next (/opt/ads-agent/_work/14/s/node_modules/@angular-devkit/build-angular/node_modules/rxjs/internal/operators/switchMap.js:55:14)
2026-06-25T12:52:44.0460580Z npm ERR! Test failed.  See above for more details.
2026-06-25T12:52:44.0553895Z ##[error]Bash exited with code '1'.
2026-06-25T12:52:44.0577838Z ##[section]Finishing: Build Application
