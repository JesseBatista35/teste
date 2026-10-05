Para eliminar qualquer dúvida na REQ000146323670 / WO0000081763077, segue o meu entendimento do que será feito em DES. Me confirma se está correto?

Situação atual em DES (variable group SIHDG-JBOSS8-DES)

SINAF: nprdnfs01.ad.caixa:/ifs/cpwsprd01/nprd/fs_sihdg_sinaf montado em /sihdg_sinaf (50G), já concluído na WO0000081616760
PowerCenter: hypernprd56.ad.caixa:/fs_sihdg montado em /sihdg_des (50G)

O que será feito

O mesmo export hypernprd56.ad.caixa:/fs_sihdg passará a ser montado em /sihdg_powercenter (renomeado de /sihdg_des), igual ao padrão do TQS
Não será criado storage novo, e o export /fs_sihdg_des_pwc citado antes não será utilizado
O SINAF permanece como está, em /sihdg_sinaf

Pontos para sua confirmação

No pedido consta PATH_DESTINO = /sihdg_sinaf/ junto com hypernprd56:/fs_sihdg, mas em DES o /sihdg_sinaf é o storage nprdnfs01. Confirma que o único ajuste é /sihdg_des → /sihdg_powercenter?
Hoje a propriedade SIHDG-path.arquivo.sinaf aponta para /sihdg_des/. Com a troca, esse caminho deixa de existir. Para onde a aplicação deve ler os arquivos do SINAF depois da mudança: /sihdg_sinaf/ ou /sihdg_powercenter/?
O SIZE_VOLUME_SINAF=20Gi se refere ao PowerCenter? Se sim, o volume atual está com 50Gi e não será reduzido. Pode manter assim?

Com a sua confirmação eu aplico, rodo o release e envio o print do terminal do OKD com os dois NFS montados (/sihdg_sinaf e /sihdg_powercenter).
