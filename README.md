#####################################
	pipeline build erro  unexpected EOF
#####################################
Pessoal, boa tarde!
Quem pegar o erro abaixo de connection erro para o api.produtos, seguem o procedimento:
- Erro de exemplo na build SIPNC-cadastropj-microfront:
I0115 16:17:44.453729   73230 helpers.go:219] Connection error: Post https://api.produtos4.caixa:6443/apis/build.openshift.io/v1/namespaces/build-images-ads/buildconfigs/sipnc-cadastropj-microfront/instantiatebinary?name=sipnc-cadastropj-microfront&namespace=build-images-ads: unexpected EOF
F0115 16:17:44.453751   73230 helpers.go:119] Unable to connect to the server: unexpected EOF
##[error]Bash exited with code '255'.
Finishing: Executando Build S2I Binary
- Segue a url de apio para resolução deste problema:
http://wiki.suporte.caixa/index.php/ADS_-_TASK_-_Executando_Build_S2I_Binary
Resumindo o procedimento é este aqui:
$ oc login api.produtos4.caixa:6443 -u <p*****>                # Para logar no api.produtos
$ oc project build-images-ads                                  # Entrar no projeto
$ oc get build -l buildconfig=SIPNC-cadastropj-microfront      # Verificar o que está em execução
$ oc cancel-build bc/SIPNC-cadastropj-microfront               # Cancelar as builds travadas
$ oc get build -l buildconfig=SIPNC-cadastropj-microfront      # Verificar novamente e após isso, só executar uma nova build.
