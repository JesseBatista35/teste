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
