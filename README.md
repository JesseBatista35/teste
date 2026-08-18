oc debug pod/sigfa-api-extratos-des-15-sh4lk -n sigfa-des -c sigfa-api-extratos-des}

cat /usr/src/app/secrets_files/SIGFA_DES/CLISERGFA_SSO_INTRA | xxd | head
env | grep -i "SMALLRYE\|CLISERGFA\|OIDC_CLIENT_CREDENTIALS"
