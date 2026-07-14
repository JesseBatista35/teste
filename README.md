
Starting: npm install
==============================================================================
Task         : npm
Description  : Install and publish npm packages, or run an npm command. Supports npmjs.com and authenticated registries like Azure Artifacts.
Version      : 1.221.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/package/npm
==============================================================================
/opt/ads-agent/_work/_tool/node/20.18.2/x64/bin/npm --version
10.8.2
/opt/ads-agent/_work/_tool/node/20.18.2/x64/bin/npm config list
npm verbose cli /opt/ads-agent/_work/_tool/node/20.18.2/x64/bin/node /opt/ads-agent/_work/_tool/node/20.18.2/x64/bin/npm
npm info using npm@10.8.2
npm info using node@v20.18.2
npm verbose title npm config list
npm verbose argv "config" "list"
npm verbose logfile logs-max:10 dir:/home/sadscp01/.npm/_logs/2026-07-13T14_31_08_734Z-
npm verbose logfile /home/sadscp01/.npm/_logs/2026-07-13T14_31_08_734Z-debug-0.log
npm verbose cwd /opt/ads-agent/_work/272/s
npm verbose os Linux 5.14.0-362.8.1.el9_3.x86_64
npm verbose node v20.18.2
npm verbose npm  v10.8.2
npm verbose exit 0
npm info ok
; "project" config from /opt/ads-agent/_work/272/s/.npmrc

disturl = "http://binario.caixa:8081/repository/nodejs/"
email = (protected)
registry = "http://binario.caixa:8081/repository/npm-all/"
sass_binary_site = "http://binario.caixa:8081/repository/node-sass/"

; "env" config from environment

loglevel = "verbose"
userconfig = "/opt/ads-agent/_work/272/npm/769192.npmrc"

; node bin location = /opt/ads-agent/_work/_tool/node/20.18.2/x64/bin/node
; node version = v20.18.2
; npm local prefix = /opt/ads-agent/_work/272/s
; npm version = 10.8.2


npm verbose stack     at async Promise.all (index 1)
npm verbose stack     at async Arborist.reify (/opt/ads-agent/_work/_tool/node/20.18.2/x64/lib/node_modules/npm/node_modules/@npmcli/arborist/lib/arborist/reify.js:131:5)
npm verbose stack     at async Install.exec (/opt/ads-agent/_work/_tool/node/20.18.2/x64/lib/node_modules/npm/lib/commands/install.js:150:5)
npm verbose stack     at async Npm.exec (/opt/ads-agent/_work/_tool/node/20.18.2/x64/lib/node_modules/npm/lib/npm.js:207:9)
npm verbose stack     at async module.exports (/opt/ads-agent/_work/_tool/node/20.18.2/x64/lib/node_modules/npm/lib/cli/entry.js:74:5)
npm error code ERESOLVE
npm error ERESOLVE could not resolve
npm error
npm error While resolving: @caixa/sdsc-angular@0.1.17
npm error Found: @angular/cdk@20.2.4
npm error node_modules/@angular/cdk
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
