Pronto: cacheJson foi criada no NFS e a parte da esteira está concluída. Segue a nota final para fechar a WO:

Prezados,

Ajustes concluídos no SIMCN-backend (DES):

PATH_NFS corrigido para /ifs/CADSVISISD4/SERVIDORES/CETAD/SIMCN, o export efetivamente montado no PV simcn-backend-data-des.
STORAGE_PATH alterado de /upload/des/simcn (diretório inexistente no container) para /simcn, o ponto de montagem do NFS. Redeploy realizado com sucesso; o log confirma SIMCN STORAGE: /simcn.
Diretório /simcn/cacheJson criado no NFS.

Evidência de gravação no NFS (pod simcn-backend-des-256-kkm8d):

$ ls -la /simcn
drwxrwxrwx. 2 185 nobody  0 Sep 24 14:49 cacheJson
drwxrwxrwx. 3 185 nobody 21 Sep 24 14:44 relatoriosLegados

O diretório relatoriosLegados foi criado pela própria aplicação na inicialização. Até então o volume estava vazio desde a criação do PV (11/05), porque a aplicação gravava em caminhos fora do NFS.

Pendência do time de desenvolvimento: atualizar o parâmetro WEB_STORAGE_SIMCN (tabela MCN.MCNTB043_PARAMETRO_CONTABIL, NU_PARAMETRO 567) de /uploadintegracao/des/simcn/ para /simcn/ no banco DES. Enquanto isso não for feito, a inicialização continua registrando FileNotFoundException: /uploadintegracao/des/simcn/cacheJson/cacheCosif.

Da parte da Esteira DevOps, a demanda está concluída.

Atenciosamente,
Jessé Mouta Pereira Batista
Analista – CTIS / CESTI Esteira DEVOPS DES TQS NPRD
