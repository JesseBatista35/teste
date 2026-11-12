curl -sk https://siepr-curso-bec3-frontend-des.apps.nprd.caixa/chunk-EQM5WOIX.js | grep -oE '.{80}__API_DADOS_FAMILIA_PATH__.{80}'
for f in chunk-EQM5WOIX.js chunk-TSRGIXR5.js main-CXWZBTEO.js; do echo "$f $(curl -sk https://siepr-curso-bec3-frontend-des.apps.nprd.caixa/$f | grep -c 'caixa:8443')"; done
