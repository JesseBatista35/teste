2026-08-26T17:38:31.1778122Z ##[section]Starting: Run Code Analysis
2026-08-26T17:38:31.1781174Z ==============================================================================
2026-08-26T17:38:31.1781270Z Task         : Run Code Analysis
2026-08-26T17:38:31.1781328Z Description  : Run scanner and upload the results to the SonarQube server.
2026-08-26T17:38:31.1781409Z Version      : 5.8.0
2026-08-26T17:38:31.1781457Z Author       : sonarsource
2026-08-26T17:38:31.1781512Z Help         : Version: 5.8.0. This task is not needed for Maven and Gradle projects since the scanner should be run as part of the build.

[More Information](http://redirect.sonarsource.com/doc/install-configure-scanner-tfs-ts.html)
2026-08-26T17:38:31.1781769Z ==============================================================================
2026-08-26T17:38:31.3424782Z [command]/opt/ads-agent/cache-tools/.dotnet//dotnet /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/SonarScanner.MSBuild.dll end
2026-08-26T17:38:31.3960561Z SonarScanner for MSBuild 5.8
2026-08-26T17:38:31.3961222Z Using the .NET Core version of the Scanner for MSBuild
2026-08-26T17:38:31.4346522Z Post-processing started.
2026-08-26T17:38:31.5066343Z 14:38:31.506  14:38:31.486  Uninstalling target: /opt/ads-agent/_work/6/.sonarqube/bin/targets/SonarQube.Integration.targets
2026-08-26T17:38:31.5066987Z 14:38:31.506  14:38:31.506  sonar.verbose=true was specified - setting the log verbosity to 'Debug'
2026-08-26T17:38:31.5067541Z 14:38:31.506  Loading the SonarQube analysis config from /opt/ads-agent/_work/6/.sonarqube/conf/SonarQubeAnalysisConfig.xml
2026-08-26T17:38:31.5068239Z 14:38:31.506  Not running under TeamBuild
2026-08-26T17:38:31.5068696Z 14:38:31.506  Analysis base directory: /opt/ads-agent/_work/6/.sonarqube
2026-08-26T17:38:31.5068851Z Build directory: 
2026-08-26T17:38:31.5069040Z Bin directory: /opt/ads-agent/_work/6/.sonarqube/bin
2026-08-26T17:38:31.5069254Z Config directory: /opt/ads-agent/_work/6/.sonarqube/conf
2026-08-26T17:38:31.5069465Z Output directory: /opt/ads-agent/_work/6/.sonarqube/out
2026-08-26T17:38:31.5069693Z Config file: /opt/ads-agent/_work/6/.sonarqube/conf/SonarQubeAnalysisConfig.xml
2026-08-26T17:38:31.5079936Z 14:38:31.507  Generating SonarQube project properties file to /opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties
2026-08-26T17:38:31.5254949Z 14:38:31.525  Setting analysis property: sonar.visualstudio.enable=false
2026-08-26T17:38:31.5434196Z 14:38:31.543  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/0/Issues.json
2026-08-26T17:38:31.5468561Z 14:38:31.546  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/1/Issues.json
2026-08-26T17:38:31.5501164Z 14:38:31.549  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/2/Issues.json
2026-08-26T17:38:31.5602946Z 14:38:31.56  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/3/Issues.json
2026-08-26T17:38:31.5632113Z 14:38:31.563  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/4/Issues.json
2026-08-26T17:38:31.5666900Z 14:38:31.566  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/5/Issues.json
2026-08-26T17:38:31.5677505Z 14:38:31.567  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/6/Issues.json
2026-08-26T17:38:31.5686791Z 14:38:31.568  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/7/Issues.json
2026-08-26T17:38:31.5789139Z 14:38:31.578  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/8/Issues.json
2026-08-26T17:38:31.5888889Z 14:38:31.588  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/9/Issues.json
2026-08-26T17:38:31.5918679Z 14:38:31.591  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/10/Issues.json
2026-08-26T17:38:31.6061115Z 14:38:31.605  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/11/Issues.json
2026-08-26T17:38:31.6084153Z 14:38:31.608  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/12/Issues.json
2026-08-26T17:38:31.6108618Z 14:38:31.61  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/13/Issues.json
2026-08-26T17:38:31.6117154Z 14:38:31.611  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/14/Issues.json
2026-08-26T17:38:31.6196383Z 14:38:31.619  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/15/Issues.json
2026-08-26T17:38:31.6219041Z 14:38:31.621  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/16/Issues.json
2026-08-26T17:38:31.6242958Z 14:38:31.624  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/17/Issues.json
2026-08-26T17:38:31.6252110Z 14:38:31.625  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/18/Issues.json
2026-08-26T17:38:31.6260903Z 14:38:31.625  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/19/Issues.json
2026-08-26T17:38:31.6263440Z 14:38:31.626  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/20/Issues.json
2026-08-26T17:38:31.6340360Z 14:38:31.633  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/21/Issues.json
2026-08-26T17:38:31.6364647Z 14:38:31.636  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/22/Issues.json
2026-08-26T17:38:31.6387318Z 14:38:31.638  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/23/Issues.json
2026-08-26T17:38:31.6396451Z 14:38:31.639  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/24/Issues.json
2026-08-26T17:38:31.6405282Z 14:38:31.64  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/25/Issues.json
2026-08-26T17:38:31.6407660Z 14:38:31.64  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/26/Issues.json
2026-08-26T17:38:31.6512924Z 14:38:31.65  Using longest common projects path as a base directory: '/opt/ads-agent/_work/6/s'.
2026-08-26T17:38:31.6611489Z 14:38:31.66  File was referenced by the following projects: '/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/TesteSimovBatch.csproj', '/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/TesteSimovBatch.csproj'.
2026-08-26T17:38:31.6718018Z 14:38:31.666  Dumping content of sonar-project.properties
2026-08-26T17:38:31.6718332Z ------------------------------------------------------------------------
2026-08-26T17:38:31.6718609Z sonar.projectKey=SIMOV-imoveiscaixa-batch
2026-08-26T17:38:31.6719125Z sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar
2026-08-26T17:38:31.6719327Z sonar.projectBaseDir=/opt/ads-agent/_work/6/s
2026-08-26T17:38:31.6719407Z 
2026-08-26T17:38:31.6719672Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectKey=SIMOV-imoveiscaixa-batch:0B395246-F58A-479C-B0B1-C6A6045C6FD3
2026-08-26T17:38:31.6719939Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectName=Simov.Core
2026-08-26T17:38:31.6720187Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:38:31.6720423Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.sourceEncoding=utf-8
2026-08-26T17:38:31.6720717Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.sources=\
2026-08-26T17:38:31.6720941Z "/opt/ads-agent/_work/6/s/src/Simov.Core/AutenticacaoSso/AutenticacarSso.cs",\
2026-08-26T17:38:31.6721166Z "/opt/ads-agent/_work/6/s/src/Simov.Core/AutenticacaoSso/IAutenticacarSso.cs",\
2026-08-26T17:38:31.6721382Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Data/IBaseRepository.cs",\
2026-08-26T17:38:31.6721591Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Data/IUnitOfWork.cs",\
2026-08-26T17:38:31.6721798Z "/opt/ads-agent/_work/6/s/src/Simov.Core/DomainObjects/Entity.cs",\
2026-08-26T17:38:31.6722019Z "/opt/ads-agent/_work/6/s/src/Simov.Core/DomainObjects/IAggregateRoot.cs",\
2026-08-26T17:38:31.6722241Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/ApplicationException.cs",\
2026-08-26T17:38:31.6722462Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/CancellationException.cs",\
2026-08-26T17:38:31.6722686Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/EntityValidationException.cs",\
2026-08-26T17:38:31.6722909Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/GenericException.cs",\
2026-08-26T17:38:31.6723133Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/NotFoundException.cs",\
2026-08-26T17:38:31.6723354Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/ProcessamentoException.cs",\
2026-08-26T17:38:31.6723580Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/RelatedAggregateException.cs",\
2026-08-26T17:38:31.6723927Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/UnauthorizedException.cs",\
2026-08-26T17:38:31.6724145Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Logging/LoggerExtensions.cs",\
2026-08-26T17:38:31.6724365Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siico/ApiSiicoRestPrivado.cs",\
2026-08-26T17:38:31.6724587Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siico/ApiSiicoRestPublico.cs",\
2026-08-26T17:38:31.6724807Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siiso/ApiSiisoRestPublico.cs",\
2026-08-26T17:38:31.6725021Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/DadosDto.cs",\
2026-08-26T17:38:31.6725244Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/DadosSimilDto.cs",\
2026-08-26T17:38:31.6725465Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/FotosDto.cs",\
2026-08-26T17:38:31.6725681Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/ListaFotoDto.cs",\
2026-08-26T17:38:31.6725893Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/ISOAPWeb.cs",\
2026-08-26T17:38:31.6726116Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/RobustSoapDeserializer.cs",\
2026-08-26T17:38:31.6726333Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/SOAPWeb.cs",\
2026-08-26T17:38:31.6726849Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/ResponseGenerico.cs",\
2026-08-26T17:38:31.6727077Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/BairroDetalhadoSiico.cs",\
2026-08-26T17:38:31.6727297Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/BairroSiico.cs",\
2026-08-26T17:38:31.6727507Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/CepSiico.cs",\
2026-08-26T17:38:31.6727722Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/LocalidadeSiico.cs",\
2026-08-26T17:38:31.6727944Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioCompletoSiico.cs",\
2026-08-26T17:38:31.6728168Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioParcialSiico.cs",\
2026-08-26T17:38:31.6729347Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioSiico.cs",\
2026-08-26T17:38:31.6729644Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/TipoLogradouroSiico.cs",\
2026-08-26T17:38:31.6729872Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/UnidadeCaixa.cs",\
2026-08-26T17:38:31.6730112Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/UnidadeFederacaoSiico.cs",\
2026-08-26T17:38:31.6730344Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/EnderecoPessoaSiiso.cs",\
2026-08-26T17:38:31.6730577Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/LocalidadeNascimentoSiiso.cs",\
2026-08-26T17:38:31.6730911Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/PessoaSiiso.cs",\
2026-08-26T17:38:31.6731144Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siico/IApiSiicoRestPrivado.cs",\
2026-08-26T17:38:31.6731382Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siico/IApiSiicoRestPublico.cs",\
2026-08-26T17:38:31.6731623Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siiso/IApiSiisoRestPublico.cs"
2026-08-26T17:38:31.6731698Z 
2026-08-26T17:38:31.6731900Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:31.6732094Z "/opt/ads-agent/_work/6/.sonarqube/out/0"
2026-08-26T17:38:31.6732311Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:31.6732532Z "/opt/ads-agent/_work/6/.sonarqube/out/0/Issues.json"
2026-08-26T17:38:31.6732594Z 
2026-08-26T17:38:31.6732822Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod0
2026-08-26T17:38:31.6733148Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectKey=SIMOV-imoveiscaixa-batch:5E55366D-25CB-4B0F-BAF4-738003A18ED2
2026-08-26T17:38:31.6733416Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectName=Simov.Domain
2026-08-26T17:38:31.6733793Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:38:31.6734045Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.sourceEncoding=utf-8
2026-08-26T17:38:31.6734256Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.sources=\
2026-08-26T17:38:31.6734480Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AgrupamentoVendaImovel.cs",\
2026-08-26T17:38:31.6734703Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaArquivoLote.cs",\
2026-08-26T17:38:31.6734977Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaFotoImovel.cs",\
2026-08-26T17:38:31.6735280Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaFotoLote.cs",\
2026-08-26T17:38:31.6735518Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaUsuario.cs",\
2026-08-26T17:38:31.6735744Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AvaliacaoImovel.cs",\
2026-08-26T17:38:31.6735954Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/ComodoImovel.cs",\
2026-08-26T17:38:31.6736174Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/ControleProcessamento.cs",\
2026-08-26T17:38:31.6736681Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/DadoContabil.cs",\
2026-08-26T17:38:31.6736960Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/FotoImovel.cs",\
2026-08-26T17:38:31.6737194Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoAgrupamentoVendaImovel.cs",\
2026-08-26T17:38:31.6737433Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoAvaliacaoImovel.cs",\
2026-08-26T17:38:31.6737660Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoComodoImovel.cs",\
2026-08-26T17:38:31.6737880Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoDadoContabil.cs",\
2026-08-26T17:38:31.6738101Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoImovel.cs",\
2026-08-26T17:38:31.6739106Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoMatriculaImovel.cs",\
2026-08-26T17:38:31.6739377Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/Imovel.cs",\
2026-08-26T17:38:31.6739730Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/MatriculaImovel.cs",\
2026-08-26T17:38:31.6740027Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/MensagemControleProcessamento.cs",\
2026-08-26T17:38:31.6740259Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/RotinaProcessamento.cs",\
2026-08-26T17:38:31.6740482Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/ClassificacaoImovelEnum.cs",\
2026-08-26T17:38:31.6740702Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/EstadoConservacaoEnum.cs",\
2026-08-26T17:38:31.6740920Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/FuncionalidadeSistemaEnum.cs",\
2026-08-26T17:38:31.6741133Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/IcAcaoSistemaEnum.cs",\
2026-08-26T17:38:31.6741401Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/IcShortEnum.cs",\
2026-08-26T17:38:31.6741614Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/MotivoExclusaoEnum.cs",\
2026-08-26T17:38:31.6741908Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/OrgaoProprietarioImovelEnum.cs",\
2026-08-26T17:38:31.6742129Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/OrigemImovelEnum.cs",\
2026-08-26T17:38:31.6742357Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/ResultadoMensagemProcessamentoEnum.cs",\
2026-08-26T17:38:31.6742585Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/RotinaProcessamentoEnum.cs",\
2026-08-26T17:38:31.6742809Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/SituacaoImovelEnum.cs",\
2026-08-26T17:38:31.6743035Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/SituacaoProcessamentoEnum.cs",\
2026-08-26T17:38:31.6743250Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoCampoEnum.cs",\
2026-08-26T17:38:31.6743461Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoComodoEnum.cs",\
2026-08-26T17:38:31.6743788Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoImovelEnum.cs",\
2026-08-26T17:38:31.6744256Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoMatriculaEnum.cs",\
2026-08-26T17:38:31.6744488Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAgrupamentoVendaImovelRepository.cs",\
2026-08-26T17:38:31.6744727Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaArquivoLoteRepository.cs",\
2026-08-26T17:38:31.6744967Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaFotoImovelRepository.cs",\
2026-08-26T17:38:31.6745201Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaFotoLoteRepository.cs",\
2026-08-26T17:38:31.6745433Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaUsuarioRepository.cs",\
2026-08-26T17:38:31.6745668Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAvaliacaoImovelRepository.cs",\
2026-08-26T17:38:31.6745896Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IComodoImovelRepository.cs",\
2026-08-26T17:38:31.6746132Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IControleProcessamentoRepository.cs",\
2026-08-26T17:38:31.6746368Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IDadoContabilRepository.cs",\
2026-08-26T17:38:31.6746595Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IFotoImovelRepository.cs",\
2026-08-26T17:38:31.6746815Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IGeradorHistorico.cs",\
2026-08-26T17:38:31.6747033Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IImovelRepository.cs",\
2026-08-26T17:38:31.6747259Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IMatriculaImovelRepository.cs",\
2026-08-26T17:38:31.6747500Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IMensagemControleProcessamentoRepository.cs",\
2026-08-26T17:38:31.6747742Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IRotinaProcessamentoRepository.cs",\
2026-08-26T17:38:31.6747963Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/BaseArquivoLayout.cs",\
2026-08-26T17:38:31.6748173Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/SiaciLayout.cs",\
2026-08-26T17:38:31.6748377Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/SiopiLayout.cs"
2026-08-26T17:38:31.6748458Z 
2026-08-26T17:38:31.6748758Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:31.6749693Z "/opt/ads-agent/_work/6/.sonarqube/out/1"
2026-08-26T17:38:31.6749912Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:31.6750118Z "/opt/ads-agent/_work/6/.sonarqube/out/1/Issues.json"
2026-08-26T17:38:31.6750182Z 
2026-08-26T17:38:31.6750408Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod1
2026-08-26T17:38:31.6750722Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectKey=SIMOV-imoveiscaixa-batch:0847F1F3-B5DA-4FC3-8EEF-882D75A674FD
2026-08-26T17:38:31.6750990Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectName=Simov.Application
2026-08-26T17:38:31.6751320Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:38:31.6751564Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.sourceEncoding=utf-8
2026-08-26T17:38:31.6751772Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.sources=\
2026-08-26T17:38:31.6751997Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Contexts/FileProcessingContext.cs",\
2026-08-26T17:38:31.6752231Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Contexts/SiicoCallCounterContext.cs",\
2026-08-26T17:38:31.6752456Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/AvaliacaoImovelDto.cs",\
2026-08-26T17:38:31.6752678Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/DadoContabilDto.cs",\
2026-08-26T17:38:31.6752890Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/EnderecoDto.cs",\
2026-08-26T17:38:31.6753097Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/ImovelDto.cs",\
2026-08-26T17:38:31.6753317Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/MatriculaImovelDto.cs",\
2026-08-26T17:38:31.6754098Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/MunicipioDto.cs",\
2026-08-26T17:38:31.6754318Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/SiaciDDQDto.cs",\
2026-08-26T17:38:31.6754535Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/TipoLogradouroDto.cs",\
2026-08-26T17:38:31.6754771Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ICargaFotoImovelService.cs",\
2026-08-26T17:38:31.6755001Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ICargaImovelService.cs",\
2026-08-26T17:38:31.6755221Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IFileService.cs",\
2026-08-26T17:38:31.6755445Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSiaciUseCase.cs",\
2026-08-26T17:38:31.6755687Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSimilFotoUseCase.cs",\
2026-08-26T17:38:31.6755911Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSimilUseCase.cs",\
2026-08-26T17:38:31.6756143Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSiopiUseCase.cs",\
2026-08-26T17:38:31.6756367Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ILeituraService.cs",\
2026-08-26T17:38:31.6756602Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ILogProcessamentoService.cs",\
2026-08-26T17:38:31.6756837Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IMapperDataService.cs",\
2026-08-26T17:38:31.6757130Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ISiaciDDQUseCase.cs",\
2026-08-26T17:38:31.6757410Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IWorkerImovelService.cs",\
2026-08-26T17:38:31.6757659Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/CargaImovelService.cs",\
2026-08-26T17:38:31.6757880Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/FileService.cs",\
2026-08-26T17:38:31.6758097Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/LeituraService.cs",\
2026-08-26T17:38:31.6758323Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/LogProcessamentoService.cs",\
2026-08-26T17:38:31.6758587Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/MapperDataService.cs",\
2026-08-26T17:38:31.6758843Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/WorkerImovelService.cs",\
2026-08-26T17:38:31.6759230Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSiaciUseCase.cs",\
2026-08-26T17:38:31.6759464Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSimilFotoUseCase.cs",\
2026-08-26T17:38:31.6759693Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSimilUseCase.cs",\
2026-08-26T17:38:31.6759917Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSiopiUseCase.cs",\
2026-08-26T17:38:31.6760135Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/SiaciDDQUseCase.cs"
2026-08-26T17:38:31.6760205Z 
2026-08-26T17:38:31.6760400Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:31.6760639Z "/opt/ads-agent/_work/6/.sonarqube/out/2"
2026-08-26T17:38:31.6760847Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:31.6761049Z "/opt/ads-agent/_work/6/.sonarqube/out/2/Issues.json"
2026-08-26T17:38:31.6761117Z 
2026-08-26T17:38:31.6761365Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod2
2026-08-26T17:38:31.6761729Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectKey=SIMOV-imoveiscaixa-batch:D745E52F-7A66-4C38-B30D-3A27EA75CCCE
2026-08-26T17:38:31.6761985Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectName=Simov.Core
2026-08-26T17:38:31.6762267Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:38:31.6762528Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.sourceEncoding=utf-8
2026-08-26T17:38:31.6762733Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.sources=\
2026-08-26T17:38:31.6762806Z 
2026-08-26T17:38:31.6762843Z 
2026-08-26T17:38:31.6763032Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:31.6763225Z "/opt/ads-agent/_work/6/.sonarqube/out/3"
2026-08-26T17:38:31.6763432Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:31.6763699Z "/opt/ads-agent/_work/6/.sonarqube/out/3/Issues.json"
2026-08-26T17:38:31.6763772Z 
2026-08-26T17:38:31.6764001Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod3
2026-08-26T17:38:31.6764304Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectKey=SIMOV-imoveiscaixa-batch:FBCB055E-203B-4979-BB94-B02AE276DE0B
2026-08-26T17:38:31.6764565Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectName=Simov.Domain
2026-08-26T17:38:31.6764812Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:38:31.6765037Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.sourceEncoding=utf-8
2026-08-26T17:38:31.6765241Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.sources=\
2026-08-26T17:38:31.6765303Z 
2026-08-26T17:38:31.6765345Z 
2026-08-26T17:38:31.6765535Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:31.6765726Z "/opt/ads-agent/_work/6/.sonarqube/out/4"
2026-08-26T17:38:31.6765933Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:31.6766130Z "/opt/ads-agent/_work/6/.sonarqube/out/4/Issues.json"
2026-08-26T17:38:31.6766189Z 
2026-08-26T17:38:31.6766412Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod4
2026-08-26T17:38:31.6766717Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectKey=SIMOV-imoveiscaixa-batch:D6E1F89D-8BFA-426E-BC94-C1182DBD0621
2026-08-26T17:38:31.6766988Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectName=Simov.Application
2026-08-26T17:38:31.6767244Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:38:31.6767484Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.sourceEncoding=utf-8
2026-08-26T17:38:31.6767730Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.sources=\
2026-08-26T17:38:31.6767797Z 
2026-08-26T17:38:31.6767838Z 
2026-08-26T17:38:31.6768029Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:31.6768275Z "/opt/ads-agent/_work/6/.sonarqube/out/5"
2026-08-26T17:38:31.6768484Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:31.6768684Z "/opt/ads-agent/_work/6/.sonarqube/out/5/Issues.json"
2026-08-26T17:38:31.6768744Z 
2026-08-26T17:38:31.6768964Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod5
2026-08-26T17:38:31.6769268Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectKey=SIMOV-imoveiscaixa-batch:AD78E470-A67C-4901-A53F-E3D7D40350CD
2026-08-26T17:38:31.6769533Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:38:31.6769843Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:38:31.6770078Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.sourceEncoding=utf-8
2026-08-26T17:38:31.6770284Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.sources=\
2026-08-26T17:38:31.6770540Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Common/BaseRepository.cs",\
2026-08-26T17:38:31.6770814Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Common/UnitOfWork.cs",\
2026-08-26T17:38:31.6771050Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Interceptor/HistoricosInterceptor.cs",\
2026-08-26T17:38:31.6771297Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AgrupamentoVendaImovelConfiguration.cs",\
2026-08-26T17:38:31.6771551Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaArquivoLoteConfiguration.cs",\
2026-08-26T17:38:31.6771793Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaFotoImovelConfiguration.cs",\
2026-08-26T17:38:31.6772033Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaFotoLoteConfiguration.cs",\
2026-08-26T17:38:31.6772277Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaUsuarioConfiguration.cs",\
2026-08-26T17:38:31.6772515Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AvaliacaoImovelConfiguration.cs",\
2026-08-26T17:38:31.6772757Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ComodoImovelConfiguration.cs",\
2026-08-26T17:38:31.6773001Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ControleProcessamentoConfiguration.cs",\
2026-08-26T17:38:31.6773241Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/DadoContabilConfiguration.cs",\
2026-08-26T17:38:31.6773475Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/FotoImovelConfiguration.cs",\
2026-08-26T17:38:31.6773828Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoAgrupamentoVendaImovelConfiguration.cs",\
2026-08-26T17:38:31.6774098Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoAvaliacaoImovelConfiguration.cs",\
2026-08-26T17:38:31.6774354Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoComodoImovelConfiguration.cs",\
2026-08-26T17:38:31.6774610Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoDadoContabilConfiguration.cs",\
2026-08-26T17:38:31.6774855Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoImovelConfiguration.cs",\
2026-08-26T17:38:31.6775101Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoMatriculaImovelConfiguration.cs",\
2026-08-26T17:38:31.6775338Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ImovelConfiguration.cs",\
2026-08-26T17:38:31.6775579Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/MatriculaImovelConfiguration.cs",\
2026-08-26T17:38:31.6775832Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/MensagemControleProcessamentoConfiguration.cs",\
2026-08-26T17:38:31.6776082Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/RotinaProcessamentoConfiguration.cs",\
2026-08-26T17:38:31.6776330Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AgrupamentoVendaImovelRepository.cs",\
2026-08-26T17:38:31.6776577Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaArquivoLoteRepository.cs",\
2026-08-26T17:38:31.6776881Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaFotoImovelRepository.cs",\
2026-08-26T17:38:31.6777127Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaFotoLoteRepository.cs",\
2026-08-26T17:38:31.6777370Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaUsuarioRepository.cs",\
2026-08-26T17:38:31.6777612Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AvaliacaoImovelRepository.cs",\
2026-08-26T17:38:31.6777851Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ComodoImovelRepository.cs",\
2026-08-26T17:38:31.6778092Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ControleProcessamentoRepository.cs",\
2026-08-26T17:38:31.6778420Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/DadoContabilRepository.cs",\
2026-08-26T17:38:31.6778727Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/FotoImovelRepository.cs",\
2026-08-26T17:38:31.6779033Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ImovelRepository.cs",\
2026-08-26T17:38:31.6779274Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/MatriculaImovelRepository.cs",\
2026-08-26T17:38:31.6779522Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/MensagemControleProcessamentoRepository.cs",\
2026-08-26T17:38:31.6779773Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/RotinaProcessamentoRepository.cs",\
2026-08-26T17:38:31.6779991Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/SimovDbContext.cs"
2026-08-26T17:38:31.6780067Z 
2026-08-26T17:38:31.6780335Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:31.6780580Z "/opt/ads-agent/_work/6/.sonarqube/out/6"
2026-08-26T17:38:31.6780791Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:31.6780989Z "/opt/ads-agent/_work/6/.sonarqube/out/6/Issues.json"
2026-08-26T17:38:31.6781050Z 
2026-08-26T17:38:31.6781272Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod6
2026-08-26T17:38:31.6781646Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectKey=SIMOV-imoveiscaixa-batch:B904AD47-4763-413C-9324-7889FD92EFA6
2026-08-26T17:38:31.6781910Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectName=Simov.Batch
2026-08-26T17:38:31.6782159Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:38:31.6782391Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.sourceEncoding=utf-8
2026-08-26T17:38:31.6782594Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.sources=\
2026-08-26T17:38:31.6782821Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/AddHeadersHttpClient.cs",\
2026-08-26T17:38:31.6783118Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/ConnectionsConfiguration.cs",\
2026-08-26T17:38:31.6783357Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/HttpClientConfiguration.cs",\
2026-08-26T17:38:31.6783584Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/IApiSiisoRestPrivado.cs",\
2026-08-26T17:38:31.6783898Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/UseCasesConfiguration.cs",\
2026-08-26T17:38:31.6784118Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderImoveisSiaci.cs",\
2026-08-26T17:38:31.6784334Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderImoveisSiopi.cs",\
2026-08-26T17:38:31.6784553Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderLeilaoSiaciDDQ.cs",\
2026-08-26T17:38:31.6784753Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Program.cs",\
2026-08-26T17:38:31.6784975Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Workers/WorkerFotoImoveisSimil.cs",\
2026-08-26T17:38:31.6785195Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Workers/WorkerImoveisSimil.cs",\
2026-08-26T17:38:31.6785431Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/Simov.Batch.GlobalUsings.g.cs",\
2026-08-26T17:38:31.6785692Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/.NETCoreApp,Version=v8.0.AssemblyAttributes.cs",\
2026-08-26T17:38:31.6786019Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/Simov.Batch.AssemblyInfo.cs",\
2026-08-26T17:38:31.6786242Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/appsettings.Development.json",\
2026-08-26T17:38:31.6786449Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/appsettings.json",\
2026-08-26T17:38:31.6786753Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Properties/launchSettings.json",\
2026-08-26T17:38:31.6787039Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/apphost"
2026-08-26T17:38:31.6787154Z 
2026-08-26T17:38:31.6787368Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:31.6787600Z "/opt/ads-agent/_work/6/.sonarqube/out/7"
2026-08-26T17:38:31.6787808Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:31.6788037Z "/opt/ads-agent/_work/6/.sonarqube/out/7/Issues.json"
2026-08-26T17:38:31.6788099Z 
2026-08-26T17:38:31.6788318Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod7
2026-08-26T17:38:31.6788625Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectKey=SIMOV-imoveiscaixa-batch:6679F22B-144A-4C59-A28C-2A87F31E3915
2026-08-26T17:38:31.6788931Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectName=Simov.Core
2026-08-26T17:38:31.6789183Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:38:31.6789418Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.sourceEncoding=utf-8
2026-08-26T17:38:31.6789626Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.sources=\
2026-08-26T17:38:31.6789732Z 
2026-08-26T17:38:31.6789766Z 
2026-08-26T17:38:31.6789961Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:31.6790152Z "/opt/ads-agent/_work/6/.sonarqube/out/8"
2026-08-26T17:38:31.6790359Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:31.6790562Z "/opt/ads-agent/_work/6/.sonarqube/out/8/Issues.json"
2026-08-26T17:38:31.6790628Z 
2026-08-26T17:38:31.6790842Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod8
2026-08-26T17:38:31.6791218Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectKey=SIMOV-imoveiscaixa-batch:EC78B0BC-170C-482C-867B-C5402B449403
2026-08-26T17:38:31.6791572Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectName=Simov.Core
2026-08-26T17:38:31.6791817Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:38:31.6792044Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.sourceEncoding=utf-8
2026-08-26T17:38:31.6792313Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.sources=\
2026-08-26T17:38:31.6792387Z 
2026-08-26T17:38:31.6792422Z 
2026-08-26T17:38:31.6792612Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:31.6792803Z "/opt/ads-agent/_work/6/.sonarqube/out/9"
2026-08-26T17:38:31.6793035Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:31.6793240Z "/opt/ads-agent/_work/6/.sonarqube/out/9/Issues.json"
2026-08-26T17:38:31.6793329Z 
2026-08-26T17:38:31.6793549Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod9
2026-08-26T17:38:31.6794001Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectKey=SIMOV-imoveiscaixa-batch:1B2C05E0-E98F-477C-931D-923BBE79AE4E
2026-08-26T17:38:31.6794267Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectName=Simov.Domain
2026-08-26T17:38:31.6794511Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:38:31.6794747Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.sourceEncoding=utf-8
2026-08-26T17:38:31.6794951Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.sources=\
2026-08-26T17:38:31.6795014Z 
2026-08-26T17:38:31.6795059Z 
2026-08-26T17:38:31.6795249Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:31.6795503Z "/opt/ads-agent/_work/6/.sonarqube/out/10"
2026-08-26T17:38:31.6795712Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:31.6795916Z "/opt/ads-agent/_work/6/.sonarqube/out/10/Issues.json"
2026-08-26T17:38:31.6795976Z 
2026-08-26T17:38:31.6796199Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod10
2026-08-26T17:38:31.6796508Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectKey=SIMOV-imoveiscaixa-batch:A180ED2D-1521-44A6-B6EA-5DDEC55D2C17
2026-08-26T17:38:31.6796783Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectName=Simov.Core
2026-08-26T17:38:31.6797085Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:38:31.6797386Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.sourceEncoding=utf-8
2026-08-26T17:38:31.6797603Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.sources=\
2026-08-26T17:38:31.6797669Z 
2026-08-26T17:38:31.6797719Z 
2026-08-26T17:38:31.6797912Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:31.6798108Z "/opt/ads-agent/_work/6/.sonarqube/out/11"
2026-08-26T17:38:31.6798379Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:31.6798687Z "/opt/ads-agent/_work/6/.sonarqube/out/11/Issues.json"
2026-08-26T17:38:31.6798779Z 
2026-08-26T17:38:31.6799059Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod11
2026-08-26T17:38:31.6799362Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectKey=SIMOV-imoveiscaixa-batch:A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E
2026-08-26T17:38:31.6799618Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectName=Simov.Domain
2026-08-26T17:38:31.6799862Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:38:31.6800089Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.sourceEncoding=utf-8
2026-08-26T17:38:31.6800300Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.sources=\
2026-08-26T17:38:31.6800363Z 
2026-08-26T17:38:31.6800397Z 
2026-08-26T17:38:31.6800583Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:31.6800770Z "/opt/ads-agent/_work/6/.sonarqube/out/12"
2026-08-26T17:38:31.6800973Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:31.6801176Z "/opt/ads-agent/_work/6/.sonarqube/out/12/Issues.json"
2026-08-26T17:38:31.6801244Z 
2026-08-26T17:38:31.6801464Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod12
2026-08-26T17:38:31.6801770Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectKey=SIMOV-imoveiscaixa-batch:00300450-28FA-4EA9-8A96-181ED44DCA26
2026-08-26T17:38:31.6802032Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectName=Simov.Application
2026-08-26T17:38:31.6802290Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:38:31.6802527Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.sourceEncoding=utf-8
2026-08-26T17:38:31.6802731Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.sources=\
2026-08-26T17:38:31.6802800Z 
2026-08-26T17:38:31.6802835Z 
2026-08-26T17:38:31.6803022Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:31.6803214Z "/opt/ads-agent/_work/6/.sonarqube/out/13"
2026-08-26T17:38:31.6803421Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:31.6803621Z "/opt/ads-agent/_work/6/.sonarqube/out/13/Issues.json"
2026-08-26T17:38:31.6803764Z 
2026-08-26T17:38:31.6804000Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod13
2026-08-26T17:38:31.6804305Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectKey=SIMOV-imoveiscaixa-batch:1393E257-1007-43DE-B94C-0B0508C0B309
2026-08-26T17:38:31.6804568Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:38:31.6804880Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:38:31.6805117Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.sourceEncoding=utf-8
2026-08-26T17:38:31.6805318Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.sources=\
2026-08-26T17:38:31.6805381Z 
2026-08-26T17:38:31.6805425Z 
2026-08-26T17:38:31.6805611Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:31.6805802Z "/opt/ads-agent/_work/6/.sonarqube/out/14"
2026-08-26T17:38:31.6806006Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:31.6806211Z "/opt/ads-agent/_work/6/.sonarqube/out/14/Issues.json"
2026-08-26T17:38:31.6806307Z 
2026-08-26T17:38:31.6806531Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod14
2026-08-26T17:38:31.6806846Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectKey=SIMOV-imoveiscaixa-batch:5BE00443-BD63-4C9F-A707-406F2AC94762
2026-08-26T17:38:31.6807109Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectName=Simov.Core
2026-08-26T17:38:31.6807352Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:38:31.6807576Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.sourceEncoding=utf-8
2026-08-26T17:38:31.6807778Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.sources=\
2026-08-26T17:38:31.6807839Z 
2026-08-26T17:38:31.6807882Z 
2026-08-26T17:38:31.6808067Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:31.6808256Z "/opt/ads-agent/_work/6/.sonarqube/out/15"
2026-08-26T17:38:31.6808550Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:31.6808824Z "/opt/ads-agent/_work/6/.sonarqube/out/15/Issues.json"
2026-08-26T17:38:31.6808884Z 
2026-08-26T17:38:31.6809109Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod15
2026-08-26T17:38:31.6809413Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectKey=SIMOV-imoveiscaixa-batch:A79CA783-37A2-49D3-B56C-D9102F046AF9
2026-08-26T17:38:31.6809732Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectName=Simov.Domain
2026-08-26T17:38:31.6809983Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:38:31.6810259Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.sourceEncoding=utf-8
2026-08-26T17:38:31.6810467Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.sources=\
2026-08-26T17:38:31.6810541Z 
2026-08-26T17:38:31.6810601Z 
2026-08-26T17:38:31.6810792Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:31.6810982Z "/opt/ads-agent/_work/6/.sonarqube/out/16"
2026-08-26T17:38:31.6811186Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:31.6811391Z "/opt/ads-agent/_work/6/.sonarqube/out/16/Issues.json"
2026-08-26T17:38:31.6811451Z 
2026-08-26T17:38:31.6811669Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod16
2026-08-26T17:38:31.6811969Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectKey=SIMOV-imoveiscaixa-batch:51ABFD24-E14F-4155-B9D7-CDBD0E536AAB
2026-08-26T17:38:31.6812235Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectName=Simov.Application
2026-08-26T17:38:31.6812493Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:38:31.6812785Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.sourceEncoding=utf-8
2026-08-26T17:38:31.6813043Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.sources=\
2026-08-26T17:38:31.6813161Z 
2026-08-26T17:38:31.6813212Z 
2026-08-26T17:38:31.6813493Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:31.6813797Z "/opt/ads-agent/_work/6/.sonarqube/out/17"
2026-08-26T17:38:31.6814011Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:31.6814278Z "/opt/ads-agent/_work/6/.sonarqube/out/17/Issues.json"
2026-08-26T17:38:31.6814348Z 
2026-08-26T17:38:31.6814571Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod17
2026-08-26T17:38:31.6814977Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectKey=SIMOV-imoveiscaixa-batch:F2842708-9CF5-4649-B3A8-6D39E5E01B77
2026-08-26T17:38:31.6815240Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:38:31.6815498Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:38:31.6815729Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.sourceEncoding=utf-8
2026-08-26T17:38:31.6816059Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.sources=\
2026-08-26T17:38:31.6816160Z 
2026-08-26T17:38:31.6816202Z 
2026-08-26T17:38:31.6816425Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:31.6816615Z "/opt/ads-agent/_work/6/.sonarqube/out/18"
2026-08-26T17:38:31.6816822Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:31.6817020Z "/opt/ads-agent/_work/6/.sonarqube/out/18/Issues.json"
2026-08-26T17:38:31.6817079Z 
2026-08-26T17:38:31.6817345Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod18
2026-08-26T17:38:31.6817753Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectKey=SIMOV-imoveiscaixa-batch:3C101C3B-D8C0-461B-B65B-B87A6F75F210
2026-08-26T17:38:31.6818013Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectName=Simov.Batch
2026-08-26T17:38:31.6818257Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:38:31.6818489Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.sourceEncoding=utf-8
2026-08-26T17:38:31.6818694Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.sources=\
2026-08-26T17:38:31.6818755Z 
2026-08-26T17:38:31.6818796Z 
2026-08-26T17:38:31.6818984Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:31.6819177Z "/opt/ads-agent/_work/6/.sonarqube/out/19"
2026-08-26T17:38:31.6819383Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:31.6819588Z "/opt/ads-agent/_work/6/.sonarqube/out/19/Issues.json"
2026-08-26T17:38:31.6819647Z 
2026-08-26T17:38:31.6819869Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod19
2026-08-26T17:38:31.6820175Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectKey=SIMOV-imoveiscaixa-batch:4E341BE0-BD46-427C-8912-6319C41C89BC
2026-08-26T17:38:31.6820439Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectName=TesteSimovBatch
2026-08-26T17:38:31.6820701Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/tests/TesteSimovBatch
2026-08-26T17:38:31.6820948Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.sourceEncoding=utf-8
2026-08-26T17:38:31.6821158Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.sources=
2026-08-26T17:38:31.6821362Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.tests=\
2026-08-26T17:38:31.6821594Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/AvaliacaoImovelDtoTests.cs",\
2026-08-26T17:38:31.6821839Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/DadoContabilDtoTests.cs",\
2026-08-26T17:38:31.6822075Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/ImovelDtoTests.cs",\
2026-08-26T17:38:31.6822319Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/MatriculaImovelDtoTests.cs",\
2026-08-26T17:38:31.6822569Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/CargaImovelServiceTests.cs",\
2026-08-26T17:38:31.6822845Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/FileServiceTests.cs",\
2026-08-26T17:38:31.6823094Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/LeituraSiaciServiceTests.cs",\
2026-08-26T17:38:31.6823348Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/LogProcessamentoServiceTests.cs",\
2026-08-26T17:38:31.6823713Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/MapperDataServiceTests.cs",\
2026-08-26T17:38:31.6823983Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/WorkerImovelServiceTests.cs",\
2026-08-26T17:38:31.6824256Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSiaciPreCadastroUseCaseTests.cs",\
2026-08-26T17:38:31.6824515Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSimilFotoUseCaseTests.cs",\
2026-08-26T17:38:31.6824766Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSimilUseCaseTests.cs",\
2026-08-26T17:38:31.6825062Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSiopiUseCaseTests.cs",\
2026-08-26T17:38:31.6825308Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/SiaciDDQUseCaseTests.cs",\
2026-08-26T17:38:31.6825545Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Batch/LoaderImoveisSiopiTests.cs",\
2026-08-26T17:38:31.6825776Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/CargaImoveisSiaciTests.cs",\
2026-08-26T17:38:31.6826011Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Configuration/AddHeadersHttpClientTests.cs",\
2026-08-26T17:38:31.6826255Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Configuration/ConnectionsConfigurationTest.cs",\
2026-08-26T17:38:31.6826495Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Contexts/FileProcessingContextTests.cs",\
2026-08-26T17:38:31.6826733Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Contexts/SiicoCallCounterContextTests.cs",\
2026-08-26T17:38:31.6826965Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/DomainObjects/EntityTests.cs",\
2026-08-26T17:38:31.6827325Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/DomainObjects/IAggregateRootTests.cs",\
2026-08-26T17:38:31.6827695Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/CancellationExceptionTests.cs",\
2026-08-26T17:38:31.6828018Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/EntityValidationExceptionTests.cs",\
2026-08-26T17:38:31.6828260Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/GenericExceptionTests.cs",\
2026-08-26T17:38:31.6828573Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/NotFoundExceptionTests.cs",\
2026-08-26T17:38:31.6828821Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/ProcessamentoExceptionTests.cs",\
2026-08-26T17:38:31.6829071Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/RelatedAggregateExceptionTests.cs",\
2026-08-26T17:38:31.6829407Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/UnauthorizedExceptionTests.cs",\
2026-08-26T17:38:31.6829771Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siico/ApiSiicoRestPrivadoTests.cs",\
2026-08-26T17:38:31.6830155Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siico/ApiSiicoRestPublicoTests.cs",\
2026-08-26T17:38:31.6830461Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siiso/ApiSiisoRestPublicoTests.cs",\
2026-08-26T17:38:31.6830703Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/AutenticacarSsoTests.cs",\
2026-08-26T17:38:31.6830965Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/BairroDetalhadoSiicoTests.cs",\
2026-08-26T17:38:31.6831311Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/BairroSiicoTests.cs",\
2026-08-26T17:38:31.6831639Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/MunicipioCompletoSiicoTests.cs",\
2026-08-26T17:38:31.6831880Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/ResponseGenericoTests.cs",\
2026-08-26T17:38:31.6832118Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/Siico/CepSiicoTests.cs",\
2026-08-26T17:38:31.6832355Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Domain/Layouts/BaseArquivoLayoutTests.cs",\
2026-08-26T17:38:31.6832592Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/AgrupamentoVendaImovelTests.cs",\
2026-08-26T17:38:31.6832948Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/AvaliacaoImovelSiopiTests.cs",\
2026-08-26T17:38:31.6833185Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/ControleProcessamentoTests.cs",\
2026-08-26T17:38:31.6833413Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/DadoContabilTests.cs",\
2026-08-26T17:38:31.6833790Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoAgrupamentoVendaImovelTests.cs",\
2026-08-26T17:38:31.6834116Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoDadoContabilTests.cs",\
2026-08-26T17:38:31.6834387Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoImovelTests.cs",\
2026-08-26T17:38:31.6834696Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/ImovelTests.cs",\
2026-08-26T17:38:31.6834923Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/MatriculaImovelSiopiTests.cs",\
2026-08-26T17:38:31.6835276Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/MensagemControleProcessamentoTests.cs",\
2026-08-26T17:38:31.6835518Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/RotinaProcessamentoTests.cs",\
2026-08-26T17:38:31.6835745Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/SiopiImovelTests.cs",\
2026-08-26T17:38:31.6835964Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ArquivoSiaciFake.cs",\
2026-08-26T17:38:31.6836184Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ImovelDtoFake.cs",\
2026-08-26T17:38:31.6836396Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ImovelFake.cs",\
2026-08-26T17:38:31.6836611Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/LayoutArquivoFake.cs",\
2026-08-26T17:38:31.6836865Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/Siico/ResponsesFake.cs",\
2026-08-26T17:38:31.6837148Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/InfraDataEF/HistoricosInterceptorTests.cs",\
2026-08-26T17:38:31.6837386Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/InfraDataEF/SimovDbContextTests.cs",\
2026-08-26T17:38:31.6837611Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Layouts/SiaciLayoutTests.cs"
2026-08-26T17:38:31.6837689Z 
2026-08-26T17:38:31.6837887Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:31.6838119Z "/opt/ads-agent/_work/6/.sonarqube/out/20"
2026-08-26T17:38:31.6838428Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:31.6838652Z "/opt/ads-agent/_work/6/.sonarqube/out/20/Issues.json"
2026-08-26T17:38:31.6838713Z 
2026-08-26T17:38:31.6838941Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod20
2026-08-26T17:38:31.6839266Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectKey=SIMOV-imoveiscaixa-batch:0DC13198-1AC4-46C6-B9B3-E2987B8496D5
2026-08-26T17:38:31.6839526Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectName=Simov.Core
2026-08-26T17:38:31.6839779Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:38:31.6840019Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.sourceEncoding=utf-8
2026-08-26T17:38:31.6840224Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.sources=\
2026-08-26T17:38:31.6840290Z 
2026-08-26T17:38:31.6840327Z 
2026-08-26T17:38:31.6840517Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:31.6840712Z "/opt/ads-agent/_work/6/.sonarqube/out/21"
2026-08-26T17:38:31.6840928Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:31.6841131Z "/opt/ads-agent/_work/6/.sonarqube/out/21/Issues.json"
2026-08-26T17:38:31.6841192Z 
2026-08-26T17:38:31.6841415Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod21
2026-08-26T17:38:31.6841768Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectKey=SIMOV-imoveiscaixa-batch:BA15777F-9613-49A5-8C5F-8CBFA5F86619
2026-08-26T17:38:31.6842037Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectName=Simov.Domain
2026-08-26T17:38:31.6842358Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:38:31.6842591Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.sourceEncoding=utf-8
2026-08-26T17:38:31.6842796Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.sources=\
2026-08-26T17:38:31.6842868Z 
2026-08-26T17:38:31.6842903Z 
2026-08-26T17:38:31.6843090Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:31.6843285Z "/opt/ads-agent/_work/6/.sonarqube/out/22"
2026-08-26T17:38:31.6843492Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:31.6843792Z "/opt/ads-agent/_work/6/.sonarqube/out/22/Issues.json"
2026-08-26T17:38:31.6843960Z 
2026-08-26T17:38:31.6844199Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod22
2026-08-26T17:38:31.6844509Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectKey=SIMOV-imoveiscaixa-batch:48A485AE-9F33-C9A7-979C-54916B65C32E
2026-08-26T17:38:31.6844837Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectName=Simov.Application
2026-08-26T17:38:31.6845108Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:38:31.6845343Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.sourceEncoding=utf-8
2026-08-26T17:38:31.6845596Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.sources=\
2026-08-26T17:38:31.6845702Z 
2026-08-26T17:38:31.6845753Z 
2026-08-26T17:38:31.6846008Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:31.6846264Z "/opt/ads-agent/_work/6/.sonarqube/out/23"
2026-08-26T17:38:31.6846497Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:31.6846701Z "/opt/ads-agent/_work/6/.sonarqube/out/23/Issues.json"
2026-08-26T17:38:31.6846766Z 
2026-08-26T17:38:31.6846989Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod23
2026-08-26T17:38:31.6847297Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectKey=SIMOV-imoveiscaixa-batch:309346D6-2461-4973-A29B-7A38A756C0DE
2026-08-26T17:38:31.6847558Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:38:31.6847817Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:38:31.6848052Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.sourceEncoding=utf-8
2026-08-26T17:38:31.6848255Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.sources=\
2026-08-26T17:38:31.6848317Z 
2026-08-26T17:38:31.6848358Z 
2026-08-26T17:38:31.6848547Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:31.6848739Z "/opt/ads-agent/_work/6/.sonarqube/out/24"
2026-08-26T17:38:31.6848946Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:31.6849143Z "/opt/ads-agent/_work/6/.sonarqube/out/24/Issues.json"
2026-08-26T17:38:31.6849232Z 
2026-08-26T17:38:31.6849527Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod24
2026-08-26T17:38:31.6849831Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectKey=SIMOV-imoveiscaixa-batch:4BF20498-1845-4781-82CB-E7783C0081FA
2026-08-26T17:38:31.6850087Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectName=Simov.Batch
2026-08-26T17:38:31.6850339Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:38:31.6850568Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.sourceEncoding=utf-8
2026-08-26T17:38:31.6850774Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.sources=\
2026-08-26T17:38:31.6850840Z 
2026-08-26T17:38:31.6850877Z 
2026-08-26T17:38:31.6851063Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:31.6851261Z "/opt/ads-agent/_work/6/.sonarqube/out/25"
2026-08-26T17:38:31.6851468Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:31.6851722Z "/opt/ads-agent/_work/6/.sonarqube/out/25/Issues.json"
2026-08-26T17:38:31.6851782Z 
2026-08-26T17:38:31.6852005Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod25
2026-08-26T17:38:31.6852306Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectKey=SIMOV-imoveiscaixa-batch:D54F14FF-8EEB-4EB8-994B-69D77DDB78FD
2026-08-26T17:38:31.6852560Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectName=TesteSimovBatch
2026-08-26T17:38:31.6852817Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/tests/TesteSimovBatch
2026-08-26T17:38:31.6853051Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.sourceEncoding=utf-8
2026-08-26T17:38:31.6853314Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.sources=
2026-08-26T17:38:31.6853735Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.tests=\
2026-08-26T17:38:31.6853844Z 
2026-08-26T17:38:31.6853895Z 
2026-08-26T17:38:31.6854125Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:31.6854320Z "/opt/ads-agent/_work/6/.sonarqube/out/26"
2026-08-26T17:38:31.6854528Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:31.6854729Z "/opt/ads-agent/_work/6/.sonarqube/out/26/Issues.json"
2026-08-26T17:38:31.6854797Z 
2026-08-26T17:38:31.6855016Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod26
2026-08-26T17:38:31.6855190Z sonar.host.url=https://sonar.apps.produtos4.caixa/
2026-08-26T17:38:31.6855374Z sonar.projectKey=SIMOV-imoveiscaixa-batch
2026-08-26T17:38:31.6855552Z sonar.projectName=SIMOV-imoveiscaixa-batch
2026-08-26T17:38:31.6855726Z sonar.projectVersion=1.0-SNAPSHOT
2026-08-26T17:38:31.6855858Z sonar.branch.name=CorrecoesSonar
2026-08-26T17:38:31.6856129Z sonar.scanner.metadataFilePath=/opt/ads-agent/_work/_temp/sonar/1.0-SNAPSHOT/f442c3b3-ec53-840d-3dab-bba3c4de61f5/report-task.txt
2026-08-26T17:38:31.6856397Z sonar.cs.opencover.reportsPaths=/opt/ads-agent/_work/_temp/**/coverage.opencover.xml
2026-08-26T17:38:31.6856677Z sonar.cs.vstest.reportsPaths=/opt/ads-agent/_work/_temp/**/*.trx
2026-08-26T17:38:31.6856819Z sonar.visualstudio.enable=false
2026-08-26T17:38:31.6856879Z 
2026-08-26T17:38:31.6858214Z sonar.modules=0B395246-F58A-479C-B0B1-C6A6045C6FD3,5E55366D-25CB-4B0F-BAF4-738003A18ED2,0847F1F3-B5DA-4FC3-8EEF-882D75A674FD,D745E52F-7A66-4C38-B30D-3A27EA75CCCE,FBCB055E-203B-4979-BB94-B02AE276DE0B,D6E1F89D-8BFA-426E-BC94-C1182DBD0621,AD78E470-A67C-4901-A53F-E3D7D40350CD,B904AD47-4763-413C-9324-7889FD92EFA6,6679F22B-144A-4C59-A28C-2A87F31E3915,EC78B0BC-170C-482C-867B-C5402B449403,1B2C05E0-E98F-477C-931D-923BBE79AE4E,A180ED2D-1521-44A6-B6EA-5DDEC55D2C17,A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E,00300450-28FA-4EA9-8A96-181ED44DCA26,1393E257-1007-43DE-B94C-0B0508C0B309,5BE00443-BD63-4C9F-A707-406F2AC94762,A79CA783-37A2-49D3-B56C-D9102F046AF9,51ABFD24-E14F-4155-B9D7-CDBD0E536AAB,F2842708-9CF5-4649-B3A8-6D39E5E01B77,3C101C3B-D8C0-461B-B65B-B87A6F75F210,4E341BE0-BD46-427C-8912-6319C41C89BC,0DC13198-1AC4-46C6-B9B3-E2987B8496D5,BA15777F-9613-49A5-8C5F-8CBFA5F86619,48A485AE-9F33-C9A7-979C-54916B65C32E,309346D6-2461-4973-A29B-7A38A756C0DE,4BF20498-1845-4781-82CB-E7783C0081FA,D54F14FF-8EEB-4EB8-994B-69D77DDB78FD
2026-08-26T17:38:31.6858896Z 
2026-08-26T17:38:31.6858930Z 
2026-08-26T17:38:31.6859126Z ------------------------------------------------------------------------
2026-08-26T17:38:31.6859377Z 14:38:31.673  Writing processing summary to /opt/ads-agent/_work/6/.sonarqube/out/ProjectInfo.log
2026-08-26T17:38:31.6859611Z The SONAR_SCANNER_HOME environment variable is not required and will be ignored.
2026-08-26T17:38:31.6859756Z Calling the SonarScanner CLI...
2026-08-26T17:38:31.6860070Z Executing file /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/sonar-scanner-4.7.0.2747/bin/sonar-scanner
2026-08-26T17:38:31.6860434Z   Args: -Dsonar.scanAllFiles=true -Dproject.settings=/opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties --from=ScannerMSBuild/5.8 --debug <sensitive data removed>
2026-08-26T17:38:31.6860762Z   Working directory: /opt/ads-agent/_work/6
2026-08-26T17:38:31.6860890Z   Timeout (ms):-1
2026-08-26T17:38:31.6861004Z   Process id: 26051
2026-08-26T17:38:31.8161936Z 14:38:31.811 INFO: Scanner configuration file: /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/sonar-scanner-4.7.0.2747/conf/sonar-scanner.properties
2026-08-26T17:38:31.8162358Z 14:38:31.813 INFO: Project root configuration file: /opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties
2026-08-26T17:38:31.8437365Z 14:38:31.843 INFO: SonarScanner 4.7.0.2747
2026-08-26T17:38:31.8438160Z 14:38:31.843 INFO: Java 11 Oracle Corporation (64-bit)
2026-08-26T17:38:31.8438399Z 14:38:31.843 INFO: Linux 5.18.5-100.fc35.x86_64 amd64
2026-08-26T17:38:31.9256123Z 14:38:31.924 DEBUG: keyStore is : 
2026-08-26T17:38:31.9256397Z 14:38:31.925 DEBUG: keyStore type is : pkcs12
2026-08-26T17:38:31.9256585Z 14:38:31.925 DEBUG: keyStore provider is : 
2026-08-26T17:38:31.9256735Z 14:38:31.925 DEBUG: init keystore
2026-08-26T17:38:31.9256896Z 14:38:31.925 DEBUG: init keymanager of type SunX509
2026-08-26T17:38:31.9995005Z 14:38:31.998 DEBUG: Create: /opt/ads-agent/cache-tools/.sonar/cache
2026-08-26T17:38:31.9996188Z 14:38:31.999 INFO: User cache: /opt/ads-agent/cache-tools/.sonar/cache
2026-08-26T17:38:31.9997111Z 14:38:31.999 DEBUG: Create: /opt/ads-agent/cache-tools/.sonar/cache/_tmp
2026-08-26T17:38:32.0014222Z 14:38:32.001 DEBUG: Extract sonar-scanner-api-batch in temp...
2026-08-26T17:38:32.0035620Z 14:38:32.003 DEBUG: Get bootstrap index...
2026-08-26T17:38:32.0035867Z 14:38:32.003 DEBUG: Download: https://sonar.apps.produtos4.caixa/batch/index
2026-08-26T17:38:32.1077860Z 14:38:32.107 INFO: ------------------------------------------------------------------------
2026-08-26T17:38:32.1078154Z 14:38:32.107 INFO: EXECUTION FAILURE
2026-08-26T17:38:32.1078467Z 14:38:32.107 INFO: ------------------------------------------------------------------------
2026-08-26T17:38:32.1078674Z 14:38:32.107 INFO: Total time: 0.316s
2026-08-26T17:38:32.1082888Z ##[error]14:38:32.107 ERROR: SonarQube server [https://sonar.apps.produtos4.caixa] can not be reached
2026-08-26T17:38:32.1083415Z 14:38:32.107 ERROR: SonarQube server [https://sonar.apps.produtos4.caixa] can not be reached
2026-08-26T17:38:32.1176221Z 14:38:32.117 INFO: Final Memory: 4M/80M
2026-08-26T17:38:32.1176809Z 14:38:32.117 INFO: ------------------------------------------------------------------------
2026-08-26T17:38:32.1177548Z ##[error]14:38:32.117 ERROR: Error during SonarScanner execution
org.sonarsource.scanner.api.internal.ScannerException: Unable to execute SonarScanner analysis
2026-08-26T17:38:32.1178012Z 14:38:32.117 ERROR: Error during SonarScanner execution
2026-08-26T17:38:32.1178190Z org.sonarsource.scanner.api.internal.ScannerException: Unable to execute SonarScanner analysis
2026-08-26T17:38:32.1178797Z ##[error]at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:85)
2026-08-26T17:38:32.1179214Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:85)
2026-08-26T17:38:32.1180029Z ##[error]at java.base/java.security.AccessController.doPrivileged(Native Method)
	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:74)
	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:70)
	at org.sonarsource.scanner.api.EmbeddedScanner.doStart(EmbeddedScanner.java:185)
	at org.sonarsource.scanner.api.EmbeddedScanner.start(EmbeddedScanner.java:123)
2026-08-26T17:38:32.1180586Z 	at java.base/java.security.AccessController.doPrivileged(Native Method)
2026-08-26T17:38:32.1180789Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:74)
2026-08-26T17:38:32.1181024Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:70)
2026-08-26T17:38:32.1183472Z 	at org.sonarsource.scanner.api.EmbeddedScanner.doStart(EmbeddedScanner.java:185)
2026-08-26T17:38:32.1183820Z 	at org.sonarsource.scanner.api.EmbeddedScanner.start(EmbeddedScanner.java:123)
2026-08-26T17:38:32.1184297Z ##[error]at org.sonarsource.scanner.cli.Main.execute(Main.java:73)
	at org.sonarsource.scanner.cli.Main.main(Main.java:61)
2026-08-26T17:38:32.1184663Z 	at org.sonarsource.scanner.cli.Main.execute(Main.java:73)
2026-08-26T17:38:32.1184835Z 	at org.sonarsource.scanner.cli.Main.main(Main.java:61)
2026-08-26T17:38:32.1185160Z ##[error]Caused by: java.lang.IllegalStateException: Fail to get bootstrap index from server
2026-08-26T17:38:32.1185578Z Caused by: java.lang.IllegalStateException: Fail to get bootstrap index from server
2026-08-26T17:38:32.1185948Z ##[error]at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:42)
2026-08-26T17:38:32.1186317Z 	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:42)
2026-08-26T17:38:32.1186813Z ##[error]at org.sonarsource.scanner.api.internal.JarDownloader.getScannerEngineFiles(JarDownloader.java:58)
	at org.sonarsource.scanner.api.internal.JarDownloader.download(JarDownloader.java:53)
2026-08-26T17:38:32.1187217Z 	at org.sonarsource.scanner.api.internal.JarDownloader.getScannerEngineFiles(JarDownloader.java:58)
2026-08-26T17:38:32.1187426Z 	at org.sonarsource.scanner.api.internal.JarDownloader.download(JarDownloader.java:53)
2026-08-26T17:38:32.1187835Z ##[error]at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:76)
2026-08-26T17:38:32.1188211Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:76)
2026-08-26T17:38:32.1188486Z ##[error]... 7 more
2026-08-26T17:38:32.1188732Z 	... 7 more
2026-08-26T17:38:32.1189203Z ##[error]Caused by: javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:128)
2026-08-26T17:38:32.1189663Z Caused by: javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:38:32.1189896Z 	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:128)
2026-08-26T17:38:32.1190335Z ##[error]at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:264)
2026-08-26T17:38:32.1190728Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
2026-08-26T17:38:32.1190930Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:264)
2026-08-26T17:38:32.1191297Z ##[error]at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:259)
2026-08-26T17:38:32.1191625Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:259)
2026-08-26T17:38:32.1192325Z ##[error]at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1329)
	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.onConsumeCertificate(CertificateMessage.java:1204)
	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.consume(CertificateMessage.java:1151)
2026-08-26T17:38:32.1192881Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1329)
2026-08-26T17:38:32.1193127Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.onConsumeCertificate(CertificateMessage.java:1204)
2026-08-26T17:38:32.1193369Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.consume(CertificateMessage.java:1151)
2026-08-26T17:38:32.1193981Z ##[error]at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:392)
	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:444)
2026-08-26T17:38:32.1194382Z 	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:392)
2026-08-26T17:38:32.1194572Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:444)
2026-08-26T17:38:32.1195019Z ##[error]at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:421)
	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:178)
2026-08-26T17:38:32.1195459Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:421)
2026-08-26T17:38:32.1195652Z 	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:178)
2026-08-26T17:38:32.1195986Z ##[error]at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:164)
2026-08-26T17:38:32.1196326Z 	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:164)
2026-08-26T17:38:32.1196772Z ##[error]at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1152)
	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1063)
2026-08-26T17:38:32.1197159Z 	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1152)
2026-08-26T17:38:32.1197354Z 	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1063)
2026-08-26T17:38:32.1197704Z ##[error]at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:402)
2026-08-26T17:38:32.1198042Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:402)
2026-08-26T17:38:32.1198595Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connectTls(RealConnection.java:336)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.establishProtocol(RealConnection.java:300)
2026-08-26T17:38:32.1199068Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connectTls(RealConnection.java:336)
2026-08-26T17:38:32.1199322Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.establishProtocol(RealConnection.java:300)
2026-08-26T17:38:32.1199737Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connect(RealConnection.java:185)
2026-08-26T17:38:32.1200119Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connect(RealConnection.java:185)
2026-08-26T17:38:32.1200763Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findConnection(ExchangeFinder.java:224)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findHealthyConnection(ExchangeFinder.java:108)
2026-08-26T17:38:32.1201248Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findConnection(ExchangeFinder.java:224)
2026-08-26T17:38:32.1201503Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findHealthyConnection(ExchangeFinder.java:108)
2026-08-26T17:38:32.1201914Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.find(ExchangeFinder.java:88)
2026-08-26T17:38:32.1202289Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.find(ExchangeFinder.java:88)
2026-08-26T17:38:32.1202854Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.Transmitter.newExchange(Transmitter.java:169)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ConnectInterceptor.intercept(ConnectInterceptor.java:41)
2026-08-26T17:38:32.1203325Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.Transmitter.newExchange(Transmitter.java:169)
2026-08-26T17:38:32.1203741Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ConnectInterceptor.intercept(ConnectInterceptor.java:41)
2026-08-26T17:38:32.1204789Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.cache.CacheInterceptor.intercept(CacheInterceptor.java:94)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:38:32.1205560Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:38:32.1205805Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:38:32.1206050Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.cache.CacheInterceptor.intercept(CacheInterceptor.java:94)
2026-08-26T17:38:32.1206291Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:38:32.1206529Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:38:32.1206996Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.BridgeInterceptor.intercept(BridgeInterceptor.java:93)
2026-08-26T17:38:32.1207384Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.BridgeInterceptor.intercept(BridgeInterceptor.java:93)
2026-08-26T17:38:32.1208853Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RetryAndFollowUpInterceptor.intercept(RetryAndFollowUpInterceptor.java:88)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.getResponseWithInterceptorChain(RealCall.java:221)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.execute(RealCall.java:81)
	at org.sonarsource.scanner.api.internal.ServerConnection.callUrl(ServerConnection.java:115)
	at org.sonarsource.scanner.api.internal.ServerConnection.downloadString(ServerConnection.java:99)
	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:39)
	... 10 more
2026-08-26T17:38:32.1209789Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:38:32.1210054Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RetryAndFollowUpInterceptor.intercept(RetryAndFollowUpInterceptor.java:88)
2026-08-26T17:38:32.1210309Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:38:32.1210550Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:38:32.1210786Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.getResponseWithInterceptorChain(RealCall.java:221)
2026-08-26T17:38:32.1211002Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.execute(RealCall.java:81)
2026-08-26T17:38:32.1211206Z 	at org.sonarsource.scanner.api.internal.ServerConnection.callUrl(ServerConnection.java:115)
2026-08-26T17:38:32.1211412Z 	at org.sonarsource.scanner.api.internal.ServerConnection.downloadString(ServerConnection.java:99)
2026-08-26T17:38:32.1211671Z 	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:39)
2026-08-26T17:38:32.1211835Z 	... 10 more
2026-08-26T17:38:32.1212379Z ##[error]Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:38:32.1212801Z Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:38:32.1213968Z ##[error]at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:385)
	at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:290)
	at java.base/sun.security.validator.Validator.validate(Validator.java:264)
	at java.base/sun.security.ssl.X509TrustManagerImpl.validate(X509TrustManagerImpl.java:321)
	at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:221)
	at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:129)
	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1313)
2026-08-26T17:38:32.1214677Z 	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:385)
2026-08-26T17:38:32.1214877Z 	at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:290)
2026-08-26T17:38:32.1215070Z 	at java.base/sun.security.validator.Validator.validate(Validator.java:264)
2026-08-26T17:38:32.1215269Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.validate(X509TrustManagerImpl.java:321)
2026-08-26T17:38:32.1215479Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:221)
2026-08-26T17:38:32.1215692Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:129)
2026-08-26T17:38:32.1215933Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1313)
2026-08-26T17:38:32.1216283Z ##[error]... 43 more
2026-08-26T17:38:32.1216534Z 	... 43 more
2026-08-26T17:38:32.1216853Z ##[error]Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:38:32.1217205Z Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:38:32.1217576Z ##[error]at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:141)
2026-08-26T17:38:32.1217952Z 	at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:141)
2026-08-26T17:38:32.1218369Z ##[error]at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:126)
2026-08-26T17:38:32.1218728Z 	at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:126)
2026-08-26T17:38:32.1219079Z ##[error]at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
2026-08-26T17:38:32.1219409Z 	at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
2026-08-26T17:38:32.1219762Z ##[error]at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:380)
	... 49 more
2026-08-26T17:38:32.1220094Z 	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:380)
2026-08-26T17:38:32.1220237Z 	... 49 more
2026-08-26T17:38:32.1376551Z Process returned exit code 1
2026-08-26T17:38:32.1401477Z ##[error]The SonarScanner did not complete successfully
2026-08-26T17:38:32.1401954Z The SonarScanner did not complete successfully
2026-08-26T17:38:32.1402274Z ##[error]14:38:32.14  Post-processing failed. Exit code: 1
2026-08-26T17:38:32.1402861Z 14:38:32.14  Post-processing failed. Exit code: 1
2026-08-26T17:38:32.1484487Z ##[error]The process '/opt/ads-agent/cache-tools/.dotnet//dotnet' failed with exit code 1
2026-08-26T17:38:32.1517650Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 1 out of 10) after 1000 ms
2026-08-26T17:38:33.2588426Z [command]/opt/ads-agent/cache-tools/.dotnet//dotnet /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/SonarScanner.MSBuild.dll end
2026-08-26T17:38:33.3027999Z SonarScanner for MSBuild 5.8
2026-08-26T17:38:33.3028891Z Using the .NET Core version of the Scanner for MSBuild
2026-08-26T17:38:33.3404057Z Post-processing started.
2026-08-26T17:38:33.4090378Z 14:38:33.408  14:38:33.389  /opt/ads-agent/_work/6/.sonarqube/bin/targets/SonarQube.Integration.targets does not exist
2026-08-26T17:38:33.4091013Z 14:38:33.408  14:38:33.408  sonar.verbose=true was specified - setting the log verbosity to 'Debug'
2026-08-26T17:38:33.4091384Z 14:38:33.408  Loading the SonarQube analysis config from /opt/ads-agent/_work/6/.sonarqube/conf/SonarQubeAnalysisConfig.xml
2026-08-26T17:38:33.4091702Z 14:38:33.409  Not running under TeamBuild
2026-08-26T17:38:33.4092060Z 14:38:33.409  Analysis base directory: /opt/ads-agent/_work/6/.sonarqube
2026-08-26T17:38:33.4092282Z Build directory: 
2026-08-26T17:38:33.4092519Z Bin directory: /opt/ads-agent/_work/6/.sonarqube/bin
2026-08-26T17:38:33.4092721Z Config directory: /opt/ads-agent/_work/6/.sonarqube/conf
2026-08-26T17:38:33.4092923Z Output directory: /opt/ads-agent/_work/6/.sonarqube/out
2026-08-26T17:38:33.4093139Z Config file: /opt/ads-agent/_work/6/.sonarqube/conf/SonarQubeAnalysisConfig.xml
2026-08-26T17:38:33.4104157Z 14:38:33.41  Generating SonarQube project properties file to /opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties
2026-08-26T17:38:33.4270694Z 14:38:33.426  Setting analysis property: sonar.visualstudio.enable=false
2026-08-26T17:38:33.4449757Z 14:38:33.444  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/0/Issues.json
2026-08-26T17:38:33.4484452Z 14:38:33.448  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/1/Issues.json
2026-08-26T17:38:33.4518794Z 14:38:33.451  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/2/Issues.json
2026-08-26T17:38:33.4622043Z 14:38:33.461  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/3/Issues.json
2026-08-26T17:38:33.4651087Z 14:38:33.464  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/4/Issues.json
2026-08-26T17:38:33.4681516Z 14:38:33.467  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/5/Issues.json
2026-08-26T17:38:33.4693198Z 14:38:33.469  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/6/Issues.json
2026-08-26T17:38:33.4703229Z 14:38:33.47  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/7/Issues.json
2026-08-26T17:38:33.4802059Z 14:38:33.479  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/8/Issues.json
2026-08-26T17:38:33.4898659Z 14:38:33.489  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/9/Issues.json
2026-08-26T17:38:33.4928500Z 14:38:33.492  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/10/Issues.json
2026-08-26T17:38:33.5061160Z 14:38:33.505  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/11/Issues.json
2026-08-26T17:38:33.5084229Z 14:38:33.508  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/12/Issues.json
2026-08-26T17:38:33.5108415Z 14:38:33.51  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/13/Issues.json
2026-08-26T17:38:33.5117848Z 14:38:33.511  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/14/Issues.json
2026-08-26T17:38:33.5196763Z 14:38:33.519  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/15/Issues.json
2026-08-26T17:38:33.5219429Z 14:38:33.521  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/16/Issues.json
2026-08-26T17:38:33.5243532Z 14:38:33.524  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/17/Issues.json
2026-08-26T17:38:33.5253608Z 14:38:33.525  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/18/Issues.json
2026-08-26T17:38:33.5261405Z 14:38:33.525  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/19/Issues.json
2026-08-26T17:38:33.5264844Z 14:38:33.526  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/20/Issues.json
2026-08-26T17:38:33.5341106Z 14:38:33.533  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/21/Issues.json
2026-08-26T17:38:33.5365192Z 14:38:33.536  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/22/Issues.json
2026-08-26T17:38:33.5388202Z 14:38:33.538  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/23/Issues.json
2026-08-26T17:38:33.5397267Z 14:38:33.539  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/24/Issues.json
2026-08-26T17:38:33.5405197Z 14:38:33.54  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/25/Issues.json
2026-08-26T17:38:33.5408545Z 14:38:33.54  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/26/Issues.json
2026-08-26T17:38:33.5511693Z 14:38:33.55  Using longest common projects path as a base directory: '/opt/ads-agent/_work/6/s'.
2026-08-26T17:38:33.5609733Z 14:38:33.56  File was referenced by the following projects: '/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/TesteSimovBatch.csproj', '/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/TesteSimovBatch.csproj'.
2026-08-26T17:38:33.5722357Z 14:38:33.566  Dumping content of sonar-project.properties
2026-08-26T17:38:33.5722796Z ------------------------------------------------------------------------
2026-08-26T17:38:33.5723160Z sonar.projectKey=SIMOV-imoveiscaixa-batch
2026-08-26T17:38:33.5723473Z sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar
2026-08-26T17:38:33.5723883Z sonar.projectBaseDir=/opt/ads-agent/_work/6/s
2026-08-26T17:38:33.5724001Z 
2026-08-26T17:38:33.5724395Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectKey=SIMOV-imoveiscaixa-batch:0B395246-F58A-479C-B0B1-C6A6045C6FD3
2026-08-26T17:38:33.5724873Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectName=Simov.Core
2026-08-26T17:38:33.5725276Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:38:33.5725935Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.sourceEncoding=utf-8
2026-08-26T17:38:33.5726269Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.sources=\
2026-08-26T17:38:33.5726622Z "/opt/ads-agent/_work/6/s/src/Simov.Core/AutenticacaoSso/AutenticacarSso.cs",\
2026-08-26T17:38:33.5726971Z "/opt/ads-agent/_work/6/s/src/Simov.Core/AutenticacaoSso/IAutenticacarSso.cs",\
2026-08-26T17:38:33.5727307Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Data/IBaseRepository.cs",\
2026-08-26T17:38:33.5727634Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Data/IUnitOfWork.cs",\
2026-08-26T17:38:33.5727924Z "/opt/ads-agent/_work/6/s/src/Simov.Core/DomainObjects/Entity.cs",\
2026-08-26T17:38:33.5728333Z "/opt/ads-agent/_work/6/s/src/Simov.Core/DomainObjects/IAggregateRoot.cs",\
2026-08-26T17:38:33.5728677Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/ApplicationException.cs",\
2026-08-26T17:38:33.5729025Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/CancellationException.cs",\
2026-08-26T17:38:33.5729383Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/EntityValidationException.cs",\
2026-08-26T17:38:33.5729723Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/GenericException.cs",\
2026-08-26T17:38:33.5730055Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/NotFoundException.cs",\
2026-08-26T17:38:33.5730400Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/ProcessamentoException.cs",\
2026-08-26T17:38:33.5730750Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/RelatedAggregateException.cs",\
2026-08-26T17:38:33.5731099Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/UnauthorizedException.cs",\
2026-08-26T17:38:33.5731435Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Logging/LoggerExtensions.cs",\
2026-08-26T17:38:33.5731760Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siico/ApiSiicoRestPrivado.cs",\
2026-08-26T17:38:33.5732090Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siico/ApiSiicoRestPublico.cs",\
2026-08-26T17:38:33.5732432Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siiso/ApiSiisoRestPublico.cs",\
2026-08-26T17:38:33.5732765Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/DadosDto.cs",\
2026-08-26T17:38:33.5733106Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/DadosSimilDto.cs",\
2026-08-26T17:38:33.5733451Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/FotosDto.cs",\
2026-08-26T17:38:33.5733867Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/ListaFotoDto.cs",\
2026-08-26T17:38:33.5734199Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/ISOAPWeb.cs",\
2026-08-26T17:38:33.5734538Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/RobustSoapDeserializer.cs",\
2026-08-26T17:38:33.5734872Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/SOAPWeb.cs",\
2026-08-26T17:38:33.5735198Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/ResponseGenerico.cs",\
2026-08-26T17:38:33.5735537Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/BairroDetalhadoSiico.cs",\
2026-08-26T17:38:33.5735884Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/BairroSiico.cs",\
2026-08-26T17:38:33.5736202Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/CepSiico.cs",\
2026-08-26T17:38:33.5736534Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/LocalidadeSiico.cs",\
2026-08-26T17:38:33.5736871Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioCompletoSiico.cs",\
2026-08-26T17:38:33.5737215Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioParcialSiico.cs",\
2026-08-26T17:38:33.5737557Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioSiico.cs",\
2026-08-26T17:38:33.5737904Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/TipoLogradouroSiico.cs",\
2026-08-26T17:38:33.5738242Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/UnidadeCaixa.cs",\
2026-08-26T17:38:33.5738588Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/UnidadeFederacaoSiico.cs",\
2026-08-26T17:38:33.5738989Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/EnderecoPessoaSiiso.cs",\
2026-08-26T17:38:33.5739353Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/LocalidadeNascimentoSiiso.cs",\
2026-08-26T17:38:33.5739688Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/PessoaSiiso.cs",\
2026-08-26T17:38:33.5740034Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siico/IApiSiicoRestPrivado.cs",\
2026-08-26T17:38:33.5740398Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siico/IApiSiicoRestPublico.cs",\
2026-08-26T17:38:33.5740755Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siiso/IApiSiisoRestPublico.cs"
2026-08-26T17:38:33.5740934Z 
2026-08-26T17:38:33.5741498Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:33.5741779Z "/opt/ads-agent/_work/6/.sonarqube/out/0"
2026-08-26T17:38:33.5742092Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:33.5742408Z "/opt/ads-agent/_work/6/.sonarqube/out/0/Issues.json"
2026-08-26T17:38:33.5742514Z 
2026-08-26T17:38:33.5742855Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod0
2026-08-26T17:38:33.5743303Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectKey=SIMOV-imoveiscaixa-batch:5E55366D-25CB-4B0F-BAF4-738003A18ED2
2026-08-26T17:38:33.5743781Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectName=Simov.Domain
2026-08-26T17:38:33.5744180Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:38:33.5744550Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.sourceEncoding=utf-8
2026-08-26T17:38:33.5744879Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.sources=\
2026-08-26T17:38:33.5745235Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AgrupamentoVendaImovel.cs",\
2026-08-26T17:38:33.5745606Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaArquivoLote.cs",\
2026-08-26T17:38:33.5745941Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaFotoImovel.cs",\
2026-08-26T17:38:33.5746302Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaFotoLote.cs",\
2026-08-26T17:38:33.5746648Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaUsuario.cs",\
2026-08-26T17:38:33.5746969Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AvaliacaoImovel.cs",\
2026-08-26T17:38:33.5747302Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/ComodoImovel.cs",\
2026-08-26T17:38:33.5747645Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/ControleProcessamento.cs",\
2026-08-26T17:38:33.5747981Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/DadoContabil.cs",\
2026-08-26T17:38:33.5748396Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/FotoImovel.cs",\
2026-08-26T17:38:33.5748739Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoAgrupamentoVendaImovel.cs",\
2026-08-26T17:38:33.5749097Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoAvaliacaoImovel.cs",\
2026-08-26T17:38:33.5749453Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoComodoImovel.cs",\
2026-08-26T17:38:33.5749789Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoDadoContabil.cs",\
2026-08-26T17:38:33.5750145Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoImovel.cs",\
2026-08-26T17:38:33.5750492Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoMatriculaImovel.cs",\
2026-08-26T17:38:33.5750821Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/Imovel.cs",\
2026-08-26T17:38:33.5751150Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/MatriculaImovel.cs",\
2026-08-26T17:38:33.5751506Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/MensagemControleProcessamento.cs",\
2026-08-26T17:38:33.5751870Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/RotinaProcessamento.cs",\
2026-08-26T17:38:33.5752194Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/ClassificacaoImovelEnum.cs",\
2026-08-26T17:38:33.5752531Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/EstadoConservacaoEnum.cs",\
2026-08-26T17:38:33.5752943Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/FuncionalidadeSistemaEnum.cs",\
2026-08-26T17:38:33.5753529Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/IcAcaoSistemaEnum.cs",\
2026-08-26T17:38:33.5753931Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/IcShortEnum.cs",\
2026-08-26T17:38:33.5754259Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/MotivoExclusaoEnum.cs",\
2026-08-26T17:38:33.5754594Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/OrgaoProprietarioImovelEnum.cs",\
2026-08-26T17:38:33.5754928Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/OrigemImovelEnum.cs",\
2026-08-26T17:38:33.5755271Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/ResultadoMensagemProcessamentoEnum.cs",\
2026-08-26T17:38:33.5755706Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/RotinaProcessamentoEnum.cs",\
2026-08-26T17:38:33.5756043Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/SituacaoImovelEnum.cs",\
2026-08-26T17:38:33.5756380Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/SituacaoProcessamentoEnum.cs",\
2026-08-26T17:38:33.5756704Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoCampoEnum.cs",\
2026-08-26T17:38:33.5757019Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoComodoEnum.cs",\
2026-08-26T17:38:33.5757326Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoImovelEnum.cs",\
2026-08-26T17:38:33.5757656Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoMatriculaEnum.cs",\
2026-08-26T17:38:33.5758009Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAgrupamentoVendaImovelRepository.cs",\
2026-08-26T17:38:33.5758379Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaArquivoLoteRepository.cs",\
2026-08-26T17:38:33.5758750Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaFotoImovelRepository.cs",\
2026-08-26T17:38:33.5759095Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaFotoLoteRepository.cs",\
2026-08-26T17:38:33.5759447Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaUsuarioRepository.cs",\
2026-08-26T17:38:33.5759797Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAvaliacaoImovelRepository.cs",\
2026-08-26T17:38:33.5760148Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IComodoImovelRepository.cs",\
2026-08-26T17:38:33.5760507Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IControleProcessamentoRepository.cs",\
2026-08-26T17:38:33.5760876Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IDadoContabilRepository.cs",\
2026-08-26T17:38:33.5761219Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IFotoImovelRepository.cs",\
2026-08-26T17:38:33.5761562Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IGeradorHistorico.cs",\
2026-08-26T17:38:33.5761905Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IImovelRepository.cs",\
2026-08-26T17:38:33.5762242Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IMatriculaImovelRepository.cs",\
2026-08-26T17:38:33.5762607Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IMensagemControleProcessamentoRepository.cs",\
2026-08-26T17:38:33.5762987Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IRotinaProcessamentoRepository.cs",\
2026-08-26T17:38:33.5763334Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/BaseArquivoLayout.cs",\
2026-08-26T17:38:33.5763838Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/SiaciLayout.cs",\
2026-08-26T17:38:33.5764175Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/SiopiLayout.cs"
2026-08-26T17:38:33.5764297Z 
2026-08-26T17:38:33.5764583Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:33.5764884Z "/opt/ads-agent/_work/6/.sonarqube/out/1"
2026-08-26T17:38:33.5765212Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:33.5765516Z "/opt/ads-agent/_work/6/.sonarqube/out/1/Issues.json"
2026-08-26T17:38:33.5765616Z 
2026-08-26T17:38:33.5765952Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod1
2026-08-26T17:38:33.5766525Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectKey=SIMOV-imoveiscaixa-batch:0847F1F3-B5DA-4FC3-8EEF-882D75A674FD
2026-08-26T17:38:33.5766932Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectName=Simov.Application
2026-08-26T17:38:33.5767344Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:38:33.5767729Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.sourceEncoding=utf-8
2026-08-26T17:38:33.5768042Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.sources=\
2026-08-26T17:38:33.5768381Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Contexts/FileProcessingContext.cs",\
2026-08-26T17:38:33.5768735Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Contexts/SiicoCallCounterContext.cs",\
2026-08-26T17:38:33.5769137Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/AvaliacaoImovelDto.cs",\
2026-08-26T17:38:33.5769488Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/DadoContabilDto.cs",\
2026-08-26T17:38:33.5769801Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/EnderecoDto.cs",\
2026-08-26T17:38:33.5770112Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/ImovelDto.cs",\
2026-08-26T17:38:33.5770441Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/MatriculaImovelDto.cs",\
2026-08-26T17:38:33.5770770Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/MunicipioDto.cs",\
2026-08-26T17:38:33.5771093Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/SiaciDDQDto.cs",\
2026-08-26T17:38:33.5771416Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/TipoLogradouroDto.cs",\
2026-08-26T17:38:33.5771773Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ICargaFotoImovelService.cs",\
2026-08-26T17:38:33.5772146Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ICargaImovelService.cs",\
2026-08-26T17:38:33.5772477Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IFileService.cs",\
2026-08-26T17:38:33.5772845Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSiaciUseCase.cs",\
2026-08-26T17:38:33.5773213Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSimilFotoUseCase.cs",\
2026-08-26T17:38:33.5773571Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSimilUseCase.cs",\
2026-08-26T17:38:33.5774006Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSiopiUseCase.cs",\
2026-08-26T17:38:33.5774341Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ILeituraService.cs",\
2026-08-26T17:38:33.5774701Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ILogProcessamentoService.cs",\
2026-08-26T17:38:33.5775070Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IMapperDataService.cs",\
2026-08-26T17:38:33.5775428Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ISiaciDDQUseCase.cs",\
2026-08-26T17:38:33.5775776Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IWorkerImovelService.cs",\
2026-08-26T17:38:33.5776100Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/CargaImovelService.cs",\
2026-08-26T17:38:33.5776430Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/FileService.cs",\
2026-08-26T17:38:33.5776767Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/LeituraService.cs",\
2026-08-26T17:38:33.5777119Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/LogProcessamentoService.cs",\
2026-08-26T17:38:33.5777462Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/MapperDataService.cs",\
2026-08-26T17:38:33.5777801Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/WorkerImovelService.cs",\
2026-08-26T17:38:33.5778156Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSiaciUseCase.cs",\
2026-08-26T17:38:33.5778515Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSimilFotoUseCase.cs",\
2026-08-26T17:38:33.5778864Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSimilUseCase.cs",\
2026-08-26T17:38:33.5779215Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSiopiUseCase.cs",\
2026-08-26T17:38:33.5779625Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/SiaciDDQUseCase.cs"
2026-08-26T17:38:33.5779744Z 
2026-08-26T17:38:33.5780037Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:33.5780339Z "/opt/ads-agent/_work/6/.sonarqube/out/2"
2026-08-26T17:38:33.5780657Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:33.5781039Z "/opt/ads-agent/_work/6/.sonarqube/out/2/Issues.json"
2026-08-26T17:38:33.5781145Z 
2026-08-26T17:38:33.5781483Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod2
2026-08-26T17:38:33.5781961Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectKey=SIMOV-imoveiscaixa-batch:D745E52F-7A66-4C38-B30D-3A27EA75CCCE
2026-08-26T17:38:33.5782429Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectName=Simov.Core
2026-08-26T17:38:33.5782823Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:38:33.5783189Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.sourceEncoding=utf-8
2026-08-26T17:38:33.5783491Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.sources=\
2026-08-26T17:38:33.5783597Z 
2026-08-26T17:38:33.5783713Z 
2026-08-26T17:38:33.5784009Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:33.5784302Z "/opt/ads-agent/_work/6/.sonarqube/out/3"
2026-08-26T17:38:33.5784614Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:33.5784930Z "/opt/ads-agent/_work/6/.sonarqube/out/3/Issues.json"
2026-08-26T17:38:33.5785032Z 
2026-08-26T17:38:33.5785380Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod3
2026-08-26T17:38:33.5785848Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectKey=SIMOV-imoveiscaixa-batch:FBCB055E-203B-4979-BB94-B02AE276DE0B
2026-08-26T17:38:33.5786254Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectName=Simov.Domain
2026-08-26T17:38:33.5786628Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:38:33.5786984Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.sourceEncoding=utf-8
2026-08-26T17:38:33.5787295Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.sources=\
2026-08-26T17:38:33.5787398Z 
2026-08-26T17:38:33.5787461Z 
2026-08-26T17:38:33.5787749Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:33.5788083Z "/opt/ads-agent/_work/6/.sonarqube/out/4"
2026-08-26T17:38:33.5788384Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:33.5788699Z "/opt/ads-agent/_work/6/.sonarqube/out/4/Issues.json"
2026-08-26T17:38:33.5788790Z 
2026-08-26T17:38:33.5789118Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod4
2026-08-26T17:38:33.5789581Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectKey=SIMOV-imoveiscaixa-batch:D6E1F89D-8BFA-426E-BC94-C1182DBD0621
2026-08-26T17:38:33.5790014Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectName=Simov.Application
2026-08-26T17:38:33.5790389Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:38:33.5790764Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.sourceEncoding=utf-8
2026-08-26T17:38:33.5791078Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.sources=\
2026-08-26T17:38:33.5791176Z 
2026-08-26T17:38:33.5791235Z 
2026-08-26T17:38:33.5791511Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:33.5791803Z "/opt/ads-agent/_work/6/.sonarqube/out/5"
2026-08-26T17:38:33.5792123Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:33.5792409Z "/opt/ads-agent/_work/6/.sonarqube/out/5/Issues.json"
2026-08-26T17:38:33.5792499Z 
2026-08-26T17:38:33.5792846Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod5
2026-08-26T17:38:33.5793311Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectKey=SIMOV-imoveiscaixa-batch:AD78E470-A67C-4901-A53F-E3D7D40350CD
2026-08-26T17:38:33.5793884Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:38:33.5794293Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:38:33.5794650Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.sourceEncoding=utf-8
2026-08-26T17:38:33.5794969Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.sources=\
2026-08-26T17:38:33.5795298Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Common/BaseRepository.cs",\
2026-08-26T17:38:33.5795641Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Common/UnitOfWork.cs",\
2026-08-26T17:38:33.5796084Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Interceptor/HistoricosInterceptor.cs",\
2026-08-26T17:38:33.5796493Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AgrupamentoVendaImovelConfiguration.cs",\
2026-08-26T17:38:33.5796886Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaArquivoLoteConfiguration.cs",\
2026-08-26T17:38:33.5797287Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaFotoImovelConfiguration.cs",\
2026-08-26T17:38:33.5797803Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaFotoLoteConfiguration.cs",\
2026-08-26T17:38:33.5798194Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaUsuarioConfiguration.cs",\
2026-08-26T17:38:33.5798578Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AvaliacaoImovelConfiguration.cs",\
2026-08-26T17:38:33.5798946Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ComodoImovelConfiguration.cs",\
2026-08-26T17:38:33.5799337Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ControleProcessamentoConfiguration.cs",\
2026-08-26T17:38:33.5799705Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/DadoContabilConfiguration.cs",\
2026-08-26T17:38:33.5800077Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/FotoImovelConfiguration.cs",\
2026-08-26T17:38:33.5800470Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoAgrupamentoVendaImovelConfiguration.cs",\
2026-08-26T17:38:33.5800867Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoAvaliacaoImovelConfiguration.cs",\
2026-08-26T17:38:33.5801247Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoComodoImovelConfiguration.cs",\
2026-08-26T17:38:33.5801638Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoDadoContabilConfiguration.cs",\
2026-08-26T17:38:33.5802010Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoImovelConfiguration.cs",\
2026-08-26T17:38:33.5802395Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoMatriculaImovelConfiguration.cs",\
2026-08-26T17:38:33.5802758Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ImovelConfiguration.cs",\
2026-08-26T17:38:33.5803123Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/MatriculaImovelConfiguration.cs",\
2026-08-26T17:38:33.5803524Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/MensagemControleProcessamentoConfiguration.cs",\
2026-08-26T17:38:33.5804049Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/RotinaProcessamentoConfiguration.cs",\
2026-08-26T17:38:33.5804446Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AgrupamentoVendaImovelRepository.cs",\
2026-08-26T17:38:33.5804835Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaArquivoLoteRepository.cs",\
2026-08-26T17:38:33.5805240Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaFotoImovelRepository.cs",\
2026-08-26T17:38:33.5805622Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaFotoLoteRepository.cs",\
2026-08-26T17:38:33.5805978Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaUsuarioRepository.cs",\
2026-08-26T17:38:33.5806327Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AvaliacaoImovelRepository.cs",\
2026-08-26T17:38:33.5806764Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ComodoImovelRepository.cs",\
2026-08-26T17:38:33.5807159Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ControleProcessamentoRepository.cs",\
2026-08-26T17:38:33.5807542Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/DadoContabilRepository.cs",\
2026-08-26T17:38:33.5807917Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/FotoImovelRepository.cs",\
2026-08-26T17:38:33.5808287Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ImovelRepository.cs",\
2026-08-26T17:38:33.5808659Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/MatriculaImovelRepository.cs",\
2026-08-26T17:38:33.5809094Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/MensagemControleProcessamentoRepository.cs",\
2026-08-26T17:38:33.5809491Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/RotinaProcessamentoRepository.cs",\
2026-08-26T17:38:33.5809852Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/SimovDbContext.cs"
2026-08-26T17:38:33.5809966Z 
2026-08-26T17:38:33.5810258Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:33.5810558Z "/opt/ads-agent/_work/6/.sonarqube/out/6"
2026-08-26T17:38:33.5810877Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:33.5811177Z "/opt/ads-agent/_work/6/.sonarqube/out/6/Issues.json"
2026-08-26T17:38:33.5811285Z 
2026-08-26T17:38:33.5811627Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod6
2026-08-26T17:38:33.5812075Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectKey=SIMOV-imoveiscaixa-batch:B904AD47-4763-413C-9324-7889FD92EFA6
2026-08-26T17:38:33.5812484Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectName=Simov.Batch
2026-08-26T17:38:33.5812872Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:38:33.5813246Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.sourceEncoding=utf-8
2026-08-26T17:38:33.5813578Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.sources=\
2026-08-26T17:38:33.5814038Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/AddHeadersHttpClient.cs",\
2026-08-26T17:38:33.5814397Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/ConnectionsConfiguration.cs",\
2026-08-26T17:38:33.5814724Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/HttpClientConfiguration.cs",\
2026-08-26T17:38:33.5815059Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/IApiSiisoRestPrivado.cs",\
2026-08-26T17:38:33.5815411Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/UseCasesConfiguration.cs",\
2026-08-26T17:38:33.5815738Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderImoveisSiaci.cs",\
2026-08-26T17:38:33.5816084Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderImoveisSiopi.cs",\
2026-08-26T17:38:33.5816423Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderLeilaoSiaciDDQ.cs",\
2026-08-26T17:38:33.5816747Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Program.cs",\
2026-08-26T17:38:33.5817087Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Workers/WorkerFotoImoveisSimil.cs",\
2026-08-26T17:38:33.5817425Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Workers/WorkerImoveisSimil.cs",\
2026-08-26T17:38:33.5817798Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/Simov.Batch.GlobalUsings.g.cs",\
2026-08-26T17:38:33.5818199Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/.NETCoreApp,Version=v8.0.AssemblyAttributes.cs",\
2026-08-26T17:38:33.5818578Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/Simov.Batch.AssemblyInfo.cs",\
2026-08-26T17:38:33.5818933Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/appsettings.Development.json",\
2026-08-26T17:38:33.5819250Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/appsettings.json",\
2026-08-26T17:38:33.5819584Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Properties/launchSettings.json",\
2026-08-26T17:38:33.5819978Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/apphost"
2026-08-26T17:38:33.5820095Z 
2026-08-26T17:38:33.5820387Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:33.5820694Z "/opt/ads-agent/_work/6/.sonarqube/out/7"
2026-08-26T17:38:33.5821019Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:33.5821334Z "/opt/ads-agent/_work/6/.sonarqube/out/7/Issues.json"
2026-08-26T17:38:33.5821428Z 
2026-08-26T17:38:33.5821775Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod7
2026-08-26T17:38:33.5822255Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectKey=SIMOV-imoveiscaixa-batch:6679F22B-144A-4C59-A28C-2A87F31E3915
2026-08-26T17:38:33.5822717Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectName=Simov.Core
2026-08-26T17:38:33.5823097Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:38:33.5823451Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.sourceEncoding=utf-8
2026-08-26T17:38:33.5823847Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.sources=\
2026-08-26T17:38:33.5823955Z 
2026-08-26T17:38:33.5824011Z 
2026-08-26T17:38:33.5824311Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:33.5824608Z "/opt/ads-agent/_work/6/.sonarqube/out/8"
2026-08-26T17:38:33.5824931Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:33.5825252Z "/opt/ads-agent/_work/6/.sonarqube/out/8/Issues.json"
2026-08-26T17:38:33.5825358Z 
2026-08-26T17:38:33.5825708Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod8
2026-08-26T17:38:33.5826200Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectKey=SIMOV-imoveiscaixa-batch:EC78B0BC-170C-482C-867B-C5402B449403
2026-08-26T17:38:33.5826562Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectName=Simov.Core
2026-08-26T17:38:33.5826930Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:38:33.5827287Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.sourceEncoding=utf-8
2026-08-26T17:38:33.5827586Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.sources=\
2026-08-26T17:38:33.5827700Z 
2026-08-26T17:38:33.5827755Z 
2026-08-26T17:38:33.5828054Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:33.5828359Z "/opt/ads-agent/_work/6/.sonarqube/out/9"
2026-08-26T17:38:33.5828687Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:33.5828989Z "/opt/ads-agent/_work/6/.sonarqube/out/9/Issues.json"
2026-08-26T17:38:33.5829095Z 
2026-08-26T17:38:33.5829446Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod9
2026-08-26T17:38:33.5829919Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectKey=SIMOV-imoveiscaixa-batch:1B2C05E0-E98F-477C-931D-923BBE79AE4E
2026-08-26T17:38:33.5830352Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectName=Simov.Domain
2026-08-26T17:38:33.5830736Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:38:33.5831089Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.sourceEncoding=utf-8
2026-08-26T17:38:33.5831397Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.sources=\
2026-08-26T17:38:33.5831495Z 
2026-08-26T17:38:33.5831558Z 
2026-08-26T17:38:33.5831842Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:33.5832129Z "/opt/ads-agent/_work/6/.sonarqube/out/10"
2026-08-26T17:38:33.5832465Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:33.5832789Z "/opt/ads-agent/_work/6/.sonarqube/out/10/Issues.json"
2026-08-26T17:38:33.5832871Z 
2026-08-26T17:38:33.5833215Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod10
2026-08-26T17:38:33.5833748Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectKey=SIMOV-imoveiscaixa-batch:A180ED2D-1521-44A6-B6EA-5DDEC55D2C17
2026-08-26T17:38:33.5834247Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectName=Simov.Core
2026-08-26T17:38:33.5834632Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:38:33.5834999Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.sourceEncoding=utf-8
2026-08-26T17:38:33.5835291Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.sources=\
2026-08-26T17:38:33.5835398Z 
2026-08-26T17:38:33.5835461Z 
2026-08-26T17:38:33.5835760Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:33.5836052Z "/opt/ads-agent/_work/6/.sonarqube/out/11"
2026-08-26T17:38:33.5836422Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:33.5836732Z "/opt/ads-agent/_work/6/.sonarqube/out/11/Issues.json"
2026-08-26T17:38:33.5836819Z 
2026-08-26T17:38:33.5837173Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod11
2026-08-26T17:38:33.5837656Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectKey=SIMOV-imoveiscaixa-batch:A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E
2026-08-26T17:38:33.5838207Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectName=Simov.Domain
2026-08-26T17:38:33.5838627Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:38:33.5838992Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.sourceEncoding=utf-8
2026-08-26T17:38:33.5839328Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.sources=\
2026-08-26T17:38:33.5839427Z 
2026-08-26T17:38:33.5839480Z 
2026-08-26T17:38:33.5839770Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:33.5840068Z "/opt/ads-agent/_work/6/.sonarqube/out/12"
2026-08-26T17:38:33.5840396Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:33.5840700Z "/opt/ads-agent/_work/6/.sonarqube/out/12/Issues.json"
2026-08-26T17:38:33.5840792Z 
2026-08-26T17:38:33.5841124Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod12
2026-08-26T17:38:33.5841613Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectKey=SIMOV-imoveiscaixa-batch:00300450-28FA-4EA9-8A96-181ED44DCA26
2026-08-26T17:38:33.5842034Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectName=Simov.Application
2026-08-26T17:38:33.5842431Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:38:33.5842807Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.sourceEncoding=utf-8
2026-08-26T17:38:33.5843134Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.sources=\
2026-08-26T17:38:33.5843251Z 
2026-08-26T17:38:33.5843305Z 
2026-08-26T17:38:33.5843584Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:33.5843967Z "/opt/ads-agent/_work/6/.sonarqube/out/13"
2026-08-26T17:38:33.5844297Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:33.5844608Z "/opt/ads-agent/_work/6/.sonarqube/out/13/Issues.json"
2026-08-26T17:38:33.5844721Z 
2026-08-26T17:38:33.5845072Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod13
2026-08-26T17:38:33.5845546Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectKey=SIMOV-imoveiscaixa-batch:1393E257-1007-43DE-B94C-0B0508C0B309
2026-08-26T17:38:33.5845981Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:38:33.5846386Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:38:33.5846767Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.sourceEncoding=utf-8
2026-08-26T17:38:33.5847078Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.sources=\
2026-08-26T17:38:33.5847179Z 
2026-08-26T17:38:33.5847235Z 
2026-08-26T17:38:33.5847530Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:33.5847910Z "/opt/ads-agent/_work/6/.sonarqube/out/14"
2026-08-26T17:38:33.5848214Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:33.5848530Z "/opt/ads-agent/_work/6/.sonarqube/out/14/Issues.json"
2026-08-26T17:38:33.5848628Z 
2026-08-26T17:38:33.5848968Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod14
2026-08-26T17:38:33.5849468Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectKey=SIMOV-imoveiscaixa-batch:5BE00443-BD63-4C9F-A707-406F2AC94762
2026-08-26T17:38:33.5849857Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectName=Simov.Core
2026-08-26T17:38:33.5850243Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:38:33.5850650Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.sourceEncoding=utf-8
2026-08-26T17:38:33.5850969Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.sources=\
2026-08-26T17:38:33.5851065Z 
2026-08-26T17:38:33.5851127Z 
2026-08-26T17:38:33.5851413Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:33.5851711Z "/opt/ads-agent/_work/6/.sonarqube/out/15"
2026-08-26T17:38:33.5852030Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:33.5852310Z "/opt/ads-agent/_work/6/.sonarqube/out/15/Issues.json"
2026-08-26T17:38:33.5852391Z 
2026-08-26T17:38:33.5852728Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod15
2026-08-26T17:38:33.5853086Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectKey=SIMOV-imoveiscaixa-batch:A79CA783-37A2-49D3-B56C-D9102F046AF9
2026-08-26T17:38:33.5853476Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectName=Simov.Domain
2026-08-26T17:38:33.5853801Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:38:33.5854051Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.sourceEncoding=utf-8
2026-08-26T17:38:33.5854256Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.sources=\
2026-08-26T17:38:33.5854327Z 
2026-08-26T17:38:33.5854362Z 
2026-08-26T17:38:33.5854548Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:33.5854740Z "/opt/ads-agent/_work/6/.sonarqube/out/16"
2026-08-26T17:38:33.5854952Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:33.5855155Z "/opt/ads-agent/_work/6/.sonarqube/out/16/Issues.json"
2026-08-26T17:38:33.5855215Z 
2026-08-26T17:38:33.5855435Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod16
2026-08-26T17:38:33.5855737Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectKey=SIMOV-imoveiscaixa-batch:51ABFD24-E14F-4155-B9D7-CDBD0E536AAB
2026-08-26T17:38:33.5856006Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectName=Simov.Application
2026-08-26T17:38:33.5856266Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:38:33.5856504Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.sourceEncoding=utf-8
2026-08-26T17:38:33.5856711Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.sources=\
2026-08-26T17:38:33.5856786Z 
2026-08-26T17:38:33.5856821Z 
2026-08-26T17:38:33.5857009Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:33.5857201Z "/opt/ads-agent/_work/6/.sonarqube/out/17"
2026-08-26T17:38:33.5857409Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:33.5857611Z "/opt/ads-agent/_work/6/.sonarqube/out/17/Issues.json"
2026-08-26T17:38:33.5857678Z 
2026-08-26T17:38:33.5857899Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod17
2026-08-26T17:38:33.5858208Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectKey=SIMOV-imoveiscaixa-batch:F2842708-9CF5-4649-B3A8-6D39E5E01B77
2026-08-26T17:38:33.5858468Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:38:33.5858724Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:38:33.5859026Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.sourceEncoding=utf-8
2026-08-26T17:38:33.5859259Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.sources=\
2026-08-26T17:38:33.5859333Z 
2026-08-26T17:38:33.5859368Z 
2026-08-26T17:38:33.5859556Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:33.5859745Z "/opt/ads-agent/_work/6/.sonarqube/out/18"
2026-08-26T17:38:33.5859951Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:33.5860152Z "/opt/ads-agent/_work/6/.sonarqube/out/18/Issues.json"
2026-08-26T17:38:33.5860256Z 
2026-08-26T17:38:33.5860479Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod18
2026-08-26T17:38:33.5860837Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectKey=SIMOV-imoveiscaixa-batch:3C101C3B-D8C0-461B-B65B-B87A6F75F210
2026-08-26T17:38:33.5861122Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectName=Simov.Batch
2026-08-26T17:38:33.5861501Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:38:33.5861849Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.sourceEncoding=utf-8
2026-08-26T17:38:33.5862130Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.sources=\
2026-08-26T17:38:33.5862212Z 
2026-08-26T17:38:33.5862271Z 
2026-08-26T17:38:33.5862543Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:33.5862806Z "/opt/ads-agent/_work/6/.sonarqube/out/19"
2026-08-26T17:38:33.5863086Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:33.5863395Z "/opt/ads-agent/_work/6/.sonarqube/out/19/Issues.json"
2026-08-26T17:38:33.5863473Z 
2026-08-26T17:38:33.5863875Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod19
2026-08-26T17:38:33.5864267Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectKey=SIMOV-imoveiscaixa-batch:4E341BE0-BD46-427C-8912-6319C41C89BC
2026-08-26T17:38:33.5864540Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectName=TesteSimovBatch
2026-08-26T17:38:33.5864816Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/tests/TesteSimovBatch
2026-08-26T17:38:33.5865055Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.sourceEncoding=utf-8
2026-08-26T17:38:33.5865265Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.sources=
2026-08-26T17:38:33.5865467Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.tests=\
2026-08-26T17:38:33.5865700Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/AvaliacaoImovelDtoTests.cs",\
2026-08-26T17:38:33.5865954Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/DadoContabilDtoTests.cs",\
2026-08-26T17:38:33.5866197Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/ImovelDtoTests.cs",\
2026-08-26T17:38:33.5866439Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/MatriculaImovelDtoTests.cs",\
2026-08-26T17:38:33.5866694Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/CargaImovelServiceTests.cs",\
2026-08-26T17:38:33.5866941Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/FileServiceTests.cs",\
2026-08-26T17:38:33.5867192Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/LeituraSiaciServiceTests.cs",\
2026-08-26T17:38:33.5867444Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/LogProcessamentoServiceTests.cs",\
2026-08-26T17:38:33.5867695Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/MapperDataServiceTests.cs",\
2026-08-26T17:38:33.5867946Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/WorkerImovelServiceTests.cs",\
2026-08-26T17:38:33.5868282Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSiaciPreCadastroUseCaseTests.cs",\
2026-08-26T17:38:33.5868543Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSimilFotoUseCaseTests.cs",\
2026-08-26T17:38:33.5868865Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSimilUseCaseTests.cs",\
2026-08-26T17:38:33.5869112Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSiopiUseCaseTests.cs",\
2026-08-26T17:38:33.5869354Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/SiaciDDQUseCaseTests.cs",\
2026-08-26T17:38:33.5869585Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Batch/LoaderImoveisSiopiTests.cs",\
2026-08-26T17:38:33.5869809Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/CargaImoveisSiaciTests.cs",\
2026-08-26T17:38:33.5870044Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Configuration/AddHeadersHttpClientTests.cs",\
2026-08-26T17:38:33.5870332Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Configuration/ConnectionsConfigurationTest.cs",\
2026-08-26T17:38:33.5870572Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Contexts/FileProcessingContextTests.cs",\
2026-08-26T17:38:33.5870813Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Contexts/SiicoCallCounterContextTests.cs",\
2026-08-26T17:38:33.5871045Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/DomainObjects/EntityTests.cs",\
2026-08-26T17:38:33.5871281Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/DomainObjects/IAggregateRootTests.cs",\
2026-08-26T17:38:33.5871531Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/CancellationExceptionTests.cs",\
2026-08-26T17:38:33.5871781Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/EntityValidationExceptionTests.cs",\
2026-08-26T17:38:33.5872021Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/GenericExceptionTests.cs",\
2026-08-26T17:38:33.5872263Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/NotFoundExceptionTests.cs",\
2026-08-26T17:38:33.5872508Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/ProcessamentoExceptionTests.cs",\
2026-08-26T17:38:33.5872757Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/RelatedAggregateExceptionTests.cs",\
2026-08-26T17:38:33.5873006Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/UnauthorizedExceptionTests.cs",\
2026-08-26T17:38:33.5873249Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siico/ApiSiicoRestPrivadoTests.cs",\
2026-08-26T17:38:33.5873493Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siico/ApiSiicoRestPublicoTests.cs",\
2026-08-26T17:38:33.5873796Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siiso/ApiSiisoRestPublicoTests.cs",\
2026-08-26T17:38:33.5874036Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/AutenticacarSsoTests.cs",\
2026-08-26T17:38:33.5874275Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/BairroDetalhadoSiicoTests.cs",\
2026-08-26T17:38:33.5874514Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/BairroSiicoTests.cs",\
2026-08-26T17:38:33.5874752Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/MunicipioCompletoSiicoTests.cs",\
2026-08-26T17:38:33.5874993Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/ResponseGenericoTests.cs",\
2026-08-26T17:38:33.5875225Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/Siico/CepSiicoTests.cs",\
2026-08-26T17:38:33.5875461Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Domain/Layouts/BaseArquivoLayoutTests.cs",\
2026-08-26T17:38:33.5875694Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/AgrupamentoVendaImovelTests.cs",\
2026-08-26T17:38:33.5875929Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/AvaliacaoImovelSiopiTests.cs",\
2026-08-26T17:38:33.5876160Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/ControleProcessamentoTests.cs",\
2026-08-26T17:38:33.5876389Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/DadoContabilTests.cs",\
2026-08-26T17:38:33.5876629Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoAgrupamentoVendaImovelTests.cs",\
2026-08-26T17:38:33.5876908Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoDadoContabilTests.cs",\
2026-08-26T17:38:33.5877137Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoImovelTests.cs",\
2026-08-26T17:38:33.5877361Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/ImovelTests.cs",\
2026-08-26T17:38:33.5877592Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/MatriculaImovelSiopiTests.cs",\
2026-08-26T17:38:33.5877848Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/MensagemControleProcessamentoTests.cs",\
2026-08-26T17:38:33.5878086Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/RotinaProcessamentoTests.cs",\
2026-08-26T17:38:33.5878369Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/SiopiImovelTests.cs",\
2026-08-26T17:38:33.5878591Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ArquivoSiaciFake.cs",\
2026-08-26T17:38:33.5878809Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ImovelDtoFake.cs",\
2026-08-26T17:38:33.5879023Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ImovelFake.cs",\
2026-08-26T17:38:33.5879240Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/LayoutArquivoFake.cs",\
2026-08-26T17:38:33.5879461Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/Siico/ResponsesFake.cs",\
2026-08-26T17:38:33.5879693Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/InfraDataEF/HistoricosInterceptorTests.cs",\
2026-08-26T17:38:33.5879928Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/InfraDataEF/SimovDbContextTests.cs",\
2026-08-26T17:38:33.5880149Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Layouts/SiaciLayoutTests.cs"
2026-08-26T17:38:33.5880226Z 
2026-08-26T17:38:33.5880424Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:33.5880619Z "/opt/ads-agent/_work/6/.sonarqube/out/20"
2026-08-26T17:38:33.5880835Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:33.5881038Z "/opt/ads-agent/_work/6/.sonarqube/out/20/Issues.json"
2026-08-26T17:38:33.5881101Z 
2026-08-26T17:38:33.5881330Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod20
2026-08-26T17:38:33.5881638Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectKey=SIMOV-imoveiscaixa-batch:0DC13198-1AC4-46C6-B9B3-E2987B8496D5
2026-08-26T17:38:33.5881898Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectName=Simov.Core
2026-08-26T17:38:33.5882152Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:38:33.5882383Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.sourceEncoding=utf-8
2026-08-26T17:38:33.5882587Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.sources=\
2026-08-26T17:38:33.5882656Z 
2026-08-26T17:38:33.5882690Z 
2026-08-26T17:38:33.5882883Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:33.5883084Z "/opt/ads-agent/_work/6/.sonarqube/out/21"
2026-08-26T17:38:33.5883291Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:33.5883499Z "/opt/ads-agent/_work/6/.sonarqube/out/21/Issues.json"
2026-08-26T17:38:33.5883561Z 
2026-08-26T17:38:33.5883841Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod21
2026-08-26T17:38:33.5884157Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectKey=SIMOV-imoveiscaixa-batch:BA15777F-9613-49A5-8C5F-8CBFA5F86619
2026-08-26T17:38:33.5884418Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectName=Simov.Domain
2026-08-26T17:38:33.5884668Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:38:33.5884899Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.sourceEncoding=utf-8
2026-08-26T17:38:33.5885109Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.sources=\
2026-08-26T17:38:33.5885182Z 
2026-08-26T17:38:33.5885216Z 
2026-08-26T17:38:33.5885402Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:33.5885594Z "/opt/ads-agent/_work/6/.sonarqube/out/22"
2026-08-26T17:38:33.5885843Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:33.5886050Z "/opt/ads-agent/_work/6/.sonarqube/out/22/Issues.json"
2026-08-26T17:38:33.5886117Z 
2026-08-26T17:38:33.5886342Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod22
2026-08-26T17:38:33.5886645Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectKey=SIMOV-imoveiscaixa-batch:48A485AE-9F33-C9A7-979C-54916B65C32E
2026-08-26T17:38:33.5886905Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectName=Simov.Application
2026-08-26T17:38:33.5887161Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:38:33.5887431Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.sourceEncoding=utf-8
2026-08-26T17:38:33.5887636Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.sources=\
2026-08-26T17:38:33.5887708Z 
2026-08-26T17:38:33.5887743Z 
2026-08-26T17:38:33.5887931Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:33.5888118Z "/opt/ads-agent/_work/6/.sonarqube/out/23"
2026-08-26T17:38:33.5888324Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:33.5888524Z "/opt/ads-agent/_work/6/.sonarqube/out/23/Issues.json"
2026-08-26T17:38:33.5888591Z 
2026-08-26T17:38:33.5888813Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod23
2026-08-26T17:38:33.5889117Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectKey=SIMOV-imoveiscaixa-batch:309346D6-2461-4973-A29B-7A38A756C0DE
2026-08-26T17:38:33.5889377Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:38:33.5889638Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:38:33.5889871Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.sourceEncoding=utf-8
2026-08-26T17:38:33.5890075Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.sources=\
2026-08-26T17:38:33.5890140Z 
2026-08-26T17:38:33.5890182Z 
2026-08-26T17:38:33.5890371Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:33.5890560Z "/opt/ads-agent/_work/6/.sonarqube/out/24"
2026-08-26T17:38:33.5890770Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:33.5890967Z "/opt/ads-agent/_work/6/.sonarqube/out/24/Issues.json"
2026-08-26T17:38:33.5891024Z 
2026-08-26T17:38:33.5891245Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod24
2026-08-26T17:38:33.5891549Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectKey=SIMOV-imoveiscaixa-batch:4BF20498-1845-4781-82CB-E7783C0081FA
2026-08-26T17:38:33.5891814Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectName=Simov.Batch
2026-08-26T17:38:33.5892060Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:38:33.5892292Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.sourceEncoding=utf-8
2026-08-26T17:38:33.5892497Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.sources=\
2026-08-26T17:38:33.5892563Z 
2026-08-26T17:38:33.5892596Z 
2026-08-26T17:38:33.5892791Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:33.5892980Z "/opt/ads-agent/_work/6/.sonarqube/out/25"
2026-08-26T17:38:33.5893188Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:33.5893390Z "/opt/ads-agent/_work/6/.sonarqube/out/25/Issues.json"
2026-08-26T17:38:33.5893451Z 
2026-08-26T17:38:33.5893779Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod25
2026-08-26T17:38:33.5894108Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectKey=SIMOV-imoveiscaixa-batch:D54F14FF-8EEB-4EB8-994B-69D77DDB78FD
2026-08-26T17:38:33.5894364Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectName=TesteSimovBatch
2026-08-26T17:38:33.5894618Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/tests/TesteSimovBatch
2026-08-26T17:38:33.5894892Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.sourceEncoding=utf-8
2026-08-26T17:38:33.5895101Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.sources=
2026-08-26T17:38:33.5895309Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.tests=\
2026-08-26T17:38:33.5895372Z 
2026-08-26T17:38:33.5895406Z 
2026-08-26T17:38:33.5895596Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:33.5895788Z "/opt/ads-agent/_work/6/.sonarqube/out/26"
2026-08-26T17:38:33.5895994Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:33.5896232Z "/opt/ads-agent/_work/6/.sonarqube/out/26/Issues.json"
2026-08-26T17:38:33.5896303Z 
2026-08-26T17:38:33.5896525Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod26
2026-08-26T17:38:33.5896695Z sonar.host.url=https://sonar.apps.produtos4.caixa/
2026-08-26T17:38:33.5896876Z sonar.projectKey=SIMOV-imoveiscaixa-batch
2026-08-26T17:38:33.5897056Z sonar.projectName=SIMOV-imoveiscaixa-batch
2026-08-26T17:38:33.5897225Z sonar.projectVersion=1.0-SNAPSHOT
2026-08-26T17:38:33.5897352Z sonar.branch.name=CorrecoesSonar
2026-08-26T17:38:33.5897623Z sonar.scanner.metadataFilePath=/opt/ads-agent/_work/_temp/sonar/1.0-SNAPSHOT/f442c3b3-ec53-840d-3dab-bba3c4de61f5/report-task.txt
2026-08-26T17:38:33.5897890Z sonar.cs.opencover.reportsPaths=/opt/ads-agent/_work/_temp/**/coverage.opencover.xml
2026-08-26T17:38:33.5898109Z sonar.cs.vstest.reportsPaths=/opt/ads-agent/_work/_temp/**/*.trx
2026-08-26T17:38:33.5898249Z sonar.visualstudio.enable=false
2026-08-26T17:38:33.5898315Z 
2026-08-26T17:38:33.5899581Z sonar.modules=0B395246-F58A-479C-B0B1-C6A6045C6FD3,5E55366D-25CB-4B0F-BAF4-738003A18ED2,0847F1F3-B5DA-4FC3-8EEF-882D75A674FD,D745E52F-7A66-4C38-B30D-3A27EA75CCCE,FBCB055E-203B-4979-BB94-B02AE276DE0B,D6E1F89D-8BFA-426E-BC94-C1182DBD0621,AD78E470-A67C-4901-A53F-E3D7D40350CD,B904AD47-4763-413C-9324-7889FD92EFA6,6679F22B-144A-4C59-A28C-2A87F31E3915,EC78B0BC-170C-482C-867B-C5402B449403,1B2C05E0-E98F-477C-931D-923BBE79AE4E,A180ED2D-1521-44A6-B6EA-5DDEC55D2C17,A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E,00300450-28FA-4EA9-8A96-181ED44DCA26,1393E257-1007-43DE-B94C-0B0508C0B309,5BE00443-BD63-4C9F-A707-406F2AC94762,A79CA783-37A2-49D3-B56C-D9102F046AF9,51ABFD24-E14F-4155-B9D7-CDBD0E536AAB,F2842708-9CF5-4649-B3A8-6D39E5E01B77,3C101C3B-D8C0-461B-B65B-B87A6F75F210,4E341BE0-BD46-427C-8912-6319C41C89BC,0DC13198-1AC4-46C6-B9B3-E2987B8496D5,BA15777F-9613-49A5-8C5F-8CBFA5F86619,48A485AE-9F33-C9A7-979C-54916B65C32E,309346D6-2461-4973-A29B-7A38A756C0DE,4BF20498-1845-4781-82CB-E7783C0081FA,D54F14FF-8EEB-4EB8-994B-69D77DDB78FD
2026-08-26T17:38:33.5900170Z 
2026-08-26T17:38:33.5900203Z 
2026-08-26T17:38:33.5900388Z ------------------------------------------------------------------------
2026-08-26T17:38:33.5900686Z 14:38:33.574  Writing processing summary to /opt/ads-agent/_work/6/.sonarqube/out/ProjectInfo.log
2026-08-26T17:38:33.5900880Z The SONAR_SCANNER_HOME environment variable is not required and will be ignored.
2026-08-26T17:38:33.5901026Z Calling the SonarScanner CLI...
2026-08-26T17:38:33.5901333Z Executing file /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/sonar-scanner-4.7.0.2747/bin/sonar-scanner
2026-08-26T17:38:33.5901697Z   Args: -Dsonar.scanAllFiles=true -Dproject.settings=/opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties --from=ScannerMSBuild/5.8 --debug <sensitive data removed>
2026-08-26T17:38:33.5901934Z   Working directory: /opt/ads-agent/_work/6
2026-08-26T17:38:33.5902061Z   Timeout (ms):-1
2026-08-26T17:38:33.5902176Z   Process id: 26115
2026-08-26T17:38:33.6944909Z 14:38:33.689 INFO: Scanner configuration file: /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/sonar-scanner-4.7.0.2747/conf/sonar-scanner.properties
2026-08-26T17:38:33.6945597Z 14:38:33.691 INFO: Project root configuration file: /opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties
2026-08-26T17:38:33.7213806Z 14:38:33.720 INFO: SonarScanner 4.7.0.2747
2026-08-26T17:38:33.7214329Z 14:38:33.720 INFO: Java 11 Oracle Corporation (64-bit)
2026-08-26T17:38:33.7214565Z 14:38:33.720 INFO: Linux 5.18.5-100.fc35.x86_64 amd64
2026-08-26T17:38:33.7975631Z 14:38:33.796 DEBUG: keyStore is : 
2026-08-26T17:38:33.7975865Z 14:38:33.796 DEBUG: keyStore type is : pkcs12
2026-08-26T17:38:33.7976039Z 14:38:33.796 DEBUG: keyStore provider is : 
2026-08-26T17:38:33.7976191Z 14:38:33.797 DEBUG: init keystore
2026-08-26T17:38:33.7976343Z 14:38:33.797 DEBUG: init keymanager of type SunX509
2026-08-26T17:38:33.8673504Z 14:38:33.866 DEBUG: Create: /opt/ads-agent/cache-tools/.sonar/cache
2026-08-26T17:38:33.8677484Z 14:38:33.867 INFO: User cache: /opt/ads-agent/cache-tools/.sonar/cache
2026-08-26T17:38:33.8678312Z 14:38:33.867 DEBUG: Create: /opt/ads-agent/cache-tools/.sonar/cache/_tmp
2026-08-26T17:38:33.8697882Z 14:38:33.869 DEBUG: Extract sonar-scanner-api-batch in temp...
2026-08-26T17:38:33.8718468Z 14:38:33.871 DEBUG: Get bootstrap index...
2026-08-26T17:38:33.8719035Z 14:38:33.871 DEBUG: Download: https://sonar.apps.produtos4.caixa/batch/index
2026-08-26T17:38:33.9530163Z 14:38:33.952 INFO: ------------------------------------------------------------------------
2026-08-26T17:38:33.9530470Z 14:38:33.952 INFO: EXECUTION FAILURE
2026-08-26T17:38:33.9530706Z 14:38:33.952 INFO: ------------------------------------------------------------------------
2026-08-26T17:38:33.9530874Z 14:38:33.952 INFO: Total time: 0.283s
2026-08-26T17:38:33.9533247Z ##[error]14:38:33.952 ERROR: SonarQube server [https://sonar.apps.produtos4.caixa] can not be reached
2026-08-26T17:38:33.9533881Z 14:38:33.952 ERROR: SonarQube server [https://sonar.apps.produtos4.caixa] can not be reached
2026-08-26T17:38:33.9634329Z 14:38:33.962 INFO: Final Memory: 4M/68M
2026-08-26T17:38:33.9634689Z 14:38:33.963 INFO: ------------------------------------------------------------------------
2026-08-26T17:38:33.9635253Z ##[error]14:38:33.963 ERROR: Error during SonarScanner execution
org.sonarsource.scanner.api.internal.ScannerException: Unable to execute SonarScanner analysis
2026-08-26T17:38:33.9635697Z 14:38:33.963 ERROR: Error during SonarScanner execution
2026-08-26T17:38:33.9635870Z org.sonarsource.scanner.api.internal.ScannerException: Unable to execute SonarScanner analysis
2026-08-26T17:38:33.9637490Z ##[error]at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:85)
	at java.base/java.security.AccessController.doPrivileged(Native Method)
2026-08-26T17:38:33.9637956Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:85)
2026-08-26T17:38:33.9638171Z 	at java.base/java.security.AccessController.doPrivileged(Native Method)
2026-08-26T17:38:33.9639001Z ##[error]at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:74)
	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:70)
	at org.sonarsource.scanner.api.EmbeddedScanner.doStart(EmbeddedScanner.java:185)
	at org.sonarsource.scanner.api.EmbeddedScanner.start(EmbeddedScanner.java:123)
	at org.sonarsource.scanner.cli.Main.execute(Main.java:73)
	at org.sonarsource.scanner.cli.Main.main(Main.java:61)
2026-08-26T17:38:33.9639643Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:74)
2026-08-26T17:38:33.9639874Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:70)
2026-08-26T17:38:33.9640093Z 	at org.sonarsource.scanner.api.EmbeddedScanner.doStart(EmbeddedScanner.java:185)
2026-08-26T17:38:33.9640290Z 	at org.sonarsource.scanner.api.EmbeddedScanner.start(EmbeddedScanner.java:123)
2026-08-26T17:38:33.9640470Z 	at org.sonarsource.scanner.cli.Main.execute(Main.java:73)
2026-08-26T17:38:33.9640920Z 	at org.sonarsource.scanner.cli.Main.main(Main.java:61)
2026-08-26T17:38:33.9641238Z ##[error]Caused by: java.lang.IllegalStateException: Fail to get bootstrap index from server
2026-08-26T17:38:33.9641559Z Caused by: java.lang.IllegalStateException: Fail to get bootstrap index from server
2026-08-26T17:38:33.9641954Z ##[error]at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:42)
2026-08-26T17:38:33.9642321Z 	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:42)
2026-08-26T17:38:33.9642698Z ##[error]at org.sonarsource.scanner.api.internal.JarDownloader.getScannerEngineFiles(JarDownloader.java:58)
2026-08-26T17:38:33.9643126Z 	at org.sonarsource.scanner.api.internal.JarDownloader.getScannerEngineFiles(JarDownloader.java:58)
2026-08-26T17:38:33.9643735Z ##[error]at org.sonarsource.scanner.api.internal.JarDownloader.download(JarDownloader.java:53)
	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:76)
	... 7 more
2026-08-26T17:38:33.9644191Z 	at org.sonarsource.scanner.api.internal.JarDownloader.download(JarDownloader.java:53)
2026-08-26T17:38:33.9644416Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:76)
2026-08-26T17:38:33.9644587Z 	... 7 more
2026-08-26T17:38:33.9645066Z ##[error]Caused by: javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:128)
2026-08-26T17:38:33.9645545Z Caused by: javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:38:33.9645776Z 	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:128)
2026-08-26T17:38:33.9646235Z ##[error]at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:264)
2026-08-26T17:38:33.9647211Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
2026-08-26T17:38:33.9647412Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:264)
2026-08-26T17:38:33.9647938Z ##[error]at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:259)
	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1329)
2026-08-26T17:38:33.9648365Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:259)
2026-08-26T17:38:33.9648580Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1329)
2026-08-26T17:38:33.9649015Z ##[error]at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.onConsumeCertificate(CertificateMessage.java:1204)
2026-08-26T17:38:33.9649404Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.onConsumeCertificate(CertificateMessage.java:1204)
2026-08-26T17:38:33.9650003Z ##[error]at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.consume(CertificateMessage.java:1151)
	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:392)
	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:444)
2026-08-26T17:38:33.9650497Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.consume(CertificateMessage.java:1151)
2026-08-26T17:38:33.9650756Z 	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:392)
2026-08-26T17:38:33.9650948Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:444)
2026-08-26T17:38:33.9651436Z ##[error]at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:421)
	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:178)
2026-08-26T17:38:33.9651903Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:421)
2026-08-26T17:38:33.9652097Z 	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:178)
2026-08-26T17:38:33.9652436Z ##[error]at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:164)
2026-08-26T17:38:33.9652760Z 	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:164)
2026-08-26T17:38:33.9653990Z ##[error]at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1152)
	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1063)
2026-08-26T17:38:33.9654634Z 	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1152)
2026-08-26T17:38:33.9654832Z 	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1063)
2026-08-26T17:38:33.9655637Z ##[error]at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:402)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connectTls(RealConnection.java:336)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.establishProtocol(RealConnection.java:300)
2026-08-26T17:38:33.9656166Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:402)
2026-08-26T17:38:33.9656387Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connectTls(RealConnection.java:336)
2026-08-26T17:38:33.9656642Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.establishProtocol(RealConnection.java:300)
2026-08-26T17:38:33.9657397Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connect(RealConnection.java:185)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findConnection(ExchangeFinder.java:224)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findHealthyConnection(ExchangeFinder.java:108)
2026-08-26T17:38:33.9657978Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connect(RealConnection.java:185)
2026-08-26T17:38:33.9658227Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findConnection(ExchangeFinder.java:224)
2026-08-26T17:38:33.9658482Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findHealthyConnection(ExchangeFinder.java:108)
2026-08-26T17:38:33.9659193Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.find(ExchangeFinder.java:88)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.Transmitter.newExchange(Transmitter.java:169)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ConnectInterceptor.intercept(ConnectInterceptor.java:41)
2026-08-26T17:38:33.9659725Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.find(ExchangeFinder.java:88)
2026-08-26T17:38:33.9659967Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.Transmitter.newExchange(Transmitter.java:169)
2026-08-26T17:38:33.9660221Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ConnectInterceptor.intercept(ConnectInterceptor.java:41)
2026-08-26T17:38:33.9660646Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:38:33.9661078Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:38:33.9661650Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.cache.CacheInterceptor.intercept(CacheInterceptor.java:94)
2026-08-26T17:38:33.9662209Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:38:33.9662451Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.cache.CacheInterceptor.intercept(CacheInterceptor.java:94)
2026-08-26T17:38:33.9662877Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:38:33.9663295Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:38:33.9663994Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.BridgeInterceptor.intercept(BridgeInterceptor.java:93)
2026-08-26T17:38:33.9664509Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:38:33.9664757Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.BridgeInterceptor.intercept(BridgeInterceptor.java:93)
2026-08-26T17:38:33.9665196Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:38:33.9665617Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:38:33.9666345Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RetryAndFollowUpInterceptor.intercept(RetryAndFollowUpInterceptor.java:88)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:38:33.9666956Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RetryAndFollowUpInterceptor.intercept(RetryAndFollowUpInterceptor.java:88)
2026-08-26T17:38:33.9667237Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:38:33.9667476Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:38:33.9667875Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.getResponseWithInterceptorChain(RealCall.java:221)
2026-08-26T17:38:33.9668331Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.getResponseWithInterceptorChain(RealCall.java:221)
2026-08-26T17:38:33.9668816Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.execute(RealCall.java:81)
	at org.sonarsource.scanner.api.internal.ServerConnection.callUrl(ServerConnection.java:115)
2026-08-26T17:38:33.9669260Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.execute(RealCall.java:81)
2026-08-26T17:38:33.9669475Z 	at org.sonarsource.scanner.api.internal.ServerConnection.callUrl(ServerConnection.java:115)
2026-08-26T17:38:33.9669877Z ##[error]at org.sonarsource.scanner.api.internal.ServerConnection.downloadString(ServerConnection.java:99)
2026-08-26T17:38:33.9670235Z 	at org.sonarsource.scanner.api.internal.ServerConnection.downloadString(ServerConnection.java:99)
2026-08-26T17:38:33.9670639Z ##[error]at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:39)
	... 10 more
2026-08-26T17:38:33.9671015Z 	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:39)
2026-08-26T17:38:33.9671182Z 	... 10 more
2026-08-26T17:38:33.9671561Z ##[error]Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:38:33.9672026Z Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:38:33.9672554Z ##[error]at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:385)
	at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:290)
2026-08-26T17:38:33.9672950Z 	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:385)
2026-08-26T17:38:33.9673146Z 	at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:290)
2026-08-26T17:38:33.9673523Z ##[error]at java.base/sun.security.validator.Validator.validate(Validator.java:264)
2026-08-26T17:38:33.9673925Z 	at java.base/sun.security.validator.Validator.validate(Validator.java:264)
2026-08-26T17:38:33.9674413Z ##[error]at java.base/sun.security.ssl.X509TrustManagerImpl.validate(X509TrustManagerImpl.java:321)
	at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:221)
2026-08-26T17:38:33.9674840Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.validate(X509TrustManagerImpl.java:321)
2026-08-26T17:38:33.9675051Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:221)
2026-08-26T17:38:33.9675580Z ##[error]at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:129)
	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1313)
2026-08-26T17:38:33.9676023Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:129)
2026-08-26T17:38:33.9676262Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1313)
2026-08-26T17:38:33.9676537Z ##[error]... 43 more
2026-08-26T17:38:33.9676776Z 	... 43 more
2026-08-26T17:38:33.9677121Z ##[error]Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:38:33.9677470Z Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:38:33.9678134Z ##[error]at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:141)
	at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:126)
	at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
2026-08-26T17:38:33.9678652Z 	at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:141)
2026-08-26T17:38:33.9678870Z 	at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:126)
2026-08-26T17:38:33.9679076Z 	at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
2026-08-26T17:38:33.9679446Z ##[error]at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:380)
	... 49 more
2026-08-26T17:38:33.9679783Z 	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:380)
2026-08-26T17:38:33.9679929Z 	... 49 more
2026-08-26T17:38:33.9822266Z Process returned exit code 1
2026-08-26T17:38:33.9852269Z ##[error]The SonarScanner did not complete successfully
2026-08-26T17:38:33.9852619Z The SonarScanner did not complete successfully
2026-08-26T17:38:33.9852920Z ##[error]14:38:33.985  Post-processing failed. Exit code: 1
2026-08-26T17:38:33.9854028Z 14:38:33.985  Post-processing failed. Exit code: 1
2026-08-26T17:38:33.9939778Z ##[error]The process '/opt/ads-agent/cache-tools/.dotnet//dotnet' failed with exit code 1
2026-08-26T17:38:33.9972271Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 2 out of 10) after 4000 ms
2026-08-26T17:38:38.1051856Z [command]/opt/ads-agent/cache-tools/.dotnet//dotnet /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/SonarScanner.MSBuild.dll end
2026-08-26T17:38:38.1553314Z SonarScanner for MSBuild 5.8
2026-08-26T17:38:38.1553550Z Using the .NET Core version of the Scanner for MSBuild
2026-08-26T17:38:38.1941845Z Post-processing started.
2026-08-26T17:38:38.2650574Z 14:38:38.264  14:38:38.244  /opt/ads-agent/_work/6/.sonarqube/bin/targets/SonarQube.Integration.targets does not exist
2026-08-26T17:38:38.2651180Z 14:38:38.264  14:38:38.264  sonar.verbose=true was specified - setting the log verbosity to 'Debug'
2026-08-26T17:38:38.2651489Z 14:38:38.264  Loading the SonarQube analysis config from /opt/ads-agent/_work/6/.sonarqube/conf/SonarQubeAnalysisConfig.xml
2026-08-26T17:38:38.2651977Z 14:38:38.265  Not running under TeamBuild
2026-08-26T17:38:38.2652204Z 14:38:38.265  Analysis base directory: /opt/ads-agent/_work/6/.sonarqube
2026-08-26T17:38:38.2652589Z Build directory: 
2026-08-26T17:38:38.2652890Z Bin directory: /opt/ads-agent/_work/6/.sonarqube/bin
2026-08-26T17:38:38.2653179Z Config directory: /opt/ads-agent/_work/6/.sonarqube/conf
2026-08-26T17:38:38.2653382Z Output directory: /opt/ads-agent/_work/6/.sonarqube/out
2026-08-26T17:38:38.2653601Z Config file: /opt/ads-agent/_work/6/.sonarqube/conf/SonarQubeAnalysisConfig.xml
2026-08-26T17:38:38.2664199Z 14:38:38.266  Generating SonarQube project properties file to /opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties
2026-08-26T17:38:38.2834329Z 14:38:38.283  Setting analysis property: sonar.visualstudio.enable=false
2026-08-26T17:38:38.3015627Z 14:38:38.301  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/0/Issues.json
2026-08-26T17:38:38.3049481Z 14:38:38.304  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/1/Issues.json
2026-08-26T17:38:38.3081953Z 14:38:38.308  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/2/Issues.json
2026-08-26T17:38:38.3187673Z 14:38:38.318  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/3/Issues.json
2026-08-26T17:38:38.3217491Z 14:38:38.321  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/4/Issues.json
2026-08-26T17:38:38.3249365Z 14:38:38.324  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/5/Issues.json
2026-08-26T17:38:38.3261394Z 14:38:38.325  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/6/Issues.json
2026-08-26T17:38:38.3270931Z 14:38:38.326  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/7/Issues.json
2026-08-26T17:38:38.3372208Z 14:38:38.336  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/8/Issues.json
2026-08-26T17:38:38.3471640Z 14:38:38.346  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/9/Issues.json
2026-08-26T17:38:38.3501654Z 14:38:38.349  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/10/Issues.json
2026-08-26T17:38:38.3637661Z 14:38:38.363  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/11/Issues.json
2026-08-26T17:38:38.3661554Z 14:38:38.365  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/12/Issues.json
2026-08-26T17:38:38.3687388Z 14:38:38.368  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/13/Issues.json
2026-08-26T17:38:38.3696390Z 14:38:38.369  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/14/Issues.json
2026-08-26T17:38:38.3776520Z 14:38:38.377  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/15/Issues.json
2026-08-26T17:38:38.3799481Z 14:38:38.379  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/16/Issues.json
2026-08-26T17:38:38.3822704Z 14:38:38.382  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/17/Issues.json
2026-08-26T17:38:38.3831818Z 14:38:38.383  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/18/Issues.json
2026-08-26T17:38:38.3839981Z 14:38:38.383  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/19/Issues.json
2026-08-26T17:38:38.3843197Z 14:38:38.384  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/20/Issues.json
2026-08-26T17:38:38.3921301Z 14:38:38.391  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/21/Issues.json
2026-08-26T17:38:38.3944884Z 14:38:38.394  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/22/Issues.json
2026-08-26T17:38:38.3969963Z 14:38:38.396  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/23/Issues.json
2026-08-26T17:38:38.3978382Z 14:38:38.397  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/24/Issues.json
2026-08-26T17:38:38.3986327Z 14:38:38.398  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/25/Issues.json
2026-08-26T17:38:38.3989985Z 14:38:38.398  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/26/Issues.json
2026-08-26T17:38:38.4096156Z 14:38:38.409  Using longest common projects path as a base directory: '/opt/ads-agent/_work/6/s'.
2026-08-26T17:38:38.4194734Z 14:38:38.419  File was referenced by the following projects: '/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/TesteSimovBatch.csproj', '/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/TesteSimovBatch.csproj'.
2026-08-26T17:38:38.4306632Z 14:38:38.425  Dumping content of sonar-project.properties
2026-08-26T17:38:38.4306959Z ------------------------------------------------------------------------
2026-08-26T17:38:38.4307231Z sonar.projectKey=SIMOV-imoveiscaixa-batch
2026-08-26T17:38:38.4307555Z sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar
2026-08-26T17:38:38.4307756Z sonar.projectBaseDir=/opt/ads-agent/_work/6/s
2026-08-26T17:38:38.4307821Z 
2026-08-26T17:38:38.4308088Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectKey=SIMOV-imoveiscaixa-batch:0B395246-F58A-479C-B0B1-C6A6045C6FD3
2026-08-26T17:38:38.4308353Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectName=Simov.Core
2026-08-26T17:38:38.4308605Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:38:38.4308856Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.sourceEncoding=utf-8
2026-08-26T17:38:38.4309068Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.sources=\
2026-08-26T17:38:38.4309293Z "/opt/ads-agent/_work/6/s/src/Simov.Core/AutenticacaoSso/AutenticacarSso.cs",\
2026-08-26T17:38:38.4309520Z "/opt/ads-agent/_work/6/s/src/Simov.Core/AutenticacaoSso/IAutenticacarSso.cs",\
2026-08-26T17:38:38.4309984Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Data/IBaseRepository.cs",\
2026-08-26T17:38:38.4310188Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Data/IUnitOfWork.cs",\
2026-08-26T17:38:38.4310394Z "/opt/ads-agent/_work/6/s/src/Simov.Core/DomainObjects/Entity.cs",\
2026-08-26T17:38:38.4310608Z "/opt/ads-agent/_work/6/s/src/Simov.Core/DomainObjects/IAggregateRoot.cs",\
2026-08-26T17:38:38.4310830Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/ApplicationException.cs",\
2026-08-26T17:38:38.4311050Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/CancellationException.cs",\
2026-08-26T17:38:38.4311348Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/EntityValidationException.cs",\
2026-08-26T17:38:38.4311573Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/GenericException.cs",\
2026-08-26T17:38:38.4311787Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/NotFoundException.cs",\
2026-08-26T17:38:38.4312011Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/ProcessamentoException.cs",\
2026-08-26T17:38:38.4312237Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/RelatedAggregateException.cs",\
2026-08-26T17:38:38.4312457Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/UnauthorizedException.cs",\
2026-08-26T17:38:38.4312954Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Logging/LoggerExtensions.cs",\
2026-08-26T17:38:38.4313177Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siico/ApiSiicoRestPrivado.cs",\
2026-08-26T17:38:38.4313395Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siico/ApiSiicoRestPublico.cs",\
2026-08-26T17:38:38.4313618Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siiso/ApiSiisoRestPublico.cs",\
2026-08-26T17:38:38.4313961Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/DadosDto.cs",\
2026-08-26T17:38:38.4314183Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/DadosSimilDto.cs",\
2026-08-26T17:38:38.4314395Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/FotosDto.cs",\
2026-08-26T17:38:38.4314614Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/ListaFotoDto.cs",\
2026-08-26T17:38:38.4314826Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/ISOAPWeb.cs",\
2026-08-26T17:38:38.4315049Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/RobustSoapDeserializer.cs",\
2026-08-26T17:38:38.4315263Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/SOAPWeb.cs",\
2026-08-26T17:38:38.4315473Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/ResponseGenerico.cs",\
2026-08-26T17:38:38.4315696Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/BairroDetalhadoSiico.cs",\
2026-08-26T17:38:38.4315914Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/BairroSiico.cs",\
2026-08-26T17:38:38.4316126Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/CepSiico.cs",\
2026-08-26T17:38:38.4316350Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/LocalidadeSiico.cs",\
2026-08-26T17:38:38.4316576Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioCompletoSiico.cs",\
2026-08-26T17:38:38.4316804Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioParcialSiico.cs",\
2026-08-26T17:38:38.4317026Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioSiico.cs",\
2026-08-26T17:38:38.4317254Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/TipoLogradouroSiico.cs",\
2026-08-26T17:38:38.4317476Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/UnidadeCaixa.cs",\
2026-08-26T17:38:38.4317900Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/UnidadeFederacaoSiico.cs",\
2026-08-26T17:38:38.4318152Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/EnderecoPessoaSiiso.cs",\
2026-08-26T17:38:38.4318387Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/LocalidadeNascimentoSiiso.cs",\
2026-08-26T17:38:38.4318607Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/PessoaSiiso.cs",\
2026-08-26T17:38:38.4318835Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siico/IApiSiicoRestPrivado.cs",\
2026-08-26T17:38:38.4319124Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siico/IApiSiicoRestPublico.cs",\
2026-08-26T17:38:38.4319362Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siiso/IApiSiisoRestPublico.cs"
2026-08-26T17:38:38.4319445Z 
2026-08-26T17:38:38.4319645Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:38.4319837Z "/opt/ads-agent/_work/6/.sonarqube/out/0"
2026-08-26T17:38:38.4320048Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:38.4320421Z "/opt/ads-agent/_work/6/.sonarqube/out/0/Issues.json"
2026-08-26T17:38:38.4320482Z 
2026-08-26T17:38:38.4320749Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod0
2026-08-26T17:38:38.4321065Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectKey=SIMOV-imoveiscaixa-batch:5E55366D-25CB-4B0F-BAF4-738003A18ED2
2026-08-26T17:38:38.4321325Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectName=Simov.Domain
2026-08-26T17:38:38.4321578Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:38:38.4321805Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.sourceEncoding=utf-8
2026-08-26T17:38:38.4322012Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.sources=\
2026-08-26T17:38:38.4322228Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AgrupamentoVendaImovel.cs",\
2026-08-26T17:38:38.4322452Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaArquivoLote.cs",\
2026-08-26T17:38:38.4322668Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaFotoImovel.cs",\
2026-08-26T17:38:38.4322887Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaFotoLote.cs",\
2026-08-26T17:38:38.4323100Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaUsuario.cs",\
2026-08-26T17:38:38.4323312Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AvaliacaoImovel.cs",\
2026-08-26T17:38:38.4323520Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/ComodoImovel.cs",\
2026-08-26T17:38:38.4323845Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/ControleProcessamento.cs",\
2026-08-26T17:38:38.4324063Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/DadoContabil.cs",\
2026-08-26T17:38:38.4324277Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/FotoImovel.cs",\
2026-08-26T17:38:38.4324504Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoAgrupamentoVendaImovel.cs",\
2026-08-26T17:38:38.4324731Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoAvaliacaoImovel.cs",\
2026-08-26T17:38:38.4324955Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoComodoImovel.cs",\
2026-08-26T17:38:38.4325183Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoDadoContabil.cs",\
2026-08-26T17:38:38.4325398Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoImovel.cs",\
2026-08-26T17:38:38.4325618Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoMatriculaImovel.cs",\
2026-08-26T17:38:38.4325829Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/Imovel.cs",\
2026-08-26T17:38:38.4326035Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/MatriculaImovel.cs",\
2026-08-26T17:38:38.4326261Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/MensagemControleProcessamento.cs",\
2026-08-26T17:38:38.4326485Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/RotinaProcessamento.cs",\
2026-08-26T17:38:38.4326703Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/ClassificacaoImovelEnum.cs",\
2026-08-26T17:38:38.4326921Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/EstadoConservacaoEnum.cs",\
2026-08-26T17:38:38.4327141Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/FuncionalidadeSistemaEnum.cs",\
2026-08-26T17:38:38.4327359Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/IcAcaoSistemaEnum.cs",\
2026-08-26T17:38:38.4327571Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/IcShortEnum.cs",\
2026-08-26T17:38:38.4327786Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/MotivoExclusaoEnum.cs",\
2026-08-26T17:38:38.4328047Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/OrgaoProprietarioImovelEnum.cs",\
2026-08-26T17:38:38.4328262Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/OrigemImovelEnum.cs",\
2026-08-26T17:38:38.4328490Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/ResultadoMensagemProcessamentoEnum.cs",\
2026-08-26T17:38:38.4328716Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/RotinaProcessamentoEnum.cs",\
2026-08-26T17:38:38.4328925Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/SituacaoImovelEnum.cs",\
2026-08-26T17:38:38.4329143Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/SituacaoProcessamentoEnum.cs",\
2026-08-26T17:38:38.4329403Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoCampoEnum.cs",\
2026-08-26T17:38:38.4329725Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoComodoEnum.cs",\
2026-08-26T17:38:38.4329942Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoImovelEnum.cs",\
2026-08-26T17:38:38.4330154Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoMatriculaEnum.cs",\
2026-08-26T17:38:38.4330388Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAgrupamentoVendaImovelRepository.cs",\
2026-08-26T17:38:38.4330627Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaArquivoLoteRepository.cs",\
2026-08-26T17:38:38.4330864Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaFotoImovelRepository.cs",\
2026-08-26T17:38:38.4331108Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaFotoLoteRepository.cs",\
2026-08-26T17:38:38.4331340Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaUsuarioRepository.cs",\
2026-08-26T17:38:38.4331571Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAvaliacaoImovelRepository.cs",\
2026-08-26T17:38:38.4331799Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IComodoImovelRepository.cs",\
2026-08-26T17:38:38.4332036Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IControleProcessamentoRepository.cs",\
2026-08-26T17:38:38.4332267Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IDadoContabilRepository.cs",\
2026-08-26T17:38:38.4332490Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IFotoImovelRepository.cs",\
2026-08-26T17:38:38.4332708Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IGeradorHistorico.cs",\
2026-08-26T17:38:38.4332927Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IImovelRepository.cs",\
2026-08-26T17:38:38.4333153Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IMatriculaImovelRepository.cs",\
2026-08-26T17:38:38.4333397Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IMensagemControleProcessamentoRepository.cs",\
2026-08-26T17:38:38.4333702Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IRotinaProcessamentoRepository.cs",\
2026-08-26T17:38:38.4333942Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/BaseArquivoLayout.cs",\
2026-08-26T17:38:38.4334194Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/SiaciLayout.cs",\
2026-08-26T17:38:38.4334518Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/SiopiLayout.cs"
2026-08-26T17:38:38.4334810Z 
2026-08-26T17:38:38.4335028Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:38.4335221Z "/opt/ads-agent/_work/6/.sonarqube/out/1"
2026-08-26T17:38:38.4335430Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:38.4335632Z "/opt/ads-agent/_work/6/.sonarqube/out/1/Issues.json"
2026-08-26T17:38:38.4335703Z 
2026-08-26T17:38:38.4335927Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod1
2026-08-26T17:38:38.4336236Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectKey=SIMOV-imoveiscaixa-batch:0847F1F3-B5DA-4FC3-8EEF-882D75A674FD
2026-08-26T17:38:38.4336507Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectName=Simov.Application
2026-08-26T17:38:38.4336773Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:38:38.4337091Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.sourceEncoding=utf-8
2026-08-26T17:38:38.4337294Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.sources=\
2026-08-26T17:38:38.4337514Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Contexts/FileProcessingContext.cs",\
2026-08-26T17:38:38.4337888Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Contexts/SiicoCallCounterContext.cs",\
2026-08-26T17:38:38.4338113Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/AvaliacaoImovelDto.cs",\
2026-08-26T17:38:38.4338331Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/DadoContabilDto.cs",\
2026-08-26T17:38:38.4338971Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/EnderecoDto.cs",\
2026-08-26T17:38:38.4339244Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/ImovelDto.cs",\
2026-08-26T17:38:38.4339460Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/MatriculaImovelDto.cs",\
2026-08-26T17:38:38.4339676Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/MunicipioDto.cs",\
2026-08-26T17:38:38.4339892Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/SiaciDDQDto.cs",\
2026-08-26T17:38:38.4340114Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/TipoLogradouroDto.cs",\
2026-08-26T17:38:38.4340341Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ICargaFotoImovelService.cs",\
2026-08-26T17:38:38.4340571Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ICargaImovelService.cs",\
2026-08-26T17:38:38.4340791Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IFileService.cs",\
2026-08-26T17:38:38.4341012Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSiaciUseCase.cs",\
2026-08-26T17:38:38.4341241Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSimilFotoUseCase.cs",\
2026-08-26T17:38:38.4341473Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSimilUseCase.cs",\
2026-08-26T17:38:38.4341699Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSiopiUseCase.cs",\
2026-08-26T17:38:38.4341921Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ILeituraService.cs",\
2026-08-26T17:38:38.4342153Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ILogProcessamentoService.cs",\
2026-08-26T17:38:38.4342522Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IMapperDataService.cs",\
2026-08-26T17:38:38.4342757Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ISiaciDDQUseCase.cs",\
2026-08-26T17:38:38.4342984Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IWorkerImovelService.cs",\
2026-08-26T17:38:38.4343299Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/CargaImovelService.cs",\
2026-08-26T17:38:38.4343758Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/FileService.cs",\
2026-08-26T17:38:38.4344320Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/LeituraService.cs",\
2026-08-26T17:38:38.4344781Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/LogProcessamentoService.cs",\
2026-08-26T17:38:38.4345138Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/MapperDataService.cs",\
2026-08-26T17:38:38.4345516Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/WorkerImovelService.cs",\
2026-08-26T17:38:38.4345905Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSiaciUseCase.cs",\
2026-08-26T17:38:38.4346265Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSimilFotoUseCase.cs",\
2026-08-26T17:38:38.4346608Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSimilUseCase.cs",\
2026-08-26T17:38:38.4347197Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSiopiUseCase.cs",\
2026-08-26T17:38:38.4347456Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/SiaciDDQUseCase.cs"
2026-08-26T17:38:38.4347542Z 
2026-08-26T17:38:38.4347737Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:38.4347930Z "/opt/ads-agent/_work/6/.sonarqube/out/2"
2026-08-26T17:38:38.4348142Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:38.4348496Z "/opt/ads-agent/_work/6/.sonarqube/out/2/Issues.json"
2026-08-26T17:38:38.4348559Z 
2026-08-26T17:38:38.4348933Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod2
2026-08-26T17:38:38.4349343Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectKey=SIMOV-imoveiscaixa-batch:D745E52F-7A66-4C38-B30D-3A27EA75CCCE
2026-08-26T17:38:38.4349601Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectName=Simov.Core
2026-08-26T17:38:38.4349848Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:38:38.4350085Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.sourceEncoding=utf-8
2026-08-26T17:38:38.4350365Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.sources=\
2026-08-26T17:38:38.4350432Z 
2026-08-26T17:38:38.4350468Z 
2026-08-26T17:38:38.4350671Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:38.4350988Z "/opt/ads-agent/_work/6/.sonarqube/out/3"
2026-08-26T17:38:38.4351300Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:38.4351513Z "/opt/ads-agent/_work/6/.sonarqube/out/3/Issues.json"
2026-08-26T17:38:38.4351574Z 
2026-08-26T17:38:38.4351840Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod3
2026-08-26T17:38:38.4352324Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectKey=SIMOV-imoveiscaixa-batch:FBCB055E-203B-4979-BB94-B02AE276DE0B
2026-08-26T17:38:38.4353015Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectName=Simov.Domain
2026-08-26T17:38:38.4353395Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:38:38.4353885Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.sourceEncoding=utf-8
2026-08-26T17:38:38.4354222Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.sources=\
2026-08-26T17:38:38.4354498Z 
2026-08-26T17:38:38.4354541Z 
2026-08-26T17:38:38.4354743Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:38.4354939Z "/opt/ads-agent/_work/6/.sonarqube/out/4"
2026-08-26T17:38:38.4355144Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:38.4355346Z "/opt/ads-agent/_work/6/.sonarqube/out/4/Issues.json"
2026-08-26T17:38:38.4355429Z 
2026-08-26T17:38:38.4355764Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod4
2026-08-26T17:38:38.4356222Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectKey=SIMOV-imoveiscaixa-batch:D6E1F89D-8BFA-426E-BC94-C1182DBD0621
2026-08-26T17:38:38.4356701Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectName=Simov.Application
2026-08-26T17:38:38.4357265Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:38:38.4357673Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.sourceEncoding=utf-8
2026-08-26T17:38:38.4358030Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.sources=\
2026-08-26T17:38:38.4358149Z 
2026-08-26T17:38:38.4358222Z 
2026-08-26T17:38:38.4358548Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:38.4358873Z "/opt/ads-agent/_work/6/.sonarqube/out/5"
2026-08-26T17:38:38.4359214Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:38.4359542Z "/opt/ads-agent/_work/6/.sonarqube/out/5/Issues.json"
2026-08-26T17:38:38.4359644Z 
2026-08-26T17:38:38.4360016Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod5
2026-08-26T17:38:38.4360594Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectKey=SIMOV-imoveiscaixa-batch:AD78E470-A67C-4901-A53F-E3D7D40350CD
2026-08-26T17:38:38.4360972Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:38:38.4361235Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:38:38.4361559Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.sourceEncoding=utf-8
2026-08-26T17:38:38.4361942Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.sources=\
2026-08-26T17:38:38.4362157Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Common/BaseRepository.cs",\
2026-08-26T17:38:38.4362473Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Common/UnitOfWork.cs",\
2026-08-26T17:38:38.4362859Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Interceptor/HistoricosInterceptor.cs",\
2026-08-26T17:38:38.4363721Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AgrupamentoVendaImovelConfiguration.cs",\
2026-08-26T17:38:38.4364176Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaArquivoLoteConfiguration.cs",\
2026-08-26T17:38:38.4364678Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaFotoImovelConfiguration.cs",\
2026-08-26T17:38:38.4365110Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaFotoLoteConfiguration.cs",\
2026-08-26T17:38:38.4365533Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaUsuarioConfiguration.cs",\
2026-08-26T17:38:38.4365966Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AvaliacaoImovelConfiguration.cs",\
2026-08-26T17:38:38.4366360Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ComodoImovelConfiguration.cs",\
2026-08-26T17:38:38.4366682Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ControleProcessamentoConfiguration.cs",\
2026-08-26T17:38:38.4366927Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/DadoContabilConfiguration.cs",\
2026-08-26T17:38:38.4367255Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/FotoImovelConfiguration.cs",\
2026-08-26T17:38:38.4367578Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoAgrupamentoVendaImovelConfiguration.cs",\
2026-08-26T17:38:38.4367880Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoAvaliacaoImovelConfiguration.cs",\
2026-08-26T17:38:38.4368201Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoComodoImovelConfiguration.cs",\
2026-08-26T17:38:38.4368452Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoDadoContabilConfiguration.cs",\
2026-08-26T17:38:38.4368765Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoImovelConfiguration.cs",\
2026-08-26T17:38:38.4369057Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoMatriculaImovelConfiguration.cs",\
2026-08-26T17:38:38.4369435Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ImovelConfiguration.cs",\
2026-08-26T17:38:38.4369963Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/MatriculaImovelConfiguration.cs",\
2026-08-26T17:38:38.4370433Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/MensagemControleProcessamentoConfiguration.cs",\
2026-08-26T17:38:38.4370832Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/RotinaProcessamentoConfiguration.cs",\
2026-08-26T17:38:38.4371251Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AgrupamentoVendaImovelRepository.cs",\
2026-08-26T17:38:38.4371690Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaArquivoLoteRepository.cs",\
2026-08-26T17:38:38.4372100Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaFotoImovelRepository.cs",\
2026-08-26T17:38:38.4372633Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaFotoLoteRepository.cs",\
2026-08-26T17:38:38.4373065Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaUsuarioRepository.cs",\
2026-08-26T17:38:38.4373448Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AvaliacaoImovelRepository.cs",\
2026-08-26T17:38:38.4374006Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ComodoImovelRepository.cs",\
2026-08-26T17:38:38.4374429Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ControleProcessamentoRepository.cs",\
2026-08-26T17:38:38.4374829Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/DadoContabilRepository.cs",\
2026-08-26T17:38:38.4375378Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/FotoImovelRepository.cs",\
2026-08-26T17:38:38.4375888Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ImovelRepository.cs",\
2026-08-26T17:38:38.4376382Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/MatriculaImovelRepository.cs",\
2026-08-26T17:38:38.4376880Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/MensagemControleProcessamentoRepository.cs",\
2026-08-26T17:38:38.4377327Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/RotinaProcessamentoRepository.cs",\
2026-08-26T17:38:38.4377725Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/SimovDbContext.cs"
2026-08-26T17:38:38.4378067Z 
2026-08-26T17:38:38.4378459Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:38.4378838Z "/opt/ads-agent/_work/6/.sonarqube/out/6"
2026-08-26T17:38:38.4379200Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:38.4379552Z "/opt/ads-agent/_work/6/.sonarqube/out/6/Issues.json"
2026-08-26T17:38:38.4379663Z 
2026-08-26T17:38:38.4379995Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod6
2026-08-26T17:38:38.4380380Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectKey=SIMOV-imoveiscaixa-batch:B904AD47-4763-413C-9324-7889FD92EFA6
2026-08-26T17:38:38.4380755Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectName=Simov.Batch
2026-08-26T17:38:38.4381014Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:38:38.4381243Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.sourceEncoding=utf-8
2026-08-26T17:38:38.4381457Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.sources=\
2026-08-26T17:38:38.4381724Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/AddHeadersHttpClient.cs",\
2026-08-26T17:38:38.4382014Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/ConnectionsConfiguration.cs",\
2026-08-26T17:38:38.4382253Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/HttpClientConfiguration.cs",\
2026-08-26T17:38:38.4382483Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/IApiSiisoRestPrivado.cs",\
2026-08-26T17:38:38.4382720Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/UseCasesConfiguration.cs",\
2026-08-26T17:38:38.4382938Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderImoveisSiaci.cs",\
2026-08-26T17:38:38.4383155Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderImoveisSiopi.cs",\
2026-08-26T17:38:38.4383463Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderLeilaoSiaciDDQ.cs",\
2026-08-26T17:38:38.4383825Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Program.cs",\
2026-08-26T17:38:38.4384048Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Workers/WorkerFotoImoveisSimil.cs",\
2026-08-26T17:38:38.4384265Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Workers/WorkerImoveisSimil.cs",\
2026-08-26T17:38:38.4384537Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/Simov.Batch.GlobalUsings.g.cs",\
2026-08-26T17:38:38.4384836Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/.NETCoreApp,Version=v8.0.AssemblyAttributes.cs",\
2026-08-26T17:38:38.4385088Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/Simov.Batch.AssemblyInfo.cs",\
2026-08-26T17:38:38.4385316Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/appsettings.Development.json",\
2026-08-26T17:38:38.4385525Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/appsettings.json",\
2026-08-26T17:38:38.4385737Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Properties/launchSettings.json",\
2026-08-26T17:38:38.4385951Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/apphost"
2026-08-26T17:38:38.4386031Z 
2026-08-26T17:38:38.4386226Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:38.4386419Z "/opt/ads-agent/_work/6/.sonarqube/out/7"
2026-08-26T17:38:38.4386629Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:38.4386921Z "/opt/ads-agent/_work/6/.sonarqube/out/7/Issues.json"
2026-08-26T17:38:38.4386983Z 
2026-08-26T17:38:38.4387207Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod7
2026-08-26T17:38:38.4387600Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectKey=SIMOV-imoveiscaixa-batch:6679F22B-144A-4C59-A28C-2A87F31E3915
2026-08-26T17:38:38.4387866Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectName=Simov.Core
2026-08-26T17:38:38.4388118Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:38:38.4388353Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.sourceEncoding=utf-8
2026-08-26T17:38:38.4388608Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.sources=\
2026-08-26T17:38:38.4388673Z 
2026-08-26T17:38:38.4388716Z 
2026-08-26T17:38:38.4388908Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:38.4389103Z "/opt/ads-agent/_work/6/.sonarqube/out/8"
2026-08-26T17:38:38.4389315Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:38.4389517Z "/opt/ads-agent/_work/6/.sonarqube/out/8/Issues.json"
2026-08-26T17:38:38.4389580Z 
2026-08-26T17:38:38.4389801Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod8
2026-08-26T17:38:38.4390104Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectKey=SIMOV-imoveiscaixa-batch:EC78B0BC-170C-482C-867B-C5402B449403
2026-08-26T17:38:38.4390357Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectName=Simov.Core
2026-08-26T17:38:38.4390601Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:38:38.4390842Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.sourceEncoding=utf-8
2026-08-26T17:38:38.4391048Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.sources=\
2026-08-26T17:38:38.4391112Z 
2026-08-26T17:38:38.4391146Z 
2026-08-26T17:38:38.4391335Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:38.4391530Z "/opt/ads-agent/_work/6/.sonarqube/out/9"
2026-08-26T17:38:38.4391737Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:38.4391952Z "/opt/ads-agent/_work/6/.sonarqube/out/9/Issues.json"
2026-08-26T17:38:38.4392013Z 
2026-08-26T17:38:38.4392271Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod9
2026-08-26T17:38:38.4392575Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectKey=SIMOV-imoveiscaixa-batch:1B2C05E0-E98F-477C-931D-923BBE79AE4E
2026-08-26T17:38:38.4392831Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectName=Simov.Domain
2026-08-26T17:38:38.4393080Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:38:38.4393308Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.sourceEncoding=utf-8
2026-08-26T17:38:38.4393515Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.sources=\
2026-08-26T17:38:38.4393590Z 
2026-08-26T17:38:38.4393670Z 
2026-08-26T17:38:38.4393878Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:38.4394071Z "/opt/ads-agent/_work/6/.sonarqube/out/10"
2026-08-26T17:38:38.4394281Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:38.4394482Z "/opt/ads-agent/_work/6/.sonarqube/out/10/Issues.json"
2026-08-26T17:38:38.4394551Z 
2026-08-26T17:38:38.4394772Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod10
2026-08-26T17:38:38.4395074Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectKey=SIMOV-imoveiscaixa-batch:A180ED2D-1521-44A6-B6EA-5DDEC55D2C17
2026-08-26T17:38:38.4395341Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectName=Simov.Core
2026-08-26T17:38:38.4395592Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:38:38.4395825Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.sourceEncoding=utf-8
2026-08-26T17:38:38.4396077Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.sources=\
2026-08-26T17:38:38.4396152Z 
2026-08-26T17:38:38.4396187Z 
2026-08-26T17:38:38.4396381Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:38.4396573Z "/opt/ads-agent/_work/6/.sonarqube/out/11"
2026-08-26T17:38:38.4396782Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:38.4396989Z "/opt/ads-agent/_work/6/.sonarqube/out/11/Issues.json"
2026-08-26T17:38:38.4397049Z 
2026-08-26T17:38:38.4397269Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod11
2026-08-26T17:38:38.4397614Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectKey=SIMOV-imoveiscaixa-batch:A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E
2026-08-26T17:38:38.4397864Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectName=Simov.Domain
2026-08-26T17:38:38.4398104Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:38:38.4398330Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.sourceEncoding=utf-8
2026-08-26T17:38:38.4398532Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.sources=\
2026-08-26T17:38:38.4398595Z 
2026-08-26T17:38:38.4398637Z 
2026-08-26T17:38:38.4398824Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:38.4399014Z "/opt/ads-agent/_work/6/.sonarqube/out/12"
2026-08-26T17:38:38.4399223Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:38.4399427Z "/opt/ads-agent/_work/6/.sonarqube/out/12/Issues.json"
2026-08-26T17:38:38.4399488Z 
2026-08-26T17:38:38.4399709Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod12
2026-08-26T17:38:38.4400014Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectKey=SIMOV-imoveiscaixa-batch:00300450-28FA-4EA9-8A96-181ED44DCA26
2026-08-26T17:38:38.4400350Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectName=Simov.Application
2026-08-26T17:38:38.4400613Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:38:38.4400853Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.sourceEncoding=utf-8
2026-08-26T17:38:38.4401056Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.sources=\
2026-08-26T17:38:38.4401120Z 
2026-08-26T17:38:38.4401155Z 
2026-08-26T17:38:38.4401341Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:38.4401533Z "/opt/ads-agent/_work/6/.sonarqube/out/13"
2026-08-26T17:38:38.4401747Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:38.4401947Z "/opt/ads-agent/_work/6/.sonarqube/out/13/Issues.json"
2026-08-26T17:38:38.4402010Z 
2026-08-26T17:38:38.4402230Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod13
2026-08-26T17:38:38.4402535Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectKey=SIMOV-imoveiscaixa-batch:1393E257-1007-43DE-B94C-0B0508C0B309
2026-08-26T17:38:38.4402801Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:38:38.4403061Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:38:38.4403299Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.sourceEncoding=utf-8
2026-08-26T17:38:38.4403504Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.sources=\
2026-08-26T17:38:38.4403574Z 
2026-08-26T17:38:38.4403609Z 
2026-08-26T17:38:38.4403861Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:38.4404052Z "/opt/ads-agent/_work/6/.sonarqube/out/14"
2026-08-26T17:38:38.4404260Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:38.4404461Z "/opt/ads-agent/_work/6/.sonarqube/out/14/Issues.json"
2026-08-26T17:38:38.4404527Z 
2026-08-26T17:38:38.4404751Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod14
2026-08-26T17:38:38.4405096Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectKey=SIMOV-imoveiscaixa-batch:5BE00443-BD63-4C9F-A707-406F2AC94762
2026-08-26T17:38:38.4405349Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectName=Simov.Core
2026-08-26T17:38:38.4405595Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:38:38.4405823Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.sourceEncoding=utf-8
2026-08-26T17:38:38.4406027Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.sources=\
2026-08-26T17:38:38.4406097Z 
2026-08-26T17:38:38.4406132Z 
2026-08-26T17:38:38.4406444Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:38.4406680Z "/opt/ads-agent/_work/6/.sonarqube/out/15"
2026-08-26T17:38:38.4406888Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:38.4407089Z "/opt/ads-agent/_work/6/.sonarqube/out/15/Issues.json"
2026-08-26T17:38:38.4407157Z 
2026-08-26T17:38:38.4407378Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod15
2026-08-26T17:38:38.4407679Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectKey=SIMOV-imoveiscaixa-batch:A79CA783-37A2-49D3-B56C-D9102F046AF9
2026-08-26T17:38:38.4407932Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectName=Simov.Domain
2026-08-26T17:38:38.4408181Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:38:38.4408562Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.sourceEncoding=utf-8
2026-08-26T17:38:38.4408771Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.sources=\
2026-08-26T17:38:38.4408836Z 
2026-08-26T17:38:38.4408870Z 
2026-08-26T17:38:38.4409059Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:38.4409260Z "/opt/ads-agent/_work/6/.sonarqube/out/16"
2026-08-26T17:38:38.4409472Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:38.4409676Z "/opt/ads-agent/_work/6/.sonarqube/out/16/Issues.json"
2026-08-26T17:38:38.4409737Z 
2026-08-26T17:38:38.4409963Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod16
2026-08-26T17:38:38.4410267Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectKey=SIMOV-imoveiscaixa-batch:51ABFD24-E14F-4155-B9D7-CDBD0E536AAB
2026-08-26T17:38:38.4410533Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectName=Simov.Application
2026-08-26T17:38:38.4410795Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:38:38.4411027Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.sourceEncoding=utf-8
2026-08-26T17:38:38.4411241Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.sources=\
2026-08-26T17:38:38.4411314Z 
2026-08-26T17:38:38.4411347Z 
2026-08-26T17:38:38.4411537Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:38.4411729Z "/opt/ads-agent/_work/6/.sonarqube/out/17"
2026-08-26T17:38:38.4411939Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:38.4412144Z "/opt/ads-agent/_work/6/.sonarqube/out/17/Issues.json"
2026-08-26T17:38:38.4412213Z 
2026-08-26T17:38:38.4412437Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod17
2026-08-26T17:38:38.4412742Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectKey=SIMOV-imoveiscaixa-batch:F2842708-9CF5-4649-B3A8-6D39E5E01B77
2026-08-26T17:38:38.4413005Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:38:38.4413265Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:38:38.4413506Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.sourceEncoding=utf-8
2026-08-26T17:38:38.4413766Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.sources=\
2026-08-26T17:38:38.4413841Z 
2026-08-26T17:38:38.4413874Z 
2026-08-26T17:38:38.4414067Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:38.4414319Z "/opt/ads-agent/_work/6/.sonarqube/out/18"
2026-08-26T17:38:38.4414527Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:38.4414730Z "/opt/ads-agent/_work/6/.sonarqube/out/18/Issues.json"
2026-08-26T17:38:38.4414797Z 
2026-08-26T17:38:38.4415033Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod18
2026-08-26T17:38:38.4415339Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectKey=SIMOV-imoveiscaixa-batch:3C101C3B-D8C0-461B-B65B-B87A6F75F210
2026-08-26T17:38:38.4415601Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectName=Simov.Batch
2026-08-26T17:38:38.4415886Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:38:38.4416116Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.sourceEncoding=utf-8
2026-08-26T17:38:38.4416322Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.sources=\
2026-08-26T17:38:38.4416385Z 
2026-08-26T17:38:38.4416428Z 
2026-08-26T17:38:38.4416615Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:38.4416808Z "/opt/ads-agent/_work/6/.sonarqube/out/19"
2026-08-26T17:38:38.4417015Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:38.4417218Z "/opt/ads-agent/_work/6/.sonarqube/out/19/Issues.json"
2026-08-26T17:38:38.4417279Z 
2026-08-26T17:38:38.4417506Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod19
2026-08-26T17:38:38.4417813Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectKey=SIMOV-imoveiscaixa-batch:4E341BE0-BD46-427C-8912-6319C41C89BC
2026-08-26T17:38:38.4418082Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectName=TesteSimovBatch
2026-08-26T17:38:38.4418345Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/tests/TesteSimovBatch
2026-08-26T17:38:38.4418584Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.sourceEncoding=utf-8
2026-08-26T17:38:38.4418794Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.sources=
2026-08-26T17:38:38.4418998Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.tests=\
2026-08-26T17:38:38.4419233Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/AvaliacaoImovelDtoTests.cs",\
2026-08-26T17:38:38.4419485Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/DadoContabilDtoTests.cs",\
2026-08-26T17:38:38.4419721Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/ImovelDtoTests.cs",\
2026-08-26T17:38:38.4419958Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/MatriculaImovelDtoTests.cs",\
2026-08-26T17:38:38.4420208Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/CargaImovelServiceTests.cs",\
2026-08-26T17:38:38.4420450Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/FileServiceTests.cs",\
2026-08-26T17:38:38.4420695Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/LeituraSiaciServiceTests.cs",\
2026-08-26T17:38:38.4420953Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/LogProcessamentoServiceTests.cs",\
2026-08-26T17:38:38.4421202Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/MapperDataServiceTests.cs",\
2026-08-26T17:38:38.4421572Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/WorkerImovelServiceTests.cs",\
2026-08-26T17:38:38.4421830Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSiaciPreCadastroUseCaseTests.cs",\
2026-08-26T17:38:38.4422086Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSimilFotoUseCaseTests.cs",\
2026-08-26T17:38:38.4422335Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSimilUseCaseTests.cs",\
2026-08-26T17:38:38.4422582Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSiopiUseCaseTests.cs",\
2026-08-26T17:38:38.4422823Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/SiaciDDQUseCaseTests.cs",\
2026-08-26T17:38:38.4423101Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Batch/LoaderImoveisSiopiTests.cs",\
2026-08-26T17:38:38.4423329Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/CargaImoveisSiaciTests.cs",\
2026-08-26T17:38:38.4423564Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Configuration/AddHeadersHttpClientTests.cs",\
2026-08-26T17:38:38.4423887Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Configuration/ConnectionsConfigurationTest.cs",\
2026-08-26T17:38:38.4424131Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Contexts/FileProcessingContextTests.cs",\
2026-08-26T17:38:38.4424368Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Contexts/SiicoCallCounterContextTests.cs",\
2026-08-26T17:38:38.4424639Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/DomainObjects/EntityTests.cs",\
2026-08-26T17:38:38.4424877Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/DomainObjects/IAggregateRootTests.cs",\
2026-08-26T17:38:38.4425121Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/CancellationExceptionTests.cs",\
2026-08-26T17:38:38.4425369Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/EntityValidationExceptionTests.cs",\
2026-08-26T17:38:38.4425613Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/GenericExceptionTests.cs",\
2026-08-26T17:38:38.4425851Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/NotFoundExceptionTests.cs",\
2026-08-26T17:38:38.4426093Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/ProcessamentoExceptionTests.cs",\
2026-08-26T17:38:38.4426351Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/RelatedAggregateExceptionTests.cs",\
2026-08-26T17:38:38.4426601Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/UnauthorizedExceptionTests.cs",\
2026-08-26T17:38:38.4426851Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siico/ApiSiicoRestPrivadoTests.cs",\
2026-08-26T17:38:38.4427098Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siico/ApiSiicoRestPublicoTests.cs",\
2026-08-26T17:38:38.4427345Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siiso/ApiSiisoRestPublicoTests.cs",\
2026-08-26T17:38:38.4427572Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/AutenticacarSsoTests.cs",\
2026-08-26T17:38:38.4427805Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/BairroDetalhadoSiicoTests.cs",\
2026-08-26T17:38:38.4428033Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/BairroSiicoTests.cs",\
2026-08-26T17:38:38.4428267Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/MunicipioCompletoSiicoTests.cs",\
2026-08-26T17:38:38.4428511Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/ResponseGenericoTests.cs",\
2026-08-26T17:38:38.4428751Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/Siico/CepSiicoTests.cs",\
2026-08-26T17:38:38.4428990Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Domain/Layouts/BaseArquivoLayoutTests.cs",\
2026-08-26T17:38:38.4429230Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/AgrupamentoVendaImovelTests.cs",\
2026-08-26T17:38:38.4429473Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/AvaliacaoImovelSiopiTests.cs",\
2026-08-26T17:38:38.4429707Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/ControleProcessamentoTests.cs",\
2026-08-26T17:38:38.4429933Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/DadoContabilTests.cs",\
2026-08-26T17:38:38.4430177Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoAgrupamentoVendaImovelTests.cs",\
2026-08-26T17:38:38.4430419Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoDadoContabilTests.cs",\
2026-08-26T17:38:38.4430651Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoImovelTests.cs",\
2026-08-26T17:38:38.4430872Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/ImovelTests.cs",\
2026-08-26T17:38:38.4431098Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/MatriculaImovelSiopiTests.cs",\
2026-08-26T17:38:38.4431382Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/MensagemControleProcessamentoTests.cs",\
2026-08-26T17:38:38.4431626Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/RotinaProcessamentoTests.cs",\
2026-08-26T17:38:38.4431852Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/SiopiImovelTests.cs",\
2026-08-26T17:38:38.4432075Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ArquivoSiaciFake.cs",\
2026-08-26T17:38:38.4432297Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ImovelDtoFake.cs",\
2026-08-26T17:38:38.4432518Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ImovelFake.cs",\
2026-08-26T17:38:38.4432767Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/LayoutArquivoFake.cs",\
2026-08-26T17:38:38.4433085Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/Siico/ResponsesFake.cs",\
2026-08-26T17:38:38.4433435Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/InfraDataEF/HistoricosInterceptorTests.cs",\
2026-08-26T17:38:38.4433896Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/InfraDataEF/SimovDbContextTests.cs",\
2026-08-26T17:38:38.4434246Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Layouts/SiaciLayoutTests.cs"
2026-08-26T17:38:38.4434358Z 
2026-08-26T17:38:38.4434660Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:38.4435000Z "/opt/ads-agent/_work/6/.sonarqube/out/20"
2026-08-26T17:38:38.4435364Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:38.4435706Z "/opt/ads-agent/_work/6/.sonarqube/out/20/Issues.json"
2026-08-26T17:38:38.4435826Z 
2026-08-26T17:38:38.4436233Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod20
2026-08-26T17:38:38.4436789Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectKey=SIMOV-imoveiscaixa-batch:0DC13198-1AC4-46C6-B9B3-E2987B8496D5
2026-08-26T17:38:38.4437223Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectName=Simov.Core
2026-08-26T17:38:38.4437758Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:38:38.4438169Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.sourceEncoding=utf-8
2026-08-26T17:38:38.4438518Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.sources=\
2026-08-26T17:38:38.4438646Z 
2026-08-26T17:38:38.4438702Z 
2026-08-26T17:38:38.4438994Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:38.4439303Z "/opt/ads-agent/_work/6/.sonarqube/out/21"
2026-08-26T17:38:38.4439642Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:38.4439976Z "/opt/ads-agent/_work/6/.sonarqube/out/21/Issues.json"
2026-08-26T17:38:38.4440085Z 
2026-08-26T17:38:38.4440441Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod21
2026-08-26T17:38:38.4440978Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectKey=SIMOV-imoveiscaixa-batch:BA15777F-9613-49A5-8C5F-8CBFA5F86619
2026-08-26T17:38:38.4441447Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectName=Simov.Domain
2026-08-26T17:38:38.4441867Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:38:38.4442254Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.sourceEncoding=utf-8
2026-08-26T17:38:38.4442591Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.sources=\
2026-08-26T17:38:38.4442696Z 
2026-08-26T17:38:38.4442763Z 
2026-08-26T17:38:38.4443088Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:38.4443431Z "/opt/ads-agent/_work/6/.sonarqube/out/22"
2026-08-26T17:38:38.4443921Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:38.4444281Z "/opt/ads-agent/_work/6/.sonarqube/out/22/Issues.json"
2026-08-26T17:38:38.4444392Z 
2026-08-26T17:38:38.4444781Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod22
2026-08-26T17:38:38.4445515Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectKey=SIMOV-imoveiscaixa-batch:48A485AE-9F33-C9A7-979C-54916B65C32E
2026-08-26T17:38:38.4445979Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectName=Simov.Application
2026-08-26T17:38:38.4446419Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:38:38.4446825Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.sourceEncoding=utf-8
2026-08-26T17:38:38.4447178Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.sources=\
2026-08-26T17:38:38.4447289Z 
2026-08-26T17:38:38.4447358Z 
2026-08-26T17:38:38.4447680Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:38.4448065Z "/opt/ads-agent/_work/6/.sonarqube/out/23"
2026-08-26T17:38:38.4448415Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:38.4448758Z "/opt/ads-agent/_work/6/.sonarqube/out/23/Issues.json"
2026-08-26T17:38:38.4448861Z 
2026-08-26T17:38:38.4449249Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod23
2026-08-26T17:38:38.4449758Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectKey=SIMOV-imoveiscaixa-batch:309346D6-2461-4973-A29B-7A38A756C0DE
2026-08-26T17:38:38.4450216Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:38:38.4450649Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:38:38.4450998Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.sourceEncoding=utf-8
2026-08-26T17:38:38.4451356Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.sources=\
2026-08-26T17:38:38.4451472Z 
2026-08-26T17:38:38.4451532Z 
2026-08-26T17:38:38.4451846Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:38.4452166Z "/opt/ads-agent/_work/6/.sonarqube/out/24"
2026-08-26T17:38:38.4452559Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:38.4452914Z "/opt/ads-agent/_work/6/.sonarqube/out/24/Issues.json"
2026-08-26T17:38:38.4453017Z 
2026-08-26T17:38:38.4453393Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod24
2026-08-26T17:38:38.4454000Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectKey=SIMOV-imoveiscaixa-batch:4BF20498-1845-4781-82CB-E7783C0081FA
2026-08-26T17:38:38.4454447Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectName=Simov.Batch
2026-08-26T17:38:38.4454859Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:38:38.4455236Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.sourceEncoding=utf-8
2026-08-26T17:38:38.4455579Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.sources=\
2026-08-26T17:38:38.4455702Z 
2026-08-26T17:38:38.4455760Z 
2026-08-26T17:38:38.4456088Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:38.4456421Z "/opt/ads-agent/_work/6/.sonarqube/out/25"
2026-08-26T17:38:38.4456776Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:38.4457122Z "/opt/ads-agent/_work/6/.sonarqube/out/25/Issues.json"
2026-08-26T17:38:38.4457236Z 
2026-08-26T17:38:38.4457616Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod25
2026-08-26T17:38:38.4458133Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectKey=SIMOV-imoveiscaixa-batch:D54F14FF-8EEB-4EB8-994B-69D77DDB78FD
2026-08-26T17:38:38.4458569Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectName=TesteSimovBatch
2026-08-26T17:38:38.4459008Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/tests/TesteSimovBatch
2026-08-26T17:38:38.4459421Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.sourceEncoding=utf-8
2026-08-26T17:38:38.4459774Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.sources=
2026-08-26T17:38:38.4460115Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.tests=\
2026-08-26T17:38:38.4460232Z 
2026-08-26T17:38:38.4460402Z 
2026-08-26T17:38:38.4460726Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:38.4461057Z "/opt/ads-agent/_work/6/.sonarqube/out/26"
2026-08-26T17:38:38.4461409Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:38.4461755Z "/opt/ads-agent/_work/6/.sonarqube/out/26/Issues.json"
2026-08-26T17:38:38.4461861Z 
2026-08-26T17:38:38.4462253Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod26
2026-08-26T17:38:38.4462554Z sonar.host.url=https://sonar.apps.produtos4.caixa/
2026-08-26T17:38:38.4462860Z sonar.projectKey=SIMOV-imoveiscaixa-batch
2026-08-26T17:38:38.4463243Z sonar.projectName=SIMOV-imoveiscaixa-batch
2026-08-26T17:38:38.4463591Z sonar.projectVersion=1.0-SNAPSHOT
2026-08-26T17:38:38.4463914Z sonar.branch.name=CorrecoesSonar
2026-08-26T17:38:38.4464375Z sonar.scanner.metadataFilePath=/opt/ads-agent/_work/_temp/sonar/1.0-SNAPSHOT/f442c3b3-ec53-840d-3dab-bba3c4de61f5/report-task.txt
2026-08-26T17:38:38.4464841Z sonar.cs.opencover.reportsPaths=/opt/ads-agent/_work/_temp/**/coverage.opencover.xml
2026-08-26T17:38:38.4465203Z sonar.cs.vstest.reportsPaths=/opt/ads-agent/_work/_temp/**/*.trx
2026-08-26T17:38:38.4465447Z sonar.visualstudio.enable=false
2026-08-26T17:38:38.4465541Z 
2026-08-26T17:38:38.4467903Z sonar.modules=0B395246-F58A-479C-B0B1-C6A6045C6FD3,5E55366D-25CB-4B0F-BAF4-738003A18ED2,0847F1F3-B5DA-4FC3-8EEF-882D75A674FD,D745E52F-7A66-4C38-B30D-3A27EA75CCCE,FBCB055E-203B-4979-BB94-B02AE276DE0B,D6E1F89D-8BFA-426E-BC94-C1182DBD0621,AD78E470-A67C-4901-A53F-E3D7D40350CD,B904AD47-4763-413C-9324-7889FD92EFA6,6679F22B-144A-4C59-A28C-2A87F31E3915,EC78B0BC-170C-482C-867B-C5402B449403,1B2C05E0-E98F-477C-931D-923BBE79AE4E,A180ED2D-1521-44A6-B6EA-5DDEC55D2C17,A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E,00300450-28FA-4EA9-8A96-181ED44DCA26,1393E257-1007-43DE-B94C-0B0508C0B309,5BE00443-BD63-4C9F-A707-406F2AC94762,A79CA783-37A2-49D3-B56C-D9102F046AF9,51ABFD24-E14F-4155-B9D7-CDBD0E536AAB,F2842708-9CF5-4649-B3A8-6D39E5E01B77,3C101C3B-D8C0-461B-B65B-B87A6F75F210,4E341BE0-BD46-427C-8912-6319C41C89BC,0DC13198-1AC4-46C6-B9B3-E2987B8496D5,BA15777F-9613-49A5-8C5F-8CBFA5F86619,48A485AE-9F33-C9A7-979C-54916B65C32E,309346D6-2461-4973-A29B-7A38A756C0DE,4BF20498-1845-4781-82CB-E7783C0081FA,D54F14FF-8EEB-4EB8-994B-69D77DDB78FD
2026-08-26T17:38:38.4468974Z 
2026-08-26T17:38:38.4469037Z 
2026-08-26T17:38:38.4469396Z ------------------------------------------------------------------------
2026-08-26T17:38:38.4469823Z 14:38:38.433  Writing processing summary to /opt/ads-agent/_work/6/.sonarqube/out/ProjectInfo.log
2026-08-26T17:38:38.4470149Z The SONAR_SCANNER_HOME environment variable is not required and will be ignored.
2026-08-26T17:38:38.4470403Z Calling the SonarScanner CLI...
2026-08-26T17:38:38.4470979Z Executing file /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/sonar-scanner-4.7.0.2747/bin/sonar-scanner
2026-08-26T17:38:38.4471612Z   Args: -Dsonar.scanAllFiles=true -Dproject.settings=/opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties --from=ScannerMSBuild/5.8 --debug <sensitive data removed>
2026-08-26T17:38:38.4472024Z   Working directory: /opt/ads-agent/_work/6
2026-08-26T17:38:38.4472236Z   Timeout (ms):-1
2026-08-26T17:38:38.4472429Z   Process id: 26182
2026-08-26T17:38:38.5588862Z 14:38:38.554 INFO: Scanner configuration file: /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/sonar-scanner-4.7.0.2747/conf/sonar-scanner.properties
2026-08-26T17:38:38.5589294Z 14:38:38.556 INFO: Project root configuration file: /opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties
2026-08-26T17:38:38.5865715Z 14:38:38.585 INFO: SonarScanner 4.7.0.2747
2026-08-26T17:38:38.5866257Z 14:38:38.585 INFO: Java 11 Oracle Corporation (64-bit)
2026-08-26T17:38:38.5866503Z 14:38:38.585 INFO: Linux 5.18.5-100.fc35.x86_64 amd64
2026-08-26T17:38:38.6701400Z 14:38:38.669 DEBUG: keyStore is : 
2026-08-26T17:38:38.6701666Z 14:38:38.669 DEBUG: keyStore type is : pkcs12
2026-08-26T17:38:38.6701817Z 14:38:38.669 DEBUG: keyStore provider is : 
2026-08-26T17:38:38.6701961Z 14:38:38.669 DEBUG: init keystore
2026-08-26T17:38:38.6702108Z 14:38:38.669 DEBUG: init keymanager of type SunX509
2026-08-26T17:38:38.7314486Z 14:38:38.730 DEBUG: Create: /opt/ads-agent/cache-tools/.sonar/cache
2026-08-26T17:38:38.7317184Z 14:38:38.731 INFO: User cache: /opt/ads-agent/cache-tools/.sonar/cache
2026-08-26T17:38:38.7317690Z 14:38:38.731 DEBUG: Create: /opt/ads-agent/cache-tools/.sonar/cache/_tmp
2026-08-26T17:38:38.7333061Z 14:38:38.732 DEBUG: Extract sonar-scanner-api-batch in temp...
2026-08-26T17:38:38.7352349Z 14:38:38.734 DEBUG: Get bootstrap index...
2026-08-26T17:38:38.7353186Z 14:38:38.735 DEBUG: Download: https://sonar.apps.produtos4.caixa/batch/index
2026-08-26T17:38:38.8137702Z 14:38:38.813 INFO: ------------------------------------------------------------------------
2026-08-26T17:38:38.8138044Z 14:38:38.813 INFO: EXECUTION FAILURE
2026-08-26T17:38:38.8141668Z 14:38:38.813 INFO: ------------------------------------------------------------------------
2026-08-26T17:38:38.8141928Z 14:38:38.813 INFO: Total time: 0.280s
2026-08-26T17:38:38.8142584Z ##[error]14:38:38.813 ERROR: SonarQube server [https://sonar.apps.produtos4.caixa] can not be reached
2026-08-26T17:38:38.8143193Z 14:38:38.813 ERROR: SonarQube server [https://sonar.apps.produtos4.caixa] can not be reached
2026-08-26T17:38:38.8280063Z 14:38:38.827 INFO: Final Memory: 4M/68M
2026-08-26T17:38:38.8281103Z 14:38:38.827 INFO: ------------------------------------------------------------------------
2026-08-26T17:38:38.8282147Z ##[error]14:38:38.827 ERROR: Error during SonarScanner execution
org.sonarsource.scanner.api.internal.ScannerException: Unable to execute SonarScanner analysis
2026-08-26T17:38:38.8282819Z 14:38:38.827 ERROR: Error during SonarScanner execution
2026-08-26T17:38:38.8283451Z org.sonarsource.scanner.api.internal.ScannerException: Unable to execute SonarScanner analysis
2026-08-26T17:38:38.8284323Z ##[error]at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:85)
	at java.base/java.security.AccessController.doPrivileged(Native Method)
2026-08-26T17:38:38.8284871Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:85)
2026-08-26T17:38:38.8285085Z 	at java.base/java.security.AccessController.doPrivileged(Native Method)
2026-08-26T17:38:38.8285886Z ##[error]at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:74)
	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:70)
	at org.sonarsource.scanner.api.EmbeddedScanner.doStart(EmbeddedScanner.java:185)
	at org.sonarsource.scanner.api.EmbeddedScanner.start(EmbeddedScanner.java:123)
	at org.sonarsource.scanner.cli.Main.execute(Main.java:73)
2026-08-26T17:38:38.8286521Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:74)
2026-08-26T17:38:38.8286750Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:70)
2026-08-26T17:38:38.8286965Z 	at org.sonarsource.scanner.api.EmbeddedScanner.doStart(EmbeddedScanner.java:185)
2026-08-26T17:38:38.8287161Z 	at org.sonarsource.scanner.api.EmbeddedScanner.start(EmbeddedScanner.java:123)
2026-08-26T17:38:38.8287344Z 	at org.sonarsource.scanner.cli.Main.execute(Main.java:73)
2026-08-26T17:38:38.8287665Z ##[error]at org.sonarsource.scanner.cli.Main.main(Main.java:61)
2026-08-26T17:38:38.8287983Z 	at org.sonarsource.scanner.cli.Main.main(Main.java:61)
2026-08-26T17:38:38.8288299Z ##[error]Caused by: java.lang.IllegalStateException: Fail to get bootstrap index from server
2026-08-26T17:38:38.8288627Z Caused by: java.lang.IllegalStateException: Fail to get bootstrap index from server
2026-08-26T17:38:38.8289260Z ##[error]at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:42)
2026-08-26T17:38:38.8289638Z 	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:42)
2026-08-26T17:38:38.8290300Z ##[error]at org.sonarsource.scanner.api.internal.JarDownloader.getScannerEngineFiles(JarDownloader.java:58)
	at org.sonarsource.scanner.api.internal.JarDownloader.download(JarDownloader.java:53)
	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:76)
	... 7 more
2026-08-26T17:38:38.8290814Z 	at org.sonarsource.scanner.api.internal.JarDownloader.getScannerEngineFiles(JarDownloader.java:58)
2026-08-26T17:38:38.8291092Z 	at org.sonarsource.scanner.api.internal.JarDownloader.download(JarDownloader.java:53)
2026-08-26T17:38:38.8291318Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:76)
2026-08-26T17:38:38.8291496Z 	... 7 more
2026-08-26T17:38:38.8292193Z ##[error]Caused by: javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:128)
	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:264)
2026-08-26T17:38:38.8292776Z Caused by: javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:38:38.8293020Z 	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:128)
2026-08-26T17:38:38.8293214Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
2026-08-26T17:38:38.8293410Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:264)
2026-08-26T17:38:38.8294840Z ##[error]at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:259)
	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1329)
	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.onConsumeCertificate(CertificateMessage.java:1204)
	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.consume(CertificateMessage.java:1151)
	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:392)
	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:444)
	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:421)
	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:178)
	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:164)
	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1152)
2026-08-26T17:38:38.8295738Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:259)
2026-08-26T17:38:38.8295964Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1329)
2026-08-26T17:38:38.8296240Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.onConsumeCertificate(CertificateMessage.java:1204)
2026-08-26T17:38:38.8296484Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.consume(CertificateMessage.java:1151)
2026-08-26T17:38:38.8296691Z 	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:392)
2026-08-26T17:38:38.8296884Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:444)
2026-08-26T17:38:38.8297082Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:421)
2026-08-26T17:38:38.8297276Z 	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:178)
2026-08-26T17:38:38.8297464Z 	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:164)
2026-08-26T17:38:38.8297758Z 	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1152)
2026-08-26T17:38:38.8298561Z ##[error]at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1063)
	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:402)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connectTls(RealConnection.java:336)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.establishProtocol(RealConnection.java:300)
2026-08-26T17:38:38.8299205Z 	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1063)
2026-08-26T17:38:38.8299538Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:402)
2026-08-26T17:38:38.8299765Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connectTls(RealConnection.java:336)
2026-08-26T17:38:38.8300025Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.establishProtocol(RealConnection.java:300)
2026-08-26T17:38:38.8302156Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connect(RealConnection.java:185)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findConnection(ExchangeFinder.java:224)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findHealthyConnection(ExchangeFinder.java:108)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.find(ExchangeFinder.java:88)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.Transmitter.newExchange(Transmitter.java:169)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ConnectInterceptor.intercept(ConnectInterceptor.java:41)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.cache.CacheInterceptor.intercept(CacheInterceptor.java:94)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.BridgeInterceptor.intercept(BridgeInterceptor.java:93)
2026-08-26T17:38:38.8303484Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connect(RealConnection.java:185)
2026-08-26T17:38:38.8303877Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findConnection(ExchangeFinder.java:224)
2026-08-26T17:38:38.8304184Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findHealthyConnection(ExchangeFinder.java:108)
2026-08-26T17:38:38.8304441Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.find(ExchangeFinder.java:88)
2026-08-26T17:38:38.8304683Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.Transmitter.newExchange(Transmitter.java:169)
2026-08-26T17:38:38.8304934Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ConnectInterceptor.intercept(ConnectInterceptor.java:41)
2026-08-26T17:38:38.8305197Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:38:38.8305477Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:38:38.8305723Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.cache.CacheInterceptor.intercept(CacheInterceptor.java:94)
2026-08-26T17:38:38.8306014Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:38:38.8306254Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:38:38.8306493Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.BridgeInterceptor.intercept(BridgeInterceptor.java:93)
2026-08-26T17:38:38.8307635Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RetryAndFollowUpInterceptor.intercept(RetryAndFollowUpInterceptor.java:88)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.getResponseWithInterceptorChain(RealCall.java:221)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.execute(RealCall.java:81)
2026-08-26T17:38:38.8308474Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:38:38.8308733Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RetryAndFollowUpInterceptor.intercept(RetryAndFollowUpInterceptor.java:88)
2026-08-26T17:38:38.8308989Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:38:38.8309239Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:38:38.8309484Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.getResponseWithInterceptorChain(RealCall.java:221)
2026-08-26T17:38:38.8309708Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.execute(RealCall.java:81)
2026-08-26T17:38:38.8310089Z ##[error]at org.sonarsource.scanner.api.internal.ServerConnection.callUrl(ServerConnection.java:115)
2026-08-26T17:38:38.8310445Z 	at org.sonarsource.scanner.api.internal.ServerConnection.callUrl(ServerConnection.java:115)
2026-08-26T17:38:38.8310959Z ##[error]at org.sonarsource.scanner.api.internal.ServerConnection.downloadString(ServerConnection.java:99)
	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:39)
	... 10 more
2026-08-26T17:38:38.8311393Z 	at org.sonarsource.scanner.api.internal.ServerConnection.downloadString(ServerConnection.java:99)
2026-08-26T17:38:38.8311624Z 	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:39)
2026-08-26T17:38:38.8311788Z 	... 10 more
2026-08-26T17:38:38.8312188Z ##[error]Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:38:38.8312618Z Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:38:38.8313104Z ##[error]at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:385)
	at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:290)
2026-08-26T17:38:38.8313499Z 	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:385)
2026-08-26T17:38:38.8313817Z 	at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:290)
2026-08-26T17:38:38.8314186Z ##[error]at java.base/sun.security.validator.Validator.validate(Validator.java:264)
2026-08-26T17:38:38.8314518Z 	at java.base/sun.security.validator.Validator.validate(Validator.java:264)
2026-08-26T17:38:38.8315004Z ##[error]at java.base/sun.security.ssl.X509TrustManagerImpl.validate(X509TrustManagerImpl.java:321)
2026-08-26T17:38:38.8315368Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.validate(X509TrustManagerImpl.java:321)
2026-08-26T17:38:38.8315879Z ##[error]at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:221)
	at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:129)
2026-08-26T17:38:38.8316324Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:221)
2026-08-26T17:38:38.8316544Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:129)
2026-08-26T17:38:38.8317010Z ##[error]at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1313)
2026-08-26T17:38:38.8317407Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1313)
2026-08-26T17:38:38.8317692Z ##[error]... 43 more
2026-08-26T17:38:38.8317948Z 	... 43 more
2026-08-26T17:38:38.8318271Z ##[error]Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:38:38.8318631Z Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:38:38.8319234Z ##[error]at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:141)
	at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:126)
	at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
2026-08-26T17:38:38.8319713Z 	at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:141)
2026-08-26T17:38:38.8319934Z 	at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:126)
2026-08-26T17:38:38.8320137Z 	at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
2026-08-26T17:38:38.8320479Z ##[error]at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:380)
2026-08-26T17:38:38.8320819Z 	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:380)
2026-08-26T17:38:38.8321085Z ##[error]... 49 more
2026-08-26T17:38:38.8321325Z 	... 49 more
2026-08-26T17:38:38.8466657Z Process returned exit code 1
2026-08-26T17:38:38.8510101Z ##[error]The SonarScanner did not complete successfully
2026-08-26T17:38:38.8510575Z The SonarScanner did not complete successfully
2026-08-26T17:38:38.8511936Z ##[error]14:38:38.851  Post-processing failed. Exit code: 1
2026-08-26T17:38:38.8512568Z 14:38:38.851  Post-processing failed. Exit code: 1
2026-08-26T17:38:38.8597495Z ##[error]The process '/opt/ads-agent/cache-tools/.dotnet//dotnet' failed with exit code 1
2026-08-26T17:38:38.8629640Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 3 out of 10) after 9000 ms
2026-08-26T17:38:47.9666122Z [command]/opt/ads-agent/cache-tools/.dotnet//dotnet /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/SonarScanner.MSBuild.dll end
2026-08-26T17:38:48.0143606Z SonarScanner for MSBuild 5.8
2026-08-26T17:38:48.0144201Z Using the .NET Core version of the Scanner for MSBuild
2026-08-26T17:38:48.0525970Z Post-processing started.
2026-08-26T17:38:48.1211626Z 14:38:48.12  14:38:48.102  /opt/ads-agent/_work/6/.sonarqube/bin/targets/SonarQube.Integration.targets does not exist
2026-08-26T17:38:48.1212005Z 14:38:48.12  14:38:48.12  sonar.verbose=true was specified - setting the log verbosity to 'Debug'
2026-08-26T17:38:48.1212331Z 14:38:48.121  Loading the SonarQube analysis config from /opt/ads-agent/_work/6/.sonarqube/conf/SonarQubeAnalysisConfig.xml
2026-08-26T17:38:48.1212520Z 14:38:48.121  Not running under TeamBuild
2026-08-26T17:38:48.1213049Z 14:38:48.121  Analysis base directory: /opt/ads-agent/_work/6/.sonarqube
2026-08-26T17:38:48.1213197Z Build directory: 
2026-08-26T17:38:48.1213382Z Bin directory: /opt/ads-agent/_work/6/.sonarqube/bin
2026-08-26T17:38:48.1213586Z Config directory: /opt/ads-agent/_work/6/.sonarqube/conf
2026-08-26T17:38:48.1213961Z Output directory: /opt/ads-agent/_work/6/.sonarqube/out
2026-08-26T17:38:48.1214197Z Config file: /opt/ads-agent/_work/6/.sonarqube/conf/SonarQubeAnalysisConfig.xml
2026-08-26T17:38:48.1224301Z 14:38:48.122  Generating SonarQube project properties file to /opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties
2026-08-26T17:38:48.1389976Z 14:38:48.138  Setting analysis property: sonar.visualstudio.enable=false
2026-08-26T17:38:48.1565111Z 14:38:48.156  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/0/Issues.json
2026-08-26T17:38:48.1599836Z 14:38:48.159  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/1/Issues.json
2026-08-26T17:38:48.1631068Z 14:38:48.162  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/2/Issues.json
2026-08-26T17:38:48.1733006Z 14:38:48.173  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/3/Issues.json
2026-08-26T17:38:48.1762686Z 14:38:48.176  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/4/Issues.json
2026-08-26T17:38:48.1792636Z 14:38:48.179  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/5/Issues.json
2026-08-26T17:38:48.1804880Z 14:38:48.18  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/6/Issues.json
2026-08-26T17:38:48.1814942Z 14:38:48.181  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/7/Issues.json
2026-08-26T17:38:48.1914222Z 14:38:48.191  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/8/Issues.json
2026-08-26T17:38:48.2009830Z 14:38:48.2  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/9/Issues.json
2026-08-26T17:38:48.2038606Z 14:38:48.203  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/10/Issues.json
2026-08-26T17:38:48.2172543Z 14:38:48.216  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/11/Issues.json
2026-08-26T17:38:48.2195583Z 14:38:48.219  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/12/Issues.json
2026-08-26T17:38:48.2220644Z 14:38:48.221  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/13/Issues.json
2026-08-26T17:38:48.2230131Z 14:38:48.222  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/14/Issues.json
2026-08-26T17:38:48.2308906Z 14:38:48.23  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/15/Issues.json
2026-08-26T17:38:48.2331254Z 14:38:48.232  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/16/Issues.json
2026-08-26T17:38:48.2355851Z 14:38:48.235  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/17/Issues.json
2026-08-26T17:38:48.2364566Z 14:38:48.236  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/18/Issues.json
2026-08-26T17:38:48.2372719Z 14:38:48.237  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/19/Issues.json
2026-08-26T17:38:48.2376372Z 14:38:48.237  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/20/Issues.json
2026-08-26T17:38:48.2454513Z 14:38:48.245  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/21/Issues.json
2026-08-26T17:38:48.2477651Z 14:38:48.247  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/22/Issues.json
2026-08-26T17:38:48.2509977Z 14:38:48.25  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/23/Issues.json
2026-08-26T17:38:48.2519139Z 14:38:48.251  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/24/Issues.json
2026-08-26T17:38:48.2526926Z 14:38:48.252  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/25/Issues.json
2026-08-26T17:38:48.2530397Z 14:38:48.252  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/26/Issues.json
2026-08-26T17:38:48.2634663Z 14:38:48.263  Using longest common projects path as a base directory: '/opt/ads-agent/_work/6/s'.
2026-08-26T17:38:48.2730562Z 14:38:48.272  File was referenced by the following projects: '/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/TesteSimovBatch.csproj', '/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/TesteSimovBatch.csproj'.
2026-08-26T17:38:48.2830396Z 14:38:48.277  Dumping content of sonar-project.properties
2026-08-26T17:38:48.2830678Z ------------------------------------------------------------------------
2026-08-26T17:38:48.2830908Z sonar.projectKey=SIMOV-imoveiscaixa-batch
2026-08-26T17:38:48.2831124Z sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar
2026-08-26T17:38:48.2831323Z sonar.projectBaseDir=/opt/ads-agent/_work/6/s
2026-08-26T17:38:48.2831394Z 
2026-08-26T17:38:48.2831659Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectKey=SIMOV-imoveiscaixa-batch:0B395246-F58A-479C-B0B1-C6A6045C6FD3
2026-08-26T17:38:48.2831930Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectName=Simov.Core
2026-08-26T17:38:48.2832193Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:38:48.2832433Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.sourceEncoding=utf-8
2026-08-26T17:38:48.2832646Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.sources=\
2026-08-26T17:38:48.2832921Z "/opt/ads-agent/_work/6/s/src/Simov.Core/AutenticacaoSso/AutenticacarSso.cs",\
2026-08-26T17:38:48.2833146Z "/opt/ads-agent/_work/6/s/src/Simov.Core/AutenticacaoSso/IAutenticacarSso.cs",\
2026-08-26T17:38:48.2833357Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Data/IBaseRepository.cs",\
2026-08-26T17:38:48.2833558Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Data/IUnitOfWork.cs",\
2026-08-26T17:38:48.2833886Z "/opt/ads-agent/_work/6/s/src/Simov.Core/DomainObjects/Entity.cs",\
2026-08-26T17:38:48.2834104Z "/opt/ads-agent/_work/6/s/src/Simov.Core/DomainObjects/IAggregateRoot.cs",\
2026-08-26T17:38:48.2834329Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/ApplicationException.cs",\
2026-08-26T17:38:48.2834551Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/CancellationException.cs",\
2026-08-26T17:38:48.2834782Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/EntityValidationException.cs",\
2026-08-26T17:38:48.2835001Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/GenericException.cs",\
2026-08-26T17:38:48.2835479Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/NotFoundException.cs",\
2026-08-26T17:38:48.2835706Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/ProcessamentoException.cs",\
2026-08-26T17:38:48.2835937Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/RelatedAggregateException.cs",\
2026-08-26T17:38:48.2836162Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/UnauthorizedException.cs",\
2026-08-26T17:38:48.2836378Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Logging/LoggerExtensions.cs",\
2026-08-26T17:38:48.2836600Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siico/ApiSiicoRestPrivado.cs",\
2026-08-26T17:38:48.2836892Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siico/ApiSiicoRestPublico.cs",\
2026-08-26T17:38:48.2837208Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siiso/ApiSiisoRestPublico.cs",\
2026-08-26T17:38:48.2837424Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/DadosDto.cs",\
2026-08-26T17:38:48.2837647Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/DadosSimilDto.cs",\
2026-08-26T17:38:48.2837869Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/FotosDto.cs",\
2026-08-26T17:38:48.2838088Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/ListaFotoDto.cs",\
2026-08-26T17:38:48.2838300Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/ISOAPWeb.cs",\
2026-08-26T17:38:48.2838524Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/RobustSoapDeserializer.cs",\
2026-08-26T17:38:48.2838737Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/SOAPWeb.cs",\
2026-08-26T17:38:48.2838949Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/ResponseGenerico.cs",\
2026-08-26T17:38:48.2839172Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/BairroDetalhadoSiico.cs",\
2026-08-26T17:38:48.2839387Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/BairroSiico.cs",\
2026-08-26T17:38:48.2839595Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/CepSiico.cs",\
2026-08-26T17:38:48.2839809Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/LocalidadeSiico.cs",\
2026-08-26T17:38:48.2840031Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioCompletoSiico.cs",\
2026-08-26T17:38:48.2840260Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioParcialSiico.cs",\
2026-08-26T17:38:48.2840479Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioSiico.cs",\
2026-08-26T17:38:48.2840699Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/TipoLogradouroSiico.cs",\
2026-08-26T17:38:48.2840918Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/UnidadeCaixa.cs",\
2026-08-26T17:38:48.2841143Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/UnidadeFederacaoSiico.cs",\
2026-08-26T17:38:48.2841369Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/EnderecoPessoaSiiso.cs",\
2026-08-26T17:38:48.2841596Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/LocalidadeNascimentoSiiso.cs",\
2026-08-26T17:38:48.2841815Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/PessoaSiiso.cs",\
2026-08-26T17:38:48.2842041Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siico/IApiSiicoRestPrivado.cs",\
2026-08-26T17:38:48.2842279Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siico/IApiSiicoRestPublico.cs",\
2026-08-26T17:38:48.2842513Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siiso/IApiSiisoRestPublico.cs"
2026-08-26T17:38:48.2842598Z 
2026-08-26T17:38:48.2842794Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:48.2842997Z "/opt/ads-agent/_work/6/.sonarqube/out/0"
2026-08-26T17:38:48.2843207Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:48.2843412Z "/opt/ads-agent/_work/6/.sonarqube/out/0/Issues.json"
2026-08-26T17:38:48.2843473Z 
2026-08-26T17:38:48.2843776Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod0
2026-08-26T17:38:48.2844143Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectKey=SIMOV-imoveiscaixa-batch:5E55366D-25CB-4B0F-BAF4-738003A18ED2
2026-08-26T17:38:48.2844407Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectName=Simov.Domain
2026-08-26T17:38:48.2844671Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:38:48.2844904Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.sourceEncoding=utf-8
2026-08-26T17:38:48.2845115Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.sources=\
2026-08-26T17:38:48.2845335Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AgrupamentoVendaImovel.cs",\
2026-08-26T17:38:48.2845556Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaArquivoLote.cs",\
2026-08-26T17:38:48.2845859Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaFotoImovel.cs",\
2026-08-26T17:38:48.2846130Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaFotoLote.cs",\
2026-08-26T17:38:48.2846346Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaUsuario.cs",\
2026-08-26T17:38:48.2846562Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AvaliacaoImovel.cs",\
2026-08-26T17:38:48.2846777Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/ComodoImovel.cs",\
2026-08-26T17:38:48.2846996Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/ControleProcessamento.cs",\
2026-08-26T17:38:48.2847212Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/DadoContabil.cs",\
2026-08-26T17:38:48.2847422Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/FotoImovel.cs",\
2026-08-26T17:38:48.2847645Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoAgrupamentoVendaImovel.cs",\
2026-08-26T17:38:48.2847878Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoAvaliacaoImovel.cs",\
2026-08-26T17:38:48.2848099Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoComodoImovel.cs",\
2026-08-26T17:38:48.2848327Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoDadoContabil.cs",\
2026-08-26T17:38:48.2848547Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoImovel.cs",\
2026-08-26T17:38:48.2848767Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoMatriculaImovel.cs",\
2026-08-26T17:38:48.2848977Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/Imovel.cs",\
2026-08-26T17:38:48.2849188Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/MatriculaImovel.cs",\
2026-08-26T17:38:48.2849412Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/MensagemControleProcessamento.cs",\
2026-08-26T17:38:48.2849635Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/RotinaProcessamento.cs",\
2026-08-26T17:38:48.2849869Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/ClassificacaoImovelEnum.cs",\
2026-08-26T17:38:48.2850111Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/EstadoConservacaoEnum.cs",\
2026-08-26T17:38:48.2850344Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/FuncionalidadeSistemaEnum.cs",\
2026-08-26T17:38:48.2850572Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/IcAcaoSistemaEnum.cs",\
2026-08-26T17:38:48.2850805Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/IcShortEnum.cs",\
2026-08-26T17:38:48.2851294Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/MotivoExclusaoEnum.cs",\
2026-08-26T17:38:48.2851597Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/OrgaoProprietarioImovelEnum.cs",\
2026-08-26T17:38:48.2851831Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/OrigemImovelEnum.cs",\
2026-08-26T17:38:48.2852104Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/ResultadoMensagemProcessamentoEnum.cs",\
2026-08-26T17:38:48.2852333Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/RotinaProcessamentoEnum.cs",\
2026-08-26T17:38:48.2852547Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/SituacaoImovelEnum.cs",\
2026-08-26T17:38:48.2852772Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/SituacaoProcessamentoEnum.cs",\
2026-08-26T17:38:48.2852989Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoCampoEnum.cs",\
2026-08-26T17:38:48.2853202Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoComodoEnum.cs",\
2026-08-26T17:38:48.2853461Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoImovelEnum.cs",\
2026-08-26T17:38:48.2853740Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoMatriculaEnum.cs",\
2026-08-26T17:38:48.2853986Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAgrupamentoVendaImovelRepository.cs",\
2026-08-26T17:38:48.2854227Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaArquivoLoteRepository.cs",\
2026-08-26T17:38:48.2854483Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaFotoImovelRepository.cs",\
2026-08-26T17:38:48.2854727Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaFotoLoteRepository.cs",\
2026-08-26T17:38:48.2855024Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaUsuarioRepository.cs",\
2026-08-26T17:38:48.2855270Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAvaliacaoImovelRepository.cs",\
2026-08-26T17:38:48.2855551Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IComodoImovelRepository.cs",\
2026-08-26T17:38:48.2855925Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IControleProcessamentoRepository.cs",\
2026-08-26T17:38:48.2856168Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IDadoContabilRepository.cs",\
2026-08-26T17:38:48.2856418Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IFotoImovelRepository.cs",\
2026-08-26T17:38:48.2856664Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IGeradorHistorico.cs",\
2026-08-26T17:38:48.2856899Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IImovelRepository.cs",\
2026-08-26T17:38:48.2857125Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IMatriculaImovelRepository.cs",\
2026-08-26T17:38:48.2857370Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IMensagemControleProcessamentoRepository.cs",\
2026-08-26T17:38:48.2857615Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IRotinaProcessamentoRepository.cs",\
2026-08-26T17:38:48.2857838Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/BaseArquivoLayout.cs",\
2026-08-26T17:38:48.2858053Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/SiaciLayout.cs",\
2026-08-26T17:38:48.2858260Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/SiopiLayout.cs"
2026-08-26T17:38:48.2858332Z 
2026-08-26T17:38:48.2858530Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:48.2858719Z "/opt/ads-agent/_work/6/.sonarqube/out/1"
2026-08-26T17:38:48.2858943Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:48.2859158Z "/opt/ads-agent/_work/6/.sonarqube/out/1/Issues.json"
2026-08-26T17:38:48.2859218Z 
2026-08-26T17:38:48.2859467Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod1
2026-08-26T17:38:48.2859786Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectKey=SIMOV-imoveiscaixa-batch:0847F1F3-B5DA-4FC3-8EEF-882D75A674FD
2026-08-26T17:38:48.2860068Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectName=Simov.Application
2026-08-26T17:38:48.2860332Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:38:48.2860566Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.sourceEncoding=utf-8
2026-08-26T17:38:48.2860771Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.sources=\
2026-08-26T17:38:48.2860995Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Contexts/FileProcessingContext.cs",\
2026-08-26T17:38:48.2861226Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Contexts/SiicoCallCounterContext.cs",\
2026-08-26T17:38:48.2861451Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/AvaliacaoImovelDto.cs",\
2026-08-26T17:38:48.2861669Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/DadoContabilDto.cs",\
2026-08-26T17:38:48.2861881Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/EnderecoDto.cs",\
2026-08-26T17:38:48.2862085Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/ImovelDto.cs",\
2026-08-26T17:38:48.2862299Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/MatriculaImovelDto.cs",\
2026-08-26T17:38:48.2862554Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/MunicipioDto.cs",\
2026-08-26T17:38:48.2862764Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/SiaciDDQDto.cs",\
2026-08-26T17:38:48.2862979Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/TipoLogradouroDto.cs",\
2026-08-26T17:38:48.2863206Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ICargaFotoImovelService.cs",\
2026-08-26T17:38:48.2863440Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ICargaImovelService.cs",\
2026-08-26T17:38:48.2863725Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IFileService.cs",\
2026-08-26T17:38:48.2864000Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSiaciUseCase.cs",\
2026-08-26T17:38:48.2864230Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSimilFotoUseCase.cs",\
2026-08-26T17:38:48.2864457Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSimilUseCase.cs",\
2026-08-26T17:38:48.2864684Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSiopiUseCase.cs",\
2026-08-26T17:38:48.2864905Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ILeituraService.cs",\
2026-08-26T17:38:48.2865134Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ILogProcessamentoService.cs",\
2026-08-26T17:38:48.2865363Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IMapperDataService.cs",\
2026-08-26T17:38:48.2865586Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ISiaciDDQUseCase.cs",\
2026-08-26T17:38:48.2865812Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IWorkerImovelService.cs",\
2026-08-26T17:38:48.2866050Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/CargaImovelService.cs",\
2026-08-26T17:38:48.2866282Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/FileService.cs",\
2026-08-26T17:38:48.2866497Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/LeituraService.cs",\
2026-08-26T17:38:48.2866727Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/LogProcessamentoService.cs",\
2026-08-26T17:38:48.2866959Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/MapperDataService.cs",\
2026-08-26T17:38:48.2867205Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/WorkerImovelService.cs",\
2026-08-26T17:38:48.2867441Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSiaciUseCase.cs",\
2026-08-26T17:38:48.2867669Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSimilFotoUseCase.cs",\
2026-08-26T17:38:48.2867889Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSimilUseCase.cs",\
2026-08-26T17:38:48.2868113Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSiopiUseCase.cs",\
2026-08-26T17:38:48.2868328Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/SiaciDDQUseCase.cs"
2026-08-26T17:38:48.2868398Z 
2026-08-26T17:38:48.2868592Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:48.2868841Z "/opt/ads-agent/_work/6/.sonarqube/out/2"
2026-08-26T17:38:48.2869120Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:48.2869389Z "/opt/ads-agent/_work/6/.sonarqube/out/2/Issues.json"
2026-08-26T17:38:48.2869449Z 
2026-08-26T17:38:48.2869676Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod2
2026-08-26T17:38:48.2869977Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectKey=SIMOV-imoveiscaixa-batch:D745E52F-7A66-4C38-B30D-3A27EA75CCCE
2026-08-26T17:38:48.2870233Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectName=Simov.Core
2026-08-26T17:38:48.2870477Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:38:48.2870702Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.sourceEncoding=utf-8
2026-08-26T17:38:48.2870905Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.sources=\
2026-08-26T17:38:48.2870978Z 
2026-08-26T17:38:48.2871065Z 
2026-08-26T17:38:48.2871258Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:48.2871448Z "/opt/ads-agent/_work/6/.sonarqube/out/3"
2026-08-26T17:38:48.2871660Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:48.2871857Z "/opt/ads-agent/_work/6/.sonarqube/out/3/Issues.json"
2026-08-26T17:38:48.2871928Z 
2026-08-26T17:38:48.2872146Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod3
2026-08-26T17:38:48.2872443Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectKey=SIMOV-imoveiscaixa-batch:FBCB055E-203B-4979-BB94-B02AE276DE0B
2026-08-26T17:38:48.2872729Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectName=Simov.Domain
2026-08-26T17:38:48.2872975Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:38:48.2873209Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.sourceEncoding=utf-8
2026-08-26T17:38:48.2873415Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.sources=\
2026-08-26T17:38:48.2873485Z 
2026-08-26T17:38:48.2873519Z 
2026-08-26T17:38:48.2873771Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:48.2873977Z "/opt/ads-agent/_work/6/.sonarqube/out/4"
2026-08-26T17:38:48.2874186Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:48.2874392Z "/opt/ads-agent/_work/6/.sonarqube/out/4/Issues.json"
2026-08-26T17:38:48.2874459Z 
2026-08-26T17:38:48.2874679Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod4
2026-08-26T17:38:48.2875051Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectKey=SIMOV-imoveiscaixa-batch:D6E1F89D-8BFA-426E-BC94-C1182DBD0621
2026-08-26T17:38:48.2875398Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectName=Simov.Application
2026-08-26T17:38:48.2875663Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:38:48.2875955Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.sourceEncoding=utf-8
2026-08-26T17:38:48.2876177Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.sources=\
2026-08-26T17:38:48.2876242Z 
2026-08-26T17:38:48.2876284Z 
2026-08-26T17:38:48.2876473Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:48.2876665Z "/opt/ads-agent/_work/6/.sonarqube/out/5"
2026-08-26T17:38:48.2876868Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:48.2877069Z "/opt/ads-agent/_work/6/.sonarqube/out/5/Issues.json"
2026-08-26T17:38:48.2877127Z 
2026-08-26T17:38:48.2877348Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod5
2026-08-26T17:38:48.2877649Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectKey=SIMOV-imoveiscaixa-batch:AD78E470-A67C-4901-A53F-E3D7D40350CD
2026-08-26T17:38:48.2877922Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:38:48.2878186Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:38:48.2878423Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.sourceEncoding=utf-8
2026-08-26T17:38:48.2878630Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.sources=\
2026-08-26T17:38:48.2878849Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Common/BaseRepository.cs",\
2026-08-26T17:38:48.2879073Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Common/UnitOfWork.cs",\
2026-08-26T17:38:48.2879308Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Interceptor/HistoricosInterceptor.cs",\
2026-08-26T17:38:48.2879555Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AgrupamentoVendaImovelConfiguration.cs",\
2026-08-26T17:38:48.2879809Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaArquivoLoteConfiguration.cs",\
2026-08-26T17:38:48.2880061Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaFotoImovelConfiguration.cs",\
2026-08-26T17:38:48.2880370Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaFotoLoteConfiguration.cs",\
2026-08-26T17:38:48.2880619Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaUsuarioConfiguration.cs",\
2026-08-26T17:38:48.2880865Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AvaliacaoImovelConfiguration.cs",\
2026-08-26T17:38:48.2881102Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ComodoImovelConfiguration.cs",\
2026-08-26T17:38:48.2881352Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ControleProcessamentoConfiguration.cs",\
2026-08-26T17:38:48.2881592Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/DadoContabilConfiguration.cs",\
2026-08-26T17:38:48.2881870Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/FotoImovelConfiguration.cs",\
2026-08-26T17:38:48.2882125Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoAgrupamentoVendaImovelConfiguration.cs",\
2026-08-26T17:38:48.2882387Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoAvaliacaoImovelConfiguration.cs",\
2026-08-26T17:38:48.2882639Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoComodoImovelConfiguration.cs",\
2026-08-26T17:38:48.2882887Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoDadoContabilConfiguration.cs",\
2026-08-26T17:38:48.2883125Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoImovelConfiguration.cs",\
2026-08-26T17:38:48.2883371Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoMatriculaImovelConfiguration.cs",\
2026-08-26T17:38:48.2883608Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ImovelConfiguration.cs",\
2026-08-26T17:38:48.2883920Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/MatriculaImovelConfiguration.cs",\
2026-08-26T17:38:48.2884174Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/MensagemControleProcessamentoConfiguration.cs",\
2026-08-26T17:38:48.2884433Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/RotinaProcessamentoConfiguration.cs",\
2026-08-26T17:38:48.2884682Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AgrupamentoVendaImovelRepository.cs",\
2026-08-26T17:38:48.2884932Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaArquivoLoteRepository.cs",\
2026-08-26T17:38:48.2885178Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaFotoImovelRepository.cs",\
2026-08-26T17:38:48.2885614Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaFotoLoteRepository.cs",\
2026-08-26T17:38:48.2885862Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaUsuarioRepository.cs",\
2026-08-26T17:38:48.2886107Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AvaliacaoImovelRepository.cs",\
2026-08-26T17:38:48.2886344Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ComodoImovelRepository.cs",\
2026-08-26T17:38:48.2886587Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ControleProcessamentoRepository.cs",\
2026-08-26T17:38:48.2886829Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/DadoContabilRepository.cs",\
2026-08-26T17:38:48.2887066Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/FotoImovelRepository.cs",\
2026-08-26T17:38:48.2887297Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ImovelRepository.cs",\
2026-08-26T17:38:48.2887543Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/MatriculaImovelRepository.cs",\
2026-08-26T17:38:48.2887799Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/MensagemControleProcessamentoRepository.cs",\
2026-08-26T17:38:48.2888054Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/RotinaProcessamentoRepository.cs",\
2026-08-26T17:38:48.2888282Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/SimovDbContext.cs"
2026-08-26T17:38:48.2888350Z 
2026-08-26T17:38:48.2888542Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:48.2888794Z "/opt/ads-agent/_work/6/.sonarqube/out/6"
2026-08-26T17:38:48.2889000Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:48.2889198Z "/opt/ads-agent/_work/6/.sonarqube/out/6/Issues.json"
2026-08-26T17:38:48.2889267Z 
2026-08-26T17:38:48.2889486Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod6
2026-08-26T17:38:48.2889788Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectKey=SIMOV-imoveiscaixa-batch:B904AD47-4763-413C-9324-7889FD92EFA6
2026-08-26T17:38:48.2890042Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectName=Simov.Batch
2026-08-26T17:38:48.2890331Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:38:48.2890559Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.sourceEncoding=utf-8
2026-08-26T17:38:48.2890764Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.sources=\
2026-08-26T17:38:48.2890986Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/AddHeadersHttpClient.cs",\
2026-08-26T17:38:48.2891220Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/ConnectionsConfiguration.cs",\
2026-08-26T17:38:48.2891448Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/HttpClientConfiguration.cs",\
2026-08-26T17:38:48.2891674Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/IApiSiisoRestPrivado.cs",\
2026-08-26T17:38:48.2891909Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/UseCasesConfiguration.cs",\
2026-08-26T17:38:48.2892127Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderImoveisSiaci.cs",\
2026-08-26T17:38:48.2892343Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderImoveisSiopi.cs",\
2026-08-26T17:38:48.2892561Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderLeilaoSiaciDDQ.cs",\
2026-08-26T17:38:48.2892761Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Program.cs",\
2026-08-26T17:38:48.2892972Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Workers/WorkerFotoImoveisSimil.cs",\
2026-08-26T17:38:48.2893187Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Workers/WorkerImoveisSimil.cs",\
2026-08-26T17:38:48.2893419Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/Simov.Batch.GlobalUsings.g.cs",\
2026-08-26T17:38:48.2893727Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/.NETCoreApp,Version=v8.0.AssemblyAttributes.cs",\
2026-08-26T17:38:48.2893995Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/Simov.Batch.AssemblyInfo.cs",\
2026-08-26T17:38:48.2894222Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/appsettings.Development.json",\
2026-08-26T17:38:48.2894427Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/appsettings.json",\
2026-08-26T17:38:48.2894639Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Properties/launchSettings.json",\
2026-08-26T17:38:48.2894849Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/apphost"
2026-08-26T17:38:48.2894922Z 
2026-08-26T17:38:48.2895113Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:48.2895309Z "/opt/ads-agent/_work/6/.sonarqube/out/7"
2026-08-26T17:38:48.2895515Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:48.2895714Z "/opt/ads-agent/_work/6/.sonarqube/out/7/Issues.json"
2026-08-26T17:38:48.2895773Z 
2026-08-26T17:38:48.2895993Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod7
2026-08-26T17:38:48.2896299Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectKey=SIMOV-imoveiscaixa-batch:6679F22B-144A-4C59-A28C-2A87F31E3915
2026-08-26T17:38:48.2896570Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectName=Simov.Core
2026-08-26T17:38:48.2896821Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:38:48.2897053Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.sourceEncoding=utf-8
2026-08-26T17:38:48.2897262Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.sources=\
2026-08-26T17:38:48.2897328Z 
2026-08-26T17:38:48.2897430Z 
2026-08-26T17:38:48.2897620Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:48.2897810Z "/opt/ads-agent/_work/6/.sonarqube/out/8"
2026-08-26T17:38:48.2898016Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:48.2898214Z "/opt/ads-agent/_work/6/.sonarqube/out/8/Issues.json"
2026-08-26T17:38:48.2898272Z 
2026-08-26T17:38:48.2898495Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod8
2026-08-26T17:38:48.2898803Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectKey=SIMOV-imoveiscaixa-batch:EC78B0BC-170C-482C-867B-C5402B449403
2026-08-26T17:38:48.2899092Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectName=Simov.Core
2026-08-26T17:38:48.2899342Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:38:48.2899574Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.sourceEncoding=utf-8
2026-08-26T17:38:48.2899789Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.sources=\
2026-08-26T17:38:48.2899853Z 
2026-08-26T17:38:48.2899886Z 
2026-08-26T17:38:48.2900074Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:48.2900264Z "/opt/ads-agent/_work/6/.sonarqube/out/9"
2026-08-26T17:38:48.2900468Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:48.2900671Z "/opt/ads-agent/_work/6/.sonarqube/out/9/Issues.json"
2026-08-26T17:38:48.2900741Z 
2026-08-26T17:38:48.2900961Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod9
2026-08-26T17:38:48.2901260Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectKey=SIMOV-imoveiscaixa-batch:1B2C05E0-E98F-477C-931D-923BBE79AE4E
2026-08-26T17:38:48.2901517Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectName=Simov.Domain
2026-08-26T17:38:48.2901762Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:38:48.2901992Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.sourceEncoding=utf-8
2026-08-26T17:38:48.2902197Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.sources=\
2026-08-26T17:38:48.2902268Z 
2026-08-26T17:38:48.2902302Z 
2026-08-26T17:38:48.2902489Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:48.2902680Z "/opt/ads-agent/_work/6/.sonarqube/out/10"
2026-08-26T17:38:48.2902883Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:48.2903085Z "/opt/ads-agent/_work/6/.sonarqube/out/10/Issues.json"
2026-08-26T17:38:48.2903152Z 
2026-08-26T17:38:48.2903373Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod10
2026-08-26T17:38:48.2903738Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectKey=SIMOV-imoveiscaixa-batch:A180ED2D-1521-44A6-B6EA-5DDEC55D2C17
2026-08-26T17:38:48.2904022Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectName=Simov.Core
2026-08-26T17:38:48.2904276Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:38:48.2904509Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.sourceEncoding=utf-8
2026-08-26T17:38:48.2904716Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.sources=\
2026-08-26T17:38:48.2904779Z 
2026-08-26T17:38:48.2904824Z 
2026-08-26T17:38:48.2905016Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:48.2905205Z "/opt/ads-agent/_work/6/.sonarqube/out/11"
2026-08-26T17:38:48.2905413Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:48.2905627Z "/opt/ads-agent/_work/6/.sonarqube/out/11/Issues.json"
2026-08-26T17:38:48.2905691Z 
2026-08-26T17:38:48.2905987Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod11
2026-08-26T17:38:48.2906322Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectKey=SIMOV-imoveiscaixa-batch:A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E
2026-08-26T17:38:48.2906629Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectName=Simov.Domain
2026-08-26T17:38:48.2906875Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:38:48.2907098Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.sourceEncoding=utf-8
2026-08-26T17:38:48.2907302Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.sources=\
2026-08-26T17:38:48.2907365Z 
2026-08-26T17:38:48.2907407Z 
2026-08-26T17:38:48.2907593Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:48.2907782Z "/opt/ads-agent/_work/6/.sonarqube/out/12"
2026-08-26T17:38:48.2907988Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:48.2908224Z "/opt/ads-agent/_work/6/.sonarqube/out/12/Issues.json"
2026-08-26T17:38:48.2908286Z 
2026-08-26T17:38:48.2908508Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod12
2026-08-26T17:38:48.2908813Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectKey=SIMOV-imoveiscaixa-batch:00300450-28FA-4EA9-8A96-181ED44DCA26
2026-08-26T17:38:48.2909078Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectName=Simov.Application
2026-08-26T17:38:48.2909342Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:38:48.2909584Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.sourceEncoding=utf-8
2026-08-26T17:38:48.2909792Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.sources=\
2026-08-26T17:38:48.2909857Z 
2026-08-26T17:38:48.2909891Z 
2026-08-26T17:38:48.2910081Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:48.2910275Z "/opt/ads-agent/_work/6/.sonarqube/out/13"
2026-08-26T17:38:48.2910605Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:48.2910820Z "/opt/ads-agent/_work/6/.sonarqube/out/13/Issues.json"
2026-08-26T17:38:48.2910882Z 
2026-08-26T17:38:48.2911106Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod13
2026-08-26T17:38:48.2911410Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectKey=SIMOV-imoveiscaixa-batch:1393E257-1007-43DE-B94C-0B0508C0B309
2026-08-26T17:38:48.2911676Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:38:48.2911935Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:38:48.2912171Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.sourceEncoding=utf-8
2026-08-26T17:38:48.2912374Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.sources=\
2026-08-26T17:38:48.2912446Z 
2026-08-26T17:38:48.2912481Z 
2026-08-26T17:38:48.2912676Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:48.2912869Z "/opt/ads-agent/_work/6/.sonarqube/out/14"
2026-08-26T17:38:48.2913076Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:48.2913278Z "/opt/ads-agent/_work/6/.sonarqube/out/14/Issues.json"
2026-08-26T17:38:48.2913347Z 
2026-08-26T17:38:48.2913569Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod14
2026-08-26T17:38:48.2914004Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectKey=SIMOV-imoveiscaixa-batch:5BE00443-BD63-4C9F-A707-406F2AC94762
2026-08-26T17:38:48.2914260Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectName=Simov.Core
2026-08-26T17:38:48.2914506Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:38:48.2914736Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.sourceEncoding=utf-8
2026-08-26T17:38:48.2914941Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.sources=\
2026-08-26T17:38:48.2915017Z 
2026-08-26T17:38:48.2915052Z 
2026-08-26T17:38:48.2915239Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:48.2915430Z "/opt/ads-agent/_work/6/.sonarqube/out/15"
2026-08-26T17:38:48.2915640Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:48.2915892Z "/opt/ads-agent/_work/6/.sonarqube/out/15/Issues.json"
2026-08-26T17:38:48.2915954Z 
2026-08-26T17:38:48.2916172Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod15
2026-08-26T17:38:48.2916478Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectKey=SIMOV-imoveiscaixa-batch:A79CA783-37A2-49D3-B56C-D9102F046AF9
2026-08-26T17:38:48.2916735Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectName=Simov.Domain
2026-08-26T17:38:48.2916985Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:38:48.2917252Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.sourceEncoding=utf-8
2026-08-26T17:38:48.2917454Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.sources=\
2026-08-26T17:38:48.2917514Z 
2026-08-26T17:38:48.2917556Z 
2026-08-26T17:38:48.2917747Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:48.2917941Z "/opt/ads-agent/_work/6/.sonarqube/out/16"
2026-08-26T17:38:48.2918146Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:48.2918345Z "/opt/ads-agent/_work/6/.sonarqube/out/16/Issues.json"
2026-08-26T17:38:48.2918404Z 
2026-08-26T17:38:48.2918628Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod16
2026-08-26T17:38:48.2918931Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectKey=SIMOV-imoveiscaixa-batch:51ABFD24-E14F-4155-B9D7-CDBD0E536AAB
2026-08-26T17:38:48.2919193Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectName=Simov.Application
2026-08-26T17:38:48.2919450Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:38:48.2919699Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.sourceEncoding=utf-8
2026-08-26T17:38:48.2919908Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.sources=\
2026-08-26T17:38:48.2919975Z 
2026-08-26T17:38:48.2920012Z 
2026-08-26T17:38:48.2920200Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:48.2920395Z "/opt/ads-agent/_work/6/.sonarqube/out/17"
2026-08-26T17:38:48.2920609Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:48.2920812Z "/opt/ads-agent/_work/6/.sonarqube/out/17/Issues.json"
2026-08-26T17:38:48.2920873Z 
2026-08-26T17:38:48.2921096Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod17
2026-08-26T17:38:48.2921399Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectKey=SIMOV-imoveiscaixa-batch:F2842708-9CF5-4649-B3A8-6D39E5E01B77
2026-08-26T17:38:48.2921663Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:38:48.2921920Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:38:48.2922154Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.sourceEncoding=utf-8
2026-08-26T17:38:48.2922357Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.sources=\
2026-08-26T17:38:48.2922428Z 
2026-08-26T17:38:48.2922463Z 
2026-08-26T17:38:48.2922651Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:48.2922844Z "/opt/ads-agent/_work/6/.sonarqube/out/18"
2026-08-26T17:38:48.2923045Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:48.2923247Z "/opt/ads-agent/_work/6/.sonarqube/out/18/Issues.json"
2026-08-26T17:38:48.2923313Z 
2026-08-26T17:38:48.2923531Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod18
2026-08-26T17:38:48.2923951Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectKey=SIMOV-imoveiscaixa-batch:3C101C3B-D8C0-461B-B65B-B87A6F75F210
2026-08-26T17:38:48.2924215Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectName=Simov.Batch
2026-08-26T17:38:48.2924466Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:38:48.2924755Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.sourceEncoding=utf-8
2026-08-26T17:38:48.2924964Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.sources=\
2026-08-26T17:38:48.2925039Z 
2026-08-26T17:38:48.2925074Z 
2026-08-26T17:38:48.2925260Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:48.2925454Z "/opt/ads-agent/_work/6/.sonarqube/out/19"
2026-08-26T17:38:48.2925660Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:48.2925868Z "/opt/ads-agent/_work/6/.sonarqube/out/19/Issues.json"
2026-08-26T17:38:48.2925938Z 
2026-08-26T17:38:48.2926161Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod19
2026-08-26T17:38:48.2926511Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectKey=SIMOV-imoveiscaixa-batch:4E341BE0-BD46-427C-8912-6319C41C89BC
2026-08-26T17:38:48.2926772Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectName=TesteSimovBatch
2026-08-26T17:38:48.2927041Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/tests/TesteSimovBatch
2026-08-26T17:38:48.2927278Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.sourceEncoding=utf-8
2026-08-26T17:38:48.2927485Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.sources=
2026-08-26T17:38:48.2927687Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.tests=\
2026-08-26T17:38:48.2927922Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/AvaliacaoImovelDtoTests.cs",\
2026-08-26T17:38:48.2928169Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/DadoContabilDtoTests.cs",\
2026-08-26T17:38:48.2928410Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/ImovelDtoTests.cs",\
2026-08-26T17:38:48.2928660Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/MatriculaImovelDtoTests.cs",\
2026-08-26T17:38:48.2928909Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/CargaImovelServiceTests.cs",\
2026-08-26T17:38:48.2929156Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/FileServiceTests.cs",\
2026-08-26T17:38:48.2929413Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/LeituraSiaciServiceTests.cs",\
2026-08-26T17:38:48.2929678Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/LogProcessamentoServiceTests.cs",\
2026-08-26T17:38:48.2929929Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/MapperDataServiceTests.cs",\
2026-08-26T17:38:48.2930178Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/WorkerImovelServiceTests.cs",\
2026-08-26T17:38:48.2930442Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSiaciPreCadastroUseCaseTests.cs",\
2026-08-26T17:38:48.2930704Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSimilFotoUseCaseTests.cs",\
2026-08-26T17:38:48.2930949Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSimilUseCaseTests.cs",\
2026-08-26T17:38:48.2931209Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSiopiUseCaseTests.cs",\
2026-08-26T17:38:48.2931459Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/SiaciDDQUseCaseTests.cs",\
2026-08-26T17:38:48.2931704Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Batch/LoaderImoveisSiopiTests.cs",\
2026-08-26T17:38:48.2931927Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/CargaImoveisSiaciTests.cs",\
2026-08-26T17:38:48.2932161Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Configuration/AddHeadersHttpClientTests.cs",\
2026-08-26T17:38:48.2932408Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Configuration/ConnectionsConfigurationTest.cs",\
2026-08-26T17:38:48.2932664Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Contexts/FileProcessingContextTests.cs",\
2026-08-26T17:38:48.2932901Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Contexts/SiicoCallCounterContextTests.cs",\
2026-08-26T17:38:48.2933137Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/DomainObjects/EntityTests.cs",\
2026-08-26T17:38:48.2933412Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/DomainObjects/IAggregateRootTests.cs",\
2026-08-26T17:38:48.2933704Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/CancellationExceptionTests.cs",\
2026-08-26T17:38:48.2933974Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/EntityValidationExceptionTests.cs",\
2026-08-26T17:38:48.2934224Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/GenericExceptionTests.cs",\
2026-08-26T17:38:48.2934462Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/NotFoundExceptionTests.cs",\
2026-08-26T17:38:48.2934704Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/ProcessamentoExceptionTests.cs",\
2026-08-26T17:38:48.2935123Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/RelatedAggregateExceptionTests.cs",\
2026-08-26T17:38:48.2935373Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/UnauthorizedExceptionTests.cs",\
2026-08-26T17:38:48.2935624Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siico/ApiSiicoRestPrivadoTests.cs",\
2026-08-26T17:38:48.2935868Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siico/ApiSiicoRestPublicoTests.cs",\
2026-08-26T17:38:48.2936123Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siiso/ApiSiisoRestPublicoTests.cs",\
2026-08-26T17:38:48.2936352Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/AutenticacarSsoTests.cs",\
2026-08-26T17:38:48.2936596Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/BairroDetalhadoSiicoTests.cs",\
2026-08-26T17:38:48.2936827Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/BairroSiicoTests.cs",\
2026-08-26T17:38:48.2937065Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/MunicipioCompletoSiicoTests.cs",\
2026-08-26T17:38:48.2937303Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/ResponseGenericoTests.cs",\
2026-08-26T17:38:48.2937542Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/Siico/CepSiicoTests.cs",\
2026-08-26T17:38:48.2937778Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Domain/Layouts/BaseArquivoLayoutTests.cs",\
2026-08-26T17:38:48.2938015Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/AgrupamentoVendaImovelTests.cs",\
2026-08-26T17:38:48.2938256Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/AvaliacaoImovelSiopiTests.cs",\
2026-08-26T17:38:48.2938487Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/ControleProcessamentoTests.cs",\
2026-08-26T17:38:48.2938718Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/DadoContabilTests.cs",\
2026-08-26T17:38:48.2938965Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoAgrupamentoVendaImovelTests.cs",\
2026-08-26T17:38:48.2939216Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoDadoContabilTests.cs",\
2026-08-26T17:38:48.2939448Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoImovelTests.cs",\
2026-08-26T17:38:48.2939674Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/ImovelTests.cs",\
2026-08-26T17:38:48.2939904Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/MatriculaImovelSiopiTests.cs",\
2026-08-26T17:38:48.2940147Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/MensagemControleProcessamentoTests.cs",\
2026-08-26T17:38:48.2940382Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/RotinaProcessamentoTests.cs",\
2026-08-26T17:38:48.2940607Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/SiopiImovelTests.cs",\
2026-08-26T17:38:48.2940827Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ArquivoSiaciFake.cs",\
2026-08-26T17:38:48.2941045Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ImovelDtoFake.cs",\
2026-08-26T17:38:48.2941263Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ImovelFake.cs",\
2026-08-26T17:38:48.2941487Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/LayoutArquivoFake.cs",\
2026-08-26T17:38:48.2941766Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/Siico/ResponsesFake.cs",\
2026-08-26T17:38:48.2942014Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/InfraDataEF/HistoricosInterceptorTests.cs",\
2026-08-26T17:38:48.2942267Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/InfraDataEF/SimovDbContextTests.cs",\
2026-08-26T17:38:48.2942502Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Layouts/SiaciLayoutTests.cs"
2026-08-26T17:38:48.2942573Z 
2026-08-26T17:38:48.2942769Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:48.2942975Z "/opt/ads-agent/_work/6/.sonarqube/out/20"
2026-08-26T17:38:48.2943187Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:48.2943423Z "/opt/ads-agent/_work/6/.sonarqube/out/20/Issues.json"
2026-08-26T17:38:48.2943492Z 
2026-08-26T17:38:48.2943790Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod20
2026-08-26T17:38:48.2944119Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectKey=SIMOV-imoveiscaixa-batch:0DC13198-1AC4-46C6-B9B3-E2987B8496D5
2026-08-26T17:38:48.2944392Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectName=Simov.Core
2026-08-26T17:38:48.2944641Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:38:48.2944875Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.sourceEncoding=utf-8
2026-08-26T17:38:48.2945087Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.sources=\
2026-08-26T17:38:48.2945149Z 
2026-08-26T17:38:48.2945192Z 
2026-08-26T17:38:48.2945386Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:48.2945583Z "/opt/ads-agent/_work/6/.sonarqube/out/21"
2026-08-26T17:38:48.2945794Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:48.2946107Z "/opt/ads-agent/_work/6/.sonarqube/out/21/Issues.json"
2026-08-26T17:38:48.2946170Z 
2026-08-26T17:38:48.2946393Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod21
2026-08-26T17:38:48.2946762Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectKey=SIMOV-imoveiscaixa-batch:BA15777F-9613-49A5-8C5F-8CBFA5F86619
2026-08-26T17:38:48.2947130Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectName=Simov.Domain
2026-08-26T17:38:48.2947500Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:38:48.2947860Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.sourceEncoding=utf-8
2026-08-26T17:38:48.2948081Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.sources=\
2026-08-26T17:38:48.2948148Z 
2026-08-26T17:38:48.2948184Z 
2026-08-26T17:38:48.2948377Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:48.2948579Z "/opt/ads-agent/_work/6/.sonarqube/out/22"
2026-08-26T17:38:48.2948788Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:48.2948994Z "/opt/ads-agent/_work/6/.sonarqube/out/22/Issues.json"
2026-08-26T17:38:48.2949060Z 
2026-08-26T17:38:48.2949285Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod22
2026-08-26T17:38:48.2949592Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectKey=SIMOV-imoveiscaixa-batch:48A485AE-9F33-C9A7-979C-54916B65C32E
2026-08-26T17:38:48.2949854Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectName=Simov.Application
2026-08-26T17:38:48.2950111Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:38:48.2950345Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.sourceEncoding=utf-8
2026-08-26T17:38:48.2950561Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.sources=\
2026-08-26T17:38:48.2950638Z 
2026-08-26T17:38:48.2950675Z 
2026-08-26T17:38:48.2950893Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:48.2951218Z "/opt/ads-agent/_work/6/.sonarqube/out/23"
2026-08-26T17:38:48.2951487Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:48.2951793Z "/opt/ads-agent/_work/6/.sonarqube/out/23/Issues.json"
2026-08-26T17:38:48.2951866Z 
2026-08-26T17:38:48.2952098Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod23
2026-08-26T17:38:48.2952414Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectKey=SIMOV-imoveiscaixa-batch:309346D6-2461-4973-A29B-7A38A756C0DE
2026-08-26T17:38:48.2952692Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:38:48.2952972Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:38:48.2953274Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.sourceEncoding=utf-8
2026-08-26T17:38:48.2953486Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.sources=\
2026-08-26T17:38:48.2953561Z 
2026-08-26T17:38:48.2953597Z 
2026-08-26T17:38:48.2953930Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:48.2954132Z "/opt/ads-agent/_work/6/.sonarqube/out/24"
2026-08-26T17:38:48.2954343Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:48.2954542Z "/opt/ads-agent/_work/6/.sonarqube/out/24/Issues.json"
2026-08-26T17:38:48.2954612Z 
2026-08-26T17:38:48.2954838Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod24
2026-08-26T17:38:48.2955141Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectKey=SIMOV-imoveiscaixa-batch:4BF20498-1845-4781-82CB-E7783C0081FA
2026-08-26T17:38:48.2955402Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectName=Simov.Batch
2026-08-26T17:38:48.2955656Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:38:48.2955884Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.sourceEncoding=utf-8
2026-08-26T17:38:48.2956089Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.sources=\
2026-08-26T17:38:48.2956161Z 
2026-08-26T17:38:48.2956233Z 
2026-08-26T17:38:48.2956449Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:48.2956644Z "/opt/ads-agent/_work/6/.sonarqube/out/25"
2026-08-26T17:38:48.2956849Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:48.2957051Z "/opt/ads-agent/_work/6/.sonarqube/out/25/Issues.json"
2026-08-26T17:38:48.2957110Z 
2026-08-26T17:38:48.2957335Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod25
2026-08-26T17:38:48.2957636Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectKey=SIMOV-imoveiscaixa-batch:D54F14FF-8EEB-4EB8-994B-69D77DDB78FD
2026-08-26T17:38:48.2957905Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectName=TesteSimovBatch
2026-08-26T17:38:48.2958166Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/tests/TesteSimovBatch
2026-08-26T17:38:48.2958513Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.sourceEncoding=utf-8
2026-08-26T17:38:48.2958820Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.sources=
2026-08-26T17:38:48.2959101Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.tests=\
2026-08-26T17:38:48.2959184Z 
2026-08-26T17:38:48.2959241Z 
2026-08-26T17:38:48.2959507Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:38:48.2959781Z "/opt/ads-agent/_work/6/.sonarqube/out/26"
2026-08-26T17:38:48.2960074Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:38:48.2960364Z "/opt/ads-agent/_work/6/.sonarqube/out/26/Issues.json"
2026-08-26T17:38:48.2960454Z 
2026-08-26T17:38:48.2960776Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod26
2026-08-26T17:38:48.2961040Z sonar.host.url=https://sonar.apps.produtos4.caixa/
2026-08-26T17:38:48.2961236Z sonar.projectKey=SIMOV-imoveiscaixa-batch
2026-08-26T17:38:48.2961415Z sonar.projectName=SIMOV-imoveiscaixa-batch
2026-08-26T17:38:48.2961590Z sonar.projectVersion=1.0-SNAPSHOT
2026-08-26T17:38:48.2961818Z sonar.branch.name=CorrecoesSonar
2026-08-26T17:38:48.2962086Z sonar.scanner.metadataFilePath=/opt/ads-agent/_work/_temp/sonar/1.0-SNAPSHOT/f442c3b3-ec53-840d-3dab-bba3c4de61f5/report-task.txt
2026-08-26T17:38:48.2962363Z sonar.cs.opencover.reportsPaths=/opt/ads-agent/_work/_temp/**/coverage.opencover.xml
2026-08-26T17:38:48.2962585Z sonar.cs.vstest.reportsPaths=/opt/ads-agent/_work/_temp/**/*.trx
2026-08-26T17:38:48.2962725Z sonar.visualstudio.enable=false
2026-08-26T17:38:48.2962777Z 
2026-08-26T17:38:48.2964424Z sonar.modules=0B395246-F58A-479C-B0B1-C6A6045C6FD3,5E55366D-25CB-4B0F-BAF4-738003A18ED2,0847F1F3-B5DA-4FC3-8EEF-882D75A674FD,D745E52F-7A66-4C38-B30D-3A27EA75CCCE,FBCB055E-203B-4979-BB94-B02AE276DE0B,D6E1F89D-8BFA-426E-BC94-C1182DBD0621,AD78E470-A67C-4901-A53F-E3D7D40350CD,B904AD47-4763-413C-9324-7889FD92EFA6,6679F22B-144A-4C59-A28C-2A87F31E3915,EC78B0BC-170C-482C-867B-C5402B449403,1B2C05E0-E98F-477C-931D-923BBE79AE4E,A180ED2D-1521-44A6-B6EA-5DDEC55D2C17,A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E,00300450-28FA-4EA9-8A96-181ED44DCA26,1393E257-1007-43DE-B94C-0B0508C0B309,5BE00443-BD63-4C9F-A707-406F2AC94762,A79CA783-37A2-49D3-B56C-D9102F046AF9,51ABFD24-E14F-4155-B9D7-CDBD0E536AAB,F2842708-9CF5-4649-B3A8-6D39E5E01B77,3C101C3B-D8C0-461B-B65B-B87A6F75F210,4E341BE0-BD46-427C-8912-6319C41C89BC,0DC13198-1AC4-46C6-B9B3-E2987B8496D5,BA15777F-9613-49A5-8C5F-8CBFA5F86619,48A485AE-9F33-C9A7-979C-54916B65C32E,309346D6-2461-4973-A29B-7A38A756C0DE,4BF20498-1845-4781-82CB-E7783C0081FA,D54F14FF-8EEB-4EB8-994B-69D77DDB78FD
2026-08-26T17:38:48.2965070Z 
2026-08-26T17:38:48.2965115Z 
2026-08-26T17:38:48.2965335Z ------------------------------------------------------------------------
2026-08-26T17:38:48.2965592Z 14:38:48.285  Writing processing summary to /opt/ads-agent/_work/6/.sonarqube/out/ProjectInfo.log
2026-08-26T17:38:48.2965780Z The SONAR_SCANNER_HOME environment variable is not required and will be ignored.
2026-08-26T17:38:48.2965926Z Calling the SonarScanner CLI...
2026-08-26T17:38:48.2966277Z Executing file /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/sonar-scanner-4.7.0.2747/bin/sonar-scanner
2026-08-26T17:38:48.2966643Z   Args: -Dsonar.scanAllFiles=true -Dproject.settings=/opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties --from=ScannerMSBuild/5.8 --debug <sensitive data removed>
2026-08-26T17:38:48.2966884Z   Working directory: /opt/ads-agent/_work/6
2026-08-26T17:38:48.2967011Z   Timeout (ms):-1
2026-08-26T17:38:48.2967127Z   Process id: 26249
2026-08-26T17:38:48.4091340Z 14:38:48.405 INFO: Scanner configuration file: /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/sonar-scanner-4.7.0.2747/conf/sonar-scanner.properties
2026-08-26T17:38:48.4091812Z 14:38:48.407 INFO: Project root configuration file: /opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties
2026-08-26T17:38:48.4367147Z 14:38:48.436 INFO: SonarScanner 4.7.0.2747
2026-08-26T17:38:48.4367666Z 14:38:48.436 INFO: Java 11 Oracle Corporation (64-bit)
2026-08-26T17:38:48.4367903Z 14:38:48.436 INFO: Linux 5.18.5-100.fc35.x86_64 amd64
2026-08-26T17:38:48.5172125Z 14:38:48.516 DEBUG: keyStore is : 
2026-08-26T17:38:48.5172371Z 14:38:48.516 DEBUG: keyStore type is : pkcs12
2026-08-26T17:38:48.5172536Z 14:38:48.516 DEBUG: keyStore provider is : 
2026-08-26T17:38:48.5172681Z 14:38:48.516 DEBUG: init keystore
2026-08-26T17:38:48.5172828Z 14:38:48.516 DEBUG: init keymanager of type SunX509
2026-08-26T17:38:48.5836812Z 14:38:48.582 DEBUG: Create: /opt/ads-agent/cache-tools/.sonar/cache
2026-08-26T17:38:48.5837567Z 14:38:48.583 INFO: User cache: /opt/ads-agent/cache-tools/.sonar/cache
2026-08-26T17:38:48.5838911Z 14:38:48.583 DEBUG: Create: /opt/ads-agent/cache-tools/.sonar/cache/_tmp
2026-08-26T17:38:48.5855527Z 14:38:48.585 DEBUG: Extract sonar-scanner-api-batch in temp...
2026-08-26T17:38:48.5874184Z 14:38:48.587 DEBUG: Get bootstrap index...
2026-08-26T17:38:48.5874954Z 14:38:48.587 DEBUG: Download: https://sonar.apps.produtos4.caixa/batch/index
2026-08-26T17:38:48.6719568Z ##[error]14:38:48.670 ERROR: SonarQube server [https://sonar.apps.produtos4.caixa] can not be reached
2026-08-26T17:38:48.6720166Z 14:38:48.670 ERROR: SonarQube server [https://sonar.apps.produtos4.caixa] can not be reached
2026-08-26T17:38:48.6720724Z 14:38:48.670 INFO: ------------------------------------------------------------------------
2026-08-26T17:38:48.6720896Z 14:38:48.670 INFO: EXECUTION FAILURE
2026-08-26T17:38:48.6721130Z 14:38:48.670 INFO: ------------------------------------------------------------------------
2026-08-26T17:38:48.6721294Z 14:38:48.670 INFO: Total time: 0.286s
2026-08-26T17:38:48.6833360Z 14:38:48.682 INFO: Final Memory: 4M/68M
2026-08-26T17:38:48.6833961Z 14:38:48.682 INFO: ------------------------------------------------------------------------
2026-08-26T17:38:48.6834685Z ##[error]14:38:48.682 ERROR: Error during SonarScanner execution
org.sonarsource.scanner.api.internal.ScannerException: Unable to execute SonarScanner analysis
2026-08-26T17:38:48.6835243Z 14:38:48.682 ERROR: Error during SonarScanner execution
2026-08-26T17:38:48.6835422Z org.sonarsource.scanner.api.internal.ScannerException: Unable to execute SonarScanner analysis
2026-08-26T17:38:48.6835835Z ##[error]at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:85)
2026-08-26T17:38:48.6836238Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:85)
2026-08-26T17:38:48.6837167Z ##[error]at java.base/java.security.AccessController.doPrivileged(Native Method)
	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:74)
	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:70)
	at org.sonarsource.scanner.api.EmbeddedScanner.doStart(EmbeddedScanner.java:185)
	at org.sonarsource.scanner.api.EmbeddedScanner.start(EmbeddedScanner.java:123)
	at org.sonarsource.scanner.cli.Main.execute(Main.java:73)
	at org.sonarsource.scanner.cli.Main.main(Main.java:61)
2026-08-26T17:38:48.6837842Z 	at java.base/java.security.AccessController.doPrivileged(Native Method)
2026-08-26T17:38:48.6838057Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:74)
2026-08-26T17:38:48.6838289Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:70)
2026-08-26T17:38:48.6838500Z 	at org.sonarsource.scanner.api.EmbeddedScanner.doStart(EmbeddedScanner.java:185)
2026-08-26T17:38:48.6838693Z 	at org.sonarsource.scanner.api.EmbeddedScanner.start(EmbeddedScanner.java:123)
2026-08-26T17:38:48.6838875Z 	at org.sonarsource.scanner.cli.Main.execute(Main.java:73)
2026-08-26T17:38:48.6839044Z 	at org.sonarsource.scanner.cli.Main.main(Main.java:61)
2026-08-26T17:38:48.6839546Z ##[error]Caused by: java.lang.IllegalStateException: Fail to get bootstrap index from server
	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:42)
2026-08-26T17:38:48.6839977Z Caused by: java.lang.IllegalStateException: Fail to get bootstrap index from server
2026-08-26T17:38:48.6840179Z 	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:42)
2026-08-26T17:38:48.6840586Z ##[error]at org.sonarsource.scanner.api.internal.JarDownloader.getScannerEngineFiles(JarDownloader.java:58)
2026-08-26T17:38:48.6840953Z 	at org.sonarsource.scanner.api.internal.JarDownloader.getScannerEngineFiles(JarDownloader.java:58)
2026-08-26T17:38:48.6841515Z ##[error]at org.sonarsource.scanner.api.internal.JarDownloader.download(JarDownloader.java:53)
	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:76)
2026-08-26T17:38:48.6841941Z 	at org.sonarsource.scanner.api.internal.JarDownloader.download(JarDownloader.java:53)
2026-08-26T17:38:48.6842585Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:76)
2026-08-26T17:38:48.6842900Z ##[error]... 7 more
2026-08-26T17:38:48.6843148Z 	... 7 more
2026-08-26T17:38:48.6843607Z ##[error]Caused by: javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:128)
2026-08-26T17:38:48.6844186Z Caused by: javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:38:48.6844492Z 	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:128)
2026-08-26T17:38:48.6845050Z ##[error]at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:264)
	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:259)
2026-08-26T17:38:48.6845502Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
2026-08-26T17:38:48.6845697Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:264)
2026-08-26T17:38:48.6845898Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:259)
2026-08-26T17:38:48.6846589Z ##[error]at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1329)
	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.onConsumeCertificate(CertificateMessage.java:1204)
	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.consume(CertificateMessage.java:1151)
2026-08-26T17:38:48.6847286Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1329)
2026-08-26T17:38:48.6847640Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.onConsumeCertificate(CertificateMessage.java:1204)
2026-08-26T17:38:48.6847927Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.consume(CertificateMessage.java:1151)
2026-08-26T17:38:48.6848366Z ##[error]at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:392)
2026-08-26T17:38:48.6848707Z 	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:392)
2026-08-26T17:38:48.6849612Z ##[error]at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:444)
	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:421)
	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:178)
	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:164)
	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1152)
	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1063)
	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:402)
2026-08-26T17:38:48.6850262Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:444)
2026-08-26T17:38:48.6850455Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:421)
2026-08-26T17:38:48.6850643Z 	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:178)
2026-08-26T17:38:48.6850862Z 	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:164)
2026-08-26T17:38:48.6851154Z 	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1152)
2026-08-26T17:38:48.6851385Z 	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1063)
2026-08-26T17:38:48.6851589Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:402)
2026-08-26T17:38:48.6852006Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connectTls(RealConnection.java:336)
2026-08-26T17:38:48.6852518Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connectTls(RealConnection.java:336)
2026-08-26T17:38:48.6853247Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.establishProtocol(RealConnection.java:300)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connect(RealConnection.java:185)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findConnection(ExchangeFinder.java:224)
2026-08-26T17:38:48.6853881Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.establishProtocol(RealConnection.java:300)
2026-08-26T17:38:48.6854184Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connect(RealConnection.java:185)
2026-08-26T17:38:48.6854427Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findConnection(ExchangeFinder.java:224)
2026-08-26T17:38:48.6855014Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findHealthyConnection(ExchangeFinder.java:108)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.find(ExchangeFinder.java:88)
2026-08-26T17:38:48.6855508Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findHealthyConnection(ExchangeFinder.java:108)
2026-08-26T17:38:48.6855753Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.find(ExchangeFinder.java:88)
2026-08-26T17:38:48.6856396Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.Transmitter.newExchange(Transmitter.java:169)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ConnectInterceptor.intercept(ConnectInterceptor.java:41)
2026-08-26T17:38:48.6856882Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.Transmitter.newExchange(Transmitter.java:169)
2026-08-26T17:38:48.6857131Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ConnectInterceptor.intercept(ConnectInterceptor.java:41)
2026-08-26T17:38:48.6857566Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:38:48.6857952Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:38:48.6858514Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.cache.CacheInterceptor.intercept(CacheInterceptor.java:94)
2026-08-26T17:38:48.6858991Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:38:48.6859232Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.cache.CacheInterceptor.intercept(CacheInterceptor.java:94)
2026-08-26T17:38:48.6859665Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:38:48.6860056Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:38:48.6860623Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.BridgeInterceptor.intercept(BridgeInterceptor.java:93)
2026-08-26T17:38:48.6861087Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:38:48.6861330Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.BridgeInterceptor.intercept(BridgeInterceptor.java:93)
2026-08-26T17:38:48.6861799Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:38:48.6862177Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:38:48.6862617Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RetryAndFollowUpInterceptor.intercept(RetryAndFollowUpInterceptor.java:88)
2026-08-26T17:38:48.6863019Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RetryAndFollowUpInterceptor.intercept(RetryAndFollowUpInterceptor.java:88)
2026-08-26T17:38:48.6863727Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:38:48.6864223Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:38:48.6864471Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:38:48.6864901Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.getResponseWithInterceptorChain(RealCall.java:221)
2026-08-26T17:38:48.6865479Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.getResponseWithInterceptorChain(RealCall.java:221)
2026-08-26T17:38:48.6865975Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.execute(RealCall.java:81)
	at org.sonarsource.scanner.api.internal.ServerConnection.callUrl(ServerConnection.java:115)
2026-08-26T17:38:48.6866381Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.execute(RealCall.java:81)
2026-08-26T17:38:48.6866588Z 	at org.sonarsource.scanner.api.internal.ServerConnection.callUrl(ServerConnection.java:115)
2026-08-26T17:38:48.6866966Z ##[error]at org.sonarsource.scanner.api.internal.ServerConnection.downloadString(ServerConnection.java:99)
2026-08-26T17:38:48.6867321Z 	at org.sonarsource.scanner.api.internal.ServerConnection.downloadString(ServerConnection.java:99)
2026-08-26T17:38:48.6867713Z ##[error]at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:39)
	... 10 more
2026-08-26T17:38:48.6868101Z 	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:39)
2026-08-26T17:38:48.6868264Z 	... 10 more
2026-08-26T17:38:48.6868640Z ##[error]Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:38:48.6869066Z Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:38:48.6869643Z ##[error]at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:385)
	at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:290)
	at java.base/sun.security.validator.Validator.validate(Validator.java:264)
2026-08-26T17:38:48.6870072Z 	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:385)
2026-08-26T17:38:48.6870268Z 	at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:290)
2026-08-26T17:38:48.6870463Z 	at java.base/sun.security.validator.Validator.validate(Validator.java:264)
2026-08-26T17:38:48.6870943Z ##[error]at java.base/sun.security.ssl.X509TrustManagerImpl.validate(X509TrustManagerImpl.java:321)
	at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:221)
2026-08-26T17:38:48.6871357Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.validate(X509TrustManagerImpl.java:321)
2026-08-26T17:38:48.6871628Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:221)
2026-08-26T17:38:48.6872184Z ##[error]at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:129)
	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1313)
	... 43 more
2026-08-26T17:38:48.6872652Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:129)
2026-08-26T17:38:48.6872887Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1313)
2026-08-26T17:38:48.6873063Z 	... 43 more
2026-08-26T17:38:48.6873417Z ##[error]Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:38:48.6873858Z Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:38:48.6874561Z ##[error]at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:141)
	at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:126)
	at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:380)
	... 49 more
2026-08-26T17:38:48.6875099Z 	at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:141)
2026-08-26T17:38:48.6875313Z 	at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:126)
2026-08-26T17:38:48.6875519Z 	at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
2026-08-26T17:38:48.6875713Z 	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:380)
2026-08-26T17:38:48.6875856Z 	... 49 more
2026-08-26T17:38:48.7018002Z Process returned exit code 1
2026-08-26T17:38:48.7046721Z ##[error]The SonarScanner did not complete successfully
2026-08-26T17:38:48.7047189Z The SonarScanner did not complete successfully
2026-08-26T17:38:48.7047505Z ##[error]14:38:48.704  Post-processing failed. Exit code: 1
2026-08-26T17:38:48.7048089Z 14:38:48.704  Post-processing failed. Exit code: 1
2026-08-26T17:38:48.7129005Z ##[error]The process '/opt/ads-agent/cache-tools/.dotnet//dotnet' failed with exit code 1
2026-08-26T17:38:48.7162381Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 4 out of 10) after 16000 ms
2026-08-26T17:39:04.8215840Z [command]/opt/ads-agent/cache-tools/.dotnet//dotnet /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/SonarScanner.MSBuild.dll end
2026-08-26T17:39:04.8675439Z SonarScanner for MSBuild 5.8
2026-08-26T17:39:04.8675925Z Using the .NET Core version of the Scanner for MSBuild
2026-08-26T17:39:04.9054143Z Post-processing started.
2026-08-26T17:39:04.9737128Z 14:39:04.973  14:39:04.954  /opt/ads-agent/_work/6/.sonarqube/bin/targets/SonarQube.Integration.targets does not exist
2026-08-26T17:39:04.9737785Z 14:39:04.973  14:39:04.973  sonar.verbose=true was specified - setting the log verbosity to 'Debug'
2026-08-26T17:39:04.9738104Z 14:39:04.973  Loading the SonarQube analysis config from /opt/ads-agent/_work/6/.sonarqube/conf/SonarQubeAnalysisConfig.xml
2026-08-26T17:39:04.9738285Z 14:39:04.973  Not running under TeamBuild
2026-08-26T17:39:04.9738503Z 14:39:04.973  Analysis base directory: /opt/ads-agent/_work/6/.sonarqube
2026-08-26T17:39:04.9738646Z Build directory: 
2026-08-26T17:39:04.9738874Z Bin directory: /opt/ads-agent/_work/6/.sonarqube/bin
2026-08-26T17:39:04.9739125Z Config directory: /opt/ads-agent/_work/6/.sonarqube/conf
2026-08-26T17:39:04.9739396Z Output directory: /opt/ads-agent/_work/6/.sonarqube/out
2026-08-26T17:39:04.9739752Z Config file: /opt/ads-agent/_work/6/.sonarqube/conf/SonarQubeAnalysisConfig.xml
2026-08-26T17:39:04.9749282Z 14:39:04.974  Generating SonarQube project properties file to /opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties
2026-08-26T17:39:04.9910647Z 14:39:04.99  Setting analysis property: sonar.visualstudio.enable=false
2026-08-26T17:39:05.0087649Z 14:39:05.008  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/0/Issues.json
2026-08-26T17:39:05.0122704Z 14:39:05.011  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/1/Issues.json
2026-08-26T17:39:05.0160212Z 14:39:05.015  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/2/Issues.json
2026-08-26T17:39:05.0287472Z 14:39:05.028  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/3/Issues.json
2026-08-26T17:39:05.0316096Z 14:39:05.031  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/4/Issues.json
2026-08-26T17:39:05.0346127Z 14:39:05.034  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/5/Issues.json
2026-08-26T17:39:05.0359158Z 14:39:05.035  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/6/Issues.json
2026-08-26T17:39:05.0369410Z 14:39:05.036  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/7/Issues.json
2026-08-26T17:39:05.0468700Z 14:39:05.046  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/8/Issues.json
2026-08-26T17:39:05.0565683Z 14:39:05.056  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/9/Issues.json
2026-08-26T17:39:05.0593929Z 14:39:05.059  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/10/Issues.json
2026-08-26T17:39:05.0729785Z 14:39:05.072  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/11/Issues.json
2026-08-26T17:39:05.0753999Z 14:39:05.075  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/12/Issues.json
2026-08-26T17:39:05.0778956Z 14:39:05.077  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/13/Issues.json
2026-08-26T17:39:05.0787269Z 14:39:05.078  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/14/Issues.json
2026-08-26T17:39:05.0866796Z 14:39:05.086  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/15/Issues.json
2026-08-26T17:39:05.0889330Z 14:39:05.088  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/16/Issues.json
2026-08-26T17:39:05.0913480Z 14:39:05.091  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/17/Issues.json
2026-08-26T17:39:05.0922308Z 14:39:05.092  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/18/Issues.json
2026-08-26T17:39:05.0930085Z 14:39:05.092  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/19/Issues.json
2026-08-26T17:39:05.0933492Z 14:39:05.093  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/20/Issues.json
2026-08-26T17:39:05.1010094Z 14:39:05.1  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/21/Issues.json
2026-08-26T17:39:05.1032663Z 14:39:05.103  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/22/Issues.json
2026-08-26T17:39:05.1056920Z 14:39:05.105  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/23/Issues.json
2026-08-26T17:39:05.1065958Z 14:39:05.106  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/24/Issues.json
2026-08-26T17:39:05.1073348Z 14:39:05.107  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/25/Issues.json
2026-08-26T17:39:05.1076746Z 14:39:05.107  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/26/Issues.json
2026-08-26T17:39:05.1178922Z 14:39:05.117  Using longest common projects path as a base directory: '/opt/ads-agent/_work/6/s'.
2026-08-26T17:39:05.1279994Z 14:39:05.127  File was referenced by the following projects: '/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/TesteSimovBatch.csproj', '/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/TesteSimovBatch.csproj'.
2026-08-26T17:39:05.1375454Z 14:39:05.132  Dumping content of sonar-project.properties
2026-08-26T17:39:05.1375736Z ------------------------------------------------------------------------
2026-08-26T17:39:05.1376021Z sonar.projectKey=SIMOV-imoveiscaixa-batch
2026-08-26T17:39:05.1376239Z sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar
2026-08-26T17:39:05.1376488Z sonar.projectBaseDir=/opt/ads-agent/_work/6/s
2026-08-26T17:39:05.1376596Z 
2026-08-26T17:39:05.1376895Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectKey=SIMOV-imoveiscaixa-batch:0B395246-F58A-479C-B0B1-C6A6045C6FD3
2026-08-26T17:39:05.1377163Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectName=Simov.Core
2026-08-26T17:39:05.1377425Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:39:05.1377663Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.sourceEncoding=utf-8
2026-08-26T17:39:05.1377873Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.sources=\
2026-08-26T17:39:05.1378097Z "/opt/ads-agent/_work/6/s/src/Simov.Core/AutenticacaoSso/AutenticacarSso.cs",\
2026-08-26T17:39:05.1378322Z "/opt/ads-agent/_work/6/s/src/Simov.Core/AutenticacaoSso/IAutenticacarSso.cs",\
2026-08-26T17:39:05.1378542Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Data/IBaseRepository.cs",\
2026-08-26T17:39:05.1378747Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Data/IUnitOfWork.cs",\
2026-08-26T17:39:05.1378950Z "/opt/ads-agent/_work/6/s/src/Simov.Core/DomainObjects/Entity.cs",\
2026-08-26T17:39:05.1379167Z "/opt/ads-agent/_work/6/s/src/Simov.Core/DomainObjects/IAggregateRoot.cs",\
2026-08-26T17:39:05.1379389Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/ApplicationException.cs",\
2026-08-26T17:39:05.1379613Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/CancellationException.cs",\
2026-08-26T17:39:05.1379840Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/EntityValidationException.cs",\
2026-08-26T17:39:05.1380060Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/GenericException.cs",\
2026-08-26T17:39:05.1380274Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/NotFoundException.cs",\
2026-08-26T17:39:05.1380497Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/ProcessamentoException.cs",\
2026-08-26T17:39:05.1380726Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/RelatedAggregateException.cs",\
2026-08-26T17:39:05.1380950Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/UnauthorizedException.cs",\
2026-08-26T17:39:05.1381165Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Logging/LoggerExtensions.cs",\
2026-08-26T17:39:05.1381599Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siico/ApiSiicoRestPrivado.cs",\
2026-08-26T17:39:05.1381823Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siico/ApiSiicoRestPublico.cs",\
2026-08-26T17:39:05.1382048Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siiso/ApiSiisoRestPublico.cs",\
2026-08-26T17:39:05.1382326Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/DadosDto.cs",\
2026-08-26T17:39:05.1382590Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/DadosSimilDto.cs",\
2026-08-26T17:39:05.1382801Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/FotosDto.cs",\
2026-08-26T17:39:05.1383078Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/ListaFotoDto.cs",\
2026-08-26T17:39:05.1383287Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/ISOAPWeb.cs",\
2026-08-26T17:39:05.1383517Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/RobustSoapDeserializer.cs",\
2026-08-26T17:39:05.1383929Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/SOAPWeb.cs",\
2026-08-26T17:39:05.1384146Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/ResponseGenerico.cs",\
2026-08-26T17:39:05.1384452Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/BairroDetalhadoSiico.cs",\
2026-08-26T17:39:05.1384675Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/BairroSiico.cs",\
2026-08-26T17:39:05.1384890Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/CepSiico.cs",\
2026-08-26T17:39:05.1385102Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/LocalidadeSiico.cs",\
2026-08-26T17:39:05.1385322Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioCompletoSiico.cs",\
2026-08-26T17:39:05.1385546Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioParcialSiico.cs",\
2026-08-26T17:39:05.1385763Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioSiico.cs",\
2026-08-26T17:39:05.1385984Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/TipoLogradouroSiico.cs",\
2026-08-26T17:39:05.1386204Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/UnidadeCaixa.cs",\
2026-08-26T17:39:05.1386428Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/UnidadeFederacaoSiico.cs",\
2026-08-26T17:39:05.1386652Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/EnderecoPessoaSiiso.cs",\
2026-08-26T17:39:05.1386889Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/LocalidadeNascimentoSiiso.cs",\
2026-08-26T17:39:05.1387109Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/PessoaSiiso.cs",\
2026-08-26T17:39:05.1387335Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siico/IApiSiicoRestPrivado.cs",\
2026-08-26T17:39:05.1387573Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siico/IApiSiicoRestPublico.cs",\
2026-08-26T17:39:05.1387811Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siiso/IApiSiisoRestPublico.cs"
2026-08-26T17:39:05.1387891Z 
2026-08-26T17:39:05.1388089Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:05.1388283Z "/opt/ads-agent/_work/6/.sonarqube/out/0"
2026-08-26T17:39:05.1388495Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:05.1388694Z "/opt/ads-agent/_work/6/.sonarqube/out/0/Issues.json"
2026-08-26T17:39:05.1388756Z 
2026-08-26T17:39:05.1388979Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod0
2026-08-26T17:39:05.1389291Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectKey=SIMOV-imoveiscaixa-batch:5E55366D-25CB-4B0F-BAF4-738003A18ED2
2026-08-26T17:39:05.1389549Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectName=Simov.Domain
2026-08-26T17:39:05.1389808Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:39:05.1390048Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.sourceEncoding=utf-8
2026-08-26T17:39:05.1390259Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.sources=\
2026-08-26T17:39:05.1390536Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AgrupamentoVendaImovel.cs",\
2026-08-26T17:39:05.1390761Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaArquivoLote.cs",\
2026-08-26T17:39:05.1390977Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaFotoImovel.cs",\
2026-08-26T17:39:05.1391204Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaFotoLote.cs",\
2026-08-26T17:39:05.1391419Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaUsuario.cs",\
2026-08-26T17:39:05.1391629Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AvaliacaoImovel.cs",\
2026-08-26T17:39:05.1391841Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/ComodoImovel.cs",\
2026-08-26T17:39:05.1392102Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/ControleProcessamento.cs",\
2026-08-26T17:39:05.1392397Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/DadoContabil.cs",\
2026-08-26T17:39:05.1392614Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/FotoImovel.cs",\
2026-08-26T17:39:05.1392849Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoAgrupamentoVendaImovel.cs",\
2026-08-26T17:39:05.1393206Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoAvaliacaoImovel.cs",\
2026-08-26T17:39:05.1393436Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoComodoImovel.cs",\
2026-08-26T17:39:05.1393776Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoDadoContabil.cs",\
2026-08-26T17:39:05.1394158Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoImovel.cs",\
2026-08-26T17:39:05.1394395Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoMatriculaImovel.cs",\
2026-08-26T17:39:05.1394612Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/Imovel.cs",\
2026-08-26T17:39:05.1394821Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/MatriculaImovel.cs",\
2026-08-26T17:39:05.1395060Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/MensagemControleProcessamento.cs",\
2026-08-26T17:39:05.1395286Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/RotinaProcessamento.cs",\
2026-08-26T17:39:05.1395505Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/ClassificacaoImovelEnum.cs",\
2026-08-26T17:39:05.1395743Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/EstadoConservacaoEnum.cs",\
2026-08-26T17:39:05.1395966Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/FuncionalidadeSistemaEnum.cs",\
2026-08-26T17:39:05.1396188Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/IcAcaoSistemaEnum.cs",\
2026-08-26T17:39:05.1396395Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/IcShortEnum.cs",\
2026-08-26T17:39:05.1396606Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/MotivoExclusaoEnum.cs",\
2026-08-26T17:39:05.1396829Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/OrgaoProprietarioImovelEnum.cs",\
2026-08-26T17:39:05.1397051Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/OrigemImovelEnum.cs",\
2026-08-26T17:39:05.1397278Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/ResultadoMensagemProcessamentoEnum.cs",\
2026-08-26T17:39:05.1397503Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/RotinaProcessamentoEnum.cs",\
2026-08-26T17:39:05.1397717Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/SituacaoImovelEnum.cs",\
2026-08-26T17:39:05.1397935Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/SituacaoProcessamentoEnum.cs",\
2026-08-26T17:39:05.1398144Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoCampoEnum.cs",\
2026-08-26T17:39:05.1398354Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoComodoEnum.cs",\
2026-08-26T17:39:05.1398562Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoImovelEnum.cs",\
2026-08-26T17:39:05.1398775Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoMatriculaEnum.cs",\
2026-08-26T17:39:05.1399005Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAgrupamentoVendaImovelRepository.cs",\
2026-08-26T17:39:05.1399248Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaArquivoLoteRepository.cs",\
2026-08-26T17:39:05.1399485Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaFotoImovelRepository.cs",\
2026-08-26T17:39:05.1399781Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaFotoLoteRepository.cs",\
2026-08-26T17:39:05.1400013Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaUsuarioRepository.cs",\
2026-08-26T17:39:05.1400251Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAvaliacaoImovelRepository.cs",\
2026-08-26T17:39:05.1400477Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IComodoImovelRepository.cs",\
2026-08-26T17:39:05.1400710Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IControleProcessamentoRepository.cs",\
2026-08-26T17:39:05.1400937Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IDadoContabilRepository.cs",\
2026-08-26T17:39:05.1401197Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IFotoImovelRepository.cs",\
2026-08-26T17:39:05.1401420Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IGeradorHistorico.cs",\
2026-08-26T17:39:05.1401640Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IImovelRepository.cs",\
2026-08-26T17:39:05.1401869Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IMatriculaImovelRepository.cs",\
2026-08-26T17:39:05.1402113Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IMensagemControleProcessamentoRepository.cs",\
2026-08-26T17:39:05.1402366Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IRotinaProcessamentoRepository.cs",\
2026-08-26T17:39:05.1402590Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/BaseArquivoLayout.cs",\
2026-08-26T17:39:05.1402803Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/SiaciLayout.cs",\
2026-08-26T17:39:05.1403009Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/SiopiLayout.cs"
2026-08-26T17:39:05.1403076Z 
2026-08-26T17:39:05.1403273Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:05.1403544Z "/opt/ads-agent/_work/6/.sonarqube/out/1"
2026-08-26T17:39:05.1403856Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:05.1404065Z "/opt/ads-agent/_work/6/.sonarqube/out/1/Issues.json"
2026-08-26T17:39:05.1404137Z 
2026-08-26T17:39:05.1404362Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod1
2026-08-26T17:39:05.1404673Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectKey=SIMOV-imoveiscaixa-batch:0847F1F3-B5DA-4FC3-8EEF-882D75A674FD
2026-08-26T17:39:05.1404941Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectName=Simov.Application
2026-08-26T17:39:05.1405196Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:39:05.1405431Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.sourceEncoding=utf-8
2026-08-26T17:39:05.1405635Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.sources=\
2026-08-26T17:39:05.1405855Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Contexts/FileProcessingContext.cs",\
2026-08-26T17:39:05.1406087Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Contexts/SiicoCallCounterContext.cs",\
2026-08-26T17:39:05.1406313Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/AvaliacaoImovelDto.cs",\
2026-08-26T17:39:05.1406530Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/DadoContabilDto.cs",\
2026-08-26T17:39:05.1406745Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/EnderecoDto.cs",\
2026-08-26T17:39:05.1406953Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/ImovelDto.cs",\
2026-08-26T17:39:05.1407178Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/MatriculaImovelDto.cs",\
2026-08-26T17:39:05.1407496Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/MunicipioDto.cs",\
2026-08-26T17:39:05.1407709Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/SiaciDDQDto.cs",\
2026-08-26T17:39:05.1407923Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/TipoLogradouroDto.cs",\
2026-08-26T17:39:05.1408149Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ICargaFotoImovelService.cs",\
2026-08-26T17:39:05.1408379Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ICargaImovelService.cs",\
2026-08-26T17:39:05.1408643Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IFileService.cs",\
2026-08-26T17:39:05.1408867Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSiaciUseCase.cs",\
2026-08-26T17:39:05.1409097Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSimilFotoUseCase.cs",\
2026-08-26T17:39:05.1409330Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSimilUseCase.cs",\
2026-08-26T17:39:05.1409558Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSiopiUseCase.cs",\
2026-08-26T17:39:05.1409780Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ILeituraService.cs",\
2026-08-26T17:39:05.1410046Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ILogProcessamentoService.cs",\
2026-08-26T17:39:05.1410277Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IMapperDataService.cs",\
2026-08-26T17:39:05.1410505Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ISiaciDDQUseCase.cs",\
2026-08-26T17:39:05.1410734Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IWorkerImovelService.cs",\
2026-08-26T17:39:05.1410958Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/CargaImovelService.cs",\
2026-08-26T17:39:05.1411174Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/FileService.cs",\
2026-08-26T17:39:05.1411393Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/LeituraService.cs",\
2026-08-26T17:39:05.1411619Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/LogProcessamentoService.cs",\
2026-08-26T17:39:05.1411841Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/MapperDataService.cs",\
2026-08-26T17:39:05.1412128Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/WorkerImovelService.cs",\
2026-08-26T17:39:05.1412437Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSiaciUseCase.cs",\
2026-08-26T17:39:05.1412721Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSimilFotoUseCase.cs",\
2026-08-26T17:39:05.1413052Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSimilUseCase.cs",\
2026-08-26T17:39:05.1413369Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSiopiUseCase.cs",\
2026-08-26T17:39:05.1413595Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/SiaciDDQUseCase.cs"
2026-08-26T17:39:05.1413745Z 
2026-08-26T17:39:05.1414035Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:05.1414308Z "/opt/ads-agent/_work/6/.sonarqube/out/2"
2026-08-26T17:39:05.1414563Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:05.1414766Z "/opt/ads-agent/_work/6/.sonarqube/out/2/Issues.json"
2026-08-26T17:39:05.1414844Z 
2026-08-26T17:39:05.1415128Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod2
2026-08-26T17:39:05.1415438Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectKey=SIMOV-imoveiscaixa-batch:D745E52F-7A66-4C38-B30D-3A27EA75CCCE
2026-08-26T17:39:05.1415697Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectName=Simov.Core
2026-08-26T17:39:05.1415941Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:39:05.1416167Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.sourceEncoding=utf-8
2026-08-26T17:39:05.1416368Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.sources=\
2026-08-26T17:39:05.1416435Z 
2026-08-26T17:39:05.1416479Z 
2026-08-26T17:39:05.1416664Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:05.1416851Z "/opt/ads-agent/_work/6/.sonarqube/out/3"
2026-08-26T17:39:05.1417059Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:05.1417257Z "/opt/ads-agent/_work/6/.sonarqube/out/3/Issues.json"
2026-08-26T17:39:05.1417319Z 
2026-08-26T17:39:05.1417535Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod3
2026-08-26T17:39:05.1417908Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectKey=SIMOV-imoveiscaixa-batch:FBCB055E-203B-4979-BB94-B02AE276DE0B
2026-08-26T17:39:05.1418158Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectName=Simov.Domain
2026-08-26T17:39:05.1418404Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:39:05.1418634Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.sourceEncoding=utf-8
2026-08-26T17:39:05.1418846Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.sources=\
2026-08-26T17:39:05.1418909Z 
2026-08-26T17:39:05.1418944Z 
2026-08-26T17:39:05.1419132Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:05.1419363Z "/opt/ads-agent/_work/6/.sonarqube/out/4"
2026-08-26T17:39:05.1419570Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:05.1419771Z "/opt/ads-agent/_work/6/.sonarqube/out/4/Issues.json"
2026-08-26T17:39:05.1419840Z 
2026-08-26T17:39:05.1420061Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod4
2026-08-26T17:39:05.1420369Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectKey=SIMOV-imoveiscaixa-batch:D6E1F89D-8BFA-426E-BC94-C1182DBD0621
2026-08-26T17:39:05.1420634Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectName=Simov.Application
2026-08-26T17:39:05.1420900Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:39:05.1421139Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.sourceEncoding=utf-8
2026-08-26T17:39:05.1421348Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.sources=\
2026-08-26T17:39:05.1421417Z 
2026-08-26T17:39:05.1421455Z 
2026-08-26T17:39:05.1421646Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:05.1421907Z "/opt/ads-agent/_work/6/.sonarqube/out/5"
2026-08-26T17:39:05.1422143Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:05.1422451Z "/opt/ads-agent/_work/6/.sonarqube/out/5/Issues.json"
2026-08-26T17:39:05.1422522Z 
2026-08-26T17:39:05.1422747Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod5
2026-08-26T17:39:05.1423046Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectKey=SIMOV-imoveiscaixa-batch:AD78E470-A67C-4901-A53F-E3D7D40350CD
2026-08-26T17:39:05.1423311Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:39:05.1423564Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:39:05.1423904Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.sourceEncoding=utf-8
2026-08-26T17:39:05.1424146Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.sources=\
2026-08-26T17:39:05.1424364Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Common/BaseRepository.cs",\
2026-08-26T17:39:05.1424584Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Common/UnitOfWork.cs",\
2026-08-26T17:39:05.1424817Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Interceptor/HistoricosInterceptor.cs",\
2026-08-26T17:39:05.1425069Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AgrupamentoVendaImovelConfiguration.cs",\
2026-08-26T17:39:05.1425321Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaArquivoLoteConfiguration.cs",\
2026-08-26T17:39:05.1425569Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaFotoImovelConfiguration.cs",\
2026-08-26T17:39:05.1425822Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaFotoLoteConfiguration.cs",\
2026-08-26T17:39:05.1426064Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaUsuarioConfiguration.cs",\
2026-08-26T17:39:05.1426308Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AvaliacaoImovelConfiguration.cs",\
2026-08-26T17:39:05.1426547Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ComodoImovelConfiguration.cs",\
2026-08-26T17:39:05.1426794Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ControleProcessamentoConfiguration.cs",\
2026-08-26T17:39:05.1427092Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/DadoContabilConfiguration.cs",\
2026-08-26T17:39:05.1427328Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/FotoImovelConfiguration.cs",\
2026-08-26T17:39:05.1427581Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoAgrupamentoVendaImovelConfiguration.cs",\
2026-08-26T17:39:05.1427837Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoAvaliacaoImovelConfiguration.cs",\
2026-08-26T17:39:05.1428087Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoComodoImovelConfiguration.cs",\
2026-08-26T17:39:05.1428369Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoDadoContabilConfiguration.cs",\
2026-08-26T17:39:05.1428607Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoImovelConfiguration.cs",\
2026-08-26T17:39:05.1428861Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoMatriculaImovelConfiguration.cs",\
2026-08-26T17:39:05.1429101Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ImovelConfiguration.cs",\
2026-08-26T17:39:05.1429339Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/MatriculaImovelConfiguration.cs",\
2026-08-26T17:39:05.1429590Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/MensagemControleProcessamentoConfiguration.cs",\
2026-08-26T17:39:05.1429843Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/RotinaProcessamentoConfiguration.cs",\
2026-08-26T17:39:05.1430089Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AgrupamentoVendaImovelRepository.cs",\
2026-08-26T17:39:05.1430343Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaArquivoLoteRepository.cs",\
2026-08-26T17:39:05.1430587Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaFotoImovelRepository.cs",\
2026-08-26T17:39:05.1430828Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaFotoLoteRepository.cs",\
2026-08-26T17:39:05.1431072Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaUsuarioRepository.cs",\
2026-08-26T17:39:05.1431309Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AvaliacaoImovelRepository.cs",\
2026-08-26T17:39:05.1431545Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ComodoImovelRepository.cs",\
2026-08-26T17:39:05.1431788Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ControleProcessamentoRepository.cs",\
2026-08-26T17:39:05.1432035Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/DadoContabilRepository.cs",\
2026-08-26T17:39:05.1432333Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/FotoImovelRepository.cs",\
2026-08-26T17:39:05.1432660Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ImovelRepository.cs",\
2026-08-26T17:39:05.1433001Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/MatriculaImovelRepository.cs",\
2026-08-26T17:39:05.1433418Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/MensagemControleProcessamentoRepository.cs",\
2026-08-26T17:39:05.1433888Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/RotinaProcessamentoRepository.cs",\
2026-08-26T17:39:05.1434197Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/SimovDbContext.cs"
2026-08-26T17:39:05.1434288Z 
2026-08-26T17:39:05.1434586Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:05.1434908Z "/opt/ads-agent/_work/6/.sonarqube/out/6"
2026-08-26T17:39:05.1435242Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:05.1435546Z "/opt/ads-agent/_work/6/.sonarqube/out/6/Issues.json"
2026-08-26T17:39:05.1435631Z 
2026-08-26T17:39:05.1435966Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod6
2026-08-26T17:39:05.1436452Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectKey=SIMOV-imoveiscaixa-batch:B904AD47-4763-413C-9324-7889FD92EFA6
2026-08-26T17:39:05.1436982Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectName=Simov.Batch
2026-08-26T17:39:05.1437409Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:39:05.1437806Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.sourceEncoding=utf-8
2026-08-26T17:39:05.1438130Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.sources=\
2026-08-26T17:39:05.1438463Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/AddHeadersHttpClient.cs",\
2026-08-26T17:39:05.1438882Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/ConnectionsConfiguration.cs",\
2026-08-26T17:39:05.1439382Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/HttpClientConfiguration.cs",\
2026-08-26T17:39:05.1439801Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/IApiSiisoRestPrivado.cs",\
2026-08-26T17:39:05.1440197Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/UseCasesConfiguration.cs",\
2026-08-26T17:39:05.1440580Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderImoveisSiaci.cs",\
2026-08-26T17:39:05.1440978Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderImoveisSiopi.cs",\
2026-08-26T17:39:05.1441370Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderLeilaoSiaciDDQ.cs",\
2026-08-26T17:39:05.1441713Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Program.cs",\
2026-08-26T17:39:05.1442044Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Workers/WorkerFotoImoveisSimil.cs",\
2026-08-26T17:39:05.1442431Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Workers/WorkerImoveisSimil.cs",\
2026-08-26T17:39:05.1442826Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/Simov.Batch.GlobalUsings.g.cs",\
2026-08-26T17:39:05.1443293Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/.NETCoreApp,Version=v8.0.AssemblyAttributes.cs",\
2026-08-26T17:39:05.1443883Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/Simov.Batch.AssemblyInfo.cs",\
2026-08-26T17:39:05.1444302Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/appsettings.Development.json",\
2026-08-26T17:39:05.1444651Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/appsettings.json",\
2026-08-26T17:39:05.1444919Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Properties/launchSettings.json",\
2026-08-26T17:39:05.1445134Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/apphost"
2026-08-26T17:39:05.1445202Z 
2026-08-26T17:39:05.1445397Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:05.1445592Z "/opt/ads-agent/_work/6/.sonarqube/out/7"
2026-08-26T17:39:05.1445804Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:05.1446011Z "/opt/ads-agent/_work/6/.sonarqube/out/7/Issues.json"
2026-08-26T17:39:05.1446080Z 
2026-08-26T17:39:05.1446303Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod7
2026-08-26T17:39:05.1446613Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectKey=SIMOV-imoveiscaixa-batch:6679F22B-144A-4C59-A28C-2A87F31E3915
2026-08-26T17:39:05.1446878Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectName=Simov.Core
2026-08-26T17:39:05.1447128Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:39:05.1447362Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.sourceEncoding=utf-8
2026-08-26T17:39:05.1447568Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.sources=\
2026-08-26T17:39:05.1447634Z 
2026-08-26T17:39:05.1447676Z 
2026-08-26T17:39:05.1447910Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:05.1448183Z "/opt/ads-agent/_work/6/.sonarqube/out/8"
2026-08-26T17:39:05.1448455Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:05.1448708Z "/opt/ads-agent/_work/6/.sonarqube/out/8/Issues.json"
2026-08-26T17:39:05.1448768Z 
2026-08-26T17:39:05.1448990Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod8
2026-08-26T17:39:05.1449433Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectKey=SIMOV-imoveiscaixa-batch:EC78B0BC-170C-482C-867B-C5402B449403
2026-08-26T17:39:05.1449692Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectName=Simov.Core
2026-08-26T17:39:05.1449940Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:39:05.1450169Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.sourceEncoding=utf-8
2026-08-26T17:39:05.1450374Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.sources=\
2026-08-26T17:39:05.1450439Z 
2026-08-26T17:39:05.1450483Z 
2026-08-26T17:39:05.1450673Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:05.1450914Z "/opt/ads-agent/_work/6/.sonarqube/out/9"
2026-08-26T17:39:05.1451125Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:05.1451327Z "/opt/ads-agent/_work/6/.sonarqube/out/9/Issues.json"
2026-08-26T17:39:05.1451390Z 
2026-08-26T17:39:05.1451610Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod9
2026-08-26T17:39:05.1451914Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectKey=SIMOV-imoveiscaixa-batch:1B2C05E0-E98F-477C-931D-923BBE79AE4E
2026-08-26T17:39:05.1452169Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectName=Simov.Domain
2026-08-26T17:39:05.1452415Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:39:05.1452652Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.sourceEncoding=utf-8
2026-08-26T17:39:05.1452858Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.sources=\
2026-08-26T17:39:05.1452922Z 
2026-08-26T17:39:05.1452958Z 
2026-08-26T17:39:05.1453146Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:05.1453341Z "/opt/ads-agent/_work/6/.sonarqube/out/10"
2026-08-26T17:39:05.1453551Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:05.1453849Z "/opt/ads-agent/_work/6/.sonarqube/out/10/Issues.json"
2026-08-26T17:39:05.1453915Z 
2026-08-26T17:39:05.1454141Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod10
2026-08-26T17:39:05.1454449Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectKey=SIMOV-imoveiscaixa-batch:A180ED2D-1521-44A6-B6EA-5DDEC55D2C17
2026-08-26T17:39:05.1454710Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectName=Simov.Core
2026-08-26T17:39:05.1454961Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:39:05.1455339Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.sourceEncoding=utf-8
2026-08-26T17:39:05.1455550Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.sources=\
2026-08-26T17:39:05.1455625Z 
2026-08-26T17:39:05.1455660Z 
2026-08-26T17:39:05.1455852Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:05.1456047Z "/opt/ads-agent/_work/6/.sonarqube/out/11"
2026-08-26T17:39:05.1456258Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:05.1456463Z "/opt/ads-agent/_work/6/.sonarqube/out/11/Issues.json"
2026-08-26T17:39:05.1456532Z 
2026-08-26T17:39:05.1456760Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod11
2026-08-26T17:39:05.1457058Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectKey=SIMOV-imoveiscaixa-batch:A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E
2026-08-26T17:39:05.1457310Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectName=Simov.Domain
2026-08-26T17:39:05.1457553Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:39:05.1457781Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.sourceEncoding=utf-8
2026-08-26T17:39:05.1458054Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.sources=\
2026-08-26T17:39:05.1458117Z 
2026-08-26T17:39:05.1458162Z 
2026-08-26T17:39:05.1458350Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:05.1458593Z "/opt/ads-agent/_work/6/.sonarqube/out/12"
2026-08-26T17:39:05.1458801Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:05.1459001Z "/opt/ads-agent/_work/6/.sonarqube/out/12/Issues.json"
2026-08-26T17:39:05.1459061Z 
2026-08-26T17:39:05.1459283Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod12
2026-08-26T17:39:05.1459594Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectKey=SIMOV-imoveiscaixa-batch:00300450-28FA-4EA9-8A96-181ED44DCA26
2026-08-26T17:39:05.1459858Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectName=Simov.Application
2026-08-26T17:39:05.1460152Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:39:05.1460388Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.sourceEncoding=utf-8
2026-08-26T17:39:05.1460596Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.sources=\
2026-08-26T17:39:05.1460661Z 
2026-08-26T17:39:05.1460706Z 
2026-08-26T17:39:05.1461099Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:05.1461309Z "/opt/ads-agent/_work/6/.sonarqube/out/13"
2026-08-26T17:39:05.1461520Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:05.1461726Z "/opt/ads-agent/_work/6/.sonarqube/out/13/Issues.json"
2026-08-26T17:39:05.1461787Z 
2026-08-26T17:39:05.1462014Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod13
2026-08-26T17:39:05.1462321Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectKey=SIMOV-imoveiscaixa-batch:1393E257-1007-43DE-B94C-0B0508C0B309
2026-08-26T17:39:05.1462588Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:39:05.1462851Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:39:05.1463098Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.sourceEncoding=utf-8
2026-08-26T17:39:05.1463306Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.sources=\
2026-08-26T17:39:05.1463370Z 
2026-08-26T17:39:05.1463405Z 
2026-08-26T17:39:05.1463595Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:05.1463856Z "/opt/ads-agent/_work/6/.sonarqube/out/14"
2026-08-26T17:39:05.1464075Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:05.1464279Z "/opt/ads-agent/_work/6/.sonarqube/out/14/Issues.json"
2026-08-26T17:39:05.1464340Z 
2026-08-26T17:39:05.1464560Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod14
2026-08-26T17:39:05.1464864Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectKey=SIMOV-imoveiscaixa-batch:5BE00443-BD63-4C9F-A707-406F2AC94762
2026-08-26T17:39:05.1465116Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectName=Simov.Core
2026-08-26T17:39:05.1465359Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:39:05.1465587Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.sourceEncoding=utf-8
2026-08-26T17:39:05.1465789Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.sources=\
2026-08-26T17:39:05.1465860Z 
2026-08-26T17:39:05.1465895Z 
2026-08-26T17:39:05.1466081Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:05.1466273Z "/opt/ads-agent/_work/6/.sonarqube/out/15"
2026-08-26T17:39:05.1466478Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:05.1466680Z "/opt/ads-agent/_work/6/.sonarqube/out/15/Issues.json"
2026-08-26T17:39:05.1466750Z 
2026-08-26T17:39:05.1466973Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod15
2026-08-26T17:39:05.1467276Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectKey=SIMOV-imoveiscaixa-batch:A79CA783-37A2-49D3-B56C-D9102F046AF9
2026-08-26T17:39:05.1467530Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectName=Simov.Domain
2026-08-26T17:39:05.1467843Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:39:05.1468134Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.sourceEncoding=utf-8
2026-08-26T17:39:05.1468340Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.sources=\
2026-08-26T17:39:05.1468411Z 
2026-08-26T17:39:05.1468445Z 
2026-08-26T17:39:05.1468630Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:05.1468818Z "/opt/ads-agent/_work/6/.sonarqube/out/16"
2026-08-26T17:39:05.1469023Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:05.1469219Z "/opt/ads-agent/_work/6/.sonarqube/out/16/Issues.json"
2026-08-26T17:39:05.1469323Z 
2026-08-26T17:39:05.1469548Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod16
2026-08-26T17:39:05.1469847Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectKey=SIMOV-imoveiscaixa-batch:51ABFD24-E14F-4155-B9D7-CDBD0E536AAB
2026-08-26T17:39:05.1470114Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectName=Simov.Application
2026-08-26T17:39:05.1470372Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:39:05.1470611Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.sourceEncoding=utf-8
2026-08-26T17:39:05.1470816Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.sources=\
2026-08-26T17:39:05.1470881Z 
2026-08-26T17:39:05.1470922Z 
2026-08-26T17:39:05.1471115Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:05.1471307Z "/opt/ads-agent/_work/6/.sonarqube/out/17"
2026-08-26T17:39:05.1471517Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:05.1471720Z "/opt/ads-agent/_work/6/.sonarqube/out/17/Issues.json"
2026-08-26T17:39:05.1471777Z 
2026-08-26T17:39:05.1472003Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod17
2026-08-26T17:39:05.1472307Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectKey=SIMOV-imoveiscaixa-batch:F2842708-9CF5-4649-B3A8-6D39E5E01B77
2026-08-26T17:39:05.1472569Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:39:05.1472832Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:39:05.1473062Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.sourceEncoding=utf-8
2026-08-26T17:39:05.1473261Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.sources=\
2026-08-26T17:39:05.1473324Z 
2026-08-26T17:39:05.1473358Z 
2026-08-26T17:39:05.1473543Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:05.1473802Z "/opt/ads-agent/_work/6/.sonarqube/out/18"
2026-08-26T17:39:05.1474013Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:05.1474213Z "/opt/ads-agent/_work/6/.sonarqube/out/18/Issues.json"
2026-08-26T17:39:05.1474274Z 
2026-08-26T17:39:05.1474500Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod18
2026-08-26T17:39:05.1474801Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectKey=SIMOV-imoveiscaixa-batch:3C101C3B-D8C0-461B-B65B-B87A6F75F210
2026-08-26T17:39:05.1475051Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectName=Simov.Batch
2026-08-26T17:39:05.1475300Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:39:05.1475531Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.sourceEncoding=utf-8
2026-08-26T17:39:05.1475734Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.sources=\
2026-08-26T17:39:05.1475809Z 
2026-08-26T17:39:05.1475843Z 
2026-08-26T17:39:05.1476142Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:05.1476340Z "/opt/ads-agent/_work/6/.sonarqube/out/19"
2026-08-26T17:39:05.1476549Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:05.1476797Z "/opt/ads-agent/_work/6/.sonarqube/out/19/Issues.json"
2026-08-26T17:39:05.1476855Z 
2026-08-26T17:39:05.1477079Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod19
2026-08-26T17:39:05.1477389Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectKey=SIMOV-imoveiscaixa-batch:4E341BE0-BD46-427C-8912-6319C41C89BC
2026-08-26T17:39:05.1477664Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectName=TesteSimovBatch
2026-08-26T17:39:05.1477994Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/tests/TesteSimovBatch
2026-08-26T17:39:05.1478236Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.sourceEncoding=utf-8
2026-08-26T17:39:05.1478479Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.sources=
2026-08-26T17:39:05.1478682Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.tests=\
2026-08-26T17:39:05.1478913Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/AvaliacaoImovelDtoTests.cs",\
2026-08-26T17:39:05.1479157Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/DadoContabilDtoTests.cs",\
2026-08-26T17:39:05.1479397Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/ImovelDtoTests.cs",\
2026-08-26T17:39:05.1479635Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/MatriculaImovelDtoTests.cs",\
2026-08-26T17:39:05.1479881Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/CargaImovelServiceTests.cs",\
2026-08-26T17:39:05.1480164Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/FileServiceTests.cs",\
2026-08-26T17:39:05.1480521Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/LeituraSiaciServiceTests.cs",\
2026-08-26T17:39:05.1480886Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/LogProcessamentoServiceTests.cs",\
2026-08-26T17:39:05.1481147Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/MapperDataServiceTests.cs",\
2026-08-26T17:39:05.1481400Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/WorkerImovelServiceTests.cs",\
2026-08-26T17:39:05.1481657Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSiaciPreCadastroUseCaseTests.cs",\
2026-08-26T17:39:05.1481919Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSimilFotoUseCaseTests.cs",\
2026-08-26T17:39:05.1482174Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSimilUseCaseTests.cs",\
2026-08-26T17:39:05.1482423Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSiopiUseCaseTests.cs",\
2026-08-26T17:39:05.1482662Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/SiaciDDQUseCaseTests.cs",\
2026-08-26T17:39:05.1482895Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Batch/LoaderImoveisSiopiTests.cs",\
2026-08-26T17:39:05.1483119Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/CargaImoveisSiaciTests.cs",\
2026-08-26T17:39:05.1483391Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Configuration/AddHeadersHttpClientTests.cs",\
2026-08-26T17:39:05.1483718Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Configuration/ConnectionsConfigurationTest.cs",\
2026-08-26T17:39:05.1483973Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Contexts/FileProcessingContextTests.cs",\
2026-08-26T17:39:05.1484213Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Contexts/SiicoCallCounterContextTests.cs",\
2026-08-26T17:39:05.1484456Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/DomainObjects/EntityTests.cs",\
2026-08-26T17:39:05.1484697Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/DomainObjects/IAggregateRootTests.cs",\
2026-08-26T17:39:05.1484942Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/CancellationExceptionTests.cs",\
2026-08-26T17:39:05.1485195Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/EntityValidationExceptionTests.cs",\
2026-08-26T17:39:05.1485441Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/GenericExceptionTests.cs",\
2026-08-26T17:39:05.1485725Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/NotFoundExceptionTests.cs",\
2026-08-26T17:39:05.1485971Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/ProcessamentoExceptionTests.cs",\
2026-08-26T17:39:05.1486219Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/RelatedAggregateExceptionTests.cs",\
2026-08-26T17:39:05.1486464Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/UnauthorizedExceptionTests.cs",\
2026-08-26T17:39:05.1486707Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siico/ApiSiicoRestPrivadoTests.cs",\
2026-08-26T17:39:05.1486950Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siico/ApiSiicoRestPublicoTests.cs",\
2026-08-26T17:39:05.1487232Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siiso/ApiSiisoRestPublicoTests.cs",\
2026-08-26T17:39:05.1487465Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/AutenticacarSsoTests.cs",\
2026-08-26T17:39:05.1487713Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/BairroDetalhadoSiicoTests.cs",\
2026-08-26T17:39:05.1488031Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/BairroSiicoTests.cs",\
2026-08-26T17:39:05.1488392Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/MunicipioCompletoSiicoTests.cs",\
2026-08-26T17:39:05.1488727Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/ResponseGenericoTests.cs",\
2026-08-26T17:39:05.1488961Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/Siico/CepSiicoTests.cs",\
2026-08-26T17:39:05.1489199Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Domain/Layouts/BaseArquivoLayoutTests.cs",\
2026-08-26T17:39:05.1489438Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/AgrupamentoVendaImovelTests.cs",\
2026-08-26T17:39:05.1489678Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/AvaliacaoImovelSiopiTests.cs",\
2026-08-26T17:39:05.1489913Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/ControleProcessamentoTests.cs",\
2026-08-26T17:39:05.1490144Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/DadoContabilTests.cs",\
2026-08-26T17:39:05.1490387Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoAgrupamentoVendaImovelTests.cs",\
2026-08-26T17:39:05.1490630Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoDadoContabilTests.cs",\
2026-08-26T17:39:05.1490861Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoImovelTests.cs",\
2026-08-26T17:39:05.1491080Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/ImovelTests.cs",\
2026-08-26T17:39:05.1491320Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/MatriculaImovelSiopiTests.cs",\
2026-08-26T17:39:05.1491566Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/MensagemControleProcessamentoTests.cs",\
2026-08-26T17:39:05.1491809Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/RotinaProcessamentoTests.cs",\
2026-08-26T17:39:05.1492039Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/SiopiImovelTests.cs",\
2026-08-26T17:39:05.1492265Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ArquivoSiaciFake.cs",\
2026-08-26T17:39:05.1492484Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ImovelDtoFake.cs",\
2026-08-26T17:39:05.1492697Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ImovelFake.cs",\
2026-08-26T17:39:05.1492914Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/LayoutArquivoFake.cs",\
2026-08-26T17:39:05.1493134Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/Siico/ResponsesFake.cs",\
2026-08-26T17:39:05.1493366Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/InfraDataEF/HistoricosInterceptorTests.cs",\
2026-08-26T17:39:05.1493603Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/InfraDataEF/SimovDbContextTests.cs",\
2026-08-26T17:39:05.1493905Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Layouts/SiaciLayoutTests.cs"
2026-08-26T17:39:05.1493985Z 
2026-08-26T17:39:05.1494179Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:05.1494423Z "/opt/ads-agent/_work/6/.sonarqube/out/20"
2026-08-26T17:39:05.1494640Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:05.1494846Z "/opt/ads-agent/_work/6/.sonarqube/out/20/Issues.json"
2026-08-26T17:39:05.1494906Z 
2026-08-26T17:39:05.1495135Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod20
2026-08-26T17:39:05.1495453Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectKey=SIMOV-imoveiscaixa-batch:0DC13198-1AC4-46C6-B9B3-E2987B8496D5
2026-08-26T17:39:05.1495724Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectName=Simov.Core
2026-08-26T17:39:05.1496008Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:39:05.1496243Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.sourceEncoding=utf-8
2026-08-26T17:39:05.1496449Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.sources=\
2026-08-26T17:39:05.1496513Z 
2026-08-26T17:39:05.1496557Z 
2026-08-26T17:39:05.1496750Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:05.1496942Z "/opt/ads-agent/_work/6/.sonarqube/out/21"
2026-08-26T17:39:05.1497152Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:05.1497355Z "/opt/ads-agent/_work/6/.sonarqube/out/21/Issues.json"
2026-08-26T17:39:05.1497416Z 
2026-08-26T17:39:05.1497642Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod21
2026-08-26T17:39:05.1497949Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectKey=SIMOV-imoveiscaixa-batch:BA15777F-9613-49A5-8C5F-8CBFA5F86619
2026-08-26T17:39:05.1498219Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectName=Simov.Domain
2026-08-26T17:39:05.1498471Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:39:05.1498703Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.sourceEncoding=utf-8
2026-08-26T17:39:05.1498916Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.sources=\
2026-08-26T17:39:05.1498987Z 
2026-08-26T17:39:05.1499021Z 
2026-08-26T17:39:05.1499207Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:05.1499400Z "/opt/ads-agent/_work/6/.sonarqube/out/22"
2026-08-26T17:39:05.1499605Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:05.1499808Z "/opt/ads-agent/_work/6/.sonarqube/out/22/Issues.json"
2026-08-26T17:39:05.1499877Z 
2026-08-26T17:39:05.1500100Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod22
2026-08-26T17:39:05.1500406Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectKey=SIMOV-imoveiscaixa-batch:48A485AE-9F33-C9A7-979C-54916B65C32E
2026-08-26T17:39:05.1500667Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectName=Simov.Application
2026-08-26T17:39:05.1500926Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:39:05.1501162Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.sourceEncoding=utf-8
2026-08-26T17:39:05.1501369Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.sources=\
2026-08-26T17:39:05.1501439Z 
2026-08-26T17:39:05.1501475Z 
2026-08-26T17:39:05.1501663Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:05.1501852Z "/opt/ads-agent/_work/6/.sonarqube/out/23"
2026-08-26T17:39:05.1502059Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:05.1502260Z "/opt/ads-agent/_work/6/.sonarqube/out/23/Issues.json"
2026-08-26T17:39:05.1502327Z 
2026-08-26T17:39:05.1502549Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod23
2026-08-26T17:39:05.1502856Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectKey=SIMOV-imoveiscaixa-batch:309346D6-2461-4973-A29B-7A38A756C0DE
2026-08-26T17:39:05.1503120Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:39:05.1503412Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:39:05.1503764Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.sourceEncoding=utf-8
2026-08-26T17:39:05.1503993Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.sources=\
2026-08-26T17:39:05.1504057Z 
2026-08-26T17:39:05.1504101Z 
2026-08-26T17:39:05.1504297Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:05.1504494Z "/opt/ads-agent/_work/6/.sonarqube/out/24"
2026-08-26T17:39:05.1504702Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:05.1504904Z "/opt/ads-agent/_work/6/.sonarqube/out/24/Issues.json"
2026-08-26T17:39:05.1505004Z 
2026-08-26T17:39:05.1505229Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod24
2026-08-26T17:39:05.1505539Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectKey=SIMOV-imoveiscaixa-batch:4BF20498-1845-4781-82CB-E7783C0081FA
2026-08-26T17:39:05.1505798Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectName=Simov.Batch
2026-08-26T17:39:05.1506048Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:39:05.1506279Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.sourceEncoding=utf-8
2026-08-26T17:39:05.1506488Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.sources=\
2026-08-26T17:39:05.1506553Z 
2026-08-26T17:39:05.1506597Z 
2026-08-26T17:39:05.1506785Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:05.1506975Z "/opt/ads-agent/_work/6/.sonarqube/out/25"
2026-08-26T17:39:05.1507185Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:05.1507388Z "/opt/ads-agent/_work/6/.sonarqube/out/25/Issues.json"
2026-08-26T17:39:05.1507450Z 
2026-08-26T17:39:05.1507676Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod25
2026-08-26T17:39:05.1507980Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectKey=SIMOV-imoveiscaixa-batch:D54F14FF-8EEB-4EB8-994B-69D77DDB78FD
2026-08-26T17:39:05.1508234Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectName=TesteSimovBatch
2026-08-26T17:39:05.1508488Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/tests/TesteSimovBatch
2026-08-26T17:39:05.1508729Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.sourceEncoding=utf-8
2026-08-26T17:39:05.1508997Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.sources=
2026-08-26T17:39:05.1509195Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.tests=\
2026-08-26T17:39:05.1509256Z 
2026-08-26T17:39:05.1509291Z 
2026-08-26T17:39:05.1509480Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:05.1509674Z "/opt/ads-agent/_work/6/.sonarqube/out/26"
2026-08-26T17:39:05.1509880Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:05.1510089Z "/opt/ads-agent/_work/6/.sonarqube/out/26/Issues.json"
2026-08-26T17:39:05.1510151Z 
2026-08-26T17:39:05.1510374Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod26
2026-08-26T17:39:05.1510547Z sonar.host.url=https://sonar.apps.produtos4.caixa/
2026-08-26T17:39:05.1510730Z sonar.projectKey=SIMOV-imoveiscaixa-batch
2026-08-26T17:39:05.1510909Z sonar.projectName=SIMOV-imoveiscaixa-batch
2026-08-26T17:39:05.1511079Z sonar.projectVersion=1.0-SNAPSHOT
2026-08-26T17:39:05.1511208Z sonar.branch.name=CorrecoesSonar
2026-08-26T17:39:05.1511479Z sonar.scanner.metadataFilePath=/opt/ads-agent/_work/_temp/sonar/1.0-SNAPSHOT/f442c3b3-ec53-840d-3dab-bba3c4de61f5/report-task.txt
2026-08-26T17:39:05.1511745Z sonar.cs.opencover.reportsPaths=/opt/ads-agent/_work/_temp/**/coverage.opencover.xml
2026-08-26T17:39:05.1511965Z sonar.cs.vstest.reportsPaths=/opt/ads-agent/_work/_temp/**/*.trx
2026-08-26T17:39:05.1512110Z sonar.visualstudio.enable=false
2026-08-26T17:39:05.1512161Z 
2026-08-26T17:39:05.1513510Z sonar.modules=0B395246-F58A-479C-B0B1-C6A6045C6FD3,5E55366D-25CB-4B0F-BAF4-738003A18ED2,0847F1F3-B5DA-4FC3-8EEF-882D75A674FD,D745E52F-7A66-4C38-B30D-3A27EA75CCCE,FBCB055E-203B-4979-BB94-B02AE276DE0B,D6E1F89D-8BFA-426E-BC94-C1182DBD0621,AD78E470-A67C-4901-A53F-E3D7D40350CD,B904AD47-4763-413C-9324-7889FD92EFA6,6679F22B-144A-4C59-A28C-2A87F31E3915,EC78B0BC-170C-482C-867B-C5402B449403,1B2C05E0-E98F-477C-931D-923BBE79AE4E,A180ED2D-1521-44A6-B6EA-5DDEC55D2C17,A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E,00300450-28FA-4EA9-8A96-181ED44DCA26,1393E257-1007-43DE-B94C-0B0508C0B309,5BE00443-BD63-4C9F-A707-406F2AC94762,A79CA783-37A2-49D3-B56C-D9102F046AF9,51ABFD24-E14F-4155-B9D7-CDBD0E536AAB,F2842708-9CF5-4649-B3A8-6D39E5E01B77,3C101C3B-D8C0-461B-B65B-B87A6F75F210,4E341BE0-BD46-427C-8912-6319C41C89BC,0DC13198-1AC4-46C6-B9B3-E2987B8496D5,BA15777F-9613-49A5-8C5F-8CBFA5F86619,48A485AE-9F33-C9A7-979C-54916B65C32E,309346D6-2461-4973-A29B-7A38A756C0DE,4BF20498-1845-4781-82CB-E7783C0081FA,D54F14FF-8EEB-4EB8-994B-69D77DDB78FD
2026-08-26T17:39:05.1514223Z 
2026-08-26T17:39:05.1514260Z 
2026-08-26T17:39:05.1514469Z ------------------------------------------------------------------------
2026-08-26T17:39:05.1514723Z 14:39:05.139  Writing processing summary to /opt/ads-agent/_work/6/.sonarqube/out/ProjectInfo.log
2026-08-26T17:39:05.1514917Z The SONAR_SCANNER_HOME environment variable is not required and will be ignored.
2026-08-26T17:39:05.1515065Z Calling the SonarScanner CLI...
2026-08-26T17:39:05.1515400Z Executing file /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/sonar-scanner-4.7.0.2747/bin/sonar-scanner
2026-08-26T17:39:05.1515770Z   Args: -Dsonar.scanAllFiles=true -Dproject.settings=/opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties --from=ScannerMSBuild/5.8 --debug <sensitive data removed>
2026-08-26T17:39:05.1516010Z   Working directory: /opt/ads-agent/_work/6
2026-08-26T17:39:05.1516137Z   Timeout (ms):-1
2026-08-26T17:39:05.1516253Z   Process id: 26321
2026-08-26T17:39:05.2567755Z 14:39:05.252 INFO: Scanner configuration file: /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/sonar-scanner-4.7.0.2747/conf/sonar-scanner.properties
2026-08-26T17:39:05.2568361Z 14:39:05.254 INFO: Project root configuration file: /opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties
2026-08-26T17:39:05.2834051Z 14:39:05.282 INFO: SonarScanner 4.7.0.2747
2026-08-26T17:39:05.2834601Z 14:39:05.282 INFO: Java 11 Oracle Corporation (64-bit)
2026-08-26T17:39:05.2834833Z 14:39:05.282 INFO: Linux 5.18.5-100.fc35.x86_64 amd64
2026-08-26T17:39:05.3619115Z 14:39:05.361 DEBUG: keyStore is : 
2026-08-26T17:39:05.3620940Z 14:39:05.361 DEBUG: keyStore type is : pkcs12
2026-08-26T17:39:05.3622405Z 14:39:05.361 DEBUG: keyStore provider is : 
2026-08-26T17:39:05.3624057Z 14:39:05.361 DEBUG: init keystore
2026-08-26T17:39:05.3625491Z 14:39:05.361 DEBUG: init keymanager of type SunX509
2026-08-26T17:39:05.4210605Z 14:39:05.420 DEBUG: Create: /opt/ads-agent/cache-tools/.sonar/cache
2026-08-26T17:39:05.4211113Z 14:39:05.420 INFO: User cache: /opt/ads-agent/cache-tools/.sonar/cache
2026-08-26T17:39:05.4211898Z 14:39:05.421 DEBUG: Create: /opt/ads-agent/cache-tools/.sonar/cache/_tmp
2026-08-26T17:39:05.4228223Z 14:39:05.422 DEBUG: Extract sonar-scanner-api-batch in temp...
2026-08-26T17:39:05.4244802Z 14:39:05.424 DEBUG: Get bootstrap index...
2026-08-26T17:39:05.4245392Z 14:39:05.424 DEBUG: Download: https://sonar.apps.produtos4.caixa/batch/index
2026-08-26T17:39:05.5030869Z 14:39:05.502 INFO: ------------------------------------------------------------------------
2026-08-26T17:39:05.5031139Z 14:39:05.502 INFO: EXECUTION FAILURE
2026-08-26T17:39:05.5031412Z 14:39:05.502 INFO: ------------------------------------------------------------------------
2026-08-26T17:39:05.5031584Z 14:39:05.502 INFO: Total time: 0.270s
2026-08-26T17:39:05.5034130Z ##[error]14:39:05.502 ERROR: SonarQube server [https://sonar.apps.produtos4.caixa] can not be reached
2026-08-26T17:39:05.5034968Z 14:39:05.502 ERROR: SonarQube server [https://sonar.apps.produtos4.caixa] can not be reached
2026-08-26T17:39:05.5122377Z 14:39:05.511 INFO: Final Memory: 4M/80M
2026-08-26T17:39:05.5122971Z 14:39:05.511 INFO: ------------------------------------------------------------------------
2026-08-26T17:39:05.5123812Z ##[error]14:39:05.511 ERROR: Error during SonarScanner execution
org.sonarsource.scanner.api.internal.ScannerException: Unable to execute SonarScanner analysis
2026-08-26T17:39:05.5124372Z 14:39:05.511 ERROR: Error during SonarScanner execution
2026-08-26T17:39:05.5124550Z org.sonarsource.scanner.api.internal.ScannerException: Unable to execute SonarScanner analysis
2026-08-26T17:39:05.5125269Z ##[error]at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:85)
2026-08-26T17:39:05.5125672Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:85)
2026-08-26T17:39:05.5126630Z ##[error]at java.base/java.security.AccessController.doPrivileged(Native Method)
	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:74)
	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:70)
	at org.sonarsource.scanner.api.EmbeddedScanner.doStart(EmbeddedScanner.java:185)
	at org.sonarsource.scanner.api.EmbeddedScanner.start(EmbeddedScanner.java:123)
	at org.sonarsource.scanner.cli.Main.execute(Main.java:73)
	at org.sonarsource.scanner.cli.Main.main(Main.java:61)
2026-08-26T17:39:05.5127290Z 	at java.base/java.security.AccessController.doPrivileged(Native Method)
2026-08-26T17:39:05.5127492Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:74)
2026-08-26T17:39:05.5127721Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:70)
2026-08-26T17:39:05.5127944Z 	at org.sonarsource.scanner.api.EmbeddedScanner.doStart(EmbeddedScanner.java:185)
2026-08-26T17:39:05.5128137Z 	at org.sonarsource.scanner.api.EmbeddedScanner.start(EmbeddedScanner.java:123)
2026-08-26T17:39:05.5128317Z 	at org.sonarsource.scanner.cli.Main.execute(Main.java:73)
2026-08-26T17:39:05.5128520Z 	at org.sonarsource.scanner.cli.Main.main(Main.java:61)
2026-08-26T17:39:05.5129235Z ##[error]Caused by: java.lang.IllegalStateException: Fail to get bootstrap index from server
	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:42)
2026-08-26T17:39:05.5129737Z Caused by: java.lang.IllegalStateException: Fail to get bootstrap index from server
2026-08-26T17:39:05.5130000Z 	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:42)
2026-08-26T17:39:05.5130657Z ##[error]at org.sonarsource.scanner.api.internal.JarDownloader.getScannerEngineFiles(JarDownloader.java:58)
	at org.sonarsource.scanner.api.internal.JarDownloader.download(JarDownloader.java:53)
	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:76)
	... 7 more
2026-08-26T17:39:05.5131481Z 	at org.sonarsource.scanner.api.internal.JarDownloader.getScannerEngineFiles(JarDownloader.java:58)
2026-08-26T17:39:05.5131807Z 	at org.sonarsource.scanner.api.internal.JarDownloader.download(JarDownloader.java:53)
2026-08-26T17:39:05.5132172Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:76)
2026-08-26T17:39:05.5132458Z 	... 7 more
2026-08-26T17:39:05.5133192Z ##[error]Caused by: javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:128)
2026-08-26T17:39:05.5134099Z Caused by: javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:39:05.5134533Z 	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:128)
2026-08-26T17:39:05.5134907Z ##[error]at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
2026-08-26T17:39:05.5135268Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
2026-08-26T17:39:05.5135721Z ##[error]at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:264)
2026-08-26T17:39:05.5136186Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:264)
2026-08-26T17:39:05.5137574Z ##[error]at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:259)
	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1329)
	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.onConsumeCertificate(CertificateMessage.java:1204)
	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.consume(CertificateMessage.java:1151)
	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:392)
	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:444)
2026-08-26T17:39:05.5138471Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:259)
2026-08-26T17:39:05.5138785Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1329)
2026-08-26T17:39:05.5139181Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.onConsumeCertificate(CertificateMessage.java:1204)
2026-08-26T17:39:05.5139572Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.consume(CertificateMessage.java:1151)
2026-08-26T17:39:05.5139893Z 	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:392)
2026-08-26T17:39:05.5140128Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:444)
2026-08-26T17:39:05.5140666Z ##[error]at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:421)
	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:178)
2026-08-26T17:39:05.5141083Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:421)
2026-08-26T17:39:05.5141276Z 	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:178)
2026-08-26T17:39:05.5141828Z ##[error]at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:164)
	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1152)
2026-08-26T17:39:05.5142232Z 	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:164)
2026-08-26T17:39:05.5142418Z 	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1152)
2026-08-26T17:39:05.5143162Z ##[error]at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1063)
	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:402)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connectTls(RealConnection.java:336)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.establishProtocol(RealConnection.java:300)
2026-08-26T17:39:05.5143941Z 	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1063)
2026-08-26T17:39:05.5144142Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:402)
2026-08-26T17:39:05.5144362Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connectTls(RealConnection.java:336)
2026-08-26T17:39:05.5144616Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.establishProtocol(RealConnection.java:300)
2026-08-26T17:39:05.5145346Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connect(RealConnection.java:185)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findConnection(ExchangeFinder.java:224)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findHealthyConnection(ExchangeFinder.java:108)
2026-08-26T17:39:05.5146092Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connect(RealConnection.java:185)
2026-08-26T17:39:05.5146354Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findConnection(ExchangeFinder.java:224)
2026-08-26T17:39:05.5146655Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findHealthyConnection(ExchangeFinder.java:108)
2026-08-26T17:39:05.5147480Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.find(ExchangeFinder.java:88)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.Transmitter.newExchange(Transmitter.java:169)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ConnectInterceptor.intercept(ConnectInterceptor.java:41)
2026-08-26T17:39:05.5148108Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.find(ExchangeFinder.java:88)
2026-08-26T17:39:05.5148508Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.Transmitter.newExchange(Transmitter.java:169)
2026-08-26T17:39:05.5148791Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ConnectInterceptor.intercept(ConnectInterceptor.java:41)
2026-08-26T17:39:05.5149241Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:39:05.5149634Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:39:05.5150881Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.cache.CacheInterceptor.intercept(CacheInterceptor.java:94)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.BridgeInterceptor.intercept(BridgeInterceptor.java:93)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:39:05.5151678Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:39:05.5151958Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.cache.CacheInterceptor.intercept(CacheInterceptor.java:94)
2026-08-26T17:39:05.5152243Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:39:05.5152483Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:39:05.5152722Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.BridgeInterceptor.intercept(BridgeInterceptor.java:93)
2026-08-26T17:39:05.5152961Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:39:05.5153542Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RetryAndFollowUpInterceptor.intercept(RetryAndFollowUpInterceptor.java:88)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:39:05.5154132Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RetryAndFollowUpInterceptor.intercept(RetryAndFollowUpInterceptor.java:88)
2026-08-26T17:39:05.5154511Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:39:05.5155185Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.getResponseWithInterceptorChain(RealCall.java:221)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.execute(RealCall.java:81)
2026-08-26T17:39:05.5155724Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:39:05.5156043Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.getResponseWithInterceptorChain(RealCall.java:221)
2026-08-26T17:39:05.5156260Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.execute(RealCall.java:81)
2026-08-26T17:39:05.5156827Z ##[error]at org.sonarsource.scanner.api.internal.ServerConnection.callUrl(ServerConnection.java:115)
	at org.sonarsource.scanner.api.internal.ServerConnection.downloadString(ServerConnection.java:99)
2026-08-26T17:39:05.5157289Z 	at org.sonarsource.scanner.api.internal.ServerConnection.callUrl(ServerConnection.java:115)
2026-08-26T17:39:05.5157498Z 	at org.sonarsource.scanner.api.internal.ServerConnection.downloadString(ServerConnection.java:99)
2026-08-26T17:39:05.5157931Z ##[error]at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:39)
	... 10 more
2026-08-26T17:39:05.5158321Z 	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:39)
2026-08-26T17:39:05.5158485Z 	... 10 more
2026-08-26T17:39:05.5158863Z ##[error]Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:39:05.5159292Z Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:39:05.5159708Z ##[error]at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:385)
2026-08-26T17:39:05.5160058Z 	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:385)
2026-08-26T17:39:05.5160803Z ##[error]at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:290)
	at java.base/sun.security.validator.Validator.validate(Validator.java:264)
2026-08-26T17:39:05.5161345Z 	at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:290)
2026-08-26T17:39:05.5161543Z 	at java.base/sun.security.validator.Validator.validate(Validator.java:264)
2026-08-26T17:39:05.5162016Z ##[error]at java.base/sun.security.ssl.X509TrustManagerImpl.validate(X509TrustManagerImpl.java:321)
	at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:221)
2026-08-26T17:39:05.5162450Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.validate(X509TrustManagerImpl.java:321)
2026-08-26T17:39:05.5162658Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:221)
2026-08-26T17:39:05.5163030Z ##[error]at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:129)
2026-08-26T17:39:05.5163455Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:129)
2026-08-26T17:39:05.5164057Z ##[error]at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1313)
	... 43 more
2026-08-26T17:39:05.5164511Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1313)
2026-08-26T17:39:05.5164687Z 	... 43 more
2026-08-26T17:39:05.5165228Z ##[error]Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
	at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:141)
2026-08-26T17:39:05.5165661Z Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:39:05.5165923Z 	at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:141)
2026-08-26T17:39:05.5166495Z ##[error]at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:126)
	at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:380)
	... 49 more
2026-08-26T17:39:05.5167004Z 	at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:126)
2026-08-26T17:39:05.5167212Z 	at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
2026-08-26T17:39:05.5167413Z 	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:380)
2026-08-26T17:39:05.5167561Z 	... 49 more
2026-08-26T17:39:05.5313942Z Process returned exit code 1
2026-08-26T17:39:05.5344303Z ##[error]The SonarScanner did not complete successfully
2026-08-26T17:39:05.5344951Z The SonarScanner did not complete successfully
2026-08-26T17:39:05.5346367Z ##[error]14:39:05.534  Post-processing failed. Exit code: 1
2026-08-26T17:39:05.5347098Z 14:39:05.534  Post-processing failed. Exit code: 1
2026-08-26T17:39:05.5428026Z ##[error]The process '/opt/ads-agent/cache-tools/.dotnet//dotnet' failed with exit code 1
2026-08-26T17:39:05.5457740Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 5 out of 10) after 25000 ms
2026-08-26T17:39:30.6610274Z [command]/opt/ads-agent/cache-tools/.dotnet//dotnet /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/SonarScanner.MSBuild.dll end
2026-08-26T17:39:30.7313370Z SonarScanner for MSBuild 5.8
2026-08-26T17:39:30.7314000Z Using the .NET Core version of the Scanner for MSBuild
2026-08-26T17:39:30.7853344Z Post-processing started.
2026-08-26T17:39:30.8540426Z 14:39:30.853  14:39:30.835  /opt/ads-agent/_work/6/.sonarqube/bin/targets/SonarQube.Integration.targets does not exist
2026-08-26T17:39:30.8540954Z 14:39:30.853  14:39:30.853  sonar.verbose=true was specified - setting the log verbosity to 'Debug'
2026-08-26T17:39:30.8541262Z 14:39:30.853  Loading the SonarQube analysis config from /opt/ads-agent/_work/6/.sonarqube/conf/SonarQubeAnalysisConfig.xml
2026-08-26T17:39:30.8541464Z 14:39:30.853  Not running under TeamBuild
2026-08-26T17:39:30.8541707Z 14:39:30.854  Analysis base directory: /opt/ads-agent/_work/6/.sonarqube
2026-08-26T17:39:30.8541851Z Build directory: 
2026-08-26T17:39:30.8542036Z Bin directory: /opt/ads-agent/_work/6/.sonarqube/bin
2026-08-26T17:39:30.8542245Z Config directory: /opt/ads-agent/_work/6/.sonarqube/conf
2026-08-26T17:39:30.8542459Z Output directory: /opt/ads-agent/_work/6/.sonarqube/out
2026-08-26T17:39:30.8542693Z Config file: /opt/ads-agent/_work/6/.sonarqube/conf/SonarQubeAnalysisConfig.xml
2026-08-26T17:39:30.8553591Z 14:39:30.855  Generating SonarQube project properties file to /opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties
2026-08-26T17:39:30.8720260Z 14:39:30.871  Setting analysis property: sonar.visualstudio.enable=false
2026-08-26T17:39:30.8898570Z 14:39:30.889  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/0/Issues.json
2026-08-26T17:39:30.8932203Z 14:39:30.893  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/1/Issues.json
2026-08-26T17:39:30.8964208Z 14:39:30.896  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/2/Issues.json
2026-08-26T17:39:30.9067145Z 14:39:30.906  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/3/Issues.json
2026-08-26T17:39:30.9097628Z 14:39:30.909  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/4/Issues.json
2026-08-26T17:39:30.9129164Z 14:39:30.912  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/5/Issues.json
2026-08-26T17:39:30.9144047Z 14:39:30.914  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/6/Issues.json
2026-08-26T17:39:30.9152440Z 14:39:30.915  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/7/Issues.json
2026-08-26T17:39:30.9251895Z 14:39:30.924  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/8/Issues.json
2026-08-26T17:39:30.9351825Z 14:39:30.934  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/9/Issues.json
2026-08-26T17:39:30.9380084Z 14:39:30.937  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/10/Issues.json
2026-08-26T17:39:30.9517311Z 14:39:30.951  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/11/Issues.json
2026-08-26T17:39:30.9540631Z 14:39:30.953  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/12/Issues.json
2026-08-26T17:39:30.9565128Z 14:39:30.956  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/13/Issues.json
2026-08-26T17:39:30.9573441Z 14:39:30.957  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/14/Issues.json
2026-08-26T17:39:30.9651226Z 14:39:30.964  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/15/Issues.json
2026-08-26T17:39:30.9675831Z 14:39:30.967  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/16/Issues.json
2026-08-26T17:39:30.9700773Z 14:39:30.969  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/17/Issues.json
2026-08-26T17:39:30.9709759Z 14:39:30.97  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/18/Issues.json
2026-08-26T17:39:30.9717688Z 14:39:30.971  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/19/Issues.json
2026-08-26T17:39:30.9721436Z 14:39:30.972  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/20/Issues.json
2026-08-26T17:39:30.9799454Z 14:39:30.979  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/21/Issues.json
2026-08-26T17:39:30.9823166Z 14:39:30.982  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/22/Issues.json
2026-08-26T17:39:30.9848146Z 14:39:30.984  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/23/Issues.json
2026-08-26T17:39:30.9856379Z 14:39:30.985  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/24/Issues.json
2026-08-26T17:39:30.9864497Z 14:39:30.986  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/25/Issues.json
2026-08-26T17:39:30.9867592Z 14:39:30.986  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/26/Issues.json
2026-08-26T17:39:30.9972288Z 14:39:30.996  Using longest common projects path as a base directory: '/opt/ads-agent/_work/6/s'.
2026-08-26T17:39:31.0070724Z 14:39:31.006  File was referenced by the following projects: '/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/TesteSimovBatch.csproj', '/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/TesteSimovBatch.csproj'.
2026-08-26T17:39:31.0170923Z 14:39:31.011  Dumping content of sonar-project.properties
2026-08-26T17:39:31.0171468Z ------------------------------------------------------------------------
2026-08-26T17:39:31.0172384Z sonar.projectKey=SIMOV-imoveiscaixa-batch
2026-08-26T17:39:31.0172795Z sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar
2026-08-26T17:39:31.0173117Z sonar.projectBaseDir=/opt/ads-agent/_work/6/s
2026-08-26T17:39:31.0173222Z 
2026-08-26T17:39:31.0179790Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectKey=SIMOV-imoveiscaixa-batch:0B395246-F58A-479C-B0B1-C6A6045C6FD3
2026-08-26T17:39:31.0180145Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectName=Simov.Core
2026-08-26T17:39:31.0180413Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:39:31.0180650Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.sourceEncoding=utf-8
2026-08-26T17:39:31.0180896Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.sources=\
2026-08-26T17:39:31.0181184Z "/opt/ads-agent/_work/6/s/src/Simov.Core/AutenticacaoSso/AutenticacarSso.cs",\
2026-08-26T17:39:31.0181517Z "/opt/ads-agent/_work/6/s/src/Simov.Core/AutenticacaoSso/IAutenticacarSso.cs",\
2026-08-26T17:39:31.0181842Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Data/IBaseRepository.cs",\
2026-08-26T17:39:31.0182124Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Data/IUnitOfWork.cs",\
2026-08-26T17:39:31.0182425Z "/opt/ads-agent/_work/6/s/src/Simov.Core/DomainObjects/Entity.cs",\
2026-08-26T17:39:31.0182735Z "/opt/ads-agent/_work/6/s/src/Simov.Core/DomainObjects/IAggregateRoot.cs",\
2026-08-26T17:39:31.0183055Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/ApplicationException.cs",\
2026-08-26T17:39:31.0183379Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/CancellationException.cs",\
2026-08-26T17:39:31.0185926Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/EntityValidationException.cs",\
2026-08-26T17:39:31.0186225Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/GenericException.cs",\
2026-08-26T17:39:31.0186478Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/NotFoundException.cs",\
2026-08-26T17:39:31.0186713Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/ProcessamentoException.cs",\
2026-08-26T17:39:31.0186955Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/RelatedAggregateException.cs",\
2026-08-26T17:39:31.0187187Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/UnauthorizedException.cs",\
2026-08-26T17:39:31.0187405Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Logging/LoggerExtensions.cs",\
2026-08-26T17:39:31.0187628Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siico/ApiSiicoRestPrivado.cs",\
2026-08-26T17:39:31.0187853Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siico/ApiSiicoRestPublico.cs",\
2026-08-26T17:39:31.0188075Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siiso/ApiSiisoRestPublico.cs",\
2026-08-26T17:39:31.0188295Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/DadosDto.cs",\
2026-08-26T17:39:31.0188518Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/DadosSimilDto.cs",\
2026-08-26T17:39:31.0188904Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/FotosDto.cs",\
2026-08-26T17:39:31.0189347Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/ListaFotoDto.cs",\
2026-08-26T17:39:31.0189575Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/ISOAPWeb.cs",\
2026-08-26T17:39:31.0189813Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/RobustSoapDeserializer.cs",\
2026-08-26T17:39:31.0190042Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/SOAPWeb.cs",\
2026-08-26T17:39:31.0190254Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/ResponseGenerico.cs",\
2026-08-26T17:39:31.0190479Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/BairroDetalhadoSiico.cs",\
2026-08-26T17:39:31.0190701Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/BairroSiico.cs",\
2026-08-26T17:39:31.0191030Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/CepSiico.cs",\
2026-08-26T17:39:31.0191248Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/LocalidadeSiico.cs",\
2026-08-26T17:39:31.0191478Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioCompletoSiico.cs",\
2026-08-26T17:39:31.0191712Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioParcialSiico.cs",\
2026-08-26T17:39:31.0191935Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioSiico.cs",\
2026-08-26T17:39:31.0192159Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/TipoLogradouroSiico.cs",\
2026-08-26T17:39:31.0192375Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/UnidadeCaixa.cs",\
2026-08-26T17:39:31.0192600Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/UnidadeFederacaoSiico.cs",\
2026-08-26T17:39:31.0192823Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/EnderecoPessoaSiiso.cs",\
2026-08-26T17:39:31.0193059Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/LocalidadeNascimentoSiiso.cs",\
2026-08-26T17:39:31.0193423Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/PessoaSiiso.cs",\
2026-08-26T17:39:31.0193741Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siico/IApiSiicoRestPrivado.cs",\
2026-08-26T17:39:31.0193999Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siico/IApiSiicoRestPublico.cs",\
2026-08-26T17:39:31.0194333Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siiso/IApiSiisoRestPublico.cs"
2026-08-26T17:39:31.0194415Z 
2026-08-26T17:39:31.0194637Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:31.0195006Z "/opt/ads-agent/_work/6/.sonarqube/out/0"
2026-08-26T17:39:31.0195322Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:31.0195626Z "/opt/ads-agent/_work/6/.sonarqube/out/0/Issues.json"
2026-08-26T17:39:31.0195698Z 
2026-08-26T17:39:31.0195926Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod0
2026-08-26T17:39:31.0196240Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectKey=SIMOV-imoveiscaixa-batch:5E55366D-25CB-4B0F-BAF4-738003A18ED2
2026-08-26T17:39:31.0196614Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectName=Simov.Domain
2026-08-26T17:39:31.0196978Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:39:31.0197305Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.sourceEncoding=utf-8
2026-08-26T17:39:31.0197608Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.sources=\
2026-08-26T17:39:31.0197922Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AgrupamentoVendaImovel.cs",\
2026-08-26T17:39:31.0198252Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaArquivoLote.cs",\
2026-08-26T17:39:31.0198568Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaFotoImovel.cs",\
2026-08-26T17:39:31.0198796Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaFotoLote.cs",\
2026-08-26T17:39:31.0199016Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaUsuario.cs",\
2026-08-26T17:39:31.0199235Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AvaliacaoImovel.cs",\
2026-08-26T17:39:31.0199444Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/ComodoImovel.cs",\
2026-08-26T17:39:31.0199794Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/ControleProcessamento.cs",\
2026-08-26T17:39:31.0200008Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/DadoContabil.cs",\
2026-08-26T17:39:31.0200214Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/FotoImovel.cs",\
2026-08-26T17:39:31.0200441Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoAgrupamentoVendaImovel.cs",\
2026-08-26T17:39:31.0200671Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoAvaliacaoImovel.cs",\
2026-08-26T17:39:31.0200892Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoComodoImovel.cs",\
2026-08-26T17:39:31.0201112Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoDadoContabil.cs",\
2026-08-26T17:39:31.0201390Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoImovel.cs",\
2026-08-26T17:39:31.0201609Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoMatriculaImovel.cs",\
2026-08-26T17:39:31.0201819Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/Imovel.cs",\
2026-08-26T17:39:31.0202037Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/MatriculaImovel.cs",\
2026-08-26T17:39:31.0202264Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/MensagemControleProcessamento.cs",\
2026-08-26T17:39:31.0202485Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/RotinaProcessamento.cs",\
2026-08-26T17:39:31.0202720Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/ClassificacaoImovelEnum.cs",\
2026-08-26T17:39:31.0202937Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/EstadoConservacaoEnum.cs",\
2026-08-26T17:39:31.0203163Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/FuncionalidadeSistemaEnum.cs",\
2026-08-26T17:39:31.0203381Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/IcAcaoSistemaEnum.cs",\
2026-08-26T17:39:31.0203592Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/IcShortEnum.cs",\
2026-08-26T17:39:31.0203918Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/MotivoExclusaoEnum.cs",\
2026-08-26T17:39:31.0204141Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/OrgaoProprietarioImovelEnum.cs",\
2026-08-26T17:39:31.0204357Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/OrigemImovelEnum.cs",\
2026-08-26T17:39:31.0204587Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/ResultadoMensagemProcessamentoEnum.cs",\
2026-08-26T17:39:31.0204810Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/RotinaProcessamentoEnum.cs",\
2026-08-26T17:39:31.0205024Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/SituacaoImovelEnum.cs",\
2026-08-26T17:39:31.0205305Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/SituacaoProcessamentoEnum.cs",\
2026-08-26T17:39:31.0205537Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoCampoEnum.cs",\
2026-08-26T17:39:31.0205748Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoComodoEnum.cs",\
2026-08-26T17:39:31.0205960Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoImovelEnum.cs",\
2026-08-26T17:39:31.0206188Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoMatriculaEnum.cs",\
2026-08-26T17:39:31.0206453Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAgrupamentoVendaImovelRepository.cs",\
2026-08-26T17:39:31.0206694Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaArquivoLoteRepository.cs",\
2026-08-26T17:39:31.0206933Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaFotoImovelRepository.cs",\
2026-08-26T17:39:31.0207171Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaFotoLoteRepository.cs",\
2026-08-26T17:39:31.0207404Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaUsuarioRepository.cs",\
2026-08-26T17:39:31.0207636Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAvaliacaoImovelRepository.cs",\
2026-08-26T17:39:31.0207980Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IComodoImovelRepository.cs",\
2026-08-26T17:39:31.0208339Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IControleProcessamentoRepository.cs",\
2026-08-26T17:39:31.0208690Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IDadoContabilRepository.cs",\
2026-08-26T17:39:31.0209149Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IFotoImovelRepository.cs",\
2026-08-26T17:39:31.0209515Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IGeradorHistorico.cs",\
2026-08-26T17:39:31.0209743Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IImovelRepository.cs",\
2026-08-26T17:39:31.0209969Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IMatriculaImovelRepository.cs",\
2026-08-26T17:39:31.0210215Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IMensagemControleProcessamentoRepository.cs",\
2026-08-26T17:39:31.0210469Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IRotinaProcessamentoRepository.cs",\
2026-08-26T17:39:31.0210750Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/BaseArquivoLayout.cs",\
2026-08-26T17:39:31.0210963Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/SiaciLayout.cs",\
2026-08-26T17:39:31.0211172Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/SiopiLayout.cs"
2026-08-26T17:39:31.0211242Z 
2026-08-26T17:39:31.0211441Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:31.0211637Z "/opt/ads-agent/_work/6/.sonarqube/out/1"
2026-08-26T17:39:31.0211850Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:31.0212054Z "/opt/ads-agent/_work/6/.sonarqube/out/1/Issues.json"
2026-08-26T17:39:31.0212125Z 
2026-08-26T17:39:31.0212350Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod1
2026-08-26T17:39:31.0212667Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectKey=SIMOV-imoveiscaixa-batch:0847F1F3-B5DA-4FC3-8EEF-882D75A674FD
2026-08-26T17:39:31.0212937Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectName=Simov.Application
2026-08-26T17:39:31.0213198Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:39:31.0213438Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.sourceEncoding=utf-8
2026-08-26T17:39:31.0213903Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.sources=\
2026-08-26T17:39:31.0214160Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Contexts/FileProcessingContext.cs",\
2026-08-26T17:39:31.0214397Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Contexts/SiicoCallCounterContext.cs",\
2026-08-26T17:39:31.0214620Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/AvaliacaoImovelDto.cs",\
2026-08-26T17:39:31.0214839Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/DadoContabilDto.cs",\
2026-08-26T17:39:31.0215054Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/EnderecoDto.cs",\
2026-08-26T17:39:31.0215274Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/ImovelDto.cs",\
2026-08-26T17:39:31.0215496Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/MatriculaImovelDto.cs",\
2026-08-26T17:39:31.0215709Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/MunicipioDto.cs",\
2026-08-26T17:39:31.0216002Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/SiaciDDQDto.cs",\
2026-08-26T17:39:31.0216313Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/TipoLogradouroDto.cs",\
2026-08-26T17:39:31.0216611Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ICargaFotoImovelService.cs",\
2026-08-26T17:39:31.0216953Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ICargaImovelService.cs",\
2026-08-26T17:39:31.0217296Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IFileService.cs",\
2026-08-26T17:39:31.0217539Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSiaciUseCase.cs",\
2026-08-26T17:39:31.0217777Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSimilFotoUseCase.cs",\
2026-08-26T17:39:31.0218008Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSimilUseCase.cs",\
2026-08-26T17:39:31.0218231Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSiopiUseCase.cs",\
2026-08-26T17:39:31.0218539Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ILeituraService.cs",\
2026-08-26T17:39:31.0218980Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ILogProcessamentoService.cs",\
2026-08-26T17:39:31.0219332Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IMapperDataService.cs",\
2026-08-26T17:39:31.0219673Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ISiaciDDQUseCase.cs",\
2026-08-26T17:39:31.0219911Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IWorkerImovelService.cs",\
2026-08-26T17:39:31.0220142Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/CargaImovelService.cs",\
2026-08-26T17:39:31.0220361Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/FileService.cs",\
2026-08-26T17:39:31.0220634Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/LeituraService.cs",\
2026-08-26T17:39:31.0220863Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/LogProcessamentoService.cs",\
2026-08-26T17:39:31.0221086Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/MapperDataService.cs",\
2026-08-26T17:39:31.0221315Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/WorkerImovelService.cs",\
2026-08-26T17:39:31.0221542Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSiaciUseCase.cs",\
2026-08-26T17:39:31.0221767Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSimilFotoUseCase.cs",\
2026-08-26T17:39:31.0221994Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSimilUseCase.cs",\
2026-08-26T17:39:31.0222214Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSiopiUseCase.cs",\
2026-08-26T17:39:31.0222437Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/SiaciDDQUseCase.cs"
2026-08-26T17:39:31.0222519Z 
2026-08-26T17:39:31.0222715Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:31.0222907Z "/opt/ads-agent/_work/6/.sonarqube/out/2"
2026-08-26T17:39:31.0223229Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:31.0223539Z "/opt/ads-agent/_work/6/.sonarqube/out/2/Issues.json"
2026-08-26T17:39:31.0223763Z 
2026-08-26T17:39:31.0224048Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod2
2026-08-26T17:39:31.0224370Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectKey=SIMOV-imoveiscaixa-batch:D745E52F-7A66-4C38-B30D-3A27EA75CCCE
2026-08-26T17:39:31.0224630Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectName=Simov.Core
2026-08-26T17:39:31.0224874Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:39:31.0225105Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.sourceEncoding=utf-8
2026-08-26T17:39:31.0225311Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.sources=\
2026-08-26T17:39:31.0225375Z 
2026-08-26T17:39:31.0225420Z 
2026-08-26T17:39:31.0225614Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:31.0225810Z "/opt/ads-agent/_work/6/.sonarqube/out/3"
2026-08-26T17:39:31.0226017Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:31.0226224Z "/opt/ads-agent/_work/6/.sonarqube/out/3/Issues.json"
2026-08-26T17:39:31.0226285Z 
2026-08-26T17:39:31.0226510Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod3
2026-08-26T17:39:31.0226810Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectKey=SIMOV-imoveiscaixa-batch:FBCB055E-203B-4979-BB94-B02AE276DE0B
2026-08-26T17:39:31.0227067Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectName=Simov.Domain
2026-08-26T17:39:31.0227312Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:39:31.0227553Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.sourceEncoding=utf-8
2026-08-26T17:39:31.0227760Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.sources=\
2026-08-26T17:39:31.0227824Z 
2026-08-26T17:39:31.0227859Z 
2026-08-26T17:39:31.0228048Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:31.0228315Z "/opt/ads-agent/_work/6/.sonarqube/out/4"
2026-08-26T17:39:31.0228521Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:31.0228734Z "/opt/ads-agent/_work/6/.sonarqube/out/4/Issues.json"
2026-08-26T17:39:31.0228794Z 
2026-08-26T17:39:31.0229018Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod4
2026-08-26T17:39:31.0229322Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectKey=SIMOV-imoveiscaixa-batch:D6E1F89D-8BFA-426E-BC94-C1182DBD0621
2026-08-26T17:39:31.0229590Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectName=Simov.Application
2026-08-26T17:39:31.0229854Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:39:31.0230137Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.sourceEncoding=utf-8
2026-08-26T17:39:31.0230346Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.sources=\
2026-08-26T17:39:31.0230416Z 
2026-08-26T17:39:31.0230456Z 
2026-08-26T17:39:31.0230647Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:31.0230845Z "/opt/ads-agent/_work/6/.sonarqube/out/5"
2026-08-26T17:39:31.0231056Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:31.0231373Z "/opt/ads-agent/_work/6/.sonarqube/out/5/Issues.json"
2026-08-26T17:39:31.0231476Z 
2026-08-26T17:39:31.0231804Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod5
2026-08-26T17:39:31.0232250Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectKey=SIMOV-imoveiscaixa-batch:AD78E470-A67C-4901-A53F-E3D7D40350CD
2026-08-26T17:39:31.0232584Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:39:31.0232844Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:39:31.0233080Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.sourceEncoding=utf-8
2026-08-26T17:39:31.0233288Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.sources=\
2026-08-26T17:39:31.0233570Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Common/BaseRepository.cs",\
2026-08-26T17:39:31.0234067Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Common/UnitOfWork.cs",\
2026-08-26T17:39:31.0234383Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Interceptor/HistoricosInterceptor.cs",\
2026-08-26T17:39:31.0234637Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AgrupamentoVendaImovelConfiguration.cs",\
2026-08-26T17:39:31.0234893Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaArquivoLoteConfiguration.cs",\
2026-08-26T17:39:31.0235263Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaFotoImovelConfiguration.cs",\
2026-08-26T17:39:31.0235588Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaFotoLoteConfiguration.cs",\
2026-08-26T17:39:31.0235836Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaUsuarioConfiguration.cs",\
2026-08-26T17:39:31.0236079Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AvaliacaoImovelConfiguration.cs",\
2026-08-26T17:39:31.0236321Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ComodoImovelConfiguration.cs",\
2026-08-26T17:39:31.0236568Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ControleProcessamentoConfiguration.cs",\
2026-08-26T17:39:31.0236878Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/DadoContabilConfiguration.cs",\
2026-08-26T17:39:31.0237120Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/FotoImovelConfiguration.cs",\
2026-08-26T17:39:31.0237372Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoAgrupamentoVendaImovelConfiguration.cs",\
2026-08-26T17:39:31.0237633Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoAvaliacaoImovelConfiguration.cs",\
2026-08-26T17:39:31.0237884Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoComodoImovelConfiguration.cs",\
2026-08-26T17:39:31.0238243Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoDadoContabilConfiguration.cs",\
2026-08-26T17:39:31.0238496Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoImovelConfiguration.cs",\
2026-08-26T17:39:31.0238759Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoMatriculaImovelConfiguration.cs",\
2026-08-26T17:39:31.0239002Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ImovelConfiguration.cs",\
2026-08-26T17:39:31.0239240Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/MatriculaImovelConfiguration.cs",\
2026-08-26T17:39:31.0239492Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/MensagemControleProcessamentoConfiguration.cs",\
2026-08-26T17:39:31.0239902Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/RotinaProcessamentoConfiguration.cs",\
2026-08-26T17:39:31.0240247Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AgrupamentoVendaImovelRepository.cs",\
2026-08-26T17:39:31.0240617Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaArquivoLoteRepository.cs",\
2026-08-26T17:39:31.0240974Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaFotoImovelRepository.cs",\
2026-08-26T17:39:31.0241353Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaFotoLoteRepository.cs",\
2026-08-26T17:39:31.0241614Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaUsuarioRepository.cs",\
2026-08-26T17:39:31.0241859Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AvaliacaoImovelRepository.cs",\
2026-08-26T17:39:31.0242095Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ComodoImovelRepository.cs",\
2026-08-26T17:39:31.0242362Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ControleProcessamentoRepository.cs",\
2026-08-26T17:39:31.0242604Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/DadoContabilRepository.cs",\
2026-08-26T17:39:31.0242844Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/FotoImovelRepository.cs",\
2026-08-26T17:39:31.0243084Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ImovelRepository.cs",\
2026-08-26T17:39:31.0243326Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/MatriculaImovelRepository.cs",\
2026-08-26T17:39:31.0243578Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/MensagemControleProcessamentoRepository.cs",\
2026-08-26T17:39:31.0243926Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/RotinaProcessamentoRepository.cs",\
2026-08-26T17:39:31.0244150Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/SimovDbContext.cs"
2026-08-26T17:39:31.0244228Z 
2026-08-26T17:39:31.0244423Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:31.0244744Z "/opt/ads-agent/_work/6/.sonarqube/out/6"
2026-08-26T17:39:31.0245020Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:31.0245228Z "/opt/ads-agent/_work/6/.sonarqube/out/6/Issues.json"
2026-08-26T17:39:31.0245291Z 
2026-08-26T17:39:31.0245521Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod6
2026-08-26T17:39:31.0245829Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectKey=SIMOV-imoveiscaixa-batch:B904AD47-4763-413C-9324-7889FD92EFA6
2026-08-26T17:39:31.0246093Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectName=Simov.Batch
2026-08-26T17:39:31.0246340Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:39:31.0246573Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.sourceEncoding=utf-8
2026-08-26T17:39:31.0246787Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.sources=\
2026-08-26T17:39:31.0247019Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/AddHeadersHttpClient.cs",\
2026-08-26T17:39:31.0247257Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/ConnectionsConfiguration.cs",\
2026-08-26T17:39:31.0247494Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/HttpClientConfiguration.cs",\
2026-08-26T17:39:31.0247799Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/IApiSiisoRestPrivado.cs",\
2026-08-26T17:39:31.0248035Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/UseCasesConfiguration.cs",\
2026-08-26T17:39:31.0248259Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderImoveisSiaci.cs",\
2026-08-26T17:39:31.0248478Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderImoveisSiopi.cs",\
2026-08-26T17:39:31.0248699Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderLeilaoSiaciDDQ.cs",\
2026-08-26T17:39:31.0248911Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Program.cs",\
2026-08-26T17:39:31.0249173Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Workers/WorkerFotoImoveisSimil.cs",\
2026-08-26T17:39:31.0249391Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Workers/WorkerImoveisSimil.cs",\
2026-08-26T17:39:31.0249626Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/Simov.Batch.GlobalUsings.g.cs",\
2026-08-26T17:39:31.0249890Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/.NETCoreApp,Version=v8.0.AssemblyAttributes.cs",\
2026-08-26T17:39:31.0250144Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/Simov.Batch.AssemblyInfo.cs",\
2026-08-26T17:39:31.0250377Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/appsettings.Development.json",\
2026-08-26T17:39:31.0250584Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/appsettings.json",\
2026-08-26T17:39:31.0250795Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Properties/launchSettings.json",\
2026-08-26T17:39:31.0251007Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/apphost"
2026-08-26T17:39:31.0251075Z 
2026-08-26T17:39:31.0251275Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:31.0251471Z "/opt/ads-agent/_work/6/.sonarqube/out/7"
2026-08-26T17:39:31.0251679Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:31.0251880Z "/opt/ads-agent/_work/6/.sonarqube/out/7/Issues.json"
2026-08-26T17:39:31.0251949Z 
2026-08-26T17:39:31.0252170Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod7
2026-08-26T17:39:31.0252476Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectKey=SIMOV-imoveiscaixa-batch:6679F22B-144A-4C59-A28C-2A87F31E3915
2026-08-26T17:39:31.0252741Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectName=Simov.Core
2026-08-26T17:39:31.0252992Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:39:31.0253225Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.sourceEncoding=utf-8
2026-08-26T17:39:31.0253430Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.sources=\
2026-08-26T17:39:31.0253503Z 
2026-08-26T17:39:31.0253539Z 
2026-08-26T17:39:31.0253811Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:31.0254014Z "/opt/ads-agent/_work/6/.sonarqube/out/8"
2026-08-26T17:39:31.0254224Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:31.0254451Z "/opt/ads-agent/_work/6/.sonarqube/out/8/Issues.json"
2026-08-26T17:39:31.0254512Z 
2026-08-26T17:39:31.0254758Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod8
2026-08-26T17:39:31.0255085Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectKey=SIMOV-imoveiscaixa-batch:EC78B0BC-170C-482C-867B-C5402B449403
2026-08-26T17:39:31.0255338Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectName=Simov.Core
2026-08-26T17:39:31.0255765Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:39:31.0256004Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.sourceEncoding=utf-8
2026-08-26T17:39:31.0256212Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.sources=\
2026-08-26T17:39:31.0256275Z 
2026-08-26T17:39:31.0256318Z 
2026-08-26T17:39:31.0256584Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:31.0256930Z "/opt/ads-agent/_work/6/.sonarqube/out/9"
2026-08-26T17:39:31.0257251Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:31.0257533Z "/opt/ads-agent/_work/6/.sonarqube/out/9/Issues.json"
2026-08-26T17:39:31.0257628Z 
2026-08-26T17:39:31.0257869Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod9
2026-08-26T17:39:31.0258173Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectKey=SIMOV-imoveiscaixa-batch:1B2C05E0-E98F-477C-931D-923BBE79AE4E
2026-08-26T17:39:31.0258434Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectName=Simov.Domain
2026-08-26T17:39:31.0258688Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:39:31.0258976Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.sourceEncoding=utf-8
2026-08-26T17:39:31.0259185Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.sources=\
2026-08-26T17:39:31.0259250Z 
2026-08-26T17:39:31.0259285Z 
2026-08-26T17:39:31.0259479Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:31.0259674Z "/opt/ads-agent/_work/6/.sonarqube/out/10"
2026-08-26T17:39:31.0259894Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:31.0260098Z "/opt/ads-agent/_work/6/.sonarqube/out/10/Issues.json"
2026-08-26T17:39:31.0260164Z 
2026-08-26T17:39:31.0260389Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod10
2026-08-26T17:39:31.0260697Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectKey=SIMOV-imoveiscaixa-batch:A180ED2D-1521-44A6-B6EA-5DDEC55D2C17
2026-08-26T17:39:31.0260963Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectName=Simov.Core
2026-08-26T17:39:31.0261217Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:39:31.0261456Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.sourceEncoding=utf-8
2026-08-26T17:39:31.0261669Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.sources=\
2026-08-26T17:39:31.0261749Z 
2026-08-26T17:39:31.0261784Z 
2026-08-26T17:39:31.0261974Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:31.0262171Z "/opt/ads-agent/_work/6/.sonarqube/out/11"
2026-08-26T17:39:31.0262519Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:31.0262725Z "/opt/ads-agent/_work/6/.sonarqube/out/11/Issues.json"
2026-08-26T17:39:31.0262851Z 
2026-08-26T17:39:31.0263102Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod11
2026-08-26T17:39:31.0263411Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectKey=SIMOV-imoveiscaixa-batch:A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E
2026-08-26T17:39:31.0263739Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectName=Simov.Domain
2026-08-26T17:39:31.0263999Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:39:31.0264232Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.sourceEncoding=utf-8
2026-08-26T17:39:31.0264432Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.sources=\
2026-08-26T17:39:31.0264504Z 
2026-08-26T17:39:31.0264538Z 
2026-08-26T17:39:31.0264723Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:31.0264915Z "/opt/ads-agent/_work/6/.sonarqube/out/12"
2026-08-26T17:39:31.0265119Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:31.0265321Z "/opt/ads-agent/_work/6/.sonarqube/out/12/Issues.json"
2026-08-26T17:39:31.0265382Z 
2026-08-26T17:39:31.0265614Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod12
2026-08-26T17:39:31.0265922Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectKey=SIMOV-imoveiscaixa-batch:00300450-28FA-4EA9-8A96-181ED44DCA26
2026-08-26T17:39:31.0266184Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectName=Simov.Application
2026-08-26T17:39:31.0266442Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:39:31.0266733Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.sourceEncoding=utf-8
2026-08-26T17:39:31.0266938Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.sources=\
2026-08-26T17:39:31.0267002Z 
2026-08-26T17:39:31.0267045Z 
2026-08-26T17:39:31.0267234Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:31.0267423Z "/opt/ads-agent/_work/6/.sonarqube/out/13"
2026-08-26T17:39:31.0267635Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:31.0267835Z "/opt/ads-agent/_work/6/.sonarqube/out/13/Issues.json"
2026-08-26T17:39:31.0267934Z 
2026-08-26T17:39:31.0268160Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod13
2026-08-26T17:39:31.0268462Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectKey=SIMOV-imoveiscaixa-batch:1393E257-1007-43DE-B94C-0B0508C0B309
2026-08-26T17:39:31.0268733Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:39:31.0269002Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:39:31.0269239Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.sourceEncoding=utf-8
2026-08-26T17:39:31.0269442Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.sources=\
2026-08-26T17:39:31.0269507Z 
2026-08-26T17:39:31.0269541Z 
2026-08-26T17:39:31.0269731Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:31.0269930Z "/opt/ads-agent/_work/6/.sonarqube/out/14"
2026-08-26T17:39:31.0270136Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:31.0270341Z "/opt/ads-agent/_work/6/.sonarqube/out/14/Issues.json"
2026-08-26T17:39:31.0270401Z 
2026-08-26T17:39:31.0270623Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod14
2026-08-26T17:39:31.0270927Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectKey=SIMOV-imoveiscaixa-batch:5BE00443-BD63-4C9F-A707-406F2AC94762
2026-08-26T17:39:31.0271184Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectName=Simov.Core
2026-08-26T17:39:31.0271427Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:39:31.0271768Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.sourceEncoding=utf-8
2026-08-26T17:39:31.0271983Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.sources=\
2026-08-26T17:39:31.0272057Z 
2026-08-26T17:39:31.0272091Z 
2026-08-26T17:39:31.0272281Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:31.0272474Z "/opt/ads-agent/_work/6/.sonarqube/out/15"
2026-08-26T17:39:31.0272715Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:31.0272920Z "/opt/ads-agent/_work/6/.sonarqube/out/15/Issues.json"
2026-08-26T17:39:31.0272991Z 
2026-08-26T17:39:31.0273214Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod15
2026-08-26T17:39:31.0273518Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectKey=SIMOV-imoveiscaixa-batch:A79CA783-37A2-49D3-B56C-D9102F046AF9
2026-08-26T17:39:31.0273841Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectName=Simov.Domain
2026-08-26T17:39:31.0274091Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:39:31.0274320Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.sourceEncoding=utf-8
2026-08-26T17:39:31.0274524Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.sources=\
2026-08-26T17:39:31.0274595Z 
2026-08-26T17:39:31.0274630Z 
2026-08-26T17:39:31.0274819Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:31.0275008Z "/opt/ads-agent/_work/6/.sonarqube/out/16"
2026-08-26T17:39:31.0275218Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:31.0275421Z "/opt/ads-agent/_work/6/.sonarqube/out/16/Issues.json"
2026-08-26T17:39:31.0275549Z 
2026-08-26T17:39:31.0275772Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod16
2026-08-26T17:39:31.0276073Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectKey=SIMOV-imoveiscaixa-batch:51ABFD24-E14F-4155-B9D7-CDBD0E536AAB
2026-08-26T17:39:31.0276334Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectName=Simov.Application
2026-08-26T17:39:31.0276590Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:39:31.0276827Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.sourceEncoding=utf-8
2026-08-26T17:39:31.0277030Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.sources=\
2026-08-26T17:39:31.0277132Z 
2026-08-26T17:39:31.0277174Z 
2026-08-26T17:39:31.0277366Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:31.0277558Z "/opt/ads-agent/_work/6/.sonarqube/out/17"
2026-08-26T17:39:31.0277766Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:31.0277974Z "/opt/ads-agent/_work/6/.sonarqube/out/17/Issues.json"
2026-08-26T17:39:31.0278032Z 
2026-08-26T17:39:31.0278252Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod17
2026-08-26T17:39:31.0278562Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectKey=SIMOV-imoveiscaixa-batch:F2842708-9CF5-4649-B3A8-6D39E5E01B77
2026-08-26T17:39:31.0278968Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:39:31.0279228Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:39:31.0279466Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.sourceEncoding=utf-8
2026-08-26T17:39:31.0279669Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.sources=\
2026-08-26T17:39:31.0279741Z 
2026-08-26T17:39:31.0279776Z 
2026-08-26T17:39:31.0279964Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:31.0280159Z "/opt/ads-agent/_work/6/.sonarqube/out/18"
2026-08-26T17:39:31.0280365Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:31.0280566Z "/opt/ads-agent/_work/6/.sonarqube/out/18/Issues.json"
2026-08-26T17:39:31.0280634Z 
2026-08-26T17:39:31.0280856Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod18
2026-08-26T17:39:31.0281164Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectKey=SIMOV-imoveiscaixa-batch:3C101C3B-D8C0-461B-B65B-B87A6F75F210
2026-08-26T17:39:31.0281420Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectName=Simov.Batch
2026-08-26T17:39:31.0281673Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:39:31.0281905Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.sourceEncoding=utf-8
2026-08-26T17:39:31.0282114Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.sources=\
2026-08-26T17:39:31.0282178Z 
2026-08-26T17:39:31.0282223Z 
2026-08-26T17:39:31.0282410Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:31.0282601Z "/opt/ads-agent/_work/6/.sonarqube/out/19"
2026-08-26T17:39:31.0282808Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:31.0283012Z "/opt/ads-agent/_work/6/.sonarqube/out/19/Issues.json"
2026-08-26T17:39:31.0283072Z 
2026-08-26T17:39:31.0283295Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod19
2026-08-26T17:39:31.0283612Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectKey=SIMOV-imoveiscaixa-batch:4E341BE0-BD46-427C-8912-6319C41C89BC
2026-08-26T17:39:31.0283966Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectName=TesteSimovBatch
2026-08-26T17:39:31.0284229Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/tests/TesteSimovBatch
2026-08-26T17:39:31.0284465Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.sourceEncoding=utf-8
2026-08-26T17:39:31.0284726Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.sources=
2026-08-26T17:39:31.0284927Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.tests=\
2026-08-26T17:39:31.0285158Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/AvaliacaoImovelDtoTests.cs",\
2026-08-26T17:39:31.0285402Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/DadoContabilDtoTests.cs",\
2026-08-26T17:39:31.0285647Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/ImovelDtoTests.cs",\
2026-08-26T17:39:31.0285886Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/MatriculaImovelDtoTests.cs",\
2026-08-26T17:39:31.0286167Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/CargaImovelServiceTests.cs",\
2026-08-26T17:39:31.0286459Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/FileServiceTests.cs",\
2026-08-26T17:39:31.0286704Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/LeituraSiaciServiceTests.cs",\
2026-08-26T17:39:31.0286964Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/LogProcessamentoServiceTests.cs",\
2026-08-26T17:39:31.0287228Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/MapperDataServiceTests.cs",\
2026-08-26T17:39:31.0287478Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/WorkerImovelServiceTests.cs",\
2026-08-26T17:39:31.0287735Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSiaciPreCadastroUseCaseTests.cs",\
2026-08-26T17:39:31.0288001Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSimilFotoUseCaseTests.cs",\
2026-08-26T17:39:31.0288252Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSimilUseCaseTests.cs",\
2026-08-26T17:39:31.0288511Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSiopiUseCaseTests.cs",\
2026-08-26T17:39:31.0288754Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/SiaciDDQUseCaseTests.cs",\
2026-08-26T17:39:31.0288990Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Batch/LoaderImoveisSiopiTests.cs",\
2026-08-26T17:39:31.0289213Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/CargaImoveisSiaciTests.cs",\
2026-08-26T17:39:31.0289449Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Configuration/AddHeadersHttpClientTests.cs",\
2026-08-26T17:39:31.0289787Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Configuration/ConnectionsConfigurationTest.cs",\
2026-08-26T17:39:31.0290028Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Contexts/FileProcessingContextTests.cs",\
2026-08-26T17:39:31.0290267Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Contexts/SiicoCallCounterContextTests.cs",\
2026-08-26T17:39:31.0290508Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/DomainObjects/EntityTests.cs",\
2026-08-26T17:39:31.0290749Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/DomainObjects/IAggregateRootTests.cs",\
2026-08-26T17:39:31.0290995Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/CancellationExceptionTests.cs",\
2026-08-26T17:39:31.0291249Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/EntityValidationExceptionTests.cs",\
2026-08-26T17:39:31.0291490Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/GenericExceptionTests.cs",\
2026-08-26T17:39:31.0291730Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/NotFoundExceptionTests.cs",\
2026-08-26T17:39:31.0291972Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/ProcessamentoExceptionTests.cs",\
2026-08-26T17:39:31.0292222Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/RelatedAggregateExceptionTests.cs",\
2026-08-26T17:39:31.0292470Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/UnauthorizedExceptionTests.cs",\
2026-08-26T17:39:31.0292715Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siico/ApiSiicoRestPrivadoTests.cs",\
2026-08-26T17:39:31.0292973Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siico/ApiSiicoRestPublicoTests.cs",\
2026-08-26T17:39:31.0293299Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siiso/ApiSiisoRestPublicoTests.cs",\
2026-08-26T17:39:31.0293540Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/AutenticacarSsoTests.cs",\
2026-08-26T17:39:31.0293837Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/BairroDetalhadoSiicoTests.cs",\
2026-08-26T17:39:31.0294095Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/BairroSiicoTests.cs",\
2026-08-26T17:39:31.0294329Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/MunicipioCompletoSiicoTests.cs",\
2026-08-26T17:39:31.0294573Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/ResponseGenericoTests.cs",\
2026-08-26T17:39:31.0294870Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/Siico/CepSiicoTests.cs",\
2026-08-26T17:39:31.0295106Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Domain/Layouts/BaseArquivoLayoutTests.cs",\
2026-08-26T17:39:31.0295340Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/AgrupamentoVendaImovelTests.cs",\
2026-08-26T17:39:31.0295577Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/AvaliacaoImovelSiopiTests.cs",\
2026-08-26T17:39:31.0295810Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/ControleProcessamentoTests.cs",\
2026-08-26T17:39:31.0296038Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/DadoContabilTests.cs",\
2026-08-26T17:39:31.0296282Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoAgrupamentoVendaImovelTests.cs",\
2026-08-26T17:39:31.0296526Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoDadoContabilTests.cs",\
2026-08-26T17:39:31.0296760Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoImovelTests.cs",\
2026-08-26T17:39:31.0297006Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/ImovelTests.cs",\
2026-08-26T17:39:31.0297240Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/MatriculaImovelSiopiTests.cs",\
2026-08-26T17:39:31.0297486Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/MensagemControleProcessamentoTests.cs",\
2026-08-26T17:39:31.0297724Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/RotinaProcessamentoTests.cs",\
2026-08-26T17:39:31.0297953Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/SiopiImovelTests.cs",\
2026-08-26T17:39:31.0298181Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ArquivoSiaciFake.cs",\
2026-08-26T17:39:31.0298487Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ImovelDtoFake.cs",\
2026-08-26T17:39:31.0298713Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ImovelFake.cs",\
2026-08-26T17:39:31.0298937Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/LayoutArquivoFake.cs",\
2026-08-26T17:39:31.0299178Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/Siico/ResponsesFake.cs",\
2026-08-26T17:39:31.0299416Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/InfraDataEF/HistoricosInterceptorTests.cs",\
2026-08-26T17:39:31.0299659Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/InfraDataEF/SimovDbContextTests.cs",\
2026-08-26T17:39:31.0299889Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Layouts/SiaciLayoutTests.cs"
2026-08-26T17:39:31.0299973Z 
2026-08-26T17:39:31.0300177Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:31.0300379Z "/opt/ads-agent/_work/6/.sonarqube/out/20"
2026-08-26T17:39:31.0300599Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:31.0300811Z "/opt/ads-agent/_work/6/.sonarqube/out/20/Issues.json"
2026-08-26T17:39:31.0300874Z 
2026-08-26T17:39:31.0301106Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod20
2026-08-26T17:39:31.0301452Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectKey=SIMOV-imoveiscaixa-batch:0DC13198-1AC4-46C6-B9B3-E2987B8496D5
2026-08-26T17:39:31.0301711Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectName=Simov.Core
2026-08-26T17:39:31.0301956Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:39:31.0302323Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.sourceEncoding=utf-8
2026-08-26T17:39:31.0302535Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.sources=\
2026-08-26T17:39:31.0302600Z 
2026-08-26T17:39:31.0302644Z 
2026-08-26T17:39:31.0302834Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:31.0303024Z "/opt/ads-agent/_work/6/.sonarqube/out/21"
2026-08-26T17:39:31.0303232Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:31.0303439Z "/opt/ads-agent/_work/6/.sonarqube/out/21/Issues.json"
2026-08-26T17:39:31.0303531Z 
2026-08-26T17:39:31.0303830Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod21
2026-08-26T17:39:31.0304146Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectKey=SIMOV-imoveiscaixa-batch:BA15777F-9613-49A5-8C5F-8CBFA5F86619
2026-08-26T17:39:31.0304415Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectName=Simov.Domain
2026-08-26T17:39:31.0304673Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:39:31.0304950Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.sourceEncoding=utf-8
2026-08-26T17:39:31.0305186Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.sources=\
2026-08-26T17:39:31.0305253Z 
2026-08-26T17:39:31.0305288Z 
2026-08-26T17:39:31.0305478Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:31.0305679Z "/opt/ads-agent/_work/6/.sonarqube/out/22"
2026-08-26T17:39:31.0305887Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:31.0306100Z "/opt/ads-agent/_work/6/.sonarqube/out/22/Issues.json"
2026-08-26T17:39:31.0306161Z 
2026-08-26T17:39:31.0306385Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod22
2026-08-26T17:39:31.0306688Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectKey=SIMOV-imoveiscaixa-batch:48A485AE-9F33-C9A7-979C-54916B65C32E
2026-08-26T17:39:31.0306951Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectName=Simov.Application
2026-08-26T17:39:31.0307209Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:39:31.0307450Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.sourceEncoding=utf-8
2026-08-26T17:39:31.0307665Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.sources=\
2026-08-26T17:39:31.0307739Z 
2026-08-26T17:39:31.0307774Z 
2026-08-26T17:39:31.0307964Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:31.0308240Z "/opt/ads-agent/_work/6/.sonarqube/out/23"
2026-08-26T17:39:31.0308527Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:31.0308809Z "/opt/ads-agent/_work/6/.sonarqube/out/23/Issues.json"
2026-08-26T17:39:31.0308913Z 
2026-08-26T17:39:31.0309235Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod23
2026-08-26T17:39:31.0309569Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectKey=SIMOV-imoveiscaixa-batch:309346D6-2461-4973-A29B-7A38A756C0DE
2026-08-26T17:39:31.0309836Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:39:31.0310102Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:39:31.0310496Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.sourceEncoding=utf-8
2026-08-26T17:39:31.0310704Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.sources=\
2026-08-26T17:39:31.0310770Z 
2026-08-26T17:39:31.0310813Z 
2026-08-26T17:39:31.0311006Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:31.0311249Z "/opt/ads-agent/_work/6/.sonarqube/out/24"
2026-08-26T17:39:31.0311523Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:31.0311740Z "/opt/ads-agent/_work/6/.sonarqube/out/24/Issues.json"
2026-08-26T17:39:31.0311874Z 
2026-08-26T17:39:31.0312102Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod24
2026-08-26T17:39:31.0312428Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectKey=SIMOV-imoveiscaixa-batch:4BF20498-1845-4781-82CB-E7783C0081FA
2026-08-26T17:39:31.0312689Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectName=Simov.Batch
2026-08-26T17:39:31.0312944Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:39:31.0313181Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.sourceEncoding=utf-8
2026-08-26T17:39:31.0313391Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.sources=\
2026-08-26T17:39:31.0313497Z 
2026-08-26T17:39:31.0313539Z 
2026-08-26T17:39:31.0313875Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:31.0314079Z "/opt/ads-agent/_work/6/.sonarqube/out/25"
2026-08-26T17:39:31.0314285Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:31.0314492Z "/opt/ads-agent/_work/6/.sonarqube/out/25/Issues.json"
2026-08-26T17:39:31.0314553Z 
2026-08-26T17:39:31.0314773Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod25
2026-08-26T17:39:31.0315083Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectKey=SIMOV-imoveiscaixa-batch:D54F14FF-8EEB-4EB8-994B-69D77DDB78FD
2026-08-26T17:39:31.0315360Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectName=TesteSimovBatch
2026-08-26T17:39:31.0315640Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/tests/TesteSimovBatch
2026-08-26T17:39:31.0315903Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.sourceEncoding=utf-8
2026-08-26T17:39:31.0316104Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.sources=
2026-08-26T17:39:31.0316304Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.tests=\
2026-08-26T17:39:31.0316368Z 
2026-08-26T17:39:31.0316402Z 
2026-08-26T17:39:31.0316589Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:39:31.0316798Z "/opt/ads-agent/_work/6/.sonarqube/out/26"
2026-08-26T17:39:31.0317026Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:39:31.0317246Z "/opt/ads-agent/_work/6/.sonarqube/out/26/Issues.json"
2026-08-26T17:39:31.0317306Z 
2026-08-26T17:39:31.0317528Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod26
2026-08-26T17:39:31.0317702Z sonar.host.url=https://sonar.apps.produtos4.caixa/
2026-08-26T17:39:31.0317888Z sonar.projectKey=SIMOV-imoveiscaixa-batch
2026-08-26T17:39:31.0318066Z sonar.projectName=SIMOV-imoveiscaixa-batch
2026-08-26T17:39:31.0318246Z sonar.projectVersion=1.0-SNAPSHOT
2026-08-26T17:39:31.0318372Z sonar.branch.name=CorrecoesSonar
2026-08-26T17:39:31.0318641Z sonar.scanner.metadataFilePath=/opt/ads-agent/_work/_temp/sonar/1.0-SNAPSHOT/f442c3b3-ec53-840d-3dab-bba3c4de61f5/report-task.txt
2026-08-26T17:39:31.0318913Z sonar.cs.opencover.reportsPaths=/opt/ads-agent/_work/_temp/**/coverage.opencover.xml
2026-08-26T17:39:31.0319130Z sonar.cs.vstest.reportsPaths=/opt/ads-agent/_work/_temp/**/*.trx
2026-08-26T17:39:31.0319287Z sonar.visualstudio.enable=false
2026-08-26T17:39:31.0319338Z 
2026-08-26T17:39:31.0320607Z sonar.modules=0B395246-F58A-479C-B0B1-C6A6045C6FD3,5E55366D-25CB-4B0F-BAF4-738003A18ED2,0847F1F3-B5DA-4FC3-8EEF-882D75A674FD,D745E52F-7A66-4C38-B30D-3A27EA75CCCE,FBCB055E-203B-4979-BB94-B02AE276DE0B,D6E1F89D-8BFA-426E-BC94-C1182DBD0621,AD78E470-A67C-4901-A53F-E3D7D40350CD,B904AD47-4763-413C-9324-7889FD92EFA6,6679F22B-144A-4C59-A28C-2A87F31E3915,EC78B0BC-170C-482C-867B-C5402B449403,1B2C05E0-E98F-477C-931D-923BBE79AE4E,A180ED2D-1521-44A6-B6EA-5DDEC55D2C17,A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E,00300450-28FA-4EA9-8A96-181ED44DCA26,1393E257-1007-43DE-B94C-0B0508C0B309,5BE00443-BD63-4C9F-A707-406F2AC94762,A79CA783-37A2-49D3-B56C-D9102F046AF9,51ABFD24-E14F-4155-B9D7-CDBD0E536AAB,F2842708-9CF5-4649-B3A8-6D39E5E01B77,3C101C3B-D8C0-461B-B65B-B87A6F75F210,4E341BE0-BD46-427C-8912-6319C41C89BC,0DC13198-1AC4-46C6-B9B3-E2987B8496D5,BA15777F-9613-49A5-8C5F-8CBFA5F86619,48A485AE-9F33-C9A7-979C-54916B65C32E,309346D6-2461-4973-A29B-7A38A756C0DE,4BF20498-1845-4781-82CB-E7783C0081FA,D54F14FF-8EEB-4EB8-994B-69D77DDB78FD
2026-08-26T17:39:31.0321308Z 
2026-08-26T17:39:31.0321343Z 
2026-08-26T17:39:31.0321529Z ------------------------------------------------------------------------
2026-08-26T17:39:31.0321783Z 14:39:31.019  Writing processing summary to /opt/ads-agent/_work/6/.sonarqube/out/ProjectInfo.log
2026-08-26T17:39:31.0321970Z The SONAR_SCANNER_HOME environment variable is not required and will be ignored.
2026-08-26T17:39:31.0322158Z Calling the SonarScanner CLI...
2026-08-26T17:39:31.0322517Z Executing file /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/sonar-scanner-4.7.0.2747/bin/sonar-scanner
2026-08-26T17:39:31.0322883Z   Args: -Dsonar.scanAllFiles=true -Dproject.settings=/opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties --from=ScannerMSBuild/5.8 --debug <sensitive data removed>
2026-08-26T17:39:31.0323164Z   Working directory: /opt/ads-agent/_work/6
2026-08-26T17:39:31.0323315Z   Timeout (ms):-1
2026-08-26T17:39:31.0323460Z   Process id: 26402
2026-08-26T17:39:31.1478381Z 14:39:31.143 INFO: Scanner configuration file: /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/sonar-scanner-4.7.0.2747/conf/sonar-scanner.properties
2026-08-26T17:39:31.1478842Z 14:39:31.145 INFO: Project root configuration file: /opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties
2026-08-26T17:39:31.1750903Z 14:39:31.174 INFO: SonarScanner 4.7.0.2747
2026-08-26T17:39:31.1751651Z 14:39:31.174 INFO: Java 11 Oracle Corporation (64-bit)
2026-08-26T17:39:31.1752055Z 14:39:31.174 INFO: Linux 5.18.5-100.fc35.x86_64 amd64
2026-08-26T17:39:31.2526973Z 14:39:31.252 DEBUG: keyStore is : 
2026-08-26T17:39:31.2527330Z 14:39:31.252 DEBUG: keyStore type is : pkcs12
2026-08-26T17:39:31.2527543Z 14:39:31.252 DEBUG: keyStore provider is : 
2026-08-26T17:39:31.2527772Z 14:39:31.252 DEBUG: init keystore
2026-08-26T17:39:31.2527940Z 14:39:31.252 DEBUG: init keymanager of type SunX509
2026-08-26T17:39:31.3215236Z 14:39:31.320 DEBUG: Create: /opt/ads-agent/cache-tools/.sonar/cache
2026-08-26T17:39:31.3216703Z 14:39:31.321 INFO: User cache: /opt/ads-agent/cache-tools/.sonar/cache
2026-08-26T17:39:31.3217436Z 14:39:31.321 DEBUG: Create: /opt/ads-agent/cache-tools/.sonar/cache/_tmp
2026-08-26T17:39:31.3232256Z 14:39:31.322 DEBUG: Extract sonar-scanner-api-batch in temp...
2026-08-26T17:39:31.3252818Z 14:39:31.324 DEBUG: Get bootstrap index...
2026-08-26T17:39:31.3253419Z 14:39:31.325 DEBUG: Download: https://sonar.apps.produtos4.caixa/batch/index
2026-08-26T17:39:31.4084969Z 14:39:31.407 INFO: ------------------------------------------------------------------------
2026-08-26T17:39:31.4085270Z 14:39:31.407 INFO: EXECUTION FAILURE
2026-08-26T17:39:31.4085537Z 14:39:31.407 INFO: ------------------------------------------------------------------------
2026-08-26T17:39:31.4088762Z ##[error]14:39:31.407 ERROR: SonarQube server [https://sonar.apps.produtos4.caixa] can not be reached
2026-08-26T17:39:31.4089316Z 14:39:31.407 ERROR: SonarQube server [https://sonar.apps.produtos4.caixa] can not be reached
2026-08-26T17:39:31.4089484Z 14:39:31.408 INFO: Total time: 0.284s
2026-08-26T17:39:31.4232947Z 14:39:31.422 INFO: Final Memory: 4M/80M
2026-08-26T17:39:31.4233470Z 14:39:31.422 INFO: ------------------------------------------------------------------------
2026-08-26T17:39:31.4234306Z ##[error]14:39:31.422 ERROR: Error during SonarScanner execution
org.sonarsource.scanner.api.internal.ScannerException: Unable to execute SonarScanner analysis
2026-08-26T17:39:31.4234901Z 14:39:31.422 ERROR: Error during SonarScanner execution
2026-08-26T17:39:31.4235086Z org.sonarsource.scanner.api.internal.ScannerException: Unable to execute SonarScanner analysis
2026-08-26T17:39:31.4236252Z ##[error]at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:85)
	at java.base/java.security.AccessController.doPrivileged(Native Method)
	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:74)
	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:70)
	at org.sonarsource.scanner.api.EmbeddedScanner.doStart(EmbeddedScanner.java:185)
2026-08-26T17:39:31.4236907Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:85)
2026-08-26T17:39:31.4237189Z 	at java.base/java.security.AccessController.doPrivileged(Native Method)
2026-08-26T17:39:31.4237396Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:74)
2026-08-26T17:39:31.4237627Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:70)
2026-08-26T17:39:31.4237843Z 	at org.sonarsource.scanner.api.EmbeddedScanner.doStart(EmbeddedScanner.java:185)
2026-08-26T17:39:31.4238359Z ##[error]at org.sonarsource.scanner.api.EmbeddedScanner.start(EmbeddedScanner.java:123)
	at org.sonarsource.scanner.cli.Main.execute(Main.java:73)
	at org.sonarsource.scanner.cli.Main.main(Main.java:61)
2026-08-26T17:39:31.4238791Z 	at org.sonarsource.scanner.api.EmbeddedScanner.start(EmbeddedScanner.java:123)
2026-08-26T17:39:31.4238990Z 	at org.sonarsource.scanner.cli.Main.execute(Main.java:73)
2026-08-26T17:39:31.4239167Z 	at org.sonarsource.scanner.cli.Main.main(Main.java:61)
2026-08-26T17:39:31.4239982Z ##[error]Caused by: java.lang.IllegalStateException: Fail to get bootstrap index from server
	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:42)
	at org.sonarsource.scanner.api.internal.JarDownloader.getScannerEngineFiles(JarDownloader.java:58)
	at org.sonarsource.scanner.api.internal.JarDownloader.download(JarDownloader.java:53)
	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:76)
	... 7 more
2026-08-26T17:39:31.4240580Z Caused by: java.lang.IllegalStateException: Fail to get bootstrap index from server
2026-08-26T17:39:31.4240788Z 	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:42)
2026-08-26T17:39:31.4241019Z 	at org.sonarsource.scanner.api.internal.JarDownloader.getScannerEngineFiles(JarDownloader.java:58)
2026-08-26T17:39:31.4241227Z 	at org.sonarsource.scanner.api.internal.JarDownloader.download(JarDownloader.java:53)
2026-08-26T17:39:31.4241454Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:76)
2026-08-26T17:39:31.4241631Z 	... 7 more
2026-08-26T17:39:31.4243000Z ##[error]Caused by: javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:128)
	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:264)
	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:259)
	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1329)
	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.onConsumeCertificate(CertificateMessage.java:1204)
	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.consume(CertificateMessage.java:1151)
	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:392)
	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:444)
2026-08-26T17:39:31.4244096Z Caused by: javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:39:31.4244700Z 	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:128)
2026-08-26T17:39:31.4244985Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
2026-08-26T17:39:31.4245184Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:264)
2026-08-26T17:39:31.4245374Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:259)
2026-08-26T17:39:31.4245600Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1329)
2026-08-26T17:39:31.4245895Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.onConsumeCertificate(CertificateMessage.java:1204)
2026-08-26T17:39:31.4246148Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.consume(CertificateMessage.java:1151)
2026-08-26T17:39:31.4246356Z 	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:392)
2026-08-26T17:39:31.4246544Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:444)
2026-08-26T17:39:31.4247376Z ##[error]at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:421)
2026-08-26T17:39:31.4248304Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:421)
2026-08-26T17:39:31.4248877Z ##[error]at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:178)
2026-08-26T17:39:31.4249258Z 	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:178)
2026-08-26T17:39:31.4251934Z ##[error]at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:164)
	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1152)
	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1063)
	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:402)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connectTls(RealConnection.java:336)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.establishProtocol(RealConnection.java:300)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connect(RealConnection.java:185)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findConnection(ExchangeFinder.java:224)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findHealthyConnection(ExchangeFinder.java:108)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.find(ExchangeFinder.java:88)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.Transmitter.newExchange(Transmitter.java:169)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ConnectInterceptor.intercept(ConnectInterceptor.java:41)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.cache.CacheInterceptor.intercept(CacheInterceptor.java:94)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:39:31.4253480Z 	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:164)
2026-08-26T17:39:31.4253763Z 	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1152)
2026-08-26T17:39:31.4253972Z 	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1063)
2026-08-26T17:39:31.4254181Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:402)
2026-08-26T17:39:31.4254549Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connectTls(RealConnection.java:336)
2026-08-26T17:39:31.4254823Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.establishProtocol(RealConnection.java:300)
2026-08-26T17:39:31.4255077Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connect(RealConnection.java:185)
2026-08-26T17:39:31.4255333Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findConnection(ExchangeFinder.java:224)
2026-08-26T17:39:31.4255639Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findHealthyConnection(ExchangeFinder.java:108)
2026-08-26T17:39:31.4255894Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.find(ExchangeFinder.java:88)
2026-08-26T17:39:31.4256149Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.Transmitter.newExchange(Transmitter.java:169)
2026-08-26T17:39:31.4256397Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ConnectInterceptor.intercept(ConnectInterceptor.java:41)
2026-08-26T17:39:31.4256646Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:39:31.4256896Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:39:31.4257135Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.cache.CacheInterceptor.intercept(CacheInterceptor.java:94)
2026-08-26T17:39:31.4257380Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:39:31.4257620Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:39:31.4258505Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.BridgeInterceptor.intercept(BridgeInterceptor.java:93)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RetryAndFollowUpInterceptor.intercept(RetryAndFollowUpInterceptor.java:88)
2026-08-26T17:39:31.4259099Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.BridgeInterceptor.intercept(BridgeInterceptor.java:93)
2026-08-26T17:39:31.4259347Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:39:31.4259608Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RetryAndFollowUpInterceptor.intercept(RetryAndFollowUpInterceptor.java:88)
2026-08-26T17:39:31.4260447Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.getResponseWithInterceptorChain(RealCall.java:221)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.execute(RealCall.java:81)
2026-08-26T17:39:31.4261072Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:39:31.4261316Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:39:31.4261553Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.getResponseWithInterceptorChain(RealCall.java:221)
2026-08-26T17:39:31.4261778Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.execute(RealCall.java:81)
2026-08-26T17:39:31.4262421Z ##[error]at org.sonarsource.scanner.api.internal.ServerConnection.callUrl(ServerConnection.java:115)
	at org.sonarsource.scanner.api.internal.ServerConnection.downloadString(ServerConnection.java:99)
	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:39)
	... 10 more
2026-08-26T17:39:31.4262922Z 	at org.sonarsource.scanner.api.internal.ServerConnection.callUrl(ServerConnection.java:115)
2026-08-26T17:39:31.4263132Z 	at org.sonarsource.scanner.api.internal.ServerConnection.downloadString(ServerConnection.java:99)
2026-08-26T17:39:31.4263361Z 	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:39)
2026-08-26T17:39:31.4263552Z 	... 10 more
2026-08-26T17:39:31.4264357Z ##[error]Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:385)
2026-08-26T17:39:31.4264930Z Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:39:31.4265170Z 	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:385)
2026-08-26T17:39:31.4266661Z ##[error]at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:290)
	at java.base/sun.security.validator.Validator.validate(Validator.java:264)
	at java.base/sun.security.ssl.X509TrustManagerImpl.validate(X509TrustManagerImpl.java:321)
	at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:221)
	at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:129)
	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1313)
	... 43 more
Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
	at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:141)
	at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:126)
	at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:380)
	... 49 more
2026-08-26T17:39:31.4267703Z 	at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:290)
2026-08-26T17:39:31.4267904Z 	at java.base/sun.security.validator.Validator.validate(Validator.java:264)
2026-08-26T17:39:31.4268105Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.validate(X509TrustManagerImpl.java:321)
2026-08-26T17:39:31.4268319Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:221)
2026-08-26T17:39:31.4268535Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:129)
2026-08-26T17:39:31.4268770Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1313)
2026-08-26T17:39:31.4268946Z 	... 43 more
2026-08-26T17:39:31.4269106Z Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:39:31.4269322Z 	at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:141)
2026-08-26T17:39:31.4269540Z 	at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:126)
2026-08-26T17:39:31.4269746Z 	at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
2026-08-26T17:39:31.4269940Z 	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:380)
2026-08-26T17:39:31.4270123Z 	... 49 more
2026-08-26T17:39:31.4421894Z Process returned exit code 1
2026-08-26T17:39:31.4455986Z ##[error]The SonarScanner did not complete successfully
2026-08-26T17:39:31.4456565Z The SonarScanner did not complete successfully
2026-08-26T17:39:31.4456911Z ##[error]14:39:31.445  Post-processing failed. Exit code: 1
2026-08-26T17:39:31.4457494Z 14:39:31.445  Post-processing failed. Exit code: 1
2026-08-26T17:39:31.4544159Z ##[error]The process '/opt/ads-agent/cache-tools/.dotnet//dotnet' failed with exit code 1
2026-08-26T17:39:31.4574587Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 6 out of 10) after 36000 ms
2026-08-26T17:40:07.5717921Z [command]/opt/ads-agent/cache-tools/.dotnet//dotnet /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/SonarScanner.MSBuild.dll end
2026-08-26T17:40:07.6242038Z SonarScanner for MSBuild 5.8
2026-08-26T17:40:07.6242538Z Using the .NET Core version of the Scanner for MSBuild
2026-08-26T17:40:07.6639861Z Post-processing started.
2026-08-26T17:40:07.7362730Z 14:40:07.735  14:40:07.716  /opt/ads-agent/_work/6/.sonarqube/bin/targets/SonarQube.Integration.targets does not exist
2026-08-26T17:40:07.7363371Z 14:40:07.735  14:40:07.735  sonar.verbose=true was specified - setting the log verbosity to 'Debug'
2026-08-26T17:40:07.7364147Z 14:40:07.736  Loading the SonarQube analysis config from /opt/ads-agent/_work/6/.sonarqube/conf/SonarQubeAnalysisConfig.xml
2026-08-26T17:40:07.7364345Z 14:40:07.736  Not running under TeamBuild
2026-08-26T17:40:07.7364591Z 14:40:07.736  Analysis base directory: /opt/ads-agent/_work/6/.sonarqube
2026-08-26T17:40:07.7364746Z Build directory: 
2026-08-26T17:40:07.7364979Z Bin directory: /opt/ads-agent/_work/6/.sonarqube/bin
2026-08-26T17:40:07.7365293Z Config directory: /opt/ads-agent/_work/6/.sonarqube/conf
2026-08-26T17:40:07.7365557Z Output directory: /opt/ads-agent/_work/6/.sonarqube/out
2026-08-26T17:40:07.7365785Z Config file: /opt/ads-agent/_work/6/.sonarqube/conf/SonarQubeAnalysisConfig.xml
2026-08-26T17:40:07.7376158Z 14:40:07.737  Generating SonarQube project properties file to /opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties
2026-08-26T17:40:07.7548914Z 14:40:07.754  Setting analysis property: sonar.visualstudio.enable=false
2026-08-26T17:40:07.7730021Z 14:40:07.772  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/0/Issues.json
2026-08-26T17:40:07.7763730Z 14:40:07.776  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/1/Issues.json
2026-08-26T17:40:07.7797454Z 14:40:07.779  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/2/Issues.json
2026-08-26T17:40:07.7899806Z 14:40:07.789  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/3/Issues.json
2026-08-26T17:40:07.7929547Z 14:40:07.792  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/4/Issues.json
2026-08-26T17:40:07.7961095Z 14:40:07.795  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/5/Issues.json
2026-08-26T17:40:07.7971605Z 14:40:07.797  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/6/Issues.json
2026-08-26T17:40:07.7981174Z 14:40:07.798  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/7/Issues.json
2026-08-26T17:40:07.8081830Z 14:40:07.807  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/8/Issues.json
2026-08-26T17:40:07.8180725Z 14:40:07.817  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/9/Issues.json
2026-08-26T17:40:07.8209542Z 14:40:07.82  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/10/Issues.json
2026-08-26T17:40:07.8348097Z 14:40:07.834  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/11/Issues.json
2026-08-26T17:40:07.8371141Z 14:40:07.836  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/12/Issues.json
2026-08-26T17:40:07.8396506Z 14:40:07.839  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/13/Issues.json
2026-08-26T17:40:07.8404155Z 14:40:07.84  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/14/Issues.json
2026-08-26T17:40:07.8483095Z 14:40:07.847  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/15/Issues.json
2026-08-26T17:40:07.8505447Z 14:40:07.85  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/16/Issues.json
2026-08-26T17:40:07.8529917Z 14:40:07.852  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/17/Issues.json
2026-08-26T17:40:07.8538905Z 14:40:07.853  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/18/Issues.json
2026-08-26T17:40:07.8546927Z 14:40:07.854  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/19/Issues.json
2026-08-26T17:40:07.8550026Z 14:40:07.854  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/20/Issues.json
2026-08-26T17:40:07.8629224Z 14:40:07.862  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/21/Issues.json
2026-08-26T17:40:07.8652172Z 14:40:07.864  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/22/Issues.json
2026-08-26T17:40:07.8676844Z 14:40:07.867  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/23/Issues.json
2026-08-26T17:40:07.8685255Z 14:40:07.868  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/24/Issues.json
2026-08-26T17:40:07.8693135Z 14:40:07.869  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/25/Issues.json
2026-08-26T17:40:07.8697302Z 14:40:07.869  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/26/Issues.json
2026-08-26T17:40:07.8807338Z 14:40:07.88  Using longest common projects path as a base directory: '/opt/ads-agent/_work/6/s'.
2026-08-26T17:40:07.8908959Z 14:40:07.89  File was referenced by the following projects: '/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/TesteSimovBatch.csproj', '/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/TesteSimovBatch.csproj'.
2026-08-26T17:40:07.9017217Z 14:40:07.895  Dumping content of sonar-project.properties
2026-08-26T17:40:07.9020917Z ------------------------------------------------------------------------
2026-08-26T17:40:07.9021372Z sonar.projectKey=SIMOV-imoveiscaixa-batch
2026-08-26T17:40:07.9021723Z sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar
2026-08-26T17:40:07.9026535Z sonar.projectBaseDir=/opt/ads-agent/_work/6/s
2026-08-26T17:40:07.9026946Z 
2026-08-26T17:40:07.9027254Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectKey=SIMOV-imoveiscaixa-batch:0B395246-F58A-479C-B0B1-C6A6045C6FD3
2026-08-26T17:40:07.9027541Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectName=Simov.Core
2026-08-26T17:40:07.9027974Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:40:07.9028224Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.sourceEncoding=utf-8
2026-08-26T17:40:07.9028446Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.sources=\
2026-08-26T17:40:07.9028677Z "/opt/ads-agent/_work/6/s/src/Simov.Core/AutenticacaoSso/AutenticacarSso.cs",\
2026-08-26T17:40:07.9028992Z "/opt/ads-agent/_work/6/s/src/Simov.Core/AutenticacaoSso/IAutenticacarSso.cs",\
2026-08-26T17:40:07.9029208Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Data/IBaseRepository.cs",\
2026-08-26T17:40:07.9029406Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Data/IUnitOfWork.cs",\
2026-08-26T17:40:07.9029619Z "/opt/ads-agent/_work/6/s/src/Simov.Core/DomainObjects/Entity.cs",\
2026-08-26T17:40:07.9029858Z "/opt/ads-agent/_work/6/s/src/Simov.Core/DomainObjects/IAggregateRoot.cs",\
2026-08-26T17:40:07.9030088Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/ApplicationException.cs",\
2026-08-26T17:40:07.9030318Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/CancellationException.cs",\
2026-08-26T17:40:07.9030611Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/EntityValidationException.cs",\
2026-08-26T17:40:07.9030836Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/GenericException.cs",\
2026-08-26T17:40:07.9031163Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/NotFoundException.cs",\
2026-08-26T17:40:07.9031440Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/ProcessamentoException.cs",\
2026-08-26T17:40:07.9031757Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/RelatedAggregateException.cs",\
2026-08-26T17:40:07.9031989Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/UnauthorizedException.cs",\
2026-08-26T17:40:07.9032216Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Logging/LoggerExtensions.cs",\
2026-08-26T17:40:07.9032441Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siico/ApiSiicoRestPrivado.cs",\
2026-08-26T17:40:07.9032667Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siico/ApiSiicoRestPublico.cs",\
2026-08-26T17:40:07.9032902Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siiso/ApiSiisoRestPublico.cs",\
2026-08-26T17:40:07.9033120Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/DadosDto.cs",\
2026-08-26T17:40:07.9033343Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/DadosSimilDto.cs",\
2026-08-26T17:40:07.9033561Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/FotosDto.cs",\
2026-08-26T17:40:07.9033896Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/ListaFotoDto.cs",\
2026-08-26T17:40:07.9034115Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/ISOAPWeb.cs",\
2026-08-26T17:40:07.9034341Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/RobustSoapDeserializer.cs",\
2026-08-26T17:40:07.9034565Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/SOAPWeb.cs",\
2026-08-26T17:40:07.9034785Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/ResponseGenerico.cs",\
2026-08-26T17:40:07.9035049Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/BairroDetalhadoSiico.cs",\
2026-08-26T17:40:07.9035511Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/BairroSiico.cs",\
2026-08-26T17:40:07.9035718Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/CepSiico.cs",\
2026-08-26T17:40:07.9035933Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/LocalidadeSiico.cs",\
2026-08-26T17:40:07.9036166Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioCompletoSiico.cs",\
2026-08-26T17:40:07.9036398Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioParcialSiico.cs",\
2026-08-26T17:40:07.9036622Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioSiico.cs",\
2026-08-26T17:40:07.9036896Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/TipoLogradouroSiico.cs",\
2026-08-26T17:40:07.9037116Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/UnidadeCaixa.cs",\
2026-08-26T17:40:07.9037342Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/UnidadeFederacaoSiico.cs",\
2026-08-26T17:40:07.9037566Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/EnderecoPessoaSiiso.cs",\
2026-08-26T17:40:07.9037793Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/LocalidadeNascimentoSiiso.cs",\
2026-08-26T17:40:07.9038013Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/PessoaSiiso.cs",\
2026-08-26T17:40:07.9038244Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siico/IApiSiicoRestPrivado.cs",\
2026-08-26T17:40:07.9038521Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siico/IApiSiicoRestPublico.cs",\
2026-08-26T17:40:07.9038756Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siiso/IApiSiisoRestPublico.cs"
2026-08-26T17:40:07.9038831Z 
2026-08-26T17:40:07.9039499Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:07.9039699Z "/opt/ads-agent/_work/6/.sonarqube/out/0"
2026-08-26T17:40:07.9039914Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:07.9040125Z "/opt/ads-agent/_work/6/.sonarqube/out/0/Issues.json"
2026-08-26T17:40:07.9040188Z 
2026-08-26T17:40:07.9040428Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod0
2026-08-26T17:40:07.9040741Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectKey=SIMOV-imoveiscaixa-batch:5E55366D-25CB-4B0F-BAF4-738003A18ED2
2026-08-26T17:40:07.9041007Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectName=Simov.Domain
2026-08-26T17:40:07.9041253Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:40:07.9041569Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.sourceEncoding=utf-8
2026-08-26T17:40:07.9041832Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.sources=\
2026-08-26T17:40:07.9042059Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AgrupamentoVendaImovel.cs",\
2026-08-26T17:40:07.9042280Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaArquivoLote.cs",\
2026-08-26T17:40:07.9042498Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaFotoImovel.cs",\
2026-08-26T17:40:07.9042719Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaFotoLote.cs",\
2026-08-26T17:40:07.9042940Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaUsuario.cs",\
2026-08-26T17:40:07.9043155Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AvaliacaoImovel.cs",\
2026-08-26T17:40:07.9043361Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/ComodoImovel.cs",\
2026-08-26T17:40:07.9043581Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/ControleProcessamento.cs",\
2026-08-26T17:40:07.9043948Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/DadoContabil.cs",\
2026-08-26T17:40:07.9044165Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/FotoImovel.cs",\
2026-08-26T17:40:07.9044478Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoAgrupamentoVendaImovel.cs",\
2026-08-26T17:40:07.9044769Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoAvaliacaoImovel.cs",\
2026-08-26T17:40:07.9045042Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoComodoImovel.cs",\
2026-08-26T17:40:07.9045328Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoDadoContabil.cs",\
2026-08-26T17:40:07.9045551Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoImovel.cs",\
2026-08-26T17:40:07.9045771Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoMatriculaImovel.cs",\
2026-08-26T17:40:07.9045978Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/Imovel.cs",\
2026-08-26T17:40:07.9046190Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/MatriculaImovel.cs",\
2026-08-26T17:40:07.9046420Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/MensagemControleProcessamento.cs",\
2026-08-26T17:40:07.9046705Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/RotinaProcessamento.cs",\
2026-08-26T17:40:07.9047018Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/ClassificacaoImovelEnum.cs",\
2026-08-26T17:40:07.9047249Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/EstadoConservacaoEnum.cs",\
2026-08-26T17:40:07.9047475Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/FuncionalidadeSistemaEnum.cs",\
2026-08-26T17:40:07.9047686Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/IcAcaoSistemaEnum.cs",\
2026-08-26T17:40:07.9047896Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/IcShortEnum.cs",\
2026-08-26T17:40:07.9048112Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/MotivoExclusaoEnum.cs",\
2026-08-26T17:40:07.9048391Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/OrgaoProprietarioImovelEnum.cs",\
2026-08-26T17:40:07.9048616Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/OrigemImovelEnum.cs",\
2026-08-26T17:40:07.9048841Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/ResultadoMensagemProcessamentoEnum.cs",\
2026-08-26T17:40:07.9049069Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/RotinaProcessamentoEnum.cs",\
2026-08-26T17:40:07.9049290Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/SituacaoImovelEnum.cs",\
2026-08-26T17:40:07.9049512Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/SituacaoProcessamentoEnum.cs",\
2026-08-26T17:40:07.9049719Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoCampoEnum.cs",\
2026-08-26T17:40:07.9049932Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoComodoEnum.cs",\
2026-08-26T17:40:07.9050145Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoImovelEnum.cs",\
2026-08-26T17:40:07.9050367Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoMatriculaEnum.cs",\
2026-08-26T17:40:07.9050601Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAgrupamentoVendaImovelRepository.cs",\
2026-08-26T17:40:07.9050833Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaArquivoLoteRepository.cs",\
2026-08-26T17:40:07.9051076Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaFotoImovelRepository.cs",\
2026-08-26T17:40:07.9051315Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaFotoLoteRepository.cs",\
2026-08-26T17:40:07.9051629Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaUsuarioRepository.cs",\
2026-08-26T17:40:07.9051908Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAvaliacaoImovelRepository.cs",\
2026-08-26T17:40:07.9052139Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IComodoImovelRepository.cs",\
2026-08-26T17:40:07.9052382Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IControleProcessamentoRepository.cs",\
2026-08-26T17:40:07.9052620Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IDadoContabilRepository.cs",\
2026-08-26T17:40:07.9052848Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IFotoImovelRepository.cs",\
2026-08-26T17:40:07.9053062Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IGeradorHistorico.cs",\
2026-08-26T17:40:07.9053285Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IImovelRepository.cs",\
2026-08-26T17:40:07.9053518Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IMatriculaImovelRepository.cs",\
2026-08-26T17:40:07.9053833Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IMensagemControleProcessamentoRepository.cs",\
2026-08-26T17:40:07.9054083Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IRotinaProcessamentoRepository.cs",\
2026-08-26T17:40:07.9054306Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/BaseArquivoLayout.cs",\
2026-08-26T17:40:07.9054518Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/SiaciLayout.cs",\
2026-08-26T17:40:07.9054734Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/SiopiLayout.cs"
2026-08-26T17:40:07.9054799Z 
2026-08-26T17:40:07.9055000Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:07.9055195Z "/opt/ads-agent/_work/6/.sonarqube/out/1"
2026-08-26T17:40:07.9055397Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:07.9055668Z "/opt/ads-agent/_work/6/.sonarqube/out/1/Issues.json"
2026-08-26T17:40:07.9055733Z 
2026-08-26T17:40:07.9055961Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod1
2026-08-26T17:40:07.9056281Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectKey=SIMOV-imoveiscaixa-batch:0847F1F3-B5DA-4FC3-8EEF-882D75A674FD
2026-08-26T17:40:07.9056550Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectName=Simov.Application
2026-08-26T17:40:07.9056806Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:40:07.9057094Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.sourceEncoding=utf-8
2026-08-26T17:40:07.9057303Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.sources=\
2026-08-26T17:40:07.9057593Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Contexts/FileProcessingContext.cs",\
2026-08-26T17:40:07.9058270Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Contexts/SiicoCallCounterContext.cs",\
2026-08-26T17:40:07.9058576Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/AvaliacaoImovelDto.cs",\
2026-08-26T17:40:07.9058865Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/DadoContabilDto.cs",\
2026-08-26T17:40:07.9059359Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/EnderecoDto.cs",\
2026-08-26T17:40:07.9059680Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/ImovelDto.cs",\
2026-08-26T17:40:07.9059983Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/MatriculaImovelDto.cs",\
2026-08-26T17:40:07.9060278Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/MunicipioDto.cs",\
2026-08-26T17:40:07.9060589Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/SiaciDDQDto.cs",\
2026-08-26T17:40:07.9060904Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/TipoLogradouroDto.cs",\
2026-08-26T17:40:07.9061220Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ICargaFotoImovelService.cs",\
2026-08-26T17:40:07.9061552Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ICargaImovelService.cs",\
2026-08-26T17:40:07.9061884Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IFileService.cs",\
2026-08-26T17:40:07.9062203Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSiaciUseCase.cs",\
2026-08-26T17:40:07.9062545Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSimilFotoUseCase.cs",\
2026-08-26T17:40:07.9062862Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSimilUseCase.cs",\
2026-08-26T17:40:07.9063179Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSiopiUseCase.cs",\
2026-08-26T17:40:07.9063485Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ILeituraService.cs",\
2026-08-26T17:40:07.9064040Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ILogProcessamentoService.cs",\
2026-08-26T17:40:07.9064359Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IMapperDataService.cs",\
2026-08-26T17:40:07.9064602Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ISiaciDDQUseCase.cs",\
2026-08-26T17:40:07.9064838Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IWorkerImovelService.cs",\
2026-08-26T17:40:07.9065075Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/CargaImovelService.cs",\
2026-08-26T17:40:07.9065306Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/FileService.cs",\
2026-08-26T17:40:07.9065524Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/LeituraService.cs",\
2026-08-26T17:40:07.9065761Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/LogProcessamentoService.cs",\
2026-08-26T17:40:07.9065997Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/MapperDataService.cs",\
2026-08-26T17:40:07.9066237Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/WorkerImovelService.cs",\
2026-08-26T17:40:07.9066459Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSiaciUseCase.cs",\
2026-08-26T17:40:07.9066690Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSimilFotoUseCase.cs",\
2026-08-26T17:40:07.9067104Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSimilUseCase.cs",\
2026-08-26T17:40:07.9067334Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSiopiUseCase.cs",\
2026-08-26T17:40:07.9067559Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/SiaciDDQUseCase.cs"
2026-08-26T17:40:07.9067630Z 
2026-08-26T17:40:07.9067834Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:07.9068029Z "/opt/ads-agent/_work/6/.sonarqube/out/2"
2026-08-26T17:40:07.9068246Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:07.9068516Z "/opt/ads-agent/_work/6/.sonarqube/out/2/Issues.json"
2026-08-26T17:40:07.9068578Z 
2026-08-26T17:40:07.9068803Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod2
2026-08-26T17:40:07.9069348Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectKey=SIMOV-imoveiscaixa-batch:D745E52F-7A66-4C38-B30D-3A27EA75CCCE
2026-08-26T17:40:07.9069734Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectName=Simov.Core
2026-08-26T17:40:07.9069991Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:40:07.9070223Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.sourceEncoding=utf-8
2026-08-26T17:40:07.9070430Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.sources=\
2026-08-26T17:40:07.9070493Z 
2026-08-26T17:40:07.9070536Z 
2026-08-26T17:40:07.9070727Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:07.9070926Z "/opt/ads-agent/_work/6/.sonarqube/out/3"
2026-08-26T17:40:07.9071132Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:07.9071341Z "/opt/ads-agent/_work/6/.sonarqube/out/3/Issues.json"
2026-08-26T17:40:07.9071433Z 
2026-08-26T17:40:07.9071719Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod3
2026-08-26T17:40:07.9072035Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectKey=SIMOV-imoveiscaixa-batch:FBCB055E-203B-4979-BB94-B02AE276DE0B
2026-08-26T17:40:07.9072293Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectName=Simov.Domain
2026-08-26T17:40:07.9072544Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:40:07.9072779Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.sourceEncoding=utf-8
2026-08-26T17:40:07.9072987Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.sources=\
2026-08-26T17:40:07.9073050Z 
2026-08-26T17:40:07.9073085Z 
2026-08-26T17:40:07.9073284Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:07.9073481Z "/opt/ads-agent/_work/6/.sonarqube/out/4"
2026-08-26T17:40:07.9073758Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:07.9073994Z "/opt/ads-agent/_work/6/.sonarqube/out/4/Issues.json"
2026-08-26T17:40:07.9074096Z 
2026-08-26T17:40:07.9074368Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod4
2026-08-26T17:40:07.9074785Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectKey=SIMOV-imoveiscaixa-batch:D6E1F89D-8BFA-426E-BC94-C1182DBD0621
2026-08-26T17:40:07.9075171Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectName=Simov.Application
2026-08-26T17:40:07.9075962Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:40:07.9076506Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.sourceEncoding=utf-8
2026-08-26T17:40:07.9076947Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.sources=\
2026-08-26T17:40:07.9077116Z 
2026-08-26T17:40:07.9077192Z 
2026-08-26T17:40:07.9077612Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:07.9077909Z "/opt/ads-agent/_work/6/.sonarqube/out/5"
2026-08-26T17:40:07.9078424Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:07.9078838Z "/opt/ads-agent/_work/6/.sonarqube/out/5/Issues.json"
2026-08-26T17:40:07.9078906Z 
2026-08-26T17:40:07.9079136Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod5
2026-08-26T17:40:07.9079447Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectKey=SIMOV-imoveiscaixa-batch:AD78E470-A67C-4901-A53F-E3D7D40350CD
2026-08-26T17:40:07.9079711Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:40:07.9079973Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:40:07.9080219Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.sourceEncoding=utf-8
2026-08-26T17:40:07.9080700Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.sources=\
2026-08-26T17:40:07.9080915Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Common/BaseRepository.cs",\
2026-08-26T17:40:07.9081136Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Common/UnitOfWork.cs",\
2026-08-26T17:40:07.9081391Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Interceptor/HistoricosInterceptor.cs",\
2026-08-26T17:40:07.9081724Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AgrupamentoVendaImovelConfiguration.cs",\
2026-08-26T17:40:07.9081982Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaArquivoLoteConfiguration.cs",\
2026-08-26T17:40:07.9082231Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaFotoImovelConfiguration.cs",\
2026-08-26T17:40:07.9082481Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaFotoLoteConfiguration.cs",\
2026-08-26T17:40:07.9082725Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaUsuarioConfiguration.cs",\
2026-08-26T17:40:07.9082972Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AvaliacaoImovelConfiguration.cs",\
2026-08-26T17:40:07.9083209Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ComodoImovelConfiguration.cs",\
2026-08-26T17:40:07.9083465Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ControleProcessamentoConfiguration.cs",\
2026-08-26T17:40:07.9083846Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/DadoContabilConfiguration.cs",\
2026-08-26T17:40:07.9084102Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/FotoImovelConfiguration.cs",\
2026-08-26T17:40:07.9084370Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoAgrupamentoVendaImovelConfiguration.cs",\
2026-08-26T17:40:07.9084632Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoAvaliacaoImovelConfiguration.cs",\
2026-08-26T17:40:07.9084887Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoComodoImovelConfiguration.cs",\
2026-08-26T17:40:07.9085143Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoDadoContabilConfiguration.cs",\
2026-08-26T17:40:07.9085396Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoImovelConfiguration.cs",\
2026-08-26T17:40:07.9085651Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoMatriculaImovelConfiguration.cs",\
2026-08-26T17:40:07.9085884Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ImovelConfiguration.cs",\
2026-08-26T17:40:07.9086126Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/MatriculaImovelConfiguration.cs",\
2026-08-26T17:40:07.9086385Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/MensagemControleProcessamentoConfiguration.cs",\
2026-08-26T17:40:07.9086641Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/RotinaProcessamentoConfiguration.cs",\
2026-08-26T17:40:07.9086885Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AgrupamentoVendaImovelRepository.cs",\
2026-08-26T17:40:07.9087141Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaArquivoLoteRepository.cs",\
2026-08-26T17:40:07.9087390Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaFotoImovelRepository.cs",\
2026-08-26T17:40:07.9087702Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaFotoLoteRepository.cs",\
2026-08-26T17:40:07.9087950Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaUsuarioRepository.cs",\
2026-08-26T17:40:07.9088190Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AvaliacaoImovelRepository.cs",\
2026-08-26T17:40:07.9088432Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ComodoImovelRepository.cs",\
2026-08-26T17:40:07.9088686Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ControleProcessamentoRepository.cs",\
2026-08-26T17:40:07.9089060Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/DadoContabilRepository.cs",\
2026-08-26T17:40:07.9089403Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/FotoImovelRepository.cs",\
2026-08-26T17:40:07.9089628Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ImovelRepository.cs",\
2026-08-26T17:40:07.9089869Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/MatriculaImovelRepository.cs",\
2026-08-26T17:40:07.9090139Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/MensagemControleProcessamentoRepository.cs",\
2026-08-26T17:40:07.9090401Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/RotinaProcessamentoRepository.cs",\
2026-08-26T17:40:07.9090621Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/SimovDbContext.cs"
2026-08-26T17:40:07.9090699Z 
2026-08-26T17:40:07.9090898Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:07.9091086Z "/opt/ads-agent/_work/6/.sonarqube/out/6"
2026-08-26T17:40:07.9091302Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:07.9091586Z "/opt/ads-agent/_work/6/.sonarqube/out/6/Issues.json"
2026-08-26T17:40:07.9091646Z 
2026-08-26T17:40:07.9091882Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod6
2026-08-26T17:40:07.9092194Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectKey=SIMOV-imoveiscaixa-batch:B904AD47-4763-413C-9324-7889FD92EFA6
2026-08-26T17:40:07.9092451Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectName=Simov.Batch
2026-08-26T17:40:07.9092706Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:40:07.9092944Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.sourceEncoding=utf-8
2026-08-26T17:40:07.9093192Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.sources=\
2026-08-26T17:40:07.9093511Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/AddHeadersHttpClient.cs",\
2026-08-26T17:40:07.9093953Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/ConnectionsConfiguration.cs",\
2026-08-26T17:40:07.9094257Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/HttpClientConfiguration.cs",\
2026-08-26T17:40:07.9094489Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/IApiSiisoRestPrivado.cs",\
2026-08-26T17:40:07.9094725Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/UseCasesConfiguration.cs",\
2026-08-26T17:40:07.9094949Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderImoveisSiaci.cs",\
2026-08-26T17:40:07.9095172Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderImoveisSiopi.cs",\
2026-08-26T17:40:07.9095403Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderLeilaoSiaciDDQ.cs",\
2026-08-26T17:40:07.9095624Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Program.cs",\
2026-08-26T17:40:07.9095838Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Workers/WorkerFotoImoveisSimil.cs",\
2026-08-26T17:40:07.9096063Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Workers/WorkerImoveisSimil.cs",\
2026-08-26T17:40:07.9096303Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/Simov.Batch.GlobalUsings.g.cs",\
2026-08-26T17:40:07.9096575Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/.NETCoreApp,Version=v8.0.AssemblyAttributes.cs",\
2026-08-26T17:40:07.9096830Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/Simov.Batch.AssemblyInfo.cs",\
2026-08-26T17:40:07.9097128Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/appsettings.Development.json",\
2026-08-26T17:40:07.9097345Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/appsettings.json",\
2026-08-26T17:40:07.9097573Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Properties/launchSettings.json",\
2026-08-26T17:40:07.9097797Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/apphost"
2026-08-26T17:40:07.9097866Z 
2026-08-26T17:40:07.9098066Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:07.9098255Z "/opt/ads-agent/_work/6/.sonarqube/out/7"
2026-08-26T17:40:07.9098463Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:07.9098726Z "/opt/ads-agent/_work/6/.sonarqube/out/7/Issues.json"
2026-08-26T17:40:07.9098788Z 
2026-08-26T17:40:07.9099025Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod7
2026-08-26T17:40:07.9099348Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectKey=SIMOV-imoveiscaixa-batch:6679F22B-144A-4C59-A28C-2A87F31E3915
2026-08-26T17:40:07.9099634Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectName=Simov.Core
2026-08-26T17:40:07.9099886Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:40:07.9100166Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.sourceEncoding=utf-8
2026-08-26T17:40:07.9100385Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.sources=\
2026-08-26T17:40:07.9100453Z 
2026-08-26T17:40:07.9100493Z 
2026-08-26T17:40:07.9100695Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:07.9100897Z "/opt/ads-agent/_work/6/.sonarqube/out/8"
2026-08-26T17:40:07.9101123Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:07.9101335Z "/opt/ads-agent/_work/6/.sonarqube/out/8/Issues.json"
2026-08-26T17:40:07.9101425Z 
2026-08-26T17:40:07.9101704Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod8
2026-08-26T17:40:07.9102008Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectKey=SIMOV-imoveiscaixa-batch:EC78B0BC-170C-482C-867B-C5402B449403
2026-08-26T17:40:07.9102281Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectName=Simov.Core
2026-08-26T17:40:07.9102537Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:40:07.9102779Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.sourceEncoding=utf-8
2026-08-26T17:40:07.9102983Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.sources=\
2026-08-26T17:40:07.9103057Z 
2026-08-26T17:40:07.9103093Z 
2026-08-26T17:40:07.9103289Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:07.9103492Z "/opt/ads-agent/_work/6/.sonarqube/out/9"
2026-08-26T17:40:07.9103782Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:07.9104009Z "/opt/ads-agent/_work/6/.sonarqube/out/9/Issues.json"
2026-08-26T17:40:07.9104079Z 
2026-08-26T17:40:07.9104311Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod9
2026-08-26T17:40:07.9104627Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectKey=SIMOV-imoveiscaixa-batch:1B2C05E0-E98F-477C-931D-923BBE79AE4E
2026-08-26T17:40:07.9104896Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectName=Simov.Domain
2026-08-26T17:40:07.9105149Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:40:07.9105385Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.sourceEncoding=utf-8
2026-08-26T17:40:07.9105605Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.sources=\
2026-08-26T17:40:07.9105675Z 
2026-08-26T17:40:07.9105725Z 
2026-08-26T17:40:07.9105912Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:07.9106387Z "/opt/ads-agent/_work/6/.sonarqube/out/10"
2026-08-26T17:40:07.9106617Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:07.9106895Z "/opt/ads-agent/_work/6/.sonarqube/out/10/Issues.json"
2026-08-26T17:40:07.9106957Z 
2026-08-26T17:40:07.9107191Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod10
2026-08-26T17:40:07.9107496Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectKey=SIMOV-imoveiscaixa-batch:A180ED2D-1521-44A6-B6EA-5DDEC55D2C17
2026-08-26T17:40:07.9107768Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectName=Simov.Core
2026-08-26T17:40:07.9108021Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:40:07.9108271Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.sourceEncoding=utf-8
2026-08-26T17:40:07.9108537Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.sources=\
2026-08-26T17:40:07.9108604Z 
2026-08-26T17:40:07.9108637Z 
2026-08-26T17:40:07.9108834Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:07.9109039Z "/opt/ads-agent/_work/6/.sonarqube/out/11"
2026-08-26T17:40:07.9109249Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:07.9109452Z "/opt/ads-agent/_work/6/.sonarqube/out/11/Issues.json"
2026-08-26T17:40:07.9109517Z 
2026-08-26T17:40:07.9109744Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod11
2026-08-26T17:40:07.9110060Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectKey=SIMOV-imoveiscaixa-batch:A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E
2026-08-26T17:40:07.9110358Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectName=Simov.Domain
2026-08-26T17:40:07.9110700Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:40:07.9111009Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.sourceEncoding=utf-8
2026-08-26T17:40:07.9111316Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.sources=\
2026-08-26T17:40:07.9111406Z 
2026-08-26T17:40:07.9111473Z 
2026-08-26T17:40:07.9111678Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:07.9112129Z "/opt/ads-agent/_work/6/.sonarqube/out/12"
2026-08-26T17:40:07.9112358Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:07.9112574Z "/opt/ads-agent/_work/6/.sonarqube/out/12/Issues.json"
2026-08-26T17:40:07.9112641Z 
2026-08-26T17:40:07.9112874Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod12
2026-08-26T17:40:07.9113185Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectKey=SIMOV-imoveiscaixa-batch:00300450-28FA-4EA9-8A96-181ED44DCA26
2026-08-26T17:40:07.9113498Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectName=Simov.Application
2026-08-26T17:40:07.9114006Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:40:07.9114343Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.sourceEncoding=utf-8
2026-08-26T17:40:07.9114654Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.sources=\
2026-08-26T17:40:07.9114742Z 
2026-08-26T17:40:07.9114786Z 
2026-08-26T17:40:07.9115044Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:07.9115312Z "/opt/ads-agent/_work/6/.sonarqube/out/13"
2026-08-26T17:40:07.9115594Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:07.9115896Z "/opt/ads-agent/_work/6/.sonarqube/out/13/Issues.json"
2026-08-26T17:40:07.9115991Z 
2026-08-26T17:40:07.9116293Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod13
2026-08-26T17:40:07.9116716Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectKey=SIMOV-imoveiscaixa-batch:1393E257-1007-43DE-B94C-0B0508C0B309
2026-08-26T17:40:07.9117096Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:40:07.9117488Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:40:07.9117844Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.sourceEncoding=utf-8
2026-08-26T17:40:07.9119753Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.sources=\
2026-08-26T17:40:07.9119856Z 
2026-08-26T17:40:07.9119915Z 
2026-08-26T17:40:07.9120170Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:07.9120431Z "/opt/ads-agent/_work/6/.sonarqube/out/14"
2026-08-26T17:40:07.9120735Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:07.9121054Z "/opt/ads-agent/_work/6/.sonarqube/out/14/Issues.json"
2026-08-26T17:40:07.9121139Z 
2026-08-26T17:40:07.9121806Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod14
2026-08-26T17:40:07.9122424Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectKey=SIMOV-imoveiscaixa-batch:5BE00443-BD63-4C9F-A707-406F2AC94762
2026-08-26T17:40:07.9122792Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectName=Simov.Core
2026-08-26T17:40:07.9123589Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:40:07.9124083Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.sourceEncoding=utf-8
2026-08-26T17:40:07.9124394Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.sources=\
2026-08-26T17:40:07.9124487Z 
2026-08-26T17:40:07.9124536Z 
2026-08-26T17:40:07.9124821Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:07.9125135Z "/opt/ads-agent/_work/6/.sonarqube/out/15"
2026-08-26T17:40:07.9125612Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:07.9125912Z "/opt/ads-agent/_work/6/.sonarqube/out/15/Issues.json"
2026-08-26T17:40:07.9126006Z 
2026-08-26T17:40:07.9126349Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod15
2026-08-26T17:40:07.9126786Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectKey=SIMOV-imoveiscaixa-batch:A79CA783-37A2-49D3-B56C-D9102F046AF9
2026-08-26T17:40:07.9127387Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectName=Simov.Domain
2026-08-26T17:40:07.9127738Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:40:07.9128058Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.sourceEncoding=utf-8
2026-08-26T17:40:07.9128524Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.sources=\
2026-08-26T17:40:07.9128631Z 
2026-08-26T17:40:07.9128691Z 
2026-08-26T17:40:07.9128968Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:07.9129280Z "/opt/ads-agent/_work/6/.sonarqube/out/16"
2026-08-26T17:40:07.9129592Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:07.9129887Z "/opt/ads-agent/_work/6/.sonarqube/out/16/Issues.json"
2026-08-26T17:40:07.9129970Z 
2026-08-26T17:40:07.9130317Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod16
2026-08-26T17:40:07.9130766Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectKey=SIMOV-imoveiscaixa-batch:51ABFD24-E14F-4155-B9D7-CDBD0E536AAB
2026-08-26T17:40:07.9131153Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectName=Simov.Application
2026-08-26T17:40:07.9131550Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:40:07.9131915Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.sourceEncoding=utf-8
2026-08-26T17:40:07.9132246Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.sources=\
2026-08-26T17:40:07.9132353Z 
2026-08-26T17:40:07.9132407Z 
2026-08-26T17:40:07.9132686Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:07.9132978Z "/opt/ads-agent/_work/6/.sonarqube/out/17"
2026-08-26T17:40:07.9133311Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:07.9133795Z "/opt/ads-agent/_work/6/.sonarqube/out/17/Issues.json"
2026-08-26T17:40:07.9133923Z 
2026-08-26T17:40:07.9134264Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod17
2026-08-26T17:40:07.9134941Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectKey=SIMOV-imoveiscaixa-batch:F2842708-9CF5-4649-B3A8-6D39E5E01B77
2026-08-26T17:40:07.9135367Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:40:07.9135807Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:40:07.9136162Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.sourceEncoding=utf-8
2026-08-26T17:40:07.9136489Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.sources=\
2026-08-26T17:40:07.9136635Z 
2026-08-26T17:40:07.9136709Z 
2026-08-26T17:40:07.9137095Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:07.9137586Z "/opt/ads-agent/_work/6/.sonarqube/out/18"
2026-08-26T17:40:07.9138407Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:07.9138833Z "/opt/ads-agent/_work/6/.sonarqube/out/18/Issues.json"
2026-08-26T17:40:07.9138988Z 
2026-08-26T17:40:07.9139462Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod18
2026-08-26T17:40:07.9140075Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectKey=SIMOV-imoveiscaixa-batch:3C101C3B-D8C0-461B-B65B-B87A6F75F210
2026-08-26T17:40:07.9140489Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectName=Simov.Batch
2026-08-26T17:40:07.9140875Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:40:07.9141288Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.sourceEncoding=utf-8
2026-08-26T17:40:07.9141644Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.sources=\
2026-08-26T17:40:07.9141775Z 
2026-08-26T17:40:07.9141851Z 
2026-08-26T17:40:07.9142219Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:07.9142611Z "/opt/ads-agent/_work/6/.sonarqube/out/19"
2026-08-26T17:40:07.9143009Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:07.9143412Z "/opt/ads-agent/_work/6/.sonarqube/out/19/Issues.json"
2026-08-26T17:40:07.9143529Z 
2026-08-26T17:40:07.9144543Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod19
2026-08-26T17:40:07.9145136Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectKey=SIMOV-imoveiscaixa-batch:4E341BE0-BD46-427C-8912-6319C41C89BC
2026-08-26T17:40:07.9145639Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectName=TesteSimovBatch
2026-08-26T17:40:07.9146111Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/tests/TesteSimovBatch
2026-08-26T17:40:07.9146580Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.sourceEncoding=utf-8
2026-08-26T17:40:07.9146946Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.sources=
2026-08-26T17:40:07.9147336Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.tests=\
2026-08-26T17:40:07.9147791Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/AvaliacaoImovelDtoTests.cs",\
2026-08-26T17:40:07.9148281Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/DadoContabilDtoTests.cs",\
2026-08-26T17:40:07.9148732Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/ImovelDtoTests.cs",\
2026-08-26T17:40:07.9149204Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/MatriculaImovelDtoTests.cs",\
2026-08-26T17:40:07.9149868Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/CargaImovelServiceTests.cs",\
2026-08-26T17:40:07.9150356Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/FileServiceTests.cs",\
2026-08-26T17:40:07.9150827Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/LeituraSiaciServiceTests.cs",\
2026-08-26T17:40:07.9151325Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/LogProcessamentoServiceTests.cs",\
2026-08-26T17:40:07.9151792Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/MapperDataServiceTests.cs",\
2026-08-26T17:40:07.9152391Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/WorkerImovelServiceTests.cs",\
2026-08-26T17:40:07.9152898Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSiaciPreCadastroUseCaseTests.cs",\
2026-08-26T17:40:07.9153394Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSimilFotoUseCaseTests.cs",\
2026-08-26T17:40:07.9153962Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSimilUseCaseTests.cs",\
2026-08-26T17:40:07.9154463Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSiopiUseCaseTests.cs",\
2026-08-26T17:40:07.9154901Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/SiaciDDQUseCaseTests.cs",\
2026-08-26T17:40:07.9155673Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Batch/LoaderImoveisSiopiTests.cs",\
2026-08-26T17:40:07.9156088Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/CargaImoveisSiaciTests.cs",\
2026-08-26T17:40:07.9156521Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Configuration/AddHeadersHttpClientTests.cs",\
2026-08-26T17:40:07.9156955Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Configuration/ConnectionsConfigurationTest.cs",\
2026-08-26T17:40:07.9157383Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Contexts/FileProcessingContextTests.cs",\
2026-08-26T17:40:07.9157811Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Contexts/SiicoCallCounterContextTests.cs",\
2026-08-26T17:40:07.9158223Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/DomainObjects/EntityTests.cs",\
2026-08-26T17:40:07.9158663Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/DomainObjects/IAggregateRootTests.cs",\
2026-08-26T17:40:07.9159106Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/CancellationExceptionTests.cs",\
2026-08-26T17:40:07.9159719Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/EntityValidationExceptionTests.cs",\
2026-08-26T17:40:07.9160203Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/GenericExceptionTests.cs",\
2026-08-26T17:40:07.9160669Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/NotFoundExceptionTests.cs",\
2026-08-26T17:40:07.9161131Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/ProcessamentoExceptionTests.cs",\
2026-08-26T17:40:07.9161585Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/RelatedAggregateExceptionTests.cs",\
2026-08-26T17:40:07.9162059Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/UnauthorizedExceptionTests.cs",\
2026-08-26T17:40:07.9162523Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siico/ApiSiicoRestPrivadoTests.cs",\
2026-08-26T17:40:07.9163003Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siico/ApiSiicoRestPublicoTests.cs",\
2026-08-26T17:40:07.9163468Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siiso/ApiSiisoRestPublicoTests.cs",\
2026-08-26T17:40:07.9164047Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/AutenticacarSsoTests.cs",\
2026-08-26T17:40:07.9164502Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/BairroDetalhadoSiicoTests.cs",\
2026-08-26T17:40:07.9164948Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/BairroSiicoTests.cs",\
2026-08-26T17:40:07.9165402Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/MunicipioCompletoSiicoTests.cs",\
2026-08-26T17:40:07.9165866Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/ResponseGenericoTests.cs",\
2026-08-26T17:40:07.9166314Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/Siico/CepSiicoTests.cs",\
2026-08-26T17:40:07.9166766Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Domain/Layouts/BaseArquivoLayoutTests.cs",\
2026-08-26T17:40:07.9167224Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/AgrupamentoVendaImovelTests.cs",\
2026-08-26T17:40:07.9167676Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/AvaliacaoImovelSiopiTests.cs",\
2026-08-26T17:40:07.9168135Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/ControleProcessamentoTests.cs",\
2026-08-26T17:40:07.9168657Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/DadoContabilTests.cs",\
2026-08-26T17:40:07.9169106Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoAgrupamentoVendaImovelTests.cs",\
2026-08-26T17:40:07.9169573Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoDadoContabilTests.cs",\
2026-08-26T17:40:07.9170012Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoImovelTests.cs",\
2026-08-26T17:40:07.9170437Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/ImovelTests.cs",\
2026-08-26T17:40:07.9170876Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/MatriculaImovelSiopiTests.cs",\
2026-08-26T17:40:07.9171383Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/MensagemControleProcessamentoTests.cs",\
2026-08-26T17:40:07.9171832Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/RotinaProcessamentoTests.cs",\
2026-08-26T17:40:07.9172268Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/SiopiImovelTests.cs",\
2026-08-26T17:40:07.9172688Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ArquivoSiaciFake.cs",\
2026-08-26T17:40:07.9173104Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ImovelDtoFake.cs",\
2026-08-26T17:40:07.9173515Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ImovelFake.cs",\
2026-08-26T17:40:07.9174012Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/LayoutArquivoFake.cs",\
2026-08-26T17:40:07.9174388Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/Siico/ResponsesFake.cs",\
2026-08-26T17:40:07.9174699Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/InfraDataEF/HistoricosInterceptorTests.cs",\
2026-08-26T17:40:07.9175027Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/InfraDataEF/SimovDbContextTests.cs",\
2026-08-26T17:40:07.9175343Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Layouts/SiaciLayoutTests.cs"
2026-08-26T17:40:07.9175448Z 
2026-08-26T17:40:07.9175737Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:07.9175945Z "/opt/ads-agent/_work/6/.sonarqube/out/20"
2026-08-26T17:40:07.9176172Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:07.9176474Z "/opt/ads-agent/_work/6/.sonarqube/out/20/Issues.json"
2026-08-26T17:40:07.9176551Z 
2026-08-26T17:40:07.9176860Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod20
2026-08-26T17:40:07.9177262Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectKey=SIMOV-imoveiscaixa-batch:0DC13198-1AC4-46C6-B9B3-E2987B8496D5
2026-08-26T17:40:07.9177538Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectName=Simov.Core
2026-08-26T17:40:07.9178034Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:40:07.9178270Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.sourceEncoding=utf-8
2026-08-26T17:40:07.9178486Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.sources=\
2026-08-26T17:40:07.9178553Z 
2026-08-26T17:40:07.9178597Z 
2026-08-26T17:40:07.9178834Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:07.9179100Z "/opt/ads-agent/_work/6/.sonarqube/out/21"
2026-08-26T17:40:07.9179399Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:07.9179685Z "/opt/ads-agent/_work/6/.sonarqube/out/21/Issues.json"
2026-08-26T17:40:07.9179784Z 
2026-08-26T17:40:07.9180088Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod21
2026-08-26T17:40:07.9180584Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectKey=SIMOV-imoveiscaixa-batch:BA15777F-9613-49A5-8C5F-8CBFA5F86619
2026-08-26T17:40:07.9181036Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectName=Simov.Domain
2026-08-26T17:40:07.9181452Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:40:07.9181869Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.sourceEncoding=utf-8
2026-08-26T17:40:07.9182384Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.sources=\
2026-08-26T17:40:07.9182498Z 
2026-08-26T17:40:07.9182559Z 
2026-08-26T17:40:07.9182883Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:07.9183210Z "/opt/ads-agent/_work/6/.sonarqube/out/22"
2026-08-26T17:40:07.9183568Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:07.9183998Z "/opt/ads-agent/_work/6/.sonarqube/out/22/Issues.json"
2026-08-26T17:40:07.9184096Z 
2026-08-26T17:40:07.9184363Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod22
2026-08-26T17:40:07.9184751Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectKey=SIMOV-imoveiscaixa-batch:48A485AE-9F33-C9A7-979C-54916B65C32E
2026-08-26T17:40:07.9185025Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectName=Simov.Application
2026-08-26T17:40:07.9185283Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:40:07.9185521Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.sourceEncoding=utf-8
2026-08-26T17:40:07.9185767Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.sources=\
2026-08-26T17:40:07.9185848Z 
2026-08-26T17:40:07.9185883Z 
2026-08-26T17:40:07.9186073Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:07.9186272Z "/opt/ads-agent/_work/6/.sonarqube/out/23"
2026-08-26T17:40:07.9186474Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:07.9186679Z "/opt/ads-agent/_work/6/.sonarqube/out/23/Issues.json"
2026-08-26T17:40:07.9186744Z 
2026-08-26T17:40:07.9186972Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod23
2026-08-26T17:40:07.9187286Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectKey=SIMOV-imoveiscaixa-batch:309346D6-2461-4973-A29B-7A38A756C0DE
2026-08-26T17:40:07.9187560Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:40:07.9187819Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:40:07.9188057Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.sourceEncoding=utf-8
2026-08-26T17:40:07.9188266Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.sources=\
2026-08-26T17:40:07.9188332Z 
2026-08-26T17:40:07.9188383Z 
2026-08-26T17:40:07.9188569Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:07.9188765Z "/opt/ads-agent/_work/6/.sonarqube/out/24"
2026-08-26T17:40:07.9188978Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:07.9189186Z "/opt/ads-agent/_work/6/.sonarqube/out/24/Issues.json"
2026-08-26T17:40:07.9189247Z 
2026-08-26T17:40:07.9189474Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod24
2026-08-26T17:40:07.9189773Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectKey=SIMOV-imoveiscaixa-batch:4BF20498-1845-4781-82CB-E7783C0081FA
2026-08-26T17:40:07.9190034Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectName=Simov.Batch
2026-08-26T17:40:07.9190289Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:40:07.9190526Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.sourceEncoding=utf-8
2026-08-26T17:40:07.9190735Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.sources=\
2026-08-26T17:40:07.9190800Z 
2026-08-26T17:40:07.9190834Z 
2026-08-26T17:40:07.9191027Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:07.9191226Z "/opt/ads-agent/_work/6/.sonarqube/out/25"
2026-08-26T17:40:07.9191431Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:07.9191635Z "/opt/ads-agent/_work/6/.sonarqube/out/25/Issues.json"
2026-08-26T17:40:07.9191710Z 
2026-08-26T17:40:07.9191927Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod25
2026-08-26T17:40:07.9192311Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectKey=SIMOV-imoveiscaixa-batch:D54F14FF-8EEB-4EB8-994B-69D77DDB78FD
2026-08-26T17:40:07.9192578Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectName=TesteSimovBatch
2026-08-26T17:40:07.9192929Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/tests/TesteSimovBatch
2026-08-26T17:40:07.9193185Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.sourceEncoding=utf-8
2026-08-26T17:40:07.9193395Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.sources=
2026-08-26T17:40:07.9193603Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.tests=\
2026-08-26T17:40:07.9193777Z 
2026-08-26T17:40:07.9193815Z 
2026-08-26T17:40:07.9194016Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:07.9194365Z "/opt/ads-agent/_work/6/.sonarqube/out/26"
2026-08-26T17:40:07.9194579Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:07.9194786Z "/opt/ads-agent/_work/6/.sonarqube/out/26/Issues.json"
2026-08-26T17:40:07.9194847Z 
2026-08-26T17:40:07.9195076Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod26
2026-08-26T17:40:07.9195244Z sonar.host.url=https://sonar.apps.produtos4.caixa/
2026-08-26T17:40:07.9195429Z sonar.projectKey=SIMOV-imoveiscaixa-batch
2026-08-26T17:40:07.9195613Z sonar.projectName=SIMOV-imoveiscaixa-batch
2026-08-26T17:40:07.9195795Z sonar.projectVersion=1.0-SNAPSHOT
2026-08-26T17:40:07.9195918Z sonar.branch.name=CorrecoesSonar
2026-08-26T17:40:07.9196190Z sonar.scanner.metadataFilePath=/opt/ads-agent/_work/_temp/sonar/1.0-SNAPSHOT/f442c3b3-ec53-840d-3dab-bba3c4de61f5/report-task.txt
2026-08-26T17:40:07.9196464Z sonar.cs.opencover.reportsPaths=/opt/ads-agent/_work/_temp/**/coverage.opencover.xml
2026-08-26T17:40:07.9196691Z sonar.cs.vstest.reportsPaths=/opt/ads-agent/_work/_temp/**/*.trx
2026-08-26T17:40:07.9196825Z sonar.visualstudio.enable=false
2026-08-26T17:40:07.9196892Z 
2026-08-26T17:40:07.9198337Z sonar.modules=0B395246-F58A-479C-B0B1-C6A6045C6FD3,5E55366D-25CB-4B0F-BAF4-738003A18ED2,0847F1F3-B5DA-4FC3-8EEF-882D75A674FD,D745E52F-7A66-4C38-B30D-3A27EA75CCCE,FBCB055E-203B-4979-BB94-B02AE276DE0B,D6E1F89D-8BFA-426E-BC94-C1182DBD0621,AD78E470-A67C-4901-A53F-E3D7D40350CD,B904AD47-4763-413C-9324-7889FD92EFA6,6679F22B-144A-4C59-A28C-2A87F31E3915,EC78B0BC-170C-482C-867B-C5402B449403,1B2C05E0-E98F-477C-931D-923BBE79AE4E,A180ED2D-1521-44A6-B6EA-5DDEC55D2C17,A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E,00300450-28FA-4EA9-8A96-181ED44DCA26,1393E257-1007-43DE-B94C-0B0508C0B309,5BE00443-BD63-4C9F-A707-406F2AC94762,A79CA783-37A2-49D3-B56C-D9102F046AF9,51ABFD24-E14F-4155-B9D7-CDBD0E536AAB,F2842708-9CF5-4649-B3A8-6D39E5E01B77,3C101C3B-D8C0-461B-B65B-B87A6F75F210,4E341BE0-BD46-427C-8912-6319C41C89BC,0DC13198-1AC4-46C6-B9B3-E2987B8496D5,BA15777F-9613-49A5-8C5F-8CBFA5F86619,48A485AE-9F33-C9A7-979C-54916B65C32E,309346D6-2461-4973-A29B-7A38A756C0DE,4BF20498-1845-4781-82CB-E7783C0081FA,D54F14FF-8EEB-4EB8-994B-69D77DDB78FD
2026-08-26T17:40:07.9198925Z 
2026-08-26T17:40:07.9198978Z 
2026-08-26T17:40:07.9199171Z ------------------------------------------------------------------------
2026-08-26T17:40:07.9199542Z 14:40:07.903  Writing processing summary to /opt/ads-agent/_work/6/.sonarqube/out/ProjectInfo.log
2026-08-26T17:40:07.9199818Z The SONAR_SCANNER_HOME environment variable is not required and will be ignored.
2026-08-26T17:40:07.9200024Z Calling the SonarScanner CLI...
2026-08-26T17:40:07.9200445Z Executing file /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/sonar-scanner-4.7.0.2747/bin/sonar-scanner
2026-08-26T17:40:07.9200967Z   Args: -Dsonar.scanAllFiles=true -Dproject.settings=/opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties --from=ScannerMSBuild/5.8 --debug <sensitive data removed>
2026-08-26T17:40:07.9201325Z   Working directory: /opt/ads-agent/_work/6
2026-08-26T17:40:07.9201534Z   Timeout (ms):-1
2026-08-26T17:40:07.9201832Z   Process id: 26485
2026-08-26T17:40:08.0331158Z 14:40:08.028 INFO: Scanner configuration file: /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/sonar-scanner-4.7.0.2747/conf/sonar-scanner.properties
2026-08-26T17:40:08.0331610Z 14:40:08.030 INFO: Project root configuration file: /opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties
2026-08-26T17:40:08.0620471Z 14:40:08.061 INFO: SonarScanner 4.7.0.2747
2026-08-26T17:40:08.0621035Z 14:40:08.061 INFO: Java 11 Oracle Corporation (64-bit)
2026-08-26T17:40:08.0621322Z 14:40:08.061 INFO: Linux 5.18.5-100.fc35.x86_64 amd64
2026-08-26T17:40:08.1532134Z 14:40:08.152 DEBUG: keyStore is : 
2026-08-26T17:40:08.1532513Z 14:40:08.152 DEBUG: keyStore type is : pkcs12
2026-08-26T17:40:08.1532755Z 14:40:08.152 DEBUG: keyStore provider is : 
2026-08-26T17:40:08.1532924Z 14:40:08.152 DEBUG: init keystore
2026-08-26T17:40:08.1533076Z 14:40:08.152 DEBUG: init keymanager of type SunX509
2026-08-26T17:40:08.2163613Z 14:40:08.215 DEBUG: Create: /opt/ads-agent/cache-tools/.sonar/cache
2026-08-26T17:40:08.2167102Z 14:40:08.216 INFO: User cache: /opt/ads-agent/cache-tools/.sonar/cache
2026-08-26T17:40:08.2167694Z 14:40:08.216 DEBUG: Create: /opt/ads-agent/cache-tools/.sonar/cache/_tmp
2026-08-26T17:40:08.2182861Z 14:40:08.217 DEBUG: Extract sonar-scanner-api-batch in temp...
2026-08-26T17:40:08.2202603Z 14:40:08.219 DEBUG: Get bootstrap index...
2026-08-26T17:40:08.2202941Z 14:40:08.220 DEBUG: Download: https://sonar.apps.produtos4.caixa/batch/index
2026-08-26T17:40:08.3080915Z 14:40:08.307 INFO: ------------------------------------------------------------------------
2026-08-26T17:40:08.3081200Z 14:40:08.307 INFO: EXECUTION FAILURE
2026-08-26T17:40:08.3081452Z 14:40:08.307 INFO: ------------------------------------------------------------------------
2026-08-26T17:40:08.3084850Z 14:40:08.307 INFO: Total time: 0.301s
2026-08-26T17:40:08.3087994Z ##[error]14:40:08.307 ERROR: SonarQube server [https://sonar.apps.produtos4.caixa] can not be reached
2026-08-26T17:40:08.3088577Z 14:40:08.307 ERROR: SonarQube server [https://sonar.apps.produtos4.caixa] can not be reached
2026-08-26T17:40:08.3170773Z 14:40:08.316 INFO: Final Memory: 4M/68M
2026-08-26T17:40:08.3171593Z 14:40:08.316 INFO: ------------------------------------------------------------------------
2026-08-26T17:40:08.3172654Z ##[error]14:40:08.316 ERROR: Error during SonarScanner execution
org.sonarsource.scanner.api.internal.ScannerException: Unable to execute SonarScanner analysis
2026-08-26T17:40:08.3173778Z 14:40:08.316 ERROR: Error during SonarScanner execution
2026-08-26T17:40:08.3174131Z org.sonarsource.scanner.api.internal.ScannerException: Unable to execute SonarScanner analysis
2026-08-26T17:40:08.3176014Z ##[error]at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:85)
	at java.base/java.security.AccessController.doPrivileged(Native Method)
	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:74)
	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:70)
	at org.sonarsource.scanner.api.EmbeddedScanner.doStart(EmbeddedScanner.java:185)
	at org.sonarsource.scanner.api.EmbeddedScanner.start(EmbeddedScanner.java:123)
	at org.sonarsource.scanner.cli.Main.execute(Main.java:73)
	at org.sonarsource.scanner.cli.Main.main(Main.java:61)
2026-08-26T17:40:08.3176866Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:85)
2026-08-26T17:40:08.3177077Z 	at java.base/java.security.AccessController.doPrivileged(Native Method)
2026-08-26T17:40:08.3177279Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:74)
2026-08-26T17:40:08.3177510Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:70)
2026-08-26T17:40:08.3178056Z 	at org.sonarsource.scanner.api.EmbeddedScanner.doStart(EmbeddedScanner.java:185)
2026-08-26T17:40:08.3178252Z 	at org.sonarsource.scanner.api.EmbeddedScanner.start(EmbeddedScanner.java:123)
2026-08-26T17:40:08.3178439Z 	at org.sonarsource.scanner.cli.Main.execute(Main.java:73)
2026-08-26T17:40:08.3178607Z 	at org.sonarsource.scanner.cli.Main.main(Main.java:61)
2026-08-26T17:40:08.3179308Z ##[error]Caused by: java.lang.IllegalStateException: Fail to get bootstrap index from server
	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:42)
	at org.sonarsource.scanner.api.internal.JarDownloader.getScannerEngineFiles(JarDownloader.java:58)
	at org.sonarsource.scanner.api.internal.JarDownloader.download(JarDownloader.java:53)
2026-08-26T17:40:08.3179916Z Caused by: java.lang.IllegalStateException: Fail to get bootstrap index from server
2026-08-26T17:40:08.3180119Z 	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:42)
2026-08-26T17:40:08.3180356Z 	at org.sonarsource.scanner.api.internal.JarDownloader.getScannerEngineFiles(JarDownloader.java:58)
2026-08-26T17:40:08.3180570Z 	at org.sonarsource.scanner.api.internal.JarDownloader.download(JarDownloader.java:53)
2026-08-26T17:40:08.3181029Z ##[error]at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:76)
	... 7 more
2026-08-26T17:40:08.3181445Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:76)
2026-08-26T17:40:08.3181623Z 	... 7 more
2026-08-26T17:40:08.3182280Z ##[error]Caused by: javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:128)
	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:264)
2026-08-26T17:40:08.3182878Z Caused by: javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:40:08.3183107Z 	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:128)
2026-08-26T17:40:08.3183290Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
2026-08-26T17:40:08.3183486Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:264)
2026-08-26T17:40:08.3184381Z ##[error]at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:259)
	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1329)
	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.onConsumeCertificate(CertificateMessage.java:1204)
	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.consume(CertificateMessage.java:1151)
2026-08-26T17:40:08.3185086Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:259)
2026-08-26T17:40:08.3185315Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1329)
2026-08-26T17:40:08.3185574Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.onConsumeCertificate(CertificateMessage.java:1204)
2026-08-26T17:40:08.3185824Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.consume(CertificateMessage.java:1151)
2026-08-26T17:40:08.3186298Z ##[error]at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:392)
	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:444)
2026-08-26T17:40:08.3186710Z 	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:392)
2026-08-26T17:40:08.3186903Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:444)
2026-08-26T17:40:08.3187349Z ##[error]at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:421)
2026-08-26T17:40:08.3187866Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:421)
2026-08-26T17:40:08.3189124Z ##[error]at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:178)
	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:164)
	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1152)
	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1063)
	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:402)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connectTls(RealConnection.java:336)
2026-08-26T17:40:08.3189834Z 	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:178)
2026-08-26T17:40:08.3190030Z 	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:164)
2026-08-26T17:40:08.3190228Z 	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1152)
2026-08-26T17:40:08.3190487Z 	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1063)
2026-08-26T17:40:08.3190703Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:402)
2026-08-26T17:40:08.3190920Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connectTls(RealConnection.java:336)
2026-08-26T17:40:08.3191381Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.establishProtocol(RealConnection.java:300)
2026-08-26T17:40:08.3191806Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.establishProtocol(RealConnection.java:300)
2026-08-26T17:40:08.3192398Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connect(RealConnection.java:185)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findConnection(ExchangeFinder.java:224)
2026-08-26T17:40:08.3192887Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connect(RealConnection.java:185)
2026-08-26T17:40:08.3193144Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findConnection(ExchangeFinder.java:224)
2026-08-26T17:40:08.3194250Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findHealthyConnection(ExchangeFinder.java:108)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.find(ExchangeFinder.java:88)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.Transmitter.newExchange(Transmitter.java:169)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ConnectInterceptor.intercept(ConnectInterceptor.java:41)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:40:08.3194987Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findHealthyConnection(ExchangeFinder.java:108)
2026-08-26T17:40:08.3195322Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.find(ExchangeFinder.java:88)
2026-08-26T17:40:08.3195579Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.Transmitter.newExchange(Transmitter.java:169)
2026-08-26T17:40:08.3195834Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ConnectInterceptor.intercept(ConnectInterceptor.java:41)
2026-08-26T17:40:08.3196090Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:40:08.3196674Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.cache.CacheInterceptor.intercept(CacheInterceptor.java:94)
2026-08-26T17:40:08.3197212Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:40:08.3197457Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.cache.CacheInterceptor.intercept(CacheInterceptor.java:94)
2026-08-26T17:40:08.3198026Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:40:08.3198602Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:40:08.3198968Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:40:08.3199475Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.BridgeInterceptor.intercept(BridgeInterceptor.java:93)
2026-08-26T17:40:08.3199931Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.BridgeInterceptor.intercept(BridgeInterceptor.java:93)
2026-08-26T17:40:08.3201652Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RetryAndFollowUpInterceptor.intercept(RetryAndFollowUpInterceptor.java:88)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.getResponseWithInterceptorChain(RealCall.java:221)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.execute(RealCall.java:81)
	at org.sonarsource.scanner.api.internal.ServerConnection.callUrl(ServerConnection.java:115)
	at org.sonarsource.scanner.api.internal.ServerConnection.downloadString(ServerConnection.java:99)
	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:39)
	... 10 more
Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:40:08.3202725Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:40:08.3202982Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RetryAndFollowUpInterceptor.intercept(RetryAndFollowUpInterceptor.java:88)
2026-08-26T17:40:08.3203242Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:40:08.3203785Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:40:08.3204138Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.getResponseWithInterceptorChain(RealCall.java:221)
2026-08-26T17:40:08.3204449Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.execute(RealCall.java:81)
2026-08-26T17:40:08.3204718Z 	at org.sonarsource.scanner.api.internal.ServerConnection.callUrl(ServerConnection.java:115)
2026-08-26T17:40:08.3204932Z 	at org.sonarsource.scanner.api.internal.ServerConnection.downloadString(ServerConnection.java:99)
2026-08-26T17:40:08.3205195Z 	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:39)
2026-08-26T17:40:08.3205410Z 	... 10 more
2026-08-26T17:40:08.3205610Z Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:40:08.3206515Z ##[error]at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:385)
	at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:290)
	at java.base/sun.security.validator.Validator.validate(Validator.java:264)
	at java.base/sun.security.ssl.X509TrustManagerImpl.validate(X509TrustManagerImpl.java:321)
	at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:221)
2026-08-26T17:40:08.3207102Z 	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:385)
2026-08-26T17:40:08.3207335Z 	at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:290)
2026-08-26T17:40:08.3207530Z 	at java.base/sun.security.validator.Validator.validate(Validator.java:264)
2026-08-26T17:40:08.3207726Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.validate(X509TrustManagerImpl.java:321)
2026-08-26T17:40:08.3207942Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:221)
2026-08-26T17:40:08.3208331Z ##[error]at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:129)
2026-08-26T17:40:08.3208712Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:129)
2026-08-26T17:40:08.3209152Z ##[error]at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1313)
	... 43 more
2026-08-26T17:40:08.3209655Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1313)
2026-08-26T17:40:08.3209832Z 	... 43 more
2026-08-26T17:40:08.3210219Z ##[error]Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:40:08.3210588Z Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:40:08.3211090Z ##[error]at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:141)
	at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:126)
2026-08-26T17:40:08.3211525Z 	at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:141)
2026-08-26T17:40:08.3211751Z 	at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:126)
2026-08-26T17:40:08.3212118Z ##[error]at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
2026-08-26T17:40:08.3212462Z 	at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
2026-08-26T17:40:08.3212815Z ##[error]at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:380)
	... 49 more
2026-08-26T17:40:08.3213174Z 	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:380)
2026-08-26T17:40:08.3213326Z 	... 49 more
2026-08-26T17:40:08.3365641Z Process returned exit code 1
2026-08-26T17:40:08.3395745Z ##[error]The SonarScanner did not complete successfully
2026-08-26T17:40:08.3396569Z The SonarScanner did not complete successfully
2026-08-26T17:40:08.3397168Z ##[error]14:40:08.339  Post-processing failed. Exit code: 1
2026-08-26T17:40:08.3398075Z 14:40:08.339  Post-processing failed. Exit code: 1
2026-08-26T17:40:08.3484786Z ##[error]The process '/opt/ads-agent/cache-tools/.dotnet//dotnet' failed with exit code 1
2026-08-26T17:40:08.3517841Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 7 out of 10) after 49000 ms
2026-08-26T17:40:57.4662481Z [command]/opt/ads-agent/cache-tools/.dotnet//dotnet /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/SonarScanner.MSBuild.dll end
2026-08-26T17:40:57.5203433Z SonarScanner for MSBuild 5.8
2026-08-26T17:40:57.5204760Z Using the .NET Core version of the Scanner for MSBuild
2026-08-26T17:40:57.5621625Z Post-processing started.
2026-08-26T17:40:57.6354261Z 14:40:57.634  14:40:57.613  /opt/ads-agent/_work/6/.sonarqube/bin/targets/SonarQube.Integration.targets does not exist
2026-08-26T17:40:57.6354981Z 14:40:57.634  14:40:57.634  sonar.verbose=true was specified - setting the log verbosity to 'Debug'
2026-08-26T17:40:57.6356070Z 14:40:57.635  Loading the SonarQube analysis config from /opt/ads-agent/_work/6/.sonarqube/conf/SonarQubeAnalysisConfig.xml
2026-08-26T17:40:57.6356322Z 14:40:57.635  Not running under TeamBuild
2026-08-26T17:40:57.6356555Z 14:40:57.635  Analysis base directory: /opt/ads-agent/_work/6/.sonarqube
2026-08-26T17:40:57.6358325Z Build directory: 
2026-08-26T17:40:57.6359079Z Bin directory: /opt/ads-agent/_work/6/.sonarqube/bin
2026-08-26T17:40:57.6359328Z Config directory: /opt/ads-agent/_work/6/.sonarqube/conf
2026-08-26T17:40:57.6359537Z Output directory: /opt/ads-agent/_work/6/.sonarqube/out
2026-08-26T17:40:57.6359802Z Config file: /opt/ads-agent/_work/6/.sonarqube/conf/SonarQubeAnalysisConfig.xml
2026-08-26T17:40:57.6368205Z 14:40:57.636  Generating SonarQube project properties file to /opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties
2026-08-26T17:40:57.6540003Z 14:40:57.653  Setting analysis property: sonar.visualstudio.enable=false
2026-08-26T17:40:57.6717891Z 14:40:57.671  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/0/Issues.json
2026-08-26T17:40:57.6753211Z 14:40:57.675  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/1/Issues.json
2026-08-26T17:40:57.6785166Z 14:40:57.678  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/2/Issues.json
2026-08-26T17:40:57.6889793Z 14:40:57.688  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/3/Issues.json
2026-08-26T17:40:57.6919728Z 14:40:57.691  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/4/Issues.json
2026-08-26T17:40:57.6949852Z 14:40:57.694  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/5/Issues.json
2026-08-26T17:40:57.6961279Z 14:40:57.696  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/6/Issues.json
2026-08-26T17:40:57.6971184Z 14:40:57.697  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/7/Issues.json
2026-08-26T17:40:57.7072597Z 14:40:57.706  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/8/Issues.json
2026-08-26T17:40:57.7172807Z 14:40:57.716  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/9/Issues.json
2026-08-26T17:40:57.7202551Z 14:40:57.72  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/10/Issues.json
2026-08-26T17:40:57.7339529Z 14:40:57.733  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/11/Issues.json
2026-08-26T17:40:57.7365407Z 14:40:57.736  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/12/Issues.json
2026-08-26T17:40:57.7394610Z 14:40:57.739  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/13/Issues.json
2026-08-26T17:40:57.7404373Z 14:40:57.74  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/14/Issues.json
2026-08-26T17:40:57.7489198Z 14:40:57.748  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/15/Issues.json
2026-08-26T17:40:57.7512356Z 14:40:57.751  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/16/Issues.json
2026-08-26T17:40:57.7536406Z 14:40:57.753  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/17/Issues.json
2026-08-26T17:40:57.7545687Z 14:40:57.754  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/18/Issues.json
2026-08-26T17:40:57.7553603Z 14:40:57.755  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/19/Issues.json
2026-08-26T17:40:57.7556801Z 14:40:57.755  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/20/Issues.json
2026-08-26T17:40:57.7634863Z 14:40:57.763  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/21/Issues.json
2026-08-26T17:40:57.7658095Z 14:40:57.765  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/22/Issues.json
2026-08-26T17:40:57.7683613Z 14:40:57.768  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/23/Issues.json
2026-08-26T17:40:57.7692728Z 14:40:57.769  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/24/Issues.json
2026-08-26T17:40:57.7700963Z 14:40:57.77  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/25/Issues.json
2026-08-26T17:40:57.7704794Z 14:40:57.77  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/26/Issues.json
2026-08-26T17:40:57.7814559Z 14:40:57.781  Using longest common projects path as a base directory: '/opt/ads-agent/_work/6/s'.
2026-08-26T17:40:57.7912272Z 14:40:57.79  File was referenced by the following projects: '/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/TesteSimovBatch.csproj', '/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/TesteSimovBatch.csproj'.
2026-08-26T17:40:57.8014327Z 14:40:57.796  Dumping content of sonar-project.properties
2026-08-26T17:40:57.8014928Z ------------------------------------------------------------------------
2026-08-26T17:40:57.8015749Z sonar.projectKey=SIMOV-imoveiscaixa-batch
2026-08-26T17:40:57.8016036Z sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar
2026-08-26T17:40:57.8016258Z sonar.projectBaseDir=/opt/ads-agent/_work/6/s
2026-08-26T17:40:57.8016324Z 
2026-08-26T17:40:57.8016649Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectKey=SIMOV-imoveiscaixa-batch:0B395246-F58A-479C-B0B1-C6A6045C6FD3
2026-08-26T17:40:57.8016921Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectName=Simov.Core
2026-08-26T17:40:57.8017184Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:40:57.8017429Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.sourceEncoding=utf-8
2026-08-26T17:40:57.8017641Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.sources=\
2026-08-26T17:40:57.8017876Z "/opt/ads-agent/_work/6/s/src/Simov.Core/AutenticacaoSso/AutenticacarSso.cs",\
2026-08-26T17:40:57.8018112Z "/opt/ads-agent/_work/6/s/src/Simov.Core/AutenticacaoSso/IAutenticacarSso.cs",\
2026-08-26T17:40:57.8018357Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Data/IBaseRepository.cs",\
2026-08-26T17:40:57.8018652Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Data/IUnitOfWork.cs",\
2026-08-26T17:40:57.8019437Z "/opt/ads-agent/_work/6/s/src/Simov.Core/DomainObjects/Entity.cs",\
2026-08-26T17:40:57.8019658Z "/opt/ads-agent/_work/6/s/src/Simov.Core/DomainObjects/IAggregateRoot.cs",\
2026-08-26T17:40:57.8019879Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/ApplicationException.cs",\
2026-08-26T17:40:57.8020106Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/CancellationException.cs",\
2026-08-26T17:40:57.8020333Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/EntityValidationException.cs",\
2026-08-26T17:40:57.8020561Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/GenericException.cs",\
2026-08-26T17:40:57.8020854Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/NotFoundException.cs",\
2026-08-26T17:40:57.8021084Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/ProcessamentoException.cs",\
2026-08-26T17:40:57.8021424Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/RelatedAggregateException.cs",\
2026-08-26T17:40:57.8021755Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/UnauthorizedException.cs",\
2026-08-26T17:40:57.8022021Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Logging/LoggerExtensions.cs",\
2026-08-26T17:40:57.8022242Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siico/ApiSiicoRestPrivado.cs",\
2026-08-26T17:40:57.8022461Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siico/ApiSiicoRestPublico.cs",\
2026-08-26T17:40:57.8022683Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siiso/ApiSiisoRestPublico.cs",\
2026-08-26T17:40:57.8022900Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/DadosDto.cs",\
2026-08-26T17:40:57.8023120Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/DadosSimilDto.cs",\
2026-08-26T17:40:57.8023336Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/FotosDto.cs",\
2026-08-26T17:40:57.8023552Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/ListaFotoDto.cs",\
2026-08-26T17:40:57.8023886Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/ISOAPWeb.cs",\
2026-08-26T17:40:57.8024116Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/RobustSoapDeserializer.cs",\
2026-08-26T17:40:57.8024332Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/SOAPWeb.cs",\
2026-08-26T17:40:57.8024546Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/ResponseGenerico.cs",\
2026-08-26T17:40:57.8024774Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/BairroDetalhadoSiico.cs",\
2026-08-26T17:40:57.8024993Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/BairroSiico.cs",\
2026-08-26T17:40:57.8025211Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/CepSiico.cs",\
2026-08-26T17:40:57.8025427Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/LocalidadeSiico.cs",\
2026-08-26T17:40:57.8025653Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioCompletoSiico.cs",\
2026-08-26T17:40:57.8025882Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioParcialSiico.cs",\
2026-08-26T17:40:57.8026107Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioSiico.cs",\
2026-08-26T17:40:57.8026328Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/TipoLogradouroSiico.cs",\
2026-08-26T17:40:57.8026543Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/UnidadeCaixa.cs",\
2026-08-26T17:40:57.8026767Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/UnidadeFederacaoSiico.cs",\
2026-08-26T17:40:57.8026993Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/EnderecoPessoaSiiso.cs",\
2026-08-26T17:40:57.8027225Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/LocalidadeNascimentoSiiso.cs",\
2026-08-26T17:40:57.8027578Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/PessoaSiiso.cs",\
2026-08-26T17:40:57.8027806Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siico/IApiSiicoRestPrivado.cs",\
2026-08-26T17:40:57.8028043Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siico/IApiSiicoRestPublico.cs",\
2026-08-26T17:40:57.8028277Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siiso/IApiSiisoRestPublico.cs"
2026-08-26T17:40:57.8028425Z 
2026-08-26T17:40:57.8028628Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:57.8028825Z "/opt/ads-agent/_work/6/.sonarqube/out/0"
2026-08-26T17:40:57.8029037Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:57.8029241Z "/opt/ads-agent/_work/6/.sonarqube/out/0/Issues.json"
2026-08-26T17:40:57.8029311Z 
2026-08-26T17:40:57.8029538Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod0
2026-08-26T17:40:57.8029855Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectKey=SIMOV-imoveiscaixa-batch:5E55366D-25CB-4B0F-BAF4-738003A18ED2
2026-08-26T17:40:57.8030167Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectName=Simov.Domain
2026-08-26T17:40:57.8030419Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:40:57.8030655Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.sourceEncoding=utf-8
2026-08-26T17:40:57.8030861Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.sources=\
2026-08-26T17:40:57.8031086Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AgrupamentoVendaImovel.cs",\
2026-08-26T17:40:57.8031374Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaArquivoLote.cs",\
2026-08-26T17:40:57.8031983Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaFotoImovel.cs",\
2026-08-26T17:40:57.8032300Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaFotoLote.cs",\
2026-08-26T17:40:57.8032629Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaUsuario.cs",\
2026-08-26T17:40:57.8032918Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AvaliacaoImovel.cs",\
2026-08-26T17:40:57.8033139Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/ComodoImovel.cs",\
2026-08-26T17:40:57.8033361Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/ControleProcessamento.cs",\
2026-08-26T17:40:57.8033585Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/DadoContabil.cs",\
2026-08-26T17:40:57.8033891Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/FotoImovel.cs",\
2026-08-26T17:40:57.8034121Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoAgrupamentoVendaImovel.cs",\
2026-08-26T17:40:57.8034353Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoAvaliacaoImovel.cs",\
2026-08-26T17:40:57.8034575Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoComodoImovel.cs",\
2026-08-26T17:40:57.8034870Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoDadoContabil.cs",\
2026-08-26T17:40:57.8035093Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoImovel.cs",\
2026-08-26T17:40:57.8035314Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoMatriculaImovel.cs",\
2026-08-26T17:40:57.8035523Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/Imovel.cs",\
2026-08-26T17:40:57.8035733Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/MatriculaImovel.cs",\
2026-08-26T17:40:57.8035963Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/MensagemControleProcessamento.cs",\
2026-08-26T17:40:57.8036182Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/RotinaProcessamento.cs",\
2026-08-26T17:40:57.8036397Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/ClassificacaoImovelEnum.cs",\
2026-08-26T17:40:57.8036613Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/EstadoConservacaoEnum.cs",\
2026-08-26T17:40:57.8036835Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/FuncionalidadeSistemaEnum.cs",\
2026-08-26T17:40:57.8037049Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/IcAcaoSistemaEnum.cs",\
2026-08-26T17:40:57.8037267Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/IcShortEnum.cs",\
2026-08-26T17:40:57.8037479Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/MotivoExclusaoEnum.cs",\
2026-08-26T17:40:57.8037700Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/OrgaoProprietarioImovelEnum.cs",\
2026-08-26T17:40:57.8037916Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/OrigemImovelEnum.cs",\
2026-08-26T17:40:57.8038214Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/ResultadoMensagemProcessamentoEnum.cs",\
2026-08-26T17:40:57.8038445Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/RotinaProcessamentoEnum.cs",\
2026-08-26T17:40:57.8038672Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/SituacaoImovelEnum.cs",\
2026-08-26T17:40:57.8038890Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/SituacaoProcessamentoEnum.cs",\
2026-08-26T17:40:57.8039108Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoCampoEnum.cs",\
2026-08-26T17:40:57.8039318Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoComodoEnum.cs",\
2026-08-26T17:40:57.8039586Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoImovelEnum.cs",\
2026-08-26T17:40:57.8039803Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoMatriculaEnum.cs",\
2026-08-26T17:40:57.8040037Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAgrupamentoVendaImovelRepository.cs",\
2026-08-26T17:40:57.8040275Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaArquivoLoteRepository.cs",\
2026-08-26T17:40:57.8040515Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaFotoImovelRepository.cs",\
2026-08-26T17:40:57.8040758Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaFotoLoteRepository.cs",\
2026-08-26T17:40:57.8040991Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaUsuarioRepository.cs",\
2026-08-26T17:40:57.8041223Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAvaliacaoImovelRepository.cs",\
2026-08-26T17:40:57.8041452Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IComodoImovelRepository.cs",\
2026-08-26T17:40:57.8041689Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IControleProcessamentoRepository.cs",\
2026-08-26T17:40:57.8041917Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IDadoContabilRepository.cs",\
2026-08-26T17:40:57.8042149Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IFotoImovelRepository.cs",\
2026-08-26T17:40:57.8042369Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IGeradorHistorico.cs",\
2026-08-26T17:40:57.8042591Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IImovelRepository.cs",\
2026-08-26T17:40:57.8042820Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IMatriculaImovelRepository.cs",\
2026-08-26T17:40:57.8043062Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IMensagemControleProcessamentoRepository.cs",\
2026-08-26T17:40:57.8043304Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IRotinaProcessamentoRepository.cs",\
2026-08-26T17:40:57.8043568Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/BaseArquivoLayout.cs",\
2026-08-26T17:40:57.8043948Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/SiaciLayout.cs",\
2026-08-26T17:40:57.8044158Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/SiopiLayout.cs"
2026-08-26T17:40:57.8044225Z 
2026-08-26T17:40:57.8044419Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:57.8044613Z "/opt/ads-agent/_work/6/.sonarqube/out/1"
2026-08-26T17:40:57.8044878Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:57.8045083Z "/opt/ads-agent/_work/6/.sonarqube/out/1/Issues.json"
2026-08-26T17:40:57.8045153Z 
2026-08-26T17:40:57.8045371Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod1
2026-08-26T17:40:57.8045683Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectKey=SIMOV-imoveiscaixa-batch:0847F1F3-B5DA-4FC3-8EEF-882D75A674FD
2026-08-26T17:40:57.8045947Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectName=Simov.Application
2026-08-26T17:40:57.8046213Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:40:57.8046449Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.sourceEncoding=utf-8
2026-08-26T17:40:57.8046655Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.sources=\
2026-08-26T17:40:57.8046877Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Contexts/FileProcessingContext.cs",\
2026-08-26T17:40:57.8047160Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Contexts/SiicoCallCounterContext.cs",\
2026-08-26T17:40:57.8047385Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/AvaliacaoImovelDto.cs",\
2026-08-26T17:40:57.8047605Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/DadoContabilDto.cs",\
2026-08-26T17:40:57.8047817Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/EnderecoDto.cs",\
2026-08-26T17:40:57.8048026Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/ImovelDto.cs",\
2026-08-26T17:40:57.8048244Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/MatriculaImovelDto.cs",\
2026-08-26T17:40:57.8048494Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/MunicipioDto.cs",\
2026-08-26T17:40:57.8048715Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/SiaciDDQDto.cs",\
2026-08-26T17:40:57.8048929Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/TipoLogradouroDto.cs",\
2026-08-26T17:40:57.8049161Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ICargaFotoImovelService.cs",\
2026-08-26T17:40:57.8049394Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ICargaImovelService.cs",\
2026-08-26T17:40:57.8049617Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IFileService.cs",\
2026-08-26T17:40:57.8049842Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSiaciUseCase.cs",\
2026-08-26T17:40:57.8050070Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSimilFotoUseCase.cs",\
2026-08-26T17:40:57.8050304Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSimilUseCase.cs",\
2026-08-26T17:40:57.8050532Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSiopiUseCase.cs",\
2026-08-26T17:40:57.8050776Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ILeituraService.cs",\
2026-08-26T17:40:57.8051006Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ILogProcessamentoService.cs",\
2026-08-26T17:40:57.8051245Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IMapperDataService.cs",\
2026-08-26T17:40:57.8051472Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ISiaciDDQUseCase.cs",\
2026-08-26T17:40:57.8051703Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IWorkerImovelService.cs",\
2026-08-26T17:40:57.8051940Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/CargaImovelService.cs",\
2026-08-26T17:40:57.8052158Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/FileService.cs",\
2026-08-26T17:40:57.8052472Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/LeituraService.cs",\
2026-08-26T17:40:57.8052726Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/LogProcessamentoService.cs",\
2026-08-26T17:40:57.8052962Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/MapperDataService.cs",\
2026-08-26T17:40:57.8053190Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/WorkerImovelService.cs",\
2026-08-26T17:40:57.8053413Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSiaciUseCase.cs",\
2026-08-26T17:40:57.8053701Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSimilFotoUseCase.cs",\
2026-08-26T17:40:57.8053949Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSimilUseCase.cs",\
2026-08-26T17:40:57.8054178Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSiopiUseCase.cs",\
2026-08-26T17:40:57.8054406Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/SiaciDDQUseCase.cs"
2026-08-26T17:40:57.8054486Z 
2026-08-26T17:40:57.8054690Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:57.8054934Z "/opt/ads-agent/_work/6/.sonarqube/out/2"
2026-08-26T17:40:57.8055149Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:57.8055352Z "/opt/ads-agent/_work/6/.sonarqube/out/2/Issues.json"
2026-08-26T17:40:57.8055414Z 
2026-08-26T17:40:57.8055640Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod2
2026-08-26T17:40:57.8055999Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectKey=SIMOV-imoveiscaixa-batch:D745E52F-7A66-4C38-B30D-3A27EA75CCCE
2026-08-26T17:40:57.8056260Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectName=Simov.Core
2026-08-26T17:40:57.8056509Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:40:57.8056747Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.sourceEncoding=utf-8
2026-08-26T17:40:57.8056952Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.sources=\
2026-08-26T17:40:57.8057017Z 
2026-08-26T17:40:57.8057052Z 
2026-08-26T17:40:57.8057241Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:57.8057468Z "/opt/ads-agent/_work/6/.sonarqube/out/3"
2026-08-26T17:40:57.8057688Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:57.8057897Z "/opt/ads-agent/_work/6/.sonarqube/out/3/Issues.json"
2026-08-26T17:40:57.8057960Z 
2026-08-26T17:40:57.8058181Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod3
2026-08-26T17:40:57.8058481Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectKey=SIMOV-imoveiscaixa-batch:FBCB055E-203B-4979-BB94-B02AE276DE0B
2026-08-26T17:40:57.8058734Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectName=Simov.Domain
2026-08-26T17:40:57.8058977Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:40:57.8059205Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.sourceEncoding=utf-8
2026-08-26T17:40:57.8059409Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.sources=\
2026-08-26T17:40:57.8059483Z 
2026-08-26T17:40:57.8059518Z 
2026-08-26T17:40:57.8059702Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:57.8059892Z "/opt/ads-agent/_work/6/.sonarqube/out/4"
2026-08-26T17:40:57.8060097Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:57.8060301Z "/opt/ads-agent/_work/6/.sonarqube/out/4/Issues.json"
2026-08-26T17:40:57.8060369Z 
2026-08-26T17:40:57.8060584Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod4
2026-08-26T17:40:57.8060889Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectKey=SIMOV-imoveiscaixa-batch:D6E1F89D-8BFA-426E-BC94-C1182DBD0621
2026-08-26T17:40:57.8061156Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectName=Simov.Application
2026-08-26T17:40:57.8061414Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:40:57.8061651Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.sourceEncoding=utf-8
2026-08-26T17:40:57.8061862Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.sources=\
2026-08-26T17:40:57.8061936Z 
2026-08-26T17:40:57.8061970Z 
2026-08-26T17:40:57.8062156Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:57.8062347Z "/opt/ads-agent/_work/6/.sonarqube/out/5"
2026-08-26T17:40:57.8062563Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:57.8062827Z "/opt/ads-agent/_work/6/.sonarqube/out/5/Issues.json"
2026-08-26T17:40:57.8062896Z 
2026-08-26T17:40:57.8063119Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod5
2026-08-26T17:40:57.8063598Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectKey=SIMOV-imoveiscaixa-batch:AD78E470-A67C-4901-A53F-E3D7D40350CD
2026-08-26T17:40:57.8064093Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:40:57.8064360Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:40:57.8064599Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.sourceEncoding=utf-8
2026-08-26T17:40:57.8064865Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.sources=\
2026-08-26T17:40:57.8065138Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Common/BaseRepository.cs",\
2026-08-26T17:40:57.8065440Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Common/UnitOfWork.cs",\
2026-08-26T17:40:57.8065734Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Interceptor/HistoricosInterceptor.cs",\
2026-08-26T17:40:57.8065990Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AgrupamentoVendaImovelConfiguration.cs",\
2026-08-26T17:40:57.8066240Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaArquivoLoteConfiguration.cs",\
2026-08-26T17:40:57.8066488Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaFotoImovelConfiguration.cs",\
2026-08-26T17:40:57.8066730Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaFotoLoteConfiguration.cs",\
2026-08-26T17:40:57.8067023Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaUsuarioConfiguration.cs",\
2026-08-26T17:40:57.8067277Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AvaliacaoImovelConfiguration.cs",\
2026-08-26T17:40:57.8067523Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ComodoImovelConfiguration.cs",\
2026-08-26T17:40:57.8067825Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ControleProcessamentoConfiguration.cs",\
2026-08-26T17:40:57.8068069Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/DadoContabilConfiguration.cs",\
2026-08-26T17:40:57.8068300Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/FotoImovelConfiguration.cs",\
2026-08-26T17:40:57.8068552Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoAgrupamentoVendaImovelConfiguration.cs",\
2026-08-26T17:40:57.8068810Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoAvaliacaoImovelConfiguration.cs",\
2026-08-26T17:40:57.8069061Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoComodoImovelConfiguration.cs",\
2026-08-26T17:40:57.8069304Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoDadoContabilConfiguration.cs",\
2026-08-26T17:40:57.8069545Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoImovelConfiguration.cs",\
2026-08-26T17:40:57.8069790Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoMatriculaImovelConfiguration.cs",\
2026-08-26T17:40:57.8070325Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ImovelConfiguration.cs",\
2026-08-26T17:40:57.8070592Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/MatriculaImovelConfiguration.cs",\
2026-08-26T17:40:57.8070843Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/MensagemControleProcessamentoConfiguration.cs",\
2026-08-26T17:40:57.8071097Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/RotinaProcessamentoConfiguration.cs",\
2026-08-26T17:40:57.8071349Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AgrupamentoVendaImovelRepository.cs",\
2026-08-26T17:40:57.8071602Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaArquivoLoteRepository.cs",\
2026-08-26T17:40:57.8071853Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaFotoImovelRepository.cs",\
2026-08-26T17:40:57.8072100Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaFotoLoteRepository.cs",\
2026-08-26T17:40:57.8072348Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaUsuarioRepository.cs",\
2026-08-26T17:40:57.8072587Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AvaliacaoImovelRepository.cs",\
2026-08-26T17:40:57.8072827Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ComodoImovelRepository.cs",\
2026-08-26T17:40:57.8073071Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ControleProcessamentoRepository.cs",\
2026-08-26T17:40:57.8073315Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/DadoContabilRepository.cs",\
2026-08-26T17:40:57.8073548Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/FotoImovelRepository.cs",\
2026-08-26T17:40:57.8073862Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ImovelRepository.cs",\
2026-08-26T17:40:57.8074168Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/MatriculaImovelRepository.cs",\
2026-08-26T17:40:57.8074420Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/MensagemControleProcessamentoRepository.cs",\
2026-08-26T17:40:57.8074685Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/RotinaProcessamentoRepository.cs",\
2026-08-26T17:40:57.8074966Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/SimovDbContext.cs"
2026-08-26T17:40:57.8075032Z 
2026-08-26T17:40:57.8075226Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:57.8075453Z "/opt/ads-agent/_work/6/.sonarqube/out/6"
2026-08-26T17:40:57.8075663Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:57.8075865Z "/opt/ads-agent/_work/6/.sonarqube/out/6/Issues.json"
2026-08-26T17:40:57.8075935Z 
2026-08-26T17:40:57.8076154Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod6
2026-08-26T17:40:57.8076462Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectKey=SIMOV-imoveiscaixa-batch:B904AD47-4763-413C-9324-7889FD92EFA6
2026-08-26T17:40:57.8076721Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectName=Simov.Batch
2026-08-26T17:40:57.8076972Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:40:57.8077203Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.sourceEncoding=utf-8
2026-08-26T17:40:57.8077410Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.sources=\
2026-08-26T17:40:57.8077630Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/AddHeadersHttpClient.cs",\
2026-08-26T17:40:57.8077864Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/ConnectionsConfiguration.cs",\
2026-08-26T17:40:57.8078092Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/HttpClientConfiguration.cs",\
2026-08-26T17:40:57.8078326Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/IApiSiisoRestPrivado.cs",\
2026-08-26T17:40:57.8078553Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/UseCasesConfiguration.cs",\
2026-08-26T17:40:57.8078770Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderImoveisSiaci.cs",\
2026-08-26T17:40:57.8079149Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderImoveisSiopi.cs",\
2026-08-26T17:40:57.8079367Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderLeilaoSiaciDDQ.cs",\
2026-08-26T17:40:57.8079567Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Program.cs",\
2026-08-26T17:40:57.8079778Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Workers/WorkerFotoImoveisSimil.cs",\
2026-08-26T17:40:57.8079991Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Workers/WorkerImoveisSimil.cs",\
2026-08-26T17:40:57.8080226Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/Simov.Batch.GlobalUsings.g.cs",\
2026-08-26T17:40:57.8080486Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/.NETCoreApp,Version=v8.0.AssemblyAttributes.cs",\
2026-08-26T17:40:57.8080738Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/Simov.Batch.AssemblyInfo.cs",\
2026-08-26T17:40:57.8080965Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/appsettings.Development.json",\
2026-08-26T17:40:57.8081169Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/appsettings.json",\
2026-08-26T17:40:57.8081381Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Properties/launchSettings.json",\
2026-08-26T17:40:57.8081593Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/apphost"
2026-08-26T17:40:57.8081670Z 
2026-08-26T17:40:57.8081858Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:57.8082047Z "/opt/ads-agent/_work/6/.sonarqube/out/7"
2026-08-26T17:40:57.8082257Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:57.8082457Z "/opt/ads-agent/_work/6/.sonarqube/out/7/Issues.json"
2026-08-26T17:40:57.8082525Z 
2026-08-26T17:40:57.8082747Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod7
2026-08-26T17:40:57.8083096Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectKey=SIMOV-imoveiscaixa-batch:6679F22B-144A-4C59-A28C-2A87F31E3915
2026-08-26T17:40:57.8083356Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectName=Simov.Core
2026-08-26T17:40:57.8083601Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:40:57.8083899Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.sourceEncoding=utf-8
2026-08-26T17:40:57.8084106Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.sources=\
2026-08-26T17:40:57.8084170Z 
2026-08-26T17:40:57.8084211Z 
2026-08-26T17:40:57.8084399Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:57.8084636Z "/opt/ads-agent/_work/6/.sonarqube/out/8"
2026-08-26T17:40:57.8084910Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:57.8085115Z "/opt/ads-agent/_work/6/.sonarqube/out/8/Issues.json"
2026-08-26T17:40:57.8085178Z 
2026-08-26T17:40:57.8085397Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod8
2026-08-26T17:40:57.8085697Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectKey=SIMOV-imoveiscaixa-batch:EC78B0BC-170C-482C-867B-C5402B449403
2026-08-26T17:40:57.8085949Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectName=Simov.Core
2026-08-26T17:40:57.8086198Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:40:57.8086425Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.sourceEncoding=utf-8
2026-08-26T17:40:57.8086629Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.sources=\
2026-08-26T17:40:57.8086695Z 
2026-08-26T17:40:57.8086729Z 
2026-08-26T17:40:57.8086918Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:57.8087117Z "/opt/ads-agent/_work/6/.sonarqube/out/9"
2026-08-26T17:40:57.8087323Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:57.8087524Z "/opt/ads-agent/_work/6/.sonarqube/out/9/Issues.json"
2026-08-26T17:40:57.8087585Z 
2026-08-26T17:40:57.8087801Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod9
2026-08-26T17:40:57.8088102Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectKey=SIMOV-imoveiscaixa-batch:1B2C05E0-E98F-477C-931D-923BBE79AE4E
2026-08-26T17:40:57.8088357Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectName=Simov.Domain
2026-08-26T17:40:57.8088606Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:40:57.8088834Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.sourceEncoding=utf-8
2026-08-26T17:40:57.8089040Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.sources=\
2026-08-26T17:40:57.8089110Z 
2026-08-26T17:40:57.8089144Z 
2026-08-26T17:40:57.8089326Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:57.8089520Z "/opt/ads-agent/_work/6/.sonarqube/out/10"
2026-08-26T17:40:57.8089767Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:57.8089989Z "/opt/ads-agent/_work/6/.sonarqube/out/10/Issues.json"
2026-08-26T17:40:57.8090291Z 
2026-08-26T17:40:57.8090535Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod10
2026-08-26T17:40:57.8090847Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectKey=SIMOV-imoveiscaixa-batch:A180ED2D-1521-44A6-B6EA-5DDEC55D2C17
2026-08-26T17:40:57.8091105Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectName=Simov.Core
2026-08-26T17:40:57.8091530Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:40:57.8091760Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.sourceEncoding=utf-8
2026-08-26T17:40:57.8092007Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.sources=\
2026-08-26T17:40:57.8092089Z 
2026-08-26T17:40:57.8092123Z 
2026-08-26T17:40:57.8092315Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:57.8092619Z "/opt/ads-agent/_work/6/.sonarqube/out/11"
2026-08-26T17:40:57.8092932Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:57.8093263Z "/opt/ads-agent/_work/6/.sonarqube/out/11/Issues.json"
2026-08-26T17:40:57.8093337Z 
2026-08-26T17:40:57.8093568Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod11
2026-08-26T17:40:57.8093983Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectKey=SIMOV-imoveiscaixa-batch:A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E
2026-08-26T17:40:57.8094240Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectName=Simov.Domain
2026-08-26T17:40:57.8094537Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:40:57.8094825Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.sourceEncoding=utf-8
2026-08-26T17:40:57.8095034Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.sources=\
2026-08-26T17:40:57.8095100Z 
2026-08-26T17:40:57.8095144Z 
2026-08-26T17:40:57.8095335Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:57.8095528Z "/opt/ads-agent/_work/6/.sonarqube/out/12"
2026-08-26T17:40:57.8095739Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:57.8095940Z "/opt/ads-agent/_work/6/.sonarqube/out/12/Issues.json"
2026-08-26T17:40:57.8096000Z 
2026-08-26T17:40:57.8096226Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod12
2026-08-26T17:40:57.8096532Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectKey=SIMOV-imoveiscaixa-batch:00300450-28FA-4EA9-8A96-181ED44DCA26
2026-08-26T17:40:57.8096809Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectName=Simov.Application
2026-08-26T17:40:57.8097070Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:40:57.8097305Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.sourceEncoding=utf-8
2026-08-26T17:40:57.8097513Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.sources=\
2026-08-26T17:40:57.8097578Z 
2026-08-26T17:40:57.8097620Z 
2026-08-26T17:40:57.8097810Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:57.8098002Z "/opt/ads-agent/_work/6/.sonarqube/out/13"
2026-08-26T17:40:57.8098210Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:57.8098413Z "/opt/ads-agent/_work/6/.sonarqube/out/13/Issues.json"
2026-08-26T17:40:57.8098474Z 
2026-08-26T17:40:57.8098699Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod13
2026-08-26T17:40:57.8099006Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectKey=SIMOV-imoveiscaixa-batch:1393E257-1007-43DE-B94C-0B0508C0B309
2026-08-26T17:40:57.8099271Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:40:57.8099529Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:40:57.8099764Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.sourceEncoding=utf-8
2026-08-26T17:40:57.8099979Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.sources=\
2026-08-26T17:40:57.8100043Z 
2026-08-26T17:40:57.8100077Z 
2026-08-26T17:40:57.8100263Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:57.8100455Z "/opt/ads-agent/_work/6/.sonarqube/out/14"
2026-08-26T17:40:57.8100663Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:57.8100864Z "/opt/ads-agent/_work/6/.sonarqube/out/14/Issues.json"
2026-08-26T17:40:57.8100935Z 
2026-08-26T17:40:57.8101156Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod14
2026-08-26T17:40:57.8101456Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectKey=SIMOV-imoveiscaixa-batch:5BE00443-BD63-4C9F-A707-406F2AC94762
2026-08-26T17:40:57.8101710Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectName=Simov.Core
2026-08-26T17:40:57.8101998Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:40:57.8102227Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.sourceEncoding=utf-8
2026-08-26T17:40:57.8102428Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.sources=\
2026-08-26T17:40:57.8102497Z 
2026-08-26T17:40:57.8102532Z 
2026-08-26T17:40:57.8102716Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:57.8102906Z "/opt/ads-agent/_work/6/.sonarqube/out/15"
2026-08-26T17:40:57.8103108Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:57.8103334Z "/opt/ads-agent/_work/6/.sonarqube/out/15/Issues.json"
2026-08-26T17:40:57.8103403Z 
2026-08-26T17:40:57.8103623Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod15
2026-08-26T17:40:57.8103987Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectKey=SIMOV-imoveiscaixa-batch:A79CA783-37A2-49D3-B56C-D9102F046AF9
2026-08-26T17:40:57.8104239Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectName=Simov.Domain
2026-08-26T17:40:57.8104492Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:40:57.8104836Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.sourceEncoding=utf-8
2026-08-26T17:40:57.8105050Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.sources=\
2026-08-26T17:40:57.8105114Z 
2026-08-26T17:40:57.8105159Z 
2026-08-26T17:40:57.8105344Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:57.8105530Z "/opt/ads-agent/_work/6/.sonarqube/out/16"
2026-08-26T17:40:57.8105737Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:57.8105937Z "/opt/ads-agent/_work/6/.sonarqube/out/16/Issues.json"
2026-08-26T17:40:57.8106026Z 
2026-08-26T17:40:57.8106301Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod16
2026-08-26T17:40:57.8106674Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectKey=SIMOV-imoveiscaixa-batch:51ABFD24-E14F-4155-B9D7-CDBD0E536AAB
2026-08-26T17:40:57.8106937Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectName=Simov.Application
2026-08-26T17:40:57.8107196Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:40:57.8107429Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.sourceEncoding=utf-8
2026-08-26T17:40:57.8107633Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.sources=\
2026-08-26T17:40:57.8107698Z 
2026-08-26T17:40:57.8107738Z 
2026-08-26T17:40:57.8107926Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:57.8108120Z "/opt/ads-agent/_work/6/.sonarqube/out/17"
2026-08-26T17:40:57.8108325Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:57.8108526Z "/opt/ads-agent/_work/6/.sonarqube/out/17/Issues.json"
2026-08-26T17:40:57.8108588Z 
2026-08-26T17:40:57.8108807Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod17
2026-08-26T17:40:57.8109109Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectKey=SIMOV-imoveiscaixa-batch:F2842708-9CF5-4649-B3A8-6D39E5E01B77
2026-08-26T17:40:57.8109368Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:40:57.8109624Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:40:57.8109867Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.sourceEncoding=utf-8
2026-08-26T17:40:57.8110069Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.sources=\
2026-08-26T17:40:57.8110133Z 
2026-08-26T17:40:57.8110167Z 
2026-08-26T17:40:57.8110353Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:57.8110542Z "/opt/ads-agent/_work/6/.sonarqube/out/18"
2026-08-26T17:40:57.8110748Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:57.8111011Z "/opt/ads-agent/_work/6/.sonarqube/out/18/Issues.json"
2026-08-26T17:40:57.8111071Z 
2026-08-26T17:40:57.8111293Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod18
2026-08-26T17:40:57.8111597Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectKey=SIMOV-imoveiscaixa-batch:3C101C3B-D8C0-461B-B65B-B87A6F75F210
2026-08-26T17:40:57.8111854Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectName=Simov.Batch
2026-08-26T17:40:57.8112105Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:40:57.8112332Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.sourceEncoding=utf-8
2026-08-26T17:40:57.8112572Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.sources=\
2026-08-26T17:40:57.8112643Z 
2026-08-26T17:40:57.8112678Z 
2026-08-26T17:40:57.8112866Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:57.8113058Z "/opt/ads-agent/_work/6/.sonarqube/out/19"
2026-08-26T17:40:57.8113266Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:57.8113467Z "/opt/ads-agent/_work/6/.sonarqube/out/19/Issues.json"
2026-08-26T17:40:57.8113532Z 
2026-08-26T17:40:57.8113813Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod19
2026-08-26T17:40:57.8114198Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectKey=SIMOV-imoveiscaixa-batch:4E341BE0-BD46-427C-8912-6319C41C89BC
2026-08-26T17:40:57.8114488Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectName=TesteSimovBatch
2026-08-26T17:40:57.8114804Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/tests/TesteSimovBatch
2026-08-26T17:40:57.8115055Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.sourceEncoding=utf-8
2026-08-26T17:40:57.8115265Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.sources=
2026-08-26T17:40:57.8115468Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.tests=\
2026-08-26T17:40:57.8115703Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/AvaliacaoImovelDtoTests.cs",\
2026-08-26T17:40:57.8115949Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/DadoContabilDtoTests.cs",\
2026-08-26T17:40:57.8116189Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/ImovelDtoTests.cs",\
2026-08-26T17:40:57.8116428Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/MatriculaImovelDtoTests.cs",\
2026-08-26T17:40:57.8116681Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/CargaImovelServiceTests.cs",\
2026-08-26T17:40:57.8116928Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/FileServiceTests.cs",\
2026-08-26T17:40:57.8117177Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/LeituraSiaciServiceTests.cs",\
2026-08-26T17:40:57.8117436Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/LogProcessamentoServiceTests.cs",\
2026-08-26T17:40:57.8117686Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/MapperDataServiceTests.cs",\
2026-08-26T17:40:57.8117939Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/WorkerImovelServiceTests.cs",\
2026-08-26T17:40:57.8118196Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSiaciPreCadastroUseCaseTests.cs",\
2026-08-26T17:40:57.8118454Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSimilFotoUseCaseTests.cs",\
2026-08-26T17:40:57.8118707Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSimilUseCaseTests.cs",\
2026-08-26T17:40:57.8118956Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSiopiUseCaseTests.cs",\
2026-08-26T17:40:57.8119198Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/SiaciDDQUseCaseTests.cs",\
2026-08-26T17:40:57.8119435Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Batch/LoaderImoveisSiopiTests.cs",\
2026-08-26T17:40:57.8119659Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/CargaImoveisSiaciTests.cs",\
2026-08-26T17:40:57.8119956Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Configuration/AddHeadersHttpClientTests.cs",\
2026-08-26T17:40:57.8120198Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Configuration/ConnectionsConfigurationTest.cs",\
2026-08-26T17:40:57.8120435Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Contexts/FileProcessingContextTests.cs",\
2026-08-26T17:40:57.8120673Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Contexts/SiicoCallCounterContextTests.cs",\
2026-08-26T17:40:57.8120902Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/DomainObjects/EntityTests.cs",\
2026-08-26T17:40:57.8121177Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/DomainObjects/IAggregateRootTests.cs",\
2026-08-26T17:40:57.8121420Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/CancellationExceptionTests.cs",\
2026-08-26T17:40:57.8121666Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/EntityValidationExceptionTests.cs",\
2026-08-26T17:40:57.8121907Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/GenericExceptionTests.cs",\
2026-08-26T17:40:57.8122144Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/NotFoundExceptionTests.cs",\
2026-08-26T17:40:57.8122390Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/ProcessamentoExceptionTests.cs",\
2026-08-26T17:40:57.8122641Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/RelatedAggregateExceptionTests.cs",\
2026-08-26T17:40:57.8122886Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/UnauthorizedExceptionTests.cs",\
2026-08-26T17:40:57.8123138Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siico/ApiSiicoRestPrivadoTests.cs",\
2026-08-26T17:40:57.8123385Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siico/ApiSiicoRestPublicoTests.cs",\
2026-08-26T17:40:57.8123678Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siiso/ApiSiisoRestPublicoTests.cs",\
2026-08-26T17:40:57.8123927Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/AutenticacarSsoTests.cs",\
2026-08-26T17:40:57.8124164Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/BairroDetalhadoSiicoTests.cs",\
2026-08-26T17:40:57.8124392Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/BairroSiicoTests.cs",\
2026-08-26T17:40:57.8124625Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/MunicipioCompletoSiicoTests.cs",\
2026-08-26T17:40:57.8124920Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/ResponseGenericoTests.cs",\
2026-08-26T17:40:57.8125158Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/Siico/CepSiicoTests.cs",\
2026-08-26T17:40:57.8125393Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Domain/Layouts/BaseArquivoLayoutTests.cs",\
2026-08-26T17:40:57.8125627Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/AgrupamentoVendaImovelTests.cs",\
2026-08-26T17:40:57.8125861Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/AvaliacaoImovelSiopiTests.cs",\
2026-08-26T17:40:57.8126097Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/ControleProcessamentoTests.cs",\
2026-08-26T17:40:57.8126330Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/DadoContabilTests.cs",\
2026-08-26T17:40:57.8126569Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoAgrupamentoVendaImovelTests.cs",\
2026-08-26T17:40:57.8126807Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoDadoContabilTests.cs",\
2026-08-26T17:40:57.8127038Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoImovelTests.cs",\
2026-08-26T17:40:57.8127259Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/ImovelTests.cs",\
2026-08-26T17:40:57.8127490Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/MatriculaImovelSiopiTests.cs",\
2026-08-26T17:40:57.8127732Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/MensagemControleProcessamentoTests.cs",\
2026-08-26T17:40:57.8128017Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/RotinaProcessamentoTests.cs",\
2026-08-26T17:40:57.8128243Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/SiopiImovelTests.cs",\
2026-08-26T17:40:57.8128464Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ArquivoSiaciFake.cs",\
2026-08-26T17:40:57.8128681Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ImovelDtoFake.cs",\
2026-08-26T17:40:57.8128895Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ImovelFake.cs",\
2026-08-26T17:40:57.8129112Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/LayoutArquivoFake.cs",\
2026-08-26T17:40:57.8129447Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/Siico/ResponsesFake.cs",\
2026-08-26T17:40:57.8129874Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/InfraDataEF/HistoricosInterceptorTests.cs",\
2026-08-26T17:40:57.8130226Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/InfraDataEF/SimovDbContextTests.cs",\
2026-08-26T17:40:57.8130605Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Layouts/SiaciLayoutTests.cs"
2026-08-26T17:40:57.8130729Z 
2026-08-26T17:40:57.8131056Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:57.8131366Z "/opt/ads-agent/_work/6/.sonarqube/out/20"
2026-08-26T17:40:57.8131815Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:57.8132136Z "/opt/ads-agent/_work/6/.sonarqube/out/20/Issues.json"
2026-08-26T17:40:57.8132239Z 
2026-08-26T17:40:57.8132605Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod20
2026-08-26T17:40:57.8133089Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectKey=SIMOV-imoveiscaixa-batch:0DC13198-1AC4-46C6-B9B3-E2987B8496D5
2026-08-26T17:40:57.8133509Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectName=Simov.Core
2026-08-26T17:40:57.8134004Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:40:57.8134357Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.sourceEncoding=utf-8
2026-08-26T17:40:57.8134580Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.sources=\
2026-08-26T17:40:57.8134657Z 
2026-08-26T17:40:57.8134694Z 
2026-08-26T17:40:57.8134886Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:57.8135223Z "/opt/ads-agent/_work/6/.sonarqube/out/21"
2026-08-26T17:40:57.8135433Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:57.8135639Z "/opt/ads-agent/_work/6/.sonarqube/out/21/Issues.json"
2026-08-26T17:40:57.8135699Z 
2026-08-26T17:40:57.8135923Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod21
2026-08-26T17:40:57.8136331Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectKey=SIMOV-imoveiscaixa-batch:BA15777F-9613-49A5-8C5F-8CBFA5F86619
2026-08-26T17:40:57.8136808Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectName=Simov.Domain
2026-08-26T17:40:57.8137128Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:40:57.8137436Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.sourceEncoding=utf-8
2026-08-26T17:40:57.8137737Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.sources=\
2026-08-26T17:40:57.8137827Z 
2026-08-26T17:40:57.8137886Z 
2026-08-26T17:40:57.8138172Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:57.8138468Z "/opt/ads-agent/_work/6/.sonarqube/out/22"
2026-08-26T17:40:57.8138791Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:57.8139087Z "/opt/ads-agent/_work/6/.sonarqube/out/22/Issues.json"
2026-08-26T17:40:57.8139148Z 
2026-08-26T17:40:57.8139384Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod22
2026-08-26T17:40:57.8139691Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectKey=SIMOV-imoveiscaixa-batch:48A485AE-9F33-C9A7-979C-54916B65C32E
2026-08-26T17:40:57.8140009Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectName=Simov.Application
2026-08-26T17:40:57.8140554Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:40:57.8140891Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.sourceEncoding=utf-8
2026-08-26T17:40:57.8141102Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.sources=\
2026-08-26T17:40:57.8141168Z 
2026-08-26T17:40:57.8141204Z 
2026-08-26T17:40:57.8141393Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:57.8141588Z "/opt/ads-agent/_work/6/.sonarqube/out/23"
2026-08-26T17:40:57.8141806Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:57.8142079Z "/opt/ads-agent/_work/6/.sonarqube/out/23/Issues.json"
2026-08-26T17:40:57.8142142Z 
2026-08-26T17:40:57.8142365Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod23
2026-08-26T17:40:57.8142673Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectKey=SIMOV-imoveiscaixa-batch:309346D6-2461-4973-A29B-7A38A756C0DE
2026-08-26T17:40:57.8142939Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:40:57.8143200Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:40:57.8143435Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.sourceEncoding=utf-8
2026-08-26T17:40:57.8143741Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.sources=\
2026-08-26T17:40:57.8143850Z 
2026-08-26T17:40:57.8143885Z 
2026-08-26T17:40:57.8144087Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:57.8144280Z "/opt/ads-agent/_work/6/.sonarqube/out/24"
2026-08-26T17:40:57.8144492Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:57.8144696Z "/opt/ads-agent/_work/6/.sonarqube/out/24/Issues.json"
2026-08-26T17:40:57.8144763Z 
2026-08-26T17:40:57.8144987Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod24
2026-08-26T17:40:57.8145292Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectKey=SIMOV-imoveiscaixa-batch:4BF20498-1845-4781-82CB-E7783C0081FA
2026-08-26T17:40:57.8145548Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectName=Simov.Batch
2026-08-26T17:40:57.8145794Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:40:57.8146026Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.sourceEncoding=utf-8
2026-08-26T17:40:57.8146231Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.sources=\
2026-08-26T17:40:57.8146303Z 
2026-08-26T17:40:57.8146338Z 
2026-08-26T17:40:57.8146525Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:57.8146722Z "/opt/ads-agent/_work/6/.sonarqube/out/25"
2026-08-26T17:40:57.8146926Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:57.8147130Z "/opt/ads-agent/_work/6/.sonarqube/out/25/Issues.json"
2026-08-26T17:40:57.8147199Z 
2026-08-26T17:40:57.8147422Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod25
2026-08-26T17:40:57.8147721Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectKey=SIMOV-imoveiscaixa-batch:D54F14FF-8EEB-4EB8-994B-69D77DDB78FD
2026-08-26T17:40:57.8147978Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectName=TesteSimovBatch
2026-08-26T17:40:57.8148233Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/tests/TesteSimovBatch
2026-08-26T17:40:57.8148462Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.sourceEncoding=utf-8
2026-08-26T17:40:57.8148661Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.sources=
2026-08-26T17:40:57.8148861Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.tests=\
2026-08-26T17:40:57.8148922Z 
2026-08-26T17:40:57.8148963Z 
2026-08-26T17:40:57.8149151Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:40:57.8149341Z "/opt/ads-agent/_work/6/.sonarqube/out/26"
2026-08-26T17:40:57.8149600Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:40:57.8149800Z "/opt/ads-agent/_work/6/.sonarqube/out/26/Issues.json"
2026-08-26T17:40:57.8149860Z 
2026-08-26T17:40:57.8150082Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod26
2026-08-26T17:40:57.8150252Z sonar.host.url=https://sonar.apps.produtos4.caixa/
2026-08-26T17:40:57.8150435Z sonar.projectKey=SIMOV-imoveiscaixa-batch
2026-08-26T17:40:57.8150623Z sonar.projectName=SIMOV-imoveiscaixa-batch
2026-08-26T17:40:57.8150794Z sonar.projectVersion=1.0-SNAPSHOT
2026-08-26T17:40:57.8150922Z sonar.branch.name=CorrecoesSonar
2026-08-26T17:40:57.8151229Z sonar.scanner.metadataFilePath=/opt/ads-agent/_work/_temp/sonar/1.0-SNAPSHOT/f442c3b3-ec53-840d-3dab-bba3c4de61f5/report-task.txt
2026-08-26T17:40:57.8151492Z sonar.cs.opencover.reportsPaths=/opt/ads-agent/_work/_temp/**/coverage.opencover.xml
2026-08-26T17:40:57.8151712Z sonar.cs.vstest.reportsPaths=/opt/ads-agent/_work/_temp/**/*.trx
2026-08-26T17:40:57.8151856Z sonar.visualstudio.enable=false
2026-08-26T17:40:57.8151909Z 
2026-08-26T17:40:57.8153171Z sonar.modules=0B395246-F58A-479C-B0B1-C6A6045C6FD3,5E55366D-25CB-4B0F-BAF4-738003A18ED2,0847F1F3-B5DA-4FC3-8EEF-882D75A674FD,D745E52F-7A66-4C38-B30D-3A27EA75CCCE,FBCB055E-203B-4979-BB94-B02AE276DE0B,D6E1F89D-8BFA-426E-BC94-C1182DBD0621,AD78E470-A67C-4901-A53F-E3D7D40350CD,B904AD47-4763-413C-9324-7889FD92EFA6,6679F22B-144A-4C59-A28C-2A87F31E3915,EC78B0BC-170C-482C-867B-C5402B449403,1B2C05E0-E98F-477C-931D-923BBE79AE4E,A180ED2D-1521-44A6-B6EA-5DDEC55D2C17,A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E,00300450-28FA-4EA9-8A96-181ED44DCA26,1393E257-1007-43DE-B94C-0B0508C0B309,5BE00443-BD63-4C9F-A707-406F2AC94762,A79CA783-37A2-49D3-B56C-D9102F046AF9,51ABFD24-E14F-4155-B9D7-CDBD0E536AAB,F2842708-9CF5-4649-B3A8-6D39E5E01B77,3C101C3B-D8C0-461B-B65B-B87A6F75F210,4E341BE0-BD46-427C-8912-6319C41C89BC,0DC13198-1AC4-46C6-B9B3-E2987B8496D5,BA15777F-9613-49A5-8C5F-8CBFA5F86619,48A485AE-9F33-C9A7-979C-54916B65C32E,309346D6-2461-4973-A29B-7A38A756C0DE,4BF20498-1845-4781-82CB-E7783C0081FA,D54F14FF-8EEB-4EB8-994B-69D77DDB78FD
2026-08-26T17:40:57.8153958Z 
2026-08-26T17:40:57.8153996Z 
2026-08-26T17:40:57.8154204Z ------------------------------------------------------------------------
2026-08-26T17:40:57.8154462Z 14:40:57.803  Writing processing summary to /opt/ads-agent/_work/6/.sonarqube/out/ProjectInfo.log
2026-08-26T17:40:57.8154650Z The SONAR_SCANNER_HOME environment variable is not required and will be ignored.
2026-08-26T17:40:57.8154836Z Calling the SonarScanner CLI...
2026-08-26T17:40:57.8155213Z Executing file /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/sonar-scanner-4.7.0.2747/bin/sonar-scanner
2026-08-26T17:40:57.8155584Z   Args: -Dsonar.scanAllFiles=true -Dproject.settings=/opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties --from=ScannerMSBuild/5.8 --debug <sensitive data removed>
2026-08-26T17:40:57.8155822Z   Working directory: /opt/ads-agent/_work/6
2026-08-26T17:40:57.8155949Z   Timeout (ms):-1
2026-08-26T17:40:57.8156064Z   Process id: 26582
2026-08-26T17:40:57.9258077Z 14:40:57.921 INFO: Scanner configuration file: /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/sonar-scanner-4.7.0.2747/conf/sonar-scanner.properties
2026-08-26T17:40:57.9258775Z 14:40:57.923 INFO: Project root configuration file: /opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties
2026-08-26T17:40:57.9594234Z 14:40:57.958 INFO: SonarScanner 4.7.0.2747
2026-08-26T17:40:57.9594901Z 14:40:57.958 INFO: Java 11 Oracle Corporation (64-bit)
2026-08-26T17:40:57.9595271Z 14:40:57.958 INFO: Linux 5.18.5-100.fc35.x86_64 amd64
2026-08-26T17:40:58.0416819Z 14:40:58.041 DEBUG: keyStore is : 
2026-08-26T17:40:58.0417062Z 14:40:58.041 DEBUG: keyStore type is : pkcs12
2026-08-26T17:40:58.0417217Z 14:40:58.041 DEBUG: keyStore provider is : 
2026-08-26T17:40:58.0417717Z 14:40:58.041 DEBUG: init keystore
2026-08-26T17:40:58.0417920Z 14:40:58.041 DEBUG: init keymanager of type SunX509
2026-08-26T17:40:58.1122517Z 14:40:58.111 DEBUG: Create: /opt/ads-agent/cache-tools/.sonar/cache
2026-08-26T17:40:58.1124160Z 14:40:58.112 INFO: User cache: /opt/ads-agent/cache-tools/.sonar/cache
2026-08-26T17:40:58.1124417Z 14:40:58.112 DEBUG: Create: /opt/ads-agent/cache-tools/.sonar/cache/_tmp
2026-08-26T17:40:58.1139710Z 14:40:58.113 DEBUG: Extract sonar-scanner-api-batch in temp...
2026-08-26T17:40:58.1160546Z 14:40:58.115 DEBUG: Get bootstrap index...
2026-08-26T17:40:58.1160778Z 14:40:58.115 DEBUG: Download: https://sonar.apps.produtos4.caixa/batch/index
2026-08-26T17:40:58.2038533Z 14:40:58.203 INFO: ------------------------------------------------------------------------
2026-08-26T17:40:58.2038832Z 14:40:58.203 INFO: EXECUTION FAILURE
2026-08-26T17:40:58.2039070Z 14:40:58.203 INFO: ------------------------------------------------------------------------
2026-08-26T17:40:58.2042341Z ##[error]14:40:58.203 ERROR: SonarQube server [https://sonar.apps.produtos4.caixa] can not be reached
2026-08-26T17:40:58.2043115Z 14:40:58.203 ERROR: SonarQube server [https://sonar.apps.produtos4.caixa] can not be reached
2026-08-26T17:40:58.2043779Z 14:40:58.203 INFO: Total time: 0.304s
2026-08-26T17:40:58.2147378Z 14:40:58.214 INFO: Final Memory: 4M/68M
2026-08-26T17:40:58.2147927Z 14:40:58.214 INFO: ------------------------------------------------------------------------
2026-08-26T17:40:58.2148648Z ##[error]14:40:58.214 ERROR: Error during SonarScanner execution
org.sonarsource.scanner.api.internal.ScannerException: Unable to execute SonarScanner analysis
2026-08-26T17:40:58.2149206Z 14:40:58.214 ERROR: Error during SonarScanner execution
2026-08-26T17:40:58.2149391Z org.sonarsource.scanner.api.internal.ScannerException: Unable to execute SonarScanner analysis
2026-08-26T17:40:58.2151996Z ##[error]at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:85)
	at java.base/java.security.AccessController.doPrivileged(Native Method)
	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:74)
2026-08-26T17:40:58.2152562Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:85)
2026-08-26T17:40:58.2152774Z 	at java.base/java.security.AccessController.doPrivileged(Native Method)
2026-08-26T17:40:58.2152977Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:74)
2026-08-26T17:40:58.2154542Z ##[error]at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:70)
	at org.sonarsource.scanner.api.EmbeddedScanner.doStart(EmbeddedScanner.java:185)
	at org.sonarsource.scanner.api.EmbeddedScanner.start(EmbeddedScanner.java:123)
	at org.sonarsource.scanner.cli.Main.execute(Main.java:73)
	at org.sonarsource.scanner.cli.Main.main(Main.java:61)
Caused by: java.lang.IllegalStateException: Fail to get bootstrap index from server
	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:42)
	at org.sonarsource.scanner.api.internal.JarDownloader.getScannerEngineFiles(JarDownloader.java:58)
	at org.sonarsource.scanner.api.internal.JarDownloader.download(JarDownloader.java:53)
	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:76)
	... 7 more
Caused by: javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:40:58.2155749Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:70)
2026-08-26T17:40:58.2155962Z 	at org.sonarsource.scanner.api.EmbeddedScanner.doStart(EmbeddedScanner.java:185)
2026-08-26T17:40:58.2156157Z 	at org.sonarsource.scanner.api.EmbeddedScanner.start(EmbeddedScanner.java:123)
2026-08-26T17:40:58.2156627Z 	at org.sonarsource.scanner.cli.Main.execute(Main.java:73)
2026-08-26T17:40:58.2156801Z 	at org.sonarsource.scanner.cli.Main.main(Main.java:61)
2026-08-26T17:40:58.2156973Z Caused by: java.lang.IllegalStateException: Fail to get bootstrap index from server
2026-08-26T17:40:58.2157173Z 	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:42)
2026-08-26T17:40:58.2157395Z 	at org.sonarsource.scanner.api.internal.JarDownloader.getScannerEngineFiles(JarDownloader.java:58)
2026-08-26T17:40:58.2157604Z 	at org.sonarsource.scanner.api.internal.JarDownloader.download(JarDownloader.java:53)
2026-08-26T17:40:58.2157889Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:76)
2026-08-26T17:40:58.2158064Z 	... 7 more
2026-08-26T17:40:58.2158255Z Caused by: javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:40:58.2158764Z ##[error]at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:128)
	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
2026-08-26T17:40:58.2159173Z 	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:128)
2026-08-26T17:40:58.2159363Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
2026-08-26T17:40:58.2159979Z ##[error]at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:264)
	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:259)
	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1329)
2026-08-26T17:40:58.2160456Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:264)
2026-08-26T17:40:58.2160645Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:259)
2026-08-26T17:40:58.2160870Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1329)
2026-08-26T17:40:58.2161719Z ##[error]at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.onConsumeCertificate(CertificateMessage.java:1204)
	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.consume(CertificateMessage.java:1151)
	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:392)
	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:444)
	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:421)
2026-08-26T17:40:58.2162358Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.onConsumeCertificate(CertificateMessage.java:1204)
2026-08-26T17:40:58.2162602Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.consume(CertificateMessage.java:1151)
2026-08-26T17:40:58.2162808Z 	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:392)
2026-08-26T17:40:58.2163001Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:444)
2026-08-26T17:40:58.2163200Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:421)
2026-08-26T17:40:58.2163702Z ##[error]at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:178)
	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:164)
2026-08-26T17:40:58.2164130Z 	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:178)
2026-08-26T17:40:58.2164323Z 	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:164)
2026-08-26T17:40:58.2164957Z ##[error]at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1152)
	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1063)
	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:402)
2026-08-26T17:40:58.2165479Z 	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1152)
2026-08-26T17:40:58.2165678Z 	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1063)
2026-08-26T17:40:58.2165876Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:402)
2026-08-26T17:40:58.2166433Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connectTls(RealConnection.java:336)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.establishProtocol(RealConnection.java:300)
2026-08-26T17:40:58.2166924Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connectTls(RealConnection.java:336)
2026-08-26T17:40:58.2167215Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.establishProtocol(RealConnection.java:300)
2026-08-26T17:40:58.2167943Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connect(RealConnection.java:185)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findConnection(ExchangeFinder.java:224)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findHealthyConnection(ExchangeFinder.java:108)
2026-08-26T17:40:58.2168509Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connect(RealConnection.java:185)
2026-08-26T17:40:58.2168754Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findConnection(ExchangeFinder.java:224)
2026-08-26T17:40:58.2169010Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findHealthyConnection(ExchangeFinder.java:108)
2026-08-26T17:40:58.2169730Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.find(ExchangeFinder.java:88)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.Transmitter.newExchange(Transmitter.java:169)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ConnectInterceptor.intercept(ConnectInterceptor.java:41)
2026-08-26T17:40:58.2170270Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.find(ExchangeFinder.java:88)
2026-08-26T17:40:58.2170511Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.Transmitter.newExchange(Transmitter.java:169)
2026-08-26T17:40:58.2170756Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ConnectInterceptor.intercept(ConnectInterceptor.java:41)
2026-08-26T17:40:58.2171186Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:40:58.2171576Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:40:58.2172537Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:40:58.2172964Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:40:58.2173810Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.cache.CacheInterceptor.intercept(CacheInterceptor.java:94)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:40:58.2174325Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.cache.CacheInterceptor.intercept(CacheInterceptor.java:94)
2026-08-26T17:40:58.2174575Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:40:58.2175736Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.BridgeInterceptor.intercept(BridgeInterceptor.java:93)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RetryAndFollowUpInterceptor.intercept(RetryAndFollowUpInterceptor.java:88)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:40:58.2176539Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:40:58.2178125Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.BridgeInterceptor.intercept(BridgeInterceptor.java:93)
2026-08-26T17:40:58.2178371Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:40:58.2178700Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RetryAndFollowUpInterceptor.intercept(RetryAndFollowUpInterceptor.java:88)
2026-08-26T17:40:58.2178959Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:40:58.2180005Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.getResponseWithInterceptorChain(RealCall.java:221)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.execute(RealCall.java:81)
	at org.sonarsource.scanner.api.internal.ServerConnection.callUrl(ServerConnection.java:115)
	at org.sonarsource.scanner.api.internal.ServerConnection.downloadString(ServerConnection.java:99)
	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:39)
	... 10 more
2026-08-26T17:40:58.2180762Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:40:58.2180998Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.getResponseWithInterceptorChain(RealCall.java:221)
2026-08-26T17:40:58.2181219Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.execute(RealCall.java:81)
2026-08-26T17:40:58.2181422Z 	at org.sonarsource.scanner.api.internal.ServerConnection.callUrl(ServerConnection.java:115)
2026-08-26T17:40:58.2181631Z 	at org.sonarsource.scanner.api.internal.ServerConnection.downloadString(ServerConnection.java:99)
2026-08-26T17:40:58.2181846Z 	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:39)
2026-08-26T17:40:58.2182011Z 	... 10 more
2026-08-26T17:40:58.2182393Z ##[error]Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:40:58.2182974Z Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:40:58.2183794Z ##[error]at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:385)
	at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:290)
	at java.base/sun.security.validator.Validator.validate(Validator.java:264)
	at java.base/sun.security.ssl.X509TrustManagerImpl.validate(X509TrustManagerImpl.java:321)
2026-08-26T17:40:58.2184323Z 	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:385)
2026-08-26T17:40:58.2184525Z 	at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:290)
2026-08-26T17:40:58.2184758Z 	at java.base/sun.security.validator.Validator.validate(Validator.java:264)
2026-08-26T17:40:58.2185037Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.validate(X509TrustManagerImpl.java:321)
2026-08-26T17:40:58.2185534Z ##[error]at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:221)
2026-08-26T17:40:58.2185917Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:221)
2026-08-26T17:40:58.2186300Z ##[error]at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:129)
2026-08-26T17:40:58.2186680Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:129)
2026-08-26T17:40:58.2187100Z ##[error]at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1313)
	... 43 more
2026-08-26T17:40:58.2187558Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1313)
2026-08-26T17:40:58.2187732Z 	... 43 more
2026-08-26T17:40:58.2188051Z ##[error]Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:40:58.2188427Z Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:40:58.2189022Z ##[error]at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:141)
	at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:126)
	at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
2026-08-26T17:40:58.2189510Z 	at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:141)
2026-08-26T17:40:58.2189726Z 	at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:126)
2026-08-26T17:40:58.2189934Z 	at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
2026-08-26T17:40:58.2190284Z ##[error]at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:380)
	... 49 more
2026-08-26T17:40:58.2190643Z 	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:380)
2026-08-26T17:40:58.2190788Z 	... 49 more
2026-08-26T17:40:58.2351012Z Process returned exit code 1
2026-08-26T17:40:58.2386490Z ##[error]The SonarScanner did not complete successfully
2026-08-26T17:40:58.2387039Z The SonarScanner did not complete successfully
2026-08-26T17:40:58.2387368Z ##[error]14:40:58.238  Post-processing failed. Exit code: 1
2026-08-26T17:40:58.2387972Z 14:40:58.238  Post-processing failed. Exit code: 1
2026-08-26T17:40:58.2475676Z ##[error]The process '/opt/ads-agent/cache-tools/.dotnet//dotnet' failed with exit code 1
2026-08-26T17:40:58.2510263Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 8 out of 10) after 64000 ms
2026-08-26T17:42:02.3565961Z [command]/opt/ads-agent/cache-tools/.dotnet//dotnet /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/SonarScanner.MSBuild.dll end
2026-08-26T17:42:02.4139398Z SonarScanner for MSBuild 5.8
2026-08-26T17:42:02.4140684Z Using the .NET Core version of the Scanner for MSBuild
2026-08-26T17:42:02.4634452Z Post-processing started.
2026-08-26T17:42:02.5472885Z 14:42:02.546  14:42:02.526  /opt/ads-agent/_work/6/.sonarqube/bin/targets/SonarQube.Integration.targets does not exist
2026-08-26T17:42:02.5473371Z 14:42:02.546  14:42:02.546  sonar.verbose=true was specified - setting the log verbosity to 'Debug'
2026-08-26T17:42:02.5474822Z 14:42:02.547  Loading the SonarQube analysis config from /opt/ads-agent/_work/6/.sonarqube/conf/SonarQubeAnalysisConfig.xml
2026-08-26T17:42:02.5475061Z 14:42:02.547  Not running under TeamBuild
2026-08-26T17:42:02.5476202Z 14:42:02.547  Analysis base directory: /opt/ads-agent/_work/6/.sonarqube
2026-08-26T17:42:02.5476520Z Build directory: 
2026-08-26T17:42:02.5476953Z Bin directory: /opt/ads-agent/_work/6/.sonarqube/bin
2026-08-26T17:42:02.5477610Z Config directory: /opt/ads-agent/_work/6/.sonarqube/conf
2026-08-26T17:42:02.5478010Z Output directory: /opt/ads-agent/_work/6/.sonarqube/out
2026-08-26T17:42:02.5478356Z Config file: /opt/ads-agent/_work/6/.sonarqube/conf/SonarQubeAnalysisConfig.xml
2026-08-26T17:42:02.5489309Z 14:42:02.548  Generating SonarQube project properties file to /opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties
2026-08-26T17:42:02.5683320Z 14:42:02.567  Setting analysis property: sonar.visualstudio.enable=false
2026-08-26T17:42:02.5878366Z 14:42:02.587  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/0/Issues.json
2026-08-26T17:42:02.5913900Z 14:42:02.591  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/1/Issues.json
2026-08-26T17:42:02.5947549Z 14:42:02.594  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/2/Issues.json
2026-08-26T17:42:02.6075781Z 14:42:02.607  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/3/Issues.json
2026-08-26T17:42:02.6106193Z 14:42:02.61  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/4/Issues.json
2026-08-26T17:42:02.6137119Z 14:42:02.613  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/5/Issues.json
2026-08-26T17:42:02.6148671Z 14:42:02.614  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/6/Issues.json
2026-08-26T17:42:02.6159446Z 14:42:02.615  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/7/Issues.json
2026-08-26T17:42:02.6265935Z 14:42:02.626  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/8/Issues.json
2026-08-26T17:42:02.6380476Z 14:42:02.637  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/9/Issues.json
2026-08-26T17:42:02.6410011Z 14:42:02.64  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/10/Issues.json
2026-08-26T17:42:02.6546449Z 14:42:02.654  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/11/Issues.json
2026-08-26T17:42:02.6569419Z 14:42:02.656  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/12/Issues.json
2026-08-26T17:42:02.6594113Z 14:42:02.659  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/13/Issues.json
2026-08-26T17:42:02.6602277Z 14:42:02.66  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/14/Issues.json
2026-08-26T17:42:02.6681442Z 14:42:02.667  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/15/Issues.json
2026-08-26T17:42:02.6703956Z 14:42:02.67  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/16/Issues.json
2026-08-26T17:42:02.6729373Z 14:42:02.672  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/17/Issues.json
2026-08-26T17:42:02.6738911Z 14:42:02.673  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/18/Issues.json
2026-08-26T17:42:02.6747070Z 14:42:02.674  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/19/Issues.json
2026-08-26T17:42:02.6750183Z 14:42:02.674  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/20/Issues.json
2026-08-26T17:42:02.6841877Z 14:42:02.683  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/21/Issues.json
2026-08-26T17:42:02.6866465Z 14:42:02.686  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/22/Issues.json
2026-08-26T17:42:02.6890027Z 14:42:02.688  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/23/Issues.json
2026-08-26T17:42:02.6898844Z 14:42:02.689  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/24/Issues.json
2026-08-26T17:42:02.6906703Z 14:42:02.69  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/25/Issues.json
2026-08-26T17:42:02.6909413Z 14:42:02.69  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/26/Issues.json
2026-08-26T17:42:02.7025674Z 14:42:02.702  Using longest common projects path as a base directory: '/opt/ads-agent/_work/6/s'.
2026-08-26T17:42:02.7135844Z 14:42:02.713  File was referenced by the following projects: '/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/TesteSimovBatch.csproj', '/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/TesteSimovBatch.csproj'.
2026-08-26T17:42:02.7241170Z 14:42:02.718  Dumping content of sonar-project.properties
2026-08-26T17:42:02.7241809Z ------------------------------------------------------------------------
2026-08-26T17:42:02.7242338Z sonar.projectKey=SIMOV-imoveiscaixa-batch
2026-08-26T17:42:02.7243337Z sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar
2026-08-26T17:42:02.7243776Z sonar.projectBaseDir=/opt/ads-agent/_work/6/s
2026-08-26T17:42:02.7243875Z 
2026-08-26T17:42:02.7244290Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectKey=SIMOV-imoveiscaixa-batch:0B395246-F58A-479C-B0B1-C6A6045C6FD3
2026-08-26T17:42:02.7244646Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectName=Simov.Core
2026-08-26T17:42:02.7244914Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:42:02.7245150Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.sourceEncoding=utf-8
2026-08-26T17:42:02.7245375Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.sources=\
2026-08-26T17:42:02.7245614Z "/opt/ads-agent/_work/6/s/src/Simov.Core/AutenticacaoSso/AutenticacarSso.cs",\
2026-08-26T17:42:02.7245843Z "/opt/ads-agent/_work/6/s/src/Simov.Core/AutenticacaoSso/IAutenticacarSso.cs",\
2026-08-26T17:42:02.7246210Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Data/IBaseRepository.cs",\
2026-08-26T17:42:02.7246417Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Data/IUnitOfWork.cs",\
2026-08-26T17:42:02.7246626Z "/opt/ads-agent/_work/6/s/src/Simov.Core/DomainObjects/Entity.cs",\
2026-08-26T17:42:02.7246847Z "/opt/ads-agent/_work/6/s/src/Simov.Core/DomainObjects/IAggregateRoot.cs",\
2026-08-26T17:42:02.7247193Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/ApplicationException.cs",\
2026-08-26T17:42:02.7247421Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/CancellationException.cs",\
2026-08-26T17:42:02.7247778Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/EntityValidationException.cs",\
2026-08-26T17:42:02.7248065Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/GenericException.cs",\
2026-08-26T17:42:02.7248290Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/NotFoundException.cs",\
2026-08-26T17:42:02.7248513Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/ProcessamentoException.cs",\
2026-08-26T17:42:02.7249565Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/RelatedAggregateException.cs",\
2026-08-26T17:42:02.7249889Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/UnauthorizedException.cs",\
2026-08-26T17:42:02.7250108Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Logging/LoggerExtensions.cs",\
2026-08-26T17:42:02.7250328Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siico/ApiSiicoRestPrivado.cs",\
2026-08-26T17:42:02.7250552Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siico/ApiSiicoRestPublico.cs",\
2026-08-26T17:42:02.7250775Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siiso/ApiSiisoRestPublico.cs",\
2026-08-26T17:42:02.7251136Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/DadosDto.cs",\
2026-08-26T17:42:02.7251370Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/DadosSimilDto.cs",\
2026-08-26T17:42:02.7251588Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/FotosDto.cs",\
2026-08-26T17:42:02.7251811Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/ListaFotoDto.cs",\
2026-08-26T17:42:02.7252031Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/ISOAPWeb.cs",\
2026-08-26T17:42:02.7252256Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/RobustSoapDeserializer.cs",\
2026-08-26T17:42:02.7252469Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/SOAPWeb.cs",\
2026-08-26T17:42:02.7252681Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/ResponseGenerico.cs",\
2026-08-26T17:42:02.7252901Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/BairroDetalhadoSiico.cs",\
2026-08-26T17:42:02.7253118Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/BairroSiico.cs",\
2026-08-26T17:42:02.7253329Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/CepSiico.cs",\
2026-08-26T17:42:02.7253545Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/LocalidadeSiico.cs",\
2026-08-26T17:42:02.7253880Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioCompletoSiico.cs",\
2026-08-26T17:42:02.7254113Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioParcialSiico.cs",\
2026-08-26T17:42:02.7254335Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioSiico.cs",\
2026-08-26T17:42:02.7254647Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/TipoLogradouroSiico.cs",\
2026-08-26T17:42:02.7254874Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/UnidadeCaixa.cs",\
2026-08-26T17:42:02.7255099Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/UnidadeFederacaoSiico.cs",\
2026-08-26T17:42:02.7255321Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/EnderecoPessoaSiiso.cs",\
2026-08-26T17:42:02.7255566Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/LocalidadeNascimentoSiiso.cs",\
2026-08-26T17:42:02.7255791Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/PessoaSiiso.cs",\
2026-08-26T17:42:02.7256021Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siico/IApiSiicoRestPrivado.cs",\
2026-08-26T17:42:02.7256262Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siico/IApiSiicoRestPublico.cs",\
2026-08-26T17:42:02.7256498Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siiso/IApiSiisoRestPublico.cs"
2026-08-26T17:42:02.7256572Z 
2026-08-26T17:42:02.7256774Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:42:02.7256972Z "/opt/ads-agent/_work/6/.sonarqube/out/0"
2026-08-26T17:42:02.7257258Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:42:02.7257468Z "/opt/ads-agent/_work/6/.sonarqube/out/0/Issues.json"
2026-08-26T17:42:02.7257538Z 
2026-08-26T17:42:02.7257769Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod0
2026-08-26T17:42:02.7258082Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectKey=SIMOV-imoveiscaixa-batch:5E55366D-25CB-4B0F-BAF4-738003A18ED2
2026-08-26T17:42:02.7258353Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectName=Simov.Domain
2026-08-26T17:42:02.7258819Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:42:02.7259054Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.sourceEncoding=utf-8
2026-08-26T17:42:02.7259268Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.sources=\
2026-08-26T17:42:02.7259490Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AgrupamentoVendaImovel.cs",\
2026-08-26T17:42:02.7259716Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaArquivoLote.cs",\
2026-08-26T17:42:02.7259936Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaFotoImovel.cs",\
2026-08-26T17:42:02.7260165Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaFotoLote.cs",\
2026-08-26T17:42:02.7260474Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaUsuario.cs",\
2026-08-26T17:42:02.7260764Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AvaliacaoImovel.cs",\
2026-08-26T17:42:02.7260979Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/ComodoImovel.cs",\
2026-08-26T17:42:02.7261203Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/ControleProcessamento.cs",\
2026-08-26T17:42:02.7261418Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/DadoContabil.cs",\
2026-08-26T17:42:02.7261624Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/FotoImovel.cs",\
2026-08-26T17:42:02.7261851Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoAgrupamentoVendaImovel.cs",\
2026-08-26T17:42:02.7262080Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoAvaliacaoImovel.cs",\
2026-08-26T17:42:02.7262306Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoComodoImovel.cs",\
2026-08-26T17:42:02.7262525Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoDadoContabil.cs",\
2026-08-26T17:42:02.7262744Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoImovel.cs",\
2026-08-26T17:42:02.7262966Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoMatriculaImovel.cs",\
2026-08-26T17:42:02.7263175Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/Imovel.cs",\
2026-08-26T17:42:02.7263389Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/MatriculaImovel.cs",\
2026-08-26T17:42:02.7263705Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/MensagemControleProcessamento.cs",\
2026-08-26T17:42:02.7263959Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/RotinaProcessamento.cs",\
2026-08-26T17:42:02.7264181Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/ClassificacaoImovelEnum.cs",\
2026-08-26T17:42:02.7264407Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/EstadoConservacaoEnum.cs",\
2026-08-26T17:42:02.7264742Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/FuncionalidadeSistemaEnum.cs",\
2026-08-26T17:42:02.7265014Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/IcAcaoSistemaEnum.cs",\
2026-08-26T17:42:02.7265221Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/IcShortEnum.cs",\
2026-08-26T17:42:02.7265432Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/MotivoExclusaoEnum.cs",\
2026-08-26T17:42:02.7265657Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/OrgaoProprietarioImovelEnum.cs",\
2026-08-26T17:42:02.7265913Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/OrigemImovelEnum.cs",\
2026-08-26T17:42:02.7266271Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/ResultadoMensagemProcessamentoEnum.cs",\
2026-08-26T17:42:02.7266538Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/RotinaProcessamentoEnum.cs",\
2026-08-26T17:42:02.7266761Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/SituacaoImovelEnum.cs",\
2026-08-26T17:42:02.7266980Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/SituacaoProcessamentoEnum.cs",\
2026-08-26T17:42:02.7267194Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoCampoEnum.cs",\
2026-08-26T17:42:02.7267408Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoComodoEnum.cs",\
2026-08-26T17:42:02.7267769Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoImovelEnum.cs",\
2026-08-26T17:42:02.7268096Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoMatriculaEnum.cs",\
2026-08-26T17:42:02.7268490Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAgrupamentoVendaImovelRepository.cs",\
2026-08-26T17:42:02.7268756Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaArquivoLoteRepository.cs",\
2026-08-26T17:42:02.7268997Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaFotoImovelRepository.cs",\
2026-08-26T17:42:02.7269322Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaFotoLoteRepository.cs",\
2026-08-26T17:42:02.7269562Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaUsuarioRepository.cs",\
2026-08-26T17:42:02.7269794Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAvaliacaoImovelRepository.cs",\
2026-08-26T17:42:02.7270082Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IComodoImovelRepository.cs",\
2026-08-26T17:42:02.7270317Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IControleProcessamentoRepository.cs",\
2026-08-26T17:42:02.7270550Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IDadoContabilRepository.cs",\
2026-08-26T17:42:02.7270883Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IFotoImovelRepository.cs",\
2026-08-26T17:42:02.7271154Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IGeradorHistorico.cs",\
2026-08-26T17:42:02.7271380Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IImovelRepository.cs",\
2026-08-26T17:42:02.7271612Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IMatriculaImovelRepository.cs",\
2026-08-26T17:42:02.7271898Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IMensagemControleProcessamentoRepository.cs",\
2026-08-26T17:42:02.7272166Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IRotinaProcessamentoRepository.cs",\
2026-08-26T17:42:02.7272394Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/BaseArquivoLayout.cs",\
2026-08-26T17:42:02.7272608Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/SiaciLayout.cs",\
2026-08-26T17:42:02.7272814Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/SiopiLayout.cs"
2026-08-26T17:42:02.7272881Z 
2026-08-26T17:42:02.7273078Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:42:02.7273271Z "/opt/ads-agent/_work/6/.sonarqube/out/1"
2026-08-26T17:42:02.7273482Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:42:02.7273783Z "/opt/ads-agent/_work/6/.sonarqube/out/1/Issues.json"
2026-08-26T17:42:02.7273855Z 
2026-08-26T17:42:02.7274089Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod1
2026-08-26T17:42:02.7274411Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectKey=SIMOV-imoveiscaixa-batch:0847F1F3-B5DA-4FC3-8EEF-882D75A674FD
2026-08-26T17:42:02.7274769Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectName=Simov.Application
2026-08-26T17:42:02.7275029Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:42:02.7275264Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.sourceEncoding=utf-8
2026-08-26T17:42:02.7275476Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.sources=\
2026-08-26T17:42:02.7275702Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Contexts/FileProcessingContext.cs",\
2026-08-26T17:42:02.7275936Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Contexts/SiicoCallCounterContext.cs",\
2026-08-26T17:42:02.7276168Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/AvaliacaoImovelDto.cs",\
2026-08-26T17:42:02.7276398Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/DadoContabilDto.cs",\
2026-08-26T17:42:02.7276611Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/EnderecoDto.cs",\
2026-08-26T17:42:02.7276822Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/ImovelDto.cs",\
2026-08-26T17:42:02.7277037Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/MatriculaImovelDto.cs",\
2026-08-26T17:42:02.7277253Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/MunicipioDto.cs",\
2026-08-26T17:42:02.7277466Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/SiaciDDQDto.cs",\
2026-08-26T17:42:02.7277811Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/TipoLogradouroDto.cs",\
2026-08-26T17:42:02.7278045Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ICargaFotoImovelService.cs",\
2026-08-26T17:42:02.7278278Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ICargaImovelService.cs",\
2026-08-26T17:42:02.7278712Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IFileService.cs",\
2026-08-26T17:42:02.7278942Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSiaciUseCase.cs",\
2026-08-26T17:42:02.7279179Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSimilFotoUseCase.cs",\
2026-08-26T17:42:02.7279463Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSimilUseCase.cs",\
2026-08-26T17:42:02.7279791Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSiopiUseCase.cs",\
2026-08-26T17:42:02.7280107Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ILeituraService.cs",\
2026-08-26T17:42:02.7280438Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ILogProcessamentoService.cs",\
2026-08-26T17:42:02.7280679Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IMapperDataService.cs",\
2026-08-26T17:42:02.7280910Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ISiaciDDQUseCase.cs",\
2026-08-26T17:42:02.7281164Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IWorkerImovelService.cs",\
2026-08-26T17:42:02.7281392Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/CargaImovelService.cs",\
2026-08-26T17:42:02.7281630Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/FileService.cs",\
2026-08-26T17:42:02.7281877Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/LeituraService.cs",\
2026-08-26T17:42:02.7282159Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/LogProcessamentoService.cs",\
2026-08-26T17:42:02.7282452Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/MapperDataService.cs",\
2026-08-26T17:42:02.7282681Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/WorkerImovelService.cs",\
2026-08-26T17:42:02.7282909Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSiaciUseCase.cs",\
2026-08-26T17:42:02.7283138Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSimilFotoUseCase.cs",\
2026-08-26T17:42:02.7283442Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSimilUseCase.cs",\
2026-08-26T17:42:02.7283731Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSiopiUseCase.cs",\
2026-08-26T17:42:02.7283975Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/SiaciDDQUseCase.cs"
2026-08-26T17:42:02.7284048Z 
2026-08-26T17:42:02.7284248Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:42:02.7284472Z "/opt/ads-agent/_work/6/.sonarqube/out/2"
2026-08-26T17:42:02.7284813Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:42:02.7285029Z "/opt/ads-agent/_work/6/.sonarqube/out/2/Issues.json"
2026-08-26T17:42:02.7285099Z 
2026-08-26T17:42:02.7285325Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod2
2026-08-26T17:42:02.7285633Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectKey=SIMOV-imoveiscaixa-batch:D745E52F-7A66-4C38-B30D-3A27EA75CCCE
2026-08-26T17:42:02.7285892Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectName=Simov.Core
2026-08-26T17:42:02.7286141Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:42:02.7286366Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.sourceEncoding=utf-8
2026-08-26T17:42:02.7286568Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.sources=\
2026-08-26T17:42:02.7286634Z 
2026-08-26T17:42:02.7286716Z 
2026-08-26T17:42:02.7287022Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:42:02.7287222Z "/opt/ads-agent/_work/6/.sonarqube/out/3"
2026-08-26T17:42:02.7287428Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:42:02.7287722Z "/opt/ads-agent/_work/6/.sonarqube/out/3/Issues.json"
2026-08-26T17:42:02.7287784Z 
2026-08-26T17:42:02.7288003Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod3
2026-08-26T17:42:02.7288304Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectKey=SIMOV-imoveiscaixa-batch:FBCB055E-203B-4979-BB94-B02AE276DE0B
2026-08-26T17:42:02.7288571Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectName=Simov.Domain
2026-08-26T17:42:02.7288819Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:42:02.7289138Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.sourceEncoding=utf-8
2026-08-26T17:42:02.7289378Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.sources=\
2026-08-26T17:42:02.7289441Z 
2026-08-26T17:42:02.7289476Z 
2026-08-26T17:42:02.7289665Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:42:02.7289939Z "/opt/ads-agent/_work/6/.sonarqube/out/4"
2026-08-26T17:42:02.7290147Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:42:02.7290349Z "/opt/ads-agent/_work/6/.sonarqube/out/4/Issues.json"
2026-08-26T17:42:02.7290409Z 
2026-08-26T17:42:02.7290631Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod4
2026-08-26T17:42:02.7290935Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectKey=SIMOV-imoveiscaixa-batch:D6E1F89D-8BFA-426E-BC94-C1182DBD0621
2026-08-26T17:42:02.7291203Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectName=Simov.Application
2026-08-26T17:42:02.7291806Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:42:02.7292352Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.sourceEncoding=utf-8
2026-08-26T17:42:02.7292579Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.sources=\
2026-08-26T17:42:02.7292651Z 
2026-08-26T17:42:02.7292691Z 
2026-08-26T17:42:02.7292879Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:42:02.7293074Z "/opt/ads-agent/_work/6/.sonarqube/out/5"
2026-08-26T17:42:02.7293289Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:42:02.7293490Z "/opt/ads-agent/_work/6/.sonarqube/out/5/Issues.json"
2026-08-26T17:42:02.7293560Z 
2026-08-26T17:42:02.7293852Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod5
2026-08-26T17:42:02.7294168Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectKey=SIMOV-imoveiscaixa-batch:AD78E470-A67C-4901-A53F-E3D7D40350CD
2026-08-26T17:42:02.7294484Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:42:02.7294884Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:42:02.7295209Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.sourceEncoding=utf-8
2026-08-26T17:42:02.7295426Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.sources=\
2026-08-26T17:42:02.7295642Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Common/BaseRepository.cs",\
2026-08-26T17:42:02.7295921Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Common/UnitOfWork.cs",\
2026-08-26T17:42:02.7296263Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Interceptor/HistoricosInterceptor.cs",\
2026-08-26T17:42:02.7296523Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AgrupamentoVendaImovelConfiguration.cs",\
2026-08-26T17:42:02.7296784Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaArquivoLoteConfiguration.cs",\
2026-08-26T17:42:02.7297033Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaFotoImovelConfiguration.cs",\
2026-08-26T17:42:02.7297277Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaFotoLoteConfiguration.cs",\
2026-08-26T17:42:02.7297522Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaUsuarioConfiguration.cs",\
2026-08-26T17:42:02.7297871Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AvaliacaoImovelConfiguration.cs",\
2026-08-26T17:42:02.7298109Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ComodoImovelConfiguration.cs",\
2026-08-26T17:42:02.7298354Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ControleProcessamentoConfiguration.cs",\
2026-08-26T17:42:02.7298673Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/DadoContabilConfiguration.cs",\
2026-08-26T17:42:02.7298913Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/FotoImovelConfiguration.cs",\
2026-08-26T17:42:02.7299167Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoAgrupamentoVendaImovelConfiguration.cs",\
2026-08-26T17:42:02.7299486Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoAvaliacaoImovelConfiguration.cs",\
2026-08-26T17:42:02.7299787Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoComodoImovelConfiguration.cs",\
2026-08-26T17:42:02.7300065Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoDadoContabilConfiguration.cs",\
2026-08-26T17:42:02.7300304Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoImovelConfiguration.cs",\
2026-08-26T17:42:02.7300553Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoMatriculaImovelConfiguration.cs",\
2026-08-26T17:42:02.7300839Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ImovelConfiguration.cs",\
2026-08-26T17:42:02.7301101Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/MatriculaImovelConfiguration.cs",\
2026-08-26T17:42:02.7301412Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/MensagemControleProcessamentoConfiguration.cs",\
2026-08-26T17:42:02.7301676Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/RotinaProcessamentoConfiguration.cs",\
2026-08-26T17:42:02.7301927Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AgrupamentoVendaImovelRepository.cs",\
2026-08-26T17:42:02.7302184Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaArquivoLoteRepository.cs",\
2026-08-26T17:42:02.7302433Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaFotoImovelRepository.cs",\
2026-08-26T17:42:02.7302678Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaFotoLoteRepository.cs",\
2026-08-26T17:42:02.7302924Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaUsuarioRepository.cs",\
2026-08-26T17:42:02.7303175Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AvaliacaoImovelRepository.cs",\
2026-08-26T17:42:02.7303416Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ComodoImovelRepository.cs",\
2026-08-26T17:42:02.7303773Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ControleProcessamentoRepository.cs",\
2026-08-26T17:42:02.7304031Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/DadoContabilRepository.cs",\
2026-08-26T17:42:02.7304267Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/FotoImovelRepository.cs",\
2026-08-26T17:42:02.7304663Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ImovelRepository.cs",\
2026-08-26T17:42:02.7304914Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/MatriculaImovelRepository.cs",\
2026-08-26T17:42:02.7305166Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/MensagemControleProcessamentoRepository.cs",\
2026-08-26T17:42:02.7305418Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/RotinaProcessamentoRepository.cs",\
2026-08-26T17:42:02.7305637Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/SimovDbContext.cs"
2026-08-26T17:42:02.7305713Z 
2026-08-26T17:42:02.7305903Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:42:02.7306092Z "/opt/ads-agent/_work/6/.sonarqube/out/6"
2026-08-26T17:42:02.7306298Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:42:02.7306496Z "/opt/ads-agent/_work/6/.sonarqube/out/6/Issues.json"
2026-08-26T17:42:02.7306616Z 
2026-08-26T17:42:02.7306839Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod6
2026-08-26T17:42:02.7307148Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectKey=SIMOV-imoveiscaixa-batch:B904AD47-4763-413C-9324-7889FD92EFA6
2026-08-26T17:42:02.7307410Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectName=Simov.Batch
2026-08-26T17:42:02.7307660Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:42:02.7307899Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.sourceEncoding=utf-8
2026-08-26T17:42:02.7308202Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.sources=\
2026-08-26T17:42:02.7308429Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/AddHeadersHttpClient.cs",\
2026-08-26T17:42:02.7308660Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/ConnectionsConfiguration.cs",\
2026-08-26T17:42:02.7308891Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/HttpClientConfiguration.cs",\
2026-08-26T17:42:02.7309117Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/IApiSiisoRestPrivado.cs",\
2026-08-26T17:42:02.7309536Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/UseCasesConfiguration.cs",\
2026-08-26T17:42:02.7309754Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderImoveisSiaci.cs",\
2026-08-26T17:42:02.7309970Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderImoveisSiopi.cs",\
2026-08-26T17:42:02.7310184Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderLeilaoSiaciDDQ.cs",\
2026-08-26T17:42:02.7310391Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Program.cs",\
2026-08-26T17:42:02.7310605Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Workers/WorkerFotoImoveisSimil.cs",\
2026-08-26T17:42:02.7310819Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Workers/WorkerImoveisSimil.cs",\
2026-08-26T17:42:02.7311049Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/Simov.Batch.GlobalUsings.g.cs",\
2026-08-26T17:42:02.7311320Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/.NETCoreApp,Version=v8.0.AssemblyAttributes.cs",\
2026-08-26T17:42:02.7311573Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/Simov.Batch.AssemblyInfo.cs",\
2026-08-26T17:42:02.7311796Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/appsettings.Development.json",\
2026-08-26T17:42:02.7311999Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/appsettings.json",\
2026-08-26T17:42:02.7312211Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Properties/launchSettings.json",\
2026-08-26T17:42:02.7312423Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/apphost"
2026-08-26T17:42:02.7312491Z 
2026-08-26T17:42:02.7312684Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:42:02.7312873Z "/opt/ads-agent/_work/6/.sonarqube/out/7"
2026-08-26T17:42:02.7313082Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:42:02.7313350Z "/opt/ads-agent/_work/6/.sonarqube/out/7/Issues.json"
2026-08-26T17:42:02.7313423Z 
2026-08-26T17:42:02.7313743Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod7
2026-08-26T17:42:02.7314078Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectKey=SIMOV-imoveiscaixa-batch:6679F22B-144A-4C59-A28C-2A87F31E3915
2026-08-26T17:42:02.7314344Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectName=Simov.Core
2026-08-26T17:42:02.7314715Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:42:02.7314970Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.sourceEncoding=utf-8
2026-08-26T17:42:02.7315177Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.sources=\
2026-08-26T17:42:02.7315321Z 
2026-08-26T17:42:02.7315358Z 
2026-08-26T17:42:02.7315561Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:42:02.7315752Z "/opt/ads-agent/_work/6/.sonarqube/out/8"
2026-08-26T17:42:02.7315957Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:42:02.7316224Z "/opt/ads-agent/_work/6/.sonarqube/out/8/Issues.json"
2026-08-26T17:42:02.7316292Z 
2026-08-26T17:42:02.7316513Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod8
2026-08-26T17:42:02.7316822Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectKey=SIMOV-imoveiscaixa-batch:EC78B0BC-170C-482C-867B-C5402B449403
2026-08-26T17:42:02.7317142Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectName=Simov.Core
2026-08-26T17:42:02.7317396Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:42:02.7317667Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.sourceEncoding=utf-8
2026-08-26T17:42:02.7317871Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.sources=\
2026-08-26T17:42:02.7317934Z 
2026-08-26T17:42:02.7317978Z 
2026-08-26T17:42:02.7318166Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:42:02.7318358Z "/opt/ads-agent/_work/6/.sonarqube/out/9"
2026-08-26T17:42:02.7318563Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:42:02.7318762Z "/opt/ads-agent/_work/6/.sonarqube/out/9/Issues.json"
2026-08-26T17:42:02.7318820Z 
2026-08-26T17:42:02.7319041Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod9
2026-08-26T17:42:02.7319353Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectKey=SIMOV-imoveiscaixa-batch:1B2C05E0-E98F-477C-931D-923BBE79AE4E
2026-08-26T17:42:02.7319613Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectName=Simov.Domain
2026-08-26T17:42:02.7319862Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:42:02.7320094Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.sourceEncoding=utf-8
2026-08-26T17:42:02.7320296Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.sources=\
2026-08-26T17:42:02.7320360Z 
2026-08-26T17:42:02.7320403Z 
2026-08-26T17:42:02.7320593Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:42:02.7320783Z "/opt/ads-agent/_work/6/.sonarqube/out/10"
2026-08-26T17:42:02.7321068Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:42:02.7321284Z "/opt/ads-agent/_work/6/.sonarqube/out/10/Issues.json"
2026-08-26T17:42:02.7321344Z 
2026-08-26T17:42:02.7321566Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod10
2026-08-26T17:42:02.7321874Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectKey=SIMOV-imoveiscaixa-batch:A180ED2D-1521-44A6-B6EA-5DDEC55D2C17
2026-08-26T17:42:02.7322140Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectName=Simov.Core
2026-08-26T17:42:02.7322878Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:42:02.7323134Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.sourceEncoding=utf-8
2026-08-26T17:42:02.7323349Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.sources=\
2026-08-26T17:42:02.7323419Z 
2026-08-26T17:42:02.7323455Z 
2026-08-26T17:42:02.7323698Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:42:02.7323914Z "/opt/ads-agent/_work/6/.sonarqube/out/11"
2026-08-26T17:42:02.7324125Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:42:02.7324336Z "/opt/ads-agent/_work/6/.sonarqube/out/11/Issues.json"
2026-08-26T17:42:02.7324407Z 
2026-08-26T17:42:02.7324693Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod11
2026-08-26T17:42:02.7324997Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectKey=SIMOV-imoveiscaixa-batch:A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E
2026-08-26T17:42:02.7325253Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectName=Simov.Domain
2026-08-26T17:42:02.7325496Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:42:02.7325785Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.sourceEncoding=utf-8
2026-08-26T17:42:02.7325991Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.sources=\
2026-08-26T17:42:02.7326064Z 
2026-08-26T17:42:02.7326098Z 
2026-08-26T17:42:02.7326286Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:42:02.7326478Z "/opt/ads-agent/_work/6/.sonarqube/out/12"
2026-08-26T17:42:02.7326686Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:42:02.7326888Z "/opt/ads-agent/_work/6/.sonarqube/out/12/Issues.json"
2026-08-26T17:42:02.7326958Z 
2026-08-26T17:42:02.7327183Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod12
2026-08-26T17:42:02.7327661Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectKey=SIMOV-imoveiscaixa-batch:00300450-28FA-4EA9-8A96-181ED44DCA26
2026-08-26T17:42:02.7328019Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectName=Simov.Application
2026-08-26T17:42:02.7328397Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:42:02.7328738Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.sourceEncoding=utf-8
2026-08-26T17:42:02.7329035Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.sources=\
2026-08-26T17:42:02.7329145Z 
2026-08-26T17:42:02.7329192Z 
2026-08-26T17:42:02.7329392Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:42:02.7329582Z "/opt/ads-agent/_work/6/.sonarqube/out/13"
2026-08-26T17:42:02.7329794Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:42:02.7330003Z "/opt/ads-agent/_work/6/.sonarqube/out/13/Issues.json"
2026-08-26T17:42:02.7330068Z 
2026-08-26T17:42:02.7330298Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod13
2026-08-26T17:42:02.7330741Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectKey=SIMOV-imoveiscaixa-batch:1393E257-1007-43DE-B94C-0B0508C0B309
2026-08-26T17:42:02.7331021Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:42:02.7331275Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:42:02.7331509Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.sourceEncoding=utf-8
2026-08-26T17:42:02.7331712Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.sources=\
2026-08-26T17:42:02.7331774Z 
2026-08-26T17:42:02.7331817Z 
2026-08-26T17:42:02.7332004Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:42:02.7332197Z "/opt/ads-agent/_work/6/.sonarqube/out/14"
2026-08-26T17:42:02.7332405Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:42:02.7332610Z "/opt/ads-agent/_work/6/.sonarqube/out/14/Issues.json"
2026-08-26T17:42:02.7332668Z 
2026-08-26T17:42:02.7332889Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod14
2026-08-26T17:42:02.7333187Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectKey=SIMOV-imoveiscaixa-batch:5BE00443-BD63-4C9F-A707-406F2AC94762
2026-08-26T17:42:02.7333443Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectName=Simov.Core
2026-08-26T17:42:02.7333760Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:42:02.7334011Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.sourceEncoding=utf-8
2026-08-26T17:42:02.7334216Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.sources=\
2026-08-26T17:42:02.7334281Z 
2026-08-26T17:42:02.7334315Z 
2026-08-26T17:42:02.7334562Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:42:02.7334844Z "/opt/ads-agent/_work/6/.sonarqube/out/15"
2026-08-26T17:42:02.7335064Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:42:02.7335267Z "/opt/ads-agent/_work/6/.sonarqube/out/15/Issues.json"
2026-08-26T17:42:02.7335328Z 
2026-08-26T17:42:02.7335549Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod15
2026-08-26T17:42:02.7335935Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectKey=SIMOV-imoveiscaixa-batch:A79CA783-37A2-49D3-B56C-D9102F046AF9
2026-08-26T17:42:02.7336192Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectName=Simov.Domain
2026-08-26T17:42:02.7336440Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:42:02.7336665Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.sourceEncoding=utf-8
2026-08-26T17:42:02.7336869Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.sources=\
2026-08-26T17:42:02.7336942Z 
2026-08-26T17:42:02.7336975Z 
2026-08-26T17:42:02.7337210Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:42:02.7337405Z "/opt/ads-agent/_work/6/.sonarqube/out/16"
2026-08-26T17:42:02.7337614Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:42:02.7337816Z "/opt/ads-agent/_work/6/.sonarqube/out/16/Issues.json"
2026-08-26T17:42:02.7337885Z 
2026-08-26T17:42:02.7338105Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod16
2026-08-26T17:42:02.7338490Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectKey=SIMOV-imoveiscaixa-batch:51ABFD24-E14F-4155-B9D7-CDBD0E536AAB
2026-08-26T17:42:02.7338903Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectName=Simov.Application
2026-08-26T17:42:02.7339302Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:42:02.7339573Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.sourceEncoding=utf-8
2026-08-26T17:42:02.7339840Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.sources=\
2026-08-26T17:42:02.7339945Z 
2026-08-26T17:42:02.7339998Z 
2026-08-26T17:42:02.7340211Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:42:02.7340403Z "/opt/ads-agent/_work/6/.sonarqube/out/17"
2026-08-26T17:42:02.7340613Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:42:02.7340817Z "/opt/ads-agent/_work/6/.sonarqube/out/17/Issues.json"
2026-08-26T17:42:02.7340886Z 
2026-08-26T17:42:02.7341107Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod17
2026-08-26T17:42:02.7341452Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectKey=SIMOV-imoveiscaixa-batch:F2842708-9CF5-4649-B3A8-6D39E5E01B77
2026-08-26T17:42:02.7341786Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:42:02.7342046Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:42:02.7342286Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.sourceEncoding=utf-8
2026-08-26T17:42:02.7342537Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.sources=\
2026-08-26T17:42:02.7342614Z 
2026-08-26T17:42:02.7342739Z 
2026-08-26T17:42:02.7342951Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:42:02.7343142Z "/opt/ads-agent/_work/6/.sonarqube/out/18"
2026-08-26T17:42:02.7343439Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:42:02.7343733Z "/opt/ads-agent/_work/6/.sonarqube/out/18/Issues.json"
2026-08-26T17:42:02.7343796Z 
2026-08-26T17:42:02.7344030Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod18
2026-08-26T17:42:02.7344338Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectKey=SIMOV-imoveiscaixa-batch:3C101C3B-D8C0-461B-B65B-B87A6F75F210
2026-08-26T17:42:02.7344714Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectName=Simov.Batch
2026-08-26T17:42:02.7345038Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:42:02.7345294Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.sourceEncoding=utf-8
2026-08-26T17:42:02.7345573Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.sources=\
2026-08-26T17:42:02.7345640Z 
2026-08-26T17:42:02.7345745Z 
2026-08-26T17:42:02.7345935Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:42:02.7346137Z "/opt/ads-agent/_work/6/.sonarqube/out/19"
2026-08-26T17:42:02.7346347Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:42:02.7346552Z "/opt/ads-agent/_work/6/.sonarqube/out/19/Issues.json"
2026-08-26T17:42:02.7346612Z 
2026-08-26T17:42:02.7346833Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod19
2026-08-26T17:42:02.7347196Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectKey=SIMOV-imoveiscaixa-batch:4E341BE0-BD46-427C-8912-6319C41C89BC
2026-08-26T17:42:02.7347508Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectName=TesteSimovBatch
2026-08-26T17:42:02.7347766Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/tests/TesteSimovBatch
2026-08-26T17:42:02.7348002Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.sourceEncoding=utf-8
2026-08-26T17:42:02.7348210Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.sources=
2026-08-26T17:42:02.7348409Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.tests=\
2026-08-26T17:42:02.7348650Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/AvaliacaoImovelDtoTests.cs",\
2026-08-26T17:42:02.7348894Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/DadoContabilDtoTests.cs",\
2026-08-26T17:42:02.7349131Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/ImovelDtoTests.cs",\
2026-08-26T17:42:02.7349371Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/MatriculaImovelDtoTests.cs",\
2026-08-26T17:42:02.7349621Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/CargaImovelServiceTests.cs",\
2026-08-26T17:42:02.7349866Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/FileServiceTests.cs",\
2026-08-26T17:42:02.7350109Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/LeituraSiaciServiceTests.cs",\
2026-08-26T17:42:02.7350362Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/LogProcessamentoServiceTests.cs",\
2026-08-26T17:42:02.7350611Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/MapperDataServiceTests.cs",\
2026-08-26T17:42:02.7350858Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/WorkerImovelServiceTests.cs",\
2026-08-26T17:42:02.7351116Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSiaciPreCadastroUseCaseTests.cs",\
2026-08-26T17:42:02.7351371Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSimilFotoUseCaseTests.cs",\
2026-08-26T17:42:02.7351629Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSimilUseCaseTests.cs",\
2026-08-26T17:42:02.7351878Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSiopiUseCaseTests.cs",\
2026-08-26T17:42:02.7352114Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/SiaciDDQUseCaseTests.cs",\
2026-08-26T17:42:02.7352350Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Batch/LoaderImoveisSiopiTests.cs",\
2026-08-26T17:42:02.7352571Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/CargaImoveisSiaciTests.cs",\
2026-08-26T17:42:02.7352805Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Configuration/AddHeadersHttpClientTests.cs",\
2026-08-26T17:42:02.7353045Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Configuration/ConnectionsConfigurationTest.cs",\
2026-08-26T17:42:02.7353279Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Contexts/FileProcessingContextTests.cs",\
2026-08-26T17:42:02.7353514Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Contexts/SiicoCallCounterContextTests.cs",\
2026-08-26T17:42:02.7353812Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/DomainObjects/EntityTests.cs",\
2026-08-26T17:42:02.7354055Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/DomainObjects/IAggregateRootTests.cs",\
2026-08-26T17:42:02.7354300Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/CancellationExceptionTests.cs",\
2026-08-26T17:42:02.7354788Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/EntityValidationExceptionTests.cs",\
2026-08-26T17:42:02.7355048Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/GenericExceptionTests.cs",\
2026-08-26T17:42:02.7355373Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/NotFoundExceptionTests.cs",\
2026-08-26T17:42:02.7355686Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/ProcessamentoExceptionTests.cs",\
2026-08-26T17:42:02.7355937Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/RelatedAggregateExceptionTests.cs",\
2026-08-26T17:42:02.7356244Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/UnauthorizedExceptionTests.cs",\
2026-08-26T17:42:02.7356492Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siico/ApiSiicoRestPrivadoTests.cs",\
2026-08-26T17:42:02.7356738Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siico/ApiSiicoRestPublicoTests.cs",\
2026-08-26T17:42:02.7356984Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siiso/ApiSiisoRestPublicoTests.cs",\
2026-08-26T17:42:02.7357217Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/AutenticacarSsoTests.cs",\
2026-08-26T17:42:02.7357452Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/BairroDetalhadoSiicoTests.cs",\
2026-08-26T17:42:02.7357682Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/BairroSiicoTests.cs",\
2026-08-26T17:42:02.7357915Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/MunicipioCompletoSiicoTests.cs",\
2026-08-26T17:42:02.7358153Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/ResponseGenericoTests.cs",\
2026-08-26T17:42:02.7358399Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/Siico/CepSiicoTests.cs",\
2026-08-26T17:42:02.7358636Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Domain/Layouts/BaseArquivoLayoutTests.cs",\
2026-08-26T17:42:02.7358920Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/AgrupamentoVendaImovelTests.cs",\
2026-08-26T17:42:02.7359232Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/AvaliacaoImovelSiopiTests.cs",\
2026-08-26T17:42:02.7359468Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/ControleProcessamentoTests.cs",\
2026-08-26T17:42:02.7359691Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/DadoContabilTests.cs",\
2026-08-26T17:42:02.7359930Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoAgrupamentoVendaImovelTests.cs",\
2026-08-26T17:42:02.7360171Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoDadoContabilTests.cs",\
2026-08-26T17:42:02.7360402Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoImovelTests.cs",\
2026-08-26T17:42:02.7360623Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/ImovelTests.cs",\
2026-08-26T17:42:02.7360849Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/MatriculaImovelSiopiTests.cs",\
2026-08-26T17:42:02.7361095Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/MensagemControleProcessamentoTests.cs",\
2026-08-26T17:42:02.7361331Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/RotinaProcessamentoTests.cs",\
2026-08-26T17:42:02.7361558Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/SiopiImovelTests.cs",\
2026-08-26T17:42:02.7361922Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ArquivoSiaciFake.cs",\
2026-08-26T17:42:02.7362145Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ImovelDtoFake.cs",\
2026-08-26T17:42:02.7362359Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ImovelFake.cs",\
2026-08-26T17:42:02.7362576Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/LayoutArquivoFake.cs",\
2026-08-26T17:42:02.7362801Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/Siico/ResponsesFake.cs",\
2026-08-26T17:42:02.7363037Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/InfraDataEF/HistoricosInterceptorTests.cs",\
2026-08-26T17:42:02.7363310Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/InfraDataEF/SimovDbContextTests.cs",\
2026-08-26T17:42:02.7363533Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Layouts/SiaciLayoutTests.cs"
2026-08-26T17:42:02.7363604Z 
2026-08-26T17:42:02.7363872Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:42:02.7364077Z "/opt/ads-agent/_work/6/.sonarqube/out/20"
2026-08-26T17:42:02.7364291Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:42:02.7364557Z "/opt/ads-agent/_work/6/.sonarqube/out/20/Issues.json"
2026-08-26T17:42:02.7364644Z 
2026-08-26T17:42:02.7364877Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod20
2026-08-26T17:42:02.7365245Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectKey=SIMOV-imoveiscaixa-batch:0DC13198-1AC4-46C6-B9B3-E2987B8496D5
2026-08-26T17:42:02.7365506Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectName=Simov.Core
2026-08-26T17:42:02.7365750Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:42:02.7365985Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.sourceEncoding=utf-8
2026-08-26T17:42:02.7366188Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.sources=\
2026-08-26T17:42:02.7366262Z 
2026-08-26T17:42:02.7366296Z 
2026-08-26T17:42:02.7366484Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:42:02.7366678Z "/opt/ads-agent/_work/6/.sonarqube/out/21"
2026-08-26T17:42:02.7366885Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:42:02.7367086Z "/opt/ads-agent/_work/6/.sonarqube/out/21/Issues.json"
2026-08-26T17:42:02.7367158Z 
2026-08-26T17:42:02.7367377Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod21
2026-08-26T17:42:02.7367680Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectKey=SIMOV-imoveiscaixa-batch:BA15777F-9613-49A5-8C5F-8CBFA5F86619
2026-08-26T17:42:02.7367941Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectName=Simov.Domain
2026-08-26T17:42:02.7368188Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:42:02.7368421Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.sourceEncoding=utf-8
2026-08-26T17:42:02.7368626Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.sources=\
2026-08-26T17:42:02.7368699Z 
2026-08-26T17:42:02.7368735Z 
2026-08-26T17:42:02.7369067Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:42:02.7369284Z "/opt/ads-agent/_work/6/.sonarqube/out/22"
2026-08-26T17:42:02.7369496Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:42:02.7369706Z "/opt/ads-agent/_work/6/.sonarqube/out/22/Issues.json"
2026-08-26T17:42:02.7369774Z 
2026-08-26T17:42:02.7370000Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod22
2026-08-26T17:42:02.7370305Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectKey=SIMOV-imoveiscaixa-batch:48A485AE-9F33-C9A7-979C-54916B65C32E
2026-08-26T17:42:02.7370569Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectName=Simov.Application
2026-08-26T17:42:02.7370830Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:42:02.7371067Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.sourceEncoding=utf-8
2026-08-26T17:42:02.7371273Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.sources=\
2026-08-26T17:42:02.7371338Z 
2026-08-26T17:42:02.7371381Z 
2026-08-26T17:42:02.7371572Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:42:02.7371771Z "/opt/ads-agent/_work/6/.sonarqube/out/23"
2026-08-26T17:42:02.7371979Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:42:02.7372181Z "/opt/ads-agent/_work/6/.sonarqube/out/23/Issues.json"
2026-08-26T17:42:02.7372243Z 
2026-08-26T17:42:02.7372469Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod23
2026-08-26T17:42:02.7372825Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectKey=SIMOV-imoveiscaixa-batch:309346D6-2461-4973-A29B-7A38A756C0DE
2026-08-26T17:42:02.7373094Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:42:02.7373354Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:42:02.7373594Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.sourceEncoding=utf-8
2026-08-26T17:42:02.7373879Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.sources=\
2026-08-26T17:42:02.7373944Z 
2026-08-26T17:42:02.7373985Z 
2026-08-26T17:42:02.7374218Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:42:02.7374418Z "/opt/ads-agent/_work/6/.sonarqube/out/24"
2026-08-26T17:42:02.7374747Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:42:02.7374956Z "/opt/ads-agent/_work/6/.sonarqube/out/24/Issues.json"
2026-08-26T17:42:02.7375019Z 
2026-08-26T17:42:02.7375318Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod24
2026-08-26T17:42:02.7375626Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectKey=SIMOV-imoveiscaixa-batch:4BF20498-1845-4781-82CB-E7783C0081FA
2026-08-26T17:42:02.7375885Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectName=Simov.Batch
2026-08-26T17:42:02.7376133Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:42:02.7376364Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.sourceEncoding=utf-8
2026-08-26T17:42:02.7376649Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.sources=\
2026-08-26T17:42:02.7376725Z 
2026-08-26T17:42:02.7376760Z 
2026-08-26T17:42:02.7376961Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:42:02.7377218Z "/opt/ads-agent/_work/6/.sonarqube/out/25"
2026-08-26T17:42:02.7377502Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:42:02.7377787Z "/opt/ads-agent/_work/6/.sonarqube/out/25/Issues.json"
2026-08-26T17:42:02.7377877Z 
2026-08-26T17:42:02.7378169Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod25
2026-08-26T17:42:02.7378601Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectKey=SIMOV-imoveiscaixa-batch:D54F14FF-8EEB-4EB8-994B-69D77DDB78FD
2026-08-26T17:42:02.7379104Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectName=TesteSimovBatch
2026-08-26T17:42:02.7379476Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/tests/TesteSimovBatch
2026-08-26T17:42:02.7379776Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.sourceEncoding=utf-8
2026-08-26T17:42:02.7379979Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.sources=
2026-08-26T17:42:02.7380180Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.tests=\
2026-08-26T17:42:02.7380255Z 
2026-08-26T17:42:02.7380310Z 
2026-08-26T17:42:02.7380546Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:42:02.7380740Z "/opt/ads-agent/_work/6/.sonarqube/out/26"
2026-08-26T17:42:02.7380948Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:42:02.7381145Z "/opt/ads-agent/_work/6/.sonarqube/out/26/Issues.json"
2026-08-26T17:42:02.7381214Z 
2026-08-26T17:42:02.7381435Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod26
2026-08-26T17:42:02.7381606Z sonar.host.url=https://sonar.apps.produtos4.caixa/
2026-08-26T17:42:02.7381787Z sonar.projectKey=SIMOV-imoveiscaixa-batch
2026-08-26T17:42:02.7381963Z sonar.projectName=SIMOV-imoveiscaixa-batch
2026-08-26T17:42:02.7382142Z sonar.projectVersion=1.0-SNAPSHOT
2026-08-26T17:42:02.7382269Z sonar.branch.name=CorrecoesSonar
2026-08-26T17:42:02.7382539Z sonar.scanner.metadataFilePath=/opt/ads-agent/_work/_temp/sonar/1.0-SNAPSHOT/f442c3b3-ec53-840d-3dab-bba3c4de61f5/report-task.txt
2026-08-26T17:42:02.7382907Z sonar.cs.opencover.reportsPaths=/opt/ads-agent/_work/_temp/**/coverage.opencover.xml
2026-08-26T17:42:02.7383133Z sonar.cs.vstest.reportsPaths=/opt/ads-agent/_work/_temp/**/*.trx
2026-08-26T17:42:02.7383272Z sonar.visualstudio.enable=false
2026-08-26T17:42:02.7383334Z 
2026-08-26T17:42:02.7384781Z sonar.modules=0B395246-F58A-479C-B0B1-C6A6045C6FD3,5E55366D-25CB-4B0F-BAF4-738003A18ED2,0847F1F3-B5DA-4FC3-8EEF-882D75A674FD,D745E52F-7A66-4C38-B30D-3A27EA75CCCE,FBCB055E-203B-4979-BB94-B02AE276DE0B,D6E1F89D-8BFA-426E-BC94-C1182DBD0621,AD78E470-A67C-4901-A53F-E3D7D40350CD,B904AD47-4763-413C-9324-7889FD92EFA6,6679F22B-144A-4C59-A28C-2A87F31E3915,EC78B0BC-170C-482C-867B-C5402B449403,1B2C05E0-E98F-477C-931D-923BBE79AE4E,A180ED2D-1521-44A6-B6EA-5DDEC55D2C17,A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E,00300450-28FA-4EA9-8A96-181ED44DCA26,1393E257-1007-43DE-B94C-0B0508C0B309,5BE00443-BD63-4C9F-A707-406F2AC94762,A79CA783-37A2-49D3-B56C-D9102F046AF9,51ABFD24-E14F-4155-B9D7-CDBD0E536AAB,F2842708-9CF5-4649-B3A8-6D39E5E01B77,3C101C3B-D8C0-461B-B65B-B87A6F75F210,4E341BE0-BD46-427C-8912-6319C41C89BC,0DC13198-1AC4-46C6-B9B3-E2987B8496D5,BA15777F-9613-49A5-8C5F-8CBFA5F86619,48A485AE-9F33-C9A7-979C-54916B65C32E,309346D6-2461-4973-A29B-7A38A756C0DE,4BF20498-1845-4781-82CB-E7783C0081FA,D54F14FF-8EEB-4EB8-994B-69D77DDB78FD
2026-08-26T17:42:02.7385397Z 
2026-08-26T17:42:02.7385432Z 
2026-08-26T17:42:02.7385626Z ------------------------------------------------------------------------
2026-08-26T17:42:02.7385881Z 14:42:02.726  Writing processing summary to /opt/ads-agent/_work/6/.sonarqube/out/ProjectInfo.log
2026-08-26T17:42:02.7386071Z The SONAR_SCANNER_HOME environment variable is not required and will be ignored.
2026-08-26T17:42:02.7386220Z Calling the SonarScanner CLI...
2026-08-26T17:42:02.7386572Z Executing file /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/sonar-scanner-4.7.0.2747/bin/sonar-scanner
2026-08-26T17:42:02.7386948Z   Args: -Dsonar.scanAllFiles=true -Dproject.settings=/opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties --from=ScannerMSBuild/5.8 --debug <sensitive data removed>
2026-08-26T17:42:02.7387188Z   Working directory: /opt/ads-agent/_work/6
2026-08-26T17:42:02.7387316Z   Timeout (ms):-1
2026-08-26T17:42:02.7387433Z   Process id: 26663
2026-08-26T17:42:02.8559893Z 14:42:02.851 INFO: Scanner configuration file: /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/sonar-scanner-4.7.0.2747/conf/sonar-scanner.properties
2026-08-26T17:42:02.8560474Z 14:42:02.853 INFO: Project root configuration file: /opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties
2026-08-26T17:42:02.8842813Z 14:42:02.883 INFO: SonarScanner 4.7.0.2747
2026-08-26T17:42:02.8843301Z 14:42:02.883 INFO: Java 11 Oracle Corporation (64-bit)
2026-08-26T17:42:02.8843549Z 14:42:02.883 INFO: Linux 5.18.5-100.fc35.x86_64 amd64
2026-08-26T17:42:02.9710503Z 14:42:02.970 DEBUG: keyStore is : 
2026-08-26T17:42:02.9710866Z 14:42:02.970 DEBUG: keyStore type is : pkcs12
2026-08-26T17:42:02.9711099Z 14:42:02.970 DEBUG: keyStore provider is : 
2026-08-26T17:42:02.9711327Z 14:42:02.970 DEBUG: init keystore
2026-08-26T17:42:02.9711552Z 14:42:02.970 DEBUG: init keymanager of type SunX509
2026-08-26T17:42:03.0378990Z 14:42:03.037 DEBUG: Create: /opt/ads-agent/cache-tools/.sonar/cache
2026-08-26T17:42:03.0383433Z 14:42:03.037 INFO: User cache: /opt/ads-agent/cache-tools/.sonar/cache
2026-08-26T17:42:03.0385112Z 14:42:03.038 DEBUG: Create: /opt/ads-agent/cache-tools/.sonar/cache/_tmp
2026-08-26T17:42:03.0399999Z 14:42:03.039 DEBUG: Extract sonar-scanner-api-batch in temp...
2026-08-26T17:42:03.0421168Z 14:42:03.041 DEBUG: Get bootstrap index...
2026-08-26T17:42:03.0421871Z 14:42:03.041 DEBUG: Download: https://sonar.apps.produtos4.caixa/batch/index
2026-08-26T17:42:03.1315194Z 14:42:03.130 INFO: ------------------------------------------------------------------------
2026-08-26T17:42:03.1315635Z 14:42:03.130 INFO: EXECUTION FAILURE
2026-08-26T17:42:03.1316204Z 14:42:03.130 INFO: ------------------------------------------------------------------------
2026-08-26T17:42:03.1316388Z 14:42:03.131 INFO: Total time: 0.301s
2026-08-26T17:42:03.1320234Z ##[error]14:42:03.130 ERROR: SonarQube server [https://sonar.apps.produtos4.caixa] can not be reached
2026-08-26T17:42:03.1320800Z 14:42:03.130 ERROR: SonarQube server [https://sonar.apps.produtos4.caixa] can not be reached
2026-08-26T17:42:03.1411301Z 14:42:03.140 INFO: Final Memory: 4M/80M
2026-08-26T17:42:03.1411815Z 14:42:03.140 INFO: ------------------------------------------------------------------------
2026-08-26T17:42:03.1412570Z ##[error]14:42:03.140 ERROR: Error during SonarScanner execution
org.sonarsource.scanner.api.internal.ScannerException: Unable to execute SonarScanner analysis
2026-08-26T17:42:03.1413417Z 14:42:03.140 ERROR: Error during SonarScanner execution
2026-08-26T17:42:03.1413596Z org.sonarsource.scanner.api.internal.ScannerException: Unable to execute SonarScanner analysis
2026-08-26T17:42:03.1415219Z ##[error]at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:85)
	at java.base/java.security.AccessController.doPrivileged(Native Method)
	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:74)
	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:70)
	at org.sonarsource.scanner.api.EmbeddedScanner.doStart(EmbeddedScanner.java:185)
	at org.sonarsource.scanner.api.EmbeddedScanner.start(EmbeddedScanner.java:123)
	at org.sonarsource.scanner.cli.Main.execute(Main.java:73)
	at org.sonarsource.scanner.cli.Main.main(Main.java:61)
2026-08-26T17:42:03.1416321Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:85)
2026-08-26T17:42:03.1416630Z 	at java.base/java.security.AccessController.doPrivileged(Native Method)
2026-08-26T17:42:03.1416981Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:74)
2026-08-26T17:42:03.1417335Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:70)
2026-08-26T17:42:03.1417690Z 	at org.sonarsource.scanner.api.EmbeddedScanner.doStart(EmbeddedScanner.java:185)
2026-08-26T17:42:03.1417996Z 	at org.sonarsource.scanner.api.EmbeddedScanner.start(EmbeddedScanner.java:123)
2026-08-26T17:42:03.1418283Z 	at org.sonarsource.scanner.cli.Main.execute(Main.java:73)
2026-08-26T17:42:03.1418547Z 	at org.sonarsource.scanner.cli.Main.main(Main.java:61)
2026-08-26T17:42:03.1419833Z ##[error]Caused by: java.lang.IllegalStateException: Fail to get bootstrap index from server
	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:42)
	at org.sonarsource.scanner.api.internal.JarDownloader.getScannerEngineFiles(JarDownloader.java:58)
	at org.sonarsource.scanner.api.internal.JarDownloader.download(JarDownloader.java:53)
	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:76)
	... 7 more
2026-08-26T17:42:03.1420772Z Caused by: java.lang.IllegalStateException: Fail to get bootstrap index from server
2026-08-26T17:42:03.1421083Z 	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:42)
2026-08-26T17:42:03.1421430Z 	at org.sonarsource.scanner.api.internal.JarDownloader.getScannerEngineFiles(JarDownloader.java:58)
2026-08-26T17:42:03.1421751Z 	at org.sonarsource.scanner.api.internal.JarDownloader.download(JarDownloader.java:53)
2026-08-26T17:42:03.1422093Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:76)
2026-08-26T17:42:03.1422395Z 	... 7 more
2026-08-26T17:42:03.1423130Z ##[error]Caused by: javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:128)
	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
2026-08-26T17:42:03.1424102Z Caused by: javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:42:03.1424446Z 	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:128)
2026-08-26T17:42:03.1424739Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
2026-08-26T17:42:03.1425414Z ##[error]at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:264)
2026-08-26T17:42:03.1425946Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:264)
2026-08-26T17:42:03.1426307Z ##[error]at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:259)
2026-08-26T17:42:03.1426725Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:259)
2026-08-26T17:42:03.1427120Z ##[error]at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1329)
2026-08-26T17:42:03.1427546Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1329)
2026-08-26T17:42:03.1428563Z ##[error]at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.onConsumeCertificate(CertificateMessage.java:1204)
	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.consume(CertificateMessage.java:1151)
	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:392)
	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:444)
	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:421)
	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:178)
2026-08-26T17:42:03.1429260Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.onConsumeCertificate(CertificateMessage.java:1204)
2026-08-26T17:42:03.1429504Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.consume(CertificateMessage.java:1151)
2026-08-26T17:42:03.1429714Z 	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:392)
2026-08-26T17:42:03.1429907Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:444)
2026-08-26T17:42:03.1430101Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:421)
2026-08-26T17:42:03.1430294Z 	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:178)
2026-08-26T17:42:03.1431214Z ##[error]at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:164)
	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1152)
	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1063)
	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:402)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connectTls(RealConnection.java:336)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.establishProtocol(RealConnection.java:300)
2026-08-26T17:42:03.1431879Z 	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:164)
2026-08-26T17:42:03.1432069Z 	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1152)
2026-08-26T17:42:03.1432267Z 	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1063)
2026-08-26T17:42:03.1432465Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:402)
2026-08-26T17:42:03.1432688Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connectTls(RealConnection.java:336)
2026-08-26T17:42:03.1432941Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.establishProtocol(RealConnection.java:300)
2026-08-26T17:42:03.1434139Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connect(RealConnection.java:185)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findConnection(ExchangeFinder.java:224)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findHealthyConnection(ExchangeFinder.java:108)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.find(ExchangeFinder.java:88)
2026-08-26T17:42:03.1435029Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connect(RealConnection.java:185)
2026-08-26T17:42:03.1435339Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findConnection(ExchangeFinder.java:224)
2026-08-26T17:42:03.1435601Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findHealthyConnection(ExchangeFinder.java:108)
2026-08-26T17:42:03.1436023Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.find(ExchangeFinder.java:88)
2026-08-26T17:42:03.1436620Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.Transmitter.newExchange(Transmitter.java:169)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ConnectInterceptor.intercept(ConnectInterceptor.java:41)
2026-08-26T17:42:03.1437127Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.Transmitter.newExchange(Transmitter.java:169)
2026-08-26T17:42:03.1437376Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ConnectInterceptor.intercept(ConnectInterceptor.java:41)
2026-08-26T17:42:03.1437812Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:42:03.1438216Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:42:03.1438940Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.cache.CacheInterceptor.intercept(CacheInterceptor.java:94)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:42:03.1439494Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:42:03.1439734Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.cache.CacheInterceptor.intercept(CacheInterceptor.java:94)
2026-08-26T17:42:03.1439975Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:42:03.1440527Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.BridgeInterceptor.intercept(BridgeInterceptor.java:93)
2026-08-26T17:42:03.1441004Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:42:03.1441249Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.BridgeInterceptor.intercept(BridgeInterceptor.java:93)
2026-08-26T17:42:03.1441663Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:42:03.1442064Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:42:03.1443015Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RetryAndFollowUpInterceptor.intercept(RetryAndFollowUpInterceptor.java:88)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.getResponseWithInterceptorChain(RealCall.java:221)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.execute(RealCall.java:81)
2026-08-26T17:42:03.1443931Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RetryAndFollowUpInterceptor.intercept(RetryAndFollowUpInterceptor.java:88)
2026-08-26T17:42:03.1444232Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:42:03.1444471Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:42:03.1444707Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.getResponseWithInterceptorChain(RealCall.java:221)
2026-08-26T17:42:03.1444928Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.execute(RealCall.java:81)
2026-08-26T17:42:03.1445428Z ##[error]at org.sonarsource.scanner.api.internal.ServerConnection.callUrl(ServerConnection.java:115)
	at org.sonarsource.scanner.api.internal.ServerConnection.downloadString(ServerConnection.java:99)
2026-08-26T17:42:03.1445864Z 	at org.sonarsource.scanner.api.internal.ServerConnection.callUrl(ServerConnection.java:115)
2026-08-26T17:42:03.1446113Z 	at org.sonarsource.scanner.api.internal.ServerConnection.downloadString(ServerConnection.java:99)
2026-08-26T17:42:03.1446680Z ##[error]at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:39)
	... 10 more
2026-08-26T17:42:03.1447181Z 	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:39)
2026-08-26T17:42:03.1447345Z 	... 10 more
2026-08-26T17:42:03.1447820Z ##[error]Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:385)
2026-08-26T17:42:03.1448313Z Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:42:03.1448548Z 	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:385)
2026-08-26T17:42:03.1448898Z ##[error]at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:290)
2026-08-26T17:42:03.1449254Z 	at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:290)
2026-08-26T17:42:03.1449951Z ##[error]at java.base/sun.security.validator.Validator.validate(Validator.java:264)
	at java.base/sun.security.ssl.X509TrustManagerImpl.validate(X509TrustManagerImpl.java:321)
	at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:221)
	at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:129)
2026-08-26T17:42:03.1450504Z 	at java.base/sun.security.validator.Validator.validate(Validator.java:264)
2026-08-26T17:42:03.1450704Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.validate(X509TrustManagerImpl.java:321)
2026-08-26T17:42:03.1450915Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:221)
2026-08-26T17:42:03.1451130Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:129)
2026-08-26T17:42:03.1451557Z ##[error]at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1313)
	... 43 more
2026-08-26T17:42:03.1451975Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1313)
2026-08-26T17:42:03.1452220Z 	... 43 more
2026-08-26T17:42:03.1452549Z ##[error]Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:42:03.1452911Z Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:42:03.1453598Z ##[error]at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:141)
	at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:126)
	at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:380)
2026-08-26T17:42:03.1454452Z 	at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:141)
2026-08-26T17:42:03.1454674Z 	at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:126)
2026-08-26T17:42:03.1454884Z 	at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
2026-08-26T17:42:03.1455080Z 	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:380)
2026-08-26T17:42:03.1455351Z ##[error]... 49 more
2026-08-26T17:42:03.1455621Z 	... 49 more
2026-08-26T17:42:03.1602267Z Process returned exit code 1
2026-08-26T17:42:03.1636110Z ##[error]The SonarScanner did not complete successfully
2026-08-26T17:42:03.1636554Z The SonarScanner did not complete successfully
2026-08-26T17:42:03.1636856Z ##[error]14:42:03.163  Post-processing failed. Exit code: 1
2026-08-26T17:42:03.1637458Z 14:42:03.163  Post-processing failed. Exit code: 1
2026-08-26T17:42:03.1721918Z ##[error]The process '/opt/ads-agent/cache-tools/.dotnet//dotnet' failed with exit code 1
2026-08-26T17:42:03.1755168Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 9 out of 10) after 81000 ms
2026-08-26T17:43:24.2892695Z [command]/opt/ads-agent/cache-tools/.dotnet//dotnet /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/SonarScanner.MSBuild.dll end
2026-08-26T17:43:24.3402520Z SonarScanner for MSBuild 5.8
2026-08-26T17:43:24.3402773Z Using the .NET Core version of the Scanner for MSBuild
2026-08-26T17:43:24.3823232Z Post-processing started.
2026-08-26T17:43:24.4667912Z 14:43:24.466  14:43:24.437  /opt/ads-agent/_work/6/.sonarqube/bin/targets/SonarQube.Integration.targets does not exist
2026-08-26T17:43:24.4668311Z 14:43:24.466  14:43:24.466  sonar.verbose=true was specified - setting the log verbosity to 'Debug'
2026-08-26T17:43:24.4668919Z 14:43:24.466  Loading the SonarQube analysis config from /opt/ads-agent/_work/6/.sonarqube/conf/SonarQubeAnalysisConfig.xml
2026-08-26T17:43:24.4669447Z 14:43:24.466  Not running under TeamBuild
2026-08-26T17:43:24.4670266Z 14:43:24.466  Analysis base directory: /opt/ads-agent/_work/6/.sonarqube
2026-08-26T17:43:24.4670748Z Build directory: 
2026-08-26T17:43:24.4671053Z Bin directory: /opt/ads-agent/_work/6/.sonarqube/bin
2026-08-26T17:43:24.4671264Z Config directory: /opt/ads-agent/_work/6/.sonarqube/conf
2026-08-26T17:43:24.4671479Z Output directory: /opt/ads-agent/_work/6/.sonarqube/out
2026-08-26T17:43:24.4671919Z Config file: /opt/ads-agent/_work/6/.sonarqube/conf/SonarQubeAnalysisConfig.xml
2026-08-26T17:43:24.4681334Z 14:43:24.467  Generating SonarQube project properties file to /opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties
2026-08-26T17:43:24.4857164Z 14:43:24.485  Setting analysis property: sonar.visualstudio.enable=false
2026-08-26T17:43:24.5042911Z 14:43:24.503  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/0/Issues.json
2026-08-26T17:43:24.5079725Z 14:43:24.507  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/1/Issues.json
2026-08-26T17:43:24.5114032Z 14:43:24.511  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/2/Issues.json
2026-08-26T17:43:24.5220603Z 14:43:24.521  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/3/Issues.json
2026-08-26T17:43:24.5269232Z 14:43:24.526  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/4/Issues.json
2026-08-26T17:43:24.5308086Z 14:43:24.53  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/5/Issues.json
2026-08-26T17:43:24.5320865Z 14:43:24.531  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/6/Issues.json
2026-08-26T17:43:24.5330499Z 14:43:24.532  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/7/Issues.json
2026-08-26T17:43:24.5433545Z 14:43:24.542  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/8/Issues.json
2026-08-26T17:43:24.5534830Z 14:43:24.553  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/9/Issues.json
2026-08-26T17:43:24.5565840Z 14:43:24.556  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/10/Issues.json
2026-08-26T17:43:24.5706458Z 14:43:24.57  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/11/Issues.json
2026-08-26T17:43:24.5730501Z 14:43:24.572  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/12/Issues.json
2026-08-26T17:43:24.5755889Z 14:43:24.575  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/13/Issues.json
2026-08-26T17:43:24.5764512Z 14:43:24.576  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/14/Issues.json
2026-08-26T17:43:24.5845466Z 14:43:24.584  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/15/Issues.json
2026-08-26T17:43:24.5871811Z 14:43:24.586  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/16/Issues.json
2026-08-26T17:43:24.5899164Z 14:43:24.589  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/17/Issues.json
2026-08-26T17:43:24.5909501Z 14:43:24.59  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/18/Issues.json
2026-08-26T17:43:24.5918783Z 14:43:24.591  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/19/Issues.json
2026-08-26T17:43:24.5922592Z 14:43:24.592  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/20/Issues.json
2026-08-26T17:43:24.6003265Z 14:43:24.599  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/21/Issues.json
2026-08-26T17:43:24.6026789Z 14:43:24.602  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/22/Issues.json
2026-08-26T17:43:24.6050805Z 14:43:24.604  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/23/Issues.json
2026-08-26T17:43:24.6060299Z 14:43:24.605  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/24/Issues.json
2026-08-26T17:43:24.6068440Z 14:43:24.606  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/25/Issues.json
2026-08-26T17:43:24.6071937Z 14:43:24.607  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/26/Issues.json
2026-08-26T17:43:24.6185331Z 14:43:24.618  Using longest common projects path as a base directory: '/opt/ads-agent/_work/6/s'.
2026-08-26T17:43:24.6290723Z 14:43:24.628  File was referenced by the following projects: '/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/TesteSimovBatch.csproj', '/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/TesteSimovBatch.csproj'.
2026-08-26T17:43:24.6391281Z 14:43:24.633  Dumping content of sonar-project.properties
2026-08-26T17:43:24.6391579Z ------------------------------------------------------------------------
2026-08-26T17:43:24.6391787Z sonar.projectKey=SIMOV-imoveiscaixa-batch
2026-08-26T17:43:24.6392002Z sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar
2026-08-26T17:43:24.6395771Z sonar.projectBaseDir=/opt/ads-agent/_work/6/s
2026-08-26T17:43:24.6395930Z 
2026-08-26T17:43:24.6396211Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectKey=SIMOV-imoveiscaixa-batch:0B395246-F58A-479C-B0B1-C6A6045C6FD3
2026-08-26T17:43:24.6396483Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectName=Simov.Core
2026-08-26T17:43:24.6396752Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:43:24.6396987Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.sourceEncoding=utf-8
2026-08-26T17:43:24.6397198Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.sources=\
2026-08-26T17:43:24.6397431Z "/opt/ads-agent/_work/6/s/src/Simov.Core/AutenticacaoSso/AutenticacarSso.cs",\
2026-08-26T17:43:24.6397658Z "/opt/ads-agent/_work/6/s/src/Simov.Core/AutenticacaoSso/IAutenticacarSso.cs",\
2026-08-26T17:43:24.6397870Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Data/IBaseRepository.cs",\
2026-08-26T17:43:24.6398078Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Data/IUnitOfWork.cs",\
2026-08-26T17:43:24.6398291Z "/opt/ads-agent/_work/6/s/src/Simov.Core/DomainObjects/Entity.cs",\
2026-08-26T17:43:24.6398505Z "/opt/ads-agent/_work/6/s/src/Simov.Core/DomainObjects/IAggregateRoot.cs",\
2026-08-26T17:43:24.6398738Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/ApplicationException.cs",\
2026-08-26T17:43:24.6398973Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/CancellationException.cs",\
2026-08-26T17:43:24.6399198Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/EntityValidationException.cs",\
2026-08-26T17:43:24.6399420Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/GenericException.cs",\
2026-08-26T17:43:24.6399639Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/NotFoundException.cs",\
2026-08-26T17:43:24.6399856Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/ProcessamentoException.cs",\
2026-08-26T17:43:24.6400079Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/RelatedAggregateException.cs",\
2026-08-26T17:43:24.6400300Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/UnauthorizedException.cs",\
2026-08-26T17:43:24.6400515Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Logging/LoggerExtensions.cs",\
2026-08-26T17:43:24.6400733Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siico/ApiSiicoRestPrivado.cs",\
2026-08-26T17:43:24.6400951Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siico/ApiSiicoRestPublico.cs",\
2026-08-26T17:43:24.6401176Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siiso/ApiSiisoRestPublico.cs",\
2026-08-26T17:43:24.6401390Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/DadosDto.cs",\
2026-08-26T17:43:24.6401615Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/DadosSimilDto.cs",\
2026-08-26T17:43:24.6402077Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/FotosDto.cs",\
2026-08-26T17:43:24.6402297Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/ListaFotoDto.cs",\
2026-08-26T17:43:24.6402510Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/ISOAPWeb.cs",\
2026-08-26T17:43:24.6402734Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/RobustSoapDeserializer.cs",\
2026-08-26T17:43:24.6402951Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/SOAPWeb.cs",\
2026-08-26T17:43:24.6403163Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/ResponseGenerico.cs",\
2026-08-26T17:43:24.6403448Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/BairroDetalhadoSiico.cs",\
2026-08-26T17:43:24.6403744Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/BairroSiico.cs",\
2026-08-26T17:43:24.6403971Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/CepSiico.cs",\
2026-08-26T17:43:24.6404194Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/LocalidadeSiico.cs",\
2026-08-26T17:43:24.6404419Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioCompletoSiico.cs",\
2026-08-26T17:43:24.6404648Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioParcialSiico.cs",\
2026-08-26T17:43:24.6404871Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioSiico.cs",\
2026-08-26T17:43:24.6405095Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/TipoLogradouroSiico.cs",\
2026-08-26T17:43:24.6405326Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/UnidadeCaixa.cs",\
2026-08-26T17:43:24.6405548Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/UnidadeFederacaoSiico.cs",\
2026-08-26T17:43:24.6405776Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/EnderecoPessoaSiiso.cs",\
2026-08-26T17:43:24.6406004Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/LocalidadeNascimentoSiiso.cs",\
2026-08-26T17:43:24.6406227Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/PessoaSiiso.cs",\
2026-08-26T17:43:24.6406457Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siico/IApiSiicoRestPrivado.cs",\
2026-08-26T17:43:24.6406692Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siico/IApiSiicoRestPublico.cs",\
2026-08-26T17:43:24.6407143Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siiso/IApiSiisoRestPublico.cs"
2026-08-26T17:43:24.6407228Z 
2026-08-26T17:43:24.6407421Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:43:24.6407615Z "/opt/ads-agent/_work/6/.sonarqube/out/0"
2026-08-26T17:43:24.6407831Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:43:24.6408039Z "/opt/ads-agent/_work/6/.sonarqube/out/0/Issues.json"
2026-08-26T17:43:24.6408102Z 
2026-08-26T17:43:24.6408347Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod0
2026-08-26T17:43:24.6408809Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectKey=SIMOV-imoveiscaixa-batch:5E55366D-25CB-4B0F-BAF4-738003A18ED2
2026-08-26T17:43:24.6409165Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectName=Simov.Domain
2026-08-26T17:43:24.6409423Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:43:24.6409673Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.sourceEncoding=utf-8
2026-08-26T17:43:24.6409886Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.sources=\
2026-08-26T17:43:24.6410133Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AgrupamentoVendaImovel.cs",\
2026-08-26T17:43:24.6410360Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaArquivoLote.cs",\
2026-08-26T17:43:24.6410593Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaFotoImovel.cs",\
2026-08-26T17:43:24.6410816Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaFotoLote.cs",\
2026-08-26T17:43:24.6411203Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaUsuario.cs",\
2026-08-26T17:43:24.6411638Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AvaliacaoImovel.cs",\
2026-08-26T17:43:24.6411866Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/ComodoImovel.cs",\
2026-08-26T17:43:24.6412089Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/ControleProcessamento.cs",\
2026-08-26T17:43:24.6412303Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/DadoContabil.cs",\
2026-08-26T17:43:24.6412516Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/FotoImovel.cs",\
2026-08-26T17:43:24.6412745Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoAgrupamentoVendaImovel.cs",\
2026-08-26T17:43:24.6412974Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoAvaliacaoImovel.cs",\
2026-08-26T17:43:24.6413250Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoComodoImovel.cs",\
2026-08-26T17:43:24.6413472Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoDadoContabil.cs",\
2026-08-26T17:43:24.6413812Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoImovel.cs",\
2026-08-26T17:43:24.6414059Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoMatriculaImovel.cs",\
2026-08-26T17:43:24.6414315Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/Imovel.cs",\
2026-08-26T17:43:24.6414650Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/MatriculaImovel.cs",\
2026-08-26T17:43:24.6414890Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/MensagemControleProcessamento.cs",\
2026-08-26T17:43:24.6415123Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/RotinaProcessamento.cs",\
2026-08-26T17:43:24.6415346Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/ClassificacaoImovelEnum.cs",\
2026-08-26T17:43:24.6415572Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/EstadoConservacaoEnum.cs",\
2026-08-26T17:43:24.6415798Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/FuncionalidadeSistemaEnum.cs",\
2026-08-26T17:43:24.6416297Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/IcAcaoSistemaEnum.cs",\
2026-08-26T17:43:24.6416541Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/IcShortEnum.cs",\
2026-08-26T17:43:24.6416761Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/MotivoExclusaoEnum.cs",\
2026-08-26T17:43:24.6416994Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/OrgaoProprietarioImovelEnum.cs",\
2026-08-26T17:43:24.6417220Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/OrigemImovelEnum.cs",\
2026-08-26T17:43:24.6417453Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/ResultadoMensagemProcessamentoEnum.cs",\
2026-08-26T17:43:24.6417685Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/RotinaProcessamentoEnum.cs",\
2026-08-26T17:43:24.6417904Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/SituacaoImovelEnum.cs",\
2026-08-26T17:43:24.6418130Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/SituacaoProcessamentoEnum.cs",\
2026-08-26T17:43:24.6418350Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoCampoEnum.cs",\
2026-08-26T17:43:24.6418564Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoComodoEnum.cs",\
2026-08-26T17:43:24.6418781Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoImovelEnum.cs",\
2026-08-26T17:43:24.6418998Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoMatriculaEnum.cs",\
2026-08-26T17:43:24.6419236Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAgrupamentoVendaImovelRepository.cs",\
2026-08-26T17:43:24.6419481Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaArquivoLoteRepository.cs",\
2026-08-26T17:43:24.6419732Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaFotoImovelRepository.cs",\
2026-08-26T17:43:24.6419977Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaFotoLoteRepository.cs",\
2026-08-26T17:43:24.6420217Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaUsuarioRepository.cs",\
2026-08-26T17:43:24.6420451Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAvaliacaoImovelRepository.cs",\
2026-08-26T17:43:24.6420688Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IComodoImovelRepository.cs",\
2026-08-26T17:43:24.6420985Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IControleProcessamentoRepository.cs",\
2026-08-26T17:43:24.6421220Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IDadoContabilRepository.cs",\
2026-08-26T17:43:24.6421448Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IFotoImovelRepository.cs",\
2026-08-26T17:43:24.6421672Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IGeradorHistorico.cs",\
2026-08-26T17:43:24.6421900Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IImovelRepository.cs",\
2026-08-26T17:43:24.6422128Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IMatriculaImovelRepository.cs",\
2026-08-26T17:43:24.6422415Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IMensagemControleProcessamentoRepository.cs",\
2026-08-26T17:43:24.6422662Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IRotinaProcessamentoRepository.cs",\
2026-08-26T17:43:24.6422890Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/BaseArquivoLayout.cs",\
2026-08-26T17:43:24.6423120Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/SiaciLayout.cs",\
2026-08-26T17:43:24.6423331Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/SiopiLayout.cs"
2026-08-26T17:43:24.6423399Z 
2026-08-26T17:43:24.6423595Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:43:24.6423859Z "/opt/ads-agent/_work/6/.sonarqube/out/1"
2026-08-26T17:43:24.6424074Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:43:24.6424274Z "/opt/ads-agent/_work/6/.sonarqube/out/1/Issues.json"
2026-08-26T17:43:24.6424344Z 
2026-08-26T17:43:24.6424566Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod1
2026-08-26T17:43:24.6424884Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectKey=SIMOV-imoveiscaixa-batch:0847F1F3-B5DA-4FC3-8EEF-882D75A674FD
2026-08-26T17:43:24.6425154Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectName=Simov.Application
2026-08-26T17:43:24.6425417Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:43:24.6425654Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.sourceEncoding=utf-8
2026-08-26T17:43:24.6425859Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.sources=\
2026-08-26T17:43:24.6426080Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Contexts/FileProcessingContext.cs",\
2026-08-26T17:43:24.6426314Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Contexts/SiicoCallCounterContext.cs",\
2026-08-26T17:43:24.6426543Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/AvaliacaoImovelDto.cs",\
2026-08-26T17:43:24.6426760Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/DadoContabilDto.cs",\
2026-08-26T17:43:24.6426975Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/EnderecoDto.cs",\
2026-08-26T17:43:24.6427183Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/ImovelDto.cs",\
2026-08-26T17:43:24.6427400Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/MatriculaImovelDto.cs",\
2026-08-26T17:43:24.6427625Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/MunicipioDto.cs",\
2026-08-26T17:43:24.6427839Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/SiaciDDQDto.cs",\
2026-08-26T17:43:24.6428055Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/TipoLogradouroDto.cs",\
2026-08-26T17:43:24.6428286Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ICargaFotoImovelService.cs",\
2026-08-26T17:43:24.6428523Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ICargaImovelService.cs",\
2026-08-26T17:43:24.6428752Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IFileService.cs",\
2026-08-26T17:43:24.6428982Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSiaciUseCase.cs",\
2026-08-26T17:43:24.6429222Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSimilFotoUseCase.cs",\
2026-08-26T17:43:24.6429456Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSimilUseCase.cs",\
2026-08-26T17:43:24.6429744Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSiopiUseCase.cs",\
2026-08-26T17:43:24.6429969Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ILeituraService.cs",\
2026-08-26T17:43:24.6430205Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ILogProcessamentoService.cs",\
2026-08-26T17:43:24.6430436Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IMapperDataService.cs",\
2026-08-26T17:43:24.6430659Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ISiaciDDQUseCase.cs",\
2026-08-26T17:43:24.6430888Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IWorkerImovelService.cs",\
2026-08-26T17:43:24.6431163Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/CargaImovelService.cs",\
2026-08-26T17:43:24.6431381Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/FileService.cs",\
2026-08-26T17:43:24.6431603Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/LeituraService.cs",\
2026-08-26T17:43:24.6431827Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/LogProcessamentoService.cs",\
2026-08-26T17:43:24.6432053Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/MapperDataService.cs",\
2026-08-26T17:43:24.6432277Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/WorkerImovelService.cs",\
2026-08-26T17:43:24.6432500Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSiaciUseCase.cs",\
2026-08-26T17:43:24.6432727Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSimilFotoUseCase.cs",\
2026-08-26T17:43:24.6432951Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSimilUseCase.cs",\
2026-08-26T17:43:24.6433172Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSiopiUseCase.cs",\
2026-08-26T17:43:24.6433394Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/SiaciDDQUseCase.cs"
2026-08-26T17:43:24.6433469Z 
2026-08-26T17:43:24.6433715Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:43:24.6433923Z "/opt/ads-agent/_work/6/.sonarqube/out/2"
2026-08-26T17:43:24.6434138Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:43:24.6434343Z "/opt/ads-agent/_work/6/.sonarqube/out/2/Issues.json"
2026-08-26T17:43:24.6434405Z 
2026-08-26T17:43:24.6434632Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod2
2026-08-26T17:43:24.6434935Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectKey=SIMOV-imoveiscaixa-batch:D745E52F-7A66-4C38-B30D-3A27EA75CCCE
2026-08-26T17:43:24.6435193Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectName=Simov.Core
2026-08-26T17:43:24.6435450Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:43:24.6435683Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.sourceEncoding=utf-8
2026-08-26T17:43:24.6435887Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.sources=\
2026-08-26T17:43:24.6435951Z 
2026-08-26T17:43:24.6435985Z 
2026-08-26T17:43:24.6436175Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:43:24.6436370Z "/opt/ads-agent/_work/6/.sonarqube/out/3"
2026-08-26T17:43:24.6436641Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:43:24.6436852Z "/opt/ads-agent/_work/6/.sonarqube/out/3/Issues.json"
2026-08-26T17:43:24.6436916Z 
2026-08-26T17:43:24.6437137Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod3
2026-08-26T17:43:24.6437431Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectKey=SIMOV-imoveiscaixa-batch:FBCB055E-203B-4979-BB94-B02AE276DE0B
2026-08-26T17:43:24.6437684Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectName=Simov.Domain
2026-08-26T17:43:24.6437932Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:43:24.6438160Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.sourceEncoding=utf-8
2026-08-26T17:43:24.6438365Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.sources=\
2026-08-26T17:43:24.6438527Z 
2026-08-26T17:43:24.6438581Z 
2026-08-26T17:43:24.6438871Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:43:24.6439063Z "/opt/ads-agent/_work/6/.sonarqube/out/4"
2026-08-26T17:43:24.6439274Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:43:24.6439472Z "/opt/ads-agent/_work/6/.sonarqube/out/4/Issues.json"
2026-08-26T17:43:24.6439544Z 
2026-08-26T17:43:24.6439764Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod4
2026-08-26T17:43:24.6440064Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectKey=SIMOV-imoveiscaixa-batch:D6E1F89D-8BFA-426E-BC94-C1182DBD0621
2026-08-26T17:43:24.6440375Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectName=Simov.Application
2026-08-26T17:43:24.6440634Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:43:24.6440872Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.sourceEncoding=utf-8
2026-08-26T17:43:24.6441080Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.sources=\
2026-08-26T17:43:24.6441151Z 
2026-08-26T17:43:24.6441186Z 
2026-08-26T17:43:24.6441373Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:43:24.6441561Z "/opt/ads-agent/_work/6/.sonarqube/out/5"
2026-08-26T17:43:24.6441764Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:43:24.6441964Z "/opt/ads-agent/_work/6/.sonarqube/out/5/Issues.json"
2026-08-26T17:43:24.6442030Z 
2026-08-26T17:43:24.6442249Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod5
2026-08-26T17:43:24.6442552Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectKey=SIMOV-imoveiscaixa-batch:AD78E470-A67C-4901-A53F-E3D7D40350CD
2026-08-26T17:43:24.6442816Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:43:24.6443076Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:43:24.6443310Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.sourceEncoding=utf-8
2026-08-26T17:43:24.6443513Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.sources=\
2026-08-26T17:43:24.6443830Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Common/BaseRepository.cs",\
2026-08-26T17:43:24.6444058Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Common/UnitOfWork.cs",\
2026-08-26T17:43:24.6444289Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Interceptor/HistoricosInterceptor.cs",\
2026-08-26T17:43:24.6444539Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AgrupamentoVendaImovelConfiguration.cs",\
2026-08-26T17:43:24.6444794Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaArquivoLoteConfiguration.cs",\
2026-08-26T17:43:24.6445040Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaFotoImovelConfiguration.cs",\
2026-08-26T17:43:24.6445366Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaFotoLoteConfiguration.cs",\
2026-08-26T17:43:24.6445735Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaUsuarioConfiguration.cs",\
2026-08-26T17:43:24.6446002Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AvaliacaoImovelConfiguration.cs",\
2026-08-26T17:43:24.6447203Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ComodoImovelConfiguration.cs",\
2026-08-26T17:43:24.6447518Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ControleProcessamentoConfiguration.cs",\
2026-08-26T17:43:24.6447765Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/DadoContabilConfiguration.cs",\
2026-08-26T17:43:24.6448016Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/FotoImovelConfiguration.cs",\
2026-08-26T17:43:24.6448270Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoAgrupamentoVendaImovelConfiguration.cs",\
2026-08-26T17:43:24.6448536Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoAvaliacaoImovelConfiguration.cs",\
2026-08-26T17:43:24.6448998Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoComodoImovelConfiguration.cs",\
2026-08-26T17:43:24.6449246Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoDadoContabilConfiguration.cs",\
2026-08-26T17:43:24.6449489Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoImovelConfiguration.cs",\
2026-08-26T17:43:24.6449739Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoMatriculaImovelConfiguration.cs",\
2026-08-26T17:43:24.6449984Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ImovelConfiguration.cs",\
2026-08-26T17:43:24.6450284Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/MatriculaImovelConfiguration.cs",\
2026-08-26T17:43:24.6450538Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/MensagemControleProcessamentoConfiguration.cs",\
2026-08-26T17:43:24.6450789Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/RotinaProcessamentoConfiguration.cs",\
2026-08-26T17:43:24.6451039Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AgrupamentoVendaImovelRepository.cs",\
2026-08-26T17:43:24.6451289Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaArquivoLoteRepository.cs",\
2026-08-26T17:43:24.6451535Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaFotoImovelRepository.cs",\
2026-08-26T17:43:24.6451778Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaFotoLoteRepository.cs",\
2026-08-26T17:43:24.6452023Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaUsuarioRepository.cs",\
2026-08-26T17:43:24.6452267Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AvaliacaoImovelRepository.cs",\
2026-08-26T17:43:24.6452509Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ComodoImovelRepository.cs",\
2026-08-26T17:43:24.6452753Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ControleProcessamentoRepository.cs",\
2026-08-26T17:43:24.6452997Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/DadoContabilRepository.cs",\
2026-08-26T17:43:24.6453302Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/FotoImovelRepository.cs",\
2026-08-26T17:43:24.6453540Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ImovelRepository.cs",\
2026-08-26T17:43:24.6453973Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/MatriculaImovelRepository.cs",\
2026-08-26T17:43:24.6454239Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/MensagemControleProcessamentoRepository.cs",\
2026-08-26T17:43:24.6454498Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/RotinaProcessamentoRepository.cs",\
2026-08-26T17:43:24.6454723Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/SimovDbContext.cs"
2026-08-26T17:43:24.6454793Z 
2026-08-26T17:43:24.6454990Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:43:24.6455185Z "/opt/ads-agent/_work/6/.sonarqube/out/6"
2026-08-26T17:43:24.6455398Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:43:24.6455689Z "/opt/ads-agent/_work/6/.sonarqube/out/6/Issues.json"
2026-08-26T17:43:24.6455778Z 
2026-08-26T17:43:24.6456109Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod6
2026-08-26T17:43:24.6456429Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectKey=SIMOV-imoveiscaixa-batch:B904AD47-4763-413C-9324-7889FD92EFA6
2026-08-26T17:43:24.6456694Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectName=Simov.Batch
2026-08-26T17:43:24.6456941Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:43:24.6457171Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.sourceEncoding=utf-8
2026-08-26T17:43:24.6457376Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.sources=\
2026-08-26T17:43:24.6457598Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/AddHeadersHttpClient.cs",\
2026-08-26T17:43:24.6457890Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/ConnectionsConfiguration.cs",\
2026-08-26T17:43:24.6458133Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/HttpClientConfiguration.cs",\
2026-08-26T17:43:24.6458360Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/IApiSiisoRestPrivado.cs",\
2026-08-26T17:43:24.6458587Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/UseCasesConfiguration.cs",\
2026-08-26T17:43:24.6458808Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderImoveisSiaci.cs",\
2026-08-26T17:43:24.6459026Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderImoveisSiopi.cs",\
2026-08-26T17:43:24.6459375Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderLeilaoSiaciDDQ.cs",\
2026-08-26T17:43:24.6459653Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Program.cs",\
2026-08-26T17:43:24.6459911Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Workers/WorkerFotoImoveisSimil.cs",\
2026-08-26T17:43:24.6460136Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Workers/WorkerImoveisSimil.cs",\
2026-08-26T17:43:24.6460369Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/Simov.Batch.GlobalUsings.g.cs",\
2026-08-26T17:43:24.6460632Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/.NETCoreApp,Version=v8.0.AssemblyAttributes.cs",\
2026-08-26T17:43:24.6460885Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/Simov.Batch.AssemblyInfo.cs",\
2026-08-26T17:43:24.6461112Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/appsettings.Development.json",\
2026-08-26T17:43:24.6461318Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/appsettings.json",\
2026-08-26T17:43:24.6461530Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Properties/launchSettings.json",\
2026-08-26T17:43:24.6461755Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/apphost"
2026-08-26T17:43:24.6461827Z 
2026-08-26T17:43:24.6462020Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:43:24.6462217Z "/opt/ads-agent/_work/6/.sonarqube/out/7"
2026-08-26T17:43:24.6462427Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:43:24.6462629Z "/opt/ads-agent/_work/6/.sonarqube/out/7/Issues.json"
2026-08-26T17:43:24.6462695Z 
2026-08-26T17:43:24.6462916Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod7
2026-08-26T17:43:24.6463337Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectKey=SIMOV-imoveiscaixa-batch:6679F22B-144A-4C59-A28C-2A87F31E3915
2026-08-26T17:43:24.6463744Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectName=Simov.Core
2026-08-26T17:43:24.6464014Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:43:24.6464254Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.sourceEncoding=utf-8
2026-08-26T17:43:24.6464463Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.sources=\
2026-08-26T17:43:24.6464529Z 
2026-08-26T17:43:24.6464573Z 
2026-08-26T17:43:24.6464777Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:43:24.6464972Z "/opt/ads-agent/_work/6/.sonarqube/out/8"
2026-08-26T17:43:24.6465182Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:43:24.6465384Z "/opt/ads-agent/_work/6/.sonarqube/out/8/Issues.json"
2026-08-26T17:43:24.6465443Z 
2026-08-26T17:43:24.6465667Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod8
2026-08-26T17:43:24.6465974Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectKey=SIMOV-imoveiscaixa-batch:EC78B0BC-170C-482C-867B-C5402B449403
2026-08-26T17:43:24.6466229Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectName=Simov.Core
2026-08-26T17:43:24.6466486Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:43:24.6466717Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.sourceEncoding=utf-8
2026-08-26T17:43:24.6466920Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.sources=\
2026-08-26T17:43:24.6467041Z 
2026-08-26T17:43:24.6467076Z 
2026-08-26T17:43:24.6467271Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:43:24.6467473Z "/opt/ads-agent/_work/6/.sonarqube/out/9"
2026-08-26T17:43:24.6467682Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:43:24.6467880Z "/opt/ads-agent/_work/6/.sonarqube/out/9/Issues.json"
2026-08-26T17:43:24.6467942Z 
2026-08-26T17:43:24.6468165Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod9
2026-08-26T17:43:24.6468470Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectKey=SIMOV-imoveiscaixa-batch:1B2C05E0-E98F-477C-931D-923BBE79AE4E
2026-08-26T17:43:24.6468760Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectName=Simov.Domain
2026-08-26T17:43:24.6469010Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:43:24.6469237Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.sourceEncoding=utf-8
2026-08-26T17:43:24.6469444Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.sources=\
2026-08-26T17:43:24.6469519Z 
2026-08-26T17:43:24.6469552Z 
2026-08-26T17:43:24.6469744Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:43:24.6469937Z "/opt/ads-agent/_work/6/.sonarqube/out/10"
2026-08-26T17:43:24.6470145Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:43:24.6470350Z "/opt/ads-agent/_work/6/.sonarqube/out/10/Issues.json"
2026-08-26T17:43:24.6470420Z 
2026-08-26T17:43:24.6470643Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod10
2026-08-26T17:43:24.6470955Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectKey=SIMOV-imoveiscaixa-batch:A180ED2D-1521-44A6-B6EA-5DDEC55D2C17
2026-08-26T17:43:24.6471219Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectName=Simov.Core
2026-08-26T17:43:24.6471472Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:43:24.6471710Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.sourceEncoding=utf-8
2026-08-26T17:43:24.6471919Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.sources=\
2026-08-26T17:43:24.6471993Z 
2026-08-26T17:43:24.6472029Z 
2026-08-26T17:43:24.6472220Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:43:24.6472411Z "/opt/ads-agent/_work/6/.sonarqube/out/11"
2026-08-26T17:43:24.6472623Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:43:24.6472829Z "/opt/ads-agent/_work/6/.sonarqube/out/11/Issues.json"
2026-08-26T17:43:24.6472898Z 
2026-08-26T17:43:24.6473133Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod11
2026-08-26T17:43:24.6473433Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectKey=SIMOV-imoveiscaixa-batch:A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E
2026-08-26T17:43:24.6473804Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectName=Simov.Domain
2026-08-26T17:43:24.6474077Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:43:24.6474306Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.sourceEncoding=utf-8
2026-08-26T17:43:24.6474507Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.sources=\
2026-08-26T17:43:24.6474571Z 
2026-08-26T17:43:24.6474614Z 
2026-08-26T17:43:24.6474801Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:43:24.6474997Z "/opt/ads-agent/_work/6/.sonarqube/out/12"
2026-08-26T17:43:24.6475206Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:43:24.6475412Z "/opt/ads-agent/_work/6/.sonarqube/out/12/Issues.json"
2026-08-26T17:43:24.6475472Z 
2026-08-26T17:43:24.6475692Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod12
2026-08-26T17:43:24.6475996Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectKey=SIMOV-imoveiscaixa-batch:00300450-28FA-4EA9-8A96-181ED44DCA26
2026-08-26T17:43:24.6476318Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectName=Simov.Application
2026-08-26T17:43:24.6476581Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:43:24.6476819Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.sourceEncoding=utf-8
2026-08-26T17:43:24.6477026Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.sources=\
2026-08-26T17:43:24.6477091Z 
2026-08-26T17:43:24.6477133Z 
2026-08-26T17:43:24.6477326Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:43:24.6477518Z "/opt/ads-agent/_work/6/.sonarqube/out/13"
2026-08-26T17:43:24.6477812Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:43:24.6478020Z "/opt/ads-agent/_work/6/.sonarqube/out/13/Issues.json"
2026-08-26T17:43:24.6478083Z 
2026-08-26T17:43:24.6478311Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod13
2026-08-26T17:43:24.6478625Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectKey=SIMOV-imoveiscaixa-batch:1393E257-1007-43DE-B94C-0B0508C0B309
2026-08-26T17:43:24.6478891Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:43:24.6479148Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:43:24.6479383Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.sourceEncoding=utf-8
2026-08-26T17:43:24.6479586Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.sources=\
2026-08-26T17:43:24.6479659Z 
2026-08-26T17:43:24.6479694Z 
2026-08-26T17:43:24.6479883Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:43:24.6480078Z "/opt/ads-agent/_work/6/.sonarqube/out/14"
2026-08-26T17:43:24.6480286Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:43:24.6480493Z "/opt/ads-agent/_work/6/.sonarqube/out/14/Issues.json"
2026-08-26T17:43:24.6480566Z 
2026-08-26T17:43:24.6480794Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod14
2026-08-26T17:43:24.6481099Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectKey=SIMOV-imoveiscaixa-batch:5BE00443-BD63-4C9F-A707-406F2AC94762
2026-08-26T17:43:24.6481355Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectName=Simov.Core
2026-08-26T17:43:24.6481602Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:43:24.6481836Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.sourceEncoding=utf-8
2026-08-26T17:43:24.6482043Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.sources=\
2026-08-26T17:43:24.6482118Z 
2026-08-26T17:43:24.6482153Z 
2026-08-26T17:43:24.6482341Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:43:24.6482537Z "/opt/ads-agent/_work/6/.sonarqube/out/15"
2026-08-26T17:43:24.6482753Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:43:24.6482964Z "/opt/ads-agent/_work/6/.sonarqube/out/15/Issues.json"
2026-08-26T17:43:24.6483031Z 
2026-08-26T17:43:24.6483262Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod15
2026-08-26T17:43:24.6483568Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectKey=SIMOV-imoveiscaixa-batch:A79CA783-37A2-49D3-B56C-D9102F046AF9
2026-08-26T17:43:24.6483924Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectName=Simov.Domain
2026-08-26T17:43:24.6484177Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:43:24.6484409Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.sourceEncoding=utf-8
2026-08-26T17:43:24.6484620Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.sources=\
2026-08-26T17:43:24.6484685Z 
2026-08-26T17:43:24.6484731Z 
2026-08-26T17:43:24.6484923Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:43:24.6485117Z "/opt/ads-agent/_work/6/.sonarqube/out/16"
2026-08-26T17:43:24.6485378Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:43:24.6485580Z "/opt/ads-agent/_work/6/.sonarqube/out/16/Issues.json"
2026-08-26T17:43:24.6485641Z 
2026-08-26T17:43:24.6485872Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod16
2026-08-26T17:43:24.6486174Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectKey=SIMOV-imoveiscaixa-batch:51ABFD24-E14F-4155-B9D7-CDBD0E536AAB
2026-08-26T17:43:24.6486447Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectName=Simov.Application
2026-08-26T17:43:24.6486711Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:43:24.6486991Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.sourceEncoding=utf-8
2026-08-26T17:43:24.6487207Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.sources=\
2026-08-26T17:43:24.6487274Z 
2026-08-26T17:43:24.6487316Z 
2026-08-26T17:43:24.6487510Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:43:24.6487707Z "/opt/ads-agent/_work/6/.sonarqube/out/17"
2026-08-26T17:43:24.6487923Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:43:24.6488129Z "/opt/ads-agent/_work/6/.sonarqube/out/17/Issues.json"
2026-08-26T17:43:24.6488193Z 
2026-08-26T17:43:24.6488420Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod17
2026-08-26T17:43:24.6488729Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectKey=SIMOV-imoveiscaixa-batch:F2842708-9CF5-4649-B3A8-6D39E5E01B77
2026-08-26T17:43:24.6488994Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:43:24.6489262Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:43:24.6489499Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.sourceEncoding=utf-8
2026-08-26T17:43:24.6489709Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.sources=\
2026-08-26T17:43:24.6489776Z 
2026-08-26T17:43:24.6489810Z 
2026-08-26T17:43:24.6490000Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:43:24.6490192Z "/opt/ads-agent/_work/6/.sonarqube/out/18"
2026-08-26T17:43:24.6490399Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:43:24.6490606Z "/opt/ads-agent/_work/6/.sonarqube/out/18/Issues.json"
2026-08-26T17:43:24.6490671Z 
2026-08-26T17:43:24.6490893Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod18
2026-08-26T17:43:24.6491197Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectKey=SIMOV-imoveiscaixa-batch:3C101C3B-D8C0-461B-B65B-B87A6F75F210
2026-08-26T17:43:24.6491459Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectName=Simov.Batch
2026-08-26T17:43:24.6491711Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:43:24.6491946Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.sourceEncoding=utf-8
2026-08-26T17:43:24.6492157Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.sources=\
2026-08-26T17:43:24.6492228Z 
2026-08-26T17:43:24.6492262Z 
2026-08-26T17:43:24.6492453Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:43:24.6492648Z "/opt/ads-agent/_work/6/.sonarqube/out/19"
2026-08-26T17:43:24.6492860Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:43:24.6493065Z "/opt/ads-agent/_work/6/.sonarqube/out/19/Issues.json"
2026-08-26T17:43:24.6493134Z 
2026-08-26T17:43:24.6493358Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod19
2026-08-26T17:43:24.6493717Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectKey=SIMOV-imoveiscaixa-batch:4E341BE0-BD46-427C-8912-6319C41C89BC
2026-08-26T17:43:24.6494005Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectName=TesteSimovBatch
2026-08-26T17:43:24.6494271Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/tests/TesteSimovBatch
2026-08-26T17:43:24.6494576Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.sourceEncoding=utf-8
2026-08-26T17:43:24.6494783Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.sources=
2026-08-26T17:43:24.6494987Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.tests=\
2026-08-26T17:43:24.6495224Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/AvaliacaoImovelDtoTests.cs",\
2026-08-26T17:43:24.6495490Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/DadoContabilDtoTests.cs",\
2026-08-26T17:43:24.6495856Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/ImovelDtoTests.cs",\
2026-08-26T17:43:24.6496162Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/MatriculaImovelDtoTests.cs",\
2026-08-26T17:43:24.6496417Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/CargaImovelServiceTests.cs",\
2026-08-26T17:43:24.6496738Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/FileServiceTests.cs",\
2026-08-26T17:43:24.6496994Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/LeituraSiaciServiceTests.cs",\
2026-08-26T17:43:24.6497251Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/LogProcessamentoServiceTests.cs",\
2026-08-26T17:43:24.6497506Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/MapperDataServiceTests.cs",\
2026-08-26T17:43:24.6497754Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/WorkerImovelServiceTests.cs",\
2026-08-26T17:43:24.6498014Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSiaciPreCadastroUseCaseTests.cs",\
2026-08-26T17:43:24.6498276Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSimilFotoUseCaseTests.cs",\
2026-08-26T17:43:24.6498530Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSimilUseCaseTests.cs",\
2026-08-26T17:43:24.6498784Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSiopiUseCaseTests.cs",\
2026-08-26T17:43:24.6499033Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/SiaciDDQUseCaseTests.cs",\
2026-08-26T17:43:24.6499274Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Batch/LoaderImoveisSiopiTests.cs",\
2026-08-26T17:43:24.6499501Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/CargaImoveisSiaciTests.cs",\
2026-08-26T17:43:24.6499743Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Configuration/AddHeadersHttpClientTests.cs",\
2026-08-26T17:43:24.6499993Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Configuration/ConnectionsConfigurationTest.cs",\
2026-08-26T17:43:24.6500234Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Contexts/FileProcessingContextTests.cs",\
2026-08-26T17:43:24.6500473Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Contexts/SiicoCallCounterContextTests.cs",\
2026-08-26T17:43:24.6500706Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/DomainObjects/EntityTests.cs",\
2026-08-26T17:43:24.6500951Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/DomainObjects/IAggregateRootTests.cs",\
2026-08-26T17:43:24.6501194Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/CancellationExceptionTests.cs",\
2026-08-26T17:43:24.6501443Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/EntityValidationExceptionTests.cs",\
2026-08-26T17:43:24.6501691Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/GenericExceptionTests.cs",\
2026-08-26T17:43:24.6501930Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/NotFoundExceptionTests.cs",\
2026-08-26T17:43:24.6502174Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/ProcessamentoExceptionTests.cs",\
2026-08-26T17:43:24.6502706Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/RelatedAggregateExceptionTests.cs",\
2026-08-26T17:43:24.6502971Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/UnauthorizedExceptionTests.cs",\
2026-08-26T17:43:24.6503228Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siico/ApiSiicoRestPrivadoTests.cs",\
2026-08-26T17:43:24.6503523Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siico/ApiSiicoRestPublicoTests.cs",\
2026-08-26T17:43:24.6503903Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siiso/ApiSiisoRestPublicoTests.cs",\
2026-08-26T17:43:24.6504148Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/AutenticacarSsoTests.cs",\
2026-08-26T17:43:24.6504392Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/BairroDetalhadoSiicoTests.cs",\
2026-08-26T17:43:24.6504646Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/BairroSiicoTests.cs",\
2026-08-26T17:43:24.6504930Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/MunicipioCompletoSiicoTests.cs",\
2026-08-26T17:43:24.6505168Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/ResponseGenericoTests.cs",\
2026-08-26T17:43:24.6505401Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/Siico/CepSiicoTests.cs",\
2026-08-26T17:43:24.6505659Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Domain/Layouts/BaseArquivoLayoutTests.cs",\
2026-08-26T17:43:24.6505901Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/AgrupamentoVendaImovelTests.cs",\
2026-08-26T17:43:24.6506139Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/AvaliacaoImovelSiopiTests.cs",\
2026-08-26T17:43:24.6506378Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/ControleProcessamentoTests.cs",\
2026-08-26T17:43:24.6506608Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/DadoContabilTests.cs",\
2026-08-26T17:43:24.6506849Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoAgrupamentoVendaImovelTests.cs",\
2026-08-26T17:43:24.6507095Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoDadoContabilTests.cs",\
2026-08-26T17:43:24.6507326Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoImovelTests.cs",\
2026-08-26T17:43:24.6507600Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/ImovelTests.cs",\
2026-08-26T17:43:24.6507969Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/MatriculaImovelSiopiTests.cs",\
2026-08-26T17:43:24.6508367Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/MensagemControleProcessamentoTests.cs",\
2026-08-26T17:43:24.6508700Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/RotinaProcessamentoTests.cs",\
2026-08-26T17:43:24.6508931Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/SiopiImovelTests.cs",\
2026-08-26T17:43:24.6509167Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ArquivoSiaciFake.cs",\
2026-08-26T17:43:24.6509523Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ImovelDtoFake.cs",\
2026-08-26T17:43:24.6509812Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ImovelFake.cs",\
2026-08-26T17:43:24.6510034Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/LayoutArquivoFake.cs",\
2026-08-26T17:43:24.6510255Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/Siico/ResponsesFake.cs",\
2026-08-26T17:43:24.6510495Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/InfraDataEF/HistoricosInterceptorTests.cs",\
2026-08-26T17:43:24.6510732Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/InfraDataEF/SimovDbContextTests.cs",\
2026-08-26T17:43:24.6510954Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Layouts/SiaciLayoutTests.cs"
2026-08-26T17:43:24.6511023Z 
2026-08-26T17:43:24.6511378Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:43:24.6511714Z "/opt/ads-agent/_work/6/.sonarqube/out/20"
2026-08-26T17:43:24.6511986Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:43:24.6512244Z "/opt/ads-agent/_work/6/.sonarqube/out/20/Issues.json"
2026-08-26T17:43:24.6512341Z 
2026-08-26T17:43:24.6512711Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod20
2026-08-26T17:43:24.6513222Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectKey=SIMOV-imoveiscaixa-batch:0DC13198-1AC4-46C6-B9B3-E2987B8496D5
2026-08-26T17:43:24.6513868Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectName=Simov.Core
2026-08-26T17:43:24.6514131Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:43:24.6514363Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.sourceEncoding=utf-8
2026-08-26T17:43:24.6514571Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.sources=\
2026-08-26T17:43:24.6514645Z 
2026-08-26T17:43:24.6514680Z 
2026-08-26T17:43:24.6514869Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:43:24.6515066Z "/opt/ads-agent/_work/6/.sonarqube/out/21"
2026-08-26T17:43:24.6515344Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:43:24.6515547Z "/opt/ads-agent/_work/6/.sonarqube/out/21/Issues.json"
2026-08-26T17:43:24.6515614Z 
2026-08-26T17:43:24.6515835Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod21
2026-08-26T17:43:24.6516195Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectKey=SIMOV-imoveiscaixa-batch:BA15777F-9613-49A5-8C5F-8CBFA5F86619
2026-08-26T17:43:24.6516649Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectName=Simov.Domain
2026-08-26T17:43:24.6516944Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:43:24.6517178Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.sourceEncoding=utf-8
2026-08-26T17:43:24.6517390Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.sources=\
2026-08-26T17:43:24.6517463Z 
2026-08-26T17:43:24.6517498Z 
2026-08-26T17:43:24.6517692Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:43:24.6517889Z "/opt/ads-agent/_work/6/.sonarqube/out/22"
2026-08-26T17:43:24.6518101Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:43:24.6518308Z "/opt/ads-agent/_work/6/.sonarqube/out/22/Issues.json"
2026-08-26T17:43:24.6518368Z 
2026-08-26T17:43:24.6518609Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod22
2026-08-26T17:43:24.6518918Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectKey=SIMOV-imoveiscaixa-batch:48A485AE-9F33-C9A7-979C-54916B65C32E
2026-08-26T17:43:24.6519189Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectName=Simov.Application
2026-08-26T17:43:24.6519450Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:43:24.6519691Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.sourceEncoding=utf-8
2026-08-26T17:43:24.6519897Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.sources=\
2026-08-26T17:43:24.6519966Z 
2026-08-26T17:43:24.6520008Z 
2026-08-26T17:43:24.6520197Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:43:24.6520384Z "/opt/ads-agent/_work/6/.sonarqube/out/23"
2026-08-26T17:43:24.6520596Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:43:24.6520800Z "/opt/ads-agent/_work/6/.sonarqube/out/23/Issues.json"
2026-08-26T17:43:24.6520858Z 
2026-08-26T17:43:24.6521078Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod23
2026-08-26T17:43:24.6521381Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectKey=SIMOV-imoveiscaixa-batch:309346D6-2461-4973-A29B-7A38A756C0DE
2026-08-26T17:43:24.6521753Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:43:24.6522082Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:43:24.6522324Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.sourceEncoding=utf-8
2026-08-26T17:43:24.6522632Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.sources=\
2026-08-26T17:43:24.6522698Z 
2026-08-26T17:43:24.6522732Z 
2026-08-26T17:43:24.6522924Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:43:24.6523215Z "/opt/ads-agent/_work/6/.sonarqube/out/24"
2026-08-26T17:43:24.6523497Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:43:24.6523846Z "/opt/ads-agent/_work/6/.sonarqube/out/24/Issues.json"
2026-08-26T17:43:24.6523939Z 
2026-08-26T17:43:24.6524294Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod24
2026-08-26T17:43:24.6524609Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectKey=SIMOV-imoveiscaixa-batch:4BF20498-1845-4781-82CB-E7783C0081FA
2026-08-26T17:43:24.6524871Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectName=Simov.Batch
2026-08-26T17:43:24.6525121Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:43:24.6525403Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.sourceEncoding=utf-8
2026-08-26T17:43:24.6525612Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.sources=\
2026-08-26T17:43:24.6525684Z 
2026-08-26T17:43:24.6525718Z 
2026-08-26T17:43:24.6525903Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:43:24.6526097Z "/opt/ads-agent/_work/6/.sonarqube/out/25"
2026-08-26T17:43:24.6526305Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:43:24.6526566Z "/opt/ads-agent/_work/6/.sonarqube/out/25/Issues.json"
2026-08-26T17:43:24.6526642Z 
2026-08-26T17:43:24.6526878Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod25
2026-08-26T17:43:24.6527182Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectKey=SIMOV-imoveiscaixa-batch:D54F14FF-8EEB-4EB8-994B-69D77DDB78FD
2026-08-26T17:43:24.6527442Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectName=TesteSimovBatch
2026-08-26T17:43:24.6527701Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/tests/TesteSimovBatch
2026-08-26T17:43:24.6527937Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.sourceEncoding=utf-8
2026-08-26T17:43:24.6528141Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.sources=
2026-08-26T17:43:24.6528341Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.tests=\
2026-08-26T17:43:24.6528409Z 
2026-08-26T17:43:24.6528444Z 
2026-08-26T17:43:24.6528632Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:43:24.6528826Z "/opt/ads-agent/_work/6/.sonarqube/out/26"
2026-08-26T17:43:24.6529030Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:43:24.6529232Z "/opt/ads-agent/_work/6/.sonarqube/out/26/Issues.json"
2026-08-26T17:43:24.6529301Z 
2026-08-26T17:43:24.6529523Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod26
2026-08-26T17:43:24.6529702Z sonar.host.url=https://sonar.apps.produtos4.caixa/
2026-08-26T17:43:24.6529885Z sonar.projectKey=SIMOV-imoveiscaixa-batch
2026-08-26T17:43:24.6530067Z sonar.projectName=SIMOV-imoveiscaixa-batch
2026-08-26T17:43:24.6530245Z sonar.projectVersion=1.0-SNAPSHOT
2026-08-26T17:43:24.6530376Z sonar.branch.name=CorrecoesSonar
2026-08-26T17:43:24.6530651Z sonar.scanner.metadataFilePath=/opt/ads-agent/_work/_temp/sonar/1.0-SNAPSHOT/f442c3b3-ec53-840d-3dab-bba3c4de61f5/report-task.txt
2026-08-26T17:43:24.6530926Z sonar.cs.opencover.reportsPaths=/opt/ads-agent/_work/_temp/**/coverage.opencover.xml
2026-08-26T17:43:24.6531147Z sonar.cs.vstest.reportsPaths=/opt/ads-agent/_work/_temp/**/*.trx
2026-08-26T17:43:24.6531288Z sonar.visualstudio.enable=false
2026-08-26T17:43:24.6531350Z 
2026-08-26T17:43:24.6532676Z sonar.modules=0B395246-F58A-479C-B0B1-C6A6045C6FD3,5E55366D-25CB-4B0F-BAF4-738003A18ED2,0847F1F3-B5DA-4FC3-8EEF-882D75A674FD,D745E52F-7A66-4C38-B30D-3A27EA75CCCE,FBCB055E-203B-4979-BB94-B02AE276DE0B,D6E1F89D-8BFA-426E-BC94-C1182DBD0621,AD78E470-A67C-4901-A53F-E3D7D40350CD,B904AD47-4763-413C-9324-7889FD92EFA6,6679F22B-144A-4C59-A28C-2A87F31E3915,EC78B0BC-170C-482C-867B-C5402B449403,1B2C05E0-E98F-477C-931D-923BBE79AE4E,A180ED2D-1521-44A6-B6EA-5DDEC55D2C17,A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E,00300450-28FA-4EA9-8A96-181ED44DCA26,1393E257-1007-43DE-B94C-0B0508C0B309,5BE00443-BD63-4C9F-A707-406F2AC94762,A79CA783-37A2-49D3-B56C-D9102F046AF9,51ABFD24-E14F-4155-B9D7-CDBD0E536AAB,F2842708-9CF5-4649-B3A8-6D39E5E01B77,3C101C3B-D8C0-461B-B65B-B87A6F75F210,4E341BE0-BD46-427C-8912-6319C41C89BC,0DC13198-1AC4-46C6-B9B3-E2987B8496D5,BA15777F-9613-49A5-8C5F-8CBFA5F86619,48A485AE-9F33-C9A7-979C-54916B65C32E,309346D6-2461-4973-A29B-7A38A756C0DE,4BF20498-1845-4781-82CB-E7783C0081FA,D54F14FF-8EEB-4EB8-994B-69D77DDB78FD
2026-08-26T17:43:24.6533385Z 
2026-08-26T17:43:24.6533421Z 
2026-08-26T17:43:24.6533621Z ------------------------------------------------------------------------
2026-08-26T17:43:24.6534029Z 14:43:24.641  Writing processing summary to /opt/ads-agent/_work/6/.sonarqube/out/ProjectInfo.log
2026-08-26T17:43:24.6534261Z The SONAR_SCANNER_HOME environment variable is not required and will be ignored.
2026-08-26T17:43:24.6534407Z Calling the SonarScanner CLI...
2026-08-26T17:43:24.6534720Z Executing file /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/sonar-scanner-4.7.0.2747/bin/sonar-scanner
2026-08-26T17:43:24.6535096Z   Args: -Dsonar.scanAllFiles=true -Dproject.settings=/opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties --from=ScannerMSBuild/5.8 --debug <sensitive data removed>
2026-08-26T17:43:24.6535336Z   Working directory: /opt/ads-agent/_work/6
2026-08-26T17:43:24.6535466Z   Timeout (ms):-1
2026-08-26T17:43:24.6535585Z   Process id: 26746
2026-08-26T17:43:24.7714020Z 14:43:24.767 INFO: Scanner configuration file: /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/sonar-scanner-4.7.0.2747/conf/sonar-scanner.properties
2026-08-26T17:43:24.7714485Z 14:43:24.769 INFO: Project root configuration file: /opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties
2026-08-26T17:43:24.8011163Z 14:43:24.800 INFO: SonarScanner 4.7.0.2747
2026-08-26T17:43:24.8011769Z 14:43:24.800 INFO: Java 11 Oracle Corporation (64-bit)
2026-08-26T17:43:24.8012024Z 14:43:24.800 INFO: Linux 5.18.5-100.fc35.x86_64 amd64
2026-08-26T17:43:24.8817671Z 14:43:24.881 DEBUG: keyStore is : 
2026-08-26T17:43:24.8817933Z 14:43:24.881 DEBUG: keyStore type is : pkcs12
2026-08-26T17:43:24.8818082Z 14:43:24.881 DEBUG: keyStore provider is : 
2026-08-26T17:43:24.8818231Z 14:43:24.881 DEBUG: init keystore
2026-08-26T17:43:24.8818380Z 14:43:24.881 DEBUG: init keymanager of type SunX509
2026-08-26T17:43:24.9466995Z 14:43:24.945 DEBUG: Create: /opt/ads-agent/cache-tools/.sonar/cache
2026-08-26T17:43:24.9468670Z 14:43:24.946 INFO: User cache: /opt/ads-agent/cache-tools/.sonar/cache
2026-08-26T17:43:24.9468973Z 14:43:24.946 DEBUG: Create: /opt/ads-agent/cache-tools/.sonar/cache/_tmp
2026-08-26T17:43:24.9484623Z 14:43:24.948 DEBUG: Extract sonar-scanner-api-batch in temp...
2026-08-26T17:43:24.9503540Z 14:43:24.949 DEBUG: Get bootstrap index...
2026-08-26T17:43:24.9503882Z 14:43:24.950 DEBUG: Download: https://sonar.apps.produtos4.caixa/batch/index
2026-08-26T17:43:25.0368299Z 14:43:25.036 INFO: ------------------------------------------------------------------------
2026-08-26T17:43:25.0368552Z 14:43:25.036 INFO: EXECUTION FAILURE
2026-08-26T17:43:25.0368935Z 14:43:25.036 INFO: ------------------------------------------------------------------------
2026-08-26T17:43:25.0369119Z 14:43:25.036 INFO: Total time: 0.291s
2026-08-26T17:43:25.0371957Z ##[error]14:43:25.036 ERROR: SonarQube server [https://sonar.apps.produtos4.caixa] can not be reached
2026-08-26T17:43:25.0372552Z 14:43:25.036 ERROR: SonarQube server [https://sonar.apps.produtos4.caixa] can not be reached
2026-08-26T17:43:25.0477696Z 14:43:25.047 INFO: Final Memory: 4M/80M
2026-08-26T17:43:25.0478400Z 14:43:25.047 INFO: ------------------------------------------------------------------------
2026-08-26T17:43:25.0479338Z ##[error]14:43:25.047 ERROR: Error during SonarScanner execution
org.sonarsource.scanner.api.internal.ScannerException: Unable to execute SonarScanner analysis
2026-08-26T17:43:25.0480489Z 14:43:25.047 ERROR: Error during SonarScanner execution
2026-08-26T17:43:25.0480760Z org.sonarsource.scanner.api.internal.ScannerException: Unable to execute SonarScanner analysis
2026-08-26T17:43:25.0481395Z ##[error]at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:85)
2026-08-26T17:43:25.0482010Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:85)
2026-08-26T17:43:25.0483134Z ##[error]at java.base/java.security.AccessController.doPrivileged(Native Method)
	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:74)
	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:70)
	at org.sonarsource.scanner.api.EmbeddedScanner.doStart(EmbeddedScanner.java:185)
2026-08-26T17:43:25.0484147Z 	at java.base/java.security.AccessController.doPrivileged(Native Method)
2026-08-26T17:43:25.0484464Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:74)
2026-08-26T17:43:25.0484839Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:70)
2026-08-26T17:43:25.0485161Z 	at org.sonarsource.scanner.api.EmbeddedScanner.doStart(EmbeddedScanner.java:185)
2026-08-26T17:43:25.0485676Z ##[error]at org.sonarsource.scanner.api.EmbeddedScanner.start(EmbeddedScanner.java:123)
2026-08-26T17:43:25.0486203Z 	at org.sonarsource.scanner.api.EmbeddedScanner.start(EmbeddedScanner.java:123)
2026-08-26T17:43:25.0486809Z ##[error]at org.sonarsource.scanner.cli.Main.execute(Main.java:73)
	at org.sonarsource.scanner.cli.Main.main(Main.java:61)
2026-08-26T17:43:25.0487345Z 	at org.sonarsource.scanner.cli.Main.execute(Main.java:73)
2026-08-26T17:43:25.0487603Z 	at org.sonarsource.scanner.cli.Main.main(Main.java:61)
2026-08-26T17:43:25.0488513Z ##[error]Caused by: java.lang.IllegalStateException: Fail to get bootstrap index from server
	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:42)
	at org.sonarsource.scanner.api.internal.JarDownloader.getScannerEngineFiles(JarDownloader.java:58)
2026-08-26T17:43:25.0489133Z Caused by: java.lang.IllegalStateException: Fail to get bootstrap index from server
2026-08-26T17:43:25.0489400Z 	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:42)
2026-08-26T17:43:25.0489745Z 	at org.sonarsource.scanner.api.internal.JarDownloader.getScannerEngineFiles(JarDownloader.java:58)
2026-08-26T17:43:25.0490571Z ##[error]at org.sonarsource.scanner.api.internal.JarDownloader.download(JarDownloader.java:53)
	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:76)
	... 7 more
2026-08-26T17:43:25.0491234Z 	at org.sonarsource.scanner.api.internal.JarDownloader.download(JarDownloader.java:53)
2026-08-26T17:43:25.0491580Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:76)
2026-08-26T17:43:25.0491848Z 	... 7 more
2026-08-26T17:43:25.0492569Z ##[error]Caused by: javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:128)
2026-08-26T17:43:25.0493300Z Caused by: javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:43:25.0493726Z 	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:128)
2026-08-26T17:43:25.0496606Z ##[error]at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:264)
	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:259)
	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1329)
	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.onConsumeCertificate(CertificateMessage.java:1204)
	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.consume(CertificateMessage.java:1151)
	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:392)
	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:444)
	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:421)
	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:178)
	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:164)
	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1152)
	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1063)
2026-08-26T17:43:25.0498403Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
2026-08-26T17:43:25.0498700Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:264)
2026-08-26T17:43:25.0498987Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:259)
2026-08-26T17:43:25.0499330Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1329)
2026-08-26T17:43:25.0499703Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.onConsumeCertificate(CertificateMessage.java:1204)
2026-08-26T17:43:25.0500059Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.consume(CertificateMessage.java:1151)
2026-08-26T17:43:25.0500395Z 	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:392)
2026-08-26T17:43:25.0500683Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:444)
2026-08-26T17:43:25.0500993Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:421)
2026-08-26T17:43:25.0501291Z 	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:178)
2026-08-26T17:43:25.0501591Z 	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:164)
2026-08-26T17:43:25.0501873Z 	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1152)
2026-08-26T17:43:25.0502175Z 	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1063)
2026-08-26T17:43:25.0503399Z ##[error]at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:402)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connectTls(RealConnection.java:336)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.establishProtocol(RealConnection.java:300)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connect(RealConnection.java:185)
2026-08-26T17:43:25.0504406Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:402)
2026-08-26T17:43:25.0504751Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connectTls(RealConnection.java:336)
2026-08-26T17:43:25.0505150Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.establishProtocol(RealConnection.java:300)
2026-08-26T17:43:25.0505557Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connect(RealConnection.java:185)
2026-08-26T17:43:25.0506892Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findConnection(ExchangeFinder.java:224)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findHealthyConnection(ExchangeFinder.java:108)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.find(ExchangeFinder.java:88)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.Transmitter.newExchange(Transmitter.java:169)
2026-08-26T17:43:25.0507966Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findConnection(ExchangeFinder.java:224)
2026-08-26T17:43:25.0508370Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findHealthyConnection(ExchangeFinder.java:108)
2026-08-26T17:43:25.0508772Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.find(ExchangeFinder.java:88)
2026-08-26T17:43:25.0509166Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.Transmitter.newExchange(Transmitter.java:169)
2026-08-26T17:43:25.0510043Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ConnectInterceptor.intercept(ConnectInterceptor.java:41)
2026-08-26T17:43:25.0510727Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ConnectInterceptor.intercept(ConnectInterceptor.java:41)
2026-08-26T17:43:25.0511726Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:43:25.0512346Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:43:25.0513954Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.cache.CacheInterceptor.intercept(CacheInterceptor.java:94)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:43:25.0514860Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:43:25.0515197Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.cache.CacheInterceptor.intercept(CacheInterceptor.java:94)
2026-08-26T17:43:25.0515528Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:43:25.0516004Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:43:25.0517072Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.BridgeInterceptor.intercept(BridgeInterceptor.java:93)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RetryAndFollowUpInterceptor.intercept(RetryAndFollowUpInterceptor.java:88)
2026-08-26T17:43:25.0517855Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.BridgeInterceptor.intercept(BridgeInterceptor.java:93)
2026-08-26T17:43:25.0518192Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:43:25.0518603Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RetryAndFollowUpInterceptor.intercept(RetryAndFollowUpInterceptor.java:88)
2026-08-26T17:43:25.0519225Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:43:25.0519759Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:43:25.0521001Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.getResponseWithInterceptorChain(RealCall.java:221)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.execute(RealCall.java:81)
	at org.sonarsource.scanner.api.internal.ServerConnection.callUrl(ServerConnection.java:115)
	at org.sonarsource.scanner.api.internal.ServerConnection.downloadString(ServerConnection.java:99)
2026-08-26T17:43:25.0521963Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:43:25.0522292Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.getResponseWithInterceptorChain(RealCall.java:221)
2026-08-26T17:43:25.0522582Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.execute(RealCall.java:81)
2026-08-26T17:43:25.0523098Z 	at org.sonarsource.scanner.api.internal.ServerConnection.callUrl(ServerConnection.java:115)
2026-08-26T17:43:25.0523432Z 	at org.sonarsource.scanner.api.internal.ServerConnection.downloadString(ServerConnection.java:99)
2026-08-26T17:43:25.0524093Z ##[error]at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:39)
	... 10 more
2026-08-26T17:43:25.0524632Z 	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:39)
2026-08-26T17:43:25.0524854Z 	... 10 more
2026-08-26T17:43:25.0525355Z ##[error]Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:43:25.0525934Z Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:43:25.0526448Z ##[error]at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:385)
2026-08-26T17:43:25.0526904Z 	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:385)
2026-08-26T17:43:25.0527973Z ##[error]at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:290)
	at java.base/sun.security.validator.Validator.validate(Validator.java:264)
	at java.base/sun.security.ssl.X509TrustManagerImpl.validate(X509TrustManagerImpl.java:321)
	at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:221)
	at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:129)
2026-08-26T17:43:25.0528755Z 	at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:290)
2026-08-26T17:43:25.0529066Z 	at java.base/sun.security.validator.Validator.validate(Validator.java:264)
2026-08-26T17:43:25.0529335Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.validate(X509TrustManagerImpl.java:321)
2026-08-26T17:43:25.0529621Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:221)
2026-08-26T17:43:25.0529913Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:129)
2026-08-26T17:43:25.0530501Z ##[error]at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1313)
	... 43 more
2026-08-26T17:43:25.0531045Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1313)
2026-08-26T17:43:25.0531325Z 	... 43 more
2026-08-26T17:43:25.0531780Z ##[error]Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:43:25.0532279Z Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:43:25.0533273Z ##[error]at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:141)
	at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:126)
	at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:380)
	... 49 more
2026-08-26T17:43:25.0534165Z 	at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:141)
2026-08-26T17:43:25.0534453Z 	at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:126)
2026-08-26T17:43:25.0535400Z 	at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
2026-08-26T17:43:25.0535692Z 	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:380)
2026-08-26T17:43:25.0535846Z 	... 49 more
2026-08-26T17:43:25.0670537Z Process returned exit code 1
2026-08-26T17:43:25.0700449Z ##[error]The SonarScanner did not complete successfully
2026-08-26T17:43:25.0701278Z The SonarScanner did not complete successfully
2026-08-26T17:43:25.0701612Z ##[error]14:43:25.069  Post-processing failed. Exit code: 1
2026-08-26T17:43:25.0702221Z 14:43:25.069  Post-processing failed. Exit code: 1
2026-08-26T17:43:25.0783912Z ##[error]The process '/opt/ads-agent/cache-tools/.dotnet//dotnet' failed with exit code 1
2026-08-26T17:43:25.0815318Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 10 out of 10) after 100000 ms
2026-08-26T17:45:05.1957865Z [command]/opt/ads-agent/cache-tools/.dotnet//dotnet /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/SonarScanner.MSBuild.dll end
2026-08-26T17:45:05.2459243Z SonarScanner for MSBuild 5.8
2026-08-26T17:45:05.2459830Z Using the .NET Core version of the Scanner for MSBuild
2026-08-26T17:45:05.2856027Z Post-processing started.
2026-08-26T17:45:05.3566019Z 14:45:05.356  14:45:05.337  /opt/ads-agent/_work/6/.sonarqube/bin/targets/SonarQube.Integration.targets does not exist
2026-08-26T17:45:05.3566607Z 14:45:05.356  14:45:05.356  sonar.verbose=true was specified - setting the log verbosity to 'Debug'
2026-08-26T17:45:05.3567031Z 14:45:05.356  Loading the SonarQube analysis config from /opt/ads-agent/_work/6/.sonarqube/conf/SonarQubeAnalysisConfig.xml
2026-08-26T17:45:05.3567513Z 14:45:05.356  Not running under TeamBuild
2026-08-26T17:45:05.3567860Z 14:45:05.356  Analysis base directory: /opt/ads-agent/_work/6/.sonarqube
2026-08-26T17:45:05.3568072Z Build directory: 
2026-08-26T17:45:05.3568370Z Bin directory: /opt/ads-agent/_work/6/.sonarqube/bin
2026-08-26T17:45:05.3568678Z Config directory: /opt/ads-agent/_work/6/.sonarqube/conf
2026-08-26T17:45:05.3568968Z Output directory: /opt/ads-agent/_work/6/.sonarqube/out
2026-08-26T17:45:05.3569235Z Config file: /opt/ads-agent/_work/6/.sonarqube/conf/SonarQubeAnalysisConfig.xml
2026-08-26T17:45:05.3581548Z 14:45:05.357  Generating SonarQube project properties file to /opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties
2026-08-26T17:45:05.3762295Z 14:45:05.375  Setting analysis property: sonar.visualstudio.enable=false
2026-08-26T17:45:05.3964349Z 14:45:05.395  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/0/Issues.json
2026-08-26T17:45:05.4022238Z 14:45:05.401  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/1/Issues.json
2026-08-26T17:45:05.4073614Z 14:45:05.407  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/2/Issues.json
2026-08-26T17:45:05.4238734Z 14:45:05.423  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/3/Issues.json
2026-08-26T17:45:05.4284990Z 14:45:05.428  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/4/Issues.json
2026-08-26T17:45:05.4332222Z 14:45:05.432  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/5/Issues.json
2026-08-26T17:45:05.4349912Z 14:45:05.434  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/6/Issues.json
2026-08-26T17:45:05.4364597Z 14:45:05.436  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/7/Issues.json
2026-08-26T17:45:05.4527574Z 14:45:05.452  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/8/Issues.json
2026-08-26T17:45:05.4689873Z 14:45:05.468  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/9/Issues.json
2026-08-26T17:45:05.4738755Z 14:45:05.473  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/10/Issues.json
2026-08-26T17:45:05.4936844Z 14:45:05.493  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/11/Issues.json
2026-08-26T17:45:05.4975934Z 14:45:05.497  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/12/Issues.json
2026-08-26T17:45:05.5019214Z 14:45:05.501  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/13/Issues.json
2026-08-26T17:45:05.5034663Z 14:45:05.503  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/14/Issues.json
2026-08-26T17:45:05.5167867Z 14:45:05.516  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/15/Issues.json
2026-08-26T17:45:05.5206834Z 14:45:05.52  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/16/Issues.json
2026-08-26T17:45:05.5250232Z 14:45:05.524  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/17/Issues.json
2026-08-26T17:45:05.5262497Z 14:45:05.526  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/18/Issues.json
2026-08-26T17:45:05.5277409Z 14:45:05.527  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/19/Issues.json
2026-08-26T17:45:05.5281441Z 14:45:05.528  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/20/Issues.json
2026-08-26T17:45:05.5413415Z 14:45:05.54  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/21/Issues.json
2026-08-26T17:45:05.5453721Z 14:45:05.545  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/22/Issues.json
2026-08-26T17:45:05.5494505Z 14:45:05.549  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/23/Issues.json
2026-08-26T17:45:05.5510861Z 14:45:05.55  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/24/Issues.json
2026-08-26T17:45:05.5523042Z 14:45:05.552  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/25/Issues.json
2026-08-26T17:45:05.5528783Z 14:45:05.552  The supplied Code Analysis ErrorLog file is a valid json file and does not need to be fixed: /opt/ads-agent/_work/6/.sonarqube/out/26/Issues.json
2026-08-26T17:45:05.5701068Z 14:45:05.569  Using longest common projects path as a base directory: '/opt/ads-agent/_work/6/s'.
2026-08-26T17:45:05.5854884Z 14:45:05.584  File was referenced by the following projects: '/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/TesteSimovBatch.csproj', '/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/TesteSimovBatch.csproj'.
2026-08-26T17:45:05.5991169Z 14:45:05.593  Dumping content of sonar-project.properties
2026-08-26T17:45:05.5991527Z ------------------------------------------------------------------------
2026-08-26T17:45:05.5991775Z sonar.projectKey=SIMOV-imoveiscaixa-batch
2026-08-26T17:45:05.5992000Z sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar
2026-08-26T17:45:05.5992222Z sonar.projectBaseDir=/opt/ads-agent/_work/6/s
2026-08-26T17:45:05.5992291Z 
2026-08-26T17:45:05.5992569Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectKey=SIMOV-imoveiscaixa-batch:0B395246-F58A-479C-B0B1-C6A6045C6FD3
2026-08-26T17:45:05.5993140Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectName=Simov.Core
2026-08-26T17:45:05.5993402Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:45:05.5994025Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.sourceEncoding=utf-8
2026-08-26T17:45:05.5996088Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.sources=\
2026-08-26T17:45:05.5996667Z "/opt/ads-agent/_work/6/s/src/Simov.Core/AutenticacaoSso/AutenticacarSso.cs",\
2026-08-26T17:45:05.5996922Z "/opt/ads-agent/_work/6/s/src/Simov.Core/AutenticacaoSso/IAutenticacarSso.cs",\
2026-08-26T17:45:05.5997144Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Data/IBaseRepository.cs",\
2026-08-26T17:45:05.5997512Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Data/IUnitOfWork.cs",\
2026-08-26T17:45:05.5997811Z "/opt/ads-agent/_work/6/s/src/Simov.Core/DomainObjects/Entity.cs",\
2026-08-26T17:45:05.5998034Z "/opt/ads-agent/_work/6/s/src/Simov.Core/DomainObjects/IAggregateRoot.cs",\
2026-08-26T17:45:05.5998401Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/ApplicationException.cs",\
2026-08-26T17:45:05.5998625Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/CancellationException.cs",\
2026-08-26T17:45:05.5998857Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/EntityValidationException.cs",\
2026-08-26T17:45:05.5999096Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/GenericException.cs",\
2026-08-26T17:45:05.5999355Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/NotFoundException.cs",\
2026-08-26T17:45:05.5999599Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/ProcessamentoException.cs",\
2026-08-26T17:45:05.5999828Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/RelatedAggregateException.cs",\
2026-08-26T17:45:05.6000092Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Exceptions/UnauthorizedException.cs",\
2026-08-26T17:45:05.6000332Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Logging/LoggerExtensions.cs",\
2026-08-26T17:45:05.6000552Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siico/ApiSiicoRestPrivado.cs",\
2026-08-26T17:45:05.6000786Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siico/ApiSiicoRestPublico.cs",\
2026-08-26T17:45:05.6001007Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Siiso/ApiSiisoRestPublico.cs",\
2026-08-26T17:45:05.6001228Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/DadosDto.cs",\
2026-08-26T17:45:05.6001445Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/DadosSimilDto.cs",\
2026-08-26T17:45:05.6001655Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/FotosDto.cs",\
2026-08-26T17:45:05.6001869Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/Dto/ListaFotoDto.cs",\
2026-08-26T17:45:05.6002092Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/ISOAPWeb.cs",\
2026-08-26T17:45:05.6002326Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/RobustSoapDeserializer.cs",\
2026-08-26T17:45:05.6002570Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Api/Simil/SOAPWeb.cs",\
2026-08-26T17:45:05.6002800Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/ResponseGenerico.cs",\
2026-08-26T17:45:05.6003043Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/BairroDetalhadoSiico.cs",\
2026-08-26T17:45:05.6003261Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/BairroSiico.cs",\
2026-08-26T17:45:05.6003849Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/CepSiico.cs",\
2026-08-26T17:45:05.6004246Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/LocalidadeSiico.cs",\
2026-08-26T17:45:05.6004487Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioCompletoSiico.cs",\
2026-08-26T17:45:05.6004735Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioParcialSiico.cs",\
2026-08-26T17:45:05.6004978Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/MunicipioSiico.cs",\
2026-08-26T17:45:05.6005218Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/TipoLogradouroSiico.cs",\
2026-08-26T17:45:05.6005525Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/UnidadeCaixa.cs",\
2026-08-26T17:45:05.6005775Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siico/UnidadeFederacaoSiico.cs",\
2026-08-26T17:45:05.6006018Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/EnderecoPessoaSiiso.cs",\
2026-08-26T17:45:05.6006277Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/LocalidadeNascimentoSiiso.cs",\
2026-08-26T17:45:05.6006515Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Dto/Siiso/PessoaSiiso.cs",\
2026-08-26T17:45:05.6006758Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siico/IApiSiicoRestPrivado.cs",\
2026-08-26T17:45:05.6007020Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siico/IApiSiicoRestPublico.cs",\
2026-08-26T17:45:05.6007289Z "/opt/ads-agent/_work/6/s/src/Simov.Core/Rest/Interfaces/Siiso/IApiSiisoRestPublico.cs"
2026-08-26T17:45:05.6007374Z 
2026-08-26T17:45:05.6007599Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:45:05.6007840Z "/opt/ads-agent/_work/6/.sonarqube/out/0"
2026-08-26T17:45:05.6008054Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:45:05.6008281Z "/opt/ads-agent/_work/6/.sonarqube/out/0/Issues.json"
2026-08-26T17:45:05.6008362Z 
2026-08-26T17:45:05.6008752Z 0B395246-F58A-479C-B0B1-C6A6045C6FD3.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod0
2026-08-26T17:45:05.6009094Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectKey=SIMOV-imoveiscaixa-batch:5E55366D-25CB-4B0F-BAF4-738003A18ED2
2026-08-26T17:45:05.6009357Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectName=Simov.Domain
2026-08-26T17:45:05.6009768Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:45:05.6010043Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.sourceEncoding=utf-8
2026-08-26T17:45:05.6010271Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.sources=\
2026-08-26T17:45:05.6010500Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AgrupamentoVendaImovel.cs",\
2026-08-26T17:45:05.6010747Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaArquivoLote.cs",\
2026-08-26T17:45:05.6011004Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaFotoImovel.cs",\
2026-08-26T17:45:05.6011266Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaFotoLote.cs",\
2026-08-26T17:45:05.6011509Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AuditoriaUsuario.cs",\
2026-08-26T17:45:05.6011739Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/AvaliacaoImovel.cs",\
2026-08-26T17:45:05.6011964Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/ComodoImovel.cs",\
2026-08-26T17:45:05.6012191Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/ControleProcessamento.cs",\
2026-08-26T17:45:05.6012419Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/DadoContabil.cs",\
2026-08-26T17:45:05.6012642Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/FotoImovel.cs",\
2026-08-26T17:45:05.6012882Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoAgrupamentoVendaImovel.cs",\
2026-08-26T17:45:05.6013118Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoAvaliacaoImovel.cs",\
2026-08-26T17:45:05.6013342Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoComodoImovel.cs",\
2026-08-26T17:45:05.6013842Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoDadoContabil.cs",\
2026-08-26T17:45:05.6014079Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoImovel.cs",\
2026-08-26T17:45:05.6014316Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/HistoricoMatriculaImovel.cs",\
2026-08-26T17:45:05.6014539Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/Imovel.cs",\
2026-08-26T17:45:05.6014761Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/MatriculaImovel.cs",\
2026-08-26T17:45:05.6015086Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/MensagemControleProcessamento.cs",\
2026-08-26T17:45:05.6015318Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Entities/RotinaProcessamento.cs",\
2026-08-26T17:45:05.6015587Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/ClassificacaoImovelEnum.cs",\
2026-08-26T17:45:05.6016148Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/EstadoConservacaoEnum.cs",\
2026-08-26T17:45:05.6016369Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/FuncionalidadeSistemaEnum.cs",\
2026-08-26T17:45:05.6016589Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/IcAcaoSistemaEnum.cs",\
2026-08-26T17:45:05.6016795Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/IcShortEnum.cs",\
2026-08-26T17:45:05.6017008Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/MotivoExclusaoEnum.cs",\
2026-08-26T17:45:05.6017249Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/OrgaoProprietarioImovelEnum.cs",\
2026-08-26T17:45:05.6017492Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/OrigemImovelEnum.cs",\
2026-08-26T17:45:05.6017720Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/ResultadoMensagemProcessamentoEnum.cs",\
2026-08-26T17:45:05.6017946Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/RotinaProcessamentoEnum.cs",\
2026-08-26T17:45:05.6018168Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/SituacaoImovelEnum.cs",\
2026-08-26T17:45:05.6018388Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/SituacaoProcessamentoEnum.cs",\
2026-08-26T17:45:05.6018599Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoCampoEnum.cs",\
2026-08-26T17:45:05.6018811Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoComodoEnum.cs",\
2026-08-26T17:45:05.6019016Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoImovelEnum.cs",\
2026-08-26T17:45:05.6019230Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Enums/TipoMatriculaEnum.cs",\
2026-08-26T17:45:05.6019459Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAgrupamentoVendaImovelRepository.cs",\
2026-08-26T17:45:05.6019705Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaArquivoLoteRepository.cs",\
2026-08-26T17:45:05.6019940Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaFotoImovelRepository.cs",\
2026-08-26T17:45:05.6020177Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaFotoLoteRepository.cs",\
2026-08-26T17:45:05.6020410Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAuditoriaUsuarioRepository.cs",\
2026-08-26T17:45:05.6020641Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IAvaliacaoImovelRepository.cs",\
2026-08-26T17:45:05.6020867Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IComodoImovelRepository.cs",\
2026-08-26T17:45:05.6021204Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IControleProcessamentoRepository.cs",\
2026-08-26T17:45:05.6021542Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IDadoContabilRepository.cs",\
2026-08-26T17:45:05.6021777Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IFotoImovelRepository.cs",\
2026-08-26T17:45:05.6022004Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IGeradorHistorico.cs",\
2026-08-26T17:45:05.6022222Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IImovelRepository.cs",\
2026-08-26T17:45:05.6022460Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IMatriculaImovelRepository.cs",\
2026-08-26T17:45:05.6022699Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IMensagemControleProcessamentoRepository.cs",\
2026-08-26T17:45:05.6022941Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Interfaces/IRotinaProcessamentoRepository.cs",\
2026-08-26T17:45:05.6023869Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/BaseArquivoLayout.cs",\
2026-08-26T17:45:05.6024124Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/SiaciLayout.cs",\
2026-08-26T17:45:05.6024335Z "/opt/ads-agent/_work/6/s/src/Simov.Domain/Layouts/SiopiLayout.cs"
2026-08-26T17:45:05.6024407Z 
2026-08-26T17:45:05.6024608Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:45:05.6024813Z "/opt/ads-agent/_work/6/.sonarqube/out/1"
2026-08-26T17:45:05.6025048Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:45:05.6025274Z "/opt/ads-agent/_work/6/.sonarqube/out/1/Issues.json"
2026-08-26T17:45:05.6025390Z 
2026-08-26T17:45:05.6025743Z 5E55366D-25CB-4B0F-BAF4-738003A18ED2.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod1
2026-08-26T17:45:05.6026091Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectKey=SIMOV-imoveiscaixa-batch:0847F1F3-B5DA-4FC3-8EEF-882D75A674FD
2026-08-26T17:45:05.6026370Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectName=Simov.Application
2026-08-26T17:45:05.6026650Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:45:05.6026905Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.sourceEncoding=utf-8
2026-08-26T17:45:05.6027125Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.sources=\
2026-08-26T17:45:05.6027361Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Contexts/FileProcessingContext.cs",\
2026-08-26T17:45:05.6027617Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Contexts/SiicoCallCounterContext.cs",\
2026-08-26T17:45:05.6027856Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/AvaliacaoImovelDto.cs",\
2026-08-26T17:45:05.6028101Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/DadoContabilDto.cs",\
2026-08-26T17:45:05.6028346Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/EnderecoDto.cs",\
2026-08-26T17:45:05.6028572Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/ImovelDto.cs",\
2026-08-26T17:45:05.6028784Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/MatriculaImovelDto.cs",\
2026-08-26T17:45:05.6029005Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/MunicipioDto.cs",\
2026-08-26T17:45:05.6029227Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/SiaciDDQDto.cs",\
2026-08-26T17:45:05.6029453Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Dtos/TipoLogradouroDto.cs",\
2026-08-26T17:45:05.6029777Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ICargaFotoImovelService.cs",\
2026-08-26T17:45:05.6030108Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ICargaImovelService.cs",\
2026-08-26T17:45:05.6030337Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IFileService.cs",\
2026-08-26T17:45:05.6030560Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSiaciUseCase.cs",\
2026-08-26T17:45:05.6030794Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSimilFotoUseCase.cs",\
2026-08-26T17:45:05.6031026Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSimilUseCase.cs",\
2026-08-26T17:45:05.6031254Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IImovelSiopiUseCase.cs",\
2026-08-26T17:45:05.6031484Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ILeituraService.cs",\
2026-08-26T17:45:05.6031733Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ILogProcessamentoService.cs",\
2026-08-26T17:45:05.6031975Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IMapperDataService.cs",\
2026-08-26T17:45:05.6032211Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/ISiaciDDQUseCase.cs",\
2026-08-26T17:45:05.6032452Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Interfaces/IWorkerImovelService.cs",\
2026-08-26T17:45:05.6032685Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/CargaImovelService.cs",\
2026-08-26T17:45:05.6032916Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/FileService.cs",\
2026-08-26T17:45:05.6033208Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/LeituraService.cs",\
2026-08-26T17:45:05.6033447Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/LogProcessamentoService.cs",\
2026-08-26T17:45:05.6033767Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/MapperDataService.cs",\
2026-08-26T17:45:05.6034002Z "/opt/ads-agent/_work/6/s/src/Simov.Application/Services/WorkerImovelService.cs",\
2026-08-26T17:45:05.6034232Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSiaciUseCase.cs",\
2026-08-26T17:45:05.6034474Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSimilFotoUseCase.cs",\
2026-08-26T17:45:05.6034778Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSimilUseCase.cs",\
2026-08-26T17:45:05.6035009Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/ImovelSiopiUseCase.cs",\
2026-08-26T17:45:05.6035268Z "/opt/ads-agent/_work/6/s/src/Simov.Application/UseCases/SiaciDDQUseCase.cs"
2026-08-26T17:45:05.6035554Z 
2026-08-26T17:45:05.6035777Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:45:05.6036009Z "/opt/ads-agent/_work/6/.sonarqube/out/2"
2026-08-26T17:45:05.6036234Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:45:05.6036469Z "/opt/ads-agent/_work/6/.sonarqube/out/2/Issues.json"
2026-08-26T17:45:05.6036535Z 
2026-08-26T17:45:05.6036934Z 0847F1F3-B5DA-4FC3-8EEF-882D75A674FD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod2
2026-08-26T17:45:05.6037263Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectKey=SIMOV-imoveiscaixa-batch:D745E52F-7A66-4C38-B30D-3A27EA75CCCE
2026-08-26T17:45:05.6037530Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectName=Simov.Core
2026-08-26T17:45:05.6038019Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:45:05.6038375Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.sourceEncoding=utf-8
2026-08-26T17:45:05.6038656Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.sources=\
2026-08-26T17:45:05.6038882Z 
2026-08-26T17:45:05.6038949Z 
2026-08-26T17:45:05.6039230Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:45:05.6039444Z "/opt/ads-agent/_work/6/.sonarqube/out/3"
2026-08-26T17:45:05.6039660Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:45:05.6039997Z "/opt/ads-agent/_work/6/.sonarqube/out/3/Issues.json"
2026-08-26T17:45:05.6040064Z 
2026-08-26T17:45:05.6040307Z D745E52F-7A66-4C38-B30D-3A27EA75CCCE.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod3
2026-08-26T17:45:05.6040652Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectKey=SIMOV-imoveiscaixa-batch:FBCB055E-203B-4979-BB94-B02AE276DE0B
2026-08-26T17:45:05.6040904Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectName=Simov.Domain
2026-08-26T17:45:05.6041158Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:45:05.6041519Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.sourceEncoding=utf-8
2026-08-26T17:45:05.6041738Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.sources=\
2026-08-26T17:45:05.6041811Z 
2026-08-26T17:45:05.6041856Z 
2026-08-26T17:45:05.6042155Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:45:05.6042369Z "/opt/ads-agent/_work/6/.sonarqube/out/4"
2026-08-26T17:45:05.6042576Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:45:05.6042890Z "/opt/ads-agent/_work/6/.sonarqube/out/4/Issues.json"
2026-08-26T17:45:05.6042955Z 
2026-08-26T17:45:05.6043180Z FBCB055E-203B-4979-BB94-B02AE276DE0B.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod4
2026-08-26T17:45:05.6043486Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectKey=SIMOV-imoveiscaixa-batch:D6E1F89D-8BFA-426E-BC94-C1182DBD0621
2026-08-26T17:45:05.6043827Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectName=Simov.Application
2026-08-26T17:45:05.6044229Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:45:05.6044776Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.sourceEncoding=utf-8
2026-08-26T17:45:05.6045186Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.sources=\
2026-08-26T17:45:05.6045254Z 
2026-08-26T17:45:05.6045288Z 
2026-08-26T17:45:05.6045478Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:45:05.6045674Z "/opt/ads-agent/_work/6/.sonarqube/out/5"
2026-08-26T17:45:05.6045938Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:45:05.6046142Z "/opt/ads-agent/_work/6/.sonarqube/out/5/Issues.json"
2026-08-26T17:45:05.6046262Z 
2026-08-26T17:45:05.6046487Z D6E1F89D-8BFA-426E-BC94-C1182DBD0621.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod5
2026-08-26T17:45:05.6046792Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectKey=SIMOV-imoveiscaixa-batch:AD78E470-A67C-4901-A53F-E3D7D40350CD
2026-08-26T17:45:05.6047060Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:45:05.6047317Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:45:05.6047551Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.sourceEncoding=utf-8
2026-08-26T17:45:05.6047755Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.sources=\
2026-08-26T17:45:05.6047965Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Common/BaseRepository.cs",\
2026-08-26T17:45:05.6048184Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Common/UnitOfWork.cs",\
2026-08-26T17:45:05.6048412Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Interceptor/HistoricosInterceptor.cs",\
2026-08-26T17:45:05.6048672Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AgrupamentoVendaImovelConfiguration.cs",\
2026-08-26T17:45:05.6048922Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaArquivoLoteConfiguration.cs",\
2026-08-26T17:45:05.6049170Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaFotoImovelConfiguration.cs",\
2026-08-26T17:45:05.6049416Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaFotoLoteConfiguration.cs",\
2026-08-26T17:45:05.6049661Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AuditoriaUsuarioConfiguration.cs",\
2026-08-26T17:45:05.6049902Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/AvaliacaoImovelConfiguration.cs",\
2026-08-26T17:45:05.6050138Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ComodoImovelConfiguration.cs",\
2026-08-26T17:45:05.6050381Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ControleProcessamentoConfiguration.cs",\
2026-08-26T17:45:05.6050623Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/DadoContabilConfiguration.cs",\
2026-08-26T17:45:05.6050862Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/FotoImovelConfiguration.cs",\
2026-08-26T17:45:05.6051115Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoAgrupamentoVendaImovelConfiguration.cs",\
2026-08-26T17:45:05.6051372Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoAvaliacaoImovelConfiguration.cs",\
2026-08-26T17:45:05.6051621Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoComodoImovelConfiguration.cs",\
2026-08-26T17:45:05.6051866Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoDadoContabilConfiguration.cs",\
2026-08-26T17:45:05.6052223Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoImovelConfiguration.cs",\
2026-08-26T17:45:05.6052486Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/HistoricoMatriculaImovelConfiguration.cs",\
2026-08-26T17:45:05.6052731Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/ImovelConfiguration.cs",\
2026-08-26T17:45:05.6052977Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/MatriculaImovelConfiguration.cs",\
2026-08-26T17:45:05.6053226Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/MensagemControleProcessamentoConfiguration.cs",\
2026-08-26T17:45:05.6053515Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Mappings/RotinaProcessamentoConfiguration.cs",\
2026-08-26T17:45:05.6053863Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AgrupamentoVendaImovelRepository.cs",\
2026-08-26T17:45:05.6054127Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaArquivoLoteRepository.cs",\
2026-08-26T17:45:05.6054378Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaFotoImovelRepository.cs",\
2026-08-26T17:45:05.6054639Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaFotoLoteRepository.cs",\
2026-08-26T17:45:05.6054935Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AuditoriaUsuarioRepository.cs",\
2026-08-26T17:45:05.6055184Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/AvaliacaoImovelRepository.cs",\
2026-08-26T17:45:05.6055431Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ComodoImovelRepository.cs",\
2026-08-26T17:45:05.6055693Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ControleProcessamentoRepository.cs",\
2026-08-26T17:45:05.6055945Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/DadoContabilRepository.cs",\
2026-08-26T17:45:05.6056182Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/FotoImovelRepository.cs",\
2026-08-26T17:45:05.6056413Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/ImovelRepository.cs",\
2026-08-26T17:45:05.6056648Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/MatriculaImovelRepository.cs",\
2026-08-26T17:45:05.6056908Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/MensagemControleProcessamentoRepository.cs",\
2026-08-26T17:45:05.6057163Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/Repositories/RotinaProcessamentoRepository.cs",\
2026-08-26T17:45:05.6057387Z "/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF/SimovDbContext.cs"
2026-08-26T17:45:05.6057456Z 
2026-08-26T17:45:05.6057647Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:45:05.6057838Z "/opt/ads-agent/_work/6/.sonarqube/out/6"
2026-08-26T17:45:05.6058042Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:45:05.6058245Z "/opt/ads-agent/_work/6/.sonarqube/out/6/Issues.json"
2026-08-26T17:45:05.6058313Z 
2026-08-26T17:45:05.6058585Z AD78E470-A67C-4901-A53F-E3D7D40350CD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod6
2026-08-26T17:45:05.6058910Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectKey=SIMOV-imoveiscaixa-batch:B904AD47-4763-413C-9324-7889FD92EFA6
2026-08-26T17:45:05.6059171Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectName=Simov.Batch
2026-08-26T17:45:05.6059418Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:45:05.6059648Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.sourceEncoding=utf-8
2026-08-26T17:45:05.6059855Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.sources=\
2026-08-26T17:45:05.6060076Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/AddHeadersHttpClient.cs",\
2026-08-26T17:45:05.6060309Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/ConnectionsConfiguration.cs",\
2026-08-26T17:45:05.6060541Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/HttpClientConfiguration.cs",\
2026-08-26T17:45:05.6060765Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/IApiSiisoRestPrivado.cs",\
2026-08-26T17:45:05.6060991Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Configuration/UseCasesConfiguration.cs",\
2026-08-26T17:45:05.6061218Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderImoveisSiaci.cs",\
2026-08-26T17:45:05.6061437Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderImoveisSiopi.cs",\
2026-08-26T17:45:05.6061653Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Loaders/LoaderLeilaoSiaciDDQ.cs",\
2026-08-26T17:45:05.6061860Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Program.cs",\
2026-08-26T17:45:05.6062119Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Workers/WorkerFotoImoveisSimil.cs",\
2026-08-26T17:45:05.6062339Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Workers/WorkerImoveisSimil.cs",\
2026-08-26T17:45:05.6062571Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/Simov.Batch.GlobalUsings.g.cs",\
2026-08-26T17:45:05.6062885Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/.NETCoreApp,Version=v8.0.AssemblyAttributes.cs",\
2026-08-26T17:45:05.6063151Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/Simov.Batch.AssemblyInfo.cs",\
2026-08-26T17:45:05.6063377Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/appsettings.Development.json",\
2026-08-26T17:45:05.6063617Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/appsettings.json",\
2026-08-26T17:45:05.6063902Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/Properties/launchSettings.json",\
2026-08-26T17:45:05.6064304Z "/opt/ads-agent/_work/6/s/src/Simov.Batch/obj/Release/net8.0/apphost"
2026-08-26T17:45:05.6064385Z 
2026-08-26T17:45:05.6064594Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:45:05.6064787Z "/opt/ads-agent/_work/6/.sonarqube/out/7"
2026-08-26T17:45:05.6064996Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:45:05.6065194Z "/opt/ads-agent/_work/6/.sonarqube/out/7/Issues.json"
2026-08-26T17:45:05.6065254Z 
2026-08-26T17:45:05.6065476Z B904AD47-4763-413C-9324-7889FD92EFA6.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod7
2026-08-26T17:45:05.6065781Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectKey=SIMOV-imoveiscaixa-batch:6679F22B-144A-4C59-A28C-2A87F31E3915
2026-08-26T17:45:05.6066195Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectName=Simov.Core
2026-08-26T17:45:05.6066447Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:45:05.6066683Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.sourceEncoding=utf-8
2026-08-26T17:45:05.6066895Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.sources=\
2026-08-26T17:45:05.6066964Z 
2026-08-26T17:45:05.6067010Z 
2026-08-26T17:45:05.6067204Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:45:05.6067398Z "/opt/ads-agent/_work/6/.sonarqube/out/8"
2026-08-26T17:45:05.6067611Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:45:05.6067818Z "/opt/ads-agent/_work/6/.sonarqube/out/8/Issues.json"
2026-08-26T17:45:05.6067880Z 
2026-08-26T17:45:05.6068104Z 6679F22B-144A-4C59-A28C-2A87F31E3915.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod8
2026-08-26T17:45:05.6068413Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectKey=SIMOV-imoveiscaixa-batch:EC78B0BC-170C-482C-867B-C5402B449403
2026-08-26T17:45:05.6068673Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectName=Simov.Core
2026-08-26T17:45:05.6069048Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:45:05.6069280Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.sourceEncoding=utf-8
2026-08-26T17:45:05.6069528Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.sources=\
2026-08-26T17:45:05.6069619Z 
2026-08-26T17:45:05.6069654Z 
2026-08-26T17:45:05.6069872Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:45:05.6070204Z "/opt/ads-agent/_work/6/.sonarqube/out/9"
2026-08-26T17:45:05.6070504Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:45:05.6070736Z "/opt/ads-agent/_work/6/.sonarqube/out/9/Issues.json"
2026-08-26T17:45:05.6070869Z 
2026-08-26T17:45:05.6071142Z EC78B0BC-170C-482C-867B-C5402B449403.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod9
2026-08-26T17:45:05.6071470Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectKey=SIMOV-imoveiscaixa-batch:1B2C05E0-E98F-477C-931D-923BBE79AE4E
2026-08-26T17:45:05.6071753Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectName=Simov.Domain
2026-08-26T17:45:05.6072079Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:45:05.6072337Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.sourceEncoding=utf-8
2026-08-26T17:45:05.6072565Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.sources=\
2026-08-26T17:45:05.6072662Z 
2026-08-26T17:45:05.6072702Z 
2026-08-26T17:45:05.6072917Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:45:05.6073134Z "/opt/ads-agent/_work/6/.sonarqube/out/10"
2026-08-26T17:45:05.6073367Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:45:05.6073597Z "/opt/ads-agent/_work/6/.sonarqube/out/10/Issues.json"
2026-08-26T17:45:05.6074519Z 
2026-08-26T17:45:05.6074800Z 1B2C05E0-E98F-477C-931D-923BBE79AE4E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod10
2026-08-26T17:45:05.6075138Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectKey=SIMOV-imoveiscaixa-batch:A180ED2D-1521-44A6-B6EA-5DDEC55D2C17
2026-08-26T17:45:05.6075433Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectName=Simov.Core
2026-08-26T17:45:05.6075714Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:45:05.6075976Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.sourceEncoding=utf-8
2026-08-26T17:45:05.6076209Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.sources=\
2026-08-26T17:45:05.6076275Z 
2026-08-26T17:45:05.6076342Z 
2026-08-26T17:45:05.6076561Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:45:05.6076783Z "/opt/ads-agent/_work/6/.sonarqube/out/11"
2026-08-26T17:45:05.6077016Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:45:05.6077259Z "/opt/ads-agent/_work/6/.sonarqube/out/11/Issues.json"
2026-08-26T17:45:05.6077320Z 
2026-08-26T17:45:05.6077574Z A180ED2D-1521-44A6-B6EA-5DDEC55D2C17.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod11
2026-08-26T17:45:05.6077908Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectKey=SIMOV-imoveiscaixa-batch:A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E
2026-08-26T17:45:05.6078225Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectName=Simov.Domain
2026-08-26T17:45:05.6078498Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:45:05.6078743Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.sourceEncoding=utf-8
2026-08-26T17:45:05.6078969Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.sources=\
2026-08-26T17:45:05.6079034Z 
2026-08-26T17:45:05.6079100Z 
2026-08-26T17:45:05.6079312Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:45:05.6079527Z "/opt/ads-agent/_work/6/.sonarqube/out/12"
2026-08-26T17:45:05.6079760Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:45:05.6079988Z "/opt/ads-agent/_work/6/.sonarqube/out/12/Issues.json"
2026-08-26T17:45:05.6080051Z 
2026-08-26T17:45:05.6080298Z A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod12
2026-08-26T17:45:05.6080631Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectKey=SIMOV-imoveiscaixa-batch:00300450-28FA-4EA9-8A96-181ED44DCA26
2026-08-26T17:45:05.6080920Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectName=Simov.Application
2026-08-26T17:45:05.6081203Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:45:05.6081465Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.sourceEncoding=utf-8
2026-08-26T17:45:05.6081697Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.sources=\
2026-08-26T17:45:05.6081788Z 
2026-08-26T17:45:05.6081822Z 
2026-08-26T17:45:05.6082039Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:45:05.6082251Z "/opt/ads-agent/_work/6/.sonarqube/out/13"
2026-08-26T17:45:05.6082483Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:45:05.6082709Z "/opt/ads-agent/_work/6/.sonarqube/out/13/Issues.json"
2026-08-26T17:45:05.6082857Z 
2026-08-26T17:45:05.6083102Z 00300450-28FA-4EA9-8A96-181ED44DCA26.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod13
2026-08-26T17:45:05.6083434Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectKey=SIMOV-imoveiscaixa-batch:1393E257-1007-43DE-B94C-0B0508C0B309
2026-08-26T17:45:05.6083793Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:45:05.6084090Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:45:05.6084352Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.sourceEncoding=utf-8
2026-08-26T17:45:05.6084585Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.sources=\
2026-08-26T17:45:05.6084718Z 
2026-08-26T17:45:05.6084754Z 
2026-08-26T17:45:05.6084969Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:45:05.6085188Z "/opt/ads-agent/_work/6/.sonarqube/out/14"
2026-08-26T17:45:05.6085422Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:45:05.6085649Z "/opt/ads-agent/_work/6/.sonarqube/out/14/Issues.json"
2026-08-26T17:45:05.6085740Z 
2026-08-26T17:45:05.6085984Z 1393E257-1007-43DE-B94C-0B0508C0B309.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod14
2026-08-26T17:45:05.6086307Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectKey=SIMOV-imoveiscaixa-batch:5BE00443-BD63-4C9F-A707-406F2AC94762
2026-08-26T17:45:05.6086587Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectName=Simov.Core
2026-08-26T17:45:05.6086855Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:45:05.6087112Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.sourceEncoding=utf-8
2026-08-26T17:45:05.6087337Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.sources=\
2026-08-26T17:45:05.6087402Z 
2026-08-26T17:45:05.6087463Z 
2026-08-26T17:45:05.6087674Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:45:05.6087988Z "/opt/ads-agent/_work/6/.sonarqube/out/15"
2026-08-26T17:45:05.6088226Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:45:05.6088451Z "/opt/ads-agent/_work/6/.sonarqube/out/15/Issues.json"
2026-08-26T17:45:05.6088510Z 
2026-08-26T17:45:05.6088754Z 5BE00443-BD63-4C9F-A707-406F2AC94762.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod15
2026-08-26T17:45:05.6089080Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectKey=SIMOV-imoveiscaixa-batch:A79CA783-37A2-49D3-B56C-D9102F046AF9
2026-08-26T17:45:05.6089395Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectName=Simov.Domain
2026-08-26T17:45:05.6089662Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:45:05.6089919Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.sourceEncoding=utf-8
2026-08-26T17:45:05.6090148Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.sources=\
2026-08-26T17:45:05.6090212Z 
2026-08-26T17:45:05.6090277Z 
2026-08-26T17:45:05.6090492Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:45:05.6090703Z "/opt/ads-agent/_work/6/.sonarqube/out/16"
2026-08-26T17:45:05.6090970Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:45:05.6091221Z "/opt/ads-agent/_work/6/.sonarqube/out/16/Issues.json"
2026-08-26T17:45:05.6091281Z 
2026-08-26T17:45:05.6091528Z A79CA783-37A2-49D3-B56C-D9102F046AF9.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod16
2026-08-26T17:45:05.6091854Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectKey=SIMOV-imoveiscaixa-batch:51ABFD24-E14F-4155-B9D7-CDBD0E536AAB
2026-08-26T17:45:05.6092146Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectName=Simov.Application
2026-08-26T17:45:05.6092428Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:45:05.6092689Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.sourceEncoding=utf-8
2026-08-26T17:45:05.6093000Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.sources=\
2026-08-26T17:45:05.6093064Z 
2026-08-26T17:45:05.6093098Z 
2026-08-26T17:45:05.6093311Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:45:05.6093531Z "/opt/ads-agent/_work/6/.sonarqube/out/17"
2026-08-26T17:45:05.6093826Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:45:05.6094088Z "/opt/ads-agent/_work/6/.sonarqube/out/17/Issues.json"
2026-08-26T17:45:05.6094151Z 
2026-08-26T17:45:05.6094398Z 51ABFD24-E14F-4155-B9D7-CDBD0E536AAB.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod17
2026-08-26T17:45:05.6095021Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectKey=SIMOV-imoveiscaixa-batch:F2842708-9CF5-4649-B3A8-6D39E5E01B77
2026-08-26T17:45:05.6095353Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:45:05.6095639Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:45:05.6095903Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.sourceEncoding=utf-8
2026-08-26T17:45:05.6096134Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.sources=\
2026-08-26T17:45:05.6096225Z 
2026-08-26T17:45:05.6096261Z 
2026-08-26T17:45:05.6096474Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:45:05.6096695Z "/opt/ads-agent/_work/6/.sonarqube/out/18"
2026-08-26T17:45:05.6096925Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:45:05.6097146Z "/opt/ads-agent/_work/6/.sonarqube/out/18/Issues.json"
2026-08-26T17:45:05.6097252Z 
2026-08-26T17:45:05.6097661Z F2842708-9CF5-4649-B3A8-6D39E5E01B77.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod18
2026-08-26T17:45:05.6098046Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectKey=SIMOV-imoveiscaixa-batch:3C101C3B-D8C0-461B-B65B-B87A6F75F210
2026-08-26T17:45:05.6098349Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectName=Simov.Batch
2026-08-26T17:45:05.6098629Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:45:05.6098880Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.sourceEncoding=utf-8
2026-08-26T17:45:05.6099114Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.sources=\
2026-08-26T17:45:05.6099181Z 
2026-08-26T17:45:05.6099246Z 
2026-08-26T17:45:05.6099456Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:45:05.6099674Z "/opt/ads-agent/_work/6/.sonarqube/out/19"
2026-08-26T17:45:05.6099910Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:45:05.6100141Z "/opt/ads-agent/_work/6/.sonarqube/out/19/Issues.json"
2026-08-26T17:45:05.6100207Z 
2026-08-26T17:45:05.6100457Z 3C101C3B-D8C0-461B-B65B-B87A6F75F210.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod19
2026-08-26T17:45:05.6100816Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectKey=SIMOV-imoveiscaixa-batch:4E341BE0-BD46-427C-8912-6319C41C89BC
2026-08-26T17:45:05.6101107Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectName=TesteSimovBatch
2026-08-26T17:45:05.6101395Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/tests/TesteSimovBatch
2026-08-26T17:45:05.6101800Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.sourceEncoding=utf-8
2026-08-26T17:45:05.6102255Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.sources=
2026-08-26T17:45:05.6102679Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.tests=\
2026-08-26T17:45:05.6102940Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/AvaliacaoImovelDtoTests.cs",\
2026-08-26T17:45:05.6103328Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/DadoContabilDtoTests.cs",\
2026-08-26T17:45:05.6103880Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/ImovelDtoTests.cs",\
2026-08-26T17:45:05.6104173Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Dtos/MatriculaImovelDtoTests.cs",\
2026-08-26T17:45:05.6104456Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/CargaImovelServiceTests.cs",\
2026-08-26T17:45:05.6105056Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/FileServiceTests.cs",\
2026-08-26T17:45:05.6105440Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/LeituraSiaciServiceTests.cs",\
2026-08-26T17:45:05.6105726Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/LogProcessamentoServiceTests.cs",\
2026-08-26T17:45:05.6106741Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/MapperDataServiceTests.cs",\
2026-08-26T17:45:05.6107128Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/Services/WorkerImovelServiceTests.cs",\
2026-08-26T17:45:05.6107566Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSiaciPreCadastroUseCaseTests.cs",\
2026-08-26T17:45:05.6107974Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSimilFotoUseCaseTests.cs",\
2026-08-26T17:45:05.6108254Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSimilUseCaseTests.cs",\
2026-08-26T17:45:05.6108530Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/ImovelSiopiUseCaseTests.cs",\
2026-08-26T17:45:05.6108801Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Application/UseCases/SiaciDDQUseCaseTests.cs",\
2026-08-26T17:45:05.6109068Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Batch/LoaderImoveisSiopiTests.cs",\
2026-08-26T17:45:05.6109322Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/CargaImoveisSiaciTests.cs",\
2026-08-26T17:45:05.6109584Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Configuration/AddHeadersHttpClientTests.cs",\
2026-08-26T17:45:05.6109859Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Configuration/ConnectionsConfigurationTest.cs",\
2026-08-26T17:45:05.6110122Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Contexts/FileProcessingContextTests.cs",\
2026-08-26T17:45:05.6110414Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Contexts/SiicoCallCounterContextTests.cs",\
2026-08-26T17:45:05.6110677Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/DomainObjects/EntityTests.cs",\
2026-08-26T17:45:05.6111051Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/DomainObjects/IAggregateRootTests.cs",\
2026-08-26T17:45:05.6111326Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/CancellationExceptionTests.cs",\
2026-08-26T17:45:05.6111607Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/EntityValidationExceptionTests.cs",\
2026-08-26T17:45:05.6111942Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/GenericExceptionTests.cs",\
2026-08-26T17:45:05.6112216Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/NotFoundExceptionTests.cs",\
2026-08-26T17:45:05.6112489Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/ProcessamentoExceptionTests.cs",\
2026-08-26T17:45:05.6112759Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/RelatedAggregateExceptionTests.cs",\
2026-08-26T17:45:05.6113031Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Exceptions/UnauthorizedExceptionTests.cs",\
2026-08-26T17:45:05.6113300Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siico/ApiSiicoRestPrivadoTests.cs",\
2026-08-26T17:45:05.6113568Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siico/ApiSiicoRestPublicoTests.cs",\
2026-08-26T17:45:05.6113912Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Api/Siiso/ApiSiisoRestPublicoTests.cs",\
2026-08-26T17:45:05.6114193Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/AutenticacarSsoTests.cs",\
2026-08-26T17:45:05.6114458Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/BairroDetalhadoSiicoTests.cs",\
2026-08-26T17:45:05.6114712Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/BairroSiicoTests.cs",\
2026-08-26T17:45:05.6115085Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/MunicipioCompletoSiicoTests.cs",\
2026-08-26T17:45:05.6115475Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/ResponseGenericoTests.cs",\
2026-08-26T17:45:05.6115800Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Core/Rest/Dto/Siico/CepSiicoTests.cs",\
2026-08-26T17:45:05.6116067Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Domain/Layouts/BaseArquivoLayoutTests.cs",\
2026-08-26T17:45:05.6116325Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/AgrupamentoVendaImovelTests.cs",\
2026-08-26T17:45:05.6116755Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/AvaliacaoImovelSiopiTests.cs",\
2026-08-26T17:45:05.6117034Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/ControleProcessamentoTests.cs",\
2026-08-26T17:45:05.6117329Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/DadoContabilTests.cs",\
2026-08-26T17:45:05.6117780Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoAgrupamentoVendaImovelTests.cs",\
2026-08-26T17:45:05.6118058Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoDadoContabilTests.cs",\
2026-08-26T17:45:05.6118416Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/HistoricoImovelTests.cs",\
2026-08-26T17:45:05.6118779Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/ImovelTests.cs",\
2026-08-26T17:45:05.6119035Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/MatriculaImovelSiopiTests.cs",\
2026-08-26T17:45:05.6119301Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/MensagemControleProcessamentoTests.cs",\
2026-08-26T17:45:05.6119564Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/RotinaProcessamentoTests.cs",\
2026-08-26T17:45:05.6119818Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Entities/SiopiImovelTests.cs",\
2026-08-26T17:45:05.6120129Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ArquivoSiaciFake.cs",\
2026-08-26T17:45:05.6120470Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ImovelDtoFake.cs",\
2026-08-26T17:45:05.6120734Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/ImovelFake.cs",\
2026-08-26T17:45:05.6121099Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/LayoutArquivoFake.cs",\
2026-08-26T17:45:05.6121369Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Fakes/Siico/ResponsesFake.cs",\
2026-08-26T17:45:05.6121721Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/InfraDataEF/HistoricosInterceptorTests.cs",\
2026-08-26T17:45:05.6122009Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/InfraDataEF/SimovDbContextTests.cs",\
2026-08-26T17:45:05.6122254Z "/opt/ads-agent/_work/6/s/tests/TesteSimovBatch/Layouts/SiaciLayoutTests.cs"
2026-08-26T17:45:05.6122356Z 
2026-08-26T17:45:05.6122574Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:45:05.6122796Z "/opt/ads-agent/_work/6/.sonarqube/out/20"
2026-08-26T17:45:05.6123035Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:45:05.6123378Z "/opt/ads-agent/_work/6/.sonarqube/out/20/Issues.json"
2026-08-26T17:45:05.6123444Z 
2026-08-26T17:45:05.6123811Z 4E341BE0-BD46-427C-8912-6319C41C89BC.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod20
2026-08-26T17:45:05.6124202Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectKey=SIMOV-imoveiscaixa-batch:0DC13198-1AC4-46C6-B9B3-E2987B8496D5
2026-08-26T17:45:05.6124488Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectName=Simov.Core
2026-08-26T17:45:05.6124761Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Core
2026-08-26T17:45:05.6125015Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.sourceEncoding=utf-8
2026-08-26T17:45:05.6125246Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.sources=\
2026-08-26T17:45:05.6125309Z 
2026-08-26T17:45:05.6125374Z 
2026-08-26T17:45:05.6125594Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:45:05.6126007Z "/opt/ads-agent/_work/6/.sonarqube/out/21"
2026-08-26T17:45:05.6126263Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:45:05.6126534Z "/opt/ads-agent/_work/6/.sonarqube/out/21/Issues.json"
2026-08-26T17:45:05.6126656Z 
2026-08-26T17:45:05.6127016Z 0DC13198-1AC4-46C6-B9B3-E2987B8496D5.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod21
2026-08-26T17:45:05.6127360Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectKey=SIMOV-imoveiscaixa-batch:BA15777F-9613-49A5-8C5F-8CBFA5F86619
2026-08-26T17:45:05.6127656Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectName=Simov.Domain
2026-08-26T17:45:05.6127938Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Domain
2026-08-26T17:45:05.6128233Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.sourceEncoding=utf-8
2026-08-26T17:45:05.6128468Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.sources=\
2026-08-26T17:45:05.6128578Z 
2026-08-26T17:45:05.6128615Z 
2026-08-26T17:45:05.6128835Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:45:05.6129056Z "/opt/ads-agent/_work/6/.sonarqube/out/22"
2026-08-26T17:45:05.6129290Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:45:05.6129553Z "/opt/ads-agent/_work/6/.sonarqube/out/22/Issues.json"
2026-08-26T17:45:05.6129615Z 
2026-08-26T17:45:05.6129955Z BA15777F-9613-49A5-8C5F-8CBFA5F86619.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod22
2026-08-26T17:45:05.6130310Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectKey=SIMOV-imoveiscaixa-batch:48A485AE-9F33-C9A7-979C-54916B65C32E
2026-08-26T17:45:05.6130602Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectName=Simov.Application
2026-08-26T17:45:05.6130880Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Application
2026-08-26T17:45:05.6131144Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.sourceEncoding=utf-8
2026-08-26T17:45:05.6131372Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.sources=\
2026-08-26T17:45:05.6131466Z 
2026-08-26T17:45:05.6131502Z 
2026-08-26T17:45:05.6131715Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:45:05.6131933Z "/opt/ads-agent/_work/6/.sonarqube/out/23"
2026-08-26T17:45:05.6132166Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:45:05.6132392Z "/opt/ads-agent/_work/6/.sonarqube/out/23/Issues.json"
2026-08-26T17:45:05.6132485Z 
2026-08-26T17:45:05.6132730Z 48A485AE-9F33-C9A7-979C-54916B65C32E.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod23
2026-08-26T17:45:05.6133064Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectKey=SIMOV-imoveiscaixa-batch:309346D6-2461-4973-A29B-7A38A756C0DE
2026-08-26T17:45:05.6133480Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectName=Simov.Infra.Data.EF
2026-08-26T17:45:05.6133825Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Infra.Data.EF
2026-08-26T17:45:05.6134100Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.sourceEncoding=utf-8
2026-08-26T17:45:05.6134329Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.sources=\
2026-08-26T17:45:05.6134422Z 
2026-08-26T17:45:05.6134461Z 
2026-08-26T17:45:05.6134672Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:45:05.6134884Z "/opt/ads-agent/_work/6/.sonarqube/out/24"
2026-08-26T17:45:05.6135119Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:45:05.6135346Z "/opt/ads-agent/_work/6/.sonarqube/out/24/Issues.json"
2026-08-26T17:45:05.6135433Z 
2026-08-26T17:45:05.6135679Z 309346D6-2461-4973-A29B-7A38A756C0DE.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod24
2026-08-26T17:45:05.6136006Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectKey=SIMOV-imoveiscaixa-batch:4BF20498-1845-4781-82CB-E7783C0081FA
2026-08-26T17:45:05.6136291Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectName=Simov.Batch
2026-08-26T17:45:05.6136564Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/src/Simov.Batch
2026-08-26T17:45:05.6136829Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.sourceEncoding=utf-8
2026-08-26T17:45:05.6137184Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.sources=\
2026-08-26T17:45:05.6137249Z 
2026-08-26T17:45:05.6137312Z 
2026-08-26T17:45:05.6137524Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:45:05.6137740Z "/opt/ads-agent/_work/6/.sonarqube/out/25"
2026-08-26T17:45:05.6137978Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:45:05.6138209Z "/opt/ads-agent/_work/6/.sonarqube/out/25/Issues.json"
2026-08-26T17:45:05.6138269Z 
2026-08-26T17:45:05.6138515Z 4BF20498-1845-4781-82CB-E7783C0081FA.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod25
2026-08-26T17:45:05.6138840Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectKey=SIMOV-imoveiscaixa-batch:D54F14FF-8EEB-4EB8-994B-69D77DDB78FD
2026-08-26T17:45:05.6139161Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectName=TesteSimovBatch
2026-08-26T17:45:05.6139467Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.projectBaseDir=/opt/ads-agent/_work/6/s/tests/TesteSimovBatch
2026-08-26T17:45:05.6139729Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.sourceEncoding=utf-8
2026-08-26T17:45:05.6139951Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.sources=
2026-08-26T17:45:05.6140170Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.tests=\
2026-08-26T17:45:05.6140233Z 
2026-08-26T17:45:05.6140267Z 
2026-08-26T17:45:05.6140473Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.cs.analyzer.projectOutPaths=\
2026-08-26T17:45:05.6140714Z "/opt/ads-agent/_work/6/.sonarqube/out/26"
2026-08-26T17:45:05.6140944Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.cs.roslyn.reportFilePaths=\
2026-08-26T17:45:05.6141168Z "/opt/ads-agent/_work/6/.sonarqube/out/26/Issues.json"
2026-08-26T17:45:05.6141231Z 
2026-08-26T17:45:05.6141476Z D54F14FF-8EEB-4EB8-994B-69D77DDB78FD.sonar.working.directory=/opt/ads-agent/_work/6/.sonarqube/out/.sonar/mod26
2026-08-26T17:45:05.6141751Z sonar.host.url=https://sonar.apps.produtos4.caixa/
2026-08-26T17:45:05.6141969Z sonar.projectKey=SIMOV-imoveiscaixa-batch
2026-08-26T17:45:05.6142172Z sonar.projectName=SIMOV-imoveiscaixa-batch
2026-08-26T17:45:05.6142373Z sonar.projectVersion=1.0-SNAPSHOT
2026-08-26T17:45:05.6142522Z sonar.branch.name=CorrecoesSonar
2026-08-26T17:45:05.6142820Z sonar.scanner.metadataFilePath=/opt/ads-agent/_work/_temp/sonar/1.0-SNAPSHOT/f442c3b3-ec53-840d-3dab-bba3c4de61f5/report-task.txt
2026-08-26T17:45:05.6143120Z sonar.cs.opencover.reportsPaths=/opt/ads-agent/_work/_temp/**/coverage.opencover.xml
2026-08-26T17:45:05.6143396Z sonar.cs.vstest.reportsPaths=/opt/ads-agent/_work/_temp/**/*.trx
2026-08-26T17:45:05.6143563Z sonar.visualstudio.enable=false
2026-08-26T17:45:05.6143616Z 
2026-08-26T17:45:05.6145225Z sonar.modules=0B395246-F58A-479C-B0B1-C6A6045C6FD3,5E55366D-25CB-4B0F-BAF4-738003A18ED2,0847F1F3-B5DA-4FC3-8EEF-882D75A674FD,D745E52F-7A66-4C38-B30D-3A27EA75CCCE,FBCB055E-203B-4979-BB94-B02AE276DE0B,D6E1F89D-8BFA-426E-BC94-C1182DBD0621,AD78E470-A67C-4901-A53F-E3D7D40350CD,B904AD47-4763-413C-9324-7889FD92EFA6,6679F22B-144A-4C59-A28C-2A87F31E3915,EC78B0BC-170C-482C-867B-C5402B449403,1B2C05E0-E98F-477C-931D-923BBE79AE4E,A180ED2D-1521-44A6-B6EA-5DDEC55D2C17,A006FC4C-2263-4E65-B9B6-B6B7FFA2A02E,00300450-28FA-4EA9-8A96-181ED44DCA26,1393E257-1007-43DE-B94C-0B0508C0B309,5BE00443-BD63-4C9F-A707-406F2AC94762,A79CA783-37A2-49D3-B56C-D9102F046AF9,51ABFD24-E14F-4155-B9D7-CDBD0E536AAB,F2842708-9CF5-4649-B3A8-6D39E5E01B77,3C101C3B-D8C0-461B-B65B-B87A6F75F210,4E341BE0-BD46-427C-8912-6319C41C89BC,0DC13198-1AC4-46C6-B9B3-E2987B8496D5,BA15777F-9613-49A5-8C5F-8CBFA5F86619,48A485AE-9F33-C9A7-979C-54916B65C32E,309346D6-2461-4973-A29B-7A38A756C0DE,4BF20498-1845-4781-82CB-E7783C0081FA,D54F14FF-8EEB-4EB8-994B-69D77DDB78FD
2026-08-26T17:45:05.6145962Z 
2026-08-26T17:45:05.6145999Z 
2026-08-26T17:45:05.6146236Z ------------------------------------------------------------------------
2026-08-26T17:45:05.6146546Z 14:45:05.602  Writing processing summary to /opt/ads-agent/_work/6/.sonarqube/out/ProjectInfo.log
2026-08-26T17:45:05.6146755Z The SONAR_SCANNER_HOME environment variable is not required and will be ignored.
2026-08-26T17:45:05.6146987Z Calling the SonarScanner CLI...
2026-08-26T17:45:05.6164522Z Executing file /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/sonar-scanner-4.7.0.2747/bin/sonar-scanner
2026-08-26T17:45:05.6165068Z   Args: -Dsonar.scanAllFiles=true -Dproject.settings=/opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties --from=ScannerMSBuild/5.8 --debug <sensitive data removed>
2026-08-26T17:45:05.6165340Z   Working directory: /opt/ads-agent/_work/6
2026-08-26T17:45:05.6165511Z   Timeout (ms):-1
2026-08-26T17:45:05.6165654Z   Process id: 26845
2026-08-26T17:45:05.7333130Z 14:45:05.728 INFO: Scanner configuration file: /opt/ads-agent/_work/_tasks/SonarQubePrepare_15b84ca1-b62f-4a2a-a403-89b77a063157/5.8.0/dotnet-sonar-scanner-msbuild/sonar-scanner-4.7.0.2747/conf/sonar-scanner.properties
2026-08-26T17:45:05.7333968Z 14:45:05.730 INFO: Project root configuration file: /opt/ads-agent/_work/6/.sonarqube/out/sonar-project.properties
2026-08-26T17:45:05.7621230Z 14:45:05.761 INFO: SonarScanner 4.7.0.2747
2026-08-26T17:45:05.7621845Z 14:45:05.761 INFO: Java 11 Oracle Corporation (64-bit)
2026-08-26T17:45:05.7622194Z 14:45:05.761 INFO: Linux 5.18.5-100.fc35.x86_64 amd64
2026-08-26T17:45:05.8443933Z 14:45:05.843 DEBUG: keyStore is : 
2026-08-26T17:45:05.8444457Z 14:45:05.843 DEBUG: keyStore type is : pkcs12
2026-08-26T17:45:05.8445301Z 14:45:05.843 DEBUG: keyStore provider is : 
2026-08-26T17:45:05.8445477Z 14:45:05.843 DEBUG: init keystore
2026-08-26T17:45:05.8445655Z 14:45:05.843 DEBUG: init keymanager of type SunX509
2026-08-26T17:45:05.9104189Z 14:45:05.909 DEBUG: Create: /opt/ads-agent/cache-tools/.sonar/cache
2026-08-26T17:45:05.9106679Z 14:45:05.910 INFO: User cache: /opt/ads-agent/cache-tools/.sonar/cache
2026-08-26T17:45:05.9106962Z 14:45:05.910 DEBUG: Create: /opt/ads-agent/cache-tools/.sonar/cache/_tmp
2026-08-26T17:45:05.9123550Z 14:45:05.912 DEBUG: Extract sonar-scanner-api-batch in temp...
2026-08-26T17:45:05.9146320Z 14:45:05.914 DEBUG: Get bootstrap index...
2026-08-26T17:45:05.9146572Z 14:45:05.914 DEBUG: Download: https://sonar.apps.produtos4.caixa/batch/index
2026-08-26T17:45:06.0065187Z 14:45:06.005 INFO: ------------------------------------------------------------------------
2026-08-26T17:45:06.0065476Z 14:45:06.005 INFO: EXECUTION FAILURE
2026-08-26T17:45:06.0065742Z 14:45:06.006 INFO: ------------------------------------------------------------------------
2026-08-26T17:45:06.0065937Z 14:45:06.006 INFO: Total time: 0.299s
2026-08-26T17:45:06.0068263Z ##[error]14:45:06.005 ERROR: SonarQube server [https://sonar.apps.produtos4.caixa] can not be reached
2026-08-26T17:45:06.0068935Z 14:45:06.005 ERROR: SonarQube server [https://sonar.apps.produtos4.caixa] can not be reached
2026-08-26T17:45:06.0193510Z 14:45:06.018 INFO: Final Memory: 4M/68M
2026-08-26T17:45:06.0194187Z 14:45:06.018 INFO: ------------------------------------------------------------------------
2026-08-26T17:45:06.0194985Z ##[error]14:45:06.018 ERROR: Error during SonarScanner execution
org.sonarsource.scanner.api.internal.ScannerException: Unable to execute SonarScanner analysis
2026-08-26T17:45:06.0195684Z 14:45:06.018 ERROR: Error during SonarScanner execution
2026-08-26T17:45:06.0195887Z org.sonarsource.scanner.api.internal.ScannerException: Unable to execute SonarScanner analysis
2026-08-26T17:45:06.0197543Z ##[error]at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:85)
	at java.base/java.security.AccessController.doPrivileged(Native Method)
	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:74)
	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:70)
	at org.sonarsource.scanner.api.EmbeddedScanner.doStart(EmbeddedScanner.java:185)
	at org.sonarsource.scanner.api.EmbeddedScanner.start(EmbeddedScanner.java:123)
	at org.sonarsource.scanner.cli.Main.execute(Main.java:73)
	at org.sonarsource.scanner.cli.Main.main(Main.java:61)
Caused by: java.lang.IllegalStateException: Fail to get bootstrap index from server
2026-08-26T17:45:06.0199274Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:85)
2026-08-26T17:45:06.0199632Z 	at java.base/java.security.AccessController.doPrivileged(Native Method)
2026-08-26T17:45:06.0199982Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:74)
2026-08-26T17:45:06.0200453Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:70)
2026-08-26T17:45:06.0203236Z 	at org.sonarsource.scanner.api.EmbeddedScanner.doStart(EmbeddedScanner.java:185)
2026-08-26T17:45:06.0203567Z 	at org.sonarsource.scanner.api.EmbeddedScanner.start(EmbeddedScanner.java:123)
2026-08-26T17:45:06.0203918Z 	at org.sonarsource.scanner.cli.Main.execute(Main.java:73)
2026-08-26T17:45:06.0204125Z 	at org.sonarsource.scanner.cli.Main.main(Main.java:61)
2026-08-26T17:45:06.0204322Z Caused by: java.lang.IllegalStateException: Fail to get bootstrap index from server
2026-08-26T17:45:06.0205345Z ##[error]at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:42)
	at org.sonarsource.scanner.api.internal.JarDownloader.getScannerEngineFiles(JarDownloader.java:58)
	at org.sonarsource.scanner.api.internal.JarDownloader.download(JarDownloader.java:53)
	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:76)
	... 7 more
2026-08-26T17:45:06.0206134Z 	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:42)
2026-08-26T17:45:06.0206384Z 	at org.sonarsource.scanner.api.internal.JarDownloader.getScannerEngineFiles(JarDownloader.java:58)
2026-08-26T17:45:06.0206614Z 	at org.sonarsource.scanner.api.internal.JarDownloader.download(JarDownloader.java:53)
2026-08-26T17:45:06.0206864Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:76)
2026-08-26T17:45:06.0207058Z 	... 7 more
2026-08-26T17:45:06.0207569Z ##[error]Caused by: javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:128)
2026-08-26T17:45:06.0208211Z Caused by: javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:45:06.0208469Z 	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:128)
2026-08-26T17:45:06.0209080Z ##[error]at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:264)
	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:259)
2026-08-26T17:45:06.0209610Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
2026-08-26T17:45:06.0209821Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:264)
2026-08-26T17:45:06.0210032Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:259)
2026-08-26T17:45:06.0210498Z ##[error]at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1329)
2026-08-26T17:45:06.0210939Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1329)
2026-08-26T17:45:06.0211863Z ##[error]at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.onConsumeCertificate(CertificateMessage.java:1204)
	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.consume(CertificateMessage.java:1151)
	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:392)
	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:444)
	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:421)
2026-08-26T17:45:06.0212669Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.onConsumeCertificate(CertificateMessage.java:1204)
2026-08-26T17:45:06.0212939Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.consume(CertificateMessage.java:1151)
2026-08-26T17:45:06.0213200Z 	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:392)
2026-08-26T17:45:06.0213410Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:444)
2026-08-26T17:45:06.0213733Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:421)
2026-08-26T17:45:06.0214251Z ##[error]at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:178)
	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:164)
2026-08-26T17:45:06.0214739Z 	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:178)
2026-08-26T17:45:06.0214952Z 	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:164)
2026-08-26T17:45:06.0215332Z ##[error]at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1152)
2026-08-26T17:45:06.0215749Z 	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1152)
2026-08-26T17:45:06.0216230Z ##[error]at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1063)
	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:402)
2026-08-26T17:45:06.0216777Z 	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1063)
2026-08-26T17:45:06.0217008Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:402)
2026-08-26T17:45:06.0217643Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connectTls(RealConnection.java:336)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.establishProtocol(RealConnection.java:300)
2026-08-26T17:45:06.0218213Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connectTls(RealConnection.java:336)
2026-08-26T17:45:06.0218487Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.establishProtocol(RealConnection.java:300)
2026-08-26T17:45:06.0219341Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connect(RealConnection.java:185)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findConnection(ExchangeFinder.java:224)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findHealthyConnection(ExchangeFinder.java:108)
2026-08-26T17:45:06.0219996Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.RealConnection.connect(RealConnection.java:185)
2026-08-26T17:45:06.0220267Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findConnection(ExchangeFinder.java:224)
2026-08-26T17:45:06.0220544Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.findHealthyConnection(ExchangeFinder.java:108)
2026-08-26T17:45:06.0221052Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.find(ExchangeFinder.java:88)
2026-08-26T17:45:06.0221517Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ExchangeFinder.find(ExchangeFinder.java:88)
2026-08-26T17:45:06.0222154Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.Transmitter.newExchange(Transmitter.java:169)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ConnectInterceptor.intercept(ConnectInterceptor.java:41)
2026-08-26T17:45:06.0222707Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.Transmitter.newExchange(Transmitter.java:169)
2026-08-26T17:45:06.0223029Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.connection.ConnectInterceptor.intercept(ConnectInterceptor.java:41)
2026-08-26T17:45:06.0223533Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:45:06.0224146Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:45:06.0224636Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:45:06.0225214Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:45:06.0226000Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.cache.CacheInterceptor.intercept(CacheInterceptor.java:94)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:45:06.0226674Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.cache.CacheInterceptor.intercept(CacheInterceptor.java:94)
2026-08-26T17:45:06.0226943Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:45:06.0227206Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:45:06.0227681Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.BridgeInterceptor.intercept(BridgeInterceptor.java:93)
2026-08-26T17:45:06.0228154Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.BridgeInterceptor.intercept(BridgeInterceptor.java:93)
2026-08-26T17:45:06.0228645Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:45:06.0229080Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:45:06.0229585Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RetryAndFollowUpInterceptor.intercept(RetryAndFollowUpInterceptor.java:88)
2026-08-26T17:45:06.0230067Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RetryAndFollowUpInterceptor.intercept(RetryAndFollowUpInterceptor.java:88)
2026-08-26T17:45:06.0230831Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.getResponseWithInterceptorChain(RealCall.java:221)
2026-08-26T17:45:06.0231582Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
2026-08-26T17:45:06.0231847Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
2026-08-26T17:45:06.0232135Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.getResponseWithInterceptorChain(RealCall.java:221)
2026-08-26T17:45:06.0232666Z ##[error]at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.execute(RealCall.java:81)
	at org.sonarsource.scanner.api.internal.ServerConnection.callUrl(ServerConnection.java:115)
2026-08-26T17:45:06.0233165Z 	at org.sonarsource.scanner.api.internal.shaded.okhttp.RealCall.execute(RealCall.java:81)
2026-08-26T17:45:06.0233394Z 	at org.sonarsource.scanner.api.internal.ServerConnection.callUrl(ServerConnection.java:115)
2026-08-26T17:45:06.0233932Z ##[error]at org.sonarsource.scanner.api.internal.ServerConnection.downloadString(ServerConnection.java:99)
2026-08-26T17:45:06.0234395Z 	at org.sonarsource.scanner.api.internal.ServerConnection.downloadString(ServerConnection.java:99)
2026-08-26T17:45:06.0234832Z ##[error]at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:39)
	... 10 more
2026-08-26T17:45:06.0235360Z 	at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:39)
2026-08-26T17:45:06.0235552Z 	... 10 more
2026-08-26T17:45:06.0236114Z ##[error]Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:385)
2026-08-26T17:45:06.0236726Z Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:45:06.0237022Z 	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:385)
2026-08-26T17:45:06.0237740Z ##[error]at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:290)
	at java.base/sun.security.validator.Validator.validate(Validator.java:264)
	at java.base/sun.security.ssl.X509TrustManagerImpl.validate(X509TrustManagerImpl.java:321)
	at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:221)
2026-08-26T17:45:06.0238367Z 	at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:290)
2026-08-26T17:45:06.0238589Z 	at java.base/sun.security.validator.Validator.validate(Validator.java:264)
2026-08-26T17:45:06.0238815Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.validate(X509TrustManagerImpl.java:321)
2026-08-26T17:45:06.0239052Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:221)
2026-08-26T17:45:06.0239484Z ##[error]at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:129)
2026-08-26T17:45:06.0239943Z 	at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:129)
2026-08-26T17:45:06.0240420Z ##[error]at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1313)
	... 43 more
2026-08-26T17:45:06.0241004Z 	at java.base/sun.security.ssl.CertificateMessage$T13CertificateConsumer.checkServerCerts(CertificateMessage.java:1313)
2026-08-26T17:45:06.0241280Z 	... 43 more
2026-08-26T17:45:06.0241934Z ##[error]Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
	at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:141)
2026-08-26T17:45:06.0242467Z Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
2026-08-26T17:45:06.0242714Z 	at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:141)
2026-08-26T17:45:06.0243137Z ##[error]at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:126)
2026-08-26T17:45:06.0243581Z 	at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:126)
2026-08-26T17:45:06.0244102Z ##[error]at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
2026-08-26T17:45:06.0244697Z 	at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
2026-08-26T17:45:06.0245166Z ##[error]at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:380)
	... 49 more
2026-08-26T17:45:06.0245595Z 	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:380)
2026-08-26T17:45:06.0245767Z 	... 49 more
2026-08-26T17:45:06.0390955Z Process returned exit code 1
2026-08-26T17:45:06.0422932Z ##[error]The SonarScanner did not complete successfully
2026-08-26T17:45:06.0423950Z The SonarScanner did not complete successfully
2026-08-26T17:45:06.0424488Z ##[error]14:45:06.042  Post-processing failed. Exit code: 1
2026-08-26T17:45:06.0425340Z 14:45:06.042  Post-processing failed. Exit code: 1
2026-08-26T17:45:06.0521765Z ##[error]The process '/opt/ads-agent/cache-tools/.dotnet//dotnet' failed with exit code 1
2026-08-26T17:45:06.0556306Z ##[section]Finishing: Run Code Analysis
