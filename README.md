2026-07-24T11:40:42.8245442Z ##[section]Starting: npm install
2026-07-24T11:40:42.8251059Z ==============================================================================
2026-07-24T11:40:42.8251198Z Task         : npm
2026-07-24T11:40:42.8251302Z Description  : Install and publish npm packages, or run an npm command. Supports npmjs.com and authenticated registries like Azure Artifacts.
2026-07-24T11:40:42.8251437Z Version      : 1.221.0
2026-07-24T11:40:42.8251510Z Author       : Microsoft Corporation
2026-07-24T11:40:42.8251581Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/package/npm
2026-07-24T11:40:42.8251713Z ==============================================================================
2026-07-24T11:40:43.0447165Z [command]/opt/ads-agent/_work/_tool/node/10.24.1/x64/bin/npm --version
2026-07-24T11:40:43.1899665Z 6.14.12
2026-07-24T11:40:43.5201924Z [command]/opt/ads-agent/_work/_tool/node/10.24.1/x64/bin/npm config list
2026-07-24T11:40:43.6762839Z npm info it worked if it ends with ok
2026-07-24T11:40:43.6763409Z npm verb cli [ '/opt/ads-agent/_work/_tool/node/10.24.1/x64/bin/node',
2026-07-24T11:40:43.6763541Z ; cli configs
2026-07-24T11:40:43.6763770Z metrics-registry = "http://binario.caixa:8081/repository/npm-all/"
2026-07-24T11:40:43.6763901Z scope = ""
2026-07-24T11:40:43.6764072Z user-agent = "npm/6.14.12 node/v10.24.1 linux x64"
2026-07-24T11:40:43.6764287Z npm verb cli   '/opt/ads-agent/_work/_tool/node/10.24.1/x64/bin/npm',
2026-07-24T11:40:43.6764448Z npm verb cli   'config',
2026-07-24T11:40:43.6764589Z npm verb cli   'list' ]
2026-07-24T11:40:43.6764701Z npm info using npm@6.14.12
2026-07-24T11:40:43.6765110Z npm info using node@v10.24.1
2026-07-24T11:40:43.6765247Z npm verb exit [ 0, true ]
2026-07-24T11:40:43.6765349Z npm timing npm Completed in 26ms
2026-07-24T11:40:43.6765454Z npm info ok 
2026-07-24T11:40:43.6765500Z 
2026-07-24T11:40:43.6765591Z ; environment configs
2026-07-24T11:40:43.6765700Z loglevel = "verbose"
2026-07-24T11:40:43.6765879Z userconfig = "/opt/ads-agent/_work/341/npm/779602.npmrc"
2026-07-24T11:40:43.6765943Z 
2026-07-24T11:40:43.6766105Z ; project config /opt/ads-agent/_work/341/s/web/.npmrc
2026-07-24T11:40:43.6766256Z disturl = "http://binario.caixa:8081/repository/nodejs/"
2026-07-24T11:40:43.6766434Z email = "pipeline-agil@mail.caixa"
2026-07-24T11:40:43.6772722Z registry = "http://binario.caixa:8081/repository/npm-all/"
2026-07-24T11:40:43.6773013Z sass_binary_site = "http://binario.caixa:8081/repository/node-sass/"
2026-07-24T11:40:43.6773106Z 
2026-07-24T11:40:43.6773302Z ; node bin location = /opt/ads-agent/_work/_tool/node/10.24.1/x64/bin/node
2026-07-24T11:40:43.6773502Z ; cwd = /opt/ads-agent/_work/341/s/web
2026-07-24T11:40:43.6773618Z ; HOME = /home/sadscp01
2026-07-24T11:40:43.6773781Z ; "npm config ls -l" to show all defaults.
2026-07-24T11:40:43.6773835Z 
2026-07-24T11:40:43.6774974Z [command]/opt/ads-agent/_work/_tool/node/10.24.1/x64/bin/npm install --no-audit --verbose
2026-07-24T11:51:55.1212189Z npm info it worked if it ends with ok
2026-07-24T11:51:55.1213038Z npm verb cli [ '/opt/ads-agent/_work/_tool/node/10.24.1/x64/bin/node',
2026-07-24T11:51:55.1213447Z npm verb cli   '/opt/ads-agent/_work/_tool/node/10.24.1/x64/bin/npm',
2026-07-24T11:51:55.1221064Z npm verb cli   'install',
2026-07-24T11:51:55.1221526Z npm verb cli   '--no-audit',
2026-07-24T11:51:55.1221861Z npm verb cli   '--verbose' ]
2026-07-24T11:51:55.1222737Z npm info using npm@6.14.12
2026-07-24T11:51:55.1222934Z npm info using node@v10.24.1
2026-07-24T11:51:55.1223211Z npm verb npm-session ca59879d6ec8190b
2026-07-24T11:51:55.1223527Z npm info lifecycle siceds@1.31.0-5~preinstall: siceds@1.31.0-5
2026-07-24T11:51:55.1223805Z npm timing stage:loadCurrentTree Completed in 10ms
2026-07-24T11:51:55.1224060Z npm timing stage:loadIdealTree:cloneCurrentTree Completed in 0ms
2026-07-24T11:51:55.1225070Z npm timing stage:loadIdealTree:loadShrinkwrap Completed in 4ms
2026-07-24T11:51:55.1226399Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fjasminewd2 47ms (from cache)
2026-07-24T11:51:55.1227221Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fjspdf 54ms (from cache)
2026-07-24T11:51:55.1227696Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/jasmine-spec-reporter 38ms (from cache)
2026-07-24T11:51:55.1228140Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/jasmine-core 95ms (from cache)
2026-07-24T11:51:55.1228741Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/codelyzer 117ms (from cache)
2026-07-24T11:51:55.1229259Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma-chrome-launcher 38ms (from cache)
2026-07-24T11:51:55.1229747Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma-coverage-istanbul-reporter 45ms (from cache)
2026-07-24T11:51:55.1230201Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fjasmine 177ms (from cache)
2026-07-24T11:51:55.1230636Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma-jasmine 76ms (from cache)
2026-07-24T11:51:55.1231086Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma-jasmine-html-reporter 54ms (from cache)
2026-07-24T11:51:55.1231552Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma-sonarqube-reporter 22ms (from cache)
2026-07-24T11:51:55.1232011Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma-junit-reporter 32ms (from cache)
2026-07-24T11:51:55.1232466Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma-spec-reporter 20ms (from cache)
2026-07-24T11:51:55.1233016Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/protractor 38ms (from cache)
2026-07-24T11:51:55.1233750Z npm WARN deprecated protractor@5.4.4: We have news to share - Protractor is deprecated and will reach end-of-life by Summer 2023. To learn more and find out about other options please refer to this post on the Angular blog. Thank you for using and contributing to Protractor. https://goo.gle/state-of-e2e-in-angular
2026-07-24T11:51:55.1234565Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ts-node 71ms (from cache)
2026-07-24T11:51:55.1235005Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fnode 326ms (from cache)
2026-07-24T11:51:55.1235446Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/tslint 286ms (from cache)
2026-07-24T11:51:55.1235896Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular%2flanguage-service 659ms (from cache)
2026-07-24T11:51:55.1236330Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma 657ms (from cache)
2026-07-24T11:51:55.1236762Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@angular%2fflex-layout 26ms (from cache)
2026-07-24T11:51:55.1237302Z npm WARN deprecated @angular/flex-layout@7.0.0-beta.24: This package has been deprecated. Please see https://blog.angular.io/modern-css-in-angular-layouts-4a259dca9127
2026-07-24T11:51:55.1237795Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular%2fcli 836ms (from cache)
2026-07-24T11:51:55.1238244Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular%2fcompiler-cli 869ms (from cache)
2026-07-24T11:51:55.1238775Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular%2fanimations 685ms (from cache)
2026-07-24T11:51:55.1239226Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular%2fcompiler 492ms (from cache)
2026-07-24T11:51:55.1239649Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular-devkit%2fbuild-angular 1078ms (from cache)
2026-07-24T11:51:55.1240070Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular%2fcommon 655ms (from cache)
2026-07-24T11:51:55.1240428Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fhtml2canvas 13ms (from cache)
2026-07-24T11:51:55.1240694Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/typescript 994ms (from cache)
2026-07-24T11:51:55.1241032Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fxlsx 145ms (from cache)
2026-07-24T11:51:55.1241383Z npm WARN deprecated @types/xlsx@0.0.36: This is a stub types definition for xlsx (https://github.com/sheetjs/js-xlsx). xlsx provides its own type definitions, so you don't need @types/xlsx installed!
2026-07-24T11:51:55.1241680Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular%2fcdk 1081ms (from cache)
2026-07-24T11:51:55.1241958Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/chartjs-plugin-datalabels 38ms (from cache)
2026-07-24T11:51:55.1242223Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/file-system 5ms (from cache)
2026-07-24T11:51:55.1242480Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/font-awesome 3ms (from cache)
2026-07-24T11:51:55.1242733Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/chart.js 60ms (from cache)
2026-07-24T11:51:55.1243012Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular%2fmaterial-moment-adapter 555ms (from cache)
2026-07-24T11:51:55.1243288Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fs-filesystem 25ms (from cache)
2026-07-24T11:51:55.1243546Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/hammerjs 25ms (from cache)
2026-07-24T11:51:55.1243796Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/jspdf 9ms (from cache)
2026-07-24T11:51:55.1244056Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/html2canvas 15ms (from cache)
2026-07-24T11:51:55.1244357Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/keycloak-angular 20ms (from cache)
2026-07-24T11:51:55.1244618Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/core-js 84ms (from cache)
2026-07-24T11:51:55.1245141Z npm WARN deprecated core-js@2.6.12: core-js@<3.23.3 is no longer maintained and not recommended for usage due to the number of issues. Because of the V8 engine whims, feature detection in old core-js versions could cause a slowdown up to 100x even if nothing is polyfilled. Some versions have web compatibility issues. Please, upgrade your dependencies to the actual version of core-js.
2026-07-24T11:51:55.1245526Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular%2fmaterial 636ms (from cache)
2026-07-24T11:51:55.1245778Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/moment 107ms (from cache)
2026-07-24T11:51:55.1246041Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/keycloak-js 145ms (from cache)
2026-07-24T11:51:55.1246305Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular%2fcore 967ms (from cache)
2026-07-24T11:51:55.1246678Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/lodash 187ms (from cache)
2026-07-24T11:51:55.1246943Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ng2-charts 162ms (from cache)
2026-07-24T11:51:55.1247205Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ngx-currency 48ms (from cache)
2026-07-24T11:51:55.1247673Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular%2fforms 888ms (from cache)
2026-07-24T11:51:55.1247936Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ngx-spinner 41ms (from cache)
2026-07-24T11:51:55.1248204Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ngx-bootstrap 131ms (from cache)
2026-07-24T11:51:55.1248485Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ngx-clipboard 99ms (from cache)
2026-07-24T11:51:55.1248962Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ts-xlsx 15ms (from cache)
2026-07-24T11:51:55.1249286Z npm WARN deprecated ts-xlsx@0.0.11: since version 0.10.3 of xlsx, it comes with embeded typings
2026-07-24T11:51:55.1249613Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ngx-editor 82ms (from cache)
2026-07-24T11:51:55.1250006Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ngx-toastr 66ms (from cache)
2026-07-24T11:51:55.1250262Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/tslib 22ms (from cache)
2026-07-24T11:51:55.1250531Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/css-selector-tokenizer 5ms (from cache)
2026-07-24T11:51:55.1250797Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/app-root-path 6ms (from cache)
2026-07-24T11:51:55.1251051Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/colors 10ms (from cache)
2026-07-24T11:51:55.1251297Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cssauron 9ms (from cache)
2026-07-24T11:51:55.1251552Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/semver-dsl 6ms (from cache)
2026-07-24T11:51:55.1251810Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/sprintf-js 8ms (from cache)
2026-07-24T11:51:55.1252303Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fs-access 5ms (from cache)
2026-07-24T11:51:55.1252580Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/zone.js 44ms (from cache)
2026-07-24T11:51:55.1252833Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/which 16ms (from cache)
2026-07-24T11:51:55.1253093Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/istanbul-api 21ms (from cache)
2026-07-24T11:51:55.1253350Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fglob 10ms (from cache)
2026-07-24T11:51:55.1253659Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fkarma 14ms (from cache)
2026-07-24T11:51:55.1253922Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/ngx-mask 138ms (from cache)
2026-07-24T11:51:55.1254188Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fmkdirp 22ms (from cache)
2026-07-24T11:51:55.1254455Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/clone-regexp 21ms (from cache)
2026-07-24T11:51:55.1254721Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/rxjs 122ms (from cache)
2026-07-24T11:51:55.1255145Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/source-map 81ms (from cache)
2026-07-24T11:51:55.1255583Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular%2fplatform-browser 874ms (from cache)
2026-07-24T11:51:55.1256007Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/js2xmlparser 52ms (from cache)
2026-07-24T11:51:55.1256404Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/path-is-absolute 36ms (from cache)
2026-07-24T11:51:55.1256667Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/minimatch 103ms (from cache)
2026-07-24T11:51:55.1256928Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/blocking-proxy 5ms (from cache)
2026-07-24T11:51:55.1257191Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fq 11ms (from cache)
2026-07-24T11:51:55.1257448Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/browserstack 9ms (from cache)
2026-07-24T11:51:55.1257709Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/xmlbuilder 59ms (from cache)
2026-07-24T11:51:55.1258015Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/winston 86ms (from cache)
2026-07-24T11:51:55.1258432Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular%2frouter 833ms (from cache)
2026-07-24T11:51:55.1258896Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular%2fplatform-browser-dynamic 875ms (from cache)
2026-07-24T11:51:55.1259210Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/mkdirp 164ms (from cache)
2026-07-24T11:51:55.1259623Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/jasminewd2 42ms (from cache)
2026-07-24T11:51:55.1260085Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/chalk 90ms (from cache)
2026-07-24T11:51:55.1260487Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/glob 179ms (from cache)
2026-07-24T11:51:55.1260920Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fselenium-webdriver 118ms (from cache)
2026-07-24T11:51:55.1261320Z npm WARN deprecated glob@7.2.3: Old versions of glob are not supported, and contain widely publicized security vulnerabilities, which have been fixed in the current version. Please update. Support for old versions may be purchased (at exorbitant rates) by contacting i@izs.me
2026-07-24T11:51:55.1261776Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/jasmine 84ms (from cache)
2026-07-24T11:51:55.1262199Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/webdriver-js-extender 41ms (from cache)
2026-07-24T11:51:55.1262577Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/q 111ms (from cache)
2026-07-24T11:51:55.1262923Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/yn 41ms (from cache)
2026-07-24T11:51:55.1263297Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/source-map-support 78ms (from cache)
2026-07-24T11:51:55.1263731Z npm WARN deprecated q@1.4.1: You or someone you depend on is using Q, the JavaScript Promise library that gave JavaScript developers strong feelings about promises. They can almost certainly migrate to the native JavaScript promise now. Thank you literally everyone for joining me in this bet against the odds. Be excellent to each other.
2026-07-24T11:51:55.1264196Z npm WARN deprecated 
2026-07-24T11:51:55.1264422Z npm WARN deprecated (For a CapTP with native promises, see @endo/eventual-send and @endo/captp)
2026-07-24T11:51:55.1264672Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/arrify 17ms (from cache)
2026-07-24T11:51:55.1264935Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/webdriver-manager 70ms (from cache)
2026-07-24T11:51:55.1265199Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/make-error 9ms (from cache)
2026-07-24T11:51:55.1265459Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/buffer-from 9ms (from cache)
2026-07-24T11:51:55.1265716Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/minimist 14ms (from cache)
2026-07-24T11:51:55.1265973Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/diff 46ms (from cache)
2026-07-24T11:51:55.1266227Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/glob 185ms (from cache)
2026-07-24T11:51:55.1266492Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/builtin-modules 23ms (from cache)
2026-07-24T11:51:55.1266760Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/babel-code-frame 29ms (from cache)
2026-07-24T11:51:55.1267015Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/saucelabs 163ms (from cache)
2026-07-24T11:51:55.1267270Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/di 5ms (from cache)
2026-07-24T11:51:55.1267536Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/selenium-webdriver 136ms (from cache)
2026-07-24T11:51:55.1267799Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/tmp 14ms (from cache)
2026-07-24T11:51:55.1268052Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/js-yaml 33ms (from cache)
2026-07-24T11:51:55.1268305Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/mime 27ms (from cache)
2026-07-24T11:51:55.1268630Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/qjobs 21ms (from cache)
2026-07-24T11:51:55.1268920Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/resolve 49ms (from cache)
2026-07-24T11:51:55.1269172Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/semver 52ms (from cache)
2026-07-24T11:51:55.1269502Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/tsutils 59ms (from cache)
2026-07-24T11:51:55.1269753Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/commander 85ms (from cache)
2026-07-24T11:51:55.1270003Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/braces 56ms (from cache)
2026-07-24T11:51:55.1270256Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/yargs 180ms (from cache)
2026-07-24T11:51:55.1270517Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/optimist 20ms (from cache)
2026-07-24T11:51:55.1270772Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/rimraf 64ms (from cache)
2026-07-24T11:51:55.1271026Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/useragent 21ms (from cache)
2026-07-24T11:51:55.1271199Z npm WARN deprecated rimraf@2.7.1: Rimraf versions prior to v4 are no longer supported
2026-07-24T11:51:55.1271447Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/chokidar 54ms (from cache)
2026-07-24T11:51:55.1271707Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/safe-buffer 14ms (from cache)
2026-07-24T11:51:55.1271983Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/log4js 90ms (from cache)
2026-07-24T11:51:55.1272242Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/http-proxy 42ms (from cache)
2026-07-24T11:51:55.1272426Z npm WARN deprecated log4js@4.5.1: 4.x is no longer supported. Please upgrade to 6.x or higher.
2026-07-24T11:51:55.1272704Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/connect 108ms (from cache)
2026-07-24T11:51:55.1272964Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/graceful-fs 45ms (from cache)
2026-07-24T11:51:55.1273222Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/flatted 102ms (from cache)
2026-07-24T11:51:55.1273576Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/isbinaryfile 43ms (from cache)
2026-07-24T11:51:55.1273835Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/socket.io 84ms (from cache)
2026-07-24T11:51:55.1274094Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/dom-serialize 30ms (from cache)
2026-07-24T11:51:55.1274352Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/range-parser 33ms (from cache)
2026-07-24T11:51:55.1274673Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/bluebird 122ms (from cache)
2026-07-24T11:51:55.1274939Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ini 34ms (from cache)
2026-07-24T11:51:55.1275205Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@yarnpkg%2flockfile 8ms (from cache)
2026-07-24T11:51:55.1275389Z npm WARN deprecated ini@1.3.5: Please update to ini >=1.3.6 to avoid a prototype pollution issue
2026-07-24T11:51:55.1275636Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/open 44ms (from cache)
2026-07-24T11:51:55.1275930Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/symbol-observable 16ms (from cache)
2026-07-24T11:51:55.1276198Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/npm-package-arg 26ms (from cache)
2026-07-24T11:51:55.1276464Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/body-parser 111ms (from cache)
2026-07-24T11:51:55.1276728Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/canonical-path 12ms (from cache)
2026-07-24T11:51:55.1276981Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/shelljs 38ms (from cache)
2026-07-24T11:51:55.1277246Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/dependency-graph 24ms (from cache)
2026-07-24T11:51:55.1277512Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/reflect-metadata 20ms (from cache)
2026-07-24T11:51:55.1277803Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/inquirer 109ms (from cache)
2026-07-24T11:51:55.1278065Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/convert-source-map 26ms (from cache)
2026-07-24T11:51:55.1278320Z npm WARN deprecated glob@7.1.3: Old versions of glob are not supported, and contain widely publicized security vulnerabilities, which have been fixed in the current version. Please update. Support for old versions may be purchased (at exorbitant rates) by contacting i@izs.me
2026-07-24T11:51:55.1278708Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/pacote 152ms (from cache)
2026-07-24T11:51:55.1278982Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/magic-string 114ms (from cache)
2026-07-24T11:51:55.1279234Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/parse5 16ms (from cache)
2026-07-24T11:51:55.1279507Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@schematics%2fupdate 168ms (from cache)
2026-07-24T11:51:55.1279870Z npm WARN deprecated @schematics/update@0.13.10: This was an internal-only Angular package up through Angular v11 which is no longer used or maintained. Upgrade Angular to v12+ to remove this dependency.
2026-07-24T11:51:55.1280163Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/stylus 33ms (from cache)
2026-07-24T11:51:55.1280417Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/less 70ms (from cache)
2026-07-24T11:51:55.1280675Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/clean-css 26ms (from cache)
2026-07-24T11:51:55.1280965Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/node-sass 35ms (from cache)
2026-07-24T11:51:55.1281214Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/tree-kill 25ms (from cache)
2026-07-24T11:51:55.1281478Z npm WARN deprecated node-sass@4.13.1: Node Sass is no longer supported. Please use `sass` or `sass-embedded` instead.
2026-07-24T11:51:55.1281735Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ajv 132ms (from cache)
2026-07-24T11:51:55.1281992Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/raw-loader 29ms (from cache)
2026-07-24T11:51:55.1282253Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/file-loader 19ms (from cache)
2026-07-24T11:51:55.1282512Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/less-loader 25ms (from cache)
2026-07-24T11:51:55.1282798Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/postcss 109ms (from cache)
2026-07-24T11:51:55.1283061Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/loader-utils 30ms (from cache)
2026-07-24T11:51:55.1283377Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/sass-loader 44ms (from cache)
2026-07-24T11:51:55.1283746Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/style-loader 43ms (from cache)
2026-07-24T11:51:55.1284069Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/stylus-loader 24ms (from cache)
2026-07-24T11:51:55.1284330Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/postcss-import 13ms (from cache)
2026-07-24T11:51:55.1284592Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/webpack-merge 21ms (from cache)
2026-07-24T11:51:55.1284853Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/postcss-loader 18ms (from cache)
2026-07-24T11:51:55.1285113Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/webpack-sources 19ms (from cache)
2026-07-24T11:51:55.1285397Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/source-map-loader 14ms (from cache)
2026-07-24T11:51:55.1285676Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular-devkit%2farchitect 334ms (from cache)
2026-07-24T11:51:55.1285954Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/stats-webpack-plugin 8ms (from cache)
2026-07-24T11:51:55.1286273Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@schematics%2fangular 387ms (from cache)
2026-07-24T11:51:55.1286551Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular-devkit%2fcore 410ms (from cache)
2026-07-24T11:51:55.1286839Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular-devkit%2fschematics 422ms (from cache)
2026-07-24T11:51:55.1287109Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/copy-webpack-plugin 135ms (from cache)
2026-07-24T11:51:55.1287386Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma-source-map-support 38ms (from cache)
2026-07-24T11:51:55.1287665Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/license-webpack-plugin 144ms (from cache)
2026-07-24T11:51:55.1287945Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/circular-dependency-plugin 8ms (from cache)
2026-07-24T11:51:55.1288222Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/terser-webpack-plugin 159ms (from cache)
2026-07-24T11:51:55.1288502Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/istanbul-instrumenter-loader 18ms (from cache)
2026-07-24T11:51:55.1288858Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/speed-measure-webpack-plugin 19ms (from cache)
2026-07-24T11:51:55.1289135Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/mini-css-extract-plugin 77ms (from cache)
2026-07-24T11:51:55.1289415Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/webpack-subresource-integrity 20ms (from cache)
2026-07-24T11:51:55.1289733Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/webpack-dev-middleware 165ms (from cache)
2026-07-24T11:51:55.1290006Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/webpack-dev-server 240ms (from cache)
2026-07-24T11:51:55.1290271Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/file-match 35ms (from cache)
2026-07-24T11:51:55.1290538Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/autoprefixer 367ms (from cache)
2026-07-24T11:51:55.1290803Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/utils-extend 42ms (from cache)
2026-07-24T11:51:55.1291064Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/babel-polyfill 15ms (from cache)
2026-07-24T11:51:55.1291327Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/babel-runtime 22ms (from cache)
2026-07-24T11:51:55.1291590Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fjquery 120ms (from cache)
2026-07-24T11:51:55.1291854Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/chartjs-color 36ms (from cache)
2026-07-24T11:51:55.1292106Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ramda 24ms (from cache)
2026-07-24T11:51:55.1292359Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/canvg 23ms (from cache)
2026-07-24T11:51:55.1292614Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/omggif 32ms (from cache)
2026-07-24T11:51:55.1292875Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/text-segmentation 6ms (from cache)
2026-07-24T11:51:55.1293133Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/xlsx 148ms (from cache)
2026-07-24T11:51:55.1293459Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/css-line-break 19ms (from cache)
2026-07-24T11:51:55.1293731Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/stackblur-canvas 22ms (from cache)
2026-07-24T11:51:55.1293991Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/promise-polyfill 32ms (from cache)
2026-07-24T11:51:55.1294247Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cssesc 7ms (from cache)
2026-07-24T11:51:55.1294498Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fastparse 7ms (from cache)
2026-07-24T11:51:55.1294812Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/null-check 6ms (from cache)
2026-07-24T11:51:55.1295077Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ngx-window-token 17ms (from cache)
2026-07-24T11:51:55.1295330Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/through 10ms (from cache)
2026-07-24T11:51:55.1295580Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/isexe 14ms (from cache)
2026-07-24T11:51:55.1295834Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fileset 7ms (from cache)
2026-07-24T11:51:55.1296089Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/compare-versions 13ms (from cache)
2026-07-24T11:51:55.1296361Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/istanbul-lib-coverage 12ms (from cache)
2026-07-24T11:51:55.1296629Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/istanbul-lib-hook 10ms (from cache)
2026-07-24T11:51:55.1296884Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/async 32ms (from cache)
2026-07-24T11:51:55.1297146Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fchart.js 66ms (from cache)
2026-07-24T11:51:55.1297414Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/istanbul-lib-report 22ms (from cache)
2026-07-24T11:51:55.1297774Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/istanbul-lib-source-maps 26ms (from cache)
2026-07-24T11:51:55.1298141Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/istanbul-lib-instrument 40ms (from cache)
2026-07-24T11:51:55.1298398Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/once 10ms (from cache)
2026-07-24T11:51:55.1298760Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/make-dir 14ms (from cache)
2026-07-24T11:51:55.1299033Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/istanbul-reports 37ms (from cache)
2026-07-24T11:51:55.1299302Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fminimatch 14ms (from cache)
2026-07-24T11:51:55.1299563Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-regexp 9ms (from cache)
2026-07-24T11:51:55.1299765Z npm WARN deprecated @types/minimatch@6.0.0: This is a stub types definition. minimatch provides its own type definitions, so you do not need this installed.
2026-07-24T11:51:55.1300040Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/xmlcreate 11ms (from cache)
2026-07-24T11:51:55.1300299Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/one-time 5ms (from cache)
2026-07-24T11:51:55.1300554Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/https-proxy-agent 12ms (from cache)
2026-07-24T11:51:55.1300810Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-stream 8ms (from cache)
2026-07-24T11:51:55.1301064Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/stack-trace 9ms (from cache)
2026-07-24T11:51:55.1301318Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/logform 15ms (from cache)
2026-07-24T11:51:55.1301573Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/triple-beam 9ms (from cache)
2026-07-24T11:51:55.1301837Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@colors%2fcolors 10ms (from cache)
2026-07-24T11:51:55.1302103Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@dabh%2fdiagnostics 8ms (from cache)
2026-07-24T11:51:55.1302366Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/winston-transport 10ms (from cache)
2026-07-24T11:51:55.1302619Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/has-ansi 7ms (from cache)
2026-07-24T11:51:55.1302887Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/safe-stable-stringify 9ms (from cache)
2026-07-24T11:51:55.1303196Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/brace-expansion 42ms (from cache)
2026-07-24T11:51:55.1303533Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/strip-ansi 15ms (from cache)
2026-07-24T11:51:55.1303790Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/readable-stream 34ms (from cache)
2026-07-24T11:51:55.1304055Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/escape-string-regexp 11ms (from cache)
2026-07-24T11:51:55.1304551Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ansi-styles 15ms (from cache)
2026-07-24T11:51:55.1304867Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/inflight 11ms (from cache)
2026-07-24T11:51:55.1305122Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/inherits 11ms (from cache)
2026-07-24T11:51:55.1305518Z npm WARN deprecated inflight@1.0.6: This module is not supported, and leaks memory. Do not use it. Check out lru-cache if you want a good and tested way to coalesce async requests by a key value, which is much more comprehensive and powerful.
2026-07-24T11:51:55.1305840Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/supports-color 23ms (from cache)
2026-07-24T11:51:55.1306099Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fs.realpath 9ms (from cache)
2026-07-24T11:51:55.1306353Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/exit 10ms (from cache)
2026-07-24T11:51:55.1306618Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@ngtools%2fwebpack 585ms (from cache)
2026-07-24T11:51:55.1306944Z npm WARN deprecated q@1.5.1: You or someone you depend on is using Q, the JavaScript Promise library that gave JavaScript developers strong feelings about promises. They can almost certainly migrate to the native JavaScript promise now. Thank you literally everyone for joining me in this bet against the odds. Be excellent to each other.
2026-07-24T11:51:55.1307183Z npm WARN deprecated 
2026-07-24T11:51:55.1307396Z npm WARN deprecated (For a CapTP with native promises, see @endo/eventual-send and @endo/captp)
2026-07-24T11:51:55.1307634Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/del 41ms (from cache)
2026-07-24T11:51:55.1307890Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/esutils 12ms (from cache)
2026-07-24T11:51:55.1308145Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/js-tokens 14ms (from cache)
2026-07-24T11:51:55.1308431Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@angular-devkit%2fbuild-optimizer 410ms (from cache)
2026-07-24T11:51:55.1308763Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/os-tmpdir 25ms (from cache)
2026-07-24T11:51:55.1309019Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/xml2js 54ms (from cache)
2026-07-24T11:51:55.1309271Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/jszip 42ms (from cache)
2026-07-24T11:51:55.1309517Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/adm-zip 94ms (from cache)
2026-07-24T11:51:55.1309772Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/es-errors 18ms (from cache)
2026-07-24T11:51:55.1310026Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/argparse 21ms (from cache)
2026-07-24T11:51:55.1310305Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/esprima 46ms (from cache)
2026-07-24T11:51:55.1310554Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/webpack 843ms (from cache)
2026-07-24T11:51:55.1310810Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/path-parse 56ms (from cache)
2026-07-24T11:51:55.1311085Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/supports-preserve-symlinks-flag 54ms (from cache)
2026-07-24T11:51:55.1311356Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-core-module 65ms (from cache)
2026-07-24T11:51:55.1311640Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/isobject 13ms (from cache)
2026-07-24T11:51:55.1311891Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/to-regex 12ms (from cache)
2026-07-24T11:51:55.1312147Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/arr-flatten 11ms (from cache)
2026-07-24T11:51:55.1312405Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/array-unique 9ms (from cache)
2026-07-24T11:51:55.1312659Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fill-range 21ms (from cache)
2026-07-24T11:51:55.1312919Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/split-string 16ms (from cache)
2026-07-24T11:51:55.1313203Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular-devkit%2fbuild-webpack 530ms (from cache)
2026-07-24T11:51:55.1313626Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/snapdragon 49ms (from cache)
2026-07-24T11:51:55.1313889Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/extend-shallow 43ms (from cache)
2026-07-24T11:51:55.1314154Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/repeat-element 41ms (from cache)
2026-07-24T11:51:55.1314414Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/request 184ms (from cache)
2026-07-24T11:51:55.1314684Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/snapdragon-node 52ms (from cache)
2026-07-24T11:51:55.1315112Z npm WARN deprecated request@2.88.2: request has been deprecated, see https://github.com/request/request/issues/3142
2026-07-24T11:51:55.1315373Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/y18n 56ms (from cache)
2026-07-24T11:51:55.1315626Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cliui 58ms (from cache)
2026-07-24T11:51:55.1315888Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/set-blocking 20ms (from cache)
2026-07-24T11:51:55.1316142Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/find-up 26ms (from cache)
2026-07-24T11:51:55.1316398Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/os-locale 27ms (from cache)
2026-07-24T11:51:55.1316656Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/decamelize 26ms (from cache)
2026-07-24T11:51:55.1316919Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/which-module 14ms (from cache)
2026-07-24T11:51:55.1317205Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/string-width 21ms (from cache)
2026-07-24T11:51:55.1317471Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/get-caller-file 19ms (from cache)
2026-07-24T11:51:55.1317746Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/require-main-filename 12ms (from cache)
2026-07-24T11:51:55.1318020Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/require-directory 15ms (from cache)
2026-07-24T11:51:55.1318274Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/wordwrap 13ms (from cache)
2026-07-24T11:51:55.1318528Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-glob 13ms (from cache)
2026-07-24T11:51:55.1318847Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/anymatch 12ms (from cache)
2026-07-24T11:51:55.1319108Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-binary-path 9ms (from cache)
2026-07-24T11:51:55.1319370Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/async-each 14ms (from cache)
2026-07-24T11:51:55.1319628Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/glob-parent 17ms (from cache)
2026-07-24T11:51:55.1319889Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/yargs-parser 53ms (from cache)
2026-07-24T11:51:55.1320147Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/readdirp 28ms (from cache)
2026-07-24T11:51:55.1320440Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/normalize-path 21ms (from cache)
2026-07-24T11:51:55.1320698Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/rfdc 26ms (from cache)
2026-07-24T11:51:55.1320951Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fsevents 41ms (from cache)
2026-07-24T11:51:55.1321128Z npm WARN deprecated fsevents@1.2.13: Upgrade to fsevents v2 to mitigate potential security issues
2026-07-24T11:51:55.1321383Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/date-format 21ms (from cache)
2026-07-24T11:51:55.1321649Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/requires-port 12ms (from cache)
2026-07-24T11:51:55.1321905Z npm WARN deprecated date-format@2.1.0: 2.x is no longer supported. Please upgrade to 4.x or higher.
2026-07-24T11:51:55.1322153Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/upath 60ms (from cache)
2026-07-24T11:51:55.1322409Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/eventemitter3 21ms (from cache)
2026-07-24T11:51:55.1322669Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/streamroller 29ms (from cache)
2026-07-24T11:51:55.1322927Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/utils-merge 8ms (from cache)
2026-07-24T11:51:55.1323182Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/parseurl 9ms (from cache)
2026-07-24T11:51:55.1323442Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/finalhandler 16ms (from cache)
2026-07-24T11:51:55.1323726Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/debug 37ms (from cache)
2026-07-24T11:51:55.1323904Z npm WARN deprecated streamroller@1.0.6: 1.x is no longer supported. Please upgrade to 3.x or higher.
2026-07-24T11:51:55.1324154Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/debug 10ms (from cache)
2026-07-24T11:51:55.1324402Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/lru-cache 87ms (from cache)
2026-07-24T11:51:55.1324661Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/buffer-alloc 29ms (from cache)
2026-07-24T11:51:55.1324922Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/follow-redirects 47ms (from cache)
2026-07-24T11:51:55.1325180Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/debug 53ms (from cache)
2026-07-24T11:51:55.1325436Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/has-binary2 32ms (from cache)
2026-07-24T11:51:55.1325696Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/custom-event 16ms (from cache)
2026-07-24T11:51:55.1325944Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ent 19ms (from cache)
2026-07-24T11:51:55.1326206Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/socket.io-adapter 26ms (from cache)
2026-07-24T11:51:55.1326459Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/extend 22ms (from cache)
2026-07-24T11:51:55.1326717Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/void-elements 18ms (from cache)
2026-07-24T11:51:55.1326966Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-wsl 30ms (from cache)
2026-07-24T11:51:55.1327223Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/unpipe 17ms (from cache)
2026-07-24T11:51:55.1327488Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/validate-npm-package-name 37ms (from cache)
2026-07-24T11:51:55.1327751Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/depd 26ms (from cache)
2026-07-24T11:51:55.1328000Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/bytes 23ms (from cache)
2026-07-24T11:51:55.1328242Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/destroy 7ms (from cache)
2026-07-24T11:51:55.1328519Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/engine.io 122ms (from cache)
2026-07-24T11:51:55.1328915Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/socket.io-parser 113ms (from cache)
2026-07-24T11:51:55.1329181Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/hosted-git-info 63ms (from cache)
2026-07-24T11:51:55.1329435Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/osenv 77ms (from cache)
2026-07-24T11:51:55.1329695Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/socket.io-client 125ms (from cache)
2026-07-24T11:51:55.1329865Z npm WARN deprecated osenv@0.1.5: This package is no longer supported.
2026-07-24T11:51:55.1330103Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/type-is 38ms (from cache)
2026-07-24T11:51:55.1330348Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/raw-body 44ms (from cache)
2026-07-24T11:51:55.1330605Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/on-finished 17ms (from cache)
2026-07-24T11:51:55.1330894Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/content-type 16ms (from cache)
2026-07-24T11:51:55.1331148Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/rechoir 18ms (from cache)
2026-07-24T11:51:55.1331406Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/http-errors 24ms (from cache)
2026-07-24T11:51:55.1331656Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/qs 99ms (from cache)
2026-07-24T11:51:55.1332055Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/interpret 33ms (from cache)
2026-07-24T11:51:55.1332304Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cli-width 19ms (from cache)
2026-07-24T11:51:55.1332561Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cli-cursor 18ms (from cache)
2026-07-24T11:51:55.1332817Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/run-async 20ms (from cache)
2026-07-24T11:51:55.1333075Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/figures 25ms (from cache)
2026-07-24T11:51:55.1333326Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/mute-stream 15ms (from cache)
2026-07-24T11:51:55.1333588Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/external-editor 18ms (from cache)
2026-07-24T11:51:55.1333848Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ansi-escapes 20ms (from cache)
2026-07-24T11:51:55.1334107Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/iconv-lite 91ms (from cache)
2026-07-24T11:51:55.1334357Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/protoduck 13ms (from cache)
2026-07-24T11:51:55.1334626Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/mississippi 10ms (from cache)
2026-07-24T11:51:55.1334876Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ssri 26ms (from cache)
2026-07-24T11:51:55.1335136Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/get-stream 17ms (from cache)
2026-07-24T11:51:55.1335398Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/promise-retry 15ms (from cache)
2026-07-24T11:51:55.1335663Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/promise-inflight 8ms (from cache)
2026-07-24T11:51:55.1335928Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/unique-filename 10ms (from cache)
2026-07-24T11:51:55.1336182Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/npm-packlist 28ms (from cache)
2026-07-24T11:51:55.1336439Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/minipass 41ms (from cache)
2026-07-24T11:51:55.1336706Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/npm-pick-manifest 18ms (from cache)
2026-07-24T11:51:55.1336970Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/sourcemap-codec 13ms (from cache)
2026-07-24T11:51:55.1337260Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cacache 54ms (from cache)
2026-07-24T11:51:55.1337512Z npm WARN deprecated glob@7.0.6: Old versions of glob are not supported, and contain widely publicized security vulnerabilities, which have been fixed in the current version. Please update. Support for old versions may be purchased (at exorbitant rates) by contacting i@izs.me
2026-07-24T11:51:55.1337858Z npm WARN deprecated sourcemap-codec@1.4.8: Please use @jridgewell/sourcemap-codec instead
2026-07-24T11:51:55.1338111Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/figgy-pudding 54ms (from cache)
2026-07-24T11:51:55.1338375Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/semver-intersect 22ms (from cache)
2026-07-24T11:51:55.1338676Z npm WARN deprecated figgy-pudding@3.5.2: This module is no longer supported.
2026-07-24T11:51:55.1338949Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/normalize-package-data 37ms (from cache)
2026-07-24T11:51:55.1339212Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/sax 29ms (from cache)
2026-07-24T11:51:55.1339463Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/css-parse 13ms (from cache)
2026-07-24T11:51:55.1339728Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/npm-registry-fetch 53ms (from cache)
2026-07-24T11:51:55.1339982Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/errno 20ms (from cache)
2026-07-24T11:51:55.1340274Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/make-fetch-happen 71ms (from cache)
2026-07-24T11:51:55.1340530Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/clone 34ms (from cache)
2026-07-24T11:51:55.1340778Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/promise 37ms (from cache)
2026-07-24T11:51:55.1341031Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/gaze 25ms (from cache)
2026-07-24T11:51:55.1341901Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/image-size 40ms (from cache)
2026-07-24T11:51:55.1342186Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/get-stdin 14ms (from cache)
2026-07-24T11:51:55.1342443Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/in-publish 13ms (from cache)
2026-07-24T11:51:55.1342695Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/meow 32ms (from cache)
2026-07-24T11:51:55.1342950Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/sass-graph 18ms (from cache)
2026-07-24T11:51:55.1343195Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/nan 56ms (from cache)
2026-07-24T11:51:55.1343454Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/async-foreach 13ms (from cache)
2026-07-24T11:51:55.1343719Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/stdout-stream 13ms (from cache)
2026-07-24T11:51:55.1343974Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/tar 160ms (from cache)
2026-07-24T11:51:55.1344237Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/true-case-path 24ms (from cache)
2026-07-24T11:51:55.1344498Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cross-spawn 40ms (from cache)
2026-07-24T11:51:55.1344772Z npm WARN deprecated tar@4.4.19: Old versions of tar are not supported, and contain widely publicized security vulnerabilities, which have been fixed in the current version. Please update. Support for old versions may be purchased (at exorbitant rates) by contacting i@izs.me
2026-07-24T11:51:55.1345282Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fast-json-stable-stringify 11ms (from cache)
2026-07-24T11:51:55.1345668Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/uri-js 18ms (from cache)
2026-07-24T11:51:55.1346037Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/json-schema-traverse 14ms (from cache)
2026-07-24T11:51:55.1346456Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/npmlog 80ms (from cache)
2026-07-24T11:51:55.1346827Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fast-deep-equal 19ms (from cache)
2026-07-24T11:51:55.1347212Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/node-gyp 70ms (from cache)
2026-07-24T11:51:55.1347537Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/pify 20ms (from cache)
2026-07-24T11:51:55.1347707Z npm WARN deprecated npmlog@4.1.2: This package is no longer supported.
2026-07-24T11:51:55.1347950Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/schema-utils 55ms (from cache)
2026-07-24T11:51:55.1348200Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/emojis-list 15ms (from cache)
2026-07-24T11:51:55.1348455Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/lodash.tail 12ms (from cache)
2026-07-24T11:51:55.1348816Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/clone-deep 14ms (from cache)
2026-07-24T11:51:55.1349078Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/json5 31ms (from cache)
2026-07-24T11:51:55.1349332Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/big.js 24ms (from cache)
2026-07-24T11:51:55.1349598Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/lodash.clonedeep 19ms (from cache)
2026-07-24T11:51:55.1349859Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/read-cache 13ms (from cache)
2026-07-24T11:51:55.1350154Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/neo-async 40ms (from cache)
2026-07-24T11:51:55.1350400Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/when 40ms (from cache)
2026-07-24T11:51:55.1350662Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/source-list-map 20ms (from cache)
2026-07-24T11:51:55.1350934Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/postcss-value-parser 31ms (from cache)
2026-07-24T11:51:55.1351207Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/postcss-load-config 33ms (from cache)
2026-07-24T11:51:55.1351472Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/webpack-log 17ms (from cache)
2026-07-24T11:51:55.1351734Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/find-cache-dir 16ms (from cache)
2026-07-24T11:51:55.1352013Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fwebpack-sources 18ms (from cache)
2026-07-24T11:51:55.1352290Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/serialize-javascript 23ms (from cache)
2026-07-24T11:51:55.1352545Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/worker-farm 16ms (from cache)
2026-07-24T11:51:55.1352804Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/globby 46ms (from cache)
2026-07-24T11:51:55.1353060Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/memory-fs 20ms (from cache)
2026-07-24T11:51:55.1353365Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/webpack-core 24ms (from cache)
2026-07-24T11:51:55.1353639Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/url 18ms (from cache)
2026-07-24T11:51:55.1353887Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ip 23ms (from cache)
2026-07-24T11:51:55.1354135Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/opn 21ms (from cache)
2026-07-24T11:51:55.1354378Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/p-limit 62ms (from cache)
2026-07-24T11:51:55.1354628Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/bonjour 15ms (from cache)
2026-07-24T11:51:55.1354879Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/killable 9ms (from cache)
2026-07-24T11:51:55.1355167Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/sockjs 21ms (from cache)
2026-07-24T11:51:55.1355420Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ansi-html 12ms (from cache)
2026-07-24T11:51:55.1355695Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/loglevel 19ms (from cache)
2026-07-24T11:51:55.1355947Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/portfinder 19ms (from cache)
2026-07-24T11:51:55.1356201Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/internal-ip 12ms (from cache)
2026-07-24T11:51:55.1356450Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/selfsigned 20ms (from cache)
2026-07-24T11:51:55.1356709Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/import-local 13ms (from cache)
2026-07-24T11:51:55.1356964Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/compression 22ms (from cache)
2026-07-24T11:51:55.1357219Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/serve-index 20ms (from cache)
2026-07-24T11:51:55.1357468Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/spdy 63ms (from cache)
2026-07-24T11:51:55.1357741Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/connect-history-api-fallback 21ms (from cache)
2026-07-24T11:51:55.1358008Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/sockjs-client 34ms (from cache)
2026-07-24T11:51:55.1358269Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/html-entities 41ms (from cache)
2026-07-24T11:51:55.1358545Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/num2fraction 12ms (from cache)
2026-07-24T11:51:55.1358877Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/normalize-range 13ms (from cache)
2026-07-24T11:51:55.1359148Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/chartjs-color-string 11ms (from cache)
2026-07-24T11:51:55.1359422Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/regenerator-runtime 17ms (from cache)
2026-07-24T11:51:55.1359681Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/terser 142ms (from cache)
2026-07-24T11:51:55.1359944Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/regenerator-runtime 35ms (from cache)
2026-07-24T11:51:55.1360206Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/color-convert 35ms (from cache)
2026-07-24T11:51:55.1360549Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/http-proxy-middleware 90ms (from cache)
2026-07-24T11:51:55.1360808Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/rgbcolor 19ms (from cache)
2026-07-24T11:51:55.1361089Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/utrie 17ms (from cache)
2026-07-24T11:51:55.1361333Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/xmldom 29ms (from cache)
2026-07-24T11:51:55.1361595Z npm WARN deprecated xmldom@0.1.31: Deprecated due to CVE-2021-21366 resolved in 0.5.0
2026-07-24T11:51:55.1361840Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cfb 24ms (from cache)
2026-07-24T11:51:55.1362089Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ssf 25ms (from cache)
2026-07-24T11:51:55.1362336Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/wmf 12ms (from cache)
2026-07-24T11:51:55.1362589Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/word 12ms (from cache)
2026-07-24T11:51:55.1362845Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/crc-32 13ms (from cache)
2026-07-24T11:51:55.1363094Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/adler-32 13ms (from cache)
2026-07-24T11:51:55.1363425Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/append-transform 12ms (from cache)
2026-07-24T11:51:55.1363692Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/codepage 16ms (from cache)
2026-07-24T11:51:55.1363988Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/express 189ms (from cache)
2026-07-24T11:51:55.1364248Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/browserslist 141ms (from cache)
2026-07-24T11:51:55.1364504Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/wrappy 16ms (from cache)
2026-07-24T11:51:55.1364767Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@babel%2ftemplate 38ms (from cache)
2026-07-24T11:51:55.1365030Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/html-escaper 8ms (from cache)
2026-07-24T11:51:55.1365276Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fn.name 4ms (from cache)
2026-07-24T11:51:55.1365529Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/agent-base 6ms (from cache)
2026-07-24T11:51:55.1365795Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2ftriple-beam 4ms (from cache)
2026-07-24T11:51:55.1366058Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/undici-types 63ms (from cache)
2026-07-24T11:51:55.1366312Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fecha 13ms (from cache)
2026-07-24T11:51:55.1366571Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@babel%2ftypes 64ms (from cache)
2026-07-24T11:51:55.1366839Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@so-ric%2fcolorspace 12ms (from cache)
2026-07-24T11:51:55.1367120Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/enabled 12ms (from cache)
2026-07-24T11:51:55.1367371Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/jsdom 163ms (from cache)
2026-07-24T11:51:55.1367637Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@babel%2fgenerator 110ms (from cache)
2026-07-24T11:51:55.1367889Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ms 65ms (from cache)
2026-07-24T11:51:55.1368155Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@babel%2ftraverse 126ms (from cache)
2026-07-24T11:51:55.1368411Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/kuler 63ms (from cache)
2026-07-24T11:51:55.1368726Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/concat-map 19ms (from cache)
2026-07-24T11:51:55.1368998Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/string_decoder 17ms (from cache)
2026-07-24T11:51:55.1369252Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/balanced-match 21ms (from cache)
2026-07-24T11:51:55.1369512Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ansi-regex 34ms (from cache)
2026-07-24T11:51:55.1369770Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/util-deprecate 10ms (from cache)
2026-07-24T11:51:55.1370027Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/has-flag 12ms (from cache)
2026-07-24T11:51:55.1370292Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@babel%2fparser 157ms (from cache)
2026-07-24T11:51:55.1370553Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-path-cwd 28ms (from cache)
2026-07-24T11:51:55.1370815Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/pinkie-promise 27ms (from cache)
2026-07-24T11:51:55.1371076Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/object-assign 30ms (from cache)
2026-07-24T11:51:55.1371333Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-path-in-cwd 31ms (from cache)
2026-07-24T11:51:55.1371594Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/setimmediate 12ms (from cache)
2026-07-24T11:51:55.1371847Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/pako 23ms (from cache)
2026-07-24T11:51:55.1372096Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/lie 27ms (from cache)
2026-07-24T11:51:55.1372401Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/tapable 23ms (from cache)
2026-07-24T11:51:55.1372654Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/watchpack 26ms (from cache)
2026-07-24T11:51:55.1372912Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/loader-runner 13ms (from cache)
2026-07-24T11:51:55.1373166Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/eslint-scope 24ms (from cache)
2026-07-24T11:51:55.1373476Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/micromatch 40ms (from cache)
2026-07-24T11:51:55.1373748Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/chrome-trace-event 11ms (from cache)
2026-07-24T11:51:55.1374020Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/acorn-dynamic-import 12ms (from cache)
2026-07-24T11:51:55.1374289Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/node-libs-browser 18ms (from cache)
2026-07-24T11:51:55.1374553Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ajv-keywords 51ms (from cache)
2026-07-24T11:51:55.1374839Z npm WARN deprecated acorn-dynamic-import@4.0.0: This is probably built in to whatever tool you're using. If you still need it... idk
2026-07-24T11:51:55.1375105Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/acorn 66ms (from cache)
2026-07-24T11:51:55.1375363Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/json-parse-better-errors 19ms (from cache)
2026-07-24T11:51:55.1375651Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/hasown 6ms (from cache)
2026-07-24T11:51:55.1375914Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fast 46ms (from cache)
2026-07-24T11:51:55.1376181Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/define-property 12ms (from cache)
2026-07-24T11:51:55.1376470Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fhelper-module-context 28ms (from cache)
2026-07-24T11:51:55.1376749Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/enhanced-resolve 144ms (from cache)
2026-07-24T11:51:55.1377012Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/safe-regex 20ms (from cache)
2026-07-24T11:51:55.1377267Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/regex-not 21ms (from cache)
2026-07-24T11:51:55.1377515Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-number 23ms (from cache)
2026-07-24T11:51:55.1377790Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fwasm-edit 53ms (from cache)
2026-07-24T11:51:55.1378074Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fwasm-parser 59ms (from cache)
2026-07-24T11:51:55.1378342Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/repeat-string 21ms (from cache)
2026-07-24T11:51:55.1378666Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/to-regex-range 29ms (from cache)
2026-07-24T11:51:55.1378936Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/map-cache 17ms (from cache)
2026-07-24T11:51:55.1379197Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/source-map-resolve 21ms (from cache)
2026-07-24T11:51:55.1379462Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-extendable 14ms (from cache)
2026-07-24T11:51:55.1379705Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/use 15ms (from cache)
2026-07-24T11:51:55.1379973Z npm WARN deprecated source-map-resolve@0.5.3: See https://github.com/lydell/source-map-resolve#deprecated
2026-07-24T11:51:55.1380225Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/base 33ms (from cache)
2026-07-24T11:51:55.1380478Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/caseless 11ms (from cache)
2026-07-24T11:51:55.1380760Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/aws-sign2 8ms (from cache)
2026-07-24T11:51:55.1381010Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/isstream 9ms (from cache)
2026-07-24T11:51:55.1381257Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/aws4 25ms (from cache)
2026-07-24T11:51:55.1381506Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/oauth-sign 7ms (from cache)
2026-07-24T11:51:55.1381754Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/tunnel-agent 8ms (from cache)
2026-07-24T11:51:55.1382016Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/forever-agent 9ms (from cache)
2026-07-24T11:51:55.1382278Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/enhanced-resolve 145ms (from cache)
2026-07-24T11:51:55.1382543Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/mime-types 29ms (from cache)
2026-07-24T11:51:55.1382800Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/form-data 34ms (from cache)
2026-07-24T11:51:55.1383058Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-typedarray 22ms (from cache)
2026-07-24T11:51:55.1383367Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/uuid 51ms (from cache)
2026-07-24T11:51:55.1383591Z npm WARN deprecated uuid@3.4.0: uuid@10 and below is no longer supported.  For ESM codebases, update to uuid@latest.  For CommonJS codebases, use uuid@11 (but be aware this version will likely be deprecated in 2028).
2026-07-24T11:51:55.1383928Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/performance-now 21ms (from cache)
2026-07-24T11:51:55.1384194Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/combined-stream 24ms (from cache)
2026-07-24T11:51:55.1384453Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/tough-cookie 49ms (from cache)
2026-07-24T11:51:55.1384721Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/json-stringify-safe 21ms (from cache)
2026-07-24T11:51:55.1384984Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/har-validator 46ms (from cache)
2026-07-24T11:51:55.1385244Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/http-signature 33ms (from cache)
2026-07-24T11:51:55.1385505Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/caniuse-lite 521ms (from cache)
2026-07-24T11:51:55.1385737Z npm WARN deprecated har-validator@5.1.5: this library is no longer supported
2026-07-24T11:51:55.1385976Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/wrap-ansi 49ms (from cache)
2026-07-24T11:51:55.1386235Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/snapdragon-util 51ms (from cache)
2026-07-24T11:51:55.1386489Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/lcid 38ms (from cache)
2026-07-24T11:51:55.1386760Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-fullwidth-code-point 14ms (from cache)
2026-07-24T11:51:55.1387023Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-extglob 13ms (from cache)
2026-07-24T11:51:55.1387281Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/locate-path 41ms (from cache)
2026-07-24T11:51:55.1387532Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/mem 54ms (from cache)
2026-07-24T11:51:55.1387782Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/path-dirname 16ms (from cache)
2026-07-24T11:51:55.1388047Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/binary-extensions 23ms (from cache)
2026-07-24T11:51:55.1388302Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/camelcase 21ms (from cache)
2026-07-24T11:51:55.1388556Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/encodeurl 11ms (from cache)
2026-07-24T11:51:55.1388870Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/bindings 20ms (from cache)
2026-07-24T11:51:55.1389155Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/escape-html 9ms (from cache)
2026-07-24T11:51:55.1389410Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/statuses 16ms (from cache)
2026-07-24T11:51:55.1389664Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/pseudomap 12ms (from cache)
2026-07-24T11:51:55.1389910Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/buffer-fill 11ms (from cache)
2026-07-24T11:51:55.1390168Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/yallist 14ms (from cache)
2026-07-24T11:51:55.1390496Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/buffer-alloc-unsafe 12ms (from cache)
2026-07-24T11:51:55.1390759Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/call-bound 9ms (from cache)
2026-07-24T11:51:55.1391011Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/isarray 9ms (from cache)
2026-07-24T11:51:55.1391275Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/safe-regex-test 11ms (from cache)
2026-07-24T11:51:55.1391530Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/punycode 16ms (from cache)
2026-07-24T11:51:55.1391782Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fs-extra 43ms (from cache)
2026-07-24T11:51:55.1392027Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/builtins 16ms (from cache)
2026-07-24T11:51:55.1392309Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/base64id 14ms (from cache)
2026-07-24T11:51:55.1392559Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/execa 105ms (from cache)
2026-07-24T11:51:55.1392819Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/emoji-regex 26ms (from cache)
2026-07-24T11:51:55.1393075Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cookie 29ms (from cache)
2026-07-24T11:51:55.1393383Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/accepts 31ms (from cache)
2026-07-24T11:51:55.1393661Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/component-emitter 21ms (from cache)
2026-07-24T11:51:55.1393913Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/backo2 12ms (from cache)
2026-07-24T11:51:55.1394166Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/indexof 12ms (from cache)
2026-07-24T11:51:55.1394420Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/os-homedir 18ms (from cache)
2026-07-24T11:51:55.1394674Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/parseqs 11ms (from cache)
2026-07-24T11:51:55.1394925Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/has-cors 10ms (from cache)
2026-07-24T11:51:55.1395184Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/engine.io-parser 38ms (from cache)
2026-07-24T11:51:55.1395444Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/to-array 12ms (from cache)
2026-07-24T11:51:55.1395693Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/parseuri 13ms (from cache)
2026-07-24T11:51:55.1395945Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/component-bind 14ms (from cache)
2026-07-24T11:51:55.1396213Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/object-component 11ms (from cache)
2026-07-24T11:51:55.1396483Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/base64-arraybuffer 12ms (from cache)
2026-07-24T11:51:55.1396749Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/media-typer 14ms (from cache)
2026-07-24T11:51:55.1397004Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ee-first 13ms (from cache)
2026-07-24T11:51:55.1397258Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/setprototypeof 9ms (from cache)
2026-07-24T11:51:55.1397543Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/toidentifier 11ms (from cache)
2026-07-24T11:51:55.1397804Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/es-define-property 12ms (from cache)
2026-07-24T11:51:55.1398069Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/side-channel 15ms (from cache)
2026-07-24T11:51:55.1398329Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/restore-cursor 12ms (from cache)
2026-07-24T11:51:55.1398641Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/safer-buffer 10ms (from cache)
2026-07-24T11:51:55.1398908Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/chardet 18ms (from cache)
2026-07-24T11:51:55.1399157Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/genfun 12ms (from cache)
2026-07-24T11:51:55.1399420Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/flush-write-stream 9ms (from cache)
2026-07-24T11:51:55.1399686Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/end-of-stream 12ms (from cache)
2026-07-24T11:51:55.1399943Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/concat-stream 14ms (from cache)
2026-07-24T11:51:55.1400197Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/from2 11ms (from cache)
2026-07-24T11:51:55.1400453Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/duplexify 18ms (from cache)
2026-07-24T11:51:55.1400718Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/parallel-transform 11ms (from cache)
2026-07-24T11:51:55.1401000Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/pump 15ms (from cache)
2026-07-24T11:51:55.1401253Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/pumpify 16ms (from cache)
2026-07-24T11:51:55.1401507Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/stream-each 13ms (from cache)
2026-07-24T11:51:55.1401763Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/err-code 14ms (from cache)
2026-07-24T11:51:55.1402009Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/retry 16ms (from cache)
2026-07-24T11:51:55.1402255Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/ws 118ms (from cache)
2026-07-24T11:51:55.1402511Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/unique-slug 27ms (from cache)
2026-07-24T11:51:55.1402772Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/engine.io-client 92ms (from cache)
2026-07-24T11:51:55.1403048Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/npm-normalize-package-bin 38ms (from cache)
2026-07-24T11:51:55.1403366Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ignore-walk 47ms (from cache)
2026-07-24T11:51:55.1403635Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/npm-bundled 46ms (from cache)
2026-07-24T11:51:55.1403886Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/chownr 17ms (from cache)
2026-07-24T11:51:55.1404140Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/amdefine 16ms (from cache)
2026-07-24T11:51:55.1404732Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/validate-npm-package-license 14ms (from cache)
2026-07-24T11:51:55.1405002Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/prr 10ms (from cache)
2026-07-24T11:51:55.1405263Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/JSONStream 19ms (from cache)
2026-07-24T11:51:55.1405525Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/through2 85ms (from cache)
2026-07-24T11:51:55.1405787Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/http-proxy-agent 14ms (from cache)
2026-07-24T11:51:55.1406041Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/asap 10ms (from cache)
2026-07-24T11:51:55.1406335Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/globule 11ms (from cache)
2026-07-24T11:51:55.1406603Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/http-cache-semantics 15ms (from cache)
2026-07-24T11:51:55.1406870Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/agentkeepalive 25ms (from cache)
2026-07-24T11:51:55.1407138Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/move-concurrently 45ms (from cache)
2026-07-24T11:51:55.1407405Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/socks-proxy-agent 23ms (from cache)
2026-07-24T11:51:55.1407667Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/redent 17ms (from cache)
2026-07-24T11:51:55.1407904Z npm WARN deprecated move-concurrently@1.0.1: This package is no longer supported.
2026-07-24T11:51:55.1408150Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/map-obj 21ms (from cache)
2026-07-24T11:51:55.1408403Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/trim-newlines 16ms (from cache)
2026-07-24T11:51:55.1408727Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/read-pkg-up 20ms (from cache)
2026-07-24T11:51:55.1408992Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/loud-rejection 18ms (from cache)
2026-07-24T11:51:55.1409256Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/node-fetch-npm 57ms (from cache)
2026-07-24T11:51:55.1409517Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/scss-tokenizer 18ms (from cache)
2026-07-24T11:51:55.1409812Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/camelcase-keys 29ms (from cache)
2026-07-24T11:51:55.1410093Z npm WARN deprecated node-fetch-npm@2.0.4: This module is not used anymore, npm uses minipass-fetch for its fetch implementation now
2026-07-24T11:51:55.1410354Z npm WARN deprecated tar@2.2.2: Old versions of tar are not supported, and contain widely publicized security vulnerabilities, which have been fixed in the current version. Please update. Support for old versions may be purchased (at exorbitant rates) by contacting i@izs.me
2026-07-24T11:51:55.1410685Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fs-minipass 21ms (from cache)
2026-07-24T11:51:55.1410934Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/minizlib 24ms (from cache)
2026-07-24T11:51:55.1411203Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/console-control-strings 13ms (from cache)
2026-07-24T11:51:55.1411466Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/nopt 22ms (from cache)
2026-07-24T11:51:55.1411722Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/picocolors 13ms (from cache)
2026-07-24T11:51:55.1411978Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/for-own 12ms (from cache)
2026-07-24T11:51:55.1412233Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ajv-errors 15ms (from cache)
2026-07-24T11:51:55.1412497Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-plain-object 14ms (from cache)
2026-07-24T11:51:55.1412755Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/shallow-clone 14ms (from cache)
2026-07-24T11:51:55.1413010Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/kind-of 19ms (from cache)
2026-07-24T11:51:55.1413286Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/import-cwd 6ms (from cache)
2026-07-24T11:51:55.1413598Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/infer-owner 6ms (from cache)
2026-07-24T11:51:55.1413863Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/are-we-there-yet 52ms (from cache)
2026-07-24T11:51:55.1414125Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/lodash.debounce 9ms (from cache)
2026-07-24T11:51:55.1414359Z npm WARN deprecated are-we-there-yet@1.1.7: This package is no longer supported.
2026-07-24T11:51:55.1414634Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/gauge 61ms (from cache)
2026-07-24T11:51:55.1414793Z npm WARN deprecated gauge@2.7.4: This package is no longer supported.
2026-07-24T11:51:55.1415032Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ansi-colors 17ms (from cache)
2026-07-24T11:51:55.1415285Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/fstream 54ms (from cache)
2026-07-24T11:51:55.1415455Z npm WARN deprecated fstream@1.0.12: This package is no longer supported.
2026-07-24T11:51:55.1415702Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/babel-types 25ms (from cache)
2026-07-24T11:51:55.1415963Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/babel-template 20ms (from cache)
2026-07-24T11:51:55.1416220Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cosmiconfig 33ms (from cache)
2026-07-24T11:51:55.1416465Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/pkg-dir 18ms (from cache)
2026-07-24T11:51:55.1416735Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fsource-list-map 15ms (from cache)
2026-07-24T11:51:55.1416998Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/commondir 17ms (from cache)
2026-07-24T11:51:55.1417257Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/babel-traverse 34ms (from cache)
2026-07-24T11:51:55.1417520Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/babel-generator 38ms (from cache)
2026-07-24T11:51:55.1417794Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/slash 18ms (from cache)
2026-07-24T11:51:55.1418049Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/dir-glob 17ms (from cache)
2026-07-24T11:51:55.1418304Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/array-union 18ms (from cache)
2026-07-24T11:51:55.1418554Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/p-try 10ms (from cache)
2026-07-24T11:51:55.1418918Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/dns-equal 6ms (from cache)
2026-07-24T11:51:55.1419175Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/array-flatten 11ms (from cache)
2026-07-24T11:51:55.1421125Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/dns-txt 7ms (from cache)
2026-07-24T11:51:55.1421402Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/multicast-dns-service-types 6ms (from cache)
2026-07-24T11:51:55.1421667Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/deep-equal 15ms (from cache)
2026-07-24T11:51:55.1421924Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/multicast-dns 13ms (from cache)
2026-07-24T11:51:55.1422177Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/babylon 81ms (from cache)
2026-07-24T11:51:55.1422421Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ignore 56ms (from cache)
2026-07-24T11:51:55.1422672Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/p-map 67ms (from cache)
2026-07-24T11:51:55.1422930Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/faye-websocket 31ms (from cache)
2026-07-24T11:51:55.1423186Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/resolve-cwd 16ms (from cache)
2026-07-24T11:51:55.1423490Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/vary 16ms (from cache)
2026-07-24T11:51:55.1423747Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ipaddr.js 35ms (from cache)
2026-07-24T11:51:55.1424001Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/negotiator 16ms (from cache)
2026-07-24T11:51:55.1424255Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/on-headers 13ms (from cache)
2026-07-24T11:51:55.1424509Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/default-gateway 43ms (from cache)
2026-07-24T11:51:55.1424797Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/batch 15ms (from cache)
2026-07-24T11:51:55.1425055Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/compressible 21ms (from cache)
2026-07-24T11:51:55.1425318Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/handle-thing 13ms (from cache)
2026-07-24T11:51:55.1425573Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/select-hose 11ms (from cache)
2026-07-24T11:51:55.1425831Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/http-deceiver 14ms (from cache)
2026-07-24T11:51:55.1426086Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/json3 17ms (from cache)
2026-07-24T11:51:55.1426337Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/spdy-transport 25ms (from cache)
2026-07-24T11:51:55.1426597Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/eventsource 30ms (from cache)
2026-07-24T11:51:55.1426855Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/url-parse 32ms (from cache)
2026-07-24T11:51:55.1427104Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/frac 16ms (from cache)
2026-07-24T11:51:55.1427374Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/default-require-extensions 14ms (from cache)
2026-07-24T11:51:55.1427632Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/etag 15ms (from cache)
2026-07-24T11:51:55.1427889Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/node-forge 81ms (from cache)
2026-07-24T11:51:55.1428164Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fresh 16ms (from cache)
2026-07-24T11:51:55.1428408Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/methods 16ms (from cache)
2026-07-24T11:51:55.1428730Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/color-name 53ms (from cache)
2026-07-24T11:51:55.1428990Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/send 38ms (from cache)
2026-07-24T11:51:55.1429243Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/color-name 59ms (from cache)
2026-07-24T11:51:55.1429496Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/proxy-addr 22ms (from cache)
2026-07-24T11:51:55.1429756Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cookie-signature 15ms (from cache)
2026-07-24T11:51:55.1430022Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/merge-descriptors 16ms (from cache)
2026-07-24T11:51:55.1430285Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/content-disposition 21ms (from cache)
2026-07-24T11:51:55.1430551Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/serve-static 36ms (from cache)
2026-07-24T11:51:55.1430819Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/update-browserslist-db 23ms (from cache)
2026-07-24T11:51:55.1431088Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/es6-promisify 17ms (from cache)
2026-07-24T11:51:55.1431348Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/path-to-regexp 55ms (from cache)
2026-07-24T11:51:55.1431602Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/text-hex 22ms (from cache)
2026-07-24T11:51:55.1431881Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@babel%2fhelper-string-parser 42ms (from cache)
2026-07-24T11:51:55.1432176Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@babel%2fhelper-validator-identifier 52ms (from cache)
2026-07-24T11:51:55.1432443Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/node-releases 87ms (from cache)
2026-07-24T11:51:55.1432700Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/color 70ms (from cache)
2026-07-24T11:51:55.1432966Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@babel%2fcode-frame 98ms (from cache)
2026-07-24T11:51:55.1433264Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/abab 83ms (from cache)
2026-07-24T11:51:55.1433596Z npm WARN deprecated abab@1.0.4: Use your platform's native atob() and btoa() methods instead
2026-07-24T11:51:55.1433840Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cssom 80ms (from cache)
2026-07-24T11:51:55.1434091Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/nwmatcher 34ms (from cache)
2026-07-24T11:51:55.1434347Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/array-equal 10ms (from cache)
2026-07-24T11:51:55.1434596Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/symbol-tree 13ms (from cache)
2026-07-24T11:51:55.1434849Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/escodegen 43ms (from cache)
2026-07-24T11:51:55.1435105Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/webidl-conversions 12ms (from cache)
2026-07-24T11:51:55.1435367Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/acorn-globals 16ms (from cache)
2026-07-24T11:51:55.1435620Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cssstyle 59ms (from cache)
2026-07-24T11:51:55.1435882Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/xml-name-validator 16ms (from cache)
2026-07-24T11:51:55.1436136Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/whatwg-url 35ms (from cache)
2026-07-24T11:51:55.1436419Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/jsesc 25ms (from cache)
2026-07-24T11:51:55.1436685Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@jridgewell%2fgen-mapping 26ms (from cache)
2026-07-24T11:51:55.1436961Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@babel%2fhelper-globals 14ms (from cache)
2026-07-24T11:51:55.1437221Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/pinkie 12ms (from cache)
2026-07-24T11:51:55.1437483Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-path-inside 11ms (from cache)
2026-07-24T11:51:55.1437744Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/core-util-is 11ms (from cache)
2026-07-24T11:51:55.1438020Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@jridgewell%2ftrace-mapping 38ms (from cache)
2026-07-24T11:51:55.1438294Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/process-nextick-args 15ms (from cache)
2026-07-24T11:51:55.1438617Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/watchpack-chokidar2 15ms (from cache)
2026-07-24T11:51:55.1438927Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/esrecurse 17ms (from cache)
2026-07-24T11:51:55.1439320Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/immediate 22ms (from cache)
2026-07-24T11:51:55.1439709Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/extglob 20ms (from cache)
2026-07-24T11:51:55.1439975Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/estraverse 23ms (from cache)
2026-07-24T11:51:55.1440271Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/baseline-browser-mapping 232ms (from cache)
2026-07-24T11:51:55.1440625Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/arr-diff 19ms (from cache)
2026-07-24T11:51:55.1440887Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/object.pick 17ms (from cache)
2026-07-24T11:51:55.1441144Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fragment-cache 17ms (from cache)
2026-07-24T11:51:55.1441397Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/util 19ms (from cache)
2026-07-24T11:51:55.1441656Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/nanomatch 29ms (from cache)
2026-07-24T11:51:55.1441909Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/assert 15ms (from cache)
2026-07-24T11:51:55.1442205Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/process 13ms (from cache)
2026-07-24T11:51:55.1442456Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/events 16ms (from cache)
2026-07-24T11:51:55.1442713Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/os-browserify 13ms (from cache)
2026-07-24T11:51:55.1442969Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/vm-browserify 14ms (from cache)
2026-07-24T11:51:55.1443224Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/tty-browserify 6ms (from cache)
2026-07-24T11:51:55.1443477Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/stream-http 20ms (from cache)
2026-07-24T11:51:55.1443738Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/browserify-zlib 10ms (from cache)
2026-07-24T11:51:55.1444000Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/path-browserify 10ms (from cache)
2026-07-24T11:51:55.1444264Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/querystring-es3 9ms (from cache)
2026-07-24T11:51:55.1444524Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/https-browserify 9ms (from cache)
2026-07-24T11:51:55.1444785Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/stream-browserify 8ms (from cache)
2026-07-24T11:51:55.1445040Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/buffer 40ms (from cache)
2026-07-24T11:51:55.1445438Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/console-browserify 12ms (from cache)
2026-07-24T11:51:55.1445883Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/constants-browserify 12ms (from cache)
2026-07-24T11:51:55.1446401Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/function-bind 13ms (from cache)
2026-07-24T11:51:55.1446909Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/timers-browserify 23ms (from cache)
2026-07-24T11:51:55.1447406Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/assign-symbols 20ms (from cache)
2026-07-24T11:51:55.1447903Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/crypto-browserify 30ms (from cache)
2026-07-24T11:51:55.1448396Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-descriptor 16ms (from cache)
2026-07-24T11:51:55.1448971Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ret 9ms (from cache)
2026-07-24T11:51:55.1449540Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fhelper-wasm-bytecode 23ms (from cache)
2026-07-24T11:51:55.1450126Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fwast-parser 29ms (from cache)
2026-07-24T11:51:55.1450767Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fwasm-opt 18ms (from cache)
2026-07-24T11:51:55.1451314Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fwasm-gen 20ms (from cache)
2026-07-24T11:51:55.1451859Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fwast-printer 23ms (from cache)
2026-07-24T11:51:55.1452441Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fhelper-buffer 24ms (from cache)
2026-07-24T11:51:55.1452982Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2futf8 23ms (from cache)
2026-07-24T11:51:55.1453498Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/atob 6ms (from cache)
2026-07-24T11:51:55.1454028Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fhelper-wasm-section 29ms (from cache)
2026-07-24T11:51:55.1454556Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/resolve-url 6ms (from cache)
2026-07-24T11:51:55.1455165Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fieee754 21ms (from cache)
2026-07-24T11:51:55.1455532Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/decode-uri-component 12ms (from cache)
2026-07-24T11:51:55.1455786Z npm WARN deprecated resolve-url@0.2.1: https://github.com/lydell/resolve-url#deprecated
2026-07-24T11:51:55.1456061Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fhelper-api-error 23ms (from cache)
2026-07-24T11:51:55.1456332Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/source-map-url 11ms (from cache)
2026-07-24T11:51:55.1456589Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/urix 9ms (from cache)
2026-07-24T11:51:55.1456831Z npm WARN deprecated source-map-url@0.4.1: See https://github.com/lydell/source-map-url#deprecated
2026-07-24T11:51:55.1457001Z npm WARN deprecated urix@0.1.0: Please see https://github.com/lydell/urix#deprecated
2026-07-24T11:51:55.1457263Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fleb128 37ms (from cache)
2026-07-24T11:51:55.1457526Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/class-utils 13ms (from cache)
2026-07-24T11:51:55.1457786Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cache-base 15ms (from cache)
2026-07-24T11:51:55.1458041Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/pascalcase 12ms (from cache)
2026-07-24T11:51:55.1458297Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/mixin-deep 15ms (from cache)
2026-07-24T11:51:55.1458659Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/domain-browser 115ms (from cache)
2026-07-24T11:51:55.1458931Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/asynckit 33ms (from cache)
2026-07-24T11:51:55.1459275Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/delayed-stream 25ms (from cache)
2026-07-24T11:51:55.1459620Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/har-schema 9ms (from cache)
2026-07-24T11:51:55.1459877Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/assert-plus 6ms (from cache)
2026-07-24T11:51:55.1460149Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/remove-trailing-separator 7ms (from cache)
2026-07-24T11:51:55.1460410Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/jsprim 10ms (from cache)
2026-07-24T11:51:55.1460667Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/mime-db 47ms (from cache)
2026-07-24T11:51:55.1460911Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/psl 23ms (from cache)
2026-07-24T11:51:55.1461164Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/sshpk 26ms (from cache)
2026-07-24T11:51:55.1461418Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/invert-kv 18ms (from cache)
2026-07-24T11:51:55.1461675Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/p-locate 17ms (from cache)
2026-07-24T11:51:55.1461937Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/path-exists 15ms (from cache)
2026-07-24T11:51:55.1462199Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/map-age-cleaner 17ms (from cache)
2026-07-24T11:51:55.1462458Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/mimic-fn 14ms (from cache)
2026-07-24T11:51:55.1462718Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/p-is-promise 13ms (from cache)
2026-07-24T11:51:55.1462980Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/file-uri-to-path 14ms (from cache)
2026-07-24T11:51:55.1463253Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/call-bind-apply-helpers 12ms (from cache)
2026-07-24T11:51:55.1463522Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/get-intrinsic 14ms (from cache)
2026-07-24T11:51:55.1463830Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-regex 11ms (from cache)
2026-07-24T11:51:55.1464083Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/strip-eof 10ms (from cache)
2026-07-24T11:51:55.1464343Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/universalify 13ms (from cache)
2026-07-24T11:51:55.1464602Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/p-finally 11ms (from cache)
2026-07-24T11:51:55.1464851Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/jsonfile 15ms (from cache)
2026-07-24T11:51:55.1465109Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/signal-exit 19ms (from cache)
2026-07-24T11:51:55.1465366Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/npm-run-path 18ms (from cache)
2026-07-24T11:51:55.1465627Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/better-assert 11ms (from cache)
2026-07-24T11:51:55.1465878Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/blob 11ms (from cache)
2026-07-24T11:51:55.1466140Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/arraybuffer.slice 11ms (from cache)
2026-07-24T11:51:55.1466406Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/side-channel-list 11ms (from cache)
2026-07-24T11:51:55.1466662Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/after 14ms (from cache)
2026-07-24T11:51:55.1466917Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/side-channel-map 12ms (from cache)
2026-07-24T11:51:55.1467213Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/side-channel-weakmap 13ms (from cache)
2026-07-24T11:51:55.1467470Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/onetime 15ms (from cache)
2026-07-24T11:51:55.1467722Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/stream-shift 13ms (from cache)
2026-07-24T11:51:55.1467977Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/typedarray 16ms (from cache)
2026-07-24T11:51:55.1468230Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cyclist 13ms (from cache)
2026-07-24T11:51:55.1468484Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ultron 11ms (from cache)
2026-07-24T11:51:55.1468893Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/async-limiter 10ms (from cache)
2026-07-24T11:51:55.1469143Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/yeast 9ms (from cache)
2026-07-24T11:51:55.1469404Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/imurmurhash 13ms (from cache)
2026-07-24T11:51:55.1469671Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/component-inherit 9ms (from cache)
2026-07-24T11:51:55.1469932Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/spdx-correct 12ms (from cache)
2026-07-24T11:51:55.1470198Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/xmlhttprequest-ssl 14ms (from cache)
2026-07-24T11:51:55.1470462Z npm WARN deprecated glob@7.1.7: Old versions of glob are not supported, and contain widely publicized security vulnerabilities, which have been fixed in the current version. Please update. Support for old versions may be purchased (at exorbitant rates) by contacting i@izs.me
2026-07-24T11:51:55.1470806Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/object-inspect 57ms (from cache)
2026-07-24T11:51:55.1471071Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/jsonparse 12ms (from cache)
2026-07-24T11:51:55.1471321Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/xtend 19ms (from cache)
2026-07-24T11:51:55.1471575Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/run-queue 13ms (from cache)
2026-07-24T11:51:55.1471826Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/aproba 14ms (from cache)
2026-07-24T11:51:55.1472118Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/humanize-ms 10ms (from cache)
2026-07-24T11:51:55.1472376Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/strip-indent 9ms (from cache)
2026-07-24T11:51:55.1472639Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/indent-string 10ms (from cache)
2026-07-24T11:51:55.1472909Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/spdx-expression-parse 46ms (from cache)
2026-07-24T11:51:55.1473169Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/socks 28ms (from cache)
2026-07-24T11:51:55.1473430Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/currently-unhandled 12ms (from cache)
2026-07-24T11:51:55.1473691Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/read-pkg 16ms (from cache)
2026-07-24T11:51:55.1473946Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/encoding 15ms (from cache)
2026-07-24T11:51:55.1474213Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/copy-concurrently 46ms (from cache)
2026-07-24T11:51:55.1474486Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/fs-write-stream-atomic 47ms (from cache)
2026-07-24T11:51:55.1474733Z npm WARN deprecated copy-concurrently@1.0.5: This package is no longer supported.
2026-07-24T11:51:55.1474979Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/block-stream 13ms (from cache)
2026-07-24T11:51:55.1475222Z npm WARN deprecated fs-write-stream-atomic@1.0.10: This package is no longer supported.
2026-07-24T11:51:55.1475523Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/abbrev 14ms (from cache)
2026-07-24T11:51:55.1475775Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/for-in 13ms (from cache)
2026-07-24T11:51:55.1476029Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/import-from 10ms (from cache)
2026-07-24T11:51:55.1476284Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/delegates 10ms (from cache)
2026-07-24T11:51:55.1476546Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/mixin-object 13ms (from cache)
2026-07-24T11:51:55.1476801Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/wide-align 13ms (from cache)
2026-07-24T11:51:55.1477056Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/has-unicode 10ms (from cache)
2026-07-24T11:51:55.1477296Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/co 16ms (from cache)
2026-07-24T11:51:55.1477559Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/to-fast-properties 16ms (from cache)
2026-07-24T11:51:55.1477820Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-directory 9ms (from cache)
2026-07-24T11:51:55.1478077Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/import-fresh 12ms (from cache)
2026-07-24T11:51:55.1478332Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/parse-json 17ms (from cache)
2026-07-24T11:51:55.1478643Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/babel-messages 14ms (from cache)
2026-07-24T11:51:55.1478915Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/invariant 11ms (from cache)
2026-07-24T11:51:55.1479169Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/js-base64 68ms (from cache)
2026-07-24T11:51:55.1479419Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/trim-right 10ms (from cache)
2026-07-24T11:51:55.1479672Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/xregexp 17ms (from cache)
2026-07-24T11:51:55.1479927Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/path-type 13ms (from cache)
2026-07-24T11:51:55.1480187Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/detect-indent 16ms (from cache)
2026-07-24T11:51:55.1480446Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/array-uniq 15ms (from cache)
2026-07-24T11:51:55.1480739Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/buffer-indexof 11ms (from cache)
2026-07-24T11:51:55.1481000Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-arguments 14ms (from cache)
2026-07-24T11:51:55.1481255Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-date-object 12ms (from cache)
2026-07-24T11:51:55.1481511Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/object-is 12ms (from cache)
2026-07-24T11:51:55.1481767Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/thunky 9ms (from cache)
2026-07-24T11:51:55.1482027Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/object-keys 15ms (from cache)
2026-07-24T11:51:55.1482298Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/regexp.prototype.flags 13ms (from cache)
2026-07-24T11:51:55.1482560Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/resolve-from 9ms (from cache)
2026-07-24T11:51:55.1482816Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/globals 46ms (from cache)
2026-07-24T11:51:55.1483074Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/websocket-driver 20ms (from cache)
2026-07-24T11:51:55.1483328Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/dns-packet 27ms (from cache)
2026-07-24T11:51:55.1483586Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/detect-node 15ms (from cache)
2026-07-24T11:51:55.1483840Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ip-regex 20ms (from cache)
2026-07-24T11:51:55.1484125Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/hpack.js 16ms (from cache)
2026-07-24T11:51:55.1484376Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/obuf 15ms (from cache)
2026-07-24T11:51:55.1484625Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/wbuf 16ms (from cache)
2026-07-24T11:51:55.1484888Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/querystringify 16ms (from cache)
2026-07-24T11:51:55.1485148Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/strip-bom 12ms (from cache)
2026-07-24T11:51:55.1485396Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/forwarded 11ms (from cache)
2026-07-24T11:51:55.1485650Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/escalade 13ms (from cache)
2026-07-24T11:51:55.1485909Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/color-string 14ms (from cache)
2026-07-24T11:51:55.1486171Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/es6-promise 17ms (from cache)
2026-07-24T11:51:55.1486426Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/optionator 14ms (from cache)
2026-07-24T11:51:55.1486687Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/path-is-inside 9ms (from cache)
2026-07-24T11:51:55.1486941Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/tr46 13ms (from cache)
2026-07-24T11:51:55.1487210Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@jridgewell%2fsourcemap-codec 15ms (from cache)
2026-07-24T11:51:55.1487496Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@jridgewell%2fsourcemap-codec 6ms (from cache)
2026-07-24T11:51:55.1487761Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/randombytes 9ms (from cache)
2026-07-24T11:51:55.1488015Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-windows 10ms (from cache)
2026-07-24T11:51:55.1488280Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/builtin-status-codes 7ms (from cache)
2026-07-24T11:51:55.1488601Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@jridgewell%2fresolve-uri 16ms (from cache)
2026-07-24T11:51:55.1488888Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/expand-brackets 14ms (from cache)
2026-07-24T11:51:55.1489181Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/to-arraybuffer 9ms (from cache)
2026-07-24T11:51:55.1489438Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/object.assign 19ms (from cache)
2026-07-24T11:51:55.1824828Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/browserify-cipher 10ms (from cache)
2026-07-24T11:51:55.1829094Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/base64-js 16ms (from cache)
2026-07-24T11:51:55.1829419Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ieee754 15ms (from cache)
2026-07-24T11:51:55.1829687Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/create-hash 13ms (from cache)
2026-07-24T11:51:55.1829952Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/create-ecdh 15ms (from cache)
2026-07-24T11:51:55.1830216Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/create-hmac 15ms (from cache)
2026-07-24T11:51:55.1830486Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/diffie-hellman 18ms (from cache)
2026-07-24T11:51:55.1830756Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/browserify-sign 23ms (from cache)
2026-07-24T11:51:55.1831016Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/hash-base 17ms (from cache)
2026-07-24T11:51:55.1831280Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/public-encrypt 14ms (from cache)
2026-07-24T11:51:55.1831807Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/randomfill 12ms (from cache)
2026-07-24T11:51:55.1832070Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-buffer 13ms (from cache)
2026-07-24T11:51:55.1832329Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/pbkdf2 18ms (from cache)
2026-07-24T11:51:55.1832601Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-data-descriptor 15ms (from cache)
2026-07-24T11:51:55.1832871Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@xtuc%2flong 11ms (from cache)
2026-07-24T11:51:55.1833142Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@xtuc%2fieee754 7ms (from cache)
2026-07-24T11:51:55.1833398Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/arr-union 7ms (from cache)
2026-07-24T11:51:55.1833652Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/static-extend 6ms (from cache)
2026-07-24T11:51:55.1833918Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/collection-visit 7ms (from cache)
2026-07-24T11:51:55.1834202Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fhelper-fsm 23ms (from cache)
2026-07-24T11:51:55.1834500Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fhelper-code-frame 23ms (from cache)
2026-07-24T11:51:55.1834774Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/has-value 10ms (from cache)
2026-07-24T11:51:55.1835038Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/to-object-path 7ms (from cache)
2026-07-24T11:51:55.1835329Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2ffloating-point-hex-parser 27ms (from cache)
2026-07-24T11:51:55.1835618Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/is-accessor-descriptor 43ms (from cache)
2026-07-24T11:51:55.1835891Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/is-accessor-descriptor 43ms (from cache)
2026-07-24T11:51:55.1836159Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/get-value 20ms (from cache)
2026-07-24T11:51:55.1836419Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/union-value 19ms (from cache)
2026-07-24T11:51:55.1836678Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/set-value 25ms (from cache)
2026-07-24T11:51:55.1836985Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/unset-value 17ms (from cache)
2026-07-24T11:51:55.1837241Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/code-point-at 15ms (from cache)
2026-07-24T11:51:55.1837502Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/extsprintf 11ms (from cache)
2026-07-24T11:51:55.1837759Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/json-schema 9ms (from cache)
2026-07-24T11:51:55.1838006Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/verror 16ms (from cache)
2026-07-24T11:51:55.1838296Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/jsbn 10ms (from cache)
2026-07-24T11:51:55.1838549Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/asn1 10ms (from cache)
2026-07-24T11:51:55.1838879Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/getpass 9ms (from cache)
2026-07-24T11:51:55.1839141Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ecc-jsbn 9ms (from cache)
2026-07-24T11:51:55.1839400Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/bcrypt-pbkdf 6ms (from cache)
2026-07-24T11:51:55.1839658Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/dashdash 15ms (from cache)
2026-07-24T11:51:55.1839906Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/tweetnacl 15ms (from cache)
2026-07-24T11:51:55.1840162Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/p-defer 11ms (from cache)
2026-07-24T11:51:55.1840458Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/shebang-command 11ms (from cache)
2026-07-24T11:51:55.1840713Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/nice-try 12ms (from cache)
2026-07-24T11:51:55.1840966Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/path-key 13ms (from cache)
2026-07-24T11:51:55.1841216Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/gopd 13ms (from cache)
2026-07-24T11:51:55.1841471Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/get-proto 15ms (from cache)
2026-07-24T11:51:55.1841731Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/has-symbols 14ms (from cache)
2026-07-24T11:51:55.1842097Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/es-object-atoms 14ms (from cache)
2026-07-24T11:51:55.1842462Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/math-intrinsics 11ms (from cache)
2026-07-24T11:51:55.1842863Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/has-tostringtag 12ms (from cache)
2026-07-24T11:51:55.1843244Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/callsite 11ms (from cache)
2026-07-24T11:51:55.1843593Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/repeating 12ms (from cache)
2026-07-24T11:51:55.1843947Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/spdx-exceptions 11ms (from cache)
2026-07-24T11:51:55.1844346Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/array-find-index 10ms (from cache)
2026-07-24T11:51:55.1844728Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/spdx-license-ids 20ms (from cache)
2026-07-24T11:51:55.1845101Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/load-json-file 13ms (from cache)
2026-07-24T11:51:55.1845364Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/iferr 10ms (from cache)
2026-07-24T11:51:55.1845622Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/smart-buffer 20ms (from cache)
2026-07-24T11:51:55.1845877Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/caller-path 12ms (from cache)
2026-07-24T11:51:55.1846129Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/error-ex 12ms (from cache)
2026-07-24T11:51:55.1846388Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/loose-envify 12ms (from cache)
2026-07-24T11:51:55.1846720Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/define-properties 10ms (from cache)
2026-07-24T11:51:55.1846975Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/call-bind 14ms (from cache)
2026-07-24T11:51:55.1847236Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/set-function-name 12ms (from cache)
2026-07-24T11:51:55.1847491Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/call-bind 14ms (from cache)
2026-07-24T11:51:55.1847759Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/websocket-extensions 12ms (from cache)
2026-07-24T11:51:55.1848027Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/http-parser-js 18ms (from cache)
2026-07-24T11:51:55.1848304Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@leichtgewicht%2fip-codec 12ms (from cache)
2026-07-24T11:51:55.1848658Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/minimalistic-assert 10ms (from cache)
2026-07-24T11:51:55.1848933Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/deep-is 10ms (from cache)
2026-07-24T11:51:55.1849183Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/prelude-ls 12ms (from cache)
2026-07-24T11:51:55.1849437Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/type-check 6ms (from cache)
2026-07-24T11:51:55.1849689Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/word-wrap 10ms (from cache)
2026-07-24T11:51:55.1849977Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/levn 8ms (from cache)
2026-07-24T11:51:55.1850280Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fast-levenshtein 10ms (from cache)
2026-07-24T11:51:55.1850563Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/picomatch 23ms (from cache)
2026-07-24T11:51:55.1850819Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/picomatch 27ms (from cache)
2026-07-24T11:51:55.1851085Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/electron-to-chromium 935ms (from cache)
2026-07-24T11:51:55.1851351Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/posix-character-classes 107ms (from cache)
2026-07-24T11:51:55.1851617Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/browserify-des 103ms (from cache)
2026-07-24T11:51:55.1851880Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/browserify-aes 110ms (from cache)
2026-07-24T11:51:55.1852143Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/evp_bytestokey 105ms (from cache)
2026-07-24T11:51:55.1852397Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/md5.js 102ms (from cache)
2026-07-24T11:51:55.1852652Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cipher-base 107ms (from cache)
2026-07-24T11:51:55.1852909Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ripemd160 103ms (from cache)
2026-07-24T11:51:55.1853167Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cipher-base 7ms (from cache)
2026-07-24T11:51:55.1853414Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/sha.js 21ms (from cache)
2026-07-24T11:51:55.1853670Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/miller-rabin 15ms (from cache)
2026-07-24T11:51:55.1853930Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/browserify-rsa 14ms (from cache)
2026-07-24T11:51:55.1854255Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/browserify-rsa 4ms (from cache)
2026-07-24T11:51:55.1854646Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/sha.js 20ms (from cache)
2026-07-24T11:51:55.1855043Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/parse-asn1 18ms (from cache)
2026-07-24T11:51:55.1855372Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/elliptic 34ms (from cache)
2026-07-24T11:51:55.1855621Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/parse-asn1 21ms (from cache)
2026-07-24T11:51:55.1855875Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/elliptic 37ms (from cache)
2026-07-24T11:51:55.1856131Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/object-copy 14ms (from cache)
2026-07-24T11:51:55.1856387Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/to-buffer 16ms (from cache)
2026-07-24T11:51:55.1856644Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/map-visit 16ms (from cache)
2026-07-24T11:51:55.1856904Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/object-visit 16ms (from cache)
2026-07-24T11:51:55.1857161Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/has-values 17ms (from cache)
2026-07-24T11:51:55.1857420Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/number-is-nan 18ms (from cache)
2026-07-24T11:51:55.1857675Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/shebang-regex 9ms (from cache)
2026-07-24T11:51:55.1857932Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/dunder-proto 9ms (from cache)
2026-07-24T11:51:55.1858189Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-finite 9ms (from cache)
2026-07-24T11:51:55.1858443Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/bn.js 83ms (from cache)
2026-07-24T11:51:55.1858805Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-arrayish 10ms (from cache)
2026-07-24T11:51:55.1859069Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/caller-callsite 12ms (from cache)
2026-07-24T11:51:55.1859340Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/has-property-descriptors 11ms (from cache)
2026-07-24T11:51:55.1859611Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/define-data-property 13ms (from cache)
2026-07-24T11:51:55.1859881Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/has-property-descriptors 5ms (from cache)
2026-07-24T11:51:55.1860138Z npm http fetch GET 304 http://binario.caixa:8081/repository/npm-all/bn.js 81ms (from cache)
2026-07-24T11:51:55.1860401Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/set-function-length 13ms (from cache)
2026-07-24T11:51:55.1860671Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/define-data-property 14ms (from cache)
2026-07-24T11:51:55.1860941Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/functions-have-names 14ms (from cache)
2026-07-24T11:51:55.1861194Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/des.js 12ms (from cache)
2026-07-24T11:51:55.1861448Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/buffer-xor 13ms (from cache)
2026-07-24T11:51:55.1861697Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/brorand 11ms (from cache)
2026-07-24T11:51:55.1861947Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/brorand 10ms (from cache)
2026-07-24T11:51:55.1862197Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/hmac-drbg 8ms (from cache)
2026-07-24T11:51:55.1862463Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/minimalistic-crypto-utils 7ms (from cache)
2026-07-24T11:51:55.1862727Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/copy-descriptor 8ms (from cache)
2026-07-24T11:51:55.1862983Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/hash.js 11ms (from cache)
2026-07-24T11:51:55.1863247Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/typed-array-buffer 12ms (from cache)
2026-07-24T11:51:55.1863504Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/asn1.js 25ms (from cache)
2026-07-24T11:51:55.1863785Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-utf8 13ms (from cache)
2026-07-24T11:51:55.1864033Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/callsites 9ms (from cache)
2026-07-24T11:51:55.1864288Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-typed-array 5ms (from cache)
2026-07-24T11:51:55.1864552Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/which-typed-array 2ms (from cache)
2026-07-24T11:51:55.1864805Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/for-each 3ms (from cache)
2026-07-24T11:51:55.1865073Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/available-typed-arrays 4ms (from cache)
2026-07-24T11:51:55.1865349Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/possible-typed-array-names 1ms (from cache)
2026-07-24T11:51:55.1865615Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-callable 4ms (from cache)
2026-07-24T11:51:55.1865778Z npm timing stage:rollbackFailedOptional Completed in 0ms
2026-07-24T11:51:55.1865929Z npm timing stage:runTopLevelLifecycles Completed in 671048ms
2026-07-24T11:51:55.1866067Z npm verb stack Error: exited with error code: 128
2026-07-24T11:51:55.1866364Z npm verb stack     at ChildProcess.<anonymous> (/opt/ads-agent/_work/_tool/node/10.24.1/x64/lib/node_modules/npm/node_modules/pacote/lib/util/finished.js:12:19)
2026-07-24T11:51:55.1866561Z npm verb stack     at ChildProcess.emit (events.js:198:13)
2026-07-24T11:51:55.1866712Z npm verb stack     at maybeClose (internal/child_process.js:982:16)
2026-07-24T11:51:55.1866905Z npm verb stack     at Process.ChildProcess._handle.onexit (internal/child_process.js:259:5)
2026-07-24T11:51:55.1867094Z npm verb cwd /opt/ads-agent/_work/341/s/web
2026-07-24T11:51:55.1867268Z npm verb Linux 5.14.0-362.8.1.el9_3.x86_64
2026-07-24T11:51:55.1867557Z npm verb argv "/opt/ads-agent/_work/_tool/node/10.24.1/x64/bin/node" "/opt/ads-agent/_work/_tool/node/10.24.1/x64/bin/npm" "install" "--no-audit" "--verbose"
2026-07-24T11:51:55.1867722Z npm verb node v10.24.1
2026-07-24T11:51:55.1867826Z npm verb npm  v6.14.12
2026-07-24T11:51:55.1867934Z npm ERR! Error while executing:
2026-07-24T11:51:55.1868126Z npm ERR! /bin/git ls-remote -h -t ssh://git@github.com/eligrey/FileSaver.js.git
2026-07-24T11:51:55.1868247Z npm ERR! 
2026-07-24T11:51:55.1868367Z npm ERR! ssh: connect to host github.com port 22: Connection timed out
2026-07-24T11:51:55.1868507Z npm ERR! fatal: Could not read from remote repository.
2026-07-24T11:51:55.1868675Z npm ERR! 
2026-07-24T11:51:55.1868793Z npm ERR! Please make sure you have the correct access rights
2026-07-24T11:51:55.1868913Z npm ERR! and the repository exists.
2026-07-24T11:51:55.1869013Z npm ERR! 
2026-07-24T11:51:55.1869116Z npm ERR! exited with error code: 128
2026-07-24T11:51:55.1869225Z npm verb exit [ 1, true ]
2026-07-24T11:51:55.1869335Z npm timing npm Completed in 671296ms
2026-07-24T11:51:55.1869386Z 
2026-07-24T11:51:55.1869496Z npm ERR! A complete log of this run can be found in:
2026-07-24T11:51:55.1869710Z npm ERR!     /home/sadscp01/.npm/_logs/2026-07-24T11_51_55_075Z-debug.log
2026-07-24T11:51:55.2095303Z Found npm debug log, make sure the path matches with the one in npm's output: /home/sadscp01/.npm/_logs/2026-07-24T11_51_55_075Z-debug.log
2026-07-24T11:51:55.2095513Z 0 info it worked if it ends with ok
2026-07-24T11:51:55.2095710Z 1 verbose cli [ '/opt/ads-agent/_work/_tool/node/10.24.1/x64/bin/node',
2026-07-24T11:51:55.2095926Z 1 verbose cli   '/opt/ads-agent/_work/_tool/node/10.24.1/x64/bin/npm',
2026-07-24T11:51:55.2096104Z 1 verbose cli   'install',
2026-07-24T11:51:55.2096258Z 1 verbose cli   '--no-audit',
2026-07-24T11:51:55.2096409Z 1 verbose cli   '--verbose' ]
2026-07-24T11:51:55.2096518Z 2 info using npm@6.14.12
2026-07-24T11:51:55.2096620Z 3 info using node@v10.24.1
2026-07-24T11:51:55.2096782Z 4 verbose npm-session ca59879d6ec8190b
2026-07-24T11:51:55.2096912Z 5 silly install runPreinstallTopLevelLifecycles
2026-07-24T11:51:55.2097303Z 6 silly preinstall siceds@1.31.0-5
2026-07-24T11:51:55.2097495Z 7 info lifecycle siceds@1.31.0-5~preinstall: siceds@1.31.0-5
2026-07-24T11:51:55.2097619Z 8 silly install loadCurrentTree
2026-07-24T11:51:55.2097737Z 9 silly install readLocalPackageData
2026-07-24T11:51:55.2097886Z 10 timing stage:loadCurrentTree Completed in 10ms
2026-07-24T11:51:55.2098014Z 11 silly install loadIdealTree
2026-07-24T11:51:55.2098138Z 12 silly install cloneCurrentTreeToIdealTree
2026-07-24T11:51:55.2098282Z 13 timing stage:loadIdealTree:cloneCurrentTree Completed in 0ms
2026-07-24T11:51:55.2098416Z 14 silly install loadShrinkwrap
2026-07-24T11:51:55.2098648Z 15 timing stage:loadIdealTree:loadShrinkwrap Completed in 4ms
2026-07-24T11:51:55.2098823Z 16 silly install loadAllDepsIntoIdealTree
2026-07-24T11:51:55.2099088Z 17 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fjasminewd2 47ms (from cache)
2026-07-24T11:51:55.2099370Z 18 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fjspdf 54ms (from cache)
2026-07-24T11:51:55.2099547Z 19 silly pacote range manifest for @types/jasminewd2@~2.0.3 fetched in 58ms
2026-07-24T11:51:55.2099697Z 20 silly pacote range manifest for @types/jspdf@^1.3.3 fetched in 62ms
2026-07-24T11:51:55.2099943Z 21 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/jasmine-spec-reporter 38ms (from cache)
2026-07-24T11:51:55.2100211Z 22 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/jasmine-core 95ms (from cache)
2026-07-24T11:51:55.2100449Z 23 silly pacote range manifest for jasmine-spec-reporter@~4.2.1 fetched in 54ms
2026-07-24T11:51:55.2100764Z 24 silly pacote range manifest for jasmine-core@^2.99.1 fetched in 111ms
2026-07-24T11:51:55.2101007Z 25 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/codelyzer 117ms (from cache)
2026-07-24T11:51:55.2101176Z 26 silly pacote range manifest for codelyzer@~4.5.0 fetched in 129ms
2026-07-24T11:51:55.2101421Z 27 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma-chrome-launcher 38ms (from cache)
2026-07-24T11:51:55.2101659Z 28 silly pacote range manifest for karma-chrome-launcher@~2.2.0 fetched in 47ms
2026-07-24T11:51:55.2101924Z 29 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma-coverage-istanbul-reporter 45ms (from cache)
2026-07-24T11:51:55.2102204Z 30 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fjasmine 177ms (from cache)
2026-07-24T11:51:55.2102455Z 31 silly pacote range manifest for karma-coverage-istanbul-reporter@~2.0.1 fetched in 72ms
2026-07-24T11:51:55.2102613Z 32 silly pacote range manifest for @types/jasmine@^2.8.8 fetched in 201ms
2026-07-24T11:51:55.2102858Z 33 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma-jasmine 76ms (from cache)
2026-07-24T11:51:55.2103132Z 34 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma-jasmine-html-reporter 54ms (from cache)
2026-07-24T11:51:55.2103372Z 35 silly pacote range manifest for karma-jasmine@~1.1.2 fetched in 85ms
2026-07-24T11:51:55.2103592Z 36 silly pacote range manifest for karma-jasmine-html-reporter@^0.2.2 fetched in 59ms
2026-07-24T11:51:55.2103850Z 37 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma-sonarqube-reporter 22ms (from cache)
2026-07-24T11:51:55.2104124Z 38 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma-junit-reporter 32ms (from cache)
2026-07-24T11:51:55.2104634Z 39 silly pacote range manifest for karma-sonarqube-reporter@^1.4.0 fetched in 29ms
2026-07-24T11:51:55.2104930Z 40 silly pacote range manifest for karma-junit-reporter@^2.0.1 fetched in 41ms
2026-07-24T11:51:55.2105191Z 41 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma-spec-reporter 20ms (from cache)
2026-07-24T11:51:55.2105433Z 42 silly pacote version manifest for karma-spec-reporter@0.0.36 fetched in 29ms
2026-07-24T11:51:55.2105667Z 43 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/protractor 38ms (from cache)
2026-07-24T11:51:55.2105832Z 44 silly pacote range manifest for protractor@~5.4.0 fetched in 48ms
2026-07-24T11:51:55.2106313Z 45 warn deprecated protractor@5.4.4: We have news to share - Protractor is deprecated and will reach end-of-life by Summer 2023. To learn more and find out about other options please refer to this post on the Angular blog. Thank you for using and contributing to Protractor. https://goo.gle/state-of-e2e-in-angular
2026-07-24T11:51:55.2106655Z 46 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ts-node 71ms (from cache)
2026-07-24T11:51:55.2106877Z 47 silly pacote range manifest for ts-node@~7.0.0 fetched in 81ms
2026-07-24T11:51:55.2107122Z 48 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fnode 326ms (from cache)
2026-07-24T11:51:55.2107290Z 49 silly pacote range manifest for @types/node@^8.10.66 fetched in 512ms
2026-07-24T11:51:55.2107597Z 50 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/tslint 286ms (from cache)
2026-07-24T11:51:55.2107778Z 51 silly pacote range manifest for tslint@~5.11.0 fetched in 309ms
2026-07-24T11:51:55.2108037Z 52 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular%2flanguage-service 659ms (from cache)
2026-07-24T11:51:55.2108287Z 53 silly pacote range manifest for @angular/language-service@~7.2.0 fetched in 690ms
2026-07-24T11:51:55.2108522Z 54 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma 657ms (from cache)
2026-07-24T11:51:55.2108761Z 55 silly pacote range manifest for karma@~4.0.0 fetched in 724ms
2026-07-24T11:51:55.2109013Z 56 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@angular%2fflex-layout 26ms (from cache)
2026-07-24T11:51:55.2109306Z 57 silly pacote range manifest for @angular/flex-layout@^7.0.0-beta.24 fetched in 31ms
2026-07-24T11:51:55.2109620Z 58 warn deprecated @angular/flex-layout@7.0.0-beta.24: This package has been deprecated. Please see https://blog.angular.io/modern-css-in-angular-layouts-4a259dca9127
2026-07-24T11:51:55.2109906Z 59 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular%2fcli 836ms (from cache)
2026-07-24T11:51:55.2110180Z 60 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular%2fcompiler-cli 869ms (from cache)
2026-07-24T11:51:55.2110419Z 61 silly pacote range manifest for @angular/cli@~7.3.8 fetched in 901ms
2026-07-24T11:51:55.2110642Z 62 silly pacote range manifest for @angular/compiler-cli@~7.2.0 fetched in 903ms
2026-07-24T11:51:55.2110893Z 63 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular%2fanimations 685ms (from cache)
2026-07-24T11:51:55.2111069Z 64 silly pacote range manifest for @angular/animations@^7.2.14 fetched in 731ms
2026-07-24T11:51:55.2111319Z 65 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular%2fcompiler 492ms (from cache)
2026-07-24T11:51:55.2111598Z 66 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular-devkit%2fbuild-angular 1078ms (from cache)
2026-07-24T11:51:55.2111774Z 67 silly pacote range manifest for @angular/compiler@^7.2.14 fetched in 560ms
2026-07-24T11:51:55.2112009Z 68 silly pacote range manifest for @angular-devkit/build-angular@~0.13.0 fetched in 1119ms
2026-07-24T11:51:55.2112263Z 69 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular%2fcommon 655ms (from cache)
2026-07-24T11:51:55.2112437Z 70 silly pacote range manifest for @angular/common@^7.2.14 fetched in 701ms
2026-07-24T11:51:55.2112685Z 71 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fhtml2canvas 13ms (from cache)
2026-07-24T11:51:55.2112855Z 72 silly pacote version manifest for @types/html2canvas@0.0.35 fetched in 17ms
2026-07-24T11:51:55.2113097Z 73 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/typescript 994ms (from cache)
2026-07-24T11:51:55.2113255Z 74 silly pacote range manifest for typescript@~3.2.2 fetched in 1130ms
2026-07-24T11:51:55.2113495Z 75 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fxlsx 145ms (from cache)
2026-07-24T11:51:55.2113693Z 76 silly pacote version manifest for @types/xlsx@0.0.36 fetched in 149ms
2026-07-24T11:51:55.2114020Z 77 warn deprecated @types/xlsx@0.0.36: This is a stub types definition for xlsx (https://github.com/sheetjs/js-xlsx). xlsx provides its own type definitions, so you don't need @types/xlsx installed!
2026-07-24T11:51:55.2114320Z 78 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular%2fcdk 1081ms (from cache)
2026-07-24T11:51:55.2114593Z 79 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/chartjs-plugin-datalabels 38ms (from cache)
2026-07-24T11:51:55.2114762Z 80 silly pacote range manifest for @angular/cdk@^7.3.7 fetched in 1110ms
2026-07-24T11:51:55.2114984Z 81 silly pacote range manifest for chartjs-plugin-datalabels@^0.7.0 fetched in 42ms
2026-07-24T11:51:55.2115219Z 82 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/file-system 5ms (from cache)
2026-07-24T11:51:55.2115444Z 83 silly pacote range manifest for file-system@^2.2.2 fetched in 7ms
2026-07-24T11:51:55.2115685Z 84 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/font-awesome 3ms (from cache)
2026-07-24T11:51:55.2115943Z 85 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/chart.js 60ms (from cache)
2026-07-24T11:51:55.2116168Z 86 silly pacote range manifest for font-awesome@^4.7.0 fetched in 10ms
2026-07-24T11:51:55.2116314Z 87 silly pacote version manifest for chart.js@2.8.0 fetched in 67ms
2026-07-24T11:51:55.2116577Z 88 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular%2fmaterial-moment-adapter 555ms (from cache)
2026-07-24T11:51:55.2116863Z 89 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fs-filesystem 25ms (from cache)
2026-07-24T11:51:55.2117119Z 90 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/hammerjs 25ms (from cache)
2026-07-24T11:51:55.2117362Z 91 silly pacote range manifest for @angular/material-moment-adapter@^7.3.7 fetched in 572ms
2026-07-24T11:51:55.2117580Z 92 silly pacote range manifest for fs-filesystem@^2.1.2 fetched in 29ms
2026-07-24T11:51:55.2117727Z 93 silly pacote range manifest for hammerjs@^2.0.8 fetched in 30ms
2026-07-24T11:51:55.2117956Z 94 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/jspdf 9ms (from cache)
2026-07-24T11:51:55.2118210Z 95 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/html2canvas 15ms (from cache)
2026-07-24T11:51:55.2118366Z 96 silly pacote range manifest for jspdf@^1.5.3 fetched in 16ms
2026-07-24T11:51:55.2118669Z 97 silly pacote range manifest for html2canvas@^1.0.0-rc.7 fetched in 20ms
2026-07-24T11:51:55.2118937Z 98 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/keycloak-angular 20ms (from cache)
2026-07-24T11:51:55.2119170Z 99 silly pacote range manifest for keycloak-angular@^5.1.0 fetched in 27ms
2026-07-24T11:51:55.2119407Z 100 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/core-js 84ms (from cache)
2026-07-24T11:51:55.2119631Z 101 silly pacote range manifest for core-js@^2.6.11 fetched in 97ms
2026-07-24T11:51:55.2120135Z 102 warn deprecated core-js@2.6.12: core-js@<3.23.3 is no longer maintained and not recommended for usage due to the number of issues. Because of the V8 engine whims, feature detection in old core-js versions could cause a slowdown up to 100x even if nothing is polyfilled. Some versions have web compatibility issues. Please, upgrade your dependencies to the actual version of core-js.
2026-07-24T11:51:55.2120517Z 103 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular%2fmaterial 636ms (from cache)
2026-07-24T11:51:55.2120691Z 104 silly pacote range manifest for @angular/material@^7.3.7 fetched in 710ms
2026-07-24T11:51:55.2120925Z 105 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/moment 107ms (from cache)
2026-07-24T11:51:55.2121184Z 106 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/keycloak-js 145ms (from cache)
2026-07-24T11:51:55.2121350Z 107 silly pacote range manifest for moment@^2.29.4 fetched in 144ms
2026-07-24T11:51:55.2121593Z 108 silly pacote range manifest for keycloak-js@^6.0.1 fetched in 158ms
2026-07-24T11:51:55.2121838Z 109 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular%2fcore 967ms (from cache)
2026-07-24T11:51:55.2122012Z 110 silly pacote range manifest for @angular/core@^7.2.14 fetched in 990ms
2026-07-24T11:51:55.2122252Z 111 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/lodash 187ms (from cache)
2026-07-24T11:51:55.2122507Z 112 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ng2-charts 162ms (from cache)
2026-07-24T11:51:55.2122675Z 113 silly pacote range manifest for lodash@^4.17.20 fetched in 198ms
2026-07-24T11:51:55.2122887Z 114 silly pacote version manifest for ng2-charts@2.2.3 fetched in 171ms
2026-07-24T11:51:55.2123130Z 115 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ngx-currency 48ms (from cache)
2026-07-24T11:51:55.2123360Z 116 silly pacote range manifest for ngx-currency@^2.5.2 fetched in 51ms
2026-07-24T11:51:55.2123614Z 117 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular%2fforms 888ms (from cache)
2026-07-24T11:51:55.2123787Z 118 silly pacote range manifest for @angular/forms@^7.2.14 fetched in 911ms
2026-07-24T11:51:55.2124023Z 119 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ngx-spinner 41ms (from cache)
2026-07-24T11:51:55.2124255Z 120 silly pacote range manifest for ngx-spinner@^7.2.0 fetched in 45ms
2026-07-24T11:51:55.2124499Z 121 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ngx-bootstrap 131ms (from cache)
2026-07-24T11:51:55.2124764Z 122 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ngx-clipboard 99ms (from cache)
2026-07-24T11:51:55.2125022Z 123 silly pacote range manifest for ngx-bootstrap@^4.0.0 fetched in 142ms
2026-07-24T11:51:55.2125261Z 124 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ts-xlsx 15ms (from cache)
2026-07-24T11:51:55.2125490Z 125 silly pacote range manifest for ngx-clipboard@^10.0.0 fetched in 107ms
2026-07-24T11:51:55.2125698Z 126 silly pacote version manifest for ts-xlsx@0.0.11 fetched in 18ms
2026-07-24T11:51:55.2125921Z 127 warn deprecated ts-xlsx@0.0.11: since version 0.10.3 of xlsx, it comes with embeded typings
2026-07-24T11:51:55.2126177Z 128 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ngx-editor 82ms (from cache)
2026-07-24T11:51:55.2126436Z 129 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ngx-toastr 66ms (from cache)
2026-07-24T11:51:55.2126601Z 130 silly pacote range manifest for @types/jasmine@* fetched in 13ms
2026-07-24T11:51:55.2126806Z 131 silly pacote range manifest for ngx-editor@^4.1.1 fetched in 93ms
2026-07-24T11:51:55.2127013Z 132 silly pacote range manifest for ngx-toastr@^10.1.0 fetched in 72ms
2026-07-24T11:51:55.2127250Z 133 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/tslib 22ms (from cache)
2026-07-24T11:51:55.2127405Z 134 silly pacote range manifest for tslib@^2.2.0 fetched in 23ms
2026-07-24T11:51:55.2127654Z 135 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/css-selector-tokenizer 5ms (from cache)
2026-07-24T11:51:55.2127923Z 136 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/app-root-path 6ms (from cache)
2026-07-24T11:51:55.2128186Z 137 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/colors 10ms (from cache)
2026-07-24T11:51:55.2128420Z 138 silly pacote range manifest for css-selector-tokenizer@^0.7.0 fetched in 10ms
2026-07-24T11:51:55.2128705Z 139 silly pacote range manifest for app-root-path@^2.1.0 fetched in 11ms
2026-07-24T11:51:55.2128862Z 140 silly pacote version manifest for colors@1.1.2 fetched in 14ms
2026-07-24T11:51:55.2129101Z 141 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cssauron 9ms (from cache)
2026-07-24T11:51:55.2129360Z 142 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/semver-dsl 6ms (from cache)
2026-07-24T11:51:55.2129525Z 143 silly pacote range manifest for cssauron@^1.4.0 fetched in 12ms
2026-07-24T11:51:55.2129768Z 144 silly pacote range manifest for semver-dsl@^1.0.1 fetched in 9ms
2026-07-24T11:51:55.2130009Z 145 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/sprintf-js 8ms (from cache)
2026-07-24T11:51:55.2130236Z 146 silly pacote range manifest for sprintf-js@^1.1.1 fetched in 10ms
2026-07-24T11:51:55.2130472Z 147 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fs-access 5ms (from cache)
2026-07-24T11:51:55.2130720Z 148 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/zone.js 44ms (from cache)
2026-07-24T11:51:55.2130943Z 149 silly pacote range manifest for fs-access@^1.0.0 fetched in 12ms
2026-07-24T11:51:55.2131178Z 150 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/which 16ms (from cache)
2026-07-24T11:51:55.2131343Z 151 silly pacote range manifest for zone.js@~0.8.26 fetched in 52ms
2026-07-24T11:51:55.2131489Z 152 silly pacote range manifest for which@^1.2.1 fetched in 20ms
2026-07-24T11:51:55.2131695Z 153 silly pacote range manifest for karma-jasmine@^1.0.2 fetched in 4ms
2026-07-24T11:51:55.2131937Z 154 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/istanbul-api 21ms (from cache)
2026-07-24T11:51:55.2132192Z 155 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fglob 10ms (from cache)
2026-07-24T11:51:55.2132419Z 156 silly pacote range manifest for istanbul-api@^2.1.6 fetched in 27ms
2026-07-24T11:51:55.2132565Z 157 silly pacote range manifest for @types/glob@^7.1.2 fetched in 14ms
2026-07-24T11:51:55.2132807Z 158 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fkarma 14ms (from cache)
2026-07-24T11:51:55.2133100Z 159 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/ngx-mask 138ms (from cache)
2026-07-24T11:51:55.2133268Z 160 silly pacote range manifest for @types/karma@* fetched in 30ms
2026-07-24T11:51:55.2133512Z 161 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fmkdirp 22ms (from cache)
2026-07-24T11:51:55.2133769Z 162 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/clone-regexp 21ms (from cache)
2026-07-24T11:51:55.2133995Z 163 silly pacote range manifest for ngx-mask@^8.1.6 fetched in 154ms
2026-07-24T11:51:55.2134142Z 164 silly pacote range manifest for @types/mkdirp@^1.0.0 fetched in 25ms
2026-07-24T11:51:55.2134350Z 165 silly pacote range manifest for clone-regexp@^2.0.0 fetched in 25ms
2026-07-24T11:51:55.2134585Z 166 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/rxjs 122ms (from cache)
2026-07-24T11:51:55.2134841Z 167 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/source-map 81ms (from cache)
2026-07-24T11:51:55.2135007Z 168 silly pacote range manifest for rxjs@^6.6.3 fetched in 139ms
2026-07-24T11:51:55.2135206Z 169 silly pacote range manifest for source-map@^0.5.7 fetched in 88ms
2026-07-24T11:51:55.2135462Z 170 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular%2fplatform-browser 874ms (from cache)
2026-07-24T11:51:55.2135787Z 171 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/js2xmlparser 52ms (from cache)
2026-07-24T11:51:55.2136059Z 172 silly pacote range manifest for @angular/platform-browser@^7.2.14 fetched in 900ms
2026-07-24T11:51:55.2136259Z 173 silly pacote range manifest for js2xmlparser@^4.0.0 fetched in 59ms
2026-07-24T11:51:55.2136602Z 174 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/path-is-absolute 36ms (from cache)
2026-07-24T11:51:55.2136945Z 175 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/minimatch 103ms (from cache)
2026-07-24T11:51:55.2137106Z 176 silly pacote version manifest for colors@1.4.0 fetched in 12ms
2026-07-24T11:51:55.2137320Z 177 silly pacote range manifest for path-is-absolute@^1.0.0 fetched in 48ms
2026-07-24T11:51:55.2137467Z 178 silly pacote range manifest for minimatch@^3.0.4 fetched in 115ms
2026-07-24T11:51:55.2137703Z 179 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/blocking-proxy 5ms (from cache)
2026-07-24T11:51:55.2137963Z 180 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fq 11ms (from cache)
2026-07-24T11:51:55.2138231Z 181 silly pacote range manifest for blocking-proxy@^1.0.0 fetched in 8ms
2026-07-24T11:51:55.2138493Z 182 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/browserstack 9ms (from cache)
2026-07-24T11:51:55.2138829Z 183 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/xmlbuilder 59ms (from cache)
2026-07-24T11:51:55.2138987Z 184 silly pacote range manifest for @types/q@^0.0.32 fetched in 20ms
2026-07-24T11:51:55.2139223Z 185 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/winston 86ms (from cache)
2026-07-24T11:51:55.2139489Z 186 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular%2frouter 833ms (from cache)
2026-07-24T11:51:55.2139660Z 187 silly pacote range manifest for browserstack@^1.5.1 fetched in 49ms
2026-07-24T11:51:55.2139812Z 188 silly pacote version manifest for xmlbuilder@12.0.0 fetched in 100ms
2026-07-24T11:51:55.2139962Z 189 silly pacote range manifest for @angular/router@^7.2.14 fetched in 863ms
2026-07-24T11:51:55.2140108Z 190 silly pacote range manifest for winston@^3.0.0 fetched in 126ms
2026-07-24T11:51:55.2140430Z 191 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular%2fplatform-browser-dynamic 875ms (from cache)
2026-07-24T11:51:55.2140708Z 192 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/mkdirp 164ms (from cache)
2026-07-24T11:51:55.2140958Z 193 silly pacote range manifest for @angular/platform-browser-dynamic@^7.2.14 fetched in 905ms
2026-07-24T11:51:55.2141114Z 194 silly pacote range manifest for mkdirp@^1.0.0 fetched in 168ms
2026-07-24T11:51:55.2141398Z 195 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/jasminewd2 42ms (from cache)
2026-07-24T11:51:55.2141651Z 196 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/chalk 90ms (from cache)
2026-07-24T11:51:55.2141814Z 197 silly pacote range manifest for jasminewd2@^2.1.0 fetched in 47ms
2026-07-24T11:51:55.2142044Z 198 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/glob 179ms (from cache)
2026-07-24T11:51:55.2142202Z 199 silly pacote range manifest for chalk@^1.1.3 fetched in 106ms
2026-07-24T11:51:55.2142456Z 200 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fselenium-webdriver 118ms (from cache)
2026-07-24T11:51:55.2142629Z 201 silly pacote range manifest for glob@^7.1.2 fetched in 202ms
2026-07-24T11:51:55.2142859Z 202 warn deprecated glob@7.2.3: Old versions of glob are not supported, and contain widely publicized security vulnerabilities, which have been fixed in the current version. Please update. Support for old versions may be purchased (at exorbitant rates) by contacting i@izs.me
2026-07-24T11:51:55.2143170Z 203 silly pacote range manifest for @types/selenium-webdriver@^3.0.0 fetched in 131ms
2026-07-24T11:51:55.2143412Z 204 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/jasmine 84ms (from cache)
2026-07-24T11:51:55.2143682Z 205 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/webdriver-js-extender 41ms (from cache)
2026-07-24T11:51:55.2143849Z 206 silly pacote version manifest for jasmine@2.8.0 fetched in 99ms
2026-07-24T11:51:55.2144064Z 207 silly pacote version manifest for webdriver-js-extender@2.1.0 fetched in 49ms
2026-07-24T11:51:55.2144302Z 208 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/q 111ms (from cache)
2026-07-24T11:51:55.2144551Z 209 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/yn 41ms (from cache)
2026-07-24T11:51:55.2144816Z 210 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/source-map-support 78ms (from cache)
2026-07-24T11:51:55.2144988Z 211 silly pacote range manifest for yn@^2.0.0 fetched in 47ms
2026-07-24T11:51:55.2145128Z 212 silly pacote version manifest for q@1.4.1 fetched in 123ms
2026-07-24T11:51:55.2145378Z 213 warn deprecated q@1.4.1: You or someone you depend on is using Q, the JavaScript Promise library that gave JavaScript developers strong feelings about promises. They can almost certainly migrate to the native JavaScript promise now. Thank you literally everyone for joining me in this bet against the odds. Be excellent to each other.
2026-07-24T11:51:55.2145648Z 213 warn deprecated
2026-07-24T11:51:55.2145855Z 213 warn deprecated (For a CapTP with native promises, see @endo/eventual-send and @endo/captp)
2026-07-24T11:51:55.2146082Z 214 silly pacote range manifest for source-map-support@~0.4.0 fetched in 84ms
2026-07-24T11:51:55.2146322Z 215 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/arrify 17ms (from cache)
2026-07-24T11:51:55.2146491Z 216 silly pacote range manifest for mkdirp@^0.5.1 fetched in 3ms
2026-07-24T11:51:55.2146633Z 217 silly pacote range manifest for arrify@^1.0.0 fetched in 19ms
2026-07-24T11:51:55.2146878Z 218 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/webdriver-manager 70ms (from cache)
2026-07-24T11:51:55.2147108Z 219 silly pacote range manifest for source-map-support@^0.5.6 fetched in 1ms
2026-07-24T11:51:55.2147328Z 220 silly pacote range manifest for webdriver-manager@^12.0.6 fetched in 73ms
2026-07-24T11:51:55.2147570Z 221 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/make-error 9ms (from cache)
2026-07-24T11:51:55.2147826Z 222 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/buffer-from 9ms (from cache)
2026-07-24T11:51:55.2148080Z 223 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/minimist 14ms (from cache)
2026-07-24T11:51:55.2148304Z 224 silly pacote range manifest for make-error@^1.1.1 fetched in 15ms
2026-07-24T11:51:55.2148559Z 225 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/diff 46ms (from cache)
2026-07-24T11:51:55.2148853Z 226 silly pacote range manifest for buffer-from@^1.1.0 fetched in 16ms
2026-07-24T11:51:55.2149081Z 227 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/glob 185ms (from cache)
2026-07-24T11:51:55.2149247Z 228 silly pacote range manifest for minimist@^1.2.0 fetched in 29ms
2026-07-24T11:51:55.2149389Z 229 silly pacote range manifest for chalk@^2.3.0 fetched in 12ms
2026-07-24T11:51:55.2149527Z 230 silly pacote range manifest for diff@^3.1.0 fetched in 62ms
2026-07-24T11:51:55.2149770Z 231 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/builtin-modules 23ms (from cache)
2026-07-24T11:51:55.2149936Z 232 silly pacote range manifest for glob@^7.0.3 fetched in 199ms
2026-07-24T11:51:55.2150068Z 233 silly pacote range manifest for diff@^3.2.0 fetched in 6ms
2026-07-24T11:51:55.2150207Z 234 silly pacote range manifest for glob@^7.1.1 fetched in 6ms
2026-07-24T11:51:55.2150415Z 235 silly pacote range manifest for builtin-modules@^1.1.1 fetched in 27ms
2026-07-24T11:51:55.2150661Z 236 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/babel-code-frame 29ms (from cache)
2026-07-24T11:51:55.2150925Z 237 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/saucelabs 163ms (from cache)
2026-07-24T11:51:55.2151086Z 238 silly pacote range manifest for tslib@^1.8.0 fetched in 9ms
2026-07-24T11:51:55.2151300Z 239 silly pacote range manifest for babel-code-frame@^6.22.0 fetched in 37ms
2026-07-24T11:51:55.2151443Z 240 silly pacote range manifest for saucelabs@^1.5.0 fetched in 170ms
2026-07-24T11:51:55.2151673Z 241 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/di 5ms (from cache)
2026-07-24T11:51:55.2151940Z 242 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/selenium-webdriver 136ms (from cache)
2026-07-24T11:51:55.2152108Z 243 silly pacote range manifest for di@^0.0.1 fetched in 13ms
2026-07-24T11:51:55.2152323Z 244 silly pacote version manifest for selenium-webdriver@3.6.0 fetched in 144ms
2026-07-24T11:51:55.2152558Z 245 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/tmp 14ms (from cache)
2026-07-24T11:51:55.2152814Z 246 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/js-yaml 33ms (from cache)
2026-07-24T11:51:55.2152970Z 247 silly pacote version manifest for tmp@0.0.33 fetched in 25ms
2026-07-24T11:51:55.2153211Z 248 silly pacote range manifest for js-yaml@^3.7.0 fetched in 40ms
2026-07-24T11:51:55.2153443Z 249 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/mime 27ms (from cache)
2026-07-24T11:51:55.2153605Z 250 silly pacote range manifest for colors@^1.1.0 fetched in 8ms
2026-07-24T11:51:55.2153835Z 251 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/qjobs 21ms (from cache)
2026-07-24T11:51:55.2153999Z 252 silly pacote range manifest for lodash@^4.17.11 fetched in 9ms
2026-07-24T11:51:55.2154138Z 253 silly pacote range manifest for mime@^2.3.1 fetched in 34ms
2026-07-24T11:51:55.2154366Z 254 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/resolve 49ms (from cache)
2026-07-24T11:51:55.2154528Z 255 silly pacote range manifest for qjobs@^1.1.4 fetched in 29ms
2026-07-24T11:51:55.2154760Z 256 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/semver 52ms (from cache)
2026-07-24T11:51:55.2154922Z 257 silly pacote range manifest for resolve@^1.3.2 fetched in 62ms
2026-07-24T11:51:55.2155156Z 258 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/tsutils 59ms (from cache)
2026-07-24T11:51:55.2155376Z 259 silly pacote range manifest for core-js@^2.2.0 fetched in 8ms
2026-07-24T11:51:55.2155518Z 260 silly pacote range manifest for semver@^5.3.0 fetched in 64ms
2026-07-24T11:51:55.2155747Z 261 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/commander 85ms (from cache)
2026-07-24T11:51:55.2155910Z 262 silly pacote range manifest for tsutils@^2.27.2 fetched in 78ms
2026-07-24T11:51:55.2156139Z 263 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/braces 56ms (from cache)
2026-07-24T11:51:55.2156327Z 264 silly pacote range manifest for commander@^2.12.1 fetched in 104ms
2026-07-24T11:51:55.2156468Z 265 silly pacote range manifest for braces@^2.3.2 fetched in 64ms
2026-07-24T11:51:55.2156607Z 266 silly pacote range manifest for minimatch@^3.0.2 fetched in 3ms
2026-07-24T11:51:55.2156840Z 267 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/yargs 180ms (from cache)
2026-07-24T11:51:55.2156994Z 268 silly pacote range manifest for yargs@^12.0.5 fetched in 189ms
2026-07-24T11:51:55.2157228Z 269 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/optimist 20ms (from cache)
2026-07-24T11:51:55.2157391Z 270 silly pacote range manifest for optimist@^0.6.1 fetched in 23ms
2026-07-24T11:51:55.2157620Z 271 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/rimraf 64ms (from cache)
2026-07-24T11:51:55.2157873Z 272 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/useragent 21ms (from cache)
2026-07-24T11:51:55.2158103Z 273 silly pacote range manifest for source-map@^0.6.1 fetched in 6ms
2026-07-24T11:51:55.2158246Z 274 silly pacote range manifest for rimraf@^2.6.0 fetched in 71ms
2026-07-24T11:51:55.2158388Z 275 warn deprecated rimraf@2.7.1: Rimraf versions prior to v4 are no longer supported
2026-07-24T11:51:55.2158540Z 276 silly pacote version manifest for useragent@2.3.0 fetched in 26ms
2026-07-24T11:51:55.2158845Z 277 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/chokidar 54ms (from cache)
2026-07-24T11:51:55.2159011Z 278 silly pacote range manifest for chokidar@^2.0.3 fetched in 63ms
2026-07-24T11:51:55.2159248Z 279 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/safe-buffer 14ms (from cache)
2026-07-24T11:51:55.2159507Z 280 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/log4js 90ms (from cache)
2026-07-24T11:51:55.2159763Z 281 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/http-proxy 42ms (from cache)
2026-07-24T11:51:55.2159985Z 282 silly pacote range manifest for safe-buffer@^5.0.1 fetched in 34ms
2026-07-24T11:51:55.2160127Z 283 silly pacote range manifest for log4js@^4.0.0 fetched in 109ms
2026-07-24T11:51:55.2160280Z 284 warn deprecated log4js@4.5.1: 4.x is no longer supported. Please upgrade to 6.x or higher.
2026-07-24T11:51:55.2160496Z 285 silly pacote range manifest for http-proxy@^1.13.0 fetched in 51ms
2026-07-24T11:51:55.2160778Z 286 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/connect 108ms (from cache)
2026-07-24T11:51:55.2161033Z 287 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/graceful-fs 45ms (from cache)
2026-07-24T11:51:55.2161194Z 288 silly pacote range manifest for tslib@^1.7.1 fetched in 6ms
2026-07-24T11:51:55.2161326Z 289 silly pacote range manifest for connect@^3.6.0 fetched in 119ms
2026-07-24T11:51:55.2161531Z 290 silly pacote range manifest for graceful-fs@^4.1.2 fetched in 50ms
2026-07-24T11:51:55.2161765Z 291 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/flatted 102ms (from cache)
2026-07-24T11:51:55.2162025Z 292 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/isbinaryfile 43ms (from cache)
2026-07-24T11:51:55.2162279Z 293 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/socket.io 84ms (from cache)
2026-07-24T11:51:55.2162539Z 294 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/dom-serialize 30ms (from cache)
2026-07-24T11:51:55.2162801Z 295 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/range-parser 33ms (from cache)
2026-07-24T11:51:55.2162960Z 296 silly pacote range manifest for flatted@^2.0.0 fetched in 121ms
2026-07-24T11:51:55.2163103Z 297 silly pacote range manifest for isbinaryfile@^3.0.0 fetched in 58ms
2026-07-24T11:51:55.2163339Z 298 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/bluebird 122ms (from cache)
2026-07-24T11:51:55.2163507Z 299 silly pacote version manifest for socket.io@2.1.1 fetched in 104ms
2026-07-24T11:51:55.2163739Z 300 silly pacote range manifest for dom-serialize@^2.2.0 fetched in 42ms
2026-07-24T11:51:55.2163948Z 301 silly pacote range manifest for range-parser@^1.2.0 fetched in 44ms
2026-07-24T11:51:55.2164091Z 302 silly pacote version manifest for semver@5.6.0 fetched in 10ms
2026-07-24T11:51:55.2164225Z 303 silly pacote range manifest for bluebird@^3.3.0 fetched in 131ms
2026-07-24T11:51:55.2164453Z 304 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ini 34ms (from cache)
2026-07-24T11:51:55.2164717Z 305 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@yarnpkg%2flockfile 8ms (from cache)
2026-07-24T11:51:55.2164882Z 306 silly pacote version manifest for ini@1.3.5 fetched in 38ms
2026-07-24T11:51:55.2165038Z 307 warn deprecated ini@1.3.5: Please update to ini >=1.3.6 to avoid a prototype pollution issue
2026-07-24T11:51:55.2165195Z 308 silly pacote version manifest for @yarnpkg/lockfile@1.1.0 fetched in 14ms
2026-07-24T11:51:55.2165430Z 309 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/open 44ms (from cache)
2026-07-24T11:51:55.2165688Z 310 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/symbol-observable 16ms (from cache)
2026-07-24T11:51:55.2165860Z 311 silly pacote version manifest for open@6.0.0 fetched in 50ms
2026-07-24T11:51:55.2166074Z 312 silly pacote version manifest for symbol-observable@1.2.0 fetched in 21ms
2026-07-24T11:51:55.2166224Z 313 silly pacote range manifest for tslib@^1.9.0 fetched in 2ms
2026-07-24T11:51:55.2166467Z 314 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/npm-package-arg 26ms (from cache)
2026-07-24T11:51:55.2166734Z 315 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/body-parser 111ms (from cache)
2026-07-24T11:51:55.2166896Z 316 silly pacote version manifest for yargs@13.1.0 fetched in 7ms
2026-07-24T11:51:55.2167099Z 317 silly pacote version manifest for npm-package-arg@6.1.0 fetched in 35ms
2026-07-24T11:51:55.2167312Z 318 silly pacote range manifest for body-parser@^1.16.1 fetched in 118ms
2026-07-24T11:51:55.2167461Z 319 silly pacote range manifest for chokidar@^2.1.1 fetched in 8ms
2026-07-24T11:51:55.2167701Z 320 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/canonical-path 12ms (from cache)
2026-07-24T11:51:55.2167937Z 321 silly pacote version manifest for canonical-path@1.0.0 fetched in 19ms
2026-07-24T11:51:55.2168176Z 322 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/shelljs 38ms (from cache)
2026-07-24T11:51:55.2168358Z 323 silly pacote range manifest for shelljs@^0.8.1 fetched in 45ms
2026-07-24T11:51:55.2168698Z 324 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/dependency-graph 24ms (from cache)
2026-07-24T11:51:55.2168952Z 325 silly pacote range manifest for dependency-graph@^0.7.2 fetched in 30ms
2026-07-24T11:51:55.2169199Z 326 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/reflect-metadata 20ms (from cache)
2026-07-24T11:51:55.2169433Z 327 silly pacote range manifest for reflect-metadata@^0.1.2 fetched in 23ms
2026-07-24T11:51:55.2169670Z 328 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/inquirer 109ms (from cache)
2026-07-24T11:51:55.2169934Z 329 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/convert-source-map 26ms (from cache)
2026-07-24T11:51:55.2170104Z 330 silly pacote version manifest for inquirer@6.2.1 fetched in 126ms
2026-07-24T11:51:55.2170318Z 331 silly pacote range manifest for convert-source-map@^1.5.1 fetched in 30ms
2026-07-24T11:51:55.2170460Z 332 silly pacote version manifest for glob@7.1.3 fetched in 2ms
2026-07-24T11:51:55.2170696Z 333 warn deprecated glob@7.1.3: Old versions of glob are not supported, and contain widely publicized security vulnerabilities, which have been fixed in the current version. Please update. Support for old versions may be purchased (at exorbitant rates) by contacting i@izs.me
2026-07-24T11:51:55.2171019Z 334 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/pacote 152ms (from cache)
2026-07-24T11:51:55.2171213Z 335 silly pacote version manifest for rxjs@6.3.3 fetched in 19ms
2026-07-24T11:51:55.2171355Z 336 silly pacote version manifest for pacote@9.4.0 fetched in 169ms
2026-07-24T11:51:55.2171598Z 337 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/magic-string 114ms (from cache)
2026-07-24T11:51:55.2171857Z 338 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/parse5 16ms (from cache)
2026-07-24T11:51:55.2172087Z 339 silly pacote range manifest for magic-string@^0.25.0 fetched in 126ms
2026-07-24T11:51:55.2172225Z 340 silly pacote version manifest for parse5@4.0.0 fetched in 20ms
2026-07-24T11:51:55.2172471Z 341 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@schematics%2fupdate 168ms (from cache)
2026-07-24T11:51:55.2172649Z 342 silly pacote version manifest for @schematics/update@0.13.10 fetched in 177ms
2026-07-24T11:51:55.2172988Z 343 warn deprecated @schematics/update@0.13.10: This was an internal-only Angular package up through Angular v11 which is no longer used or maintained. Upgrade Angular to v12+ to remove this dependency.
2026-07-24T11:51:55.2173282Z 344 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/stylus 33ms (from cache)
2026-07-24T11:51:55.2173448Z 345 silly pacote version manifest for stylus@0.54.5 fetched in 39ms
2026-07-24T11:51:55.2173590Z 346 silly pacote version manifest for minimatch@3.0.4 fetched in 2ms
2026-07-24T11:51:55.2173814Z 347 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/less 70ms (from cache)
2026-07-24T11:51:55.2173976Z 348 silly pacote version manifest for less@3.9.0 fetched in 81ms
2026-07-24T11:51:55.2174211Z 349 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/clean-css 26ms (from cache)
2026-07-24T11:51:55.2174435Z 350 silly pacote version manifest for clean-css@4.2.1 fetched in 35ms
2026-07-24T11:51:55.2174671Z 351 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/node-sass 35ms (from cache)
2026-07-24T11:51:55.2174928Z 352 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/tree-kill 25ms (from cache)
2026-07-24T11:51:55.2175154Z 353 silly pacote version manifest for node-sass@4.13.1 fetched in 46ms
2026-07-24T11:51:55.2175400Z 354 warn deprecated node-sass@4.13.1: Node Sass is no longer supported. Please use `sass` or `sass-embedded` instead.
2026-07-24T11:51:55.2175624Z 355 silly pacote version manifest for tree-kill@1.2.2 fetched in 28ms
2026-07-24T11:51:55.2175884Z 356 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ajv 132ms (from cache)
2026-07-24T11:51:55.2176141Z 357 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/raw-loader 29ms (from cache)
2026-07-24T11:51:55.2176368Z 358 silly pacote version manifest for raw-loader@1.0.0 fetched in 31ms
2026-07-24T11:51:55.2176513Z 359 silly pacote version manifest for ajv@6.9.1 fetched in 145ms
2026-07-24T11:51:55.2176744Z 360 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/file-loader 19ms (from cache)
2026-07-24T11:51:55.2176972Z 361 silly pacote version manifest for file-loader@3.0.1 fetched in 24ms
2026-07-24T11:51:55.2177209Z 362 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/less-loader 25ms (from cache)
2026-07-24T11:51:55.2177439Z 363 silly pacote version manifest for less-loader@4.1.0 fetched in 29ms
2026-07-24T11:51:55.2177675Z 364 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/postcss 109ms (from cache)
2026-07-24T11:51:55.2177841Z 365 silly pacote version manifest for postcss@7.0.14 fetched in 124ms
2026-07-24T11:51:55.2178078Z 366 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/loader-utils 30ms (from cache)
2026-07-24T11:51:55.2178305Z 367 silly pacote version manifest for loader-utils@1.2.3 fetched in 35ms
2026-07-24T11:51:55.2178545Z 368 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/sass-loader 44ms (from cache)
2026-07-24T11:51:55.2178827Z 369 silly pacote version manifest for sass-loader@7.1.0 fetched in 55ms
2026-07-24T11:51:55.2179071Z 370 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/style-loader 43ms (from cache)
2026-07-24T11:51:55.2179330Z 371 silly pacote version manifest for style-loader@0.23.1 fetched in 49ms
2026-07-24T11:51:55.2179574Z 372 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/stylus-loader 24ms (from cache)
2026-07-24T11:51:55.2179835Z 373 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/postcss-import 13ms (from cache)
2026-07-24T11:51:55.2180064Z 374 silly pacote version manifest for stylus-loader@3.0.2 fetched in 30ms
2026-07-24T11:51:55.2180278Z 375 silly pacote version manifest for postcss-import@12.0.1 fetched in 18ms
2026-07-24T11:51:55.2180515Z 376 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/webpack-merge 21ms (from cache)
2026-07-24T11:51:55.2180744Z 377 silly pacote version manifest for webpack-merge@4.2.1 fetched in 26ms
2026-07-24T11:51:55.2180987Z 378 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/postcss-loader 18ms (from cache)
2026-07-24T11:51:55.2181217Z 379 silly pacote version manifest for postcss-loader@3.0.0 fetched in 25ms
2026-07-24T11:51:55.2181460Z 380 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/webpack-sources 19ms (from cache)
2026-07-24T11:51:55.2181727Z 381 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/source-map-loader 14ms (from cache)
2026-07-24T11:51:55.2181966Z 382 silly pacote version manifest for source-map-support@0.5.10 fetched in 6ms
2026-07-24T11:51:55.2182176Z 383 silly pacote version manifest for webpack-sources@1.3.0 fetched in 25ms
2026-07-24T11:51:55.2182434Z 384 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular-devkit%2farchitect 334ms (from cache)
2026-07-24T11:51:55.2182677Z 385 silly pacote version manifest for source-map-loader@0.2.4 fetched in 43ms
2026-07-24T11:51:55.2182904Z 386 silly pacote version manifest for @angular-devkit/architect@0.13.10 fetched in 360ms
2026-07-24T11:51:55.2183158Z 387 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/stats-webpack-plugin 8ms (from cache)
2026-07-24T11:51:55.2183402Z 388 silly pacote version manifest for stats-webpack-plugin@0.7.0 fetched in 11ms
2026-07-24T11:51:55.2183656Z 389 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@schematics%2fangular 387ms (from cache)
2026-07-24T11:51:55.2183830Z 390 silly pacote version manifest for @schematics/angular@7.3.10 fetched in 410ms
2026-07-24T11:51:55.2184108Z 391 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular-devkit%2fcore 410ms (from cache)
2026-07-24T11:51:55.2184395Z 392 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular-devkit%2fschematics 422ms (from cache)
2026-07-24T11:51:55.2184639Z 393 silly pacote version manifest for @angular-devkit/core@7.3.10 fetched in 469ms
2026-07-24T11:51:55.2184869Z 394 silly pacote version manifest for @angular-devkit/schematics@7.3.10 fetched in 458ms
2026-07-24T11:51:55.2185126Z 395 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/copy-webpack-plugin 135ms (from cache)
2026-07-24T11:51:55.2185410Z 396 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma-source-map-support 38ms (from cache)
2026-07-24T11:51:55.2185716Z 397 silly pacote version manifest for copy-webpack-plugin@5.1.1 fetched in 157ms
2026-07-24T11:51:55.2186030Z 398 silly pacote version manifest for karma-source-map-support@1.3.0 fetched in 42ms
2026-07-24T11:51:55.2186386Z 399 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/license-webpack-plugin 144ms (from cache)
2026-07-24T11:51:55.2186757Z 400 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/circular-dependency-plugin 8ms (from cache)
2026-07-24T11:51:55.2187162Z 401 silly pacote version manifest for license-webpack-plugin@2.1.0 fetched in 149ms
2026-07-24T11:51:55.2187555Z 402 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/terser-webpack-plugin 159ms (from cache)
2026-07-24T11:51:55.2187946Z 403 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/istanbul-instrumenter-loader 18ms (from cache)
2026-07-24T11:51:55.2188319Z 404 silly pacote version manifest for circular-dependency-plugin@5.0.2 fetched in 22ms
2026-07-24T11:51:55.2188689Z 405 silly pacote version manifest for terser-webpack-plugin@1.4.3 fetched in 172ms
2026-07-24T11:51:55.2189007Z 406 silly pacote version manifest for istanbul-instrumenter-loader@3.0.1 fetched in 23ms
2026-07-24T11:51:55.2189351Z 407 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/speed-measure-webpack-plugin 19ms (from cache)
2026-07-24T11:51:55.2189611Z 408 silly pacote version manifest for speed-measure-webpack-plugin@1.3.1 fetched in 22ms
2026-07-24T11:51:55.2189970Z 409 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/mini-css-extract-plugin 77ms (from cache)
2026-07-24T11:51:55.2190440Z 410 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/webpack-subresource-integrity 20ms (from cache)
2026-07-24T11:51:55.2190866Z 411 silly pacote version manifest for mini-css-extract-plugin@0.5.0 fetched in 88ms
2026-07-24T11:51:55.2191262Z 412 silly pacote version manifest for webpack-subresource-integrity@1.1.0-rc.6 fetched in 26ms
2026-07-24T11:51:55.2191520Z 413 silly pacote range manifest for parse5@^5.0.0 fetched in 3ms
2026-07-24T11:51:55.2191925Z 414 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/webpack-dev-middleware 165ms (from cache)
2026-07-24T11:51:55.2192374Z 415 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/webpack-dev-server 240ms (from cache)
2026-07-24T11:51:55.2192774Z 416 silly pacote version manifest for webpack-dev-middleware@3.5.1 fetched in 193ms
2026-07-24T11:51:55.2193137Z 417 silly pacote version manifest for webpack-dev-server@3.1.14 fetched in 264ms
2026-07-24T11:51:55.2193546Z 418 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/file-match 35ms (from cache)
2026-07-24T11:51:55.2193816Z 419 silly pacote range manifest for moment@^2.10.2 fetched in 5ms
2026-07-24T11:51:55.2194207Z 420 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/autoprefixer 367ms (from cache)
2026-07-24T11:51:55.2194574Z 421 silly pacote range manifest for file-match@^1.0.1 fetched in 69ms
2026-07-24T11:51:55.2194978Z 422 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/utils-extend 42ms (from cache)
2026-07-24T11:51:55.2195254Z 423 silly pacote version manifest for autoprefixer@9.4.6 fetched in 399ms
2026-07-24T11:51:55.2195592Z 424 silly pacote range manifest for utils-extend@^1.0.4 fetched in 48ms
2026-07-24T11:51:55.2195883Z 425 silly pacote range manifest for bluebird@^3.5.1 fetched in 3ms
2026-07-24T11:51:55.2196278Z 426 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/babel-polyfill 15ms (from cache)
2026-07-24T11:51:55.2196653Z 427 silly pacote range manifest for babel-polyfill@^6.26.0 fetched in 17ms
2026-07-24T11:51:55.2197041Z 428 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/babel-runtime 22ms (from cache)
2026-07-24T11:51:55.2197472Z 429 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fjquery 120ms (from cache)
2026-07-24T11:51:55.2197909Z 430 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/chartjs-color 36ms (from cache)
2026-07-24T11:51:55.2198278Z 431 silly pacote range manifest for babel-runtime@^6.26.0 fetched in 32ms
2026-07-24T11:51:55.2198735Z 432 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ramda 24ms (from cache)
2026-07-24T11:51:55.2199157Z 433 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/canvg 23ms (from cache)
2026-07-24T11:51:55.2199394Z 434 silly pacote range manifest for @types/jquery@* fetched in 150ms
2026-07-24T11:51:55.2199731Z 435 silly pacote range manifest for chartjs-color@^2.1.0 fetched in 63ms
2026-07-24T11:51:55.2199960Z 436 silly pacote range manifest for ramda@^0.25.0 fetched in 51ms
2026-07-24T11:51:55.2200192Z 437 silly pacote version manifest for canvg@1.5.3 fetched in 46ms
2026-07-24T11:51:55.2200542Z 438 silly pacote version manifest for html2canvas@1.0.0-alpha.12 fetched in 4ms
2026-07-24T11:51:55.2200981Z 439 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/omggif 32ms (from cache)
2026-07-24T11:51:55.2201252Z 440 silly pacote version manifest for omggif@1.0.7 fetched in 35ms
2026-07-24T11:51:55.2201651Z 441 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/text-segmentation 6ms (from cache)
2026-07-24T11:51:55.2202069Z 442 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/xlsx 148ms (from cache)
2026-07-24T11:51:55.2202440Z 443 silly pacote range manifest for keycloak-js@^3.4.3 fetched in 13ms
2026-07-24T11:51:55.2202836Z 444 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/css-line-break 19ms (from cache)
2026-07-24T11:51:55.2203270Z 445 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/stackblur-canvas 22ms (from cache)
2026-07-24T11:51:55.2203659Z 446 silly pacote range manifest for text-segmentation@^1.0.3 fetched in 23ms
2026-07-24T11:51:55.2203902Z 447 silly pacote range manifest for xlsx@* fetched in 164ms
2026-07-24T11:51:55.2204408Z 448 silly pacote range manifest for css-line-break@^2.1.0 fetched in 26ms
2026-07-24T11:51:55.2204797Z 449 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/promise-polyfill 32ms (from cache)
2026-07-24T11:51:55.2205178Z 450 silly pacote version manifest for stackblur-canvas@2.2.0 fetched in 32ms
2026-07-24T11:51:55.2205422Z 451 silly pacote range manifest for tslib@^2.0.0 fetched in 9ms
2026-07-24T11:51:55.2205665Z 452 silly pacote version manifest for @types/xlsx@0.0.34 fetched in 3ms
2026-07-24T11:51:55.2206008Z 453 silly pacote version manifest for promise-polyfill@8.1.0 fetched in 39ms
2026-07-24T11:51:55.2206398Z 454 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cssesc 7ms (from cache)
2026-07-24T11:51:55.2206816Z 455 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fastparse 7ms (from cache)
2026-07-24T11:51:55.2207234Z 456 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/null-check 6ms (from cache)
2026-07-24T11:51:55.2207661Z 457 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ngx-window-token 17ms (from cache)
2026-07-24T11:51:55.2207935Z 458 silly pacote range manifest for cssesc@^3.0.0 fetched in 12ms
2026-07-24T11:51:55.2208167Z 459 silly pacote range manifest for fastparse@^1.1.2 fetched in 12ms
2026-07-24T11:51:55.2208558Z 460 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/through 10ms (from cache)
2026-07-24T11:51:55.2209047Z 461 silly pacote range manifest for null-check@^1.0.0 fetched in 15ms
2026-07-24T11:51:55.2209387Z 462 silly pacote version manifest for ngx-window-token@0.0.4 fetched in 30ms
2026-07-24T11:51:55.2209624Z 463 silly pacote range manifest for through@X.X.X fetched in 22ms
2026-07-24T11:51:55.2209993Z 464 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/isexe 14ms (from cache)
2026-07-24T11:51:55.2210408Z 465 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fileset 7ms (from cache)
2026-07-24T11:51:55.2210667Z 466 silly pacote range manifest for isexe@^2.0.0 fetched in 18ms
2026-07-24T11:51:55.2210897Z 467 silly pacote range manifest for fileset@^2.0.3 fetched in 10ms
2026-07-24T11:51:55.2211291Z 468 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/compare-versions 13ms (from cache)
2026-07-24T11:51:55.2211736Z 469 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/istanbul-lib-coverage 12ms (from cache)
2026-07-24T11:51:55.2212128Z 470 silly pacote range manifest for compare-versions@^3.4.0 fetched in 18ms
2026-07-24T11:51:55.2212477Z 471 silly pacote range manifest for istanbul-lib-coverage@^2.0.5 fetched in 16ms
2026-07-24T11:51:55.2212886Z 472 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/istanbul-lib-hook 10ms (from cache)
2026-07-24T11:51:55.2213268Z 473 silly pacote range manifest for istanbul-lib-hook@^2.0.7 fetched in 12ms
2026-07-24T11:51:55.2213659Z 474 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/async 32ms (from cache)
2026-07-24T11:51:55.2214129Z 475 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fchart.js 66ms (from cache)
2026-07-24T11:51:55.2214577Z 476 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/istanbul-lib-report 22ms (from cache)
2026-07-24T11:51:55.2214861Z 477 silly pacote range manifest for async@^2.6.2 fetched in 50ms
2026-07-24T11:51:55.2215089Z 478 silly pacote range manifest for @types/chart.js@^2.7.48 fetched in 78ms
2026-07-24T11:51:55.2215444Z 479 silly pacote range manifest for istanbul-lib-report@^2.0.8 fetched in 26ms
2026-07-24T11:51:55.2215871Z 480 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/istanbul-lib-source-maps 26ms (from cache)
2026-07-24T11:51:55.2216250Z 481 silly pacote range manifest for js-yaml@^3.13.1 fetched in 4ms
2026-07-24T11:51:55.2216612Z 482 silly pacote range manifest for istanbul-lib-source-maps@^3.0.6 fetched in 30ms
2026-07-24T11:51:55.2216857Z 483 silly pacote range manifest for @types/node@* fetched in 4ms
2026-07-24T11:51:55.2217260Z 484 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/istanbul-lib-instrument 40ms (from cache)
2026-07-24T11:51:55.2217680Z 485 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/once 10ms (from cache)
2026-07-24T11:51:55.2217951Z 486 silly pacote range manifest for log4js@^6.4.1 fetched in 2ms
2026-07-24T11:51:55.2218295Z 487 silly pacote range manifest for istanbul-lib-instrument@^3.3.0 fetched in 44ms
2026-07-24T11:51:55.2218772Z 488 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/make-dir 14ms (from cache)
2026-07-24T11:51:55.2219048Z 489 silly pacote range manifest for once@^1.4.0 fetched in 14ms
2026-07-24T11:51:55.2219378Z 490 silly pacote range manifest for make-dir@^2.1.0 fetched in 17ms
2026-07-24T11:51:55.2219775Z 491 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/istanbul-reports 37ms (from cache)
2026-07-24T11:51:55.2220210Z 492 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fminimatch 14ms (from cache)
2026-07-24T11:51:55.2220710Z 493 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-regexp 9ms (from cache)
2026-07-24T11:51:55.2221085Z 494 silly pacote range manifest for istanbul-reports@^2.2.5 fetched in 43ms
2026-07-24T11:51:55.2221329Z 495 silly pacote range manifest for @types/minimatch@* fetched in 17ms
2026-07-24T11:51:55.2221631Z 496 warn deprecated @types/minimatch@6.0.0: This is a stub types definition. minimatch provides its own type definitions, so you do not need this installed.
2026-07-24T11:51:55.2222175Z 497 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/xmlcreate 11ms (from cache)
2026-07-24T11:51:55.2222542Z 498 silly pacote range manifest for is-regexp@^2.0.0 fetched in 13ms
2026-07-24T11:51:55.2222771Z 499 silly pacote range manifest for async@^3.2.3 fetched in 3ms
2026-07-24T11:51:55.2222994Z 500 silly pacote range manifest for xmlcreate@^2.0.4 fetched in 14ms
2026-07-24T11:51:55.2223376Z 501 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/one-time 5ms (from cache)
2026-07-24T11:51:55.2223819Z 502 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/https-proxy-agent 12ms (from cache)
2026-07-24T11:51:55.2224241Z 503 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-stream 8ms (from cache)
2026-07-24T11:51:55.2224606Z 504 silly pacote range manifest for one-time@^1.0.0 fetched in 9ms
2026-07-24T11:51:55.2224957Z 505 silly pacote range manifest for https-proxy-agent@^2.2.1 fetched in 16ms
2026-07-24T11:51:55.2225353Z 506 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/stack-trace 9ms (from cache)
2026-07-24T11:51:55.2225715Z 507 silly pacote range manifest for is-stream@^2.0.0 fetched in 12ms
2026-07-24T11:51:55.2226097Z 508 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/logform 15ms (from cache)
2026-07-24T11:51:55.2226460Z 509 silly pacote range manifest for stack-trace@0.0.x fetched in 14ms
2026-07-24T11:51:55.2226698Z 510 silly pacote range manifest for logform@^2.7.0 fetched in 19ms
2026-07-24T11:51:55.2227126Z 511 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/triple-beam 9ms (from cache)
2026-07-24T11:51:55.2227564Z 512 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@colors%2fcolors 10ms (from cache)
2026-07-24T11:51:55.2227941Z 513 silly pacote range manifest for triple-beam@^1.3.0 fetched in 12ms
2026-07-24T11:51:55.2228177Z 514 silly pacote range manifest for @colors/colors@^1.6.0 fetched in 13ms
2026-07-24T11:51:55.2228639Z 515 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@dabh%2fdiagnostics 8ms (from cache)
2026-07-24T11:51:55.2228933Z 516 silly pacote range manifest for @dabh/diagnostics@^2.0.8 fetched in 11ms
2026-07-24T11:51:55.2229339Z 517 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/winston-transport 10ms (from cache)
2026-07-24T11:51:55.2229760Z 518 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/has-ansi 7ms (from cache)
2026-07-24T11:51:55.2230198Z 519 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/safe-stable-stringify 9ms (from cache)
2026-07-24T11:51:55.2230635Z 520 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/brace-expansion 42ms (from cache)
2026-07-24T11:51:55.2231018Z 521 silly pacote range manifest for winston-transport@^4.9.0 fetched in 18ms
2026-07-24T11:51:55.2231341Z 522 silly pacote range manifest for has-ansi@^2.0.0 fetched in 15ms
2026-07-24T11:51:55.2231694Z 523 silly pacote range manifest for safe-stable-stringify@^2.3.1 fetched in 17ms
2026-07-24T11:51:55.2232045Z 524 silly pacote range manifest for brace-expansion@^1.1.7 fetched in 48ms
2026-07-24T11:51:55.2232441Z 525 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/strip-ansi 15ms (from cache)
2026-07-24T11:51:55.2232711Z 526 silly pacote range manifest for once@^1.3.0 fetched in 4ms
2026-07-24T11:51:55.2233038Z 527 silly pacote range manifest for strip-ansi@^3.0.0 fetched in 18ms
2026-07-24T11:51:55.2233420Z 528 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/readable-stream 34ms (from cache)
2026-07-24T11:51:55.2233873Z 529 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/escape-string-regexp 11ms (from cache)
2026-07-24T11:51:55.2234311Z 530 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ansi-styles 15ms (from cache)
2026-07-24T11:51:55.2234688Z 531 silly pacote range manifest for readable-stream@^3.4.0 fetched in 40ms
2026-07-24T11:51:55.2235123Z 532 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/inflight 11ms (from cache)
2026-07-24T11:51:55.2235500Z 533 silly pacote range manifest for escape-string-regexp@^1.0.2 fetched in 16ms
2026-07-24T11:51:55.2235895Z 534 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/inherits 11ms (from cache)
2026-07-24T11:51:55.2236261Z 535 silly pacote range manifest for ansi-styles@^2.2.1 fetched in 20ms
2026-07-24T11:51:55.2236493Z 536 silly pacote range manifest for minimatch@^3.1.1 fetched in 4ms
2026-07-24T11:51:55.2236729Z 537 silly pacote range manifest for inflight@^1.0.4 fetched in 15ms
2026-07-24T11:51:55.2237315Z 538 warn deprecated inflight@1.0.6: This module is not supported, and leaks memory. Do not use it. Check out lru-cache if you want a good and tested way to coalesce async requests by a key value, which is much more comprehensive and powerful.
2026-07-24T11:51:55.2237670Z 539 silly pacote range manifest for inherits@2 fetched in 15ms
2026-07-24T11:51:55.2238061Z 540 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/supports-color 23ms (from cache)
2026-07-24T11:51:55.2238338Z 541 silly pacote range manifest for glob@^7.0.6 fetched in 5ms
2026-07-24T11:51:55.2238740Z 542 silly pacote range manifest for jasmine-core@~2.8.0 fetched in 5ms
2026-07-24T11:51:55.2239090Z 543 silly pacote range manifest for selenium-webdriver@^3.0.1 fetched in 5ms
2026-07-24T11:51:55.2239438Z 544 silly pacote range manifest for supports-color@^2.0.0 fetched in 27ms
2026-07-24T11:51:55.2239828Z 545 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fs.realpath 9ms (from cache)
2026-07-24T11:51:55.2240252Z 546 silly pacote range manifest for source-map@^0.5.6 fetched in 3ms
2026-07-24T11:51:55.2240631Z 547 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/exit 10ms (from cache)
2026-07-24T11:51:55.2240892Z 548 silly pacote range manifest for minimist@^1.2.6 fetched in 4ms
2026-07-24T11:51:55.2241223Z 549 silly pacote range manifest for buffer-from@^1.0.0 fetched in 3ms
2026-07-24T11:51:55.2241555Z 550 silly pacote range manifest for source-map@^0.6.0 fetched in 3ms
2026-07-24T11:51:55.2241791Z 551 silly pacote range manifest for fs.realpath@^1.0.0 fetched in 13ms
2026-07-24T11:51:55.2242027Z 552 silly pacote range manifest for exit@^0.1.2 fetched in 14ms
2026-07-24T11:51:55.2242426Z 553 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@ngtools%2fwebpack 585ms (from cache)
2026-07-24T11:51:55.2242701Z 554 silly pacote range manifest for chalk@^1.1.1 fetched in 26ms
2026-07-24T11:51:55.2242930Z 555 silly pacote range manifest for ini@^1.3.4 fetched in 27ms
2026-07-24T11:51:55.2243158Z 556 silly pacote range manifest for q@^1.4.1 fetched in 27ms
2026-07-24T11:51:55.2243586Z 557 warn deprecated q@1.5.1: You or someone you depend on is using Q, the JavaScript Promise library that gave JavaScript developers strong feelings about promises. They can almost certainly migrate to the native JavaScript promise now. Thank you literally everyone for joining me in this bet against the odds. Be excellent to each other.
2026-07-24T11:51:55.2243973Z 557 warn deprecated
2026-07-24T11:51:55.2244311Z 557 warn deprecated (For a CapTP with native promises, see @endo/eventual-send and @endo/captp)
2026-07-24T11:51:55.2244573Z 558 silly pacote version manifest for @ngtools/webpack@7.3.10 fetched in 608ms
2026-07-24T11:51:55.2244812Z 559 silly pacote range manifest for rimraf@^2.5.2 fetched in 6ms
2026-07-24T11:51:55.2245136Z 560 silly pacote range manifest for ansi-styles@^3.2.1 fetched in 6ms
2026-07-24T11:51:55.2245477Z 561 silly pacote range manifest for supports-color@^5.3.0 fetched in 5ms
2026-07-24T11:51:55.2245826Z 562 silly pacote range manifest for escape-string-regexp@^1.0.5 fetched in 5ms
2026-07-24T11:51:55.2246203Z 563 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/del 41ms (from cache)
2026-07-24T11:51:55.2246465Z 564 silly pacote version manifest for tmp@0.0.30 fetched in 5ms
2026-07-24T11:51:55.2246693Z 565 silly pacote range manifest for del@^2.2.0 fetched in 47ms
2026-07-24T11:51:55.2247119Z 566 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/esutils 12ms (from cache)
2026-07-24T11:51:55.2247384Z 567 silly pacote range manifest for rimraf@^2.5.4 fetched in 3ms
2026-07-24T11:51:55.2247764Z 568 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/js-tokens 14ms (from cache)
2026-07-24T11:51:55.2248033Z 569 silly pacote range manifest for esutils@^2.0.2 fetched in 18ms
2026-07-24T11:51:55.2248455Z 570 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@angular-devkit%2fbuild-optimizer 410ms (from cache)
2026-07-24T11:51:55.2248931Z 571 silly pacote range manifest for js-tokens@^3.0.2 fetched in 37ms
2026-07-24T11:51:55.2249296Z 572 silly pacote version manifest for @angular-devkit/build-optimizer@0.13.10 fetched in 429ms
2026-07-24T11:51:55.2249584Z 573 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/os-tmpdir 25ms (from cache)
2026-07-24T11:51:55.2249841Z 574 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/xml2js 54ms (from cache)
2026-07-24T11:51:55.2250096Z 575 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/jszip 42ms (from cache)
2026-07-24T11:51:55.2250375Z 576 silly pacote range manifest for os-tmpdir@~1.0.2 fetched in 37ms
2026-07-24T11:51:55.2250519Z 577 silly pacote range manifest for xml2js@^0.4.17 fetched in 63ms
2026-07-24T11:51:55.2250753Z 578 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/adm-zip 94ms (from cache)
2026-07-24T11:51:55.2250918Z 579 silly pacote range manifest for jszip@^3.1.3 fetched in 50ms
2026-07-24T11:51:55.2251183Z 580 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/es-errors 18ms (from cache)
2026-07-24T11:51:55.2251443Z 581 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/argparse 21ms (from cache)
2026-07-24T11:51:55.2251666Z 582 silly pacote range manifest for adm-zip@^0.5.2 fetched in 100ms
2026-07-24T11:51:55.2251900Z 583 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/esprima 46ms (from cache)
2026-07-24T11:51:55.2252148Z 584 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/webpack 843ms (from cache)
2026-07-24T11:51:55.2252372Z 585 silly pacote range manifest for es-errors@^1.3.0 fetched in 68ms
2026-07-24T11:51:55.2252609Z 586 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/path-parse 56ms (from cache)
2026-07-24T11:51:55.2252773Z 587 silly pacote range manifest for tslib@^1.8.1 fetched in 49ms
2026-07-24T11:51:55.2252913Z 588 silly pacote range manifest for argparse@^1.0.7 fetched in 71ms
2026-07-24T11:51:55.2253171Z 589 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/supports-preserve-symlinks-flag 54ms (from cache)
2026-07-24T11:51:55.2253344Z 590 silly pacote range manifest for esprima@^4.0.0 fetched in 96ms
2026-07-24T11:51:55.2253480Z 591 silly pacote version manifest for webpack@4.29.0 fetched in 884ms
2026-07-24T11:51:55.2253683Z 592 silly pacote range manifest for path-parse@^1.0.7 fetched in 62ms
2026-07-24T11:51:55.2253912Z 593 silly pacote range manifest for supports-preserve-symlinks-flag@^1.0.0 fetched in 60ms
2026-07-24T11:51:55.2254164Z 594 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-core-module 65ms (from cache)
2026-07-24T11:51:55.2254421Z 595 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/isobject 13ms (from cache)
2026-07-24T11:51:55.2254674Z 596 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/to-regex 12ms (from cache)
2026-07-24T11:51:55.2254930Z 597 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/arr-flatten 11ms (from cache)
2026-07-24T11:51:55.2255161Z 598 silly pacote range manifest for is-core-module@^2.16.1 fetched in 70ms
2026-07-24T11:51:55.2255403Z 599 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/array-unique 9ms (from cache)
2026-07-24T11:51:55.2255625Z 600 silly pacote range manifest for to-regex@^3.0.1 fetched in 16ms
2026-07-24T11:51:55.2255767Z 601 silly pacote range manifest for isobject@^3.0.1 fetched in 18ms
2026-07-24T11:51:55.2255998Z 602 silly pacote range manifest for arr-flatten@^1.1.0 fetched in 16ms
2026-07-24T11:51:55.2256203Z 603 silly pacote range manifest for array-unique@^0.3.2 fetched in 14ms
2026-07-24T11:51:55.2256440Z 604 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fill-range 21ms (from cache)
2026-07-24T11:51:55.2256693Z 605 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/split-string 16ms (from cache)
2026-07-24T11:51:55.2256973Z 606 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/@angular-devkit%2fbuild-webpack 530ms (from cache)
2026-07-24T11:51:55.2257242Z 607 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/snapdragon 49ms (from cache)
2026-07-24T11:51:55.2257464Z 608 silly pacote range manifest for fill-range@^4.0.0 fetched in 54ms
2026-07-24T11:51:55.2257669Z 609 silly pacote range manifest for split-string@^3.0.2 fetched in 47ms
2026-07-24T11:51:55.2257896Z 610 silly pacote version manifest for @angular-devkit/build-webpack@0.13.10 fetched in 557ms
2026-07-24T11:51:55.2258152Z 611 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/extend-shallow 43ms (from cache)
2026-07-24T11:51:55.2258415Z 612 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/repeat-element 41ms (from cache)
2026-07-24T11:51:55.2258620Z 613 silly pacote range manifest for snapdragon@^0.8.1 fetched in 57ms
2026-07-24T11:51:55.2258876Z 614 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/request 184ms (from cache)
2026-07-24T11:51:55.2259106Z 615 silly pacote range manifest for extend-shallow@^2.0.1 fetched in 55ms
2026-07-24T11:51:55.2259385Z 616 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/snapdragon-node 52ms (from cache)
2026-07-24T11:51:55.2259620Z 617 silly pacote range manifest for repeat-element@^1.1.2 fetched in 54ms
2026-07-24T11:51:55.2259769Z 618 silly pacote range manifest for request@^2.87.0 fetched in 196ms
2026-07-24T11:51:55.2259934Z 619 warn deprecated request@2.88.2: request has been deprecated, see https://github.com/request/request/issues/3142
2026-07-24T11:51:55.2260159Z 620 silly pacote range manifest for snapdragon-node@^2.0.1 fetched in 58ms
2026-07-24T11:51:55.2260394Z 621 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/y18n 56ms (from cache)
2026-07-24T11:51:55.2260647Z 622 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cliui 58ms (from cache)
2026-07-24T11:51:55.2260902Z 623 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/set-blocking 20ms (from cache)
2026-07-24T11:51:55.2261157Z 624 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/find-up 26ms (from cache)
2026-07-24T11:51:55.2261420Z 625 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/os-locale 27ms (from cache)
2026-07-24T11:51:55.2261584Z 626 silly pacote range manifest for y18n@^3.2.1 || ^4.0.0 fetched in 66ms
2026-07-24T11:51:55.2261817Z 627 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/decamelize 26ms (from cache)
2026-07-24T11:51:55.2262076Z 628 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/which-module 14ms (from cache)
2026-07-24T11:51:55.2262239Z 629 silly pacote range manifest for cliui@^4.0.0 fetched in 67ms
2026-07-24T11:51:55.2262439Z 630 silly pacote range manifest for set-blocking@^2.0.0 fetched in 29ms
2026-07-24T11:51:55.2262643Z 631 silly pacote range manifest for os-locale@^3.0.0 fetched in 33ms
2026-07-24T11:51:55.2262844Z 632 silly pacote range manifest for find-up@^3.0.0 fetched in 35ms
2026-07-24T11:51:55.2262985Z 633 silly pacote range manifest for decamelize@^1.2.0 fetched in 32ms
2026-07-24T11:51:55.2263185Z 634 silly pacote range manifest for which-module@^2.0.0 fetched in 20ms
2026-07-24T11:51:55.2263425Z 635 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/string-width 21ms (from cache)
2026-07-24T11:51:55.2263592Z 636 silly pacote range manifest for minimist@~0.0.1 fetched in 6ms
2026-07-24T11:51:55.2263729Z 637 silly pacote range manifest for glob@^7.1.3 fetched in 6ms
2026-07-24T11:51:55.2263999Z 638 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/get-caller-file 19ms (from cache)
2026-07-24T11:51:55.2264164Z 639 silly pacote range manifest for tmp@0.0.x fetched in 7ms
2026-07-24T11:51:55.2264409Z 640 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/require-main-filename 12ms (from cache)
2026-07-24T11:51:55.2264636Z 641 silly pacote range manifest for string-width@^2.0.0 fetched in 30ms
2026-07-24T11:51:55.2264879Z 642 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/require-directory 15ms (from cache)
2026-07-24T11:51:55.2265140Z 643 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/wordwrap 13ms (from cache)
2026-07-24T11:51:55.2265370Z 644 silly pacote range manifest for get-caller-file@^1.0.1 fetched in 26ms
2026-07-24T11:51:55.2265589Z 645 silly pacote range manifest for require-main-filename@^1.0.1 fetched in 17ms
2026-07-24T11:51:55.2265804Z 646 silly pacote range manifest for require-directory@^2.1.1 fetched in 20ms
2026-07-24T11:51:55.2265953Z 647 silly pacote range manifest for wordwrap@~0.0.2 fetched in 17ms
2026-07-24T11:51:55.2266086Z 648 silly pacote range manifest for inherits@^2.0.3 fetched in 4ms
2026-07-24T11:51:55.2266318Z 649 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-glob 13ms (from cache)
2026-07-24T11:51:55.2266571Z 650 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/anymatch 12ms (from cache)
2026-07-24T11:51:55.2266790Z 651 silly pacote range manifest for is-glob@^4.0.0 fetched in 19ms
2026-07-24T11:51:55.2266932Z 652 silly pacote range manifest for anymatch@^2.0.0 fetched in 17ms
2026-07-24T11:51:55.2267191Z 653 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-binary-path 9ms (from cache)
2026-07-24T11:51:55.2267449Z 654 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/async-each 14ms (from cache)
2026-07-24T11:51:55.2267702Z 655 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/glob-parent 17ms (from cache)
2026-07-24T11:51:55.2267934Z 656 silly pacote range manifest for is-binary-path@^1.0.0 fetched in 18ms
2026-07-24T11:51:55.2268142Z 657 silly pacote range manifest for async-each@^1.0.1 fetched in 20ms
2026-07-24T11:51:55.2268380Z 658 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/yargs-parser 53ms (from cache)
2026-07-24T11:51:55.2268651Z 659 silly pacote range manifest for glob-parent@^3.1.0 fetched in 24ms
2026-07-24T11:51:55.2268901Z 660 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/readdirp 28ms (from cache)
2026-07-24T11:51:55.2269134Z 661 silly pacote range manifest for yargs-parser@^11.1.1 fetched in 62ms
2026-07-24T11:51:55.2269378Z 662 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/normalize-path 21ms (from cache)
2026-07-24T11:51:55.2269540Z 663 silly pacote range manifest for readdirp@^2.2.1 fetched in 36ms
2026-07-24T11:51:55.2269776Z 664 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/rfdc 26ms (from cache)
2026-07-24T11:51:55.2270005Z 665 silly pacote range manifest for normalize-path@^3.0.0 fetched in 28ms
2026-07-24T11:51:55.2270242Z 666 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fsevents 41ms (from cache)
2026-07-24T11:51:55.2270402Z 667 silly pacote range manifest for rfdc@^1.1.4 fetched in 33ms
2026-07-24T11:51:55.2270542Z 668 silly pacote range manifest for fsevents@^1.2.7 fetched in 47ms
2026-07-24T11:51:55.2270691Z 669 warn deprecated fsevents@1.2.13: Upgrade to fsevents v2 to mitigate potential security issues
2026-07-24T11:51:55.2270943Z 670 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/date-format 21ms (from cache)
2026-07-24T11:51:55.2271205Z 671 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/requires-port 12ms (from cache)
2026-07-24T11:51:55.2271431Z 672 silly pacote range manifest for date-format@^2.0.0 fetched in 25ms
2026-07-24T11:51:55.2271664Z 673 warn deprecated date-format@2.1.0: 2.x is no longer supported. Please upgrade to 4.x or higher.
2026-07-24T11:51:55.2271915Z 674 silly pacote range manifest for requires-port@^1.0.0 fetched in 14ms
2026-07-24T11:51:55.2272155Z 675 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/upath 60ms (from cache)
2026-07-24T11:51:55.2272413Z 676 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/eventemitter3 21ms (from cache)
2026-07-24T11:51:55.2272570Z 677 silly pacote range manifest for upath@^1.1.1 fetched in 65ms
2026-07-24T11:51:55.2272806Z 678 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/streamroller 29ms (from cache)
2026-07-24T11:51:55.2272972Z 679 silly pacote range manifest for eventemitter3@^4.0.0 fetched in 25ms
2026-07-24T11:51:55.2273209Z 680 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/utils-merge 8ms (from cache)
2026-07-24T11:51:55.2273465Z 681 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/parseurl 9ms (from cache)
2026-07-24T11:51:55.2273723Z 682 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/finalhandler 16ms (from cache)
2026-07-24T11:51:55.2273979Z 683 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/debug 37ms (from cache)
2026-07-24T11:51:55.2274133Z 684 silly pacote range manifest for streamroller@^1.0.6 fetched in 41ms
2026-07-24T11:51:55.2274292Z 685 warn deprecated streamroller@1.0.6: 1.x is no longer supported. Please upgrade to 3.x or higher.
2026-07-24T11:51:55.2274514Z 686 silly pacote version manifest for utils-merge@1.0.1 fetched in 18ms
2026-07-24T11:51:55.2274748Z 687 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/debug 10ms (from cache)
2026-07-24T11:51:55.2274937Z 688 silly pacote range manifest for parseurl@~1.3.3 fetched in 23ms
2026-07-24T11:51:55.2275175Z 689 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/lru-cache 87ms (from cache)
2026-07-24T11:51:55.2275339Z 690 silly pacote version manifest for finalhandler@1.1.2 fetched in 39ms
2026-07-24T11:51:55.2275475Z 691 silly pacote range manifest for debug@^4.1.1 fetched in 61ms
2026-07-24T11:51:55.2275715Z 692 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/buffer-alloc 29ms (from cache)
2026-07-24T11:51:55.2275880Z 693 silly pacote range manifest for debug@~3.1.0 fetched in 28ms
2026-07-24T11:51:55.2276081Z 694 silly pacote range manifest for lru-cache@4.1.x fetched in 101ms
2026-07-24T11:51:55.2276324Z 695 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/follow-redirects 47ms (from cache)
2026-07-24T11:51:55.2276555Z 696 silly pacote range manifest for buffer-alloc@^1.2.0 fetched in 38ms
2026-07-24T11:51:55.2276789Z 697 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/debug 53ms (from cache)
2026-07-24T11:51:55.2277040Z 698 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/has-binary2 32ms (from cache)
2026-07-24T11:51:55.2277270Z 699 silly pacote range manifest for follow-redirects@^1.0.0 fetched in 60ms
2026-07-24T11:51:55.2277512Z 700 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/custom-event 16ms (from cache)
2026-07-24T11:51:55.2277741Z 701 silly pacote range manifest for has-binary2@~1.0.2 fetched in 36ms
2026-07-24T11:51:55.2277884Z 702 silly pacote version manifest for debug@2.6.9 fetched in 60ms
2026-07-24T11:51:55.2278111Z 703 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ent 19ms (from cache)
2026-07-24T11:51:55.2278332Z 704 silly pacote range manifest for custom-event@~1.0.0 fetched in 21ms
2026-07-24T11:51:55.2278469Z 705 silly pacote range manifest for y18n@^4.0.0 fetched in 7ms
2026-07-24T11:51:55.2278767Z 706 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/socket.io-adapter 26ms (from cache)
2026-07-24T11:51:55.2279035Z 707 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/extend 22ms (from cache)
2026-07-24T11:51:55.2279195Z 708 silly pacote range manifest for ent@~2.2.0 fetched in 32ms
2026-07-24T11:51:55.2279430Z 709 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/void-elements 18ms (from cache)
2026-07-24T11:51:55.2279688Z 710 silly pacote range manifest for os-locale@^3.1.0 fetched in 14ms
2026-07-24T11:51:55.2279904Z 711 silly pacote range manifest for socket.io-adapter@~1.1.0 fetched in 41ms
2026-07-24T11:51:55.2280109Z 712 silly pacote range manifest for string-width@^3.0.0 fetched in 11ms
2026-07-24T11:51:55.2280303Z 713 silly pacote range manifest for extend@^3.0.0 fetched in 36ms
2026-07-24T11:51:55.2280556Z 714 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-wsl 30ms (from cache)
2026-07-24T11:51:55.2280784Z 715 silly pacote range manifest for yargs-parser@^13.0.0 fetched in 13ms
2026-07-24T11:51:55.2280995Z 716 silly pacote range manifest for void-elements@^2.0.0 fetched in 34ms
2026-07-24T11:51:55.2281204Z 717 silly pacote range manifest for get-caller-file@^2.0.1 fetched in 17ms
2026-07-24T11:51:55.2281420Z 718 silly pacote range manifest for require-main-filename@^2.0.0 fetched in 21ms
2026-07-24T11:51:55.2281562Z 719 silly pacote range manifest for semver@^5.5.0 fetched in 22ms
2026-07-24T11:51:55.2281764Z 720 silly pacote range manifest for is-wsl@^1.1.0 fetched in 51ms
2026-07-24T11:51:55.2281997Z 721 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/unpipe 17ms (from cache)
2026-07-24T11:51:55.2282271Z 722 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/validate-npm-package-name 37ms (from cache)
2026-07-24T11:51:55.2282534Z 723 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/depd 26ms (from cache)
2026-07-24T11:51:55.2282790Z 724 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/bytes 23ms (from cache)
2026-07-24T11:51:55.2282981Z 725 silly pacote range manifest for unpipe@~1.0.0 fetched in 24ms
2026-07-24T11:51:55.2283191Z 726 silly pacote range manifest for validate-npm-package-name@^3.0.0 fetched in 44ms
2026-07-24T11:51:55.2283341Z 727 silly pacote version manifest for depd@2.0.0 fetched in 32ms
2026-07-24T11:51:55.2283480Z 728 silly pacote range manifest for bytes@~3.1.2 fetched in 28ms
2026-07-24T11:51:55.2283710Z 729 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/destroy 7ms (from cache)
2026-07-24T11:51:55.2283965Z 730 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/engine.io 122ms (from cache)
2026-07-24T11:51:55.2284234Z 731 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/socket.io-parser 113ms (from cache)
2026-07-24T11:51:55.2284501Z 732 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/hosted-git-info 63ms (from cache)
2026-07-24T11:51:55.2284755Z 733 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/osenv 77ms (from cache)
2026-07-24T11:51:55.2284913Z 734 silly pacote range manifest for destroy@~1.2.0 fetched in 25ms
2026-07-24T11:51:55.2285157Z 735 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/socket.io-client 125ms (from cache)
2026-07-24T11:51:55.2285324Z 736 silly pacote range manifest for engine.io@~3.2.0 fetched in 149ms
2026-07-24T11:51:55.2285532Z 737 silly pacote range manifest for socket.io-parser@~3.2.0 fetched in 134ms
2026-07-24T11:51:55.2285745Z 738 silly pacote range manifest for hosted-git-info@^2.6.0 fetched in 81ms
2026-07-24T11:51:55.2285889Z 739 silly pacote range manifest for osenv@^0.1.5 fetched in 91ms
2026-07-24T11:51:55.2286027Z 740 warn deprecated osenv@0.1.5: This package is no longer supported.
2026-07-24T11:51:55.2286243Z 741 silly pacote version manifest for socket.io-client@2.1.1 fetched in 139ms
2026-07-24T11:51:55.2286483Z 742 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/type-is 38ms (from cache)
2026-07-24T11:51:55.2286643Z 743 silly pacote range manifest for glob@^7.0.0 fetched in 6ms
2026-07-24T11:51:55.2286879Z 744 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/raw-body 44ms (from cache)
2026-07-24T11:51:55.2287102Z 745 silly pacote range manifest for type-is@~1.6.18 fetched in 48ms
2026-07-24T11:51:55.2287245Z 746 silly pacote range manifest for rxjs@^6.1.0 fetched in 8ms
2026-07-24T11:51:55.2287471Z 747 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/on-finished 17ms (from cache)
2026-07-24T11:51:55.2287711Z 748 silly pacote range manifest for raw-body@~2.5.3 fetched in 51ms
2026-07-24T11:51:55.2287948Z 749 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/content-type 16ms (from cache)
2026-07-24T11:51:55.2288106Z 750 silly pacote range manifest for chalk@^2.0.0 fetched in 5ms
2026-07-24T11:51:55.2288246Z 751 silly pacote range manifest for lodash@^4.17.10 fetched in 5ms
2026-07-24T11:51:55.2288479Z 752 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/rechoir 18ms (from cache)
2026-07-24T11:51:55.2288760Z 753 silly pacote range manifest for on-finished@~2.4.1 fetched in 22ms
2026-07-24T11:51:55.2288966Z 754 silly pacote range manifest for content-type@~1.0.5 fetched in 21ms
2026-07-24T11:51:55.2289204Z 755 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/http-errors 24ms (from cache)
2026-07-24T11:51:55.2289365Z 756 silly pacote range manifest for through@^2.3.6 fetched in 6ms
2026-07-24T11:51:55.2289594Z 757 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/qs 99ms (from cache)
2026-07-24T11:51:55.2289755Z 758 silly pacote range manifest for rechoir@^0.6.2 fetched in 31ms
2026-07-24T11:51:55.2289958Z 759 silly pacote range manifest for http-errors@~2.0.1 fetched in 36ms
2026-07-24T11:51:55.2290160Z 760 silly pacote range manifest for strip-ansi@^5.0.0 fetched in 3ms
2026-07-24T11:51:55.2290294Z 761 silly pacote range manifest for qs@~6.15.1 fetched in 110ms
2026-07-24T11:51:55.2290527Z 762 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/interpret 33ms (from cache)
2026-07-24T11:51:55.2290810Z 763 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cli-width 19ms (from cache)
2026-07-24T11:51:55.2291038Z 764 silly pacote range manifest for string-width@^2.1.0 fetched in 4ms
2026-07-24T11:51:55.2291276Z 765 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cli-cursor 18ms (from cache)
2026-07-24T11:51:55.2291533Z 766 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/run-async 20ms (from cache)
2026-07-24T11:51:55.2291788Z 767 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/figures 25ms (from cache)
2026-07-24T11:51:55.2291945Z 768 silly pacote range manifest for interpret@^1.0.0 fetched in 41ms
2026-07-24T11:51:55.2292181Z 769 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/mute-stream 15ms (from cache)
2026-07-24T11:51:55.2292403Z 770 silly pacote range manifest for cli-width@^2.0.0 fetched in 28ms
2026-07-24T11:51:55.2292606Z 771 silly pacote range manifest for cli-cursor@^2.1.0 fetched in 27ms
2026-07-24T11:51:55.2292809Z 772 silly pacote range manifest for run-async@^2.2.0 fetched in 27ms
2026-07-24T11:51:55.2292948Z 773 silly pacote range manifest for figures@^2.0.0 fetched in 33ms
2026-07-24T11:51:55.2293150Z 774 silly pacote version manifest for mute-stream@0.0.7 fetched in 19ms
2026-07-24T11:51:55.2293287Z 775 silly pacote range manifest for which@^1.3.1 fetched in 4ms
2026-07-24T11:51:55.2293424Z 776 silly pacote range manifest for rimraf@^2.6.2 fetched in 3ms
2026-07-24T11:51:55.2293564Z 777 silly pacote range manifest for semver@^5.6.0 fetched in 3ms
2026-07-24T11:51:55.2293803Z 778 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/external-editor 18ms (from cache)
2026-07-24T11:51:55.2294068Z 779 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ansi-escapes 20ms (from cache)
2026-07-24T11:51:55.2294229Z 780 silly pacote range manifest for bluebird@^3.5.3 fetched in 6ms
2026-07-24T11:51:55.2294430Z 781 silly pacote range manifest for lru-cache@^5.1.1 fetched in 6ms
2026-07-24T11:51:55.2294662Z 782 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/iconv-lite 91ms (from cache)
2026-07-24T11:51:55.2294895Z 783 silly pacote range manifest for external-editor@^3.0.0 fetched in 25ms
2026-07-24T11:51:55.2295102Z 784 silly pacote range manifest for ansi-escapes@^3.0.0 fetched in 28ms
2026-07-24T11:51:55.2295307Z 785 silly pacote range manifest for iconv-lite@~0.4.24 fetched in 96ms
2026-07-24T11:51:55.2295545Z 786 silly pacote range manifest for safe-buffer@^5.1.2 fetched in 3ms
2026-07-24T11:51:55.2295782Z 787 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/protoduck 13ms (from cache)
2026-07-24T11:51:55.2295945Z 788 silly pacote range manifest for protoduck@^5.0.1 fetched in 16ms
2026-07-24T11:51:55.2296173Z 789 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/mississippi 10ms (from cache)
2026-07-24T11:51:55.2296426Z 790 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ssri 26ms (from cache)
2026-07-24T11:51:55.2296685Z 791 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/get-stream 17ms (from cache)
2026-07-24T11:51:55.2296917Z 792 silly pacote range manifest for npm-package-arg@^6.1.0 fetched in 6ms
2026-07-24T11:51:55.2297065Z 793 silly pacote range manifest for mississippi@^3.0.0 fetched in 17ms
2026-07-24T11:51:55.2297203Z 794 silly pacote range manifest for ssri@^6.0.1 fetched in 33ms
2026-07-24T11:51:55.2297407Z 795 silly pacote range manifest for get-stream@^4.1.0 fetched in 23ms
2026-07-24T11:51:55.2297639Z 796 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/promise-retry 15ms (from cache)
2026-07-24T11:51:55.2297870Z 797 silly pacote range manifest for promise-retry@^1.1.1 fetched in 18ms
2026-07-24T11:51:55.2298114Z 798 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/promise-inflight 8ms (from cache)
2026-07-24T11:51:55.2298376Z 799 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/unique-filename 10ms (from cache)
2026-07-24T11:51:55.2298660Z 800 silly pacote range manifest for promise-inflight@^1.0.1 fetched in 11ms
2026-07-24T11:51:55.2298918Z 801 silly pacote range manifest for unique-filename@^1.1.1 fetched in 12ms
2026-07-24T11:51:55.2299163Z 802 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/npm-packlist 28ms (from cache)
2026-07-24T11:51:55.2299411Z 803 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/minipass 41ms (from cache)
2026-07-24T11:51:55.2299639Z 804 silly pacote range manifest for npm-packlist@^1.1.12 fetched in 35ms
2026-07-24T11:51:55.2299886Z 805 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/npm-pick-manifest 18ms (from cache)
2026-07-24T11:51:55.2300050Z 806 silly pacote range manifest for minipass@^2.3.5 fetched in 48ms
2026-07-24T11:51:55.2300258Z 807 silly pacote range manifest for npm-pick-manifest@^2.2.3 fetched in 21ms
2026-07-24T11:51:55.2300505Z 808 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/sourcemap-codec 13ms (from cache)
2026-07-24T11:51:55.2300760Z 809 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cacache 54ms (from cache)
2026-07-24T11:51:55.2300912Z 810 silly pacote range manifest for glob@7.0.x fetched in 12ms
2026-07-24T11:51:55.2301142Z 811 warn deprecated glob@7.0.6: Old versions of glob are not supported, and contain widely publicized security vulnerabilities, which have been fixed in the current version. Please update. Support for old versions may be purchased (at exorbitant rates) by contacting i@izs.me
2026-07-24T11:51:55.2301444Z 812 silly pacote range manifest for sourcemap-codec@^1.4.8 fetched in 28ms
2026-07-24T11:51:55.2301670Z 813 warn deprecated sourcemap-codec@1.4.8: Please use @jridgewell/sourcemap-codec instead
2026-07-24T11:51:55.2301825Z 814 silly pacote range manifest for cacache@^11.3.2 fetched in 68ms
2026-07-24T11:51:55.2302063Z 815 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/figgy-pudding 54ms (from cache)
2026-07-24T11:51:55.2302327Z 816 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/semver-intersect 22ms (from cache)
2026-07-24T11:51:55.2302495Z 817 silly pacote range manifest for debug@* fetched in 4ms
2026-07-24T11:51:55.2302628Z 818 silly pacote range manifest for mkdirp@0.5.x fetched in 5ms
2026-07-24T11:51:55.2302833Z 819 silly pacote range manifest for figgy-pudding@^3.5.1 fetched in 59ms
2026-07-24T11:51:55.2303045Z 820 warn deprecated figgy-pudding@3.5.2: This module is no longer supported.
2026-07-24T11:51:55.2303297Z 821 silly pacote version manifest for semver-intersect@1.4.0 fetched in 26ms
2026-07-24T11:51:55.2303551Z 822 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/normalize-package-data 37ms (from cache)
2026-07-24T11:51:55.2303779Z 823 silly pacote range manifest for source-map@0.1.x fetched in 6ms
2026-07-24T11:51:55.2303920Z 824 silly pacote range manifest for mime@^1.4.1 fetched in 6ms
2026-07-24T11:51:55.2304140Z 825 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/sax 29ms (from cache)
2026-07-24T11:51:55.2304524Z 826 silly pacote range manifest for normalize-package-data@^2.4.0 fetched in 44ms
2026-07-24T11:51:55.2304801Z 827 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/css-parse 13ms (from cache)
2026-07-24T11:51:55.2304965Z 828 silly pacote range manifest for mkdirp@^0.5.0 fetched in 6ms
2026-07-24T11:51:55.2305102Z 829 silly pacote range manifest for sax@0.5.x fetched in 34ms
2026-07-24T11:51:55.2305239Z 830 silly pacote range manifest for request@^2.83.0 fetched in 3ms
2026-07-24T11:51:55.2305445Z 831 silly pacote range manifest for css-parse@1.7.x fetched in 16ms
2026-07-24T11:51:55.2305686Z 832 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/npm-registry-fetch 53ms (from cache)
2026-07-24T11:51:55.2305946Z 833 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/errno 20ms (from cache)
2026-07-24T11:51:55.2306169Z 834 silly pacote range manifest for source-map@~0.6.0 fetched in 11ms
2026-07-24T11:51:55.2306381Z 835 silly pacote range manifest for npm-registry-fetch@^3.8.0 fetched in 63ms
2026-07-24T11:51:55.2306554Z 836 silly pacote range manifest for errno@^0.1.1 fetched in 24ms
2026-07-24T11:51:55.2306797Z 837 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/make-fetch-happen 71ms (from cache)
2026-07-24T11:51:55.2307054Z 838 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/clone 34ms (from cache)
2026-07-24T11:51:55.2307209Z 839 silly pacote range manifest for lodash@^4.17.15 fetched in 13ms
2026-07-24T11:51:55.2307348Z 840 silly pacote range manifest for clone@^2.1.2 fetched in 38ms
2026-07-24T11:51:55.2307557Z 841 silly pacote range manifest for make-fetch-happen@^4.0.1 fetched in 82ms
2026-07-24T11:51:55.2307705Z 842 silly pacote range manifest for request@^2.88.0 fetched in 3ms
2026-07-24T11:51:55.2307935Z 843 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/promise 37ms (from cache)
2026-07-24T11:51:55.2308183Z 844 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/gaze 25ms (from cache)
2026-07-24T11:51:55.2308344Z 845 silly pacote range manifest for promise@^7.1.1 fetched in 42ms
2026-07-24T11:51:55.2308475Z 846 silly pacote range manifest for gaze@^1.0.0 fetched in 29ms
2026-07-24T11:51:55.2308778Z 847 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/image-size 40ms (from cache)
2026-07-24T11:51:55.2309040Z 848 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/get-stdin 14ms (from cache)
2026-07-24T11:51:55.2309300Z 849 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/in-publish 13ms (from cache)
2026-07-24T11:51:55.2309555Z 850 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/meow 32ms (from cache)
2026-07-24T11:51:55.2309779Z 851 silly pacote range manifest for image-size@~0.5.0 fetched in 50ms
2026-07-24T11:51:55.2309987Z 852 silly pacote range manifest for get-stdin@^4.0.1 fetched in 22ms
2026-07-24T11:51:55.2310182Z 853 silly pacote range manifest for in-publish@^2.0.0 fetched in 22ms
2026-07-24T11:51:55.2310391Z 854 silly pacote range manifest for meow@^3.7.0 fetched in 40ms
2026-07-24T11:51:55.2310606Z 855 silly pacote range manifest for loader-utils@^1.1.0 fetched in 3ms
2026-07-24T11:51:55.2310846Z 856 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/sass-graph 18ms (from cache)
2026-07-24T11:51:55.2311097Z 857 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/nan 56ms (from cache)
2026-07-24T11:51:55.2311352Z 858 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/async-foreach 13ms (from cache)
2026-07-24T11:51:55.2311647Z 859 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/stdout-stream 13ms (from cache)
2026-07-24T11:51:55.2311895Z 860 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/tar 160ms (from cache)
2026-07-24T11:51:55.2312117Z 861 silly pacote range manifest for sass-graph@^2.2.4 fetched in 36ms
2026-07-24T11:51:55.2312263Z 862 silly pacote range manifest for nan@^2.13.2 fetched in 74ms
2026-07-24T11:51:55.2312501Z 863 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/true-case-path 24ms (from cache)
2026-07-24T11:51:55.2312731Z 864 silly pacote range manifest for async-foreach@^0.1.3 fetched in 27ms
2026-07-24T11:51:55.2312972Z 865 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cross-spawn 40ms (from cache)
2026-07-24T11:51:55.2313201Z 866 silly pacote range manifest for stdout-stream@^1.4.0 fetched in 30ms
2026-07-24T11:51:55.2313337Z 867 silly pacote range manifest for tar@^4.4.8 fetched in 174ms
2026-07-24T11:51:55.2313570Z 868 warn deprecated tar@4.4.19: Old versions of tar are not supported, and contain widely publicized security vulnerabilities, which have been fixed in the current version. Please update. Support for old versions may be purchased (at exorbitant rates) by contacting i@izs.me
2026-07-24T11:51:55.2313869Z 869 silly pacote range manifest for true-case-path@^1.0.2 fetched in 32ms
2026-07-24T11:51:55.2314076Z 870 silly pacote range manifest for cross-spawn@^3.0.0 fetched in 48ms
2026-07-24T11:51:55.2314282Z 871 silly pacote range manifest for loader-utils@^1.0.2 fetched in 4ms
2026-07-24T11:51:55.2314453Z 872 silly pacote range manifest for clone@^2.1.1 fetched in 4ms
2026-07-24T11:51:55.2314590Z 873 silly pacote range manifest for chalk@^2.4.2 fetched in 4ms
2026-07-24T11:51:55.2314844Z 874 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fast-json-stable-stringify 11ms (from cache)
2026-07-24T11:51:55.2315100Z 875 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/uri-js 18ms (from cache)
2026-07-24T11:51:55.2315371Z 876 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/json-schema-traverse 14ms (from cache)
2026-07-24T11:51:55.2315631Z 877 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/npmlog 80ms (from cache)
2026-07-24T11:51:55.2315890Z 878 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fast-deep-equal 19ms (from cache)
2026-07-24T11:51:55.2316118Z 879 silly pacote range manifest for supports-color@^6.1.0 fetched in 8ms
2026-07-24T11:51:55.2316356Z 880 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/node-gyp 70ms (from cache)
2026-07-24T11:51:55.2316598Z 881 silly pacote range manifest for fast-json-stable-stringify@^2.0.0 fetched in 22ms
2026-07-24T11:51:55.2316810Z 882 silly pacote range manifest for uri-js@^4.2.2 fetched in 29ms
2026-07-24T11:51:55.2317032Z 883 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/pify 20ms (from cache)
2026-07-24T11:51:55.2317266Z 884 silly pacote range manifest for json-schema-traverse@^0.4.1 fetched in 25ms
2026-07-24T11:51:55.2317416Z 885 silly pacote range manifest for npmlog@^4.0.0 fetched in 92ms
2026-07-24T11:51:55.2317561Z 886 warn deprecated npmlog@4.1.2: This package is no longer supported.
2026-07-24T11:51:55.2317773Z 887 silly pacote range manifest for fast-deep-equal@^2.0.1 fetched in 30ms
2026-07-24T11:51:55.2317977Z 888 silly pacote range manifest for node-gyp@^3.8.0 fetched in 80ms
2026-07-24T11:51:55.2318170Z 889 silly pacote range manifest for pify@^3.0.0 fetched in 26ms
2026-07-24T11:51:55.2318371Z 890 silly pacote range manifest for loader-utils@^1.0.1 fetched in 3ms
2026-07-24T11:51:55.2318658Z 891 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/schema-utils 55ms (from cache)
2026-07-24T11:51:55.2318829Z 892 silly pacote range manifest for postcss@^7.0.1 fetched in 6ms
2026-07-24T11:51:55.2319040Z 893 silly pacote range manifest for schema-utils@^1.0.0 fetched in 61ms
2026-07-24T11:51:55.2319310Z 894 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/emojis-list 15ms (from cache)
2026-07-24T11:51:55.2319569Z 895 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/lodash.tail 12ms (from cache)
2026-07-24T11:51:55.2319824Z 896 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/clone-deep 14ms (from cache)
2026-07-24T11:51:55.2319977Z 897 silly pacote range manifest for resolve@^1.1.7 fetched in 4ms
2026-07-24T11:51:55.2320207Z 898 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/json5 31ms (from cache)
2026-07-24T11:51:55.2320431Z 899 silly pacote range manifest for emojis-list@^2.0.0 fetched in 21ms
2026-07-24T11:51:55.2320578Z 900 silly pacote range manifest for lodash.tail@^4.1.1 fetched in 18ms
2026-07-24T11:51:55.2320808Z 901 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/big.js 24ms (from cache)
2026-07-24T11:51:55.2321032Z 902 silly pacote range manifest for clone-deep@^2.0.1 fetched in 22ms
2026-07-24T11:51:55.2321175Z 903 silly pacote range manifest for json5@^1.0.1 fetched in 39ms
2026-07-24T11:51:55.2321308Z 904 silly pacote range manifest for lodash@^4.17.5 fetched in 6ms
2026-07-24T11:51:55.2321548Z 905 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/lodash.clonedeep 19ms (from cache)
2026-07-24T11:51:55.2321809Z 906 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/read-cache 13ms (from cache)
2026-07-24T11:51:55.2321971Z 907 silly pacote range manifest for postcss@^7.0.0 fetched in 7ms
2026-07-24T11:51:55.2322110Z 908 silly pacote range manifest for big.js@^5.2.2 fetched in 31ms
2026-07-24T11:51:55.2322388Z 909 silly pacote range manifest for source-map@~0.6.1 fetched in 3ms
2026-07-24T11:51:55.2322531Z 910 silly pacote range manifest for lodash.clonedeep@^4.5.0 fetched in 30ms
2026-07-24T11:51:55.2322676Z 911 silly pacote range manifest for async@^2.5.0 fetched in 9ms
2026-07-24T11:51:55.2322881Z 912 silly pacote range manifest for read-cache@^1.0.0 fetched in 24ms
2026-07-24T11:51:55.2323026Z 913 silly pacote range manifest for lodash@^4.17.4 fetched in 9ms
2026-07-24T11:51:55.2323172Z 914 silly pacote version manifest for typescript@3.2.4 fetched in 7ms
2026-07-24T11:51:55.2323408Z 915 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/neo-async 40ms (from cache)
2026-07-24T11:51:55.2323572Z 916 silly pacote version manifest for chokidar@2.0.4 fetched in 5ms
2026-07-24T11:51:55.2323797Z 917 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/when 40ms (from cache)
2026-07-24T11:51:55.2324038Z 918 silly pacote version manifest for fast-json-stable-stringify@2.0.0 fetched in 7ms
2026-07-24T11:51:55.2324252Z 919 silly pacote version manifest for source-map@0.7.3 fetched in 8ms
2026-07-24T11:51:55.2324492Z 920 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/source-list-map 20ms (from cache)
2026-07-24T11:51:55.2324657Z 921 silly pacote range manifest for cacache@^12.0.3 fetched in 7ms
2026-07-24T11:51:55.2324901Z 922 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/postcss-value-parser 31ms (from cache)
2026-07-24T11:51:55.2325131Z 923 silly pacote range manifest for neo-async@^2.5.0 fetched in 50ms
2026-07-24T11:51:55.2325324Z 924 silly pacote range manifest for is-glob@^4.0.1 fetched in 7ms
2026-07-24T11:51:55.2325463Z 925 silly pacote range manifest for when@~3.6.x fetched in 50ms
2026-07-24T11:51:55.2325668Z 926 silly pacote range manifest for source-list-map@^2.0.0 fetched in 28ms
2026-07-24T11:51:55.2325876Z 927 silly pacote range manifest for loader-utils@^1.2.3 fetched in 6ms
2026-07-24T11:51:55.2326096Z 928 silly pacote range manifest for postcss-value-parser@^3.2.3 fetched in 39ms
2026-07-24T11:51:55.2326353Z 929 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/postcss-load-config 33ms (from cache)
2026-07-24T11:51:55.2326592Z 930 silly pacote range manifest for source-map-support@^0.5.5 fetched in 6ms
2026-07-24T11:51:55.2326799Z 931 silly pacote range manifest for webpack-sources@^1.2.0 fetched in 6ms
2026-07-24T11:51:55.2327046Z 932 silly pacote range manifest for postcss-load-config@^2.0.0 fetched in 39ms
2026-07-24T11:51:55.2327288Z 933 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/webpack-log 17ms (from cache)
2026-07-24T11:51:55.2327455Z 934 silly pacote range manifest for cacache@^12.0.2 fetched in 4ms
2026-07-24T11:51:55.2327664Z 935 silly pacote range manifest for webpack-sources@^1.4.0 fetched in 3ms
2026-07-24T11:51:55.2327870Z 936 silly pacote range manifest for webpack-log@^2.0.0 fetched in 21ms
2026-07-24T11:51:55.2328111Z 937 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/find-cache-dir 16ms (from cache)
2026-07-24T11:51:55.2328338Z 938 silly pacote range manifest for convert-source-map@^1.5.0 fetched in 5ms
2026-07-24T11:51:55.2328556Z 939 silly pacote range manifest for istanbul-lib-instrument@^1.7.3 fetched in 4ms
2026-07-24T11:51:55.2328832Z 940 silly pacote range manifest for schema-utils@^0.3.0 fetched in 2ms
2026-07-24T11:51:55.2329046Z 941 silly pacote range manifest for find-cache-dir@^2.1.0 fetched in 20ms
2026-07-24T11:51:55.2329191Z 942 silly pacote range manifest for chalk@^2.0.1 fetched in 3ms
2026-07-24T11:51:55.2329439Z 943 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fwebpack-sources 18ms (from cache)
2026-07-24T11:51:55.2329713Z 944 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/serialize-javascript 23ms (from cache)
2026-07-24T11:51:55.2329970Z 945 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/worker-farm 16ms (from cache)
2026-07-24T11:51:55.2330199Z 946 silly pacote range manifest for webpack-sources@^1.1.0 fetched in 8ms
2026-07-24T11:51:55.2330444Z 947 silly pacote range manifest for range-parser@^1.0.3 fetched in 6ms
2026-07-24T11:51:55.2330658Z 948 silly pacote range manifest for serialize-javascript@^2.1.2 fetched in 31ms
2026-07-24T11:51:55.2330875Z 949 silly pacote range manifest for @types/webpack-sources@^0.1.5 fetched in 27ms
2026-07-24T11:51:55.2331117Z 950 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/globby 46ms (from cache)
2026-07-24T11:51:55.2331343Z 951 silly pacote range manifest for worker-farm@^1.7.0 fetched in 28ms
2026-07-24T11:51:55.2331481Z 952 silly pacote range manifest for del@^3.0.0 fetched in 9ms
2026-07-24T11:51:55.2331713Z 953 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/memory-fs 20ms (from cache)
2026-07-24T11:51:55.2331873Z 954 silly pacote range manifest for globby@^7.1.1 fetched in 55ms
2026-07-24T11:51:55.2332109Z 955 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/webpack-core 24ms (from cache)
2026-07-24T11:51:55.2332272Z 956 silly pacote range manifest for debug@^3.1.0 fetched in 4ms
2026-07-24T11:51:55.2332471Z 957 silly pacote range manifest for memory-fs@~0.4.1 fetched in 25ms
2026-07-24T11:51:55.2332614Z 958 silly pacote version manifest for yargs@12.0.2 fetched in 3ms
2026-07-24T11:51:55.2332834Z 959 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/url 18ms (from cache)
2026-07-24T11:51:55.2333086Z 960 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ip 23ms (from cache)
2026-07-24T11:51:55.2333312Z 961 silly pacote range manifest for webpack-core@^0.6.8 fetched in 30ms
2026-07-24T11:51:55.2333542Z 962 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/opn 21ms (from cache)
2026-07-24T11:51:55.2333700Z 963 silly pacote range manifest for url@^0.11.0 fetched in 23ms
2026-07-24T11:51:55.2333836Z 964 silly pacote range manifest for ip@^1.1.5 fetched in 28ms
2026-07-24T11:51:55.2333973Z 965 silly pacote range manifest for chokidar@^2.0.0 fetched in 5ms
2026-07-24T11:51:55.2334106Z 966 silly pacote range manifest for opn@^5.1.0 fetched in 26ms
2026-07-24T11:51:55.2334341Z 967 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/p-limit 62ms (from cache)
2026-07-24T11:51:55.2334595Z 968 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/bonjour 15ms (from cache)
2026-07-24T11:51:55.2334815Z 969 silly pacote range manifest for p-limit@^2.2.1 fetched in 67ms
2026-07-24T11:51:55.2335084Z 970 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/killable 9ms (from cache)
2026-07-24T11:51:55.2335246Z 971 silly pacote range manifest for bonjour@^3.5.0 fetched in 19ms
2026-07-24T11:51:55.2335479Z 972 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/sockjs 21ms (from cache)
2026-07-24T11:51:55.2335730Z 973 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ansi-html 12ms (from cache)
2026-07-24T11:51:55.2335893Z 974 silly pacote range manifest for killable@^1.0.0 fetched in 14ms
2026-07-24T11:51:55.2336034Z 975 silly pacote version manifest for sockjs@0.3.19 fetched in 25ms
2026-07-24T11:51:55.2336234Z 976 silly pacote version manifest for ansi-html@0.0.7 fetched in 16ms
2026-07-24T11:51:55.2336467Z 977 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/loglevel 19ms (from cache)
2026-07-24T11:51:55.2336721Z 978 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/portfinder 19ms (from cache)
2026-07-24T11:51:55.2336890Z 979 silly pacote range manifest for loglevel@^1.4.1 fetched in 25ms
2026-07-24T11:51:55.2337116Z 980 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/internal-ip 12ms (from cache)
2026-07-24T11:51:55.2337278Z 981 silly pacote range manifest for portfinder@^1.0.9 fetched in 24ms
2026-07-24T11:51:55.2337514Z 982 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/selfsigned 20ms (from cache)
2026-07-24T11:51:55.2337775Z 983 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/import-local 13ms (from cache)
2026-07-24T11:51:55.2338060Z 984 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/compression 22ms (from cache)
2026-07-24T11:51:55.2338293Z 985 silly pacote range manifest for internal-ip@^3.0.1 fetched in 20ms
2026-07-24T11:51:55.2338438Z 986 silly pacote range manifest for selfsigned@^1.9.1 fetched in 27ms
2026-07-24T11:51:55.2338734Z 987 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/serve-index 20ms (from cache)
2026-07-24T11:51:55.2338970Z 988 silly pacote range manifest for import-local@^2.0.0 fetched in 21ms
2026-07-24T11:51:55.2339114Z 989 silly pacote range manifest for compression@^1.5.2 fetched in 32ms
2026-07-24T11:51:55.2339322Z 990 silly pacote range manifest for supports-color@^5.1.0 fetched in 7ms
2026-07-24T11:51:55.2339528Z 991 silly pacote range manifest for serve-index@^1.7.2 fetched in 28ms
2026-07-24T11:51:55.2339767Z 992 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/spdy 63ms (from cache)
2026-07-24T11:51:55.2340001Z 993 silly pacote version manifest for webpack-dev-middleware@3.4.0 fetched in 14ms
2026-07-24T11:51:55.2340209Z 994 silly pacote range manifest for utils-extend@^1.0.6 fetched in 14ms
2026-07-24T11:51:55.2340411Z 995 silly pacote range manifest for postcss@^7.0.13 fetched in 14ms
2026-07-24T11:51:55.2340550Z 996 silly pacote range manifest for spdy@^4.0.0 fetched in 76ms
2026-07-24T11:51:55.2340810Z 997 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/connect-history-api-fallback 21ms (from cache)
2026-07-24T11:51:55.2341082Z 998 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/sockjs-client 34ms (from cache)
2026-07-24T11:51:55.2341342Z 999 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/html-entities 41ms (from cache)
2026-07-24T11:51:55.2341585Z 1000 silly pacote range manifest for connect-history-api-fallback@^1.3.0 fetched in 29ms
2026-07-24T11:51:55.2341906Z 1001 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/num2fraction 12ms (from cache)
2026-07-24T11:51:55.2342289Z 1002 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/normalize-range 13ms (from cache)
2026-07-24T11:51:55.2342660Z 1003 silly pacote version manifest for sockjs-client@1.3.0 fetched in 43ms
2026-07-24T11:51:55.2342985Z 1004 silly pacote range manifest for html-entities@^1.2.0 fetched in 49ms
2026-07-24T11:51:55.2343361Z 1005 silly pacote range manifest for postcss-value-parser@^3.3.1 fetched in 5ms
2026-07-24T11:51:55.2343634Z 1006 silly pacote range manifest for num2fraction@^1.2.2 fetched in 17ms
2026-07-24T11:51:55.2343934Z 1007 silly pacote range manifest for normalize-range@^0.1.2 fetched in 19ms
2026-07-24T11:51:55.2344217Z 1008 silly pacote range manifest for core-js@^2.5.0 fetched in 5ms
2026-07-24T11:51:55.2344502Z 1009 silly pacote range manifest for core-js@^2.4.0 fetched in 7ms
2026-07-24T11:51:55.2344857Z 1010 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/chartjs-color-string 11ms (from cache)
2026-07-24T11:51:55.2345301Z 1011 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/regenerator-runtime 17ms (from cache)
2026-07-24T11:51:55.2345692Z 1012 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/terser 142ms (from cache)
2026-07-24T11:51:55.2346070Z 1013 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/regenerator-runtime 35ms (from cache)
2026-07-24T11:51:55.2346397Z 1014 silly pacote range manifest for chartjs-color-string@^0.6.0 fetched in 33ms
2026-07-24T11:51:55.2346734Z 1015 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/color-convert 35ms (from cache)
2026-07-24T11:51:55.2347067Z 1016 silly pacote range manifest for regenerator-runtime@^0.10.5 fetched in 41ms
2026-07-24T11:51:55.2347284Z 1017 silly pacote range manifest for terser@^4.1.2 fetched in 165ms
2026-07-24T11:51:55.2347552Z 1018 silly pacote range manifest for regenerator-runtime@^0.11.0 fetched in 42ms
2026-07-24T11:51:55.2347769Z 1019 silly pacote range manifest for color-convert@^1.9.3 fetched in 41ms
2026-07-24T11:51:55.2347984Z 1020 silly pacote range manifest for stackblur-canvas@^1.4.1 fetched in 4ms
2026-07-24T11:51:55.2348257Z 1021 silly pacote version manifest for css-line-break@1.0.1 fetched in 5ms
2026-07-24T11:51:55.2348522Z 1022 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/http-proxy-middleware 90ms (from cache)
2026-07-24T11:51:55.2348882Z 1023 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/rgbcolor 19ms (from cache)
2026-07-24T11:51:55.2349131Z 1024 silly pacote range manifest for http-proxy-middleware@~0.18.0 fetched in 102ms
2026-07-24T11:51:55.2349373Z 1025 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/utrie 17ms (from cache)
2026-07-24T11:51:55.2349536Z 1026 silly pacote range manifest for rgbcolor@^1.0.1 fetched in 23ms
2026-07-24T11:51:55.2349773Z 1027 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/xmldom 29ms (from cache)
2026-07-24T11:51:55.2349936Z 1028 silly pacote range manifest for utrie@^1.0.2 fetched in 23ms
2026-07-24T11:51:55.2350082Z 1029 silly pacote range manifest for xmldom@^0.1.22 fetched in 33ms
2026-07-24T11:51:55.2350307Z 1030 warn deprecated xmldom@0.1.31: Deprecated due to CVE-2021-21366 resolved in 0.5.0
2026-07-24T11:51:55.2350556Z 1031 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cfb 24ms (from cache)
2026-07-24T11:51:55.2350812Z 1032 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ssf 25ms (from cache)
2026-07-24T11:51:55.2351068Z 1033 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/wmf 12ms (from cache)
2026-07-24T11:51:55.2351322Z 1034 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/word 12ms (from cache)
2026-07-24T11:51:55.2351487Z 1035 silly pacote range manifest for cfb@~1.2.1 fetched in 30ms
2026-07-24T11:51:55.2351630Z 1036 silly pacote range manifest for ssf@~0.11.2 fetched in 30ms
2026-07-24T11:51:55.2351765Z 1037 silly pacote range manifest for wmf@~1.0.1 fetched in 17ms
2026-07-24T11:51:55.2351909Z 1038 silly pacote range manifest for word@~0.3.0 fetched in 16ms
2026-07-24T11:51:55.2352148Z 1039 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/crc-32 13ms (from cache)
2026-07-24T11:51:55.2352315Z 1040 silly pacote range manifest for minimatch@^3.0.3 fetched in 4ms
2026-07-24T11:51:55.2352556Z 1041 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/adler-32 13ms (from cache)
2026-07-24T11:51:55.2352727Z 1042 silly pacote range manifest for lodash@^4.17.14 fetched in 5ms
2026-07-24T11:51:55.2352969Z 1043 silly pacote range manifest for crc-32@~1.2.1 fetched in 20ms
2026-07-24T11:51:55.2353105Z 1044 silly pacote range manifest for rimraf@^2.6.3 fetched in 6ms
2026-07-24T11:51:55.2353310Z 1045 silly pacote range manifest for adler-32@~1.3.0 fetched in 20ms
2026-07-24T11:51:55.2353453Z 1046 silly pacote range manifest for rfdc@^1.3.0 fetched in 3ms
2026-07-24T11:51:55.2353591Z 1047 silly pacote range manifest for debug@^4.3.4 fetched in 3ms
2026-07-24T11:51:55.2353832Z 1048 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/append-transform 12ms (from cache)
2026-07-24T11:51:55.2354006Z 1049 silly pacote range manifest for flatted@^3.2.7 fetched in 3ms
2026-07-24T11:51:55.2354241Z 1050 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/codepage 16ms (from cache)
2026-07-24T11:51:55.2354465Z 1051 silly pacote range manifest for date-format@^4.0.14 fetched in 5ms
2026-07-24T11:51:55.2354610Z 1052 silly pacote range manifest for semver@^6.0.0 fetched in 4ms
2026-07-24T11:51:55.2354823Z 1053 silly pacote range manifest for append-transform@^1.0.0 fetched in 17ms
2026-07-24T11:51:55.2354974Z 1054 silly pacote range manifest for streamroller@^3.1.5 fetched in 4ms
2026-07-24T11:51:55.2355120Z 1055 silly pacote range manifest for codepage@~1.15.0 fetched in 21ms
2026-07-24T11:51:55.2355359Z 1056 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/express 189ms (from cache)
2026-07-24T11:51:55.2355520Z 1057 silly pacote range manifest for express@^4.16.2 fetched in 200ms
2026-07-24T11:51:55.2355761Z 1058 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/browserslist 141ms (from cache)
2026-07-24T11:51:55.2355961Z 1059 silly pacote range manifest for browserslist@^4.4.1 fetched in 153ms
2026-07-24T11:51:55.2356197Z 1060 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/wrappy 16ms (from cache)
2026-07-24T11:51:55.2356356Z 1061 silly pacote range manifest for pify@^4.0.1 fetched in 1ms
2026-07-24T11:51:55.2356495Z 1062 silly pacote range manifest for wrappy@1 fetched in 17ms
2026-07-24T11:51:55.2356742Z 1063 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@babel%2ftemplate 38ms (from cache)
2026-07-24T11:51:55.2356903Z 1064 silly pacote range manifest for minimatch@* fetched in 5ms
2026-07-24T11:51:55.2357050Z 1065 silly pacote range manifest for @babel/template@^7.4.0 fetched in 42ms
2026-07-24T11:51:55.2357291Z 1066 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/html-escaper 8ms (from cache)
2026-07-24T11:51:55.2357523Z 1067 silly pacote range manifest for html-escaper@^2.0.0 fetched in 10ms
2026-07-24T11:51:55.2357758Z 1068 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fn.name 4ms (from cache)
2026-07-24T11:51:55.2357926Z 1069 silly pacote version manifest for @colors/colors@1.6.0 fetched in 1ms
2026-07-24T11:51:55.2358072Z 1070 silly pacote range manifest for fn.name@1.x.x fetched in 6ms
2026-07-24T11:51:55.2358301Z 1071 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/agent-base 6ms (from cache)
2026-07-24T11:51:55.2358632Z 1072 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2ftriple-beam 4ms (from cache)
2026-07-24T11:51:55.2358913Z 1073 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/undici-types 63ms (from cache)
2026-07-24T11:51:55.2359145Z 1074 silly pacote range manifest for agent-base@^4.3.0 fetched in 12ms
2026-07-24T11:51:55.2359361Z 1075 silly pacote range manifest for @types/triple-beam@^1.3.2 fetched in 10ms
2026-07-24T11:51:55.2359575Z 1076 silly pacote range manifest for undici-types@~8.3.0 fetched in 69ms
2026-07-24T11:51:55.2359811Z 1077 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fecha 13ms (from cache)
2026-07-24T11:51:55.2360075Z 1078 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@babel%2ftypes 64ms (from cache)
2026-07-24T11:51:55.2360340Z 1079 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@so-ric%2fcolorspace 12ms (from cache)
2026-07-24T11:51:55.2360563Z 1080 silly pacote range manifest for fecha@^4.2.0 fetched in 22ms
2026-07-24T11:51:55.2360801Z 1081 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/enabled 12ms (from cache)
2026-07-24T11:51:55.2360970Z 1082 silly pacote range manifest for @babel/types@^7.4.0 fetched in 72ms
2026-07-24T11:51:55.2361207Z 1083 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/jsdom 163ms (from cache)
2026-07-24T11:51:55.2361439Z 1084 silly pacote range manifest for @so-ric/colorspace@^1.1.6 fetched in 51ms
2026-07-24T11:51:55.2361586Z 1085 silly pacote range manifest for enabled@2.0.x fetched in 52ms
2026-07-24T11:51:55.2361970Z 1086 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@babel%2fgenerator 110ms (from cache)
2026-07-24T11:51:55.2362330Z 1087 silly pacote range manifest for readable-stream@^3.6.2 fetched in 48ms
2026-07-24T11:51:55.2362548Z 1088 silly pacote range manifest for jsdom@^8.1.0 fetched in 209ms
2026-07-24T11:51:55.2362879Z 1089 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ms 65ms (from cache)
2026-07-24T11:51:55.2363266Z 1090 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@babel%2ftraverse 126ms (from cache)
2026-07-24T11:51:55.2363539Z 1091 silly pacote range manifest for @babel/generator@^7.4.0 fetched in 131ms
2026-07-24T11:51:55.2363817Z 1092 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/kuler 63ms (from cache)
2026-07-24T11:51:55.2363975Z 1093 silly pacote range manifest for ms@^2.1.1 fetched in 78ms
2026-07-24T11:51:55.2364124Z 1094 silly pacote range manifest for @babel/traverse@^7.4.3 fetched in 135ms
2026-07-24T11:51:55.2364441Z 1095 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/concat-map 19ms (from cache)
2026-07-24T11:51:55.2364606Z 1096 silly pacote range manifest for kuler@^2.0.0 fetched in 68ms
2026-07-24T11:51:55.2364810Z 1097 silly pacote range manifest for color-convert@^1.9.0 fetched in 3ms
2026-07-24T11:51:55.2365054Z 1098 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/string_decoder 17ms (from cache)
2026-07-24T11:51:55.2365318Z 1099 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/balanced-match 21ms (from cache)
2026-07-24T11:51:55.2365579Z 1100 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ansi-regex 34ms (from cache)
2026-07-24T11:51:55.2365816Z 1101 silly pacote version manifest for concat-map@0.0.1 fetched in 26ms
2026-07-24T11:51:55.2366066Z 1102 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/util-deprecate 10ms (from cache)
2026-07-24T11:51:55.2366296Z 1103 silly pacote range manifest for os-tmpdir@~1.0.1 fetched in 5ms
2026-07-24T11:51:55.2366448Z 1104 silly pacote range manifest for string_decoder@^1.1.1 fetched in 23ms
2026-07-24T11:51:55.2366662Z 1105 silly pacote range manifest for balanced-match@^1.0.0 fetched in 27ms
2026-07-24T11:51:55.2366875Z 1106 silly pacote range manifest for ansi-regex@^2.0.0 fetched in 40ms
2026-07-24T11:51:55.2367013Z 1107 silly pacote range manifest for pify@^2.0.0 fetched in 5ms
2026-07-24T11:51:55.2367226Z 1108 silly pacote range manifest for util-deprecate@^1.0.1 fetched in 16ms
2026-07-24T11:51:55.2367376Z 1109 silly pacote range manifest for globby@^5.0.0 fetched in 5ms
2026-07-24T11:51:55.2367614Z 1110 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/has-flag 12ms (from cache)
2026-07-24T11:51:55.2367783Z 1111 silly pacote range manifest for rimraf@^2.2.8 fetched in 6ms
2026-07-24T11:51:55.2367993Z 1112 silly pacote version manifest for source-map@0.5.6 fetched in 4ms
2026-07-24T11:51:55.2368202Z 1113 silly pacote range manifest for has-flag@^3.0.0 fetched in 17ms
2026-07-24T11:51:55.2368449Z 1114 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@babel%2fparser 157ms (from cache)
2026-07-24T11:51:55.2368702Z 1115 silly pacote range manifest for sax@>=0.6.0 fetched in 22ms
2026-07-24T11:51:55.2368954Z 1116 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-path-cwd 28ms (from cache)
2026-07-24T11:51:55.2369264Z 1117 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/pinkie-promise 27ms (from cache)
2026-07-24T11:51:55.2369432Z 1118 silly pacote range manifest for xmlbuilder@~11.0.0 fetched in 22ms
2026-07-24T11:51:55.2369677Z 1119 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/object-assign 30ms (from cache)
2026-07-24T11:51:55.2369942Z 1120 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-path-in-cwd 31ms (from cache)
2026-07-24T11:51:55.2370105Z 1121 silly pacote range manifest for @babel/parser@^7.4.3 fetched in 180ms
2026-07-24T11:51:55.2370389Z 1122 silly pacote range manifest for is-path-cwd@^1.0.0 fetched in 36ms
2026-07-24T11:51:55.2370610Z 1123 silly pacote range manifest for pinkie-promise@^2.0.0 fetched in 34ms
2026-07-24T11:51:55.2370822Z 1124 silly pacote range manifest for object-assign@^4.0.1 fetched in 35ms
2026-07-24T11:51:55.2371034Z 1125 silly pacote range manifest for is-path-in-cwd@^1.0.0 fetched in 37ms
2026-07-24T11:51:55.2371248Z 1126 silly pacote range manifest for readable-stream@~2.3.6 fetched in 5ms
2026-07-24T11:51:55.2371460Z 1127 silly pacote range manifest for sprintf-js@~1.0.2 fetched in 5ms
2026-07-24T11:51:55.2371599Z 1128 silly pacote range manifest for ajv@^6.1.0 fetched in 5ms
2026-07-24T11:51:55.2371738Z 1129 silly pacote range manifest for mkdirp@~0.5.0 fetched in 4ms
2026-07-24T11:51:55.2371978Z 1130 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/setimmediate 12ms (from cache)
2026-07-24T11:51:55.2372147Z 1131 silly pacote range manifest for setimmediate@^1.0.5 fetched in 16ms
2026-07-24T11:51:55.2372420Z 1132 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/pako 23ms (from cache)
2026-07-24T11:51:55.2372780Z 1133 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/lie 27ms (from cache)
2026-07-24T11:51:55.2373048Z 1134 silly pacote range manifest for pako@~1.0.2 fetched in 28ms
2026-07-24T11:51:55.2373256Z 1135 silly pacote range manifest for lie@~3.3.0 fetched in 31ms
2026-07-24T11:51:55.2373578Z 1136 silly pacote range manifest for schema-utils@^0.4.4 fetched in 3ms
2026-07-24T11:51:55.2373899Z 1137 silly pacote range manifest for webpack-sources@^1.3.0 fetched in 2ms
2026-07-24T11:51:55.2374227Z 1138 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/tapable 23ms (from cache)
2026-07-24T11:51:55.2374492Z 1139 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/watchpack 26ms (from cache)
2026-07-24T11:51:55.2374802Z 1140 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/loader-runner 13ms (from cache)
2026-07-24T11:51:55.2375074Z 1141 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/eslint-scope 24ms (from cache)
2026-07-24T11:51:55.2375235Z 1142 silly pacote range manifest for tapable@^1.1.0 fetched in 34ms
2026-07-24T11:51:55.2375380Z 1143 silly pacote range manifest for watchpack@^1.5.0 fetched in 34ms
2026-07-24T11:51:55.2375587Z 1144 silly pacote range manifest for loader-runner@^2.3.0 fetched in 19ms
2026-07-24T11:51:55.2375798Z 1145 silly pacote range manifest for eslint-scope@^4.0.0 fetched in 30ms
2026-07-24T11:51:55.2376040Z 1146 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/micromatch 40ms (from cache)
2026-07-24T11:51:55.2376306Z 1147 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/chrome-trace-event 11ms (from cache)
2026-07-24T11:51:55.2376583Z 1148 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/acorn-dynamic-import 12ms (from cache)
2026-07-24T11:51:55.2376753Z 1149 silly pacote range manifest for micromatch@^3.1.8 fetched in 50ms
2026-07-24T11:51:55.2376997Z 1150 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/node-libs-browser 18ms (from cache)
2026-07-24T11:51:55.2377263Z 1151 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ajv-keywords 51ms (from cache)
2026-07-24T11:51:55.2377502Z 1152 silly pacote range manifest for chrome-trace-event@^1.0.0 fetched in 21ms
2026-07-24T11:51:55.2377728Z 1153 silly pacote range manifest for acorn-dynamic-import@^4.0.0 fetched in 21ms
2026-07-24T11:51:55.2378042Z 1154 warn deprecated acorn-dynamic-import@4.0.0: This is probably built in to whatever tool you're using. If you still need it... idk
2026-07-24T11:51:55.2378305Z 1155 silly pacote range manifest for terser-webpack-plugin@^1.1.0 fetched in 7ms
2026-07-24T11:51:55.2378526Z 1156 silly pacote range manifest for node-libs-browser@^2.0.0 fetched in 27ms
2026-07-24T11:51:55.2378816Z 1157 silly pacote range manifest for ajv-keywords@^3.1.0 fetched in 59ms
2026-07-24T11:51:55.2379060Z 1158 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/acorn 66ms (from cache)
2026-07-24T11:51:55.2379227Z 1159 silly pacote range manifest for acorn@^6.0.5 fetched in 78ms
2026-07-24T11:51:55.2379479Z 1160 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/json-parse-better-errors 19ms (from cache)
2026-07-24T11:51:55.2379745Z 1161 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/hasown 6ms (from cache)
2026-07-24T11:51:55.2379990Z 1162 silly pacote range manifest for json-parse-better-errors@^1.0.2 fetched in 22ms
2026-07-24T11:51:55.2380249Z 1163 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fast 46ms (from cache)
2026-07-24T11:51:55.2380412Z 1164 silly pacote range manifest for hasown@^2.0.3 fetched in 12ms
2026-07-24T11:51:55.2380624Z 1165 silly pacote range manifest for extend-shallow@^3.0.2 fetched in 4ms
2026-07-24T11:51:55.2380779Z 1166 silly pacote version manifest for @webassemblyjs/ast@1.7.11 fetched in 53ms
2026-07-24T11:51:55.2381029Z 1167 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/define-property 12ms (from cache)
2026-07-24T11:51:55.2381365Z 1168 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fhelper-module-context 28ms (from cache)
2026-07-24T11:51:55.2381645Z 1169 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/enhanced-resolve 144ms (from cache)
2026-07-24T11:51:55.2381886Z 1170 silly pacote range manifest for define-property@^2.0.2 fetched in 26ms
2026-07-24T11:51:55.2382187Z 1171 silly pacote version manifest for @webassemblyjs/helper-module-context@1.7.11 fetched in 42ms
2026-07-24T11:51:55.2382550Z 1172 silly pacote version manifest for enhanced-resolve@4.1.0 fetched in 156ms
2026-07-24T11:51:55.2382927Z 1173 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/safe-regex 20ms (from cache)
2026-07-24T11:51:55.2383332Z 1174 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/regex-not 21ms (from cache)
2026-07-24T11:51:55.2383669Z 1175 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-number 23ms (from cache)
2026-07-24T11:51:55.2383955Z 1176 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fwasm-edit 53ms (from cache)
2026-07-24T11:51:55.2384195Z 1177 silly pacote range manifest for extend-shallow@^3.0.0 fetched in 10ms
2026-07-24T11:51:55.2384406Z 1178 silly pacote range manifest for safe-regex@^1.1.0 fetched in 30ms
2026-07-24T11:51:55.2384607Z 1179 silly pacote range manifest for regex-not@^1.0.2 fetched in 32ms
2026-07-24T11:51:55.2384814Z 1180 silly pacote range manifest for is-number@^3.0.0 fetched in 29ms
2026-07-24T11:51:55.2385038Z 1181 silly pacote version manifest for @webassemblyjs/wasm-edit@1.7.11 fetched in 58ms
2026-07-24T11:51:55.2385309Z 1182 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fwasm-parser 59ms (from cache)
2026-07-24T11:51:55.2385583Z 1183 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/repeat-string 21ms (from cache)
2026-07-24T11:51:55.2385749Z 1184 silly pacote range manifest for debug@^2.2.0 fetched in 11ms
2026-07-24T11:51:55.2385961Z 1185 silly pacote range manifest for define-property@^0.2.5 fetched in 11ms
2026-07-24T11:51:55.2386183Z 1186 silly pacote version manifest for @webassemblyjs/wasm-parser@1.7.11 fetched in 70ms
2026-07-24T11:51:55.2386405Z 1187 silly pacote range manifest for repeat-string@^1.6.1 fetched in 28ms
2026-07-24T11:51:55.2386693Z 1188 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/to-regex-range 29ms (from cache)
2026-07-24T11:51:55.2386855Z 1189 silly pacote range manifest for qs@~6.5.2 fetched in 5ms
2026-07-24T11:51:55.2387090Z 1190 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/map-cache 17ms (from cache)
2026-07-24T11:51:55.2387321Z 1191 silly pacote range manifest for to-regex-range@^2.1.0 fetched in 35ms
2026-07-24T11:51:55.2387574Z 1192 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/source-map-resolve 21ms (from cache)
2026-07-24T11:51:55.2387805Z 1193 silly pacote range manifest for map-cache@^0.2.2 fetched in 24ms
2026-07-24T11:51:55.2388045Z 1194 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-extendable 14ms (from cache)
2026-07-24T11:51:55.2388302Z 1195 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/use 15ms (from cache)
2026-07-24T11:51:55.2388537Z 1196 silly pacote range manifest for source-map-resolve@^0.5.0 fetched in 26ms
2026-07-24T11:51:55.2388873Z 1197 warn deprecated source-map-resolve@0.5.3: See https://github.com/lydell/source-map-resolve#deprecated
2026-07-24T11:51:55.2389039Z 1198 silly pacote range manifest for extend@~3.0.2 fetched in 5ms
2026-07-24T11:51:55.2389178Z 1199 silly pacote range manifest for use@^3.1.0 fetched in 19ms
2026-07-24T11:51:55.2389385Z 1200 silly pacote range manifest for is-extendable@^0.1.0 fetched in 18ms
2026-07-24T11:51:55.2389617Z 1201 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/base 33ms (from cache)
2026-07-24T11:51:55.2389782Z 1202 silly pacote range manifest for base@^0.11.1 fetched in 37ms
2026-07-24T11:51:55.2390056Z 1203 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/caseless 11ms (from cache)
2026-07-24T11:51:55.2390315Z 1204 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/aws-sign2 8ms (from cache)
2026-07-24T11:51:55.2390573Z 1205 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/isstream 9ms (from cache)
2026-07-24T11:51:55.2390742Z 1206 silly pacote range manifest for caseless@~0.12.0 fetched in 14ms
2026-07-24T11:51:55.2390947Z 1207 silly pacote range manifest for aws-sign2@~0.7.0 fetched in 10ms
2026-07-24T11:51:55.2391087Z 1208 silly pacote range manifest for isstream@~0.1.2 fetched in 12ms
2026-07-24T11:51:55.2391322Z 1209 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/aws4 25ms (from cache)
2026-07-24T11:51:55.2391581Z 1210 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/oauth-sign 7ms (from cache)
2026-07-24T11:51:55.2391752Z 1211 silly pacote range manifest for aws4@^1.8.0 fetched in 30ms
2026-07-24T11:51:55.2391966Z 1212 silly pacote range manifest for oauth-sign@~0.9.0 fetched in 10ms
2026-07-24T11:51:55.2392209Z 1213 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/tunnel-agent 8ms (from cache)
2026-07-24T11:51:55.2392470Z 1214 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/forever-agent 9ms (from cache)
2026-07-24T11:51:55.2392731Z 1215 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/enhanced-resolve 145ms (from cache)
2026-07-24T11:51:55.2393001Z 1216 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/mime-types 29ms (from cache)
2026-07-24T11:51:55.2393232Z 1217 silly pacote range manifest for tunnel-agent@^0.6.0 fetched in 22ms
2026-07-24T11:51:55.2393444Z 1218 silly pacote range manifest for forever-agent@~0.6.1 fetched in 22ms
2026-07-24T11:51:55.2393658Z 1219 silly pacote range manifest for enhanced-resolve@^4.1.0 fetched in 157ms
2026-07-24T11:51:55.2394005Z 1220 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/form-data 34ms (from cache)
2026-07-24T11:51:55.2394404Z 1221 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-typedarray 22ms (from cache)
2026-07-24T11:51:55.2394729Z 1222 silly pacote range manifest for mime-types@~2.1.19 fetched in 39ms
2026-07-24T11:51:55.2395063Z 1223 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/uuid 51ms (from cache)
2026-07-24T11:51:55.2395455Z 1224 silly pacote range manifest for form-data@~2.3.2 fetched in 48ms
2026-07-24T11:51:55.2395790Z 1225 silly pacote range manifest for is-typedarray@~1.0.0 fetched in 33ms
2026-07-24T11:51:55.2396014Z 1226 silly pacote range manifest for uuid@^3.3.2 fetched in 61ms
2026-07-24T11:51:55.2396262Z 1227 warn deprecated uuid@3.4.0: uuid@10 and below is no longer supported.  For ESM codebases, update to uuid@latest.  For CommonJS codebases, use uuid@11 (but be aware this version will likely be deprecated in 2028).
2026-07-24T11:51:55.2396541Z 1228 silly pacote range manifest for define-property@^1.0.0 fetched in 3ms
2026-07-24T11:51:55.2396793Z 1229 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/performance-now 21ms (from cache)
2026-07-24T11:51:55.2396954Z 1230 silly pacote range manifest for isobject@^3.0.0 fetched in 7ms
2026-07-24T11:51:55.2397199Z 1231 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/combined-stream 24ms (from cache)
2026-07-24T11:51:55.2397464Z 1232 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/tough-cookie 49ms (from cache)
2026-07-24T11:51:55.2397735Z 1233 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/json-stringify-safe 21ms (from cache)
2026-07-24T11:51:55.2398004Z 1234 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/har-validator 46ms (from cache)
2026-07-24T11:51:55.2398241Z 1235 silly pacote range manifest for performance-now@^2.1.0 fetched in 32ms
2026-07-24T11:51:55.2398489Z 1236 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/http-signature 33ms (from cache)
2026-07-24T11:51:55.2398825Z 1237 silly pacote range manifest for strip-ansi@^4.0.0 fetched in 7ms
2026-07-24T11:51:55.2399038Z 1238 silly pacote range manifest for combined-stream@~1.0.6 fetched in 34ms
2026-07-24T11:51:55.2399252Z 1239 silly pacote range manifest for tough-cookie@~2.5.0 fetched in 60ms
2026-07-24T11:51:55.2399473Z 1240 silly pacote range manifest for json-stringify-safe@~5.0.1 fetched in 30ms
2026-07-24T11:51:55.2399725Z 1241 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/caniuse-lite 521ms (from cache)
2026-07-24T11:51:55.2399960Z 1242 silly pacote range manifest for har-validator@~5.1.3 fetched in 78ms
2026-07-24T11:51:55.2400177Z 1243 warn deprecated har-validator@5.1.5: this library is no longer supported
2026-07-24T11:51:55.2400463Z 1244 silly pacote range manifest for string-width@^2.1.1 fetched in 29ms
2026-07-24T11:51:55.2400678Z 1245 silly pacote range manifest for http-signature@~1.2.0 fetched in 64ms
2026-07-24T11:51:55.2400903Z 1246 silly pacote range manifest for caniuse-lite@^1.0.30000929 fetched in 547ms
2026-07-24T11:51:55.2401059Z 1247 silly pacote range manifest for micromatch@^3.1.4 fetched in 3ms
2026-07-24T11:51:55.2401294Z 1248 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/wrap-ansi 49ms (from cache)
2026-07-24T11:51:55.2401564Z 1249 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/snapdragon-util 51ms (from cache)
2026-07-24T11:51:55.2401823Z 1250 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/lcid 38ms (from cache)
2026-07-24T11:51:55.2402046Z 1251 silly pacote range manifest for normalize-path@^2.1.1 fetched in 7ms
2026-07-24T11:51:55.2402254Z 1252 silly pacote range manifest for wrap-ansi@^2.0.0 fetched in 56ms
2026-07-24T11:51:55.2402464Z 1253 silly pacote range manifest for snapdragon-util@^3.0.1 fetched in 58ms
2026-07-24T11:51:55.2402719Z 1254 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-fullwidth-code-point 14ms (from cache)
2026-07-24T11:51:55.2402987Z 1255 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-extglob 13ms (from cache)
2026-07-24T11:51:55.2403256Z 1256 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/locate-path 41ms (from cache)
2026-07-24T11:51:55.2403421Z 1257 silly pacote range manifest for lcid@^2.0.0 fetched in 45ms
2026-07-24T11:51:55.2403616Z 1258 silly pacote range manifest for is-glob@^3.1.0 fetched in 7ms
2026-07-24T11:51:55.2403881Z 1259 silly pacote range manifest for is-fullwidth-code-point@^2.0.0 fetched in 21ms
2026-07-24T11:51:55.2404095Z 1260 silly pacote range manifest for is-extglob@^2.1.1 fetched in 19ms
2026-07-24T11:51:55.2404507Z 1261 silly pacote range manifest for locate-path@^3.0.0 fetched in 47ms
2026-07-24T11:51:55.2404732Z 1262 silly pacote range manifest for micromatch@^3.1.10 fetched in 6ms
2026-07-24T11:51:55.2404989Z 1263 silly pacote range manifest for graceful-fs@^4.1.11 fetched in 6ms
2026-07-24T11:51:55.2405231Z 1264 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/mem 54ms (from cache)
2026-07-24T11:51:55.2405455Z 1265 silly pacote range manifest for readable-stream@^2.0.2 fetched in 7ms
2026-07-24T11:51:55.2405606Z 1266 silly pacote range manifest for nan@^2.12.1 fetched in 7ms
2026-07-24T11:51:55.2405847Z 1267 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/path-dirname 16ms (from cache)
2026-07-24T11:51:55.2406115Z 1268 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/binary-extensions 23ms (from cache)
2026-07-24T11:51:55.2406282Z 1269 silly pacote range manifest for debug@^3.2.6 fetched in 10ms
2026-07-24T11:51:55.2406420Z 1270 silly pacote range manifest for mem@^4.0.0 fetched in 63ms
2026-07-24T11:51:55.2406629Z 1271 silly pacote range manifest for path-dirname@^1.0.0 fetched in 23ms
2026-07-24T11:51:55.2406839Z 1272 silly pacote range manifest for binary-extensions@^1.0.0 fetched in 29ms
2026-07-24T11:51:55.2407083Z 1273 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/camelcase 21ms (from cache)
2026-07-24T11:51:55.2407306Z 1274 silly pacote range manifest for on-finished@~2.3.0 fetched in 5ms
2026-07-24T11:51:55.2407486Z 1275 silly pacote range manifest for ms@^2.1.3 fetched in 4ms
2026-07-24T11:51:55.2407723Z 1276 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/encodeurl 11ms (from cache)
2026-07-24T11:51:55.2407977Z 1277 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/bindings 20ms (from cache)
2026-07-24T11:51:55.2408144Z 1278 silly pacote version manifest for ms@2.0.0 fetched in 6ms
2026-07-24T11:51:55.2408277Z 1279 silly pacote range manifest for camelcase@^5.0.0 fetched in 26ms
2026-07-24T11:51:55.2408515Z 1280 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/escape-html 9ms (from cache)
2026-07-24T11:51:55.2408840Z 1281 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/statuses 16ms (from cache)
2026-07-24T11:51:55.2409007Z 1282 silly pacote range manifest for encodeurl@~1.0.2 fetched in 20ms
2026-07-24T11:51:55.2409151Z 1283 silly pacote range manifest for bindings@^1.5.0 fetched in 27ms
2026-07-24T11:51:55.2409362Z 1284 silly pacote range manifest for escape-html@~1.0.3 fetched in 16ms
2026-07-24T11:51:55.2409512Z 1285 silly pacote range manifest for statuses@~1.5.0 fetched in 23ms
2026-07-24T11:51:55.2409743Z 1286 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/pseudomap 12ms (from cache)
2026-07-24T11:51:55.2410000Z 1287 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/buffer-fill 11ms (from cache)
2026-07-24T11:51:55.2410256Z 1288 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/yallist 14ms (from cache)
2026-07-24T11:51:55.2410524Z 1289 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/buffer-alloc-unsafe 12ms (from cache)
2026-07-24T11:51:55.2410694Z 1290 silly pacote range manifest for pseudomap@^1.0.2 fetched in 16ms
2026-07-24T11:51:55.2410933Z 1291 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/call-bound 9ms (from cache)
2026-07-24T11:51:55.2411188Z 1292 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/isarray 9ms (from cache)
2026-07-24T11:51:55.2411417Z 1293 silly pacote range manifest for buffer-fill@^1.0.0 fetched in 16ms
2026-07-24T11:51:55.2411558Z 1294 silly pacote range manifest for yallist@^2.1.2 fetched in 20ms
2026-07-24T11:51:55.2411771Z 1295 silly pacote range manifest for buffer-alloc-unsafe@^1.1.0 fetched in 18ms
2026-07-24T11:51:55.2411981Z 1296 silly pacote range manifest for strip-ansi@^5.1.0 fetched in 4ms
2026-07-24T11:51:55.2412222Z 1297 silly pacote range manifest for call-bound@^1.0.3 fetched in 13ms
2026-07-24T11:51:55.2412366Z 1298 silly pacote version manifest for isarray@2.0.1 fetched in 14ms
2026-07-24T11:51:55.2412609Z 1299 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/safe-regex-test 11ms (from cache)
2026-07-24T11:51:55.2412869Z 1300 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/punycode 16ms (from cache)
2026-07-24T11:51:55.2413095Z 1301 silly pacote range manifest for safe-regex-test@^1.1.0 fetched in 18ms
2026-07-24T11:51:55.2413337Z 1302 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fs-extra 43ms (from cache)
2026-07-24T11:51:55.2413499Z 1303 silly pacote range manifest for punycode@^1.4.1 fetched in 25ms
2026-07-24T11:51:55.2413733Z 1304 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/builtins 16ms (from cache)
2026-07-24T11:51:55.2413989Z 1305 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/base64id 14ms (from cache)
2026-07-24T11:51:55.2414243Z 1306 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/execa 105ms (from cache)
2026-07-24T11:51:55.2414463Z 1307 silly pacote range manifest for fs-extra@^7.0.1 fetched in 55ms
2026-07-24T11:51:55.2414598Z 1308 silly pacote range manifest for builtins@^1.0.3 fetched in 24ms
2026-07-24T11:51:55.2414840Z 1309 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/emoji-regex 26ms (from cache)
2026-07-24T11:51:55.2415010Z 1310 silly pacote version manifest for base64id@1.0.0 fetched in 24ms
2026-07-24T11:51:55.2415190Z 1311 silly pacote range manifest for execa@^1.0.0 fetched in 115ms
2026-07-24T11:51:55.2415427Z 1312 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cookie 29ms (from cache)
2026-07-24T11:51:55.2415682Z 1313 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/accepts 31ms (from cache)
2026-07-24T11:51:55.2415905Z 1314 silly pacote range manifest for os-tmpdir@^1.0.0 fetched in 10ms
2026-07-24T11:51:55.2416111Z 1315 silly pacote range manifest for emoji-regex@^7.0.1 fetched in 37ms
2026-07-24T11:51:55.2416362Z 1316 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/component-emitter 21ms (from cache)
2026-07-24T11:51:55.2416528Z 1317 silly pacote version manifest for cookie@0.3.1 fetched in 37ms
2026-07-24T11:51:55.2416669Z 1318 silly pacote range manifest for accepts@~1.3.4 fetched in 38ms
2026-07-24T11:51:55.2416903Z 1319 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/backo2 12ms (from cache)
2026-07-24T11:51:55.2417156Z 1320 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/indexof 12ms (from cache)
2026-07-24T11:51:55.2417418Z 1321 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/os-homedir 18ms (from cache)
2026-07-24T11:51:55.2417648Z 1322 silly pacote version manifest for component-emitter@1.2.1 fetched in 27ms
2026-07-24T11:51:55.2417796Z 1323 silly pacote version manifest for backo2@1.0.2 fetched in 17ms
2026-07-24T11:51:55.2418029Z 1324 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/parseqs 11ms (from cache)
2026-07-24T11:51:55.2418286Z 1325 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/has-cors 10ms (from cache)
2026-07-24T11:51:55.2418523Z 1326 silly pacote version manifest for indexof@0.0.1 fetched in 18ms
2026-07-24T11:51:55.2418900Z 1327 silly pacote range manifest for os-homedir@^1.0.0 fetched in 23ms
2026-07-24T11:51:55.2419262Z 1328 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/engine.io-parser 38ms (from cache)
2026-07-24T11:51:55.2419511Z 1329 silly pacote version manifest for parseqs@0.0.5 fetched in 17ms
2026-07-24T11:51:55.2419829Z 1330 silly pacote version manifest for has-cors@1.1.0 fetched in 15ms
2026-07-24T11:51:55.2420118Z 1331 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/to-array 12ms (from cache)
2026-07-24T11:51:55.2420376Z 1332 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/parseuri 13ms (from cache)
2026-07-24T11:51:55.2420668Z 1333 silly pacote range manifest for engine.io-parser@~2.1.0 fetched in 45ms
2026-07-24T11:51:55.2420918Z 1334 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/component-bind 14ms (from cache)
2026-07-24T11:51:55.2421146Z 1335 silly pacote range manifest for mime-types@~2.1.24 fetched in 7ms
2026-07-24T11:51:55.2421346Z 1336 silly pacote version manifest for to-array@0.1.4 fetched in 20ms
2026-07-24T11:51:55.2421492Z 1337 silly pacote version manifest for parseuri@0.0.5 fetched in 20ms
2026-07-24T11:51:55.2421738Z 1338 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/object-component 11ms (from cache)
2026-07-24T11:51:55.2422014Z 1339 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/base64-arraybuffer 12ms (from cache)
2026-07-24T11:51:55.2422250Z 1340 silly pacote version manifest for component-bind@1.0.0 fetched in 18ms
2026-07-24T11:51:55.2422401Z 1341 silly pacote range manifest for resolve@^1.1.6 fetched in 3ms
2026-07-24T11:51:55.2422544Z 1342 silly pacote range manifest for depd@~2.0.0 fetched in 4ms
2026-07-24T11:51:55.2422680Z 1343 silly pacote range manifest for inherits@~2.0.4 fetched in 3ms
2026-07-24T11:51:55.2422895Z 1344 silly pacote version manifest for object-component@0.0.3 fetched in 15ms
2026-07-24T11:51:55.2423137Z 1345 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/media-typer 14ms (from cache)
2026-07-24T11:51:55.2423377Z 1346 silly pacote version manifest for base64-arraybuffer@0.1.5 fetched in 17ms
2026-07-24T11:51:55.2423651Z 1347 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ee-first 13ms (from cache)
2026-07-24T11:51:55.2423930Z 1348 silly pacote range manifest for statuses@~2.0.2 fetched in 6ms
2026-07-24T11:51:55.2424250Z 1349 silly pacote range manifest for ansi-regex@^4.1.0 fetched in 5ms
2026-07-24T11:51:55.2424558Z 1350 silly pacote version manifest for media-typer@0.3.0 fetched in 19ms
2026-07-24T11:51:55.2424808Z 1351 silly pacote version manifest for ee-first@1.1.1 fetched in 17ms
2026-07-24T11:51:55.2425057Z 1352 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/setprototypeof 9ms (from cache)
2026-07-24T11:51:55.2425222Z 1353 silly pacote range manifest for yallist@^3.0.2 fetched in 3ms
2026-07-24T11:51:55.2425463Z 1354 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/toidentifier 11ms (from cache)
2026-07-24T11:51:55.2425688Z 1355 silly pacote range manifest for iconv-lite@^0.4.24 fetched in 5ms
2026-07-24T11:51:55.2425835Z 1356 silly pacote range manifest for setprototypeof@~1.2.0 fetched in 16ms
2026-07-24T11:51:55.2426077Z 1357 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/es-define-property 12ms (from cache)
2026-07-24T11:51:55.2426251Z 1358 silly pacote range manifest for tmp@^0.0.33 fetched in 5ms
2026-07-24T11:51:55.2426490Z 1359 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/side-channel 15ms (from cache)
2026-07-24T11:51:55.2426751Z 1360 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/restore-cursor 12ms (from cache)
2026-07-24T11:51:55.2426924Z 1361 silly pacote range manifest for toidentifier@~1.0.1 fetched in 17ms
2026-07-24T11:51:55.2427142Z 1362 silly pacote range manifest for es-define-property@^1.0.1 fetched in 16ms
2026-07-24T11:51:55.2427362Z 1363 silly pacote range manifest for hosted-git-info@^2.7.1 fetched in 3ms
2026-07-24T11:51:55.2427577Z 1364 silly pacote range manifest for side-channel@^1.1.1 fetched in 19ms
2026-07-24T11:51:55.2427784Z 1365 silly pacote range manifest for restore-cursor@^2.0.0 fetched in 16ms
2026-07-24T11:51:55.2428027Z 1366 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/safer-buffer 10ms (from cache)
2026-07-24T11:51:55.2428283Z 1367 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/chardet 18ms (from cache)
2026-07-24T11:51:55.2428540Z 1368 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/genfun 12ms (from cache)
2026-07-24T11:51:55.2428853Z 1369 silly pacote range manifest for safer-buffer@>= 2.1.2 < 3 fetched in 15ms
2026-07-24T11:51:55.2429065Z 1370 silly pacote range manifest for chardet@^0.7.0 fetched in 23ms
2026-07-24T11:51:55.2429340Z 1371 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/flush-write-stream 9ms (from cache)
2026-07-24T11:51:55.2429577Z 1372 silly pacote range manifest for genfun@^5.0.0 fetched in 15ms
2026-07-24T11:51:55.2429949Z 1373 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/end-of-stream 12ms (from cache)
2026-07-24T11:51:55.2430393Z 1374 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/concat-stream 14ms (from cache)
2026-07-24T11:51:55.2430721Z 1375 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/from2 11ms (from cache)
2026-07-24T11:51:55.2430957Z 1376 silly pacote range manifest for flush-write-stream@^1.0.0 fetched in 14ms
2026-07-24T11:51:55.2431170Z 1377 silly pacote range manifest for end-of-stream@^1.1.0 fetched in 16ms
2026-07-24T11:51:55.2431385Z 1378 silly pacote range manifest for concat-stream@^1.5.0 fetched in 18ms
2026-07-24T11:51:55.2431527Z 1379 silly pacote range manifest for from2@^2.1.0 fetched in 14ms
2026-07-24T11:51:55.2431764Z 1380 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/duplexify 18ms (from cache)
2026-07-24T11:51:55.2432035Z 1381 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/parallel-transform 11ms (from cache)
2026-07-24T11:51:55.2432212Z 1382 silly pacote range manifest for duplexify@^3.4.2 fetched in 23ms
2026-07-24T11:51:55.2432445Z 1383 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/pump 15ms (from cache)
2026-07-24T11:51:55.2432730Z 1384 silly pacote range manifest for parallel-transform@^1.1.0 fetched in 17ms
2026-07-24T11:51:55.2432972Z 1385 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/pumpify 16ms (from cache)
2026-07-24T11:51:55.2433227Z 1386 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/stream-each 13ms (from cache)
2026-07-24T11:51:55.2433417Z 1387 silly pacote range manifest for pump@^3.0.0 fetched in 20ms
2026-07-24T11:51:55.2433646Z 1388 silly pacote range manifest for pumpify@^1.3.3 fetched in 19ms
2026-07-24T11:51:55.2433991Z 1389 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/err-code 14ms (from cache)
2026-07-24T11:51:55.2434308Z 1390 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/retry 16ms (from cache)
2026-07-24T11:51:55.2434609Z 1391 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/ws 118ms (from cache)
2026-07-24T11:51:55.2434840Z 1392 silly pacote range manifest for stream-each@^1.1.0 fetched in 32ms
2026-07-24T11:51:55.2435043Z 1393 silly pacote range manifest for err-code@^1.0.0 fetched in 32ms
2026-07-24T11:51:55.2435307Z 1394 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/unique-slug 27ms (from cache)
2026-07-24T11:51:55.2435547Z 1395 silly pacote range manifest for retry@^0.10.0 fetched in 36ms
2026-07-24T11:51:55.2435693Z 1396 silly pacote range manifest for ws@~3.3.1 fetched in 137ms
2026-07-24T11:51:55.2436043Z 1397 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/engine.io-client 92ms (from cache)
2026-07-24T11:51:55.2436286Z 1398 silly pacote range manifest for yallist@^3.0.0 fetched in 19ms
2026-07-24T11:51:55.2436503Z 1399 silly pacote range manifest for semver@^5.4.1 fetched in 18ms
2026-07-24T11:51:55.2436799Z 1400 silly pacote range manifest for unique-slug@^2.0.0 fetched in 45ms
2026-07-24T11:51:55.2437140Z 1401 silly pacote range manifest for npm-package-arg@^6.0.0 fetched in 17ms
2026-07-24T11:51:55.2437529Z 1402 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/npm-normalize-package-bin 38ms (from cache)
2026-07-24T11:51:55.2437891Z 1403 silly pacote range manifest for engine.io-client@~3.2.0 fetched in 108ms
2026-07-24T11:51:55.2438130Z 1404 silly pacote range manifest for glob@^7.1.4 fetched in 8ms
2026-07-24T11:51:55.2438484Z 1405 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ignore-walk 47ms (from cache)
2026-07-24T11:51:55.2438835Z 1406 silly pacote range manifest for bluebird@^3.5.5 fetched in 7ms
2026-07-24T11:51:55.2439250Z 1407 silly pacote range manifest for graceful-fs@^4.1.15 fetched in 8ms
2026-07-24T11:51:55.2439615Z 1408 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/npm-bundled 46ms (from cache)
2026-07-24T11:51:55.2439983Z 1409 silly pacote range manifest for npm-normalize-package-bin@^1.0.1 fetched in 47ms
2026-07-24T11:51:55.2440210Z 1410 silly pacote range manifest for semver@^5.0.0 fetched in 7ms
2026-07-24T11:51:55.2440516Z 1411 silly pacote range manifest for ignore-walk@^3.0.1 fetched in 54ms
2026-07-24T11:51:55.2440732Z 1412 silly pacote range manifest for semver@2 || 3 || 4 || 5 fetched in 5ms
2026-07-24T11:51:55.2441030Z 1413 silly pacote range manifest for npm-bundled@^1.0.1 fetched in 51ms
2026-07-24T11:51:55.2441234Z 1414 silly pacote range manifest for resolve@^1.10.0 fetched in 4ms
2026-07-24T11:51:55.2441550Z 1415 silly pacote range manifest for hosted-git-info@^2.1.4 fetched in 6ms
2026-07-24T11:51:55.2441938Z 1416 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/chownr 17ms (from cache)
2026-07-24T11:51:55.2442306Z 1417 silly pacote range manifest for figgy-pudding@^3.4.1 fetched in 7ms
2026-07-24T11:51:55.2442654Z 1418 silly pacote range manifest for make-fetch-happen@^4.0.2 fetched in 5ms
2026-07-24T11:51:55.2443040Z 1419 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/amdefine 16ms (from cache)
2026-07-24T11:51:55.2443289Z 1420 silly pacote range manifest for ssri@^6.0.0 fetched in 4ms
2026-07-24T11:51:55.2443517Z 1421 silly pacote range manifest for chownr@^1.1.1 fetched in 24ms
2026-07-24T11:51:55.2444029Z 1422 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/validate-npm-package-license 14ms (from cache)
2026-07-24T11:51:55.2444311Z 1423 silly pacote range manifest for cacache@^11.3.3 fetched in 5ms
2026-07-24T11:51:55.2444679Z 1424 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/prr 10ms (from cache)
2026-07-24T11:51:55.2444946Z 1425 silly pacote range manifest for amdefine@>=0.0.4 fetched in 21ms
2026-07-24T11:51:55.2445295Z 1426 silly pacote range manifest for validate-npm-package-license@^3.0.1 fetched in 18ms
2026-07-24T11:51:55.2445528Z 1427 silly pacote range manifest for prr@~1.0.1 fetched in 15ms
2026-07-24T11:51:55.2446314Z 1428 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/JSONStream 19ms (from cache)
2026-07-24T11:51:55.2446730Z 1429 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/through2 85ms (from cache)
2026-07-24T11:51:55.2447136Z 1430 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/http-proxy-agent 14ms (from cache)
2026-07-24T11:51:55.2447319Z 1431 silly pacote range manifest for JSONStream@^1.3.4 fetched in 25ms
2026-07-24T11:51:55.2447561Z 1432 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/asap 10ms (from cache)
2026-07-24T11:51:55.2447729Z 1433 silly pacote range manifest for through2@^2.0.0 fetched in 91ms
2026-07-24T11:51:55.2447967Z 1434 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/globule 11ms (from cache)
2026-07-24T11:51:55.2448203Z 1435 silly pacote range manifest for http-proxy-agent@^2.1.0 fetched in 19ms
2026-07-24T11:51:55.2448452Z 1436 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/http-cache-semantics 15ms (from cache)
2026-07-24T11:51:55.2448732Z 1437 silly pacote range manifest for asap@~2.0.3 fetched in 16ms
2026-07-24T11:51:55.2448985Z 1438 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/agentkeepalive 25ms (from cache)
2026-07-24T11:51:55.2449258Z 1439 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/move-concurrently 45ms (from cache)
2026-07-24T11:51:55.2449529Z 1440 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/socks-proxy-agent 23ms (from cache)
2026-07-24T11:51:55.2449698Z 1441 silly pacote range manifest for minimist@^1.1.3 fetched in 8ms
2026-07-24T11:51:55.2449841Z 1442 silly pacote range manifest for globule@^1.0.0 fetched in 22ms
2026-07-24T11:51:55.2450158Z 1443 silly pacote range manifest for http-cache-semantics@^3.8.1 fetched in 26ms
2026-07-24T11:51:55.2450453Z 1444 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/redent 17ms (from cache)
2026-07-24T11:51:55.2450707Z 1445 silly pacote range manifest for decamelize@^1.1.2 fetched in 9ms
2026-07-24T11:51:55.2451039Z 1446 silly pacote range manifest for move-concurrently@^1.0.1 fetched in 53ms
2026-07-24T11:51:55.2451363Z 1447 warn deprecated move-concurrently@1.0.1: This package is no longer supported.
2026-07-24T11:51:55.2451601Z 1448 silly pacote range manifest for agentkeepalive@^3.4.1 fetched in 35ms
2026-07-24T11:51:55.2451917Z 1449 silly pacote range manifest for socks-proxy-agent@^4.0.0 fetched in 33ms
2026-07-24T11:51:55.2452271Z 1450 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/map-obj 21ms (from cache)
2026-07-24T11:51:55.2452525Z 1451 silly pacote range manifest for redent@^1.0.0 fetched in 24ms
2026-07-24T11:51:55.2452753Z 1452 silly pacote range manifest for normalize-package-data@^2.3.4 fetched in 6ms
2026-07-24T11:51:55.2452972Z 1453 silly pacote range manifest for emojis-list@^3.0.0 fetched in 8ms
2026-07-24T11:51:55.2453118Z 1454 silly pacote range manifest for lodash@^4.0.0 fetched in 5ms
2026-07-24T11:51:55.2453321Z 1455 silly pacote range manifest for map-obj@^1.0.1 fetched in 26ms
2026-07-24T11:51:55.2453462Z 1456 silly pacote range manifest for yargs@^7.0.0 fetched in 6ms
2026-07-24T11:51:55.2453697Z 1457 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/trim-newlines 16ms (from cache)
2026-07-24T11:51:55.2453932Z 1458 silly pacote range manifest for readable-stream@^2.0.1 fetched in 7ms
2026-07-24T11:51:55.2454252Z 1459 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/read-pkg-up 20ms (from cache)
2026-07-24T11:51:55.2454419Z 1460 silly pacote range manifest for chownr@^1.1.4 fetched in 9ms
2026-07-24T11:51:55.2454661Z 1461 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/loud-rejection 18ms (from cache)
2026-07-24T11:51:55.2454829Z 1462 silly pacote range manifest for mkdirp@^0.5.5 fetched in 10ms
2026-07-24T11:51:55.2454967Z 1463 silly pacote range manifest for yallist@^3.1.1 fetched in 7ms
2026-07-24T11:51:55.2455166Z 1464 silly pacote range manifest for trim-newlines@^1.0.0 fetched in 26ms
2026-07-24T11:51:55.2455313Z 1465 silly pacote range manifest for minipass@^2.9.0 fetched in 7ms
2026-07-24T11:51:55.2455519Z 1466 silly pacote range manifest for read-pkg-up@^1.0.1 fetched in 27ms
2026-07-24T11:51:55.2455763Z 1467 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/node-fetch-npm 57ms (from cache)
2026-07-24T11:51:55.2456032Z 1468 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/scss-tokenizer 18ms (from cache)
2026-07-24T11:51:55.2456263Z 1469 silly pacote range manifest for loud-rejection@^1.0.0 fetched in 25ms
2026-07-24T11:51:55.2456508Z 1470 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/camelcase-keys 29ms (from cache)
2026-07-24T11:51:55.2456729Z 1471 silly pacote range manifest for safe-buffer@^5.2.1 fetched in 8ms
2026-07-24T11:51:55.2456878Z 1472 silly pacote range manifest for which@^1.2.9 fetched in 8ms
2026-07-24T11:51:55.2457083Z 1473 silly pacote range manifest for lru-cache@^4.0.1 fetched in 10ms
2026-07-24T11:51:55.2457292Z 1474 silly pacote range manifest for node-fetch-npm@^2.0.2 fetched in 66ms
2026-07-24T11:51:55.2457560Z 1475 warn deprecated node-fetch-npm@2.0.4: This module is not used anymore, npm uses minipass-fetch for its fetch implementation now
2026-07-24T11:51:55.2457738Z 1476 silly pacote range manifest for punycode@^2.1.0 fetched in 8ms
2026-07-24T11:51:55.2457969Z 1477 silly pacote range manifest for scss-tokenizer@^0.2.3 fetched in 29ms
2026-07-24T11:51:55.2458176Z 1478 silly pacote range manifest for camelcase-keys@^2.0.0 fetched in 39ms
2026-07-24T11:51:55.2458386Z 1479 silly pacote range manifest for set-blocking@~2.0.0 fetched in 7ms
2026-07-24T11:51:55.2458531Z 1480 silly pacote range manifest for tar@^2.0.0 fetched in 5ms
2026-07-24T11:51:55.2458878Z 1481 warn deprecated tar@2.2.2: Old versions of tar are not supported, and contain widely publicized security vulnerabilities, which have been fixed in the current version. Please update. Support for old versions may be purchased (at exorbitant rates) by contacting i@izs.me
2026-07-24T11:51:55.2459118Z 1482 silly pacote range manifest for osenv@0 fetched in 5ms
2026-07-24T11:51:55.2459253Z 1483 silly pacote range manifest for which@1 fetched in 4ms
2026-07-24T11:51:55.2459394Z 1484 silly pacote range manifest for npmlog@0 || 1 || 2 || 3 || 4 fetched in 5ms
2026-07-24T11:51:55.2459641Z 1485 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fs-minipass 21ms (from cache)
2026-07-24T11:51:55.2459906Z 1486 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/minizlib 24ms (from cache)
2026-07-24T11:51:55.2460070Z 1487 silly pacote range manifest for rimraf@2 fetched in 7ms
2026-07-24T11:51:55.2460462Z 1488 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/console-control-strings 13ms (from cache)
2026-07-24T11:51:55.2460651Z 1489 silly pacote range manifest for semver@~5.3.0 fetched in 7ms
2026-07-24T11:51:55.2460863Z 1490 silly pacote range manifest for fs-minipass@^1.2.7 fetched in 27ms
2026-07-24T11:51:55.2461015Z 1491 silly pacote range manifest for minizlib@^1.3.3 fetched in 30ms
2026-07-24T11:51:55.2461231Z 1492 silly pacote range manifest for console-control-strings@~1.1.0 fetched in 18ms
2026-07-24T11:51:55.2461477Z 1493 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/nopt 22ms (from cache)
2026-07-24T11:51:55.2461781Z 1494 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/picocolors 13ms (from cache)
2026-07-24T11:51:55.2462041Z 1495 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/for-own 12ms (from cache)
2026-07-24T11:51:55.2462205Z 1496 silly pacote range manifest for nopt@2 || 3 fetched in 27ms
2026-07-24T11:51:55.2462346Z 1497 silly pacote range manifest for picocolors@^0.2.1 fetched in 17ms
2026-07-24T11:51:55.2462588Z 1498 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ajv-errors 15ms (from cache)
2026-07-24T11:51:55.2462855Z 1499 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-plain-object 14ms (from cache)
2026-07-24T11:51:55.2463077Z 1500 silly pacote range manifest for for-own@^1.0.0 fetched in 18ms
2026-07-24T11:51:55.2463220Z 1501 silly pacote range manifest for pify@^2.3.0 fetched in 6ms
2026-07-24T11:51:55.2463459Z 1502 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/shallow-clone 14ms (from cache)
2026-07-24T11:51:55.2463627Z 1503 silly pacote range manifest for upath@^1.0.5 fetched in 4ms
2026-07-24T11:51:55.2463833Z 1504 silly pacote range manifest for ajv-errors@^1.0.0 fetched in 22ms
2026-07-24T11:51:55.2464074Z 1505 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/kind-of 19ms (from cache)
2026-07-24T11:51:55.2464306Z 1506 silly pacote range manifest for is-plain-object@^2.0.4 fetched in 25ms
2026-07-24T11:51:55.2464450Z 1507 silly pacote range manifest for braces@^2.3.0 fetched in 9ms
2026-07-24T11:51:55.2464594Z 1508 silly pacote range manifest for fsevents@^1.2.2 fetched in 8ms
2026-07-24T11:51:55.2464733Z 1509 silly pacote range manifest for inherits@^2.0.1 fetched in 8ms
2026-07-24T11:51:55.2464940Z 1510 silly pacote range manifest for shallow-clone@^1.0.0 fetched in 23ms
2026-07-24T11:51:55.2465093Z 1511 silly pacote range manifest for readdirp@^2.0.0 fetched in 9ms
2026-07-24T11:51:55.2465296Z 1512 silly pacote range manifest for kind-of@^6.0.0 fetched in 27ms
2026-07-24T11:51:55.2465494Z 1513 silly pacote range manifest for async-each@^1.0.0 fetched in 4ms
2026-07-24T11:51:55.2465741Z 1514 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/import-cwd 6ms (from cache)
2026-07-24T11:51:55.2466004Z 1515 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/infer-owner 6ms (from cache)
2026-07-24T11:51:55.2466272Z 1516 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/are-we-there-yet 52ms (from cache)
2026-07-24T11:51:55.2466537Z 1517 silly pacote range manifest for import-cwd@^2.0.0 fetched in 8ms
2026-07-24T11:51:55.2466780Z 1518 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/lodash.debounce 9ms (from cache)
2026-07-24T11:51:55.2467012Z 1519 silly pacote range manifest for infer-owner@^1.0.3 fetched in 9ms
2026-07-24T11:51:55.2467228Z 1520 silly pacote range manifest for are-we-there-yet@~1.1.2 fetched in 56ms
2026-07-24T11:51:55.2467448Z 1521 warn deprecated are-we-there-yet@1.1.7: This package is no longer supported.
2026-07-24T11:51:55.2467696Z 1522 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/gauge 61ms (from cache)
2026-07-24T11:51:55.2467868Z 1523 silly pacote range manifest for lodash.debounce@^4.0.8 fetched in 16ms
2026-07-24T11:51:55.2468012Z 1524 silly pacote range manifest for gauge@~2.7.3 fetched in 66ms
2026-07-24T11:51:55.2468161Z 1525 warn deprecated gauge@2.7.4: This package is no longer supported.
2026-07-24T11:51:55.2468382Z 1526 silly pacote range manifest for istanbul-lib-coverage@^1.2.1 fetched in 3ms
2026-07-24T11:51:55.2468527Z 1527 silly pacote range manifest for ajv@^5.0.0 fetched in 3ms
2026-07-24T11:51:55.2468839Z 1528 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ansi-colors 17ms (from cache)
2026-07-24T11:51:55.2469097Z 1529 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/fstream 54ms (from cache)
2026-07-24T11:51:55.2469325Z 1530 silly pacote range manifest for ansi-colors@^3.0.0 fetched in 22ms
2026-07-24T11:51:55.2469526Z 1531 silly pacote range manifest for make-dir@^2.0.0 fetched in 3ms
2026-07-24T11:51:55.2469705Z 1532 silly pacote range manifest for fstream@^1.0.0 fetched in 58ms
2026-07-24T11:51:55.2469850Z 1533 warn deprecated fstream@1.0.12: This package is no longer supported.
2026-07-24T11:51:55.2470090Z 1534 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/babel-types 25ms (from cache)
2026-07-24T11:51:55.2470354Z 1535 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/babel-template 20ms (from cache)
2026-07-24T11:51:55.2470621Z 1536 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cosmiconfig 33ms (from cache)
2026-07-24T11:51:55.2470875Z 1537 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/pkg-dir 18ms (from cache)
2026-07-24T11:51:55.2471039Z 1538 silly pacote range manifest for errno@~0.1.7 fetched in 8ms
2026-07-24T11:51:55.2471245Z 1539 silly pacote range manifest for babel-types@^6.18.0 fetched in 36ms
2026-07-24T11:51:55.2471458Z 1540 silly pacote range manifest for babel-template@^6.16.0 fetched in 30ms
2026-07-24T11:51:55.2471721Z 1541 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fsource-list-map 15ms (from cache)
2026-07-24T11:51:55.2471890Z 1542 silly pacote range manifest for cosmiconfig@^5.0.0 fetched in 40ms
2026-07-24T11:51:55.2472093Z 1543 silly pacote range manifest for pkg-dir@^3.0.0 fetched in 23ms
2026-07-24T11:51:55.2472330Z 1544 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/commondir 17ms (from cache)
2026-07-24T11:51:55.2472498Z 1545 silly pacote range manifest for globby@^6.1.0 fetched in 5ms
2026-07-24T11:51:55.2472737Z 1546 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/babel-traverse 34ms (from cache)
2026-07-24T11:51:55.2472971Z 1547 silly pacote range manifest for @types/source-list-map@* fetched in 22ms
2026-07-24T11:51:55.2473122Z 1548 silly pacote range manifest for commondir@^1.0.1 fetched in 24ms
2026-07-24T11:51:55.2473329Z 1549 silly pacote range manifest for babel-traverse@^6.18.0 fetched in 39ms
2026-07-24T11:51:55.2473579Z 1550 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/babel-generator 38ms (from cache)
2026-07-24T11:51:55.2473744Z 1551 silly pacote range manifest for errno@^0.1.3 fetched in 8ms
2026-07-24T11:51:55.2473977Z 1552 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/slash 18ms (from cache)
2026-07-24T11:51:55.2474141Z 1553 silly pacote range manifest for decamelize@^2.0.0 fetched in 8ms
2026-07-24T11:51:55.2474382Z 1554 silly pacote range manifest for yargs-parser@^10.1.0 fetched in 9ms
2026-07-24T11:51:55.2474622Z 1555 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/dir-glob 17ms (from cache)
2026-07-24T11:51:55.2474850Z 1556 silly pacote range manifest for babel-generator@^6.18.0 fetched in 48ms
2026-07-24T11:51:55.2475094Z 1557 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/array-union 18ms (from cache)
2026-07-24T11:51:55.2475323Z 1558 silly pacote range manifest for source-map@~0.4.1 fetched in 8ms
2026-07-24T11:51:55.2475465Z 1559 silly pacote range manifest for slash@^1.0.0 fetched in 25ms
2026-07-24T11:51:55.2475672Z 1560 silly pacote range manifest for source-list-map@~0.1.7 fetched in 9ms
2026-07-24T11:51:55.2475817Z 1561 silly pacote range manifest for qs@^6.12.3 fetched in 7ms
2026-07-24T11:51:55.2476019Z 1562 silly pacote range manifest for dir-glob@^2.0.0 fetched in 26ms
2026-07-24T11:51:55.2476219Z 1563 silly pacote range manifest for array-union@^1.0.1 fetched in 26ms
2026-07-24T11:51:55.2476460Z 1564 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/p-try 10ms (from cache)
2026-07-24T11:51:55.2476722Z 1565 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/dns-equal 6ms (from cache)
2026-07-24T11:51:55.2476986Z 1566 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/array-flatten 11ms (from cache)
2026-07-24T11:51:55.2477242Z 1567 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/dns-txt 7ms (from cache)
2026-07-24T11:51:55.2477515Z 1568 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/multicast-dns-service-types 6ms (from cache)
2026-07-24T11:51:55.2477771Z 1569 silly pacote range manifest for p-try@^2.0.0 fetched in 13ms
2026-07-24T11:51:55.2477966Z 1570 silly pacote range manifest for dns-equal@^1.0.0 fetched in 9ms
2026-07-24T11:51:55.2478180Z 1571 silly pacote range manifest for array-flatten@^2.1.0 fetched in 13ms
2026-07-24T11:51:55.2478383Z 1572 silly pacote range manifest for dns-txt@^2.0.2 fetched in 10ms
2026-07-24T11:51:55.2478653Z 1573 silly pacote range manifest for multicast-dns-service-types@^1.1.0 fetched in 9ms
2026-07-24T11:51:55.2478920Z 1574 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/deep-equal 15ms (from cache)
2026-07-24T11:51:55.2479081Z 1575 silly pacote range manifest for uuid@^3.0.1 fetched in 3ms
2026-07-24T11:51:55.2479223Z 1576 silly pacote range manifest for async@^3.2.6 fetched in 4ms
2026-07-24T11:51:55.2479457Z 1577 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/multicast-dns 13ms (from cache)
2026-07-24T11:51:55.2479725Z 1578 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/babylon 81ms (from cache)
2026-07-24T11:51:55.2479889Z 1579 silly pacote range manifest for debug@^4.3.6 fetched in 17ms
2026-07-24T11:51:55.2480095Z 1580 silly pacote range manifest for deep-equal@^1.0.1 fetched in 31ms
2026-07-24T11:51:55.2480334Z 1581 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ignore 56ms (from cache)
2026-07-24T11:51:55.2480568Z 1582 silly pacote range manifest for multicast-dns@^7.2.3 fetched in 34ms
2026-07-24T11:51:55.2480715Z 1583 silly pacote range manifest for babylon@^6.18.0 fetched in 101ms
2026-07-24T11:51:55.2480943Z 1584 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/p-map 67ms (from cache)
2026-07-24T11:51:55.2481207Z 1585 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/faye-websocket 31ms (from cache)
2026-07-24T11:51:55.2481371Z 1586 silly pacote range manifest for ignore@^3.3.5 fetched in 68ms
2026-07-24T11:51:55.2481515Z 1587 silly pacote version manifest for bytes@3.1.2 fetched in 6ms
2026-07-24T11:51:55.2481714Z 1588 silly pacote range manifest for p-map@^1.1.1 fetched in 73ms
2026-07-24T11:51:55.2481928Z 1589 silly pacote range manifest for faye-websocket@^0.10.0 fetched in 35ms
2026-07-24T11:51:55.2482293Z 1590 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/resolve-cwd 16ms (from cache)
2026-07-24T11:51:55.2482732Z 1591 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/vary 16ms (from cache)
2026-07-24T11:51:55.2483072Z 1592 silly pacote version manifest for safe-buffer@5.2.1 fetched in 3ms
2026-07-24T11:51:55.2483441Z 1593 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ipaddr.js 35ms (from cache)
2026-07-24T11:51:55.2483678Z 1594 silly pacote range manifest for accepts@~1.3.8 fetched in 4ms
2026-07-24T11:51:55.2483892Z 1595 silly pacote range manifest for resolve-cwd@^2.0.0 fetched in 22ms
2026-07-24T11:51:55.2484037Z 1596 silly pacote range manifest for vary@~1.1.2 fetched in 22ms
2026-07-24T11:51:55.2484279Z 1597 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/negotiator 16ms (from cache)
2026-07-24T11:51:55.2484443Z 1598 silly pacote range manifest for ipaddr.js@^1.5.2 fetched in 42ms
2026-07-24T11:51:55.2484685Z 1599 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/on-headers 13ms (from cache)
2026-07-24T11:51:55.2484918Z 1600 silly pacote range manifest for http-errors@~1.8.0 fetched in 7ms
2026-07-24T11:51:55.2485128Z 1601 silly pacote range manifest for mime-types@~2.1.35 fetched in 6ms
2026-07-24T11:51:55.2485275Z 1602 silly pacote range manifest for debug@^4.1.0 fetched in 6ms
2026-07-24T11:51:55.2485516Z 1603 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/default-gateway 43ms (from cache)
2026-07-24T11:51:55.2485684Z 1604 silly pacote range manifest for negotiator@~0.6.4 fetched in 25ms
2026-07-24T11:51:55.2485885Z 1605 silly pacote range manifest for on-headers@~1.1.0 fetched in 20ms
2026-07-24T11:51:55.2486124Z 1606 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/batch 15ms (from cache)
2026-07-24T11:51:55.2486400Z 1607 silly pacote range manifest for default-gateway@^2.6.0 fetched in 50ms
2026-07-24T11:51:55.2486648Z 1608 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/compressible 21ms (from cache)
2026-07-24T11:51:55.2486812Z 1609 silly pacote range manifest for debug@^3.2.5 fetched in 5ms
2026-07-24T11:51:55.2486959Z 1610 silly pacote version manifest for batch@0.6.1 fetched in 20ms
2026-07-24T11:51:55.2487201Z 1611 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/handle-thing 13ms (from cache)
2026-07-24T11:51:55.2487458Z 1612 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/select-hose 11ms (from cache)
2026-07-24T11:51:55.2487692Z 1613 silly pacote range manifest for faye-websocket@~0.11.1 fetched in 4ms
2026-07-24T11:51:55.2487845Z 1614 silly pacote range manifest for compressible@~2.0.18 fetched in 26ms
2026-07-24T11:51:55.2488092Z 1615 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/http-deceiver 14ms (from cache)
2026-07-24T11:51:55.2488326Z 1616 silly pacote range manifest for handle-thing@^2.0.0 fetched in 18ms
2026-07-24T11:51:55.2488536Z 1617 silly pacote range manifest for select-hose@^2.0.0 fetched in 17ms
2026-07-24T11:51:55.2488760Z 1618 silly pacote range manifest for commander@^2.20.0 fetched in 4ms
2026-07-24T11:51:55.2488969Z 1619 silly pacote range manifest for http-deceiver@^1.2.7 fetched in 19ms
2026-07-24T11:51:55.2489188Z 1620 silly pacote range manifest for source-map-support@~0.5.12 fetched in 7ms
2026-07-24T11:51:55.2489408Z 1621 silly pacote range manifest for base64-arraybuffer@^0.1.5 fetched in 7ms
2026-07-24T11:51:55.2489623Z 1622 silly pacote range manifest for http-proxy@^1.16.2 fetched in 8ms
2026-07-24T11:51:55.2489861Z 1623 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/json3 17ms (from cache)
2026-07-24T11:51:55.2490125Z 1624 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/spdy-transport 25ms (from cache)
2026-07-24T11:51:55.2490347Z 1625 silly pacote range manifest for micromatch@^3.1.9 fetched in 7ms
2026-07-24T11:51:55.2490566Z 1626 silly pacote range manifest for base64-arraybuffer@^1.0.2 fetched in 4ms
2026-07-24T11:51:55.2490771Z 1627 silly pacote range manifest for crc-32@~1.2.0 fetched in 4ms
2026-07-24T11:51:55.2490916Z 1628 silly pacote range manifest for json3@^3.3.2 fetched in 22ms
2026-07-24T11:51:55.2491163Z 1629 silly pacote range manifest for spdy-transport@^3.0.0 fetched in 30ms
2026-07-24T11:51:55.2491406Z 1630 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/eventsource 30ms (from cache)
2026-07-24T11:51:55.2491633Z 1631 silly pacote range manifest for fs-extra@^8.1.0 fetched in 7ms
2026-07-24T11:51:55.2491780Z 1632 silly pacote range manifest for eventsource@^1.0.7 fetched in 37ms
2026-07-24T11:51:55.2492014Z 1633 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/url-parse 32ms (from cache)
2026-07-24T11:51:55.2492269Z 1634 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/frac 16ms (from cache)
2026-07-24T11:51:55.2492547Z 1635 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/default-require-extensions 14ms (from cache)
2026-07-24T11:51:55.2492816Z 1636 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/etag 15ms (from cache)
2026-07-24T11:51:55.2492980Z 1637 silly pacote range manifest for cookie@~0.7.1 fetched in 6ms
2026-07-24T11:51:55.2493218Z 1638 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/node-forge 81ms (from cache)
2026-07-24T11:51:55.2493444Z 1639 silly pacote range manifest for url-parse@^1.4.3 fetched in 44ms
2026-07-24T11:51:55.2493583Z 1640 silly pacote range manifest for frac@~1.1.2 fetched in 26ms
2026-07-24T11:51:55.2493805Z 1641 silly pacote range manifest for default-require-extensions@^2.0.0 fetched in 23ms
2026-07-24T11:51:55.2493958Z 1642 silly pacote range manifest for etag@~1.8.1 fetched in 24ms
2026-07-24T11:51:55.2494192Z 1643 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fresh 16ms (from cache)
2026-07-24T11:51:55.2494471Z 1644 silly pacote range manifest for node-forge@^0.10.0 fetched in 89ms
2026-07-24T11:51:55.2494619Z 1645 silly pacote range manifest for statuses@~2.0.1 fetched in 4ms
2026-07-24T11:51:55.2494764Z 1646 silly pacote range manifest for encodeurl@~2.0.0 fetched in 6ms
2026-07-24T11:51:55.2494962Z 1647 silly pacote range manifest for body-parser@~1.20.5 fetched in 5ms
2026-07-24T11:51:55.2495110Z 1648 silly pacote range manifest for fresh@~0.5.2 fetched in 22ms
2026-07-24T11:51:55.2495314Z 1649 silly pacote range manifest for http-errors@~2.0.0 fetched in 5ms
2026-07-24T11:51:55.2495524Z 1650 silly pacote range manifest for content-type@~1.0.4 fetched in 4ms
2026-07-24T11:51:55.2495762Z 1651 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/methods 16ms (from cache)
2026-07-24T11:51:55.2495927Z 1652 silly pacote range manifest for finalhandler@~1.3.1 fetched in 5ms
2026-07-24T11:51:55.2496164Z 1653 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/color-name 53ms (from cache)
2026-07-24T11:51:55.2496386Z 1654 silly pacote range manifest for range-parser@~1.2.1 fetched in 5ms
2026-07-24T11:51:55.2496599Z 1655 silly pacote version manifest for array-flatten@1.1.1 fetched in 5ms
2026-07-24T11:51:55.2496749Z 1656 silly pacote range manifest for methods@~1.1.2 fetched in 21ms
2026-07-24T11:51:55.2496981Z 1657 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/send 38ms (from cache)
2026-07-24T11:51:55.2497151Z 1658 silly pacote version manifest for setprototypeof@1.2.0 fetched in 8ms
2026-07-24T11:51:55.2497361Z 1659 silly pacote range manifest for color-name@^1.0.0 fetched in 62ms
2026-07-24T11:51:55.2497600Z 1660 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/color-name 59ms (from cache)
2026-07-24T11:51:55.2497850Z 1661 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/proxy-addr 22ms (from cache)
2026-07-24T11:51:55.2498040Z 1662 silly pacote range manifest for send@~0.19.0 fetched in 47ms
2026-07-24T11:51:55.2498373Z 1663 silly pacote range manifest for caniuse-lite@^1.0.30001806 fetched in 4ms
2026-07-24T11:51:55.2498762Z 1664 silly pacote version manifest for color-name@1.1.3 fetched in 66ms
2026-07-24T11:51:55.2499075Z 1665 silly pacote range manifest for proxy-addr@~2.0.7 fetched in 27ms
2026-07-24T11:51:55.2499416Z 1666 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cookie-signature 15ms (from cache)
2026-07-24T11:51:55.2499837Z 1667 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/merge-descriptors 16ms (from cache)
2026-07-24T11:51:55.2500157Z 1668 silly pacote range manifest for cookie-signature@~1.0.6 fetched in 20ms
2026-07-24T11:51:55.2500467Z 1669 silly pacote range manifest for brace-expansion@^5.0.5 fetched in 4ms
2026-07-24T11:51:55.2500846Z 1670 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/content-disposition 21ms (from cache)
2026-07-24T11:51:55.2501256Z 1671 silly pacote version manifest for merge-descriptors@1.0.3 fetched in 24ms
2026-07-24T11:51:55.2501526Z 1672 silly pacote range manifest for @babel/types@^7.29.7 fetched in 7ms
2026-07-24T11:51:55.2501769Z 1673 silly pacote range manifest for @babel/parser@^7.29.7 fetched in 8ms
2026-07-24T11:51:55.2502138Z 1674 silly pacote range manifest for content-disposition@~0.5.4 fetched in 28ms
2026-07-24T11:51:55.2502532Z 1675 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/serve-static 36ms (from cache)
2026-07-24T11:51:55.2502909Z 1676 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/update-browserslist-db 23ms (from cache)
2026-07-24T11:51:55.2503233Z 1677 silly pacote range manifest for serve-static@~1.16.2 fetched in 44ms
2026-07-24T11:51:55.2503531Z 1678 silly pacote range manifest for update-browserslist-db@^1.2.3 fetched in 28ms
2026-07-24T11:51:55.2503876Z 1679 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/es6-promisify 17ms (from cache)
2026-07-24T11:51:55.2504264Z 1680 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/path-to-regexp 55ms (from cache)
2026-07-24T11:51:55.2504641Z 1681 silly pacote range manifest for es6-promisify@^5.0.0 fetched in 35ms
2026-07-24T11:51:55.2504960Z 1682 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/text-hex 22ms (from cache)
2026-07-24T11:51:55.2505274Z 1683 silly pacote range manifest for path-to-regexp@~0.1.12 fetched in 70ms
2026-07-24T11:51:55.2505658Z 1684 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@babel%2fhelper-string-parser 42ms (from cache)
2026-07-24T11:51:55.2505852Z 1685 silly pacote range manifest for sax@^1.1.4 fetched in 8ms
2026-07-24T11:51:55.2506097Z 1686 silly pacote range manifest for text-hex@1.0.x fetched in 36ms
2026-07-24T11:51:55.2506334Z 1687 silly pacote range manifest for @babel/helper-string-parser@^7.29.7 fetched in 56ms
2026-07-24T11:51:55.2506613Z 1688 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@babel%2fhelper-validator-identifier 52ms (from cache)
2026-07-24T11:51:55.2506788Z 1689 silly pacote range manifest for acorn@^2.4.0 fetched in 19ms
2026-07-24T11:51:55.2507020Z 1690 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/node-releases 87ms (from cache)
2026-07-24T11:51:55.2507281Z 1691 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/color 70ms (from cache)
2026-07-24T11:51:55.2507447Z 1692 silly pacote range manifest for parse5@^1.5.1 fetched in 30ms
2026-07-24T11:51:55.2507679Z 1693 silly pacote range manifest for @babel/helper-validator-identifier@^7.29.7 fetched in 91ms
2026-07-24T11:51:55.2507939Z 1694 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@babel%2fcode-frame 98ms (from cache)
2026-07-24T11:51:55.2508109Z 1695 silly pacote range manifest for request@^2.55.0 fetched in 25ms
2026-07-24T11:51:55.2508345Z 1696 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/abab 83ms (from cache)
2026-07-24T11:51:55.2508624Z 1697 silly pacote range manifest for node-releases@^2.0.51 fetched in 145ms
2026-07-24T11:51:55.2508782Z 1698 silly pacote range manifest for color@^5.0.2 fetched in 116ms
2026-07-24T11:51:55.2508999Z 1699 silly pacote range manifest for @babel/code-frame@^7.29.7 fetched in 129ms
2026-07-24T11:51:55.2509147Z 1700 silly pacote range manifest for abab@^1.0.0 fetched in 90ms
2026-07-24T11:51:55.2509376Z 1701 warn deprecated abab@1.0.4: Use your platform's native atob() and btoa() methods instead
2026-07-24T11:51:55.2509642Z 1702 silly pacote range manifest for iconv-lite@^0.4.13 fetched in 6ms
2026-07-24T11:51:55.2509881Z 1703 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cssom 80ms (from cache)
2026-07-24T11:51:55.2510042Z 1704 silly pacote range manifest for cssom@>= 0.3.0 < 0.4.0 fetched in 85ms
2026-07-24T11:51:55.2510252Z 1705 silly pacote range manifest for tough-cookie@^2.2.0 fetched in 3ms
2026-07-24T11:51:55.2510488Z 1706 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/nwmatcher 34ms (from cache)
2026-07-24T11:51:55.2510747Z 1707 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/array-equal 10ms (from cache)
2026-07-24T11:51:55.2510919Z 1708 silly pacote range manifest for nwmatcher@>= 1.3.7 < 2.0.0 fetched in 37ms
2026-07-24T11:51:55.2511130Z 1709 silly pacote range manifest for array-equal@^1.0.0 fetched in 13ms
2026-07-24T11:51:55.2511373Z 1710 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/symbol-tree 13ms (from cache)
2026-07-24T11:51:55.2511632Z 1711 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/escodegen 43ms (from cache)
2026-07-24T11:51:55.2511873Z 1712 silly pacote range manifest for symbol-tree@>= 3.1.0 < 4.0.0 fetched in 19ms
2026-07-24T11:51:55.2512129Z 1713 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/webidl-conversions 12ms (from cache)
2026-07-24T11:51:55.2512302Z 1714 silly pacote range manifest for escodegen@^1.6.1 fetched in 49ms
2026-07-24T11:51:55.2512546Z 1715 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/acorn-globals 16ms (from cache)
2026-07-24T11:51:55.2512840Z 1716 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cssstyle 59ms (from cache)
2026-07-24T11:51:55.2513109Z 1717 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/xml-name-validator 16ms (from cache)
2026-07-24T11:51:55.2513343Z 1718 silly pacote range manifest for webidl-conversions@^3.0.1 fetched in 22ms
2026-07-24T11:51:55.2513560Z 1719 silly pacote range manifest for acorn-globals@^1.0.4 fetched in 24ms
2026-07-24T11:51:55.2513800Z 1720 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/whatwg-url 35ms (from cache)
2026-07-24T11:51:55.2513974Z 1721 silly pacote range manifest for cssstyle@>= 0.2.34 < 0.3.0 fetched in 71ms
2026-07-24T11:51:55.2514203Z 1722 silly pacote range manifest for xml-name-validator@>= 2.0.1 < 3.0.0 fetched in 26ms
2026-07-24T11:51:55.2514445Z 1723 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/jsesc 25ms (from cache)
2026-07-24T11:51:55.2514605Z 1724 silly pacote range manifest for debug@^4.3.1 fetched in 10ms
2026-07-24T11:51:55.2514805Z 1725 silly pacote range manifest for whatwg-url@^2.0.1 fetched in 44ms
2026-07-24T11:51:55.2514953Z 1726 silly pacote range manifest for @babel/template@^7.29.7 fetched in 5ms
2026-07-24T11:51:55.2515102Z 1727 silly pacote range manifest for @babel/generator@^7.29.7 fetched in 5ms
2026-07-24T11:51:55.2515248Z 1728 silly pacote range manifest for jsesc@^3.0.2 fetched in 31ms
2026-07-24T11:51:55.2515457Z 1729 silly pacote range manifest for safe-buffer@~5.2.0 fetched in 4ms
2026-07-24T11:51:55.2515602Z 1730 silly pacote range manifest for isarray@~1.0.0 fetched in 4ms
2026-07-24T11:51:55.2515854Z 1731 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@jridgewell%2fgen-mapping 26ms (from cache)
2026-07-24T11:51:55.2516023Z 1732 silly pacote range manifest for inherits@~2.0.3 fetched in 5ms
2026-07-24T11:51:55.2516229Z 1733 silly pacote range manifest for safe-buffer@~5.1.1 fetched in 5ms
2026-07-24T11:51:55.2516484Z 1734 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@babel%2fhelper-globals 14ms (from cache)
2026-07-24T11:51:55.2516752Z 1735 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/pinkie 12ms (from cache)
2026-07-24T11:51:55.2517012Z 1736 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-path-inside 11ms (from cache)
2026-07-24T11:51:55.2517255Z 1737 silly pacote range manifest for @jridgewell/gen-mapping@^0.3.12 fetched in 32ms
2026-07-24T11:51:55.2517436Z 1738 silly pacote range manifest for string_decoder@~1.1.1 fetched in 6ms
2026-07-24T11:51:55.2517647Z 1739 silly pacote range manifest for util-deprecate@~1.0.1 fetched in 5ms
2026-07-24T11:51:55.2517886Z 1740 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/core-util-is 11ms (from cache)
2026-07-24T11:51:55.2518131Z 1741 silly pacote range manifest for @babel/helper-globals@^7.29.7 fetched in 20ms
2026-07-24T11:51:55.2518283Z 1742 silly pacote range manifest for pinkie@^2.0.0 fetched in 17ms
2026-07-24T11:51:55.2518492Z 1743 silly pacote range manifest for is-path-inside@^1.0.0 fetched in 17ms
2026-07-24T11:51:55.2518768Z 1744 silly pacote range manifest for fast-deep-equal@^3.1.1 fetched in 5ms
2026-07-24T11:51:55.2518982Z 1745 silly pacote range manifest for core-util-is@~1.0.0 fetched in 16ms
2026-07-24T11:51:55.2519124Z 1746 silly pacote range manifest for chokidar@^3.4.1 fetched in 5ms
2026-07-24T11:51:55.2519380Z 1747 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@jridgewell%2ftrace-mapping 38ms (from cache)
2026-07-24T11:51:55.2519660Z 1748 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/process-nextick-args 15ms (from cache)
2026-07-24T11:51:55.2519827Z 1749 silly pacote range manifest for braces@^2.3.1 fetched in 9ms
2026-07-24T11:51:55.2520071Z 1750 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/watchpack-chokidar2 15ms (from cache)
2026-07-24T11:51:55.2520384Z 1751 silly pacote range manifest for @jridgewell/trace-mapping@^0.3.28 fetched in 48ms
2026-07-24T11:51:55.2520622Z 1752 silly pacote range manifest for process-nextick-args@~2.0.0 fetched in 21ms
2026-07-24T11:51:55.2520866Z 1753 silly pacote range manifest for kind-of@^6.0.2 fetched in 2ms
2026-07-24T11:51:55.2521102Z 1754 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/esrecurse 17ms (from cache)
2026-07-24T11:51:55.2521341Z 1755 silly pacote range manifest for watchpack-chokidar2@^2.0.1 fetched in 20ms
2026-07-24T11:51:55.2521584Z 1756 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/immediate 22ms (from cache)
2026-07-24T11:51:55.2521811Z 1757 silly pacote range manifest for to-regex@^3.0.2 fetched in 4ms
2026-07-24T11:51:55.2521955Z 1758 silly pacote range manifest for esrecurse@^4.1.0 fetched in 22ms
2026-07-24T11:51:55.2522161Z 1759 silly pacote range manifest for regex-not@^1.0.0 fetched in 5ms
2026-07-24T11:51:55.2522399Z 1760 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/extglob 20ms (from cache)
2026-07-24T11:51:55.2522652Z 1761 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/estraverse 23ms (from cache)
2026-07-24T11:51:55.2522823Z 1762 silly pacote range manifest for immediate@~3.0.5 fetched in 29ms
2026-07-24T11:51:55.2523078Z 1763 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/baseline-browser-mapping 232ms (from cache)
2026-07-24T11:51:55.2523325Z 1764 silly pacote range manifest for serialize-javascript@^4.0.0 fetched in 10ms
2026-07-24T11:51:55.2523571Z 1765 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/arr-diff 19ms (from cache)
2026-07-24T11:51:55.2523739Z 1766 silly pacote range manifest for extglob@^2.0.4 fetched in 31ms
2026-07-24T11:51:55.2523884Z 1767 silly pacote range manifest for estraverse@^4.1.1 fetched in 34ms
2026-07-24T11:51:55.2524105Z 1768 silly pacote range manifest for baseline-browser-mapping@^2.10.44 fetched in 241ms
2026-07-24T11:51:55.2524353Z 1769 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/object.pick 17ms (from cache)
2026-07-24T11:51:55.2524617Z 1770 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fragment-cache 17ms (from cache)
2026-07-24T11:51:55.2524847Z 1771 silly pacote range manifest for arr-diff@^4.0.0 fetched in 25ms
2026-07-24T11:51:55.2524998Z 1772 silly pacote range manifest for object.pick@^1.3.0 fetched in 21ms
2026-07-24T11:51:55.2525209Z 1773 silly pacote range manifest for fragment-cache@^0.2.1 fetched in 21ms
2026-07-24T11:51:55.2525356Z 1774 silly pacote range manifest for punycode@^1.2.4 fetched in 4ms
2026-07-24T11:51:55.2525615Z 1775 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/util 19ms (from cache)
2026-07-24T11:51:55.2525872Z 1776 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/nanomatch 29ms (from cache)
2026-07-24T11:51:55.2526127Z 1777 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/assert 15ms (from cache)
2026-07-24T11:51:55.2526382Z 1778 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/process 13ms (from cache)
2026-07-24T11:51:55.2526543Z 1779 silly pacote range manifest for util@^0.11.0 fetched in 26ms
2026-07-24T11:51:55.2526777Z 1780 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/events 16ms (from cache)
2026-07-24T11:51:55.2526938Z 1781 silly pacote range manifest for nanomatch@^1.2.9 fetched in 37ms
2026-07-24T11:51:55.2527074Z 1782 silly pacote range manifest for assert@^1.1.1 fetched in 21ms
2026-07-24T11:51:55.2527215Z 1783 silly pacote range manifest for process@^0.11.10 fetched in 18ms
2026-07-24T11:51:55.2527356Z 1784 silly pacote range manifest for events@^3.0.0 fetched in 19ms
2026-07-24T11:51:55.2527596Z 1785 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/os-browserify 13ms (from cache)
2026-07-24T11:51:55.2527766Z 1786 silly pacote range manifest for string_decoder@^1.0.0 fetched in 3ms
2026-07-24T11:51:55.2528013Z 1787 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/vm-browserify 14ms (from cache)
2026-07-24T11:51:55.2528242Z 1788 silly pacote range manifest for os-browserify@^0.3.0 fetched in 17ms
2026-07-24T11:51:55.2528504Z 1789 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/tty-browserify 6ms (from cache)
2026-07-24T11:51:55.2528798Z 1790 silly pacote range manifest for vm-browserify@^1.0.1 fetched in 18ms
2026-07-24T11:51:55.2529045Z 1791 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/stream-http 20ms (from cache)
2026-07-24T11:51:55.2529279Z 1792 silly pacote range manifest for readable-stream@^2.3.3 fetched in 3ms
2026-07-24T11:51:55.2529528Z 1793 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/browserify-zlib 10ms (from cache)
2026-07-24T11:51:55.2529758Z 1794 silly pacote version manifest for tty-browserify@0.0.0 fetched in 11ms
2026-07-24T11:51:55.2530006Z 1795 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/path-browserify 10ms (from cache)
2026-07-24T11:51:55.2530273Z 1796 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/querystring-es3 9ms (from cache)
2026-07-24T11:51:55.2530495Z 1797 silly pacote range manifest for stream-http@^2.7.2 fetched in 26ms
2026-07-24T11:51:55.2530711Z 1798 silly pacote range manifest for browserify-zlib@^0.2.0 fetched in 13ms
2026-07-24T11:51:55.2530926Z 1799 silly pacote version manifest for path-browserify@0.0.1 fetched in 14ms
2026-07-24T11:51:55.2531143Z 1800 silly pacote range manifest for querystring-es3@^0.2.0 fetched in 13ms
2026-07-24T11:51:55.2531390Z 1801 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/https-browserify 9ms (from cache)
2026-07-24T11:51:55.2531627Z 1802 silly pacote range manifest for https-browserify@^1.0.0 fetched in 11ms
2026-07-24T11:51:55.2531877Z 1803 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/stream-browserify 8ms (from cache)
2026-07-24T11:51:55.2532133Z 1804 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/buffer 40ms (from cache)
2026-07-24T11:51:55.2532399Z 1805 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/console-browserify 12ms (from cache)
2026-07-24T11:51:55.2532672Z 1806 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/constants-browserify 12ms (from cache)
2026-07-24T11:51:55.2532911Z 1807 silly pacote range manifest for stream-browserify@^2.0.1 fetched in 17ms
2026-07-24T11:51:55.2533158Z 1808 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/function-bind 13ms (from cache)
2026-07-24T11:51:55.2533324Z 1809 silly pacote range manifest for buffer@^4.3.0 fetched in 49ms
2026-07-24T11:51:55.2533574Z 1810 silly pacote range manifest for console-browserify@^1.1.0 fetched in 19ms
2026-07-24T11:51:55.2533791Z 1811 silly pacote range manifest for constants-browserify@^1.0.0 fetched in 19ms
2026-07-24T11:51:55.2534005Z 1812 silly pacote range manifest for is-extendable@^1.0.1 fetched in 6ms
2026-07-24T11:51:55.2534217Z 1813 silly pacote range manifest for function-bind@^1.1.2 fetched in 19ms
2026-07-24T11:51:55.2534465Z 1814 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/timers-browserify 23ms (from cache)
2026-07-24T11:51:55.2534732Z 1815 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/assign-symbols 20ms (from cache)
2026-07-24T11:51:55.2535003Z 1816 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/crypto-browserify 30ms (from cache)
2026-07-24T11:51:55.2535169Z 1817 silly pacote range manifest for tapable@^1.0.0 fetched in 9ms
2026-07-24T11:51:55.2535364Z 1818 silly pacote range manifest for memory-fs@^0.4.0 fetched in 5ms
2026-07-24T11:51:55.2535578Z 1819 silly pacote range manifest for timers-browserify@^2.0.4 fetched in 31ms
2026-07-24T11:51:55.2535787Z 1820 silly pacote range manifest for assign-symbols@^1.0.0 fetched in 26ms
2026-07-24T11:51:55.2536005Z 1821 silly pacote range manifest for crypto-browserify@^3.11.0 fetched in 36ms
2026-07-24T11:51:55.2536212Z 1822 silly pacote range manifest for kind-of@^3.0.2 fetched in 3ms
2026-07-24T11:51:55.2536453Z 1823 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-descriptor 16ms (from cache)
2026-07-24T11:51:55.2536681Z 1824 silly pacote range manifest for is-descriptor@^1.0.2 fetched in 18ms
2026-07-24T11:51:55.2536938Z 1825 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ret 9ms (from cache)
2026-07-24T11:51:55.2537101Z 1826 silly pacote range manifest for ret@~0.1.10 fetched in 12ms
2026-07-24T11:51:55.2537320Z 1827 silly pacote range manifest for is-descriptor@^0.1.0 fetched in 0ms
2026-07-24T11:51:55.2537590Z 1828 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fhelper-wasm-bytecode 23ms (from cache)
2026-07-24T11:51:55.2537885Z 1829 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fwast-parser 29ms (from cache)
2026-07-24T11:51:55.2538154Z 1830 silly pacote version manifest for @webassemblyjs/helper-wasm-bytecode@1.7.11 fetched in 29ms
2026-07-24T11:51:55.2538395Z 1831 silly pacote version manifest for @webassemblyjs/wast-parser@1.7.11 fetched in 32ms
2026-07-24T11:51:55.2538715Z 1832 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fwasm-opt 18ms (from cache)
2026-07-24T11:51:55.2539004Z 1833 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fwasm-gen 20ms (from cache)
2026-07-24T11:51:55.2539256Z 1834 silly pacote version manifest for @webassemblyjs/wasm-opt@1.7.11 fetched in 23ms
2026-07-24T11:51:55.2539528Z 1835 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fwast-printer 23ms (from cache)
2026-07-24T11:51:55.2539784Z 1836 silly pacote version manifest for @webassemblyjs/wasm-gen@1.7.11 fetched in 28ms
2026-07-24T11:51:55.2540052Z 1837 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fhelper-buffer 24ms (from cache)
2026-07-24T11:51:55.2540310Z 1838 silly pacote version manifest for @webassemblyjs/wast-printer@1.7.11 fetched in 29ms
2026-07-24T11:51:55.2540544Z 1839 silly pacote version manifest for @webassemblyjs/helper-buffer@1.7.11 fetched in 28ms
2026-07-24T11:51:55.2540810Z 1840 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2futf8 23ms (from cache)
2026-07-24T11:51:55.2541064Z 1841 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/atob 6ms (from cache)
2026-07-24T11:51:55.2541354Z 1842 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fhelper-wasm-section 29ms (from cache)
2026-07-24T11:51:55.2541631Z 1843 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/resolve-url 6ms (from cache)
2026-07-24T11:51:55.2541838Z 1844 silly pacote version manifest for @webassemblyjs/utf8@1.7.11 fetched in 29ms
2026-07-24T11:51:55.2542100Z 1845 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fieee754 21ms (from cache)
2026-07-24T11:51:55.2542267Z 1846 silly pacote range manifest for atob@^2.1.2 fetched in 12ms
2026-07-24T11:51:55.2542498Z 1847 silly pacote version manifest for @webassemblyjs/helper-wasm-section@1.7.11 fetched in 35ms
2026-07-24T11:51:55.2542755Z 1848 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/decode-uri-component 12ms (from cache)
2026-07-24T11:51:55.2542995Z 1849 silly pacote range manifest for resolve-url@^0.2.1 fetched in 12ms
2026-07-24T11:51:55.2543228Z 1850 warn deprecated resolve-url@0.2.1: https://github.com/lydell/resolve-url#deprecated
2026-07-24T11:51:55.2543398Z 1851 silly pacote version manifest for @webassemblyjs/ieee754@1.7.11 fetched in 26ms
2026-07-24T11:51:55.2543668Z 1852 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fhelper-api-error 23ms (from cache)
2026-07-24T11:51:55.2543917Z 1853 silly pacote range manifest for decode-uri-component@^0.2.0 fetched in 18ms
2026-07-24T11:51:55.2544137Z 1854 silly pacote range manifest for component-emitter@^1.2.1 fetched in 2ms
2026-07-24T11:51:55.2544369Z 1855 silly pacote version manifest for @webassemblyjs/helper-api-error@1.7.11 fetched in 27ms
2026-07-24T11:51:55.2544617Z 1856 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/source-map-url 11ms (from cache)
2026-07-24T11:51:55.2544876Z 1857 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/urix 9ms (from cache)
2026-07-24T11:51:55.2545131Z 1858 silly pacote range manifest for memory-fs@^0.5.0 fetched in 1ms
2026-07-24T11:51:55.2545343Z 1859 silly pacote range manifest for source-map-url@^0.4.0 fetched in 14ms
2026-07-24T11:51:55.2545579Z 1860 warn deprecated source-map-url@0.4.1: See https://github.com/lydell/source-map-url#deprecated
2026-07-24T11:51:55.2545744Z 1861 silly pacote range manifest for urix@^0.1.0 fetched in 12ms
2026-07-24T11:51:55.2545896Z 1862 warn deprecated urix@0.1.0: Please see https://github.com/lydell/urix#deprecated
2026-07-24T11:51:55.2546152Z 1863 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fleb128 37ms (from cache)
2026-07-24T11:51:55.2546419Z 1864 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/class-utils 13ms (from cache)
2026-07-24T11:51:55.2546680Z 1865 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cache-base 15ms (from cache)
2026-07-24T11:51:55.2546944Z 1866 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/pascalcase 12ms (from cache)
2026-07-24T11:51:55.2547173Z 1867 silly pacote range manifest for mime-types@^2.1.12 fetched in 7ms
2026-07-24T11:51:55.2547327Z 1868 silly pacote version manifest for @webassemblyjs/leb128@1.7.11 fetched in 46ms
2026-07-24T11:51:55.2547571Z 1869 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/mixin-deep 15ms (from cache)
2026-07-24T11:51:55.2547797Z 1870 silly pacote range manifest for class-utils@^0.3.5 fetched in 21ms
2026-07-24T11:51:55.2548009Z 1871 silly pacote range manifest for cache-base@^1.0.1 fetched in 23ms
2026-07-24T11:51:55.2548156Z 1872 silly pacote range manifest for pascalcase@^0.1.1 fetched in 17ms
2026-07-24T11:51:55.2548400Z 1873 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/domain-browser 115ms (from cache)
2026-07-24T11:51:55.2548692Z 1874 silly pacote range manifest for combined-stream@^1.0.6 fetched in 20ms
2026-07-24T11:51:55.2548916Z 1875 silly pacote range manifest for is-descriptor@^1.0.0 fetched in 18ms
2026-07-24T11:51:55.2549127Z 1876 silly pacote range manifest for mixin-deep@^1.2.0 fetched in 35ms
2026-07-24T11:51:55.2549329Z 1877 silly pacote range manifest for ansi-regex@^3.0.0 fetched in 19ms
2026-07-24T11:51:55.2549567Z 1878 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/asynckit 33ms (from cache)
2026-07-24T11:51:55.2549831Z 1879 silly pacote range manifest for domain-browser@^1.1.1 fetched in 135ms
2026-07-24T11:51:55.2549980Z 1880 silly pacote range manifest for punycode@^2.1.1 fetched in 5ms
2026-07-24T11:51:55.2550122Z 1881 silly pacote range manifest for ajv@^6.12.3 fetched in 6ms
2026-07-24T11:51:55.2550319Z 1882 silly pacote range manifest for asynckit@^0.4.0 fetched in 38ms
2026-07-24T11:51:55.2550581Z 1883 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/delayed-stream 25ms (from cache)
2026-07-24T11:51:55.2550805Z 1884 silly pacote range manifest for strip-ansi@^3.0.1 fetched in 2ms
2026-07-24T11:51:55.2551050Z 1885 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/har-schema 9ms (from cache)
2026-07-24T11:51:55.2551283Z 1886 silly pacote range manifest for delayed-stream@~1.0.0 fetched in 28ms
2026-07-24T11:51:55.2551524Z 1887 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/assert-plus 6ms (from cache)
2026-07-24T11:51:55.2551755Z 1888 silly pacote range manifest for string-width@^1.0.1 fetched in 3ms
2026-07-24T11:51:55.2552010Z 1889 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/remove-trailing-separator 7ms (from cache)
2026-07-24T11:51:55.2552241Z 1890 silly pacote range manifest for har-schema@^2.0.0 fetched in 12ms
2026-07-24T11:51:55.2552439Z 1891 silly pacote range manifest for kind-of@^3.2.0 fetched in 3ms
2026-07-24T11:51:55.2552674Z 1892 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/jsprim 10ms (from cache)
2026-07-24T11:51:55.2552929Z 1893 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/mime-db 47ms (from cache)
2026-07-24T11:51:55.2553189Z 1894 silly pacote range manifest for assert-plus@^1.0.0 fetched in 13ms
2026-07-24T11:51:55.2553417Z 1895 silly pacote range manifest for remove-trailing-separator@^1.0.1 fetched in 14ms
2026-07-24T11:51:55.2553632Z 1896 silly pacote range manifest for is-extglob@^2.1.0 fetched in 7ms
2026-07-24T11:51:55.2553866Z 1897 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/psl 23ms (from cache)
2026-07-24T11:51:55.2554024Z 1898 silly pacote range manifest for jsprim@^1.2.2 fetched in 20ms
2026-07-24T11:51:55.2554232Z 1899 silly pacote version manifest for mime-db@1.52.0 fetched in 56ms
2026-07-24T11:51:55.2554470Z 1900 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/sshpk 26ms (from cache)
2026-07-24T11:51:55.2554634Z 1901 silly pacote range manifest for psl@^1.1.28 fetched in 32ms
2026-07-24T11:51:55.2554875Z 1902 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/invert-kv 18ms (from cache)
2026-07-24T11:51:55.2555133Z 1903 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/p-locate 17ms (from cache)
2026-07-24T11:51:55.2555299Z 1904 silly pacote range manifest for sshpk@^1.7.0 fetched in 32ms
2026-07-24T11:51:55.2555532Z 1905 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/path-exists 15ms (from cache)
2026-07-24T11:51:55.2555757Z 1906 silly pacote range manifest for invert-kv@^2.0.0 fetched in 23ms
2026-07-24T11:51:55.2556002Z 1907 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/map-age-cleaner 17ms (from cache)
2026-07-24T11:51:55.2556229Z 1908 silly pacote range manifest for p-locate@^3.0.0 fetched in 22ms
2026-07-24T11:51:55.2556466Z 1909 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/mimic-fn 14ms (from cache)
2026-07-24T11:51:55.2556731Z 1910 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/p-is-promise 13ms (from cache)
2026-07-24T11:51:55.2556963Z 1911 silly pacote range manifest for path-exists@^3.0.0 fetched in 21ms
2026-07-24T11:51:55.2557202Z 1912 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/file-uri-to-path 14ms (from cache)
2026-07-24T11:51:55.2557435Z 1913 silly pacote range manifest for call-bound@^1.0.2 fetched in 4ms
2026-07-24T11:51:55.2557648Z 1914 silly pacote range manifest for map-age-cleaner@^0.1.1 fetched in 22ms
2026-07-24T11:51:55.2557906Z 1915 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/call-bind-apply-helpers 12ms (from cache)
2026-07-24T11:51:55.2558176Z 1916 silly pacote range manifest for mimic-fn@^2.0.0 fetched in 19ms
2026-07-24T11:51:55.2558390Z 1917 silly pacote range manifest for p-is-promise@^2.0.0 fetched in 18ms
2026-07-24T11:51:55.2558669Z 1918 silly pacote version manifest for file-uri-to-path@1.0.0 fetched in 18ms
2026-07-24T11:51:55.2558890Z 1919 silly pacote range manifest for is-stream@^1.1.0 fetched in 2ms
2026-07-24T11:51:55.2559112Z 1920 silly pacote range manifest for call-bind-apply-helpers@^1.0.2 fetched in 16ms
2026-07-24T11:51:55.2559327Z 1921 silly pacote range manifest for get-stream@^4.0.0 fetched in 2ms
2026-07-24T11:51:55.2559537Z 1922 silly pacote range manifest for cross-spawn@^6.0.0 fetched in 3ms
2026-07-24T11:51:55.2559782Z 1923 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/get-intrinsic 14ms (from cache)
2026-07-24T11:51:55.2560041Z 1924 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-regex 11ms (from cache)
2026-07-24T11:51:55.2560301Z 1925 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/strip-eof 10ms (from cache)
2026-07-24T11:51:55.2560565Z 1926 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/universalify 13ms (from cache)
2026-07-24T11:51:55.2560818Z 1927 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/p-finally 11ms (from cache)
2026-07-24T11:51:55.2561049Z 1928 silly pacote range manifest for mime-types@~2.1.34 fetched in 8ms
2026-07-24T11:51:55.2561288Z 1929 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/jsonfile 15ms (from cache)
2026-07-24T11:51:55.2561558Z 1930 silly pacote range manifest for get-intrinsic@^1.3.0 fetched in 23ms
2026-07-24T11:51:55.2561771Z 1931 silly pacote range manifest for is-regex@^1.2.1 fetched in 20ms
2026-07-24T11:51:55.2561974Z 1932 silly pacote range manifest for p-finally@^1.0.0 fetched in 17ms
2026-07-24T11:51:55.2562119Z 1933 silly pacote range manifest for universalify@^0.1.0 fetched in 19ms
2026-07-24T11:51:55.2562318Z 1934 silly pacote range manifest for strip-eof@^1.0.0 fetched in 16ms
2026-07-24T11:51:55.2562465Z 1935 silly pacote version manifest for negotiator@0.6.3 fetched in 4ms
2026-07-24T11:51:55.2562609Z 1936 silly pacote range manifest for jsonfile@^4.0.0 fetched in 22ms
2026-07-24T11:51:55.2562846Z 1937 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/signal-exit 19ms (from cache)
2026-07-24T11:51:55.2563107Z 1938 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/npm-run-path 18ms (from cache)
2026-07-24T11:51:55.2563368Z 1939 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/better-assert 11ms (from cache)
2026-07-24T11:51:55.2563600Z 1940 silly pacote range manifest for npm-run-path@^2.0.0 fetched in 23ms
2026-07-24T11:51:55.2563804Z 1941 silly pacote range manifest for signal-exit@^3.0.0 fetched in 24ms
2026-07-24T11:51:55.2564040Z 1942 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/blob 11ms (from cache)
2026-07-24T11:51:55.2564307Z 1943 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/arraybuffer.slice 11ms (from cache)
2026-07-24T11:51:55.2564579Z 1944 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/side-channel-list 11ms (from cache)
2026-07-24T11:51:55.2564840Z 1945 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/after 14ms (from cache)
2026-07-24T11:51:55.2565070Z 1946 silly pacote range manifest for better-assert@~1.0.0 fetched in 17ms
2026-07-24T11:51:55.2565320Z 1947 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/side-channel-map 12ms (from cache)
2026-07-24T11:51:55.2565480Z 1948 silly pacote version manifest for blob@0.0.5 fetched in 18ms
2026-07-24T11:51:55.2565629Z 1949 silly pacote range manifest for arraybuffer.slice@~0.0.7 fetched in 17ms
2026-07-24T11:51:55.2565846Z 1950 silly pacote range manifest for side-channel-list@^1.0.1 fetched in 18ms
2026-07-24T11:51:55.2565996Z 1951 silly pacote version manifest for after@0.8.2 fetched in 21ms
2026-07-24T11:51:55.2566203Z 1952 silly pacote range manifest for signal-exit@^3.0.2 fetched in 5ms
2026-07-24T11:51:55.2566451Z 1953 silly pacote range manifest for side-channel-map@^1.0.1 fetched in 20ms
2026-07-24T11:51:55.2566668Z 1954 silly pacote range manifest for readable-stream@^2.3.6 fetched in 5ms
2026-07-24T11:51:55.2566914Z 1955 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/side-channel-weakmap 13ms (from cache)
2026-07-24T11:51:55.2567151Z 1956 silly pacote range manifest for readable-stream@^2.2.2 fetched in 6ms
2026-07-24T11:51:55.2567390Z 1957 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/onetime 15ms (from cache)
2026-07-24T11:51:55.2567622Z 1958 silly pacote range manifest for readable-stream@^2.0.0 fetched in 6ms
2026-07-24T11:51:55.2567833Z 1959 silly pacote range manifest for end-of-stream@^1.0.0 fetched in 8ms
2026-07-24T11:51:55.2568049Z 1960 silly pacote range manifest for side-channel-weakmap@^1.0.2 fetched in 21ms
2026-07-24T11:51:55.2568266Z 1961 silly pacote range manifest for readable-stream@^2.1.5 fetched in 7ms
2026-07-24T11:51:55.2568409Z 1962 silly pacote range manifest for onetime@^2.0.0 fetched in 22ms
2026-07-24T11:51:55.2568551Z 1963 silly pacote range manifest for once@^1.3.1 fetched in 6ms
2026-07-24T11:51:55.2568756Z 1964 silly pacote range manifest for duplexify@^3.6.0 fetched in 6ms
2026-07-24T11:51:55.2569007Z 1965 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/stream-shift 13ms (from cache)
2026-07-24T11:51:55.2569267Z 1966 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/typedarray 16ms (from cache)
2026-07-24T11:51:55.2569430Z 1967 silly pacote range manifest for pump@^2.0.0 fetched in 5ms
2026-07-24T11:51:55.2569707Z 1968 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cyclist 13ms (from cache)
2026-07-24T11:51:55.2569935Z 1969 silly pacote range manifest for safe-buffer@~5.1.0 fetched in 4ms
2026-07-24T11:51:55.2570085Z 1970 silly pacote range manifest for typedarray@^0.0.6 fetched in 19ms
2026-07-24T11:51:55.2570292Z 1971 silly pacote range manifest for stream-shift@^1.0.0 fetched in 18ms
2026-07-24T11:51:55.2570441Z 1972 silly pacote range manifest for cyclist@^1.0.1 fetched in 17ms
2026-07-24T11:51:55.2570654Z 1973 silly pacote range manifest for engine.io-parser@~2.1.1 fetched in 4ms
2026-07-24T11:51:55.2570894Z 1974 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ultron 11ms (from cache)
2026-07-24T11:51:55.2571156Z 1975 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/async-limiter 10ms (from cache)
2026-07-24T11:51:55.2571404Z 1976 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/yeast 9ms (from cache)
2026-07-24T11:51:55.2571571Z 1977 silly pacote range manifest for ultron@~1.1.0 fetched in 15ms
2026-07-24T11:51:55.2571777Z 1978 silly pacote range manifest for async-limiter@~1.0.0 fetched in 13ms
2026-07-24T11:51:55.2572019Z 1979 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/imurmurhash 13ms (from cache)
2026-07-24T11:51:55.2572285Z 1980 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/component-inherit 9ms (from cache)
2026-07-24T11:51:55.2572453Z 1981 silly pacote version manifest for yeast@0.1.2 fetched in 12ms
2026-07-24T11:51:55.2572594Z 1982 silly pacote range manifest for through@>=2.2.7 <3 fetched in 3ms
2026-07-24T11:51:55.2572733Z 1983 silly pacote range manifest for imurmurhash@^0.1.4 fetched in 15ms
2026-07-24T11:51:55.2572953Z 1984 silly pacote version manifest for component-inherit@0.0.3 fetched in 12ms
2026-07-24T11:51:55.2573201Z 1985 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/spdx-correct 12ms (from cache)
2026-07-24T11:51:55.2573470Z 1986 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/xmlhttprequest-ssl 14ms (from cache)
2026-07-24T11:51:55.2573637Z 1987 silly pacote version manifest for debug@3.1.0 fetched in 6ms
2026-07-24T11:51:55.2573837Z 1988 silly pacote range manifest for agent-base@4 fetched in 5ms
2026-07-24T11:51:55.2573980Z 1989 silly pacote range manifest for glob@~7.1.1 fetched in 6ms
2026-07-24T11:51:55.2574240Z 1990 warn deprecated glob@7.1.7: Old versions of glob are not supported, and contain widely publicized security vulnerabilities, which have been fixed in the current version. Please update. Support for old versions may be purchased (at exorbitant rates) by contacting i@izs.me
2026-07-24T11:51:55.2574582Z 1991 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/object-inspect 57ms (from cache)
2026-07-24T11:51:55.2574845Z 1992 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/jsonparse 12ms (from cache)
2026-07-24T11:51:55.2575074Z 1993 silly pacote range manifest for spdx-correct@^3.0.0 fetched in 19ms
2026-07-24T11:51:55.2575293Z 1994 silly pacote range manifest for xmlhttprequest-ssl@~1.5.4 fetched in 22ms
2026-07-24T11:51:55.2575442Z 1995 silly pacote range manifest for lodash@^4.17.21 fetched in 9ms
2026-07-24T11:51:55.2575585Z 1996 silly pacote range manifest for minimatch@~3.0.2 fetched in 9ms
2026-07-24T11:51:55.2575795Z 1997 silly pacote range manifest for object-inspect@^1.13.4 fetched in 65ms
2026-07-24T11:51:55.2575943Z 1998 silly pacote range manifest for jsonparse@^1.2.0 fetched in 19ms
2026-07-24T11:51:55.2576176Z 1999 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/xtend 19ms (from cache)
2026-07-24T11:51:55.2576400Z 2000 silly pacote range manifest for agent-base@~4.2.1 fetched in 3ms
2026-07-24T11:51:55.2576543Z 2001 silly pacote range manifest for xtend@~4.0.1 fetched in 23ms
2026-07-24T11:51:55.2576778Z 2002 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/run-queue 13ms (from cache)
2026-07-24T11:51:55.2577062Z 2003 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/aproba 14ms (from cache)
2026-07-24T11:51:55.2577323Z 2004 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/humanize-ms 10ms (from cache)
2026-07-24T11:51:55.2577544Z 2005 silly pacote range manifest for run-queue@^1.0.3 fetched in 16ms
2026-07-24T11:51:55.2577689Z 2006 silly pacote range manifest for aproba@^1.1.1 fetched in 18ms
2026-07-24T11:51:55.2577893Z 2007 silly pacote range manifest for humanize-ms@^1.2.1 fetched in 14ms
2026-07-24T11:51:55.2578037Z 2008 silly pacote range manifest for y18n@^3.2.1 fetched in 3ms
2026-07-24T11:51:55.2578271Z 2009 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/strip-indent 9ms (from cache)
2026-07-24T11:51:55.2578437Z 2010 silly pacote range manifest for cliui@^3.2.0 fetched in 3ms
2026-07-24T11:51:55.2578733Z 2011 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/indent-string 10ms (from cache)
2026-07-24T11:51:55.2578909Z 2012 silly pacote range manifest for camelcase@^3.0.0 fetched in 4ms
2026-07-24T11:51:55.2579115Z 2013 silly pacote range manifest for os-locale@^1.4.0 fetched in 4ms
2026-07-24T11:51:55.2579325Z 2014 silly pacote range manifest for strip-indent@^1.0.1 fetched in 13ms
2026-07-24T11:51:55.2579471Z 2015 silly pacote range manifest for decamelize@^1.1.1 fetched in 3ms
2026-07-24T11:51:55.2579680Z 2016 silly pacote range manifest for indent-string@^2.1.0 fetched in 15ms
2026-07-24T11:51:55.2579937Z 2017 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/spdx-expression-parse 46ms (from cache)
2026-07-24T11:51:55.2580168Z 2018 silly pacote range manifest for string-width@^1.0.2 fetched in 4ms
2026-07-24T11:51:55.2580443Z 2019 silly pacote range manifest for which-module@^1.0.0 fetched in 4ms
2026-07-24T11:51:55.2580652Z 2020 silly pacote range manifest for yargs-parser@^5.0.1 fetched in 4ms
2026-07-24T11:51:55.2580856Z 2021 silly pacote range manifest for find-up@^1.0.0 fetched in 4ms
2026-07-24T11:51:55.2581071Z 2022 silly pacote range manifest for spdx-expression-parse@^3.0.0 fetched in 50ms
2026-07-24T11:51:55.2581285Z 2023 silly pacote range manifest for safe-buffer@^5.1.1 fetched in 2ms
2026-07-24T11:51:55.2581501Z 2024 silly pacote range manifest for json-parse-better-errors@^1.0.0 fetched in 3ms
2026-07-24T11:51:55.2581740Z 2025 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/socks 28ms (from cache)
2026-07-24T11:51:55.2581993Z 2026 silly pacote range manifest for source-map@^0.4.2 fetched in 7ms
2026-07-24T11:51:55.2582197Z 2027 silly pacote range manifest for map-obj@^1.0.0 fetched in 4ms
2026-07-24T11:51:55.2582446Z 2028 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/currently-unhandled 12ms (from cache)
2026-07-24T11:51:55.2582615Z 2029 silly pacote range manifest for socks@~2.3.2 fetched in 35ms
2026-07-24T11:51:55.2582852Z 2030 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/read-pkg 16ms (from cache)
2026-07-24T11:51:55.2583112Z 2031 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/encoding 15ms (from cache)
2026-07-24T11:51:55.2583271Z 2032 silly pacote range manifest for camelcase@^2.0.0 fetched in 5ms
2026-07-24T11:51:55.2583412Z 2033 silly pacote range manifest for fstream@^1.0.12 fetched in 4ms
2026-07-24T11:51:55.2583622Z 2034 silly pacote range manifest for currently-unhandled@^0.4.1 fetched in 19ms
2026-07-24T11:51:55.2583873Z 2035 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/copy-concurrently 46ms (from cache)
2026-07-24T11:51:55.2584102Z 2036 silly pacote range manifest for read-pkg@^1.0.0 fetched in 23ms
2026-07-24T11:51:55.2584248Z 2037 silly pacote range manifest for encoding@^0.1.11 fetched in 22ms
2026-07-24T11:51:55.2584495Z 2038 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/fs-write-stream-atomic 47ms (from cache)
2026-07-24T11:51:55.2584658Z 2039 silly pacote range manifest for minipass@^2.6.0 fetched in 7ms
2026-07-24T11:51:55.2584864Z 2040 silly pacote range manifest for copy-concurrently@^1.0.0 fetched in 53ms
2026-07-24T11:51:55.2585114Z 2041 warn deprecated copy-concurrently@1.0.5: This package is no longer supported.
2026-07-24T11:51:55.2585370Z 2042 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/block-stream 13ms (from cache)
2026-07-24T11:51:55.2585598Z 2043 silly pacote range manifest for is-extendable@^0.1.1 fetched in 5ms
2026-07-24T11:51:55.2585798Z 2044 silly pacote range manifest for kind-of@^5.0.0 fetched in 5ms
2026-07-24T11:51:55.2586017Z 2045 silly pacote range manifest for fs-write-stream-atomic@^1.0.8 fetched in 53ms
2026-07-24T11:51:55.2586240Z 2046 warn deprecated fs-write-stream-atomic@1.0.10: This package is no longer supported.
2026-07-24T11:51:55.2586457Z 2047 silly pacote range manifest for block-stream@* fetched in 18ms
2026-07-24T11:51:55.2586691Z 2048 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/abbrev 14ms (from cache)
2026-07-24T11:51:55.2586921Z 2049 silly pacote range manifest for readable-stream@^2.0.6 fetched in 5ms
2026-07-24T11:51:55.2587069Z 2050 silly pacote range manifest for aproba@^1.0.3 fetched in 5ms
2026-07-24T11:51:55.2587302Z 2051 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/for-in 13ms (from cache)
2026-07-24T11:51:55.2587463Z 2052 silly pacote range manifest for abbrev@1 fetched in 18ms
2026-07-24T11:51:55.2587692Z 2053 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/import-from 10ms (from cache)
2026-07-24T11:51:55.2587952Z 2054 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/delegates 10ms (from cache)
2026-07-24T11:51:55.2588215Z 2055 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/mixin-object 13ms (from cache)
2026-07-24T11:51:55.2588446Z 2056 silly pacote range manifest for object-assign@^4.1.0 fetched in 4ms
2026-07-24T11:51:55.2588735Z 2057 silly pacote range manifest for for-in@^1.0.1 fetched in 19ms
2026-07-24T11:51:55.2588962Z 2058 silly pacote range manifest for console-control-strings@^1.0.0 fetched in 2ms
2026-07-24T11:51:55.2589114Z 2059 silly pacote range manifest for delegates@^1.0.0 fetched in 14ms
2026-07-24T11:51:55.2589314Z 2060 silly pacote range manifest for import-from@^2.1.0 fetched in 14ms
2026-07-24T11:51:55.2589522Z 2061 silly pacote range manifest for mixin-object@^2.0.1 fetched in 18ms
2026-07-24T11:51:55.2589732Z 2062 silly pacote range manifest for fast-deep-equal@^1.0.0 fetched in 3ms
2026-07-24T11:51:55.2589975Z 2063 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/wide-align 13ms (from cache)
2026-07-24T11:51:55.2590267Z 2064 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/has-unicode 10ms (from cache)
2026-07-24T11:51:55.2590433Z 2065 silly pacote range manifest for mkdirp@>=0.5 0 fetched in 5ms
2026-07-24T11:51:55.2590645Z 2066 silly pacote range manifest for json-schema-traverse@^0.3.0 fetched in 5ms
2026-07-24T11:51:55.2590787Z 2067 silly pacote range manifest for inherits@~2.0.0 fetched in 8ms
2026-07-24T11:51:55.2590996Z 2068 silly pacote range manifest for babel-traverse@^6.26.0 fetched in 6ms
2026-07-24T11:51:55.2591206Z 2069 silly pacote range manifest for wide-align@^1.1.0 fetched in 21ms
2026-07-24T11:51:55.2591414Z 2070 silly pacote range manifest for has-unicode@^2.0.0 fetched in 17ms
2026-07-24T11:51:55.2591622Z 2071 silly pacote range manifest for babel-types@^6.26.0 fetched in 7ms
2026-07-24T11:51:55.2591835Z 2072 silly pacote range manifest for babel-code-frame@^6.26.0 fetched in 3ms
2026-07-24T11:51:55.2592073Z 2073 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/co 16ms (from cache)
2026-07-24T11:51:55.2592227Z 2074 silly pacote range manifest for debug@^2.6.8 fetched in 3ms
2026-07-24T11:51:55.2592473Z 2075 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/to-fast-properties 16ms (from cache)
2026-07-24T11:51:55.2592737Z 2076 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-directory 9ms (from cache)
2026-07-24T11:51:55.2592898Z 2077 silly pacote range manifest for co@^4.6.0 fetched in 21ms
2026-07-24T11:51:55.2593135Z 2078 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/import-fresh 12ms (from cache)
2026-07-24T11:51:55.2593397Z 2079 silly pacote range manifest for to-fast-properties@^1.0.3 fetched in 20ms
2026-07-24T11:51:55.2593643Z 2080 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/parse-json 17ms (from cache)
2026-07-24T11:51:55.2593865Z 2081 silly pacote range manifest for is-directory@^0.3.1 fetched in 15ms
2026-07-24T11:51:55.2594013Z 2082 silly pacote range manifest for camelcase@^4.1.0 fetched in 3ms
2026-07-24T11:51:55.2594218Z 2083 silly pacote range manifest for import-fresh@^2.0.0 fetched in 17ms
2026-07-24T11:51:55.2594427Z 2084 silly pacote range manifest for parse-json@^4.0.0 fetched in 20ms
2026-07-24T11:51:55.2594671Z 2085 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/babel-messages 14ms (from cache)
2026-07-24T11:51:55.2594932Z 2086 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/invariant 11ms (from cache)
2026-07-24T11:51:55.2595098Z 2087 silly pacote range manifest for jsesc@^1.3.0 fetched in 4ms
2026-07-24T11:51:55.2595330Z 2088 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/js-base64 68ms (from cache)
2026-07-24T11:51:55.2595560Z 2089 silly pacote range manifest for babel-messages@^6.23.0 fetched in 22ms
2026-07-24T11:51:55.2595709Z 2090 silly pacote range manifest for invariant@^2.2.2 fetched in 17ms
2026-07-24T11:51:55.2595946Z 2091 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/trim-right 10ms (from cache)
2026-07-24T11:51:55.2596173Z 2092 silly pacote range manifest for js-base64@^2.1.8 fetched in 74ms
2026-07-24T11:51:55.2596410Z 2093 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/xregexp 17ms (from cache)
2026-07-24T11:51:55.2596669Z 2094 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/path-type 13ms (from cache)
2026-07-24T11:51:55.2596923Z 2095 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/detect-indent 16ms (from cache)
2026-07-24T11:51:55.2597150Z 2096 silly pacote range manifest for trim-right@^1.0.1 fetched in 17ms
2026-07-24T11:51:55.2597297Z 2097 silly pacote version manifest for xregexp@4.0.0 fetched in 24ms
2026-07-24T11:51:55.2597500Z 2098 silly pacote range manifest for path-type@^3.0.0 fetched in 17ms
2026-07-24T11:51:55.2597738Z 2099 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/array-uniq 15ms (from cache)
2026-07-24T11:51:55.2597967Z 2100 silly pacote range manifest for detect-indent@^4.0.0 fetched in 21ms
2026-07-24T11:51:55.2598239Z 2101 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/buffer-indexof 11ms (from cache)
2026-07-24T11:51:55.2598459Z 2102 silly pacote range manifest for is-regex@^1.1.4 fetched in 5ms
2026-07-24T11:51:55.2598725Z 2103 silly pacote range manifest for array-uniq@^1.0.1 fetched in 19ms
2026-07-24T11:51:55.2598979Z 2104 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-arguments 14ms (from cache)
2026-07-24T11:51:55.2599211Z 2105 silly pacote range manifest for buffer-indexof@^1.0.0 fetched in 16ms
2026-07-24T11:51:55.2599462Z 2106 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-date-object 12ms (from cache)
2026-07-24T11:51:55.2599690Z 2107 silly pacote range manifest for is-arguments@^1.1.1 fetched in 19ms
2026-07-24T11:51:55.2599902Z 2108 silly pacote range manifest for is-date-object@^1.0.5 fetched in 16ms
2026-07-24T11:51:55.2600139Z 2109 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/object-is 12ms (from cache)
2026-07-24T11:51:55.2600398Z 2110 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/thunky 9ms (from cache)
2026-07-24T11:51:55.2600563Z 2111 silly pacote range manifest for depd@~1.1.2 fetched in 3ms
2026-07-24T11:51:55.2600770Z 2112 silly pacote range manifest for object-is@^1.1.5 fetched in 14ms
2026-07-24T11:51:55.2601014Z 2113 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/object-keys 15ms (from cache)
2026-07-24T11:51:55.2601289Z 2114 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/regexp.prototype.flags 13ms (from cache)
2026-07-24T11:51:55.2601494Z 2115 silly pacote range manifest for thunky@^1.0.2 fetched in 13ms
2026-07-24T11:51:55.2601631Z 2116 silly pacote version manifest for inherits@2.0.4 fetched in 4ms
2026-07-24T11:51:55.2601870Z 2117 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/resolve-from 9ms (from cache)
2026-07-24T11:51:55.2602128Z 2118 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/globals 46ms (from cache)
2026-07-24T11:51:55.2602300Z 2119 silly pacote range manifest for statuses@>= 1.5.0 < 2 fetched in 12ms
2026-07-24T11:51:55.2602513Z 2120 silly pacote range manifest for object-keys@^1.1.1 fetched in 28ms
2026-07-24T11:51:55.2602673Z 2121 silly pacote range manifest for regexp.prototype.flags@^1.5.1 fetched in 25ms
2026-07-24T11:51:55.2602947Z 2122 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/websocket-driver 20ms (from cache)
2026-07-24T11:51:55.2603119Z 2123 silly pacote version manifest for toidentifier@1.0.1 fetched in 13ms
2026-07-24T11:51:55.2603268Z 2124 silly pacote range manifest for execa@^0.10.0 fetched in 14ms
2026-07-24T11:51:55.2603499Z 2125 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/dns-packet 27ms (from cache)
2026-07-24T11:51:55.2603731Z 2126 silly pacote range manifest for resolve-from@^3.0.0 fetched in 23ms
2026-07-24T11:51:55.2603879Z 2127 silly pacote range manifest for globals@^9.18.0 fetched in 63ms
2026-07-24T11:51:55.2604093Z 2128 silly pacote range manifest for mime-db@>= 1.43.0 < 2 fetched in 6ms
2026-07-24T11:51:55.2604415Z 2129 silly pacote range manifest for websocket-driver@>=0.5.1 fetched in 29ms
2026-07-24T11:51:55.2604726Z 2130 silly pacote range manifest for dns-packet@^5.2.2 fetched in 34ms
2026-07-24T11:51:55.2604987Z 2131 silly pacote range manifest for readable-stream@^3.0.6 fetched in 5ms
2026-07-24T11:51:55.2605274Z 2132 silly pacote range manifest for graceful-fs@^4.2.0 fetched in 8ms
2026-07-24T11:51:55.2605562Z 2133 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/detect-node 15ms (from cache)
2026-07-24T11:51:55.2605731Z 2134 silly pacote version manifest for ms@2.1.3 fetched in 4ms
2026-07-24T11:51:55.2605968Z 2135 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ip-regex 20ms (from cache)
2026-07-24T11:51:55.2606225Z 2136 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/hpack.js 16ms (from cache)
2026-07-24T11:51:55.2606521Z 2137 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/obuf 15ms (from cache)
2026-07-24T11:51:55.2606684Z 2138 silly pacote version manifest for mime@1.6.0 fetched in 5ms
2026-07-24T11:51:55.2606883Z 2139 silly pacote range manifest for detect-node@^2.0.4 fetched in 21ms
2026-07-24T11:51:55.2607027Z 2140 silly pacote version manifest for destroy@1.2.0 fetched in 3ms
2026-07-24T11:51:55.2607261Z 2141 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/wbuf 16ms (from cache)
2026-07-24T11:51:55.2607487Z 2142 silly pacote range manifest for ip-regex@^2.1.0 fetched in 25ms
2026-07-24T11:51:55.2607637Z 2143 silly pacote range manifest for hpack.js@^2.1.6 fetched in 22ms
2026-07-24T11:51:55.2607879Z 2144 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/querystringify 16ms (from cache)
2026-07-24T11:51:55.2608141Z 2145 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/strip-bom 12ms (from cache)
2026-07-24T11:51:55.2608299Z 2146 silly pacote range manifest for obuf@^1.1.2 fetched in 22ms
2026-07-24T11:51:55.2608447Z 2147 silly pacote version manifest for ipaddr.js@1.9.1 fetched in 4ms
2026-07-24T11:51:55.2608646Z 2148 silly pacote range manifest for wbuf@^1.7.3 fetched in 21ms
2026-07-24T11:51:55.2608869Z 2149 silly pacote range manifest for balanced-match@^4.0.2 fetched in 4ms
2026-07-24T11:51:55.2609014Z 2150 silly pacote range manifest for send@~0.19.1 fetched in 6ms
2026-07-24T11:51:55.2609215Z 2151 silly pacote range manifest for strip-bom@^3.0.0 fetched in 17ms
2026-07-24T11:51:55.2609368Z 2152 silly pacote range manifest for querystringify@^2.1.1 fetched in 22ms
2026-07-24T11:51:55.2609545Z 2153 silly pacote range manifest for picocolors@^1.1.1 fetched in 5ms
2026-07-24T11:51:55.2609758Z 2154 silly pacote range manifest for color-convert@^3.1.3 fetched in 4ms
2026-07-24T11:51:55.2610001Z 2155 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/forwarded 11ms (from cache)
2026-07-24T11:51:55.2610278Z 2156 silly pacote range manifest for js-tokens@^4.0.0 fetched in 4ms
2026-07-24T11:51:55.2610438Z 2157 silly pacote range manifest for estraverse@^4.2.0 fetched in 4ms
2026-07-24T11:51:55.2610579Z 2158 silly pacote range manifest for esprima@^4.0.1 fetched in 4ms
2026-07-24T11:51:55.2610720Z 2159 silly pacote range manifest for acorn@^2.1.0 fetched in 3ms
2026-07-24T11:51:55.2610856Z 2160 silly pacote version manifest for forwarded@0.2.0 fetched in 15ms
2026-07-24T11:51:55.2610999Z 2161 silly pacote range manifest for cssom@0.3.x fetched in 3ms
2026-07-24T11:51:55.2611243Z 2162 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/escalade 13ms (from cache)
2026-07-24T11:51:55.2611480Z 2163 silly pacote range manifest for webidl-conversions@^3.0.0 fetched in 4ms
2026-07-24T11:51:55.2611708Z 2164 silly pacote range manifest for @jridgewell/trace-mapping@^0.3.24 fetched in 4ms
2026-07-24T11:51:55.2611862Z 2165 silly pacote range manifest for escalade@^3.2.0 fetched in 16ms
2026-07-24T11:51:55.2611996Z 2166 silly pacote range manifest for braces@~3.0.2 fetched in 2ms
2026-07-24T11:51:55.2612200Z 2167 silly pacote range manifest for is-glob@~4.0.1 fetched in 2ms
2026-07-24T11:51:55.2612441Z 2168 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/color-string 14ms (from cache)
2026-07-24T11:51:55.2612608Z 2169 silly pacote range manifest for anymatch@~3.1.2 fetched in 3ms
2026-07-24T11:51:55.2612846Z 2170 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/es6-promise 17ms (from cache)
2026-07-24T11:51:55.2613107Z 2171 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/optionator 14ms (from cache)
2026-07-24T11:51:55.2613371Z 2172 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/path-is-inside 9ms (from cache)
2026-07-24T11:51:55.2613537Z 2173 silly pacote range manifest for readdirp@~3.6.0 fetched in 6ms
2026-07-24T11:51:55.2613764Z 2174 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/tr46 13ms (from cache)
2026-07-24T11:51:55.2613993Z 2175 silly pacote range manifest for glob-parent@~5.1.2 fetched in 6ms
2026-07-24T11:51:55.2614239Z 2176 silly pacote range manifest for color-string@^2.1.3 fetched in 21ms
2026-07-24T11:51:55.2614449Z 2177 silly pacote range manifest for is-binary-path@~2.1.0 fetched in 4ms
2026-07-24T11:51:55.2614658Z 2178 silly pacote range manifest for es6-promise@^4.0.3 fetched in 23ms
2026-07-24T11:51:55.2614916Z 2179 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@jridgewell%2fsourcemap-codec 15ms (from cache)
2026-07-24T11:51:55.2615092Z 2180 silly pacote range manifest for optionator@^0.8.1 fetched in 21ms
2026-07-24T11:51:55.2615300Z 2181 silly pacote range manifest for path-is-inside@^1.0.1 fetched in 15ms
2026-07-24T11:51:55.2615512Z 2182 silly pacote range manifest for normalize-path@~3.0.0 fetched in 4ms
2026-07-24T11:51:55.2615657Z 2183 silly pacote range manifest for tr46@~0.0.3 fetched in 19ms
2026-07-24T11:51:55.2615798Z 2184 silly pacote range manifest for fsevents@~2.3.2 fetched in 6ms
2026-07-24T11:51:55.2615936Z 2185 silly pacote range manifest for chokidar@^2.1.8 fetched in 5ms
2026-07-24T11:51:55.2616159Z 2186 silly pacote range manifest for @jridgewell/sourcemap-codec@^1.5.0 fetched in 20ms
2026-07-24T11:51:55.2616421Z 2187 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@jridgewell%2fsourcemap-codec 6ms (from cache)
2026-07-24T11:51:55.2616593Z 2188 silly pacote range manifest for estraverse@^5.2.0 fetched in 5ms
2026-07-24T11:51:55.2616735Z 2189 silly pacote version manifest for inherits@2.0.3 fetched in 5ms
2026-07-24T11:51:55.2616871Z 2190 silly pacote range manifest for util@^0.10.4 fetched in 4ms
2026-07-24T11:51:55.2617133Z 2191 silly pacote range manifest for @jridgewell/sourcemap-codec@^1.4.14 fetched in 11ms
2026-07-24T11:51:55.2617381Z 2192 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/randombytes 9ms (from cache)
2026-07-24T11:51:55.2617543Z 2193 silly pacote range manifest for xtend@^4.0.0 fetched in 3ms
2026-07-24T11:51:55.2617773Z 2194 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-windows 10ms (from cache)
2026-07-24T11:51:55.2618043Z 2195 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/builtin-status-codes 7ms (from cache)
2026-07-24T11:51:55.2618211Z 2196 silly pacote range manifest for pako@~1.0.5 fetched in 4ms
2026-07-24T11:51:55.2618463Z 2197 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@jridgewell%2fresolve-uri 16ms (from cache)
2026-07-24T11:51:55.2618799Z 2198 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/expand-brackets 14ms (from cache)
2026-07-24T11:51:55.2619068Z 2199 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/to-arraybuffer 9ms (from cache)
2026-07-24T11:51:55.2619237Z 2200 silly pacote range manifest for randombytes@^2.1.0 fetched in 16ms
2026-07-24T11:51:55.2619380Z 2201 silly pacote range manifest for inherits@~2.0.1 fetched in 7ms
2026-07-24T11:51:55.2619579Z 2202 silly pacote range manifest for is-windows@^1.0.2 fetched in 16ms
2026-07-24T11:51:55.2619795Z 2203 silly pacote range manifest for builtin-status-codes@^3.0.0 fetched in 12ms
2026-07-24T11:51:55.2620023Z 2204 silly pacote range manifest for @jridgewell/resolve-uri@^3.1.0 fetched in 22ms
2026-07-24T11:51:55.2620240Z 2205 silly pacote range manifest for expand-brackets@^2.1.4 fetched in 19ms
2026-07-24T11:51:55.2620454Z 2206 silly pacote range manifest for to-arraybuffer@^1.0.0 fetched in 13ms
2026-07-24T11:51:55.2620599Z 2207 silly pacote range manifest for isarray@^1.0.0 fetched in 3ms
2026-07-24T11:51:55.2620737Z 2208 silly pacote range manifest for setimmediate@^1.0.4 fetched in 4ms
2026-07-24T11:51:55.2620984Z 2209 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/object.assign 19ms (from cache)
2026-07-24T11:51:55.2621252Z 2210 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/browserify-cipher 10ms (from cache)
2026-07-24T11:51:55.2621426Z 2211 silly pacote range manifest for object.assign@^4.1.4 fetched in 26ms
2026-07-24T11:51:55.2621668Z 2212 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/base64-js 16ms (from cache)
2026-07-24T11:51:55.2621965Z 2213 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ieee754 15ms (from cache)
2026-07-24T11:51:55.2622227Z 2214 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/create-hash 13ms (from cache)
2026-07-24T11:51:55.2622464Z 2215 silly pacote range manifest for browserify-cipher@^1.0.1 fetched in 16ms
2026-07-24T11:51:55.2622706Z 2216 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/create-ecdh 15ms (from cache)
2026-07-24T11:51:55.2622933Z 2217 silly pacote range manifest for base64-js@^1.0.2 fetched in 22ms
2026-07-24T11:51:55.2623176Z 2218 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/create-hmac 15ms (from cache)
2026-07-24T11:51:55.2623343Z 2219 silly pacote range manifest for ieee754@^1.1.4 fetched in 22ms
2026-07-24T11:51:55.2623552Z 2220 silly pacote range manifest for create-hash@^1.2.0 fetched in 18ms
2026-07-24T11:51:55.2623794Z 2221 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/diffie-hellman 18ms (from cache)
2026-07-24T11:51:55.2623961Z 2222 silly pacote range manifest for inherits@^2.0.4 fetched in 5ms
2026-07-24T11:51:55.2624195Z 2223 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/browserify-sign 23ms (from cache)
2026-07-24T11:51:55.2624425Z 2224 silly pacote range manifest for create-ecdh@^4.0.4 fetched in 23ms
2026-07-24T11:51:55.2624633Z 2225 silly pacote range manifest for create-hmac@^1.1.7 fetched in 23ms
2026-07-24T11:51:55.2624844Z 2226 silly pacote range manifest for diffie-hellman@^5.0.3 fetched in 24ms
2026-07-24T11:51:55.2625085Z 2227 silly pacote range manifest for browserify-sign@^4.2.3 fetched in 29ms
2026-07-24T11:51:55.2625329Z 2228 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/hash-base 17ms (from cache)
2026-07-24T11:51:55.2625556Z 2229 silly pacote range manifest for hash-base@~3.0.4 fetched in 21ms
2026-07-24T11:51:55.2625790Z 2230 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/public-encrypt 14ms (from cache)
2026-07-24T11:51:55.2626052Z 2231 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/randomfill 12ms (from cache)
2026-07-24T11:51:55.2626308Z 2232 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-buffer 13ms (from cache)
2026-07-24T11:51:55.2626563Z 2233 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/pbkdf2 18ms (from cache)
2026-07-24T11:51:55.2626790Z 2234 silly pacote range manifest for public-encrypt@^4.0.3 fetched in 17ms
2026-07-24T11:51:55.2626938Z 2235 silly pacote range manifest for randomfill@^1.0.4 fetched in 15ms
2026-07-24T11:51:55.2627186Z 2236 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-data-descriptor 15ms (from cache)
2026-07-24T11:51:55.2627447Z 2237 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@xtuc%2flong 11ms (from cache)
2026-07-24T11:51:55.2627674Z 2238 silly pacote range manifest for is-buffer@^1.1.5 fetched in 20ms
2026-07-24T11:51:55.2627814Z 2239 silly pacote range manifest for pbkdf2@^3.1.2 fetched in 24ms
2026-07-24T11:51:55.2628026Z 2240 silly pacote range manifest for is-data-descriptor@^1.0.1 fetched in 20ms
2026-07-24T11:51:55.2628177Z 2241 silly pacote version manifest for @xtuc/long@4.2.1 fetched in 16ms
2026-07-24T11:51:55.2628422Z 2242 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@xtuc%2fieee754 7ms (from cache)
2026-07-24T11:51:55.2628731Z 2243 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/arr-union 7ms (from cache)
2026-07-24T11:51:55.2628994Z 2244 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/static-extend 6ms (from cache)
2026-07-24T11:51:55.2629166Z 2245 silly pacote range manifest for @xtuc/ieee754@^1.2.0 fetched in 10ms
2026-07-24T11:51:55.2629372Z 2246 silly pacote range manifest for arr-union@^3.1.0 fetched in 10ms
2026-07-24T11:51:55.2629613Z 2247 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/collection-visit 7ms (from cache)
2026-07-24T11:51:55.2629844Z 2248 silly pacote range manifest for static-extend@^0.1.1 fetched in 10ms
2026-07-24T11:51:55.2630144Z 2249 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fhelper-fsm 23ms (from cache)
2026-07-24T11:51:55.2630387Z 2250 silly pacote range manifest for collection-visit@^1.0.0 fetched in 12ms
2026-07-24T11:51:55.2630616Z 2251 silly pacote version manifest for @webassemblyjs/helper-fsm@1.7.11 fetched in 27ms
2026-07-24T11:51:55.2630888Z 2252 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2fhelper-code-frame 23ms (from cache)
2026-07-24T11:51:55.2631165Z 2253 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/has-value 10ms (from cache)
2026-07-24T11:51:55.2631426Z 2254 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/to-object-path 7ms (from cache)
2026-07-24T11:51:55.2631678Z 2255 silly pacote version manifest for @webassemblyjs/helper-code-frame@1.7.11 fetched in 28ms
2026-07-24T11:51:55.2631962Z 2256 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@webassemblyjs%2ffloating-point-hex-parser 27ms (from cache)
2026-07-24T11:51:55.2632253Z 2257 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/is-accessor-descriptor 43ms (from cache)
2026-07-24T11:51:55.2632484Z 2258 silly pacote range manifest for has-value@^1.0.0 fetched in 16ms
2026-07-24T11:51:55.2632728Z 2259 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/is-accessor-descriptor 43ms (from cache)
2026-07-24T11:51:55.2632962Z 2260 silly pacote range manifest for to-object-path@^0.3.0 fetched in 14ms
2026-07-24T11:51:55.2633232Z 2261 silly pacote version manifest for @webassemblyjs/floating-point-hex-parser@1.7.11 fetched in 33ms
2026-07-24T11:51:55.2633489Z 2262 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/get-value 20ms (from cache)
2026-07-24T11:51:55.2633726Z 2263 silly pacote range manifest for is-accessor-descriptor@^1.0.2 fetched in 53ms
2026-07-24T11:51:55.2633972Z 2264 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/union-value 19ms (from cache)
2026-07-24T11:51:55.2634196Z 2265 silly pacote range manifest for for-in@^1.0.2 fetched in 10ms
2026-07-24T11:51:55.2634430Z 2266 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/set-value 25ms (from cache)
2026-07-24T11:51:55.2634663Z 2267 silly pacote range manifest for is-accessor-descriptor@^1.0.1 fetched in 55ms
2026-07-24T11:51:55.2634888Z 2268 silly pacote range manifest for is-fullwidth-code-point@^1.0.0 fetched in 10ms
2026-07-24T11:51:55.2635260Z 2269 silly pacote range manifest for get-value@^2.0.6 fetched in 31ms
2026-07-24T11:51:55.2635484Z 2270 silly pacote range manifest for union-value@^1.0.0 fetched in 25ms
2026-07-24T11:51:55.2635726Z 2271 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/unset-value 17ms (from cache)
2026-07-24T11:51:55.2635948Z 2272 silly pacote range manifest for set-value@^2.0.0 fetched in 31ms
2026-07-24T11:51:55.2636153Z 2273 silly pacote version manifest for assert-plus@1.0.0 fetched in 4ms
2026-07-24T11:51:55.2636394Z 2274 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/code-point-at 15ms (from cache)
2026-07-24T11:51:55.2636559Z 2275 silly pacote range manifest for punycode@^2.3.1 fetched in 5ms
2026-07-24T11:51:55.2636762Z 2276 silly pacote range manifest for unset-value@^1.0.0 fetched in 22ms
2026-07-24T11:51:55.2636969Z 2277 silly pacote range manifest for code-point-at@^1.0.0 fetched in 19ms
2026-07-24T11:51:55.2637210Z 2278 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/extsprintf 11ms (from cache)
2026-07-24T11:51:55.2637469Z 2279 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/json-schema 9ms (from cache)
2026-07-24T11:51:55.2637723Z 2280 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/verror 16ms (from cache)
2026-07-24T11:51:55.2637882Z 2281 silly pacote version manifest for extsprintf@1.3.0 fetched in 16ms
2026-07-24T11:51:55.2638116Z 2282 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/jsbn 10ms (from cache)
2026-07-24T11:51:55.2638404Z 2283 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/asn1 10ms (from cache)
2026-07-24T11:51:55.2638716Z 2284 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/getpass 9ms (from cache)
2026-07-24T11:51:55.2638948Z 2285 silly pacote version manifest for json-schema@0.4.0 fetched in 14ms
2026-07-24T11:51:55.2639097Z 2286 silly pacote version manifest for verror@1.10.0 fetched in 20ms
2026-07-24T11:51:55.2639336Z 2287 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ecc-jsbn 9ms (from cache)
2026-07-24T11:51:55.2639496Z 2288 silly pacote range manifest for asn1@~0.2.3 fetched in 15ms
2026-07-24T11:51:55.2639638Z 2289 silly pacote range manifest for jsbn@~0.1.0 fetched in 14ms
2026-07-24T11:51:55.2639780Z 2290 silly pacote range manifest for getpass@^0.1.1 fetched in 12ms
2026-07-24T11:51:55.2639987Z 2291 silly pacote range manifest for safer-buffer@^2.0.2 fetched in 4ms
2026-07-24T11:51:55.2640190Z 2292 silly pacote range manifest for p-limit@^2.0.0 fetched in 3ms
2026-07-24T11:51:55.2640399Z 2293 silly pacote range manifest for ecc-jsbn@~0.1.1 fetched in 13ms
2026-07-24T11:51:55.2640640Z 2294 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/bcrypt-pbkdf 6ms (from cache)
2026-07-24T11:51:55.2640892Z 2295 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/dashdash 15ms (from cache)
2026-07-24T11:51:55.2641055Z 2296 silly pacote range manifest for hasown@^2.0.2 fetched in 4ms
2026-07-24T11:51:55.2641265Z 2297 silly pacote range manifest for bcrypt-pbkdf@^1.0.0 fetched in 10ms
2026-07-24T11:51:55.2641542Z 2298 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/tweetnacl 15ms (from cache)
2026-07-24T11:51:55.2641708Z 2299 silly pacote range manifest for dashdash@^1.12.0 fetched in 21ms
2026-07-24T11:51:55.2641942Z 2300 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/p-defer 11ms (from cache)
2026-07-24T11:51:55.2642286Z 2301 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/shebang-command 11ms (from cache)
2026-07-24T11:51:55.2642663Z 2302 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/nice-try 12ms (from cache)
2026-07-24T11:51:55.2643005Z 2303 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/path-key 13ms (from cache)
2026-07-24T11:51:55.2643263Z 2304 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/gopd 13ms (from cache)
2026-07-24T11:51:55.2643431Z 2305 silly pacote range manifest for tweetnacl@~0.14.0 fetched in 24ms
2026-07-24T11:51:55.2643635Z 2306 silly pacote range manifest for p-defer@^1.0.0 fetched in 18ms
2026-07-24T11:51:55.2643848Z 2307 silly pacote range manifest for shebang-command@^1.2.0 fetched in 17ms
2026-07-24T11:51:55.2644059Z 2308 silly pacote range manifest for nice-try@^1.0.4 fetched in 18ms
2026-07-24T11:51:55.2644254Z 2309 silly pacote range manifest for path-key@^2.0.1 fetched in 19ms
2026-07-24T11:51:55.2644397Z 2310 silly pacote range manifest for gopd@^1.2.0 fetched in 18ms
2026-07-24T11:51:55.2644644Z 2311 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/get-proto 15ms (from cache)
2026-07-24T11:51:55.2644907Z 2312 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/has-symbols 14ms (from cache)
2026-07-24T11:51:55.2645133Z 2313 silly pacote range manifest for graceful-fs@^4.1.6 fetched in 5ms
2026-07-24T11:51:55.2645337Z 2314 silly pacote range manifest for path-key@^2.0.0 fetched in 5ms
2026-07-24T11:51:55.2645582Z 2315 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/es-object-atoms 14ms (from cache)
2026-07-24T11:51:55.2645813Z 2316 silly pacote range manifest for get-intrinsic@^1.2.5 fetched in 5ms
2026-07-24T11:51:55.2646027Z 2317 silly pacote range manifest for get-proto@^1.0.1 fetched in 21ms
2026-07-24T11:51:55.2646275Z 2318 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/math-intrinsics 11ms (from cache)
2026-07-24T11:51:55.2646510Z 2319 silly pacote range manifest for has-symbols@^1.1.0 fetched in 20ms
2026-07-24T11:51:55.2646771Z 2320 silly pacote range manifest for object-inspect@^1.13.3 fetched in 4ms
2026-07-24T11:51:55.2646988Z 2321 silly pacote range manifest for es-object-atoms@^1.1.1 fetched in 19ms
2026-07-24T11:51:55.2647198Z 2322 silly pacote range manifest for mimic-fn@^1.0.0 fetched in 4ms
2026-07-24T11:51:55.2647439Z 2323 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/has-tostringtag 12ms (from cache)
2026-07-24T11:51:55.2647698Z 2324 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/callsite 11ms (from cache)
2026-07-24T11:51:55.2647860Z 2325 silly pacote range manifest for ms@^2.0.0 fetched in 4ms
2026-07-24T11:51:55.2648070Z 2326 silly pacote range manifest for math-intrinsics@^1.1.0 fetched in 16ms
2026-07-24T11:51:55.2648217Z 2327 silly pacote range manifest for lcid@^1.0.0 fetched in 4ms
2026-07-24T11:51:55.2648366Z 2328 silly pacote range manifest for object.assign@^4.1.0 fetched in 4ms
2026-07-24T11:51:55.2648627Z 2329 silly pacote range manifest for path-exists@^2.0.0 fetched in 4ms
2026-07-24T11:51:55.2648849Z 2330 silly pacote range manifest for has-tostringtag@^1.0.2 fetched in 17ms
2026-07-24T11:51:55.2649001Z 2331 silly pacote version manifest for callsite@1.0.0 fetched in 16ms
2026-07-24T11:51:55.2649142Z 2332 silly pacote version manifest for ip@1.1.5 fetched in 4ms
2026-07-24T11:51:55.2649343Z 2333 silly pacote range manifest for path-type@^1.0.0 fetched in 2ms
2026-07-24T11:51:55.2649581Z 2334 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/repeating 12ms (from cache)
2026-07-24T11:51:55.2649817Z 2335 silly pacote range manifest for normalize-package-data@^2.3.2 fetched in 6ms
2026-07-24T11:51:55.2650066Z 2336 silly pacote range manifest for iconv-lite@^0.6.2 fetched in 5ms
2026-07-24T11:51:55.2650313Z 2337 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/spdx-exceptions 11ms (from cache)
2026-07-24T11:51:55.2650584Z 2338 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/array-find-index 10ms (from cache)
2026-07-24T11:51:55.2650752Z 2339 silly pacote range manifest for repeating@^2.0.0 fetched in 16ms
2026-07-24T11:51:55.2650955Z 2340 silly pacote range manifest for run-queue@^1.0.0 fetched in 4ms
2026-07-24T11:51:55.2651201Z 2341 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/spdx-license-ids 20ms (from cache)
2026-07-24T11:51:55.2651434Z 2342 silly pacote range manifest for readable-stream@1 || 2 fetched in 6ms
2026-07-24T11:51:55.2651673Z 2343 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/load-json-file 13ms (from cache)
2026-07-24T11:51:55.2651906Z 2344 silly pacote range manifest for spdx-exceptions@^2.1.0 fetched in 16ms
2026-07-24T11:51:55.2652127Z 2345 silly pacote range manifest for array-find-index@^1.0.1 fetched in 16ms
2026-07-24T11:51:55.2652369Z 2346 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/iferr 10ms (from cache)
2026-07-24T11:51:55.2652594Z 2347 silly pacote range manifest for for-in@^0.1.3 fetched in 6ms
2026-07-24T11:51:55.2652812Z 2348 silly pacote range manifest for string-width@^1.0.2 || 2 || 3 || 4 fetched in 4ms
2026-07-24T11:51:55.2653031Z 2349 silly pacote range manifest for spdx-license-ids@^3.0.0 fetched in 26ms
2026-07-24T11:51:55.2653275Z 2350 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/smart-buffer 20ms (from cache)
2026-07-24T11:51:55.2653506Z 2351 silly pacote range manifest for load-json-file@^1.0.0 fetched in 19ms
2026-07-24T11:51:55.2653732Z 2352 silly pacote range manifest for json-parse-better-errors@^1.0.1 fetched in 5ms
2026-07-24T11:51:55.2653882Z 2353 silly pacote range manifest for iferr@^0.1.5 fetched in 16ms
2026-07-24T11:51:55.2654090Z 2354 silly pacote range manifest for babel-runtime@^6.22.0 fetched in 6ms
2026-07-24T11:51:55.2654348Z 2355 silly pacote range manifest for smart-buffer@^4.1.0 fetched in 26ms
2026-07-24T11:51:55.2654690Z 2356 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/caller-path 12ms (from cache)
2026-07-24T11:51:55.2655029Z 2357 silly pacote range manifest for get-stream@^3.0.0 fetched in 4ms
2026-07-24T11:51:55.2655455Z 2358 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/error-ex 12ms (from cache)
2026-07-24T11:51:55.2655804Z 2359 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/loose-envify 12ms (from cache)
2026-07-24T11:51:55.2656120Z 2360 silly pacote range manifest for caller-path@^2.0.0 fetched in 16ms
2026-07-24T11:51:55.2656403Z 2361 silly pacote range manifest for error-ex@^1.3.1 fetched in 16ms
2026-07-24T11:51:55.2656711Z 2362 silly pacote range manifest for safe-buffer@>=5.1.0 fetched in 3ms
2026-07-24T11:51:55.2657074Z 2363 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/define-properties 10ms (from cache)
2026-07-24T11:51:55.2657462Z 2364 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/call-bind 14ms (from cache)
2026-07-24T11:51:55.2657789Z 2365 silly pacote range manifest for loose-envify@^1.0.0 fetched in 17ms
2026-07-24T11:51:55.2658184Z 2366 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/set-function-name 12ms (from cache)
2026-07-24T11:51:55.2658655Z 2367 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/call-bind 14ms (from cache)
2026-07-24T11:51:55.2658941Z 2368 silly pacote range manifest for obuf@^1.0.0 fetched in 4ms
2026-07-24T11:51:55.2659264Z 2369 silly pacote range manifest for define-properties@^1.2.1 fetched in 16ms
2026-07-24T11:51:55.2659582Z 2370 silly pacote range manifest for call-bind@^1.0.7 fetched in 20ms
2026-07-24T11:51:55.2659913Z 2371 silly pacote range manifest for set-function-name@^2.0.2 fetched in 17ms
2026-07-24T11:51:55.2660302Z 2372 silly pacote range manifest for wbuf@^1.1.0 fetched in 4ms
2026-07-24T11:51:55.2660664Z 2373 silly pacote range manifest for call-bind@^1.0.8 fetched in 19ms
2026-07-24T11:51:55.2660987Z 2374 silly pacote range manifest for color-name@^2.0.0 fetched in 3ms
2026-07-24T11:51:55.2661329Z 2375 silly pacote range manifest for fill-range@^7.1.1 fetched in 3ms
2026-07-24T11:51:55.2661761Z 2376 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/websocket-extensions 12ms (from cache)
2026-07-24T11:51:55.2662236Z 2377 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/http-parser-js 18ms (from cache)
2026-07-24T11:51:55.2662713Z 2378 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@leichtgewicht%2fip-codec 12ms (from cache)
2026-07-24T11:51:55.2663116Z 2379 silly pacote range manifest for binary-extensions@^2.0.0 fetched in 6ms
2026-07-24T11:51:55.2663538Z 2380 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/minimalistic-assert 10ms (from cache)
2026-07-24T11:51:55.2663960Z 2381 silly pacote range manifest for websocket-extensions@>=0.1.1 fetched in 19ms
2026-07-24T11:51:55.2664349Z 2382 silly pacote range manifest for @leichtgewicht/ip-codec@^2.0.1 fetched in 17ms
2026-07-24T11:51:55.2664719Z 2383 silly pacote range manifest for http-parser-js@>=0.5.1 fetched in 25ms
2026-07-24T11:51:55.2665085Z 2384 silly pacote range manifest for minimalistic-assert@^1.0.0 fetched in 14ms
2026-07-24T11:51:55.2665501Z 2385 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/deep-is 10ms (from cache)
2026-07-24T11:51:55.2665943Z 2386 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/prelude-ls 12ms (from cache)
2026-07-24T11:51:55.2666327Z 2387 silly pacote range manifest for safe-buffer@^5.1.0 fetched in 3ms
2026-07-24T11:51:55.2666676Z 2388 silly pacote range manifest for deep-is@~0.1.3 fetched in 13ms
2026-07-24T11:51:55.2667029Z 2389 silly pacote range manifest for prelude-ls@~1.1.2 fetched in 15ms
2026-07-24T11:51:55.2667422Z 2390 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/type-check 6ms (from cache)
2026-07-24T11:51:55.2667774Z 2391 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/word-wrap 10ms (from cache)
2026-07-24T11:51:55.2668037Z 2392 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/levn 8ms (from cache)
2026-07-24T11:51:55.2668196Z 2393 silly pacote range manifest for debug@^2.3.3 fetched in 5ms
2026-07-24T11:51:55.2668515Z 2394 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/fast-levenshtein 10ms (from cache)
2026-07-24T11:51:55.2668835Z 2395 silly pacote range manifest for es-object-atoms@^1.0.0 fetched in 5ms
2026-07-24T11:51:55.2669081Z 2396 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/picomatch 23ms (from cache)
2026-07-24T11:51:55.2669304Z 2397 silly pacote range manifest for type-check@~0.3.2 fetched in 15ms
2026-07-24T11:51:55.2669511Z 2398 silly pacote range manifest for word-wrap@~1.2.3 fetched in 19ms
2026-07-24T11:51:55.2669652Z 2399 silly pacote range manifest for levn@~0.3.0 fetched in 16ms
2026-07-24T11:51:55.2669888Z 2400 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/picomatch 27ms (from cache)
2026-07-24T11:51:55.2670122Z 2401 silly pacote range manifest for fast-levenshtein@~2.0.6 fetched in 20ms
2026-07-24T11:51:55.2670377Z 2402 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/electron-to-chromium 935ms (from cache)
2026-07-24T11:51:55.2670553Z 2403 silly pacote range manifest for picomatch@^2.2.1 fetched in 123ms
2026-07-24T11:51:55.2670806Z 2404 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/posix-character-classes 107ms (from cache)
2026-07-24T11:51:55.2670976Z 2405 silly pacote range manifest for picomatch@^2.0.4 fetched in 126ms
2026-07-24T11:51:55.2671196Z 2406 silly pacote range manifest for electron-to-chromium@^1.5.393 fetched in 1023ms
2026-07-24T11:51:55.2671443Z 2407 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/browserify-des 103ms (from cache)
2026-07-24T11:51:55.2671728Z 2408 silly pacote range manifest for posix-character-classes@^0.1.0 fetched in 113ms
2026-07-24T11:51:55.2671976Z 2409 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/browserify-aes 110ms (from cache)
2026-07-24T11:51:55.2672243Z 2410 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/evp_bytestokey 105ms (from cache)
2026-07-24T11:51:55.2672507Z 2411 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/md5.js 102ms (from cache)
2026-07-24T11:51:55.2672775Z 2412 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cipher-base 107ms (from cache)
2026-07-24T11:51:55.2673011Z 2413 silly pacote range manifest for browserify-des@^1.0.0 fetched in 109ms
2026-07-24T11:51:55.2673259Z 2414 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ripemd160 103ms (from cache)
2026-07-24T11:51:55.2673517Z 2415 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cipher-base 7ms (from cache)
2026-07-24T11:51:55.2673750Z 2416 silly pacote range manifest for browserify-aes@^1.0.4 fetched in 116ms
2026-07-24T11:51:55.2673904Z 2417 silly pacote range manifest for evp_bytestokey@^1.0.0 fetched in 111ms
2026-07-24T11:51:55.2674055Z 2418 silly pacote range manifest for md5.js@^1.3.4 fetched in 108ms
2026-07-24T11:51:55.2674265Z 2419 silly pacote range manifest for cipher-base@^1.0.1 fetched in 113ms
2026-07-24T11:51:55.2674447Z 2420 silly pacote range manifest for ripemd160@^2.0.1 fetched in 108ms
2026-07-24T11:51:55.2674756Z 2421 silly pacote range manifest for create-hash@^1.1.0 fetched in 4ms
2026-07-24T11:51:55.2675042Z 2422 silly pacote range manifest for cipher-base@^1.0.3 fetched in 12ms
2026-07-24T11:51:55.2675235Z 2423 silly pacote range manifest for ripemd160@^2.0.0 fetched in 5ms
2026-07-24T11:51:55.2675445Z 2424 silly pacote range manifest for randombytes@^2.0.0 fetched in 4ms
2026-07-24T11:51:55.2675738Z 2425 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/sha.js 21ms (from cache)
2026-07-24T11:51:55.2675967Z 2426 silly pacote range manifest for readable-stream@^2.3.8 fetched in 3ms
2026-07-24T11:51:55.2676115Z 2427 silly pacote range manifest for sha.js@^2.4.0 fetched in 27ms
2026-07-24T11:51:55.2676344Z 2428 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/miller-rabin 15ms (from cache)
2026-07-24T11:51:55.2676607Z 2429 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/browserify-rsa 14ms (from cache)
2026-07-24T11:51:55.2676913Z 2430 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/browserify-rsa 4ms (from cache)
2026-07-24T11:51:55.2677148Z 2431 silly pacote range manifest for miller-rabin@^4.0.0 fetched in 18ms
2026-07-24T11:51:55.2677386Z 2432 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/sha.js 20ms (from cache)
2026-07-24T11:51:55.2677613Z 2433 silly pacote range manifest for browserify-rsa@^4.1.1 fetched in 19ms
2026-07-24T11:51:55.2677856Z 2434 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/parse-asn1 18ms (from cache)
2026-07-24T11:51:55.2678118Z 2435 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/elliptic 34ms (from cache)
2026-07-24T11:51:55.2678343Z 2436 silly pacote range manifest for browserify-rsa@^4.0.0 fetched in 17ms
2026-07-24T11:51:55.2678491Z 2437 silly pacote range manifest for randombytes@^2.0.1 fetched in 11ms
2026-07-24T11:51:55.2678761Z 2438 silly pacote range manifest for sha.js@^2.4.8 fetched in 31ms
2026-07-24T11:51:55.2678912Z 2439 silly pacote range manifest for randombytes@^2.0.5 fetched in 3ms
2026-07-24T11:51:55.2679122Z 2440 silly pacote range manifest for parse-asn1@^5.1.9 fetched in 27ms
2026-07-24T11:51:55.2679269Z 2441 silly pacote range manifest for elliptic@^6.5.3 fetched in 42ms
2026-07-24T11:51:55.2679412Z 2442 silly pacote range manifest for sha.js@^2.4.12 fetched in 5ms
2026-07-24T11:51:55.2679644Z 2443 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/parse-asn1 21ms (from cache)
2026-07-24T11:51:55.2679812Z 2444 silly pacote range manifest for ripemd160@^2.0.3 fetched in 6ms
2026-07-24T11:51:55.2679991Z 2445 silly pacote range manifest for hasown@^2.0.0 fetched in 6ms
2026-07-24T11:51:55.2680230Z 2446 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/elliptic 37ms (from cache)
2026-07-24T11:51:55.2680458Z 2447 silly pacote range manifest for parse-asn1@^5.0.0 fetched in 30ms
2026-07-24T11:51:55.2680698Z 2448 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/object-copy 14ms (from cache)
2026-07-24T11:51:55.2680868Z 2449 silly pacote range manifest for elliptic@^6.6.1 fetched in 44ms
2026-07-24T11:51:55.2681100Z 2450 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/to-buffer 16ms (from cache)
2026-07-24T11:51:55.2681331Z 2451 silly pacote range manifest for set-value@^2.0.1 fetched in 4ms
2026-07-24T11:51:55.2681573Z 2452 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/map-visit 16ms (from cache)
2026-07-24T11:51:55.2681836Z 2453 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/object-visit 16ms (from cache)
2026-07-24T11:51:55.2682072Z 2454 silly pacote range manifest for object-copy@^0.1.0 fetched in 19ms
2026-07-24T11:51:55.2682281Z 2455 silly pacote range manifest for to-buffer@^1.2.2 fetched in 22ms
2026-07-24T11:51:55.2682491Z 2456 silly pacote range manifest for is-plain-object@^2.0.3 fetched in 6ms
2026-07-24T11:51:55.2682839Z 2457 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/has-values 17ms (from cache)
2026-07-24T11:51:55.2683080Z 2458 silly pacote range manifest for split-string@^3.0.1 fetched in 7ms
2026-07-24T11:51:55.2683337Z 2459 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/number-is-nan 18ms (from cache)
2026-07-24T11:51:55.2683568Z 2460 silly pacote range manifest for map-visit@^1.0.0 fetched in 25ms
2026-07-24T11:51:55.2683775Z 2461 silly pacote range manifest for object-visit@^1.0.0 fetched in 23ms
2026-07-24T11:51:55.2683983Z 2462 silly pacote range manifest for has-value@^0.3.1 fetched in 7ms
2026-07-24T11:51:55.2684126Z 2463 silly pacote range manifest for extsprintf@^1.2.0 fetched in 4ms
2026-07-24T11:51:55.2684337Z 2464 silly pacote version manifest for core-util-is@1.0.2 fetched in 4ms
2026-07-24T11:51:55.2684633Z 2465 silly pacote range manifest for has-values@^1.0.0 fetched in 23ms
2026-07-24T11:51:55.2684888Z 2466 silly pacote range manifest for safer-buffer@~2.1.0 fetched in 4ms
2026-07-24T11:51:55.2685100Z 2467 silly pacote range manifest for number-is-nan@^1.0.0 fetched in 23ms
2026-07-24T11:51:55.2685363Z 2468 silly pacote range manifest for safer-buffer@^2.1.0 fetched in 4ms
2026-07-24T11:51:55.2685506Z 2469 silly pacote range manifest for tweetnacl@^0.14.3 fetched in 4ms
2026-07-24T11:51:55.2685705Z 2470 silly pacote range manifest for invert-kv@^1.0.0 fetched in 3ms
2026-07-24T11:51:55.2685910Z 2471 silly pacote range manifest for has-symbols@^1.0.3 fetched in 3ms
2026-07-24T11:51:55.2686120Z 2472 silly pacote range manifest for safer-buffer@>= 2.1.2 < 3.0.0 fetched in 4ms
2026-07-24T11:51:55.2686331Z 2473 silly pacote range manifest for strip-ansi@^6.0.1 fetched in 4ms
2026-07-24T11:51:55.2686538Z 2474 silly pacote range manifest for emoji-regex@^8.0.0 fetched in 3ms
2026-07-24T11:51:55.2686756Z 2475 silly pacote range manifest for is-fullwidth-code-point@^3.0.0 fetched in 3ms
2026-07-24T11:51:55.2686965Z 2476 silly pacote range manifest for parse-json@^2.2.0 fetched in 4ms
2026-07-24T11:51:55.2687206Z 2477 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/shebang-regex 9ms (from cache)
2026-07-24T11:51:55.2687470Z 2478 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/dunder-proto 9ms (from cache)
2026-07-24T11:51:55.2687688Z 2479 silly pacote range manifest for strip-bom@^2.0.0 fetched in 4ms
2026-07-24T11:51:55.2687925Z 2480 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-finite 9ms (from cache)
2026-07-24T11:51:55.2688159Z 2481 silly pacote range manifest for js-tokens@^3.0.0 || ^4.0.0 fetched in 5ms
2026-07-24T11:51:55.2688400Z 2482 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/bn.js 83ms (from cache)
2026-07-24T11:51:55.2688713Z 2483 silly pacote range manifest for shebang-regex@^1.0.0 fetched in 16ms
2026-07-24T11:51:55.2688931Z 2484 silly pacote range manifest for dunder-proto@^1.0.1 fetched in 16ms
2026-07-24T11:51:55.2689135Z 2485 silly pacote range manifest for is-finite@^1.0.0 fetched in 15ms
2026-07-24T11:51:55.2689369Z 2486 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-arrayish 10ms (from cache)
2026-07-24T11:51:55.2689536Z 2487 silly pacote range manifest for bn.js@^4.1.0 fetched in 89ms
2026-07-24T11:51:55.2689777Z 2488 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/caller-callsite 12ms (from cache)
2026-07-24T11:51:55.2690005Z 2489 silly pacote range manifest for is-arrayish@^0.2.1 fetched in 14ms
2026-07-24T11:51:55.2690259Z 2490 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/has-property-descriptors 11ms (from cache)
2026-07-24T11:51:55.2690535Z 2491 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/define-data-property 13ms (from cache)
2026-07-24T11:51:55.2690816Z 2492 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/has-property-descriptors 5ms (from cache)
2026-07-24T11:51:55.2691045Z 2493 silly pacote range manifest for to-regex-range@^5.0.1 fetched in 4ms
2026-07-24T11:51:55.2691257Z 2494 silly pacote range manifest for caller-callsite@^2.0.0 fetched in 17ms
2026-07-24T11:51:55.2691493Z 2495 http fetch GET 304 http://binario.caixa:8081/repository/npm-all/bn.js 81ms (from cache)
2026-07-24T11:51:55.2691764Z 2496 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/set-function-length 13ms (from cache)
2026-07-24T11:51:55.2692007Z 2497 silly pacote range manifest for has-property-descriptors@^1.0.0 fetched in 18ms
2026-07-24T11:51:55.2692230Z 2498 silly pacote range manifest for define-data-property@^1.0.1 fetched in 20ms
2026-07-24T11:51:55.2692483Z 2499 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/define-data-property 14ms (from cache)
2026-07-24T11:51:55.2692759Z 2500 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/functions-have-names 14ms (from cache)
2026-07-24T11:51:55.2692998Z 2501 silly pacote range manifest for has-property-descriptors@^1.0.2 fetched in 13ms
2026-07-24T11:51:55.2693146Z 2502 silly pacote range manifest for bn.js@^5.2.3 fetched in 89ms
2026-07-24T11:51:55.2693350Z 2503 silly pacote range manifest for cipher-base@^1.0.0 fetched in 6ms
2026-07-24T11:51:55.2693609Z 2504 silly pacote range manifest for set-function-length@^1.2.2 fetched in 19ms
2026-07-24T11:51:55.2693762Z 2505 silly pacote range manifest for evp_bytestokey@^1.0.3 fetched in 5ms
2026-07-24T11:51:55.2693968Z 2506 silly pacote range manifest for hash-base@^3.0.0 fetched in 5ms
2026-07-24T11:51:55.2694182Z 2507 silly pacote range manifest for define-data-property@^1.1.4 fetched in 19ms
2026-07-24T11:51:55.2694460Z 2508 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/des.js 12ms (from cache)
2026-07-24T11:51:55.2694721Z 2509 silly pacote range manifest for functions-have-names@^1.2.3 fetched in 20ms
2026-07-24T11:51:55.2694933Z 2510 silly pacote range manifest for hash-base@^3.1.2 fetched in 5ms
2026-07-24T11:51:55.2695173Z 2511 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/buffer-xor 13ms (from cache)
2026-07-24T11:51:55.2695402Z 2512 silly pacote range manifest for to-buffer@^1.2.0 fetched in 5ms
2026-07-24T11:51:55.2695546Z 2513 silly pacote range manifest for bn.js@^4.0.0 fetched in 6ms
2026-07-24T11:51:55.2695687Z 2514 silly pacote range manifest for bn.js@^5.2.1 fetched in 5ms
2026-07-24T11:51:55.2695888Z 2515 silly pacote range manifest for browserify-aes@^1.2.0 fetched in 4ms
2026-07-24T11:51:55.2696036Z 2516 silly pacote range manifest for des.js@^1.0.0 fetched in 18ms
2026-07-24T11:51:55.2696175Z 2517 silly pacote range manifest for pbkdf2@^3.1.5 fetched in 4ms
2026-07-24T11:51:55.2696314Z 2518 silly pacote range manifest for bn.js@^4.11.9 fetched in 5ms
2026-07-24T11:51:55.2696520Z 2519 silly pacote range manifest for buffer-xor@^1.0.3 fetched in 19ms
2026-07-24T11:51:55.2696763Z 2520 silly pacote range manifest for minimalistic-assert@^1.0.1 fetched in 4ms
2026-07-24T11:51:55.2696999Z 2521 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/brorand 11ms (from cache)
2026-07-24T11:51:55.2697224Z 2522 silly pacote range manifest for kind-of@^3.0.3 fetched in 3ms
2026-07-24T11:51:55.2697365Z 2523 silly pacote range manifest for isarray@^2.0.5 fetched in 3ms
2026-07-24T11:51:55.2697599Z 2524 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/brorand 10ms (from cache)
2026-07-24T11:51:55.2697857Z 2525 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/hmac-drbg 8ms (from cache)
2026-07-24T11:51:55.2698148Z 2526 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/minimalistic-crypto-utils 7ms (from cache)
2026-07-24T11:51:55.2698318Z 2527 silly pacote range manifest for brorand@^1.0.1 fetched in 15ms
2026-07-24T11:51:55.2698511Z 2528 silly pacote range manifest for get-value@^2.0.3 fetched in 3ms
2026-07-24T11:51:55.2698817Z 2529 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/copy-descriptor 8ms (from cache)
2026-07-24T11:51:55.2699077Z 2530 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/hash.js 11ms (from cache)
2026-07-24T11:51:55.2699301Z 2531 silly pacote range manifest for has-values@^0.1.4 fetched in 5ms
2026-07-24T11:51:55.2699447Z 2532 silly pacote range manifest for brorand@^1.1.0 fetched in 14ms
2026-07-24T11:51:55.2699650Z 2533 silly pacote range manifest for hmac-drbg@^1.0.1 fetched in 13ms
2026-07-24T11:51:55.2699868Z 2534 silly pacote range manifest for minimalistic-crypto-utils@^1.0.1 fetched in 13ms
2026-07-24T11:51:55.2700012Z 2535 silly pacote range manifest for isobject@^2.0.0 fetched in 5ms
2026-07-24T11:51:55.2700210Z 2536 silly pacote range manifest for kind-of@^4.0.0 fetched in 6ms
2026-07-24T11:51:55.2700486Z 2537 silly pacote range manifest for copy-descriptor@^0.1.0 fetched in 15ms
2026-07-24T11:51:55.2700737Z 2538 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/typed-array-buffer 12ms (from cache)
2026-07-24T11:51:55.2700909Z 2539 silly pacote range manifest for hash.js@^1.0.0 fetched in 20ms
2026-07-24T11:51:55.2701110Z 2540 silly pacote range manifest for ansi-regex@^5.0.1 fetched in 7ms
2026-07-24T11:51:55.2701310Z 2541 silly pacote range manifest for error-ex@^1.2.0 fetched in 8ms
2026-07-24T11:51:55.2701521Z 2542 silly pacote range manifest for call-bind-apply-helpers@^1.0.1 fetched in 7ms
2026-07-24T11:51:55.2701806Z 2543 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/asn1.js 25ms (from cache)
2026-07-24T11:51:55.2702038Z 2544 silly pacote range manifest for es-define-property@^1.0.0 fetched in 5ms
2026-07-24T11:51:55.2702245Z 2545 silly pacote range manifest for is-number@^7.0.0 fetched in 5ms
2026-07-24T11:51:55.2702461Z 2546 silly pacote range manifest for typed-array-buffer@^1.0.3 fetched in 19ms
2026-07-24T11:51:55.2702606Z 2547 silly pacote range manifest for gopd@^1.0.1 fetched in 6ms
2026-07-24T11:51:55.2702815Z 2548 silly pacote range manifest for get-intrinsic@^1.2.4 fetched in 5ms
2026-07-24T11:51:55.2703049Z 2549 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-utf8 13ms (from cache)
2026-07-24T11:51:55.2703216Z 2550 silly pacote range manifest for hash.js@^1.0.3 fetched in 3ms
2026-07-24T11:51:55.2703419Z 2551 silly pacote range manifest for to-buffer@^1.2.1 fetched in 3ms
2026-07-24T11:51:55.2703568Z 2552 silly pacote range manifest for asn1.js@^4.10.1 fetched in 30ms
2026-07-24T11:51:55.2703709Z 2553 silly pacote version manifest for isarray@1.0.0 fetched in 3ms
2026-07-24T11:51:55.2703946Z 2554 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/callsites 9ms (from cache)
2026-07-24T11:51:55.2704170Z 2555 silly pacote range manifest for is-utf8@^0.2.0 fetched in 15ms
2026-07-24T11:51:55.2704570Z 2556 silly pacote range manifest for callsites@^2.0.0 fetched in 10ms
2026-07-24T11:51:55.2704901Z 2557 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-typed-array 5ms (from cache)
2026-07-24T11:51:55.2705181Z 2558 silly pacote range manifest for is-typed-array@^1.1.14 fetched in 7ms
2026-07-24T11:51:55.2705434Z 2559 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/which-typed-array 2ms (from cache)
2026-07-24T11:51:55.2705671Z 2560 silly pacote range manifest for which-typed-array@^1.1.16 fetched in 5ms
2026-07-24T11:51:55.2705879Z 2561 silly pacote range manifest for call-bind@^1.0.9 fetched in 2ms
2026-07-24T11:51:55.2706087Z 2562 silly pacote range manifest for call-bound@^1.0.4 fetched in 3ms
2026-07-24T11:51:55.2706315Z 2563 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/for-each 3ms (from cache)
2026-07-24T11:51:55.2706581Z 2564 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/available-typed-arrays 4ms (from cache)
2026-07-24T11:51:55.2706808Z 2565 silly pacote range manifest for for-each@^0.3.5 fetched in 6ms
2026-07-24T11:51:55.2707021Z 2566 silly pacote range manifest for available-typed-arrays@^1.0.7 fetched in 7ms
2026-07-24T11:51:55.2707282Z 2567 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/possible-typed-array-names 1ms (from cache)
2026-07-24T11:51:55.2707533Z 2568 silly pacote range manifest for possible-typed-array-names@^1.0.0 fetched in 2ms
2026-07-24T11:51:55.2707779Z 2569 http fetch GET 200 http://binario.caixa:8081/repository/npm-all/is-callable 4ms (from cache)
2026-07-24T11:51:55.2708005Z 2570 silly pacote range manifest for is-callable@^1.2.7 fetched in 5ms
2026-07-24T11:51:55.2708152Z 2571 silly pacote range manifest for @angular/cdk@^7.3.7 fetched in 25ms
2026-07-24T11:51:55.2708301Z 2572 silly resolveWithNewModule @angular/cdk@7.3.7 checking installable status
2026-07-24T11:51:55.2708449Z 2573 silly pacote range manifest for @angular/core@^7.2.14 fetched in 25ms
2026-07-24T11:51:55.2708647Z 2574 silly resolveWithNewModule @angular/core@7.2.16 checking installable status
2026-07-24T11:51:55.2708889Z 2575 silly pacote range manifest for @angular/flex-layout@^7.0.0-beta.24 fetched in 26ms
2026-07-24T11:51:55.2709125Z 2576 silly resolveWithNewModule @angular/flex-layout@7.0.0-beta.24 checking installable status
2026-07-24T11:51:55.2709278Z 2577 silly pacote range manifest for @angular/material@^7.3.7 fetched in 26ms
2026-07-24T11:51:55.2709428Z 2578 silly resolveWithNewModule @angular/material@7.3.7 checking installable status
2026-07-24T11:51:55.2709661Z 2579 silly pacote range manifest for @angular/material-moment-adapter@^7.3.7 fetched in 26ms
2026-07-24T11:51:55.2709949Z 2580 silly resolveWithNewModule @angular/material-moment-adapter@7.3.7 checking installable status
2026-07-24T11:51:55.2710115Z 2581 silly pacote range manifest for @angular/forms@^7.2.14 fetched in 26ms
2026-07-24T11:51:55.2710268Z 2582 silly resolveWithNewModule @angular/forms@7.2.16 checking installable status
2026-07-24T11:51:55.2710494Z 2583 silly pacote range manifest for @angular/platform-browser@^7.2.14 fetched in 27ms
2026-07-24T11:51:55.2710722Z 2584 silly resolveWithNewModule @angular/platform-browser@7.2.16 checking installable status
2026-07-24T11:51:55.2710884Z 2585 silly pacote range manifest for @angular/common@^7.2.14 fetched in 34ms
2026-07-24T11:51:55.2711037Z 2586 silly resolveWithNewModule @angular/common@7.2.16 checking installable status
2026-07-24T11:51:55.2711189Z 2587 silly pacote range manifest for @angular/animations@^7.2.14 fetched in 34ms
2026-07-24T11:51:55.2711347Z 2588 silly resolveWithNewModule @angular/animations@7.2.16 checking installable status
2026-07-24T11:51:55.2711503Z 2589 silly pacote range manifest for @angular/compiler@^7.2.14 fetched in 34ms
2026-07-24T11:51:55.2711654Z 2590 silly resolveWithNewModule @angular/compiler@7.2.16 checking installable status
2026-07-24T11:51:55.2711882Z 2591 silly pacote range manifest for @angular/platform-browser-dynamic@^7.2.14 fetched in 7ms
2026-07-24T11:51:55.2712130Z 2592 silly resolveWithNewModule @angular/platform-browser-dynamic@7.2.16 checking installable status
2026-07-24T11:51:55.2712291Z 2593 silly pacote version manifest for @types/xlsx@0.0.36 fetched in 8ms
2026-07-24T11:51:55.2712470Z 2594 silly resolveWithNewModule @types/xlsx@0.0.36 checking installable status
2026-07-24T11:51:55.2712679Z 2595 silly pacote range manifest for core-js@^2.6.11 fetched in 8ms
2026-07-24T11:51:55.2712886Z 2596 silly resolveWithNewModule core-js@2.6.12 checking installable status
2026-07-24T11:51:55.2713038Z 2597 silly pacote version manifest for @types/html2canvas@0.0.35 fetched in 8ms
2026-07-24T11:51:55.2713187Z 2598 silly resolveWithNewModule @types/html2canvas@0.0.35 checking installable status
2026-07-24T11:51:55.2713411Z 2599 silly pacote range manifest for chartjs-plugin-datalabels@^0.7.0 fetched in 9ms
2026-07-24T11:51:55.2713644Z 2600 silly resolveWithNewModule chartjs-plugin-datalabels@0.7.0 checking installable status
2026-07-24T11:51:55.2713801Z 2601 silly pacote version manifest for chart.js@2.8.0 fetched in 9ms
2026-07-24T11:51:55.2713947Z 2602 silly resolveWithNewModule chart.js@2.8.0 checking installable status
2026-07-24T11:51:55.2714096Z 2603 silly pacote range manifest for @angular/router@^7.2.14 fetched in 9ms
2026-07-24T11:51:55.2714246Z 2604 silly resolveWithNewModule @angular/router@7.2.16 checking installable status
2026-07-24T11:51:55.2714451Z 2605 silly pacote range manifest for file-system@^2.2.2 fetched in 5ms
2026-07-24T11:51:55.2714667Z 2606 silly resolveWithNewModule file-system@2.2.2 checking installable status
2026-07-24T11:51:55.2714881Z 2607 silly pacote range manifest for font-awesome@^4.7.0 fetched in 8ms
2026-07-24T11:51:55.2715095Z 2608 silly resolveWithNewModule font-awesome@4.7.0 checking installable status
2026-07-24T11:51:55.2715308Z 2609 silly pacote range manifest for fs-filesystem@^2.1.2 fetched in 8ms
2026-07-24T11:51:55.2715523Z 2610 silly resolveWithNewModule fs-filesystem@2.1.2 checking installable status
2026-07-24T11:51:55.2715675Z 2611 silly pacote range manifest for jspdf@^1.5.3 fetched in 8ms
2026-07-24T11:51:55.2715815Z 2612 silly resolveWithNewModule jspdf@1.5.3 checking installable status
2026-07-24T11:51:55.2715964Z 2613 silly pacote range manifest for hammerjs@^2.0.8 fetched in 9ms
2026-07-24T11:51:55.2716110Z 2614 silly resolveWithNewModule hammerjs@2.0.8 checking installable status
2026-07-24T11:51:55.2716324Z 2615 silly pacote range manifest for keycloak-angular@^5.1.0 fetched in 9ms
2026-07-24T11:51:55.2716547Z 2616 silly resolveWithNewModule keycloak-angular@5.1.0 checking installable status
2026-07-24T11:51:55.2716786Z 2617 silly pacote range manifest for keycloak-js@^6.0.1 fetched in 8ms
2026-07-24T11:51:55.2717000Z 2618 silly resolveWithNewModule keycloak-js@6.0.1 checking installable status
2026-07-24T11:51:55.2717215Z 2619 silly pacote range manifest for html2canvas@^1.0.0-rc.7 fetched in 10ms
2026-07-24T11:51:55.2717371Z 2620 silly resolveWithNewModule html2canvas@1.4.1 checking installable status
2026-07-24T11:51:55.2717521Z 2621 silly pacote range manifest for lodash@^4.17.20 fetched in 14ms
2026-07-24T11:51:55.2717668Z 2622 silly resolveWithNewModule lodash@4.18.1 checking installable status
2026-07-24T11:51:55.2717817Z 2623 silly pacote range manifest for moment@^2.29.4 fetched in 14ms
2026-07-24T11:51:55.2717961Z 2624 silly resolveWithNewModule moment@2.30.1 checking installable status
2026-07-24T11:51:55.2718172Z 2625 silly pacote version manifest for ng2-charts@2.2.3 fetched in 15ms
2026-07-24T11:51:55.2718378Z 2626 silly resolveWithNewModule ng2-charts@2.2.3 checking installable status
2026-07-24T11:51:55.2718635Z 2627 silly pacote range manifest for ngx-bootstrap@^4.0.0 fetched in 13ms
2026-07-24T11:51:55.2718866Z 2628 silly resolveWithNewModule ngx-bootstrap@4.3.0 checking installable status
2026-07-24T11:51:55.2719080Z 2629 silly pacote range manifest for ngx-clipboard@^10.0.0 fetched in 12ms
2026-07-24T11:51:55.2719300Z 2630 silly resolveWithNewModule ngx-clipboard@10.0.0 checking installable status
2026-07-24T11:51:55.2719511Z 2631 silly pacote range manifest for ngx-currency@^2.5.2 fetched in 9ms
2026-07-24T11:51:55.2719717Z 2632 silly resolveWithNewModule ngx-currency@2.5.3 checking installable status
2026-07-24T11:51:55.2719967Z 2633 silly pacote range manifest for ngx-editor@^4.1.1 fetched in 10ms
2026-07-24T11:51:55.2720181Z 2634 silly resolveWithNewModule ngx-editor@4.1.1 checking installable status
2026-07-24T11:51:55.2720390Z 2635 silly pacote range manifest for ngx-mask@^8.1.6 fetched in 10ms
2026-07-24T11:51:55.2720598Z 2636 silly resolveWithNewModule ngx-mask@8.2.0 checking installable status
2026-07-24T11:51:55.2720807Z 2637 silly pacote range manifest for ngx-toastr@^10.1.0 fetched in 10ms
2026-07-24T11:51:55.2721019Z 2638 silly resolveWithNewModule ngx-toastr@10.2.0 checking installable status
2026-07-24T11:51:55.2721223Z 2639 silly pacote range manifest for ngx-spinner@^7.2.0 fetched in 11ms
2026-07-24T11:51:55.2721434Z 2640 silly resolveWithNewModule ngx-spinner@7.2.0 checking installable status
2026-07-24T11:51:55.2721578Z 2641 silly pacote range manifest for rxjs@^6.6.3 fetched in 5ms
2026-07-24T11:51:55.2721721Z 2642 silly resolveWithNewModule rxjs@6.6.7 checking installable status
2026-07-24T11:51:55.2721927Z 2643 silly pacote version manifest for ts-xlsx@0.0.11 fetched in 5ms
2026-07-24T11:51:55.2722137Z 2644 silly resolveWithNewModule ts-xlsx@0.0.11 checking installable status
2026-07-24T11:51:55.2722284Z 2645 silly pacote range manifest for tslib@^2.2.0 fetched in 5ms
2026-07-24T11:51:55.2722421Z 2646 silly resolveWithNewModule tslib@2.8.1 checking installable status
2026-07-24T11:51:55.2722567Z 2647 silly pacote range manifest for zone.js@~0.8.26 fetched in 4ms
2026-07-24T11:51:55.2722711Z 2648 silly resolveWithNewModule zone.js@0.8.29 checking installable status
2026-07-24T11:51:55.2722852Z 2649 silly pacote range manifest for tslib@^1.9.0 fetched in 1ms
2026-07-24T11:51:55.2722995Z 2650 silly resolveWithNewModule tslib@1.14.1 checking installable status
2026-07-24T11:51:55.2723138Z 2651 silly pacote range manifest for tslib@^1.7.1 fetched in 1ms
2026-07-24T11:51:55.2723273Z 2652 silly resolveWithNewModule tslib@1.14.1 checking installable status
2026-07-24T11:51:55.2723418Z 2653 silly pacote range manifest for parse5@^5.0.0 fetched in 1ms
2026-07-24T11:51:55.2723560Z 2654 silly resolveWithNewModule parse5@5.1.1 checking installable status
2026-07-24T11:51:55.2723702Z 2655 silly pacote range manifest for tslib@^1.9.0 fetched in 1ms
2026-07-24T11:51:55.2723843Z 2656 silly resolveWithNewModule tslib@1.14.1 checking installable status
2026-07-24T11:51:55.2724020Z 2657 silly pacote range manifest for tslib@^1.9.0 fetched in 1ms
2026-07-24T11:51:55.2724155Z 2658 silly resolveWithNewModule tslib@1.14.1 checking installable status
2026-07-24T11:51:55.2724285Z 2659 silly pacote range manifest for tslib@^1.9.0 fetched in 0ms
2026-07-24T11:51:55.2724426Z 2660 silly resolveWithNewModule tslib@1.14.1 checking installable status
2026-07-24T11:51:55.2724569Z 2661 silly pacote range manifest for tslib@^1.7.1 fetched in 0ms
2026-07-24T11:51:55.2724706Z 2662 silly resolveWithNewModule tslib@1.14.1 checking installable status
2026-07-24T11:51:55.2724843Z 2663 silly pacote range manifest for tslib@^1.9.0 fetched in 1ms
2026-07-24T11:51:55.2724983Z 2664 silly resolveWithNewModule tslib@1.14.1 checking installable status
2026-07-24T11:51:55.2725114Z 2665 silly pacote range manifest for tslib@^1.7.1 fetched in 1ms
2026-07-24T11:51:55.2725252Z 2666 silly resolveWithNewModule tslib@1.14.1 checking installable status
2026-07-24T11:51:55.2725394Z 2667 silly pacote range manifest for tslib@^1.7.1 fetched in 1ms
2026-07-24T11:51:55.2725539Z 2668 silly resolveWithNewModule tslib@1.14.1 checking installable status
2026-07-24T11:51:55.2725678Z 2669 silly pacote range manifest for tslib@^1.9.0 fetched in 1ms
2026-07-24T11:51:55.2725818Z 2670 silly resolveWithNewModule tslib@1.14.1 checking installable status
2026-07-24T11:51:55.2725953Z 2671 silly pacote range manifest for tslib@^1.9.0 fetched in 1ms
2026-07-24T11:51:55.2726086Z 2672 silly resolveWithNewModule tslib@1.14.1 checking installable status
2026-07-24T11:51:55.2726223Z 2673 silly pacote range manifest for tslib@^1.9.0 fetched in 1ms
2026-07-24T11:51:55.2726388Z 2674 silly resolveWithNewModule tslib@1.14.1 checking installable status
2026-07-24T11:51:55.2726535Z 2675 silly pacote range manifest for @types/jquery@* fetched in 1ms
2026-07-24T11:51:55.2726681Z 2676 silly resolveWithNewModule @types/jquery@4.0.1 checking installable status
2026-07-24T11:51:55.2726829Z 2677 silly pacote range manifest for xlsx@* fetched in 0ms
2026-07-24T11:51:55.2726973Z 2678 silly resolveWithNewModule xlsx@0.18.5 checking installable status
2026-07-24T11:51:55.2727110Z 2679 silly pacote range manifest for ssf@~0.11.2 fetched in 1ms
2026-07-24T11:51:55.2727252Z 2680 silly resolveWithNewModule ssf@0.11.2 checking installable status
2026-07-24T11:51:55.2727392Z 2681 silly pacote range manifest for wmf@~1.0.1 fetched in 1ms
2026-07-24T11:51:55.2727531Z 2682 silly resolveWithNewModule wmf@1.0.2 checking installable status
2026-07-24T11:51:55.2727673Z 2683 silly pacote range manifest for codepage@~1.15.0 fetched in 2ms
2026-07-24T11:51:55.2727817Z 2684 silly resolveWithNewModule codepage@1.15.0 checking installable status
2026-07-24T11:51:55.2728027Z 2685 silly pacote range manifest for adler-32@~1.3.0 fetched in 2ms
2026-07-24T11:51:55.2728237Z 2686 silly resolveWithNewModule adler-32@1.3.1 checking installable status
2026-07-24T11:51:55.2728385Z 2687 silly pacote range manifest for word@~0.3.0 fetched in 2ms
2026-07-24T11:51:55.2728524Z 2688 silly resolveWithNewModule word@0.3.0 checking installable status
2026-07-24T11:51:55.2728784Z 2689 silly pacote range manifest for crc-32@~1.2.1 fetched in 2ms
2026-07-24T11:51:55.2728989Z 2690 silly resolveWithNewModule crc-32@1.2.2 checking installable status
2026-07-24T11:51:55.2729134Z 2691 silly pacote range manifest for cfb@~1.2.1 fetched in 3ms
2026-07-24T11:51:55.2729268Z 2692 silly resolveWithNewModule cfb@1.2.2 checking installable status
2026-07-24T11:51:55.2729411Z 2693 silly pacote range manifest for frac@~1.1.2 fetched in 0ms
2026-07-24T11:51:55.2729553Z 2694 silly resolveWithNewModule frac@1.1.2 checking installable status
2026-07-24T11:51:55.2729762Z 2695 silly pacote range manifest for chartjs-color@^2.1.0 fetched in 2ms
2026-07-24T11:51:55.2729978Z 2696 silly resolveWithNewModule chartjs-color@2.4.1 checking installable status
2026-07-24T11:51:55.2730190Z 2697 silly pacote range manifest for color-convert@^1.9.3 fetched in 1ms
2026-07-24T11:51:55.2730464Z 2698 silly resolveWithNewModule color-convert@1.9.3 checking installable status
2026-07-24T11:51:55.2730723Z 2699 silly pacote range manifest for chartjs-color-string@^0.6.0 fetched in 2ms
2026-07-24T11:51:55.2730951Z 2700 silly resolveWithNewModule chartjs-color-string@0.6.0 checking installable status
2026-07-24T11:51:55.2731168Z 2701 silly pacote range manifest for color-name@^1.0.0 fetched in 1ms
2026-07-24T11:51:55.2731380Z 2702 silly resolveWithNewModule color-name@1.1.4 checking installable status
2026-07-24T11:51:55.2731590Z 2703 silly pacote version manifest for color-name@1.1.3 fetched in 0ms
2026-07-24T11:51:55.2731801Z 2704 silly resolveWithNewModule color-name@1.1.3 checking installable status
2026-07-24T11:51:55.2732007Z 2705 silly pacote range manifest for file-match@^1.0.1 fetched in 0ms
2026-07-24T11:51:55.2732216Z 2706 silly resolveWithNewModule file-match@1.0.2 checking installable status
2026-07-24T11:51:55.2732426Z 2707 silly pacote range manifest for utils-extend@^1.0.4 fetched in 1ms
2026-07-24T11:51:55.2732642Z 2708 silly resolveWithNewModule utils-extend@1.0.8 checking installable status
2026-07-24T11:51:55.2732863Z 2709 silly pacote range manifest for babel-polyfill@^6.26.0 fetched in 1ms
2026-07-24T11:51:55.2733083Z 2710 silly resolveWithNewModule babel-polyfill@6.26.0 checking installable status
2026-07-24T11:51:55.2733300Z 2711 silly pacote range manifest for babel-runtime@^6.26.0 fetched in 1ms
2026-07-24T11:51:55.2733511Z 2712 silly resolveWithNewModule babel-runtime@6.26.0 checking installable status
2026-07-24T11:51:55.2733663Z 2713 silly pacote range manifest for bluebird@^3.5.1 fetched in 2ms
2026-07-24T11:51:55.2733839Z 2714 silly resolveWithNewModule bluebird@3.7.2 checking installable status
2026-07-24T11:51:55.2733987Z 2715 silly pacote range manifest for ramda@^0.25.0 fetched in 2ms
2026-07-24T11:51:55.2734131Z 2716 silly resolveWithNewModule ramda@0.25.0 checking installable status
2026-07-24T11:51:55.2734349Z 2717 silly pacote range manifest for regenerator-runtime@^0.10.5 fetched in 0ms
2026-07-24T11:51:55.2734575Z 2718 silly resolveWithNewModule regenerator-runtime@0.10.5 checking installable status
2026-07-24T11:51:55.2734798Z 2719 silly pacote range manifest for regenerator-runtime@^0.11.0 fetched in 1ms
2026-07-24T11:51:55.2735023Z 2720 silly resolveWithNewModule regenerator-runtime@0.11.1 checking installable status
2026-07-24T11:51:55.2735242Z 2721 silly pacote range manifest for css-line-break@^2.1.0 fetched in 1ms
2026-07-24T11:51:55.2735459Z 2722 silly resolveWithNewModule css-line-break@2.1.0 checking installable status
2026-07-24T11:51:55.2735678Z 2723 silly pacote range manifest for text-segmentation@^1.0.3 fetched in 1ms
2026-07-24T11:51:55.2735901Z 2724 silly resolveWithNewModule text-segmentation@1.0.3 checking installable status
2026-07-24T11:51:55.2736054Z 2725 silly pacote range manifest for utrie@^1.0.2 fetched in 1ms
2026-07-24T11:51:55.2736191Z 2726 silly resolveWithNewModule utrie@1.0.2 checking installable status
2026-07-24T11:51:55.2736411Z 2727 silly pacote range manifest for base64-arraybuffer@^1.0.2 fetched in 1ms
2026-07-24T11:51:55.2736637Z 2728 silly resolveWithNewModule base64-arraybuffer@1.0.2 checking installable status
2026-07-24T11:51:55.2736792Z 2729 silly pacote version manifest for canvg@1.5.3 fetched in 34ms
2026-07-24T11:51:55.2736937Z 2730 silly resolveWithNewModule canvg@1.5.3 checking installable status
2026-07-24T11:51:55.2737151Z 2731 silly pacote version manifest for stackblur-canvas@2.2.0 fetched in 31ms
2026-07-24T11:51:55.2737369Z 2732 silly resolveWithNewModule stackblur-canvas@2.2.0 checking installable status
2026-07-24T11:51:55.2737515Z 2733 silly pacote version manifest for omggif@1.0.7 fetched in 35ms
2026-07-24T11:51:55.2737663Z 2734 silly resolveWithNewModule omggif@1.0.7 checking installable status
2026-07-24T11:51:55.2737877Z 2735 silly pacote version manifest for promise-polyfill@8.1.0 fetched in 31ms
2026-07-24T11:51:55.2738096Z 2736 silly resolveWithNewModule promise-polyfill@8.1.0 checking installable status
2026-07-24T11:51:55.2738319Z 2737 silly pacote version manifest for html2canvas@1.0.0-alpha.12 fetched in 32ms
2026-07-24T11:51:55.2738620Z 2738 silly resolveWithNewModule html2canvas@1.0.0-alpha.12 checking installable status
2026-07-24T11:51:55.2738888Z 2739 silly pacote Retrying git command: ls-remote -h -t ssh://git@github.com/eligrey/FileSaver.js.git attempt # 2
2026-07-24T11:51:55.2739151Z 2740 silly pacote Retrying git command: ls-remote -h -t ssh://git@github.com/eligrey/FileSaver.js.git attempt # 3
2026-07-24T11:51:55.2739433Z 2741 silly fetchPackageMetaData error for file-saver@github:eligrey/FileSaver.js#1.3.8 Error while executing:
2026-07-24T11:51:55.2739701Z 2741 silly fetchPackageMetaData /bin/git ls-remote -h -t ssh://git@github.com/eligrey/FileSaver.js.git
2026-07-24T11:51:55.2739845Z 2741 silly fetchPackageMetaData
2026-07-24T11:51:55.2739988Z 2741 silly fetchPackageMetaData ssh: connect to host github.com port 22: Connection timed out
2026-07-24T11:51:55.2740143Z 2741 silly fetchPackageMetaData fatal: Could not read from remote repository.
2026-07-24T11:51:55.2740275Z 2741 silly fetchPackageMetaData
2026-07-24T11:51:55.2740405Z 2741 silly fetchPackageMetaData Please make sure you have the correct access rights
2026-07-24T11:51:55.2740552Z 2741 silly fetchPackageMetaData and the repository exists.
2026-07-24T11:51:55.2740677Z 2741 silly fetchPackageMetaData
2026-07-24T11:51:55.2740801Z 2741 silly fetchPackageMetaData exited with error code: 128
2026-07-24T11:51:55.2740943Z 2742 timing stage:rollbackFailedOptional Completed in 0ms
2026-07-24T11:51:55.2741088Z 2743 timing stage:runTopLevelLifecycles Completed in 671048ms
2026-07-24T11:51:55.2741263Z 2744 silly saveTree siceds@1.31.0-5
2026-07-24T11:51:55.2741523Z 2744 silly saveTree ├─┬ @angular/animations@7.2.16
2026-07-24T11:51:55.2741703Z 2744 silly saveTree │ └── tslib@1.14.1
2026-07-24T11:51:55.2741879Z 2744 silly saveTree ├─┬ @angular/cdk@7.3.7
2026-07-24T11:51:55.2742049Z 2744 silly saveTree │ ├── parse5@5.1.1
2026-07-24T11:51:55.2742214Z 2744 silly saveTree │ └── tslib@1.14.1
2026-07-24T11:51:55.2742394Z 2744 silly saveTree ├─┬ @angular/common@7.2.16
2026-07-24T11:51:55.2742562Z 2744 silly saveTree │ └── tslib@1.14.1
2026-07-24T11:51:55.2742740Z 2744 silly saveTree ├─┬ @angular/compiler@7.2.16
2026-07-24T11:51:55.2742911Z 2744 silly saveTree │ └── tslib@1.14.1
2026-07-24T11:51:55.2743081Z 2744 silly saveTree ├─┬ @angular/core@7.2.16
2026-07-24T11:51:55.2743250Z 2744 silly saveTree │ └── tslib@1.14.1
2026-07-24T11:51:55.2743431Z 2744 silly saveTree ├─┬ @angular/flex-layout@7.0.0-beta.24
2026-07-24T11:51:55.2743608Z 2744 silly saveTree │ └── tslib@1.14.1
2026-07-24T11:51:55.2743780Z 2744 silly saveTree ├─┬ @angular/forms@7.2.16
2026-07-24T11:51:55.2743956Z 2744 silly saveTree │ └── tslib@1.14.1
2026-07-24T11:51:55.2744146Z 2744 silly saveTree ├─┬ @angular/material-moment-adapter@7.3.7
2026-07-24T11:51:55.2744321Z 2744 silly saveTree │ └── tslib@1.14.1
2026-07-24T11:51:55.2744488Z 2744 silly saveTree ├─┬ @angular/material@7.3.7
2026-07-24T11:51:55.2744656Z 2744 silly saveTree │ └── tslib@1.14.1
2026-07-24T11:51:55.2744855Z 2744 silly saveTree ├─┬ @angular/platform-browser-dynamic@7.2.16
2026-07-24T11:51:55.2745030Z 2744 silly saveTree │ └── tslib@1.14.1
2026-07-24T11:51:55.2745211Z 2744 silly saveTree ├─┬ @angular/platform-browser@7.2.16
2026-07-24T11:51:55.2745387Z 2744 silly saveTree │ └── tslib@1.14.1
2026-07-24T11:51:55.2745553Z 2744 silly saveTree ├─┬ @angular/router@7.2.16
2026-07-24T11:51:55.2745721Z 2744 silly saveTree │ └── tslib@1.14.1
2026-07-24T11:51:55.2745899Z 2744 silly saveTree ├─┬ @types/html2canvas@0.0.35
2026-07-24T11:51:55.2746078Z 2744 silly saveTree │ └── @types/jquery@4.0.1
2026-07-24T11:51:55.2746261Z 2744 silly saveTree ├─┬ @types/xlsx@0.0.36
2026-07-24T11:51:55.2746434Z 2744 silly saveTree │ └─┬ xlsx@0.18.5
2026-07-24T11:51:55.2746597Z 2744 silly saveTree │   ├── adler-32@1.3.1
2026-07-24T11:51:55.2746764Z 2744 silly saveTree │   ├─┬ cfb@1.2.2
2026-07-24T11:51:55.2746932Z 2744 silly saveTree │   │ └── crc-32@1.2.2
2026-07-24T11:51:55.2747104Z 2744 silly saveTree │   ├── codepage@1.15.0
2026-07-24T11:51:55.2747308Z 2744 silly saveTree │   ├── crc-32@1.2.2
2026-07-24T11:51:55.2747466Z 2744 silly saveTree │   ├─┬ ssf@0.11.2
2026-07-24T11:51:55.2747630Z 2744 silly saveTree │   │ └── frac@1.1.2
2026-07-24T11:51:55.2747794Z 2744 silly saveTree │   ├── wmf@1.0.2
2026-07-24T11:51:55.2747953Z 2744 silly saveTree │   └── word@0.3.0
2026-07-24T11:51:55.2748114Z 2744 silly saveTree ├─┬ chart.js@2.8.0
2026-07-24T11:51:55.2748283Z 2744 silly saveTree │ ├─┬ chartjs-color@2.4.1
2026-07-24T11:51:55.2748464Z 2744 silly saveTree │ │ ├─┬ chartjs-color-string@0.6.0
2026-07-24T11:51:55.2748703Z 2744 silly saveTree │ │ │ └── color-name@1.1.4
2026-07-24T11:51:55.2748896Z 2744 silly saveTree │ │ └─┬ color-convert@1.9.3
2026-07-24T11:51:55.2749071Z 2744 silly saveTree │ │   └── color-name@1.1.3
2026-07-24T11:51:55.2749239Z 2744 silly saveTree │ └── moment@2.30.1
2026-07-24T11:51:55.2749425Z 2744 silly saveTree ├── chartjs-plugin-datalabels@0.7.0
2026-07-24T11:51:55.2749595Z 2744 silly saveTree ├── core-js@2.6.12
2026-07-24T11:51:55.2749774Z 2744 silly saveTree ├─┬ file-system@2.2.2
2026-07-24T11:51:55.2749947Z 2744 silly saveTree │ ├─┬ file-match@1.0.2
2026-07-24T11:51:55.2750122Z 2744 silly saveTree │ │ └── utils-extend@1.0.8
2026-07-24T11:51:55.2750293Z 2744 silly saveTree │ └── utils-extend@1.0.8
2026-07-24T11:51:55.2750466Z 2744 silly saveTree ├── font-awesome@4.7.0
2026-07-24T11:51:55.2750633Z 2744 silly saveTree ├─┬ fs-filesystem@2.1.2
2026-07-24T11:51:55.2750812Z 2744 silly saveTree │ ├─┬ babel-polyfill@6.26.0
2026-07-24T11:51:55.2750992Z 2744 silly saveTree │ │ ├─┬ babel-runtime@6.26.0
2026-07-24T11:51:55.2751216Z 2744 silly saveTree │ │ │ └── regenerator-runtime@0.11.1
2026-07-24T11:51:55.2751406Z 2744 silly saveTree │ │ └── regenerator-runtime@0.10.5
2026-07-24T11:51:55.2751582Z 2744 silly saveTree │ ├── babel-runtime@6.26.0
2026-07-24T11:51:55.2751745Z 2744 silly saveTree │ ├── bluebird@3.7.2
2026-07-24T11:51:55.2751910Z 2744 silly saveTree │ └── ramda@0.25.0
2026-07-24T11:51:55.2752072Z 2744 silly saveTree ├── hammerjs@2.0.8
2026-07-24T11:51:55.2752251Z 2744 silly saveTree ├─┬ html2canvas@1.4.1
2026-07-24T11:51:55.2752426Z 2744 silly saveTree │ ├─┬ css-line-break@2.1.0
2026-07-24T11:51:55.2752592Z 2744 silly saveTree │ │ └─┬ utrie@1.0.2
2026-07-24T11:51:55.2752766Z 2744 silly saveTree │ │   └── base64-arraybuffer@1.0.2
2026-07-24T11:51:55.2752949Z 2744 silly saveTree │ └── text-segmentation@1.0.3
2026-07-24T11:51:55.2753120Z 2744 silly saveTree ├─┬ jspdf@1.5.3
2026-07-24T11:51:55.2753283Z 2744 silly saveTree │ ├── canvg@1.5.3
2026-07-24T11:51:55.2753463Z 2744 silly saveTree │ ├── html2canvas@1.0.0-alpha.12
2026-07-24T11:51:55.2753642Z 2744 silly saveTree │ ├── omggif@1.0.7
2026-07-24T11:51:55.2753809Z 2744 silly saveTree │ ├── promise-polyfill@8.1.0
2026-07-24T11:51:55.2753990Z 2744 silly saveTree │ └── stackblur-canvas@2.2.0
2026-07-24T11:51:55.2754166Z 2744 silly saveTree ├── keycloak-angular@5.1.0
2026-07-24T11:51:55.2754338Z 2744 silly saveTree ├── keycloak-js@6.0.1
2026-07-24T11:51:55.2754503Z 2744 silly saveTree ├── lodash@4.18.1
2026-07-24T11:51:55.2754674Z 2744 silly saveTree ├── moment@2.30.1
2026-07-24T11:51:55.2754833Z 2744 silly saveTree ├── ng2-charts@2.2.3
2026-07-24T11:51:55.2755004Z 2744 silly saveTree ├── ngx-bootstrap@4.3.0
2026-07-24T11:51:55.2755180Z 2744 silly saveTree ├── ngx-clipboard@10.0.0
2026-07-24T11:51:55.2755352Z 2744 silly saveTree ├─┬ ngx-currency@2.5.3
2026-07-24T11:51:55.2755518Z 2744 silly saveTree │ └── tslib@2.8.1
2026-07-24T11:51:55.2755674Z 2744 silly saveTree ├── ngx-editor@4.1.1
2026-07-24T11:51:55.2755839Z 2744 silly saveTree ├── ngx-mask@8.2.0
2026-07-24T11:51:55.2756012Z 2744 silly saveTree ├── ngx-spinner@7.2.0
2026-07-24T11:51:55.2756181Z 2744 silly saveTree ├── ngx-toastr@10.2.0
2026-07-24T11:51:55.2756344Z 2744 silly saveTree ├── rxjs@6.6.7
2026-07-24T11:51:55.2756509Z 2744 silly saveTree ├── ts-xlsx@0.0.11
2026-07-24T11:51:55.2756664Z 2744 silly saveTree ├── tslib@2.8.1
2026-07-24T11:51:55.2756829Z 2744 silly saveTree └── zone.js@0.8.29
2026-07-24T11:51:55.2756992Z 2745 verbose stack Error: exited with error code: 128
2026-07-24T11:51:55.2757295Z 2745 verbose stack     at ChildProcess.<anonymous> (/opt/ads-agent/_work/_tool/node/10.24.1/x64/lib/node_modules/npm/node_modules/pacote/lib/util/finished.js:12:19)
2026-07-24T11:51:55.2757496Z 2745 verbose stack     at ChildProcess.emit (events.js:198:13)
2026-07-24T11:51:55.2757655Z 2745 verbose stack     at maybeClose (internal/child_process.js:982:16)
2026-07-24T11:51:55.2757824Z 2745 verbose stack     at Process.ChildProcess._handle.onexit (internal/child_process.js:259:5)
2026-07-24T11:51:55.2758018Z 2746 verbose cwd /opt/ads-agent/_work/341/s/web
2026-07-24T11:51:55.2758207Z 2747 verbose Linux 5.14.0-362.8.1.el9_3.x86_64
2026-07-24T11:51:55.2758497Z 2748 verbose argv "/opt/ads-agent/_work/_tool/node/10.24.1/x64/bin/node" "/opt/ads-agent/_work/_tool/node/10.24.1/x64/bin/npm" "install" "--no-audit" "--verbose"
2026-07-24T11:51:55.2758721Z 2749 verbose node v10.24.1
2026-07-24T11:51:55.2758832Z 2750 verbose npm  v6.14.12
2026-07-24T11:51:55.2758945Z 2751 error Error while executing:
2026-07-24T11:51:55.2759149Z 2751 error /bin/git ls-remote -h -t ssh://git@github.com/eligrey/FileSaver.js.git
2026-07-24T11:51:55.2759272Z 2751 error
2026-07-24T11:51:55.2759394Z 2751 error ssh: connect to host github.com port 22: Connection timed out
2026-07-24T11:51:55.2759537Z 2751 error fatal: Could not read from remote repository.
2026-07-24T11:51:55.2759649Z 2751 error
2026-07-24T11:51:55.2759765Z 2751 error Please make sure you have the correct access rights
2026-07-24T11:51:55.2759887Z 2751 error and the repository exists.
2026-07-24T11:51:55.2760027Z 2751 error
2026-07-24T11:51:55.2760134Z 2751 error exited with error code: 128
2026-07-24T11:51:55.2760291Z 2752 verbose exit [ 1, true ]
2026-07-24T11:51:55.2760345Z 
2026-07-24T11:51:55.2784845Z ##[error]Error: Npm failed with return code: 1
2026-07-24T11:51:55.2792439Z ##[section]Finishing: npm install



# Variable 'ImageBuild_OKD' was defined in the Variables tab
# Variable 'nome_imagem' was defined in the Variables tab
# Variable 'SITE' was defined in the Variables tab
# Variable 'tag_imagem' was defined in the Variables tab
# Variable 'TemplateBuild_OKD' was defined in the Variables tab
# Variable 'TemplateVersaoProduto_OKD' was defined in the Variables tab
# Variable 'version.app' was defined in the Variables tab
# Variable Group 'BUILD_VARIABLES' was defined in the Variables tab
# Variable Group 'OKD-REGISTRY-BUILD' was defined in the Variables tab
# Variable Group 'OKD-REGISTRY-CENTRALIZADO' was defined in the Variables tab
# Variable Group 'SONAR_VARIABLES - PRODUTOS' was defined in the Variables tab
# Variable Group 'SAST_FORTIFY_COMUNIDADE_PESSOAS' was defined in the Variables tab
name: $(version.app)
jobs:
- job: Job_1
  displayName: Agent job 1
  pool:
    name: Build-Linux-Node
  steps:
  - checkout: self
    clean: true
  - task: Bash@3
    displayName: Bash Script
    inputs:
      targetType: inline
      script: npm install --legacy-peer-deps
  - task: Bash@3
    displayName: Validação da VEC
    enabled: False
    inputs:
      targetType: inline
      script: "echo \"##[section]branch/tag: $BUILD_SOURCEBRANCHNAME\"\n\necho \"##[warning] -------------------- ATENÇÃO --------------------\n##[warning] Foi definido que a partir de 01/2025 apenas compilações oriundas de tag dentro do padrão estabelecido no PPDS poderão ser implantadas em HMP/PRD.\n##[warning] Para mais informações visite https://caixa.sharepoint.com/sites/PPDS/SitePages/GCM_Diretrizes_Padrao_Baseline.aspx ou consulte a GEQTI04\n-------------------------------------------------\"\n\npontos=`echo ${BUILD_SOURCEBRANCHNAME//[^\\.]} | sed 's/\\./\\.\\n/g' | wc -w`\nnumber=`echo $BUILD_SOURCEBRANCHNAME | sed 's/\\.//g'`\n\nif [[ ${pontos} = 3 ]];then\nif [[ ${number} =~ ^([0-9]+)$ ]];then\necho \"VEC $BUILD_SOURCEBRANCHNAME dentro do padrão estabelecido pelo PPDS.\nPacote apto a ser implantado em HMP/PRD.\"\nvec='true'\necho \"##vso[build.updatebuildnumber]\"$BUILD_SOURCEBRANCHNAME\"\"\nelse\necho \"A TAG $BUILD_SOURCEBRANCHNAME utilizada não se encontra dentro do padrão estabelecido pelo PPDS e este pacote não poderá ser implantado nos ambientes HMP/PRD.\"\nvec='false'\nfi\nelse\necho \"Foi selecionada para compilação uma branch ou tag fora do padrão estabelcido no PPDS. Esteja ciente de que este pacote poderá ser implantado somente em ambientes NPRD\"\nvec='false'\nfi\necho \"##[section]Valida VEC: $vec\"\necho \"##vso[task.setvariable variable=valida.vec;]$vec\"\n\necho \"------------------------------------------------- \nps: Essa regra se aplicará somente a projetos que possuem infra HMP/PRD criada na esteira devops.\nAté o presente momento esse passo é meramente INFORMATIVO, a aplicação da trava será realizada somente em janeiro de 2025\""
  - task: Bash@3
    displayName: Localização do Repositório
    inputs:
      targetType: inline
      script: >
        if [[ "$BUILD_REPOSITORY_URI" == *"github.com"* ]]; then

        echo "É um repositório do GitHub"

        REPO_FINAL_NAME=`basename "$BUILD_REPOSITORY_URI" .git`

        echo "##vso[task.setvariable variable=fortify_disable;]gecmi"

        echo "##vso[task.setvariable variable=sonar_disable;]true"

        else

        echo "É um repositório do Devops.Caixa"

        REPO_FINAL_NAME=`echo $(Build.Repository.Name)`

        fi

        echo "Nome do repositório: $REPO_FINAL_NAME"

        echo "##vso[task.setvariable variable=REPO_FINAL_NAME;]$REPO_FINAL_NAME"
  - task: Bash@3
    displayName: Validação da VEC
    inputs:
      targetType: inline
      script: "echo \"##[section]branch/tag: $BUILD_SOURCEBRANCHNAME\"\n\necho \"##[warning] -------------------- ATENÇÃO --------------------\n##[warning] Foi definido conforme CE GEQTI 011/2024 que a partir de 03/2025 apenas compilações oriundas de tag dentro do padrão estabelecido no PPDS poderão ser implantadas em TQS/HMP/PRD.\n##[warning] Para mais informações acesse as urls:\n##[warning] https://devops.caixa/projetos/Caixa/_wiki/wikis/Caixa.wiki/1689/Valida%C3%A7%C3%A3o-da-VEC\n##[warning] https://caixa.sharepoint.com/sites/PPDS/SitePages/GCM_Diretrizes_Padrao_Baseline.aspx ou consulte a GEQTI04\n-------------------------------------------------\"\necho $BUILD_SOURCEBRANCH\nif [[ `echo $BUILD_SOURCEBRANCH | grep -c tags` -gt 0 ]];then\npontos=`echo ${BUILD_SOURCEBRANCHNAME//[^\\.]} | sed 's/\\./\\.\\n/g' | wc -w`\nnumber=`echo $BUILD_SOURCEBRANCHNAME | sed 's/\\\\.//g'`\n\nif [[ ${pontos} = 3 ]];then\nif [[ ${number} =~ ^([0-9]+)$ ]];then\necho \"VEC $BUILD_SOURCEBRANCHNAME dentro do padrão estabelecido pelo PPDS.\nPacote apto a ser implantado em TQS/HMP/PRD.\"\nvec='true'\necho \"##vso[build.updatebuildnumber]\"$BUILD_SOURCEBRANCHNAME\"\"\nelse\necho \"A TAG $BUILD_SOURCEBRANCHNAME não se encontra dentro do padrão estabelecido pelo PPDS e este pacote não poderá ser implantado nos ambientes TQS/HMP/PRD.\"\nvec='false'\nfi\nelse\necho \"A TAG $BUILD_SOURCEBRANCHNAME não se encontra dentro do padrão estabelecido pelo PPDS e este pacote não poderá ser implantado nos ambientes TQS/HMP/PRD.\"\nvec='false'\nfi\nelif [[ `echo $BUILD_SOURCEBRANCH | grep -c heads` -gt 0 ]];then\necho \"##[warning]Foi selecionada para compilação uma branch. Esteja ciente de que este pacote poderá ser implantado somente em ambiente DES.\"\nvec='false'\nelse\necho \"##[warning]Foi selecionada para compilação uma branch. Esteja ciente de que este pacote poderá ser implantado somente em ambiente DES.\"\nvec='false'\nfi\n\necho \"##[section]Valida VEC: $vec\"\necho \"##vso[task.setvariable variable=valida.vec;]$vec\"\n\necho \"------------------------------------------------- \nps: Essa regra se aplica somente a projetos que possuem infra criada na esteira devops.\""
  - task: Bash@3
    displayName: Obtendo branch do Sonar
    enabled: False
    inputs:
      targetType: inline
      script: >-
        if [[ `echo $BUILD_SOURCEBRANCH | grep -c tags` -gt 0 ]];then

        token=$(AZPAT)


        #Apresenta object_id da tag

        object_id_tag=`curl -s -u :$token "https://devops.caixa/projetos/Caixa/_apis/git/repositories/$BUILD_REPOSITORY_NAME/refs?filter=tags/$BUILD_SOURCEBRANCHNAME&api-version=7.0" | jq -r '.value[0].objectId'`


        echo "Commit da TAG: " $object_id_tag


        #Apresenta commit_id branch

        object_id_commit=`curl -s -u :$token "https://devops.caixa/projetos/Caixa/_apis/git/repositories/$BUILD_REPOSITORY_NAME/annotatedtags/$object_id_tag?api-version=7.0" | jq -r '.taggedObject.objectId'`


        echo "Commit da branch que gerou a tag: " $object_id_commit


        #Pasea json localiza branch

        branch_of_tag=`curl -s -u :$token "https://devops.caixa/projetos/Caixa/_apis/git/repositories/$BUILD_REPOSITORY_NAME/refs?filter=heads&api-version=7.0" | jq -c '.value[] | select(.objectId | contains("'$object_id_commit'")).name' | awk 'NR==1'`


        if [ -z $branch_of_tag ];then

        echo "Não foi possível localizar a Branch que originou a TAG."

        sonar_branch=$BUILD_SOURCEBRANCHNAME

        else

        branch_of_tag=`echo $branch_of_tag | sed -e 's/\"//g'`

        echo "Branch que gerou a Tag: " $branch_of_tag

        sonar_branch=`echo $branch_of_tag | awk -F '/' '{print $NF'}`

        fi


        else


        sonar_branch=$BUILD_SOURCEBRANCHNAME


        fi


        echo $sonar_branch


        echo "##vso[task.setvariable variable=sonar_branch;]$sonar_branch"
  - task: Bash@3
    displayName: Obtendo branch do Sonar
    inputs:
      targetType: inline
      script: "#!/usr/bin/env bash\nset -euo pipefail\n\nif [[ `echo $BUILD_SOURCEBRANCH | grep -c tags` -gt 0 ]];then\n\necho \"Build originada de uma TAG.\"\n\n# ====== CONFIGURAÇÃO ======\nTAG=$BUILD_SOURCEBRANCH\nREMOTE=\"origin\"\n\n# ====== RESOLVER COMMIT FINAL DA TAG ======\nif ! COMMIT=`git rev-parse \"$TAG^{commit}\" 2>/dev/null`; then\n  echo \"Erro: a tag '$TAG' não existe ou não é válida.\"\n  exit 1\nfi\n\necho \"Tag        : $TAG\"\necho \"Commit     : $COMMIT\"\necho \"Remote     : $REMOTE\"\necho\necho \"Analisando branches que contêm o commit...\"\necho \"------------------------------------------------------------\"\nprintf \"%-8s %s\\n\" \"DISTÂNCIA\" \"BRANCH\"\necho \"------------------------------------------------------------\"\n\nFOUND=0\n\nwhile read -r BRANCH; do\n  if git merge-base --is-ancestor \"$COMMIT\" \"$BRANCH\"; then\n    DIST=`git rev-list --count \"$COMMIT..$BRANCH\"`\n    \n    # Remove origin/\n    BRANCH_DISPLAY=\"${BRANCH#origin/}\"    \n\n    printf \"%-8s %s\\n\" \"$DIST\" \"$BRANCH_DISPLAY\"\n    FOUND=1\n  fi\ndone < <(\n  git for-each-ref \\\n    --format='%(refname:short)' \\\n    \"refs/remotes/$REMOTE\"\n)\n\nif [[ \"$FOUND\" -eq 0 ]]; then\n  echo \"Nenhuma branch remota contém esse commit.\"\n  exit 1\nfi\n\necho \"------------------------------------------------------------\"\n\n# ====== BRANCH MAIS PROVÁVEL ======\nBEST_BRANCH=$(\n  while read -r BRANCH; do\n    if git merge-base --is-ancestor \"$COMMIT\" \"$BRANCH\"; then\n      # Remove origin/\n      BRANCH_DISPLAY=\"${BRANCH#origin/}\"    \n      echo \"`git rev-list --count \"$COMMIT..$BRANCH\"` $BRANCH_DISPLAY\"\n    fi\n  done < <(\n    git for-each-ref \\\n      --format='%(refname:short)' \\\n      \"refs/remotes/$REMOTE\"\n  ) | sort -n | head -n1\n)\n\nBEST_DISTANCE=`echo \"$BEST_BRANCH\" | awk '{print $1}'`\nBEST_NAME=`echo \"$BEST_BRANCH\" | awk '{print $2}'`\n\necho \"Branch mais provável de origem:\"\necho \"$BEST_NAME (distância: $BEST_DISTANCE commits)\"\n\nelse\n\necho \"Build originada de uma BRANCH.\"\nBEST_NAME=$BUILD_SOURCEBRANCHNAME\n\nfi\n\necho \"Branch que será informada para o SONAR: $BEST_NAME \"\n\necho \"##vso[task.setvariable variable=sonar_branch;]$BEST_NAME\"\n"
  - task: Bash@3
    displayName: Alterando package.json com versão da Build
    inputs:
      targetType: inline
      script: >-
        cd $(Build.SourcesDirectory)


        VERSION=`echo $(version.app)`

        if [[ $VERSION ]]

        then

        sed -i 's/"version":\s*".*"/"version": "'$VERSION'"/' web/package.json

        grep version web/package.json

        else

        package_version=`jq -r .version web/package.json`

        fi
      failOnStderr: true
  - task: Bash@3
    displayName: Recupera versão projeto
    inputs:
      targetType: inline
      script: "cd $(Build.SourcesDirectory)\nexport PROJECT='web/package.json'\n\np_version=`cat ${PROJECT} | jq -r .version` \np_name=`cat ${PROJECT} | jq -r .name` \np_extension=\"zip\"\np_projectKey=`echo $p_name| tr -cd '[:alnum:]'` \np_group=\"\"\n\necho \"${p_name}:${p_extension}:${p_version}\"\n\necho \"##vso[task.setvariable variable=project.group;]$p_group\"\n\necho \"##vso[task.setvariable variable=project.name;]$p_name\"\n\necho \"##vso[task.setvariable variable=project.version;]$p_version\"\n\necho \"##vso[task.setvariable variable=project.extension;]$p_extension\"\n\necho \"##vso[task.setvariable variable=project.key;]$p_projectKey\"\n\necho \"##vso[task.setvariable variable=project.release;]true\"\n\nif [[ ${p_version} == *\"snapshot\"* ]]; then\n  echo \"##vso[task.setvariable variable=project.release;]false\"\nfi\n\necho \"##vso[task.setvariable variable=PACKAGE_JSON_PATH;]web\""
      failOnStderr: true
  - task: Bash@3
    displayName: Recupera repositório nexus
    inputs:
      targetType: inline
      script: >-
        if [ $(project.release) = true ]; then

        NEXUS_URL=$(NEXUS_URL_ANGULAR_RELEASE)

        else

        NEXUS_URL=$(NEXUS_URL_ANGULAR_SNAPSHOT)

        fi



        p_repository=`echo ${NEXUS_URL##*/}`

        echo "##vso[task.setvariable variable=project.repository;]$p_repository"
  - task: NodeTool@0
    displayName: Use Node 10.x
    retryCountOnTaskFailure: 5
    inputs:
      versionSpec: 10.x
  - task: Bash@3
    displayName: Configurando Registry NPM
    inputs:
      targetType: inline
      script: >2-
          cat <<EOF > web/.npmrc
        registry=http://binario.caixa:8081/repository/npm-all

        email=pipeline-agil@mail.caixa

        sass_binary_site=http://binario.caixa:8081/repository/node-sass/

        disturl=http://binario.caixa:8081/repository/nodejs/

        EOF
  - task: Bash@3
    displayName: npm config check
    inputs:
      targetType: inline
      script: >-
        npm config rm proxy

        npm config rm http-proxy

        npm config rm https-proxy

        npm config list
  - task: Bash@3
    displayName: Configurando Registry NPMJS
    enabled: False
    inputs:
      targetType: inline
      script: >2-
          cat <<EOF > web/.npmrc
        registry=http://registry.npmjs.org/

        email=pipeline-agil@mail.caixa

        sass_binary_site=http://binario.caixa:8081/repository/node-sass/

        https-proxy = "http://proxyprd.caixa:80/"

        disturl=http://binario.caixa:8081/repository/nodejs/

        EOF
  - task: Npm@1
    displayName: npm install
    inputs:
      command: custom
      workingDir: web
      verbose: true
      customCommand: install --no-audit --verbose
  - task: Bash@3
    displayName: Build Application
    inputs:
      targetType: inline
      script: "export HOME=/tmp/firefox-home3    \nmkdir -p $HOME\n\ncd web/\necho \"ng build --prod --configuration=production --outputPath=dist\"\necho \"<----ANGULAR---->\"\nnpx ng version\nng build --prod --configuration=production --outputPath=dist\n"
  - task: Bash@3
    displayName: Zip dist
    inputs:
      targetType: inline
      script: >+
        #cd $(Build.SourcesDirectory)

        cd web


        p_name=$(project.name)

        p_version="$(project.version)"


        PROJECT_FILE=$(Build.ArtifactStagingDirectory)/${p_name}-${p_version}.zip


        zip -r $PROJECT_FILE dist


        echo "##vso[task.setvariable variable=project.file;]${PROJECT_FILE}"

      failOnStderr: true
  - task: DownloadSecureFile@1
    displayName: Download secure file
    inputs:
      secureFile: d2041121-de1c-45da-9c21-5e8a73c00647
  - task: Bash@3
    displayName: Definindo Linguagem de Programação
    inputs:
      targetType: inline
      script: >
        #!/bin/bash

        set -o errexit

        set -o nounset

        set -o pipefail


        cd $(Build.SourcesDirectory)

        for file in pom.xml angular.json tsconfig.json package.json project.ini *.csproj *.sln

        do
           f_language=`find . -maxdepth 3 -name "${file}" -exec basename {} \; | head -n 1`
           if [[ "${f_language}" == pom.xml ]]
            then
                p_language=java
                break
           elif [[ "${f_language}" == angular.json ]] || [[ "${f_language}" == tsconfig.json ]]
                 then
                    p_language=angular
                break
           elif [[ "${f_language}" == package.json ]]
             then
                    p_language=nodejs
                break
           elif [[ "${f_language}" == project.ini ]]
             then
                    p_language=php
                break
           elif [[ "${f_language}" == *".csproj" ]] || [[ "${f_language}" == *".sln" ]]
             then
                    p_language=dotnet
                break
             else
                echo "Não foi possivel determinar a linguagem da aplicação do codigo fonte"
                   p_language=null
           fi
        done


        echo "Linguagem de Programação:" $p_language

        echo "##vso[task.setvariable variable=p_language;]$p_language"



        RepositoryName=`(echo "$(REPO_FINAL_NAME)" | tr '[[:upper:]]' '[[:lower:]]')`

        echo "##vso[task.setvariable variable=REPOSITORIO;]$RepositoryName"
  - task: Bash@3
    displayName: Verifica se pacote existe no binario.caixa
    inputs:
      targetType: inline
      script: "if [ $(valida.vec) = true ]; then\n\nreplace=\"\\/\"\n\np_name=\"$(project.name)\"\np_version=\"$(project.version)\"\np_extension=\"$(project.extension)\"\np_group=$(project.group) || true\np_group=`[ -z \"$p_group\" ] && echo \"\"br.gov.caixa.$p_name\"\" || echo \"$p_group\"`\np_group=`echo $p_group | awk -F \":\" '{print $1}' | sed -e \"s/\\./${replace}/g\"`\n\np_group=`[ ! -z \"$p_group\" ] && echo \"/$p_group\"`\n	\np_version=$BUILD_SOURCEBRANCHNAME	\n\n	p_version=`echo \"${p_version}\" | sed -r 's/([A-Z]+)//g'`\n        [[ $p_version = *- ]] && p_version=`echo $p_version | sed 's/.$//'`\n\n	p_file=\"$p_name-$p_version.$p_extension\"\n\n       echo $(NEXUS_URL_ANGULAR_RELEASE)/$p_group/$p_name/$p_version/$p_file\n	response=`curl -s --head $(NEXUS_URL_ANGULAR_RELEASE)/$p_group/$p_name/$p_version/$p_file | head -n 1 | grep \"HTTP/1.[01] [234]..\"`\n\n	code=`echo $response | awk '{print $2}'` \n\n	if [ ${code} = \"200\" ]; then\n		echo \"Pacote com identificador $BUILD_SOURCEBRANCHNAME já existe no repositório, por favor compile utilizando outra TAG\";\n		exit 1\n	fi\nfi"
  - task: Bash@3
    displayName: Run Code Analisis
    condition: and(ne(variables['sonar_disable'], 'true'), succeeded())
    inputs:
      targetType: inline
      script: >-
        #!/bin/bash


        if [[ "$(p_language)" != "dotnet" ]]

        then


        p_name=$(REPO_FINAL_NAME)

        p_version=$(project.version)

        p_projectKey=$(REPO_FINAL_NAME)


        #p_properties=`echo $(SONAR_PROPERTIES)`

        #echo "SONAR_PROPERTIES" $(SONAR_PROPERTIES)

        #echo "p_properties" $p_properties


        echo sonar-scanner -Dsonar.host.url=$(SONAR_URL) -Dsonar.login=$(SONAR_LOGIN) -Dsonar.password=$(SONAR_PASSWORD) -Dsonar.projectKey=$p_projectKey -Dsonar.projectName=$p_name -Dsonar.projectVersion=$p_version -Dsonar.sources=. $(SONAR_PROPERTIES)


        sonar-scanner -Dsonar.host.url=$(SONAR_URL) -Dsonar.login=$(SONAR_LOGIN) -Dsonar.password=$(SONAR_PASSWORD) -Dsonar.projectKey=$p_projectKey -Dsonar.projectName=$p_name -Dsonar.projectVersion=$p_version -Dsonar.sources=. $(SONAR_PROPERTIES)


        fi
  - task: Bash@3
    displayName: Publish Quality Gate Result
    condition: and(ne(variables['sonar_disable'], 'true'), succeeded())
    timeoutInMinutes: 5
    inputs:
      targetType: inline
      script: >-
        #!/bin/bash


        if [[ "$(p_language)" != "dotnet" ]]

        then


        cd $(Build.SourcesDirectory)


        REPORT_PATH=".scannerwork/report-task.txt"

        CE_TASK_ID_KEY="ceTaskId="


        SONAR_INSTANCE=$(SONAR_URL)

        SONAR_ACCESS_LOGIN=$(SONAR_LOGIN)

        SONAR_ACCESS_PASSWORD=$(SONAR_PASSWORD)

        SLEEP_TIME=5


        echo "QG Script --> Using SonarQube instance ${SONAR_INSTANCE}"

        echo "QG Script --> Using SonarQube access login ${SONAR_ACCESS_LOGIN}"


        # get the compute engine task id

        ce_task_id=`cat $REPORT_PATH | grep $CE_TASK_ID_KEY | cut -d'=' -f2`

        echo "QG Script --> Using task id of ${ce_task_id}"


        if [ -z "$ce_task_id" ]; then
           echo "QG Script --> No task id found"
           exit 1
        fi


        # grab the status of the task

        # if CANCELLED or FAILED, fail the Build

        # if SUCCESS, stop waiting and grab the analysisId

        wait_for_success=true


        while [ "${wait_for_success}" = "true" ]

        do

          ce_status=`curl --connect-timeout 3 --max-time 7 --retry 7 --retry-delay 0 --retry-max-time 50 -s -u ${SONAR_ACCESS_LOGIN}:${SONAR_ACCESS_PASSWORD} "${SONAR_INSTANCE}"/api/ce/task?id=${ce_task_id} | jq -r .task.status`

          echo "QG Script --> Status of SonarQube task is ${ce_status}"

          if [ "${ce_status}" = "CANCELLED" ]; then
            echo "QG Script --> SonarQube Compute job has been cancelled - exiting with error"
            exit 1
          fi

          if [ "${ce_status}" = "FAILED" ]; then
            echo "QG Script --> Ocorrência prevista na TE102 - Não atendimento aos critérios de qualidade"
            exit 1
          fi

          if [ "${ce_status}" = "SUCCESS" ]; then
            wait_for_success=false
          fi

          sleep "${SLEEP_TIME}"

        done


        ce_analysis_id=`curl --connect-timeout 3 --max-time 7 --retry 7 --retry-delay 0 --retry-max-time 50 -s -u ${SONAR_ACCESS_LOGIN}:${SONAR_ACCESS_PASSWORD} $SONAR_INSTANCE/api/ce/task?id=$ce_task_id | jq -r .task.analysisId`

        echo "QG Script --> Using analysis id of ${ce_analysis_id}"


        # get the status of the quality gate for this analysisId

        qg_status=`curl --connect-timeout 3 --max-time 7 --retry 7 --retry-delay 0 --retry-max-time 50 -s -u ${SONAR_ACCESS_LOGIN}:${SONAR_ACCESS_PASSWORD} $SONAR_INSTANCE/api/qualitygates/project_status?analysisId="${ce_analysis_id}" | jq -r .projectStatus.status`

        echo "QG Script --> Quality Gate status is ${qg_status}"


        if [ "${qg_status}" != "OK" ]; then
          echo "##[error]QG Script --> Ocorrência prevista na TE102 - Não atendimento aos critérios de qualidade"
          exit 1
        fi


        fi
      failOnStderr: true
  - task: Bash@3
    displayName: Definindo Version no Fortify
    enabled: False
    inputs:
      targetType: inline
      script: >
        #!/bin/bash


        #set -x


        extrair_versao() {

        echo "$1" | grep -oE '^[0-9]+(\.[0-9]+){0,2}'

        }

        if [[ -n "$(version.app)" && "$(version.app)" =~ ^[0-9] ]] || [[ -n "$(versionApp)" && "$(versionApp)" =~ ^[0-9] ]]

        then

        FORTIFY_VERSION_BUILD=$(extrair_versao "$(version.app)" || extrair_versao "$(versionApp)" )

        if [[ -n "$(Agent.ReleaseDirectory)" && -n "$(Release.PrimaryArtifactSourceAlias)" ]]

        then

        Build_SourcesDirectory="$(Agent.ReleaseDirectory)/$(Release.PrimaryArtifactSourceAlias)"

        echo "##vso[task.setvariable variable=Build.SourcesDirectory;]$Build_SourcesDirectory"

        fi

        else

        FORTIFY_VERSION_BUILD=$(Build.BuildNumber)

        fi

        echo "##vso[task.setvariable variable=FORTIFY_VERSION_BUILD;]$FORTIFY_VERSION_BUILD"

        echo "FORTIFY_VERSION_BUILD=$FORTIFY_VERSION_BUILD"
  - task: Bash@3
    displayName: Checagem de bypass
    condition: and(succeeded(), ne(variables['p_language'], 'dotnet'))
    enabled: False
    inputs:
      targetType: inline
      script: "#!/bin/bash\n\n#set -x\nif [ ! -z \"$(fortify_disable)\" ] && [ $(fortify_disable) = \"true\" ];\nthen\necho - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \necho Análise do fortify encontra-se desabilitada, procure imediatamente o suporte da CESTI36 para que este passo seja habilitado. \necho Bypass a partir de 2024 somente com autorização da GECMI.\necho - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \nreturn 1 2>/dev/null\nexit 1\nelif [ $(fortify_disable) = \"gecmi\" ];\nthen\necho Bypass autorizado pela GECMI.\nelse\necho Projeto habilitado para análise do fortify.\nfi"
  - task: Bash@3
    displayName: Definindo variáveis Fortify
    condition: and(succeeded(), ne(variables['fortify_disable'], 'gecmi'))
    enabled: False
    timeoutInMinutes: 2
    inputs:
      targetType: inline
      script: >-
        #!/bin/bash

        set -o errexit

        set -o nounset

        set -o pipefail

        #set -x


        GitRepositoryName=$(Build.Repository.Name)

        DefinitionName=$(Build.DefinitionName)


        RepositoryName=`(echo "$GitRepositoryName" | tr '[[:upper:]]' '[[:lower:]]')`

        echo "##vso[task.setvariable variable=REPOSITORIO;]$RepositoryName"

        ProjectName=`(echo "$GitRepositoryName" | tr '[[:upper:]]' '[[:lower:]]' | cut -f1 -d"-")`

        echo "##vso[task.setvariable variable=PROJETO;]$ProjectName"


        echo "Definindo liguagem de programação"

        cd $(Build.SourcesDirectory)

        for file in pom.xml angular.json tsconfig.json package.json project.ini *.csproj *.sln build.gradle

        do
           f_language=`find . -maxdepth 3 -name "${file}" -exec basename {} \; | head -n 1`
           if [[ "${f_language}" == pom.xml ]]
            then
                p_language=java
                break
           elif [[ "${f_language}" == angular.json ]] || [[ "${f_language}" == tsconfig.json ]]
                 then
                    p_language=angular
                break
           elif [[ "${f_language}" == package.json ]]
             then
                    p_language=nodejs
                break
           elif [[ "${f_language}" == project.ini ]]
             then
                    p_language=php
                break
           elif [[ "${f_language}" == *".csproj" ]] || [[ "${f_language}" == *".sln" ]]
             then
                    p_language=dotnet
                break
        elif [[ "${f_language}" == "build.gradle" ]]

        then

        p_language=android

        break
             else
                echo "Não foi possivel determinar a linguagem da aplicação do codigo fonte"
                   p_language=null
           fi
        done


        echo "Linguagem de Programação:" $p_language


        echo "##vso[task.setvariable variable=p_language;]$p_language"


        p_lang=`echo "${p_language}" | sed 's/[[:punct:]]\+$//'`

        echo "Liguagem de programação: $p_lang"


        if [ $p_language == null ]
         then
           echo "Não foi possivel definir a linguagem de programação deste codigo fonte"
           exit 1
        fi


        echo "Autenticando no Fortify e adquirindo token"
        	get_token=`curl -s --user $(FORTIFY_USER):$(FORTIFY_PASS) -k -X POST -H "Content-Type:application/json" -d '{"type": "UnifiedLoginToken"}' '$(FORTIFY_API)/tokens'`
            token=`echo $get_token | jq -r '.data.token'`
        	token_id=`echo $get_token | jq -r '.data.id'`
        	response=`echo $get_token | jq -r '.responseCode'`
        	    if [[ $response != 201 ]]
                then
                    echo "Ocorreu um erro ao realizar ação no Fortify Status_code: $response"
        			exit 1
                fi

        echo "##vso[task.setvariable variable=token]$token"

        echo "##vso[task.setvariable variable=token_id]$token_id"
  - task: script-retryer@0
    displayName: Criando Application no Fortify
    condition: and(succeeded(), ne(variables['fortify_disable'], 'gecmi'), ne(variables['p_language'], 'dotnet'))
    enabled: False
    timeoutInMinutes: 2
    inputs:
      targetType: inline
      script: "#!/bin/bash\n\necho \"Repo: $(REPOSITORIO)\"\n#Corrigir caracter bizzaro que o ads coloca (java'\\''')\np_lang=`echo '$(p_language)' | sed 's/[[:punct:]]\\+$//'`\necho \"Liguagem de programação: $p_lang\"\n\necho \"Iniciando fluxo de criação de Application no Fortify\"\nlista_projeto=`curl -k -s -X POST \"$(FORTIFY_API)/projects/action/test\" -H \"Authorization:FortifyToken $(token)\" -H \"accept: application/json\" -H \"Content-Type: application/json\" -d \"{ \\\"applicationName\\\": \\\"$(REPOSITORIO)\\\"}\"`\nlprojeto=`echo $lista_projeto | jq -r '.data.found'`\nresponse=`echo $lista_projeto | jq -r '.responseCode'`\n        if [[ $response != 200 ]]\n        then\n            echo \"Ocorreu um erro ao realizar ação no Fortify Status_code: $response\"\n			exit 1\n        fi\necho \"Listando Application ==>\"$lprojeto\necho \"Listando Application response ==> \"$response\nif [ $lprojeto = false ]\nthen \n  echo \"Criando o Application no Fortify\"\n	cria_projeto=`curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d '{\"name\":\"'$(FORTIFY_VERSION_BUILD)'\",\"description\":\"\",\"active\":true,\"project\":{\"name\":\"'$(REPOSITORIO)'\",\"description\":\"\",\"issueTemplateId\":\"Prioritized-HighRisk-Project-Template\"},\"issueTemplateId\":\"Prioritized-HighRisk-Project-Template\",\"committed\":true}' '$(FORTIFY_API)/projectVersions'`\n	idFortify=`echo $cria_projeto | jq -r '.data.id'`\n    response=`echo $cria_projeto | jq -r '.responseCode'`\n	    if [[ $response != 201 ]]\n        then\n            echo \"Ocorreu um erro ao realizar ação no Fortify Status_code: $response\"\n			exit 1\n        fi	\n    echo \"Project Fortify ID ==> \"$idFortify\n    echo \"Project Fortify ID response ==> \"$response\nsleep 10	\n    #id_versao=`curl -k -s \"$(FORTIFY_API)/projectVersions?start=0&limit=2000&fulltextsearch=false\" -H \"Authorization:FortifyToken $(token)\" -H \"accept: application/json\" -H \"Content-Type: application/json\"`\n	#iversao=`echo $id_versao | jq -r '.data[] | select(.name==\"$(FORTIFY_VERSION_BUILD)\" and .project.name==\"$(REPOSITORIO)\") | .id'`\n	#response=`echo $id_versao | jq -r '.responseCode'`\n	#	if [[ $response != 200 ]]\n    #    then\n    #        echo \"Ocorreu um erro ao realizar ação no Fortify Status_code: $response\"\n	#		exit 1\n    #    fi	\n	#echo \"Project Version ID ==> \"$iversao\n	#echo \"Project Version ID response ==> \"$response\n	\n	if [ $p_lang == android ]\n	then\n		cat /opt/ads-agent/javaDefault.json | sed -e 's/idFortify/'$idFortify'/g' | curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d @- '$(FORTIFY_API)/bulk'	\n	elif [ $p_lang == java ]\n	  then\n	     cat /opt/ads-agent/javaDefault.json | sed -e 's/idFortify/'$idFortify'/g' | curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d @- '$(FORTIFY_API)/bulk'\n	elif [ $p_lang == angular ] || [ $p_lang == nodejs ]\n	   then\n	     cat /opt/ads-agent/javascriptDefault.json | sed -e 's/idFortify/'$idFortify'/g' | curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d @- '$(FORTIFY_API)/bulk'\n	elif [ $p_lang == php ]\n	   then\n	     cat /opt/ads-agent/phpDefault.json | sed -e 's/idFortify/'$idFortify'/g' | curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d @- '$(FORTIFY_API)/bulk'\n	fi\nelse \n  echo \"A Application $(REPOSITORIO) já esta criada no Fortify\"	\nfi"
      delay: 10
      retryTimes: 3
  - task: Bash@3
    displayName: Criando Version no Fortify
    condition: and(succeeded(), ne(variables['fortify_disable'], 'gecmi'), ne(variables['p_language'], 'dotnet'))
    enabled: False
    timeoutInMinutes: 2
    inputs:
      targetType: inline
      script: "#!/bin/bash\n\necho \"Repo: $(REPOSITORIO)\"\n#Corrigir caracter bizzaro que o ads coloca (java'\\''')\np_lang=`echo '$(p_language)' | sed 's/[[:punct:]]\\+$//'`\necho \"Liguagem de programação: $p_lang\"\n\necho \"Criando nova Application Version\"\nlista_versao=`curl -k -s -X POST \"$(FORTIFY_API)/projectVersions/action/test\" -H \"Authorization:FortifyToken $(token)\" -H \"accept: application/json\" -H \"Content-Type: application/json\" -d \"{ \\\"projectName\\\": \\\"$(REPOSITORIO)\\\", \\\"projectVersionName\\\": \\\"$(FORTIFY_VERSION_BUILD)\\\"}\"`\nlversao=`echo $lista_versao | jq -r '.data.found'`\nresponse=`echo $lista_versao | jq -r '.responseCode'`\n        if [[ $response != 200 ]]\n        then\n            echo \"Ocorreu um erro ao realizar ação no Fortify Status_code: $response\"\n			exit 1\n        fi\necho \"listar_versão ==>\"$lversao\necho \"listar_versão response ==>\"$response\nif [ $lversao = false ]\nthen \n  echo \"Criando o versão no fortify para o projeto '$(REPOSITORIO)'\"\n  id_project=`curl -k -s \"$(FORTIFY_API)/projects?start=0&limit=2000&fulltextsearch=false\" -H \"Authorization:FortifyToken $(token) \" -H \"accept: application/json\" -H \"Content-Type: application/json\"`\n    iproject=`echo $id_project | jq -r '.data[] | select (.name==\"$(REPOSITORIO)\") | .id'`\n    response=`echo $id_project | jq -r '.responseCode'`\n	    if [[ $response != 200 ]]\n        then\n            echo \"Ocorreu um erro ao realizar ação no Fortify Status_code: $response\"\n			exit 1\n        fi	\n    echo \"Project ID ==> \"$iproject\n    echo \"Project ID response ==> \"$response\nsleep 8	\n  cria_versao=`curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d '{\"name\":\"'$(FORTIFY_VERSION_BUILD)'\",\"description\":\"\",\"active\":true,\"committed\":true,\"project\":{\"name\":\"'$(REPOSITORIO)'\",\"description\":null,\"issueTemplateId\":\"Prioritized-HighRisk-Project-Template\",\"id\":'$iproject'},\"issueTemplateId\":\"Prioritized-HighRisk-Project-Template\"}' '$(FORTIFY_API)/projectVersions'`\n  	cversion=`echo $cria_versao | jq -r '.data.id'`\n    response=`echo $cria_versao | jq -r '.responseCode'`\n	    if [[ $response != 201 ]]\n        then\n            echo \"Ocorreu um erro ao realizar ação no Fortify Status_code: $response\"\n			exit 1\n        fi	\n    echo \"Criando Application Version ==> \"$cversion\n    echo \"Criando  Application Version response ==> \"$response\nsleep 8\necho \"Atribuindo atributos a Application Version\"$cversion\necho \"Linguagem de programacao $p_lang\"\n 	if [ $p_lang == android ]\n	  then\ncat /opt/ads-agent/javaDefault.json | sed -e 's/idFortify/'$cversion'/g' | curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d @- '$(FORTIFY_API)/bulk'\n 	elif [ $p_lang == java ]\n	  then\n	     cat /opt/ads-agent/javaDefault.json | sed -e 's/idFortify/'$cversion'/g' | curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d @- '$(FORTIFY_API)/bulk'\n	elif [ $p_lang == angular ] || [ $p_lang == nodejs ]\n	   then\n	     cat /opt/ads-agent/javascriptDefault.json | sed -e 's/idFortify/'$cversion'/g' | curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d @- '$(FORTIFY_API)/bulk'\n	elif [ $p_lang == php ]\n	   then\n	     cat /opt/ads-agent/phpDefault.json | sed -e 's/idFortify/'$cversion'/g' | curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d @- '$(FORTIFY_API)/bulk'\n	fi\nelse \n  echo \"A Application Version: $(FORTIFY_VERSION_BUILD) já esta criada no Fortify\"	\nfi\necho \"##vso[task.setvariable variable=lista_versao;]$lista_versao\"\necho $lista_versao"
  - task: Bash@3
    displayName: Herdando Atributos
    condition: and(succeeded(), ne(variables['fortify_disable'], 'gecmi'), ne(variables['p_language'], 'dotnet'))
    enabled: False
    inputs:
      targetType: inline
      filePath: /opt/ads-agent/fortify_analisis.sh
      script: >
        #!/bin/bash

        #set -x

        echo "LANGUAGE $(p_language)"


        identificar_projeto=$(curl -s -k --location --request GET "$(FORTIFY_API)/projects?q=name:$(REPOSITORIO)" \

        --header "Accept: application/json" \

        --header "Authorization: FortifyToken $(FORTIFY_APITOKEN)" | jq '.data[].id')


        identificar_versao=`curl -k -s -X GET "$(FORTIFY_API)/projects/$identificar_projeto/versions?orderby=creationDate&limit=0" \

        -H "Authorization: FortifyToken $(FORTIFY_APITOKEN)" \

        -H "accept: application/json"`


        if [[ $(echo "$(lista_versao)" | grep "found":true) ]]

        then

        IdUltimaVersao=`echo "$identificar_versao" | jq -r '.data[-1].id'`

        else

        IdUltimaVersao=`echo "$identificar_versao" | jq -r '.data[-2].id'`

        fi


        IdAtualVersao=`curl -s -k --location --request GET "$(FORTIFY_API)/projects/$identificar_projeto/versions?orderby=creationDate&limit=0" --header "Accept: application/json" --header "Authorization: FortifyToken $(FORTIFY_APITOKEN)" | jq '.data[] | select(.name == "$(FORTIFY_VERSION_BUILD)") | .id'`

        echo "IdUltimaVersao: $IdUltimaVersao"

        echo "IdAtualVersao: $IdAtualVersao"

        version_count=`echo "$identificar_versao" | jq -r '.count'`

        if [[ $version_count -eq 1 ]]

        then
        	echo "Esta e a primeira versao, skip na heranca de atributos"
        	exit 0
        elif [[ "$IdUltimaVersao" == "$IdAtualVersao" ]]

        then
                echo "Esta e a ultima versao, skip na heranca de atributos"
        	exit 0
        else
        	echo "Fazendo a Heranca de Atributo da ultima para a versao atual"
        	refresh_audit=$(curl -o /dev/null -w "%{http_code}" -k -s -L -X POST "$(FORTIFY_API)/projectVersions/action/refresh" \
        	-H "accept: application/json" \
        	-H "Content-Type: application/json" \
        	-H "Authorization: FortifyToken $(token)" \
        	-d '{
        	 "projectVersionIds": [ '$IdUltimaVersao' ]
        	}')
        	if [[ $refresh_audit -ne 200 ]]
        	then
        		echo "Skip refresh"
        	else
        		echo "Refresh da ultima versao realizado com sucesso"
                        sleep 20
        	fi
        	replicar_atributos=$(curl -o /dev/null -w "%{http_code}" -k -s -L -X POST "$(FORTIFY_API)/projectVersions/action/copyCurrentState" \
        	-H "accept: application/json" \
        	-H "Content-Type: application/json" \
        	-H "Authorization: FortifyToken $(token)" \
        	-d '{
        	 "previousProjectVersionId": '$IdUltimaVersao',
        	 "projectVersionId": '$IdAtualVersao'
        	}')
        	if [[ $replicar_atributos -ne 200 ]]
        	then
        		echo "Erro ao copiar application state da ultima para a versao atual"
        		exit 1
        	else
        		echo "Replicado application state da ultima para a versao atual"
        	fi
        	response_acessos=$(curl -k -s -L -X GET "$(FORTIFY_API)/projectVersions/$IdUltimaVersao/authEntities" \
        	-H "accept: application/json" \
        	-H "Authorization: FortifyToken $(token)")
                 response_acessos_code=`echo $response_acessos | jq -r '.responseCode'`
        	if [[ $response_acessos_code -ne 200 ]]
        	then
        		echo "Erro ao capturar response de acessos da ultima versao"
        		exit 1
        	else
        		echo "Identificado o response de acesso da ultima versao"
        	fi
                 response_acessos_data=`echo $response_acessos | jq -r '.data'`
        	replicar_acessos=$(curl -o /dev/null -w "%{http_code}" -k -s -L -X PUT "$(FORTIFY_API)/projectVersions/$IdAtualVersao/authEntities" \
        	-H "accept: application/json" \
        	-H "Content-Type: application/json" \
        	-H "Authorization: FortifyToken $(token)" \
        	-d "$response_acessos_data")
        	if [[ $replicar_acessos -ne 200 ]]
        	then
        		echo "Erro ao atualizar acessos da versao atual"
        		exit 1
        	else
        		echo "Replicado acessos para a versao atual"
        	fi
        fi
  - task: Bash@3
    displayName: Iniciando Análise no Fortify
    condition: and(succeeded(), ne(variables['fortify_disable'], 'gecmi'), ne(variables['p_language'], 'dotnet'))
    enabled: False
    inputs:
      targetType: inline
      filePath: /opt/ads-agent/fortify_analisis.sh
      script: "#!/bin/bash\n\nexport PATH=/opt/apache-maven/apache-maven-3.8.5/bin:$PATH\nmvn -version\n\necho \"Iniciando Fortify Clean, Translate e Analysis\" \n\np_lang=`echo '$(p_language)' | sed 's/[[:punct:]]\\+$//'`\necho \"LANG $p_lang\"\n\nif [ $p_lang == java ]\n  then\n      \n	  DIR=$(Agent.BuildDirectory)/fortify\n     \n	  if [ -d \"$DIR\" ]; then\n		  echo \"Pasta ${DIR} existe...\"\n		  cd ${DIR}\n	  else\n	    DIR=$(Build.SourcesDirectory)\n	  fi\n	  \n	  if [ $POM_PATH ]\n	   then\n	     POM=`dirname $POM_PATH`\n	  cd ${DIR}/$POM\n	   else\n	  cd ${DIR}\n      fi\n\nscancentral -url $(SCANCENTRAL_URL) start -bt mvn -pool $(FORTIFY_POOL_SILVER_NOVO) -application $(REPOSITORIO) -version $(FORTIFY_VERSION_BUILD) -uptoken $(FORTIFY_UPTOKEN) -fprssc $(Build.BuildId).fpr -upload\n\nelif [ $p_lang == android ]\nthen\ncd $(Build.SourcesDirectory)\nchmod +x gradlew\nsed -i  \"s,distributionUrl=.*,distributionUrl=file:///opt/ferramentas/gradle/gradle-$(GradleVersion)-all.zip,\" gradle/wrapper/gradle-wrapper.properties\nscancentral arguments -o -targs \"-exclude './**/build/**/*'\"\nscancentral -url $(SCANCENTRAL_URL) start -bt gradle -bc $(FORTIFY_BUILD) -skipBuild -pool $(FORTIFY_POOL_GOLD_NOVO) -application $(REPOSITORIO) -version $(FORTIFY_VERSION_BUILD) -uptoken $(FORTIFY_UPTOKEN) -fprssc $(Build.BuildId).fpr -upload\n\nelse\n      if [ $PACKAGE_JSON_PATH ]\n	    then\n          cd $PACKAGE_JSON_PATH\n		else\n		  cd $(Build.SourcesDirectory)\n		fi\n	  scancentral arguments -o -targs \"-Dcom.fortify.sca.exclude.unimported.node.modules 'true'\" -targs \"-exclude './**/node_modules/**/*'\" -targs \"-exclude './**/*.min.js'\" -targs \"-exclude './**/dist/**/*'\"\n          scancentral -url $(SCANCENTRAL_URL) start -bt none -pool $(FORTIFY_POOL_GOLD_NOVO) -application $(REPOSITORIO) -version $(FORTIFY_VERSION_BUILD) -uptoken $(FORTIFY_UPTOKEN) -fprssc $(Build.BuildId).fpr -upload\nfi\n"
  - task: Bash@3
    displayName: Revogando Token
    condition: always()
    enabled: False
    inputs:
      targetType: inline
      filePath: /opt/ads-agent/fortify_analisis.sh
      script: >-
        #!/bin/bash

        set -o errexit

        set -o nounset

        set -o pipefail

        #set -x


        echo "Verificando se o token foi criado."

        if [[ -n $(token_id) ]]

        then
            echo "Revogando token"
        	delete_token=`curl -s --user $(FORTIFY_USER):$(FORTIFY_PASS) -k -X DELETE -H "Content-Type:application/json" '$(FORTIFY_API)/tokens/$(token_id)'`
        	response=`echo $delete_token | jq -r '.responseCode'`
        	    if [[ $response != 200 ]]
                    then
                        echo "Ocorreu um erro ao revogar o token no Fortify Status_code: $response"
        		#exit 1
                    fi
        else
          echo "Token não foi criado. Favor verificar se alguma task apresenta erro."
        fi
  - task: CmdLine@2
    displayName: 'SAST: Limpando MVN_GOAL'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), ne(variables['fortify_disable'], 'gecmi'), eq(variables['p_language'], 'java'))
    inputs:
      script: "if [[ -n $MVN_GOAL ]]; then\n  FTFY_MVN_GOAL=\"$(\n    printf '%s' \"$MVN_GOAL\" |\n      sed -E '\n        s/(^|[[:space:]])-DskipTests=(true|false)([[:space:]]|$)/ /g;\n        s/(^|[[:space:]])(clean|install)([[:space:]]|$)/ /g;\n        s/[[:space:]]+/ /g;\n        s/^ //; s/ $//\n      '\n  )\"\n\n  # Força -DskipTests=true no final para garantir que testes não sejam executados em análise\n  FTFY_MVN_GOAL=\"${FTFY_MVN_GOAL:+$FTFY_MVN_GOAL }-DskipTests=true\"\n  echo \"##vso[task.setvariable variable=FTFY_MVN_GOAL]$FTFY_MVN_GOAL\"\n  echo MVN_GOAL: $FTFY_MVN_GOAL  \nfi"
  - task: CmdLine@2
    displayName: 'SAST: Define Variáveis'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), ne(variables['fortify_disable'], 'gecmi'))
    inputs:
      script: >-
        echo "Verificando a existência das variáveis de comunidade..."

        if [[ -z $FORTIFY_SENSOR_POOL ]]; then
            echo "##vso[task.logissue type=error;]Não foi possível determinar a comunidade responsável por este sistema. Entre em contato com a CESET10 para vincular seu pipeline ao Variable Group correspondente à sua comunidade."
            exit 1
        fi


        if [[ -n $FORTIFY_SOBRESCREVE_POOL ]]; then
          echo "##vso[task.setvariable variable=FORTIFY_SENSOR_POOL;]$FORTIFY_SOBRESCREVE_POOL"
          echo POOL: $FORTIFY_SOBRESCREVE_POOL
        fi


        #######


        JAVA_HOME_17_X64=/usr/java/open-jdk-17.0.8

        echo "##[command]echo \$JAVA_HOME_17_X64"

        echo JAVA_HOME_17_X64: $JAVA_HOME_17_X64


        echo "##vso[task.setvariable variable=JAVA_HOME_17_X64;]$JAVA_HOME_17_X64"


        if [[ -n $MVN_GOAL ]]; then

        echo MVN_GOAL: $FTFY_MVN_GOAL

        fi


        #######


        echo Build.Repository.Name=$(Build.Repository.Name)

        echo Build.DefinitionName=$(Build.DefinitionName)

        echo Build.BuildNumber=$(Build.BuildNumber)

        echo Build.BuildId=$(Build.BuildId)

        echo Build.SourceBranch=$(Build.SourceBranch)

        echo Build.SourceBranchName=$(Build.SourceBranchName)

        echo Build.SourceVersion=$(Build.SourceVersion)


        echo "##[command]echo \$valida.vec"

        echo vec=$(valida.vec)


        echo "##[command]echo \$sonar_branch"

        echo branch=$sonar_branch

        if [[ $sonar_branch =~ ^INC(\d)* ]]; then
            echo "##[warning]Hotfix detectado. Aplicando bypass no Guardrail."
            echo "##vso[task.setvariable variable=guardrail.sec;]false"
        fi


        echo FORTIFY_APPLICATION=$FORTIFY_APPLICATION

        echo FORTIFY_SESSION=$FORTIFY_SESSION

        echo KEYSTORE_SECUREFILEPATH=$(KEYSTORE_SECUREFILEPATH)

        echo NODE_EXTRA_CA_CERTS=$(NODE_EXTRA_CA_CERTS)


        #verificar diretório contendo os certificados necessários para a próxima task

        #ls -lah /etc/pki/ca-trust/source/anchors/


        echo "Versão atual:"

        echo "##[command]git log --pretty=format:"%H %D" | sed -n '1p'"

        git -c safe.directory=* log --pretty=format:"%H %D" | sed -n '1p'

        echo "##[command]git describe --tags $(Build.SourceVersion)"

        git -c safe.directory=* describe --tags $(Build.SourceVersion)


        #######


        echo "Versões anteriores [tag] seguindo a branch atual:"


        FORTIFY_NEW_VERSION=`git -c safe.directory=* log --pretty=format:"%H %D" | grep -oP '(?<=tag: )[^\s]*([0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3})' | sed -n '1p'`

        FORTIFY_LAST_VERSION=`git -c safe.directory=* log --pretty=format:"%H %D" | grep -oP '(?<=tag: )[^\s]*([0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3})' | sed -n '2p'`

        FORTIFY_THIRD_VERSION=`git -c safe.directory=* log --pretty=format:"%H %D" | grep -oP '(?<=tag: )[^\s]*([0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3})' | sed -n '3p'`


        echo Última tag mais recente: $FORTIFY_NEW_VERSION

        echo Penúltima tag mais recente: $FORTIFY_LAST_VERSION

        echo Antepenúltima tag mais recente: $FORTIFY_THIRD_VERSION


        if [[ $FORTIFY_NEW_VERSION == null ]]; then
            echo "##[error]Incapaz de determinar a versão da aplicação."
            exit 1
        fi


        echo Validando VEC e versão...

        # A VEC dá false pois o valor $(Build.SourceBranchName) não passa o valor da tag quando o build é disparado a partir da branch.

        if [[ $(valida.vec) == false ]]; then

        echo "O nome de versão ' $(Build.SourceBranchName) ' NÃO ATENDE aos parâmetros da VEC."

        fi

        if [[ -n $FORTIFY_NEW_VERSION ]]; then
          FORTIFY_NEW_VERSION=`echo $FORTIFY_NEW_VERSION | grep -oP $(FORTIFY_REGEX)`
          FORTIFY_LAST_VERSION=`echo $FORTIFY_LAST_VERSION | grep -oP $(FORTIFY_REGEX)`
        else

        if [[ -n $FORTIFY_LAST_VERSION ]]; then
          FORTIFY_NEW_VERSION="develop"
        else
          FORTIFY_NEW_VERSION=`echo $FORTIFY_LAST_VERSION | grep -oP $(FORTIFY_REGEX)`
          FORTIFY_LAST_VERSION=`echo $FORTIFY_THIRD_VERSION | grep -oP $(FORTIFY_REGEX)`
        fi

        fi


        echo "##[debug]Seu resultado será publicado no Fortify sob a Versão de nome: ' $FORTIFY_APPLICATION:$FORTIFY_NEW_VERSION '"


        #######


        FORTIFY_FPR_NAME=`git -c safe.directory=* describe --tags $(Build.SourceVersion)`


        echo "##vso[task.setvariable variable=FORTIFY_NEW_VERSION]$FORTIFY_NEW_VERSION"

        echo "##vso[task.setvariable variable=FORTIFY_LAST_VERSION]$FORTIFY_LAST_VERSION"

        echo "##vso[task.setvariable variable=FORTIFY_FPR_NAME]$FORTIFY_FPR_NAME"


        #######


        echo "Agent Name: $AGENT_NAME"

        AGENT_SHORT_NAME=$(echo "$AGENT_NAME" | sed -E 's/^([a-zA-Z]+)[0-9]*\..*/\1/')


        echo "Nome curto do agente: $AGENT_SHORT_NAME"


        if [[ "$AGENT_SHORT_NAME" == "cadsvaprlx" && -n $DOTNET_VERSION ]]; then
            echo DOTNET_VERSION: $DOTNET_VERSION
            echo "##[warning]Este Agent não possui os requisitos para executar a ferramenta de SAST ( .NET 8.0 ). O Bypass do SAST será ativado."
            echo "##vso[task.setvariable variable=fortify_disable;]gecmi"
        fi


        if [[ "$AGENT_SHORT_NAME" == "cadsvaprlx" ]]; then
            CONTAINER_ENGINE=docker
            echo "##vso[task.setvariable variable=CONTAINER_ENGINE]docker"
        else
            CONTAINER_ENGINE=podman
            echo "##vso[task.setvariable variable=CONTAINER_ENGINE]podman"
        fi


        echo "##[debug]Container engine selecionado: $CONTAINER_ENGINE"
  - task: CmdLine@2
    displayName: '[MANTER] SAST: Validando a Passagem de Valores'
    enabled: False
    inputs:
      script: >-
        scancentral --version

        /opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/bin/scancentral --version


        echo FORTIFY_SESSION: $FORTIFY_SESSION

        echo FORTIFY_APPLICATION: $FORTIFY_APPLICATION


        echo FORTIFY_NEW_VERSION: $FORTIFY_NEW_VERSION

        echo FORTIFY_LAST_VERSION: $FORTIFY_LAST_VERSION

        echo FORTIFY_APPLICATION-FORTIFY_NEW_VERSION

        echo $FORTIFY_APPLICATION-$FORTIFY_NEW_VERSION

        #echo FORTIFY_APPLICATION-[ dependencies.A.outputs['FORTIFY_NEW_VERSION'] ]

        #echo $FORTIFY_APPLICATION-$[ dependencies.A.outputs['FORTIFY_NEW_VERSION'] ]
  - task: CmdLine@2
    displayName: 'SAST: Cria Aplicação'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), ne(variables['fortify_disable'], 'gecmi'))
    retryCountOnTaskFailure: 5
    inputs:
      script: "command -v docker && docker --version\ncommand -v podman && podman --version\n\n#sudo usermod -aG docker $USER\n\n#ls -l /var/run/docker.sock\n\n#set -o errexit\n#set -o pipefail\n#echo Engine selecionado: $CONTAINER_ENGINE\n#echo Versão mais recente: $FORTIFY_NEW_VERSION\n#echo Versão anterior: $FORTIFY_LAST_VERSION\n\necho \"$FORTIFY_REGISTRY_PASSWORD\" | $CONTAINER_ENGINE login default-route-openshift-image-registry.apps.produtos4.caixa --username \"$FORTIFY_REGISTRY_USERNAME\" --password-stdin\n \necho FORTIFY_APPLICATION: $FORTIFY_APPLICATION\necho KEYSTORE_SECUREFILEPATH: $(KEYSTORE_SECUREFILEPATH)\nKEYSTORE_SECUREFILEPATH=$(KEYSTORE_SECUREFILEPATH)\ncp $KEYSTORE_SECUREFILEPATH $(System.DefaultWorkingDirectory)/keystore.jks\n#echo \"##vso[task.setvariable variable=KEYSTORE_SECUREFILEPATH]$KEYSTORE_SECUREFILEPATH\"\n\n# Valida Integridade do JKS (parte 1, fora do container)\necho Valida integridade do certificado FORA do container\necho \"##[command]md5sum /etc/pki/ca-trust/source/anchors/keystore-ssc24.jks\"\nmd5sum /etc/pki/ca-trust/source/anchors/keystore-ssc24.jks\necho \"##[command]md5sum $KEYSTORE_SECUREFILEPATH\"\nmd5sum $KEYSTORE_SECUREFILEPATH\necho \"##[command]md5sum $(System.DefaultWorkingDirectory)/keystore.jks\"\nmd5sum $(System.DefaultWorkingDirectory)/keystore.jks\n\n# Executa o container Fortify com as variáveis herdadas do ambiente\necho \"##[command]$CONTAINER_ENGINE --version\"\n$CONTAINER_ENGINE --version\necho \"##[command]$CONTAINER_ENGINE run -v $(System.DefaultWorkingDirectory):/src default-route-openshift-image-registry.apps.produtos4.caixa/fortify/fortify-ci-tools:7.0.0-jdk-17\"\n$CONTAINER_ENGINE run --rm \\\n  --security-opt seccomp=unconfined \\\n  --memory=12g \\\n  --memory-swap=12g \\\n  -v $(System.DefaultWorkingDirectory):/src \\\n  -w /src \\\n  -e FORTIFY_APPLICATION \\\n  -e FORTIFY_APP_VERSION=$FORTIFY_NEW_VERSION \\\n  -e FORTIFY_PREVIOUS_VERSION=$FORTIFY_LAST_VERSION \\\n  -e FORTIFY_SESSION \\\n  -e FORTIFY_URL \\\n  -e FORTIFY_CI_TOKEN \\\n  -e FORTIFY_CLIENT_AUTH_TOKEN \\\n  -e FORTIFY_SENSOR_VERSION \\\n  -e FORTIFY_SIGLA=$(Build.DefinitionName) \\\n  -e FORTIFY_COMUNIDADE \\\n  -e FORTIFY_LDAP_GROUP \\\n  default-route-openshift-image-registry.apps.produtos4.caixa/fortify/fortify-ci-tools:7.0.0-jdk-17 \\\n  bash -c \"\n    \n    echo Valida integridade do certificado DENTRO do container\n    echo md5sum /src/keystore.jks\n    md5sum /src/keystore.jks\n    \n    echo Configurando Key Store\n    fcli config truststore set \\\n      --file=/src/keystore.jks \\\n      --password=$KEYSTORE_PWD \\\n      --type=jks\n \n    echo \\\"Nome do Sistema: \\$FORTIFY_APPLICATION\\\"\n \n    echo \\\"Nome da Versão: \\$FORTIFY_APP_VERSION\\\"\n \n    echo \\\"Nome da Versão Anterior: \\$FORTIFY_PREVIOUS_VERSION\\\"\n \n   #FORTIFY_CI_TOKEN proveniente do Fortify (expira)\n   #FORTIFY_CLIENT_AUTH_TOKEN (não expira)\n    echo Login no Fortify...\n    fcli ssc session login \\\n      --url=\\$FORTIFY_URL \\\n      --token=\\$FORTIFY_CI_TOKEN \\\n      --client-auth-token=\\$FORTIFY_CLIENT_AUTH_TOKEN \\\n      --socket-timeout=10m \\\n      --connect-timeout=5m \\\n      --ssc-session=\\$FORTIFY_SESSION\n    \n \n    echo Criando aplicação no Fortify...\n    fcli ssc action run setup-appversion \\\n      --appversion=\\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION \\\n      --attributes=\\\"Comunidade=\\$FORTIFY_COMUNIDADE,Sigla=\\$FORTIFY_SIGLA\\\" \\\n      --add-users=\\$FORTIFY_LDAP_GROUP \\\n      --copy-from=\\$FORTIFY_APPLICATION:\\$FORTIFY_PREVIOUS_VERSION \\\n      --ssc-session=\\$FORTIFY_SESSION || true\n \n    fcli ssc action run setup-appversion \\\n      --appversion=\\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION \\\n      --attributes=\\\"Comunidade=\\$FORTIFY_COMUNIDADE,Sigla=\\$FORTIFY_SIGLA\\\" \\\n      --add-users=\\$FORTIFY_LDAP_GROUP \\\n      --ssc-session=\\$FORTIFY_SESSION || true\n \n    echo Atribuindo acessos ao Fortify...\n    fcli ssc appversion update \\\n      \\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION \\\n      --add-users=\\$FORTIFY_LDAP_GROUP \\\n      --ssc-session=\\$FORTIFY_SESSION || true\n \n    echo Logout do Fortify...\n    fcli ssc session logout \\\n      --ssc-session=\\$FORTIFY_SESSION \\\n      --no-revoke-token\n  \""
  - task: CmdLine@2
    displayName: '[MANTER] SAST: Disparando SAST no Fortify'
    enabled: False
    inputs:
      script: "echo Sistema: $FORTIFY_APPLICATION\necho Versão mais recente: $FORTIFY_NEW_VERSION\necho Versão anterior: $FORTIFY_LAST_VERSION\n\necho Empacotando aplicação...\n/opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/bin/scancentral package --output package.zip\n\necho Disparando requisição de análise SAST...\n/opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/bin/scancentral \\\n    -url $FORTIFY_URL_CONTROLLER \\\n    start --upload-to-ssc \\\n    -application $FORTIFY_APPLICATION \\\n    -version $FORTIFY_NEW_VERSION \\\n    --package package.zip \\\n    --ssc-upload-token $FORTIFY_CI_TOKEN "
  - task: CmdLine@2
    displayName: 'SAST: Confirmando Variáveis'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), ne(variables['fortify_disable'], 'gecmi'))
    inputs:
      script: >-
        echo "Definindo liguagem de programação"

        cd $(Build.SourcesDirectory)

        for file in pom.xml angular.json tsconfig.json package.json project.ini *.csproj *.sln build.gradle

        do
            f_language=`find . -maxdepth 3 -name "${file}" -exec basename {} \; | head -n 1`
            if [[ "${f_language}" == pom.xml ]]; then
                echo MVN_GOAL: $FTFY_MVN_GOAL
                p_language=java
                break
            elif [[ "${f_language}" == angular.json ]] || [[ "${f_language}" == tsconfig.json ]]; then
                p_language=angular
                break
            elif [[ "${f_language}" == package.json ]]; then
                p_language=nodejs
                break
            elif [[ "${f_language}" == project.ini ]]; then
                p_language=php
                break
            elif [[ "${f_language}" == *".csproj" ]] || [[ "${f_language}" == *".sln" ]];then
                p_language=dotnet
                break
            elif [[ "${f_language}" == "build.gradle" ]]; then
                p_language=android
                break
            else
                p_language=null
            fi
        done


        echo "Linguagem de Programação:" $p_language

        echo "##vso[task.setvariable variable=p_language;]$p_language"


        if [ $p_language == null ]; then
            echo "##[warning]Não foi possivel definir a linguagem de programação deste codigo fonte"
        fi


        #######


        JAVA_HOME_17_X64=/usr/java/open-jdk-17.0.8

        echo "##[command]echo \$JAVA_HOME_17_X64"

        echo JAVA_HOME_17_X64: $JAVA_HOME_17_X64


        echo "##vso[task.setvariable variable=JAVA_HOME_17_X64;]$JAVA_HOME_17_X64"


        echo MAVEN_VERSION: $MAVEN_VERSION


        if [[ -n $MAVEN_VERSION ]]; then
            export PATH=/opt/apache-maven/apache-maven-$MAVEN_VERSION/bin:$PATH
            echo "##vso[task.setvariable variable=PATH;]$PATH"
        fi

        echo PATH: $PATH


        #######


        echo Build.Repository.Name=$(Build.Repository.Name)


        echo FORTIFY_APPLICATION=$FORTIFY_APPLICATION

        echo FORTIFY_SESSION=$FORTIFY_SESSION


        echo "##[command]echo NODE_EXTRA_CA_CERTS"

        echo $(NODE_EXTRA_CA_CERTS)

        echo "##[command]md5sum NODE_EXTRA_CA_CERTS"

        md5sum $(NODE_EXTRA_CA_CERTS)


        #verificar diretório contendo os certificados necessários para a próxima task

        #ls -lah /etc/pki/ca-trust/source/anchors/


        echo Build.DefinitionName=$(Build.DefinitionName)

        echo Build.BuildNumber=$(Build.BuildNumber)

        echo Build.BuildId=$(Build.BuildId)

        echo Build.SourceBranch=$(Build.SourceBranch)

        echo Build.SourceBranchName=$(Build.SourceBranchName)

        echo Build.SourceVersion=$(Build.SourceVersion)


        echo "##[command]echo \$valida.vec"

        echo vec=$(valida.vec)


        #######


        echo "Versão atual:"

        echo "##[command]git log --pretty=format:"%H %D" | sed -n '1p'"

        git -c safe.directory=* log --pretty=format:"%H %D" | sed -n '1p'

        echo "##[command]git describe --tags $(Build.SourceVersion)"

        git -c safe.directory=* describe --tags $(Build.SourceVersion)


        #######


        echo "Versões anteriores [tag] seguindo a branch atual:"


        FORTIFY_NEW_VERSION=`git -c safe.directory=* log --pretty=format:"%H %D" | grep -oP '(?<=tag: )[^\s]*([0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3})' | sed -n '1p'`

        FORTIFY_LAST_VERSION=`git -c safe.directory=* log --pretty=format:"%H %D" | grep -oP '(?<=tag: )[^\s]*([0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3})' | sed -n '2p'`

        FORTIFY_THIRD_VERSION=`git -c safe.directory=* log --pretty=format:"%H %D" | grep -oP '(?<=tag: )[^\s]*([0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3})' | sed -n '3p'`


        echo Última tag mais recente: $FORTIFY_NEW_VERSION

        echo Penúltima tag mais recente: $FORTIFY_LAST_VERSION

        echo Antepenúltima tag mais recente: $FORTIFY_THIRD_VERSION


        echo Validando VEC e versão...

        # A VEC dá false pois o valor $(Build.SourceBranchName) não passa o valor da tag quando o build é disparado a partir da branch.

        if [[ $(valida.vec) == false ]]; then

        echo "O nome de versão ' $(Build.SourceBranchName) ' NÃO ATENDE aos parâmetros da VEC."

        fi

        if [[ -n $FORTIFY_NEW_VERSION ]]; then
          FORTIFY_NEW_VERSION=`echo $FORTIFY_NEW_VERSION | grep -oP $(FORTIFY_REGEX)`
          FORTIFY_LAST_VERSION=`echo $FORTIFY_LAST_VERSION | grep -oP $(FORTIFY_REGEX)`
        else

        if [[ -n $FORTIFY_LAST_VERSION ]]; then
          FORTIFY_NEW_VERSION="develop"
        else
          FORTIFY_NEW_VERSION=`echo $FORTIFY_LAST_VERSION | grep -oP $(FORTIFY_REGEX)`
          FORTIFY_LAST_VERSION=`echo $FORTIFY_THIRD_VERSION | grep -oP $(FORTIFY_REGEX)`
        fi

        fi

        #

        #echo FORTIFY_NEW_VERSION=$FORTIFY_NEW_VERSION

        #echo FORTIFY_LAST_VERSION=$FORTIFY_LAST_VERSION

        echo "##[debug]Seu resultado será publicado no Fortify sob a Versão de nome: ' $FORTIFY_APPLICATION:$FORTIFY_NEW_VERSION '"


        echo "##vso[task.setvariable variable=FORTIFY_NEW_VERSION]$FORTIFY_NEW_VERSION"

        echo "##vso[task.setvariable variable=FORTIFY_LAST_VERSION]$FORTIFY_LAST_VERSION"


        ########


        echo "Agent Name: $AGENT_NAME"

        AGENT_SHORT_NAME=$(echo "$AGENT_NAME" | sed -E 's/^([a-zA-Z]+)[0-9]*\..*/\1/')


        echo "Nome curto do agente: $AGENT_SHORT_NAME"


        if [[ "$AGENT_SHORT_NAME" == "cadsvaprlx" ]]; then
            CONTAINER_ENGINE=docker
            echo "##vso[task.setvariable variable=CONTAINER_ENGINE]docker"
        else
            CONTAINER_ENGINE=podman
            echo "##vso[task.setvariable variable=CONTAINER_ENGINE]podman"
        fi


        echo "##[debug]Container engine selecionado: $CONTAINER_ENGINE"
  - task: CmdLine@2
    displayName: '[MANTER] SAST: Validando Passagem de Variáveis'
    enabled: False
    inputs:
      script: >-
        scancentral --version

        /opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/bin/scancentral --version


        echo FORTIFY_SESSION: $FORTIFY_SESSION

        echo FORTIFY_APPLICATION: $FORTIFY_APPLICATION


        echo FORTIFY_NEW_VERSION: $FORTIFY_NEW_VERSION

        echo FORTIFY_LAST_VERSION: $FORTIFY_LAST_VERSION

        echo FORTIFY_APPLICATION-FORTIFY_NEW_VERSION

        echo $FORTIFY_APPLICATION-$FORTIFY_NEW_VERSION

        #echo FORTIFY_APPLICATION-[ dependencies.A.outputs['FORTIFY_NEW_VERSION'] ]

        #echo $FORTIFY_APPLICATION-$[ dependencies.A.outputs['FORTIFY_NEW_VERSION'] ]
  - task: CmdLine@2
    displayName: '[MANTER] SAST: Fortify ScanCentral SAST Assessment v1'
    enabled: False
    inputs:
      script: "echo Sistema: $FORTIFY_APPLICATION\necho Versão mais recente: $FORTIFY_NEW_VERSION\necho Versão anterior: $FORTIFY_LAST_VERSION\n\necho Empacotando aplicação...\n/opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/bin/scancentral package --output package.zip\n\necho Disparando requisição de análise SAST...\n/opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/bin/scancentral \\\n    -url $FORTIFY_URL_CONTROLLER \\\n    start --upload-to-ssc \\\n    -application $FORTIFY_APPLICATION \\\n    -version $FORTIFY_NEW_VERSION \\\n    --fpr-filename-on-ssc $(Build.BuildNumber)\n    --package package.zip \\\n    --ssc-upload-token $FORTIFY_CI_TOKEN "
  - task: FortifyScanCentralSAST@7
    displayName: 'SAST: Análise Java [Assíncrona]'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), ne(variables['guardrail.sec'], 'true'), ne(variables['fortify_disable'], 'gecmi'), eq(variables['p_language'], 'java'))
    retryCountOnTaskFailure: 2
    inputs:
      scanCentralCtrlUrl: $(FORTIFY_URL_CONTROLLER)
      scanCentralClientToken: $(FORTIFY_CLIENT_AUTH_TOKEN)
      sscUrl: $(FORTIFY_URL)
      sscCiToken: $(FORTIFY_CI_TOKEN)
      uploadToSSC: true
      applicationName: $(Build.Repository.Name)
      applicationVersion: $(FORTIFY_NEW_VERSION)
      buildTool: mvn
      buildCommand: $(FTFY_MVN_GOAL)
      buildFile: $(POM_PATH)
      additionalTranslationArgs: >-
        -Dcom.fortify.sca.NullPtrMaxFunctionTime=30000

        -Dcom.fortify.sca.exclude.unimported.node.modules=true

        -Dcom.fortify.sca.EnableDOMModeling=true

        -Dcom.fortify.sca.fileextensions.inc=PHP

        -Dcom.fortify.sca.rules.password_regex.global=(?i)(s|_)?(user|usr|member|admin|guest|login|default|new|current|old|client|server|proxy|sqlserver|my|mysql|mongo|mongodb|db|database|ldap|smtp|email|email(_)?smtp)?(_|\.)?(pass(wd|word|phrase)|secret|senha)
      excludeArgs: >-
        ./**/node_modules/**/*

        ./**/*.min.js

        ./**/dist/**/*
      skipBuild: false
      excludeDisabledProjects: false
      includeTest: false
      includeNodeModules: false
      additionalScanArgs: >-
        -build-label $(FORTIFY_FPR_NAME)

        -build-version $(FORTIFY_FPR_NAME)-$(Build.BuildNumber)
      sensorPool: $(FORTIFY_SENSOR_POOL)
      overwrite: false
      quiet: false
      downloadDebugLogs: false
      debugLogFileName: $(Build.Repository.Name)-$(FORTIFY_FPR_NAME)-fortify-debug-logs.zip
  - task: FortifyScanCentralSAST@7
    displayName: 'SAST: Análise Default [Assíncrona]'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), ne(variables['guardrail.sec'], 'true'), ne(variables['fortify_disable'], 'gecmi'), ne(variables['p_language'], 'java'))
    retryCountOnTaskFailure: 2
    inputs:
      scanCentralCtrlUrl: $(FORTIFY_URL_CONTROLLER)
      scanCentralClientToken: $(FORTIFY_CLIENT_AUTH_TOKEN)
      sscUrl: $(FORTIFY_URL)
      sscCiToken: $(FORTIFY_CI_TOKEN)
      uploadToSSC: true
      applicationName: $(Build.Repository.Name)
      applicationVersion: $(FORTIFY_NEW_VERSION)
      autoDetectBuildTool: true
      additionalTranslationArgs: >-
        -Dcom.fortify.sca.exclude.unimported.node.modules=true

        -Dcom.fortify.sca.EnableDOMModeling=true

        -Dcom.fortify.sca.fileextensions.inc=PHP

        -Dcom.fortify.sca.rules.password_regex.global=(?i)(s|_)?(user|usr|member|admin|guest|login|default|new|current|old|client|server|proxy|sqlserver|my|mysql|mongo|mongodb|db|database|ldap|smtp|email|email(_)?smtp)?(_|\.)?(pass(wd|word|phrase)|secret|senha)
      excludeArgs: >-
        ./**/node_modules/**/*

        ./**/*.min.js

        ./**/dist/**/*
      skipBuild: false
      excludeDisabledProjects: false
      includeTest: false
      includeNodeModules: false
      additionalScanArgs: >-
        -build-label $(FORTIFY_FPR_NAME)

        -build-version $(FORTIFY_FPR_NAME)-$(Build.BuildNumber)
      sensorPool: $(FORTIFY_SENSOR_POOL)
      overwrite: false
      quiet: false
      downloadDebugLogs: false
      debugLogFileName: $(Build.Repository.Name)-$(FORTIFY_FPR_NAME)-fortify-debug-logs.zip
  - task: FortifyScanCentralSAST@7
    displayName: 'SAST: Análise Java [Síncrona]'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), eq(variables['guardrail.sec'], 'true'), ne(variables['fortify_disable'], 'gecmi'), eq(variables['p_language'], 'java'))
    retryCountOnTaskFailure: 2
    inputs:
      scanCentralCtrlUrl: $(FORTIFY_URL_CONTROLLER)
      scanCentralClientToken: $(FORTIFY_CLIENT_AUTH_TOKEN)
      sscUrl: $(FORTIFY_URL)
      sscCiToken: $(FORTIFY_CI_TOKEN)
      uploadToSSC: true
      applicationName: $(Build.Repository.Name)
      applicationVersion: $(FORTIFY_NEW_VERSION)
      buildTool: mvn
      buildCommand: $(FTFY_MVN_GOAL)
      buildFile: $(POM_PATH)
      additionalTranslationArgs: >-
        -Dcom.fortify.sca.NullPtrMaxFunctionTime=30000

        -Dcom.fortify.sca.exclude.unimported.node.modules=true

        -Dcom.fortify.sca.EnableDOMModeling=true

        -Dcom.fortify.sca.fileextensions.inc=PHP

        -Dcom.fortify.sca.rules.password_regex.global=(?i)(s|_)?(user|usr|member|admin|guest|login|default|new|current|old|client|server|proxy|sqlserver|my|mysql|mongo|mongodb|db|database|ldap|smtp|email|email(_)?smtp)?(_|\.)?(pass(wd|word|phrase)|secret|senha)
      excludeArgs: >-
        ./**/node_modules/**/*

        ./**/*.min.js

        ./**/dist/**/*
      skipBuild: false
      excludeDisabledProjects: false
      includeTest: false
      includeNodeModules: false
      additionalScanArgs: >-
        -build-label $(FORTIFY_FPR_NAME)

        -build-version $(FORTIFY_FPR_NAME)-$(Build.BuildNumber)
      sensorPool: $(FORTIFY_SENSOR_POOL)
      block: true
      logFile: $(Build.Repository.Name)-$(FORTIFY_NEW_VERSION)-$(Build.BuildNumber).log
      overwrite: true
      quiet: false
      downloadDebugLogs: false
      debugLogFileName: $(Build.Repository.Name)-$(FORTIFY_FPR_NAME)-fortify-debug-logs.zip
  - task: FortifyScanCentralSAST@7
    displayName: 'SAST: Análise Default [Síncrona]'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), eq(variables['guardrail.sec'], 'true'), ne(variables['fortify_disable'], 'gecmi'), ne(variables['p_language'], 'java'))
    retryCountOnTaskFailure: 2
    inputs:
      scanCentralCtrlUrl: $(FORTIFY_URL_CONTROLLER)
      scanCentralClientToken: $(FORTIFY_CLIENT_AUTH_TOKEN)
      sscUrl: $(FORTIFY_URL)
      sscCiToken: $(FORTIFY_CI_TOKEN)
      uploadToSSC: true
      applicationName: $(Build.Repository.Name)
      applicationVersion: $(FORTIFY_NEW_VERSION)
      autoDetectBuildTool: true
      additionalTranslationArgs: >-
        -Dcom.fortify.sca.exclude.unimported.node.modules=true

        -Dcom.fortify.sca.EnableDOMModeling=true

        -Dcom.fortify.sca.fileextensions.inc=PHP

        -Dcom.fortify.sca.rules.password_regex.global=(?i)(s|_)?(user|usr|member|admin|guest|login|default|new|current|old|client|server|proxy|sqlserver|my|mysql|mongo|mongodb|db|database|ldap|smtp|email|email(_)?smtp)?(_|\.)?(pass(wd|word|phrase)|secret|senha)
      excludeArgs: >-
        ./**/node_modules/**/*

        ./**/*.min.js

        ./**/dist/**/*
      skipBuild: false
      excludeDisabledProjects: false
      includeTest: false
      includeNodeModules: false
      additionalScanArgs: >-
        -build-label $(FORTIFY_FPR_NAME)

        -build-version $(FORTIFY_FPR_NAME)-$(Build.BuildNumber)
      sensorPool: $(FORTIFY_SENSOR_POOL)
      block: true
      logFile: $(Build.Repository.Name)-$(FORTIFY_NEW_VERSION)-$(Build.BuildNumber).log
      overwrite: true
      quiet: false
      downloadDebugLogs: false
      debugLogFileName: $(Build.Repository.Name)-$(FORTIFY_FPR_NAME)-fortify-debug-logs.zip
  - task: CmdLine@2
    displayName: '[MANTER] SAST: Imprime Log da execução -- Futuro Guardrail'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded())
    continueOnError: True
    enabled: False
    inputs:
      script: >-
        echo Imprimindo log da execução...


        echo "##[command]cat $(System.DefaultWorkingDirectory)/$(Build.Repository.Name)-$(FORTIFY_FPR_NAME)-$(Build.BuildNumber).log"


        cat $(System.DefaultWorkingDirectory)/$(Build.Repository.Name)-$(FORTIFY_FPR_NAME)-$(Build.BuildNumber).log
  - task: CmdLine@2
    displayName: 'SAST: Guardrail Segurança Cibernética'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), eq(variables['guardrail.sec'], 'true'), ne(variables['fortify_disable'], 'gecmi'))
    inputs:
      script: "command -v docker && docker --version\ncommand -v podman && podman --version\n\necho \"$FORTIFY_REGISTRY_PASSWORD\" | $CONTAINER_ENGINE login default-route-openshift-image-registry.apps.produtos4.caixa \\\n  --username \"$FORTIFY_REGISTRY_USERNAME\" \\\n  --password-stdin\n \necho FORTIFY_APPLICATION: $FORTIFY_APPLICATION\n\necho KEYSTORE_SECUREFILEPATH: $KEYSTORE_SECUREFILEPATH\ncp \"$KEYSTORE_SECUREFILEPATH\" \"$(System.DefaultWorkingDirectory)/keystore.jks\"\n\necho \"##[command]$CONTAINER_ENGINE --version\"\n$CONTAINER_ENGINE --version\n\necho \"##[command]Executando container Fortify...\"\n\n$CONTAINER_ENGINE run --rm \\\n  --security-opt seccomp=unconfined \\\n  --memory=12g \\\n  --memory-swap=12g \\\n  -v $(System.DefaultWorkingDirectory):/src \\\n  -w /src \\\n  -e FORTIFY_APPLICATION \\\n  -e FORTIFY_APP_VERSION=$FORTIFY_NEW_VERSION \\\n  -e FORTIFY_PREVIOUS_VERSION=$FORTIFY_LAST_VERSION \\\n  -e FORTIFY_SESSION \\\n  -e FORTIFY_URL \\\n  -e FORTIFY_CI_TOKEN \\\n  -e FORTIFY_CLIENT_AUTH_TOKEN \\\n  -e FORTIFY_FILTERSET_GUARDRAIL \\\n  -e FORTIFY_SENSOR_VERSION \\\n  -e FORTIFY_SIGLA=$(Build.DefinitionName) \\\n  -e FORTIFY_COMUNIDADE \\\n  -e FORTIFY_LDAP_GROUP \\\n  default-route-openshift-image-registry.apps.produtos4.caixa/fortify/fortify-ci-tools:7.0.0-jdk-17 \\\n  bash -c \"\n    \n    echo Configurando Key Store\n    fcli config truststore set \\\n      --file=/src/keystore.jks \\\n      --password=$KEYSTORE_PWD \\\n      --type=jks\n    \n    echo \\\"Nome do Sistema: \\$FORTIFY_APPLICATION\\\"\n    echo \\\"Nome da Versão: \\$FORTIFY_APP_VERSION\\\"\n    echo \\\"Nome da Versão Anterior: \\$FORTIFY_PREVIOUS_VERSION\\\"\n    \n    echo Login no Fortify...\n    fcli ssc session login \\\n      --ssc-session=\\$FORTIFY_SESSION \\\n      --url=\\$FORTIFY_URL \\\n      --token=\\$FORTIFY_CI_TOKEN \\\n      --client-auth-token=\\$FORTIFY_CLIENT_AUTH_TOKEN \\\n      --socket-timeout=180\n    \n    echo Atualizando aplicação no Fortify...\n    fcli ssc appversion refresh-metrics \\\n      \\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION \\\n      --ssc-session=\\$FORTIFY_SESSION || true\n\n    echo\n    echo ===== BUSCANDO VULNERABILIDADES CRÍTICAS =====\n    \n    fcli ssc issue list \\\n      --appversion=\\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION \\\n      --filterset=\\$FORTIFY_FILTERSET_GUARDRAIL \\\n      --filter='Folder:Critical' \\\n      --output=csv \\\n      --to-file=guardrail-raw.csv \\\n      --ssc-session=\\$FORTIFY_SESSION || true\n\n    echo\n    echo ===== FILTRANDO ITENS INVÁLIDOS =====\n    \n    grep -v 'Not an Issue' guardrail-raw.csv > guardrail-results.csv || true\n\n    echo Resultado final:\n    cat guardrail-results.csv\n\n    echo\n    echo Logout do Fortify...\n    fcli ssc session logout \\\n      --ssc-session=\\$FORTIFY_SESSION \\\n      --no-revoke-token\n  \"\n\necho\necho \"##[debug]Resultado do Guardrail...\"\n\nguardrail_count=$(awk -F',' '\nNR > 1 {\n  for(i=1;i<=NF;i++){\n    if ($i == \"Critical\") {\n      count++\n      break\n    }\n  }\n}\nEND { print count+0 }\n' guardrail-results.csv)\n\nguardrail_count=${guardrail_count:-0}\n\necho \"##[debug]Total de vulnerabilidades críticas válidas: $guardrail_count\"\n\nif [ \"$guardrail_count\" -gt 0 ]; then\n  echo \"##vso[task.logissue type=error]Foram encontradas $guardrail_count vulnerabilidades críticas que violam os padrões de segurança exigidos.\"\n  exit 1\nelse\n  echo \"##[debug]Não foram encontradas vulnerabilidades críticas válidas.\"\nfi\n\necho \"##[debug]Resultado publicado no Fortify: '$FORTIFY_APPLICATION:$FORTIFY_NEW_VERSION'\""
  - task: CmdLine@2
    displayName: 'SAST: Guardrail Segurança Cibernética - Backup'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), eq(variables['guardrail.sec'], 'true'), ne(variables['fortify_disable'], 'gecmi'))
    enabled: False
    inputs:
      script: "command -v docker && docker --version\ncommand -v podman && podman --version\n\n#sudo usermod -aG docker $USER\n\n#ls -l /var/run/docker.sock\n\n#set -o errexit\n#set -o pipefail\n#echo Engine selecionado: $CONTAINER_ENGINE\n#echo Versão mais recente: $FORTIFY_NEW_VERSION\n#echo Versão anterior: $FORTIFY_LAST_VERSION\n\necho \"$FORTIFY_REGISTRY_PASSWORD\" | $CONTAINER_ENGINE login default-route-openshift-image-registry.apps.produtos4.caixa --username \"$FORTIFY_REGISTRY_USERNAME\" --password-stdin\n \necho FORTIFY_APPLICATION: $FORTIFY_APPLICATION\necho KEYSTORE_SECUREFILEPATH: $(KEYSTORE_SECUREFILEPATH)\nKEYSTORE_SECUREFILEPATH=$(KEYSTORE_SECUREFILEPATH)\ncp $KEYSTORE_SECUREFILEPATH $(System.DefaultWorkingDirectory)/keystore.jks\n#echo \"##vso[task.setvariable variable=KEYSTORE_SECUREFILEPATH]$KEYSTORE_SECUREFILEPATH\"\n\n# Valida Integridade do JKS (parte 1, fora do container)\n#echo Valida integridade do certificado FORA do container\n#echo \"##[command]md5sum /etc/pki/ca-trust/source/anchors/keystore-ssc24.jks\"\n#md5sum /etc/pki/ca-trust/source/anchors/keystore-ssc24.jks\n#echo \"##[command]md5sum $KEYSTORE_SECUREFILEPATH\"\n#md5sum $KEYSTORE_SECUREFILEPATH\n#echo \"##[command]md5sum $(System.DefaultWorkingDirectory)/keystore.jks\"\n#md5sum $(System.DefaultWorkingDirectory)/keystore.jks\n\n# Executa o container Fortify com as variáveis herdadas do ambiente\necho \"##[command]$CONTAINER_ENGINE --version\"\n$CONTAINER_ENGINE --version\necho \"##[command]$CONTAINER_ENGINE run -v $(System.DefaultWorkingDirectory):/src default-route-openshift-image-registry.apps.produtos4.caixa/fortify/fortify-ci-tools:7.0.0-jdk-17\"\n$CONTAINER_ENGINE run --rm \\\n  --security-opt seccomp=unconfined \\\n  --memory=12g \\\n  --memory-swap=12g \\\n  -v $(System.DefaultWorkingDirectory):/src \\\n  -w /src \\\n  -e FORTIFY_APPLICATION \\\n  -e FORTIFY_APP_VERSION=$FORTIFY_NEW_VERSION \\\n  -e FORTIFY_PREVIOUS_VERSION=$FORTIFY_LAST_VERSION \\\n  -e FORTIFY_SESSION \\\n  -e FORTIFY_URL \\\n  -e FORTIFY_CI_TOKEN \\\n  -e FORTIFY_CLIENT_AUTH_TOKEN \\\n  -e FORTIFY_FILTERSET_GUARDRAIL \\\n  -e FORTIFY_SENSOR_VERSION \\\n  -e FORTIFY_SIGLA=$(Build.DefinitionName) \\\n  -e FORTIFY_COMUNIDADE \\\n  -e FORTIFY_LDAP_GROUP \\\n  default-route-openshift-image-registry.apps.produtos4.caixa/fortify/fortify-ci-tools:7.0.0-jdk-17 \\\n  bash -c \"\n    \n    #echo Valida integridade do certificado DENTRO do container\n    #echo md5sum /src/keystore.jks\n    #md5sum /src/keystore.jks\n    \n    echo Configurando Key Store\n    fcli config truststore set \\\n      --file=/src/keystore.jks \\\n      --password=$KEYSTORE_PWD \\\n      --type=jks\n    \n    echo \\\"Nome do Sistema: \\$FORTIFY_APPLICATION\\\"\n    \n    echo \\\"Nome da Versão: \\$FORTIFY_APP_VERSION\\\"\n    \n    echo \\\"Nome da Versão Anterior: \\$FORTIFY_PREVIOUS_VERSION\\\"\n    \n    echo Login no Fortify...\n    fcli ssc session login \\\n      --ssc-session=\\$FORTIFY_SESSION \\\n      --url=\\$FORTIFY_URL \\\n      --token=\\$FORTIFY_CI_TOKEN \\\n      --client-auth-token=\\$FORTIFY_CLIENT_AUTH_TOKEN \\\n    \n    \n    echo Atualizando aplicação no Fortify...\n    fcli ssc appversion refresh-metrics \\\n      \\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION \\\n      --ssc-session=\\$FORTIFY_SESSION || true\n    \n    echo Consultando número de vulnerabilidades da aplicação...\n    fcli ssc issue count \\\n      --appversion=\\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION \\\n      --by=FOLDER \\\n      --filterset=\\$FORTIFY_FILTERSET_GUARDRAIL \\\n      --filter='Folder:Critical' \\\n      --output=csv \\\n      --to-file=guardrail-results.csv \\\n      --ssc-session=\\$FORTIFY_SESSION || true\n    \n    cat guardrail-results.csv\n    \n    echo\n    echo Logout do Fortify...\n    fcli ssc session logout \\\n      --ssc-session=\\$FORTIFY_SESSION \\\n      --no-revoke-token\n  \"\n\necho \"##[debug]Resultado do Guardrail...\"\nguardrail_results=false\nwhile IFS=',' read -r id cleanName name totalCount auditedCount visibleCount; do\n  if [ \"$cleanName\" == \"Critical\" ] && [ \"$totalCount\" -gt 0 ]; then\n    guardrail_results=true\n    guardrail_count=$totalCount\n  fi\ndone < guardrail-results.csv\nif [ $guardrail_results == \"true\" ]; then\n  echo \"##vso[task.logissue type=error]Foram encontradas $guardrail_count vulnerabilidades que violam os padrões de segurança exigidos.\"\n  exit 1\nelse\n  echo \"##[debug]Não foram encontradas vulnerabilidades que violam os padrões de segurança exigidos.\"\nfi\necho \"##[debug]Seu resultado está publicado no Fortify sob a Versão de nome: ' $FORTIFY_APPLICATION:$FORTIFY_NEW_VERSION '\""
  - task: Bash@3
    displayName: md5
    inputs:
      targetType: inline
      script: >
        pwd

        ls $(project.file)

        HASH=`md5sum -b $(project.file)`

        SHA=`sha1sum -b $(project.file)`

        echo "MD5-BUILD: $HASH"

        echo "SHA1-BUILD: $SHA"
  - task: Bash@3
    displayName: Publica no Nexus
    inputs:
      targetType: inline
      script: >-
        cd $(Build.SourcesDirectory)


        p_group=$(project.group) || true

        p_name=$(project.name)

        p_version=$(project.version)

        p_extension=$(project.extension)


        p_group=`[ -z "$p_group" ] && echo ""br.gov.caixa.$p_name"" || echo "$p_group"`


        echo VEC $(valida.vec)

        if [ $(valida.vec) = true ];then

        p_version=$BUILD_SOURCEBRANCHNAME

        NEXUS_URL=$(NEXUS_URL_ANGULAR_RELEASE)

        else

        p_version=${p_version^^}

        p_version=${p_version/-SNAPSHOT/}-SNAPSHOT

        #definido por GECPA em Nov/2025 que todo artefato não release candidate deve conter sufixo -SNAPSHOT

        echo "##vso[build.updatebuildnumber]"$p_version""

        NEXUS_URL=$(NEXUS_URL_ANGULAR_SNAPSHOT)

        fi


        echo "##[section]=== Info do pacote ==="

        echo "##[section]groupid= $p_group"

        echo "##[section]artifact= $p_name"

        echo "##[section]version= $p_version"

        echo "========================================================="


        LIB="$(library)"

        # quando for uma pipeline do tipo lib o pom original do projeto precisa subir junto

        if [ "${LIB:-}" = "true" ] || [ "${LIB:-}" = "TRUE" ]; then


        echo -Dversion.app=$(Build.BuildNumber) -Dnexus_interno_user=$(nexus_interno_user) -Dnexus_interno_pass=$(nexus_interno_pass) -DgroupId="${p_group}" -DartifactId="${p_name}" -Dversion="${p_version}" -Dpackaging="${p_extension}" -Dfile="$(project.file)" -DpomFile="$(Build.SourcesDirectory)/$(POM_PATH)" -DrepositoryId=$(NEXUS_REPOSITORY_ID) -DgeneratePom=false -Durl=${NEXUS_URL} -Drevision="${p_version}"


        /opt/apache-maven/apache-maven-3.8.5/bin/mvn deploy:deploy-file -Dversion.app=$(Build.BuildNumber) -Dnexus_interno_user=$(nexus_interno_user) -Dnexus_interno_pass=$(nexus_interno_pass) -DgroupId="${p_group}" -DartifactId="${p_name}" -Dversion="${p_version}" -Dpackaging="${p_extension}" -Dfile="$(project.file)" -DpomFile="$(Build.SourcesDirectory)/$(POM_PATH)" -DrepositoryId=$(NEXUS_REPOSITORY_ID) -DgeneratePom=false -Durl=${NEXUS_URL} -Drevision="${p_version}"


        else


        echo -Dversion.app=$(Build.BuildNumber) -DgroupId="${p_group}" -DartifactId="${p_name}" -Dversion="${p_version}" -Dpackaging="${p_extension}" -Dfile="$(project.file)" -DrepositoryId=$(NEXUS_REPOSITORY_ID) -DgeneratePom=true -Durl=${NEXUS_URL}


        /opt/apache-maven/apache-maven-3.8.5/bin/mvn deploy:deploy-file -Dversion.app=$(Build.BuildNumber) -Dnexus_interno_user=$(nexus_interno_user) -Dnexus_interno_pass=$(nexus_interno_pass) -DgroupId="${p_group}" -DartifactId="${p_name}" -Dversion="${p_version}" -Dpackaging="${p_extension}" -Dfile="$(project.file)" -DrepositoryId=$(NEXUS_REPOSITORY_ID) -DgeneratePom=true -Durl=${NEXUS_URL} -Drevision="${p_version}"


        fi


        echo "##vso[task.setvariable variable=project.uploaded;]true"
  - task: Bash@3
    displayName: Publica no Nexus old
    enabled: False
    inputs:
      targetType: inline
      script: >-
        cd $(Build.SourcesDirectory)


        p_group=$(project.group) || true

        p_name=$(project.name)

        p_version=$(project.version)

        p_extension=$(project.extension)


        p_group=`[ -z "$p_group" ] && echo ""br.gov.caixa.$p_name"" || echo "$p_group"`



        if [ $(project.release) = true ]; then

        NEXUS_URL=$(NEXUS_URL_ANGULAR_RELEASE)

        else

        NEXUS_URL=$(NEXUS_URL_ANGULAR_SNAPSHOT)

        p_version=${p_version/-SNAPSHOT/}-SNAPSHOT

        fi


        echo $(valida.vec)

        if [ $(valida.vec) = true ];then

        p_version=$BUILD_SOURCEBRANCHNAME

        NEXUS_URL=$(NEXUS_URL_ANGULAR_RELEASE)

        fi


        echo "##[section]info: -Dversion.app=$(Build.BuildNumber) -DgroupId="${p_group}" -DartifactId="${p_name}" -Dversion="${p_version}" -Dpackaging="${p_extension}" -Dfile="$(project.file)" -DrepositoryId=$(NEXUS_REPOSITORY_ID) -DgeneratePom=true -Durl=${NEXUS_URL}"


        /opt/apache-maven/apache-maven-3.8.5/bin/mvn deploy:deploy-file -Dversion.app=$(Build.BuildNumber) -Dnexus_interno_user=$(nexus_interno_user) -Dnexus_interno_pass=$(nexus_interno_pass) -DgroupId="${p_group}" -DartifactId="${p_name}" -Dversion="${p_version}" -Dpackaging="${p_extension}" -Dfile="$(project.file)" -DrepositoryId=$(NEXUS_REPOSITORY_ID) -DgeneratePom=true -Durl=${NEXUS_URL} -Drevision="${p_version}"



        echo "##vso[task.setvariable variable=project.uploaded;]true"
      failOnStderr: true
  - task: Bash@3
    displayName: Bash Script
    enabled: False
    inputs:
      targetType: inline
      script: exit 1
  - task: Bash@3
    displayName: Convertendo Minúsculo e Definindo nome Projeto/Repo
    inputs:
      targetType: inline
      script: >-
        #!/bin/bash



        GitRepositoryName=$(REPO_FINAL_NAME)


        DefinitionName=$(Build.DefinitionName)


        if [ "$GitRepositoryName" == "repository" ] ; then


        RepositoryName=`(echo "$DefinitionName" | tr '[[:upper:]]' '[[:lower:]]')`

        echo "##vso[task.setvariable variable=REPOSITORIO;]$RepositoryName"

        ProjectName=`(echo "$DefinitionName" | tr '[[:upper:]]' '[[:lower:]]' | cut -f1 -d"-")`

        echo "##vso[task.setvariable variable=PROJETO;]$ProjectName"


        else


        RepositoryName=`(echo "$GitRepositoryName" | tr '[[:upper:]]' '[[:lower:]]')`

        echo "##vso[task.setvariable variable=REPOSITORIO;]$RepositoryName"

        ProjectName=`(echo "$GitRepositoryName" | tr '[[:upper:]]' '[[:lower:]]' | cut -f1 -d"-")`

        echo "##vso[task.setvariable variable=PROJETO;]$ProjectName"


        fi
  - task: Bash@3
    displayName: Corrigindo Codificação Arquivos dos2unix
    inputs:
      targetType: inline
      script: >-
        PASTA="$(Build.SourcesDirectory)/.s2i/bin"


        shopt -s nullglob

        arquivos=( "$PASTA"/* )


        if (( ${#arquivos[@]} == 0 )); then
          echo "##[error] Nenhum arquivo em .s2i/bin/ para converter (dos2unix não executado)."
          echo "##[error] Se tratam de arquivos obrigatórios para configuração do ambiente $(nome_imagem)"
          echo "##[error] Em caso de dúvidas acesse o link abaixo para exemplo com projetos angular (seção 'Pré-requisito: Criar a pasta .s2i/bin no repositório da aplicação') ou entre em contato com a CESTI36"
          echo "##[error] https://devops.caixa/projetos/Caixa/_wiki/wikis/Caixa.wiki/6/Pipeline-Angular-Conteiner?anchor=1.-crie-a-pasta-.s2i/bin-e-crie-os-arquivos-%22run%22%2C-%22assemble%22.-voc%C3%AA-pode-encontrar-os-modelos-dos-arquivos-no-reposit%C3%B3rio-%22sample-angular%22."
          exit 1
        fi


        dos2unix "${arquivos[@]}"
  - task: Bash@3
    displayName: Copiando S2I para StagingDirectory
    inputs:
      targetType: inline
      script: "#!/bin/bash\n\necho \"Artefato que será enviado para Imagem Docker:\" $(project.file)\n\nmv -vf $(project.file) $(Build.StagingDirectory)/\nmv -vf $(Build.SourcesDirectory)/.s2i $(Build.StagingDirectory)/\n\nmv -vf $(Build.StagingDirectory)/*.$(project.extension) $(Build.StagingDirectory)/$(REPOSITORIO).$(project.extension)\n\nif [[ -f $(Build.SourcesDirectory)/jmx_prometheus.yaml ]]\n then \n   mv -vf $(Build.SourcesDirectory)/jmx_prometheus.yaml $(Build.StagingDirectory)/\nfi\n\nif [[ -f $(Build.SourcesDirectory)/cli-offline.sh ]]\n then \n   mv -vf $(Build.SourcesDirectory)/cli-offline.sh $(Build.StagingDirectory)/\nfi\n\nif [[ -f $(Build.SourcesDirectory)/module.xml ]]\n then \n   mv -vf $(Build.SourcesDirectory)/module.xml $(Build.StagingDirectory)/\nfi"
  - task: Bash@3
    displayName: Login Cluster
    inputs:
      targetType: inline
      script: >-
        #!/bin/bash

        set -x


        if echo "$(SITE)" | egrep -q "^(okd4|ocp)"

        then

        oc login $(OKD_API_REGISTRY) --insecure-skip-tls-verify=true --token=$(OKD_TOKEN_REGISTRY) > /dev/null

        else

        oc login $(OKD_API) --insecure-skip-tls-verify=true --token=$(OKD_TOKEN) > /dev/null

        fi
  - task: Bash@3
    displayName: 'Login OKD-4 '
    condition: and(succeeded(), eq(variables['SITE'], 'okd4_nprd'))
    enabled: False
    inputs:
      targetType: inline
      script: >-
        oc login $(OKD_4_API) --insecure-skip-tls-verify=true -u $(OKD_4_USER_SERVICE) -p $(OKD_4_TOKEN) > /dev/null



        xxxxx
  - task: Bash@3
    displayName: Criando Projeto Build
    inputs:
      targetType: inline
      script: >-
        oc get project $(ProjetoBuild)

        if [ "$?" -ne "0" ]; then
         oc new-project $(ProjetoBuild)
        fi
  - task: Bash@3
    displayName: Criando novo BuildConfig
    inputs:
      targetType: inline
      script: >-
        #!/bin/bash

        set -x


        if echo "$(SITE)" | egrep -q "^(okd4|ocp)"

        then

        buildconfig=$(REPOSITORIO)

        else

        buildconfig=$(REPOSITORIO)-esteiras

        fi


        oc get imagestreams/$buildconfig -n $(ProjetoBuild)

        if [ "$?" -ne "0" ]; then

        oc new-app $(TemplateBuild_OKD) --labels=app=$buildconfig -p NAME=$buildconfig -p VERSION=$(tag_imagem) -n $(ProjetoBuild)

        fi
  - task: Bash@3
    displayName: Criando novo BuildConfig - OKD4
    condition: and(succeeded(), eq(variables['SITE'], 'okd4_nprd'))
    enabled: False
    inputs:
      targetType: inline
      script: >-
        #!/bin/bash


        oc get imagestreams/$(REPOSITORIO) -n $(ProjetoBuild)

        if [ "$?" -ne "0" ]; then

        oc new-app $(TemplateBuild_OKD) --labels=app=$(REPOSITORIO) -p NAME=$(REPOSITORIO) -p VERSION=$(TemplateVersaoProduto_OKD) -n $(ProjetoBuild)

        fi
  - task: Bash@3
    displayName: Atualizando valores BuildImage e TagImage
    inputs:
      targetType: inline
      script: >-
        #!/bin/bash

        if echo "$(SITE)" | egrep -q "^(okd4|ocp)"

        then

        buildconfig=$(REPOSITORIO)

        else

        buildconfig=$(REPOSITORIO)-esteiras

        fi


        oc patch bc $buildconfig --patch '{"spec": {"strategy": {"sourceStrategy": {"from": {"name": "$(nome_imagem):$(tag_imagem)"}}}}}' -n $(ProjetoBuild)
  - task: Bash@3
    displayName: Atualizando valores BuildImage e TagImage - OKD4
    condition: and(succeeded(), eq(variables['SITE'], 'okd4_nprd'))
    enabled: False
    inputs:
      targetType: inline
      script: >-
        #!/bin/bash


        oc patch bc $(REPOSITORIO) --patch '{"spec": {"strategy": {"sourceStrategy": {"from": {"name": "$(ImageBuild_OKD):$(TemplateVersaoProduto_OKD)"}}}}}' -n $(ProjetoBuild)
  - task: Bash@3
    displayName: Executando Build S2I Binary
    retryCountOnTaskFailure: 1
    timeoutInMinutes: 20
    inputs:
      targetType: inline
      script: >-
        #!/bin/bash

        set -x


        if echo "$(SITE)" | egrep -q "^(okd4|ocp)"

        then

        buildconfig=$(REPOSITORIO)

        else

        buildconfig=$(REPOSITORIO)-esteiras

        fi


        #Executando Build

        oc start-build $buildconfig --from-dir="$(Build.StagingDirectory)" --follow --wait=true -n $(ProjetoBuild) -v=5
  - task: Bash@3
    displayName: Executando Build S2I Binary - OKD4
    condition: and(succeeded(), eq(variables['SITE'], 'okd4_nprd'))
    enabled: False
    timeoutInMinutes: 20
    inputs:
      targetType: inline
      script: oc start-build $(REPOSITORIO) --from-dir="$(Build.StagingDirectory)" --follow --wait=true -n $(ProjetoBuild)  -v=5
  - task: Bash@3
    displayName: Criando Image Tag - Build.BuildNumber
    inputs:
      targetType: inline
      script: >-
        #!/bin/bash

        set -x


        if echo "$(SITE)" | egrep -q "^(okd4|ocp)"

        then

        buildconfig=$(REPOSITORIO)

        else

        buildconfig=$(REPOSITORIO)-esteiras

        fi


        oc tag $(ProjetoBuild)/$buildconfig:latest $(ProjetoBuild)/$buildconfig:$(Build.BuildNumber)
  - task: Bash@3
    displayName: Criando Image Tag - Build.BuildNumber - OKD4
    condition: and(succeeded(), eq(variables['SITE'], 'okd4_nprd'))
    enabled: False
    inputs:
      targetType: inline
      script: oc tag $(ProjetoBuild)/$(REPOSITORIO):latest $(ProjetoBuild)/$(REPOSITORIO):$(Build.BuildNumber)
  - task: Bash@3
    displayName: Leitura de variáveis de ambiente
    inputs:
      targetType: inline
      script: env
      noProfile: true
      noRc: true
  - task: Bash@3
    displayName: Cadastrar imagem no Infradevops
    enabled: False
    inputs:
      targetType: inline
      script: "if echo \"$(SITE)\" | egrep -q \"^okd4\"\nthen\nOPENSHIFT_API_URL=$(OKD_API_REGISTRY)\nelif echo \"$(SITE)\" | egrep -q \"^ocp\"\nthen\nOPENSHIFT_API_URL=$(OKD_API_REGISTRY)\nelif echo \"$(SITE)\" | egrep -q \"okd4_nprdz\"\nthen\nOPENSHIFT_API_URL=$(OKD_4_API)\nelse\nOPENSHIFT_API_URL=$(OKD_API)\nfi\nIMAGE_NAMESPACE=openshift\nif [  $(nome_imagem)  ]\nthen\nIMAGE_NAME=$(nome_imagem)\nelse\nIMAGE_NAME=$(ImageBuild_OKD)\nfi\nif [  $(tag_imagem)  ]\nthen\nIMAGE_TAG=$(tag_imagem)\nelse\nIMAGE_TAG=$(TemplateVersaoProduto_OKD)\nfi\necho \"IMAGE_NAME: \" $IMAGE_NAME\necho \"IMAGE_TAG: \" $IMAGE_TAG\nTOKEN=`oc whoami -t`\n# ObtÃ©m a lista de imagens \nif echo \"$(SITE)\" | egrep -q \"^(okd4|ocp)\"\nthen\nimagens=`curl -s -k -H \"Authorization: Bearer $TOKEN\" https://$OPENSHIFT_API_URL/apis/image.openshift.io/v1/namespaces/$IMAGE_NAMESPACE/imagestreams/$IMAGE_NAME`\nelse\nimagens=`curl -s -k -H \"Authorization: Bearer $TOKEN\" $OPENSHIFT_API_URL/apis/image.openshift.io/v1/namespaces/$IMAGE_NAMESPACE/imagestreams/$IMAGE_NAME`\nfi\n# Extrai os nomes da imagens \nnomes_imagens=`echo $imagens | jq -r --arg nome \"$IMAGE_TAG\" '.status.tags[] | select(.tag == $nome) | .items[].image'`\n# Exibe os nomes das imagens \nif [ ! -z \"$nomes_imagens\" ]; then\necho \"Hash da imagem no OpenShift:\" \nIMAGE_HASH=${nomes_imagens#\"$IMAGE_NAME@\"}\necho $IMAGE_HASH\nfi\n\nif [ ! -z \"$SITE\" ] && [ ! -z \"$IMAGE_HASH\" ]\nthen\nimagens=`curl -s -k -H \"Authorization: Bearer $TOKEN\" https://$OPENSHIFT_API_URL/apis/image.openshift.io/v1/images/$IMAGE_HASH`\nelse\nimagens=`curl -s -k -H \"Authorization: Bearer $TOKEN\" $OPENSHIFT_API_URL/apis/image.openshift.io/v1/images/$IMAGE_HASH`\nfi\n\nif [ ! -z \\\"$IMAGE_HASH\\\" ]; \nthen\n# Extrai os nomes das imagens\nenviroment=`echo $imagens | jq -r '.dockerImageMetadata.Config.Env'`\n\n# Remova os colchetes externos \njson_string=${enviroment:1:-1} \n# Substitua as vÃƒÂ­rgulas por quebras de linha \njson_string=`echo \"$json_string\" | tr ',' '\\n'` \n# Use awk para imprimir chave e valor sem aspas duplas, removendo espaÃƒÂ§os das chaves \njson_output=`echo \"$json_string\" | awk -F'=' '{gsub(/\"/, \"\", $1); gsub(/\"/, \"\", $2); gsub(/ /, \"\", $1); print \"\\\"\"$1\"\\\":\\\"\"$2\"\\\",\"}'`\n# Remova a vÃƒÂ­rgula extra do final \njson_output=${json_output%,} \n# Crie um objeto JSON \njson=\"{ $json_output }\" \n# Use jq para formatar a string JSON \nif [ $IMAGE_NAME = \"jboss-eap\" ];\nthen\nformatted_json=`echo \"$json\" | jq '.' | jq 'del(.\"\")' | jq 'del(.TZ)' | jq 'del(.JBOSS_PATCH_VERSION)' | jq 'del(.ADMIN_USERNAME)' | jq 'del(.ADMIN_PASSWORD)' | jq 'del(.NEXUS_URL)' | jq 'del(.JAVA_HOME)' | jq 'del(.PATH)' | jq 'del(.container)' | jq 'del(.HOME)' | jq 'del(.JBOSS_HOME)'`\nelif [ $IMAGE_NAME = \"nginx\" ];\nthen\nformatted_json=`echo \"$json\" | jq '.' | jq 'del(.\"\")' | jq 'del(.DESCRIPTION)'  | jq 'del(.PATH)'  | jq 'del(.CONTAINER)'  | jq 'del(.SUMMARY)'  | jq 'del(.SMTP)'  | jq 'del(.POP3andIMAPprotocols)'  | jq 'del(.withastrongfocusonhighconcurrency)' | jq 'del(.STI_SCRIPTS_URL)'  | jq 'del(.STI_SCRIPTS_PATH)'  | jq 'del(.APP_ROOT)'  | jq 'del(.BASH_ENV)' | jq 'del(.ENV)' | jq 'del(.PROMPT_COMMAND)' | jq 'del(.NGINX_SHORT_VER)' | jq 'del(.VERSION)' | jq 'del(.NGINX_CONFIGURATION_PATH)' | jq 'del(.NGINX_CONF_PATH)' | jq 'del(.NGINX_DEFAULT_CONF_PATH)' | jq 'del(.NGINX_CONTAINER_SCRIPTS_PATH)' | jq 'del(.NGINX_APP_ROOT)'`\nelse\nformatted_json=`echo \"$json\" | jq '.' | jq 'del(.\"\")'`\nfi\n\n# Imprima o resultado \necho \"$formatted_json\"\n\ncurl -v  --location --request PUT 'http://infradevops-novoportal-backend-des-esteiras.nprd2.caixa/api.php?acao=cadastrarImagem' \\\n--header 'Content-Type: application/json' \\\n--data \"{\n    \\\"nome\\\":\\\"$IMAGE_NAME\\\",\n    \\\"status\\\":\\\"ativo\\\",\n    \\\"detalhamento\\\":$formatted_json,\n    \\\"plataforma\\\":\\\"container\\\",\n    \\\"produto\\\":\\\"\\\",\n    \\\"versao\\\":\\\"$IMAGE_TAG\\\"\n    }\"\n\n\nelse\n\necho \"Imagem não encontrada\"\n\nfi"
      noProfile: true
      noRc: true
  - task: Bash@3
    displayName: Gera dados infradevops
    continueOnError: True
    inputs:
      targetType: inline
      script: >-
        if echo "$(SITE)" | egrep -q "^okd4"
            then
                OPENSHIFT_API_URL=$(OKD_API_REGISTRY)
            elif echo "$(SITE)" | egrep -q "^ocp"
            then
                OPENSHIFT_API_URL=$(OKD_API_REGISTRY)
            elif echo "$(SITE)" | egrep -q "okd4_nprdz"
            then
                OPENSHIFT_API_URL=$(OKD_4_API)
            else
                OPENSHIFT_API_URL=$(OKD_API)
        fi

        IMAGE_NAMESPACE=openshift

        if [  $(nome_imagem)  ]
            then
                IMAGE_NAME=$(nome_imagem)
            else
                IMAGE_NAME=$(ImageBuild_OKD)
        fi

        if [  $(tag_imagem)  ]
            then
                IMAGE_TAG=$(tag_imagem)
            else
                IMAGE_TAG=$(TemplateVersaoProduto_OKD)
        fi

        echo "IMAGE_NAME: " $IMAGE_NAME

        echo "IMAGE_TAG: " $IMAGE_TAG


        TOKEN=`oc whoami -t`

        echo "##vso[task.setvariable variable=IMAGE_NAME;]$IMAGE_NAME"

        echo "##vso[task.setvariable variable=IMAGE_TAG;]$IMAGE_TAG"

        echo "##vso[task.setvariable variable=OPENSHIFT_API_URL;]$OPENSHIFT_API_URL"

        echo "##vso[task.setvariable variable=TOKEN;]$TOKEN"

        echo "##vso[task.setvariable variable=IMAGE_NAMESPACE;]$IMAGE_NAMESPACE"
      noProfile: true
      noRc: true
  - task: Bash@3
    displayName: Cadastrar imagem no Infradevops
    continueOnError: True
    timeoutInMinutes: 1
    inputs:
      targetType: inline
      script: "# ObtÃ©m a lista de imagens \nif echo \"$(SITE)\" | egrep -q \"^(okd4|ocp)\"\n    then\n        imagens=`curl -s -k -H \"Authorization: Bearer $(TOKEN)\" https://$(OPENSHIFT_API_URL)/apis/image.openshift.io/v1/namespaces/$(IMAGE_NAMESPACE)/imagestreams/$(IMAGE_NAME)`\n    else\n        imagens=`curl -s -k -H \"Authorization: Bearer $(TOKEN)\" $(OPENSHIFT_API_URL)/apis/image.openshift.io/v1/namespaces/$(IMAGE_NAMESPACE)/imagestreams/$(IMAGE_NAME)`\nfi\n# Extrai os nomes da imagens \nnomes_imagens=`echo $imagens | jq -r --arg nome \"$(IMAGE_TAG)\" '.status.tags[] | select(.tag == $nome) | .items | sort_by(.created) | .[0].image' `\n#nomes_imagens=`echo $imagens | jq -r --arg nome \"$IMAGE_TAG\" '.status.tags[] | select(.tag == $nome) | .items[].image'`\n# Exibe os nomes das imagens\nif [ ! -z \"$nomes_imagens\" ]; then\n        echo \"Hash da imagem no OpenShift:\" \n        IMAGE_HASH=${nomes_imagens#\"$(IMAGE_NAME)@\"}\n        echo $IMAGE_HASH\n    else\n        echo \"Imagem não encontrada\"\n        return 1 2>/dev/null\n        exit 1\nfi\n\necho $IMAGE_HASH\nif [ ! -z \"$(SITE)\" ] && [ ! -z \"$IMAGE_HASH\" ]\n    then\n        imagens=`curl -s -k -H \"Authorization: Bearer $(TOKEN)\" https://$(OPENSHIFT_API_URL)/apis/image.openshift.io/v1/images/$IMAGE_HASH`\n    else\n        imagens=`curl -s -k -H \"Authorization: Bearer $(TOKEN)\" $(OPENSHIFT_API_URL)/apis/image.openshift.io/v1/images/$IMAGE_HASH`\nfi\n\nif [ ! -z \\\"$IMAGE_HASH\\\" ]; \n    then\n    # Extrai os nomes das imagens\n    enviroment=`echo $imagens | jq -r '.dockerImageMetadata.Config.Env'`\n\n    # Remova os colchetes externos \n    json_string=${enviroment:1:-1} \n    # Substitua as vÃƒÂ­rgulas por quebras de linha \n    json_string=`echo \"$json_string\" | tr ',' '\\n'` \n    # Use awk para imprimir chave e valor sem aspas duplas, removendo espaÃƒÂ§os das chaves \n    json_output=`echo \"$json_string\" | awk -F'=' '{gsub(/\"/, \"\", $1); gsub(/\"/, \"\", $2); gsub(/ /, \"\", $1); print \"\\\"\"$1\"\\\":\\\"\"$2\"\\\",\"}'`\n    # Remova a vÃƒÂ­rgula extra do final \n    json_output=${json_output%,} \n    # Crie um objeto JSON \n    json=\"{ $json_output }\" \nfi\n\n# Use jq para formatar a string JSON \nif [ $(IMAGE_NAME) = \"jboss-eap\" ];\n    then\n        formatted_json=`echo \"$json\" | jq '.' | jq '{JBOSS_VERSION: .JBOSS_VERSION, JAVA_VERSION: .JAVA_VERSION, JAVA_VENDOR: .JAVA_VENDOR, JAVA_HOME: .JAVA_HOME, MAVEN_VERSION: .MAVEN_VERSION}'`\n    elif [ $(IMAGE_NAME) = \"dotnet-runtime\" ];\n    then\n        formatted_json=`echo \"$json\" | jq '.' | jq '{DOTNET_APP_PATH: .DOTNET_APP_PATH, DOTNET_DATA_PATH: .DOTNET_DATA_PATH, DOTNET_CORE_VERSION: .DOTNET_CORE_VERSION, DOTNET_FRAMEWORK: .DOTNET_FRAMEWORK, DOTNET_SSL_CERT_DIR: .DOTNET_SSL_CERT_DIR}'`\n    elif [ $(IMAGE_NAME) = \"quarkus-java-binary-s2i\" ];\n    then\n        formatted_json=`echo \"$json\" | jq '.' | jq '{JAVA_VERSION: .JAVA_VERSION, JAVA_VENDOR: .JAVA_VENDOR, JAVA_HOME: .JAVA_HOME, LANG: .LANG}'`\n    elif [ $(IMAGE_NAME) = \"nginx\" ];\n    then\n        formatted_json=`echo \"$json\" | jq '.' | jq '{HOME: .HOME, NGINX_VERSION: .NGINX_VERSION, NGINX_LOG_PATH: .NGINX_LOG_PATH, NGINX_PERL_MODULE_PATH: .NGINX_PERL_MODULE_PATH, TZ: .TZ}'`\n    elif [ $(IMAGE_NAME) = \"spring-boot\" ];\n    then\n        formatted_json=`echo \"$json\" | jq '.' | jq '{JAVA_VERSION: .JAVA_VERSION, JAVA_VENDOR: .JAVA_VENDOR, JAVA_HOME: .JAVA_HOME, LANG: .LANG}'`\n    elif [ $(IMAGE_NAME) = \"php\" ];\n    then\n        formatted_json=`echo \"$json\" | jq '.' | jq '{PHP_VERSION: .PHP_VERSION, PHP_VER_SHORT: .PHP_VER_SHORT, APP_DATA: .APP_DATA, PHP_DEFAULT_INCLUDE_PATH: .PHP_DEFAULT_INCLUDE_PATH, PHP_SYSCONF_PATH: .PHP_SYSCONF_PATH, PHP_HTTPD_CONF_FILE: .PHP_HTTPD_CONF_FILE}'`\n    else\n        formatted_json=`echo \"$json\" | jq '.' | jq 'del(.\"\")'`\nfi\n# Imprima o resultado \necho \"Resultado JSON\"\necho \"$formatted_json\"\ncurl -v  --location --request PUT 'http://infradevops-api.apl.caixa/api.php?acao=cadastrarImagem' \\\n--header 'Content-Type: application/json' \\\n--data \"{\n    \\\"nome\\\":\\\"$(IMAGE_NAME)\\\",\n    \\\"status\\\":\\\"ativo\\\",\n    \\\"detalhamento\\\":$formatted_json,\n    \\\"plataforma\\\":\\\"container\\\",\n    \\\"produto\\\":\\\"\\\",\n    \\\"versao\\\":\\\"$(IMAGE_TAG)\\\"\n    }\""
      noProfile: true
      noRc: true
  - task: Bash@3
    displayName: Realizando Logout Cluster
    condition: always()
    inputs:
      targetType: inline
      script: oc logout
  - task: Bash@3
    displayName: Remove Binario Nexus em Caso de Falha
    condition: or(eq(variables['Agent.JobStatus'], 'Canceled'),eq(variables['Agent.JobStatus'], 'Failed'))
    inputs:
      targetType: inline
      script: >+
        set -x



        USER=$(nexus_interno_user)

        PASSWORD=$(nexus_interno_pass)


        repository=$(project.repository)

        group=$(project.group)

        name=$(project.name)

        version=$(project.version)

        uploaded=$(project.uploaded)



        if [[ ! -z "$uploaded" ]] && [ $uploaded = true ]; then


        response=`curl -X GET --user "$USER:$PASSWORD" "http://binario.caixa:8081/service/rest/v1/search?repository=$repository&group=$group&name=$name&version=$version" -H "accept: application/json"`


        echo "${response}" | jq '.items[0].assets[].id'


        jq_response=`echo "${response}" | jq '.items[0].assets[].id'`


        for row in $jq_response ; do
             temp="${row%\"}"
             temp="${temp#\"}"
             echo "$temp"
             curl -X DELETE  --user "$USER:$PASSWORD" "http://binario.caixa:8081/service/rest/v1/assets/$temp" -H "accept: application/json"
        done


        fi


...

