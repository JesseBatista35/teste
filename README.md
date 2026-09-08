I0908 09:29:40.581107       1 version.go:31] "version info" version="" commit="1e11cd2" buildDate="2024-10-04T10:20:06Z" component="vaultenv"
I0908 09:29:40.581300       1 main.go:184] "azure key vault env injector initializing"
I0908 09:29:40.581455       1 main.go:253] "found original container command" cmd="/usr/bin/dotnet" args=["dotnet","api-gestao-documental.dll"]
I0908 09:29:40.581506       1 authentication.go:110] "checking if current auth service credentials are stale" url="http://akv2k8s-envinjector.akv2k8s.svc:80/auth/sigaq-api-gestao-documental/sigaq-api-gestao-documental-des-6b6998c89b-lt854?secret=akv2k8s-sigaq-api-gestao-documental-des"
I0908 09:29:45.654891       1 authentication.go:123] "auth service credentials ok" url="http://akv2k8s-envinjector.akv2k8s.svc:80/auth/sigaq-api-gestao-documental/sigaq-api-gestao-documental-des-6b6998c89b-lt854?secret=akv2k8s-sigaq-api-gestao-documental-des"
I0908 09:29:45.655171       1 authentication.go:159] "requesting azure key vault oauth token" url="https://akv2k8s-envinjector.akv2k8s.svc:9443/auth/sigaq-api-gestao-documental/sigaq-api-gestao-documental-des-6b6998c89b-lt854"
I0908 09:29:45.700362       1 authentication.go:179] "successfully received oauth token"
I0908 09:29:45.807724       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sigaq-api-gestao-documental/akvs-sigaq-clientid" env="SSO__ClientId"
I0908 09:29:45.865332       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sigaq-api-gestao-documental/akvs-sigaq-siicoapikey" env="SIICO-PUB__APIKEY"
I0908 09:29:45.973864       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sigaq-api-gestao-documental/akvs-sigaq-redis-connection-string" env="Redis__ConnectionString"
I0908 09:29:46.030618       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sigaq-api-gestao-documental/akvs-sigaq-database-connection-string" env="ConnectionStrings__ConnectionStringSqlServer"
I0908 09:29:46.094824       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sigaq-api-gestao-documental/akvs-sigaq-siicoapikey" env="SIICO__APIKEY"
I0908 09:29:46.151926       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sigaq-api-gestao-documental/akvs-sigaq-clientsecret" env="SSO__ClientSecret"
I0908 09:29:46.217964       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sigaq-api-gestao-documental/akvs-sigaq-normasapikey" env="Normas__APIKEY"
I0908 09:29:46.218002       1 main.go:343] "starting process with secrets in env vars" cmd="/usr/bin/dotnet" args=["dotnet","api-gestao-documental.dll"]
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (18ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT CASE
          WHEN EXISTS (
              SELECT 1
              FROM [GAQTB012_TIPO_EVENTO_GUARDA] AS [g]) THEN CAST(1 AS bit)
          ELSE CAST(0 AS bit)
      END
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT CASE
          WHEN EXISTS (
              SELECT 1
              FROM [GAQTB011_EVENTO_CONTAGEM] AS [g]) THEN CAST(1 AS bit)
          ELSE CAST(0 AS bit)
      END
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (2ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT CASE
          WHEN EXISTS (
              SELECT 1
              FROM [GAQTB004_STCO_PLNO_CLSFO_DCMTO] AS [g]) THEN CAST(1 AS bit)
          ELSE CAST(0 AS bit)
      END
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (2ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT CASE
          WHEN EXISTS (
              SELECT 1
              FROM [GAQTB003_AREA_PLANO_CLSFO] AS [g]) THEN CAST(1 AS bit)
          ELSE CAST(0 AS bit)
      END
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (2ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT CASE
          WHEN EXISTS (
              SELECT 1
              FROM [GAQTB024_SITUACAO_TIPO_CDMTO] AS [g]) THEN CAST(1 AS bit)
          ELSE CAST(0 AS bit)
      END
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (2ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT CASE
          WHEN EXISTS (
              SELECT 1
              FROM [GAQTB027_SUPORTE_DOCUMENTAL] AS [g]) THEN CAST(1 AS bit)
          ELSE CAST(0 AS bit)
      END
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (2ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT CASE
          WHEN EXISTS (
              SELECT 1
              FROM [GAQTB039_SITUACAO_MTDDO_DCMTO] AS [g]) THEN CAST(1 AS bit)
          ELSE CAST(0 AS bit)
      END
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (2ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT CASE
          WHEN EXISTS (
              SELECT 1
              FROM [GAQTB035_CLSFO_METADADO_DCMTO] AS [g]) THEN CAST(1 AS bit)
          ELSE CAST(0 AS bit)
      END
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (2ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT CASE
          WHEN EXISTS (
              SELECT 1
              FROM [GAQTB042_TIPO_DADO_METADADO] AS [g]) THEN CAST(1 AS bit)
          ELSE CAST(0 AS bit)
      END
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (2ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT CASE
          WHEN EXISTS (
              SELECT 1
              FROM [GAQTB043_STCO_INTEGRACAO_RPSRO] AS [g]) THEN CAST(1 AS bit)
          ELSE CAST(0 AS bit)
      END
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (2ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT CASE
          WHEN EXISTS (
              SELECT 1
              FROM [GAQTB043_STCO_INTEGRACAO_RPSRO] AS [g]) THEN CAST(1 AS bit)
          ELSE CAST(0 AS bit)
      END
warn: Microsoft.AspNetCore.DataProtection.Repositories.FileSystemXmlRepository[60]
      Storing keys in a directory '/root/.aspnet/DataProtection-Keys' that may not be persisted outside of the container. Protected data will be unavailable when container is destroyed. For more information go to https://aka.ms/aspnet/dataprotectionwarning
warn: Microsoft.AspNetCore.DataProtection.KeyManagement.XmlKeyManager[35]
      No XML encryptor configured. Key {77176db5-2a00-40e4-ad70-b54dd924a250} may be persisted to storage in unencrypted form.
info: ApiGestaoDocumental.Services.ExpurgoService[0]
      Próxima limpeza de tipologias em rascunho agendada para: 09/09/2026 00:00:00
warn: Microsoft.AspNetCore.Hosting.Diagnostics[15]
      Overriding HTTP_PORTS '8080' and HTTPS_PORTS ''. Binding to values defined by URLS instead 'http://0.0.0.0:8080'.
info: Microsoft.Hosting.Lifetime[14]
      Now listening on: http://0.0.0.0:8080
info: Microsoft.Hosting.Lifetime[0]
      Application started. Press Ctrl+C to shut down.
info: Microsoft.Hosting.Lifetime[0]
      Hosting environment: Development
info: Microsoft.Hosting.Lifetime[0]
      Content root path: /app
warn: Microsoft.AspNetCore.HttpsPolicy.HttpsRedirectionMiddleware[3]
      Failed to determine the https port for redirect.
info: ApiGestaoDocumental.Controllers.NormasController[0]
      Iniciando BuscarNormasPorUnidadeGestora (controller).
fail: Microsoft.AspNetCore.Diagnostics.ExceptionHandlerMiddleware[1]
      An unhandled exception has occurred while executing the request.
      ApiGestaoDocumental.Exceptions.BusinessException: Exception of type 'ApiGestaoDocumental.Exceptions.BusinessException' was thrown.
         at ApiGestaoDocumental.Services.NormasApiService.ObterBearerTokenAtual() in /src/src/Services/NormasApiService.cs:line 144
         at ApiGestaoDocumental.Services.NormasApiService.BuscarNormasVigentesAsync(BuscarNormasDTO filter) in /src/src/Services/NormasApiService.cs:line 42
         at ApiGestaoDocumental.Services.NormasService.BuscarNormasPorUnidadeGestora(String codigoUnidade) in /src/src/Services/NormasService.cs:line 37
         at ApiGestaoDocumental.Controllers.NormasController.BuscarNormasPorUnidadeGestora(String codigoUnidade) in /src/src/Controllers/NormasController.cs:line 31
         at lambda_method68(Closure, Object)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ActionMethodExecutor.TaskOfActionResultExecutor.Execute(ActionContext actionContext, IActionResultTypeMapper mapper, ObjectMethodExecutor executor, Object controller, Object[] arguments)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.<InvokeActionMethodAsync>g__Logged|12_1(ControllerActionInvoker invoker)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.<InvokeNextActionFilterAsync>g__Awaited|10_0(ControllerActionInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.Rethrow(ActionExecutedContextSealed context)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.Next(State& next, Scope& scope, Object& state, Boolean& isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.InvokeInnerFilterAsync()
      --- End of stack trace from previous location ---
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeFilterPipelineAsync>g__Awaited|20_0(ResourceInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeAsync>g__Logged|17_1(ResourceInvoker invoker)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeAsync>g__Logged|17_1(ResourceInvoker invoker)
         at Microsoft.AspNetCore.Authorization.AuthorizationMiddleware.Invoke(HttpContext context)
         at Microsoft.AspNetCore.Authentication.AuthenticationMiddleware.Invoke(HttpContext context)
         at Swashbuckle.AspNetCore.SwaggerUI.SwaggerUIMiddleware.Invoke(HttpContext httpContext)
         at Swashbuckle.AspNetCore.Swagger.SwaggerMiddleware.Invoke(HttpContext httpContext, ISwaggerProvider swaggerProvider)
         at ApiGestaoDocumental.Middlewares.ResponseTelemetryMiddleware.Invoke(HttpContext context) in /src/src/Middlewares/ResponseTelemetryMiddleware.cs:line 26
         at ApiGestaoDocumental.Middlewares.RequestTelemetryMiddleware.Invoke(HttpContext context) in /src/src/Middlewares/RequestTelemetryMiddleware.cs:line 43
         at Microsoft.AspNetCore.Diagnostics.ExceptionHandlerMiddlewareImpl.<Invoke>g__Awaited|10_0(ExceptionHandlerMiddlewareImpl middleware, HttpContext context, Task task)
warn: ApiGestaoDocumental.Exceptions.Handlers.BusinessExceptionHandler[0]
      Erro de negócio em /v1/normas/buscar-normas-por-unidade-gestora/5304. Codigo: UNAUTHORIZED, Mensagem: Token de autenticação não informado na requisição., TraceId: f5e016e61d9f8edacfaa9807f1ab76a2
info: ApiGestaoDocumental.Controllers.TemporalidadeNaoCronologicaController[0]
      Iniciando ListarEventoTemporalidade (controller).
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Procurando parâmetros de temporalidade não crológicos...
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Iniciando ListarParametros
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (15ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB011_EVENTO_CONTAGEM] AS [g]
      WHERE [g].[IC_EVENTO_CONTAGEM_ATIVO] = CAST(1 AS bit)
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (68ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [t].[NU_EVENTO_CONTAGEM], [t].[IC_EVENTO_CONTAGEM_ATIVO], [t].[NO_EVENTO_CONTAGEM], [t].[NU_TIPO_EVENTO_GUARDA], [g0].[NU_TIPO_EVENTO_GUARDA], [g0].[NO_TIPO_EVENTO_GUARDA]
      FROM (
          SELECT [g].[NU_EVENTO_CONTAGEM], [g].[IC_EVENTO_CONTAGEM_ATIVO], [g].[NO_EVENTO_CONTAGEM], [g].[NU_TIPO_EVENTO_GUARDA]
          FROM [GAQTB011_EVENTO_CONTAGEM] AS [g]
          WHERE [g].[IC_EVENTO_CONTAGEM_ATIVO] = CAST(1 AS bit)
          ORDER BY [g].[NO_EVENTO_CONTAGEM]
          OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
      ) AS [t]
      INNER JOIN [GAQTB012_TIPO_EVENTO_GUARDA] AS [g0] ON [t].[NU_TIPO_EVENTO_GUARDA] = [g0].[NU_TIPO_EVENTO_GUARDA]
      ORDER BY [t].[NO_EVENTO_CONTAGEM]
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Total de registros: 36
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Tamanho da página: 10
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Página atual: 1
info: ApiGestaoDocumental.Controllers.TemporalidadeNaoCronologicaController[0]
      Finalizando ListarEventoTemporalidade (controller).
info: ApiGestaoDocumental.Controllers.TemporalidadeNaoCronologicaController[0]
      Iniciando ListarEventoTemporalidade (controller).
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Procurando parâmetros de temporalidade não crológicos...
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Iniciando ListarParametros
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB011_EVENTO_CONTAGEM] AS [g]
      WHERE [g].[IC_EVENTO_CONTAGEM_ATIVO] = CAST(1 AS bit)
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (2ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [t].[NU_EVENTO_CONTAGEM], [t].[IC_EVENTO_CONTAGEM_ATIVO], [t].[NO_EVENTO_CONTAGEM], [t].[NU_TIPO_EVENTO_GUARDA], [g0].[NU_TIPO_EVENTO_GUARDA], [g0].[NO_TIPO_EVENTO_GUARDA]
      FROM (
          SELECT [g].[NU_EVENTO_CONTAGEM], [g].[IC_EVENTO_CONTAGEM_ATIVO], [g].[NO_EVENTO_CONTAGEM], [g].[NU_TIPO_EVENTO_GUARDA]
          FROM [GAQTB011_EVENTO_CONTAGEM] AS [g]
          WHERE [g].[IC_EVENTO_CONTAGEM_ATIVO] = CAST(1 AS bit)
          ORDER BY [g].[NO_EVENTO_CONTAGEM]
          OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
      ) AS [t]
      INNER JOIN [GAQTB012_TIPO_EVENTO_GUARDA] AS [g0] ON [t].[NU_TIPO_EVENTO_GUARDA] = [g0].[NU_TIPO_EVENTO_GUARDA]
      ORDER BY [t].[NO_EVENTO_CONTAGEM]
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Total de registros: 36
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Tamanho da página: 10
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Página atual: 1
info: ApiGestaoDocumental.Controllers.TemporalidadeNaoCronologicaController[0]
      Finalizando ListarEventoTemporalidade (controller).
info: ApiGestaoDocumental.Controllers.PlanoClassificacaoController[0]
      Iniciando ListarEventoTemporalidade (controller).
info: ApiGestaoDocumental.Services.PlanoClassificacaoService[0]
      Buscando planos de classificação - TextoBusca: , Página: 1, PageSize: 10, Ordenação: , Coluna:
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (58ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB002_PLANO_CLSFO_DOCUMENTO] AS [g]
      WHERE [g].[NU_SITUACAO_PLANO_CLSFO_DCMTO] <> CAST(6 AS tinyint)
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (8ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [t].[NU_PLANO_CLASSIFICACAO], [t].[ED_PLANO_CLSFO_DCMTO_RPSRO], [t].[CO_IDNTR_INTGO_RPSRO_PLANO], [t].[DE_COMENTARIO_PLANO_CLSFO], [t].[TS_ULTIMA_ATUALIZACAO_CLSFO], [t].[DT_FIM_PLANO_CLASSIFICACAO], [t].[DT_INICIO_PLANO_CLASSIFICACAO], [t].[ED_DOCUMENTO_PLANO], [t].[NU_SITUACAO_INTEGRACAO_RPSRO], [t].[NU_SITUACAO_PLANO_CLSFO_DCMTO], [t].[NU_AREA_PLANO_CLASSIFICACAO], [t].[CO_USUARIO_RESPONSAVEL], [g0].[NU_SITUACAO_PLANO_CLSFO_DCMTO], [g0].[NO_SITUACAO_PLANO_CLSFO_DCMTO], [g1].[NU_AREA_PLANO_CLASSIFICACAO], [g1].[NO_AREA_PLANO_CLASSIFICACAO], [g2].[NU_SITUACAO_INTEGRACAO_RPSRO], [g2].[NO_SITUACAO_INTEGRACAO_RPSRO]
      FROM (
          SELECT [g].[NU_PLANO_CLASSIFICACAO], [g].[ED_PLANO_CLSFO_DCMTO_RPSRO], [g].[CO_IDNTR_INTGO_RPSRO_PLANO], [g].[DE_COMENTARIO_PLANO_CLSFO], [g].[TS_ULTIMA_ATUALIZACAO_CLSFO], [g].[DT_FIM_PLANO_CLASSIFICACAO], [g].[DT_INICIO_PLANO_CLASSIFICACAO], [g].[ED_DOCUMENTO_PLANO], [g].[NU_SITUACAO_INTEGRACAO_RPSRO], [g].[NU_SITUACAO_PLANO_CLSFO_DCMTO], [g].[NU_AREA_PLANO_CLASSIFICACAO], [g].[CO_USUARIO_RESPONSAVEL]
          FROM [GAQTB002_PLANO_CLSFO_DOCUMENTO] AS [g]
          WHERE [g].[NU_SITUACAO_PLANO_CLSFO_DCMTO] <> CAST(6 AS tinyint)
          ORDER BY [g].[TS_ULTIMA_ATUALIZACAO_CLSFO], [g].[NU_PLANO_CLASSIFICACAO]
          OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
      ) AS [t]
      INNER JOIN [GAQTB004_STCO_PLNO_CLSFO_DCMTO] AS [g0] ON [t].[NU_SITUACAO_PLANO_CLSFO_DCMTO] = [g0].[NU_SITUACAO_PLANO_CLSFO_DCMTO]
      INNER JOIN [GAQTB003_AREA_PLANO_CLSFO] AS [g1] ON [t].[NU_AREA_PLANO_CLASSIFICACAO] = [g1].[NU_AREA_PLANO_CLASSIFICACAO]
      INNER JOIN [GAQTB043_STCO_INTEGRACAO_RPSRO] AS [g2] ON [t].[NU_SITUACAO_INTEGRACAO_RPSRO] = [g2].[NU_SITUACAO_INTEGRACAO_RPSRO]
      ORDER BY [t].[TS_ULTIMA_ATUALIZACAO_CLSFO], [t].[NU_PLANO_CLASSIFICACAO]
info: ApiGestaoDocumental.Services.PlanoClassificacaoService[0]
      Planos de classificação listados com sucesso. Total: 31
info: ApiGestaoDocumental.Controllers.PlanoClassificacaoController[0]
      Finalizando ListarEventoTemporalidade (controller).
info: ApiGestaoDocumental.Controllers.TemporalidadeNaoCronologicaController[0]
      Iniciando ListarEventoTemporalidade (controller).
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Procurando parâmetros de temporalidade não crológicos...
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Iniciando ListarParametros
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB011_EVENTO_CONTAGEM] AS [g]
      WHERE [g].[IC_EVENTO_CONTAGEM_ATIVO] = CAST(1 AS bit)
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (2ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [t].[NU_EVENTO_CONTAGEM], [t].[IC_EVENTO_CONTAGEM_ATIVO], [t].[NO_EVENTO_CONTAGEM], [t].[NU_TIPO_EVENTO_GUARDA], [g0].[NU_TIPO_EVENTO_GUARDA], [g0].[NO_TIPO_EVENTO_GUARDA]
      FROM (
          SELECT [g].[NU_EVENTO_CONTAGEM], [g].[IC_EVENTO_CONTAGEM_ATIVO], [g].[NO_EVENTO_CONTAGEM], [g].[NU_TIPO_EVENTO_GUARDA]
          FROM [GAQTB011_EVENTO_CONTAGEM] AS [g]
          WHERE [g].[IC_EVENTO_CONTAGEM_ATIVO] = CAST(1 AS bit)
          ORDER BY [g].[NO_EVENTO_CONTAGEM]
          OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
      ) AS [t]
      INNER JOIN [GAQTB012_TIPO_EVENTO_GUARDA] AS [g0] ON [t].[NU_TIPO_EVENTO_GUARDA] = [g0].[NU_TIPO_EVENTO_GUARDA]
      ORDER BY [t].[NO_EVENTO_CONTAGEM]
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Total de registros: 36
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Tamanho da página: 10
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Página atual: 1
info: ApiGestaoDocumental.Controllers.TemporalidadeNaoCronologicaController[0]
      Finalizando ListarEventoTemporalidade (controller).
info: ApiGestaoDocumental.Controllers.TemporalidadeNaoCronologicaController[0]
      Iniciando ListarEventoTemporalidade (controller).
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Procurando parâmetros de temporalidade não crológicos...
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Iniciando ListarParametros
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB011_EVENTO_CONTAGEM] AS [g]
      WHERE [g].[IC_EVENTO_CONTAGEM_ATIVO] = CAST(1 AS bit)
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [t].[NU_EVENTO_CONTAGEM], [t].[IC_EVENTO_CONTAGEM_ATIVO], [t].[NO_EVENTO_CONTAGEM], [t].[NU_TIPO_EVENTO_GUARDA], [g0].[NU_TIPO_EVENTO_GUARDA], [g0].[NO_TIPO_EVENTO_GUARDA]
      FROM (
          SELECT [g].[NU_EVENTO_CONTAGEM], [g].[IC_EVENTO_CONTAGEM_ATIVO], [g].[NO_EVENTO_CONTAGEM], [g].[NU_TIPO_EVENTO_GUARDA]
          FROM [GAQTB011_EVENTO_CONTAGEM] AS [g]
          WHERE [g].[IC_EVENTO_CONTAGEM_ATIVO] = CAST(1 AS bit)
          ORDER BY [g].[NO_EVENTO_CONTAGEM]
          OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
      ) AS [t]
      INNER JOIN [GAQTB012_TIPO_EVENTO_GUARDA] AS [g0] ON [t].[NU_TIPO_EVENTO_GUARDA] = [g0].[NU_TIPO_EVENTO_GUARDA]
      ORDER BY [t].[NO_EVENTO_CONTAGEM]
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Total de registros: 36
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Tamanho da página: 10
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Página atual: 1
info: ApiGestaoDocumental.Controllers.TemporalidadeNaoCronologicaController[0]
      Finalizando ListarEventoTemporalidade (controller).
info: ApiGestaoDocumental.Controllers.NormasController[0]
      Iniciando BuscarNormasPorUnidadeGestora (controller).
info: ApiGestaoDocumental.Services.RedisCacheService[0]
      Conexão Redis estabelecida com sucesso
info: System.Net.Http.HttpClient.Normas.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/normas/api/v1/normativos?grau_sigilo=%23INTERNO.CAIXA&offset=0&limit=1500
dbug: ApiGestaoDocumental.Middlewares.HttpCallLoggingHandler[0]
      Iniciando chamada HTTP GET https://api.des.caixa:8443/normas/api/v1/normativos?grau_sigilo=%23INTERNO.CAIXA&offset=0&limit=1500
info: System.Net.Http.HttpClient.Normas.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/normas/api/v1/normativos?grau_sigilo=%23INTERNO.CAIXA&offset=0&limit=1500
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] Conexão TCP estabelecida com api.des.caixa:8443 em 96ms
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS escrita #1: 290 bytes enviados para api.des.caixa em 3ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #1: 0 bytes recebidos de api.des.caixa em 24ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #2: 99 bytes recebidos de api.des.caixa em 24ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS escrita #2: 329 bytes enviados para api.des.caixa em 25ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #3: 0 bytes recebidos de api.des.caixa em 46ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #4: 5002 bytes recebidos de api.des.caixa em 46ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #5: 0 bytes recebidos de api.des.caixa em 47ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #6: 338 bytes recebidos de api.des.caixa em 47ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS escrita #3: 104 bytes enviados para api.des.caixa em 48ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas] Handshake TLS concluído com sucesso: Protocolo=Tls13, Cifra=TLS_AES_256_GCM_SHA384, AutenticacaoMutua=False
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS escrita #4: 1759 bytes enviados para api.des.caixa em 57ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #7: 0 bytes recebidos de api.des.caixa em 3510ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #8: 7906 bytes recebidos de api.des.caixa em 3510ms (acumulado)
info: System.Net.Http.HttpClient.Normas.ClientHandler[101]
      Received HTTP response headers after 3630.7678ms - 200
dbug: ApiGestaoDocumental.Middlewares.HttpCallLoggingHandler[0]
      Chamada HTTP GET https://api.des.caixa:8443/normas/api/v1/normativos?grau_sigilo=%23INTERNO.CAIXA&offset=0&limit=1500 concluída com 200 em 3636ms
info: System.Net.Http.HttpClient.Normas.LogicalHandler[101]
      End processing HTTP request after 3641.1205ms - 200
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #9: 0 bytes recebidos de api.des.caixa em 3523ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #10: 10566 bytes recebidos de api.des.caixa em 3523ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #11: 0 bytes recebidos de api.des.caixa em 3532ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #12: 15812 bytes recebidos de api.des.caixa em 3532ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #13: 0 bytes recebidos de api.des.caixa em 3544ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #14: 6390 bytes recebidos de api.des.caixa em 3544ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #15: 0 bytes recebidos de api.des.caixa em 3544ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #16: 1516 bytes recebidos de api.des.caixa em 3544ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #17: 7906 bytes recebidos de api.des.caixa em 3552ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #18: 0 bytes recebidos de api.des.caixa em 3553ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #19: 15812 bytes recebidos de api.des.caixa em 3553ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #20: 0 bytes recebidos de api.des.caixa em 3553ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #21: 6390 bytes recebidos de api.des.caixa em 3553ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #22: 0 bytes recebidos de api.des.caixa em 3553ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #23: 1516 bytes recebidos de api.des.caixa em 3553ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #24: 7906 bytes recebidos de api.des.caixa em 3564ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #25: 0 bytes recebidos de api.des.caixa em 3565ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #26: 21058 bytes recebidos de api.des.caixa em 3565ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #27: 0 bytes recebidos de api.des.caixa em 3573ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #28: 15812 bytes recebidos de api.des.caixa em 3573ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #29: 0 bytes recebidos de api.des.caixa em 3573ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #30: 7906 bytes recebidos de api.des.caixa em 3573ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #31: 0 bytes recebidos de api.des.caixa em 3574ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #32: 13226 bytes recebidos de api.des.caixa em 3574ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #33: 0 bytes recebidos de api.des.caixa em 3574ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #34: 10492 bytes recebidos de api.des.caixa em 3574ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #35: 0 bytes recebidos de api.des.caixa em 3585ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #36: 15812 bytes recebidos de api.des.caixa em 3585ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #37: 0 bytes recebidos de api.des.caixa em 3586ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #38: 23718 bytes recebidos de api.des.caixa em 3586ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #39: 0 bytes recebidos de api.des.caixa em 3586ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #40: 7906 bytes recebidos de api.des.caixa em 3586ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #41: 0 bytes recebidos de api.des.caixa em 3586ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #42: 5320 bytes recebidos de api.des.caixa em 3586ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #43: 15812 bytes recebidos de api.des.caixa em 3593ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #44: 0 bytes recebidos de api.des.caixa em 3593ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #45: 7906 bytes recebidos de api.des.caixa em 3593ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #46: 0 bytes recebidos de api.des.caixa em 3594ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #47: 3730 bytes recebidos de api.des.caixa em 3594ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #48: 0 bytes recebidos de api.des.caixa em 3594ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #49: 14668 bytes recebidos de api.des.caixa em 3594ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #50: 0 bytes recebidos de api.des.caixa em 3595ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #51: 23718 bytes recebidos de api.des.caixa em 3595ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #52: 0 bytes recebidos de api.des.caixa em 3606ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #53: 15812 bytes recebidos de api.des.caixa em 3606ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #54: 0 bytes recebidos de api.des.caixa em 3607ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #55: 7906 bytes recebidos de api.des.caixa em 3607ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #56: 0 bytes recebidos de api.des.caixa em 3607ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #57: 7906 bytes recebidos de api.des.caixa em 3607ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #58: 0 bytes recebidos de api.des.caixa em 3607ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #59: 15812 bytes recebidos de api.des.caixa em 3607ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #60: 0 bytes recebidos de api.des.caixa em 3614ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #61: 15812 bytes recebidos de api.des.caixa em 3614ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #62: 0 bytes recebidos de api.des.caixa em 3615ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #63: 6650 bytes recebidos de api.des.caixa em 3615ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #64: 9162 bytes recebidos de api.des.caixa em 3615ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #65: 0 bytes recebidos de api.des.caixa em 3615ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #66: 15812 bytes recebidos de api.des.caixa em 3615ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #67: 0 bytes recebidos de api.des.caixa em 3616ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #68: 15812 bytes recebidos de api.des.caixa em 3616ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #69: 0 bytes recebidos de api.des.caixa em 3627ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #70: 15812 bytes recebidos de api.des.caixa em 3627ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #71: 0 bytes recebidos de api.des.caixa em 3628ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #72: 23718 bytes recebidos de api.des.caixa em 3628ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #73: 0 bytes recebidos de api.des.caixa em 3630ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #74: 15812 bytes recebidos de api.des.caixa em 3630ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #75: 0 bytes recebidos de api.des.caixa em 3635ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #76: 15812 bytes recebidos de api.des.caixa em 3635ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #77: 0 bytes recebidos de api.des.caixa em 3636ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #78: 15812 bytes recebidos de api.des.caixa em 3636ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #79: 0 bytes recebidos de api.des.caixa em 3637ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #80: 15812 bytes recebidos de api.des.caixa em 3637ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #81: 0 bytes recebidos de api.des.caixa em 3637ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #82: 1330 bytes recebidos de api.des.caixa em 3637ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #83: 14482 bytes recebidos de api.des.caixa em 3637ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #84: 0 bytes recebidos de api.des.caixa em 3648ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #85: 15812 bytes recebidos de api.des.caixa em 3648ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #86: 0 bytes recebidos de api.des.caixa em 3649ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #87: 1330 bytes recebidos de api.des.caixa em 3649ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #88: 14482 bytes recebidos de api.des.caixa em 3649ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #89: 0 bytes recebidos de api.des.caixa em 3651ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #90: 23718 bytes recebidos de api.des.caixa em 3651ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #91: 0 bytes recebidos de api.des.caixa em 3657ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #92: 7906 bytes recebidos de api.des.caixa em 3657ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #93: 0 bytes recebidos de api.des.caixa em 3657ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #94: 20769 bytes recebidos de api.des.caixa em 3657ms (acumulado)
info: ApiGestaoDocumental.Services.NormasApiService[0]
      Normas vigentes armazenadas no cache Redis por uma hora.
info: ApiGestaoDocumental.Controllers.NormasController[0]
      Finalizando BuscarNormasPorUnidadeGestora (controller).
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #95: 0 bytes recebidos de api.des.caixa em 63511ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][81bc4b67] TLS leitura #96: 24 bytes recebidos de api.des.caixa em 63511ms (acumulado)
info: ApiGestaoDocumental.Controllers.PlanoClassificacaoController[0]
      Iniciando ListarEventoTemporalidade (controller).
info: ApiGestaoDocumental.Services.PlanoClassificacaoService[0]
      Buscando planos de classificação - TextoBusca: , Página: 1, PageSize: 10, Ordenação: , Coluna:
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (2ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB002_PLANO_CLSFO_DOCUMENTO] AS [g]
      WHERE [g].[NU_SITUACAO_PLANO_CLSFO_DCMTO] <> CAST(6 AS tinyint)
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (2ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [t].[NU_PLANO_CLASSIFICACAO], [t].[ED_PLANO_CLSFO_DCMTO_RPSRO], [t].[CO_IDNTR_INTGO_RPSRO_PLANO], [t].[DE_COMENTARIO_PLANO_CLSFO], [t].[TS_ULTIMA_ATUALIZACAO_CLSFO], [t].[DT_FIM_PLANO_CLASSIFICACAO], [t].[DT_INICIO_PLANO_CLASSIFICACAO], [t].[ED_DOCUMENTO_PLANO], [t].[NU_SITUACAO_INTEGRACAO_RPSRO], [t].[NU_SITUACAO_PLANO_CLSFO_DCMTO], [t].[NU_AREA_PLANO_CLASSIFICACAO], [t].[CO_USUARIO_RESPONSAVEL], [g0].[NU_SITUACAO_PLANO_CLSFO_DCMTO], [g0].[NO_SITUACAO_PLANO_CLSFO_DCMTO], [g1].[NU_AREA_PLANO_CLASSIFICACAO], [g1].[NO_AREA_PLANO_CLASSIFICACAO], [g2].[NU_SITUACAO_INTEGRACAO_RPSRO], [g2].[NO_SITUACAO_INTEGRACAO_RPSRO]
      FROM (
          SELECT [g].[NU_PLANO_CLASSIFICACAO], [g].[ED_PLANO_CLSFO_DCMTO_RPSRO], [g].[CO_IDNTR_INTGO_RPSRO_PLANO], [g].[DE_COMENTARIO_PLANO_CLSFO], [g].[TS_ULTIMA_ATUALIZACAO_CLSFO], [g].[DT_FIM_PLANO_CLASSIFICACAO], [g].[DT_INICIO_PLANO_CLASSIFICACAO], [g].[ED_DOCUMENTO_PLANO], [g].[NU_SITUACAO_INTEGRACAO_RPSRO], [g].[NU_SITUACAO_PLANO_CLSFO_DCMTO], [g].[NU_AREA_PLANO_CLASSIFICACAO], [g].[CO_USUARIO_RESPONSAVEL]
          FROM [GAQTB002_PLANO_CLSFO_DOCUMENTO] AS [g]
          WHERE [g].[NU_SITUACAO_PLANO_CLSFO_DCMTO] <> CAST(6 AS tinyint)
          ORDER BY [g].[TS_ULTIMA_ATUALIZACAO_CLSFO], [g].[NU_PLANO_CLASSIFICACAO]
          OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
      ) AS [t]
      INNER JOIN [GAQTB004_STCO_PLNO_CLSFO_DCMTO] AS [g0] ON [t].[NU_SITUACAO_PLANO_CLSFO_DCMTO] = [g0].[NU_SITUACAO_PLANO_CLSFO_DCMTO]
      INNER JOIN [GAQTB003_AREA_PLANO_CLSFO] AS [g1] ON [t].[NU_AREA_PLANO_CLASSIFICACAO] = [g1].[NU_AREA_PLANO_CLASSIFICACAO]
      INNER JOIN [GAQTB043_STCO_INTEGRACAO_RPSRO] AS [g2] ON [t].[NU_SITUACAO_INTEGRACAO_RPSRO] = [g2].[NU_SITUACAO_INTEGRACAO_RPSRO]
      ORDER BY [t].[TS_ULTIMA_ATUALIZACAO_CLSFO], [t].[NU_PLANO_CLASSIFICACAO]
info: ApiGestaoDocumental.Services.PlanoClassificacaoService[0]
      Planos de classificação listados com sucesso. Total: 31
info: ApiGestaoDocumental.Controllers.PlanoClassificacaoController[0]
      Finalizando ListarEventoTemporalidade (controller).
info: ApiGestaoDocumental.Controllers.TipoUnidadeProducaoController[0]
      Iniciando ListarTiposUnidadeProducao (controller).
info: ApiGestaoDocumental.Services.TipoUnidadeProducaoService[0]
      Iniciando listagem de tipos de unidade de produção.
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (30ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB050_TIPO_UNIDADE_PRODUCAO] AS [g]
      WHERE [g].[IC_TIPO_UNDDE_PDCAO_DCMTO_ATVO] = CAST(1 AS bit)
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (4ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [g].[NU_TIPO_UNIDADE_PRODUCAO_DCMTO], [g].[IC_TIPO_UNDDE_PDCAO_DCMTO_ATVO], [g].[NO_TIPO_UNIDADE_PRODUCAO_DCMTO]
      FROM [GAQTB050_TIPO_UNIDADE_PRODUCAO] AS [g]
      WHERE [g].[IC_TIPO_UNDDE_PDCAO_DCMTO_ATVO] = CAST(1 AS bit)
      ORDER BY [g].[NU_TIPO_UNIDADE_PRODUCAO_DCMTO] DESC
      OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
info: ApiGestaoDocumental.Services.TipoUnidadeProducaoService[0]
      Listagem de tipos de unidade de produção retornada com sucesso.
info: ApiGestaoDocumental.Controllers.TipoUnidadeProducaoController[0]
      Finalizando ListarTiposUnidadeProducao (controller).
info: ApiGestaoDocumental.Controllers.TipoUnidadeProducaoController[0]
      Iniciando DetalhesToTipoUnidadeProducao (controller) com ID 37.
info: ApiGestaoDocumental.Services.TipoUnidadeProducaoService[0]
      Buscando detalhes do tipo de unidade de produção com ID 37.
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (4ms) [Parameters=[@__id_0='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT TOP(1) [g].[NU_TIPO_UNIDADE_PRODUCAO_DCMTO], [g].[IC_TIPO_UNDDE_PDCAO_DCMTO_ATVO], [g].[NO_TIPO_UNIDADE_PRODUCAO_DCMTO]
      FROM [GAQTB050_TIPO_UNIDADE_PRODUCAO] AS [g]
      WHERE [g].[IC_TIPO_UNDDE_PDCAO_DCMTO_ATVO] = CAST(1 AS bit) AND [g].[NU_TIPO_UNIDADE_PRODUCAO_DCMTO] = @__id_0
info: ApiGestaoDocumental.Services.TipoUnidadeProducaoService[0]
      Detalhes do tipo de unidade de produção retornados com sucesso.
info: ApiGestaoDocumental.Controllers.TipoUnidadeProducaoController[0]
      Finalizando DetalhesToTipoUnidadeProducao (controller).
info: ApiGestaoDocumental.Controllers.TipoUnidadeProducaoController[0]
      Iniciando ListarTiposUnidadeProducao (controller).
info: ApiGestaoDocumental.Services.TipoUnidadeProducaoService[0]
      Iniciando listagem de tipos de unidade de produção.
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (2ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB050_TIPO_UNIDADE_PRODUCAO] AS [g]
      WHERE [g].[IC_TIPO_UNDDE_PDCAO_DCMTO_ATVO] = CAST(1 AS bit)
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (2ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [g].[NU_TIPO_UNIDADE_PRODUCAO_DCMTO], [g].[IC_TIPO_UNDDE_PDCAO_DCMTO_ATVO], [g].[NO_TIPO_UNIDADE_PRODUCAO_DCMTO]
      FROM [GAQTB050_TIPO_UNIDADE_PRODUCAO] AS [g]
      WHERE [g].[IC_TIPO_UNDDE_PDCAO_DCMTO_ATVO] = CAST(1 AS bit)
      ORDER BY [g].[NU_TIPO_UNIDADE_PRODUCAO_DCMTO] DESC
      OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
info: ApiGestaoDocumental.Services.TipoUnidadeProducaoService[0]
      Listagem de tipos de unidade de produção retornada com sucesso.
info: ApiGestaoDocumental.Controllers.TipoUnidadeProducaoController[0]
      Finalizando ListarTiposUnidadeProducao (controller).
info: ApiGestaoDocumental.Services.TipoDocumentalService[0]
      Iniciando listagem de tipos documentais paginado ListarAsync.
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (13ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB048_TIPO_DOCUMENTAL] AS [g]
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (20ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [t].[NU_TIPO_DOCUMENTAL], [t].[NU_ATIVIDADE_DOCUMENTO], [t].[NU_ESPECIE_DOCUMENTAL], [t].[IC_TIPO_DOCUMENTAL_CONTEXTO], [t].[IC_TIPO_DOCUMENTAL_INTERNO], [t].[NO_TIPO_DOCUMENTAL_EXTERNO], [g0].[NU_ESPECIE_DOCUMENTAL], [g0].[IC_ESPECIE_DOCUMENTAL_ATIVA], [g0].[NO_ESPECIE_DOCUMENTAL], [g1].[NU_ATIVIDADE_DOCUMENTO], [g1].[IC_ATIVIDADE_DOCUMENTO_ATIVA], [g1].[NO_ATIVIDADE_DOCUMENTO]
      FROM (
          SELECT [g].[NU_TIPO_DOCUMENTAL], [g].[NU_ATIVIDADE_DOCUMENTO], [g].[NU_ESPECIE_DOCUMENTAL], [g].[IC_TIPO_DOCUMENTAL_CONTEXTO], [g].[IC_TIPO_DOCUMENTAL_INTERNO], [g].[NO_TIPO_DOCUMENTAL_EXTERNO]
          FROM [GAQTB048_TIPO_DOCUMENTAL] AS [g]
          ORDER BY [g].[NU_TIPO_DOCUMENTAL] DESC
          OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
      ) AS [t]
      LEFT JOIN [GAQTB029_ESPECIE_DOCUMENTAL] AS [g0] ON [t].[NU_ESPECIE_DOCUMENTAL] = [g0].[NU_ESPECIE_DOCUMENTAL]
      LEFT JOIN [GAQTB045_ATIVIDADE_DOCUMENTO] AS [g1] ON [t].[NU_ATIVIDADE_DOCUMENTO] = [g1].[NU_ATIVIDADE_DOCUMENTO]
      ORDER BY [t].[NU_TIPO_DOCUMENTAL] DESC
info: ApiGestaoDocumental.Services.TipoDocumentalService[0]
      Finalizando listagem de tipos documentais paginado ListarAsync.
info: ApiGestaoDocumental.Services.AtividadeService[0]
      Iniciando listagem de atividades.
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB045_ATIVIDADE_DOCUMENTO] AS [g]
      WHERE [g].[IC_ATIVIDADE_DOCUMENTO_ATIVA] = CAST(1 AS bit)
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [g].[NU_ATIVIDADE_DOCUMENTO], [g].[IC_ATIVIDADE_DOCUMENTO_ATIVA], [g].[NO_ATIVIDADE_DOCUMENTO]
      FROM [GAQTB045_ATIVIDADE_DOCUMENTO] AS [g]
      WHERE [g].[IC_ATIVIDADE_DOCUMENTO_ATIVA] = CAST(1 AS bit)
      ORDER BY [g].[NU_ATIVIDADE_DOCUMENTO] DESC
      OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB029_ESPECIE_DOCUMENTAL] AS [g]
      WHERE [g].[IC_ESPECIE_DOCUMENTAL_ATIVA] = CAST(1 AS bit)
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [g].[NU_ESPECIE_DOCUMENTAL], [g].[IC_ESPECIE_DOCUMENTAL_ATIVA], [g].[NO_ESPECIE_DOCUMENTAL]
      FROM [GAQTB029_ESPECIE_DOCUMENTAL] AS [g]
      WHERE [g].[IC_ESPECIE_DOCUMENTAL_ATIVA] = CAST(1 AS bit)
      ORDER BY [g].[NU_ESPECIE_DOCUMENTAL] DESC
      OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
info: ApiGestaoDocumental.Services.TipoDocumentalService[0]
      Iniciando listagem de tipos documentais paginado ListarAsync.
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB048_TIPO_DOCUMENTAL] AS [g]
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (2ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [t].[NU_TIPO_DOCUMENTAL], [t].[NU_ATIVIDADE_DOCUMENTO], [t].[NU_ESPECIE_DOCUMENTAL], [t].[IC_TIPO_DOCUMENTAL_CONTEXTO], [t].[IC_TIPO_DOCUMENTAL_INTERNO], [t].[NO_TIPO_DOCUMENTAL_EXTERNO], [g0].[NU_ESPECIE_DOCUMENTAL], [g0].[IC_ESPECIE_DOCUMENTAL_ATIVA], [g0].[NO_ESPECIE_DOCUMENTAL], [g1].[NU_ATIVIDADE_DOCUMENTO], [g1].[IC_ATIVIDADE_DOCUMENTO_ATIVA], [g1].[NO_ATIVIDADE_DOCUMENTO]
      FROM (
          SELECT [g].[NU_TIPO_DOCUMENTAL], [g].[NU_ATIVIDADE_DOCUMENTO], [g].[NU_ESPECIE_DOCUMENTAL], [g].[IC_TIPO_DOCUMENTAL_CONTEXTO], [g].[IC_TIPO_DOCUMENTAL_INTERNO], [g].[NO_TIPO_DOCUMENTAL_EXTERNO]
          FROM [GAQTB048_TIPO_DOCUMENTAL] AS [g]
          ORDER BY [g].[NU_TIPO_DOCUMENTAL] DESC
          OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
      ) AS [t]
      LEFT JOIN [GAQTB029_ESPECIE_DOCUMENTAL] AS [g0] ON [t].[NU_ESPECIE_DOCUMENTAL] = [g0].[NU_ESPECIE_DOCUMENTAL]
      LEFT JOIN [GAQTB045_ATIVIDADE_DOCUMENTO] AS [g1] ON [t].[NU_ATIVIDADE_DOCUMENTO] = [g1].[NU_ATIVIDADE_DOCUMENTO]
      ORDER BY [t].[NU_TIPO_DOCUMENTAL] DESC
info: ApiGestaoDocumental.Services.TipoDocumentalService[0]
      Finalizando listagem de tipos documentais paginado ListarAsync.
info: ApiGestaoDocumental.Services.ContextoService[0]
      Iniciando listagem de contextos.
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (12ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB047_CONTEXTO_DOCUMENTO] AS [g]
      WHERE [g].[IC_CONTEXTO_DOCUMENTO_ATIVO] = CAST(1 AS bit)
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [g].[NU_CONTEXTO_DOCUMENTO], [g].[IC_CONTEXTO_DOCUMENTO_ATIVO], [g].[NO_CONTEXTO_DOCUMENTO]
      FROM [GAQTB047_CONTEXTO_DOCUMENTO] AS [g]
      WHERE [g].[IC_CONTEXTO_DOCUMENTO_ATIVO] = CAST(1 AS bit)
      ORDER BY [g].[NU_CONTEXTO_DOCUMENTO] DESC
      OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
info: ApiGestaoDocumental.Services.AtividadeService[0]
      Iniciando listagem de atividades.
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB045_ATIVIDADE_DOCUMENTO] AS [g]
      WHERE [g].[IC_ATIVIDADE_DOCUMENTO_ATIVA] = CAST(1 AS bit)
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (2ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [g].[NU_ATIVIDADE_DOCUMENTO], [g].[IC_ATIVIDADE_DOCUMENTO_ATIVA], [g].[NO_ATIVIDADE_DOCUMENTO]
      FROM [GAQTB045_ATIVIDADE_DOCUMENTO] AS [g]
      WHERE [g].[IC_ATIVIDADE_DOCUMENTO_ATIVA] = CAST(1 AS bit)
      ORDER BY [g].[NU_ATIVIDADE_DOCUMENTO] DESC
      OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (2ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB029_ESPECIE_DOCUMENTAL] AS [g]
      WHERE [g].[IC_ESPECIE_DOCUMENTAL_ATIVA] = CAST(1 AS bit)
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (2ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [g].[NU_ESPECIE_DOCUMENTAL], [g].[IC_ESPECIE_DOCUMENTAL_ATIVA], [g].[NO_ESPECIE_DOCUMENTAL]
      FROM [GAQTB029_ESPECIE_DOCUMENTAL] AS [g]
      WHERE [g].[IC_ESPECIE_DOCUMENTAL_ATIVA] = CAST(1 AS bit)
      ORDER BY [g].[NU_ESPECIE_DOCUMENTAL] DESC
      OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
info: ApiGestaoDocumental.Services.TipoDocumentalService[0]
      Iniciando listagem de tipos documentais paginado ListarAsync.
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (2ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB048_TIPO_DOCUMENTAL] AS [g]
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (2ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [t].[NU_TIPO_DOCUMENTAL], [t].[NU_ATIVIDADE_DOCUMENTO], [t].[NU_ESPECIE_DOCUMENTAL], [t].[IC_TIPO_DOCUMENTAL_CONTEXTO], [t].[IC_TIPO_DOCUMENTAL_INTERNO], [t].[NO_TIPO_DOCUMENTAL_EXTERNO], [g0].[NU_ESPECIE_DOCUMENTAL], [g0].[IC_ESPECIE_DOCUMENTAL_ATIVA], [g0].[NO_ESPECIE_DOCUMENTAL], [g1].[NU_ATIVIDADE_DOCUMENTO], [g1].[IC_ATIVIDADE_DOCUMENTO_ATIVA], [g1].[NO_ATIVIDADE_DOCUMENTO]
      FROM (
          SELECT [g].[NU_TIPO_DOCUMENTAL], [g].[NU_ATIVIDADE_DOCUMENTO], [g].[NU_ESPECIE_DOCUMENTAL], [g].[IC_TIPO_DOCUMENTAL_CONTEXTO], [g].[IC_TIPO_DOCUMENTAL_INTERNO], [g].[NO_TIPO_DOCUMENTAL_EXTERNO]
          FROM [GAQTB048_TIPO_DOCUMENTAL] AS [g]
          ORDER BY [g].[NU_TIPO_DOCUMENTAL] DESC
          OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
      ) AS [t]
      LEFT JOIN [GAQTB029_ESPECIE_DOCUMENTAL] AS [g0] ON [t].[NU_ESPECIE_DOCUMENTAL] = [g0].[NU_ESPECIE_DOCUMENTAL]
      LEFT JOIN [GAQTB045_ATIVIDADE_DOCUMENTO] AS [g1] ON [t].[NU_ATIVIDADE_DOCUMENTO] = [g1].[NU_ATIVIDADE_DOCUMENTO]
      ORDER BY [t].[NU_TIPO_DOCUMENTAL] DESC
info: ApiGestaoDocumental.Services.TipoDocumentalService[0]
      Finalizando listagem de tipos documentais paginado ListarAsync.
info: ApiGestaoDocumental.Services.AtividadeService[0]
      Iniciando listagem de atividades.
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (2ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB029_ESPECIE_DOCUMENTAL] AS [g]
      WHERE [g].[IC_ESPECIE_DOCUMENTAL_ATIVA] = CAST(1 AS bit)
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (2ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB045_ATIVIDADE_DOCUMENTO] AS [g]
      WHERE [g].[IC_ATIVIDADE_DOCUMENTO_ATIVA] = CAST(1 AS bit)
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (1ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [g].[NU_ATIVIDADE_DOCUMENTO], [g].[IC_ATIVIDADE_DOCUMENTO_ATIVA], [g].[NO_ATIVIDADE_DOCUMENTO]
      FROM [GAQTB045_ATIVIDADE_DOCUMENTO] AS [g]
      WHERE [g].[IC_ATIVIDADE_DOCUMENTO_ATIVA] = CAST(1 AS bit)
      ORDER BY [g].[NU_ATIVIDADE_DOCUMENTO] DESC
      OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [g].[NU_ESPECIE_DOCUMENTAL], [g].[IC_ESPECIE_DOCUMENTAL_ATIVA], [g].[NO_ESPECIE_DOCUMENTAL]
      FROM [GAQTB029_ESPECIE_DOCUMENTAL] AS [g]
      WHERE [g].[IC_ESPECIE_DOCUMENTAL_ATIVA] = CAST(1 AS bit)
      ORDER BY [g].[NU_ESPECIE_DOCUMENTAL] DESC
      OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
info: ApiGestaoDocumental.Services.TipoDocumentalService[0]
      Iniciando listagem de tipos documentais paginado ListarAsync.
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (2ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB048_TIPO_DOCUMENTAL] AS [g]
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (2ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [t].[NU_TIPO_DOCUMENTAL], [t].[NU_ATIVIDADE_DOCUMENTO], [t].[NU_ESPECIE_DOCUMENTAL], [t].[IC_TIPO_DOCUMENTAL_CONTEXTO], [t].[IC_TIPO_DOCUMENTAL_INTERNO], [t].[NO_TIPO_DOCUMENTAL_EXTERNO], [g0].[NU_ESPECIE_DOCUMENTAL], [g0].[IC_ESPECIE_DOCUMENTAL_ATIVA], [g0].[NO_ESPECIE_DOCUMENTAL], [g1].[NU_ATIVIDADE_DOCUMENTO], [g1].[IC_ATIVIDADE_DOCUMENTO_ATIVA], [g1].[NO_ATIVIDADE_DOCUMENTO]
      FROM (
          SELECT [g].[NU_TIPO_DOCUMENTAL], [g].[NU_ATIVIDADE_DOCUMENTO], [g].[NU_ESPECIE_DOCUMENTAL], [g].[IC_TIPO_DOCUMENTAL_CONTEXTO], [g].[IC_TIPO_DOCUMENTAL_INTERNO], [g].[NO_TIPO_DOCUMENTAL_EXTERNO]
          FROM [GAQTB048_TIPO_DOCUMENTAL] AS [g]
          ORDER BY [g].[NU_TIPO_DOCUMENTAL] DESC
          OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
      ) AS [t]
      LEFT JOIN [GAQTB029_ESPECIE_DOCUMENTAL] AS [g0] ON [t].[NU_ESPECIE_DOCUMENTAL] = [g0].[NU_ESPECIE_DOCUMENTAL]
      LEFT JOIN [GAQTB045_ATIVIDADE_DOCUMENTO] AS [g1] ON [t].[NU_ATIVIDADE_DOCUMENTO] = [g1].[NU_ATIVIDADE_DOCUMENTO]
      ORDER BY [t].[NU_TIPO_DOCUMENTAL] DESC
info: ApiGestaoDocumental.Services.TipoDocumentalService[0]
      Finalizando listagem de tipos documentais paginado ListarAsync.
info: ApiGestaoDocumental.Controllers.NormasController[0]
      Iniciando BuscarNormas (controller).
info: ApiGestaoDocumental.Services.NormasService[0]
      Normas e tipologias fictícias armazenadas no cache Redis por 12 horas.
info: ApiGestaoDocumental.Controllers.NormasController[0]
      Finalizando BuscarNormas (controller).
info: ApiGestaoDocumental.Controllers.TemporalidadeNaoCronologicaController[0]
      Iniciando ListarEventoTemporalidade (controller).
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Procurando parâmetros de temporalidade não crológicos...
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Iniciando ListarParametros
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB011_EVENTO_CONTAGEM] AS [g]
      WHERE [g].[IC_EVENTO_CONTAGEM_ATIVO] = CAST(1 AS bit)
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [t].[NU_EVENTO_CONTAGEM], [t].[IC_EVENTO_CONTAGEM_ATIVO], [t].[NO_EVENTO_CONTAGEM], [t].[NU_TIPO_EVENTO_GUARDA], [g0].[NU_TIPO_EVENTO_GUARDA], [g0].[NO_TIPO_EVENTO_GUARDA]
      FROM (
          SELECT [g].[NU_EVENTO_CONTAGEM], [g].[IC_EVENTO_CONTAGEM_ATIVO], [g].[NO_EVENTO_CONTAGEM], [g].[NU_TIPO_EVENTO_GUARDA]
          FROM [GAQTB011_EVENTO_CONTAGEM] AS [g]
          WHERE [g].[IC_EVENTO_CONTAGEM_ATIVO] = CAST(1 AS bit)
          ORDER BY [g].[NO_EVENTO_CONTAGEM]
          OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
      ) AS [t]
      INNER JOIN [GAQTB012_TIPO_EVENTO_GUARDA] AS [g0] ON [t].[NU_TIPO_EVENTO_GUARDA] = [g0].[NU_TIPO_EVENTO_GUARDA]
      ORDER BY [t].[NO_EVENTO_CONTAGEM]
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Total de registros: 36
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Tamanho da página: 10
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Página atual: 1
info: ApiGestaoDocumental.Controllers.TemporalidadeNaoCronologicaController[0]
      Finalizando ListarEventoTemporalidade (controller).
info: ApiGestaoDocumental.Controllers.TipoUnidadeProducaoController[0]
      Iniciando ListarTiposUnidadeProducao (controller).
info: ApiGestaoDocumental.Services.TipoUnidadeProducaoService[0]
      Iniciando listagem de tipos de unidade de produção.
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB050_TIPO_UNIDADE_PRODUCAO] AS [g]
      WHERE [g].[IC_TIPO_UNDDE_PDCAO_DCMTO_ATVO] = CAST(1 AS bit)
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [g].[NU_TIPO_UNIDADE_PRODUCAO_DCMTO], [g].[IC_TIPO_UNDDE_PDCAO_DCMTO_ATVO], [g].[NO_TIPO_UNIDADE_PRODUCAO_DCMTO]
      FROM [GAQTB050_TIPO_UNIDADE_PRODUCAO] AS [g]
      WHERE [g].[IC_TIPO_UNDDE_PDCAO_DCMTO_ATVO] = CAST(1 AS bit)
      ORDER BY [g].[NU_TIPO_UNIDADE_PRODUCAO_DCMTO] DESC
      OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
info: ApiGestaoDocumental.Services.TipoUnidadeProducaoService[0]
      Listagem de tipos de unidade de produção retornada com sucesso.
info: ApiGestaoDocumental.Controllers.TipoUnidadeProducaoController[0]
      Finalizando ListarTiposUnidadeProducao (controller).
info: ApiGestaoDocumental.Services.ContextoService[0]
      Iniciando listagem de contextos.
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB047_CONTEXTO_DOCUMENTO] AS [g]
      WHERE [g].[IC_CONTEXTO_DOCUMENTO_ATIVO] = CAST(1 AS bit)
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [g].[NU_CONTEXTO_DOCUMENTO], [g].[IC_CONTEXTO_DOCUMENTO_ATIVO], [g].[NO_CONTEXTO_DOCUMENTO]
      FROM [GAQTB047_CONTEXTO_DOCUMENTO] AS [g]
      WHERE [g].[IC_CONTEXTO_DOCUMENTO_ATIVO] = CAST(1 AS bit)
      ORDER BY [g].[NU_CONTEXTO_DOCUMENTO] DESC
      OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
info: ApiGestaoDocumental.Services.AtividadeService[0]
      Iniciando listagem de atividades.
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB045_ATIVIDADE_DOCUMENTO] AS [g]
      WHERE [g].[IC_ATIVIDADE_DOCUMENTO_ATIVA] = CAST(1 AS bit)
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [g].[NU_ATIVIDADE_DOCUMENTO], [g].[IC_ATIVIDADE_DOCUMENTO_ATIVA], [g].[NO_ATIVIDADE_DOCUMENTO]
      FROM [GAQTB045_ATIVIDADE_DOCUMENTO] AS [g]
      WHERE [g].[IC_ATIVIDADE_DOCUMENTO_ATIVA] = CAST(1 AS bit)
      ORDER BY [g].[NU_ATIVIDADE_DOCUMENTO] DESC
      OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB029_ESPECIE_DOCUMENTAL] AS [g]
      WHERE [g].[IC_ESPECIE_DOCUMENTAL_ATIVA] = CAST(1 AS bit)
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [g].[NU_ESPECIE_DOCUMENTAL], [g].[IC_ESPECIE_DOCUMENTAL_ATIVA], [g].[NO_ESPECIE_DOCUMENTAL]
      FROM [GAQTB029_ESPECIE_DOCUMENTAL] AS [g]
      WHERE [g].[IC_ESPECIE_DOCUMENTAL_ATIVA] = CAST(1 AS bit)
      ORDER BY [g].[NU_ESPECIE_DOCUMENTAL] DESC
      OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
info: ApiGestaoDocumental.Controllers.TemporalidadeNaoCronologicaController[0]
      Iniciando ListarEventoTemporalidade (controller).
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Procurando parâmetros de temporalidade não crológicos...
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Iniciando ListarParametros
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB011_EVENTO_CONTAGEM] AS [g]
      WHERE [g].[IC_EVENTO_CONTAGEM_ATIVO] = CAST(1 AS bit)
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [t].[NU_EVENTO_CONTAGEM], [t].[IC_EVENTO_CONTAGEM_ATIVO], [t].[NO_EVENTO_CONTAGEM], [t].[NU_TIPO_EVENTO_GUARDA], [g0].[NU_TIPO_EVENTO_GUARDA], [g0].[NO_TIPO_EVENTO_GUARDA]
      FROM (
          SELECT [g].[NU_EVENTO_CONTAGEM], [g].[IC_EVENTO_CONTAGEM_ATIVO], [g].[NO_EVENTO_CONTAGEM], [g].[NU_TIPO_EVENTO_GUARDA]
          FROM [GAQTB011_EVENTO_CONTAGEM] AS [g]
          WHERE [g].[IC_EVENTO_CONTAGEM_ATIVO] = CAST(1 AS bit)
          ORDER BY [g].[NO_EVENTO_CONTAGEM]
          OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
      ) AS [t]
      INNER JOIN [GAQTB012_TIPO_EVENTO_GUARDA] AS [g0] ON [t].[NU_TIPO_EVENTO_GUARDA] = [g0].[NU_TIPO_EVENTO_GUARDA]
      ORDER BY [t].[NO_EVENTO_CONTAGEM]
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Total de registros: 36
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Tamanho da página: 10
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Página atual: 1
info: ApiGestaoDocumental.Controllers.TemporalidadeNaoCronologicaController[0]
      Finalizando ListarEventoTemporalidade (controller).
info: ApiGestaoDocumental.Controllers.TemporalidadeNaoCronologicaController[0]
      Iniciando ListarEventoTemporalidade (controller).
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Procurando parâmetros de temporalidade não crológicos...
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Iniciando ListarParametros
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB011_EVENTO_CONTAGEM] AS [g]
      WHERE [g].[IC_EVENTO_CONTAGEM_ATIVO] = CAST(1 AS bit)
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (4ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [t].[NU_EVENTO_CONTAGEM], [t].[IC_EVENTO_CONTAGEM_ATIVO], [t].[NO_EVENTO_CONTAGEM], [t].[NU_TIPO_EVENTO_GUARDA], [g0].[NU_TIPO_EVENTO_GUARDA], [g0].[NO_TIPO_EVENTO_GUARDA]
      FROM (
          SELECT [g].[NU_EVENTO_CONTAGEM], [g].[IC_EVENTO_CONTAGEM_ATIVO], [g].[NO_EVENTO_CONTAGEM], [g].[NU_TIPO_EVENTO_GUARDA]
          FROM [GAQTB011_EVENTO_CONTAGEM] AS [g]
          WHERE [g].[IC_EVENTO_CONTAGEM_ATIVO] = CAST(1 AS bit)
          ORDER BY [g].[NO_EVENTO_CONTAGEM]
          OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
      ) AS [t]
      INNER JOIN [GAQTB012_TIPO_EVENTO_GUARDA] AS [g0] ON [t].[NU_TIPO_EVENTO_GUARDA] = [g0].[NU_TIPO_EVENTO_GUARDA]
      ORDER BY [t].[NO_EVENTO_CONTAGEM]
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Total de registros: 36
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Tamanho da página: 10
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Página atual: 1
info: ApiGestaoDocumental.Controllers.TemporalidadeNaoCronologicaController[0]
      Finalizando ListarEventoTemporalidade (controller).
info: ApiGestaoDocumental.Services.TipoDocumentalService[0]
      Iniciando listagem de tipos documentais paginado ListarAsync.
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB048_TIPO_DOCUMENTAL] AS [g]
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [t].[NU_TIPO_DOCUMENTAL], [t].[NU_ATIVIDADE_DOCUMENTO], [t].[NU_ESPECIE_DOCUMENTAL], [t].[IC_TIPO_DOCUMENTAL_CONTEXTO], [t].[IC_TIPO_DOCUMENTAL_INTERNO], [t].[NO_TIPO_DOCUMENTAL_EXTERNO], [g0].[NU_ESPECIE_DOCUMENTAL], [g0].[IC_ESPECIE_DOCUMENTAL_ATIVA], [g0].[NO_ESPECIE_DOCUMENTAL], [g1].[NU_ATIVIDADE_DOCUMENTO], [g1].[IC_ATIVIDADE_DOCUMENTO_ATIVA], [g1].[NO_ATIVIDADE_DOCUMENTO]
      FROM (
          SELECT [g].[NU_TIPO_DOCUMENTAL], [g].[NU_ATIVIDADE_DOCUMENTO], [g].[NU_ESPECIE_DOCUMENTAL], [g].[IC_TIPO_DOCUMENTAL_CONTEXTO], [g].[IC_TIPO_DOCUMENTAL_INTERNO], [g].[NO_TIPO_DOCUMENTAL_EXTERNO]
          FROM [GAQTB048_TIPO_DOCUMENTAL] AS [g]
          ORDER BY [g].[NU_TIPO_DOCUMENTAL] DESC
          OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
      ) AS [t]
      LEFT JOIN [GAQTB029_ESPECIE_DOCUMENTAL] AS [g0] ON [t].[NU_ESPECIE_DOCUMENTAL] = [g0].[NU_ESPECIE_DOCUMENTAL]
      LEFT JOIN [GAQTB045_ATIVIDADE_DOCUMENTO] AS [g1] ON [t].[NU_ATIVIDADE_DOCUMENTO] = [g1].[NU_ATIVIDADE_DOCUMENTO]
      ORDER BY [t].[NU_TIPO_DOCUMENTAL] DESC
info: ApiGestaoDocumental.Services.TipoDocumentalService[0]
      Finalizando listagem de tipos documentais paginado ListarAsync.
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB029_ESPECIE_DOCUMENTAL] AS [g]
      WHERE [g].[IC_ESPECIE_DOCUMENTAL_ATIVA] = CAST(1 AS bit)
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [g].[NU_ESPECIE_DOCUMENTAL], [g].[IC_ESPECIE_DOCUMENTAL_ATIVA], [g].[NO_ESPECIE_DOCUMENTAL]
      FROM [GAQTB029_ESPECIE_DOCUMENTAL] AS [g]
      WHERE [g].[IC_ESPECIE_DOCUMENTAL_ATIVA] = CAST(1 AS bit)
      ORDER BY [g].[NU_ESPECIE_DOCUMENTAL] DESC
      OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
info: ApiGestaoDocumental.Services.TipoDocumentalService[0]
      Iniciando listagem de tipos documentais paginado ListarAsync.
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB048_TIPO_DOCUMENTAL] AS [g]
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [t].[NU_TIPO_DOCUMENTAL], [t].[NU_ATIVIDADE_DOCUMENTO], [t].[NU_ESPECIE_DOCUMENTAL], [t].[IC_TIPO_DOCUMENTAL_CONTEXTO], [t].[IC_TIPO_DOCUMENTAL_INTERNO], [t].[NO_TIPO_DOCUMENTAL_EXTERNO], [g0].[NU_ESPECIE_DOCUMENTAL], [g0].[IC_ESPECIE_DOCUMENTAL_ATIVA], [g0].[NO_ESPECIE_DOCUMENTAL], [g1].[NU_ATIVIDADE_DOCUMENTO], [g1].[IC_ATIVIDADE_DOCUMENTO_ATIVA], [g1].[NO_ATIVIDADE_DOCUMENTO]
      FROM (
          SELECT [g].[NU_TIPO_DOCUMENTAL], [g].[NU_ATIVIDADE_DOCUMENTO], [g].[NU_ESPECIE_DOCUMENTAL], [g].[IC_TIPO_DOCUMENTAL_CONTEXTO], [g].[IC_TIPO_DOCUMENTAL_INTERNO], [g].[NO_TIPO_DOCUMENTAL_EXTERNO]
          FROM [GAQTB048_TIPO_DOCUMENTAL] AS [g]
          ORDER BY [g].[NU_TIPO_DOCUMENTAL] DESC
          OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
      ) AS [t]
      LEFT JOIN [GAQTB029_ESPECIE_DOCUMENTAL] AS [g0] ON [t].[NU_ESPECIE_DOCUMENTAL] = [g0].[NU_ESPECIE_DOCUMENTAL]
      LEFT JOIN [GAQTB045_ATIVIDADE_DOCUMENTO] AS [g1] ON [t].[NU_ATIVIDADE_DOCUMENTO] = [g1].[NU_ATIVIDADE_DOCUMENTO]
      ORDER BY [t].[NU_TIPO_DOCUMENTAL] DESC
info: ApiGestaoDocumental.Services.TipoDocumentalService[0]
      Finalizando listagem de tipos documentais paginado ListarAsync.
info: ApiGestaoDocumental.Controllers.PlanoClassificacaoController[0]
      Iniciando BucaPlanoPorArea (controller).
info: ApiGestaoDocumental.Services.PlanoClassificacaoService[0]
      Iniciando BuscarPlanoVigentePorAreaAsync.
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (7ms) [Parameters=[@__tipoPlanoId_0='?' (Size = 1) (DbType = Byte)], CommandType='Text', CommandTimeout='30']
      SELECT TOP(1) [g].[NU_PLANO_CLASSIFICACAO], [g].[ED_PLANO_CLSFO_DCMTO_RPSRO], [g].[CO_IDNTR_INTGO_RPSRO_PLANO], [g].[DE_COMENTARIO_PLANO_CLSFO], [g].[TS_ULTIMA_ATUALIZACAO_CLSFO], [g].[DT_FIM_PLANO_CLASSIFICACAO], [g].[DT_INICIO_PLANO_CLASSIFICACAO], [g].[ED_DOCUMENTO_PLANO], [g].[NU_SITUACAO_INTEGRACAO_RPSRO], [g].[NU_SITUACAO_PLANO_CLSFO_DCMTO], [g].[NU_AREA_PLANO_CLASSIFICACAO], [g].[CO_USUARIO_RESPONSAVEL], [g0].[NU_SITUACAO_PLANO_CLSFO_DCMTO], [g0].[NO_SITUACAO_PLANO_CLSFO_DCMTO], [g1].[NU_AREA_PLANO_CLASSIFICACAO], [g1].[NO_AREA_PLANO_CLASSIFICACAO], [g2].[NU_SITUACAO_INTEGRACAO_RPSRO], [g2].[NO_SITUACAO_INTEGRACAO_RPSRO]
      FROM [GAQTB002_PLANO_CLSFO_DOCUMENTO] AS [g]
      INNER JOIN [GAQTB004_STCO_PLNO_CLSFO_DCMTO] AS [g0] ON [g].[NU_SITUACAO_PLANO_CLSFO_DCMTO] = [g0].[NU_SITUACAO_PLANO_CLSFO_DCMTO]
      INNER JOIN [GAQTB003_AREA_PLANO_CLSFO] AS [g1] ON [g].[NU_AREA_PLANO_CLASSIFICACAO] = [g1].[NU_AREA_PLANO_CLASSIFICACAO]
      INNER JOIN [GAQTB043_STCO_INTEGRACAO_RPSRO] AS [g2] ON [g].[NU_SITUACAO_INTEGRACAO_RPSRO] = [g2].[NU_SITUACAO_INTEGRACAO_RPSRO]
      WHERE [g].[NU_AREA_PLANO_CLASSIFICACAO] = @__tipoPlanoId_0 AND [g].[NU_SITUACAO_PLANO_CLSFO_DCMTO] = CAST(5 AS tinyint)
info: ApiGestaoDocumental.Services.PlanoClassificacaoService[0]
      Finalizando BuscarPlanoVigentePorAreaAsync.
info: ApiGestaoDocumental.Controllers.PlanoClassificacaoController[0]
      Finalizando BucaPlanoPorArea (controller).
info: ApiGestaoDocumental.Controllers.ItemClassificacaoController[0]
      Iniciando ObterItensFilhos de item de classificação documental (controller).
info: ApiGestaoDocumental.Services.ItemClassificacaoService[0]
      Iniciando ObterItensFilhosAsync.
info: ApiGestaoDocumental.Services.ItemClassificacaoService[0]
      Iniciando ValidaPlanoExiste.
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (7ms) [Parameters=[@__id_0='?' (DbType = Int16)], CommandType='Text', CommandTimeout='30']
      SELECT TOP(1) [g].[NU_PLANO_CLASSIFICACAO], [g].[ED_PLANO_CLSFO_DCMTO_RPSRO], [g].[CO_IDNTR_INTGO_RPSRO_PLANO], [g].[DE_COMENTARIO_PLANO_CLSFO], [g].[TS_ULTIMA_ATUALIZACAO_CLSFO], [g].[DT_FIM_PLANO_CLASSIFICACAO], [g].[DT_INICIO_PLANO_CLASSIFICACAO], [g].[ED_DOCUMENTO_PLANO], [g].[NU_SITUACAO_INTEGRACAO_RPSRO], [g].[NU_SITUACAO_PLANO_CLSFO_DCMTO], [g].[NU_AREA_PLANO_CLASSIFICACAO], [g].[CO_USUARIO_RESPONSAVEL], [g0].[NU_SITUACAO_PLANO_CLSFO_DCMTO], [g0].[NO_SITUACAO_PLANO_CLSFO_DCMTO], [g1].[NU_AREA_PLANO_CLASSIFICACAO], [g1].[NO_AREA_PLANO_CLASSIFICACAO], [g2].[NU_SITUACAO_INTEGRACAO_RPSRO], [g2].[NO_SITUACAO_INTEGRACAO_RPSRO]
      FROM [GAQTB002_PLANO_CLSFO_DOCUMENTO] AS [g]
      INNER JOIN [GAQTB004_STCO_PLNO_CLSFO_DCMTO] AS [g0] ON [g].[NU_SITUACAO_PLANO_CLSFO_DCMTO] = [g0].[NU_SITUACAO_PLANO_CLSFO_DCMTO]
      INNER JOIN [GAQTB003_AREA_PLANO_CLSFO] AS [g1] ON [g].[NU_AREA_PLANO_CLASSIFICACAO] = [g1].[NU_AREA_PLANO_CLASSIFICACAO]
      INNER JOIN [GAQTB043_STCO_INTEGRACAO_RPSRO] AS [g2] ON [g].[NU_SITUACAO_INTEGRACAO_RPSRO] = [g2].[NU_SITUACAO_INTEGRACAO_RPSRO]
      WHERE [g].[NU_PLANO_CLASSIFICACAO] = @__id_0 AND [g].[NU_SITUACAO_PLANO_CLSFO_DCMTO] <> CAST(6 AS tinyint)
info: ApiGestaoDocumental.Services.ItemClassificacaoService[0]
      Finalianzdo ValidaPlanoExiste.
fail: Microsoft.EntityFrameworkCore.Database.Command[20102]
      Failed executing DbCommand (6ms) [Parameters=[@__planoClassificacaoId_0='?' (DbType = Int16)], CommandType='Text', CommandTimeout='30']
      SELECT [g].[NU_CLASSIFICACAO_DOCUMENTO], [g].[CO_CLASSIFICACAO_DOCUMENTO], [g].[CO_IDNTR_INTGO_RPSRO_CLSFO], [g].[DE_DETALHE_CLSFO_DOCUMENTO], [g].[NU_CLASSIFICACAO_PAI], [g].[NO_CLASSIFICACAO_DOCUMENTO], [g].[NU_PLANO_CLASSIFICACAO], [g].[NU_SITUACAO_INTEGRACAO_RPSRO], [g].[IC_AGRUPAMENTO_CLASSIFICACAO], [g].[NU_TEMPORALIDADE_DOCUMENTO], [g0].[NU_TEMPORALIDADE_DOCUMENTO], [g0].[NU_EVENTO_CONTAGEM_CORRENTE], [g0].[NU_EVENTO_CONTAGEM_INTMA], [g0].[IC_GUARDA_PERMANENTE], [g0].[DE_OBSERVACAO_TMPRE_DOCUMENTO], [g0].[QT_TEMPORALIDADE_CORRENTE], [g0].[QT_TEMPORALIDADE_INTERMEDIARIA], [g1].[NU_EVENTO_CONTAGEM], [g1].[IC_EVENTO_CONTAGEM_ATIVO], [g1].[NO_EVENTO_CONTAGEM], [g1].[NU_TIPO_EVENTO_GUARDA], [g2].[NU_TIPO_EVENTO_GUARDA], [g2].[NO_TIPO_EVENTO_GUARDA], [g3].[NU_EVENTO_CONTAGEM], [g3].[IC_EVENTO_CONTAGEM_ATIVO], [g3].[NO_EVENTO_CONTAGEM], [g3].[NU_TIPO_EVENTO_GUARDA], [g4].[NU_TIPO_EVENTO_GUARDA], [g4].[NO_TIPO_EVENTO_GUARDA], [t].[NU_METADADO_CLSFO_DOCUMENTO], [t].[NU_CLASSIFICACAO_DOCUMENTO], [t].[NU_CLASSIFICACAO_DOCUMENTO_PAI], [t].[NU_METADADO_DOCUMENTO], [t].[NU_METADADO_DOCUMENTO0], [t].[CO_USUARIO_RESPONSAVEL_CRIACAO], [t].[CO_USUARIO_RESPONSAVEL_REVISAO], [t].[DT_GRAVACAO_REPOSITORIO_DCMTO], [t].[DE_DETALHE_METADADO_DOCUMENTO], [t].[DE_REJEICAO_METADADO_DOCUMENTO], [t].[IC_METADADO_DOCUMENTO_MULTIPLO], [t].[IC_METADADO_DCMTO_PROPRIETARIO], [t].[NO_METADADO_DOCUMENTO], [t].[NU_CLSFO_METADADO_DOCUMENTO], [t].[NU_SITUACAO_METADADO_DOCUMENTO], [t].[NU_TEMPLATE_METADADO_DOCUMENTO], [t].[NU_TIPO_DADO_METADADO]
      FROM [GAQTB001_CLSFO_DOCUMENTO] AS [g]
      LEFT JOIN [GAQTB010_TEMPORALIDADE_DCMTO] AS [g0] ON [g].[NU_TEMPORALIDADE_DOCUMENTO] = [g0].[NU_TEMPORALIDADE_DOCUMENTO]
      LEFT JOIN [GAQTB011_EVENTO_CONTAGEM] AS [g1] ON [g0].[NU_EVENTO_CONTAGEM_CORRENTE] = [g1].[NU_EVENTO_CONTAGEM]
      LEFT JOIN [GAQTB012_TIPO_EVENTO_GUARDA] AS [g2] ON [g1].[NU_TIPO_EVENTO_GUARDA] = [g2].[NU_TIPO_EVENTO_GUARDA]
      LEFT JOIN [GAQTB011_EVENTO_CONTAGEM] AS [g3] ON [g0].[NU_EVENTO_CONTAGEM_INTMA] = [g3].[NU_EVENTO_CONTAGEM]
      LEFT JOIN [GAQTB012_TIPO_EVENTO_GUARDA] AS [g4] ON [g3].[NU_TIPO_EVENTO_GUARDA] = [g4].[NU_TIPO_EVENTO_GUARDA]
      LEFT JOIN (
          SELECT [g5].[NU_METADADO_CLSFO_DOCUMENTO], [g5].[NU_CLASSIFICACAO_DOCUMENTO], [g5].[NU_CLASSIFICACAO_DOCUMENTO_PAI], [g5].[NU_METADADO_DOCUMENTO], [g6].[NU_METADADO_DOCUMENTO] AS [NU_METADADO_DOCUMENTO0], [g6].[CO_USUARIO_RESPONSAVEL_CRIACAO], [g6].[CO_USUARIO_RESPONSAVEL_REVISAO], [g6].[DT_GRAVACAO_REPOSITORIO_DCMTO], [g6].[DE_DETALHE_METADADO_DOCUMENTO], [g6].[DE_REJEICAO_METADADO_DOCUMENTO], [g6].[IC_METADADO_DOCUMENTO_MULTIPLO], [g6].[IC_METADADO_DCMTO_PROPRIETARIO], [g6].[NO_METADADO_DOCUMENTO], [g6].[NU_CLSFO_METADADO_DOCUMENTO], [g6].[NU_SITUACAO_METADADO_DOCUMENTO], [g6].[NU_TEMPLATE_METADADO_DOCUMENTO], [g6].[NU_TIPO_DADO_METADADO]
          FROM [GAQTB044_METADADO_CLSFO_DCMTO] AS [g5]
          INNER JOIN [GAQTB034_METADADO_DOCUMENTO] AS [g6] ON [g5].[NU_METADADO_DOCUMENTO] = [g6].[NU_METADADO_DOCUMENTO]
      ) AS [t] ON [g].[NU_CLASSIFICACAO_DOCUMENTO] = [t].[NU_CLASSIFICACAO_DOCUMENTO]
      WHERE [g].[NU_PLANO_CLASSIFICACAO] = @__planoClassificacaoId_0 AND [g].[NU_CLASSIFICACAO_PAI] IS NULL
      ORDER BY [g].[CO_CLASSIFICACAO_DOCUMENTO], [g].[NU_CLASSIFICACAO_DOCUMENTO], [g0].[NU_TEMPORALIDADE_DOCUMENTO], [g1].[NU_EVENTO_CONTAGEM], [g2].[NU_TIPO_EVENTO_GUARDA], [g3].[NU_EVENTO_CONTAGEM], [g4].[NU_TIPO_EVENTO_GUARDA], [t].[NU_METADADO_CLSFO_DOCUMENTO]
fail: Microsoft.EntityFrameworkCore.Query[10100]
      An exception occurred while iterating over the results of a query for context type 'ApiGestaoDocumental.Config.Database.AppDbContext'.
      Microsoft.Data.SqlClient.SqlException (0x80131904): Invalid column name 'IC_METADADO_DOCUMENTO_MULTIPLO'.
         at System.Threading.Tasks.ContinuationResultTaskFromResultTask`2.InnerInvoke()
         at System.Threading.ExecutionContext.RunInternal(ExecutionContext executionContext, ContextCallback callback, Object state)
      --- End of stack trace from previous location ---
         at System.Threading.ExecutionContext.RunInternal(ExecutionContext executionContext, ContextCallback callback, Object state)
         at System.Threading.Tasks.Task.ExecuteWithThreadLocal(Task& currentTaskSlot, Thread threadPoolThread)
      --- End of stack trace from previous location ---
         at Microsoft.EntityFrameworkCore.Storage.RelationalCommand.ExecuteReaderAsync(RelationalCommandParameterObject parameterObject, CancellationToken cancellationToken)
         at Microsoft.EntityFrameworkCore.Storage.RelationalCommand.ExecuteReaderAsync(RelationalCommandParameterObject parameterObject, CancellationToken cancellationToken)
         at Microsoft.EntityFrameworkCore.Query.Internal.SingleQueryingEnumerable`1.AsyncEnumerator.InitializeReaderAsync(AsyncEnumerator enumerator, CancellationToken cancellationToken)
         at Microsoft.EntityFrameworkCore.SqlServer.Storage.Internal.SqlServerExecutionStrategy.ExecuteAsync[TState,TResult](TState state, Func`4 operation, Func`4 verifySucceeded, CancellationToken cancellationToken)
         at Microsoft.EntityFrameworkCore.Query.Internal.SingleQueryingEnumerable`1.AsyncEnumerator.MoveNextAsync()
      ClientConnectionId:00bd05f1-5cd2-4fcf-a335-ecbabb0074d6
      Error Number:207,State:1,Class:16
      Microsoft.Data.SqlClient.SqlException (0x80131904): Invalid column name 'IC_METADADO_DOCUMENTO_MULTIPLO'.
         at System.Threading.Tasks.ContinuationResultTaskFromResultTask`2.InnerInvoke()
         at System.Threading.ExecutionContext.RunInternal(ExecutionContext executionContext, ContextCallback callback, Object state)
      --- End of stack trace from previous location ---
         at System.Threading.ExecutionContext.RunInternal(ExecutionContext executionContext, ContextCallback callback, Object state)
         at System.Threading.Tasks.Task.ExecuteWithThreadLocal(Task& currentTaskSlot, Thread threadPoolThread)
      --- End of stack trace from previous location ---
         at Microsoft.EntityFrameworkCore.Storage.RelationalCommand.ExecuteReaderAsync(RelationalCommandParameterObject parameterObject, CancellationToken cancellationToken)
         at Microsoft.EntityFrameworkCore.Storage.RelationalCommand.ExecuteReaderAsync(RelationalCommandParameterObject parameterObject, CancellationToken cancellationToken)
         at Microsoft.EntityFrameworkCore.Query.Internal.SingleQueryingEnumerable`1.AsyncEnumerator.InitializeReaderAsync(AsyncEnumerator enumerator, CancellationToken cancellationToken)
         at Microsoft.EntityFrameworkCore.SqlServer.Storage.Internal.SqlServerExecutionStrategy.ExecuteAsync[TState,TResult](TState state, Func`4 operation, Func`4 verifySucceeded, CancellationToken cancellationToken)
         at Microsoft.EntityFrameworkCore.Query.Internal.SingleQueryingEnumerable`1.AsyncEnumerator.MoveNextAsync()
      ClientConnectionId:00bd05f1-5cd2-4fcf-a335-ecbabb0074d6
      Error Number:207,State:1,Class:16
info: ApiGestaoDocumental.Controllers.ItemClassificacaoController[0]
      Erro interno no servidor.
info: ApiGestaoDocumental.Controllers.TipoUnidadeProducaoController[0]
      Iniciando ListarTiposUnidadeProducao (controller).
info: ApiGestaoDocumental.Services.TipoUnidadeProducaoService[0]
      Iniciando listagem de tipos de unidade de produção.
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (3ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB050_TIPO_UNIDADE_PRODUCAO] AS [g]
      WHERE [g].[IC_TIPO_UNDDE_PDCAO_DCMTO_ATVO] = CAST(1 AS bit)
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (2ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [g].[NU_TIPO_UNIDADE_PRODUCAO_DCMTO], [g].[IC_TIPO_UNDDE_PDCAO_DCMTO_ATVO], [g].[NO_TIPO_UNIDADE_PRODUCAO_DCMTO]
      FROM [GAQTB050_TIPO_UNIDADE_PRODUCAO] AS [g]
      WHERE [g].[IC_TIPO_UNDDE_PDCAO_DCMTO_ATVO] = CAST(1 AS bit)
      ORDER BY [g].[NU_TIPO_UNIDADE_PRODUCAO_DCMTO] DESC
      OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
info: ApiGestaoDocumental.Services.TipoUnidadeProducaoService[0]
      Listagem de tipos de unidade de produção retornada com sucesso.
info: ApiGestaoDocumental.Controllers.TipoUnidadeProducaoController[0]
      Finalizando ListarTiposUnidadeProducao (controller).
info: ApiGestaoDocumental.Controllers.NormasController[0]
      Iniciando BuscarNormasPorUnidadeGestora (controller).
fail: Microsoft.AspNetCore.Diagnostics.ExceptionHandlerMiddleware[1]
      An unhandled exception has occurred while executing the request.
      ApiGestaoDocumental.Exceptions.BusinessException: Exception of type 'ApiGestaoDocumental.Exceptions.BusinessException' was thrown.
         at ApiGestaoDocumental.Services.NormasApiService.ObterBearerTokenAtual() in /src/src/Services/NormasApiService.cs:line 144
         at ApiGestaoDocumental.Services.NormasApiService.BuscarNormasVigentesAsync(BuscarNormasDTO filter) in /src/src/Services/NormasApiService.cs:line 42
         at ApiGestaoDocumental.Services.NormasService.BuscarNormasPorUnidadeGestora(String codigoUnidade) in /src/src/Services/NormasService.cs:line 37
         at ApiGestaoDocumental.Controllers.NormasController.BuscarNormasPorUnidadeGestora(String codigoUnidade) in /src/src/Controllers/NormasController.cs:line 31
         at lambda_method68(Closure, Object)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ActionMethodExecutor.TaskOfActionResultExecutor.Execute(ActionContext actionContext, IActionResultTypeMapper mapper, ObjectMethodExecutor executor, Object controller, Object[] arguments)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.<InvokeActionMethodAsync>g__Logged|12_1(ControllerActionInvoker invoker)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.<InvokeNextActionFilterAsync>g__Awaited|10_0(ControllerActionInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.Rethrow(ActionExecutedContextSealed context)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.Next(State& next, Scope& scope, Object& state, Boolean& isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.InvokeInnerFilterAsync()
      --- End of stack trace from previous location ---
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeFilterPipelineAsync>g__Awaited|20_0(ResourceInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeAsync>g__Logged|17_1(ResourceInvoker invoker)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeAsync>g__Logged|17_1(ResourceInvoker invoker)
         at Microsoft.AspNetCore.Authorization.AuthorizationMiddleware.Invoke(HttpContext context)
         at Microsoft.AspNetCore.Authentication.AuthenticationMiddleware.Invoke(HttpContext context)
         at Swashbuckle.AspNetCore.SwaggerUI.SwaggerUIMiddleware.Invoke(HttpContext httpContext)
         at Swashbuckle.AspNetCore.Swagger.SwaggerMiddleware.Invoke(HttpContext httpContext, ISwaggerProvider swaggerProvider)
         at ApiGestaoDocumental.Middlewares.ResponseTelemetryMiddleware.Invoke(HttpContext context) in /src/src/Middlewares/ResponseTelemetryMiddleware.cs:line 26
         at ApiGestaoDocumental.Middlewares.RequestTelemetryMiddleware.Invoke(HttpContext context) in /src/src/Middlewares/RequestTelemetryMiddleware.cs:line 43
         at Microsoft.AspNetCore.Diagnostics.ExceptionHandlerMiddlewareImpl.<Invoke>g__Awaited|10_0(ExceptionHandlerMiddlewareImpl middleware, HttpContext context, Task task)
warn: ApiGestaoDocumental.Exceptions.Handlers.BusinessExceptionHandler[0]
      Erro de negócio em /v1/normas/buscar-normas-por-unidade-gestora/5304. Codigo: UNAUTHORIZED, Mensagem: Token de autenticação não informado na requisição., TraceId: 014f1022d3f358eaa30ce7befe8f3cc3
info: ApiGestaoDocumental.Controllers.TemporalidadeNaoCronologicaController[0]
      Iniciando ListarEventoTemporalidade (controller).
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Procurando parâmetros de temporalidade não crológicos...
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Iniciando ListarParametros
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (2ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB011_EVENTO_CONTAGEM] AS [g]
      WHERE [g].[IC_EVENTO_CONTAGEM_ATIVO] = CAST(1 AS bit)
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (2ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [t].[NU_EVENTO_CONTAGEM], [t].[IC_EVENTO_CONTAGEM_ATIVO], [t].[NO_EVENTO_CONTAGEM], [t].[NU_TIPO_EVENTO_GUARDA], [g0].[NU_TIPO_EVENTO_GUARDA], [g0].[NO_TIPO_EVENTO_GUARDA]
      FROM (
          SELECT [g].[NU_EVENTO_CONTAGEM], [g].[IC_EVENTO_CONTAGEM_ATIVO], [g].[NO_EVENTO_CONTAGEM], [g].[NU_TIPO_EVENTO_GUARDA]
          FROM [GAQTB011_EVENTO_CONTAGEM] AS [g]
          WHERE [g].[IC_EVENTO_CONTAGEM_ATIVO] = CAST(1 AS bit)
          ORDER BY [g].[NO_EVENTO_CONTAGEM]
          OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
      ) AS [t]
      INNER JOIN [GAQTB012_TIPO_EVENTO_GUARDA] AS [g0] ON [t].[NU_TIPO_EVENTO_GUARDA] = [g0].[NU_TIPO_EVENTO_GUARDA]
      ORDER BY [t].[NO_EVENTO_CONTAGEM]
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Total de registros: 36
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Tamanho da página: 10
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Página atual: 1
info: ApiGestaoDocumental.Controllers.TemporalidadeNaoCronologicaController[0]
      Finalizando ListarEventoTemporalidade (controller).
info: ApiGestaoDocumental.Controllers.NormasController[0]
      Iniciando BuscarNormasPorUnidadeGestora (controller).
info: System.Net.Http.HttpClient.Normas.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/normas/api/v1/normativos?grau_sigilo=%23INTERNO.CAIXA&offset=0&limit=1500
dbug: ApiGestaoDocumental.Middlewares.HttpCallLoggingHandler[0]
      Iniciando chamada HTTP GET https://api.des.caixa:8443/normas/api/v1/normativos?grau_sigilo=%23INTERNO.CAIXA&offset=0&limit=1500
info: System.Net.Http.HttpClient.Normas.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/normas/api/v1/normativos?grau_sigilo=%23INTERNO.CAIXA&offset=0&limit=1500
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] Conexão TCP estabelecida com api.des.caixa:8443 em 41ms
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS escrita #1: 290 bytes enviados para api.des.caixa em 0ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #1: 0 bytes recebidos de api.des.caixa em 17ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #2: 99 bytes recebidos de api.des.caixa em 17ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS escrita #2: 329 bytes enviados para api.des.caixa em 18ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #3: 0 bytes recebidos de api.des.caixa em 36ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #4: 5002 bytes recebidos de api.des.caixa em 36ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #5: 0 bytes recebidos de api.des.caixa em 38ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #6: 338 bytes recebidos de api.des.caixa em 38ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS escrita #3: 104 bytes enviados para api.des.caixa em 38ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas] Handshake TLS concluído com sucesso: Protocolo=Tls13, Cifra=TLS_AES_256_GCM_SHA384, AutenticacaoMutua=False
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS escrita #4: 1759 bytes enviados para api.des.caixa em 40ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #7: 0 bytes recebidos de api.des.caixa em 3472ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #8: 7906 bytes recebidos de api.des.caixa em 3472ms (acumulado)
info: System.Net.Http.HttpClient.Normas.ClientHandler[101]
      Received HTTP response headers after 3514.9379ms - 200
dbug: ApiGestaoDocumental.Middlewares.HttpCallLoggingHandler[0]
      Chamada HTTP GET https://api.des.caixa:8443/normas/api/v1/normativos?grau_sigilo=%23INTERNO.CAIXA&offset=0&limit=1500 concluída com 200 em 3515ms
info: System.Net.Http.HttpClient.Normas.LogicalHandler[101]
      End processing HTTP request after 3515.162ms - 200
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #9: 0 bytes recebidos de api.des.caixa em 3473ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #10: 10566 bytes recebidos de api.des.caixa em 3473ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #11: 0 bytes recebidos de api.des.caixa em 3489ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #12: 7906 bytes recebidos de api.des.caixa em 3489ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #13: 0 bytes recebidos de api.des.caixa em 3490ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #14: 2660 bytes recebidos de api.des.caixa em 3490ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #15: 11636 bytes recebidos de api.des.caixa em 3490ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #16: 0 bytes recebidos de api.des.caixa em 3490ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #17: 9422 bytes recebidos de api.des.caixa em 3490ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #18: 0 bytes recebidos de api.des.caixa em 3506ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #19: 15812 bytes recebidos de api.des.caixa em 3506ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #20: 0 bytes recebidos de api.des.caixa em 3507ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #21: 6390 bytes recebidos de api.des.caixa em 3507ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #22: 0 bytes recebidos de api.des.caixa em 3507ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #23: 9422 bytes recebidos de api.des.caixa em 3507ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #24: 0 bytes recebidos de api.des.caixa em 3507ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #25: 7906 bytes recebidos de api.des.caixa em 3507ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #26: 0 bytes recebidos de api.des.caixa em 3508ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #27: 7906 bytes recebidos de api.des.caixa em 3508ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #28: 0 bytes recebidos de api.des.caixa em 3508ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #29: 2660 bytes recebidos de api.des.caixa em 3508ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #30: 3730 bytes recebidos de api.des.caixa em 3523ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #31: 0 bytes recebidos de api.des.caixa em 3523ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #32: 4176 bytes recebidos de api.des.caixa em 3523ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #33: 27448 bytes recebidos de api.des.caixa em 3524ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #34: 0 bytes recebidos de api.des.caixa em 3525ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #35: 27894 bytes recebidos de api.des.caixa em 3525ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #36: 0 bytes recebidos de api.des.caixa em 3525ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #37: 3730 bytes recebidos de api.des.caixa em 3525ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #38: 0 bytes recebidos de api.des.caixa em 3525ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #39: 17328 bytes recebidos de api.des.caixa em 3525ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #40: 0 bytes recebidos de api.des.caixa em 3525ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #41: 5246 bytes recebidos de api.des.caixa em 3525ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #42: 0 bytes recebidos de api.des.caixa em 3526ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #43: 5320 bytes recebidos de api.des.caixa em 3526ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #44: 13152 bytes recebidos de api.des.caixa em 3540ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #45: 0 bytes recebidos de api.des.caixa em 3541ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #46: 2660 bytes recebidos de api.des.caixa em 3541ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #47: 11636 bytes recebidos de api.des.caixa em 3541ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #48: 0 bytes recebidos de api.des.caixa em 3541ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #49: 6762 bytes recebidos de api.des.caixa em 3541ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #50: 0 bytes recebidos de api.des.caixa em 3542ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #51: 7906 bytes recebidos de api.des.caixa em 3542ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #52: 0 bytes recebidos de api.des.caixa em 3543ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #53: 15812 bytes recebidos de api.des.caixa em 3543ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #54: 0 bytes recebidos de api.des.caixa em 3543ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #55: 1330 bytes recebidos de api.des.caixa em 3543ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #56: 14482 bytes recebidos de api.des.caixa em 3543ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #57: 0 bytes recebidos de api.des.caixa em 3544ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #58: 23718 bytes recebidos de api.des.caixa em 3544ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #59: 0 bytes recebidos de api.des.caixa em 3544ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #60: 23718 bytes recebidos de api.des.caixa em 3544ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #61: 0 bytes recebidos de api.des.caixa em 3558ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #62: 15812 bytes recebidos de api.des.caixa em 3558ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #63: 0 bytes recebidos de api.des.caixa em 3559ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #64: 15812 bytes recebidos de api.des.caixa em 3559ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #65: 0 bytes recebidos de api.des.caixa em 3560ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #66: 1330 bytes recebidos de api.des.caixa em 3560ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #67: 14482 bytes recebidos de api.des.caixa em 3560ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #68: 0 bytes recebidos de api.des.caixa em 3561ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #69: 15812 bytes recebidos de api.des.caixa em 3561ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #70: 0 bytes recebidos de api.des.caixa em 3561ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #71: 15812 bytes recebidos de api.des.caixa em 3561ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #72: 0 bytes recebidos de api.des.caixa em 3562ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #73: 15812 bytes recebidos de api.des.caixa em 3562ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #74: 0 bytes recebidos de api.des.caixa em 3563ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #75: 23718 bytes recebidos de api.des.caixa em 3563ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #76: 0 bytes recebidos de api.des.caixa em 3576ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #77: 15812 bytes recebidos de api.des.caixa em 3576ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #78: 0 bytes recebidos de api.des.caixa em 3577ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #79: 15812 bytes recebidos de api.des.caixa em 3577ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #80: 0 bytes recebidos de api.des.caixa em 3578ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #81: 15812 bytes recebidos de api.des.caixa em 3578ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #82: 0 bytes recebidos de api.des.caixa em 3578ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #83: 15812 bytes recebidos de api.des.caixa em 3578ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #84: 0 bytes recebidos de api.des.caixa em 3579ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #85: 15812 bytes recebidos de api.des.caixa em 3579ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #86: 0 bytes recebidos de api.des.caixa em 3580ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #87: 15812 bytes recebidos de api.des.caixa em 3580ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #88: 0 bytes recebidos de api.des.caixa em 3580ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #89: 14556 bytes recebidos de api.des.caixa em 3580ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #90: 0 bytes recebidos de api.des.caixa em 3580ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #91: 5246 bytes recebidos de api.des.caixa em 3580ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #92: 0 bytes recebidos de api.des.caixa em 3580ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #93: 3916 bytes recebidos de api.des.caixa em 3580ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #94: 0 bytes recebidos de api.des.caixa em 3594ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #95: 7906 bytes recebidos de api.des.caixa em 3594ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #96: 0 bytes recebidos de api.des.caixa em 3594ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #97: 2660 bytes recebidos de api.des.caixa em 3594ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #98: 9236 bytes recebidos de api.des.caixa em 3594ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #99: 0 bytes recebidos de api.des.caixa em 3594ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #100: 8873 bytes recebidos de api.des.caixa em 3594ms (acumulado)
info: ApiGestaoDocumental.Services.NormasApiService[0]
      Normas vigentes armazenadas no cache Redis por uma hora.
info: ApiGestaoDocumental.Controllers.NormasController[0]
      Finalizando BuscarNormasPorUnidadeGestora (controller).
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #101: 0 bytes recebidos de api.des.caixa em 63543ms (acumulado)
dbug: HttpClientDiagnostics.Normas[0]
      [Normas][77c33add] TLS leitura #102: 24 bytes recebidos de api.des.caixa em 63543ms (acumulado)
info: ApiGestaoDocumental.Controllers.TemporalidadeNaoCronologicaController[0]
      Iniciando ListarEventoTemporalidade (controller).
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Procurando parâmetros de temporalidade não crológicos...
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Iniciando ListarParametros
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (2ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB011_EVENTO_CONTAGEM] AS [g]
      WHERE [g].[IC_EVENTO_CONTAGEM_ATIVO] = CAST(1 AS bit)
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (2ms) [Parameters=[@__p_0='?' (DbType = Int32), @__p_1='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [t].[NU_EVENTO_CONTAGEM], [t].[IC_EVENTO_CONTAGEM_ATIVO], [t].[NO_EVENTO_CONTAGEM], [t].[NU_TIPO_EVENTO_GUARDA], [g0].[NU_TIPO_EVENTO_GUARDA], [g0].[NO_TIPO_EVENTO_GUARDA]
      FROM (
          SELECT [g].[NU_EVENTO_CONTAGEM], [g].[IC_EVENTO_CONTAGEM_ATIVO], [g].[NO_EVENTO_CONTAGEM], [g].[NU_TIPO_EVENTO_GUARDA]
          FROM [GAQTB011_EVENTO_CONTAGEM] AS [g]
          WHERE [g].[IC_EVENTO_CONTAGEM_ATIVO] = CAST(1 AS bit)
          ORDER BY [g].[NO_EVENTO_CONTAGEM]
          OFFSET @__p_0 ROWS FETCH NEXT @__p_1 ROWS ONLY
      ) AS [t]
      INNER JOIN [GAQTB012_TIPO_EVENTO_GUARDA] AS [g0] ON [t].[NU_TIPO_EVENTO_GUARDA] = [g0].[NU_TIPO_EVENTO_GUARDA]
      ORDER BY [t].[NO_EVENTO_CONTAGEM]
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Total de registros: 36
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Tamanho da página: 10
info: ApiGestaoDocumental.Services.Temporalidade.TemporalidadeNaoCronologicaService[0]
      Página atual: 1
info: ApiGestaoDocumental.Controllers.TemporalidadeNaoCronologicaController[0]
      Finalizando ListarEventoTemporalidade (controller).
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (5ms) [Parameters=[@__pattern_1='?' (Size = 100), @__pattern_1_1='?' (Size = 50)], CommandType='Text', CommandTimeout='30']
      SELECT COUNT(*)
      FROM [GAQTB014_TIPO_DOCUMENTO] AS [g]
      WHERE [g].[IC_TIPO_DOCUMENTO_ATIVO] = CAST(1 AS bit) AND [g].[NU_SITUACAO_TIPO_DOCUMENTO] <> CAST(1 AS tinyint) AND ([g].[NO_TIPO_DOCUMENTO] LIKE @__pattern_1 OR [g].[CO_REFERENCIA] LIKE @__pattern_1_1)
warn: Microsoft.EntityFrameworkCore.Query[20504]
      Compiling a query which loads related collections for more than one collection navigation, either via 'Include' or through projection, but no 'QuerySplittingBehavior' has been configured. By default, Entity Framework will use 'QuerySplittingBehavior.SingleQuery', which can potentially result in slow query performance. See https://go.microsoft.com/fwlink/?linkid=2134277 for more information. To identify the query that's triggering this warning call 'ConfigureWarnings(w => w.Throw(RelationalEventId.MultipleCollectionIncludeWarning))'.
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (76ms) [Parameters=[@__pattern_1='?' (Size = 100), @__pattern_1_1='?' (Size = 50), @__p_2='?' (DbType = Int32), @__p_3='?' (DbType = Int32)], CommandType='Text', CommandTimeout='30']
      SELECT [t].[NU_TIPO_DOCUMENTO], [t].[NU_AREA_PLANO_CLASSIFICACAO], [t].[CO_REFERENCIA], [t].[NU_NORMA_VINCULADA_TIPO_DCMTO], [t].[NU_SISTEMA_ORIGEM_TIPO_DCMTO], [t].[NU_UNIDADE_GESTORA_TIPO_DCMTO], [t].[TS_ULTIMA_ATUALIZACAO_TIPO], [t].[DT_CRIACAO_TIPO_DOCUMENTO], [t].[NU_FAMILIA_DOCUMENTAL], [t].[NU_EXTENSAO_FORMATO_DIGITAL], [t].[NU_GENERO_DOCUMENTAL], [t].[IC_TIPO_DOCUMENTO_ATIVO], [t].[NO_TIPO_DOCUMENTO], [t].[DE_OBSRO_VERSAO_TIPO_DOCMTO], [t].[NU_SITUACAO_TIPO_DOCUMENTO], [t].[NU_SUPORTE_DOCUMENTAL], [t].[NU_TIPO_DOCUMENTAL], [t].[NU_TIPO_REFERENCIA_DOCUMENTO], [t].[CO_USUARIO_RESPONSAVEL], [g0].[NU_SUPORTE_DOCUMENTAL], [g0].[IC_SUPORTE_DOCUMENTAL_ATIVO], [g0].[NO_SUPORTE_DOCUMENTAL], [g1].[NU_TIPO_REFERENCIA_DOCUMENTO], [g1].[NO_TIPO_REFERENCIA_DOCUMENTO], [g2].[NU_SITUACAO_TIPO_DOCUMENTO], [g2].[NO_SITUACAO_TIPO_DOCUMENTO], [g3].[NU_FAMILIA_DOCUMENTAL], [g3].[IC_FAMILIA_DOCUMENTAL_ATIVA], [g3].[NO_FAMILIA_DOCUMENTAL], [g3].[NU_AREA_PLANO_CLASSIFICACAO], [g4].[NU_EXTENSAO_FORMATO_DIGITAL], [g4].[IC_EXTENSAO_FMTO_DIGITAL_ATIVO], [g4].[SG_EXTENSAO_FORMATO_DIGITAL], [g5].[NU_AREA_PLANO_CLASSIFICACAO], [g5].[NO_AREA_PLANO_CLASSIFICACAO], [g6].[NU_TIPO_DOCUMENTAL], [g7].[NU_ESPECIE_DOCUMENTAL], [g8].[NU_ATIVIDADE_DOCUMENTO], [t0].[NU_CONTEXTO_TIPO_DOCUMENTO], [t0].[NU_CONTEXTO_DOCUMENTO], [t0].[NU_TIPO_DOCUMENTO], [t0].[NU_CONTEXTO_DOCUMENTO0], [t0].[IC_CONTEXTO_DOCUMENTO_ATIVO], [t0].[NO_CONTEXTO_DOCUMENTO], [t1].[NU_TIPO_DOCUMENTO], [t1].[NU_CLASSIFICACAO_DOCUMENTO], [t1].[NU_TIPO_DOCUMENTO_CLSFO], [t1].[NU_CLASSIFICACAO_DOCUMENTO0], [t1].[CO_CLASSIFICACAO_DOCUMENTO], [t1].[CO_IDNTR_INTGO_RPSRO_CLSFO], [t1].[DE_DETALHE_CLSFO_DOCUMENTO], [t1].[NU_CLASSIFICACAO_PAI], [t1].[NO_CLASSIFICACAO_DOCUMENTO], [t1].[NU_PLANO_CLASSIFICACAO], [t1].[NU_SITUACAO_INTEGRACAO_RPSRO], [t1].[IC_AGRUPAMENTO_CLASSIFICACAO], [t1].[NU_TEMPORALIDADE_DOCUMENTO], [t1].[NU_PLANO_CLASSIFICACAO0], [t1].[ED_PLANO_CLSFO_DCMTO_RPSRO], [t1].[CO_IDNTR_INTGO_RPSRO_PLANO], [t1].[DE_COMENTARIO_PLANO_CLSFO], [t1].[TS_ULTIMA_ATUALIZACAO_CLSFO], [t1].[DT_FIM_PLANO_CLASSIFICACAO], [t1].[DT_INICIO_PLANO_CLASSIFICACAO], [t1].[ED_DOCUMENTO_PLANO], [t1].[NU_SITUACAO_INTEGRACAO_RPSRO0], [t1].[NU_SITUACAO_PLANO_CLSFO_DCMTO], [t1].[NU_AREA_PLANO_CLASSIFICACAO], [t1].[CO_USUARIO_RESPONSAVEL], [t1].[NU_TEMPORALIDADE_DOCUMENTO0], [t1].[NU_EVENTO_CONTAGEM_CORRENTE], [t1].[NU_EVENTO_CONTAGEM_INTMA], [t1].[IC_GUARDA_PERMANENTE], [t1].[DE_OBSERVACAO_TMPRE_DOCUMENTO], [t1].[QT_TEMPORALIDADE_CORRENTE], [t1].[QT_TEMPORALIDADE_INTERMEDIARIA], [t1].[NU_EVENTO_CONTAGEM], [t1].[IC_EVENTO_CONTAGEM_ATIVO], [t1].[NO_EVENTO_CONTAGEM], [t1].[NU_TIPO_EVENTO_GUARDA], [t1].[NU_TIPO_EVENTO_GUARDA0], [t1].[NO_TIPO_EVENTO_GUARDA], [t1].[NU_EVENTO_CONTAGEM0], [t1].[IC_EVENTO_CONTAGEM_ATIVO0], [t1].[NO_EVENTO_CONTAGEM0], [t1].[NU_TIPO_EVENTO_GUARDA1], [t1].[NU_TIPO_EVENTO_GUARDA2], [t1].[NO_TIPO_EVENTO_GUARDA0], [g6].[NU_ATIVIDADE_DOCUMENTO], [g6].[NU_ESPECIE_DOCUMENTAL], [g6].[IC_TIPO_DOCUMENTAL_CONTEXTO], [g6].[IC_TIPO_DOCUMENTAL_INTERNO], [g6].[NO_TIPO_DOCUMENTAL_EXTERNO], [g7].[IC_ESPECIE_DOCUMENTAL_ATIVA], [g7].[NO_ESPECIE_DOCUMENTAL], [g8].[IC_ATIVIDADE_DOCUMENTO_ATIVA], [g8].[NO_ATIVIDADE_DOCUMENTO], [t2].[NU_TIPO_DOCUMENTO], [t2].[NU_TIPO_UNIDADE_PRODUCAO_DCMTO], [t2].[NU_TIPO_UNIDADE_PRODUCAO_DCMTO0], [t2].[IC_TIPO_UNDDE_PDCAO_DCMTO_ATVO], [t2].[NO_TIPO_UNIDADE_PRODUCAO_DCMTO]
      FROM (
          SELECT [g].[NU_TIPO_DOCUMENTO], [g].[NU_AREA_PLANO_CLASSIFICACAO], [g].[CO_REFERENCIA], [g].[NU_NORMA_VINCULADA_TIPO_DCMTO], [g].[NU_SISTEMA_ORIGEM_TIPO_DCMTO], [g].[NU_UNIDADE_GESTORA_TIPO_DCMTO], [g].[TS_ULTIMA_ATUALIZACAO_TIPO], [g].[DT_CRIACAO_TIPO_DOCUMENTO], [g].[NU_FAMILIA_DOCUMENTAL], [g].[NU_EXTENSAO_FORMATO_DIGITAL], [g].[NU_GENERO_DOCUMENTAL], [g].[IC_TIPO_DOCUMENTO_ATIVO], [g].[NO_TIPO_DOCUMENTO], [g].[DE_OBSRO_VERSAO_TIPO_DOCMTO], [g].[NU_SITUACAO_TIPO_DOCUMENTO], [g].[NU_SUPORTE_DOCUMENTAL], [g].[NU_TIPO_DOCUMENTAL], [g].[NU_TIPO_REFERENCIA_DOCUMENTO], [g].[CO_USUARIO_RESPONSAVEL]
          FROM [GAQTB014_TIPO_DOCUMENTO] AS [g]
          WHERE [g].[IC_TIPO_DOCUMENTO_ATIVO] = CAST(1 AS bit) AND [g].[NU_SITUACAO_TIPO_DOCUMENTO] <> CAST(1 AS tinyint) AND ([g].[NO_TIPO_DOCUMENTO] LIKE @__pattern_1 OR [g].[CO_REFERENCIA] LIKE @__pattern_1_1)
          ORDER BY [g].[TS_ULTIMA_ATUALIZACAO_TIPO], [g].[NU_TIPO_DOCUMENTO]
          OFFSET @__p_2 ROWS FETCH NEXT @__p_3 ROWS ONLY
      ) AS [t]
      LEFT JOIN [GAQTB027_SUPORTE_DOCUMENTAL] AS [g0] ON [t].[NU_SUPORTE_DOCUMENTAL] = [g0].[NU_SUPORTE_DOCUMENTAL]
      LEFT JOIN [GAQTB040_TIPO_REFERENCIA_DCMTO] AS [g1] ON [t].[NU_TIPO_REFERENCIA_DOCUMENTO] = [g1].[NU_TIPO_REFERENCIA_DOCUMENTO]
      INNER JOIN [GAQTB024_SITUACAO_TIPO_CDMTO] AS [g2] ON [t].[NU_SITUACAO_TIPO_DOCUMENTO] = [g2].[NU_SITUACAO_TIPO_DOCUMENTO]
      LEFT JOIN [GAQTB025_FAMILIA_DOCUMENTAL] AS [g3] ON [t].[NU_FAMILIA_DOCUMENTAL] = [g3].[NU_FAMILIA_DOCUMENTAL]
      LEFT JOIN [GAQTB021_EXTENSAO_FMTO_DIGITAL] AS [g4] ON [t].[NU_EXTENSAO_FORMATO_DIGITAL] = [g4].[NU_EXTENSAO_FORMATO_DIGITAL]
      LEFT JOIN [GAQTB003_AREA_PLANO_CLSFO] AS [g5] ON [t].[NU_AREA_PLANO_CLASSIFICACAO] = [g5].[NU_AREA_PLANO_CLASSIFICACAO]
      LEFT JOIN [GAQTB048_TIPO_DOCUMENTAL] AS [g6] ON [t].[NU_TIPO_DOCUMENTAL] = [g6].[NU_TIPO_DOCUMENTAL]
      LEFT JOIN [GAQTB029_ESPECIE_DOCUMENTAL] AS [g7] ON [g6].[NU_ESPECIE_DOCUMENTAL] = [g7].[NU_ESPECIE_DOCUMENTAL]
      LEFT JOIN [GAQTB045_ATIVIDADE_DOCUMENTO] AS [g8] ON [g6].[NU_ATIVIDADE_DOCUMENTO] = [g8].[NU_ATIVIDADE_DOCUMENTO]
      LEFT JOIN (
          SELECT [g9].[NU_CONTEXTO_TIPO_DOCUMENTO], [g9].[NU_CONTEXTO_DOCUMENTO], [g9].[NU_TIPO_DOCUMENTO], [g10].[NU_CONTEXTO_DOCUMENTO] AS [NU_CONTEXTO_DOCUMENTO0], [g10].[IC_CONTEXTO_DOCUMENTO_ATIVO], [g10].[NO_CONTEXTO_DOCUMENTO]
          FROM [GAQTB049_CONTEXTO_TIPO_DCMTO] AS [g9]
          INNER JOIN [GAQTB047_CONTEXTO_DOCUMENTO] AS [g10] ON [g9].[NU_CONTEXTO_DOCUMENTO] = [g10].[NU_CONTEXTO_DOCUMENTO]
      ) AS [t0] ON [t].[NU_TIPO_DOCUMENTO] = [t0].[NU_TIPO_DOCUMENTO]
      LEFT JOIN (
          SELECT [g11].[NU_TIPO_DOCUMENTO], [g11].[NU_CLASSIFICACAO_DOCUMENTO], [g11].[NU_TIPO_DOCUMENTO_CLSFO], [g12].[NU_CLASSIFICACAO_DOCUMENTO] AS [NU_CLASSIFICACAO_DOCUMENTO0], [g12].[CO_CLASSIFICACAO_DOCUMENTO], [g12].[CO_IDNTR_INTGO_RPSRO_CLSFO], [g12].[DE_DETALHE_CLSFO_DOCUMENTO], [g12].[NU_CLASSIFICACAO_PAI], [g12].[NO_CLASSIFICACAO_DOCUMENTO], [g12].[NU_PLANO_CLASSIFICACAO], [g12].[NU_SITUACAO_INTEGRACAO_RPSRO], [g12].[IC_AGRUPAMENTO_CLASSIFICACAO], [g12].[NU_TEMPORALIDADE_DOCUMENTO], [g13].[NU_PLANO_CLASSIFICACAO] AS [NU_PLANO_CLASSIFICACAO0], [g13].[ED_PLANO_CLSFO_DCMTO_RPSRO], [g13].[CO_IDNTR_INTGO_RPSRO_PLANO], [g13].[DE_COMENTARIO_PLANO_CLSFO], [g13].[TS_ULTIMA_ATUALIZACAO_CLSFO], [g13].[DT_FIM_PLANO_CLASSIFICACAO], [g13].[DT_INICIO_PLANO_CLASSIFICACAO], [g13].[ED_DOCUMENTO_PLANO], [g13].[NU_SITUACAO_INTEGRACAO_RPSRO] AS [NU_SITUACAO_INTEGRACAO_RPSRO0], [g13].[NU_SITUACAO_PLANO_CLSFO_DCMTO], [g13].[NU_AREA_PLANO_CLASSIFICACAO], [g13].[CO_USUARIO_RESPONSAVEL], [g14].[NU_TEMPORALIDADE_DOCUMENTO] AS [NU_TEMPORALIDADE_DOCUMENTO0], [g14].[NU_EVENTO_CONTAGEM_CORRENTE], [g14].[NU_EVENTO_CONTAGEM_INTMA], [g14].[IC_GUARDA_PERMANENTE], [g14].[DE_OBSERVACAO_TMPRE_DOCUMENTO], [g14].[QT_TEMPORALIDADE_CORRENTE], [g14].[QT_TEMPORALIDADE_INTERMEDIARIA], [g15].[NU_EVENTO_CONTAGEM], [g15].[IC_EVENTO_CONTAGEM_ATIVO], [g15].[NO_EVENTO_CONTAGEM], [g15].[NU_TIPO_EVENTO_GUARDA], [g16].[NU_TIPO_EVENTO_GUARDA] AS [NU_TIPO_EVENTO_GUARDA0], [g16].[NO_TIPO_EVENTO_GUARDA], [g17].[NU_EVENTO_CONTAGEM] AS [NU_EVENTO_CONTAGEM0], [g17].[IC_EVENTO_CONTAGEM_ATIVO] AS [IC_EVENTO_CONTAGEM_ATIVO0], [g17].[NO_EVENTO_CONTAGEM] AS [NO_EVENTO_CONTAGEM0], [g17].[NU_TIPO_EVENTO_GUARDA] AS [NU_TIPO_EVENTO_GUARDA1], [g18].[NU_TIPO_EVENTO_GUARDA] AS [NU_TIPO_EVENTO_GUARDA2], [g18].[NO_TIPO_EVENTO_GUARDA] AS [NO_TIPO_EVENTO_GUARDA0]
          FROM [GAQTB013_TIPO_CLSFO_DCMTO] AS [g11]
          INNER JOIN [GAQTB001_CLSFO_DOCUMENTO] AS [g12] ON [g11].[NU_CLASSIFICACAO_DOCUMENTO] = [g12].[NU_CLASSIFICACAO_DOCUMENTO]
          INNER JOIN [GAQTB002_PLANO_CLSFO_DOCUMENTO] AS [g13] ON [g12].[NU_PLANO_CLASSIFICACAO] = [g13].[NU_PLANO_CLASSIFICACAO]
          LEFT JOIN [GAQTB010_TEMPORALIDADE_DCMTO] AS [g14] ON [g12].[NU_TEMPORALIDADE_DOCUMENTO] = [g14].[NU_TEMPORALIDADE_DOCUMENTO]
          LEFT JOIN [GAQTB011_EVENTO_CONTAGEM] AS [g15] ON [g14].[NU_EVENTO_CONTAGEM_INTMA] = [g15].[NU_EVENTO_CONTAGEM]
          LEFT JOIN [GAQTB012_TIPO_EVENTO_GUARDA] AS [g16] ON [g15].[NU_TIPO_EVENTO_GUARDA] = [g16].[NU_TIPO_EVENTO_GUARDA]
          LEFT JOIN [GAQTB011_EVENTO_CONTAGEM] AS [g17] ON [g14].[NU_EVENTO_CONTAGEM_CORRENTE] = [g17].[NU_EVENTO_CONTAGEM]
          LEFT JOIN [GAQTB012_TIPO_EVENTO_GUARDA] AS [g18] ON [g17].[NU_TIPO_EVENTO_GUARDA] = [g18].[NU_TIPO_EVENTO_GUARDA]
      ) AS [t1] ON [t].[NU_TIPO_DOCUMENTO] = [t1].[NU_TIPO_DOCUMENTO]
      LEFT JOIN (
          SELECT [g19].[NU_TIPO_DOCUMENTO], [g19].[NU_TIPO_UNIDADE_PRODUCAO_DCMTO], [g20].[NU_TIPO_UNIDADE_PRODUCAO_DCMTO] AS [NU_TIPO_UNIDADE_PRODUCAO_DCMTO0], [g20].[IC_TIPO_UNDDE_PDCAO_DCMTO_ATVO], [g20].[NO_TIPO_UNIDADE_PRODUCAO_DCMTO]
          FROM [GAQTB051_UNIDADE_TPO_DOCUMENTO] AS [g19]
          INNER JOIN [GAQTB050_TIPO_UNIDADE_PRODUCAO] AS [g20] ON [g19].[NU_TIPO_UNIDADE_PRODUCAO_DCMTO] = [g20].[NU_TIPO_UNIDADE_PRODUCAO_DCMTO]
      ) AS [t2] ON [t].[NU_TIPO_DOCUMENTO] = [t2].[NU_TIPO_DOCUMENTO]
      ORDER BY [t].[TS_ULTIMA_ATUALIZACAO_TIPO], [t].[NU_TIPO_DOCUMENTO], [g0].[NU_SUPORTE_DOCUMENTAL], [g1].[NU_TIPO_REFERENCIA_DOCUMENTO], [g2].[NU_SITUACAO_TIPO_DOCUMENTO], [g3].[NU_FAMILIA_DOCUMENTAL], [g4].[NU_EXTENSAO_FORMATO_DIGITAL], [g5].[NU_AREA_PLANO_CLASSIFICACAO], [g6].[NU_TIPO_DOCUMENTAL], [g7].[NU_ESPECIE_DOCUMENTAL], [g8].[NU_ATIVIDADE_DOCUMENTO], [t0].[NU_CONTEXTO_TIPO_DOCUMENTO], [t0].[NU_CONTEXTO_DOCUMENTO0], [t1].[NU_TIPO_DOCUMENTO], [t1].[NU_CLASSIFICACAO_DOCUMENTO], [t1].[NU_CLASSIFICACAO_DOCUMENTO0], [t1].[NU_PLANO_CLASSIFICACAO0], [t1].[NU_TEMPORALIDADE_DOCUMENTO0], [t1].[NU_EVENTO_CONTAGEM], [t1].[NU_TIPO_EVENTO_GUARDA0], [t1].[NU_EVENTO_CONTAGEM0], [t1].[NU_TIPO_EVENTO_GUARDA2], [t2].[NU_TIPO_DOCUMENTO], [t2].[NU_TIPO_UNIDADE_PRODUCAO_DCMTO]
info: ApiGestaoDocumental.Services.TipologiaService[0]
      Tipologias listadas com sucesso. Total: 0
info: ApiGestaoDocumental.Controllers.TipologiaController[0]
      Finalizando ListarTipologias (controller).


entao ele esta no argocd 



<img width="1893" height="960" alt="image" src="https://github.com/user-attachments/assets/fb5811bb-aa2a-443d-8254-1395d684124f" />


aqui no argo nao conseguimos entra no modo via CLI. pelo menos nuc avi ningue mconseguindo
