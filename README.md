
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ H=siepr-backend-intranet-tqs.apps.nprd.caixa
-sh-4.2$ openssl s_client -connect $H:443 -servername $H -showcerts </dev/null 2>/dev/null | grep -E ' s:| i:'
 0 s:/C=BR/O=Caixa Economica Federal/CN=*.apps.nprd.caixa
   i:/C=BR/O=Caixa Economica Federal/CN=AC Icptestes Sub
 1 s:/C=BR/O=Caixa Economica Federal/CN=AC Icptestes Raiz
   i:/C=BR/O=Caixa Economica Federal/CN=AC Icptestes Raiz
-sh-4.2$
-sh-4.2$
-sh-4.2$
