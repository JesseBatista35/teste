$
-sh-4.2$
-sh-4.2$ oc get routes -n siepr-tqs -o custom-columns=NAME:.metadata.name,HOST:.spec.host,TLS:.spec.tls.termination,CERT:.spec.tls.certificate | cut -c1-160
NAME                           HOST                                           TLS       CERT
siepr-backend-intranet-tqs     siepr-backend-intranet-tqs.apps.nprd.caixa     edge      <none>
siepr-backend-tqs              siepr-backend-tqs.apps.nprd.caixa              edge      <none>
siepr-curso-bec-frontend-tqs   siepr-curso-bec-frontend-tqs.apps.nprd.caixa   edge      <none>
siepr-frontend-intranet-tqs    siepr-frontend-intranet-tqs.apps.nprd.caixa    edge      <none>
siepr-frontend-tqs             siepr-frontend-tqs.apps.nprd.caixa             edge      <none>
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ H=<
