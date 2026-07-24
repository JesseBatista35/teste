Starting: npm install
==============================================================================
Task         : npm
Description  : Install and publish npm packages, or run an npm command. Supports npmjs.com and authenticated registries like Azure Artifacts.
Version      : 1.221.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/package/npm
==============================================================================
/opt/ads-agent/_work/_tool/node/10.24.1/x64/bin/npm --version
6.14.12
/opt/ads-agent/_work/_tool/node/10.24.1/x64/bin/npm config list
npm info it worked if it ends with ok
; cli configs
metrics-registry = "http://binario.caixa:8081/repository/npm-all/"
scope = ""
user-agent = "npm/6.14.12 node/v10.24.1 linux x64"

; environment configs
loglevel = "verbose"
userconfig = "/opt/ads-agent/_work/341/npm/779640.npmrc"

; project config /opt/ads-agent/_work/341/s/web/.npmrc
disturl = "http://binario.caixa:8081/repository/nodejs/"
email = "pipeline-agil@mail.caixa"
registry = "http://binario.caixa:8081/repository/npm-all/"
sass_binary_site = "http://binario.caixa:8081/repository/node-sass/"

; node bin location = /opt/ads-agent/_work/_tool/node/10.24.1/x64/bin/node
; cwd = /opt/ads-agent/_work/341/s/web
; HOME = /home/sadscp01
; "npm config ls -l" to show all defaults.

    at /home/sadscp01/.npm/_npx/1595001/lib/node_modules/npm-force-resolutions/out/npm_force_resolutions/core.cljs:151:3
> siceds@0.0.0 preinstall /opt/ads-agent/_work/341/s/web
> npx npm-force-resolutions

    at npm_force_resolutions$core$update_package_lock_$_state_machine__2145__auto____1 (/home/sadscp01/.npm/_npx/1595001/lib/node_modules/npm-force-resolutions/out/npm_force_resolutions/core.js:648:4)
    at cljs.core.async.impl.ioc-helpers/FN-IDX (/home/sadscp01/.npm/_npx/1595001/lib/node_modules/npm-force-resolutions/out/npm_force_resolutions/core.js:664:88)
    at cljs.core.async.impl.ioc-helpers/run-state-machine (/home/sadscp01/.npm/_npx/1595001/lib/node_modules/npm-force-resolutions/out/cljs/core/async/impl/ioc_helpers.cljs:35:23)
    at cljs$core$async$impl$ioc_helpers$run_state_machine_wrapped (/home/sadscp01/.npm/_npx/1595001/lib/node_modules/npm-force-resolutions/out/cljs/core/async/impl/ioc_helpers.cljs:39:6)
npm verb lifecycle siceds@0.0.0~preinstall: unsafe-perm in lifecycle true
npm verb lifecycle siceds@0.0.0~preinstall: PATH: /opt/ads-agent/_work/_tool/node/10.24.1/x64/lib/node_modules/npm/node_modules/npm-lifecycle/node-gyp-bin:/opt/ads-agent/_work/341/s/web/node_modules/.bin:/opt/ads-agent/_work/_tool/node/10.24.1/x64/bin:/home/sadscp01/.local/bin:/home/sadscp01/bin:/sbin:/bin:/usr/sbin:/usr/bin:/usr/local/sbin:/opt/sonar-scanner/sonar-scanner/bin:/opt/fortify/bin:/usr/local/lib/node/nodejs/bin:/usr/lib64/dotnet:/opt/apache-maven/apache-maven-3.8.5/bin:/opt/sonar-scanner/sonar-scanner/bin:/opt/fortify/bin:/usr/local/lib/node/nodejs/bin:/usr/lib64/dotnet:/opt/apache-maven/apache-maven-3.9.9/bin
npm verb lifecycle siceds@0.0.0~preinstall: CWD: /opt/ads-agent/_work/341/s/web
npm info lifecycle siceds@0.0.0~preinstall: Failed to exec preinstall script
npm timing stage:rollbackFailedOptional Completed in 1ms
npm timing stage:runTopLevelLifecycles Completed in 1294ms
> siceds@0.0.0 preinstall /opt/ads-agent/_work/341/s/web
> npx npm-force-resolutions

    at npm_force_resolutions$core$update_package_lock_$_state_machine__2145__auto____1 (/home/sadscp01/.npm/_npx/1595001/lib/node_modules/npm-force-resolutions/out/npm_force_resolutions/core.js:648:4)
    at cljs.core.async.impl.ioc-helpers/FN-IDX (/home/sadscp01/.npm/_npx/1595001/lib/node_modules/npm-force-resolutions/out/npm_force_resolutions/core.js:664:88)
    at cljs.core.async.impl.ioc-helpers/run-state-machine (/home/sadscp01/.npm/_npx/1595001/lib/node_modules/npm-force-resolutions/out/cljs/core/async/impl/ioc_helpers.cljs:35:23)
    at cljs$core$async$impl$ioc_helpers$run_state_machine_wrapped (/home/sadscp01/.npm/_npx/1595001/lib/node_modules/npm-force-resolutions/out/cljs/core/async/impl/ioc_helpers.cljs:39:6)
