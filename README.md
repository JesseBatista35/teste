Use assim:

grep -nE -A5 -B5 "sed|main\*\.js|command:|args:|image:" dc-frontend.yaml

Mas pelo oc describe, provavelmente não vai aparecer sed, porque o erro deve estar dentro da imagem.

2. Verifique o ConfigMap do NGINX

Como o DC monta este ConfigMap:

nginx-conf-d-sitop-frontend

rode:

oc get cm nginx-conf-d-sitop-frontend -o yaml

E também:

oc get cm nginx-conf-d-sitop-frontend -o yaml | grep -nE "sed|main\*\.js|root|alias|try_files|8080|stub_status"

Isso confirma se o erro não está vindo de algum script/config montado pelo ConfigMap.

3. Inspecione a imagem com oc debug

Tente abrir a imagem sem depender do container que está quebrando:

oc debug dc/sitop-frontend-des -- /bin/sh

Se não funcionar, tente pelo pod:

oc debug pod/sitop-frontend-des-5-mzzkd -c sitop-frontend-des -- /bin/sh

Dentro do debug, rode um comando por linha:

pwd
ls -la /
ls -la /opt
ls -la /opt/app-root
ls -la /opt/app-root/src
find /opt/app-root -type f -name "*.js" 2>/dev/null | head -100
find / -type f -name "main*.js" 2>/dev/null | head -50
4. Ache onde está o sed dentro da imagem

Dentro do debug, rode:

grep -R "main*.js" /opt /usr /etc 2>/dev/null | head -50

Depois:

grep -R "/opt/app-root/src/main" /opt /usr /etc 2>/dev/null | head -50

E:

grep -R "sed" /opt/app-root /usr/local/bin /etc 2>/dev/null | head -100

Também vale procurar scripts:

find / -type f \( -name "*.sh" -o -name "run" -o -name "entrypoint*" -o -name "start*" \) 2>/dev/null | head -100

Quando achar o arquivo, veja o conteúdo:

cat CAMINHO_DO_ARQUIVO

Exemplo:

cat /usr/local/bin/entrypoint.sh
5. Correção provável

Hoje o script deve estar assim:

sed -i "s|ALGUMA_COISA|$VALOR|g" /opt/app-root/src/main*.js

Mas o arquivo main*.js não existe nesse caminho.

Pode estar em algum lugar como:

/opt/app-root/src/browser/main*.js

ou:

/opt/app-root/src/dist/main*.js

ou:

/opt/app-root/src/dist/browser/main*.js

ou:

/usr/share/nginx/html/main*.js

Depois de descobrir o caminho real, ajuste o script da imagem.

Exemplo:

sed -i "s|ALGUMA_COISA|$VALOR|g" /opt/app-root/src/dist/browser/main*.js
6. Melhor correção para não quebrar de novo

No script da imagem, substitua o caminho fixo por busca dinâmica:

JS_FILES=$(find /opt/app-root/src /usr/share/nginx/html -type f -name "main*.js" 2>/dev/null)

if [ -z "$JS_FILES" ]; then
  echo "Nenhum arquivo main*.js encontrado."
  echo "Arquivos JS encontrados:"
  find /opt/app-root/src /usr/share/nginx/html -type f -name "*.js" 2>/dev/null | head -100
  exit 1
fi

for file in $JS_FILES; do
  echo "Aplicando variáveis no arquivo: $file"
  sed -i "s|ALGUMA_COISA|$VALOR|g" "$file"
done
Resumo final

O problema não está no Azure Pipeline.

O problema está na imagem do frontend:

sitop-frontend:1.0.0-SNAPSHOT

Ela tenta executar:

sed ... /opt/app-root/src/main*.js

mas esse arquivo não existe.

O próximo comando mais importante agora é:

oc debug dc/sitop-frontend-des -- /bin/sh

Depois encontre onde está o main*.js e onde está o script com sed. Antes, você tinha caído no /opt/ads-agent, que era o agent e não o container da aplicação
