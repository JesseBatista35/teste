Achei 3 ERROS na variable group SIFUG-siofg-api-des:
ERRO 1 - Falta VAULT_LOCATION:
Não tem a variável VAULT_LOCATION. Precisa adicionar:
VAULT_LOCATION = /usr/src/app/secrets_files/SIOFG_DES/
ERRO 2 - _SECRET.SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS errado:
Está:
_SECRET.SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS = /usr/src/app/secrets_files/SIOFG_DES/
Deveria ser:
_SECRET.SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS = #{VAULT_LOCATION}#
ERRO 3 - NO_PROXY faltando Azure domains:
Está:
_ENV.NO_PROXY = "*.caixa,*.caixa.gov.br"
Deveria ser:
_ENV.NO_PROXY = "*.caixa,*.caixa.gov.br,*.applicationinsights.azure.com,*.livediagnostics.monitor.azure.com"

FAÇA ESSAS 3 MUDANÇAS na variable group SIFUG-siofg-api-des e roda o deploy novamente.
