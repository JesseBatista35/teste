



2026-07-27 14:28:18,691 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-17) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:18,693 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-17) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:18,693 DEBUG [br.gov.caixa.sisgr.acessoseguro.model.oauth.bean.SisgrAutenticacaoModel] (default task-17) Tipo de Credencial Recebida da SP: 98
2026-07-27 14:28:18,693 DEBUG [br.gov.caixa.sisgr.acessoseguro.model.oauth.bean.SisgrAutenticacaoModel] (default task-17) Codigo de Credencial Recebida da SP: f929540
2026-07-27 14:28:18,693 DEBUG [br.gov.caixa.sisgr.acessoseguro.model.oauth.bean.SisgrAutenticacaoModel] (default task-17)
------------------------------------------------------------------------------------------

2026-07-27 14:28:18,693 DEBUG [br.gov.caixa.sisgr.acessoseguro.model.oauth.bean.SisgrAutenticacaoModel] (default task-17) Credencial  Enviada[9998|f929540] igual a Credencial Recebido da SP[MATRICULA|f929540] : true
2026-07-27 14:28:18,693 DEBUG [br.gov.caixa.sisgr.acessoseguro.model.oauth.bean.SisgrAutenticacaoModel] (default task-17)
------------------------------------------------------------------------------------------

2026-07-27 14:28:18,693 DEBUG [br.gov.caixa.sisgr.acessoseguro.model.oauth.bean.SisgrAutenticacaoAppModel] (default task-17) Buscando a APP: [sicrb-intra]
2026-07-27 14:28:18,693 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-17) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:18,697 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-17) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:18,698 DEBUG [br.gov.caixa.sisgr.acessoseguro.model.oauth.bean.SisgrAutenticacaoAppModel] (default task-17) Buscando a APP: [sicrb-intra] - Encontrado!
2026-07-27 14:28:18,698 DEBUG [br.gov.caixa.sisgr.acessoseguro.model.oauth.bean.SisgrDominioModel] (default task-17) Buscando o domínio para aplicação: [sicrb-intra]
2026-07-27 14:28:18,698 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-17) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:18,701 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-17) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:18,701 DEBUG [br.gov.caixa.sisgr.acessoseguro.model.oauth.bean.SisgrDominioModel] (default task-17) Buscando o domínio para aplicação:  [sicrb-intra] - Domínio: [intranet]
2026-07-27 14:28:18,701 DEBUG [br.gov.caixa.sisgr.acessoseguro.model.oauth.bean.SisgrCodeSessionModel] (default task-17) Salvando o código de Autorização gerado: [4dec737d-515b-4b78-ab49-9c48d39b0ca4] para o usuário: [W|W0000001|9998|F929540] e IP: [10.111.18.1]
2026-07-27 14:28:18,701 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) INICIO METODO :: ACSSGR  salvarCodigoAutorizacao(....
2026-07-27 14:28:18,701 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) P_NO_CHAMADOR :: ACSSGR
2026-07-27 14:28:18,701 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) P_NO_DOMINIO :: intranet
2026-07-27 14:28:18,701 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) P_NO_USUARIO :: W|W0000001|9998|F929540
2026-07-27 14:28:18,701 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) P_DE_URL_ORIGEM :: http://srjdeapllx130:8080/intranet/auth/login
2026-07-27 14:28:18,701 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) P_DE_USUARIO :: {"tipoCredencial":"9998","codigoCredencial":"f929540","tipoAmbiente":"W","siglaAmbiente":"W0000001","nivelAutenticacao":"99","nomeUsuario":"MARINALDO OLIVEIRA SANTOS JUNIOR","numeroNatural":"0000000000000","certificacao":"070530001429","estagioAmbiente":"DESENVOLVIMENTO","data":""}
2026-07-27 14:28:18,701 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) P_DE_ESTADO_SESSAO :: 0
2026-07-27 14:28:18,701 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) P_NO_DISPOSITIVO :: Google Chrome|PC|WIN32
2026-07-27 14:28:18,701 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) P_CO_IP_USUARIO :: 10.111.18.1
2026-07-27 14:28:18,701 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17)  REFAZENDO O IP
2026-07-27 14:28:18,701 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) MANTEVE O IP 11
2026-07-27 14:28:18,701 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) P_NO_APLICACAO :: sicrb-intra
2026-07-27 14:28:18,701 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) P_CO_AUTORIZACAO :: 4dec737d-515b-4b78-ab49-9c48d39b0ca4
2026-07-27 14:28:18,701 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) P_SG_SISTEMA :: SGR
2026-07-27 14:28:18,701 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) P_IC_AMBIENTE_EXEC :: W
2026-07-27 14:28:18,701 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) P_SG_AMBIENTE_EXEC :: W0000001
2026-07-27 14:28:18,701 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) P_CO_TPUSUARIO_EXEC :: 9998
2026-07-27 14:28:18,701 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) P_CO_USUARIO_EXEC :: F929540
2026-07-27 14:28:18,701 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) P_CO_TOKEN_EXEC :: 10.111.18.1
2026-07-27 14:28:18,701 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) INFORMACOES DO NOVO P_CO_TOKEN_EXEC AJUSTADO :: 10.111.18.1
2026-07-27 14:28:18,701 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) P_CO_DISPOSITIVO_CANAL :: 1
2026-07-27 14:28:18,701 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) P_DE_URL :: http://srjdeapllx130:8080/intranet/auth/login
2026-07-27 14:28:18,701 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) P_CO_IP :: 10.116.85.230
2026-07-27 14:28:18,701 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) P_DE_SERVICO :: ACSREST
2026-07-27 14:28:18,701 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) P_NO_SERVIDOR_TRANSACAO :: 10.116.94.88
2026-07-27 14:28:18,702 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) P_NO_INSTANCIA_SERVIDOR :: 10.116.85.230
2026-07-27 14:28:18,702 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) :::::::::::::::: OS PARAMETROS ABAIXO NAO SAO INFORMADOS :::::::::::::::::::::::
2026-07-27 14:28:18,702 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) P_CO_TPEMPRESA ::
2026-07-27 14:28:18,702 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) P_CO_ESTABELECIMENTO ::
2026-07-27 14:28:18,702 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) P_CO_PROCESSO_SGR ::
2026-07-27 14:28:18,702 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) P_DE_TIPO_RECURSO ::
2026-07-27 14:28:18,702 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) P_DE_RECURSO ::
2026-07-27 14:28:18,702 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-17) P_CO_NIVEL_AUTENTICACAO ::
2026-07-27 14:28:18,702 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-17) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:18,712 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-17) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:18,712 DEBUG [br.gov.caixa.sisgr.acessoseguro.login.controller.LoginController] (default task-17) :: REDIRECIONANDO PARA O SISTEMA ::
2026-07-27 14:28:18,712 DEBUG [br.gov.caixa.sisgr.acessoseguro.login.controller.LoginController] (default task-17) :: FIM AUENTICACAO SISGR ::: protected void doPost(
2026-07-27 14:28:22,839 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-21) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:22,844 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-21) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:22,846 DEBUG [br.gov.caixa.sisgr.acessoseguro.model.oauth.bean.SisgrTokenSessionModel] (default task-21) Buscando o usuário pelo cookie: [W|W0000001|9998|F929540]:
2026-07-27 14:28:22,846 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2UsuarioTokenDAO] (default task-21)  INICIO ::: public Retorno<TokenUsuario> existeUsuarioDispositivo
2026-07-27 14:28:22,846 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2UsuarioTokenDAO] (default task-21)  ::::::::::: dispositivo ::::::::::::::::::::: Google Chrome|PC|WIN32
2026-07-27 14:28:22,846 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2UsuarioTokenDAO] (default task-21)  ::::::::::: nomeUsuario ::::::::::::::::::::: W|W0000001|9998|F929540
2026-07-27 14:28:22,846 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-21) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:22,849 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-21) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:22,849 DEBUG [br.gov.caixa.sisgr.acessoseguro.model.oauth.bean.SisgrTokenSessionModel] (default task-21) Buscando o usuário pelo cookie: [W|W0000001|9998|F929540]: CODIGO DE RETORNO: 0 - MENSAGEM: BUSCA REALIZADA COM SUCESSO
2026-07-27 14:28:22,849 DEBUG [br.gov.caixa.sisgr.acessoseguro.model.dao.DB2AutenticacaoDAO] (default task-21) CALL SGR.SGRSP081_BUSCAR_AUTENTICACAO
2026-07-27 14:28:22,849 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-21) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:22,855 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-21) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:22,855 DEBUG [br.gov.caixa.sisgr.acessoseguro.model.oauth.bean.SisgrAutenticacaoAppModel] (default task-21) Buscando a APP: [sicrb-intra]
2026-07-27 14:28:22,855 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-21) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:22,858 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-21) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:22,858 DEBUG [br.gov.caixa.sisgr.acessoseguro.model.oauth.bean.SisgrAutenticacaoAppModel] (default task-21) Buscando a APP: [sicrb-intra] - Encontrado!
2026-07-27 14:28:22,858 DEBUG [br.gov.caixa.sisgr.acessoseguro.model.oauth.bean.SisgrDominioModel] (default task-21) Buscando o domínio para aplicação: [sicrb-intra]
2026-07-27 14:28:22,858 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-21) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:22,862 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-21) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:22,862 DEBUG [br.gov.caixa.sisgr.acessoseguro.model.oauth.bean.SisgrDominioModel] (default task-21) Buscando o domínio para aplicação:  [sicrb-intra] - Domínio: [intranet]
2026-07-27 14:28:22,862 DEBUG [br.gov.caixa.sisgr.acessoseguro.model.oauth.bean.SisgrCodeSessionModel] (default task-21) Salvando o código de Autorização gerado: [318527b8-8eac-4570-9765-a91ea4b8c609] para o usuário: [W|W0000001|9998|F929540] e IP: [10.111.18.1]
2026-07-27 14:28:22,862 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) INICIO METODO :: ACSSGR  salvarCodigoAutorizacao(....
2026-07-27 14:28:22,862 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) P_NO_CHAMADOR :: ACSSGR
2026-07-27 14:28:22,862 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) P_NO_DOMINIO :: intranet
2026-07-27 14:28:22,862 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) P_NO_USUARIO :: W|W0000001|9998|F929540
2026-07-27 14:28:22,862 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) P_DE_URL_ORIGEM :: http://srjdeapllx130:8080/intranet/auth
2026-07-27 14:28:22,862 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) P_DE_USUARIO :: {"tipoCredencial":"9998","codigoCredencial":"F929540","tipoAmbiente":"W","siglaAmbiente":"W0000001","nivelAutenticacao":"99","nomeUsuario":"MARINALDO SANTOS","unidade":"5088","certificacao":"070530001429","estagioAmbiente":"DESENVOLVIMENTO","ultimo":1785173298685}
2026-07-27 14:28:22,862 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) P_DE_ESTADO_SESSAO :: 0
2026-07-27 14:28:22,862 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) P_NO_DISPOSITIVO :: Google Chrome|PC|WIN32
2026-07-27 14:28:22,862 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) P_CO_IP_USUARIO :: 10.111.18.1
2026-07-27 14:28:22,862 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21)  REFAZENDO O IP
2026-07-27 14:28:22,862 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) MANTEVE O IP 11
2026-07-27 14:28:22,862 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) P_NO_APLICACAO :: sicrb-intra
2026-07-27 14:28:22,862 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) P_CO_AUTORIZACAO :: 318527b8-8eac-4570-9765-a91ea4b8c609
2026-07-27 14:28:22,862 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) P_SG_SISTEMA :: SGR
2026-07-27 14:28:22,862 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) P_IC_AMBIENTE_EXEC :: W
2026-07-27 14:28:22,862 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) P_SG_AMBIENTE_EXEC :: W0000001
2026-07-27 14:28:22,862 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) P_CO_TPUSUARIO_EXEC :: 9998
2026-07-27 14:28:22,862 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) P_CO_USUARIO_EXEC :: F929540
2026-07-27 14:28:22,862 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) P_CO_TOKEN_EXEC :: 10.111.18.1
2026-07-27 14:28:22,862 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) INFORMACOES DO NOVO P_CO_TOKEN_EXEC AJUSTADO :: 10.111.18.1
2026-07-27 14:28:22,862 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) P_CO_DISPOSITIVO_CANAL :: 1
2026-07-27 14:28:22,863 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) P_DE_URL :: http://srjdeapllx130:8080/intranet/auth
2026-07-27 14:28:22,863 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) P_CO_IP :: 10.116.85.230
2026-07-27 14:28:22,863 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) P_DE_SERVICO :: ACSREST
2026-07-27 14:28:22,863 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) P_NO_SERVIDOR_TRANSACAO :: 10.116.94.88
2026-07-27 14:28:22,863 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) P_NO_INSTANCIA_SERVIDOR :: 10.116.85.230
2026-07-27 14:28:22,863 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) :::::::::::::::: OS PARAMETROS ABAIXO NAO SAO INFORMADOS :::::::::::::::::::::::
2026-07-27 14:28:22,863 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) P_CO_TPEMPRESA ::
2026-07-27 14:28:22,863 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) P_CO_ESTABELECIMENTO ::
2026-07-27 14:28:22,863 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) P_CO_PROCESSO_SGR ::
2026-07-27 14:28:22,863 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) P_DE_TIPO_RECURSO ::
2026-07-27 14:28:22,863 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) P_DE_RECURSO ::
2026-07-27 14:28:22,863 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-21) P_CO_NIVEL_AUTENTICACAO ::
2026-07-27 14:28:22,863 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-21) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:22,867 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-21) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:23,304 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-18) RESTEASY002315: PathInfo: /auth/token
2026-07-27 14:28:23,305 DEBUG [org.jboss.resteasy.cdi.i18n] (default task-18) RESTEASY010520: Beans found for class br.gov.caixa.sisgr.acessoseguro.auth.rest.resource.TokenResource : [Managed Bean [class br.gov.caixa.sisgr.acessoseguro.auth.rest.resource.TokenResource] with qualifiers [@Any @Default]]
2026-07-27 14:28:23,305 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-18) Interceptor Context: org.jboss.resteasy.core.interception.ServerReaderInterceptorContext,  Method : proceed
2026-07-27 14:28:23,305 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-18) ReaderInterceptor: org.jboss.resteasy.security.doseta.DigitalVerificationInterceptor
2026-07-27 14:28:23,305 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-18) Interceptor Context: org.jboss.resteasy.core.interception.ServerReaderInterceptorContext,  Method : proceed
2026-07-27 14:28:23,305 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-18) MessageBodyReader: org.jboss.resteasy.spi.ResteasyProviderFactory$SortedKey
2026-07-27 14:28:23,305 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-18) MessageBodyReader: org.jboss.resteasy.plugins.providers.ServerFormUrlEncodedProvider
2026-07-27 14:28:23,305 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-18) Provider : org.jboss.resteasy.plugins.providers.ServerFormUrlEncodedProvider,  Method : readFrom
2026-07-27 14:28:23,305 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-18) Provider : org.jboss.resteasy.plugins.providers.ServerFormUrlEncodedProvider,  Method : readFrom
2026-07-27 14:28:23,305 DEBUG [org.jboss.resteasy.plugins.validation.i18n] (default task-18) RESTEASY008510: ResteasyCdiExtension is on the classpath.
2026-07-27 14:28:23,305 INFO  [br.gov.caixa.sisgr.acessoseguro.auth.rest.resource.TokenResource] (default task-18)  ============================ INICIO METODO /aut/token ==========================================
2026-07-27 14:28:23,306 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-18) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:23,309 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-18) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:23,309 DEBUG [br.gov.caixa.sisgr.acessoseguro.model.oauth.bean.SisgrCodeSessionModel] (default task-18) Buscando as informações por Código de Autorização: [318527b8-8eac-4570-9765-a91ea4b8c609]
2026-07-27 14:28:23,309 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2UsuarioTokenDAO] (default task-18)  INICIO ::: public Retorno<TokenUsuario> buscarUsuarioCodAutorizacao
2026-07-27 14:28:23,309 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2UsuarioTokenDAO] (default task-18)  ::::::::::: codigoAutorizacao ::::::::::::::::::::: 318527b8-8eac-4570-9765-a91ea4b8c609
2026-07-27 14:28:23,309 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2UsuarioTokenDAO] (default task-18)  ::::::::::: nomeAplicacao ::::::::::::::::::::: sicrb-intra
2026-07-27 14:28:23,309 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-18) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:23,313 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-18) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:23,313 DEBUG [br.gov.caixa.sisgr.acessoseguro.model.oauth.bean.SisgrCodeSessionModel] (default task-18) Codigo de Autorização: [318527b8-8eac-4570-9765-a91ea4b8c609], Usuario: [W|W0000001|9998|F929540], IP Recebido do BD: [10.111.24.203], IP da Requisição: [10.116.85.230]
2026-07-27 14:28:23,313 DEBUG [br.gov.caixa.sisgr.acessoseguro.model.oauth.bean.SisgrAutenticacaoAppModel] (default task-18) Autenticando a APP: [sicrb-intra]
2026-07-27 14:28:23,313 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-18) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:23,316 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-18) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:23,316 DEBUG [br.gov.caixa.sisgr.acessoseguro.model.oauth.bean.SisgrAutenticacaoAppModel] (default task-18) Autenticando a APP: [sicrb-intra] - Autenticado!
2026-07-27 14:28:23,316 DEBUG [br.gov.caixa.sisgr.acessoseguro.model.oauth.bean.SisgrDominioModel] (default task-18) Buscando o domínio para aplicação: [sicrb-intra]
2026-07-27 14:28:23,316 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-18) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:23,320 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-18) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:23,320 DEBUG [br.gov.caixa.sisgr.acessoseguro.model.oauth.bean.SisgrDominioModel] (default task-18) Buscando o domínio para aplicação:  [sicrb-intra] - Domínio: [intranet]
2026-07-27 14:28:23,321 DEBUG [br.gov.caixa.sisgr.acessoseguro.model.oauth.bean.SisgrTokenSessionModel] (default task-18) Criando a autenticação do usuário [W|W0000001|9998|F929540]:
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) INICIO METODO :: ACSSGR  criarAutenticacao(....
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) P_NO_CHAMADOR :: ACSSGR
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) P_NO_DOMINIO :: intranet
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) P_NO_USUARIO :: W|W0000001|9998|F929540
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) P_DE_URL_ORIGEM :: http://srjdeapllx130:8080/intranet/auth/login
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) P_DE_USUARIO :: {"tipoCredencial":"9998","codigoCredencial":"F929540","tipoAmbiente":"W","siglaAmbiente":"W0000001","nivelAutenticacao":"99","nomeUsuario":"MARINALDO SANTOS","unidade":"5088","certificacao":"070530001429","estagioAmbiente":"DESENVOLVIMENTO","ultimo":1785173298685}
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) P_DE_ESTADO_SESSAO :: 05351227-c68d-4d87-b36c-3ff12502a525
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) P_NO_DISPOSITIVO :: Google Chrome|PC|WIN32
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) P_CO_IP_USUARIO :: 10.111.24.203
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18)  REFAZENDO O IP
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) MANTEVE O IP 13
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) P_NO_APLICACAO :: sicrb-intra
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) P_CO_AUTORIZACAO :: 0cc5100e-a6c5-4089-9e0e-703265a9f12d
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) P_SG_SISTEMA :: SGR
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) P_IC_AMBIENTE_EXEC :: W
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) P_SG_AMBIENTE_EXEC :: W0000001
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) P_CO_TPUSUARIO_EXEC :: 9998
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) P_CO_USUARIO_EXEC :: F929540
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) P_CO_TOKEN_EXEC :: 10.111.24.203
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) INFORMACOES DO NOVO P_CO_TOKEN_EXEC AJUSTADO :: 10.111.24.203
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) P_CO_DISPOSITIVO_CANAL :: 1
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) P_DE_URL :: http://srjdeapllx130:8080/api/auth/token
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) P_CO_IP :: 10.116.85.230
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) P_DE_SERVICO :: ACSREST
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) P_NO_SERVIDOR_TRANSACAO :: 10.116.94.88
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) P_NO_INSTANCIA_SERVIDOR :: 10.116.85.230
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) :::::::::::::::: OS PARAMETROS ABAIXO NAO SAO INFORMADOS :::::::::::::::::::::::
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) P_CO_TPEMPRESA ::
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) P_CO_ESTABELECIMENTO ::
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) P_CO_PROCESSO_SGR ::
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) P_DE_TIPO_RECURSO ::
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) P_DE_RECURSO ::
2026-07-27 14:28:23,322 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2AutenticacaoDAO] (default task-18) P_CO_NIVEL_AUTENTICACAO ::
2026-07-27 14:28:23,322 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-18) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:23,327 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-18) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:23,327 DEBUG [br.gov.caixa.sisgr.acessoseguro.model.oauth.bean.SisgrTokenSessionModel] (default task-18) Criando a autenticação do usuário [W|W0000001|9998|F929540]: CODIGO DE RETORNO: 0 - MENSAGEM: TOKENS DE AUTENTICACAO SALVO COM SUCESSO
2026-07-27 14:28:23,328 INFO  [br.gov.caixa.sisgr.acessoseguro.auth.rest.resource.TokenResource] (default task-18)   Response getToken TOKEN GERADO NA AUTENTICACAO ==>br.gov.caixa.sisgr.token.oauth.jwt.object.JWT@7ea4198e
2026-07-27 14:28:23,329 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-18) MessageBodyWriter: org.jboss.resteasy.spi.ResteasyProviderFactory$SortedKey
2026-07-27 14:28:23,329 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-18) MessageBodyWriter: org.jboss.resteasy.plugins.providers.StringTextStar
2026-07-27 14:28:23,329 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-18) MessageBodyWriter: org.jboss.resteasy.plugins.providers.StringTextStar
2026-07-27 14:28:23,329 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-18) Interceptor Context: org.jboss.resteasy.core.interception.ServerWriterInterceptorContext,  Method : proceed
2026-07-27 14:28:23,329 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-18) WriterInterceptor: org.jboss.resteasy.security.doseta.DigitalSigningInterceptor
2026-07-27 14:28:23,329 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-18) Interceptor Context: org.jboss.resteasy.core.interception.ServerWriterInterceptorContext,  Method : proceed
2026-07-27 14:28:23,329 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-18) MessageBodyWriter: org.jboss.resteasy.spi.ResteasyProviderFactory$SortedKey
2026-07-27 14:28:23,329 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-18) MessageBodyWriter: org.jboss.resteasy.plugins.providers.StringTextStar
2026-07-27 14:28:23,332 DEBUG [br.gov.caixa.sisgr.acessoseguro.login.filter.UrlOriginFilter] (default task-16) CorsFilter - Login: Inicio
2026-07-27 14:28:23,332 DEBUG [br.gov.caixa.sisgr.acessoseguro.login.filter.UrlOriginFilter] (default task-16) get Method: POST
2026-07-27 14:28:23,332 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-16) RESTEASY002315: PathInfo: /processos/listar
2026-07-27 14:28:23,332 DEBUG [org.jboss.resteasy.cdi.i18n] (default task-16) RESTEASY010520: Beans found for class br.gov.caixa.sisgr.acessoseguro.sisgr.rest.resource.ProcessosResource : [Managed Bean [class br.gov.caixa.sisgr.acessoseguro.sisgr.rest.resource.ProcessosResource] with qualifiers [@Any @Default]]
2026-07-27 14:28:23,336 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-16) Interceptor Context: org.jboss.resteasy.core.interception.ServerReaderInterceptorContext,  Method : proceed
2026-07-27 14:28:23,336 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-16) ReaderInterceptor: org.jboss.resteasy.security.doseta.DigitalVerificationInterceptor
2026-07-27 14:28:23,336 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-16) Interceptor Context: org.jboss.resteasy.core.interception.ServerReaderInterceptorContext,  Method : proceed
2026-07-27 14:28:23,336 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-16) MessageBodyReader: org.jboss.resteasy.spi.ResteasyProviderFactory$SortedKey
2026-07-27 14:28:23,336 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-16) MessageBodyReader: org.jboss.resteasy.plugins.providers.jackson.ResteasyJackson2Provider
2026-07-27 14:28:23,340 DEBUG [org.jboss.resteasy.plugins.validation.i18n] (default task-16) RESTEASY008510: ResteasyCdiExtension is on the classpath.
2026-07-27 14:28:23,340 INFO  [br.gov.caixa.sisgr.acessoseguro.sisgr.rest.resource.ProcessosResource] (default task-16)  ============================ INICIO METODO /processo/listar ==========================================
2026-07-27 14:28:23,340 INFO  [br.gov.caixa.sisgr.acessoseguro.sisgr.rest.resource.SisgrResource] (default task-16) =================================== INICIO METODO protected Response getResponse(... )====================================
2026-07-27 14:28:23,341 INFO  [br.gov.caixa.sisgr.acessoseguro.sisgr.rest.resource.SisgrResource] (default task-16) :: JWT passado para o servico :: eyJ0eXAiOiJKV1MiLCJhbGciOiJITUFDU0hBMjU2IiwiY3R5IjoiYXBwbGljYXRpb24vanNvbiJ9.eyJqdGkiOiJXfFcwMDAwMDAxfDk5OTh8RjkyOTU0MCIsImlzcyI6Imh0dHA6Ly9zcmpkZWFwbGx4MTMwOjgwODAvaW50cmFuZXQvYXV0aC9sb2dpbiIsInN1YiI6Ild8VzAwMDAwMDF8OTk5OHxGOTI5NTQwIiwiYXVkIjoic2ljcmItaW50cmEiLCJleHAiOiIxNzg1MTczMzYzMzIwIiwiYXpwIjoic2ljcmItaW50cmEiLCJjbGFpbXMiOnsidGlwb0NyZWRlbmNpYWwiOiI5OTk4IiwiY29kaWdvQ3JlZGVuY2lhbCI6IkY5Mjk1NDAiLCJ0aXBvQW1iaWVudGUiOiJXIiwic2lnbGFBbWJpZW50ZSI6IlcwMDAwMDAxIiwibml2ZWxBdXRlbnRpY2FjYW8iOiI5OSIsIm5vbWVVc3VhcmlvIjoiTUFSSU5BTERPIFNBTlRPUyIsInVuaWRhZGUiOiI1MDg4IiwiY2VydGlmaWNhY2FvIjoiMDcwNTMwMDAxNDI5IiwiZXN0YWdpb0FtYmllbnRlIjoiREVTRU5WT0xWSU1FTlRPIiwidWx0aW1vIjoxNzg1MTczMjk4Njg1fX0=.mvi2I1x6__jtwjf5q8XIDTauLnT2JIBWhCuJMuKdT9vY=
2026-07-27 14:28:23,341 DEBUG [br.gov.caixa.sisgr.acessoseguro.model.oauth.bean.SisgrTokenSessionModel] (default task-16) Buscando o token de Acesso para o usuário:  [W|W0000001|9998|F929540]:
2026-07-27 14:28:23,341 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2UsuarioTokenDAO] (default task-16)  INICIO ::: public Retorno<TokenUsuario> buscarUsuarioTokenAcesso
2026-07-27 14:28:23,341 INFO  [br.gov.caixa.sisgr.acessoseguro.model.oauth.dao.DB2UsuarioTokenDAO] (default task-16)  ::::::::::: accessToken ::::::::::::::::::::: eyJ0eXAiOiJKV1MiLCJhbGciOiJITUFDU0hBMjU2IiwiY3R5IjoiYXBwbGljYXRpb24vanNvbiJ9.eyJqdGkiOiJXfFcwMDAwMDAxfDk5OTh8RjkyOTU0MCIsImlzcyI6Imh0dHA6Ly9zcmpkZWFwbGx4MTMwOjgwODAvaW50cmFuZXQvYXV0aC9sb2dpbiIsInN1YiI6Ild8VzAwMDAwMDF8OTk5OHxGOTI5NTQwIiwiYXVkIjoic2ljcmItaW50cmEiLCJleHAiOiIxNzg1MTczMzYzMzIwIiwiYXpwIjoic2ljcmItaW50cmEiLCJjbGFpbXMiOnsidGlwb0NyZWRlbmNpYWwiOiI5OTk4IiwiY29kaWdvQ3JlZGVuY2lhbCI6IkY5Mjk1NDAiLCJ0aXBvQW1iaWVudGUiOiJXIiwic2lnbGFBbWJpZW50ZSI6IlcwMDAwMDAxIiwibml2ZWxBdXRlbnRpY2FjYW8iOiI5OSIsIm5vbWVVc3VhcmlvIjoiTUFSSU5BTERPIFNBTlRPUyIsInVuaWRhZGUiOiI1MDg4IiwiY2VydGlmaWNhY2FvIjoiMDcwNTMwMDAxNDI5IiwiZXN0YWdpb0FtYmllbnRlIjoiREVTRU5WT0xWSU1FTlRPIiwidWx0aW1vIjoxNzg1MTczMjk4Njg1fX0=.mvi2I1x6__jtwjf5q8XIDTauLnT2JIBWhCuJMuKdT9vY=
2026-07-27 14:28:23,342 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-16) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:23,344 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-16) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:23,344 DEBUG [br.gov.caixa.sisgr.acessoseguro.model.oauth.bean.SisgrTokenSessionModel] (default task-16) Buscando o token de Acesso para o usuário: [W|W0000001|9998|F929540]: CODIGO DE RETORNO: 0 - MENSAGEM: BUSCA REALIZADA COM SUCESSO
2026-07-27 14:28:23,354 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-16) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:23,375 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-16) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:23,375 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-16) MessageBodyWriter: org.jboss.resteasy.spi.ResteasyProviderFactory$SortedKey
2026-07-27 14:28:23,375 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-16) MessageBodyWriter: org.jboss.resteasy.plugins.providers.jackson.ResteasyJackson2Provider
2026-07-27 14:28:23,375 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-16) MessageBodyWriter: org.jboss.resteasy.plugins.providers.jackson.ResteasyJackson2Provider
2026-07-27 14:28:23,375 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-16) Interceptor Context: org.jboss.resteasy.core.interception.ServerWriterInterceptorContext,  Method : proceed
2026-07-27 14:28:23,375 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-16) WriterInterceptor: org.jboss.resteasy.security.doseta.DigitalSigningInterceptor
2026-07-27 14:28:23,375 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-16) Interceptor Context: org.jboss.resteasy.core.interception.ServerWriterInterceptorContext,  Method : proceed
2026-07-27 14:28:23,375 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-16) MessageBodyWriter: org.jboss.resteasy.spi.ResteasyProviderFactory$SortedKey
2026-07-27 14:28:23,375 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-16) MessageBodyWriter: org.jboss.resteasy.plugins.providers.jackson.ResteasyJackson2Provider
2026-07-27 14:28:35,719 DEBUG [org.jboss.jca.core.connectionmanager.pool.idle.IdleRemover] (IdleRemover) Notifying pools, interval: 30000
2026-07-27 14:28:38,364 DEBUG [org.jboss.ejb.client.txn] (Periodic Recovery) Send recover request for transaction origin node identifier 1 to EJB receiver with node name srjdeapllx130:srjdeapllx130_acessoseguro_intra_5500
2026-07-27 14:28:42,726 DEBUG [org.jboss.jca.core.connectionmanager.pool.validator.ConnectionValidator] (ConnectionValidator) Notifying pools, interval: 30000
2026-07-27 14:28:42,726 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (ConnectionValidator) Checking for connection within frequency
2026-07-27 14:28:42,726 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (ConnectionValidator) Checking for connection within frequency
2026-07-27 14:28:42,726 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (ConnectionValidator) Checking for connection within frequency
2026-07-27 14:28:48,365 DEBUG [org.jboss.ejb.client.txn] (Periodic Recovery) Send recover request for transaction origin node identifier 1 to EJB receiver with node name srjdeapllx130:srjdeapllx130_acessoseguro_intra_5500
[p585600@srjdeapllx130 ~]$ grep -i -B3 -A20 "siset" /infra_app/logs/sisgr/server-srjdeapllx130_acessoseguro_intra_5500.log | tail -n 200
2026-07-27 10:26:25,105 INFO  [br.gov.caixa.sisgr.matrizacesso.dao.ManutencaoUsuarioExternoDAO] (default task-26) A PROPRIEDADE DE ROLE (SISET) ESTÁ: true
2026-07-27 10:26:25,105 INFO  [stdout] (default task-26) 2026-07-27 10:26:25 [default task-26] DEBUG ManutencaoUsuarioExternoDAO:144 - Conectando ao Datasource: java:jboss/db2sgr
2026-07-27 10:26:25,105 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-26) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 10:26:25,105 INFO  [stdout] (default task-26) 2026-07-27 10:26:25 [default task-26] DEBUG ManutencaoUsuarioExternoDAO:147 - Preparando a procedure: SGR.SGRSPS05_BUSCAR_ROLE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
2026-07-27 10:26:25,105 INFO  [stdout] (default task-26) 2026-07-27 10:26:25 [default task-26] DEBUG ManutencaoUsuarioExternoDAO:201 - Executando com os parâmetros: W,W0000001,9998,F526225,99,030229201128,BES,S31S10S04,,,,,10.211.18.131,http://srjdeapllx130:8080/matrizacesso/v1/manutencaoUsuarioExterno/autorizar,SGRSPS05_BUSCAR_ROLE,srjdeapllx130.host.trj,srjdeapllx130_acessoseguro_intra_5500,JAVA,null,1,?outParameter?,?outParameter?
2026-07-27 10:26:25,109 INFO  [stdout] (default task-26) 2026-07-27 10:26:25 [default task-26] DEBUG ManutencaoUsuarioExternoDAO:249 - Fechando a Conexão: java:jboss/db2sgr
2026-07-27 10:26:25,109 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-26) db2sgr: returnConnection(14dc3abf, false) [0/32]
2026-07-27 10:26:25,109 INFO  [br.gov.caixa.sisgr.matrizacesso.service.siset.UserRoleService] (default task-26) Acessando serviço de OBTENÇÃO DOS DADOS do usuário 03215925737
2026-07-27 10:26:25,111 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-26) Provider : org.jboss.resteasy.plugins.providers.DocumentProvider,  Method : DocumentProvider
2026-07-27 10:26:25,111 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-26) RESTEASY002330: Unable to retrieve config: expandEntityReferences defaults to false
2026-07-27 10:26:25,111 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-26) RESTEASY002335: Unable to retrieve config: enableSecureProcessingFeature defaults to true
2026-07-27 10:26:25,111 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-26) RESTEASY002325: Unable to retrieve config: disableDTDs defaults to true
2026-07-27 10:26:25,111 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-26) Provider : org.jboss.resteasy.plugins.providers.DocumentProvider,  Method : DocumentProvider
2026-07-27 10:26:25,111 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-26) RESTEASY002330: Unable to retrieve config: expandEntityReferences defaults to false
2026-07-27 10:26:25,111 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-26) RESTEASY002335: Unable to retrieve config: enableSecureProcessingFeature defaults to true
2026-07-27 10:26:25,111 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-26) RESTEASY002325: Unable to retrieve config: disableDTDs defaults to true
2026-07-27 10:26:25,119 DEBUG [br.gov.caixa.sisgr.integracao.siset.service.ServiceProxy] (default task-26) Url: https://logindes.caixa.gov.br
2026-07-27 10:26:25,120 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-26) Provider : org.jboss.resteasy.plugins.providers.FormUrlEncodedProvider,  Method : writeTo
2026-07-27 10:26:25,120 DEBUG [org.apache.http.impl.conn.BasicClientConnectionManager] (default task-26) Get connection for route {s}->https://logindes.caixa.gov.br:443
2026-07-27 10:26:25,121 DEBUG [org.apache.http.impl.conn.DefaultClientConnectionOperator] (default task-26) Connecting to logindes.caixa.gov.br:443
2026-07-27 10:26:25,125 DEBUG [org.apache.http.impl.conn.DefaultClientConnection] (default task-26) Connection org.apache.http.impl.conn.DefaultClientConnection@38b3a865 closed
2026-07-27 10:26:25,125 DEBUG [org.apache.http.impl.conn.DefaultClientConnection] (default task-26) Connection org.apache.http.impl.conn.DefaultClientConnection@38b3a865 shut down
2026-07-27 10:26:25,125 DEBUG [org.apache.http.impl.conn.BasicClientConnectionManager] (default task-26) Releasing connection org.apache.http.impl.conn.ManagedClientConnectionImpl@2b84be40
2026-07-27 10:26:25,125 ERROR [br.gov.caixa.sisgr.matrizacesso.service.siset.UserRoleService] (default task-26) Ocorreu um error no serviço de OBTENÇÃO DOS DADOS do usuário 03215925737
2026-07-27 10:26:25,125 ERROR [br.gov.caixa.sisgr.matrizacesso.service.siset.UserRoleService] (default task-26) [CAUSE]: RESTEASY004655: Unable to invoke request
2026-07-27 10:26:25,125 SEVERE [br.gov.caixa.sisgr.matrizacesso.application.ApplicationException] (default task-26) Não foi possível executar a ação devido a falha de comunicação com o SISET.: br.gov.caixa.sisgr.matrizacesso.exception.SisetServiceException: Não foi possível executar a ação devido a falha de comunicação com o SISET.
        at br.gov.caixa.sisgr.matrizacesso.service.siset.UserRoleService.hasRole(UserRoleService.java:118)
        at br.gov.caixa.sisgr.matrizacesso.dao.ManutencaoUsuarioExternoDAO.autorizar(ManutencaoUsuarioExternoDAO.java:478)
        at br.gov.caixa.sisgr.matrizacesso.dao.ManutencaoUsuarioExternoDAO$Proxy$_$$_WeldClientProxy.autorizar(Unknown Source)
        at br.gov.caixa.sisgr.matrizacesso.service.ManutencaoUsuarioExternoBean.autorizar(ManutencaoUsuarioExternoBean.java:134)
        at sun.reflect.GeneratedMethodAccessor272.invoke(Unknown Source)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
        at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:437)
        at org.jboss.as.weld.ejb.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:82)
        at org.jboss.as.weld.ejb.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:93)
        at org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
        at org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:43)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
        at org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
        at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:437)
        at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:64)
        at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:83)
