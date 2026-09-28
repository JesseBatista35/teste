Prezados,

Realizada a montagem do NFS no servidor caddeapllx2462 (IP de backup/storage 10.188.6.220):

Origem: nprdnfs01.ad.caixa:/fs_sipcs_vcx
Ponto de montagem: /sipcs/vcx
Protocolo: NFSv3 (opções rw,sync,hard,vers=3,_netdev)
Montagem persistida no /etc/fstab (backup em /etc/fstab.bkp_WO0000081726775)
Proprietário: vcxservice:vcxservice, permissão 775 (usuários vcxservice e vcxproxyservice com acesso de escrita)

Evidência:

nprdnfs01.ad.caixa:/fs_sipcs_vcx nfs 50G 0 50G 0% /sipcs/vcx
drwxrwxr-x 2 vcxservice vcxservice 0 set 28 14:29 /sipcs/vcx

Validada a escrita com os usuários da aplicação.

Obs.: o diretório de dados da aplicação atualmente é /opt/app/vcx/datafiles (local). Caso a aplicação deva passar a utilizar o NFS, é necessário ajuste de configuração pela equipe responsável pelo SIPCS/VCX.

Att,
Jessé Batista – P585600


Obs. 2: o grupo de variáveis SIPCS-VCX-VISA-CREDITO-NFS-DES (release SIPCS-vcx-visa-credito-NAO-EXECUTAR) ainda referencia o NFS antigo (nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIPCS em /opt/app/vcx/datafiles). A montagem desta WO foi realizada manualmente no host. Caso a esteira volte a ser utilizada, será necessário atualizar as variáveis para o novo compartilhamento e validar a compatibilidade do script de montagem com o storage cpwsprd01.
