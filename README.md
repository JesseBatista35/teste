Este manual descreve o procedimento para acessar o ambiente OKD Produtos 4 e cancelar builds travadas antes de iniciar uma nova execução.
Manual - Cancelamento de Builds no OKD Produtos 4
1. Acessar o ambiente
Acesse o IP:
 
10.121.105.31
 
2. Obter o Token
Abra a URL abaixo no navegador:
 
https://console-openshift-console.apps.produtos4.caixa/dashboards

 
 
Copie o token de acesso disponibilizado pela console.
3. Autenticar na tela do IP
Na tela acessada pelo IP 10.121.105.31, informe o token obtido no passo anterior.
Importante: Não é necessário executar o login via comando oc login, conforme descrito na Wiki, pois a autenticação já será realizada utilizando o token.
Não executar:
 
oc login api.produtos4.caixa:6443 -u <usuario>

 
 
4. Acessar o projeto
Entre no projeto desejado:
 
oc project build-images-ads
 
5. Verificar builds em execução
Identifique as builds relacionadas ao projeto/microfrontend:
 
oc get build -l buildconfig=SIPNC-cadastropj-microfront
 
Substitua SIPNC-cadastropj-microfront pelo nome do projeto quando necessário.
6. Cancelar builds travadas
Caso existam builds travadas ou em execução indevidamente, execute:
 
oc cancel-build bc/SIPNC-cadastropj-microfront
 
Substitua SIPNC-cadastropj-microfront pelo nome do BuildConfig correspondente.
7. Validar o cancelamento
Execute novamente a consulta para confirmar que as builds foram canceladas:
 
oc get build -l buildconfig=SIPNC-cadastropj-microfront
 
8. Executar nova build
Após confirmar que não existem builds travadas ou em execução, execute uma nova build seguindo o procedimento definido na Wiki.
Observação: Somente iniciar uma nova build após a confirmação do cancelamento das execuções anteriores.
Resumo dos comandos
 
oc project build-images-ads


oc get build -l buildconfig=SIPNC-cadastropj-microfront


oc cancel-build bc/SIPNC-cadastropj-microfront


oc get build -l buildconfig=SIPNC-cadastropj-microfront
 
Observações
A autenticação deve ser realizada via token obtido na Console do OpenShift.
O passo de oc login da Wiki deve ser ignorado.
Após o cancelamento das builds travadas, os demais procedimentos podem ser executados normalmente conforme a Wiki oficial.
