Boa ideia. Pra quem for de Rede conseguir agir rápido, prepara esse conjunto de informações — é basicamente tudo que eles vão te pedir de qualquer forma:
Origem (de onde a conexão está saindo):

Node OKD: ceadecldlx062.nprd.caixa
IP do node: 10.116.208.82
Namespace/cluster: sifof-tqs (OKD4/NPRD)
Pod IP de teste (efêmero, mas útil de referência): 25.1.45.189 (era o IP do pod que falhou, pode já ter mudado)

Destino (pra onde a conexão está tentando ir):

Servidor: nfsctcnprd.ctc.caixa
IP resolvido: 192.168.224.108
Portas testadas: 2049 (NFS) e 111 (RPC/portmapper) — ambas sem resposta (timeout)
Path do share: /ifs/CADSVISISD4/SERVIDORES/CESTI/SIFOF
