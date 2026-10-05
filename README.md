

Gostaria de ajustar para ficar assim:
 
No ponto de montagem atual do POWERCENTER alterar de /sihdg_des -> para /sihdg_des_pwc
 
No ponto de montagem atual do SINAF alterar de /sihdg_sinaf -> para /sihdg_des
 
Pois preciso manter a propriedade SIHDG-path.arquivo.sinaf apontada para /sihdg_des/Arquivos_Sinaf
 
Dai, poderia gerar a release e enviar o print do terminal OKD com os 2 NFS montados (/sihdg_des e /sihdg_des_pwc)
 
pode ser assim?
 
 
Após ajustes teríamos:
 
SINAF: nprdnfs01.ad.caixa:/ifs/cpwsprd01/nprd/fs_sihdg_des montado em /sihdg_des (50G)
 
POWERCENTER: hypernprd56.ad.caixa:/fs_sihdg_des_pwc montado em /sihdg_des_pwc (50G)
 
