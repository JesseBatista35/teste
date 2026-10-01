Prezada Sandra,

Conforme solicitado, foram incluídas na Library SIHDG-JBOSS8-TQS as variáveis referentes ao NFS do PowerCenter, montado anteriormente na REQ000145920719 / WO0000081640818:

SERVER_NFS_PWC = hypernprd12.ad.caixa
PATH_NFS_PWC = /fs_sihdg_powercenter
PATH_DESTINO_PWC = /sihdg_powercenter
SIZE_VOLUME_PWC = 50Gi

Os valores foram ajustados conforme o NFS efetivamente montado em TQS (PV sihdg-jboss8-pwc-tqs). Os valores informados na solicitação (/fs_sihdg_des_pwc, /sihdg_des_pwc e 20GiB) correspondem ao ambiente DES e estão sendo tratados na WO0000081763077. Para o tamanho do volume, adotamos o nome SIZE_VOLUME_PWC, para não confundir com a variável do outro NFS.

Após a inclusão, foi executado um novo deploy em 01/10/2026, às 14:20, concluído com sucesso. Os dois NFS seguem montados no ambiente TQS (evidência em anexo):

hypernprd12.ad.caixa:/fs_sihdg_tqs → /sihdg_tqs (20G)
hypernprd12.ad.caixa:/fs_sihdg_powercenter → /sihdg_powercenter (50G)

Encerramos esta solicitação. Em caso de dúvidas, estamos à disposição.

Atenciosamente,
Esteira DevOps DES/TQS NPRD
