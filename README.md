bash# Entre no pod (pode levar alguns segundos)
oc exec -it sisgf-backend-des-242-v5bcj -n sisgf-des -- /bin/bash
Dentro do pod, roda:
bash# Ver se os arquivos de secrets existem
ls -la /usr/src/app/secrets_files/SISGF_DES/

# Ver o conteúdo do arquivo SISGF_APIKEY
cat /usr/src/app/secrets_files/SISGF_DES/SISGF_APIKEY

# Ver se a variável de ambiente está setada
echo $SISGF_APIKEY

# Ver o application.properties que a app está usando
cat /deployments/quarkus-resources/application.properties | grep -A2 -B2 "api.key"

# Ver todas as variáveis de ambiente
env | grep -i sisgf
Cola os resultados desses comandos que a gente consegue identificar exatamente onde está o gargalo.
