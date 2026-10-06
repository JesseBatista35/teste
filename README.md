Abra https://siepr-backend-intranet-des.apps.nprd.caixa/q/health, clique em Avançado → Continuar, depois volte na aba do SIEPR e aperte F5.



openssl x509 -in /tmp/AC_Icptestes_Sub.cer -inform DER -noout -text 2>/dev/null | grep -A2 "Authority Information Access" \
 || openssl x509 -in /tmp/AC_Icptestes_Sub.cer -noout -text | grep -A2 "Authority Information Access"
