Abra https://siepr-backend-intranet-des.apps.nprd.caixa/q/health, clique em Avançado → Continuar, depois volte na aba do SIEPR e aperte F5.





cd /tmp
H=siepr-backend-intranet-des.apps.nprd.caixa

# Raiz (o próprio servidor envia)
openssl s_client -connect $H:443 -servername $H -showcerts </dev/null 2>/dev/null \
  | awk '/BEGIN/{n++} n==2' | sed -n '/BEGIN/,/END/p' > AC_Icptestes_Raiz.cer

# Endereço de download do Sub (vem dentro do certificado)
openssl s_client -connect $H:443 -servername $H </dev/null 2>/dev/null \
  | openssl x509 -noout -text | grep -A2 "Authority Information Access"


  curl -o AC_Icptestes_Sub.cer '<URL que apareceu>'

  
