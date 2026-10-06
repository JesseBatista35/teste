Abra https://siepr-backend-intranet-des.apps.nprd.caixa/q/health, clique em Avançado → Continuar, depois volte na aba do SIEPR e aperte F5.


openssl x509 -in /tmp/AC_Icptestes_Sub.cer -inform DER -out /tmp/AC_Icptestes_Sub.pem -outform PEM 2>/dev/null \
 || cp /tmp/AC_Icptestes_Sub.cer /tmp/AC_Icptestes_Sub.pem
openssl x509 -in /tmp/AC_Icptestes_Sub.pem -noout -subject
cat /tmp/AC_Icptestes_Sub.pem
