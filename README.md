Starting: Run Test
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
Script contents:
npm run test:coverage
========================== Starting Command Output ===========================
/bin/bash /opt/ads-agent/_work/_temp/dceb155f-c5fa-4780-bda8-2ba6b317d4b9.sh

> sifap-front-v2@1.0.0 test:coverage /opt/ads-agent/_work/127/s
> jest --coverage

/opt/ads-agent/_work/127/s/node_modules/jest-cli/build/run.js:135
    if (error?.stack) {
              ^

SyntaxError: Unexpected token .
    at Module._compile (internal/modules/cjs/loader.js:723:23)
    at Object.Module._extensions..js (internal/modules/cjs/loader.js:789:10)
    at Module.load (internal/modules/cjs/loader.js:653:32)
    at tryModuleLoad (internal/modules/cjs/loader.js:593:12)
    at Function.Module._load (internal/modules/cjs/loader.js:585:3)
    at Module.require (internal/modules/cjs/loader.js:692:17)
    at require (internal/modules/cjs/helpers.js:25:18)
    at Object.<anonymous> (/opt/ads-agent/_work/127/s/node_modules/jest-cli/build/index.js:18:12)
    at Module._compile (internal/modules/cjs/loader.js:778:30)
    at Object.Module._extensions..js (internal/modules/cjs/loader.js:789:10)
npm ERR! code ELIFECYCLE
npm ERR! errno 1
npm ERR! sifap-front-v2@1.0.0 test:coverage: `jest --coverage`
npm ERR! Exit status 1
npm ERR! 
npm ERR! Failed at the sifap-front-v2@1.0.0 test:coverage script.
npm ERR! This is probably not a problem with npm. There is likely additional logging output above.

