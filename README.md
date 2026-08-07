Eu e outros membros da equipe estamos enfrentando problemas para passar código de MFEs Angular v16.2.15 e Node v22.13.1 novo na pipeline do devops. Está sempre quebrando na etapa do "npm install". Trecho final da descrição do erro ao finalizar:

npm verb argv "/opt/ads-agent/_work/_tool/node/16.14.0/x64/bin/node" "/opt/ads-agent/_work/_tool/node/16.14.0/x64/bin/npm" "install" "--no-audit" "--verbose"
npm verb node v16.14.0
npm verb npm  v8.3.1
npm ERR! code E404
npm ERR! 404 Not Found - GET http://binario.caixa:8081/repository/npm-all/node-releases/-/node-releases-2.0.53.tgz
npm ERR! 404 
npm ERR! 404  'node-releases@http://binario.caixa:8081/repository/npm-all/node-releases/-/node-releases-2.0.53.tgz' is not in this registry.
npm ERR! 404 You should bug the author to publish it (or use the name yourself!)
npm ERR! 404 
npm ERR! 404 Note that you can also install from a
npm ERR! 404 tarball, folder, http url, or git url.
npm verb exit 1
npm timing npm Completed in 87063ms
npm verb unfinished npm timer reify 1786127157573
npm verb unfinished npm timer reify:unpack 1786127221637
npm verb unfinished npm timer reifyNode:node_modules/node-releases 1786127221655
npm verb unfinished npm timer reifyNode:node_modules/electron-to-chromium 1786127221655
npm verb code 1

npm ERR! A complete log of this run can be found in:
npm ERR!     /opt/ads-agent/.npm/_logs/2026-08-07T18_25_57_370Z-debug-0.log
##[warning]Couldn't find a debug log in the cache or working directory
##[error]Error: Npm failed with return code: 1 
Finishing: npm install


Starting: npm install
==============================================================================
Task         : npm
Description  : Install and publish npm packages, or run an npm command. Supports npmjs.com and authenticated registries like Azure Artifacts.
Version      : 1.221.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/package/npm
==============================================================================
/opt/ads-agent/_work/_tool/node/16.14.0/x64/bin/npm --version
8.3.1
/opt/ads-agent/_work/_tool/node/16.14.0/x64/bin/npm config list
npm verb cli [
; "user" config from /opt/ads-agent/_work/14434/npm/791881.npmrc
npm verb cli   '/opt/ads-agent/_work/_tool/node/16.14.0/x64/bin/node',
npm verb cli   '/opt/ads-agent/_work/_tool/node/16.14.0/x64/bin/npm',
npm verb cli   'config',
npm verb cli   'list'
npm verb cli ]
npm info using npm@8.3.1
npm info using node@v16.14.0
npm timing npm:load:whichnode Completed in 0ms
npm timing config:load:defaults Completed in 1ms
npm timing config:load:file:/opt/ads-agent/_work/_tool/node/16.14.0/x64/lib/node_modules/npm/npmrc Completed in 1ms
npm timing config:load:builtin Completed in 1ms
npm timing config:load:cli Completed in 1ms
npm timing config:load:env Completed in 1ms
npm timing config:load:file:/opt/ads-agent/_work/14434/s/.npmrc Completed in 5ms
npm timing config:load:project Completed in 7ms
npm timing config:load:file:/opt/ads-agent/_work/14434/npm/791881.npmrc Completed in 0ms
npm timing config:load:user Completed in 0ms
npm timing config:load:file:/opt/ads-agent/_work/_tool/node/16.14.0/x64/etc/npmrc Completed in 0ms
npm timing config:load:global Completed in 0ms
npm timing config:load:validate Completed in 1ms
npm timing config:load:credentials Completed in 1ms
npm timing config:load:setEnvs Completed in 1ms
npm timing config:load Completed in 14ms
npm timing npm:load:configload Completed in 14ms
npm timing npm:load:setTitle Completed in 0ms
npm timing config:load:flatten Completed in 2ms
npm timing npm:load:display Completed in 4ms
; email = "pipeline-agil@mail.caixa" ; overridden by project

; "project" config from /opt/ads-agent/_work/14434/s/.npmrc

disturl = "http://binario.caixa:8081/repository/nodejs/" 
email = "pipeline-agil@mail.caixa" 
registry = "http://binario.caixa:8081/repository/npm-all/" 
sass_binary_site = "http://binario.caixa:8081/repository/node-sass/" 

; "env" config from environment

loglevel = "verbose" 
userconfig = "/opt/ads-agent/_work/14434/npm/791881.npmrc" 

; node bin location = /opt/ads-agent/_work/_tool/node/16.14.0/x64/bin/node
; cwd = /opt/ads-agent/_work/14434/s
; HOME = /home/sadscp01
; Run `npm config ls -l` to show all defaults.
/opt/ads-agent/_work/_tool/node/16.14.0/x64/bin/npm install --no-audit --verbose
npm verb cli [
npm verb cli   '/opt/ads-agent/_work/_tool/node/16.14.0/x64/bin/node',
npm verb cli   '/opt/ads-agent/_work/_tool/node/16.14.0/x64/bin/npm',
npm verb cli   'install',
npm verb cli   '--no-audit',
npm verb cli   '--verbose'
npm verb cli ]
npm info using npm@8.3.1
npm info using node@v16.14.0
npm timing npm:load:whichnode Completed in 0ms
npm timing config:load:defaults Completed in 1ms
npm timing config:load:file:/opt/ads-agent/_work/_tool/node/


; email = "pipeline-agil@mail.caixa" ; overridden by project

; "project" config from /opt/ads-agent/_work/14434/s/.npmrc

disturl = "http://binario.caixa:8081/repository/nodejs/" 
email = "pipeline-agil@mail.caixa" 
registry = "http://binario.caixa:8081/repository/npm-all/" 
sass_binary_site = "http://binario.caixa:8081/repository/node-sass/" 

; "env" config from environment

loglevel = "verbose" 
userconfig = "/opt/ads-agent/_work/14434/npm/791881.npmrc" 

; node bin location = /opt/ads-agent/_work/_tool/node/16.14.0/x64/bin/node
; cwd = /opt/ads-agent/_work/14434/s
; HOME = /home/sadscp01
; Run `npm config ls -l` to show all defaults.
/opt/ads-agent/_work/_tool/node/16.14.0/x64/bin/npm install --no-audit --verbose
npm verb cli [
npm verb cli   '/opt/ads-agent/_work/_tool/node/16.14.0/x64/bin/node',
npm verb cli   '/opt/ads-agent/_work/_tool/node/16.14.0/x64/bin/npm',
npm verb cli   'install',
npm verb cli   '--no-audit',
npm verb cli   '--verbose'
npm verb cli ]
npm info using npm@8.3.1
npm info using node@v16.14.0
npm timing npm:load:whichnode Completed in 0ms
npm timing config:load:defaults Completed in 1ms
npm timing config:load:file:/opt/ads-agent/_work/_tool/node/