--
2026-07-27 12:31:21,204 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-26) db2sgr: returnConnection(381354c7, false) [0/32]
2026-07-27 12:31:21,204 INFO  [br.gov.caixa.sisgr.matrizacesso.dao.ManutencaoUsuarioExternoDAO] (default task-26) VERIFICANDO SE O SISTEMA TEM ROLE
2026-07-27 12:31:21,204 INFO  [br.gov.caixa.sisgr.matrizacesso.dao.ManutencaoUsuarioExternoDAO] (default task-26) O SISTEMA [BES] tem role
2026-07-27 12:31:21,204 INFO  [br.gov.caixa.sisgr.matrizacesso.dao.ManutencaoUsuarioExternoDAO] (default task-26) A PROPRIEDADE DE ROLE (SISET) ESTÁ: true
2026-07-27 12:31:21,204 INFO  [stdout] (default task-26) 2026-07-27 12:31:21 [default task-26] DEBUG ManutencaoUsuarioExternoDAO:144 - Conectando ao Datasource: java:jboss/db2sgr
2026-07-27 12:31:21,204 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-26) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 12:31:21,205 INFO  [stdout] (default task-26) 2026-07-27 12:31:21 [default task-26] DEBUG ManutencaoUsuarioExternoDAO:147 - Preparando a procedure: SGR.SGRSPS05_BUSCAR_ROLE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
2026-07-27 12:31:21,205 INFO  [stdout] (default task-26) 2026-07-27 12:31:21 [default task-26] DEBUG ManutencaoUsuarioExternoDAO:201 - Executando com os parâmetros: W,W0000001,9998,F569498,99,050811221710,BES,S31S10S04,,,,,10.111.25.65,http://srjdeapllx130:8080/matrizacesso/v1/manutencaoUsuarioExterno/autorizar,SGRSPS05_BUSCAR_ROLE,srjdeapllx130.host.trj,srjdeapllx130_acessoseguro_intra_5500,JAVA,null,1,?outParameter?,?outParameter?
2026-07-27 12:31:21,210 INFO  [stdout] (default task-26) 2026-07-27 12:31:21 [default task-26] DEBUG ManutencaoUsuarioExternoDAO:249 - Fechando a Conexão: java:jboss/db2sgr
2026-07-27 12:31:21,210 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-26) db2sgr: returnConnection(381354c7, false) [0/32]
2026-07-27 12:31:21,210 INFO  [br.gov.caixa.sisgr.matrizacesso.service.siset.UserRoleService] (default task-26) Acessando serviço de OBTENÇÃO DOS DADOS do usuário 02903762708
2026-07-27 12:31:21,211 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-26) Provider : org.jboss.resteasy.plugins.providers.DocumentProvider,  Method : DocumentProvider
2026-07-27 12:31:21,211 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-26) RESTEASY002330: Unable to retrieve config: expandEntityReferences defaults to false
2026-07-27 12:31:21,211 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-26) RESTEASY002335: Unable to retrieve config: enableSecureProcessingFeature defaults to true
2026-07-27 12:31:21,211 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-26) RESTEASY002325: Unable to retrieve config: disableDTDs defaults to true
2026-07-27 12:31:21,211 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-26) Provider : org.jboss.resteasy.plugins.providers.DocumentProvider,  Method : DocumentProvider
2026-07-27 12:31:21,211 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-26) RESTEASY002330: Unable to retrieve config: expandEntityReferences defaults to false
2026-07-27 12:31:21,211 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-26) RESTEASY002335: Unable to retrieve config: enableSecureProcessingFeature defaults to true
2026-07-27 12:31:21,211 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-26) RESTEASY002325: Unable to retrieve config: disableDTDs defaults to true
2026-07-27 12:31:21,217 DEBUG [br.gov.caixa.sisgr.integracao.siset.service.ServiceProxy] (default task-26) Url: https://logindes.caixa.gov.br
2026-07-27 12:31:21,217 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-26) Provider : org.jboss.resteasy.plugins.providers.FormUrlEncodedProvider,  Method : writeTo
2026-07-27 12:31:21,217 DEBUG [org.apache.http.impl.conn.BasicClientConnectionManager] (default task-26) Get connection for route {s}->https://logindes.caixa.gov.br:443
2026-07-27 12:31:21,218 DEBUG [org.apache.http.impl.conn.DefaultClientConnectionOperator] (default task-26) Connecting to logindes.caixa.gov.br:443
2026-07-27 12:31:21,221 DEBUG [org.apache.http.impl.conn.DefaultClientConnection] (default task-26) Connection org.apache.http.impl.conn.DefaultClientConnection@79511164 closed
2026-07-27 12:31:21,221 DEBUG [org.apache.http.impl.conn.DefaultClientConnection] (default task-26) Connection org.apache.http.impl.conn.DefaultClientConnection@79511164 shut down
2026-07-27 12:31:21,221 DEBUG [org.apache.http.impl.conn.BasicClientConnectionManager] (default task-26) Releasing connection org.apache.http.impl.conn.ManagedClientConnectionImpl@7e4ed7c0
2026-07-27 12:31:21,221 ERROR [br.gov.caixa.sisgr.matrizacesso.service.siset.UserRoleService] (default task-26) Ocorreu um error no serviço de OBTENÇÃO DOS DADOS do usuário 02903762708
2026-07-27 12:31:21,221 ERROR [br.gov.caixa.sisgr.matrizacesso.service.siset.UserRoleService] (default task-26) [CAUSE]: RESTEASY004655: Unable to invoke request
2026-07-27 12:31:21,221 SEVERE [br.gov.caixa.sisgr.matrizacesso.application.ApplicationException] (default task-26) Não foi possível executar a ação devido a falha de comunicação com o SISET.: br.gov.caixa.sisgr.matrizacesso.exception.SisetServiceException: Não foi possível executar a ação devido a falha de comunicação com o SISET.
        at br.gov.caixa.sisgr.matrizacesso.service.siset.UserRoleService.hasRole(UserRoleService.java:118)
        at br.gov.caixa.sisgr.matrizacesso.dao.ManutencaoUsuarioExternoDAO.autorizar(ManutencaoUsuarioExternoDAO.java:478)
        at br.gov.caixa.sisgr.matrizacesso.dao.ManutencaoUsuarioExternoDAO$Proxy$_$$_WeldClientProxy.autorizar(Unknown Source)
        at br.gov.caixa.sisgr.matrizacesso.service.ManutencaoUsuarioExternoBean.autorizar(ManutencaoUsuarioExternoBean.java:134)
        at sun.reflect.GeneratedMethodAccessor272.invoke(Unknown Source)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
        at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:437)
        at org.jboss.as.weld.ejb.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:82)
        at org.jboss.as.weld.ejb.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:93)
        at org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
        at org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:43)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
        at org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
        at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:437)
        at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:64)
        at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:83)
