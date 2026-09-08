Nota de investigação – Falha de acesso ao cluster AKS DES (aks-sipdd-des) via kubectl

Resumo: Ao executar kubectl contra o cluster aks-sipdd-des (namespace sigaq-api-gestao-documental), a autenticação com o AKS ocorreu normalmente, porém a resolução de nome do endpoint privado falhou, impedindo qualquer comunicação com a API do cluster.

Investigação realizada:

Erro inicial: falha de DNS ao resolver o FQDN dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io via resolver padrão do Azure (168.63.129.16), retornando NXDOMAIN.
Confirmado que o FQDN retornado pelo AKS (az aks show) está correto e corresponde ao registro existente na Private DNS Zone aks-sipdd-des.privatelink.brazilsouth.azmk8s.io (resource group rg-sipdd-des), que contém o record dns-aks-sipdd-des-ebg0b8an.
Identificado que essa zona está vinculada (virtual network link) a duas VNets:
VNET-GESTAOARQ-DES (mesma subscription do AKS)
VNET-INFRA-SERVICES (subscription RG-INFRA-SERVICES: 7dbbb221-d545-4162-9a16-6c4cb75ed4d9), que hospeda os servidores DNS customizados usados para resolução dessa zona.
Servidores DNS identificados: 10.244.37.197 e 10.244.37.198.
Testes de resolução (nslookup) contra esses IPs, a partir da estação conectada via VPN corporativa, resultaram em timeout de comunicação (porta 53), e não mais em NXDOMAIN — indicando que não há rota de rede e/ou liberação de firewall da VPN até o subnet 10.244.37.0/24 (RG-INFRA-SERVICES).

Conclusão: O problema não é de configuração de DNS nem do cluster AKS, e sim de conectividade de rede entre a VPN corporativa e a VNET-INFRA-SERVICES, impedindo o alcance aos servidores DNS 10.244.37.197 e 10.244.37.198 na porta 53 (UDP/TCP).

Pendência: Solicitar à equipe CETEL/Redes a liberação de rota e regra de firewall entre a VPN e os IPs 10.244.37.197 e 10.244.37.198, porta 53 (UDP/TCP), para viabilizar a resolução da zona privada aks-sipdd-des.privatelink.brazilsouth.azmk8s.io e o acesso ao cluster AKS DES via kubectl.
