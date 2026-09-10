Pessoal, fechamos a investigação do lado OKD4/Router com evidência definitiva.

Capturamos tráfego simultaneamente nos 4 nós do Router (ceadecldlx007-010) durante um teste real coordenado com o Mateus (11:44, confirmado 408). Testamos com filtro pelo VIP de destino e depois sem filtro nenhum de destino (só porta 443) — nenhum pacote da sub-rede da AKS (10.245.153.0/24) chegou em nenhum dos 4 nós, na janela exata do teste.

Isso descarta causa dentro do OKD4 (Router, Route, Service, pod). O problema está na rota entre a AKS (SIGAQ) e o datacenter on-premises.

Jonathan, você já tinha feito a primeira captura nesse chamado — dá pra verificar do lado do CNPRDFW001-1 (ou equivalente) se existe alguma regra específica de rota/firewall para o destino 10.116.180.64:443 partindo da sub-rede 10.245.153.0/24, ou se o ExpressRoute/VPN está passando esse tráfego normalmente?

Silas, seria possível fazer uma captura complementar do lado de dentro da VNet do AKS (via VM jumper), pra confirmar se o pacote sai de fato da rede Azure em direção ao datacenter, ou se já para antes disso? Isso fecharia de que lado exato da rota o tráfego está sendo descartado.
