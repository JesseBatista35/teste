chunk {runtime} runtime-es2015.fe58a358724f89f7a8d3.js (runtime) 10 kB [entry] [rendered]
chunk {runtime} runtime-es5.fe58a358724f89f7a8d3.js (runtime) 10 kB [entry] [rendered]
chunk {35} 35-es2015.faf8209a1d5e22c9ec3a.js () 40.8 kB  [rendered]
chunk {35} 35-es5.faf8209a1d5e22c9ec3a.js () 48.8 kB  [rendered]
chunk {scripts} scripts.ad4edd1fdc8de50d3898.js (scripts) 2.41 MB [entry] [rendered]
chunk {styles} styles.829a87c709d63d3d0b6b.css (styles) 1020 kB [initial] [rendered]
Date: 2026-06-25T12:52:41.920Z - Hash: ef33d0c00c6650576b7c - Time: 25524ms

> sinep-app-web@1.0.0-snapshot test /opt/ads-agent/_work/14/s
> ng test

25 06 2026 09:52:44.023:WARN [karma-server]: Passing raw CLI options to `new Server(config, done)` is deprecated. Use `parseConfig(configFilePath, cliOptions, {promiseConfig: true, throwErrors: true})` to prepare a processed `Config` instance and pass that as the `config` argument instead.
25 06 2026 09:52:44.025:ERROR [config]: Error in config file!
  /opt/ads-agent/_work/14/s/karma.conf.js:147
Karma - Configuration File
                      ^^^^

SyntaxError: Unexpected identifier
    at wrapSafe (internal/modules/cjs/loader.js:1001:16)
    at Module._compile (internal/modules/cjs/loader.js:1049:27)
    at Object.Module._extensions..js (internal/modules/cjs/loader.js:1114:10)
    at Module.load (internal/modules/cjs/loader.js:950:32)
    at Function.Module._load (internal/modules/cjs/loader.js:790:12)
    at Module.require (internal/modules/cjs/loader.js:974:19)
    at require (internal/modules/cjs/helpers.js:93:18)
    at Object.parseConfig (/opt/ads-agent/_work/14/s/node_modules/karma/lib/config.js:434:22)
    at new Server (/opt/ads-agent/_work/14/s/node_modules/karma/lib/server.js:81:22)
    at Observable._subscribe (/opt/ads-agent/_work/14/s/node_modules/@angular-devkit/build-angular/src/karma/index.js:100:29)
    at Observable._trySubscribe (/opt/ads-agent/_work/14/s/node_modules/@angular-devkit/build-angular/node_modules/rxjs/internal/Observable.js:44:25)
    at Observable.subscribe (/opt/ads-agent/_work/14/s/node_modules/@angular-devkit/build-angular/node_modules/rxjs/internal/Observable.js:30:22)
    at /opt/ads-agent/_work/14/s/node_modules/@angular-devkit/build-angular/node_modules/rxjs/internal/util/subscribeTo.js:22:31
    at Object.subscribeToResult (/opt/ads-agent/_work/14/s/node_modules/@angular-devkit/build-angular/node_modules/rxjs/internal/util/subscribeToResult.js:10:45)
    at SwitchMapSubscriber._innerSub (/opt/ads-agent/_work/14/s/node_modules/@angular-devkit/build-angular/node_modules/rxjs/internal/operators/switchMap.js:65:54)
    at SwitchMapSubscriber._next (/opt/ads-agent/_work/14/s/node_modules/@angular-devkit/build-angular/node_modules/rxjs/internal/operators/switchMap.js:55:14)
npm ERR! Test failed.  See above for more details.
##[error]Bash exited with code '1'.
Finishing: Build Application