--
2026-07-27 12:31:26,464 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-36) db2sgr: returnConnection(381354c7, false) [0/32]
2026-07-27 12:31:26,464 INFO  [br.gov.caixa.sisgr.matrizacesso.dao.ManutencaoUsuarioExternoDAO] (default task-36) VERIFICANDO SE O SISTEMA TEM ROLE
2026-07-27 12:31:26,464 INFO  [br.gov.caixa.sisgr.matrizacesso.dao.ManutencaoUsuarioExternoDAO] (default task-36) O SISTEMA [BES] tem role
2026-07-27 12:31:26,464 INFO  [br.gov.caixa.sisgr.matrizacesso.dao.ManutencaoUsuarioExternoDAO] (default task-36) A PROPRIEDADE DE ROLE (SISET) ESTÁ: true
2026-07-27 12:31:26,464 INFO  [stdout] (default task-36) 2026-07-27 12:31:26 [default task-36] DEBUG ManutencaoUsuarioExternoDAO:144 - Conectando ao Datasource: java:jboss/db2sgr
2026-07-27 12:31:26,464 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-36) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 12:31:26,464 INFO  [stdout] (default task-36) 2026-07-27 12:31:26 [default task-36] DEBUG ManutencaoUsuarioExternoDAO:147 - Preparando a procedure: SGR.SGRSPS05_BUSCAR_ROLE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
2026-07-27 12:31:26,465 INFO  [stdout] (default task-36) 2026-07-27 12:31:26 [default task-36] DEBUG ManutencaoUsuarioExternoDAO:201 - Executando com os parâmetros: W,W0000001,9998,F569498,99,050811221710,BES,S31S10S04,,,,,10.111.25.65,http://srjdeapllx130:8080/matrizacesso/v1/manutencaoUsuarioExterno/autorizar,SGRSPS05_BUSCAR_ROLE,srjdeapllx130.host.trj,srjdeapllx130_acessoseguro_intra_5500,JAVA,null,1,?outParameter?,?outParameter?
2026-07-27 12:31:26,470 INFO  [stdout] (default task-36) 2026-07-27 12:31:26 [default task-36] DEBUG ManutencaoUsuarioExternoDAO:249 - Fechando a Conexão: java:jboss/db2sgr
2026-07-27 12:31:26,470 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-36) db2sgr: returnConnection(381354c7, false) [0/32]
2026-07-27 12:31:26,470 INFO  [br.gov.caixa.sisgr.matrizacesso.service.siset.UserRoleService] (default task-36) Acessando serviço de OBTENÇÃO DOS DADOS do usuário 02903762708
2026-07-27 12:31:26,470 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-36) Provider : org.jboss.resteasy.plugins.providers.DocumentProvider,  Method : DocumentProvider
2026-07-27 12:31:26,471 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-36) RESTEASY002330: Unable to retrieve config: expandEntityReferences defaults to false
2026-07-27 12:31:26,471 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-36) RESTEASY002335: Unable to retrieve config: enableSecureProcessingFeature defaults to true
2026-07-27 12:31:26,471 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-36) RESTEASY002325: Unable to retrieve config: disableDTDs defaults to true
2026-07-27 12:31:26,471 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-36) Provider : org.jboss.resteasy.plugins.providers.DocumentProvider,  Method : DocumentProvider
2026-07-27 12:31:26,471 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-36) RESTEASY002330: Unable to retrieve config: expandEntityReferences defaults to false
2026-07-27 12:31:26,471 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-36) RESTEASY002335: Unable to retrieve config: enableSecureProcessingFeature defaults to true
2026-07-27 12:31:26,471 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-36) RESTEASY002325: Unable to retrieve config: disableDTDs defaults to true
2026-07-27 12:31:26,476 DEBUG [br.gov.caixa.sisgr.integracao.siset.service.ServiceProxy] (default task-36) Url: https://logindes.caixa.gov.br
2026-07-27 12:31:26,477 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-36) Provider : org.jboss.resteasy.plugins.providers.FormUrlEncodedProvider,  Method : writeTo
2026-07-27 12:31:26,477 DEBUG [org.apache.http.impl.conn.BasicClientConnectionManager] (default task-36) Get connection for route {s}->https://logindes.caixa.gov.br:443
2026-07-27 12:31:26,477 DEBUG [org.apache.http.impl.conn.DefaultClientConnectionOperator] (default task-36) Connecting to logindes.caixa.gov.br:443
2026-07-27 12:31:26,480 DEBUG [org.apache.http.impl.conn.DefaultClientConnection] (default task-36) Connection org.apache.http.impl.conn.DefaultClientConnection@5bbe4049 closed
2026-07-27 12:31:26,480 DEBUG [org.apache.http.impl.conn.DefaultClientConnection] (default task-36) Connection org.apache.http.impl.conn.DefaultClientConnection@5bbe4049 shut down
2026-07-27 12:31:26,480 DEBUG [org.apache.http.impl.conn.BasicClientConnectionManager] (default task-36) Releasing connection org.apache.http.impl.conn.ManagedClientConnectionImpl@6c5ed78f
2026-07-27 12:31:26,480 ERROR [br.gov.caixa.sisgr.matrizacesso.service.siset.UserRoleService] (default task-36) Ocorreu um error no serviço de OBTENÇÃO DOS DADOS do usuário 02903762708
2026-07-27 12:31:26,480 ERROR [br.gov.caixa.sisgr.matrizacesso.service.siset.UserRoleService] (default task-36) [CAUSE]: RESTEASY004655: Unable to invoke request
2026-07-27 12:31:26,480 SEVERE [br.gov.caixa.sisgr.matrizacesso.application.ApplicationException] (default task-36) Não foi possível executar a ação devido a falha de comunicação com o SISET.: br.gov.caixa.sisgr.matrizacesso.exception.SisetServiceException: Não foi possível executar a ação devido a falha de comunicação com o SISET.
        at br.gov.caixa.sisgr.matrizacesso.service.siset.UserRoleService.hasRole(UserRoleService.java:118)
        at br.gov.caixa.sisgr.matrizacesso.dao.ManutencaoUsuarioExternoDAO.autorizar(ManutencaoUsuarioExternoDAO.java:478)
        at br.gov.caixa.sisgr.matrizacesso.dao.ManutencaoUsuarioExternoDAO$Proxy$_$$_WeldClientProxy.autorizar(Unknown Source)
        at br.gov.caixa.sisgr.matrizacesso.service.ManutencaoUsuarioExternoBean.autorizar(ManutencaoUsuarioExternoBean.java:134)
        at sun.reflect.GeneratedMethodAccessor272.invoke(Unknown Source)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
        at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:437)
        at org.jboss.as.weld.ejb.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:82)
        at org.jboss.as.weld.ejb.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:93)
        at org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
        at org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:43)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
        at org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
        at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:437)
        at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:64)
        at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:83)
