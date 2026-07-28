oc debug -n sispl-des --image=default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispl-api-mkp:3.32.0.3 -- bash
# dentro do pod de debug:
nc -zv 10.192.224.76 5021
nc -zv 10.192.224.76 5051
nc -zv 10.192.228.145 1418
curl -vk https://logindes.caixa.gov.br/auth/realms/internet
