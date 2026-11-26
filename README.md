
Pressione <Control+D> IMEDIATAMENTE se voce nao concorda com as
condicoes deste aviso
***********************************************************************
p585600@10.122.155.62's password:
Last login: Thu Nov 26 09:59:19 2026 from 10.122.150.31
-sh-4.2$ oc login --token=s --server=https://api.nprd.caixa:6443
Logged into "https://api.nprd.caixa:6443" as "p585600@corp.caixa.gov.br" using the token provided.

You have access to 1007 projects, the list has been suppressed. You can list all projects with 'oc projects'

Using project "sispx-des".
-sh-4.2$ echo | openssl s_client -connect indecx.com:443 -servername indecx.com \
>   -proxy proxydes.caixa:80 -showcerts 2>/dev/null | grep -E "s:|i:"
-sh-4.2$
-sh-4.2$
-sh-4.2$ keytool -list -v -keystore /opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd-sisou-20260827.jks \
>   -storepass '<senha>' | grep -E "^Alias|^Owner:"
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$



