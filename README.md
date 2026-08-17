---> Running application ...
info: SIPGC.Infrastructure.BeyondTrust.BeyondTrustVariableResolver[0]
      [BT] Configurando BeyondTrust - Ambiente: des
info: SIPGC.Infrastructure.BeyondTrust.BeyondTrustConfigurationProvider[0]
      [BT] Carregando configurações BeyondTrust - Ambiente: des
info: SIPGC.Infrastructure.BeyondTrust.BeyondTrustService[0]
      [BT] Carregando secrets do diretório: /usr/src/app/secrets_files/SIPGC_DES/
info: SIPGC.Infrastructure.BeyondTrust.BeyondTrustService[0]
      [BT] Encontrados 6 arquivos para processar
info: SIPGC.Infrastructure.BeyondTrust.BeyondTrustService[0]
      [BT] Carregamento concluído: 6 secrets processados
info: SIPGC.Infrastructure.BeyondTrust.BeyondTrustConfigurationProvider[0]
      [BT] Encontradas 1 variáveis com padrões ${}
info: SIPGC.Infrastructure.BeyondTrust.BeyondTrustVariableResolver[0]
      [BT-RESOLVER] Resolvendo 1 variáveis com padrões ${}
info: SIPGC.Infrastructure.BeyondTrust.BeyondTrustVariableResolver[0]
      [BT-RESOLVER] DB_PASSWORD_001: '${spgcdr01_sqlserver}' → resolvido
info: SIPGC.Infrastructure.BeyondTrust.BeyondTrustVariableResolver[0]
      [BT-RESOLVER] Resolução concluída: 1/1 variáveis resolvidas
info: SIPGC.Infrastructure.BeyondTrust.BeyondTrustConfigurationProvider[0]
      [BT] Resolvidas 1 variáveis
info: SIPGC.Infrastructure.BeyondTrust.BeyondTrustConfigurationProvider[0]
      [BT] Configuração completa: 7 itens carregados
info: SIPGC.Infrastructure.BeyondTrust.BeyondTrustVariableResolver[0]
      [BT] BeyondTrust configurado com sucesso
info: Api.SIPGC-3[0]
      ENV DB_PASSWORD_001 encontrada: True | Tamanho: 21
info: Api.SIPGC-3[0]
      CONFIG DB_PASSWORD_001 encontrada: True | Tamanho: 12
info: Api.SIPGC-3[0]
      DB_PASSWORD_001: ***ver}
warn: Microsoft.AspNetCore.DataProtection.Repositories.FileSystemXmlRepository[60]
      Storing keys in a directory '/opt/app-root/.aspnet/DataProtection-Keys' that may not be persisted outside of the container. Protected data will be unavailable when container is destroyed. For more information go to https://aka.ms/aspnet/dataprotectionwarning
warn: Microsoft.AspNetCore.DataProtection.KeyManagement.XmlKeyManager[35]
      No XML encryptor configured. Key {8ce74e68-d0a7-4c42-9ff0-e1b0b2c7b325} may be persisted to storage in unencrypted form.
info: Microsoft.Hosting.Lifetime[14]
      Now listening on: http://[::]:8080
info: Microsoft.Hosting.Lifetime[0]
      Application started. Press Ctrl+C to shut down.
info: Microsoft.Hosting.Lifetime[0]
      Hosting environment: des
info: Microsoft.Hosting.Lifetime[0]
      Content root path: /opt/app-root/app
warn: Microsoft.AspNetCore.HttpsPolicy.HttpsRedirectionMiddleware[3]
      Failed to determine the https port for redirect.
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (18ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT [p].[NU_MENU_SUBMENU], [p].[IC_MENU_ATIVO_INATIVO], [p].[TS_FIM_PERIODO], [p].[TS_INICIO_PERIODO], [p].[TS_ATUALIZACAO_MENU_SUBMENU], [p].[NO_ICONE_MENU_SUBMENU], [p].[NU_MENU_SUBMENU_SUPERIOR], [p].[NO_MENU_SUBMENU], [p].[DE_ROTA_MENU_SUBMENU], [p].[IC_MENU_SUBMENU], [p].[CO_USUARIO_ALTERACAO]
      FROM [PGC].[PGCTB016_MENU_SUBMENU] AS [p]
info: Microsoft.EntityFrameworkCore.Database.Command[20101]
      Executed DbCommand (7ms) [Parameters=[], CommandType='Text', CommandTimeout='30']
      SELECT [p].[NU_MENU_SUBMENU], [p].[IC_MENU_ATIVO_INATIVO], [p].[TS_FIM_PERIODO], [p].[TS_INICIO_PERIODO], [p].[TS_ATUALIZACAO_MENU_SUBMENU], [p].[NO_ICONE_MENU_SUBMENU], [p].[NU_MENU_SUBMENU_SUPERIOR], [p].[NO_MENU_SUBMENU], [p].[DE_ROTA_MENU_SUBMENU], [p].[IC_MENU_SUBMENU], [p].[CO_USUARIO_ALTERACAO]
      FROM [PGC].[PGCTB016_MENU_SUBMENU] AS [p]
