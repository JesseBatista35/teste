Oi Sandra, tudo bem? Atualizando as duas demandas do NFS do PowerCenter do SIHDG:

WO0000081771264 (TQS – variáveis na Library): já incluímos na Library SIHDG-JBOSS8-TQS as variáveis do NFS do PowerCenter, com os valores conferidos no ambiente:

SERVER_NFS_PWC = hypernprd12.ad.caixa
PATH_NFS_PWC = /fs_sihdg_powercenter
PATH_DESTINO_PWC = /sihdg_powercenter
SIZE_VOLUME_PWC = 50Gi

Os valores da solicitação (/fs_sihdg_des_pwc, /sihdg_des_pwc, 20GiB) são os de DES, por isso usamos os reais de TQS. Estamos rodando um deploy para validar e em seguida te mando o print do terminal com os dois NFS montados (/sihdg_tqs e /sihdg_powercenter).

WO0000081763077 (DES – novo ponto PowerCenter): só preciso confirmar:

O /sihdg_des_pwc (hypernprd56.ad.caixa:/fs_sihdg_des_pwc, 20GiB) entra como ponto adicional, mantendo o /sihdg_des atual?
O export /fs_sihdg_des_pwc já está criado no hypernprd56?
