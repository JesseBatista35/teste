oc get pod sitop-frontend-des-5-mzzkd -o jsonpath='{.spec.containers[*].name}{"\n"}'

Aí use o nome que aparecer.

6. Pegue o log correto
oc logs sitop-frontend-des-5-mzzkd --previous --tail=200

Se tiver mais de um container:

oc logs sitop-frontend-des-5-mzzkd -c NOME_REAL_DO_CONTAINER --previous --tail=200
7. Entrar no container
oc exec -it sitop-frontend-des-5-mzzkd -c NOME_REAL_DO_CONTAINER -- sh

Dentro dele, rode:

pwd
ls -la /
find / -name "*.js" 2>/dev/null | head -100
find / -name "main*.js" 2>/dev/null | head -50

O ponto principal: antes você estava procurando arquivos no agent do Azure DevOps, por isso apareceu /opt/ads-agent, não os arquivos reais da aplicação frontend .

Agora o bloqueio é autenticação no OpenShift. Resolva primeiro o oc login; depois conseguimos pegar o log real e achar onde está o main*.js.
