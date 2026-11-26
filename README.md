
⎯⎯⎯⎯⎯⎯ Failed Suites 1 ⎯⎯⎯⎯⎯⎯⎯

 FAIL  |sdsc| spec-lib-components-loading-animation-loading-animation.spec.js [ dist/test-out/20261126T191614366Z-e3386482/spec-lib-components-loading-animation-loading-animation.spec.js ]
TypeError: Cannot set properties of null (setting 'fillStyle')
 ❯ node_modules/lottie-web/build/player/lottie.js:1119:11
 ❯ node_modules/lottie-web/build/player/lottie.js:1122:5
 ❯ node_modules/lottie-web/build/player/lottie.js:1301:3
 ❯ node_modules/lottie-web/build/player/lottie.js:2:83
 ❯ node_modules/lottie-web/build/player/lottie.js node_modules/lottie-web/build/player/lottie.js:5:1
 ❯ __require chunk-URBOPOOJ.js:287:52
    285|   "node_modules/rxjs/dist/esm/internal/util/isArrayLike.js"() {
    286|     "use strict";
    287|     isArrayLike = ((x) => x && typeof x.length === "number" && typeof …
       |                                                    ^
    288|   }
    289| });
 ❯ projects/sdsc/src/lib/components/loading-animation/loading-animation.ts projects/sdsc/src/lib/components/loading-animation/loading-animation.ts:9:44
 ❯ __init chunk-URBOPOOJ.js:280:61
 ❯ projects/sdsc/src/lib/components/loading-animation/loading-animation.spec.ts projects/sdsc/src/lib/components/loading-animation/loading-animation.spec.ts:3:1
 ❯ __require chunk-URBOPOOJ.js:287:52

⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯[1/1]⎯


 Test Files  1 failed | 64 passed (65)
      Tests  892 passed | 15 skipped (907)
   Start at  16:16:25
   Duration  20.77s (transform 8.27s, setup 29.38s, collect 16.79s, tests 32.04s, environment 41.82s, prepare 6.77s)

##[debug]Exit code 1 received from tool '/bin/bash'
##[debug]STDIO streams have closed for tool '/bin/bash'
##[error]Bash exited with code '1'.
##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '1'.
##[debug]task result: Failed
##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
Finishing: Build Application
