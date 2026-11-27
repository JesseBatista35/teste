Falta cancelar o 126
Ele começou agora porque o 125 saiu da frente. Mas ele é um build de ontem cujo upload já caiu, então não tem mais o zip para receber e vai ficar pendurado de novo. Cancele antes de o dev rodar:

bash
oc cancel-build siavl-atddigital-frontend-126
oc get build -l buildconfig=siavl-atddigital-frontend | grep -E 'Running|New'   # deve voltar vazio

Depois, o dev pode rodar a pipeline 4196 de novo.

Ver se o nó está com problema

bash
# se o build novo cair no mesmo nó e travar em Init, o problema é o nó
oc get pod -l openshift.io/build.name -o wide | grep cadnpcldlx1180

# outros pods presos nesse nó (precisa de permissão no cluster)
oc get pods -A -o wide --field-selector spec.nodeName=cadnpcldlx1180 | grep -Ev 'Running|Completed'
oc describe node cadnpcldlx1180 | grep -A8 Conditions

Se aparecerem outros pods presos em Init ou ContainerCreating nesse nó, ou se o build novo travar de novo ali, leve para a Nuvem/plataforma do produtos4. Informe que o nó cadnpcldlx1180 está deixando pods presos em Init sem evento desde ontem (26/11), afetando o build-images-ads (SIAVL e, muito provavelmente, o SIISF de ontem). A correção ali é isolar o nó (cordon/drain) ou reiniciar o kubelet, o que é com eles.

Se o build novo terminar em uns 20s, fica resolvido para o dev. Mesmo assim vale avisar a plataforma sobre o nó, para não acontecer de novo
