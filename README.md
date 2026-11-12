Falta conferir o terceiro sintoma, o __API_DADOS_FAMILIA_PATH__ no bundle. No Linux:

URL=https://siepr-curso-bec3-frontend-des.apps.nprd.caixa
for f in $(curl -sk $URL/ | grep -oE '[A-Za-z0-9._-]+\.js' | sort -u); do
  echo "$f: $(curl -sk $URL/$f | grep -c __API_DADOS_FAMILIA_PATH__)"
done
