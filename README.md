
Informe a Ocorrência:	Restore de Versionamento(backup)
Informe o Contato*:	c129427
Informe o Telefone para Contato*:	11974166441
Data e Horário preferencial para Atendimento:	16/11/2026 10:24:00
Descrição*:	Criamos uma VM para control m caddeapllx2876, mas aparentemente não há IP de backup.
Segue mensagem do prestador da esteira

Ao subir em TQS, a release passa pela atualização do artefato e pelo deploy do pacote, mas falha na etapa "Configura Control-M", na montagem do NFS:

Endpoint NFS indisponivel (TCP/2049) a partir de caddeapllx2876: nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH - Timeout

Causa: antes o TQS usava a VM de DES.
Agora a esteira criou uma VM própria para TQS (caddeapllx2876), e ela foi criada sem a interface de rede de backup. O storage Isilon (nfsctcnprd.ctc.caixa = 192.168.224.111) fica na rede de backup, então a VM não chega nele.


cara ele abri ureq mais acredito que o aramzaemanto nao vai atenser assim

tem que ser pelo infrafaic lconforme a wiki certo
