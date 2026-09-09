Prezados,

Espero que todos estejam bem.

Estou entrando em contato para informar que, ao realizar a build na pipeline está dando erro na fase npm install

Após várias tentativas de correção, recorrendo até mesmo à IA, não tivemos êxito na finalização da criação do build

https://devops.caixa/projetos/Caixa/_build/results?buildId=820825&view=logs&j=275f1d19-1bd8-5591-b06b-07d489ea915a&t=c2b66b3d-aa49-589b-dfee-68fd1060458b&l=107

Peço a gentileza de verificar a situação e me informar sobre possíveis soluções.

Agradeço pela atenção.


2026-09-09T11:06:48.1713279Z ##[section]Starting: npm install
2026-09-09T11:06:48.1716260Z ==============================================================================
2026-09-09T11:06:48.1716343Z Task         : npm
2026-09-09T11:06:48.1716397Z Description  : Install and publish npm packages, or run an npm command. Supports npmjs.com and authenticated registries like Azure Artifacts.
2026-09-09T11:06:48.1716494Z Version      : 1.221.0
2026-09-09T11:06:48.1716539Z Author       : Microsoft Corporation
2026-09-09T11:06:48.1716600Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/package/npm
2026-09-09T11:06:48.1716669Z ==============================================================================
2026-09-09T11:06:48.3726768Z [command]/opt/ads-agent/_work/_tool/node/22.13.1/x64/bin/npm --version
2026-09-09T11:06:48.4544514Z 10.9.2
2026-09-09T11:06:48.6628404Z [command]/opt/ads-agent/_work/_tool/node/22.13.1/x64/bin/npm config list
2026-09-09T11:06:48.7567006Z npm verbose cli /opt/ads-agent/_work/_tool/node/22.13.1/x64/bin/node /opt/ads-agent/_work/_tool/node/22.13.1/x64/bin/npm
2026-09-09T11:06:48.7567372Z ; "project" config from /opt/ads-agent/_work/379/s/.npmrc
2026-09-09T11:06:48.7567441Z 
2026-09-09T11:06:48.7567616Z disturl = "http://binario.caixa:8081/repository/nodejs/"
2026-09-09T11:06:48.7567735Z email = (protected)
2026-09-09T11:06:48.7567921Z registry = "http://binario.caixa:8081/repository/npm-all/"
2026-09-09T11:06:48.7568142Z sass_binary_site = "http://binario.caixa:8081/repository/node-sass/"
2026-09-09T11:06:48.7568215Z 
2026-09-09T11:06:48.7568315Z ; "env" config from environment
2026-09-09T11:06:48.7568370Z 
2026-09-09T11:06:48.7568744Z loglevel = "verbose"
2026-09-09T11:06:48.7568930Z userconfig = "/opt/ads-agent/_work/379/npm/820825.npmrc"
2026-09-09T11:06:48.7568989Z 
2026-09-09T11:06:48.7569173Z ; node bin location = /opt/ads-agent/_work/_tool/node/22.13.1/x64/bin/node
2026-09-09T11:06:48.7569304Z ; node version = v22.13.1
2026-09-09T11:06:48.7569469Z ; npm local prefix = /opt/ads-agent/_work/379/s
2026-09-09T11:06:48.7569590Z ; npm version = 10.9.2
2026-09-09T11:06:48.7569744Z ; cwd = /opt/ads-agent/_work/379/s
2026-09-09T11:06:48.7569847Z ; HOME = /home/sadscp01
2026-09-09T11:06:48.7570012Z ; Run `npm config ls -l` to show all defaults.
2026-09-09T11:06:48.7571298Z [command]/opt/ads-agent/_work/_tool/node/22.13.1/x64/bin/npm install --no-audit --verbose
2026-09-09T11:06:48.7571640Z npm info using npm@10.9.2
2026-09-09T11:06:48.7571894Z npm info using node@v22.13.1
2026-09-09T11:06:48.7572343Z npm verbose title npm config list
2026-09-09T11:06:48.7572505Z npm verbose argv "config" "list"
2026-09-09T11:06:48.7572919Z npm verbose logfile logs-max:10 dir:/home/sadscp01/.npm/_logs/2026-09-09T11_06_48_709Z-
2026-09-09T11:06:48.7573195Z npm verbose logfile /home/sadscp01/.npm/_logs/2026-09-09T11_06_48_709Z-debug-0.log
2026-09-09T11:06:48.7573396Z npm verbose cwd /opt/ads-agent/_work/379/s
2026-09-09T11:06:48.7573604Z npm verbose os Linux 5.14.0-362.8.1.el9_3.x86_64
2026-09-09T11:06:48.7573769Z npm verbose node v22.13.1
2026-09-09T11:06:48.7573930Z npm verbose npm  v10.9.2
2026-09-09T11:06:48.7574081Z npm verbose exit 0
2026-09-09T11:06:48.7574229Z npm info ok
2026-09-09T11:06:51.5307785Z npm verbose cli /opt/ads-agent/_work/_tool/node/22.13.1/x64/bin/node /opt/ads-agent/_work/_tool/node/22.13.1/x64/bin/npm
2026-09-09T11:06:51.5512247Z npm info using npm@10.9.2
2026-09-09T11:06:51.5512390Z npm info using node@v22.13.1
2026-09-09T11:06:51.5512502Z npm verbose title npm install
2026-09-09T11:06:51.5512863Z npm verbose argv "install" "--no-audit" "--loglevel" "verbose"
2026-09-09T11:06:51.5513129Z npm verbose logfile logs-max:10 dir:/home/sadscp01/.npm/_logs/2026-09-09T11_06_48_804Z-
2026-09-09T11:06:51.5513394Z npm verbose logfile /home/sadscp01/.npm/_logs/2026-09-09T11_06_48_804Z-debug-0.log
2026-09-09T11:06:51.5513666Z npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fanimations 18ms (cache hit)
2026-09-09T11:06:51.5513922Z npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fcore 9ms (cache hit)
2026-09-09T11:06:51.5514433Z npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fcompiler 7ms (cache hit)
2026-09-09T11:06:51.5514674Z npm http cache http://binario.caixa:8081/repository/npm-all/rxjs 4ms (cache hit)
2026-09-09T11:06:51.5514906Z npm http cache http://binario.caixa:8081/repository/npm-all/zone.js 3ms (cache hit)
2026-09-09T11:06:51.5515151Z npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fcdk 10ms (cache hit)
2026-09-09T11:06:51.5515402Z npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fcommon 8ms (cache hit)
2026-09-09T11:06:51.5515656Z npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fforms 7ms (cache hit)
2026-09-09T11:06:51.5515919Z npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fplatform-browser 10ms (cache hit)
2026-09-09T11:06:51.5516197Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@angular%2fmaterial 59ms (cache revalidated)
2026-09-09T11:06:51.5516501Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@angular%2fmaterial-date-fns-adapter 1415ms (cache updated)
2026-09-09T11:06:51.5516788Z npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fplatform-browser-dynamic 7ms (cache hit)
2026-09-09T11:06:51.5517038Z npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2frouter 7ms (cache hit)
2026-09-09T11:06:51.5517296Z npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fservice-worker 7ms (cache hit)
2026-09-09T11:06:51.5517575Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@caixa%2fsdsc-angular 465ms (cache revalidated)
2026-09-09T11:06:51.5517897Z npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fcdk 9ms (cache hit)
2026-09-09T11:06:51.5518144Z npm http cache http://binario.caixa:8081/repository/npm-all/@angular%2fcdk 9ms (cache hit)
2026-09-09T11:06:51.5518297Z npm verbose stack Error: unable to resolve dependency tree
2026-09-09T11:06:51.5518705Z npm verbose stack     at #failPeerConflict (/opt/ads-agent/_work/_tool/node/22.13.1/x64/lib/node_modules/npm/node_modules/@npmcli/arborist/lib/arborist/build-ideal-tree.js:1363:25)
2026-09-09T11:06:51.5519089Z npm verbose stack     at #loadPeerSet (/opt/ads-agent/_work/_tool/node/22.13.1/x64/lib/node_modules/npm/node_modules/@npmcli/arborist/lib/arborist/build-ideal-tree.js:1329:33)
2026-09-09T11:06:51.5519459Z npm verbose stack     at async #buildDepStep (/opt/ads-agent/_work/_tool/node/22.13.1/x64/lib/node_modules/npm/node_modules/@npmcli/arborist/lib/arborist/build-ideal-tree.js:904:11)
2026-09-09T11:06:51.5519840Z npm verbose stack     at async Arborist.buildIdealTree (/opt/ads-agent/_work/_tool/node/22.13.1/x64/lib/node_modules/npm/node_modules/@npmcli/arborist/lib/arborist/build-ideal-tree.js:181:7)
2026-09-09T11:06:51.5520036Z npm verbose stack     at async Promise.all (index 1)
2026-09-09T11:06:51.5520336Z npm verbose stack     at async Arborist.reify (/opt/ads-agent/_work/_tool/node/22.13.1/x64/lib/node_modules/npm/node_modules/@npmcli/arborist/lib/arborist/reify.js:131:5)
2026-09-09T11:06:51.5520666Z npm verbose stack     at async Install.exec (/opt/ads-agent/_work/_tool/node/22.13.1/x64/lib/node_modules/npm/lib/commands/install.js:150:5)
2026-09-09T11:06:51.5520962Z npm verbose stack     at async Npm.exec (/opt/ads-agent/_work/_tool/node/22.13.1/x64/lib/node_modules/npm/lib/npm.js:207:9)
2026-09-09T11:06:51.5521262Z npm verbose stack     at async module.exports (/opt/ads-agent/_work/_tool/node/22.13.1/x64/lib/node_modules/npm/lib/cli/entry.js:74:5)
2026-09-09T11:06:51.5521416Z npm error code ERESOLVE
2026-09-09T11:06:51.5521540Z npm error ERESOLVE unable to resolve dependency tree
2026-09-09T11:06:51.5521643Z npm error
2026-09-09T11:06:51.5521806Z npm error While resolving: siasc-novo@1.0.0.43
2026-09-09T11:06:51.5521931Z npm error Found: @angular/cdk@undefined
2026-09-09T11:06:51.5522051Z npm error node_modules/@angular/cdk
2026-09-09T11:06:51.5522176Z npm error   @angular/cdk@"20.3.27" from the root project
2026-09-09T11:06:51.5522345Z npm error
2026-09-09T11:06:51.5522443Z npm error Could not resolve dependency:
2026-09-09T11:06:51.5522644Z npm error peer @angular/cdk@"^20.2.14" from @caixa/sdsc-angular@0.1.18
2026-09-09T11:06:51.5522825Z npm error node_modules/@caixa/sdsc-angular
2026-09-09T11:06:51.5523014Z npm error   @caixa/sdsc-angular@"0.1.18" from the root project
2026-09-09T11:06:51.5523130Z npm error
2026-09-09T11:06:51.5523241Z npm error Fix the upstream dependency conflict, or retry
2026-09-09T11:06:51.5523423Z npm error this command with --force or --legacy-peer-deps
2026-09-09T11:06:51.5523571Z npm error to accept an incorrect (and potentially broken) dependency resolution.
2026-09-09T11:06:51.5523689Z npm error
2026-09-09T11:06:51.5523777Z npm error
2026-09-09T11:06:51.5523876Z npm error For a full report see:
2026-09-09T11:06:51.5524081Z npm error /home/sadscp01/.npm/_logs/2026-09-09T11_06_48_804Z-eresolve-report.txt
2026-09-09T11:06:51.5524260Z npm verbose cwd /opt/ads-agent/_work/379/s
2026-09-09T11:06:51.5524444Z npm verbose os Linux 5.14.0-362.8.1.el9_3.x86_64
2026-09-09T11:06:51.5524559Z npm verbose node v22.13.1
2026-09-09T11:06:51.5524664Z npm verbose npm  v10.9.2
2026-09-09T11:06:51.5524765Z npm verbose exit 1
2026-09-09T11:06:51.5524855Z npm verbose code 1
2026-09-09T11:06:51.5525089Z npm error A complete log of this run can be found in: /home/sadscp01/.npm/_logs/2026-09-09T11_06_48_804Z-debug-0.log
2026-09-09T11:06:51.5592138Z ##[warning]Couldn't find a debug log in the cache or working directory
2026-09-09T11:06:51.5598151Z ##[error]Error: Npm failed with return code: 1
2026-09-09T11:06:51.5621778Z ##[section]Finishing: npm install
