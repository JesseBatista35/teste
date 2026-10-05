Bom dia, Sandra! Para eliminar qualquer dúvida na REQ000146323670 / WO0000081763077, segue o meu entendimento do que será feito em DES. Me confirma se está correto?

1) NFS do SINAF (já concluído, WO0000081616760)

nprdnfs01.ad.caixa:/ifs/cpwsprd01/nprd/fs_sihdg_sinaf montado em /sihdg_sinaf (50G)

2) NFS do PowerCenter (esta demanda)

Hoje: hypernprd56.ad.caixa:/fs_sihdg montado em /sihdg_des
Passará a ser: hypernprd56.ad.caixa:/fs_sihdg montado em /sihdg_powercenter

Ou seja: não será criado storage novo. O mesmo export /fs_sihdg continua sendo usado, só muda o nome do ponto de montagem dentro do pod, de /sihdg_des para /sihdg_powercenter (mesmo padrão do TQS). O export /fs_sihdg_des_pwc citado antes não será utilizado.

Pontos para sua confirmação:

O /sihdg_des deixa de existir no pod após a alteração. Existe alguma rotina ou aplicação que ainda use esse caminho?
O tamanho informado (20Gi) é só o valor do volume solicitado? O export /fs_sihdg hoje mostra 50G.
O PATH_DESTINO atual no variable group está como /sihdg/. A troca para /sihdg_powercenter/ está correta?

Com a sua confirmação, eu aplico a alteração, rodo o release e envio o print do terminal do OKD com os dois NFS montados.

Confirmação do que deve ser feito (honesto): o resumo acima bate com o que ela pediu no texto da WO, mas há duas coisas que eu inferi e que você precisa checar antes de executar:

O mount atual de DES. Na WO ela diz que o PATH_DESTINO atual é /sihdg/, mas o df -h do pod mostra /sihdg_des. Confira no variable group qual valor está de fato lá, porque o que você altera é o valor real.
O nome da variável de tamanho. Ela usa SIZE_VOLUME_SINAF também para o PowerCenter, o que parece cópia do pedido do SINAF. Veja no variable group qual variável controla o volume do /fs_sihdg, para não alterar a do SINAF por engano.
