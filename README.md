Use Node 12.x

View raw log

Starting: Use Node 12.x
==============================================================================
Task         : Node.js tool installer
Description  : Finds or downloads and caches the specified version spec of Node.js and adds it to the PATH
Version      : 0.225.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/tool/node-js
==============================================================================
Found tool in cache: node 12.22.12 x64
Prepending PATH environment variable with directory: /opt/ads-agent/_work/_tool/node/12.22.12/x64/bin
Finishing: Use Node 12.x



42342 verbose notsup SKIPPING OPTIONAL DEPENDENCY: Actual Arch: x64
42343 warn optional SKIPPING OPTIONAL DEPENDENCY: fsevents@1.2.13 (node_modules/watchpack-chokidar2/node_modules/fsevents):
42344 warn notsup SKIPPING OPTIONAL DEPENDENCY: Unsupported platform for fsevents@1.2.13: wanted {"os":"darwin","arch":"any"} (current: {"os":"linux","arch":"x64"})
42345 verbose notsup SKIPPING OPTIONAL DEPENDENCY: Valid OS:    darwin
42345 verbose notsup SKIPPING OPTIONAL DEPENDENCY: Valid Arch:  any
42345 verbose notsup SKIPPING OPTIONAL DEPENDENCY: Actual OS:   linux
42345 verbose notsup SKIPPING OPTIONAL DEPENDENCY: Actual Arch: x64
42346 warn optional SKIPPING OPTIONAL DEPENDENCY: fsevents@2.3.3 (node_modules/fsevents):
42347 warn notsup SKIPPING OPTIONAL DEPENDENCY: Unsupported platform for fsevents@2.3.3: wanted {"os":"darwin","arch":"any"} (current: {"os":"linux","arch":"x64"})
42348 verbose notsup SKIPPING OPTIONAL DEPENDENCY: Valid OS:    darwin
42348 verbose notsup SKIPPING OPTIONAL DEPENDENCY: Valid Arch:  any
42348 verbose notsup SKIPPING OPTIONAL DEPENDENCY: Actual OS:   linux
42348 verbose notsup SKIPPING OPTIONAL DEPENDENCY: Actual Arch: x64
42349 verbose stack Error: @syncfusion/ej2-angular-base@19.4.56 postinstall: `node ./postinstall.js`
42349 verbose stack Exit status 1
42349 verbose stack     at EventEmitter.<anonymous> (/opt/ads-agent/_work/_tool/node/12.22.12/x64/lib/node_modules/npm/node_modules/npm-lifecycle/index.js:332:16)
42349 verbose stack     at EventEmitter.emit (events.js:314:20)
42349 verbose stack     at ChildProcess.<anonymous> (/opt/ads-agent/_work/_tool/node/12.22.12/x64/lib/node_modules/npm/node_modules/npm-lifecycle/lib/spawn.js:55:14)
42349 verbose stack     at ChildProcess.emit (events.js:314:20)
42349 verbose stack     at maybeClose (internal/child_process.js:1022:16)
42349 verbose stack     at Process.ChildProcess._handle.onexit (internal/child_process.js:287:5)
42350 verbose pkgid @syncfusion/ej2-angular-base@19.4.56
42351 verbose cwd /opt/ads-agent/_work/115/s
42352 verbose Linux 5.18.5-100.fc35.x86_64
42353 verbose argv "/opt/ads-agent/_work/_tool/node/12.22.12/x64/bin/node" "/opt/ads-agent/_work/_tool/node/12.22.12/x64/bin/npm" "install" "--no-audit" "--verbose"
42354 verbose node v12.22.12
42355 verbose npm  v6.14.16
42356 error code ELIFECYCLE
42357 error errno 1
42358 error @syncfusion/ej2-angular-base@19.4.56 postinstall: `node ./postinstall.js`
42358 error Exit status 1
42359 error Failed at the @syncfusion/ej2-angular-base@19.4.56 postinstall script.
42359 error This is probably not a problem with npm. There is likely additional logging output above.
42360 verbose exit [ 1, true ]

##[error]Error: Npm failed with return code: 1
Finishing: npm install
