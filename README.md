Starting: npm install
==============================================================================
Task         : npm
Description  : Install and publish npm packages, or run an npm command. Supports npmjs.com and authenticated registries like Azure Artifacts.
Version      : 1.221.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/package/npm
==============================================================================
/opt/ads-agent/_work/_tool/node/22.13.1/x64/bin/npm --version
10.9.2
/opt/ads-agent/_work/_tool/node/22.13.1/x64/bin/npm config list
npm verbose cli /opt/ads-agent/_work/_tool/node/22.13.1/x64/bin/node /opt/ads-agent/_work/_tool/node/22.13.1/x64/bin/npm
npm info using npm@10.9.2
npm info using node@v22.13.1
npm verbose title npm config list
npm verbose argv "config" "list"
npm verbose logfile logs-max:10 dir:/home/sadscp01/.npm/_logs/2026-07-31T01_52_07_567Z-
npm verbose logfile /home/sadscp01/.npm/_logs/2026-07-31T01_52_07_567Z-debug-0.log
; "project" config from /opt/ads-agent/_work/379/s/.npmrc

disturl = "http://binario.caixa:8081/repository/nodejs/"
email = (protected)
registry = "http://binario.caixa:8081/repository/npm-all/"
sass_binary_site = "http://binario.caixa:8081/repository/node-sass/"

; "env" config from environment

loglevel = "verbose"
userconfig = "/opt/ads-agent/_work/379/npm/784978.npmrc"

; node bin location = /opt/ads-agent/_work/_tool/node/22.13.1/x64/bin/node
; node version = v22.13.1
; npm local prefix = /opt/ads-agent/_work/379/s
; npm version = 10.9.2
; cwd = /opt/ads-agent/_work/379/s
; HOME = /home/sadscp01
; Run `npm config ls -l` to show all defaults.
/opt/ads-agent/_work/_tool/node/22.13.1/x64/bin/npm install --no-audit --verbose
npm verbose cwd /opt/ads-agent/_work/379/s
npm verbose os Linux 5.14.0-362.8.1.el9_3.x86_64


npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fcore 8ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fcompiler 7ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fcompiler 8ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/rxjs 4ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/zone.js 3ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fcdk 9ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fforms 10ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fplatform-browser 10ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fanimations 6ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fmaterial 19ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fmaterial-date-fns-adapter 9ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/date-fns 9ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fplatform-browser-dynamic 9ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fcommon 8ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fcore 8ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fcompiler 6ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fplatform-browser 8ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fanimations 7ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2frouter 7ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fservice-worker 8ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/@auth0%2fangular-jwt 3ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/@caixa%2fsdsc-angular 3ms (cache hit)
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/lottie-web 40ms (cache miss)
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ngx-mask 18ms (cache updated)
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@fortawesome%2ffontawesome-free 16ms (cache updated)
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@ng-idle%2fcore 24ms (cache miss)
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@primeuix%2fthemes 17ms (cache updated)
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/angular-mydatepicker 23ms (cache miss)