--
2026-07-27 12:31:29,613 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-40) db2sgr: returnConnection(381354c7, false) [0/32]
2026-07-27 12:31:29,613 INFO  [br.gov.caixa.sisgr.matrizacesso.dao.ManutencaoUsuarioExternoDAO] (default task-40) VERIFICANDO SE O SISTEMA TEM ROLE
2026-07-27 12:31:29,613 INFO  [br.gov.caixa.sisgr.matrizacesso.dao.ManutencaoUsuarioExternoDAO] (default task-40) O SISTEMA [BES] tem role
2026-07-27 12:31:29,613 INFO  [br.gov.caixa.sisgr.matrizacesso.dao.ManutencaoUsuarioExternoDAO] (default task-40) A PROPRIEDADE DE ROLE (SISET) ESTÁ: true
2026-07-27 12:31:29,613 INFO  [stdout] (default task-40) 2026-07-27 12:31:29 [default task-40] DEBUG ManutencaoUsuarioExternoDAO:144 - Conectando ao Datasource: java:jboss/db2sgr
2026-07-27 12:31:29,614 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-40) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 12:31:29,614 INFO  [stdout] (default task-40) 2026-07-27 12:31:29 [default task-40] DEBUG ManutencaoUsuarioExternoDAO:147 - Preparando a procedure: SGR.SGRSPS05_BUSCAR_ROLE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
2026-07-27 12:31:29,614 INFO  [stdout] (default task-40) 2026-07-27 12:31:29 [default task-40] DEBUG ManutencaoUsuarioExternoDAO:201 - Executando com os parâmetros: W,W0000001,9998,F569498,99,050811221710,BES,S31S10S04,,,,,10.111.25.65,http://srjdeapllx130:8080/matrizacesso/v1/manutencaoUsuarioExterno/autorizar,SGRSPS05_BUSCAR_ROLE,srjdeapllx130.host.trj,srjdeapllx130_acessoseguro_intra_5500,JAVA,null,1,?outParameter?,?outParameter?
2026-07-27 12:31:29,618 INFO  [stdout] (default task-40) 2026-07-27 12:31:29 [default task-40] DEBUG ManutencaoUsuarioExternoDAO:249 - Fechando a Conexão: java:jboss/db2sgr
2026-07-27 12:31:29,618 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-40) db2sgr: returnConnection(381354c7, false) [0/32]
2026-07-27 12:31:29,618 INFO  [br.gov.caixa.sisgr.matrizacesso.service.siset.UserRoleService] (default task-40) Acessando serviço de OBTENÇÃO DOS DADOS do usuário 02903762708
2026-07-27 12:31:29,619 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-40) Provider : org.jboss.resteasy.plugins.providers.DocumentProvider,  Method : DocumentProvider
2026-07-27 12:31:29,619 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-40) RESTEASY002330: Unable to retrieve config: expandEntityReferences defaults to false
2026-07-27 12:31:29,619 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-40) RESTEASY002335: Unable to retrieve config: enableSecureProcessingFeature defaults to true
2026-07-27 12:31:29,619 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-40) RESTEASY002325: Unable to retrieve config: disableDTDs defaults to true
2026-07-27 12:31:29,619 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-40) Provider : org.jboss.resteasy.plugins.providers.DocumentProvider,  Method : DocumentProvider
2026-07-27 12:31:29,619 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-40) RESTEASY002330: Unable to retrieve config: expandEntityReferences defaults to false
2026-07-27 12:31:29,619 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-40) RESTEASY002335: Unable to retrieve config: enableSecureProcessingFeature defaults to true
2026-07-27 12:31:29,619 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-40) RESTEASY002325: Unable to retrieve config: disableDTDs defaults to true
2026-07-27 12:31:29,625 DEBUG [br.gov.caixa.sisgr.integracao.siset.service.ServiceProxy] (default task-40) Url: https://logindes.caixa.gov.br
2026-07-27 12:31:29,626 DEBUG [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-40) Provider : org.jboss.resteasy.plugins.providers.FormUrlEncodedProvider,  Method : writeTo
2026-07-27 12:31:29,626 DEBUG [org.apache.http.impl.conn.BasicClientConnectionManager] (default task-40) Get connection for route {s}->https://logindes.caixa.gov.br:443
2026-07-27 12:31:29,626 DEBUG [org.apache.http.impl.conn.DefaultClientConnectionOperator] (default task-40) Connecting to logindes.caixa.gov.br:443
2026-07-27 12:31:29,628 DEBUG [org.apache.http.impl.conn.DefaultClientConnection] (default task-40) Connection org.apache.http.impl.conn.DefaultClientConnection@4982faa1 closed
2026-07-27 12:31:29,628 DEBUG [org.apache.http.impl.conn.DefaultClientConnection] (default task-40) Connection org.apache.http.impl.conn.DefaultClientConnection@4982faa1 shut down
2026-07-27 12:31:29,628 DEBUG [org.apache.http.impl.conn.BasicClientConnectionManager] (default task-40) Releasing connection org.apache.http.impl.conn.ManagedClientConnectionImpl@2c592e87
2026-07-27 12:31:29,629 ERROR [br.gov.caixa.sisgr.matrizacesso.service.siset.UserRoleService] (default task-40) Ocorreu um error no serviço de OBTENÇÃO DOS DADOS do usuário 02903762708
2026-07-27 12:31:29,629 ERROR [br.gov.caixa.sisgr.matrizacesso.service.siset.UserRoleService] (default task-40) [CAUSE]: RESTEASY004655: Unable to invoke request
2026-07-27 12:31:29,629 SEVERE [br.gov.caixa.sisgr.matrizacesso.application.ApplicationException] (default task-40) Não foi possível executar a ação devido a falha de comunicação com o SISET.: br.gov.caixa.sisgr.matrizacesso.exception.SisetServiceException: Não foi possível executar a ação devido a falha de comunicação com o SISET.
        at br.gov.caixa.sisgr.matrizacesso.service.siset.UserRoleService.hasRole(UserRoleService.java:118)
        at br.gov.caixa.sisgr.matrizacesso.dao.ManutencaoUsuarioExternoDAO.autorizar(ManutencaoUsuarioExternoDAO.java:478)
        at br.gov.caixa.sisgr.matrizacesso.dao.ManutencaoUsuarioExternoDAO$Proxy$_$$_WeldClientProxy.autorizar(Unknown Source)
        at br.gov.caixa.sisgr.matrizacesso.service.ManutencaoUsuarioExternoBean.autorizar(ManutencaoUsuarioExternoBean.java:134)
        at sun.reflect.GeneratedMethodAccessor272.invoke(Unknown Source)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
        at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:437)
        at org.jboss.as.weld.ejb.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:82)
        at org.jboss.as.weld.ejb.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:93)
        at org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
        at org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:43)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
        at org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
        at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:437)
        at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:64)
        at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:83)
