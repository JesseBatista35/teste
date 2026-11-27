Prezado(a), conforme solicitado em demanda, o atendimento foi realizado.

A falha na etapa "Reciclagem sifpp" da release SIFPP (EC DES) ocorria porque o servidor SRJDEAPLLX158 (10.116.95.7) estava com a placa de rede de produção (Network adapter 1, VLAN 3675) desconectada no vCenter. Isso deixava o Domain Controller JBoss inacessível na porta de gerência 9999. A placa foi reconectada, com a opção "Connect At Power On" habilitada, e o JBoss domain, que estava parado, foi iniciado com todas as instâncias do servidor, entre elas a srjdeapllx158_sifpp_intra_8081.

A release SIFPP-0.0.1-SNAPSHOT(511) foi executada novamente em DES e concluiu com sucesso, incluindo a reciclagem, o deploy e a checagem de status.
