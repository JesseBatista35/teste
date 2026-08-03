Prezados,

Identificamos indisponibilidade no Portal SOA (https://portalsoa.caixa/#/principal), apresentando a mensagem "Ocorreu um erro ao listar os serviços" ao carregar o catálogo, com falhas de retorno HTTP 404 em endpoints da API (ex.: /sigsr/v1/propriedad_boss/urlbasenexus:1, /sigsr/v1/tipointerface:1, /sigsr/v1/area-negoc_os=tipoServico::1:1).

Ao tentar validar o host associado (10.121.16.3) via bastion, obtivemos recusa de conexão na porta 22 (ssh: connect to host 10.121.16.3 port 22: Connection refused). Consultando o GestioIP, o IP 10.121.16.3 está classificado como VIP (VIP - INTRANET, hostname SP_SIDEV, site CTC), ou seja, trata-se de um endereço de balanceamento, sem acesso SSH direto por não ser um host real.

Como o escopo da nossa esteira não contempla VIPs/balanceadores, solicitamos à equipe de infraestrutura/rede a verificação da saúde dos backends por trás desse VIP, bem como do balanceamento, visto que o erro reportado na aplicação sugere falha ao consultar os serviços de backend do SIGSR/Portal SOA.

Ambiente: DES
Site: Negocial-Brasília
Sistema: Portal SOA / SIGSR - Governança de Serviços
Comunidade: Canais Próprios Interno
Contato: 61999552792
