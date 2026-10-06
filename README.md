Assunto: Correção da interface de backup – caddeapllx2781 (TQS)

O servidor caddeapllx2781.agil.nprd.caixa.gov.br (ens192 10.116.201.252/19) possui a interface de backup ens224 com IP 192.168.221.15/19, ou seja, na faixa 192.168.192.0/19. Com isso ele não alcança o Isilon nfsctcnprd.ctc.caixa (192.168.224.102), e a montagem NFS do SISME-rotinas falha com Connection timed out.

Para comparação, o servidor caddeapllx2193, da mesma rede de serviço, possui ens224 em 192.168.233.69/19 (faixa 192.168.224.0/19) e monta o Isilon normalmente.

Solicito ajustar a ens224 do caddeapllx2781 para a VLAN/faixa 192.168.224.0/19, com alocação de IP correspondente. A CETEL (Valdir Soares) confirmou que a rede de backup é isolada e que o host precisa estar conectado a ela.

Atualização para o Valdir:

Valdir, obrigado pela orientação. Confirmamos que o caddeapllx2781 já tem interface de backup, mas na faixa 192.168.192.0/19 (192.168.221.15), enquanto o Isilon está em 192.168.224.0/19. Um servidor equivalente (caddeapllx2193) está em 192.168.233.69 e funciona. Vamos solicitar à Virtualização o ajuste da interface para a faixa correta.
