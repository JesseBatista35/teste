Preciso rodar um teste de conectividade de dentro de um pod do SIGAQ (namespace sigaq-api-gestao-documental, cluster aks-sipdd-des), pra apoiar uma investigação de rede com o time de Redes Extranet/Nuvem (Jonathan) sobre comunicação Azure DES → on-premises DES.

Não tenho como rodar o kubectl nesse cluster: pela VPN corporativa e pelo Cloud Shell, ambos falham na resolução da zona DNS privada aks-sipdd-des.privatelink.brazilsouth.azmk8s.io, porque nenhum dos dois está dentro da VNet correta (VNET-GESTAOARQ-DES / VNET-INFRA-SERVICES). Meu bastion (cadsvitrlx100) só me dá acesso ao lado OKD, não ao AKS.

Alguém aí teria acesso a esse cluster de algum ponto já integrado à VNet, ou consegue rodar comigo os comandos abaixo dentro de um pod do SIGAQ?

getent hosts sigda-api-quarkus-des.apps.nprd.caixa
curl -v --max-time 10 https://sigda-api-quarkus-des.apps.nprd.caixa:443/

O Jonathan (Redes Extranet e Nuvem) já tem uma captura armada no firewall (CNPRDFW001-1) esperando esse teste.
