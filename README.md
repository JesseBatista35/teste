Favor verificar o Erro no build em DES de caixagithub/sisph-bff-jnd-baixa-garantia_main_39294182741.71 #71 conforme abaixo:
 
 Script executado com sucesso!
  Pod utilizado: sisph-bff-jnd-baixa-garantia-des-56fb5579c8-crtrh
  Falha na sincronização
  Error: Process completed with exit code 1.
No Fusion X, inicialmente visualizei container com erro, depois não consegui visualizar mais visualizar os objetos do Kubernetes: There was a problem retrieving some Kubernetes resources for the entity: sisph-bff-jnd-baixa-garantia. This could mean that the Error Reporting card is not completely accurate


Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
sisph-bff-jnd-baixa-garantia
Repository navigation
Code
Issues
Pull requests
1
 (1)
Actions
Projects
Wiki
Security and quality
3
 (3)
Insights
Settings
CI/CD Workflow
caixagithub/sisph-bff-jnd-baixa-garantia_main_39294181802.38 #38
All jobs
Run details
Annotations
2 warnings and 1 notice
CI_DES / publish-techdocs-site
succeeded yesterday in 1m 43s
Search logs
2s
Current runner version: '2.337.0'
Runner Image Provisioner
Operating System
Runner Image
GITHUB_TOKEN Permissions
Secret source: Actions
Cache mode: write
Prepare workflow directory
Prepare all required actions
Getting action download info
Download action repository 'actions/checkout@v5' (SHA:fbc6f3992d24b796d5a048ff273f7fcc4a7b6c09)
Download action repository 'caixagithub/DevSecOps-Actions@main' (SHA:a79e586c597725d00f0e476029ded8413b6f0151)
Download action repository 'actions/setup-node@v3' (SHA:3235b876344d2a9aa001b8d1453c930bba69e610)
Download action repository 'actions/setup-python@v4' (SHA:7f4fc3e22c37d6ff65e88745f38bd3157c663f7c)
Download action repository 'actions/setup-java@v4' (SHA:cf277c60eb25467037889841efdb72551f06f6c3)
Getting action download info
Download action repository 'actions/checkout@v6' (SHA:d23441a48e516b6c34aea4fa41551a30e30af803)
Getting action download info
Uses: caixagithub/DevSecOps-Solutions/.github/workflows/techdocs-pipelines.yaml@refs/heads/main (8f6d23524581b5f8797e55671769e58da092cd51)
 Inputs
Complete job name: CI_DES / publish-techdocs-site
1s
5s
1s
0s
0s
58s
20s
0s
2s
10s
0s
0s
1s
0s
0s
0s





info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '422', Handled: 'False', Attempt: '0', Execution Time: 344.8358ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 344.9985ms - 422
fail: BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService[0]
      Falha na consulta à origem. Fonte: PRESTACOES - Status: 422 - CorrelationId: 9a94764fa885634fc184ddb7238ab272 - Detalhe: Data de assinatura do contrato é posterior a data de referência.
