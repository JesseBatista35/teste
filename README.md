
-sh-4.2$
-sh-4.2$ oc debug pod/sigfa-api-extratos-des-15-sh4lk -n sigfa-des -c sigfa-api-extratos-des}
Error from server (NotFound): pods "sigfa-api-extratos-des-15-sh4lk" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ cat /usr/src/app/secrets_files/SIGFA_DES/CLISERGFA_SSO_INTRA | xxd | head
cat: /usr/src/app/secrets_files/SIGFA_DES/CLISERGFA_SSO_INTRA: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ env | grep -i "SMALLRYE\|CLISERGFA\|OIDC_CLIENT_CREDENTIALS"
-sh-4.2$
