Bash Script

View raw log

npm verb cli   'install',
npm verb cli   '--ignore-scripts',
npm verb cli   '--no-audit',
npm verb cli   '--verbose' ]
npm info using npm@6.14.12
npm info using node@v10.24.1
npm verb npm-session 7b43a4548a460d1d
npm info lifecycle siifx-web@1.60.2-9.5~preinstall: siifx-web@1.60.2-9.5
npm WARN lifecycle siifx-web@1.60.2-9.5~preinstall: cannot run in wd siifx-web@1.60.2-9.5 npx npm-force-resolutions (wd=/opt/ads-agent/_work/115/s)
npm timing stage:loadCurrentTree Completed in 10ms
npm timing stage:loadIdealTree:cloneCurrentTree Completed in 0ms
npm timing stage:loadIdealTree:loadShrinkwrap Completed in 4ms
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/codelyzer 112ms
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fjasmine 119ms
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/jasmine-spec-reporter 124ms
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@types%2fjest 137ms
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma-coverage-istanbul-reporter 36ms
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma-firefox-launcher 41ms
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma-coverage 46ms
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma-jasmine 42ms
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@angular%2fcli 268ms
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma-jasmine-html-reporter 60ms
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@angular%2fcompiler-cli 304ms
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma-sonarqube-reporter 88ms
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma-junit-reporter 93ms
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma 332ms
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/karma-spec-reporter 148ms
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/jasmine-core 397ms
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/@angular-devkit%2fbuild-angular 440ms
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/npm-force-resolutions 84ms
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/protractor 96ms
npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/ts-node 110ms



sim ele ta roanm mais de 12,il linhas masi ta passadno

#!/bin/bash
set -e
rm -rf node_modules package-lock.json
npm cache clean --force
npm install --ignore-scripts --no-audit --verbose
npx ngcc --properties es2015 browser module main --first-only --create-ivy-entry-points
