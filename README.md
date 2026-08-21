Prezados,

Concluída a reinstalação do certificado B3 (s-4570-5) no servidor cspdeapllx011 (10.116.95.77) para acesso às APIs do SINCAD.

Ações realizadas:

Validação de integridade do pacote de certificado recebido (hash MD5 conferido).
Certificado disponibilizado no diretório /opt/keystore/ do servidor (ambiente Linux).
Conversão do certificado para formato compatível com o keystore utilizado pela aplicação JBoss (instância sinac01).
Backup do certificado anterior realizado antes da substituição.
Certificado atualizado no path utilizado pela aplicação (conf/certs/00360305000104.p12), válido de 21/05/2026 a 20/05/2028.
Instância sinac01 reiniciada com sucesso (boot completo em 34s, sem erros relacionados a certificado/SSL).

Observação: durante o boot foram identificadas falhas de ativação de MDBs (SinacProcessMDB, SinacBatchMDB) por indisponibilidade do gerenciador de filas MQ (SPP5/ACP3.CORESP.CAIXA). Trata-se de questão de infraestrutura de mensageria, sem relação com a atividade de certificado executada, e será tratada separadamente se necessário.

Encerro esta demanda como concluída.

Atenciosamente,
Jessé Batista - P585600
