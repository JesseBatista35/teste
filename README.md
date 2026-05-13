Depois entre especificando o container:

oc exec -it -n sitop-des sitop-frontend-des-5-mzzkd -c sitop-frontend-des-exporter -- sh

Dentro do container, rode:

pwd
ls -la /
ls -la /opt
find / -name "*.js" 2>/dev/null | head -100
find / -name "main*.js" 2>/dev/null | head -50

Mas como o pod está reiniciando, talvez não consiga entrar. Então pegue os logs corretos com:

oc logs -n sitop-des sitop-frontend-des-5-mzzkd --previous

Se tiver mais de um container:

oc logs -n sitop-des sitop-frontend-des-5-mzzkd -c sitop-frontend-des-exporter --previous

Também rode:

oc describe pod sitop-frontend-des-5-mzzkd -n sitop-des

Para confirmar se o namespace está certo:

oc get ns | grep -i sitop

E para listar os pods:

oc get pods -n sitop-des | grep sitop-frontend

O erro principal continua sendo este:

sed: não foi possível ler /opt/app-root/src/main*.js: Arquivo ou diretório inexistente

Então a correção precisa ser no Dockerfile, entrypoint.sh, startup.sh ou script que roda no início do container. Provavelmente tem algo parecido com:

sed -i "s|ALGUMA_COISA|$VALOR|g" /opt/app-root/src/main*.js

Só que o build do frontend não está nesse caminho. Depois que conseguir entrar ou listar os arquivos da imagem, ajuste para o caminho real, por exemplo:

sed -i "s|ALGUMA_COISA|$VALOR|g" /usr/share/nginx/html/main*.js

ou:

sed -i "s|ALGUMA_COISA|$VALOR|g" /opt/app-root/src/dist/main*.js

Uma forma mais segura seria trocar o script para não quebrar “no escuro”:

JS_FILES=$(find / -name "main*.js" 2>/dev/null)

if [ -z "$JS_FILES" ]; then
  echo "Nenhum arquivo main*.js encontrado na imagem."
  echo "Arquivos JS encontrados:"
  find / -name "*.js" 2>/dev/null | head -100
  exit 1
fi

for file in $JS_FILES; do
  echo "Aplicando sed no arquivo: $file"
  sed -i "s|ALGUMA_COISA|$VALOR|g" "$file"
done

Resumo: você ainda não validou dentro da imagem da aplicação. Primeiro corrija o oc exec/namespace, depois localize onde realmente está o main*.js, e por fim ajuste o caminho usado pelo sed no startup da imagem.
