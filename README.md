TESTE


# IPs dos nodes (sem EgressIP, é o IP do node que sai)
oc get nodes -o wide

# Verificar se há EgressIP configurado (OVN-Kubernetes)
oc get egressip
oc get namespace sispl-des -o yaml | grep -i egress

# Teste de dentro do namespace, com imagem do registry interno
oc run nettest -n sispl-des --rm -it --image=<imagem-ubi-do-registry> -- bash
  getent hosts sicsn.caixa
  curl -v --connect-timeout 10 https://sicsn.caixa/BeyondTrust/api/public/v3/Auth/connect/token


  oc describe pod "$last_pod" -n sispl-des | tail -n 30
oc logs "$last_pod" -n sispl-des --all-containers --prefix || true
