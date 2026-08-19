
<img width="1904" height="913" alt="image" src="https://github.com/user-attachments/assets/161e1685-ce44-4b94-af7d-3335bde44b9c" />


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
