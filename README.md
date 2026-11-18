
p585600@10.122.155.62's password:
Last login: Tue Nov 17 09:22:54 2026 from 10.122.150.31
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n sipgc-des | grep informacoes
error: the server doesn't have a resource type "pods"
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc login --token=sha256~Skr9f37iMOauKjhjrs35sm3aVkROx2CJkrYOOTlxvo0 --server=https://api.nprd.caixa:6443
Logged into "https://api.nprd.caixa:6443" as "p585600@corp.caixa.gov.br" using the token provided.

You have access to 1004 projects, the list has been suppressed. You can list all projects with 'oc projects'

Using project "default".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -it <pod-informacoes-des> -n sipgc-des -- bash -c "timeout 5 bash -c '</dev/tcp/des.sigoc.caixa/443' && echo ABERTA || echo SEM CONEXAO"
-sh: pod-informacoes-des: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc project sipgc-des
Now using project "sipgc-des" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -it <pod-informacoes-des> -n sipgc-des -- bash -c "timeout 5 bash -c '</dev/tcp/des.sigoc.caixa/443' && echo ABERTA || echo SEM CONEXAO"
-sh: pod-informacoes-des: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
