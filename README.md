Abra https://siepr-backend-intranet-des.apps.nprd.caixa/q/health, clique em Avançado → Continuar, depois volte na aba do SIEPR e aperte F5.






-sh-4.2$ cd /tmp
-sh-4.2$ H=siepr-backend-intranet-des.apps.nprd.caixa
-sh-4.2$
-sh-4.2$
-sh-4.2$ openssl s_client -connect $H:443 -servername $H -showcerts </dev/null 2>/dev/null \
>   | awk '/BEGIN/{n++} n==2' | sed -n '/BEGIN/,/END/p' > AC_Icptestes_Raiz.cer
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ openssl s_client -connect $H:443 -servername $H </dev/null 2>/dev/null \
>   | openssl x509 -noout -text | grep -A2 "Authority Information Access"
            Authority Information Access:
                CA Issuers - URI:http://icptestes.caixa/certs/acicptestessub.cer

-sh-4.2$
-sh-4.2$
-sh-4.2$ curl -o AC_Icptestes_Sub.cer http://icptestes.caixa/certs/acicptestessub.cer
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100  2244  100  2244    0     0   359k      0 --:--:-- --:--:-- --:--:--  438k
-sh-4.2$
-sh-4.2$
-sh-4.2$
