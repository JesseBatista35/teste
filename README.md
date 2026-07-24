Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/bin/bash /opt/ads-agent/_work/_temp/53e8adde-fa4c-4ccf-90fc-21e0ddddf828.sh
ng build --prod --configuration=production --outputPath=dist
<----ANGULAR---->
ENOENT: no such file or directory, scandir '/opt/ads-agent/_work/341/s/web/node_modules'
Error: ENOENT: no such file or directory, scandir '/opt/ads-agent/_work/341/s/web/node_modules'
    at Object.readdirSync (fs.js:790:3)
    at VersionCommand.run (/usr/local/lib/node/nodejs/lib/node_modules/@angular/cli/commands/version-impl.js:48:41)
    at VersionCommand.validateAndRun (/usr/local/lib/node/nodejs/lib/node_modules/@angular/cli/models/command.js:124:31)
    at process._tickCallback (internal/process/next_tick.js:68:7)
    at Function.Module.runMain (internal/modules/cjs/loader.js:834:11)
    at findNodeScript.then.existing (/opt/ads-agent/_work/_tool/node/10.24.1/x64/lib/node_modules/npm/node_modules/libnpx/index.js:268:14)
Schema validation failed with the following errors:
  Data path ".builders['app-shell']" should have required property 'class'.
Error: Schema validation failed with the following errors:
  Data path ".builders['app-shell']" should have required property 'class'.
    at MergeMapSubscriber._registry.compile.pipe.operators_1.concatMap.validatorResult [as project] (/usr/local/lib/node/nodejs/lib/node_modules/@angular/cli/node_modules/@angular-devkit/core/src/workspace/workspace.js:215:42)
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
