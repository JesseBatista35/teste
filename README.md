
[root@sbrdeapllx093 p585600]# curl -k -v -H "Host: sigfi2.desenvolvimento.extracaixa" https://10.116.80.21/ecr-web/
* About to connect() to 10.116.80.21 port 443 (#0)
*   Trying 10.116.80.21... connected
* Connected to 10.116.80.21 (10.116.80.21) port 443 (#0)
* Initializing NSS with certpath: sql:/etc/pki/nssdb
* warning: ignoring value of ssl.verifyhost
* skipping SSL peer certificate verification
* SSL connection using TLS_RSA_WITH_AES_256_CBC_SHA
* Server certificate:
*       subject: CN=sirta.des.caixa,O=Caixa Economica Federal,C=BR
*       start date: Dec 22 16:39:33 2023 GMT
*       expire date: Dec 22 16:49:33 2028 GMT
*       common name: sirta.des.caixa
*       issuer: CN=AC Icptestes Sub,O=Caixa Economica Federal,C=BR
> GET /ecr-web/ HTTP/1.1
> User-Agent: curl/7.19.7 (x86_64-redhat-linux-gnu) libcurl/7.19.7 NSS/3.27.1 zlib/1.2.3 libidn/1.18 libssh2/1.4.2
> Accept: */*
> Host: sigfi2.desenvolvimento.extracaixa
>
< HTTP/1.1 200 OK
< Date: Thu, 17 Sep 2026 17:35:42 GMT
< X-Frame-Options: DENY
< Content-Security-Policy: frame-ancestors 'none';
< Pragma: No-cache
< Cache-Control: no-cache
< Expires: Wed, 31 Dec 1969 21:00:00 BRT
< Accept-Ranges: bytes
< ETag: W/"35115-1789656580000"
< Last-Modified: Thu, 17 Sep 2026 14:49:40 GMT
< Content-Type: text/html
< Content-Length: 35115
<
<!DOCTYPE html>
<html ng-app="App">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <link rel="shortcut icon" type="image/x-icon" href="resources/app-content/img/avatar-caixa.png" />
    <title>SIGFI | Sistema de Interface da Área Financeira</title>

    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">

    <link rel="stylesheet" href="resources/app-content/css/bootstrap.css">
    <link rel="stylesheet" href="resources/app-content/css/font-awesome.css">
    <link rel="stylesheet" href="resources/app-content/css/AdminLTE.min.css">
    <link rel="stylesheet" href="resources/app-content/css/sidebar-desaparecendo.css">
    <link rel="stylesheet" href="resources/app-content/css/angular-growl.min.css">
    <link rel="stylesheet" href="resources/app-content/css/skins/_all-skins.min.css">
    <link rel="stylesheet" href="resources/app-content/libs/iCheck/flat/blue.css">
    <link rel="stylesheet" href="resources/app-content/libs/morris/morris.css">
    <link rel="stylesheet" href="resources/app-content/libs/jvectormap/jquery-jvectormap-1.2.2.css">
    <link rel="stylesheet" href="resources/app-content/libs/datepicker/datepicker3.css">
    <link rel="stylesheet" href="resources/app-content/libs/select2/select2.min.css">
    <link rel="stylesheet" href="resources/app-content/libs/daterangepicker/daterangepicker-bs3.css">
    <link rel="stylesheet" href="resources/app-content/libs/dropzone/dropzone.css">
    <link rel="stylesheet" href="resources/app-content/css/style.css">
    <link rel="stylesheet" href="resources/app-content/css/sigfi.css">
    <link rel="stylesheet" href="resources/app-content/css/ngProgress.css">
    <link rel="stylesheet" href="resources/app-content/css/angular-material.min.css">

    <script src="resources/app-content/libs/pdf/html2canvas.min.js"></script>
    <script src="resources/app-content/libs/pdf/jspdf.umd.min.js"></script>

    <script src="resources/app-content/libs/angular/angular.min.js"></script>
    <script src="resources/app-content/libs/angular/angular-animate.min.js"></script>
    <script src="resources/app-content/libs/angular/angular-aria.min.js"></script>
    <script src="resources/app-content/libs/angular/angular-messages.min.js"></script>
    <script src="resources/app-content/libs/angular/angular-cookies.js"></script>
    <script src="resources/app-content/libs/angular-ui-router/angular-ui-router.js"></script>
    <script src="resources/app-content/libs/angular/i18n/angular-locale_pt-br.js"></script>
    <script src="resources/app-content/libs/jQuery/jquery-2.2.2.min.js"></script>
    <script src="resources/app-content/libs/bootstrap.min.js"></script>
    <script src="resources/app-content/libs/angular-growl.min.js"></script>
    <script src="resources/app-content/libs/chartjs/Chart.min.js"></script>
    <script src="resources/app-content/libs/lodash.js"></script>
    <script src="resources/app-content/libs/ui-bootstrap-tpls-2.1.3.js"></script>
    <script src="resources/app-content/js/app.js"></script>
    <script src="resources/app-content/js/dirPagination.js"></script>
    <script src="resources/app-content/js/demo.js"></script>
    <script src="resources/app-content/libs/datepicker/bootstrap-datepicker.js"></script>
    <script src="resources/app-content/libs/datepicker/locales/bootstrap-datepicker.pt-BR.js"></script>
    <script src="resources/app-content/libs/select2/select2.full.min.js"></script>
    <script src="resources/app-content/libs/ngProgress/ngprogress.js"></script>
    <script src="resources/app-content/libs/angular/angular-material.min.js"></script>
    <script src="resources/app-content/libs/angular/angular-idle.js"></script>
    <script src="resources/app-content/libs/angular/ocLazyLoad.min.js"></script>
    <script src="resources/app-content/libs/file-saver/angular-file-saver.bundle.js"></script>
    <script src="resources/app-content/libs/angular-pretty-xml/angular-pretty-xml.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>

    <!-- Dependências das funcionalidades do sistema -->
    <script src="resources/funcionalidades/_base/modules/AppModule.js"></script>
    <script src="resources/funcionalidades/_base/configs/RotaConfig.js"></script>
    <script src="resources/funcionalidades/_base/controllers/AppController.js"></script>
    <script src="resources/funcionalidades/_base/controllers/HeaderController.js"></script>
    <script src="resources/funcionalidades/_base/controllers/MenuController.js"></script>
    <script src="resources/funcionalidades/_base/services/AppService.js"></script>
    <script src="resources/funcionalidades/_base/values-contants/AppValue.js"></script>
    <script src="resources/funcionalidades/_base/directives/ToggleSigfiDirective.js"></script>
    <script src="resources/funcionalidades/_base/directives/MenuDirective.js"></script>
    <script src="resources/funcionalidades/_base/directives/UploadDirective.js"></script>
    <script src="resources/funcionalidades/_base/directives/TemplateDirective.js"></script>
    <script src="resources/funcionalidades/_base/directives/SomenteNumeroDirective.js"></script>
    <script src="resources/funcionalidades/_base/directives/MascaraAnoDirective.js"></script>
    <script src="resources/funcionalidades/_base/directives/ComparativoCumprimentoAnoDirective.js"></script>
    <script src="resources/funcionalidades/_base/directives/ComparativoCumprimentoMesAnoDirective.js"></script>
    <script src="resources/funcionalidades/_base/directives/MascaraMesAnoDirective.js"></script>
    <script src="resources/funcionalidades/_base/directives/MascaraDataDirective.js"></script>
    <script src="resources/funcionalidades/_base/directives/MascaraItemDirective.js"></script>
    <script src="resources/funcionalidades/_base/directives/TamanhoCampoDirective.js"></script>
    <script src="resources/funcionalidades/_base/factories/UtilFactory.js"></script>
    <script src="resources/funcionalidades/_base/directives/PaginacaoDirective.js"></script>
    <script src="resources/funcionalidades/_base/services/PaginacaoService.js"></script>
    <script src="resources/funcionalidades/_base/services/ComboService.js"></script>
    <script src="resources/funcionalidades/_base/factories/AppFactory.js"></script>
    <script src="resources/funcionalidades/_base/factories/AlertaFactory.js"></script>
    <script src="resources/funcionalidades/_base/runs/AppRun.js"></script>
    <script src="resources/funcionalidades/_base/services/ParamService.js"></script>
    <script src="resources/funcionalidades/_base/services/HeaderService.js"></script>
    <script src="resources/funcionalidades/_base/services/InterceptorService.js"></script>
    <script src="resources/funcionalidades/_base/filters/SituacaoLancamentoFilter.js"></script>
    <script src="resources/funcionalidades/_base/directives/ModalConfirmacaoDirective.js"></script>
    <script src="resources/funcionalidades/_base/directives/ModalConfirmacaoRevogacaoDirective.js"></script>
    <script src="resources/funcionalidades/_base/directives/ModalItensDuplicadosDirective.js"></script>
    <script src="resources/funcionalidades/_base/directives/ModalErrosMensageriaDirective.js"></script>
    <script src="resources/funcionalidades/_base/directives/ModalConfirmacaoInconsistenciaDirective.js"></script>
    <script src="resources/funcionalidades/_base/directives/ModalJustificativaDemonstrativoDirective.js"></script>
    <script src="resources/funcionalidades/_base/directives/ModalFinalizarManualDirective.js"></script>
    <script src="resources/funcionalidades/_base/directives/ModalCaptacaoHistoricoDirective.js"></script>
    <script src="resources/funcionalidades/_base/filters/ToDateObject.js"></script>
    <script src="resources/funcionalidades/_base/directives/FormatoNumeroDirective.js"></script>
    <script src="resources/funcionalidades/_base/directives/MascaraPercentualDirective.js"></script>
    <script src="resources/funcionalidades/_base/directives/MascaraCnpjDirective.js"></script>
    <script src="resources/funcionalidades/_base/directives/InicioSafraDirective.js"></script>
    <script src="resources/funcionalidades/_base/directives/ModalConfirmacaoClonagemPonderadoresDirective.js"></script>
    <script src="resources/funcionalidades/_base/directives/ModalConfirmacaoClonagemSaldoGeradorDirective.js"></script>
    <script src="resources/funcionalidades/_base/filters/PadLeft.js"></script>
    <script src="resources/funcionalidades/_base/filters/NumeroPtBr.js"></script>
    <script src="resources/funcionalidades/_base/directives/ModalNovaTaxaRendimentoDirective.js"></script>

    <!-- Dependências para a funcionalidade Home -->
    <script src="resources/funcionalidades/home/modules/HomeModule.js"></script>
    <script src="resources/funcionalidades/home/configs/HomeConfig.js"></script>
    <script src="resources/funcionalidades/home/controllers/HomeController.js"></script>

    <!-- Dependências para Segmento -->
    <script src="resources/funcionalidades/segmento/modules/SegmentoModule.js"></script>

    <!-- Dependências para a funcionalidade Código Item -->
    <script src="resources/funcionalidades/coditem/modules/CodItemModule.js"></script>
    <script src="resources/funcionalidades/coditem/configs/CodItemConfig.js"></script>
    <script src="resources/funcionalidades/coditem/controllers/CodItemController.js"></script>
    <script src="resources/funcionalidades/coditem/controllers/CodItemAltController.js"></script>
    <script src="resources/funcionalidades/coditem/factories/CodItemFactory.js"></script>
    <script src="resources/funcionalidades/coditem/services/CodItemService.js"></script>

    <!-- Dependências para a funcionalidade Código Item -->
    <script src="resources/funcionalidades/valoresposicao/modules/ValoresPosicaoModule.js"></script>
    <script src="resources/funcionalidades/valoresposicao/configs/ValoresPosicaoConfig.js"></script>
    <script src="resources/funcionalidades/valoresposicao/controllers/ValoresPosicaoAltController.js"></script>
    <script src="resources/funcionalidades/valoresposicao/controllers/ValoresPosicaoController.js"></script>
    <script src="resources/funcionalidades/valoresposicao/controllers/ValoresPosicaoInclController.js"></script>
    <script src="resources/funcionalidades/valoresposicao/controllers/ValoresPosicaoDetalhController.js"></script>
    <script src="resources/funcionalidades/valoresposicao/factories/ValoresPosicaoFactory.js"></script>
    <script src="resources/funcionalidades/valoresposicao/services/ValoresPosicaoService.js"></script>

    <!-- Dependências para a funcionalidade Consultar Arquivo Carregado -->
    <script src="resources/funcionalidades/arquivocarregado/modules/ArquivoCarregadoModule.js"></script>
    <script src="resources/funcionalidades/arquivocarregado/configs/ArquivoCarregadoConfig.js"></script>
    <script src="resources/funcionalidades/arquivocarregado/controllers/ArquivoCarregadoController.js"></script>
    <script src="resources/funcionalidades/arquivocarregado/controllers/ArquivoCarregadoVisualController.js"></script>
    <script src="resources/funcionalidades/arquivocarregado/factories/ArquivoCarregadoFactory.js"></script>
    <script src="resources/funcionalidades/arquivocarregado/services/ArquivoCarregadoService.js"></script>

    <!-- Dependências para a funcionalidade Ratificação de Dados Carregados -->
    <script src="resources/funcionalidades/ratificacaodados/modules/RatificacaoDadosModule.js"></script>
    <script src="resources/funcionalidades/ratificacaodados/configs/RatificacaoDadosConfig.js"></script>
    <script
        src="resources/funcionalidades/ratificacaodados/controllers/RatificacaoDadosRatificarController.js"></script>
    <script src="resources/funcionalidades/ratificacaodados/factories/RatificacaoDadosFactory.js"></script>
    <script src="resources/funcionalidades/ratificacaodados/services/RatificacaoDadosService.js"></script>

    <!-- Dependências para a funcionalidade Valor Sujeito a Recolhimento -->
    <script src="resources/funcionalidades/valorrecolhimento/modules/ValorRecolhimentoModule.js"></script>
    <script src="resources/funcionalidades/valorrecolhimento/configs/ValorRecolhimentoConfig.js"></script>

    <!-- Dependências para a funcionalidade Parametrização de Percentuais -->
    <script src="resources/funcionalidades/parametrizacaotaxas/modules/ParametrizacaoTaxasModule.js"></script>
    <script src="resources/funcionalidades/parametrizacaotaxas/configs/ParametrizacaoTaxasConfig.js"></script>


    <!-- Dependências para a funcionalidade Upload Arquivo -->
    <script src="resources/funcionalidades/uploadarquivo/modules/UploadArquivoModule.js"></script>
    <script src="resources/funcionalidades/uploadarquivo/configs/UploadArquivoConfig.js"></script>
    <script src="resources/funcionalidades/uploadarquivo/controllers/UploadArquivoController.js"></script>
    <script src="resources/funcionalidades/uploadarquivo/controllers/UploadArquivoIncAltController.js"></script>
    <script src="resources/funcionalidades/uploadarquivo/factories/UploadArquivoFactory.js"></script>
    <script src="resources/funcionalidades/uploadarquivo/services/UploadArquivoService.js"></script>

    <!-- Dependências para a funcionalidade Consultar Mensageria Consulta -->
    <script src="resources/funcionalidades/mensageriaconsulta/modules/MensageriaConsultaModule.js"></script>
    <script src="resources/funcionalidades/mensageriaconsulta/configs/MensageriaConsultaConfig.js"></script>
    <script src="resources/funcionalidades/mensageriaconsulta/controllers/MensageriaConsultaController.js"></script>
    <script
        src="resources/funcionalidades/mensageriaconsulta/controllers/MensageriaConsultaVisualController.js"></script>
    <script src="resources/funcionalidades/mensageriaconsulta/factories/MensageriaConsultaFactory.js"></script>
    <script src="resources/funcionalidades/mensageriaconsulta/services/MensageriaConsultaService.js"></script>

    <!-- Dependências para a funcionalidade Consultar Mensageria Operações -->
    <script src="resources/funcionalidades/mensageriaoperacoes/modules/MensageriaOperacoesModule.js"></script>
    <script src="resources/funcionalidades/mensageriaoperacoes/configs/MensageriaOperacoesConfig.js"></script>
    <script src="resources/funcionalidades/mensageriaoperacoes/controllers/MensageriaOperacoesController.js"></script>
    <script
        src="resources/funcionalidades/mensageriaoperacoes/controllers/MensageriaOperacoesVisualController.js"></script>
    <script src="resources/funcionalidades/mensageriaoperacoes/factories/MensageriaOperacoesFactory.js"></script>
    <script src="resources/funcionalidades/mensageriaoperacoes/services/MensageriaOperacoesService.js"></script>

    <!-- Dependências para a funcionalidade Recursos Recolhidos-->
    <script src="resources/funcionalidades/recursorecolhido/modules/RecursoRecolhidoModule.js"></script>
    <script src="resources/funcionalidades/recursorecolhido/configs/RecursoRecolhidoConfig.js"></script>
    <script src="resources/funcionalidades/recursorecolhido/controllers/RecursoRecolhidoController.js"></script>
    <script src="resources/funcionalidades/recursorecolhido/controllers/RecursoRecolhidoAltController.js"></script>
    <script src="resources/funcionalidades/recursorecolhido/controllers/RecursoRecolhidoDiariaController.js"></script>
    <script src="resources/funcionalidades/recursorecolhido/factories/RecursoRecolhidoFactory.js"></script>
    <script src="resources/funcionalidades/recursorecolhido/services/RecursoRecolhidoService.js"></script>

    <!-- Dependências para a funcionalidade Auditoria -->
    <script src="resources/funcionalidades/auditoria/modules/AuditoriaModule.js"></script>
    <script src="resources/funcionalidades/auditoria/configs/AuditoriaConfig.js"></script>
    <script src="resources/funcionalidades/auditoria/controllers/AuditoriaController.js"></script>
    <script src="resources/funcionalidades/auditoria/controllers/AuditoriaVisualController.js"></script>
    <script src="resources/funcionalidades/auditoria/factories/AuditoriaFactory.js"></script>
    <script src="resources/funcionalidades/auditoria/services/AuditoriaService.js"></script>

    <!-- Dependências para Usuário -->
    <script src="resources/funcionalidades/usuario/modules/UsuarioModule.js"></script>
    <script src="resources/funcionalidades/usuario/factories/UsuarioFactory.js"></script>
    <script src="resources/funcionalidades/usuario/services/UsuarioService.js"></script>

    <!-- Dependências para a funcionalidade Tipo Credito -->
    <script src="resources/funcionalidades/tipocredito/modules/TipoCreditoModule.js"></script>
    <script src="resources/funcionalidades/tipocredito/configs/TipoCreditoConfig.js"></script>
    <script src="resources/funcionalidades/tipocredito/controllers/TipoCreditoController.js"></script>
    <script src="resources/funcionalidades/tipocredito/services/TipoCreditoService.js"></script>
    <script src="resources/funcionalidades/tipocredito/factories/TipoCreditoFactory.js"></script>

    <!-- Dependências para a funcionalidade Processamento Arquivos -->
    <script src="resources/funcionalidades/processamentoarquivos/modules/ProcessamentoArquivosModule.js"></script>
    <script src="resources/funcionalidades/processamentoarquivos/configs/ProcessamentoArquivosConfig.js"></script>
    <script
        src="resources/funcionalidades/processamentoarquivos/controllers/ProcessamentoArquivosController.js"></script>
    <script
        src="resources/funcionalidades/processamentoarquivos/controllers/ProcessamentoArquivosIncController.js"></script>
    <script
        src="resources/funcionalidades/processamentoarquivos/controllers/ProcessamentoArquivosDetalharController.js"></script>
    <script
        src="resources/funcionalidades/processamentoarquivos/controllers/ProcessamentoArquivoInconsistenciasController.js"></script>
    <script src="resources/funcionalidades/processamentoarquivos/factories/ProcessamentoArquivosFactory.js"></script>
    <script src="resources/funcionalidades/processamentoarquivos/services/ProcessamentoArquivosService.js"></script>

    <!-- Dependências para a funcionalidade Tipo Demonstrativo -->
    <script src="resources/funcionalidades/tipodemonstrativo/modules/TipoDemonstrativoModule.js"></script>
    <script src="resources/funcionalidades/tipodemonstrativo/configs/TipoDemonstrativoConfig.js"></script>
    <script src="resources/funcionalidades/tipodemonstrativo/controllers/TipoDemonstrativoController.js"></script>
    <script src="resources/funcionalidades/tipodemonstrativo/factories/TipoDemonstrativoFactory.js"></script>
    <script src="resources/funcionalidades/tipodemonstrativo/services/TipoDemonstrativoService.js"></script>

    <!-- Dependências para a funcionalidade Grupo Item -->
    <script src="resources/funcionalidades/grupoitem/modules/GrupoItemModule.js"></script>
    <script src="resources/funcionalidades/grupoitem/configs/GrupoItemConfig.js"></script>
    <script src="resources/funcionalidades/grupoitem/controllers/GrupoItemController.js"></script>
    <script src="resources/funcionalidades/grupoitem/factories/GrupoItemFactory.js"></script>
    <script src="resources/funcionalidades/grupoitem/services/GrupoItemService.js"></script>

    <!-- Dependências para a funcionalidade Grupo Produto -->
    <script src="resources/funcionalidades/grupoproduto/modules/GrupoProdutoModule.js"></script>
    <script src="resources/funcionalidades/grupoproduto/configs/GrupoProdutoConfig.js"></script>
    <script src="resources/funcionalidades/grupoproduto/controllers/GrupoProdutoController.js"></script>
    <script src="resources/funcionalidades/grupoproduto/factories/GrupoProdutoFactory.js"></script>
    <script src="resources/funcionalidades/grupoproduto/services/GrupoProdutoService.js"></script>

    <!-- Dependências para a funcionalidade Produto -->
    <script src="resources/funcionalidades/produto/modules/ProdutoModule.js"></script>
    <script src="resources/funcionalidades/produto/configs/ProdutoConfig.js"></script>
    <script src="resources/funcionalidades/produto/controllers/ProdutoController.js"></script>
    <script src="resources/funcionalidades/produto/factories/ProdutoFactory.js"></script>
    <script src="resources/funcionalidades/produto/services/ProdutoService.js"></script>

    <!-- Dependências para a funcionalidade Variação -->
    <script src="resources/funcionalidades/variacao/modules/VariacaoModule.js"></script>
    <script src="resources/funcionalidades/variacao/configs/VariacaoConfig.js"></script>
    <script src="resources/funcionalidades/variacao/controllers/VariacaoController.js"></script>
    <script src="resources/funcionalidades/variacao/factories/VariacaoFactory.js"></script>
    <script src="resources/funcionalidades/variacao/services/VariacaoService.js"></script>

    <!-- Dependências para a funcionalidade Captação Líquida -->
    <script src="resources/funcionalidades/captacaoliquida/modules/CaptacaoLiquidaModule.js"></script>
    <script src="resources/funcionalidades/captacaoliquida/configs/CaptacaoLiquidaConfig.js"></script>
    <script src="resources/funcionalidades/captacaoliquida/controllers/CaptacaoLiquidaController.js"></script>
    <script src="resources/funcionalidades/captacaoliquida/controllers/CaptacaoLiquidaSalvarController.js"></script>
    <script src="resources/funcionalidades/captacaoliquida/factories/CaptacaoLiquidaFactory.js"></script>
    <script src="resources/funcionalidades/captacaoliquida/services/CaptacaoLiquidaService.js"></script>

    <!-- Dependências para a funcionalidade Comparativo Cumprimento -->
    <script src="resources/funcionalidades/comparativocumprimento/modules/ComparativoCumprimentoModule.js"></script>
    <script src="resources/funcionalidades/comparativocumprimento/configs/ComparativoCumprimentoConfig.js"></script>
    <script src="resources/funcionalidades/comparativocumprimento/controllers/ComparativoCumprimentoController.js"></script>
    <script src="resources/funcionalidades/comparativocumprimento/factories/ComparativoCumprimentoFactory.js"></script>
    <script src="resources/funcionalidades/comparativocumprimento/services/ComparativoCumprimentoService.js"></script>

    <!-- Dependências para a funcionalidade Ponderadores -->
    <script src="resources/funcionalidades/ponderador/modules/PonderadorModule.js"></script>
    <script src="resources/funcionalidades/ponderador/configs/PonderadorConfig.js"></script>
    <script src="resources/funcionalidades/ponderador/controllers/PonderadorListController.js"></script>
    <script src="resources/funcionalidades/ponderador/controllers/PonderadorDetailController.js"></script>
    <script src="resources/funcionalidades/ponderador/factories/PonderadorFactory.js"></script>
    <script src="resources/funcionalidades/ponderador/services/PonderadorService.js"></script>

    <!-- Dependências para a funcionalidade Comparativo de Posição -->
    <script src="resources/funcionalidades/comparativoposicao/modules/ComparativoPosicaoModule.js"></script>
    <script src="resources/funcionalidades/comparativoposicao/configs/ComparativoPosicaoConfig.js"></script>
    <script src="resources/funcionalidades/comparativoposicao/controllers/ComparativoPosicaoController.js"></script>
    <script src="resources/funcionalidades/comparativoposicao/factories/ComparativoPosicaoFactory.js"></script>
    <script src="resources/funcionalidades/comparativoposicao/services/ComparativoPosicaoService.js"></script>

    <!-- Dependências para a funcionalidade Funcionalidade -->
    <script src="resources/funcionalidades/funcionalidade/modules/FuncionalidadeModule.js"></script>
    <script src="resources/funcionalidades/funcionalidade/configs/FuncionalidadeConfig.js"></script>
    <script src="resources/funcionalidades/funcionalidade/controllers/FuncionalidadeAltController.js"></script>
    <script src="resources/funcionalidades/funcionalidade/controllers/FuncionalidadeController.js"></script>
    <script src="resources/funcionalidades/funcionalidade/controllers/FuncionalidadeInclController.js"></script>
    <script src="resources/funcionalidades/funcionalidade/factories/FuncionalidadeFactory.js"></script>
    <script src="resources/funcionalidades/funcionalidade/services/FuncionalidadeService.js"></script>

    <!-- Dependências para a funcionalidade Tipo Inconsistencia -->
    <script src="resources/funcionalidades/tipoinconsistencia/modules/TipoInconsistenciaModule.js"></script>
    <script src="resources/funcionalidades/tipoinconsistencia/configs/TipoInconsistenciaConfig.js"></script>
    <script src="resources/funcionalidades/tipoinconsistencia/controllers/TipoInconsistenciaListController.js"></script>
    <script src="resources/funcionalidades/tipoinconsistencia/controllers/TipoInconsistenciaDetailController.js"></script>
    <script src="resources/funcionalidades/tipoinconsistencia/factories/TipoInconsistenciaFactory.js"></script>
    <script src="resources/funcionalidades/tipoinconsistencia/services/TipoInconsistenciaService.js"></script>

    <!-- Dependências para a funcionalidade Interface Arquivo -->
    <script src="resources/funcionalidades/interfacearquivo/modules/InterfaceArquivoModule.js"></script>
    <script src="resources/funcionalidades/interfacearquivo/configs/InterfaceArquivoConfig.js"></script>
    <script src="resources/funcionalidades/interfacearquivo/controllers/InterfaceArquivoListController.js"></script>
    <script src="resources/funcionalidades/interfacearquivo/controllers/InterfaceArquivoDetailController.js"></script>
    <script src="resources/funcionalidades/interfacearquivo/factories/InterfaceArquivoFactory.js"></script>
    <script src="resources/funcionalidades/interfacearquivo/services/InterfaceArquivoService.js"></script>

    <!-- Dependências para a funcionalidade Ação Auditoria -->
    <script src="resources/funcionalidades/acaoauditoria/modules/AcaoAuditoriaModule.js"></script>
    <script src="resources/funcionalidades/acaoauditoria/configs/AcaoAuditoriaConfig.js"></script>
    <script src="resources/funcionalidades/acaoauditoria/controllers/AcaoAuditoriaListController.js"></script>
    <script src="resources/funcionalidades/acaoauditoria/controllers/AcaoAuditoriaDetailController.js"></script>
    <script src="resources/funcionalidades/acaoauditoria/factories/AcaoAuditoriaFactory.js"></script>
    <script src="resources/funcionalidades/acaoauditoria/services/AcaoAuditoriaService.js"></script>

    <!-- Dependências para a funcionalidade Liberação Projetado -->
    <script src="resources/funcionalidades/liberacaoprojetada/modules/LiberacaoProjetadaModule.js"></script>
    <script src="resources/funcionalidades/liberacaoprojetada/configs/LiberacaoProjetadaConfig.js"></script>
    <script src="resources/funcionalidades/liberacaoprojetada/controllers/LiberacaoProjetadaDetailController.js"></script>
    <script src="resources/funcionalidades/liberacaoprojetada/factories/LiberacaoProjetadaFactory.js"></script>
    <script src="resources/funcionalidades/liberacaoprojetada/services/LiberacaoProjetadaService.js"></script>

    <!-- Dependências para a funcionalidade Relatório Insumos Marcas -->
    <script src="resources/funcionalidades/relatorioinsumosmarcas/modules/RelatorioInsumosMarcasModule.js"></script>
    <script src="resources/funcionalidades/relatorioinsumosmarcas/configs/RelatorioInsumosMarcasConfig.js"></script>
    <script src="resources/funcionalidades/relatorioinsumosmarcas/controllers/RelatorioInsumosMarcasController.js"></script>
    <script src="resources/funcionalidades/relatorioinsumosmarcas/factories/RelatorioInsumosMarcasFactory.js"></script>
    <script src="resources/funcionalidades/relatorioinsumosmarcas/services/RelatorioInsumosMarcasService.js"></script>

    <!-- Dependências para a funcionalidade Saldo Gerador -->
    <script src="resources/funcionalidades/saldogerador/modules/SaldoGeradorModule.js"></script>
    <script src="resources/funcionalidades/saldogerador/configs/SaldoGeradorConfig.js"></script>
    <script src="resources/funcionalidades/saldogerador/controllers/SaldoGeradorListController.js"></script>
    <script src="resources/funcionalidades/saldogerador/controllers/SaldoGeradorDetailController.js"></script>
    <script src="resources/funcionalidades/saldogerador/factories/SaldoGeradorFactory.js"></script>
    <script src="resources/funcionalidades/saldogerador/services/SaldoGeradorService.js"></script>

    <!-- Dependências para a funcionalidade Comparativo de Saldo Gerador -->
    <script src="resources/funcionalidades/comparativosaldogerador/modules/ComparativoSaldoGeradorModule.js"></script>
    <script src="resources/funcionalidades/comparativosaldogerador/configs/ComparativoSaldoGeradorConfig.js"></script>
    <script src="resources/funcionalidades/comparativosaldogerador/controllers/ComparativoSaldoGeradorDetailController.js"></script>
    <script src="resources/funcionalidades/comparativosaldogerador/factories/ComparativoSaldoGeradorFactory.js"></script>
    <script src="resources/funcionalidades/comparativosaldogerador/services/ComparativoSaldoGeradorService.js"></script>

    <!-- Dependências para a funcionalidade Variação de Fluxo de Caixa -->
    <script src="resources/funcionalidades/variacaofluxocaixa/modules/VariacaoFluxoCaixaModule.js"></script>
    <script src="resources/funcionalidades/variacaofluxocaixa/configs/VariacaoFluxoCaixaConfig.js"></script>
    <script src="resources/funcionalidades/variacaofluxocaixa/controllers/VariacaoFluxoCaixaListController.js"></script>
    <script src="resources/funcionalidades/variacaofluxocaixa/controllers/VariacaoFluxoCaixaDetailController.js"></script>
    <script src="resources/funcionalidades/variacaofluxocaixa/factories/VariacaoFluxoCaixaFactory.js"></script>
    <script src="resources/funcionalidades/variacaofluxocaixa/services/VariacaoFluxoCaixaService.js"></script>

    <!-- Dependências para a funcionalidade Taxa Rentabilidade -->
    <script src="resources/funcionalidades/taxarentabilidade/modules/TaxaRentabilidadeModule.js"></script>
    <script src="resources/funcionalidades/taxarentabilidade/configs/TaxaRentabilidadeConfig.js"></script>
    <script src="resources/funcionalidades/taxarentabilidade/controllers/TaxaRentabilidadeDetailController.js"></script>
    <script src="resources/funcionalidades/taxarentabilidade/factories/TaxaRentabilidadeFactory.js"></script>
    <script src="resources/funcionalidades/taxarentabilidade/services/TaxaRentabilidadeService.js"></script>

    <!-- Dependências para a funcionalidade Captação Líquida Sazonalidade -->
    <script src="resources/funcionalidades/captacaoliquidasazonalidade/modules/CaptacaoLiquidaSazonalidadeModule.js"></script>
    <script src="resources/funcionalidades/captacaoliquidasazonalidade/configs/CaptacaoLiquidaSazonalidadeConfig.js"></script>
    <script src="resources/funcionalidades/captacaoliquidasazonalidade/controllers/CaptacaoLiquidaSazonalidadeListController.js"></script>
    <script src="resources/funcionalidades/captacaoliquidasazonalidade/factories/CaptacaoLiquidaSazonalidadeFactory.js"></script>
    <script src="resources/funcionalidades/captacaoliquidasazonalidade/services/CaptacaoLiquidaSazonalidadeService.js"></script>

    <!-- Dependências para a funcionalidade Taxa Juros Câmbio -->
    <script src="resources/funcionalidades/taxajuroscambio/modules/TaxaJurosCambioModule.js"></script>
    <script src="resources/funcionalidades/taxajuroscambio/configs/TaxaJurosCambioConfig.js"></script>
    <script src="resources/funcionalidades/taxajuroscambio/controllers/TaxaJurosCambioListController.js"></script>
    <script src="resources/funcionalidades/taxajuroscambio/factories/TaxaJurosCambioFactory.js"></script>
    <script src="resources/funcionalidades/taxajuroscambio/services/TaxaJurosCambioService.js"></script>

    <!-- Dependências para a funcionalidade Direcionamento -->
    <script src="resources/funcionalidades/direcionamento/modules/DirecionamentoModule.js"></script>
    <script src="resources/funcionalidades/direcionamento/configs/DirecionamentoConfig.js"></script>
    <script src="resources/funcionalidades/direcionamento/controllers/DirecionamentoListController.js"></script>
    <script src="resources/funcionalidades/direcionamento/factories/DirecionamentoFactory.js"></script>
    <script src="resources/funcionalidades/direcionamento/services/DirecionamentoService.js"></script>

    <!-- Dependências para a funcionalidade Dias Úteis Ano Agrícola -->
    <script src="resources/funcionalidades/diautil/modules/DiaUtilModule.js"></script>
    <script src="resources/funcionalidades/diautil/configs/DiaUtilConfig.js"></script>
    <script src="resources/funcionalidades/diautil/configs/DiaUtilTypes.js"></script>
    <script src="resources/funcionalidades/diautil/controllers/DiaUtilListController.js"></script>
    <script src="resources/funcionalidades/diautil/factories/DiaUtilFactory.js"></script>
    <script src="resources/funcionalidades/diautil/services/DiaUtilService.js"></script>

    <!-- Dependências para a funcionalidade Comparativo Cumprimento -->
    <script src="resources/funcionalidades/saldopoupanca/modules/SaldoPoupancaModule.js"></script>
    <script src="resources/funcionalidades/saldopoupanca/configs/SaldoPoupancaConfig.js"></script>
    <script src="resources/funcionalidades/saldopoupanca/controllers/SaldoPoupancaListController.js"></script>
     <script src="resources/funcionalidades/saldopoupanca/controllers/SaldoPoupancaDetailController.js"></script>
    <script src="resources/funcionalidades/saldopoupanca/factories/SaldoPoupancaFactory.js"></script>
    <script src="resources/funcionalidades/saldopoupanca/services/SaldoPoupancaService.js"></script>

    <!-- Dependências para a funcionalidade Parametrização de Exigibilidade do Microcrédito -->
    <script src="resources/funcionalidades/parametrizacaomicrocredito/modules/ParametrizacaoMicrocreditoModule.js"></script>
    <script src="resources/funcionalidades/parametrizacaomicrocredito/configs/ParametrizacaoMicrocreditoConfig.js"></script>
    <script src="resources/funcionalidades/parametrizacaomicrocredito/controllers/ParametrizacaoMicrocreditoListController.js"></script>
    <script src="resources/funcionalidades/parametrizacaomicrocredito/controllers/ParametrizacaoMicrocreditoDetailController.js"></script>
    <script src="resources/funcionalidades/parametrizacaomicrocredito/factories/ParametrizacaoMicrocreditoFactory.js"></script>
    <script src="resources/funcionalidades/parametrizacaomicrocredito/services/ParametrizacaoMicrocreditoService.js"></script>
</head>

<body ng-controller="AppController" class="hold-transition skin-blue sidebar-mini" ng-cloak>
    <template-sigfi>
        <div ui-view="content"></div>
    </template-sigfi>
</body>

* Connection #0 to host 10.116.80.21 left intact
* Closing connection #0
</html>[root@sbrdeapllx093 p585600]# curl -k -v -H "Host: sigfi2.desenvolvimento.extracaixa" https://10.116.80.21/ecr-web
* About to connect() to 10.116.80.21 port 443 (#0)
*   Trying 10.116.80.21... connected
* Connected to 10.116.80.21 (10.116.80.21) port 443 (#0)
* Initializing NSS with certpath: sql:/etc/pki/nssdb
* warning: ignoring value of ssl.verifyhost
* skipping SSL peer certificate verification
* SSL connection using TLS_RSA_WITH_AES_256_CBC_SHA
* Server certificate:
*       subject: CN=sirta.des.caixa,O=Caixa Economica Federal,C=BR
*       start date: Dec 22 16:39:33 2023 GMT
*       expire date: Dec 22 16:49:33 2028 GMT
*       common name: sirta.des.caixa
*       issuer: CN=AC Icptestes Sub,O=Caixa Economica Federal,C=BR
> GET /ecr-web HTTP/1.1
> User-Agent: curl/7.19.7 (x86_64-redhat-linux-gnu) libcurl/7.19.7 NSS/3.27.1 zlib/1.2.3 libidn/1.18 libssh2/1.4.2
> Accept: */*
> Host: sigfi2.desenvolvimento.extracaixa
>
< HTTP/1.1 302 Found
< Date: Thu, 17 Sep 2026 17:35:52 GMT
< Server: Apache
< X-Frame-Options: DENY
< Content-Security-Policy: frame-ancestors 'none';
< Location: http://sigfi2.desenvolvimento.extracaixa/ecr-web/
< Content-Length: 233
< Content-Type: text/html; charset=iso-8859-1
<
<!DOCTYPE HTML PUBLIC "-//IETF//DTD HTML 2.0//EN">
<html><head>
<title>302 Found</title>
</head><body>
<h1>Found</h1>
<p>The document has moved <a href="http://sigfi2.desenvolvimento.extracaixa/ecr-web/">here</a>.</p>
</body></html>
* Connection #0 to host 10.116.80.21 left intact
* Closing connection #0
[root@sbrdeapllx093 p585600]#
