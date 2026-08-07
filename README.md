
2026-08-07T18:02:06.6907696Z ##[section]Starting: npm install
2026-08-07T18:02:06.6911671Z ==============================================================================
2026-08-07T18:02:06.6911750Z Task         : npm
2026-08-07T18:02:06.6911803Z Description  : Install and publish npm packages, or run an npm command. Supports npmjs.com and authenticated registries like Azure Artifacts.
2026-08-07T18:02:06.6911892Z Version      : 1.221.0
2026-08-07T18:02:06.6911944Z Author       : Microsoft Corporation
2026-08-07T18:02:06.6911992Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/package/npm
2026-08-07T18:02:06.6912064Z ==============================================================================
2026-08-07T18:02:07.1254284Z [command]/opt/ads-agent/work_ads/_tool/node/12.18.3/x64/bin/npm --version
2026-08-07T18:02:07.2712067Z 6.14.6
2026-08-07T18:02:07.6063503Z [command]/opt/ads-agent/work_ads/_tool/node/12.18.3/x64/bin/npm config list
2026-08-07T18:02:07.7619330Z npm info it worked if it ends with ok
2026-08-07T18:02:07.7619645Z npm verb cli [
2026-08-07T18:02:07.7619745Z ; cli configs
2026-08-07T18:02:07.7620103Z metrics-registry = "http://binario.caixa:8081/repository/npm-all/"
2026-08-07T18:02:07.7620234Z scope = ""
2026-08-07T18:02:07.7620403Z user-agent = "npm/6.14.6 node/v12.18.3 linux x64"
2026-08-07T18:02:07.7620639Z npm verb cli   '/opt/ads-agent/work_ads/_tool/node/12.18.3/x64/bin/node',
2026-08-07T18:02:07.7620851Z npm verb cli   '/opt/ads-agent/work_ads/_tool/node/12.18.3/x64/bin/npm',
2026-08-07T18:02:07.7621015Z npm verb cli   'config',
2026-08-07T18:02:07.7621162Z npm verb cli   'list'
2026-08-07T18:02:07.7621252Z npm verb cli ]
2026-08-07T18:02:07.7621351Z npm info using npm@6.14.6
2026-08-07T18:02:07.7621457Z npm info using node@v12.18.3
2026-08-07T18:02:07.7621564Z npm verb exit [ 0, true ]
2026-08-07T18:02:07.7621672Z npm timing npm Completed in 24ms
2026-08-07T18:02:07.7621771Z npm info ok 
2026-08-07T18:02:07.7621808Z 
2026-08-07T18:02:07.7621900Z ; environment configs
2026-08-07T18:02:07.7622003Z loglevel = "verbose"
2026-08-07T18:02:07.7622209Z userconfig = "/opt/ads-agent/work_ads/7411/npm/791668.npmrc"
2026-08-07T18:02:07.7622320Z 
2026-08-07T18:02:07.7622482Z ; project config /opt/ads-agent/work_ads/7411/s/.npmrc
2026-08-07T18:02:07.7622625Z disturl = "http://binario.caixa:8081/repository/nodejs/"
2026-08-07T18:02:07.7622786Z email = "pipeline-agil@mail.caixa"
2026-08-07T18:02:07.7622972Z registry = "http://binario.caixa:8081/repository/npm-all/"
2026-08-07T18:02:07.7623185Z sass_binary_site = "http://binario.caixa:8081/repository/node-sass/"
2026-08-07T18:02:07.7623555Z 
2026-08-07T18:02:07.7623767Z ; node bin location = /opt/ads-agent/work_ads/_tool/node/12.18.3/x64/bin/node
2026-08-07T18:02:07.7624017Z ; cwd = /opt/ads-agent/work_ads/7411/s
2026-08-07T18:02:07.7624132Z ; HOME = /home/sadscp01
2026-08-07T18:02:07.7624286Z ; "npm config ls -l" to show all defaults.
2026-08-07T18:02:07.7624335Z 
2026-08-07T18:02:07.7625572Z [command]/opt/ads-agent/work_ads/_tool/node/12.18.3/x64/bin/npm install --no-audit --verbose
2026-08-07T18:02:25.1849668Z npm info it worked if it ends with ok
2026-08-07T18:02:25.1849989Z npm verb cli [
2026-08-07T18:02:25.1850511Z npm verb cli   '/opt/ads-agent/work_ads/_tool/node/12.18.3/x64/bin/node',
2026-08-07T18:02:25.1850857Z npm verb cli   '/opt/ads-agent/work_ads/_tool/node/12.18.3/x64/bin/npm',
2026-08-07T18:02:25.1851129Z npm verb cli   'install',
2026-08-07T18:02:25.1851353Z npm verb cli   '--no-audit',
2026-08-07T18:02:25.1851586Z npm verb cli   '--verbose'
2026-08-07T18:02:25.1851737Z npm verb cli ]
2026-08-07T18:02:25.1851931Z npm info using npm@6.14.6
2026-08-07T18:02:25.1852119Z npm info using node@v12.18.3
2026-08-07T18:02:25.1852371Z npm verb npm-session 235c9015b8a1cdad
2026-08-07T18:02:25.1852698Z npm info lifecycle siaef-web@1.0.0-snapshot~preinstall: siaef-web@1.0.0-snapshot
2026-08-07T18:02:25.1853008Z npm timing stage:loadCurrentTree Completed in 10ms
2026-08-07T18:02:25.1853253Z npm timing stage:loadIdealTree:cloneCurrentTree Completed in 0ms
2026-08-07T18:02:25.1853934Z npm timing stage:loadIdealTree:loadShrinkwrap Completed in 4ms
2026-08-07T18:02:25.1854386Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@types%2fdatatables.net-select 127ms (from cache)
2026-08-07T18:02:25.1854835Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@types%2fsystemjs 124ms (from cache)
2026-08-07T18:02:25.1855282Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@types%2fdatatables.net 135ms (from cache)
2026-08-07T18:02:25.1855727Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@compodoc%2fcompodoc 141ms (from cache)
2026-08-07T18:02:25.1856177Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@babel%2fcompat-data 148ms (from cache)
2026-08-07T18:02:25.1856603Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@types%2fjasmine 153ms (from cache)
2026-08-07T18:02:25.1857024Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@types%2fjquery 157ms (from cache)
2026-08-07T18:02:25.1857463Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types/jasmine/-/jasmine-2.5.53.tgz 49ms
2026-08-07T18:02:25.1858074Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types/jquery/-/jquery-3.2.1.tgz 50ms
2026-08-07T18:02:25.1858516Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@types%2fzone.js 68ms (from cache)
2026-08-07T18:02:25.1858942Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/codelyzer 71ms (from cache)
2026-08-07T18:02:25.1859371Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@types%2fyargs 79ms (from cache)
2026-08-07T18:02:25.1859787Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular%2fcdk 284ms (from cache)
2026-08-07T18:02:25.1860217Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/debug 112ms (from cache)
2026-08-07T18:02:25.1860629Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/jasmine-core 111ms (from cache)
2026-08-07T18:02:25.1861083Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types/zone.js/-/zone.js-0.0.27.tgz 56ms (from cache)
2026-08-07T18:02:25.1861549Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular-devkit%2fbuild-angular 337ms (from cache)
2026-08-07T18:02:25.1862006Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/debug/-/debug-2.6.9.tgz 85ms (from cache)
2026-08-07T18:02:25.1862419Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/jasmine-spec-reporter 168ms (from cache)
2026-08-07T18:02:25.1863026Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/jasmine-core/-/jasmine-core-2.7.0.tgz 98ms
2026-08-07T18:02:25.1863796Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/jasmine-spec-reporter/-/jasmine-spec-reporter-4.1.1.tgz 27ms (from cache)
2026-08-07T18:02:25.1864248Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/karma-cli 74ms (from cache)
2026-08-07T18:02:25.1864681Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/karma-chrome-launcher 80ms (from cache)
2026-08-07T18:02:25.1865137Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/karma-coverage-istanbul-reporter 77ms (from cache)
2026-08-07T18:02:25.1865571Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/karma-jasmine 79ms (from cache)
2026-08-07T18:02:25.1866010Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/karma-jasmine-html-reporter 77ms (from cache)
2026-08-07T18:02:25.1866463Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma-cli/-/karma-cli-1.0.1.tgz 20ms (from cache)
2026-08-07T18:02:25.1866984Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma-chrome-launcher/-/karma-chrome-launcher-2.2.0.tgz 23ms (from cache)



