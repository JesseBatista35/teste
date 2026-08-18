cat /usr/src/app/secrets_files/SIGFA_DES/CLISERGFA_SSO_INTRA | xxd | head

env | grep -iE "SMALLRYE|CLISERGFA|OIDC_CLIENT_CREDENTIALS"

ls -la /usr/src/app/secrets_files/SIGFA_DES/
