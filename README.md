
-sh-4.2$
-sh-4.2$ oc logs sifof-api-aplicacao-tqs-64-57874 -c secrets-agent-sidecar -n sifof-tqs --previous
Error from server (BadRequest): previous terminated container "secrets-agent-sidecar" in pod "sifof-api-aplicacao-tqs-64-57874" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$




log do pod antigo que esta rodando: 


2026-07-15 17:40:01,454 DEBUG [io.quarkus.oidc.runtime.OidcAuthenticationMechanism] (vert.x-eventloop-thread-1) Resolved OIDC tenant id: Default
2026-07-15 17:40:01,454 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Starting a bearer access token authentication
2026-07-15 17:40:01,454 DEBUG [io.quarkus.oidc.runtime.OidcUtils] (vert.x-eventloop-thread-1) Looking for a token in the authorization header
2026-07-15 17:40:01,454 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-07-15 17:40:01,454 DEBUG [io.quarkus.oidc.runtime.OidcAuthenticationMechanism] (vert.x-eventloop-thread-0) Resolved OIDC tenant id: Default
2026-07-15 17:40:01,454 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Starting a bearer access token authentication
2026-07-15 17:40:01,454 DEBUG [io.quarkus.oidc.runtime.OidcUtils] (vert.x-eventloop-thread-0) Looking for a token in the authorization header
2026-07-15 17:40:01,454 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-07-15 17:40:11,454 DEBUG [io.quarkus.oidc.runtime.OidcAuthenticationMechanism] (vert.x-eventloop-thread-1) Resolved OIDC tenant id: Default
2026-07-15 17:40:11,454 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Starting a bearer access token authentication
2026-07-15 17:40:11,454 DEBUG [io.quarkus.oidc.runtime.OidcUtils] (vert.x-eventloop-thread-1) Looking for a token in the authorization header
2026-07-15 17:40:11,454 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-07-15 17:40:11,454 DEBUG [io.quarkus.oidc.runtime.OidcAuthenticationMechanism] (vert.x-eventloop-thread-0) Resolved OIDC tenant id: Default
2026-07-15 17:40:11,454 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Starting a bearer access token authentication
2026-07-15 17:40:11,454 DEBUG [io.quarkus.oidc.runtime.OidcUtils] (vert.x-eventloop-thread-0) Looking for a token in the authorization header
2026-07-15 17:40:11,454 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-07-15 17:40:21,453 DEBUG [io.quarkus.oidc.runtime.OidcAuthenticationMechanism] (vert.x-eventloop-thread-0) Resolved OIDC tenant id: Default
2026-07-15 17:40:21,453 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Starting a bearer access token authentication
2026-07-15 17:40:21,453 DEBUG [io.quarkus.oidc.runtime.OidcUtils] (vert.x-eventloop-thread-0) Looking for a token in the authorization header
2026-07-15 17:40:21,453 DEBUG [io.quarkus.oidc.runtime.OidcAuthenticationMechanism] (vert.x-eventloop-thread-1) Resolved OIDC tenant id: Default
2026-07-15 17:40:21,453 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Starting a bearer access token authentication
2026-07-15 17:40:21,453 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-07-15 17:40:21,453 DEBUG [io.quarkus.oidc.runtime.OidcUtils] (vert.x-eventloop-thread-1) Looking for a token in the authorization header
2026-07-15 17:40:21,453 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-07-15 17:40:22,162 DEBUG [io.netty.buffer.PoolThreadCache] (executor-thread-310) Freed 16 thread-local buffer(s) from thread: executor-thread-310
2026-07-15 17:40:22,245 DEBUG [io.netty.buffer.PoolThreadCache] (executor-thread-315) Freed 1 thread-local buffer(s) from thread: executor-thread-315
2026-07-15 17:40:22,273 DEBUG [io.netty.buffer.PoolThreadCache] (executor-thread-316) Freed 7 thread-local buffer(s) from thread: executor-thread-316
2026-07-15 17:40:31,453 DEBUG [io.quarkus.oidc.runtime.OidcAuthenticationMechanism] (vert.x-eventloop-thread-1) Resolved OIDC tenant id: Default
2026-07-15 17:40:31,453 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Starting a bearer access token authentication
2026-07-15 17:40:31,453 DEBUG [io.quarkus.oidc.runtime.OidcAuthenticationMechanism] (vert.x-eventloop-thread-0) Resolved OIDC tenant id: Default
2026-07-15 17:40:31,453 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Starting a bearer access token authentication
2026-07-15 17:40:31,453 DEBUG [io.quarkus.oidc.runtime.OidcUtils] (vert.x-eventloop-thread-1) Looking for a token in the authorization header
2026-07-15 17:40:31,453 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-07-15 17:40:31,453 DEBUG [io.quarkus.oidc.runtime.OidcUtils] (vert.x-eventloop-thread-0) Looking for a token in the authorization header
2026-07-15 17:40:31,453 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-07-15 17:40:41,453 DEBUG [io.quarkus.oidc.runtime.OidcAuthenticationMechanism] (vert.x-eventloop-thread-0) Resolved OIDC tenant id: Default
2026-07-15 17:40:41,453 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Starting a bearer access token authentication
2026-07-15 17:40:41,453 DEBUG [io.quarkus.oidc.runtime.OidcAuthenticationMechanism] (vert.x-eventloop-thread-1) Resolved OIDC tenant id: Default
2026-07-15 17:40:41,453 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Starting a bearer access token authentication
2026-07-15 17:40:41,453 DEBUG [io.quarkus.oidc.runtime.OidcUtils] (vert.x-eventloop-thread-0) Looking for a token in the authorization header
2026-07-15 17:40:41,453 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-07-15 17:40:41,453 DEBUG [io.quarkus.oidc.runtime.OidcUtils] (vert.x-eventloop-thread-1) Looking for a token in the authorization header
2026-07-15 17:40:41,453 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-07-15 17:40:51,453 DEBUG [io.quarkus.oidc.runtime.OidcAuthenticationMechanism] (vert.x-eventloop-thread-0) Resolved OIDC tenant id: Default
2026-07-15 17:40:51,453 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Starting a bearer access token authentication
2026-07-15 17:40:51,453 DEBUG [io.quarkus.oidc.runtime.OidcAuthenticationMechanism] (vert.x-eventloop-thread-1) Resolved OIDC tenant id: Default
2026-07-15 17:40:51,453 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Starting a bearer access token authentication
2026-07-15 17:40:51,453 DEBUG [io.quarkus.oidc.runtime.OidcUtils] (vert.x-eventloop-thread-1) Looking for a token in the authorization header
2026-07-15 17:40:51,453 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-07-15 17:40:51,453 DEBUG [io.quarkus.oidc.runtime.OidcUtils] (vert.x-eventloop-thread-0) Looking for a token in the authorization header
2026-07-15 17:40:51,453 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-07-15 17:41:01,453 DEBUG [io.quarkus.oidc.runtime.OidcAuthenticationMechanism] (vert.x-eventloop-thread-0) Resolved OIDC tenant id: Default
2026-07-15 17:41:01,453 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Starting a bearer access token authentication
2026-07-15 17:41:01,453 DEBUG [io.quarkus.oidc.runtime.OidcAuthenticationMechanism] (vert.x-eventloop-thread-1) Resolved OIDC tenant id: Default
2026-07-15 17:41:01,453 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Starting a bearer access token authentication
2026-07-15 17:41:01,453 DEBUG [io.quarkus.oidc.runtime.OidcUtils] (vert.x-eventloop-thread-0) Looking for a token in the authorization header
2026-07-15 17:41:01,453 DEBUG [io.quarkus.oidc.runtime.OidcUtils] (vert.x-eventloop-thread-1) Looking for a token in the authorization header
2026-07-15 17:41:01,453 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-07-15 17:41:01,453 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-07-15 17:41:11,453 DEBUG [io.quarkus.oidc.runtime.OidcAuthenticationMechanism] (vert.x-eventloop-thread-1) Resolved OIDC tenant id: Default
2026-07-15 17:41:11,453 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Starting a bearer access token authentication
2026-07-15 17:41:11,453 DEBUG [io.quarkus.oidc.runtime.OidcUtils] (vert.x-eventloop-thread-1) Looking for a token in the authorization header
2026-07-15 17:41:11,453 DEBUG [io.quarkus.oidc.runtime.OidcAuthenticationMechanism] (vert.x-eventloop-thread-0) Resolved OIDC tenant id: Default
2026-07-15 17:41:11,453 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-07-15 17:41:11,453 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Starting a bearer access token authentication
2026-07-15 17:41:11,453 DEBUG [io.quarkus.oidc.runtime.OidcUtils] (vert.x-eventloop-thread-0) Looking for a token in the authorization header
2026-07-15 17:41:11,453 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-07-15 17:41:14,587 DEBUG [br.gov.caixa.investimentos.sifof.api.security.CustomTenantResolver] (vert.x-eventloop-thread-0) [SECURITY] :: UrlIssuer presente no token = [https://login.des.caixa/auth/realms/intranet]
2026-07-15 17:41:14,587 DEBUG [br.gov.caixa.investimentos.sifof.api.security.CustomTenantResolver] (vert.x-eventloop-thread-0) [SECURITY] :: Propriedade que mapeia o AuthServerUrl (https://login.des.caixa/auth/realms/intranet) presente no token: [quarkus.oidc.auth-server-url]
2026-07-15 17:41:14,587 DEBUG [br.gov.caixa.investimentos.sifof.api.security.CustomTenantResolver] (vert.x-eventloop-thread-0) [SECURITY] :: Alias AuthServerUrl=[null]
2026-07-15 17:41:14,587 DEBUG [io.quarkus.oidc.runtime.OidcAuthenticationMechanism] (vert.x-eventloop-thread-0) Resolved OIDC tenant id: Default
2026-07-15 17:41:14,587 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Starting a bearer access token authentication
2026-07-15 17:41:14,587 DEBUG [io.quarkus.oidc.runtime.OidcUtils] (vert.x-eventloop-thread-0) Looking for a token in the authorization header
2026-07-15 17:41:14,587 DEBUG [io.quarkus.oidc.runtime.OidcUtils] (vert.x-eventloop-thread-0) Authorization scheme: Bearer
2026-07-15 17:41:14,587 DEBUG [io.quarkus.oidc.runtime.OidcIdentityProvider] (vert.x-eventloop-thread-0) Starting creating SecurityIdentity
2026-07-15 17:41:14,587 DEBUG [io.quarkus.oidc.runtime.OidcIdentityProvider] (vert.x-eventloop-thread-0) Verifying the JWT token with the local JWK keys
2026-07-15 17:41:14,588 DEBUG [br.gov.caixa.investimentos.sifof.api.security.CustomTenantResolver] (vert.x-eventloop-thread-1) [SECURITY] :: UrlIssuer presente no token = [https://login.des.caixa/auth/realms/intranet]
2026-07-15 17:41:14,588 DEBUG [br.gov.caixa.investimentos.sifof.api.security.CustomTenantResolver] (vert.x-eventloop-thread-1) [SECURITY] :: Propriedade que mapeia o AuthServerUrl (https://login.des.caixa/auth/realms/intranet) presente no token: [quarkus.oidc.auth-server-url]
2026-07-15 17:41:14,588 DEBUG [br.gov.caixa.investimentos.sifof.api.security.CustomTenantResolver] (vert.x-eventloop-thread-1) [SECURITY] :: Alias AuthServerUrl=[null]
2026-07-15 17:41:14,588 DEBUG [io.quarkus.oidc.runtime.OidcAuthenticationMechanism] (vert.x-eventloop-thread-1) Resolved OIDC tenant id: Default
2026-07-15 17:41:14,588 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Starting a bearer access token authentication
2026-07-15 17:41:14,588 DEBUG [io.quarkus.oidc.runtime.OidcUtils] (vert.x-eventloop-thread-1) Looking for a token in the authorization header
2026-07-15 17:41:14,588 DEBUG [io.quarkus.oidc.runtime.OidcUtils] (vert.x-eventloop-thread-1) Authorization scheme: Bearer
2026-07-15 17:41:14,588 DEBUG [io.quarkus.oidc.runtime.OidcIdentityProvider] (vert.x-eventloop-thread-1) Starting creating SecurityIdentity
2026-07-15 17:41:14,588 DEBUG [io.quarkus.oidc.runtime.OidcIdentityProvider] (vert.x-eventloop-thread-1) Verifying the JWT token with the local JWK keys
2026-07-15 17:41:14,588 DEBUG [br.gov.caixa.investimentos.sifof.api.security.CustomTenantResolver] (vert.x-eventloop-thread-1) [SECURITY] :: UrlIssuer presente no token = [https://login.des.caixa/auth/realms/intranet]
2026-07-15 17:41:14,588 DEBUG [br.gov.caixa.investimentos.sifof.api.security.CustomTenantResolver] (vert.x-eventloop-thread-1) [SECURITY] :: Propriedade que mapeia o AuthServerUrl (https://login.des.caixa/auth/realms/intranet) presente no token: [quarkus.oidc.auth-server-url]
2026-07-15 17:41:14,588 DEBUG [br.gov.caixa.investimentos.sifof.api.security.CustomTenantResolver] (vert.x-eventloop-thread-1) [SECURITY] :: Alias AuthServerUrl=[null]
2026-07-15 17:41:14,588 DEBUG [io.quarkus.oidc.runtime.OidcAuthenticationMechanism] (vert.x-eventloop-thread-1) Resolved OIDC tenant id: Default
2026-07-15 17:41:14,588 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Starting a bearer access token authentication
2026-07-15 17:41:14,588 DEBUG [io.quarkus.oidc.runtime.OidcUtils] (vert.x-eventloop-thread-1) Looking for a token in the authorization header
2026-07-15 17:41:14,588 DEBUG [io.quarkus.oidc.runtime.OidcUtils] (vert.x-eventloop-thread-1) Authorization scheme: Bearer
2026-07-15 17:41:14,588 DEBUG [io.quarkus.oidc.runtime.OidcIdentityProvider] (vert.x-eventloop-thread-1) Starting creating SecurityIdentity
2026-07-15 17:41:14,588 DEBUG [io.quarkus.oidc.runtime.OidcIdentityProvider] (vert.x-eventloop-thread-1) Verifying the JWT token with the local JWK keys
2026-07-15 17:41:14,589 DEBUG [org.hibernate.orm.core] (executor-thread-317) HHH006588: Opening session [tenant=null]
2026-07-15 17:41:14,589 DEBUG [org.hibernate.orm.resource.jdbc] (executor-thread-317) HHH10003030: 'hibernate.connection.provider_disables_autocommit' was enabled. This setting should only be enabled when JDBC Connections obtained by Hibernate from the ConnectionProvider have auto-commit disabled. Enabling this setting when connections have auto-commit enabled leads to execution of SQL operations outside of any JDBC transaction.
2026-07-15 17:41:14,589 DEBUG [org.hibernate.SQL] (executor-thread-317) select fie1_0.NU_FUNDO_INVESTIMENTO,fie1_0.NU_CATEGORIA_FNDO_INVESTIMENTO,fie1_0.CO_CNPJ_CSTDE_FUNDO_INVSO,fie1_0.CO_CNPJ_FUNDO_INVESTIMENTO,fie1_0.CO_INTERNACIONAL_FUNDO,fie1_0.IC_CTRIO_CONVERSAO_APLICACAO,fie1_0.IC_CRITERIO_CONVERSAO_RESGATE,fie1_0.IC_CTRIO_LIQUIDACAO_APLICACAO,fie1_0.IC_CRITERIO_LIQUIDACAO_RESGATE,fie1_0.HH_FECHAMENTO_FUNDO,fie1_0.IC_SITUACAO_FUNDO_INVESTIMENTO,fie1_0.NO_FUNDO_INVESTIMENTO,fie1_0.QT_DIA_CONVERSAO_APLICACAO,fie1_0.QT_DIA_CONVERSAO_RESGATE,fie1_0.QT_DIA_LIQUIDACAO_APLICACAO,fie1_0.QT_DIA_LIQUIDACAO_RESGATE from FOFTB005_FUNDO_INVESTIMENTO fie1_0 where fie1_0.NU_FUNDO_INVESTIMENTO=? fetch first ? rows only
2026-07-15 17:41:14,589 DEBUG [org.hibernate.orm.jdbc] (executor-thread-317) HHH100125: Low JDBC fetch size: 10 (consider setting 'hibernate.jdbc.fetch_size')
2026-07-15 17:41:14,589 DEBUG [br.gov.caixa.investimentos.sifof.api.security.CustomTenantResolver] (vert.x-eventloop-thread-0) [SECURITY] :: UrlIssuer presente no token = [https://login.des.caixa/auth/realms/intranet]
2026-07-15 17:41:14,589 DEBUG [br.gov.caixa.investimentos.sifof.api.security.CustomTenantResolver] (vert.x-eventloop-thread-0) [SECURITY] :: Propriedade que mapeia o AuthServerUrl (https://login.des.caixa/auth/realms/intranet) presente no token: [quarkus.oidc.auth-server-url]
2026-07-15 17:41:14,589 DEBUG [br.gov.caixa.investimentos.sifof.api.security.CustomTenantResolver] (vert.x-eventloop-thread-0) [SECURITY] :: Alias AuthServerUrl=[null]
2026-07-15 17:41:14,589 DEBUG [io.quarkus.oidc.runtime.OidcAuthenticationMechanism] (vert.x-eventloop-thread-0) Resolved OIDC tenant id: Default
2026-07-15 17:41:14,589 DEBUG [io.quarkus.oidc.runtime.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Starting a bearer access token authentication
2026-07-15 17:41:14,589 DEBUG [io.quarkus.oidc.runtime.OidcUtils] (vert.x-eventloop-thread-0) Looking for a token in the authorization header
2026-07-15 17:41:14,589 DEBUG [io.quarkus.oidc.runtime.OidcUtils] (vert.x-eventloop-thread-0) Authorization scheme: Bearer
2026-07-15 17:41:14,589 DEBUG [io.quarkus.oidc.runtime.OidcIdentityProvider] (vert.x-eventloop-thread-0) Starting creating SecurityIdentity
2026-07-15 17:41:14,589 DEBUG [io.quarkus.oidc.runtime.OidcIdentityProvider] (vert.x-eventloop-thread-0) Verifying the JWT token with the local JWK keys
2026-07-15 17:41:14,589 DEBUG [org.hibernate.orm.core] (executor-thread-319) HHH006588: Opening session [tenant=null]
2026-07-15 17:41:14,589 DEBUG [org.hibernate.orm.resource.jdbc] (executor-thread-319) HHH10003030: 'hibernate.connection.provider_disables_autocommit' was enabled. This setting should only be enabled when JDBC Connections obtained by Hibernate from the ConnectionProvider have auto-commit disabled. Enabling this setting when connections have auto-commit enabled leads to execution of SQL operations outside of any JDBC transaction.
2026-07-15 17:41:14,589 DEBUG [org.hibernate.SQL] (executor-thread-319) select smce1_0.NU_SIMULACAO_MOVIMENTACAO_COTA,smce1_0.CO_USUARIO_INCLUSAO_SIMULACAO,smce1_0.DT_CONVERSAO_MOVIMENTACAO_COTA,smce1_0.DT_LIQUIDACAO_MVMNO_COTA,smce1_0.DT_SIMULACAO_MOVIMENTACAO_COTA,smce1_0.NU_FUNDO_INVESTIMENTO_ALOCADO,smce1_0.NU_FUNDO_INVESTIMENTO_GESTAO,smce1_0.IC_SITUACAO_SIMULACAO,smce1_0.TS_INCLUSAO_SIMULACAO,smce1_0.IC_TIPO_MOVIMENTACAO,smce1_0.VR_MOVIMENTACAO_SIMULACAO,smce1_0.VR_POSICAO_CRTRA_FUNDO_GESTAO,smce1_0.VR_SALDO_FINAL_SIMULACAO from FOFTB013_SIMULACAO_MVMNO_COTA smce1_0 where smce1_0.NU_FUNDO_INVESTIMENTO_GESTAO=?
2026-07-15 17:41:14,589 DEBUG [org.hibernate.orm.jdbc] (executor-thread-319) HHH100125: Low JDBC fetch size: 10 (consider setting 'hibernate.jdbc.fetch_size')
2026-07-15 17:41:14,589 DEBUG [org.hibernate.orm.core] (executor-thread-320) HHH006588: Opening session [tenant=null]
2026-07-15 17:41:14,590 DEBUG [org.hibernate.orm.resource.jdbc] (executor-thread-320) HHH10003030: 'hibernate.connection.provider_disables_autocommit' was enabled. This setting should only be enabled when JDBC Connections obtained by Hibernate from the ConnectionProvider have auto-commit disabled. Enabling this setting when connections have auto-commit enabled leads to execution of SQL operations outside of any JDBC transaction.
2026-07-15 17:41:14,590 DEBUG [org.hibernate.SQL] (executor-thread-320) select fige1_0.NU_FUNDO_INVESTIMENTO_GESTAO,fi1_0.NU_FUNDO_INVESTIMENTO,fi1_0.NU_CATEGORIA_FNDO_INVESTIMENTO,fi1_0.CO_CNPJ_CSTDE_FUNDO_INVSO,fi1_0.CO_CNPJ_FUNDO_INVESTIMENTO,fi1_0.CO_INTERNACIONAL_FUNDO,fi1_0.IC_CTRIO_CONVERSAO_APLICACAO,fi1_0.IC_CRITERIO_CONVERSAO_RESGATE,fi1_0.IC_CTRIO_LIQUIDACAO_APLICACAO,fi1_0.IC_CRITERIO_LIQUIDACAO_RESGATE,fi1_0.HH_FECHAMENTO_FUNDO,fi1_0.IC_SITUACAO_FUNDO_INVESTIMENTO,fi1_0.NO_FUNDO_INVESTIMENTO,fi1_0.QT_DIA_CONVERSAO_APLICACAO,fi1_0.QT_DIA_CONVERSAO_RESGATE,fi1_0.QT_DIA_LIQUIDACAO_APLICACAO,fi1_0.QT_DIA_LIQUIDACAO_RESGATE,pfg1_0.NU_FUNDO_INVESTIMENTO_GESTAO,pfg1_0.NU_ARQUIVO_MOVIMENTACAO_COTA,ccf1_0.NU_FUNDO_INVESTIMENTO_GESTAO,ccf1_0.NU_COMPOSICAO_CARTEIRA_FUNDO,ccf1_0.NU_FUNDO_INVESTIMENTO_ALOCADO,fa1_0.NU_FUNDO_INVESTIMENTO_ALOCADO,fa1_0.CO_CNPJ_ADMNR_FUNDO_INVSO,fa1_0.IC_FORMA_CONDOMINIO,fa1_0.NU_FORMA_LIQUIDACAO_MOVIMENTO,fi2_0.NU_FUNDO_INVESTIMENTO,fi2_0.NU_CATEGORIA_FNDO_INVESTIMENTO,fi2_0.CO_CNPJ_CSTDE_FUNDO_INVSO,fi2_0.CO_CNPJ_FUNDO_INVESTIMENTO,fi2_0.CO_INTERNACIONAL_FUNDO,fi2_0.IC_CTRIO_CONVERSAO_APLICACAO,fi2_0.IC_CRITERIO_CONVERSAO_RESGATE,fi2_0.IC_CTRIO_LIQUIDACAO_APLICACAO,fi2_0.IC_CRITERIO_LIQUIDACAO_RESGATE,fi2_0.HH_FECHAMENTO_FUNDO,fi2_0.IC_SITUACAO_FUNDO_INVESTIMENTO,fi2_0.NO_FUNDO_INVESTIMENTO,fi2_0.QT_DIA_CONVERSAO_APLICACAO,fi2_0.QT_DIA_CONVERSAO_RESGATE,fi2_0.QT_DIA_LIQUIDACAO_APLICACAO,fi2_0.QT_DIA_LIQUIDACAO_RESGATE,fa1_0.IC_FUNDO_SALDO_REMANESCENTE,fa1_0.NO_SISTEMA_EXTERNO,ccf1_0.QT_COTA_FUNDO_ALOCADO,ccf1_0.VR_APLICADO_FUNDO_ALOCADO,ccf1_0.VR_COTA_FUNDO_ALOCADO,ccf1_0.VR_POSICAO_FUNDO_ALOCADO,pfg1_0.DT_RFRNA_ARQUIVO_MVMNO_COTA,pfg1_0.VR_PTRMO_LIQUIDO_FUNDO_GESTAO,fige1_0.SG_SISTEMA_ORIGEM,fige1_0.IC_ESTRATEGIA_APLICACAO from FOFTB017_FUNDO_INVSO_GESTAO fige1_0 left join FOFTB005_FUNDO_INVESTIMENTO fi1_0 on fi1_0.NU_FUNDO_INVESTIMENTO=fige1_0.NU_FUNDO_INVESTIMENTO_GESTAO left join FOFTB012_POSICAO_FUNDO_GESTAO pfg1_0 on fige1_0.NU_FUNDO_INVESTIMENTO_GESTAO=pfg1_0.NU_FUNDO_INVESTIMENTO_GESTAO left join FOFTB007_CPSCO_CARTEIRA_FUNDO ccf1_0 on pfg1_0.NU_FUNDO_INVESTIMENTO_GESTAO=ccf1_0.NU_FUNDO_INVESTIMENTO_GESTAO left join FOFTB006_FUNDO_INVSO_ALOCADO fa1_0 on fa1_0.NU_FUNDO_INVESTIMENTO_ALOCADO=ccf1_0.NU_FUNDO_INVESTIMENTO_ALOCADO left join FOFTB005_FUNDO_INVESTIMENTO fi2_0 on fi2_0.NU_FUNDO_INVESTIMENTO=fa1_0.NU_FUNDO_INVESTIMENTO_ALOCADO where fige1_0.NU_FUNDO_INVESTIMENTO_GESTAO=? and fi1_0.IC_SITUACAO_FUNDO_INVESTIMENTO='A'
2026-07-15 17:41:14,590 DEBUG [org.hibernate.orm.jdbc] (executor-thread-320) HHH100125: Low JDBC fetch size: 10 (consider setting 'hibernate.jdbc.fetch_size')
2026-07-15 17:41:14,590 DEBUG [org.hibernate.orm.core] (executor-thread-318) HHH006588: Opening session [tenant=null]
2026-07-15 17:41:14,590 DEBUG [org.hibernate.orm.resource.jdbc] (executor-thread-318) HHH10003030: 'hibernate.connection.provider_disables_autocommit' was enabled. This setting should only be enabled when JDBC Connections obtained by Hibernate from the ConnectionProvider have auto-commit disabled. Enabling this setting when connections have auto-commit enabled leads to execution of SQL operations outside of any JDBC transaction.
2026-07-15 17:41:14,590 DEBUG [org.hibernate.SQL] (executor-thread-318) select imfe1_0.NU_INDSE_MERCADO_FNNCO,imfe1_0.CO_USUARIO_INCSO_INDSE_OPRCO,imfe1_0.DT_INDISPONIBILIDADE_OPERACAO,imfe1_0.NO_INDISPONIBILIDADE_OPERACAO,imfe1_0.TS_INCLUSAO_INDSE_OPERACAO from FOFTB019_INDSE_MERCADO_FNNCO imfe1_0 where imfe1_0.DT_INDISPONIBILIDADE_OPERACAO between ? and ?
2026-07-15 17:41:14,590 DEBUG [org.hibernate.orm.jdbc] (executor-thread-318) HHH100125: Low JDBC fetch size: 10 (consider setting 'hibernate.jdbc.fetch_size')
2026-07-15 17:41:14,594 WARN  [br.gov.caixa.investimentos.sifof.api.aplicacao.shared.context.LogTransacaoContext] (executor-thread-319) Nao foi possivel anexar os dados de resposta. DadosLogTransacao nulo
2026-07-15 17:41:14,594 WARN  [br.gov.caixa.investimentos.sifof.api.aplicacao.shared.context.LogTransacaoContext] (executor-thread-319) Log de transa??o n?o salvo, pois os dados da transa??o est?o nulos
2026-07-15 17:41:14,594 DEBUG [org.hibernate.SQL] (executor-thread-317) select pfa1_0.NU_FUNDO_INVESTIMENTO_ALOCADO,pfa1_0.CO_CNPJ_ADMNR_FUNDO_INVSO,pfa1_0.IC_FORMA_CONDOMINIO,pfa1_0.NU_FORMA_LIQUIDACAO_MOVIMENTO,pfa1_0.IC_FUNDO_SALDO_REMANESCENTE,pfa1_0.NO_SISTEMA_EXTERNO,pfg1_0.NU_FUNDO_INVESTIMENTO_GESTAO,pfg1_0.SG_SISTEMA_ORIGEM,pfg1_0.IC_ESTRATEGIA_APLICACAO from FOFTB005_FUNDO_INVESTIMENTO fie1_0 left join FOFTB006_FUNDO_INVSO_ALOCADO pfa1_0 on fie1_0.NU_FUNDO_INVESTIMENTO=pfa1_0.NU_FUNDO_INVESTIMENTO_ALOCADO left join FOFTB017_FUNDO_INVSO_GESTAO pfg1_0 on fie1_0.NU_FUNDO_INVESTIMENTO=pfg1_0.NU_FUNDO_INVESTIMENTO_GESTAO where fie1_0.NU_FUNDO_INVESTIMENTO=?
2026-07-15 17:41:14,594 DEBUG [org.hibernate.orm.jdbc] (executor-thread-317) HHH100125: Low JDBC fetch size: 10 (consider setting 'hibernate.jdbc.fetch_size')
2026-07-15 17:41:14,594 DEBUG [org.hibernate.session.metrics] (executor-thread-319) HHH000401: Logging session metrics:
	24198 ns acquiring 1 JDBC connections
	2748 ns releasing 1 JDBC connections
	38409 ns preparing 1 JDBC statements
	4334891 ns executing 1 JDBC statements
	0 ns executing 0 JDBC batches
	0 ns performing 0 second-level cache puts
	0 ns performing 0 second-level cache hits
	0 ns performing 0 second-level cache misses
	0 ns executing 0 flushes (flushing a total of 0 entities and 0 collections)
	0 ns executing 0 pre-partial-flushes
	0 ns executing 0 partial-flushes (flushing a total of 0 entities and 0 collections)

2026-07-15 17:41:14,596 DEBUG [org.hibernate.SQL] (executor-thread-320) select distinct fgp1_0.NU_FUNDO_GESTAO_PROJECAO,fgp1_0.CO_USUARIO_INCLUSAO_MOVIMENTO,fgp1_0.DT_CONVERSAO_MOVIMENTO,fgp1_0.DT_LIQUIDACAO_MOVIMENTO,fgp1_0.DT_MOVIMENTO_FUNDO_GESTAO,fgp1_0.NU_FUNDO_INVESTIMENTO_GESTAO,fgp1_0.TS_INCLUSAO_MOVIMENTO,fgp1_0.IC_TIPO_MOVIMENTO,fgp1_0.VR_TOTAL_MOVIMENTO_FNDO_GESTAO from FOFTB017_FUNDO_INVSO_GESTAO fige1_0 join FOFTB008_FUNDO_GESTAO_PROJECAO fgp1_0 on fige1_0.NU_FUNDO_INVESTIMENTO_GESTAO=fgp1_0.NU_FUNDO_INVESTIMENTO_GESTAO where fige1_0.NU_FUNDO_INVESTIMENTO_GESTAO=? and fgp1_0.IC_TIPO_MOVIMENTO='R' and (fgp1_0.DT_CONVERSAO_MOVIMENTO>=? or fgp1_0.DT_LIQUIDACAO_MOVIMENTO>=?)
2026-07-15 17:41:14,596 DEBUG [org.hibernate.orm.jdbc] (executor-thread-320) HHH100125: Low JDBC fetch size: 10 (consider setting 'hibernate.jdbc.fetch_size')
2026-07-15 17:41:14,598 DEBUG [org.hibernate.SQL] (executor-thread-317) select cfie1_0.NU_CATEGORIA_FNDO_INVESTIMENTO,cfie1_0.NO_CATEGORIA_FNDO_INVESTIMENTO,cfie1_0.TS_INCLUSAO_CATEGORIA_FUNDO from FOF.FOFTB011_CATEGORIA_FUNDO_INVSO cfie1_0 where cfie1_0.NU_CATEGORIA_FNDO_INVESTIMENTO=?
2026-07-15 17:41:14,598 DEBUG [org.hibernate.orm.jdbc] (executor-thread-317) HHH100125: Low JDBC fetch size: 10 (consider setting 'hibernate.jdbc.fetch_size')
2026-07-15 17:41:14,603 DEBUG [org.hibernate.SQL] (executor-thread-320) select distinct s1_0.NU_SIMULACAO_MOVIMENTACAO_COTA,s1_0.CO_USUARIO_INCLUSAO_SIMULACAO,s1_0.DT_CONVERSAO_MOVIMENTACAO_COTA,s1_0.DT_LIQUIDACAO_MVMNO_COTA,s1_0.DT_SIMULACAO_MOVIMENTACAO_COTA,s1_0.NU_FUNDO_INVESTIMENTO_ALOCADO,s1_0.NU_FUNDO_INVESTIMENTO_GESTAO,fige1_0.NU_FUNDO_INVESTIMENTO_GESTAO,fige1_0.SG_SISTEMA_ORIGEM,fige1_0.IC_ESTRATEGIA_APLICACAO,s1_0.IC_SITUACAO_SIMULACAO,s1_0.TS_INCLUSAO_SIMULACAO,s1_0.IC_TIPO_MOVIMENTACAO,s1_0.VR_MOVIMENTACAO_SIMULACAO,s1_0.VR_POSICAO_CRTRA_FUNDO_GESTAO,s1_0.VR_SALDO_FINAL_SIMULACAO from FOFTB017_FUNDO_INVSO_GESTAO fige1_0 join FOFTB013_SIMULACAO_MVMNO_COTA s1_0 on fige1_0.NU_FUNDO_INVESTIMENTO_GESTAO=s1_0.NU_FUNDO_INVESTIMENTO_GESTAO where fige1_0.NU_FUNDO_INVESTIMENTO_GESTAO=? and s1_0.IC_TIPO_MOVIMENTACAO='R' and s1_0.DT_LIQUIDACAO_MVMNO_COTA>?
2026-07-15 17:41:14,603 DEBUG [org.hibernate.orm.jdbc] (executor-thread-320) HHH100125: Low JDBC fetch size: 10 (consider setting 'hibernate.jdbc.fetch_size')
2026-07-15 17:41:14,603 DEBUG [org.hibernate.SQL] (executor-thread-317) select coalesce(sum(ccf1_0.VR_POSICAO_FUNDO_ALOCADO),0) from FOFTB006_FUNDO_INVSO_ALOCADO fiae1_0 left join FOFTB007_CPSCO_CARTEIRA_FUNDO ccf1_0 on fiae1_0.NU_FUNDO_INVESTIMENTO_ALOCADO=ccf1_0.NU_FUNDO_INVESTIMENTO_ALOCADO left join FOFTB012_POSICAO_FUNDO_GESTAO pfg1_0 on pfg1_0.NU_FUNDO_INVESTIMENTO_GESTAO=ccf1_0.NU_FUNDO_INVESTIMENTO_GESTAO left join FOFTB017_FUNDO_INVSO_GESTAO fg1_0 on fg1_0.NU_FUNDO_INVESTIMENTO_GESTAO=pfg1_0.NU_FUNDO_INVESTIMENTO_GESTAO left join FOFTB005_FUNDO_INVESTIMENTO fi2_0 on fi2_0.NU_FUNDO_INVESTIMENTO=fg1_0.NU_FUNDO_INVESTIMENTO_GESTAO where (fi2_0.NU_FUNDO_INVESTIMENTO=?)
2026-07-15 17:41:14,603 DEBUG [org.hibernate.orm.event] (executor-thread-318) HHH90060071: Flushed: 0 insertions, 0 updates, 0 deletions to 19 objects
2026-07-15 17:41:14,603 DEBUG [org.hibernate.orm.event] (executor-thread-318) HHH90060072: Flushed: 0 (re)creations, 0 updates, 0 removals to 0 collections
2026-07-15 17:41:14,603 DEBUG [org.hibernate.orm.core] (executor-thread-318) Listing entities:
2026-07-15 17:41:14,603 DEBUG [org.hibernate.orm.jdbc] (executor-thread-317) HHH100125: Low JDBC fetch size: 10 (consider setting 'hibernate.jdbc.fetch_size')
2026-07-15 17:41:14,603 DEBUG [org.hibernate.orm.core] (executor-thread-318) br.gov.caixa.investimentos.sifof.api.aplicacao.fundos.infra.db.entity.IndisponibilidadeMercadoFinanceiroEntity{codigoUsuarioInclusaoIndisponibilidadeOperacao=SISTEMA, dataIndisponibilidadeOperacao=2026-12-25, timestampInclusaoIndisponibilidadeOperacao=2026-06-02T11:49:02, id=23, nomeIndisponibilidadeOperacao=Natal}
2026-07-15 17:41:14,603 DEBUG [org.hibernate.orm.core] (executor-thread-318) br.gov.caixa.investimentos.sifof.api.aplicacao.fundos.infra.db.entity.IndisponibilidadeMercadoFinanceiroEntity{codigoUsuarioInclusaoIndisponibilidadeOperacao=SISTEMA, dataIndisponibilidadeOperacao=2026-11-20, timestampInclusaoIndisponibilidadeOperacao=2026-06-02T11:49:02, id=22, nomeIndisponibilidadeOperacao=Dia Nacional de Zumbi e da Consci?ncia Negra}
2026-07-15 17:41:14,603 DEBUG [org.hibernate.orm.core] (executor-thread-318) br.gov.caixa.investimentos.sifof.api.aplicacao.fundos.infra.db.entity.IndisponibilidadeMercadoFinanceiroEntity{codigoUsuarioInclusaoIndisponibilidadeOperacao=SISTEMA, dataIndisponibilidadeOperacao=2026-11-02, timestampInclusaoIndisponibilidadeOperacao=2026-06-02T11:49:02, id=20, nomeIndisponibilidadeOperacao=Finados}
2026-07-15 17:41:14,603 DEBUG [org.hibernate.orm.core] (executor-thread-318) br.gov.caixa.investimentos.sifof.api.aplicacao.fundos.infra.db.entity.IndisponibilidadeMercadoFinanceiroEntity{codigoUsuarioInclusaoIndisponibilidadeOperacao=SISTEMA, dataIndisponibilidadeOperacao=2026-10-12, timestampInclusaoIndisponibilidadeOperacao=2026-06-02T11:49:02, id=19, nomeIndisponibilidadeOperacao=Nossa Sr.a Aparecida - Padroeira do Brasil}
2026-07-15 17:41:14,603 DEBUG [org.hibernate.orm.core] (executor-thread-318) br.gov.caixa.investimentos.sifof.api.aplicacao.fundos.infra.db.entity.IndisponibilidadeMercadoFinanceiroEntity{codigoUsuarioInclusaoIndisponibilidadeOperacao=SISTEMA, dataIndisponibilidadeOperacao=2026-09-07, timestampInclusaoIndisponibilidadeOperacao=2026-06-02T11:49:02, id=18, nomeIndisponibilidadeOperacao=Independ?ncia do Brasil}
2026-07-15 17:41:14,603 DEBUG [org.hibernate.orm.core] (executor-thread-318) br.gov.caixa.investimentos.sifof.api.aplicacao.fundos.infra.db.entity.IndisponibilidadeMercadoFinanceiroEntity{codigoUsuarioInclusaoIndisponibilidadeOperacao=SISTEMA, dataIndisponibilidadeOperacao=2026-06-04, timestampInclusaoIndisponibilidadeOperacao=2026-06-02T11:49:01, id=17, nomeIndisponibilidadeOperacao=Corpus Christi}
2026-07-15 17:41:14,603 DEBUG [org.hibernate.orm.core] (executor-thread-318) br.gov.caixa.investimentos.sifof.api.aplicacao.fundos.infra.db.entity.IndisponibilidadeMercadoFinanceiroEntity{codigoUsuarioInclusaoIndisponibilidadeOperacao=SISTEMA, dataIndisponibilidadeOperacao=2026-05-01, timestampInclusaoIndisponibilidadeOperacao=2026-06-02T11:49:01, id=16, nomeIndisponibilidadeOperacao=Dia do Trabalho}
2026-07-15 17:41:14,603 DEBUG [org.hibernate.orm.core] (executor-thread-318) br.gov.caixa.investimentos.sifof.api.aplicacao.fundos.infra.db.entity.IndisponibilidadeMercadoFinanceiroEntity{codigoUsuarioInclusaoIndisponibilidadeOperacao=SISTEMA, dataIndisponibilidadeOperacao=2026-04-21, timestampInclusaoIndisponibilidadeOperacao=2026-06-02T11:49:01, id=15, nomeIndisponibilidadeOperacao=Tiradentes}
2026-07-15 17:41:14,603 DEBUG [org.hibernate.orm.core] (executor-thread-318) br.gov.caixa.investimentos.sifof.api.aplicacao.fundos.infra.db.entity.IndisponibilidadeMercadoFinanceiroEntity{codigoUsuarioInclusaoIndisponibilidadeOperacao=SISTEMA, dataIndisponibilidadeOperacao=2026-04-03, timestampInclusaoIndisponibilidadeOperacao=2026-06-02T11:49:01, id=14, nomeIndisponibilidadeOperacao=Paix?o de Cristo}
2026-07-15 17:41:14,603 DEBUG [org.hibernate.orm.core] (executor-thread-318) br.gov.caixa.investimentos.sifof.api.aplicacao.fundos.infra.db.entity.IndisponibilidadeMercadoFinanceiroEntity{codigoUsuarioInclusaoIndisponibilidadeOperacao=SISTEMA, dataIndisponibilidadeOperacao=2026-02-17, timestampInclusaoIndisponibilidadeOperacao=2026-06-02T11:49:01, id=13, nomeIndisponibilidadeOperacao=Carnaval}
2026-07-15 17:41:14,603 DEBUG [org.hibernate.orm.core] (executor-thread-318) br.gov.caixa.investimentos.sifof.api.aplicacao.fundos.infra.db.entity.IndisponibilidadeMercadoFinanceiroEntity{codigoUsuarioInclusaoIndisponibilidadeOperacao=SISTEMA, dataIndisponibilidadeOperacao=2026-02-16, timestampInclusaoIndisponibilidadeOperacao=2026-06-02T11:49:01, id=12, nomeIndisponibilidadeOperacao=Carnaval}
