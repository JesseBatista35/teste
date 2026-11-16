Veja qual imagem base a build está usando:
bash
# no produtos4
oc get bc sispi-dict-reivindicacoes -n build-images-ads -o jsonpath='{.spec.strategy.sourceStrategy.from.name}{"\n"}'
Veja quais tags Java 17 existem para essa imagem. Troque <nome_imagem> pelo valor retornado acima, sem a tag:
bash
oc get is <nome_imagem> -n openshift -o jsonpath='{range .spec.tags[*]}{.name}{"\n"}{end}'

Para referência, a build do qrcode-api-validador mostra qual tag está funcionando: a variável tag_imagem dela, ou o mesmo oc get bc com sispi-qrcode-api-validador.
3. Na pipeline de build do SISPI-dict-reivindicacoes, em Variables, troque tag_imagem para a versão Java 17.
4. Rode uma build nova. Isso gera outro build number. Depois crie uma release nova com essa build.

Outro ponto, que não impede a subida: no JAVA_OPTIONS_APPEND do grupo PIX-API-SUPORTE-DES está -Djavaagent:/deployments/lib/main/...applicationinsights-agent-3.5.1.jar. O correto é -javaagent:, sem o D. Do jeito atual, o agente do Application Insights não carrega. Vale avisar o dev.