fail: Microsoft.AspNetCore.Diagnostics.ExceptionHandlerMiddleware[1]
      An unhandled exception has occurred while executing the request.
      BffJndBaixaGarantia.Interfaces.Exceptions.HttpExceptions.ExternalServiceException: Contrato Liquidado
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.TratarErroApim(String content, HttpStatusCode statusCode) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 295
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.TratarStatusNaoSucesso(HttpResponseMessage response, String content, String mensagemNotFound, Boolean falhaDaApim) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 286
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.ExecutarGetAsync[T](String url, String mensagemNotFound, String fonteLogica, Boolean retornarListaVaziaEm204, Boolean falhaDaApim, CancellationToken ct) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 173
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.ObterContratoDetalheAsync(String cpf, String numeroContrato, CancellationToken ct) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 54
         at BffJndBaixaGarantia.Application.Contratos.Services.ContratosService.ObterContratoDetalheInternoAsync(String cpf, String numeroContrato, CancellationToken ct) in /app/BffJndBaixaGarantia.Application/Contratos/Services/ContratosService.cs:line 56
         at BffJndBaixaGarantia.API.Controllers.ContratosController.GetContratoDetalhe(String cpf, String numeroContrato, CancellationToken ct) in /app/BffJndBaixaGarantia.API/Controllers/ContratosController.cs:line 54
         at Microsoft.AspNetCore.Mvc.Infrastructure.ActionMethodExecutor.TaskOfIActionResultExecutor.Execute(ActionContext actionContext, IActionResultTypeMapper mapper, ObjectMethodExecutor executor, Object controller, Object[] arguments)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.<InvokeActionMethodAsync>g__Logged|12_1(ControllerActionInvoker invoker)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.<InvokeNextActionFilterAsync>g__Awaited|10_0(ControllerActionInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.Rethrow(ActionExecutedContextSealed context)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.Next(State& next, Scope& scope, Object& state, Boolean& isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.<InvokeInnerFilterAsync>g__Awaited|13_0(ControllerActionInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeNextExceptionFilterAsync>g__Awaited|26_0(ResourceInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.Rethrow(ExceptionContextSealed context)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.Next(State& next, Scope& scope, Object& state, Boolean& isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeFilterPipelineAsync>g__Awaited|20_0(ResourceInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeAsync>g__Logged|17_1(ResourceInvoker invoker)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeAsync>g__Logged|17_1(ResourceInvoker invoker)
         at Microsoft.AspNetCore.Authorization.AuthorizationMiddleware.Invoke(HttpContext context)
         at Microsoft.AspNetCore.Authentication.AuthenticationMiddleware.Invoke(HttpContext context)
         at Microsoft.AspNetCore.RateLimiting.RateLimitingMiddleware.InvokeInternal(HttpContext context, EnableRateLimitingAttribute enableRateLimitingAttribute)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.AuditAutoPublishMiddleware.InvokeAsync(HttpContext context)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.ResponseCaptureMiddleware.InvokeAsync(HttpContext context)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.ResponseCaptureMiddleware.InvokeAsync(HttpContext context)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.AuditContextMiddleware.InvokeAsync(HttpContext context)
         at Program.<>c.<<<Main>$>b__0_2>d.MoveNext() in /app/BffJndBaixaGarantia.API/Program.cs:line 75
      --- End of stack trace from previous location ---
         at Microsoft.AspNetCore.Diagnostics.ExceptionHandlerMiddlewareImpl.<Invoke>g__Awaited|10_0(ExceptionHandlerMiddlewareImpl middleware, HttpContext context, Task task)
warn: BffJndBaixaGarantia.API.Handlers.HttpExceptionHandler[0]
      Exceção HTTP capturada: ExternalServiceException - Status: 422 - Mensagem: Contrato Liquidado
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Perfis do usuário: offline_access, SPHDF002, SPHDF001, uma_authorization
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Transações carregadas do Config Server: EMITIR_BOL_DISP_DESP_PROC, TERMO_QUITACAO, EMITIR_BOLETO_DISP_A_MONT, EMITIR_BOLETO_DISP_JUROS, EMITIR_BOLETO_DISP_MORA, EMITIR_BOLETO_DISP_MULTA, EMITIR_BOLETO, RESUMO_CONTRATO, PESQUISA_CONTRATO, GESTAO_MENU, GESTAO_MFE, GESTAO_ABAS_INICIO, GESTAO_DOC, GESTAO_MENSAGEM, GESTAO_CAMPO_CONTEXTO, EMITIR_BOLETO_DIF_CREDOR, EMITIR_BOLETO_DIF_DEVEDOR, EMITIR_BOLETO_PARAM_PERM, GESTAO_DOC_GER_CAMPOS
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Verificando transação: TERMO_QUITACAO com ações: C
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Ação C requer perfis: SPHDF001, SPHDF002, SPHDF003. Usuário possui? True
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Todas as verificações passaram. Autorização concedida.
warn: BffJndBaixaGarantia.Infra.Contratos.Mocks.ContratoDetalheMockProvider[0]
      Modo mock ativado para contrato 1710000604205
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Perfis do usuário: offline_access, SPHDF002, SPHDF001, uma_authorization
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Transações carregadas do Config Server: EMITIR_BOL_DISP_DESP_PROC, TERMO_QUITACAO, EMITIR_BOLETO_DISP_A_MONT, EMITIR_BOLETO_DISP_JUROS, EMITIR_BOLETO_DISP_MORA, EMITIR_BOLETO_DISP_MULTA, EMITIR_BOLETO, RESUMO_CONTRATO, PESQUISA_CONTRATO, GESTAO_MENU, GESTAO_MFE, GESTAO_ABAS_INICIO, GESTAO_DOC, GESTAO_MENSAGEM, GESTAO_CAMPO_CONTEXTO, EMITIR_BOLETO_DIF_CREDOR, EMITIR_BOLETO_DIF_DEVEDOR, EMITIR_BOLETO_PARAM_PERM, GESTAO_DOC_GER_CAMPOS
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Verificando transação: TERMO_QUITACAO com ações: C
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Ação C requer perfis: SPHDF001, SPHDF002, SPHDF003. Usuário possui? True
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Todas as verificações passaram. Autorização concedida.
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/prestacoes?*
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/prestacoes?*
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/forma-pagamento
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/forma-pagamento
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Perfis do usuário: offline_access, SPHDF002, SPHDF001, uma_authorization
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Transações carregadas do Config Server: EMITIR_BOL_DISP_DESP_PROC, TERMO_QUITACAO, EMITIR_BOLETO_DISP_A_MONT, EMITIR_BOLETO_DISP_JUROS, EMITIR_BOLETO_DISP_MORA, EMITIR_BOLETO_DISP_MULTA, EMITIR_BOLETO, RESUMO_CONTRATO, PESQUISA_CONTRATO, GESTAO_MENU, GESTAO_MFE, GESTAO_ABAS_INICIO, GESTAO_DOC, GESTAO_MENSAGEM, GESTAO_CAMPO_CONTEXTO, EMITIR_BOLETO_DIF_CREDOR, EMITIR_BOLETO_DIF_DEVEDOR, EMITIR_BOLETO_PARAM_PERM, GESTAO_DOC_GER_CAMPOS
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Verificando transação: TERMO_QUITACAO com ações: C
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Ação C requer perfis: SPHDF001, SPHDF002, SPHDF003. Usuário possui? True
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Todas as verificações passaram. Autorização concedida.
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/elegibilidade-termo-quitacao
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/elegibilidade-termo-quitacao
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 152.0475ms - 200
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '200', Handled: 'False', Attempt: '0', Execution Time: 152.2335ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 152.4181ms - 200
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 152.0734ms - 200
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '200', Handled: 'False', Attempt: '0', Execution Time: 152.1344ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 152.3124ms - 200
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 218.1531ms - 422
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '422', Handled: 'False', Attempt: '0', Execution Time: 218.2219ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 218.4421ms - 422
fail: BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService[0]
      Falha na consulta à origem. Fonte: CONTRATO - Status: 422 - CorrelationId: 81650c9e75603be85c8506741615f7b6 - Detalhe: Contrato Liquidado
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 364.2761ms - 422
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '422', Handled: 'False', Attempt: '0', Execution Time: 364.3645ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 364.5668ms - 422
fail: BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService[0]
      Falha na consulta à origem. Fonte: PRESTACOES - Status: 422 - CorrelationId: 81650c9e75603be85c8506741615f7b6 - Detalhe: Data de assinatura do contrato é posterior a data de referência.
fail: Microsoft.AspNetCore.Diagnostics.ExceptionHandlerMiddleware[1]
      An unhandled exception has occurred while executing the request.
      BffJndBaixaGarantia.Interfaces.Exceptions.HttpExceptions.ExternalServiceException: Contrato Liquidado
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.TratarErroApim(String content, HttpStatusCode statusCode) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 295
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.TratarStatusNaoSucesso(HttpResponseMessage response, String content, String mensagemNotFound, Boolean falhaDaApim) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 286
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.ExecutarGetAsync[T](String url, String mensagemNotFound, String fonteLogica, Boolean retornarListaVaziaEm204, Boolean falhaDaApim, CancellationToken ct) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 173
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.ObterContratoDetalheAsync(String cpf, String numeroContrato, CancellationToken ct) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 54
         at BffJndBaixaGarantia.Application.Contratos.Services.ContratosService.ObterContratoDetalheInternoAsync(String cpf, String numeroContrato, CancellationToken ct) in /app/BffJndBaixaGarantia.Application/Contratos/Services/ContratosService.cs:line 56
         at BffJndBaixaGarantia.API.Controllers.ContratosController.GetContratoDetalhe(String cpf, String numeroContrato, CancellationToken ct) in /app/BffJndBaixaGarantia.API/Controllers/ContratosController.cs:line 54
         at Microsoft.AspNetCore.Mvc.Infrastructure.ActionMethodExecutor.TaskOfIActionResultExecutor.Execute(ActionContext actionContext, IActionResultTypeMapper mapper, ObjectMethodExecutor executor, Object controller, Object[] arguments)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.<InvokeActionMethodAsync>g__Logged|12_1(ControllerActionInvoker invoker)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.<InvokeNextActionFilterAsync>g__Awaited|10_0(ControllerActionInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.Rethrow(ActionExecutedContextSealed context)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.Next(State& next, Scope& scope, Object& state, Boolean& isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.<InvokeInnerFilterAsync>g__Awaited|13_0(ControllerActionInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeNextExceptionFilterAsync>g__Awaited|26_0(ResourceInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.Rethrow(ExceptionContextSealed context)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.Next(State& next, Scope& scope, Object& state, Boolean& isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeFilterPipelineAsync>g__Awaited|20_0(ResourceInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeAsync>g__Logged|17_1(ResourceInvoker invoker)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeAsync>g__Logged|17_1(ResourceInvoker invoker)
         at Microsoft.AspNetCore.Authorization.AuthorizationMiddleware.Invoke(HttpContext context)
         at Microsoft.AspNetCore.Authentication.AuthenticationMiddleware.Invoke(HttpContext context)
         at Microsoft.AspNetCore.RateLimiting.RateLimitingMiddleware.InvokeInternal(HttpContext context, EnableRateLimitingAttribute enableRateLimitingAttribute)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.AuditAutoPublishMiddleware.InvokeAsync(HttpContext context)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.ResponseCaptureMiddleware.InvokeAsync(HttpContext context)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.ResponseCaptureMiddleware.InvokeAsync(HttpContext context)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.AuditContextMiddleware.InvokeAsync(HttpContext context)
         at Program.<>c.<<<Main>$>b__0_2>d.MoveNext() in /app/BffJndBaixaGarantia.API/Program.cs:line 75
      --- End of stack trace from previous location ---
         at Microsoft.AspNetCore.Diagnostics.ExceptionHandlerMiddlewareImpl.<Invoke>g__Awaited|10_0(ExceptionHandlerMiddlewareImpl middleware, HttpContext context, Task task)
warn: BffJndBaixaGarantia.API.Handlers.HttpExceptionHandler[0]
      Exceção HTTP capturada: ExternalServiceException - Status: 422 - Mensagem: Contrato Liquidado
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Perfis do usuário: offline_access, SPHDF002, SPHDF001, uma_authorization
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Transações carregadas do Config Server: EMITIR_BOL_DISP_DESP_PROC, TERMO_QUITACAO, EMITIR_BOLETO_DISP_A_MONT, EMITIR_BOLETO_DISP_JUROS, EMITIR_BOLETO_DISP_MORA, EMITIR_BOLETO_DISP_MULTA, EMITIR_BOLETO, RESUMO_CONTRATO, PESQUISA_CONTRATO, GESTAO_MENU, GESTAO_MFE, GESTAO_ABAS_INICIO, GESTAO_DOC, GESTAO_MENSAGEM, GESTAO_CAMPO_CONTEXTO, EMITIR_BOLETO_DIF_CREDOR, EMITIR_BOLETO_DIF_DEVEDOR, EMITIR_BOLETO_PARAM_PERM, GESTAO_DOC_GER_CAMPOS
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Verificando transação: TERMO_QUITACAO com ações: C
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Ação C requer perfis: SPHDF001, SPHDF002, SPHDF003. Usuário possui? True
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Todas as verificações passaram. Autorização concedida.
warn: BffJndBaixaGarantia.Infra.Contratos.Mocks.ContratoDetalheMockProvider[0]
      Modo mock ativado para contrato 1710000604205
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Perfis do usuário: offline_access, SPHDF002, SPHDF001, uma_authorization
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Transações carregadas do Config Server: EMITIR_BOL_DISP_DESP_PROC, TERMO_QUITACAO, EMITIR_BOLETO_DISP_A_MONT, EMITIR_BOLETO_DISP_JUROS, EMITIR_BOLETO_DISP_MORA, EMITIR_BOLETO_DISP_MULTA, EMITIR_BOLETO, RESUMO_CONTRATO, PESQUISA_CONTRATO, GESTAO_MENU, GESTAO_MFE, GESTAO_ABAS_INICIO, GESTAO_DOC, GESTAO_MENSAGEM, GESTAO_CAMPO_CONTEXTO, EMITIR_BOLETO_DIF_CREDOR, EMITIR_BOLETO_DIF_DEVEDOR, EMITIR_BOLETO_PARAM_PERM, GESTAO_DOC_GER_CAMPOS
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Verificando transação: TERMO_QUITACAO com ações: C
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Ação C requer perfis: SPHDF001, SPHDF002, SPHDF003. Usuário possui? True
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Todas as verificações passaram. Autorização concedida.
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/prestacoes?*
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/prestacoes?*
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/forma-pagamento
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/forma-pagamento
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Perfis do usuário: offline_access, SPHDF002, SPHDF001, uma_authorization
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Transações carregadas do Config Server: EMITIR_BOL_DISP_DESP_PROC, TERMO_QUITACAO, EMITIR_BOLETO_DISP_A_MONT, EMITIR_BOLETO_DISP_JUROS, EMITIR_BOLETO_DISP_MORA, EMITIR_BOLETO_DISP_MULTA, EMITIR_BOLETO, RESUMO_CONTRATO, PESQUISA_CONTRATO, GESTAO_MENU, GESTAO_MFE, GESTAO_ABAS_INICIO, GESTAO_DOC, GESTAO_MENSAGEM, GESTAO_CAMPO_CONTEXTO, EMITIR_BOLETO_DIF_CREDOR, EMITIR_BOLETO_DIF_DEVEDOR, EMITIR_BOLETO_PARAM_PERM, GESTAO_DOC_GER_CAMPOS
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Verificando transação: TERMO_QUITACAO com ações: C
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Ação C requer perfis: SPHDF001, SPHDF002, SPHDF003. Usuário possui? True
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Todas as verificações passaram. Autorização concedida.
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/elegibilidade-termo-quitacao
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/elegibilidade-termo-quitacao
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 162.2035ms - 200
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '200', Handled: 'False', Attempt: '0', Execution Time: 162.2701ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 162.4079ms - 200
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 161.875ms - 200
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '200', Handled: 'False', Attempt: '0', Execution Time: 161.9403ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 162.0748ms - 200
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 213.8272ms - 422
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '422', Handled: 'False', Attempt: '0', Execution Time: 213.8993ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 214.0781ms - 422
fail: BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService[0]
      Falha na consulta à origem. Fonte: CONTRATO - Status: 422 - CorrelationId: 1a98b3ea22975756cbf611ae8771915f - Detalhe: Contrato Liquidado
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 390.1437ms - 422
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '422', Handled: 'False', Attempt: '0', Execution Time: 390.22ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 390.401ms - 422
fail: BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService[0]
      Falha na consulta à origem. Fonte: PRESTACOES - Status: 422 - CorrelationId: 1a98b3ea22975756cbf611ae8771915f - Detalhe: Data de assinatura do contrato é posterior a data de referência.
fail: Microsoft.AspNetCore.Diagnostics.ExceptionHandlerMiddleware[1]
      An unhandled exception has occurred while executing the request.
      BffJndBaixaGarantia.Interfaces.Exceptions.HttpExceptions.ExternalServiceException: Contrato Liquidado
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.TratarErroApim(String content, HttpStatusCode statusCode) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 295
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.TratarStatusNaoSucesso(HttpResponseMessage response, String content, String mensagemNotFound, Boolean falhaDaApim) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 286
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.ExecutarGetAsync[T](String url, String mensagemNotFound, String fonteLogica, Boolean retornarListaVaziaEm204, Boolean falhaDaApim, CancellationToken ct) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 173
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.ObterContratoDetalheAsync(String cpf, String numeroContrato, CancellationToken ct) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 54
         at BffJndBaixaGarantia.Application.Contratos.Services.ContratosService.ObterContratoDetalheInternoAsync(String cpf, String numeroContrato, CancellationToken ct) in /app/BffJndBaixaGarantia.Application/Contratos/Services/ContratosService.cs:line 56
         at BffJndBaixaGarantia.API.Controllers.ContratosController.GetContratoDetalhe(String cpf, String numeroContrato, CancellationToken ct) in /app/BffJndBaixaGarantia.API/Controllers/ContratosController.cs:line 54
         at Microsoft.AspNetCore.Mvc.Infrastructure.ActionMethodExecutor.TaskOfIActionResultExecutor.Execute(ActionContext actionContext, IActionResultTypeMapper mapper, ObjectMethodExecutor executor, Object controller, Object[] arguments)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.<InvokeActionMethodAsync>g__Logged|12_1(ControllerActionInvoker invoker)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.<InvokeNextActionFilterAsync>g__Awaited|10_0(ControllerActionInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.Rethrow(ActionExecutedContextSealed context)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.Next(State& next, Scope& scope, Object& state, Boolean& isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.<InvokeInnerFilterAsync>g__Awaited|13_0(ControllerActionInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeNextExceptionFilterAsync>g__Awaited|26_0(ResourceInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.Rethrow(ExceptionContextSealed context)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.Next(State& next, Scope& scope, Object& state, Boolean& isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeFilterPipelineAsync>g__Awaited|20_0(ResourceInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeAsync>g__Logged|17_1(ResourceInvoker invoker)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeAsync>g__Logged|17_1(ResourceInvoker invoker)
         at Microsoft.AspNetCore.Authorization.AuthorizationMiddleware.Invoke(HttpContext context)
         at Microsoft.AspNetCore.Authentication.AuthenticationMiddleware.Invoke(HttpContext context)
         at Microsoft.AspNetCore.RateLimiting.RateLimitingMiddleware.InvokeInternal(HttpContext context, EnableRateLimitingAttribute enableRateLimitingAttribute)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.AuditAutoPublishMiddleware.InvokeAsync(HttpContext context)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.ResponseCaptureMiddleware.InvokeAsync(HttpContext context)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.ResponseCaptureMiddleware.InvokeAsync(HttpContext context)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.AuditContextMiddleware.InvokeAsync(HttpContext context)
         at Program.<>c.<<<Main>$>b__0_2>d.MoveNext() in /app/BffJndBaixaGarantia.API/Program.cs:line 75
      --- End of stack trace from previous location ---
         at Microsoft.AspNetCore.Diagnostics.ExceptionHandlerMiddlewareImpl.<Invoke>g__Awaited|10_0(ExceptionHandlerMiddlewareImpl middleware, HttpContext context, Task task)
warn: BffJndBaixaGarantia.API.Handlers.HttpExceptionHandler[0]
      Exceção HTTP capturada: ExternalServiceException - Status: 422 - Mensagem: Contrato Liquidado
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Perfis do usuário: offline_access, SPHDF002, SPHDF001, uma_authorization
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Transações carregadas do Config Server: EMITIR_BOL_DISP_DESP_PROC, TERMO_QUITACAO, EMITIR_BOLETO_DISP_A_MONT, EMITIR_BOLETO_DISP_JUROS, EMITIR_BOLETO_DISP_MORA, EMITIR_BOLETO_DISP_MULTA, EMITIR_BOLETO, RESUMO_CONTRATO, PESQUISA_CONTRATO, GESTAO_MENU, GESTAO_MFE, GESTAO_ABAS_INICIO, GESTAO_DOC, GESTAO_MENSAGEM, GESTAO_CAMPO_CONTEXTO, EMITIR_BOLETO_DIF_CREDOR, EMITIR_BOLETO_DIF_DEVEDOR, EMITIR_BOLETO_PARAM_PERM, GESTAO_DOC_GER_CAMPOS
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Verificando transação: TERMO_QUITACAO com ações: C
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Ação C requer perfis: SPHDF001, SPHDF002, SPHDF003. Usuário possui? True
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Todas as verificações passaram. Autorização concedida.
warn: BffJndBaixaGarantia.Infra.Contratos.Mocks.ContratoDetalheMockProvider[0]
      Modo mock ativado para contrato 1710000604205
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Perfis do usuário: offline_access, SPHDF002, SPHDF001, uma_authorization
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Transações carregadas do Config Server: EMITIR_BOL_DISP_DESP_PROC, TERMO_QUITACAO, EMITIR_BOLETO_DISP_A_MONT, EMITIR_BOLETO_DISP_JUROS, EMITIR_BOLETO_DISP_MORA, EMITIR_BOLETO_DISP_MULTA, EMITIR_BOLETO, RESUMO_CONTRATO, PESQUISA_CONTRATO, GESTAO_MENU, GESTAO_MFE, GESTAO_ABAS_INICIO, GESTAO_DOC, GESTAO_MENSAGEM, GESTAO_CAMPO_CONTEXTO, EMITIR_BOLETO_DIF_CREDOR, EMITIR_BOLETO_DIF_DEVEDOR, EMITIR_BOLETO_PARAM_PERM, GESTAO_DOC_GER_CAMPOS
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Verificando transação: TERMO_QUITACAO com ações: C
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Ação C requer perfis: SPHDF001, SPHDF002, SPHDF003. Usuário possui? True
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Todas as verificações passaram. Autorização concedida.
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/12139880471/contratos/8787715899531
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/12139880471/contratos/8787715899531
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/12139880471/contratos/8787715899531/prestacoes?*
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/12139880471/contratos/8787715899531/prestacoes?*
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/12139880471/contratos/8787715899531/forma-pagamento
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/12139880471/contratos/8787715899531/forma-pagamento
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Perfis do usuário: offline_access, SPHDF002, SPHDF001, uma_authorization
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Transações carregadas do Config Server: EMITIR_BOL_DISP_DESP_PROC, TERMO_QUITACAO, EMITIR_BOLETO_DISP_A_MONT, EMITIR_BOLETO_DISP_JUROS, EMITIR_BOLETO_DISP_MORA, EMITIR_BOLETO_DISP_MULTA, EMITIR_BOLETO, RESUMO_CONTRATO, PESQUISA_CONTRATO, GESTAO_MENU, GESTAO_MFE, GESTAO_ABAS_INICIO, GESTAO_DOC, GESTAO_MENSAGEM, GESTAO_CAMPO_CONTEXTO, EMITIR_BOLETO_DIF_CREDOR, EMITIR_BOLETO_DIF_DEVEDOR, EMITIR_BOLETO_PARAM_PERM, GESTAO_DOC_GER_CAMPOS
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Verificando transação: TERMO_QUITACAO com ações: C
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Ação C requer perfis: SPHDF001, SPHDF002, SPHDF003. Usuário possui? True
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Todas as verificações passaram. Autorização concedida.
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/12139880471/contratos/8787715899531/elegibilidade-termo-quitacao
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/12139880471/contratos/8787715899531/elegibilidade-termo-quitacao
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 296.3317ms - 200
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '200', Handled: 'False', Attempt: '0', Execution Time: 296.4151ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 296.5853ms - 200
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 319.8414ms - 200
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '200', Handled: 'False', Attempt: '0', Execution Time: 319.8915ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 320.0145ms - 200
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 381.4394ms - 200
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '200', Handled: 'False', Attempt: '0', Execution Time: 381.5277ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 381.7146ms - 200
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 584.2644ms - 200
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '200', Handled: 'False', Attempt: '0', Execution Time: 584.3573ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 584.5167ms - 200
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Perfis do usuário: offline_access, SPHDF002, SPHDF001, uma_authorization
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Transações carregadas do Config Server: EMITIR_BOL_DISP_DESP_PROC, TERMO_QUITACAO, EMITIR_BOLETO_DISP_A_MONT, EMITIR_BOLETO_DISP_JUROS, EMITIR_BOLETO_DISP_MORA, EMITIR_BOLETO_DISP_MULTA, EMITIR_BOLETO, RESUMO_CONTRATO, PESQUISA_CONTRATO, GESTAO_MENU, GESTAO_MFE, GESTAO_ABAS_INICIO, GESTAO_DOC, GESTAO_MENSAGEM, GESTAO_CAMPO_CONTEXTO, EMITIR_BOLETO_DIF_CREDOR, EMITIR_BOLETO_DIF_DEVEDOR, EMITIR_BOLETO_PARAM_PERM, GESTAO_DOC_GER_CAMPOS
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Verificando transação: TERMO_QUITACAO com ações: C
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Ação C requer perfis: SPHDF001, SPHDF002, SPHDF003. Usuário possui? True
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Todas as verificações passaram. Autorização concedida.
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/12139880471/contratos/8787715899531
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/12139880471/contratos/8787715899531
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/12139880471/contratos/8787715899531/prestacoes?*
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/12139880471/contratos/8787715899531/prestacoes?*
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/12139880471/contratos/8787715899531/forma-pagamento
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/12139880471/contratos/8787715899531/forma-pagamento
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Perfis do usuário: offline_access, SPHDF002, SPHDF001, uma_authorization
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Transações carregadas do Config Server: EMITIR_BOL_DISP_DESP_PROC, TERMO_QUITACAO, EMITIR_BOLETO_DISP_A_MONT, EMITIR_BOLETO_DISP_JUROS, EMITIR_BOLETO_DISP_MORA, EMITIR_BOLETO_DISP_MULTA, EMITIR_BOLETO, RESUMO_CONTRATO, PESQUISA_CONTRATO, GESTAO_MENU, GESTAO_MFE, GESTAO_ABAS_INICIO, GESTAO_DOC, GESTAO_MENSAGEM, GESTAO_CAMPO_CONTEXTO, EMITIR_BOLETO_DIF_CREDOR, EMITIR_BOLETO_DIF_DEVEDOR, EMITIR_BOLETO_PARAM_PERM, GESTAO_DOC_GER_CAMPOS
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Verificando transação: TERMO_QUITACAO com ações: C
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Ação C requer perfis: SPHDF001, SPHDF002, SPHDF003. Usuário possui? True
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Todas as verificações passaram. Autorização concedida.
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/12139880471/contratos/8787715899531/elegibilidade-termo-quitacao
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/12139880471/contratos/8787715899531/elegibilidade-termo-quitacao
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 169.1665ms - 200
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '200', Handled: 'False', Attempt: '0', Execution Time: 169.243ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 169.3931ms - 200
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 246.0036ms - 200
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '200', Handled: 'False', Attempt: '0', Execution Time: 246.0721ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 246.2334ms - 200
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 391.3015ms - 200
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '200', Handled: 'False', Attempt: '0', Execution Time: 391.3935ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 391.6173ms - 200
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 478.5775ms - 200
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '200', Handled: 'False', Attempt: '0', Execution Time: 478.6767ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 478.8602ms - 200
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Perfis do usuário: offline_access, SPHDF003, uma_authorization
info: System.Net.Http.HttpClient.Generic.LogicalHandler[100]
      Start processing HTTP request POST https://login.des.caixa/auth//realms/intranet/protocol/openid-connect/token
info: System.Net.Http.HttpClient.Generic.ClientHandler[100]
      Sending HTTP request POST https://login.des.caixa/auth//realms/intranet/protocol/openid-connect/token
info: System.Net.Http.HttpClient.Generic.ClientHandler[101]
      Received HTTP response headers after 129.3888ms - 200
info: System.Net.Http.HttpClient.Generic.LogicalHandler[101]
      End processing HTTP request after 129.5063ms - 200
info: System.Net.Http.HttpClient.IAuthorizationConfigClient.LogicalHandler[100]
      Start processing HTTP request GET https://sisph-api-core-config.des.caixa/config/authorization
info: System.Net.Http.HttpClient.IAuthorizationConfigClient.ClientHandler[100]
      Sending HTTP request GET https://sisph-api-core-config.des.caixa/config/authorization
info: System.Net.Http.HttpClient.IAuthorizationConfigClient.ClientHandler[101]
      Received HTTP response headers after 21.2763ms - 200
info: System.Net.Http.HttpClient.IAuthorizationConfigClient.LogicalHandler[101]
      End processing HTTP request after 21.3675ms - 200
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Transações carregadas do Config Server: EMITIR_BOL_DISP_DESP_PROC, TERMO_QUITACAO, EMITIR_BOLETO_DISP_A_MONT, EMITIR_BOLETO_DISP_JUROS, EMITIR_BOLETO_DISP_MORA, EMITIR_BOLETO_DISP_MULTA, EMITIR_BOLETO, RESUMO_CONTRATO, PESQUISA_CONTRATO, GESTAO_MENU, GESTAO_MFE, GESTAO_ABAS_INICIO, GESTAO_DOC, GESTAO_MENSAGEM, GESTAO_CAMPO_CONTEXTO, EMITIR_BOLETO_DIF_CREDOR, EMITIR_BOLETO_DIF_DEVEDOR, EMITIR_BOLETO_PARAM_PERM, GESTAO_DOC_GER_CAMPOS
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Verificando transação: TERMO_QUITACAO com ações: I
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Ação I requer perfis: SPHDF001, SPHDF002, SPHDF003. Usuário possui? True
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Todas as verificações passaram. Autorização concedida.
warn: SISPH.CORE.TrilhaAuditoria.Application.Services.AuditService[0]
      Evento 65ca71cc-70e8-4cc5-b229-4f8cf7e6440d inválido. Erros: Matrícula deve ter no máximo 20 caracteres
fail: Microsoft.AspNetCore.Diagnostics.ExceptionHandlerMiddleware[1]
      An unhandled exception has occurred while executing the request.
      BffJndBaixaGarantia.Interfaces.Exceptions.HttpExceptions.EntradaInvalidaException: Requisição inválida.
         at BffJndBaixaGarantia.Application.Contratos.Validators.ContratoInputValidator.ValidarCpf(String cpf) in /app/BffJndBaixaGarantia.Application/Contratos/Validators/ContratoInputValidator.cs:line 20
         at BffJndBaixaGarantia.Application.Contratos.Services.TermoQuitacaoService.ObterStatusAsync(String cpf, String numeroContrato, CancellationToken ct) in /app/BffJndBaixaGarantia.Application/Contratos/Services/TermoQuitacaoService.cs:line 28
         at BffJndBaixaGarantia.API.Controllers.TermoQuitacaoController.GetStatus(String cpf, String numeroContrato, CancellationToken ct) in /app/BffJndBaixaGarantia.API/Controllers/TermoQuitacaoController.cs:line 53
         at BffJndBaixaGarantia.API.Controllers.TermoQuitacaoController.GetStatus(String cpf, String numeroContrato, CancellationToken ct) in /app/BffJndBaixaGarantia.API/Controllers/TermoQuitacaoController.cs:line 67
         at lambda_method32(Closure, Object)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ActionMethodExecutor.AwaitableObjectResultExecutor.Execute(ActionContext actionContext, IActionResultTypeMapper mapper, ObjectMethodExecutor executor, Object controller, Object[] arguments)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.<InvokeActionMethodAsync>g__Logged|12_1(ControllerActionInvoker invoker)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.<InvokeNextActionFilterAsync>g__Awaited|10_0(ControllerActionInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.Rethrow(ActionExecutedContextSealed context)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.Next(State& next, Scope& scope, Object& state, Boolean& isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.InvokeInnerFilterAsync()
      --- End of stack trace from previous location ---
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeNextExceptionFilterAsync>g__Awaited|26_0(ResourceInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.Rethrow(ExceptionContextSealed context)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.Next(State& next, Scope& scope, Object& state, Boolean& isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.InvokeFilterPipelineAsync()
      --- End of stack trace from previous location ---
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeAsync>g__Logged|17_1(ResourceInvoker invoker)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeAsync>g__Logged|17_1(ResourceInvoker invoker)
         at Microsoft.AspNetCore.Authorization.AuthorizationMiddleware.Invoke(HttpContext context)
         at Microsoft.AspNetCore.Authentication.AuthenticationMiddleware.Invoke(HttpContext context)
         at Microsoft.AspNetCore.RateLimiting.RateLimitingMiddleware.InvokeInternal(HttpContext context, EnableRateLimitingAttribute enableRateLimitingAttribute)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.AuditAutoPublishMiddleware.InvokeAsync(HttpContext context)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.ResponseCaptureMiddleware.InvokeAsync(HttpContext context)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.ResponseCaptureMiddleware.InvokeAsync(HttpContext context)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.AuditContextMiddleware.InvokeAsync(HttpContext context)
         at Program.<>c.<<<Main>$>b__0_2>d.MoveNext() in /app/BffJndBaixaGarantia.API/Program.cs:line 75
      --- End of stack trace from previous location ---
         at Microsoft.AspNetCore.Diagnostics.ExceptionHandlerMiddlewareImpl.<Invoke>g__Awaited|10_0(ExceptionHandlerMiddlewareImpl middleware, HttpContext context, Task task)
warn: BffJndBaixaGarantia.API.Handlers.EntradaInvalidaExceptionHandler[0]
      Entrada inválida recusada na borda. Campos: cpf
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Perfis do usuário: offline_access, SPHDF003, uma_authorization
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Transações carregadas do Config Server: EMITIR_BOL_DISP_DESP_PROC, TERMO_QUITACAO, EMITIR_BOLETO_DISP_A_MONT, EMITIR_BOLETO_DISP_JUROS, EMITIR_BOLETO_DISP_MORA, EMITIR_BOLETO_DISP_MULTA, EMITIR_BOLETO, RESUMO_CONTRATO, PESQUISA_CONTRATO, GESTAO_MENU, GESTAO_MFE, GESTAO_ABAS_INICIO, GESTAO_DOC, GESTAO_MENSAGEM, GESTAO_CAMPO_CONTEXTO, EMITIR_BOLETO_DIF_CREDOR, EMITIR_BOLETO_DIF_DEVEDOR, EMITIR_BOLETO_PARAM_PERM, GESTAO_DOC_GER_CAMPOS
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Verificando transação: TERMO_QUITACAO com ações: I
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Ação I requer perfis: SPHDF001, SPHDF002, SPHDF003. Usuário possui? True
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Todas as verificações passaram. Autorização concedida.
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/elegibilidade-termo-quitacao
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/elegibilidade-termo-quitacao
warn: BffJndBaixaGarantia.Infra.Contratos.Mocks.EntregaTermoQuitacaoStoreSimulado[0]
      Store simulado de histórico de entrega utilizado; retornando histórico vazio.
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 271.4901ms - 200
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '200', Handled: 'False', Attempt: '0', Execution Time: 271.5746ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 271.78ms - 200
warn: SISPH.CORE.TrilhaAuditoria.Application.Services.AuditService[0]
      Evento 18b0fffb-73dd-403c-8dae-d6384dd44619 inválido. Erros: Matrícula deve ter no máximo 20 caracteres
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Perfis do usuário: offline_access, SPHDF003, uma_authorization
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Transações carregadas do Config Server: EMITIR_BOL_DISP_DESP_PROC, TERMO_QUITACAO, EMITIR_BOLETO_DISP_A_MONT, EMITIR_BOLETO_DISP_JUROS, EMITIR_BOLETO_DISP_MORA, EMITIR_BOLETO_DISP_MULTA, EMITIR_BOLETO, RESUMO_CONTRATO, PESQUISA_CONTRATO, GESTAO_MENU, GESTAO_MFE, GESTAO_ABAS_INICIO, GESTAO_DOC, GESTAO_MENSAGEM, GESTAO_CAMPO_CONTEXTO, EMITIR_BOLETO_DIF_CREDOR, EMITIR_BOLETO_DIF_DEVEDOR, EMITIR_BOLETO_PARAM_PERM, GESTAO_DOC_GER_CAMPOS
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Verificando transação: TERMO_QUITACAO com ações: C
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Ação C requer perfis: SPHDF001, SPHDF002, SPHDF003. Usuário possui? True
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Todas as verificações passaram. Autorização concedida.
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/prestacoes?*
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/prestacoes?*
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/forma-pagamento
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/forma-pagamento
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 265.4708ms - 200
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '200', Handled: 'False', Attempt: '0', Execution Time: 265.5429ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 265.6532ms - 200
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 277.1641ms - 422
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '422', Handled: 'False', Attempt: '0', Execution Time: 277.2349ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 277.4404ms - 422
fail: BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService[0]
      Falha na consulta à origem. Fonte: CONTRATO - Status: 422 - CorrelationId: 8ad9fe1515e85ae074ab0b7a18cfc618 - Detalhe: Contrato Liquidado
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 478.9968ms - 422
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '422', Handled: 'False', Attempt: '0', Execution Time: 479.0764ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 479.234ms - 422
fail: BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService[0]
      Falha na consulta à origem. Fonte: PRESTACOES - Status: 422 - CorrelationId: 8ad9fe1515e85ae074ab0b7a18cfc618 - Detalhe: Data de assinatura do contrato é posterior a data de referência.
fail: Microsoft.AspNetCore.Diagnostics.ExceptionHandlerMiddleware[1]
      An unhandled exception has occurred while executing the request.
      BffJndBaixaGarantia.Interfaces.Exceptions.HttpExceptions.ExternalServiceException: Contrato Liquidado
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.TratarErroApim(String content, HttpStatusCode statusCode) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 295
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.TratarStatusNaoSucesso(HttpResponseMessage response, String content, String mensagemNotFound, Boolean falhaDaApim) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 286
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.ExecutarGetAsync[T](String url, String mensagemNotFound, String fonteLogica, Boolean retornarListaVaziaEm204, Boolean falhaDaApim, CancellationToken ct) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 173
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.ObterContratoDetalheAsync(String cpf, String numeroContrato, CancellationToken ct) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 54
         at BffJndBaixaGarantia.Application.Contratos.Services.ContratosService.ObterContratoDetalheInternoAsync(String cpf, String numeroContrato, CancellationToken ct) in /app/BffJndBaixaGarantia.Application/Contratos/Services/ContratosService.cs:line 56
         at BffJndBaixaGarantia.API.Controllers.ContratosController.GetContratoDetalhe(String cpf, String numeroContrato, CancellationToken ct) in /app/BffJndBaixaGarantia.API/Controllers/ContratosController.cs:line 54
         at Microsoft.AspNetCore.Mvc.Infrastructure.ActionMethodExecutor.TaskOfIActionResultExecutor.Execute(ActionContext actionContext, IActionResultTypeMapper mapper, ObjectMethodExecutor executor, Object controller, Object[] arguments)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.<InvokeActionMethodAsync>g__Logged|12_1(ControllerActionInvoker invoker)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.<InvokeNextActionFilterAsync>g__Awaited|10_0(ControllerActionInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.Rethrow(ActionExecutedContextSealed context)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.Next(State& next, Scope& scope, Object& state, Boolean& isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.<InvokeInnerFilterAsync>g__Awaited|13_0(ControllerActionInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeNextExceptionFilterAsync>g__Awaited|26_0(ResourceInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.Rethrow(ExceptionContextSealed context)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.Next(State& next, Scope& scope, Object& state, Boolean& isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeFilterPipelineAsync>g__Awaited|20_0(ResourceInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeAsync>g__Logged|17_1(ResourceInvoker invoker)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeAsync>g__Logged|17_1(ResourceInvoker invoker)
         at Microsoft.AspNetCore.Authorization.AuthorizationMiddleware.Invoke(HttpContext context)
         at Microsoft.AspNetCore.Authentication.AuthenticationMiddleware.Invoke(HttpContext context)
         at Microsoft.AspNetCore.RateLimiting.RateLimitingMiddleware.InvokeInternal(HttpContext context, EnableRateLimitingAttribute enableRateLimitingAttribute)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.AuditAutoPublishMiddleware.InvokeAsync(HttpContext context)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.ResponseCaptureMiddleware.InvokeAsync(HttpContext context)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.ResponseCaptureMiddleware.InvokeAsync(HttpContext context)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.AuditContextMiddleware.InvokeAsync(HttpContext context)
         at Program.<>c.<<<Main>$>b__0_2>d.MoveNext() in /app/BffJndBaixaGarantia.API/Program.cs:line 75
      --- End of stack trace from previous location ---
         at Microsoft.AspNetCore.Diagnostics.ExceptionHandlerMiddlewareImpl.<Invoke>g__Awaited|10_0(ExceptionHandlerMiddlewareImpl middleware, HttpContext context, Task task)
warn: BffJndBaixaGarantia.API.Handlers.HttpExceptionHandler[0]
      Exceção HTTP capturada: ExternalServiceException - Status: 422 - Mensagem: Contrato Liquidado
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Perfis do usuário: offline_access, SPHDF003, uma_authorization
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Transações carregadas do Config Server: EMITIR_BOL_DISP_DESP_PROC, TERMO_QUITACAO, EMITIR_BOLETO_DISP_A_MONT, EMITIR_BOLETO_DISP_JUROS, EMITIR_BOLETO_DISP_MORA, EMITIR_BOLETO_DISP_MULTA, EMITIR_BOLETO, RESUMO_CONTRATO, PESQUISA_CONTRATO, GESTAO_MENU, GESTAO_MFE, GESTAO_ABAS_INICIO, GESTAO_DOC, GESTAO_MENSAGEM, GESTAO_CAMPO_CONTEXTO, EMITIR_BOLETO_DIF_CREDOR, EMITIR_BOLETO_DIF_DEVEDOR, EMITIR_BOLETO_PARAM_PERM, GESTAO_DOC_GER_CAMPOS
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Verificando transação: TERMO_QUITACAO com ações: C
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Ação C requer perfis: SPHDF001, SPHDF002, SPHDF003. Usuário possui? True
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Todas as verificações passaram. Autorização concedida.
warn: BffJndBaixaGarantia.Infra.Contratos.Mocks.ContratoDetalheMockProvider[0]
      Modo mock ativado para contrato 1710000604205
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Perfis do usuário: offline_access, SPHDF003, uma_authorization
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Perfis do usuário: offline_access, SPHDF003, uma_authorization
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Transações carregadas do Config Server: EMITIR_BOL_DISP_DESP_PROC, TERMO_QUITACAO, EMITIR_BOLETO_DISP_A_MONT, EMITIR_BOLETO_DISP_JUROS, EMITIR_BOLETO_DISP_MORA, EMITIR_BOLETO_DISP_MULTA, EMITIR_BOLETO, RESUMO_CONTRATO, PESQUISA_CONTRATO, GESTAO_MENU, GESTAO_MFE, GESTAO_ABAS_INICIO, GESTAO_DOC, GESTAO_MENSAGEM, GESTAO_CAMPO_CONTEXTO, EMITIR_BOLETO_DIF_CREDOR, EMITIR_BOLETO_DIF_DEVEDOR, EMITIR_BOLETO_PARAM_PERM, GESTAO_DOC_GER_CAMPOS
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Transações carregadas do Config Server: EMITIR_BOL_DISP_DESP_PROC, TERMO_QUITACAO, EMITIR_BOLETO_DISP_A_MONT, EMITIR_BOLETO_DISP_JUROS, EMITIR_BOLETO_DISP_MORA, EMITIR_BOLETO_DISP_MULTA, EMITIR_BOLETO, RESUMO_CONTRATO, PESQUISA_CONTRATO, GESTAO_MENU, GESTAO_MFE, GESTAO_ABAS_INICIO, GESTAO_DOC, GESTAO_MENSAGEM, GESTAO_CAMPO_CONTEXTO, EMITIR_BOLETO_DIF_CREDOR, EMITIR_BOLETO_DIF_DEVEDOR, EMITIR_BOLETO_PARAM_PERM, GESTAO_DOC_GER_CAMPOS
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Verificando transação: TERMO_QUITACAO com ações: C
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Verificando transação: TERMO_QUITACAO com ações: C
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Ação C requer perfis: SPHDF001, SPHDF002, SPHDF003. Usuário possui? True
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Ação C requer perfis: SPHDF001, SPHDF002, SPHDF003. Usuário possui? True
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Todas as verificações passaram. Autorização concedida.
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Todas as verificações passaram. Autorização concedida.
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/elegibilidade-termo-quitacao
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/prestacoes?*
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/forma-pagamento
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/elegibilidade-termo-quitacao
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/prestacoes?*
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/forma-pagamento
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 275.7238ms - 200
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '200', Handled: 'False', Attempt: '0', Execution Time: 275.8025ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 276.2739ms - 200
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 284.5223ms - 200
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '200', Handled: 'False', Attempt: '0', Execution Time: 284.5908ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 284.8171ms - 200
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 322.5979ms - 422
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '422', Handled: 'False', Attempt: '0', Execution Time: 322.6629ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 322.9088ms - 422
fail: BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService[0]
      Falha na consulta à origem. Fonte: CONTRATO - Status: 422 - CorrelationId: 57474554410034b18dfaed5041266581 - Detalhe: Contrato Liquidado
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 488.8895ms - 422
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '422', Handled: 'False', Attempt: '0', Execution Time: 488.9901ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 489.3885ms - 422
fail: BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService[0]
      Falha na consulta à origem. Fonte: PRESTACOES - Status: 422 - CorrelationId: 57474554410034b18dfaed5041266581 - Detalhe: Data de assinatura do contrato é posterior a data de referência.
fail: Microsoft.AspNetCore.Diagnostics.ExceptionHandlerMiddleware[1]
      An unhandled exception has occurred while executing the request.
      BffJndBaixaGarantia.Interfaces.Exceptions.HttpExceptions.ExternalServiceException: Contrato Liquidado
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.TratarErroApim(String content, HttpStatusCode statusCode) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 295
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.TratarStatusNaoSucesso(HttpResponseMessage response, String content, String mensagemNotFound, Boolean falhaDaApim) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 286
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.ExecutarGetAsync[T](String url, String mensagemNotFound, String fonteLogica, Boolean retornarListaVaziaEm204, Boolean falhaDaApim, CancellationToken ct) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 173
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.ObterContratoDetalheAsync(String cpf, String numeroContrato, CancellationToken ct) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 54
         at BffJndBaixaGarantia.Application.Contratos.Services.ContratosService.ObterContratoDetalheInternoAsync(String cpf, String numeroContrato, CancellationToken ct) in /app/BffJndBaixaGarantia.Application/Contratos/Services/ContratosService.cs:line 56
         at BffJndBaixaGarantia.API.Controllers.ContratosController.GetContratoDetalhe(String cpf, String numeroContrato, CancellationToken ct) in /app/BffJndBaixaGarantia.API/Controllers/ContratosController.cs:line 54
         at Microsoft.AspNetCore.Mvc.Infrastructure.ActionMethodExecutor.TaskOfIActionResultExecutor.Execute(ActionContext actionContext, IActionResultTypeMapper mapper, ObjectMethodExecutor executor, Object controller, Object[] arguments)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.<InvokeActionMethodAsync>g__Logged|12_1(ControllerActionInvoker invoker)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.<InvokeNextActionFilterAsync>g__Awaited|10_0(ControllerActionInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.Rethrow(ActionExecutedContextSealed context)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.Next(State& next, Scope& scope, Object& state, Boolean& isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.<InvokeInnerFilterAsync>g__Awaited|13_0(ControllerActionInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeNextExceptionFilterAsync>g__Awaited|26_0(ResourceInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.Rethrow(ExceptionContextSealed context)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.Next(State& next, Scope& scope, Object& state, Boolean& isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeFilterPipelineAsync>g__Awaited|20_0(ResourceInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeAsync>g__Logged|17_1(ResourceInvoker invoker)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeAsync>g__Logged|17_1(ResourceInvoker invoker)
         at Microsoft.AspNetCore.Authorization.AuthorizationMiddleware.Invoke(HttpContext context)
         at Microsoft.AspNetCore.Authentication.AuthenticationMiddleware.Invoke(HttpContext context)
         at Microsoft.AspNetCore.RateLimiting.RateLimitingMiddleware.InvokeInternal(HttpContext context, EnableRateLimitingAttribute enableRateLimitingAttribute)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.AuditAutoPublishMiddleware.InvokeAsync(HttpContext context)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.ResponseCaptureMiddleware.InvokeAsync(HttpContext context)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.ResponseCaptureMiddleware.InvokeAsync(HttpContext context)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.AuditContextMiddleware.InvokeAsync(HttpContext context)
         at Program.<>c.<<<Main>$>b__0_2>d.MoveNext() in /app/BffJndBaixaGarantia.API/Program.cs:line 75
      --- End of stack trace from previous location ---
         at Microsoft.AspNetCore.Diagnostics.ExceptionHandlerMiddlewareImpl.<Invoke>g__Awaited|10_0(ExceptionHandlerMiddlewareImpl middleware, HttpContext context, Task task)
warn: BffJndBaixaGarantia.API.Handlers.HttpExceptionHandler[0]
      Exceção HTTP capturada: ExternalServiceException - Status: 422 - Mensagem: Contrato Liquidado
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Perfis do usuário: offline_access, SPHDF003, uma_authorization
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Transações carregadas do Config Server: EMITIR_BOL_DISP_DESP_PROC, TERMO_QUITACAO, EMITIR_BOLETO_DISP_A_MONT, EMITIR_BOLETO_DISP_JUROS, EMITIR_BOLETO_DISP_MORA, EMITIR_BOLETO_DISP_MULTA, EMITIR_BOLETO, RESUMO_CONTRATO, PESQUISA_CONTRATO, GESTAO_MENU, GESTAO_MFE, GESTAO_ABAS_INICIO, GESTAO_DOC, GESTAO_MENSAGEM, GESTAO_CAMPO_CONTEXTO, EMITIR_BOLETO_DIF_CREDOR, EMITIR_BOLETO_DIF_DEVEDOR, EMITIR_BOLETO_PARAM_PERM, GESTAO_DOC_GER_CAMPOS
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Verificando transação: TERMO_QUITACAO com ações: C
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Ação C requer perfis: SPHDF001, SPHDF002, SPHDF003. Usuário possui? True
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Todas as verificações passaram. Autorização concedida.
warn: BffJndBaixaGarantia.Infra.Contratos.Mocks.ContratoDetalheMockProvider[0]
      Modo mock ativado para contrato 1710000604205
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Perfis do usuário: offline_access, SPHDF002, SPHDF001, uma_authorization
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Transações carregadas do Config Server: EMITIR_BOL_DISP_DESP_PROC, TERMO_QUITACAO, EMITIR_BOLETO_DISP_A_MONT, EMITIR_BOLETO_DISP_JUROS, EMITIR_BOLETO_DISP_MORA, EMITIR_BOLETO_DISP_MULTA, EMITIR_BOLETO, RESUMO_CONTRATO, PESQUISA_CONTRATO, GESTAO_MENU, GESTAO_MFE, GESTAO_ABAS_INICIO, GESTAO_DOC, GESTAO_MENSAGEM, GESTAO_CAMPO_CONTEXTO, EMITIR_BOLETO_DIF_CREDOR, EMITIR_BOLETO_DIF_DEVEDOR, EMITIR_BOLETO_PARAM_PERM, GESTAO_DOC_GER_CAMPOS
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Verificando transação: TERMO_QUITACAO com ações: C
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Ação C requer perfis: SPHDF001, SPHDF002, SPHDF003. Usuário possui? True
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Todas as verificações passaram. Autorização concedida.
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Perfis do usuário: offline_access, SPHDF002, SPHDF001, uma_authorization
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Transações carregadas do Config Server: EMITIR_BOL_DISP_DESP_PROC, TERMO_QUITACAO, EMITIR_BOLETO_DISP_A_MONT, EMITIR_BOLETO_DISP_JUROS, EMITIR_BOLETO_DISP_MORA, EMITIR_BOLETO_DISP_MULTA, EMITIR_BOLETO, RESUMO_CONTRATO, PESQUISA_CONTRATO, GESTAO_MENU, GESTAO_MFE, GESTAO_ABAS_INICIO, GESTAO_DOC, GESTAO_MENSAGEM, GESTAO_CAMPO_CONTEXTO, EMITIR_BOLETO_DIF_CREDOR, EMITIR_BOLETO_DIF_DEVEDOR, EMITIR_BOLETO_PARAM_PERM, GESTAO_DOC_GER_CAMPOS
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Verificando transação: TERMO_QUITACAO com ações: C
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Ação C requer perfis: SPHDF001, SPHDF002, SPHDF003. Usuário possui? True
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Todas as verificações passaram. Autorização concedida.
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/prestacoes?*
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/elegibilidade-termo-quitacao
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/prestacoes?*
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/elegibilidade-termo-quitacao
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/forma-pagamento
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/forma-pagamento
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 574.6311ms - 200
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '200', Handled: 'False', Attempt: '0', Execution Time: 574.7016ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 574.823ms - 200
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 581.1462ms - 200
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '200', Handled: 'False', Attempt: '0', Execution Time: 581.2792ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 581.4598ms - 200
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 615.2495ms - 422
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '422', Handled: 'False', Attempt: '0', Execution Time: 615.3325ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 615.5423ms - 422
fail: BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService[0]
      Falha na consulta à origem. Fonte: CONTRATO - Status: 422 - CorrelationId: b0f7e7e4b78d91377b4b37d88b988080 - Detalhe: Contrato Liquidado
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 768.2443ms - 422
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '422', Handled: 'False', Attempt: '0', Execution Time: 768.3284ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 768.4795ms - 422
fail: BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService[0]
      Falha na consulta à origem. Fonte: PRESTACOES - Status: 422 - CorrelationId: b0f7e7e4b78d91377b4b37d88b988080 - Detalhe: Data de assinatura do contrato é posterior a data de referência.
fail: Microsoft.AspNetCore.Diagnostics.ExceptionHandlerMiddleware[1]
      An unhandled exception has occurred while executing the request.
      BffJndBaixaGarantia.Interfaces.Exceptions.HttpExceptions.ExternalServiceException: Contrato Liquidado
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.TratarErroApim(String content, HttpStatusCode statusCode) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 295
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.TratarStatusNaoSucesso(HttpResponseMessage response, String content, String mensagemNotFound, Boolean falhaDaApim) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 286
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.ExecutarGetAsync[T](String url, String mensagemNotFound, String fonteLogica, Boolean retornarListaVaziaEm204, Boolean falhaDaApim, CancellationToken ct) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 173
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.ObterContratoDetalheAsync(String cpf, String numeroContrato, CancellationToken ct) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 54
         at BffJndBaixaGarantia.Application.Contratos.Services.ContratosService.ObterContratoDetalheInternoAsync(String cpf, String numeroContrato, CancellationToken ct) in /app/BffJndBaixaGarantia.Application/Contratos/Services/ContratosService.cs:line 56
         at BffJndBaixaGarantia.API.Controllers.ContratosController.GetContratoDetalhe(String cpf, String numeroContrato, CancellationToken ct) in /app/BffJndBaixaGarantia.API/Controllers/ContratosController.cs:line 54
         at Microsoft.AspNetCore.Mvc.Infrastructure.ActionMethodExecutor.TaskOfIActionResultExecutor.Execute(ActionContext actionContext, IActionResultTypeMapper mapper, ObjectMethodExecutor executor, Object controller, Object[] arguments)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.<InvokeActionMethodAsync>g__Logged|12_1(ControllerActionInvoker invoker)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.<InvokeNextActionFilterAsync>g__Awaited|10_0(ControllerActionInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.Rethrow(ActionExecutedContextSealed context)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.Next(State& next, Scope& scope, Object& state, Boolean& isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.<InvokeInnerFilterAsync>g__Awaited|13_0(ControllerActionInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeNextExceptionFilterAsync>g__Awaited|26_0(ResourceInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.Rethrow(ExceptionContextSealed context)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.Next(State& next, Scope& scope, Object& state, Boolean& isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeFilterPipelineAsync>g__Awaited|20_0(ResourceInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeAsync>g__Logged|17_1(ResourceInvoker invoker)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeAsync>g__Logged|17_1(ResourceInvoker invoker)
         at Microsoft.AspNetCore.Authorization.AuthorizationMiddleware.Invoke(HttpContext context)
         at Microsoft.AspNetCore.Authentication.AuthenticationMiddleware.Invoke(HttpContext context)
         at Microsoft.AspNetCore.RateLimiting.RateLimitingMiddleware.InvokeInternal(HttpContext context, EnableRateLimitingAttribute enableRateLimitingAttribute)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.AuditAutoPublishMiddleware.InvokeAsync(HttpContext context)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.ResponseCaptureMiddleware.InvokeAsync(HttpContext context)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.ResponseCaptureMiddleware.InvokeAsync(HttpContext context)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.AuditContextMiddleware.InvokeAsync(HttpContext context)
         at Program.<>c.<<<Main>$>b__0_2>d.MoveNext() in /app/BffJndBaixaGarantia.API/Program.cs:line 75
      --- End of stack trace from previous location ---
         at Microsoft.AspNetCore.Diagnostics.ExceptionHandlerMiddlewareImpl.<Invoke>g__Awaited|10_0(ExceptionHandlerMiddlewareImpl middleware, HttpContext context, Task task)
warn: BffJndBaixaGarantia.API.Handlers.HttpExceptionHandler[0]
      Exceção HTTP capturada: ExternalServiceException - Status: 422 - Mensagem: Contrato Liquidado
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Perfis do usuário: offline_access, SPHDF002, SPHDF001, uma_authorization
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Transações carregadas do Config Server: EMITIR_BOL_DISP_DESP_PROC, TERMO_QUITACAO, EMITIR_BOLETO_DISP_A_MONT, EMITIR_BOLETO_DISP_JUROS, EMITIR_BOLETO_DISP_MORA, EMITIR_BOLETO_DISP_MULTA, EMITIR_BOLETO, RESUMO_CONTRATO, PESQUISA_CONTRATO, GESTAO_MENU, GESTAO_MFE, GESTAO_ABAS_INICIO, GESTAO_DOC, GESTAO_MENSAGEM, GESTAO_CAMPO_CONTEXTO, EMITIR_BOLETO_DIF_CREDOR, EMITIR_BOLETO_DIF_DEVEDOR, EMITIR_BOLETO_PARAM_PERM, GESTAO_DOC_GER_CAMPOS
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Verificando transação: TERMO_QUITACAO com ações: C
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Ação C requer perfis: SPHDF001, SPHDF002, SPHDF003. Usuário possui? True
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Todas as verificações passaram. Autorização concedida.
warn: BffJndBaixaGarantia.Infra.Contratos.Mocks.ContratoDetalheMockProvider[0]
      Modo mock ativado para contrato 1710000604205
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Perfis do usuário: offline_access, SPHDF002, SPHDF001, uma_authorization
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Transações carregadas do Config Server: EMITIR_BOL_DISP_DESP_PROC, TERMO_QUITACAO, EMITIR_BOLETO_DISP_A_MONT, EMITIR_BOLETO_DISP_JUROS, EMITIR_BOLETO_DISP_MORA, EMITIR_BOLETO_DISP_MULTA, EMITIR_BOLETO, RESUMO_CONTRATO, PESQUISA_CONTRATO, GESTAO_MENU, GESTAO_MFE, GESTAO_ABAS_INICIO, GESTAO_DOC, GESTAO_MENSAGEM, GESTAO_CAMPO_CONTEXTO, EMITIR_BOLETO_DIF_CREDOR, EMITIR_BOLETO_DIF_DEVEDOR, EMITIR_BOLETO_PARAM_PERM, GESTAO_DOC_GER_CAMPOS
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Verificando transação: TERMO_QUITACAO com ações: C
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Ação C requer perfis: SPHDF001, SPHDF002, SPHDF003. Usuário possui? True
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Todas as verificações passaram. Autorização concedida.
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Perfis do usuário: offline_access, SPHDF002, SPHDF001, uma_authorization
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/elegibilidade-termo-quitacao
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Transações carregadas do Config Server: EMITIR_BOL_DISP_DESP_PROC, TERMO_QUITACAO, EMITIR_BOLETO_DISP_A_MONT, EMITIR_BOLETO_DISP_JUROS, EMITIR_BOLETO_DISP_MORA, EMITIR_BOLETO_DISP_MULTA, EMITIR_BOLETO, RESUMO_CONTRATO, PESQUISA_CONTRATO, GESTAO_MENU, GESTAO_MFE, GESTAO_ABAS_INICIO, GESTAO_DOC, GESTAO_MENSAGEM, GESTAO_CAMPO_CONTEXTO, EMITIR_BOLETO_DIF_CREDOR, EMITIR_BOLETO_DIF_DEVEDOR, EMITIR_BOLETO_PARAM_PERM, GESTAO_DOC_GER_CAMPOS
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Verificando transação: TERMO_QUITACAO com ações: C
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Ação C requer perfis: SPHDF001, SPHDF002, SPHDF003. Usuário possui? True
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Todas as verificações passaram. Autorização concedida.
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/elegibilidade-termo-quitacao
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/prestacoes?*
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/prestacoes?*
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/forma-pagamento
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/forma-pagamento
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 217.8352ms - 200
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '200', Handled: 'False', Attempt: '0', Execution Time: 217.9009ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 218.0051ms - 200
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 245.9218ms - 200
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '200', Handled: 'False', Attempt: '0', Execution Time: 245.9813ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 246.1816ms - 200
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 316.3387ms - 422
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '422', Handled: 'False', Attempt: '0', Execution Time: 316.4063ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 316.5188ms - 422
fail: BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService[0]
      Falha na consulta à origem. Fonte: CONTRATO - Status: 422 - CorrelationId: 8cfd6b4150030e877ff13c88360b848b - Detalhe: Contrato Liquidado
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 475.8179ms - 422
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '422', Handled: 'False', Attempt: '0', Execution Time: 475.8906ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 476.0178ms - 422
fail: BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService[0]
      Falha na consulta à origem. Fonte: PRESTACOES - Status: 422 - CorrelationId: 8cfd6b4150030e877ff13c88360b848b - Detalhe: Data de assinatura do contrato é posterior a data de referência.
fail: Microsoft.AspNetCore.Diagnostics.ExceptionHandlerMiddleware[1]
      An unhandled exception has occurred while executing the request.
      BffJndBaixaGarantia.Interfaces.Exceptions.HttpExceptions.ExternalServiceException: Contrato Liquidado
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.TratarErroApim(String content, HttpStatusCode statusCode) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 295
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.TratarStatusNaoSucesso(HttpResponseMessage response, String content, String mensagemNotFound, Boolean falhaDaApim) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 286
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.ExecutarGetAsync[T](String url, String mensagemNotFound, String fonteLogica, Boolean retornarListaVaziaEm204, Boolean falhaDaApim, CancellationToken ct) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 173
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.ObterContratoDetalheAsync(String cpf, String numeroContrato, CancellationToken ct) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 54
         at BffJndBaixaGarantia.Application.Contratos.Services.ContratosService.ObterContratoDetalheInternoAsync(String cpf, String numeroContrato, CancellationToken ct) in /app/BffJndBaixaGarantia.Application/Contratos/Services/ContratosService.cs:line 56
         at BffJndBaixaGarantia.API.Controllers.ContratosController.GetContratoDetalhe(String cpf, String numeroContrato, CancellationToken ct) in /app/BffJndBaixaGarantia.API/Controllers/ContratosController.cs:line 54
         at Microsoft.AspNetCore.Mvc.Infrastructure.ActionMethodExecutor.TaskOfIActionResultExecutor.Execute(ActionContext actionContext, IActionResultTypeMapper mapper, ObjectMethodExecutor executor, Object controller, Object[] arguments)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.<InvokeActionMethodAsync>g__Logged|12_1(ControllerActionInvoker invoker)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.<InvokeNextActionFilterAsync>g__Awaited|10_0(ControllerActionInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.Rethrow(ActionExecutedContextSealed context)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.Next(State& next, Scope& scope, Object& state, Boolean& isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.<InvokeInnerFilterAsync>g__Awaited|13_0(ControllerActionInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeNextExceptionFilterAsync>g__Awaited|26_0(ResourceInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.Rethrow(ExceptionContextSealed context)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.Next(State& next, Scope& scope, Object& state, Boolean& isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeFilterPipelineAsync>g__Awaited|20_0(ResourceInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeAsync>g__Logged|17_1(ResourceInvoker invoker)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeAsync>g__Logged|17_1(ResourceInvoker invoker)
         at Microsoft.AspNetCore.Authorization.AuthorizationMiddleware.Invoke(HttpContext context)
         at Microsoft.AspNetCore.Authentication.AuthenticationMiddleware.Invoke(HttpContext context)
         at Microsoft.AspNetCore.RateLimiting.RateLimitingMiddleware.InvokeInternal(HttpContext context, EnableRateLimitingAttribute enableRateLimitingAttribute)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.AuditAutoPublishMiddleware.InvokeAsync(HttpContext context)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.ResponseCaptureMiddleware.InvokeAsync(HttpContext context)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.ResponseCaptureMiddleware.InvokeAsync(HttpContext context)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.AuditContextMiddleware.InvokeAsync(HttpContext context)
         at Program.<>c.<<<Main>$>b__0_2>d.MoveNext() in /app/BffJndBaixaGarantia.API/Program.cs:line 75
      --- End of stack trace from previous location ---
         at Microsoft.AspNetCore.Diagnostics.ExceptionHandlerMiddlewareImpl.<Invoke>g__Awaited|10_0(ExceptionHandlerMiddlewareImpl middleware, HttpContext context, Task task)
warn: BffJndBaixaGarantia.API.Handlers.HttpExceptionHandler[0]
      Exceção HTTP capturada: ExternalServiceException - Status: 422 - Mensagem: Contrato Liquidado
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Perfis do usuário: offline_access, SPHDF002, SPHDF001, uma_authorization
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Transações carregadas do Config Server: EMITIR_BOL_DISP_DESP_PROC, TERMO_QUITACAO, EMITIR_BOLETO_DISP_A_MONT, EMITIR_BOLETO_DISP_JUROS, EMITIR_BOLETO_DISP_MORA, EMITIR_BOLETO_DISP_MULTA, EMITIR_BOLETO, RESUMO_CONTRATO, PESQUISA_CONTRATO, GESTAO_MENU, GESTAO_MFE, GESTAO_ABAS_INICIO, GESTAO_DOC, GESTAO_MENSAGEM, GESTAO_CAMPO_CONTEXTO, EMITIR_BOLETO_DIF_CREDOR, EMITIR_BOLETO_DIF_DEVEDOR, EMITIR_BOLETO_PARAM_PERM, GESTAO_DOC_GER_CAMPOS
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Verificando transação: TERMO_QUITACAO com ações: C
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Ação C requer perfis: SPHDF001, SPHDF002, SPHDF003. Usuário possui? True
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Todas as verificações passaram. Autorização concedida.
warn: BffJndBaixaGarantia.Infra.Contratos.Mocks.ContratoDetalheMockProvider[0]
      Modo mock ativado para contrato 1710000604205
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Perfis do usuário: offline_access, SPHDF002, SPHDF001, uma_authorization
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Transações carregadas do Config Server: EMITIR_BOL_DISP_DESP_PROC, TERMO_QUITACAO, EMITIR_BOLETO_DISP_A_MONT, EMITIR_BOLETO_DISP_JUROS, EMITIR_BOLETO_DISP_MORA, EMITIR_BOLETO_DISP_MULTA, EMITIR_BOLETO, RESUMO_CONTRATO, PESQUISA_CONTRATO, GESTAO_MENU, GESTAO_MFE, GESTAO_ABAS_INICIO, GESTAO_DOC, GESTAO_MENSAGEM, GESTAO_CAMPO_CONTEXTO, EMITIR_BOLETO_DIF_CREDOR, EMITIR_BOLETO_DIF_DEVEDOR, EMITIR_BOLETO_PARAM_PERM, GESTAO_DOC_GER_CAMPOS
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Verificando transação: TERMO_QUITACAO com ações: C
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Ação C requer perfis: SPHDF001, SPHDF002, SPHDF003. Usuário possui? True
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Todas as verificações passaram. Autorização concedida.
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/elegibilidade-termo-quitacao
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/elegibilidade-termo-quitacao
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Perfis do usuário: offline_access, SPHDF002, SPHDF001, uma_authorization
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Transações carregadas do Config Server: EMITIR_BOL_DISP_DESP_PROC, TERMO_QUITACAO, EMITIR_BOLETO_DISP_A_MONT, EMITIR_BOLETO_DISP_JUROS, EMITIR_BOLETO_DISP_MORA, EMITIR_BOLETO_DISP_MULTA, EMITIR_BOLETO, RESUMO_CONTRATO, PESQUISA_CONTRATO, GESTAO_MENU, GESTAO_MFE, GESTAO_ABAS_INICIO, GESTAO_DOC, GESTAO_MENSAGEM, GESTAO_CAMPO_CONTEXTO, EMITIR_BOLETO_DIF_CREDOR, EMITIR_BOLETO_DIF_DEVEDOR, EMITIR_BOLETO_PARAM_PERM, GESTAO_DOC_GER_CAMPOS
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Verificando transação: TERMO_QUITACAO com ações: C
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Ação C requer perfis: SPHDF001, SPHDF002, SPHDF003. Usuário possui? True
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Todas as verificações passaram. Autorização concedida.
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/prestacoes?*
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/prestacoes?*
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[100]
      Start processing HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/forma-pagamento
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[100]
      Sending HTTP request GET https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1/clientes/03057929460/contratos/1710000604205/forma-pagamento
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 520.7582ms - 200
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '200', Handled: 'False', Attempt: '0', Execution Time: 520.8209ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 520.9044ms - 200
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 607.5958ms - 200
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '200', Handled: 'False', Attempt: '0', Execution Time: 607.6792ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 607.8455ms - 200
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 621.8377ms - 422
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '422', Handled: 'False', Attempt: '0', Execution Time: 621.9152ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 622.3485ms - 422
fail: BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService[0]
      Falha na consulta à origem. Fonte: CONTRATO - Status: 422 - CorrelationId: 83943cda5dbf63e83a77c741c5c1abc0 - Detalhe: Contrato Liquidado
info: System.Net.Http.HttpClient.ServiceToken.ClientHandler[101]
      Received HTTP response headers after 740.4465ms - 422
info: Polly[3]
      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '422', Handled: 'False', Attempt: '0', Execution Time: 740.5097ms
info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]
      End processing HTTP request after 740.6053ms - 422
fail: BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService[0]
      Falha na consulta à origem. Fonte: PRESTACOES - Status: 422 - CorrelationId: 83943cda5dbf63e83a77c741c5c1abc0 - Detalhe: Data de assinatura do contrato é posterior a data de referência.
fail: Microsoft.AspNetCore.Diagnostics.ExceptionHandlerMiddleware[1]
      An unhandled exception has occurred while executing the request.
      BffJndBaixaGarantia.Interfaces.Exceptions.HttpExceptions.ExternalServiceException: Contrato Liquidado
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.TratarErroApim(String content, HttpStatusCode statusCode) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 295
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.TratarStatusNaoSucesso(HttpResponseMessage response, String content, String mensagemNotFound, Boolean falhaDaApim) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 286
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.ExecutarGetAsync[T](String url, String mensagemNotFound, String fonteLogica, Boolean retornarListaVaziaEm204, Boolean falhaDaApim, CancellationToken ct) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 173
         at BffJndBaixaGarantia.Infra.Contratos.Http.ContratosApimService.ObterContratoDetalheAsync(String cpf, String numeroContrato, CancellationToken ct) in /app/BffJndBaixaGarantia.Infra/Contratos/Http/ContratosApimService.cs:line 54
         at BffJndBaixaGarantia.Application.Contratos.Services.ContratosService.ObterContratoDetalheInternoAsync(String cpf, String numeroContrato, CancellationToken ct) in /app/BffJndBaixaGarantia.Application/Contratos/Services/ContratosService.cs:line 56
         at BffJndBaixaGarantia.API.Controllers.ContratosController.GetContratoDetalhe(String cpf, String numeroContrato, CancellationToken ct) in /app/BffJndBaixaGarantia.API/Controllers/ContratosController.cs:line 54
         at Microsoft.AspNetCore.Mvc.Infrastructure.ActionMethodExecutor.TaskOfIActionResultExecutor.Execute(ActionContext actionContext, IActionResultTypeMapper mapper, ObjectMethodExecutor executor, Object controller, Object[] arguments)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.<InvokeActionMethodAsync>g__Logged|12_1(ControllerActionInvoker invoker)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.<InvokeNextActionFilterAsync>g__Awaited|10_0(ControllerActionInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.Rethrow(ActionExecutedContextSealed context)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.Next(State& next, Scope& scope, Object& state, Boolean& isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvoker.<InvokeInnerFilterAsync>g__Awaited|13_0(ControllerActionInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeNextExceptionFilterAsync>g__Awaited|26_0(ResourceInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.Rethrow(ExceptionContextSealed context)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.Next(State& next, Scope& scope, Object& state, Boolean& isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeFilterPipelineAsync>g__Awaited|20_0(ResourceInvoker invoker, Task lastTask, State next, Scope scope, Object state, Boolean isCompleted)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeAsync>g__Logged|17_1(ResourceInvoker invoker)
         at Microsoft.AspNetCore.Mvc.Infrastructure.ResourceInvoker.<InvokeAsync>g__Logged|17_1(ResourceInvoker invoker)
         at Microsoft.AspNetCore.Authorization.AuthorizationMiddleware.Invoke(HttpContext context)
         at Microsoft.AspNetCore.Authentication.AuthenticationMiddleware.Invoke(HttpContext context)
         at Microsoft.AspNetCore.RateLimiting.RateLimitingMiddleware.InvokeInternal(HttpContext context, EnableRateLimitingAttribute enableRateLimitingAttribute)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.AuditAutoPublishMiddleware.InvokeAsync(HttpContext context)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.ResponseCaptureMiddleware.InvokeAsync(HttpContext context)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.ResponseCaptureMiddleware.InvokeAsync(HttpContext context)
         at SISPH.CORE.TrilhaAuditoria.Infrastructure.Middleware.AuditContextMiddleware.InvokeAsync(HttpContext context)
         at Program.<>c.<<<Main>$>b__0_2>d.MoveNext() in /app/BffJndBaixaGarantia.API/Program.cs:line 75
      --- End of stack trace from previous location ---
         at Microsoft.AspNetCore.Diagnostics.ExceptionHandlerMiddlewareImpl.<Invoke>g__Awaited|10_0(ExceptionHandlerMiddlewareImpl middleware, HttpContext context, Task task)
warn: BffJndBaixaGarantia.API.Handlers.HttpExceptionHandler[0]
      Exceção HTTP capturada: ExternalServiceException - Status: 422 - Mensagem: Contrato Liquidado
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Perfis do usuário: offline_access, SPHDF002, SPHDF001, uma_authorization
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Transações carregadas do Config Server: EMITIR_BOL_DISP_DESP_PROC, TERMO_QUITACAO, EMITIR_BOLETO_DISP_A_MONT, EMITIR_BOLETO_DISP_JUROS, EMITIR_BOLETO_DISP_MORA, EMITIR_BOLETO_DISP_MULTA, EMITIR_BOLETO, RESUMO_CONTRATO, PESQUISA_CONTRATO, GESTAO_MENU, GESTAO_MFE, GESTAO_ABAS_INICIO, GESTAO_DOC, GESTAO_MENSAGEM, GESTAO_CAMPO_CONTEXTO, EMITIR_BOLETO_DIF_CREDOR, EMITIR_BOLETO_DIF_DEVEDOR, EMITIR_BOLETO_PARAM_PERM, GESTAO_DOC_GER_CAMPOS
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Verificando transação: TERMO_QUITACAO com ações: C
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Ação C requer perfis: SPHDF001, SPHDF002, SPHDF003. Usuário possui? True
info: SISPH.CORE.Autorizacao.Authorization.Transactions.Handlers.TransacaoHandlerAnd[0]
      Todas as verificações passaram. Autorização concedida.
warn: BffJndBaixaGarantia.Infra.Contratos.Mocks.ContratoDetalheMockProvider[0]
      Modo mock ativado para contrato 1710000604205




      <img width="1641" height="910" alt="image" src="https://github.com/user-attachments/assets/44c5ef76-f851-4fb5-88bb-0567ceed5509" />