npm verb lifecycle siceds@0.0.0~preinstall: unsafe-perm in lifecycle true
npm verb lifecycle siceds@0.0.0~preinstall: PATH: /opt/ads-agent/_work/_tool/node/10.24.1/x64/lib/node_modules/npm/node_modules/npm-lifecycle/node-gyp-bin:/opt/ads-agent/_work/341/s/web/node_modules/.bin:/opt/ads-agent/_work/_tool/node/10.24.1/x64/bin:/home/sadscp01/.local/bin:/home/sadscp01/bin:/sbin:/bin:/usr/sbin:/usr/bin:/usr/local/sbin:/opt/sonar-scanner/sonar-scanner/bin:/opt/fortify/bin:/usr/local/lib/node/nodejs/bin:/usr/lib64/dotnet:/opt/apache-maven/apache-maven-3.8.5/bin:/opt/sonar-scanner/sonar-scanner/bin:/opt/fortify/bin:/usr/local/lib/node/nodejs/bin:/usr/lib64/dotnet:/opt/apache-maven/apache-maven-3.9.9/bin
npm verb lifecycle siceds@0.0.0~preinstall: CWD: /opt/ads-agent/_work/341/s/web
npm info lifecycle siceds@0.0.0~preinstall: Failed to exec preinstall script
npm timing stage:rollbackFailedOptional Completed in 1ms
npm timing stage:runTopLevelLifecycles Completed in 1294ms
npm verb stack Error: siceds@0.0.0 preinstall: `npx npm-force-resolutions`
npm verb stack Exit status 1
npm verb stack     at EventEmitter.<anonymous> (/opt/ads-agent/_work/_tool/node/10.24.1/x64/lib/node_modules/npm/node_modules/npm-lifecycle/index.js:332:16)
npm verb stack     at EventEmitter.emit (events.js:198:13)
npm verb stack     at ChildProcess.<anonymous> (/opt/ads-agent/_work/_tool/node/10.24.1/x64/lib/node_modules/npm/node_modules/npm-lifecycle/lib/spawn.js:55:14)
npm verb stack     at ChildProcess.emit (events.js:198:13)
npm verb stack     at maybeClose (internal/child_process.js:982:16)
npm verb stack     at Process.ChildProcess._handle.onexit (internal/child_process.js:259:5)
npm verb pkgid siceds@0.0.0
npm verb cwd /opt/ads-agent/_work/341/s/web
npm verb Linux 5.14.0-362.8.1.el9_3.x86_64
npm verb argv "/opt/ads-agent/_work/_tool/node/10.24.1/x64/bin/node" "/opt/ads-agent/_work/_tool/node/10.24.1/x64/bin/npm" "install" "--no-audit" "--verbose"
npm verb node v10.24.1
npm verb npm  v6.14.12
npm ERR! code ELIFECYCLE
npm ERR! errno 1
npm ERR! siceds@0.0.0 preinstall: `npx npm-force-resolutions`
npm ERR! Exit status 1
npm ERR! 
npm ERR! Failed at the siceds@0.0.0 preinstall script.
npm ERR! This is probably not a problem with npm. There is likely additional logging output above.
npm verb exit [ 1, true ]
npm WARN Local package.json exists, but node_modules missing, did you mean to install?
npm timing npm Completed in 1491ms

