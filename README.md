-sh-4.2$ curl -v -X POST https://integra.iniciadora.caixa.gov.br/inic-pagto/nucleo/v1/jornada \
>   -H "Content-Type: application/json" \
>   -d '{
>     "idConvenioParceiro": 138,
>     "usuarioLogado": {
>       "documento": {
>         "identificacao": "49317484905",
>         "tipoDocumento": "CPF",
>         "nome": "TEST"
>       }
>     },
>     "valor": "25.00"
>   }'
* About to connect() to integra.iniciadora.caixa.gov.br port 443 (#0)
*   Trying 200.201.168.58...
^C
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ^C
-sh-4.2$ oc logs -n openshift-ingress deployment/router-default | tail -50
Found 4 pods, using pod/router-default-556cdc9cb7-rrqln
I0615 18:15:48.411754       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181548 (2538835) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:15:53.399199       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181553 (2538846) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:15:58.399277       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181558 (2538857) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:16:03.355366       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181603 (2538868) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:16:08.449319       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181608 (2538879) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:16:13.357294       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181613 (2538890) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:16:18.385101       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181618 (2538901) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:16:23.498089       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181623 (2538912) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:16:28.379992       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181628 (2538923) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:16:33.341106       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181633 (2538934) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:16:38.366467       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181638 (2538945) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:16:44.167963       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181644 (2538956) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:16:49.256664       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181649 (2538967) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:16:54.284181       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181654 (2538978) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:16:59.219214       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181659 (2538989) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:17:11.439595       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181711 (2539000) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:17:19.391202       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181719 (2539011) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:17:24.221506       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181724 (2539022) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:17:29.282308       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181729 (2539033) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:17:34.297014       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181734 (2539044) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:17:41.307733       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181741 (2539055) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:17:46.434059       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181746 (2539066) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:17:51.365532       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181751 (2539077) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:17:56.326446       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181756 (2539088) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:18:02.876257       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181802 (2539099) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:18:07.854034       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181807 (2539110) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:18:13.603321       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181813 (2539121) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:18:18.524959       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181818 (2539132) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:18:23.498833       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181823 (2539143) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:18:28.609741       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181828 (2539154) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:18:33.572500       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181833 (2539165) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:18:38.498203       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181838 (2539176) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:18:45.190888       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181845 (2539187) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:18:50.188783       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181849 (2539198) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:18:55.075651       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181854 (2539209) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:19:00.097005       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181859 (2539220) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:19:05.143928       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181904 (2539231) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:19:10.159467       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181909 (2539242) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:19:15.115015       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181914 (2539253) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:19:20.108745       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181919 (2539264) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:19:25.139135       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181924 (2539275) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:19:30.147295       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181929 (2539286) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:19:35.127328       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181934 (2539297) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:19:44.677766       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181944 (2539308) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:19:49.709640       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181949 (2539319) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:19:55.159224       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181954 (2539330) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:20:00.120236       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/181959 (2539341) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:20:05.121551       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/182004 (2539352) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:20:10.202935       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/182009 (2539363) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
I0615 18:20:15.112295       1 router.go:618] template "msg"="router reloaded" "output"="[WARNING] 165/182014 (2539374) : config : 'option h1-case-adjust-bogus-client' ignored for frontend 'public_ssl' as it requires HTTP mode.\n - Checking http://localhost:80 ...\n - Health check ok : 0 retry attempt(s).\n"
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc port-forward pod/siinp-nucleo-tqs-513-7hgs9 8080:8080
Forwarding from 127.0.0.1:8080 -> 8080
Forwarding from [::1]:8080 -> 8080
^C-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ curl -v -X POST http://localhost:8080/inic-pagto/nucleo/v1/jornada \
>   -H "Content-Type: application/json" \
>   -d '{"valor": "25.00"}'
* About to connect() to localhost port 8080 (#0)
*   Trying ::1...
* Conexão recusada
*   Trying 127.0.0.1...
* Conexão recusada
* Failed connect to localhost:8080; Conexão recusada
* Closing connection 0
curl: (7) Failed connect to localhost:8080; Conexão recusada
-sh-4.2$
