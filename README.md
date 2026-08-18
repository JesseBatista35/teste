<img width="1614" height="903" alt="image" src="https://github.com/user-attachments/assets/6bbf924c-5a14-41d7-85af-eb83c6838a25" />


git. iguinore

# See http://help.github.com/ignore-files/ for more about ignoring files.

# Compiled output
/dist
/tmp
/out-tsc
/bazel-out
/junit
/coverage
/report
/reports

# Miscellaneous
/connect.lock
/libpeerconnection.log
testem.log
/typings
.*/
!.ignore

# Node
/node_modules
npm-debug.log
yarn-error.log

# IDEs and editors
.idea
.project
.classpath
*.launch
*.sublime-workspace

# Visual Studio Code
!.vscode/settings.json
!.vscode/tasks.json
!.vscode/launch.json
!.vscode/extensions.json

# System files
.DS_Store
Thumbs.db



2026-08-18T20:05:51.8005078Z ##[section]Starting: Build Application
2026-08-18T20:05:51.8009829Z ==============================================================================
2026-08-18T20:05:51.8009922Z Task         : Bash
2026-08-18T20:05:51.8010036Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-18T20:05:51.8010099Z Version      : 3.227.0
2026-08-18T20:05:51.8010145Z Author       : Microsoft Corporation
2026-08-18T20:05:51.8010233Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-18T20:05:51.8010301Z ==============================================================================
2026-08-18T20:05:51.9510555Z Generating script.
2026-08-18T20:05:51.9524210Z ========================== Starting Command Output ===========================
2026-08-18T20:05:51.9528904Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/0e91c0e4-e9cb-4aea-b479-f7f862415843.sh
2026-08-18T20:05:51.9592988Z npm run build && npm run coverage
2026-08-18T20:05:51.9593924Z <----ANGULAR---->
2026-08-18T20:05:52.7161456Z 
2026-08-18T20:05:52.7162542Z      _                      _                 ____ _     ___
2026-08-18T20:05:52.7162978Z     / \   _ __   __ _ _   _| | __ _ _ __     / ___| |   |_ _|
2026-08-18T20:05:52.7164253Z    / △ \ | '_ \ / _` | | | | |/ _` | '__|   | |   | |    | |
2026-08-18T20:05:52.7165039Z   / ___ \| | | | (_| | |_| | | (_| | |      | |___| |___ | |
2026-08-18T20:05:52.7165232Z  /_/   \_\_| |_|\__, |\__,_|_|\__,_|_|       \____|_____|___|
2026-08-18T20:05:52.7165520Z                 |___/
2026-08-18T20:05:52.7165701Z     
2026-08-18T20:05:52.7951447Z 
2026-08-18T20:05:52.7952171Z Angular CLI: 19.2.27
2026-08-18T20:05:52.7952391Z Node: 22.13.1
2026-08-18T20:05:52.7952526Z Package Manager: npm 10.9.2
2026-08-18T20:05:52.7952630Z OS: linux x64
2026-08-18T20:05:52.7952704Z 
2026-08-18T20:05:52.7952870Z Angular: 19.2.25
2026-08-18T20:05:52.7953588Z ... animations, common, compiler, compiler-cli, core, forms
2026-08-18T20:05:52.7953839Z ... platform-browser, platform-browser-dynamic, platform-server
2026-08-18T20:05:52.7954428Z ... router
2026-08-18T20:05:52.7954469Z 
2026-08-18T20:05:52.7954603Z Package                            Version
2026-08-18T20:05:52.7954835Z ------------------------------------------------------------
2026-08-18T20:05:52.7955145Z @angular-devkit/architect          0.1902.27
2026-08-18T20:05:52.7955659Z @angular-devkit/build-angular      19.2.27
2026-08-18T20:05:52.7955831Z @angular-devkit/core               19.2.27
2026-08-18T20:05:52.7956166Z @angular-devkit/schematics         19.2.27
2026-08-18T20:05:52.7956483Z @angular/build                     19.2.27
2026-08-18T20:05:52.7956694Z @angular/cdk                       19.2.19
2026-08-18T20:05:52.7956864Z @angular/cli                       19.2.27
2026-08-18T20:05:52.7957019Z @angular/material                  19.2.19
2026-08-18T20:05:52.7957324Z @angular/material-moment-adapter   19.2.19
2026-08-18T20:05:52.7957567Z @schematics/angular                19.2.27
2026-08-18T20:05:52.7957793Z rxjs                               7.8.2
2026-08-18T20:05:52.7957943Z typescript                         5.8.3
2026-08-18T20:05:52.7958194Z zone.js                            0.15.1
2026-08-18T20:05:52.7958419Z     
2026-08-18T20:05:52.8958736Z 
2026-08-18T20:05:52.8959578Z > sisam-web@1.0.0-snapshot build
2026-08-18T20:05:52.8959794Z > ng build --configuration production --aot
2026-08-18T20:05:52.8959856Z 
2026-08-18T20:05:53.7429837Z ❯ Building...
2026-08-18T20:06:05.6866924Z ✔ Building...
2026-08-18T20:06:05.6889358Z Application bundle generation failed. [11.943 seconds]
2026-08-18T20:06:05.6889865Z 
2026-08-18T20:06:05.6907964Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-18T20:06:05.6908333Z 
2026-08-18T20:06:05.6908792Z     node_modules/bootstrap/scss/_functions.scss:11:29:
2026-08-18T20:06:05.6909320Z [37m      11 │     @if $prev-num == null or [32m[37munit($num) == "%" or unit($prev-num) ...
2026-08-18T20:06:05.6909702Z          ╵                              [32m^[0m
2026-08-18T20:06:05.6910059Z 
2026-08-18T20:06:05.6910311Z 
2026-08-18T20:06:05.6910556Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-18T20:06:05.6910724Z   Use math.unit instead.
2026-08-18T20:06:05.6910817Z   
2026-08-18T20:06:05.6911045Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-18T20:06:05.6911315Z 
2026-08-18T20:06:05.6911691Z   The plugin "angular-sass" was triggered by this import
2026-08-18T20:06:05.6911792Z 
2026-08-18T20:06:05.6911977Z     angular:styles/global:styles:1:8:
2026-08-18T20:06:05.6912159Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-18T20:06:05.6912446Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-18T20:06:05.6912532Z 
2026-08-18T20:06:05.6912565Z 
2026-08-18T20:06:05.6912798Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-18T20:06:05.6912877Z 
2026-08-18T20:06:05.6913023Z     node_modules/bootstrap/scss/_functions.scss:11:50:
2026-08-18T20:06:05.6913286Z [37m      11 │ ...$prev-num == null or unit($num) == "%" or [32m[37munit($prev-num) == "%" {
2026-08-18T20:06:05.6913527Z          ╵                                              [32m^[0m
2026-08-18T20:06:05.6913576Z 
2026-08-18T20:06:05.6913610Z 
2026-08-18T20:06:05.6913836Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-18T20:06:05.6914008Z   Use math.unit instead.
2026-08-18T20:06:05.6914150Z   
2026-08-18T20:06:05.6914325Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-18T20:06:05.6914446Z 
2026-08-18T20:06:05.6914639Z   The plugin "angular-sass" was triggered by this import
2026-08-18T20:06:05.6914700Z 
2026-08-18T20:06:05.6914842Z     angular:styles/global:styles:1:8:
2026-08-18T20:06:05.6915052Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-18T20:06:05.6915215Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-18T20:06:05.6915307Z 
2026-08-18T20:06:05.6915437Z 
2026-08-18T20:06:05.6915714Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-18T20:06:05.6915791Z 
2026-08-18T20:06:05.6915971Z     node_modules/bootstrap/scss/_functions.scss:37:10:
2026-08-18T20:06:05.6917901Z [37m      37 │   @return [32m[37mred($value), green($value), blue($value);
2026-08-18T20:06:05.6918220Z          ╵           [32m^[0m
2026-08-18T20:06:05.6918266Z 
2026-08-18T20:06:05.6918299Z 
2026-08-18T20:06:05.6918429Z   red() is deprecated. Suggestion:
2026-08-18T20:06:05.6918559Z   
2026-08-18T20:06:05.6918697Z   color.channel($color, "red", $space: rgb)
2026-08-18T20:06:05.6918832Z   
2026-08-18T20:06:05.6918994Z   More info: [4mhttps://sass-lang.com/d/color-functions[0m
2026-08-18T20:06:05.6919091Z 
2026-08-18T20:06:05.6919318Z   The plugin "angular-sass" was triggered by this import
2026-08-18T20:06:05.6919377Z 
2026-08-18T20:06:05.6919516Z     angular:styles/global:styles:1:8:
2026-08-18T20:06:05.6919737Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-18T20:06:05.6919914Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-18T20:06:05.6919998Z 
2026-08-18T20:06:05.6920030Z 
2026-08-18T20:06:05.6920257Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-18T20:06:05.6920333Z 
2026-08-18T20:06:05.6920480Z     node_modules/bootstrap/scss/_functions.scss:37:23:
2026-08-18T20:06:05.6920712Z [37m      37 │   @return red($value), [32m[37mgreen($value), blue($value);
2026-08-18T20:06:05.6921021Z          ╵                        [32m^[0m
2026-08-18T20:06:05.6921069Z 
2026-08-18T20:06:05.6921100Z 
2026-08-18T20:06:05.6921232Z   green() is deprecated. Suggestion:
2026-08-18T20:06:05.6921387Z   
2026-08-18T20:06:05.6921526Z   color.channel($color, "green", $space: rgb)
2026-08-18T20:06:05.6921662Z   
2026-08-18T20:06:05.6921821Z   More info: [4mhttps://sass-lang.com/d/color-functions[0m
2026-08-18T20:06:05.6921917Z 
2026-08-18T20:06:05.6922108Z   The plugin "angular-sass" was triggered by this import
2026-08-18T20:06:05.6922271Z 
2026-08-18T20:06:05.6922412Z     angular:styles/global:styles:1:8:
2026-08-18T20:06:05.6922829Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-18T20:06:05.6922996Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-18T20:06:05.6923081Z 
2026-08-18T20:06:05.6923113Z 
2026-08-18T20:06:05.6923336Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-18T20:06:05.6923408Z 
2026-08-18T20:06:05.6923551Z     node_modules/bootstrap/scss/_functions.scss:185:9:
2026-08-18T20:06:05.6923806Z [37m      185 │     "r": [32m[37mred($color),
2026-08-18T20:06:05.6924037Z           ╵          [32m^[0m
2026-08-18T20:06:05.6924089Z 
2026-08-18T20:06:05.6924122Z 
2026-08-18T20:06:05.6924284Z   red() is deprecated. Suggestion:
2026-08-18T20:06:05.6924413Z   
2026-08-18T20:06:05.6924565Z   color.channel($color, "red", $space: rgb)
2026-08-18T20:06:05.6924700Z   
2026-08-18T20:06:05.6924875Z   More info: [4mhttps://sass-lang.com/d/color-functions[0m
2026-08-18T20:06:05.6924977Z 
2026-08-18T20:06:05.6925134Z   The plugin "angular-sass" was triggered by this import
2026-08-18T20:06:05.6925229Z 
2026-08-18T20:06:05.6925366Z     angular:styles/global:styles:1:8:
2026-08-18T20:06:05.6925544Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-18T20:06:05.6925737Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-18T20:06:05.6925834Z 
2026-08-18T20:06:05.6925866Z 
2026-08-18T20:06:05.6926099Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-18T20:06:05.6926171Z 
2026-08-18T20:06:05.6926316Z     node_modules/bootstrap/scss/_functions.scss:186:9:
2026-08-18T20:06:05.6926658Z [37m      186 │     "g": [32m[37mgreen($color),
2026-08-18T20:06:05.6926842Z           ╵          [32m^[0m
2026-08-18T20:06:05.6926887Z 
2026-08-18T20:06:05.6926918Z 
2026-08-18T20:06:05.6927050Z   green() is deprecated. Suggestion:
2026-08-18T20:06:05.6927243Z   
2026-08-18T20:06:05.6927383Z   color.channel($color, "green", $space: rgb)
2026-08-18T20:06:05.6927481Z   
2026-08-18T20:06:05.6927708Z   More info: [4mhttps://sass-lang.com/d/color-functions[0m
2026-08-18T20:06:05.6927802Z 
2026-08-18T20:06:05.6927959Z   The plugin "angular-sass" was triggered by this import
2026-08-18T20:06:05.6928050Z 
2026-08-18T20:06:05.6928188Z     angular:styles/global:styles:1:8:
2026-08-18T20:06:05.6928364Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-18T20:06:05.6928565Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-18T20:06:05.6928650Z 
2026-08-18T20:06:05.6928682Z 
2026-08-18T20:06:05.6928904Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-18T20:06:05.6928978Z 
2026-08-18T20:06:05.6929122Z     node_modules/bootstrap/scss/_functions.scss:187:9:
2026-08-18T20:06:05.6929355Z [37m      187 │     "b": [32m[37mblue($color)
2026-08-18T20:06:05.6929502Z           ╵          [32m^[0m
2026-08-18T20:06:05.6929589Z 
2026-08-18T20:06:05.6929622Z 
2026-08-18T20:06:05.6929753Z   blue() is deprecated. Suggestion:
2026-08-18T20:06:05.6929882Z   
2026-08-18T20:06:05.6929984Z   color.channel($color, "blue", $space: rgb)
2026-08-18T20:06:05.6930115Z   
2026-08-18T20:06:05.6930356Z   More info: [4mhttps://sass-lang.com/d/color-functions[0m
2026-08-18T20:06:05.6930414Z 
2026-08-18T20:06:05.6930602Z   The plugin "angular-sass" was triggered by this import
2026-08-18T20:06:05.6930706Z 
2026-08-18T20:06:05.6930810Z     angular:styles/global:styles:1:8:
2026-08-18T20:06:05.6931036Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-18T20:06:05.6931234Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-18T20:06:05.6931283Z 
2026-08-18T20:06:05.6931350Z 
2026-08-18T20:06:05.6931578Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-18T20:06:05.6931650Z 
2026-08-18T20:06:05.6931793Z     node_modules/bootstrap/scss/_functions.scss:207:10:
2026-08-18T20:06:05.6932073Z [37m      207 │   @return [32m[37mmix(white, $color, $weight);
2026-08-18T20:06:05.6932225Z           ╵           [32m^[0m
2026-08-18T20:06:05.6932312Z 
2026-08-18T20:06:05.6932345Z 
2026-08-18T20:06:05.6932553Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-18T20:06:05.6932726Z   Use color.mix instead.
2026-08-18T20:06:05.6932815Z   
2026-08-18T20:06:05.6933022Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-18T20:06:05.6933120Z 
2026-08-18T20:06:05.6933272Z   The plugin "angular-sass" was triggered by this import
2026-08-18T20:06:05.6933363Z 
2026-08-18T20:06:05.6933496Z     angular:styles/global:styles:1:8:
2026-08-18T20:06:05.6933668Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-18T20:06:05.6933861Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-18T20:06:05.6933952Z 
2026-08-18T20:06:05.6933984Z 
2026-08-18T20:06:05.6934204Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-18T20:06:05.6934285Z 
2026-08-18T20:06:05.6934444Z     node_modules/bootstrap/scss/_functions.scss:212:10:
2026-08-18T20:06:05.6934664Z [37m      212 │   @return [32m[37mmix(black, $color, $weight);
2026-08-18T20:06:05.6934850Z           ╵           [32m^[0m
2026-08-18T20:06:05.6934894Z 
2026-08-18T20:06:05.6934927Z 
2026-08-18T20:06:05.6935134Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-18T20:06:05.6935295Z   Use color.mix instead.
2026-08-18T20:06:05.6935431Z   
2026-08-18T20:06:05.6935605Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-18T20:06:05.6935703Z 
2026-08-18T20:06:05.6935888Z   The plugin "angular-sass" was triggered by this import
2026-08-18T20:06:05.6935947Z 
2026-08-18T20:06:05.6936096Z     angular:styles/global:styles:1:8:
2026-08-18T20:06:05.6936301Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-18T20:06:05.6936580Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-18T20:06:05.6936720Z 
2026-08-18T20:06:05.6936752Z 
2026-08-18T20:06:05.6937048Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-18T20:06:05.6937121Z 
2026-08-18T20:06:05.6937279Z     node_modules/bootstrap/scss/_variables.scss:342:26:
2026-08-18T20:06:05.6937519Z [37m      342 │ $light-bg-subtle:         [32m[37mmix($gray-100, $white) !default;
2026-08-18T20:06:05.6937720Z           ╵                           [32m^[0m
2026-08-18T20:06:05.6937765Z 
2026-08-18T20:06:05.6937797Z 
2026-08-18T20:06:05.6938005Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-18T20:06:05.6938183Z   Use color.mix instead.
2026-08-18T20:06:05.6938312Z   
2026-08-18T20:06:05.6938520Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-18T20:06:05.6938585Z 
2026-08-18T20:06:05.6938773Z   The plugin "angular-sass" was triggered by this import
2026-08-18T20:06:05.6938837Z 
2026-08-18T20:06:05.6938988Z     angular:styles/global:styles:1:8:
2026-08-18T20:06:05.6939194Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-18T20:06:05.6939387Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-18T20:06:05.6939434Z 
2026-08-18T20:06:05.6939466Z 
2026-08-18T20:06:05.6939688Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-18T20:06:05.6939761Z 
2026-08-18T20:06:05.6939919Z     node_modules/bootstrap/scss/bootstrap.scss:1:8:
2026-08-18T20:06:05.6940125Z [37m      1 │ @import [32m[37m"mixins/banner";
2026-08-18T20:06:05.6940300Z         ╵         [32m^[0m
2026-08-18T20:06:05.6940344Z 
2026-08-18T20:06:05.6940376Z 
2026-08-18T20:06:05.6940536Z   Sass @import rules are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-18T20:06:05.6940678Z   
2026-08-18T20:06:05.6940884Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-18T20:06:05.6940948Z 
2026-08-18T20:06:05.6941138Z   The plugin "angular-sass" was triggered by this import
2026-08-18T20:06:05.6941238Z 
2026-08-18T20:06:05.6941375Z     angular:styles/global:styles:1:8:
2026-08-18T20:06:05.6941597Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-18T20:06:05.6941806Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-18T20:06:05.6941869Z 
2026-08-18T20:06:05.6941909Z 
2026-08-18T20:06:05.6942252Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-18T20:06:05.6942415Z 
2026-08-18T20:06:05.6942591Z     node_modules/bootstrap/scss/bootstrap.scss:7:8:
2026-08-18T20:06:05.6942896Z [37m      7 │ @import [32m[37m"functions";
2026-08-18T20:06:05.6943144Z         ╵         [32m^[0m
2026-08-18T20:06:05.6943205Z 
2026-08-18T20:06:05.6943294Z 
2026-08-18T20:06:05.6943503Z   Sass @import rules are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-18T20:06:05.6943678Z   
2026-08-18T20:06:05.6943937Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-18T20:06:05.6944048Z 
2026-08-18T20:06:05.6944204Z   The plugin "angular-sass" was triggered by this import
2026-08-18T20:06:05.6944392Z 
2026-08-18T20:06:05.6944495Z     angular:styles/global:styles:1:8:
2026-08-18T20:06:05.6944707Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-18T20:06:05.6944904Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-18T20:06:05.6944954Z 
2026-08-18T20:06:05.6945021Z 
2026-08-18T20:06:05.6945247Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-18T20:06:05.6945321Z 
2026-08-18T20:06:05.6945530Z     node_modules/sidsc-components/styles/material-icons/_core.scss:4:10:
2026-08-18T20:06:05.6945782Z [37m      4 │   $index: [32m[37mstr-index($string, $search);
2026-08-18T20:06:05.6945934Z         ╵           [32m^[0m
2026-08-18T20:06:05.6946024Z 
2026-08-18T20:06:05.6946057Z 
2026-08-18T20:06:05.6946266Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-18T20:06:05.6946571Z   Use string.index instead.
2026-08-18T20:06:05.6946700Z   
2026-08-18T20:06:05.6946880Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-18T20:06:05.6946981Z 
2026-08-18T20:06:05.6947136Z   The plugin "angular-sass" was triggered by this import
2026-08-18T20:06:05.6947233Z 
2026-08-18T20:06:05.6947368Z     angular:styles/global:styles:2:8:
2026-08-18T20:06:05.6947563Z [37m      2 │ @import [32m'./node_modules/sidsc-components/styles/main.scss'[37m;
2026-08-18T20:06:05.6947836Z         ╵         [32m~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~[0m
2026-08-18T20:06:05.6947936Z 
2026-08-18T20:06:05.6947969Z 
2026-08-18T20:06:05.6948191Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-18T20:06:05.6948265Z 
2026-08-18T20:06:05.6948470Z     node_modules/sidsc-components/styles/material-icons/_core.scss:6:12:
2026-08-18T20:06:05.6948713Z [37m      6 │     @return [32m[37mstr-slice($string, 1, $index - 1) + $replace +
2026-08-18T20:06:05.6948913Z         ╵             [32m^[0m
2026-08-18T20:06:05.6948956Z 
2026-08-18T20:06:05.6948987Z 
2026-08-18T20:06:05.6949196Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-18T20:06:05.6949359Z   Use string.slice instead.
2026-08-18T20:06:05.6949511Z   
2026-08-18T20:06:05.6949717Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-18T20:06:05.6949781Z 
2026-08-18T20:06:05.6949967Z   The plugin "angular-sass" was triggered by this import
2026-08-18T20:06:05.6950026Z 
2026-08-18T20:06:05.6950161Z     angular:styles/global:styles:2:8:
2026-08-18T20:06:05.6950390Z [37m      2 │ @import [32m'./node_modules/sidsc-components/styles/main.scss'[37m;
2026-08-18T20:06:05.6950623Z         ╵         [32m~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~[0m
2026-08-18T20:06:05.6950686Z 
2026-08-18T20:06:05.6950719Z 
2026-08-18T20:06:05.6950940Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-18T20:06:05.6951081Z 
2026-08-18T20:06:05.6951323Z     node_modules/sidsc-components/styles/material-icons/_core.scss:8:8:
2026-08-18T20:06:05.6951580Z [37m      8 │         [32m[37mstr-slice($string, $index + str-length($search)),
2026-08-18T20:06:05.6951812Z         ╵         [32m^[0m
2026-08-18T20:06:05.6951854Z 
2026-08-18T20:06:05.6951922Z 
2026-08-18T20:06:05.6952100Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-18T20:06:05.6952261Z   Use string.slice instead.
2026-08-18T20:06:05.6952387Z   
2026-08-18T20:06:05.6952595Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-18T20:06:05.6952659Z 
2026-08-18T20:06:05.6952864Z   The plugin "angular-sass" was triggered by this import
2026-08-18T20:06:05.6952921Z 
2026-08-18T20:06:05.6953061Z     angular:styles/global:styles:2:8:
2026-08-18T20:06:05.6953315Z [37m      2 │ @import [32m'./node_modules/sidsc-components/styles/main.scss'[37m;
2026-08-18T20:06:05.6953563Z         ╵         [32m~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~[0m
2026-08-18T20:06:05.6953626Z 
2026-08-18T20:06:05.6953658Z 
2026-08-18T20:06:05.6953890Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-18T20:06:05.6953995Z 
2026-08-18T20:06:05.6954169Z     node_modules/sidsc-components/styles/material-icons/_core.scss:8:36:
2026-08-18T20:06:05.6954410Z [37m      8 │         str-slice($string, $index + [32m[37mstr-length($search)),
2026-08-18T20:06:05.6954615Z         ╵                                     [32m^[0m
2026-08-18T20:06:05.6954659Z 
2026-08-18T20:06:05.6954735Z 
2026-08-18T20:06:05.6954942Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-18T20:06:05.6955069Z   Use string.length instead.
2026-08-18T20:06:05.6955216Z   
2026-08-18T20:06:05.6955425Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-18T20:06:05.6955536Z 
2026-08-18T20:06:05.6955726Z   The plugin "angular-sass" was triggered by this import
2026-08-18T20:06:05.6955818Z 
2026-08-18T20:06:05.6955919Z     angular:styles/global:styles:2:8:
2026-08-18T20:06:05.6956617Z [37m      2 │ @import [32m'./node_modules/sidsc-components/styles/main.scss'[37m;
2026-08-18T20:06:05.6956934Z         ╵         [32m~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~[0m
2026-08-18T20:06:05.6956997Z 
2026-08-18T20:06:05.6957066Z 
2026-08-18T20:06:05.6957254Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-18T20:06:05.6957369Z 
2026-08-18T20:06:05.6957608Z     node_modules/sidsc-components/styles/material-icons/_core.scss:17:15:
2026-08-18T20:06:05.6957810Z [37m      17 │   $class-name: [32m[37mto-lower-case($font-family);
2026-08-18T20:06:05.6958003Z          ╵                [32m^[0m
2026-08-18T20:06:05.6958080Z 
2026-08-18T20:06:05.6958113Z 
2026-08-18T20:06:05.6958319Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-18T20:06:05.6958540Z   Use string.to-lower-case instead.
2026-08-18T20:06:05.6958637Z   
2026-08-18T20:06:05.6958840Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-18T20:06:05.6958938Z 
2026-08-18T20:06:05.6959092Z   The plugin "angular-sass" was triggered by this import
2026-08-18T20:06:05.6959184Z 
2026-08-18T20:06:05.6959380Z     angular:styles/global:styles:2:8:
2026-08-18T20:06:05.6959584Z [37m      2 │ @import [32m'./node_modules/sidsc-components/styles/main.scss'[37m;
2026-08-18T20:06:05.6959822Z         ╵         [32m~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~[0m
2026-08-18T20:06:05.6959914Z 
2026-08-18T20:06:05.6959947Z 
2026-08-18T20:06:05.6960171Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-18T20:06:05.6960242Z 
2026-08-18T20:06:05.6960379Z     src/styles.scss:5:8:
2026-08-18T20:06:05.6960599Z [37m      5 │ @import [32m[37m"../node_modules/bootstrap/scss/bootstrap.scss";
2026-08-18T20:06:05.6960853Z         ╵         [32m^[0m
2026-08-18T20:06:05.6960896Z 
2026-08-18T20:06:05.6960928Z 
2026-08-18T20:06:05.6961075Z   Sass @import rules are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-18T20:06:05.6961239Z   
2026-08-18T20:06:05.6961450Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-18T20:06:05.6961514Z 
2026-08-18T20:06:05.6961696Z   The plugin "angular-sass" was triggered by this import
2026-08-18T20:06:05.6961753Z 
2026-08-18T20:06:05.6961915Z     angular:styles/global:styles:1:8:
2026-08-18T20:06:05.6962117Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-18T20:06:05.6962311Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-18T20:06:05.6962361Z 
2026-08-18T20:06:05.6962393Z 
2026-08-18T20:06:05.6962617Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-18T20:06:05.6962687Z 
2026-08-18T20:06:05.6962825Z     src/styles.scss:8:8:
2026-08-18T20:06:05.6963049Z [37m      8 │ @import [32m[37m"../public/fonts/fonts.scss";
2026-08-18T20:06:05.6963230Z         ╵         [32m^[0m
2026-08-18T20:06:05.6963270Z 
2026-08-18T20:06:05.6963303Z 
2026-08-18T20:06:05.6963462Z   Sass @import rules are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-18T20:06:05.6963604Z   
2026-08-18T20:06:05.6963807Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-18T20:06:05.6963871Z 
2026-08-18T20:06:05.6964059Z   The plugin "angular-sass" was triggered by this import
2026-08-18T20:06:05.6964116Z 
2026-08-18T20:06:05.6964316Z     angular:styles/global:styles:1:8:
2026-08-18T20:06:05.6964543Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-18T20:06:05.6964762Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-18T20:06:05.6964811Z 
2026-08-18T20:06:05.6964842Z 
2026-08-18T20:06:05.6965063Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-18T20:06:05.6965226Z 
2026-08-18T20:06:05.6965321Z     src/styles.scss:9:8:
2026-08-18T20:06:05.6965530Z [37m      9 │ @import [32m[37m"../public/fonts/fonts-icons.scss";
2026-08-18T20:06:05.6965712Z         ╵         [32m^[0m
2026-08-18T20:06:05.6965752Z 
2026-08-18T20:06:05.6965817Z 
2026-08-18T20:06:05.6966007Z   Sass @import rules are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-18T20:06:05.6966115Z   
2026-08-18T20:06:05.6966323Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-18T20:06:05.6966501Z 
2026-08-18T20:06:05.6966661Z   The plugin "angular-sass" was triggered by this import
2026-08-18T20:06:05.6966764Z 
2026-08-18T20:06:05.6966867Z     angular:styles/global:styles:1:8:
2026-08-18T20:06:05.6967078Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-18T20:06:05.6967276Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-18T20:06:05.6967324Z 
2026-08-18T20:06:05.6967391Z 
2026-08-18T20:06:05.6967713Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1m235 repetitive deprecation warnings omitted.
2026-08-18T20:06:05.6967934Z Run in verbose mode to see all warnings.[0m [1m[35m[plugin angular-sass][0m
2026-08-18T20:06:05.6968040Z 
2026-08-18T20:06:05.6968174Z     angular:styles/global:styles:1:8:
2026-08-18T20:06:05.6968349Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-18T20:06:05.6968562Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-18T20:06:05.6968646Z 
2026-08-18T20:06:05.6968726Z   null
2026-08-18T20:06:05.6968798Z 
2026-08-18T20:06:05.6968830Z 
2026-08-18T20:06:05.6969145Z [31m✘ [41;31m[[41;97mERROR[41;31m][0m [1mCould not resolve "inputmask/dist/inputmask.es6.js"[0m
2026-08-18T20:06:05.6969222Z 
2026-08-18T20:06:05.6969452Z     node_modules/sidsc-components/fesm2022/sidsc-components-dsc-datepicker.mjs:23:22:
2026-08-18T20:06:05.6969712Z [37m      23 │ import Inputmask from [32m'inputmask/dist/inputmask.es6.js'[37m;
2026-08-18T20:06:05.6969942Z          ╵                       [32m~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~[0m
2026-08-18T20:06:05.6970050Z 
2026-08-18T20:06:05.6970198Z   The module "./dist/inputmask.es6.js" was not found on the file system:
2026-08-18T20:06:05.6970263Z 
2026-08-18T20:06:05.6970421Z     node_modules/inputmask/package.json:12:16:
2026-08-18T20:06:05.6970630Z [37m      12 │     "./dist/*": [32m"./dist/*"[37m,
2026-08-18T20:06:05.6970834Z          ╵                 [32m~~~~~~~~~~[0m
2026-08-18T20:06:05.6970882Z 
2026-08-18T20:06:05.6971071Z   You can mark the path "inputmask/dist/inputmask.es6.js" as external to exclude it from the bundle, which will remove this error and leave the unresolved path in the bundle.
2026-08-18T20:06:05.6971173Z 
2026-08-18T20:06:05.6971236Z 
2026-08-18T20:06:05.6971510Z [31m✘ [41;31m[[41;97mERROR[41;31m][0m [1mCannot destructure property 'pos' of 'file.referencedFiles[index]' as it is undefined.[0m [1m[35m[plugin angular-compiler][0m
2026-08-18T20:06:05.6971657Z 
2026-08-18T20:06:05.6971801Z     node_modules/typescript/lib/typescript.js:125702:9:
2026-08-18T20:06:05.6972015Z [37m      125702 │       ({ [32m[37mpos, end } = file.referencedFiles[index]);
2026-08-18T20:06:05.6972213Z              ╵          [32m^[0m
2026-08-18T20:06:05.6972308Z 
2026-08-18T20:06:05.6972526Z     at getReferencedFileLocation (/opt/ads-agent/_work/91/s/node_modules/typescript/lib/typescript.js:125702:10)
2026-08-18T20:06:05.6972834Z     at fileIncludeReasonToDiagnostics (/opt/ads-agent/_work/91/s/node_modules/typescript/lib/typescript.js:132571:31)
2026-08-18T20:06:05.6973139Z     at processReason (/opt/ads-agent/_work/91/s/node_modules/typescript/lib/typescript.js:129136:62)
2026-08-18T20:06:05.6973316Z     at Array.forEach (<anonymous>)
2026-08-18T20:06:05.6973630Z     at createDiagnosticExplainingFile (/opt/ads-agent/_work/91/s/node_modules/typescript/lib/typescript.js:129088:42)
2026-08-18T20:06:05.6973908Z     at /opt/ads-agent/_work/91/s/node_modules/typescript/lib/typescript.js:129021:15
2026-08-18T20:06:05.6974116Z     at Array.forEach (<anonymous>)
2026-08-18T20:06:05.6974348Z     at Object.getCombinedDiagnostics (/opt/ads-agent/_work/91/s/node_modules/typescript/lib/typescript.js:129017:78)
2026-08-18T20:06:05.6974646Z     at getProgramDiagnostics (/opt/ads-agent/_work/91/s/node_modules/typescript/lib/typescript.js:126966:57)
2026-08-18T20:06:05.6974966Z     at getSemanticDiagnosticsForFile (/opt/ads-agent/_work/91/s/node_modules/typescript/lib/typescript.js:126997:7)
2026-08-18T20:06:05.6975100Z 
2026-08-18T20:06:05.6975213Z   This error came from the "onStart" callback registered here:
2026-08-18T20:06:05.6975307Z 
2026-08-18T20:06:05.6975528Z     node_modules/@angular/build/src/tools/esbuild/angular/compiler-plugin.js:118:18:
2026-08-18T20:06:05.6975733Z [37m      118 │             build.[32monStart[37m(async () => {
2026-08-18T20:06:05.6975928Z           ╵                   [32m~~~~~~~[0m
2026-08-18T20:06:05.6976014Z 
2026-08-18T20:06:05.6976233Z     at setup (/opt/ads-agent/_work/91/s/node_modules/@angular/build/src/tools/esbuild/angular/compiler-plugin.js:118:19)
2026-08-18T20:06:05.6976596Z     at async handlePlugins (/opt/ads-agent/_work/91/s/node_modules/esbuild/lib/main.js:1466:20)
2026-08-18T20:06:05.6976710Z 
2026-08-18T20:06:05.6976742Z 
2026-08-18T20:06:05.8677679Z ##[error]Bash exited with code '1'.
2026-08-18T20:06:05.8688769Z ##[section]Finishing: Build Application



