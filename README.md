Próximo passo: descobrir onde está esse sed

Rode:

oc get dc sitop-frontend-des -o yaml > dc-frontend.yaml

Depois procure sed, main*.js, command e args:

grep -n -A5 -B5 "sed\|main\*.js\|command:\|args:\|image:" dc-frontend.yaml

Também rode:

oc describe dc sitop-frontend-des

Se o sed aparecer no YAML da deployment config, a correção é ali.

Tentar abrir a imagem sem rodar o startup quebrado

Como o container está em CrashLoopBackOff, o oc exec pode não funcionar. Use debug:

oc debug pod/sitop-frontend-des-5-mzzkd -c sitop-frontend-des -- /bin/sh

Se entrar no debug, rode um comando por linha:

pwd
ls -la /
ls -la /opt
ls -la /opt/app-root
ls -la /opt/app-root/src
find /opt/app-root -type f -name "*.js" 2>/dev/null | head -100
find / -type f -name "main*.js" 2>/dev/null | head -50

Atenção: o correto é:

find / -name "*.js"

Não é:

find / -name ".js"
Correção provável no script

Em algum arquivo de startup deve existir algo assim:

sed -i "s|ALGUMA_VARIAVEL|$VALOR|g" /opt/app-root/src/main*.js

Mas não existe nenhum main*.js direto em:

/opt/app-root/src/

Pode ser que o arquivo esteja em:

/opt/app-root/src/browser/main*.js

ou:

/opt/app-root/src/dist/browser/main*.js

ou:

/usr/share/nginx/html/main*.js

Então a correção seria trocar o caminho do sed.

Exemplo:

sed -i "s|ALGUMA_VARIAVEL|$VALOR|g" /opt/app-root/src/browser/main*.js

ou:

sed -i "s|ALGUMA_VARIAVEL|$VALOR|g" /usr/share/nginx/html/main*.js
Correção mais segura

No entrypoint.sh ou script que faz o sed, coloque assim:

JS_FILES=$(find /opt/app-root/src /usr/share/nginx/html -type f -name "main*.js" 2>/dev/null)

if [ -z "$JS_FILES" ]; then
  echo "Nenhum arquivo main*.js encontrado."
  echo "Listando arquivos JS encontrados:"
  find /opt/app-root/src /usr/share/nginx/html -type f -name "*.js" 2>/dev/null | head -100
  exit 1
fi

for file in $JS_FILES; do
  echo "Aplicando variáveis no arquivo: $file"
  sed -i "s|ALGUMA_VARIAVEL|$VALOR|g" "$file"
done
Resumo

O problema não está mais no pipeline. O pipeline só expira porque o pod não fica saudável.

A causa real é:

/opt/app-root/src/main*.js

não existe dentro da imagem.

Agora você precisa localizar onde está esse sed. Comece por este comando:

grep -n -A5 -B5 "sed\|main\*.js\|command:\|args:\|image:" dc-frontend.yaml