2026-08-07T18:02:06.6907696Z ##[section]Starting: npm install
2026-08-07T18:02:06.6911671Z ==============================================================================
2026-08-07T18:02:06.6911750Z Task         : npm
2026-08-07T18:02:06.6911803Z Description  : Install and publish npm packages, or run an npm command. Supports npmjs.com and authenticated registries like Azure Artifacts.
2026-08-07T18:02:06.6911892Z Version      : 1.221.0
2026-08-07T18:02:06.6911944Z Author       : Microsoft Corporation
2026-08-07T18:02:06.6911992Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/package/npm
2026-08-07T18:02:06.6912064Z ==============================================================================
2026-08-07T18:02:07.1254284Z [command]/opt/ads-agent/work_ads/_tool/node/12.18.3/x64/bin/npm --version
2026-08-07T18:02:07.2712067Z 6.14.6
2026-08-07T18:02:07.6063503Z [command]/opt/ads-agent/work_ads/_tool/node/12.18.3/x64/bin/npm config list
2026-08-07T18:02:07.7619330Z npm info it worked if it ends with ok
2026-08-07T18:02:07.7619645Z npm verb cli [
2026-08-07T18:02:07.7619745Z ; cli configs
2026-08-07T18:02:07.7620103Z metrics-registry = "http://binario.caixa:8081/repository/npm-all/"
2026-08-07T18:02:07.7620234Z scope = ""
2026-08-07T18:02:07.7620403Z user-agent = "npm/6.14.6 node/v12.18.3 linux x64"
2026-08-07T18:02:07.7620639Z npm verb cli   '/opt/ads-agent/work_ads/_tool/node/12.18.3/x64/bin/node',
2026-08-07T18:02:07.7620851Z npm verb cli   '/opt/ads-agent/work_ads/_tool/node/12.18.3/x64/bin/npm',
2026-08-07T18:02:07.7621015Z npm verb cli   'config',
2026-08-07T18:02:07.7621162Z npm verb cli   'list'
2026-08-07T18:02:07.7621252Z npm verb cli ]
2026-08-07T18:02:07.7621351Z npm info using npm@6.14.6
2026-08-07T18:02:07.7621457Z npm info using node@v12.18.3
2026-08-07T18:02:07.7621564Z npm verb exit [ 0, true ]
2026-08-07T18:02:07.7621672Z npm timing npm Completed in 24ms
2026-08-07T18:02:07.7621771Z npm info ok 
2026-08-07T18:02:07.7621808Z 
2026-08-07T18:02:07.7621900Z ; environment configs
2026-08-07T18:02:07.7622003Z loglevel = "verbose"
2026-08-07T18:02:07.7622209Z userconfig = "/opt/ads-agent/work_ads/7411/npm/791668.npmrc"
2026-08-07T18:02:07.7622320Z 
2026-08-07T18:02:07.7622482Z ; project config /opt/ads-agent/work_ads/7411/s/.npmrc
2026-08-07T18:02:07.7622625Z disturl = "http://binario.caixa:8081/repository/nodejs/"
2026-08-07T18:02:07.7622786Z email = "pipeline-agil@mail.caixa"
2026-08-07T18:02:07.7622972Z registry = "http://binario.caixa:8081/repository/npm-all/"
2026-08-07T18:02:07.7623185Z sass_binary_site = "http://binario.caixa:8081/repository/node-sass/"
2026-08-07T18:02:07.7623555Z 
2026-08-07T18:02:07.7623767Z ; node bin location = /opt/ads-agent/work_ads/_tool/node/12.18.3/x64/bin/node
2026-08-07T18:02:07.7624017Z ; cwd = /opt/ads-agent/work_ads/7411/s
2026-08-07T18:02:07.7624132Z ; HOME = /home/sadscp01
2026-08-07T18:02:07.7624286Z ; "npm config ls -l" to show all defaults.
2026-08-07T18:02:07.7624335Z 
2026-08-07T18:02:07.7625572Z [command]/opt/ads-agent/work_ads/_tool/node/12.18.3/x64/bin/npm install --no-audit --verbose
2026-08-07T18:02:25.1849668Z npm info it worked if it ends with ok
2026-08-07T18:02:25.1849989Z npm verb cli [
2026-08-07T18:02:25.1850511Z npm verb cli   '/opt/ads-agent/work_ads/_tool/node/12.18.3/x64/bin/node',
2026-08-07T18:02:25.1850857Z npm verb cli   '/opt/ads-agent/work_ads/_tool/node/12.18.3/x64/bin/npm',
2026-08-07T18:02:25.1851129Z npm verb cli   'install',
2026-08-07T18:02:25.1851353Z npm verb cli   '--no-audit',
2026-08-07T18:02:25.1851586Z npm verb cli   '--verbose'
2026-08-07T18:02:25.1851737Z npm verb cli ]
2026-08-07T18:02:25.1851931Z npm info using npm@6.14.6
2026-08-07T18:02:25.1852119Z npm info using node@v12.18.3
2026-08-07T18:02:25.1852371Z npm verb npm-session 235c9015b8a1cdad
2026-08-07T18:02:25.1852698Z npm info lifecycle siaef-web@1.0.0-snapshot~preinstall: siaef-web@1.0.0-snapshot
2026-08-07T18:02:25.1853008Z npm timing stage:loadCurrentTree Completed in 10ms
2026-08-07T18:02:25.1853253Z npm timing stage:loadIdealTree:cloneCurrentTree Completed in 0ms
2026-08-07T18:02:25.1853934Z npm timing stage:loadIdealTree:loadShrinkwrap Completed in 4ms
2026-08-07T18:02:25.1854386Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@types%2fdatatables.net-select 127ms (from cache)
2026-08-07T18:02:25.1854835Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@types%2fsystemjs 124ms (from cache)
2026-08-07T18:02:25.1855282Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@types%2fdatatables.net 135ms (from cache)
2026-08-07T18:02:25.1855727Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@compodoc%2fcompodoc 141ms (from cache)
2026-08-07T18:02:25.1856177Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@babel%2fcompat-data 148ms (from cache)
2026-08-07T18:02:25.1856603Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@types%2fjasmine 153ms (from cache)
2026-08-07T18:02:25.1857024Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@types%2fjquery 157ms (from cache)
2026-08-07T18:02:25.1857463Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types/jasmine/-/jasmine-2.5.53.tgz 49ms
2026-08-07T18:02:25.1858074Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types/jquery/-/jquery-3.2.1.tgz 50ms
2026-08-07T18:02:25.1858516Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@types%2fzone.js 68ms (from cache)
2026-08-07T18:02:25.1858942Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/codelyzer 71ms (from cache)
2026-08-07T18:02:25.1859371Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@types%2fyargs 79ms (from cache)
2026-08-07T18:02:25.1859787Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular%2fcdk 284ms (from cache)
2026-08-07T18:02:25.1860217Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/debug 112ms (from cache)
2026-08-07T18:02:25.1860629Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/jasmine-core 111ms (from cache)
2026-08-07T18:02:25.1861083Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types/zone.js/-/zone.js-0.0.27.tgz 56ms (from cache)
2026-08-07T18:02:25.1861549Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular-devkit%2fbuild-angular 337ms (from cache)
2026-08-07T18:02:25.1862006Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/debug/-/debug-2.6.9.tgz 85ms (from cache)
2026-08-07T18:02:25.1862419Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/jasmine-spec-reporter 168ms (from cache)
2026-08-07T18:02:25.1863026Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/jasmine-core/-/jasmine-core-2.7.0.tgz 98ms
2026-08-07T18:02:25.1863796Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/jasmine-spec-reporter/-/jasmine-spec-reporter-4.1.1.tgz 27ms (from cache)
2026-08-07T18:02:25.1864248Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/karma-cli 74ms (from cache)
2026-08-07T18:02:25.1864681Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/karma-chrome-launcher 80ms (from cache)
2026-08-07T18:02:25.1865137Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/karma-coverage-istanbul-reporter 77ms (from cache)
2026-08-07T18:02:25.1865571Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/karma-jasmine 79ms (from cache)
2026-08-07T18:02:25.1866010Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/karma-jasmine-html-reporter 77ms (from cache)
2026-08-07T18:02:25.1866463Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma-cli/-/karma-cli-1.0.1.tgz 20ms (from cache)
2026-08-07T18:02:25.1866984Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma-chrome-launcher/-/karma-chrome-launcher-2.2.0.tgz 23ms (from cache)
