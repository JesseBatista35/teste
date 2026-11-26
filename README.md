2026-11-26T18:20:03.4642553Z ##[section]Starting: Build Application
2026-11-26T18:20:03.4645725Z ==============================================================================
2026-11-26T18:20:03.4645866Z Task         : Bash
2026-11-26T18:20:03.4645913Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-26T18:20:03.4645976Z Version      : 3.227.0
2026-11-26T18:20:03.4646031Z Author       : Microsoft Corporation
2026-11-26T18:20:03.4646084Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-26T18:20:03.4646155Z ==============================================================================
2026-11-26T18:20:03.6240273Z Generating script.
2026-11-26T18:20:03.6250532Z ========================== Starting Command Output ===========================
2026-11-26T18:20:03.6257286Z [command]/bin/bash /opt/ads-agent/_work/_temp/3ebca17f-dcd1-4043-acc8-5e9d24e4f594.sh
2026-11-26T18:20:03.6306849Z npm install --prefix /tmp/node24 --no-save node-linux-x64@24 && export PATH=/tmp/node24/node_modules/node-linux-x64/bin:/opt/ads-agent/_work/_tool/node/22.13.1/x64/bin:/home/sadscp01/.local/bin:/home/sadscp01/bin:/sbin:/bin:/usr/sbin:/usr/bin:/usr/local/sbin:/opt/sonar-scanner/sonar-scanner/bin:/opt/fortify/bin:/usr/local/lib/node/nodejs/bin:/usr/lib64/dotnet:/opt/apache-maven/apache-maven-3.8.5/bin:/opt/sonar-scanner/sonar-scanner/bin:/opt/fortify/bin:/usr/local/lib/node/nodejs/bin:/usr/lib64/dotnet:/opt/apache-maven/apache-maven-3.9.9/bin && node -v && npx ng run <projeto>:build-storybook --output-dir=dist && npm test
2026-11-26T18:20:03.6307578Z <----ANGULAR---->
2026-11-26T18:20:03.8518373Z Node.js version v22.13.1 detected.
2026-11-26T18:20:03.8518866Z The Angular CLI requires a minimum Node.js version of v22.22.3 or v24.15.0 or v26.0.0.
2026-11-26T18:20:03.8519166Z 
2026-11-26T18:20:03.8519614Z Please update your Node.js version or visit https://nodejs.org/ for additional instructions.
2026-11-26T18:20:03.8519778Z 
2026-11-26T18:21:23.3786954Z npm error code ETIMEDOUT
2026-11-26T18:21:23.3787563Z npm error errno ETIMEDOUT
2026-11-26T18:21:23.3788182Z npm error network request to https://registry.npmjs.org/node-linux-x64 failed, reason: 
2026-11-26T18:21:23.3788866Z npm error network This is a problem related to network connectivity.
2026-11-26T18:21:23.3789283Z npm error network In most cases you are behind a proxy or have bad network settings.
2026-11-26T18:21:23.3789422Z npm error network
2026-11-26T18:21:23.3789552Z npm error network If you are behind a proxy, please make sure that the
2026-11-26T18:21:23.3796844Z npm error network 'proxy' config is set properly.  See: 'npm help config'
2026-11-26T18:21:23.3797704Z npm error A complete log of this run can be found in: /tmp/firefox-home3/.npm/_logs/2026-11-26T18_20_03_901Z-debug-0.log
2026-11-26T18:21:23.3887372Z ##[error]Bash exited with code '1'.
2026-11-26T18:21:23.3894383Z ##[section]Finishing: Build Application
