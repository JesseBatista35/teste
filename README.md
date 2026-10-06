
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get routes -n siepr-des -o custom-columns=NAME:.metadata.name,HOST:.spec.host,TLS:.spec.tls.termination,TEMCERT:.spec.tls.certificate | cut -c1-160
NAME                           HOST                                           TLS       TEMCERT
siepr-backend-des              siepr-backend-des.apps.nprd.caixa              edge      <none>
siepr-backend-intranet-des     siepr-backend-intranet-des.apps.nprd.caixa     edge      <none>
siepr-carga-des                siepr-carga-des.apps.nprd.caixa                edge      <none>
siepr-curso-bec-frontend-des   siepr-curso-bec-frontend-des.apps.nprd.caixa   edge      <none>
siepr-frontend-des             siepr-frontend-des.apps.nprd.caixa             edge      <none>
siepr-frontend-intranet-des    siepr-frontend-intranet-des.apps.nprd.caixa    edge      <none>
-sh-4.2$
-sh-4.2$
-sh-4.2$ openssl s_client -connect siepr-backend-intranet-des.apps.nprd.caixa:443 \
>   -servername siepr-backend-intranet-des.apps.nprd.caixa -showcerts </dev/null 2>/dev/null | grep -E ' s:| i:'
 0 s:/C=BR/O=Caixa Economica Federal/CN=*.apps.nprd.caixa
   i:/C=BR/O=Caixa Economica Federal/CN=AC Icptestes Sub
 1 s:/C=BR/O=Caixa Economica Federal/CN=AC Icptestes Raiz
   i:/C=BR/O=Caixa Economica Federal/CN=AC Icptestes Raiz
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
