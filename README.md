Eu entendo a irritação. Vamos parar de tentar comandos “no chute”: o erro mudou para problema de contexto/cliente oc, então vou te passar uma sequência curta para descobrir exatamente onde ele está apontando.

Thought for 17s

Você tem razão em ficar irritado. Os comandos estão falhando porque não é mais só erro no pod. Agora parece que o oc está com contexto errado, versão incompatível ou login apontando para o servidor errado.

O erro mais grave é este:

erro: o servidor não possui um recurso do tipo "pods"

Em OpenShift/Kubernetes normal, pods, po, all e projects existem. Se ele diz que não existe, então uma destas coisas está acontecendo:

o oc está apontando para o endpoint errado;
o oc é muito antigo/incompatível;
o kubeconfig/contexto está quebrado;
você está dentro de um ambiente que tem oc, mas não está autenticado no cluster certo.

E sim: no primeiro comando você juntou tudo em uma linha:

oc version oc whoami oc whoami --show-server oc project

Isso fez o oc interpretar tudo como parte do comando oc version, por isso deu erro de flag. Tem que rodar um por vez.

Rode exatamente estes comandos, um de cada vez:

which oc
oc version
oc whoami
oc config current-context
oc config view --minify

Agora o mais importante:

oc api-resources | head -50

Se esse comando não mostrar pods, services, deployments, etc., o seu oc não está conectado ao cluster Kubernetes/OpenShift correto.

Também testa esse:

oc get namespaces

Se der erro de novo dizendo que não existe namespaces, está confirmado: não adianta tentar oc logs, oc exec ou oc get pods nesse contexto.

Sobre o erro do container:

contêiner não encontrado ("sitop-frontend-des-exporter")

Esse erro indica que esse nome de container está errado. Mas para descobrir o nome certo, precisaríamos conseguir rodar:

oc get pod sitop-frontend-des-5-mzzkd -n sitop-des -o yaml

Só que seu oc está dizendo que nem conhece pod/pods, então antes precisamos corrigir o acesso/contexto do oc.

O caminho agora é este:

oc config view --minify

Procure no retorno algo assim:

clusters:
- cluster:
    server: https://...

Se o server estiver apontando para URL errada, por exemplo console, portal, rota web ou outro endpoint que não seja API do OpenShift, o correto é fazer login novamente com a URL de API do cluster:

oc login https://URL-DA-API-DO-OPENSHIFT:6443

Em OpenShift 4, geralmente a URL da API tem formato parecido com:

https://api.nome-do-cluster.dominio:6443

Não pode ser a URL da console web.

Depois que o login/contexto estiver certo, aí sim os comandos devem funcionar:

oc project sitop-des
oc get pods
oc get pod sitop-frontend-des-5-mzzkd -o jsonpath='{.spec.containers[*].name}{"\n"}'
oc logs sitop-frontend-des-5-mzzkd --previous --tail=200

Resumo bem direto: você não está errando tudo. O ambiente está ruim. O erro atual mostra que o oc não está conseguindo acessar os recursos básicos do cluster, mesmo você tentando comandos corretos. Antes de investigar o main*.js, precisa corrigir o login/contexto do oc. O retorno que você já mandou mostra que você estava vendo arquivos do /opt/ads-agent, ou seja, do agent e não da aplicação .
