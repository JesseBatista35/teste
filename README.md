curl --location 'http://rest-api.servicos.caixa:8008/api/jwt/logout' \
  --header 'Content-Type: application/json' \
  --header 'Authorization: AR-JWT SEU_TOKEN_AQUI' \
  --data '{"logout": "true"}'
