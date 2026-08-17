appsettings.Development.json

{
  "Logging": {
    "LogLevel": {
      "Default": "Information",
      "Microsoft.AspNetCore": "Warning"
    }
  },
  "ConnectionStrings": {
    "SIPGC3": "server=;database=;user id=;password=;encrypt=true;trustServerCertificate=true",
    "SIPGC3_Local": "Server=10.116.92.247;Database=PGCDB001;Trusted_Connection=True;encrypt=true;trustServerCertificate=true",
    "SIPGCOld": ""
  },
  "JwtSettings": {
    "SecretKey": "sipgc3-des-secret-key-minimum-32-characters-long!!"
  },
  "AllowedHosts": "*",
  "BEYONDTRUST_LOGGING_ENABLED": "BEYONDTRUST_LOGGING_ENABLED",
 
  "DB_PASSWORD_001": "DB_PASSWORD_001"
}



appsettings.json

{
  "Logging": {
    "LogLevel": {
      "Default": "Information",
      "Microsoft.AspNetCore": "Warning"
    }
  },
  "ConnectionStrings": {
    "SIPGC3": "server=;database=;user id=;password=;encrypt=true;trustServerCertificate=true",
    "SIPGC3_Local": "Server=10.116.92.247;Database=PGCDB001;Trusted_Connection=True;encrypt=true;trustServerCertificate=true",
    "SIPGCOld": ""
  },
  "JwtSettings": {
    "SecretKey": "sipgc3-des-secret-key-minimum-32-characters-long!!"
  },
  "AllowedHosts": "*",
  "BEYONDTRUST_LOGGING_ENABLED": "BEYONDTRUST_LOGGING_ENABLED",
  "VAULT_LOCATION": "VAULT_LOCATION",

  "DB_PASSWORD_001": "DB_PASSWORD_001"
}


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
      No XML encryptor configured. Key {ee983ddc-772d-40c2-b687-0e95964728a4} may be persisted to storage in unencrypted form.
info: Microsoft.Hosting.Lifetime[14]
      Now listening on: http://[::]:8080
info: Microsoft.Hosting.Lifetime[0]
      Application started. Press Ctrl+C to shut down.
info: Microsoft.Hosting.Lifetime[0]
      Hosting environment: des
info: Microsoft.Hosting.Lifetime[0]
      Content root path: /opt/app-root/app


teste que fizemos ta pegando errado a seha

