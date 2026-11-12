
-sh-4.2$
-sh-4.2$
-sh-4.2$ for f in $(curl -sk https://siepr-curso-bec3-frontend-des.apps.nprd.caixa/ | grep -oE '[A-Za-z0-9._-]+\.js' | sort -u); do echo "$f $(curl -sk https://siepr-curso-bec3-frontend-des.apps.nprd.caixa/$f | grep -c __API_DADOS_FAMILIA_PATH__)"; done
chunk-EQM5WOIX.js 1
chunk-TSRGIXR5.js 0
main-CXWZBTEO.js 0
polyfills-KEOJFKRO.js 0
scripts-7SMFXABT.js 0
-sh-4.2$
-sh-4.2$
-sh-4.2$
