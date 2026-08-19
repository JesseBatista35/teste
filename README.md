Rapaz, resolvi aquela questão da build localmente, mas não resolveu o problema da esteira ainda.. 

2026-08-19T15:07:53.7156378Z ##[section]Starting: Build Application
2026-08-19T15:07:53.7161918Z ==============================================================================
2026-08-19T15:07:53.7162047Z Task         : Bash
2026-08-19T15:07:53.7162093Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-19T15:07:53.7162168Z Version      : 3.227.0
2026-08-19T15:07:53.7162277Z Author       : Microsoft Corporation
2026-08-19T15:07:53.7162333Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-19T15:07:53.7162403Z ==============================================================================
2026-08-19T15:07:53.8648694Z Generating script.
2026-08-19T15:07:53.8661835Z ========================== Starting Command Output ===========================
2026-08-19T15:07:53.8668932Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/72fbd3a9-89ec-4fc9-b1a4-12db30f00892.sh
2026-08-19T15:07:53.8740155Z npm run build && npm run coverage
2026-08-19T15:07:53.8742189Z <----ANGULAR---->
2026-08-19T15:07:54.3290488Z 
2026-08-19T15:07:54.3291207Z      _                      _                 ____ _     ___
2026-08-19T15:07:54.3291382Z     / \   _ __   __ _ _   _| | __ _ _ __     / ___| |   |_ _|
2026-08-19T15:07:54.3291843Z    / △ \ | '_ \ / _` | | | | |/ _` | '__|   | |   | |    | |
2026-08-19T15:07:54.3292211Z   / ___ \| | | | (_| | |_| | | (_| | |      | |___| |___ | |
2026-08-19T15:07:54.3292364Z  /_/   \_\_| |_|\__, |\__,_|_|\__,_|_|       \____|_____|___|
2026-08-19T15:07:54.3292467Z                 |___/
2026-08-19T15:07:54.3292588Z     
2026-08-19T15:07:54.4103944Z 
2026-08-19T15:07:54.4104509Z Angular CLI: 19.2.23
2026-08-19T15:07:54.4104917Z Node: 22.13.1
2026-08-19T15:07:54.4105139Z Package Manager: npm 10.9.2
2026-08-19T15:07:54.4105342Z OS: linux x64
2026-08-19T15:07:54.4105384Z 
2026-08-19T15:07:54.4105669Z Angular: 19.2.20
2026-08-19T15:07:54.4106208Z ... animations, common, compiler, compiler-cli, core, forms
2026-08-19T15:07:54.4106643Z ... platform-browser, platform-browser-dynamic, platform-server
2026-08-19T15:07:54.4106799Z ... router
2026-08-19T15:07:54.4106898Z 
2026-08-19T15:07:54.4107116Z Package                            Version
2026-08-19T15:07:54.4107389Z ------------------------------------------------------------
2026-08-19T15:07:54.4107637Z @angular-devkit/architect          0.1902.23
2026-08-19T15:07:54.4107942Z @angular-devkit/build-angular      19.2.23
2026-08-19T15:07:54.4108138Z @angular-devkit/core               19.2.23
2026-08-19T15:07:54.4108541Z @angular-devkit/schematics         19.2.23
2026-08-19T15:07:54.4108687Z @angular/build                     19.2.23
2026-08-19T15:07:54.4108787Z @angular/cdk                       19.2.19
2026-08-19T15:07:54.4108937Z @angular/cli                       19.2.23
2026-08-19T15:07:54.4109074Z @angular/material                  19.2.19
2026-08-19T15:07:54.4109261Z @angular/material-moment-adapter   19.2.19
2026-08-19T15:07:54.4109405Z @schematics/angular                19.2.23
2026-08-19T15:07:54.4109541Z rxjs                               7.8.2
2026-08-19T15:07:54.4109647Z typescript                         5.8.3
2026-08-19T15:07:54.4109782Z zone.js                            0.15.1
2026-08-19T15:07:54.4109933Z     
2026-08-19T15:07:54.5297560Z 
2026-08-19T15:07:54.5298635Z > sisam-web@1.0.0-snapshot build
2026-08-19T15:07:54.5298996Z > ng build --configuration production --aot
2026-08-19T15:07:54.5299389Z 
2026-08-19T15:07:55.0708254Z ❯ Building...
2026-08-19T15:08:07.8123722Z ✔ Building...
2026-08-19T15:08:07.8140434Z Application bundle generation failed. [12.741 seconds]
2026-08-19T15:08:07.8140811Z 
2026-08-19T15:08:07.8157301Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1m235 repetitive deprecation warnings omitted.
2026-08-19T15:08:07.8157716Z Run in verbose mode to see all warnings.[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:08:07.8158260Z 
2026-08-19T15:08:07.8158516Z     angular:styles/global:styles:1:8:
2026-08-19T15:08:07.8158854Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:08:07.8159193Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:08:07.8159594Z 
2026-08-19T15:08:07.8159771Z   null
2026-08-19T15:08:07.8159834Z 
2026-08-19T15:08:07.8159929Z 
2026-08-19T15:08:07.8160138Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:08:07.8160285Z 
2026-08-19T15:08:07.8160432Z     node_modules/bootstrap/scss/_functions.scss:11:29:
2026-08-19T15:08:07.8160650Z [37m      11 │     @if $prev-num == null or [32m[37munit($num) == "%" or unit($prev-num) ...
2026-08-19T15:08:07.8161035Z          ╵                              [32m^[0m
2026-08-19T15:08:07.8161117Z 
2026-08-19T15:08:07.8161150Z 
2026-08-19T15:08:07.8161401Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-19T15:08:07.8161566Z   Use math.unit instead.
2026-08-19T15:08:07.8161658Z   
2026-08-19T15:08:07.8161872Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-19T15:08:07.8161987Z 
2026-08-19T15:08:07.8162154Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:08:07.8162247Z 
2026-08-19T15:08:07.8162384Z     angular:styles/global:styles:1:8:
2026-08-19T15:08:07.8162712Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:08:07.8163010Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:08:07.8163098Z 
2026-08-19T15:08:07.8163206Z 
2026-08-19T15:08:07.8163492Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:08:07.8163571Z 
2026-08-19T15:08:07.8163718Z     node_modules/bootstrap/scss/_functions.scss:11:50:
2026-08-19T15:08:07.8163972Z [37m      11 │ ...$prev-num == null or unit($num) == "%" or [32m[37munit($prev-num) == "%" {
2026-08-19T15:08:07.8164155Z          ╵                                              [32m^[0m
2026-08-19T15:08:07.8164249Z 
2026-08-19T15:08:07.8164280Z 
2026-08-19T15:08:07.8164486Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-19T15:08:07.8164652Z   Use math.unit instead.
2026-08-19T15:08:07.8164779Z   
2026-08-19T15:08:07.8164953Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-19T15:08:07.8165053Z 
2026-08-19T15:08:07.8165265Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:08:07.8165332Z 
2026-08-19T15:08:07.8165465Z     angular:styles/global:styles:1:8:
2026-08-19T15:08:07.8165637Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:08:07.8168448Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:08:07.8168550Z 
2026-08-19T15:08:07.8168585Z 
2026-08-19T15:08:07.8168870Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:08:07.8168944Z 
2026-08-19T15:08:07.8169089Z     node_modules/bootstrap/scss/_functions.scss:37:10:
2026-08-19T15:08:07.8169323Z [37m      37 │   @return [32m[37mred($value), green($value), blue($value);
2026-08-19T15:08:07.8169695Z          ╵           [32m^[0m
2026-08-19T15:08:07.8169750Z 
2026-08-19T15:08:07.8169781Z 
2026-08-19T15:08:07.8169914Z   red() is deprecated. Suggestion:
2026-08-19T15:08:07.8170046Z   
2026-08-19T15:08:07.8170194Z   color.channel($color, "red", $space: rgb)
2026-08-19T15:08:07.8170293Z   
2026-08-19T15:08:07.8170496Z   More info: [4mhttps://sass-lang.com/d/color-functions[0m
2026-08-19T15:08:07.8170881Z 
2026-08-19T15:08:07.8171060Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:08:07.8171160Z 
2026-08-19T15:08:07.8171297Z     angular:styles/global:styles:1:8:
2026-08-19T15:08:07.8171480Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:08:07.8171706Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:08:07.8171793Z 
2026-08-19T15:08:07.8171825Z 
2026-08-19T15:08:07.8172062Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:08:07.8172141Z 
2026-08-19T15:08:07.8172278Z     node_modules/bootstrap/scss/_functions.scss:37:23:
2026-08-19T15:08:07.8172583Z [37m      37 │   @return red($value), [32m[37mgreen($value), blue($value);
2026-08-19T15:08:07.8172784Z          ╵                        [32m^[0m
2026-08-19T15:08:07.8172826Z 
2026-08-19T15:08:07.8172857Z 
2026-08-19T15:08:07.8172984Z   green() is deprecated. Suggestion:
2026-08-19T15:08:07.8173120Z   
2026-08-19T15:08:07.8173278Z   color.channel($color, "green", $space: rgb)
2026-08-19T15:08:07.8173377Z   
2026-08-19T15:08:07.8173584Z   More info: [4mhttps://sass-lang.com/d/color-functions[0m
2026-08-19T15:08:07.8173679Z 
2026-08-19T15:08:07.8173834Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:08:07.8173927Z 
2026-08-19T15:08:07.8174062Z     angular:styles/global:styles:1:8:
2026-08-19T15:08:07.8174235Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:08:07.8174430Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:08:07.8174584Z 
2026-08-19T15:08:07.8174620Z 
2026-08-19T15:08:07.8174850Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:08:07.8174933Z 
2026-08-19T15:08:07.8175118Z     node_modules/bootstrap/scss/_functions.scss:185:9:
2026-08-19T15:08:07.8175331Z [37m      185 │     "r": [32m[37mred($color),
2026-08-19T15:08:07.8175474Z           ╵          [32m^[0m
2026-08-19T15:08:07.8175558Z 
2026-08-19T15:08:07.8175590Z 
2026-08-19T15:08:07.8175718Z   red() is deprecated. Suggestion:
2026-08-19T15:08:07.8175845Z   
2026-08-19T15:08:07.8175943Z   color.channel($color, "red", $space: rgb)
2026-08-19T15:08:07.8176076Z   
2026-08-19T15:08:07.8176271Z   More info: [4mhttps://sass-lang.com/d/color-functions[0m
2026-08-19T15:08:07.8176330Z 
2026-08-19T15:08:07.8176520Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:08:07.8176644Z 
2026-08-19T15:08:07.8176745Z     angular:styles/global:styles:1:8:
2026-08-19T15:08:07.8176951Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:08:07.8177145Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:08:07.8177198Z 
2026-08-19T15:08:07.8177263Z 
2026-08-19T15:08:07.8177489Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:08:07.8177563Z 
2026-08-19T15:08:07.8177705Z     node_modules/bootstrap/scss/_functions.scss:186:9:
2026-08-19T15:08:07.8177914Z [37m      186 │     "g": [32m[37mgreen($color),
2026-08-19T15:08:07.8178060Z           ╵          [32m^[0m
2026-08-19T15:08:07.8178147Z 
2026-08-19T15:08:07.8178178Z 
2026-08-19T15:08:07.8178337Z   green() is deprecated. Suggestion:
2026-08-19T15:08:07.8178468Z   
2026-08-19T15:08:07.8178616Z   color.channel($color, "green", $space: rgb)
2026-08-19T15:08:07.8178800Z   
2026-08-19T15:08:07.8179054Z   More info: [4mhttps://sass-lang.com/d/color-functions[0m
2026-08-19T15:08:07.8179119Z 
2026-08-19T15:08:07.8179309Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:08:07.8179410Z 
2026-08-19T15:08:07.8179515Z     angular:styles/global:styles:1:8:
2026-08-19T15:08:07.8179797Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:08:07.8180009Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:08:07.8180059Z 
2026-08-19T15:08:07.8180156Z 
2026-08-19T15:08:07.8180352Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:08:07.8180575Z 
2026-08-19T15:08:07.8180855Z     node_modules/bootstrap/scss/_functions.scss:187:9:
2026-08-19T15:08:07.8181057Z [37m      187 │     "b": [32m[37mblue($color)
2026-08-19T15:08:07.8181290Z           ╵          [32m^[0m
2026-08-19T15:08:07.8181395Z 
2026-08-19T15:08:07.8181439Z 
2026-08-19T15:08:07.8181629Z   blue() is deprecated. Suggestion:
2026-08-19T15:08:07.8181765Z   
2026-08-19T15:08:07.8181970Z   color.channel($color, "blue", $space: rgb)
2026-08-19T15:08:07.8182168Z   
2026-08-19T15:08:07.8182525Z   More info: [4mhttps://sass-lang.com/d/color-functions[0m
2026-08-19T15:08:07.8182590Z 
2026-08-19T15:08:07.8182792Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:08:07.8182924Z 
2026-08-19T15:08:07.8183075Z     angular:styles/global:styles:1:8:
2026-08-19T15:08:07.8183349Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:08:07.8183548Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:08:07.8183604Z 
2026-08-19T15:08:07.8183682Z 
2026-08-19T15:08:07.8183875Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:08:07.8183984Z 
2026-08-19T15:08:07.8184091Z     node_modules/bootstrap/scss/_functions.scss:207:10:
2026-08-19T15:08:07.8184378Z [37m      207 │   @return [32m[37mmix(white, $color, $weight);
2026-08-19T15:08:07.8184603Z           ╵           [32m^[0m
2026-08-19T15:08:07.8184645Z 
2026-08-19T15:08:07.8184714Z 
2026-08-19T15:08:07.8184924Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-19T15:08:07.8185097Z   Use color.mix instead.
2026-08-19T15:08:07.8185241Z   
2026-08-19T15:08:07.8185470Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-19T15:08:07.8185534Z 
2026-08-19T15:08:07.8185721Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:08:07.8185815Z 
2026-08-19T15:08:07.8185914Z     angular:styles/global:styles:1:8:
2026-08-19T15:08:07.8186204Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:08:07.8186477Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:08:07.8186524Z 
2026-08-19T15:08:07.8186593Z 
2026-08-19T15:08:07.8186784Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:08:07.8186892Z 
2026-08-19T15:08:07.8187036Z     node_modules/bootstrap/scss/_functions.scss:212:10:
2026-08-19T15:08:07.8187223Z [37m      212 │   @return [32m[37mmix(black, $color, $weight);
2026-08-19T15:08:07.8187424Z           ╵           [32m^[0m
2026-08-19T15:08:07.8187500Z 
2026-08-19T15:08:07.8187533Z 
2026-08-19T15:08:07.8187746Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-19T15:08:07.8187913Z   Use color.mix instead.
2026-08-19T15:08:07.8188005Z   
2026-08-19T15:08:07.8188260Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-19T15:08:07.8188359Z 
2026-08-19T15:08:07.8188520Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:08:07.8188615Z 
2026-08-19T15:08:07.8188716Z     angular:styles/global:styles:1:8:
2026-08-19T15:08:07.8188937Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:08:07.8189146Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:08:07.8189196Z 
2026-08-19T15:08:07.8189265Z 
2026-08-19T15:08:07.8189489Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:08:07.8189563Z 
2026-08-19T15:08:07.8189710Z     node_modules/bootstrap/scss/_variables.scss:342:26:
2026-08-19T15:08:07.8189975Z [37m      342 │ $light-bg-subtle:         [32m[37mmix($gray-100, $white) !default;
2026-08-19T15:08:07.8190152Z           ╵                           [32m^[0m
2026-08-19T15:08:07.8190234Z 
2026-08-19T15:08:07.8190267Z 
2026-08-19T15:08:07.8190480Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-19T15:08:07.8190659Z   Use color.mix instead.
2026-08-19T15:08:07.8190970Z   
2026-08-19T15:08:07.8191152Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-19T15:08:07.8191259Z 
2026-08-19T15:08:07.8191448Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:08:07.8191509Z 
2026-08-19T15:08:07.8191648Z     angular:styles/global:styles:1:8:
2026-08-19T15:08:07.8191820Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:08:07.8192046Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:08:07.8192130Z 
2026-08-19T15:08:07.8192161Z 
2026-08-19T15:08:07.8192398Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:08:07.8192578Z 
2026-08-19T15:08:07.8192729Z     node_modules/bootstrap/scss/bootstrap.scss:1:8:
2026-08-19T15:08:07.8192946Z [37m      1 │ @import [32m[37m"mixins/banner";
2026-08-19T15:08:07.8193127Z         ╵         [32m^[0m
2026-08-19T15:08:07.8193174Z 
2026-08-19T15:08:07.8193206Z 
2026-08-19T15:08:07.8193364Z   Sass @import rules are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-19T15:08:07.8193631Z   
2026-08-19T15:08:07.8193873Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-19T15:08:07.8193987Z 
2026-08-19T15:08:07.8194144Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:08:07.8194237Z 
2026-08-19T15:08:07.8194373Z     angular:styles/global:styles:1:8:
2026-08-19T15:08:07.8194545Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:08:07.8194743Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:08:07.8194829Z 
2026-08-19T15:08:07.8194861Z 
2026-08-19T15:08:07.8195082Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:08:07.8195161Z 
2026-08-19T15:08:07.8195305Z     node_modules/bootstrap/scss/bootstrap.scss:7:8:
2026-08-19T15:08:07.8195558Z [37m      7 │ @import [32m[37m"functions";
2026-08-19T15:08:07.8195698Z         ╵         [32m^[0m
2026-08-19T15:08:07.8195779Z 
2026-08-19T15:08:07.8195810Z 
2026-08-19T15:08:07.8195955Z   Sass @import rules are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-19T15:08:07.8196101Z   
2026-08-19T15:08:07.8196305Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-19T15:08:07.8196369Z 
2026-08-19T15:08:07.8196553Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:08:07.8196611Z 
2026-08-19T15:08:07.8196747Z     angular:styles/global:styles:1:8:
2026-08-19T15:08:07.8196953Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:08:07.8197110Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:08:07.8197230Z 
2026-08-19T15:08:07.8197267Z 
2026-08-19T15:08:07.8197490Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:08:07.8197562Z 
2026-08-19T15:08:07.8197768Z     node_modules/sidsc-components/styles/material-icons/_core.scss:4:10:
2026-08-19T15:08:07.8198005Z [37m      4 │   $index: [32m[37mstr-index($string, $search);
2026-08-19T15:08:07.8198189Z         ╵           [32m^[0m
2026-08-19T15:08:07.8198230Z 
2026-08-19T15:08:07.8198260Z 
2026-08-19T15:08:07.8198469Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-19T15:08:07.8198627Z   Use string.index instead.
2026-08-19T15:08:07.8198764Z   
2026-08-19T15:08:07.8198989Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-19T15:08:07.8199052Z 
2026-08-19T15:08:07.8199235Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:08:07.8199290Z 
2026-08-19T15:08:07.8199428Z     angular:styles/global:styles:2:8:
2026-08-19T15:08:07.8199668Z [37m      2 │ @import [32m'./node_modules/sidsc-components/styles/main.scss'[37m;
2026-08-19T15:08:07.8199904Z         ╵         [32m~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:08:07.8199965Z 
2026-08-19T15:08:07.8199997Z 
2026-08-19T15:08:07.8200225Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:08:07.8200384Z 
2026-08-19T15:08:07.8200557Z     node_modules/sidsc-components/styles/material-icons/_core.scss:6:12:
2026-08-19T15:08:07.8200870Z [37m      6 │     @return [32m[37mstr-slice($string, 1, $index - 1) + $replace +
2026-08-19T15:08:07.8201099Z         ╵             [32m^[0m
2026-08-19T15:08:07.8201141Z 
2026-08-19T15:08:07.8201208Z 
2026-08-19T15:08:07.8201385Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-19T15:08:07.8201551Z   Use string.slice instead.
2026-08-19T15:08:07.8201676Z   
2026-08-19T15:08:07.8201884Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-19T15:08:07.8201997Z 
2026-08-19T15:08:07.8202200Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:08:07.8202257Z 
2026-08-19T15:08:07.8202395Z     angular:styles/global:styles:2:8:
2026-08-19T15:08:07.8202633Z [37m      2 │ @import [32m'./node_modules/sidsc-components/styles/main.scss'[37m;
2026-08-19T15:08:07.8202907Z         ╵         [32m~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:08:07.8202972Z 
2026-08-19T15:08:07.8203040Z 
2026-08-19T15:08:07.8203229Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:08:07.8203338Z 
2026-08-19T15:08:07.8203543Z     node_modules/sidsc-components/styles/material-icons/_core.scss:8:8:
2026-08-19T15:08:07.8203749Z [37m      8 │         [32m[37mstr-slice($string, $index + str-length($search)),
2026-08-19T15:08:07.8203936Z         ╵         [32m^[0m
2026-08-19T15:08:07.8204024Z 
2026-08-19T15:08:07.8204061Z 
2026-08-19T15:08:07.8204271Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-19T15:08:07.8204432Z   Use string.slice instead.
2026-08-19T15:08:07.8204527Z   
2026-08-19T15:08:07.8204756Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-19T15:08:07.8204826Z 
2026-08-19T15:08:07.8205016Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:08:07.8205107Z 
2026-08-19T15:08:07.8205209Z     angular:styles/global:styles:2:8:
2026-08-19T15:08:07.8205448Z [37m      2 │ @import [32m'./node_modules/sidsc-components/styles/main.scss'[37m;
2026-08-19T15:08:07.8205696Z         ╵         [32m~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:08:07.8205757Z 
2026-08-19T15:08:07.8205824Z 
2026-08-19T15:08:07.8206076Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:08:07.8206198Z 
2026-08-19T15:08:07.8206491Z     node_modules/sidsc-components/styles/material-icons/_core.scss:8:36:
2026-08-19T15:08:07.8206858Z [37m      8 │         str-slice($string, $index + [32m[37mstr-length($search)),
2026-08-19T15:08:07.8207032Z         ╵                                     [32m^[0m
2026-08-19T15:08:07.8207113Z 
2026-08-19T15:08:07.8207144Z 
2026-08-19T15:08:07.8207357Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-19T15:08:07.8207519Z   Use string.length instead.
2026-08-19T15:08:07.8207656Z   
2026-08-19T15:08:07.8207829Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-19T15:08:07.8207930Z 
2026-08-19T15:08:07.8208114Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:08:07.8208173Z 
2026-08-19T15:08:07.8208310Z     angular:styles/global:styles:2:8:
2026-08-19T15:08:07.8208510Z [37m      2 │ @import [32m'./node_modules/sidsc-components/styles/main.scss'[37m;
2026-08-19T15:08:07.8208771Z         ╵         [32m~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:08:07.8208874Z 
2026-08-19T15:08:07.8208906Z 
2026-08-19T15:08:07.8209130Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:08:07.8209203Z 
2026-08-19T15:08:07.8209429Z     node_modules/sidsc-components/styles/material-icons/_core.scss:17:15:
2026-08-19T15:08:07.8209719Z [37m      17 │   $class-name: [32m[37mto-lower-case($font-family);
2026-08-19T15:08:07.8210000Z          ╵                [32m^[0m
2026-08-19T15:08:07.8210044Z 
2026-08-19T15:08:07.8210076Z 
2026-08-19T15:08:07.8210290Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-19T15:08:07.8210494Z   Use string.to-lower-case instead.
2026-08-19T15:08:07.8210754Z   
2026-08-19T15:08:07.8211064Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-19T15:08:07.8211160Z 
2026-08-19T15:08:07.8211459Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:08:07.8211625Z 
2026-08-19T15:08:07.8211838Z     angular:styles/global:styles:2:8:
2026-08-19T15:08:07.8212141Z [37m      2 │ @import [32m'./node_modules/sidsc-components/styles/main.scss'[37m;
2026-08-19T15:08:07.8212379Z         ╵         [32m~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:08:07.8212454Z 
2026-08-19T15:08:07.8212486Z 
2026-08-19T15:08:07.8212710Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:08:07.8212784Z 
2026-08-19T15:08:07.8212912Z     src/styles.scss:5:8:
2026-08-19T15:08:07.8213182Z [37m      5 │ @import [32m[37m"../node_modules/bootstrap/scss/bootstrap.scss";
2026-08-19T15:08:07.8213381Z         ╵         [32m^[0m
2026-08-19T15:08:07.8213423Z 
2026-08-19T15:08:07.8213454Z 
2026-08-19T15:08:07.8213607Z   Sass @import rules are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-19T15:08:07.8213755Z   
2026-08-19T15:08:07.8213961Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-19T15:08:07.8214027Z 
2026-08-19T15:08:07.8214215Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:08:07.8214272Z 
2026-08-19T15:08:07.8214407Z     angular:styles/global:styles:1:8:
2026-08-19T15:08:07.8214612Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:08:07.8214842Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:08:07.8214892Z 
2026-08-19T15:08:07.8214971Z 
2026-08-19T15:08:07.8215162Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:08:07.8215271Z 
2026-08-19T15:08:07.8215394Z     src/styles.scss:8:8:
2026-08-19T15:08:07.8215562Z [37m      8 │ @import [32m[37m"../public/fonts/fonts.scss";
2026-08-19T15:08:07.8215742Z         ╵         [32m^[0m
2026-08-19T15:08:07.8215782Z 
2026-08-19T15:08:07.8215854Z 
2026-08-19T15:08:07.8215994Z   Sass @import rules are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-19T15:08:07.8216100Z   
2026-08-19T15:08:07.8216311Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-19T15:08:07.8216440Z 
2026-08-19T15:08:07.8216591Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:08:07.8216709Z 
2026-08-19T15:08:07.8216910Z     angular:styles/global:styles:1:8:
2026-08-19T15:08:07.8217166Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:08:07.8217452Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:08:07.8217566Z 
2026-08-19T15:08:07.8217599Z 
2026-08-19T15:08:07.8217872Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:08:07.8217947Z 
2026-08-19T15:08:07.8218078Z     src/styles.scss:9:8:
2026-08-19T15:08:07.8218291Z [37m      9 │ @import [32m[37m"../public/fonts/fonts-icons.scss";
2026-08-19T15:08:07.8218442Z         ╵         [32m^[0m
2026-08-19T15:08:07.8218566Z 
2026-08-19T15:08:07.8218597Z 
2026-08-19T15:08:07.8218743Z   Sass @import rules are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-19T15:08:07.8218891Z   
2026-08-19T15:08:07.8219097Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-19T15:08:07.8219161Z 
2026-08-19T15:08:07.8219349Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:08:07.8219410Z 
2026-08-19T15:08:07.8219608Z     angular:styles/global:styles:1:8:
2026-08-19T15:08:07.8219815Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:08:07.8219977Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:08:07.8220079Z 
2026-08-19T15:08:07.8220110Z 
2026-08-19T15:08:07.8220436Z [31m✘ [41;31m[[41;97mERROR[41;31m][0m [1mCannot destructure property 'pos' of 'file.referencedFiles[index]' as it is undefined.[0m [1m[35m[plugin angular-compiler][0m
2026-08-19T15:08:07.8220548Z 
2026-08-19T15:08:07.8220801Z     node_modules/typescript/lib/typescript.js:125702:9:
2026-08-19T15:08:07.8221111Z [37m      125702 │       ({ [32m[37mpos, end } = file.referencedFiles[index]);
2026-08-19T15:08:07.8221464Z              ╵          [32m^[0m
2026-08-19T15:08:07.8221527Z 
2026-08-19T15:08:07.8221888Z     at getReferencedFileLocation (/opt/ads-agent/_work/17/s/node_modules/typescript/lib/typescript.js:125702:10)
2026-08-19T15:08:07.8222276Z     at fileIncludeReasonToDiagnostics (/opt/ads-agent/_work/17/s/node_modules/typescript/lib/typescript.js:132571:31)
2026-08-19T15:08:07.8222686Z     at processReason (/opt/ads-agent/_work/17/s/node_modules/typescript/lib/typescript.js:129136:62)
2026-08-19T15:08:07.8222873Z     at Array.forEach (<anonymous>)
2026-08-19T15:08:07.8223111Z     at createDiagnosticExplainingFile (/opt/ads-agent/_work/17/s/node_modules/typescript/lib/typescript.js:129088:42)
2026-08-19T15:08:07.8223469Z     at /opt/ads-agent/_work/17/s/node_modules/typescript/lib/typescript.js:129021:15
2026-08-19T15:08:07.8223640Z     at Array.forEach (<anonymous>)
2026-08-19T15:08:07.8223902Z     at Object.getCombinedDiagnostics (/opt/ads-agent/_work/17/s/node_modules/typescript/lib/typescript.js:129017:78)
2026-08-19T15:08:07.8224209Z     at getProgramDiagnostics (/opt/ads-agent/_work/17/s/node_modules/typescript/lib/typescript.js:126966:57)
2026-08-19T15:08:07.8224503Z     at getSemanticDiagnosticsForFile (/opt/ads-agent/_work/17/s/node_modules/typescript/lib/typescript.js:126997:7)
2026-08-19T15:08:07.8224591Z 
2026-08-19T15:08:07.8224751Z   This error came from the "onStart" callback registered here:
2026-08-19T15:08:07.8224812Z 
2026-08-19T15:08:07.8225030Z     node_modules/@angular/build/src/tools/esbuild/angular/compiler-plugin.js:118:18:
2026-08-19T15:08:07.8225271Z [37m      118 │             build.[32monStart[37m(async () => {
2026-08-19T15:08:07.8225492Z           ╵                   [32m~~~~~~~[0m
2026-08-19T15:08:07.8225539Z 
2026-08-19T15:08:07.8225790Z     at setup (/opt/ads-agent/_work/17/s/node_modules/@angular/build/src/tools/esbuild/angular/compiler-plugin.js:118:19)
2026-08-19T15:08:07.8226125Z     at async handlePlugins (/opt/ads-agent/_work/17/s/node_modules/esbuild/lib/main.js:1181:20)
2026-08-19T15:08:07.8226248Z 
2026-08-19T15:08:07.8226279Z 
2026-08-19T15:08:08.0683718Z ##[error]Bash exited with code '1'.
2026-08-19T15:08:08.0693534Z ##[section]Finishing: Build Application



<img width="1654" height="901" alt="image" src="https://github.com/user-attachments/assets/ee91d8a4-d991-41e3-8d11-f6e70bebd94d" />


{
  "name": "sisam-web",
  "version": "3.0.0.1",
  "lockfileVersion": 3,
  "requires": true,
  "packages": {
    "": {
      "name": "sisam-web",
      "version": "3.0.0.1",
      "dependencies": {
        "@angular/animations": "^19.2.0",
        "@angular/cdk": "^19.0.0",
        "@angular/common": "^19.2.0",
        "@angular/compiler": "^19.2.0",
        "@angular/core": "^19.2.0",
        "@angular/forms": "^19.2.0",
        "@angular/material": "^19.2.19",
        "@angular/material-moment-adapter": "^19.2.19",
        "@angular/platform-browser": "^19.2.0",
        "@angular/platform-browser-dynamic": "^19.2.0",
        "@angular/platform-server": "^19.2.0",
        "@angular/router": "^19.2.0",
        "@ng-bootstrap/ng-bootstrap": "^18.0.0",
        "bootstrap": "^5.3.3",
        "keycloak-angular": "^19.0.2",
        "keycloak-js": "^26.2.2",
        "marked": "^15.0.12",
        "moment": "^2.30.1",
        "ngx-currency": "^19.0.0",
        "ngx-extended-pdf-viewer": "^28.0.2",
        "ngx-markdown": "^19.1.1",
        "ngx-mask": "^19.0.6",
        "ngx-quill": "^27.1.2",
        "prismjs": "^1.30.0",
        "quill": "^2.0.3",
        "rxjs": "~7.8.0",
        "sidsc-components": "~19.0.1",
        "tslib": "^2.8.1",
        "zone.js": "~0.15.0"
      },
      "devDependencies": {
        "@angular-devkit/build-angular": "^19.2.15",
        "@angular/build": "^19.2.15",
        "@angular/cli": "^19.2.15",
        "@angular/compiler-cli": "^19.2.0",
        "@types/jest": "^29.5.14",
        "@types/node": "^18.18.0",
        "jest": "^29.7.0",
        "jest-environment-jsdom": "^29.7.0",
        "jest-preset-angular": "^14.6.2",
        "jest-sonar": "^0.2.16",
        "typescript": "~5.8.2"
      }
    },
    "node_modules/@ampproject/remapping": {
      "version": "2.3.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@ampproject/remapping/-/remapping-2.3.0.tgz",
      "integrity": "sha512-30iZtAPgz+LTIYoeivqYo853f02jBYSd5uGnGpkFV0M3xOt9aN73erkgYAmZU43x4VfqcnLxW9Kpg3R5LC4YYw==",
      "license": "Apache-2.0",
      "dependencies": {
        "@jridgewell/gen-mapping": "^0.3.5",
        "@jridgewell/trace-mapping": "^0.3.24"
      },
      "engines": {
        "node": ">=6.0.0"
      }
    },
    "node_modules/@angular-devkit/architect": {
      "version": "0.1902.23",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@angular-devkit/architect/-/architect-0.1902.23.tgz",
      "integrity": "sha512-P1qFNzIYR0Yr5FGbG961rdYcKh9A2HRUw7WzZlXWqZ7N6wHi2f+QkW/lwZcbYGceWrJuQrOsx61lNA0A56Kyyw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@angular-devkit/core": "19.2.23",
        "rxjs": "7.8.1"
      },
      "engines": {
        "node": "^18.19.1 || ^20.11.1 || >=22.0.0",
        "npm": "^6.11.0 || ^7.5.6 || >=8.0.0",
        "yarn": ">= 1.13.0"
      }
    },
    "node_modules/@angular-devkit/architect/node_modules/rxjs": {
      "version": "7.8.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/rxjs/-/rxjs-7.8.1.tgz",
      "integrity": "sha512-AA3TVj+0A2iuIoQkWEK/tqFjBq2j+6PO6Y0zJcvzLAFhEFIO3HL0vls9hWLncZbAAbK0mar7oZ4V079I/qPMxg==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "tslib": "^2.1.0"
      }
    },
    "node_modules/@angular-devkit/build-angular": {
      "version": "19.2.23",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@angular-devkit/build-angular/-/build-angular-19.2.23.tgz",
      "integrity": "sha512-LM2VmANAOCVeTavhLjdAMMx7oZnqozE4GqWSxxaXAO6XkcW/2F5kCZa7WrM5aYM0ciopz0SV+o82t2ns3hkcmA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@ampproject/remapping": "2.3.0",
        "@angular-devkit/architect": "0.1902.23",
        "@angular-devkit/build-webpack": "0.1902.23",
        "@angular-devkit/core": "19.2.23",
        "@angular/build": "19.2.23",
        "@babel/core": "7.26.10",
        "@babel/generator": "7.26.10",
        "@babel/helper-annotate-as-pure": "7.25.9",
        "@babel/helper-split-export-declaration": "7.24.7",
        "@babel/plugin-transform-async-generator-functions": "7.26.8",
        "@babel/plugin-transform-async-to-generator": "7.25.9",
        "@babel/plugin-transform-runtime": "7.26.10",
        "@babel/preset-env": "7.26.9",
        "@babel/runtime": "7.26.10",
        "@discoveryjs/json-ext": "0.6.3",
        "@ngtools/webpack": "19.2.23",
        "@vitejs/plugin-basic-ssl": "1.2.0",
        "ansi-colors": "4.1.3",
        "autoprefixer": "10.4.20",
        "babel-loader": "9.2.1",
        "browserslist": "^4.21.5",
        "copy-webpack-plugin": "12.0.2",
        "css-loader": "7.1.2",
        "esbuild-wasm": "0.25.4",
        "fast-glob": "3.3.3",
        "http-proxy-middleware": "3.0.5",
        "istanbul-lib-instrument": "6.0.3",
        "jsonc-parser": "3.3.1",
        "karma-source-map-support": "1.4.0",
        "less": "4.2.2",
        "less-loader": "12.2.0",
        "license-webpack-plugin": "4.0.2",
        "loader-utils": "3.3.1",
        "mini-css-extract-plugin": "2.9.2",
        "open": "10.1.0",
        "ora": "5.4.1",
        "picomatch": "4.0.4",
        "piscina": "4.8.0",
        "postcss": "8.5.2",
        "postcss-loader": "8.1.1",
        "resolve-url-loader": "5.0.0",
        "rxjs": "7.8.1",
        "sass": "1.85.0",
        "sass-loader": "16.0.5",
        "semver": "7.7.1",
        "source-map-loader": "5.0.0",
        "source-map-support": "0.5.21",
        "terser": "5.39.0",
        "tree-kill": "1.2.2",
        "tslib": "2.8.1",
        "webpack": "5.105.0",
        "webpack-dev-middleware": "7.4.2",
        "webpack-dev-server": "5.2.2",
        "webpack-merge": "6.0.1",
        "webpack-subresource-integrity": "5.1.0"
      },
      "engines": {
        "node": "^18.19.1 || ^20.11.1 || >=22.0.0",
        "npm": "^6.11.0 || ^7.5.6 || >=8.0.0",
        "yarn": ">= 1.13.0"
      },
      "optionalDependencies": {
        "esbuild": "0.25.4"
      },
      "peerDependencies": {
        "@angular/compiler-cli": "^19.0.0 || ^19.2.0-next.0",
        "@angular/localize": "^19.0.0 || ^19.2.0-next.0",
        "@angular/platform-server": "^19.0.0 || ^19.2.0-next.0",
        "@angular/service-worker": "^19.0.0 || ^19.2.0-next.0",
        "@angular/ssr": "^19.2.23",
        "@web/test-runner": "^0.20.0",
        "browser-sync": "^3.0.2",
        "jest": "^29.5.0",
        "jest-environment-jsdom": "^29.5.0",
        "karma": "^6.3.0",
        "ng-packagr": "^19.0.0 || ^19.2.0-next.0",
        "protractor": "^7.0.0",
        "tailwindcss": "^2.0.0 || ^3.0.0 || ^4.0.0",
        "typescript": ">=5.5 <5.9"
      },
      "peerDependenciesMeta": {
        "@angular/localize": {
          "optional": true
        },
        "@angular/platform-server": {
          "optional": true
        },
        "@angular/service-worker": {
          "optional": true
        },
        "@angular/ssr": {
          "optional": true
        },
        "@web/test-runner": {
          "optional": true
        },
        "browser-sync": {
          "optional": true
        },
        "jest": {
          "optional": true
        },
        "jest-environment-jsdom": {
          "optional": true
        },
        "karma": {
          "optional": true
        },
        "ng-packagr": {
          "optional": true
        },
        "protractor": {
          "optional": true
        },
        "tailwindcss": {
          "optional": true
        }
      }
    },
    "node_modules/@angular-devkit/build-angular/node_modules/rxjs": {
      "version": "7.8.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/rxjs/-/rxjs-7.8.1.tgz",
      "integrity": "sha512-AA3TVj+0A2iuIoQkWEK/tqFjBq2j+6PO6Y0zJcvzLAFhEFIO3HL0vls9hWLncZbAAbK0mar7oZ4V079I/qPMxg==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "tslib": "^2.1.0"
      }
    },
    "node_modules/@angular-devkit/build-webpack": {
      "version": "0.1902.23",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@angular-devkit/build-webpack/-/build-webpack-0.1902.23.tgz",
      "integrity": "sha512-EGZQcgnAg4JCsYhi9HNkoTMS46V6IabN4e2s0lsO53E8qcrp17KueGW5L24LdId6Fkp5JfzofMHxAQGcuIGheA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@angular-devkit/architect": "0.1902.23",
        "rxjs": "7.8.1"
      },
      "engines": {
        "node": "^18.19.1 || ^20.11.1 || >=22.0.0",
        "npm": "^6.11.0 || ^7.5.6 || >=8.0.0",
        "yarn": ">= 1.13.0"
      },
      "peerDependencies": {
        "webpack": "^5.30.0",
        "webpack-dev-server": "^5.0.2"
      }
    },
    "node_modules/@angular-devkit/build-webpack/node_modules/rxjs": {
      "version": "7.8.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/rxjs/-/rxjs-7.8.1.tgz",
      "integrity": "sha512-AA3TVj+0A2iuIoQkWEK/tqFjBq2j+6PO6Y0zJcvzLAFhEFIO3HL0vls9hWLncZbAAbK0mar7oZ4V079I/qPMxg==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "tslib": "^2.1.0"
      }
    },
    "node_modules/@angular-devkit/core": {
      "version": "19.2.23",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@angular-devkit/core/-/core-19.2.23.tgz",
      "integrity": "sha512-RazHPQkUEsNU/OZ75w9UeHxGFMthRiuAW2B/uA7eXExBj/1meHrrBfoCA56ujW2GUxVjRtSrMjylKh4R4meiYA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "ajv": "8.18.0",
        "ajv-formats": "3.0.1",
        "jsonc-parser": "3.3.1",
        "picomatch": "4.0.4",
        "rxjs": "7.8.1",
        "source-map": "0.7.4"
      },
      "engines": {
        "node": "^18.19.1 || ^20.11.1 || >=22.0.0",
        "npm": "^6.11.0 || ^7.5.6 || >=8.0.0",
        "yarn": ">= 1.13.0"
      },
      "peerDependencies": {
        "chokidar": "^4.0.0"
      },
      "peerDependenciesMeta": {
        "chokidar": {
          "optional": true
        }
      }
    },
    "node_modules/@angular-devkit/core/node_modules/rxjs": {
      "version": "7.8.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/rxjs/-/rxjs-7.8.1.tgz",
      "integrity": "sha512-AA3TVj+0A2iuIoQkWEK/tqFjBq2j+6PO6Y0zJcvzLAFhEFIO3HL0vls9hWLncZbAAbK0mar7oZ4V079I/qPMxg==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "tslib": "^2.1.0"
      }
    },
    "node_modules/@angular-devkit/schematics": {
      "version": "19.2.23",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@angular-devkit/schematics/-/schematics-19.2.23.tgz",
      "integrity": "sha512-Jzs7YM4X6azmHU7Mw5tQSPMuvaqYS8SLnZOJbtiXCy1JyuW9bm/WBBecNHMiuZ8LHXKhvQ6AVX1tKrzF6uiDmw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@angular-devkit/core": "19.2.23",
        "jsonc-parser": "3.3.1",
        "magic-string": "0.30.17",
        "ora": "5.4.1",
        "rxjs": "7.8.1"
      },
      "engines": {
        "node": "^18.19.1 || ^20.11.1 || >=22.0.0",
        "npm": "^6.11.0 || ^7.5.6 || >=8.0.0",
        "yarn": ">= 1.13.0"
      }
    },
    "node_modules/@angular-devkit/schematics/node_modules/rxjs": {
      "version": "7.8.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/rxjs/-/rxjs-7.8.1.tgz",
      "integrity": "sha512-AA3TVj+0A2iuIoQkWEK/tqFjBq2j+6PO6Y0zJcvzLAFhEFIO3HL0vls9hWLncZbAAbK0mar7oZ4V079I/qPMxg==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "tslib": "^2.1.0"
      }
    },
    "node_modules/@angular/animations": {
      "version": "19.2.20",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@angular/animations/-/animations-19.2.20.tgz",
      "integrity": "sha512-TQ4OCazTRAge45FIp3bzO/chImObmasPzprgEzKSDckjGbshAWlYXeCe3U8YaGNaWnkzByyIRNV4P4aHe63M0w==",
      "license": "MIT",
      "dependencies": {
        "tslib": "^2.3.0"
      },
      "engines": {
        "node": "^18.19.1 || ^20.11.1 || >=22.0.0"
      },
      "peerDependencies": {
        "@angular/common": "19.2.20",
        "@angular/core": "19.2.20"
      }
    },
    "node_modules/@angular/build": {
      "version": "19.2.23",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@angular/build/-/build-19.2.23.tgz",
      "integrity": "sha512-AyE1MHHiDYpvCzRRRwrJwInyWa4eKu3hH0f2lOe0YfAcOIGwARBnc4vyLjR35DEpL/dZMciGPvaFXTxkaKVYQg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@ampproject/remapping": "2.3.0",
        "@angular-devkit/architect": "0.1902.23",
        "@babel/core": "7.26.10",
        "@babel/helper-annotate-as-pure": "7.25.9",
        "@babel/helper-split-export-declaration": "7.24.7",
        "@babel/plugin-syntax-import-attributes": "7.26.0",
        "@inquirer/confirm": "5.1.6",
        "@vitejs/plugin-basic-ssl": "1.2.0",
        "beasties": "0.3.2",
        "browserslist": "^4.23.0",
        "esbuild": "0.25.4",
        "fast-glob": "3.3.3",
        "https-proxy-agent": "7.0.6",
        "istanbul-lib-instrument": "6.0.3",
        "listr2": "8.2.5",
        "magic-string": "0.30.17",
        "mrmime": "2.0.1",
        "parse5-html-rewriting-stream": "7.0.0",
        "picomatch": "4.0.4",
        "piscina": "4.8.0",
        "rollup": "4.59.0",
        "sass": "1.85.0",
        "semver": "7.7.1",
        "source-map-support": "0.5.21",
        "vite": "6.4.1",
        "watchpack": "2.4.2"
      },
      "engines": {
        "node": "^18.19.1 || ^20.11.1 || >=22.0.0",
        "npm": "^6.11.0 || ^7.5.6 || >=8.0.0",
        "yarn": ">= 1.13.0"
      },
      "optionalDependencies": {
        "lmdb": "3.2.6"
      },
      "peerDependencies": {
        "@angular/compiler": "^19.0.0 || ^19.2.0-next.0",
        "@angular/compiler-cli": "^19.0.0 || ^19.2.0-next.0",
        "@angular/localize": "^19.0.0 || ^19.2.0-next.0",
        "@angular/platform-server": "^19.0.0 || ^19.2.0-next.0",
        "@angular/service-worker": "^19.0.0 || ^19.2.0-next.0",
        "@angular/ssr": "^19.2.23",
        "karma": "^6.4.0",
        "less": "^4.2.0",
        "ng-packagr": "^19.0.0 || ^19.2.0-next.0",
        "postcss": "^8.4.0",
        "tailwindcss": "^2.0.0 || ^3.0.0 || ^4.0.0",
        "typescript": ">=5.5 <5.9"
      },
      "peerDependenciesMeta": {
        "@angular/localize": {
          "optional": true
        },
        "@angular/platform-server": {
          "optional": true
        },
        "@angular/service-worker": {
          "optional": true
        },
        "@angular/ssr": {
          "optional": true
        },
        "karma": {
          "optional": true
        },
        "less": {
          "optional": true
        },
        "ng-packagr": {
          "optional": true
        },
        "postcss": {
          "optional": true
        },
        "tailwindcss": {
          "optional": true
        }
      }
    },
    "node_modules/@angular/cdk": {
      "version": "19.2.19",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@angular/cdk/-/cdk-19.2.19.tgz",
      "integrity": "sha512-PCpJagurPBqciqcq4Z8+3OtKLb7rSl4w/qBJoIMua8CgnrjvA1i+SWawhdtfI1zlY8FSwhzLwXV0CmWWfFzQPg==",
      "license": "MIT",
      "dependencies": {
        "parse5": "^7.1.2",
        "tslib": "^2.3.0"
      },
      "peerDependencies": {
        "@angular/common": "^19.0.0 || ^20.0.0",
        "@angular/core": "^19.0.0 || ^20.0.0",
        "rxjs": "^6.5.3 || ^7.4.0"
      }
    },
    "node_modules/@angular/cli": {
      "version": "19.2.23",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@angular/cli/-/cli-19.2.23.tgz",
      "integrity": "sha512-EZcayMLMmDF1IAfny8YIqvuAJJhyFdTVVsWea+4MNpkyVs2Sc7tsl7yFyckjJU7RVhdqYuSZSVqn5PHeSe5Pxw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@angular-devkit/architect": "0.1902.23",
        "@angular-devkit/core": "19.2.23",
        "@angular-devkit/schematics": "19.2.23",
        "@inquirer/prompts": "7.3.2",
        "@listr2/prompt-adapter-inquirer": "2.0.18",
        "@schematics/angular": "19.2.23",
        "@yarnpkg/lockfile": "1.1.0",
        "ini": "5.0.0",
        "jsonc-parser": "3.3.1",
        "listr2": "8.2.5",
        "npm-package-arg": "12.0.2",
        "npm-pick-manifest": "10.0.0",
        "pacote": "20.0.0",
        "resolve": "1.22.10",
        "semver": "7.7.1",
        "symbol-observable": "4.0.0",
        "yargs": "17.7.2"
      },
      "bin": {
        "ng": "bin/ng.js"
      },
      "engines": {
        "node": "^18.19.1 || ^20.11.1 || >=22.0.0",
        "npm": "^6.11.0 || ^7.5.6 || >=8.0.0",
        "yarn": ">= 1.13.0"
      }
    },
    "node_modules/@angular/common": {
      "version": "19.2.20",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@angular/common/-/common-19.2.20.tgz",
      "integrity": "sha512-1M3W3FjUUbVKXDMs+yQpBhnkD/pCe0Jn79rPE5W+EGWWxFoLSyGX+fhnRO5m4c9k66p3nvYrikWQ0ZzMv3M5tw==",
      "license": "MIT",
      "dependencies": {
        "tslib": "^2.3.0"
      },
      "engines": {
        "node": "^18.19.1 || ^20.11.1 || >=22.0.0"
      },
      "peerDependencies": {
        "@angular/core": "19.2.20",
        "rxjs": "^6.5.3 || ^7.4.0"
      }
    },
    "node_modules/@angular/compiler": {
      "version": "19.2.20",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@angular/compiler/-/compiler-19.2.20.tgz",
      "integrity": "sha512-LvjE8W58EACgTFaAoqmNe7FRsbvoQ0GvCB/rmm6AEMWx/0W/JBvWkQTrOQlwpoeYOHcMZRGdmPcZoUDwU3JySQ==",
      "license": "MIT",
      "dependencies": {
        "tslib": "^2.3.0"
      },
      "engines": {
        "node": "^18.19.1 || ^20.11.1 || >=22.0.0"
      }
    },
    "node_modules/@angular/compiler-cli": {
      "version": "19.2.20",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@angular/compiler-cli/-/compiler-cli-19.2.20.tgz",
      "integrity": "sha512-tYYQk8AUz2sEkVl0a3uebduDUXPuKiGEKl2Jryrbn0xh9i1EsxoCjt1VvHnGnksGp3mz4DQihFVEnte0KeVQ5g==",
      "license": "MIT",
      "dependencies": {
        "@babel/core": "7.26.9",
        "@jridgewell/sourcemap-codec": "^1.4.14",
        "chokidar": "^4.0.0",
        "convert-source-map": "^1.5.1",
        "reflect-metadata": "^0.2.0",
        "semver": "^7.0.0",
        "tslib": "^2.3.0",
        "yargs": "^17.2.1"
      },
      "bin": {
        "ng-xi18n": "bundles/src/bin/ng_xi18n.js",
        "ngc": "bundles/src/bin/ngc.js",
        "ngcc": "bundles/ngcc/index.js"
      },
      "engines": {
        "node": "^18.19.1 || ^20.11.1 || >=22.0.0"
      },
      "peerDependencies": {
        "@angular/compiler": "19.2.20",
        "typescript": ">=5.5 <5.9"
      }
    },
    "node_modules/@angular/compiler-cli/node_modules/@babel/core": {
      "version": "7.26.9",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/core/-/core-7.26.9.tgz",
      "integrity": "sha512-lWBYIrF7qK5+GjY5Uy+/hEgp8OJWOD/rpy74GplYRhEauvbHDeFB8t5hPOZxCZ0Oxf4Cc36tK51/l3ymJysrKw==",
      "license": "MIT",
      "dependencies": {
        "@ampproject/remapping": "^2.2.0",
        "@babel/code-frame": "^7.26.2",
        "@babel/generator": "^7.26.9",
        "@babel/helper-compilation-targets": "^7.26.5",
        "@babel/helper-module-transforms": "^7.26.0",
        "@babel/helpers": "^7.26.9",
        "@babel/parser": "^7.26.9",
        "@babel/template": "^7.26.9",
        "@babel/traverse": "^7.26.9",
        "@babel/types": "^7.26.9",
        "convert-source-map": "^2.0.0",
        "debug": "^4.1.0",
        "gensync": "^1.0.0-beta.2",
        "json5": "^2.2.3",
        "semver": "^6.3.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/babel"
      }
    },
    "node_modules/@angular/compiler-cli/node_modules/@babel/core/node_modules/convert-source-map": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/convert-source-map/-/convert-source-map-2.0.0.tgz",
      "integrity": "sha512-Kvp459HrV2FEJ1CAsi1Ku+MY3kasH19TFykTz2xWmMeq6bk2NU3XXvfJ+Q61m0xktWwt+1HSYf3JZsTms3aRJg==",
      "license": "MIT"
    },
    "node_modules/@angular/compiler-cli/node_modules/@babel/core/node_modules/semver": {
      "version": "6.3.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/semver/-/semver-6.3.1.tgz",
      "integrity": "sha512-BR7VvDCVHO+q2xBEWskxS6DJE1qRnb7DxzUrogb71CWoSficBxYsiAGd+Kl0mmq/MprG9yArRkyrQxTO6XjMzA==",
      "license": "ISC",
      "bin": {
        "semver": "bin/semver.js"
      }
    },
    "node_modules/@angular/core": {
      "version": "19.2.20",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@angular/core/-/core-19.2.20.tgz",
      "integrity": "sha512-pxzQh8ouqfE57lJlXjIzXFuRETwkfMVwS+NFCfv2yh01Qtx+vymO8ZClcJMgLPfBYinhBYX+hrRYVSa1nzlkRQ==",
      "license": "MIT",
      "dependencies": {
        "tslib": "^2.3.0"
      },
      "engines": {
        "node": "^18.19.1 || ^20.11.1 || >=22.0.0"
      },
      "peerDependencies": {
        "rxjs": "^6.5.3 || ^7.4.0",
        "zone.js": "~0.15.0"
      }
    },
    "node_modules/@angular/forms": {
      "version": "19.2.20",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@angular/forms/-/forms-19.2.20.tgz",
      "integrity": "sha512-agi7InbMzop1jrud6L7SlNwnZk3iNolORcFIwBQMvKxLkcJ+ttbSYuM0KAw56IundWHf4dL9GP4cSygm4kUeFA==",
      "license": "MIT",
      "dependencies": {
        "tslib": "^2.3.0"
      },
      "engines": {
        "node": "^18.19.1 || ^20.11.1 || >=22.0.0"
      },
      "peerDependencies": {
        "@angular/common": "19.2.20",
        "@angular/core": "19.2.20",
        "@angular/platform-browser": "19.2.20",
        "rxjs": "^6.5.3 || ^7.4.0"
      }
    },
    "node_modules/@angular/localize": {
      "version": "19.2.20",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@angular/localize/-/localize-19.2.20.tgz",
      "integrity": "sha512-jIhEzRc1fC/4XS55VcvjTIBSkz005ingHVdSrJYBVQFHO6aQZFE2gcpmaqFwYWsNeG3s0pTre4kIFm/4SiP7Pw==",
      "license": "MIT",
      "peer": true,
      "dependencies": {
        "@babel/core": "7.26.9",
        "@types/babel__core": "7.20.5",
        "fast-glob": "3.3.3",
        "yargs": "^17.2.1"
      },
      "bin": {
        "localize-extract": "tools/bundles/src/extract/cli.js",
        "localize-migrate": "tools/bundles/src/migrate/cli.js",
        "localize-translate": "tools/bundles/src/translate/cli.js"
      },
      "engines": {
        "node": "^18.19.1 || ^20.11.1 || >=22.0.0"
      },
      "peerDependencies": {
        "@angular/compiler": "19.2.20",
        "@angular/compiler-cli": "19.2.20"
      }
    },
    "node_modules/@angular/localize/node_modules/@babel/core": {
      "version": "7.26.9",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/core/-/core-7.26.9.tgz",
      "integrity": "sha512-lWBYIrF7qK5+GjY5Uy+/hEgp8OJWOD/rpy74GplYRhEauvbHDeFB8t5hPOZxCZ0Oxf4Cc36tK51/l3ymJysrKw==",
      "license": "MIT",
      "peer": true,
      "dependencies": {
        "@ampproject/remapping": "^2.2.0",
        "@babel/code-frame": "^7.26.2",
        "@babel/generator": "^7.26.9",
        "@babel/helper-compilation-targets": "^7.26.5",
        "@babel/helper-module-transforms": "^7.26.0",
        "@babel/helpers": "^7.26.9",
        "@babel/parser": "^7.26.9",
        "@babel/template": "^7.26.9",
        "@babel/traverse": "^7.26.9",
        "@babel/types": "^7.26.9",
        "convert-source-map": "^2.0.0",
        "debug": "^4.1.0",
        "gensync": "^1.0.0-beta.2",
        "json5": "^2.2.3",
        "semver": "^6.3.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/babel"
      }
    },
    "node_modules/@angular/localize/node_modules/convert-source-map": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/convert-source-map/-/convert-source-map-2.0.0.tgz",
      "integrity": "sha512-Kvp459HrV2FEJ1CAsi1Ku+MY3kasH19TFykTz2xWmMeq6bk2NU3XXvfJ+Q61m0xktWwt+1HSYf3JZsTms3aRJg==",
      "license": "MIT",
      "peer": true
    },
    "node_modules/@angular/localize/node_modules/semver": {
      "version": "6.3.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/semver/-/semver-6.3.1.tgz",
      "integrity": "sha512-BR7VvDCVHO+q2xBEWskxS6DJE1qRnb7DxzUrogb71CWoSficBxYsiAGd+Kl0mmq/MprG9yArRkyrQxTO6XjMzA==",
      "license": "ISC",
      "peer": true,
      "bin": {
        "semver": "bin/semver.js"
      }
    },
    "node_modules/@angular/material": {
      "version": "19.2.19",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@angular/material/-/material-19.2.19.tgz",
      "integrity": "sha512-auIE6JUzTIA3LyYklh9J/T7u64crmphxUBgAa0zcOMDog6SYfwbNe9YeLQqua5ek4OUAOdK/BHHfVl5W5iaUoQ==",
      "license": "MIT",
      "dependencies": {
        "tslib": "^2.3.0"
      },
      "peerDependencies": {
        "@angular/cdk": "19.2.19",
        "@angular/common": "^19.0.0 || ^20.0.0",
        "@angular/core": "^19.0.0 || ^20.0.0",
        "@angular/forms": "^19.0.0 || ^20.0.0",
        "@angular/platform-browser": "^19.0.0 || ^20.0.0",
        "rxjs": "^6.5.3 || ^7.4.0"
      }
    },
    "node_modules/@angular/material-date-fns-adapter": {
      "version": "19.2.19",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@angular/material-date-fns-adapter/-/material-date-fns-adapter-19.2.19.tgz",
      "integrity": "sha512-So+jptG1uhLhdSA1NuCkbfPl5tf/PRJVdfSn/9R2HzmjZSV65RuvhwDvFK9CV/Zhj9s9h7rXyn7V5GtThjznGw==",
      "license": "MIT",
      "peer": true,
      "dependencies": {
        "tslib": "^2.3.0"
      },
      "peerDependencies": {
        "@angular/core": "^19.0.0 || ^20.0.0",
        "@angular/material": "19.2.19",
        "date-fns": ">2.20.0 <5.0"
      }
    },
    "node_modules/@angular/material-moment-adapter": {
      "version": "19.2.19",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@angular/material-moment-adapter/-/material-moment-adapter-19.2.19.tgz",
      "integrity": "sha512-yL7ES1HgtEW5D3iOkio/PD/UwBgXuyNDkxBdcrRYih+8ihhbaU6rBzCT5juUujjmRtt8Aj+3M80PSq5dlsingA==",
      "license": "MIT",
      "dependencies": {
        "tslib": "^2.3.0"
      },
      "peerDependencies": {
        "@angular/core": "^19.0.0 || ^20.0.0",
        "@angular/material": "19.2.19",
        "moment": "^2.18.1"
      }
    },
    "node_modules/@angular/platform-browser": {
      "version": "19.2.20",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@angular/platform-browser/-/platform-browser-19.2.20.tgz",
      "integrity": "sha512-O9ZoQKILPC1T2c64OASS75XlOLBxY81m5AAgsBKhwiFWq+V28RsO0cnwpi1YSh/z4ryH8Fe7IUFz8jGrsJi3hQ==",
      "license": "MIT",
      "dependencies": {
        "tslib": "^2.3.0"
      },
      "engines": {
        "node": "^18.19.1 || ^20.11.1 || >=22.0.0"
      },
      "peerDependencies": {
        "@angular/animations": "19.2.20",
        "@angular/common": "19.2.20",
        "@angular/core": "19.2.20"
      },
      "peerDependenciesMeta": {
        "@angular/animations": {
          "optional": true
        }
      }
    },
    "node_modules/@angular/platform-browser-dynamic": {
      "version": "19.2.20",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@angular/platform-browser-dynamic/-/platform-browser-dynamic-19.2.20.tgz",
      "integrity": "sha512-bNuykQy/MrDeARqvDPf6bqx+m1Qqanep7FhDy9QYWxfqz7D++/phqT9l8Ubj88juFCSDfR5ktUWdpnDz3/BCfA==",
      "license": "MIT",
      "dependencies": {
        "tslib": "^2.3.0"
      },
      "engines": {
        "node": "^18.19.1 || ^20.11.1 || >=22.0.0"
      },
      "peerDependencies": {
        "@angular/common": "19.2.20",
        "@angular/compiler": "19.2.20",
        "@angular/core": "19.2.20",
        "@angular/platform-browser": "19.2.20"
      }
    },
    "node_modules/@angular/platform-server": {
      "version": "19.2.20",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@angular/platform-server/-/platform-server-19.2.20.tgz",
      "integrity": "sha512-fNiHhqJpKaYd4ABj/qMob2Re4zqXFKOIfV/wsgBL0QPX5bfjp9+sJQ8I39/zHuZtrqDGazW6MuTkOgSoUWGLYQ==",
      "license": "MIT",
      "dependencies": {
        "tslib": "^2.3.0",
        "xhr2": "^0.2.0"
      },
      "engines": {
        "node": "^18.19.1 || ^20.11.1 || >=22.0.0"
      },
      "peerDependencies": {
        "@angular/common": "19.2.20",
        "@angular/compiler": "19.2.20",
        "@angular/core": "19.2.20",
        "@angular/platform-browser": "19.2.20",
        "rxjs": "^6.5.3 || ^7.4.0"
      }
    },
    "node_modules/@angular/router": {
      "version": "19.2.20",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@angular/router/-/router-19.2.20.tgz",
      "integrity": "sha512-y0fyKycxJHr82kxXKE50Vac5hPn5Kx3gw9CfqyEuwJ9VQzEixDljU+chrQK4Wods14jJn9Tt2ncNPGH1rLya3Q==",
      "license": "MIT",
      "dependencies": {
        "tslib": "^2.3.0"
      },
      "engines": {
        "node": "^18.19.1 || ^20.11.1 || >=22.0.0"
      },
      "peerDependencies": {
        "@angular/common": "19.2.20",
        "@angular/core": "19.2.20",
        "@angular/platform-browser": "19.2.20",
        "rxjs": "^6.5.3 || ^7.4.0"
      }
    },
    "node_modules/@antfu/install-pkg": {
      "version": "1.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@antfu/install-pkg/-/install-pkg-1.1.0.tgz",
      "integrity": "sha512-MGQsmw10ZyI+EJo45CdSER4zEb+p31LpDAFp2Z3gkSd1yqVZGi0Ebx++YTEMonJy4oChEMLsxZ64j8FH6sSqtQ==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "package-manager-detector": "^1.3.0",
        "tinyexec": "^1.0.1"
      },
      "funding": {
        "url": "https://github.com/sponsors/antfu"
      }
    },
    "node_modules/@babel/code-frame": {
      "version": "7.29.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/code-frame/-/code-frame-7.29.0.tgz",
      "integrity": "sha512-9NhCeYjq9+3uxgdtp20LSiJXJvN0FeCtNGpJxuMFZ1Kv3cWUNb6DOhJwUvcVCzKGR66cw4njwM6hrJLqgOwbcw==",
      "license": "MIT",
      "dependencies": {
        "@babel/helper-validator-identifier": "^7.28.5",
        "js-tokens": "^4.0.0",
        "picocolors": "^1.1.1"
      },
      "engines": {
        "node": ">=6.9.0"
      }
    },
    "node_modules/@babel/compat-data": {
      "version": "7.29.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/compat-data/-/compat-data-7.29.0.tgz",
      "integrity": "sha512-T1NCJqT/j9+cn8fvkt7jtwbLBfLC/1y1c7NtCeXFRgzGTsafi68MRv8yzkYSapBnFA6L3U2VSc02ciDzoAJhJg==",
      "license": "MIT",
      "engines": {
        "node": ">=6.9.0"
      }
    },
    "node_modules/@babel/core": {
      "version": "7.26.10",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/core/-/core-7.26.10.tgz",
      "integrity": "sha512-vMqyb7XCDMPvJFFOaT9kxtiRh42GwlZEg1/uIgtZshS5a/8OaduUfCi7kynKgc3Tw/6Uo2D+db9qBttghhmxwQ==",
      "license": "MIT",
      "dependencies": {
        "@ampproject/remapping": "^2.2.0",
        "@babel/code-frame": "^7.26.2",
        "@babel/generator": "^7.26.10",
        "@babel/helper-compilation-targets": "^7.26.5",
        "@babel/helper-module-transforms": "^7.26.0",
        "@babel/helpers": "^7.26.10",
        "@babel/parser": "^7.26.10",
        "@babel/template": "^7.26.9",
        "@babel/traverse": "^7.26.10",
        "@babel/types": "^7.26.10",
        "convert-source-map": "^2.0.0",
        "debug": "^4.1.0",
        "gensync": "^1.0.0-beta.2",
        "json5": "^2.2.3",
        "semver": "^6.3.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/babel"
      }
    },
    "node_modules/@babel/core/node_modules/convert-source-map": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/convert-source-map/-/convert-source-map-2.0.0.tgz",
      "integrity": "sha512-Kvp459HrV2FEJ1CAsi1Ku+MY3kasH19TFykTz2xWmMeq6bk2NU3XXvfJ+Q61m0xktWwt+1HSYf3JZsTms3aRJg==",
      "license": "MIT"
    },
    "node_modules/@babel/core/node_modules/semver": {
      "version": "6.3.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/semver/-/semver-6.3.1.tgz",
      "integrity": "sha512-BR7VvDCVHO+q2xBEWskxS6DJE1qRnb7DxzUrogb71CWoSficBxYsiAGd+Kl0mmq/MprG9yArRkyrQxTO6XjMzA==",
      "license": "ISC",
      "bin": {
        "semver": "bin/semver.js"
      }
    },
    "node_modules/@babel/generator": {
      "version": "7.26.10",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/generator/-/generator-7.26.10.tgz",
      "integrity": "sha512-rRHT8siFIXQrAYOYqZQVsAr8vJ+cBNqcVAY6m5V8/4QqzaPl+zDBe6cLEPRDuNOUf3ww8RfJVlOyQMoSI+5Ang==",
      "license": "MIT",
      "dependencies": {
        "@babel/parser": "^7.26.10",
        "@babel/types": "^7.26.10",
        "@jridgewell/gen-mapping": "^0.3.5",
        "@jridgewell/trace-mapping": "^0.3.25",
        "jsesc": "^3.0.2"
      },
      "engines": {
        "node": ">=6.9.0"
      }
    },
    "node_modules/@babel/helper-annotate-as-pure": {
      "version": "7.25.9",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/helper-annotate-as-pure/-/helper-annotate-as-pure-7.25.9.tgz",
      "integrity": "sha512-gv7320KBUFJz1RnylIg5WWYPRXKZ884AGkYpgpWW02TH66Dl+HaC1t1CKd0z3R4b6hdYEcmrNZHUmfCP+1u3/g==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/types": "^7.25.9"
      },
      "engines": {
        "node": ">=6.9.0"
      }
    },
    "node_modules/@babel/helper-compilation-targets": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/helper-compilation-targets/-/helper-compilation-targets-7.28.6.tgz",
      "integrity": "sha512-JYtls3hqi15fcx5GaSNL7SCTJ2MNmjrkHXg4FSpOA/grxK8KwyZ5bubHsCq8FXCkua6xhuaaBit+3b7+VZRfcA==",
      "license": "MIT",
      "dependencies": {
        "@babel/compat-data": "^7.28.6",
        "@babel/helper-validator-option": "^7.27.1",
        "browserslist": "^4.24.0",
        "lru-cache": "^5.1.1",
        "semver": "^6.3.1"
      },
      "engines": {
        "node": ">=6.9.0"
      }
    },
    "node_modules/@babel/helper-compilation-targets/node_modules/semver": {
      "version": "6.3.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/semver/-/semver-6.3.1.tgz",
      "integrity": "sha512-BR7VvDCVHO+q2xBEWskxS6DJE1qRnb7DxzUrogb71CWoSficBxYsiAGd+Kl0mmq/MprG9yArRkyrQxTO6XjMzA==",
      "license": "ISC",
      "bin": {
        "semver": "bin/semver.js"
      }
    },
    "node_modules/@babel/helper-create-class-features-plugin": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/helper-create-class-features-plugin/-/helper-create-class-features-plugin-7.28.6.tgz",
      "integrity": "sha512-dTOdvsjnG3xNT9Y0AUg1wAl38y+4Rl4sf9caSQZOXdNqVn+H+HbbJ4IyyHaIqNR6SW9oJpA/RuRjsjCw2IdIow==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-annotate-as-pure": "^7.27.3",
        "@babel/helper-member-expression-to-functions": "^7.28.5",
        "@babel/helper-optimise-call-expression": "^7.27.1",
        "@babel/helper-replace-supers": "^7.28.6",
        "@babel/helper-skip-transparent-expression-wrappers": "^7.27.1",
        "@babel/traverse": "^7.28.6",
        "semver": "^6.3.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0"
      }
    },
    "node_modules/@babel/helper-create-class-features-plugin/node_modules/@babel/helper-annotate-as-pure": {
      "version": "7.27.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/helper-annotate-as-pure/-/helper-annotate-as-pure-7.27.3.tgz",
      "integrity": "sha512-fXSwMQqitTGeHLBC08Eq5yXz2m37E4pJX1qAU1+2cNedz/ifv/bVXft90VeSav5nFO61EcNgwr0aJxbyPaWBPg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/types": "^7.27.3"
      },
      "engines": {
        "node": ">=6.9.0"
      }
    },
    "node_modules/@babel/helper-create-class-features-plugin/node_modules/semver": {
      "version": "6.3.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/semver/-/semver-6.3.1.tgz",
      "integrity": "sha512-BR7VvDCVHO+q2xBEWskxS6DJE1qRnb7DxzUrogb71CWoSficBxYsiAGd+Kl0mmq/MprG9yArRkyrQxTO6XjMzA==",
      "dev": true,
      "license": "ISC",
      "bin": {
        "semver": "bin/semver.js"
      }
    },
    "node_modules/@babel/helper-create-regexp-features-plugin": {
      "version": "7.28.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/helper-create-regexp-features-plugin/-/helper-create-regexp-features-plugin-7.28.5.tgz",
      "integrity": "sha512-N1EhvLtHzOvj7QQOUCCS3NrPJP8c5W6ZXCHDn7Yialuy1iu4r5EmIYkXlKNqT99Ciw+W0mDqWoR6HWMZlFP3hw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-annotate-as-pure": "^7.27.3",
        "regexpu-core": "^6.3.1",
        "semver": "^6.3.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0"
      }
    },
    "node_modules/@babel/helper-create-regexp-features-plugin/node_modules/@babel/helper-annotate-as-pure": {
      "version": "7.27.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/helper-annotate-as-pure/-/helper-annotate-as-pure-7.27.3.tgz",
      "integrity": "sha512-fXSwMQqitTGeHLBC08Eq5yXz2m37E4pJX1qAU1+2cNedz/ifv/bVXft90VeSav5nFO61EcNgwr0aJxbyPaWBPg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/types": "^7.27.3"
      },
      "engines": {
        "node": ">=6.9.0"
      }
    },
    "node_modules/@babel/helper-create-regexp-features-plugin/node_modules/semver": {
      "version": "6.3.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/semver/-/semver-6.3.1.tgz",
      "integrity": "sha512-BR7VvDCVHO+q2xBEWskxS6DJE1qRnb7DxzUrogb71CWoSficBxYsiAGd+Kl0mmq/MprG9yArRkyrQxTO6XjMzA==",
      "dev": true,
      "license": "ISC",
      "bin": {
        "semver": "bin/semver.js"
      }
    },
    "node_modules/@babel/helper-define-polyfill-provider": {
      "version": "0.6.8",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/helper-define-polyfill-provider/-/helper-define-polyfill-provider-0.6.8.tgz",
      "integrity": "sha512-47UwBLPpQi1NoWzLuHNjRoHlYXMwIJoBf7MFou6viC/sIHWYygpvr0B6IAyh5sBdA2nr2LPIRww8lfaUVQINBA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-compilation-targets": "^7.28.6",
        "@babel/helper-plugin-utils": "^7.28.6",
        "debug": "^4.4.3",
        "lodash.debounce": "^4.0.8",
        "resolve": "^1.22.11"
      },
      "peerDependencies": {
        "@babel/core": "^7.4.0 || ^8.0.0-0 <8.0.0"
      }
    },
    "node_modules/@babel/helper-define-polyfill-provider/node_modules/resolve": {
      "version": "1.22.11",
      "resolved": "http://binario.caixa:8081/repository/npm-all/resolve/-/resolve-1.22.11.tgz",
      "integrity": "sha512-RfqAvLnMl313r7c9oclB1HhUEAezcpLjz95wFH4LVuhk9JF/r22qmVP9AMmOU4vMX7Q8pN8jwNg/CSpdFnMjTQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "is-core-module": "^2.16.1",
        "path-parse": "^1.0.7",
        "supports-preserve-symlinks-flag": "^1.0.0"
      },
      "bin": {
        "resolve": "bin/resolve"
      },
      "engines": {
        "node": ">= 0.4"
      },
      "funding": {
        "url": "https://github.com/sponsors/ljharb"
      }
    },
    "node_modules/@babel/helper-globals": {
      "version": "7.28.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/helper-globals/-/helper-globals-7.28.0.tgz",
      "integrity": "sha512-+W6cISkXFa1jXsDEdYA8HeevQT/FULhxzR99pxphltZcVaugps53THCeiWA8SguxxpSp3gKPiuYfSWopkLQ4hw==",
      "license": "MIT",
      "engines": {
        "node": ">=6.9.0"
      }
    },
    "node_modules/@babel/helper-member-expression-to-functions": {
      "version": "7.28.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/helper-member-expression-to-functions/-/helper-member-expression-to-functions-7.28.5.tgz",
      "integrity": "sha512-cwM7SBRZcPCLgl8a7cY0soT1SptSzAlMH39vwiRpOQkJlh53r5hdHwLSCZpQdVLT39sZt+CRpNwYG4Y2v77atg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/traverse": "^7.28.5",
        "@babel/types": "^7.28.5"
      },
      "engines": {
        "node": ">=6.9.0"
      }
    },
    "node_modules/@babel/helper-module-imports": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/helper-module-imports/-/helper-module-imports-7.28.6.tgz",
      "integrity": "sha512-l5XkZK7r7wa9LucGw9LwZyyCUscb4x37JWTPz7swwFE/0FMQAGpiWUZn8u9DzkSBWEcK25jmvubfpw2dnAMdbw==",
      "license": "MIT",
      "dependencies": {
        "@babel/traverse": "^7.28.6",
        "@babel/types": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      }
    },
    "node_modules/@babel/helper-module-transforms": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/helper-module-transforms/-/helper-module-transforms-7.28.6.tgz",
      "integrity": "sha512-67oXFAYr2cDLDVGLXTEABjdBJZ6drElUSI7WKp70NrpyISso3plG9SAGEF6y7zbha/wOzUByWWTJvEDVNIUGcA==",
      "license": "MIT",
      "dependencies": {
        "@babel/helper-module-imports": "^7.28.6",
        "@babel/helper-validator-identifier": "^7.28.5",
        "@babel/traverse": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0"
      }
    },
    "node_modules/@babel/helper-optimise-call-expression": {
      "version": "7.27.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/helper-optimise-call-expression/-/helper-optimise-call-expression-7.27.1.tgz",
      "integrity": "sha512-URMGH08NzYFhubNSGJrpUEphGKQwMQYBySzat5cAByY1/YgIRkULnIy3tAMeszlL/so2HbeilYloUmSpd7GdVw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/types": "^7.27.1"
      },
      "engines": {
        "node": ">=6.9.0"
      }
    },
    "node_modules/@babel/helper-plugin-utils": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/helper-plugin-utils/-/helper-plugin-utils-7.28.6.tgz",
      "integrity": "sha512-S9gzZ/bz83GRysI7gAD4wPT/AI3uCnY+9xn+Mx/KPs2JwHJIz1W8PZkg2cqyt3RNOBM8ejcXhV6y8Og7ly/Dug==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=6.9.0"
      }
    },
    "node_modules/@babel/helper-remap-async-to-generator": {
      "version": "7.27.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/helper-remap-async-to-generator/-/helper-remap-async-to-generator-7.27.1.tgz",
      "integrity": "sha512-7fiA521aVw8lSPeI4ZOD3vRFkoqkJcS+z4hFo82bFSH/2tNd6eJ5qCVMS5OzDmZh/kaHQeBaeyxK6wljcPtveA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-annotate-as-pure": "^7.27.1",
        "@babel/helper-wrap-function": "^7.27.1",
        "@babel/traverse": "^7.27.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0"
      }
    },
    "node_modules/@babel/helper-remap-async-to-generator/node_modules/@babel/helper-annotate-as-pure": {
      "version": "7.27.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/helper-annotate-as-pure/-/helper-annotate-as-pure-7.27.3.tgz",
      "integrity": "sha512-fXSwMQqitTGeHLBC08Eq5yXz2m37E4pJX1qAU1+2cNedz/ifv/bVXft90VeSav5nFO61EcNgwr0aJxbyPaWBPg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/types": "^7.27.3"
      },
      "engines": {
        "node": ">=6.9.0"
      }
    },
    "node_modules/@babel/helper-replace-supers": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/helper-replace-supers/-/helper-replace-supers-7.28.6.tgz",
      "integrity": "sha512-mq8e+laIk94/yFec3DxSjCRD2Z0TAjhVbEJY3UQrlwVo15Lmt7C2wAUbK4bjnTs4APkwsYLTahXRraQXhb1WCg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-member-expression-to-functions": "^7.28.5",
        "@babel/helper-optimise-call-expression": "^7.27.1",
        "@babel/traverse": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0"
      }
    },
    "node_modules/@babel/helper-skip-transparent-expression-wrappers": {
      "version": "7.27.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/helper-skip-transparent-expression-wrappers/-/helper-skip-transparent-expression-wrappers-7.27.1.tgz",
      "integrity": "sha512-Tub4ZKEXqbPjXgWLl2+3JpQAYBJ8+ikpQ2Ocj/q/r0LwE3UhENh7EUabyHjz2kCEsrRY83ew2DQdHluuiDQFzg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/traverse": "^7.27.1",
        "@babel/types": "^7.27.1"
      },
      "engines": {
        "node": ">=6.9.0"
      }
    },
    "node_modules/@babel/helper-split-export-declaration": {
      "version": "7.24.7",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/helper-split-export-declaration/-/helper-split-export-declaration-7.24.7.tgz",
      "integrity": "sha512-oy5V7pD+UvfkEATUKvIjvIAH/xCzfsFVw7ygW2SI6NClZzquT+mwdTfgfdbUiceh6iQO0CHtCPsyze/MZ2YbAA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/types": "^7.24.7"
      },
      "engines": {
        "node": ">=6.9.0"
      }
    },
    "node_modules/@babel/helper-string-parser": {
      "version": "7.27.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/helper-string-parser/-/helper-string-parser-7.27.1.tgz",
      "integrity": "sha512-qMlSxKbpRlAridDExk92nSobyDdpPijUq2DW6oDnUqd0iOGxmQjyqhMIihI9+zv4LPyZdRje2cavWPbCbWm3eA==",
      "license": "MIT",
      "engines": {
        "node": ">=6.9.0"
      }
    },
    "node_modules/@babel/helper-validator-identifier": {
      "version": "7.28.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/helper-validator-identifier/-/helper-validator-identifier-7.28.5.tgz",
      "integrity": "sha512-qSs4ifwzKJSV39ucNjsvc6WVHs6b7S03sOh2OcHF9UHfVPqWWALUsNUVzhSBiItjRZoLHx7nIarVjqKVusUZ1Q==",
      "license": "MIT",
      "engines": {
        "node": ">=6.9.0"
      }
    },
    "node_modules/@babel/helper-validator-option": {
      "version": "7.27.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/helper-validator-option/-/helper-validator-option-7.27.1.tgz",
      "integrity": "sha512-YvjJow9FxbhFFKDSuFnVCe2WxXk1zWc22fFePVNEaWJEu8IrZVlda6N0uHwzZrUM1il7NC9Mlp4MaJYbYd9JSg==",
      "license": "MIT",
      "engines": {
        "node": ">=6.9.0"
      }
    },
    "node_modules/@babel/helper-wrap-function": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/helper-wrap-function/-/helper-wrap-function-7.28.6.tgz",
      "integrity": "sha512-z+PwLziMNBeSQJonizz2AGnndLsP2DeGHIxDAn+wdHOGuo4Fo1x1HBPPXeE9TAOPHNNWQKCSlA2VZyYyyibDnQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/template": "^7.28.6",
        "@babel/traverse": "^7.28.6",
        "@babel/types": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      }
    },
    "node_modules/@babel/helpers": {
      "version": "7.29.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/helpers/-/helpers-7.29.2.tgz",
      "integrity": "sha512-HoGuUs4sCZNezVEKdVcwqmZN8GoHirLUcLaYVNBK2J0DadGtdcqgr3BCbvH8+XUo4NGjNl3VOtSjEKNzqfFgKw==",
      "license": "MIT",
      "dependencies": {
        "@babel/template": "^7.28.6",
        "@babel/types": "^7.29.0"
      },
      "engines": {
        "node": ">=6.9.0"
      }
    },
    "node_modules/@babel/parser": {
      "version": "7.29.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/parser/-/parser-7.29.2.tgz",
      "integrity": "sha512-4GgRzy/+fsBa72/RZVJmGKPmZu9Byn8o4MoLpmNe1m8ZfYnz5emHLQz3U4gLud6Zwl0RZIcgiLD7Uq7ySFuDLA==",
      "license": "MIT",
      "dependencies": {
        "@babel/types": "^7.29.0"
      },
      "bin": {
        "parser": "bin/babel-parser.js"
      },
      "engines": {
        "node": ">=6.0.0"
      }
    },
    "node_modules/@babel/plugin-bugfix-firefox-class-in-computed-class-key": {
      "version": "7.28.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-bugfix-firefox-class-in-computed-class-key/-/plugin-bugfix-firefox-class-in-computed-class-key-7.28.5.tgz",
      "integrity": "sha512-87GDMS3tsmMSi/3bWOte1UblL+YUTFMV8SZPZ2eSEL17s74Cw/l63rR6NmGVKMYW2GYi85nE+/d6Hw5N0bEk2Q==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.27.1",
        "@babel/traverse": "^7.28.5"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0"
      }
    },
    "node_modules/@babel/plugin-bugfix-safari-class-field-initializer-scope": {
      "version": "7.27.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-bugfix-safari-class-field-initializer-scope/-/plugin-bugfix-safari-class-field-initializer-scope-7.27.1.tgz",
      "integrity": "sha512-qNeq3bCKnGgLkEXUuFry6dPlGfCdQNZbn7yUAPCInwAJHMU7THJfrBSozkcWq5sNM6RcF3S8XyQL2A52KNR9IA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.27.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0"
      }
    },
    "node_modules/@babel/plugin-bugfix-safari-id-destructuring-collision-in-function-expression": {
      "version": "7.27.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-bugfix-safari-id-destructuring-collision-in-function-expression/-/plugin-bugfix-safari-id-destructuring-collision-in-function-expression-7.27.1.tgz",
      "integrity": "sha512-g4L7OYun04N1WyqMNjldFwlfPCLVkgB54A/YCXICZYBsvJJE3kByKv9c9+R/nAfmIfjl2rKYLNyMHboYbZaWaA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.27.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0"
      }
    },
    "node_modules/@babel/plugin-bugfix-v8-spread-parameters-in-optional-chaining": {
      "version": "7.27.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-bugfix-v8-spread-parameters-in-optional-chaining/-/plugin-bugfix-v8-spread-parameters-in-optional-chaining-7.27.1.tgz",
      "integrity": "sha512-oO02gcONcD5O1iTLi/6frMJBIwWEHceWGSGqrpCmEL8nogiS6J9PBlE48CaK20/Jx1LuRml9aDftLgdjXT8+Cw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.27.1",
        "@babel/helper-skip-transparent-expression-wrappers": "^7.27.1",
        "@babel/plugin-transform-optional-chaining": "^7.27.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.13.0"
      }
    },
    "node_modules/@babel/plugin-bugfix-v8-static-class-fields-redefine-readonly": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-bugfix-v8-static-class-fields-redefine-readonly/-/plugin-bugfix-v8-static-class-fields-redefine-readonly-7.28.6.tgz",
      "integrity": "sha512-a0aBScVTlNaiUe35UtfxAN7A/tehvvG4/ByO6+46VPKTRSlfnAFsgKy0FUh+qAkQrDTmhDkT+IBOKlOoMUxQ0g==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.28.6",
        "@babel/traverse": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0"
      }
    },
    "node_modules/@babel/plugin-proposal-private-property-in-object": {
      "version": "7.21.0-placeholder-for-preset-env.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-proposal-private-property-in-object/-/plugin-proposal-private-property-in-object-7.21.0-placeholder-for-preset-env.2.tgz",
      "integrity": "sha512-SOSkfJDddaM7mak6cPEpswyTRnuRltl429hMraQEglW+OkovnCzsiszTmsrlY//qLFjCpQDFRvjdm2wA5pPm9w==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-syntax-async-generators": {
      "version": "7.8.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-syntax-async-generators/-/plugin-syntax-async-generators-7.8.4.tgz",
      "integrity": "sha512-tycmZxkGfZaxhMRbXlPXuVFpdWlXpir2W4AMhSJgRKzk/eDlIXOhb2LHWoLpDF7TEHylV5zNhykX6KAgHJmTNw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.8.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-syntax-bigint": {
      "version": "7.8.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-syntax-bigint/-/plugin-syntax-bigint-7.8.3.tgz",
      "integrity": "sha512-wnTnFlG+YxQm3vDxpGE57Pj0srRU4sHE/mDkt1qv2YJJSeUAec2ma4WLUnUPeKjyrfntVwe/N6dCXpU+zL3Npg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.8.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-syntax-class-properties": {
      "version": "7.12.13",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-syntax-class-properties/-/plugin-syntax-class-properties-7.12.13.tgz",
      "integrity": "sha512-fm4idjKla0YahUNgFNLCB0qySdsoPiZP3iQE3rky0mBUtMZ23yDJ9SJdg6dXTSDnulOVqiF3Hgr9nbXvXTQZYA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.12.13"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-syntax-class-static-block": {
      "version": "7.14.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-syntax-class-static-block/-/plugin-syntax-class-static-block-7.14.5.tgz",
      "integrity": "sha512-b+YyPmr6ldyNnM6sqYeMWE+bgJcJpO6yS4QD7ymxgH34GBPNDM/THBh8iunyvKIZztiwLH4CJZ0RxTk9emgpjw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.14.5"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-syntax-import-assertions": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-syntax-import-assertions/-/plugin-syntax-import-assertions-7.28.6.tgz",
      "integrity": "sha512-pSJUpFHdx9z5nqTSirOCMtYVP2wFgoWhP0p3g8ONK/4IHhLIBd0B9NYqAvIUAhq+OkhO4VM1tENCt0cjlsNShw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-syntax-import-attributes": {
      "version": "7.26.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-syntax-import-attributes/-/plugin-syntax-import-attributes-7.26.0.tgz",
      "integrity": "sha512-e2dttdsJ1ZTpi3B9UYGLw41hifAubg19AtCu/2I/F1QNVclOBr1dYpTdmdyZ84Xiz43BS/tCUkMAZNLv12Pi+A==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.25.9"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-syntax-import-meta": {
      "version": "7.10.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-syntax-import-meta/-/plugin-syntax-import-meta-7.10.4.tgz",
      "integrity": "sha512-Yqfm+XDx0+Prh3VSeEQCPU81yC+JWZ2pDPFSS4ZdpfZhp4MkFMaDC1UqseovEKwSUpnIL7+vK+Clp7bfh0iD7g==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.10.4"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-syntax-json-strings": {
      "version": "7.8.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-syntax-json-strings/-/plugin-syntax-json-strings-7.8.3.tgz",
      "integrity": "sha512-lY6kdGpWHvjoe2vk4WrAapEuBR69EMxZl+RoGRhrFGNYVK8mOPAW8VfbT/ZgrFbXlDNiiaxQnAtgVCZ6jv30EA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.8.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-syntax-jsx": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-syntax-jsx/-/plugin-syntax-jsx-7.28.6.tgz",
      "integrity": "sha512-wgEmr06G6sIpqr8YDwA2dSRTE3bJ+V0IfpzfSY3Lfgd7YWOaAdlykvJi13ZKBt8cZHfgH1IXN+CL656W3uUa4w==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-syntax-logical-assignment-operators": {
      "version": "7.10.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-syntax-logical-assignment-operators/-/plugin-syntax-logical-assignment-operators-7.10.4.tgz",
      "integrity": "sha512-d8waShlpFDinQ5MtvGU9xDAOzKH47+FFoney2baFIoMr952hKOLp1HR7VszoZvOsV/4+RRszNY7D17ba0te0ig==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.10.4"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-syntax-nullish-coalescing-operator": {
      "version": "7.8.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-syntax-nullish-coalescing-operator/-/plugin-syntax-nullish-coalescing-operator-7.8.3.tgz",
      "integrity": "sha512-aSff4zPII1u2QD7y+F8oDsz19ew4IGEJg9SVW+bqwpwtfFleiQDMdzA/R+UlWDzfnHFCxxleFT0PMIrR36XLNQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.8.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-syntax-numeric-separator": {
      "version": "7.10.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-syntax-numeric-separator/-/plugin-syntax-numeric-separator-7.10.4.tgz",
      "integrity": "sha512-9H6YdfkcK/uOnY/K7/aA2xpzaAgkQn37yzWUMRK7OaPOqOpGS1+n0H5hxT9AUw9EsSjPW8SVyMJwYRtWs3X3ug==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.10.4"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-syntax-object-rest-spread": {
      "version": "7.8.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-syntax-object-rest-spread/-/plugin-syntax-object-rest-spread-7.8.3.tgz",
      "integrity": "sha512-XoqMijGZb9y3y2XskN+P1wUGiVwWZ5JmoDRwx5+3GmEplNyVM2s2Dg8ILFQm8rWM48orGy5YpI5Bl8U1y7ydlA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.8.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-syntax-optional-catch-binding": {
      "version": "7.8.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-syntax-optional-catch-binding/-/plugin-syntax-optional-catch-binding-7.8.3.tgz",
      "integrity": "sha512-6VPD0Pc1lpTqw0aKoeRTMiB+kWhAoT24PA+ksWSBrFtl5SIRVpZlwN3NNPQjehA2E/91FV3RjLWoVTglWcSV3Q==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.8.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-syntax-optional-chaining": {
      "version": "7.8.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-syntax-optional-chaining/-/plugin-syntax-optional-chaining-7.8.3.tgz",
      "integrity": "sha512-KoK9ErH1MBlCPxV0VANkXW2/dw4vlbGDrFgz8bmUsBGYkFRcbRwMh6cIJubdPrkxRwuGdtCk0v/wPTKbQgBjkg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.8.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-syntax-private-property-in-object": {
      "version": "7.14.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-syntax-private-property-in-object/-/plugin-syntax-private-property-in-object-7.14.5.tgz",
      "integrity": "sha512-0wVnp9dxJ72ZUJDV27ZfbSj6iHLoytYZmh3rFcxNnvsJF3ktkzLDZPy/mA17HGsaQT3/DQsWYX1f1QGWkCoVUg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.14.5"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-syntax-top-level-await": {
      "version": "7.14.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-syntax-top-level-await/-/plugin-syntax-top-level-await-7.14.5.tgz",
      "integrity": "sha512-hx++upLv5U1rgYfwe1xBQUhRmU41NEvpUvrp8jkrSCdvGSnM5/qdRMtylJ6PG5OFkBaHkbTAKTnd3/YyESRHFw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.14.5"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-syntax-typescript": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-syntax-typescript/-/plugin-syntax-typescript-7.28.6.tgz",
      "integrity": "sha512-+nDNmQye7nlnuuHDboPbGm00Vqg3oO8niRRL27/4LYHUsHYh0zJ1xWOz0uRwNFmM1Avzk8wZbc6rdiYhomzv/A==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-syntax-unicode-sets-regex": {
      "version": "7.18.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-syntax-unicode-sets-regex/-/plugin-syntax-unicode-sets-regex-7.18.6.tgz",
      "integrity": "sha512-727YkEAPwSIQTv5im8QHz3upqp92JTWhidIC81Tdx4VJYIte/VndKf1qKrfnnhPLiPghStWfvC/iFaMCQu7Nqg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-create-regexp-features-plugin": "^7.18.6",
        "@babel/helper-plugin-utils": "^7.18.6"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0"
      }
    },
    "node_modules/@babel/plugin-transform-arrow-functions": {
      "version": "7.27.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-arrow-functions/-/plugin-transform-arrow-functions-7.27.1.tgz",
      "integrity": "sha512-8Z4TGic6xW70FKThA5HYEKKyBpOOsucTOD1DjU3fZxDg+K3zBJcXMFnt/4yQiZnf5+MiOMSXQ9PaEK/Ilh1DeA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.27.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-async-generator-functions": {
      "version": "7.26.8",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-async-generator-functions/-/plugin-transform-async-generator-functions-7.26.8.tgz",
      "integrity": "sha512-He9Ej2X7tNf2zdKMAGOsmg2MrFc+hfoAhd3po4cWfo/NWjzEAKa0oQruj1ROVUdl0e6fb6/kE/G3SSxE0lRJOg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.26.5",
        "@babel/helper-remap-async-to-generator": "^7.25.9",
        "@babel/traverse": "^7.26.8"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-async-to-generator": {
      "version": "7.25.9",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-async-to-generator/-/plugin-transform-async-to-generator-7.25.9.tgz",
      "integrity": "sha512-NT7Ejn7Z/LjUH0Gv5KsBCxh7BH3fbLTV0ptHvpeMvrt3cPThHfJfst9Wrb7S8EvJ7vRTFI7z+VAvFVEQn/m5zQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-module-imports": "^7.25.9",
        "@babel/helper-plugin-utils": "^7.25.9",
        "@babel/helper-remap-async-to-generator": "^7.25.9"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-block-scoped-functions": {
      "version": "7.27.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-block-scoped-functions/-/plugin-transform-block-scoped-functions-7.27.1.tgz",
      "integrity": "sha512-cnqkuOtZLapWYZUYM5rVIdv1nXYuFVIltZ6ZJ7nIj585QsjKM5dhL2Fu/lICXZ1OyIAFc7Qy+bvDAtTXqGrlhg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.27.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-block-scoping": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-block-scoping/-/plugin-transform-block-scoping-7.28.6.tgz",
      "integrity": "sha512-tt/7wOtBmwHPNMPu7ax4pdPz6shjFrmHDghvNC+FG9Qvj7D6mJcoRQIF5dy4njmxR941l6rgtvfSB2zX3VlUIw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-class-properties": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-class-properties/-/plugin-transform-class-properties-7.28.6.tgz",
      "integrity": "sha512-dY2wS3I2G7D697VHndN91TJr8/AAfXQNt5ynCTI/MpxMsSzHp+52uNivYT5wCPax3whc47DR8Ba7cmlQMg24bw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-create-class-features-plugin": "^7.28.6",
        "@babel/helper-plugin-utils": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-class-static-block": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-class-static-block/-/plugin-transform-class-static-block-7.28.6.tgz",
      "integrity": "sha512-rfQ++ghVwTWTqQ7w8qyDxL1XGihjBss4CmTgGRCTAC9RIbhVpyp4fOeZtta0Lbf+dTNIVJer6ych2ibHwkZqsQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-create-class-features-plugin": "^7.28.6",
        "@babel/helper-plugin-utils": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.12.0"
      }
    },
    "node_modules/@babel/plugin-transform-classes": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-classes/-/plugin-transform-classes-7.28.6.tgz",
      "integrity": "sha512-EF5KONAqC5zAqT783iMGuM2ZtmEBy+mJMOKl2BCvPZ2lVrwvXnB6o+OBWCS+CoeCCpVRF2sA2RBKUxvT8tQT5Q==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-annotate-as-pure": "^7.27.3",
        "@babel/helper-compilation-targets": "^7.28.6",
        "@babel/helper-globals": "^7.28.0",
        "@babel/helper-plugin-utils": "^7.28.6",
        "@babel/helper-replace-supers": "^7.28.6",
        "@babel/traverse": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-classes/node_modules/@babel/helper-annotate-as-pure": {
      "version": "7.27.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/helper-annotate-as-pure/-/helper-annotate-as-pure-7.27.3.tgz",
      "integrity": "sha512-fXSwMQqitTGeHLBC08Eq5yXz2m37E4pJX1qAU1+2cNedz/ifv/bVXft90VeSav5nFO61EcNgwr0aJxbyPaWBPg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/types": "^7.27.3"
      },
      "engines": {
        "node": ">=6.9.0"
      }
    },
    "node_modules/@babel/plugin-transform-computed-properties": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-computed-properties/-/plugin-transform-computed-properties-7.28.6.tgz",
      "integrity": "sha512-bcc3k0ijhHbc2lEfpFHgx7eYw9KNXqOerKWfzbxEHUGKnS3sz9C4CNL9OiFN1297bDNfUiSO7DaLzbvHQQQ1BQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.28.6",
        "@babel/template": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-destructuring": {
      "version": "7.28.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-destructuring/-/plugin-transform-destructuring-7.28.5.tgz",
      "integrity": "sha512-Kl9Bc6D0zTUcFUvkNuQh4eGXPKKNDOJQXVyyM4ZAQPMveniJdxi8XMJwLo+xSoW3MIq81bD33lcUe9kZpl0MCw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.27.1",
        "@babel/traverse": "^7.28.5"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-dotall-regex": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-dotall-regex/-/plugin-transform-dotall-regex-7.28.6.tgz",
      "integrity": "sha512-SljjowuNKB7q5Oayv4FoPzeB74g3QgLt8IVJw9ADvWy3QnUb/01aw8I4AVv8wYnPvQz2GDDZ/g3GhcNyDBI4Bg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-create-regexp-features-plugin": "^7.28.5",
        "@babel/helper-plugin-utils": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-duplicate-keys": {
      "version": "7.27.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-duplicate-keys/-/plugin-transform-duplicate-keys-7.27.1.tgz",
      "integrity": "sha512-MTyJk98sHvSs+cvZ4nOauwTTG1JeonDjSGvGGUNHreGQns+Mpt6WX/dVzWBHgg+dYZhkC4X+zTDfkTU+Vy9y7Q==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.27.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-duplicate-named-capturing-groups-regex": {
      "version": "7.29.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-duplicate-named-capturing-groups-regex/-/plugin-transform-duplicate-named-capturing-groups-regex-7.29.0.tgz",
      "integrity": "sha512-zBPcW2lFGxdiD8PUnPwJjag2J9otbcLQzvbiOzDxpYXyCuYX9agOwMPGn1prVH0a4qzhCKu24rlH4c1f7yA8rw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-create-regexp-features-plugin": "^7.28.5",
        "@babel/helper-plugin-utils": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0"
      }
    },
    "node_modules/@babel/plugin-transform-dynamic-import": {
      "version": "7.27.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-dynamic-import/-/plugin-transform-dynamic-import-7.27.1.tgz",
      "integrity": "sha512-MHzkWQcEmjzzVW9j2q8LGjwGWpG2mjwaaB0BNQwst3FIjqsg8Ct/mIZlvSPJvfi9y2AC8mi/ktxbFVL9pZ1I4A==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.27.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-exponentiation-operator": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-exponentiation-operator/-/plugin-transform-exponentiation-operator-7.28.6.tgz",
      "integrity": "sha512-WitabqiGjV/vJ0aPOLSFfNY1u9U3R7W36B03r5I2KoNix+a3sOhJ3pKFB3R5It9/UiK78NiO0KE9P21cMhlPkw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-export-namespace-from": {
      "version": "7.27.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-export-namespace-from/-/plugin-transform-export-namespace-from-7.27.1.tgz",
      "integrity": "sha512-tQvHWSZ3/jH2xuq/vZDy0jNn+ZdXJeM8gHvX4lnJmsc3+50yPlWdZXIc5ay+umX+2/tJIqHqiEqcJvxlmIvRvQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.27.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-for-of": {
      "version": "7.27.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-for-of/-/plugin-transform-for-of-7.27.1.tgz",
      "integrity": "sha512-BfbWFFEJFQzLCQ5N8VocnCtA8J1CLkNTe2Ms2wocj75dd6VpiqS5Z5quTYcUoo4Yq+DN0rtikODccuv7RU81sw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.27.1",
        "@babel/helper-skip-transparent-expression-wrappers": "^7.27.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-function-name": {
      "version": "7.27.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-function-name/-/plugin-transform-function-name-7.27.1.tgz",
      "integrity": "sha512-1bQeydJF9Nr1eBCMMbC+hdwmRlsv5XYOMu03YSWFwNs0HsAmtSxxF1fyuYPqemVldVyFmlCU7w8UE14LupUSZQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-compilation-targets": "^7.27.1",
        "@babel/helper-plugin-utils": "^7.27.1",
        "@babel/traverse": "^7.27.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-json-strings": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-json-strings/-/plugin-transform-json-strings-7.28.6.tgz",
      "integrity": "sha512-Nr+hEN+0geQkzhbdgQVPoqr47lZbm+5fCUmO70722xJZd0Mvb59+33QLImGj6F+DkK3xgDi1YVysP8whD6FQAw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-literals": {
      "version": "7.27.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-literals/-/plugin-transform-literals-7.27.1.tgz",
      "integrity": "sha512-0HCFSepIpLTkLcsi86GG3mTUzxV5jpmbv97hTETW3yzrAij8aqlD36toB1D0daVFJM8NK6GvKO0gslVQmm+zZA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.27.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-logical-assignment-operators": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-logical-assignment-operators/-/plugin-transform-logical-assignment-operators-7.28.6.tgz",
      "integrity": "sha512-+anKKair6gpi8VsM/95kmomGNMD0eLz1NQ8+Pfw5sAwWH9fGYXT50E55ZpV0pHUHWf6IUTWPM+f/7AAff+wr9A==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-member-expression-literals": {
      "version": "7.27.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-member-expression-literals/-/plugin-transform-member-expression-literals-7.27.1.tgz",
      "integrity": "sha512-hqoBX4dcZ1I33jCSWcXrP+1Ku7kdqXf1oeah7ooKOIiAdKQ+uqftgCFNOSzA5AMS2XIHEYeGFg4cKRCdpxzVOQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.27.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-modules-amd": {
      "version": "7.27.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-modules-amd/-/plugin-transform-modules-amd-7.27.1.tgz",
      "integrity": "sha512-iCsytMg/N9/oFq6n+gFTvUYDZQOMK5kEdeYxmxt91fcJGycfxVP9CnrxoliM0oumFERba2i8ZtwRUCMhvP1LnA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-module-transforms": "^7.27.1",
        "@babel/helper-plugin-utils": "^7.27.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-modules-commonjs": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-modules-commonjs/-/plugin-transform-modules-commonjs-7.28.6.tgz",
      "integrity": "sha512-jppVbf8IV9iWWwWTQIxJMAJCWBuuKx71475wHwYytrRGQ2CWiDvYlADQno3tcYpS/T2UUWFQp3nVtYfK/YBQrA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-module-transforms": "^7.28.6",
        "@babel/helper-plugin-utils": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-modules-systemjs": {
      "version": "7.29.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-modules-systemjs/-/plugin-transform-modules-systemjs-7.29.0.tgz",
      "integrity": "sha512-PrujnVFbOdUpw4UHiVwKvKRLMMic8+eC0CuNlxjsyZUiBjhFdPsewdXCkveh2KqBA9/waD0W1b4hXSOBQJezpQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-module-transforms": "^7.28.6",
        "@babel/helper-plugin-utils": "^7.28.6",
        "@babel/helper-validator-identifier": "^7.28.5",
        "@babel/traverse": "^7.29.0"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-modules-umd": {
      "version": "7.27.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-modules-umd/-/plugin-transform-modules-umd-7.27.1.tgz",
      "integrity": "sha512-iQBE/xC5BV1OxJbp6WG7jq9IWiD+xxlZhLrdwpPkTX3ydmXdvoCpyfJN7acaIBZaOqTfr76pgzqBJflNbeRK+w==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-module-transforms": "^7.27.1",
        "@babel/helper-plugin-utils": "^7.27.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-named-capturing-groups-regex": {
      "version": "7.29.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-named-capturing-groups-regex/-/plugin-transform-named-capturing-groups-regex-7.29.0.tgz",
      "integrity": "sha512-1CZQA5KNAD6ZYQLPw7oi5ewtDNxH/2vuCh+6SmvgDfhumForvs8a1o9n0UrEoBD8HU4djO2yWngTQlXl1NDVEQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-create-regexp-features-plugin": "^7.28.5",
        "@babel/helper-plugin-utils": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0"
      }
    },
    "node_modules/@babel/plugin-transform-new-target": {
      "version": "7.27.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-new-target/-/plugin-transform-new-target-7.27.1.tgz",
      "integrity": "sha512-f6PiYeqXQ05lYq3TIfIDu/MtliKUbNwkGApPUvyo6+tc7uaR4cPjPe7DFPr15Uyycg2lZU6btZ575CuQoYh7MQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.27.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-nullish-coalescing-operator": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-nullish-coalescing-operator/-/plugin-transform-nullish-coalescing-operator-7.28.6.tgz",
      "integrity": "sha512-3wKbRgmzYbw24mDJXT7N+ADXw8BC/imU9yo9c9X9NKaLF1fW+e5H1U5QjMUBe4Qo4Ox/o++IyUkl1sVCLgevKg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-numeric-separator": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-numeric-separator/-/plugin-transform-numeric-separator-7.28.6.tgz",
      "integrity": "sha512-SJR8hPynj8outz+SlStQSwvziMN4+Bq99it4tMIf5/Caq+3iOc0JtKyse8puvyXkk3eFRIA5ID/XfunGgO5i6w==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-object-rest-spread": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-object-rest-spread/-/plugin-transform-object-rest-spread-7.28.6.tgz",
      "integrity": "sha512-5rh+JR4JBC4pGkXLAcYdLHZjXudVxWMXbB6u6+E9lRL5TrGVbHt1TjxGbZ8CkmYw9zjkB7jutzOROArsqtncEA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-compilation-targets": "^7.28.6",
        "@babel/helper-plugin-utils": "^7.28.6",
        "@babel/plugin-transform-destructuring": "^7.28.5",
        "@babel/plugin-transform-parameters": "^7.27.7",
        "@babel/traverse": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-object-super": {
      "version": "7.27.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-object-super/-/plugin-transform-object-super-7.27.1.tgz",
      "integrity": "sha512-SFy8S9plRPbIcxlJ8A6mT/CxFdJx/c04JEctz4jf8YZaVS2px34j7NXRrlGlHkN/M2gnpL37ZpGRGVFLd3l8Ng==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.27.1",
        "@babel/helper-replace-supers": "^7.27.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-optional-catch-binding": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-optional-catch-binding/-/plugin-transform-optional-catch-binding-7.28.6.tgz",
      "integrity": "sha512-R8ja/Pyrv0OGAvAXQhSTmWyPJPml+0TMqXlO5w+AsMEiwb2fg3WkOvob7UxFSL3OIttFSGSRFKQsOhJ/X6HQdQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-optional-chaining": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-optional-chaining/-/plugin-transform-optional-chaining-7.28.6.tgz",
      "integrity": "sha512-A4zobikRGJTsX9uqVFdafzGkqD30t26ck2LmOzAuLL8b2x6k3TIqRiT2xVvA9fNmFeTX484VpsdgmKNA0bS23w==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.28.6",
        "@babel/helper-skip-transparent-expression-wrappers": "^7.27.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-parameters": {
      "version": "7.27.7",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-parameters/-/plugin-transform-parameters-7.27.7.tgz",
      "integrity": "sha512-qBkYTYCb76RRxUM6CcZA5KRu8K4SM8ajzVeUgVdMVO9NN9uI/GaVmBg/WKJJGnNokV9SY8FxNOVWGXzqzUidBg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.27.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-private-methods": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-private-methods/-/plugin-transform-private-methods-7.28.6.tgz",
      "integrity": "sha512-piiuapX9CRv7+0st8lmuUlRSmX6mBcVeNQ1b4AYzJxfCMuBfB0vBXDiGSmm03pKJw1v6cZ8KSeM+oUnM6yAExg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-create-class-features-plugin": "^7.28.6",
        "@babel/helper-plugin-utils": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-private-property-in-object": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-private-property-in-object/-/plugin-transform-private-property-in-object-7.28.6.tgz",
      "integrity": "sha512-b97jvNSOb5+ehyQmBpmhOCiUC5oVK4PMnpRvO7+ymFBoqYjeDHIU9jnrNUuwHOiL9RpGDoKBpSViarV+BU+eVA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-annotate-as-pure": "^7.27.3",
        "@babel/helper-create-class-features-plugin": "^7.28.6",
        "@babel/helper-plugin-utils": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-private-property-in-object/node_modules/@babel/helper-annotate-as-pure": {
      "version": "7.27.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/helper-annotate-as-pure/-/helper-annotate-as-pure-7.27.3.tgz",
      "integrity": "sha512-fXSwMQqitTGeHLBC08Eq5yXz2m37E4pJX1qAU1+2cNedz/ifv/bVXft90VeSav5nFO61EcNgwr0aJxbyPaWBPg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/types": "^7.27.3"
      },
      "engines": {
        "node": ">=6.9.0"
      }
    },
    "node_modules/@babel/plugin-transform-property-literals": {
      "version": "7.27.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-property-literals/-/plugin-transform-property-literals-7.27.1.tgz",
      "integrity": "sha512-oThy3BCuCha8kDZ8ZkgOg2exvPYUlprMukKQXI1r1pJ47NCvxfkEy8vK+r/hT9nF0Aa4H1WUPZZjHTFtAhGfmQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.27.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-regenerator": {
      "version": "7.29.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-regenerator/-/plugin-transform-regenerator-7.29.0.tgz",
      "integrity": "sha512-FijqlqMA7DmRdg/aINBSs04y8XNTYw/lr1gJ2WsmBnnaNw1iS43EPkJW+zK7z65auG3AWRFXWj+NcTQwYptUog==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-regexp-modifiers": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-regexp-modifiers/-/plugin-transform-regexp-modifiers-7.28.6.tgz",
      "integrity": "sha512-QGWAepm9qxpaIs7UM9FvUSnCGlb8Ua1RhyM4/veAxLwt3gMat/LSGrZixyuj4I6+Kn9iwvqCyPTtbdxanYoWYg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-create-regexp-features-plugin": "^7.28.5",
        "@babel/helper-plugin-utils": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0"
      }
    },
    "node_modules/@babel/plugin-transform-reserved-words": {
      "version": "7.27.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-reserved-words/-/plugin-transform-reserved-words-7.27.1.tgz",
      "integrity": "sha512-V2ABPHIJX4kC7HegLkYoDpfg9PVmuWy/i6vUM5eGK22bx4YVFD3M5F0QQnWQoDs6AGsUWTVOopBiMFQgHaSkVw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.27.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-runtime": {
      "version": "7.26.10",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-runtime/-/plugin-transform-runtime-7.26.10.tgz",
      "integrity": "sha512-NWaL2qG6HRpONTnj4JvDU6th4jYeZOJgu3QhmFTCihib0ermtOJqktA5BduGm3suhhVe9EMP9c9+mfJ/I9slqw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-module-imports": "^7.25.9",
        "@babel/helper-plugin-utils": "^7.26.5",
        "babel-plugin-polyfill-corejs2": "^0.4.10",
        "babel-plugin-polyfill-corejs3": "^0.11.0",
        "babel-plugin-polyfill-regenerator": "^0.6.1",
        "semver": "^6.3.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-runtime/node_modules/semver": {
      "version": "6.3.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/semver/-/semver-6.3.1.tgz",
      "integrity": "sha512-BR7VvDCVHO+q2xBEWskxS6DJE1qRnb7DxzUrogb71CWoSficBxYsiAGd+Kl0mmq/MprG9yArRkyrQxTO6XjMzA==",
      "dev": true,
      "license": "ISC",
      "bin": {
        "semver": "bin/semver.js"
      }
    },
    "node_modules/@babel/plugin-transform-shorthand-properties": {
      "version": "7.27.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-shorthand-properties/-/plugin-transform-shorthand-properties-7.27.1.tgz",
      "integrity": "sha512-N/wH1vcn4oYawbJ13Y/FxcQrWk63jhfNa7jef0ih7PHSIHX2LB7GWE1rkPrOnka9kwMxb6hMl19p7lidA+EHmQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.27.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-spread": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-spread/-/plugin-transform-spread-7.28.6.tgz",
      "integrity": "sha512-9U4QObUC0FtJl05AsUcodau/RWDytrU6uKgkxu09mLR9HLDAtUMoPuuskm5huQsoktmsYpI+bGmq+iapDcriKA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.28.6",
        "@babel/helper-skip-transparent-expression-wrappers": "^7.27.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-sticky-regex": {
      "version": "7.27.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-sticky-regex/-/plugin-transform-sticky-regex-7.27.1.tgz",
      "integrity": "sha512-lhInBO5bi/Kowe2/aLdBAawijx+q1pQzicSgnkB6dUPc1+RC8QmJHKf2OjvU+NZWitguJHEaEmbV6VWEouT58g==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.27.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-template-literals": {
      "version": "7.27.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-template-literals/-/plugin-transform-template-literals-7.27.1.tgz",
      "integrity": "sha512-fBJKiV7F2DxZUkg5EtHKXQdbsbURW3DZKQUWphDum0uRP6eHGGa/He9mc0mypL680pb+e/lDIthRohlv8NCHkg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.27.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-typeof-symbol": {
      "version": "7.27.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-typeof-symbol/-/plugin-transform-typeof-symbol-7.27.1.tgz",
      "integrity": "sha512-RiSILC+nRJM7FY5srIyc4/fGIwUhyDuuBSdWn4y6yT6gm652DpCHZjIipgn6B7MQ1ITOUnAKWixEUjQRIBIcLw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.27.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-unicode-escapes": {
      "version": "7.27.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-unicode-escapes/-/plugin-transform-unicode-escapes-7.27.1.tgz",
      "integrity": "sha512-Ysg4v6AmF26k9vpfFuTZg8HRfVWzsh1kVfowA23y9j/Gu6dOuahdUVhkLqpObp3JIv27MLSii6noRnuKN8H0Mg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.27.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-unicode-property-regex": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-unicode-property-regex/-/plugin-transform-unicode-property-regex-7.28.6.tgz",
      "integrity": "sha512-4Wlbdl/sIZjzi/8St0evF0gEZrgOswVO6aOzqxh1kDZOl9WmLrHq2HtGhnOJZmHZYKP8WZ1MDLCt5DAWwRo57A==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-create-regexp-features-plugin": "^7.28.5",
        "@babel/helper-plugin-utils": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-unicode-regex": {
      "version": "7.27.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-unicode-regex/-/plugin-transform-unicode-regex-7.27.1.tgz",
      "integrity": "sha512-xvINq24TRojDuyt6JGtHmkVkrfVV3FPT16uytxImLeBZqW3/H52yN+kM1MGuyPkIQxrzKwPHs5U/MP3qKyzkGw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-create-regexp-features-plugin": "^7.27.1",
        "@babel/helper-plugin-utils": "^7.27.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/plugin-transform-unicode-sets-regex": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/plugin-transform-unicode-sets-regex/-/plugin-transform-unicode-sets-regex-7.28.6.tgz",
      "integrity": "sha512-/wHc/paTUmsDYN7SZkpWxogTOBNnlx7nBQYfy6JJlCT7G3mVhltk3e++N7zV0XfgGsrqBxd4rJQt9H16I21Y1Q==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-create-regexp-features-plugin": "^7.28.5",
        "@babel/helper-plugin-utils": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0"
      }
    },
    "node_modules/@babel/preset-env": {
      "version": "7.26.9",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/preset-env/-/preset-env-7.26.9.tgz",
      "integrity": "sha512-vX3qPGE8sEKEAZCWk05k3cpTAE3/nOYca++JA+Rd0z2NCNzabmYvEiSShKzm10zdquOIAVXsy2Ei/DTW34KlKQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/compat-data": "^7.26.8",
        "@babel/helper-compilation-targets": "^7.26.5",
        "@babel/helper-plugin-utils": "^7.26.5",
        "@babel/helper-validator-option": "^7.25.9",
        "@babel/plugin-bugfix-firefox-class-in-computed-class-key": "^7.25.9",
        "@babel/plugin-bugfix-safari-class-field-initializer-scope": "^7.25.9",
        "@babel/plugin-bugfix-safari-id-destructuring-collision-in-function-expression": "^7.25.9",
        "@babel/plugin-bugfix-v8-spread-parameters-in-optional-chaining": "^7.25.9",
        "@babel/plugin-bugfix-v8-static-class-fields-redefine-readonly": "^7.25.9",
        "@babel/plugin-proposal-private-property-in-object": "7.21.0-placeholder-for-preset-env.2",
        "@babel/plugin-syntax-import-assertions": "^7.26.0",
        "@babel/plugin-syntax-import-attributes": "^7.26.0",
        "@babel/plugin-syntax-unicode-sets-regex": "^7.18.6",
        "@babel/plugin-transform-arrow-functions": "^7.25.9",
        "@babel/plugin-transform-async-generator-functions": "^7.26.8",
        "@babel/plugin-transform-async-to-generator": "^7.25.9",
        "@babel/plugin-transform-block-scoped-functions": "^7.26.5",
        "@babel/plugin-transform-block-scoping": "^7.25.9",
        "@babel/plugin-transform-class-properties": "^7.25.9",
        "@babel/plugin-transform-class-static-block": "^7.26.0",
        "@babel/plugin-transform-classes": "^7.25.9",
        "@babel/plugin-transform-computed-properties": "^7.25.9",
        "@babel/plugin-transform-destructuring": "^7.25.9",
        "@babel/plugin-transform-dotall-regex": "^7.25.9",
        "@babel/plugin-transform-duplicate-keys": "^7.25.9",
        "@babel/plugin-transform-duplicate-named-capturing-groups-regex": "^7.25.9",
        "@babel/plugin-transform-dynamic-import": "^7.25.9",
        "@babel/plugin-transform-exponentiation-operator": "^7.26.3",
        "@babel/plugin-transform-export-namespace-from": "^7.25.9",
        "@babel/plugin-transform-for-of": "^7.26.9",
        "@babel/plugin-transform-function-name": "^7.25.9",
        "@babel/plugin-transform-json-strings": "^7.25.9",
        "@babel/plugin-transform-literals": "^7.25.9",
        "@babel/plugin-transform-logical-assignment-operators": "^7.25.9",
        "@babel/plugin-transform-member-expression-literals": "^7.25.9",
        "@babel/plugin-transform-modules-amd": "^7.25.9",
        "@babel/plugin-transform-modules-commonjs": "^7.26.3",
        "@babel/plugin-transform-modules-systemjs": "^7.25.9",
        "@babel/plugin-transform-modules-umd": "^7.25.9",
        "@babel/plugin-transform-named-capturing-groups-regex": "^7.25.9",
        "@babel/plugin-transform-new-target": "^7.25.9",
        "@babel/plugin-transform-nullish-coalescing-operator": "^7.26.6",
        "@babel/plugin-transform-numeric-separator": "^7.25.9",
        "@babel/plugin-transform-object-rest-spread": "^7.25.9",
        "@babel/plugin-transform-object-super": "^7.25.9",
        "@babel/plugin-transform-optional-catch-binding": "^7.25.9",
        "@babel/plugin-transform-optional-chaining": "^7.25.9",
        "@babel/plugin-transform-parameters": "^7.25.9",
        "@babel/plugin-transform-private-methods": "^7.25.9",
        "@babel/plugin-transform-private-property-in-object": "^7.25.9",
        "@babel/plugin-transform-property-literals": "^7.25.9",
        "@babel/plugin-transform-regenerator": "^7.25.9",
        "@babel/plugin-transform-regexp-modifiers": "^7.26.0",
        "@babel/plugin-transform-reserved-words": "^7.25.9",
        "@babel/plugin-transform-shorthand-properties": "^7.25.9",
        "@babel/plugin-transform-spread": "^7.25.9",
        "@babel/plugin-transform-sticky-regex": "^7.25.9",
        "@babel/plugin-transform-template-literals": "^7.26.8",
        "@babel/plugin-transform-typeof-symbol": "^7.26.7",
        "@babel/plugin-transform-unicode-escapes": "^7.25.9",
        "@babel/plugin-transform-unicode-property-regex": "^7.25.9",
        "@babel/plugin-transform-unicode-regex": "^7.25.9",
        "@babel/plugin-transform-unicode-sets-regex": "^7.25.9",
        "@babel/preset-modules": "0.1.6-no-external-plugins",
        "babel-plugin-polyfill-corejs2": "^0.4.10",
        "babel-plugin-polyfill-corejs3": "^0.11.0",
        "babel-plugin-polyfill-regenerator": "^0.6.1",
        "core-js-compat": "^3.40.0",
        "semver": "^6.3.1"
      },
      "engines": {
        "node": ">=6.9.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0"
      }
    },
    "node_modules/@babel/preset-env/node_modules/semver": {
      "version": "6.3.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/semver/-/semver-6.3.1.tgz",
      "integrity": "sha512-BR7VvDCVHO+q2xBEWskxS6DJE1qRnb7DxzUrogb71CWoSficBxYsiAGd+Kl0mmq/MprG9yArRkyrQxTO6XjMzA==",
      "dev": true,
      "license": "ISC",
      "bin": {
        "semver": "bin/semver.js"
      }
    },
    "node_modules/@babel/preset-modules": {
      "version": "0.1.6-no-external-plugins",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/preset-modules/-/preset-modules-0.1.6-no-external-plugins.tgz",
      "integrity": "sha512-HrcgcIESLm9aIR842yhJ5RWan/gebQUJ6E/E5+rf0y9o6oj7w0Br+sWuL6kEQ/o/AdfvR1Je9jG18/gnpwjEyA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.0.0",
        "@babel/types": "^7.4.4",
        "esutils": "^2.0.2"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0-0 || ^8.0.0-0 <8.0.0"
      }
    },
    "node_modules/@babel/runtime": {
      "version": "7.26.10",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/runtime/-/runtime-7.26.10.tgz",
      "integrity": "sha512-2WJMeRQPHKSPemqk/awGrAiuFfzBmOIPXKizAsVhWH9YJqLZ0H+HS4c8loHGgW6utJ3E/ejXQUsiGaQy2NZ9Fw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "regenerator-runtime": "^0.14.0"
      },
      "engines": {
        "node": ">=6.9.0"
      }
    },
    "node_modules/@babel/template": {
      "version": "7.28.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/template/-/template-7.28.6.tgz",
      "integrity": "sha512-YA6Ma2KsCdGb+WC6UpBVFJGXL58MDA6oyONbjyF/+5sBgxY/dwkhLogbMT2GXXyU84/IhRw/2D1Os1B/giz+BQ==",
      "license": "MIT",
      "dependencies": {
        "@babel/code-frame": "^7.28.6",
        "@babel/parser": "^7.28.6",
        "@babel/types": "^7.28.6"
      },
      "engines": {
        "node": ">=6.9.0"
      }
    },
    "node_modules/@babel/traverse": {
      "version": "7.29.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/traverse/-/traverse-7.29.0.tgz",
      "integrity": "sha512-4HPiQr0X7+waHfyXPZpWPfWL/J7dcN1mx9gL6WdQVMbPnF3+ZhSMs8tCxN7oHddJE9fhNE7+lxdnlyemKfJRuA==",
      "license": "MIT",
      "dependencies": {
        "@babel/code-frame": "^7.29.0",
        "@babel/generator": "^7.29.0",
        "@babel/helper-globals": "^7.28.0",
        "@babel/parser": "^7.29.0",
        "@babel/template": "^7.28.6",
        "@babel/types": "^7.29.0",
        "debug": "^4.3.1"
      },
      "engines": {
        "node": ">=6.9.0"
      }
    },
    "node_modules/@babel/traverse/node_modules/@babel/generator": {
      "version": "7.29.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/generator/-/generator-7.29.1.tgz",
      "integrity": "sha512-qsaF+9Qcm2Qv8SRIMMscAvG4O3lJ0F1GuMo5HR/Bp02LopNgnZBC/EkbevHFeGs4ls/oPz9v+Bsmzbkbe+0dUw==",
      "license": "MIT",
      "dependencies": {
        "@babel/parser": "^7.29.0",
        "@babel/types": "^7.29.0",
        "@jridgewell/gen-mapping": "^0.3.12",
        "@jridgewell/trace-mapping": "^0.3.28",
        "jsesc": "^3.0.2"
      },
      "engines": {
        "node": ">=6.9.0"
      }
    },
    "node_modules/@babel/types": {
      "version": "7.29.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@babel/types/-/types-7.29.0.tgz",
      "integrity": "sha512-LwdZHpScM4Qz8Xw2iKSzS+cfglZzJGvofQICy7W7v4caru4EaAmyUuO6BGrbyQ2mYV11W0U8j5mBhd14dd3B0A==",
      "license": "MIT",
      "dependencies": {
        "@babel/helper-string-parser": "^7.27.1",
        "@babel/helper-validator-identifier": "^7.28.5"
      },
      "engines": {
        "node": ">=6.9.0"
      }
    },
    "node_modules/@bcoe/v8-coverage": {
      "version": "0.2.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@bcoe/v8-coverage/-/v8-coverage-0.2.3.tgz",
      "integrity": "sha512-0hYQ8SB4Db5zvZB4axdMHGwEaQjkZzFjQiN9LVYvIFB2nSUHW9tYpxWriPrWDASIxiaXax83REcLxuSdnGPZtw==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/@braintree/sanitize-url": {
      "version": "7.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@braintree/sanitize-url/-/sanitize-url-7.1.2.tgz",
      "integrity": "sha512-jigsZK+sMF/cuiB7sERuo9V7N9jx+dhmHHnQyDSVdpZwVutaBu7WvNYqMDLSgFgfB30n452TP3vjDAvFC973mA==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/@chevrotain/cst-dts-gen": {
      "version": "11.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@chevrotain/cst-dts-gen/-/cst-dts-gen-11.1.2.tgz",
      "integrity": "sha512-XTsjvDVB5nDZBQB8o0o/0ozNelQtn2KrUVteIHSlPd2VAV2utEb6JzyCJaJ8tGxACR4RiBNWy5uYUHX2eji88Q==",
      "license": "Apache-2.0",
      "optional": true,
      "dependencies": {
        "@chevrotain/gast": "11.1.2",
        "@chevrotain/types": "11.1.2",
        "lodash-es": "4.17.23"
      }
    },
    "node_modules/@chevrotain/gast": {
      "version": "11.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@chevrotain/gast/-/gast-11.1.2.tgz",
      "integrity": "sha512-Z9zfXR5jNZb1Hlsd/p+4XWeUFugrHirq36bKzPWDSIacV+GPSVXdk+ahVWZTwjhNwofAWg/sZg58fyucKSQx5g==",
      "license": "Apache-2.0",
      "optional": true,
      "dependencies": {
        "@chevrotain/types": "11.1.2",
        "lodash-es": "4.17.23"
      }
    },
    "node_modules/@chevrotain/regexp-to-ast": {
      "version": "11.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@chevrotain/regexp-to-ast/-/regexp-to-ast-11.1.2.tgz",
      "integrity": "sha512-nMU3Uj8naWer7xpZTYJdxbAs6RIv/dxYzkYU8GSwgUtcAAlzjcPfX1w+RKRcYG8POlzMeayOQ/znfwxEGo5ulw==",
      "license": "Apache-2.0",
      "optional": true
    },
    "node_modules/@chevrotain/types": {
      "version": "11.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@chevrotain/types/-/types-11.1.2.tgz",
      "integrity": "sha512-U+HFai5+zmJCkK86QsaJtoITlboZHBqrVketcO2ROv865xfCMSFpELQoz1GkX5GzME8pTa+3kbKrZHQtI0gdbw==",
      "license": "Apache-2.0",
      "optional": true
    },
    "node_modules/@chevrotain/utils": {
      "version": "11.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@chevrotain/utils/-/utils-11.1.2.tgz",
      "integrity": "sha512-4mudFAQ6H+MqBTfqLmU7G1ZwRzCLfJEooL/fsF6rCX5eePMbGhoy5n4g+G4vlh2muDcsCTJtL+uKbOzWxs5LHA==",
      "license": "Apache-2.0",
      "optional": true
    },
    "node_modules/@discoveryjs/json-ext": {
      "version": "0.6.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@discoveryjs/json-ext/-/json-ext-0.6.3.tgz",
      "integrity": "sha512-4B4OijXeVNOPZlYA2oEwWOTkzyltLao+xbotHQeqN++Rv27Y6s818+n2Qkp8q+Fxhn0t/5lA5X1Mxktud8eayQ==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=14.17.0"
      }
    },
    "node_modules/@esbuild/aix-ppc64": {
      "version": "0.25.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@esbuild/aix-ppc64/-/aix-ppc64-0.25.4.tgz",
      "integrity": "sha512-1VCICWypeQKhVbE9oW/sJaAmjLxhVqacdkvPLEjwlttjfwENRSClS8EjBz0KzRyFSCPDIkuXW34Je/vk7zdB7Q==",
      "cpu": [
        "ppc64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "aix"
      ],
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@esbuild/android-arm": {
      "version": "0.25.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@esbuild/android-arm/-/android-arm-0.25.4.tgz",
      "integrity": "sha512-QNdQEps7DfFwE3hXiU4BZeOV68HHzYwGd0Nthhd3uCkkEKK7/R6MTgM0P7H7FAs5pU/DIWsviMmEGxEoxIZ+ZQ==",
      "cpu": [
        "arm"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "android"
      ],
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@esbuild/android-arm64": {
      "version": "0.25.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@esbuild/android-arm64/-/android-arm64-0.25.4.tgz",
      "integrity": "sha512-bBy69pgfhMGtCnwpC/x5QhfxAz/cBgQ9enbtwjf6V9lnPI/hMyT9iWpR1arm0l3kttTr4L0KSLpKmLp/ilKS9A==",
      "cpu": [
        "arm64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "android"
      ],
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@esbuild/android-x64": {
      "version": "0.25.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@esbuild/android-x64/-/android-x64-0.25.4.tgz",
      "integrity": "sha512-TVhdVtQIFuVpIIR282btcGC2oGQoSfZfmBdTip2anCaVYcqWlZXGcdcKIUklfX2wj0JklNYgz39OBqh2cqXvcQ==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "android"
      ],
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@esbuild/darwin-arm64": {
      "version": "0.25.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@esbuild/darwin-arm64/-/darwin-arm64-0.25.4.tgz",
      "integrity": "sha512-Y1giCfM4nlHDWEfSckMzeWNdQS31BQGs9/rouw6Ub91tkK79aIMTH3q9xHvzH8d0wDru5Ci0kWB8b3up/nl16g==",
      "cpu": [
        "arm64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "darwin"
      ],
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@esbuild/darwin-x64": {
      "version": "0.25.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@esbuild/darwin-x64/-/darwin-x64-0.25.4.tgz",
      "integrity": "sha512-CJsry8ZGM5VFVeyUYB3cdKpd/H69PYez4eJh1W/t38vzutdjEjtP7hB6eLKBoOdxcAlCtEYHzQ/PJ/oU9I4u0A==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "darwin"
      ],
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@esbuild/freebsd-arm64": {
      "version": "0.25.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@esbuild/freebsd-arm64/-/freebsd-arm64-0.25.4.tgz",
      "integrity": "sha512-yYq+39NlTRzU2XmoPW4l5Ifpl9fqSk0nAJYM/V/WUGPEFfek1epLHJIkTQM6bBs1swApjO5nWgvr843g6TjxuQ==",
      "cpu": [
        "arm64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "freebsd"
      ],
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@esbuild/freebsd-x64": {
      "version": "0.25.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@esbuild/freebsd-x64/-/freebsd-x64-0.25.4.tgz",
      "integrity": "sha512-0FgvOJ6UUMflsHSPLzdfDnnBBVoCDtBTVyn/MrWloUNvq/5SFmh13l3dvgRPkDihRxb77Y17MbqbCAa2strMQQ==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "freebsd"
      ],
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@esbuild/linux-arm": {
      "version": "0.25.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@esbuild/linux-arm/-/linux-arm-0.25.4.tgz",
      "integrity": "sha512-kro4c0P85GMfFYqW4TWOpvmF8rFShbWGnrLqlzp4X1TNWjRY3JMYUfDCtOxPKOIY8B0WC8HN51hGP4I4hz4AaQ==",
      "cpu": [
        "arm"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ],
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@esbuild/linux-arm64": {
      "version": "0.25.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@esbuild/linux-arm64/-/linux-arm64-0.25.4.tgz",
      "integrity": "sha512-+89UsQTfXdmjIvZS6nUnOOLoXnkUTB9hR5QAeLrQdzOSWZvNSAXAtcRDHWtqAUtAmv7ZM1WPOOeSxDzzzMogiQ==",
      "cpu": [
        "arm64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ],
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@esbuild/linux-ia32": {
      "version": "0.25.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@esbuild/linux-ia32/-/linux-ia32-0.25.4.tgz",
      "integrity": "sha512-yTEjoapy8UP3rv8dB0ip3AfMpRbyhSN3+hY8mo/i4QXFeDxmiYbEKp3ZRjBKcOP862Ua4b1PDfwlvbuwY7hIGQ==",
      "cpu": [
        "ia32"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ],
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@esbuild/linux-loong64": {
      "version": "0.25.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@esbuild/linux-loong64/-/linux-loong64-0.25.4.tgz",
      "integrity": "sha512-NeqqYkrcGzFwi6CGRGNMOjWGGSYOpqwCjS9fvaUlX5s3zwOtn1qwg1s2iE2svBe4Q/YOG1q6875lcAoQK/F4VA==",
      "cpu": [
        "loong64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ],
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@esbuild/linux-mips64el": {
      "version": "0.25.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@esbuild/linux-mips64el/-/linux-mips64el-0.25.4.tgz",
      "integrity": "sha512-IcvTlF9dtLrfL/M8WgNI/qJYBENP3ekgsHbYUIzEzq5XJzzVEV/fXY9WFPfEEXmu3ck2qJP8LG/p3Q8f7Zc2Xg==",
      "cpu": [
        "mips64el"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ],
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@esbuild/linux-ppc64": {
      "version": "0.25.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@esbuild/linux-ppc64/-/linux-ppc64-0.25.4.tgz",
      "integrity": "sha512-HOy0aLTJTVtoTeGZh4HSXaO6M95qu4k5lJcH4gxv56iaycfz1S8GO/5Jh6X4Y1YiI0h7cRyLi+HixMR+88swag==",
      "cpu": [
        "ppc64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ],
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@esbuild/linux-riscv64": {
      "version": "0.25.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@esbuild/linux-riscv64/-/linux-riscv64-0.25.4.tgz",
      "integrity": "sha512-i8JUDAufpz9jOzo4yIShCTcXzS07vEgWzyX3NH2G7LEFVgrLEhjwL3ajFE4fZI3I4ZgiM7JH3GQ7ReObROvSUA==",
      "cpu": [
        "riscv64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ],
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@esbuild/linux-s390x": {
      "version": "0.25.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@esbuild/linux-s390x/-/linux-s390x-0.25.4.tgz",
      "integrity": "sha512-jFnu+6UbLlzIjPQpWCNh5QtrcNfMLjgIavnwPQAfoGx4q17ocOU9MsQ2QVvFxwQoWpZT8DvTLooTvmOQXkO51g==",
      "cpu": [
        "s390x"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ],
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@esbuild/linux-x64": {
      "version": "0.25.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@esbuild/linux-x64/-/linux-x64-0.25.4.tgz",
      "integrity": "sha512-6e0cvXwzOnVWJHq+mskP8DNSrKBr1bULBvnFLpc1KY+d+irZSgZ02TGse5FsafKS5jg2e4pbvK6TPXaF/A6+CA==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ],
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@esbuild/netbsd-arm64": {
      "version": "0.25.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@esbuild/netbsd-arm64/-/netbsd-arm64-0.25.4.tgz",
      "integrity": "sha512-vUnkBYxZW4hL/ie91hSqaSNjulOnYXE1VSLusnvHg2u3jewJBz3YzB9+oCw8DABeVqZGg94t9tyZFoHma8gWZQ==",
      "cpu": [
        "arm64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "netbsd"
      ],
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@esbuild/netbsd-x64": {
      "version": "0.25.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@esbuild/netbsd-x64/-/netbsd-x64-0.25.4.tgz",
      "integrity": "sha512-XAg8pIQn5CzhOB8odIcAm42QsOfa98SBeKUdo4xa8OvX8LbMZqEtgeWE9P/Wxt7MlG2QqvjGths+nq48TrUiKw==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "netbsd"
      ],
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@esbuild/openbsd-arm64": {
      "version": "0.25.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@esbuild/openbsd-arm64/-/openbsd-arm64-0.25.4.tgz",
      "integrity": "sha512-Ct2WcFEANlFDtp1nVAXSNBPDxyU+j7+tId//iHXU2f/lN5AmO4zLyhDcpR5Cz1r08mVxzt3Jpyt4PmXQ1O6+7A==",
      "cpu": [
        "arm64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "openbsd"
      ],
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@esbuild/openbsd-x64": {
      "version": "0.25.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@esbuild/openbsd-x64/-/openbsd-x64-0.25.4.tgz",
      "integrity": "sha512-xAGGhyOQ9Otm1Xu8NT1ifGLnA6M3sJxZ6ixylb+vIUVzvvd6GOALpwQrYrtlPouMqd/vSbgehz6HaVk4+7Afhw==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "openbsd"
      ],
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@esbuild/sunos-x64": {
      "version": "0.25.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@esbuild/sunos-x64/-/sunos-x64-0.25.4.tgz",
      "integrity": "sha512-Mw+tzy4pp6wZEK0+Lwr76pWLjrtjmJyUB23tHKqEDP74R3q95luY/bXqXZeYl4NYlvwOqoRKlInQialgCKy67Q==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "sunos"
      ],
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@esbuild/win32-arm64": {
      "version": "0.25.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@esbuild/win32-arm64/-/win32-arm64-0.25.4.tgz",
      "integrity": "sha512-AVUP428VQTSddguz9dO9ngb+E5aScyg7nOeJDrF1HPYu555gmza3bDGMPhmVXL8svDSoqPCsCPjb265yG/kLKQ==",
      "cpu": [
        "arm64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "win32"
      ],
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@esbuild/win32-ia32": {
      "version": "0.25.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@esbuild/win32-ia32/-/win32-ia32-0.25.4.tgz",
      "integrity": "sha512-i1sW+1i+oWvQzSgfRcxxG2k4I9n3O9NRqy8U+uugaT2Dy7kLO9Y7wI72haOahxceMX8hZAzgGou1FhndRldxRg==",
      "cpu": [
        "ia32"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "win32"
      ],
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@esbuild/win32-x64": {
      "version": "0.25.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@esbuild/win32-x64/-/win32-x64-0.25.4.tgz",
      "integrity": "sha512-nOT2vZNw6hJ+z43oP1SPea/G/6AbN6X+bGNhNuq8NtRHy4wsMhw765IKLNmnjek7GvjWBYQ8Q5VBoYTFg9y1UQ==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "win32"
      ],
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@iconify/types": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@iconify/types/-/types-2.0.0.tgz",
      "integrity": "sha512-+wluvCrRhXrhyOmRDJ3q8mux9JkKy5SJ/v8ol2tu4FVjyYvtEzkc/3pK15ET6RKg4b4w4BmTk1+gsCUhf21Ykg==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/@iconify/utils": {
      "version": "3.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@iconify/utils/-/utils-3.1.0.tgz",
      "integrity": "sha512-Zlzem1ZXhI1iHeeERabLNzBHdOa4VhQbqAcOQaMKuTuyZCpwKbC2R4Dd0Zo3g9EAc+Y4fiarO8HIHRAth7+skw==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "@antfu/install-pkg": "^1.1.0",
        "@iconify/types": "^2.0.0",
        "mlly": "^1.8.0"
      }
    },
    "node_modules/@inquirer/ansi": {
      "version": "1.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@inquirer/ansi/-/ansi-1.0.2.tgz",
      "integrity": "sha512-S8qNSZiYzFd0wAcyG5AXCvUHC5Sr7xpZ9wZ2py9XR88jUz8wooStVx5M6dRzczbBWjic9NP7+rY0Xi7qqK/aMQ==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@inquirer/checkbox": {
      "version": "4.3.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@inquirer/checkbox/-/checkbox-4.3.2.tgz",
      "integrity": "sha512-VXukHf0RR1doGe6Sm4F0Em7SWYLTHSsbGfJdS9Ja2bX5/D5uwVOEjr07cncLROdBvmnvCATYEWlHqYmXv2IlQA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@inquirer/ansi": "^1.0.2",
        "@inquirer/core": "^10.3.2",
        "@inquirer/figures": "^1.0.15",
        "@inquirer/type": "^3.0.10",
        "yoctocolors-cjs": "^2.1.3"
      },
      "engines": {
        "node": ">=18"
      },
      "peerDependencies": {
        "@types/node": ">=18"
      },
      "peerDependenciesMeta": {
        "@types/node": {
          "optional": true
        }
      }
    },
    "node_modules/@inquirer/confirm": {
      "version": "5.1.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@inquirer/confirm/-/confirm-5.1.6.tgz",
      "integrity": "sha512-6ZXYK3M1XmaVBZX6FCfChgtponnL0R6I7k8Nu+kaoNkT828FVZTcca1MqmWQipaW2oNREQl5AaPCUOOCVNdRMw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@inquirer/core": "^10.1.7",
        "@inquirer/type": "^3.0.4"
      },
      "engines": {
        "node": ">=18"
      },
      "peerDependencies": {
        "@types/node": ">=18"
      },
      "peerDependenciesMeta": {
        "@types/node": {
          "optional": true
        }
      }
    },
    "node_modules/@inquirer/core": {
      "version": "10.3.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@inquirer/core/-/core-10.3.2.tgz",
      "integrity": "sha512-43RTuEbfP8MbKzedNqBrlhhNKVwoK//vUFNW3Q3vZ88BLcrs4kYpGg+B2mm5p2K/HfygoCxuKwJJiv8PbGmE0A==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@inquirer/ansi": "^1.0.2",
        "@inquirer/figures": "^1.0.15",
        "@inquirer/type": "^3.0.10",
        "cli-width": "^4.1.0",
        "mute-stream": "^2.0.0",
        "signal-exit": "^4.1.0",
        "wrap-ansi": "^6.2.0",
        "yoctocolors-cjs": "^2.1.3"
      },
      "engines": {
        "node": ">=18"
      },
      "peerDependencies": {
        "@types/node": ">=18"
      },
      "peerDependenciesMeta": {
        "@types/node": {
          "optional": true
        }
      }
    },
    "node_modules/@inquirer/editor": {
      "version": "4.2.23",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@inquirer/editor/-/editor-4.2.23.tgz",
      "integrity": "sha512-aLSROkEwirotxZ1pBaP8tugXRFCxW94gwrQLxXfrZsKkfjOYC1aRvAZuhpJOb5cu4IBTJdsCigUlf2iCOu4ZDQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@inquirer/core": "^10.3.2",
        "@inquirer/external-editor": "^1.0.3",
        "@inquirer/type": "^3.0.10"
      },
      "engines": {
        "node": ">=18"
      },
      "peerDependencies": {
        "@types/node": ">=18"
      },
      "peerDependenciesMeta": {
        "@types/node": {
          "optional": true
        }
      }
    },
    "node_modules/@inquirer/expand": {
      "version": "4.0.23",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@inquirer/expand/-/expand-4.0.23.tgz",
      "integrity": "sha512-nRzdOyFYnpeYTTR2qFwEVmIWypzdAx/sIkCMeTNTcflFOovfqUk+HcFhQQVBftAh9gmGrpFj6QcGEqrDMDOiew==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@inquirer/core": "^10.3.2",
        "@inquirer/type": "^3.0.10",
        "yoctocolors-cjs": "^2.1.3"
      },
      "engines": {
        "node": ">=18"
      },
      "peerDependencies": {
        "@types/node": ">=18"
      },
      "peerDependenciesMeta": {
        "@types/node": {
          "optional": true
        }
      }
    },
    "node_modules/@inquirer/external-editor": {
      "version": "1.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@inquirer/external-editor/-/external-editor-1.0.3.tgz",
      "integrity": "sha512-RWbSrDiYmO4LbejWY7ttpxczuwQyZLBUyygsA9Nsv95hpzUWwnNTVQmAq3xuh7vNwCp07UTmE5i11XAEExx4RA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "chardet": "^2.1.1",
        "iconv-lite": "^0.7.0"
      },
      "engines": {
        "node": ">=18"
      },
      "peerDependencies": {
        "@types/node": ">=18"
      },
      "peerDependenciesMeta": {
        "@types/node": {
          "optional": true
        }
      }
    },
    "node_modules/@inquirer/figures": {
      "version": "1.0.15",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@inquirer/figures/-/figures-1.0.15.tgz",
      "integrity": "sha512-t2IEY+unGHOzAaVM5Xx6DEWKeXlDDcNPeDyUpsRc6CUhBfU3VQOEl+Vssh7VNp1dR8MdUJBWhuObjXCsVpjN5g==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@inquirer/input": {
      "version": "4.3.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@inquirer/input/-/input-4.3.1.tgz",
      "integrity": "sha512-kN0pAM4yPrLjJ1XJBjDxyfDduXOuQHrBB8aLDMueuwUGn+vNpF7Gq7TvyVxx8u4SHlFFj4trmj+a2cbpG4Jn1g==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@inquirer/core": "^10.3.2",
        "@inquirer/type": "^3.0.10"
      },
      "engines": {
        "node": ">=18"
      },
      "peerDependencies": {
        "@types/node": ">=18"
      },
      "peerDependenciesMeta": {
        "@types/node": {
          "optional": true
        }
      }
    },
    "node_modules/@inquirer/number": {
      "version": "3.0.23",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@inquirer/number/-/number-3.0.23.tgz",
      "integrity": "sha512-5Smv0OK7K0KUzUfYUXDXQc9jrf8OHo4ktlEayFlelCjwMXz0299Y8OrI+lj7i4gCBY15UObk76q0QtxjzFcFcg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@inquirer/core": "^10.3.2",
        "@inquirer/type": "^3.0.10"
      },
      "engines": {
        "node": ">=18"
      },
      "peerDependencies": {
        "@types/node": ">=18"
      },
      "peerDependenciesMeta": {
        "@types/node": {
          "optional": true
        }
      }
    },
    "node_modules/@inquirer/password": {
      "version": "4.0.23",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@inquirer/password/-/password-4.0.23.tgz",
      "integrity": "sha512-zREJHjhT5vJBMZX/IUbyI9zVtVfOLiTO66MrF/3GFZYZ7T4YILW5MSkEYHceSii/KtRk+4i3RE7E1CUXA2jHcA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@inquirer/ansi": "^1.0.2",
        "@inquirer/core": "^10.3.2",
        "@inquirer/type": "^3.0.10"
      },
      "engines": {
        "node": ">=18"
      },
      "peerDependencies": {
        "@types/node": ">=18"
      },
      "peerDependenciesMeta": {
        "@types/node": {
          "optional": true
        }
      }
    },
    "node_modules/@inquirer/prompts": {
      "version": "7.3.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@inquirer/prompts/-/prompts-7.3.2.tgz",
      "integrity": "sha512-G1ytyOoHh5BphmEBxSwALin3n1KGNYB6yImbICcRQdzXfOGbuJ9Jske/Of5Sebk339NSGGNfUshnzK8YWkTPsQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@inquirer/checkbox": "^4.1.2",
        "@inquirer/confirm": "^5.1.6",
        "@inquirer/editor": "^4.2.7",
        "@inquirer/expand": "^4.0.9",
        "@inquirer/input": "^4.1.6",
        "@inquirer/number": "^3.0.9",
        "@inquirer/password": "^4.0.9",
        "@inquirer/rawlist": "^4.0.9",
        "@inquirer/search": "^3.0.9",
        "@inquirer/select": "^4.0.9"
      },
      "engines": {
        "node": ">=18"
      },
      "peerDependencies": {
        "@types/node": ">=18"
      },
      "peerDependenciesMeta": {
        "@types/node": {
          "optional": true
        }
      }
    },
    "node_modules/@inquirer/rawlist": {
      "version": "4.1.11",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@inquirer/rawlist/-/rawlist-4.1.11.tgz",
      "integrity": "sha512-+LLQB8XGr3I5LZN/GuAHo+GpDJegQwuPARLChlMICNdwW7OwV2izlCSCxN6cqpL0sMXmbKbFcItJgdQq5EBXTw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@inquirer/core": "^10.3.2",
        "@inquirer/type": "^3.0.10",
        "yoctocolors-cjs": "^2.1.3"
      },
      "engines": {
        "node": ">=18"
      },
      "peerDependencies": {
        "@types/node": ">=18"
      },
      "peerDependenciesMeta": {
        "@types/node": {
          "optional": true
        }
      }
    },
    "node_modules/@inquirer/search": {
      "version": "3.2.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@inquirer/search/-/search-3.2.2.tgz",
      "integrity": "sha512-p2bvRfENXCZdWF/U2BXvnSI9h+tuA8iNqtUKb9UWbmLYCRQxd8WkvwWvYn+3NgYaNwdUkHytJMGG4MMLucI1kA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@inquirer/core": "^10.3.2",
        "@inquirer/figures": "^1.0.15",
        "@inquirer/type": "^3.0.10",
        "yoctocolors-cjs": "^2.1.3"
      },
      "engines": {
        "node": ">=18"
      },
      "peerDependencies": {
        "@types/node": ">=18"
      },
      "peerDependenciesMeta": {
        "@types/node": {
          "optional": true
        }
      }
    },
    "node_modules/@inquirer/select": {
      "version": "4.4.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@inquirer/select/-/select-4.4.2.tgz",
      "integrity": "sha512-l4xMuJo55MAe+N7Qr4rX90vypFwCajSakx59qe/tMaC1aEHWLyw68wF4o0A4SLAY4E0nd+Vt+EyskeDIqu1M6w==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@inquirer/ansi": "^1.0.2",
        "@inquirer/core": "^10.3.2",
        "@inquirer/figures": "^1.0.15",
        "@inquirer/type": "^3.0.10",
        "yoctocolors-cjs": "^2.1.3"
      },
      "engines": {
        "node": ">=18"
      },
      "peerDependencies": {
        "@types/node": ">=18"
      },
      "peerDependenciesMeta": {
        "@types/node": {
          "optional": true
        }
      }
    },
    "node_modules/@inquirer/type": {
      "version": "3.0.10",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@inquirer/type/-/type-3.0.10.tgz",
      "integrity": "sha512-BvziSRxfz5Ov8ch0z/n3oijRSEcEsHnhggm4xFZe93DHcUCTlutlq9Ox4SVENAfcRD22UQq7T/atg9Wr3k09eA==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=18"
      },
      "peerDependencies": {
        "@types/node": ">=18"
      },
      "peerDependenciesMeta": {
        "@types/node": {
          "optional": true
        }
      }
    },
    "node_modules/@isaacs/cliui": {
      "version": "8.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@isaacs/cliui/-/cliui-8.0.2.tgz",
      "integrity": "sha512-O8jcjabXaleOG9DQ0+ARXWZBTfnP4WNAqzuiJK7ll44AmxGKv/J2M4TPjxjY3znBCfvBXFzucm1twdyFybFqEA==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "string-width": "^5.1.2",
        "string-width-cjs": "npm:string-width@^4.2.0",
        "strip-ansi": "^7.0.1",
        "strip-ansi-cjs": "npm:strip-ansi@^6.0.1",
        "wrap-ansi": "^8.1.0",
        "wrap-ansi-cjs": "npm:wrap-ansi@^7.0.0"
      },
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/@isaacs/cliui/node_modules/ansi-regex": {
      "version": "6.2.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ansi-regex/-/ansi-regex-6.2.2.tgz",
      "integrity": "sha512-Bq3SmSpyFHaWjPk8If9yc6svM8c56dB5BAtW4Qbw5jHTwwXXcTLoRMkpDJp6VL0XzlWaCHTXrkFURMYmD0sLqg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=12"
      },
      "funding": {
        "url": "https://github.com/chalk/ansi-regex?sponsor=1"
      }
    },
    "node_modules/@isaacs/cliui/node_modules/ansi-styles": {
      "version": "6.2.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ansi-styles/-/ansi-styles-6.2.3.tgz",
      "integrity": "sha512-4Dj6M28JB+oAH8kFkTLUo+a2jwOFkuqb3yucU0CANcRRUbxS0cP0nZYCGjcc3BNXwRIsUVmDGgzawme7zvJHvg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=12"
      },
      "funding": {
        "url": "https://github.com/chalk/ansi-styles?sponsor=1"
      }
    },
    "node_modules/@isaacs/cliui/node_modules/emoji-regex": {
      "version": "9.2.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/emoji-regex/-/emoji-regex-9.2.2.tgz",
      "integrity": "sha512-L18DaJsXSUk2+42pv8mLs5jJT2hqFkFE4j21wOmgbUqsZ2hL72NsUU785g9RXgo3s0ZNgVl42TiHp3ZtOv/Vyg==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/@isaacs/cliui/node_modules/string-width": {
      "version": "5.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/string-width/-/string-width-5.1.2.tgz",
      "integrity": "sha512-HnLOCR3vjcY8beoNLtcjZ5/nxn2afmME6lhrDrebokqMap+XbeW8n9TXpPDOqdGK5qcI3oT0GKTW6wC7EMiVqA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "eastasianwidth": "^0.2.0",
        "emoji-regex": "^9.2.2",
        "strip-ansi": "^7.0.1"
      },
      "engines": {
        "node": ">=12"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/@isaacs/cliui/node_modules/strip-ansi": {
      "version": "7.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/strip-ansi/-/strip-ansi-7.2.0.tgz",
      "integrity": "sha512-yDPMNjp4WyfYBkHnjIRLfca1i6KMyGCtsVgoKe/z1+6vukgaENdgGBZt+ZmKPc4gavvEZ5OgHfHdrazhgNyG7w==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "ansi-regex": "^6.2.2"
      },
      "engines": {
        "node": ">=12"
      },
      "funding": {
        "url": "https://github.com/chalk/strip-ansi?sponsor=1"
      }
    },
    "node_modules/@isaacs/cliui/node_modules/wrap-ansi": {
      "version": "8.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/wrap-ansi/-/wrap-ansi-8.1.0.tgz",
      "integrity": "sha512-si7QWI6zUMq56bESFvagtmzMdGOtoxfR+Sez11Mobfc7tm+VkUckk9bW2UeffTGVUbOksxmSw0AA2gs8g71NCQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "ansi-styles": "^6.1.0",
        "string-width": "^5.0.1",
        "strip-ansi": "^7.0.1"
      },
      "engines": {
        "node": ">=12"
      },
      "funding": {
        "url": "https://github.com/chalk/wrap-ansi?sponsor=1"
      }
    },
    "node_modules/@isaacs/fs-minipass": {
      "version": "4.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@isaacs/fs-minipass/-/fs-minipass-4.0.1.tgz",
      "integrity": "sha512-wgm9Ehl2jpeqP3zw/7mo3kRHFp5MEDhqAdwy1fTGkHAwnkGOVsgpvQhL8B5n1qlb01jV3n/bI0ZfZp5lWA1k4w==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "minipass": "^7.0.4"
      },
      "engines": {
        "node": ">=18.0.0"
      }
    },
    "node_modules/@istanbuljs/load-nyc-config": {
      "version": "1.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@istanbuljs/load-nyc-config/-/load-nyc-config-1.1.0.tgz",
      "integrity": "sha512-VjeHSlIzpv/NyD3N0YuHfXOPDIixcA1q2ZV98wsMqcYlPmv2n3Yb2lYP9XMElnaFVXg5A7YLTeLu6V84uQDjmQ==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "camelcase": "^5.3.1",
        "find-up": "^4.1.0",
        "get-package-type": "^0.1.0",
        "js-yaml": "^3.13.1",
        "resolve-from": "^5.0.0"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/@istanbuljs/schema": {
      "version": "0.1.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@istanbuljs/schema/-/schema-0.1.3.tgz",
      "integrity": "sha512-ZXRY4jNvVgSVQ8DL3LTcakaAtXwTVUxE81hslsyD2AtoXW/wVob10HkOJ1X/pAlcI7D+2YoZKg5do8G/w6RYgA==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/@jest/console": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jest/console/-/console-29.7.0.tgz",
      "integrity": "sha512-5Ni4CU7XHQi32IJ398EEP4RrB8eV09sXP2ROqD4bksHrnTree52PsxvX8tpL8LvTZ3pFzXyPbNQReSN41CAhOg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@jest/types": "^29.6.3",
        "@types/node": "*",
        "chalk": "^4.0.0",
        "jest-message-util": "^29.7.0",
        "jest-util": "^29.7.0",
        "slash": "^3.0.0"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/@jest/console/node_modules/slash": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/slash/-/slash-3.0.0.tgz",
      "integrity": "sha512-g9Q1haeby36OSStwb4ntCGGGaKsaVSjQ68fBxoQcutl5fS1vuY18H3wSt3jFyFtrkx+Kz0V1G85A4MyAdDMi2Q==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/@jest/core": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jest/core/-/core-29.7.0.tgz",
      "integrity": "sha512-n7aeXWKMnGtDA48y8TLWJPJmLmmZ642Ceo78cYWEpiD7FzDgmNDV/GCVRorPABdXLJZ/9wzzgZAlHjXjxDHGsg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@jest/console": "^29.7.0",
        "@jest/reporters": "^29.7.0",
        "@jest/test-result": "^29.7.0",
        "@jest/transform": "^29.7.0",
        "@jest/types": "^29.6.3",
        "@types/node": "*",
        "ansi-escapes": "^4.2.1",
        "chalk": "^4.0.0",
        "ci-info": "^3.2.0",
        "exit": "^0.1.2",
        "graceful-fs": "^4.2.9",
        "jest-changed-files": "^29.7.0",
        "jest-config": "^29.7.0",
        "jest-haste-map": "^29.7.0",
        "jest-message-util": "^29.7.0",
        "jest-regex-util": "^29.6.3",
        "jest-resolve": "^29.7.0",
        "jest-resolve-dependencies": "^29.7.0",
        "jest-runner": "^29.7.0",
        "jest-runtime": "^29.7.0",
        "jest-snapshot": "^29.7.0",
        "jest-util": "^29.7.0",
        "jest-validate": "^29.7.0",
        "jest-watcher": "^29.7.0",
        "micromatch": "^4.0.4",
        "pretty-format": "^29.7.0",
        "slash": "^3.0.0",
        "strip-ansi": "^6.0.0"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      },
      "peerDependencies": {
        "node-notifier": "^8.0.1 || ^9.0.0 || ^10.0.0"
      },
      "peerDependenciesMeta": {
        "node-notifier": {
          "optional": true
        }
      }
    },
    "node_modules/@jest/core/node_modules/slash": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/slash/-/slash-3.0.0.tgz",
      "integrity": "sha512-g9Q1haeby36OSStwb4ntCGGGaKsaVSjQ68fBxoQcutl5fS1vuY18H3wSt3jFyFtrkx+Kz0V1G85A4MyAdDMi2Q==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/@jest/environment": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jest/environment/-/environment-29.7.0.tgz",
      "integrity": "sha512-aQIfHDq33ExsN4jP1NWGXhxgQ/wixs60gDiKO+XVMd8Mn0NWPWgc34ZQDTb2jKaUWQ7MuwoitXAsN2XVXNMpAw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@jest/fake-timers": "^29.7.0",
        "@jest/types": "^29.6.3",
        "@types/node": "*",
        "jest-mock": "^29.7.0"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/@jest/expect": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jest/expect/-/expect-29.7.0.tgz",
      "integrity": "sha512-8uMeAMycttpva3P1lBHB8VciS9V0XAr3GymPpipdyQXbBcuhkLQOSe8E/p92RyAdToS6ZD1tFkX+CkhoECE0dQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "expect": "^29.7.0",
        "jest-snapshot": "^29.7.0"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/@jest/expect-utils": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jest/expect-utils/-/expect-utils-29.7.0.tgz",
      "integrity": "sha512-GlsNBWiFQFCVi9QVSx7f5AgMeLxe9YCCs5PuP2O2LdjDAA8Jh9eX7lA1Jq/xdXw3Wb3hyvlFNfZIfcRetSzYcA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "jest-get-type": "^29.6.3"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/@jest/fake-timers": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jest/fake-timers/-/fake-timers-29.7.0.tgz",
      "integrity": "sha512-q4DH1Ha4TTFPdxLsqDXK1d3+ioSL7yL5oCMJZgDYm6i+6CygW5E5xVr/D1HdsGxjt1ZWSfUAs9OxSB/BNelWrQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@jest/types": "^29.6.3",
        "@sinonjs/fake-timers": "^10.0.2",
        "@types/node": "*",
        "jest-message-util": "^29.7.0",
        "jest-mock": "^29.7.0",
        "jest-util": "^29.7.0"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/@jest/globals": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jest/globals/-/globals-29.7.0.tgz",
      "integrity": "sha512-mpiz3dutLbkW2MNFubUGUEVLkTGiqW6yLVTA+JbP6fI6J5iL9Y0Nlg8k95pcF8ctKwCS7WVxteBs29hhfAotzQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@jest/environment": "^29.7.0",
        "@jest/expect": "^29.7.0",
        "@jest/types": "^29.6.3",
        "jest-mock": "^29.7.0"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/@jest/reporters": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jest/reporters/-/reporters-29.7.0.tgz",
      "integrity": "sha512-DApq0KJbJOEzAFYjHADNNxAE3KbhxQB1y5Kplb5Waqw6zVbuWatSnMjE5gs8FUgEPmNsnZA3NCWl9NG0ia04Pg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@bcoe/v8-coverage": "^0.2.3",
        "@jest/console": "^29.7.0",
        "@jest/test-result": "^29.7.0",
        "@jest/transform": "^29.7.0",
        "@jest/types": "^29.6.3",
        "@jridgewell/trace-mapping": "^0.3.18",
        "@types/node": "*",
        "chalk": "^4.0.0",
        "collect-v8-coverage": "^1.0.0",
        "exit": "^0.1.2",
        "glob": "^7.1.3",
        "graceful-fs": "^4.2.9",
        "istanbul-lib-coverage": "^3.0.0",
        "istanbul-lib-instrument": "^6.0.0",
        "istanbul-lib-report": "^3.0.0",
        "istanbul-lib-source-maps": "^4.0.0",
        "istanbul-reports": "^3.1.3",
        "jest-message-util": "^29.7.0",
        "jest-util": "^29.7.0",
        "jest-worker": "^29.7.0",
        "slash": "^3.0.0",
        "string-length": "^4.0.1",
        "strip-ansi": "^6.0.0",
        "v8-to-istanbul": "^9.0.1"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      },
      "peerDependencies": {
        "node-notifier": "^8.0.1 || ^9.0.0 || ^10.0.0"
      },
      "peerDependenciesMeta": {
        "node-notifier": {
          "optional": true
        }
      }
    },
    "node_modules/@jest/reporters/node_modules/slash": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/slash/-/slash-3.0.0.tgz",
      "integrity": "sha512-g9Q1haeby36OSStwb4ntCGGGaKsaVSjQ68fBxoQcutl5fS1vuY18H3wSt3jFyFtrkx+Kz0V1G85A4MyAdDMi2Q==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/@jest/schemas": {
      "version": "29.6.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jest/schemas/-/schemas-29.6.3.tgz",
      "integrity": "sha512-mo5j5X+jIZmJQveBKeS/clAueipV7KgiX1vMgCxam1RNYiqE1w62n0/tJJnHtjW8ZHcQco5gY85jA3mi0L+nSA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@sinclair/typebox": "^0.27.8"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/@jest/source-map": {
      "version": "29.6.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jest/source-map/-/source-map-29.6.3.tgz",
      "integrity": "sha512-MHjT95QuipcPrpLM+8JMSzFx6eHp5Bm+4XeFDJlwsvVBjmKNiIAvasGK2fxz2WbGRlnvqehFbh07MMa7n3YJnw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@jridgewell/trace-mapping": "^0.3.18",
        "callsites": "^3.0.0",
        "graceful-fs": "^4.2.9"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/@jest/test-result": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jest/test-result/-/test-result-29.7.0.tgz",
      "integrity": "sha512-Fdx+tv6x1zlkJPcWXmMDAG2HBnaR9XPSd5aDWQVsfrZmLVT3lU1cwyxLgRmXR9yrq4NBoEm9BMsfgFzTQAbJYA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@jest/console": "^29.7.0",
        "@jest/types": "^29.6.3",
        "@types/istanbul-lib-coverage": "^2.0.0",
        "collect-v8-coverage": "^1.0.0"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/@jest/test-sequencer": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jest/test-sequencer/-/test-sequencer-29.7.0.tgz",
      "integrity": "sha512-GQwJ5WZVrKnOJuiYiAF52UNUJXgTZx1NHjFSEB0qEMmSZKAkdMoIzw/Cj6x6NF4AvV23AUqDpFzQkN/eYCYTxw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@jest/test-result": "^29.7.0",
        "graceful-fs": "^4.2.9",
        "jest-haste-map": "^29.7.0",
        "slash": "^3.0.0"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/@jest/test-sequencer/node_modules/slash": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/slash/-/slash-3.0.0.tgz",
      "integrity": "sha512-g9Q1haeby36OSStwb4ntCGGGaKsaVSjQ68fBxoQcutl5fS1vuY18H3wSt3jFyFtrkx+Kz0V1G85A4MyAdDMi2Q==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/@jest/transform": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jest/transform/-/transform-29.7.0.tgz",
      "integrity": "sha512-ok/BTPFzFKVMwO5eOHRrvnBVHdRy9IrsrW1GpMaQ9MCnilNLXQKmAX8s1YXDFaai9xJpac2ySzV0YeRRECr2Vw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/core": "^7.11.6",
        "@jest/types": "^29.6.3",
        "@jridgewell/trace-mapping": "^0.3.18",
        "babel-plugin-istanbul": "^6.1.1",
        "chalk": "^4.0.0",
        "convert-source-map": "^2.0.0",
        "fast-json-stable-stringify": "^2.1.0",
        "graceful-fs": "^4.2.9",
        "jest-haste-map": "^29.7.0",
        "jest-regex-util": "^29.6.3",
        "jest-util": "^29.7.0",
        "micromatch": "^4.0.4",
        "pirates": "^4.0.4",
        "slash": "^3.0.0",
        "write-file-atomic": "^4.0.2"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/@jest/transform/node_modules/convert-source-map": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/convert-source-map/-/convert-source-map-2.0.0.tgz",
      "integrity": "sha512-Kvp459HrV2FEJ1CAsi1Ku+MY3kasH19TFykTz2xWmMeq6bk2NU3XXvfJ+Q61m0xktWwt+1HSYf3JZsTms3aRJg==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/@jest/transform/node_modules/slash": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/slash/-/slash-3.0.0.tgz",
      "integrity": "sha512-g9Q1haeby36OSStwb4ntCGGGaKsaVSjQ68fBxoQcutl5fS1vuY18H3wSt3jFyFtrkx+Kz0V1G85A4MyAdDMi2Q==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/@jest/types": {
      "version": "29.6.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jest/types/-/types-29.6.3.tgz",
      "integrity": "sha512-u3UPsIilWKOM3F9CXtrG8LEJmNxwoCQC/XVj4IKYXvvpx7QIi/Kg1LI5uDmDpKlac62NUtX7eLjRh+jVZcLOzw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@jest/schemas": "^29.6.3",
        "@types/istanbul-lib-coverage": "^2.0.0",
        "@types/istanbul-reports": "^3.0.0",
        "@types/node": "*",
        "@types/yargs": "^17.0.8",
        "chalk": "^4.0.0"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/@jridgewell/gen-mapping": {
      "version": "0.3.13",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jridgewell/gen-mapping/-/gen-mapping-0.3.13.tgz",
      "integrity": "sha512-2kkt/7niJ6MgEPxF0bYdQ6etZaA+fQvDcLKckhy1yIQOzaoKjBBjSj63/aLVjYE3qhRt5dvM+uUyfCg6UKCBbA==",
      "license": "MIT",
      "dependencies": {
        "@jridgewell/sourcemap-codec": "^1.5.0",
        "@jridgewell/trace-mapping": "^0.3.24"
      }
    },
    "node_modules/@jridgewell/resolve-uri": {
      "version": "3.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jridgewell/resolve-uri/-/resolve-uri-3.1.2.tgz",
      "integrity": "sha512-bRISgCIjP20/tbWSPWMEi54QVPRZExkuD9lJL+UIxUKtwVJA8wW1Trb1jMs1RFXo1CBTNZ/5hpC9QvmKWdopKw==",
      "license": "MIT",
      "engines": {
        "node": ">=6.0.0"
      }
    },
    "node_modules/@jridgewell/source-map": {
      "version": "0.3.11",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jridgewell/source-map/-/source-map-0.3.11.tgz",
      "integrity": "sha512-ZMp1V8ZFcPG5dIWnQLr3NSI1MiCU7UETdS/A0G8V/XWHvJv3ZsFqutJn1Y5RPmAPX6F3BiE397OqveU/9NCuIA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@jridgewell/gen-mapping": "^0.3.5",
        "@jridgewell/trace-mapping": "^0.3.25"
      }
    },
    "node_modules/@jridgewell/sourcemap-codec": {
      "version": "1.5.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jridgewell/sourcemap-codec/-/sourcemap-codec-1.5.5.tgz",
      "integrity": "sha512-cYQ9310grqxueWbl+WuIUIaiUaDcj7WOq5fVhEljNVgRfOUhY9fy2zTvfoqWsnebh8Sl70VScFbICvJnLKB0Og==",
      "license": "MIT"
    },
    "node_modules/@jridgewell/trace-mapping": {
      "version": "0.3.31",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jridgewell/trace-mapping/-/trace-mapping-0.3.31.tgz",
      "integrity": "sha512-zzNR+SdQSDJzc8joaeP8QQoCQr8NuYx2dIIytl1QeBEZHJ9uW6hebsrYgbz8hJwUQao3TWCMtmfV8Nu1twOLAw==",
      "license": "MIT",
      "dependencies": {
        "@jridgewell/resolve-uri": "^3.1.0",
        "@jridgewell/sourcemap-codec": "^1.4.14"
      }
    },
    "node_modules/@jsonjoy.com/base64": {
      "version": "1.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jsonjoy.com/base64/-/base64-1.1.2.tgz",
      "integrity": "sha512-q6XAnWQDIMA3+FTiOYajoYqySkO+JSat0ytXGSuRdq9uXE7o92gzuQwQM14xaCRlBLGq3v5miDGC4vkVTn54xA==",
      "dev": true,
      "license": "Apache-2.0",
      "engines": {
        "node": ">=10.0"
      },
      "funding": {
        "type": "github",
        "url": "https://github.com/sponsors/streamich"
      },
      "peerDependencies": {
        "tslib": "2"
      }
    },
    "node_modules/@jsonjoy.com/buffers": {
      "version": "17.67.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jsonjoy.com/buffers/-/buffers-17.67.0.tgz",
      "integrity": "sha512-tfExRpYxBvi32vPs9ZHaTjSP4fHAfzSmcahOfNxtvGHcyJel+aibkPlGeBB+7AoC6hL7lXIE++8okecBxx7lcw==",
      "dev": true,
      "license": "Apache-2.0",
      "engines": {
        "node": ">=10.0"
      },
      "funding": {
        "type": "github",
        "url": "https://github.com/sponsors/streamich"
      },
      "peerDependencies": {
        "tslib": "2"
      }
    },
    "node_modules/@jsonjoy.com/codegen": {
      "version": "1.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jsonjoy.com/codegen/-/codegen-1.0.0.tgz",
      "integrity": "sha512-E8Oy+08cmCf0EK/NMxpaJZmOxPqM+6iSe2S4nlSBrPZOORoDJILxtbSUEDKQyTamm/BVAhIGllOBNU79/dwf0g==",
      "dev": true,
      "license": "Apache-2.0",
      "engines": {
        "node": ">=10.0"
      },
      "funding": {
        "type": "github",
        "url": "https://github.com/sponsors/streamich"
      },
      "peerDependencies": {
        "tslib": "2"
      }
    },
    "node_modules/@jsonjoy.com/fs-core": {
      "version": "4.57.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jsonjoy.com/fs-core/-/fs-core-4.57.1.tgz",
      "integrity": "sha512-YrEi/ZPmgc+GfdO0esBF04qv8boK9Dg9WpRQw/+vM8Qt3nnVIJWIa8HwZ/LXVZ0DB11XUROM8El/7yYTJX+WtA==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "@jsonjoy.com/fs-node-builtins": "4.57.1",
        "@jsonjoy.com/fs-node-utils": "4.57.1",
        "thingies": "^2.5.0"
      },
      "engines": {
        "node": ">=10.0"
      },
      "funding": {
        "type": "github",
        "url": "https://github.com/sponsors/streamich"
      },
      "peerDependencies": {
        "tslib": "2"
      }
    },
    "node_modules/@jsonjoy.com/fs-fsa": {
      "version": "4.57.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jsonjoy.com/fs-fsa/-/fs-fsa-4.57.1.tgz",
      "integrity": "sha512-ooEPvSW/HQDivPDPZMibHGKZf/QS4WRir1czGZmXmp3MsQqLECZEpN0JobrD8iV9BzsuwdIv+PxtWX9WpPLsIA==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "@jsonjoy.com/fs-core": "4.57.1",
        "@jsonjoy.com/fs-node-builtins": "4.57.1",
        "@jsonjoy.com/fs-node-utils": "4.57.1",
        "thingies": "^2.5.0"
      },
      "engines": {
        "node": ">=10.0"
      },
      "funding": {
        "type": "github",
        "url": "https://github.com/sponsors/streamich"
      },
      "peerDependencies": {
        "tslib": "2"
      }
    },
    "node_modules/@jsonjoy.com/fs-node": {
      "version": "4.57.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jsonjoy.com/fs-node/-/fs-node-4.57.1.tgz",
      "integrity": "sha512-3YaKhP8gXEKN+2O49GLNfNb5l2gbnCFHyAaybbA2JkkbQP3dpdef7WcUaHAulg/c5Dg4VncHsA3NWAUSZMR5KQ==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "@jsonjoy.com/fs-core": "4.57.1",
        "@jsonjoy.com/fs-node-builtins": "4.57.1",
        "@jsonjoy.com/fs-node-utils": "4.57.1",
        "@jsonjoy.com/fs-print": "4.57.1",
        "@jsonjoy.com/fs-snapshot": "4.57.1",
        "glob-to-regex.js": "^1.0.0",
        "thingies": "^2.5.0"
      },
      "engines": {
        "node": ">=10.0"
      },
      "funding": {
        "type": "github",
        "url": "https://github.com/sponsors/streamich"
      },
      "peerDependencies": {
        "tslib": "2"
      }
    },
    "node_modules/@jsonjoy.com/fs-node-builtins": {
      "version": "4.57.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jsonjoy.com/fs-node-builtins/-/fs-node-builtins-4.57.1.tgz",
      "integrity": "sha512-XHkFKQ5GSH3uxm8c3ZYXVrexGdscpWKIcMWKFQpMpMJc8gA3AwOMBJXJlgpdJqmrhPyQXxaY9nbkNeYpacC0Og==",
      "dev": true,
      "license": "Apache-2.0",
      "engines": {
        "node": ">=10.0"
      },
      "funding": {
        "type": "github",
        "url": "https://github.com/sponsors/streamich"
      },
      "peerDependencies": {
        "tslib": "2"
      }
    },
    "node_modules/@jsonjoy.com/fs-node-to-fsa": {
      "version": "4.57.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jsonjoy.com/fs-node-to-fsa/-/fs-node-to-fsa-4.57.1.tgz",
      "integrity": "sha512-pqGHyWWzNck4jRfaGV39hkqpY5QjRUQ/nRbNT7FYbBa0xf4bDG+TE1Gt2KWZrSkrkZZDE3qZUjYMbjwSliX6pg==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "@jsonjoy.com/fs-fsa": "4.57.1",
        "@jsonjoy.com/fs-node-builtins": "4.57.1",
        "@jsonjoy.com/fs-node-utils": "4.57.1"
      },
      "engines": {
        "node": ">=10.0"
      },
      "funding": {
        "type": "github",
        "url": "https://github.com/sponsors/streamich"
      },
      "peerDependencies": {
        "tslib": "2"
      }
    },
    "node_modules/@jsonjoy.com/fs-node-utils": {
      "version": "4.57.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jsonjoy.com/fs-node-utils/-/fs-node-utils-4.57.1.tgz",
      "integrity": "sha512-vp+7ZzIB8v43G+GLXTS4oDUSQmhAsRz532QmmWBbdYA20s465JvwhkSFvX9cVTqRRAQg+vZ7zWDaIEh0lFe2gw==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "@jsonjoy.com/fs-node-builtins": "4.57.1"
      },
      "engines": {
        "node": ">=10.0"
      },
      "funding": {
        "type": "github",
        "url": "https://github.com/sponsors/streamich"
      },
      "peerDependencies": {
        "tslib": "2"
      }
    },
    "node_modules/@jsonjoy.com/fs-print": {
      "version": "4.57.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jsonjoy.com/fs-print/-/fs-print-4.57.1.tgz",
      "integrity": "sha512-Ynct7ZJmfk6qoXDOKfpovNA36ITUx8rChLmRQtW08J73VOiuNsU8PB6d/Xs7fxJC2ohWR3a5AqyjmLojfrw5yw==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "@jsonjoy.com/fs-node-utils": "4.57.1",
        "tree-dump": "^1.1.0"
      },
      "engines": {
        "node": ">=10.0"
      },
      "funding": {
        "type": "github",
        "url": "https://github.com/sponsors/streamich"
      },
      "peerDependencies": {
        "tslib": "2"
      }
    },
    "node_modules/@jsonjoy.com/fs-snapshot": {
      "version": "4.57.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jsonjoy.com/fs-snapshot/-/fs-snapshot-4.57.1.tgz",
      "integrity": "sha512-/oG8xBNFMbDXTq9J7vepSA1kerS5vpgd3p5QZSPd+nX59uwodGJftI51gDYyHRpP57P3WCQf7LHtBYPqwUg2Bg==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "@jsonjoy.com/buffers": "^17.65.0",
        "@jsonjoy.com/fs-node-utils": "4.57.1",
        "@jsonjoy.com/json-pack": "^17.65.0",
        "@jsonjoy.com/util": "^17.65.0"
      },
      "engines": {
        "node": ">=10.0"
      },
      "funding": {
        "type": "github",
        "url": "https://github.com/sponsors/streamich"
      },
      "peerDependencies": {
        "tslib": "2"
      }
    },
    "node_modules/@jsonjoy.com/fs-snapshot/node_modules/@jsonjoy.com/base64": {
      "version": "17.67.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jsonjoy.com/base64/-/base64-17.67.0.tgz",
      "integrity": "sha512-5SEsJGsm15aP8TQGkDfJvz9axgPwAEm98S5DxOuYe8e1EbfajcDmgeXXzccEjh+mLnjqEKrkBdjHWS5vFNwDdw==",
      "dev": true,
      "license": "Apache-2.0",
      "engines": {
        "node": ">=10.0"
      },
      "funding": {
        "type": "github",
        "url": "https://github.com/sponsors/streamich"
      },
      "peerDependencies": {
        "tslib": "2"
      }
    },
    "node_modules/@jsonjoy.com/fs-snapshot/node_modules/@jsonjoy.com/codegen": {
      "version": "17.67.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jsonjoy.com/codegen/-/codegen-17.67.0.tgz",
      "integrity": "sha512-idnkUplROpdBOV0HMcwhsCUS5TRUi9poagdGs70A6S4ux9+/aPuKbh8+UYRTLYQHtXvAdNfQWXDqZEx5k4Dj2Q==",
      "dev": true,
      "license": "Apache-2.0",
      "engines": {
        "node": ">=10.0"
      },
      "funding": {
        "type": "github",
        "url": "https://github.com/sponsors/streamich"
      },
      "peerDependencies": {
        "tslib": "2"
      }
    },
    "node_modules/@jsonjoy.com/fs-snapshot/node_modules/@jsonjoy.com/json-pack": {
      "version": "17.67.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jsonjoy.com/json-pack/-/json-pack-17.67.0.tgz",
      "integrity": "sha512-t0ejURcGaZsn1ClbJ/3kFqSOjlryd92eQY465IYrezsXmPcfHPE/av4twRSxf6WE+TkZgLY+71vCZbiIiFKA/w==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "@jsonjoy.com/base64": "17.67.0",
        "@jsonjoy.com/buffers": "17.67.0",
        "@jsonjoy.com/codegen": "17.67.0",
        "@jsonjoy.com/json-pointer": "17.67.0",
        "@jsonjoy.com/util": "17.67.0",
        "hyperdyperid": "^1.2.0",
        "thingies": "^2.5.0",
        "tree-dump": "^1.1.0"
      },
      "engines": {
        "node": ">=10.0"
      },
      "funding": {
        "type": "github",
        "url": "https://github.com/sponsors/streamich"
      },
      "peerDependencies": {
        "tslib": "2"
      }
    },
    "node_modules/@jsonjoy.com/fs-snapshot/node_modules/@jsonjoy.com/json-pointer": {
      "version": "17.67.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jsonjoy.com/json-pointer/-/json-pointer-17.67.0.tgz",
      "integrity": "sha512-+iqOFInH+QZGmSuaybBUNdh7yvNrXvqR+h3wjXm0N/3JK1EyyFAeGJvqnmQL61d1ARLlk/wJdFKSL+LHJ1eaUA==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "@jsonjoy.com/util": "17.67.0"
      },
      "engines": {
        "node": ">=10.0"
      },
      "funding": {
        "type": "github",
        "url": "https://github.com/sponsors/streamich"
      },
      "peerDependencies": {
        "tslib": "2"
      }
    },
    "node_modules/@jsonjoy.com/fs-snapshot/node_modules/@jsonjoy.com/util": {
      "version": "17.67.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jsonjoy.com/util/-/util-17.67.0.tgz",
      "integrity": "sha512-6+8xBaz1rLSohlGh68D1pdw3AwDi9xydm8QNlAFkvnavCJYSze+pxoW2VKP8p308jtlMRLs5NTHfPlZLd4w7ew==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "@jsonjoy.com/buffers": "17.67.0",
        "@jsonjoy.com/codegen": "17.67.0"
      },
      "engines": {
        "node": ">=10.0"
      },
      "funding": {
        "type": "github",
        "url": "https://github.com/sponsors/streamich"
      },
      "peerDependencies": {
        "tslib": "2"
      }
    },
    "node_modules/@jsonjoy.com/json-pack": {
      "version": "1.21.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jsonjoy.com/json-pack/-/json-pack-1.21.0.tgz",
      "integrity": "sha512-+AKG+R2cfZMShzrF2uQw34v3zbeDYUqnQ+jg7ORic3BGtfw9p/+N6RJbq/kkV8JmYZaINknaEQ2m0/f693ZPpg==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "@jsonjoy.com/base64": "^1.1.2",
        "@jsonjoy.com/buffers": "^1.2.0",
        "@jsonjoy.com/codegen": "^1.0.0",
        "@jsonjoy.com/json-pointer": "^1.0.2",
        "@jsonjoy.com/util": "^1.9.0",
        "hyperdyperid": "^1.2.0",
        "thingies": "^2.5.0",
        "tree-dump": "^1.1.0"
      },
      "engines": {
        "node": ">=10.0"
      },
      "funding": {
        "type": "github",
        "url": "https://github.com/sponsors/streamich"
      },
      "peerDependencies": {
        "tslib": "2"
      }
    },
    "node_modules/@jsonjoy.com/json-pack/node_modules/@jsonjoy.com/buffers": {
      "version": "1.2.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jsonjoy.com/buffers/-/buffers-1.2.1.tgz",
      "integrity": "sha512-12cdlDwX4RUM3QxmUbVJWqZ/mrK6dFQH4Zxq6+r1YXKXYBNgZXndx2qbCJwh3+WWkCSn67IjnlG3XYTvmvYtgA==",
      "dev": true,
      "license": "Apache-2.0",
      "engines": {
        "node": ">=10.0"
      },
      "funding": {
        "type": "github",
        "url": "https://github.com/sponsors/streamich"
      },
      "peerDependencies": {
        "tslib": "2"
      }
    },
    "node_modules/@jsonjoy.com/json-pointer": {
      "version": "1.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jsonjoy.com/json-pointer/-/json-pointer-1.0.2.tgz",
      "integrity": "sha512-Fsn6wM2zlDzY1U+v4Nc8bo3bVqgfNTGcn6dMgs6FjrEnt4ZCe60o6ByKRjOGlI2gow0aE/Q41QOigdTqkyK5fg==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "@jsonjoy.com/codegen": "^1.0.0",
        "@jsonjoy.com/util": "^1.9.0"
      },
      "engines": {
        "node": ">=10.0"
      },
      "funding": {
        "type": "github",
        "url": "https://github.com/sponsors/streamich"
      },
      "peerDependencies": {
        "tslib": "2"
      }
    },
    "node_modules/@jsonjoy.com/util": {
      "version": "1.9.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jsonjoy.com/util/-/util-1.9.0.tgz",
      "integrity": "sha512-pLuQo+VPRnN8hfPqUTLTHk126wuYdXVxE6aDmjSeV4NCAgyxWbiOIeNJVtID3h1Vzpoi9m4jXezf73I6LgabgQ==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "@jsonjoy.com/buffers": "^1.0.0",
        "@jsonjoy.com/codegen": "^1.0.0"
      },
      "engines": {
        "node": ">=10.0"
      },
      "funding": {
        "type": "github",
        "url": "https://github.com/sponsors/streamich"
      },
      "peerDependencies": {
        "tslib": "2"
      }
    },
    "node_modules/@jsonjoy.com/util/node_modules/@jsonjoy.com/buffers": {
      "version": "1.2.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@jsonjoy.com/buffers/-/buffers-1.2.1.tgz",
      "integrity": "sha512-12cdlDwX4RUM3QxmUbVJWqZ/mrK6dFQH4Zxq6+r1YXKXYBNgZXndx2qbCJwh3+WWkCSn67IjnlG3XYTvmvYtgA==",
      "dev": true,
      "license": "Apache-2.0",
      "engines": {
        "node": ">=10.0"
      },
      "funding": {
        "type": "github",
        "url": "https://github.com/sponsors/streamich"
      },
      "peerDependencies": {
        "tslib": "2"
      }
    },
    "node_modules/@leichtgewicht/ip-codec": {
      "version": "2.0.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@leichtgewicht/ip-codec/-/ip-codec-2.0.5.tgz",
      "integrity": "sha512-Vo+PSpZG2/fmgmiNzYK9qWRh8h/CHrwD0mo1h1DzL4yzHNSfWYujGTYsWGreD000gcgmZ7K4Ys6Tx9TxtsKdDw==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/@listr2/prompt-adapter-inquirer": {
      "version": "2.0.18",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@listr2/prompt-adapter-inquirer/-/prompt-adapter-inquirer-2.0.18.tgz",
      "integrity": "sha512-0hz44rAcrphyXcA8IS7EJ2SCoaBZD2u5goE8S/e+q/DL+dOGpqpcLidVOFeLG3VgML62SXmfRLAhWt0zL1oW4Q==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@inquirer/type": "^1.5.5"
      },
      "engines": {
        "node": ">=18.0.0"
      },
      "peerDependencies": {
        "@inquirer/prompts": ">= 3 < 8"
      }
    },
    "node_modules/@listr2/prompt-adapter-inquirer/node_modules/@inquirer/type": {
      "version": "1.5.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@inquirer/type/-/type-1.5.5.tgz",
      "integrity": "sha512-MzICLu4yS7V8AA61sANROZ9vT1H3ooca5dSmI1FjZkzq7o/koMsRfQSzRtFo+F3Ao4Sf1C0bpLKejpKB/+j6MA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "mute-stream": "^1.0.0"
      },
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@listr2/prompt-adapter-inquirer/node_modules/mute-stream": {
      "version": "1.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/mute-stream/-/mute-stream-1.0.0.tgz",
      "integrity": "sha512-avsJQhyd+680gKXyG/sQc0nXaC6rBkPOfyHYcFb9+hdkqQkR9bdnkJ0AMZhke0oesPqIO+mFFJ+IdBc7mst4IA==",
      "dev": true,
      "license": "ISC",
      "engines": {
        "node": "^14.17.0 || ^16.13.0 || >=18.0.0"
      }
    },
    "node_modules/@lmdb/lmdb-darwin-arm64": {
      "version": "3.2.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@lmdb/lmdb-darwin-arm64/-/lmdb-darwin-arm64-3.2.6.tgz",
      "integrity": "sha512-yF/ih9EJJZc72psFQbwnn8mExIWfTnzWJg+N02hnpXtDPETYLmQswIMBn7+V88lfCaFrMozJsUvcEQIkEPU0Gg==",
      "cpu": [
        "arm64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "darwin"
      ]
    },
    "node_modules/@lmdb/lmdb-darwin-x64": {
      "version": "3.2.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@lmdb/lmdb-darwin-x64/-/lmdb-darwin-x64-3.2.6.tgz",
      "integrity": "sha512-5BbCumsFLbCi586Bb1lTWQFkekdQUw8/t8cy++Uq251cl3hbDIGEwD9HAwh8H6IS2F6QA9KdKmO136LmipRNkg==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "darwin"
      ]
    },
    "node_modules/@lmdb/lmdb-linux-arm": {
      "version": "3.2.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@lmdb/lmdb-linux-arm/-/lmdb-linux-arm-3.2.6.tgz",
      "integrity": "sha512-+6XgLpMb7HBoWxXj+bLbiiB4s0mRRcDPElnRS3LpWRzdYSe+gFk5MT/4RrVNqd2MESUDmb53NUXw1+BP69bjiQ==",
      "cpu": [
        "arm"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ]
    },
    "node_modules/@lmdb/lmdb-linux-arm64": {
      "version": "3.2.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@lmdb/lmdb-linux-arm64/-/lmdb-linux-arm64-3.2.6.tgz",
      "integrity": "sha512-l5VmJamJ3nyMmeD1ANBQCQqy7do1ESaJQfKPSm2IG9/ADZryptTyCj8N6QaYgIWewqNUrcbdMkJajRQAt5Qjfg==",
      "cpu": [
        "arm64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ]
    },
    "node_modules/@lmdb/lmdb-linux-x64": {
      "version": "3.2.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@lmdb/lmdb-linux-x64/-/lmdb-linux-x64-3.2.6.tgz",
      "integrity": "sha512-nDYT8qN9si5+onHYYaI4DiauDMx24OAiuZAUsEqrDy+ja/3EbpXPX/VAkMV8AEaQhy3xc4dRC+KcYIvOFefJ4Q==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ]
    },
    "node_modules/@lmdb/lmdb-win32-x64": {
      "version": "3.2.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@lmdb/lmdb-win32-x64/-/lmdb-win32-x64-3.2.6.tgz",
      "integrity": "sha512-XlqVtILonQnG+9fH2N3Aytria7P/1fwDgDhl29rde96uH2sLB8CHORIf2PfuLVzFQJ7Uqp8py9AYwr3ZUCFfWg==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "win32"
      ]
    },
    "node_modules/@mermaid-js/parser": {
      "version": "1.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@mermaid-js/parser/-/parser-1.0.1.tgz",
      "integrity": "sha512-opmV19kN1JsK0T6HhhokHpcVkqKpF+x2pPDKKM2ThHtZAB5F4PROopk0amuVYK5qMrIA4erzpNm8gmPNJgMDxQ==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "langium": "^4.0.0"
      }
    },
    "node_modules/@msgpackr-extract/msgpackr-extract-darwin-arm64": {
      "version": "3.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@msgpackr-extract/msgpackr-extract-darwin-arm64/-/msgpackr-extract-darwin-arm64-3.0.3.tgz",
      "integrity": "sha512-QZHtlVgbAdy2zAqNA9Gu1UpIuI8Xvsd1v8ic6B2pZmeFnFcMWiPLfWXh7TVw4eGEZ/C9TH281KwhVoeQUKbyjw==",
      "cpu": [
        "arm64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "darwin"
      ]
    },
    "node_modules/@msgpackr-extract/msgpackr-extract-darwin-x64": {
      "version": "3.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@msgpackr-extract/msgpackr-extract-darwin-x64/-/msgpackr-extract-darwin-x64-3.0.3.tgz",
      "integrity": "sha512-mdzd3AVzYKuUmiWOQ8GNhl64/IoFGol569zNRdkLReh6LRLHOXxU4U8eq0JwaD8iFHdVGqSy4IjFL4reoWCDFw==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "darwin"
      ]
    },
    "node_modules/@msgpackr-extract/msgpackr-extract-linux-arm": {
      "version": "3.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@msgpackr-extract/msgpackr-extract-linux-arm/-/msgpackr-extract-linux-arm-3.0.3.tgz",
      "integrity": "sha512-fg0uy/dG/nZEXfYilKoRe7yALaNmHoYeIoJuJ7KJ+YyU2bvY8vPv27f7UKhGRpY6euFYqEVhxCFZgAUNQBM3nw==",
      "cpu": [
        "arm"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ]
    },
    "node_modules/@msgpackr-extract/msgpackr-extract-linux-arm64": {
      "version": "3.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@msgpackr-extract/msgpackr-extract-linux-arm64/-/msgpackr-extract-linux-arm64-3.0.3.tgz",
      "integrity": "sha512-YxQL+ax0XqBJDZiKimS2XQaf+2wDGVa1enVRGzEvLLVFeqa5kx2bWbtcSXgsxjQB7nRqqIGFIcLteF/sHeVtQg==",
      "cpu": [
        "arm64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ]
    },
    "node_modules/@msgpackr-extract/msgpackr-extract-linux-x64": {
      "version": "3.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@msgpackr-extract/msgpackr-extract-linux-x64/-/msgpackr-extract-linux-x64-3.0.3.tgz",
      "integrity": "sha512-cvwNfbP07pKUfq1uH+S6KJ7dT9K8WOE4ZiAcsrSes+UY55E/0jLYc+vq+DO7jlmqRb5zAggExKm0H7O/CBaesg==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ]
    },
    "node_modules/@msgpackr-extract/msgpackr-extract-win32-x64": {
      "version": "3.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@msgpackr-extract/msgpackr-extract-win32-x64/-/msgpackr-extract-win32-x64-3.0.3.tgz",
      "integrity": "sha512-x0fWaQtYp4E6sktbsdAqnehxDgEc/VwM7uLsRCYWaiGu0ykYdZPiS8zCWdnjHwyiumousxfBm4SO31eXqwEZhQ==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "win32"
      ]
    },
    "node_modules/@napi-rs/nice": {
      "version": "1.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@napi-rs/nice/-/nice-1.1.1.tgz",
      "integrity": "sha512-xJIPs+bYuc9ASBl+cvGsKbGrJmS6fAKaSZCnT0lhahT5rhA2VVy9/EcIgd2JhtEuFOJNx7UHNn/qiTPTY4nrQw==",
      "dev": true,
      "license": "MIT",
      "optional": true,
      "engines": {
        "node": ">= 10"
      },
      "funding": {
        "type": "github",
        "url": "https://github.com/sponsors/Brooooooklyn"
      },
      "optionalDependencies": {
        "@napi-rs/nice-android-arm-eabi": "1.1.1",
        "@napi-rs/nice-android-arm64": "1.1.1",
        "@napi-rs/nice-darwin-arm64": "1.1.1",
        "@napi-rs/nice-darwin-x64": "1.1.1",
        "@napi-rs/nice-freebsd-x64": "1.1.1",
        "@napi-rs/nice-linux-arm-gnueabihf": "1.1.1",
        "@napi-rs/nice-linux-arm64-gnu": "1.1.1",
        "@napi-rs/nice-linux-arm64-musl": "1.1.1",
        "@napi-rs/nice-linux-ppc64-gnu": "1.1.1",
        "@napi-rs/nice-linux-riscv64-gnu": "1.1.1",
        "@napi-rs/nice-linux-s390x-gnu": "1.1.1",
        "@napi-rs/nice-linux-x64-gnu": "1.1.1",
        "@napi-rs/nice-linux-x64-musl": "1.1.1",
        "@napi-rs/nice-openharmony-arm64": "1.1.1",
        "@napi-rs/nice-win32-arm64-msvc": "1.1.1",
        "@napi-rs/nice-win32-ia32-msvc": "1.1.1",
        "@napi-rs/nice-win32-x64-msvc": "1.1.1"
      }
    },
    "node_modules/@napi-rs/nice-android-arm-eabi": {
      "version": "1.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@napi-rs/nice-android-arm-eabi/-/nice-android-arm-eabi-1.1.1.tgz",
      "integrity": "sha512-kjirL3N6TnRPv5iuHw36wnucNqXAO46dzK9oPb0wj076R5Xm8PfUVA9nAFB5ZNMmfJQJVKACAPd/Z2KYMppthw==",
      "cpu": [
        "arm"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "android"
      ],
      "engines": {
        "node": ">= 10"
      }
    },
    "node_modules/@napi-rs/nice-android-arm64": {
      "version": "1.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@napi-rs/nice-android-arm64/-/nice-android-arm64-1.1.1.tgz",
      "integrity": "sha512-blG0i7dXgbInN5urONoUCNf+DUEAavRffrO7fZSeoRMJc5qD+BJeNcpr54msPF6qfDD6kzs9AQJogZvT2KD5nw==",
      "cpu": [
        "arm64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "android"
      ],
      "engines": {
        "node": ">= 10"
      }
    },
    "node_modules/@napi-rs/nice-darwin-arm64": {
      "version": "1.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@napi-rs/nice-darwin-arm64/-/nice-darwin-arm64-1.1.1.tgz",
      "integrity": "sha512-s/E7w45NaLqTGuOjC2p96pct4jRfo61xb9bU1unM/MJ/RFkKlJyJDx7OJI/O0ll/hrfpqKopuAFDV8yo0hfT7A==",
      "cpu": [
        "arm64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "darwin"
      ],
      "engines": {
        "node": ">= 10"
      }
    },
    "node_modules/@napi-rs/nice-darwin-x64": {
      "version": "1.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@napi-rs/nice-darwin-x64/-/nice-darwin-x64-1.1.1.tgz",
      "integrity": "sha512-dGoEBnVpsdcC+oHHmW1LRK5eiyzLwdgNQq3BmZIav+9/5WTZwBYX7r5ZkQC07Nxd3KHOCkgbHSh4wPkH1N1LiQ==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "darwin"
      ],
      "engines": {
        "node": ">= 10"
      }
    },
    "node_modules/@napi-rs/nice-freebsd-x64": {
      "version": "1.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@napi-rs/nice-freebsd-x64/-/nice-freebsd-x64-1.1.1.tgz",
      "integrity": "sha512-kHv4kEHAylMYmlNwcQcDtXjklYp4FCf0b05E+0h6nDHsZ+F0bDe04U/tXNOqrx5CmIAth4vwfkjjUmp4c4JktQ==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "freebsd"
      ],
      "engines": {
        "node": ">= 10"
      }
    },
    "node_modules/@napi-rs/nice-linux-arm-gnueabihf": {
      "version": "1.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@napi-rs/nice-linux-arm-gnueabihf/-/nice-linux-arm-gnueabihf-1.1.1.tgz",
      "integrity": "sha512-E1t7K0efyKXZDoZg1LzCOLxgolxV58HCkaEkEvIYQx12ht2pa8hoBo+4OB3qh7e+QiBlp1SRf+voWUZFxyhyqg==",
      "cpu": [
        "arm"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ],
      "engines": {
        "node": ">= 10"
      }
    },
    "node_modules/@napi-rs/nice-linux-arm64-gnu": {
      "version": "1.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@napi-rs/nice-linux-arm64-gnu/-/nice-linux-arm64-gnu-1.1.1.tgz",
      "integrity": "sha512-CIKLA12DTIZlmTaaKhQP88R3Xao+gyJxNWEn04wZwC2wmRapNnxCUZkVwggInMJvtVElA+D4ZzOU5sX4jV+SmQ==",
      "cpu": [
        "arm64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ],
      "engines": {
        "node": ">= 10"
      }
    },
    "node_modules/@napi-rs/nice-linux-arm64-musl": {
      "version": "1.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@napi-rs/nice-linux-arm64-musl/-/nice-linux-arm64-musl-1.1.1.tgz",
      "integrity": "sha512-+2Rzdb3nTIYZ0YJF43qf2twhqOCkiSrHx2Pg6DJaCPYhhaxbLcdlV8hCRMHghQ+EtZQWGNcS2xF4KxBhSGeutg==",
      "cpu": [
        "arm64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ],
      "engines": {
        "node": ">= 10"
      }
    },
    "node_modules/@napi-rs/nice-linux-ppc64-gnu": {
      "version": "1.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@napi-rs/nice-linux-ppc64-gnu/-/nice-linux-ppc64-gnu-1.1.1.tgz",
      "integrity": "sha512-4FS8oc0GeHpwvv4tKciKkw3Y4jKsL7FRhaOeiPei0X9T4Jd619wHNe4xCLmN2EMgZoeGg+Q7GY7BsvwKpL22Tg==",
      "cpu": [
        "ppc64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ],
      "engines": {
        "node": ">= 10"
      }
    },
    "node_modules/@napi-rs/nice-linux-riscv64-gnu": {
      "version": "1.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@napi-rs/nice-linux-riscv64-gnu/-/nice-linux-riscv64-gnu-1.1.1.tgz",
      "integrity": "sha512-HU0nw9uD4FO/oGCCk409tCi5IzIZpH2agE6nN4fqpwVlCn5BOq0MS1dXGjXaG17JaAvrlpV5ZeyZwSon10XOXw==",
      "cpu": [
        "riscv64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ],
      "engines": {
        "node": ">= 10"
      }
    },
    "node_modules/@napi-rs/nice-linux-s390x-gnu": {
      "version": "1.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@napi-rs/nice-linux-s390x-gnu/-/nice-linux-s390x-gnu-1.1.1.tgz",
      "integrity": "sha512-2YqKJWWl24EwrX0DzCQgPLKQBxYDdBxOHot1KWEq7aY2uYeX+Uvtv4I8xFVVygJDgf6/92h9N3Y43WPx8+PAgQ==",
      "cpu": [
        "s390x"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ],
      "engines": {
        "node": ">= 10"
      }
    },
    "node_modules/@napi-rs/nice-linux-x64-gnu": {
      "version": "1.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@napi-rs/nice-linux-x64-gnu/-/nice-linux-x64-gnu-1.1.1.tgz",
      "integrity": "sha512-/gaNz3R92t+dcrfCw/96pDopcmec7oCcAQ3l/M+Zxr82KT4DljD37CpgrnXV+pJC263JkW572pdbP3hP+KjcIg==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ],
      "engines": {
        "node": ">= 10"
      }
    },
    "node_modules/@napi-rs/nice-linux-x64-musl": {
      "version": "1.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@napi-rs/nice-linux-x64-musl/-/nice-linux-x64-musl-1.1.1.tgz",
      "integrity": "sha512-xScCGnyj/oppsNPMnevsBe3pvNaoK7FGvMjT35riz9YdhB2WtTG47ZlbxtOLpjeO9SqqQ2J2igCmz6IJOD5JYw==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ],
      "engines": {
        "node": ">= 10"
      }
    },
    "node_modules/@napi-rs/nice-openharmony-arm64": {
      "version": "1.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@napi-rs/nice-openharmony-arm64/-/nice-openharmony-arm64-1.1.1.tgz",
      "integrity": "sha512-6uJPRVwVCLDeoOaNyeiW0gp2kFIM4r7PL2MczdZQHkFi9gVlgm+Vn+V6nTWRcu856mJ2WjYJiumEajfSm7arPQ==",
      "cpu": [
        "arm64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "openharmony"
      ],
      "engines": {
        "node": ">= 10"
      }
    },
    "node_modules/@napi-rs/nice-win32-arm64-msvc": {
      "version": "1.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@napi-rs/nice-win32-arm64-msvc/-/nice-win32-arm64-msvc-1.1.1.tgz",
      "integrity": "sha512-uoTb4eAvM5B2aj/z8j+Nv8OttPf2m+HVx3UjA5jcFxASvNhQriyCQF1OB1lHL43ZhW+VwZlgvjmP5qF3+59atA==",
      "cpu": [
        "arm64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "win32"
      ],
      "engines": {
        "node": ">= 10"
      }
    },
    "node_modules/@napi-rs/nice-win32-ia32-msvc": {
      "version": "1.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@napi-rs/nice-win32-ia32-msvc/-/nice-win32-ia32-msvc-1.1.1.tgz",
      "integrity": "sha512-CNQqlQT9MwuCsg1Vd/oKXiuH+TcsSPJmlAFc5frFyX/KkOh0UpBLEj7aoY656d5UKZQMQFP7vJNa1DNUNORvug==",
      "cpu": [
        "ia32"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "win32"
      ],
      "engines": {
        "node": ">= 10"
      }
    },
    "node_modules/@napi-rs/nice-win32-x64-msvc": {
      "version": "1.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@napi-rs/nice-win32-x64-msvc/-/nice-win32-x64-msvc-1.1.1.tgz",
      "integrity": "sha512-vB+4G/jBQCAh0jelMTY3+kgFy00Hlx2f2/1zjMoH821IbplbWZOkLiTYXQkygNTzQJTq5cvwBDgn2ppHD+bglQ==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "win32"
      ],
      "engines": {
        "node": ">= 10"
      }
    },
    "node_modules/@ng-bootstrap/ng-bootstrap": {
      "version": "18.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@ng-bootstrap/ng-bootstrap/-/ng-bootstrap-18.0.0.tgz",
      "integrity": "sha512-GeSAz4yiGq49psdte8kcf+Y562wB3jK/qKRAkh6iA32lcXmy2sfQXVAmlHdjZ3AyP+E8lf3yMwuPdSKiYcDgSg==",
      "license": "MIT",
      "dependencies": {
        "tslib": "^2.3.0"
      },
      "peerDependencies": {
        "@angular/common": "^19.0.0",
        "@angular/core": "^19.0.0",
        "@angular/forms": "^19.0.0",
        "@angular/localize": "^19.0.0",
        "@popperjs/core": "^2.11.8",
        "rxjs": "^6.5.3 || ^7.4.0"
      }
    },
    "node_modules/@ngtools/webpack": {
      "version": "19.2.23",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@ngtools/webpack/-/webpack-19.2.23.tgz",
      "integrity": "sha512-RpA0ukuAcpvblXDEo702JWjblLXNrfr6BHjf/aVwujSM2yJSRQ5hZyauX9spCXMb8h3p+0dor62o6VDAQ5rAcQ==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": "^18.19.1 || ^20.11.1 || >=22.0.0",
        "npm": "^6.11.0 || ^7.5.6 || >=8.0.0",
        "yarn": ">= 1.13.0"
      },
      "peerDependencies": {
        "@angular/compiler-cli": "^19.0.0 || ^19.2.0-next.0",
        "typescript": ">=5.5 <5.9",
        "webpack": "^5.54.0"
      }
    },
    "node_modules/@nodelib/fs.scandir": {
      "version": "2.1.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@nodelib/fs.scandir/-/fs.scandir-2.1.5.tgz",
      "integrity": "sha512-vq24Bq3ym5HEQm2NKCr3yXDwjc7vTsEThRDnkp2DK9p1uqLR+DHurm/NOTo0KG7HYHU7eppKZj3MyqYuMBf62g==",
      "license": "MIT",
      "dependencies": {
        "@nodelib/fs.stat": "2.0.5",
        "run-parallel": "^1.1.9"
      },
      "engines": {
        "node": ">= 8"
      }
    },
    "node_modules/@nodelib/fs.stat": {
      "version": "2.0.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@nodelib/fs.stat/-/fs.stat-2.0.5.tgz",
      "integrity": "sha512-RkhPPp2zrqDAQA/2jNhnztcPAlv64XdhIp7a7454A5ovI7Bukxgt7MX7udwAu3zg1DcpPU0rz3VV1SeaqvY4+A==",
      "license": "MIT",
      "engines": {
        "node": ">= 8"
      }
    },
    "node_modules/@nodelib/fs.walk": {
      "version": "1.2.8",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@nodelib/fs.walk/-/fs.walk-1.2.8.tgz",
      "integrity": "sha512-oGB+UxlgWcgQkgwo8GcEGwemoTFt3FIO9ababBmaGwXIoBKZ+GTy0pP185beGg7Llih/NSHSV2XAs1lnznocSg==",
      "license": "MIT",
      "dependencies": {
        "@nodelib/fs.scandir": "2.1.5",
        "fastq": "^1.6.0"
      },
      "engines": {
        "node": ">= 8"
      }
    },
    "node_modules/@npmcli/agent": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@npmcli/agent/-/agent-3.0.0.tgz",
      "integrity": "sha512-S79NdEgDQd/NGCay6TCoVzXSj74skRZIKJcpJjC5lOq34SZzyI6MqtiiWoiVWoVrTcGjNeC4ipbh1VIHlpfF5Q==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "agent-base": "^7.1.0",
        "http-proxy-agent": "^7.0.0",
        "https-proxy-agent": "^7.0.1",
        "lru-cache": "^10.0.1",
        "socks-proxy-agent": "^8.0.3"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/@npmcli/agent/node_modules/http-proxy-agent": {
      "version": "7.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/http-proxy-agent/-/http-proxy-agent-7.0.2.tgz",
      "integrity": "sha512-T1gkAiYYDWYx3V5Bmyu7HcfcvL7mUrTWiM6yOfa3PIphViJ/gFPbvidQ+veqSOHci/PxBcDabeUNCzpOODJZig==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "agent-base": "^7.1.0",
        "debug": "^4.3.4"
      },
      "engines": {
        "node": ">= 14"
      }
    },
    "node_modules/@npmcli/agent/node_modules/lru-cache": {
      "version": "10.4.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/lru-cache/-/lru-cache-10.4.3.tgz",
      "integrity": "sha512-JNAzZcXrCt42VGLuYz0zfAzDfAvJWW6AfYlDBQyDV5DClI2m5sAmK+OIO7s59XfsRsWHp02jAJrRadPRGTt6SQ==",
      "dev": true,
      "license": "ISC"
    },
    "node_modules/@npmcli/fs": {
      "version": "4.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@npmcli/fs/-/fs-4.0.0.tgz",
      "integrity": "sha512-/xGlezI6xfGO9NwuJlnwz/K14qD1kCSAGtacBHnGzeAIuJGazcp45KP5NuyARXoKb7cwulAGWVsbeSxdG/cb0Q==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "semver": "^7.3.5"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/@npmcli/git": {
      "version": "6.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@npmcli/git/-/git-6.0.3.tgz",
      "integrity": "sha512-GUYESQlxZRAdhs3UhbB6pVRNUELQOHXwK9ruDkwmCv2aZ5y0SApQzUJCg02p3A7Ue2J5hxvlk1YI53c00NmRyQ==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "@npmcli/promise-spawn": "^8.0.0",
        "ini": "^5.0.0",
        "lru-cache": "^10.0.1",
        "npm-pick-manifest": "^10.0.0",
        "proc-log": "^5.0.0",
        "promise-retry": "^2.0.1",
        "semver": "^7.3.5",
        "which": "^5.0.0"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/@npmcli/git/node_modules/isexe": {
      "version": "3.1.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/isexe/-/isexe-3.1.5.tgz",
      "integrity": "sha512-6B3tLtFqtQS4ekarvLVMZ+X+VlvQekbe4taUkf/rhVO3d/h0M2rfARm/pXLcPEsjjMsFgrFgSrhQIxcSVrBz8w==",
      "dev": true,
      "license": "BlueOak-1.0.0",
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@npmcli/git/node_modules/lru-cache": {
      "version": "10.4.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/lru-cache/-/lru-cache-10.4.3.tgz",
      "integrity": "sha512-JNAzZcXrCt42VGLuYz0zfAzDfAvJWW6AfYlDBQyDV5DClI2m5sAmK+OIO7s59XfsRsWHp02jAJrRadPRGTt6SQ==",
      "dev": true,
      "license": "ISC"
    },
    "node_modules/@npmcli/git/node_modules/which": {
      "version": "5.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/which/-/which-5.0.0.tgz",
      "integrity": "sha512-JEdGzHwwkrbWoGOlIHqQ5gtprKGOenpDHpxE9zVR1bWbOtYRyPPHMe9FaP6x61CmNaTThSkb0DAJte5jD+DmzQ==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "isexe": "^3.1.1"
      },
      "bin": {
        "node-which": "bin/which.js"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/@npmcli/installed-package-contents": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@npmcli/installed-package-contents/-/installed-package-contents-3.0.0.tgz",
      "integrity": "sha512-fkxoPuFGvxyrH+OQzyTkX2LUEamrF4jZSmxjAtPPHHGO0dqsQ8tTKjnIS8SAnPHdk2I03BDtSMR5K/4loKg79Q==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "npm-bundled": "^4.0.0",
        "npm-normalize-package-bin": "^4.0.0"
      },
      "bin": {
        "installed-package-contents": "bin/index.js"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/@npmcli/node-gyp": {
      "version": "4.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@npmcli/node-gyp/-/node-gyp-4.0.0.tgz",
      "integrity": "sha512-+t5DZ6mO/QFh78PByMq1fGSAub/agLJZDRfJRMeOSNCt8s9YVlTjmGpIPwPhvXTGUIJk+WszlT0rQa1W33yzNA==",
      "dev": true,
      "license": "ISC",
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/@npmcli/package-json": {
      "version": "6.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@npmcli/package-json/-/package-json-6.2.0.tgz",
      "integrity": "sha512-rCNLSB/JzNvot0SEyXqWZ7tX2B5dD2a1br2Dp0vSYVo5jh8Z0EZ7lS9TsZ1UtziddB1UfNUaMCc538/HztnJGA==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "@npmcli/git": "^6.0.0",
        "glob": "^10.2.2",
        "hosted-git-info": "^8.0.0",
        "json-parse-even-better-errors": "^4.0.0",
        "proc-log": "^5.0.0",
        "semver": "^7.5.3",
        "validate-npm-package-license": "^3.0.4"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/@npmcli/package-json/node_modules/brace-expansion": {
      "version": "2.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/brace-expansion/-/brace-expansion-2.0.3.tgz",
      "integrity": "sha512-MCV/fYJEbqx68aE58kv2cA/kiky1G8vux3OR6/jbS+jIMe/6fJWa0DTzJU7dqijOWYwHi1t29FlfYI9uytqlpA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "balanced-match": "^1.0.0"
      }
    },
    "node_modules/@npmcli/package-json/node_modules/glob": {
      "version": "10.5.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/glob/-/glob-10.5.0.tgz",
      "integrity": "sha512-DfXN8DfhJ7NH3Oe7cFmu3NCu1wKbkReJ8TorzSAFbSKrlNaQSKfIzqYqVY8zlbs2NLBbWpRiU52GX2PbaBVNkg==",
      "deprecated": "Old versions of glob are not supported, and contain widely publicized security vulnerabilities, which have been fixed in the current version. Please update. Support for old versions may be purchased (at exorbitant rates) by contacting i@izs.me",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "foreground-child": "^3.1.0",
        "jackspeak": "^3.1.2",
        "minimatch": "^9.0.4",
        "minipass": "^7.1.2",
        "package-json-from-dist": "^1.0.0",
        "path-scurry": "^1.11.1"
      },
      "bin": {
        "glob": "dist/esm/bin.mjs"
      },
      "funding": {
        "url": "https://github.com/sponsors/isaacs"
      }
    },
    "node_modules/@npmcli/package-json/node_modules/minimatch": {
      "version": "9.0.9",
      "resolved": "http://binario.caixa:8081/repository/npm-all/minimatch/-/minimatch-9.0.9.tgz",
      "integrity": "sha512-OBwBN9AL4dqmETlpS2zasx+vTeWclWzkblfZk7KTA5j3jeOONz/tRCnZomUyvNg83wL5Zv9Ss6HMJXAgL8R2Yg==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "brace-expansion": "^2.0.2"
      },
      "engines": {
        "node": ">=16 || 14 >=14.17"
      },
      "funding": {
        "url": "https://github.com/sponsors/isaacs"
      }
    },
    "node_modules/@npmcli/promise-spawn": {
      "version": "8.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@npmcli/promise-spawn/-/promise-spawn-8.0.3.tgz",
      "integrity": "sha512-Yb00SWaL4F8w+K8YGhQ55+xE4RUNdMHV43WZGsiTM92gS+lC0mGsn7I4hLug7pbao035S6bj3Y3w0cUNGLfmkg==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "which": "^5.0.0"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/@npmcli/promise-spawn/node_modules/isexe": {
      "version": "3.1.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/isexe/-/isexe-3.1.5.tgz",
      "integrity": "sha512-6B3tLtFqtQS4ekarvLVMZ+X+VlvQekbe4taUkf/rhVO3d/h0M2rfARm/pXLcPEsjjMsFgrFgSrhQIxcSVrBz8w==",
      "dev": true,
      "license": "BlueOak-1.0.0",
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@npmcli/promise-spawn/node_modules/which": {
      "version": "5.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/which/-/which-5.0.0.tgz",
      "integrity": "sha512-JEdGzHwwkrbWoGOlIHqQ5gtprKGOenpDHpxE9zVR1bWbOtYRyPPHMe9FaP6x61CmNaTThSkb0DAJte5jD+DmzQ==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "isexe": "^3.1.1"
      },
      "bin": {
        "node-which": "bin/which.js"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/@npmcli/redact": {
      "version": "3.2.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@npmcli/redact/-/redact-3.2.2.tgz",
      "integrity": "sha512-7VmYAmk4csGv08QzrDKScdzn11jHPFGyqJW39FyPgPuAp3zIaUmuCo1yxw9aGs+NEJuTGQ9Gwqpt93vtJubucg==",
      "dev": true,
      "license": "ISC",
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/@npmcli/run-script": {
      "version": "9.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@npmcli/run-script/-/run-script-9.1.0.tgz",
      "integrity": "sha512-aoNSbxtkePXUlbZB+anS1LqsJdctG5n3UVhfU47+CDdwMi6uNTBMF9gPcQRnqghQd2FGzcwwIFBruFMxjhBewg==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "@npmcli/node-gyp": "^4.0.0",
        "@npmcli/package-json": "^6.0.0",
        "@npmcli/promise-spawn": "^8.0.0",
        "node-gyp": "^11.0.0",
        "proc-log": "^5.0.0",
        "which": "^5.0.0"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/@npmcli/run-script/node_modules/isexe": {
      "version": "3.1.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/isexe/-/isexe-3.1.5.tgz",
      "integrity": "sha512-6B3tLtFqtQS4ekarvLVMZ+X+VlvQekbe4taUkf/rhVO3d/h0M2rfARm/pXLcPEsjjMsFgrFgSrhQIxcSVrBz8w==",
      "dev": true,
      "license": "BlueOak-1.0.0",
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/@npmcli/run-script/node_modules/which": {
      "version": "5.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/which/-/which-5.0.0.tgz",
      "integrity": "sha512-JEdGzHwwkrbWoGOlIHqQ5gtprKGOenpDHpxE9zVR1bWbOtYRyPPHMe9FaP6x61CmNaTThSkb0DAJte5jD+DmzQ==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "isexe": "^3.1.1"
      },
      "bin": {
        "node-which": "bin/which.js"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/@parcel/watcher": {
      "version": "2.5.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@parcel/watcher/-/watcher-2.5.6.tgz",
      "integrity": "sha512-tmmZ3lQxAe/k/+rNnXQRawJ4NjxO2hqiOLTHvWchtGZULp4RyFeh6aU4XdOYBFe2KE1oShQTv4AblOs2iOrNnQ==",
      "dev": true,
      "hasInstallScript": true,
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "detect-libc": "^2.0.3",
        "is-glob": "^4.0.3",
        "node-addon-api": "^7.0.0",
        "picomatch": "^4.0.3"
      },
      "engines": {
        "node": ">= 10.0.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/parcel"
      },
      "optionalDependencies": {
        "@parcel/watcher-android-arm64": "2.5.6",
        "@parcel/watcher-darwin-arm64": "2.5.6",
        "@parcel/watcher-darwin-x64": "2.5.6",
        "@parcel/watcher-freebsd-x64": "2.5.6",
        "@parcel/watcher-linux-arm-glibc": "2.5.6",
        "@parcel/watcher-linux-arm-musl": "2.5.6",
        "@parcel/watcher-linux-arm64-glibc": "2.5.6",
        "@parcel/watcher-linux-arm64-musl": "2.5.6",
        "@parcel/watcher-linux-x64-glibc": "2.5.6",
        "@parcel/watcher-linux-x64-musl": "2.5.6",
        "@parcel/watcher-win32-arm64": "2.5.6",
        "@parcel/watcher-win32-ia32": "2.5.6",
        "@parcel/watcher-win32-x64": "2.5.6"
      }
    },
    "node_modules/@parcel/watcher-android-arm64": {
      "version": "2.5.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@parcel/watcher-android-arm64/-/watcher-android-arm64-2.5.6.tgz",
      "integrity": "sha512-YQxSS34tPF/6ZG7r/Ih9xy+kP/WwediEUsqmtf0cuCV5TPPKw/PQHRhueUo6JdeFJaqV3pyjm0GdYjZotbRt/A==",
      "cpu": [
        "arm64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "android"
      ],
      "engines": {
        "node": ">= 10.0.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/parcel"
      }
    },
    "node_modules/@parcel/watcher-darwin-arm64": {
      "version": "2.5.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@parcel/watcher-darwin-arm64/-/watcher-darwin-arm64-2.5.6.tgz",
      "integrity": "sha512-Z2ZdrnwyXvvvdtRHLmM4knydIdU9adO3D4n/0cVipF3rRiwP+3/sfzpAwA/qKFL6i1ModaabkU7IbpeMBgiVEA==",
      "cpu": [
        "arm64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "darwin"
      ],
      "engines": {
        "node": ">= 10.0.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/parcel"
      }
    },
    "node_modules/@parcel/watcher-darwin-x64": {
      "version": "2.5.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@parcel/watcher-darwin-x64/-/watcher-darwin-x64-2.5.6.tgz",
      "integrity": "sha512-HgvOf3W9dhithcwOWX9uDZyn1lW9R+7tPZ4sug+NGrGIo4Rk1hAXLEbcH1TQSqxts0NYXXlOWqVpvS1SFS4fRg==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "darwin"
      ],
      "engines": {
        "node": ">= 10.0.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/parcel"
      }
    },
    "node_modules/@parcel/watcher-freebsd-x64": {
      "version": "2.5.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@parcel/watcher-freebsd-x64/-/watcher-freebsd-x64-2.5.6.tgz",
      "integrity": "sha512-vJVi8yd/qzJxEKHkeemh7w3YAn6RJCtYlE4HPMoVnCpIXEzSrxErBW5SJBgKLbXU3WdIpkjBTeUNtyBVn8TRng==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "freebsd"
      ],
      "engines": {
        "node": ">= 10.0.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/parcel"
      }
    },
    "node_modules/@parcel/watcher-linux-arm-glibc": {
      "version": "2.5.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@parcel/watcher-linux-arm-glibc/-/watcher-linux-arm-glibc-2.5.6.tgz",
      "integrity": "sha512-9JiYfB6h6BgV50CCfasfLf/uvOcJskMSwcdH1PHH9rvS1IrNy8zad6IUVPVUfmXr+u+Km9IxcfMLzgdOudz9EQ==",
      "cpu": [
        "arm"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ],
      "engines": {
        "node": ">= 10.0.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/parcel"
      }
    },
    "node_modules/@parcel/watcher-linux-arm-musl": {
      "version": "2.5.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@parcel/watcher-linux-arm-musl/-/watcher-linux-arm-musl-2.5.6.tgz",
      "integrity": "sha512-Ve3gUCG57nuUUSyjBq/MAM0CzArtuIOxsBdQ+ftz6ho8n7s1i9E1Nmk/xmP323r2YL0SONs1EuwqBp2u1k5fxg==",
      "cpu": [
        "arm"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ],
      "engines": {
        "node": ">= 10.0.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/parcel"
      }
    },
    "node_modules/@parcel/watcher-linux-arm64-glibc": {
      "version": "2.5.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@parcel/watcher-linux-arm64-glibc/-/watcher-linux-arm64-glibc-2.5.6.tgz",
      "integrity": "sha512-f2g/DT3NhGPdBmMWYoxixqYr3v/UXcmLOYy16Bx0TM20Tchduwr4EaCbmxh1321TABqPGDpS8D/ggOTaljijOA==",
      "cpu": [
        "arm64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ],
      "engines": {
        "node": ">= 10.0.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/parcel"
      }
    },
    "node_modules/@parcel/watcher-linux-arm64-musl": {
      "version": "2.5.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@parcel/watcher-linux-arm64-musl/-/watcher-linux-arm64-musl-2.5.6.tgz",
      "integrity": "sha512-qb6naMDGlbCwdhLj6hgoVKJl2odL34z2sqkC7Z6kzir8b5W65WYDpLB6R06KabvZdgoHI/zxke4b3zR0wAbDTA==",
      "cpu": [
        "arm64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ],
      "engines": {
        "node": ">= 10.0.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/parcel"
      }
    },
    "node_modules/@parcel/watcher-linux-x64-glibc": {
      "version": "2.5.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@parcel/watcher-linux-x64-glibc/-/watcher-linux-x64-glibc-2.5.6.tgz",
      "integrity": "sha512-kbT5wvNQlx7NaGjzPFu8nVIW1rWqV780O7ZtkjuWaPUgpv2NMFpjYERVi0UYj1msZNyCzGlaCWEtzc+exjMGbQ==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ],
      "engines": {
        "node": ">= 10.0.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/parcel"
      }
    },
    "node_modules/@parcel/watcher-linux-x64-musl": {
      "version": "2.5.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@parcel/watcher-linux-x64-musl/-/watcher-linux-x64-musl-2.5.6.tgz",
      "integrity": "sha512-1JRFeC+h7RdXwldHzTsmdtYR/Ku8SylLgTU/reMuqdVD7CtLwf0VR1FqeprZ0eHQkO0vqsbvFLXUmYm/uNKJBg==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ],
      "engines": {
        "node": ">= 10.0.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/parcel"
      }
    },
    "node_modules/@parcel/watcher-win32-arm64": {
      "version": "2.5.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@parcel/watcher-win32-arm64/-/watcher-win32-arm64-2.5.6.tgz",
      "integrity": "sha512-3ukyebjc6eGlw9yRt678DxVF7rjXatWiHvTXqphZLvo7aC5NdEgFufVwjFfY51ijYEWpXbqF5jtrK275z52D4Q==",
      "cpu": [
        "arm64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "win32"
      ],
      "engines": {
        "node": ">= 10.0.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/parcel"
      }
    },
    "node_modules/@parcel/watcher-win32-ia32": {
      "version": "2.5.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@parcel/watcher-win32-ia32/-/watcher-win32-ia32-2.5.6.tgz",
      "integrity": "sha512-k35yLp1ZMwwee3Ez/pxBi5cf4AoBKYXj00CZ80jUz5h8prpiaQsiRPKQMxoLstNuqe2vR4RNPEAEcjEFzhEz/g==",
      "cpu": [
        "ia32"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "win32"
      ],
      "engines": {
        "node": ">= 10.0.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/parcel"
      }
    },
    "node_modules/@parcel/watcher-win32-x64": {
      "version": "2.5.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@parcel/watcher-win32-x64/-/watcher-win32-x64-2.5.6.tgz",
      "integrity": "sha512-hbQlYcCq5dlAX9Qx+kFb0FHue6vbjlf0FrNzSKdYK2APUf7tGfGxQCk2ihEREmbR6ZMc0MVAD5RIX/41gpUzTw==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "win32"
      ],
      "engines": {
        "node": ">= 10.0.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/parcel"
      }
    },
    "node_modules/@parcel/watcher/node_modules/node-addon-api": {
      "version": "7.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/node-addon-api/-/node-addon-api-7.1.1.tgz",
      "integrity": "sha512-5m3bsyrjFWE1xf7nz7YXdN4udnVtXK6/Yfgn5qnahL6bCkf2yKt4k3nuTKAtT4r3IG8JNR2ncsIMdZuAzJjHQQ==",
      "dev": true,
      "license": "MIT",
      "optional": true
    },
    "node_modules/@pkgjs/parseargs": {
      "version": "0.11.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@pkgjs/parseargs/-/parseargs-0.11.0.tgz",
      "integrity": "sha512-+1VkjdD0QBLPodGrJUeqarH8VAIvQODIbwh9XpP5Syisf7YoQgsJKPNFoqqLQlu+VQ/tVSshMR6loPMn8U+dPg==",
      "dev": true,
      "license": "MIT",
      "optional": true,
      "engines": {
        "node": ">=14"
      }
    },
    "node_modules/@popperjs/core": {
      "version": "2.11.8",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@popperjs/core/-/core-2.11.8.tgz",
      "integrity": "sha512-P1st0aksCrn9sGZhp8GMYwBnQsbvAWsZAX44oXNNvLHGqAOcoVxmjZiohstwQ7SqKnbR47akdNi+uleWD8+g6A==",
      "license": "MIT",
      "peer": true,
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/popperjs"
      }
    },
    "node_modules/@rollup/rollup-android-arm-eabi": {
      "version": "4.59.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@rollup/rollup-android-arm-eabi/-/rollup-android-arm-eabi-4.59.0.tgz",
      "integrity": "sha512-upnNBkA6ZH2VKGcBj9Fyl9IGNPULcjXRlg0LLeaioQWueH30p6IXtJEbKAgvyv+mJaMxSm1l6xwDXYjpEMiLMg==",
      "cpu": [
        "arm"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "android"
      ]
    },
    "node_modules/@rollup/rollup-android-arm64": {
      "version": "4.59.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@rollup/rollup-android-arm64/-/rollup-android-arm64-4.59.0.tgz",
      "integrity": "sha512-hZ+Zxj3SySm4A/DylsDKZAeVg0mvi++0PYVceVyX7hemkw7OreKdCvW2oQ3T1FMZvCaQXqOTHb8qmBShoqk69Q==",
      "cpu": [
        "arm64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "android"
      ]
    },
    "node_modules/@rollup/rollup-darwin-arm64": {
      "version": "4.59.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@rollup/rollup-darwin-arm64/-/rollup-darwin-arm64-4.59.0.tgz",
      "integrity": "sha512-W2Psnbh1J8ZJw0xKAd8zdNgF9HRLkdWwwdWqubSVk0pUuQkoHnv7rx4GiF9rT4t5DIZGAsConRE3AxCdJ4m8rg==",
      "cpu": [
        "arm64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "darwin"
      ]
    },
    "node_modules/@rollup/rollup-darwin-x64": {
      "version": "4.59.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@rollup/rollup-darwin-x64/-/rollup-darwin-x64-4.59.0.tgz",
      "integrity": "sha512-ZW2KkwlS4lwTv7ZVsYDiARfFCnSGhzYPdiOU4IM2fDbL+QGlyAbjgSFuqNRbSthybLbIJ915UtZBtmuLrQAT/w==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "darwin"
      ]
    },
    "node_modules/@rollup/rollup-freebsd-arm64": {
      "version": "4.59.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@rollup/rollup-freebsd-arm64/-/rollup-freebsd-arm64-4.59.0.tgz",
      "integrity": "sha512-EsKaJ5ytAu9jI3lonzn3BgG8iRBjV4LxZexygcQbpiU0wU0ATxhNVEpXKfUa0pS05gTcSDMKpn3Sx+QB9RlTTA==",
      "cpu": [
        "arm64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "freebsd"
      ]
    },
    "node_modules/@rollup/rollup-freebsd-x64": {
      "version": "4.59.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@rollup/rollup-freebsd-x64/-/rollup-freebsd-x64-4.59.0.tgz",
      "integrity": "sha512-d3DuZi2KzTMjImrxoHIAODUZYoUUMsuUiY4SRRcJy6NJoZ6iIqWnJu9IScV9jXysyGMVuW+KNzZvBLOcpdl3Vg==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "freebsd"
      ]
    },
    "node_modules/@rollup/rollup-linux-arm-gnueabihf": {
      "version": "4.59.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@rollup/rollup-linux-arm-gnueabihf/-/rollup-linux-arm-gnueabihf-4.59.0.tgz",
      "integrity": "sha512-t4ONHboXi/3E0rT6OZl1pKbl2Vgxf9vJfWgmUoCEVQVxhW6Cw/c8I6hbbu7DAvgp82RKiH7TpLwxnJeKv2pbsw==",
      "cpu": [
        "arm"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ]
    },
    "node_modules/@rollup/rollup-linux-arm-musleabihf": {
      "version": "4.59.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@rollup/rollup-linux-arm-musleabihf/-/rollup-linux-arm-musleabihf-4.59.0.tgz",
      "integrity": "sha512-CikFT7aYPA2ufMD086cVORBYGHffBo4K8MQ4uPS/ZnY54GKj36i196u8U+aDVT2LX4eSMbyHtyOh7D7Zvk2VvA==",
      "cpu": [
        "arm"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ]
    },
    "node_modules/@rollup/rollup-linux-arm64-gnu": {
      "version": "4.59.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@rollup/rollup-linux-arm64-gnu/-/rollup-linux-arm64-gnu-4.59.0.tgz",
      "integrity": "sha512-jYgUGk5aLd1nUb1CtQ8E+t5JhLc9x5WdBKew9ZgAXg7DBk0ZHErLHdXM24rfX+bKrFe+Xp5YuJo54I5HFjGDAA==",
      "cpu": [
        "arm64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ]
    },
    "node_modules/@rollup/rollup-linux-arm64-musl": {
      "version": "4.59.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@rollup/rollup-linux-arm64-musl/-/rollup-linux-arm64-musl-4.59.0.tgz",
      "integrity": "sha512-peZRVEdnFWZ5Bh2KeumKG9ty7aCXzzEsHShOZEFiCQlDEepP1dpUl/SrUNXNg13UmZl+gzVDPsiCwnV1uI0RUA==",
      "cpu": [
        "arm64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ]
    },
    "node_modules/@rollup/rollup-linux-loong64-gnu": {
      "version": "4.59.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@rollup/rollup-linux-loong64-gnu/-/rollup-linux-loong64-gnu-4.59.0.tgz",
      "integrity": "sha512-gbUSW/97f7+r4gHy3Jlup8zDG190AuodsWnNiXErp9mT90iCy9NKKU0Xwx5k8VlRAIV2uU9CsMnEFg/xXaOfXg==",
      "cpu": [
        "loong64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ]
    },
    "node_modules/@rollup/rollup-linux-loong64-musl": {
      "version": "4.59.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@rollup/rollup-linux-loong64-musl/-/rollup-linux-loong64-musl-4.59.0.tgz",
      "integrity": "sha512-yTRONe79E+o0FWFijasoTjtzG9EBedFXJMl888NBEDCDV9I2wGbFFfJQQe63OijbFCUZqxpHz1GzpbtSFikJ4Q==",
      "cpu": [
        "loong64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ]
    },
    "node_modules/@rollup/rollup-linux-ppc64-gnu": {
      "version": "4.59.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@rollup/rollup-linux-ppc64-gnu/-/rollup-linux-ppc64-gnu-4.59.0.tgz",
      "integrity": "sha512-sw1o3tfyk12k3OEpRddF68a1unZ5VCN7zoTNtSn2KndUE+ea3m3ROOKRCZxEpmT9nsGnogpFP9x6mnLTCaoLkA==",
      "cpu": [
        "ppc64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ]
    },
    "node_modules/@rollup/rollup-linux-ppc64-musl": {
      "version": "4.59.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@rollup/rollup-linux-ppc64-musl/-/rollup-linux-ppc64-musl-4.59.0.tgz",
      "integrity": "sha512-+2kLtQ4xT3AiIxkzFVFXfsmlZiG5FXYW7ZyIIvGA7Bdeuh9Z0aN4hVyXS/G1E9bTP/vqszNIN/pUKCk/BTHsKA==",
      "cpu": [
        "ppc64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ]
    },
    "node_modules/@rollup/rollup-linux-riscv64-gnu": {
      "version": "4.59.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@rollup/rollup-linux-riscv64-gnu/-/rollup-linux-riscv64-gnu-4.59.0.tgz",
      "integrity": "sha512-NDYMpsXYJJaj+I7UdwIuHHNxXZ/b/N2hR15NyH3m2qAtb/hHPA4g4SuuvrdxetTdndfj9b1WOmy73kcPRoERUg==",
      "cpu": [
        "riscv64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ]
    },
    "node_modules/@rollup/rollup-linux-riscv64-musl": {
      "version": "4.59.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@rollup/rollup-linux-riscv64-musl/-/rollup-linux-riscv64-musl-4.59.0.tgz",
      "integrity": "sha512-nLckB8WOqHIf1bhymk+oHxvM9D3tyPndZH8i8+35p/1YiVoVswPid2yLzgX7ZJP0KQvnkhM4H6QZ5m0LzbyIAg==",
      "cpu": [
        "riscv64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ]
    },
    "node_modules/@rollup/rollup-linux-s390x-gnu": {
      "version": "4.59.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@rollup/rollup-linux-s390x-gnu/-/rollup-linux-s390x-gnu-4.59.0.tgz",
      "integrity": "sha512-oF87Ie3uAIvORFBpwnCvUzdeYUqi2wY6jRFWJAy1qus/udHFYIkplYRW+wo+GRUP4sKzYdmE1Y3+rY5Gc4ZO+w==",
      "cpu": [
        "s390x"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ]
    },
    "node_modules/@rollup/rollup-linux-x64-gnu": {
      "version": "4.59.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@rollup/rollup-linux-x64-gnu/-/rollup-linux-x64-gnu-4.59.0.tgz",
      "integrity": "sha512-3AHmtQq/ppNuUspKAlvA8HtLybkDflkMuLK4DPo77DfthRb71V84/c4MlWJXixZz4uruIH4uaa07IqoAkG64fg==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ]
    },
    "node_modules/@rollup/rollup-linux-x64-musl": {
      "version": "4.59.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@rollup/rollup-linux-x64-musl/-/rollup-linux-x64-musl-4.59.0.tgz",
      "integrity": "sha512-2UdiwS/9cTAx7qIUZB/fWtToJwvt0Vbo0zmnYt7ED35KPg13Q0ym1g442THLC7VyI6JfYTP4PiSOWyoMdV2/xg==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "linux"
      ]
    },
    "node_modules/@rollup/rollup-openbsd-x64": {
      "version": "4.59.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@rollup/rollup-openbsd-x64/-/rollup-openbsd-x64-4.59.0.tgz",
      "integrity": "sha512-M3bLRAVk6GOwFlPTIxVBSYKUaqfLrn8l0psKinkCFxl4lQvOSz8ZrKDz2gxcBwHFpci0B6rttydI4IpS4IS/jQ==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "openbsd"
      ]
    },
    "node_modules/@rollup/rollup-openharmony-arm64": {
      "version": "4.59.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@rollup/rollup-openharmony-arm64/-/rollup-openharmony-arm64-4.59.0.tgz",
      "integrity": "sha512-tt9KBJqaqp5i5HUZzoafHZX8b5Q2Fe7UjYERADll83O4fGqJ49O1FsL6LpdzVFQcpwvnyd0i+K/VSwu/o/nWlA==",
      "cpu": [
        "arm64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "openharmony"
      ]
    },
    "node_modules/@rollup/rollup-win32-arm64-msvc": {
      "version": "4.59.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@rollup/rollup-win32-arm64-msvc/-/rollup-win32-arm64-msvc-4.59.0.tgz",
      "integrity": "sha512-V5B6mG7OrGTwnxaNUzZTDTjDS7F75PO1ae6MJYdiMu60sq0CqN5CVeVsbhPxalupvTX8gXVSU9gq+Rx1/hvu6A==",
      "cpu": [
        "arm64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "win32"
      ]
    },
    "node_modules/@rollup/rollup-win32-ia32-msvc": {
      "version": "4.59.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@rollup/rollup-win32-ia32-msvc/-/rollup-win32-ia32-msvc-4.59.0.tgz",
      "integrity": "sha512-UKFMHPuM9R0iBegwzKF4y0C4J9u8C6MEJgFuXTBerMk7EJ92GFVFYBfOZaSGLu6COf7FxpQNqhNS4c4icUPqxA==",
      "cpu": [
        "ia32"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "win32"
      ]
    },
    "node_modules/@rollup/rollup-win32-x64-gnu": {
      "version": "4.59.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@rollup/rollup-win32-x64-gnu/-/rollup-win32-x64-gnu-4.59.0.tgz",
      "integrity": "sha512-laBkYlSS1n2L8fSo1thDNGrCTQMmxjYY5G0WFWjFFYZkKPjsMBsgJfGf4TLxXrF6RyhI60L8TMOjBMvXiTcxeA==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "win32"
      ]
    },
    "node_modules/@rollup/rollup-win32-x64-msvc": {
      "version": "4.59.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@rollup/rollup-win32-x64-msvc/-/rollup-win32-x64-msvc-4.59.0.tgz",
      "integrity": "sha512-2HRCml6OztYXyJXAvdDXPKcawukWY2GpR5/nxKp4iBgiO3wcoEGkAaqctIbZcNB6KlUQBIqt8VYkNSj2397EfA==",
      "cpu": [
        "x64"
      ],
      "dev": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "win32"
      ]
    },
    "node_modules/@schematics/angular": {
      "version": "19.2.23",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@schematics/angular/-/angular-19.2.23.tgz",
      "integrity": "sha512-ansmlDO94+d5kkDhBSvtS4XEKpNpmjOyBO3O6ChVqkE6MUrzJ5YI6jAm7p/zxQOMKrS3DhRUS3SUh/Xm/M3VWw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@angular-devkit/core": "19.2.23",
        "@angular-devkit/schematics": "19.2.23",
        "jsonc-parser": "3.3.1"
      },
      "engines": {
        "node": "^18.19.1 || ^20.11.1 || >=22.0.0",
        "npm": "^6.11.0 || ^7.5.6 || >=8.0.0",
        "yarn": ">= 1.13.0"
      }
    },
    "node_modules/@sigstore/bundle": {
      "version": "3.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@sigstore/bundle/-/bundle-3.1.0.tgz",
      "integrity": "sha512-Mm1E3/CmDDCz3nDhFKTuYdB47EdRFRQMOE/EAbiG1MJW77/w1b3P7Qx7JSrVJs8PfwOLOVcKQCHErIwCTyPbag==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "@sigstore/protobuf-specs": "^0.4.0"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/@sigstore/core": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@sigstore/core/-/core-2.0.0.tgz",
      "integrity": "sha512-nYxaSb/MtlSI+JWcwTHQxyNmWeWrUXJJ/G4liLrGG7+tS4vAz6LF3xRXqLH6wPIVUoZQel2Fs4ddLx4NCpiIYg==",
      "dev": true,
      "license": "Apache-2.0",
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/@sigstore/protobuf-specs": {
      "version": "0.4.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@sigstore/protobuf-specs/-/protobuf-specs-0.4.3.tgz",
      "integrity": "sha512-fk2zjD9117RL9BjqEwF7fwv7Q/P9yGsMV4MUJZ/DocaQJ6+3pKr+syBq1owU5Q5qGw5CUbXzm+4yJ2JVRDQeSA==",
      "dev": true,
      "license": "Apache-2.0",
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/@sigstore/sign": {
      "version": "3.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@sigstore/sign/-/sign-3.1.0.tgz",
      "integrity": "sha512-knzjmaOHOov1Ur7N/z4B1oPqZ0QX5geUfhrVaqVlu+hl0EAoL4o+l0MSULINcD5GCWe3Z0+YJO8ues6vFlW0Yw==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "@sigstore/bundle": "^3.1.0",
        "@sigstore/core": "^2.0.0",
        "@sigstore/protobuf-specs": "^0.4.0",
        "make-fetch-happen": "^14.0.2",
        "proc-log": "^5.0.0",
        "promise-retry": "^2.0.1"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/@sigstore/tuf": {
      "version": "3.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@sigstore/tuf/-/tuf-3.1.1.tgz",
      "integrity": "sha512-eFFvlcBIoGwVkkwmTi/vEQFSva3xs5Ot3WmBcjgjVdiaoelBLQaQ/ZBfhlG0MnG0cmTYScPpk7eDdGDWUcFUmg==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "@sigstore/protobuf-specs": "^0.4.1",
        "tuf-js": "^3.0.1"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/@sigstore/verify": {
      "version": "2.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@sigstore/verify/-/verify-2.1.1.tgz",
      "integrity": "sha512-hVJD77oT67aowHxwT4+M6PGOp+E2LtLdTK3+FC0lBO9T7sYwItDMXZ7Z07IDCvR1M717a4axbIWckrW67KMP/w==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "@sigstore/bundle": "^3.1.0",
        "@sigstore/core": "^2.0.0",
        "@sigstore/protobuf-specs": "^0.4.1"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/@sinclair/typebox": {
      "version": "0.27.10",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@sinclair/typebox/-/typebox-0.27.10.tgz",
      "integrity": "sha512-MTBk/3jGLNB2tVxv6uLlFh1iu64iYOQ2PbdOSK3NW8JZsmlaOh2q6sdtKowBhfw8QFLmYNzTW4/oK4uATIi6ZA==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/@sindresorhus/merge-streams": {
      "version": "2.3.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@sindresorhus/merge-streams/-/merge-streams-2.3.0.tgz",
      "integrity": "sha512-LtoMMhxAlorcGhmFYI+LhPgbPZCkgP6ra1YL604EeF6U98pLlQ3iWIGMdWSC+vWmPBWBNgmDBAhnAobLROJmwg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=18"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/@sinonjs/commons": {
      "version": "3.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@sinonjs/commons/-/commons-3.0.1.tgz",
      "integrity": "sha512-K3mCHKQ9sVh8o1C9cxkwxaOmXoAMlDxC1mYyHrjqOWEcBjYr76t96zL2zlj5dUGZ3HSw240X1qgH3Mjf1yJWpQ==",
      "dev": true,
      "license": "BSD-3-Clause",
      "dependencies": {
        "type-detect": "4.0.8"
      }
    },
    "node_modules/@sinonjs/fake-timers": {
      "version": "10.3.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@sinonjs/fake-timers/-/fake-timers-10.3.0.tgz",
      "integrity": "sha512-V4BG07kuYSUkTCSBHG8G8TNhM+F19jXFWnQtzj+we8DrkpSBCee9Z3Ms8yiGer/dlmhe35/Xdgyo3/0rQKg7YA==",
      "dev": true,
      "license": "BSD-3-Clause",
      "dependencies": {
        "@sinonjs/commons": "^3.0.0"
      }
    },
    "node_modules/@tootallnate/once": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@tootallnate/once/-/once-2.0.0.tgz",
      "integrity": "sha512-XCuKFP5PS55gnMVu3dty8KPatLqUoy/ZYzDzAGCQ8JNFCkLXzmI7vNHCR+XpbZaMWQK/vQubr7PkYq8g470J/A==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 10"
      }
    },
    "node_modules/@tufjs/canonical-json": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@tufjs/canonical-json/-/canonical-json-2.0.0.tgz",
      "integrity": "sha512-yVtV8zsdo8qFHe+/3kw81dSLyF7D576A5cCFCi4X7B39tWT7SekaEFUnvnWJHz+9qO7qJTah1JbrDjWKqFtdWA==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": "^16.14.0 || >=18.0.0"
      }
    },
    "node_modules/@tufjs/models": {
      "version": "3.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@tufjs/models/-/models-3.0.1.tgz",
      "integrity": "sha512-UUYHISyhCU3ZgN8yaear3cGATHb3SMuKHsQ/nVbHXcmnBf+LzQ/cQfhNG+rfaSHgqGKNEm2cOCLVLELStUQ1JA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@tufjs/canonical-json": "2.0.0",
        "minimatch": "^9.0.5"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/@tufjs/models/node_modules/brace-expansion": {
      "version": "2.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/brace-expansion/-/brace-expansion-2.0.3.tgz",
      "integrity": "sha512-MCV/fYJEbqx68aE58kv2cA/kiky1G8vux3OR6/jbS+jIMe/6fJWa0DTzJU7dqijOWYwHi1t29FlfYI9uytqlpA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "balanced-match": "^1.0.0"
      }
    },
    "node_modules/@tufjs/models/node_modules/minimatch": {
      "version": "9.0.9",
      "resolved": "http://binario.caixa:8081/repository/npm-all/minimatch/-/minimatch-9.0.9.tgz",
      "integrity": "sha512-OBwBN9AL4dqmETlpS2zasx+vTeWclWzkblfZk7KTA5j3jeOONz/tRCnZomUyvNg83wL5Zv9Ss6HMJXAgL8R2Yg==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "brace-expansion": "^2.0.2"
      },
      "engines": {
        "node": ">=16 || 14 >=14.17"
      },
      "funding": {
        "url": "https://github.com/sponsors/isaacs"
      }
    },
    "node_modules/@types/babel__core": {
      "version": "7.20.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/babel__core/-/babel__core-7.20.5.tgz",
      "integrity": "sha512-qoQprZvz5wQFJwMDqeseRXWv3rqMvhgpbXFfVyWhbx9X47POIA6i/+dXefEmZKoAgOaTdaIgNSMqMIU61yRyzA==",
      "license": "MIT",
      "dependencies": {
        "@babel/parser": "^7.20.7",
        "@babel/types": "^7.20.7",
        "@types/babel__generator": "*",
        "@types/babel__template": "*",
        "@types/babel__traverse": "*"
      }
    },
    "node_modules/@types/babel__generator": {
      "version": "7.27.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/babel__generator/-/babel__generator-7.27.0.tgz",
      "integrity": "sha512-ufFd2Xi92OAVPYsy+P4n7/U7e68fex0+Ee8gSG9KX7eo084CWiQ4sdxktvdl0bOPupXtVJPY19zk6EwWqUQ8lg==",
      "license": "MIT",
      "dependencies": {
        "@babel/types": "^7.0.0"
      }
    },
    "node_modules/@types/babel__template": {
      "version": "7.4.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/babel__template/-/babel__template-7.4.4.tgz",
      "integrity": "sha512-h/NUaSyG5EyxBIp8YRxo4RMe2/qQgvyowRwVMzhYhBCONbW8PUsg4lkFMrhgZhUe5z3L3MiLDuvyJ/CaPa2A8A==",
      "license": "MIT",
      "dependencies": {
        "@babel/parser": "^7.1.0",
        "@babel/types": "^7.0.0"
      }
    },
    "node_modules/@types/babel__traverse": {
      "version": "7.28.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/babel__traverse/-/babel__traverse-7.28.0.tgz",
      "integrity": "sha512-8PvcXf70gTDZBgt9ptxJ8elBeBjcLOAcOtoO/mPJjtji1+CdGbHgm77om1GrsPxsiE+uXIpNSK64UYaIwQXd4Q==",
      "license": "MIT",
      "dependencies": {
        "@babel/types": "^7.28.2"
      }
    },
    "node_modules/@types/body-parser": {
      "version": "1.19.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/body-parser/-/body-parser-1.19.6.tgz",
      "integrity": "sha512-HLFeCYgz89uk22N5Qg3dvGvsv46B8GLvKKo1zKG4NybA8U2DiEO3w9lqGg29t/tfLRJpJ6iQxnVw4OnB7MoM9g==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/connect": "*",
        "@types/node": "*"
      }
    },
    "node_modules/@types/bonjour": {
      "version": "3.5.13",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/bonjour/-/bonjour-3.5.13.tgz",
      "integrity": "sha512-z9fJ5Im06zvUL548KvYNecEVlA7cVDkGUi6kZusb04mpyEFKCIZJvloCcmpmLaIahDpOQGHaHmG6imtPMmPXGQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/node": "*"
      }
    },
    "node_modules/@types/connect": {
      "version": "3.4.38",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/connect/-/connect-3.4.38.tgz",
      "integrity": "sha512-K6uROf1LD88uDQqJCktA4yzL1YYAK6NgfsI0v/mTgyPKWsX1CnJ0XPSDhViejru1GcRkLWb8RlzFYJRqGUbaug==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/node": "*"
      }
    },
    "node_modules/@types/connect-history-api-fallback": {
      "version": "1.5.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/connect-history-api-fallback/-/connect-history-api-fallback-1.5.4.tgz",
      "integrity": "sha512-n6Cr2xS1h4uAulPRdlw6Jl6s1oG8KrVilPN2yUITEs+K48EzMJJ3W1xy8K5eWuFvjp3R74AOIGSmp2UfBJ8HFw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/express-serve-static-core": "*",
        "@types/node": "*"
      }
    },
    "node_modules/@types/d3": {
      "version": "7.4.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3/-/d3-7.4.3.tgz",
      "integrity": "sha512-lZXZ9ckh5R8uiFVt8ogUNf+pIrK4EsWrx2Np75WvF/eTpJ0FMHNhjXk8CKEx/+gpHbNQyJWehbFaTvqmHWB3ww==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "@types/d3-array": "*",
        "@types/d3-axis": "*",
        "@types/d3-brush": "*",
        "@types/d3-chord": "*",
        "@types/d3-color": "*",
        "@types/d3-contour": "*",
        "@types/d3-delaunay": "*",
        "@types/d3-dispatch": "*",
        "@types/d3-drag": "*",
        "@types/d3-dsv": "*",
        "@types/d3-ease": "*",
        "@types/d3-fetch": "*",
        "@types/d3-force": "*",
        "@types/d3-format": "*",
        "@types/d3-geo": "*",
        "@types/d3-hierarchy": "*",
        "@types/d3-interpolate": "*",
        "@types/d3-path": "*",
        "@types/d3-polygon": "*",
        "@types/d3-quadtree": "*",
        "@types/d3-random": "*",
        "@types/d3-scale": "*",
        "@types/d3-scale-chromatic": "*",
        "@types/d3-selection": "*",
        "@types/d3-shape": "*",
        "@types/d3-time": "*",
        "@types/d3-time-format": "*",
        "@types/d3-timer": "*",
        "@types/d3-transition": "*",
        "@types/d3-zoom": "*"
      }
    },
    "node_modules/@types/d3-array": {
      "version": "3.2.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3-array/-/d3-array-3.2.2.tgz",
      "integrity": "sha512-hOLWVbm7uRza0BYXpIIW5pxfrKe0W+D5lrFiAEYR+pb6w3N2SwSMaJbXdUfSEv+dT4MfHBLtn5js0LAWaO6otw==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/@types/d3-axis": {
      "version": "3.0.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3-axis/-/d3-axis-3.0.6.tgz",
      "integrity": "sha512-pYeijfZuBd87T0hGn0FO1vQ/cgLk6E1ALJjfkC0oJ8cbwkZl3TpgS8bVBLZN+2jjGgg38epgxb2zmoGtSfvgMw==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "@types/d3-selection": "*"
      }
    },
    "node_modules/@types/d3-brush": {
      "version": "3.0.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3-brush/-/d3-brush-3.0.6.tgz",
      "integrity": "sha512-nH60IZNNxEcrh6L1ZSMNA28rj27ut/2ZmI3r96Zd+1jrZD++zD3LsMIjWlvg4AYrHn/Pqz4CF3veCxGjtbqt7A==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "@types/d3-selection": "*"
      }
    },
    "node_modules/@types/d3-chord": {
      "version": "3.0.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3-chord/-/d3-chord-3.0.6.tgz",
      "integrity": "sha512-LFYWWd8nwfwEmTZG9PfQxd17HbNPksHBiJHaKuY1XeqscXacsS2tyoo6OdRsjf+NQYeB6XrNL3a25E3gH69lcg==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/@types/d3-color": {
      "version": "3.1.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3-color/-/d3-color-3.1.3.tgz",
      "integrity": "sha512-iO90scth9WAbmgv7ogoq57O9YpKmFBbmoEoCHDB2xMBY0+/KVrqAaCDyCE16dUspeOvIxFFRI+0sEtqDqy2b4A==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/@types/d3-contour": {
      "version": "3.0.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3-contour/-/d3-contour-3.0.6.tgz",
      "integrity": "sha512-BjzLgXGnCWjUSYGfH1cpdo41/hgdWETu4YxpezoztawmqsvCeep+8QGfiY6YbDvfgHz/DkjeIkkZVJavB4a3rg==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "@types/d3-array": "*",
        "@types/geojson": "*"
      }
    },
    "node_modules/@types/d3-delaunay": {
      "version": "6.0.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3-delaunay/-/d3-delaunay-6.0.4.tgz",
      "integrity": "sha512-ZMaSKu4THYCU6sV64Lhg6qjf1orxBthaC161plr5KuPHo3CNm8DTHiLw/5Eq2b6TsNP0W0iJrUOFscY6Q450Hw==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/@types/d3-dispatch": {
      "version": "3.0.7",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3-dispatch/-/d3-dispatch-3.0.7.tgz",
      "integrity": "sha512-5o9OIAdKkhN1QItV2oqaE5KMIiXAvDWBDPrD85e58Qlz1c1kI/J0NcqbEG88CoTwJrYe7ntUCVfeUl2UJKbWgA==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/@types/d3-drag": {
      "version": "3.0.7",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3-drag/-/d3-drag-3.0.7.tgz",
      "integrity": "sha512-HE3jVKlzU9AaMazNufooRJ5ZpWmLIoc90A37WU2JMmeq28w1FQqCZswHZ3xR+SuxYftzHq6WU6KJHvqxKzTxxQ==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "@types/d3-selection": "*"
      }
    },
    "node_modules/@types/d3-dsv": {
      "version": "3.0.7",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3-dsv/-/d3-dsv-3.0.7.tgz",
      "integrity": "sha512-n6QBF9/+XASqcKK6waudgL0pf/S5XHPPI8APyMLLUHd8NqouBGLsU8MgtO7NINGtPBtk9Kko/W4ea0oAspwh9g==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/@types/d3-ease": {
      "version": "3.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3-ease/-/d3-ease-3.0.2.tgz",
      "integrity": "sha512-NcV1JjO5oDzoK26oMzbILE6HW7uVXOHLQvHshBUW4UMdZGfiY6v5BeQwh9a9tCzv+CeefZQHJt5SRgK154RtiA==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/@types/d3-fetch": {
      "version": "3.0.7",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3-fetch/-/d3-fetch-3.0.7.tgz",
      "integrity": "sha512-fTAfNmxSb9SOWNB9IoG5c8Hg6R+AzUHDRlsXsDZsNp6sxAEOP0tkP3gKkNSO/qmHPoBFTxNrjDprVHDQDvo5aA==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "@types/d3-dsv": "*"
      }
    },
    "node_modules/@types/d3-force": {
      "version": "3.0.10",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3-force/-/d3-force-3.0.10.tgz",
      "integrity": "sha512-ZYeSaCF3p73RdOKcjj+swRlZfnYpK1EbaDiYICEEp5Q6sUiqFaFQ9qgoshp5CzIyyb/yD09kD9o2zEltCexlgw==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/@types/d3-format": {
      "version": "3.0.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3-format/-/d3-format-3.0.4.tgz",
      "integrity": "sha512-fALi2aI6shfg7vM5KiR1wNJnZ7r6UuggVqtDA+xiEdPZQwy/trcQaHnwShLuLdta2rTymCNpxYTiMZX/e09F4g==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/@types/d3-geo": {
      "version": "3.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3-geo/-/d3-geo-3.1.0.tgz",
      "integrity": "sha512-856sckF0oP/diXtS4jNsiQw/UuK5fQG8l/a9VVLeSouf1/PPbBE1i1W852zVwKwYCBkFJJB7nCFTbk6UMEXBOQ==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "@types/geojson": "*"
      }
    },
    "node_modules/@types/d3-hierarchy": {
      "version": "3.1.7",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3-hierarchy/-/d3-hierarchy-3.1.7.tgz",
      "integrity": "sha512-tJFtNoYBtRtkNysX1Xq4sxtjK8YgoWUNpIiUee0/jHGRwqvzYxkq0hGVbbOGSz+JgFxxRu4K8nb3YpG3CMARtg==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/@types/d3-interpolate": {
      "version": "3.0.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3-interpolate/-/d3-interpolate-3.0.4.tgz",
      "integrity": "sha512-mgLPETlrpVV1YRJIglr4Ez47g7Yxjl1lj7YKsiMCb27VJH9W8NVM6Bb9d8kkpG/uAQS5AmbA48q2IAolKKo1MA==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "@types/d3-color": "*"
      }
    },
    "node_modules/@types/d3-path": {
      "version": "3.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3-path/-/d3-path-3.1.1.tgz",
      "integrity": "sha512-VMZBYyQvbGmWyWVea0EHs/BwLgxc+MKi1zLDCONksozI4YJMcTt8ZEuIR4Sb1MMTE8MMW49v0IwI5+b7RmfWlg==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/@types/d3-polygon": {
      "version": "3.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3-polygon/-/d3-polygon-3.0.2.tgz",
      "integrity": "sha512-ZuWOtMaHCkN9xoeEMr1ubW2nGWsp4nIql+OPQRstu4ypeZ+zk3YKqQT0CXVe/PYqrKpZAi+J9mTs05TKwjXSRA==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/@types/d3-quadtree": {
      "version": "3.0.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3-quadtree/-/d3-quadtree-3.0.6.tgz",
      "integrity": "sha512-oUzyO1/Zm6rsxKRHA1vH0NEDG58HrT5icx/azi9MF1TWdtttWl0UIUsjEQBBh+SIkrpd21ZjEv7ptxWys1ncsg==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/@types/d3-random": {
      "version": "3.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3-random/-/d3-random-3.0.3.tgz",
      "integrity": "sha512-Imagg1vJ3y76Y2ea0871wpabqp613+8/r0mCLEBfdtqC7xMSfj9idOnmBYyMoULfHePJyxMAw3nWhJxzc+LFwQ==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/@types/d3-scale": {
      "version": "4.0.9",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3-scale/-/d3-scale-4.0.9.tgz",
      "integrity": "sha512-dLmtwB8zkAeO/juAMfnV+sItKjlsw2lKdZVVy6LRr0cBmegxSABiLEpGVmSJJ8O08i4+sGR6qQtb6WtuwJdvVw==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "@types/d3-time": "*"
      }
    },
    "node_modules/@types/d3-scale-chromatic": {
      "version": "3.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3-scale-chromatic/-/d3-scale-chromatic-3.1.0.tgz",
      "integrity": "sha512-iWMJgwkK7yTRmWqRB5plb1kadXyQ5Sj8V/zYlFGMUBbIPKQScw+Dku9cAAMgJG+z5GYDoMjWGLVOvjghDEFnKQ==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/@types/d3-selection": {
      "version": "3.0.11",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3-selection/-/d3-selection-3.0.11.tgz",
      "integrity": "sha512-bhAXu23DJWsrI45xafYpkQ4NtcKMwWnAC/vKrd2l+nxMFuvOT3XMYTIj2opv8vq8AO5Yh7Qac/nSeP/3zjTK0w==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/@types/d3-shape": {
      "version": "3.1.8",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3-shape/-/d3-shape-3.1.8.tgz",
      "integrity": "sha512-lae0iWfcDeR7qt7rA88BNiqdvPS5pFVPpo5OfjElwNaT2yyekbM0C9vK+yqBqEmHr6lDkRnYNoTBYlAgJa7a4w==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "@types/d3-path": "*"
      }
    },
    "node_modules/@types/d3-time": {
      "version": "3.0.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3-time/-/d3-time-3.0.4.tgz",
      "integrity": "sha512-yuzZug1nkAAaBlBBikKZTgzCeA+k1uy4ZFwWANOfKw5z5LRhV0gNA7gNkKm7HoK+HRN0wX3EkxGk0fpbWhmB7g==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/@types/d3-time-format": {
      "version": "4.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3-time-format/-/d3-time-format-4.0.3.tgz",
      "integrity": "sha512-5xg9rC+wWL8kdDj153qZcsJ0FWiFt0J5RB6LYUNZjwSnesfblqrI/bJ1wBdJ8OQfncgbJG5+2F+qfqnqyzYxyg==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/@types/d3-timer": {
      "version": "3.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3-timer/-/d3-timer-3.0.2.tgz",
      "integrity": "sha512-Ps3T8E8dZDam6fUyNiMkekK3XUsaUEik+idO9/YjPtfj2qruF8tFBXS7XhtE4iIXBLxhmLjP3SXpLhVf21I9Lw==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/@types/d3-transition": {
      "version": "3.0.9",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3-transition/-/d3-transition-3.0.9.tgz",
      "integrity": "sha512-uZS5shfxzO3rGlu0cC3bjmMFKsXv+SmZZcgp0KD22ts4uGXp5EVYGzu/0YdwZeKmddhcAccYtREJKkPfXkZuCg==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "@types/d3-selection": "*"
      }
    },
    "node_modules/@types/d3-zoom": {
      "version": "3.0.8",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/d3-zoom/-/d3-zoom-3.0.8.tgz",
      "integrity": "sha512-iqMC4/YlFCSlO8+2Ii1GGGliCAY4XdeG748w5vQUbevlbDu0zSjH/+jojorQVBK/se0j6DUFNPBGSqD3YWYnDw==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "@types/d3-interpolate": "*",
        "@types/d3-selection": "*"
      }
    },
    "node_modules/@types/eslint": {
      "version": "9.6.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/eslint/-/eslint-9.6.1.tgz",
      "integrity": "sha512-FXx2pKgId/WyYo2jXw63kk7/+TY7u7AziEJxJAnSFzHlqTAS3Ync6SvgYAN/k4/PQpnnVuzoMuVnByKK2qp0ag==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/estree": "*",
        "@types/json-schema": "*"
      }
    },
    "node_modules/@types/eslint-scope": {
      "version": "3.7.7",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/eslint-scope/-/eslint-scope-3.7.7.tgz",
      "integrity": "sha512-MzMFlSLBqNF2gcHWO0G1vP/YQyfvrxZ0bF+u7mzUdZ1/xK4A4sru+nraZz5i3iEIk1l1uyicaDVTB4QbbEkAYg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/eslint": "*",
        "@types/estree": "*"
      }
    },
    "node_modules/@types/estree": {
      "version": "1.0.8",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/estree/-/estree-1.0.8.tgz",
      "integrity": "sha512-dWHzHa2WqEXI/O1E9OjrocMTKJl2mSrEolh1Iomrv6U+JuNwaHXsXx9bLu5gG7BUWFIN0skIQJQ/L1rIex4X6w==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/@types/express": {
      "version": "4.17.25",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/express/-/express-4.17.25.tgz",
      "integrity": "sha512-dVd04UKsfpINUnK0yBoYHDF3xu7xVH4BuDotC/xGuycx4CgbP48X/KF/586bcObxT0HENHXEU8Nqtu6NR+eKhw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/body-parser": "*",
        "@types/express-serve-static-core": "^4.17.33",
        "@types/qs": "*",
        "@types/serve-static": "^1"
      }
    },
    "node_modules/@types/express-serve-static-core": {
      "version": "4.19.8",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/express-serve-static-core/-/express-serve-static-core-4.19.8.tgz",
      "integrity": "sha512-02S5fmqeoKzVZCHPZid4b8JH2eM5HzQLZWN2FohQEy/0eXTq8VXZfSN6Pcr3F6N9R/vNrj7cpgbhjie6m/1tCA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/node": "*",
        "@types/qs": "*",
        "@types/range-parser": "*",
        "@types/send": "*"
      }
    },
    "node_modules/@types/geojson": {
      "version": "7946.0.16",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/geojson/-/geojson-7946.0.16.tgz",
      "integrity": "sha512-6C8nqWur3j98U6+lXDfTUWIfgvZU+EumvpHKcYjujKH7woYyLj2sUmff0tRhrqM7BohUw7Pz3ZB1jj2gW9Fvmg==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/@types/graceful-fs": {
      "version": "4.1.9",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/graceful-fs/-/graceful-fs-4.1.9.tgz",
      "integrity": "sha512-olP3sd1qOEe5dXTSaFvQG+02VdRXcdytWLAZsAq1PecU8uqQAhkrnbli7DagjtXKW/Bl7YJbUsa8MPcuc8LHEQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/node": "*"
      }
    },
    "node_modules/@types/http-errors": {
      "version": "2.0.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/http-errors/-/http-errors-2.0.5.tgz",
      "integrity": "sha512-r8Tayk8HJnX0FztbZN7oVqGccWgw98T/0neJphO91KkmOzug1KkofZURD4UaD5uH8AqcFLfdPErnBod0u71/qg==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/@types/http-proxy": {
      "version": "1.17.17",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/http-proxy/-/http-proxy-1.17.17.tgz",
      "integrity": "sha512-ED6LB+Z1AVylNTu7hdzuBqOgMnvG/ld6wGCG8wFnAzKX5uyW2K3WD52v0gnLCTK/VLpXtKckgWuyScYK6cSPaw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/node": "*"
      }
    },
    "node_modules/@types/istanbul-lib-coverage": {
      "version": "2.0.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/istanbul-lib-coverage/-/istanbul-lib-coverage-2.0.6.tgz",
      "integrity": "sha512-2QF/t/auWm0lsy8XtKVPG19v3sSOQlJe/YHZgfjb/KBBHOGSV+J2q/S671rcq9uTBrLAXmZpqJiaQbMT+zNU1w==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/@types/istanbul-lib-report": {
      "version": "3.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/istanbul-lib-report/-/istanbul-lib-report-3.0.3.tgz",
      "integrity": "sha512-NQn7AHQnk/RSLOxrBbGyJM/aVQ+pjj5HCgasFxc0K/KhoATfQ/47AyUl15I2yBUpihjmas+a+VJBOqecrFH+uA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/istanbul-lib-coverage": "*"
      }
    },
    "node_modules/@types/istanbul-reports": {
      "version": "3.0.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/istanbul-reports/-/istanbul-reports-3.0.4.tgz",
      "integrity": "sha512-pk2B1NWalF9toCRu6gjBzR69syFjP4Od8WRAX+0mmf9lAjCRicLOWc+ZrxZHx/0XRjotgkF9t6iaMJ+aXcOdZQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/istanbul-lib-report": "*"
      }
    },
    "node_modules/@types/jest": {
      "version": "29.5.14",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/jest/-/jest-29.5.14.tgz",
      "integrity": "sha512-ZN+4sdnLUbo8EVvVc2ao0GFW6oVrQRPn4K2lglySj7APvSrgzxHiNNK99us4WDMi57xxA2yggblIAMNhXOotLQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "expect": "^29.0.0",
        "pretty-format": "^29.0.0"
      }
    },
    "node_modules/@types/jsdom": {
      "version": "20.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/jsdom/-/jsdom-20.0.1.tgz",
      "integrity": "sha512-d0r18sZPmMQr1eG35u12FZfhIXNrnsPU/g5wvRKCUf/tOGilKKwYMYGqh33BNR6ba+2gkHw1EUiHoN3mn7E5IQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/node": "*",
        "@types/tough-cookie": "*",
        "parse5": "^7.0.0"
      }
    },
    "node_modules/@types/json-schema": {
      "version": "7.0.15",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/json-schema/-/json-schema-7.0.15.tgz",
      "integrity": "sha512-5+fP8P8MFNC+AyZCDxrB2pkZFPGzqQWUzpSeuuVLvm8VMcorNYavBqoFcxK8bQz4Qsbn4oUEEem4wDLfcysGHA==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/@types/mime": {
      "version": "1.3.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/mime/-/mime-1.3.5.tgz",
      "integrity": "sha512-/pyBZWSLD2n0dcHE3hq8s8ZvcETHtEuF+3E7XVt0Ig2nvsVQXdghHVcEkIWjy9A0wKfTn97a/PSDYohKIlnP/w==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/@types/node": {
      "version": "18.19.130",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/node/-/node-18.19.130.tgz",
      "integrity": "sha512-GRaXQx6jGfL8sKfaIDD6OupbIHBr9jv7Jnaml9tB7l4v068PAOXqfcujMMo5PhbIs6ggR1XODELqahT2R8v0fg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "undici-types": "~5.26.4"
      }
    },
    "node_modules/@types/node-forge": {
      "version": "1.3.14",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/node-forge/-/node-forge-1.3.14.tgz",
      "integrity": "sha512-mhVF2BnD4BO+jtOp7z1CdzaK4mbuK0LLQYAvdOLqHTavxFNq4zA1EmYkpnFjP8HOUzedfQkRnp0E2ulSAYSzAw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/node": "*"
      }
    },
    "node_modules/@types/qs": {
      "version": "6.15.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/qs/-/qs-6.15.0.tgz",
      "integrity": "sha512-JawvT8iBVWpzTrz3EGw9BTQFg3BQNmwERdKE22vlTxawwtbyUSlMppvZYKLZzB5zgACXdXxbD3m1bXaMqP/9ow==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/@types/range-parser": {
      "version": "1.2.7",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/range-parser/-/range-parser-1.2.7.tgz",
      "integrity": "sha512-hKormJbkJqzQGhziax5PItDUTMAM9uE2XXQmM37dyd4hVM+5aVl7oVxMVUiVQn2oCQFN/LKCZdvSM0pFRqbSmQ==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/@types/retry": {
      "version": "0.12.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/retry/-/retry-0.12.2.tgz",
      "integrity": "sha512-XISRgDJ2Tc5q4TRqvgJtzsRkFYNJzZrhTdtMoGVBttwzzQJkPnS3WWTFc7kuDRoPtPakl+T+OfdEUjYJj7Jbow==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/@types/send": {
      "version": "1.2.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/send/-/send-1.2.1.tgz",
      "integrity": "sha512-arsCikDvlU99zl1g69TcAB3mzZPpxgw0UQnaHeC1Nwb015xp8bknZv5rIfri9xTOcMuaVgvabfIRA7PSZVuZIQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/node": "*"
      }
    },
    "node_modules/@types/serve-index": {
      "version": "1.9.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/serve-index/-/serve-index-1.9.4.tgz",
      "integrity": "sha512-qLpGZ/c2fhSs5gnYsQxtDEq3Oy8SXPClIXkW5ghvAvsNuVSA8k+gCONcUCS/UjLEYvYps+e8uBtfgXgvhwfNug==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/express": "*"
      }
    },
    "node_modules/@types/serve-static": {
      "version": "1.15.10",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/serve-static/-/serve-static-1.15.10.tgz",
      "integrity": "sha512-tRs1dB+g8Itk72rlSI2ZrW6vZg0YrLI81iQSTkMmOqnqCaNr/8Ek4VwWcN5vZgCYWbg/JJSGBlUaYGAOP73qBw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/http-errors": "*",
        "@types/node": "*",
        "@types/send": "<1"
      }
    },
    "node_modules/@types/serve-static/node_modules/@types/send": {
      "version": "0.17.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/send/-/send-0.17.6.tgz",
      "integrity": "sha512-Uqt8rPBE8SY0RK8JB1EzVOIZ32uqy8HwdxCnoCOsYrvnswqmFZ/k+9Ikidlk/ImhsdvBsloHbAlewb2IEBV/Og==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/mime": "^1",
        "@types/node": "*"
      }
    },
    "node_modules/@types/sockjs": {
      "version": "0.3.36",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/sockjs/-/sockjs-0.3.36.tgz",
      "integrity": "sha512-MK9V6NzAS1+Ud7JV9lJLFqW85VbC9dq3LmwZCuBe4wBDgKC0Kj/jd8Xl+nSviU+Qc3+m7umHHyHg//2KSa0a0Q==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/node": "*"
      }
    },
    "node_modules/@types/stack-utils": {
      "version": "2.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/stack-utils/-/stack-utils-2.0.3.tgz",
      "integrity": "sha512-9aEbYZ3TbYMznPdcdr3SmIrLXwC/AKZXQeCf9Pgao5CKb8CyHuEX5jzWPTkvregvhRJHcpRO6BFoGW9ycaOkYw==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/@types/tough-cookie": {
      "version": "4.0.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/tough-cookie/-/tough-cookie-4.0.5.tgz",
      "integrity": "sha512-/Ad8+nIOV7Rl++6f1BdKxFSMgmoqEoYbHRpPcx3JEfv8VRsQe9Z4mCXeJBzxs7mbHY/XOZZuXlRNfhpVPbs6ZA==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/@types/trusted-types": {
      "version": "2.0.7",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/trusted-types/-/trusted-types-2.0.7.tgz",
      "integrity": "sha512-ScaPdn1dQczgbl0QFTeTOmVHFULt394XJgOQNoyVhZ6r2vLnMLJfBPd53SB52T/3G36VI1/g2MZaX0cwDuXsfw==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/@types/ws": {
      "version": "8.18.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/ws/-/ws-8.18.1.tgz",
      "integrity": "sha512-ThVF6DCVhA8kUGy+aazFQ4kXQ7E1Ty7A3ypFOe0IcJV8O/M511G99AW24irKrW56Wt44yG9+ij8FaqoBGkuBXg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/node": "*"
      }
    },
    "node_modules/@types/yargs": {
      "version": "17.0.35",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/yargs/-/yargs-17.0.35.tgz",
      "integrity": "sha512-qUHkeCyQFxMXg79wQfTtfndEC+N9ZZg76HJftDJp+qH2tV7Gj4OJi7l+PiWwJ+pWtW8GwSmqsDj/oymhrTWXjg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/yargs-parser": "*"
      }
    },
    "node_modules/@types/yargs-parser": {
      "version": "21.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@types/yargs-parser/-/yargs-parser-21.0.3.tgz",
      "integrity": "sha512-I4q9QU9MQv4oEOz4tAHJtNz1cwuLxn2F3xcc2iV5WdqLPpUnj30aUuxt1mAxYTG+oe8CZMV/+6rU4S4gRDzqtQ==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/@upsetjs/venn.js": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@upsetjs/venn.js/-/venn.js-2.0.0.tgz",
      "integrity": "sha512-WbBhLrooyePuQ1VZxrJjtLvTc4NVfpOyKx0sKqioq9bX1C1m7Jgykkn8gLrtwumBioXIqam8DLxp88Adbue6Hw==",
      "license": "MIT",
      "optional": true,
      "optionalDependencies": {
        "d3-selection": "^3.0.0",
        "d3-transition": "^3.0.1"
      }
    },
    "node_modules/@vitejs/plugin-basic-ssl": {
      "version": "1.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@vitejs/plugin-basic-ssl/-/plugin-basic-ssl-1.2.0.tgz",
      "integrity": "sha512-mkQnxTkcldAzIsomk1UuLfAu9n+kpQ3JbHcpCp7d2Oo6ITtji8pHS3QToOWjhPFvNQSnhlkAjmGbhv2QvwO/7Q==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=14.21.3"
      },
      "peerDependencies": {
        "vite": "^3.0.0 || ^4.0.0 || ^5.0.0 || ^6.0.0"
      }
    },
    "node_modules/@webassemblyjs/ast": {
      "version": "1.14.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@webassemblyjs/ast/-/ast-1.14.1.tgz",
      "integrity": "sha512-nuBEDgQfm1ccRp/8bCQrx1frohyufl4JlbMMZ4P1wpeOfDhF6FQkxZJ1b/e+PLwr6X1Nhw6OLme5usuBWYBvuQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@webassemblyjs/helper-numbers": "1.13.2",
        "@webassemblyjs/helper-wasm-bytecode": "1.13.2"
      }
    },
    "node_modules/@webassemblyjs/floating-point-hex-parser": {
      "version": "1.13.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@webassemblyjs/floating-point-hex-parser/-/floating-point-hex-parser-1.13.2.tgz",
      "integrity": "sha512-6oXyTOzbKxGH4steLbLNOu71Oj+C8Lg34n6CqRvqfS2O71BxY6ByfMDRhBytzknj9yGUPVJ1qIKhRlAwO1AovA==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/@webassemblyjs/helper-api-error": {
      "version": "1.13.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@webassemblyjs/helper-api-error/-/helper-api-error-1.13.2.tgz",
      "integrity": "sha512-U56GMYxy4ZQCbDZd6JuvvNV/WFildOjsaWD3Tzzvmw/mas3cXzRJPMjP83JqEsgSbyrmaGjBfDtV7KDXV9UzFQ==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/@webassemblyjs/helper-buffer": {
      "version": "1.14.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@webassemblyjs/helper-buffer/-/helper-buffer-1.14.1.tgz",
      "integrity": "sha512-jyH7wtcHiKssDtFPRB+iQdxlDf96m0E39yb0k5uJVhFGleZFoNw1c4aeIcVUPPbXUVJ94wwnMOAqUHyzoEPVMA==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/@webassemblyjs/helper-numbers": {
      "version": "1.13.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@webassemblyjs/helper-numbers/-/helper-numbers-1.13.2.tgz",
      "integrity": "sha512-FE8aCmS5Q6eQYcV3gI35O4J789wlQA+7JrqTTpJqn5emA4U2hvwJmvFRC0HODS+3Ye6WioDklgd6scJ3+PLnEA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@webassemblyjs/floating-point-hex-parser": "1.13.2",
        "@webassemblyjs/helper-api-error": "1.13.2",
        "@xtuc/long": "4.2.2"
      }
    },
    "node_modules/@webassemblyjs/helper-wasm-bytecode": {
      "version": "1.13.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@webassemblyjs/helper-wasm-bytecode/-/helper-wasm-bytecode-1.13.2.tgz",
      "integrity": "sha512-3QbLKy93F0EAIXLh0ogEVR6rOubA9AoZ+WRYhNbFyuB70j3dRdwH9g+qXhLAO0kiYGlg3TxDV+I4rQTr/YNXkA==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/@webassemblyjs/helper-wasm-section": {
      "version": "1.14.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@webassemblyjs/helper-wasm-section/-/helper-wasm-section-1.14.1.tgz",
      "integrity": "sha512-ds5mXEqTJ6oxRoqjhWDU83OgzAYjwsCV8Lo/N+oRsNDmx/ZDpqalmrtgOMkHwxsG0iI//3BwWAErYRHtgn0dZw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@webassemblyjs/ast": "1.14.1",
        "@webassemblyjs/helper-buffer": "1.14.1",
        "@webassemblyjs/helper-wasm-bytecode": "1.13.2",
        "@webassemblyjs/wasm-gen": "1.14.1"
      }
    },
    "node_modules/@webassemblyjs/ieee754": {
      "version": "1.13.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@webassemblyjs/ieee754/-/ieee754-1.13.2.tgz",
      "integrity": "sha512-4LtOzh58S/5lX4ITKxnAK2USuNEvpdVV9AlgGQb8rJDHaLeHciwG4zlGr0j/SNWlr7x3vO1lDEsuePvtcDNCkw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@xtuc/ieee754": "^1.2.0"
      }
    },
    "node_modules/@webassemblyjs/leb128": {
      "version": "1.13.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@webassemblyjs/leb128/-/leb128-1.13.2.tgz",
      "integrity": "sha512-Lde1oNoIdzVzdkNEAWZ1dZ5orIbff80YPdHx20mrHwHrVNNTjNr8E3xz9BdpcGqRQbAEa+fkrCb+fRFTl/6sQw==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "@xtuc/long": "4.2.2"
      }
    },
    "node_modules/@webassemblyjs/utf8": {
      "version": "1.13.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@webassemblyjs/utf8/-/utf8-1.13.2.tgz",
      "integrity": "sha512-3NQWGjKTASY1xV5m7Hr0iPeXD9+RDobLll3T9d2AO+g3my8xy5peVyjSag4I50mR1bBSN/Ct12lo+R9tJk0NZQ==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/@webassemblyjs/wasm-edit": {
      "version": "1.14.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@webassemblyjs/wasm-edit/-/wasm-edit-1.14.1.tgz",
      "integrity": "sha512-RNJUIQH/J8iA/1NzlE4N7KtyZNHi3w7at7hDjvRNm5rcUXa00z1vRz3glZoULfJ5mpvYhLybmVcwcjGrC1pRrQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@webassemblyjs/ast": "1.14.1",
        "@webassemblyjs/helper-buffer": "1.14.1",
        "@webassemblyjs/helper-wasm-bytecode": "1.13.2",
        "@webassemblyjs/helper-wasm-section": "1.14.1",
        "@webassemblyjs/wasm-gen": "1.14.1",
        "@webassemblyjs/wasm-opt": "1.14.1",
        "@webassemblyjs/wasm-parser": "1.14.1",
        "@webassemblyjs/wast-printer": "1.14.1"
      }
    },
    "node_modules/@webassemblyjs/wasm-gen": {
      "version": "1.14.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@webassemblyjs/wasm-gen/-/wasm-gen-1.14.1.tgz",
      "integrity": "sha512-AmomSIjP8ZbfGQhumkNvgC33AY7qtMCXnN6bL2u2Js4gVCg8fp735aEiMSBbDR7UQIj90n4wKAFUSEd0QN2Ukg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@webassemblyjs/ast": "1.14.1",
        "@webassemblyjs/helper-wasm-bytecode": "1.13.2",
        "@webassemblyjs/ieee754": "1.13.2",
        "@webassemblyjs/leb128": "1.13.2",
        "@webassemblyjs/utf8": "1.13.2"
      }
    },
    "node_modules/@webassemblyjs/wasm-opt": {
      "version": "1.14.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@webassemblyjs/wasm-opt/-/wasm-opt-1.14.1.tgz",
      "integrity": "sha512-PTcKLUNvBqnY2U6E5bdOQcSM+oVP/PmrDY9NzowJjislEjwP/C4an2303MCVS2Mg9d3AJpIGdUFIQQWbPds0Sw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@webassemblyjs/ast": "1.14.1",
        "@webassemblyjs/helper-buffer": "1.14.1",
        "@webassemblyjs/wasm-gen": "1.14.1",
        "@webassemblyjs/wasm-parser": "1.14.1"
      }
    },
    "node_modules/@webassemblyjs/wasm-parser": {
      "version": "1.14.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@webassemblyjs/wasm-parser/-/wasm-parser-1.14.1.tgz",
      "integrity": "sha512-JLBl+KZ0R5qB7mCnud/yyX08jWFw5MsoalJ1pQ4EdFlgj9VdXKGuENGsiCIjegI1W7p91rUlcB/LB5yRJKNTcQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@webassemblyjs/ast": "1.14.1",
        "@webassemblyjs/helper-api-error": "1.13.2",
        "@webassemblyjs/helper-wasm-bytecode": "1.13.2",
        "@webassemblyjs/ieee754": "1.13.2",
        "@webassemblyjs/leb128": "1.13.2",
        "@webassemblyjs/utf8": "1.13.2"
      }
    },
    "node_modules/@webassemblyjs/wast-printer": {
      "version": "1.14.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@webassemblyjs/wast-printer/-/wast-printer-1.14.1.tgz",
      "integrity": "sha512-kPSSXE6De1XOR820C90RIo2ogvZG+c3KiHzqUoO/F34Y2shGzesfqv7o57xrxovZJH/MetF5UjroJ/R/3isoiw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@webassemblyjs/ast": "1.14.1",
        "@xtuc/long": "4.2.2"
      }
    },
    "node_modules/@xtuc/ieee754": {
      "version": "1.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@xtuc/ieee754/-/ieee754-1.2.0.tgz",
      "integrity": "sha512-DX8nKgqcGwsc0eJSqYt5lwP4DH5FlHnmuWWBRy7X0NcaGR0ZtuyeESgMwTYVEtxmsNGY+qit4QYT/MIYTOTPeA==",
      "dev": true,
      "license": "BSD-3-Clause"
    },
    "node_modules/@xtuc/long": {
      "version": "4.2.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@xtuc/long/-/long-4.2.2.tgz",
      "integrity": "sha512-NuHqBY1PB/D8xU6s/thBgOAiAP7HOYDQ32+BFZILJ8ivkUkAHQnWfn6WhL79Owj1qmUnoN/YPhktdIoucipkAQ==",
      "dev": true,
      "license": "Apache-2.0"
    },
    "node_modules/@yarnpkg/lockfile": {
      "version": "1.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/@yarnpkg/lockfile/-/lockfile-1.1.0.tgz",
      "integrity": "sha512-GpSwvyXOcOOlV70vbnzjj4fW5xW/FdUF6nQEt1ENy7m4ZCczi1+/buVUPAqmGfqznsORNFzUMjctTIp8a9tuCQ==",
      "dev": true,
      "license": "BSD-2-Clause"
    },
    "node_modules/abab": {
      "version": "2.0.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/abab/-/abab-2.0.6.tgz",
      "integrity": "sha512-j2afSsaIENvHZN2B8GOpF566vZ5WVk5opAiMTvWgaQT8DkbOqsTfvNAvHoRGU2zzP8cPoqys+xHTRDWW8L+/BA==",
      "deprecated": "Use your platform's native atob() and btoa() methods instead",
      "dev": true,
      "license": "BSD-3-Clause"
    },
    "node_modules/abbrev": {
      "version": "3.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/abbrev/-/abbrev-3.0.1.tgz",
      "integrity": "sha512-AO2ac6pjRB3SJmGJo+v5/aK6Omggp6fsLrs6wN9bd35ulu4cCwaAU9+7ZhXjeqHVkaHThLuzH0nZr0YpCDhygg==",
      "dev": true,
      "license": "ISC",
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/accepts": {
      "version": "1.3.8",
      "resolved": "http://binario.caixa:8081/repository/npm-all/accepts/-/accepts-1.3.8.tgz",
      "integrity": "sha512-PYAthTa2m2VKxuvSD3DPC/Gy+U+sOA1LAuT8mkmRuvw+NACSaeXEQ+NHcVF7rONl6qcaxV3Uuemwawk+7+SJLw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "mime-types": "~2.1.34",
        "negotiator": "0.6.3"
      },
      "engines": {
        "node": ">= 0.6"
      }
    },
    "node_modules/accepts/node_modules/negotiator": {
      "version": "0.6.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/negotiator/-/negotiator-0.6.3.tgz",
      "integrity": "sha512-+EUsqGPLsM+j/zdChZjsnX51g4XrHFOIXwfnCVPGlQk/k5giakcKsuxCObBRu6DSm9opw/O6slWbJdghQM4bBg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.6"
      }
    },
    "node_modules/acorn": {
      "version": "8.16.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/acorn/-/acorn-8.16.0.tgz",
      "integrity": "sha512-UVJyE9MttOsBQIDKw1skb9nAwQuR5wuGD3+82K6JgJlm/Y+KI92oNsMNGZCYdDsVtRHSak0pcV5Dno5+4jh9sw==",
      "devOptional": true,
      "license": "MIT",
      "bin": {
        "acorn": "bin/acorn"
      },
      "engines": {
        "node": ">=0.4.0"
      }
    },
    "node_modules/acorn-globals": {
      "version": "7.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/acorn-globals/-/acorn-globals-7.0.1.tgz",
      "integrity": "sha512-umOSDSDrfHbTNPuNpC2NSnnA3LUrqpevPb4T9jRx4MagXNS0rs+gwiTcAvqCRmsD6utzsrzNt+ebm00SNWiC3Q==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "acorn": "^8.1.0",
        "acorn-walk": "^8.0.2"
      }
    },
    "node_modules/acorn-import-phases": {
      "version": "1.0.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/acorn-import-phases/-/acorn-import-phases-1.0.4.tgz",
      "integrity": "sha512-wKmbr/DDiIXzEOiWrTTUcDm24kQ2vGfZQvM2fwg2vXqR5uW6aapr7ObPtj1th32b9u90/Pf4AItvdTh42fBmVQ==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=10.13.0"
      },
      "peerDependencies": {
        "acorn": "^8.14.0"
      }
    },
    "node_modules/acorn-walk": {
      "version": "8.3.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/acorn-walk/-/acorn-walk-8.3.5.tgz",
      "integrity": "sha512-HEHNfbars9v4pgpW6SO1KSPkfoS0xVOM/9UzkJltjlsHZmJasxg8aXkuZa7SMf8vKGIBhpUsPluQSqhJFCqebw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "acorn": "^8.11.0"
      },
      "engines": {
        "node": ">=0.4.0"
      }
    },
    "node_modules/adjust-sourcemap-loader": {
      "version": "4.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/adjust-sourcemap-loader/-/adjust-sourcemap-loader-4.0.0.tgz",
      "integrity": "sha512-OXwN5b9pCUXNQHJpwwD2qP40byEmSgzj8B4ydSN0uMNYWiFmJ6x6KwUllMmfk8Rwu/HJDFR7U8ubsWBoN0Xp0A==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "loader-utils": "^2.0.0",
        "regex-parser": "^2.2.11"
      },
      "engines": {
        "node": ">=8.9"
      }
    },
    "node_modules/adjust-sourcemap-loader/node_modules/loader-utils": {
      "version": "2.0.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/loader-utils/-/loader-utils-2.0.4.tgz",
      "integrity": "sha512-xXqpXoINfFhgua9xiqD8fPFHgkoq1mmmpE92WlDbm9rNRd/EbRb+Gqf908T2DMfuHjjJlksiK2RbHVOdD/MqSw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "big.js": "^5.2.2",
        "emojis-list": "^3.0.0",
        "json5": "^2.1.2"
      },
      "engines": {
        "node": ">=8.9.0"
      }
    },
    "node_modules/agent-base": {
      "version": "7.1.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/agent-base/-/agent-base-7.1.4.tgz",
      "integrity": "sha512-MnA+YT8fwfJPgBx3m60MNqakm30XOkyIoH1y6huTQvC0PwZG7ki8NacLBcrPbNoo8vEZy7Jpuk7+jMO+CUovTQ==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 14"
      }
    },
    "node_modules/ajv": {
      "version": "8.18.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ajv/-/ajv-8.18.0.tgz",
      "integrity": "sha512-PlXPeEWMXMZ7sPYOHqmDyCJzcfNrUr3fGNKtezX14ykXOEIvyK81d+qydx89KY5O71FKMPaQ2vBfBFI5NHR63A==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "fast-deep-equal": "^3.1.3",
        "fast-uri": "^3.0.1",
        "json-schema-traverse": "^1.0.0",
        "require-from-string": "^2.0.2"
      },
      "funding": {
        "type": "github",
        "url": "https://github.com/sponsors/epoberezkin"
      }
    },
    "node_modules/ajv-formats": {
      "version": "3.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ajv-formats/-/ajv-formats-3.0.1.tgz",
      "integrity": "sha512-8iUql50EUR+uUcdRQ3HDqa6EVyo3docL8g5WJ3FNcWmu62IbkGUue/pEyLBW8VGKKucTPgqeks4fIU1DA4yowQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "ajv": "^8.0.0"
      },
      "peerDependencies": {
        "ajv": "^8.0.0"
      },
      "peerDependenciesMeta": {
        "ajv": {
          "optional": true
        }
      }
    },
    "node_modules/ajv-keywords": {
      "version": "5.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ajv-keywords/-/ajv-keywords-5.1.0.tgz",
      "integrity": "sha512-YCS/JNFAUyr5vAuhk1DWm1CBxRHW9LbJ2ozWeemrIqpbsqKjHVxYPyi5GC0rjZIT5JxJ3virVTS8wk4i/Z+krw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "fast-deep-equal": "^3.1.3"
      },
      "peerDependencies": {
        "ajv": "^8.8.2"
      }
    },
    "node_modules/ansi-colors": {
      "version": "4.1.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ansi-colors/-/ansi-colors-4.1.3.tgz",
      "integrity": "sha512-/6w/C21Pm1A7aZitlI5Ni/2J6FFQN8i1Cvz3kHABAAbw93v/NlvKdVOqz7CCWz/3iv/JplRSEEZ83XION15ovw==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=6"
      }
    },
    "node_modules/ansi-escapes": {
      "version": "4.3.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ansi-escapes/-/ansi-escapes-4.3.2.tgz",
      "integrity": "sha512-gKXj5ALrKWQLsYG9jlTRmR/xKluxHV+Z9QEwNIgCfM1/uwPMCuzVVnh5mwTd+OuBZcwSIMbqssNWRm1lE51QaQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "type-fest": "^0.21.3"
      },
      "engines": {
        "node": ">=8"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/ansi-html-community": {
      "version": "0.0.8",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ansi-html-community/-/ansi-html-community-0.0.8.tgz",
      "integrity": "sha512-1APHAyr3+PCamwNw3bXCPp4HFLONZt/yIH0sZp0/469KWNTEy+qN5jQ3GVX6DMZ1UXAi34yVwtTeaG/HpBuuzw==",
      "dev": true,
      "engines": [
        "node >= 0.8.0"
      ],
      "license": "Apache-2.0",
      "bin": {
        "ansi-html": "bin/ansi-html"
      }
    },
    "node_modules/ansi-regex": {
      "version": "5.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ansi-regex/-/ansi-regex-5.0.1.tgz",
      "integrity": "sha512-quJQXlTSUGL2LH9SUXo8VwsY4soanhgo6LNSm84E1LBcE8s3O0wpdiRzyR9z/ZZJMlMWv37qOOb9pdJlMUEKFQ==",
      "license": "MIT",
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/ansi-styles": {
      "version": "4.3.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ansi-styles/-/ansi-styles-4.3.0.tgz",
      "integrity": "sha512-zbB9rCJAT1rbjiVDb2hqKFHNYLxgtk8NURxZ3IZwD3F6NtxbXZQCnnSi1Lkx+IDohdPlFp222wVALIheZJQSEg==",
      "license": "MIT",
      "dependencies": {
        "color-convert": "^2.0.1"
      },
      "engines": {
        "node": ">=8"
      },
      "funding": {
        "url": "https://github.com/chalk/ansi-styles?sponsor=1"
      }
    },
    "node_modules/anymatch": {
      "version": "3.1.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/anymatch/-/anymatch-3.1.3.tgz",
      "integrity": "sha512-KMReFUr0B4t+D+OBkjR3KYqvocp2XaSzO55UcB6mgQMd3KbcE+mWTyvVV7D/zsdEbNnV6acZUutkiHQXvTr1Rw==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "normalize-path": "^3.0.0",
        "picomatch": "^2.0.4"
      },
      "engines": {
        "node": ">= 8"
      }
    },
    "node_modules/anymatch/node_modules/picomatch": {
      "version": "2.3.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/picomatch/-/picomatch-2.3.2.tgz",
      "integrity": "sha512-V7+vQEJ06Z+c5tSye8S+nHUfI51xoXIXjHQ99cQtKUkQqqO1kO/KCJUfZXuB47h/YBlDhah2H3hdUGXn8ie0oA==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8.6"
      },
      "funding": {
        "url": "https://github.com/sponsors/jonschlinkert"
      }
    },
    "node_modules/argparse": {
      "version": "1.0.10",
      "resolved": "http://binario.caixa:8081/repository/npm-all/argparse/-/argparse-1.0.10.tgz",
      "integrity": "sha512-o5Roy6tNG4SL/FOkCAN6RzjiakZS25RLYFrcMttJqbdd8BWrnA+fGz57iN5Pb06pvBGvl5gQ0B48dJlslXvoTg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "sprintf-js": "~1.0.2"
      }
    },
    "node_modules/array-flatten": {
      "version": "1.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/array-flatten/-/array-flatten-1.1.1.tgz",
      "integrity": "sha512-PCVAQswWemu6UdxsDFFX/+gVeYqKAod3D3UVm91jHwynguOwAvYPhx8nNlM++NqRcK6CxxpUafjmhIdKiHibqg==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/asynckit": {
      "version": "0.4.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/asynckit/-/asynckit-0.4.0.tgz",
      "integrity": "sha512-Oei9OH4tRh0YqU3GxhX79dM/mwVgvbZJaSNaRk+bshkj0S5cfHcgYakreBjrHwatXKbz+IoIdYLxrKim2MjW0Q==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/autoprefixer": {
      "version": "10.4.20",
      "resolved": "http://binario.caixa:8081/repository/npm-all/autoprefixer/-/autoprefixer-10.4.20.tgz",
      "integrity": "sha512-XY25y5xSv/wEoqzDyXXME4AFfkZI0P23z6Fs3YgymDnKJkCGOnkL0iTxCa85UTqaSgfcqyf3UA6+c7wUvx/16g==",
      "dev": true,
      "funding": [
        {
          "type": "opencollective",
          "url": "https://opencollective.com/postcss/"
        },
        {
          "type": "tidelift",
          "url": "https://tidelift.com/funding/github/npm/autoprefixer"
        },
        {
          "type": "github",
          "url": "https://github.com/sponsors/ai"
        }
      ],
      "license": "MIT",
      "dependencies": {
        "browserslist": "^4.23.3",
        "caniuse-lite": "^1.0.30001646",
        "fraction.js": "^4.3.7",
        "normalize-range": "^0.1.2",
        "picocolors": "^1.0.1",
        "postcss-value-parser": "^4.2.0"
      },
      "bin": {
        "autoprefixer": "bin/autoprefixer"
      },
      "engines": {
        "node": "^10 || ^12 || >=14"
      },
      "peerDependencies": {
        "postcss": "^8.1.0"
      }
    },
    "node_modules/babel-jest": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/babel-jest/-/babel-jest-29.7.0.tgz",
      "integrity": "sha512-BrvGY3xZSwEcCzKvKsCi2GgHqDqsYkOP4/by5xCgIwGXQxIEh+8ew3gmrE1y7XRR6LHZIj6yLYnUi/mm2KXKBg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@jest/transform": "^29.7.0",
        "@types/babel__core": "^7.1.14",
        "babel-plugin-istanbul": "^6.1.1",
        "babel-preset-jest": "^29.6.3",
        "chalk": "^4.0.0",
        "graceful-fs": "^4.2.9",
        "slash": "^3.0.0"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.8.0"
      }
    },
    "node_modules/babel-jest/node_modules/slash": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/slash/-/slash-3.0.0.tgz",
      "integrity": "sha512-g9Q1haeby36OSStwb4ntCGGGaKsaVSjQ68fBxoQcutl5fS1vuY18H3wSt3jFyFtrkx+Kz0V1G85A4MyAdDMi2Q==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/babel-loader": {
      "version": "9.2.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/babel-loader/-/babel-loader-9.2.1.tgz",
      "integrity": "sha512-fqe8naHt46e0yIdkjUZYqddSXfej3AHajX+CSO5X7oy0EmPc6o5Xh+RClNoHjnieWz9AW4kZxW9yyFMhVB1QLA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "find-cache-dir": "^4.0.0",
        "schema-utils": "^4.0.0"
      },
      "engines": {
        "node": ">= 14.15.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.12.0",
        "webpack": ">=5"
      }
    },
    "node_modules/babel-plugin-istanbul": {
      "version": "6.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/babel-plugin-istanbul/-/babel-plugin-istanbul-6.1.1.tgz",
      "integrity": "sha512-Y1IQok9821cC9onCx5otgFfRm7Lm+I+wwxOx738M/WLPZ9Q42m4IG5W0FNX8WLL2gYMZo3JkuXIH2DOpWM+qwA==",
      "dev": true,
      "license": "BSD-3-Clause",
      "dependencies": {
        "@babel/helper-plugin-utils": "^7.0.0",
        "@istanbuljs/load-nyc-config": "^1.0.0",
        "@istanbuljs/schema": "^0.1.2",
        "istanbul-lib-instrument": "^5.0.4",
        "test-exclude": "^6.0.0"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/babel-plugin-istanbul/node_modules/istanbul-lib-instrument": {
      "version": "5.2.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/istanbul-lib-instrument/-/istanbul-lib-instrument-5.2.1.tgz",
      "integrity": "sha512-pzqtp31nLv/XFOzXGuvhCb8qhjmTVo5vjVk19XE4CRlSWz0KoeJ3bw9XsA7nOp9YBf4qHjwBxkDzKcME/J29Yg==",
      "dev": true,
      "license": "BSD-3-Clause",
      "dependencies": {
        "@babel/core": "^7.12.3",
        "@babel/parser": "^7.14.7",
        "@istanbuljs/schema": "^0.1.2",
        "istanbul-lib-coverage": "^3.2.0",
        "semver": "^6.3.0"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/babel-plugin-istanbul/node_modules/semver": {
      "version": "6.3.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/semver/-/semver-6.3.1.tgz",
      "integrity": "sha512-BR7VvDCVHO+q2xBEWskxS6DJE1qRnb7DxzUrogb71CWoSficBxYsiAGd+Kl0mmq/MprG9yArRkyrQxTO6XjMzA==",
      "dev": true,
      "license": "ISC",
      "bin": {
        "semver": "bin/semver.js"
      }
    },
    "node_modules/babel-plugin-jest-hoist": {
      "version": "29.6.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/babel-plugin-jest-hoist/-/babel-plugin-jest-hoist-29.6.3.tgz",
      "integrity": "sha512-ESAc/RJvGTFEzRwOTT4+lNDk/GNHMkKbNzsvT0qKRfDyyYTskxB5rnU2njIDYVxXCBHHEI1c0YwHob3WaYujOg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/template": "^7.3.3",
        "@babel/types": "^7.3.3",
        "@types/babel__core": "^7.1.14",
        "@types/babel__traverse": "^7.0.6"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/babel-plugin-polyfill-corejs2": {
      "version": "0.4.17",
      "resolved": "http://binario.caixa:8081/repository/npm-all/babel-plugin-polyfill-corejs2/-/babel-plugin-polyfill-corejs2-0.4.17.tgz",
      "integrity": "sha512-aTyf30K/rqAsNwN76zYrdtx8obu0E4KoUME29B1xj+B3WxgvWkp943vYQ+z8Mv3lw9xHXMHpvSPOBxzAkIa94w==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/compat-data": "^7.28.6",
        "@babel/helper-define-polyfill-provider": "^0.6.8",
        "semver": "^6.3.1"
      },
      "peerDependencies": {
        "@babel/core": "^7.4.0 || ^8.0.0-0 <8.0.0"
      }
    },
    "node_modules/babel-plugin-polyfill-corejs2/node_modules/semver": {
      "version": "6.3.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/semver/-/semver-6.3.1.tgz",
      "integrity": "sha512-BR7VvDCVHO+q2xBEWskxS6DJE1qRnb7DxzUrogb71CWoSficBxYsiAGd+Kl0mmq/MprG9yArRkyrQxTO6XjMzA==",
      "dev": true,
      "license": "ISC",
      "bin": {
        "semver": "bin/semver.js"
      }
    },
    "node_modules/babel-plugin-polyfill-corejs3": {
      "version": "0.11.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/babel-plugin-polyfill-corejs3/-/babel-plugin-polyfill-corejs3-0.11.1.tgz",
      "integrity": "sha512-yGCqvBT4rwMczo28xkH/noxJ6MZ4nJfkVYdoDaC/utLtWrXxv27HVrzAeSbqR8SxDsp46n0YF47EbHoixy6rXQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-define-polyfill-provider": "^0.6.3",
        "core-js-compat": "^3.40.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.4.0 || ^8.0.0-0 <8.0.0"
      }
    },
    "node_modules/babel-plugin-polyfill-regenerator": {
      "version": "0.6.8",
      "resolved": "http://binario.caixa:8081/repository/npm-all/babel-plugin-polyfill-regenerator/-/babel-plugin-polyfill-regenerator-0.6.8.tgz",
      "integrity": "sha512-M762rNHfSF1EV3SLtnCJXFoQbbIIz0OyRwnCmV0KPC7qosSfCO0QLTSuJX3ayAebubhE6oYBAYPrBA5ljowaZg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/helper-define-polyfill-provider": "^0.6.8"
      },
      "peerDependencies": {
        "@babel/core": "^7.4.0 || ^8.0.0-0 <8.0.0"
      }
    },
    "node_modules/babel-preset-current-node-syntax": {
      "version": "1.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/babel-preset-current-node-syntax/-/babel-preset-current-node-syntax-1.2.0.tgz",
      "integrity": "sha512-E/VlAEzRrsLEb2+dv8yp3bo4scof3l9nR4lrld+Iy5NyVqgVYUJnDAmunkhPMisRI32Qc4iRiz425d8vM++2fg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/plugin-syntax-async-generators": "^7.8.4",
        "@babel/plugin-syntax-bigint": "^7.8.3",
        "@babel/plugin-syntax-class-properties": "^7.12.13",
        "@babel/plugin-syntax-class-static-block": "^7.14.5",
        "@babel/plugin-syntax-import-attributes": "^7.24.7",
        "@babel/plugin-syntax-import-meta": "^7.10.4",
        "@babel/plugin-syntax-json-strings": "^7.8.3",
        "@babel/plugin-syntax-logical-assignment-operators": "^7.10.4",
        "@babel/plugin-syntax-nullish-coalescing-operator": "^7.8.3",
        "@babel/plugin-syntax-numeric-separator": "^7.10.4",
        "@babel/plugin-syntax-object-rest-spread": "^7.8.3",
        "@babel/plugin-syntax-optional-catch-binding": "^7.8.3",
        "@babel/plugin-syntax-optional-chaining": "^7.8.3",
        "@babel/plugin-syntax-private-property-in-object": "^7.14.5",
        "@babel/plugin-syntax-top-level-await": "^7.14.5"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0 || ^8.0.0-0"
      }
    },
    "node_modules/babel-preset-jest": {
      "version": "29.6.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/babel-preset-jest/-/babel-preset-jest-29.6.3.tgz",
      "integrity": "sha512-0B3bhxR6snWXJZtR/RliHTDPRgn1sNHOR0yVtq/IiQFyuOVjFS+wuio/R4gSNkyYmKmJB4wGZv2NZanmKmTnNA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "babel-plugin-jest-hoist": "^29.6.3",
        "babel-preset-current-node-syntax": "^1.0.0"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      },
      "peerDependencies": {
        "@babel/core": "^7.0.0"
      }
    },
    "node_modules/balanced-match": {
      "version": "1.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/balanced-match/-/balanced-match-1.0.2.tgz",
      "integrity": "sha512-3oSeUO0TMV67hN1AmbXsK4yaqU7tjiHlbxRDZOpH0KW9+CeX4bRAaX0Anxt0tx2MrpRpWwQaPwIlISEJhYU5Pw==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/base64-js": {
      "version": "1.5.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/base64-js/-/base64-js-1.5.1.tgz",
      "integrity": "sha512-AKpaYlHn8t4SVbOHCy+b5+KKgvR4vrsD8vbvrbiQJps7fKDTkjkDry6ji0rUJjC0kzbNePLwzxq8iypo41qeWA==",
      "dev": true,
      "funding": [
        {
          "type": "github",
          "url": "https://github.com/sponsors/feross"
        },
        {
          "type": "patreon",
          "url": "https://www.patreon.com/feross"
        },
        {
          "type": "consulting",
          "url": "https://feross.org/support"
        }
      ],
      "license": "MIT"
    },
    "node_modules/baseline-browser-mapping": {
      "version": "2.10.11",
      "resolved": "http://binario.caixa:8081/repository/npm-all/baseline-browser-mapping/-/baseline-browser-mapping-2.10.11.tgz",
      "integrity": "sha512-DAKrHphkJyiGuau/cFieRYhcTFeK/lBuD++C7cZ6KZHbMhBrisoi+EvhQ5RZrIfV5qwsW8kgQ07JIC+MDJRAhg==",
      "license": "Apache-2.0",
      "bin": {
        "baseline-browser-mapping": "dist/cli.cjs"
      },
      "engines": {
        "node": ">=6.0.0"
      }
    },
    "node_modules/batch": {
      "version": "0.6.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/batch/-/batch-0.6.1.tgz",
      "integrity": "sha512-x+VAiMRL6UPkx+kudNvxTl6hB2XNNCG2r+7wixVfIYwu/2HKRXimwQyaumLjMveWvT2Hkd/cAJw+QBMfJ/EKVw==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/beasties": {
      "version": "0.3.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/beasties/-/beasties-0.3.2.tgz",
      "integrity": "sha512-p4AF8uYzm9Fwu8m/hSVTCPXrRBPmB34hQpHsec2KOaR9CZmgoU8IOv4Cvwq4hgz2p4hLMNbsdNl5XeA6XbAQwA==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "css-select": "^5.1.0",
        "css-what": "^6.1.0",
        "dom-serializer": "^2.0.0",
        "domhandler": "^5.0.3",
        "htmlparser2": "^10.0.0",
        "picocolors": "^1.1.1",
        "postcss": "^8.4.49",
        "postcss-media-query-parser": "^0.2.3"
      },
      "engines": {
        "node": ">=14.0.0"
      }
    },
    "node_modules/big.js": {
      "version": "5.2.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/big.js/-/big.js-5.2.2.tgz",
      "integrity": "sha512-vyL2OymJxmarO8gxMr0mhChsO9QGwhynfuu4+MHTAW6czfq9humCB7rKpUjDd9YUiDPU4mzpyupFSvOClAwbmQ==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": "*"
      }
    },
    "node_modules/binary-extensions": {
      "version": "2.3.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/binary-extensions/-/binary-extensions-2.3.0.tgz",
      "integrity": "sha512-Ceh+7ox5qe7LJuLHoY0feh3pHuUDHAcRUeyL2VYghZwfpkNIy/+8Ocg0a3UuSoYzavmylwuLWQOf3hl0jjMMIw==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/bl": {
      "version": "4.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/bl/-/bl-4.1.0.tgz",
      "integrity": "sha512-1W07cM9gS6DcLperZfFSj+bWLtaPGSOHWhPiGzXmvVJbRLdG82sH/Kn8EtW1VqWVA54AKf2h5k5BbnIbwF3h6w==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "buffer": "^5.5.0",
        "inherits": "^2.0.4",
        "readable-stream": "^3.4.0"
      }
    },
    "node_modules/body-parser": {
      "version": "1.20.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/body-parser/-/body-parser-1.20.4.tgz",
      "integrity": "sha512-ZTgYYLMOXY9qKU/57FAo8F+HA2dGX7bqGc71txDRC1rS4frdFI5R7NhluHxH6M0YItAP0sHB4uqAOcYKxO6uGA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "bytes": "~3.1.2",
        "content-type": "~1.0.5",
        "debug": "2.6.9",
        "depd": "2.0.0",
        "destroy": "~1.2.0",
        "http-errors": "~2.0.1",
        "iconv-lite": "~0.4.24",
        "on-finished": "~2.4.1",
        "qs": "~6.14.0",
        "raw-body": "~2.5.3",
        "type-is": "~1.6.18",
        "unpipe": "~1.0.0"
      },
      "engines": {
        "node": ">= 0.8",
        "npm": "1.2.8000 || >= 1.4.16"
      }
    },
    "node_modules/body-parser/node_modules/debug": {
      "version": "2.6.9",
      "resolved": "http://binario.caixa:8081/repository/npm-all/debug/-/debug-2.6.9.tgz",
      "integrity": "sha512-bC7ElrdJaJnPbAP+1EotYvqZsb3ecl5wi6Bfi6BJTUcNowp6cvspg0jXznRTKDjm/E7AdgFBVeAPVMNcKGsHMA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "ms": "2.0.0"
      }
    },
    "node_modules/body-parser/node_modules/iconv-lite": {
      "version": "0.4.24",
      "resolved": "http://binario.caixa:8081/repository/npm-all/iconv-lite/-/iconv-lite-0.4.24.tgz",
      "integrity": "sha512-v3MXnZAcvnywkTUEZomIActle7RXXeedOR31wwl7VlyoXO4Qi9arvSenNQWne1TcRwhCL1HwLI21bEqdpj8/rA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "safer-buffer": ">= 2.1.2 < 3"
      },
      "engines": {
        "node": ">=0.10.0"
      }
    },
    "node_modules/body-parser/node_modules/ms": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ms/-/ms-2.0.0.tgz",
      "integrity": "sha512-Tpp60P6IUJDTuOq/5Z8cdskzJujfwqfOTkrwIwj7IRISpnkJnT6SyJ4PCPnGMoFjC9ddhal5KVIYtAt97ix05A==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/bonjour-service": {
      "version": "1.3.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/bonjour-service/-/bonjour-service-1.3.0.tgz",
      "integrity": "sha512-3YuAUiSkWykd+2Azjgyxei8OWf8thdn8AITIog2M4UICzoqfjlqr64WIjEXZllf/W6vK1goqleSR6brGomxQqA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "fast-deep-equal": "^3.1.3",
        "multicast-dns": "^7.2.5"
      }
    },
    "node_modules/boolbase": {
      "version": "1.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/boolbase/-/boolbase-1.0.0.tgz",
      "integrity": "sha512-JZOSA7Mo9sNGB8+UjSgzdLtokWAky1zbztM3WRLCbZ70/3cTANmQmOdR7y2g+J0e2WXywy1yS468tY+IruqEww==",
      "dev": true,
      "license": "ISC"
    },
    "node_modules/bootstrap": {
      "version": "5.3.8",
      "resolved": "http://binario.caixa:8081/repository/npm-all/bootstrap/-/bootstrap-5.3.8.tgz",
      "integrity": "sha512-HP1SZDqaLDPwsNiqRqi5NcP0SSXciX2s9E+RyqJIIqGo+vJeN5AJVM98CXmW/Wux0nQ5L7jeWUdplCEf0Ee+tg==",
      "funding": [
        {
          "type": "github",
          "url": "https://github.com/sponsors/twbs"
        },
        {
          "type": "opencollective",
          "url": "https://opencollective.com/bootstrap"
        }
      ],
      "license": "MIT",
      "peerDependencies": {
        "@popperjs/core": "^2.11.8"
      }
    },
    "node_modules/brace-expansion": {
      "version": "1.1.13",
      "resolved": "http://binario.caixa:8081/repository/npm-all/brace-expansion/-/brace-expansion-1.1.13.tgz",
      "integrity": "sha512-9ZLprWS6EENmhEOpjCYW2c8VkmOvckIJZfkr7rBW6dObmfgJ/L1GpSYW5Hpo9lDz4D1+n0Ckz8rU7FwHDQiG/w==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "balanced-match": "^1.0.0",
        "concat-map": "0.0.1"
      }
    },
    "node_modules/braces": {
      "version": "3.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/braces/-/braces-3.0.3.tgz",
      "integrity": "sha512-yQbXgO/OSZVD2IsiLlro+7Hf6Q18EJrKSEsdoMzKePKXct3gvD8oLcOQdIzGupr5Fj+EDe8gO/lxc1BzfMpxvA==",
      "license": "MIT",
      "dependencies": {
        "fill-range": "^7.1.1"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/browserslist": {
      "version": "4.28.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/browserslist/-/browserslist-4.28.1.tgz",
      "integrity": "sha512-ZC5Bd0LgJXgwGqUknZY/vkUQ04r8NXnJZ3yYi4vDmSiZmC/pdSN0NbNRPxZpbtO4uAfDUAFffO8IZoM3Gj8IkA==",
      "funding": [
        {
          "type": "opencollective",
          "url": "https://opencollective.com/browserslist"
        },
        {
          "type": "tidelift",
          "url": "https://tidelift.com/funding/github/npm/browserslist"
        },
        {
          "type": "github",
          "url": "https://github.com/sponsors/ai"
        }
      ],
      "license": "MIT",
      "dependencies": {
        "baseline-browser-mapping": "^2.9.0",
        "caniuse-lite": "^1.0.30001759",
        "electron-to-chromium": "^1.5.263",
        "node-releases": "^2.0.27",
        "update-browserslist-db": "^1.2.0"
      },
      "bin": {
        "browserslist": "cli.js"
      },
      "engines": {
        "node": "^6 || ^7 || ^8 || ^9 || ^10 || ^11 || ^12 || >=13.7"
      }
    },
    "node_modules/bs-logger": {
      "version": "0.2.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/bs-logger/-/bs-logger-0.2.6.tgz",
      "integrity": "sha512-pd8DCoxmbgc7hyPKOvxtqNcjYoOsABPQdcCUjGp3d42VR2CX1ORhk2A87oqqu5R1kk+76nsxZupkmyd+MVtCog==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "fast-json-stable-stringify": "2.x"
      },
      "engines": {
        "node": ">= 6"
      }
    },
    "node_modules/bser": {
      "version": "2.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/bser/-/bser-2.1.1.tgz",
      "integrity": "sha512-gQxTNE/GAfIIrmHLUE3oJyp5FO6HRBfhjnw4/wMmA63ZGDJnWBmgY/lyQBpnDUkGmAhbSe39tx2d/iTOAfglwQ==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "node-int64": "^0.4.0"
      }
    },
    "node_modules/buffer": {
      "version": "5.7.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/buffer/-/buffer-5.7.1.tgz",
      "integrity": "sha512-EHcyIPBQ4BSGlvjB16k5KgAJ27CIsHY/2JBmCRReo48y9rQ3MaUzWX3KVlBa4U7MyX02HdVj0K7C3WaB3ju7FQ==",
      "dev": true,
      "funding": [
        {
          "type": "github",
          "url": "https://github.com/sponsors/feross"
        },
        {
          "type": "patreon",
          "url": "https://www.patreon.com/feross"
        },
        {
          "type": "consulting",
          "url": "https://feross.org/support"
        }
      ],
      "license": "MIT",
      "dependencies": {
        "base64-js": "^1.3.1",
        "ieee754": "^1.1.13"
      }
    },
    "node_modules/buffer-from": {
      "version": "1.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/buffer-from/-/buffer-from-1.1.2.tgz",
      "integrity": "sha512-E+XQCRwSbaaiChtv6k6Dwgc+bx+Bs6vuKJHHl5kox/BaKbhiXzqQOwK4cO22yElGp2OCmjwVhT3HmxgyPGnJfQ==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/bundle-name": {
      "version": "4.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/bundle-name/-/bundle-name-4.1.0.tgz",
      "integrity": "sha512-tjwM5exMg6BGRI+kNmTntNsvdZS1X8BFYS6tnJ2hdH0kVxM6/eVZ2xy+FqStSWvYmtfFMDLIxurorHwDKfDz5Q==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "run-applescript": "^7.0.0"
      },
      "engines": {
        "node": ">=18"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/bytes": {
      "version": "3.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/bytes/-/bytes-3.1.2.tgz",
      "integrity": "sha512-/Nf7TyzTx6S3yRJObOAV7956r8cr2+Oj8AC5dt8wSP3BQAoeX58NoHyCU8P8zGkNXStjTSi6fzO6F0pBdcYbEg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.8"
      }
    },
    "node_modules/cacache": {
      "version": "19.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/cacache/-/cacache-19.0.1.tgz",
      "integrity": "sha512-hdsUxulXCi5STId78vRVYEtDAjq99ICAUktLTeTYsLoTE6Z8dS0c8pWNCxwdrk9YfJeobDZc2Y186hD/5ZQgFQ==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "@npmcli/fs": "^4.0.0",
        "fs-minipass": "^3.0.0",
        "glob": "^10.2.2",
        "lru-cache": "^10.0.1",
        "minipass": "^7.0.3",
        "minipass-collect": "^2.0.1",
        "minipass-flush": "^1.0.5",
        "minipass-pipeline": "^1.2.4",
        "p-map": "^7.0.2",
        "ssri": "^12.0.0",
        "tar": "^7.4.3",
        "unique-filename": "^4.0.0"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/cacache/node_modules/brace-expansion": {
      "version": "2.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/brace-expansion/-/brace-expansion-2.0.3.tgz",
      "integrity": "sha512-MCV/fYJEbqx68aE58kv2cA/kiky1G8vux3OR6/jbS+jIMe/6fJWa0DTzJU7dqijOWYwHi1t29FlfYI9uytqlpA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "balanced-match": "^1.0.0"
      }
    },
    "node_modules/cacache/node_modules/chownr": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/chownr/-/chownr-3.0.0.tgz",
      "integrity": "sha512-+IxzY9BZOQd/XuYPRmrvEVjF/nqj5kgT4kEq7VofrDoM1MxoRjEWkrCC3EtLi59TVawxTAn+orJwFQcrqEN1+g==",
      "dev": true,
      "license": "BlueOak-1.0.0",
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/cacache/node_modules/glob": {
      "version": "10.5.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/glob/-/glob-10.5.0.tgz",
      "integrity": "sha512-DfXN8DfhJ7NH3Oe7cFmu3NCu1wKbkReJ8TorzSAFbSKrlNaQSKfIzqYqVY8zlbs2NLBbWpRiU52GX2PbaBVNkg==",
      "deprecated": "Old versions of glob are not supported, and contain widely publicized security vulnerabilities, which have been fixed in the current version. Please update. Support for old versions may be purchased (at exorbitant rates) by contacting i@izs.me",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "foreground-child": "^3.1.0",
        "jackspeak": "^3.1.2",
        "minimatch": "^9.0.4",
        "minipass": "^7.1.2",
        "package-json-from-dist": "^1.0.0",
        "path-scurry": "^1.11.1"
      },
      "bin": {
        "glob": "dist/esm/bin.mjs"
      },
      "funding": {
        "url": "https://github.com/sponsors/isaacs"
      }
    },
    "node_modules/cacache/node_modules/lru-cache": {
      "version": "10.4.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/lru-cache/-/lru-cache-10.4.3.tgz",
      "integrity": "sha512-JNAzZcXrCt42VGLuYz0zfAzDfAvJWW6AfYlDBQyDV5DClI2m5sAmK+OIO7s59XfsRsWHp02jAJrRadPRGTt6SQ==",
      "dev": true,
      "license": "ISC"
    },
    "node_modules/cacache/node_modules/minimatch": {
      "version": "9.0.9",
      "resolved": "http://binario.caixa:8081/repository/npm-all/minimatch/-/minimatch-9.0.9.tgz",
      "integrity": "sha512-OBwBN9AL4dqmETlpS2zasx+vTeWclWzkblfZk7KTA5j3jeOONz/tRCnZomUyvNg83wL5Zv9Ss6HMJXAgL8R2Yg==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "brace-expansion": "^2.0.2"
      },
      "engines": {
        "node": ">=16 || 14 >=14.17"
      },
      "funding": {
        "url": "https://github.com/sponsors/isaacs"
      }
    },
    "node_modules/cacache/node_modules/tar": {
      "version": "7.5.13",
      "resolved": "http://binario.caixa:8081/repository/npm-all/tar/-/tar-7.5.13.tgz",
      "integrity": "sha512-tOG/7GyXpFevhXVh8jOPJrmtRpOTsYqUIkVdVooZYJS/z8WhfQUX8RJILmeuJNinGAMSu1veBr4asSHFt5/hng==",
      "dev": true,
      "license": "BlueOak-1.0.0",
      "dependencies": {
        "@isaacs/fs-minipass": "^4.0.0",
        "chownr": "^3.0.0",
        "minipass": "^7.1.2",
        "minizlib": "^3.1.0",
        "yallist": "^5.0.0"
      },
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/cacache/node_modules/yallist": {
      "version": "5.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/yallist/-/yallist-5.0.0.tgz",
      "integrity": "sha512-YgvUTfwqyc7UXVMrB+SImsVYSmTS8X/tSrtdNZMImM+n7+QTriRXyXim0mBrTXNeqzVF0KWGgHPeiyViFFrNDw==",
      "dev": true,
      "license": "BlueOak-1.0.0",
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/call-bind-apply-helpers": {
      "version": "1.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/call-bind-apply-helpers/-/call-bind-apply-helpers-1.0.2.tgz",
      "integrity": "sha512-Sp1ablJ0ivDkSzjcaJdxEunN5/XvksFJ2sMBFfq6x0ryhQV/2b/KwFe21cMpmHtPOSij8K99/wSfoEuTObmuMQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "es-errors": "^1.3.0",
        "function-bind": "^1.1.2"
      },
      "engines": {
        "node": ">= 0.4"
      }
    },
    "node_modules/call-bound": {
      "version": "1.0.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/call-bound/-/call-bound-1.0.4.tgz",
      "integrity": "sha512-+ys997U96po4Kx/ABpBCqhA9EuxJaQWDQg7295H4hBphv3IZg0boBKuwYpt4YXp6MZ5AmZQnU/tyMTlRpaSejg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "call-bind-apply-helpers": "^1.0.2",
        "get-intrinsic": "^1.3.0"
      },
      "engines": {
        "node": ">= 0.4"
      },
      "funding": {
        "url": "https://github.com/sponsors/ljharb"
      }
    },
    "node_modules/callsites": {
      "version": "3.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/callsites/-/callsites-3.1.0.tgz",
      "integrity": "sha512-P8BjAsXvZS+VIDUI11hHCQEv74YT67YUi5JJFNWIqL235sBmjX4+qx9Muvls5ivyNENctx46xQLQ3aTuE7ssaQ==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=6"
      }
    },
    "node_modules/camelcase": {
      "version": "5.3.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/camelcase/-/camelcase-5.3.1.tgz",
      "integrity": "sha512-L28STB170nwWS63UjtlEOE3dldQApaJXZkOI1uMFfzf3rRuPegHaHesyee+YxQ+W6SvRDQV6UrdOdRiR153wJg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=6"
      }
    },
    "node_modules/caniuse-lite": {
      "version": "1.0.30001781",
      "resolved": "http://binario.caixa:8081/repository/npm-all/caniuse-lite/-/caniuse-lite-1.0.30001781.tgz",
      "integrity": "sha512-RdwNCyMsNBftLjW6w01z8bKEvT6e/5tpPVEgtn22TiLGlstHOVecsX2KHFkD5e/vRnIE4EGzpuIODb3mtswtkw==",
      "funding": [
        {
          "type": "opencollective",
          "url": "https://opencollective.com/browserslist"
        },
        {
          "type": "tidelift",
          "url": "https://tidelift.com/funding/github/npm/caniuse-lite"
        },
        {
          "type": "github",
          "url": "https://github.com/sponsors/ai"
        }
      ],
      "license": "CC-BY-4.0"
    },
    "node_modules/chalk": {
      "version": "4.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/chalk/-/chalk-4.1.2.tgz",
      "integrity": "sha512-oKnbhFyRIXpUuez8iBMmyEa4nbj4IOQyuhc/wy9kY7/WVPcwIO9VA668Pu8RkO7+0G76SLROeyw9CpQ061i4mA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "ansi-styles": "^4.1.0",
        "supports-color": "^7.1.0"
      },
      "engines": {
        "node": ">=10"
      },
      "funding": {
        "url": "https://github.com/chalk/chalk?sponsor=1"
      }
    },
    "node_modules/char-regex": {
      "version": "1.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/char-regex/-/char-regex-1.0.2.tgz",
      "integrity": "sha512-kWWXztvZ5SBQV+eRgKFeh8q5sLuZY2+8WUIzlxWVTg+oGwY14qylx1KbKzHd8P6ZYkAg0xyIDU9JMHhyJMZ1jw==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=10"
      }
    },
    "node_modules/chardet": {
      "version": "2.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/chardet/-/chardet-2.1.1.tgz",
      "integrity": "sha512-PsezH1rqdV9VvyNhxxOW32/d75r01NY7TQCmOqomRo15ZSOKbpTFVsfjghxo6JloQUCGnH4k1LGu0R4yCLlWQQ==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/chevrotain": {
      "version": "11.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/chevrotain/-/chevrotain-11.1.2.tgz",
      "integrity": "sha512-opLQzEVriiH1uUQ4Kctsd49bRoFDXGGSC4GUqj7pGyxM3RehRhvTlZJc1FL/Flew2p5uwxa1tUDWKzI4wNM8pg==",
      "license": "Apache-2.0",
      "optional": true,
      "dependencies": {
        "@chevrotain/cst-dts-gen": "11.1.2",
        "@chevrotain/gast": "11.1.2",
        "@chevrotain/regexp-to-ast": "11.1.2",
        "@chevrotain/types": "11.1.2",
        "@chevrotain/utils": "11.1.2",
        "lodash-es": "4.17.23"
      }
    },
    "node_modules/chevrotain-allstar": {
      "version": "0.3.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/chevrotain-allstar/-/chevrotain-allstar-0.3.1.tgz",
      "integrity": "sha512-b7g+y9A0v4mxCW1qUhf3BSVPg+/NvGErk/dOkrDaHA0nQIQGAtrOjlX//9OQtRlSCy+x9rfB5N8yC71lH1nvMw==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "lodash-es": "^4.17.21"
      },
      "peerDependencies": {
        "chevrotain": "^11.0.0"
      }
    },
    "node_modules/chokidar": {
      "version": "4.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/chokidar/-/chokidar-4.0.3.tgz",
      "integrity": "sha512-Qgzu8kfBvo+cA4962jnP1KkS6Dop5NS6g7R5LFYJr4b8Ub94PPQXUksCw9PvXoeXPRRddRNC5C1JQUR2SMGtnA==",
      "license": "MIT",
      "dependencies": {
        "readdirp": "^4.0.1"
      },
      "engines": {
        "node": ">= 14.16.0"
      },
      "funding": {
        "url": "https://paulmillr.com/funding/"
      }
    },
    "node_modules/chownr": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/chownr/-/chownr-2.0.0.tgz",
      "integrity": "sha512-bIomtDF5KGpdogkLd9VspvFzk9KfpyyGlS8YFVZl7TGPBHL5snIOnxeshwVgPteQ9b4Eydl+pVbIyE1DcvCWgQ==",
      "dev": true,
      "license": "ISC",
      "engines": {
        "node": ">=10"
      }
    },
    "node_modules/chrome-trace-event": {
      "version": "1.0.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/chrome-trace-event/-/chrome-trace-event-1.0.4.tgz",
      "integrity": "sha512-rNjApaLzuwaOTjCiT8lSDdGN1APCiqkChLMJxJPWLunPAt5fy8xgU9/jNOchV84wfIxrA0lRQB7oCT8jrn/wrQ==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=6.0"
      }
    },
    "node_modules/ci-info": {
      "version": "3.9.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ci-info/-/ci-info-3.9.0.tgz",
      "integrity": "sha512-NIxF55hv4nSqQswkAeiOi1r83xy8JldOFDTWiug55KBu9Jnblncd2U6ViHmYgHf01TPZS77NJBhBMKdWj9HQMQ==",
      "dev": true,
      "funding": [
        {
          "type": "github",
          "url": "https://github.com/sponsors/sibiraj-s"
        }
      ],
      "license": "MIT",
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/cjs-module-lexer": {
      "version": "1.4.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/cjs-module-lexer/-/cjs-module-lexer-1.4.3.tgz",
      "integrity": "sha512-9z8TZaGM1pfswYeXrUpzPrkx8UnWYdhJclsiYMm6x/w5+nN+8Tf/LnAgfLGQCm59qAOxU8WwHEq2vNwF6i4j+Q==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/cli-cursor": {
      "version": "5.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/cli-cursor/-/cli-cursor-5.0.0.tgz",
      "integrity": "sha512-aCj4O5wKyszjMmDT4tZj93kxyydN/K5zPWSCe6/0AV/AA1pqe5ZBIw0a2ZfPQV7lL5/yb5HsUreJ6UFAF1tEQw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "restore-cursor": "^5.0.0"
      },
      "engines": {
        "node": ">=18"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/cli-spinners": {
      "version": "2.9.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/cli-spinners/-/cli-spinners-2.9.2.tgz",
      "integrity": "sha512-ywqV+5MmyL4E7ybXgKys4DugZbX0FC6LnwrhjuykIjnK9k8OQacQ7axGKnjDXWNhns0xot3bZI5h55H8yo9cJg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=6"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/cli-truncate": {
      "version": "4.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/cli-truncate/-/cli-truncate-4.0.0.tgz",
      "integrity": "sha512-nPdaFdQ0h/GEigbPClz11D0v/ZJEwxmeVZGeMo3Z5StPtUTkA9o1lD6QwoirYiSDzbcwn2XcjwmCp68W1IS4TA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "slice-ansi": "^5.0.0",
        "string-width": "^7.0.0"
      },
      "engines": {
        "node": ">=18"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/cli-width": {
      "version": "4.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/cli-width/-/cli-width-4.1.0.tgz",
      "integrity": "sha512-ouuZd4/dm2Sw5Gmqy6bGyNNNe1qt9RpmxveLSO7KcgsTnU7RXfsw+/bukWGo1abgBiMAic068rclZsO4IWmmxQ==",
      "dev": true,
      "license": "ISC",
      "engines": {
        "node": ">= 12"
      }
    },
    "node_modules/clipboard": {
      "version": "2.0.11",
      "resolved": "http://binario.caixa:8081/repository/npm-all/clipboard/-/clipboard-2.0.11.tgz",
      "integrity": "sha512-C+0bbOqkezLIsmWSvlsXS0Q0bmkugu7jcfMIACB+RDEntIzQIkdr148we28AfSloQLRdZlYL/QYyrq05j/3Faw==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "good-listener": "^1.2.2",
        "select": "^1.1.2",
        "tiny-emitter": "^2.0.0"
      }
    },
    "node_modules/cliui": {
      "version": "8.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/cliui/-/cliui-8.0.1.tgz",
      "integrity": "sha512-BSeNnyus75C4//NQ9gQt1/csTXyo/8Sb+afLAkzAptFuMsod9HFokGNudZpi/oQV73hnVK+sR+5PVRMd+Dr7YQ==",
      "license": "ISC",
      "dependencies": {
        "string-width": "^4.2.0",
        "strip-ansi": "^6.0.1",
        "wrap-ansi": "^7.0.0"
      },
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/cliui/node_modules/emoji-regex": {
      "version": "8.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/emoji-regex/-/emoji-regex-8.0.0.tgz",
      "integrity": "sha512-MSjYzcWNOA0ewAHpz0MxpYFvwg6yjy1NG3xteoqz644VCo/RPgnr1/GGt+ic3iJTzQ8Eu3TdM14SawnVUmGE6A==",
      "license": "MIT"
    },
    "node_modules/cliui/node_modules/is-fullwidth-code-point": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/is-fullwidth-code-point/-/is-fullwidth-code-point-3.0.0.tgz",
      "integrity": "sha512-zymm5+u+sCsSWyD9qNaejV3DFvhCKclKdizYaJUuHA83RLjb7nSuGnddCHGv0hk+KY7BMAlsWeK4Ueg6EV6XQg==",
      "license": "MIT",
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/cliui/node_modules/string-width": {
      "version": "4.2.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/string-width/-/string-width-4.2.3.tgz",
      "integrity": "sha512-wKyQRQpjJ0sIp62ErSZdGsjMJWsap5oRNihHhu6G7JVO/9jIB6UyevL+tXuOqrng8j/cxKTWyWUwvSTriiZz/g==",
      "license": "MIT",
      "dependencies": {
        "emoji-regex": "^8.0.0",
        "is-fullwidth-code-point": "^3.0.0",
        "strip-ansi": "^6.0.1"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/cliui/node_modules/wrap-ansi": {
      "version": "7.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/wrap-ansi/-/wrap-ansi-7.0.0.tgz",
      "integrity": "sha512-YVGIj2kamLSTxw6NsZjoBxfSwsn0ycdesmc4p+Q21c5zPuZ1pl+NfxVdxPtdHvmNVOQ6XSYG4AUtyt/Fi7D16Q==",
      "license": "MIT",
      "dependencies": {
        "ansi-styles": "^4.0.0",
        "string-width": "^4.1.0",
        "strip-ansi": "^6.0.0"
      },
      "engines": {
        "node": ">=10"
      },
      "funding": {
        "url": "https://github.com/chalk/wrap-ansi?sponsor=1"
      }
    },
    "node_modules/clone": {
      "version": "1.0.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/clone/-/clone-1.0.4.tgz",
      "integrity": "sha512-JQHZ2QMW6l3aH/j6xCqQThY/9OH4D/9ls34cgkUBiEeocRTU04tHfKPBsUK1PqZCUQM7GiA0IIXJSuXHI64Kbg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=0.8"
      }
    },
    "node_modules/clone-deep": {
      "version": "4.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/clone-deep/-/clone-deep-4.0.1.tgz",
      "integrity": "sha512-neHB9xuzh/wk0dIHweyAXv2aPGZIVk3pLMe+/RNzINf17fe0OG96QroktYAUm7SM1PBnzTabaLboqqxDyMU+SQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "is-plain-object": "^2.0.4",
        "kind-of": "^6.0.2",
        "shallow-clone": "^3.0.0"
      },
      "engines": {
        "node": ">=6"
      }
    },
    "node_modules/clone-deep/node_modules/is-plain-object": {
      "version": "2.0.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/is-plain-object/-/is-plain-object-2.0.4.tgz",
      "integrity": "sha512-h5PpgXkWitc38BBMYawTYMWJHFZJVnBquFE57xFpjB8pJFiF6gZ+bU+WyI/yqXiFR5mdLsgYNaPe8uao6Uv9Og==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "isobject": "^3.0.1"
      },
      "engines": {
        "node": ">=0.10.0"
      }
    },
    "node_modules/co": {
      "version": "4.6.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/co/-/co-4.6.0.tgz",
      "integrity": "sha512-QVb0dM5HvG+uaxitm8wONl7jltx8dqhfU33DcqtOZcLSVIKSDDLDi7+0LbAKiyI8hD9u42m2YxXSkMGWThaecQ==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "iojs": ">= 1.0.0",
        "node": ">= 0.12.0"
      }
    },
    "node_modules/collect-v8-coverage": {
      "version": "1.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/collect-v8-coverage/-/collect-v8-coverage-1.0.3.tgz",
      "integrity": "sha512-1L5aqIkwPfiodaMgQunkF1zRhNqifHBmtbbbxcr6yVxxBnliw4TDOW6NxpO8DJLgJ16OT+Y4ztZqP6p/FtXnAw==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/color-convert": {
      "version": "2.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/color-convert/-/color-convert-2.0.1.tgz",
      "integrity": "sha512-RRECPsj7iu/xb5oKYcsFHSppFNnsj/52OVTRKb4zP5onXwVF3zVmmToNcOfGC+CRDpfK/U584fMg38ZHCaElKQ==",
      "license": "MIT",
      "dependencies": {
        "color-name": "~1.1.4"
      },
      "engines": {
        "node": ">=7.0.0"
      }
    },
    "node_modules/color-name": {
      "version": "1.1.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/color-name/-/color-name-1.1.4.tgz",
      "integrity": "sha512-dOy+3AuW3a2wNbZHIuMZpTcgjGuLU/uBL/ubcZF9OXbDo8ff4O8yVp5Bf0efS8uEoYo5q4Fx7dY9OgQGXgAsQA==",
      "license": "MIT"
    },
    "node_modules/colorette": {
      "version": "2.0.20",
      "resolved": "http://binario.caixa:8081/repository/npm-all/colorette/-/colorette-2.0.20.tgz",
      "integrity": "sha512-IfEDxwoWIjkeXL1eXcDiow4UbKjhLdq6/EuSVR9GMN7KVH3r9gQ83e73hsz1Nd1T3ijd5xv1wcWRYO+D6kCI2w==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/combined-stream": {
      "version": "1.0.8",
      "resolved": "http://binario.caixa:8081/repository/npm-all/combined-stream/-/combined-stream-1.0.8.tgz",
      "integrity": "sha512-FQN4MRfuJeHf7cBbBMJFXhKSDq+2kAArBlmRBvcvFE5BB1HZKXtSFASDhdlz9zOYwxh8lDdnvmMOe/+5cdoEdg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "delayed-stream": "~1.0.0"
      },
      "engines": {
        "node": ">= 0.8"
      }
    },
    "node_modules/commander": {
      "version": "8.3.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/commander/-/commander-8.3.0.tgz",
      "integrity": "sha512-OkTL9umf+He2DZkUq8f8J9of7yL6RJKI24dVITBmNfZBmri9zYZQrKkuXiKhyfPSu8tUhnVBB1iKXevvnlR4Ww==",
      "license": "MIT",
      "optional": true,
      "engines": {
        "node": ">= 12"
      }
    },
    "node_modules/common-path-prefix": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/common-path-prefix/-/common-path-prefix-3.0.0.tgz",
      "integrity": "sha512-QE33hToZseCH3jS0qN96O/bSh3kaw/h+Tq7ngyY9eWDUnTlTNUyqfqvCXioLe5Na5jFsL78ra/wuBU4iuEgd4w==",
      "dev": true,
      "license": "ISC"
    },
    "node_modules/compressible": {
      "version": "2.0.18",
      "resolved": "http://binario.caixa:8081/repository/npm-all/compressible/-/compressible-2.0.18.tgz",
      "integrity": "sha512-AF3r7P5dWxL8MxyITRMlORQNaOA2IkAFaTr4k7BUumjPtRpGDTZpl0Pb1XCO6JeDCBdp126Cgs9sMxqSjgYyRg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "mime-db": ">= 1.43.0 < 2"
      },
      "engines": {
        "node": ">= 0.6"
      }
    },
    "node_modules/compression": {
      "version": "1.8.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/compression/-/compression-1.8.1.tgz",
      "integrity": "sha512-9mAqGPHLakhCLeNyxPkK4xVo746zQ/czLH1Ky+vkitMnWfWZps8r0qXuwhwizagCRttsL4lfG4pIOvaWLpAP0w==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "bytes": "3.1.2",
        "compressible": "~2.0.18",
        "debug": "2.6.9",
        "negotiator": "~0.6.4",
        "on-headers": "~1.1.0",
        "safe-buffer": "5.2.1",
        "vary": "~1.1.2"
      },
      "engines": {
        "node": ">= 0.8.0"
      }
    },
    "node_modules/compression/node_modules/debug": {
      "version": "2.6.9",
      "resolved": "http://binario.caixa:8081/repository/npm-all/debug/-/debug-2.6.9.tgz",
      "integrity": "sha512-bC7ElrdJaJnPbAP+1EotYvqZsb3ecl5wi6Bfi6BJTUcNowp6cvspg0jXznRTKDjm/E7AdgFBVeAPVMNcKGsHMA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "ms": "2.0.0"
      }
    },
    "node_modules/compression/node_modules/ms": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ms/-/ms-2.0.0.tgz",
      "integrity": "sha512-Tpp60P6IUJDTuOq/5Z8cdskzJujfwqfOTkrwIwj7IRISpnkJnT6SyJ4PCPnGMoFjC9ddhal5KVIYtAt97ix05A==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/compression/node_modules/negotiator": {
      "version": "0.6.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/negotiator/-/negotiator-0.6.4.tgz",
      "integrity": "sha512-myRT3DiWPHqho5PrJaIRyaMv2kgYf0mUVgBNOYMuCH5Ki1yEiQaf/ZJuQ62nvpc44wL5WDbTX7yGJi1Neevw8w==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.6"
      }
    },
    "node_modules/concat-map": {
      "version": "0.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/concat-map/-/concat-map-0.0.1.tgz",
      "integrity": "sha512-/Srv4dswyQNBfohGpz9o6Yb3Gz3SrUDqBH5rTuhGR7ahtlbYKnVxw2bCFMRljaA7EXHaXZ8wsHdodFvbkhKmqg==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/confbox": {
      "version": "0.1.8",
      "resolved": "http://binario.caixa:8081/repository/npm-all/confbox/-/confbox-0.1.8.tgz",
      "integrity": "sha512-RMtmw0iFkeR4YV+fUOSucriAQNb9g8zFR52MWCtl+cCZOFRNL6zeB395vPzFhEjjn4fMxXudmELnl/KF/WrK6w==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/connect-history-api-fallback": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/connect-history-api-fallback/-/connect-history-api-fallback-2.0.0.tgz",
      "integrity": "sha512-U73+6lQFmfiNPrYbXqr6kZ1i1wiRqXnp2nhMsINseWXO8lDau0LGEffJ8kQi4EjLZympVgRdvqjAgiZ1tgzDDA==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=0.8"
      }
    },
    "node_modules/content-disposition": {
      "version": "0.5.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/content-disposition/-/content-disposition-0.5.4.tgz",
      "integrity": "sha512-FveZTNuGw04cxlAiWbzi6zTAL/lhehaWbTtgluJh4/E95DqMwTmha3KZN1aAWA8cFIhHzMZUvLevkw5Rqk+tSQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "safe-buffer": "5.2.1"
      },
      "engines": {
        "node": ">= 0.6"
      }
    },
    "node_modules/content-type": {
      "version": "1.0.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/content-type/-/content-type-1.0.5.tgz",
      "integrity": "sha512-nTjqfcBFEipKdXCv4YDQWCfmcLZKm81ldF0pAopTvyrFGVbcR6P/VAAd5G7N+0tTr8QqiU0tFadD6FK4NtJwOA==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.6"
      }
    },
    "node_modules/convert-source-map": {
      "version": "1.9.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/convert-source-map/-/convert-source-map-1.9.0.tgz",
      "integrity": "sha512-ASFBup0Mz1uyiIjANan1jzLQami9z1PoYSZCiiYW2FczPbenXc45FZdBZLzOT+r6+iciuEModtmCti+hjaAk0A==",
      "license": "MIT"
    },
    "node_modules/cookie": {
      "version": "0.7.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/cookie/-/cookie-0.7.2.tgz",
      "integrity": "sha512-yki5XnKuf750l50uGTllt6kKILY4nQ1eNIQatoXEByZ5dWgnKqbnqmTrBE5B4N7lrMJKQ2ytWMiTO2o0v6Ew/w==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.6"
      }
    },
    "node_modules/cookie-signature": {
      "version": "1.0.7",
      "resolved": "http://binario.caixa:8081/repository/npm-all/cookie-signature/-/cookie-signature-1.0.7.tgz",
      "integrity": "sha512-NXdYc3dLr47pBkpUCHtKSwIOQXLVn8dZEuywboCOJY/osA0wFSLlSawr3KN8qXJEyX66FcONTH8EIlVuK0yyFA==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/copy-anything": {
      "version": "2.0.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/copy-anything/-/copy-anything-2.0.6.tgz",
      "integrity": "sha512-1j20GZTsvKNkc4BY3NpMOM8tt///wY3FpIzozTOFO2ffuZcV61nojHXVKIy3WM+7ADCy5FVhdZYHYDdgTU0yJw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "is-what": "^3.14.1"
      },
      "funding": {
        "url": "https://github.com/sponsors/mesqueeb"
      }
    },
    "node_modules/copy-webpack-plugin": {
      "version": "12.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/copy-webpack-plugin/-/copy-webpack-plugin-12.0.2.tgz",
      "integrity": "sha512-SNwdBeHyII+rWvee/bTnAYyO8vfVdcSTud4EIb6jcZ8inLeWucJE0DnxXQBjlQ5zlteuuvooGQy3LIyGxhvlOA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "fast-glob": "^3.3.2",
        "glob-parent": "^6.0.1",
        "globby": "^14.0.0",
        "normalize-path": "^3.0.0",
        "schema-utils": "^4.2.0",
        "serialize-javascript": "^6.0.2"
      },
      "engines": {
        "node": ">= 18.12.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/webpack"
      },
      "peerDependencies": {
        "webpack": "^5.1.0"
      }
    },
    "node_modules/core-js-compat": {
      "version": "3.49.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/core-js-compat/-/core-js-compat-3.49.0.tgz",
      "integrity": "sha512-VQXt1jr9cBz03b331DFDCCP90b3fanciLkgiOoy8SBHy06gNf+vQ1A3WFLqG7I8TipYIKeYK9wxd0tUrvHcOZA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "browserslist": "^4.28.1"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/core-js"
      }
    },
    "node_modules/core-util-is": {
      "version": "1.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/core-util-is/-/core-util-is-1.0.3.tgz",
      "integrity": "sha512-ZQBvi1DcpJ4GDqanjucZ2Hj3wEO5pZDS89BWbkcrvdxksJorwUDDZamX9ldFkp9aw2lmBDLgkObEA4DWNJ9FYQ==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/cose-base": {
      "version": "1.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/cose-base/-/cose-base-1.0.3.tgz",
      "integrity": "sha512-s9whTXInMSgAp/NVXVNuVxVKzGH2qck3aQlVHxDCdAEPgtMKwc4Wq6/QKhgdEdgbLSi9rBTAcPoRa6JpiG4ksg==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "layout-base": "^1.0.0"
      }
    },
    "node_modules/cosmiconfig": {
      "version": "9.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/cosmiconfig/-/cosmiconfig-9.0.1.tgz",
      "integrity": "sha512-hr4ihw+DBqcvrsEDioRO31Z17x71pUYoNe/4h6Z0wB72p7MU7/9gH8Q3s12NFhHPfYBBOV3qyfUxmr/Yn3shnQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "env-paths": "^2.2.1",
        "import-fresh": "^3.3.0",
        "js-yaml": "^4.1.0",
        "parse-json": "^5.2.0"
      },
      "engines": {
        "node": ">=14"
      },
      "funding": {
        "url": "https://github.com/sponsors/d-fischer"
      },
      "peerDependencies": {
        "typescript": ">=4.9.5"
      },
      "peerDependenciesMeta": {
        "typescript": {
          "optional": true
        }
      }
    },
    "node_modules/cosmiconfig/node_modules/argparse": {
      "version": "2.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/argparse/-/argparse-2.0.1.tgz",
      "integrity": "sha512-8+9WqebbFzpX9OR+Wa6O29asIogeRMzcGtAINdpMHHyAg10f05aSFVBbcEqGf/PXw1EjAZ+q2/bEBg3DvurK3Q==",
      "dev": true,
      "license": "Python-2.0"
    },
    "node_modules/cosmiconfig/node_modules/js-yaml": {
      "version": "4.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/js-yaml/-/js-yaml-4.1.1.tgz",
      "integrity": "sha512-qQKT4zQxXl8lLwBtHMWwaTcGfFOZviOJet3Oy/xmGk2gZH677CJM9EvtfdSkgWcATZhj/55JZ0rmy3myCT5lsA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "argparse": "^2.0.1"
      },
      "bin": {
        "js-yaml": "bin/js-yaml.js"
      }
    },
    "node_modules/create-jest": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/create-jest/-/create-jest-29.7.0.tgz",
      "integrity": "sha512-Adz2bdH0Vq3F53KEMJOoftQFutWCukm6J24wbPWRO4k1kMY7gS7ds/uoJkNuV8wDCtWWnuwGcJwpWcih+zEW1Q==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@jest/types": "^29.6.3",
        "chalk": "^4.0.0",
        "exit": "^0.1.2",
        "graceful-fs": "^4.2.9",
        "jest-config": "^29.7.0",
        "jest-util": "^29.7.0",
        "prompts": "^2.0.1"
      },
      "bin": {
        "create-jest": "bin/create-jest.js"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/cross-spawn": {
      "version": "7.0.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/cross-spawn/-/cross-spawn-7.0.6.tgz",
      "integrity": "sha512-uV2QOWP2nWzsy2aMp8aRibhi9dlzF5Hgh5SHaB9OiTGEyDTiJJyx0uy51QXdyWbtAHNua4XJzUKca3OzKUd3vA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "path-key": "^3.1.0",
        "shebang-command": "^2.0.0",
        "which": "^2.0.1"
      },
      "engines": {
        "node": ">= 8"
      }
    },
    "node_modules/css-loader": {
      "version": "7.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/css-loader/-/css-loader-7.1.2.tgz",
      "integrity": "sha512-6WvYYn7l/XEGN8Xu2vWFt9nVzrCn39vKyTEFf/ExEyoksJjjSZV/0/35XPlMbpnr6VGhZIUg5yJrL8tGfes/FA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "icss-utils": "^5.1.0",
        "postcss": "^8.4.33",
        "postcss-modules-extract-imports": "^3.1.0",
        "postcss-modules-local-by-default": "^4.0.5",
        "postcss-modules-scope": "^3.2.0",
        "postcss-modules-values": "^4.0.0",
        "postcss-value-parser": "^4.2.0",
        "semver": "^7.5.4"
      },
      "engines": {
        "node": ">= 18.12.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/webpack"
      },
      "peerDependencies": {
        "@rspack/core": "0.x || 1.x",
        "webpack": "^5.27.0"
      },
      "peerDependenciesMeta": {
        "@rspack/core": {
          "optional": true
        },
        "webpack": {
          "optional": true
        }
      }
    },
    "node_modules/css-select": {
      "version": "5.2.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/css-select/-/css-select-5.2.2.tgz",
      "integrity": "sha512-TizTzUddG/xYLA3NXodFM0fSbNizXjOKhqiQQwvhlspadZokn1KDy0NZFS0wuEubIYAV5/c1/lAr0TaaFXEXzw==",
      "dev": true,
      "license": "BSD-2-Clause",
      "dependencies": {
        "boolbase": "^1.0.0",
        "css-what": "^6.1.0",
        "domhandler": "^5.0.2",
        "domutils": "^3.0.1",
        "nth-check": "^2.0.1"
      },
      "funding": {
        "url": "https://github.com/sponsors/fb55"
      }
    },
    "node_modules/css-what": {
      "version": "6.2.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/css-what/-/css-what-6.2.2.tgz",
      "integrity": "sha512-u/O3vwbptzhMs3L1fQE82ZSLHQQfto5gyZzwteVIEyeaY5Fc7R4dapF/BvRoSYFeqfBk4m0V1Vafq5Pjv25wvA==",
      "dev": true,
      "license": "BSD-2-Clause",
      "engines": {
        "node": ">= 6"
      },
      "funding": {
        "url": "https://github.com/sponsors/fb55"
      }
    },
    "node_modules/cssesc": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/cssesc/-/cssesc-3.0.0.tgz",
      "integrity": "sha512-/Tb/JcjK111nNScGob5MNtsntNM1aCNUDipB/TkwZFhyDrrE47SOx/18wF2bbjgc3ZzCSKW1T5nt5EbFoAz/Vg==",
      "dev": true,
      "license": "MIT",
      "bin": {
        "cssesc": "bin/cssesc"
      },
      "engines": {
        "node": ">=4"
      }
    },
    "node_modules/cssom": {
      "version": "0.5.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/cssom/-/cssom-0.5.0.tgz",
      "integrity": "sha512-iKuQcq+NdHqlAcwUY0o/HL69XQrUaQdMjmStJ8JFmUaiiQErlhrmuigkg/CU4E2J0IyUKUrMAgl36TvN67MqTw==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/cssstyle": {
      "version": "2.3.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/cssstyle/-/cssstyle-2.3.0.tgz",
      "integrity": "sha512-AZL67abkUzIuvcHqk7c09cezpGNcxUxU4Ioi/05xHk4DQeTkWmGYftIE6ctU6AEt+Gn4n1lDStOtj7FKycP71A==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "cssom": "~0.3.6"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/cssstyle/node_modules/cssom": {
      "version": "0.3.8",
      "resolved": "http://binario.caixa:8081/repository/npm-all/cssom/-/cssom-0.3.8.tgz",
      "integrity": "sha512-b0tGHbfegbhPJpxpiBPU2sCkigAqtM9O121le6bbOlgyV+NyGyCmVfJ6QW9eRjz8CpNfWEOYBIMIGRYkLwsIYg==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/cytoscape": {
      "version": "3.33.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/cytoscape/-/cytoscape-3.33.1.tgz",
      "integrity": "sha512-iJc4TwyANnOGR1OmWhsS9ayRS3s+XQ185FmuHObThD+5AeJCakAAbWv8KimMTt08xCCLNgneQwFp+JRJOr9qGQ==",
      "license": "MIT",
      "optional": true,
      "engines": {
        "node": ">=0.10"
      }
    },
    "node_modules/cytoscape-cose-bilkent": {
      "version": "4.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/cytoscape-cose-bilkent/-/cytoscape-cose-bilkent-4.1.0.tgz",
      "integrity": "sha512-wgQlVIUJF13Quxiv5e1gstZ08rnZj2XaLHGoFMYXz7SkNfCDOOteKBE6SYRfA9WxxI/iBc3ajfDoc6hb/MRAHQ==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "cose-base": "^1.0.0"
      },
      "peerDependencies": {
        "cytoscape": "^3.2.0"
      }
    },
    "node_modules/cytoscape-fcose": {
      "version": "2.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/cytoscape-fcose/-/cytoscape-fcose-2.2.0.tgz",
      "integrity": "sha512-ki1/VuRIHFCzxWNrsshHYPs6L7TvLu3DL+TyIGEsRcvVERmxokbf5Gdk7mFxZnTdiGtnA4cfSmjZJMviqSuZrQ==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "cose-base": "^2.2.0"
      },
      "peerDependencies": {
        "cytoscape": "^3.2.0"
      }
    },
    "node_modules/cytoscape-fcose/node_modules/cose-base": {
      "version": "2.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/cose-base/-/cose-base-2.2.0.tgz",
      "integrity": "sha512-AzlgcsCbUMymkADOJtQm3wO9S3ltPfYOFD5033keQn9NJzIbtnZj+UdBJe7DYml/8TdbtHJW3j58SOnKhWY/5g==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "layout-base": "^2.0.0"
      }
    },
    "node_modules/cytoscape-fcose/node_modules/layout-base": {
      "version": "2.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/layout-base/-/layout-base-2.0.1.tgz",
      "integrity": "sha512-dp3s92+uNI1hWIpPGH3jK2kxE2lMjdXdr+DH8ynZHpd6PUlH6x6cbuXnoMmiNumznqaNO31xu9e79F0uuZ0JFg==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/d3": {
      "version": "7.9.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3/-/d3-7.9.0.tgz",
      "integrity": "sha512-e1U46jVP+w7Iut8Jt8ri1YsPOvFpg46k+K8TpCb0P+zjCkjkPnV7WzfDJzMHy1LnA+wj5pLT1wjO901gLXeEhA==",
      "license": "ISC",
      "optional": true,
      "dependencies": {
        "d3-array": "3",
        "d3-axis": "3",
        "d3-brush": "3",
        "d3-chord": "3",
        "d3-color": "3",
        "d3-contour": "4",
        "d3-delaunay": "6",
        "d3-dispatch": "3",
        "d3-drag": "3",
        "d3-dsv": "3",
        "d3-ease": "3",
        "d3-fetch": "3",
        "d3-force": "3",
        "d3-format": "3",
        "d3-geo": "3",
        "d3-hierarchy": "3",
        "d3-interpolate": "3",
        "d3-path": "3",
        "d3-polygon": "3",
        "d3-quadtree": "3",
        "d3-random": "3",
        "d3-scale": "4",
        "d3-scale-chromatic": "3",
        "d3-selection": "3",
        "d3-shape": "3",
        "d3-time": "3",
        "d3-time-format": "4",
        "d3-timer": "3",
        "d3-transition": "3",
        "d3-zoom": "3"
      },
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/d3-array": {
      "version": "3.2.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-array/-/d3-array-3.2.4.tgz",
      "integrity": "sha512-tdQAmyA18i4J7wprpYq8ClcxZy3SC31QMeByyCFyRt7BVHdREQZ5lpzoe5mFEYZUWe+oq8HBvk9JjpibyEV4Jg==",
      "license": "ISC",
      "optional": true,
      "dependencies": {
        "internmap": "1 - 2"
      },
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/d3-axis": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-axis/-/d3-axis-3.0.0.tgz",
      "integrity": "sha512-IH5tgjV4jE/GhHkRV0HiVYPDtvfjHQlQfJHs0usq7M30XcSBvOotpmH1IgkcXsO/5gEQZD43B//fc7SRT5S+xw==",
      "license": "ISC",
      "optional": true,
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/d3-brush": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-brush/-/d3-brush-3.0.0.tgz",
      "integrity": "sha512-ALnjWlVYkXsVIGlOsuWH1+3udkYFI48Ljihfnh8FZPF2QS9o+PzGLBslO0PjzVoHLZ2KCVgAM8NVkXPJB2aNnQ==",
      "license": "ISC",
      "optional": true,
      "dependencies": {
        "d3-dispatch": "1 - 3",
        "d3-drag": "2 - 3",
        "d3-interpolate": "1 - 3",
        "d3-selection": "3",
        "d3-transition": "3"
      },
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/d3-chord": {
      "version": "3.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-chord/-/d3-chord-3.0.1.tgz",
      "integrity": "sha512-VE5S6TNa+j8msksl7HwjxMHDM2yNK3XCkusIlpX5kwauBfXuyLAtNg9jCp/iHH61tgI4sb6R/EIMWCqEIdjT/g==",
      "license": "ISC",
      "optional": true,
      "dependencies": {
        "d3-path": "1 - 3"
      },
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/d3-color": {
      "version": "3.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-color/-/d3-color-3.1.0.tgz",
      "integrity": "sha512-zg/chbXyeBtMQ1LbD/WSoW2DpC3I0mpmPdW+ynRTj/x2DAWYrIY7qeZIHidozwV24m4iavr15lNwIwLxRmOxhA==",
      "license": "ISC",
      "optional": true,
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/d3-contour": {
      "version": "4.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-contour/-/d3-contour-4.0.2.tgz",
      "integrity": "sha512-4EzFTRIikzs47RGmdxbeUvLWtGedDUNkTcmzoeyg4sP/dvCexO47AaQL7VKy/gul85TOxw+IBgA8US2xwbToNA==",
      "license": "ISC",
      "optional": true,
      "dependencies": {
        "d3-array": "^3.2.0"
      },
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/d3-delaunay": {
      "version": "6.0.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-delaunay/-/d3-delaunay-6.0.4.tgz",
      "integrity": "sha512-mdjtIZ1XLAM8bm/hx3WwjfHt6Sggek7qH043O8KEjDXN40xi3vx/6pYSVTwLjEgiXQTbvaouWKynLBiUZ6SK6A==",
      "license": "ISC",
      "optional": true,
      "dependencies": {
        "delaunator": "5"
      },
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/d3-dispatch": {
      "version": "3.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-dispatch/-/d3-dispatch-3.0.1.tgz",
      "integrity": "sha512-rzUyPU/S7rwUflMyLc1ETDeBj0NRuHKKAcvukozwhshr6g6c5d8zh4c2gQjY2bZ0dXeGLWc1PF174P2tVvKhfg==",
      "license": "ISC",
      "optional": true,
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/d3-drag": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-drag/-/d3-drag-3.0.0.tgz",
      "integrity": "sha512-pWbUJLdETVA8lQNJecMxoXfH6x+mO2UQo8rSmZ+QqxcbyA3hfeprFgIT//HW2nlHChWeIIMwS2Fq+gEARkhTkg==",
      "license": "ISC",
      "optional": true,
      "dependencies": {
        "d3-dispatch": "1 - 3",
        "d3-selection": "3"
      },
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/d3-dsv": {
      "version": "3.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-dsv/-/d3-dsv-3.0.1.tgz",
      "integrity": "sha512-UG6OvdI5afDIFP9w4G0mNq50dSOsXHJaRE8arAS5o9ApWnIElp8GZw1Dun8vP8OyHOZ/QJUKUJwxiiCCnUwm+Q==",
      "license": "ISC",
      "optional": true,
      "dependencies": {
        "commander": "7",
        "iconv-lite": "0.6",
        "rw": "1"
      },
      "bin": {
        "csv2json": "bin/dsv2json.js",
        "csv2tsv": "bin/dsv2dsv.js",
        "dsv2dsv": "bin/dsv2dsv.js",
        "dsv2json": "bin/dsv2json.js",
        "json2csv": "bin/json2dsv.js",
        "json2dsv": "bin/json2dsv.js",
        "json2tsv": "bin/json2dsv.js",
        "tsv2csv": "bin/dsv2dsv.js",
        "tsv2json": "bin/dsv2json.js"
      },
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/d3-dsv/node_modules/commander": {
      "version": "7.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/commander/-/commander-7.2.0.tgz",
      "integrity": "sha512-QrWXB+ZQSVPmIWIhtEO9H+gwHaMGYiF5ChvoJ+K9ZGHG/sVsa6yiesAD1GC/x46sET00Xlwo1u49RVVVzvcSkw==",
      "license": "MIT",
      "optional": true,
      "engines": {
        "node": ">= 10"
      }
    },
    "node_modules/d3-dsv/node_modules/iconv-lite": {
      "version": "0.6.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/iconv-lite/-/iconv-lite-0.6.3.tgz",
      "integrity": "sha512-4fCk79wshMdzMp2rH06qWrJE4iolqLhCUH+OiuIgU++RB0+94NlDL81atO7GX55uUKueo0txHNtvEyI6D7WdMw==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "safer-buffer": ">= 2.1.2 < 3.0.0"
      },
      "engines": {
        "node": ">=0.10.0"
      }
    },
    "node_modules/d3-ease": {
      "version": "3.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-ease/-/d3-ease-3.0.1.tgz",
      "integrity": "sha512-wR/XK3D3XcLIZwpbvQwQ5fK+8Ykds1ip7A2Txe0yxncXSdq1L9skcG7blcedkOX+ZcgxGAmLX1FrRGbADwzi0w==",
      "license": "BSD-3-Clause",
      "optional": true,
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/d3-fetch": {
      "version": "3.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-fetch/-/d3-fetch-3.0.1.tgz",
      "integrity": "sha512-kpkQIM20n3oLVBKGg6oHrUchHM3xODkTzjMoj7aWQFq5QEM+R6E4WkzT5+tojDY7yjez8KgCBRoj4aEr99Fdqw==",
      "license": "ISC",
      "optional": true,
      "dependencies": {
        "d3-dsv": "1 - 3"
      },
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/d3-force": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-force/-/d3-force-3.0.0.tgz",
      "integrity": "sha512-zxV/SsA+U4yte8051P4ECydjD/S+qeYtnaIyAs9tgHCqfguma/aAQDjo85A9Z6EKhBirHRJHXIgJUlffT4wdLg==",
      "license": "ISC",
      "optional": true,
      "dependencies": {
        "d3-dispatch": "1 - 3",
        "d3-quadtree": "1 - 3",
        "d3-timer": "1 - 3"
      },
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/d3-format": {
      "version": "3.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-format/-/d3-format-3.1.2.tgz",
      "integrity": "sha512-AJDdYOdnyRDV5b6ArilzCPPwc1ejkHcoyFarqlPqT7zRYjhavcT3uSrqcMvsgh2CgoPbK3RCwyHaVyxYcP2Arg==",
      "license": "ISC",
      "optional": true,
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/d3-geo": {
      "version": "3.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-geo/-/d3-geo-3.1.1.tgz",
      "integrity": "sha512-637ln3gXKXOwhalDzinUgY83KzNWZRKbYubaG+fGVuc/dxO64RRljtCTnf5ecMyE1RIdtqpkVcq0IbtU2S8j2Q==",
      "license": "ISC",
      "optional": true,
      "dependencies": {
        "d3-array": "2.5.0 - 3"
      },
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/d3-hierarchy": {
      "version": "3.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-hierarchy/-/d3-hierarchy-3.1.2.tgz",
      "integrity": "sha512-FX/9frcub54beBdugHjDCdikxThEqjnR93Qt7PvQTOHxyiNCAlvMrHhclk3cD5VeAaq9fxmfRp+CnWw9rEMBuA==",
      "license": "ISC",
      "optional": true,
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/d3-interpolate": {
      "version": "3.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-interpolate/-/d3-interpolate-3.0.1.tgz",
      "integrity": "sha512-3bYs1rOD33uo8aqJfKP3JWPAibgw8Zm2+L9vBKEHJ2Rg+viTR7o5Mmv5mZcieN+FRYaAOWX5SJATX6k1PWz72g==",
      "license": "ISC",
      "optional": true,
      "dependencies": {
        "d3-color": "1 - 3"
      },
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/d3-path": {
      "version": "3.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-path/-/d3-path-3.1.0.tgz",
      "integrity": "sha512-p3KP5HCf/bvjBSSKuXid6Zqijx7wIfNW+J/maPs+iwR35at5JCbLUT0LzF1cnjbCHWhqzQTIN2Jpe8pRebIEFQ==",
      "license": "ISC",
      "optional": true,
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/d3-polygon": {
      "version": "3.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-polygon/-/d3-polygon-3.0.1.tgz",
      "integrity": "sha512-3vbA7vXYwfe1SYhED++fPUQlWSYTTGmFmQiany/gdbiWgU/iEyQzyymwL9SkJjFFuCS4902BSzewVGsHHmHtXg==",
      "license": "ISC",
      "optional": true,
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/d3-quadtree": {
      "version": "3.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-quadtree/-/d3-quadtree-3.0.1.tgz",
      "integrity": "sha512-04xDrxQTDTCFwP5H6hRhsRcb9xxv2RzkcsygFzmkSIOJy3PeRJP7sNk3VRIbKXcog561P9oU0/rVH6vDROAgUw==",
      "license": "ISC",
      "optional": true,
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/d3-random": {
      "version": "3.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-random/-/d3-random-3.0.1.tgz",
      "integrity": "sha512-FXMe9GfxTxqd5D6jFsQ+DJ8BJS4E/fT5mqqdjovykEB2oFbTMDVdg1MGFxfQW+FBOGoB++k8swBrgwSHT1cUXQ==",
      "license": "ISC",
      "optional": true,
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/d3-sankey": {
      "version": "0.12.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-sankey/-/d3-sankey-0.12.3.tgz",
      "integrity": "sha512-nQhsBRmM19Ax5xEIPLMY9ZmJ/cDvd1BG3UVvt5h3WRxKg5zGRbvnteTyWAbzeSvlh3tW7ZEmq4VwR5mB3tutmQ==",
      "license": "BSD-3-Clause",
      "optional": true,
      "dependencies": {
        "d3-array": "1 - 2",
        "d3-shape": "^1.2.0"
      }
    },
    "node_modules/d3-sankey/node_modules/d3-array": {
      "version": "2.12.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-array/-/d3-array-2.12.1.tgz",
      "integrity": "sha512-B0ErZK/66mHtEsR1TkPEEkwdy+WDesimkM5gpZr5Dsg54BiTA5RXtYW5qTLIAcekaS9xfZrzBLF/OAkB3Qn1YQ==",
      "license": "BSD-3-Clause",
      "optional": true,
      "dependencies": {
        "internmap": "^1.0.0"
      }
    },
    "node_modules/d3-sankey/node_modules/d3-path": {
      "version": "1.0.9",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-path/-/d3-path-1.0.9.tgz",
      "integrity": "sha512-VLaYcn81dtHVTjEHd8B+pbe9yHWpXKZUC87PzoFmsFrJqgFwDe/qxfp5MlfsfM1V5E/iVt0MmEbWQ7FVIXh/bg==",
      "license": "BSD-3-Clause",
      "optional": true
    },
    "node_modules/d3-sankey/node_modules/d3-shape": {
      "version": "1.3.7",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-shape/-/d3-shape-1.3.7.tgz",
      "integrity": "sha512-EUkvKjqPFUAZyOlhY5gzCxCeI0Aep04LwIRpsZ/mLFelJiUfnK56jo5JMDSE7yyP2kLSb6LtF+S5chMk7uqPqw==",
      "license": "BSD-3-Clause",
      "optional": true,
      "dependencies": {
        "d3-path": "1"
      }
    },
    "node_modules/d3-sankey/node_modules/internmap": {
      "version": "1.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/internmap/-/internmap-1.0.1.tgz",
      "integrity": "sha512-lDB5YccMydFBtasVtxnZ3MRBHuaoE8GKsppq+EchKL2U4nK/DmEpPHNH8MZe5HkMtpSiTSOZwfN0tzYjO/lJEw==",
      "license": "ISC",
      "optional": true
    },
    "node_modules/d3-scale": {
      "version": "4.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-scale/-/d3-scale-4.0.2.tgz",
      "integrity": "sha512-GZW464g1SH7ag3Y7hXjf8RoUuAFIqklOAq3MRl4OaWabTFJY9PN/E1YklhXLh+OQ3fM9yS2nOkCoS+WLZ6kvxQ==",
      "license": "ISC",
      "optional": true,
      "dependencies": {
        "d3-array": "2.10.0 - 3",
        "d3-format": "1 - 3",
        "d3-interpolate": "1.2.0 - 3",
        "d3-time": "2.1.1 - 3",
        "d3-time-format": "2 - 4"
      },
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/d3-scale-chromatic": {
      "version": "3.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-scale-chromatic/-/d3-scale-chromatic-3.1.0.tgz",
      "integrity": "sha512-A3s5PWiZ9YCXFye1o246KoscMWqf8BsD9eRiJ3He7C9OBaxKhAd5TFCdEx/7VbKtxxTsu//1mMJFrEt572cEyQ==",
      "license": "ISC",
      "optional": true,
      "dependencies": {
        "d3-color": "1 - 3",
        "d3-interpolate": "1 - 3"
      },
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/d3-selection": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-selection/-/d3-selection-3.0.0.tgz",
      "integrity": "sha512-fmTRWbNMmsmWq6xJV8D19U/gw/bwrHfNXxrIN+HfZgnzqTHp9jOmKMhsTUjXOJnZOdZY9Q28y4yebKzqDKlxlQ==",
      "license": "ISC",
      "optional": true,
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/d3-shape": {
      "version": "3.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-shape/-/d3-shape-3.2.0.tgz",
      "integrity": "sha512-SaLBuwGm3MOViRq2ABk3eLoxwZELpH6zhl3FbAoJ7Vm1gofKx6El1Ib5z23NUEhF9AsGl7y+dzLe5Cw2AArGTA==",
      "license": "ISC",
      "optional": true,
      "dependencies": {
        "d3-path": "^3.1.0"
      },
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/d3-time": {
      "version": "3.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-time/-/d3-time-3.1.0.tgz",
      "integrity": "sha512-VqKjzBLejbSMT4IgbmVgDjpkYrNWUYJnbCGo874u7MMKIWsILRX+OpX/gTk8MqjpT1A/c6HY2dCA77ZN0lkQ2Q==",
      "license": "ISC",
      "optional": true,
      "dependencies": {
        "d3-array": "2 - 3"
      },
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/d3-time-format": {
      "version": "4.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-time-format/-/d3-time-format-4.1.0.tgz",
      "integrity": "sha512-dJxPBlzC7NugB2PDLwo9Q8JiTR3M3e4/XANkreKSUxF8vvXKqm1Yfq4Q5dl8budlunRVlUUaDUgFt7eA8D6NLg==",
      "license": "ISC",
      "optional": true,
      "dependencies": {
        "d3-time": "1 - 3"
      },
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/d3-timer": {
      "version": "3.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-timer/-/d3-timer-3.0.1.tgz",
      "integrity": "sha512-ndfJ/JxxMd3nw31uyKoY2naivF+r29V+Lc0svZxe1JvvIRmi8hUsrMvdOwgS1o6uBHmiz91geQ0ylPP0aj1VUA==",
      "license": "ISC",
      "optional": true,
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/d3-transition": {
      "version": "3.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-transition/-/d3-transition-3.0.1.tgz",
      "integrity": "sha512-ApKvfjsSR6tg06xrL434C0WydLr7JewBB3V+/39RMHsaXTOG0zmt/OAXeng5M5LBm0ojmxJrpomQVZ1aPvBL4w==",
      "license": "ISC",
      "optional": true,
      "dependencies": {
        "d3-color": "1 - 3",
        "d3-dispatch": "1 - 3",
        "d3-ease": "1 - 3",
        "d3-interpolate": "1 - 3",
        "d3-timer": "1 - 3"
      },
      "engines": {
        "node": ">=12"
      },
      "peerDependencies": {
        "d3-selection": "2 - 3"
      }
    },
    "node_modules/d3-zoom": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/d3-zoom/-/d3-zoom-3.0.0.tgz",
      "integrity": "sha512-b8AmV3kfQaqWAuacbPuNbL6vahnOJflOhexLzMMNLga62+/nh0JzvJ0aO/5a5MVgUFGS7Hu1P9P03o3fJkDCyw==",
      "license": "ISC",
      "optional": true,
      "dependencies": {
        "d3-dispatch": "1 - 3",
        "d3-drag": "2 - 3",
        "d3-interpolate": "1 - 3",
        "d3-selection": "2 - 3",
        "d3-transition": "2 - 3"
      },
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/dagre-d3-es": {
      "version": "7.0.14",
      "resolved": "http://binario.caixa:8081/repository/npm-all/dagre-d3-es/-/dagre-d3-es-7.0.14.tgz",
      "integrity": "sha512-P4rFMVq9ESWqmOgK+dlXvOtLwYg0i7u0HBGJER0LZDJT2VHIPAMZ/riPxqJceWMStH5+E61QxFra9kIS3AqdMg==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "d3": "^7.9.0",
        "lodash-es": "^4.17.21"
      }
    },
    "node_modules/data-urls": {
      "version": "3.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/data-urls/-/data-urls-3.0.2.tgz",
      "integrity": "sha512-Jy/tj3ldjZJo63sVAvg6LHt2mHvl4V6AgRAmNDtLdm7faqtsx+aJG42rsyCo9JCoRVKwPFzKlIPx3DIibwSIaQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "abab": "^2.0.6",
        "whatwg-mimetype": "^3.0.0",
        "whatwg-url": "^11.0.0"
      },
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/date-fns": {
      "version": "4.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/date-fns/-/date-fns-4.1.0.tgz",
      "integrity": "sha512-Ukq0owbQXxa/U3EGtsdVBkR1w7KOQ5gIBqdH2hkvknzZPYvBxb/aa6E8L7tmjFtkwZBu3UXBbjIgPo/Ez4xaNg==",
      "license": "MIT",
      "peer": true,
      "funding": {
        "type": "github",
        "url": "https://github.com/sponsors/kossnocorp"
      }
    },
    "node_modules/dayjs": {
      "version": "1.11.20",
      "resolved": "http://binario.caixa:8081/repository/npm-all/dayjs/-/dayjs-1.11.20.tgz",
      "integrity": "sha512-YbwwqR/uYpeoP4pu043q+LTDLFBLApUP6VxRihdfNTqu4ubqMlGDLd6ErXhEgsyvY0K6nCs7nggYumAN+9uEuQ==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/debug": {
      "version": "4.4.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/debug/-/debug-4.4.3.tgz",
      "integrity": "sha512-RGwwWnwQvkVfavKVt22FGLw+xYSdzARwm0ru6DhTVA3umU5hZc28V3kO4stgYryrTlLpuvgI9GiijltAjNbcqA==",
      "license": "MIT",
      "dependencies": {
        "ms": "^2.1.3"
      },
      "engines": {
        "node": ">=6.0"
      },
      "peerDependenciesMeta": {
        "supports-color": {
          "optional": true
        }
      }
    },
    "node_modules/decimal.js": {
      "version": "10.6.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/decimal.js/-/decimal.js-10.6.0.tgz",
      "integrity": "sha512-YpgQiITW3JXGntzdUmyUR1V812Hn8T1YVXhCu+wO3OpS4eU9l4YdD3qjyiKdV6mvV29zapkMeD390UVEf2lkUg==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/dedent": {
      "version": "1.7.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/dedent/-/dedent-1.7.2.tgz",
      "integrity": "sha512-WzMx3mW98SN+zn3hgemf4OzdmyNhhhKz5Ay0pUfQiMQ3e1g+xmTJWp/pKdwKVXhdSkAEGIIzqeuWrL3mV/AXbA==",
      "dev": true,
      "license": "MIT",
      "peerDependencies": {
        "babel-plugin-macros": "^3.1.0"
      },
      "peerDependenciesMeta": {
        "babel-plugin-macros": {
          "optional": true
        }
      }
    },
    "node_modules/deepmerge": {
      "version": "4.3.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/deepmerge/-/deepmerge-4.3.1.tgz",
      "integrity": "sha512-3sUqbMEc77XqpdNO7FRyRog+eW3ph+GYCbj+rK+uYyRMuwsVy0rMiVtPn+QJlKFvWP/1PYpapqYn0Me2knFn+A==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=0.10.0"
      }
    },
    "node_modules/default-browser": {
      "version": "5.5.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/default-browser/-/default-browser-5.5.0.tgz",
      "integrity": "sha512-H9LMLr5zwIbSxrmvikGuI/5KGhZ8E2zH3stkMgM5LpOWDutGM2JZaj460Udnf1a+946zc7YBgrqEWwbk7zHvGw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "bundle-name": "^4.1.0",
        "default-browser-id": "^5.0.0"
      },
      "engines": {
        "node": ">=18"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/default-browser-id": {
      "version": "5.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/default-browser-id/-/default-browser-id-5.0.1.tgz",
      "integrity": "sha512-x1VCxdX4t+8wVfd1so/9w+vQ4vx7lKd2Qp5tDRutErwmR85OgmfX7RlLRMWafRMY7hbEiXIbudNrjOAPa/hL8Q==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=18"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/defaults": {
      "version": "1.0.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/defaults/-/defaults-1.0.4.tgz",
      "integrity": "sha512-eFuaLoy/Rxalv2kr+lqMlUnrDWV+3j4pljOIJgLIhI058IQfWJ7vXhyEIHu+HtC738klGALYxOKDO0bQP3tg8A==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "clone": "^1.0.2"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/define-lazy-prop": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/define-lazy-prop/-/define-lazy-prop-3.0.0.tgz",
      "integrity": "sha512-N+MeXYoqr3pOgn8xfyRPREN7gHakLYjhsHhWGT3fWAiL4IkAt0iDw14QiiEm2bE30c5XX5q0FtAA3CK5f9/BUg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=12"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/delaunator": {
      "version": "5.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/delaunator/-/delaunator-5.1.0.tgz",
      "integrity": "sha512-AGrQ4QSgssa1NGmWmLPqN5NY2KajF5MqxetNEO+o0n3ZwZZeTmt7bBnvzHWrmkZFxGgr4HdyFgelzgi06otLuQ==",
      "license": "ISC",
      "optional": true,
      "dependencies": {
        "robust-predicates": "^3.0.2"
      }
    },
    "node_modules/delayed-stream": {
      "version": "1.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/delayed-stream/-/delayed-stream-1.0.0.tgz",
      "integrity": "sha512-ZySD7Nf91aLB0RxL4KGrKHBXl7Eds1DAmEdcoVawXnLD7SDhpNgtuII2aAkg7a7QS41jxPSZ17p4VdGnMHk3MQ==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=0.4.0"
      }
    },
    "node_modules/delegate": {
      "version": "3.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/delegate/-/delegate-3.2.0.tgz",
      "integrity": "sha512-IofjkYBZaZivn0V8nnsMJGBr4jVLxHDheKSW88PyxS5QC4Vo9ZbZVvhzlSxY87fVq3STR6r+4cGepyHkcWOQSw==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/depd": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/depd/-/depd-2.0.0.tgz",
      "integrity": "sha512-g7nH6P6dyDioJogAAGprGpCtVImJhpPk/roCzdb3fIh61/s/nPsfR6onyMwkCAR/OlC3yBC0lESvUoQEAssIrw==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.8"
      }
    },
    "node_modules/destroy": {
      "version": "1.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/destroy/-/destroy-1.2.0.tgz",
      "integrity": "sha512-2sJGJTaXIIaR1w4iJSNoN0hnMY7Gpc/n8D4qSCJw8QqFWXf7cuAgnEHxBpweaVcPevC2l3KpjYCx3NypQQgaJg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.8",
        "npm": "1.2.8000 || >= 1.4.16"
      }
    },
    "node_modules/detect-libc": {
      "version": "2.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/detect-libc/-/detect-libc-2.1.2.tgz",
      "integrity": "sha512-Btj2BOOO83o3WyH59e8MgXsxEQVcarkUOpEYrubB0urwnN10yQ364rsiByU11nZlqWYZm05i/of7io4mzihBtQ==",
      "dev": true,
      "license": "Apache-2.0",
      "optional": true,
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/detect-newline": {
      "version": "3.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/detect-newline/-/detect-newline-3.1.0.tgz",
      "integrity": "sha512-TLz+x/vEXm/Y7P7wn1EJFNLxYpUD4TgMosxY6fAVJUnJMbupHBOncxyWUG9OpTaH9EBD7uFI5LfEgmMOc54DsA==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/detect-node": {
      "version": "2.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/detect-node/-/detect-node-2.1.0.tgz",
      "integrity": "sha512-T0NIuQpnTvFDATNuHN5roPwSBG83rFsuO+MXXH9/3N1eFbn4wcPjttvjMLEPWJ0RGUYgQE7cGgS3tNxbqCGM7g==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/diff-sequences": {
      "version": "29.6.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/diff-sequences/-/diff-sequences-29.6.3.tgz",
      "integrity": "sha512-EjePK1srD3P08o2j4f0ExnylqRs5B9tJjcp9t1krH2qRi8CCdsYfwe9JgSLurFBWwq4uOlipzfk5fHNvwFKr8Q==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/dns-packet": {
      "version": "5.6.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/dns-packet/-/dns-packet-5.6.1.tgz",
      "integrity": "sha512-l4gcSouhcgIKRvyy99RNVOgxXiicE+2jZoNmaNmZ6JXiGajBOJAesk1OBlJuM5k2c+eudGdLxDqXuPCKIj6kpw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@leichtgewicht/ip-codec": "^2.0.1"
      },
      "engines": {
        "node": ">=6"
      }
    },
    "node_modules/dom-serializer": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/dom-serializer/-/dom-serializer-2.0.0.tgz",
      "integrity": "sha512-wIkAryiqt/nV5EQKqQpo3SToSOV9J0DnbJqwK7Wv/Trc92zIAYZ4FlMu+JPFW1DfGFt81ZTCGgDEabffXeLyJg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "domelementtype": "^2.3.0",
        "domhandler": "^5.0.2",
        "entities": "^4.2.0"
      },
      "funding": {
        "url": "https://github.com/cheeriojs/dom-serializer?sponsor=1"
      }
    },
    "node_modules/domelementtype": {
      "version": "2.3.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/domelementtype/-/domelementtype-2.3.0.tgz",
      "integrity": "sha512-OLETBj6w0OsagBwdXnPdN0cnMfF9opN69co+7ZrbfPGrdpPVNBUj02spi6B1N7wChLQiPn4CSH/zJvXw56gmHw==",
      "dev": true,
      "funding": [
        {
          "type": "github",
          "url": "https://github.com/sponsors/fb55"
        }
      ],
      "license": "BSD-2-Clause"
    },
    "node_modules/domexception": {
      "version": "4.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/domexception/-/domexception-4.0.0.tgz",
      "integrity": "sha512-A2is4PLG+eeSfoTMA95/s4pvAoSo2mKtiM5jlHkAVewmiO8ISFTFKZjH7UAM1Atli/OT/7JHOrJRJiMKUZKYBw==",
      "deprecated": "Use your platform's native DOMException instead",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "webidl-conversions": "^7.0.0"
      },
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/domhandler": {
      "version": "5.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/domhandler/-/domhandler-5.0.3.tgz",
      "integrity": "sha512-cgwlv/1iFQiFnU96XXgROh8xTeetsnJiDsTc7TYCLFd9+/WNkIqPTxiM/8pSd8VIrhXGTf1Ny1q1hquVqDJB5w==",
      "dev": true,
      "license": "BSD-2-Clause",
      "dependencies": {
        "domelementtype": "^2.3.0"
      },
      "engines": {
        "node": ">= 4"
      },
      "funding": {
        "url": "https://github.com/fb55/domhandler?sponsor=1"
      }
    },
    "node_modules/dompurify": {
      "version": "3.3.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/dompurify/-/dompurify-3.3.3.tgz",
      "integrity": "sha512-Oj6pzI2+RqBfFG+qOaOLbFXLQ90ARpcGG6UePL82bJLtdsa6CYJD7nmiU8MW9nQNOtCHV3lZ/Bzq1X0QYbBZCA==",
      "license": "(MPL-2.0 OR Apache-2.0)",
      "optional": true,
      "optionalDependencies": {
        "@types/trusted-types": "^2.0.7"
      }
    },
    "node_modules/domutils": {
      "version": "3.2.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/domutils/-/domutils-3.2.2.tgz",
      "integrity": "sha512-6kZKyUajlDuqlHKVX1w7gyslj9MPIXzIFiz/rGu35uC1wMi+kMhQwGhl4lt9unC9Vb9INnY9Z3/ZA3+FhASLaw==",
      "dev": true,
      "license": "BSD-2-Clause",
      "dependencies": {
        "dom-serializer": "^2.0.0",
        "domelementtype": "^2.3.0",
        "domhandler": "^5.0.3"
      },
      "funding": {
        "url": "https://github.com/fb55/domutils?sponsor=1"
      }
    },
    "node_modules/dunder-proto": {
      "version": "1.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/dunder-proto/-/dunder-proto-1.0.1.tgz",
      "integrity": "sha512-KIN/nDJBQRcXw0MLVhZE9iQHmG68qAVIBg9CqmUYjmQIhgij9U5MFvrqkUL5FbtyyzZuOeOt0zdeRe4UY7ct+A==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "call-bind-apply-helpers": "^1.0.1",
        "es-errors": "^1.3.0",
        "gopd": "^1.2.0"
      },
      "engines": {
        "node": ">= 0.4"
      }
    },
    "node_modules/eastasianwidth": {
      "version": "0.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/eastasianwidth/-/eastasianwidth-0.2.0.tgz",
      "integrity": "sha512-I88TYZWc9XiYHRQ4/3c5rjjfgkjhLyW2luGIheGERbNQ6OY7yTybanSpDXZa8y7VUP9YmDcYa+eyq4ca7iLqWA==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/ee-first": {
      "version": "1.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ee-first/-/ee-first-1.1.1.tgz",
      "integrity": "sha512-WMwm9LhRUo+WUaRN+vRuETqG89IgZphVSNkdFgeb6sS/E4OrDIN7t48CAewSHXc6C8lefD8KKfr5vY61brQlow==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/electron-to-chromium": {
      "version": "1.5.328",
      "resolved": "http://binario.caixa:8081/repository/npm-all/electron-to-chromium/-/electron-to-chromium-1.5.328.tgz",
      "integrity": "sha512-QNQ5l45DzYytThO21403XN3FvK0hOkWDG8viNf6jqS42msJ8I4tGDSpBCgvDRRPnkffafiwAym2X2eHeGD2V0w==",
      "license": "ISC"
    },
    "node_modules/emittery": {
      "version": "0.13.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/emittery/-/emittery-0.13.1.tgz",
      "integrity": "sha512-DeWwawk6r5yR9jFgnDKYt4sLS0LmHJJi3ZOnb5/JdbYwj3nW+FxQnHIjhBKz8YLC7oRNPVM9NQ47I3CVx34eqQ==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=12"
      },
      "funding": {
        "url": "https://github.com/sindresorhus/emittery?sponsor=1"
      }
    },
    "node_modules/emoji-regex": {
      "version": "10.6.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/emoji-regex/-/emoji-regex-10.6.0.tgz",
      "integrity": "sha512-toUI84YS5YmxW219erniWD0CIVOo46xGKColeNQRgOzDorgBi1v4D71/OFzgD9GO2UGKIv1C3Sp8DAn0+j5w7A==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/emoji-toolkit": {
      "version": "9.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/emoji-toolkit/-/emoji-toolkit-9.0.1.tgz",
      "integrity": "sha512-sMMNqKNLVHXJfIKoPbrRJwtYuysVNC9GlKetr72zE3SSVbHqoeDLWVrxP0uM0AE0qvdl3hbUk+tJhhwXZrDHaw==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/emojis-list": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/emojis-list/-/emojis-list-3.0.0.tgz",
      "integrity": "sha512-/kyM18EfinwXZbno9FyUGeFh87KC8HRQBQGildHZbEuRyWFOmv1U10o9BBp8XVZDVNNuQKyIGIu5ZYAAXJ0V2Q==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 4"
      }
    },
    "node_modules/encodeurl": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/encodeurl/-/encodeurl-2.0.0.tgz",
      "integrity": "sha512-Q0n9HRi4m6JuGIV1eFlmvJB7ZEVxu93IrMyiMsGC0lrMJMWzRgx6WGquyfQgZVb31vhGgXnfmPNNXmxnOkRBrg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.8"
      }
    },
    "node_modules/encoding": {
      "version": "0.1.13",
      "resolved": "http://binario.caixa:8081/repository/npm-all/encoding/-/encoding-0.1.13.tgz",
      "integrity": "sha512-ETBauow1T35Y/WZMkio9jiM0Z5xjHHmJ4XmjZOq1l/dXz3lr2sRn87nJy20RupqSh1F2m3HHPSp8ShIPQJrJ3A==",
      "dev": true,
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "iconv-lite": "^0.6.2"
      }
    },
    "node_modules/encoding/node_modules/iconv-lite": {
      "version": "0.6.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/iconv-lite/-/iconv-lite-0.6.3.tgz",
      "integrity": "sha512-4fCk79wshMdzMp2rH06qWrJE4iolqLhCUH+OiuIgU++RB0+94NlDL81atO7GX55uUKueo0txHNtvEyI6D7WdMw==",
      "dev": true,
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "safer-buffer": ">= 2.1.2 < 3.0.0"
      },
      "engines": {
        "node": ">=0.10.0"
      }
    },
    "node_modules/enhanced-resolve": {
      "version": "5.20.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/enhanced-resolve/-/enhanced-resolve-5.20.1.tgz",
      "integrity": "sha512-Qohcme7V1inbAfvjItgw0EaxVX5q2rdVEZHRBrEQdRZTssLDGsL8Lwrznl8oQ/6kuTJONLaDcGjkNP247XEhcA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "graceful-fs": "^4.2.4",
        "tapable": "^2.3.0"
      },
      "engines": {
        "node": ">=10.13.0"
      }
    },
    "node_modules/entities": {
      "version": "4.5.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/entities/-/entities-4.5.0.tgz",
      "integrity": "sha512-V0hjH4dGPh9Ao5p0MoRY6BVqtwCjhz6vI5LT8AJ55H+4g9/4vbHx1I54fS0XuclLhDHArPQCiMjDxjaL8fPxhw==",
      "dev": true,
      "license": "BSD-2-Clause",
      "engines": {
        "node": ">=0.12"
      },
      "funding": {
        "url": "https://github.com/fb55/entities?sponsor=1"
      }
    },
    "node_modules/env-paths": {
      "version": "2.2.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/env-paths/-/env-paths-2.2.1.tgz",
      "integrity": "sha512-+h1lkLKhZMTYjog1VEpJNG7NZJWcuc2DDk/qsqSTRRCOXiLjeQ1d1/udrUGhqMxUgAlwKNZ0cf2uqan5GLuS2A==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=6"
      }
    },
    "node_modules/environment": {
      "version": "1.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/environment/-/environment-1.1.0.tgz",
      "integrity": "sha512-xUtoPkMggbz0MPyPiIWr1Kp4aeWJjDZ6SMvURhimjdZgsRuDplF5/s9hcgGhyXMhs+6vpnuoiZ2kFiu3FMnS8Q==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=18"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/err-code": {
      "version": "2.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/err-code/-/err-code-2.0.3.tgz",
      "integrity": "sha512-2bmlRpNKBxT/CRmPOlyISQpNj+qSeYvcym/uT0Jx2bMOlKLtSy1ZmLuVxSEKKyor/N5yhvp/ZiG1oE3DEYMSFA==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/errno": {
      "version": "0.1.8",
      "resolved": "http://binario.caixa:8081/repository/npm-all/errno/-/errno-0.1.8.tgz",
      "integrity": "sha512-dJ6oBr5SQ1VSd9qkk7ByRgb/1SH4JZjCHSW/mr63/QcXO9zLVxvJ6Oy13nio03rxpSnVDDjFor75SjVeZWPW/A==",
      "dev": true,
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "prr": "~1.0.1"
      },
      "bin": {
        "errno": "cli.js"
      }
    },
    "node_modules/error-ex": {
      "version": "1.3.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/error-ex/-/error-ex-1.3.4.tgz",
      "integrity": "sha512-sqQamAnR14VgCr1A618A3sGrygcpK+HEbenA/HiEAkkUwcZIIB/tgWqHFxWgOyDh4nB4JCRimh79dR5Ywc9MDQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "is-arrayish": "^0.2.1"
      }
    },
    "node_modules/es-define-property": {
      "version": "1.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/es-define-property/-/es-define-property-1.0.1.tgz",
      "integrity": "sha512-e3nRfgfUZ4rNGL232gUgX06QNyyez04KdjFrF+LTRoOXmrOgFKDg4BCdsjW8EnT69eqdYGmRpJwiPVYNrCaW3g==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.4"
      }
    },
    "node_modules/es-errors": {
      "version": "1.3.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/es-errors/-/es-errors-1.3.0.tgz",
      "integrity": "sha512-Zf5H2Kxt2xjTvbJvP2ZWLEICxA6j+hAmMzIlypy4xcBg1vKVnx89Wy0GbS+kf5cwCVFFzdCFh2XSCFNULS6csw==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.4"
      }
    },
    "node_modules/es-module-lexer": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/es-module-lexer/-/es-module-lexer-2.0.0.tgz",
      "integrity": "sha512-5POEcUuZybH7IdmGsD8wlf0AI55wMecM9rVBTI/qEAy2c1kTOm3DjFYjrBdI2K3BaJjJYfYFeRtM0t9ssnRuxw==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/es-object-atoms": {
      "version": "1.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/es-object-atoms/-/es-object-atoms-1.1.1.tgz",
      "integrity": "sha512-FGgH2h8zKNim9ljj7dankFPcICIK9Cp5bm+c2gQSYePhpaG5+esrLODihIorn+Pe6FGJzWhXQotPv73jTaldXA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "es-errors": "^1.3.0"
      },
      "engines": {
        "node": ">= 0.4"
      }
    },
    "node_modules/es-set-tostringtag": {
      "version": "2.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/es-set-tostringtag/-/es-set-tostringtag-2.1.0.tgz",
      "integrity": "sha512-j6vWzfrGVfyXxge+O0x5sh6cvxAog0a/4Rdd2K36zCMV5eJ+/+tOAngRO8cODMNWbVRdVlmGZQL2YS3yR8bIUA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "es-errors": "^1.3.0",
        "get-intrinsic": "^1.2.6",
        "has-tostringtag": "^1.0.2",
        "hasown": "^2.0.2"
      },
      "engines": {
        "node": ">= 0.4"
      }
    },
    "node_modules/esbuild": {
      "version": "0.25.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/esbuild/-/esbuild-0.25.4.tgz",
      "integrity": "sha512-8pgjLUcUjcgDg+2Q4NYXnPbo/vncAY4UmyaCm0jZevERqCHZIaWwdJHkf8XQtu4AxSKCdvrUbT0XUr1IdZzI8Q==",
      "dev": true,
      "hasInstallScript": true,
      "license": "MIT",
      "bin": {
        "esbuild": "bin/esbuild"
      },
      "engines": {
        "node": ">=18"
      },
      "optionalDependencies": {
        "@esbuild/aix-ppc64": "0.25.4",
        "@esbuild/android-arm": "0.25.4",
        "@esbuild/android-arm64": "0.25.4",
        "@esbuild/android-x64": "0.25.4",
        "@esbuild/darwin-arm64": "0.25.4",
        "@esbuild/darwin-x64": "0.25.4",
        "@esbuild/freebsd-arm64": "0.25.4",
        "@esbuild/freebsd-x64": "0.25.4",
        "@esbuild/linux-arm": "0.25.4",
        "@esbuild/linux-arm64": "0.25.4",
        "@esbuild/linux-ia32": "0.25.4",
        "@esbuild/linux-loong64": "0.25.4",
        "@esbuild/linux-mips64el": "0.25.4",
        "@esbuild/linux-ppc64": "0.25.4",
        "@esbuild/linux-riscv64": "0.25.4",
        "@esbuild/linux-s390x": "0.25.4",
        "@esbuild/linux-x64": "0.25.4",
        "@esbuild/netbsd-arm64": "0.25.4",
        "@esbuild/netbsd-x64": "0.25.4",
        "@esbuild/openbsd-arm64": "0.25.4",
        "@esbuild/openbsd-x64": "0.25.4",
        "@esbuild/sunos-x64": "0.25.4",
        "@esbuild/win32-arm64": "0.25.4",
        "@esbuild/win32-ia32": "0.25.4",
        "@esbuild/win32-x64": "0.25.4"
      }
    },
    "node_modules/esbuild-wasm": {
      "version": "0.25.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/esbuild-wasm/-/esbuild-wasm-0.25.4.tgz",
      "integrity": "sha512-2HlCS6rNvKWaSKhWaG/YIyRsTsL3gUrMP2ToZMBIjw9LM7vVcIs+rz8kE2vExvTJgvM8OKPqNpcHawY/BQc/qQ==",
      "dev": true,
      "license": "MIT",
      "bin": {
        "esbuild": "bin/esbuild"
      },
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/escalade": {
      "version": "3.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/escalade/-/escalade-3.2.0.tgz",
      "integrity": "sha512-WUj2qlxaQtO4g6Pq5c29GTcWGDyd8itL8zTlipgECz3JesAiiOKotd8JU6otB3PACgG6xkJUyVhboMS+bje/jA==",
      "license": "MIT",
      "engines": {
        "node": ">=6"
      }
    },
    "node_modules/escape-html": {
      "version": "1.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/escape-html/-/escape-html-1.0.3.tgz",
      "integrity": "sha512-NiSupZ4OeuGwr68lGIeym/ksIZMJodUGOSCZ/FSnTxcrekbvqrgdUxlJOMpijaKZVjAJrWrGs/6Jy8OMuyj9ow==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/escape-string-regexp": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/escape-string-regexp/-/escape-string-regexp-2.0.0.tgz",
      "integrity": "sha512-UpzcLCXolUWcNu5HtVMHYdXJjArjsF9C0aNnquZYY4uW/Vu0miy5YoWvbV345HauVvcAUnpRuhMMcqTcGOY2+w==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/escodegen": {
      "version": "2.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/escodegen/-/escodegen-2.1.0.tgz",
      "integrity": "sha512-2NlIDTwUWJN0mRPQOdtQBzbUHvdGY2P1VXSyU83Q3xKxM7WHX2Ql8dKq782Q9TgQUNOLEzEYu9bzLNj1q88I5w==",
      "dev": true,
      "license": "BSD-2-Clause",
      "dependencies": {
        "esprima": "^4.0.1",
        "estraverse": "^5.2.0",
        "esutils": "^2.0.2"
      },
      "bin": {
        "escodegen": "bin/escodegen.js",
        "esgenerate": "bin/esgenerate.js"
      },
      "engines": {
        "node": ">=6.0"
      },
      "optionalDependencies": {
        "source-map": "~0.6.1"
      }
    },
    "node_modules/escodegen/node_modules/source-map": {
      "version": "0.6.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/source-map/-/source-map-0.6.1.tgz",
      "integrity": "sha512-UjgapumWlbMhkBgzT7Ykc5YXUT46F0iKu8SGXq0bcwP5dz/h0Plj6enJqjz1Zbq2l5WaqYnrVbwWOWMyF3F47g==",
      "dev": true,
      "license": "BSD-3-Clause",
      "optional": true,
      "engines": {
        "node": ">=0.10.0"
      }
    },
    "node_modules/eslint-scope": {
      "version": "5.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/eslint-scope/-/eslint-scope-5.1.1.tgz",
      "integrity": "sha512-2NxwbF/hZ0KpepYN0cNbo+FN6XoK7GaHlQhgx/hIZl6Va0bF45RQOOwhLIy8lQDbuCiadSLCBnH2CFYquit5bw==",
      "dev": true,
      "license": "BSD-2-Clause",
      "dependencies": {
        "esrecurse": "^4.3.0",
        "estraverse": "^4.1.1"
      },
      "engines": {
        "node": ">=8.0.0"
      }
    },
    "node_modules/eslint-scope/node_modules/estraverse": {
      "version": "4.3.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/estraverse/-/estraverse-4.3.0.tgz",
      "integrity": "sha512-39nnKffWz8xN1BU/2c79n9nB9HDzo0niYUqx6xyqUnyoAnQyyWpOTdZEeiCch8BBu515t4wp9ZmgVfVhn9EBpw==",
      "dev": true,
      "license": "BSD-2-Clause",
      "engines": {
        "node": ">=4.0"
      }
    },
    "node_modules/esprima": {
      "version": "4.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/esprima/-/esprima-4.0.1.tgz",
      "integrity": "sha512-eGuFFw7Upda+g4p+QHvnW0RyTX/SVeJBDM/gCtMARO0cLuT2HcEKnTPvhjV6aGeqrCB/sbNop0Kszm0jsaWU4A==",
      "dev": true,
      "license": "BSD-2-Clause",
      "bin": {
        "esparse": "bin/esparse.js",
        "esvalidate": "bin/esvalidate.js"
      },
      "engines": {
        "node": ">=4"
      }
    },
    "node_modules/esrecurse": {
      "version": "4.3.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/esrecurse/-/esrecurse-4.3.0.tgz",
      "integrity": "sha512-KmfKL3b6G+RXvP8N1vr3Tq1kL/oCFgn2NYXEtqP8/L3pKapUA4G8cFVaoF3SU323CD4XypR/ffioHmkti6/Tag==",
      "dev": true,
      "license": "BSD-2-Clause",
      "dependencies": {
        "estraverse": "^5.2.0"
      },
      "engines": {
        "node": ">=4.0"
      }
    },
    "node_modules/estraverse": {
      "version": "5.3.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/estraverse/-/estraverse-5.3.0.tgz",
      "integrity": "sha512-MMdARuVEQziNTeJD8DgMqmhwR11BRQ/cBP+pLtYdSTnf3MIO8fFeiINEbX36ZdNlfU/7A9f3gUw49B3oQsvwBA==",
      "dev": true,
      "license": "BSD-2-Clause",
      "engines": {
        "node": ">=4.0"
      }
    },
    "node_modules/esutils": {
      "version": "2.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/esutils/-/esutils-2.0.3.tgz",
      "integrity": "sha512-kVscqXk4OCp68SZ0dkgEKVi6/8ij300KBWTJq32P/dYeWTSwK41WyTxalN1eRmA5Z9UU/LX9D7FWSmV9SAYx6g==",
      "dev": true,
      "license": "BSD-2-Clause",
      "engines": {
        "node": ">=0.10.0"
      }
    },
    "node_modules/etag": {
      "version": "1.8.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/etag/-/etag-1.8.1.tgz",
      "integrity": "sha512-aIL5Fx7mawVa300al2BnEE4iNvo1qETxLrPI/o05L7z6go7fCw1J6EQmbK4FmJ2AS7kgVF/KEZWufBfdClMcPg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.6"
      }
    },
    "node_modules/eventemitter3": {
      "version": "4.0.7",
      "resolved": "http://binario.caixa:8081/repository/npm-all/eventemitter3/-/eventemitter3-4.0.7.tgz",
      "integrity": "sha512-8guHBZCwKnFhYdHr2ysuRWErTwhoN2X8XELRlrRwpmfeY2jjuUN4taQMsULKUVo1K4DvZl+0pgfyoysHxvmvEw==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/events": {
      "version": "3.3.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/events/-/events-3.3.0.tgz",
      "integrity": "sha512-mQw+2fkQbALzQ7V0MY0IqdnXNOeTtP4r0lN9z7AAawCXgqea7bDii20AYrIBrFd/Hx0M2Ocz6S111CaFkUcb0Q==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=0.8.x"
      }
    },
    "node_modules/execa": {
      "version": "5.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/execa/-/execa-5.1.1.tgz",
      "integrity": "sha512-8uSpZZocAZRBAPIEINJj3Lo9HyGitllczc27Eh5YYojjMFMn8yHMDMaUHE2Jqfq05D/wucwI4JGURyXt1vchyg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "cross-spawn": "^7.0.3",
        "get-stream": "^6.0.0",
        "human-signals": "^2.1.0",
        "is-stream": "^2.0.0",
        "merge-stream": "^2.0.0",
        "npm-run-path": "^4.0.1",
        "onetime": "^5.1.2",
        "signal-exit": "^3.0.3",
        "strip-final-newline": "^2.0.0"
      },
      "engines": {
        "node": ">=10"
      },
      "funding": {
        "url": "https://github.com/sindresorhus/execa?sponsor=1"
      }
    },
    "node_modules/execa/node_modules/signal-exit": {
      "version": "3.0.7",
      "resolved": "http://binario.caixa:8081/repository/npm-all/signal-exit/-/signal-exit-3.0.7.tgz",
      "integrity": "sha512-wnD2ZE+l+SPC/uoS0vXeE9L1+0wuaMqKlfz9AMUo38JsyLSBWSFcHR1Rri62LZc12vLr1gb3jl7iwQhgwpAbGQ==",
      "dev": true,
      "license": "ISC"
    },
    "node_modules/exit": {
      "version": "0.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/exit/-/exit-0.1.2.tgz",
      "integrity": "sha512-Zk/eNKV2zbjpKzrsQ+n1G6poVbErQxJ0LBOJXaKZ1EViLzH+hrLu9cdXI4zw9dBQJslwBEpbQ2P1oS7nDxs6jQ==",
      "dev": true,
      "engines": {
        "node": ">= 0.8.0"
      }
    },
    "node_modules/expect": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/expect/-/expect-29.7.0.tgz",
      "integrity": "sha512-2Zks0hf1VLFYI1kbh0I5jP3KHHyCHpkfyHBzsSXRFgl/Bg9mWYfMW8oD+PdMPlEwy5HNsR9JutYy6pMeOh61nw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@jest/expect-utils": "^29.7.0",
        "jest-get-type": "^29.6.3",
        "jest-matcher-utils": "^29.7.0",
        "jest-message-util": "^29.7.0",
        "jest-util": "^29.7.0"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/exponential-backoff": {
      "version": "3.1.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/exponential-backoff/-/exponential-backoff-3.1.3.tgz",
      "integrity": "sha512-ZgEeZXj30q+I0EN+CbSSpIyPaJ5HVQD18Z1m+u1FXbAeT94mr1zw50q4q6jiiC447Nl/YTcIYSAftiGqetwXCA==",
      "dev": true,
      "license": "Apache-2.0"
    },
    "node_modules/express": {
      "version": "4.22.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/express/-/express-4.22.1.tgz",
      "integrity": "sha512-F2X8g9P1X7uCPZMA3MVf9wcTqlyNp7IhH5qPCI0izhaOIYXaW9L535tGA3qmjRzpH+bZczqq7hVKxTR4NWnu+g==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "accepts": "~1.3.8",
        "array-flatten": "1.1.1",
        "body-parser": "~1.20.3",
        "content-disposition": "~0.5.4",
        "content-type": "~1.0.4",
        "cookie": "~0.7.1",
        "cookie-signature": "~1.0.6",
        "debug": "2.6.9",
        "depd": "2.0.0",
        "encodeurl": "~2.0.0",
        "escape-html": "~1.0.3",
        "etag": "~1.8.1",
        "finalhandler": "~1.3.1",
        "fresh": "~0.5.2",
        "http-errors": "~2.0.0",
        "merge-descriptors": "1.0.3",
        "methods": "~1.1.2",
        "on-finished": "~2.4.1",
        "parseurl": "~1.3.3",
        "path-to-regexp": "~0.1.12",
        "proxy-addr": "~2.0.7",
        "qs": "~6.14.0",
        "range-parser": "~1.2.1",
        "safe-buffer": "5.2.1",
        "send": "~0.19.0",
        "serve-static": "~1.16.2",
        "setprototypeof": "1.2.0",
        "statuses": "~2.0.1",
        "type-is": "~1.6.18",
        "utils-merge": "1.0.1",
        "vary": "~1.1.2"
      },
      "engines": {
        "node": ">= 0.10.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/express"
      }
    },
    "node_modules/express/node_modules/debug": {
      "version": "2.6.9",
      "resolved": "http://binario.caixa:8081/repository/npm-all/debug/-/debug-2.6.9.tgz",
      "integrity": "sha512-bC7ElrdJaJnPbAP+1EotYvqZsb3ecl5wi6Bfi6BJTUcNowp6cvspg0jXznRTKDjm/E7AdgFBVeAPVMNcKGsHMA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "ms": "2.0.0"
      }
    },
    "node_modules/express/node_modules/ms": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ms/-/ms-2.0.0.tgz",
      "integrity": "sha512-Tpp60P6IUJDTuOq/5Z8cdskzJujfwqfOTkrwIwj7IRISpnkJnT6SyJ4PCPnGMoFjC9ddhal5KVIYtAt97ix05A==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/fast-deep-equal": {
      "version": "3.1.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/fast-deep-equal/-/fast-deep-equal-3.1.3.tgz",
      "integrity": "sha512-f3qQ9oQy9j2AhBe/H9VC91wLmKBCCU/gDOnKNAYG5hswO7BLKj09Hc5HYNz9cGI++xlpDCIgDaitVs03ATR84Q==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/fast-diff": {
      "version": "1.3.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/fast-diff/-/fast-diff-1.3.0.tgz",
      "integrity": "sha512-VxPP4NqbUjj6MaAOafWeUn2cXWLcCtljklUtZf0Ind4XQ+QPtmA0b18zZy0jIQx+ExRVCR/ZQpBmik5lXshNsw==",
      "license": "Apache-2.0"
    },
    "node_modules/fast-glob": {
      "version": "3.3.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/fast-glob/-/fast-glob-3.3.3.tgz",
      "integrity": "sha512-7MptL8U0cqcFdzIzwOTHoilX9x5BrNqye7Z/LuC7kCMRio1EMSyqRK3BEAUD7sXRq4iT4AzTVuZdhgQ2TCvYLg==",
      "license": "MIT",
      "dependencies": {
        "@nodelib/fs.stat": "^2.0.2",
        "@nodelib/fs.walk": "^1.2.3",
        "glob-parent": "^5.1.2",
        "merge2": "^1.3.0",
        "micromatch": "^4.0.8"
      },
      "engines": {
        "node": ">=8.6.0"
      }
    },
    "node_modules/fast-glob/node_modules/glob-parent": {
      "version": "5.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/glob-parent/-/glob-parent-5.1.2.tgz",
      "integrity": "sha512-AOIgSQCepiJYwP3ARnGx+5VnTu2HBYdzbGP45eLw1vr3zB3vZLeyed1sC9hnbcOc9/SrMyM5RPQrkGz4aS9Zow==",
      "license": "ISC",
      "dependencies": {
        "is-glob": "^4.0.1"
      },
      "engines": {
        "node": ">= 6"
      }
    },
    "node_modules/fast-json-stable-stringify": {
      "version": "2.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/fast-json-stable-stringify/-/fast-json-stable-stringify-2.1.0.tgz",
      "integrity": "sha512-lhd/wF+Lk98HZoTCtlVraHtfh5XYijIjalXck7saUtuanSDyLMxnHhSXEDJqHxD7msR8D0uCmqlkwjCV8xvwHw==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/fast-uri": {
      "version": "3.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/fast-uri/-/fast-uri-3.1.0.tgz",
      "integrity": "sha512-iPeeDKJSWf4IEOasVVrknXpaBV0IApz/gp7S2bb7Z4Lljbl2MGJRqInZiUrQwV16cpzw/D3S5j5Julj/gT52AA==",
      "dev": true,
      "funding": [
        {
          "type": "github",
          "url": "https://github.com/sponsors/fastify"
        },
        {
          "type": "opencollective",
          "url": "https://opencollective.com/fastify"
        }
      ],
      "license": "BSD-3-Clause"
    },
    "node_modules/fastq": {
      "version": "1.20.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/fastq/-/fastq-1.20.1.tgz",
      "integrity": "sha512-GGToxJ/w1x32s/D2EKND7kTil4n8OVk/9mycTc4VDza13lOvpUZTGX3mFSCtV9ksdGBVzvsyAVLM6mHFThxXxw==",
      "license": "ISC",
      "dependencies": {
        "reusify": "^1.0.4"
      }
    },
    "node_modules/faye-websocket": {
      "version": "0.11.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/faye-websocket/-/faye-websocket-0.11.4.tgz",
      "integrity": "sha512-CzbClwlXAuiRQAlUyfqPgvPoNKTckTPGfwZV4ZdAhVcP2lh9KUxJg2b5GkE7XbjKQ3YJnQ9z6D9ntLAlB+tP8g==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "websocket-driver": ">=0.5.1"
      },
      "engines": {
        "node": ">=0.8.0"
      }
    },
    "node_modules/fb-watchman": {
      "version": "2.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/fb-watchman/-/fb-watchman-2.0.2.tgz",
      "integrity": "sha512-p5161BqbuCaSnB8jIbzQHOlpgsPmK5rJVDfDKO91Axs5NC1uu3HRQm6wt9cd9/+GtQQIO53JdGXXoyDpTAsgYA==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "bser": "2.1.1"
      }
    },
    "node_modules/fdir": {
      "version": "6.5.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/fdir/-/fdir-6.5.0.tgz",
      "integrity": "sha512-tIbYtZbucOs0BRGqPJkshJUYdL+SDH7dVM8gjy+ERp3WAUjLEFJE+02kanyHtwjWOnwrKYBiwAmM0p4kLJAnXg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=12.0.0"
      },
      "peerDependencies": {
        "picomatch": "^3 || ^4"
      },
      "peerDependenciesMeta": {
        "picomatch": {
          "optional": true
        }
      }
    },
    "node_modules/fill-range": {
      "version": "7.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/fill-range/-/fill-range-7.1.1.tgz",
      "integrity": "sha512-YsGpe3WHLK8ZYi4tWDg2Jy3ebRz2rXowDxnld4bkQB00cc/1Zw9AWnC0i9ztDJitivtQvaI9KaLyKrc+hBW0yg==",
      "license": "MIT",
      "dependencies": {
        "to-regex-range": "^5.0.1"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/finalhandler": {
      "version": "1.3.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/finalhandler/-/finalhandler-1.3.2.tgz",
      "integrity": "sha512-aA4RyPcd3badbdABGDuTXCMTtOneUCAYH/gxoYRTZlIJdF0YPWuGqiAsIrhNnnqdXGswYk6dGujem4w80UJFhg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "debug": "2.6.9",
        "encodeurl": "~2.0.0",
        "escape-html": "~1.0.3",
        "on-finished": "~2.4.1",
        "parseurl": "~1.3.3",
        "statuses": "~2.0.2",
        "unpipe": "~1.0.0"
      },
      "engines": {
        "node": ">= 0.8"
      }
    },
    "node_modules/finalhandler/node_modules/debug": {
      "version": "2.6.9",
      "resolved": "http://binario.caixa:8081/repository/npm-all/debug/-/debug-2.6.9.tgz",
      "integrity": "sha512-bC7ElrdJaJnPbAP+1EotYvqZsb3ecl5wi6Bfi6BJTUcNowp6cvspg0jXznRTKDjm/E7AdgFBVeAPVMNcKGsHMA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "ms": "2.0.0"
      }
    },
    "node_modules/finalhandler/node_modules/ms": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ms/-/ms-2.0.0.tgz",
      "integrity": "sha512-Tpp60P6IUJDTuOq/5Z8cdskzJujfwqfOTkrwIwj7IRISpnkJnT6SyJ4PCPnGMoFjC9ddhal5KVIYtAt97ix05A==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/find-cache-dir": {
      "version": "4.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/find-cache-dir/-/find-cache-dir-4.0.0.tgz",
      "integrity": "sha512-9ZonPT4ZAK4a+1pUPVPZJapbi7O5qbbJPdYw/NOQWZZbVLdDTYM3A4R9z/DpAM08IDaFGsvPgiGZ82WEwUDWjg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "common-path-prefix": "^3.0.0",
        "pkg-dir": "^7.0.0"
      },
      "engines": {
        "node": ">=14.16"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/find-up": {
      "version": "4.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/find-up/-/find-up-4.1.0.tgz",
      "integrity": "sha512-PpOwAdQ/YlXQ2vj8a3h8IipDuYRi3wceVQQGYWxNINccq40Anw7BlsEXCMbt1Zt+OLA6Fq9suIpIWD0OsnISlw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "locate-path": "^5.0.0",
        "path-exists": "^4.0.0"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/flat": {
      "version": "5.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/flat/-/flat-5.0.2.tgz",
      "integrity": "sha512-b6suED+5/3rTpUBdG1gupIl8MPFCAMA0QXwmljLhvCUKcUvdE4gWky9zpuGCcXHOsz4J9wPGNWq6OKpmIzz3hQ==",
      "dev": true,
      "license": "BSD-3-Clause",
      "bin": {
        "flat": "cli.js"
      }
    },
    "node_modules/follow-redirects": {
      "version": "1.15.11",
      "resolved": "http://binario.caixa:8081/repository/npm-all/follow-redirects/-/follow-redirects-1.15.11.tgz",
      "integrity": "sha512-deG2P0JfjrTxl50XGCDyfI97ZGVCxIpfKYmfyrQ54n5FO/0gfIES8C/Psl6kWVDolizcaaxZJnTS0QSMxvnsBQ==",
      "dev": true,
      "funding": [
        {
          "type": "individual",
          "url": "https://github.com/sponsors/RubenVerborgh"
        }
      ],
      "license": "MIT",
      "engines": {
        "node": ">=4.0"
      },
      "peerDependenciesMeta": {
        "debug": {
          "optional": true
        }
      }
    },
    "node_modules/foreground-child": {
      "version": "3.3.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/foreground-child/-/foreground-child-3.3.1.tgz",
      "integrity": "sha512-gIXjKqtFuWEgzFRJA9WCQeSJLZDjgJUOMCMzxtvFq/37KojM1BFGufqsCy0r4qSQmYLsZYMeyRqzIWOMup03sw==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "cross-spawn": "^7.0.6",
        "signal-exit": "^4.0.1"
      },
      "engines": {
        "node": ">=14"
      },
      "funding": {
        "url": "https://github.com/sponsors/isaacs"
      }
    },
    "node_modules/form-data": {
      "version": "4.0.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/form-data/-/form-data-4.0.5.tgz",
      "integrity": "sha512-8RipRLol37bNs2bhoV67fiTEvdTrbMUYcFTiy3+wuuOnUog2QBHCZWXDRijWQfAkhBj2Uf5UnVaiWwA5vdd82w==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "asynckit": "^0.4.0",
        "combined-stream": "^1.0.8",
        "es-set-tostringtag": "^2.1.0",
        "hasown": "^2.0.2",
        "mime-types": "^2.1.12"
      },
      "engines": {
        "node": ">= 6"
      }
    },
    "node_modules/forwarded": {
      "version": "0.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/forwarded/-/forwarded-0.2.0.tgz",
      "integrity": "sha512-buRG0fpBtRHSTCOASe6hD258tEubFoRLb4ZNA6NxMVHNw2gOcwHo9wyablzMzOA5z9xA9L1KNjk/Nt6MT9aYow==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.6"
      }
    },
    "node_modules/fraction.js": {
      "version": "4.3.7",
      "resolved": "http://binario.caixa:8081/repository/npm-all/fraction.js/-/fraction.js-4.3.7.tgz",
      "integrity": "sha512-ZsDfxO51wGAXREY55a7la9LScWpwv9RxIrYABrlvOFBlH/ShPnrtsXeuUIfXKKOVicNxQ+o8JTbJvjS4M89yew==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": "*"
      },
      "funding": {
        "type": "patreon",
        "url": "https://github.com/sponsors/rawify"
      }
    },
    "node_modules/fresh": {
      "version": "0.5.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/fresh/-/fresh-0.5.2.tgz",
      "integrity": "sha512-zJ2mQYM18rEFOudeV4GShTGIQ7RbzA7ozbU9I/XBpm7kqgMywgmylMwXHxZJmkVoYkna9d2pVXVXPdYTP9ej8Q==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.6"
      }
    },
    "node_modules/fs-minipass": {
      "version": "3.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/fs-minipass/-/fs-minipass-3.0.3.tgz",
      "integrity": "sha512-XUBA9XClHbnJWSfBzjkm6RvPsyg3sryZt06BEQoXcF7EK/xpGaQYJgQKDJSUH5SGZ76Y7pFx1QBnXz09rU5Fbw==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "minipass": "^7.0.3"
      },
      "engines": {
        "node": "^14.17.0 || ^16.13.0 || >=18.0.0"
      }
    },
    "node_modules/fs.realpath": {
      "version": "1.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/fs.realpath/-/fs.realpath-1.0.0.tgz",
      "integrity": "sha512-OO0pH2lK6a0hZnAdau5ItzHPI6pUlvI7jMVnxUQRtw4owF2wk8lOSabtGDCTP4Ggrg2MbGnWO9X8K1t4+fGMDw==",
      "dev": true,
      "license": "ISC"
    },
    "node_modules/fsevents": {
      "version": "2.3.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/fsevents/-/fsevents-2.3.3.tgz",
      "integrity": "sha512-5xoDfX+fL7faATnagmWPpbFtwh/R77WmMMqqHGS65C3vvB0YHrgF+B1YmZ3441tMj5n63k0212XNoJwzlhffQw==",
      "dev": true,
      "hasInstallScript": true,
      "license": "MIT",
      "optional": true,
      "os": [
        "darwin"
      ],
      "engines": {
        "node": "^8.16.0 || ^10.6.0 || >=11.0.0"
      }
    },
    "node_modules/function-bind": {
      "version": "1.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/function-bind/-/function-bind-1.1.2.tgz",
      "integrity": "sha512-7XHNxH7qX9xG5mIwxkhumTox/MIRNcOgDrxWsMt2pAr23WHp6MrRlN7FBSFpCpr+oVO0F744iUgR82nJMfG2SA==",
      "dev": true,
      "license": "MIT",
      "funding": {
        "url": "https://github.com/sponsors/ljharb"
      }
    },
    "node_modules/gensync": {
      "version": "1.0.0-beta.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/gensync/-/gensync-1.0.0-beta.2.tgz",
      "integrity": "sha512-3hN7NaskYvMDLQY55gnW3NQ+mesEAepTqlg+VEbj7zzqEMBVNhzcGYYeqFo/TlYz6eQiFcp1HcsCZO+nGgS8zg==",
      "license": "MIT",
      "engines": {
        "node": ">=6.9.0"
      }
    },
    "node_modules/get-caller-file": {
      "version": "2.0.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/get-caller-file/-/get-caller-file-2.0.5.tgz",
      "integrity": "sha512-DyFP3BM/3YHTQOCUL/w0OZHR0lpKeGrxotcHWcqNEdnltqFwXVfhEBQ94eIo34AfQpo0rGki4cyIiftY06h2Fg==",
      "license": "ISC",
      "engines": {
        "node": "6.* || 8.* || >= 10.*"
      }
    },
    "node_modules/get-east-asian-width": {
      "version": "1.5.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/get-east-asian-width/-/get-east-asian-width-1.5.0.tgz",
      "integrity": "sha512-CQ+bEO+Tva/qlmw24dCejulK5pMzVnUOFOijVogd3KQs07HnRIgp8TGipvCCRT06xeYEbpbgwaCxglFyiuIcmA==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=18"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/get-intrinsic": {
      "version": "1.3.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/get-intrinsic/-/get-intrinsic-1.3.0.tgz",
      "integrity": "sha512-9fSjSaos/fRIVIp+xSJlE6lfwhES7LNtKaCBIamHsjr2na1BiABJPo0mOjjz8GJDURarmCPGqaiVg5mfjb98CQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "call-bind-apply-helpers": "^1.0.2",
        "es-define-property": "^1.0.1",
        "es-errors": "^1.3.0",
        "es-object-atoms": "^1.1.1",
        "function-bind": "^1.1.2",
        "get-proto": "^1.0.1",
        "gopd": "^1.2.0",
        "has-symbols": "^1.1.0",
        "hasown": "^2.0.2",
        "math-intrinsics": "^1.1.0"
      },
      "engines": {
        "node": ">= 0.4"
      },
      "funding": {
        "url": "https://github.com/sponsors/ljharb"
      }
    },
    "node_modules/get-package-type": {
      "version": "0.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/get-package-type/-/get-package-type-0.1.0.tgz",
      "integrity": "sha512-pjzuKtY64GYfWizNAJ0fr9VqttZkNiK2iS430LtIHzjBEr6bX8Am2zm4sW4Ro5wjWW5cAlRL1qAMTcXbjNAO2Q==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8.0.0"
      }
    },
    "node_modules/get-proto": {
      "version": "1.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/get-proto/-/get-proto-1.0.1.tgz",
      "integrity": "sha512-sTSfBjoXBp89JvIKIefqw7U2CCebsc74kiY6awiGogKtoSGbgjYE/G/+l9sF3MWFPNc9IcoOC4ODfKHfxFmp0g==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "dunder-proto": "^1.0.1",
        "es-object-atoms": "^1.0.0"
      },
      "engines": {
        "node": ">= 0.4"
      }
    },
    "node_modules/get-stream": {
      "version": "6.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/get-stream/-/get-stream-6.0.1.tgz",
      "integrity": "sha512-ts6Wi+2j3jQjqi70w5AlN8DFnkSwC+MqmxEzdEALB2qXZYV3X/b1CTfgPLGJNMeAWxdPfU8FO1ms3NUfaHCPYg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=10"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/glob": {
      "version": "7.2.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/glob/-/glob-7.2.3.tgz",
      "integrity": "sha512-nFR0zLpU2YCaRxwoCJvL6UvCH2JFyFVIvwTLsIf21AuHlMskA1hhTdk+LlYJtOlYt9v6dvszD2BGRqBL+iQK9Q==",
      "deprecated": "Old versions of glob are not supported, and contain widely publicized security vulnerabilities, which have been fixed in the current version. Please update. Support for old versions may be purchased (at exorbitant rates) by contacting i@izs.me",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "fs.realpath": "^1.0.0",
        "inflight": "^1.0.4",
        "inherits": "2",
        "minimatch": "^3.1.1",
        "once": "^1.3.0",
        "path-is-absolute": "^1.0.0"
      },
      "engines": {
        "node": "*"
      },
      "funding": {
        "url": "https://github.com/sponsors/isaacs"
      }
    },
    "node_modules/glob-parent": {
      "version": "6.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/glob-parent/-/glob-parent-6.0.2.tgz",
      "integrity": "sha512-XxwI8EOhVQgWp6iDL+3b0r86f4d6AX6zSU55HfB4ydCEuXLXc5FcYeOu+nnGftS4TEju/11rt4KJPTMgbfmv4A==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "is-glob": "^4.0.3"
      },
      "engines": {
        "node": ">=10.13.0"
      }
    },
    "node_modules/glob-to-regex.js": {
      "version": "1.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/glob-to-regex.js/-/glob-to-regex.js-1.2.0.tgz",
      "integrity": "sha512-QMwlOQKU/IzqMUOAZWubUOT8Qft+Y0KQWnX9nK3ch0CJg0tTp4TvGZsTfudYKv2NzoQSyPcnA6TYeIQ3jGichQ==",
      "dev": true,
      "license": "Apache-2.0",
      "engines": {
        "node": ">=10.0"
      },
      "funding": {
        "type": "github",
        "url": "https://github.com/sponsors/streamich"
      },
      "peerDependencies": {
        "tslib": "2"
      }
    },
    "node_modules/glob-to-regexp": {
      "version": "0.4.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/glob-to-regexp/-/glob-to-regexp-0.4.1.tgz",
      "integrity": "sha512-lkX1HJXwyMcprw/5YUZc2s7DrpAiHB21/V+E1rHUrVNokkvB6bqMzT0VfV6/86ZNabt1k14YOIaT7nDvOX3Iiw==",
      "dev": true,
      "license": "BSD-2-Clause"
    },
    "node_modules/globby": {
      "version": "14.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/globby/-/globby-14.1.0.tgz",
      "integrity": "sha512-0Ia46fDOaT7k4og1PDW4YbodWWr3scS2vAr2lTbsplOt2WkKp0vQbkI9wKis/T5LV/dqPjO3bpS/z6GTJB82LA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@sindresorhus/merge-streams": "^2.1.0",
        "fast-glob": "^3.3.3",
        "ignore": "^7.0.3",
        "path-type": "^6.0.0",
        "slash": "^5.1.0",
        "unicorn-magic": "^0.3.0"
      },
      "engines": {
        "node": ">=18"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/good-listener": {
      "version": "1.2.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/good-listener/-/good-listener-1.2.2.tgz",
      "integrity": "sha512-goW1b+d9q/HIwbVYZzZ6SsTr4IgE+WA44A0GmPIQstuOrgsFcT7VEJ48nmr9GaRtNu0XTKacFLGnBPAM6Afouw==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "delegate": "^3.1.2"
      }
    },
    "node_modules/gopd": {
      "version": "1.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/gopd/-/gopd-1.2.0.tgz",
      "integrity": "sha512-ZUKRh6/kUFoAiTAtTYPZJ3hw9wNxx+BIBOijnlG9PnrJsCcSjs1wyyD6vJpaYtgnzDrKYRSqf3OO6Rfa93xsRg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.4"
      },
      "funding": {
        "url": "https://github.com/sponsors/ljharb"
      }
    },
    "node_modules/graceful-fs": {
      "version": "4.2.11",
      "resolved": "http://binario.caixa:8081/repository/npm-all/graceful-fs/-/graceful-fs-4.2.11.tgz",
      "integrity": "sha512-RbJ5/jmFcNNCcDV5o9eTnBLJ/HszWV0P73bc+Ff4nS/rJj+YaS6IGyiOL0VoBYX+l1Wrl3k63h/KrH+nhJ0XvQ==",
      "dev": true,
      "license": "ISC"
    },
    "node_modules/hachure-fill": {
      "version": "0.5.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/hachure-fill/-/hachure-fill-0.5.2.tgz",
      "integrity": "sha512-3GKBOn+m2LX9iq+JC1064cSFprJY4jL1jCXTcpnfER5HYE2l/4EfWSGzkPa/ZDBmYI0ZOEj5VHV/eKnPGkHuOg==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/handle-thing": {
      "version": "2.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/handle-thing/-/handle-thing-2.0.1.tgz",
      "integrity": "sha512-9Qn4yBxelxoh2Ow62nP+Ka/kMnOXRi8BXnRaUwezLNhqelnN49xKz4F/dPP8OYLxLxq6JDtZb2i9XznUQbNPTg==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/handlebars": {
      "version": "4.7.9",
      "resolved": "http://binario.caixa:8081/repository/npm-all/handlebars/-/handlebars-4.7.9.tgz",
      "integrity": "sha512-4E71E0rpOaQuJR2A3xDZ+GM1HyWYv1clR58tC8emQNeQe3RH7MAzSbat+V0wG78LQBo6m6bzSG/L4pBuCsgnUQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "minimist": "^1.2.5",
        "neo-async": "^2.6.2",
        "source-map": "^0.6.1",
        "wordwrap": "^1.0.0"
      },
      "bin": {
        "handlebars": "bin/handlebars"
      },
      "engines": {
        "node": ">=0.4.7"
      },
      "optionalDependencies": {
        "uglify-js": "^3.1.4"
      }
    },
    "node_modules/handlebars/node_modules/source-map": {
      "version": "0.6.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/source-map/-/source-map-0.6.1.tgz",
      "integrity": "sha512-UjgapumWlbMhkBgzT7Ykc5YXUT46F0iKu8SGXq0bcwP5dz/h0Plj6enJqjz1Zbq2l5WaqYnrVbwWOWMyF3F47g==",
      "dev": true,
      "license": "BSD-3-Clause",
      "engines": {
        "node": ">=0.10.0"
      }
    },
    "node_modules/has-flag": {
      "version": "4.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/has-flag/-/has-flag-4.0.0.tgz",
      "integrity": "sha512-EykJT/Q1KjTWctppgIAgfSO0tKVuZUjhgMr17kqTumMl6Afv3EISleU7qZUzoXDFTAHTDC4NOoG/ZxU3EvlMPQ==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/has-symbols": {
      "version": "1.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/has-symbols/-/has-symbols-1.1.0.tgz",
      "integrity": "sha512-1cDNdwJ2Jaohmb3sg4OmKaMBwuC48sYni5HUw2DvsC8LjGTLK9h+eb1X6RyuOHe4hT0ULCW68iomhjUoKUqlPQ==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.4"
      },
      "funding": {
        "url": "https://github.com/sponsors/ljharb"
      }
    },
    "node_modules/has-tostringtag": {
      "version": "1.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/has-tostringtag/-/has-tostringtag-1.0.2.tgz",
      "integrity": "sha512-NqADB8VjPFLM2V0VvHUewwwsw0ZWBaIdgo+ieHtK3hasLz4qeCRjYcqfB6AQrBggRKppKF8L52/VqdVsO47Dlw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "has-symbols": "^1.0.3"
      },
      "engines": {
        "node": ">= 0.4"
      },
      "funding": {
        "url": "https://github.com/sponsors/ljharb"
      }
    },
    "node_modules/hasown": {
      "version": "2.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/hasown/-/hasown-2.0.2.tgz",
      "integrity": "sha512-0hJU9SCPvmMzIBdZFqNPXWa6dqh7WdH0cII9y+CyS8rG3nL48Bclra9HmKhVVUHyPWNH5Y7xDwAB7bfgSjkUMQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "function-bind": "^1.1.2"
      },
      "engines": {
        "node": ">= 0.4"
      }
    },
    "node_modules/hosted-git-info": {
      "version": "8.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/hosted-git-info/-/hosted-git-info-8.1.0.tgz",
      "integrity": "sha512-Rw/B2DNQaPBICNXEm8balFz9a6WpZrkCGpcWFpy7nCj+NyhSdqXipmfvtmWt9xGfp0wZnBxB+iVpLmQMYt47Tw==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "lru-cache": "^10.0.1"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/hosted-git-info/node_modules/lru-cache": {
      "version": "10.4.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/lru-cache/-/lru-cache-10.4.3.tgz",
      "integrity": "sha512-JNAzZcXrCt42VGLuYz0zfAzDfAvJWW6AfYlDBQyDV5DClI2m5sAmK+OIO7s59XfsRsWHp02jAJrRadPRGTt6SQ==",
      "dev": true,
      "license": "ISC"
    },
    "node_modules/hpack.js": {
      "version": "2.1.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/hpack.js/-/hpack.js-2.1.6.tgz",
      "integrity": "sha512-zJxVehUdMGIKsRaNt7apO2Gqp0BdqW5yaiGHXXmbpvxgBYVZnAql+BJb4RO5ad2MgpbZKn5G6nMnegrH1FcNYQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "inherits": "^2.0.1",
        "obuf": "^1.0.0",
        "readable-stream": "^2.0.1",
        "wbuf": "^1.1.0"
      }
    },
    "node_modules/hpack.js/node_modules/readable-stream": {
      "version": "2.3.8",
      "resolved": "http://binario.caixa:8081/repository/npm-all/readable-stream/-/readable-stream-2.3.8.tgz",
      "integrity": "sha512-8p0AUk4XODgIewSi0l8Epjs+EVnWiK7NoDIEGU0HhE7+ZyY8D1IMY7odu5lRrFXGg71L15KG8QrPmum45RTtdA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "core-util-is": "~1.0.0",
        "inherits": "~2.0.3",
        "isarray": "~1.0.0",
        "process-nextick-args": "~2.0.0",
        "safe-buffer": "~5.1.1",
        "string_decoder": "~1.1.1",
        "util-deprecate": "~1.0.1"
      }
    },
    "node_modules/hpack.js/node_modules/safe-buffer": {
      "version": "5.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/safe-buffer/-/safe-buffer-5.1.2.tgz",
      "integrity": "sha512-Gd2UZBJDkXlY7GbJxfsE8/nvKkUEU1G38c1siN6QP6a9PT9MmHB8GnpscSmMJSoF8LOIrt8ud/wPtojys4G6+g==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/hpack.js/node_modules/string_decoder": {
      "version": "1.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/string_decoder/-/string_decoder-1.1.1.tgz",
      "integrity": "sha512-n/ShnvDi6FHbbVfviro+WojiFzv+s8MPMHBczVePfUpDJLwoLT0ht1l4YwBCbi8pJAveEEdnkHyPyTP/mzRfwg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "safe-buffer": "~5.1.0"
      }
    },
    "node_modules/html-encoding-sniffer": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/html-encoding-sniffer/-/html-encoding-sniffer-3.0.0.tgz",
      "integrity": "sha512-oWv4T4yJ52iKrufjnyZPkrN0CH3QnrUqdB6In1g5Fe1mia8GmF36gnfNySxoZtxD5+NmYw1EElVXiBk93UeskA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "whatwg-encoding": "^2.0.0"
      },
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/html-escaper": {
      "version": "2.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/html-escaper/-/html-escaper-2.0.2.tgz",
      "integrity": "sha512-H2iMtd0I4Mt5eYiapRdIDjp+XzelXQ0tFE4JS7YFwFevXXMmOp9myNrUvCg0D6ws8iqkRPBfKHgbwig1SmlLfg==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/htmlparser2": {
      "version": "10.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/htmlparser2/-/htmlparser2-10.1.0.tgz",
      "integrity": "sha512-VTZkM9GWRAtEpveh7MSF6SjjrpNVNNVJfFup7xTY3UpFtm67foy9HDVXneLtFVt4pMz5kZtgNcvCniNFb1hlEQ==",
      "dev": true,
      "funding": [
        "https://github.com/fb55/htmlparser2?sponsor=1",
        {
          "type": "github",
          "url": "https://github.com/sponsors/fb55"
        }
      ],
      "license": "MIT",
      "dependencies": {
        "domelementtype": "^2.3.0",
        "domhandler": "^5.0.3",
        "domutils": "^3.2.2",
        "entities": "^7.0.1"
      }
    },
    "node_modules/htmlparser2/node_modules/entities": {
      "version": "7.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/entities/-/entities-7.0.1.tgz",
      "integrity": "sha512-TWrgLOFUQTH994YUyl1yT4uyavY5nNB5muff+RtWaqNVCAK408b5ZnnbNAUEWLTCpum9w6arT70i1XdQ4UeOPA==",
      "dev": true,
      "license": "BSD-2-Clause",
      "engines": {
        "node": ">=0.12"
      },
      "funding": {
        "url": "https://github.com/fb55/entities?sponsor=1"
      }
    },
    "node_modules/http-cache-semantics": {
      "version": "4.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/http-cache-semantics/-/http-cache-semantics-4.2.0.tgz",
      "integrity": "sha512-dTxcvPXqPvXBQpq5dUr6mEMJX4oIEFv6bwom3FDwKRDsuIjjJGANqhBuoAn9c1RQJIdAKav33ED65E2ys+87QQ==",
      "dev": true,
      "license": "BSD-2-Clause"
    },
    "node_modules/http-deceiver": {
      "version": "1.2.7",
      "resolved": "http://binario.caixa:8081/repository/npm-all/http-deceiver/-/http-deceiver-1.2.7.tgz",
      "integrity": "sha512-LmpOGxTfbpgtGVxJrj5k7asXHCgNZp5nLfp+hWc8QQRqtb7fUy6kRY3BO1h9ddF6yIPYUARgxGOwB42DnxIaNw==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/http-errors": {
      "version": "2.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/http-errors/-/http-errors-2.0.1.tgz",
      "integrity": "sha512-4FbRdAX+bSdmo4AUFuS0WNiPz8NgFt+r8ThgNWmlrjQjt1Q7ZR9+zTlce2859x4KSXrwIsaeTqDoKQmtP8pLmQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "depd": "~2.0.0",
        "inherits": "~2.0.4",
        "setprototypeof": "~1.2.0",
        "statuses": "~2.0.2",
        "toidentifier": "~1.0.1"
      },
      "engines": {
        "node": ">= 0.8"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/express"
      }
    },
    "node_modules/http-parser-js": {
      "version": "0.5.10",
      "resolved": "http://binario.caixa:8081/repository/npm-all/http-parser-js/-/http-parser-js-0.5.10.tgz",
      "integrity": "sha512-Pysuw9XpUq5dVc/2SMHpuTY01RFl8fttgcyunjL7eEMhGM3cI4eOmiCycJDVCo/7O7ClfQD3SaI6ftDzqOXYMA==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/http-proxy": {
      "version": "1.18.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/http-proxy/-/http-proxy-1.18.1.tgz",
      "integrity": "sha512-7mz/721AbnJwIVbnaSv1Cz3Am0ZLT/UBwkC92VlxhXv/k/BBQfM2fXElQNC27BVGr0uwUpplYPQM9LnaBMR5NQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "eventemitter3": "^4.0.0",
        "follow-redirects": "^1.0.0",
        "requires-port": "^1.0.0"
      },
      "engines": {
        "node": ">=8.0.0"
      }
    },
    "node_modules/http-proxy-agent": {
      "version": "5.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/http-proxy-agent/-/http-proxy-agent-5.0.0.tgz",
      "integrity": "sha512-n2hY8YdoRE1i7r6M0w9DIw5GgZN0G25P8zLCRQ8rjXtTU3vsNFBI/vWK/UIeE6g5MUUz6avwAPXmL6Fy9D/90w==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@tootallnate/once": "2",
        "agent-base": "6",
        "debug": "4"
      },
      "engines": {
        "node": ">= 6"
      }
    },
    "node_modules/http-proxy-agent/node_modules/agent-base": {
      "version": "6.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/agent-base/-/agent-base-6.0.2.tgz",
      "integrity": "sha512-RZNwNclF7+MS/8bDg70amg32dyeZGZxiDuQmZxKLAlQjr3jGyLx+4Kkk58UO7D2QdgFIQCovuSuZESne6RG6XQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "debug": "4"
      },
      "engines": {
        "node": ">= 6.0.0"
      }
    },
    "node_modules/http-proxy-middleware": {
      "version": "3.0.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/http-proxy-middleware/-/http-proxy-middleware-3.0.5.tgz",
      "integrity": "sha512-GLZZm1X38BPY4lkXA01jhwxvDoOkkXqjgVyUzVxiEK4iuRu03PZoYHhHRwxnfhQMDuaxi3vVri0YgSro/1oWqg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/http-proxy": "^1.17.15",
        "debug": "^4.3.6",
        "http-proxy": "^1.18.1",
        "is-glob": "^4.0.3",
        "is-plain-object": "^5.0.0",
        "micromatch": "^4.0.8"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/https-proxy-agent": {
      "version": "7.0.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/https-proxy-agent/-/https-proxy-agent-7.0.6.tgz",
      "integrity": "sha512-vK9P5/iUfdl95AI+JVyUuIcVtd4ofvtrOr3HNtM2yxC9bnMbEdp3x01OhQNnjb8IJYi38VlTE3mBXwcfvywuSw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "agent-base": "^7.1.2",
        "debug": "4"
      },
      "engines": {
        "node": ">= 14"
      }
    },
    "node_modules/human-signals": {
      "version": "2.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/human-signals/-/human-signals-2.1.0.tgz",
      "integrity": "sha512-B4FFZ6q/T2jhhksgkbEW3HBvWIfDW85snkQgawt07S7J5QXTk6BkNV+0yAeZrM5QpMAdYlocGoljn0sJ/WQkFw==",
      "dev": true,
      "license": "Apache-2.0",
      "engines": {
        "node": ">=10.17.0"
      }
    },
    "node_modules/hyperdyperid": {
      "version": "1.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/hyperdyperid/-/hyperdyperid-1.2.0.tgz",
      "integrity": "sha512-Y93lCzHYgGWdrJ66yIktxiaGULYc6oGiABxhcO5AufBeOyoIdZF7bIfLaOrbM0iGIOXQQgxxRrFEnb+Y6w1n4A==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=10.18"
      }
    },
    "node_modules/iconv-lite": {
      "version": "0.7.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/iconv-lite/-/iconv-lite-0.7.2.tgz",
      "integrity": "sha512-im9DjEDQ55s9fL4EYzOAv0yMqmMBSZp6G0VvFyTMPKWxiSBHUj9NW/qqLmXUwXrrM7AvqSlTCfvqRb0cM8yYqw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "safer-buffer": ">= 2.1.2 < 3.0.0"
      },
      "engines": {
        "node": ">=0.10.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/express"
      }
    },
    "node_modules/icss-utils": {
      "version": "5.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/icss-utils/-/icss-utils-5.1.0.tgz",
      "integrity": "sha512-soFhflCVWLfRNOPU3iv5Z9VUdT44xFRbzjLsEzSr5AQmgqPMTHdU3PMT1Cf1ssx8fLNJDA1juftYl+PUcv3MqA==",
      "dev": true,
      "license": "ISC",
      "engines": {
        "node": "^10 || ^12 || >= 14"
      },
      "peerDependencies": {
        "postcss": "^8.1.0"
      }
    },
    "node_modules/ieee754": {
      "version": "1.2.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ieee754/-/ieee754-1.2.1.tgz",
      "integrity": "sha512-dcyqhDvX1C46lXZcVqCpK+FtMRQVdIMN6/Df5js2zouUsqG7I6sFxitIC+7KYK29KdXOLHdu9zL4sFnoVQnqaA==",
      "dev": true,
      "funding": [
        {
          "type": "github",
          "url": "https://github.com/sponsors/feross"
        },
        {
          "type": "patreon",
          "url": "https://www.patreon.com/feross"
        },
        {
          "type": "consulting",
          "url": "https://feross.org/support"
        }
      ],
      "license": "BSD-3-Clause"
    },
    "node_modules/ignore": {
      "version": "7.0.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ignore/-/ignore-7.0.5.tgz",
      "integrity": "sha512-Hs59xBNfUIunMFgWAbGX5cq6893IbWg4KnrjbYwX3tx0ztorVgTDA6B2sxf8ejHJ4wz8BqGUMYlnzNBer5NvGg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 4"
      }
    },
    "node_modules/ignore-walk": {
      "version": "7.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ignore-walk/-/ignore-walk-7.0.0.tgz",
      "integrity": "sha512-T4gbf83A4NH95zvhVYZc+qWocBBGlpzUXLPGurJggw/WIOwicfXJChLDP/iBZnN5WqROSu5Bm3hhle4z8a8YGQ==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "minimatch": "^9.0.0"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/ignore-walk/node_modules/brace-expansion": {
      "version": "2.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/brace-expansion/-/brace-expansion-2.0.3.tgz",
      "integrity": "sha512-MCV/fYJEbqx68aE58kv2cA/kiky1G8vux3OR6/jbS+jIMe/6fJWa0DTzJU7dqijOWYwHi1t29FlfYI9uytqlpA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "balanced-match": "^1.0.0"
      }
    },
    "node_modules/ignore-walk/node_modules/minimatch": {
      "version": "9.0.9",
      "resolved": "http://binario.caixa:8081/repository/npm-all/minimatch/-/minimatch-9.0.9.tgz",
      "integrity": "sha512-OBwBN9AL4dqmETlpS2zasx+vTeWclWzkblfZk7KTA5j3jeOONz/tRCnZomUyvNg83wL5Zv9Ss6HMJXAgL8R2Yg==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "brace-expansion": "^2.0.2"
      },
      "engines": {
        "node": ">=16 || 14 >=14.17"
      },
      "funding": {
        "url": "https://github.com/sponsors/isaacs"
      }
    },
    "node_modules/image-size": {
      "version": "0.5.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/image-size/-/image-size-0.5.5.tgz",
      "integrity": "sha512-6TDAlDPZxUFCv+fuOkIoXT/V/f3Qbq8e37p+YOiYrUv3v9cc3/6x78VdfPgFVaB9dZYeLUfKgHRebpkm/oP2VQ==",
      "dev": true,
      "license": "MIT",
      "optional": true,
      "bin": {
        "image-size": "bin/image-size.js"
      },
      "engines": {
        "node": ">=0.10.0"
      }
    },
    "node_modules/immutable": {
      "version": "5.1.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/immutable/-/immutable-5.1.5.tgz",
      "integrity": "sha512-t7xcm2siw+hlUM68I+UEOK+z84RzmN59as9DZ7P1l0994DKUWV7UXBMQZVxaoMSRQ+PBZbHCOoBt7a2wxOMt+A==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/import-fresh": {
      "version": "3.3.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/import-fresh/-/import-fresh-3.3.1.tgz",
      "integrity": "sha512-TR3KfrTZTYLPB6jUjfx6MF9WcWrHL9su5TObK4ZkYgBdWKPOFoSoQIdEuTuR82pmtxH2spWG9h6etwfr1pLBqQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "parent-module": "^1.0.0",
        "resolve-from": "^4.0.0"
      },
      "engines": {
        "node": ">=6"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/import-fresh/node_modules/resolve-from": {
      "version": "4.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/resolve-from/-/resolve-from-4.0.0.tgz",
      "integrity": "sha512-pb/MYmXstAkysRFx8piNI1tGFNQIFA3vkE3Gq4EuA1dF6gHp/+vgZqsCGJapvy8N3Q+4o7FwvquPJcnZ7RYy4g==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=4"
      }
    },
    "node_modules/import-local": {
      "version": "3.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/import-local/-/import-local-3.2.0.tgz",
      "integrity": "sha512-2SPlun1JUPWoM6t3F0dw0FkCF/jWY8kttcY4f599GLTSjh2OCuuhdTkJQsEcZzBqbXZGKMK2OqW1oZsjtf/gQA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "pkg-dir": "^4.2.0",
        "resolve-cwd": "^3.0.0"
      },
      "bin": {
        "import-local-fixture": "fixtures/cli.js"
      },
      "engines": {
        "node": ">=8"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/import-local/node_modules/pkg-dir": {
      "version": "4.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/pkg-dir/-/pkg-dir-4.2.0.tgz",
      "integrity": "sha512-HRDzbaKjC+AOWVXxAU/x54COGeIv9eb+6CkDSQoNTt4XyWoIJvuPsXizxu/Fr23EiekbtZwmh1IcIG/l/a10GQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "find-up": "^4.0.0"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/imurmurhash": {
      "version": "0.1.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/imurmurhash/-/imurmurhash-0.1.4.tgz",
      "integrity": "sha512-JmXMZ6wuvDmLiHEml9ykzqO6lwFbof0GG4IkcGaENdCRDDmMVnny7s5HsIgHCbaq0w2MyPhDqkhTUgS2LU2PHA==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=0.8.19"
      }
    },
    "node_modules/inflight": {
      "version": "1.0.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/inflight/-/inflight-1.0.6.tgz",
      "integrity": "sha512-k92I/b08q4wvFscXCLvqfsHCrjrF7yiXsQuIVvVE7N82W3+aqpzuUdBbfhWcy/FZR3/4IgflMgKLOsvPDrGCJA==",
      "deprecated": "This module is not supported, and leaks memory. Do not use it. Check out lru-cache if you want a good and tested way to coalesce async requests by a key value, which is much more comprehensive and powerful.",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "once": "^1.3.0",
        "wrappy": "1"
      }
    },
    "node_modules/inherits": {
      "version": "2.0.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/inherits/-/inherits-2.0.4.tgz",
      "integrity": "sha512-k/vGaX4/Yla3WzyMCvTQOXYeIHvqOKtnqBduzTHpzpQZzAskKMhZ2K+EnBiSM9zGSoIFeMpXKxa4dYeZIQqewQ==",
      "dev": true,
      "license": "ISC"
    },
    "node_modules/ini": {
      "version": "5.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ini/-/ini-5.0.0.tgz",
      "integrity": "sha512-+N0ngpO3e7cRUWOJAS7qw0IZIVc6XPrW4MlFBdD066F2L4k1L6ker3hLqSq7iXxU5tgS4WGkIUElWn5vogAEnw==",
      "dev": true,
      "license": "ISC",
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/inputmask": {
      "version": "5.0.9",
      "resolved": "http://binario.caixa:8081/repository/npm-all/inputmask/-/inputmask-5.0.9.tgz",
      "integrity": "sha512-s0lUfqcEbel+EQXtehXqwCJGShutgieOaIImFKC/r4reYNvX3foyrChl6LOEvaEgxEbesePIrw1Zi2jhZaDZbQ==",
      "license": "MIT",
      "peer": true
    },
    "node_modules/internmap": {
      "version": "2.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/internmap/-/internmap-2.0.3.tgz",
      "integrity": "sha512-5Hh7Y1wQbvY5ooGgPbDaL5iYLAPzMTUrjMulskHLH6wnv/A+1q5rgEaiuqEjB+oxGXIVZs1FF+R/KPN3ZSQYYg==",
      "license": "ISC",
      "optional": true,
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/ip-address": {
      "version": "10.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ip-address/-/ip-address-10.1.0.tgz",
      "integrity": "sha512-XXADHxXmvT9+CRxhXg56LJovE+bmWnEWB78LB83VZTprKTmaC5QfruXocxzTZ2Kl0DNwKuBdlIhjL8LeY8Sf8Q==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 12"
      }
    },
    "node_modules/ipaddr.js": {
      "version": "2.3.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ipaddr.js/-/ipaddr.js-2.3.0.tgz",
      "integrity": "sha512-Zv/pA+ciVFbCSBBjGfaKUya/CcGmUHzTydLMaTwrUUEM2DIEO3iZvueGxmacvmN50fGpGVKeTXpb2LcYQxeVdg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 10"
      }
    },
    "node_modules/is-arrayish": {
      "version": "0.2.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/is-arrayish/-/is-arrayish-0.2.1.tgz",
      "integrity": "sha512-zz06S8t0ozoDXMG+ube26zeCTNXcKIPJZJi8hBrF4idCLms4CG9QtK7qBl1boi5ODzFpjswb5JPmHCbMpjaYzg==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/is-binary-path": {
      "version": "2.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/is-binary-path/-/is-binary-path-2.1.0.tgz",
      "integrity": "sha512-ZMERYes6pDydyuGidse7OsHxtbI7WVeUEozgR/g7rd0xUimYNlvZRE/K2MgZTjWy725IfelLeVcEM97mmtRGXw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "binary-extensions": "^2.0.0"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/is-core-module": {
      "version": "2.16.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/is-core-module/-/is-core-module-2.16.1.tgz",
      "integrity": "sha512-UfoeMA6fIJ8wTYFEUjelnaGI67v6+N7qXJEvQuIGa99l4xsCruSYOVSQ0uPANn4dAzm8lkYPaKLrrijLq7x23w==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "hasown": "^2.0.2"
      },
      "engines": {
        "node": ">= 0.4"
      },
      "funding": {
        "url": "https://github.com/sponsors/ljharb"
      }
    },
    "node_modules/is-docker": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/is-docker/-/is-docker-3.0.0.tgz",
      "integrity": "sha512-eljcgEDlEns/7AXFosB5K/2nCM4P7FQPkGc/DWLy5rmFEWvZayGrik1d9/QIY5nJ4f9YsVvBkA6kJpHn9rISdQ==",
      "dev": true,
      "license": "MIT",
      "bin": {
        "is-docker": "cli.js"
      },
      "engines": {
        "node": "^12.20.0 || ^14.13.1 || >=16.0.0"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/is-extglob": {
      "version": "2.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/is-extglob/-/is-extglob-2.1.1.tgz",
      "integrity": "sha512-SbKbANkN603Vi4jEZv49LeVJMn4yGwsbzZworEoyEiutsN3nJYdbO36zfhGJ6QEDpOZIFkDtnq5JRxmvl3jsoQ==",
      "license": "MIT",
      "engines": {
        "node": ">=0.10.0"
      }
    },
    "node_modules/is-fullwidth-code-point": {
      "version": "4.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/is-fullwidth-code-point/-/is-fullwidth-code-point-4.0.0.tgz",
      "integrity": "sha512-O4L094N2/dZ7xqVdrXhh9r1KODPJpFms8B5sGdJLPy664AgvXsreZUyCQQNItZRDlYug4xStLjNp/sz3HvBowQ==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=12"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/is-generator-fn": {
      "version": "2.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/is-generator-fn/-/is-generator-fn-2.1.0.tgz",
      "integrity": "sha512-cTIB4yPYL/Grw0EaSzASzg6bBy9gqCofvWN8okThAYIxKJZC+udlRAmGbM0XLeniEJSs8uEgHPGuHSe1XsOLSQ==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=6"
      }
    },
    "node_modules/is-glob": {
      "version": "4.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/is-glob/-/is-glob-4.0.3.tgz",
      "integrity": "sha512-xelSayHH36ZgE7ZWhli7pW34hNbNl8Ojv5KVmkJD4hBdD3th8Tfk9vYasLM+mXWOZhFkgZfxhLSnrwRr4elSSg==",
      "license": "MIT",
      "dependencies": {
        "is-extglob": "^2.1.1"
      },
      "engines": {
        "node": ">=0.10.0"
      }
    },
    "node_modules/is-inside-container": {
      "version": "1.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/is-inside-container/-/is-inside-container-1.0.0.tgz",
      "integrity": "sha512-KIYLCCJghfHZxqjYBE7rEy0OBuTd5xCHS7tHVgvCLkx7StIoaxwNW3hCALgEUjFfeRk+MG/Qxmp/vtETEF3tRA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "is-docker": "^3.0.0"
      },
      "bin": {
        "is-inside-container": "cli.js"
      },
      "engines": {
        "node": ">=14.16"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/is-interactive": {
      "version": "1.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/is-interactive/-/is-interactive-1.0.0.tgz",
      "integrity": "sha512-2HvIEKRoqS62guEC+qBjpvRubdX910WCMuJTZ+I9yvqKU2/12eSL549HMwtabb4oupdj2sMP50k+XJfB/8JE6w==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/is-network-error": {
      "version": "1.3.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/is-network-error/-/is-network-error-1.3.1.tgz",
      "integrity": "sha512-6QCxa49rQbmUWLfk0nuGqzql9U8uaV2H6279bRErPBHe/109hCzsLUBUHfbEtvLIHBd6hyXbgedBSHevm43Edw==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=16"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/is-number": {
      "version": "7.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/is-number/-/is-number-7.0.0.tgz",
      "integrity": "sha512-41Cifkg6e8TylSpdtTpeLVMqvSBEVzTttHvERD741+pnZ8ANv0004MRL43QKPDlK9cGvNp6NZWZUBlbGXYxxng==",
      "license": "MIT",
      "engines": {
        "node": ">=0.12.0"
      }
    },
    "node_modules/is-plain-obj": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/is-plain-obj/-/is-plain-obj-3.0.0.tgz",
      "integrity": "sha512-gwsOE28k+23GP1B6vFl1oVh/WOzmawBrKwo5Ev6wMKzPkaXaCDIQKzLnvsA42DRlbVTWorkgTKIviAKCWkfUwA==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=10"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/is-plain-object": {
      "version": "5.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/is-plain-object/-/is-plain-object-5.0.0.tgz",
      "integrity": "sha512-VRSzKkbMm5jMDoKLbltAkFQ5Qr7VDiTFGXxYFXXowVj387GeGNOCsOH6Msy00SGZ3Fp84b1Naa1psqgcCIEP5Q==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=0.10.0"
      }
    },
    "node_modules/is-potential-custom-element-name": {
      "version": "1.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/is-potential-custom-element-name/-/is-potential-custom-element-name-1.0.1.tgz",
      "integrity": "sha512-bCYeRA2rVibKZd+s2625gGnGF/t7DSqDs4dP7CrLA1m7jKWz6pps0LpYLJN8Q64HtmPKJ1hrN3nzPNKFEKOUiQ==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/is-stream": {
      "version": "2.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/is-stream/-/is-stream-2.0.1.tgz",
      "integrity": "sha512-hFoiJiTl63nn+kstHGBtewWSKnQLpyb155KHheA1l39uvtO9nWIop1p3udqPcUd/xbF1VLMO4n7OI6p7RbngDg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/is-unicode-supported": {
      "version": "0.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/is-unicode-supported/-/is-unicode-supported-0.1.0.tgz",
      "integrity": "sha512-knxG2q4UC3u8stRGyAVJCOdxFmv5DZiRcdlIaAQXAbSfJya+OhopNotLQrstBhququ4ZpuKbDc/8S6mgXgPFPw==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=10"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/is-what": {
      "version": "3.14.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/is-what/-/is-what-3.14.1.tgz",
      "integrity": "sha512-sNxgpk9793nzSs7bA6JQJGeIuRBQhAaNGG77kzYQgMkrID+lS6SlK07K5LaptscDlSaIgH+GPFzf+d75FVxozA==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/is-wsl": {
      "version": "3.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/is-wsl/-/is-wsl-3.1.1.tgz",
      "integrity": "sha512-e6rvdUCiQCAuumZslxRJWR/Doq4VpPR82kqclvcS0efgt430SlGIk05vdCN58+VrzgtIcfNODjozVielycD4Sw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "is-inside-container": "^1.0.0"
      },
      "engines": {
        "node": ">=16"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/isarray": {
      "version": "1.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/isarray/-/isarray-1.0.0.tgz",
      "integrity": "sha512-VLghIWNM6ELQzo7zwmcg0NmTVyWKYjvIeM83yjp0wRDTmUnrM678fQbcKBo6n2CJEF0szoG//ytg+TKla89ALQ==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/isexe": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/isexe/-/isexe-2.0.0.tgz",
      "integrity": "sha512-RHxMLp9lnKHGHRng9QFhRCMbYAcVpn69smSGcq3f36xjgVVWThj4qqLbTLlq7Ssj8B+fIQ1EuCEGI2lKsyQeIw==",
      "dev": true,
      "license": "ISC"
    },
    "node_modules/isobject": {
      "version": "3.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/isobject/-/isobject-3.0.1.tgz",
      "integrity": "sha512-WhB9zCku7EGTj/HQQRz5aUQEUeoQZH2bWcltRErOpymJ4boYE6wL9Tbr23krRPSZ+C5zqNSrSw+Cc7sZZ4b7vg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=0.10.0"
      }
    },
    "node_modules/istanbul-lib-coverage": {
      "version": "3.2.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/istanbul-lib-coverage/-/istanbul-lib-coverage-3.2.2.tgz",
      "integrity": "sha512-O8dpsF+r0WV/8MNRKfnmrtCWhuKjxrq2w+jpzBL5UZKTi2LeVWnWOmWRxFlesJONmc+wLAGvKQZEOanko0LFTg==",
      "dev": true,
      "license": "BSD-3-Clause",
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/istanbul-lib-instrument": {
      "version": "6.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/istanbul-lib-instrument/-/istanbul-lib-instrument-6.0.3.tgz",
      "integrity": "sha512-Vtgk7L/R2JHyyGW07spoFlB8/lpjiOLTjMdms6AFMraYt3BaJauod/NGrfnVG/y4Ix1JEuMRPDPEj2ua+zz1/Q==",
      "dev": true,
      "license": "BSD-3-Clause",
      "dependencies": {
        "@babel/core": "^7.23.9",
        "@babel/parser": "^7.23.9",
        "@istanbuljs/schema": "^0.1.3",
        "istanbul-lib-coverage": "^3.2.0",
        "semver": "^7.5.4"
      },
      "engines": {
        "node": ">=10"
      }
    },
    "node_modules/istanbul-lib-report": {
      "version": "3.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/istanbul-lib-report/-/istanbul-lib-report-3.0.1.tgz",
      "integrity": "sha512-GCfE1mtsHGOELCU8e/Z7YWzpmybrx/+dSTfLrvY8qRmaY6zXTKWn6WQIjaAFw069icm6GVMNkgu0NzI4iPZUNw==",
      "dev": true,
      "license": "BSD-3-Clause",
      "dependencies": {
        "istanbul-lib-coverage": "^3.0.0",
        "make-dir": "^4.0.0",
        "supports-color": "^7.1.0"
      },
      "engines": {
        "node": ">=10"
      }
    },
    "node_modules/istanbul-lib-source-maps": {
      "version": "4.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/istanbul-lib-source-maps/-/istanbul-lib-source-maps-4.0.1.tgz",
      "integrity": "sha512-n3s8EwkdFIJCG3BPKBYvskgXGoy88ARzvegkitk60NxRdwltLOTaH7CUiMRXvwYorl0Q712iEjcWB+fK/MrWVw==",
      "dev": true,
      "license": "BSD-3-Clause",
      "dependencies": {
        "debug": "^4.1.1",
        "istanbul-lib-coverage": "^3.0.0",
        "source-map": "^0.6.1"
      },
      "engines": {
        "node": ">=10"
      }
    },
    "node_modules/istanbul-lib-source-maps/node_modules/source-map": {
      "version": "0.6.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/source-map/-/source-map-0.6.1.tgz",
      "integrity": "sha512-UjgapumWlbMhkBgzT7Ykc5YXUT46F0iKu8SGXq0bcwP5dz/h0Plj6enJqjz1Zbq2l5WaqYnrVbwWOWMyF3F47g==",
      "dev": true,
      "license": "BSD-3-Clause",
      "engines": {
        "node": ">=0.10.0"
      }
    },
    "node_modules/istanbul-reports": {
      "version": "3.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/istanbul-reports/-/istanbul-reports-3.2.0.tgz",
      "integrity": "sha512-HGYWWS/ehqTV3xN10i23tkPkpH46MLCIMFNCaaKNavAXTF1RkqxawEPtnjnGZ6XKSInBKkiOA5BKS+aZiY3AvA==",
      "dev": true,
      "license": "BSD-3-Clause",
      "dependencies": {
        "html-escaper": "^2.0.0",
        "istanbul-lib-report": "^3.0.0"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/jackspeak": {
      "version": "3.4.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jackspeak/-/jackspeak-3.4.3.tgz",
      "integrity": "sha512-OGlZQpz2yfahA/Rd1Y8Cd9SIEsqvXkLVoSw/cgwhnhFMDbsQFeZYoJJ7bIZBS9BcamUW96asq/npPWugM+RQBw==",
      "dev": true,
      "license": "BlueOak-1.0.0",
      "dependencies": {
        "@isaacs/cliui": "^8.0.2"
      },
      "funding": {
        "url": "https://github.com/sponsors/isaacs"
      },
      "optionalDependencies": {
        "@pkgjs/parseargs": "^0.11.0"
      }
    },
    "node_modules/jest": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jest/-/jest-29.7.0.tgz",
      "integrity": "sha512-NIy3oAFp9shda19hy4HK0HRTWKtPJmGdnvywu01nOqNC2vZg+Z+fvJDxpMQA88eb2I9EcafcdjYgsDthnYTvGw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@jest/core": "^29.7.0",
        "@jest/types": "^29.6.3",
        "import-local": "^3.0.2",
        "jest-cli": "^29.7.0"
      },
      "bin": {
        "jest": "bin/jest.js"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      },
      "peerDependencies": {
        "node-notifier": "^8.0.1 || ^9.0.0 || ^10.0.0"
      },
      "peerDependenciesMeta": {
        "node-notifier": {
          "optional": true
        }
      }
    },
    "node_modules/jest-changed-files": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jest-changed-files/-/jest-changed-files-29.7.0.tgz",
      "integrity": "sha512-fEArFiwf1BpQ+4bXSprcDc3/x4HSzL4al2tozwVpDFpsxALjLYdyiIK4e5Vz66GQJIbXJ82+35PtysofptNX2w==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "execa": "^5.0.0",
        "jest-util": "^29.7.0",
        "p-limit": "^3.1.0"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/jest-circus": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jest-circus/-/jest-circus-29.7.0.tgz",
      "integrity": "sha512-3E1nCMgipcTkCocFwM90XXQab9bS+GMsjdpmPrlelaxwD93Ad8iVEjX/vvHPdLPnFf+L40u+5+iutRdA1N9myw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@jest/environment": "^29.7.0",
        "@jest/expect": "^29.7.0",
        "@jest/test-result": "^29.7.0",
        "@jest/types": "^29.6.3",
        "@types/node": "*",
        "chalk": "^4.0.0",
        "co": "^4.6.0",
        "dedent": "^1.0.0",
        "is-generator-fn": "^2.0.0",
        "jest-each": "^29.7.0",
        "jest-matcher-utils": "^29.7.0",
        "jest-message-util": "^29.7.0",
        "jest-runtime": "^29.7.0",
        "jest-snapshot": "^29.7.0",
        "jest-util": "^29.7.0",
        "p-limit": "^3.1.0",
        "pretty-format": "^29.7.0",
        "pure-rand": "^6.0.0",
        "slash": "^3.0.0",
        "stack-utils": "^2.0.3"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/jest-circus/node_modules/slash": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/slash/-/slash-3.0.0.tgz",
      "integrity": "sha512-g9Q1haeby36OSStwb4ntCGGGaKsaVSjQ68fBxoQcutl5fS1vuY18H3wSt3jFyFtrkx+Kz0V1G85A4MyAdDMi2Q==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/jest-cli": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jest-cli/-/jest-cli-29.7.0.tgz",
      "integrity": "sha512-OVVobw2IubN/GSYsxETi+gOe7Ka59EFMR/twOU3Jb2GnKKeMGJB5SGUUrEz3SFVmJASUdZUzy83sLNNQ2gZslg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@jest/core": "^29.7.0",
        "@jest/test-result": "^29.7.0",
        "@jest/types": "^29.6.3",
        "chalk": "^4.0.0",
        "create-jest": "^29.7.0",
        "exit": "^0.1.2",
        "import-local": "^3.0.2",
        "jest-config": "^29.7.0",
        "jest-util": "^29.7.0",
        "jest-validate": "^29.7.0",
        "yargs": "^17.3.1"
      },
      "bin": {
        "jest": "bin/jest.js"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      },
      "peerDependencies": {
        "node-notifier": "^8.0.1 || ^9.0.0 || ^10.0.0"
      },
      "peerDependenciesMeta": {
        "node-notifier": {
          "optional": true
        }
      }
    },
    "node_modules/jest-config": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jest-config/-/jest-config-29.7.0.tgz",
      "integrity": "sha512-uXbpfeQ7R6TZBqI3/TxCU4q4ttk3u0PJeC+E0zbfSoSjq6bJ7buBPxzQPL0ifrkY4DNu4JUdk0ImlBUYi840eQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/core": "^7.11.6",
        "@jest/test-sequencer": "^29.7.0",
        "@jest/types": "^29.6.3",
        "babel-jest": "^29.7.0",
        "chalk": "^4.0.0",
        "ci-info": "^3.2.0",
        "deepmerge": "^4.2.2",
        "glob": "^7.1.3",
        "graceful-fs": "^4.2.9",
        "jest-circus": "^29.7.0",
        "jest-environment-node": "^29.7.0",
        "jest-get-type": "^29.6.3",
        "jest-regex-util": "^29.6.3",
        "jest-resolve": "^29.7.0",
        "jest-runner": "^29.7.0",
        "jest-util": "^29.7.0",
        "jest-validate": "^29.7.0",
        "micromatch": "^4.0.4",
        "parse-json": "^5.2.0",
        "pretty-format": "^29.7.0",
        "slash": "^3.0.0",
        "strip-json-comments": "^3.1.1"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      },
      "peerDependencies": {
        "@types/node": "*",
        "ts-node": ">=9.0.0"
      },
      "peerDependenciesMeta": {
        "@types/node": {
          "optional": true
        },
        "ts-node": {
          "optional": true
        }
      }
    },
    "node_modules/jest-config/node_modules/slash": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/slash/-/slash-3.0.0.tgz",
      "integrity": "sha512-g9Q1haeby36OSStwb4ntCGGGaKsaVSjQ68fBxoQcutl5fS1vuY18H3wSt3jFyFtrkx+Kz0V1G85A4MyAdDMi2Q==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/jest-diff": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jest-diff/-/jest-diff-29.7.0.tgz",
      "integrity": "sha512-LMIgiIrhigmPrs03JHpxUh2yISK3vLFPkAodPeo0+BuF7wA2FoQbkEg1u8gBYBThncu7e1oEDUfIXVuTqLRUjw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "chalk": "^4.0.0",
        "diff-sequences": "^29.6.3",
        "jest-get-type": "^29.6.3",
        "pretty-format": "^29.7.0"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/jest-docblock": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jest-docblock/-/jest-docblock-29.7.0.tgz",
      "integrity": "sha512-q617Auw3A612guyaFgsbFeYpNP5t2aoUNLwBUbc/0kD1R4t9ixDbyFTHd1nok4epoVFpr7PmeWHrhvuV3XaJ4g==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "detect-newline": "^3.0.0"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/jest-each": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jest-each/-/jest-each-29.7.0.tgz",
      "integrity": "sha512-gns+Er14+ZrEoC5fhOfYCY1LOHHr0TI+rQUHZS8Ttw2l7gl+80eHc/gFf2Ktkw0+SIACDTeWvpFcv3B04VembQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@jest/types": "^29.6.3",
        "chalk": "^4.0.0",
        "jest-get-type": "^29.6.3",
        "jest-util": "^29.7.0",
        "pretty-format": "^29.7.0"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/jest-environment-jsdom": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jest-environment-jsdom/-/jest-environment-jsdom-29.7.0.tgz",
      "integrity": "sha512-k9iQbsf9OyOfdzWH8HDmrRT0gSIcX+FLNW7IQq94tFX0gynPwqDTW0Ho6iMVNjGz/nb+l/vW3dWM2bbLLpkbXA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@jest/environment": "^29.7.0",
        "@jest/fake-timers": "^29.7.0",
        "@jest/types": "^29.6.3",
        "@types/jsdom": "^20.0.0",
        "@types/node": "*",
        "jest-mock": "^29.7.0",
        "jest-util": "^29.7.0",
        "jsdom": "^20.0.0"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      },
      "peerDependencies": {
        "canvas": "^2.5.0"
      },
      "peerDependenciesMeta": {
        "canvas": {
          "optional": true
        }
      }
    },
    "node_modules/jest-environment-node": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jest-environment-node/-/jest-environment-node-29.7.0.tgz",
      "integrity": "sha512-DOSwCRqXirTOyheM+4d5YZOrWcdu0LNZ87ewUoywbcb2XR4wKgqiG8vNeYwhjFMbEkfju7wx2GYH0P2gevGvFw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@jest/environment": "^29.7.0",
        "@jest/fake-timers": "^29.7.0",
        "@jest/types": "^29.6.3",
        "@types/node": "*",
        "jest-mock": "^29.7.0",
        "jest-util": "^29.7.0"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/jest-get-type": {
      "version": "29.6.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jest-get-type/-/jest-get-type-29.6.3.tgz",
      "integrity": "sha512-zrteXnqYxfQh7l5FHyL38jL39di8H8rHoecLH3JNxH3BwOrBsNeabdap5e0I23lD4HHI8W5VFBZqG4Eaq5LNcw==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/jest-haste-map": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jest-haste-map/-/jest-haste-map-29.7.0.tgz",
      "integrity": "sha512-fP8u2pyfqx0K1rGn1R9pyE0/KTn+G7PxktWidOBTqFPLYX0b9ksaMFkhK5vrS3DVun09pckLdlx90QthlW7AmA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@jest/types": "^29.6.3",
        "@types/graceful-fs": "^4.1.3",
        "@types/node": "*",
        "anymatch": "^3.0.3",
        "fb-watchman": "^2.0.0",
        "graceful-fs": "^4.2.9",
        "jest-regex-util": "^29.6.3",
        "jest-util": "^29.7.0",
        "jest-worker": "^29.7.0",
        "micromatch": "^4.0.4",
        "walker": "^1.0.8"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      },
      "optionalDependencies": {
        "fsevents": "^2.3.2"
      }
    },
    "node_modules/jest-leak-detector": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jest-leak-detector/-/jest-leak-detector-29.7.0.tgz",
      "integrity": "sha512-kYA8IJcSYtST2BY9I+SMC32nDpBT3J2NvWJx8+JCuCdl/CR1I4EKUJROiP8XtCcxqgTTBGJNdbB1A8XRKbTetw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "jest-get-type": "^29.6.3",
        "pretty-format": "^29.7.0"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/jest-matcher-utils": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jest-matcher-utils/-/jest-matcher-utils-29.7.0.tgz",
      "integrity": "sha512-sBkD+Xi9DtcChsI3L3u0+N0opgPYnCRPtGcQYrgXmR+hmt/fYfWAL0xRXYU8eWOdfuLgBe0YCW3AFtnRLagq/g==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "chalk": "^4.0.0",
        "jest-diff": "^29.7.0",
        "jest-get-type": "^29.6.3",
        "pretty-format": "^29.7.0"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/jest-message-util": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jest-message-util/-/jest-message-util-29.7.0.tgz",
      "integrity": "sha512-GBEV4GRADeP+qtB2+6u61stea8mGcOT4mCtrYISZwfu9/ISHFJ/5zOMXYbpBE9RsS5+Gb63DW4FgmnKJ79Kf6w==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/code-frame": "^7.12.13",
        "@jest/types": "^29.6.3",
        "@types/stack-utils": "^2.0.0",
        "chalk": "^4.0.0",
        "graceful-fs": "^4.2.9",
        "micromatch": "^4.0.4",
        "pretty-format": "^29.7.0",
        "slash": "^3.0.0",
        "stack-utils": "^2.0.3"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/jest-message-util/node_modules/slash": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/slash/-/slash-3.0.0.tgz",
      "integrity": "sha512-g9Q1haeby36OSStwb4ntCGGGaKsaVSjQ68fBxoQcutl5fS1vuY18H3wSt3jFyFtrkx+Kz0V1G85A4MyAdDMi2Q==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/jest-mock": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jest-mock/-/jest-mock-29.7.0.tgz",
      "integrity": "sha512-ITOMZn+UkYS4ZFh83xYAOzWStloNzJFO2s8DWrE4lhtGD+AorgnbkiKERe4wQVBydIGPx059g6riW5Btp6Llnw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@jest/types": "^29.6.3",
        "@types/node": "*",
        "jest-util": "^29.7.0"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/jest-pnp-resolver": {
      "version": "1.2.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jest-pnp-resolver/-/jest-pnp-resolver-1.2.3.tgz",
      "integrity": "sha512-+3NpwQEnRoIBtx4fyhblQDPgJI0H1IEIkX7ShLUjPGA7TtUTvI1oiKi3SR4oBR0hQhQR80l4WAe5RrXBwWMA8w==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=6"
      },
      "peerDependencies": {
        "jest-resolve": "*"
      },
      "peerDependenciesMeta": {
        "jest-resolve": {
          "optional": true
        }
      }
    },
    "node_modules/jest-preset-angular": {
      "version": "14.6.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jest-preset-angular/-/jest-preset-angular-14.6.2.tgz",
      "integrity": "sha512-QWnjfXrnYJX65D+iZXBrdQ0ABHSo6DGvcmL3dGYOdF+V2ZhDlqJwKTmt7nyiOcORPdCL+20P8y+Q1mmnjZTHKQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "bs-logger": "^0.2.6",
        "esbuild-wasm": ">=0.15.13",
        "jest-environment-jsdom": "^29.7.0",
        "jest-util": "^29.7.0",
        "pretty-format": "^29.7.0",
        "ts-jest": "^29.3.0"
      },
      "engines": {
        "node": "^14.15.0 || >=16.10.0"
      },
      "optionalDependencies": {
        "esbuild": ">=0.15.13"
      },
      "peerDependencies": {
        "@angular/compiler-cli": ">=15.0.0 <21.0.0",
        "@angular/core": ">=15.0.0 <21.0.0",
        "@angular/platform-browser-dynamic": ">=15.0.0 <21.0.0",
        "jest": "^29.0.0",
        "jsdom": ">=20.0.0",
        "typescript": ">=4.8"
      },
      "peerDependenciesMeta": {
        "jsdom": {
          "optional": true
        }
      }
    },
    "node_modules/jest-regex-util": {
      "version": "29.6.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jest-regex-util/-/jest-regex-util-29.6.3.tgz",
      "integrity": "sha512-KJJBsRCyyLNWCNBOvZyRDnAIfUiRJ8v+hOBQYGn8gDyF3UegwiP4gwRR3/SDa42g1YbVycTidUF3rKjyLFDWbg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/jest-resolve": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jest-resolve/-/jest-resolve-29.7.0.tgz",
      "integrity": "sha512-IOVhZSrg+UvVAshDSDtHyFCCBUl/Q3AAJv8iZ6ZjnZ74xzvwuzLXid9IIIPgTnY62SJjfuupMKZsZQRsCvxEgA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "chalk": "^4.0.0",
        "graceful-fs": "^4.2.9",
        "jest-haste-map": "^29.7.0",
        "jest-pnp-resolver": "^1.2.2",
        "jest-util": "^29.7.0",
        "jest-validate": "^29.7.0",
        "resolve": "^1.20.0",
        "resolve.exports": "^2.0.0",
        "slash": "^3.0.0"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/jest-resolve-dependencies": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jest-resolve-dependencies/-/jest-resolve-dependencies-29.7.0.tgz",
      "integrity": "sha512-un0zD/6qxJ+S0et7WxeI3H5XSe9lTBBR7bOHCHXkKR6luG5mwDDlIzVQ0V5cZCuoTgEdcdwzTghYkTWfubi+nA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "jest-regex-util": "^29.6.3",
        "jest-snapshot": "^29.7.0"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/jest-resolve/node_modules/slash": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/slash/-/slash-3.0.0.tgz",
      "integrity": "sha512-g9Q1haeby36OSStwb4ntCGGGaKsaVSjQ68fBxoQcutl5fS1vuY18H3wSt3jFyFtrkx+Kz0V1G85A4MyAdDMi2Q==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/jest-runner": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jest-runner/-/jest-runner-29.7.0.tgz",
      "integrity": "sha512-fsc4N6cPCAahybGBfTRcq5wFR6fpLznMg47sY5aDpsoejOcVYFb07AHuSnR0liMcPTgBsA3ZJL6kFOjPdoNipQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@jest/console": "^29.7.0",
        "@jest/environment": "^29.7.0",
        "@jest/test-result": "^29.7.0",
        "@jest/transform": "^29.7.0",
        "@jest/types": "^29.6.3",
        "@types/node": "*",
        "chalk": "^4.0.0",
        "emittery": "^0.13.1",
        "graceful-fs": "^4.2.9",
        "jest-docblock": "^29.7.0",
        "jest-environment-node": "^29.7.0",
        "jest-haste-map": "^29.7.0",
        "jest-leak-detector": "^29.7.0",
        "jest-message-util": "^29.7.0",
        "jest-resolve": "^29.7.0",
        "jest-runtime": "^29.7.0",
        "jest-util": "^29.7.0",
        "jest-watcher": "^29.7.0",
        "jest-worker": "^29.7.0",
        "p-limit": "^3.1.0",
        "source-map-support": "0.5.13"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/jest-runner/node_modules/source-map": {
      "version": "0.6.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/source-map/-/source-map-0.6.1.tgz",
      "integrity": "sha512-UjgapumWlbMhkBgzT7Ykc5YXUT46F0iKu8SGXq0bcwP5dz/h0Plj6enJqjz1Zbq2l5WaqYnrVbwWOWMyF3F47g==",
      "dev": true,
      "license": "BSD-3-Clause",
      "engines": {
        "node": ">=0.10.0"
      }
    },
    "node_modules/jest-runner/node_modules/source-map-support": {
      "version": "0.5.13",
      "resolved": "http://binario.caixa:8081/repository/npm-all/source-map-support/-/source-map-support-0.5.13.tgz",
      "integrity": "sha512-SHSKFHadjVA5oR4PPqhtAVdcBWwRYVd6g6cAXnIbRiIwc2EhPrTuKUBdSLvlEKyIP3GCf89fltvcZiP9MMFA1w==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "buffer-from": "^1.0.0",
        "source-map": "^0.6.0"
      }
    },
    "node_modules/jest-runtime": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jest-runtime/-/jest-runtime-29.7.0.tgz",
      "integrity": "sha512-gUnLjgwdGqW7B4LvOIkbKs9WGbn+QLqRQQ9juC6HndeDiezIwhDP+mhMwHWCEcfQ5RUXa6OPnFF8BJh5xegwwQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@jest/environment": "^29.7.0",
        "@jest/fake-timers": "^29.7.0",
        "@jest/globals": "^29.7.0",
        "@jest/source-map": "^29.6.3",
        "@jest/test-result": "^29.7.0",
        "@jest/transform": "^29.7.0",
        "@jest/types": "^29.6.3",
        "@types/node": "*",
        "chalk": "^4.0.0",
        "cjs-module-lexer": "^1.0.0",
        "collect-v8-coverage": "^1.0.0",
        "glob": "^7.1.3",
        "graceful-fs": "^4.2.9",
        "jest-haste-map": "^29.7.0",
        "jest-message-util": "^29.7.0",
        "jest-mock": "^29.7.0",
        "jest-regex-util": "^29.6.3",
        "jest-resolve": "^29.7.0",
        "jest-snapshot": "^29.7.0",
        "jest-util": "^29.7.0",
        "slash": "^3.0.0",
        "strip-bom": "^4.0.0"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/jest-runtime/node_modules/slash": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/slash/-/slash-3.0.0.tgz",
      "integrity": "sha512-g9Q1haeby36OSStwb4ntCGGGaKsaVSjQ68fBxoQcutl5fS1vuY18H3wSt3jFyFtrkx+Kz0V1G85A4MyAdDMi2Q==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/jest-snapshot": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jest-snapshot/-/jest-snapshot-29.7.0.tgz",
      "integrity": "sha512-Rm0BMWtxBcioHr1/OX5YCP8Uov4riHvKPknOGs804Zg9JGZgmIBkbtlxJC/7Z4msKYVbIJtfU+tKb8xlYNfdkw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/core": "^7.11.6",
        "@babel/generator": "^7.7.2",
        "@babel/plugin-syntax-jsx": "^7.7.2",
        "@babel/plugin-syntax-typescript": "^7.7.2",
        "@babel/types": "^7.3.3",
        "@jest/expect-utils": "^29.7.0",
        "@jest/transform": "^29.7.0",
        "@jest/types": "^29.6.3",
        "babel-preset-current-node-syntax": "^1.0.0",
        "chalk": "^4.0.0",
        "expect": "^29.7.0",
        "graceful-fs": "^4.2.9",
        "jest-diff": "^29.7.0",
        "jest-get-type": "^29.6.3",
        "jest-matcher-utils": "^29.7.0",
        "jest-message-util": "^29.7.0",
        "jest-util": "^29.7.0",
        "natural-compare": "^1.4.0",
        "pretty-format": "^29.7.0",
        "semver": "^7.5.3"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/jest-sonar": {
      "version": "0.2.16",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jest-sonar/-/jest-sonar-0.2.16.tgz",
      "integrity": "sha512-ES6Z9BbIVDELtbz+/b6pv41B2qOfp38cQpoCLqei21FtlkG/GzhyQ0M3egEIM+erpJOkpRKM8Tc8/YQtHdiTXA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "entities": "4.3.0",
        "strip-ansi": "6.0.1"
      }
    },
    "node_modules/jest-sonar/node_modules/entities": {
      "version": "4.3.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/entities/-/entities-4.3.0.tgz",
      "integrity": "sha512-/iP1rZrSEJ0DTlPiX+jbzlA3eVkY/e8L8SozroF395fIqE3TYF/Nz7YOMAawta+vLmyJ/hkGNNPcSbMADCCXbg==",
      "dev": true,
      "license": "BSD-2-Clause",
      "engines": {
        "node": ">=0.12"
      },
      "funding": {
        "url": "https://github.com/fb55/entities?sponsor=1"
      }
    },
    "node_modules/jest-util": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jest-util/-/jest-util-29.7.0.tgz",
      "integrity": "sha512-z6EbKajIpqGKU56y5KBUgy1dt1ihhQJgWzUlZHArA/+X2ad7Cb5iF+AK1EWVL/Bo7Rz9uurpqw6SiBCefUbCGA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@jest/types": "^29.6.3",
        "@types/node": "*",
        "chalk": "^4.0.0",
        "ci-info": "^3.2.0",
        "graceful-fs": "^4.2.9",
        "picomatch": "^2.2.3"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/jest-util/node_modules/picomatch": {
      "version": "2.3.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/picomatch/-/picomatch-2.3.2.tgz",
      "integrity": "sha512-V7+vQEJ06Z+c5tSye8S+nHUfI51xoXIXjHQ99cQtKUkQqqO1kO/KCJUfZXuB47h/YBlDhah2H3hdUGXn8ie0oA==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8.6"
      },
      "funding": {
        "url": "https://github.com/sponsors/jonschlinkert"
      }
    },
    "node_modules/jest-validate": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jest-validate/-/jest-validate-29.7.0.tgz",
      "integrity": "sha512-ZB7wHqaRGVw/9hST/OuFUReG7M8vKeq0/J2egIGLdvjHCmYqGARhzXmtgi+gVeZ5uXFF219aOc3Ls2yLg27tkw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@jest/types": "^29.6.3",
        "camelcase": "^6.2.0",
        "chalk": "^4.0.0",
        "jest-get-type": "^29.6.3",
        "leven": "^3.1.0",
        "pretty-format": "^29.7.0"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/jest-validate/node_modules/camelcase": {
      "version": "6.3.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/camelcase/-/camelcase-6.3.0.tgz",
      "integrity": "sha512-Gmy6FhYlCY7uOElZUSbxo2UCDH8owEk996gkbrpsgGtrJLM3J7jGxl9Ic7Qwwj4ivOE5AWZWRMecDdF7hqGjFA==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=10"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/jest-watcher": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jest-watcher/-/jest-watcher-29.7.0.tgz",
      "integrity": "sha512-49Fg7WXkU3Vl2h6LbLtMQ/HyB6rXSIX7SqvBLQmssRBGN9I0PNvPmAmCWSOY6SOvrjhI/F7/bGAv9RtnsPA03g==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@jest/test-result": "^29.7.0",
        "@jest/types": "^29.6.3",
        "@types/node": "*",
        "ansi-escapes": "^4.2.1",
        "chalk": "^4.0.0",
        "emittery": "^0.13.1",
        "jest-util": "^29.7.0",
        "string-length": "^4.0.1"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/jest-worker": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jest-worker/-/jest-worker-29.7.0.tgz",
      "integrity": "sha512-eIz2msL/EzL9UFTFFx7jBTkeZfku0yUAyZZZmJ93H2TYEiroIx2PQjEXcwYtYl8zXCxb+PAmA2hLIt/6ZEkPHw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/node": "*",
        "jest-util": "^29.7.0",
        "merge-stream": "^2.0.0",
        "supports-color": "^8.0.0"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/jest-worker/node_modules/supports-color": {
      "version": "8.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/supports-color/-/supports-color-8.1.1.tgz",
      "integrity": "sha512-MpUEN2OodtUzxvKQl72cUF7RQ5EiHsGvSsVG0ia9c5RbWGL2CI4C7EpPS8UTBIplnlzZiNuV56w+FuNxy3ty2Q==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "has-flag": "^4.0.0"
      },
      "engines": {
        "node": ">=10"
      },
      "funding": {
        "url": "https://github.com/chalk/supports-color?sponsor=1"
      }
    },
    "node_modules/jiti": {
      "version": "1.21.7",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jiti/-/jiti-1.21.7.tgz",
      "integrity": "sha512-/imKNG4EbWNrVjoNC/1H5/9GFy+tqjGBHCaSsN+P2RnPqjsLmv6UD3Ej+Kj8nBWaRAwyk7kK5ZUc+OEatnTR3A==",
      "dev": true,
      "license": "MIT",
      "bin": {
        "jiti": "bin/jiti.js"
      }
    },
    "node_modules/js-tokens": {
      "version": "4.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/js-tokens/-/js-tokens-4.0.0.tgz",
      "integrity": "sha512-RdJUflcE3cUzKiMqQgsCu06FPu9UdIJO0beYbPhHN4k6apgJtifcoCtT9bcxOpYBtpD2kCM6Sbzg4CausW/PKQ==",
      "license": "MIT"
    },
    "node_modules/js-yaml": {
      "version": "3.14.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/js-yaml/-/js-yaml-3.14.2.tgz",
      "integrity": "sha512-PMSmkqxr106Xa156c2M265Z+FTrPl+oxd/rgOQy2tijQeK5TxQ43psO1ZCwhVOSdnn+RzkzlRz/eY4BgJBYVpg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "argparse": "^1.0.7",
        "esprima": "^4.0.0"
      },
      "bin": {
        "js-yaml": "bin/js-yaml.js"
      }
    },
    "node_modules/jsdom": {
      "version": "20.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jsdom/-/jsdom-20.0.3.tgz",
      "integrity": "sha512-SYhBvTh89tTfCD/CRdSOm13mOBa42iTaTyfyEWBdKcGdPxPtLFBXuHR8XHb33YNYaP+lLbmSvBTsnoesCNJEsQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "abab": "^2.0.6",
        "acorn": "^8.8.1",
        "acorn-globals": "^7.0.0",
        "cssom": "^0.5.0",
        "cssstyle": "^2.3.0",
        "data-urls": "^3.0.2",
        "decimal.js": "^10.4.2",
        "domexception": "^4.0.0",
        "escodegen": "^2.0.0",
        "form-data": "^4.0.0",
        "html-encoding-sniffer": "^3.0.0",
        "http-proxy-agent": "^5.0.0",
        "https-proxy-agent": "^5.0.1",
        "is-potential-custom-element-name": "^1.0.1",
        "nwsapi": "^2.2.2",
        "parse5": "^7.1.1",
        "saxes": "^6.0.0",
        "symbol-tree": "^3.2.4",
        "tough-cookie": "^4.1.2",
        "w3c-xmlserializer": "^4.0.0",
        "webidl-conversions": "^7.0.0",
        "whatwg-encoding": "^2.0.0",
        "whatwg-mimetype": "^3.0.0",
        "whatwg-url": "^11.0.0",
        "ws": "^8.11.0",
        "xml-name-validator": "^4.0.0"
      },
      "engines": {
        "node": ">=14"
      },
      "peerDependencies": {
        "canvas": "^2.5.0"
      },
      "peerDependenciesMeta": {
        "canvas": {
          "optional": true
        }
      }
    },
    "node_modules/jsdom/node_modules/agent-base": {
      "version": "6.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/agent-base/-/agent-base-6.0.2.tgz",
      "integrity": "sha512-RZNwNclF7+MS/8bDg70amg32dyeZGZxiDuQmZxKLAlQjr3jGyLx+4Kkk58UO7D2QdgFIQCovuSuZESne6RG6XQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "debug": "4"
      },
      "engines": {
        "node": ">= 6.0.0"
      }
    },
    "node_modules/jsdom/node_modules/https-proxy-agent": {
      "version": "5.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/https-proxy-agent/-/https-proxy-agent-5.0.1.tgz",
      "integrity": "sha512-dFcAjpTQFgoLMzC2VwU+C/CbS7uRL0lWmxDITmqm7C+7F0Odmj6s9l6alZc6AELXhrnggM2CeWSXHGOdX2YtwA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "agent-base": "6",
        "debug": "4"
      },
      "engines": {
        "node": ">= 6"
      }
    },
    "node_modules/jsesc": {
      "version": "3.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jsesc/-/jsesc-3.1.0.tgz",
      "integrity": "sha512-/sM3dO2FOzXjKQhJuo0Q173wf2KOo8t4I8vHy6lF9poUp7bKT0/NHE8fPX23PwfhnykfqnC2xRxOnVw5XuGIaA==",
      "license": "MIT",
      "bin": {
        "jsesc": "bin/jsesc"
      },
      "engines": {
        "node": ">=6"
      }
    },
    "node_modules/json-parse-even-better-errors": {
      "version": "4.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/json-parse-even-better-errors/-/json-parse-even-better-errors-4.0.0.tgz",
      "integrity": "sha512-lR4MXjGNgkJc7tkQ97kb2nuEMnNCyU//XYVH0MKTGcXEiSudQ5MKGKen3C5QubYy0vmq+JGitUg92uuywGEwIA==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/json-schema-traverse": {
      "version": "1.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/json-schema-traverse/-/json-schema-traverse-1.0.0.tgz",
      "integrity": "sha512-NM8/P9n3XjXhIZn1lLhkFaACTOURQXjWhV4BA/RnOv8xvgqtqpAX9IO4mRQxSx1Rlo4tqzeqb0sOlruaOy3dug==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/json5": {
      "version": "2.2.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/json5/-/json5-2.2.3.tgz",
      "integrity": "sha512-XmOWe7eyHYH14cLdVPoyg+GOH3rYX++KpzrylJwSW98t3Nk+U8XOl8FWKOgwtzdb8lXGf6zYwDUzeHMWfxasyg==",
      "license": "MIT",
      "bin": {
        "json5": "lib/cli.js"
      },
      "engines": {
        "node": ">=6"
      }
    },
    "node_modules/jsonc-parser": {
      "version": "3.3.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jsonc-parser/-/jsonc-parser-3.3.1.tgz",
      "integrity": "sha512-HUgH65KyejrUFPvHFPbqOY0rsFip3Bo5wb4ngvdi1EpCYWUQDC5V+Y7mZws+DLkr4M//zQJoanu1SP+87Dv1oQ==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/jsonparse": {
      "version": "1.3.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jsonparse/-/jsonparse-1.3.1.tgz",
      "integrity": "sha512-POQXvpdL69+CluYsillJ7SUhKvytYjW9vG/GKpnf+xP8UWgYEM/RaMzHHofbALDiKbbP1W8UEYmgGl39WkPZsg==",
      "dev": true,
      "engines": [
        "node >= 0.2.0"
      ],
      "license": "MIT"
    },
    "node_modules/karma-source-map-support": {
      "version": "1.4.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/karma-source-map-support/-/karma-source-map-support-1.4.0.tgz",
      "integrity": "sha512-RsBECncGO17KAoJCYXjv+ckIz+Ii9NCi+9enk+rq6XC81ezYkb4/RHE6CTXdA7IOJqoF3wcaLfVG0CPmE5ca6A==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "source-map-support": "^0.5.5"
      }
    },
    "node_modules/katex": {
      "version": "0.16.44",
      "resolved": "http://binario.caixa:8081/repository/npm-all/katex/-/katex-0.16.44.tgz",
      "integrity": "sha512-EkxoDTk8ufHqHlf9QxGwcxeLkWRR3iOuYfRpfORgYfqc8s13bgb+YtRY59NK5ZpRaCwq1kqA6a5lpX8C/eLphQ==",
      "funding": [
        "https://opencollective.com/katex",
        "https://github.com/sponsors/katex"
      ],
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "commander": "^8.3.0"
      },
      "bin": {
        "katex": "cli.js"
      }
    },
    "node_modules/keycloak-angular": {
      "version": "19.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/keycloak-angular/-/keycloak-angular-19.0.2.tgz",
      "integrity": "sha512-GzQKC/jFJLZRmUxWOEXkla+6shDAZFAOe6Z3qsw916Ckb/UhZnO704HMZrd8xyVB3RH6xOcNCp45oHmIiqJ7dA==",
      "license": "MIT",
      "dependencies": {
        "tslib": "^2.3.1"
      },
      "peerDependencies": {
        "@angular/common": "^19",
        "@angular/core": "^19",
        "@angular/router": "^19",
        "keycloak-js": "^18 || ^19 || ^20 || ^21 || ^22 || ^23 || ^24 || ^25 || ^26"
      }
    },
    "node_modules/keycloak-js": {
      "version": "26.2.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/keycloak-js/-/keycloak-js-26.2.3.tgz",
      "integrity": "sha512-widjzw/9T6bHRgEp6H/Se3NCCarU7u5CwFKBcwtu7xfA1IfdZb+7Q7/KGusAnBo34Vtls8Oz9vzSqkQvQ7+b4Q==",
      "license": "Apache-2.0",
      "workspaces": [
        "test"
      ]
    },
    "node_modules/khroma": {
      "version": "2.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/khroma/-/khroma-2.1.0.tgz",
      "integrity": "sha512-Ls993zuzfayK269Svk9hzpeGUKob/sIgZzyHYdjQoAdQetRKpOLj+k/QQQ/6Qi0Yz65mlROrfd+Ev+1+7dz9Kw==",
      "optional": true
    },
    "node_modules/kind-of": {
      "version": "6.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/kind-of/-/kind-of-6.0.3.tgz",
      "integrity": "sha512-dcS1ul+9tmeD95T+x28/ehLgd9mENa3LsvDTtzm3vyBEO7RPptvAD+t44WVXaUjTBRcrpFeFlC8WCruUR456hw==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=0.10.0"
      }
    },
    "node_modules/kleur": {
      "version": "3.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/kleur/-/kleur-3.0.3.tgz",
      "integrity": "sha512-eTIzlVOSUR+JxdDFepEYcBMtZ9Qqdef+rnzWdRZuMbOywu5tO2w2N7rqjoANZ5k9vywhL6Br1VRjUIgTQx4E8w==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=6"
      }
    },
    "node_modules/langium": {
      "version": "4.2.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/langium/-/langium-4.2.1.tgz",
      "integrity": "sha512-zu9QWmjpzJcomzdJQAHgDVhLGq5bLosVak1KVa40NzQHXfqr4eAHupvnPOVXEoLkg6Ocefvf/93d//SB7du4YQ==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "chevrotain": "~11.1.1",
        "chevrotain-allstar": "~0.3.1",
        "vscode-languageserver": "~9.0.1",
        "vscode-languageserver-textdocument": "~1.0.11",
        "vscode-uri": "~3.1.0"
      },
      "engines": {
        "node": ">=20.10.0",
        "npm": ">=10.2.3"
      }
    },
    "node_modules/launch-editor": {
      "version": "2.13.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/launch-editor/-/launch-editor-2.13.2.tgz",
      "integrity": "sha512-4VVDnbOpLXy/s8rdRCSXb+zfMeFR0WlJWpET1iA9CQdlZDfwyLjUuGQzXU4VeOoey6AicSAluWan7Etga6Kcmg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "picocolors": "^1.1.1",
        "shell-quote": "^1.8.3"
      }
    },
    "node_modules/layout-base": {
      "version": "1.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/layout-base/-/layout-base-1.0.2.tgz",
      "integrity": "sha512-8h2oVEZNktL4BH2JCOI90iD1yXwL6iNW7KcCKT2QZgQJR2vbqDsldCTPRU9NifTCqHZci57XvQQ15YTu+sTYPg==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/less": {
      "version": "4.2.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/less/-/less-4.2.2.tgz",
      "integrity": "sha512-tkuLHQlvWUTeQ3doAqnHbNn8T6WX1KA8yvbKG9x4VtKtIjHsVKQZCH11zRgAfbDAXC2UNIg/K9BYAAcEzUIrNg==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "copy-anything": "^2.0.1",
        "parse-node-version": "^1.0.1",
        "tslib": "^2.3.0"
      },
      "bin": {
        "lessc": "bin/lessc"
      },
      "engines": {
        "node": ">=6"
      },
      "optionalDependencies": {
        "errno": "^0.1.1",
        "graceful-fs": "^4.1.2",
        "image-size": "~0.5.0",
        "make-dir": "^2.1.0",
        "mime": "^1.4.1",
        "needle": "^3.1.0",
        "source-map": "~0.6.0"
      }
    },
    "node_modules/less-loader": {
      "version": "12.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/less-loader/-/less-loader-12.2.0.tgz",
      "integrity": "sha512-MYUxjSQSBUQmowc0l5nPieOYwMzGPUaTzB6inNW/bdPEG9zOL3eAAD1Qw5ZxSPk7we5dMojHwNODYMV1hq4EVg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 18.12.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/webpack"
      },
      "peerDependencies": {
        "@rspack/core": "0.x || 1.x",
        "less": "^3.5.0 || ^4.0.0",
        "webpack": "^5.0.0"
      },
      "peerDependenciesMeta": {
        "@rspack/core": {
          "optional": true
        },
        "webpack": {
          "optional": true
        }
      }
    },
    "node_modules/less/node_modules/make-dir": {
      "version": "2.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/make-dir/-/make-dir-2.1.0.tgz",
      "integrity": "sha512-LS9X+dc8KLxXCb8dni79fLIIUA5VyZoyjSMCwTluaXA0o27cCK0bhXkpgw+sTXVpPy/lSO57ilRixqk0vDmtRA==",
      "dev": true,
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "pify": "^4.0.1",
        "semver": "^5.6.0"
      },
      "engines": {
        "node": ">=6"
      }
    },
    "node_modules/less/node_modules/semver": {
      "version": "5.7.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/semver/-/semver-5.7.2.tgz",
      "integrity": "sha512-cBznnQ9KjJqU67B52RMC65CMarK2600WFnbkcaiwWq3xy/5haFJlshgnpjovMVJ+Hff49d8GEn0b87C5pDQ10g==",
      "dev": true,
      "license": "ISC",
      "optional": true,
      "bin": {
        "semver": "bin/semver"
      }
    },
    "node_modules/less/node_modules/source-map": {
      "version": "0.6.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/source-map/-/source-map-0.6.1.tgz",
      "integrity": "sha512-UjgapumWlbMhkBgzT7Ykc5YXUT46F0iKu8SGXq0bcwP5dz/h0Plj6enJqjz1Zbq2l5WaqYnrVbwWOWMyF3F47g==",
      "dev": true,
      "license": "BSD-3-Clause",
      "optional": true,
      "engines": {
        "node": ">=0.10.0"
      }
    },
    "node_modules/leven": {
      "version": "3.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/leven/-/leven-3.1.0.tgz",
      "integrity": "sha512-qsda+H8jTaUaN/x5vzW2rzc+8Rw4TAQ/4KjB46IwK5VH+IlVeeeje/EoZRpiXvIqjFgK84QffqPztGI3VBLG1A==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=6"
      }
    },
    "node_modules/license-webpack-plugin": {
      "version": "4.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/license-webpack-plugin/-/license-webpack-plugin-4.0.2.tgz",
      "integrity": "sha512-771TFWFD70G1wLTC4oU2Cw4qvtmNrIw+wRvBtn+okgHl7slJVi7zfNcdmqDL72BojM30VNJ2UHylr1o77U37Jw==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "webpack-sources": "^3.0.0"
      },
      "peerDependenciesMeta": {
        "webpack": {
          "optional": true
        },
        "webpack-sources": {
          "optional": true
        }
      }
    },
    "node_modules/lines-and-columns": {
      "version": "1.2.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/lines-and-columns/-/lines-and-columns-1.2.4.tgz",
      "integrity": "sha512-7ylylesZQ/PV29jhEDl3Ufjo6ZX7gCqJr5F7PKrqc93v7fzSymt1BpwEU8nAUXs8qzzvqhbjhK5QZg6Mt/HkBg==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/listr2": {
      "version": "8.2.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/listr2/-/listr2-8.2.5.tgz",
      "integrity": "sha512-iyAZCeyD+c1gPyE9qpFu8af0Y+MRtmKOncdGoA2S5EY8iFq99dmmvkNnHiWo+pj0s7yH7l3KPIgee77tKpXPWQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "cli-truncate": "^4.0.0",
        "colorette": "^2.0.20",
        "eventemitter3": "^5.0.1",
        "log-update": "^6.1.0",
        "rfdc": "^1.4.1",
        "wrap-ansi": "^9.0.0"
      },
      "engines": {
        "node": ">=18.0.0"
      }
    },
    "node_modules/listr2/node_modules/ansi-regex": {
      "version": "6.2.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ansi-regex/-/ansi-regex-6.2.2.tgz",
      "integrity": "sha512-Bq3SmSpyFHaWjPk8If9yc6svM8c56dB5BAtW4Qbw5jHTwwXXcTLoRMkpDJp6VL0XzlWaCHTXrkFURMYmD0sLqg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=12"
      },
      "funding": {
        "url": "https://github.com/chalk/ansi-regex?sponsor=1"
      }
    },
    "node_modules/listr2/node_modules/ansi-styles": {
      "version": "6.2.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ansi-styles/-/ansi-styles-6.2.3.tgz",
      "integrity": "sha512-4Dj6M28JB+oAH8kFkTLUo+a2jwOFkuqb3yucU0CANcRRUbxS0cP0nZYCGjcc3BNXwRIsUVmDGgzawme7zvJHvg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=12"
      },
      "funding": {
        "url": "https://github.com/chalk/ansi-styles?sponsor=1"
      }
    },
    "node_modules/listr2/node_modules/eventemitter3": {
      "version": "5.0.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/eventemitter3/-/eventemitter3-5.0.4.tgz",
      "integrity": "sha512-mlsTRyGaPBjPedk6Bvw+aqbsXDtoAyAzm5MO7JgU+yVRyMQ5O8bD4Kcci7BS85f93veegeCPkL8R4GLClnjLFw==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/listr2/node_modules/strip-ansi": {
      "version": "7.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/strip-ansi/-/strip-ansi-7.2.0.tgz",
      "integrity": "sha512-yDPMNjp4WyfYBkHnjIRLfca1i6KMyGCtsVgoKe/z1+6vukgaENdgGBZt+ZmKPc4gavvEZ5OgHfHdrazhgNyG7w==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "ansi-regex": "^6.2.2"
      },
      "engines": {
        "node": ">=12"
      },
      "funding": {
        "url": "https://github.com/chalk/strip-ansi?sponsor=1"
      }
    },
    "node_modules/listr2/node_modules/wrap-ansi": {
      "version": "9.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/wrap-ansi/-/wrap-ansi-9.0.2.tgz",
      "integrity": "sha512-42AtmgqjV+X1VpdOfyTGOYRi0/zsoLqtXQckTmqTeybT+BDIbM/Guxo7x3pE2vtpr1ok6xRqM9OpBe+Jyoqyww==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "ansi-styles": "^6.2.1",
        "string-width": "^7.0.0",
        "strip-ansi": "^7.1.0"
      },
      "engines": {
        "node": ">=18"
      },
      "funding": {
        "url": "https://github.com/chalk/wrap-ansi?sponsor=1"
      }
    },
    "node_modules/lmdb": {
      "version": "3.2.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/lmdb/-/lmdb-3.2.6.tgz",
      "integrity": "sha512-SuHqzPl7mYStna8WRotY8XX/EUZBjjv3QyKIByeCLFfC9uXT/OIHByEcA07PzbMfQAM0KYJtLgtpMRlIe5dErQ==",
      "dev": true,
      "hasInstallScript": true,
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "msgpackr": "^1.11.2",
        "node-addon-api": "^6.1.0",
        "node-gyp-build-optional-packages": "5.2.2",
        "ordered-binary": "^1.5.3",
        "weak-lru-cache": "^1.2.2"
      },
      "bin": {
        "download-lmdb-prebuilds": "bin/download-prebuilds.js"
      },
      "optionalDependencies": {
        "@lmdb/lmdb-darwin-arm64": "3.2.6",
        "@lmdb/lmdb-darwin-x64": "3.2.6",
        "@lmdb/lmdb-linux-arm": "3.2.6",
        "@lmdb/lmdb-linux-arm64": "3.2.6",
        "@lmdb/lmdb-linux-x64": "3.2.6",
        "@lmdb/lmdb-win32-x64": "3.2.6"
      }
    },
    "node_modules/loader-runner": {
      "version": "4.3.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/loader-runner/-/loader-runner-4.3.1.tgz",
      "integrity": "sha512-IWqP2SCPhyVFTBtRcgMHdzlf9ul25NwaFx4wCEH/KjAXuuHY4yNjvPXsBokp8jCB936PyWRaPKUNh8NvylLp2Q==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=6.11.5"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/webpack"
      }
    },
    "node_modules/loader-utils": {
      "version": "3.3.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/loader-utils/-/loader-utils-3.3.1.tgz",
      "integrity": "sha512-FMJTLMXfCLMLfJxcX9PFqX5qD88Z5MRGaZCVzfuqeZSPsyiBzs+pahDQjbIWz2QIzPZz0NX9Zy4FX3lmK6YHIg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 12.13.0"
      }
    },
    "node_modules/locate-path": {
      "version": "5.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/locate-path/-/locate-path-5.0.0.tgz",
      "integrity": "sha512-t7hw9pI+WvuwNJXwk5zVHpyhIqzg2qTlklJOf0mVxGSbe3Fp2VieZcduNYjaLDoy6p9uGpQEGWG87WpMKlNq8g==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "p-locate": "^4.1.0"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/lodash-es": {
      "version": "4.17.23",
      "resolved": "http://binario.caixa:8081/repository/npm-all/lodash-es/-/lodash-es-4.17.23.tgz",
      "integrity": "sha512-kVI48u3PZr38HdYz98UmfPnXl2DXrpdctLrFLCd3kOx1xUkOmpFPx7gCWWM5MPkL/fD8zb+Ph0QzjGFs4+hHWg==",
      "license": "MIT"
    },
    "node_modules/lodash.clonedeep": {
      "version": "4.5.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/lodash.clonedeep/-/lodash.clonedeep-4.5.0.tgz",
      "integrity": "sha512-H5ZhCF25riFd9uB5UCkVKo61m3S/xZk1x4wA6yp/L3RFP6Z/eHH1ymQcGLo7J3GMPfm0V/7m1tryHuGVxpqEBQ==",
      "license": "MIT"
    },
    "node_modules/lodash.debounce": {
      "version": "4.0.8",
      "resolved": "http://binario.caixa:8081/repository/npm-all/lodash.debounce/-/lodash.debounce-4.0.8.tgz",
      "integrity": "sha512-FT1yDzDYEoYWhnSGnpE/4Kj1fLZkDFyqRb7fNt6FdYOSxlUWAtp42Eh6Wb0rGIv/m9Bgo7x4GhQbm5Ys4SG5ow==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/lodash.isequal": {
      "version": "4.5.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/lodash.isequal/-/lodash.isequal-4.5.0.tgz",
      "integrity": "sha512-pDo3lu8Jhfjqls6GkMgpahsF9kCyayhgykjyLMNFTKWrpVdAQtYyB4muAMWozBB4ig/dtWAmsMxLEI8wuz+DYQ==",
      "deprecated": "This package is deprecated. Use require('node:util').isDeepStrictEqual instead.",
      "license": "MIT"
    },
    "node_modules/lodash.memoize": {
      "version": "4.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/lodash.memoize/-/lodash.memoize-4.1.2.tgz",
      "integrity": "sha512-t7j+NzmgnQzTAYXcsHYLgimltOV1MXHtlOWf6GjL9Kj8GK5FInw5JotxvbOs+IvV1/Dzo04/fCGfLVs7aXb4Ag==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/log-symbols": {
      "version": "4.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/log-symbols/-/log-symbols-4.1.0.tgz",
      "integrity": "sha512-8XPvpAA8uyhfteu8pIvQxpJZ7SYYdpUivZpGy6sFsBuKRY/7rQGavedeB8aK+Zkyq6upMFVL/9AW6vOYzfRyLg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "chalk": "^4.1.0",
        "is-unicode-supported": "^0.1.0"
      },
      "engines": {
        "node": ">=10"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/log-update": {
      "version": "6.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/log-update/-/log-update-6.1.0.tgz",
      "integrity": "sha512-9ie8ItPR6tjY5uYJh8K/Zrv/RMZ5VOlOWvtZdEHYSTFKZfIBPQa9tOAEeAWhd+AnIneLJ22w5fjOYtoutpWq5w==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "ansi-escapes": "^7.0.0",
        "cli-cursor": "^5.0.0",
        "slice-ansi": "^7.1.0",
        "strip-ansi": "^7.1.0",
        "wrap-ansi": "^9.0.0"
      },
      "engines": {
        "node": ">=18"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/log-update/node_modules/ansi-escapes": {
      "version": "7.3.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ansi-escapes/-/ansi-escapes-7.3.0.tgz",
      "integrity": "sha512-BvU8nYgGQBxcmMuEeUEmNTvrMVjJNSH7RgW24vXexN4Ven6qCvy4TntnvlnwnMLTVlcRQQdbRY8NKnaIoeWDNg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "environment": "^1.0.0"
      },
      "engines": {
        "node": ">=18"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/log-update/node_modules/ansi-regex": {
      "version": "6.2.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ansi-regex/-/ansi-regex-6.2.2.tgz",
      "integrity": "sha512-Bq3SmSpyFHaWjPk8If9yc6svM8c56dB5BAtW4Qbw5jHTwwXXcTLoRMkpDJp6VL0XzlWaCHTXrkFURMYmD0sLqg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=12"
      },
      "funding": {
        "url": "https://github.com/chalk/ansi-regex?sponsor=1"
      }
    },
    "node_modules/log-update/node_modules/ansi-styles": {
      "version": "6.2.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ansi-styles/-/ansi-styles-6.2.3.tgz",
      "integrity": "sha512-4Dj6M28JB+oAH8kFkTLUo+a2jwOFkuqb3yucU0CANcRRUbxS0cP0nZYCGjcc3BNXwRIsUVmDGgzawme7zvJHvg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=12"
      },
      "funding": {
        "url": "https://github.com/chalk/ansi-styles?sponsor=1"
      }
    },
    "node_modules/log-update/node_modules/is-fullwidth-code-point": {
      "version": "5.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/is-fullwidth-code-point/-/is-fullwidth-code-point-5.1.0.tgz",
      "integrity": "sha512-5XHYaSyiqADb4RnZ1Bdad6cPp8Toise4TzEjcOYDHZkTCbKgiUl7WTUCpNWHuxmDt91wnsZBc9xinNzopv3JMQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "get-east-asian-width": "^1.3.1"
      },
      "engines": {
        "node": ">=18"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/log-update/node_modules/slice-ansi": {
      "version": "7.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/slice-ansi/-/slice-ansi-7.1.2.tgz",
      "integrity": "sha512-iOBWFgUX7caIZiuutICxVgX1SdxwAVFFKwt1EvMYYec/NWO5meOJ6K5uQxhrYBdQJne4KxiqZc+KptFOWFSI9w==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "ansi-styles": "^6.2.1",
        "is-fullwidth-code-point": "^5.0.0"
      },
      "engines": {
        "node": ">=18"
      },
      "funding": {
        "url": "https://github.com/chalk/slice-ansi?sponsor=1"
      }
    },
    "node_modules/log-update/node_modules/strip-ansi": {
      "version": "7.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/strip-ansi/-/strip-ansi-7.2.0.tgz",
      "integrity": "sha512-yDPMNjp4WyfYBkHnjIRLfca1i6KMyGCtsVgoKe/z1+6vukgaENdgGBZt+ZmKPc4gavvEZ5OgHfHdrazhgNyG7w==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "ansi-regex": "^6.2.2"
      },
      "engines": {
        "node": ">=12"
      },
      "funding": {
        "url": "https://github.com/chalk/strip-ansi?sponsor=1"
      }
    },
    "node_modules/log-update/node_modules/wrap-ansi": {
      "version": "9.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/wrap-ansi/-/wrap-ansi-9.0.2.tgz",
      "integrity": "sha512-42AtmgqjV+X1VpdOfyTGOYRi0/zsoLqtXQckTmqTeybT+BDIbM/Guxo7x3pE2vtpr1ok6xRqM9OpBe+Jyoqyww==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "ansi-styles": "^6.2.1",
        "string-width": "^7.0.0",
        "strip-ansi": "^7.1.0"
      },
      "engines": {
        "node": ">=18"
      },
      "funding": {
        "url": "https://github.com/chalk/wrap-ansi?sponsor=1"
      }
    },
    "node_modules/lru-cache": {
      "version": "5.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/lru-cache/-/lru-cache-5.1.1.tgz",
      "integrity": "sha512-KpNARQA3Iwv+jTA0utUVVbrh+Jlrr1Fv0e56GGzAFOXN7dk/FviaDW8LHmK52DlcH4WP2n6gI8vN1aesBFgo9w==",
      "license": "ISC",
      "dependencies": {
        "yallist": "^3.0.2"
      }
    },
    "node_modules/magic-string": {
      "version": "0.30.17",
      "resolved": "http://binario.caixa:8081/repository/npm-all/magic-string/-/magic-string-0.30.17.tgz",
      "integrity": "sha512-sNPKHvyjVf7gyjwS4xGTaW/mCnF8wnjtifKBEhxfZ7E/S8tQ0rssrwGNn6q8JH/ohItJfSQp9mBtQYuTlH5QnA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@jridgewell/sourcemap-codec": "^1.5.0"
      }
    },
    "node_modules/make-dir": {
      "version": "4.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/make-dir/-/make-dir-4.0.0.tgz",
      "integrity": "sha512-hXdUTZYIVOt1Ex//jAQi+wTZZpUpwBj/0QsOzqegb3rGMMeJiSEu5xLHnYfBrRV4RH2+OCSOO95Is/7x1WJ4bw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "semver": "^7.5.3"
      },
      "engines": {
        "node": ">=10"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/make-error": {
      "version": "1.3.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/make-error/-/make-error-1.3.6.tgz",
      "integrity": "sha512-s8UhlNe7vPKomQhC1qFelMokr/Sc3AgNbso3n74mVPA5LTZwkB9NlXf4XPamLxJE8h0gh73rM94xvwRT2CVInw==",
      "dev": true,
      "license": "ISC"
    },
    "node_modules/make-fetch-happen": {
      "version": "14.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/make-fetch-happen/-/make-fetch-happen-14.0.3.tgz",
      "integrity": "sha512-QMjGbFTP0blj97EeidG5hk/QhKQ3T4ICckQGLgz38QF7Vgbk6e6FTARN8KhKxyBbWn8R0HU+bnw8aSoFPD4qtQ==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "@npmcli/agent": "^3.0.0",
        "cacache": "^19.0.1",
        "http-cache-semantics": "^4.1.1",
        "minipass": "^7.0.2",
        "minipass-fetch": "^4.0.0",
        "minipass-flush": "^1.0.5",
        "minipass-pipeline": "^1.2.4",
        "negotiator": "^1.0.0",
        "proc-log": "^5.0.0",
        "promise-retry": "^2.0.1",
        "ssri": "^12.0.0"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/makeerror": {
      "version": "1.0.12",
      "resolved": "http://binario.caixa:8081/repository/npm-all/makeerror/-/makeerror-1.0.12.tgz",
      "integrity": "sha512-JmqCvUhmt43madlpFzG4BQzG2Z3m6tvQDNKdClZnO3VbIudJYmxsT0FNJMeiB2+JTSlTQTSbU8QdesVmwJcmLg==",
      "dev": true,
      "license": "BSD-3-Clause",
      "dependencies": {
        "tmpl": "1.0.5"
      }
    },
    "node_modules/marked": {
      "version": "15.0.12",
      "resolved": "http://binario.caixa:8081/repository/npm-all/marked/-/marked-15.0.12.tgz",
      "integrity": "sha512-8dD6FusOQSrpv9Z1rdNMdlSgQOIP880DHqnohobOmYLElGEqAL/JvxvuxZO16r4HtjTlfPRDC1hbvxC9dPN2nA==",
      "license": "MIT",
      "bin": {
        "marked": "bin/marked.js"
      },
      "engines": {
        "node": ">= 18"
      }
    },
    "node_modules/math-intrinsics": {
      "version": "1.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/math-intrinsics/-/math-intrinsics-1.1.0.tgz",
      "integrity": "sha512-/IXtbwEk5HTPyEwyKX6hGkYXxM9nbj64B+ilVJnC/R6B0pH5G4V3b0pVbL7DBj4tkhBAppbQUlf6F6Xl9LHu1g==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.4"
      }
    },
    "node_modules/media-typer": {
      "version": "0.3.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/media-typer/-/media-typer-0.3.0.tgz",
      "integrity": "sha512-dq+qelQ9akHpcOl/gUVRTxVIOkAJ1wR3QAvb4RsVjS8oVoFjDGTc679wJYmUmknUF5HwMLOgb5O+a3KxfWapPQ==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.6"
      }
    },
    "node_modules/memfs": {
      "version": "4.57.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/memfs/-/memfs-4.57.1.tgz",
      "integrity": "sha512-WvzrWPwMQT+PtbX2Et64R4qXKK0fj/8pO85MrUCzymX3twwCiJCdvntW3HdhG1teLJcHDDLIKx5+c3HckWYZtQ==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "@jsonjoy.com/fs-core": "4.57.1",
        "@jsonjoy.com/fs-fsa": "4.57.1",
        "@jsonjoy.com/fs-node": "4.57.1",
        "@jsonjoy.com/fs-node-builtins": "4.57.1",
        "@jsonjoy.com/fs-node-to-fsa": "4.57.1",
        "@jsonjoy.com/fs-node-utils": "4.57.1",
        "@jsonjoy.com/fs-print": "4.57.1",
        "@jsonjoy.com/fs-snapshot": "4.57.1",
        "@jsonjoy.com/json-pack": "^1.11.0",
        "@jsonjoy.com/util": "^1.9.0",
        "glob-to-regex.js": "^1.0.1",
        "thingies": "^2.5.0",
        "tree-dump": "^1.0.3",
        "tslib": "^2.0.0"
      },
      "funding": {
        "type": "github",
        "url": "https://github.com/sponsors/streamich"
      },
      "peerDependencies": {
        "tslib": "2"
      }
    },
    "node_modules/merge-descriptors": {
      "version": "1.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/merge-descriptors/-/merge-descriptors-1.0.3.tgz",
      "integrity": "sha512-gaNvAS7TZ897/rVaZ0nMtAyxNyi/pdbjbAwUpFQpN70GqnVfOiXpeUUMKRBmzXaSQ8DdTX4/0ms62r2K+hE6mQ==",
      "dev": true,
      "license": "MIT",
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/merge-stream": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/merge-stream/-/merge-stream-2.0.0.tgz",
      "integrity": "sha512-abv/qOcuPfk3URPfDzmZU1LKmuw8kT+0nIHvKrKgFrwifol/doWcdA4ZqsWQ8ENrFKkd67Mfpo/LovbIUsbt3w==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/merge2": {
      "version": "1.4.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/merge2/-/merge2-1.4.1.tgz",
      "integrity": "sha512-8q7VEgMJW4J8tcfVPy8g09NcQwZdbwFEqhe/WZkoIzjn/3TGDwtOCYtXGxA3O8tPzpczCCDgv+P2P5y00ZJOOg==",
      "license": "MIT",
      "engines": {
        "node": ">= 8"
      }
    },
    "node_modules/mermaid": {
      "version": "11.13.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/mermaid/-/mermaid-11.13.0.tgz",
      "integrity": "sha512-fEnci+Immw6lKMFI8sqzjlATTyjLkRa6axrEgLV2yHTfv8r+h1wjFbV6xeRtd4rUV1cS4EpR9rwp3Rci7TRWDw==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "@braintree/sanitize-url": "^7.1.1",
        "@iconify/utils": "^3.0.2",
        "@mermaid-js/parser": "^1.0.1",
        "@types/d3": "^7.4.3",
        "@upsetjs/venn.js": "^2.0.0",
        "cytoscape": "^3.33.1",
        "cytoscape-cose-bilkent": "^4.1.0",
        "cytoscape-fcose": "^2.2.0",
        "d3": "^7.9.0",
        "d3-sankey": "^0.12.3",
        "dagre-d3-es": "7.0.14",
        "dayjs": "^1.11.19",
        "dompurify": "^3.3.1",
        "katex": "^0.16.25",
        "khroma": "^2.1.0",
        "lodash-es": "^4.17.23",
        "marked": "^16.3.0",
        "roughjs": "^4.6.6",
        "stylis": "^4.3.6",
        "ts-dedent": "^2.2.0",
        "uuid": "^11.1.0"
      }
    },
    "node_modules/mermaid/node_modules/marked": {
      "version": "16.4.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/marked/-/marked-16.4.2.tgz",
      "integrity": "sha512-TI3V8YYWvkVf3KJe1dRkpnjs68JUPyEa5vjKrp1XEEJUAOaQc+Qj+L1qWbPd0SJuAdQkFU0h73sXXqwDYxsiDA==",
      "license": "MIT",
      "optional": true,
      "bin": {
        "marked": "bin/marked.js"
      },
      "engines": {
        "node": ">= 20"
      }
    },
    "node_modules/methods": {
      "version": "1.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/methods/-/methods-1.1.2.tgz",
      "integrity": "sha512-iclAHeNqNm68zFtnZ0e+1L2yUIdvzNoauKU4WBA3VvH/vPFieF7qfRlwUZU+DA9P9bPXIS90ulxoUoCH23sV2w==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.6"
      }
    },
    "node_modules/micromatch": {
      "version": "4.0.8",
      "resolved": "http://binario.caixa:8081/repository/npm-all/micromatch/-/micromatch-4.0.8.tgz",
      "integrity": "sha512-PXwfBhYu0hBCPw8Dn0E+WDYb7af3dSLVWKi3HGv84IdF4TyFoC0ysxFd0Goxw7nSv4T/PzEJQxsYsEiFCKo2BA==",
      "license": "MIT",
      "dependencies": {
        "braces": "^3.0.3",
        "picomatch": "^2.3.1"
      },
      "engines": {
        "node": ">=8.6"
      }
    },
    "node_modules/micromatch/node_modules/picomatch": {
      "version": "2.3.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/picomatch/-/picomatch-2.3.2.tgz",
      "integrity": "sha512-V7+vQEJ06Z+c5tSye8S+nHUfI51xoXIXjHQ99cQtKUkQqqO1kO/KCJUfZXuB47h/YBlDhah2H3hdUGXn8ie0oA==",
      "license": "MIT",
      "engines": {
        "node": ">=8.6"
      },
      "funding": {
        "url": "https://github.com/sponsors/jonschlinkert"
      }
    },
    "node_modules/mime": {
      "version": "1.6.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/mime/-/mime-1.6.0.tgz",
      "integrity": "sha512-x0Vn8spI+wuJ1O6S7gnbaQg8Pxh4NNHb7KSINmEWKiPE4RKOplvijn+NkmYmmRgP68mc70j2EbeTFRsrswaQeg==",
      "dev": true,
      "license": "MIT",
      "bin": {
        "mime": "cli.js"
      },
      "engines": {
        "node": ">=4"
      }
    },
    "node_modules/mime-db": {
      "version": "1.52.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/mime-db/-/mime-db-1.52.0.tgz",
      "integrity": "sha512-sPU4uV7dYlvtWJxwwxHD0PuihVNiE7TyAbQ5SWxDCB9mUYvOgroQOwYQQOKPJ8CIbE+1ETVlOoK1UC2nU3gYvg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.6"
      }
    },
    "node_modules/mime-types": {
      "version": "2.1.35",
      "resolved": "http://binario.caixa:8081/repository/npm-all/mime-types/-/mime-types-2.1.35.tgz",
      "integrity": "sha512-ZDY+bPm5zTTF+YpCrAU9nK0UgICYPT0QtT1NZWFv4s++TNkcgVaT0g6+4R2uI4MjQjzysHB1zxuWL50hzaeXiw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "mime-db": "1.52.0"
      },
      "engines": {
        "node": ">= 0.6"
      }
    },
    "node_modules/mimic-fn": {
      "version": "2.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/mimic-fn/-/mimic-fn-2.1.0.tgz",
      "integrity": "sha512-OqbOk5oEQeAZ8WXWydlu9HJjz9WVdEIvamMCcXmuqUYjTknH/sqsWvhQ3vgwKFRR1HpjvNBKQ37nbJgYzGqGcg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=6"
      }
    },
    "node_modules/mimic-function": {
      "version": "5.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/mimic-function/-/mimic-function-5.0.1.tgz",
      "integrity": "sha512-VP79XUPxV2CigYP3jWwAUFSku2aKqBH7uTAapFWCBqutsbmDo96KY5o8uh6U+/YSIn5OxJnXp73beVkpqMIGhA==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=18"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/mini-css-extract-plugin": {
      "version": "2.9.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/mini-css-extract-plugin/-/mini-css-extract-plugin-2.9.2.tgz",
      "integrity": "sha512-GJuACcS//jtq4kCtd5ii/M0SZf7OZRH+BxdqXZHaJfb8TJiVl+NgQRPwiYt2EuqeSkNydn/7vP+bcE27C5mb9w==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "schema-utils": "^4.0.0",
        "tapable": "^2.2.1"
      },
      "engines": {
        "node": ">= 12.13.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/webpack"
      },
      "peerDependencies": {
        "webpack": "^5.0.0"
      }
    },
    "node_modules/minimalistic-assert": {
      "version": "1.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/minimalistic-assert/-/minimalistic-assert-1.0.1.tgz",
      "integrity": "sha512-UtJcAD4yEaGtjPezWuO9wC4nwUnVH/8/Im3yEHQP4b67cXlD/Qr9hdITCU1xDbSEXg2XKNaP8jsReV7vQd00/A==",
      "dev": true,
      "license": "ISC"
    },
    "node_modules/minimatch": {
      "version": "3.1.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/minimatch/-/minimatch-3.1.5.tgz",
      "integrity": "sha512-VgjWUsnnT6n+NUk6eZq77zeFdpW2LWDzP6zFGrCbHXiYNul5Dzqk2HHQ5uFH2DNW5Xbp8+jVzaeNt94ssEEl4w==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "brace-expansion": "^1.1.7"
      },
      "engines": {
        "node": "*"
      }
    },
    "node_modules/minimist": {
      "version": "1.2.8",
      "resolved": "http://binario.caixa:8081/repository/npm-all/minimist/-/minimist-1.2.8.tgz",
      "integrity": "sha512-2yyAR8qBkN3YuheJanUpWC5U3bb5osDywNB8RzDVlDwDHbocAJveqqj1u8+SVD7jkWT4yvsHCpWqqWqAxb0zCA==",
      "dev": true,
      "license": "MIT",
      "funding": {
        "url": "https://github.com/sponsors/ljharb"
      }
    },
    "node_modules/minipass": {
      "version": "7.1.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/minipass/-/minipass-7.1.3.tgz",
      "integrity": "sha512-tEBHqDnIoM/1rXME1zgka9g6Q2lcoCkxHLuc7ODJ5BxbP5d4c2Z5cGgtXAku59200Cx7diuHTOYfSBD8n6mm8A==",
      "dev": true,
      "license": "BlueOak-1.0.0",
      "engines": {
        "node": ">=16 || 14 >=14.17"
      }
    },
    "node_modules/minipass-collect": {
      "version": "2.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/minipass-collect/-/minipass-collect-2.0.1.tgz",
      "integrity": "sha512-D7V8PO9oaz7PWGLbCACuI1qEOsq7UKfLotx/C0Aet43fCUB/wfQ7DYeq2oR/svFJGYDHPr38SHATeaj/ZoKHKw==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "minipass": "^7.0.3"
      },
      "engines": {
        "node": ">=16 || 14 >=14.17"
      }
    },
    "node_modules/minipass-fetch": {
      "version": "4.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/minipass-fetch/-/minipass-fetch-4.0.1.tgz",
      "integrity": "sha512-j7U11C5HXigVuutxebFadoYBbd7VSdZWggSe64NVdvWNBqGAiXPL2QVCehjmw7lY1oF9gOllYbORh+hiNgfPgQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "minipass": "^7.0.3",
        "minipass-sized": "^1.0.3",
        "minizlib": "^3.0.1"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      },
      "optionalDependencies": {
        "encoding": "^0.1.13"
      }
    },
    "node_modules/minipass-flush": {
      "version": "1.0.7",
      "resolved": "http://binario.caixa:8081/repository/npm-all/minipass-flush/-/minipass-flush-1.0.7.tgz",
      "integrity": "sha512-TbqTz9cUwWyHS2Dy89P3ocAGUGxKjjLuR9z8w4WUTGAVgEj17/4nhgo2Du56i0Fm3Pm30g4iA8Lcqctc76jCzA==",
      "dev": true,
      "license": "BlueOak-1.0.0",
      "dependencies": {
        "minipass": "^3.0.0"
      },
      "engines": {
        "node": ">= 8"
      }
    },
    "node_modules/minipass-flush/node_modules/minipass": {
      "version": "3.3.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/minipass/-/minipass-3.3.6.tgz",
      "integrity": "sha512-DxiNidxSEK+tHG6zOIklvNOwm3hvCrbUrdtzY74U6HKTJxvIDfOUL5W5P2Ghd3DTkhhKPYGqeNUIh5qcM4YBfw==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "yallist": "^4.0.0"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/minipass-flush/node_modules/yallist": {
      "version": "4.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/yallist/-/yallist-4.0.0.tgz",
      "integrity": "sha512-3wdGidZyq5PB084XLES5TpOSRA3wjXAlIWMhum2kRcv/41Sn2emQ0dycQW4uZXLejwKvg6EsvbdlVL+FYEct7A==",
      "dev": true,
      "license": "ISC"
    },
    "node_modules/minipass-pipeline": {
      "version": "1.2.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/minipass-pipeline/-/minipass-pipeline-1.2.4.tgz",
      "integrity": "sha512-xuIq7cIOt09RPRJ19gdi4b+RiNvDFYe5JH+ggNvBqGqpQXcru3PcRmOZuHBKWK1Txf9+cQ+HMVN4d6z46LZP7A==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "minipass": "^3.0.0"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/minipass-pipeline/node_modules/minipass": {
      "version": "3.3.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/minipass/-/minipass-3.3.6.tgz",
      "integrity": "sha512-DxiNidxSEK+tHG6zOIklvNOwm3hvCrbUrdtzY74U6HKTJxvIDfOUL5W5P2Ghd3DTkhhKPYGqeNUIh5qcM4YBfw==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "yallist": "^4.0.0"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/minipass-pipeline/node_modules/yallist": {
      "version": "4.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/yallist/-/yallist-4.0.0.tgz",
      "integrity": "sha512-3wdGidZyq5PB084XLES5TpOSRA3wjXAlIWMhum2kRcv/41Sn2emQ0dycQW4uZXLejwKvg6EsvbdlVL+FYEct7A==",
      "dev": true,
      "license": "ISC"
    },
    "node_modules/minipass-sized": {
      "version": "1.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/minipass-sized/-/minipass-sized-1.0.3.tgz",
      "integrity": "sha512-MbkQQ2CTiBMlA2Dm/5cY+9SWFEN8pzzOXi6rlM5Xxq0Yqbda5ZQy9sU75a673FE9ZK0Zsbr6Y5iP6u9nktfg2g==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "minipass": "^3.0.0"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/minipass-sized/node_modules/minipass": {
      "version": "3.3.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/minipass/-/minipass-3.3.6.tgz",
      "integrity": "sha512-DxiNidxSEK+tHG6zOIklvNOwm3hvCrbUrdtzY74U6HKTJxvIDfOUL5W5P2Ghd3DTkhhKPYGqeNUIh5qcM4YBfw==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "yallist": "^4.0.0"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/minipass-sized/node_modules/yallist": {
      "version": "4.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/yallist/-/yallist-4.0.0.tgz",
      "integrity": "sha512-3wdGidZyq5PB084XLES5TpOSRA3wjXAlIWMhum2kRcv/41Sn2emQ0dycQW4uZXLejwKvg6EsvbdlVL+FYEct7A==",
      "dev": true,
      "license": "ISC"
    },
    "node_modules/minizlib": {
      "version": "3.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/minizlib/-/minizlib-3.1.0.tgz",
      "integrity": "sha512-KZxYo1BUkWD2TVFLr0MQoM8vUUigWD3LlD83a/75BqC+4qE0Hb1Vo5v1FgcfaNXvfXzr+5EhQ6ing/CaBijTlw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "minipass": "^7.1.2"
      },
      "engines": {
        "node": ">= 18"
      }
    },
    "node_modules/mkdirp": {
      "version": "1.0.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/mkdirp/-/mkdirp-1.0.4.tgz",
      "integrity": "sha512-vVqVZQyf3WLx2Shd0qJ9xuvqgAyKPLAiqITEtqW0oIUjzo3PePDd6fW9iFz30ef7Ysp/oiWqbhszeGWW2T6Gzw==",
      "dev": true,
      "license": "MIT",
      "bin": {
        "mkdirp": "bin/cmd.js"
      },
      "engines": {
        "node": ">=10"
      }
    },
    "node_modules/mlly": {
      "version": "1.8.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/mlly/-/mlly-1.8.2.tgz",
      "integrity": "sha512-d+ObxMQFmbt10sretNDytwt85VrbkhhUA/JBGm1MPaWJ65Cl4wOgLaB1NYvJSZ0Ef03MMEU/0xpPMXUIQ29UfA==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "acorn": "^8.16.0",
        "pathe": "^2.0.3",
        "pkg-types": "^1.3.1",
        "ufo": "^1.6.3"
      }
    },
    "node_modules/moment": {
      "version": "2.30.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/moment/-/moment-2.30.1.tgz",
      "integrity": "sha512-uEmtNhbDOrWPFS+hdjFCBfy9f2YoyzRpwcl+DqpC6taX21FzsTLQVbMV/W7PzNSX6x/bhC1zA3c2UQ5NzH6how==",
      "license": "MIT",
      "engines": {
        "node": "*"
      }
    },
    "node_modules/mrmime": {
      "version": "2.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/mrmime/-/mrmime-2.0.1.tgz",
      "integrity": "sha512-Y3wQdFg2Va6etvQ5I82yUhGdsKrcYox6p7FfL1LbK2J4V01F9TGlepTIhnK24t7koZibmg82KGglhA1XK5IsLQ==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=10"
      }
    },
    "node_modules/ms": {
      "version": "2.1.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ms/-/ms-2.1.3.tgz",
      "integrity": "sha512-6FlzubTLZG3J2a/NVCAleEhjzq5oxgHyaCU9yYXvcLsvoVaHJq/s5xXI6/XXP6tz7R9xAOtHnSO/tXtF3WRTlA==",
      "license": "MIT"
    },
    "node_modules/msgpackr": {
      "version": "1.11.9",
      "resolved": "http://binario.caixa:8081/repository/npm-all/msgpackr/-/msgpackr-1.11.9.tgz",
      "integrity": "sha512-FkoAAyyA6HM8wL882EcEyFZ9s7hVADSwG9xrVx3dxxNQAtgADTrJoEWivID82Iv1zWDsv/OtbrrcZAzGzOMdNw==",
      "dev": true,
      "license": "MIT",
      "optional": true,
      "optionalDependencies": {
        "msgpackr-extract": "^3.0.2"
      }
    },
    "node_modules/msgpackr-extract": {
      "version": "3.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/msgpackr-extract/-/msgpackr-extract-3.0.3.tgz",
      "integrity": "sha512-P0efT1C9jIdVRefqjzOQ9Xml57zpOXnIuS+csaB4MdZbTdmGDLo8XhzBG1N7aO11gKDDkJvBLULeFTo46wwreA==",
      "dev": true,
      "hasInstallScript": true,
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "node-gyp-build-optional-packages": "5.2.2"
      },
      "bin": {
        "download-msgpackr-prebuilds": "bin/download-prebuilds.js"
      },
      "optionalDependencies": {
        "@msgpackr-extract/msgpackr-extract-darwin-arm64": "3.0.3",
        "@msgpackr-extract/msgpackr-extract-darwin-x64": "3.0.3",
        "@msgpackr-extract/msgpackr-extract-linux-arm": "3.0.3",
        "@msgpackr-extract/msgpackr-extract-linux-arm64": "3.0.3",
        "@msgpackr-extract/msgpackr-extract-linux-x64": "3.0.3",
        "@msgpackr-extract/msgpackr-extract-win32-x64": "3.0.3"
      }
    },
    "node_modules/multicast-dns": {
      "version": "7.2.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/multicast-dns/-/multicast-dns-7.2.5.tgz",
      "integrity": "sha512-2eznPJP8z2BFLX50tf0LuODrpINqP1RVIm/CObbTcBRITQgmC/TjcREF1NeTBzIcR5XO/ukWo+YHOjBbFwIupg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "dns-packet": "^5.2.2",
        "thunky": "^1.0.2"
      },
      "bin": {
        "multicast-dns": "cli.js"
      }
    },
    "node_modules/mute-stream": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/mute-stream/-/mute-stream-2.0.0.tgz",
      "integrity": "sha512-WWdIxpyjEn+FhQJQQv9aQAYlHoNVdzIzUySNV1gHUPDSdZJ3yZn7pAAbQcV7B56Mvu881q9FZV+0Vx2xC44VWA==",
      "dev": true,
      "license": "ISC",
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/nanoid": {
      "version": "3.3.11",
      "resolved": "http://binario.caixa:8081/repository/npm-all/nanoid/-/nanoid-3.3.11.tgz",
      "integrity": "sha512-N8SpfPUnUp1bK+PMYW8qSWdl9U+wwNWI4QKxOYDy9JAro3WMX7p2OeVRF9v+347pnakNevPmiHhNmZ2HbFA76w==",
      "dev": true,
      "funding": [
        {
          "type": "github",
          "url": "https://github.com/sponsors/ai"
        }
      ],
      "license": "MIT",
      "bin": {
        "nanoid": "bin/nanoid.cjs"
      },
      "engines": {
        "node": "^10 || ^12 || ^13.7 || ^14 || >=15.0.1"
      }
    },
    "node_modules/natural-compare": {
      "version": "1.4.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/natural-compare/-/natural-compare-1.4.0.tgz",
      "integrity": "sha512-OWND8ei3VtNC9h7V60qff3SVobHr996CTwgxubgyQYEpg290h9J0buyECNNJexkFm5sOajh5G116RYA1c8ZMSw==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/needle": {
      "version": "3.5.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/needle/-/needle-3.5.0.tgz",
      "integrity": "sha512-jaQyPKKk2YokHrEg+vFDYxXIHTCBgiZwSHOoVx/8V3GIBS8/VN6NdVRmg8q1ERtPkMvmOvebsgga4sAj5hls/w==",
      "dev": true,
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "iconv-lite": "^0.6.3",
        "sax": "^1.2.4"
      },
      "bin": {
        "needle": "bin/needle"
      },
      "engines": {
        "node": ">= 4.4.x"
      }
    },
    "node_modules/needle/node_modules/iconv-lite": {
      "version": "0.6.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/iconv-lite/-/iconv-lite-0.6.3.tgz",
      "integrity": "sha512-4fCk79wshMdzMp2rH06qWrJE4iolqLhCUH+OiuIgU++RB0+94NlDL81atO7GX55uUKueo0txHNtvEyI6D7WdMw==",
      "dev": true,
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "safer-buffer": ">= 2.1.2 < 3.0.0"
      },
      "engines": {
        "node": ">=0.10.0"
      }
    },
    "node_modules/negotiator": {
      "version": "1.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/negotiator/-/negotiator-1.0.0.tgz",
      "integrity": "sha512-8Ofs/AUQh8MaEcrlq5xOX0CQ9ypTF5dl78mjlMNfOK08fzpgTHQRQPBxcPlEtIw0yRpws+Zo/3r+5WRby7u3Gg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.6"
      }
    },
    "node_modules/neo-async": {
      "version": "2.6.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/neo-async/-/neo-async-2.6.2.tgz",
      "integrity": "sha512-Yd3UES5mWCSqR+qNT93S3UoYUkqAZ9lLg8a7g9rimsWmYGK8cVToA4/sF3RrshdyV3sAGMXVUmpMYOw+dLpOuw==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/ng2-currency-mask": {
      "version": "13.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ng2-currency-mask/-/ng2-currency-mask-13.0.3.tgz",
      "integrity": "sha512-ZTaY7sO2vFTfGtjfdu7SrHIeaRzb3oDSVHKvtcb9sYiF4ez8vzRPNjnzcmsk71RjMWl24XMFtmBDPyx/NxXsFg==",
      "peer": true,
      "dependencies": {
        "tslib": ">= 2.3.0"
      },
      "peerDependencies": {
        "@angular/common": ">= 12.x.x",
        "@angular/core": ">= 12.x.x"
      }
    },
    "node_modules/ngx-currency": {
      "version": "19.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ngx-currency/-/ngx-currency-19.0.0.tgz",
      "integrity": "sha512-N7SdB8D+ttPAf9GNiMyhChPUJs0t0mRTMiJ2UILWN83Vnx9dGc1ytjFrV7q3pCVA66svl1bpSFOfbZ2rhJ7zHA==",
      "license": "MIT",
      "dependencies": {
        "tslib": "^2.5.0"
      },
      "peerDependencies": {
        "@angular/common": "^19.0.0",
        "@angular/core": "^19.0.0",
        "@angular/forms": "^19.0.0"
      }
    },
    "node_modules/ngx-extended-pdf-viewer": {
      "version": "28.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ngx-extended-pdf-viewer/-/ngx-extended-pdf-viewer-28.0.2.tgz",
      "integrity": "sha512-E5GMLguXtT6TBCOA1MK8V3A2JdbnGuLF/FxTfUfPTdPzrjfLMeFx0fk8DbK1EoVObUPnHBi+Zu6Hd2RjPPjDWA==",
      "license": "Apache-2.0",
      "dependencies": {
        "tslib": "^2.3.0"
      },
      "peerDependencies": {
        "@angular/common": ">=19.0.0 <23.0.0 || 22.0.0-rc",
        "@angular/core": ">=19.0.0 <23.0.0 || 22.0.0-rc"
      }
    },
    "node_modules/ngx-markdown": {
      "version": "19.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ngx-markdown/-/ngx-markdown-19.1.1.tgz",
      "integrity": "sha512-R0SGsSa8QMLS4mXMWjB7EoK7Vab30QeGA+Y4zeeb4yb+YdAqg0hU/XFkBiQefJx/JxrtxTWJAu1b97LEGscluQ==",
      "license": "MIT",
      "dependencies": {
        "tslib": "^2.3.0"
      },
      "optionalDependencies": {
        "clipboard": "^2.0.11",
        "emoji-toolkit": ">= 8.0.0 < 10.0.0",
        "katex": "^0.16.0",
        "mermaid": ">= 10.6.0 < 12.0.0",
        "prismjs": "^1.30.0"
      },
      "peerDependencies": {
        "@angular/common": "^19.0.0",
        "@angular/core": "^19.0.0",
        "@angular/platform-browser": "^19.0.0",
        "marked": "^15.0.0",
        "rxjs": "^6.5.3 || ^7.4.0",
        "zone.js": "~0.15.0"
      }
    },
    "node_modules/ngx-mask": {
      "version": "19.0.7",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ngx-mask/-/ngx-mask-19.0.7.tgz",
      "integrity": "sha512-Zkv/bVuXMTAPsm5yL9BVnj1AKQSc/FQ4jmN1f8ZAa0wL4/rzm8EgTcXahP+eqG+GGUDP4e6RcipfKqzFeBdsKQ==",
      "license": "MIT",
      "dependencies": {
        "tslib": "^2.3.0"
      },
      "peerDependencies": {
        "@angular/common": ">=14.0.0",
        "@angular/core": ">=14.0.0",
        "@angular/forms": ">=14.0.0"
      }
    },
    "node_modules/ngx-quill": {
      "version": "27.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ngx-quill/-/ngx-quill-27.1.2.tgz",
      "integrity": "sha512-pm6rRadnQdN9hUXcS4ww0kprBaAcg7sN/Dmuo9QTCONv3ZG6AwwoAKdwRC3zOBNodNCYN5y/6y5Mx1XdfpG6PA==",
      "license": "MIT",
      "dependencies": {
        "tslib": "^2.3.0"
      },
      "engines": {
        "node": "^18.19.1 || ^20.11.1 || >=22.0.0"
      },
      "peerDependencies": {
        "@angular/core": "^19.0.0",
        "quill": "^2.0.0",
        "rxjs": "^7.0.0"
      }
    },
    "node_modules/node-addon-api": {
      "version": "6.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/node-addon-api/-/node-addon-api-6.1.0.tgz",
      "integrity": "sha512-+eawOlIgy680F0kBzPUNFhMZGtJ1YmqM6l4+Crf4IkImjYrO/mqPwRMh352g23uIaQKFItcQ64I7KMaJxHgAVA==",
      "dev": true,
      "license": "MIT",
      "optional": true
    },
    "node_modules/node-forge": {
      "version": "1.4.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/node-forge/-/node-forge-1.4.0.tgz",
      "integrity": "sha512-LarFH0+6VfriEhqMMcLX2F7SwSXeWwnEAJEsYm5QKWchiVYVvJyV9v7UDvUv+w5HO23ZpQTXDv/GxdDdMyOuoQ==",
      "dev": true,
      "license": "(BSD-3-Clause OR GPL-2.0)",
      "engines": {
        "node": ">= 6.13.0"
      }
    },
    "node_modules/node-gyp": {
      "version": "11.5.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/node-gyp/-/node-gyp-11.5.0.tgz",
      "integrity": "sha512-ra7Kvlhxn5V9Slyus0ygMa2h+UqExPqUIkfk7Pc8QTLT956JLSy51uWFwHtIYy0vI8cB4BDhc/S03+880My/LQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "env-paths": "^2.2.0",
        "exponential-backoff": "^3.1.1",
        "graceful-fs": "^4.2.6",
        "make-fetch-happen": "^14.0.3",
        "nopt": "^8.0.0",
        "proc-log": "^5.0.0",
        "semver": "^7.3.5",
        "tar": "^7.4.3",
        "tinyglobby": "^0.2.12",
        "which": "^5.0.0"
      },
      "bin": {
        "node-gyp": "bin/node-gyp.js"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/node-gyp-build-optional-packages": {
      "version": "5.2.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/node-gyp-build-optional-packages/-/node-gyp-build-optional-packages-5.2.2.tgz",
      "integrity": "sha512-s+w+rBWnpTMwSFbaE0UXsRlg7hU4FjekKU4eyAih5T8nJuNZT1nNsskXpxmeqSK9UzkBl6UgRlnKc8hz8IEqOw==",
      "dev": true,
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "detect-libc": "^2.0.1"
      },
      "bin": {
        "node-gyp-build-optional-packages": "bin.js",
        "node-gyp-build-optional-packages-optional": "optional.js",
        "node-gyp-build-optional-packages-test": "build-test.js"
      }
    },
    "node_modules/node-gyp/node_modules/chownr": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/chownr/-/chownr-3.0.0.tgz",
      "integrity": "sha512-+IxzY9BZOQd/XuYPRmrvEVjF/nqj5kgT4kEq7VofrDoM1MxoRjEWkrCC3EtLi59TVawxTAn+orJwFQcrqEN1+g==",
      "dev": true,
      "license": "BlueOak-1.0.0",
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/node-gyp/node_modules/isexe": {
      "version": "3.1.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/isexe/-/isexe-3.1.5.tgz",
      "integrity": "sha512-6B3tLtFqtQS4ekarvLVMZ+X+VlvQekbe4taUkf/rhVO3d/h0M2rfARm/pXLcPEsjjMsFgrFgSrhQIxcSVrBz8w==",
      "dev": true,
      "license": "BlueOak-1.0.0",
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/node-gyp/node_modules/tar": {
      "version": "7.5.13",
      "resolved": "http://binario.caixa:8081/repository/npm-all/tar/-/tar-7.5.13.tgz",
      "integrity": "sha512-tOG/7GyXpFevhXVh8jOPJrmtRpOTsYqUIkVdVooZYJS/z8WhfQUX8RJILmeuJNinGAMSu1veBr4asSHFt5/hng==",
      "dev": true,
      "license": "BlueOak-1.0.0",
      "dependencies": {
        "@isaacs/fs-minipass": "^4.0.0",
        "chownr": "^3.0.0",
        "minipass": "^7.1.2",
        "minizlib": "^3.1.0",
        "yallist": "^5.0.0"
      },
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/node-gyp/node_modules/which": {
      "version": "5.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/which/-/which-5.0.0.tgz",
      "integrity": "sha512-JEdGzHwwkrbWoGOlIHqQ5gtprKGOenpDHpxE9zVR1bWbOtYRyPPHMe9FaP6x61CmNaTThSkb0DAJte5jD+DmzQ==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "isexe": "^3.1.1"
      },
      "bin": {
        "node-which": "bin/which.js"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/node-gyp/node_modules/yallist": {
      "version": "5.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/yallist/-/yallist-5.0.0.tgz",
      "integrity": "sha512-YgvUTfwqyc7UXVMrB+SImsVYSmTS8X/tSrtdNZMImM+n7+QTriRXyXim0mBrTXNeqzVF0KWGgHPeiyViFFrNDw==",
      "dev": true,
      "license": "BlueOak-1.0.0",
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/node-int64": {
      "version": "0.4.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/node-int64/-/node-int64-0.4.0.tgz",
      "integrity": "sha512-O5lz91xSOeoXP6DulyHfllpq+Eg00MWitZIbtPfoSEvqIHdl5gfcY6hYzDWnj0qD5tz52PI08u9qUvSVeUBeHw==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/node-releases": {
      "version": "2.0.36",
      "resolved": "http://binario.caixa:8081/repository/npm-all/node-releases/-/node-releases-2.0.36.tgz",
      "integrity": "sha512-TdC8FSgHz8Mwtw9g5L4gR/Sh9XhSP/0DEkQxfEFXOpiul5IiHgHan2VhYYb6agDSfp4KuvltmGApc8HMgUrIkA==",
      "license": "MIT"
    },
    "node_modules/nopt": {
      "version": "8.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/nopt/-/nopt-8.1.0.tgz",
      "integrity": "sha512-ieGu42u/Qsa4TFktmaKEwM6MQH0pOWnaB3htzh0JRtx84+Mebc0cbZYN5bC+6WTZ4+77xrL9Pn5m7CV6VIkV7A==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "abbrev": "^3.0.0"
      },
      "bin": {
        "nopt": "bin/nopt.js"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/normalize-path": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/normalize-path/-/normalize-path-3.0.0.tgz",
      "integrity": "sha512-6eZs5Ls3WtCisHWp9S2GUy8dqkpGi4BVSz3GaqiE6ezub0512ESztXUwUB6C6IKbQkY2Pnb/mD4WYojCRwcwLA==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=0.10.0"
      }
    },
    "node_modules/normalize-range": {
      "version": "0.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/normalize-range/-/normalize-range-0.1.2.tgz",
      "integrity": "sha512-bdok/XvKII3nUpklnV6P2hxtMNrCboOjAcyBuQnWEhO665FwrSNRxU+AqpsyvO6LgGYPspN+lu5CLtw4jPRKNA==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=0.10.0"
      }
    },
    "node_modules/npm-bundled": {
      "version": "4.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/npm-bundled/-/npm-bundled-4.0.0.tgz",
      "integrity": "sha512-IxaQZDMsqfQ2Lz37VvyyEtKLe8FsRZuysmedy/N06TU1RyVppYKXrO4xIhR0F+7ubIBox6Q7nir6fQI3ej39iA==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "npm-normalize-package-bin": "^4.0.0"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/npm-install-checks": {
      "version": "7.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/npm-install-checks/-/npm-install-checks-7.1.2.tgz",
      "integrity": "sha512-z9HJBCYw9Zr8BqXcllKIs5nI+QggAImbBdHphOzVYrz2CB4iQ6FzWyKmlqDZua+51nAu7FcemlbTc9VgQN5XDQ==",
      "dev": true,
      "license": "BSD-2-Clause",
      "dependencies": {
        "semver": "^7.1.1"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/npm-normalize-package-bin": {
      "version": "4.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/npm-normalize-package-bin/-/npm-normalize-package-bin-4.0.0.tgz",
      "integrity": "sha512-TZKxPvItzai9kN9H/TkmCtx/ZN/hvr3vUycjlfmH0ootY9yFBzNOpiXAdIn1Iteqsvk4lQn6B5PTrt+n6h8k/w==",
      "dev": true,
      "license": "ISC",
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/npm-package-arg": {
      "version": "12.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/npm-package-arg/-/npm-package-arg-12.0.2.tgz",
      "integrity": "sha512-f1NpFjNI9O4VbKMOlA5QoBq/vSQPORHcTZ2feJpFkTHJ9eQkdlmZEKSjcAhxTGInC7RlEyScT9ui67NaOsjFWA==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "hosted-git-info": "^8.0.0",
        "proc-log": "^5.0.0",
        "semver": "^7.3.5",
        "validate-npm-package-name": "^6.0.0"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/npm-packlist": {
      "version": "9.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/npm-packlist/-/npm-packlist-9.0.0.tgz",
      "integrity": "sha512-8qSayfmHJQTx3nJWYbbUmflpyarbLMBc6LCAjYsiGtXxDB68HaZpb8re6zeaLGxZzDuMdhsg70jryJe+RrItVQ==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "ignore-walk": "^7.0.0"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/npm-pick-manifest": {
      "version": "10.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/npm-pick-manifest/-/npm-pick-manifest-10.0.0.tgz",
      "integrity": "sha512-r4fFa4FqYY8xaM7fHecQ9Z2nE9hgNfJR+EmoKv0+chvzWkBcORX3r0FpTByP+CbOVJDladMXnPQGVN8PBLGuTQ==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "npm-install-checks": "^7.1.0",
        "npm-normalize-package-bin": "^4.0.0",
        "npm-package-arg": "^12.0.0",
        "semver": "^7.3.5"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/npm-registry-fetch": {
      "version": "18.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/npm-registry-fetch/-/npm-registry-fetch-18.0.2.tgz",
      "integrity": "sha512-LeVMZBBVy+oQb5R6FDV9OlJCcWDU+al10oKpe+nsvcHnG24Z3uM3SvJYKfGJlfGjVU8v9liejCrUR/M5HO5NEQ==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "@npmcli/redact": "^3.0.0",
        "jsonparse": "^1.3.1",
        "make-fetch-happen": "^14.0.0",
        "minipass": "^7.0.2",
        "minipass-fetch": "^4.0.0",
        "minizlib": "^3.0.1",
        "npm-package-arg": "^12.0.0",
        "proc-log": "^5.0.0"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/npm-run-path": {
      "version": "4.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/npm-run-path/-/npm-run-path-4.0.1.tgz",
      "integrity": "sha512-S48WzZW777zhNIrn7gxOlISNAqi9ZC/uQFnRdbeIHhZhCA6UqpkOT8T1G7BvfdgP4Er8gF4sUbaS0i7QvIfCWw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "path-key": "^3.0.0"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/nth-check": {
      "version": "2.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/nth-check/-/nth-check-2.1.1.tgz",
      "integrity": "sha512-lqjrjmaOoAnWfMmBPL+XNnynZh2+swxiX3WUE0s4yEHI6m+AwrK2UZOimIRl3X/4QctVqS8AiZjFqyOGrMXb/w==",
      "dev": true,
      "license": "BSD-2-Clause",
      "dependencies": {
        "boolbase": "^1.0.0"
      },
      "funding": {
        "url": "https://github.com/fb55/nth-check?sponsor=1"
      }
    },
    "node_modules/nwsapi": {
      "version": "2.2.23",
      "resolved": "http://binario.caixa:8081/repository/npm-all/nwsapi/-/nwsapi-2.2.23.tgz",
      "integrity": "sha512-7wfH4sLbt4M0gCDzGE6vzQBo0bfTKjU7Sfpqy/7gs1qBfYz2vEJH6vXcBKpO3+6Yu1telwd0t9HpyOoLEQQbIQ==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/object-inspect": {
      "version": "1.13.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/object-inspect/-/object-inspect-1.13.4.tgz",
      "integrity": "sha512-W67iLl4J2EXEGTbfeHCffrjDfitvLANg0UlX3wFUUSTx92KXRFegMHUVgSqE+wvhAbi4WqjGg9czysTV2Epbew==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.4"
      },
      "funding": {
        "url": "https://github.com/sponsors/ljharb"
      }
    },
    "node_modules/obuf": {
      "version": "1.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/obuf/-/obuf-1.1.2.tgz",
      "integrity": "sha512-PX1wu0AmAdPqOL1mWhqmlOd8kOIZQwGZw6rh7uby9fTc5lhaOWFLX3I6R1hrF9k3zUY40e6igsLGkDXK92LJNg==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/on-finished": {
      "version": "2.4.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/on-finished/-/on-finished-2.4.1.tgz",
      "integrity": "sha512-oVlzkg3ENAhCk2zdv7IJwd/QUD4z2RxRwpkcGY8psCVcCYZNq4wYnVWALHM+brtuJjePWiYF/ClmuDr8Ch5+kg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "ee-first": "1.1.1"
      },
      "engines": {
        "node": ">= 0.8"
      }
    },
    "node_modules/on-headers": {
      "version": "1.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/on-headers/-/on-headers-1.1.0.tgz",
      "integrity": "sha512-737ZY3yNnXy37FHkQxPzt4UZ2UWPWiCZWLvFZ4fu5cueciegX0zGPnrlY6bwRg4FdQOe9YU8MkmJwGhoMybl8A==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.8"
      }
    },
    "node_modules/once": {
      "version": "1.4.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/once/-/once-1.4.0.tgz",
      "integrity": "sha512-lNaJgI+2Q5URQBkccEKHTQOPaXdUxnZZElQTZY0MFUAuaEqe1E+Nyvgdz/aIyNi6Z9MzO5dv1H8n58/GELp3+w==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "wrappy": "1"
      }
    },
    "node_modules/onetime": {
      "version": "5.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/onetime/-/onetime-5.1.2.tgz",
      "integrity": "sha512-kbpaSSGJTWdAY5KPVeMOKXSrPtr8C8C7wodJbcsd51jRnmD+GZu8Y0VoU6Dm5Z4vWr0Ig/1NKuWRKf7j5aaYSg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "mimic-fn": "^2.1.0"
      },
      "engines": {
        "node": ">=6"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/open": {
      "version": "10.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/open/-/open-10.1.0.tgz",
      "integrity": "sha512-mnkeQ1qP5Ue2wd+aivTD3NHd/lZ96Lu0jgf0pwktLPtx6cTZiH7tyeGRRHs0zX0rbrahXPnXlUnbeXyaBBuIaw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "default-browser": "^5.2.1",
        "define-lazy-prop": "^3.0.0",
        "is-inside-container": "^1.0.0",
        "is-wsl": "^3.1.0"
      },
      "engines": {
        "node": ">=18"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/ora": {
      "version": "5.4.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ora/-/ora-5.4.1.tgz",
      "integrity": "sha512-5b6Y85tPxZZ7QytO+BQzysW31HJku27cRIlkbAXaNx+BdcVi+LlRFmVXzeF6a7JCwJpyw5c4b+YSVImQIrBpuQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "bl": "^4.1.0",
        "chalk": "^4.1.0",
        "cli-cursor": "^3.1.0",
        "cli-spinners": "^2.5.0",
        "is-interactive": "^1.0.0",
        "is-unicode-supported": "^0.1.0",
        "log-symbols": "^4.1.0",
        "strip-ansi": "^6.0.0",
        "wcwidth": "^1.0.1"
      },
      "engines": {
        "node": ">=10"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/ora/node_modules/cli-cursor": {
      "version": "3.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/cli-cursor/-/cli-cursor-3.1.0.tgz",
      "integrity": "sha512-I/zHAwsKf9FqGoXM4WWRACob9+SNukZTd94DWF57E4toouRulbCxcUh6RKUEOQlYTHJnzkPMySvPNaaSLNfLZw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "restore-cursor": "^3.1.0"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/ora/node_modules/restore-cursor": {
      "version": "3.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/restore-cursor/-/restore-cursor-3.1.0.tgz",
      "integrity": "sha512-l+sSefzHpj5qimhFSE5a8nufZYAM3sBSVMAPtYkmC+4EH2anSGaEMXSD0izRQbu9nfyQ9y5JrVmp7E8oZrUjvA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "onetime": "^5.1.0",
        "signal-exit": "^3.0.2"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/ora/node_modules/signal-exit": {
      "version": "3.0.7",
      "resolved": "http://binario.caixa:8081/repository/npm-all/signal-exit/-/signal-exit-3.0.7.tgz",
      "integrity": "sha512-wnD2ZE+l+SPC/uoS0vXeE9L1+0wuaMqKlfz9AMUo38JsyLSBWSFcHR1Rri62LZc12vLr1gb3jl7iwQhgwpAbGQ==",
      "dev": true,
      "license": "ISC"
    },
    "node_modules/ordered-binary": {
      "version": "1.6.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ordered-binary/-/ordered-binary-1.6.1.tgz",
      "integrity": "sha512-QkCdPooczexPLiXIrbVOPYkR3VO3T6v2OyKRkR1Xbhpy7/LAVXwahnRCgRp78Oe/Ehf0C/HATAxfSr6eA1oX+w==",
      "dev": true,
      "license": "MIT",
      "optional": true
    },
    "node_modules/p-limit": {
      "version": "3.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/p-limit/-/p-limit-3.1.0.tgz",
      "integrity": "sha512-TYOanM3wGwNGsZN2cVTYPArw454xnXj5qmWF1bEoAc4+cU/ol7GVh7odevjp1FNHduHc3KZMcFduxU5Xc6uJRQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "yocto-queue": "^0.1.0"
      },
      "engines": {
        "node": ">=10"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/p-locate": {
      "version": "4.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/p-locate/-/p-locate-4.1.0.tgz",
      "integrity": "sha512-R79ZZ/0wAxKGu3oYMlz8jy/kbhsNrS7SKZ7PxEHBgJ5+F2mtFW2fK2cOtBh1cHYkQsbzFV7I+EoRKe6Yt0oK7A==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "p-limit": "^2.2.0"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/p-locate/node_modules/p-limit": {
      "version": "2.3.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/p-limit/-/p-limit-2.3.0.tgz",
      "integrity": "sha512-//88mFWSJx8lxCzwdAABTJL2MyWB12+eIY7MDL2SqLmAkeKU9qxRvWuSyTjm3FUmpBEMuFfckAIqEaVGUDxb6w==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "p-try": "^2.0.0"
      },
      "engines": {
        "node": ">=6"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/p-map": {
      "version": "7.0.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/p-map/-/p-map-7.0.4.tgz",
      "integrity": "sha512-tkAQEw8ysMzmkhgw8k+1U/iPhWNhykKnSk4Rd5zLoPJCuJaGRPo6YposrZgaxHKzDHdDWWZvE/Sk7hsL2X/CpQ==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=18"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/p-retry": {
      "version": "6.2.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/p-retry/-/p-retry-6.2.1.tgz",
      "integrity": "sha512-hEt02O4hUct5wtwg4H4KcWgDdm+l1bOaEy/hWzd8xtXB9BqxTWBBhb+2ImAtH4Cv4rPjV76xN3Zumqk3k3AhhQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/retry": "0.12.2",
        "is-network-error": "^1.0.0",
        "retry": "^0.13.1"
      },
      "engines": {
        "node": ">=16.17"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/p-retry/node_modules/retry": {
      "version": "0.13.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/retry/-/retry-0.13.1.tgz",
      "integrity": "sha512-XQBQ3I8W1Cge0Seh+6gjj03LbmRFWuoszgK9ooCpwYIrhhoO80pfq4cUkU5DkknwfOfFteRwlZ56PYOGYyFWdg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 4"
      }
    },
    "node_modules/p-try": {
      "version": "2.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/p-try/-/p-try-2.2.0.tgz",
      "integrity": "sha512-R4nPAVTAU0B9D35/Gk3uJf/7XYbQcyohSKdvAxIRSNghFl4e71hVoGnBNQz9cWaXxO2I10KTC+3jMdvvoKw6dQ==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=6"
      }
    },
    "node_modules/package-json-from-dist": {
      "version": "1.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/package-json-from-dist/-/package-json-from-dist-1.0.1.tgz",
      "integrity": "sha512-UEZIS3/by4OC8vL3P2dTXRETpebLI2NiI5vIrjaD/5UtrkFX/tNbwjTSRAGC/+7CAo2pIcBaRgWmcBBHcsaCIw==",
      "dev": true,
      "license": "BlueOak-1.0.0"
    },
    "node_modules/package-manager-detector": {
      "version": "1.6.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/package-manager-detector/-/package-manager-detector-1.6.0.tgz",
      "integrity": "sha512-61A5ThoTiDG/C8s8UMZwSorAGwMJ0ERVGj2OjoW5pAalsNOg15+iQiPzrLJ4jhZ1HJzmC2PIHT2oEiH3R5fzNA==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/pacote": {
      "version": "20.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/pacote/-/pacote-20.0.0.tgz",
      "integrity": "sha512-pRjC5UFwZCgx9kUFDVM9YEahv4guZ1nSLqwmWiLUnDbGsjs+U5w7z6Uc8HNR1a6x8qnu5y9xtGE6D1uAuYz+0A==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "@npmcli/git": "^6.0.0",
        "@npmcli/installed-package-contents": "^3.0.0",
        "@npmcli/package-json": "^6.0.0",
        "@npmcli/promise-spawn": "^8.0.0",
        "@npmcli/run-script": "^9.0.0",
        "cacache": "^19.0.0",
        "fs-minipass": "^3.0.0",
        "minipass": "^7.0.2",
        "npm-package-arg": "^12.0.0",
        "npm-packlist": "^9.0.0",
        "npm-pick-manifest": "^10.0.0",
        "npm-registry-fetch": "^18.0.0",
        "proc-log": "^5.0.0",
        "promise-retry": "^2.0.1",
        "sigstore": "^3.0.0",
        "ssri": "^12.0.0",
        "tar": "^6.1.11"
      },
      "bin": {
        "pacote": "bin/index.js"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/parchment": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/parchment/-/parchment-3.0.0.tgz",
      "integrity": "sha512-HUrJFQ/StvgmXRcQ1ftY6VEZUq3jA2t9ncFN4F84J/vN0/FPpQF+8FKXb3l6fLces6q0uOHj6NJn+2xvZnxO6A==",
      "license": "BSD-3-Clause"
    },
    "node_modules/parent-module": {
      "version": "1.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/parent-module/-/parent-module-1.0.1.tgz",
      "integrity": "sha512-GQ2EWRpQV8/o+Aw8YqtfZZPfNRWZYkbidE9k5rpl/hC3vtHHBfGm2Ifi6qWV+coDGkrUKZAxE3Lot5kcsRlh+g==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "callsites": "^3.0.0"
      },
      "engines": {
        "node": ">=6"
      }
    },
    "node_modules/parse-json": {
      "version": "5.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/parse-json/-/parse-json-5.2.0.tgz",
      "integrity": "sha512-ayCKvm/phCGxOkYRSCM82iDwct8/EonSEgCSxWxD7ve6jHggsFl4fZVQBPRNgQoKiuV/odhFrGzQXZwbifC8Rg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@babel/code-frame": "^7.0.0",
        "error-ex": "^1.3.1",
        "json-parse-even-better-errors": "^2.3.0",
        "lines-and-columns": "^1.1.6"
      },
      "engines": {
        "node": ">=8"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/parse-json/node_modules/json-parse-even-better-errors": {
      "version": "2.3.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/json-parse-even-better-errors/-/json-parse-even-better-errors-2.3.1.tgz",
      "integrity": "sha512-xyFwyhro/JEof6Ghe2iz2NcXoj2sloNsWr/XsERDK/oiPCfaNhl5ONfp+jQdAZRQQ0IJWNzH9zIZF7li91kh2w==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/parse-node-version": {
      "version": "1.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/parse-node-version/-/parse-node-version-1.0.1.tgz",
      "integrity": "sha512-3YHlOa/JgH6Mnpr05jP9eDG254US9ek25LyIxZlDItp2iJtwyaXQb57lBYLdT3MowkUFYEV2XXNAYIPlESvJlA==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.10"
      }
    },
    "node_modules/parse5": {
      "version": "7.3.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/parse5/-/parse5-7.3.0.tgz",
      "integrity": "sha512-IInvU7fabl34qmi9gY8XOVxhYyMyuH2xUNpb2q8/Y+7552KlejkRvqvD19nMoUW/uQGGbqNpA6Tufu5FL5BZgw==",
      "license": "MIT",
      "dependencies": {
        "entities": "^6.0.0"
      },
      "funding": {
        "url": "https://github.com/inikulin/parse5?sponsor=1"
      }
    },
    "node_modules/parse5-html-rewriting-stream": {
      "version": "7.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/parse5-html-rewriting-stream/-/parse5-html-rewriting-stream-7.0.0.tgz",
      "integrity": "sha512-mazCyGWkmCRWDI15Zp+UiCqMp/0dgEmkZRvhlsqqKYr4SsVm/TvnSpD9fCvqCA2zoWJcfRym846ejWBBHRiYEg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "entities": "^4.3.0",
        "parse5": "^7.0.0",
        "parse5-sax-parser": "^7.0.0"
      },
      "funding": {
        "url": "https://github.com/inikulin/parse5?sponsor=1"
      }
    },
    "node_modules/parse5-sax-parser": {
      "version": "7.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/parse5-sax-parser/-/parse5-sax-parser-7.0.0.tgz",
      "integrity": "sha512-5A+v2SNsq8T6/mG3ahcz8ZtQ0OUFTatxPbeidoMB7tkJSGDY3tdfl4MHovtLQHkEn5CGxijNWRQHhRQ6IRpXKg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "parse5": "^7.0.0"
      },
      "funding": {
        "url": "https://github.com/inikulin/parse5?sponsor=1"
      }
    },
    "node_modules/parse5/node_modules/entities": {
      "version": "6.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/entities/-/entities-6.0.1.tgz",
      "integrity": "sha512-aN97NXWF6AWBTahfVOIrB/NShkzi5H7F9r1s9mD3cDj4Ko5f2qhhVoYMibXF7GlLveb/D2ioWay8lxI97Ven3g==",
      "license": "BSD-2-Clause",
      "engines": {
        "node": ">=0.12"
      },
      "funding": {
        "url": "https://github.com/fb55/entities?sponsor=1"
      }
    },
    "node_modules/parseurl": {
      "version": "1.3.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/parseurl/-/parseurl-1.3.3.tgz",
      "integrity": "sha512-CiyeOxFT/JZyN5m0z9PfXw4SCBJ6Sygz1Dpl0wqjlhDEGGBP1GnsUVEL0p63hoG1fcj3fHynXi9NYO4nWOL+qQ==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.8"
      }
    },
    "node_modules/path-data-parser": {
      "version": "0.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/path-data-parser/-/path-data-parser-0.1.0.tgz",
      "integrity": "sha512-NOnmBpt5Y2RWbuv0LMzsayp3lVylAHLPUTut412ZA3l+C4uw4ZVkQbjShYCQ8TCpUMdPapr4YjUqLYD6v68j+w==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/path-exists": {
      "version": "4.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/path-exists/-/path-exists-4.0.0.tgz",
      "integrity": "sha512-ak9Qy5Q7jYb2Wwcey5Fpvg2KoAc/ZIhLSLOSBmRmygPsGwkVVt0fZa0qrtMz+m6tJTAHfZQ8FnmB4MG4LWy7/w==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/path-is-absolute": {
      "version": "1.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/path-is-absolute/-/path-is-absolute-1.0.1.tgz",
      "integrity": "sha512-AVbw3UJ2e9bq64vSaS9Am0fje1Pa8pbGqTTsmXfaIiMpnr5DlDhfJOuLj9Sf95ZPVDAUerDfEk88MPmPe7UCQg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=0.10.0"
      }
    },
    "node_modules/path-key": {
      "version": "3.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/path-key/-/path-key-3.1.1.tgz",
      "integrity": "sha512-ojmeN0qd+y0jszEtoY48r0Peq5dwMEkIlCOu6Q5f41lfkswXuKtYrhgoTpLnyIcHm24Uhqx+5Tqm2InSwLhE6Q==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/path-parse": {
      "version": "1.0.7",
      "resolved": "http://binario.caixa:8081/repository/npm-all/path-parse/-/path-parse-1.0.7.tgz",
      "integrity": "sha512-LDJzPVEEEPR+y48z93A0Ed0yXb8pAByGWo/k5YYdYgpY2/2EsOsksJrq7lOHxryrVOn1ejG6oAp8ahvOIQD8sw==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/path-scurry": {
      "version": "1.11.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/path-scurry/-/path-scurry-1.11.1.tgz",
      "integrity": "sha512-Xa4Nw17FS9ApQFJ9umLiJS4orGjm7ZzwUrwamcGQuHSzDyth9boKDaycYdDcZDuqYATXw4HFXgaqWTctW/v1HA==",
      "dev": true,
      "license": "BlueOak-1.0.0",
      "dependencies": {
        "lru-cache": "^10.2.0",
        "minipass": "^5.0.0 || ^6.0.2 || ^7.0.0"
      },
      "engines": {
        "node": ">=16 || 14 >=14.18"
      },
      "funding": {
        "url": "https://github.com/sponsors/isaacs"
      }
    },
    "node_modules/path-scurry/node_modules/lru-cache": {
      "version": "10.4.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/lru-cache/-/lru-cache-10.4.3.tgz",
      "integrity": "sha512-JNAzZcXrCt42VGLuYz0zfAzDfAvJWW6AfYlDBQyDV5DClI2m5sAmK+OIO7s59XfsRsWHp02jAJrRadPRGTt6SQ==",
      "dev": true,
      "license": "ISC"
    },
    "node_modules/path-to-regexp": {
      "version": "0.1.13",
      "resolved": "http://binario.caixa:8081/repository/npm-all/path-to-regexp/-/path-to-regexp-0.1.13.tgz",
      "integrity": "sha512-A/AGNMFN3c8bOlvV9RreMdrv7jsmF9XIfDeCd87+I8RNg6s78BhJxMu69NEMHBSJFxKidViTEdruRwEk/WIKqA==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/path-type": {
      "version": "6.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/path-type/-/path-type-6.0.0.tgz",
      "integrity": "sha512-Vj7sf++t5pBD637NSfkxpHSMfWaeig5+DKWLhcqIYx6mWQz5hdJTGDVMQiJcw1ZYkhs7AazKDGpRVji1LJCZUQ==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=18"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/pathe": {
      "version": "2.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/pathe/-/pathe-2.0.3.tgz",
      "integrity": "sha512-WUjGcAqP1gQacoQe+OBJsFA7Ld4DyXuUIjZ5cc75cLHvJ7dtNsTugphxIADwspS+AraAUePCKrSVtPLFj/F88w==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/picocolors": {
      "version": "1.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/picocolors/-/picocolors-1.1.1.tgz",
      "integrity": "sha512-xceH2snhtb5M9liqDsmEw56le376mTZkEX/jEb/RxNFyegNul7eNslCXP9FDj/Lcu0X8KEyMceP2ntpaHrDEVA==",
      "license": "ISC"
    },
    "node_modules/picomatch": {
      "version": "4.0.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/picomatch/-/picomatch-4.0.4.tgz",
      "integrity": "sha512-QP88BAKvMam/3NxH6vj2o21R6MjxZUAd6nlwAS/pnGvN9IVLocLHxGYIzFhg6fUQ+5th6P4dv4eW9jX3DSIj7A==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=12"
      },
      "funding": {
        "url": "https://github.com/sponsors/jonschlinkert"
      }
    },
    "node_modules/pify": {
      "version": "4.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/pify/-/pify-4.0.1.tgz",
      "integrity": "sha512-uB80kBFb/tfd68bVleG9T5GGsGPjJrLAUpR5PZIrhBnIaRTQRjqdJSsIKkOP6OAIFbj7GOrcudc5pNjZ+geV2g==",
      "dev": true,
      "license": "MIT",
      "optional": true,
      "engines": {
        "node": ">=6"
      }
    },
    "node_modules/pirates": {
      "version": "4.0.7",
      "resolved": "http://binario.caixa:8081/repository/npm-all/pirates/-/pirates-4.0.7.tgz",
      "integrity": "sha512-TfySrs/5nm8fQJDcBDuUng3VOUKsd7S+zqvbOTiGXHfxX4wK31ard+hoNuvkicM/2YFzlpDgABOevKSsB4G/FA==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 6"
      }
    },
    "node_modules/piscina": {
      "version": "4.8.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/piscina/-/piscina-4.8.0.tgz",
      "integrity": "sha512-EZJb+ZxDrQf3dihsUL7p42pjNyrNIFJCrRHPMgxu/svsj+P3xS3fuEWp7k2+rfsavfl1N0G29b1HGs7J0m8rZA==",
      "dev": true,
      "license": "MIT",
      "optionalDependencies": {
        "@napi-rs/nice": "^1.0.1"
      }
    },
    "node_modules/pkg-dir": {
      "version": "7.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/pkg-dir/-/pkg-dir-7.0.0.tgz",
      "integrity": "sha512-Ie9z/WINcxxLp27BKOCHGde4ITq9UklYKDzVo1nhk5sqGEXU3FpkwP5GM2voTGJkGd9B3Otl+Q4uwSOeSUtOBA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "find-up": "^6.3.0"
      },
      "engines": {
        "node": ">=14.16"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/pkg-dir/node_modules/find-up": {
      "version": "6.3.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/find-up/-/find-up-6.3.0.tgz",
      "integrity": "sha512-v2ZsoEuVHYy8ZIlYqwPe/39Cy+cFDzp4dXPaxNvkEuouymu+2Jbz0PxpKarJHYJTmv2HWT3O382qY8l4jMWthw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "locate-path": "^7.1.0",
        "path-exists": "^5.0.0"
      },
      "engines": {
        "node": "^12.20.0 || ^14.13.1 || >=16.0.0"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/pkg-dir/node_modules/locate-path": {
      "version": "7.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/locate-path/-/locate-path-7.2.0.tgz",
      "integrity": "sha512-gvVijfZvn7R+2qyPX8mAuKcFGDf6Nc61GdvGafQsHL0sBIxfKzA+usWn4GFC/bk+QdwPUD4kWFJLhElipq+0VA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "p-locate": "^6.0.0"
      },
      "engines": {
        "node": "^12.20.0 || ^14.13.1 || >=16.0.0"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/pkg-dir/node_modules/p-limit": {
      "version": "4.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/p-limit/-/p-limit-4.0.0.tgz",
      "integrity": "sha512-5b0R4txpzjPWVw/cXXUResoD4hb6U/x9BH08L7nw+GN1sezDzPdxeRvpc9c433fZhBan/wusjbCsqwqm4EIBIQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "yocto-queue": "^1.0.0"
      },
      "engines": {
        "node": "^12.20.0 || ^14.13.1 || >=16.0.0"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/pkg-dir/node_modules/p-locate": {
      "version": "6.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/p-locate/-/p-locate-6.0.0.tgz",
      "integrity": "sha512-wPrq66Llhl7/4AGC6I+cqxT07LhXvWL08LNXz1fENOw0Ap4sRZZ/gZpTTJ5jpurzzzfS2W/Ge9BY3LgLjCShcw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "p-limit": "^4.0.0"
      },
      "engines": {
        "node": "^12.20.0 || ^14.13.1 || >=16.0.0"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/pkg-dir/node_modules/path-exists": {
      "version": "5.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/path-exists/-/path-exists-5.0.0.tgz",
      "integrity": "sha512-RjhtfwJOxzcFmNOi6ltcbcu4Iu+FL3zEj83dk4kAS+fVpTxXLO1b38RvJgT/0QwvV/L3aY9TAnyv0EOqW4GoMQ==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": "^12.20.0 || ^14.13.1 || >=16.0.0"
      }
    },
    "node_modules/pkg-dir/node_modules/yocto-queue": {
      "version": "1.2.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/yocto-queue/-/yocto-queue-1.2.2.tgz",
      "integrity": "sha512-4LCcse/U2MHZ63HAJVE+v71o7yOdIe4cZ70Wpf8D/IyjDKYQLV5GD46B+hSTjJsvV5PztjvHoU580EftxjDZFQ==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=12.20"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/pkg-types": {
      "version": "1.3.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/pkg-types/-/pkg-types-1.3.1.tgz",
      "integrity": "sha512-/Jm5M4RvtBFVkKWRu2BLUTNP8/M2a+UwuAX+ae4770q1qVGtfjG+WTCupoZixokjmHiry8uI+dlY8KXYV5HVVQ==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "confbox": "^0.1.8",
        "mlly": "^1.7.4",
        "pathe": "^2.0.1"
      }
    },
    "node_modules/points-on-curve": {
      "version": "0.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/points-on-curve/-/points-on-curve-0.2.0.tgz",
      "integrity": "sha512-0mYKnYYe9ZcqMCWhUjItv/oHjvgEsfKvnUTg8sAtnHr3GVy7rGkXCb6d5cSyqrWqL4k81b9CPg3urd+T7aop3A==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/points-on-path": {
      "version": "0.2.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/points-on-path/-/points-on-path-0.2.1.tgz",
      "integrity": "sha512-25ClnWWuw7JbWZcgqY/gJ4FQWadKxGWk+3kR/7kD0tCaDtPPMj7oHu2ToLaVhfpnHrZzYby2w6tUA0eOIuUg8g==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "path-data-parser": "0.1.0",
        "points-on-curve": "0.2.0"
      }
    },
    "node_modules/postcss": {
      "version": "8.5.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/postcss/-/postcss-8.5.2.tgz",
      "integrity": "sha512-MjOadfU3Ys9KYoX0AdkBlFEF1Vx37uCCeN4ZHnmwm9FfpbsGWMZeBLMmmpY+6Ocqod7mkdZ0DT31OlbsFrLlkA==",
      "dev": true,
      "funding": [
        {
          "type": "opencollective",
          "url": "https://opencollective.com/postcss/"
        },
        {
          "type": "tidelift",
          "url": "https://tidelift.com/funding/github/npm/postcss"
        },
        {
          "type": "github",
          "url": "https://github.com/sponsors/ai"
        }
      ],
      "license": "MIT",
      "dependencies": {
        "nanoid": "^3.3.8",
        "picocolors": "^1.1.1",
        "source-map-js": "^1.2.1"
      },
      "engines": {
        "node": "^10 || ^12 || >=14"
      }
    },
    "node_modules/postcss-loader": {
      "version": "8.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/postcss-loader/-/postcss-loader-8.1.1.tgz",
      "integrity": "sha512-0IeqyAsG6tYiDRCYKQJLAmgQr47DX6N7sFSWvQxt6AcupX8DIdmykuk/o/tx0Lze3ErGHJEp5OSRxrelC6+NdQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "cosmiconfig": "^9.0.0",
        "jiti": "^1.20.0",
        "semver": "^7.5.4"
      },
      "engines": {
        "node": ">= 18.12.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/webpack"
      },
      "peerDependencies": {
        "@rspack/core": "0.x || 1.x",
        "postcss": "^7.0.0 || ^8.0.1",
        "webpack": "^5.0.0"
      },
      "peerDependenciesMeta": {
        "@rspack/core": {
          "optional": true
        },
        "webpack": {
          "optional": true
        }
      }
    },
    "node_modules/postcss-media-query-parser": {
      "version": "0.2.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/postcss-media-query-parser/-/postcss-media-query-parser-0.2.3.tgz",
      "integrity": "sha512-3sOlxmbKcSHMjlUXQZKQ06jOswE7oVkXPxmZdoB1r5l0q6gTFTQSHxNxOrCccElbW7dxNytifNEo8qidX2Vsig==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/postcss-modules-extract-imports": {
      "version": "3.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/postcss-modules-extract-imports/-/postcss-modules-extract-imports-3.1.0.tgz",
      "integrity": "sha512-k3kNe0aNFQDAZGbin48pL2VNidTF0w4/eASDsxlyspobzU3wZQLOGj7L9gfRe0Jo9/4uud09DsjFNH7winGv8Q==",
      "dev": true,
      "license": "ISC",
      "engines": {
        "node": "^10 || ^12 || >= 14"
      },
      "peerDependencies": {
        "postcss": "^8.1.0"
      }
    },
    "node_modules/postcss-modules-local-by-default": {
      "version": "4.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/postcss-modules-local-by-default/-/postcss-modules-local-by-default-4.2.0.tgz",
      "integrity": "sha512-5kcJm/zk+GJDSfw+V/42fJ5fhjL5YbFDl8nVdXkJPLLW+Vf9mTD5Xe0wqIaDnLuL2U6cDNpTr+UQ+v2HWIBhzw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "icss-utils": "^5.0.0",
        "postcss-selector-parser": "^7.0.0",
        "postcss-value-parser": "^4.1.0"
      },
      "engines": {
        "node": "^10 || ^12 || >= 14"
      },
      "peerDependencies": {
        "postcss": "^8.1.0"
      }
    },
    "node_modules/postcss-modules-scope": {
      "version": "3.2.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/postcss-modules-scope/-/postcss-modules-scope-3.2.1.tgz",
      "integrity": "sha512-m9jZstCVaqGjTAuny8MdgE88scJnCiQSlSrOWcTQgM2t32UBe+MUmFSO5t7VMSfAf/FJKImAxBav8ooCHJXCJA==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "postcss-selector-parser": "^7.0.0"
      },
      "engines": {
        "node": "^10 || ^12 || >= 14"
      },
      "peerDependencies": {
        "postcss": "^8.1.0"
      }
    },
    "node_modules/postcss-modules-values": {
      "version": "4.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/postcss-modules-values/-/postcss-modules-values-4.0.0.tgz",
      "integrity": "sha512-RDxHkAiEGI78gS2ofyvCsu7iycRv7oqw5xMWn9iMoR0N/7mf9D50ecQqUo5BZ9Zh2vH4bCUR/ktCqbB9m8vJjQ==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "icss-utils": "^5.0.0"
      },
      "engines": {
        "node": "^10 || ^12 || >= 14"
      },
      "peerDependencies": {
        "postcss": "^8.1.0"
      }
    },
    "node_modules/postcss-selector-parser": {
      "version": "7.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/postcss-selector-parser/-/postcss-selector-parser-7.1.1.tgz",
      "integrity": "sha512-orRsuYpJVw8LdAwqqLykBj9ecS5/cRHlI5+nvTo8LcCKmzDmqVORXtOIYEEQuL9D4BxtA1lm5isAqzQZCoQ6Eg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "cssesc": "^3.0.0",
        "util-deprecate": "^1.0.2"
      },
      "engines": {
        "node": ">=4"
      }
    },
    "node_modules/postcss-value-parser": {
      "version": "4.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/postcss-value-parser/-/postcss-value-parser-4.2.0.tgz",
      "integrity": "sha512-1NNCs6uurfkVbeXG4S8JFT9t19m45ICnif8zWLd5oPSZ50QnwMfK+H3jv408d4jw/7Bttv5axS5IiHoLaVNHeQ==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/pretty-format": {
      "version": "29.7.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/pretty-format/-/pretty-format-29.7.0.tgz",
      "integrity": "sha512-Pdlw/oPxN+aXdmM9R00JVC9WVFoCLTKJvDVLgmJ+qAffBMxsV85l/Lu7sNx4zSzPyoL2euImuEwHhOXdEgNFZQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@jest/schemas": "^29.6.3",
        "ansi-styles": "^5.0.0",
        "react-is": "^18.0.0"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || >=18.0.0"
      }
    },
    "node_modules/pretty-format/node_modules/ansi-styles": {
      "version": "5.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ansi-styles/-/ansi-styles-5.2.0.tgz",
      "integrity": "sha512-Cxwpt2SfTzTtXcfOlzGEee8O+c+MmUgGrNiBcXnuWxuFJHe6a5Hz7qwhwe5OgaSYI0IJvkLqWX1ASG+cJOkEiA==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=10"
      },
      "funding": {
        "url": "https://github.com/chalk/ansi-styles?sponsor=1"
      }
    },
    "node_modules/prismjs": {
      "version": "1.30.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/prismjs/-/prismjs-1.30.0.tgz",
      "integrity": "sha512-DEvV2ZF2r2/63V+tK8hQvrR2ZGn10srHbXviTlcv7Kpzw8jWiNTqbVgjO3IY8RxrrOUF8VPMQQFysYYYv0YZxw==",
      "license": "MIT",
      "engines": {
        "node": ">=6"
      }
    },
    "node_modules/proc-log": {
      "version": "5.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/proc-log/-/proc-log-5.0.0.tgz",
      "integrity": "sha512-Azwzvl90HaF0aCz1JrDdXQykFakSSNPaPoiZ9fm5qJIMHioDZEi7OAdRwSm6rSoPtY3Qutnm3L7ogmg3dc+wbQ==",
      "dev": true,
      "license": "ISC",
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/process-nextick-args": {
      "version": "2.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/process-nextick-args/-/process-nextick-args-2.0.1.tgz",
      "integrity": "sha512-3ouUOpQhtgrbOa17J7+uxOTpITYWaGP7/AhoR3+A+/1e9skrzelGi/dXzEYyvbxubEF6Wn2ypscTKiKJFFn1ag==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/promise-retry": {
      "version": "2.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/promise-retry/-/promise-retry-2.0.1.tgz",
      "integrity": "sha512-y+WKFlBR8BGXnsNlIHFGPZmyDf3DFMoLhaflAnyZgV6rG6xu+JwesTo2Q9R6XwYmtmwAFCkAk3e35jEdoeh/3g==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "err-code": "^2.0.2",
        "retry": "^0.12.0"
      },
      "engines": {
        "node": ">=10"
      }
    },
    "node_modules/prompts": {
      "version": "2.4.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/prompts/-/prompts-2.4.2.tgz",
      "integrity": "sha512-NxNv/kLguCA7p3jE8oL2aEBsrJWgAakBpgmgK6lpPWV+WuOmY6r2/zbAVnP+T8bQlA0nzHXSJSJW0Hq7ylaD2Q==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "kleur": "^3.0.3",
        "sisteransi": "^1.0.5"
      },
      "engines": {
        "node": ">= 6"
      }
    },
    "node_modules/proxy-addr": {
      "version": "2.0.7",
      "resolved": "http://binario.caixa:8081/repository/npm-all/proxy-addr/-/proxy-addr-2.0.7.tgz",
      "integrity": "sha512-llQsMLSUDUPT44jdrU/O37qlnifitDP+ZwrmmZcoSKyLKvtZxpyV0n2/bD/N4tBAAZ/gJEdZU7KMraoK1+XYAg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "forwarded": "0.2.0",
        "ipaddr.js": "1.9.1"
      },
      "engines": {
        "node": ">= 0.10"
      }
    },
    "node_modules/proxy-addr/node_modules/ipaddr.js": {
      "version": "1.9.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ipaddr.js/-/ipaddr.js-1.9.1.tgz",
      "integrity": "sha512-0KI/607xoxSToH7GjN1FfSbLoU0+btTicjsQSWQlh/hZykN8KpmMf7uYwPW3R+akZ6R/w18ZlXSHBYXiYUPO3g==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.10"
      }
    },
    "node_modules/prr": {
      "version": "1.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/prr/-/prr-1.0.1.tgz",
      "integrity": "sha512-yPw4Sng1gWghHQWj0B3ZggWUm4qVbPwPFcRG8KyxiU7J2OHFSoEHKS+EZ3fv5l1t9CyCiop6l/ZYeWbrgoQejw==",
      "dev": true,
      "license": "MIT",
      "optional": true
    },
    "node_modules/psl": {
      "version": "1.15.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/psl/-/psl-1.15.0.tgz",
      "integrity": "sha512-JZd3gMVBAVQkSs6HdNZo9Sdo0LNcQeMNP3CozBJb3JYC/QUYZTnKxP+f8oWRX4rHP5EurWxqAHTSwUCjlNKa1w==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "punycode": "^2.3.1"
      },
      "funding": {
        "url": "https://github.com/sponsors/lupomontero"
      }
    },
    "node_modules/punycode": {
      "version": "2.3.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/punycode/-/punycode-2.3.1.tgz",
      "integrity": "sha512-vYt7UD1U9Wg6138shLtLOvdAu+8DsC/ilFtEVHcH+wydcSpNE20AfSOduf6MkRFahL5FY7X1oU7nKVZFtfq8Fg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=6"
      }
    },
    "node_modules/pure-rand": {
      "version": "6.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/pure-rand/-/pure-rand-6.1.0.tgz",
      "integrity": "sha512-bVWawvoZoBYpp6yIoQtQXHZjmz35RSVHnUOTefl8Vcjr8snTPY1wnpSPMWekcFwbxI6gtmT7rSYPFvz71ldiOA==",
      "dev": true,
      "funding": [
        {
          "type": "individual",
          "url": "https://github.com/sponsors/dubzzz"
        },
        {
          "type": "opencollective",
          "url": "https://opencollective.com/fast-check"
        }
      ],
      "license": "MIT"
    },
    "node_modules/qs": {
      "version": "6.14.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/qs/-/qs-6.14.2.tgz",
      "integrity": "sha512-V/yCWTTF7VJ9hIh18Ugr2zhJMP01MY7c5kh4J870L7imm6/DIzBsNLTXzMwUA3yZ5b/KBqLx8Kp3uRvd7xSe3Q==",
      "dev": true,
      "license": "BSD-3-Clause",
      "dependencies": {
        "side-channel": "^1.1.0"
      },
      "engines": {
        "node": ">=0.6"
      },
      "funding": {
        "url": "https://github.com/sponsors/ljharb"
      }
    },
    "node_modules/querystringify": {
      "version": "2.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/querystringify/-/querystringify-2.2.0.tgz",
      "integrity": "sha512-FIqgj2EUvTa7R50u0rGsyTftzjYmv/a3hO345bZNrqabNqjtgiDMgmo4mkUjd+nzU5oF3dClKqFIPUKybUyqoQ==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/queue-microtask": {
      "version": "1.2.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/queue-microtask/-/queue-microtask-1.2.3.tgz",
      "integrity": "sha512-NuaNSa6flKT5JaSYQzJok04JzTL1CA6aGhv5rfLW3PgqA+M2ChpZQnAC8h8i4ZFkBS8X5RqkDBHA7r4hej3K9A==",
      "funding": [
        {
          "type": "github",
          "url": "https://github.com/sponsors/feross"
        },
        {
          "type": "patreon",
          "url": "https://www.patreon.com/feross"
        },
        {
          "type": "consulting",
          "url": "https://feross.org/support"
        }
      ],
      "license": "MIT"
    },
    "node_modules/quill": {
      "version": "2.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/quill/-/quill-2.0.3.tgz",
      "integrity": "sha512-xEYQBqfYx/sfb33VJiKnSJp8ehloavImQ2A6564GAbqG55PGw1dAWUn1MUbQB62t0azawUS2CZZhWCjO8gRvTw==",
      "license": "BSD-3-Clause",
      "dependencies": {
        "eventemitter3": "^5.0.1",
        "lodash-es": "^4.17.21",
        "parchment": "^3.0.0",
        "quill-delta": "^5.1.0"
      },
      "engines": {
        "npm": ">=8.2.3"
      }
    },
    "node_modules/quill-delta": {
      "version": "5.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/quill-delta/-/quill-delta-5.1.0.tgz",
      "integrity": "sha512-X74oCeRI4/p0ucjb5Ma8adTXd9Scumz367kkMK5V/IatcX6A0vlgLgKbzXWy5nZmCGeNJm2oQX0d2Eqj+ZIlCA==",
      "license": "MIT",
      "dependencies": {
        "fast-diff": "^1.3.0",
        "lodash.clonedeep": "^4.5.0",
        "lodash.isequal": "^4.5.0"
      },
      "engines": {
        "node": ">= 12.0.0"
      }
    },
    "node_modules/quill/node_modules/eventemitter3": {
      "version": "5.0.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/eventemitter3/-/eventemitter3-5.0.4.tgz",
      "integrity": "sha512-mlsTRyGaPBjPedk6Bvw+aqbsXDtoAyAzm5MO7JgU+yVRyMQ5O8bD4Kcci7BS85f93veegeCPkL8R4GLClnjLFw==",
      "license": "MIT"
    },
    "node_modules/randombytes": {
      "version": "2.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/randombytes/-/randombytes-2.1.0.tgz",
      "integrity": "sha512-vYl3iOX+4CKUWuxGi9Ukhie6fsqXqS9FE2Zaic4tNFD2N2QQaXOMFbuKK4QmDHC0JO6B1Zp41J0LpT0oR68amQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "safe-buffer": "^5.1.0"
      }
    },
    "node_modules/range-parser": {
      "version": "1.2.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/range-parser/-/range-parser-1.2.1.tgz",
      "integrity": "sha512-Hrgsx+orqoygnmhFbKaHE6c296J+HTAQXoxEF6gNupROmmGJRoyzfG3ccAveqCBrwr/2yxQ5BVd/GTl5agOwSg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.6"
      }
    },
    "node_modules/raw-body": {
      "version": "2.5.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/raw-body/-/raw-body-2.5.3.tgz",
      "integrity": "sha512-s4VSOf6yN0rvbRZGxs8Om5CWj6seneMwK3oDb4lWDH0UPhWcxwOWw5+qk24bxq87szX1ydrwylIOp2uG1ojUpA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "bytes": "~3.1.2",
        "http-errors": "~2.0.1",
        "iconv-lite": "~0.4.24",
        "unpipe": "~1.0.0"
      },
      "engines": {
        "node": ">= 0.8"
      }
    },
    "node_modules/raw-body/node_modules/iconv-lite": {
      "version": "0.4.24",
      "resolved": "http://binario.caixa:8081/repository/npm-all/iconv-lite/-/iconv-lite-0.4.24.tgz",
      "integrity": "sha512-v3MXnZAcvnywkTUEZomIActle7RXXeedOR31wwl7VlyoXO4Qi9arvSenNQWne1TcRwhCL1HwLI21bEqdpj8/rA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "safer-buffer": ">= 2.1.2 < 3"
      },
      "engines": {
        "node": ">=0.10.0"
      }
    },
    "node_modules/react-is": {
      "version": "18.3.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/react-is/-/react-is-18.3.1.tgz",
      "integrity": "sha512-/LLMVyas0ljjAtoYiPqYiL8VWXzUUdThrmU5+n20DZv+a+ClRoevUzw5JxU+Ieh5/c87ytoTBV9G1FiKfNJdmg==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/readable-stream": {
      "version": "3.6.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/readable-stream/-/readable-stream-3.6.2.tgz",
      "integrity": "sha512-9u/sniCrY3D5WdsERHzHE4G2YCXqoG5FTHUiCC4SIbr6XcLZBY05ya9EKjYek9O5xOAwjGq+1JdGBAS7Q9ScoA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "inherits": "^2.0.3",
        "string_decoder": "^1.1.1",
        "util-deprecate": "^1.0.1"
      },
      "engines": {
        "node": ">= 6"
      }
    },
    "node_modules/readdirp": {
      "version": "4.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/readdirp/-/readdirp-4.1.2.tgz",
      "integrity": "sha512-GDhwkLfywWL2s6vEjyhri+eXmfH6j1L7JE27WhqLeYzoh/A3DBaYGEj2H/HFZCn/kMfim73FXxEJTw06WtxQwg==",
      "license": "MIT",
      "engines": {
        "node": ">= 14.18.0"
      },
      "funding": {
        "type": "individual",
        "url": "https://paulmillr.com/funding/"
      }
    },
    "node_modules/reflect-metadata": {
      "version": "0.2.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/reflect-metadata/-/reflect-metadata-0.2.2.tgz",
      "integrity": "sha512-urBwgfrvVP/eAyXx4hluJivBKzuEbSQs9rKWCrCkbSxNv8mxPcUZKeuoF3Uy4mJl3Lwprp6yy5/39VWigZ4K6Q==",
      "license": "Apache-2.0"
    },
    "node_modules/regenerate": {
      "version": "1.4.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/regenerate/-/regenerate-1.4.2.tgz",
      "integrity": "sha512-zrceR/XhGYU/d/opr2EKO7aRHUeiBI8qjtfHqADTwZd6Szfy16la6kqD0MIUs5z5hx6AaKa+PixpPrR289+I0A==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/regenerate-unicode-properties": {
      "version": "10.2.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/regenerate-unicode-properties/-/regenerate-unicode-properties-10.2.2.tgz",
      "integrity": "sha512-m03P+zhBeQd1RGnYxrGyDAPpWX/epKirLrp8e3qevZdVkKtnCrjjWczIbYc8+xd6vcTStVlqfycTx1KR4LOr0g==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "regenerate": "^1.4.2"
      },
      "engines": {
        "node": ">=4"
      }
    },
    "node_modules/regenerator-runtime": {
      "version": "0.14.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/regenerator-runtime/-/regenerator-runtime-0.14.1.tgz",
      "integrity": "sha512-dYnhHh0nJoMfnkZs6GmmhFknAGRrLznOu5nc9ML+EJxGvrx6H7teuevqVqCuPcPK//3eDrrjQhehXVx9cnkGdw==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/regex-parser": {
      "version": "2.3.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/regex-parser/-/regex-parser-2.3.1.tgz",
      "integrity": "sha512-yXLRqatcCuKtVHsWrNg0JL3l1zGfdXeEvDa0bdu4tCDQw0RpMDZsqbkyRTUnKMR0tXF627V2oEWjBEaEdqTwtQ==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/regexpu-core": {
      "version": "6.4.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/regexpu-core/-/regexpu-core-6.4.0.tgz",
      "integrity": "sha512-0ghuzq67LI9bLXpOX/ISfve/Mq33a4aFRzoQYhnnok1JOFpmE/A2TBGkNVenOGEeSBCjIiWcc6MVOG5HEQv0sA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "regenerate": "^1.4.2",
        "regenerate-unicode-properties": "^10.2.2",
        "regjsgen": "^0.8.0",
        "regjsparser": "^0.13.0",
        "unicode-match-property-ecmascript": "^2.0.0",
        "unicode-match-property-value-ecmascript": "^2.2.1"
      },
      "engines": {
        "node": ">=4"
      }
    },
    "node_modules/regjsgen": {
      "version": "0.8.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/regjsgen/-/regjsgen-0.8.0.tgz",
      "integrity": "sha512-RvwtGe3d7LvWiDQXeQw8p5asZUmfU1G/l6WbUXeHta7Y2PEIvBTwH6E2EfmYUK8pxcxEdEmaomqyp0vZZ7C+3Q==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/regjsparser": {
      "version": "0.13.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/regjsparser/-/regjsparser-0.13.0.tgz",
      "integrity": "sha512-NZQZdC5wOE/H3UT28fVGL+ikOZcEzfMGk/c3iN9UGxzWHMa1op7274oyiUVrAG4B2EuFhus8SvkaYnhvW92p9Q==",
      "dev": true,
      "license": "BSD-2-Clause",
      "dependencies": {
        "jsesc": "~3.1.0"
      },
      "bin": {
        "regjsparser": "bin/parser"
      }
    },
    "node_modules/require-directory": {
      "version": "2.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/require-directory/-/require-directory-2.1.1.tgz",
      "integrity": "sha512-fGxEI7+wsG9xrvdjsrlmL22OMTTiHRwAMroiEeMgq8gzoLC/PQr7RsRDSTLUg/bZAZtF+TVIkHc6/4RIKrui+Q==",
      "license": "MIT",
      "engines": {
        "node": ">=0.10.0"
      }
    },
    "node_modules/require-from-string": {
      "version": "2.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/require-from-string/-/require-from-string-2.0.2.tgz",
      "integrity": "sha512-Xf0nWe6RseziFMu+Ap9biiUbmplq6S9/p+7w7YXP/JBHhrUDDUhwa+vANyubuqfZWTveU//DYVGsDG7RKL/vEw==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=0.10.0"
      }
    },
    "node_modules/requires-port": {
      "version": "1.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/requires-port/-/requires-port-1.0.0.tgz",
      "integrity": "sha512-KigOCHcocU3XODJxsu8i/j8T9tzT4adHiecwORRQ0ZZFcp7ahwXuRU1m+yuO90C5ZUyGeGfocHDI14M3L3yDAQ==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/resolve": {
      "version": "1.22.10",
      "resolved": "http://binario.caixa:8081/repository/npm-all/resolve/-/resolve-1.22.10.tgz",
      "integrity": "sha512-NPRy+/ncIMeDlTAsuqwKIiferiawhefFJtkNSW0qZJEqMEb+qBt/77B/jGeeek+F0uOeN05CDa6HXbbIgtVX4w==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "is-core-module": "^2.16.0",
        "path-parse": "^1.0.7",
        "supports-preserve-symlinks-flag": "^1.0.0"
      },
      "bin": {
        "resolve": "bin/resolve"
      },
      "engines": {
        "node": ">= 0.4"
      },
      "funding": {
        "url": "https://github.com/sponsors/ljharb"
      }
    },
    "node_modules/resolve-cwd": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/resolve-cwd/-/resolve-cwd-3.0.0.tgz",
      "integrity": "sha512-OrZaX2Mb+rJCpH/6CpSqt9xFVpN++x01XnN2ie9g6P5/3xelLAkXWVADpdz1IHD/KFfEXyE6V0U01OQ3UO2rEg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "resolve-from": "^5.0.0"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/resolve-from": {
      "version": "5.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/resolve-from/-/resolve-from-5.0.0.tgz",
      "integrity": "sha512-qYg9KP24dD5qka9J47d0aVky0N+b4fTU89LN9iDnjB5waksiC49rvMB0PrUJQGoTmH50XPiqOvAjDfaijGxYZw==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/resolve-url-loader": {
      "version": "5.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/resolve-url-loader/-/resolve-url-loader-5.0.0.tgz",
      "integrity": "sha512-uZtduh8/8srhBoMx//5bwqjQ+rfYOUq8zC9NrMUGtjBiGTtFJM42s58/36+hTqeqINcnYe08Nj3LkK9lW4N8Xg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "adjust-sourcemap-loader": "^4.0.0",
        "convert-source-map": "^1.7.0",
        "loader-utils": "^2.0.0",
        "postcss": "^8.2.14",
        "source-map": "0.6.1"
      },
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/resolve-url-loader/node_modules/loader-utils": {
      "version": "2.0.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/loader-utils/-/loader-utils-2.0.4.tgz",
      "integrity": "sha512-xXqpXoINfFhgua9xiqD8fPFHgkoq1mmmpE92WlDbm9rNRd/EbRb+Gqf908T2DMfuHjjJlksiK2RbHVOdD/MqSw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "big.js": "^5.2.2",
        "emojis-list": "^3.0.0",
        "json5": "^2.1.2"
      },
      "engines": {
        "node": ">=8.9.0"
      }
    },
    "node_modules/resolve-url-loader/node_modules/source-map": {
      "version": "0.6.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/source-map/-/source-map-0.6.1.tgz",
      "integrity": "sha512-UjgapumWlbMhkBgzT7Ykc5YXUT46F0iKu8SGXq0bcwP5dz/h0Plj6enJqjz1Zbq2l5WaqYnrVbwWOWMyF3F47g==",
      "dev": true,
      "license": "BSD-3-Clause",
      "engines": {
        "node": ">=0.10.0"
      }
    },
    "node_modules/resolve.exports": {
      "version": "2.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/resolve.exports/-/resolve.exports-2.0.3.tgz",
      "integrity": "sha512-OcXjMsGdhL4XnbShKpAcSqPMzQoYkYyhbEaeSko47MjRP9NfEQMhZkXL1DoFlt9LWQn4YttrdnV6X2OiyzBi+A==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=10"
      }
    },
    "node_modules/restore-cursor": {
      "version": "5.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/restore-cursor/-/restore-cursor-5.1.0.tgz",
      "integrity": "sha512-oMA2dcrw6u0YfxJQXm342bFKX/E4sG9rbTzO9ptUcR/e8A33cHuvStiYOwH7fszkZlZ1z/ta9AAoPk2F4qIOHA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "onetime": "^7.0.0",
        "signal-exit": "^4.1.0"
      },
      "engines": {
        "node": ">=18"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/restore-cursor/node_modules/onetime": {
      "version": "7.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/onetime/-/onetime-7.0.0.tgz",
      "integrity": "sha512-VXJjc87FScF88uafS3JllDgvAm+c/Slfz06lorj2uAY34rlUu0Nt+v8wreiImcrgAjjIHp1rXpTDlLOGw29WwQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "mimic-function": "^5.0.0"
      },
      "engines": {
        "node": ">=18"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/retry": {
      "version": "0.12.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/retry/-/retry-0.12.0.tgz",
      "integrity": "sha512-9LkiTwjUh6rT555DtE9rTX+BKByPfrMzEAtnlEtdEwr3Nkffwiihqe2bWADg+OQRjt9gl6ICdmB/ZFDCGAtSow==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 4"
      }
    },
    "node_modules/reusify": {
      "version": "1.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/reusify/-/reusify-1.1.0.tgz",
      "integrity": "sha512-g6QUff04oZpHs0eG5p83rFLhHeV00ug/Yf9nZM6fLeUrPguBTkTQOdpAWWspMh55TZfVQDPaN3NQJfbVRAxdIw==",
      "license": "MIT",
      "engines": {
        "iojs": ">=1.0.0",
        "node": ">=0.10.0"
      }
    },
    "node_modules/rfdc": {
      "version": "1.4.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/rfdc/-/rfdc-1.4.1.tgz",
      "integrity": "sha512-q1b3N5QkRUWUl7iyylaaj3kOpIT0N2i9MqIEQXP73GVsN9cw3fdx8X63cEmWhJGi2PPCF23Ijp7ktmd39rawIA==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/robust-predicates": {
      "version": "3.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/robust-predicates/-/robust-predicates-3.0.3.tgz",
      "integrity": "sha512-NS3levdsRIUOmiJ8FZWCP7LG3QpJyrs/TE0Zpf1yvZu8cAJJ6QMW92H1c7kWpdIHo8RvmLxN/o2JXTKHp74lUA==",
      "license": "Unlicense",
      "optional": true
    },
    "node_modules/rollup": {
      "version": "4.59.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/rollup/-/rollup-4.59.0.tgz",
      "integrity": "sha512-2oMpl67a3zCH9H79LeMcbDhXW/UmWG/y2zuqnF2jQq5uq9TbM9TVyXvA4+t+ne2IIkBdrLpAaRQAvo7YI/Yyeg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/estree": "1.0.8"
      },
      "bin": {
        "rollup": "dist/bin/rollup"
      },
      "engines": {
        "node": ">=18.0.0",
        "npm": ">=8.0.0"
      },
      "optionalDependencies": {
        "@rollup/rollup-android-arm-eabi": "4.59.0",
        "@rollup/rollup-android-arm64": "4.59.0",
        "@rollup/rollup-darwin-arm64": "4.59.0",
        "@rollup/rollup-darwin-x64": "4.59.0",
        "@rollup/rollup-freebsd-arm64": "4.59.0",
        "@rollup/rollup-freebsd-x64": "4.59.0",
        "@rollup/rollup-linux-arm-gnueabihf": "4.59.0",
        "@rollup/rollup-linux-arm-musleabihf": "4.59.0",
        "@rollup/rollup-linux-arm64-gnu": "4.59.0",
        "@rollup/rollup-linux-arm64-musl": "4.59.0",
        "@rollup/rollup-linux-loong64-gnu": "4.59.0",
        "@rollup/rollup-linux-loong64-musl": "4.59.0",
        "@rollup/rollup-linux-ppc64-gnu": "4.59.0",
        "@rollup/rollup-linux-ppc64-musl": "4.59.0",
        "@rollup/rollup-linux-riscv64-gnu": "4.59.0",
        "@rollup/rollup-linux-riscv64-musl": "4.59.0",
        "@rollup/rollup-linux-s390x-gnu": "4.59.0",
        "@rollup/rollup-linux-x64-gnu": "4.59.0",
        "@rollup/rollup-linux-x64-musl": "4.59.0",
        "@rollup/rollup-openbsd-x64": "4.59.0",
        "@rollup/rollup-openharmony-arm64": "4.59.0",
        "@rollup/rollup-win32-arm64-msvc": "4.59.0",
        "@rollup/rollup-win32-ia32-msvc": "4.59.0",
        "@rollup/rollup-win32-x64-gnu": "4.59.0",
        "@rollup/rollup-win32-x64-msvc": "4.59.0",
        "fsevents": "~2.3.2"
      }
    },
    "node_modules/roughjs": {
      "version": "4.6.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/roughjs/-/roughjs-4.6.6.tgz",
      "integrity": "sha512-ZUz/69+SYpFN/g/lUlo2FXcIjRkSu3nDarreVdGGndHEBJ6cXPdKguS8JGxwj5HA5xIbVKSmLgr5b3AWxtRfvQ==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "hachure-fill": "^0.5.2",
        "path-data-parser": "^0.1.0",
        "points-on-curve": "^0.2.0",
        "points-on-path": "^0.2.1"
      }
    },
    "node_modules/run-applescript": {
      "version": "7.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/run-applescript/-/run-applescript-7.1.0.tgz",
      "integrity": "sha512-DPe5pVFaAsinSaV6QjQ6gdiedWDcRCbUuiQfQa2wmWV7+xC9bGulGI8+TdRmoFkAPaBXk8CrAbnlY2ISniJ47Q==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=18"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/run-parallel": {
      "version": "1.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/run-parallel/-/run-parallel-1.2.0.tgz",
      "integrity": "sha512-5l4VyZR86LZ/lDxZTR6jqL8AFE2S0IFLMP26AbjsLVADxHdhB/c0GUsH+y39UfCi3dzz8OlQuPmnaJOMoDHQBA==",
      "funding": [
        {
          "type": "github",
          "url": "https://github.com/sponsors/feross"
        },
        {
          "type": "patreon",
          "url": "https://www.patreon.com/feross"
        },
        {
          "type": "consulting",
          "url": "https://feross.org/support"
        }
      ],
      "license": "MIT",
      "dependencies": {
        "queue-microtask": "^1.2.2"
      }
    },
    "node_modules/rw": {
      "version": "1.3.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/rw/-/rw-1.3.3.tgz",
      "integrity": "sha512-PdhdWy89SiZogBLaw42zdeqtRJ//zFd2PgQavcICDUgJT5oW10QCRKbJ6bg4r0/UY2M6BWd5tkxuGFRvCkgfHQ==",
      "license": "BSD-3-Clause",
      "optional": true
    },
    "node_modules/rxjs": {
      "version": "7.8.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/rxjs/-/rxjs-7.8.2.tgz",
      "integrity": "sha512-dhKf903U/PQZY6boNNtAGdWbG85WAbjT/1xYoZIC7FAY0yWapOBQVsVrDl58W86//e1VpMNBtRV4MaXfdMySFA==",
      "license": "Apache-2.0",
      "dependencies": {
        "tslib": "^2.1.0"
      }
    },
    "node_modules/safe-buffer": {
      "version": "5.2.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/safe-buffer/-/safe-buffer-5.2.1.tgz",
      "integrity": "sha512-rp3So07KcdmmKbGvgaNxQSJr7bGVSVk5S9Eq1F+ppbRo70+YeaDxkw5Dd8NPN+GD6bjnYm2VuPuCXmpuYvmCXQ==",
      "dev": true,
      "funding": [
        {
          "type": "github",
          "url": "https://github.com/sponsors/feross"
        },
        {
          "type": "patreon",
          "url": "https://www.patreon.com/feross"
        },
        {
          "type": "consulting",
          "url": "https://feross.org/support"
        }
      ],
      "license": "MIT"
    },
    "node_modules/safer-buffer": {
      "version": "2.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/safer-buffer/-/safer-buffer-2.1.2.tgz",
      "integrity": "sha512-YZo3K82SD7Riyi0E1EQPojLz7kpepnSQI9IyPbHHg1XXXevb5dJI7tpyN2ADxGcQbHG7vcyRHk0cbwqcQriUtg==",
      "devOptional": true,
      "license": "MIT"
    },
    "node_modules/sass": {
      "version": "1.85.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/sass/-/sass-1.85.0.tgz",
      "integrity": "sha512-3ToiC1xZ1Y8aU7+CkgCI/tqyuPXEmYGJXO7H4uqp0xkLXUqp88rQQ4j1HmP37xSJLbCJPaIiv+cT1y+grssrww==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "chokidar": "^4.0.0",
        "immutable": "^5.0.2",
        "source-map-js": ">=0.6.2 <2.0.0"
      },
      "bin": {
        "sass": "sass.js"
      },
      "engines": {
        "node": ">=14.0.0"
      },
      "optionalDependencies": {
        "@parcel/watcher": "^2.4.1"
      }
    },
    "node_modules/sass-loader": {
      "version": "16.0.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/sass-loader/-/sass-loader-16.0.5.tgz",
      "integrity": "sha512-oL+CMBXrj6BZ/zOq4os+UECPL+bWqt6OAC6DWS8Ln8GZRcMDjlJ4JC3FBDuHJdYaFWIdKNIBYmtZtK2MaMkNIw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "neo-async": "^2.6.2"
      },
      "engines": {
        "node": ">= 18.12.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/webpack"
      },
      "peerDependencies": {
        "@rspack/core": "0.x || 1.x",
        "node-sass": "^4.0.0 || ^5.0.0 || ^6.0.0 || ^7.0.0 || ^8.0.0 || ^9.0.0",
        "sass": "^1.3.0",
        "sass-embedded": "*",
        "webpack": "^5.0.0"
      },
      "peerDependenciesMeta": {
        "@rspack/core": {
          "optional": true
        },
        "node-sass": {
          "optional": true
        },
        "sass": {
          "optional": true
        },
        "sass-embedded": {
          "optional": true
        },
        "webpack": {
          "optional": true
        }
      }
    },
    "node_modules/sax": {
      "version": "1.6.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/sax/-/sax-1.6.0.tgz",
      "integrity": "sha512-6R3J5M4AcbtLUdZmRv2SygeVaM7IhrLXu9BmnOGmmACak8fiUtOsYNWUS4uK7upbmHIBbLBeFeI//477BKLBzA==",
      "dev": true,
      "license": "BlueOak-1.0.0",
      "optional": true,
      "engines": {
        "node": ">=11.0.0"
      }
    },
    "node_modules/saxes": {
      "version": "6.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/saxes/-/saxes-6.0.0.tgz",
      "integrity": "sha512-xAg7SOnEhrm5zI3puOOKyy1OMcMlIJZYNJY7xLBwSze0UjhPLnWfj2GF2EpT0jmzaJKIWKHLsaSSajf35bcYnA==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "xmlchars": "^2.2.0"
      },
      "engines": {
        "node": ">=v12.22.7"
      }
    },
    "node_modules/schema-utils": {
      "version": "4.3.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/schema-utils/-/schema-utils-4.3.3.tgz",
      "integrity": "sha512-eflK8wEtyOE6+hsaRVPxvUKYCpRgzLqDTb8krvAsRIwOGlHoSgYLgBXoubGgLd2fT41/OUYdb48v4k4WWHQurA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/json-schema": "^7.0.9",
        "ajv": "^8.9.0",
        "ajv-formats": "^2.1.1",
        "ajv-keywords": "^5.1.0"
      },
      "engines": {
        "node": ">= 10.13.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/webpack"
      }
    },
    "node_modules/schema-utils/node_modules/ajv-formats": {
      "version": "2.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ajv-formats/-/ajv-formats-2.1.1.tgz",
      "integrity": "sha512-Wx0Kx52hxE7C18hkMEggYlEifqWZtYaRgouJor+WMdPnQyEK13vgEWyVNup7SoeeoLMsr4kf5h6dOW11I15MUA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "ajv": "^8.0.0"
      },
      "peerDependencies": {
        "ajv": "^8.0.0"
      },
      "peerDependenciesMeta": {
        "ajv": {
          "optional": true
        }
      }
    },
    "node_modules/select": {
      "version": "1.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/select/-/select-1.1.2.tgz",
      "integrity": "sha512-OwpTSOfy6xSs1+pwcNrv0RBMOzI39Lp3qQKUTPVVPRjCdNa5JH/oPRiqsesIskK8TVgmRiHwO4KXlV2Li9dANA==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/select-hose": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/select-hose/-/select-hose-2.0.0.tgz",
      "integrity": "sha512-mEugaLK+YfkijB4fx0e6kImuJdCIt2LxCRcbEYPqRGCs4F2ogyfZU5IAZRdjCP8JPq2AtdNoC/Dux63d9Kiryg==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/selfsigned": {
      "version": "2.4.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/selfsigned/-/selfsigned-2.4.1.tgz",
      "integrity": "sha512-th5B4L2U+eGLq1TVh7zNRGBapioSORUeymIydxgFpwww9d2qyKvtuPU2jJuHvYAwwqi2Y596QBL3eEqcPEYL8Q==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/node-forge": "^1.3.0",
        "node-forge": "^1"
      },
      "engines": {
        "node": ">=10"
      }
    },
    "node_modules/semver": {
      "version": "7.7.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/semver/-/semver-7.7.1.tgz",
      "integrity": "sha512-hlq8tAfn0m/61p4BVRcPzIGr6LKiMwo4VM6dGi6pt4qcRkmNzTcWq6eCEjEh+qXjkMDvPlOFFSGwQjoEa6gyMA==",
      "license": "ISC",
      "bin": {
        "semver": "bin/semver.js"
      },
      "engines": {
        "node": ">=10"
      }
    },
    "node_modules/send": {
      "version": "0.19.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/send/-/send-0.19.2.tgz",
      "integrity": "sha512-VMbMxbDeehAxpOtWJXlcUS5E8iXh6QmN+BkRX1GARS3wRaXEEgzCcB10gTQazO42tpNIya8xIyNx8fll1OFPrg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "debug": "2.6.9",
        "depd": "2.0.0",
        "destroy": "1.2.0",
        "encodeurl": "~2.0.0",
        "escape-html": "~1.0.3",
        "etag": "~1.8.1",
        "fresh": "~0.5.2",
        "http-errors": "~2.0.1",
        "mime": "1.6.0",
        "ms": "2.1.3",
        "on-finished": "~2.4.1",
        "range-parser": "~1.2.1",
        "statuses": "~2.0.2"
      },
      "engines": {
        "node": ">= 0.8.0"
      }
    },
    "node_modules/send/node_modules/debug": {
      "version": "2.6.9",
      "resolved": "http://binario.caixa:8081/repository/npm-all/debug/-/debug-2.6.9.tgz",
      "integrity": "sha512-bC7ElrdJaJnPbAP+1EotYvqZsb3ecl5wi6Bfi6BJTUcNowp6cvspg0jXznRTKDjm/E7AdgFBVeAPVMNcKGsHMA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "ms": "2.0.0"
      }
    },
    "node_modules/send/node_modules/debug/node_modules/ms": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ms/-/ms-2.0.0.tgz",
      "integrity": "sha512-Tpp60P6IUJDTuOq/5Z8cdskzJujfwqfOTkrwIwj7IRISpnkJnT6SyJ4PCPnGMoFjC9ddhal5KVIYtAt97ix05A==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/serialize-javascript": {
      "version": "6.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/serialize-javascript/-/serialize-javascript-6.0.2.tgz",
      "integrity": "sha512-Saa1xPByTTq2gdeFZYLLo+RFE35NHZkAbqZeWNd3BpzppeVisAqpDjcp8dyf6uIvEqJRd46jemmyA4iFIeVk8g==",
      "dev": true,
      "license": "BSD-3-Clause",
      "dependencies": {
        "randombytes": "^2.1.0"
      }
    },
    "node_modules/serve-index": {
      "version": "1.9.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/serve-index/-/serve-index-1.9.2.tgz",
      "integrity": "sha512-KDj11HScOaLmrPxl70KYNW1PksP4Nb/CLL2yvC+Qd2kHMPEEpfc4Re2e4FOay+bC/+XQl/7zAcWON3JVo5v3KQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "accepts": "~1.3.8",
        "batch": "0.6.1",
        "debug": "2.6.9",
        "escape-html": "~1.0.3",
        "http-errors": "~1.8.0",
        "mime-types": "~2.1.35",
        "parseurl": "~1.3.3"
      },
      "engines": {
        "node": ">= 0.8.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/express"
      }
    },
    "node_modules/serve-index/node_modules/debug": {
      "version": "2.6.9",
      "resolved": "http://binario.caixa:8081/repository/npm-all/debug/-/debug-2.6.9.tgz",
      "integrity": "sha512-bC7ElrdJaJnPbAP+1EotYvqZsb3ecl5wi6Bfi6BJTUcNowp6cvspg0jXznRTKDjm/E7AdgFBVeAPVMNcKGsHMA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "ms": "2.0.0"
      }
    },
    "node_modules/serve-index/node_modules/depd": {
      "version": "1.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/depd/-/depd-1.1.2.tgz",
      "integrity": "sha512-7emPTl6Dpo6JRXOXjLRxck+FlLRX5847cLKEn00PLAgc3g2hTZZgr+e4c2v6QpSmLeFP3n5yUo7ft6avBK/5jQ==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.6"
      }
    },
    "node_modules/serve-index/node_modules/http-errors": {
      "version": "1.8.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/http-errors/-/http-errors-1.8.1.tgz",
      "integrity": "sha512-Kpk9Sm7NmI+RHhnj6OIWDI1d6fIoFAtFt9RLaTMRlg/8w49juAStsrBgp0Dp4OdxdVbRIeKhtCUvoi/RuAhO4g==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "depd": "~1.1.2",
        "inherits": "2.0.4",
        "setprototypeof": "1.2.0",
        "statuses": ">= 1.5.0 < 2",
        "toidentifier": "1.0.1"
      },
      "engines": {
        "node": ">= 0.6"
      }
    },
    "node_modules/serve-index/node_modules/ms": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ms/-/ms-2.0.0.tgz",
      "integrity": "sha512-Tpp60P6IUJDTuOq/5Z8cdskzJujfwqfOTkrwIwj7IRISpnkJnT6SyJ4PCPnGMoFjC9ddhal5KVIYtAt97ix05A==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/serve-index/node_modules/statuses": {
      "version": "1.5.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/statuses/-/statuses-1.5.0.tgz",
      "integrity": "sha512-OpZ3zP+jT1PI7I8nemJX4AKmAX070ZkYPVWV/AaKTJl+tXCTGyVdC1a4SL8RUQYEwk/f34ZX8UTykN68FwrqAA==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.6"
      }
    },
    "node_modules/serve-static": {
      "version": "1.16.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/serve-static/-/serve-static-1.16.3.tgz",
      "integrity": "sha512-x0RTqQel6g5SY7Lg6ZreMmsOzncHFU7nhnRWkKgWuMTu5NN0DR5oruckMqRvacAN9d5w6ARnRBXl9xhDCgfMeA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "encodeurl": "~2.0.0",
        "escape-html": "~1.0.3",
        "parseurl": "~1.3.3",
        "send": "~0.19.1"
      },
      "engines": {
        "node": ">= 0.8.0"
      }
    },
    "node_modules/setprototypeof": {
      "version": "1.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/setprototypeof/-/setprototypeof-1.2.0.tgz",
      "integrity": "sha512-E5LDX7Wrp85Kil5bhZv46j8jOeboKq5JMmYM3gVGdGH8xFpPWXUMsNrlODCrkoxMEeNi/XZIwuRvY4XNwYMJpw==",
      "dev": true,
      "license": "ISC"
    },
    "node_modules/shallow-clone": {
      "version": "3.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/shallow-clone/-/shallow-clone-3.0.1.tgz",
      "integrity": "sha512-/6KqX+GVUdqPuPPd2LxDDxzX6CAbjJehAAOKlNpqqUpAqPM6HeL8f+o3a+JsyGjn2lv0WY8UsTgUJjU9Ok55NA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "kind-of": "^6.0.2"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/shebang-command": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/shebang-command/-/shebang-command-2.0.0.tgz",
      "integrity": "sha512-kHxr2zZpYtdmrN1qDjrrX/Z1rR1kG8Dx+gkpK1G4eXmvXswmcE1hTWBWYUzlraYw1/yZp6YuDY77YtvbN0dmDA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "shebang-regex": "^3.0.0"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/shebang-regex": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/shebang-regex/-/shebang-regex-3.0.0.tgz",
      "integrity": "sha512-7++dFhtcx3353uBaq8DDR4NuxBetBzC7ZQOhmTQInHEd6bSrXdiEyzCvG07Z44UYdLShWUyXt5M/yhz8ekcb1A==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/shell-quote": {
      "version": "1.8.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/shell-quote/-/shell-quote-1.8.3.tgz",
      "integrity": "sha512-ObmnIF4hXNg1BqhnHmgbDETF8dLPCggZWBjkQfhZpbszZnYur5DUljTcCHii5LC3J5E0yeO/1LIMyH+UvHQgyw==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.4"
      },
      "funding": {
        "url": "https://github.com/sponsors/ljharb"
      }
    },
    "node_modules/side-channel": {
      "version": "1.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/side-channel/-/side-channel-1.1.0.tgz",
      "integrity": "sha512-ZX99e6tRweoUXqR+VBrslhda51Nh5MTQwou5tnUDgbtyM0dBgmhEDtWGP/xbKn6hqfPRHujUNwz5fy/wbbhnpw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "es-errors": "^1.3.0",
        "object-inspect": "^1.13.3",
        "side-channel-list": "^1.0.0",
        "side-channel-map": "^1.0.1",
        "side-channel-weakmap": "^1.0.2"
      },
      "engines": {
        "node": ">= 0.4"
      },
      "funding": {
        "url": "https://github.com/sponsors/ljharb"
      }
    },
    "node_modules/side-channel-list": {
      "version": "1.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/side-channel-list/-/side-channel-list-1.0.0.tgz",
      "integrity": "sha512-FCLHtRD/gnpCiCHEiJLOwdmFP+wzCmDEkc9y7NsYxeF4u7Btsn1ZuwgwJGxImImHicJArLP4R0yX4c2KCrMrTA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "es-errors": "^1.3.0",
        "object-inspect": "^1.13.3"
      },
      "engines": {
        "node": ">= 0.4"
      },
      "funding": {
        "url": "https://github.com/sponsors/ljharb"
      }
    },
    "node_modules/side-channel-map": {
      "version": "1.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/side-channel-map/-/side-channel-map-1.0.1.tgz",
      "integrity": "sha512-VCjCNfgMsby3tTdo02nbjtM/ewra6jPHmpThenkTYh8pG9ucZ/1P8So4u4FGBek/BjpOVsDCMoLA/iuBKIFXRA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "call-bound": "^1.0.2",
        "es-errors": "^1.3.0",
        "get-intrinsic": "^1.2.5",
        "object-inspect": "^1.13.3"
      },
      "engines": {
        "node": ">= 0.4"
      },
      "funding": {
        "url": "https://github.com/sponsors/ljharb"
      }
    },
    "node_modules/side-channel-weakmap": {
      "version": "1.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/side-channel-weakmap/-/side-channel-weakmap-1.0.2.tgz",
      "integrity": "sha512-WPS/HvHQTYnHisLo9McqBHOJk2FkHO/tlpvldyrnem4aeQp4hai3gythswg6p01oSoTl58rcpiFAjF2br2Ak2A==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "call-bound": "^1.0.2",
        "es-errors": "^1.3.0",
        "get-intrinsic": "^1.2.5",
        "object-inspect": "^1.13.3",
        "side-channel-map": "^1.0.1"
      },
      "engines": {
        "node": ">= 0.4"
      },
      "funding": {
        "url": "https://github.com/sponsors/ljharb"
      }
    },
    "node_modules/sidsc-components": {
      "version": "19.0.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/sidsc-components/-/sidsc-components-19.0.4.tgz",
      "integrity": "sha512-QV3c7xciTbObcW2QlmFu/AcLThOuPBAeCRfo4FnEMPOnsYni3jgi86WsBwfcGluIjYIgMVVkF8DpLxsTSe1s/w==",
      "dependencies": {
        "tslib": "^2.6.2"
      },
      "peerDependencies": {
        "@angular/common": "^19.0.0",
        "@angular/core": "^19.0.0",
        "@angular/forms": "^19.0.0",
        "@angular/material": "^19.0.0",
        "@angular/material-date-fns-adapter": "^19.0.0",
        "inputmask": "^5.0.9-beta.62",
        "ng2-currency-mask": "^13.0.3",
        "ngx-mask": "^19.0.6"
      }
    },
    "node_modules/signal-exit": {
      "version": "4.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/signal-exit/-/signal-exit-4.1.0.tgz",
      "integrity": "sha512-bzyZ1e88w9O1iNJbKnOlvYTrWPDl46O1bG0D3XInv+9tkPrxrN8jUUTiFlDkkmKWgn1M6CfIA13SuGqOa9Korw==",
      "dev": true,
      "license": "ISC",
      "engines": {
        "node": ">=14"
      },
      "funding": {
        "url": "https://github.com/sponsors/isaacs"
      }
    },
    "node_modules/sigstore": {
      "version": "3.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/sigstore/-/sigstore-3.1.0.tgz",
      "integrity": "sha512-ZpzWAFHIFqyFE56dXqgX/DkDRZdz+rRcjoIk/RQU4IX0wiCv1l8S7ZrXDHcCc+uaf+6o7w3h2l3g6GYG5TKN9Q==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "@sigstore/bundle": "^3.1.0",
        "@sigstore/core": "^2.0.0",
        "@sigstore/protobuf-specs": "^0.4.0",
        "@sigstore/sign": "^3.1.0",
        "@sigstore/tuf": "^3.1.0",
        "@sigstore/verify": "^2.1.0"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/sisteransi": {
      "version": "1.0.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/sisteransi/-/sisteransi-1.0.5.tgz",
      "integrity": "sha512-bLGGlR1QxBcynn2d5YmDX4MGjlZvy2MRBDRNHLJ8VI6l6+9FUiyTFNJ0IveOSP0bcXgVDPRcfGqA0pjaqUpfVg==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/slash": {
      "version": "5.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/slash/-/slash-5.1.0.tgz",
      "integrity": "sha512-ZA6oR3T/pEyuqwMgAKT0/hAv8oAXckzbkmR0UkUosQ+Mc4RxGoJkRmwHgHufaenlyAgE1Mxgpdcrf75y6XcnDg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=14.16"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/slice-ansi": {
      "version": "5.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/slice-ansi/-/slice-ansi-5.0.0.tgz",
      "integrity": "sha512-FC+lgizVPfie0kkhqUScwRu1O/lF6NOgJmlCgK+/LYxDCTk8sGelYaHDhFcDN+Sn3Cv+3VSa4Byeo+IMCzpMgQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "ansi-styles": "^6.0.0",
        "is-fullwidth-code-point": "^4.0.0"
      },
      "engines": {
        "node": ">=12"
      },
      "funding": {
        "url": "https://github.com/chalk/slice-ansi?sponsor=1"
      }
    },
    "node_modules/slice-ansi/node_modules/ansi-styles": {
      "version": "6.2.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ansi-styles/-/ansi-styles-6.2.3.tgz",
      "integrity": "sha512-4Dj6M28JB+oAH8kFkTLUo+a2jwOFkuqb3yucU0CANcRRUbxS0cP0nZYCGjcc3BNXwRIsUVmDGgzawme7zvJHvg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=12"
      },
      "funding": {
        "url": "https://github.com/chalk/ansi-styles?sponsor=1"
      }
    },
    "node_modules/smart-buffer": {
      "version": "4.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/smart-buffer/-/smart-buffer-4.2.0.tgz",
      "integrity": "sha512-94hK0Hh8rPqQl2xXc3HsaBoOXKV20MToPkcXvwbISWLEs+64sBq5kFgn2kJDHb1Pry9yrP0dxrCI9RRci7RXKg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 6.0.0",
        "npm": ">= 3.0.0"
      }
    },
    "node_modules/sockjs": {
      "version": "0.3.24",
      "resolved": "http://binario.caixa:8081/repository/npm-all/sockjs/-/sockjs-0.3.24.tgz",
      "integrity": "sha512-GJgLTZ7vYb/JtPSSZ10hsOYIvEYsjbNU+zPdIHcUaWVNUEPivzxku31865sSSud0Da0W4lEeOPlmw93zLQchuQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "faye-websocket": "^0.11.3",
        "uuid": "^8.3.2",
        "websocket-driver": "^0.7.4"
      }
    },
    "node_modules/sockjs/node_modules/uuid": {
      "version": "8.3.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/uuid/-/uuid-8.3.2.tgz",
      "integrity": "sha512-+NYs2QeMWy+GWFOEm9xnn6HCDp0l7QBD7ml8zLUmJ+93Q5NF0NocErnwkTkXVFNiX3/fpC6afS8Dhb/gz7R7eg==",
      "dev": true,
      "license": "MIT",
      "bin": {
        "uuid": "dist/bin/uuid"
      }
    },
    "node_modules/socks": {
      "version": "2.8.7",
      "resolved": "http://binario.caixa:8081/repository/npm-all/socks/-/socks-2.8.7.tgz",
      "integrity": "sha512-HLpt+uLy/pxB+bum/9DzAgiKS8CX1EvbWxI4zlmgGCExImLdiad2iCwXT5Z4c9c3Eq8rP2318mPW2c+QbtjK8A==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "ip-address": "^10.0.1",
        "smart-buffer": "^4.2.0"
      },
      "engines": {
        "node": ">= 10.0.0",
        "npm": ">= 3.0.0"
      }
    },
    "node_modules/socks-proxy-agent": {
      "version": "8.0.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/socks-proxy-agent/-/socks-proxy-agent-8.0.5.tgz",
      "integrity": "sha512-HehCEsotFqbPW9sJ8WVYB6UbmIMv7kUUORIF2Nncq4VQvBfNBLibW9YZR5dlYCSUhwcD628pRllm7n+E+YTzJw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "agent-base": "^7.1.2",
        "debug": "^4.3.4",
        "socks": "^2.8.3"
      },
      "engines": {
        "node": ">= 14"
      }
    },
    "node_modules/source-map": {
      "version": "0.7.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/source-map/-/source-map-0.7.4.tgz",
      "integrity": "sha512-l3BikUxvPOcn5E74dZiq5BGsTb5yEwhaTSzccU6t4sDOH8NWJCstKO5QT2CvtFoK6F0saL7p9xHAqHOlCPJygA==",
      "dev": true,
      "license": "BSD-3-Clause",
      "engines": {
        "node": ">= 8"
      }
    },
    "node_modules/source-map-js": {
      "version": "1.2.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/source-map-js/-/source-map-js-1.2.1.tgz",
      "integrity": "sha512-UXWMKhLOwVKb728IUtQPXxfYU+usdybtUrK/8uGE8CQMvrhOpwvzDBwj0QhSL7MQc7vIsISBG8VQ8+IDQxpfQA==",
      "dev": true,
      "license": "BSD-3-Clause",
      "engines": {
        "node": ">=0.10.0"
      }
    },
    "node_modules/source-map-loader": {
      "version": "5.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/source-map-loader/-/source-map-loader-5.0.0.tgz",
      "integrity": "sha512-k2Dur7CbSLcAH73sBcIkV5xjPV4SzqO1NJ7+XaQl8if3VODDUj3FNchNGpqgJSKbvUfJuhVdv8K2Eu8/TNl2eA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "iconv-lite": "^0.6.3",
        "source-map-js": "^1.0.2"
      },
      "engines": {
        "node": ">= 18.12.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/webpack"
      },
      "peerDependencies": {
        "webpack": "^5.72.1"
      }
    },
    "node_modules/source-map-loader/node_modules/iconv-lite": {
      "version": "0.6.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/iconv-lite/-/iconv-lite-0.6.3.tgz",
      "integrity": "sha512-4fCk79wshMdzMp2rH06qWrJE4iolqLhCUH+OiuIgU++RB0+94NlDL81atO7GX55uUKueo0txHNtvEyI6D7WdMw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "safer-buffer": ">= 2.1.2 < 3.0.0"
      },
      "engines": {
        "node": ">=0.10.0"
      }
    },
    "node_modules/source-map-support": {
      "version": "0.5.21",
      "resolved": "http://binario.caixa:8081/repository/npm-all/source-map-support/-/source-map-support-0.5.21.tgz",
      "integrity": "sha512-uBHU3L3czsIyYXKX88fdrGovxdSCoTGDRZ6SYXtSRxLZUzHg5P/66Ht6uoUlHu9EZod+inXhKo3qQgwXUT/y1w==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "buffer-from": "^1.0.0",
        "source-map": "^0.6.0"
      }
    },
    "node_modules/source-map-support/node_modules/source-map": {
      "version": "0.6.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/source-map/-/source-map-0.6.1.tgz",
      "integrity": "sha512-UjgapumWlbMhkBgzT7Ykc5YXUT46F0iKu8SGXq0bcwP5dz/h0Plj6enJqjz1Zbq2l5WaqYnrVbwWOWMyF3F47g==",
      "dev": true,
      "license": "BSD-3-Clause",
      "engines": {
        "node": ">=0.10.0"
      }
    },
    "node_modules/spdx-correct": {
      "version": "3.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/spdx-correct/-/spdx-correct-3.2.0.tgz",
      "integrity": "sha512-kN9dJbvnySHULIluDHy32WHRUu3Og7B9sbY7tsFLctQkIqnMh3hErYgdMjTYuqmcXX+lK5T1lnUt3G7zNswmZA==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "spdx-expression-parse": "^3.0.0",
        "spdx-license-ids": "^3.0.0"
      }
    },
    "node_modules/spdx-exceptions": {
      "version": "2.5.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/spdx-exceptions/-/spdx-exceptions-2.5.0.tgz",
      "integrity": "sha512-PiU42r+xO4UbUS1buo3LPJkjlO7430Xn5SVAhdpzzsPHsjbYVflnnFdATgabnLude+Cqu25p6N+g2lw/PFsa4w==",
      "dev": true,
      "license": "CC-BY-3.0"
    },
    "node_modules/spdx-expression-parse": {
      "version": "3.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/spdx-expression-parse/-/spdx-expression-parse-3.0.1.tgz",
      "integrity": "sha512-cbqHunsQWnJNE6KhVSMsMeH5H/L9EpymbzqTQ3uLwNCLZ1Q481oWaofqH7nO6V07xlXwY6PhQdQ2IedWx/ZK4Q==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "spdx-exceptions": "^2.1.0",
        "spdx-license-ids": "^3.0.0"
      }
    },
    "node_modules/spdx-license-ids": {
      "version": "3.0.23",
      "resolved": "http://binario.caixa:8081/repository/npm-all/spdx-license-ids/-/spdx-license-ids-3.0.23.tgz",
      "integrity": "sha512-CWLcCCH7VLu13TgOH+r8p1O/Znwhqv/dbb6lqWy67G+pT1kHmeD/+V36AVb/vq8QMIQwVShJ6Ssl5FPh0fuSdw==",
      "dev": true,
      "license": "CC0-1.0"
    },
    "node_modules/spdy": {
      "version": "4.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/spdy/-/spdy-4.0.2.tgz",
      "integrity": "sha512-r46gZQZQV+Kl9oItvl1JZZqJKGr+oEkB08A6BzkiR7593/7IbtuncXHd2YoYeTsG4157ZssMu9KYvUHLcjcDoA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "debug": "^4.1.0",
        "handle-thing": "^2.0.0",
        "http-deceiver": "^1.2.7",
        "select-hose": "^2.0.0",
        "spdy-transport": "^3.0.0"
      },
      "engines": {
        "node": ">=6.0.0"
      }
    },
    "node_modules/spdy-transport": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/spdy-transport/-/spdy-transport-3.0.0.tgz",
      "integrity": "sha512-hsLVFE5SjA6TCisWeJXFKniGGOpBgMLmerfO2aCyCU5s7nJ/rpAepqmFifv/GCbSbueEeAJJnmSQ2rKC/g8Fcw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "debug": "^4.1.0",
        "detect-node": "^2.0.4",
        "hpack.js": "^2.1.6",
        "obuf": "^1.1.2",
        "readable-stream": "^3.0.6",
        "wbuf": "^1.7.3"
      }
    },
    "node_modules/sprintf-js": {
      "version": "1.0.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/sprintf-js/-/sprintf-js-1.0.3.tgz",
      "integrity": "sha512-D9cPgkvLlV3t3IzL0D0YLvGA9Ahk4PcvVwUbN0dSGr1aP0Nrt4AEnTUbuGvquEC0mA64Gqt1fzirlRs5ibXx8g==",
      "dev": true,
      "license": "BSD-3-Clause"
    },
    "node_modules/ssri": {
      "version": "12.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ssri/-/ssri-12.0.0.tgz",
      "integrity": "sha512-S7iGNosepx9RadX82oimUkvr0Ct7IjJbEbs4mJcTxst8um95J3sDYU1RBEOvdu6oL1Wek2ODI5i4MAw+dZ6cAQ==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "minipass": "^7.0.3"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/stack-utils": {
      "version": "2.0.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/stack-utils/-/stack-utils-2.0.6.tgz",
      "integrity": "sha512-XlkWvfIm6RmsWtNJx+uqtKLS8eqFbxUg0ZzLXqY0caEy9l7hruX8IpiDnjsLavoBgqCCR71TqWO8MaXYheJ3RQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "escape-string-regexp": "^2.0.0"
      },
      "engines": {
        "node": ">=10"
      }
    },
    "node_modules/statuses": {
      "version": "2.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/statuses/-/statuses-2.0.2.tgz",
      "integrity": "sha512-DvEy55V3DB7uknRo+4iOGT5fP1slR8wQohVdknigZPMpMstaKJQWhwiYBACJE3Ul2pTnATihhBYnRhZQHGBiRw==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.8"
      }
    },
    "node_modules/string_decoder": {
      "version": "1.3.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/string_decoder/-/string_decoder-1.3.0.tgz",
      "integrity": "sha512-hkRX8U1WjJFd8LsDJ2yQ/wWWxaopEsABU1XfkM8A+j0+85JAGppt16cr1Whg6KIbb4okU6Mql6BOj+uup/wKeA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "safe-buffer": "~5.2.0"
      }
    },
    "node_modules/string-length": {
      "version": "4.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/string-length/-/string-length-4.0.2.tgz",
      "integrity": "sha512-+l6rNN5fYHNhZZy41RXsYptCjA2Igmq4EG7kZAYFQI1E1VTXarr6ZPXBg6eq7Y6eK4FEhY6AJlyuFIb/v/S0VQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "char-regex": "^1.0.2",
        "strip-ansi": "^6.0.0"
      },
      "engines": {
        "node": ">=10"
      }
    },
    "node_modules/string-width": {
      "version": "7.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/string-width/-/string-width-7.2.0.tgz",
      "integrity": "sha512-tsaTIkKW9b4N+AEj+SVA+WhJzV7/zMhcSu78mLKWSk7cXMOSHsBKFWUs0fWwq8QyK3MgJBQRX6Gbi4kYbdvGkQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "emoji-regex": "^10.3.0",
        "get-east-asian-width": "^1.0.0",
        "strip-ansi": "^7.1.0"
      },
      "engines": {
        "node": ">=18"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/string-width-cjs": {
      "name": "string-width",
      "version": "4.2.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/string-width/-/string-width-4.2.3.tgz",
      "integrity": "sha512-wKyQRQpjJ0sIp62ErSZdGsjMJWsap5oRNihHhu6G7JVO/9jIB6UyevL+tXuOqrng8j/cxKTWyWUwvSTriiZz/g==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "emoji-regex": "^8.0.0",
        "is-fullwidth-code-point": "^3.0.0",
        "strip-ansi": "^6.0.1"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/string-width-cjs/node_modules/emoji-regex": {
      "version": "8.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/emoji-regex/-/emoji-regex-8.0.0.tgz",
      "integrity": "sha512-MSjYzcWNOA0ewAHpz0MxpYFvwg6yjy1NG3xteoqz644VCo/RPgnr1/GGt+ic3iJTzQ8Eu3TdM14SawnVUmGE6A==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/string-width-cjs/node_modules/is-fullwidth-code-point": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/is-fullwidth-code-point/-/is-fullwidth-code-point-3.0.0.tgz",
      "integrity": "sha512-zymm5+u+sCsSWyD9qNaejV3DFvhCKclKdizYaJUuHA83RLjb7nSuGnddCHGv0hk+KY7BMAlsWeK4Ueg6EV6XQg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/string-width/node_modules/ansi-regex": {
      "version": "6.2.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ansi-regex/-/ansi-regex-6.2.2.tgz",
      "integrity": "sha512-Bq3SmSpyFHaWjPk8If9yc6svM8c56dB5BAtW4Qbw5jHTwwXXcTLoRMkpDJp6VL0XzlWaCHTXrkFURMYmD0sLqg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=12"
      },
      "funding": {
        "url": "https://github.com/chalk/ansi-regex?sponsor=1"
      }
    },
    "node_modules/string-width/node_modules/strip-ansi": {
      "version": "7.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/strip-ansi/-/strip-ansi-7.2.0.tgz",
      "integrity": "sha512-yDPMNjp4WyfYBkHnjIRLfca1i6KMyGCtsVgoKe/z1+6vukgaENdgGBZt+ZmKPc4gavvEZ5OgHfHdrazhgNyG7w==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "ansi-regex": "^6.2.2"
      },
      "engines": {
        "node": ">=12"
      },
      "funding": {
        "url": "https://github.com/chalk/strip-ansi?sponsor=1"
      }
    },
    "node_modules/strip-ansi": {
      "version": "6.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/strip-ansi/-/strip-ansi-6.0.1.tgz",
      "integrity": "sha512-Y38VPSHcqkFrCpFnQ9vuSXmquuv5oXOKpGeT6aGrr3o3Gc9AlVa6JBfUSOCnbxGGZF+/0ooI7KrPuUSztUdU5A==",
      "license": "MIT",
      "dependencies": {
        "ansi-regex": "^5.0.1"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/strip-ansi-cjs": {
      "name": "strip-ansi",
      "version": "6.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/strip-ansi/-/strip-ansi-6.0.1.tgz",
      "integrity": "sha512-Y38VPSHcqkFrCpFnQ9vuSXmquuv5oXOKpGeT6aGrr3o3Gc9AlVa6JBfUSOCnbxGGZF+/0ooI7KrPuUSztUdU5A==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "ansi-regex": "^5.0.1"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/strip-bom": {
      "version": "4.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/strip-bom/-/strip-bom-4.0.0.tgz",
      "integrity": "sha512-3xurFv5tEgii33Zi8Jtp55wEIILR9eh34FAW00PZf+JnSsTmV/ioewSgQl97JHvgjoRGwPShsWm+IdrxB35d0w==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/strip-final-newline": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/strip-final-newline/-/strip-final-newline-2.0.0.tgz",
      "integrity": "sha512-BrpvfNAE3dcvq7ll3xVumzjKjZQ5tI1sEUIKr3Uoks0XUl45St3FlatVqef9prk4jRDzhW6WZg+3bk93y6pLjA==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=6"
      }
    },
    "node_modules/strip-json-comments": {
      "version": "3.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/strip-json-comments/-/strip-json-comments-3.1.1.tgz",
      "integrity": "sha512-6fPc+R4ihwqP6N/aIv2f1gMH8lOVtWQHoqC4yK6oSDVVocumAsfCqjkXnqiYMhmMwS/mEHLp7Vehlt3ql6lEig==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/stylis": {
      "version": "4.3.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/stylis/-/stylis-4.3.6.tgz",
      "integrity": "sha512-yQ3rwFWRfwNUY7H5vpU0wfdkNSnvnJinhF9830Swlaxl03zsOjCfmX0ugac+3LtK0lYSgwL/KXc8oYL3mG4YFQ==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/supports-color": {
      "version": "7.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/supports-color/-/supports-color-7.2.0.tgz",
      "integrity": "sha512-qpCAvRl9stuOHveKsn7HncJRvv501qIacKzQlO/+Lwxc9+0q2wLyv4Dfvt80/DPn2pqOBsJdDiogXGR9+OvwRw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "has-flag": "^4.0.0"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/supports-preserve-symlinks-flag": {
      "version": "1.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/supports-preserve-symlinks-flag/-/supports-preserve-symlinks-flag-1.0.0.tgz",
      "integrity": "sha512-ot0WnXS9fgdkgIcePe6RHNk1WA8+muPa6cSjeR3V8K27q9BB1rTE3R1p7Hv0z1ZyAc8s6Vvv8DIyWf681MAt0w==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.4"
      },
      "funding": {
        "url": "https://github.com/sponsors/ljharb"
      }
    },
    "node_modules/symbol-observable": {
      "version": "4.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/symbol-observable/-/symbol-observable-4.0.0.tgz",
      "integrity": "sha512-b19dMThMV4HVFynSAM1++gBHAbk2Tc/osgLIBZMKsyqh34jb2e8Os7T6ZW/Bt3pJFdBTd2JwAnAAEQV7rSNvcQ==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=0.10"
      }
    },
    "node_modules/symbol-tree": {
      "version": "3.2.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/symbol-tree/-/symbol-tree-3.2.4.tgz",
      "integrity": "sha512-9QNk5KwDF+Bvz+PyObkmSYjI5ksVUYtjW7AU22r2NKcfLJcXp96hkDWU3+XndOsUb+AQ9QhfzfCT2O+CNWT5Tw==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/tapable": {
      "version": "2.3.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/tapable/-/tapable-2.3.2.tgz",
      "integrity": "sha512-1MOpMXuhGzGL5TTCZFItxCc0AARf1EZFQkGqMm7ERKj8+Hgr5oLvJOVFcC+lRmR8hCe2S3jC4T5D7Vg/d7/fhA==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=6"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/webpack"
      }
    },
    "node_modules/tar": {
      "version": "6.2.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/tar/-/tar-6.2.1.tgz",
      "integrity": "sha512-DZ4yORTwrbTj/7MZYq2w+/ZFdI6OZ/f9SFHR+71gIVUZhOQPHzVCLpvRnPgyaMpfWxxk/4ONva3GQSyNIKRv6A==",
      "deprecated": "Old versions of tar are not supported, and contain widely publicized security vulnerabilities, which have been fixed in the current version. Please update. Support for old versions may be purchased (at exorbitant rates) by contacting i@izs.me",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "chownr": "^2.0.0",
        "fs-minipass": "^2.0.0",
        "minipass": "^5.0.0",
        "minizlib": "^2.1.1",
        "mkdirp": "^1.0.3",
        "yallist": "^4.0.0"
      },
      "engines": {
        "node": ">=10"
      }
    },
    "node_modules/tar/node_modules/fs-minipass": {
      "version": "2.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/fs-minipass/-/fs-minipass-2.1.0.tgz",
      "integrity": "sha512-V/JgOLFCS+R6Vcq0slCuaeWEdNC3ouDlJMNIsacH2VtALiu9mV4LPrHc5cDl8k5aw6J8jwgWWpiTo5RYhmIzvg==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "minipass": "^3.0.0"
      },
      "engines": {
        "node": ">= 8"
      }
    },
    "node_modules/tar/node_modules/fs-minipass/node_modules/minipass": {
      "version": "3.3.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/minipass/-/minipass-3.3.6.tgz",
      "integrity": "sha512-DxiNidxSEK+tHG6zOIklvNOwm3hvCrbUrdtzY74U6HKTJxvIDfOUL5W5P2Ghd3DTkhhKPYGqeNUIh5qcM4YBfw==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "yallist": "^4.0.0"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/tar/node_modules/minipass": {
      "version": "5.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/minipass/-/minipass-5.0.0.tgz",
      "integrity": "sha512-3FnjYuehv9k6ovOEbyOswadCDPX1piCfhV8ncmYtHOjuPwylVWsghTLo7rabjC3Rx5xD4HDx8Wm1xnMF7S5qFQ==",
      "dev": true,
      "license": "ISC",
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/tar/node_modules/minizlib": {
      "version": "2.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/minizlib/-/minizlib-2.1.2.tgz",
      "integrity": "sha512-bAxsR8BVfj60DWXHE3u30oHzfl4G7khkSuPW+qvpd7jFRHm7dLxOjUk1EHACJ/hxLY8phGJ0YhYHZo7jil7Qdg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "minipass": "^3.0.0",
        "yallist": "^4.0.0"
      },
      "engines": {
        "node": ">= 8"
      }
    },
    "node_modules/tar/node_modules/minizlib/node_modules/minipass": {
      "version": "3.3.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/minipass/-/minipass-3.3.6.tgz",
      "integrity": "sha512-DxiNidxSEK+tHG6zOIklvNOwm3hvCrbUrdtzY74U6HKTJxvIDfOUL5W5P2Ghd3DTkhhKPYGqeNUIh5qcM4YBfw==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "yallist": "^4.0.0"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/tar/node_modules/yallist": {
      "version": "4.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/yallist/-/yallist-4.0.0.tgz",
      "integrity": "sha512-3wdGidZyq5PB084XLES5TpOSRA3wjXAlIWMhum2kRcv/41Sn2emQ0dycQW4uZXLejwKvg6EsvbdlVL+FYEct7A==",
      "dev": true,
      "license": "ISC"
    },
    "node_modules/terser": {
      "version": "5.39.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/terser/-/terser-5.39.0.tgz",
      "integrity": "sha512-LBAhFyLho16harJoWMg/nZsQYgTrg5jXOn2nCYjRUcZZEdE3qa2zb8QEDRUGVZBW4rlazf2fxkg8tztybTaqWw==",
      "dev": true,
      "license": "BSD-2-Clause",
      "dependencies": {
        "@jridgewell/source-map": "^0.3.3",
        "acorn": "^8.8.2",
        "commander": "^2.20.0",
        "source-map-support": "~0.5.20"
      },
      "bin": {
        "terser": "bin/terser"
      },
      "engines": {
        "node": ">=10"
      }
    },
    "node_modules/terser-webpack-plugin": {
      "version": "5.4.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/terser-webpack-plugin/-/terser-webpack-plugin-5.4.0.tgz",
      "integrity": "sha512-Bn5vxm48flOIfkdl5CaD2+1CiUVbonWQ3KQPyP7/EuIl9Gbzq/gQFOzaMFUEgVjB1396tcK0SG8XcNJ/2kDH8g==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@jridgewell/trace-mapping": "^0.3.25",
        "jest-worker": "^27.4.5",
        "schema-utils": "^4.3.0",
        "terser": "^5.31.1"
      },
      "engines": {
        "node": ">= 10.13.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/webpack"
      },
      "peerDependencies": {
        "webpack": "^5.1.0"
      },
      "peerDependenciesMeta": {
        "@swc/core": {
          "optional": true
        },
        "esbuild": {
          "optional": true
        },
        "uglify-js": {
          "optional": true
        }
      }
    },
    "node_modules/terser-webpack-plugin/node_modules/jest-worker": {
      "version": "27.5.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/jest-worker/-/jest-worker-27.5.1.tgz",
      "integrity": "sha512-7vuh85V5cdDofPyxn58nrPjBktZo0u9x1g8WtjQol+jZDaE+fhN+cIvTj11GndBnMnyfrUOG1sZQxCdjKh+DKg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/node": "*",
        "merge-stream": "^2.0.0",
        "supports-color": "^8.0.0"
      },
      "engines": {
        "node": ">= 10.13.0"
      }
    },
    "node_modules/terser-webpack-plugin/node_modules/supports-color": {
      "version": "8.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/supports-color/-/supports-color-8.1.1.tgz",
      "integrity": "sha512-MpUEN2OodtUzxvKQl72cUF7RQ5EiHsGvSsVG0ia9c5RbWGL2CI4C7EpPS8UTBIplnlzZiNuV56w+FuNxy3ty2Q==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "has-flag": "^4.0.0"
      },
      "engines": {
        "node": ">=10"
      },
      "funding": {
        "url": "https://github.com/chalk/supports-color?sponsor=1"
      }
    },
    "node_modules/terser/node_modules/commander": {
      "version": "2.20.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/commander/-/commander-2.20.3.tgz",
      "integrity": "sha512-GpVkmM8vF2vQUkj2LvZmD35JxeJOLCwJ9cUkugyk2nuhbv3+mJvpLYYt+0+USMxE+oj+ey/lJEnhZw75x/OMcQ==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/test-exclude": {
      "version": "6.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/test-exclude/-/test-exclude-6.0.0.tgz",
      "integrity": "sha512-cAGWPIyOHU6zlmg88jwm7VRyXnMN7iV68OGAbYDk/Mh/xC/pzVPlQtY6ngoIH/5/tciuhGfvESU8GrHrcxD56w==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "@istanbuljs/schema": "^0.1.2",
        "glob": "^7.1.4",
        "minimatch": "^3.0.4"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/thingies": {
      "version": "2.6.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/thingies/-/thingies-2.6.0.tgz",
      "integrity": "sha512-rMHRjmlFLM1R96UYPvpmnc3LYtdFrT33JIB7L9hetGue1qAPfn1N2LJeEjxUSidu1Iku+haLZXDuEXUHNGO/lg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=10.18"
      },
      "funding": {
        "type": "github",
        "url": "https://github.com/sponsors/streamich"
      },
      "peerDependencies": {
        "tslib": "^2"
      }
    },
    "node_modules/thunky": {
      "version": "1.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/thunky/-/thunky-1.1.0.tgz",
      "integrity": "sha512-eHY7nBftgThBqOyHGVN+l8gF0BucP09fMo0oO/Lb0w1OF80dJv+lDVpXG60WMQvkcxAkNybKsrEIE3ZtKGmPrA==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/tiny-emitter": {
      "version": "2.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/tiny-emitter/-/tiny-emitter-2.1.0.tgz",
      "integrity": "sha512-NB6Dk1A9xgQPMoGqC5CVXn123gWyte215ONT5Pp5a0yt4nlEoO1ZWeCwpncaekPHXO60i47ihFnZPiRPjRMq4Q==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/tinyexec": {
      "version": "1.0.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/tinyexec/-/tinyexec-1.0.4.tgz",
      "integrity": "sha512-u9r3uZC0bdpGOXtlxUIdwf9pkmvhqJdrVCH9fapQtgy/OeTTMZ1nqH7agtvEfmGui6e1XxjcdrlxvxJvc3sMqw==",
      "license": "MIT",
      "optional": true,
      "engines": {
        "node": ">=18"
      }
    },
    "node_modules/tinyglobby": {
      "version": "0.2.15",
      "resolved": "http://binario.caixa:8081/repository/npm-all/tinyglobby/-/tinyglobby-0.2.15.tgz",
      "integrity": "sha512-j2Zq4NyQYG5XMST4cbs02Ak8iJUdxRM0XI5QyxXuZOzKOINmWurp3smXu3y5wDcJrptwpSjgXHzIQxR0omXljQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "fdir": "^6.5.0",
        "picomatch": "^4.0.3"
      },
      "engines": {
        "node": ">=12.0.0"
      },
      "funding": {
        "url": "https://github.com/sponsors/SuperchupuDev"
      }
    },
    "node_modules/tmpl": {
      "version": "1.0.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/tmpl/-/tmpl-1.0.5.tgz",
      "integrity": "sha512-3f0uOEAQwIqGuWW2MVzYg8fV/QNnc/IpuJNG837rLuczAaLVHslWHZQj4IGiEl5Hs3kkbhwL9Ab7Hrsmuj+Smw==",
      "dev": true,
      "license": "BSD-3-Clause"
    },
    "node_modules/to-regex-range": {
      "version": "5.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/to-regex-range/-/to-regex-range-5.0.1.tgz",
      "integrity": "sha512-65P7iz6X5yEr1cwcgvQxbbIw7Uk3gOy5dIdtZ4rDveLqhrdJP+Li/Hx6tyK0NEb+2GCyneCMJiGqrADCSNk8sQ==",
      "license": "MIT",
      "dependencies": {
        "is-number": "^7.0.0"
      },
      "engines": {
        "node": ">=8.0"
      }
    },
    "node_modules/toidentifier": {
      "version": "1.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/toidentifier/-/toidentifier-1.0.1.tgz",
      "integrity": "sha512-o5sSPKEkg/DIQNmH43V0/uerLrpzVedkUh8tGNvaeXpfpuwjKenlSox/2O/BTlZUtEe+JG7s5YhEz608PlAHRA==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=0.6"
      }
    },
    "node_modules/tough-cookie": {
      "version": "4.1.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/tough-cookie/-/tough-cookie-4.1.4.tgz",
      "integrity": "sha512-Loo5UUvLD9ScZ6jh8beX1T6sO1w2/MpCRpEP7V280GKMVUQ0Jzar2U3UJPsrdbziLEMMhu3Ujnq//rhiFuIeag==",
      "dev": true,
      "license": "BSD-3-Clause",
      "dependencies": {
        "psl": "^1.1.33",
        "punycode": "^2.1.1",
        "universalify": "^0.2.0",
        "url-parse": "^1.5.3"
      },
      "engines": {
        "node": ">=6"
      }
    },
    "node_modules/tr46": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/tr46/-/tr46-3.0.0.tgz",
      "integrity": "sha512-l7FvfAHlcmulp8kr+flpQZmVwtu7nfRV7NZujtN0OqES8EL4O4e0qqzL0DC5gAvx/ZC/9lk6rhcUwYvkBnBnYA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "punycode": "^2.1.1"
      },
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/tree-dump": {
      "version": "1.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/tree-dump/-/tree-dump-1.1.0.tgz",
      "integrity": "sha512-rMuvhU4MCDbcbnleZTFezWsaZXRFemSqAM+7jPnzUl1fo9w3YEKOxAeui0fz3OI4EU4hf23iyA7uQRVko+UaBA==",
      "dev": true,
      "license": "Apache-2.0",
      "engines": {
        "node": ">=10.0"
      },
      "funding": {
        "type": "github",
        "url": "https://github.com/sponsors/streamich"
      },
      "peerDependencies": {
        "tslib": "2"
      }
    },
    "node_modules/tree-kill": {
      "version": "1.2.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/tree-kill/-/tree-kill-1.2.2.tgz",
      "integrity": "sha512-L0Orpi8qGpRG//Nd+H90vFB+3iHnue1zSSGmNOOCh1GLJ7rUKVwV2HvijphGQS2UmhUZewS9VgvxYIdgr+fG1A==",
      "dev": true,
      "license": "MIT",
      "bin": {
        "tree-kill": "cli.js"
      }
    },
    "node_modules/ts-dedent": {
      "version": "2.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ts-dedent/-/ts-dedent-2.2.0.tgz",
      "integrity": "sha512-q5W7tVM71e2xjHZTlgfTDoPF/SmqKG5hddq9SzR49CH2hayqRKJtQ4mtRlSxKaJlR/+9rEM+mnBHf7I2/BQcpQ==",
      "license": "MIT",
      "optional": true,
      "engines": {
        "node": ">=6.10"
      }
    },
    "node_modules/ts-jest": {
      "version": "29.4.6",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ts-jest/-/ts-jest-29.4.6.tgz",
      "integrity": "sha512-fSpWtOO/1AjSNQguk43hb/JCo16oJDnMJf3CdEGNkqsEX3t0KX96xvyX1D7PfLCpVoKu4MfVrqUkFyblYoY4lA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "bs-logger": "^0.2.6",
        "fast-json-stable-stringify": "^2.1.0",
        "handlebars": "^4.7.8",
        "json5": "^2.2.3",
        "lodash.memoize": "^4.1.2",
        "make-error": "^1.3.6",
        "semver": "^7.7.3",
        "type-fest": "^4.41.0",
        "yargs-parser": "^21.1.1"
      },
      "bin": {
        "ts-jest": "cli.js"
      },
      "engines": {
        "node": "^14.15.0 || ^16.10.0 || ^18.0.0 || >=20.0.0"
      },
      "peerDependencies": {
        "@babel/core": ">=7.0.0-beta.0 <8",
        "@jest/transform": "^29.0.0 || ^30.0.0",
        "@jest/types": "^29.0.0 || ^30.0.0",
        "babel-jest": "^29.0.0 || ^30.0.0",
        "jest": "^29.0.0 || ^30.0.0",
        "jest-util": "^29.0.0 || ^30.0.0",
        "typescript": ">=4.3 <6"
      },
      "peerDependenciesMeta": {
        "@babel/core": {
          "optional": true
        },
        "@jest/transform": {
          "optional": true
        },
        "@jest/types": {
          "optional": true
        },
        "babel-jest": {
          "optional": true
        },
        "esbuild": {
          "optional": true
        },
        "jest-util": {
          "optional": true
        }
      }
    },
    "node_modules/ts-jest/node_modules/semver": {
      "version": "7.7.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/semver/-/semver-7.7.4.tgz",
      "integrity": "sha512-vFKC2IEtQnVhpT78h1Yp8wzwrf8CM+MzKMHGJZfBtzhZNycRFnXsHk6E5TxIkkMsgNS7mdX3AGB7x2QM2di4lA==",
      "dev": true,
      "license": "ISC",
      "bin": {
        "semver": "bin/semver.js"
      },
      "engines": {
        "node": ">=10"
      }
    },
    "node_modules/ts-jest/node_modules/type-fest": {
      "version": "4.41.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/type-fest/-/type-fest-4.41.0.tgz",
      "integrity": "sha512-TeTSQ6H5YHvpqVwBRcnLDCBnDOHWYu7IvGbHT6N8AOymcr9PJGjc1GTtiWZTYg0NCgYwvnYWEkVChQAr9bjfwA==",
      "dev": true,
      "license": "(MIT OR CC0-1.0)",
      "engines": {
        "node": ">=16"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/tslib": {
      "version": "2.8.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/tslib/-/tslib-2.8.1.tgz",
      "integrity": "sha512-oJFu94HQb+KVduSUQL7wnpmqnfmLsOA/nAh6b6EH0wCEoK0/mPeXU6c3wKDV83MkOuHPRHtSXKKU99IBazS/2w==",
      "license": "0BSD"
    },
    "node_modules/tuf-js": {
      "version": "3.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/tuf-js/-/tuf-js-3.1.0.tgz",
      "integrity": "sha512-3T3T04WzowbwV2FDiGXBbr81t64g1MUGGJRgT4x5o97N+8ArdhVCAF9IxFrxuSJmM3E5Asn7nKHkao0ibcZXAg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@tufjs/models": "3.0.1",
        "debug": "^4.4.1",
        "make-fetch-happen": "^14.0.3"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/type-detect": {
      "version": "4.0.8",
      "resolved": "http://binario.caixa:8081/repository/npm-all/type-detect/-/type-detect-4.0.8.tgz",
      "integrity": "sha512-0fr/mIH1dlO+x7TlcMy+bIDqKPsw/70tVyeHW787goQjhmqaZe10uwLujubK9q9Lg6Fiho1KUKDYz0Z7k7g5/g==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=4"
      }
    },
    "node_modules/type-fest": {
      "version": "0.21.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/type-fest/-/type-fest-0.21.3.tgz",
      "integrity": "sha512-t0rzBq87m3fVcduHDUFhKmyyX+9eo6WQjZvf51Ea/M0Q7+T374Jp1aUiyUl0GKxp8M/OETVHSDvmkyPgvX+X2w==",
      "dev": true,
      "license": "(MIT OR CC0-1.0)",
      "engines": {
        "node": ">=10"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/type-is": {
      "version": "1.6.18",
      "resolved": "http://binario.caixa:8081/repository/npm-all/type-is/-/type-is-1.6.18.tgz",
      "integrity": "sha512-TkRKr9sUTxEH8MdfuCSP7VizJyzRNMjj2J2do2Jr3Kym598JVdEksuzPQCnlFPW4ky9Q+iA+ma9BGm06XQBy8g==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "media-typer": "0.3.0",
        "mime-types": "~2.1.24"
      },
      "engines": {
        "node": ">= 0.6"
      }
    },
    "node_modules/typed-assert": {
      "version": "1.0.9",
      "resolved": "http://binario.caixa:8081/repository/npm-all/typed-assert/-/typed-assert-1.0.9.tgz",
      "integrity": "sha512-KNNZtayBCtmnNmbo5mG47p1XsCyrx6iVqomjcZnec/1Y5GGARaxPs6r49RnSPeUP3YjNYiU9sQHAtY4BBvnZwg==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/typescript": {
      "version": "5.8.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/typescript/-/typescript-5.8.3.tgz",
      "integrity": "sha512-p1diW6TqL9L07nNxvRMM7hMMw4c5XOo/1ibL4aAIGmSAt9slTE1Xgw5KWuof2uTOvCg9BY7ZRi+GaF+7sfgPeQ==",
      "license": "Apache-2.0",
      "bin": {
        "tsc": "bin/tsc",
        "tsserver": "bin/tsserver"
      },
      "engines": {
        "node": ">=14.17"
      }
    },
    "node_modules/ufo": {
      "version": "1.6.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ufo/-/ufo-1.6.3.tgz",
      "integrity": "sha512-yDJTmhydvl5lJzBmy/hyOAA0d+aqCBuwl818haVdYCRrWV84o7YyeVm4QlVHStqNrrJSTb6jKuFAVqAFsr+K3Q==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/uglify-js": {
      "version": "3.19.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/uglify-js/-/uglify-js-3.19.3.tgz",
      "integrity": "sha512-v3Xu+yuwBXisp6QYTcH4UbH+xYJXqnq2m/LtQVWKWzYc1iehYnLixoQDN9FH6/j9/oybfd6W9Ghwkl8+UMKTKQ==",
      "dev": true,
      "license": "BSD-2-Clause",
      "optional": true,
      "bin": {
        "uglifyjs": "bin/uglifyjs"
      },
      "engines": {
        "node": ">=0.8.0"
      }
    },
    "node_modules/undici-types": {
      "version": "5.26.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/undici-types/-/undici-types-5.26.5.tgz",
      "integrity": "sha512-JlCMO+ehdEIKqlFxk6IfVoAUVmgz7cU7zD/h9XZ0qzeosSHmUJVOzSQvvYSYWXkFXC+IfLKSIffhv0sVZup6pA==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/unicode-canonical-property-names-ecmascript": {
      "version": "2.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/unicode-canonical-property-names-ecmascript/-/unicode-canonical-property-names-ecmascript-2.0.1.tgz",
      "integrity": "sha512-dA8WbNeb2a6oQzAQ55YlT5vQAWGV9WXOsi3SskE3bcCdM0P4SDd+24zS/OCacdRq5BkdsRj9q3Pg6YyQoxIGqg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=4"
      }
    },
    "node_modules/unicode-match-property-ecmascript": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/unicode-match-property-ecmascript/-/unicode-match-property-ecmascript-2.0.0.tgz",
      "integrity": "sha512-5kaZCrbp5mmbz5ulBkDkbY0SsPOjKqVS35VpL9ulMPfSl0J0Xsm+9Evphv9CoIZFwre7aJoa94AY6seMKGVN5Q==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "unicode-canonical-property-names-ecmascript": "^2.0.0",
        "unicode-property-aliases-ecmascript": "^2.0.0"
      },
      "engines": {
        "node": ">=4"
      }
    },
    "node_modules/unicode-match-property-value-ecmascript": {
      "version": "2.2.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/unicode-match-property-value-ecmascript/-/unicode-match-property-value-ecmascript-2.2.1.tgz",
      "integrity": "sha512-JQ84qTuMg4nVkx8ga4A16a1epI9H6uTXAknqxkGF/aFfRLw1xC/Bp24HNLaZhHSkWd3+84t8iXnp1J0kYcZHhg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=4"
      }
    },
    "node_modules/unicode-property-aliases-ecmascript": {
      "version": "2.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/unicode-property-aliases-ecmascript/-/unicode-property-aliases-ecmascript-2.2.0.tgz",
      "integrity": "sha512-hpbDzxUY9BFwX+UeBnxv3Sh1q7HFxj48DTmXchNgRa46lO8uj3/1iEn3MiNUYTg1g9ctIqXCCERn8gYZhHC5lQ==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=4"
      }
    },
    "node_modules/unicorn-magic": {
      "version": "0.3.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/unicorn-magic/-/unicorn-magic-0.3.0.tgz",
      "integrity": "sha512-+QBBXBCvifc56fsbuxZQ6Sic3wqqc3WWaqxs58gvJrcOuN83HGTCwz3oS5phzU9LthRNE9VrJCFCLUgHeeFnfA==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=18"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/unique-filename": {
      "version": "4.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/unique-filename/-/unique-filename-4.0.0.tgz",
      "integrity": "sha512-XSnEewXmQ+veP7xX2dS5Q4yZAvO40cBN2MWkJ7D/6sW4Dg6wYBNwM1Vrnz1FhH5AdeLIlUXRI9e28z1YZi71NQ==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "unique-slug": "^5.0.0"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/unique-slug": {
      "version": "5.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/unique-slug/-/unique-slug-5.0.0.tgz",
      "integrity": "sha512-9OdaqO5kwqR+1kVgHAhsp5vPNU0hnxRa26rBFNfNgM7M6pNtgzeBn3s/xbyCQL3dcjzOatcef6UUHpB/6MaETg==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "imurmurhash": "^0.1.4"
      },
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/universalify": {
      "version": "0.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/universalify/-/universalify-0.2.0.tgz",
      "integrity": "sha512-CJ1QgKmNg3CwvAv/kOFmtnEN05f0D/cn9QntgNOQlQF9dgvVTHj3t+8JPdjqawCHk7V/KA+fbUqzZ9XWhcqPUg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 4.0.0"
      }
    },
    "node_modules/unpipe": {
      "version": "1.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/unpipe/-/unpipe-1.0.0.tgz",
      "integrity": "sha512-pjy2bYhSsufwWlKwPc+l3cN7+wuJlK6uz0YdJEOlQDbl6jo/YlPi4mb8agUkVC8BF7V8NuzeyPNqRksA3hztKQ==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.8"
      }
    },
    "node_modules/update-browserslist-db": {
      "version": "1.2.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/update-browserslist-db/-/update-browserslist-db-1.2.3.tgz",
      "integrity": "sha512-Js0m9cx+qOgDxo0eMiFGEueWztz+d4+M3rGlmKPT+T4IS/jP4ylw3Nwpu6cpTTP8R1MAC1kF4VbdLt3ARf209w==",
      "funding": [
        {
          "type": "opencollective",
          "url": "https://opencollective.com/browserslist"
        },
        {
          "type": "tidelift",
          "url": "https://tidelift.com/funding/github/npm/browserslist"
        },
        {
          "type": "github",
          "url": "https://github.com/sponsors/ai"
        }
      ],
      "license": "MIT",
      "dependencies": {
        "escalade": "^3.2.0",
        "picocolors": "^1.1.1"
      },
      "bin": {
        "update-browserslist-db": "cli.js"
      },
      "peerDependencies": {
        "browserslist": ">= 4.21.0"
      }
    },
    "node_modules/url-parse": {
      "version": "1.5.10",
      "resolved": "http://binario.caixa:8081/repository/npm-all/url-parse/-/url-parse-1.5.10.tgz",
      "integrity": "sha512-WypcfiRhfeUP9vvF0j6rw0J3hrWrw6iZv3+22h6iRMJ/8z1Tj6XfLP4DsUix5MhMPnXpiHDoKyoZ/bdCkwBCiQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "querystringify": "^2.1.1",
        "requires-port": "^1.0.0"
      }
    },
    "node_modules/util-deprecate": {
      "version": "1.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/util-deprecate/-/util-deprecate-1.0.2.tgz",
      "integrity": "sha512-EPD5q1uXyFxJpCrLnCc1nHnq3gOa6DZBocAIiI2TaSCA7VCJ1UJDMagCzIkXNsUYfD1daK//LTEQ8xiIbrHtcw==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/utils-merge": {
      "version": "1.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/utils-merge/-/utils-merge-1.0.1.tgz",
      "integrity": "sha512-pMZTvIkT1d+TFGvDOqodOclx0QWkkgi6Tdoa8gC8ffGAAqz9pzPTZWAybbsHHoED/ztMtkv/VoYTYyShUn81hA==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.4.0"
      }
    },
    "node_modules/uuid": {
      "version": "11.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/uuid/-/uuid-11.1.0.tgz",
      "integrity": "sha512-0/A9rDy9P7cJ+8w1c9WD9V//9Wj15Ce2MPz8Ri6032usz+NfePxx5AcN3bN+r6ZL6jEo066/yNYB3tn4pQEx+A==",
      "funding": [
        "https://github.com/sponsors/broofa",
        "https://github.com/sponsors/ctavan"
      ],
      "license": "MIT",
      "optional": true,
      "bin": {
        "uuid": "dist/esm/bin/uuid"
      }
    },
    "node_modules/v8-to-istanbul": {
      "version": "9.3.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/v8-to-istanbul/-/v8-to-istanbul-9.3.0.tgz",
      "integrity": "sha512-kiGUalWN+rgBJ/1OHZsBtU4rXZOfj/7rKQxULKlIzwzQSvMJUUNgPwJEEh7gU6xEVxC0ahoOBvN2YI8GH6FNgA==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "@jridgewell/trace-mapping": "^0.3.12",
        "@types/istanbul-lib-coverage": "^2.0.1",
        "convert-source-map": "^2.0.0"
      },
      "engines": {
        "node": ">=10.12.0"
      }
    },
    "node_modules/v8-to-istanbul/node_modules/convert-source-map": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/convert-source-map/-/convert-source-map-2.0.0.tgz",
      "integrity": "sha512-Kvp459HrV2FEJ1CAsi1Ku+MY3kasH19TFykTz2xWmMeq6bk2NU3XXvfJ+Q61m0xktWwt+1HSYf3JZsTms3aRJg==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/validate-npm-package-license": {
      "version": "3.0.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/validate-npm-package-license/-/validate-npm-package-license-3.0.4.tgz",
      "integrity": "sha512-DpKm2Ui/xN7/HQKCtpZxoRWBhZ9Z0kqtygG8XCgNQ8ZlDnxuQmWhj566j8fN4Cu3/JmbhsDo7fcAJq4s9h27Ew==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "spdx-correct": "^3.0.0",
        "spdx-expression-parse": "^3.0.0"
      }
    },
    "node_modules/validate-npm-package-name": {
      "version": "6.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/validate-npm-package-name/-/validate-npm-package-name-6.0.2.tgz",
      "integrity": "sha512-IUoow1YUtvoBBC06dXs8bR8B9vuA3aJfmQNKMoaPG/OFsPmoQvw8xh+6Ye25Gx9DQhoEom3Pcu9MKHerm/NpUQ==",
      "dev": true,
      "license": "ISC",
      "engines": {
        "node": "^18.17.0 || >=20.5.0"
      }
    },
    "node_modules/vary": {
      "version": "1.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/vary/-/vary-1.1.2.tgz",
      "integrity": "sha512-BNGbWLfd0eUPabhkXUVm0j8uuvREyTh5ovRa/dyow/BqAbZJyC+5fU+IzQOzmAKzYqYRAISoRhdQr3eIZ/PXqg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">= 0.8"
      }
    },
    "node_modules/vite": {
      "version": "6.4.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/vite/-/vite-6.4.1.tgz",
      "integrity": "sha512-+Oxm7q9hDoLMyJOYfUYBuHQo+dkAloi33apOPP56pzj+vsdJDzr+j1NISE5pyaAuKL4A3UD34qd0lx5+kfKp2g==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "esbuild": "^0.25.0",
        "fdir": "^6.4.4",
        "picomatch": "^4.0.2",
        "postcss": "^8.5.3",
        "rollup": "^4.34.9",
        "tinyglobby": "^0.2.13"
      },
      "bin": {
        "vite": "bin/vite.js"
      },
      "engines": {
        "node": "^18.0.0 || ^20.0.0 || >=22.0.0"
      },
      "funding": {
        "url": "https://github.com/vitejs/vite?sponsor=1"
      },
      "optionalDependencies": {
        "fsevents": "~2.3.3"
      },
      "peerDependencies": {
        "@types/node": "^18.0.0 || ^20.0.0 || >=22.0.0",
        "jiti": ">=1.21.0",
        "less": "*",
        "lightningcss": "^1.21.0",
        "sass": "*",
        "sass-embedded": "*",
        "stylus": "*",
        "sugarss": "*",
        "terser": "^5.16.0",
        "tsx": "^4.8.1",
        "yaml": "^2.4.2"
      },
      "peerDependenciesMeta": {
        "@types/node": {
          "optional": true
        },
        "jiti": {
          "optional": true
        },
        "less": {
          "optional": true
        },
        "lightningcss": {
          "optional": true
        },
        "sass": {
          "optional": true
        },
        "sass-embedded": {
          "optional": true
        },
        "stylus": {
          "optional": true
        },
        "sugarss": {
          "optional": true
        },
        "terser": {
          "optional": true
        },
        "tsx": {
          "optional": true
        },
        "yaml": {
          "optional": true
        }
      }
    },
    "node_modules/vite/node_modules/postcss": {
      "version": "8.5.8",
      "resolved": "http://binario.caixa:8081/repository/npm-all/postcss/-/postcss-8.5.8.tgz",
      "integrity": "sha512-OW/rX8O/jXnm82Ey1k44pObPtdblfiuWnrd8X7GJ7emImCOstunGbXUpp7HdBrFQX6rJzn3sPT397Wp5aCwCHg==",
      "dev": true,
      "funding": [
        {
          "type": "opencollective",
          "url": "https://opencollective.com/postcss/"
        },
        {
          "type": "tidelift",
          "url": "https://tidelift.com/funding/github/npm/postcss"
        },
        {
          "type": "github",
          "url": "https://github.com/sponsors/ai"
        }
      ],
      "license": "MIT",
      "dependencies": {
        "nanoid": "^3.3.11",
        "picocolors": "^1.1.1",
        "source-map-js": "^1.2.1"
      },
      "engines": {
        "node": "^10 || ^12 || >=14"
      }
    },
    "node_modules/vscode-jsonrpc": {
      "version": "8.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/vscode-jsonrpc/-/vscode-jsonrpc-8.2.0.tgz",
      "integrity": "sha512-C+r0eKJUIfiDIfwJhria30+TYWPtuHJXHtI7J0YlOmKAo7ogxP20T0zxB7HZQIFhIyvoBPwWskjxrvAtfjyZfA==",
      "license": "MIT",
      "optional": true,
      "engines": {
        "node": ">=14.0.0"
      }
    },
    "node_modules/vscode-languageserver": {
      "version": "9.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/vscode-languageserver/-/vscode-languageserver-9.0.1.tgz",
      "integrity": "sha512-woByF3PDpkHFUreUa7Hos7+pUWdeWMXRd26+ZX2A8cFx6v/JPTtd4/uN0/jB6XQHYaOlHbio03NTHCqrgG5n7g==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "vscode-languageserver-protocol": "3.17.5"
      },
      "bin": {
        "installServerIntoExtension": "bin/installServerIntoExtension"
      }
    },
    "node_modules/vscode-languageserver-protocol": {
      "version": "3.17.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/vscode-languageserver-protocol/-/vscode-languageserver-protocol-3.17.5.tgz",
      "integrity": "sha512-mb1bvRJN8SVznADSGWM9u/b07H7Ecg0I3OgXDuLdn307rl/J3A9YD6/eYOssqhecL27hK1IPZAsaqh00i/Jljg==",
      "license": "MIT",
      "optional": true,
      "dependencies": {
        "vscode-jsonrpc": "8.2.0",
        "vscode-languageserver-types": "3.17.5"
      }
    },
    "node_modules/vscode-languageserver-textdocument": {
      "version": "1.0.12",
      "resolved": "http://binario.caixa:8081/repository/npm-all/vscode-languageserver-textdocument/-/vscode-languageserver-textdocument-1.0.12.tgz",
      "integrity": "sha512-cxWNPesCnQCcMPeenjKKsOCKQZ/L6Tv19DTRIGuLWe32lyzWhihGVJ/rcckZXJxfdKCFvRLS3fpBIsV/ZGX4zA==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/vscode-languageserver-types": {
      "version": "3.17.5",
      "resolved": "http://binario.caixa:8081/repository/npm-all/vscode-languageserver-types/-/vscode-languageserver-types-3.17.5.tgz",
      "integrity": "sha512-Ld1VelNuX9pdF39h2Hgaeb5hEZM2Z3jUrrMgWQAu82jMtZp7p3vJT3BzToKtZI7NgQssZje5o0zryOrhQvzQAg==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/vscode-uri": {
      "version": "3.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/vscode-uri/-/vscode-uri-3.1.0.tgz",
      "integrity": "sha512-/BpdSx+yCQGnCvecbyXdxHDkuk55/G3xwnC0GqY4gmQ3j+A+g8kzzgB4Nk/SINjqn6+waqw3EgbVF2QKExkRxQ==",
      "license": "MIT",
      "optional": true
    },
    "node_modules/w3c-xmlserializer": {
      "version": "4.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/w3c-xmlserializer/-/w3c-xmlserializer-4.0.0.tgz",
      "integrity": "sha512-d+BFHzbiCx6zGfz0HyQ6Rg69w9k19nviJspaj4yNscGjrHu94sVP+aRm75yEbCh+r2/yR+7q6hux9LVtbuTGBw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "xml-name-validator": "^4.0.0"
      },
      "engines": {
        "node": ">=14"
      }
    },
    "node_modules/walker": {
      "version": "1.0.8",
      "resolved": "http://binario.caixa:8081/repository/npm-all/walker/-/walker-1.0.8.tgz",
      "integrity": "sha512-ts/8E8l5b7kY0vlWLewOkDXMmPdLcVV4GmOQLyxuSswIJsweeFZtAsMF7k1Nszz+TYBQrlYRmzOnr398y1JemQ==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "makeerror": "1.0.12"
      }
    },
    "node_modules/watchpack": {
      "version": "2.4.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/watchpack/-/watchpack-2.4.2.tgz",
      "integrity": "sha512-TnbFSbcOCcDgjZ4piURLCbJ3nJhznVh9kw6F6iokjiFPl8ONxe9A6nMDVXDiNbrSfLILs6vB07F7wLBrwPYzJw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "glob-to-regexp": "^0.4.1",
        "graceful-fs": "^4.1.2"
      },
      "engines": {
        "node": ">=10.13.0"
      }
    },
    "node_modules/wbuf": {
      "version": "1.7.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/wbuf/-/wbuf-1.7.3.tgz",
      "integrity": "sha512-O84QOnr0icsbFGLS0O3bI5FswxzRr8/gHwWkDlQFskhSPryQXvrTMxjxGP4+iWYoauLoBvfDpkrOauZ+0iZpDA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "minimalistic-assert": "^1.0.0"
      }
    },
    "node_modules/wcwidth": {
      "version": "1.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/wcwidth/-/wcwidth-1.0.1.tgz",
      "integrity": "sha512-XHPEwS0q6TaxcvG85+8EYkbiCux2XtWG2mkc47Ng2A77BQu9+DqIOJldST4HgPkuea7dvKSj5VgX3P1d4rW8Tg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "defaults": "^1.0.3"
      }
    },
    "node_modules/weak-lru-cache": {
      "version": "1.2.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/weak-lru-cache/-/weak-lru-cache-1.2.2.tgz",
      "integrity": "sha512-DEAoo25RfSYMuTGc9vPJzZcZullwIqRDSI9LOy+fkCJPi6hykCnfKaXTuPBDuXAUcqHXyOgFtHNp/kB2FjYHbw==",
      "dev": true,
      "license": "MIT",
      "optional": true
    },
    "node_modules/webidl-conversions": {
      "version": "7.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/webidl-conversions/-/webidl-conversions-7.0.0.tgz",
      "integrity": "sha512-VwddBukDzu71offAQR975unBIGqfKZpM+8ZX6ySk8nYhVoo5CYaZyzt3YBvYtRtO+aoGlqxPg/B87NGVZ/fu6g==",
      "dev": true,
      "license": "BSD-2-Clause",
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/webpack": {
      "version": "5.105.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/webpack/-/webpack-5.105.0.tgz",
      "integrity": "sha512-gX/dMkRQc7QOMzgTe6KsYFM7DxeIONQSui1s0n/0xht36HvrgbxtM1xBlgx596NbpHuQU8P7QpKwrZYwUX48nw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/eslint-scope": "^3.7.7",
        "@types/estree": "^1.0.8",
        "@types/json-schema": "^7.0.15",
        "@webassemblyjs/ast": "^1.14.1",
        "@webassemblyjs/wasm-edit": "^1.14.1",
        "@webassemblyjs/wasm-parser": "^1.14.1",
        "acorn": "^8.15.0",
        "acorn-import-phases": "^1.0.3",
        "browserslist": "^4.28.1",
        "chrome-trace-event": "^1.0.2",
        "enhanced-resolve": "^5.19.0",
        "es-module-lexer": "^2.0.0",
        "eslint-scope": "5.1.1",
        "events": "^3.2.0",
        "glob-to-regexp": "^0.4.1",
        "graceful-fs": "^4.2.11",
        "json-parse-even-better-errors": "^2.3.1",
        "loader-runner": "^4.3.1",
        "mime-types": "^2.1.27",
        "neo-async": "^2.6.2",
        "schema-utils": "^4.3.3",
        "tapable": "^2.3.0",
        "terser-webpack-plugin": "^5.3.16",
        "watchpack": "^2.5.1",
        "webpack-sources": "^3.3.3"
      },
      "bin": {
        "webpack": "bin/webpack.js"
      },
      "engines": {
        "node": ">=10.13.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/webpack"
      },
      "peerDependenciesMeta": {
        "webpack-cli": {
          "optional": true
        }
      }
    },
    "node_modules/webpack-dev-middleware": {
      "version": "7.4.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/webpack-dev-middleware/-/webpack-dev-middleware-7.4.2.tgz",
      "integrity": "sha512-xOO8n6eggxnwYpy1NlzUKpvrjfJTvae5/D6WOK0S2LSo7vjmo5gCM1DbLUmFqrMTJP+W/0YZNctm7jasWvLuBA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "colorette": "^2.0.10",
        "memfs": "^4.6.0",
        "mime-types": "^2.1.31",
        "on-finished": "^2.4.1",
        "range-parser": "^1.2.1",
        "schema-utils": "^4.0.0"
      },
      "engines": {
        "node": ">= 18.12.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/webpack"
      },
      "peerDependencies": {
        "webpack": "^5.0.0"
      },
      "peerDependenciesMeta": {
        "webpack": {
          "optional": true
        }
      }
    },
    "node_modules/webpack-dev-server": {
      "version": "5.2.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/webpack-dev-server/-/webpack-dev-server-5.2.2.tgz",
      "integrity": "sha512-QcQ72gh8a+7JO63TAx/6XZf/CWhgMzu5m0QirvPfGvptOusAxG12w2+aua1Jkjr7hzaWDnJ2n6JFeexMHI+Zjg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/bonjour": "^3.5.13",
        "@types/connect-history-api-fallback": "^1.5.4",
        "@types/express": "^4.17.21",
        "@types/express-serve-static-core": "^4.17.21",
        "@types/serve-index": "^1.9.4",
        "@types/serve-static": "^1.15.5",
        "@types/sockjs": "^0.3.36",
        "@types/ws": "^8.5.10",
        "ansi-html-community": "^0.0.8",
        "bonjour-service": "^1.2.1",
        "chokidar": "^3.6.0",
        "colorette": "^2.0.10",
        "compression": "^1.7.4",
        "connect-history-api-fallback": "^2.0.0",
        "express": "^4.21.2",
        "graceful-fs": "^4.2.6",
        "http-proxy-middleware": "^2.0.9",
        "ipaddr.js": "^2.1.0",
        "launch-editor": "^2.6.1",
        "open": "^10.0.3",
        "p-retry": "^6.2.0",
        "schema-utils": "^4.2.0",
        "selfsigned": "^2.4.1",
        "serve-index": "^1.9.1",
        "sockjs": "^0.3.24",
        "spdy": "^4.0.2",
        "webpack-dev-middleware": "^7.4.2",
        "ws": "^8.18.0"
      },
      "bin": {
        "webpack-dev-server": "bin/webpack-dev-server.js"
      },
      "engines": {
        "node": ">= 18.12.0"
      },
      "funding": {
        "type": "opencollective",
        "url": "https://opencollective.com/webpack"
      },
      "peerDependencies": {
        "webpack": "^5.0.0"
      },
      "peerDependenciesMeta": {
        "webpack": {
          "optional": true
        },
        "webpack-cli": {
          "optional": true
        }
      }
    },
    "node_modules/webpack-dev-server/node_modules/chokidar": {
      "version": "3.6.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/chokidar/-/chokidar-3.6.0.tgz",
      "integrity": "sha512-7VT13fmjotKpGipCW9JEQAusEPE+Ei8nl6/g4FBAmIm0GOOLMua9NDDo/DWp0ZAxCr3cPq5ZpBqmPAQgDda2Pw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "anymatch": "~3.1.2",
        "braces": "~3.0.2",
        "glob-parent": "~5.1.2",
        "is-binary-path": "~2.1.0",
        "is-glob": "~4.0.1",
        "normalize-path": "~3.0.0",
        "readdirp": "~3.6.0"
      },
      "engines": {
        "node": ">= 8.10.0"
      },
      "funding": {
        "url": "https://paulmillr.com/funding/"
      },
      "optionalDependencies": {
        "fsevents": "~2.3.2"
      }
    },
    "node_modules/webpack-dev-server/node_modules/glob-parent": {
      "version": "5.1.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/glob-parent/-/glob-parent-5.1.2.tgz",
      "integrity": "sha512-AOIgSQCepiJYwP3ARnGx+5VnTu2HBYdzbGP45eLw1vr3zB3vZLeyed1sC9hnbcOc9/SrMyM5RPQrkGz4aS9Zow==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "is-glob": "^4.0.1"
      },
      "engines": {
        "node": ">= 6"
      }
    },
    "node_modules/webpack-dev-server/node_modules/http-proxy-middleware": {
      "version": "2.0.9",
      "resolved": "http://binario.caixa:8081/repository/npm-all/http-proxy-middleware/-/http-proxy-middleware-2.0.9.tgz",
      "integrity": "sha512-c1IyJYLYppU574+YI7R4QyX2ystMtVXZwIdzazUIPIJsHuWNd+mho2j+bKoHftndicGj9yh+xjd+l0yj7VeT1Q==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "@types/http-proxy": "^1.17.8",
        "http-proxy": "^1.18.1",
        "is-glob": "^4.0.1",
        "is-plain-obj": "^3.0.0",
        "micromatch": "^4.0.2"
      },
      "engines": {
        "node": ">=12.0.0"
      },
      "peerDependencies": {
        "@types/express": "^4.17.13"
      },
      "peerDependenciesMeta": {
        "@types/express": {
          "optional": true
        }
      }
    },
    "node_modules/webpack-dev-server/node_modules/picomatch": {
      "version": "2.3.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/picomatch/-/picomatch-2.3.2.tgz",
      "integrity": "sha512-V7+vQEJ06Z+c5tSye8S+nHUfI51xoXIXjHQ99cQtKUkQqqO1kO/KCJUfZXuB47h/YBlDhah2H3hdUGXn8ie0oA==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8.6"
      },
      "funding": {
        "url": "https://github.com/sponsors/jonschlinkert"
      }
    },
    "node_modules/webpack-dev-server/node_modules/readdirp": {
      "version": "3.6.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/readdirp/-/readdirp-3.6.0.tgz",
      "integrity": "sha512-hOS089on8RduqdbhvQ5Z37A0ESjsqz6qnRcffsMU3495FuTdqSm+7bhJ29JvIOsBDEEnan5DPu9t3To9VRlMzA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "picomatch": "^2.2.1"
      },
      "engines": {
        "node": ">=8.10.0"
      }
    },
    "node_modules/webpack-merge": {
      "version": "6.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/webpack-merge/-/webpack-merge-6.0.1.tgz",
      "integrity": "sha512-hXXvrjtx2PLYx4qruKl+kyRSLc52V+cCvMxRjmKwoA+CBbbF5GfIBtR6kCvl0fYGqTUPKB+1ktVmTHqMOzgCBg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "clone-deep": "^4.0.1",
        "flat": "^5.0.2",
        "wildcard": "^2.0.1"
      },
      "engines": {
        "node": ">=18.0.0"
      }
    },
    "node_modules/webpack-sources": {
      "version": "3.3.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/webpack-sources/-/webpack-sources-3.3.4.tgz",
      "integrity": "sha512-7tP1PdV4vF+lYPnkMR0jMY5/la2ub5Fc/8VQrrU+lXkiM6C4TjVfGw7iKfyhnTQOsD+6Q/iKw0eFciziRgD58Q==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=10.13.0"
      }
    },
    "node_modules/webpack-subresource-integrity": {
      "version": "5.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/webpack-subresource-integrity/-/webpack-subresource-integrity-5.1.0.tgz",
      "integrity": "sha512-sacXoX+xd8r4WKsy9MvH/q/vBtEHr86cpImXwyg74pFIpERKt6FmB8cXpeuh0ZLgclOlHI4Wcll7+R5L02xk9Q==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "typed-assert": "^1.0.8"
      },
      "engines": {
        "node": ">= 12"
      },
      "peerDependencies": {
        "html-webpack-plugin": ">= 5.0.0-beta.1 < 6",
        "webpack": "^5.12.0"
      },
      "peerDependenciesMeta": {
        "html-webpack-plugin": {
          "optional": true
        }
      }
    },
    "node_modules/webpack/node_modules/json-parse-even-better-errors": {
      "version": "2.3.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/json-parse-even-better-errors/-/json-parse-even-better-errors-2.3.1.tgz",
      "integrity": "sha512-xyFwyhro/JEof6Ghe2iz2NcXoj2sloNsWr/XsERDK/oiPCfaNhl5ONfp+jQdAZRQQ0IJWNzH9zIZF7li91kh2w==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/webpack/node_modules/watchpack": {
      "version": "2.5.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/watchpack/-/watchpack-2.5.1.tgz",
      "integrity": "sha512-Zn5uXdcFNIA1+1Ei5McRd+iRzfhENPCe7LeABkJtNulSxjma+l7ltNx55BWZkRlwRnpOgHqxnjyaDgJnNXnqzg==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "glob-to-regexp": "^0.4.1",
        "graceful-fs": "^4.1.2"
      },
      "engines": {
        "node": ">=10.13.0"
      }
    },
    "node_modules/websocket-driver": {
      "version": "0.7.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/websocket-driver/-/websocket-driver-0.7.4.tgz",
      "integrity": "sha512-b17KeDIQVjvb0ssuSDF2cYXSg2iztliJ4B9WdsuB6J952qCPKmnVq4DyW5motImXHDC1cBT/1UezrJVsKw5zjg==",
      "dev": true,
      "license": "Apache-2.0",
      "dependencies": {
        "http-parser-js": ">=0.5.1",
        "safe-buffer": ">=5.1.0",
        "websocket-extensions": ">=0.1.1"
      },
      "engines": {
        "node": ">=0.8.0"
      }
    },
    "node_modules/websocket-extensions": {
      "version": "0.1.4",
      "resolved": "http://binario.caixa:8081/repository/npm-all/websocket-extensions/-/websocket-extensions-0.1.4.tgz",
      "integrity": "sha512-OqedPIGOfsDlo31UNwYbCFMSaO9m9G/0faIHj5/dZFDMFqPTcx6UwqyOy3COEaEOg/9VsGIpdqn62W5KhoKSpg==",
      "dev": true,
      "license": "Apache-2.0",
      "engines": {
        "node": ">=0.8.0"
      }
    },
    "node_modules/whatwg-encoding": {
      "version": "2.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/whatwg-encoding/-/whatwg-encoding-2.0.0.tgz",
      "integrity": "sha512-p41ogyeMUrw3jWclHWTQg1k05DSVXPLcVxRTYsXUk+ZooOCZLcoYgPZ/HL/D/N+uQPOtcp1me1WhBEaX02mhWg==",
      "deprecated": "Use @exodus/bytes instead for a more spec-conformant and faster implementation",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "iconv-lite": "0.6.3"
      },
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/whatwg-encoding/node_modules/iconv-lite": {
      "version": "0.6.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/iconv-lite/-/iconv-lite-0.6.3.tgz",
      "integrity": "sha512-4fCk79wshMdzMp2rH06qWrJE4iolqLhCUH+OiuIgU++RB0+94NlDL81atO7GX55uUKueo0txHNtvEyI6D7WdMw==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "safer-buffer": ">= 2.1.2 < 3.0.0"
      },
      "engines": {
        "node": ">=0.10.0"
      }
    },
    "node_modules/whatwg-mimetype": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/whatwg-mimetype/-/whatwg-mimetype-3.0.0.tgz",
      "integrity": "sha512-nt+N2dzIutVRxARx1nghPKGv1xHikU7HKdfafKkLNLindmPU/ch3U31NOCGGA/dmPcmb1VlofO0vnKAcsm0o/Q==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/whatwg-url": {
      "version": "11.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/whatwg-url/-/whatwg-url-11.0.0.tgz",
      "integrity": "sha512-RKT8HExMpoYx4igMiVMY83lN6UeITKJlBQ+vR/8ZJ8OCdSiN3RwCq+9gH0+Xzj0+5IrM6i4j/6LuvzbZIQgEcQ==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "tr46": "^3.0.0",
        "webidl-conversions": "^7.0.0"
      },
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/which": {
      "version": "2.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/which/-/which-2.0.2.tgz",
      "integrity": "sha512-BLI3Tl1TW3Pvl70l3yq3Y64i+awpwXqsGBYWkkqMtnbXgrMD+yj7rhW0kuEDxzJaYXGjEW5ogapKNMEKNMjibA==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "isexe": "^2.0.0"
      },
      "bin": {
        "node-which": "bin/node-which"
      },
      "engines": {
        "node": ">= 8"
      }
    },
    "node_modules/wildcard": {
      "version": "2.0.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/wildcard/-/wildcard-2.0.1.tgz",
      "integrity": "sha512-CC1bOL87PIWSBhDcTrdeLo6eGT7mCFtrg0uIJtqJUFyK+eJnzl8A1niH56uu7KMa5XFrtiV+AQuHO3n7DsHnLQ==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/wordwrap": {
      "version": "1.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/wordwrap/-/wordwrap-1.0.0.tgz",
      "integrity": "sha512-gvVzJFlPycKc5dZN4yPkP8w7Dc37BtP1yczEneOb4uq34pXZcvrtRTmWV8W+Ume+XCxKgbjM+nevkyFPMybd4Q==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/wrap-ansi": {
      "version": "6.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/wrap-ansi/-/wrap-ansi-6.2.0.tgz",
      "integrity": "sha512-r6lPcBGxZXlIcymEu7InxDMhdW0KDxpLgoFLcguasxCaJ/SOIZwINatK9KY/tf+ZrlywOKU0UDj3ATXUBfxJXA==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "ansi-styles": "^4.0.0",
        "string-width": "^4.1.0",
        "strip-ansi": "^6.0.0"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/wrap-ansi-cjs": {
      "name": "wrap-ansi",
      "version": "7.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/wrap-ansi/-/wrap-ansi-7.0.0.tgz",
      "integrity": "sha512-YVGIj2kamLSTxw6NsZjoBxfSwsn0ycdesmc4p+Q21c5zPuZ1pl+NfxVdxPtdHvmNVOQ6XSYG4AUtyt/Fi7D16Q==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "ansi-styles": "^4.0.0",
        "string-width": "^4.1.0",
        "strip-ansi": "^6.0.0"
      },
      "engines": {
        "node": ">=10"
      },
      "funding": {
        "url": "https://github.com/chalk/wrap-ansi?sponsor=1"
      }
    },
    "node_modules/wrap-ansi-cjs/node_modules/emoji-regex": {
      "version": "8.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/emoji-regex/-/emoji-regex-8.0.0.tgz",
      "integrity": "sha512-MSjYzcWNOA0ewAHpz0MxpYFvwg6yjy1NG3xteoqz644VCo/RPgnr1/GGt+ic3iJTzQ8Eu3TdM14SawnVUmGE6A==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/wrap-ansi-cjs/node_modules/is-fullwidth-code-point": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/is-fullwidth-code-point/-/is-fullwidth-code-point-3.0.0.tgz",
      "integrity": "sha512-zymm5+u+sCsSWyD9qNaejV3DFvhCKclKdizYaJUuHA83RLjb7nSuGnddCHGv0hk+KY7BMAlsWeK4Ueg6EV6XQg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/wrap-ansi-cjs/node_modules/string-width": {
      "version": "4.2.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/string-width/-/string-width-4.2.3.tgz",
      "integrity": "sha512-wKyQRQpjJ0sIp62ErSZdGsjMJWsap5oRNihHhu6G7JVO/9jIB6UyevL+tXuOqrng8j/cxKTWyWUwvSTriiZz/g==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "emoji-regex": "^8.0.0",
        "is-fullwidth-code-point": "^3.0.0",
        "strip-ansi": "^6.0.1"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/wrap-ansi/node_modules/emoji-regex": {
      "version": "8.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/emoji-regex/-/emoji-regex-8.0.0.tgz",
      "integrity": "sha512-MSjYzcWNOA0ewAHpz0MxpYFvwg6yjy1NG3xteoqz644VCo/RPgnr1/GGt+ic3iJTzQ8Eu3TdM14SawnVUmGE6A==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/wrap-ansi/node_modules/is-fullwidth-code-point": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/is-fullwidth-code-point/-/is-fullwidth-code-point-3.0.0.tgz",
      "integrity": "sha512-zymm5+u+sCsSWyD9qNaejV3DFvhCKclKdizYaJUuHA83RLjb7nSuGnddCHGv0hk+KY7BMAlsWeK4Ueg6EV6XQg==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/wrap-ansi/node_modules/string-width": {
      "version": "4.2.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/string-width/-/string-width-4.2.3.tgz",
      "integrity": "sha512-wKyQRQpjJ0sIp62ErSZdGsjMJWsap5oRNihHhu6G7JVO/9jIB6UyevL+tXuOqrng8j/cxKTWyWUwvSTriiZz/g==",
      "dev": true,
      "license": "MIT",
      "dependencies": {
        "emoji-regex": "^8.0.0",
        "is-fullwidth-code-point": "^3.0.0",
        "strip-ansi": "^6.0.1"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/wrappy": {
      "version": "1.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/wrappy/-/wrappy-1.0.2.tgz",
      "integrity": "sha512-l4Sp/DRseor9wL6EvV2+TuQn63dMkPjZ/sp9XkghTEbV9KlPS1xUsZ3u7/IQO4wxtcFB4bgpQPRcR3QCvezPcQ==",
      "dev": true,
      "license": "ISC"
    },
    "node_modules/write-file-atomic": {
      "version": "4.0.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/write-file-atomic/-/write-file-atomic-4.0.2.tgz",
      "integrity": "sha512-7KxauUdBmSdWnmpaGFg+ppNjKF8uNLry8LyzjauQDOVONfFLNKrKvQOxZ/VuTIcS/gge/YNahf5RIIQWTSarlg==",
      "dev": true,
      "license": "ISC",
      "dependencies": {
        "imurmurhash": "^0.1.4",
        "signal-exit": "^3.0.7"
      },
      "engines": {
        "node": "^12.13.0 || ^14.15.0 || >=16.0.0"
      }
    },
    "node_modules/write-file-atomic/node_modules/signal-exit": {
      "version": "3.0.7",
      "resolved": "http://binario.caixa:8081/repository/npm-all/signal-exit/-/signal-exit-3.0.7.tgz",
      "integrity": "sha512-wnD2ZE+l+SPC/uoS0vXeE9L1+0wuaMqKlfz9AMUo38JsyLSBWSFcHR1Rri62LZc12vLr1gb3jl7iwQhgwpAbGQ==",
      "dev": true,
      "license": "ISC"
    },
    "node_modules/ws": {
      "version": "8.20.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/ws/-/ws-8.20.0.tgz",
      "integrity": "sha512-sAt8BhgNbzCtgGbt2OxmpuryO63ZoDk/sqaB/znQm94T4fCEsy/yV+7CdC1kJhOU9lboAEU7R3kquuycDoibVA==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=10.0.0"
      },
      "peerDependencies": {
        "bufferutil": "^4.0.1",
        "utf-8-validate": ">=5.0.2"
      },
      "peerDependenciesMeta": {
        "bufferutil": {
          "optional": true
        },
        "utf-8-validate": {
          "optional": true
        }
      }
    },
    "node_modules/xhr2": {
      "version": "0.2.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/xhr2/-/xhr2-0.2.1.tgz",
      "integrity": "sha512-sID0rrVCqkVNUn8t6xuv9+6FViXjUVXq8H5rWOH2rz9fDNQEd4g0EA2XlcEdJXRz5BMEn4O1pJFdT+z4YHhoWw==",
      "license": "MIT",
      "engines": {
        "node": ">= 6"
      }
    },
    "node_modules/xml-name-validator": {
      "version": "4.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/xml-name-validator/-/xml-name-validator-4.0.0.tgz",
      "integrity": "sha512-ICP2e+jsHvAj2E2lIHxa5tjXRlKDJo4IdvPvCXbXQGdzSfmSpNVyIKMvoZHjDY9DP0zV17iI85o90vRFXNccRw==",
      "dev": true,
      "license": "Apache-2.0",
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/xmlchars": {
      "version": "2.2.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/xmlchars/-/xmlchars-2.2.0.tgz",
      "integrity": "sha512-JZnDKK8B0RCDw84FNdDAIpZK+JuJw+s7Lz8nksI7SIuU3UXJJslUthsi+uWBUYOwPFwW7W7PRLRfUKpxjtjFCw==",
      "dev": true,
      "license": "MIT"
    },
    "node_modules/y18n": {
      "version": "5.0.8",
      "resolved": "http://binario.caixa:8081/repository/npm-all/y18n/-/y18n-5.0.8.tgz",
      "integrity": "sha512-0pfFzegeDWJHJIAmTLRP2DwHjdF5s7jo9tuztdQxAhINCdvS+3nGINqPd00AphqJR/0LhANUS6/+7SCb98YOfA==",
      "license": "ISC",
      "engines": {
        "node": ">=10"
      }
    },
    "node_modules/yallist": {
      "version": "3.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/yallist/-/yallist-3.1.1.tgz",
      "integrity": "sha512-a4UGQaWPH59mOXUYnAG2ewncQS4i4F43Tv3JoAM+s2VDAmS9NsK8GpDMLrCHPksFT7h3K6TOoUNn2pb7RoXx4g==",
      "license": "ISC"
    },
    "node_modules/yargs": {
      "version": "17.7.2",
      "resolved": "http://binario.caixa:8081/repository/npm-all/yargs/-/yargs-17.7.2.tgz",
      "integrity": "sha512-7dSzzRQ++CKnNI/krKnYRV7JKKPUXMEh61soaHKg9mrWEhzFWhFnxPxGl+69cD1Ou63C13NUPCnmIcrvqCuM6w==",
      "license": "MIT",
      "dependencies": {
        "cliui": "^8.0.1",
        "escalade": "^3.1.1",
        "get-caller-file": "^2.0.5",
        "require-directory": "^2.1.1",
        "string-width": "^4.2.3",
        "y18n": "^5.0.5",
        "yargs-parser": "^21.1.1"
      },
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/yargs-parser": {
      "version": "21.1.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/yargs-parser/-/yargs-parser-21.1.1.tgz",
      "integrity": "sha512-tVpsJW7DdjecAiFpbIB1e3qxIQsE6NoPc5/eTdrbbIC4h0LVsWhnoa3g+m2HclBIujHzsxZ4VJVA+GUuc2/LBw==",
      "license": "ISC",
      "engines": {
        "node": ">=12"
      }
    },
    "node_modules/yargs/node_modules/emoji-regex": {
      "version": "8.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/emoji-regex/-/emoji-regex-8.0.0.tgz",
      "integrity": "sha512-MSjYzcWNOA0ewAHpz0MxpYFvwg6yjy1NG3xteoqz644VCo/RPgnr1/GGt+ic3iJTzQ8Eu3TdM14SawnVUmGE6A==",
      "license": "MIT"
    },
    "node_modules/yargs/node_modules/is-fullwidth-code-point": {
      "version": "3.0.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/is-fullwidth-code-point/-/is-fullwidth-code-point-3.0.0.tgz",
      "integrity": "sha512-zymm5+u+sCsSWyD9qNaejV3DFvhCKclKdizYaJUuHA83RLjb7nSuGnddCHGv0hk+KY7BMAlsWeK4Ueg6EV6XQg==",
      "license": "MIT",
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/yargs/node_modules/string-width": {
      "version": "4.2.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/string-width/-/string-width-4.2.3.tgz",
      "integrity": "sha512-wKyQRQpjJ0sIp62ErSZdGsjMJWsap5oRNihHhu6G7JVO/9jIB6UyevL+tXuOqrng8j/cxKTWyWUwvSTriiZz/g==",
      "license": "MIT",
      "dependencies": {
        "emoji-regex": "^8.0.0",
        "is-fullwidth-code-point": "^3.0.0",
        "strip-ansi": "^6.0.1"
      },
      "engines": {
        "node": ">=8"
      }
    },
    "node_modules/yocto-queue": {
      "version": "0.1.0",
      "resolved": "http://binario.caixa:8081/repository/npm-all/yocto-queue/-/yocto-queue-0.1.0.tgz",
      "integrity": "sha512-rVksvsnNCdJ/ohGc6xgPwyN8eheCxsiLM8mxuE/t/mOVqJewPuO1miLpTHQiRgTKCLexL4MeAFVagts7HmNZ2Q==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=10"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/yoctocolors-cjs": {
      "version": "2.1.3",
      "resolved": "http://binario.caixa:8081/repository/npm-all/yoctocolors-cjs/-/yoctocolors-cjs-2.1.3.tgz",
      "integrity": "sha512-U/PBtDf35ff0D8X8D0jfdzHYEPFxAI7jJlxZXwCSez5M3190m+QobIfh+sWDWSHMCWWJN2AWamkegn6vr6YBTw==",
      "dev": true,
      "license": "MIT",
      "engines": {
        "node": ">=18"
      },
      "funding": {
        "url": "https://github.com/sponsors/sindresorhus"
      }
    },
    "node_modules/zone.js": {
      "version": "0.15.1",
      "resolved": "http://binario.caixa:8081/repository/npm-all/zone.js/-/zone.js-0.15.1.tgz",
      "integrity": "sha512-XE96n56IQpJM7NAoXswY3XRLcWFW83xe0BiAOeMD7K5k5xecOeul3Qcpx6GqEeeHNkW5DWL5zOyTbEfB4eti8w==",
      "license": "MIT"
    }
  }
}



<img width="1693" height="892" alt="image" src="https://github.com/user-attachments/assets/482cb1c9-c480-4d75-a52c-b62efb4dffdc" />






# Variable 'ImageBuild_OKD' was defined in the Variables tab
# Variable 'NODE_VERSION' was defined in the Variables tab
# Variable 'nome_imagem' was defined in the Variables tab
# Variable 'SITE' was defined in the Variables tab
# Variable 'SONAR_PROPERTIES' was defined in the Variables tab
# Variable 'tag_imagem' was defined in the Variables tab
# Variable 'TemplateBuild_OKD' was defined in the Variables tab
# Variable 'TemplateVersaoProduto_OKD' was defined in the Variables tab
# Variable 'version.app' was defined in the Variables tab
# Variable Group 'BUILD_VARIABLES' was defined in the Variables tab
# Variable Group 'OKD-REGISTRY-CENTRALIZADO' was defined in the Variables tab
# Variable Group 'SAST_FORTIFY_COMUNIDADE_CLIENTES' was defined in the Variables tab
# Variable Group 'SONAR_VARIABLES - ESTEIRA - ANGULAR_JEST' was defined in the Variables tab
name: $(version.app)
resources:
  repositories:
  - repository: self
    type: git
    ref: refs/heads/dev
jobs:
- job: Job_1
  displayName: Agent job 1
  pool:
    name: Build-Linux-OKD4
  steps:
  - checkout: self
    clean: true
  - task: Bash@3
    displayName: Bash Script 1
    enabled: False
    inputs:
      targetType: inline
      script: >
        which node

        node --version

        which npm

        npm --version
  - task: Bash@3
    displayName: Bash Script
    enabled: False
    inputs:
      targetType: inline
      script: >-
        npm ls inputmask || true

        echo "--- exports do inputmask ---"

        cat node_modules/inputmask/package.json | grep -A 10 '"exports"' || true

        echo "--- arquivos em dist/ ---"

        ls node_modules/inputmask/dist/ || true
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

        sed -i 's/"version":\s*".*"/"version": "'$VERSION'"/' $(Build.Repository.LocalPath)/package.json

        grep version $(Build.Repository.LocalPath)/package.json

        else

        package_version=`jq -r .version $(Build.Repository.LocalPath)/package.json`

        fi
      failOnStderr: true
  - task: Bash@3
    displayName: Recupera versão projeto
    inputs:
      targetType: inline
      script: "cd $(Build.SourcesDirectory)\nexport PROJECT='$(Build.Repository.LocalPath)/package.json'\n\np_version=`cat ${PROJECT} | jq -r .version` \np_name=`cat ${PROJECT} | jq -r .name` \np_extension=\"zip\"\np_projectKey=`echo $p_name| tr -cd '[:alnum:]'` \np_group=\"\"\n\necho \"${p_name}:${p_extension}:${p_version}\"\n\necho \"##vso[task.setvariable variable=project.group;]$p_group\"\n\necho \"##vso[task.setvariable variable=project.name;]$p_name\"\n\necho \"##vso[task.setvariable variable=project.version;]$p_version\"\n\necho \"##vso[task.setvariable variable=project.extension;]$p_extension\"\n\necho \"##vso[task.setvariable variable=project.key;]$p_projectKey\"\n\necho \"##vso[task.setvariable variable=project.release;]true\"\n\nif [[ ${p_version} == *\"snapshot\"* ]]; then\n  echo \"##vso[task.setvariable variable=project.release;]false\"\nfi\n\necho \"##vso[task.setvariable variable=PACKAGE_JSON_PATH;]$(Build.Repository.LocalPath)\""
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
    displayName: Use Node $(NODE_VERSION)
    retryCountOnTaskFailure: 5
    inputs:
      versionSpec: $(NODE_VERSION)
  - task: Bash@3
    displayName: Configurando Registry NPM
    inputs:
      targetType: inline
      script: >2-
          cat <<EOF > $(Build.Repository.LocalPath)/.npmrc
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
          cat <<EOF > $(Build.Repository.LocalPath)/.npmrc
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
      workingDir: $(Build.Repository.LocalPath)
      verbose: true
      customCommand: install --no-audit --verbose
  - task: Bash@3
    displayName: Build Application
    inputs:
      targetType: inline
      script: "export HOME=/tmp/firefox-home3    \nmkdir -p $HOME\n\ncd $(Build.Repository.LocalPath)/\necho \"npm run build && npm run coverage\"\necho \"<----ANGULAR---->\"\nnpx ng version\nnpm run build && npm run coverage\n"
  - task: Bash@3
    displayName: Zip dist
    inputs:
      targetType: inline
      script: >+
        #cd $(Build.SourcesDirectory)

        cd $(Build.Repository.LocalPath)


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
    displayName: 'SAST: Cria Aplicação - Backup'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), ne(variables['fortify_disable'], 'gecmi'))
    retryCountOnTaskFailure: 5
    enabled: False
    inputs:
      script: "command -v docker && docker --version\ncommand -v podman && podman --version\n\n#sudo usermod -aG docker $USER\n\n#ls -l /var/run/docker.sock\n\n#set -o errexit\n#set -o pipefail\n#echo Engine selecionado: $CONTAINER_ENGINE\n#echo Versão mais recente: $FORTIFY_NEW_VERSION\n#echo Versão anterior: $FORTIFY_LAST_VERSION\n\necho \"$FORTIFY_REGISTRY_PASSWORD\" | $CONTAINER_ENGINE login default-route-openshift-image-registry.apps.produtos4.caixa --username \"$FORTIFY_REGISTRY_USERNAME\" --password-stdin\n \necho FORTIFY_APPLICATION: $FORTIFY_APPLICATION\necho KEYSTORE_SECUREFILEPATH: $(KEYSTORE_SECUREFILEPATH)\nKEYSTORE_SECUREFILEPATH=$(KEYSTORE_SECUREFILEPATH)\ncp $KEYSTORE_SECUREFILEPATH $(System.DefaultWorkingDirectory)/keystore.jks\n#echo \"##vso[task.setvariable variable=KEYSTORE_SECUREFILEPATH]$KEYSTORE_SECUREFILEPATH\"\n\n# Valida Integridade do JKS (parte 1, fora do container)\necho Valida integridade do certificado FORA do container\necho \"##[command]md5sum /etc/pki/ca-trust/source/anchors/keystore-ssc24.jks\"\nmd5sum /etc/pki/ca-trust/source/anchors/keystore-ssc24.jks\necho \"##[command]md5sum $KEYSTORE_SECUREFILEPATH\"\nmd5sum $KEYSTORE_SECUREFILEPATH\necho \"##[command]md5sum $(System.DefaultWorkingDirectory)/keystore.jks\"\nmd5sum $(System.DefaultWorkingDirectory)/keystore.jks\n\n# Executa o container Fortify com as variáveis herdadas do ambiente\necho \"##[command]$CONTAINER_ENGINE --version\"\n$CONTAINER_ENGINE --version\necho \"##[command]$CONTAINER_ENGINE run -v $(System.DefaultWorkingDirectory):/src default-route-openshift-image-registry.apps.produtos4.caixa/fortify/fortify-ci-tools:7.0.0-jdk-17\"\n$CONTAINER_ENGINE run --rm \\\n  --security-opt seccomp=unconfined \\\n  --memory=12g \\\n  --memory-swap=12g \\\n  -v $(System.DefaultWorkingDirectory):/src \\\n  -w /src \\\n  -e FORTIFY_APPLICATION \\\n  -e FORTIFY_APP_VERSION=$FORTIFY_NEW_VERSION \\\n  -e FORTIFY_PREVIOUS_VERSION=$FORTIFY_LAST_VERSION \\\n  -e FORTIFY_SESSION \\\n  -e FORTIFY_URL \\\n  -e FORTIFY_CI_TOKEN \\\n  -e FORTIFY_CLIENT_AUTH_TOKEN \\\n  -e FORTIFY_SENSOR_VERSION \\\n  -e FORTIFY_SIGLA=$(Build.DefinitionName) \\\n  -e FORTIFY_COMUNIDADE \\\n  -e FORTIFY_LDAP_GROUP \\\n  default-route-openshift-image-registry.apps.produtos4.caixa/fortify/fortify-ci-tools:7.0.0-jdk-17 \\\n  bash -c \"\n    \n    echo Valida integridade do certificado DENTRO do container\n    echo md5sum /src/keystore.jks\n    md5sum /src/keystore.jks\n    \n    echo Configurando Key Store\n    fcli config truststore set \\\n      --file=/src/keystore.jks \\\n      --password=$KEYSTORE_PWD \\\n      --type=jks\n \n    echo \\\"Nome do Sistema: \\$FORTIFY_APPLICATION\\\"\n \n    echo \\\"Nome da Versão: \\$FORTIFY_APP_VERSION\\\"\n \n    echo \\\"Nome da Versão Anterior: \\$FORTIFY_PREVIOUS_VERSION\\\"\n \n   #FORTIFY_CI_TOKEN proveniente do Fortify (expira)\n   #FORTIFY_CLIENT_AUTH_TOKEN (não expira)\n    echo Login no Fortify...\n    fcli ssc session login \\\n      --url=\\$FORTIFY_URL \\\n      --token=\\$FORTIFY_CI_TOKEN \\\n      --client-auth-token=\\$FORTIFY_CLIENT_AUTH_TOKEN \\\n      --socket-timeout=10m \\\n      --connect-timeout=5m \\\n      --ssc-session=\\$FORTIFY_SESSION\n    \n \n    echo Criando aplicação no Fortify...\n    fcli ssc action run setup-appversion \\\n      --appversion=\\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION \\\n      --attributes=\\\"Comunidade=\\$FORTIFY_COMUNIDADE,Sigla=\\$FORTIFY_SIGLA\\\" \\\n      --add-users=\\$FORTIFY_LDAP_GROUP \\\n      --copy-from=\\$FORTIFY_APPLICATION:\\$FORTIFY_PREVIOUS_VERSION \\\n      --ssc-session=\\$FORTIFY_SESSION || true\n \n    fcli ssc action run setup-appversion \\\n      --appversion=\\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION \\\n      --attributes=\\\"Comunidade=\\$FORTIFY_COMUNIDADE,Sigla=\\$FORTIFY_SIGLA\\\" \\\n      --add-users=\\$FORTIFY_LDAP_GROUP \\\n      --ssc-session=\\$FORTIFY_SESSION || true\n \n    echo Atribuindo acessos ao Fortify...\n    fcli ssc appversion update \\\n      \\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION \\\n      --add-users=\\$FORTIFY_LDAP_GROUP \\\n      --ssc-session=\\$FORTIFY_SESSION || true\n \n    echo Logout do Fortify...\n    fcli ssc session logout \\\n      --ssc-session=\\$FORTIFY_SESSION \\\n      --no-revoke-token\n  \""
  - task: CmdLine@2
    displayName: 'SAST: Cria Aplicação'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), ne(variables['fortify_disable'], 'gecmi'))
    retryCountOnTaskFailure: 5
    inputs:
      script: "command -v docker && docker --version\ncommand -v podman && podman --version\n\n#sudo usermod -aG docker $USER\n\n#ls -l /var/run/docker.sock\n\n#set -o errexit\n#set -o pipefail\n#echo Engine selecionado: $CONTAINER_ENGINE\n#echo Versão mais recente: $FORTIFY_NEW_VERSION\n#echo Versão anterior: $FORTIFY_LAST_VERSION\n\necho \"$FORTIFY_REGISTRY_PASSWORD\" | $CONTAINER_ENGINE login default-route-openshift-image-registry.apps.produtos4.caixa --username \"$FORTIFY_REGISTRY_USERNAME\" --password-stdin\n \necho FORTIFY_APPLICATION: $FORTIFY_APPLICATION\necho KEYSTORE_SECUREFILEPATH: $(KEYSTORE_SECUREFILEPATH)\nKEYSTORE_SECUREFILEPATH=$(KEYSTORE_SECUREFILEPATH)\ncp $KEYSTORE_SECUREFILEPATH $(System.DefaultWorkingDirectory)/keystore.jks\n#echo \"##vso[task.setvariable variable=KEYSTORE_SECUREFILEPATH]$KEYSTORE_SECUREFILEPATH\"\n\n# Valida Integridade do JKS (parte 1, fora do container)\necho Valida integridade do certificado FORA do container\necho \"##[command]md5sum /etc/pki/ca-trust/source/anchors/keystore-ssc24.jks\"\nmd5sum /etc/pki/ca-trust/source/anchors/keystore-ssc24.jks\necho \"##[command]md5sum $KEYSTORE_SECUREFILEPATH\"\nmd5sum $KEYSTORE_SECUREFILEPATH\necho \"##[command]md5sum $(System.DefaultWorkingDirectory)/keystore.jks\"\nmd5sum $(System.DefaultWorkingDirectory)/keystore.jks\n\n# Executa o container Fortify com as variáveis herdadas do ambiente\necho \"##[command]$CONTAINER_ENGINE --version\"\n$CONTAINER_ENGINE --version\necho \"##[command]$CONTAINER_ENGINE run -v $(System.DefaultWorkingDirectory):/src default-route-openshift-image-registry.apps.produtos4.caixa/fortify/fortify-ci-tools:7.0.0-jdk-17\"\n$CONTAINER_ENGINE run --rm \\\n  --security-opt seccomp=unconfined \\\n  --memory=12g \\\n  --memory-swap=12g \\\n  -v $(System.DefaultWorkingDirectory):/src \\\n  -w /src \\\n  -e FORTIFY_APPLICATION \\\n  -e FORTIFY_APP_VERSION=$FORTIFY_NEW_VERSION \\\n  -e FORTIFY_PREVIOUS_VERSION=$FORTIFY_LAST_VERSION \\\n  -e FORTIFY_SESSION \\\n  -e FORTIFY_URL \\\n  -e FORTIFY_CI_TOKEN \\\n  -e FORTIFY_CLIENT_AUTH_TOKEN \\\n  -e FORTIFY_SENSOR_VERSION \\\n  -e FORTIFY_SIGLA=$(Build.DefinitionName) \\\n  -e FORTIFY_COMUNIDADE \\\n  -e FORTIFY_LDAP_GROUP \\\n  default-route-openshift-image-registry.apps.produtos4.caixa/fortify/fortify-ci-tools:7.0.0-jdk-17 \\\n  bash -c \"\n\n    echo Valida integridade do certificado DENTRO do container\n    echo md5sum /src/keystore.jks\n    md5sum /src/keystore.jks\n\n    echo Configurando Key Store\n    fcli config truststore set \\\n      --file=/src/keystore.jks \\\n      --password=$KEYSTORE_PWD \\\n      --type=jks\n\n    echo \\\"Nome do Sistema: \\$FORTIFY_APPLICATION\\\"\n\n    echo \\\"Nome da Versão: \\$FORTIFY_APP_VERSION\\\"\n\n    echo \\\"Nome da Versão Anterior: \\$FORTIFY_PREVIOUS_VERSION\\\"\n\n   #FORTIFY_CI_TOKEN proveniente do Fortify (expira)\n   #FORTIFY_CLIENT_AUTH_TOKEN (não expira)\n    echo Login no Fortify...\n    fcli ssc session login \\\n      --url=\\$FORTIFY_URL \\\n      --token=\\$FORTIFY_CI_TOKEN \\\n      --client-auth-token=\\$FORTIFY_CLIENT_AUTH_TOKEN \\\n      --socket-timeout=10m \\\n      --connect-timeout=5m \\\n      --ssc-session=\\$FORTIFY_SESSION\n\n    echo Criando aplicação no Fortify...\n    fcli ssc action run setup-appversion \\\n      --appversion=\\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION \\\n      --attributes=\\\"Comunidade=\\$FORTIFY_COMUNIDADE,Sigla=\\$FORTIFY_SIGLA\\\" \\\n      --add-users=\\$FORTIFY_LDAP_GROUP \\\n      --copy-from=\\$FORTIFY_APPLICATION:\\$FORTIFY_PREVIOUS_VERSION \\\n      --ssc-session=\\$FORTIFY_SESSION || true\n\n    fcli ssc action run setup-appversion \\\n      --appversion=\\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION \\\n      --attributes=\\\"Comunidade=\\$FORTIFY_COMUNIDADE,Sigla=\\$FORTIFY_SIGLA\\\" \\\n      --add-users=\\$FORTIFY_LDAP_GROUP \\\n      --ssc-session=\\$FORTIFY_SESSION || true\n \n    echo Atribuindo acessos ao Fortify...\n    fcli ssc appversion update \\\n      \\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION \\\n      --add-users=\\$FORTIFY_LDAP_GROUP \\\n      --ssc-session=\\$FORTIFY_SESSION || true\n\n    echo Pegando Rules\n    fcli ssc rest call \\\n      -X GET \\\n      -o json \\\n      --to-file rules.json \\\n      --ssc-session=\\\"\\$FORTIFY_SESSION\\\" \\\n      \\\"/api/v1/projectVersions/10000/resultProcessingRules\\\" || true\n\n    echo Pegando ID app\n    FRTF_ID_VERSION=\\$(\n     fcli ssc appversion get \\\n      --ssc-session=\\\"\\$FORTIFY_SESSION\\\" \\\n      -o expr=\\\"{id}\\\" \\\n      \\\"\\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION\\\"\n    ) || true\n\n    echo Atualizando Rules\n    fcli ssc rest call \\\n      -X PUT \\\n      -d '@@rules.json' \\\n      --ssc-session=\\\"\\$FORTIFY_SESSION\\\" \\\n      \\\"/api/v1/projectVersions/\\$FRTF_ID_VERSION/resultProcessingRules\\\" || true \n    echo \\\"FRTF_ID_VERSION: \\$FRTF_ID_VERSION\\\"\n\n    echo Logout do Fortify...\n    fcli ssc session logout \\\n      --ssc-session=\\$FORTIFY_SESSION \\\n      --no-revoke-token\n  \""
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


