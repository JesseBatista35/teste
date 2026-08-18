2026-08-18T19:41:29.3512578Z ##[section]Starting: Build Application
2026-08-18T19:41:29.3515837Z ==============================================================================
2026-08-18T19:41:29.3515925Z Task         : Bash
2026-08-18T19:41:29.3515970Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-18T19:41:29.3516030Z Version      : 3.227.0
2026-08-18T19:41:29.3516083Z Author       : Microsoft Corporation
2026-08-18T19:41:29.3516134Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-18T19:41:29.3516206Z ==============================================================================
2026-08-18T19:41:29.4891956Z Generating script.
2026-08-18T19:41:29.4904120Z ========================== Starting Command Output ===========================
2026-08-18T19:41:29.4910551Z [command]/bin/bash /opt/ads-agent/_work/_temp/00c4b605-eed2-42fe-857b-b1927e563f7c.sh
2026-08-18T19:41:29.4961983Z npm run build && npm run coverage
2026-08-18T19:41:29.4962499Z <----ANGULAR---->
2026-08-18T19:41:30.3491269Z 
2026-08-18T19:41:30.3491945Z      _                      _                 ____ _     ___
2026-08-18T19:41:30.3492110Z     / \   _ __   __ _ _   _| | __ _ _ __     / ___| |   |_ _|
2026-08-18T19:41:30.3492529Z    / △ \ | '_ \ / _` | | | | |/ _` | '__|   | |   | |    | |
2026-08-18T19:41:30.3492638Z   / ___ \| | | | (_| | |_| | | (_| | |      | |___| |___ | |
2026-08-18T19:41:30.3492755Z  /_/   \_\_| |_|\__, |\__,_|_|\__,_|_|       \____|_____|___|
2026-08-18T19:41:30.3492886Z                 |___/
2026-08-18T19:41:30.3492974Z     
2026-08-18T19:41:30.4301279Z 
2026-08-18T19:41:30.4301688Z Angular CLI: 19.2.23
2026-08-18T19:41:30.4301835Z Node: 22.13.1
2026-08-18T19:41:30.4302271Z Package Manager: npm 10.9.2
2026-08-18T19:41:30.4302445Z OS: linux x64
2026-08-18T19:41:30.4302486Z 
2026-08-18T19:41:30.4302601Z Angular: 19.2.20
2026-08-18T19:41:30.4302983Z ... animations, common, compiler, compiler-cli, core, forms
2026-08-18T19:41:30.4303194Z ... platform-browser, platform-browser-dynamic, platform-server
2026-08-18T19:41:30.4303331Z ... router
2026-08-18T19:41:30.4303370Z 
2026-08-18T19:41:30.4303465Z Package                            Version
2026-08-18T19:41:30.4303644Z ------------------------------------------------------------
2026-08-18T19:41:30.4303829Z @angular-devkit/architect          0.1902.23
2026-08-18T19:41:30.4303999Z @angular-devkit/build-angular      19.2.23
2026-08-18T19:41:30.4304208Z @angular-devkit/core               19.2.23
2026-08-18T19:41:30.4304448Z @angular-devkit/schematics         19.2.23
2026-08-18T19:41:30.4304626Z @angular/build                     19.2.23
2026-08-18T19:41:30.4304762Z @angular/cdk                       19.2.19
2026-08-18T19:41:30.4304908Z @angular/cli                       19.2.23
2026-08-18T19:41:30.4305019Z @angular/material                  19.2.19
2026-08-18T19:41:30.4305191Z @angular/material-moment-adapter   19.2.19
2026-08-18T19:41:30.4305360Z @schematics/angular                19.2.23
2026-08-18T19:41:30.4305460Z rxjs                               7.8.2
2026-08-18T19:41:30.4305602Z typescript                         5.8.3
2026-08-18T19:41:30.4305707Z zone.js                            0.15.1
2026-08-18T19:41:30.4305797Z     
2026-08-18T19:41:30.5329423Z 
2026-08-18T19:41:30.5330168Z > sisam-web@1.0.0-snapshot build
2026-08-18T19:41:30.5330428Z > ng build --configuration production --aot
2026-08-18T19:41:30.5330495Z 
2026-08-18T19:41:31.5107600Z ❯ Building...
2026-08-18T19:41:43.0784467Z ✔ Building...
2026-08-18T19:41:43.0802672Z Application bundle generation failed. [11.567 seconds]
2026-08-18T19:41:43.0802865Z 
2026-08-18T19:41:43.1048328Z ▲ [WARNING] 235 repetitive deprecation warnings omitted.
2026-08-18T19:41:43.1048730Z Run in verbose mode to see all warnings. [plugin angular-sass]
2026-08-18T19:41:43.1048889Z 
2026-08-18T19:41:43.1049030Z     angular:styles/global:styles:1:8:
2026-08-18T19:41:43.1049207Z       1 │ @import 'src/styles.scss';
2026-08-18T19:41:43.1049424Z         ╵         ~~~~~~~~~~~~~~~~~
2026-08-18T19:41:43.1049476Z 
2026-08-18T19:41:43.1049924Z   null
2026-08-18T19:41:43.1049961Z 
2026-08-18T19:41:43.1049993Z 
2026-08-18T19:41:43.1050153Z ▲ [WARNING] Deprecation [plugin angular-sass]
2026-08-18T19:41:43.1050209Z 
2026-08-18T19:41:43.1050323Z     node_modules/bootstrap/scss/_functions.scss:11:29:
2026-08-18T19:41:43.1050544Z       11 │     @if $prev-num == null or unit($num) == "%" or unit($prev-num) ...
2026-08-18T19:41:43.1050714Z          ╵                              ^
2026-08-18T19:41:43.1050767Z 
2026-08-18T19:41:43.1050799Z 
2026-08-18T19:41:43.1050983Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-18T19:41:43.1051112Z   Use math.unit instead.
2026-08-18T19:41:43.1051205Z   
2026-08-18T19:41:43.1051379Z   More info and automated migrator: https://sass-lang.com/d/import
2026-08-18T19:41:43.1051442Z 
2026-08-18T19:41:43.1051601Z   The plugin "angular-sass" was triggered by this import
2026-08-18T19:41:43.1051659Z 
2026-08-18T19:41:43.1051765Z     angular:styles/global:styles:1:8:
2026-08-18T19:41:43.1051936Z       1 │ @import 'src/styles.scss';
2026-08-18T19:41:43.1052078Z         ╵         ~~~~~~~~~~~~~~~~~
2026-08-18T19:41:43.1052133Z 
2026-08-18T19:41:43.1052162Z 
2026-08-18T19:41:43.1052306Z ▲ [WARNING] Deprecation [plugin angular-sass]
2026-08-18T19:41:43.1052360Z 
2026-08-18T19:41:43.1052470Z     node_modules/bootstrap/scss/_functions.scss:11:50:
2026-08-18T19:41:43.1052676Z       11 │ ...$prev-num == null or unit($num) == "%" or unit($prev-num) == "%" {
2026-08-18T19:41:43.1052857Z          ╵                                              ^
2026-08-18T19:41:43.1052900Z 
2026-08-18T19:41:43.1052929Z 
2026-08-18T19:41:43.1053110Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-18T19:41:43.1053235Z   Use math.unit instead.
2026-08-18T19:41:43.1053324Z   
2026-08-18T19:41:43.1053484Z   More info and automated migrator: https://sass-lang.com/d/import
2026-08-18T19:41:43.1053552Z 
2026-08-18T19:41:43.1053703Z   The plugin "angular-sass" was triggered by this import
2026-08-18T19:41:43.1053771Z 
2026-08-18T19:41:43.1053875Z     angular:styles/global:styles:1:8:
2026-08-18T19:41:43.1054027Z       1 │ @import 'src/styles.scss';
2026-08-18T19:41:43.1054202Z         ╵         ~~~~~~~~~~~~~~~~~
2026-08-18T19:41:43.1054245Z 
2026-08-18T19:41:43.1054282Z 
2026-08-18T19:41:43.1054460Z ▲ [WARNING] Deprecation [plugin angular-sass]
2026-08-18T19:41:43.1054511Z 
2026-08-18T19:41:43.1054653Z     node_modules/bootstrap/scss/_functions.scss:37:10:
2026-08-18T19:41:43.1054844Z       37 │   @return red($value), green($value), blue($value);
2026-08-18T19:41:43.1054991Z          ╵           ^
2026-08-18T19:41:43.1055036Z 
2026-08-18T19:41:43.1055067Z 
2026-08-18T19:41:43.1055162Z   red() is deprecated. Suggestion:
2026-08-18T19:41:43.1055250Z   
2026-08-18T19:41:43.1055350Z   color.channel($color, "red", $space: rgb)
2026-08-18T19:41:43.1055451Z   
2026-08-18T19:41:43.1055616Z   More info: https://sass-lang.com/d/color-functions
2026-08-18T19:41:43.1055672Z 
2026-08-18T19:41:43.1055839Z   The plugin "angular-sass" was triggered by this import
2026-08-18T19:41:43.1055894Z 
2026-08-18T19:41:43.1056002Z     angular:styles/global:styles:1:8:
2026-08-18T19:41:43.1056164Z       1 │ @import 'src/styles.scss';
2026-08-18T19:41:43.1056315Z         ╵         ~~~~~~~~~~~~~~~~~
2026-08-18T19:41:43.1056361Z 
2026-08-18T19:41:43.1056391Z 
2026-08-18T19:41:43.1056537Z ▲ [WARNING] Deprecation [plugin angular-sass]
2026-08-18T19:41:43.1056677Z 
2026-08-18T19:41:43.1056790Z     node_modules/bootstrap/scss/_functions.scss:37:23:
2026-08-18T19:41:43.1056980Z       37 │   @return red($value), green($value), blue($value);
2026-08-18T19:41:43.1057134Z          ╵                        ^
2026-08-18T19:41:43.1057170Z 
2026-08-18T19:41:43.1057199Z 
2026-08-18T19:41:43.1057295Z   green() is deprecated. Suggestion:
2026-08-18T19:41:43.1057388Z   
2026-08-18T19:41:43.1057489Z   color.channel($color, "green", $space: rgb)
2026-08-18T19:41:43.1057587Z   
2026-08-18T19:41:43.1057733Z   More info: https://sass-lang.com/d/color-functions
2026-08-18T19:41:43.1057841Z 
2026-08-18T19:41:43.1057993Z   The plugin "angular-sass" was triggered by this import
2026-08-18T19:41:43.1058058Z 
2026-08-18T19:41:43.1058162Z     angular:styles/global:styles:1:8:
2026-08-18T19:41:43.1058312Z       1 │ @import 'src/styles.scss';
2026-08-18T19:41:43.1058464Z         ╵         ~~~~~~~~~~~~~~~~~
2026-08-18T19:41:43.1058506Z 
2026-08-18T19:41:43.1058545Z 
2026-08-18T19:41:43.1058778Z ▲ [WARNING] Deprecation [plugin angular-sass]
2026-08-18T19:41:43.1058830Z 
2026-08-18T19:41:43.1058937Z     node_modules/bootstrap/scss/_functions.scss:185:9:
2026-08-18T19:41:43.1059093Z       185 │     "r": red($color),
2026-08-18T19:41:43.1059227Z           ╵          ^
2026-08-18T19:41:43.1059271Z 
2026-08-18T19:41:43.1059301Z 
2026-08-18T19:41:43.1059394Z   red() is deprecated. Suggestion:
2026-08-18T19:41:43.1059480Z   
2026-08-18T19:41:43.1059583Z   color.channel($color, "red", $space: rgb)
2026-08-18T19:41:43.1059682Z   
2026-08-18T19:41:43.1059846Z   More info: https://sass-lang.com/d/color-functions
2026-08-18T19:41:43.1059901Z 
2026-08-18T19:41:43.1060055Z   The plugin "angular-sass" was triggered by this import
2026-08-18T19:41:43.1060111Z 
2026-08-18T19:41:43.1060217Z     angular:styles/global:styles:1:8:
2026-08-18T19:41:43.1060377Z       1 │ @import 'src/styles.scss';
2026-08-18T19:41:43.1060524Z         ╵         ~~~~~~~~~~~~~~~~~
2026-08-18T19:41:43.1060566Z 
2026-08-18T19:41:43.1060601Z 
2026-08-18T19:41:43.1060749Z ▲ [WARNING] Deprecation [plugin angular-sass]
2026-08-18T19:41:43.1060803Z 
2026-08-18T19:41:43.1060915Z     node_modules/bootstrap/scss/_functions.scss:186:9:
2026-08-18T19:41:43.1061080Z       186 │     "g": green($color),
2026-08-18T19:41:43.1061212Z           ╵          ^
2026-08-18T19:41:43.1061248Z 
2026-08-18T19:41:43.1061277Z 
2026-08-18T19:41:43.1061375Z   green() is deprecated. Suggestion:
2026-08-18T19:41:43.1061470Z   
2026-08-18T19:41:43.1061570Z   color.channel($color, "green", $space: rgb)
2026-08-18T19:41:43.1061664Z   
2026-08-18T19:41:43.1061820Z   More info: https://sass-lang.com/d/color-functions
2026-08-18T19:41:43.1061885Z 
2026-08-18T19:41:43.1062036Z   The plugin "angular-sass" was triggered by this import
2026-08-18T19:41:43.1062099Z 
2026-08-18T19:41:43.1062194Z     angular:styles/global:styles:1:8:
2026-08-18T19:41:43.1062354Z       1 │ @import 'src/styles.scss';
2026-08-18T19:41:43.1062503Z         ╵         ~~~~~~~~~~~~~~~~~
2026-08-18T19:41:43.1062547Z 
2026-08-18T19:41:43.1062585Z 
2026-08-18T19:41:43.1062722Z ▲ [WARNING] Deprecation [plugin angular-sass]
2026-08-18T19:41:43.1062781Z 
2026-08-18T19:41:43.1062888Z     node_modules/bootstrap/scss/_functions.scss:187:9:
2026-08-18T19:41:43.1063069Z       187 │     "b": blue($color)
2026-08-18T19:41:43.1063201Z           ╵          ^
2026-08-18T19:41:43.1063237Z 
2026-08-18T19:41:43.1063274Z 
2026-08-18T19:41:43.1063369Z   blue() is deprecated. Suggestion:
2026-08-18T19:41:43.1063453Z   
2026-08-18T19:41:43.1063551Z   color.channel($color, "blue", $space: rgb)
2026-08-18T19:41:43.1063654Z   
2026-08-18T19:41:43.1063810Z   More info: https://sass-lang.com/d/color-functions
2026-08-18T19:41:43.1063863Z 
2026-08-18T19:41:43.1064020Z   The plugin "angular-sass" was triggered by this import
2026-08-18T19:41:43.1064076Z 
2026-08-18T19:41:43.1064179Z     angular:styles/global:styles:1:8:
2026-08-18T19:41:43.1064337Z       1 │ @import 'src/styles.scss';
2026-08-18T19:41:43.1064481Z         ╵         ~~~~~~~~~~~~~~~~~
2026-08-18T19:41:43.1064572Z 
2026-08-18T19:41:43.1064603Z 
2026-08-18T19:41:43.1064747Z ▲ [WARNING] Deprecation [plugin angular-sass]
2026-08-18T19:41:43.1064797Z 
2026-08-18T19:41:43.1064907Z     node_modules/bootstrap/scss/_functions.scss:207:10:
2026-08-18T19:41:43.1065086Z       207 │   @return mix(white, $color, $weight);
2026-08-18T19:41:43.1065327Z           ╵           ^
2026-08-18T19:41:43.1065365Z 
2026-08-18T19:41:43.1065395Z 
2026-08-18T19:41:43.1065577Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-18T19:41:43.1065739Z   Use color.mix instead.
2026-08-18T19:41:43.1065828Z   
2026-08-18T19:41:43.1065992Z   More info and automated migrator: https://sass-lang.com/d/import
2026-08-18T19:41:43.1066060Z 
2026-08-18T19:41:43.1066217Z   The plugin "angular-sass" was triggered by this import
2026-08-18T19:41:43.1066273Z 
2026-08-18T19:41:43.1066373Z     angular:styles/global:styles:1:8:
2026-08-18T19:41:43.1066526Z       1 │ @import 'src/styles.scss';
2026-08-18T19:41:43.1066679Z         ╵         ~~~~~~~~~~~~~~~~~
2026-08-18T19:41:43.1066729Z 
2026-08-18T19:41:43.1066759Z 
2026-08-18T19:41:43.1066902Z ▲ [WARNING] Deprecation [plugin angular-sass]
2026-08-18T19:41:43.1066952Z 
2026-08-18T19:41:43.1067061Z     node_modules/bootstrap/scss/_functions.scss:212:10:
2026-08-18T19:41:43.1067242Z       212 │   @return mix(black, $color, $weight);
2026-08-18T19:41:43.1067375Z           ╵           ^
2026-08-18T19:41:43.1067420Z 
2026-08-18T19:41:43.1067450Z 
2026-08-18T19:41:43.1067631Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-18T19:41:43.1067761Z   Use color.mix instead.
2026-08-18T19:41:43.1067846Z   
2026-08-18T19:41:43.1068034Z   More info and automated migrator: https://sass-lang.com/d/import
2026-08-18T19:41:43.1068102Z 
2026-08-18T19:41:43.1068251Z   The plugin "angular-sass" was triggered by this import
2026-08-18T19:41:43.1068314Z 
2026-08-18T19:41:43.1068408Z     angular:styles/global:styles:1:8:
2026-08-18T19:41:43.1068636Z       1 │ @import 'src/styles.scss';
2026-08-18T19:41:43.1068800Z         ╵         ~~~~~~~~~~~~~~~~~
2026-08-18T19:41:43.1068844Z 
2026-08-18T19:41:43.1068882Z 
2026-08-18T19:41:43.1069020Z ▲ [WARNING] Deprecation [plugin angular-sass]
2026-08-18T19:41:43.1069080Z 
2026-08-18T19:41:43.1069187Z     node_modules/bootstrap/scss/_variables.scss:342:26:
2026-08-18T19:41:43.1069379Z       342 │ $light-bg-subtle:         mix($gray-100, $white) !default;
2026-08-18T19:41:43.1069538Z           ╵                           ^
2026-08-18T19:41:43.1069582Z 
2026-08-18T19:41:43.1069621Z 
2026-08-18T19:41:43.1069803Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-18T19:41:43.1069921Z   Use color.mix instead.
2026-08-18T19:41:43.1070011Z   
2026-08-18T19:41:43.1070179Z   More info and automated migrator: https://sass-lang.com/d/import
2026-08-18T19:41:43.1070238Z 
2026-08-18T19:41:43.1070393Z   The plugin "angular-sass" was triggered by this import
2026-08-18T19:41:43.1070452Z 
2026-08-18T19:41:43.1070552Z     angular:styles/global:styles:1:8:
2026-08-18T19:41:43.1070710Z       1 │ @import 'src/styles.scss';
2026-08-18T19:41:43.1070858Z         ╵         ~~~~~~~~~~~~~~~~~
2026-08-18T19:41:43.1070900Z 
2026-08-18T19:41:43.1070929Z 
2026-08-18T19:41:43.1071074Z ▲ [WARNING] Deprecation [plugin angular-sass]
2026-08-18T19:41:43.1071124Z 
2026-08-18T19:41:43.1071230Z     node_modules/bootstrap/scss/bootstrap.scss:1:8:
2026-08-18T19:41:43.1071389Z       1 │ @import "mixins/banner";
2026-08-18T19:41:43.1071517Z         ╵         ^
2026-08-18T19:41:43.1071559Z 
2026-08-18T19:41:43.1071589Z 
2026-08-18T19:41:43.1071702Z   Sass @import rules are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-18T19:41:43.1071814Z   
2026-08-18T19:41:43.1071983Z   More info and automated migrator: https://sass-lang.com/d/import
2026-08-18T19:41:43.1072044Z 
2026-08-18T19:41:43.1072203Z   The plugin "angular-sass" was triggered by this import
2026-08-18T19:41:43.1072367Z 
2026-08-18T19:41:43.1072481Z     angular:styles/global:styles:1:8:
2026-08-18T19:41:43.1072647Z       1 │ @import 'src/styles.scss';
2026-08-18T19:41:43.1072794Z         ╵         ~~~~~~~~~~~~~~~~~
2026-08-18T19:41:43.1072836Z 
2026-08-18T19:41:43.1072865Z 
2026-08-18T19:41:43.1073008Z ▲ [WARNING] Deprecation [plugin angular-sass]
2026-08-18T19:41:43.1073058Z 
2026-08-18T19:41:43.1073163Z     node_modules/bootstrap/scss/bootstrap.scss:7:8:
2026-08-18T19:41:43.1073315Z       7 │ @import "functions";
2026-08-18T19:41:43.1073443Z         ╵         ^
2026-08-18T19:41:43.1073517Z 
2026-08-18T19:41:43.1073548Z 
2026-08-18T19:41:43.1073658Z   Sass @import rules are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-18T19:41:43.1073768Z   
2026-08-18T19:41:43.1073939Z   More info and automated migrator: https://sass-lang.com/d/import
2026-08-18T19:41:43.1073997Z 
2026-08-18T19:41:43.1074156Z   The plugin "angular-sass" was triggered by this import
2026-08-18T19:41:43.1074210Z 
2026-08-18T19:41:43.1074319Z     angular:styles/global:styles:1:8:
2026-08-18T19:41:43.1074475Z       1 │ @import 'src/styles.scss';
2026-08-18T19:41:43.1074620Z         ╵         ~~~~~~~~~~~~~~~~~
2026-08-18T19:41:43.1074663Z 
2026-08-18T19:41:43.1074692Z 
2026-08-18T19:41:43.1074838Z ▲ [WARNING] Deprecation [plugin angular-sass]
2026-08-18T19:41:43.1074887Z 
2026-08-18T19:41:43.1075063Z     node_modules/sidsc-components/styles/material-icons/_core.scss:4:10:
2026-08-18T19:41:43.1075248Z       4 │   $index: str-index($string, $search);
2026-08-18T19:41:43.1075385Z         ╵           ^
2026-08-18T19:41:43.1075428Z 
2026-08-18T19:41:43.1075458Z 
2026-08-18T19:41:43.1076622Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-18T19:41:43.1076782Z   Use string.index instead.
2026-08-18T19:41:43.1076879Z   
2026-08-18T19:41:43.1077038Z   More info and automated migrator: https://sass-lang.com/d/import
2026-08-18T19:41:43.1077106Z 
2026-08-18T19:41:43.1077262Z   The plugin "angular-sass" was triggered by this import
2026-08-18T19:41:43.1077324Z 
2026-08-18T19:41:43.1077428Z     angular:styles/global:styles:2:8:
2026-08-18T19:41:43.1077624Z       2 │ @import './node_modules/sidsc-components/styles/main.scss';
2026-08-18T19:41:43.1077812Z         ╵         ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
2026-08-18T19:41:43.1077879Z 
2026-08-18T19:41:43.1077909Z 
2026-08-18T19:41:43.1078057Z ▲ [WARNING] Deprecation [plugin angular-sass]
2026-08-18T19:41:43.1078108Z 
2026-08-18T19:41:43.1078284Z     node_modules/sidsc-components/styles/material-icons/_core.scss:6:12:
2026-08-18T19:41:43.1078492Z       6 │     @return str-slice($string, 1, $index - 1) + $replace +
2026-08-18T19:41:43.1078713Z         ╵             ^
2026-08-18T19:41:43.1078754Z 
2026-08-18T19:41:43.1078784Z 
2026-08-18T19:41:43.1078967Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-18T19:41:43.1079094Z   Use string.slice instead.
2026-08-18T19:41:43.1079188Z   
2026-08-18T19:41:43.1079347Z   More info and automated migrator: https://sass-lang.com/d/import
2026-08-18T19:41:43.1079418Z 
2026-08-18T19:41:43.1079569Z   The plugin "angular-sass" was triggered by this import
2026-08-18T19:41:43.1079633Z 
2026-08-18T19:41:43.1079735Z     angular:styles/global:styles:2:8:
2026-08-18T19:41:43.1079915Z       2 │ @import './node_modules/sidsc-components/styles/main.scss';
2026-08-18T19:41:43.1080110Z         ╵         ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
2026-08-18T19:41:43.1080168Z 
2026-08-18T19:41:43.1080206Z 
2026-08-18T19:41:43.1080350Z ▲ [WARNING] Deprecation [plugin angular-sass]
2026-08-18T19:41:43.1080407Z 
2026-08-18T19:41:43.1080584Z     node_modules/sidsc-components/styles/material-icons/_core.scss:8:8:
2026-08-18T19:41:43.1080775Z       8 │         str-slice($string, $index + str-length($search)),
2026-08-18T19:41:43.1080918Z         ╵         ^
2026-08-18T19:41:43.1080964Z 
2026-08-18T19:41:43.1080997Z 
2026-08-18T19:41:43.1081179Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-18T19:41:43.1081380Z   Use string.slice instead.
2026-08-18T19:41:43.1081463Z   
2026-08-18T19:41:43.1081631Z   More info and automated migrator: https://sass-lang.com/d/import
2026-08-18T19:41:43.1081688Z 
2026-08-18T19:41:43.1081846Z   The plugin "angular-sass" was triggered by this import
2026-08-18T19:41:43.1081909Z 
2026-08-18T19:41:43.1082005Z     angular:styles/global:styles:2:8:
2026-08-18T19:41:43.1082194Z       2 │ @import './node_modules/sidsc-components/styles/main.scss';
2026-08-18T19:41:43.1082391Z         ╵         ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
2026-08-18T19:41:43.1082492Z 
2026-08-18T19:41:43.1082530Z 
2026-08-18T19:41:43.1082671Z ▲ [WARNING] Deprecation [plugin angular-sass]
2026-08-18T19:41:43.1082728Z 
2026-08-18T19:41:43.1082898Z     node_modules/sidsc-components/styles/material-icons/_core.scss:8:36:
2026-08-18T19:41:43.1083096Z       8 │         str-slice($string, $index + str-length($search)),
2026-08-18T19:41:43.1083258Z         ╵                                     ^
2026-08-18T19:41:43.1083304Z 
2026-08-18T19:41:43.1083341Z 
2026-08-18T19:41:43.1083521Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-18T19:41:43.1083641Z   Use string.length instead.
2026-08-18T19:41:43.1083737Z   
2026-08-18T19:41:43.1083905Z   More info and automated migrator: https://sass-lang.com/d/import
2026-08-18T19:41:43.1083965Z 
2026-08-18T19:41:43.1084122Z   The plugin "angular-sass" was triggered by this import
2026-08-18T19:41:43.1084177Z 
2026-08-18T19:41:43.1084282Z     angular:styles/global:styles:2:8:
2026-08-18T19:41:43.1084474Z       2 │ @import './node_modules/sidsc-components/styles/main.scss';
2026-08-18T19:41:43.1084668Z         ╵         ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
2026-08-18T19:41:43.1084725Z 
2026-08-18T19:41:43.1084754Z 
2026-08-18T19:41:43.1084897Z ▲ [WARNING] Deprecation [plugin angular-sass]
2026-08-18T19:41:43.1084957Z 
2026-08-18T19:41:43.1085128Z     node_modules/sidsc-components/styles/material-icons/_core.scss:17:15:
2026-08-18T19:41:43.1085329Z       17 │   $class-name: to-lower-case($font-family);
2026-08-18T19:41:43.1085474Z          ╵                ^
2026-08-18T19:41:43.1085513Z 
2026-08-18T19:41:43.1085551Z 
2026-08-18T19:41:43.1085726Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-18T19:41:43.1085915Z   Use string.to-lower-case instead.
2026-08-18T19:41:43.1086011Z   
2026-08-18T19:41:43.1086182Z   More info and automated migrator: https://sass-lang.com/d/import
2026-08-18T19:41:43.1086245Z 
2026-08-18T19:41:43.1086402Z   The plugin "angular-sass" was triggered by this import
2026-08-18T19:41:43.1086458Z 
2026-08-18T19:41:43.1086561Z     angular:styles/global:styles:2:8:
2026-08-18T19:41:43.1086749Z       2 │ @import './node_modules/sidsc-components/styles/main.scss';
2026-08-18T19:41:43.1087122Z         ╵         ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
2026-08-18T19:41:43.1087183Z 
2026-08-18T19:41:43.1087217Z 
2026-08-18T19:41:43.1087369Z ▲ [WARNING] Deprecation [plugin angular-sass]
2026-08-18T19:41:43.1087419Z 
2026-08-18T19:41:43.1087510Z     src/styles.scss:5:8:
2026-08-18T19:41:43.1087686Z       5 │ @import "../node_modules/bootstrap/scss/bootstrap.scss";
2026-08-18T19:41:43.1087829Z         ╵         ^
2026-08-18T19:41:43.1087867Z 
2026-08-18T19:41:43.1087896Z 
2026-08-18T19:41:43.1088007Z   Sass @import rules are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-18T19:41:43.1088116Z   
2026-08-18T19:41:43.1088284Z   More info and automated migrator: https://sass-lang.com/d/import
2026-08-18T19:41:43.1088346Z 
2026-08-18T19:41:43.1088504Z   The plugin "angular-sass" was triggered by this import
2026-08-18T19:41:43.1088558Z 
2026-08-18T19:41:43.1088733Z     angular:styles/global:styles:1:8:
2026-08-18T19:41:43.1088903Z       1 │ @import 'src/styles.scss';
2026-08-18T19:41:43.1089053Z         ╵         ~~~~~~~~~~~~~~~~~
2026-08-18T19:41:43.1089097Z 
2026-08-18T19:41:43.1089127Z 
2026-08-18T19:41:43.1089323Z ▲ [WARNING] Deprecation [plugin angular-sass]
2026-08-18T19:41:43.1089374Z 
2026-08-18T19:41:43.1089466Z     src/styles.scss:8:8:
2026-08-18T19:41:43.1089624Z       8 │ @import "../public/fonts/fonts.scss";
2026-08-18T19:41:43.1089758Z         ╵         ^
2026-08-18T19:41:43.1089797Z 
2026-08-18T19:41:43.1089827Z 
2026-08-18T19:41:43.1089937Z   Sass @import rules are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-18T19:41:43.1090048Z   
2026-08-18T19:41:43.1090216Z   More info and automated migrator: https://sass-lang.com/d/import
2026-08-18T19:41:43.1090311Z 
2026-08-18T19:41:43.1090468Z   The plugin "angular-sass" was triggered by this import
2026-08-18T19:41:43.1090523Z 
2026-08-18T19:41:43.1090625Z     angular:styles/global:styles:1:8:
2026-08-18T19:41:43.1090785Z       1 │ @import 'src/styles.scss';
2026-08-18T19:41:43.1090926Z         ╵         ~~~~~~~~~~~~~~~~~
2026-08-18T19:41:43.1090978Z 
2026-08-18T19:41:43.1091007Z 
2026-08-18T19:41:43.1091151Z ▲ [WARNING] Deprecation [plugin angular-sass]
2026-08-18T19:41:43.1091207Z 
2026-08-18T19:41:43.1091299Z     src/styles.scss:9:8:
2026-08-18T19:41:43.1091467Z       9 │ @import "../public/fonts/fonts-icons.scss";
2026-08-18T19:41:43.1091604Z         ╵         ^
2026-08-18T19:41:43.1091642Z 
2026-08-18T19:41:43.1091672Z 
2026-08-18T19:41:43.1091784Z   Sass @import rules are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-18T19:41:43.1091893Z   
2026-08-18T19:41:43.1092056Z   More info and automated migrator: https://sass-lang.com/d/import
2026-08-18T19:41:43.1092123Z 
2026-08-18T19:41:43.1092295Z   The plugin "angular-sass" was triggered by this import
2026-08-18T19:41:43.1092350Z 
2026-08-18T19:41:43.1092454Z     angular:styles/global:styles:1:8:
2026-08-18T19:41:43.1092612Z       1 │ @import 'src/styles.scss';
2026-08-18T19:41:43.1092750Z         ╵         ~~~~~~~~~~~~~~~~~
2026-08-18T19:41:43.1092800Z 
2026-08-18T19:41:43.1092829Z 
2026-08-18T19:41:43.1093049Z ✘ [ERROR] Cannot destructure property 'pos' of 'file.referencedFiles[index]' as it is undefined. [plugin angular-compiler]
2026-08-18T19:41:43.1093140Z 
2026-08-18T19:41:43.1093258Z     node_modules/typescript/lib/typescript.js:125702:9:
2026-08-18T19:41:43.1093454Z       125702 │       ({ pos, end } = file.referencedFiles[index]);
2026-08-18T19:41:43.1093604Z              ╵          ^
2026-08-18T19:41:43.1093644Z 
2026-08-18T19:41:43.1093867Z     at getReferencedFileLocation (/opt/ads-agent/_work/402/s/node_modules/typescript/lib/typescript.js:125702:10)
2026-08-18T19:41:43.1094141Z     at fileIncludeReasonToDiagnostics (/opt/ads-agent/_work/402/s/node_modules/typescript/lib/typescript.js:132571:31)
2026-08-18T19:41:43.1094411Z     at processReason (/opt/ads-agent/_work/402/s/node_modules/typescript/lib/typescript.js:129136:62)
2026-08-18T19:41:43.1094550Z     at Array.forEach (<anonymous>)
2026-08-18T19:41:43.1094788Z     at createDiagnosticExplainingFile (/opt/ads-agent/_work/402/s/node_modules/typescript/lib/typescript.js:129088:42)
2026-08-18T19:41:43.1095033Z     at /opt/ads-agent/_work/402/s/node_modules/typescript/lib/typescript.js:129021:15
2026-08-18T19:41:43.1095171Z     at Array.forEach (<anonymous>)
2026-08-18T19:41:43.1095400Z     at Object.getCombinedDiagnostics (/opt/ads-agent/_work/402/s/node_modules/typescript/lib/typescript.js:129017:78)
2026-08-18T19:41:43.1095665Z     at getProgramDiagnostics (/opt/ads-agent/_work/402/s/node_modules/typescript/lib/typescript.js:126966:57)
2026-08-18T19:41:43.1095934Z     at getSemanticDiagnosticsForFile (/opt/ads-agent/_work/402/s/node_modules/typescript/lib/typescript.js:126997:7)
2026-08-18T19:41:43.1096028Z 
2026-08-18T19:41:43.1096128Z   This error came from the "onStart" callback registered here:
2026-08-18T19:41:43.1096194Z 
2026-08-18T19:41:43.1096379Z     node_modules/@angular/build/src/tools/esbuild/angular/compiler-plugin.js:118:18:
2026-08-18T19:41:43.1096570Z       118 │             build.onStart(async () => {
2026-08-18T19:41:43.1096722Z           ╵                   ~~~~~~~
2026-08-18T19:41:43.1096764Z 
2026-08-18T19:41:43.1097018Z     at setup (/opt/ads-agent/_work/402/s/node_modules/@angular/build/src/tools/esbuild/angular/compiler-plugin.js:118:19)
2026-08-18T19:41:43.1097275Z     at async handlePlugins (/opt/ads-agent/_work/402/s/node_modules/esbuild/lib/main.js:1181:20)
2026-08-18T19:41:43.1097352Z 
2026-08-18T19:41:43.1097390Z 
2026-08-18T19:41:43.2199083Z ##[error]Bash exited with code '1'.
2026-08-18T19:41:43.2240033Z ##[section]Finishing: Build Application
