1. Veja se a versão antiga ainda está no ar

oc get pods -n siepr-des | grep bec3
oc get rc -n siepr-des | grep bec3
curl -sk https://siepr-curso-bec3-frontend-des.apps.nprd.caixa/assets/config/sso-config.json

Com DeploymentConfig, rollout que falha normalmente mantém o pod anterior (o -18, da release 23). Se o curl responder o JSON, o DES continua de pé com a versão de hoje cedo.

2. Tentar de novo (o 504 costuma ser passageiro)

oc rollout retry dc/siepr-curso-bec3-frontend-des -n siepr-des
oc get pods -n siepr-des -w | grep bec3

Se o retry reclamar, faça Redeploy do stage EC DES na mesma release.

3. Se o 504 continuar

O problema é o registry default-route-openshift-image-registry.apps.produtos4.caixa, e aí é com o time de Nuvem/OKD. Mande o evento do pod com o erro de 504 nas assinaturas.

Um ponto para confirmar com o dev: a imagem é a 1.0.0.4, não 1.0.0-SNAPSHOT. Para DES, vocês normalmente usam a build da develop. Veja se essa release foi criada com o artifact que vocês combinaram na sala.

Manda a saída do passo 1.
