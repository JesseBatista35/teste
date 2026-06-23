Jesse Mouta Pereira Batista
Boa tarde, Jesse!
 
O técnico atendeu a REQ de Redes... a REQ ainda não foi dada como finalizada, na verdade ainda está "em atendimento", mas eu vi lá que algum técnico criou os VIP (conforme copiado mais abaixo)....   porém fiz testes e continua não encontrando a página:
 
 
 
 
17/06/2026 23:22:41 ;  (P704312)
À
CETEL,
Foi realizada a configuração dos dois VIPs solicitados.
p704312@CADDEAPRLB003-1-Primary> sh lb vserver LB_VS_10.116.181.178_SSL_443
        LB_VS_10.116.181.178_SSL_443 (10.116.181.178:443) - SSL Type: ADDRESS
        State: UP
        Last state change was at Thu Jun 18 02:18:31 2026
        Time since last state change: 0 days, 00:03:09.580
        Effective State: UP
        Client Idle Timeout: 180 sec
        Down state flush: ENABLED
        Disable Primary Vserver On Down : DISABLED
        Appflow logging: ENABLED
        DnsOverHttps: DISABLED
        No. of Bound Services :  1 (Total)       1 (Active)
        Configured Method: LEASTCONNECTION
        Current Method: Round Robin, Reason: Bound service's state changed to UP        BackupMethod: ROUNDROBIN
        Mode: IP
        Persistence: SOURCEIP   Persistence Mask: 255.255.255.255       Persistence Timeout: 15 min
        Vserver IP and Port insertion: OFF
        Push: DISABLED  Push VServer:
        Push Multi Clients: NO
        Push Label Rule: none
        L2Conn: OFF
        Skip Persistency: None
        Listen Policy: NONE
        IcmpResponse: PASSIVE
        RHIstate: ACTIVE
        New Service Startup Request Rate: 0 PER_SECOND, Increment Interval: 0
        Mac mode Retain Vlan: DISABLED
        DBS_LB: DISABLED
        Process Local: DISABLED
        Traffic Domain: 0
        TROFS Persistence honored: ENABLED
        Retain Connections on Cluster: NO
        Order Sequence: ASCENDING
        Current Active Order: None
Bound Service Groups:
1)      Group Name: LB_SG_10.116.181.178_SSL_443
                1) LB_SG_10.116.181.178_SSL_443 (10.116.201.150: 443) - SSL State: UP   Weight: 1 Order: None
p704312@CADDEAPRLB003-1-Primary> sh lb vserver LB_VS_10.116.181.177_SSL_443
        LB_VS_10.116.181.177_SSL_443 (10.116.181.177:443) - SSL Type: ADDRESS
        State: UP
        Last state change was at Thu Jun 18 02:02:39 2026
        Time since last state change: 0 days, 00:02:24.590
        Effective State: UP
        Client Idle Timeout: 180 sec
        Down state flush: ENABLED
        Disable Primary Vserver On Down : DISABLED
        Appflow logging: ENABLED
        DnsOverHttps: DISABLED
        No. of Bound Services :  1 (Total)       1 (Active)
        Configured Method: LEASTCONNECTION
        Current Method: Round Robin, Reason: Bound service's state changed to UP        BackupMethod: ROUNDROBIN
        Mode: IP
        Persistence: SOURCEIP   Persistence Mask: 255.255.255.255       Persistence Timeout: 15 min
        Vserver IP and Port insertion: OFF
        Push: DISABLED  Push VServer:
        Push Multi Clients: NO
        Push Label Rule: none
        L2Conn: OFF
        Skip Persistency: None
        Listen Policy: NONE
        IcmpResponse: PASSIVE
        RHIstate: ACTIVE
        New Service Startup Request Rate: 0 PER_SECOND, Increment Interval: 0
        Mac mode Retain Vlan: DISABLED
        DBS_LB: DISABLED
        Process Local: DISABLED
        Traffic Domain: 0
        TROFS Persistence honored: ENABLED
        Retain Connections on Cluster: NO
        Order Sequence: ASCENDING
        Current Active Order: None
Bound Service Groups:
1)      Group Name: LB_SG_10.116.181.177_SSL_443
                1) LB_SG_10.116.181.177_SSL_443 (10.116.200.228: 443) - SSL State: UP   Weight: 1 Order: None

Atte,
Daniel Farias
TELEDATA/CETEL/REDES
 
