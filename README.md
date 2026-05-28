***********************************************************************
p585600@10.122.155.62's password:
Last login: Thu May 28 11:18:56 2026 from 10.122.150.31
-sh-4.2$ oc exec -it sisgf-backend-des-242-v5bcj -n sisgf-des -- /bin/bash
error: You must be logged in to the server (Unauthorized)
-sh-4.2$ oc login --token=sha256~ucX-VmxgkH7XqkSL5x2TEbcbwjo3OqD8GmphTmFtAkY --server=https://api.nprd.caixa:6443
Logged into "https://api.nprd.caixa:6443" as "p585600@corp.caixa.gov.br" using the token provided.

You have access to 949 projects, the list has been suppressed. You can list all projects with 'oc projects'

Using project "sisgf-des".
-sh-4.2$ oc exec -it sisgf-backend-des-242-v5bcj -n sisgf-des -- /bin/bash
error: unable to upgrade connection: container not found ("sisgf-backend-des")
-sh-4.2$ ls -la /usr/src/app/secrets_files/SISGF_DES/
ls: não é possível acessar /usr/src/app/secrets_files/SISGF_DES/: Arquivo ou diretório não encontrado
-sh-4.2$ cat /usr/src/app/secrets_files/SISGF_DES/SISGF_APIKEY
cat: /usr/src/app/secrets_files/SISGF_DES/SISGF_APIKEY: Arquivo ou diretório não encontrado
-sh-4.2$ echo $SISGF_APIKEY

-sh-4.2$ cat /deployments/quarkus-resources/application.properties | grep -A2 -B2 "api.key
> ^C
-sh-4.2$ env | grep -i sisgf
-sh-4.2$

