> siifx-web@1.0.0-snapshot test /opt/ads-agent/_work/115/s
> ng test --code-coverage

25 06 2026 15:14:28.488:WARN [karma-server]: Passing raw CLI options to `new Server(config, done)` is deprecated. Use `parseConfig(configFilePath, cliOptions, {promiseConfig: true, throwErrors: true})` to prepare a processed `Config` instance and pass that as the `config` argument instead.
25 06 2026 15:14:28.845:ERROR [config]: Error in config file!
 /opt/ads-agent/_work/115/s/node_modules/@so-ric/colorspace/dist/index.cjs.js:1976
		(limiters[m] ||= [])[channel] = modifier;
		             ^^^

SyntaxError: Unexpected token '||='
    at compileFunction (<anonymous>)
    at wrapSafe (internal/modules/cjs/loader.js:1001:16)
    at Module._compile (internal/modules/cjs/loader.js:1049:27)
    at Object.Module._extensions..js (internal/modules/cjs/loader.js:1114:10)
    at Module.load (internal/modules/cjs/loader.js:950:32)
    at Function.Module._load (internal/modules/cjs/loader.js:790:12)
    at Module.require (internal/modules/cjs/loader.js:974:19)
    at require (internal/modules/cjs/helpers.js:93:18)
    at Object.<anonymous> (/opt/ads-agent/_work/115/s/node_modules/@dabh/diagnostics/modifiers/namespace-ansi.js:1:18)
    at Module._compile (internal/modules/cjs/loader.js:1085:14)
    at Object.Module._extensions..js (internal/modules/cjs/loader.js:1114:10)
    at Module.load (internal/modules/cjs/loader.js:950:32)
    at Function.Module._load (internal/modules/cjs/loader.js:790:12)
    at Module.require (internal/modules/cjs/loader.js:974:19)
    at require (internal/modules/cjs/helpers.js:93:18)
    at Object.<anonymous> (/opt/ads-agent/_work/115/s/node_modules/@dabh/diagnostics/node/development.js:29:20)
npm ERR! Test failed.  See above for more details.
##[error]Bash exited with code '1'.
Finishing: Build Application
