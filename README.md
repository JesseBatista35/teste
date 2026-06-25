updated 1 package in 7.746s

125 packages are looking for funding
  run `npm fund` for details


Rodando testes unitários...

> sinep-app-web@1.19.0-snapshot test /opt/ads-agent/_work/9988/s
> ng test

25 06 2026 10:29:51.202:WARN [karma-server]: Passing raw CLI options to `new Server(config, done)` is deprecated. Use `parseConfig(configFilePath, cliOptions, {promiseConfig: true, throwErrors: true})` to prepare a processed `Config` instance and pass that as the `config` argument instead.
25 06 2026 10:30:08.949:WARN [filelist]: All files matched by "/opt/ads-agent/_work/9988/s/src/assets/svg/icons/**" were excluded or matched by prior matchers.
(node:28442) MaxListenersExceededWarning: Possible EventEmitter memory leak detected. 11 run_complete listeners added. Use emitter.setMaxListeners() to increase limit
25 06 2026 10:30:43.679:WARN [filelist]: All files matched by "/opt/ads-agent/_work/9988/s/src/assets/svg/icons/**" were excluded or matched by prior matchers.
25 06 2026 10:30:43.733:INFO [karma-server]: Karma v6.4.4 server started at http://localhost:9876/
25 06 2026 10:30:43.733:INFO [launcher]: Launching browsers ChromeHeadlessCI with concurrency unlimited
25 06 2026 10:30:43.743:INFO [launcher]: Starting browser ChromeHeadless
25 06 2026 10:30:43.743:ERROR [launcher]: No binary for ChromeHeadless browser on your platform.
  Please, set "CHROME_BIN" env variable.



(node:28442) UnhandledPromiseRejectionWarning: TypeError: Promise.allSettled is not a function
    at Server.close (/opt/ads-agent/_work/9988/s/node_modules/socket.io/dist/index.js:484:23)
    at emitExitAsync.catch.then (/opt/ads-agent/_work/9988/s/node_modules/karma/lib/server.js:458:20)
    at process._tickCallback (internal/process/next_tick.js:68:7)
(node:28442) UnhandledPromiseRejectionWarning: Unhandled promise rejection. This error originated either by throwing inside of an async function without a catch block, or by rejecting a promise which was not handled with .catch(). (rejection id: 2)
(node:28442) [DEP0018] DeprecationWarning: Unhandled promise rejections are deprecated. In the future, promise rejections that are not handled will terminate the Node.js process with a non-zero exit code.
(node:28442) UnhandledPromiseRejectionWarning: TypeError: Promise.allSettled is not a function
    at Server.close (/opt/ads-agent/_work/9988/s/node_modules/socket.io/dist/index.js:484:23)
    at emitExitAsync.catch.then (/opt/ads-agent/_work/9988/s/node_modules/karma/lib/server.js:458:20)
    at process._tickCallback (internal/process/next_tick.js:68:7)
(node:28442) UnhandledPromiseRejectionWarning: Unhandled promise rejection. This error originated either by throwing inside of an async function without a catch block, or by rejecting a promise which was not handled with .catch(). (rejection id: 3)
npm ERR! Test failed.  See above for more details.
##[error]Bash exited with code '1'.
Finishing: Bash Script
