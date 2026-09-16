
sipge-webhook-des-37-26n8q   1/1       Running   0          10m
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc describe pod <pod-mais-novo-da-lista> -n sipge-des
-sh: pod-mais-novo-da-lista: Arquivo ou diretório não encontrado
-sh-4.2$ ^C
-sh-4.2$ oc describe sipge-webhook-des-37-26n8q  -n sipge-des
error: the server doesn't have a resource type "sipge-webhook-des-37-26n8q"
-sh-4.2$