npm http cache http://binario.caixa:8081/repository/npm-all/bootstrap 3ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/chart.js 2ms (cache hit)
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/date-fns-tz 23ms (cache miss)
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/file-saver 14ms (cache miss)
npm http cache http://binario.caixa:8081/repository/npm-all/highcharts 5ms (cache hit)
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/html-to-pdfmake 22ms (cache miss)
npm http cache http://binario.caixa:8081/repository/npm-all/inputmask 7ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/jquery 2ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/keycloak-js 2ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/moment 1ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/ng2-currency-mask 3ms (cache hit)
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ng2-pdf-viewer 27ms (cache miss)
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ngx-bootstrap 24ms (cache miss)
npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fcommon 7ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fcore 6ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fcompiler 8ms (cache hit)
npm verbose stack Error: unable to resolve dependency tree
npm verbose stack     at #failPeerConflict (/opt/ads-agent/_work/_tool/node/22.13.1/x64/lib/node_modules/npm/node_modules/@npmcli/arborist/lib/arborist/build-ideal-tree.js:1363:25)
npm verbose stack     at #loadPeerSet (/opt/ads-agent/_work/_tool/node/22.13.1/x64/lib/node_modules/npm/node_modules/@npmcli/arborist/lib/arborist/build-ideal-tree.js:1356:29)
npm verbose stack     at async #loadPeerSet (/opt/ads-agent/_work/_tool/node/22.13.1/x64/lib/node_modules/npm/node_modules/@npmcli/arborist/lib/arborist/build-ideal-tree.js:1308:23)
npm verbose stack     at async #buildDepStep (/opt/ads-agent/_work/_tool/node/22.13.1/x64/lib/node_modules/npm/node_modules/@npmcli/arborist/lib/arborist/build-ideal-tree.js:904:11)
npm verbose stack     at async Arborist.buildIdealTree (/opt/ads-agent/_work/_tool/node/22.13.1/x64/lib/node_modules/npm/node_modules/@npmcli/arborist/lib/arborist/build-ideal-tree.js:181:7)
npm verbose stack     at async Promise.all (index 1)
npm verbose stack     at async Arborist.reify (/opt/ads-agent/_work/_tool/node/22.13.1/x64/lib/node_modules/npm/node_modules/@npmcli/arborist/lib/arborist/reify.js:131:5)
npm verbose stack     at async Install.exec (/opt/ads-agent/_work/_tool/node/22.13.1/x64/lib/node_modules/npm/lib/commands/install.js:150:5)
npm verbose stack     at async Npm.exec (/opt/ads-agent/_work/_tool/node/22.13.1/x64/lib/node_modules/npm/lib/npm.js:207:9)
npm verbose stack     at async module.exports (/opt/ads-agent/_work/_tool/node/22.13.1/x64/lib/node_modules/npm/lib/cli/entry.js:74:5)
npm error code ERESOLVE
npm error ERESOLVE unable to resolve dependency tree
npm error
npm error While resolving: siasc-novo@0.0.0.005
npm error Found: @angular/common@20.1.8
npm error node_modules/@angular/common
npm error   @angular/common@"^20.0.0" from the root project
npm error   peer @angular/common@"^20.0.2" from ngx-bootstrap@20.0.2


npm error   peer @angular/common@"^20.0.2" from ngx-bootstrap@20.0.2
npm error   node_modules/ngx-bootstrap
npm error     ngx-bootstrap@"^20.0.0" from the root project
npm error   1 more (@angular/animations)
npm error
npm error Could not resolve dependency:
npm error peer @angular/common@"20.3.27" from @angular/forms@20.3.27
npm error node_modules/@angular/forms
npm error   @angular/forms@"^20.0.0" from the root project
npm error   peer @angular/forms@"^20.0.2" from ngx-bootstrap@20.0.2
npm error   node_modules/ngx-bootstrap
npm error     ngx-bootstrap@"^20.0.0" from the root project
npm error
npm error Fix the upstream dependency conflict, or retry
npm error this command with --force or --legacy-peer-deps
npm error to accept an incorrect (and potentially broken) dependency resolution.
npm error
npm error
npm error For a full report see:
npm error /home/sadscp01/.npm/_logs/2026-07-31T01_52_07_664Z-eresolve-report.txt
npm verbose cwd /opt/ads-agent/_work/379/s
npm verbose os Linux 5.14.0-362.8.1.el9_3.x86_64
npm verbose node v22.13.1
npm verbose npm  v10.9.2
npm verbose exit 1
npm verbose code 1
npm error A complete log of this run can be found in: /home/sadscp01/.npm/_logs/2026-07-31T01_52_07_664Z-debug-0.log
##[warning]Couldn't find a debug log in the cache or working directory
##[error]Error: Npm failed with return code: 1
Finishing: npm install
