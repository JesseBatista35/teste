Boa tarde! o fluxo de conexão entre o ambiente Azure DES e o ambiente on-premises ocorre através de um circuito express route onde temos a configuração de BGP como protocolo de comunicação dessas redes, atualmente esse BGP promove o roteamento dos blocos de endereços 10.245.x.x específicos do desenvolvimento AZURE e publica para a AZURE o bloco de endereçamento 10.0.0.0/8, ou seja, toda a comunicação com o ambiente on-premises usufrui do roteamento abrangente que a rota 10.0.0.0/8 provê.
 
Não existe nenhum roteamento específico que se faça necessário para essa comunicação ocorrer, tanto que nas capturas de firewall, nós conseguimos coletar dados desse fluxo, o que garante a conectividade entre as pontas fim a fim.


<img width="1113" height="211" alt="image" src="https://github.com/user-attachments/assets/864e1208-71e7-4602-8103-aa98b02158a6" />

A regra que atende a essa conexão no ambiente on-premises é uma regra que contempla todo o /24 da VNET de origem, ou seja, qualquer endereço que vier de lá com destino a esse IP 10.116.180.64 porta 443, o FW vai deixar passar!


para evidenciar isso com vocês, eu sugiro repetir os testes realizados comigo em sala acompanhando em real-time no FW


eu deixei uma captura montada no FW para esse fluxo desde ontem e tem algumas conexões que já passaram nela, vou disponibilizar aqui para vocês, conseguem confirmar se foram dos testes que vocês realizaram?

<img width="1427" height="306" alt="image" src="https://github.com/user-attachments/assets/4b55be81-8878-4492-9453-8d16676aa5bd" />

podem considerar o horário a esquerda em UTC
 
aproveito para disponibilizar a captura em formato .pcap para wireshark
CNPRDFW001-1-capture_SIGAQ.pcap


 