[p585600@srjdeapllx130 ~]$ grep -i -E "exception|timeout|connect|refused|failed" /infra_app/logs/sisgr/server-srjdeapllx130_acessoseguro_intra_5500.log | tail -n 100
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: TIMESTAMP-WS: 0000000000000000 tamanho: [16]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: TRANSACTION-SERVER:                           tamanho: [25]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: TIMESTAMP-TS: 0000000000000000 tamanho: [16]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: AMBIENTE:   tamanho: [1]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: TP-USUARIO:    tamanho: [2]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: CO-USERID:          tamanho: [8]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: NIS: 00000000000 tamanho: [11]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: NIVEL-AUTENT: 00 tamanho: [2]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: SISTEMA:        tamanho: [6]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: FUNCAO:            tamanho: [10]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: OPERACAO:                  tamanho: [16]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: NO-PROGRAMA:          tamanho: [8]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: AREA-A-PASSAR-PARA-PGM:   tamanho: [1]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: FORMA-DE-CHAMAR-O-PGM:   tamanho: [1]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: INDICADOR-DE-DISPLAY:   tamanho: [1]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: TAMANHO-SEND-WEB: 00000 tamanho: [5]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: RG-OCOR:                                                                        tamanho: [70]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: NO-ENCAP:          tamanho: [8]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: CO-TPEMPRESA:   tamanho: [1]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: CO-EMPRESA: 00000000000000 tamanho: [14]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: IC-SEGURANCA:   tamanho: [1]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: SG-SIS-SGR:     tamanho: [3]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: CO-PROC-SGR:                          tamanho: [24]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: CO-CERT-SGR:              tamanho: [12]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: DE-TPREC-SGR:                 tamanho: [15]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: DE-RECURSO-SGR:                           tamanho: [25]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: FILLER:                            tamanho: [26]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: ID-CICS:      tamanho: [4]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: NUM-TAM-RECEIVE: 00 tamanho: [2]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: TS-INICIO:                  tamanho: [16]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: TS-EVENTO:                  tamanho: [16]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: TAM-DEVOLVIDO:       tamanho: [5]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: NO-PROGRAMA: SGR00AUT tamanho: [8]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: FORMA-DE-CHAMAR-O-PGM: L tamanho: [1]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: INDICADOR-DE-DISPLAY: S tamanho: [1]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: TIMESTAMP-WS: 2026072714281867 tamanho: [16]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: IC-SEGURANCA:   tamanho: [1]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.pscpslnk.PSCAreaDeEntrada] (default task-17) PSCAreaDeEntrada=> Tamanho recebido: 151
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.model.CicsArea] (default task-17) setParameter: CO-REGRA-NEG-E:       tamanho: [5]
2026-07-27 14:28:18,677 INFO  [br.gov.caixa.psc.connector.client.jcicsdirect.JCICSDirectClient] (default task-17) *************JCICSDIRECT*************
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.client.jcicsdirect.JCICSDirectClient] (default task-17) Configurando cliente JCICSDIRECT:
2026-07-27 14:28:18,677 INFO  [br.gov.caixa.psc.connector.client.jcicsdirect.JCICSDirectClient] (default task-17) Target: :[tgsgrs145]
Timeout:[20000]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.client.jcicsdirect.JCICSDirectClient] (default task-17) Cliente JCICSDIRECT Configurado.
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.client.jcicsdirect.JCICSDirectClient] (default task-17) Efetuando o Login.
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.client.jcicsdirect.JCICSDirectClient] (default task-17) Verificando o token para o target [tgsgrs145]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.client.jcicsdirect.JCICSDirectClient] (default task-17) Token reuse for tgsgrs145
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.client.jcicsdirect.JCICSDirectClient] (default task-17) Login Completo.
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.psc.connector.client.jcicsdirect.JCICSDirectClient] (default task-17) Dados a Executar: [                             2026072714281867                         0000000000000000           0000000000000                                SGR00AUT LS00000                                                                               00000000000000                                                                                                              00                                          WW00000019998f929540                                                                                                                      Trynit72     ]
2026-07-27 14:28:18,677 DEBUG [br.gov.caixa.util.jcicsconnect.JCicsConnect] (default task-17) execute(): S1 SSGRDR01   PSCPSDI3 3.S145 [                             2026072714281867                         0000000000000000           0000000000000                                SGR00AUT LS00000                                                                               00000000000000                                                                                                              00                                          WW00000019998f929540                                                                                                                      Trynit72     ]
2026-07-27 14:28:18,690 DEBUG [br.gov.caixa.util.jcicsconnect.JCicsConnect] (default task-17) execute() retorno: S1 SSGRDR01   PSCPSDI1 [12ms][Erro CICS: 0][Resp: 0000][Resp2: 0000][Erro SQL: 0][Compl.: 0000][     000                                                                                                    SGRSBAUT          00000000000000000DESENVOLVIMENTO                                   MARINALDO OLIVEIRA SANTOS JUNIOR                                      5088                                                    070530001429990000000000000                                                                                        



2026-07-27 14:28:18,690 INFO  [br.gov.caixa.psc.connector.client.jcicsdirect.JCICSDirectClient] (default task-17) => JCICSDirect tempo de resposta =13 em milisegundos
2026-07-27 14:28:18,690 DEBUG [br.gov.caixa.psc.connector.client.jcicsdirect.JCICSDirectClient] (default task-17) Saída: [     000                                                                                                    SGRSBAUT          00000000000000000DESENVOLVIMENTO                                   MARINALDO OLIVEIRA SANTOS JUNIOR                                      5088                                                    070530001429990000000000000 


2026-07-27 14:28:18,691 INFO  [br.gov.caixa.psc.connector.client.jcicsdirect.JCICSDirectClient] (default task-17) *******JCICSDIRECT*COMPLETE**********
2026-07-27 14:28:18,691 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-17) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:18,693 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-17) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:18,693 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-17) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:18,697 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-17) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:18,698 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-17) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:18,701 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-17) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:18,702 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-17) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:18,712 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-17) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:22,839 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-21) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:22,844 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-21) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:22,846 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-21) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:22,849 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-21) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:22,849 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-21) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:22,855 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-21) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:22,855 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-21) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:22,858 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-21) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:22,858 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-21) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:22,862 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-21) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:22,863 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-21) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:22,867 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-21) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:23,306 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-18) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:23,309 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-18) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:23,309 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-18) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:23,313 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-18) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:23,313 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-18) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:23,316 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-18) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:23,316 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-18) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:23,320 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-18) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:23,322 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-18) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:23,327 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-18) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:23,342 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-16) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:23,344 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-16) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:23,354 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-16) db2sgr: getConnection(null, WrappedConnectionRequestInfo@2005dcd0[userName=SSGRDR01]) [0/32]
2026-07-27 14:28:23,375 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (default task-16) db2sgr: returnConnection(68a20402, false) [0/32]
2026-07-27 14:28:35,719 DEBUG [org.jboss.jca.core.connectionmanager.pool.idle.IdleRemover] (IdleRemover) Notifying pools, interval: 30000
2026-07-27 14:28:42,726 DEBUG [org.jboss.jca.core.connectionmanager.pool.validator.ConnectionValidator] (ConnectionValidator) Notifying pools, interval: 30000
2026-07-27 14:28:42,726 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (ConnectionValidator) Checking for connection within frequency
2026-07-27 14:28:42,726 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (ConnectionValidator) Checking for connection within frequency
2026-07-27 14:28:42,726 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (ConnectionValidator) Checking for connection within frequency
2026-07-27 14:29:05,720 DEBUG [org.jboss.jca.core.connectionmanager.pool.idle.IdleRemover] (IdleRemover) Notifying pools, interval: 30000
2026-07-27 14:29:05,720 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (IdleRemover) db2sgr: removeIdleConnections(1785173165720) [0/32]
2026-07-27 14:29:05,720 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (IdleRemover) oraicp: removeIdleConnections(1785173285720) [0/32]
2026-07-27 14:29:05,735 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (IdleRemover) idmsSCP: removeIdleConnections(1785173045735) [0/20]
2026-07-27 14:29:05,735 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (IdleRemover) db2d0f: removeIdleConnections(1785173165735) [0/32]
2026-07-27 14:29:05,735 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (JCA PoolFiller) oraicp: fillTo(8) [0/32]
2026-07-27 14:29:06,225 DEBUG [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (JCA PoolFiller) db2d0f: fillTo(8) [0/32]
[p585600@srjdeapllx130 ~]$ grep -i -B3 -A20 "siset" /infra_app/logs/sisgr/server-srjdeapllx130_webservice_intra_5502.log | tail -n 200
2026-07-27 01:08:55,282 DEBUG [org.xnio.nio] (management I/O-1) Started channel thread 'management I/O-1', selector sun.nio.ch.EPollSelectorImpl@d08b167
2026-07-27 01:08:55,303 DEBUG [org.xnio.nio] (management I/O-2) Started channel thread 'management I/O-2', selector sun.nio.ch.EPollSelectorImpl@5c4fd8be
2026-07-27 01:08:55,319 INFO  [org.jboss.remoting] (MSC service thread 1-7) JBoss Remoting version 4.0.18.Final-redhat-1
2026-07-27 01:08:55,323 DEBUG [org.xnio.nio] (management Accept) Started channel thread 'management Accept', selector sun.nio.ch.EPollSelectorImpl@63890eea
2026-07-27 01:08:55,339 DEBUG [org.jboss.as.server] (MSC service thread 1-2) DeploymentMountProvider started
2026-07-27 01:08:55,965 DEBUG [org.jboss.modules] (ServerService Thread Pool -- 2) Module org.jboss.as.clustering.infinispan:main defined by local module loader @47d384ee (finder: local module finder @2d6a9952 (roots: /opt/open/jboss/7.0.0/modules,/opt/open/jboss/7.0.0/modules/system/layers/base))
2026-07-27 01:08:55,965 DEBUG [org.jboss.modules] (ServerService Thread Pool -- 2) Module javax.transaction.api:main defined by local module loader @47d384ee (finder: local module finder @2d6a9952 (roots: /opt/open/jboss/7.0.0/modules,/opt/open/jboss/7.0.0/modules/system/layers/base))
2026-07-27 01:08:55,966 DEBUG [org.jboss.modules] (ServerService Thread Pool -- 2) Module net.jcip:main defined by local module loader @47d384ee (finder: local module finder @2d6a9952 (roots: /opt/open/jboss/7.0.0/modules,/opt/open/jboss/7.0.0/modules/system/layers/base))
2026-07-27 01:08:55,969 DEBUG [org.jboss.modules] (ServerService Thread Pool -- 2) Module org.infinispan:main defined by local module loader @47d384ee (finder: local module finder @2d6a9952 (roots: /opt/open/jboss/7.0.0/modules,/opt/open/jboss/7.0.0/modules/system/layers/base))
2026-07-27 01:08:55,969 DEBUG [org.jboss.modules] (ServerService Thread Pool -- 2) Module org.infinispan.cachestore.jdbc:main defined by local module loader @47d384ee (finder: local module finder @2d6a9952 (roots: /opt/open/jboss/7.0.0/modules,/opt/open/jboss/7.0.0/modules/system/layers/base))
2026-07-27 01:08:55,970 DEBUG [org.jboss.modules] (ServerService Thread Pool -- 2) Module org.infinispan.cachestore.remote:main defined by local module loader @47d384ee (finder: local module finder @2d6a9952 (roots: /opt/open/jboss/7.0.0/modules,/opt/open/jboss/7.0.0/modules/system/layers/base))
2026-07-27 01:08:55,971 DEBUG [org.jboss.modules] (ServerService Thread Pool -- 2) Module org.infinispan.client.hotrod:main defined by local module loader @47d384ee (finder: local module finder @2d6a9952 (roots: /opt/open/jboss/7.0.0/modules,/opt/open/jboss/7.0.0/modules/system/layers/base))
--
2026-07-27 01:09:02,985 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding dependency ModuleDependency [identifier=com.fasterxml.jackson.core.jackson-databind:2.8.11, moduleLoader=Service Module Loader, export=true, optional=false, importServices=false] to module deployment.sisgr_manut_usu_intra.ear:main
2026-07-27 01:09:02,985 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding dependency ModuleDependency [identifier=com.fasterxml.jackson.core.jackson-core:2.8.11, moduleLoader=Service Module Loader, export=true, optional=false, importServices=false] to module deployment.sisgr_manut_usu_intra.ear:main
2026-07-27 01:09:02,985 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding dependency ModuleDependency [identifier=com.fasterxml.jackson.core.jackson-annotations:2.8.9, moduleLoader=Service Module Loader, export=true, optional=false, importServices=false] to module deployment.sisgr_manut_usu_intra.ear:main
2026-07-27 01:09:02,985 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding dependency ModuleDependency [identifier=br.gov.caixa.sisgr.integracao.siset:main, moduleLoader=Service Module Loader, export=true, optional=false, importServices=false] to module deployment.sisgr_manut_usu_intra.ear:main
2026-07-27 01:09:02,985 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding dependency ModuleDependency [identifier=org.apache.log4j:main, moduleLoader=Service Module Loader, export=true, optional=false, importServices=false] to module deployment.sisgr_manut_usu_intra.ear:main
2026-07-27 01:09:02,985 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding dependency ModuleDependency [identifier=javax.xml.bind.api:main, moduleLoader=Service Module Loader, export=true, optional=false, importServices=false] to module deployment.sisgr_manut_usu_intra.ear:main
2026-07-27 01:09:02,985 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding dependency ModuleDependency [identifier=javax.api:main, moduleLoader=Service Module Loader, export=true, optional=false, importServices=false] to module deployment.sisgr_manut_usu_intra.ear:main
2026-07-27 01:09:02,986 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Creating module: deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 01:09:02,986 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 01:09:02,987 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/classes" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 01:09:02,987 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/commons-validator-1.3.1.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 01:09:02,987 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/commons-logging-1.0.4.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 01:09:02,987 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/displaytag-1.2.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 01:09:02,988 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/commons-chain-1.2.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 01:09:02,988 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/jstl-1.1.2.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 01:09:02,988 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/commons-digester-1.8.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 01:09:02,988 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/JFormatador-1.0.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 01:09:02,993 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/portal-1.1.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 01:09:02,996 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/seguranca-1.0.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 01:09:02,996 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/commons-lang-2.0.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 01:09:02,996 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/privado-1.2.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 01:09:02,999 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/struts-tiles-1.3.10.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 01:09:03,009 DEBUG [org.jboss.as.security] (MSC service thread 1-5) Cannot create permissions with 'null' metaData for id=DBConnect.ear
2026-07-27 01:09:03,009 DEBUG [org.jboss.modules] (MSC service thread 1-5) Module deployment.sisgr_manut_usu_intra.ear:main defined by Service Module Loader
2026-07-27 01:09:03,012 DEBUG [org.jboss.modules] (MSC service thread 1-5) Module com.fasterxml.jackson.core.jackson-databind:2.8.11 defined by local module loader @47d384ee (finder: local module finder @2d6a9952 (roots: /opt/open/jboss/7.0.0/modules,/opt/open/jboss/7.0.0/modules/system/layers/base))
2026-07-27 01:09:03,012 DEBUG [org.jboss.modules] (MSC service thread 1-5) Module com.fasterxml.jackson.core.jackson-core:2.8.11 defined by local module loader @47d384ee (finder: local module finder @2d6a9952 (roots: /opt/open/jboss/7.0.0/modules,/opt/open/jboss/7.0.0/modules/system/layers/base))
2026-07-27 01:09:03,013 DEBUG [org.jboss.modules] (MSC service thread 1-5) Module com.fasterxml.jackson.core.jackson-annotations:2.8.9 defined by local module loader @47d384ee (finder: local module finder @2d6a9952 (roots: /opt/open/jboss/7.0.0/modules,/opt/open/jboss/7.0.0/modules/system/layers/base))
2026-07-27 01:09:03,013 DEBUG [org.jboss.modules] (MSC service thread 1-5) Module br.gov.caixa.sisgr.integracao.siset:main defined by local module loader @47d384ee (finder: local module finder @2d6a9952 (roots: /opt/open/jboss/7.0.0/modules,/opt/open/jboss/7.0.0/modules/system/layers/base))
2026-07-27 01:09:03,014 DEBUG [org.jboss.modules] (MSC service thread 1-5) Module org.jboss.resteasy.resteasy-jaxrs:3.0.16 defined by local module loader @47d384ee (finder: local module finder @2d6a9952 (roots: /opt/open/jboss/7.0.0/modules,/opt/open/jboss/7.0.0/modules/system/layers/base))
2026-07-27 01:09:03,016 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-5) WFLYSRV0018: Deployment "deployment.sisgr_manut_usu_intra.ear" is using a private module ("br.gov.caixa.sisgr.cicsengine:main") which may be changed or removed in future versions without notice.
2026-07-27 01:09:03,016 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-5) WFLYSRV0018: Deployment "deployment.sisgr_manut_usu_intra.ear" is using a private module ("br.gov.caixa.sisgr.parametros:main") which may be changed or removed in future versions without notice.
2026-07-27 01:09:03,016 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-5) WFLYSRV0018: Deployment "deployment.sisgr_manut_usu_intra.ear" is using a private module ("org.apache.commons.codec:main") which may be changed or removed in future versions without notice.
2026-07-27 01:09:03,016 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-5) WFLYSRV0018: Deployment "deployment.sisgr_manut_usu_intra.ear" is using a private module ("org.apache.commons.collections:main") which may be changed or removed in future versions without notice.
2026-07-27 01:09:03,016 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-5) WFLYSRV0018: Deployment "deployment.sisgr_manut_usu_intra.ear" is using a private module ("org.apache.commons.beanutils:main") which may be changed or removed in future versions without notice.
2026-07-27 01:09:03,016 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-5) WFLYSRV0018: Deployment "deployment.sisgr_manut_usu_intra.ear" is using a private module ("br.gov.caixa.sisgr.integracao.siset:main") which may be changed or removed in future versions without notice.
2026-07-27 01:09:03,031 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/antlr-2.7.2.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 01:09:03,031 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/standard-1.0.6.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 01:09:03,032 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/struts-core-1.3.10.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 01:09:03,032 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/struts-1.3.10.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 01:09:03,080 DEBUG [org.jboss.as.logging] (MSC service thread 1-1) Logging profile 'sisgrauth-logger' found in 'ResourceRoot [root="/content/sisgrauth.ear/sisgrauth-web.war"]'.
2026-07-27 01:09:03,080 WARN  [org.jboss.as.logging] (MSC service thread 1-1) WFLYLOG0010: Logging profile 'sisgrauth-logger' was specified for deployment 'ResourceRoot [root="/content/sisgrauth.ear/sisgrauth-web.war"]' but was not found. Using system logging configuration.
2026-07-27 01:09:03,080 DEBUG [org.jboss.as.logging] (MSC service thread 1-1) Logging profile 'sisgrauth-logger' found in 'ResourceRoot [root="/content/sisgrauth.ear/sisgrauth-ejb.jar"]'.
2026-07-27 01:09:03,080 WARN  [org.jboss.as.logging] (MSC service thread 1-1) WFLYLOG0010: Logging profile 'sisgrauth-logger' was specified for deployment 'ResourceRoot [root="/content/sisgrauth.ear/sisgrauth-ejb.jar"]' but was not found. Using system logging configuration.
2026-07-27 01:09:03,080 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/oro-2.0.8.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 01:09:03,080 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/struts-taglib-1.3.10.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 01:09:03,084 DEBUG [org.jboss.as.logging] (MSC service thread 1-2) Logging profile 'sisgrprofile-logger' found in 'ResourceRoot [root="/content/sisgrprofile.ear/sisgrprofile-web.war"]'.
2026-07-27 01:09:03,084 WARN  [org.jboss.as.logging] (MSC service thread 1-2) WFLYLOG0010: Logging profile 'sisgrprofile-logger' was specified for deployment 'ResourceRoot [root="/content/sisgrprofile.ear/sisgrprofile-web.war"]' but was not found. Using system logging configuration.
2026-07-27 01:09:03,084 DEBUG [org.jboss.as.logging] (MSC service thread 1-2) Logging profile 'sisgrprofile-logger' found in 'ResourceRoot [root="/content/sisgrprofile.ear/sisgrprofile-ejb.jar"]'.
2026-07-27 01:09:03,084 WARN  [org.jboss.as.logging] (MSC service thread 1-2) WFLYLOG0010: Logging profile 'sisgrprofile-logger' was specified for deployment 'ResourceRoot [root="/content/sisgrprofile.ear/sisgrprofile-ejb.jar"]' but was not found. Using system logging configuration.
2026-07-27 01:09:03,084 DEBUG [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) Registering EJB client context org.jboss.ejb.client.EJBClientContext@599d51be for classloader ModuleClassLoader for Module "deployment.sisgrauth.ear:main" from Service Module Loader
2026-07-27 01:09:03,092 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/struts-extras-1.3.10.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 01:09:03,092 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/commons-beanutils-1.8.0.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 01:09:03,092 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding dependency ModuleDependency [identifier=javax.ejb.api:main, moduleLoader=local module loader @47d384ee (finder: local module finder @2d6a9952 (roots: /opt/open/jboss/7.0.0/modules,/opt/open/jboss/7.0.0/modules/system/layers/base)), export=false, optional=false, importServices=true] to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 01:09:03,092 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding dependency ModuleDependency [identifier=javax.xml.rpc.api:main, moduleLoader=local module loader @47d384ee (finder: local module finder @2d6a9952 (roots: /opt/open/jboss/7.0.0/modules,/opt/open/jboss/7.0.0/modules/system/layers/base)), export=false, optional=false, importServices=true] to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 01:09:03,092 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding dependency ModuleDependency [identifier=org.jboss.ejb-client:main, moduleLoader=local module loader @47d384ee (finder: local module finder @2d6a9952 (roots: /opt/open/jboss/7.0.0/modules,/opt/open/jboss/7.0.0/modules/system/layers/base)), export=false, optional=false, importServices=true] to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
--
        awt.toolkit = sun.awt.X11.XToolkit
        br.gov.caixa.acessoseguro.internet.url = https://acessoseguro.sso.tqs.intra.corerj.caixa
        br.gov.caixa.psc.connector.util.Config = /infra_app/config/sisgr/sisgr_jconnector.properties
        br.gov.caixa.siset.inter.url = https://logindes.caixa.gov.br
        br.gov.caixa.siset.role.enabled = true
        br.gov.caixa.siset.service.token.endpoint = /auth/realms/intranet/protocol/openid-connect/token
        br.gov.caixa.siset.service.unsetrole.endpoint = /servico/rest/unsetrole
        br.gov.caixa.siset.service.url = https://login.des.caixa
        br.gov.caixa.sisgr.acessoseguro.enableRecaptcha = false
        br.gov.caixa.sisgr.auditoria.redirect_uri = https://acessoseguro.sso.des.intra.corerj.caixa/auditoria/
        br.gov.caixa.sisgr.auditoria.tokenSecret = bc47dd0c-43cd-4d79-b3e0-079e3c5e95ac
        br.gov.caixa.sisgr.cadastrosenha.enableRecaptcha = false
        br.gov.caixa.sisgr.console.redirect.uri = https://acessoseguro.sso.des.intra.corerj.caixa/console-web
        br.gov.caixa.sisgr.console.tokenSecret = 79fd22a5-e739-4105-aa9a-5aec0d98170c
        br.gov.caixa.sisgr.db.alias = SGR
        br.gov.caixa.sisgr.gerenciadorcarga.redirect_uri = https://acessoseguro.sso.des.intra.corerj.caixa/gerenciadorcarga/
        br.gov.caixa.sisgr.gerenciadorcarga.tokenSecret = 546cbb4f-0040-4667-853b-730ac0ba5724
        br.gov.caixa.sisgr.inter.secret = 8c026412-1362-4aa4-b080-fe347cea5b69
        br.gov.caixa.sisgr.manutencaousuinterno.base_url = https://acessoseguro.sso.des.intra.corerj.caixa/intranet
        br.gov.caixa.sisgr.manutencaousuinterno.redirect_uri = https://acessoseguro.sso.des.intra.corerj.caixa/matrizacesso/
        br.gov.caixa.sisgr.matrizacesso.datasource = java:jboss/db2sgr
        br.gov.caixa.sisgr.matrizacesso.email.manutusu = false
        br.gov.caixa.sisgr.matrizacesso.normativo = http://sismn.caixa/sistema/asp/ConsultaPesquisa/pdf_comum.asp?id=NOR016039
        br.gov.caixa.sisgr.matrizacesso.redirectUri = https://acessoseguro.sso.des.intra.corerj.caixa/matrizacesso
        br.gov.caixa.sisgr.matrizacesso.schema = SGR
        br.gov.caixa.sisgr.matrizacesso.siset.internet.domain = https://logindes.caixa.gov.br/
        br.gov.caixa.sisgr.matrizacesso.siset.internet.id = cli-ser-sgr-batch
        br.gov.caixa.sisgr.matrizacesso.siset.internet.secret = 8c026412-1362-4aa4-b080-fe347cea5b69
        br.gov.caixa.sisgr.matrizacesso.siset.role.enabled = true
        br.gov.caixa.sisgr.matrizacesso.tokenSecret = 25a2ceca-adcb-4373-96c9-172d5b309d7e
        br.gov.caixa.sisgr.monitoramentousuexterno.base_url = https://acessoseguro.sso.des.intra.corerj.caixa/intranet
        br.gov.caixa.sisgr.monitoramentousuexterno.redirect_uri = https://acessoseguro.sso.des.intra.corerj.caixa/sisgr_monitoramento_usuario-sso
        br.gov.caixa.sisgr.monitoramentousuexterno.schema = SGR
        br.gov.caixa.sisgr.monitoramentousuexterno.tokenSecret = d45e2cb3-00f1-434f-aa51-79b9e61b82a9
        br.gov.caixa.sisgr.portal.enableRecaptcha = false
        br.gov.caixa.sisgr.portal.fgts.service.apikey = l73d1bf456826646088771218eb6db91f4
        br.gov.caixa.sisgr.portal.fgts.service.url = https://api.des.caixa:8443/fgts/trabalhador/v1/
        br.gov.caixa.sisgr.portal.service.token.sso.url = https://logindes.caixa.gov.br/auth/realms/internet/protocol/openid-connect/token
        br.gov.caixa.sisgr.properties = /infra_app/config/sisgr/sisgr.properties
        br.gov.caixa.sisgr.template = portal
        br.gov.caixa.sisgr.token.client.ivKey = C01X@.08.RCL$OS2
        br.gov.caixa.sisgr.token.client.key = Ct0k5n@%$9781XA~
        br.gov.caixa.sisgr.token.client.url = https://acessoseguro.sso.des.intra.corerj.caixa/
        caminho.arquivo.temp = /var/tmp
        ejb-ip = 10.116.94.88
        ejb-porta = :7401
        ejb-protocolo = remote://
        file.encoding = UTF-8
        file.encoding.pkg = sun.io
