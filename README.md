# IP do pod e nó onde ele está rodando
oc get pod sispl-api-apostas-des-5877bdc6cb-d5pg2 -n sispl-des -o wide

# IP do pod visto de dentro
oc exec sispl-api-apostas-des-5877bdc6cb-d5pg2 -c sispl-api-apostas-des -n sispl-des -- hostname -i

# IP do nó (pode dar forbidden sem cluster-reader)
oc get node <NODE_DO_COMANDO_ACIMA> -o wide

# Egress IP do namespace, se houver (geralmente exige permissão de admin)
oc get egressip 2>/dev/null

# IP da API do cluster e do agente ADS
getent hosts api.nctvmrh001.nuvem.caixa
hostname -I
