mesmo rodandocom outro agent

========================== Starting Command Output ===========================
/bin/bash /opt/ads-agent/_work/_temp/6d81925c-ef88-4ff7-972e-b47fba536349.sh
+ echo okd4_nprd
+ egrep -q '^(okd4|ocp)'
+ buildconfig=sibec-estatico
+ oc start-build sibec-estatico --from-dir=/opt/ads-agent/_work/428/a --follow --wait=true -n build-images-ads -v=5
I0904 13:06:44.020925 3789622 repository.go:450] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
I0904 13:06:44.022778 3789622 repository.go:533] Error executing command: exit status 128
Uploading directory "/opt/ads-agent/_work/428/a" as binary input for the build ...
I0904 13:06:44.022875 3789622 tar.go:238] Adding "/opt/ads-agent/_work/428/a" to tar ...
I0904 13:06:44.024140 3789622 tar.go:336] Adding to tar: /opt/ads-agent/_work/428/a/.s2i as .s2i
I0904 13:06:44.024516 3789622 tar.go:336] Adding to tar: /opt/ads-agent/_work/428/a/.s2i/bin as .s2i/bin
I0904 13:06:44.024665 3789622 tar.go:336] Adding to tar: /opt/ads-agent/_work/428/a/.s2i/bin/assemble as .s2i/bin/assemble
I0904 13:06:44.024716 3789622 tar.go:336] Adding to tar: /opt/ads-agent/_work/428/a/.s2i/bin/run as .s2i/bin/run
I0904 13:06:44.024763 3789622 tar.go:336] Adding to tar: /opt/ads-agent/_work/428/a/sibec-estatico.zip as sibec-estatico.zip
............
Uploading finished
I0904 13:07:44.044965 3789622 helpers.go:237] Connection error: Post https://api.produtos4.caixa:6443/apis/build.openshift.io/v1/namespaces/build-images-ads/buildconfigs/sibec-estatico/instantiatebinary?name=sibec-estatico&namespace=build-images-ads: unexpected EOF
Unable to connect to the server: unexpected EOF
##[error]Bash exited with code '1'.
##[warning]RetryHelper encountered task failure, will retry (attempt #: 1 out of 1) after 1000 ms
Generating script.
========================== Starting Command Output ===========================
/bin/bash /opt/ads-agent/_work/_temp/65a1b936-c9d6-41e2-a39f-a1df0f11ef4f.sh
+ echo okd4_nprd
+ egrep -q '^(okd4|ocp)'
+ buildconfig=sibec-estatico
+ oc start-build sibec-estatico --from-dir=/opt/ads-agent/_work/428/a --follow --wait=true -n build-images-ads -v=5
I0904 13:07:45.204334 3789652 repository.go:450] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
I0904 13:07:45.205997 3789652 repository.go:533] Error executing command: exit status 128
Uploading directory "/opt/ads-agent/_work/428/a" as binary input for the build ...
I0904 13:07:45.206119 3789652 tar.go:238] Adding "/opt/ads-agent/_work/428/a" to tar ...
I0904 13:07:45.206498 3789652 tar.go:336] Adding to tar: /opt/ads-agent/_work/428/a/.s2i as .s2i
I0904 13:07:45.206873 3789652 tar.go:336] Adding to tar: /opt/ads-agent/_work/428/a/.s2i/bin as .s2i/bin
I0904 13:07:45.207016 3789652 tar.go:336] Adding to tar: /opt/ads-agent/_work/428/a/.s2i/bin/assemble as .s2i/bin/assemble
I0904 13:07:45.207169 3789652 tar.go:336] Adding to tar: /opt/ads-agent/_work/428/a/.s2i/bin/run as .s2i/bin/run
I0904 13:07:45.207323 3789652 tar.go:336] Adding to tar: /opt/ads-agent/_work/428/a/sibec-estatico.zip as sibec-estatico.zip
............
Uploading finished
I0904 13:08:45.223602 3789652 helpers.go:237] Connection error: Post https://api.produtos4.caixa:6443/apis/build.openshift.io/v1/namespaces/build-images-ads/buildconfigs/sibec-estatico/instantiatebinary?name=sibec-estatico&namespace=build-images-ads: unexpected EOF


nao seria interassaante fazer isso primeiro

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