--
        user.language = en
        user.name = spjbodr2
        user.timezone = America/Sao_Paulo
2026-07-27 04:08:57,008 DEBUG [org.jboss.as.config] (MSC service thread 1-8) VM Arguments: -D[Server:srjdeapllx130_webservice_intra_5502] -Xms2048m -Xmx2048m -XX:+UseG1GC -Dbr.gov.caixa.acessoseguro.internet.url=https://acessoseguro.sso.tqs.intra.corerj.caixa -Dbr.gov.caixa.psc.connector.util.Config=/infra_app/config/sisgr/sisgr_jconnector.properties -Dbr.gov.caixa.siset.inter.url=https://logindes.caixa.gov.br -Dbr.gov.caixa.siset.role.enabled=true -Dbr.gov.caixa.siset.service.token.endpoint=/auth/realms/intranet/protocol/openid-connect/token -Dbr.gov.caixa.siset.service.unsetrole.endpoint=/servico/rest/unsetrole -Dbr.gov.caixa.siset.service.url=https://login.des.caixa -Dbr.gov.caixa.sisgr.acessoseguro.enableRecaptcha=false -Dbr.gov.caixa.sisgr.auditoria.redirect_uri=https://acessoseguro.sso.des.intra.corerj.caixa/auditoria/ -Dbr.gov.caixa.sisgr.auditoria.tokenSecret=bc47dd0c-43cd-4d79-b3e0-079e3c5e95ac -Dbr.gov.caixa.sisgr.cadastrosenha.enableRecaptcha=false -Dbr.gov.caixa.sisgr.console.redirect.uri=https://acessoseguro.sso.des.intra.corerj.caixa/console-web -Dbr.gov.caixa.sisgr.console.tokenSecret=79fd22a5-e739-4105-aa9a-5aec0d98170c -Dbr.gov.caixa.sisgr.db.alias=SGR -Dbr.gov.caixa.sisgr.gerenciadorcarga.redirect_uri=https://acessoseguro.sso.des.intra.corerj.caixa/gerenciadorcarga/ -Dbr.gov.caixa.sisgr.gerenciadorcarga.tokenSecret=546cbb4f-0040-4667-853b-730ac0ba5724 -Dbr.gov.caixa.sisgr.inter.secret=8c026412-1362-4aa4-b080-fe347cea5b69 -Dbr.gov.caixa.sisgr.manutencaousuinterno.base_url=https://acessoseguro.sso.des.intra.corerj.caixa/intranet -Dbr.gov.caixa.sisgr.manutencaousuinterno.redirect_uri=https://acessoseguro.sso.des.intra.corerj.caixa/matrizacesso/ -Dbr.gov.caixa.sisgr.matrizacesso.datasource=java:jboss/db2sgr -Dbr.gov.caixa.sisgr.matrizacesso.email.manutusu=false -Dbr.gov.caixa.sisgr.matrizacesso.normativo=http://sismn.caixa/sistema/asp/ConsultaPesquisa/pdf_comum.asp?id=NOR016039 -Dbr.gov.caixa.sisgr.matrizacesso.redirectUri=https://acessoseguro.sso.des.intra.corerj.caixa/matrizacesso -Dbr.gov.caixa.sisgr.matrizacesso.schema=SGR -Dbr.gov.caixa.sisgr.matrizacesso.siset.internet.domain=https://logindes.caixa.gov.br/ -Dbr.gov.caixa.sisgr.matrizacesso.siset.internet.id=cli-ser-sgr-batch -Dbr.gov.caixa.sisgr.matrizacesso.siset.internet.secret=8c026412-1362-4aa4-b080-fe347cea5b69 -Dbr.gov.caixa.sisgr.matrizacesso.siset.role.enabled=true -Dbr.gov.caixa.sisgr.matrizacesso.tokenSecret=25a2ceca-adcb-4373-96c9-172d5b309d7e -Dbr.gov.caixa.sisgr.monitoramentousuexterno.base_url=https://acessoseguro.sso.des.intra.corerj.caixa/intranet -Dbr.gov.caixa.sisgr.monitoramentousuexterno.redirect_uri=https://acessoseguro.sso.des.intra.corerj.caixa/sisgr_monitoramento_usuario-sso -Dbr.gov.caixa.sisgr.monitoramentousuexterno.schema=SGR -Dbr.gov.caixa.sisgr.monitoramentousuexterno.tokenSecret=d45e2cb3-00f1-434f-aa51-79b9e61b82a9 -Dbr.gov.caixa.sisgr.portal.enableRecaptcha=false -Dbr.gov.caixa.sisgr.portal.fgts.service.apikey=l73d1bf456826646088771218eb6db91f4 -Dbr.gov.caixa.sisgr.portal.fgts.service.url=https://api.des.caixa:8443/fgts/trabalhador/v1/ -Dbr.gov.caixa.sisgr.portal.service.token.sso.url=https://logindes.caixa.gov.br/auth/realms/internet/protocol/openid-connect/token -Dbr.gov.caixa.sisgr.properties=/infra_app/config/sisgr/sisgr.properties -Dbr.gov.caixa.sisgr.template=portal -Dbr.gov.caixa.sisgr.token.client.ivKey=C01X@.08.RCL$OS2 -Dbr.gov.caixa.sisgr.token.client.key=Ct0k5n@%$9781XA~ -Dbr.gov.caixa.sisgr.token.client.url=https://acessoseguro.sso.des.intra.corerj.caixa/ -Dcaminho.arquivo.temp=/var/tmp -Dejb-ip=10.116.94.88 -Dejb-porta=:7401 -Dejb-protocolo=remote:// -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djavax.net.ssl.trustStore=/infra_app/config/certificados/cacerts -Djavax.net.ssl.trustStorePassword=changeit -Djavax.net.ssl.trustStoreType=jks -Djboss.as.management.blocking.timeout=1800 -Djboss.bind.address=srjdeapllx130 -Djboss.bind.address.management=srjdeapllx130 -Djboss.home.dir=/opt/open/jboss/7.0.0 -Djboss.management.http.port=9990 -Djboss.management.native.port=9999 -Djboss.modules.system.pkgs=org.jboss.byteman -Dmq.broker.usr=JDIRSGRD -Dmq.channel=SISGR.SVRCONN -Dmq.name=RJDA -Dmq.port=1420 -Dmq.server=10.116.105.35 -Dsisgr.grp.usr=SGRCERTD -Djboss.server.log.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_webservice_intra_5502/log -Djboss.server.temp.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_webservice_intra_5502/tmp -Djboss.server.data.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_webservice_intra_5502/data -Dlogging.configuration=file:/opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_webservice_intra_5502/data/logging.properties
2026-07-27 04:08:57,034 DEBUG [org.jboss.as] (MSC service thread 1-8) Using VaultReader org.jboss.as.server.services.security.RuntimeVaultReader@168a88a7
2026-07-27 04:08:57,037 DEBUG [org.jboss.modules] (MSC service thread 1-8) Module org.jboss.as.security:main defined by local module loader @47d384ee (finder: local module finder @2d6a9952 (roots: /opt/open/jboss/7.0.0/modules,/opt/open/jboss/7.0.0/modules/system/layers/base))
2026-07-27 04:08:57,038 DEBUG [org.jboss.modules] (MSC service thread 1-8) Module org.jboss.as.threads:main defined by local module loader @47d384ee (finder: local module finder @2d6a9952 (roots: /opt/open/jboss/7.0.0/modules,/opt/open/jboss/7.0.0/modules/system/layers/base))
2026-07-27 04:08:57,039 DEBUG [org.jboss.modules] (MSC service thread 1-8) Module org.wildfly.extension.io:main defined by local module loader @47d384ee (finder: local module finder @2d6a9952 (roots: /opt/open/jboss/7.0.0/modules,/opt/open/jboss/7.0.0/modules/system/layers/base))
2026-07-27 04:08:57,042 DEBUG [org.jboss.modules] (MSC service thread 1-8) Module org.jboss.xnio.nio:main defined by local module loader @47d384ee (finder: local module finder @2d6a9952 (roots: /opt/open/jboss/7.0.0/modules,/opt/open/jboss/7.0.0/modules/system/layers/base))
2026-07-27 04:08:57,060 DEBUG [org.jboss.as] (MSC service thread 1-8) JBoss EAP 7.0.0.GA (WildFly Core 2.1.2.Final-redhat-1) root service started in 67582768705.438201 ms
2026-07-27 04:08:57,074 INFO  [org.xnio] (MSC service thread 1-8) XNIO version 3.3.6.Final-redhat-1
2026-07-27 04:08:57,077 DEBUG [org.jboss.as.server] (MSC service thread 1-3) DeploymentMountProvider started
2026-07-27 04:08:57,083 INFO  [org.xnio.nio] (MSC service thread 1-8) XNIO NIO Implementation Version 3.3.6.Final-redhat-1
2026-07-27 04:08:57,101 DEBUG [org.xnio.nio] (management I/O-1) Started channel thread 'management I/O-1', selector sun.nio.ch.EPollSelectorImpl@14287841
2026-07-27 04:08:57,112 DEBUG [org.xnio.nio] (management I/O-2) Started channel thread 'management I/O-2', selector sun.nio.ch.EPollSelectorImpl@624d2751
2026-07-27 04:08:57,118 INFO  [org.jboss.remoting] (MSC service thread 1-8) JBoss Remoting version 4.0.18.Final-redhat-1
2026-07-27 04:08:57,124 DEBUG [org.xnio.nio] (management Accept) Started channel thread 'management Accept', selector sun.nio.ch.EPollSelectorImpl@181376ea
2026-07-27 04:08:57,750 DEBUG [org.jboss.modules] (ServerService Thread Pool -- 2) Module org.jboss.as.clustering.infinispan:main defined by local module loader @47d384ee (finder: local module finder @2d6a9952 (roots: /opt/open/jboss/7.0.0/modules,/opt/open/jboss/7.0.0/modules/system/layers/base))
2026-07-27 04:08:57,751 DEBUG [org.jboss.modules] (ServerService Thread Pool -- 2) Module javax.transaction.api:main defined by local module loader @47d384ee (finder: local module finder @2d6a9952 (roots: /opt/open/jboss/7.0.0/modules,/opt/open/jboss/7.0.0/modules/system/layers/base))
2026-07-27 04:08:57,751 DEBUG [org.jboss.modules] (ServerService Thread Pool -- 2) Module net.jcip:main defined by local module loader @47d384ee (finder: local module finder @2d6a9952 (roots: /opt/open/jboss/7.0.0/modules,/opt/open/jboss/7.0.0/modules/system/layers/base))
2026-07-27 04:08:57,754 DEBUG [org.jboss.modules] (ServerService Thread Pool -- 2) Module org.infinispan:main defined by local module loader @47d384ee (finder: local module finder @2d6a9952 (roots: /opt/open/jboss/7.0.0/modules,/opt/open/jboss/7.0.0/modules/system/layers/base))
2026-07-27 04:08:57,754 DEBUG [org.jboss.modules] (ServerService Thread Pool -- 2) Module org.infinispan.cachestore.jdbc:main defined by local module loader @47d384ee (finder: local module finder @2d6a9952 (roots: /opt/open/jboss/7.0.0/modules,/opt/open/jboss/7.0.0/modules/system/layers/base))
2026-07-27 04:08:57,755 DEBUG [org.jboss.modules] (ServerService Thread Pool -- 2) Module org.infinispan.cachestore.remote:main defined by local module loader @47d384ee (finder: local module finder @2d6a9952 (roots: /opt/open/jboss/7.0.0/modules,/opt/open/jboss/7.0.0/modules/system/layers/base))
2026-07-27 04:08:57,755 DEBUG [org.jboss.modules] (ServerService Thread Pool -- 2) Module org.infinispan.client.hotrod:main defined by local module loader @47d384ee (finder: local module finder @2d6a9952 (roots: /opt/open/jboss/7.0.0/modules,/opt/open/jboss/7.0.0/modules/system/layers/base))
--
2026-07-27 04:09:04,941 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding dependency ModuleDependency [identifier=com.fasterxml.jackson.core.jackson-databind:2.8.11, moduleLoader=Service Module Loader, export=true, optional=false, importServices=false] to module deployment.sisgr_manut_usu_intra.ear:main
2026-07-27 04:09:04,941 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding dependency ModuleDependency [identifier=com.fasterxml.jackson.core.jackson-core:2.8.11, moduleLoader=Service Module Loader, export=true, optional=false, importServices=false] to module deployment.sisgr_manut_usu_intra.ear:main
2026-07-27 04:09:04,941 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding dependency ModuleDependency [identifier=com.fasterxml.jackson.core.jackson-annotations:2.8.9, moduleLoader=Service Module Loader, export=true, optional=false, importServices=false] to module deployment.sisgr_manut_usu_intra.ear:main
2026-07-27 04:09:04,941 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding dependency ModuleDependency [identifier=br.gov.caixa.sisgr.integracao.siset:main, moduleLoader=Service Module Loader, export=true, optional=false, importServices=false] to module deployment.sisgr_manut_usu_intra.ear:main
2026-07-27 04:09:04,941 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding dependency ModuleDependency [identifier=org.apache.log4j:main, moduleLoader=Service Module Loader, export=true, optional=false, importServices=false] to module deployment.sisgr_manut_usu_intra.ear:main
2026-07-27 04:09:04,941 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding dependency ModuleDependency [identifier=javax.xml.bind.api:main, moduleLoader=Service Module Loader, export=true, optional=false, importServices=false] to module deployment.sisgr_manut_usu_intra.ear:main
2026-07-27 04:09:04,941 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding dependency ModuleDependency [identifier=javax.api:main, moduleLoader=Service Module Loader, export=true, optional=false, importServices=false] to module deployment.sisgr_manut_usu_intra.ear:main
2026-07-27 04:09:04,942 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Creating module: deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 04:09:04,942 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 04:09:04,942 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/classes" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 04:09:04,942 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/commons-validator-1.3.1.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 04:09:04,942 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/commons-logging-1.0.4.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 04:09:04,943 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/displaytag-1.2.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 04:09:04,943 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/commons-chain-1.2.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 04:09:04,943 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/jstl-1.1.2.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 04:09:04,943 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/commons-digester-1.8.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 04:09:04,943 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/JFormatador-1.0.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 04:09:04,943 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/portal-1.1.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 04:09:04,943 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/seguranca-1.0.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 04:09:04,943 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/commons-lang-2.0.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 04:09:04,943 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/privado-1.2.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 04:09:04,943 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/struts-tiles-1.3.10.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 04:09:04,943 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/antlr-2.7.2.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
2026-07-27 04:09:04,943 DEBUG [org.jboss.as.server.deployment] (MSC service thread 1-8) Adding resource "/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war/WEB-INF/lib/standard-1.0.6.jar" to module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main
--
2026-07-27 04:09:04,950 DEBUG [org.jboss.modules] (MSC service thread 1-8) Module com.fasterxml.jackson.core.jackson-annotations:2.8.9 defined by local module loader @47d384ee (finder: local module finder @2d6a9952 (roots: /opt/open/jboss/7.0.0/modules,/opt/open/jboss/7.0.0/modules/system/layers/base))
2026-07-27 04:09:04,968 DEBUG [org.jboss.modules] (MSC service thread 1-1) Module deployment.sisgr_manut_usu_intra.ear.sisgr_manut_usu_intra-web.war:main defined by Service Module Loader
2026-07-27 04:09:04,977 DEBUG [org.jboss.as.ee] (MSC service thread 1-5) Configuring component class: javax.servlet.jsp.jstl.tlv.PermittedTaglibsTLV named javax.servlet.jsp.jstl.tlv.PermittedTaglibsTLV
2026-07-27 04:09:04,982 DEBUG [org.jboss.modules] (MSC service thread 1-8) Module br.gov.caixa.sisgr.integracao.siset:main defined by local module loader @47d384ee (finder: local module finder @2d6a9952 (roots: /opt/open/jboss/7.0.0/modules,/opt/open/jboss/7.0.0/modules/system/layers/base))
2026-07-27 04:09:04,983 DEBUG [org.jboss.modules] (MSC service thread 1-8) Module org.jboss.resteasy.resteasy-jaxrs:3.0.16 defined by local module loader @47d384ee (finder: local module finder @2d6a9952 (roots: /opt/open/jboss/7.0.0/modules,/opt/open/jboss/7.0.0/modules/system/layers/base))
2026-07-27 04:09:04,986 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-8) WFLYSRV0018: Deployment "deployment.sisgr_manut_usu_intra.ear" is using a private module ("br.gov.caixa.sisgr.cicsengine:main") which may be changed or removed in future versions without notice.
2026-07-27 04:09:04,986 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-8) WFLYSRV0018: Deployment "deployment.sisgr_manut_usu_intra.ear" is using a private module ("br.gov.caixa.sisgr.parametros:main") which may be changed or removed in future versions without notice.
2026-07-27 04:09:04,986 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-8) WFLYSRV0018: Deployment "deployment.sisgr_manut_usu_intra.ear" is using a private module ("org.apache.commons.codec:main") which may be changed or removed in future versions without notice.
2026-07-27 04:09:04,986 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-8) WFLYSRV0018: Deployment "deployment.sisgr_manut_usu_intra.ear" is using a private module ("org.apache.commons.collections:main") which may be changed or removed in future versions without notice.
2026-07-27 04:09:04,986 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-8) WFLYSRV0018: Deployment "deployment.sisgr_manut_usu_intra.ear" is using a private module ("org.apache.commons.beanutils:main") which may be changed or removed in future versions without notice.
2026-07-27 04:09:04,987 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-8) WFLYSRV0018: Deployment "deployment.sisgr_manut_usu_intra.ear" is using a private module ("br.gov.caixa.sisgr.integracao.siset:main") which may be changed or removed in future versions without notice.
2026-07-27 04:09:05,000 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0003: Could not index class module-info.class at /content/sisgrservicos.ear/sisgrservicos-web.war/WEB-INF/lib/jackson-databind-2.11.0.jar: java.lang.IllegalStateException: Unknown tag! pos=3 poolCount = 68
        at org.jboss.jandex.Indexer.processConstantPool(Indexer.java:1416)
        at org.jboss.jandex.Indexer.index(Indexer.java:1450)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:147)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1948)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.run(ServiceControllerImpl.java:1881)
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
        at java.lang.Thread.run(Thread.java:745)

