Gilberto, a REQ da build já foi concluída: a build com os 3 subprojetos está funcionando e a tag 0.0.182.1 publicou os artefatos corretamente no Nexus.

Ao subir em TQS, a release passa pela atualização do artefato e pelo deploy do pacote, mas falha na etapa "Configura Control-M", na montagem do NFS:

Endpoint NFS indisponivel (TCP/2049) a partir de caddeapllx2876: nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH - Timeout

Causa: antes o TQS usava a VM de DES. Agora a esteira criou uma VM própria para TQS (caddeapllx2876), e ela foi criada sem a interface de rede de backup. O storage Isilon (nfsctcnprd.ctc.caixa = 192.168.224.111) fica na rede de backup, então a VM não chega nele. A VM de DES (caddeapllx2695) tem essa interface (IP 192.168.242.175) e monta o NFS normalmente.

Precisa abrir uma solicitação para isso. Segue o texto abaixo. Assim que for atendida, é só refazer o deploy do stage EC TQS.
