Entendo que a solução de DES ficou diferente do modelo de TQS.
 
- Em TQS --> tenho um único servidor com dois pontos de montagem
	hypernprd12.ad.caixa:/fs_sihdg_tqs → /sihdg_tqs (20G)
	hypernprd12.ad.caixa:/fs_sihdg_powercenter → /sihdg_powercenter (50G)
 
- Em DES --> tenho 2 servidores cada um com um ponto de montagem
  	Servidor: nprdnfs01.ad.caixa 
  	Path: /ifs/cpwsprd01/nprd/fs_sihdg_sinaf
 
	FQDN: hypernprd56.ad.caixa - 10.188.0.0/16
	PATH: /fs_sihdg
 
 
Pode ser assim?


