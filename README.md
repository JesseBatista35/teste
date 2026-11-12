
__NG_DI_FLAG__
__NG_ELEMENT_ID__
__NG_ENV_ID__
-sh-4.2$
-sh-4.2$
-sh-4.2$ curl -sk https://siepr-curso-bec3-frontend-des.apps.nprd.caixa/chunk-EQM5WOIX.js | grep -oE '.{80}__API_DADOS_FAMILIA_PATH__.{80}'
des.apps.nprd.caixa",parametrizacao:"__API_PARAMETRIZACAO_PATH__",dadosFamilia:"__API_DADOS_FAMILIA_PATH__",arquivos:"__API_ARQUIVOS_PATH__",relatorios:"__API_RELATORIOS_PATH__",manutenc
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ for f in chunk-EQM5WOIX.js chunk-TSRGIXR5.js main-CXWZBTEO.js; do echo "$f $(curl -sk https://siepr-curso-bec3-frontend-des.apps.nprd.caixa/$f | grep -c 'caixa:8443')"; done
chunk-EQM5WOIX.js 0
chunk-TSRGIXR5.js 0
main-CXWZBTEO.js 0
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
