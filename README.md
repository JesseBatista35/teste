2026-08-19T15:55:36.0354316Z ##[section]Starting: Build Application
2026-08-19T15:55:36.0358424Z ==============================================================================
2026-08-19T15:55:36.0358544Z Task         : Bash
2026-08-19T15:55:36.0358649Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-19T15:55:36.0358711Z Version      : 3.227.0
2026-08-19T15:55:36.0358754Z Author       : Microsoft Corporation
2026-08-19T15:55:36.0358841Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-19T15:55:36.0358912Z ==============================================================================
2026-08-19T15:55:36.1909706Z Generating script.
2026-08-19T15:55:36.1922161Z ========================== Starting Command Output ===========================
2026-08-19T15:55:36.1929759Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/c2f2f652-0769-42d1-ae5b-1cf0b31565c6.sh
2026-08-19T15:55:36.2008815Z npm run build && npm run coverage
2026-08-19T15:55:36.2009584Z <----ANGULAR---->
2026-08-19T15:55:36.6600695Z 
2026-08-19T15:55:36.6601903Z      _                      _                 ____ _     ___
2026-08-19T15:55:36.6602210Z     / \   _ __   __ _ _   _| | __ _ _ __     / ___| |   |_ _|
2026-08-19T15:55:36.6603016Z    / △ \ | '_ \ / _` | | | | |/ _` | '__|   | |   | |    | |
2026-08-19T15:55:36.6603207Z   / ___ \| | | | (_| | |_| | | (_| | |      | |___| |___ | |
2026-08-19T15:55:36.6603463Z  /_/   \_\_| |_|\__, |\__,_|_|\__,_|_|       \____|_____|___|
2026-08-19T15:55:36.6603734Z                 |___/
2026-08-19T15:55:36.6603929Z     
2026-08-19T15:55:36.7429688Z 
2026-08-19T15:55:36.7430368Z Angular CLI: 19.2.23
2026-08-19T15:55:36.7430511Z Node: 22.13.1
2026-08-19T15:55:36.7430672Z Package Manager: npm 10.9.2
2026-08-19T15:55:36.7430976Z OS: linux x64
2026-08-19T15:55:36.7431016Z 
2026-08-19T15:55:36.7431185Z Angular: 19.2.20
2026-08-19T15:55:36.7431575Z ... animations, common, compiler, compiler-cli, core, forms
2026-08-19T15:55:36.7431809Z ... platform-browser, platform-browser-dynamic, platform-server
2026-08-19T15:55:36.7432269Z ... router
2026-08-19T15:55:36.7432308Z 
2026-08-19T15:55:36.7432433Z Package                            Version
2026-08-19T15:55:36.7432641Z ------------------------------------------------------------
2026-08-19T15:55:36.7432865Z @angular-devkit/architect          0.1902.23
2026-08-19T15:55:36.7433054Z @angular-devkit/build-angular      19.2.23
2026-08-19T15:55:36.7433209Z @angular-devkit/core               19.2.23
2026-08-19T15:55:36.7433422Z @angular-devkit/schematics         19.2.23
2026-08-19T15:55:36.7433564Z @angular/build                     19.2.23
2026-08-19T15:55:36.7433709Z @angular/cdk                       19.2.19
2026-08-19T15:55:36.7433838Z @angular/cli                       19.2.23
2026-08-19T15:55:36.7433934Z @angular/material                  19.2.19
2026-08-19T15:55:36.7434118Z @angular/material-moment-adapter   19.2.19
2026-08-19T15:55:36.7434256Z @schematics/angular                19.2.23
2026-08-19T15:55:36.7434391Z rxjs                               7.8.2
2026-08-19T15:55:36.7434647Z typescript                         5.8.3
2026-08-19T15:55:36.7434756Z zone.js                            0.15.1
2026-08-19T15:55:36.7434902Z     
2026-08-19T15:55:36.8730063Z 
2026-08-19T15:55:36.8731078Z > sisam-web@1.0.0.0-snapshot build
2026-08-19T15:55:36.8731320Z > ng build --configuration production --aot
2026-08-19T15:55:36.8731423Z 
2026-08-19T15:55:37.4253613Z ❯ Building...
2026-08-19T15:55:51.0671727Z ✔ Building...
2026-08-19T15:55:51.0688393Z Application bundle generation failed. [13.641 seconds]
2026-08-19T15:55:51.0688469Z 
2026-08-19T15:55:51.0727583Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1m235 repetitive deprecation warnings omitted.
2026-08-19T15:55:51.0728210Z Run in verbose mode to see all warnings.[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:55:51.0728284Z 
2026-08-19T15:55:51.0728565Z     angular:styles/global:styles:1:8:
2026-08-19T15:55:51.0728802Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:55:51.0729202Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:55:51.0729626Z 
2026-08-19T15:55:51.0729772Z   null
2026-08-19T15:55:51.0729808Z 
2026-08-19T15:55:51.0729896Z 
2026-08-19T15:55:51.0730140Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:55:51.0730219Z 
2026-08-19T15:55:51.0730392Z     node_modules/bootstrap/scss/_functions.scss:11:29:
2026-08-19T15:55:51.0730647Z [37m      11 │     @if $prev-num == null or [32m[37munit($num) == "%" or unit($prev-num) ...
2026-08-19T15:55:51.0730826Z          ╵                              [32m^[0m
2026-08-19T15:55:51.0730910Z 
2026-08-19T15:55:51.0730945Z 
2026-08-19T15:55:51.0731159Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-19T15:55:51.0731332Z   Use math.unit instead.
2026-08-19T15:55:51.0731422Z   
2026-08-19T15:55:51.0731640Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-19T15:55:51.0731734Z 
2026-08-19T15:55:51.0731900Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:55:51.0731994Z 
2026-08-19T15:55:51.0732095Z     angular:styles/global:styles:1:8:
2026-08-19T15:55:51.0732299Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:55:51.0732492Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:55:51.0732540Z 
2026-08-19T15:55:51.0732608Z 
2026-08-19T15:55:51.0732798Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:55:51.0733035Z 
2026-08-19T15:55:51.0733172Z     node_modules/bootstrap/scss/_functions.scss:11:50:
2026-08-19T15:55:51.0733388Z [37m      11 │ ...$prev-num == null or unit($num) == "%" or [32m[37munit($prev-num) == "%" {
2026-08-19T15:55:51.0733605Z          ╵                                              [32m^[0m
2026-08-19T15:55:51.0733685Z 
2026-08-19T15:55:51.0733716Z 
2026-08-19T15:55:51.0733919Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-19T15:55:51.0734384Z   Use math.unit instead.
2026-08-19T15:55:51.0734473Z   
2026-08-19T15:55:51.0734807Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-19T15:55:51.0734873Z 
2026-08-19T15:55:51.0735089Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:55:51.0735366Z 
2026-08-19T15:55:51.0735479Z     angular:styles/global:styles:1:8:
2026-08-19T15:55:51.0735696Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:55:51.0736025Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:55:51.0736075Z 
2026-08-19T15:55:51.0736145Z 
2026-08-19T15:55:51.0736339Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:55:51.0736450Z 
2026-08-19T15:55:51.0736557Z     node_modules/bootstrap/scss/_functions.scss:37:10:
2026-08-19T15:55:51.0736792Z [37m      37 │   @return [32m[37mred($value), green($value), blue($value);
2026-08-19T15:55:51.0736996Z          ╵           [32m^[0m
2026-08-19T15:55:51.0737047Z 
2026-08-19T15:55:51.0737140Z 
2026-08-19T15:55:51.0737235Z   red() is deprecated. Suggestion:
2026-08-19T15:55:51.0737362Z   
2026-08-19T15:55:51.0737493Z   color.channel($color, "red", $space: rgb)
2026-08-19T15:55:51.0737621Z   
2026-08-19T15:55:51.0737872Z   More info: [4mhttps://sass-lang.com/d/color-functions[0m
2026-08-19T15:55:51.0737938Z 
2026-08-19T15:55:51.0738217Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:55:51.0738274Z 
2026-08-19T15:55:51.0738418Z     angular:styles/global:styles:1:8:
2026-08-19T15:55:51.0738648Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:55:51.0738809Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:55:51.0738892Z 
2026-08-19T15:55:51.0738922Z 
2026-08-19T15:55:51.0739146Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:55:51.0739219Z 
2026-08-19T15:55:51.0739393Z     node_modules/bootstrap/scss/_functions.scss:37:23:
2026-08-19T15:55:51.0740884Z [37m      37 │   @return red($value), [32m[37mgreen($value), blue($value);
2026-08-19T15:55:51.0741251Z          ╵                        [32m^[0m
2026-08-19T15:55:51.0741312Z 
2026-08-19T15:55:51.0741358Z 
2026-08-19T15:55:51.0741591Z   green() is deprecated. Suggestion:
2026-08-19T15:55:51.0741793Z   
2026-08-19T15:55:51.0742086Z   color.channel($color, "green", $space: rgb)
2026-08-19T15:55:51.0742224Z   
2026-08-19T15:55:51.0742536Z   More info: [4mhttps://sass-lang.com/d/color-functions[0m
2026-08-19T15:55:51.0742665Z 
2026-08-19T15:55:51.0742895Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:55:51.0743026Z 
2026-08-19T15:55:51.0743198Z     angular:styles/global:styles:1:8:
2026-08-19T15:55:51.0743511Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:55:51.0743755Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:55:51.0743805Z 
2026-08-19T15:55:51.0743885Z 
2026-08-19T15:55:51.0744078Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:55:51.0744206Z 
2026-08-19T15:55:51.0744380Z     node_modules/bootstrap/scss/_functions.scss:185:9:
2026-08-19T15:55:51.0744683Z [37m      185 │     "r": [32m[37mred($color),
2026-08-19T15:55:51.0744867Z           ╵          [32m^[0m
2026-08-19T15:55:51.0744951Z 
2026-08-19T15:55:51.0744984Z 
2026-08-19T15:55:51.0745112Z   red() is deprecated. Suggestion:
2026-08-19T15:55:51.0745203Z   
2026-08-19T15:55:51.0745335Z   color.channel($color, "red", $space: rgb)
2026-08-19T15:55:51.0745477Z   
2026-08-19T15:55:51.0745669Z   More info: [4mhttps://sass-lang.com/d/color-functions[0m
2026-08-19T15:55:51.0745728Z 
2026-08-19T15:55:51.0745920Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:55:51.0745976Z 
2026-08-19T15:55:51.0746141Z     angular:styles/global:styles:1:8:
2026-08-19T15:55:51.0746349Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:55:51.0746542Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:55:51.0746712Z 
2026-08-19T15:55:51.0746741Z 
2026-08-19T15:55:51.0746966Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:55:51.0747039Z 
2026-08-19T15:55:51.0747194Z     node_modules/bootstrap/scss/_functions.scss:186:9:
2026-08-19T15:55:51.0747403Z [37m      186 │     "g": [32m[37mgreen($color),
2026-08-19T15:55:51.0747582Z           ╵          [32m^[0m
2026-08-19T15:55:51.0747623Z 
2026-08-19T15:55:51.0747652Z 
2026-08-19T15:55:51.0747782Z   green() is deprecated. Suggestion:
2026-08-19T15:55:51.0747935Z   
2026-08-19T15:55:51.0748106Z   color.channel($color, "green", $space: rgb)
2026-08-19T15:55:51.0748232Z   
2026-08-19T15:55:51.0748391Z   More info: [4mhttps://sass-lang.com/d/color-functions[0m
2026-08-19T15:55:51.0748485Z 
2026-08-19T15:55:51.0748639Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:55:51.0748744Z 
2026-08-19T15:55:51.0748869Z     angular:styles/global:styles:1:8:
2026-08-19T15:55:51.0749050Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:55:51.0749245Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:55:51.0749290Z 
2026-08-19T15:55:51.0749361Z 
2026-08-19T15:55:51.0749610Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:55:51.0749685Z 
2026-08-19T15:55:51.0749827Z     node_modules/bootstrap/scss/_functions.scss:187:9:
2026-08-19T15:55:51.0750004Z [37m      187 │     "b": [32m[37mblue($color)
2026-08-19T15:55:51.0750178Z           ╵          [32m^[0m
2026-08-19T15:55:51.0750264Z 
2026-08-19T15:55:51.0750294Z 
2026-08-19T15:55:51.0750424Z   blue() is deprecated. Suggestion:
2026-08-19T15:55:51.0750516Z   
2026-08-19T15:55:51.0750670Z   color.channel($color, "blue", $space: rgb)
2026-08-19T15:55:51.0750799Z   
2026-08-19T15:55:51.0750996Z   More info: [4mhttps://sass-lang.com/d/color-functions[0m
2026-08-19T15:55:51.0751055Z 
2026-08-19T15:55:51.0751266Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:55:51.0751401Z 
2026-08-19T15:55:51.0751538Z     angular:styles/global:styles:1:8:
2026-08-19T15:55:51.0751755Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:55:51.0751946Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:55:51.0751993Z 
2026-08-19T15:55:51.0752023Z 
2026-08-19T15:55:51.0752246Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:55:51.0752317Z 
2026-08-19T15:55:51.0752454Z     node_modules/bootstrap/scss/_functions.scss:207:10:
2026-08-19T15:55:51.0752672Z [37m      207 │   @return [32m[37mmix(white, $color, $weight);
2026-08-19T15:55:51.0752855Z           ╵           [32m^[0m
2026-08-19T15:55:51.0752897Z 
2026-08-19T15:55:51.0752927Z 
2026-08-19T15:55:51.0753158Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-19T15:55:51.0753314Z   Use color.mix instead.
2026-08-19T15:55:51.0753443Z   
2026-08-19T15:55:51.0753655Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-19T15:55:51.0753721Z 
2026-08-19T15:55:51.0753902Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:55:51.0753956Z 
2026-08-19T15:55:51.0754085Z     angular:styles/global:styles:1:8:
2026-08-19T15:55:51.0754287Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:55:51.0754442Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:55:51.0754603Z 
2026-08-19T15:55:51.0754634Z 
2026-08-19T15:55:51.0754922Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:55:51.0754993Z 
2026-08-19T15:55:51.0755153Z     node_modules/bootstrap/scss/_functions.scss:212:10:
2026-08-19T15:55:51.0755373Z [37m      212 │   @return [32m[37mmix(black, $color, $weight);
2026-08-19T15:55:51.0755551Z           ╵           [32m^[0m
2026-08-19T15:55:51.0755593Z 
2026-08-19T15:55:51.0755623Z 
2026-08-19T15:55:51.0755834Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-19T15:55:51.0756045Z   Use color.mix instead.
2026-08-19T15:55:51.0756163Z   
2026-08-19T15:55:51.0756337Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-19T15:55:51.0756433Z 
2026-08-19T15:55:51.0756657Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:55:51.0756715Z 
2026-08-19T15:55:51.0756847Z     angular:styles/global:styles:1:8:
2026-08-19T15:55:51.0757019Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:55:51.0757211Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:55:51.0757294Z 
2026-08-19T15:55:51.0757324Z 
2026-08-19T15:55:51.0757557Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:55:51.0757631Z 
2026-08-19T15:55:51.0757769Z     node_modules/bootstrap/scss/_variables.scss:342:26:
2026-08-19T15:55:51.0758005Z [37m      342 │ $light-bg-subtle:         [32m[37mmix($gray-100, $white) !default;
2026-08-19T15:55:51.0758183Z           ╵                           [32m^[0m
2026-08-19T15:55:51.0758259Z 
2026-08-19T15:55:51.0758289Z 
2026-08-19T15:55:51.0758529Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-19T15:55:51.0758682Z   Use color.mix instead.
2026-08-19T15:55:51.0758800Z   
2026-08-19T15:55:51.0758976Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-19T15:55:51.0759073Z 
2026-08-19T15:55:51.0759226Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:55:51.0759319Z 
2026-08-19T15:55:51.0759445Z     angular:styles/global:styles:1:8:
2026-08-19T15:55:51.0759616Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:55:51.0759805Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:55:51.0759852Z 
2026-08-19T15:55:51.0759925Z 
2026-08-19T15:55:51.0760162Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:55:51.0760288Z 
2026-08-19T15:55:51.0760427Z     node_modules/bootstrap/scss/bootstrap.scss:1:8:
2026-08-19T15:55:51.0760604Z [37m      1 │ @import [32m[37m"mixins/banner";
2026-08-19T15:55:51.0760776Z         ╵         [32m^[0m
2026-08-19T15:55:51.0760851Z 
2026-08-19T15:55:51.0760882Z 
2026-08-19T15:55:51.0761019Z   Sass @import rules are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-19T15:55:51.0761126Z   
2026-08-19T15:55:51.0761334Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-19T15:55:51.0761442Z 
2026-08-19T15:55:51.0761594Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:55:51.0761736Z 
2026-08-19T15:55:51.0761885Z     angular:styles/global:styles:1:8:
2026-08-19T15:55:51.0762057Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:55:51.0762334Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:55:51.0762406Z 
2026-08-19T15:55:51.0762501Z 
2026-08-19T15:55:51.0762820Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:55:51.0762941Z 
2026-08-19T15:55:51.0763195Z     node_modules/bootstrap/scss/bootstrap.scss:7:8:
2026-08-19T15:55:51.0763384Z [37m      7 │ @import [32m[37m"functions";
2026-08-19T15:55:51.0763561Z         ╵         [32m^[0m
2026-08-19T15:55:51.0763657Z 
2026-08-19T15:55:51.0763687Z 
2026-08-19T15:55:51.0763838Z   Sass @import rules are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-19T15:55:51.0763992Z   
2026-08-19T15:55:51.0764335Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-19T15:55:51.0764437Z 
2026-08-19T15:55:51.0764673Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:55:51.0764781Z 
2026-08-19T15:55:51.0764940Z     angular:styles/global:styles:1:8:
2026-08-19T15:55:51.0765241Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:55:51.0765445Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:55:51.0765493Z 
2026-08-19T15:55:51.0765662Z 
2026-08-19T15:55:51.0765901Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:55:51.0766007Z 
2026-08-19T15:55:51.0766312Z     node_modules/sidsc-components/styles/material-icons/_core.scss:4:10:
2026-08-19T15:55:51.0766602Z [37m      4 │   $index: [32m[37mstr-index($string, $search);
2026-08-19T15:55:51.0766904Z         ╵           [32m^[0m
2026-08-19T15:55:51.0766997Z 
2026-08-19T15:55:51.0767029Z 
2026-08-19T15:55:51.0767244Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-19T15:55:51.0767400Z   Use string.index instead.
2026-08-19T15:55:51.0767491Z   
2026-08-19T15:55:51.0767716Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-19T15:55:51.0767777Z 
2026-08-19T15:55:51.0767967Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:55:51.0768056Z 
2026-08-19T15:55:51.0768156Z     angular:styles/global:styles:2:8:
2026-08-19T15:55:51.0768401Z [37m      2 │ @import [32m'./node_modules/sidsc-components/styles/main.scss'[37m;
2026-08-19T15:55:51.0768660Z         ╵         [32m~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:55:51.0768719Z 
2026-08-19T15:55:51.0768785Z 
2026-08-19T15:55:51.0768972Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:55:51.0769081Z 
2026-08-19T15:55:51.0769280Z     node_modules/sidsc-components/styles/material-icons/_core.scss:6:12:
2026-08-19T15:55:51.0769485Z [37m      6 │     @return [32m[37mstr-slice($string, 1, $index - 1) + $replace +
2026-08-19T15:55:51.0769686Z         ╵             [32m^[0m
2026-08-19T15:55:51.0769727Z 
2026-08-19T15:55:51.0769793Z 
2026-08-19T15:55:51.0770038Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-19T15:55:51.0770162Z   Use string.slice instead.
2026-08-19T15:55:51.0770329Z   
2026-08-19T15:55:51.0770606Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-19T15:55:51.0770741Z 
2026-08-19T15:55:51.0770935Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:55:51.0770992Z 
2026-08-19T15:55:51.0771125Z     angular:styles/global:styles:2:8:
2026-08-19T15:55:51.0771374Z [37m      2 │ @import [32m'./node_modules/sidsc-components/styles/main.scss'[37m;
2026-08-19T15:55:51.0771612Z         ╵         [32m~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:55:51.0771672Z 
2026-08-19T15:55:51.0771701Z 
2026-08-19T15:55:51.0771925Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:55:51.0772032Z 
2026-08-19T15:55:51.0772198Z     node_modules/sidsc-components/styles/material-icons/_core.scss:8:8:
2026-08-19T15:55:51.0772436Z [37m      8 │         [32m[37mstr-slice($string, $index + str-length($search)),
2026-08-19T15:55:51.0772641Z         ╵         [32m^[0m
2026-08-19T15:55:51.0772682Z 
2026-08-19T15:55:51.0772756Z 
2026-08-19T15:55:51.0772926Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-19T15:55:51.0773094Z   Use string.slice instead.
2026-08-19T15:55:51.0773215Z   
2026-08-19T15:55:51.0773414Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-19T15:55:51.0773476Z 
2026-08-19T15:55:51.0773658Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:55:51.0773714Z 
2026-08-19T15:55:51.0773844Z     angular:styles/global:styles:2:8:
2026-08-19T15:55:51.0774075Z [37m      2 │ @import [32m'./node_modules/sidsc-components/styles/main.scss'[37m;
2026-08-19T15:55:51.0774319Z         ╵         [32m~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:55:51.0774381Z 
2026-08-19T15:55:51.0774410Z 
2026-08-19T15:55:51.0774707Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:55:51.0774839Z 
2026-08-19T15:55:51.0775024Z     node_modules/sidsc-components/styles/material-icons/_core.scss:8:36:
2026-08-19T15:55:51.0775315Z [37m      8 │         str-slice($string, $index + [32m[37mstr-length($search)),
2026-08-19T15:55:51.0775528Z         ╵                                     [32m^[0m
2026-08-19T15:55:51.0775570Z 
2026-08-19T15:55:51.0775632Z 
2026-08-19T15:55:51.0775804Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-19T15:55:51.0775960Z   Use string.length instead.
2026-08-19T15:55:51.0776081Z   
2026-08-19T15:55:51.0776299Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-19T15:55:51.0776361Z 
2026-08-19T15:55:51.0776558Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:55:51.0776615Z 
2026-08-19T15:55:51.0776750Z     angular:styles/global:styles:2:8:
2026-08-19T15:55:51.0776980Z [37m      2 │ @import [32m'./node_modules/sidsc-components/styles/main.scss'[37m;
2026-08-19T15:55:51.0777251Z         ╵         [32m~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:55:51.0777323Z 
2026-08-19T15:55:51.0777352Z 
2026-08-19T15:55:51.0777578Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:55:51.0777650Z 
2026-08-19T15:55:51.0777860Z     node_modules/sidsc-components/styles/material-icons/_core.scss:17:15:
2026-08-19T15:55:51.0778087Z [37m      17 │   $class-name: [32m[37mto-lower-case($font-family);
2026-08-19T15:55:51.0778309Z          ╵                [32m^[0m
2026-08-19T15:55:51.0778352Z 
2026-08-19T15:55:51.0778382Z 
2026-08-19T15:55:51.0778588Z   Global built-in functions are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-19T15:55:51.0778792Z   Use string.to-lower-case instead.
2026-08-19T15:55:51.0778918Z   
2026-08-19T15:55:51.0779120Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-19T15:55:51.0779183Z 
2026-08-19T15:55:51.0779374Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:55:51.0779483Z 
2026-08-19T15:55:51.0779615Z     angular:styles/global:styles:2:8:
2026-08-19T15:55:51.0779857Z [37m      2 │ @import [32m'./node_modules/sidsc-components/styles/main.scss'[37m;
2026-08-19T15:55:51.0780956Z         ╵         [32m~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:55:51.0781026Z 
2026-08-19T15:55:51.0781056Z 
2026-08-19T15:55:51.0781279Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:55:51.0781351Z 
2026-08-19T15:55:51.0781477Z     src/styles.scss:5:8:
2026-08-19T15:55:51.0781694Z [37m      5 │ @import [32m[37m"../node_modules/bootstrap/scss/bootstrap.scss";
2026-08-19T15:55:51.0781877Z         ╵         [32m^[0m
2026-08-19T15:55:51.0781920Z 
2026-08-19T15:55:51.0781949Z 
2026-08-19T15:55:51.0782118Z   Sass @import rules are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-19T15:55:51.0782326Z   
2026-08-19T15:55:51.0782604Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-19T15:55:51.0782680Z 
2026-08-19T15:55:51.0782918Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:55:51.0782974Z 
2026-08-19T15:55:51.0783107Z     angular:styles/global:styles:1:8:
2026-08-19T15:55:51.0783307Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:55:51.0783499Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:55:51.0783548Z 
2026-08-19T15:55:51.0783577Z 
2026-08-19T15:55:51.0783795Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:55:51.0783867Z 
2026-08-19T15:55:51.0783988Z     src/styles.scss:8:8:
2026-08-19T15:55:51.0784197Z [37m      8 │ @import [32m[37m"../public/fonts/fonts.scss";
2026-08-19T15:55:51.0784371Z         ╵         [32m^[0m
2026-08-19T15:55:51.0784412Z 
2026-08-19T15:55:51.0784442Z 
2026-08-19T15:55:51.0784673Z   Sass @import rules are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-19T15:55:51.0784814Z   
2026-08-19T15:55:51.0785102Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-19T15:55:51.0785164Z 
2026-08-19T15:55:51.0785390Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:55:51.0785447Z 
2026-08-19T15:55:51.0785579Z     angular:styles/global:styles:1:8:
2026-08-19T15:55:51.0785808Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:55:51.0785998Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:55:51.0786047Z 
2026-08-19T15:55:51.0786077Z 
2026-08-19T15:55:51.0786300Z [33m▲ [43;33m[[43;30mWARNING[43;33m][0m [1mDeprecation[0m [1m[35m[plugin angular-sass][0m
2026-08-19T15:55:51.0786380Z 
2026-08-19T15:55:51.0786588Z     src/styles.scss:9:8:
2026-08-19T15:55:51.0786868Z [37m      9 │ @import [32m[37m"../public/fonts/fonts-icons.scss";
2026-08-19T15:55:51.0787109Z         ╵         [32m^[0m
2026-08-19T15:55:51.0787177Z 
2026-08-19T15:55:51.0787216Z 
2026-08-19T15:55:51.0787413Z   Sass @import rules are deprecated and will be removed in Dart Sass 3.0.0.
2026-08-19T15:55:51.0787620Z   
2026-08-19T15:55:51.0787910Z   More info and automated migrator: [4mhttps://sass-lang.com/d/import[0m
2026-08-19T15:55:51.0788002Z 
2026-08-19T15:55:51.0788286Z   The plugin "angular-sass" was triggered by this import
2026-08-19T15:55:51.0788377Z 
2026-08-19T15:55:51.0788575Z     angular:styles/global:styles:1:8:
2026-08-19T15:55:51.0788881Z [37m      1 │ @import [32m'src/styles.scss'[37m;
2026-08-19T15:55:51.0789118Z         ╵         [32m~~~~~~~~~~~~~~~~~[0m
2026-08-19T15:55:51.0789227Z 
2026-08-19T15:55:51.0789268Z 
2026-08-19T15:55:51.0789630Z [31m✘ [41;31m[[41;97mERROR[41;31m][0m [1mCannot destructure property 'pos' of 'file.referencedFiles[index]' as it is undefined.[0m [1m[35m[plugin angular-compiler][0m
2026-08-19T15:55:51.0789739Z 
2026-08-19T15:55:51.0789884Z     node_modules/typescript/lib/typescript.js:125702:9:
2026-08-19T15:55:51.0790194Z [37m      125702 │       ({ [32m[37mpos, end } = file.referencedFiles[index]);
2026-08-19T15:55:51.0790542Z              ╵          [32m^[0m
2026-08-19T15:55:51.0790587Z 
2026-08-19T15:55:51.0790838Z     at getReferencedFileLocation (/opt/ads-agent/_work/17/s/node_modules/typescript/lib/typescript.js:125702:10)
2026-08-19T15:55:51.0791142Z     at fileIncludeReasonToDiagnostics (/opt/ads-agent/_work/17/s/node_modules/typescript/lib/typescript.js:132571:31)
2026-08-19T15:55:51.0791459Z     at processReason (/opt/ads-agent/_work/17/s/node_modules/typescript/lib/typescript.js:129136:62)
2026-08-19T15:55:51.0791597Z     at Array.forEach (<anonymous>)
2026-08-19T15:55:51.0791860Z     at createDiagnosticExplainingFile (/opt/ads-agent/_work/17/s/node_modules/typescript/lib/typescript.js:129088:42)
2026-08-19T15:55:51.0792132Z     at /opt/ads-agent/_work/17/s/node_modules/typescript/lib/typescript.js:129021:15
2026-08-19T15:55:51.0792313Z     at Array.forEach (<anonymous>)
2026-08-19T15:55:51.0792572Z     at Object.getCombinedDiagnostics (/opt/ads-agent/_work/17/s/node_modules/typescript/lib/typescript.js:129017:78)
2026-08-19T15:55:51.0792873Z     at getProgramDiagnostics (/opt/ads-agent/_work/17/s/node_modules/typescript/lib/typescript.js:126966:57)
2026-08-19T15:55:51.0793136Z     at getSemanticDiagnosticsForFile (/opt/ads-agent/_work/17/s/node_modules/typescript/lib/typescript.js:126997:7)
2026-08-19T15:55:51.0793258Z 
2026-08-19T15:55:51.0793393Z   This error came from the "onStart" callback registered here:
2026-08-19T15:55:51.0793454Z 
2026-08-19T15:55:51.0793693Z     node_modules/@angular/build/src/tools/esbuild/angular/compiler-plugin.js:118:18:
2026-08-19T15:55:51.0793894Z [37m      118 │             build.[32monStart[37m(async () => {
2026-08-19T15:55:51.0794092Z           ╵                   [32m~~~~~~~[0m
2026-08-19T15:55:51.0794211Z 
2026-08-19T15:55:51.0794422Z     at setup (/opt/ads-agent/_work/17/s/node_modules/@angular/build/src/tools/esbuild/angular/compiler-plugin.js:118:19)
2026-08-19T15:55:51.0794800Z     at async handlePlugins (/opt/ads-agent/_work/17/s/node_modules/esbuild/lib/main.js:1181:20)
2026-08-19T15:55:51.0794976Z 
2026-08-19T15:55:51.0795007Z 
2026-08-19T15:55:51.3494127Z ##[error]Bash exited with code '1'.
2026-08-19T15:55:51.3506367Z ##[section]Finishing: Build Application
