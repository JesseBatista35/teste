Quem realmente administra a parte dos balanceadores internos é a equipe da CETEL02 também, só que é a célula da Rede Datacenter, tem a equipe da Logicalis que é a que presta suporte direto aos balanceadores de carga Citrix 
 
de qualquer forma, eu dei uma olhada por aqui e consegui encontrar algumas configurações e a principio o motivo pelo qual você não recebe o IP da 10.245.x lá na sua captura


 <img width="800" height="506" alt="image" src="https://github.com/user-attachments/assets/4cd504e3-c203-4a27-83e9-494356e9d1db" />


aqui é a configuração do VIP (10.116.180.64 - Porta 443) e os seus serves abaixo, todos com state UP
 
na configuração do Service Group que rege esse VIP, eu encontrei a configuração de IPSET_SNAT
 
com base no que vi, quando esse VIP é consumido, ocorre uma NAT do endereço de origem, seja ele qual for, para um pool de endereços pré configurado
 
1)       Name: IPSET_SNAT
 
        IP:10.116.4.145
        IP:10.116.4.146
        IP:10.116.4.147
        IP:10.116.4.148
        IP:10.116.4.149
        IP:10.116.4.150
        IP:10.116.4.151
        IP:10.116.4.152
        IP:10.116.4.153
        IP:10.116.4.154
        IP:10.116.4.155
        IP:10.116.4.156
        IP:10.116.4.157
        IP:10.116.4.158
 
se eu estiver correto, são esses IPs que vão bater na captura dos server OKD internos (10.116.208.26 - .29)
 
