Starting: SAST: Análise Default [Assíncrona]
==============================================================================
Task         : Fortify ScanCentral SAST Assessment
Description  : Installs ScanCentral client and performs a static analysis using ScanCentral
Version      : 7.5.0
Author       : Micro Focus
Help         : 
==============================================================================
ScanCentral Controller URL: http://sast.caixa/scancentral-ctrl
Caching tool: scancentral 24.4.0 x64
Prepending PATH environment variable with directory: /opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/bin
Setting scancentral home
Skipping scan central home as it is self-hosted
Working Directory: /opt/ads-agent/_work/156/s
Automatically detect build tool option selected.
/opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/bin/scancentral -url http://sast.caixa/scancentral-ctrl start --upload-to-ssc --ssc-upload-token *** --application SIFAP-front-v2 --application-version 1.0.9 --translation-args -Dcom.fortify.sca.exclude.unimported.node.modules=true --translation-args -Dcom.fortify.sca.EnableDOMModeling=true --translation-args -Dcom.fortify.sca.fileextensions.inc=PHP --translation-args -Dcom.fortify.sca.rules.password_regex.global=(?i)(s|_)?(user|usr|member|admin|guest|login|default|new|current|old|client|server|proxy|sqlserver|my|mysql|mongo|mongodb|db|database|ldap|smtp|email|email(_)?smtp)?(_|\.)?(pass(wd|word|phrase)|secret|senha) -exclude ./**/node_modules/**/* -exclude ./**/*.min.js -exclude ./**/dist/**/* --scan-args -build-label 1.0.9.18 --scan-args -build-version 1.0.9.18-1.0.9.18 -pool 1e7ef04b-9953-44f3-80bf-dcc6a430a58c
launcher.log will be stored in "/home/sadscp01/.fortify/scancentral-24.4.0/log" directory.
Checking for updates...
No update available or auto update is disabled on the controller.
scancentral.log will be stored in "/home/sadscp01/.fortify/scancentral-24.4.0/log" directory.
ScanCentral runs in remote translation mode with auto build tool detection.
To run MBS scan specify -b (--build-id) or -mbs with -scan option,
-p (--package) for remote translation of specific package,
-bt (--build-tool) and/or -bf (--build-file) to configure remote translation build integration.
Verifying controller URL...
The Controller at http://sast.caixa/scancentral-ctrl is UP
No email address detected. No status emails will be sent for this job.
Gathering project information...
No build tool or build file is specified. Run auto build tool detection.
Run packaging without build tool integration.
Executing 'npm ci' at '/opt/ads-agent/_work/156/s' to restore dependencies...
npm warn EBADENGINE Unsupported engine {
npm warn EBADENGINE   package: 'eslint-visitor-keys@5.0.1',
npm warn EBADENGINE   required: { node: '^20.19.0 || ^22.13.0 || >=24' },
npm warn EBADENGINE   current: { node: 'v20.18.2', npm: '10.8.2' }
npm warn EBADENGINE }
npm warn deprecated inflight@1.0.6: This module is not supported, and leaks memory. Do not use it. Check out lru-cache if you want a good and tested way to coalesce async requests by a key value, which is much more comprehensive and powerful.
npm warn deprecated @humanwhocodes/config-array@0.13.0: Use @eslint/config-array instead
npm warn deprecated rimraf@3.0.2: Rimraf versions prior to v4 are no longer supported
npm warn deprecated abab@2.0.6: Use your platform's native atob() and btoa() methods instead
