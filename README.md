
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -it <pod-sipgc-api-informacoes-tqs> -n sipgc-tqs -- env | grep -i sigoc
-sh: pod-sipgc-api-informacoes-tqs: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -it <pod-sipgc-api-informacoes-tqs> -n sipgc-tqs -- getent hosts <host-sigoc-tqs>
-sh: erro de sintaxe próximo do `token' não esperado `newline'
-sh-4.2$ oc exec -it <pod-sipgc-api-informacoes-tqs> -n sipgc-tqs -- bash -c "timeout 5 bash -c '</dev/tcp/<host-sigoc-tqs>/443' && echo ABERTA || echo SEM CONEXAO"
-sh: pod-sipgc-api-informacoes-tqs: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get egressip
error: the server doesn't have a resource type "egressip"
-sh-4.2$
-sh-4.2$
-sh-4.2$




Jesse, a tela abriu mas não trouxe retorno da lista.
Tem como validar o log?


<img width="1919" height="1026" alt="image" src="https://github.com/user-attachments/assets/14e45b96-e6a2-4181-9a38-945a671c28fd" />
