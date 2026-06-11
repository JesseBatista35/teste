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
npm verbose logfile logs-max:10 dir:/home/sadscp01/.npm/_logs/2026-06-11T12_21_58_719Z-
; "project" config from /opt/ads-agent/_work/172/s/.npmrc

npm verbose logfile /home/sadscp01/.npm/_logs/2026-06-11T12_21_58_719Z-debug-0.log
npm verbose cwd /opt/ads-agent/_work/172/s
npm verbose os Linux 5.14.0-362.8.1.el9_3.x86_64
npm verbose node v20.18.2
npm verbose npm  v10.8.2
npm verbose exit 0
npm info ok
disturl = "http://binario.caixa:8081/repository/nodejs/"
email = (protected)
registry = "http://binario.caixa:8081/repository/npm-all/"
sass_binary_site = "http://binario.caixa:8081/repository/node-sass/"

; "env" config from environment

loglevel = "verbose"
userconfig = "/opt/ads-agent/_work/172/npm/743224.npmrc"

; node bin location = /opt/ads-agent/_work/_tool/node/20.18.2/x64/bin/node
; node version = v20.18.2


npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@msgpackr-extract%2fmsgpackr-extract-darwin-arm64 10ms (cache hit)
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@msgpackr-extract%2fmsgpackr-extract-linux-arm 9ms (cache hit)
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@msgpackr-extract%2fmsgpackr-extract-darwin-x64 10ms (cache hit)
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@msgpackr-extract%2fmsgpackr-extract-win32-x64 9ms (cache hit)
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@msgpackr-extract%2fmsgpackr-extract-linux-arm64 10ms (cache hit)
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@msgpackr-extract%2fmsgpackr-extract-linux-x64 9ms (cache hit)
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/cross-spawn 9ms (cache hit)
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@isaacs%2fcliui 10ms (cache hit)
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@pkgjs%2fparseargs 10ms (cache hit)
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/path-key 2ms (cache hit)
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/shebang-command 3ms (cache hit)
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/shebang-regex 2ms (cache hit)
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/eastasianwidth 3ms (cache hit)
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/binary-extensions 3ms (cache hit)
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/mimic-fn 5ms (cache hit)
npm verbose type version
npm verbose stack @jsonjoy.com/fs-core: No matching version found for @jsonjoy.com/fs-core@4.57.7.
npm verbose stack     at module.exports (/opt/ads-agent/_work/_tool/node/20.18.2/x64/lib/node_modules/npm/node_modules/npm-pick-manifest/lib/index.js:215:23)
npm verbose stack     at RegistryFetcher.manifest (/opt/ads-agent/_work/_tool/node/20.18.2/x64/lib/node_modules/npm/node_modules/pacote/lib/registry.js:130:54)
npm verbose stack     at async #fetchManifest (/opt/ads-agent/_work/_tool/node/20.18.2/x64/lib/node_modules/npm/node_modules/@npmcli/arborist/lib/arborist/build-ideal-tree.js:1199:20)
npm verbose stack     at async #nodeFromEdge (/opt/ads-agent/_work/_tool/node/20.18.2/x64/lib/node_modules/npm/node_modules/@npmcli/arborist/lib/arborist/build-ideal-tree.js:1037:19)
npm verbose stack     at async #buildDepStep (/opt/ads-agent/_work/_tool/node/20.18.2/x64/lib/node_modules/npm/node_modules/@npmcli/arborist/lib/arborist/build-ideal-tree.js:901:11)
npm error code ETARGET
npm error notarget No matching version found for @jsonjoy.com/fs-core@4.57.7.
npm error notarget In most cases you or one of your dependencies are requesting
npm error notarget a package version that doesn't exist.
npm verbose cwd /opt/ads-agent/_work/172/s
npm verbose os Linux 5.14.0-362.8.1.el9_3.x86_64
npm verbose node v20.18.2
npm verbose npm  v10.8.2
npm verbose exit 1
npm verbose code 1
npm error A complete log of this run can be found in: /home/sadscp01/.npm/_logs/2026-06-11T12_21_58_849Z-debug-0.log
##[warning]Couldn't find a debug log in the cache or working directory
##[error]Error: Npm failed with return code: 1
Finishing: npm install

