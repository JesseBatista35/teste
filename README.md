Sandra, pode ser assim, só preciso confirmar dois pontos:

No seu resumo final os exports aparecem como nprdnfs01:/.../fs_sihdg_des e hypernprd56:/fs_sihdg_des_pwc, mas esses dois não existem. Os storages atuais são nprdnfs01:/ifs/cpwsprd01/nprd/fs_sihdg_sinaf e hypernprd56:/fs_sihdg. Entendi que só os pontos de montagem mudam (/sihdg_des_pwc e /sihdg_des) e que os exports continuam os mesmos. Está correto?
Com a troca, /sihdg_des passa a ser o storage novo do SINAF (vazio). A pasta Arquivos_Sinaf (confirma se é Sinaf ou SINAF) e os arquivos que hoje estão em hypernprd56:/fs_sihdg precisam ser criados e copiados por vocês para a aplicação ler.

Confirmando, ajusto as variáveis, rodo o release e envio o print do OKD com /sihdg_des e /sihdg_des_pwc.
