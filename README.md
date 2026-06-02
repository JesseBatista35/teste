O que verificar agora
Primeiro, veja pra onde o SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS está apontando e confirme o conteúdo da senha do MQ:
bashoc get secret sifug-siofg-api-des -n sifug-des -o jsonpath='{.data.SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS}' | base64 -d; echo
oc get secret sifug-siofg-api-des -n sifug-des -o jsonpath='{.data.QUARKUS_SIOFG_IBM_MQ_PASSWORD}' | base64 -d; echo
O primeiro deve devolver um caminho (ex.: /usr/src/app/secrets_files/SIOFG_DES ou uma lista de arquivos). O segundo deve devolver literalmente ${SIFUG_XMQD1}.
Depois, confirme que esse caminho está montado dentro do container da aplicação (não só no sidecar) e que os arquivos estão lá:
bashoc get dc/sifug-siofg-api-des -n sifug-des -o yaml | grep -i -A6 volumeMounts
oc get dc/sifug-siofg-api-des -n sifug-des -o yaml | grep -i -A10 'volumes:'
O que você está procurando: o mountPath do volume compartilhado no container sifug-siofg-api-des precisa bater exatamente com o caminho que está no SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS. Se o sidecar grava em /usr/src/app/secrets_files/SIOFG_DES mas no app o volume está montado em outro lugar (ou nem está montado), os arquivos não são encontrados e nenhum ${SIFUG_*} expande.
As três causas mais prováveis, em ordem:

Caminho divergente — o SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS aponta pra um diretório/arquivo diferente de onde o volume está montado no app.
Volume não montado no container do app — a etapa "Create BT App Mount Volume" da release não vinculou o volume ao container principal (só no sidecar).
Formato esperado pelo SmallRye — dependendo de como o source de arquivo está configurado, ele pode esperar um arquivo .properties (chave=valor) e não um diretório com um arquivo por segredo. Vale conferir o que o SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS aponta: se é um diretório (cada arquivo vira uma propriedade) ou um arquivo único.

Manda o retorno desses comandos (pode ofuscar o valor real da senha do MQ se aparecer algo que não seja o ${...}) que daí eu te digo exatamente qual dos três é e como ajustar.
