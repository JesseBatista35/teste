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
; "project" config from /opt/ads-agent/_work/361/s/.npmrc

disturl = "http://binario.caixa:8081/repository/nodejs/"
email = (protected)
registry = "http://binario.caixa:8081/repository/npm-all/"
sass_binary_site = "http://binario.caixa:8081/repository/node-sass/"

; "env" config from environment

loglevel = "verbose"
userconfig = "/opt/ads-agent/_work/361/npm/770729.npmrc"

; node bin location = /opt/ads-agent/_work/_tool/node/22.13.1/x64/bin/node
; node version = v22.13.1
; npm local prefix = /opt/ads-agent/_work/361/s
; npm version = 10.9.2
; cwd = /opt/ads-agent/_work/361/s
; HOME = /home/sadscp01
; Run `npm config ls -l` to show all defaults.
npm info using npm@10.9.2
/opt/ads-agent/_work/_tool/node/22.13.1/x64/bin/npm install --no-audit --verbose
npm info using node@v22.13.1
npm verbose title npm config list
npm verbose argv "config" "list"
npm verbose logfile logs-max:10 dir:/home/sadscp01/.npm/_logs/2026-07-14T18_36_21_131Z-
npm verbose logfile /home/sadscp01/.npm/_logs/2026-07-14T18_36_21_131Z-debug-0.log
npm verbose cwd /opt/ads-agent/_work/361/s
npm verbose os Linux 5.14.0-362.8.1.el9_3.x86_64


npm verbose logfile /home/sadscp01/.npm/_logs/2026-07-14T18_36_21_237Z-debug-0.log
npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fcdk 33ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fcommon 24ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fcore 17ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fcompiler 7ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/rxjs 7ms (cache hit)
npm http cache http://binario.caixa:8081/repository/npm-all/zone.js 7ms (cache hit)
npm verbose stack Error: could not resolve
npm verbose stack     at PlaceDep.failPeerConflict (/opt/ads-agent/_work/_tool/node/22.13.1/x64/lib/node_modules/npm/node_modules/@npmcli/arborist/lib/place-dep.js:503:25)
npm verbose stack     at new PlaceDep (/opt/ads-agent/_work/_tool/node/22.13.1/x64/lib/node_modules/npm/node_modules/@npmcli/arborist/lib/place-dep.js:157:21)
npm verbose stack     at #buildDepStep (/opt/ads-agent/_work/_tool/node/22.13.1/x64/lib/node_modules/npm/node_modules/@npmcli/arborist/lib/arborist/build-ideal-tree.js:920:18)
npm verbose stack     at async Arborist.buildIdealTree (/opt/ads-agent/_work/_tool/node/22.13.1/x64/lib/node_modules/npm/node_modules/@npmcli/arborist/lib/arborist/build-ideal-tree.js:181:7)
npm verbose stack     at async Promise.all (index 1)
npm verbose stack     at async Arborist.reify (/opt/ads-agent/_work/_tool/node/22.13.1/x64/lib/node_modules/npm/node_modules/@npmcli/arborist/lib/arborist/reify.js:131:5)
npm verbose stack     at async Install.exec (/opt/ads-agent/_work/_tool/node/22.13.1/x64/lib/node_modules/npm/lib/commands/install.js:150:5)
npm verbose stack     at async Npm.exec (/opt/ads-agent/_work/_tool/node/22.13.1/x64/lib/node_modules/npm/lib/npm.js:207:9)
npm verbose stack     at async module.exports (/opt/ads-agent/_work/_tool/node/22.13.1/x64/lib/node_modules/npm/lib/cli/entry.js:74:5)
npm error code ERESOLVE
npm error ERESOLVE could not resolve

npm error   @angular/cdk@"20.2.4" from the root project
npm error   peer @angular/cdk@"20.2.4" from @angular/material@20.2.4
npm error   node_modules/@angular/material
npm error     @angular/material@"20.2.4" from the root project
npm error     peer @angular/material@"20.2.4" from @angular/material-date-fns-adapter@20.2.4
npm error     node_modules/@angular/material-date-fns-adapter
npm error       @angular/material-date-fns-adapter@"20.2.4" from the root project
npm error   1 more (primeng)
npm error
npm error Could not resolve dependency:
npm error peer @angular/cdk@"^20.2.14" from @caixa/sdsc-angular@0.1.17
npm error node_modules/@caixa/sdsc-angular
npm error   @caixa/sdsc-angular@"0.1.17" from the root project
npm error
npm error Conflicting peer dependency: @angular/cdk@20.2.14
npm error node_modules/@angular/cdk
npm error   peer @angular/cdk@"^20.2.14" from @caixa/sdsc-angular@0.1.17
npm error   node_modules/@caixa/sdsc-angular
npm error     @caixa/sdsc-angular@"0.1.17" from the root project
npm error
npm error Fix the upstream dependency conflict, or retry
npm error this command with --force or --legacy-peer-deps
npm error to accept an incorrect (and potentially broken) dependency resolution.
npm error
npm error
npm error For a full report see:
npm error /home/sadscp01/.npm/_logs/2026-07-14T18_36_21_237Z-eresolve-report.txt
npm verbose cwd /opt/ads-agent/_work/361/s
npm verbose os Linux 5.14.0-362.8.1.el9_3.x86_64
npm verbose node v22.13.1
npm verbose npm  v10.9.2
npm verbose exit 1
npm verbose code 1
npm error A complete log of this run can be found in: /home/sadscp01/.npm/_logs/2026-07-14T18_36_21_237Z-debug-0.log
##[warning]Couldn't find a debug log in the cache or working directory
##[error]Error: Npm failed with return code: 1
Finishing: npm install