npm ERR! A complete log of this run can be found in:
npm ERR!     /home/sadscp01/.npm/_logs/2026-07-24T12_28_51_322Z-debug.log
Found npm debug log, make sure the path matches with the one in npm's output: /home/sadscp01/.npm/_logs/2026-07-24T12_28_51_322Z-debug.log
0 info it worked if it ends with ok
1 verbose cli [ '/opt/ads-agent/_work/_tool/node/10.24.1/x64/bin/node',
1 verbose cli   '/opt/ads-agent/_work/_tool/node/10.24.1/x64/bin/npm',
1 verbose cli   'install',
1 verbose cli   '--no-audit',
1 verbose cli   '--verbose' ]
2 info using npm@6.14.12
3 info using node@v10.24.1
4 verbose npm-session 3d12e882588a9ea5
5 silly install runPreinstallTopLevelLifecycles
6 silly preinstall siceds@0.0.0
7 info lifecycle siceds@0.0.0~preinstall: siceds@0.0.0
8 verbose lifecycle siceds@0.0.0~preinstall: unsafe-perm in lifecycle true
9 verbose lifecycle siceds@0.0.0~preinstall: PATH: /opt/ads-agent/_work/_tool/node/10.24.1/x64/lib/node_modules/npm/node_modules/npm-lifecycle/node-gyp-bin:/opt/ads-agent/_work/341/s/web/node_modules/.bin:/opt/ads-agent/_work/_tool/node/10.24.1/x64/bin:/home/sadscp01/.local/bin:/home/sadscp01/bin:/sbin:/bin:/usr/sbin:/usr/bin:/usr/local/sbin:/opt/sonar-scanner/sonar-scanner/bin:/opt/fortify/bin:/usr/local/lib/node/nodejs/bin:/usr/lib64/dotnet:/opt/apache-maven/apache-maven-3.8.5/bin:/opt/sonar-scanner/sonar-scanner/bin:/opt/fortify/bin:/usr/local/lib/node/nodejs/bin:/usr/lib64/dotnet:/opt/apache-maven/apache-maven-3.9.9/bin
10 verbose lifecycle siceds@0.0.0~preinstall: CWD: /opt/ads-agent/_work/341/s/web
11 silly lifecycle siceds@0.0.0~preinstall: Args: [ '-c', 'npx npm-force-resolutions' ]
12 silly lifecycle siceds@0.0.0~preinstall: Returned: code: 1  signal: null
13 info lifecycle siceds@0.0.0~preinstall: Failed to exec preinstall script
14 timing stage:rollbackFailedOptional Completed in 1ms
15 timing stage:runTopLevelLifecycles Completed in 1294ms
16 verbose stack Error: siceds@0.0.0 preinstall: `npx npm-force-resolutions`
16 verbose stack Exit status 1
16 verbose stack     at EventEmitter.<anonymous> (/opt/ads-agent/_work/_tool/node/10.24.1/x64/lib/node_modules/npm/node_modules/npm-lifecycle/index.js:332:16)
16 verbose stack     at EventEmitter.emit (events.js:198:13)
16 verbose stack     at ChildProcess.<anonymous> (/opt/ads-agent/_work/_tool/node/10.24.1/x64/lib/node_modules/npm/node_modules/npm-lifecycle/lib/spawn.js:55:14)
16 verbose stack     at ChildProcess.emit (events.js:198:13)
16 verbose stack     at maybeClose (internal/child_process.js:982:16)
16 verbose stack     at Process.ChildProcess._handle.onexit (internal/child_process.js:259:5)
17 verbose pkgid siceds@0.0.0
18 verbose cwd /opt/ads-agent/_work/341/s/web
19 verbose Linux 5.14.0-362.8.1.el9_3.x86_64
20 verbose argv "/opt/ads-agent/_work/_tool/node/10.24.1/x64/bin/node" "/opt/ads-agent/_work/_tool/node/10.24.1/x64/bin/npm" "install" "--no-audit" "--verbose"
21 verbose node v10.24.1
22 verbose npm  v6.14.12
23 error code ELIFECYCLE
24 error errno 1
25 error siceds@0.0.0 preinstall: `npx npm-force-resolutions`
25 error Exit status 1
26 error Failed at the siceds@0.0.0 preinstall script.
26 error This is probably not a problem with npm. There is likely additional logging output above.
27 verbose exit [ 1, true ]

##[error]Error: Npm failed with return code: 1
Finishing: npm install


