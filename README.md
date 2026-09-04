Prezados!

A esteira suporta múltiplos NFS simultaneamente para a mesma aplicação ou existe alguma restrição que impeça o compartilhamento de dois destinos usarem o mesmo export NFS?  


1. No servidor SIHDG-JBOSS8-DES tínhamos um NFS montado para integração SIHDG x MAINFRAME:
   SERVER_NFS = hypernprd12.ad.caixa
   PATH_NFS = /fs_sihdg
   PATH_DESTINO = /sihdg/        
       -->> Pode alterar para PATH_DESTINO = /sihdg_sinaf/?
   SIZE_VOLUME_SINAF=20Gi


2. Foi solicitado a criação de um outro NFS para a integração SIHDG x POWERCENTER. Nesse pedido eu não especifiquei um ponto de montagem diferente do que já existia. E nesse pedido foi criado e montado o mesmo path destino e isso está causando confusão:
   SERVER_NFS = hypernprd56.ad.caixa
   PATH_NFS = /fs_sihdg
   PATH_DESTINO = /sihdg/         
      -->> Pode alterar para PATH_DESTINO = /sihdg_powercenter/?
   SIZE_VOLUME_SINAF=20Gi

2.1 Atendido na REQ000145657410 / REQ000145740789.

3. Solicito que seja separado os dois pontos de montagens para atenderem os dois itens de forma separada, vide exemplo: 

3.1 No servidor NFS permitir:
    /fs_sihdg
       sihdg_sinaf   (vide item 1.)
       sihdg_powercenter   (vide item 2.)

3.2 E no pod montar apenas:
   /sihdg

4. Atualizar a library do SIHDG-JBOSS8-DES para ter duas variáveis na library:
   - PATH_DESTINO = /sihdg_sinaf
   - PATH_DESTINO_PWC = /sihdg_powercenter

Sendo assim terei em um único servidor com dois pontos de montagem para atenderem os dois destinos separadamente.

Quaisquer dúvidas, estou à disposição.
