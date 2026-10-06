H=siepr-backend-intranet-tqs.apps.nprd.caixa
openssl s_client -connect $H:443 -servername $H -showcerts </dev/null 2>/dev/null | grep -E ' s:| i:'
