npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@angular%2fcommon 8ms (cache hit)
npm verbose stack Error: unable to resolve dependency tree
npm verbose stack     at #failPeerConflict (/opt/ads-agent/_work/_tool/node/20.18.2/x64/lib/node_modules/npm/node_modules/@npmcli/arborist/lib/arborist/build-ideal-tree.js:1360:25)
npm verbose stack     at #loadPeerSet (/opt/ads-agent/_work/_tool/node/20.18.2/x64/lib/node_modules/npm/node_modules/@npmcli/arborist/lib/arborist/build-ideal-tree.js:1326:33)
npm verbose stack     at async #buildDepStep (/opt/ads-agent/_work/_tool/node/20.18.2/x64/lib/node_modules/npm/node_modules/@npmcli/arborist/lib/arborist/build-ideal-tree.js:901:11)
npm verbose stack     at async Arborist.buildIdealTree (/opt/ads-agent/_work/_tool/node/20.18.2/x64/lib/node_modules/npm/node_modules/@npmcli/arborist/lib/arborist/build-ideal-tree.js:181:7)
npm verbose stack     at async Promise.all (index 1)
npm verbose stack     at async Arborist.reify (/opt/ads-agent/_work/_tool/node/20.18.2/x64/lib/node_modules/npm/node_modules/@npmcli/arborist/lib/arborist/reify.js:131:5)
npm verbose stack     at async Install.exec (/opt/ads-agent/_work/_tool/node/20.18.2/x64/lib/node_modules/npm/lib/commands/install.js:150:5)
npm verbose stack     at async Npm.exec (/opt/ads-agent/_work/_tool/node/20.18.2/x64/lib/node_modules/npm/lib/npm.js:207:9)
npm verbose stack     at async module.exports (/opt/ads-agent/_work/_tool/node/20.18.2/x64/lib/node_modules/npm/lib/cli/entry.js:74:5)
npm error code ERESOLVE
npm error ERESOLVE unable to resolve dependency tree
npm error
npm error While resolving: sirta-frontend@1.0.0-snapshot
npm error Found: @angular/common@19.2.21
npm error node_modules/@angular/common
npm error   @angular/common@"19.2.21" from the root project
npm error
npm error Could not resolve dependency:
npm error peer @angular/common@"^16.2.12" from sidsc-components@16.0.0
npm error node_modules/sidsc-components
npm error   sidsc-components@"16.0.0" from the root project
npm error
npm error Fix the upstream dependency conflict, or retry
npm error this command with --force or --legacy-peer-deps
npm error to accept an incorrect (and potentially broken) dependency resolution.
npm error
npm error
npm error For a full report see:
npm error /home/sadscp01/.npm/_logs/2026-06-11T13_52_51_560Z-eresolve-report.txt
npm verbose cwd /opt/ads-agent/_work/172/s
npm verbose os Linux 5.14.0-362.8.1.el9_3.x86_64
npm verbose node v20.18.2
