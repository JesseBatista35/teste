Calma, Thiago. Agora apareceu uma pista importante:

oc exec -it -n sitop-des sitop-frontend-des-5-mzzkd -c sitop-frontend-des-exporter -- sh

retornou:

contêiner não encontrado ("sitop-frontend-des-exporter")

Isso significa que o pod até foi encontrado, mas esse não é o nome real do container dentro dele.

Já este erro:

error: the server doesn't have a resource type "pods"

indica que seu oc pode estar com contexto/API estranho ou sessão inconsistente. Antes de continuar, rode estes comandos exatamente assim:

oc version
oc whoami
oc whoami --show-server
oc project

Depois rode:

oc get projects | grep -i sitop

Agora tente listar tudo do namespace:

oc get all -n sitop-des

Se funcionar, liste os pods com abreviação:

oc get po -n sitop-des

Depois pegue o nome real dos containers do pod:

oc get po sitop-frontend-des-5-mzzkd -n sitop-des -o jsonpath='{.spec.containers[*].name}{"\n"}'

Esse comando vai te mostrar algo como:

sitop-frontend-des
nginx
frontend

Aí você usa o nome que aparecer. Exemplo:

oc logs -n sitop-des sitop-frontend-des-5-mzzkd -c NOME_REAL_DO_CONTAINER --previous --tail=200

E para entrar:

oc exec -it -n sitop-des sitop-frontend-des-5-mzzkd -c NOME_REAL_DO_CONTAINER -- /bin/sh

Outro detalhe: esse comando que você tentou não vai funcionar como esperado:

pwd ls -la / ls -la /opt find / -name ".js"

Tem que rodar separado, um por linha:

pwd
ls -la /
ls -la /opt
find / -name "*.js" 2>/dev/null | head -100
find / -name "main*.js" 2>/dev/null | head -50

E atenção: você digitou:

find / -name ".js"

O certo é:

find / -name "*.js"

Resumo do que está acontecendo: você ainda não conseguiu entrar no container certo. No retorno anterior, os arquivos encontrados eram do /opt/ads-agent, ou seja, do agent do Azure DevOps, não da aplicação frontend .

O próximo comando mais importante agora é este:

oc get po sitop-frontend-des-5-mzzkd -n sitop-des -o jsonpath='{.spec.containers[*].name}{"\n"}'

Ele vai dizer o nome correto do container para usar no oc logs e no oc exec.