2026-07-27 04:09:05,012 DEBUG [org.jboss.as.ee] (MSC service thread 1-5) Configuring component class: br.gov.caixa.ConnectServlet named br.gov.caixa.ConnectServlet
2026-07-27 04:09:05,013 DEBUG [org.jboss.as.ee] (MSC service thread 1-5) Configuring component class: javax.servlet.jsp.jstl.tlv.ScriptFreeTLV named javax.servlet.jsp.jstl.tlv.ScriptFreeTLV
2026-07-27 04:09:05,013 DEBUG [org.jboss.as.ee] (MSC service thread 1-5) Configuring component class: javax.faces.webapp.FacetTag named javax.faces.webapp.FacetTag
2026-07-27 04:09:05,013 DEBUG [org.jboss.as.ee] (MSC service thread 1-5) Configuring component class: com.sun.faces.config.ConfigureListener named com.sun.faces.config.ConfigureListener
2026-07-27 04:09:05,013 DEBUG [org.jboss.as.ee] (MSC service thread 1-5) Configuring component class: br.gov.caixa.Versao_JDBC named br.gov.caixa.Versao_JDBC
2026-07-27 04:09:05,103 DEBUG [org.jboss.as.logging] (MSC service thread 1-5) Logging profile 'sisgr_manut_usu_intra-logger' found in 'ResourceRoot [root="/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war"]'.
2026-07-27 04:09:05,104 WARN  [org.jboss.as.logging] (MSC service thread 1-5) WFLYLOG0010: Logging profile 'sisgr_manut_usu_intra-logger' was specified for deployment 'ResourceRoot [root="/content/sisgr_manut_usu_intra.ear/sisgr_manut_usu_intra-web.war"]' but was not found. Using system logging configuration.
2026-07-27 04:09:05,122 DEBUG [org.jboss.security] (MSC service thread 1-8) PBOX00307: Constructing JBossPolicyConfiguration with contextID DBConnect.ear
[p585600@srjdeapllx130 ~]$
