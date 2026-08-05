    Generating script.
    ========================== Starting Command Output ===========================
    /usr/bin/bash /opt/ads-agent/_work/_temp/1ff5c054-79d9-433f-9257-9190364e78b5.sh
    ng build --configuration production --build-optimizer --aot --output-path=dist && npm test
    <----ANGULAR---->

         _                      _                 ____ _     ___
    ... animations, cli, common, compiler, compiler-cli, core, forms
    ... platform-browser, platform-browser-dynamic, router

    Package                         Version
    ---------------------------------------------------------
    @angular-devkit/architect       0.13.7 (cli-only)
    @angular-devkit/build-angular   <error>
    @angular-devkit/core            7.3.7 (cli-only)
    @angular-devkit/schematics      7.3.7 (cli-only)
    @schematics/angular             7.3.7 (cli-only)
    @schematics/update              0.13.7 (cli-only)
    rxjs                            6.3.3 (cli-only)
    typescript                      <error>
        
    Schema validation failed with the following errors:
      Data path ".builders['app-shell']" should have required property 'class'.
    Error: Schema validation failed with the following errors:
      Data path ".builders['app-shell']" should have required property 'class'.
        at MergeMapSubscriber.project (/usr/local/lib/node/nodejs/lib/node_modules/@angular/cli/node_modules/@angular-devkit/core/src/workspace/workspace.js:215:42)
        at MergeMapSubscriber._tryNext (/usr/local/lib/node/nodejs/lib/node_modules/@angular/cli/node_modules/rxjs/internal/operators/mergeMap.js:69:27)
        at MergeMapSubscriber._next (/usr/local/lib/node/nodejs/lib/node_modules/@angular/cli/node_modules/rxjs/internal/operators/mergeMap.js:59:18)
        at MergeMapSubscriber.Subscriber.next (/usr/local/lib/node/nodejs/lib/node_modules/@angular/cli/node_modules/rxjs/internal/Subscriber.js:67:18)
        at MergeMapSubscriber.notifyNext (/usr/local/lib/node/nodejs/lib/node_modules/@angular/cli/node_modules/rxjs/internal/operators/mergeMap.js:92:26)
        at InnerSubscriber._next (/usr/local/lib/node/nodejs/lib/node_modules/@angular/cli/node_modules/rxjs/internal/InnerSubscriber.js:28:21)
        at InnerSubscriber.Subscriber.next (/usr/local/lib/node/nodejs/lib/node_modules/@angular/cli/node_modules/rxjs/internal/Subscriber.js:67:18)
        at MapSubscriber._next (/usr/local/lib/node/nodejs/lib/node_modules/@angular/cli/node_modules/rxjs/internal/operators/map.js:55:26)
        at MapSubscriber.Subscriber.next (/usr/local/lib/node/nodejs/lib/node_modules/@angular/cli/node_modules/rxjs/internal/Subscriber.js:67:18)
        at SwitchMapSubscriber.notifyNext (/usr/local/lib/node/nodejs/lib/node_modules/@angular/cli/node_modules/rxjs/internal/operators/switchMap.js:86:26)
        at InnerSubscriber._next (/usr/local/lib/node/nodejs/lib/node_modules/@angular/cli/node_modules/rxjs/internal/InnerSubscriber.js:28:21)
        at InnerSubscriber.Subscriber.next (/usr/local/lib/node/nodejs/lib/node_modules/@angular/cli/node_modules/rxjs/internal/Subscriber.js:67:18)
        at /usr/local/lib/node/nodejs/lib/node_modules/@angular/cli/node_modules/rxjs/internal/util/subscribeTo.js:17:28
        at Object.subscribeToResult (/usr/local/lib/node/nodejs/lib/node_modules/@angular/cli/node_modules/rxjs/internal/util/subscribeToResult.js:10:45)
        at SwitchMapSubscriber._innerSub (/usr/local/lib/node/nodejs/lib/node_modules/@angular/cli/node_modules/rxjs/internal/operators/switchMap.js:65:54)
        at SwitchMapSubscriber._next (/usr/local/lib/node/nodejs/lib/node_modules/@angular/cli/node_modules/rxjs/internal/operators/switchMap.js:55:14)
    ##[error]Bash exited with code '1'.
    Finishing: Build Application
