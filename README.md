
-sh-4.2$
-sh-4.2$ for f in $(curl -sk https://siepr-curso-bec3-frontend-des.apps.nprd.caixa/ | grep -oE '[A-Za-z0-9._-]+\.js' | sort -u); do echo "$f $(curl -sk https://siepr-curso-bec3-frontend-des.apps.nprd.caixa/$f | grep -c __API_)"; done
chunk-7YUSZ4SJ.js 0
chunk-TSRGIXR5.js 0
main-AY5VF4NU.js 0
polyfills-KEOJFKRO.js 0
scripts-7SMFXABT.js 0
-sh-4.2$


chega acaba pelo amor de Deus
