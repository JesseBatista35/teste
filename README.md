Prezados, bom dia

Estou tendo problemas ao rodar a build pipeline do projeto SISOU-api-sac-internet com a tag 2.0.0.17 e 2.0.0.16
A etapa "Executando Build S2I Binary" está crashando. A build não termina.

Precisamos que esse problema seja resolvido de forma urgente visto que estamos impedidos de subir uma nova atualização ao ambiente de PRD.

Atenciosamente


2026-09-08T18:57:49.0907338Z ##[section]Starting: Executando Build S2I Binary
2026-09-08T18:57:49.0911735Z ==============================================================================
2026-09-08T18:57:49.0911882Z Task         : Bash
2026-09-08T18:57:49.0911969Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-08T18:57:49.0912084Z Version      : 3.227.0
2026-09-08T18:57:49.0912163Z Author       : Microsoft Corporation
2026-09-08T18:57:49.0912269Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-08T18:57:49.0912406Z ==============================================================================
2026-09-08T18:57:49.2392703Z Generating script.
2026-09-08T18:57:49.2410941Z ========================== Starting Command Output ===========================
2026-09-08T18:57:49.2419959Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/9f3aba99-239a-43e8-a228-bfe9e99af031.sh
2026-09-08T18:57:49.2490755Z + echo okd4_nprd
2026-09-08T18:57:49.2492814Z + egrep -q '^(okd4|ocp)'
2026-09-08T18:57:49.2527143Z + buildconfig=sisou-api-sac-internet
2026-09-08T18:57:49.2528343Z + DOTNET_ASSEMBLY=SISEI-csharp-batch.dll
2026-09-08T18:57:49.2528551Z + DOTNET_CONFIG=SISEI-csharp-batch.runtimeconfig.json
2026-09-08T18:57:49.2528734Z + cd /opt/ads-agent/_work/34/a
2026-09-08T18:57:49.2528935Z + FILES=(`find -maxdepth 1 -name "*.runtimeconfig*.json"`)
2026-09-08T18:57:49.2530710Z ++ find -maxdepth 1 -name '*.runtimeconfig*.json'
2026-09-08T18:57:49.2551446Z + for i in "${FILES[@]}"
2026-09-08T18:57:49.2552379Z + [[ SISOU-api-sac-internet.runtimeconfig.json != \S\I\S\E\I\-\c\s\h\a\r\p\-\b\a\t\c\h\.\r\u\n\t\i\m\e\c\o\n\f\i\g\.\j\s\o\n ]]
2026-09-08T18:57:49.2552695Z + echo 'Removendo: ./SISOU-api-sac-internet.runtimeconfig.json'
2026-09-08T18:57:49.2552918Z + rm ./SISOU-api-sac-internet.runtimeconfig.json
2026-09-08T18:57:49.2553650Z Removendo: ./SISOU-api-sac-internet.runtimeconfig.json
2026-09-08T18:57:49.4514744Z + for i in "${FILES[@]}"
2026-09-08T18:57:49.4515498Z + [[ UnitTests.runtimeconfig.json != \S\I\S\E\I\-\c\s\h\a\r\p\-\b\a\t\c\h\.\r\u\n\t\i\m\e\c\o\n\f\i\g\.\j\s\o\n ]]
2026-09-08T18:57:49.4515898Z + echo 'Removendo: ./UnitTests.runtimeconfig.json'
2026-09-08T18:57:49.4516139Z + rm ./UnitTests.runtimeconfig.json
2026-09-08T18:57:49.4516381Z Removendo: ./UnitTests.runtimeconfig.json
2026-09-08T18:57:49.4536410Z + '[' -d /opt/ads-agent/_work/34/s/target/server ']'
2026-09-08T18:57:49.4536823Z + '[' -d /opt/ads-agent/_work/34/s/ear/target/server ']'
2026-09-08T18:57:49.4537183Z + '[' -n '' ']'
2026-09-08T18:57:49.4537617Z + oc start-build sisou-api-sac-internet --from-dir=/opt/ads-agent/_work/34/a --follow --wait=true -n build-images-ads -v=5
2026-09-08T18:57:49.5502162Z I0908 15:57:49.549755   65052 repository.go:450] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
2026-09-08T18:57:49.5532375Z I0908 15:57:49.552948   65052 repository.go:533] Error executing command: exit status 128
2026-09-08T18:57:49.5532861Z Uploading directory "/opt/ads-agent/_work/34/a" as binary input for the build ...
2026-09-08T18:57:49.5533143Z I0908 15:57:49.553130   65052 tar.go:238] Adding "/opt/ads-agent/_work/34/a" to tar ...
2026-09-08T18:57:49.5536553Z I0908 15:57:49.553576   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/.sqAnalysis as .sqAnalysis
2026-09-08T18:57:49.5542977Z I0908 15:57:49.554198   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/.sqAnalysis/SonarQubeBuildSummary.md as .sqAnalysis/SonarQubeBuildSummary.md
2026-09-08T18:57:49.5545432Z I0908 15:57:49.554433   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Azure.Core.dll as Azure.Core.dll
2026-09-08T18:57:49.5745686Z I0908 15:57:49.574120   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Azure.Identity.dll as Azure.Identity.dll
2026-09-08T18:57:49.5883995Z I0908 15:57:49.588079   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Castle.Core.dll as Castle.Core.dll
2026-09-08T18:57:49.6081037Z I0908 15:57:49.607804   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage as CodeCoverage
2026-09-08T18:57:49.6098454Z I0908 15:57:49.609724   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/CodeCoverage.config as CodeCoverage/CodeCoverage.config
2026-09-08T18:57:49.6099930Z I0908 15:57:49.609912   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/CodeCoverage.exe as CodeCoverage/CodeCoverage.exe
2026-09-08T18:57:54.3139324Z I0908 15:57:54.313561   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/VanguardInstrumentationProfiler_x86.config as CodeCoverage/VanguardInstrumentationProfiler_x86.config
2026-09-08T18:57:54.3139760Z I0908 15:57:54.313715   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/amd64 as CodeCoverage/amd64
2026-09-08T18:57:54.3140137Z I0908 15:57:54.313763   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/amd64/CodeCoverage.exe as CodeCoverage/amd64/CodeCoverage.exe
2026-09-08T18:57:54.3563941Z I0908 15:57:54.356080   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/amd64/VanguardInstrumentationProfiler_x64.config as CodeCoverage/amd64/VanguardInstrumentationProfiler_x64.config
2026-09-08T18:57:54.3574610Z I0908 15:57:54.357286   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/amd64/covrun64.dll as CodeCoverage/amd64/covrun64.dll
2026-09-08T18:57:54.4168932Z I0908 15:57:54.416508   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/amd64/msdia140.dll as CodeCoverage/amd64/msdia140.dll
2026-09-08T18:57:54.4989240Z I0908 15:57:54.498559   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/arm64 as CodeCoverage/arm64
2026-09-08T18:57:54.4989856Z I0908 15:57:54.498876   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/arm64/VanguardInstrumentationProfiler_arm64.config as CodeCoverage/arm64/VanguardInstrumentationProfiler_arm64.config
2026-09-08T18:57:54.4990268Z I0908 15:57:54.498940   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/arm64/covrunarm64.dll as CodeCoverage/arm64/covrunarm64.dll
2026-09-08T18:57:54.5338690Z I0908 15:57:54.533546   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/arm64/msdia140.dll as CodeCoverage/arm64/msdia140.dll
2026-09-08T18:57:54.6635909Z .I0908 15:57:54.663225   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/codecoveragemessages.dll as CodeCoverage/codecoveragemessages.dll
2026-09-08T18:57:54.6651235Z I0908 15:57:54.665006   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/coreclr as CodeCoverage/coreclr
2026-09-08T18:57:54.6652436Z I0908 15:57:54.665158   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/coreclr/Microsoft.VisualStudio.CodeCoverage.Shim.dll as CodeCoverage/coreclr/Microsoft.VisualStudio.CodeCoverage.Shim.dll
2026-09-08T18:57:54.6654115Z I0908 15:57:54.665305   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/covrun32.dll as CodeCoverage/covrun32.dll
2026-09-08T18:57:54.7135977Z I0908 15:57:54.713236   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/msdia140.dll as CodeCoverage/msdia140.dll
2026-09-08T18:57:54.7783029Z I0908 15:57:54.777918   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/DotNetEnv.dll as DotNetEnv.dll
2026-09-08T18:57:54.7798328Z I0908 15:57:54.779635   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/FluentValidation.AspNetCore.dll as FluentValidation.AspNetCore.dll
2026-09-08T18:57:54.7833494Z I0908 15:57:54.783193   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/FluentValidation.DependencyInjectionExtensions.dll as FluentValidation.DependencyInjectionExtensions.dll
2026-09-08T18:57:54.7833889Z I0908 15:57:54.783289   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/FluentValidation.dll as FluentValidation.dll
2026-09-08T18:57:54.7985548Z I0908 15:57:54.798331   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Humanizer.dll as Humanizer.dll
2026-09-08T18:57:54.8113911Z I0908 15:57:54.811135   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ICSharpCode.SharpZipLib.dll as ICSharpCode.SharpZipLib.dll
2026-09-08T18:57:54.8222185Z I0908 15:57:54.821991   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine as InstrumentationEngine
2026-09-08T18:57:54.8234199Z I0908 15:57:54.823334   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/alpine as InstrumentationEngine/alpine
2026-09-08T18:57:54.8234659Z I0908 15:57:54.823410   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/alpine/x64 as InstrumentationEngine/alpine/x64
2026-09-08T18:57:54.8235303Z I0908 15:57:54.823459   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/alpine/x64/VanguardInstrumentationProfiler_x64.config as InstrumentationEngine/alpine/x64/VanguardInstrumentationProfiler_x64.config
2026-09-08T18:57:54.8235885Z I0908 15:57:54.823517   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/alpine/x64/libCoverageInstrumentationMethod.so as InstrumentationEngine/alpine/x64/libCoverageInstrumentationMethod.so
2026-09-08T18:57:54.8245971Z I0908 15:57:54.824512   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/alpine/x64/libInstrumentationEngine.so as InstrumentationEngine/alpine/x64/libInstrumentationEngine.so
2026-09-08T18:57:54.8991969Z I0908 15:57:54.898861   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/arm64 as InstrumentationEngine/arm64
2026-09-08T18:57:54.8993629Z I0908 15:57:54.899270   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/arm64/MicrosoftInstrumentationEngine_arm64.dll as InstrumentationEngine/arm64/MicrosoftInstrumentationEngine_arm64.dll
2026-09-08T18:57:54.9491294Z I0908 15:57:54.948766   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/macos as InstrumentationEngine/macos
2026-09-08T18:57:54.9491863Z I0908 15:57:54.949064   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/macos/x64 as InstrumentationEngine/macos/x64
2026-09-08T18:57:54.9492520Z I0908 15:57:54.949120   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/macos/x64/VanguardInstrumentationProfiler_x64.config as InstrumentationEngine/macos/x64/VanguardInstrumentationProfiler_x64.config
2026-09-08T18:57:54.9493186Z I0908 15:57:54.949193   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/macos/x64/libCoverageInstrumentationMethod.dylib as InstrumentationEngine/macos/x64/libCoverageInstrumentationMethod.dylib
2026-09-08T18:57:54.9521133Z I0908 15:57:54.951952   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/macos/x64/libInstrumentationEngine.dylib as InstrumentationEngine/macos/x64/libInstrumentationEngine.dylib
2026-09-08T18:57:55.0249915Z I0908 15:57:55.022539   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/ubuntu as InstrumentationEngine/ubuntu
2026-09-08T18:57:55.0250388Z I0908 15:57:55.022644   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/ubuntu/x64 as InstrumentationEngine/ubuntu/x64
2026-09-08T18:57:55.0250825Z I0908 15:57:55.022703   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/ubuntu/x64/VanguardInstrumentationProfiler_x64.config as InstrumentationEngine/ubuntu/x64/VanguardInstrumentationProfiler_x64.config
2026-09-08T18:57:55.0251301Z I0908 15:57:55.022764   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/ubuntu/x64/libCoverageInstrumentationMethod.so as InstrumentationEngine/ubuntu/x64/libCoverageInstrumentationMethod.so
2026-09-08T18:57:55.0263553Z I0908 15:57:55.026131   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/ubuntu/x64/libInstrumentationEngine.so as InstrumentationEngine/ubuntu/x64/libInstrumentationEngine.so
2026-09-08T18:57:55.1062063Z I0908 15:57:55.105795   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/x64 as InstrumentationEngine/x64
2026-09-08T18:57:55.1063123Z I0908 15:57:55.106011   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/x64/MicrosoftInstrumentationEngine_x64.dll as InstrumentationEngine/x64/MicrosoftInstrumentationEngine_x64.dll
2026-09-08T18:57:55.1560024Z I0908 15:57:55.155683   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/x86 as InstrumentationEngine/x86
2026-09-08T18:57:55.1567806Z I0908 15:57:55.156625   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/x86/MicrosoftInstrumentationEngine_x86.dll as InstrumentationEngine/x86/MicrosoftInstrumentationEngine_x86.dll
2026-09-08T18:57:55.1980544Z I0908 15:57:55.197749   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.AspNetCore.Authentication.JwtBearer.dll as Microsoft.AspNetCore.Authentication.JwtBearer.dll
2026-09-08T18:57:55.2003018Z I0908 15:57:55.200123   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.AspNetCore.Razor.Language.dll as Microsoft.AspNetCore.Razor.Language.dll
2026-09-08T18:57:55.2435107Z I0908 15:57:55.243169   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.Bcl.AsyncInterfaces.dll as Microsoft.Bcl.AsyncInterfaces.dll
2026-09-08T18:57:55.2435550Z I0908 15:57:55.243380   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.Bcl.Cryptography.dll as Microsoft.Bcl.Cryptography.dll
2026-09-08T18:57:55.2444797Z I0908 15:57:55.244385   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.Build.Framework.dll as Microsoft.Build.Framework.dll
2026-09-08T18:57:55.2560560Z I0908 15:57:55.255567   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.Build.dll as Microsoft.Build.dll
2026-09-08T18:57:55.3428432Z I0908 15:57:55.342490   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CSharp.dll as Microsoft.CSharp.dll
2026-09-08T18:57:55.3617522Z I0908 15:57:55.361487   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CodeAnalysis.AnalyzerUtilities.dll as Microsoft.CodeAnalysis.AnalyzerUtilities.dll
2026-09-08T18:57:55.3859099Z I0908 15:57:55.385538   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CodeAnalysis.CSharp.Features.dll as Microsoft.CodeAnalysis.CSharp.Features.dll
2026-09-08T18:57:55.4797270Z I0908 15:57:55.479375   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CodeAnalysis.CSharp.Workspaces.dll as Microsoft.CodeAnalysis.CSharp.Workspaces.dll
2026-09-08T18:57:55.5191668Z I0908 15:57:55.518857   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CodeAnalysis.CSharp.dll as Microsoft.CodeAnalysis.CSharp.dll
2026-09-08T18:57:55.8180416Z I0908 15:57:55.817677   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CodeAnalysis.Elfie.dll as Microsoft.CodeAnalysis.Elfie.dll
2026-09-08T18:57:55.8242597Z I0908 15:57:55.824097   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CodeAnalysis.Features.dll as Microsoft.CodeAnalysis.Features.dll
2026-09-08T18:57:56.0688138Z I0908 15:57:56.068481   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CodeAnalysis.Razor.dll as Microsoft.CodeAnalysis.Razor.dll
2026-09-08T18:57:56.0707594Z I0908 15:57:56.070644   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CodeAnalysis.Scripting.dll as Microsoft.CodeAnalysis.Scripting.dll
2026-09-08T18:57:56.0782852Z I0908 15:57:56.078131   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CodeAnalysis.Workspaces.dll as Microsoft.CodeAnalysis.Workspaces.dll
2026-09-08T18:57:56.2622703Z I0908 15:57:56.261911   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CodeAnalysis.dll as Microsoft.CodeAnalysis.dll
2026-09-08T18:57:56.3981374Z I0908 15:57:56.397635   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CodeCoverage.Core.dll as Microsoft.CodeCoverage.Core.dll
2026-09-08T18:57:56.4172819Z I0908 15:57:56.416899   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CodeCoverage.Instrumentation.dll as Microsoft.CodeCoverage.Instrumentation.dll
2026-09-08T18:57:56.4230379Z I0908 15:57:56.422685   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CodeCoverage.Interprocess.dll as Microsoft.CodeCoverage.Interprocess.dll
2026-09-08T18:57:56.4292278Z I0908 15:57:56.428757   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CodeCoverage.props as Microsoft.CodeCoverage.props
2026-09-08T18:57:56.4292941Z I0908 15:57:56.429039   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CodeCoverage.targets as Microsoft.CodeCoverage.targets
2026-09-08T18:57:56.4293505Z I0908 15:57:56.429117   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.Data.SqlClient.dll as Microsoft.Data.SqlClient.dll
2026-09-08T18:57:56.4642538Z I0908 15:57:56.463945   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.DiaSymReader.dll as Microsoft.DiaSymReader.dll
2026-09-08T18:57:56.4671912Z I0908 15:57:56.467034   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.DotNet.PlatformAbstractions.dll as Microsoft.DotNet.PlatformAbstractions.dll
2026-09-08T18:57:56.4684036Z I0908 15:57:56.468286   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.DotNet.Scaffolding.Shared.dll as Microsoft.DotNet.Scaffolding.Shared.dll
2026-09-08T18:57:56.4742249Z I0908 15:57:56.474019   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.EntityFrameworkCore.Abstractions.dll as Microsoft.EntityFrameworkCore.Abstractions.dll
2026-09-08T18:57:56.4758340Z I0908 15:57:56.475711   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.EntityFrameworkCore.Relational.dll as Microsoft.EntityFrameworkCore.Relational.dll
2026-09-08T18:57:56.5579485Z I0908 15:57:56.557605   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.EntityFrameworkCore.SqlServer.dll as Microsoft.EntityFrameworkCore.SqlServer.dll
2026-09-08T18:57:56.5794277Z I0908 15:57:56.579086   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.EntityFrameworkCore.dll as Microsoft.EntityFrameworkCore.dll
2026-09-08T18:57:56.6849086Z I0908 15:57:56.684564   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.Extensions.Caching.Memory.dll as Microsoft.Extensions.Caching.Memory.dll
2026-09-08T18:57:56.6873133Z I0908 15:57:56.687109   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.Extensions.DependencyInjection.Abstractions.dll as Microsoft.Extensions.DependencyInjection.Abstractions.dll
2026-09-08T18:57:56.6893879Z I0908 15:57:56.689221   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.Extensions.DependencyInjection.dll as Microsoft.Extensions.DependencyInjection.dll
2026-09-08T18:57:56.6934484Z I0908 15:57:56.693229   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.Extensions.DependencyModel.dll as Microsoft.Extensions.DependencyModel.dll
2026-09-08T18:57:56.6963092Z I0908 15:57:56.696149   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.Extensions.FileSystemGlobbing.dll as Microsoft.Extensions.FileSystemGlobbing.dll
2026-09-08T18:57:56.6981310Z I0908 15:57:56.697959   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.Extensions.Logging.Abstractions.dll as Microsoft.Extensions.Logging.Abstractions.dll
2026-09-08T18:57:56.7010389Z I0908 15:57:56.700829   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.Extensions.Options.dll as Microsoft.Extensions.Options.dll
2026-09-08T18:57:56.7031864Z I0908 15:57:56.703054   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.Identity.Client.Extensions.Msal.dll as Microsoft.Identity.Client.Extensions.Msal.dll
2026-09-08T18:57:56.7061727Z I0908 15:57:56.706039   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.Identity.Client.dll as Microsoft.Identity.Client.dll
2026-09-08T18:57:56.7552295Z I0908 15:57:56.754866   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.IdentityModel.Abstractions.dll as Microsoft.IdentityModel.Abstractions.dll
2026-09-08T18:57:56.7552798Z I0908 15:57:56.755042   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.IdentityModel.JsonWebTokens.dll as Microsoft.IdentityModel.JsonWebTokens.dll
2026-09-08T18:57:56.7601825Z I0908 15:57:56.760029   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.IdentityModel.Logging.dll as Microsoft.IdentityModel.Logging.dll
2026-09-08T18:57:56.7615058Z I0908 15:57:56.761353   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.IdentityModel.Protocols.OpenIdConnect.dll as Microsoft.IdentityModel.Protocols.OpenIdConnect.dll
2026-09-08T18:57:56.7647028Z I0908 15:57:56.764555   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.IdentityModel.Protocols.dll as Microsoft.IdentityModel.Protocols.dll
2026-09-08T18:57:56.7668945Z I0908 15:57:56.766651   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.IdentityModel.Tokens.dll as Microsoft.IdentityModel.Tokens.dll
2026-09-08T18:57:56.7788729Z I0908 15:57:56.778627   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.NET.StringTools.dll as Microsoft.NET.StringTools.dll
2026-09-08T18:57:56.7802147Z I0908 15:57:56.780095   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.OpenApi.dll as Microsoft.OpenApi.dll
2026-09-08T18:57:56.7906421Z I0908 15:57:56.790386   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.SqlServer.Server.dll as Microsoft.SqlServer.Server.dll
2026-09-08T18:57:56.7907508Z I0908 15:57:56.790523   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.TestPlatform.CommunicationUtilities.dll as Microsoft.TestPlatform.CommunicationUtilities.dll
2026-09-08T18:57:56.7947480Z I0908 15:57:56.794569   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.TestPlatform.CoreUtilities.dll as Microsoft.TestPlatform.CoreUtilities.dll
2026-09-08T18:57:56.7977007Z I0908 15:57:56.797520   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.TestPlatform.CrossPlatEngine.dll as Microsoft.TestPlatform.CrossPlatEngine.dll
2026-09-08T18:57:56.8105027Z I0908 15:57:56.810257   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.TestPlatform.PlatformAbstractions.dll as Microsoft.TestPlatform.PlatformAbstractions.dll
2026-09-08T18:57:56.8122047Z I0908 15:57:56.812075   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.TestPlatform.Utilities.dll as Microsoft.TestPlatform.Utilities.dll
2026-09-08T18:57:56.8150451Z I0908 15:57:56.814889   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.VisualStudio.CodeCoverage.Shim.dll as Microsoft.VisualStudio.CodeCoverage.Shim.dll
2026-09-08T18:57:56.8153725Z I0908 15:57:56.815283   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.VisualStudio.TestPlatform.Common.dll as Microsoft.VisualStudio.TestPlatform.Common.dll
2026-09-08T18:57:56.8241594Z I0908 15:57:56.823978   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.VisualStudio.TestPlatform.ObjectModel.dll as Microsoft.VisualStudio.TestPlatform.ObjectModel.dll
2026-09-08T18:57:56.8325787Z I0908 15:57:56.832348   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.VisualStudio.TraceDataCollector.dll as Microsoft.VisualStudio.TraceDataCollector.dll
2026-09-08T18:57:56.8369854Z I0908 15:57:56.836814   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.VisualStudio.Web.CodeGeneration.Core.dll as Microsoft.VisualStudio.Web.CodeGeneration.Core.dll
2026-09-08T18:57:56.8389781Z I0908 15:57:56.838865   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.VisualStudio.Web.CodeGeneration.EntityFrameworkCore.dll as Microsoft.VisualStudio.Web.CodeGeneration.EntityFrameworkCore.dll
2026-09-08T18:57:56.8419736Z I0908 15:57:56.841862   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.VisualStudio.Web.CodeGeneration.Templating.dll as Microsoft.VisualStudio.Web.CodeGeneration.Templating.dll
2026-09-08T18:57:56.8431256Z I0908 15:57:56.843031   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.VisualStudio.Web.CodeGeneration.Utils.dll as Microsoft.VisualStudio.Web.CodeGeneration.Utils.dll
2026-09-08T18:57:56.8438040Z I0908 15:57:56.843669   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.VisualStudio.Web.CodeGeneration.dll as Microsoft.VisualStudio.Web.CodeGeneration.dll
2026-09-08T18:57:56.8460687Z I0908 15:57:56.845970   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.VisualStudio.Web.CodeGenerators.Mvc.dll as Microsoft.VisualStudio.Web.CodeGenerators.Mvc.dll
2026-09-08T18:57:56.8557609Z I0908 15:57:56.855559   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.Win32.SystemEvents.dll as Microsoft.Win32.SystemEvents.dll
2026-09-08T18:57:56.8567925Z I0908 15:57:56.856679   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Mono.Cecil.Mdb.dll as Mono.Cecil.Mdb.dll
2026-09-08T18:57:56.8576278Z I0908 15:57:56.857556   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Mono.Cecil.Pdb.dll as Mono.Cecil.Pdb.dll
2026-09-08T18:57:56.8630779Z I0908 15:57:56.862967   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Mono.Cecil.Rocks.dll as Mono.Cecil.Rocks.dll
2026-09-08T18:57:56.8644135Z I0908 15:57:56.864343   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Mono.Cecil.dll as Mono.Cecil.dll
2026-09-08T18:57:56.8817124Z I0908 15:57:56.881485   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Mono.TextTemplating.dll as Mono.TextTemplating.dll
2026-09-08T18:57:56.8891245Z I0908 15:57:56.888891   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Moq.dll as Moq.dll
2026-09-08T18:57:56.9033805Z I0908 15:57:56.903130   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Newtonsoft.Json.dll as Newtonsoft.Json.dll
2026-09-08T18:57:56.9368596Z I0908 15:57:56.936512   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/NuGet.Common.dll as NuGet.Common.dll
2026-09-08T18:57:56.9437352Z I0908 15:57:56.943465   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/NuGet.Configuration.dll as NuGet.Configuration.dll
2026-09-08T18:57:56.9497573Z I0908 15:57:56.949546   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/NuGet.DependencyResolver.Core.dll as NuGet.DependencyResolver.Core.dll
2026-09-08T18:57:56.9532908Z I0908 15:57:56.953067   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/NuGet.Frameworks.dll as NuGet.Frameworks.dll
2026-09-08T18:57:56.9584252Z I0908 15:57:56.958177   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/NuGet.LibraryModel.dll as NuGet.LibraryModel.dll
2026-09-08T18:57:56.9613725Z I0908 15:57:56.961219   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/NuGet.Packaging.dll as NuGet.Packaging.dll
2026-09-08T18:57:56.9907271Z I0908 15:57:56.990411   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/NuGet.ProjectModel.dll as NuGet.ProjectModel.dll
2026-09-08T18:57:57.0009280Z I0908 15:57:57.000643   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/NuGet.Protocol.dll as NuGet.Protocol.dll
2026-09-08T18:57:57.0691413Z I0908 15:57:57.048752   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/NuGet.Versioning.dll as NuGet.Versioning.dll
2026-09-08T18:57:57.0692207Z I0908 15:57:57.050998   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Oracle.EntityFrameworkCore.dll as Oracle.EntityFrameworkCore.dll
2026-09-08T18:57:57.0761643Z I0908 15:57:57.075878   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Oracle.ManagedDataAccess.dll as Oracle.ManagedDataAccess.dll
2026-09-08T18:57:57.2769390Z I0908 15:57:57.276551   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/PdfSharpCore.dll as PdfSharpCore.dll
2026-09-08T18:57:57.3032457Z I0908 15:57:57.302913   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Resources as Resources
2026-09-08T18:57:57.3033705Z I0908 15:57:57.303020   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Resources/Fonts as Resources/Fonts
2026-09-08T18:57:57.3034837Z I0908 15:57:57.303065   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Resources/Fonts/Arial.ttf as Resources/Fonts/Arial.ttf
2026-09-08T18:57:57.3489958Z I0908 15:57:57.348592   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Resources/Fonts/DejaVuSans-Bold.ttf as Resources/Fonts/DejaVuSans-Bold.ttf
2026-09-08T18:57:57.3791851Z I0908 15:57:57.378741   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Resources/Fonts/DejaVuSans.ttf as Resources/Fonts/DejaVuSans.ttf
2026-09-08T18:57:57.4122552Z I0908 15:57:57.411684   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Resources/Images as Resources/Images
2026-09-08T18:57:57.4123046Z I0908 15:57:57.411876   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Resources/Images/logo_caixa_POS_150x35.png as Resources/Images/logo_caixa_POS_150x35.png
2026-09-08T18:57:57.4123417Z I0908 15:57:57.411978   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/SISOU-api-sac-internet as SISOU-api-sac-internet
2026-09-08T18:57:57.4146585Z I0908 15:57:57.414538   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/SISOU-api-sac-internet.deps.json as SISOU-api-sac-internet.deps.json
2026-09-08T18:57:57.4183116Z I0908 15:57:57.418160   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/SISOU-api-sac-internet.dll as SISOU-api-sac-internet.dll
2026-09-08T18:57:57.5035376Z I0908 15:57:57.503122   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/SISOU-api-sac-internet.pdb as SISOU-api-sac-internet.pdb
2026-09-08T18:57:57.5204578Z I0908 15:57:57.520153   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/SISOU-api-sac-internet.xml as SISOU-api-sac-internet.xml
2026-09-08T18:57:57.5325239Z I0908 15:57:57.532244   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Scrutor.dll as Scrutor.dll
2026-09-08T18:57:57.5334963Z I0908 15:57:57.533383   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/SixLabors.Fonts.dll as SixLabors.Fonts.dll
2026-09-08T18:57:57.5540818Z I0908 15:57:57.553414   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/SixLabors.ImageSharp.dll as SixLabors.ImageSharp.dll
2026-09-08T18:57:57.6060883Z I0908 15:57:57.605699   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Sprache.dll as Sprache.dll
2026-09-08T18:57:57.6090495Z I0908 15:57:57.608794   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Swashbuckle.AspNetCore.Filters.Abstractions.dll as Swashbuckle.AspNetCore.Filters.Abstractions.dll
2026-09-08T18:57:57.6094465Z I0908 15:57:57.609319   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Swashbuckle.AspNetCore.Filters.dll as Swashbuckle.AspNetCore.Filters.dll
2026-09-08T18:57:57.6111293Z I0908 15:57:57.611023   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Swashbuckle.AspNetCore.Swagger.dll as Swashbuckle.AspNetCore.Swagger.dll
2026-09-08T18:57:57.6112818Z I0908 15:57:57.611203   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Swashbuckle.AspNetCore.SwaggerGen.dll as Swashbuckle.AspNetCore.SwaggerGen.dll
2026-09-08T18:57:57.6165548Z I0908 15:57:57.616431   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Swashbuckle.AspNetCore.SwaggerUI.dll as Swashbuckle.AspNetCore.SwaggerUI.dll
2026-09-08T18:57:57.6939795Z I0908 15:57:57.693607   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.AppContext.dll as System.AppContext.dll
2026-09-08T18:57:57.6942279Z I0908 15:57:57.694145   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.ClientModel.dll as System.ClientModel.dll
2026-09-08T18:57:57.6942682Z I0908 15:57:57.694220   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.CodeDom.dll as System.CodeDom.dll
2026-09-08T18:57:57.7021864Z I0908 15:57:57.702002   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Collections.Immutable.dll as System.Collections.Immutable.dll
2026-09-08T18:57:57.7158520Z I0908 15:57:57.715655   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Composition.AttributedModel.dll as System.Composition.AttributedModel.dll
2026-09-08T18:57:57.7165687Z I0908 15:57:57.716483   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Composition.Convention.dll as System.Composition.Convention.dll
2026-09-08T18:57:57.7186081Z I0908 15:57:57.718505   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Composition.Hosting.dll as System.Composition.Hosting.dll
2026-09-08T18:57:57.7201875Z I0908 15:57:57.720109   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Composition.Runtime.dll as System.Composition.Runtime.dll
2026-09-08T18:57:57.7214667Z I0908 15:57:57.721360   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Composition.TypedParts.dll as System.Composition.TypedParts.dll
2026-09-08T18:57:57.7234214Z I0908 15:57:57.723330   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Configuration.ConfigurationManager.dll as System.Configuration.ConfigurationManager.dll
2026-09-08T18:57:57.7437526Z I0908 15:57:57.743541   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Diagnostics.EventLog.dll as System.Diagnostics.EventLog.dll
2026-09-08T18:57:57.7452316Z I0908 15:57:57.745118   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Diagnostics.PerformanceCounter.dll as System.Diagnostics.PerformanceCounter.dll
2026-09-08T18:57:57.7469316Z I0908 15:57:57.746854   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.DirectoryServices.Protocols.dll as System.DirectoryServices.Protocols.dll
2026-09-08T18:57:57.7500745Z I0908 15:57:57.749949   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.DirectoryServices.dll as System.DirectoryServices.dll
2026-09-08T18:57:57.7547806Z I0908 15:57:57.754648   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Drawing.Common.dll as System.Drawing.Common.dll
2026-09-08T18:57:57.7607383Z I0908 15:57:57.760469   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Dynamic.Runtime.dll as System.Dynamic.Runtime.dll
2026-09-08T18:57:57.7642073Z I0908 15:57:57.764078   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.IO.FileSystem.Primitives.dll as System.IO.FileSystem.Primitives.dll
2026-09-08T18:57:57.7650044Z I0908 15:57:57.764920   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.IdentityModel.Tokens.Jwt.dll as System.IdentityModel.Tokens.Jwt.dll
2026-09-08T18:57:57.7670667Z I0908 15:57:57.766913   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Linq.Expressions.dll as System.Linq.Expressions.dll
2026-09-08T18:57:57.7865228Z I0908 15:57:57.786274   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Linq.dll as System.Linq.dll
2026-09-08T18:57:57.7914275Z I0908 15:57:57.791238   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Memory.Data.dll as System.Memory.Data.dll
2026-09-08T18:57:57.7926250Z I0908 15:57:57.792521   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.ObjectModel.dll as System.ObjectModel.dll
2026-09-08T18:57:57.7942236Z I0908 15:57:57.794091   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Reflection.Emit.ILGeneration.dll as System.Reflection.Emit.ILGeneration.dll
2026-09-08T18:57:57.7952275Z I0908 15:57:57.795130   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Reflection.Emit.Lightweight.dll as System.Reflection.Emit.Lightweight.dll
2026-09-08T18:57:57.7952931Z I0908 15:57:57.795231   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Reflection.Emit.dll as System.Reflection.Emit.dll
2026-09-08T18:57:57.7954253Z I0908 15:57:57.795346   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Reflection.Metadata.dll as System.Reflection.Metadata.dll
2026-09-08T18:57:57.8191863Z I0908 15:57:57.818917   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Reflection.MetadataLoadContext.dll as System.Reflection.MetadataLoadContext.dll
2026-09-08T18:57:57.8299802Z I0908 15:57:57.829768   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Reflection.TypeExtensions.dll as System.Reflection.TypeExtensions.dll
2026-09-08T18:57:57.8304719Z I0908 15:57:57.830391   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Runtime.CompilerServices.Unsafe.dll as System.Runtime.CompilerServices.Unsafe.dll
2026-09-08T18:57:57.8311435Z I0908 15:57:57.831023   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Runtime.Serialization.Primitives.dll as System.Runtime.Serialization.Primitives.dll
2026-09-08T18:57:57.8314337Z I0908 15:57:57.831343   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Security.Cryptography.Pkcs.dll as System.Security.Cryptography.Pkcs.dll
2026-09-08T18:57:57.8420987Z I0908 15:57:57.841899   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Security.Cryptography.ProtectedData.dll as System.Security.Cryptography.ProtectedData.dll
2026-09-08T18:57:57.8432499Z I0908 15:57:57.843156   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Security.Permissions.dll as System.Security.Permissions.dll
2026-09-08T18:57:57.8473596Z I0908 15:57:57.847246   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Text.RegularExpressions.dll as System.Text.RegularExpressions.dll
2026-09-08T18:57:57.8520946Z I0908 15:57:57.851874   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Threading.Tasks.Extensions.dll as System.Threading.Tasks.Extensions.dll
2026-09-08T18:57:57.8529352Z I0908 15:57:57.852795   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Threading.dll as System.Threading.dll
2026-09-08T18:57:57.8547363Z I0908 15:57:57.854605   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Windows.Extensions.dll as System.Windows.Extensions.dll
2026-09-08T18:57:57.8548216Z I0908 15:57:57.854717   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Xml.ReaderWriter.dll as System.Xml.ReaderWriter.dll
2026-09-08T18:57:57.8811363Z I0908 15:57:57.880889   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Xml.XDocument.dll as System.Xml.XDocument.dll
2026-09-08T18:57:57.8854600Z I0908 15:57:57.885252   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ThirdPartyNotices.txt as ThirdPartyNotices.txt
2026-09-08T18:57:57.8855840Z I0908 15:57:57.885497   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/UnitTests.deps.json as UnitTests.deps.json
2026-09-08T18:57:57.8889751Z I0908 15:57:57.888819   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/UnitTests.dll as UnitTests.dll
2026-09-08T18:57:57.8910724Z I0908 15:57:57.890948   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/UnitTests.pdb as UnitTests.pdb
2026-09-08T18:57:57.8936999Z I0908 15:57:57.893561   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/af as af
2026-09-08T18:57:57.8939012Z I0908 15:57:57.893820   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/af/Humanizer.resources.dll as af/Humanizer.resources.dll
2026-09-08T18:57:57.8939353Z I0908 15:57:57.893880   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/appsettings.json as appsettings.json
2026-09-08T18:57:57.8942476Z I0908 15:57:57.894175   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ar as ar
2026-09-08T18:57:57.8943091Z I0908 15:57:57.894244   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ar/Humanizer.resources.dll as ar/Humanizer.resources.dll
2026-09-08T18:57:57.8943434Z I0908 15:57:57.894293   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/az as az
2026-09-08T18:57:57.8951421Z I0908 15:57:57.895061   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/az/Humanizer.resources.dll as az/Humanizer.resources.dll
2026-09-08T18:57:57.8952085Z I0908 15:57:57.895155   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/bg as bg
2026-09-08T18:57:57.8953175Z I0908 15:57:57.895251   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/bg/Humanizer.resources.dll as bg/Humanizer.resources.dll
2026-09-08T18:57:57.8953763Z I0908 15:57:57.895300   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/bn-BD as bn-BD
2026-09-08T18:57:57.8954997Z I0908 15:57:57.895428   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/bn-BD/Humanizer.resources.dll as bn-BD/Humanizer.resources.dll
2026-09-08T18:57:57.8955454Z I0908 15:57:57.895472   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/coverlet.collector.deps.json as coverlet.collector.deps.json
2026-09-08T18:57:57.8961064Z I0908 15:57:57.896029   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/coverlet.collector.dll as coverlet.collector.dll
2026-09-08T18:57:57.8974720Z I0908 15:57:57.897357   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/coverlet.collector.pdb as coverlet.collector.pdb
2026-09-08T18:57:57.8986114Z I0908 15:57:57.898386   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/coverlet.collector.targets as coverlet.collector.targets
2026-09-08T18:57:57.8986599Z I0908 15:57:57.898575   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/coverlet.core.dll as coverlet.core.dll
2026-09-08T18:57:57.9042433Z I0908 15:57:57.904059   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/coverlet.core.pdb as coverlet.core.pdb
2026-09-08T18:57:57.9065355Z I0908 15:57:57.906440   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs as cs
2026-09-08T18:57:57.9070730Z I0908 15:57:57.907001   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs/Humanizer.resources.dll as cs/Humanizer.resources.dll
2026-09-08T18:57:57.9073736Z I0908 15:57:57.907299   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs/Microsoft.CodeAnalysis.CSharp.Features.resources.dll as cs/Microsoft.CodeAnalysis.CSharp.Features.resources.dll
2026-09-08T18:57:57.9089419Z I0908 15:57:57.908817   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll as cs/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll
2026-09-08T18:57:57.9101329Z I0908 15:57:57.910002   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs/Microsoft.CodeAnalysis.CSharp.resources.dll as cs/Microsoft.CodeAnalysis.CSharp.resources.dll
2026-09-08T18:57:57.9255050Z I0908 15:57:57.925116   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs/Microsoft.CodeAnalysis.Features.resources.dll as cs/Microsoft.CodeAnalysis.Features.resources.dll
2026-09-08T18:57:57.9323533Z I0908 15:57:57.932115   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs/Microsoft.CodeAnalysis.Scripting.resources.dll as cs/Microsoft.CodeAnalysis.Scripting.resources.dll
2026-09-08T18:57:57.9323998Z I0908 15:57:57.932232   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs/Microsoft.CodeAnalysis.Workspaces.resources.dll as cs/Microsoft.CodeAnalysis.Workspaces.resources.dll
2026-09-08T18:57:57.9344322Z I0908 15:57:57.934308   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs/Microsoft.CodeAnalysis.resources.dll as cs/Microsoft.CodeAnalysis.resources.dll
2026-09-08T18:57:57.9353084Z I0908 15:57:57.935226   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs/Microsoft.Data.SqlClient.resources.dll as cs/Microsoft.Data.SqlClient.resources.dll
2026-09-08T18:57:57.9447653Z I0908 15:57:57.944524   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs/Microsoft.TestPlatform.CommunicationUtilities.resources.dll as cs/Microsoft.TestPlatform.CommunicationUtilities.resources.dll
2026-09-08T18:57:57.9459997Z I0908 15:57:57.945868   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs/Microsoft.TestPlatform.CoreUtilities.resources.dll as cs/Microsoft.TestPlatform.CoreUtilities.resources.dll
2026-09-08T18:57:57.9461195Z I0908 15:57:57.946037   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs/Microsoft.TestPlatform.CrossPlatEngine.resources.dll as cs/Microsoft.TestPlatform.CrossPlatEngine.resources.dll
2026-09-08T18:57:57.9464078Z I0908 15:57:57.946302   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs/Microsoft.VisualStudio.TestPlatform.Common.resources.dll as cs/Microsoft.VisualStudio.TestPlatform.Common.resources.dll
2026-09-08T18:57:57.9467280Z I0908 15:57:57.946642   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll as cs/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll
2026-09-08T18:57:57.9467962Z I0908 15:57:57.946729   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs/Microsoft.VisualStudio.TraceDataCollector.resources.dll as cs/Microsoft.VisualStudio.TraceDataCollector.resources.dll
2026-09-08T18:57:57.9476583Z I0908 15:57:57.947576   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/da as da
2026-09-08T18:57:57.9479547Z I0908 15:57:57.947875   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/da/Humanizer.resources.dll as da/Humanizer.resources.dll
2026-09-08T18:57:57.9481019Z I0908 15:57:57.948039   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de as de
2026-09-08T18:57:57.9491429Z I0908 15:57:57.948982   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/Humanizer.resources.dll as de/Humanizer.resources.dll
2026-09-08T18:57:57.9493510Z I0908 15:57:57.949190   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/Microsoft.CodeAnalysis.CSharp.Features.resources.dll as de/Microsoft.CodeAnalysis.CSharp.Features.resources.dll
2026-09-08T18:57:57.9500262Z I0908 15:57:57.949913   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll as de/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll
2026-09-08T18:57:57.9511527Z I0908 15:57:57.950961   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/Microsoft.CodeAnalysis.CSharp.resources.dll as de/Microsoft.CodeAnalysis.CSharp.resources.dll
2026-09-08T18:57:57.9676570Z I0908 15:57:57.967281   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/Microsoft.CodeAnalysis.Features.resources.dll as de/Microsoft.CodeAnalysis.Features.resources.dll
2026-09-08T18:57:57.9752204Z I0908 15:57:57.975000   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/Microsoft.CodeAnalysis.Scripting.resources.dll as de/Microsoft.CodeAnalysis.Scripting.resources.dll
2026-09-08T18:57:57.9752766Z I0908 15:57:57.975137   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/Microsoft.CodeAnalysis.Workspaces.resources.dll as de/Microsoft.CodeAnalysis.Workspaces.resources.dll
2026-09-08T18:57:57.9771038Z I0908 15:57:57.976991   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/Microsoft.CodeAnalysis.resources.dll as de/Microsoft.CodeAnalysis.resources.dll
2026-09-08T18:57:57.9787932Z I0908 15:57:57.978620   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/Microsoft.Data.SqlClient.resources.dll as de/Microsoft.Data.SqlClient.resources.dll
2026-09-08T18:57:57.9887194Z I0908 15:57:57.988414   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/Microsoft.TestPlatform.CommunicationUtilities.resources.dll as de/Microsoft.TestPlatform.CommunicationUtilities.resources.dll
2026-09-08T18:57:57.9895288Z I0908 15:57:57.989425   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/Microsoft.TestPlatform.CoreUtilities.resources.dll as de/Microsoft.TestPlatform.CoreUtilities.resources.dll
2026-09-08T18:57:57.9898309Z I0908 15:57:57.989741   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/Microsoft.TestPlatform.CrossPlatEngine.resources.dll as de/Microsoft.TestPlatform.CrossPlatEngine.resources.dll
2026-09-08T18:57:57.9917157Z I0908 15:57:57.991570   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/Microsoft.VisualStudio.TestPlatform.Common.resources.dll as de/Microsoft.VisualStudio.TestPlatform.Common.resources.dll
2026-09-08T18:57:57.9917883Z I0908 15:57:57.991665   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll as de/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll
2026-09-08T18:57:57.9921845Z I0908 15:57:57.992106   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/Microsoft.VisualStudio.TraceDataCollector.resources.dll as de/Microsoft.VisualStudio.TraceDataCollector.resources.dll
2026-09-08T18:57:57.9925669Z I0908 15:57:57.992500   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/PdfSharpCore.resources.dll as de/PdfSharpCore.resources.dll
2026-09-08T18:57:57.9932523Z I0908 15:57:57.993173   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/dotnet-aspnet-codegenerator-design.dll as dotnet-aspnet-codegenerator-design.dll
2026-09-08T18:57:57.9950437Z I0908 15:57:57.994955   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/el as el
2026-09-08T18:57:57.9951888Z I0908 15:57:57.995115   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/el/Humanizer.resources.dll as el/Humanizer.resources.dll
2026-09-08T18:57:57.9952534Z I0908 15:57:57.995200   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es as es
2026-09-08T18:57:57.9963289Z I0908 15:57:57.996211   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es/Humanizer.resources.dll as es/Humanizer.resources.dll
2026-09-08T18:57:57.9968063Z I0908 15:57:57.996727   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es/Microsoft.CodeAnalysis.CSharp.Features.resources.dll as es/Microsoft.CodeAnalysis.CSharp.Features.resources.dll
2026-09-08T18:57:57.9986838Z I0908 15:57:57.998536   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll as es/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll
2026-09-08T18:57:57.9992684Z I0908 15:57:57.999105   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es/Microsoft.CodeAnalysis.CSharp.resources.dll as es/Microsoft.CodeAnalysis.CSharp.resources.dll
2026-09-08T18:57:58.0157962Z I0908 15:57:58.015484   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es/Microsoft.CodeAnalysis.Features.resources.dll as es/Microsoft.CodeAnalysis.Features.resources.dll
2026-09-08T18:57:58.0232728Z I0908 15:57:58.023096   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es/Microsoft.CodeAnalysis.Scripting.resources.dll as es/Microsoft.CodeAnalysis.Scripting.resources.dll
2026-09-08T18:57:58.0234578Z I0908 15:57:58.023378   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es/Microsoft.CodeAnalysis.Workspaces.resources.dll as es/Microsoft.CodeAnalysis.Workspaces.resources.dll
2026-09-08T18:57:58.0248285Z I0908 15:57:58.024751   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es/Microsoft.CodeAnalysis.resources.dll as es/Microsoft.CodeAnalysis.resources.dll
2026-09-08T18:57:58.0265694Z I0908 15:57:58.026484   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es/Microsoft.Data.SqlClient.resources.dll as es/Microsoft.Data.SqlClient.resources.dll
2026-09-08T18:57:58.0371010Z I0908 15:57:58.036938   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es/Microsoft.TestPlatform.CommunicationUtilities.resources.dll as es/Microsoft.TestPlatform.CommunicationUtilities.resources.dll
2026-09-08T18:57:58.0372922Z I0908 15:57:58.037215   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es/Microsoft.TestPlatform.CoreUtilities.resources.dll as es/Microsoft.TestPlatform.CoreUtilities.resources.dll
2026-09-08T18:57:58.0373392Z I0908 15:57:58.037284   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es/Microsoft.TestPlatform.CrossPlatEngine.resources.dll as es/Microsoft.TestPlatform.CrossPlatEngine.resources.dll
2026-09-08T18:57:58.0376804Z I0908 15:57:58.037606   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es/Microsoft.VisualStudio.TestPlatform.Common.resources.dll as es/Microsoft.VisualStudio.TestPlatform.Common.resources.dll
2026-09-08T18:57:58.0385158Z I0908 15:57:58.038372   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll as es/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll
2026-09-08T18:57:58.0389154Z I0908 15:57:58.038774   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es/Microsoft.VisualStudio.TraceDataCollector.resources.dll as es/Microsoft.VisualStudio.TraceDataCollector.resources.dll
2026-09-08T18:57:58.0393852Z I0908 15:57:58.039283   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fa as fa
2026-09-08T18:57:58.0403260Z I0908 15:57:58.040197   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fa/Humanizer.resources.dll as fa/Humanizer.resources.dll
2026-09-08T18:57:58.0405769Z I0908 15:57:58.040486   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fi-FI as fi-FI
2026-09-08T18:57:58.0406770Z I0908 15:57:58.040612   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fi-FI/Humanizer.resources.dll as fi-FI/Humanizer.resources.dll
2026-09-08T18:57:58.0407374Z I0908 15:57:58.040675   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr as fr
2026-09-08T18:57:58.0408679Z I0908 15:57:58.040804   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr/Humanizer.resources.dll as fr/Humanizer.resources.dll
2026-09-08T18:57:58.0410132Z I0908 15:57:58.040905   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr/Microsoft.CodeAnalysis.CSharp.Features.resources.dll as fr/Microsoft.CodeAnalysis.CSharp.Features.resources.dll
2026-09-08T18:57:58.0424585Z I0908 15:57:58.042334   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll as fr/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll
2026-09-08T18:57:58.0427563Z I0908 15:57:58.042662   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr/Microsoft.CodeAnalysis.CSharp.resources.dll as fr/Microsoft.CodeAnalysis.CSharp.resources.dll
2026-09-08T18:57:58.0585865Z I0908 15:57:58.058383   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr/Microsoft.CodeAnalysis.Features.resources.dll as fr/Microsoft.CodeAnalysis.Features.resources.dll
2026-09-08T18:57:58.0661329Z I0908 15:57:58.065970   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr/Microsoft.CodeAnalysis.Scripting.resources.dll as fr/Microsoft.CodeAnalysis.Scripting.resources.dll
2026-09-08T18:57:58.0664458Z I0908 15:57:58.066363   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr/Microsoft.CodeAnalysis.Workspaces.resources.dll as fr/Microsoft.CodeAnalysis.Workspaces.resources.dll
2026-09-08T18:57:58.0679513Z I0908 15:57:58.067866   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr/Microsoft.CodeAnalysis.resources.dll as fr/Microsoft.CodeAnalysis.resources.dll
2026-09-08T18:57:58.0699462Z I0908 15:57:58.069857   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr/Microsoft.Data.SqlClient.resources.dll as fr/Microsoft.Data.SqlClient.resources.dll
2026-09-08T18:57:58.0797413Z I0908 15:57:58.079460   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr/Microsoft.TestPlatform.CommunicationUtilities.resources.dll as fr/Microsoft.TestPlatform.CommunicationUtilities.resources.dll
2026-09-08T18:57:58.0810296Z I0908 15:57:58.080843   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr/Microsoft.TestPlatform.CoreUtilities.resources.dll as fr/Microsoft.TestPlatform.CoreUtilities.resources.dll
2026-09-08T18:57:58.0811575Z I0908 15:57:58.080990   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr/Microsoft.TestPlatform.CrossPlatEngine.resources.dll as fr/Microsoft.TestPlatform.CrossPlatEngine.resources.dll
2026-09-08T18:57:58.0812584Z I0908 15:57:58.081160   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr/Microsoft.VisualStudio.TestPlatform.Common.resources.dll as fr/Microsoft.VisualStudio.TestPlatform.Common.resources.dll
2026-09-08T18:57:58.0824972Z I0908 15:57:58.082361   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll as fr/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll
2026-09-08T18:57:58.0831316Z I0908 15:57:58.083025   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr/Microsoft.VisualStudio.TraceDataCollector.resources.dll as fr/Microsoft.VisualStudio.TraceDataCollector.resources.dll
2026-09-08T18:57:58.0832604Z I0908 15:57:58.083179   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr-BE as fr-BE
2026-09-08T18:57:58.0846159Z I0908 15:57:58.084486   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr-BE/Humanizer.resources.dll as fr-BE/Humanizer.resources.dll
2026-09-08T18:57:58.0847250Z I0908 15:57:58.084604   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/he as he
2026-09-08T18:57:58.0850956Z I0908 15:57:58.085011   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/he/Humanizer.resources.dll as he/Humanizer.resources.dll
2026-09-08T18:57:58.0853321Z I0908 15:57:58.085232   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/hr as hr
2026-09-08T18:57:58.0854316Z I0908 15:57:58.085356   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/hr/Humanizer.resources.dll as hr/Humanizer.resources.dll
2026-09-08T18:57:58.0855241Z I0908 15:57:58.085431   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/hu as hu
2026-09-08T18:57:58.0857195Z I0908 15:57:58.085648   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/hu/Humanizer.resources.dll as hu/Humanizer.resources.dll
2026-09-08T18:57:58.0857734Z I0908 15:57:58.085725   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/hy as hy
2026-09-08T18:57:58.0859551Z I0908 15:57:58.085894   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/hy/Humanizer.resources.dll as hy/Humanizer.resources.dll
2026-09-08T18:57:58.0868935Z I0908 15:57:58.086814   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/id as id
2026-09-08T18:57:58.0871464Z I0908 15:57:58.086929   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/id/Humanizer.resources.dll as id/Humanizer.resources.dll
2026-09-08T18:57:58.0877714Z I0908 15:57:58.086993   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/is as is
2026-09-08T18:57:58.0878084Z I0908 15:57:58.087120   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/is/Humanizer.resources.dll as is/Humanizer.resources.dll
2026-09-08T18:57:58.0878387Z I0908 15:57:58.087199   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it as it
2026-09-08T18:57:58.0878706Z I0908 15:57:58.087389   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it/Humanizer.resources.dll as it/Humanizer.resources.dll
2026-09-08T18:57:58.0879095Z I0908 15:57:58.087502   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it/Microsoft.CodeAnalysis.CSharp.Features.resources.dll as it/Microsoft.CodeAnalysis.CSharp.Features.resources.dll
2026-09-08T18:57:58.0891709Z I0908 15:57:58.089000   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll as it/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll
2026-09-08T18:57:58.0896370Z I0908 15:57:58.089531   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it/Microsoft.CodeAnalysis.CSharp.resources.dll as it/Microsoft.CodeAnalysis.CSharp.resources.dll
2026-09-08T18:57:58.1065571Z I0908 15:57:58.106334   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it/Microsoft.CodeAnalysis.Features.resources.dll as it/Microsoft.CodeAnalysis.Features.resources.dll
2026-09-08T18:57:58.1135537Z I0908 15:57:58.113390   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it/Microsoft.CodeAnalysis.Scripting.resources.dll as it/Microsoft.CodeAnalysis.Scripting.resources.dll
2026-09-08T18:57:58.1136630Z I0908 15:57:58.113589   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it/Microsoft.CodeAnalysis.Workspaces.resources.dll as it/Microsoft.CodeAnalysis.Workspaces.resources.dll
2026-09-08T18:57:58.1155528Z I0908 15:57:58.115424   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it/Microsoft.CodeAnalysis.resources.dll as it/Microsoft.CodeAnalysis.resources.dll
2026-09-08T18:57:58.1175845Z I0908 15:57:58.117457   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it/Microsoft.Data.SqlClient.resources.dll as it/Microsoft.Data.SqlClient.resources.dll
2026-09-08T18:57:58.1266933Z I0908 15:57:58.126543   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it/Microsoft.TestPlatform.CommunicationUtilities.resources.dll as it/Microsoft.TestPlatform.CommunicationUtilities.resources.dll
2026-09-08T18:57:58.1267539Z I0908 15:57:58.126675   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it/Microsoft.TestPlatform.CoreUtilities.resources.dll as it/Microsoft.TestPlatform.CoreUtilities.resources.dll
2026-09-08T18:57:58.1279831Z I0908 15:57:58.127851   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it/Microsoft.TestPlatform.CrossPlatEngine.resources.dll as it/Microsoft.TestPlatform.CrossPlatEngine.resources.dll
2026-09-08T18:57:58.1280535Z I0908 15:57:58.127972   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it/Microsoft.VisualStudio.TestPlatform.Common.resources.dll as it/Microsoft.VisualStudio.TestPlatform.Common.resources.dll
2026-09-08T18:57:58.1283020Z I0908 15:57:58.128220   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll as it/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll
2026-09-08T18:57:58.1294861Z I0908 15:57:58.129292   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it/Microsoft.VisualStudio.TraceDataCollector.resources.dll as it/Microsoft.VisualStudio.TraceDataCollector.resources.dll
2026-09-08T18:57:58.1299515Z I0908 15:57:58.129853   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja as ja
2026-09-08T18:57:58.1300168Z I0908 15:57:58.129948   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja/Humanizer.resources.dll as ja/Humanizer.resources.dll
2026-09-08T18:57:58.1300584Z I0908 15:57:58.130004   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja/Microsoft.CodeAnalysis.CSharp.Features.resources.dll as ja/Microsoft.CodeAnalysis.CSharp.Features.resources.dll
2026-09-08T18:57:58.1320484Z I0908 15:57:58.131928   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll as ja/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll
2026-09-08T18:57:58.1329364Z I0908 15:57:58.132818   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja/Microsoft.CodeAnalysis.CSharp.resources.dll as ja/Microsoft.CodeAnalysis.CSharp.resources.dll
2026-09-08T18:57:58.1504731Z I0908 15:57:58.150229   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja/Microsoft.CodeAnalysis.Features.resources.dll as ja/Microsoft.CodeAnalysis.Features.resources.dll
2026-09-08T18:57:58.1572199Z I0908 15:57:58.157092   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja/Microsoft.CodeAnalysis.Scripting.resources.dll as ja/Microsoft.CodeAnalysis.Scripting.resources.dll
2026-09-08T18:57:58.1584221Z I0908 15:57:58.158303   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja/Microsoft.CodeAnalysis.Workspaces.resources.dll as ja/Microsoft.CodeAnalysis.Workspaces.resources.dll
2026-09-08T18:57:58.1592686Z I0908 15:57:58.159142   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja/Microsoft.CodeAnalysis.resources.dll as ja/Microsoft.CodeAnalysis.resources.dll
2026-09-08T18:57:58.1612449Z I0908 15:57:58.161110   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja/Microsoft.Data.SqlClient.resources.dll as ja/Microsoft.Data.SqlClient.resources.dll
2026-09-08T18:57:58.1730023Z I0908 15:57:58.172545   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja/Microsoft.TestPlatform.CommunicationUtilities.resources.dll as ja/Microsoft.TestPlatform.CommunicationUtilities.resources.dll
2026-09-08T18:57:58.1733935Z I0908 15:57:58.173198   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja/Microsoft.TestPlatform.CoreUtilities.resources.dll as ja/Microsoft.TestPlatform.CoreUtilities.resources.dll
2026-09-08T18:57:58.1734689Z I0908 15:57:58.173274   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja/Microsoft.TestPlatform.CrossPlatEngine.resources.dll as ja/Microsoft.TestPlatform.CrossPlatEngine.resources.dll
2026-09-08T18:57:58.1743975Z I0908 15:57:58.174240   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja/Microsoft.VisualStudio.TestPlatform.Common.resources.dll as ja/Microsoft.VisualStudio.TestPlatform.Common.resources.dll
2026-09-08T18:57:58.1747098Z I0908 15:57:58.174579   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll as ja/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll
2026-09-08T18:57:58.1747566Z I0908 15:57:58.174655   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja/Microsoft.VisualStudio.TraceDataCollector.resources.dll as ja/Microsoft.VisualStudio.TraceDataCollector.resources.dll
2026-09-08T18:57:58.1751459Z I0908 15:57:58.175040   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko as ko
2026-09-08T18:57:58.1761727Z I0908 15:57:58.175984   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko/Microsoft.CodeAnalysis.CSharp.Features.resources.dll as ko/Microsoft.CodeAnalysis.CSharp.Features.resources.dll
2026-09-08T18:57:58.1769296Z I0908 15:57:58.176816   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll as ko/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll
2026-09-08T18:57:58.1779334Z I0908 15:57:58.177676   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko/Microsoft.CodeAnalysis.CSharp.resources.dll as ko/Microsoft.CodeAnalysis.CSharp.resources.dll
2026-09-08T18:57:58.1929503Z I0908 15:57:58.192701   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko/Microsoft.CodeAnalysis.Features.resources.dll as ko/Microsoft.CodeAnalysis.Features.resources.dll
2026-09-08T18:57:58.2003249Z I0908 15:57:58.200108   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko/Microsoft.CodeAnalysis.Scripting.resources.dll as ko/Microsoft.CodeAnalysis.Scripting.resources.dll
2026-09-08T18:57:58.2009705Z I0908 15:57:58.200821   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko/Microsoft.CodeAnalysis.Workspaces.resources.dll as ko/Microsoft.CodeAnalysis.Workspaces.resources.dll
2026-09-08T18:57:58.2024714Z I0908 15:57:58.202283   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko/Microsoft.CodeAnalysis.resources.dll as ko/Microsoft.CodeAnalysis.resources.dll
2026-09-08T18:57:58.2045698Z I0908 15:57:58.204385   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko/Microsoft.Data.SqlClient.resources.dll as ko/Microsoft.Data.SqlClient.resources.dll
2026-09-08T18:57:58.2144008Z I0908 15:57:58.214065   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko/Microsoft.TestPlatform.CommunicationUtilities.resources.dll as ko/Microsoft.TestPlatform.CommunicationUtilities.resources.dll
2026-09-08T18:57:58.2154239Z I0908 15:57:58.215288   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko/Microsoft.TestPlatform.CoreUtilities.resources.dll as ko/Microsoft.TestPlatform.CoreUtilities.resources.dll
2026-09-08T18:57:58.2155376Z I0908 15:57:58.215460   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko/Microsoft.TestPlatform.CrossPlatEngine.resources.dll as ko/Microsoft.TestPlatform.CrossPlatEngine.resources.dll
2026-09-08T18:57:58.2157185Z I0908 15:57:58.215634   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko/Microsoft.VisualStudio.TestPlatform.Common.resources.dll as ko/Microsoft.VisualStudio.TestPlatform.Common.resources.dll
2026-09-08T18:57:58.2166063Z I0908 15:57:58.216521   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll as ko/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll
2026-09-08T18:57:58.2170972Z I0908 15:57:58.216870   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko/Microsoft.VisualStudio.TraceDataCollector.resources.dll as ko/Microsoft.VisualStudio.TraceDataCollector.resources.dll
2026-09-08T18:57:58.2171584Z I0908 15:57:58.216959   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko-KR as ko-KR
2026-09-08T18:57:58.2180546Z I0908 15:57:58.217939   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko-KR/Humanizer.resources.dll as ko-KR/Humanizer.resources.dll
2026-09-08T18:57:58.2181041Z I0908 15:57:58.218036   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ku as ku
2026-09-08T18:57:58.2186556Z I0908 15:57:58.218437   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ku/Humanizer.resources.dll as ku/Humanizer.resources.dll
2026-09-08T18:57:58.2187105Z I0908 15:57:58.218542   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/lv as lv
2026-09-08T18:57:58.2189345Z I0908 15:57:58.218849   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/lv/Humanizer.resources.dll as lv/Humanizer.resources.dll
2026-09-08T18:57:58.2195811Z I0908 15:57:58.219498   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ms-MY as ms-MY
2026-09-08T18:57:58.2198501Z I0908 15:57:58.219757   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ms-MY/Humanizer.resources.dll as ms-MY/Humanizer.resources.dll
2026-09-08T18:57:58.2198968Z I0908 15:57:58.219834   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/mt as mt
2026-09-08T18:57:58.2200537Z I0908 15:57:58.219980   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/mt/Humanizer.resources.dll as mt/Humanizer.resources.dll
2026-09-08T18:57:58.2201520Z I0908 15:57:58.220078   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/nb as nb
2026-09-08T18:57:58.2204443Z I0908 15:57:58.220367   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/nb/Humanizer.resources.dll as nb/Humanizer.resources.dll
2026-09-08T18:57:58.2205607Z I0908 15:57:58.220488   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/nb-NO as nb-NO
2026-09-08T18:57:58.2212766Z I0908 15:57:58.221160   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/nb-NO/Humanizer.resources.dll as nb-NO/Humanizer.resources.dll
2026-09-08T18:57:58.2214122Z I0908 15:57:58.221331   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/nl as nl
2026-09-08T18:57:58.2214446Z I0908 15:57:58.221378   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/nl/Humanizer.resources.dll as nl/Humanizer.resources.dll
2026-09-08T18:57:58.2214973Z I0908 15:57:58.221437   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl as pl
2026-09-08T18:57:58.2217222Z I0908 15:57:58.221624   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl/Humanizer.resources.dll as pl/Humanizer.resources.dll
2026-09-08T18:57:58.2219107Z I0908 15:57:58.221813   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl/Microsoft.CodeAnalysis.CSharp.Features.resources.dll as pl/Microsoft.CodeAnalysis.CSharp.Features.resources.dll
2026-09-08T18:57:58.2228053Z I0908 15:57:58.222666   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll as pl/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll
2026-09-08T18:57:58.2240041Z I0908 15:57:58.223789   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl/Microsoft.CodeAnalysis.CSharp.resources.dll as pl/Microsoft.CodeAnalysis.CSharp.resources.dll
2026-09-08T18:57:58.2399921Z I0908 15:57:58.239717   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl/Microsoft.CodeAnalysis.Features.resources.dll as pl/Microsoft.CodeAnalysis.Features.resources.dll
2026-09-08T18:57:58.2469722Z I0908 15:57:58.246761   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl/Microsoft.CodeAnalysis.Scripting.resources.dll as pl/Microsoft.CodeAnalysis.Scripting.resources.dll
2026-09-08T18:57:58.2475090Z I0908 15:57:58.247083   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl/Microsoft.CodeAnalysis.Workspaces.resources.dll as pl/Microsoft.CodeAnalysis.Workspaces.resources.dll
2026-09-08T18:57:58.2485059Z I0908 15:57:58.248388   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl/Microsoft.CodeAnalysis.resources.dll as pl/Microsoft.CodeAnalysis.resources.dll
2026-09-08T18:57:58.2504640Z I0908 15:57:58.250350   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl/Microsoft.Data.SqlClient.resources.dll as pl/Microsoft.Data.SqlClient.resources.dll
2026-09-08T18:57:58.2607520Z I0908 15:57:58.260568   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl/Microsoft.TestPlatform.CommunicationUtilities.resources.dll as pl/Microsoft.TestPlatform.CommunicationUtilities.resources.dll
2026-09-08T18:57:58.2611574Z I0908 15:57:58.261066   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl/Microsoft.TestPlatform.CoreUtilities.resources.dll as pl/Microsoft.TestPlatform.CoreUtilities.resources.dll
2026-09-08T18:57:58.2612004Z I0908 15:57:58.261134   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl/Microsoft.TestPlatform.CrossPlatEngine.resources.dll as pl/Microsoft.TestPlatform.CrossPlatEngine.resources.dll
2026-09-08T18:57:58.2622315Z I0908 15:57:58.262118   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl/Microsoft.VisualStudio.TestPlatform.Common.resources.dll as pl/Microsoft.VisualStudio.TestPlatform.Common.resources.dll
2026-09-08T18:57:58.2624018Z I0908 15:57:58.262316   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll as pl/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll
2026-09-08T18:57:58.2626811Z I0908 15:57:58.262595   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl/Microsoft.VisualStudio.TraceDataCollector.resources.dll as pl/Microsoft.VisualStudio.TraceDataCollector.resources.dll
2026-09-08T18:57:58.2631365Z I0908 15:57:58.263058   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt as pt
2026-09-08T18:57:58.2640989Z I0908 15:57:58.264008   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt/Humanizer.resources.dll as pt/Humanizer.resources.dll
2026-09-08T18:57:58.2643619Z I0908 15:57:58.264299   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt-BR as pt-BR
2026-09-08T18:57:58.2644920Z I0908 15:57:58.264420   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt-BR/Microsoft.CodeAnalysis.CSharp.Features.resources.dll as pt-BR/Microsoft.CodeAnalysis.CSharp.Features.resources.dll
2026-09-08T18:57:58.2660576Z I0908 15:57:58.265938   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt-BR/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll as pt-BR/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll
2026-09-08T18:57:58.2665213Z I0908 15:57:58.266443   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt-BR/Microsoft.CodeAnalysis.CSharp.resources.dll as pt-BR/Microsoft.CodeAnalysis.CSharp.resources.dll
2026-09-08T18:57:58.2834958Z I0908 15:57:58.283271   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt-BR/Microsoft.CodeAnalysis.Features.resources.dll as pt-BR/Microsoft.CodeAnalysis.Features.resources.dll
2026-09-08T18:57:58.2909113Z I0908 15:57:58.290742   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt-BR/Microsoft.CodeAnalysis.Scripting.resources.dll as pt-BR/Microsoft.CodeAnalysis.Scripting.resources.dll
2026-09-08T18:57:58.2911358Z I0908 15:57:58.291058   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt-BR/Microsoft.CodeAnalysis.Workspaces.resources.dll as pt-BR/Microsoft.CodeAnalysis.Workspaces.resources.dll
2026-09-08T18:57:58.2925275Z I0908 15:57:58.292401   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt-BR/Microsoft.CodeAnalysis.resources.dll as pt-BR/Microsoft.CodeAnalysis.resources.dll
2026-09-08T18:57:58.2945581Z I0908 15:57:58.294350   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt-BR/Microsoft.Data.SqlClient.resources.dll as pt-BR/Microsoft.Data.SqlClient.resources.dll
2026-09-08T18:57:58.3037307Z I0908 15:57:58.303505   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt-BR/Microsoft.TestPlatform.CommunicationUtilities.resources.dll as pt-BR/Microsoft.TestPlatform.CommunicationUtilities.resources.dll
2026-09-08T18:57:58.3037923Z I0908 15:57:58.303670   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt-BR/Microsoft.TestPlatform.CoreUtilities.resources.dll as pt-BR/Microsoft.TestPlatform.CoreUtilities.resources.dll
2026-09-08T18:57:58.3049718Z I0908 15:57:58.304866   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt-BR/Microsoft.TestPlatform.CrossPlatEngine.resources.dll as pt-BR/Microsoft.TestPlatform.CrossPlatEngine.resources.dll
2026-09-08T18:57:58.3053030Z I0908 15:57:58.305220   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt-BR/Microsoft.VisualStudio.TestPlatform.Common.resources.dll as pt-BR/Microsoft.VisualStudio.TestPlatform.Common.resources.dll
2026-09-08T18:57:58.3053609Z I0908 15:57:58.305289   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt-BR/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll as pt-BR/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll
2026-09-08T18:57:58.3064906Z I0908 15:57:58.306312   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt-BR/Microsoft.VisualStudio.TraceDataCollector.resources.dll as pt-BR/Microsoft.VisualStudio.TraceDataCollector.resources.dll
2026-09-08T18:57:58.3070204Z I0908 15:57:58.306860   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ro as ro
2026-09-08T18:57:58.3071619Z I0908 15:57:58.306977   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ro/Humanizer.resources.dll as ro/Humanizer.resources.dll
2026-09-08T18:57:58.3072111Z I0908 15:57:58.307046   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru as ru
2026-09-08T18:57:58.3080819Z I0908 15:57:58.307940   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru/Humanizer.resources.dll as ru/Humanizer.resources.dll
2026-09-08T18:57:58.3081509Z I0908 15:57:58.308016   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru/Microsoft.CodeAnalysis.CSharp.Features.resources.dll as ru/Microsoft.CodeAnalysis.CSharp.Features.resources.dll
2026-09-08T18:57:58.3093488Z I0908 15:57:58.309213   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll as ru/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll
2026-09-08T18:57:58.3105534Z I0908 15:57:58.310452   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru/Microsoft.CodeAnalysis.CSharp.resources.dll as ru/Microsoft.CodeAnalysis.CSharp.resources.dll
2026-09-08T18:57:58.3340646Z I0908 15:57:58.333768   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru/Microsoft.CodeAnalysis.Features.resources.dll as ru/Microsoft.CodeAnalysis.Features.resources.dll
2026-09-08T18:57:58.3435319Z I0908 15:57:58.343326   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru/Microsoft.CodeAnalysis.Scripting.resources.dll as ru/Microsoft.CodeAnalysis.Scripting.resources.dll
2026-09-08T18:57:58.3436963Z I0908 15:57:58.343604   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru/Microsoft.CodeAnalysis.Workspaces.resources.dll as ru/Microsoft.CodeAnalysis.Workspaces.resources.dll
2026-09-08T18:57:58.3455938Z I0908 15:57:58.345503   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru/Microsoft.CodeAnalysis.resources.dll as ru/Microsoft.CodeAnalysis.resources.dll
2026-09-08T18:57:58.3479703Z I0908 15:57:58.347885   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru/Microsoft.Data.SqlClient.resources.dll as ru/Microsoft.Data.SqlClient.resources.dll
2026-09-08T18:57:58.3617441Z I0908 15:57:58.361506   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru/Microsoft.TestPlatform.CommunicationUtilities.resources.dll as ru/Microsoft.TestPlatform.CommunicationUtilities.resources.dll
2026-09-08T18:57:58.3626068Z I0908 15:57:58.362484   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru/Microsoft.TestPlatform.CoreUtilities.resources.dll as ru/Microsoft.TestPlatform.CoreUtilities.resources.dll
2026-09-08T18:57:58.3629780Z I0908 15:57:58.362777   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru/Microsoft.TestPlatform.CrossPlatEngine.resources.dll as ru/Microsoft.TestPlatform.CrossPlatEngine.resources.dll
2026-09-08T18:57:58.3632924Z I0908 15:57:58.363185   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru/Microsoft.VisualStudio.TestPlatform.Common.resources.dll as ru/Microsoft.VisualStudio.TestPlatform.Common.resources.dll
2026-09-08T18:57:58.3639816Z I0908 15:57:58.363799   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll as ru/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll
2026-09-08T18:57:58.3642109Z I0908 15:57:58.364120   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru/Microsoft.VisualStudio.TraceDataCollector.resources.dll as ru/Microsoft.VisualStudio.TraceDataCollector.resources.dll
2026-09-08T18:57:58.3645914Z I0908 15:57:58.364521   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes as runtimes
2026-09-08T18:57:58.3649414Z I0908 15:57:58.364872   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/linux as runtimes/linux
2026-09-08T18:57:58.3649733Z I0908 15:57:58.364911   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/linux/lib as runtimes/linux/lib
2026-09-08T18:57:58.3650083Z I0908 15:57:58.364952   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/linux/lib/net6.0 as runtimes/linux/lib/net6.0
2026-09-08T18:57:58.3650484Z I0908 15:57:58.364992   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/linux/lib/net6.0/System.DirectoryServices.Protocols.dll as runtimes/linux/lib/net6.0/System.DirectoryServices.Protocols.dll
2026-09-08T18:57:58.3704788Z I0908 15:57:58.370308   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/osx as runtimes/osx
2026-09-08T18:57:58.3713320Z I0908 15:57:58.371233   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/osx/lib as runtimes/osx/lib
2026-09-08T18:57:58.3713811Z I0908 15:57:58.371289   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/osx/lib/net6.0 as runtimes/osx/lib/net6.0
2026-09-08T18:57:58.3714407Z I0908 15:57:58.371333   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/osx/lib/net6.0/System.DirectoryServices.Protocols.dll as runtimes/osx/lib/net6.0/System.DirectoryServices.Protocols.dll
2026-09-08T18:57:58.3757968Z I0908 15:57:58.375680   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/unix as runtimes/unix
2026-09-08T18:57:58.3767205Z I0908 15:57:58.376608   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/unix/lib as runtimes/unix/lib
2026-09-08T18:57:58.3767548Z I0908 15:57:58.376663   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/unix/lib/net8.0 as runtimes/unix/lib/net8.0
2026-09-08T18:57:58.3767929Z I0908 15:57:58.376714   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/unix/lib/net8.0/Microsoft.Data.SqlClient.dll as runtimes/unix/lib/net8.0/Microsoft.Data.SqlClient.dll
2026-09-08T18:57:58.4610170Z I0908 15:57:58.460524   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win as runtimes/win
2026-09-08T18:57:58.4610817Z I0908 15:57:58.460962   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win/lib as runtimes/win/lib
2026-09-08T18:57:58.4611337Z I0908 15:57:58.461033   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win/lib/net6.0 as runtimes/win/lib/net6.0
2026-09-08T18:57:58.4612020Z I0908 15:57:58.461084   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win/lib/net6.0/System.Diagnostics.PerformanceCounter.dll as runtimes/win/lib/net6.0/System.Diagnostics.PerformanceCounter.dll
2026-09-08T18:57:58.4661443Z I0908 15:57:58.465938   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win/lib/net6.0/System.DirectoryServices.Protocols.dll as runtimes/win/lib/net6.0/System.DirectoryServices.Protocols.dll
2026-09-08T18:57:58.4720664Z I0908 15:57:58.471910   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win/lib/net6.0/System.DirectoryServices.dll as runtimes/win/lib/net6.0/System.DirectoryServices.dll
2026-09-08T18:57:58.4884354Z I0908 15:57:58.488164   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win/lib/net7.0 as runtimes/win/lib/net7.0
2026-09-08T18:57:58.4885088Z I0908 15:57:58.488320   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win/lib/net7.0/Microsoft.Win32.SystemEvents.dll as runtimes/win/lib/net7.0/Microsoft.Win32.SystemEvents.dll
2026-09-08T18:57:58.4904538Z I0908 15:57:58.490356   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win/lib/net7.0/System.Drawing.Common.dll as runtimes/win/lib/net7.0/System.Drawing.Common.dll
2026-09-08T18:57:58.5135722Z I0908 15:57:58.513346   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win/lib/net7.0/System.Windows.Extensions.dll as runtimes/win/lib/net7.0/System.Windows.Extensions.dll
2026-09-08T18:57:58.5158992Z I0908 15:57:58.515752   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win/lib/net8.0 as runtimes/win/lib/net8.0
2026-09-08T18:57:58.5168063Z I0908 15:57:58.516695   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win/lib/net8.0/Microsoft.Data.SqlClient.dll as runtimes/win/lib/net8.0/Microsoft.Data.SqlClient.dll
2026-09-08T18:57:58.6014793Z I0908 15:57:58.601075   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win/lib/net8.0/System.Diagnostics.EventLog.Messages.dll as runtimes/win/lib/net8.0/System.Diagnostics.EventLog.Messages.dll
2026-09-08T18:57:58.6043434Z I0908 15:57:58.604227   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win/lib/net8.0/System.Diagnostics.EventLog.dll as runtimes/win/lib/net8.0/System.Diagnostics.EventLog.dll
2026-09-08T18:57:58.6118763Z I0908 15:57:58.611564   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win/lib/net8.0/System.Security.Cryptography.Pkcs.dll as runtimes/win/lib/net8.0/System.Security.Cryptography.Pkcs.dll
2026-09-08T18:57:58.6246368Z I0908 15:57:58.624446   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win-arm64 as runtimes/win-arm64
2026-09-08T18:57:58.6249833Z I0908 15:57:58.624905   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win-arm64/native as runtimes/win-arm64/native
2026-09-08T18:57:58.6250267Z I0908 15:57:58.624957   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win-arm64/native/Microsoft.Data.SqlClient.SNI.dll as runtimes/win-arm64/native/Microsoft.Data.SqlClient.SNI.dll
2026-09-08T18:57:58.6447414Z I0908 15:57:58.644473   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win-x64 as runtimes/win-x64
2026-09-08T18:57:58.6458880Z I0908 15:57:58.645758   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win-x64/native as runtimes/win-x64/native
2026-09-08T18:57:58.6459305Z I0908 15:57:58.645818   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win-x64/native/Microsoft.Data.SqlClient.SNI.dll as runtimes/win-x64/native/Microsoft.Data.SqlClient.SNI.dll
2026-09-08T18:57:58.6712642Z I0908 15:57:58.670966   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win-x86 as runtimes/win-x86
2026-09-08T18:57:58.6713681Z I0908 15:57:58.671141   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win-x86/native as runtimes/win-x86/native
2026-09-08T18:57:58.6714345Z I0908 15:57:58.671194   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win-x86/native/Microsoft.Data.SqlClient.SNI.dll as runtimes/win-x86/native/Microsoft.Data.SqlClient.SNI.dll
2026-09-08T18:57:58.6897324Z I0908 15:57:58.689378   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/sisou-api-sac-internet.zip as sisou-api-sac-internet.zip
2026-09-08T18:57:59.9554358Z .I0908 15:57:59.953999   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/sk as sk
2026-09-08T18:57:59.9587152Z I0908 15:57:59.954227   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/sk/Humanizer.resources.dll as sk/Humanizer.resources.dll
2026-09-08T18:57:59.9588007Z I0908 15:57:59.954329   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/sl as sl
2026-09-08T18:57:59.9588626Z I0908 15:57:59.954652   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/sl/Humanizer.resources.dll as sl/Humanizer.resources.dll
2026-09-08T18:57:59.9589099Z I0908 15:57:59.954722   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/sr as sr
2026-09-08T18:57:59.9589599Z I0908 15:57:59.955513   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/sr/Humanizer.resources.dll as sr/Humanizer.resources.dll
2026-09-08T18:57:59.9590082Z I0908 15:57:59.955659   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/sr-Latn as sr-Latn
2026-09-08T18:57:59.9590597Z I0908 15:57:59.955746   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/sr-Latn/Humanizer.resources.dll as sr-Latn/Humanizer.resources.dll
2026-09-08T18:57:59.9591056Z I0908 15:57:59.955793   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/sv as sv
2026-09-08T18:57:59.9591489Z I0908 15:57:59.955941   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/sv/Humanizer.resources.dll as sv/Humanizer.resources.dll
2026-09-08T18:57:59.9591810Z I0908 15:57:59.955985   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/swagger.json as swagger.json
2026-09-08T18:57:59.9592101Z I0908 15:57:59.956231   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/testhost.dll as testhost.dll
2026-09-08T18:57:59.9592413Z I0908 15:57:59.957735   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/th-TH as th-TH
2026-09-08T18:57:59.9592750Z I0908 15:57:59.957903   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/th-TH/Humanizer.resources.dll as th-TH/Humanizer.resources.dll
2026-09-08T18:57:59.9593137Z I0908 15:57:59.958081   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr as tr
2026-09-08T18:57:59.9619110Z I0908 15:57:59.959087   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr/Humanizer.resources.dll as tr/Humanizer.resources.dll
2026-09-08T18:57:59.9626143Z I0908 15:57:59.959241   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr/Microsoft.CodeAnalysis.CSharp.Features.resources.dll as tr/Microsoft.CodeAnalysis.CSharp.Features.resources.dll
2026-09-08T18:57:59.9626591Z I0908 15:57:59.960033   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll as tr/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll
2026-09-08T18:57:59.9627086Z I0908 15:57:59.961249   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr/Microsoft.CodeAnalysis.CSharp.resources.dll as tr/Microsoft.CodeAnalysis.CSharp.resources.dll
2026-09-08T18:57:59.9786246Z I0908 15:57:59.977945   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr/Microsoft.CodeAnalysis.Features.resources.dll as tr/Microsoft.CodeAnalysis.Features.resources.dll
2026-09-08T18:57:59.9847353Z I0908 15:57:59.984454   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr/Microsoft.CodeAnalysis.Scripting.resources.dll as tr/Microsoft.CodeAnalysis.Scripting.resources.dll
2026-09-08T18:57:59.9860504Z I0908 15:57:59.985899   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr/Microsoft.CodeAnalysis.Workspaces.resources.dll as tr/Microsoft.CodeAnalysis.Workspaces.resources.dll
2026-09-08T18:57:59.9867998Z I0908 15:57:59.986704   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr/Microsoft.CodeAnalysis.resources.dll as tr/Microsoft.CodeAnalysis.resources.dll
2026-09-08T18:57:59.9894395Z I0908 15:57:59.989308   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr/Microsoft.Data.SqlClient.resources.dll as tr/Microsoft.Data.SqlClient.resources.dll
2026-09-08T18:57:59.9985835Z I0908 15:57:59.998281   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr/Microsoft.TestPlatform.CommunicationUtilities.resources.dll as tr/Microsoft.TestPlatform.CommunicationUtilities.resources.dll
2026-09-08T18:57:59.9991502Z I0908 15:57:59.998976   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr/Microsoft.TestPlatform.CoreUtilities.resources.dll as tr/Microsoft.TestPlatform.CoreUtilities.resources.dll
2026-09-08T18:58:00.0003308Z I0908 15:58:00.000156   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr/Microsoft.TestPlatform.CrossPlatEngine.resources.dll as tr/Microsoft.TestPlatform.CrossPlatEngine.resources.dll
2026-09-08T18:58:00.0003764Z I0908 15:58:00.000257   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr/Microsoft.VisualStudio.TestPlatform.Common.resources.dll as tr/Microsoft.VisualStudio.TestPlatform.Common.resources.dll
2026-09-08T18:58:00.0007122Z I0908 15:58:00.000613   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll as tr/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll
2026-09-08T18:58:00.0027926Z I0908 15:58:00.001700   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr/Microsoft.VisualStudio.TraceDataCollector.resources.dll as tr/Microsoft.VisualStudio.TraceDataCollector.resources.dll
2026-09-08T18:58:00.0028314Z I0908 15:58:00.001872   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/uk as uk
2026-09-08T18:58:00.0028634Z I0908 15:58:00.002202   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/uk/Humanizer.resources.dll as uk/Humanizer.resources.dll
2026-09-08T18:58:00.0028940Z I0908 15:58:00.002276   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/uz-Cyrl-UZ as uz-Cyrl-UZ
2026-09-08T18:58:00.0033315Z I0908 15:58:00.003209   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/uz-Cyrl-UZ/Humanizer.resources.dll as uz-Cyrl-UZ/Humanizer.resources.dll
2026-09-08T18:58:00.0034355Z I0908 15:58:00.003358   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/uz-Latn-UZ as uz-Latn-UZ
2026-09-08T18:58:00.0036690Z I0908 15:58:00.003514   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/uz-Latn-UZ/Humanizer.resources.dll as uz-Latn-UZ/Humanizer.resources.dll
2026-09-08T18:58:00.0037060Z I0908 15:58:00.003578   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/vi as vi
2026-09-08T18:58:00.0038554Z I0908 15:58:00.003771   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/vi/Humanizer.resources.dll as vi/Humanizer.resources.dll
2026-09-08T18:58:00.0039155Z I0908 15:58:00.003851   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/web.config as web.config
2026-09-08T18:58:00.0041734Z I0908 15:58:00.004093   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/xunit.abstractions.dll as xunit.abstractions.dll
2026-09-08T18:58:00.0044501Z I0908 15:58:00.004375   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/xunit.assert.dll as xunit.assert.dll
2026-09-08T18:58:00.0088188Z I0908 15:58:00.008702   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/xunit.core.dll as xunit.core.dll
2026-09-08T18:58:00.0136040Z I0908 15:58:00.011842   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/xunit.execution.dotnet.dll as xunit.execution.dotnet.dll
2026-09-08T18:58:00.0227474Z I0908 15:58:00.022522   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/xunit.runner.reporters.netcoreapp10.dll as xunit.runner.reporters.netcoreapp10.dll
2026-09-08T18:58:00.0264242Z I0908 15:58:00.026249   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/xunit.runner.utility.netcoreapp10.dll as xunit.runner.utility.netcoreapp10.dll
2026-09-08T18:58:00.0361233Z I0908 15:58:00.035316   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/xunit.runner.visualstudio.dotnetcore.testadapter.dll as xunit.runner.visualstudio.dotnetcore.testadapter.dll
2026-09-08T18:58:00.0428607Z I0908 15:58:00.041852   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-CN as zh-CN
2026-09-08T18:58:00.0428983Z I0908 15:58:00.041941   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-CN/Humanizer.resources.dll as zh-CN/Humanizer.resources.dll
2026-09-08T18:58:00.0429533Z I0908 15:58:00.042019   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans as zh-Hans
2026-09-08T18:58:00.0429889Z I0908 15:58:00.042241   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans/Humanizer.resources.dll as zh-Hans/Humanizer.resources.dll
2026-09-08T18:58:00.0430361Z I0908 15:58:00.042287   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans/Microsoft.CodeAnalysis.CSharp.Features.resources.dll as zh-Hans/Microsoft.CodeAnalysis.CSharp.Features.resources.dll
2026-09-08T18:58:00.0437753Z I0908 15:58:00.043647   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll as zh-Hans/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll
2026-09-08T18:58:00.0439934Z I0908 15:58:00.043903   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans/Microsoft.CodeAnalysis.CSharp.resources.dll as zh-Hans/Microsoft.CodeAnalysis.CSharp.resources.dll
2026-09-08T18:58:00.0587549Z I0908 15:58:00.058493   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans/Microsoft.CodeAnalysis.Features.resources.dll as zh-Hans/Microsoft.CodeAnalysis.Features.resources.dll
2026-09-08T18:58:00.0652058Z I0908 15:58:00.065023   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans/Microsoft.CodeAnalysis.Scripting.resources.dll as zh-Hans/Microsoft.CodeAnalysis.Scripting.resources.dll
2026-09-08T18:58:00.0655456Z I0908 15:58:00.065405   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans/Microsoft.CodeAnalysis.Workspaces.resources.dll as zh-Hans/Microsoft.CodeAnalysis.Workspaces.resources.dll
2026-09-08T18:58:00.0676209Z I0908 15:58:00.066843   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans/Microsoft.CodeAnalysis.resources.dll as zh-Hans/Microsoft.CodeAnalysis.resources.dll
2026-09-08T18:58:00.0693157Z I0908 15:58:00.068594   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans/Microsoft.Data.SqlClient.resources.dll as zh-Hans/Microsoft.Data.SqlClient.resources.dll
2026-09-08T18:58:00.0778329Z I0908 15:58:00.077617   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans/Microsoft.TestPlatform.CommunicationUtilities.resources.dll as zh-Hans/Microsoft.TestPlatform.CommunicationUtilities.resources.dll
2026-09-08T18:58:00.0779324Z I0908 15:58:00.077788   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans/Microsoft.TestPlatform.CoreUtilities.resources.dll as zh-Hans/Microsoft.TestPlatform.CoreUtilities.resources.dll
2026-09-08T18:58:00.0783217Z I0908 15:58:00.078201   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans/Microsoft.TestPlatform.CrossPlatEngine.resources.dll as zh-Hans/Microsoft.TestPlatform.CrossPlatEngine.resources.dll
2026-09-08T18:58:00.0784190Z I0908 15:58:00.078324   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans/Microsoft.VisualStudio.TestPlatform.Common.resources.dll as zh-Hans/Microsoft.VisualStudio.TestPlatform.Common.resources.dll
2026-09-08T18:58:00.0803313Z I0908 15:58:00.079178   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll as zh-Hans/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll
2026-09-08T18:58:00.0803791Z I0908 15:58:00.079639   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans/Microsoft.VisualStudio.TraceDataCollector.resources.dll as zh-Hans/Microsoft.VisualStudio.TraceDataCollector.resources.dll
2026-09-08T18:58:00.0804206Z I0908 15:58:00.080001   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant as zh-Hant
2026-09-08T18:58:00.0822484Z I0908 15:58:00.080731   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant/Humanizer.resources.dll as zh-Hant/Humanizer.resources.dll
2026-09-08T18:58:00.0822908Z I0908 15:58:00.080799   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant/Microsoft.CodeAnalysis.CSharp.Features.resources.dll as zh-Hant/Microsoft.CodeAnalysis.CSharp.Features.resources.dll
2026-09-08T18:58:00.0826310Z I0908 15:58:00.082517   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll as zh-Hant/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll
2026-09-08T18:58:00.0827262Z I0908 15:58:00.082636   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant/Microsoft.CodeAnalysis.CSharp.resources.dll as zh-Hant/Microsoft.CodeAnalysis.CSharp.resources.dll
2026-09-08T18:58:00.1059706Z I0908 15:58:00.098324   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant/Microsoft.CodeAnalysis.Features.resources.dll as zh-Hant/Microsoft.CodeAnalysis.Features.resources.dll
2026-09-08T18:58:00.1060198Z I0908 15:58:00.103625   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant/Microsoft.CodeAnalysis.Scripting.resources.dll as zh-Hant/Microsoft.CodeAnalysis.Scripting.resources.dll
2026-09-08T18:58:00.1060614Z I0908 15:58:00.104553   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant/Microsoft.CodeAnalysis.Workspaces.resources.dll as zh-Hant/Microsoft.CodeAnalysis.Workspaces.resources.dll
2026-09-08T18:58:00.1061044Z I0908 15:58:00.105389   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant/Microsoft.CodeAnalysis.resources.dll as zh-Hant/Microsoft.CodeAnalysis.resources.dll
2026-09-08T18:58:00.1091196Z I0908 15:58:00.108448   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant/Microsoft.Data.SqlClient.resources.dll as zh-Hant/Microsoft.Data.SqlClient.resources.dll
2026-09-08T18:58:00.1175852Z I0908 15:58:00.117302   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant/Microsoft.TestPlatform.CommunicationUtilities.resources.dll as zh-Hant/Microsoft.TestPlatform.CommunicationUtilities.resources.dll
2026-09-08T18:58:00.1176445Z I0908 15:58:00.117445   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant/Microsoft.TestPlatform.CoreUtilities.resources.dll as zh-Hant/Microsoft.TestPlatform.CoreUtilities.resources.dll
2026-09-08T18:58:00.1184603Z I0908 15:58:00.118348   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant/Microsoft.TestPlatform.CrossPlatEngine.resources.dll as zh-Hant/Microsoft.TestPlatform.CrossPlatEngine.resources.dll
2026-09-08T18:58:00.1188288Z I0908 15:58:00.118697   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant/Microsoft.VisualStudio.TestPlatform.Common.resources.dll as zh-Hant/Microsoft.VisualStudio.TestPlatform.Common.resources.dll
2026-09-08T18:58:00.1189034Z I0908 15:58:00.118796   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll as zh-Hant/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll
2026-09-08T18:58:00.1192254Z I0908 15:58:00.119096   65052 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant/Microsoft.VisualStudio.TraceDataCollector.resources.dll as zh-Hant/Microsoft.VisualStudio.TraceDataCollector.resources.dll
2026-09-08T18:58:00.1242845Z 
2026-09-08T18:58:00.1243395Z Uploading finished
2026-09-08T18:58:00.1243787Z build.build.openshift.io/sisou-api-sac-internet-181 started
2026-09-08T18:58:00.1340312Z Adding cluster TLS certificate authority to trust store
2026-09-08T18:58:00.1340528Z Receiving source from STDIN as archive ...
2026-09-08T18:58:05.2840870Z Adding cluster TLS certificate authority to trust store
2026-09-08T18:58:08.2971983Z Adding cluster TLS certificate authority to trust store
2026-09-08T18:58:26.9762485Z time="2026-09-08T18:58:26Z" level=info msg="Not using native diff for overlay, this may cause degraded performance for building images: kernel has CONFIG_OVERLAY_FS_REDIRECT_DIR enabled"
2026-09-08T18:58:26.9768066Z I0908 18:58:26.976091       1 defaults.go:102] Defaulting to storage driver "overlay" with options [mountopt=metacopy=on].
2026-09-08T18:58:27.0899350Z Caching blobs under "/var/cache/blobs".
2026-09-08T18:58:27.0936818Z Trying to pull registry.redhat.io/rhel8/dotnet-80-runtime@sha256:fb5de5fe3b3e47713307c1553f59000e41a7cdeb03d4cf838031d86ef906dcbb...
2026-09-08T18:58:29.4507254Z Getting image source signatures
2026-09-08T18:58:30.7797478Z Copying blob sha256:e0348fdb2685077d22116d294a90a253709aba78815882a57fcc536b22dcae2f
2026-09-08T18:58:30.8118751Z Copying blob sha256:f5388226138df9f987cca2aa02e1a44771f8a97d25ac296673cbb41a585de1d5
2026-09-08T18:58:37.8908687Z Copying config sha256:77494087d97109238779ca2731988377fdc3bb86f24d21fc7b501f1eeb47d2bc
2026-09-08T18:58:37.9579511Z Writing manifest to image destination
2026-09-08T18:58:37.9715811Z Storing signatures
2026-09-08T18:58:39.7667439Z Generating dockerfile with builder image registry.redhat.io/rhel8/dotnet-80-runtime@sha256:fb5de5fe3b3e47713307c1553f59000e41a7cdeb03d4cf838031d86ef906dcbb
2026-09-08T18:58:40.0840427Z STEP 1/9: FROM registry.redhat.io/rhel8/dotnet-80-runtime@sha256:fb5de5fe3b3e47713307c1553f59000e41a7cdeb03d4cf838031d86ef906dcbb
2026-09-08T18:58:40.1774307Z STEP 2/9: LABEL "io.openshift.build.image"="registry.redhat.io/rhel8/dotnet-80-runtime@sha256:fb5de5fe3b3e47713307c1553f59000e41a7cdeb03d4cf838031d86ef906dcbb"       "io.openshift.build.source-location"="/tmp/build/inputs"
2026-09-08T18:58:40.2077329Z STEP 3/9: ENV OPENSHIFT_BUILD_NAME="sisou-api-sac-internet-181"     OPENSHIFT_BUILD_NAMESPACE="build-images-ads"
2026-09-08T18:58:40.2398936Z STEP 4/9: USER root
2026-09-08T18:58:40.2988521Z STEP 5/9: COPY upload/src /tmp/src
2026-09-08T18:58:41.1674684Z STEP 6/9: RUN chown -R 1001:0 /tmp/src
2026-09-08T18:58:41.5922033Z STEP 7/9: USER 1001
2026-09-08T18:58:41.6257420Z STEP 8/9: RUN /usr/libexec/s2i/assemble
2026-09-08T18:58:43.1234758Z ---> Installing application...
2026-09-08T18:58:43.1330692Z error: cannot find startup assembly
2026-09-08T18:58:43.1331026Z This image does not contain an sdk and can only be used with pre-built applications.
2026-09-08T18:58:43.1335199Z If your startup assembly is not in the root folder, you can specify it using DOTNET_STARTUP_ASSEMBLY.
2026-09-08T18:58:43.1335437Z If you want to build an application, you must use the sdk image instead.
2026-09-08T18:58:43.2162033Z error: build error: error building at STEP "RUN /usr/libexec/s2i/assemble": error while running runtime: exit status 1
2026-09-08T18:58:44.2676532Z error: the build build-images-ads/sisou-api-sac-internet-181 status is "Failed"
2026-09-08T18:58:44.2740446Z ##[error]Bash exited with code '1'.
2026-09-08T18:58:44.2778492Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 1 out of 1) after 1000 ms
2026-09-08T18:58:45.3619034Z Generating script.
2026-09-08T18:58:45.3632291Z ========================== Starting Command Output ===========================
2026-09-08T18:58:45.3639276Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/92e11867-06e8-458c-a4cc-503ad38ca6f4.sh
2026-09-08T18:58:45.3726109Z + echo okd4_nprd
2026-09-08T18:58:45.3726523Z + egrep -q '^(okd4|ocp)'
2026-09-08T18:58:45.3829592Z + buildconfig=sisou-api-sac-internet
2026-09-08T18:58:45.3830691Z + DOTNET_ASSEMBLY=SISEI-csharp-batch.dll
2026-09-08T18:58:45.3830976Z + DOTNET_CONFIG=SISEI-csharp-batch.runtimeconfig.json
2026-09-08T18:58:45.3831201Z + cd /opt/ads-agent/_work/34/a
2026-09-08T18:58:45.3831406Z + FILES=(`find -maxdepth 1 -name "*.runtimeconfig*.json"`)
2026-09-08T18:58:45.3832380Z ++ find -maxdepth 1 -name '*.runtimeconfig*.json'
2026-09-08T18:58:45.3890648Z + '[' -d /opt/ads-agent/_work/34/s/target/server ']'
2026-09-08T18:58:45.3890965Z + '[' -d /opt/ads-agent/_work/34/s/ear/target/server ']'
2026-09-08T18:58:45.3891185Z + '[' -n '' ']'
2026-09-08T18:58:45.3891515Z + oc start-build sisou-api-sac-internet --from-dir=/opt/ads-agent/_work/34/a --follow --wait=true -n build-images-ads -v=5
2026-09-08T18:58:45.4544392Z I0908 15:58:45.453999   65093 repository.go:450] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
2026-09-08T18:58:45.4563593Z I0908 15:58:45.456195   65093 repository.go:533] Error executing command: exit status 128
2026-09-08T18:58:45.4564616Z Uploading directory "/opt/ads-agent/_work/34/a" as binary input for the build ...
2026-09-08T18:58:45.4564957Z I0908 15:58:45.456360   65093 tar.go:238] Adding "/opt/ads-agent/_work/34/a" to tar ...
2026-09-08T18:58:45.4568617Z I0908 15:58:45.456767   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/.sqAnalysis as .sqAnalysis
2026-09-08T18:58:45.4573129Z I0908 15:58:45.457236   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/.sqAnalysis/SonarQubeBuildSummary.md as .sqAnalysis/SonarQubeBuildSummary.md
2026-09-08T18:58:45.4575150Z I0908 15:58:45.457446   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Azure.Core.dll as Azure.Core.dll
2026-09-08T18:58:45.4774474Z I0908 15:58:45.477185   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Azure.Identity.dll as Azure.Identity.dll
2026-09-08T18:58:45.4921467Z I0908 15:58:45.491876   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Castle.Core.dll as Castle.Core.dll
2026-09-08T18:58:45.5109040Z I0908 15:58:45.510664   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage as CodeCoverage
2026-09-08T18:58:45.5125561Z I0908 15:58:45.512450   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/CodeCoverage.config as CodeCoverage/CodeCoverage.config
2026-09-08T18:58:45.5127417Z I0908 15:58:45.512654   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/CodeCoverage.exe as CodeCoverage/CodeCoverage.exe
2026-09-08T18:58:49.7898202Z I0908 15:58:49.789433   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/VanguardInstrumentationProfiler_x86.config as CodeCoverage/VanguardInstrumentationProfiler_x86.config
2026-09-08T18:58:49.7898670Z I0908 15:58:49.789584   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/amd64 as CodeCoverage/amd64
2026-09-08T18:58:49.7899032Z I0908 15:58:49.789632   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/amd64/CodeCoverage.exe as CodeCoverage/amd64/CodeCoverage.exe
2026-09-08T18:58:49.8363731Z I0908 15:58:49.835933   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/amd64/VanguardInstrumentationProfiler_x64.config as CodeCoverage/amd64/VanguardInstrumentationProfiler_x64.config
2026-09-08T18:58:49.8370870Z I0908 15:58:49.836922   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/amd64/covrun64.dll as CodeCoverage/amd64/covrun64.dll
2026-09-08T18:58:49.9029890Z I0908 15:58:49.902659   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/amd64/msdia140.dll as CodeCoverage/amd64/msdia140.dll
2026-09-08T18:58:49.9874699Z I0908 15:58:49.987074   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/arm64 as CodeCoverage/arm64
2026-09-08T18:58:49.9891267Z I0908 15:58:49.987374   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/arm64/VanguardInstrumentationProfiler_arm64.config as CodeCoverage/arm64/VanguardInstrumentationProfiler_arm64.config
2026-09-08T18:58:49.9891754Z I0908 15:58:49.987437   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/arm64/covrunarm64.dll as CodeCoverage/arm64/covrunarm64.dll
2026-09-08T18:58:50.0272360Z I0908 15:58:50.026856   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/arm64/msdia140.dll as CodeCoverage/arm64/msdia140.dll
2026-09-08T18:58:50.1674333Z I0908 15:58:50.167055   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/codecoveragemessages.dll as CodeCoverage/codecoveragemessages.dll
2026-09-08T18:58:50.1688102Z I0908 15:58:50.168506   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/coreclr as CodeCoverage/coreclr
2026-09-08T18:58:50.1688648Z I0908 15:58:50.168642   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/coreclr/Microsoft.VisualStudio.CodeCoverage.Shim.dll as CodeCoverage/coreclr/Microsoft.VisualStudio.CodeCoverage.Shim.dll
2026-09-08T18:58:50.1689112Z I0908 15:58:50.168771   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/covrun32.dll as CodeCoverage/covrun32.dll
2026-09-08T18:58:50.2178865Z I0908 15:58:50.217469   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/CodeCoverage/msdia140.dll as CodeCoverage/msdia140.dll
2026-09-08T18:58:50.2846041Z I0908 15:58:50.284235   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/DotNetEnv.dll as DotNetEnv.dll
2026-09-08T18:58:50.2861596Z I0908 15:58:50.286032   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/FluentValidation.AspNetCore.dll as FluentValidation.AspNetCore.dll
2026-09-08T18:58:50.2896773Z I0908 15:58:50.289520   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/FluentValidation.DependencyInjectionExtensions.dll as FluentValidation.DependencyInjectionExtensions.dll
2026-09-08T18:58:50.2897239Z I0908 15:58:50.289610   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/FluentValidation.dll as FluentValidation.dll
2026-09-08T18:58:50.3060463Z I0908 15:58:50.305805   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Humanizer.dll as Humanizer.dll
2026-09-08T18:58:50.3199536Z I0908 15:58:50.319618   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ICSharpCode.SharpZipLib.dll as ICSharpCode.SharpZipLib.dll
2026-09-08T18:58:50.3312474Z I0908 15:58:50.330919   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine as InstrumentationEngine
2026-09-08T18:58:50.3327118Z I0908 15:58:50.332549   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/alpine as InstrumentationEngine/alpine
2026-09-08T18:58:50.3327577Z I0908 15:58:50.332620   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/alpine/x64 as InstrumentationEngine/alpine/x64
2026-09-08T18:58:50.3328026Z I0908 15:58:50.332666   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/alpine/x64/VanguardInstrumentationProfiler_x64.config as InstrumentationEngine/alpine/x64/VanguardInstrumentationProfiler_x64.config
2026-09-08T18:58:50.3328503Z I0908 15:58:50.332733   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/alpine/x64/libCoverageInstrumentationMethod.so as InstrumentationEngine/alpine/x64/libCoverageInstrumentationMethod.so
2026-09-08T18:58:50.3338246Z I0908 15:58:50.333715   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/alpine/x64/libInstrumentationEngine.so as InstrumentationEngine/alpine/x64/libInstrumentationEngine.so
2026-09-08T18:58:50.4155780Z I0908 15:58:50.415258   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/arm64 as InstrumentationEngine/arm64
2026-09-08T18:58:50.4157730Z I0908 15:58:50.415649   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/arm64/MicrosoftInstrumentationEngine_arm64.dll as InstrumentationEngine/arm64/MicrosoftInstrumentationEngine_arm64.dll
2026-09-08T18:58:50.4646845Z .I0908 15:58:50.464467   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/macos as InstrumentationEngine/macos
2026-09-08T18:58:50.4648158Z I0908 15:58:50.464735   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/macos/x64 as InstrumentationEngine/macos/x64
2026-09-08T18:58:50.4648663Z I0908 15:58:50.464795   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/macos/x64/VanguardInstrumentationProfiler_x64.config as InstrumentationEngine/macos/x64/VanguardInstrumentationProfiler_x64.config
2026-09-08T18:58:50.4649512Z I0908 15:58:50.464882   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/macos/x64/libCoverageInstrumentationMethod.dylib as InstrumentationEngine/macos/x64/libCoverageInstrumentationMethod.dylib
2026-09-08T18:58:50.4674627Z I0908 15:58:50.467365   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/macos/x64/libInstrumentationEngine.dylib as InstrumentationEngine/macos/x64/libInstrumentationEngine.dylib
2026-09-08T18:58:50.5426992Z I0908 15:58:50.542379   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/ubuntu as InstrumentationEngine/ubuntu
2026-09-08T18:58:50.5434220Z I0908 15:58:50.542477   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/ubuntu/x64 as InstrumentationEngine/ubuntu/x64
2026-09-08T18:58:50.5435070Z I0908 15:58:50.542534   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/ubuntu/x64/VanguardInstrumentationProfiler_x64.config as InstrumentationEngine/ubuntu/x64/VanguardInstrumentationProfiler_x64.config
2026-09-08T18:58:50.5436349Z I0908 15:58:50.542595   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/ubuntu/x64/libCoverageInstrumentationMethod.so as InstrumentationEngine/ubuntu/x64/libCoverageInstrumentationMethod.so
2026-09-08T18:58:50.5458160Z I0908 15:58:50.545665   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/ubuntu/x64/libInstrumentationEngine.so as InstrumentationEngine/ubuntu/x64/libInstrumentationEngine.so
2026-09-08T18:58:50.6304690Z I0908 15:58:50.629989   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/x64 as InstrumentationEngine/x64
2026-09-08T18:58:50.6305467Z I0908 15:58:50.630203   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/x64/MicrosoftInstrumentationEngine_x64.dll as InstrumentationEngine/x64/MicrosoftInstrumentationEngine_x64.dll
2026-09-08T18:58:50.6838611Z I0908 15:58:50.683524   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/x86 as InstrumentationEngine/x86
2026-09-08T18:58:50.6847028Z I0908 15:58:50.684584   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/InstrumentationEngine/x86/MicrosoftInstrumentationEngine_x86.dll as InstrumentationEngine/x86/MicrosoftInstrumentationEngine_x86.dll
2026-09-08T18:58:50.7300544Z I0908 15:58:50.729767   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.AspNetCore.Authentication.JwtBearer.dll as Microsoft.AspNetCore.Authentication.JwtBearer.dll
2026-09-08T18:58:50.7328033Z I0908 15:58:50.732660   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.AspNetCore.Razor.Language.dll as Microsoft.AspNetCore.Razor.Language.dll
2026-09-08T18:58:50.7787842Z I0908 15:58:50.778365   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.Bcl.AsyncInterfaces.dll as Microsoft.Bcl.AsyncInterfaces.dll
2026-09-08T18:58:50.7788281Z I0908 15:58:50.778626   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.Bcl.Cryptography.dll as Microsoft.Bcl.Cryptography.dll
2026-09-08T18:58:50.7801655Z I0908 15:58:50.780062   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.Build.Framework.dll as Microsoft.Build.Framework.dll
2026-09-08T18:58:50.7916020Z I0908 15:58:50.791453   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.Build.dll as Microsoft.Build.dll
2026-09-08T18:58:50.8806768Z I0908 15:58:50.880322   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CSharp.dll as Microsoft.CSharp.dll
2026-09-08T18:58:50.8998216Z I0908 15:58:50.899503   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CodeAnalysis.AnalyzerUtilities.dll as Microsoft.CodeAnalysis.AnalyzerUtilities.dll
2026-09-08T18:58:50.9233893Z I0908 15:58:50.923117   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CodeAnalysis.CSharp.Features.dll as Microsoft.CodeAnalysis.CSharp.Features.dll
2026-09-08T18:58:51.0202597Z I0908 15:58:51.019785   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CodeAnalysis.CSharp.Workspaces.dll as Microsoft.CodeAnalysis.CSharp.Workspaces.dll
2026-09-08T18:58:51.0609952Z I0908 15:58:51.060636   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CodeAnalysis.CSharp.dll as Microsoft.CodeAnalysis.CSharp.dll
2026-09-08T18:58:51.3749864Z I0908 15:58:51.374560   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CodeAnalysis.Elfie.dll as Microsoft.CodeAnalysis.Elfie.dll
2026-09-08T18:58:51.3818866Z I0908 15:58:51.381600   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CodeAnalysis.Features.dll as Microsoft.CodeAnalysis.Features.dll
2026-09-08T18:58:51.6285240Z I0908 15:58:51.627902   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CodeAnalysis.Razor.dll as Microsoft.CodeAnalysis.Razor.dll
2026-09-08T18:58:51.6303117Z I0908 15:58:51.630196   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CodeAnalysis.Scripting.dll as Microsoft.CodeAnalysis.Scripting.dll
2026-09-08T18:58:51.6375258Z I0908 15:58:51.636868   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CodeAnalysis.Workspaces.dll as Microsoft.CodeAnalysis.Workspaces.dll
2026-09-08T18:58:51.8212413Z I0908 15:58:51.820887   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CodeAnalysis.dll as Microsoft.CodeAnalysis.dll
2026-09-08T18:58:51.9577063Z I0908 15:58:51.957306   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CodeCoverage.Core.dll as Microsoft.CodeCoverage.Core.dll
2026-09-08T18:58:51.9745326Z I0908 15:58:51.974176   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CodeCoverage.Instrumentation.dll as Microsoft.CodeCoverage.Instrumentation.dll
2026-09-08T18:58:51.9802473Z I0908 15:58:51.980082   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CodeCoverage.Interprocess.dll as Microsoft.CodeCoverage.Interprocess.dll
2026-09-08T18:58:51.9851122Z I0908 15:58:51.984969   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CodeCoverage.props as Microsoft.CodeCoverage.props
2026-09-08T18:58:51.9890192Z I0908 15:58:51.985263   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.CodeCoverage.targets as Microsoft.CodeCoverage.targets
2026-09-08T18:58:51.9890599Z I0908 15:58:51.985318   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.Data.SqlClient.dll as Microsoft.Data.SqlClient.dll
2026-09-08T18:58:52.0199288Z I0908 15:58:52.019528   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.DiaSymReader.dll as Microsoft.DiaSymReader.dll
2026-09-08T18:58:52.0227296Z I0908 15:58:52.022557   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.DotNet.PlatformAbstractions.dll as Microsoft.DotNet.PlatformAbstractions.dll
2026-09-08T18:58:52.0240286Z I0908 15:58:52.023921   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.DotNet.Scaffolding.Shared.dll as Microsoft.DotNet.Scaffolding.Shared.dll
2026-09-08T18:58:52.0293749Z I0908 15:58:52.029233   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.EntityFrameworkCore.Abstractions.dll as Microsoft.EntityFrameworkCore.Abstractions.dll
2026-09-08T18:58:52.0308964Z I0908 15:58:52.030708   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.EntityFrameworkCore.Relational.dll as Microsoft.EntityFrameworkCore.Relational.dll
2026-09-08T18:58:52.1128807Z I0908 15:58:52.112487   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.EntityFrameworkCore.SqlServer.dll as Microsoft.EntityFrameworkCore.SqlServer.dll
2026-09-08T18:58:52.1358833Z I0908 15:58:52.135537   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.EntityFrameworkCore.dll as Microsoft.EntityFrameworkCore.dll
2026-09-08T18:58:52.2420204Z I0908 15:58:52.241628   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.Extensions.Caching.Memory.dll as Microsoft.Extensions.Caching.Memory.dll
2026-09-08T18:58:52.2440117Z I0908 15:58:52.243826   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.Extensions.DependencyInjection.Abstractions.dll as Microsoft.Extensions.DependencyInjection.Abstractions.dll
2026-09-08T18:58:52.2462493Z I0908 15:58:52.245666   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.Extensions.DependencyInjection.dll as Microsoft.Extensions.DependencyInjection.dll
2026-09-08T18:58:52.2509117Z I0908 15:58:52.250677   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.Extensions.DependencyModel.dll as Microsoft.Extensions.DependencyModel.dll
2026-09-08T18:58:52.2543184Z I0908 15:58:52.254091   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.Extensions.FileSystemGlobbing.dll as Microsoft.Extensions.FileSystemGlobbing.dll
2026-09-08T18:58:52.2561349Z I0908 15:58:52.255925   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.Extensions.Logging.Abstractions.dll as Microsoft.Extensions.Logging.Abstractions.dll
2026-09-08T18:58:52.2586803Z I0908 15:58:52.258528   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.Extensions.Options.dll as Microsoft.Extensions.Options.dll
2026-09-08T18:58:52.2608196Z I0908 15:58:52.260658   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.Identity.Client.Extensions.Msal.dll as Microsoft.Identity.Client.Extensions.Msal.dll
2026-09-08T18:58:52.2636836Z I0908 15:58:52.263543   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.Identity.Client.dll as Microsoft.Identity.Client.dll
2026-09-08T18:58:52.3112074Z I0908 15:58:52.310808   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.IdentityModel.Abstractions.dll as Microsoft.IdentityModel.Abstractions.dll
2026-09-08T18:58:52.3112552Z I0908 15:58:52.310979   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.IdentityModel.JsonWebTokens.dll as Microsoft.IdentityModel.JsonWebTokens.dll
2026-09-08T18:58:52.3164542Z I0908 15:58:52.316253   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.IdentityModel.Logging.dll as Microsoft.IdentityModel.Logging.dll
2026-09-08T18:58:52.3178932Z I0908 15:58:52.317715   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.IdentityModel.Protocols.OpenIdConnect.dll as Microsoft.IdentityModel.Protocols.OpenIdConnect.dll
2026-09-08T18:58:52.3207973Z I0908 15:58:52.320614   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.IdentityModel.Protocols.dll as Microsoft.IdentityModel.Protocols.dll
2026-09-08T18:58:52.3229588Z I0908 15:58:52.322423   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.IdentityModel.Tokens.dll as Microsoft.IdentityModel.Tokens.dll
2026-09-08T18:58:52.3348033Z I0908 15:58:52.334010   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.NET.StringTools.dll as Microsoft.NET.StringTools.dll
2026-09-08T18:58:52.3352903Z I0908 15:58:52.335197   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.OpenApi.dll as Microsoft.OpenApi.dll
2026-09-08T18:58:52.3456942Z I0908 15:58:52.345543   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.SqlServer.Server.dll as Microsoft.SqlServer.Server.dll
2026-09-08T18:58:52.3460449Z I0908 15:58:52.345748   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.TestPlatform.CommunicationUtilities.dll as Microsoft.TestPlatform.CommunicationUtilities.dll
2026-09-08T18:58:52.3504944Z I0908 15:58:52.350183   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.TestPlatform.CoreUtilities.dll as Microsoft.TestPlatform.CoreUtilities.dll
2026-09-08T18:58:52.3537241Z I0908 15:58:52.353570   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.TestPlatform.CrossPlatEngine.dll as Microsoft.TestPlatform.CrossPlatEngine.dll
2026-09-08T18:58:52.3659250Z I0908 15:58:52.365687   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.TestPlatform.PlatformAbstractions.dll as Microsoft.TestPlatform.PlatformAbstractions.dll
2026-09-08T18:58:52.3673133Z I0908 15:58:52.367045   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.TestPlatform.Utilities.dll as Microsoft.TestPlatform.Utilities.dll
2026-09-08T18:58:52.3707799Z I0908 15:58:52.369617   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.VisualStudio.CodeCoverage.Shim.dll as Microsoft.VisualStudio.CodeCoverage.Shim.dll
2026-09-08T18:58:52.3708432Z I0908 15:58:52.370006   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.VisualStudio.TestPlatform.Common.dll as Microsoft.VisualStudio.TestPlatform.Common.dll
2026-09-08T18:58:52.3792968Z I0908 15:58:52.379084   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.VisualStudio.TestPlatform.ObjectModel.dll as Microsoft.VisualStudio.TestPlatform.ObjectModel.dll
2026-09-08T18:58:52.3879701Z I0908 15:58:52.387134   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.VisualStudio.TraceDataCollector.dll as Microsoft.VisualStudio.TraceDataCollector.dll
2026-09-08T18:58:52.3930578Z I0908 15:58:52.391658   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.VisualStudio.Web.CodeGeneration.Core.dll as Microsoft.VisualStudio.Web.CodeGeneration.Core.dll
2026-09-08T18:58:52.3941613Z I0908 15:58:52.393972   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.VisualStudio.Web.CodeGeneration.EntityFrameworkCore.dll as Microsoft.VisualStudio.Web.CodeGeneration.EntityFrameworkCore.dll
2026-09-08T18:58:52.3981930Z I0908 15:58:52.397304   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.VisualStudio.Web.CodeGeneration.Templating.dll as Microsoft.VisualStudio.Web.CodeGeneration.Templating.dll
2026-09-08T18:58:52.3987815Z I0908 15:58:52.398630   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.VisualStudio.Web.CodeGeneration.Utils.dll as Microsoft.VisualStudio.Web.CodeGeneration.Utils.dll
2026-09-08T18:58:52.3995415Z I0908 15:58:52.399410   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.VisualStudio.Web.CodeGeneration.dll as Microsoft.VisualStudio.Web.CodeGeneration.dll
2026-09-08T18:58:52.4027747Z I0908 15:58:52.402615   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.VisualStudio.Web.CodeGenerators.Mvc.dll as Microsoft.VisualStudio.Web.CodeGenerators.Mvc.dll
2026-09-08T18:58:52.4130607Z I0908 15:58:52.412847   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Microsoft.Win32.SystemEvents.dll as Microsoft.Win32.SystemEvents.dll
2026-09-08T18:58:52.4141621Z I0908 15:58:52.414042   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Mono.Cecil.Mdb.dll as Mono.Cecil.Mdb.dll
2026-09-08T18:58:52.4152294Z I0908 15:58:52.415125   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Mono.Cecil.Pdb.dll as Mono.Cecil.Pdb.dll
2026-09-08T18:58:52.4209159Z I0908 15:58:52.420752   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Mono.Cecil.Rocks.dll as Mono.Cecil.Rocks.dll
2026-09-08T18:58:52.4225954Z I0908 15:58:52.422426   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Mono.Cecil.dll as Mono.Cecil.dll
2026-09-08T18:58:52.4393278Z I0908 15:58:52.439096   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Mono.TextTemplating.dll as Mono.TextTemplating.dll
2026-09-08T18:58:52.4461238Z I0908 15:58:52.445934   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Moq.dll as Moq.dll
2026-09-08T18:58:52.4591892Z I0908 15:58:52.458901   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Newtonsoft.Json.dll as Newtonsoft.Json.dll
2026-09-08T18:58:52.4911252Z I0908 15:58:52.490355   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/NuGet.Common.dll as NuGet.Common.dll
2026-09-08T18:58:52.4959726Z I0908 15:58:52.495776   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/NuGet.Configuration.dll as NuGet.Configuration.dll
2026-09-08T18:58:52.5023528Z I0908 15:58:52.502144   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/NuGet.DependencyResolver.Core.dll as NuGet.DependencyResolver.Core.dll
2026-09-08T18:58:52.5065427Z I0908 15:58:52.505809   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/NuGet.Frameworks.dll as NuGet.Frameworks.dll
2026-09-08T18:58:52.5110400Z I0908 15:58:52.510563   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/NuGet.LibraryModel.dll as NuGet.LibraryModel.dll
2026-09-08T18:58:52.5144733Z I0908 15:58:52.513345   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/NuGet.Packaging.dll as NuGet.Packaging.dll
2026-09-08T18:58:52.5438670Z I0908 15:58:52.543546   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/NuGet.ProjectModel.dll as NuGet.ProjectModel.dll
2026-09-08T18:58:52.5538820Z I0908 15:58:52.553630   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/NuGet.Protocol.dll as NuGet.Protocol.dll
2026-09-08T18:58:52.5903681Z I0908 15:58:52.590086   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/NuGet.Versioning.dll as NuGet.Versioning.dll
2026-09-08T18:58:52.5921025Z I0908 15:58:52.591941   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Oracle.EntityFrameworkCore.dll as Oracle.EntityFrameworkCore.dll
2026-09-08T18:58:52.6119125Z I0908 15:58:52.611323   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Oracle.ManagedDataAccess.dll as Oracle.ManagedDataAccess.dll
2026-09-08T18:58:52.8064348Z I0908 15:58:52.806083   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/PdfSharpCore.dll as PdfSharpCore.dll
2026-09-08T18:58:52.8319104Z I0908 15:58:52.831118   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Resources as Resources
2026-09-08T18:58:52.8319533Z I0908 15:58:52.831202   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Resources/Fonts as Resources/Fonts
2026-09-08T18:58:52.8319872Z I0908 15:58:52.831244   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Resources/Fonts/Arial.ttf as Resources/Fonts/Arial.ttf
2026-09-08T18:58:52.8761197Z I0908 15:58:52.873833   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Resources/Fonts/DejaVuSans-Bold.ttf as Resources/Fonts/DejaVuSans-Bold.ttf
2026-09-08T18:58:52.9038412Z I0908 15:58:52.903133   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Resources/Fonts/DejaVuSans.ttf as Resources/Fonts/DejaVuSans.ttf
2026-09-08T18:58:52.9371464Z I0908 15:58:52.936825   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Resources/Images as Resources/Images
2026-09-08T18:58:52.9372765Z I0908 15:58:52.937034   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Resources/Images/logo_caixa_POS_150x35.png as Resources/Images/logo_caixa_POS_150x35.png
2026-09-08T18:58:52.9373124Z I0908 15:58:52.937162   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/SISOU-api-sac-internet as SISOU-api-sac-internet
2026-09-08T18:58:52.9399928Z I0908 15:58:52.939835   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/SISOU-api-sac-internet.deps.json as SISOU-api-sac-internet.deps.json
2026-09-08T18:58:52.9437336Z I0908 15:58:52.943445   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/SISOU-api-sac-internet.dll as SISOU-api-sac-internet.dll
2026-09-08T18:58:53.0270507Z I0908 15:58:53.026632   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/SISOU-api-sac-internet.pdb as SISOU-api-sac-internet.pdb
2026-09-08T18:58:53.0434322Z I0908 15:58:53.043075   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/SISOU-api-sac-internet.xml as SISOU-api-sac-internet.xml
2026-09-08T18:58:53.0547445Z I0908 15:58:53.054326   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Scrutor.dll as Scrutor.dll
2026-09-08T18:58:53.0558004Z I0908 15:58:53.055475   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/SixLabors.Fonts.dll as SixLabors.Fonts.dll
2026-09-08T18:58:53.0748818Z I0908 15:58:53.074407   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/SixLabors.ImageSharp.dll as SixLabors.ImageSharp.dll
2026-09-08T18:58:53.1246547Z I0908 15:58:53.124300   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Sprache.dll as Sprache.dll
2026-09-08T18:58:53.1277736Z I0908 15:58:53.127553   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Swashbuckle.AspNetCore.Filters.Abstractions.dll as Swashbuckle.AspNetCore.Filters.Abstractions.dll
2026-09-08T18:58:53.1281869Z I0908 15:58:53.128068   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Swashbuckle.AspNetCore.Filters.dll as Swashbuckle.AspNetCore.Filters.dll
2026-09-08T18:58:53.1301773Z I0908 15:58:53.130073   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Swashbuckle.AspNetCore.Swagger.dll as Swashbuckle.AspNetCore.Swagger.dll
2026-09-08T18:58:53.1303962Z I0908 15:58:53.130295   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Swashbuckle.AspNetCore.SwaggerGen.dll as Swashbuckle.AspNetCore.SwaggerGen.dll
2026-09-08T18:58:53.1364147Z I0908 15:58:53.136260   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/Swashbuckle.AspNetCore.SwaggerUI.dll as Swashbuckle.AspNetCore.SwaggerUI.dll
2026-09-08T18:58:53.2179742Z I0908 15:58:53.217558   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.AppContext.dll as System.AppContext.dll
2026-09-08T18:58:53.2182304Z I0908 15:58:53.218125   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.ClientModel.dll as System.ClientModel.dll
2026-09-08T18:58:53.2183292Z I0908 15:58:53.218213   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.CodeDom.dll as System.CodeDom.dll
2026-09-08T18:58:53.2266290Z I0908 15:58:53.226410   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Collections.Immutable.dll as System.Collections.Immutable.dll
2026-09-08T18:58:53.2411109Z I0908 15:58:53.240938   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Composition.AttributedModel.dll as System.Composition.AttributedModel.dll
2026-09-08T18:58:53.2418679Z I0908 15:58:53.241773   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Composition.Convention.dll as System.Composition.Convention.dll
2026-09-08T18:58:53.2436809Z I0908 15:58:53.243563   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Composition.Hosting.dll as System.Composition.Hosting.dll
2026-09-08T18:58:53.2452706Z I0908 15:58:53.245183   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Composition.Runtime.dll as System.Composition.Runtime.dll
2026-09-08T18:58:53.2464066Z I0908 15:58:53.246321   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Composition.TypedParts.dll as System.Composition.TypedParts.dll
2026-09-08T18:58:53.2485183Z I0908 15:58:53.248389   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Configuration.ConfigurationManager.dll as System.Configuration.ConfigurationManager.dll
2026-09-08T18:58:53.2694614Z I0908 15:58:53.269085   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Diagnostics.EventLog.dll as System.Diagnostics.EventLog.dll
2026-09-08T18:58:53.2708285Z I0908 15:58:53.270652   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Diagnostics.PerformanceCounter.dll as System.Diagnostics.PerformanceCounter.dll
2026-09-08T18:58:53.2723793Z I0908 15:58:53.272249   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.DirectoryServices.Protocols.dll as System.DirectoryServices.Protocols.dll
2026-09-08T18:58:53.2757737Z I0908 15:58:53.275627   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.DirectoryServices.dll as System.DirectoryServices.dll
2026-09-08T18:58:53.2811865Z I0908 15:58:53.281023   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Drawing.Common.dll as System.Drawing.Common.dll
2026-09-08T18:58:53.2874242Z I0908 15:58:53.287043   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Dynamic.Runtime.dll as System.Dynamic.Runtime.dll
2026-09-08T18:58:53.2914614Z I0908 15:58:53.291158   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.IO.FileSystem.Primitives.dll as System.IO.FileSystem.Primitives.dll
2026-09-08T18:58:53.2924715Z I0908 15:58:53.292164   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.IdentityModel.Tokens.Jwt.dll as System.IdentityModel.Tokens.Jwt.dll
2026-09-08T18:58:53.2947980Z I0908 15:58:53.294554   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Linq.Expressions.dll as System.Linq.Expressions.dll
2026-09-08T18:58:53.3145133Z I0908 15:58:53.314274   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Linq.dll as System.Linq.dll
2026-09-08T18:58:53.3192890Z I0908 15:58:53.319087   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Memory.Data.dll as System.Memory.Data.dll
2026-09-08T18:58:53.3205696Z I0908 15:58:53.320407   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.ObjectModel.dll as System.ObjectModel.dll
2026-09-08T18:58:53.3220854Z I0908 15:58:53.321971   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Reflection.Emit.ILGeneration.dll as System.Reflection.Emit.ILGeneration.dll
2026-09-08T18:58:53.3233024Z I0908 15:58:53.323192   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Reflection.Emit.Lightweight.dll as System.Reflection.Emit.Lightweight.dll
2026-09-08T18:58:53.3235189Z I0908 15:58:53.323435   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Reflection.Emit.dll as System.Reflection.Emit.dll
2026-09-08T18:58:53.3237014Z I0908 15:58:53.323615   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Reflection.Metadata.dll as System.Reflection.Metadata.dll
2026-09-08T18:58:53.3482007Z I0908 15:58:53.347971   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Reflection.MetadataLoadContext.dll as System.Reflection.MetadataLoadContext.dll
2026-09-08T18:58:53.3594941Z I0908 15:58:53.359239   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Reflection.TypeExtensions.dll as System.Reflection.TypeExtensions.dll
2026-09-08T18:58:53.3601220Z I0908 15:58:53.359998   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Runtime.CompilerServices.Unsafe.dll as System.Runtime.CompilerServices.Unsafe.dll
2026-09-08T18:58:53.3608242Z I0908 15:58:53.360716   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Runtime.Serialization.Primitives.dll as System.Runtime.Serialization.Primitives.dll
2026-09-08T18:58:53.3611880Z I0908 15:58:53.361101   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Security.Cryptography.Pkcs.dll as System.Security.Cryptography.Pkcs.dll
2026-09-08T18:58:53.3711627Z I0908 15:58:53.370953   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Security.Cryptography.ProtectedData.dll as System.Security.Cryptography.ProtectedData.dll
2026-09-08T18:58:53.3724854Z I0908 15:58:53.372353   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Security.Permissions.dll as System.Security.Permissions.dll
2026-09-08T18:58:53.3768271Z I0908 15:58:53.376678   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Text.RegularExpressions.dll as System.Text.RegularExpressions.dll
2026-09-08T18:58:53.3819535Z I0908 15:58:53.381676   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Threading.Tasks.Extensions.dll as System.Threading.Tasks.Extensions.dll
2026-09-08T18:58:53.3828907Z I0908 15:58:53.382728   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Threading.dll as System.Threading.dll
2026-09-08T18:58:53.3846529Z I0908 15:58:53.384500   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Windows.Extensions.dll as System.Windows.Extensions.dll
2026-09-08T18:58:53.3847566Z I0908 15:58:53.384605   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Xml.ReaderWriter.dll as System.Xml.ReaderWriter.dll
2026-09-08T18:58:53.4118263Z I0908 15:58:53.411477   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/System.Xml.XDocument.dll as System.Xml.XDocument.dll
2026-09-08T18:58:53.4160795Z I0908 15:58:53.415932   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ThirdPartyNotices.txt as ThirdPartyNotices.txt
2026-09-08T18:58:53.4162097Z I0908 15:58:53.416128   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/UnitTests.deps.json as UnitTests.deps.json
2026-09-08T18:58:53.4196602Z I0908 15:58:53.419460   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/UnitTests.dll as UnitTests.dll
2026-09-08T18:58:53.4216696Z I0908 15:58:53.421572   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/UnitTests.pdb as UnitTests.pdb
2026-09-08T18:58:53.4247175Z I0908 15:58:53.424544   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/af as af
2026-09-08T18:58:53.4249363Z I0908 15:58:53.424832   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/af/Humanizer.resources.dll as af/Humanizer.resources.dll
2026-09-08T18:58:53.4250071Z I0908 15:58:53.424895   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/appsettings.json as appsettings.json
2026-09-08T18:58:53.4253079Z I0908 15:58:53.425225   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ar as ar
2026-09-08T18:58:53.4253703Z I0908 15:58:53.425295   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ar/Humanizer.resources.dll as ar/Humanizer.resources.dll
2026-09-08T18:58:53.4254157Z I0908 15:58:53.425342   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/az as az
2026-09-08T18:58:53.4263004Z I0908 15:58:53.426196   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/az/Humanizer.resources.dll as az/Humanizer.resources.dll
2026-09-08T18:58:53.4263647Z I0908 15:58:53.426291   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/bg as bg
2026-09-08T18:58:53.4264867Z I0908 15:58:53.426389   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/bg/Humanizer.resources.dll as bg/Humanizer.resources.dll
2026-09-08T18:58:53.4265262Z I0908 15:58:53.426435   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/bn-BD as bn-BD
2026-09-08T18:58:53.4266490Z I0908 15:58:53.426561   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/bn-BD/Humanizer.resources.dll as bn-BD/Humanizer.resources.dll
2026-09-08T18:58:53.4266999Z I0908 15:58:53.426607   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/coverlet.collector.deps.json as coverlet.collector.deps.json
2026-09-08T18:58:53.4272683Z I0908 15:58:53.427170   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/coverlet.collector.dll as coverlet.collector.dll
2026-09-08T18:58:53.4287334Z I0908 15:58:53.428582   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/coverlet.collector.pdb as coverlet.collector.pdb
2026-09-08T18:58:53.4299420Z I0908 15:58:53.429820   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/coverlet.collector.targets as coverlet.collector.targets
2026-09-08T18:58:53.4300899Z I0908 15:58:53.430009   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/coverlet.core.dll as coverlet.core.dll
2026-09-08T18:58:53.4356616Z I0908 15:58:53.435493   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/coverlet.core.pdb as coverlet.core.pdb
2026-09-08T18:58:53.4382025Z I0908 15:58:53.438074   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs as cs
2026-09-08T18:58:53.4386730Z I0908 15:58:53.438573   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs/Humanizer.resources.dll as cs/Humanizer.resources.dll
2026-09-08T18:58:53.4391214Z I0908 15:58:53.438870   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs/Microsoft.CodeAnalysis.CSharp.Features.resources.dll as cs/Microsoft.CodeAnalysis.CSharp.Features.resources.dll
2026-09-08T18:58:53.4409106Z I0908 15:58:53.440203   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll as cs/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll
2026-09-08T18:58:53.4416383Z I0908 15:58:53.441418   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs/Microsoft.CodeAnalysis.CSharp.resources.dll as cs/Microsoft.CodeAnalysis.CSharp.resources.dll
2026-09-08T18:58:53.4570332Z I0908 15:58:53.456812   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs/Microsoft.CodeAnalysis.Features.resources.dll as cs/Microsoft.CodeAnalysis.Features.resources.dll
2026-09-08T18:58:53.4636996Z I0908 15:58:53.463524   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs/Microsoft.CodeAnalysis.Scripting.resources.dll as cs/Microsoft.CodeAnalysis.Scripting.resources.dll
2026-09-08T18:58:53.4637569Z I0908 15:58:53.463626   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs/Microsoft.CodeAnalysis.Workspaces.resources.dll as cs/Microsoft.CodeAnalysis.Workspaces.resources.dll
2026-09-08T18:58:53.4656355Z I0908 15:58:53.465495   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs/Microsoft.CodeAnalysis.resources.dll as cs/Microsoft.CodeAnalysis.resources.dll
2026-09-08T18:58:53.4664319Z I0908 15:58:53.466321   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs/Microsoft.Data.SqlClient.resources.dll as cs/Microsoft.Data.SqlClient.resources.dll
2026-09-08T18:58:53.4763799Z I0908 15:58:53.476006   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs/Microsoft.TestPlatform.CommunicationUtilities.resources.dll as cs/Microsoft.TestPlatform.CommunicationUtilities.resources.dll
2026-09-08T18:58:53.4774811Z I0908 15:58:53.477355   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs/Microsoft.TestPlatform.CoreUtilities.resources.dll as cs/Microsoft.TestPlatform.CoreUtilities.resources.dll
2026-09-08T18:58:53.4776125Z I0908 15:58:53.477520   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs/Microsoft.TestPlatform.CrossPlatEngine.resources.dll as cs/Microsoft.TestPlatform.CrossPlatEngine.resources.dll
2026-09-08T18:58:53.4779107Z I0908 15:58:53.477801   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs/Microsoft.VisualStudio.TestPlatform.Common.resources.dll as cs/Microsoft.VisualStudio.TestPlatform.Common.resources.dll
2026-09-08T18:58:53.4782502Z I0908 15:58:53.478128   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll as cs/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll
2026-09-08T18:58:53.4783312Z I0908 15:58:53.478206   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/cs/Microsoft.VisualStudio.TraceDataCollector.resources.dll as cs/Microsoft.VisualStudio.TraceDataCollector.resources.dll
2026-09-08T18:58:53.4792242Z I0908 15:58:53.479120   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/da as da
2026-09-08T18:58:53.4794859Z I0908 15:58:53.479416   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/da/Humanizer.resources.dll as da/Humanizer.resources.dll
2026-09-08T18:58:53.4796376Z I0908 15:58:53.479576   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de as de
2026-09-08T18:58:53.4804908Z I0908 15:58:53.480413   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/Humanizer.resources.dll as de/Humanizer.resources.dll
2026-09-08T18:58:53.4807623Z I0908 15:58:53.480646   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/Microsoft.CodeAnalysis.CSharp.Features.resources.dll as de/Microsoft.CodeAnalysis.CSharp.Features.resources.dll
2026-09-08T18:58:53.4814742Z I0908 15:58:53.481391   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll as de/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll
2026-09-08T18:58:53.4825717Z I0908 15:58:53.482486   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/Microsoft.CodeAnalysis.CSharp.resources.dll as de/Microsoft.CodeAnalysis.CSharp.resources.dll
2026-09-08T18:58:53.4988376Z I0908 15:58:53.498595   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/Microsoft.CodeAnalysis.Features.resources.dll as de/Microsoft.CodeAnalysis.Features.resources.dll
2026-09-08T18:58:53.5068908Z I0908 15:58:53.506684   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/Microsoft.CodeAnalysis.Scripting.resources.dll as de/Microsoft.CodeAnalysis.Scripting.resources.dll
2026-09-08T18:58:53.5070281Z I0908 15:58:53.506941   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/Microsoft.CodeAnalysis.Workspaces.resources.dll as de/Microsoft.CodeAnalysis.Workspaces.resources.dll
2026-09-08T18:58:53.5094997Z I0908 15:58:53.509255   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/Microsoft.CodeAnalysis.resources.dll as de/Microsoft.CodeAnalysis.resources.dll
2026-09-08T18:58:53.5111548Z I0908 15:58:53.511027   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/Microsoft.Data.SqlClient.resources.dll as de/Microsoft.Data.SqlClient.resources.dll
2026-09-08T18:58:53.5212844Z I0908 15:58:53.520926   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/Microsoft.TestPlatform.CommunicationUtilities.resources.dll as de/Microsoft.TestPlatform.CommunicationUtilities.resources.dll
2026-09-08T18:58:53.5221631Z I0908 15:58:53.521950   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/Microsoft.TestPlatform.CoreUtilities.resources.dll as de/Microsoft.TestPlatform.CoreUtilities.resources.dll
2026-09-08T18:58:53.5224218Z I0908 15:58:53.522306   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/Microsoft.TestPlatform.CrossPlatEngine.resources.dll as de/Microsoft.TestPlatform.CrossPlatEngine.resources.dll
2026-09-08T18:58:53.5233525Z I0908 15:58:53.523208   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/Microsoft.VisualStudio.TestPlatform.Common.resources.dll as de/Microsoft.VisualStudio.TestPlatform.Common.resources.dll
2026-09-08T18:58:53.5235317Z I0908 15:58:53.523390   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll as de/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll
2026-09-08T18:58:53.5244349Z I0908 15:58:53.524278   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/Microsoft.VisualStudio.TraceDataCollector.resources.dll as de/Microsoft.VisualStudio.TraceDataCollector.resources.dll
2026-09-08T18:58:53.5249986Z I0908 15:58:53.524867   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/de/PdfSharpCore.resources.dll as de/PdfSharpCore.resources.dll
2026-09-08T18:58:53.5257367Z I0908 15:58:53.525640   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/dotnet-aspnet-codegenerator-design.dll as dotnet-aspnet-codegenerator-design.dll
2026-09-08T18:58:53.5288040Z I0908 15:58:53.527348   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/el as el
2026-09-08T18:58:53.5288402Z I0908 15:58:53.527474   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/el/Humanizer.resources.dll as el/Humanizer.resources.dll
2026-09-08T18:58:53.5288735Z I0908 15:58:53.527541   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es as es
2026-09-08T18:58:53.5289085Z I0908 15:58:53.528504   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es/Humanizer.resources.dll as es/Humanizer.resources.dll
2026-09-08T18:58:53.5291392Z I0908 15:58:53.529041   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es/Microsoft.CodeAnalysis.CSharp.Features.resources.dll as es/Microsoft.CodeAnalysis.CSharp.Features.resources.dll
2026-09-08T18:58:53.5307061Z I0908 15:58:53.530562   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll as es/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll
2026-09-08T18:58:53.5322987Z I0908 15:58:53.532126   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es/Microsoft.CodeAnalysis.CSharp.resources.dll as es/Microsoft.CodeAnalysis.CSharp.resources.dll
2026-09-08T18:58:53.5508925Z I0908 15:58:53.549323   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es/Microsoft.CodeAnalysis.Features.resources.dll as es/Microsoft.CodeAnalysis.Features.resources.dll
2026-09-08T18:58:53.5581850Z I0908 15:58:53.557711   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es/Microsoft.CodeAnalysis.Scripting.resources.dll as es/Microsoft.CodeAnalysis.Scripting.resources.dll
2026-09-08T18:58:53.5582337Z I0908 15:58:53.558041   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es/Microsoft.CodeAnalysis.Workspaces.resources.dll as es/Microsoft.CodeAnalysis.Workspaces.resources.dll
2026-09-08T18:58:53.5597579Z I0908 15:58:53.559654   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es/Microsoft.CodeAnalysis.resources.dll as es/Microsoft.CodeAnalysis.resources.dll
2026-09-08T18:58:53.5620067Z I0908 15:58:53.561528   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es/Microsoft.Data.SqlClient.resources.dll as es/Microsoft.Data.SqlClient.resources.dll
2026-09-08T18:58:53.5729944Z I0908 15:58:53.572404   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es/Microsoft.TestPlatform.CommunicationUtilities.resources.dll as es/Microsoft.TestPlatform.CommunicationUtilities.resources.dll
2026-09-08T18:58:53.5730833Z I0908 15:58:53.572729   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es/Microsoft.TestPlatform.CoreUtilities.resources.dll as es/Microsoft.TestPlatform.CoreUtilities.resources.dll
2026-09-08T18:58:53.5731337Z I0908 15:58:53.572832   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es/Microsoft.TestPlatform.CrossPlatEngine.resources.dll as es/Microsoft.TestPlatform.CrossPlatEngine.resources.dll
2026-09-08T18:58:53.5733347Z I0908 15:58:53.573165   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es/Microsoft.VisualStudio.TestPlatform.Common.resources.dll as es/Microsoft.VisualStudio.TestPlatform.Common.resources.dll
2026-09-08T18:58:53.5741926Z I0908 15:58:53.574040   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll as es/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll
2026-09-08T18:58:53.5745222Z I0908 15:58:53.574426   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/es/Microsoft.VisualStudio.TraceDataCollector.resources.dll as es/Microsoft.VisualStudio.TraceDataCollector.resources.dll
2026-09-08T18:58:53.5750766Z I0908 15:58:53.574973   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fa as fa
2026-09-08T18:58:53.5761400Z I0908 15:58:53.576002   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fa/Humanizer.resources.dll as fa/Humanizer.resources.dll
2026-09-08T18:58:53.5766621Z I0908 15:58:53.576339   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fi-FI as fi-FI
2026-09-08T18:58:53.5767010Z I0908 15:58:53.576479   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fi-FI/Humanizer.resources.dll as fi-FI/Humanizer.resources.dll
2026-09-08T18:58:53.5767320Z I0908 15:58:53.576551   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr as fr
2026-09-08T18:58:53.5767634Z I0908 15:58:53.576681   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr/Humanizer.resources.dll as fr/Humanizer.resources.dll
2026-09-08T18:58:53.5768863Z I0908 15:58:53.576801   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr/Microsoft.CodeAnalysis.CSharp.Features.resources.dll as fr/Microsoft.CodeAnalysis.CSharp.Features.resources.dll
2026-09-08T18:58:53.5783839Z I0908 15:58:53.578254   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll as fr/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll
2026-09-08T18:58:53.5787260Z I0908 15:58:53.578615   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr/Microsoft.CodeAnalysis.CSharp.resources.dll as fr/Microsoft.CodeAnalysis.CSharp.resources.dll
2026-09-08T18:58:53.5972450Z I0908 15:58:53.595100   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr/Microsoft.CodeAnalysis.Features.resources.dll as fr/Microsoft.CodeAnalysis.Features.resources.dll
2026-09-08T18:58:53.6034370Z I0908 15:58:53.603192   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr/Microsoft.CodeAnalysis.Scripting.resources.dll as fr/Microsoft.CodeAnalysis.Scripting.resources.dll
2026-09-08T18:58:53.6036735Z I0908 15:58:53.603560   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr/Microsoft.CodeAnalysis.Workspaces.resources.dll as fr/Microsoft.CodeAnalysis.Workspaces.resources.dll
2026-09-08T18:58:53.6069502Z I0908 15:58:53.605019   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr/Microsoft.CodeAnalysis.resources.dll as fr/Microsoft.CodeAnalysis.resources.dll
2026-09-08T18:58:53.6070860Z I0908 15:58:53.606978   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr/Microsoft.Data.SqlClient.resources.dll as fr/Microsoft.Data.SqlClient.resources.dll
2026-09-08T18:58:53.6169953Z I0908 15:58:53.616762   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr/Microsoft.TestPlatform.CommunicationUtilities.resources.dll as fr/Microsoft.TestPlatform.CommunicationUtilities.resources.dll
2026-09-08T18:58:53.6185733Z I0908 15:58:53.618393   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr/Microsoft.TestPlatform.CoreUtilities.resources.dll as fr/Microsoft.TestPlatform.CoreUtilities.resources.dll
2026-09-08T18:58:53.6187537Z I0908 15:58:53.618629   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr/Microsoft.TestPlatform.CrossPlatEngine.resources.dll as fr/Microsoft.TestPlatform.CrossPlatEngine.resources.dll
2026-09-08T18:58:53.6190242Z I0908 15:58:53.618902   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr/Microsoft.VisualStudio.TestPlatform.Common.resources.dll as fr/Microsoft.VisualStudio.TestPlatform.Common.resources.dll
2026-09-08T18:58:53.6201255Z I0908 15:58:53.619970   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll as fr/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll
2026-09-08T18:58:53.6206069Z I0908 15:58:53.620468   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr/Microsoft.VisualStudio.TraceDataCollector.resources.dll as fr/Microsoft.VisualStudio.TraceDataCollector.resources.dll
2026-09-08T18:58:53.6207277Z I0908 15:58:53.620606   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr-BE as fr-BE
2026-09-08T18:58:53.6219362Z I0908 15:58:53.621720   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/fr-BE/Humanizer.resources.dll as fr-BE/Humanizer.resources.dll
2026-09-08T18:58:53.6219747Z I0908 15:58:53.621804   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/he as he
2026-09-08T18:58:53.6221749Z I0908 15:58:53.622090   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/he/Humanizer.resources.dll as he/Humanizer.resources.dll
2026-09-08T18:58:53.6223175Z I0908 15:58:53.622238   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/hr as hr
2026-09-08T18:58:53.6223793Z I0908 15:58:53.622314   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/hr/Humanizer.resources.dll as hr/Humanizer.resources.dll
2026-09-08T18:58:53.6224215Z I0908 15:58:53.622360   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/hu as hu
2026-09-08T18:58:53.6225957Z I0908 15:58:53.622511   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/hu/Humanizer.resources.dll as hu/Humanizer.resources.dll
2026-09-08T18:58:53.6226327Z I0908 15:58:53.622556   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/hy as hy
2026-09-08T18:58:53.6234112Z I0908 15:58:53.623310   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/hy/Humanizer.resources.dll as hy/Humanizer.resources.dll
2026-09-08T18:58:53.6235853Z I0908 15:58:53.623503   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/id as id
2026-09-08T18:58:53.6236727Z I0908 15:58:53.623604   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/id/Humanizer.resources.dll as id/Humanizer.resources.dll
2026-09-08T18:58:53.6237164Z I0908 15:58:53.623652   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/is as is
2026-09-08T18:58:53.6238596Z I0908 15:58:53.623784   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/is/Humanizer.resources.dll as is/Humanizer.resources.dll
2026-09-08T18:58:53.6239187Z I0908 15:58:53.623864   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it as it
2026-09-08T18:58:53.6241281Z I0908 15:58:53.624055   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it/Humanizer.resources.dll as it/Humanizer.resources.dll
2026-09-08T18:58:53.6242391Z I0908 15:58:53.624157   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it/Microsoft.CodeAnalysis.CSharp.Features.resources.dll as it/Microsoft.CodeAnalysis.CSharp.Features.resources.dll
2026-09-08T18:58:53.6256709Z I0908 15:58:53.625571   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll as it/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll
2026-09-08T18:58:53.6261920Z I0908 15:58:53.626099   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it/Microsoft.CodeAnalysis.CSharp.resources.dll as it/Microsoft.CodeAnalysis.CSharp.resources.dll
2026-09-08T18:58:53.6427396Z I0908 15:58:53.642487   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it/Microsoft.CodeAnalysis.Features.resources.dll as it/Microsoft.CodeAnalysis.Features.resources.dll
2026-09-08T18:58:53.6496161Z I0908 15:58:53.649399   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it/Microsoft.CodeAnalysis.Scripting.resources.dll as it/Microsoft.CodeAnalysis.Scripting.resources.dll
2026-09-08T18:58:53.6496791Z I0908 15:58:53.649581   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it/Microsoft.CodeAnalysis.Workspaces.resources.dll as it/Microsoft.CodeAnalysis.Workspaces.resources.dll
2026-09-08T18:58:53.6513306Z I0908 15:58:53.651224   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it/Microsoft.CodeAnalysis.resources.dll as it/Microsoft.CodeAnalysis.resources.dll
2026-09-08T18:58:53.6533188Z I0908 15:58:53.653175   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it/Microsoft.Data.SqlClient.resources.dll as it/Microsoft.Data.SqlClient.resources.dll
2026-09-08T18:58:53.6628349Z I0908 15:58:53.662651   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it/Microsoft.TestPlatform.CommunicationUtilities.resources.dll as it/Microsoft.TestPlatform.CommunicationUtilities.resources.dll
2026-09-08T18:58:53.6628950Z I0908 15:58:53.662764   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it/Microsoft.TestPlatform.CoreUtilities.resources.dll as it/Microsoft.TestPlatform.CoreUtilities.resources.dll
2026-09-08T18:58:53.6641352Z I0908 15:58:53.664004   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it/Microsoft.TestPlatform.CrossPlatEngine.resources.dll as it/Microsoft.TestPlatform.CrossPlatEngine.resources.dll
2026-09-08T18:58:53.6642343Z I0908 15:58:53.664158   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it/Microsoft.VisualStudio.TestPlatform.Common.resources.dll as it/Microsoft.VisualStudio.TestPlatform.Common.resources.dll
2026-09-08T18:58:53.6645564Z I0908 15:58:53.664441   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll as it/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll
2026-09-08T18:58:53.6657584Z I0908 15:58:53.665619   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/it/Microsoft.VisualStudio.TraceDataCollector.resources.dll as it/Microsoft.VisualStudio.TraceDataCollector.resources.dll
2026-09-08T18:58:53.6662202Z I0908 15:58:53.666129   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja as ja
2026-09-08T18:58:53.6664059Z I0908 15:58:53.666317   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja/Humanizer.resources.dll as ja/Humanizer.resources.dll
2026-09-08T18:58:53.6664698Z I0908 15:58:53.666392   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja/Microsoft.CodeAnalysis.CSharp.Features.resources.dll as ja/Microsoft.CodeAnalysis.CSharp.Features.resources.dll
2026-09-08T18:58:53.6686259Z I0908 15:58:53.668415   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll as ja/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll
2026-09-08T18:58:53.6695223Z I0908 15:58:53.669293   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja/Microsoft.CodeAnalysis.CSharp.resources.dll as ja/Microsoft.CodeAnalysis.CSharp.resources.dll
2026-09-08T18:58:53.6872883Z I0908 15:58:53.687013   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja/Microsoft.CodeAnalysis.Features.resources.dll as ja/Microsoft.CodeAnalysis.Features.resources.dll
2026-09-08T18:58:53.6938631Z I0908 15:58:53.693607   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja/Microsoft.CodeAnalysis.Scripting.resources.dll as ja/Microsoft.CodeAnalysis.Scripting.resources.dll
2026-09-08T18:58:53.6948125Z I0908 15:58:53.694697   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja/Microsoft.CodeAnalysis.Workspaces.resources.dll as ja/Microsoft.CodeAnalysis.Workspaces.resources.dll
2026-09-08T18:58:53.6955349Z I0908 15:58:53.695440   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja/Microsoft.CodeAnalysis.resources.dll as ja/Microsoft.CodeAnalysis.resources.dll
2026-09-08T18:58:53.6977153Z I0908 15:58:53.697577   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja/Microsoft.Data.SqlClient.resources.dll as ja/Microsoft.Data.SqlClient.resources.dll
2026-09-08T18:58:53.7088435Z I0908 15:58:53.708562   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja/Microsoft.TestPlatform.CommunicationUtilities.resources.dll as ja/Microsoft.TestPlatform.CommunicationUtilities.resources.dll
2026-09-08T18:58:53.7093449Z I0908 15:58:53.709243   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja/Microsoft.TestPlatform.CoreUtilities.resources.dll as ja/Microsoft.TestPlatform.CoreUtilities.resources.dll
2026-09-08T18:58:53.7093994Z I0908 15:58:53.709331   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja/Microsoft.TestPlatform.CrossPlatEngine.resources.dll as ja/Microsoft.TestPlatform.CrossPlatEngine.resources.dll
2026-09-08T18:58:53.7104210Z I0908 15:58:53.710314   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja/Microsoft.VisualStudio.TestPlatform.Common.resources.dll as ja/Microsoft.VisualStudio.TestPlatform.Common.resources.dll
2026-09-08T18:58:53.7107343Z I0908 15:58:53.710639   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll as ja/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll
2026-09-08T18:58:53.7107909Z I0908 15:58:53.710719   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ja/Microsoft.VisualStudio.TraceDataCollector.resources.dll as ja/Microsoft.VisualStudio.TraceDataCollector.resources.dll
2026-09-08T18:58:53.7111522Z I0908 15:58:53.711070   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko as ko
2026-09-08T18:58:53.7121697Z I0908 15:58:53.712065   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko/Microsoft.CodeAnalysis.CSharp.Features.resources.dll as ko/Microsoft.CodeAnalysis.CSharp.Features.resources.dll
2026-09-08T18:58:53.7129788Z I0908 15:58:53.712872   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll as ko/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll
2026-09-08T18:58:53.7140119Z I0908 15:58:53.713907   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko/Microsoft.CodeAnalysis.CSharp.resources.dll as ko/Microsoft.CodeAnalysis.CSharp.resources.dll
2026-09-08T18:58:53.7297794Z I0908 15:58:53.729509   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko/Microsoft.CodeAnalysis.Features.resources.dll as ko/Microsoft.CodeAnalysis.Features.resources.dll
2026-09-08T18:58:53.7371429Z I0908 15:58:53.736878   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko/Microsoft.CodeAnalysis.Scripting.resources.dll as ko/Microsoft.CodeAnalysis.Scripting.resources.dll
2026-09-08T18:58:53.7377713Z I0908 15:58:53.737585   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko/Microsoft.CodeAnalysis.Workspaces.resources.dll as ko/Microsoft.CodeAnalysis.Workspaces.resources.dll
2026-09-08T18:58:53.7392151Z I0908 15:58:53.739059   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko/Microsoft.CodeAnalysis.resources.dll as ko/Microsoft.CodeAnalysis.resources.dll
2026-09-08T18:58:53.7410486Z I0908 15:58:53.740888   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko/Microsoft.Data.SqlClient.resources.dll as ko/Microsoft.Data.SqlClient.resources.dll
2026-09-08T18:58:53.7507388Z I0908 15:58:53.750497   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko/Microsoft.TestPlatform.CommunicationUtilities.resources.dll as ko/Microsoft.TestPlatform.CommunicationUtilities.resources.dll
2026-09-08T18:58:53.7522073Z I0908 15:58:53.752090   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko/Microsoft.TestPlatform.CoreUtilities.resources.dll as ko/Microsoft.TestPlatform.CoreUtilities.resources.dll
2026-09-08T18:58:53.7524130Z I0908 15:58:53.752315   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko/Microsoft.TestPlatform.CrossPlatEngine.resources.dll as ko/Microsoft.TestPlatform.CrossPlatEngine.resources.dll
2026-09-08T18:58:53.7526322Z I0908 15:58:53.752543   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko/Microsoft.VisualStudio.TestPlatform.Common.resources.dll as ko/Microsoft.VisualStudio.TestPlatform.Common.resources.dll
2026-09-08T18:58:53.7538514Z I0908 15:58:53.753754   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll as ko/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll
2026-09-08T18:58:53.7542394Z I0908 15:58:53.754153   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko/Microsoft.VisualStudio.TraceDataCollector.resources.dll as ko/Microsoft.VisualStudio.TraceDataCollector.resources.dll
2026-09-08T18:58:53.7543373Z I0908 15:58:53.754242   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko-KR as ko-KR
2026-09-08T18:58:53.7552600Z I0908 15:58:53.755157   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ko-KR/Humanizer.resources.dll as ko-KR/Humanizer.resources.dll
2026-09-08T18:58:53.7552921Z I0908 15:58:53.755242   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ku as ku
2026-09-08T18:58:53.7557080Z I0908 15:58:53.755616   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ku/Humanizer.resources.dll as ku/Humanizer.resources.dll
2026-09-08T18:58:53.7557501Z I0908 15:58:53.755699   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/lv as lv
2026-09-08T18:58:53.7567735Z I0908 15:58:53.756613   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/lv/Humanizer.resources.dll as lv/Humanizer.resources.dll
2026-09-08T18:58:53.7568585Z I0908 15:58:53.756786   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ms-MY as ms-MY
2026-09-08T18:58:53.7576660Z I0908 15:58:53.757135   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ms-MY/Humanizer.resources.dll as ms-MY/Humanizer.resources.dll
2026-09-08T18:58:53.7577194Z I0908 15:58:53.757223   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/mt as mt
2026-09-08T18:58:53.7577628Z I0908 15:58:53.757412   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/mt/Humanizer.resources.dll as mt/Humanizer.resources.dll
2026-09-08T18:58:53.7578025Z I0908 15:58:53.757534   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/nb as nb
2026-09-08T18:58:53.7580411Z I0908 15:58:53.757891   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/nb/Humanizer.resources.dll as nb/Humanizer.resources.dll
2026-09-08T18:58:53.7581299Z I0908 15:58:53.758041   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/nb-NO as nb-NO
2026-09-08T18:58:53.7592854Z I0908 15:58:53.759163   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/nb-NO/Humanizer.resources.dll as nb-NO/Humanizer.resources.dll
2026-09-08T18:58:53.7595714Z I0908 15:58:53.759389   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/nl as nl
2026-09-08T18:58:53.7596078Z I0908 15:58:53.759454   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/nl/Humanizer.resources.dll as nl/Humanizer.resources.dll
2026-09-08T18:58:53.7596756Z I0908 15:58:53.759544   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl as pl
2026-09-08T18:58:53.7597889Z I0908 15:58:53.759710   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl/Humanizer.resources.dll as pl/Humanizer.resources.dll
2026-09-08T18:58:53.7599407Z I0908 15:58:53.759848   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl/Microsoft.CodeAnalysis.CSharp.Features.resources.dll as pl/Microsoft.CodeAnalysis.CSharp.Features.resources.dll
2026-09-08T18:58:53.7607716Z I0908 15:58:53.760671   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll as pl/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll
2026-09-08T18:58:53.7620858Z I0908 15:58:53.761987   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl/Microsoft.CodeAnalysis.CSharp.resources.dll as pl/Microsoft.CodeAnalysis.CSharp.resources.dll
2026-09-08T18:58:53.7779032Z I0908 15:58:53.777667   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl/Microsoft.CodeAnalysis.Features.resources.dll as pl/Microsoft.CodeAnalysis.Features.resources.dll
2026-09-08T18:58:53.7857694Z I0908 15:58:53.785520   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl/Microsoft.CodeAnalysis.Scripting.resources.dll as pl/Microsoft.CodeAnalysis.Scripting.resources.dll
2026-09-08T18:58:53.7859612Z I0908 15:58:53.785868   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl/Microsoft.CodeAnalysis.Workspaces.resources.dll as pl/Microsoft.CodeAnalysis.Workspaces.resources.dll
2026-09-08T18:58:53.7873957Z I0908 15:58:53.787273   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl/Microsoft.CodeAnalysis.resources.dll as pl/Microsoft.CodeAnalysis.resources.dll
2026-09-08T18:58:53.7894967Z I0908 15:58:53.789364   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl/Microsoft.Data.SqlClient.resources.dll as pl/Microsoft.Data.SqlClient.resources.dll
2026-09-08T18:58:53.7997480Z I0908 15:58:53.799566   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl/Microsoft.TestPlatform.CommunicationUtilities.resources.dll as pl/Microsoft.TestPlatform.CommunicationUtilities.resources.dll
2026-09-08T18:58:53.8001594Z I0908 15:58:53.800058   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl/Microsoft.TestPlatform.CoreUtilities.resources.dll as pl/Microsoft.TestPlatform.CoreUtilities.resources.dll
2026-09-08T18:58:53.8002176Z I0908 15:58:53.800126   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl/Microsoft.TestPlatform.CrossPlatEngine.resources.dll as pl/Microsoft.TestPlatform.CrossPlatEngine.resources.dll
2026-09-08T18:58:53.8011820Z I0908 15:58:53.801070   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl/Microsoft.VisualStudio.TestPlatform.Common.resources.dll as pl/Microsoft.VisualStudio.TestPlatform.Common.resources.dll
2026-09-08T18:58:53.8013324Z I0908 15:58:53.801229   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll as pl/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll
2026-09-08T18:58:53.8015612Z I0908 15:58:53.801473   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pl/Microsoft.VisualStudio.TraceDataCollector.resources.dll as pl/Microsoft.VisualStudio.TraceDataCollector.resources.dll
2026-09-08T18:58:53.8019763Z I0908 15:58:53.801896   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt as pt
2026-09-08T18:58:53.8028011Z I0908 15:58:53.802713   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt/Humanizer.resources.dll as pt/Humanizer.resources.dll
2026-09-08T18:58:53.8030337Z I0908 15:58:53.802943   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt-BR as pt-BR
2026-09-08T18:58:53.8031314Z I0908 15:58:53.803052   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt-BR/Microsoft.CodeAnalysis.CSharp.Features.resources.dll as pt-BR/Microsoft.CodeAnalysis.CSharp.Features.resources.dll
2026-09-08T18:58:53.8044986Z I0908 15:58:53.804375   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt-BR/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll as pt-BR/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll
2026-09-08T18:58:53.8049773Z I0908 15:58:53.804875   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt-BR/Microsoft.CodeAnalysis.CSharp.resources.dll as pt-BR/Microsoft.CodeAnalysis.CSharp.resources.dll
2026-09-08T18:58:53.8205605Z I0908 15:58:53.820271   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt-BR/Microsoft.CodeAnalysis.Features.resources.dll as pt-BR/Microsoft.CodeAnalysis.Features.resources.dll
2026-09-08T18:58:53.8276003Z I0908 15:58:53.827277   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt-BR/Microsoft.CodeAnalysis.Scripting.resources.dll as pt-BR/Microsoft.CodeAnalysis.Scripting.resources.dll
2026-09-08T18:58:53.8277135Z I0908 15:58:53.827532   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt-BR/Microsoft.CodeAnalysis.Workspaces.resources.dll as pt-BR/Microsoft.CodeAnalysis.Workspaces.resources.dll
2026-09-08T18:58:53.8291708Z I0908 15:58:53.828988   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt-BR/Microsoft.CodeAnalysis.resources.dll as pt-BR/Microsoft.CodeAnalysis.resources.dll
2026-09-08T18:58:53.8310236Z I0908 15:58:53.830897   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt-BR/Microsoft.Data.SqlClient.resources.dll as pt-BR/Microsoft.Data.SqlClient.resources.dll
2026-09-08T18:58:53.8401435Z I0908 15:58:53.839921   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt-BR/Microsoft.TestPlatform.CommunicationUtilities.resources.dll as pt-BR/Microsoft.TestPlatform.CommunicationUtilities.resources.dll
2026-09-08T18:58:53.8401919Z I0908 15:58:53.840099   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt-BR/Microsoft.TestPlatform.CoreUtilities.resources.dll as pt-BR/Microsoft.TestPlatform.CoreUtilities.resources.dll
2026-09-08T18:58:53.8413259Z I0908 15:58:53.841237   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt-BR/Microsoft.TestPlatform.CrossPlatEngine.resources.dll as pt-BR/Microsoft.TestPlatform.CrossPlatEngine.resources.dll
2026-09-08T18:58:53.8417522Z I0908 15:58:53.841574   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt-BR/Microsoft.VisualStudio.TestPlatform.Common.resources.dll as pt-BR/Microsoft.VisualStudio.TestPlatform.Common.resources.dll
2026-09-08T18:58:53.8417979Z I0908 15:58:53.841641   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt-BR/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll as pt-BR/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll
2026-09-08T18:58:53.8428953Z I0908 15:58:53.842783   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/pt-BR/Microsoft.VisualStudio.TraceDataCollector.resources.dll as pt-BR/Microsoft.VisualStudio.TraceDataCollector.resources.dll
2026-09-08T18:58:53.8433482Z I0908 15:58:53.843285   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ro as ro
2026-09-08T18:58:53.8434627Z I0908 15:58:53.843397   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ro/Humanizer.resources.dll as ro/Humanizer.resources.dll
2026-09-08T18:58:53.8435109Z I0908 15:58:53.843462   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru as ru
2026-09-08T18:58:53.8444160Z I0908 15:58:53.844334   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru/Humanizer.resources.dll as ru/Humanizer.resources.dll
2026-09-08T18:58:53.8444914Z I0908 15:58:53.844399   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru/Microsoft.CodeAnalysis.CSharp.Features.resources.dll as ru/Microsoft.CodeAnalysis.CSharp.Features.resources.dll
2026-09-08T18:58:53.8456800Z I0908 15:58:53.845588   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll as ru/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll
2026-09-08T18:58:53.8470171Z I0908 15:58:53.846907   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru/Microsoft.CodeAnalysis.CSharp.resources.dll as ru/Microsoft.CodeAnalysis.CSharp.resources.dll
2026-09-08T18:58:53.8703761Z I0908 15:58:53.870156   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru/Microsoft.CodeAnalysis.Features.resources.dll as ru/Microsoft.CodeAnalysis.Features.resources.dll
2026-09-08T18:58:53.8814707Z I0908 15:58:53.881314   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru/Microsoft.CodeAnalysis.Scripting.resources.dll as ru/Microsoft.CodeAnalysis.Scripting.resources.dll
2026-09-08T18:58:53.8816360Z I0908 15:58:53.881561   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru/Microsoft.CodeAnalysis.Workspaces.resources.dll as ru/Microsoft.CodeAnalysis.Workspaces.resources.dll
2026-09-08T18:58:53.8836685Z I0908 15:58:53.883512   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru/Microsoft.CodeAnalysis.resources.dll as ru/Microsoft.CodeAnalysis.resources.dll
2026-09-08T18:58:53.8858968Z I0908 15:58:53.885753   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru/Microsoft.Data.SqlClient.resources.dll as ru/Microsoft.Data.SqlClient.resources.dll
2026-09-08T18:58:53.9001114Z I0908 15:58:53.899883   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru/Microsoft.TestPlatform.CommunicationUtilities.resources.dll as ru/Microsoft.TestPlatform.CommunicationUtilities.resources.dll
2026-09-08T18:58:53.9012419Z I0908 15:58:53.901087   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru/Microsoft.TestPlatform.CoreUtilities.resources.dll as ru/Microsoft.TestPlatform.CoreUtilities.resources.dll
2026-09-08T18:58:53.9015641Z I0908 15:58:53.901441   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru/Microsoft.TestPlatform.CrossPlatEngine.resources.dll as ru/Microsoft.TestPlatform.CrossPlatEngine.resources.dll
2026-09-08T18:58:53.9019443Z I0908 15:58:53.901857   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru/Microsoft.VisualStudio.TestPlatform.Common.resources.dll as ru/Microsoft.VisualStudio.TestPlatform.Common.resources.dll
2026-09-08T18:58:53.9026257Z I0908 15:58:53.902549   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll as ru/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll
2026-09-08T18:58:53.9030577Z I0908 15:58:53.902964   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/ru/Microsoft.VisualStudio.TraceDataCollector.resources.dll as ru/Microsoft.VisualStudio.TraceDataCollector.resources.dll
2026-09-08T18:58:53.9037729Z I0908 15:58:53.903400   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes as runtimes
2026-09-08T18:58:53.9038656Z I0908 15:58:53.903792   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/linux as runtimes/linux
2026-09-08T18:58:53.9039033Z I0908 15:58:53.903834   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/linux/lib as runtimes/linux/lib
2026-09-08T18:58:53.9039508Z I0908 15:58:53.903865   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/linux/lib/net6.0 as runtimes/linux/lib/net6.0
2026-09-08T18:58:53.9040005Z I0908 15:58:53.903901   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/linux/lib/net6.0/System.DirectoryServices.Protocols.dll as runtimes/linux/lib/net6.0/System.DirectoryServices.Protocols.dll
2026-09-08T18:58:53.9096159Z I0908 15:58:53.909361   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/osx as runtimes/osx
2026-09-08T18:58:53.9108007Z I0908 15:58:53.910330   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/osx/lib as runtimes/osx/lib
2026-09-08T18:58:53.9108423Z I0908 15:58:53.910390   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/osx/lib/net6.0 as runtimes/osx/lib/net6.0
2026-09-08T18:58:53.9108833Z I0908 15:58:53.910445   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/osx/lib/net6.0/System.DirectoryServices.Protocols.dll as runtimes/osx/lib/net6.0/System.DirectoryServices.Protocols.dll
2026-09-08T18:58:53.9160774Z I0908 15:58:53.915827   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/unix as runtimes/unix
2026-09-08T18:58:53.9164893Z I0908 15:58:53.916243   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/unix/lib as runtimes/unix/lib
2026-09-08T18:58:53.9165250Z I0908 15:58:53.916289   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/unix/lib/net8.0 as runtimes/unix/lib/net8.0
2026-09-08T18:58:53.9165630Z I0908 15:58:53.916329   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/unix/lib/net8.0/Microsoft.Data.SqlClient.dll as runtimes/unix/lib/net8.0/Microsoft.Data.SqlClient.dll
2026-09-08T18:58:54.0023480Z I0908 15:58:54.001990   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win as runtimes/win
2026-09-08T18:58:54.0026783Z I0908 15:58:54.002580   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win/lib as runtimes/win/lib
2026-09-08T18:58:54.0030647Z I0908 15:58:54.002655   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win/lib/net6.0 as runtimes/win/lib/net6.0
2026-09-08T18:58:54.0031145Z I0908 15:58:54.002722   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win/lib/net6.0/System.Diagnostics.PerformanceCounter.dll as runtimes/win/lib/net6.0/System.Diagnostics.PerformanceCounter.dll
2026-09-08T18:58:54.0090458Z I0908 15:58:54.008741   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win/lib/net6.0/System.DirectoryServices.Protocols.dll as runtimes/win/lib/net6.0/System.DirectoryServices.Protocols.dll
2026-09-08T18:58:54.0145532Z I0908 15:58:54.014314   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win/lib/net6.0/System.DirectoryServices.dll as runtimes/win/lib/net6.0/System.DirectoryServices.dll
2026-09-08T18:58:54.0326842Z I0908 15:58:54.032411   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win/lib/net7.0 as runtimes/win/lib/net7.0
2026-09-08T18:58:54.0327518Z I0908 15:58:54.032578   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win/lib/net7.0/Microsoft.Win32.SystemEvents.dll as runtimes/win/lib/net7.0/Microsoft.Win32.SystemEvents.dll
2026-09-08T18:58:54.0351724Z I0908 15:58:54.034682   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win/lib/net7.0/System.Drawing.Common.dll as runtimes/win/lib/net7.0/System.Drawing.Common.dll
2026-09-08T18:58:54.0585940Z I0908 15:58:54.058326   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win/lib/net7.0/System.Windows.Extensions.dll as runtimes/win/lib/net7.0/System.Windows.Extensions.dll
2026-09-08T18:58:54.0609213Z I0908 15:58:54.060796   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win/lib/net8.0 as runtimes/win/lib/net8.0
2026-09-08T18:58:54.0618069Z I0908 15:58:54.061702   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win/lib/net8.0/Microsoft.Data.SqlClient.dll as runtimes/win/lib/net8.0/Microsoft.Data.SqlClient.dll
2026-09-08T18:58:54.1591056Z I0908 15:58:54.158638   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win/lib/net8.0/System.Diagnostics.EventLog.Messages.dll as runtimes/win/lib/net8.0/System.Diagnostics.EventLog.Messages.dll
2026-09-08T18:58:54.1623455Z I0908 15:58:54.162099   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win/lib/net8.0/System.Diagnostics.EventLog.dll as runtimes/win/lib/net8.0/System.Diagnostics.EventLog.dll
2026-09-08T18:58:54.1689203Z I0908 15:58:54.168716   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win/lib/net8.0/System.Security.Cryptography.Pkcs.dll as runtimes/win/lib/net8.0/System.Security.Cryptography.Pkcs.dll
2026-09-08T18:58:54.1826144Z I0908 15:58:54.182287   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win-arm64 as runtimes/win-arm64
2026-09-08T18:58:54.1828509Z I0908 15:58:54.182758   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win-arm64/native as runtimes/win-arm64/native
2026-09-08T18:58:54.1828933Z I0908 15:58:54.182813   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win-arm64/native/Microsoft.Data.SqlClient.SNI.dll as runtimes/win-arm64/native/Microsoft.Data.SqlClient.SNI.dll
2026-09-08T18:58:54.2078442Z I0908 15:58:54.207482   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win-x64 as runtimes/win-x64
2026-09-08T18:58:54.2081637Z I0908 15:58:54.208059   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win-x64/native as runtimes/win-x64/native
2026-09-08T18:58:54.2082214Z I0908 15:58:54.208114   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win-x64/native/Microsoft.Data.SqlClient.SNI.dll as runtimes/win-x64/native/Microsoft.Data.SqlClient.SNI.dll
2026-09-08T18:58:54.2360479Z I0908 15:58:54.235746   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win-x86 as runtimes/win-x86
2026-09-08T18:58:54.2360953Z I0908 15:58:54.236029   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win-x86/native as runtimes/win-x86/native
2026-09-08T18:58:54.2361708Z I0908 15:58:54.236084   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/runtimes/win-x86/native/Microsoft.Data.SqlClient.SNI.dll as runtimes/win-x86/native/Microsoft.Data.SqlClient.SNI.dll
2026-09-08T18:58:54.2556432Z I0908 15:58:54.255344   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/sisou-api-sac-internet.zip as sisou-api-sac-internet.zip
2026-09-08T18:58:55.6718308Z .I0908 15:58:55.671396   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/sk as sk
2026-09-08T18:58:55.6718767Z I0908 15:58:55.671578   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/sk/Humanizer.resources.dll as sk/Humanizer.resources.dll
2026-09-08T18:58:55.6719064Z I0908 15:58:55.671649   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/sl as sl
2026-09-08T18:58:55.6720482Z I0908 15:58:55.671952   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/sl/Humanizer.resources.dll as sl/Humanizer.resources.dll
2026-09-08T18:58:55.6720798Z I0908 15:58:55.672011   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/sr as sr
2026-09-08T18:58:55.6727973Z I0908 15:58:55.672671   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/sr/Humanizer.resources.dll as sr/Humanizer.resources.dll
2026-09-08T18:58:55.6729027Z I0908 15:58:55.672806   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/sr-Latn as sr-Latn
2026-09-08T18:58:55.6731009Z I0908 15:58:55.672886   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/sr-Latn/Humanizer.resources.dll as sr-Latn/Humanizer.resources.dll
2026-09-08T18:58:55.6739487Z I0908 15:58:55.673121   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/sv as sv
2026-09-08T18:58:55.6739858Z I0908 15:58:55.673381   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/sv/Humanizer.resources.dll as sv/Humanizer.resources.dll
2026-09-08T18:58:55.6740247Z I0908 15:58:55.673536   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/swagger.json as swagger.json
2026-09-08T18:58:55.6742851Z I0908 15:58:55.674135   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/testhost.dll as testhost.dll
2026-09-08T18:58:55.6759823Z I0908 15:58:55.675839   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/th-TH as th-TH
2026-09-08T18:58:55.6760692Z I0908 15:58:55.675987   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/th-TH/Humanizer.resources.dll as th-TH/Humanizer.resources.dll
2026-09-08T18:58:55.6762722Z I0908 15:58:55.676154   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr as tr
2026-09-08T18:58:55.6774150Z I0908 15:58:55.677160   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr/Humanizer.resources.dll as tr/Humanizer.resources.dll
2026-09-08T18:58:55.6774757Z I0908 15:58:55.677377   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr/Microsoft.CodeAnalysis.CSharp.Features.resources.dll as tr/Microsoft.CodeAnalysis.CSharp.Features.resources.dll
2026-09-08T18:58:55.6784003Z I0908 15:58:55.678263   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll as tr/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll
2026-09-08T18:58:55.6796074Z I0908 15:58:55.679390   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr/Microsoft.CodeAnalysis.CSharp.resources.dll as tr/Microsoft.CodeAnalysis.CSharp.resources.dll
2026-09-08T18:58:55.6975805Z I0908 15:58:55.697271   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr/Microsoft.CodeAnalysis.Features.resources.dll as tr/Microsoft.CodeAnalysis.Features.resources.dll
2026-09-08T18:58:55.7039703Z I0908 15:58:55.703726   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr/Microsoft.CodeAnalysis.Scripting.resources.dll as tr/Microsoft.CodeAnalysis.Scripting.resources.dll
2026-09-08T18:58:55.7052542Z I0908 15:58:55.705105   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr/Microsoft.CodeAnalysis.Workspaces.resources.dll as tr/Microsoft.CodeAnalysis.Workspaces.resources.dll
2026-09-08T18:58:55.7060925Z I0908 15:58:55.705975   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr/Microsoft.CodeAnalysis.resources.dll as tr/Microsoft.CodeAnalysis.resources.dll
2026-09-08T18:58:55.7087322Z I0908 15:58:55.708581   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr/Microsoft.Data.SqlClient.resources.dll as tr/Microsoft.Data.SqlClient.resources.dll
2026-09-08T18:58:55.7178424Z I0908 15:58:55.717590   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr/Microsoft.TestPlatform.CommunicationUtilities.resources.dll as tr/Microsoft.TestPlatform.CommunicationUtilities.resources.dll
2026-09-08T18:58:55.7183621Z I0908 15:58:55.718224   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr/Microsoft.TestPlatform.CoreUtilities.resources.dll as tr/Microsoft.TestPlatform.CoreUtilities.resources.dll
2026-09-08T18:58:55.7193707Z I0908 15:58:55.719154   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr/Microsoft.TestPlatform.CrossPlatEngine.resources.dll as tr/Microsoft.TestPlatform.CrossPlatEngine.resources.dll
2026-09-08T18:58:55.7194200Z I0908 15:58:55.719224   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr/Microsoft.VisualStudio.TestPlatform.Common.resources.dll as tr/Microsoft.VisualStudio.TestPlatform.Common.resources.dll
2026-09-08T18:58:55.7196328Z I0908 15:58:55.719544   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll as tr/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll
2026-09-08T18:58:55.7206530Z I0908 15:58:55.720484   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/tr/Microsoft.VisualStudio.TraceDataCollector.resources.dll as tr/Microsoft.VisualStudio.TraceDataCollector.resources.dll
2026-09-08T18:58:55.7206861Z I0908 15:58:55.720580   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/uk as uk
2026-09-08T18:58:55.7212371Z I0908 15:58:55.720889   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/uk/Humanizer.resources.dll as uk/Humanizer.resources.dll
2026-09-08T18:58:55.7212698Z I0908 15:58:55.720946   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/uz-Cyrl-UZ as uz-Cyrl-UZ
2026-09-08T18:58:55.7219546Z I0908 15:58:55.721826   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/uz-Cyrl-UZ/Humanizer.resources.dll as uz-Cyrl-UZ/Humanizer.resources.dll
2026-09-08T18:58:55.7220584Z I0908 15:58:55.721981   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/uz-Latn-UZ as uz-Latn-UZ
2026-09-08T18:58:55.7221998Z I0908 15:58:55.722118   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/uz-Latn-UZ/Humanizer.resources.dll as uz-Latn-UZ/Humanizer.resources.dll
2026-09-08T18:58:55.7222472Z I0908 15:58:55.722181   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/vi as vi
2026-09-08T18:58:55.7225858Z I0908 15:58:55.722309   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/vi/Humanizer.resources.dll as vi/Humanizer.resources.dll
2026-09-08T18:58:55.7226164Z I0908 15:58:55.722370   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/web.config as web.config
2026-09-08T18:58:55.7226477Z I0908 15:58:55.722529   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/xunit.abstractions.dll as xunit.abstractions.dll
2026-09-08T18:58:55.7228629Z I0908 15:58:55.722785   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/xunit.assert.dll as xunit.assert.dll
2026-09-08T18:58:55.7268583Z I0908 15:58:55.726738   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/xunit.core.dll as xunit.core.dll
2026-09-08T18:58:55.7306449Z I0908 15:58:55.730388   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/xunit.execution.dotnet.dll as xunit.execution.dotnet.dll
2026-09-08T18:58:55.7414463Z I0908 15:58:55.741208   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/xunit.runner.reporters.netcoreapp10.dll as xunit.runner.reporters.netcoreapp10.dll
2026-09-08T18:58:55.7455487Z I0908 15:58:55.745317   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/xunit.runner.utility.netcoreapp10.dll as xunit.runner.utility.netcoreapp10.dll
2026-09-08T18:58:55.7558989Z I0908 15:58:55.755674   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/xunit.runner.visualstudio.dotnetcore.testadapter.dll as xunit.runner.visualstudio.dotnetcore.testadapter.dll
2026-09-08T18:58:55.7629447Z I0908 15:58:55.762723   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-CN as zh-CN
2026-09-08T18:58:55.7629842Z I0908 15:58:55.762815   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-CN/Humanizer.resources.dll as zh-CN/Humanizer.resources.dll
2026-09-08T18:58:55.7630144Z I0908 15:58:55.762890   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans as zh-Hans
2026-09-08T18:58:55.7632482Z I0908 15:58:55.763117   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans/Humanizer.resources.dll as zh-Hans/Humanizer.resources.dll
2026-09-08T18:58:55.7633165Z I0908 15:58:55.763169   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans/Microsoft.CodeAnalysis.CSharp.Features.resources.dll as zh-Hans/Microsoft.CodeAnalysis.CSharp.Features.resources.dll
2026-09-08T18:58:55.7648541Z I0908 15:58:55.764722   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll as zh-Hans/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll
2026-09-08T18:58:55.7650452Z I0908 15:58:55.764953   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans/Microsoft.CodeAnalysis.CSharp.resources.dll as zh-Hans/Microsoft.CodeAnalysis.CSharp.resources.dll
2026-09-08T18:58:55.7809335Z I0908 15:58:55.780670   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans/Microsoft.CodeAnalysis.Features.resources.dll as zh-Hans/Microsoft.CodeAnalysis.Features.resources.dll
2026-09-08T18:58:55.7877599Z I0908 15:58:55.787591   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans/Microsoft.CodeAnalysis.Scripting.resources.dll as zh-Hans/Microsoft.CodeAnalysis.Scripting.resources.dll
2026-09-08T18:58:55.7880422Z I0908 15:58:55.787961   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans/Microsoft.CodeAnalysis.Workspaces.resources.dll as zh-Hans/Microsoft.CodeAnalysis.Workspaces.resources.dll
2026-09-08T18:58:55.7893939Z I0908 15:58:55.789265   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans/Microsoft.CodeAnalysis.resources.dll as zh-Hans/Microsoft.CodeAnalysis.resources.dll
2026-09-08T18:58:55.7912374Z I0908 15:58:55.791075   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans/Microsoft.Data.SqlClient.resources.dll as zh-Hans/Microsoft.Data.SqlClient.resources.dll
2026-09-08T18:58:55.8008543Z I0908 15:58:55.800587   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans/Microsoft.TestPlatform.CommunicationUtilities.resources.dll as zh-Hans/Microsoft.TestPlatform.CommunicationUtilities.resources.dll
2026-09-08T18:58:55.8009161Z I0908 15:58:55.800756   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans/Microsoft.TestPlatform.CoreUtilities.resources.dll as zh-Hans/Microsoft.TestPlatform.CoreUtilities.resources.dll
2026-09-08T18:58:55.8011982Z I0908 15:58:55.801106   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans/Microsoft.TestPlatform.CrossPlatEngine.resources.dll as zh-Hans/Microsoft.TestPlatform.CrossPlatEngine.resources.dll
2026-09-08T18:58:55.8012760Z I0908 15:58:55.801201   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans/Microsoft.VisualStudio.TestPlatform.Common.resources.dll as zh-Hans/Microsoft.VisualStudio.TestPlatform.Common.resources.dll
2026-09-08T18:58:55.8021143Z I0908 15:58:55.802004   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll as zh-Hans/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll
2026-09-08T18:58:55.8024956Z I0908 15:58:55.802397   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hans/Microsoft.VisualStudio.TraceDataCollector.resources.dll as zh-Hans/Microsoft.VisualStudio.TraceDataCollector.resources.dll
2026-09-08T18:58:55.8033223Z I0908 15:58:55.803232   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant as zh-Hant
2026-09-08T18:58:55.8033655Z I0908 15:58:55.803296   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant/Humanizer.resources.dll as zh-Hant/Humanizer.resources.dll
2026-09-08T18:58:55.8034181Z I0908 15:58:55.803351   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant/Microsoft.CodeAnalysis.CSharp.Features.resources.dll as zh-Hant/Microsoft.CodeAnalysis.CSharp.Features.resources.dll
2026-09-08T18:58:55.8051148Z I0908 15:58:55.805010   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll as zh-Hant/Microsoft.CodeAnalysis.CSharp.Workspaces.resources.dll
2026-09-08T18:58:55.8052850Z I0908 15:58:55.805097   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant/Microsoft.CodeAnalysis.CSharp.resources.dll as zh-Hant/Microsoft.CodeAnalysis.CSharp.resources.dll
2026-09-08T18:58:55.8205259Z I0908 15:58:55.820303   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant/Microsoft.CodeAnalysis.Features.resources.dll as zh-Hant/Microsoft.CodeAnalysis.Features.resources.dll
2026-09-08T18:58:55.8260579Z I0908 15:58:55.825922   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant/Microsoft.CodeAnalysis.Scripting.resources.dll as zh-Hant/Microsoft.CodeAnalysis.Scripting.resources.dll
2026-09-08T18:58:55.8271133Z I0908 15:58:55.827019   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant/Microsoft.CodeAnalysis.Workspaces.resources.dll as zh-Hant/Microsoft.CodeAnalysis.Workspaces.resources.dll
2026-09-08T18:58:55.8281148Z I0908 15:58:55.827925   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant/Microsoft.CodeAnalysis.resources.dll as zh-Hant/Microsoft.CodeAnalysis.resources.dll
2026-09-08T18:58:55.8304447Z I0908 15:58:55.830311   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant/Microsoft.Data.SqlClient.resources.dll as zh-Hant/Microsoft.Data.SqlClient.resources.dll
2026-09-08T18:58:55.8394997Z I0908 15:58:55.839237   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant/Microsoft.TestPlatform.CommunicationUtilities.resources.dll as zh-Hant/Microsoft.TestPlatform.CommunicationUtilities.resources.dll
2026-09-08T18:58:55.8395876Z I0908 15:58:55.839376   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant/Microsoft.TestPlatform.CoreUtilities.resources.dll as zh-Hant/Microsoft.TestPlatform.CoreUtilities.resources.dll
2026-09-08T18:58:55.8403205Z I0908 15:58:55.840221   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant/Microsoft.TestPlatform.CrossPlatEngine.resources.dll as zh-Hant/Microsoft.TestPlatform.CrossPlatEngine.resources.dll
2026-09-08T18:58:55.8407329Z I0908 15:58:55.840635   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant/Microsoft.VisualStudio.TestPlatform.Common.resources.dll as zh-Hant/Microsoft.VisualStudio.TestPlatform.Common.resources.dll
2026-09-08T18:58:55.8408059Z I0908 15:58:55.840738   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll as zh-Hant/Microsoft.VisualStudio.TestPlatform.ObjectModel.resources.dll
2026-09-08T18:58:55.8411476Z I0908 15:58:55.841030   65093 tar.go:336] Adding to tar: /opt/ads-agent/_work/34/a/zh-Hant/Microsoft.VisualStudio.TraceDataCollector.resources.dll as zh-Hant/Microsoft.VisualStudio.TraceDataCollector.resources.dll
2026-09-08T18:58:55.8478216Z 
2026-09-08T18:58:55.8478855Z Uploading finished
2026-09-08T18:58:55.8480159Z build.build.openshift.io/sisou-api-sac-internet-182 started
2026-09-08T18:58:55.8582725Z Adding cluster TLS certificate authority to trust store
2026-09-08T18:58:55.8583258Z Receiving source from STDIN as archive ...
2026-09-08T18:58:57.7820148Z Adding cluster TLS certificate authority to trust store
2026-09-08T18:58:58.7865824Z Adding cluster TLS certificate authority to trust store
2026-09-08T18:58:59.4217695Z time="2026-09-08T18:58:59Z" level=info msg="Not using native diff for overlay, this may cause degraded performance for building images: kernel has CONFIG_OVERLAY_FS_REDIRECT_DIR enabled"
2026-09-08T18:58:59.4218318Z I0908 18:58:59.420616       1 defaults.go:102] Defaulting to storage driver "overlay" with options [mountopt=metacopy=on].
2026-09-08T18:58:59.4632127Z Caching blobs under "/var/cache/blobs".
2026-09-08T18:58:59.4657518Z Trying to pull registry.redhat.io/rhel8/dotnet-80-runtime@sha256:fb5de5fe3b3e47713307c1553f59000e41a7cdeb03d4cf838031d86ef906dcbb...
2026-09-08T18:59:01.5311460Z Getting image source signatures
2026-09-08T18:59:02.2446228Z Copying blob sha256:e0348fdb2685077d22116d294a90a253709aba78815882a57fcc536b22dcae2f
2026-09-08T18:59:02.2617595Z Copying blob sha256:f5388226138df9f987cca2aa02e1a44771f8a97d25ac296673cbb41a585de1d5
2026-09-08T18:59:14.6817588Z Copying config sha256:77494087d97109238779ca2731988377fdc3bb86f24d21fc7b501f1eeb47d2bc
2026-09-08T18:59:14.7581041Z Writing manifest to image destination
2026-09-08T18:59:14.7697301Z Storing signatures
2026-09-08T18:59:16.6111859Z Generating dockerfile with builder image registry.redhat.io/rhel8/dotnet-80-runtime@sha256:fb5de5fe3b3e47713307c1553f59000e41a7cdeb03d4cf838031d86ef906dcbb
2026-09-08T18:59:17.4914696Z STEP 1/9: FROM registry.redhat.io/rhel8/dotnet-80-runtime@sha256:fb5de5fe3b3e47713307c1553f59000e41a7cdeb03d4cf838031d86ef906dcbb
2026-09-08T18:59:17.5384014Z STEP 2/9: LABEL "io.openshift.build.image"="registry.redhat.io/rhel8/dotnet-80-runtime@sha256:fb5de5fe3b3e47713307c1553f59000e41a7cdeb03d4cf838031d86ef906dcbb"       "io.openshift.build.source-location"="/tmp/build/inputs"
2026-09-08T18:59:17.5690703Z STEP 3/9: ENV OPENSHIFT_BUILD_NAME="sisou-api-sac-internet-182"     OPENSHIFT_BUILD_NAMESPACE="build-images-ads"
2026-09-08T18:59:17.5980710Z STEP 4/9: USER root
2026-09-08T18:59:17.6265041Z STEP 5/9: COPY upload/src /tmp/src
2026-09-08T18:59:18.5976270Z STEP 6/9: RUN chown -R 1001:0 /tmp/src
2026-09-08T18:59:18.9615868Z STEP 7/9: USER 1001
2026-09-08T18:59:18.9967410Z STEP 8/9: RUN /usr/libexec/s2i/assemble
2026-09-08T18:59:19.3222654Z ---> Installing application...
2026-09-08T18:59:19.3362782Z error: cannot find startup assembly
2026-09-08T18:59:19.3363557Z This image does not contain an sdk and can only be used with pre-built applications.
2026-09-08T18:59:19.3363895Z If your startup assembly is not in the root folder, you can specify it using DOTNET_STARTUP_ASSEMBLY.
2026-09-08T18:59:19.3364096Z If you want to build an application, you must use the sdk image instead.
2026-09-08T18:59:19.4744103Z error: build error: error building at STEP "RUN /usr/libexec/s2i/assemble": error while running runtime: exit status 1
2026-09-08T18:59:20.4814346Z error: the build build-images-ads/sisou-api-sac-internet-182 status is "Failed"
2026-09-08T18:59:20.4915504Z ##[error]Bash exited with code '1'.
2026-09-08T18:59:20.4919680Z ##[section]Finishing: Executando Build S2I Binary
